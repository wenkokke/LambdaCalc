package lambdacalc;

import static org.junit.Assert.assertEquals;
import lombok.val;
import org.junit.Test;

public final class TestBetaReducer2 extends TestLambdaCalc {

  @Test
  public final void test0() {
    reducesTo(
      "(\\s.(\\k.k) m) ((\\r.\\y.\\j.(\\u.(\\g.\\y.(\\y.\\v.g) (\\e.\\s.E j) (\\q.\\c.(\\c.\\g.J) ((\\m.H) K))) (\\x.\\h.b) (\\h.\\b.(\\e.(\\w.(\\j.E) R (\\g.s)) G) (\\m.\\w.\\f.(\\p.v x (\\t.L c)) (s (j O (\\c.L)))))) (H u)) (\\z.\\x.\\w.(\\x.(\\w.(\\b.\\l.\\g.e) (t E g) (\\i.s)) (o o) (J ((\\r.(\\q.l) (S q)) (\\a.f) (\\r.p (P c) I)))) Q) (k (\\v.(\\t.\\k.(\\d.\\s.\\c.z) ((\\j.O (\\r.Q)) q)) ((\\l.\\d.t) (D H (\\q.r)) (\\y.(\\c.(\\n.h) (\\z.m)) (\\y.e (\\z.z))))) ((\\l.\\m.(\\m.(\\w.w) (k Z (f f) (\\e.a))) Q) (\\u.(\\b.(\\g.k) (Q (\\z.y)) F) (\\b.(\\j.\\j.\\b.\\j.m) ((\\e.B) (\\g.a) (w Y G))))) (i ((\\x.r f (W C) (\\c.T A (g J)) Q) (\\h.\\a.\\p.\\u.\\t.\\n.\\d.Z) n))))",
      "m"
    );
  }

  @Test
  public final void test1() {
    reducesTo(
      "\\s.W (\\t.u)",
      "\\s.W (\\t.u)"
    );
  }

  @Test
  public final void test2() {
    reducesTo(
      "\\j.D",
      "\\j.D"
    );
  }

  @Test
  public final void test3() {
    reducesTo(
      "\\c.V u",
      "\\c.V u"
    );
  }

  @Test
  public final void test4() {
    reducesTo(
      "\\v.W",
      "\\v.W"
    );
  }

  @Test
  public final void test5() {
    reducesTo(
      "(\\z.\\c.\\l.\\c.(\\m.o) (\\a.\\w.o (\\f.\\o.N (\\a.p j (J t)) (\\g.(\\v.f) u (\\z.\\d.\\x.B)) r (\\n.g)) c)) (\\j.(\\c.\\n.(\\d.\\n.\\e.\\s.\\u.o) (\\f.(\\j.(\\d.\\d.\\y.S) (A d W ((\\d.O) (u I)))) (\\q.\\p.\\n.(\\s.j r) (p (\\t.e)) (\\s.(\\a.H) (\\a.U) (L y (Y k)))))) (\\b.(\\t.(\\g.C) ((\\i.s) j)) (i ((\\b.\\f.k) (\\w.M)))) ((\\m.P) F ((\\w.\\k.\\h.j) z) (d ((\\g.o) (X y) (z B))) (\\o.(\\i.\\f.k P z (\\g.c p)) z ((\\f.c m h (\\x.\\e.g)) (H (f w) (\\f.\\d.K o)))) t) ((\\f.\\k.\\k.d) (\\u.o (\\k.X)) k (R (\\d.p)) (I ((\\i.\\e.\\q.\\k.\\h.\\g.q U) (m n (u b) (\\k.m (\\l.g))))) (\\r.(\\a.(\\q.\\n.\\e.p) ((\\u.z) (P p))) q J (\\i.\\c.(\\d.(\\s.(\\p.z) (Q v)) (C M)) (p (\\o.\\q.\\m.j)) (G (i (k u)) (\\d.S (C R (x B)))))) (\\q.o)))",
      "\\c.\\l.\\c.o"
    );
  }

  @Test
  public final void test6() {
    reducesTo(
      "(\\n.\\a.\\w.\\d.(\\s.\\e.(\\y.l a) (\\y.\\v.\\d.y)) (j B r)) Q",
      "\\a.\\w.\\d.\\e.l a"
    );
  }

  @Test
  public final void test7() {
    reducesTo(
      "(\\u.\\p.\\t.G ((\\i.h) l) (\\q.s (o p (\\h.b)) (m D))) ((\\w.\\q.(\\r.(\\n.M) (\\e.v p)) b) (j (b v) R ((\\i.(\\n.b) (\\u.q)) u))) ((\\n.\\e.(\\c.\\j.\\t.(\\r.s) d) (a (\\x.z) (b w (d B)))) j ((\\p.p (\\n.\\a.W) t) (R (\\r.r) f))) (\\b.(\\m.(\\k.j) e) (s ((\\s.m (\\a.(\\t.Z) (p p) (\\b.n))) (\\g.V)))) ((\\h.\\w.\\j.\\p.w ((\\r.F (g ((\\s.j) ((\\p.e) (\\t.Y))))) (y n (\\p.z) (G (N r)) (d u (b p) Q) ((\\g.w) (c e) (\\u.j) (\\t.\\z.(\\s.g j) (\\a.U E)))))) ((\\d.\\g.(\\i.(\\g.\\k.(\\j.E) o) ((\\b.W) (\\u.\\a.\\n.u f))) (g (o p) (W N (u S)) k (\\h.\\c.Z))) (\\l.\\j.\\u.\\t.j))) (Y ((\\h.a) g (\\u.O) v (\\j.\\t.\\m.(\\d.r) (\\m.a)) (\\c.x (\\c.(\\v.L (d w) (\\u.\\k.\\k.N)) (a (z (\\b.n))))) (\\c.b)) K)",
      "G (h) (\\q.s (o (\\j.\\t.s) (\\h.b)) (m D)) (\\w.\\j.\\p.w (F (g (j)))) (Y (a (\\u.O) v (\\j.\\t.\\m.r) (\\c.x (\\c.L (d w) (\\u.\\k.\\k.N))) (\\c.b)) K)"
    );
  }

  @Test
  public final void test8() {
    reducesTo(
      "w ((\\a.y (\\t.U)) (\\w.z))",
      "w (y (\\t.U))"
    );
  }

  @Test
  public final void test9() {
    reducesTo(
      "\\e.(\\p.\\c.\\t.C) (I ((\\h.\\o.y j ((\\a.\\e.(\\r.H ((\\x.u) (\\c.U))) (\\g.\\i.\\g.\\r.\\n.q)) (\\c.n))) b)) (\\w.\\e.D)",
      "\\e.\\t.C"
    );
  }

  @Test
  public final void test10() {
    reducesTo(
      "(\\x.s (Q (\\k.v))) c M ((\\s.\\r.(\\i.n) ((\\u.(\\z.s) f u) (c (\\n.h)))) ((\\m.(\\s.(\\y.P) (\\k.F)) (F h e)) K y)) (\\y.\\m.\\i.\\e.\\c.\\i.\\y.\\l.(\\v.P) (\\c.u) ((\\c.z) (\\r.(\\i.i) ((\\z.H) (\\j.\\s.\\u.E))) (\\i.k))) ((\\e.(\\x.(\\i.\\a.e) (g (U T (c O))) (\\m.w ((\\o.u A (\\n.h)) (\\c.n)))) L) ((\\e.(\\q.P (i y) x) (\\b.(\\c.Y) (\\x.Y) (\\p.(\\c.D) (\\x.j)))) (e (\\q.\\r.\\s.k Z (\\g.r) (\\b.Z))) (\\j.\\p.(\\u.\\w.W) b)) (\\z.\\r.s)) (\\w.\\o.d (p (f ((\\c.\\a.\\l.\\j.U) (\\i.p (P R (\\s.a)))) (g (M (\\b.g)))) (z l (\\h.(\\t.\\y.\\a.\\g.n) (j (X N (\\e.(\\a.S) (\\p.B))) h)))))",
      "s (Q (\\k.v)) M (\\r.n) (\\y.\\m.\\i.\\e.\\c.\\i.\\y.\\l.P (z (\\i.k))) (P (i y) x (\\j.\\p.\\w.W) (\\z.\\r.s)) (\\w.\\o.d (p (f (\\a.\\l.\\j.U) (g (M (\\b.g)))) (z l (\\h.\\y.\\a.\\g.n))))"
    );
  }

  @Test
  public final void test11() {
    reducesTo(
      "(\\d.y) (\\w.(\\q.v) (\\p.\\g.x) (\\x.K (\\m.W))) ((\\t.k) ((\\t.\\d.\\k.\\a.\\c.h) (\\o.o)) (\\x.\\n.\\o.(\\a.y) (\\a.\\m.\\f.(\\d.C) ((\\j.(\\w.\\s.t) (U y k)) (p (\\c.\\t.\\q.g)))))) (V k) (m (\\i.A) ((\\w.p L (\\w.\\c.l w)) m (\\g.K) ((\\q.U (p s) M) (F (\\s.s)) R) (\\p.\\y.(\\a.\\j.\\a.(\\w.d) (T u) z) (\\f.\\q.(\\c.\\d.m) (\\r.q u)) (\\v.\\v.\\q.n) a)) (o (\\h.(\\p.h (\\t.\\o.m)) (h (\\u.E (\\j.\\s.\\s.J) (\\h.(\\x.Z v (M J)) (\\u.(\\x.f) (\\l.w))))) (\\b.Z))))",
      "y (k (\\x.\\n.\\o.y)) (V k) (m (\\i.A) (p L (\\w.\\c.l w) (\\g.K) (U (p s) M R) (\\p.\\y.d z)) (o (\\h.h (\\t.\\o.m) (\\b.Z))))"
    );
  }

  @Test
  public final void test12() {
    reducesTo(
      "(\\i.(\\k.(\\r.e) ((\\k.(\\f.H) ((\\g.h) (\\v.q))) o) F) (\\b.L) ((\\k.A) (\\q.\\b.h ((\\c.s) (r b)) y (\\h.o (\\y.\\d.\\k.\\f.k))) (\\v.m M))) h ((\\n.\\d.t ((\\j.(\\e.n (\\i.\\z.\\r.Z) (\\r.\\k.t)) ((\\u.\\p.(\\l.z a) (\\v.j)) (D (\\s.u) (q r L)) (c (\\q.\\o.\\f.\\o.\\k.W N)))) Z)) (\\r.M))",
      "e F (A (\\v.m M)) (\\d.t (M (\\r.\\k.t)))"
    );
  }

  @Test
  public final void test13() {
    reducesTo(
      "\\o.w",
      "\\o.w"
    );
  }

  @Test
  public final void test14() {
    reducesTo(
      "(\\u.w F) f",
      "w F"
    );
  }

  @Test
  public final void test15() {
    reducesTo(
      "\\d.\\k.\\t.U (\\v.\\i.(\\n.(\\p.q ((\\w.\\w.H p) (n h (\\f.o)))) ((\\o.k n n) (\\d.Y l (S Z)) ((\\b.Z) (\\h.O) O))) t (\\z.B)) (b (\\i.O)) ((\\b.\\n.\\x.x) (\\o.(\\p.I) (\\m.\\o.\\o.\\t.p) (\\t.c (c (\\m.l)) (I y (P e) (\\j.(\\j.c) (j I)) (\\c.o (\\i.s) (\\m.\\o.k Q))) L) (\\r.\\k.N)))",
      "\\d.\\k.\\t.U (\\v.\\i.q (\\w.H (k t t (Z O))) (\\z.B)) (b (\\i.O)) (\\n.\\x.x)"
    );
  }

  @Test
  public final void test16() {
    reducesTo(
      "\\w.f",
      "\\w.f"
    );
  }

  @Test
  public final void test17() {
    reducesTo(
      "s (k (\\d.r) ((\\k.\\p.R) m) (\\n.(\\a.\\b.\\h.(\\e.\\t.\\a.\\u.\\i.X) (\\k.R)) (\\h.z) (\\f.\\b.(\\e.\\x.\\x.(\\m.q) Q) ((\\u.l u (A r)) (\\t.(\\n.n) (\\y.x)) (c U (b w) (B (B o))) (\\f.e)) (\\w.(\\k.\\a.\\m.q ((\\v.p) ((\\g.\\s.m) ((\\z.z) M)))) I))))",
      "s (k (\\d.r) (\\p.R) (\\n.\\h.\\t.\\a.\\u.\\i.X))"
    );
  }

  @Test
  public final void test18() {
    reducesTo(
      "(\\j.j (\\l.\\k.e) (\\j.\\i.k)) ((\\c.\\j.Q (\\s.A) ((\\i.\\f.X P (\\i.f) (n c (\\e.v)) (\\l.\\w.a)) (s (C r) y u))) (\\e.(\\k.\\e.w) (\\l.\\b.v)) ((\\g.\\b.e (v z)) ((\\n.\\l.\\g.j) (\\y.s f (L r)) ((\\p.O) (\\j.f o P))) (R m) p)) (\\m.\\u.(\\e.y) (\\p.(\\k.a) (L (\\e.v) (\\e.o) k t) s) (\\y.\\h.p))",
      "Q (\\s.A) (\\f.X P (\\i.f) (n (\\e.\\e.w) (\\e.v)) (\\l.\\w.a)) (\\l.\\k.e) (\\j.\\i.k) (\\m.\\u.y (\\y.\\h.p))"
    );
  }

  @Test
  public final void test19() {
    reducesTo(
      "\\g.(\\u.(\\c.o (\\v.(\\i.\\u.(\\d.(\\d.\\s.E) (h i M)) (F (o i d))) ((\\k.k) d (\\l.f) (q b d (\\i.\\b.r I)))) V) B (\\r.(\\z.\\u.\\j.(\\s.N) (U ((\\v.a (G (G z)) (\\d.N)) (\\h.(\\h.\\z.(\\u.\\n.j) ((\\u.G) l)) (t (s O) (N g)))))) R)) ((\\b.f) (\\e.V) ((\\l.(\\g.x) (N n)) (\\g.I)) p p E)",
      "\\g.o (\\v.\\u.\\s.E) V (\\r.\\u.\\j.N)"
    );
  }

  @Test
  public final void test20() {
    reducesTo(
      "\\m.c",
      "\\m.c"
    );
  }

  @Test
  public final void test21() {
    reducesTo(
      "\\h.f",
      "\\h.f"
    );
  }

  @Test
  public final void test22() {
    reducesTo(
      "b (j ((\\x.\\t.\\i.(\\f.(\\n.V (\\j.(\\d.\\r.(\\q.r) (x g)) (\\e.q))) (c (\\e.(\\e.\\b.\\a.\\v.(\\h.s) (s e)) (\\e.e (\\t.\\q.\\d.z))))) ((\\v.\\e.(\\i.B) ((\\i.(\\g.I) (o e) (j C)) (R (\\u.\\r.I Y)))) y)) ((\\j.y ((\\a.(\\i.\\i.g f) w) (K K) (\\c.\\j.\\k.(\\v.V) y))) W)))",
      "b (j (\\t.\\i.V (\\j.\\r.r)))"
    );
  }

  @Test
  public final void test23() {
    reducesTo(
      "\\k.(\\j.S (c ((\\g.Z ((\\r.\\c.\\o.u) (V T (z v))) (\\d.\\p.y)) (x p))) (\\s.\\l.(\\l.(\\j.\\e.\\y.(\\b.p A) (\\p.\\j.i)) (\\a.u) (\\w.\\u.(\\p.z) (\\d.w) d ((\\k.x) (\\u.\\t.u))) (w (G p) f ((\\p.a) (R J) P) (f ((\\a.I) (\\a.\\n.\\j.l)))) (u l)) z)) (\\h.d (\\u.\\s.E))",
      "\\k.S (c (Z (\\c.\\o.u) (\\d.\\p.y))) (\\s.\\l.p A (u z))"
    );
  }

  @Test
  public final void test24() {
    reducesTo(
      "x (\\m.\\o.\\a.e) (\\t.S (N (\\s.F))) (F (\\c.y a) (\\f.s H (\\w.u) s) F)",
      "x (\\m.\\o.\\a.e) (\\t.S (N (\\s.F))) (F (\\c.y a) (\\f.s H (\\w.u) s) F)"
    );
  }

  @Test
  public final void test25() {
    reducesTo(
      "m (\\g.r (\\p.(\\p.k z ((\\q.\\x.p) (C (\\n.Q) (\\l.N k (\\l.q)))) z) (\\p.\\y.d))) (\\m.G)",
      "m (\\g.r (\\p.k z (\\x.\\p.\\y.d) z)) (\\m.G)"
    );
  }

  @Test
  public final void test26() {
    reducesTo(
      "n (\\x.\\o.D) ((\\e.V (y a) (\\b.(\\e.(\\t.(\\v.(\\q.c) (\\t.G)) (h q (\\v.k))) (t (I a)) (\\r.\\r.\\z.\\y.J) (\\c.\\g.B (\\q.(\\i.\\a.\\z.(\\c.c) (\\k.g)) c))) (\\g.z))) (\\o.D))",
      "n (\\x.\\o.D) (V (y a) (\\b.c (\\r.\\r.\\z.\\y.J) (\\c.\\g.B (\\q.\\a.\\z.\\k.g))))"
    );
  }

  @Test
  public final void test27() {
    reducesTo(
      "(\\v.(\\o.\\r.\\x.J ((\\a.c) G)) (\\a.p) n i) (m (Z (\\o.\\i.\\v.(\\g.t t) (p (\\j.s))) T)) (\\m.G) h (\\k.\\v.P)",
      "J (c) (\\m.G) h (\\k.\\v.P)"
    );
  }

  @Test
  public final void test28() {
    reducesTo(
      "(\\k.\\f.\\p.E (m ((\\n.\\g.\\u.(\\x.e) (\\i.\\t.l)) F) (c (\\n.g ((\\q.o) (E M)) (j ((\\a.i) (\\w.l)))) ((\\e.\\n.(\\x.x (\\n.p o)) t) ((\\u.u) ((\\b.\\p.r I) (n o q)))) ((\\l.(\\f.\\c.F) (\\l.(\\k.p) (\\h.h) K)) (O (\\a.t) q ((\\w.\\j.j) V)) (n t))))) ((\\m.(\\a.\\j.t ((\\z.\\w.(\\u.v p) (c (t h))) ((\\d.H) ((\\o.t) (\\t.z))) r (\\s.g))) (\\s.\\y.f)) s)",
      "\\f.\\p.E (m (\\g.\\u.e) (c (\\n.g (o) (j (i))) (\\n.t (\\n.p o)) (F)))"
    );
  }

  @Test
  public final void test29() {
    reducesTo(
      "\\a.(\\j.p) Y ((\\p.\\e.D (\\b.\\x.a) w) (\\g.f)) (\\x.\\e.\\f.(\\s.c ((\\m.G) (\\h.l (w (z s)))) (I (c (l q (w H)) (x w (\\g.i) (\\l.\\k.R Y))))) (a (\\y.R f (\\t.a) (\\a.\\m.\\u.O) ((\\r.M) (\\j.l) (q (q J)))) y)) (\\e.\\l.\\a.(\\z.\\j.(\\x.\\b.\\u.F) (\\z.(\\f.b) (h I)) (w p (W i) (\\o.(\\t.f) (v d))) H ((\\y.\\u.\\k.\\v.G) (\\q.\\c.s)) w) Y) (v y p)",
      "\\a.p (\\e.D (\\b.\\x.a) w) (\\x.\\e.\\f.c (G) (I (c (l q (w H)) (x w (\\g.i) (\\l.\\k.R Y))))) (\\e.\\l.\\a.\\j.F (\\u.\\k.\\v.G) w) (v y p)"
    );
  }

  @Test
  public final void test30() {
    reducesTo(
      "(\\i.(\\h.\\i.(\\d.\\z.(\\w.\\c.\\u.z (\\z.\\g.\\d.(\\h.F (\\x.p)) (\\o.\\l.x X (e M)))) ((\\i.r) (\\v.v) (\\f.(\\z.d) (\\q.g)) (\\r.W) w)) ((\\y.i m (\\l.X) ((\\s.v) (\\t.x))) (\\w.t) (\\i.m) ((\\z.\\r.g) (\\v.\\e.\\i.a))) (\\l.e ((\\a.t) N) (x (\\s.\\r.\\e.\\c.\\t.n)))) (\\n.\\c.x (\\q.y))) ((\\w.\\p.\\d.S (A C)) Z ((\\f.(\\k.\\z.\\a.\\f.v c) Y ((\\e.x w ((\\d.q) (\\n.a (\\u.b)))) ((\\i.u e) o))) (F (k X (\\b.\\y.l)))) (\\x.\\y.(\\s.f) (\\q.i)))",
      "\\i.\\c.\\u.e (t) (x (\\s.\\r.\\e.\\c.\\t.n))"
    );
  }

  @Test
  public final void test31() {
    reducesTo(
      "W (z L)",
      "W (z L)"
    );
  }

  @Test
  public final void test32() {
    reducesTo(
      "\\m.g ((\\g.\\u.\\s.(\\x.\\z.B (\\f.(\\q.v) ((\\c.t) (\\v.\\p.p)))) ((\\j.\\i.m) ((\\s.T) j (\\y.\\r.v h)) (\\z.J U) ((\\q.(\\a.v t (z D)) l) (x v (L q) (\\q.u (J r)) a)))) (a (\\p.(\\u.\\p.L) ((\\f.(\\z.(\\q.\\s.\\t.x) (\\c.i)) (\\j.y (\\m.\\u.F g))) (n (\\o.c (\\x.g)) ((\\m.t) (\\g.V) ((\\n.j) (\\f.p))))))) (\\n.t))",
      "\\m.g (\\s.\\z.B (\\f.v))"
    );
  }

  @Test
  public final void test33() {
    reducesTo(
      "\\y.\\n.p",
      "\\y.\\n.p"
    );
  }

  @Test
  public final void test34() {
    reducesTo(
      "(\\k.Y) (\\l.\\f.\\c.\\z.\\r.\\h.G ((\\c.q (j ((\\p.u) (\\r.y)))) (\\x.\\c.a)) (T (\\v.\\a.i) h) (\\g.V) (\\c.\\p.O))",
      "Y"
    );
  }

  @Test
  public final void test35() {
    reducesTo(
      "\\t.\\p.\\q.(\\g.s (l h Q)) (\\k.J)",
      "\\t.\\p.\\q.s (l h Q)"
    );
  }

  @Test
  public final void test36() {
    reducesTo(
      "\\a.(\\g.h ((\\c.\\h.\\x.t) K ((\\q.\\o.\\s.(\\h.h D) ((\\a.b) (\\v.g))) (\\h.\\a.(\\m.\\r.g) (F K z))) (\\i.R)) (s (i u (\\n.l) ((\\u.J) (p P)) o (\\n.N (\\x.(\\a.t) (\\p.k)) (\\f.\\j.l (G k (A d)))) ((\\c.\\n.(\\r.k) (\\u.\\h.M)) (\\b.(\\c.q) ((\\x.e) S)) ((\\h.Z) (Q h) (E C (\\j.d)) (b r))))) (Z J (\\w.\\d.\\q.i))) (b (\\i.(\\y.V a) o))",
      "\\a.h (t) (s (i u (\\n.l) (J) o (\\n.N (\\x.t) (\\f.\\j.l (G k (A d)))) (k))) (Z J (\\w.\\d.\\q.i))"
    );
  }

  @Test
  public final void test37() {
    reducesTo(
      "b (\\v.\\a.B ((\\k.\\z.(\\t.(\\a.w) (\\c.n) (\\b.t D (\\j.s)) r) ((\\i.I) ((\\z.E) (\\j.T)) (\\s.\\p.l))) m)) (\\g.\\k.(\\s.(\\g.\\a.g (\\j.\\i.(\\q.f h) (\\x.l a))) ((\\i.q e (\\z.k)) (u d (k a)) (c ((\\m.w) (\\n.S))))) ((\\l.\\v.w i) (\\o.\\t.n) (\\d.X x) ((\\u.\\m.p) u)) (\\x.\\h.H ((\\b.u) (\\a.\\f.\\c.c)) (r ((\\f.(\\u.z) (\\l.O)) (\\s.w O))) n) ((\\n.u) (\\c.\\t.(\\l.\\l.(\\c.l) ((\\l.E) (l y)) C) w (\\n.q ((\\h.(\\w.o) (X o)) (L (\\x.L))) (\\y.(\\f.N G a ((\\r.Z) (q r))) (o (\\p.y) (\\y.(\\c.y) (f l)))))))) ((\\m.(\\s.I) (\\w.\\v.C (U e) m)) D)",
      "b (\\v.\\a.B (\\z.w (\\b.I (\\s.\\p.l) D (\\j.s)) r)) (\\g.\\k.q e (\\z.k) (c (w)) (\\j.\\i.f h) (u)) (I)"
    );
  }

  @Test
  public final void test38() {
    reducesTo(
      "d (l p)",
      "d (l p)"
    );
  }

  @Test
  public final void test39() {
    reducesTo(
      "\\t.\\l.d",
      "\\t.\\l.d"
    );
  }

  @Test
  public final void test40() {
    reducesTo(
      "\\s.\\c.x",
      "\\s.\\c.x"
    );
  }

  @Test
  public final void test41() {
    reducesTo(
      "\\u.(\\d.J) (\\f.\\u.\\p.O)",
      "\\u.J"
    );
  }

  @Test
  public final void test42() {
    reducesTo(
      "w (r (\\e.v ((\\e.a) ((\\a.(\\v.A) p (\\m.w O)) (d (\\t.(\\a.f (D P)) (\\r.\\i.\\s.R)))))) (\\c.(\\p.\\x.\\l.d) A (\\b.(\\z.\\b.(\\w.F) ((\\l.o) g)) A) (\\v.i s)))",
      "w (r (\\e.v (a)) (\\c.d))"
    );
  }

  @Test
  public final void test43() {
    reducesTo(
      "\\m.(\\t.W) ((\\n.\\e.b) (\\r.b))",
      "\\m.W"
    );
  }

  @Test
  public final void test44() {
    reducesTo(
      "c ((\\m.(\\a.\\i.v) (\\s.\\r.\\q.l g K) (V (\\o.\\h.(\\w.\\j.m (\\k.s e)) (d N (\\j.l) ((\\p.Z) (\\w.L)))) H)) (h e)) (\\t.\\q.n (\\m.\\d.\\u.e) ((\\h.n Y) (h s) (h p)))",
      "c (v) (\\t.\\q.n (\\m.\\d.\\u.e) (n Y (h p)))"
    );
  }

  @Test
  public final void test45() {
    reducesTo(
      "s (c (q (w a ((\\h.f (v a)) (M w b)) (d (\\f.M)) ((\\g.c) ((\\t.\\i.(\\y.G) s ((\\b.M) q)) ((\\x.p) (\\a.v) (\\b.(\\g.u) (L k)))))))) (\\l.\\f.S)",
      "s (c (q (w a (f (v a)) (d (\\f.M)) (c)))) (\\l.\\f.S)"
    );
  }

  @Test
  public final void test46() {
    reducesTo(
      "(\\a.\\e.(\\e.\\m.\\i.\\j.Z ((\\d.I) (\\j.\\d.\\g.c) (\\z.(\\i.(\\p.\\z.\\z.\\l.(\\t.q) (w t)) C) (\\q.(\\l.\\z.\\c.d) h (\\a.\\i.(\\q.d i) (\\i.\\h.K)))) ((\\g.\\a.y m) ((\\n.\\f.b) M ((\\s.(\\d.(\\l.f) z) (Q (\\x.f))) ((\\l.q) i (\\q.\\h.A p))))))) (\\p.(\\k.Y (\\e.\\u.\\i.f)) ((\\t.(\\q.R) (\\m.q)) (p (\\s.r))) (L a))) (\\v.b)",
      "\\e.\\m.\\i.\\j.Z (I (\\z.\\z.\\z.\\l.q) (\\a.y m))"
    );
  }

  @Test
  public final void test47() {
    reducesTo(
      "(\\f.\\l.\\g.(\\x.(\\g.(\\c.w) (c q) (k O (\\r.v)) (a n)) (l h (\\t.\\n.(\\g.k l) (\\w.w f)))) g ((\\x.(\\u.(\\f.Y) (F U)) (q (G w)) (l (\\a.b)) (k s)) M) q) ((\\h.u (F K)) ((\\l.\\f.\\i.x) s) (k a)) (\\v.i)",
      "\\g.w (k O (\\r.v)) (a n) (Y (i) (k s)) q"
    );
  }

  @Test
  public final void test48() {
    reducesTo(
      "(\\e.(\\d.(\\o.\\e.\\l.\\l.b x) (\\p.y)) (r ((\\q.\\l.c) (\\u.(\\h.j) (\\d.\\e.g ((\\b.q) (\\u.r)))) (\\x.\\z.(\\g.\\i.\\s.M) (t K J (\\q.(\\h.r) (R J)) (\\s.\\a.\\j.(\\u.w) g (\\m.\\r.H)))))) p) (\\l.(\\d.\\l.\\f.O) (s (\\i.\\d.\\r.K)) (X (\\y.b) (\\a.\\b.F (x t ((\\a.Y) (\\v.K))) (\\a.K (\\z.q))) ((\\h.D (\\z.\\l.W)) ((\\k.\\v.x) x Z)) (\\g.p ((\\x.\\n.\\y.n (\\f.(\\x.\\a.T) (\\g.k))) (\\s.n b (\\d.(\\t.q) (g k) (U o (\\g.o)))) (\\w.(\\x.(\\u.\\c.\\d.k (t O)) w) r)))))",
      "\\l.\\l.b x"
    );
  }

  @Test
  public final void test49() {
    reducesTo(
      "l (\\q.V) k",
      "l (\\q.V) k"
    );
  }

  @Test
  public final void test50() {
    reducesTo(
      "(\\f.E (\\o.N N)) (r (\\m.\\s.n)) (Y j ((\\a.x (\\w.\\u.(\\y.(\\t.\\f.g (o O (\\d.n))) D m) (d ((\\h.\\x.O t) ((\\x.R) (\\a.v))) (\\z.(\\x.W) l)))) (\\j.(\\v.\\i.\\n.D (\\t.\\w.\\d.(\\g.j D) (Q a (h N)) (o (\\r.\\n.c)))) (Y (\\e.i)) (\\n.s))))",
      "E (\\o.N N) (Y j (x (\\w.\\u.g (o O (\\d.n)))))"
    );
  }

  @Test
  public final void test51() {
    reducesTo(
      "\\l.k",
      "\\l.k"
    );
  }

  @Test
  public final void test52() {
    reducesTo(
      "\\c.v",
      "\\c.v"
    );
  }

  @Test
  public final void test53() {
    reducesTo(
      "\\a.\\o.\\d.W",
      "\\a.\\o.\\d.W"
    );
  }

  @Test
  public final void test54() {
    reducesTo(
      "(\\t.\\m.\\j.q ((\\l.t) a)) ((\\s.\\e.\\m.(\\p.w) (\\m.\\h.p)) (B (\\q.(\\y.\\m.h) (j (a E) J) (\\n.q (\\a.g l (\\b.o)) ((\\q.N) (\\h.e (\\o.o))))) r)) (r (\\m.h))",
      "\\j1.q (\\e.\\m.w)"
    );
  }

  @Test
  public final void test55() {
    reducesTo(
      "(\\y.\\e.\\s.f) r",
      "\\e.\\s.f"
    );
  }

  @Test
  public final void test56() {
    reducesTo(
      "\\o.w Y",
      "\\o.w Y"
    );
  }

  @Test
  public final void test57() {
    reducesTo(
      "\\v.(\\n.y (\\i.\\t.\\w.(\\c.(\\m.\\h.\\z.e) (\\o.\\e.\\q.V (H ((\\y.a) (\\b.S x (e l)))))) K)) (\\j.(\\t.(\\c.d) (\\o.c) (\\f.h)) (w (K P))) ((\\z.\\t.(\\j.\\h.s) f ((\\f.e r) z)) (\\g.\\f.\\a.\\a.(\\a.(\\z.P v H ((\\y.A) (\\b.c)) ((\\f.o) (\\z.a) F)) (\\e.\\e.h (A (\\u.i D (k d))))) Z C) (\\s.\\g.(\\o.t) (\\e.S) (\\i.j)))",
      "\\v.y (\\i.\\t.\\w.\\h.\\z.e) (s)"
    );
  }

  @Test
  public final void test58() {
    reducesTo(
      "\\i.(\\i.\\h.l) e w ((\\c.C) ((\\i.s (\\l.E)) (x r)))",
      "\\i.l (C)"
    );
  }

  @Test
  public final void test59() {
    reducesTo(
      "(\\o.(\\g.p U) ((\\d.d) (\\z.H) (\\k.A (\\n.(\\k.\\d.H) (\\t.(\\l.G j (\\v.x)) (h t (\\c.f))) (W S (\\t.W) (q (\\u.l) D))) (\\x.j)))) (\\p.\\f.x Y)",
      "p U"
    );
  }

  @Test
  public final void test60() {
    reducesTo(
      "D ((\\h.\\u.(\\y.s (k c) (B a (\\q.e)) (\\s.B) ((\\j.\\z.(\\v.j H) (X l (\\p.y))) v)) (\\c.\\l.(\\g.\\i.(\\f.f G) (\\k.\\x.H)) (Y n X (\\n.\\f.R)) c)) t) ((\\p.E) (\\i.k) (\\g.\\b.Y T (\\f.j) ((\\f.G) H) (\\i.\\a.(\\c.q) (\\a.S) (\\v.x f)) ((\\f.t) (t x C) (\\d.(\\n.X (\\u.r)) (\\j.G))) m) K) (l (\\d.d) K ((\\a.z) (\\p.(\\n.s ((\\g.f) ((\\v.k) u))) (\\p.\\x.\\z.\\i.(\\q.j (C (\\f.r))) (F m i (h B (\\t.W)))))) (\\y.f) ((\\o.M E ((\\k.Q) (\\h.\\z.l (\\r.\\x.w)))) y))",
      "D (\\u.s (k c) (B a (\\q.e)) (\\s.B) (\\z.v H)) (E (\\g.\\b.Y T (\\f.j) (G) (\\i.\\a.q (\\v.x f)) (t (\\d.X (\\u.r))) m) K) (l (\\d.d) K (z) (\\y.f) (M E (Q)))"
    );
  }

  @Test
  public final void test61() {
    reducesTo(
      "q (\\z.(\\y.\\z.\\m.\\m.z X ((\\d.(\\a.\\f.\\w.V) (\\r.\\u.\\f.h)) (\\f.J))) (\\c.(\\x.(\\m.d (\\b.(\\u.m) (t i) g)) (\\b.\\n.E) (\\f.s ((\\h.l) v)) ((\\z.\\z.\\r.\\u.r) ((\\i.(\\s.h (\\o.i)) (y (\\z.w))) ((\\g.G) (p r) (d V E))) (\\z.\\j.\\x.(\\z.\\d.(\\b.\\a.C) (\\l.\\l.v)) N (\\p.(\\y.p X i (\\y.\\k.f)) (\\q.k Q))))) ((\\z.t) ((\\a.p) X) (\\i.b (\\l.\\e.j)))))",
      "q (\\z.\\z.\\m.\\m.z X (\\f.\\w.V))"
    );
  }

  @Test
  public final void test62() {
    reducesTo(
      "\\q.(\\r.z A ((\\r.\\y.\\h.s) ((\\u.(\\j.r) ((\\x.\\k.E A) (\\v.e))) ((\\i.\\y.\\b.i) g (\\q.D)) (\\p.a))) (\\o.w)) (\\b.z)",
      "\\q.z A (\\y.\\h.s) (\\o.w)"
    );
  }

  @Test
  public final void test63() {
    reducesTo(
      "\\k.\\r.L",
      "\\k.\\r.L"
    );
  }

  @Test
  public final void test64() {
    reducesTo(
      "(\\p.(\\f.(\\o.(\\h.o) (\\c.(\\l.q ((\\e.\\g.\\m.(\\o.\\x.d) (\\z.r z)) (\\m.(\\y.u) (\\o.i) l))) (S (S X) (\\f.(\\q.f) (\\u.J) (k o (\\n.D))) (\\v.m)))) (\\a.n (\\w.D))) (w H)) ((\\m.(\\o.j) (\\u.\\b.\\h.i (\\l.\\b.(\\z.\\v.k s ((\\y.y) u)) R) (s (\\m.(\\t.y U (k g)) ((\\s.c) (J h)) i))) (\\i.\\i.M ((\\t.B) ((\\i.(\\m.w) (\\x.A) (\\i.\\i.a)) (l (\\p.A))) (d ((\\q.H) (O z) (f m (\\k.A)) q))))) U)",
      "\\a.n (\\w.D)"
    );
  }

  @Test
  public final void test65() {
    reducesTo(
      "\\y.u",
      "\\y.u"
    );
  }

  @Test
  public final void test66() {
    reducesTo(
      "m (\\n.(\\y.c Y) (\\j.j y n (\\v.(\\t.(\\g.l) (C p)) (z (n c))) U) x) (y (w ((\\h.Y b) r (\\o.k))) ((\\o.\\j.\\f.t (i ((\\m.s) (\\h.A)) k)) (\\i.\\a.(\\y.T) ((\\a.\\s.b (\\a.y (\\c.j l))) (\\a.(\\u.(\\g.\\h.\\o.n) ((\\o.j) (\\v.e))) (c (e (R i)))))))) (C ((\\x.(\\c.\\t.(\\j.\\v.o (\\b.(\\l.\\p.\\a.f) ((\\v.y) (e P)) (z (\\a.\\o.k f)))) ((\\a.\\y.\\g.W) (\\p.T) (\\g.y))) (\\z.C)) j))",
      "m (\\n.c Y x) (y (w (Y b (\\o.k))) (\\j.\\f.t (i (s) k))) (C (\\t.\\v.o (\\b.\\a.f)))"
    );
  }

  @Test
  public final void test67() {
    reducesTo(
      "(\\k.\\h.\\g.\\l.\\n.\\h.\\l.\\j.(\\m.(\\h.\\u.g) g ((\\m.(\\i.U) k) P) (B x)) ((\\f.O j (\\r.R)) (o (V s)) (p (\\w.(\\v.a) (q h))) (\\u.b))) w ((\\n.\\s.(\\d.\\v.\\v.k) (\\s.\\n.c (N (\\g.\\s.\\l.a)) (\\i.(\\r.(\\o.R) (\\u.t)) (i y s (\\n.w))))) (\\s.\\z.v i)) ((\\g.K A ((\\r.L) (s m))) (w M) (\\k.\\j.\\e.W c) (\\z.\\a.\\w.(\\v.\\k.p (\\z.c)) (Q (\\j.\\o.(\\p.h L) Q))) q t) (\\n.\\z.\\w.y y ((\\f.(\\z.(\\f.t l (L V) (z z (q k)) (\\s.\\j.(\\n.\\n.w) F) (\\v.d)) ((\\b.O h n) (\\j.e) ((\\p.\\s.\\e.S) (W J u)) (\\k.(\\o.\\l.z) (\\q.\\g.l) (\\y.O)))) (\\r.(\\x.G) (\\x.\\j.\\a.v i (\\m.\\x.(\\h.(\\l.\\w.g) (\\z.\\e.l)) c)))) (x o)))",
      "\\n.\\h1.\\l.\\j.K A (L) (\\k.\\j.\\e.W c) (\\z.\\a.\\w.\\k.p (\\z.c)) q t (B x)"
    );
  }

  @Test
  public final void test68() {
    reducesTo(
      "(\\m.(\\e.\\h.(\\e.(\\d.i (m ((\\x.r) B (\\p.p d (m X) (B c (\\q.U)))))) (N (\\v.(\\e.\\t.\\i.\\t.P) (\\c.G)))) (\\h.h)) (\\u.\\k.\\c.(\\u.(\\i.Y) (F h) (f (S n)) ((\\w.S) E l) (\\u.H) (\\p.\\n.i) ((\\w.\\s.Z) ((\\z.\\e.\\t.\\m.d) p))) (\\h.\\l.(\\b.r (\\c.\\x.z)) k))) (d (\\r.(\\n.\\z.\\i.\\d.\\n.(\\k.(\\y.Q) (\\k.t)) k ((\\k.\\y.\\f.i) ((\\o.j) (\\j.J))) u (\\w.G (R A (\\g.i) (\\q.W)) (\\r.v ((\\y.\\t.\\l.o) w))) (\\s.\\d.G)) (\\o.(\\s.(\\z.t) (f u (l q) (e (b x)) (\\i.\\f.i))) (m M) (g (b (\\z.\\w.(\\i.n) m (\\y.U)) (\\l.(\\k.\\j.\\h.j (x E (L I))) ((\\q.j r (Y x)) (\\l.f))))))))",
      "\\h.i (d (\\r.\\z.\\i.\\d.\\n.Q (\\y.\\f.i) u (\\w.G (R A (\\g.i) (\\q.W)) (\\r.v (\\t.\\l.o))) (\\s.\\d.G)) (r (\\p.p (N (\\v.\\t.\\i.\\t.P)) (d (\\r.\\z.\\i.\\d.\\n.Q (\\y.\\f.i) u (\\w.G (R A (\\g.i) (\\q.W)) (\\r.v (\\t.\\l.o))) (\\s.\\d.G)) X) (B c (\\q.U)))))"
    );
  }

  @Test
  public final void test69() {
    reducesTo(
      "\\c.d",
      "\\c.d"
    );
  }

  @Test
  public final void test70() {
    reducesTo(
      "\\t.s ((\\s.\\s.g) ((\\p.(\\j.\\k.H (F (\\a.\\j.V P))) Q) (\\u.\\m.c (\\z.\\r.F)) (\\h.\\w.\\g.m I))) (r ((\\d.H) ((\\n.j) (\\g.Q (\\s.P))) X))",
      "\\t.s (\\s.g) (r (H X))"
    );
  }

  @Test
  public final void test71() {
    reducesTo(
      "(\\b.\\g.Y) (\\q.T)",
      "\\g.Y"
    );
  }

  @Test
  public final void test72() {
    reducesTo(
      "\\k.u",
      "\\k.u"
    );
  }

  @Test
  public final void test73() {
    reducesTo(
      "(\\g.A (\\x.\\i.(\\z.\\l.(\\c.E P) (\\u.a g)) R p)) ((\\y.\\u.\\h.(\\c.\\k.I w) (\\a.\\k.\\z.i)) (\\l.V x)) (\\y.\\d.x (b (\\n.m O (\\j.p) (\\c.\\p.\\t.t)) (\\v.(\\h.C (\\o.(\\e.n) (\\l.t) (\\e.q))) (E (\\d.(\\i.j J (q r)) (s (W z))))))) (r ((\\o.\\l.n x (\\x.a) ((\\d.X) (\\v.N)) (c (\\v.\\u.\\k.z)) (h (Z (\\q.g O (v F))))) (\\e.(\\n.\\c.(\\w.\\k.X) H) (\\x.B (\\u.A) (\\j.\\q.m)) (\\g.(\\u.z) ((\\g.x) Z) ((\\e.l) (C w) w)))) (\\p.(\\i.\\y.(\\w.\\l.(\\a.z) (\\i.x) B (\\x.i (o d t)) (\\v.\\f.\\p.\\s.\\c.Z)) n) ((\\y.(\\z.(\\f.K) (\\e.U) (k q)) (\\g.Z b (\\n.x) (z v (B w))) ((\\n.Z) (\\p.(\\y.Y t (Z W)) k))) (\\m.\\b.z (\\s.\\v.x) (e (\\g.W) (n k V) A))))) O",
      "A (\\x1.\\i2.E P) (\\y.\\d.x (b (\\n.m O (\\j.p) (\\c.\\p.\\t.t)) (\\v.C (\\o.n (\\e.q))))) (r (\\l.n x (\\x.a) (X) (c (\\v.\\u.\\k.z)) (h (Z (\\q.g O (v F))))) (\\p.\\y.\\l.z B (\\x4.K (k q) (Z) (o d t)) (\\v.\\f.\\p.\\s.\\c.Z))) O"
    );
  }

  @Test
  public final void test74() {
    reducesTo(
      "C (\\u.K) ((\\b.\\f.\\q.(\\d.\\f.\\s.N) ((\\t.y) ((\\f.\\w.a S) (\\l.\\o.o j)) (\\q.(\\p.(\\s.w y (\\x.W)) (n (\\m.G))) (\\q.\\i.q)) ((\\o.k D l) (\\h.(\\p.X) A) (\\c.\\i.\\a.\\b.x (\\p.f)) (u ((\\w.R) (\\r.j)) (\\y.C (f j h)))))) (\\e.q)) ((\\p.W) (\\j.\\p.\\h.w (h (O (\\m.Q (F W) (\\a.\\o.m a)) (B d m (\\s.(\\k.f) (L l)) ((\\y.B (\\x.w)) h))))) (\\w.\\c.\\c.v))",
      "C (\\u.K) (\\f.\\q.\\f.\\s.N) (W (\\w.\\c.\\c.v))"
    );
  }

  @Test
  public final void test75() {
    reducesTo(
      "\\b.(\\p.\\m.(\\u.\\i.\\d.(\\i.\\f.o l) ((\\v.\\b.\\k.(\\o.\\v.\\y.U) (\\w.\\a.f (p l) w)) ((\\z.b) (\\t.y) (\\h.\\v.X) ((\\r.K) (\\i.v) g))) R) ((\\u.\\o.H) ((\\x.\\v.\\k.(\\i.\\k.\\r.R) (C m (\\g.l)) o) ((\\l.\\i.y) (O (\\e.\\f.d)))) (\\j.\\k.(\\p.(\\m.\\t.p) (\\q.\\p.(\\i.\\w.r) l)) (\\i.(\\u.(\\g.a f) (r d x)) (\\s.(\\i.\\t.l) (z B))) ((\\m.i) (\\b.\\c.R P) n (\\o.\\h.(\\w.\\e.\\m.t (K A)) ((\\l.j) (\\u.\\p.S))))))) (\\g.z S ((\\b.(\\f.r) ((\\y.(\\g.\\z.\\l.j u (\\p.\\r.g)) (m r (\\i.t) (p R (X t)))) v)) y)) (z (T (o (\\o.y))) (X (\\a.\\g.\\j.(\\u.(\\c.(\\z.K) I) (i (m O))) (q p (g a) (\\y.f)) (\\m.n (\\b.(\\b.m) (\\g.z)) (L c (i y) (h C (c u)))) (\\g.b (p (\\s.c))))) M)",
      "\\b.\\i.\\d.o l"
    );
  }

  @Test
  public final void test76() {
    reducesTo(
      "\\j.b",
      "\\j.b"
    );
  }

  @Test
  public final void test77() {
    reducesTo(
      "(\\m.\\m.H) (\\z.(\\w.R) U l)",
      "\\m.H"
    );
  }

  @Test
  public final void test78() {
    reducesTo(
      "\\c.\\t.y",
      "\\c.\\t.y"
    );
  }

  @Test
  public final void test79() {
    reducesTo(
      "Q (n (\\j.(\\p.\\d.\\z.s) (\\e.g o (\\a.t)) (\\v.g) (r (\\e.\\b.i) (\\o.\\h.A)) (K s (Z f) (S (J l (L z) (j E (\\d.j))))) (Q (\\y.(\\y.\\b.v k) (O (\\h.c) (Q G (\\d.i)))) (\\w.(\\a.(\\u.h) o) (\\d.\\s.b e))))) (e (\\h.q (\\n.\\d.l) j) (n (\\i.n (y (\\n.E (r (r p) v))) y)))",
      "Q (n (\\j.s (K s (Z f) (S (J l (L z) (j E (\\d.j))))) (Q (\\y.\\b.v k) (\\w.h)))) (e (\\h.q (\\n.\\d.l) j) (n (\\i.n (y (\\n.E (r (r p) v))) y)))"
    );
  }

  @Test
  public final void test80() {
    reducesTo(
      "g (Z (h (\\f.(\\f.J ((\\a.\\j.n (\\b.h E (\\o.v)) (\\i.l)) (\\v.\\z.(\\c.(\\r.f) (\\i.x)) (\\i.\\w.A I) p))) P)))",
      "g (Z (h (\\f.J (\\j.n (\\b.h E (\\o.v)) (\\i.l)))))"
    );
  }

  @Test
  public final void test81() {
    reducesTo(
      "\\w.G",
      "\\w.G"
    );
  }

  @Test
  public final void test82() {
    reducesTo(
      "\\p.\\b.m",
      "\\p.\\b.m"
    );
  }

  @Test
  public final void test83() {
    reducesTo(
      "g (Q ((\\t.\\f.c u h c) (\\k.\\z.i k ((\\r.n) (u k))) (Y q (\\g.p) (o M (\\n.e)) (\\u.\\p.\\i.i))) (\\b.(\\n.Q) (\\x.\\g.(\\n.(\\j.(\\f.T) e) (p (\\g.\\i.\\d.g))) (\\c.l))) (w V o)) (x r)",
      "g (Q (c u h c) (\\b.Q) (w V o)) (x r)"
    );
  }

  @Test
  public final void test84() {
    reducesTo(
      "(\\t.(\\f.v) (B (\\q.\\y.x)) (i (v l))) W ((\\d.z) ((\\f.q) (C (\\b.X (\\e.U p) t) (v b ((\\h.l) (R t)) (y (p s) (\\r.V)) (B k (r G) (\\p.\\t.\\v.k) (\\i.q B (\\r.D) (\\w.g))))))) y",
      "v (i (v l)) (z) y"
    );
  }

  @Test
  public final void test85() {
    reducesTo(
      "\\a.(\\h.\\i.q) n (\\f.(\\f.(\\a.\\p.\\e.(\\w.\\k.\\q.l) e) (\\u.r)) (\\j.\\b.v))",
      "\\a.q"
    );
  }

  @Test
  public final void test86() {
    reducesTo(
      "(\\k.(\\k.a) ((\\g.P) ((\\v.\\g.e) f))) j",
      "a"
    );
  }

  @Test
  public final void test87() {
    reducesTo(
      "\\a.\\g.p (\\z.(\\s.(\\g.\\j.\\q.(\\w.\\j.(\\m.\\p.\\n.\\w.t) (n (\\r.\\v.p N) ((\\r.(\\k.x) (\\c.o)) a)) ((\\z.l) (\\y.\\j.\\i.q) (\\r.\\y.\\d.m) z)) P) (\\g.\\a.\\q.(\\p.q) (\\b.r (\\x.u) (\\v.(\\p.P) (w C)) i) v ((\\b.\\x.\\o.Z) ((\\d.(\\q.\\l.P q (w X) n) (\\r.d)) (\\z.(\\g.\\q.l c) (\\a.(\\j.y) h) (\\h.(\\u.\\d.\\u.E) q)))))) (e (\\h.\\o.\\k.(\\p.\\t.(\\a.B (\\o.(\\g.c) ((\\i.\\g.n V) j))) (\\j.\\x.M)) ((\\m.b) Q (\\c.M)))))",
      "\\a.\\g.p (\\z.\\j.\\q.\\j.\\n.\\w.t)"
    );
  }

  @Test
  public final void test88() {
    reducesTo(
      "(\\v.\\g.\\d.U ((\\x.\\w.u ((\\o.B) (\\s.Q) ((\\j.o) E)) (E (\\y.s))) (\\m.\\b.(\\y.\\l.V (d y b)) (\\v.\\c.x) ((\\j.p Q l) (q (p j)) ((\\g.\\t.\\h.i) (U F Z)))) T) (B (\\y.\\g.s))) ((\\n.\\h.P) (\\b.\\s.\\j.I))",
      "\\g.\\d.U (u (B (o)) (E (\\y.s))) (B (\\y.\\g.s))"
    );
  }

  @Test
  public final void test89() {
    reducesTo(
      "\\l.o",
      "\\l.o"
    );
  }

  @Test
  public final void test90() {
    reducesTo(
      "\\k.\\j.\\y.h ((\\q.X) (\\i.\\w.k) b) (\\n.u)",
      "\\k.\\j.\\y.h (X b) (\\n.u)"
    );
  }

  @Test
  public final void test91() {
    reducesTo(
      "(\\e.P) ((\\w.(\\x.u) (\\t.\\f.D (\\c.\\w.(\\j.\\b.\\f.\\h.\\s.c s) C))) (F (\\o.s ((\\a.l) (\\b.x))))) I d",
      "P I d"
    );
  }

  @Test
  public final void test92() {
    reducesTo(
      "m (\\p.m)",
      "m (\\p.m)"
    );
  }

  @Test
  public final void test93() {
    reducesTo(
      "\\a.\\y.l p",
      "\\a.\\y.l p"
    );
  }

  @Test
  public final void test94() {
    reducesTo(
      "\\g.g",
      "\\g.g"
    );
  }

  @Test
  public final void test95() {
    reducesTo(
      "\\x.n",
      "\\x.n"
    );
  }

  @Test
  public final void test96() {
    reducesTo(
      "\\q.i",
      "\\q.i"
    );
  }

  @Test
  public final void test97() {
    reducesTo(
      "t ((\\v.m ((\\z.\\k.\\m.v) (\\e.(\\r.\\r.F) f))) b ((\\i.(\\x.\\p.\\e.u a) v) (g ((\\z.\\p.s) ((\\v.X) ((\\e.n) (\\r.(\\h.f) (m X))))))) (p (\\s.K)))",
      "t (m (\\k.\\m.b) (\\p.\\e.u a) (p (\\s.K)))"
    );
  }

  @Test
  public final void test98() {
    reducesTo(
      "(\\a.Z) (\\z.M N (\\k.B (\\m.U y (\\f.h) (\\g.x) (\\g.M) l)) (b ((\\q.\\n.K) ((\\e.\\h.f k) (b S (\\u.q))) (\\d.\\s.\\w.u)) (\\o.\\g.\\k.l))) ((\\m.T) H ((\\n.\\t.\\x.L p) (\\p.\\i.\\m.\\s.C)))",
      "Z (T (\\t.\\x.L p))"
    );
  }

  @Test
  public final void test99() {
    reducesTo(
      "(\\o.a) (\\y.N X)",
      "a"
    );
  }

  @Test
  public final void test100() {
    reducesTo(
      "\\e.H",
      "\\e.H"
    );
  }

  @Test
  public final void test101() {
    reducesTo(
      "(\\c.\\q.\\m.(\\i.\\x.t) (d (\\y.\\p.l (\\j.(\\b.d) (\\g.j) (\\d.H) (u v (L N) (\\v.t)))))) ((\\h.\\t.Y ((\\u.\\p.\\r.m) u ((\\a.\\o.d q) (\\y.(\\o.m) (\\b.F))))) ((\\k.(\\w.k) F) (\\q.D) A) P) (\\y.a (\\a.i) ((\\g.v) (K z (\\y.t) (\\c.\\u.\\y.W) u (\\t.\\j.\\q.\\b.\\s.\\o.\\o.(\\g.\\j.U) ((\\p.z) (\\i.e)) ((\\e.g) (\\m.C) c)))) (g (q a))) (\\j.\\m.k)",
      "\\x.t"
    );
  }

  @Test
  public final void test102() {
    reducesTo(
      "X (n ((\\n.t) (\\f.U) ((\\f.\\s.h (i y v (\\v.\\p.Z A))) x) (S u (a y) (h w (\\o.y)) P ((\\w.(\\q.j) ((\\p.e) (\\g.D))) (G ((\\m.C) (\\e.i)))) ((\\d.\\n.(\\k.B) (\\k.g)) (\\g.(\\a.d m (D f)) (\\p.\\t.\\n.I)) (r (\\h.x) (\\k.\\n.f O) I))))) (\\w.\\l.\\u.(\\g.(\\a.\\a.\\c.\\n.y) ((\\q.\\g.L) (D (g (z Y) X) (\\z.\\a.\\m.D a (\\p.f) X ((\\e.\\o.g) (p t (K o))))))) (g (\\w.E)) (\\j.\\k.r))",
      "X (n (t (\\s.h (i y v (\\v.\\p.Z A))) (S u (a y) (h w (\\o.y)) P (j) (B)))) (\\w.\\l.\\u.\\c.\\n.y)"
    );
  }

  @Test
  public final void test103() {
    reducesTo(
      "(\\u.A) ((\\g.\\h.(\\y.\\k.w) r ((\\i.\\u.q) c) (\\l.y)) (c (\\d.\\t.\\i.\\z.(\\u.(\\f.\\a.X h) ((\\j.u) (B h)) y) (u f)) (\\n.x (\\z.h)) (\\j.(\\v.m) r ((\\x.E) (\\y.s)) (X (\\q.\\k.(\\j.\\y.w) ((\\f.J) (x J (\\a.E))))) (\\p.\\w.\\e.\\q.\\r.J))))",
      "A"
    );
  }

  @Test
  public final void test104() {
    reducesTo(
      "\\j.H",
      "\\j.H"
    );
  }

  @Test
  public final void test105() {
    reducesTo(
      "M ((\\a.K g ((\\m.T) (\\t.r)) t q) (\\j.\\k.(\\d.c) (i b) (h g (\\u.B)) (y q) (\\r.e (\\t.b) (\\w.(\\g.h) N) (j x (\\f.l) (\\y.\\w.\\i.V)))) C) ((\\o.\\a.\\q.L) (\\o.b (\\c.\\k.n))) (R a)",
      "M (K g (T) t q C) (\\a.\\q.L) (R a)"
    );
  }

  @Test
  public final void test106() {
    reducesTo(
      "\\t.y",
      "\\t.y"
    );
  }

  @Test
  public final void test107() {
    reducesTo(
      "\\t.\\u.\\s.X",
      "\\t.\\u.\\s.X"
    );
  }

  @Test
  public final void test108() {
    reducesTo(
      "\\t.o",
      "\\t.o"
    );
  }

  @Test
  public final void test109() {
    reducesTo(
      "\\t.(\\v.\\h.\\h.(\\v.\\g.(\\a.(\\p.d k (r c)) A ((\\g.N) (\\g.y o (\\s.E)))) (\\t.H) (\\z.U) ((\\g.(\\z.n) Q) (X (\\l.\\e.(\\r.j K) ((\\y.o) (\\d.s))) ((\\u.\\i.\\x.\\o.(\\y.o) (\\s.k)) (\\e.\\h.(\\q.E M) (\\y.G)))))) ((\\m.\\o.X i A ((\\g.x) (n e)) (\\f.(\\t.V (\\c.A)) (a n)) (\\t.j) (d ((\\p.l C (l G)) (\\r.\\q.\\v.w)) K)) L) (\\b.(\\a.(\\f.T ((\\n.(\\m.e) X ((\\e.l) (\\z.j))) (\\s.\\h.A))) (V z)) (\\e.(\\u.l (\\k.i)) ((\\t.V) (B q) (\\j.\\w.\\r.E)) (\\v.n (\\f.j)) D) ((\\l.\\k.\\b.\\e.z) e))) ((\\h.\\e.\\e.q ((\\n.\\y.\\e.\\g.\\l.\\w.u P) (\\z.\\h.N H (\\s.h) (\\t.s o)) (\\p.(\\d.n) (\\o.N) (\\p.(\\y.S) (\\h.s)) ((\\g.B e (U d)) (n (\\n.p)))) (\\n.(\\z.\\c.w (Q (\\t.s r (\\v.v)))) K)) (\\j.\\g.s)) (\\i.(\\i.i) ((\\o.\\q.(\\j.h ((\\m.t) (\\p.c)) (M (E Y (o b))) (p ((\\o.c) (\\k.s)))) (\\h.(\\l.n) r)) (\\f.Y))))",
      "\\t.\\h.\\h.d k (r c) (N) (\\z.U) (n)"
    );
  }

  @Test
  public final void test110() {
    reducesTo(
      "n (\\d.v e)",
      "n (\\d.v e)"
    );
  }

  @Test
  public final void test111() {
    reducesTo(
      "\\d.S",
      "\\d.S"
    );
  }

  @Test
  public final void test112() {
    reducesTo(
      "\\q.\\s.(\\e.X m) f",
      "\\q.\\s.X m"
    );
  }

  @Test
  public final void test113() {
    reducesTo(
      "\\y.\\r.(\\r.e) ((\\l.b) t)",
      "\\y.\\r.e"
    );
  }

  @Test
  public final void test114() {
    reducesTo(
      "\\c.\\y.\\d.e",
      "\\c.\\y.\\d.e"
    );
  }

  @Test
  public final void test115() {
    reducesTo(
      "\\d.\\r.\\j.\\f.\\s.u (\\a.\\z.e (\\r.f)) ((\\q.(\\a.\\b.(\\v.r) g) (\\t.t R) ((\\z.(\\u.o) (\\j.I) (\\q.T (Z t)) t) (c s (Y s) q ((\\x.\\g.w) (c r (\\p.N)))) (\\c.\\g.(\\g.u u) (O (\\i.C Y (\\j.e))) (d (m (\\v.\\z.\\s.F)))))) (D (\\j.\\w.T (H e A (\\x.(\\j.g) Q)) (\\a.f) (\\i.(\\f.(\\q.b) (H C)) (y i) (\\x.(\\m.T b (r d)) (y (\\p.E))) ((\\y.V) e (\\k.\\l.\\q.p) (\\e.\\t.\\g.(\\t.\\d.o) S)))))) (\\k.a (l (\\a.\\z.\\k.(\\s.\\g.(\\h.d) (\\s.g)) ((\\x.Z ((\\s.\\k.u t) (\\m.z p (\\d.L))) ((\\y.i (d v) (\\h.l)) r)) U))))",
      "\\d.\\r.\\j.\\f.\\s.u (\\a.\\z.e (\\r.f)) (r) (\\k.a (l (\\a.\\z.\\k.\\g.d)))"
    );
  }

  @Test
  public final void test116() {
    reducesTo(
      "\\u.r",
      "\\u.r"
    );
  }

  @Test
  public final void test117() {
    reducesTo(
      "\\y.v",
      "\\y.v"
    );
  }

  @Test
  public final void test118() {
    reducesTo(
      "(\\n.P) J",
      "P"
    );
  }

  @Test
  public final void test119() {
    reducesTo(
      "\\w.\\n.o",
      "\\w.\\n.o"
    );
  }

  @Test
  public final void test120() {
    reducesTo(
      "c (\\p.(\\l.g) (\\o.P) (\\q.M (\\x.a (\\w.\\s.R)) (\\h.\\h.\\v.K) r ((\\p.E) (\\i.s) (S q (\\u.t)) (\\s.y (\\p.G)) ((\\k.\\g.G) G Z) b))) ((\\m.P) ((\\v.t) ((\\j.\\g.(\\s.y) ((\\p.r) (\\o.x))) ((\\k.e i (o Z)) g n))) (t (X t) (J (\\o.\\n.c))) (c (T ((\\r.\\r.\\w.F (m (w (e (i G))))) (\\y.d)))))",
      "c (\\p.g (\\q.M (\\x.a (\\w.\\s.R)) (\\h.\\h.\\v.K) r (E (S q (\\u.t)) (\\s.y (\\p.G)) (G) b))) (P (t (X t) (J (\\o.\\n.c))) (c (T (\\r.\\w.F (m (w (e (i G))))))))"
    );
  }

  @Test
  public final void test121() {
    reducesTo(
      "(\\s.(\\b.(\\b.w X ((\\d.\\x.\\h.S) (\\r.\\o.v ((\\l.(\\d.M) (t V)) k)))) (\\f.\\p.V)) (\\o.e) l) x",
      "w X (\\x.\\h.S) l"
    );
  }

  @Test
  public final void test122() {
    reducesTo(
      "(\\h.z) ((\\g.\\y.f) (P (k ((\\u.e) (K W) (v x)) ((\\r.e) (\\z.\\y.B)) (\\e.G)))) (D ((\\h.x) m))",
      "z (D (x))"
    );
  }

  @Test
  public final void test123() {
    reducesTo(
      "(\\w.(\\q.\\r.(\\p.g ((\\v.V) ((\\m.\\n.\\a.\\o.\\e.Q) (\\d.(\\l.T) (a E) s)))) (\\u.(\\b.\\r.\\c.s (J (N y) (R (j A)) (\\x.\\u.\\i.(\\b.I) (\\f.Y)))) (\\h.m)) w) (\\m.\\y.b)) ((\\o.(\\y.(\\w.\\a.p) p I) d) (\\c.\\y.\\n.r) ((\\t.\\d.(\\e.\\z.u) (q (y ((\\v.m) u)))) (n (\\j.q) ((\\l.u) (\\m.k) O ((\\e.k h (\\j.g)) (\\c.g))))) ((\\a.\\u.a) f q) (\\u.\\w.\\i.\\z.\\u.\\q.H))",
      "\\r2.g (V) (p (\\d.\\z.u) (f) (\\u.\\w.\\i.\\z.\\u.\\q.H))"
    );
  }

  @Test
  public final void test124() {
    reducesTo(
      "\\m.\\z.A",
      "\\m.\\z.A"
    );
  }

  @Test
  public final void test125() {
    reducesTo(
      "\\s.\\a.\\j.\\u.(\\s.m ((\\l.x) (o W) (t C) (\\s.\\l.\\o.E v (\\o.K) ((\\u.i) (p S))) U ((\\b.(\\o.(\\f.\\p.c) (P a a)) (\\q.O r)) (\\f.(\\u.\\z.r) (\\h.(\\q.N) (\\l.i) (\\w.\\k.C)))))) (S ((\\b.k) f ((\\y.R) g w) (\\g.\\h.(\\e.(\\b.G) (\\g.U)) (r (r h)) t) W)) (\\v.(\\e.A (\\h.o)) (\\t.(\\l.\\k.C g j (\\g.f k (q K)) (\\l.B) ((\\c.\\w.v (\\b.I)) ((\\f.D H (y q)) (\\p.\\z.\\k.a)))) (\\y.\\e.(\\g.E n r (a m (\\u.n)) ((\\m.d) Z ((\\f.j) (Q h)))) ((\\u.\\e.K) o))) (\\j.\\f.k)) (\\m.\\k.\\n.f)",
      "\\s.\\a.\\j.\\u.m (x (t C) (\\s.\\l.\\o.E v (\\o.K) (i)) U (\\p.c)) (\\v.A (\\h.o) (\\j.\\f.k)) (\\m.\\k.\\n.f)"
    );
  }

  @Test
  public final void test126() {
    reducesTo(
      "(\\b.\\c.k) (\\o.(\\y.(\\q.\\h.\\w.\\b.\\q.\\x.\\j.(\\m.C) V) (t ((\\z.A d P) C (\\z.E ((\\b.D) (\\d.d)))) (\\a.i))) o (\\p.(\\w.\\y.(\\t.(\\i.\\k.M) ((\\d.N) (u a) (\\v.\\n.s k)) (\\q.I)) ((\\m.(\\q.j) (R Z (\\i.x)) (\\g.n)) (\\b.\\s.\\c.\\f.(\\k.j) H))) I ((\\i.N) (\\r.M o))))",
      "\\c.k"
    );
  }

  @Test
  public final void test127() {
    reducesTo(
      "\\r.\\t.b",
      "\\r.\\t.b"
    );
  }

  @Test
  public final void test128() {
    reducesTo(
      "g ((\\x.l) (\\o.\\b.\\s.o)) k ((\\r.(\\q.j) ((\\a.\\t.D (\\g.\\j.(\\w.m) n (\\g.(\\p.U) (\\m.N)) (\\h.(\\j.r r (\\m.A)) a) ((\\o.\\g.(\\p.u) (a c) o) (\\k.\\g.\\g.\\f.h)))) (\\w.E))) (\\o.u))",
      "g (l) k (j)"
    );
  }

  @Test
  public final void test129() {
    reducesTo(
      "(\\d.o y) (\\o.f) i S",
      "o y i S"
    );
  }

  @Test
  public final void test130() {
    reducesTo(
      "\\v.J M",
      "\\v.J M"
    );
  }

  @Test
  public final void test131() {
    reducesTo(
      "\\l.L a ((\\g.d) ((\\k.(\\d.s) ((\\z.\\r.(\\l.a) (\\k.(\\c.i) (Z C) (\\f.\\q.h d)) (\\c.\\t.\\p.\\y.\\l.\\k.\\y.x)) O)) f))",
      "\\l.L a (d)"
    );
  }

  @Test
  public final void test132() {
    reducesTo(
      "f (P T)",
      "f (P T)"
    );
  }

  @Test
  public final void test133() {
    reducesTo(
      "\\z.\\d.f ((\\g.\\b.U) ((\\h.(\\z.V c) O) (h (\\w.G) (e e ((\\u.(\\w.c) E) (\\t.\\t.c))) (h u C (\\a.(\\g.m (\\n.x)) (\\e.\\o.b)) (P ((\\e.r) (y f)) (L (p X) ((\\h.c) (B S))))))) X)",
      "\\z.\\d.f (U)"
    );
  }

  @Test
  public final void test134() {
    reducesTo(
      "(\\p.T (B i) (\\c.o L (s u)) ((\\n.t) (\\n.l) (y G (w Z))) d ((\\u.k) ((\\q.\\e.s) ((\\k.(\\t.t) (K H)) h))) (\\z.j)) ((\\r.i (\\q.u)) ((\\w.a r (y o)) (b (Z J)) j) (b (\\b.Z F)) j) (\\f.r (N (\\z.\\q.(\\n.\\z.r) (y o (F o)))) (x ((\\n.(\\w.h) ((\\n.W) (\\n.O))) n)) (I (\\l.P (t Z) (a x (\\h.g)) (w (i C (j b))) (\\t.(\\f.\\w.l) s))) ((\\g.d a) (x (Q l (\\c.W) (\\d.S g n) l)) (\\c.(\\e.\\x.X) (\\u.\\s.q)))) ((\\w.r ((\\s.\\f.\\a.w (b (\\y.(\\j.(\\g.x) (X D)) M))) P) m) H)",
      "T (B i) (\\c.o L (s u)) (t (y G (w Z))) d (k) (\\z.j) (\\f.r (N (\\z.\\q.\\z.r)) (x (h)) (I (\\l.P (t Z) (a x (\\h.g)) (w (i C (j b))) (\\t.\\w.l))) (d a (\\c.\\x.X))) (r (\\f.\\a.H (b (\\y.x))) m)"
    );
  }

  @Test
  public final void test135() {
    reducesTo(
      "(\\h.\\w.\\s.w) e",
      "\\w.\\s.w"
    );
  }

  @Test
  public final void test136() {
    reducesTo(
      "\\x.(\\i.(\\s.f) ((\\f.\\p.\\q.\\i.(\\z.(\\e.\\o.j) (u (N g))) (\\e.c t X a)) (\\e.u (l (\\z.\\x.q X)))) (\\r.t) (\\p.\\q.p)) u ((\\a.(\\k.y) ((\\o.\\q.(\\b.(\\m.(\\l.i p) y) N) (\\k.(\\l.Z) ((\\f.w Y) (k D (j P))) (\\y.\\m.\\x.\\q.u (M H) (\\o.\\p.d)))) (\\f.v))) (\\l.(\\r.k ((\\l.\\r.k h (\\f.\\d.L)) (\\x.w) ((\\o.\\t.t (y g) (k v)) (\\d.\\p.L U (a j) (\\o.f))) (\\r.\\j.b g (W E) (v x) (E (\\j.\\b.M w)) (\\h.(\\g.\\b.T w) ((\\k.V) (c p)) y)))) (B ((\\i.(\\o.F (\\j.(\\c.d) (\\u.i))) (\\a.\\u.(\\s.b) ((\\h.q) (h W))) (\\j.(\\v.k) (B W) (\\k.a (\\u.B)) ((\\q.b) ((\\i.Q) m)))) (n h)))))",
      "\\x.f (\\r.t) (\\p.\\q.p) (y)"
    );
  }

  @Test
  public final void test137() {
    reducesTo(
      "\\w.d (\\n.i (\\b.\\m.(\\s.(\\z.i m (\\e.(\\y.\\e.\\k.\\w.D) (I n (U x) c))) (v (Y (\\d.K) ((\\t.i) (o N))) (\\q.e))) ((\\w.N) I) (n t)))",
      "\\w.d (\\n.i (\\b.\\m.i m (\\e.\\e.\\k.\\w.D) (n t)))"
    );
  }

  @Test
  public final void test138() {
    reducesTo(
      "\\t.\\k.\\j.\\b.k",
      "\\t.\\k.\\j.\\b.k"
    );
  }

  @Test
  public final void test139() {
    reducesTo(
      "(\\r.J) ((\\a.\\i.\\y.(\\o.\\a.\\n.(\\n.(\\q.\\n.u) (\\j.(\\y.V) f n)) (\\a.(\\o.z) (\\t.k C g))) t ((\\x.S) Y ((\\f.X) ((\\e.c (\\b.S)) (\\f.a p (\\z.r)))) (\\p.L)) ((\\o.\\w.(\\z.\\h.\\q.N (\\f.(\\w.X) l ((\\r.o) (u m)))) (\\j.\\z.\\f.\\r.(\\f.\\y.\\v.(\\m.u) (\\o.m)) v)) (\\k.c (O (\\d.q) k)) a)) e)",
      "J"
    );
  }

  @Test
  public final void test140() {
    reducesTo(
      "\\h.\\i.(\\q.\\s.\\z.\\g.\\a.(\\m.\\p.L (\\u.p) a) ((\\k.(\\f.\\w.(\\x.l r ((\\y.l) (\\c.t))) (\\g.q (l a (h G)))) ((\\c.(\\e.\\e.k c) (\\x.\\b.\\z.e)) (U (\\e.u n (\\x.c))))) (\\g.H y (\\c.\\p.\\x.(\\w.E (m n) (\\a.\\z.p)) z)) ((\\m.\\m.\\a.(\\l.q n (U V) (l i (\\d.z))) r ((\\y.\\s.\\u.\\k.\\a.\\x.b) (\\s.N))) D))) ((\\n.(\\l.\\r.\\z.\\f.c (\\p.t F (\\b.z) ((\\s.x) (e L))) (k ((\\o.X) (g c)) ((\\e.\\r.w x) ((\\x.Y) d)))) x) (\\e.\\e.(\\e.s) ((\\y.\\z.\\u.(\\u.U) (l X) Y) (\\f.(\\i.a) a)) j) M) (\\v.\\t.d (\\e.b (\\z.(\\c.(\\r.(\\o.(\\v.l) (r O)) (\\g.M)) (\\q.y)) (\\o.m) (d (e r (\\p.x) (v B (i R))) (L z (\\g.S) (x q (\\x.c)) f)) b)))",
      "\\h.\\i.\\z.\\g2.\\a3.\\p.L (\\u.p) a3"
    );
  }

  @Test
  public final void test141() {
    reducesTo(
      "\\z.\\d.\\d.C",
      "\\z.\\d.\\d.C"
    );
  }

  @Test
  public final void test142() {
    reducesTo(
      "(\\e.\\w.\\a.\\r.k) ((\\d.\\n.\\p.s) (e (u ((\\d.f) (\\u.u) (d h (\\s.\\f.\\u.\\q.c)) (n (\\c.\\e.j G O (\\z.(\\n.d) (\\m.y)) (m (U d) (J b (h p)))))))))",
      "\\w.\\a.\\r.k"
    );
  }

  @Test
  public final void test143() {
    reducesTo(
      "\\u.\\i.K",
      "\\u.\\i.K"
    );
  }

  @Test
  public final void test144() {
    reducesTo(
      "\\r.\\x.\\b.\\i.\\p.\\s.\\p.\\b.T",
      "\\r.\\x.\\b.\\i.\\p.\\s.\\p.\\b.T"
    );
  }

  @Test
  public final void test145() {
    reducesTo(
      "\\m.(\\c.i ((\\e.Z) (\\t.(\\b.k ((\\s.s) (\\h.\\q.\\e.F))) (f ((\\b.l c (\\a.q)) (\\q.n M (d p))))) (\\a.\\z.(\\e.\\o.m (\\i.w)) (\\z.(\\g.K) (R H) (\\r.\\f.a a) ((\\y.J) g) (\\r.k))) X)) ((\\w.\\x.\\r.G (N P ((\\v.Q) ((\\w.i) L)))) K (\\c.(\\h.N) x D))",
      "\\m.i (Z (\\a.\\z.\\o.m (\\i.w)) X)"
    );
  }

  @Test
  public final void test146() {
    reducesTo(
      "\\y.k",
      "\\y.k"
    );
  }

  @Test
  public final void test147() {
    reducesTo(
      "\\y.\\x.(\\w.(\\t.e) ((\\v.\\a.t ((\\d.k) ((\\k.\\r.E M) (\\y.d)) (\\u.\\e.F)) ((\\p.M) ((\\s.\\c.\\z.B) (I w (D n))) (\\z.(\\y.\\e.d (B (\\g.d))) (\\q.o)) z)) l)) (K (h (N ((\\l.\\x.n n) (S y (\\k.j)))) (I ((\\s.Q (p n c)) ((\\x.O) H ((\\y.y) (\\d.J))))) (\\h.\\l.D) ((\\h.r ((\\z.Y) B)) (x (\\b.\\y.(\\b.\\y.(\\y.u) (a h) (z L (\\h.d))) (\\k.d))) (\\z.G ((\\z.d) ((\\u.(\\a.h) (\\u.P)) w)) (b (\\a.(\\z.\\w.e w O t) I))))))",
      "\\y.\\x.e"
    );
  }

  @Test
  public final void test148() {
    reducesTo(
      "(\\d.(\\o.\\u.\\j.p (\\b.(\\i.(\\b.\\x.\\n.k (S e (V j))) u) (O ((\\i.u) i ((\\o.Q) (\\f.Q)))) (n (\\b.(\\t.m) ((\\s.\\i.\\s.x) (p (W K))))) r)) (\\o.\\p.\\e.h ((\\m.(\\d.\\r.p a) (\\b.g) (\\h.J B z)) ((\\e.p) (\\f.U f k) (\\t.m)) (K (\\a.a))) g)) (\\d.\\j.H (b (\\d.(\\o.p r (\\u.i)) (\\d.(\\z.x) t) (\\s.l))) (a (\\c.(\\x.p) (\\t.(\\j.j) G))) b ((\\h.(\\v.(\\e.(\\s.R (o (\\c.i))) (Y (f t) (\\m.q))) (r (\\t.R y u (\\j.\\h.P X)))) ((\\r.(\\r.R) (\\x.e)) (u (\\n.G)) (\\t.y (\\n.R s (\\h.u))) g) (h (\\w.i j C ((\\b.\\m.(\\l.t e) (\\m.\\l.k)) (g (C e) (c (p n))))))) (G (T ((\\v.\\b.h G) j)) (\\y.(\\g.\\f.h) ((\\b.\\y.A) (\\f.k) b)) (\\k.b (\\z.\\k.C (\\m.\\l.e)) (\\h.(\\j.\\y.(\\w.X) (o N) W) Z (\\r.n (\\a.\\s.e) h))))))",
      "\\u.\\j.p (\\b.k (S e (V j)))"
    );
  }

  @Test
  public final void test149() {
    reducesTo(
      "\\t.\\d.F",
      "\\t.\\d.F"
    );
  }

  @Test
  public final void test150() {
    reducesTo(
      "D ((\\n.(\\x.(\\o.b) z) (x i (\\d.m) (G k (a T))) (\\m.(\\p.w) (\\y.\\c.\\v.H) (\\t.(\\w.L) (b h) (\\j.r)))) (\\d.\\w.j) ((\\t.j) (\\l.\\h.\\e.Y))) ((\\n.b) (\\e.(\\g.K) (\\z.t (n y (f j)) M) i) ((\\l.x (\\v.(\\n.k) (\\h.\\g.\\b.l)) (\\v.I (t a (r U)) (\\o.o)) (\\q.\\x.R (\\s.\\d.z (d (x A y))))) (\\a.\\b.d))) (\\h.\\p.k)",
      "D (b (\\m.w (\\t.L (\\j.r))) (j)) (b (x (\\v.k) (\\v.I (t a (r U)) (\\o.o)) (\\q.\\x.R (\\s.\\d.z (d (x A y)))))) (\\h.\\p.k)"
    );
  }

  @Test
  public final void test151() {
    reducesTo(
      "(\\h.\\n.t (g (W (r (\\c.z))))) (c (\\l.\\h.s) ((\\k.\\z.(\\f.c) (i g) (\\y.\\n.\\l.w) ((\\p.y u) (\\a.\\y.\\e.u))) v (\\c.\\k.\\s.(\\u.(\\y.o) (v M) S (\\g.g)) (e (\\h.\\v.(\\b.S) q M))) (\\m.o (\\q.(\\b.\\a.c) (\\q.G (X g) r ((\\i.\\l.b) u)))) ((\\m.\\o.\\o.(\\f.(\\m.B) B ((\\r.(\\n.e) (\\k.h)) (F (p s))) P) (q (\\a.(\\i.\\m.(\\y.D x) (S (L l))) n))) ((\\b.n) (\\r.p) ((\\i.B (\\j.k)) x) (Z x t ((\\j.c) E) (\\k.(\\h.V) (\\k.k) m) ((\\j.s) Q ((\\h.F) (m k)) (\\f.\\i.\\h.\\k.\\o.\\f.o)))))))",
      "\\n.t (g (W (r (\\c.z))))"
    );
  }

  @Test
  public final void test152() {
    reducesTo(
      "\\w.B",
      "\\w.B"
    );
  }

  private final void reducesTo(final String str1, final String str2) {
    val exp1 = stl.toDeBruijn(stl.parseUntypedExpr(str1));
    val exp2 = stl.toDeBruijn(stl.parseUntypedExpr(str2));
    val red1 = stl.format(stl.fromDeBruijn(stl.betaReduce(exp1)));
    val red2 = stl.format(stl.fromDeBruijn(exp2));
    assertEquals(red2,red1);
  }

}
