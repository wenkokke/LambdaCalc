{-# LANGUAGE ScopedTypeVariables, TemplateHaskell #-}
module Main where

--------------------------------------------------------------------------
-- imports

import Test.QuickCheck

import Control.Monad
  ( liftM
  , liftM2
  )

import Data.Char
  ( toUpper
  )

import Data.Set (Set)
import qualified Data.Set as Set

--------------------------------------------------------------------------
-- types for lambda expressions

-- variables

newtype Var = MkVar String
  deriving ( Eq, Ord )

instance Show Var where
  show (MkVar s) = s

varList :: [Var]
varList = [ MkVar s
          | let vs = [ c:v | v <- "" : vs, c <- ['a'..'z'] ]
          , s <- vs
          ]

instance Arbitrary Var where
  arbitrary = growingElements [ MkVar [c] | c <- ['a'..'z'] ]

-- constants

newtype Con = MkCon String
  deriving ( Eq, Ord )

instance Show Con where
  show (MkCon s) = s

instance Arbitrary Con where
  arbitrary = growingElements [ MkCon [c] | c <- ['A'..'Z'] ]

-- expressions

data Exp
  = Lam Var Exp
  | App Exp Exp
  | Var Var
  | Con Con
 deriving ( Eq, Ord )

instance Show Exp where
  showsPrec n (Lam x t) = showParen (n>0) (showString "\\" . shows x . showString "." . shows t)
  showsPrec n (App s t) = showParen (n>1) (showsPrec 1 s . showString " " . showsPrec 2 t)
  showsPrec _ (Var x)   = shows x
  showsPrec _ (Con c)   = shows c

instance Arbitrary Exp where
  arbitrary = sized arbExp
   where
    arbExp n =
      frequency $
        [ (2, liftM Var arbitrary)
        , (1, liftM Con arbitrary)
        ] ++
        concat
        [ [ (5, liftM2 Lam arbitrary arbExp1)
          , (5, liftM2 App arbExp2 arbExp2)
          ]
        | n > 0
        ]
       where
        arbExp1 = arbExp (n-1)
        arbExp2 = arbExp (n `div` 2)

  shrink (Lam x a) = [ a ]
                  ++ [ Lam x a' | a' <- shrink a ]
  shrink (App a b) = [ a, b ]
                  ++ [ ab
                     | Lam x a' <- [a]
                     , let ab = subst x b a'
                     , length (show ab) < length (show (App a b)) 
                     ]
                  ++ [ App a' b | a' <- shrink a ]
                  ++ [ App a b' | b' <- shrink b ]
  shrink (Var x)   = [Con (MkCon (map toUpper (show x)))]
  shrink _         = []

--------------------------------------------------------------------------
-- functions for lambda expressions

free :: Exp -> Set Var
free (Lam x a) = Set.delete x (free a)
free (App a b) = free a `Set.union` free b
free (Var x)   = Set.singleton x
free (Con _)   = Set.empty

subst :: Var -> Exp -> Exp -> Exp
subst x c (Var y)   | x == y = c
subst x b (Lam y a) | x /= y = Lam y (subst x b a)
subst x c (App a b)          = App (subst x c a) (subst x c b)
subst x c a                  = a

fresh :: Var -> Set Var -> Var
fresh x ys = head (filter (`Set.notMember` ys) (x:varList))

rename :: Var -> Var -> Exp -> Exp
rename x y a | x == y    = a
             | otherwise = subst x (Var y) a

--------------------------------------------------------------------------
-- closed lambda expressions

newtype ClosedExp = Closed Exp

instance Show ClosedExp where
  show (Closed exp) = show exp

instance Arbitrary ClosedExp where
  arbitrary = Closed `fmap` sized (arbExp [])
   where
    arbExp xs n =
      frequency $
        [ (8, liftM Var (elements xs))
        | not (null xs)
        ] ++
        [ (2, liftM Con arbitrary)
        ] ++
        [ (20, do x <- arbitrary
                  t <- arbExp (x:xs) n'
                  return (Lam x t))
        | n > 0 || null xs
        ] ++
        [ (20, liftM2 App (arbExp xs n2) (arbExp xs n2))
        | n > 0
        ]
     where
      n' = n-1
      n2 = n `div` 2

  shrink (Closed a) =
    [ Closed a' | a' <- shrink a, Set.null (free a') ]

--------------------------------------------------------------------------
-- the end.