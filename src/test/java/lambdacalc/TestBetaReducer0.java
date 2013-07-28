package lambdacalc;

import org.junit.Test;

public final class TestBetaReducer0 extends ATestBetaReducer {

  @Test
  public final void test0() {
    reducesTo(
      "\\p.\\q.(\\l.i g) (\\z.(\\k.t (m (\\u.\\a.C))) j) a ((\\h.M) ((\\s.\\j.\\f.(\\x.\\b.\\y.(\\w.(\\u.o) ((\\v.w) m) (J B)) v) (\\p.h (\\e.u) (\\h.\\t.j))) ((\\a.\\d.(\\l.(\\f.\\l.h (S q (x f)) (\\k.\\s.\\t.d (s r))) b) (M N)) (\\u.(\\i.\\w.\\n.(\\g.R z (\\g.h)) (E (r m)) (\\p.(\\m.W g) T) (\\s.A)) v))))",
      "\\p.\\q.i g a (M)"
    );
  }

  @Test
  public final void test1() {
    reducesTo(
      "\\r.\\t.\\f.(\\l.\\j.\\b.c (\\j.\\y.\\q.j ((\\a.\\w.\\j.\\e.q) (\\k.\\g.\\b.T F (\\o.n) ((\\v.l) (r w))) ((\\x.h) (\\e.R) l (\\e.(\\b.E) (k a) (\\a.\\b.p))))) ((\\p.(\\n.(\\z.b a f) M) (Q (\\k.P) (\\j.c)) (\\b.c) (P (L (\\i.\\b.i a)) (H l (s e) (\\m.\\t.\\w.B) (\\p.S i (z k) (\\c.f))))) (\\e.S))) (\\l.\\i.(\\u.\\c.(\\k.e) (\\x.s) ((\\d.z ((\\u.\\b.k) q) (V ((\\b.\\l.s) (\\h.(\\d.e) (\\w.N))))) (K s (\\t.q)))) (\\w.(\\a.(\\x.(\\e.(\\q.l) (\\e.j) (\\j.m)) (a (\\d.p (m H)))) r) u (\\b.(\\o.\\b.\\d.\\m.j) (\\r.p (\\d.\\z.\\q.(\\o.j c) (\\r.d) i))))) (\\t.(\\w.\\b.\\b.(\\n.(\\x.\\s.m) (\\o.Z)) (\\f.O (\\v.R) ((\\r.\\i.Y s) ((\\y.r) (\\o.q)) (\\t.s (v i (o N)))))) (M (c y (O E)) (\\h.(\\t.j) (q u) p) ((\\t.(\\x.d) (\\k.x)) (p (\\n.p)) (\\x.T F (\\l.l) e)) (p ((\\b.\\c.W y (\\f.o) (\\y.S g)) (G s (i w) (\\n.S))))) (\\f.\\f.(\\h.\\r.(\\a.Y t (\\y.a) l) ((\\v.P u (A t)) l) ((\\e.P) (\\s.l z)) (\\x.u)) ((\\n.\\c.V) (\\c.(\\n.\\s.\\k.m) (\\r.Z) (d w (n m) n)) (\\a.(\\l.L d (\\f.e) z) (\\i.p) (\\z.\\c.\\x.\\b.c)))) ((\\l.a) c))",
      "\\r.\\t.\\f.\\b.c (\\j2.\\y.\\q3.j2 (\\j.\\e.q3)) (b a f (\\b.c) (P (L (\\i.\\b.i a)) (H (\\l.\\i.\\c.e (z (\\b.k) (V (\\l.s)))) (s e) (\\m.\\t.\\w.B) (\\p.S i (z k) (\\c.f)))))"
    );
  }

  @Test
  public final void test2() {
    reducesTo(
      "\\b.\\m.m ((\\c.(\\g.\\u.(\\s.a (\\c.\\b.\\p.(\\y.\\d.\\i.\\c.c u) (\\m.o))) ((\\b.\\x.s) (\\a.\\w.\\h.h ((\\l.s w (\\q.y)) w)))) ((\\t.(\\z.F) S (\\j.z)) (V (P Q) (u (b t))) H (\\f.\\r.\\y.v)) (s ((\\j.a (\\x.\\y.\\a.\\n.\\o.\\i.(\\l.x X) (V c (\\k.S)) (g (\\g.e)))) (\\w.(\\l.(\\b.(\\f.O q i) (\\z.\\k.V l)) (\\k.s (O z) z)) (a (\\x.(\\l.(\\w.W) (d g)) (\\b.\\a.b g))))))) ((\\r.C) (\\s.(\\y.(\\d.\\q.t s w (\\l.M m)) (L (\\g.c) ((\\n.H) (\\w.f)))) v) ((\\j.\\y.T) (d (\\r.A) ((\\e.w k) (J (O s)) (\\e.m)))) (R (g p (f j)) (l f) (x (\\i.N)) e a)))",
      "\\b.\\m.m (a (\\c5.\\b.\\p6.\\d7.\\i8.\\c9.c9 (s (a (\\x2.\\y.\\a3.\\n.\\o.\\i.x2 X (g (\\g.e)))))))"
    );
  }

  @Test
  public final void test3() {
    reducesTo(
      "(\\v.X) h ((\\n.\\h.t ((\\h.Z M) ((\\n.g) (\\j.s) ((\\i.n) (\\m.y)) (\\k.\\u.\\c.\\p.(\\u.s) (J t)) ((\\i.\\y.N R) (e (\\u.H)) (\\c.\\b.j A))))) (\\s.\\u.(\\y.\\y.K) (\\q.(\\y.\\f.\\r.\\q.(\\y.t b) (h f (\\s.s)) (y (R E (N D)))) (\\k.c) (\\e.\\v.\\k.\\y.\\e.\\e.x)))) (l (\\x.\\v.\\i.(\\i.(\\k.c) x) (\\e.(\\i.(\\d.\\m.\\k.\\r.g (I ((\\g.R) (Y U)))) ((\\s.u (\\s.a)) (V l))) e)) (\\w.\\o.m Y w))",
      "X (\\h1.t (Z M)) (l (\\x.\\v.\\i.c) (\\w.\\o.m Y w))"
    );
  }

  @Test
  public final void test4() {
    reducesTo(
      "(\\t.u) ((\\k.(\\i.F) ((\\e.\\k.\\x.\\j.\\n.(\\s.\\r.x) ((\\a.\\v.q) x)) (E (\\v.(\\z.U) v) (\\r.E (\\r.i) v)) (e (\\j.\\v.\\z.(\\d.r) (Y i))) O)) (\\a.\\g.\\d.(\\p.(\\w.(\\f.(\\o.c) (\\e.o)) (H (\\x.A)) (\\s.\\l.c (f (S s)))) (\\z.(\\d.(\\v.a (\\y.d)) q) (h (\\j.c))) (\\c.H) ((\\s.(\\k.\\o.\\v.(\\h.C) u t) (\\w.\\x.\\y.\\c.d) (\\e.\\g.a)) (u s (J x)))) (b y)))",
      "u"
    );
  }

  @Test
  public final void test5() {
    reducesTo(
      "\\i.\\l.\\q.Z",
      "\\i.\\l.\\q.Z"
    );
  }

  @Test
  public final void test6() {
    reducesTo(
      "\\a.\\b.(\\m.\\q.o (\\j.\\w.(\\s.\\g.\\c.\\i.(\\d.D (q g) (\\w.\\q.E)) (m O)) (\\o.P) (\\i.y)) A ((\\g.\\i.\\f.\\x.\\t.h) (\\h.\\j.f ((\\j.\\i.\\v.Z) U (\\c.\\s.\\b.T)) (\\b.a)) (N (\\f.(\\q.(\\n.S) (\\u.f)) (P (z (\\e.(\\p.(\\e.v) (c P)) (\\i.q)))))))) ((\\x.\\g.\\y.\\g.\\q.k) (\\n.\\d.b (u (\\z.\\o.b))))",
      "\\a.\\b.\\q.o (\\j.\\w.\\c.\\i.D (q (\\i.y)) (\\w.\\q.E)) A (\\f.\\x.\\t.h)"
    );
  }

  @Test
  public final void test7() {
    reducesTo(
      "(\\w.\\t.\\o.\\r.\\w.\\q.p) ((\\a.(\\u.S) ((\\z.m) E)) D) (c (\\f.\\q.(\\t.\\i.\\h.\\t.\\x.b) (H b (\\u.z) (\\m.\\r.U (a (\\c.m)) (\\m.H)) (\\x.v ((\\i.\\q.f k Y ((\\p.y) (y g)) e) (q j g ((\\p.g) W) (V (c p (v N)))))))))",
      "\\o.\\r.\\w.\\q.p"
    );
  }

  @Test
  public final void test8() {
    reducesTo(
      "\\b.\\t.(\\d.\\x.(\\x.N) ((\\e.(\\v.v (n (\\w.\\g.u))) (t ((\\o.j) (\\z.a)) (q h (N y) (d (C f))) (G Y)) (r (\\d.\\v.\\q.p (\\s.\\v.\\g.o p (W Q) ((\\c.o) (v c)) (O (a o P)))))) (U (x (\\m.\\p.\\z.(\\m.p o) n) (e (\\t.\\y.\\a.Z) F) (G (\\i.\\y.h)))))) ((\\d.(\\l.(\\g.\\g.(\\x.p (e (Y f (\\g.n)) w)) (\\k.(\\d.\\e.(\\m.i p) (\\u.U f)) (\\s.o) (\\h.\\b.\\j.\\f.\\l.o))) N) l) (T ((\\n.\\u.\\b.(\\y.(\\q.D) (\\f.h)) i (\\f.\\k.(\\d.f) (\\s.o) (d m (\\h.O))) ((\\f.\\w.F) (Q d (\\v.Z)) v)) (\\m.\\j.\\h.r) (\\g.n (\\a.\\o.(\\d.\\r.y (\\j.(\\i.R q) (\\z.\\k.s))) (\\r.\\i.\\p.\\h.(\\e.d) ((\\j.\\o.z) J)))))))",
      "\\b.\\t.\\x.N"
    );
  }

  @Test
  public final void test9() {
    reducesTo(
      "\\x.(\\p.\\r.\\d.(\\k.\\o.\\n.(\\d.\\g.\\v.\\l.L g) (\\o.(\\z.u o) ((\\x.\\b.\\t.g) (\\d.(\\f.\\s.\\q.s) ((\\y.L) (\\o.v v (m r)) e))))) s) P",
      "\\x.\\r.\\d.\\o.\\n.\\g.\\v.\\l.L g"
    );
  }

  @Test
  public final void test10() {
    reducesTo(
      "\\d.h",
      "\\d.h"
    );
  }

  @Test
  public final void test11() {
    reducesTo(
      "\\l.\\t.e",
      "\\l.\\t.e"
    );
  }

  @Test
  public final void test12() {
    reducesTo(
      "(\\z.j) B (\\w.C (\\d.\\b.\\n.(\\i.(\\t.\\q.\\z.(\\i.\\p.(\\z.\\d.(\\g.\\u.M) H) (\\v.z) (\\t.\\m.\\s.(\\c.k) (\\j.\\g.(\\b.z) (\\q.D)))) (\\y.(\\y.o (\\l.a f)) r)) ((\\x.\\n.(\\d.t) (\\g.S)) y)) h))",
      "j (\\w.C (\\d.\\b.\\n.\\q.\\z.\\p.\\u.M))"
    );
  }

  @Test
  public final void test13() {
    reducesTo(
      "(\\y.g) (\\g.T)",
      "g"
    );
  }

  @Test
  public final void test14() {
    reducesTo(
      "\\x.\\t.(\\q.\\o.d (\\y.\\j.N (y a))) (\\y.(\\e.o (\\t.E)) (\\z.\\d.\\j.(\\p.(\\t.\\t.V s) (w n (\\f.o)) (u (\\y.(\\r.w) (\\t.z)))) (g ((\\w.(\\w.D) m) (d j (\\b.A)))))) ((\\s.(\\c.l (\\j.j T v ((\\m.v) (\\k.A)))) (i (w c (\\v.l) (\\w.\\e.I c)))) ((\\h.\\g.m P) (K m x) (c d (\\s.V) (\\x.o)) (P ((\\b.\\a.h L) u))) (c (B (\\t.\\k.\\k.v)))) c Q",
      "\\x.\\t.d (\\y.\\j.N (y a)) c Q"
    );
  }

  @Test
  public final void test15() {
    reducesTo(
      "(\\d.Q (w i ((\\o.(\\n.\\v.\\m.p) s) (\\f.\\i.W U)))) (\\c.M)",
      "Q (w i (\\v.\\m.p))"
    );
  }

  @Test
  public final void test16() {
    reducesTo(
      "(\\p.(\\w.\\q.V) ((\\k.(\\b.C) (\\i.(\\s.K) ((\\q.g) (N A)))) a M) (\\b.f h ((\\s.(\\g.b) (\\e.p) (\\o.h) (\\l.(\\l.Z Y (f r)) (p O (\\a.w)))) v (\\n.\\k.q)))) (l ((\\f.b) ((\\i.E ((\\w.p) c ((\\l.v) (c z)) (f s))) ((\\j.K (\\b.A)) (r z (\\p.r)) (b (\\e.\\a.E u)) (j ((\\j.g (X g)) c)))))) ((\\c.\\i.\\v.(\\i.o) a v y) ((\\r.(\\n.A) (\\z.(\\l.t) (\\l.h) ((\\s.F) (\\t.t)) (V (q f (\\f.X))))) (\\o.h) t (\\j.J)))",
      "V (\\i.\\v.o v y)"
    );
  }

  @Test
  public final void test17() {
    reducesTo(
      "(\\l.\\n.(\\q.\\o.\\y.\\j.(\\i.(\\q.\\s.\\l.c) (\\c.C)) ((\\o.e (\\m.\\k.u (\\u.\\b.w)) (S ((\\n.J) (\\u.c)) (v e))) (\\z.b) ((\\e.\\m.v j) (\\o.X w) (\\p.(\\h.\\t.\\z.\\y.g) b)))) (\\q.(\\i.e) k (\\g.\\w.l) ((\\i.u) u ((\\a.M (\\c.H) (\\s.S (Z a)) (\\i.X)) (\\i.\\d.C (\\u.C) (S q (\\y.M)) (\\d.j A)))) (\\s.\\u.l))) (\\k.u ((\\y.\\g.(\\z.\\k.(\\z.k n) q) B) (\\p.\\a.e (\\b.(\\q.u) (\\f.w) (\\c.u))) ((\\p.V P (\\x.M) ((\\e.k) (\\u.E)) W) (l (\\z.\\z.l z)))) (H u) (\\s.(\\h.o) ((\\y.\\y.\\y.V ((\\j.r) (x e)) (a (\\m.G))) (\\w.\\r.(\\w.G) m) i) x))",
      "\\n1.\\o.\\y.\\j.\\s.\\l.c"
    );
  }

  @Test
  public final void test18() {
    reducesTo(
      "\\b.E",
      "\\b.E"
    );
  }

  @Test
  public final void test19() {
    reducesTo(
      "\\v.k",
      "\\v.k"
    );
  }

  @Test
  public final void test20() {
    reducesTo(
      "(\\j.Z (\\y.\\w.(\\g.\\w.p) (d ((\\h.(\\i.F) s) (t (w Y)) X (\\e.\\q.(\\s.\\p.z (g E) ((\\u.i) (I H))) (\\r.(\\w.P) J)) ((\\v.(\\r.p) (\\t.H) ((\\a.f) (V l))) o t))))) L",
      "Z (\\y.\\w.\\w.p)"
    );
  }

  @Test
  public final void test21() {
    reducesTo(
      "\\z.\\t.(\\e.t ((\\j.u i) K)) (u ((\\j.\\g.\\q.q) ((\\s.n (\\w.\\m.g)) (\\o.(\\a.(\\a.i) (\\c.Z) F) z) (\\s.T (b (\\u.\\k.w (t C (\\k.O)))))))) (b (q ((\\m.a (\\n.\\t.\\r.p m (s P) (\\c.s))) U) r) C)",
      "\\z.\\t.t (u i) (b (q (a (\\n.\\t.\\r.p U (s P) (\\c.s))) r) C)"
    );
  }

  @Test
  public final void test22() {
    reducesTo(
      "\\e.(\\g.\\p.m) (\\t.t ((\\l.r) d (\\b.(\\f.m) G) I ((\\o.\\v.\\h.\\a.V) (\\y.\\p.W (\\t.d))) P) (\\t.\\l.(\\l.\\c.\\u.\\w.d (\\u.(\\r.b Z) (a u n)) (\\w.y)) ((\\i.z) (F (j P))) ((\\w.\\j.q U e ((\\e.l) v)) (\\g.\\j.(\\l.J a) (\\a.\\l.s)) (\\d.C) (\\r.R)))) ((\\h.(\\i.r (l (\\f.k)) (\\b.v)) f ((\\l.(\\l.q) (\\a.O) (\\g.j Q (w o)) ((\\o.C) (j W) Y)) w)) ((\\e.\\t.\\q.(\\n.\\e.\\e.w) (\\q.c)) (O (\\x.x) (\\o.\\q.b) U) (\\x.P (h u (A c)) W (\\v.\\s.(\\v.\\m.B) s))) (\\m.\\s.m) (\\m.(\\g.\\i.\\o.\\q.h y) (O (\\u.\\r.\\p.(\\m.h (q ((\\u.(\\o.h) (\\w.v)) b))) ((\\o.n (\\h.e)) (\\x.\\u.G q) ((\\o.(\\j.v) F) (\\c.H d (D s))) ((\\v.p) r))))))",
      "\\e.m"
    );
  }

  @Test
  public final void test23() {
    reducesTo(
      "\\h.p",
      "\\h.p"
    );
  }

  @Test
  public final void test24() {
    reducesTo(
      "g (j ((\\z.(\\g.\\l.\\h.r) (v C (s s))) C (\\m.e (\\v.q) D) N ((\\d.n (\\f.\\u.\\g.\\w.r (\\s.J))) (o (\\u.g) ((\\b.d) (\\b.g)) (\\d.(\\f.\\c.Q C) H) (t ((\\k.P) (v g) (j (K f)))))))) (P (\\r.\\q.(\\f.\\x.I) ((\\r.(\\u.\\c.a) (\\v.r)) ((\\i.j) a ((\\g.\\n.\\o.a (\\u.\\e.g)) ((\\x.o) m ((\\t.F) (w q))))) (\\i.\\h.f))))",
      "g (j (r (n (\\f.\\u.\\g.\\w.r (\\s.J))))) (P (\\r.\\q.\\x.I))"
    );
  }

  @Test
  public final void test25() {
    reducesTo(
      "I ((\\q.d (w (x (\\h.\\f.\\k.(\\r.A k) (\\a.O X)) (\\t.\\e.n F)))) (\\i.\\d.(\\b.q (\\r.(\\m.(\\h.w) (D r) A) (\\s.E r (i C) (P (H C))))) (\\h.(\\l.Z (\\b.Q) (\\j.z)) (\\q.\\r.e o ((\\v.v) (B q))) (\\o.h)) ((\\l.\\m.(\\l.H) (\\x.k)) (t (L d V) (V (O y K))) (\\g.\\m.(\\l.\\r.t) (\\d.\\g.\\m.(\\k.m x (\\r.l) (\\j.h)) x))))) (y b)",
      "I (d (w (x (\\h.\\f.\\k.A k) (\\t.\\e.n F)))) (y b)"
    );
  }

  @Test
  public final void test26() {
    reducesTo(
      "(\\w.\\b.\\r.\\n.\\m.(\\r.\\j.\\i.\\q.\\s.e (z M (\\w.t)) l (\\h.\\u.p ((\\u.m) (t i)) (\\g.K t x (\\u.k))) (\\p.\\i.s)) ((\\q.V ((\\m.a) (\\i.X) (\\g.\\o.y) (j J (P p) (\\j.t j (\\w.I))))) (\\z.(\\x.c) p ((\\g.(\\z.\\g.V k) K) (E (b x (\\r.o))))))) w ((\\c.(\\f.\\s.\\j.(\\o.\\c.\\z.l) (\\x.D (O (\\u.j))) w) ((\\y.\\e.z) (\\p.w)) (J G (\\s.Y) (\\f.\\n.K) (\\v.H (\\g.W) i) ((\\b.S) (\\n.D)) (\\i.e (\\z.b) d))) (\\x.\\m.\\y.x)) (\\g.G)",
      "\\n.\\m.\\j.\\i.\\q.\\s.e (z M (\\w.t)) l (\\h.\\u.p (m) (\\g.K t x (\\u.k))) (\\p.\\i.s)"
    );
  }

  @Test
  public final void test27() {
    reducesTo(
      "Y o (\\a.M (\\y.c))",
      "Y o (\\a.M (\\y.c))"
    );
  }

  @Test
  public final void test28() {
    reducesTo(
      "(\\n.\\k.\\y.\\d.\\g.I) (\\v.\\o.z ((\\t.m (\\f.j) ((\\p.\\x.(\\a.u) ((\\l.m m (\\x.Y)) (\\c.\\r.k))) (M R (\\r.\\z.\\d.C) (f x (\\p.\\q.F T))) v)) (\\h.\\a.(\\h.\\g.j) (h M (t u) ((\\x.R) (y u)) (\\e.\\q.n) V) f)))",
      "\\k.\\y.\\d.\\g.I"
    );
  }

  @Test
  public final void test29() {
    reducesTo(
      "\\d.i",
      "\\d.i"
    );
  }

  @Test
  public final void test30() {
    reducesTo(
      "\\l.v w",
      "\\l.v w"
    );
  }

  @Test
  public final void test31() {
    reducesTo(
      "\\n.\\y.\\q.(\\x.\\g.n (\\n.p) G) Z",
      "\\n.\\y.\\q.\\g.n (\\n.p) G"
    );
  }

  @Test
  public final void test32() {
    reducesTo(
      "(\\p.w ((\\h.\\m.C) ((\\e.\\w.w p (V l) (y o)) (\\a.(\\k.F) A) L)) (h ((\\k.h) f)) n) ((\\f.G) k ((\\r.W x (\\v.t) J (\\t.\\f.(\\c.r) (X R) (O o (v F))) h ((\\x.(\\l.o) w ((\\c.r) (\\k.M)) p) (\\w.\\m.(\\f.\\s.I h (\\w.X) (\\y.\\y.X)) ((\\m.K) T D))) a) (\\z.(\\l.P) (\\w.x))))",
      "w (\\m.C) (h (h)) n"
    );
  }

  @Test
  public final void test33() {
    reducesTo(
      "(\\w.\\j.\\w.\\r.(\\w.W (t g) (l (S R)) (n (\\j.\\g.m w)) (\\t.\\n.u) ((\\z.\\k.X a) N)) ((\\l.T ((\\z.R) K) b) c b) (\\u.a) u) (\\f.(\\a.(\\g.(\\g.(\\p.x) (\\v.\\z.\\q.v)) ((\\w.(\\k.\\y.H ((\\a.z) (\\r.w))) (\\y.\\a.\\p.(\\f.\\v.f) ((\\b.j) (\\g.a)))) T o)) (y (\\n.y))) f)",
      "\\j.\\w.\\r.W (t g) (l (S R)) (n (\\j.\\g.m (T (R) b b))) (\\t.\\n.u) (\\k.X a) (\\u.a) u"
    );
  }

  @Test
  public final void test34() {
    reducesTo(
      "\\m.(\\g.K) ((\\q.\\i.H (Z (\\b.(\\m.\\t.(\\i.l) ((\\r.p) (\\b.(\\a.(\\x.l) (c h)) (\\a.R)))) (\\b.\\q.\\m.(\\e.u e ((\\n.l) d) ((\\b.C) (\\h.e) (\\b.\\g.\\s.m))) (\\i.\\j.\\w.u f))))) (\\d.\\o.u))",
      "\\m.K"
    );
  }

  @Test
  public final void test35() {
    reducesTo(
      "\\u.\\g.u ((\\n.(\\l.e (\\s.\\j.(\\z.x) y (\\b.\\i.f)) x ((\\d.(\\z.S) Y u) (\\p.Y))) (\\m.I ((\\r.(\\v.z P o ((\\f.s) (r L))) q) ((\\d.j (q L)) (\\o.v h (h C)) (\\g.b)))) (\\w.(\\u.i) (l (\\r.(\\n.\\f.\\i.u s ((\\y.c) (\\p.k))) (\\n.g)) (\\w.y)))) (\\e.h k))",
      "\\u.\\g.u (e (\\s.\\j.x (\\b.\\i.f)) x (S u) (\\w.i))"
    );
  }

  @Test
  public final void test36() {
    reducesTo(
      "(\\l.(\\z.\\e.\\d.(\\j.(\\b.C (I z (i f))) (\\n.(\\x.l) E (\\j.\\q.\\s.A)) q ((\\h.\\w.u) ((\\c.\\s.\\i.(\\o.o) ((\\f.X) (o g))) (\\y.h)))) (o (\\k.Q))) C) (\\g.q) Y",
      "\\d.C (I C (i f)) q (\\w.u)"
    );
  }

  @Test
  public final void test37() {
    reducesTo(
      "\\q.E",
      "\\q.E"
    );
  }

  @Test
  public final void test38() {
    reducesTo(
      "(\\f.(\\v.\\e.\\g.\\l.(\\q.f) (\\u.v) ((\\k.b) Z (\\o.v j))) n) (d ((\\b.(\\f.n (\\r.\\k.j) U ((\\b.\\u.\\g.a) (\\b.\\u.s))) (d (\\s.\\a.V) (g ((\\n.w) (\\t.e)) l))) (\\e.(\\c.B) ((\\k.(\\v.(\\g.\\u.A) ((\\a.E) (\\z.u))) j) (z (\\p.\\g.\\c.(\\f.W) (F r) (a (\\v.k))))))) (\\x.j))",
      "\\e1.\\g2.\\l3.d (n (\\r.\\k.j) U (\\u.\\g.a)) (\\x.j) (b (\\o.n j))"
    );
  }

  @Test
  public final void test39() {
    reducesTo(
      "\\v.(\\o.\\f.r (g (\\g.\\r.Y)) (\\c.\\e.\\a.\\u.(\\x.v (\\k.U)) S) i) (\\e.B)",
      "\\v.\\f.r (g (\\g.\\r.Y)) (\\c.\\e.\\a.\\u.v (\\k.U)) i"
    );
  }

  @Test
  public final void test40() {
    reducesTo(
      "\\k.\\p.y",
      "\\k.\\p.y"
    );
  }

  @Test
  public final void test41() {
    reducesTo(
      "r (\\g.N) H ((\\n.(\\f.q (\\t.N)) (Y ((\\x.\\j.(\\s.(\\o.m M (m y)) (s (p t)) t) (j ((\\e.\\v.o A) (X N (\\f.N))))) o))) (\\a.u))",
      "r (\\g.N) H (q (\\t.N))"
    );
  }

  @Test
  public final void test42() {
    reducesTo(
      "\\o.(\\g.w I) (w ((\\m.F) ((\\m.\\n.u n) (\\j.(\\z.(\\s.m a u) (t (Y o)) (\\v.(\\d.y) (F w) (M U (\\w.B)))) (\\j.D) (\\r.\\k.m (\\a.(\\d.x p X l) (b (\\q.k) (\\l.(\\o.x) (e i)))))))))",
      "\\o.w I"
    );
  }

  @Test
  public final void test43() {
    reducesTo(
      "(\\g.(\\m.c) (\\z.(\\d.b (\\n.\\h.N)) (\\o.\\r.g)) ((\\g.\\v.\\x.\\i.\\r.k ((\\r.\\b.(\\z.C) (\\i.U e)) (\\a.I x) (\\g.T (o f (\\k.a) I))) s) (I k (\\k.\\t.m)))) ((\\c.(\\x.k) (q l)) (\\t.(\\k.\\h.x (\\b.\\u.\\a.(\\m.\\g.\\t.(\\s.(\\y.H z) a) ((\\x.b) F ((\\f.I) w))) ((\\t.\\c.M w) ((\\s.h) (o F)) (\\z.l V (l J) (\\w.\\y.\\c.I))) (\\w.\\z.\\i.(\\k.N) (\\y.(\\r.W (\\c.p)) (\\n.u))))) v))",
      "c (\\v.\\x.\\i.\\r.k (C) s)"
    );
  }

  @Test
  public final void test44() {
    reducesTo(
      "\\w.C (\\b.D n (U (\\g.\\j.n))) g",
      "\\w.C (\\b.D n (U (\\g.\\j.n))) g"
    );
  }

  @Test
  public final void test45() {
    reducesTo(
      "\\v.h ((\\c.\\u.\\h.(\\h.\\o.\\c.\\y.\\g.d) x) Q) (\\v.o) (\\l.\\t.(\\c.\\n.(\\j.d k) ((\\r.f) (\\f.H) (k m b))) Q ((\\x.E (\\u.(\\j.(\\r.v) (\\i.s)) (t (\\s.e)))) (\\u.(\\y.b) d)) (\\h.\\l.(\\w.\\r.p) (u ((\\x.Y) (\\i.r)) (h ((\\w.n) (U M))) g)) (\\t.\\n.(\\d.g) (\\c.(\\l.f) (\\m.(\\m.\\m.k) ((\\s.\\u.D f) (k (\\y.l)) (M w (\\c.d) (\\x.A))))))) (\\u.\\g.\\x.\\e.\\d.(\\o.j) (\\i.e) ((\\o.\\k.(\\p.\\l.n) (f q ((\\g.K) (\\z.N)) ((\\u.b) e (\\z.n))) (\\e.\\i.\\i.\\b.\\c.\\v.d)) (\\j.\\r.(\\g.e (W k (Q y) (x T (\\y.a))) (e (r F (m Z) (\\e.\\m.\\u.B)))) ((\\m.q) c)) (\\f.\\n.\\m.(\\q.\\g.u) ((\\g.\\s.(\\d.\\r.H) (e l x) (p C v ((\\b.r) (y u)))) W) Y)))",
      "\\v.h (\\u.\\h.\\o.\\c.\\y.\\g.d) (\\v.o) (\\l.\\t.d k (\\h.\\l.\\r.p) (\\t.\\n.g)) (\\u.\\g.\\x.\\e.\\d.j (n))"
    );
  }

  @Test
  public final void test46() {
    reducesTo(
      "(\\g.a ((\\a.R) (\\i.s))) (m (\\s.m)) p",
      "a (R) p"
    );
  }

  @Test
  public final void test47() {
    reducesTo(
      "w (\\t.\\j.a)",
      "w (\\t.\\j.a)"
    );
  }

  @Test
  public final void test48() {
    reducesTo(
      "(\\j.s ((\\s.\\e.\\i.\\x.(\\f.\\n.(\\t.n) ((\\t.(\\p.y) (\\i.N)) (s (M G)))) (\\y.(\\y.v) (\\d.\\i.(\\z.O) (\\l.f K))) (\\v.\\o.(\\v.h n) f ((\\m.P ((\\d.a) (\\h.d))) I))) ((\\e.d) ((\\u.C) d) (f ((\\h.\\a.\\d.P) (\\m.Q l (\\p.c)))) k) (\\l.\\g.w))) G",
      "s (\\i.\\x.\\v.\\o.h n (P (a)))"
    );
  }

  @Test
  public final void test49() {
    reducesTo(
      "\\z.e d",
      "\\z.e d"
    );
  }

  @Test
  public final void test50() {
    reducesTo(
      "(\\m.\\a.\\c.g) W",
      "\\a.\\c.g"
    );
  }

  @Test
  public final void test51() {
    reducesTo(
      "\\c.(\\m.\\h.\\t.K (\\c.\\u.M)) (\\w.\\r.\\v.b) I (\\k.(\\l.(\\t.v) (b W) (\\k.k)) k ((\\r.\\w.\\n.f) (\\a.\\y.H (f (g z)))) ((\\i.\\n.\\c.\\j.j (o c)) x (\\q.\\c.\\y.\\i.\\l.m)) b) ((\\p.L) (\\s.\\l.\\j.a) L (\\v.u (K w (\\x.z)) C) (\\o.\\o.c) (\\b.s ((\\y.\\m.(\\n.y) (\\f.t) E) (S ((\\i.A) (z h))) ((\\i.W t (c s) (q W (d O))) (n (\\h.q) (a l (\\p.N)))))) (b (\\z.P) (\\x.J ((\\o.u w (\\g.r)) (\\u.\\y.o)) ((\\m.s) (\\i.v))) ((\\w.n) B (\\y.h a) (\\y.(\\r.\\w.(\\t.\\m.e d (u k) (\\p.\\l.U)) ((\\w.t) Q ((\\x.L) (r m)))) ((\\w.(\\k.W) (\\d.Y)) D (\\r.(\\b.\\c.\\l.j) (\\d.q (e I)))))))) (Z U)",
      "\\c.K (\\c.\\u.M) (L L (\\v.u (K w (\\x.z)) C) (\\o.\\o.c) (\\b.s (S (A) E)) (b (\\z.P) (\\x.J (u w (\\g.r)) (s)) (n (\\y.h a) (\\y.\\w.\\m.e d (u k) (\\p.\\l.U))))) (Z U)"
    );
  }

  @Test
  public final void test52() {
    reducesTo(
      "(\\d.\\p.\\s.(\\x.(\\z.j) r) (u ((\\k.b) (\\x.D) r ((\\i.e) ((\\k.C) p)) (\\o.H) (v d) (\\f.x)))) (\\i.o)",
      "\\p.\\s.j"
    );
  }

  @Test
  public final void test53() {
    reducesTo(
      "\\t.s ((\\u.\\z.\\i.\\o.(\\a.B (\\r.\\w.b s)) (\\b.W E S (c h E)) (\\u.w) R) ((\\f.(\\f.(\\h.w) (C t) (O (\\g.x)) (\\f.i)) (D (\\a.\\t.\\j.(\\a.\\e.Y) (\\n.p)))) ((\\n.i b) (r (\\y.(\\o.h) (\\k.g))) X)) (\\d.\\w.\\e.\\d.\\k.w)) (\\z.\\k.(\\l.(\\m.U) Y) (\\v.(\\c.(\\n.\\i.\\x.\\x.e (v N)) q) F) ((\\c.\\b.\\e.\\w.(\\h.(\\a.\\a.t L y (\\i.\\t.f)) (\\f.(\\x.R S) r)) d) (\\f.(\\s.s (Z (\\m.u)) ((\\h.e) (v S) (Q (\\v.e)))) (z (\\s.\\y.\\v.P) (\\j.z)))) (Q ((\\m.o) O ((\\f.(\\y.v) (\\u.\\v.(\\p.i) (\\y.x) (n C (i H)))) (z ((\\f.(\\f.o) (o X)) (Y (\\c.g))))))) (\\f.(\\c.v) (\\o.\\t.(\\f.\\g.(\\h.\\r.z n (u s) ((\\y.x) (\\a.y))) (y (\\g.y) k)) ((\\x.\\i.(\\w.\\k.r) (o v (\\w.m))) (\\j.\\h.C)) (\\n.l) ((\\c.U) ((\\l.\\i.q) (\\x.q z x p)) ((\\o.F) (\\f.u) ((\\m.Z) S) (b (\\q.(\\b.b) r (z A (\\i.C)))))))))",
      "\\t.s (\\i.\\o.B (\\r.\\w.b s) (\\u.w) R) (\\z.\\k.U (\\b.\\e.\\w.\\a.t L y (\\i.\\t.f)) (Q (o (v))) (\\f.v))"
    );
  }

  @Test
  public final void test54() {
    reducesTo(
      "L (\\g.\\f.\\s.j) (\\e.\\n.(\\r.w) ((\\n.Q (\\t.\\v.d) e) (\\b.b)) p)",
      "L (\\g.\\f.\\s.j) (\\e.\\n.w p)"
    );
  }

  @Test
  public final void test55() {
    reducesTo(
      "(\\c.P) (\\j.f (r ((\\b.\\n.G) (\\r.(\\l.f) n (\\h.i r (\\n.b)))) (\\m.V k (\\n.k c h) G ((\\m.\\e.u) W)) ((\\l.\\i.l) (\\n.\\m.\\k.H) (\\d.r (m (\\v.t))) ((\\j.\\u.\\k.w) ((\\b.I) (\\x.\\g.y))) X))) ((\\q.\\j.z) (\\z.\\x.a))",
      "P (\\j.z)"
    );
  }

  @Test
  public final void test56() {
    reducesTo(
      "(\\r.(\\c.i) ((\\z.w ((\\d.\\m.E) ((\\t.(\\w.z X (\\o.z)) T) ((\\d.M) (\\g.k) y)) (\\a.u))) (\\l.(\\w.F) ((\\l.w d) (\\t.s)) (\\v.r ((\\k.\\y.o) ((\\f.\\m.H) p)) i)))) (\\q.(\\g.h (f (\\w.\\i.\\f.m)) (E (\\h.R ((\\p.\\e.u) ((\\k.G a (\\k.B)) p)) z))) (n (\\i.(\\v.\\b.\\o.(\\a.\\e.c) (\\y.p) ((\\c.o) D (l K (b v))) P) ((\\y.U) (\\o.Z G) M (\\a.(\\y.\\t.v) (\\q.G)))) (\\j.\\h.\\g.q)))",
      "i"
    );
  }

  @Test
  public final void test57() {
    reducesTo(
      "\\h.\\p.\\j.z",
      "\\h.\\p.\\j.z"
    );
  }

  @Test
  public final void test58() {
    reducesTo(
      "(\\s.p ((\\c.\\x.\\j.i) (\\n.\\o.\\s.h))) (q (\\u.o) (o (\\m.N) (\\l.(\\z.(\\v.E) (l i)) o ((\\f.\\i.\\x.n) (y V (\\b.f))) (\\e.\\b.\\b.i (X s (\\t.U) (\\t.\\j.i L))))) N) ((\\d.c (\\a.\\a.(\\d.X) ((\\o.i (m h (n I)) z) (\\i.\\x.a (\\w.(\\o.K) (\\z.v) ((\\q.t) (Z w))))))) (P ((\\w.h) ((\\o.u I (r n)) (\\u.d))) (\\e.\\s.i h z) y) K)",
      "p (\\x.\\j.i) (c (\\a.\\a.X) K)"
    );
  }

  @Test
  public final void test59() {
    reducesTo(
      "(\\s.(\\o.(\\e.\\j.\\s.s) ((\\q.\\w.\\q.z) ((\\w.o) (U p)))) (\\d.(\\r.x) ((\\d.S) (\\e.d))) (\\u.m)) ((\\g.o) ((\\u.L) ((\\c.c) (i h))) (I (j (O (\\m.f)))) ((\\p.r (\\y.\\t.E)) (\\i.m) ((\\r.H) (\\k.g) k (\\i.\\g.\\b.\\u.(\\y.g) (\\a.k))))) g ((\\n.\\u.r) (\\n.\\y.\\b.\\i.l)) (y (\\u.A (\\t.\\o.(\\a.\\e.r) (\\d.w))))",
      "g (\\u.r) (y (\\u.A (\\t.\\o.\\e.r)))"
    );
  }

  @Test
  public final void test60() {
    reducesTo(
      "D (\\s.Y) f",
      "D (\\s.Y) f"
    );
  }

  @Test
  public final void test61() {
    reducesTo(
      "(\\p.M) (\\j.(\\x.\\b.\\k.(\\l.y (\\j.\\q.F) (\\p.H b (\\n.s) (\\b.g (\\x.n)) u)) t) z (\\w.(\\a.k (\\l.(\\c.\\n.\\w.(\\i.C) c) (\\z.(\\o.e) x m))) (\\m.m) Q)) (\\m.\\h.(\\y.q (u a z)) g)",
      "M (\\m.\\h.q (u a z))"
    );
  }

  @Test
  public final void test62() {
    reducesTo(
      "\\v.\\m.d",
      "\\v.\\m.d"
    );
  }

  @Test
  public final void test63() {
    reducesTo(
      "\\k.C",
      "\\k.C"
    );
  }

  @Test
  public final void test64() {
    reducesTo(
      "\\i.z R ((\\x.(\\b.(\\n.(\\i.f j (\\c.z)) n (\\o.a)) (\\a.t)) (\\k.\\y.\\d.s) ((\\r.(\\v.(\\j.(\\q.f) (l I)) (q b) (\\n.(\\h.r) (\\e.i) E)) ((\\e.\\y.X) (\\b.S i (\\p.Z)) (\\t.\\b.\\u.\\n.(\\n.i) (\\p.i)))) (\\d.F)) (\\u.\\d.z H ((\\n.(\\m.e (s n)) (O (\\e.b)) (\\i.\\c.g y (O T) (c y (\\g.y))) ((\\o.\\x.l U (\\m.d) (H Q (h R))) (\\j.\\m.(\\i.V) ((\\m.j) (\\t.q))))) (\\w.\\x.(\\h.S C g (\\x.d y (f a))) j T)))) r)",
      "\\i.z R (f j (\\c.z) (\\o.a) (f (\\n.F)) (\\u.\\d.z H (e (s (\\w.\\x.S C g (\\x.d y (f a)) T)) (\\i.\\c.g y (O T) (c y (\\g.y))) (\\x.l U (\\m.d) (H Q (h R))))))"
    );
  }

  @Test
  public final void test65() {
    reducesTo(
      "\\l.p (\\f.\\f.\\j.\\e.(\\l.(\\j.\\t.\\q.\\h.u) V (\\q.\\n.\\f.C (\\c.\\j.(\\y.z (\\q.V) (\\u.A J)) (\\l.\\y.b)) E)) (\\z.(\\e.k (T (e w (d f) (R j (\\g.s))) (M F (\\h.a) ((\\o.Y) (\\e.t)) (Y s)))) (q (\\g.\\p.\\t.(\\g.(\\t.y) ((\\e.D S (z z)) w)) (h ((\\c.Q) (\\u.v)) ((\\j.o) (U t) (\\f.w)))))) i)",
      "\\l.p (\\f.\\f.\\j.\\e.\\h.u)"
    );
  }

  @Test
  public final void test66() {
    reducesTo(
      "\\j.w O",
      "\\j.w O"
    );
  }

  @Test
  public final void test67() {
    reducesTo(
      "\\v.(\\o.i) (\\p.\\m.p)",
      "\\v.i"
    );
  }

  @Test
  public final void test68() {
    reducesTo(
      "\\l.o ((\\q.(\\q.\\x.H) ((\\n.(\\u.\\h.S ((\\d.\\e.\\j.u) (L x l))) (y i (\\j.\\j.M n (\\d.T) (k (\\i.w)))) m) (\\a.\\x.\\y.T))) (G E))",
      "\\l.o (\\x.H)"
    );
  }

  @Test
  public final void test69() {
    reducesTo(
      "e (\\c.k z) ((\\j.(\\b.\\j.(\\f.W) (\\m.\\b.r u)) ((\\z.(\\m.T) Z (\\y.n D) ((\\e.(\\l.o) (\\c.L)) (\\o.b))) M b (\\i.(\\o.I) (\\r.\\n.(\\t.\\j.\\o.V ((\\o.c) (\\f.\\o.p))) ((\\z.r) S ((\\z.c) T)))))) (\\m.\\n.k (\\u.Q o)))",
      "e (\\c.k z) (\\j.W)"
    );
  }

  @Test
  public final void test70() {
    reducesTo(
      "B (\\q.\\c.o)",
      "B (\\q.\\c.o)"
    );
  }

  @Test
  public final void test71() {
    reducesTo(
      "\\r.w",
      "\\r.w"
    );
  }

  @Test
  public final void test72() {
    reducesTo(
      "\\c.E",
      "\\c.E"
    );
  }

  @Test
  public final void test73() {
    reducesTo(
      "(\\u.n) ((\\w.y (\\b.(\\m.(\\p.\\j.K k) (a D (\\n.y)) (Q (\\h.n X (\\h.e))) (\\c.g)) Q) ((\\i.O) r)) (P (G (\\n.p) Y)))",
      "n"
    );
  }

  @Test
  public final void test74() {
    reducesTo(
      "(\\y.U) (\\e.\\i.\\v.u)",
      "U"
    );
  }

  @Test
  public final void test75() {
    reducesTo(
      "\\o.\\b.\\d.m (\\c.(\\w.\\r.\\l.j) ((\\i.(\\h.(\\g.\\y.j u) (K h (x l))) (n (\\u.V) (\\r.\\z.z j)) (\\b.(\\q.\\c.f p) (A s (y c)) (\\g.\\w.g S (Z i) (e (m h))))) p) A) (\\w.(\\a.\\w.(\\t.\\i.(\\h.P) v) ((\\a.\\i.(\\t.\\s.\\l.\\w.(\\o.\\x.t) (\\k.x y) z) (\\i.d)) (\\m.\\u.l (\\z.\\f.a L)) (F (\\i.k) ((\\w.\\g.\\m.\\a.a b (h N)) O ((\\o.\\n.\\q.\\k.n) ((\\u.u) ((\\b.g) (\\t.E)))))))) (\\g.(\\w.m) ((\\t.z H) ((\\w.(\\u.\\q.\\d.q) (\\l.i)) Y (\\f.\\w.w B (b o) t d) (\\z.k)))))",
      "\\o.\\b.\\d.m (\\c.\\l.j) (\\w.\\w.\\i.P)"
    );
  }

  @Test
  public final void test76() {
    reducesTo(
      "\\d.d",
      "\\d.d"
    );
  }

  @Test
  public final void test77() {
    reducesTo(
      "(\\m.d) (\\p.\\g.\\z.\\q.g)",
      "d"
    );
  }

  @Test
  public final void test78() {
    reducesTo(
      "\\c.\\r.c",
      "\\c.\\r.c"
    );
  }

  @Test
  public final void test79() {
    reducesTo(
      "\\b.u",
      "\\b.u"
    );
  }

  @Test
  public final void test80() {
    reducesTo(
      "(\\h.\\z.(\\u.\\k.(\\j.\\w.Z (\\p.(\\n.a) (\\p.k (\\q.\\o.A)))) (M (\\f.(\\e.o L (\\o.Q)) (\\q.\\o.t t)) (\\a.P) (g ((\\u.W J (\\v.k) ((\\b.O) (\\l.E))) (\\a.K (\\x.\\e.r v)))) (\\b.\\y.(\\c.(\\q.n (\\o.M)) i) (\\i.k)))) g) ((\\q.M) ((\\d.\\c.\\i.x) ((\\u.\\o.W ((\\e.(\\h.J) (q u)) (K v) G)) (\\g.(\\r.\\p.G) ((\\g.(\\f.l) ((\\r.p) (\\c.O))) (d (p a) (\\e.F)))) (\\f.w G (\\b.\\q.e)))))",
      "\\z.\\k.\\w.Z (\\p.a)"
    );
  }

  @Test
  public final void test81() {
    reducesTo(
      "\\x.x",
      "\\x.x"
    );
  }

  @Test
  public final void test82() {
    reducesTo(
      "(\\u.\\k.I) (\\g.\\n.(\\j.(\\c.o (\\b.C (R A))) (\\t.\\p.(\\t.r) (x v) (v Z (\\p.d))) (\\t.\\h.\\x.\\j.\\s.l) ((\\r.b) (\\u.(\\a.u) (\\b.J) ((\\s.h) (o e))) (\\z.\\i.\\p.r (\\f.\\m.Z))) (z (\\j.(\\k.G) (\\b.p)) S ((\\z.i) R) F)) M ((\\s.A) ((\\g.\\o.(\\t.n) (e x) (\\c.\\b.w i) h ((\\n.r) (\\y.c)) M) ((\\v.(\\d.(\\y.r J g ((\\m.L) L)) (\\c.\\u.X)) (\\e.(\\t.q) (x c) (l w) (x g))) (\\q.Y)))))",
      "\\k.I"
    );
  }

  @Test
  public final void test83() {
    reducesTo(
      "\\k.s",
      "\\k.s"
    );
  }

  @Test
  public final void test84() {
    reducesTo(
      "(\\y.b) f",
      "b"
    );
  }

  @Test
  public final void test85() {
    reducesTo(
      "\\o.\\z.z",
      "\\o.\\z.z"
    );
  }

  @Test
  public final void test86() {
    reducesTo(
      "(\\h.(\\j.\\c.(\\h.m) ((\\l.s) ((\\z.S ((\\b.k) (\\d.\\z.x))) (\\d.I l)))) (c (\\p.B (\\l.D) (\\w.h (E H)) (\\a.\\k.(\\u.\\e.r) ((\\v.P) i))) L ((\\c.P) ((\\v.\\d.(\\m.\\o.F) (\\m.(\\j.f) (m i)) Q) ((\\u.M) ((\\s.f (w r)) (m k (r b))))))) (o ((\\h.H ((\\l.d (P x)) (\\m.\\d.x) (\\d.c (\\t.G) (\\w.\\e.\\w.L)))) i L))) (n ((\\h.\\v.k) (L (\\t.\\y.(\\p.\\g.\\r.\\r.e) ((\\c.\\l.x) (\\u.\\i.v) (n J (p n) (\\p.h Y c)) (\\i.k))))))",
      "m"
    );
  }

  @Test
  public final void test87() {
    reducesTo(
      "\\x.v",
      "\\x.v"
    );
  }

  @Test
  public final void test88() {
    reducesTo(
      "\\y.(\\e.a (\\w.\\m.\\g.(\\z.c) (\\r.F)) s) (\\j.(\\w.p (X z) V) (v ((\\n.(\\n.(\\f.a (\\e.F) q) ((\\p.l) (r b) (\\z.\\q.M))) (r (\\s.\\v.\\g.\\a.(\\j.w) (d t)))) (\\v.\\t.g) O)))",
      "\\y.a (\\w.\\m.\\g.c) s"
    );
  }

  @Test
  public final void test89() {
    reducesTo(
      "\\w.a (\\e.(\\f.\\i.\\t.s) ((\\i.p (\\i.u) ((\\v.s (o o)) (u (q x)) (v ((\\p.T) (\\s.f))) (\\d.U (d i (\\p.p)) (\\p.h)))) (\\j.(\\u.B) ((\\i.q (D p) (\\n.\\d.P G)) (h (\\b.\\m.f O))) (G ((\\z.\\x.(\\j.Q) C (\\q.r x)) E)))) (i d))",
      "\\w.a (\\e.\\t.s)"
    );
  }

  @Test
  public final void test90() {
    reducesTo(
      "(\\p.(\\l.v) r (\\d.e) (\\t.n)) (g ((\\e.\\j.q) (\\y.\\t.(\\y.\\h.M) (\\u.\\m.k)))) ((\\o.(\\j.b) ((\\d.K) (t x) (\\v.(\\i.N) (N L)) w)) (\\v.p) (\\g.\\h.\\d.(\\k.g) (m f) ((\\z.j) (\\g.q)) (N (\\l.i) (\\j.\\m.P i)) (k (\\n.\\d.(\\c.f) (\\a.r) b)) (s ((\\y.B (\\v.(\\d.c) l)) m)))) (f (S (\\y.\\v.\\c.R)) (\\z.u)) a",
      "v (\\d.e) (\\t.n) (b (\\g.\\h.\\d.g (j) (N (\\l.i) (\\j.\\m.P i)) (k (\\n.\\d.f b)) (s (B (\\v.c))))) (f (S (\\y.\\v.\\c.R)) (\\z.u)) a"
    );
  }

  @Test
  public final void test91() {
    reducesTo(
      "(\\n.\\s.x ((\\n.E) (\\p.i) (I m ((\\m.\\l.\\h.A) (p f (L k)))) ((\\u.h e (\\k.j)) t (\\l.\\w.\\y.D (Q U) (x s (y g))) (\\w.\\y.\\n.\\h.J (\\u.\\h.z) (\\l.\\q.(\\c.M) (\\u.W))))) (\\w.b)) (\\r.x) ((\\q.(\\i.E) (\\j.n)) (\\k.U f) f)",
      "x (E (I m (\\l.\\h.A)) (h e (\\k.j) (\\l.\\w.\\y.D (Q U) (x (E f) (y g))) (\\w.\\y.\\n.\\h.J (\\u.\\h.z) (\\l.\\q.M)))) (\\w.b)"
    );
  }

  @Test
  public final void test92() {
    reducesTo(
      "(\\d.i f) ((\\a.P) (\\z.(\\t.b (\\t.\\b.k) (\\x.R)) (\\c.Y)) J (\\e.\\f.\\r.\\g.O p))",
      "i f"
    );
  }

  @Test
  public final void test93() {
    reducesTo(
      "(\\m.\\q.v) (\\r.r) k ((\\b.T ((\\b.\\z.\\u.(\\g.\\o.(\\y.b) (\\k.L) ((\\r.q) (\\g.n))) (V (L b X))) (\\f.\\u.\\t.Z ((\\h.Y) (e l) (\\r.p))) c (\\k.D))) (\\d.\\d.n (\\x.\\j.\\i.\\u.c)))",
      "v (T (\\o.\\u.\\t.Z (Y (\\r.p))))"
    );
  }

  @Test
  public final void test94() {
    reducesTo(
      "v (\\c.n m) h ((\\y.a (\\d.(\\j.\\q.\\b.\\n.\\n.j B (\\i.a)) ((\\w.r k (r Y)) (g (q l))) T) (\\q.c)) (\\s.B (\\g.\\d.n))) (\\b.(\\b.n) (\\x.t) D (\\q.x))",
      "v (\\c.n m) h (a (\\d.\\b.\\n.\\n.r k (r Y) B (\\i.a)) (\\q.c)) (\\b.n D (\\q.x))"
    );
  }

  @Test
  public final void test95() {
    reducesTo(
      "(\\e.\\a.(\\q.\\n.p) (\\k.r (W D) (w ((\\i.a) s ((\\j.\\x.\\a.(\\a.v) (\\o.\\r.\\q.S)) Z))))) ((\\r.p) ((\\w.(\\g.M) ((\\t.Y (\\m.\\p.m U) (\\j.T ((\\n.\\y.U v) (\\q.\\v.Y c)))) (d (v ((\\d.F t (a s)) ((\\w.i) (o v))))))) (m (\\l.(\\g.(\\l.l (\\m.z)) (\\g.(\\x.a X R (\\w.b)) (\\a.\\c.x))) A))))",
      "\\a.\\n.p"
    );
  }

  @Test
  public final void test96() {
    reducesTo(
      "\\n.\\r.(\\c.\\d.(\\x.\\l.A) H) ((\\j.\\u.y) (\\e.\\i.n F)) (\\y.\\k.(\\d.\\n.q (\\b.\\w.\\a.k)) (\\m.J U ((\\b.r ((\\i.\\g.\\w.T) s)) (\\f.m)) (\\w.\\l.(\\s.q ((\\w.B) (s r))) ((\\y.O) (\\y.d) z) (l (\\a.\\h.\\k.\\m.S f l)) (\\t.i))) c)",
      "\\n.\\r.\\l.A"
    );
  }

  @Test
  public final void test97() {
    reducesTo(
      "P (\\k.\\e.\\q.\\z.\\p.h)",
      "P (\\k.\\e.\\q.\\z.\\p.h)"
    );
  }

  @Test
  public final void test98() {
    reducesTo(
      "\\f.\\p.(\\m.i) (\\l.\\h.z)",
      "\\f.\\p.i"
    );
  }

  @Test
  public final void test99() {
    reducesTo(
      "(\\x.\\f.\\q.\\l.(\\g.(\\j.(\\z.(\\z.t) (\\y.\\b.Z)) V) ((\\w.(\\i.\\r.\\x.j) (\\e.r)) ((\\p.w) (m k) (\\i.S) (r (m f) (\\p.U)) E))) (q (\\t.(\\s.(\\f.(\\a.\\t.k) (\\c.\\q.(\\w.\\n.z) c)) (w H)) ((\\n.G (d y)) (\\d.\\r.u) B ((\\i.\\d.(\\l.x d) (v H (o z))) ((\\a.D) a t)))))) ((\\b.C) (\\t.\\c.(\\d.(\\u.u) k) (S ((\\o.\\m.f g) (\\l.(\\m.s) F)))) (\\n.\\j.\\h.\\r.\\t.n) M) ((\\q.(\\s.\\c.W D (\\c.(\\y.\\u.(\\f.(\\f.M (d b (\\m.X))) ((\\z.\\n.\\k.p) (\\c.p (\\s.h)))) (B (\\z.\\w.\\x.i (\\j.e) ((\\z.z) (p V))))) n)) ((\\r.(\\l.(\\m.D) G (\\m.I)) (\\w.r (T V (\\s.g)))) l (C (A m) (\\i.z) ((\\z.m J (\\r.o)) (\\y.\\y.u)) (\\t.s)) ((\\q.(\\a.\\h.\\w.\\d.C x s) (\\n.\\c.u)) ((\\o.c i s) (\\r.t) r) (\\x.\\t.T (U P) (v f) r ((\\y.(\\h.u) v) h))))) (\\p.\\a.\\r.n))",
      "\\q.\\l2.t"
    );
  }

  @Test
  public final void test100() {
    reducesTo(
      "(\\u.(\\f.(\\w.D (\\i.(\\k.\\y.e ((\\s.C) ((\\s.D) (\\h.m)) (e k (q d) (S (i h))))) (\\a.\\e.\\s.\\m.b (\\c.\\b.(\\m.w) (\\q.\\n.\\d.(\\v.i) (o Q)))))) (\\m.\\s.(\\i.\\o.(\\j.j) ((\\i.c (e (Z (\\j.i)))) (a (\\r.(\\e.(\\y.t) s) (X A))))) v)) R) ((\\e.\\h.\\h.C (\\h.V) g) (l f (\\u.\\m.\\h.\\x.y)) (\\d.y k))",
      "D (\\i.\\y.e (C (e (\\a1.\\e2.\\s.\\m.b (\\c3.\\b.\\m.\\s.\\o.c (e (Z (\\j.a (\\r.t)))))) (q d) (S (i h)))))"
    );
  }

  @Test
  public final void test101() {
    reducesTo(
      "\\j.(\\u.a (\\l.\\f.\\r.l) e) z (\\e.(\\n.\\i.\\h.\\u.\\k.\\i.(\\r.F) ((\\m.(\\z.D) k) (n p (\\q.n))) ((\\m.a) m (\\a.I) v) (\\h.e)) (\\f.\\y.\\c.y (\\x.\\r.i))) ((\\n.R) (\\v.j) (p X (\\x.z)) (\\x.\\x.b (\\z.\\w.(\\k.\\q.e) V))) p",
      "\\j.a (\\l.\\f.\\r.l) e (\\e.\\i1.\\h.\\u.\\k.\\i2.F (a (\\a.I) v) (\\h.e)) (R (p X (\\x.z)) (\\x.\\x.b (\\z.\\w.\\q.e))) p"
    );
  }

  @Test
  public final void test102() {
    reducesTo(
      "V (\\w.H)",
      "V (\\w.H)"
    );
  }

  @Test
  public final void test103() {
    reducesTo(
      "\\p.h o",
      "\\p.h o"
    );
  }

  @Test
  public final void test104() {
    reducesTo(
      "(\\t.b (\\l.(\\y.\\h.\\h.\\j.\\z.(\\r.(\\n.Z m) (\\g.Y)) g) (\\s.\\e.(\\x.C) (t p) (c (t S)) (\\r.(\\y.o) (\\o.G) (\\x.s s))) ((\\z.(\\j.\\j.c) X) (\\a.l))) (n (\\a.t) (\\l.(\\e.(\\p.\\n.(\\i.D) p ((\\p.c) Q) (d (O p (\\f.s)))) (\\g.p S)) (\\o.\\a.\\a.y)))) ((\\q.\\f.\\d.\\p.(\\m.\\e.k) h d) (\\y.I)) (T (\\e.(\\f.\\m.h) K n b))",
      "b (\\l.\\h.\\j.\\z.Z m) (n (\\a.\\f.\\d.\\p.k) (\\l.\\n.D (c) (d (O (\\g.p S) (\\f.s))))) (T (\\e.h b))"
    );
  }

  @Test
  public final void test105() {
    reducesTo(
      "\\b.b",
      "\\b.b"
    );
  }

  @Test
  public final void test106() {
    reducesTo(
      "\\z.(\\d.\\t.o ((\\m.U) (\\u.\\z.z))) (\\l.V) ((\\s.\\q.(\\m.\\v.(\\d.t) (\\i.l) (\\w.\\j.I) ((\\d.\\o.\\a.F) (u x (E Y))) (z (\\f.o) d ((\\k.E) n))) Q (\\f.N) (\\r.c)) l)",
      "\\z.o (U)"
    );
  }

  @Test
  public final void test107() {
    reducesTo(
      "(\\s.(\\g.\\h.H) ((\\h.\\m.\\v.(\\q.(\\f.\\k.B) (r (\\z.j))) (\\l.k)) (\\g.z (\\s.f (j V)))) (\\v.\\e.\\i.\\x.\\i.(\\i.E (\\g.\\y.\\p.c) (\\z.N) ((\\q.\\l.\\o.t (\\k.t)) (a o (F w) (\\u.(\\k.y) (\\s.o))))) c)) (p (z (\\f.v))) s (\\y.\\l.\\t.\\t.D)",
      "H s (\\y.\\l.\\t.\\t.D)"
    );
  }

  @Test
  public final void test108() {
    reducesTo(
      "(\\u.\\g.J) ((\\g.\\w.(\\v.\\x.g) ((\\o.\\k.R W) (\\m.\\o.\\p.t)) ((\\v.(\\i.h) g) ((\\w.v) (c y) (\\f.\\e.i g))) ((\\z.(\\x.g) z (\\d.(\\b.u) (A n) ((\\l.r) (\\z.A)))) Q)) (\\h.(\\n.p (\\p.\\t.u)) (\\h.\\a.(\\f.\\c.u I) (\\r.M) x) ((\\y.\\e.(\\q.i) (\\v.\\p.\\y.p) Y) (\\i.n))) (\\c.\\q.(\\l.(\\x.\\w.r) (\\s.\\g.\\a.l) (\\y.V)) (\\u.Z))) (\\a.\\q.(\\c.E (M ((\\w.\\t.a i) X))) (\\s.(\\t.\\n.T d) (r L (l H)) (\\d.g) (\\g.\\h.\\o.(\\b.(\\h.y) (e l) (\\g.P t)) (\\v.f l f (\\l.h)))) (y (\\c.B (\\y.u z c) ((\\m.V) (L D) (z y n))) k) (\\e.\\e.\\l.O ((\\n.\\v.(\\l.q (\\z.V)) (\\k.r k i) ((\\q.\\f.\\z.x) (\\x.\\d.t)) (\\m.h)) (\\x.\\z.I (\\z.h)))) ((\\v.(\\m.I) (\\d.\\a.i)) m))",
      "J"
    );
  }

  @Test
  public final void test109() {
    reducesTo(
      "\\z.(\\t.l x) (f (\\c.\\g.(\\k.(\\x.\\w.\\n.x) H) e ((\\k.J G) i) (\\i.Q)))",
      "\\z.l x"
    );
  }

  @Test
  public final void test110() {
    reducesTo(
      "\\e.\\n.\\i.\\m.(\\w.(\\q.a) ((\\m.c (\\n.H) (\\d.(\\k.E m (\\q.j)) (d u (\\r.e)) (y (W f))) (\\o.(\\d.\\l.\\u.s) ((\\k.P) (\\i.M e (\\c.W) (\\s.e l (\\u.u)))))) (\\h.\\m.(\\z.n) (\\d.o (\\x.E)) ((\\j.\\k.\\o.f) ((\\b.j) (\\t.c))) ((\\y.(\\n.a) (\\k.j)) k c) ((\\r.\\x.\\b.\\c.a) (\\o.\\z.(\\e.m g d) (\\h.A) (\\t.\\u.n)))) ((\\v.\\z.G) ((\\g.\\k.\\r.O o (\\f.(\\b.e b) (\\h.\\q.T))) ((\\r.p) (\\f.g ((\\i.f) (v t))))) (\\z.s)))) L",
      "\\e.\\n.\\i.\\m.a"
    );
  }

  @Test
  public final void test111() {
    reducesTo(
      "\\s.P",
      "\\s.P"
    );
  }

  @Test
  public final void test112() {
    reducesTo(
      "\\i.\\w.j ((\\b.\\a.(\\c.P (\\k.\\r.h (\\x.y) ((\\n.w) e) (k x)) (\\v.\\i.\\a.(\\f.y) (e K) s f (\\v.p))) A) x) (t (M (\\c.\\n.(\\o.\\r.(\\s.(\\r.(\\t.i) (p b)) (U (Z y))) (b (\\k.(\\o.M) m)) ((\\s.h z (F U)) (e (\\o.U)) (o (\\s.q m (s R))))) (\\l.t)) q))",
      "\\i.\\w.j (\\a.P (\\k.\\r.h (\\x.y) (w) (k x)) (\\v.\\i.\\a.y s f (\\v.p))) (t (M (\\c.\\n.\\r.i (h z (F U) (t))) q))"
    );
  }

  @Test
  public final void test113() {
    reducesTo(
      "\\h.\\k.g",
      "\\h.\\k.g"
    );
  }

  @Test
  public final void test114() {
    reducesTo(
      "\\e.\\t.(\\m.w (P (z U ((\\b.x) (\\x.Q)) (\\v.l (\\j.(\\y.K) (\\w.p))) (\\p.\\p.\\s.l)) j ((\\q.q) (G ((\\d.\\d.c (\\m.(\\m.\\x.q) (\\w.u c))) ((\\k.\\i.\\k.c) ((\\y.i) (\\e.\\n.k r)))))))) S",
      "\\e.\\t.w (P (z U (x) (\\v.l (\\j.K)) (\\p.\\p.\\s.l)) j (G (\\d.c (\\m.\\x.q))))"
    );
  }

  @Test
  public final void test115() {
    reducesTo(
      "(\\t.(\\r.\\s.(\\d.\\y.k ((\\m.\\t.L) (\\c.H))) (\\c.\\n.c)) ((\\z.i) D)) ((\\r.d ((\\t.(\\a.y i e) (\\z.t u (b V))) (N h))) (v ((\\r.\\p.\\g.(\\b.\\e.t) (\\o.v)) ((\\v.\\l.g) v))) (M (\\i.\\f.\\w.(\\k.\\y.(\\g.E) (l R) r) m) (\\j.\\g.\\x.P)) (q (\\e.\\l.(\\a.\\x.\\h.f (z (\\z.g) p) (\\u.\\a.(\\m.\\q.x l) (\\h.\\a.m Z (\\s.b)))) (\\m.\\z.(\\h.y) t))) (\\s.(\\n.h (\\d.\\a.d)) (\\p.\\p.\\f.\\l.a ((\\j.f) ((\\l.\\g.s u) (\\j.V)))) ((\\v.\\m.W) w) (n (\\c.\\i.\\y.\\s.(\\e.(\\w.n) Y ((\\p.b) (s b))) (\\n.\\z.(\\c.\\y.b) (\\l.\\r.M)) ((\\j.e (\\n.g)) w ((\\d.a) (\\l.\\y.\\u.Y))) (\\d.(\\h.t (h k D (\\g.(\\r.S) (\\j.i)))) (n (\\y.J (\\s.J))))))))",
      "\\s.\\y.k (\\t.L)"
    );
  }

  @Test
  public final void test116() {
    reducesTo(
      "\\j.\\w.S",
      "\\j.\\w.S"
    );
  }

  @Test
  public final void test117() {
    reducesTo(
      "\\f.I (\\n.(\\c.\\h.\\p.(\\r.m) u) (\\v.\\v.\\r.(\\c.\\k.\\u.\\n.\\z.\\m.(\\a.f) z (\\z.l b) (\\k.v (\\y.q))) (\\f.\\q.(\\q.w) (\\r.\\x.(\\w.d) Q (\\k.\\t.N))) (\\d.f) (\\z.(\\a.(\\a.(\\k.j) (q p)) (\\m.(\\f.l) (\\o.W)) a) (o n) ((\\r.(\\l.I) (\\a.\\s.\\g.\\i.\\v.\\h.b)) (\\z.\\l.m)))) k)",
      "\\f.I (\\n.\\p.m)"
    );
  }

  @Test
  public final void test118() {
    reducesTo(
      "\\m.m",
      "\\m.m"
    );
  }

  @Test
  public final void test119() {
    reducesTo(
      "U (\\d.(\\r.J) (\\c.\\v.\\h.N))",
      "U (\\d.J)"
    );
  }

  @Test
  public final void test120() {
    reducesTo(
      "(\\w.\\r.(\\t.(\\h.Q M f) j) ((\\o.y) (\\h.q) (\\p.\\t.z)) (\\n.b) j ((\\a.w) (\\l.(\\k.o T (J b) (\\j.\\x.\\w.L)) (y (\\s.\\e.G)) R)) (\\q.(\\p.s) ((\\y.k c u (\\a.\\p.\\p.f) (\\i.t ((\\r.c) (\\q.p))) (\\l.\\j.o)) q))) ((\\m.\\m.\\u.t (l t)) Q (\\b.c)) (\\p.\\d.\\c.(\\q.\\c.(\\u.y (\\c.\\v.(\\f.(\\m.g) (\\b.l)) (R (f z)) (\\s.\\o.\\q.\\g.\\u.s e))) (\\a.(\\q.G (f (\\d.U) (t (f n)))) (\\o.b)) (\\e.(\\q.g (S ((\\z.V) Q)) A) ((\\s.\\d.C L) (\\v.\\y.k) (h c ((\\j.g) (x c))) g))) ((\\c.\\b.\\r.h (\\g.d)) (f t (K m) (r J (\\y.k)) (\\w.\\q.m (\\e.e f)) (H d ((\\u.u) ((\\a.l) (\\r.s))))) (N x)) ((\\p.(\\q.\\h.\\v.(\\g.(\\i.(\\e.K) (\\g.x d)) y) I) (\\r.\\w.\\r.(\\g.l l P (\\k.k)) ((\\t.d) (\\y.i) (B g g)) (x b))) (b (\\v.e)) ((\\k.h (C N (\\e.n))) (\\w.u) (\\w.\\j.(\\s.Z) (\\q.h) (\\e.k) (\\i.q)) (\\t.N (\\c.(\\i.(\\w.r) V) (e j (z q)) ((\\f.\\h.\\o.j) (\\k.\\v.w J)))) (\\k.K))))",
      "Q M f (\\n.b) j (\\u.t (l t)) (\\q.s)"
    );
  }

  @Test
  public final void test121() {
    reducesTo(
      "(\\o.\\j.g (\\b.b) ((\\b.\\m.\\f.E) (\\x.(\\t.a) (g X)) F g) (K C)) (\\q.(\\v.\\f.\\g.\\m.\\m.(\\y.v x ((\\d.e) (L n)) (\\b.\\c.\\k.\\v.a s (I p))) (A (\\g.Q))) i ((\\o.\\z.q) (\\b.a (\\f.R) (\\g.\\h.\\i.w) ((\\g.(\\u.f) (L o)) (\\i.\\b.h)) (\\i.\\s.h W q ((\\x.d) u) (\\g.\\u.\\k.f Z (\\c.h)))))) (\\a.(\\k.(\\i.B) ((\\k.u l ((\\b.C (w n)) (\\m.M))) (t ((\\p.C A o) (\\i.\\h.\\p.d))))) l (\\b.k s i)) ((\\u.\\k.(\\g.a (\\i.\\q.S y)) (r (\\w.h) t) (\\v.(\\n.E) (\\o.h) (C F (l u)) o) ((\\c.M) (\\f.(\\w.(\\b.o) (\\o.y)) (p S G) (D (\\d.i) L))) g) z ((\\i.u (c (\\e.r) (v p g) ((\\b.m) (\\e.w) g) (\\z.J) (\\m.(\\k.Q) (\\j.K) F ((\\w.\\b.\\o.E) I) (\\f.(\\n.v) A C)))) ((\\l.o) (\\r.d) (\\d.w))))",
      "g (\\b.b) (E) (K C) (a (\\i.\\q.S y) (\\v.E (C F (l z)) o) (M) g)"
    );
  }

  @Test
  public final void test122() {
    reducesTo(
      "g C (J W O)",
      "g C (J W O)"
    );
  }

  @Test
  public final void test123() {
    reducesTo(
      "\\e.g",
      "\\e.g"
    );
  }

  @Test
  public final void test124() {
    reducesTo(
      "\\a.(\\r.(\\e.Z) (\\k.(\\q.m) (\\k.y) c) (x ((\\t.Z) (f x)) (\\b.(\\k.c) t (\\o.\\v.r a))) (u (a (\\r.x P H) (\\z.l)))) (\\f.\\x.\\n.\\v.k (\\k.y)) ((\\p.t (t L (\\j.r)) (\\f.\\n.(\\d.r) ((\\i.r) c)) ((\\t.a) (\\e.E) (\\i.f) (\\l.\\p.(\\h.H e) (r (\\f.E))))) (\\s.\\m.g) N) (\\f.c) (\\o.P)",
      "\\a.Z (x (Z) (\\b.c (\\o.\\v.\\x.\\n.\\v.k (\\k.y)))) (u (a (\\r.x P H) (\\z.l))) (t (t L (\\j.r)) (\\f.\\n.r) (a (\\i.f) (\\l.\\p.H e)) N) (\\f.c) (\\o.P)"
    );
  }

  @Test
  public final void test125() {
    reducesTo(
      "\\v.\\j.y d (\\h.(\\r.\\e.m) ((\\w.e) R (\\o.g)) (\\m.x)) z",
      "\\v.\\j.y d (\\h.m) z"
    );
  }

  @Test
  public final void test126() {
    reducesTo(
      "d (\\a.\\x.A)",
      "d (\\a.\\x.A)"
    );
  }

  @Test
  public final void test127() {
    reducesTo(
      "\\t.\\f.z",
      "\\t.\\f.z"
    );
  }

  @Test
  public final void test128() {
    reducesTo(
      "(\\c.\\k.\\i.\\f.(\\q.\\s.n) (\\q.I) (U i ((\\i.(\\m.\\q.l) (\\m.(\\q.\\s.\\o.j) ((\\i.b) d))) (u ((\\c.l) (\\p.e) (\\i.d s (\\e.i))))) n)) ((\\q.R ((\\x.\\x.\\w.\\x.(\\p.\\y.\\p.i E (\\i.r) (B O (\\s.n)) (p (\\h.P K))) ((\\e.(\\c.K) (r I) (F m (t s))) (y (\\w.w) ((\\c.U) (\\q.n))))) k)) (\\j.o (\\u.(\\i.q) q (x c)) a (\\h.\\q.\\z.\\q.(\\a.(\\z.\\p.t) j) (\\x.(\\v.\\w.a) (Q y (\\c.T))) n) ((\\e.X O) ((\\g.h i (p l) (u (p g))) ((\\m.u) G ((\\n.o) (\\l.n)))) (\\w.\\y.\\m.\\k.m)))) (\\u.z (\\n.c) (\\h.i) ((\\x.\\n.k (\\f.m) ((\\w.(\\d.u (\\d.(\\v.r G) (v s))) (\\a.o (\\i.t))) e)) (\\z.(\\v.A) i)))",
      "\\i.\\f.n"
    );
  }

  @Test
  public final void test129() {
    reducesTo(
      "(\\z.j) C (\\c.H)",
      "j (\\c.H)"
    );
  }

  @Test
  public final void test130() {
    reducesTo(
      "(\\q.(\\u.t) ((\\z.(\\h.(\\m.b) X) ((\\o.v) (\\i.o)) (\\z.g (s r) (z p (W p)))) (\\m.\\s.\\z.\\k.\\t.\\k.\\q.\\h.\\x.\\x.w)) (t ((\\b.\\k.Q t) z (T f d ((\\k.r) d)) ((\\e.\\u.w W) (l M v) (d (y L (l S))))))) (\\z.(\\i.k) t) (\\l.n (\\p.\\i.w) ((\\v.(\\a.\\g.t) g) c (\\g.N) ((\\n.\\i.(\\f.(\\p.\\m.t (j O (\\p.M))) (\\z.\\d.(\\p.L H) X)) ((\\h.\\n.k l K ((\\t.W) (\\i.h))) ((\\y.n) (U a) (\\b.(\\f.w) (C Y))))) (\\r.\\l.c)))) (\\k.h)",
      "t (t (Q t (w W))) (\\l.n (\\p.\\i.w) (t (\\i.\\m.t (j O (\\p.M))))) (\\k.h)"
    );
  }

  @Test
  public final void test131() {
    reducesTo(
      "v (y (\\q.N (\\f.\\l.E ((\\n.\\y.\\d.\\z.\\k.G) (\\a.(\\o.q (\\u.Z)) (\\d.\\r.\\i.r))))) P) (\\j.\\d.\\d.e r (d (d (\\k.k) f c ((\\t.I d) (u r (Y T) (O (\\i.G))))) i) R)",
      "v (y (\\q.N (\\f.\\l.E (\\y.\\d.\\z.\\k.G))) P) (\\j.\\d.\\d.e r (d (d (\\k.k) f c (I d)) i) R)"
    );
  }

  @Test
  public final void test132() {
    reducesTo(
      "\\i.w ((\\x.\\f.(\\k.\\x.(\\s.\\j.\\u.t) (\\f.(\\g.P) (p e)) (\\r.E (\\h.\\o.h))) (\\t.\\e.\\u.(\\b.h z) (\\k.\\z.\\a.(\\w.s) p)) ((\\a.c) (\\v.k)) (\\q.(\\o.(\\o.K) (\\p.\\c.\\g.h)) (\\s.\\o.\\t.\\r.(\\v.n) (u D)) (\\g.V) J)) (X (j (\\p.y r C)) (D (\\r.\\t.\\u.m B)) y)) (\\l.(\\h.\\u.\\m.u) ((\\n.\\y.(\\a.z) y Y ((\\e.G v (b c)) (\\z.g y (\\d.P)))) (\\z.(\\w.\\l.(\\x.n) j (\\y.\\o.v)) (y R (y w) ((\\n.u) (\\u.S)))) C ((\\j.c (K q)) (h (\\w.\\m.\\j.(\\v.H) c ((\\t.\\s.P) (k k b))))) (\\i.b)))",
      "\\i.w (\\f.t) (\\l.\\u.\\m.u)"
    );
  }

  @Test
  public final void test133() {
    reducesTo(
      "\\w.B (\\s.(\\e.(\\g.(\\f.\\k.z) ((\\o.h l (\\t.a)) w (\\q.U (x h (n Z)))) (q (\\h.u))) ((\\o.\\h.E) ((\\h.\\z.\\r.P k (\\k.c) K) (\\z.w p)) (\\c.p))) (d (\\e.k)) (l (\\m.l)))",
      "\\w.B (\\s.z (l (\\m.l)))"
    );
  }

  @Test
  public final void test134() {
    reducesTo(
      "\\w.(\\w.\\p.\\z.\\p.W) X",
      "\\w.\\p.\\z.\\p.W"
    );
  }

  @Test
  public final void test135() {
    reducesTo(
      "(\\r.\\t.(\\p.n ((\\v.(\\i.b) (\\l.(\\k.d C (\\j.j)) (C (\\j.v)) ((\\b.w) (\\q.\\w.\\v.X)))) q)) (\\y.\\f.l (\\w.j) ((\\m.w) (\\z.\\i.\\c.(\\q.c (\\c.\\c.d)) (i (G (P y))))) (X u ((\\b.\\a.\\c.(\\h.\\j.y) a) (\\g.(\\q.\\d.z k) (\\r.(\\o.g) z))) ((\\s.(\\g.(\\y.q) (Q c)) (j (T k))) ((\\x.\\v.j) (\\l.\\z.\\d.a)) (\\y.n)))) (\\r.\\u.(\\t.Q) ((\\w.h) ((\\b.\\h.y) (\\g.\\o.\\a.z) (\\o.T))))) (\\x.I)",
      "\\t.n (b) (\\r.\\u.Q)"
    );
  }

  @Test
  public final void test136() {
    reducesTo(
      "R ((\\b.\\x.E) (\\a.\\g.\\o.h p (\\t.(\\n.p h (\\d.g)) (\\h.\\v.c) ((\\y.t) (\\n.Y)) r) A ((\\a.v ((\\w.O) E (\\d.h) (\\f.(\\o.L) (\\v.O) (g t (\\i.g))) (v s t (\\w.(\\r.x) i) g))) m)))",
      "R (\\x.E)"
    );
  }

  @Test
  public final void test137() {
    reducesTo(
      "\\g.(\\v.\\t.(\\t.x (e (t (M (\\g.z)) y))) (u (\\k.s))) q",
      "\\g.\\t.x (e (u (\\k.s) (M (\\g.z)) y))"
    );
  }

  @Test
  public final void test138() {
    reducesTo(
      "\\r.d",
      "\\r.d"
    );
  }

  @Test
  public final void test139() {
    reducesTo(
      "\\e.y (\\e.w) (\\m.u)",
      "\\e.y (\\e.w) (\\m.u)"
    );
  }

  @Test
  public final void test140() {
    reducesTo(
      "\\w.t",
      "\\w.t"
    );
  }

  @Test
  public final void test141() {
    reducesTo(
      "\\d.(\\t.\\h.\\q.(\\q.l) (\\c.B (u (\\e.r)))) (\\e.\\b.k j)",
      "\\d.\\h.\\q.l"
    );
  }

  @Test
  public final void test142() {
    reducesTo(
      "a (\\b.P (\\n.b))",
      "a (\\b.P (\\n.b))"
    );
  }

  @Test
  public final void test143() {
    reducesTo(
      "\\q.\\i.\\x.L (\\g.(\\w.w s) (S I)) (\\f.D)",
      "\\q.\\i.\\x.L (\\g.S I s) (\\f.D)"
    );
  }

  @Test
  public final void test144() {
    reducesTo(
      "(\\q.j ((\\d.(\\t.\\v.c (g M)) ((\\c.B) ((\\h.k) (R (\\f.(\\i.n) q))))) (g (\\t.E (\\m.n))) ((\\u.(\\g.b (\\b.(\\j.U) M)) (s (\\o.k) w) (\\p.\\c.\\j.\\g.p (\\j.y (\\b.w)))) y ((\\e.H) ((\\n.(\\n.d (t w)) (\\f.\\x.z v) ((\\w.A h (n g)) W)) (\\t.j (d a (G u) (\\x.(\\y.n) (\\u.u))))))))) (\\c.\\v.(\\w.\\n.f) (\\g.A (\\z.\\m.r) (\\m.(\\x.\\d.\\v.\\i.u) f) c ((\\s.\\n.\\o.K) ((\\e.(\\n.\\q.H) c) (z E)))))",
      "j (c (g M))"
    );
  }

  @Test
  public final void test145() {
    reducesTo(
      "(\\r.\\o.(\\r.\\b.h) (\\i.\\e.m ((\\c.\\t.\\j.J) ((\\a.G) h) (x x (\\m.m) k)) (\\f.(\\o.\\g.(\\c.\\g.I z) (\\e.R) ((\\e.u) p w)) (\\s.A))) g) ((\\u.(\\p.E) ((\\d.F ((\\a.(\\m.M) (m I)) (\\a.(\\t.e) (k h))) (e (E (N e (\\d.g))))) d)) (K (\\s.g ((\\y.(\\f.l) ((\\r.B) (h p))) e (\\h.u))))) (y i)",
      "h"
    );
  }

  @Test
  public final void test146() {
    reducesTo(
      "\\x.(\\f.\\h.\\e.\\h.d) ((\\c.\\h.\\j.\\w.\\z.(\\a.c) ((\\i.\\q.(\\z.Y (\\t.G)) (\\f.y c (\\g.i)) ((\\l.\\q.e) (\\b.D f (m E))) ((\\t.\\h.T) Z (\\t.v (G (\\h.z))))) (w ((\\w.\\o.(\\f.\\d.i) (d m W)) C)))) (\\i.\\f.\\o.S) (\\f.j (q (\\j.(\\r.\\d.(\\z.v w ((\\n.y) (\\z.F)) P) (\\l.(\\t.(\\w.r) U ((\\b.F) (\\o.Z))) (\\b.\\p.r (k D (\\w.O))))) (\\j.e ((\\s.C) ((\\t.D) (k a))) v)))))",
      "\\x.\\h.\\e.\\h.d"
    );
  }

  @Test
  public final void test147() {
    reducesTo(
      "(\\i.\\c.u) n",
      "\\c.u"
    );
  }

  @Test
  public final void test148() {
    reducesTo(
      "(\\q.q) ((\\b.\\m.Q (\\j.o)) (\\v.e (\\r.(\\n.q (\\x.\\m.\\o.j)) g) ((\\k.\\u.z) (\\v.\\c.a) (\\c.\\e.(\\x.k) (\\l.b) (\\i.\\i.j)) x) (P (\\i.O) (h b (\\n.P)) (d (S (\\p.L))) ((\\b.\\z.c i) (\\x.g (\\m.h)) (\\h.\\l.\\v.(\\u.\\i.i) (\\i.\\f.D))) X)) ((\\q.c (\\b.\\a.y)) (\\g.F (s (c s) (J f (\\z.e)))) ((\\k.\\g.\\n.e) (\\o.(\\r.\\a.k) (\\r.p (w T))) W) E ((\\k.\\f.g) (\\a.o))))",
      "Q (\\j.o)"
    );
  }

  @Test
  public final void test149() {
    reducesTo(
      "(\\b.d (\\c.(\\p.E (\\p.\\n.a)) (D (b (\\w.R (\\y.J) (H o (f i)) (\\d.k j (\\e.r) (\\a.g)))) (\\s.\\u.\\f.w)))) (\\e.(\\t.A i) P (\\d.(\\z.\\d.(\\h.o) j) (\\h.p) (\\v.\\c.(\\s.C (\\e.T)) (\\a.i))))",
      "d (\\c.E (\\p.\\n.a))"
    );
  }

  @Test
  public final void test150() {
    reducesTo(
      "H ((\\k.y) s) w",
      "H (y) w"
    );
  }

  @Test
  public final void test151() {
    reducesTo(
      "\\m.\\d.\\t.D",
      "\\m.\\d.\\t.D"
    );
  }

  @Test
  public final void test152() {
    reducesTo(
      "(\\n.b (\\r.(\\e.(\\g.i) (z N (\\g.(\\g.o l n) (\\m.\\a.\\s.Y)))) ((\\u.t ((\\r.i) (\\o.o))) (m F) (o (\\y.(\\w.\\b.x c) ((\\i.t) (z C))))) (e (\\t.D ((\\j.E) U (\\l.\\z.C d)) (\\s.\\r.k (\\y.y) ((\\h.\\l.I i) (\\k.L z)))))) ((\\x.(\\g.(\\l.\\w.\\s.\\f.a (\\v.\\o.W)) p) (\\m.\\v.y a) (\\q.(\\j.x) W)) (\\n.v t))) (\\l.\\z.(\\w.q ((\\b.Y) (\\k.\\o.U))) V q (\\z.q (\\v.w) W ((\\w.\\o.\\m.v m) (\\y.(\\x.\\p.l) (\\w.(\\q.\\y.\\b.\\q.s) ((\\f.h i) (V N (\\s.u)))))) (\\g.(\\j.Y) ((\\o.(\\f.K) t ((\\j.w) E) c (\\g.\\u.\\d.Z)) (\\p.\\n.\\b.(\\t.\\x.\\j.E) (\\r.i) y (\\o.(\\n.c) q))))))",
      "b (\\r.i (e (\\t.D (E (\\l.\\z.C d)) (\\s.\\r.k (\\y.y) (\\l.I i))))) (\\s.\\f.a (\\v.\\o.W))"
    );
  }

  @Test
  public final void test153() {
    reducesTo(
      "\\d.x",
      "\\d.x"
    );
  }

  @Test
  public final void test154() {
    reducesTo(
      "\\n.v w (\\j.\\p.\\q.H t s r (\\x.i) y)",
      "\\n.v w (\\j.\\p.\\q.H t s r (\\x.i) y)"
    );
  }

  @Test
  public final void test155() {
    reducesTo(
      "F ((\\p.\\w.(\\q.f ((\\y.\\b.e R) q ((\\h.\\c.w) ((\\i.u) d)) (p (\\d.d)) ((\\w.i q) r ((\\i.\\p.(\\x.n) (\\c.u)) d)))) (c ((\\r.X) (\\q.\\d.c ((\\z.\\c.b) (\\g.(\\m.g) (\\s.p)) o))))) (\\p.\\z.u))",
      "F (\\w.f (e R (\\z.u) (i (c (X)) (\\p.n))))"
    );
  }

  @Test
  public final void test156() {
    reducesTo(
      "\\v.(\\f.\\b.(\\l.\\k.h f ((\\w.t) y)) a) (\\k.i) (g ((\\t.\\t.M) (q K (\\x.y)) (k (\\x.(\\b.W) (\\z.E))) f) (c (Y e G (\\t.P)) (\\g.\\r.o ((\\w.(\\z.M) (\\w.u)) (i (a v))) (\\d.B))) (\\g.\\z.\\b.(\\r.\\l.(\\o.(\\d.(\\a.l) (\\k.\\u.\\f.j) z) ((\\c.\\q.\\q.J) N c)) (\\o.T)) (\\j.M ((\\w.\\h.X) D) (\\c.\\z.\\d.z))) ((\\m.(\\i.R) (\\s.y)) W))",
      "\\v.\\k.h (\\k.i) (t)"
    );
  }

  @Test
  public final void test157() {
    reducesTo(
      "\\x.\\o.T",
      "\\x.\\o.T"
    );
  }

  @Test
  public final void test158() {
    reducesTo(
      "\\t.\\k.e",
      "\\t.\\k.e"
    );
  }

  @Test
  public final void test159() {
    reducesTo(
      "(\\f.\\h.(\\u.\\u.q) j j (\\l.\\c.\\b.\\g.(\\x.(\\o.(\\u.q) ((\\x.\\b.\\w.r) (\\b.h (d w (m i))))) (\\l.w)) (\\d.(\\p.\\s.x) (c K Q)))) ((\\r.j y) (m (\\r.t) (c (X O) x) (v f (\\u.t) (\\o.\\s.j W (\\j.q) (t O (\\z.b))))) ((\\h.M n (\\o.e) (\\c.i (j j)) L) (a (\\n.\\t.d)) ((\\h.h) ((\\n.G) (\\c.\\e.g q)) n)) (x (H (\\h.\\y.(\\y.\\u.\\u.\\a.\\x.\\f.\\z.y (\\s.\\a.w)) ((\\p.\\c.b) (\\z.(\\m.N) (\\f.q)) (\\t.W (\\v.(\\e.a) (r q)))))))) R",
      "q (\\l.\\c.\\b.\\g.q)"
    );
  }

  @Test
  public final void test160() {
    reducesTo(
      "(\\m.\\m.\\e.\\b.Z (\\w.h)) h z (\\p.f (s l))",
      "\\b.Z (\\w.h)"
    );
  }

  @Test
  public final void test161() {
    reducesTo(
      "(\\y.(\\a.(\\s.q) (A (\\f.\\o.\\y.\\p.\\k.m) (j C D) (C (\\a.\\l.e) (y o (\\i.p) j ((\\q.\\a.S L) (H k))) (y (\\o.\\q.(\\n.\\a.k) (\\r.O d)) ((\\u.o) y))))) (\\n.\\n.\\d.\\x.r)) ((\\s.(\\j.Q) d) (T (\\m.(\\v.(\\k.\\l.\\l.\\z.B) (\\u.p (B (\\q.i)))) k)) (v f) (\\i.\\k.(\\j.j) (\\n.\\q.(\\g.Q F) ((\\h.t) c)) (\\u.r) (i (G N (\\t.t) ((\\k.q) (\\e.g))) (\\d.\\m.b A A (\\u.h (\\a.x)) ((\\u.\\b.z p) (\\w.m)))) (F (h n)) (\\j.n)))",
      "q"
    );
  }

  @Test
  public final void test162() {
    reducesTo(
      "\\o.\\a.\\e.(\\x.(\\a.\\t.\\s.\\n.r (\\h.\\d.\\r.(\\u.Z) w (\\m.(\\n.\\c.P z) (\\j.(\\w.v) I)) ((\\g.o) (F t) (\\d.\\s.b) (U v)) (a (\\y.T))) (\\w.\\d.W ((\\e.(\\a.\\t.(\\e.D) (\\q.a) (q y (E p))) (k (\\x.I))) (\\g.M) ((\\r.r (h I) K) j K)))) z) (\\x.q)",
      "\\o.\\a.\\e.\\t.\\s.\\n.r (\\h.\\d.\\r.Z (\\m.\\c.P z) (o (\\d.\\s.b) (U v)) (z (\\y.T))) (\\w.\\d.W (D (q y (E p))))"
    );
  }

  @Test
  public final void test163() {
    reducesTo(
      "\\w.\\u.(\\t.\\u.z) (\\k.\\b.k) (\\g.\\h.(\\m.(\\q.V ((\\v.S ((\\w.(\\p.\\x.\\p.c) (\\b.\\i.f b)) (l (\\h.L (\\h.J))))) c)) (\\c.\\n.\\h.(\\d.(\\b.\\o.\\x.l) (\\w.(\\i.\\h.\\k.y D (u g)) (g j i (\\v.\\z.a)))) (\\g.a (\\g.\\p.n (\\b.a) H (\\f.\\r.S ((\\o.d) (\\d.l))))) A)) A)",
      "\\w.\\u.z"
    );
  }

  @Test
  public final void test164() {
    reducesTo(
      "(\\a.\\r.(\\n.\\c.(\\x.\\u.\\s.\\x.(\\f.H) (O (\\v.y)) (l (z (\\y.\\t.\\w.b)))) g) q) (\\b.j)",
      "\\r.\\c.\\u.\\s.\\x.H (l (z (\\y.\\t.\\w.b)))"
    );
  }

  @Test
  public final void test165() {
    reducesTo(
      "\\j.\\f.\\o.m",
      "\\j.\\f.\\o.m"
    );
  }

  @Test
  public final void test166() {
    reducesTo(
      "\\t.\\m.(\\m.\\f.g (g ((\\u.\\d.\\z.d (S ((\\f.a L (\\y.V)) (v V (\\u.Q)) (\\v.\\d.S ((\\u.y) (\\k.k)))))) ((\\u.(\\y.\\i.\\l.X) (\\p.\\f.W)) c)))) (\\m.l)",
      "\\t.\\m.\\f.g (g (\\d.\\z.d (S (a L (\\y.V) (\\v.\\d.S (y))))))"
    );
  }

  @Test
  public final void test167() {
    reducesTo(
      "\\f.(\\c.g) (\\p.E)",
      "\\f.g"
    );
  }

  @Test
  public final void test168() {
    reducesTo(
      "\\e.(\\u.w) ((\\c.\\k.t ((\\k.(\\n.(\\a.(\\v.j J) (h o (\\u.c))) (\\f.C (\\t.p w))) r) (\\y.(\\c.\\w.h) ((\\d.(\\g.l) O) f (\\d.(\\n.e u Y) (D W (\\a.U))))))) ((\\p.\\b.(\\p.T h m) (n (\\l.I)) G (\\x.S)) (\\o.(\\f.K (\\n.w) (b U (\\j.P)) R) (g (T c (\\l.a)) J)) (\\w.e))) (b (\\d.t))",
      "\\e.w (b (\\d.t))"
    );
  }

  @Test
  public final void test169() {
    reducesTo(
      "\\z.\\j.(\\j.(\\n.\\d.\\v.(\\a.c) (\\s.(\\p.(\\a.\\t.b) (\\m.W)) (\\j.I)) (\\d.\\p.M c)) (\\f.v (k m (d s)) ((\\f.L d (\\j.l)) (L (U o))) t ((\\t.Y k (\\n.t) ((\\u.x) t)) (f ((\\y.P) (\\f.U))) T))) ((\\e.x Q) (\\d.c) (k ((\\h.\\g.t X d z ((\\f.p) ((\\y.e) (n W)))) (v r ((\\a.D) m) R)))) (\\g.(\\d.\\y.(\\u.l) ((\\c.D) (\\j.e)) (w w)) (\\e.(\\k.\\s.\\r.\\b.m (\\k.\\r.d)) (\\j.g) (\\b.(\\b.Z) ((\\q.(\\d.d) (\\i.H) (\\j.\\u.p r)) (s (U Q (\\k.g)))) (\\w.(\\x.\\t.\\u.(\\o.\\n.i) (\\x.u f) (\\r.w (\\w.v B))) v)))) (\\x.P)",
      "\\z.\\j.c (\\d.\\p.M c)"
    );
  }

  @Test
  public final void test170() {
    reducesTo(
      "\\s.\\g.(\\c.(\\u.\\j.\\z.J ((\\k.B) (\\s.(\\g.K) (e a (\\p.p)) (h (m L (\\f.G)))))) (m (\\y.p) (\\u.T (\\l.e)) e (\\k.b))) (\\g.\\x.d) (\\x.(\\i.(\\p.m (\\y.E) (j r (\\k.X))) (\\i.\\c.M (\\k.T a)) (\\u.\\g.\\f.Y (\\z.\\d.\\f.O (\\t.G))) y (\\u.\\p.V (n (\\l.z)) (\\a.(\\q.\\v.\\d.h (n p)) ((\\i.H) (n M) (\\g.b))) (\\p.(\\i.x) i h ((\\y.d (z a) (\\m.(\\e.u) i)) (\\v.(\\y.r) (\\u.I) ((\\a.m) (\\i.g))))))) k) (\\z.(\\a.\\g.(\\r.Y) ((\\f.(\\g.(\\g.g W (w c) O) (D (\\d.h m (\\g.P)))) (i (\\w.o)) (\\n.\\z.(\\r.q j W) (\\r.F l (\\l.q)) (y (\\f.\\t.\\k.d)) (d (z Y) J ((\\q.\\p.\\t.Q) (H r (y I)))))) ((\\o.\\y.\\s.(\\l.q) (\\x.V (\\l.N) ((\\s.k) d))) (\\s.r) ((\\b.p) (\\o.r g (\\t.t)) (t (i k) l) f)))) (\\l.\\v.\\v.(\\c.(\\s.(\\m.(\\s.\\e.(\\p.q) (\\w.s N)) (t z (\\m.n) a)) (\\t.H (\\o.\\d.G)) (\\m.E)) ((\\e.c) ((\\t.J (w M)) (s (\\s.n))) (\\a.\\d.(\\v.(\\y.f) (w e) ((\\r.j) (\\c.n))) (b (\\h.\\w.\\t.o))) ((\\e.(\\n.w) (\\h.d) (\\f.\\s.\\e.t)) (\\a.N) (R (\\q.f) l (n b z (\\y.(\\v.f) (l i))))))) (\\l.\\a.(\\r.\\x.\\w.k) (\\q.(\\z.v) (\\g.\\s.a e (\\p.p) (\\p.w) ((\\w.(\\r.L) (s D)) (z z (\\o.R)))) (\\t.V)))))",
      "\\s.\\g.J (B)"
    );
  }

  @Test
  public final void test171() {
    reducesTo(
      "(\\i.\\u.\\g.\\z.\\k.s) ((\\u.I r) (\\b.V (\\j.(\\o.(\\z.(\\c.(\\r.g X (\\d.y)) (m b R)) (\\n.\\e.(\\i.b) (h t) (m W))) (\\n.o d (K i) (f (m b)) z) n) (\\g.L))))",
      "\\u.\\g.\\z.\\k.s"
    );
  }

  @Test
  public final void test172() {
    reducesTo(
      "\\y.\\b.U",
      "\\y.\\b.U"
    );
  }

  @Test
  public final void test173() {
    reducesTo(
      "(\\w.h (\\g.m ((\\q.t (U P)) (k v (c z)) (\\m.\\a.\\o.e (\\u.s W)) ((\\i.\\s.\\m.f) e ((\\l.E N (\\c.X)) z))) (\\m.c))) (\\w.(\\r.x) (\\q.y)) (\\x.G (T ((\\u.(\\h.\\z.i) w (\\a.\\d.\\n.\\a.(\\a.(\\h.e) ((\\k.d) (\\i.e))) (\\b.\\l.C))) c ((\\s.k a (q l) (\\v.\\o.k n) ((\\i.w) (D N) (\\t.(\\r.K) (\\a.z))) (v q)) ((\\d.(\\b.\\m.\\r.i y (f Z) (\\n.l)) (T ((\\c.H) (\\q.T)))) (\\w.v))))))",
      "h (\\g.m (t (U P) (\\m.\\a.\\o.e (\\u.s W)) (\\m.f)) (\\m.c)) (\\x.G (T (i (k a (q l) (\\v.\\o.k n) (w (\\t.K)) (v q)))))"
    );
  }

  @Test
  public final void test174() {
    reducesTo(
      "(\\s.d (\\n.t) ((\\a.(\\p.\\c.(\\e.\\r.\\q.(\\m.i) (o r) t ((\\z.\\q.d) E)) ((\\r.(\\m.h) J N) s)) (\\s.\\a.(\\e.(\\i.U (\\q.d) ((\\x.b) (\\n.C))) (a (\\a.m) ((\\r.K) (Q x)))) n)) X ((\\e.(\\w.n (\\f.\\m.\\h.Z)) ((\\g.t) (A l) (\\d.\\v.a a) ((\\j.(\\d.Y) (\\q.L)) (Z (\\j.V)))) s) (\\y.e (\\m.q) K)))) ((\\a.\\l.\\u.\\v.\\w.(\\w.\\d.d t S (\\l.l) (Z d (J C) (R p (g a)))) F) (\\n.\\p.i l) (\\e.(\\d.\\e.\\e.\\d.(\\p.i (\\i.O)) (\\q.T (z c (\\e.Q)))) (\\g.k) (\\i.o (\\b.a b (S c)) (\\w.(\\k.n) m ((\\s.j) (Q R))) (\\a.K ((\\t.\\g.Z v) ((\\m.J) T))))) ((\\k.\\m.\\g.t (\\p.t) ((\\v.q) (\\g.\\v.\\j.(\\i.\\k.\\m.\\a.\\t.d) q))) v) t)",
      "d (\\n.t) (\\r.\\q.i t (\\q.d))"
    );
  }

  @Test
  public final void test175() {
    reducesTo(
      "\\i.i",
      "\\i.i"
    );
  }

  @Test
  public final void test176() {
    reducesTo(
      "V ((\\i.I f ((\\o.o (\\v.\\w.V h)) v)) h)",
      "V (I f (v (\\v.\\w.V h)))"
    );
  }

  @Test
  public final void test177() {
    reducesTo(
      "(\\l.J) (\\v.\\c.\\e.M ((\\z.x ((\\f.a) (R b))) (\\a.\\t.\\q.(\\p.T n) (d (\\m.j))) ((\\r.(\\l.x) (\\b.f) i) (H i)) (\\j.(\\v.\\e.(\\k.(\\z.j) (\\l.o)) V ((\\b.(\\d.z) (\\e.d)) (\\o.\\m.\\o.j))) ((\\r.N) (\\c.m) (\\s.(\\q.p) (V x)) x))) (w e ((\\u.Y) e)) (j V))",
      "J"
    );
  }

  @Test
  public final void test178() {
    reducesTo(
      "\\a.\\h.\\e.(\\f.\\v.T) ((\\s.(\\d.\\r.\\r.(\\a.t) (\\q.\\o.b S) (\\v.d) C) (\\a.y)) n (\\g.o) (\\n.\\g.\\b.l))",
      "\\a.\\h.\\e.\\v.T"
    );
  }

  @Test
  public final void test179() {
    reducesTo(
      "u (f ((\\h.r) (\\u.\\r.\\r.i g (\\m.U)) y) (\\c.h ((\\d.R (\\e.o)) (\\e.\\q.r z)) ((\\k.m) r U) (m (\\i.M (\\y.O) E)) ((\\w.(\\s.g) ((\\x.p) (\\z.Z))) g (\\f.W) (d (\\u.d) ((\\r.U) (B h) B (\\s.G (\\v.\\g.d s))))) (o (\\e.w ((\\d.B) (\\z.k))))))",
      "u (f (r y) (\\c.h (R (\\e.o)) (m U) (m (\\i.M (\\y.O) E)) (g (\\f.W) (d (\\u.d) (U B (\\s.G (\\v.\\g.d s))))) (o (\\e.w (B)))))"
    );
  }

  @Test
  public final void test180() {
    reducesTo(
      "W ((\\t.\\v.E) ((\\c.\\b.R ((\\t.i) (i h)) (\\e.(\\n.A) d l) k (\\z.\\n.\\i.m) P) ((\\i.\\v.\\n.\\x.(\\o.\\w.w) (\\a.\\e.O w A)) ((\\x.(\\v.z) (g x) (q (\\y.t)) w) (\\l.J b ((\\s.(\\m.F) J) (u g (\\e.d)))) (\\k.\\b.\\c.t)))))",
      "W (\\v.E)"
    );
  }

  @Test
  public final void test181() {
    reducesTo(
      "\\m.\\t.(\\u.e ((\\e.k) (\\j.\\f.A)) (\\l.\\l.b)) (s ((\\p.(\\p.(\\l.R (p u (\\h.k))) (e (\\f.n)) ((\\i.x h (\\y.y) M) y) G) (a (\\j.\\e.\\l.l z (\\g.T y P V) (\\g.\\n.p (\\f.v p) (\\u.g))))) F))",
      "\\m.\\t.e (k) (\\l.\\l.b)"
    );
  }

  @Test
  public final void test182() {
    reducesTo(
      "\\r.\\h.\\w.e",
      "\\r.\\h.\\w.e"
    );
  }

  @Test
  public final void test183() {
    reducesTo(
      "\\u.x",
      "\\u.x"
    );
  }

  @Test
  public final void test184() {
    reducesTo(
      "u ((\\k.(\\q.a) ((\\h.\\p.b (\\l.\\v.\\x.f)) (\\i.(\\n.(\\c.\\i.s q) (\\v.\\a.Q)) (\\i.\\x.T)))) (\\p.q) ((\\w.u q (g ((\\x.W) (\\z.\\o.\\d.L) ((\\g.\\s.e D) (n Z D))))) (o (\\t.\\r.k) (\\j.\\y.\\m.\\y.B (\\p.y (\\a.W B)) r)))) t",
      "u (a (u q (g (W (\\s.e D))))) t"
    );
  }

  @Test
  public final void test185() {
    reducesTo(
      "\\a.K (\\c.\\r.\\y.\\t.J P) t (\\r.Y)",
      "\\a.K (\\c.\\r.\\y.\\t.J P) t (\\r.Y)"
    );
  }

  @Test
  public final void test186() {
    reducesTo(
      "\\v.(\\i.\\w.(\\e.\\h.(\\x.y) y) z) (\\m.(\\u.\\h.\\j.\\d.F) u (\\v.\\f.(\\v.(\\m.o) (e m) (\\m.\\s.\\s.i) (c (h k) (V o (V V)))) z M h) b)",
      "\\v.\\w.\\h.y"
    );
  }

  @Test
  public final void test187() {
    reducesTo(
      "\\l.\\p.g",
      "\\l.\\p.g"
    );
  }

  @Test
  public final void test188() {
    reducesTo(
      "(\\p.(\\t.(\\c.\\p.\\i.\\b.(\\v.z R ((\\x.\\s.w) (\\l.p)) U) u) (\\r.(\\o.A (\\j.r)) (\\b.\\z.\\m.(\\a.g) (\\y.s) a o) (N (\\e.\\d.\\j.\\p.\\g.v e j) ((\\c.R) (\\a.m) (p k (q a)) g)) ((\\o.\\v.\\z.\\n.(\\z.\\c.\\u.\\t.y R) ((\\j.w r) e)) ((\\u.\\l.b a) (\\m.\\e.\\a.u) (\\e.t Z (g e) (\\n.\\i.\\s.o))) (\\x.(\\i.F) w (\\e.\\w.u))))) ((\\d.p) ((\\l.G) (\\t.Y) ((\\k.t) N)) (\\r.U ((\\t.g) (N u) (e r x))) (\\g.\\d.\\f.(\\a.(\\r.i ((\\y.v) (B a))) (\\i.a x (O j) (v H (\\u.N)))) (\\h.v)) ((\\n.\\r.(\\g.y) (E (\\i.y))) (\\q.c)) c)) (H ((\\i.\\d.\\u.\\f.(\\a.w) (\\k.t) y) (f i (\\p.h ((\\z.\\n.\\x.h) (q v (\\s.f) ((\\i.D) a)))))) (\\c.(\\p.(\\x.(\\v.\\t.H) (\\c.H)) (\\w.n (\\w.(\\r.\\a.(\\p.\\s.Q) (\\m.z)) ((\\q.\\e.\\k.k) (u I (\\y.t)))))) (\\l.(\\a.\\w.\\f.T) n) (\\p.(\\f.\\j.(\\u.N) (t v) (p (z b)) (\\l.B) (\\t.\\l.(\\i.\\t.\\c.\\a.(\\v.y) (f J)) (L m (\\z.s) O)) ((\\z.G f (L h)) W ((\\w.\\q.\\s.d) ((\\w.x) (x z))) (\\s.\\k.\\j.(\\t.\\n.\\r.\\l.\\p.U) (h (H u) (W n))))) (X ((\\q.(\\m.e) (\\p.\\s.t)) (\\r.\\t.(\\r.d) (U p) (b n (u h)))) (U p)))))",
      "\\p.\\i.\\b.z R (\\s.w) U"
    );
  }

  @Test
  public final void test189() {
    reducesTo(
      "(\\d.\\v.\\h.\\d.X (\\y.y)) (\\j.\\u.g ((\\g.\\n.(\\g.(\\w.(\\y.k) h) (i (L j)) (\\l.\\t.X) (S (k w) (\\h.\\v.L h) (\\o.\\z.E))) (h ((\\y.o (\\s.P) Y) y)) F) ((\\l.j) (\\q.w ((\\w.\\x.(\\n.i c) (\\u.\\f.Q)) (z O x))) ((\\w.\\b.l ((\\i.\\g.a (\\x.J f)) ((\\a.b) w (\\m.\\h.q Q)))) ((\\d.o) ((\\n.e) (u O)) (\\u.Y) i)))))",
      "\\v.\\h.\\d.X (\\y.y)"
    );
  }

  @Test
  public final void test190() {
    reducesTo(
      "\\t.m",
      "\\t.m"
    );
  }

  @Test
  public final void test191() {
    reducesTo(
      "\\c.v ((\\l.\\j.(\\z.\\b.(\\k.N e) (\\j.(\\p.Q) (W G)) l e) U (\\r.\\m.(\\m.k) (\\c.z)) a) f)",
      "\\c.v (\\j.N e f e a)"
    );
  }

  @Test
  public final void test192() {
    reducesTo(
      "\\j.d",
      "\\j.d"
    );
  }

  @Test
  public final void test193() {
    reducesTo(
      "\\n.\\z.\\q.\\q.f (V ((\\k.u) g) (\\x.\\e.\\n.\\b.\\i.c) ((\\g.\\i.l) (\\t.\\u.\\h.u)))",
      "\\n.\\z.\\q.\\q.f (V (u) (\\x.\\e.\\n.\\b.\\i.c) (\\i.l))"
    );
  }

  @Test
  public final void test194() {
    reducesTo(
      "(\\i.\\b.Z) p",
      "\\b.Z"
    );
  }

  @Test
  public final void test195() {
    reducesTo(
      "\\y.l x",
      "\\y.l x"
    );
  }

  @Test
  public final void test196() {
    reducesTo(
      "(\\p.(\\d.G ((\\w.U) ((\\b.\\h.\\s.X (\\y.s) ((\\e.N) (\\d.j))) (\\z.\\a.(\\e.j) (\\o.S j))))) ((\\c.\\z.\\m.Q) ((\\i.k) (Q D)) ((\\q.O) ((\\v.z) (q t))) ((\\n.(\\x.Z) (\\o.i) (X F (\\u.e))) (\\i.H)) (o (\\r.(\\l.\\w.G) i ((\\z.\\c.w) (\\o.\\a.\\s.h))))) (\\r.H)) L (g ((\\m.\\h.\\n.g) (y (\\x.i))) (\\e.\\e.\\u.\\s.(\\x.t ((\\h.(\\u.o) x (\\o.\\w.\\x.L) (e J (\\u.v) (W t (Z n)))) (v ((\\p.\\b.\\b.j) (\\r.m))))) (\\o.\\p.z) b))",
      "G (U) (\\r.H) (g (\\h.\\n.g) (\\e.\\e.\\u.\\s.t (o (\\o.\\w.\\x.L) (e J (\\u.v) (W t (Z n)))) b))"
    );
  }

  @Test
  public final void test197() {
    reducesTo(
      "(\\m.\\u.\\s.\\s.(\\s.\\e.\\a.\\i.c) (\\a.y)) (\\j.\\r.(\\d.\\s.S) (z u) q)",
      "\\u.\\s.\\s.\\e.\\a.\\i.c"
    );
  }

  @Test
  public final void test198() {
    reducesTo(
      "\\b.(\\g.\\m.X ((\\h.J G (m l)) (j r) (B (\\u.o))) (\\n.\\z.(\\f.(\\w.e) (e w)) (S j) (w (B t (Z y))) c)) ((\\s.\\t.\\l.(\\x.j) K) ((\\a.m Z) (\\w.\\l.r))) (M J) (\\j.h x (\\c.\\g.M H)) (l (\\n.\\t.x) ((\\u.o (\\u.(\\z.(\\x.K) (\\t.y r (\\t.f))) (\\w.e) (p ((\\l.N) c) (q b (s y) (z W (D v))))) ((\\j.r) ((\\a.\\b.C G) n) (\\m.(\\z.X) (\\b.(\\o.(\\e.q) (h o)) (\\h.j K) ((\\n.k) (\\c.c) (\\f.l I (\\u.Z))))))) (e (\\j.\\b.\\n.b))))",
      "\\b.X (J G (M J l) (B (\\u.o))) (\\n.\\z.e (w (B t (Z y))) c) (\\j.h x (\\c.\\g.M H)) (l (\\n.\\t.x) (o (\\u.K (p (N) (q b (s y) (z W (D v))))) (r (\\m.X))))"
    );
  }

  @Test
  public final void test199() {
    reducesTo(
      "\\t.(\\h.(\\c.p) ((\\w.\\u.(\\k.(\\a.a L (s a) P) (\\w.b) o) E l) (x N p ((\\p.\\s.c) ((\\z.h) (\\d.\\q.\\t.i))) (\\k.O)))) ((\\h.n (\\k.o (\\z.T ((\\z.u (N E)) (l z (\\x.W)) T (\\z.\\h.\\y.\\i.X))))) g)",
      "\\t.p"
    );
  }

  @Test
  public final void test200() {
    reducesTo(
      "\\q.\\n.q ((\\f.(\\m.s ((\\l.o) (\\u.l)) q ((\\g.(\\w.\\v.n a) J) (\\m.\\b.h))) (\\j.\\l.(\\o.P) (\\i.o)) ((\\s.w (p (\\x.j (\\p.d)))) (k (K q)) (\\n.\\o.\\x.M Q)) (\\e.\\t.k)) (X (\\a.(\\s.R) ((\\x.o (\\b.z)) m) ((\\e.d) (\\k.\\k.\\x.(\\c.\\j.\\z.w) ((\\g.c) (J V) (\\y.\\n.L))) ((\\y.\\b.(\\e.c M) (\\e.\\f.S)) o (\\c.K (\\p.(\\x.J) (\\j.O) R)))))))",
      "\\q.\\n.q (s (o) q (\\v.n a) (w (p (\\x.j (\\p.d))) (\\n.\\o.\\x.M Q)) (\\e.\\t.k))"
    );
  }

  @Test
  public final void test201() {
    reducesTo(
      "(\\m.\\h.(\\l.j) y) (\\b.\\d.\\y.\\h.\\u.\\k.(\\y.u) (\\j.\\k.Q) (\\d.(\\f.(\\q.(\\z.\\e.e O) (\\u.\\u.s) (L z (\\s.k) (\\o.\\t.W z))) (\\e.\\v.w)) ((\\e.(\\o.c) (\\f.z) ((\\m.X) S)) (e ((\\n.o) (\\x.b))) (p (\\s.n))) (\\m.(\\f.g) (\\w.\\o.Q) (w q r (\\l.\\o.\\i.o) (\\n.\\y.(\\v.Q c) h)) (e (X ((\\f.E) (l a)) i))) (n (\\n.\\e.j ((\\u.O (\\p.m)) g) (\\j.\\o.\\k.\\k.(\\h.c) (J L) (\\o.w k) (\\p.(\\m.\\w.C) (\\x.\\v.y)))) ((\\e.\\z.V f (\\m.n) (d k (B c)) ((\\a.i) (i T) ((\\e.y) (\\n.t))) (f (\\z.k))) ((\\i.\\q.\\s.(\\z.(\\g.i) (h i) (v m (\\t.s))) (\\v.\\r.w (\\c.x k))) ((\\w.q) V))))))",
      "\\h.j"
    );
  }

  @Test
  public final void test202() {
    reducesTo(
      "(\\o.\\n.(\\g.b) (\\t.K l ((\\r.C) (\\q.l l))) ((\\z.p) (\\c.j A g (\\b.\\e.\\l.g)) Z) (\\z.\\a.t) q ((\\a.H ((\\b.\\c.B (\\i.e b)) (\\u.d U (b x) o))) (\\w.\\g.x) ((\\r.b (\\h.r (\\c.(\\z.E) (\\s.O)))) (\\b.(\\l.\\g.(\\l.\\w.X) (\\r.i m)) n) ((\\d.\\c.x) (\\t.C (c n (\\b.k))) (m G t (\\j.\\q.A w) (\\z.\\y.(\\v.\\k.j) p)))) ((\\d.r) s (m o f) (\\v.\\c.\\m.\\e.\\q.(\\n.(\\s.b) (s b)) (\\v.w) (\\s.\\k.p C (T p) F) (\\n.O) u)))) (\\v.(\\m.U) M)",
      "\\n.b (p Z) (\\z.\\a.t) q (H (\\c.B (\\i.e (\\u.d U (b x) (\\v.U)))) (b (\\h.\\g.\\w.X) (x)) (r (m (\\v.U) f) (\\v.\\c.\\m.\\e.\\q.b (\\s.\\k.p C (T p) F) (\\n.O) u)))"
    );
  }

  @Test
  public final void test203() {
    reducesTo(
      "x t ((\\a.\\r.\\x.(\\u.\\s.u) ((\\o.\\r.F) s W)) (\\c.I ((\\k.Q (B (\\n.\\i.\\b.u) (\\i.q G (N d) N))) (\\r.\\f.\\l.\\c.(\\b.\\u.o (\\u.K) ((\\a.y) (\\d.n))) (\\z.\\r.\\e.Q (\\f.g)) ((\\p.a (\\c.U R)) (f (h (S R)))))))) v",
      "x t (\\r.\\x.\\s1.F) v"
    );
  }

  @Test
  public final void test204() {
    reducesTo(
      "p (\\t.(\\j.o) ((\\e.\\h.\\a.l (\\i.\\g.Y J (\\j.N) ((\\a.k) (\\i.y)) (\\f.(\\m.b C) (\\j.\\a.v))) S) (\\q.m)) F)",
      "p (\\t.o F)"
    );
  }

  @Test
  public final void test205() {
    reducesTo(
      "(\\r.l) w (\\d.\\m.\\i.Z) r ((\\y.z) y)",
      "l (\\d.\\m.\\i.Z) r (z)"
    );
  }

  @Test
  public final void test206() {
    reducesTo(
      "(\\u.W) ((\\d.p) ((\\w.\\c.c) (j Z))) (\\m.\\u.(\\y.D) l) (\\y.a (\\p.\\u.\\p.\\s.(\\l.(\\d.(\\y.\\j.h) (\\m.\\f.t)) (\\y.X)) k) (\\w.h ((\\a.i j ((\\q.S) (y w)) (\\f.(\\d.I) (\\s.l) w) n) (\\b.(\\q.\\x.n) (u v (\\s.l) (A p (\\w.F))) (S d z q (\\q.f)))) (\\b.\\n.(\\o.(\\m.B (\\f.(\\v.(\\k.t) s) (\\c.f u (l T)) (s ((\\e.e) (\\f.a))))) (z (\\b.(\\q.S) ((\\z.\\m.\\i.A) O)))) ((\\b.\\f.y (\\h.(\\c.s) ((\\y.y) a) ((\\f.m) (D J) (K h (o N))))) (\\q.o)))))",
      "W (\\m.\\u.D) (\\y.a (\\p.\\u.\\p.\\s.\\j.h) (\\w.h (i j (S) (\\f.I w) n) (\\b.\\n.B (\\f.t (s (\\f.a))))))"
    );
  }

  @Test
  public final void test207() {
    reducesTo(
      "Z ((\\u.o) (\\s.g)) (\\d.B)",
      "Z (o) (\\d.B)"
    );
  }

  @Test
  public final void test208() {
    reducesTo(
      "(\\m.g) E",
      "g"
    );
  }

  @Test
  public final void test209() {
    reducesTo(
      "\\c.(\\s.f) ((\\m.B) Y) v g",
      "\\c.f v g"
    );
  }

  @Test
  public final void test210() {
    reducesTo(
      "\\c.j (\\o.(\\a.(\\y.(\\u.\\r.\\n.(\\j.(\\g.n) (e M) A (\\u.\\w.\\o.C f (M g))) ((\\d.(\\e.z s) (\\v.w)) (y i))) (\\p.c)) (\\y.O)) (\\k.i) P)",
      "\\c.j (\\o.\\n.n A (\\u.\\w.\\o.C f (M g)))"
    );
  }

  @Test
  public final void test211() {
    reducesTo(
      "\\m.\\r.(\\t.\\v.\\g.\\t.x Y) ((\\c.E) D)",
      "\\m.\\r.\\v.\\g.\\t.x Y"
    );
  }

  @Test
  public final void test212() {
    reducesTo(
      "o o (u ((\\c.(\\m.\\y.w r (\\r.j) (W O s) (q (z i (i i)))) (\\y.U ((\\q.K i) (B g (\\x.i))))) (\\e.m (\\a.\\u.a t (\\p.Q s (Z T)) (\\h.l))) (\\c.l)) (W q))",
      "o o (u (w r (\\r.j) (W O s) (q (z i (i i)))) (W q))"
    );
  }

  @Test
  public final void test213() {
    reducesTo(
      "(\\y.\\l.\\j.c) i (\\c.\\y.z)",
      "\\j.c"
    );
  }

  @Test
  public final void test214() {
    reducesTo(
      "(\\t.(\\y.b) ((\\i.C) l)) (h (\\g.\\w.\\t.S)) (V b ((\\r.Q (\\c.\\e.\\l.\\o.a)) (S (\\s.(\\h.p) ((\\f.\\w.d (\\j.R)) ((\\c.\\j.\\i.(\\g.e) (\\v.n)) (\\b.\\k.X)))))))",
      "b (V b (Q (\\c.\\e.\\l.\\o.a)))"
    );
  }

  @Test
  public final void test215() {
    reducesTo(
      "(\\t.\\m.\\f.\\s.l c p) (f ((\\t.\\n.(\\v.\\b.(\\x.X g) (L b (r I))) ((\\n.e) (\\s.a) ((\\j.Y) a))) (y (\\t.(\\d.W) (\\s.l)) (\\x.\\a.c))) (b (Z j (\\n.e) ((\\u.c) (I V)) (\\w.b)) (o j))) J (\\c.\\u.(\\y.K (\\y.(\\a.(\\z.G) ((\\x.n) (\\u.S (\\p.v) (m t (A r)))) t) ((\\w.f ((\\e.U) (\\j.\\i.b))) (y (\\q.n)) (e (\\b.f (g m C) (j (X m (\\l.L)))))))) (\\x.\\v.\\u.\\h.\\c.\\o.(\\a.\\y.z K) (\\f.(\\e.\\g.\\n.l) (e (\\s.(\\w.i d) (\\v.S d (j r))) (\\m.j))) (\\b.I)))",
      "\\s.l c p"
    );
  }

  @Test
  public final void test216() {
    reducesTo(
      "\\a.\\n.(\\h.\\i.(\\v.\\u.\\p.\\o.\\b.\\b.(\\h.T) (\\g.P)) ((\\g.\\l.\\o.(\\o.\\f.b (\\o.a (\\v.\\d.i))) (\\m.w)) ((\\t.\\n.B h (\\c.w) (m B (h h)) (C (\\p.g R (i P)))) (\\m.d (\\x.f) (\\j.\\y.q M) (\\x.\\h.\\v.\\j.\\v.\\d.g)) (\\f.(\\o.c ((\\l.g) u ((\\l.g) (\\v.m)))) (\\m.N))) (\\o.y g ((\\m.(\\m.v Q h) (\\x.n)) (\\o.\\w.e (\\v.e) ((\\c.b) (S w)))) y ((\\e.\\j.n (\\q.\\h.(\\n.D f (\\l.p) ((\\r.N) (t o))) (\\n.(\\w.P) N (\\u.R c)))) (\\g.(\\b.N (\\q.(\\u.z) (\\r.n I))) (\\s.u j)))))) (\\q.(\\c.\\a.\\x.n (\\p.\\x.n)) (\\h.i ((\\v.\\w.h) ((\\b.q) (\\m.A (Y J)) (\\n.q e (\\j.t) s) (\\m.(\\z.\\o.(\\x.i V) C) G) ((\\x.h) r ((\\i.p) f) ((\\p.G) (N e) (\\p.P)) (m (\\y.(\\j.i) q (\\e.q))))))))",
      "\\a.\\n.\\i1.\\u.\\p.\\o.\\b.\\b.T"
    );
  }

  @Test
  public final void test217() {
    reducesTo(
      "E ((\\p.\\g.k) ((\\n.o) (\\g.E)) (\\p.\\l.\\d.U (\\w.c J)) ((\\v.(\\y.\\p.B I) b) z) (\\o.j L (\\l.(\\p.p) (\\s.A) (\\h.\\c.\\x.y)) (\\s.\\t.(\\k.\\z.\\i.\\l.U) (\\t.(\\t.m e) (a I (\\f.y))))) (n (\\h.\\r.(\\i.k) d ((\\k.\\n.h D) ((\\t.M) (D F)))) ((\\i.x) ((\\x.(\\v.i) (o a)) (\\t.i)) (\\k.(\\e.\\e.\\g.j) (\\g.o)))) (s (\\e.P)) (U i))",
      "E (k (\\p.B I) (\\o.j L (\\l.A) (\\s.\\t.\\z.\\i.\\l.U)) (n (\\h.\\r.k (\\n.h D)) (x (\\k.\\e.\\g.j))) (s (\\e.P)) (U i))"
    );
  }

  @Test
  public final void test218() {
    reducesTo(
      "o (\\u.(\\v.o (\\f.x)) ((\\s.\\s.D) (r j (Q h) m) (\\j.W) ((\\q.\\j.\\p.\\n.l y ((\\p.b) ((\\s.t) (j h)))) (\\y.\\m.O (J b (H r)) (\\d.X y (\\d.U) (\\x.y O))))) W (\\c.\\j.u g (\\w.V)))",
      "o (\\u.o (\\f.x) W (\\c.\\j.u g (\\w.V)))"
    );
  }

  @Test
  public final void test219() {
    reducesTo(
      "\\e.\\e.z (\\m.(\\h.(\\f.(\\h.\\q.Q ((\\o.g (k E)) (\\o.\\g.\\y.A))) ((\\g.\\c.\\z.u H X ((\\e.O) (\\y.Y))) (e K e ((\\k.l) (\\n.f))))) (V ((\\n.y) (\\w.\\t.\\y.y)) (j (\\m.f))) (e z p p ((\\w.j) ((\\z.n) (\\x.r))) (\\v.(\\y.a) (\\p.o) ((\\g.T) (k E)) n) ((\\g.n P) (b t (\\d.G)) (d (p (\\a.g))) (\\l.l i (\\f.o) (l q) (\\u.(\\b.p) (\\j.(\\f.k) (r q))))))) ((\\z.\\p.\\v.\\t.S ((\\q.\\v.\\d.\\v.X j ((\\a.s t) (\\a.e R))) ((\\y.P) m ((\\c.A) (h H)) (\\c.\\z.o)))) k)) (\\p.(\\i.\\v.\\j.g (\\k.\\g.(\\l.\\l.\\o.(\\i.\\c.\\o.\\h.\\r.\\r.(\\u.h) (\\b.\\k.(\\j.m) (\\s.G A (h P)))) (\\v.(\\s.(\\a.X) (\\q.\\k.B)) (u ((\\u.E T A) (\\h.S))))) (\\t.a (\\i.l)))) c)",
      "\\e.\\e.z (\\m.Q (g (k E))) (\\p.\\v.\\j.g (\\k.\\g.\\l.\\o.\\c.\\o.\\h.\\r.\\r.h))"
    );
  }

  @Test
  public final void test220() {
    reducesTo(
      "(\\f.\\c.f (z ((\\s.\\d.w) (\\z.(\\a.\\z.c (\\n.D)) (b j (\\o.L) (h z (q o))))) (g (h y) (O (\\m.(\\y.(\\u.u) r) (\\s.(\\w.f) (\\f.T))) (\\e.(\\e.\\y.\\k.n) ((\\e.P) (\\o.y)) e))) (\\q.\\l.b))) (n (\\p.Q) ((\\v.v) ((\\v.n) (\\s.(\\h.v t ((\\k.o (\\q.\\w.\\r.k)) M)) (t Y)))))",
      "\\c.n (\\p.Q) (n) (z (\\d.w) (g (h y) (O (\\m.r) (\\e.\\k.n))) (\\q.\\l.b))"
    );
  }

  @Test
  public final void test221() {
    reducesTo(
      "\\v.\\j.\\i.(\\o.(\\e.n (\\h.u (J b q ((\\w.d) W) (V a) (\\l.\\d.\\n.I)))) (P (\\c.(\\b.\\e.t (e k (\\t.q)) (\\i.y (\\w.U N q)) p) (\\o.y)))) (\\y.(\\d.x ((\\j.b) ((\\s.q W (d k) (\\e.\\d.\\u.m)) (r b c (\\l.p)) (w (x V))))) (\\i.(\\p.\\w.(\\p.n) K) ((\\n.(\\n.(\\e.\\q.S k) (N g (m s)) (\\y.\\y.A)) (\\i.\\i.\\j.\\l.g)) (\\q.\\n.(\\n.(\\r.\\x.\\y.\\f.r (\\d.b)) (e (N E) (\\v.i (X l)))) v)))) (\\v.I (y s ((\\i.d) l)) (\\o.\\u.e))",
      "\\v.\\j.\\i.n (\\h.u (J b q (d) (V a) (\\l.\\d.\\n.I))) (\\v.I (y s (d)) (\\o.\\u.e))"
    );
  }

  @Test
  public final void test222() {
    reducesTo(
      "w F ((\\l.\\o.\\f.(\\y.\\e.A ((\\y.f) (m j) (\\g.\\h.\\g.f) (\\n.W)) ((\\h.(\\h.f) ((\\w.h) i) (\\u.d Y (e W) A)) (r (\\c.\\k.\\u.\\w.N)))) x) u) a",
      "w F (\\o.\\f.\\e.A (f (\\g.\\h.\\g.f) (\\n.W)) (f (\\u.d Y (e W) A))) a"
    );
  }

  @Test
  public final void test223() {
    reducesTo(
      "(\\y.\\u.Z ((\\u.v) ((\\l.(\\g.I g) (P d (k J))) (s (u (\\l.s))))) (\\p.\\v.(\\l.U) ((\\k.k) ((\\q.b E (\\i.k)) (\\e.\\q.m w))) (\\x.R)) p) x ((\\e.\\p.\\q.N) (\\i.(\\s.t) (\\j.\\w.w g (n Z) (\\h.d (\\m.o)) (\\o.\\u.\\z.\\k.M J (\\j.u)) (\\d.f (c (\\r.\\y.R i))) (m g d)) (\\v.\\e.\\n.(\\d.T) (\\w.\\t.(\\o.G (\\y.s)) b ((\\i.z) w)) (\\v.\\n.(\\w.m) ((\\s.\\l.\\t.(\\z.E) (\\r.T) A) (n V (\\y.v) (T t (\\c.A))))) x)))",
      "Z (v) (\\p.\\v.U (\\x.R)) p"
    );
  }

  @Test
  public final void test224() {
    reducesTo(
      "(\\o.\\m.(\\g.(\\z.a) w) (t ((\\h.a) b)) (e (m (\\q.D (\\s.\\w.\\t.\\n.n)) ((\\b.\\e.t d (J N) t (\\e.O)) (\\g.\\k.x) (\\b.\\f.(\\y.\\b.\\k.C) c ((\\i.(\\m.t) (\\c.c)) i) (r (\\i.F))))))) (\\e.(\\k.\\v.d ((\\p.(\\g.\\r.N) ((\\t.S) (\\k.k) (\\l.l s (\\h.A)))) (v t) (\\p.(\\x.c) ((\\t.\\o.\\e.\\l.g (N G)) (e g j ((\\q.H) (\\p.u)))))) (\\n.\\n.M)) (\\n.\\z.q (\\x.\\g.M (X (\\p.(\\z.\\c.n J) (\\o.(\\z.f) T)) ((\\v.\\q.M) (a f (V n) (j R (\\c.H))))) (\\q.\\d.\\d.o k (\\p.\\v.e (Q (\\n.S)) (\\o.\\z.\\f.(\\n.\\n.X) (\\r.c q) (\\c.d)))))))",
      "\\m.a (e (m (\\q.D (\\s.\\w.\\t.\\n.n)) (t d (J N) t (\\e.O))))"
    );
  }

  @Test
  public final void test225() {
    reducesTo(
      "\\d.\\t.n",
      "\\d.\\t.n"
    );
  }

  @Test
  public final void test226() {
    reducesTo(
      "D (\\e.\\m.\\e.Y) (\\m.k)",
      "D (\\e.\\m.\\e.Y) (\\m.k)"
    );
  }

  @Test
  public final void test227() {
    reducesTo(
      "(\\q.(\\a.p) (\\t.x)) (\\k.B) (\\s.D ((\\n.r) (\\t.e)) (u (\\q.(\\s.(\\z.(\\v.\\c.c u) u ((\\l.\\i.L d) (\\y.\\l.\\y.e))) (\\r.(\\n.R (\\u.\\k.i)) (r a s (\\z.u)))) ((\\h.G) (j C (\\g.u S (i e))) (K (\\i.p) (\\l.\\y.m P) j))) s))",
      "p (\\s.D (r) (u (\\q.L d) s))"
    );
  }

  @Test
  public final void test228() {
    reducesTo(
      "\\w.\\d.t ((\\q.n) (\\e.y x ((\\o.r) (\\o.m))))",
      "\\w.\\d.t (n)"
    );
  }

  @Test
  public final void test229() {
    reducesTo(
      "C (\\v.Z) ((\\e.\\h.\\r.\\e.J) ((\\n.w) (\\b.\\t.(\\u.(\\n.n) (\\v.(\\g.n (\\c.J)) (u z (G a))) r) ((\\l.\\v.o (\\h.\\c.W A (\\s.c) ((\\j.a) K))) g))) (\\f.g (p (r ((\\b.\\b.S) (\\a.(\\w.p (\\r.M)) (S (\\e.i)))) (y (\\d.(\\s.I) (\\x.\\w.\\f.w I (p y) c)))))))",
      "C (\\v.Z) (\\r.\\e.J)"
    );
  }

  @Test
  public final void test230() {
    reducesTo(
      "S ((\\q.(\\m.\\g.\\l.(\\l.\\l.\\r.\\e.(\\x.J) (\\d.v)) (\\p.(\\c.w r) (\\k.W M))) ((\\n.(\\a.(\\o.i) k) ((\\a.p) (\\a.U))) (\\n.\\b.\\k.\\v.k v (m F)))) (\\l.\\j.\\l.p ((\\y.\\d.\\d.\\q.s) l))) ((\\q.\\o.\\n.(\\n.\\n.U) (\\u.M g (\\u.u)) (l (\\d.M) ((\\u.q) (x H)))) k j r) s (\\m.a l z)",
      "S (\\g.\\l.\\l.\\r.\\e.J) (U) s (\\m.a l z)"
    );
  }

  @Test
  public final void test231() {
    reducesTo(
      "\\i.\\q.(\\d.x m ((\\s.x (m N)) (a (\\r.N))) (\\p.(\\h.d (\\s.m ((\\u.K) (b i) (A A))) (\\m.m)) (t ((\\o.\\q.(\\f.\\s.b) (m Z s)) (\\i.(\\t.b) ((\\i.o) (f Q))) (\\h.\\h.\\u.\\j.\\g.Q)))) P) (K j)",
      "\\i.\\q.x m (x (m N)) (\\p.K j (\\s.m (K (A A))) (\\m.m)) P"
    );
  }

  @Test
  public final void test232() {
    reducesTo(
      "(\\a.(\\c.l (\\i.\\y.(\\q.(\\w.O) (\\f.q w (\\q.C) (r h A))) (y ((\\q.T) (\\h.\\b.l)))) ((\\r.\\c.(\\d.c) ((\\t.\\w.\\t.F) ((\\c.q) (X V))) ((\\a.U) (\\m.\\j.M T) ((\\i.t) (\\h.f) (n (\\z.E))))) (\\j.(\\f.\\v.p) ((\\m.z V) (\\q.\\l.(\\o.k n) (\\u.\\s.D)))))) (\\z.(\\e.(\\v.\\r.(\\p.\\d.\\f.v) ((\\u.d) h) G ((\\x.F) G)) f) ((\\j.D (r c)) (\\e.Y) (\\f.\\t.\\h.\\j.\\f.\\j.i) (\\d.E) z))) (\\m.d (\\s.\\e.H ((\\f.\\o.w) B) (v p))) (q (r (s (\\q.\\v.\\o.Y)) (\\q.p)) (i (k (z Y) (\\o.B (\\v.U ((\\g.D) (t Y))) ((\\c.(\\s.\\o.\\j.B) ((\\u.h) (n z))) (\\v.\\z.\\u.b)))) D))",
      "l (\\i.\\y.O) (\\c.c (U (t (n (\\z.E))))) (q (r (s (\\q.\\v.\\o.Y)) (\\q.p)) (i (k (z Y) (\\o.B (\\v.U (D)) (\\o.\\j.B))) D))"
    );
  }

  @Test
  public final void test233() {
    reducesTo(
      "n (L y)",
      "n (L y)"
    );
  }

  @Test
  public final void test234() {
    reducesTo(
      "\\d.(\\v.\\t.\\n.\\f.\\p.(\\a.o) (\\n.R k) X) (x r (i O) (f (s a)) Z) (\\l.\\k.\\v.(\\u.v) i) ((\\w.L) P (\\r.b)) (\\d.v) (\\p.(\\i.k) ((\\q.\\d.(\\t.x g) (\\a.g)) ((\\k.M) ((\\s.w) ((\\d.g r c) (P G (n q)))))) I) (\\o.(\\n.\\e.\\p.\\n.q (\\v.v) ((\\j.N (\\c.(\\w.P) (v C) (\\i.U))) j ((\\p.\\u.(\\e.\\q.I q ((\\x.S) (s M))) (\\w.D (Y D (\\j.j)))) ((\\b.(\\o.u) (\\e.m) (\\u.n)) (\\z.M))) (\\q.W))) ((\\q.y) ((\\f.\\v.(\\r.\\m.e) (\\s.i e)) (\\i.\\j.\\n.L (R k (\\x.y)))) (\\y.Y I (p A) (\\p.\\j.\\m.c) ((\\i.m) (C l) (n (\\h.d))) (k b (\\r.x))) k d))",
      "\\d.o X (\\o.\\e.\\p.\\n.q (\\v.v) (N (\\c.P (\\i.U)) (\\u.\\q.I q (S)) (\\q.W)))"
    );
  }

  @Test
  public final void test235() {
    reducesTo(
      "\\c.q",
      "\\c.q"
    );
  }

  @Test
  public final void test236() {
    reducesTo(
      "\\i.\\t.H",
      "\\i.\\t.H"
    );
  }

  @Test
  public final void test237() {
    reducesTo(
      "g ((\\e.\\k.(\\j.\\i.(\\x.\\r.(\\l.\\q.\\a.F) (\\f.w A (\\u.p) (\\z.t a))) v (\\y.\\c.\\q.(\\u.\\g.x) ((\\m.c) (\\h.(\\w.\\w.K) F)))) ((\\x.\\n.V r) (P Y (\\c.d) (w B (I U)) ((\\q.\\n.L u) (N q (x n)))) (\\u.k))) j (\\y.\\i.i))",
      "g (\\i.\\q.\\a.F)"
    );
  }

  @Test
  public final void test238() {
    reducesTo(
      "(\\p.(\\u.\\v.\\f.\\n.b) n b (\\h.(\\o.\\h.L s j I Y e) (\\r.\\y.D))) ((\\h.\\c.(\\s.\\l.y) ((\\c.c) (\\z.W))) ((\\s.\\t.q (\\k.\\i.S)) ((\\x.s i (\\j.g) (\\x.\\o.y)) y (\\c.(\\m.z V e (L (\\l.A))) S)))) (o (\\o.(\\d.\\j.p) (\\p.\\p.\\b.\\b.w (S ((\\n.\\p.U (J e) (x (\\a.e))) (\\c.\\d.\\r.(\\v.\\w.q) f)))))) r",
      "b r"
    );
  }

  @Test
  public final void test239() {
    reducesTo(
      "(\\c.\\t.d (\\d.\\u.a)) (\\f.\\l.z (j I (\\x.c))) F ((\\w.U) l) H (\\y.\\w.(\\f.\\t.\\u.\\p.\\v.\\t.\\a.\\r.(\\v.I (m B)) (\\o.Y (\\d.\\p.T ((\\a.N) d (\\l.\\k.z))))) (e (W x (\\j.h) ((\\z.f) (\\o.p)) g) (\\r.b (\\y.G) (K l (\\d.A) ((\\k.e) (l q))) ((\\w.U) r b T)))) (\\a.\\q.(\\y.n) (\\r.(\\x.\\r.\\v.(\\b.\\z.q) (\\x.(\\t.\\j.v) ((\\q.Y N (u T)) (\\f.\\g.E)) m)) D)) (\\p.(\\u.H) ((\\o.\\v.\\f.z (\\k.I)) ((\\c.\\c.N (\\l.\\t.\\e.v)) (\\p.O))))",
      "d (\\d.\\u.a) (U) H (\\y.\\w.\\t.\\u.\\p.\\v.\\t.\\a.\\r.I (m B)) (\\a.\\q.n) (\\p.H)"
    );
  }

  @Test
  public final void test240() {
    reducesTo(
      "q (\\h.\\h.(\\j.\\z.(\\b.\\x.f (\\d.\\n.\\t.w ((\\l.\\o.(\\v.\\c.(\\t.\\h.j) ((\\o.O) (\\t.e))) (m t (k b) m)) h))) (\\f.\\g.\\v.X)) (\\v.X Q (\\v.y) j ((\\q.\\x.\\i.\\l.z) (\\q.\\o.(\\n.\\g.V) (\\h.X) ((\\x.(\\g.f) (\\x.A)) (\\q.i (c c))) (\\r.D))) (\\q.(\\u.(\\w.Q) ((\\g.D) (\\d.\\h.q (\\w.u (\\a.\\c.h))))) u)))",
      "q (\\h.\\h.\\z1.\\x.f (\\d.\\n.\\t.w (\\o.\\c2.\\h.\\v.X Q (\\v.y) j (\\x.\\i.\\l.z) (\\q.Q))))"
    );
  }

  @Test
  public final void test241() {
    reducesTo(
      "a q (g ((\\v.a) ((\\h.u X (d p) (x (\\x.B))) (h p (\\b.v) (\\z.K P X))) (k (\\b.b (\\t.\\f.(\\b.\\w.W) (\\n.\\x.m)))) ((\\r.(\\p.(\\e.I (d v)) (\\f.b)) (\\l.\\r.\\s.\\p.\\v.\\w.U)) (\\o.m ((\\v.p) (W c)) (T d (U a) q)) (M X ((\\d.W (o (\\a.x))) (\\i.(\\b.y j (A X)) (\\i.\\v.\\n.q)))))) v)",
      "a q (g (a (k (\\b.b (\\t.\\f.\\w.W))) (I (d v) (M X (W (o (\\a.x)))))) v)"
    );
  }

  @Test
  public final void test242() {
    reducesTo(
      "(\\k.\\a.(\\c.e) ((\\v.v b) (t L)) ((\\j.y m j ((\\q.(\\t.c) (\\h.h) (z F (l T)) (\\b.\\e.d)) ((\\g.O q (g x)) Z E))) L (B (\\f.\\q.\\v.\\w.(\\k.A) Y)))) (\\h.(\\n.\\q.z (\\n.l)) (\\y.\\f.\\e.(\\y.n (E (a k (\\m.z)))) (\\p.(\\q.V) (\\x.\\f.e (v d (K G))))) Y G ((\\x.(\\m.y I (P W)) (\\v.\\i.x) V (\\n.\\s.j ((\\b.\\w.M p) m)) ((\\u.\\n.\\t.\\d.\\y.T E) (m (\\f.G) q ((\\h.\\p.h) x))) (R ((\\i.f) n))) (\\x.c)))",
      "\\a.e (y m L (c (z F (l T)) (\\b.\\e.d)) (B (\\f.\\q.\\v.\\w.A)))"
    );
  }

  @Test
  public final void test243() {
    reducesTo(
      "\\t.v (n (\\g.\\s.(\\d.(\\s.\\j.\\f.\\q.\\d.e (q (q (\\x.c)) (x (z g) (\\b.\\u.u) (C (\\y.t) g)))) ((\\a.(\\d.I) (\\i.\\o.a)) B c ((\\t.e (\\c.\\q.\\l.\\m.B r (\\t.e))) (c T)))) (\\e.f)))",
      "\\t.v (n (\\g.\\s.\\j.\\f.\\q.\\d.e (q (q (\\x.c)) (x (z g) (\\b.\\u.u) (C (\\y.t) g)))))"
    );
  }

  @Test
  public final void test244() {
    reducesTo(
      "\\h.(\\n.\\n.X) (\\p.x ((\\p.\\d.\\g.S) (K d ((\\u.\\o.\\b.\\w.\\o.\\d.V) k))) x)",
      "\\h.\\n.X"
    );
  }

  @Test
  public final void test245() {
    reducesTo(
      "C (m (m K) ((\\d.e) ((\\l.\\r.\\k.L) j) l))",
      "C (m (m K) (e l))"
    );
  }

  @Test
  public final void test246() {
    reducesTo(
      "\\s.\\h.\\x.(\\y.b) e ((\\l.(\\m.(\\r.\\t.(\\h.(\\c.g n (\\q.H) ((\\x.u) (l M))) P (\\q.t P)) (m L)) (\\g.B)) ((\\d.g u (B p)) (\\a.\\t.R D) (f z r (X u p)) r ((\\x.\\j.(\\g.X) P) z) ((\\e.r ((\\r.j) t)) (\\x.\\u.w A) (\\w.(\\i.T) t)))) r)",
      "\\s.\\h.\\x.b (\\t2.g n (\\q.H) (u) (\\q.t2 P))"
    );
  }

  @Test
  public final void test247() {
    reducesTo(
      "\\j.\\y.\\j.V",
      "\\j.\\y.\\j.V"
    );
  }

  @Test
  public final void test248() {
    reducesTo(
      "\\d.\\p.z",
      "\\d.\\p.z"
    );
  }

  @Test
  public final void test249() {
    reducesTo(
      "(\\t.(\\g.\\u.y (\\d.(\\g.\\y.s (l r (\\h.M)) w) ((\\m.d) (J V) ((\\q.Z) (\\i.F) (\\d.\\r.\\o.h))))) ((\\a.\\w.B) (\\v.\\e.(\\b.\\i.(\\k.k) (\\n.V) (\\o.r E)) (\\i.\\g.t r i (\\j.D t)) w)) h ((\\y.\\b.\\y.Z (w (h L)) p H ((\\n.C G (\\r.\\k.(\\f.\\j.r) (d P (w r)))) (\\m.\\r.m K)) (\\k.q (\\u.(\\m.(\\x.p x (\\v.G) A) C) Z))) (\\y.(\\c.o) A))) (e ((\\q.n ((\\b.c) (\\d.(\\l.(\\x.\\o.h) r ((\\i.\\d.F r) i)) (\\h.w)))) ((\\b.\\c.Z (\\x.e (i z)) (L i E (\\x.\\f.\\a.q) (\\x.\\z.\\d.\\v.v H b))) (\\s.(\\x.Y) k) (\\d.O))))",
      "y (\\d.\\y.s (l r (\\h.M)) w) (\\b.\\y.Z (w (h L)) p H (C G (\\r.\\k.\\j.r)) (\\k.q (\\u.p C (\\v.G) A)))"
    );
  }

  @Test
  public final void test250() {
    reducesTo(
      "\\j.(\\r.q) ((\\w.i k g) L) (o (\\r.(\\v.\\t.(\\v.\\g.z (y g k ((\\k.z) (f e)) g)) ((\\a.Z p (F p) (\\w.y)) (\\m.o) K)) ((\\z.\\r.V q (\\c.o)) (\\k.k)))) t",
      "\\j.q (o (\\r.\\t.\\g.z (y g k (z) g))) t"
    );
  }

  @Test
  public final void test251() {
    reducesTo(
      "(\\i.H) ((\\y.(\\c.(\\u.(\\l.(\\e.S) (\\f.L)) (\\x.R) b (\\w.q) ((\\o.\\i.j) (\\o.\\o.B (\\g.z) (\\x.\\u.H)) ((\\u.\\l.i) x))) q) (\\a.u)) (\\j.E))",
      "H"
    );
  }

  @Test
  public final void test252() {
    reducesTo(
      "\\y.\\y.\\l.\\n.\\x.(\\o.(\\x.(\\k.\\d.V ((\\s.g (b a)) (\\d.G w x)) (\\t.O (\\j.i l (\\f.M) (\\a.\\m.G)))) k (\\l.\\x.a (\\l.z (f ((\\e.x) (\\f.\\g.J a))))) (\\b.(\\b.\\z.\\u.d (\\n.l)) (\\w.(\\f.u) ((\\b.Z) (\\v.b)) ((\\p.g) (\\q.s) ((\\g.X) (x z))) (\\b.E h) ((\\b.K) ((\\q.\\d.\\g.\\u.m) (\\d.\\k.w (x h (\\e.s)))))))) (C r (\\i.R) x (\\b.G (o (n f))) (i g) ((\\s.(\\q.Y) (\\c.n) (W L (S b)) B) (\\m.t (C s) (\\e.g m (\\q.l)) V)) ((\\g.(\\b.(\\g.o) (e n)) (q (\\q.Q)) (\\w.(\\u.m) z)) (i i) (w W e)) (m (\\p.d (\\i.\\r.(\\j.x) J ((\\p.(\\u.E) (V p)) (\\l.(\\a.L) P))) ((\\w.Y) ((\\e.x) (\\a.\\g.I l)) (\\j.(\\e.t (Z G) (y k e)) ((\\j.\\t.\\w.y) I))))))) (\\j.\\t.g (D ((\\h.\\f.\\h.\\l.y ((\\q.\\h.\\v.r) o) (\\c.\\v.U)) o ((\\u.Z) ((\\e.W) (\\l.k) (j i (\\v.c)) (\\n.\\u.E (D d (u i))) ((\\n.s) ((\\y.\\m.z c) l)))))))",
      "\\y.\\y.\\l.\\n.\\x.V (g (b a)) (\\t.O (\\j.i l (\\f.M) (\\a.\\m.G))) (\\b6.\\z.\\u.d (\\n.l))"
    );
  }

  @Test
  public final void test253() {
    reducesTo(
      "\\c.\\j.z",
      "\\c.\\j.z"
    );
  }

  @Test
  public final void test254() {
    reducesTo(
      "(\\k.\\j.i (\\v.\\q.t) (\\i.\\z.m) (z (\\d.(\\j.(\\o.v) c) (a (n f)) (\\z.(\\l.T X o) (\\r.j U V)) a s) ((\\e.K) (\\z.\\y.\\a.x g (\\i.D)) (x (\\m.\\r.\\t.T) ((\\c.q D (u e)) (c (y e)))) (\\i.r) f))) F",
      "\\j.i (\\v.\\q.t) (\\i.\\z.m) (z (\\d.v (\\z.T X o) a s) (K (x (\\m.\\r.\\t.T) (q D (u e))) (\\i.r) f))"
    );
  }

  @Test
  public final void test255() {
    reducesTo(
      "i (l (\\v.\\z.u t (A w) (\\d.(\\a.r) (x u)) ((\\u.\\e.l) ((\\v.j) a))) ((\\c.a K ((\\t.h) (\\p.\\b.d f))) (\\r.(\\b.S x H (\\k.\\w.V D)) (\\e.p (\\e.\\n.\\v.n)))) (m (F ((\\y.l) (\\p.(\\v.W) (\\i.\\x.b s))))) (\\q.(\\e.\\k.\\o.(\\g.(\\x.p b (I p)) (\\c.\\v.\\c.m) (\\f.p)) (E (\\j.(\\v.d) u) c) t) (\\m.\\p.(\\c.t) ((\\a.\\j.(\\f.y) (O N) (\\i.\\s.u)) (\\z.(\\k.P k (\\b.q)) f)) (h (\\m.(\\z.\\i.\\e.t) g) ((\\d.d) ((\\c.\\c.\\n.q) (i l (s f)))))))) q",
      "i (l (\\v.\\z.u t (A w) (\\d.r) (\\e.l)) (a K (h)) (m (F (l))) (\\q.\\k.\\o.p b (I p) (\\f.p) t)) q"
    );
  }

  @Test
  public final void test256() {
    reducesTo(
      "b (\\o.(\\t.I) ((\\o.\\c.(\\b.b (\\b.b)) r) (\\s.(\\s.\\n.(\\p.\\l.d K) (\\t.\\j.\\t.h) ((\\t.z V (b I)) (\\m.\\s.v T)) (S a (\\u.G) (y e (\\q.L)) (\\d.\\y.r h (N l) (\\u.z A)))) (U ((\\e.T) ((\\j.\\a.\\i.q) E)))))) ((\\j.r (p (m (\\t.\\x.z)) ((\\x.(\\c.p) ((\\v.j c (\\h.r)) h)) (W V (\\w.O) (C (\\z.s)) (\\i.M))))) Q ((\\h.i) m))",
      "b (\\o.I) (r (p (m (\\t.\\x.z)) (p)) (i))"
    );
  }

  @Test
  public final void test257() {
    reducesTo(
      "\\h.\\l.\\o.\\l.\\p.Y (\\t.\\t.\\a.\\t.o (\\f.o))",
      "\\h.\\l.\\o.\\l.\\p.Y (\\t.\\t.\\a.\\t.o (\\f.o))"
    );
  }

  @Test
  public final void test258() {
    reducesTo(
      "(\\x.\\u.(\\r.G) ((\\m.\\s.\\m.r (\\o.p (\\f.F)) (\\y.(\\z.(\\q.h) e) F) (L k (\\y.\\c.e)) (O (\\j.\\e.\\q.(\\q.C) ((\\s.K d) (l (\\p.d)))))) (\\b.\\n.a))) S D",
      "G"
    );
  }

  @Test
  public final void test259() {
    reducesTo(
      "M (\\z.(\\m.d) P)",
      "M (\\z.d)"
    );
  }

  @Test
  public final void test260() {
    reducesTo(
      "\\c.(\\c.(\\j.\\x.(\\d.X) (\\v.\\r.v)) ((\\e.\\x.(\\a.\\i.B) (\\z.\\g.B)) (\\x.\\d.o))) (\\y.\\d.t V)",
      "\\c.\\x.X"
    );
  }

  @Test
  public final void test261() {
    reducesTo(
      "(\\t.\\o.\\j.O (\\o.(\\w.z) ((\\g.\\m.\\j.n) ((\\s.w) ((\\n.\\j.v i) (\\l.P (p I) (\\e.\\m.\\g.Z) y)))))) (\\b.u ((\\z.r (\\c.(\\e.(\\v.o) h) (\\q.q)) ((\\u.J (m t)) (p J) i (K (p o (\\p.T)) (\\n.j (m o) (\\v.x M (d q))))) (\\w.\\x.(\\c.\\p.X v) (\\k.\\z.x s) (C l (L x) (\\u.\\h.n)) (k ((\\y.K p m) l)) (Y (\\k.J) ((\\b.(\\p.j) ((\\j.b) (\\j.M))) (\\d.\\r.i j c))))) (\\f.(\\s.M h (N i)) (l N (\\o.h)) (h a) (\\m.u) (C ((\\i.x i (\\c.\\f.w x)) (W X))) x)))",
      "\\o.\\j.O (\\o.z)"
    );
  }

  @Test
  public final void test262() {
    reducesTo(
      "\\j.\\f.\\h.\\i.T",
      "\\j.\\f.\\h.\\i.T"
    );
  }

  @Test
  public final void test263() {
    reducesTo(
      "(\\k.d ((\\u.\\l.t (O (\\y.(\\q.(\\t.\\p.z) (v (N M))) (S ((\\c.o) (U s))) (\\v.b)))) e)) g",
      "d (\\l.t (O (\\y.z)))"
    );
  }

  @Test
  public final void test264() {
    reducesTo(
      "\\t.\\n.l",
      "\\t.\\n.l"
    );
  }

  @Test
  public final void test265() {
    reducesTo(
      "\\a.W",
      "\\a.W"
    );
  }

  @Test
  public final void test266() {
    reducesTo(
      "(\\p.J d m ((\\t.\\j.\\e.(\\m.G) (\\u.\\y.(\\g.(\\s.n) ((\\u.p) (\\y.(\\c.b) (k u) (Y Z H)))) (\\h.x))) ((\\v.y u (u t) (U (\\e.Z)) (c (p (\\x.w)))) ((\\u.w) (c Z) (\\w.\\l.\\i.H) (\\n.j (S j) (\\v.f))) (\\c.y m) (\\u.d)))) (\\a.(\\z.R ((\\l.y) ((\\f.\\u.e A) ((\\b.i) (\\r.F))))) (\\d.\\h.b) v (\\g.\\d.z) n)",
      "J d m (\\j.\\e1.G)"
    );
  }

  @Test
  public final void test267() {
    reducesTo(
      "(\\s.(\\v.(\\t.b) ((\\i.e) (u p)) (\\n.\\d.\\d.\\p.\\u.o)) j ((\\a.\\v.(\\u.\\o.n (\\u.Y h)) (v w)) (\\k.\\o.\\v.s)) ((\\h.\\b.(\\f.\\a.(\\n.J c) (\\e.\\c.r)) ((\\h.\\w.\\w.u) (s A (\\c.R)))) (u o (\\m.r) (\\k.L B (h n)) (V d H w)) (\\v.\\n.\\f.M))) (\\y.\\g.(\\x.\\q.X) (\\k.p) e) (\\e.q (\\w.c) U (\\c.\\n.\\d.y) i) (\\j.x)",
      "b (\\n.\\d.\\d.\\p.\\u.o) (\\v.\\o.n (\\u.Y h)) (\\a.J c) (\\e.q (\\w.c) U (\\c.\\n.\\d.y) i) (\\j.x)"
    );
  }

  @Test
  public final void test268() {
    reducesTo(
      "(\\c.(\\x.(\\a.\\y.o) r (\\l.o) (\\o.\\i.\\g.(\\g.\\z.g t (A c)) (y (\\r.k) ((\\x.o) y)))) S) ((\\e.Z) (\\p.G) ((\\v.w) v o ((\\j.L) (s m) (K (\\h.Q))) C)) (\\u.\\j.\\t.(\\d.\\y.(\\k.\\v.g (Z (\\m.s (\\d.q) (d n (\\p.w))))) V) ((\\k.\\r.o (\\o.W)) (b f (\\y.g) (\\k.\\f.\\h.z) t) (\\z.\\p.\\l.h))) r ((\\x.\\f.\\a.\\u.B (\\u.\\i.w) (\\r.\\q.(\\y.T (l b I) ((\\l.i) (\\d.o) ((\\m.t) (z W))) (m U k f)) j (\\x.\\l.\\r.l))) (\\e.(\\q.\\p.(\\m.v (\\n.(\\b.i) (\\b.z)) I v) F) ((\\d.\\x.\\q.\\d.d) (\\u.\\y.\\a.(\\h.n c) (\\h.C)) (\\q.\\d.\\x.\\y.T) k) (X (\\v.(\\x.\\i.(\\c.(\\q.i) (r I) z) (b (\\b.g)) q) C))))",
      "o (\\o1.\\i.\\g.\\z.y (\\r.k) (o1) t (A (Z (w o (L (K (\\h.Q))) C)))) (\\u.\\j.\\t.\\y.\\v.g (Z (\\m.s (\\d.q) (o (\\o.W) n (\\p.w))))) r (\\f.\\a.\\u.B (\\u.\\i.w) (\\r.\\q.T (l b I) (i (t)) (m U k f) (\\x.\\l.\\r.l)))"
    );
  }

  @Test
  public final void test269() {
    reducesTo(
      "(\\k.\\n.\\l.\\e.h) ((\\g.(\\a.\\b.\\n.E) x) (g (C b (\\g.n) (\\o.\\j.\\k.B) j) (\\s.(\\z.v o B) (\\f.\\c.(\\s.\\q.t) ((\\p.q) C)) (\\f.\\d.\\r.(\\a.s) (\\b.t))) (\\d.z)) (t (c (\\l.h) (c (\\c.l) (p q (h w))) (M i) ((\\k.d ((\\b.v) (\\e.x) y)) (\\g.O))) (R (F ((\\y.(\\g.v) (l U) t) (\\n.U)) (\\z.(\\p.\\d.\\p.\\v.\\c.\\r.\\p.k) (\\q.X) (\\j.\\g.v))))))",
      "\\n.\\l.\\e.h"
    );
  }

  @Test
  public final void test270() {
    reducesTo(
      "(\\a.(\\q.\\r.r) (\\v.\\o.(\\s.l) ((\\u.(\\n.u) ((\\k.\\k.\\e.\\p.k (\\y.Y)) ((\\t.I) (\\m.\\e.\\r.W)))) (\\c.(\\f.w (\\v.G (x b (\\n.c)))) (\\k.K))))) (\\u.\\l.(\\o.\\s.(\\h.\\g.(\\g.(\\e.(\\f.q) (x i) (g (n j))) (y i)) (R (B x (\\e.g) (\\t.u)))) (\\x.H)) (\\q.h) ((\\x.l (\\n.a)) (\\y.r (\\e.(\\m.X) (\\u.o) ((\\l.\\t.U) (\\c.\\c.z y (\\f.L) (v r))))))) ((\\h.\\h.\\b.\\y.\\i.Q) ((\\u.\\v.w S f) m (\\w.(\\z.\\o.\\x.(\\h.y z) (m e (n b))) (\\h.c) i) (\\u.\\u.\\k.j)) (\\j.A))",
      "\\b.\\y.\\i.Q"
    );
  }

  @Test
  public final void test271() {
    reducesTo(
      "t ((\\n.\\w.\\k.\\w.\\n.\\x.u) f i (\\h.\\w.\\e.\\q.x (p (\\b.\\c.i m (S F) (R k A))))) ((\\h.\\o.\\u.N (\\p.a)) z (\\c.(\\d.\\c.(\\m.M) ((\\d.\\m.\\d.b) (v B (r k)))) (m (\\r.G) ((\\i.u) m))) (C b (I g) (\\h.c (\\h.a)) (y l (\\t.M (o o))) (b (\\n.c)) (I l M))) (\\v.\\d.Z) S",
      "t (\\w.\\n.\\x.u) (N (\\p.a)) (\\v.\\d.Z) S"
    );
  }

  @Test
  public final void test272() {
    reducesTo(
      "(\\j.\\v.E) ((\\e.t (V e ((\\e.S Z (\\n.r)) (\\t.r (t e))) (\\c.\\q.\\m.H) (\\a.(\\b.m (\\q.\\y.(\\n.k) ((\\q.X) v))) (\\j.\\a.q)))) (j (c ((\\d.\\a.k ((\\f.\\r.t) (E Q c))) (U m (T P) (\\r.o) ((\\x.L) j))))) (\\h.(\\z.\\f.g (e (\\n.(\\q.j) ((\\q.\\c.(\\w.\\x.S) (O (\\d.s))) (\\k.(\\m.\\z.\\c.l) H))))) N))",
      "\\v.E"
    );
  }

  @Test
  public final void test273() {
    reducesTo(
      "(\\c.(\\t.(\\v.\\f.(\\q.U) ((\\b.(\\u.\\k.\\s.Y) (t w (\\j.e))) (\\r.u (f Y)))) ((\\s.e ((\\s.X) (\\w.k))) ((\\l.A) (\\j.v) (\\p.\\s.\\c.d)) C)) (w Y) (a (\\h.(\\l.\\v.\\j.(\\o.K J) (\\x.\\i.h ((\\g.p) (w W) V))) x))) (e ((\\b.\\b.\\c.\\f.w) (\\w.(\\g.b) (f t q)) (\\c.\\n.(\\w.u) C)) (r ((\\y.W Q) (\\w.(\\v.k) (\\y.\\j.a I (\\q.Z) (g x (e l)))))) P) (\\c.v)",
      "U (\\c.v)"
    );
  }

  @Test
  public final void test274() {
    reducesTo(
      "\\w.\\g.\\g.\\r.y (\\v.d) ((\\b.A) (\\j.\\a.a))",
      "\\w.\\g.\\g.\\r.y (\\v.d) (A)"
    );
  }

  @Test
  public final void test275() {
    reducesTo(
      "o (\\t.\\w.(\\n.(\\m.(\\i.\\p.(\\g.K c) (r x g)) ((\\w.X (\\a.r)) (L e (\\x.i)))) ((\\e.(\\n.r) (\\p.p)) (B (\\n.G) ((\\u.b) (\\p.C)))) (s (e (\\l.\\x.n)) (\\g.(\\p.t) (\\y.\\h.t))) (M X)) (\\c.\\l.\\c.V)) s",
      "o (\\t.\\w.K c (M X)) s"
    );
  }

  @Test
  public final void test276() {
    reducesTo(
      "(\\d.(\\i.(\\i.\\d.\\r.C) b (\\w.z)) g) (\\a.\\d.e)",
      "\\r.C"
    );
  }

  @Test
  public final void test277() {
    reducesTo(
      "\\x.(\\y.l q) o",
      "\\x.l q"
    );
  }

  @Test
  public final void test278() {
    reducesTo(
      "(\\k.e) (\\y.\\w.(\\g.\\g.\\w.\\e.m) (\\d.\\u.m))",
      "e"
    );
  }

  @Test
  public final void test279() {
    reducesTo(
      "\\a.\\c.\\j.(\\f.W ((\\q.h) ((\\y.(\\f.\\y.\\j.\\p.\\i.F (M T) (\\q.(\\x.s G) (z E (\\t.B)))) (E (\\d.(\\p.s) (z k) (q h (O P))))) (\\x.z))) (\\e.\\b.\\n.O)) (C (p (\\v.b (\\a.\\e.\\j.\\r.(\\v.Z t) (\\o.j F (\\r.a))))))",
      "\\a.\\c.\\j.W (h) (\\e.\\b.\\n.O)"
    );
  }

  @Test
  public final void test280() {
    reducesTo(
      "\\m.(\\p.\\j.v (\\t.(\\g.M) ((\\a.\\b.u f) ((\\i.k) (b f)) ((\\q.\\y.\\d.R) (\\d.H (t d))) (\\s.k) ((\\j.\\p.(\\i.(\\p.v X) (m v (b y))) e) h))) (\\y.Q)) (\\s.\\a.b)",
      "\\m.\\j.v (\\t.M) (\\y.Q)"
    );
  }

  @Test
  public final void test281() {
    reducesTo(
      "\\m.\\p.c",
      "\\m.\\p.c"
    );
  }

  @Test
  public final void test282() {
    reducesTo(
      "\\q.k G ((\\n.D) (\\w.(\\o.\\y.(\\l.(\\z.p) P) (k (\\s.(\\n.\\z.(\\r.l) (B O) q) (\\f.I (s W (d w)))))) (\\i.(\\l.(\\n.M) (\\u.(\\u.\\p.z) (\\j.(\\b.t) (\\e.c) (\\j.\\n.u)))) (\\r.g ((\\p.n) ((\\u.\\u.X) (K b (\\r.o)))))) (\\c.\\u.p)))",
      "\\q.k G (D)"
    );
  }

  @Test
  public final void test283() {
    reducesTo(
      "(\\x.N) (\\y.(\\x.P) (\\e.r)) (E (\\p.P (X (\\z.(\\j.i) ((\\o.H z a (\\c.s (\\l.D))) (\\m.o)))) ((\\v.a) u ((\\l.\\z.r) (\\z.(\\m.g (Q r)) (s x (o q) (v n (u e))) (\\y.\\b.\\y.z))))))",
      "N (E (\\p.P (X (\\z.i)) (a (\\z.r))))"
    );
  }

  @Test
  public final void test284() {
    reducesTo(
      "(\\t.J ((\\t.\\a.M (x e)) ((\\o.d (\\h.\\z.\\z.p)) (\\c.W) ((\\i.L (\\r.i (X d)) ((\\x.\\i.\\z.O) c) D) q)))) (f ((\\k.n) c a (\\t.g (q (x (\\j.\\o.i))) (\\p.(\\c.a (\\y.l)) (a w (C Q) (k (\\d.V)) (\\l.\\d.\\l.s) X)))))",
      "J (\\a.M (x e))"
    );
  }

  @Test
  public final void test285() {
    reducesTo(
      "(\\r.o) (\\n.W d y (\\l.(\\b.(\\o.o) (\\o.(\\o.I) (\\s.\\n.E) (\\p.o) ((\\w.\\m.\\i.n (\\v.j) (q g (\\z.C))) (o D (j A) (M Y))))) (\\d.h)) (\\s.(\\o.(\\z.\\c.\\y.(\\o.C) (\\e.a)) (\\l.(\\j.\\t.\\n.\\d.(\\d.u (G V) (\\l.a Y)) (f (z M) (\\a.Q b))) T) (\\h.O (T ((\\i.a (\\x.b)) d) (B (\\c.(\\c.o) (\\y.l) i))))) (\\j.(\\x.\\u.(\\e.J) (\\v.\\k.k)) a ((\\h.\\q.\\y.(\\b.\\s.\\c.(\\j.p) t) ((\\d.t) (\\g.o) F) o) ((\\t.\\t.j) ((\\d.y) (f B) (\\g.\\g.A)) ((\\v.g) e (\\e.y) ((\\k.(\\s.W) (\\j.c)) (\\r.h o u))))))))",
      "o"
    );
  }

  @Test
  public final void test286() {
    reducesTo(
      "\\h.\\c.\\o.\\d.\\e.\\j.g",
      "\\h.\\c.\\o.\\d.\\e.\\j.g"
    );
  }

  @Test
  public final void test287() {
    reducesTo(
      "(\\i.Z R v) u Q (s (\\e.v) (\\h.b)) (D o)",
      "Z R v Q (s (\\e.v) (\\h.b)) (D o)"
    );
  }

  @Test
  public final void test288() {
    reducesTo(
      "\\x.\\m.(\\w.\\r.\\e.r) (Y b)",
      "\\x.\\m.\\r.\\e.r"
    );
  }

  @Test
  public final void test289() {
    reducesTo(
      "T ((\\d.(\\v.\\v.a J) (\\y.\\r.N)) (\\j.\\q.Z))",
      "T (\\v.a J)"
    );
  }

  @Test
  public final void test290() {
    reducesTo(
      "\\c.\\k.n",
      "\\c.\\k.n"
    );
  }

  @Test
  public final void test291() {
    reducesTo(
      "\\f.\\s.s",
      "\\f.\\s.s"
    );
  }

  @Test
  public final void test292() {
    reducesTo(
      "C (\\h.r) (\\l.\\i.(\\o.a) p) m",
      "C (\\h.r) (\\l.\\i.a) m"
    );
  }

  @Test
  public final void test293() {
    reducesTo(
      "(\\b.\\t.\\s.p (\\e.(\\v.f) i (\\a.\\l.M K (\\g.\\e.\\g.\\l.g ((\\t.B) (i d) (\\i.(\\h.h) (N I))) a))) J) (\\z.Z)",
      "\\t.\\s.p (\\e.f (\\a.\\l.M K (\\g.\\e.\\g.\\l.g (B (\\i.N I)) a))) J"
    );
  }

  @Test
  public final void test294() {
    reducesTo(
      "\\r.f (g (X (\\k.B (\\q.f (\\g.\\w.h)) (\\n.C) (\\k.(\\q.\\n.n) (\\l.e (\\x.S) (\\m.K i (\\t.\\a.Y))))) n))",
      "\\r.f (g (X (\\k.B (\\q.f (\\g.\\w.h)) (\\n.C) (\\k.\\n.n)) n))"
    );
  }

  @Test
  public final void test295() {
    reducesTo(
      "\\l.\\i.S",
      "\\l.\\i.S"
    );
  }

  @Test
  public final void test296() {
    reducesTo(
      "(\\h.\\e.(\\s.\\i.G) ((\\p.h i ((\\r.\\t.D) (\\r.M))) (\\l.g))) ((\\n.Z e) h)",
      "\\e1.\\i.G"
    );
  }

  @Test
  public final void test297() {
    reducesTo(
      "\\w.\\v.\\f.(\\a.(\\c.(\\w.X) (\\s.\\a.E (\\w.w) ((\\n.t) (\\s.\\y.x S) R ((\\h.(\\r.\\q.\\v.k) e) j)))) (\\l.D (w (x (j n (\\p.J m d) (\\j.(\\p.J k (\\a.q)) (G (l Y))))))) c) (\\p.(\\x.\\h.\\k.(\\u.\\h.\\q.v) ((\\n.(\\w.\\t.O n) (z E) (S ((\\q.a) (\\w.M)))) (\\e.\\z.g)) (q ((\\i.(\\k.\\i.n Z n (\\o.V e)) (\\p.\\t.(\\r.b o) (r r))) o))) O ((\\f.(\\v.k) ((\\q.e) (\\c.s)) (\\t.(\\g.\\o.\\m.\\f.(\\p.\\x.(\\k.Q c (\\d.J) (\\t.n k)) h) ((\\d.\\w.\\z.\\e.(\\y.U) (l E)) (p (\\d.w) (\\k.h (e R))))) (Z O (\\x.W) (J b (\\q.Q)) j ((\\q.o (\\i.w) ((\\o.u) (\\r.P))) (\\a.T (n y) (U g)))))) (u a)))",
      "\\w.\\v.\\f.X c"
    );
  }

  @Test
  public final void test298() {
    reducesTo(
      "\\r.n",
      "\\r.n"
    );
  }

  @Test
  public final void test299() {
    reducesTo(
      "y (\\b.L)",
      "y (\\b.L)"
    );
  }

  @Test
  public final void test300() {
    reducesTo(
      "\\q.\\a.\\e.v ((\\j.\\q.(\\k.\\c.\\y.b (\\a.(\\a.y) o (\\r.m))) b) (E (\\j.\\s.g ((\\o.L) ((\\r.(\\k.F) (l e)) (\\h.(\\y.A) j)))) h) ((\\r.\\u.(\\n.\\o.(\\e.E w (\\h.Q) (\\v.\\c.\\b.f)) h (\\g.(\\c.a) (\\i.(\\s.\\d.r) (B V s)))) (\\i.(\\c.(\\a.(\\u.\\o.X) ((\\v.v) (L U))) (\\z.\\u.\\h.a o (\\f.k))) ((\\j.\\e.C H) S)) (m (\\p.e ((\\p.\\z.c y) (\\e.(\\x.u) f))) (\\j.(\\b.G) (\\j.\\u.N (\\y.h) ((\\e.F) (v t)) (e (\\c.\\e.T)))))) (C T ((\\j.d) ((\\k.T) b)) (\\i.\\u.\\i.j D k g))))",
      "\\q.\\a.\\e.v (\\c.\\y.b (\\a.y (\\r.m)))"
    );
  }

  @Test
  public final void test301() {
    reducesTo(
      "\\a.\\q.V o",
      "\\a.\\q.V o"
    );
  }

  @Test
  public final void test302() {
    reducesTo(
      "(\\b.(\\w.\\k.t) ((\\a.\\x.n) (\\c.\\i.\\k.I r ((\\r.Q (\\m.z)) n))) ((\\b.T (g w) (F (\\j.e))) (\\e.h g f (\\t.p q (H i))) z ((\\q.j x (e t) (v g L) (\\m.\\f.(\\t.y) (p E) (\\b.e))) (E f)))) (\\b.o) (\\u.s) (\\h.\\y.(\\l.(\\g.z) (\\x.(\\q.C) ((\\j.\\o.\\z.\\y.t ((\\a.\\r.\\m.u) (\\r.i)) p) c))) r)",
      "t (\\u.s) (\\h.\\y.z)"
    );
  }

  @Test
  public final void test303() {
    reducesTo(
      "r (\\b.(\\b.\\i.Y) (\\e.\\x.\\m.J))",
      "r (\\b.\\i.Y)"
    );
  }

  @Test
  public final void test304() {
    reducesTo(
      "\\h.(\\h.\\u.p) (p (\\u.(\\a.f) (\\w.\\k.\\e.h ((\\e.\\c.\\f.Y) (g K (k q)))) (\\e.\\x.\\b.y (\\a.(\\x.(\\o.K) (\\s.e) (P i e)) m))) ((\\a.(\\k.z) n) (\\s.(\\r.m) i) (\\c.g))) (z I)",
      "\\h.p"
    );
  }

  @Test
  public final void test305() {
    reducesTo(
      "\\i.\\s.\\m.h",
      "\\i.\\s.\\m.h"
    );
  }

  @Test
  public final void test306() {
    reducesTo(
      "(\\m.T) (\\t.Y)",
      "T"
    );
  }

  @Test
  public final void test307() {
    reducesTo(
      "\\v.\\a.G (D (\\f.(\\a.\\g.m) ((\\x.(\\g.\\u.V b) ((\\l.t) (\\k.c)) X) K) ((\\s.(\\w.S) O) (\\h.D n (T G)) y ((\\p.\\g.\\l.\\k.Y (R w)) (\\b.X)) (\\w.\\b.(\\q.N) (\\g.(\\l.l) ((\\r.B) (\\g.m))) A)) Z))",
      "\\v.\\a.G (D (\\f.m Z))"
    );
  }

  @Test
  public final void test308() {
    reducesTo(
      "\\k.(\\e.\\b.(\\t.(\\d.(\\f.(\\b.S) (\\u.b) (\\h.\\q.o)) (m L f ((\\l.M) h))) (\\m.h)) ((\\b.\\q.q (\\f.f)) (\\h.k))) ((\\b.t (\\l.y)) (\\w.\\a.P) ((\\d.y) ((\\e.\\l.\\v.(\\c.p q) (w o V)) ((\\v.n) (T e) (\\s.I))))) q (\\v.\\w.q (\\p.o k ((\\a.p (\\q.\\l.v ((\\m.v) (M n))) (\\w.p (\\g.(\\v.V B) (J g (\\z.z))))) e))) k",
      "\\k.S (\\h.\\q.o) (\\v.\\w.q (\\p.o k (p (\\q.\\l.v (v)) (\\w.p (\\g.V B))))) k"
    );
  }

  @Test
  public final void test309() {
    reducesTo(
      "\\y.\\m.(\\a.i) ((\\z.\\k.\\h.U) (\\i.\\w.F a (\\e.\\n.R) Y))",
      "\\y.\\m.i"
    );
  }

  @Test
  public final void test310() {
    reducesTo(
      "(\\r.M) (\\a.M (\\c.(\\v.P Z) ((\\f.(\\m.o) S) ((\\k.F) (\\w.Q) p)) y ((\\p.d) ((\\j.(\\e.B) ((\\s.(\\x.A) (\\z.Z)) (Q (\\j.c)))) ((\\l.\\z.\\b.f) q ((\\h.\\b.D O) c))))) (\\b.(\\i.c) ((\\j.(\\u.d) (\\h.N) (\\t.\\j.(\\f.Z h (y Y) (M t (\\n.V))) (w P (\\x.g)) (j w))) ((\\m.\\h.\\p.k) (H n (\\e.O)) (\\v.i g) r (\\z.\\d.L)))))",
      "M"
    );
  }

  @Test
  public final void test311() {
    reducesTo(
      "\\a.\\t.n",
      "\\a.\\t.n"
    );
  }

  @Test
  public final void test312() {
    reducesTo(
      "(\\z.R) H (\\z.\\s.(\\v.\\n.\\g.\\o.E) l (c (z ((\\y.\\h.\\n.\\g.h) (\\g.\\f.\\u.p d (\\z.Z) ((\\g.m) (d z)) a l)))))",
      "R (\\z.\\s.\\g.\\o.E)"
    );
  }

  @Test
  public final void test313() {
    reducesTo(
      "\\e.\\q.t",
      "\\e.\\q.t"
    );
  }

  @Test
  public final void test314() {
    reducesTo(
      "X (\\s.(\\f.a) ((\\g.(\\o.(\\d.(\\e.k) (\\w.Q) (\\t.\\f.n l) (Q C (s d) (\\p.\\z.m)) (r (B G r) (\\q.c (\\j.\\z.m e)))) (\\i.(\\y.(\\w.N (\\b.p) (\\t.t W)) (u ((\\e.p) (\\l.a)))) (\\t.(\\p.\\b.(\\o.\\h.P) (\\t.\\w.r)) ((\\y.F) (\\s.l) m)))) (\\o.(\\m.H (V M) Z (\\h.c j (p Q) (\\a.p l (\\q.X)))) F ((\\m.(\\z.(\\y.\\r.\\c.x) (\\n.\\t.\\o.W)) O) N))) (U (\\q.y (\\q.(\\l.(\\p.d) M) (\\f.D))))))",
      "X (\\s.a)"
    );
  }

  @Test
  public final void test315() {
    reducesTo(
      "\\n.\\k.(\\s.\\n.j) (\\s.(\\n.A) w)",
      "\\n.\\k.\\n.j"
    );
  }

  @Test
  public final void test316() {
    reducesTo(
      "e (z (\\r.k) h) (z X)",
      "e (z (\\r.k) h) (z X)"
    );
  }

  @Test
  public final void test317() {
    reducesTo(
      "(\\a.k) (\\c.\\v.N) (i t ((\\z.\\j.(\\p.x X (o n) (Y (r e)) (t (w a (G d))) (\\f.(\\m.\\c.e t) (\\l.(\\e.F) (W w)) (\\v.\\k.(\\f.K) ((\\k.j) (\\h.u))))) (\\a.(\\j.p) ((\\p.S) E))) X)) (\\h.(\\l.\\y.(\\f.C) ((\\j.(\\a.\\p.s w) (\\u.x l U) (\\s.c)) (i (W q)))) (\\v.x) (\\t.\\h.(\\k.\\f.\\c.\\z.j) (n ((\\y.v) (\\w.b)) (\\n.\\j.\\u.\\h.E) h (\\e.\\l.\\u.\\m.C))) M)",
      "k (i t (\\j.x X (o n) (Y (r e)) (t (w a (G d))) (\\f.e t))) (\\h.C M)"
    );
  }

  @Test
  public final void test318() {
    reducesTo(
      "(\\y.\\o.(\\l.h) (\\i.(\\m.\\b.\\j.\\j.(\\t.\\h.(\\x.o) (\\g.g ((\\p.i k (R k)) (\\e.K (\\f.W))))) ((\\y.Q) (\\o.j ((\\n.(\\z.w) (C z)) (\\u.(\\d.L) (c W)))))) (h (o a) (N (\\h.\\v.\\y.c))) w)) (v (g (B (\\x.\\t.j) u) (o (\\z.\\h.(\\q.\\q.\\a.c) (\\a.y)) (\\c.S ((\\z.z (\\h.Z) (p w (\\n.i)) (\\j.y (\\g.p))) N)))))",
      "\\o.h"
    );
  }

  @Test
  public final void test319() {
    reducesTo(
      "\\o.L (\\u.\\m.(\\a.(\\p.\\r.\\g.m) (\\g.\\b.P d) (\\d.W) w j (\\j.(\\h.\\w.(\\v.w) s i ((\\o.W e (v S)) (\\j.T))) (O m (S z) (\\c.s) ((\\v.k) q ((\\g.g) (\\m.X)))) (N (\\g.\\k.c))) ((\\n.\\l.\\x.\\t.K) (\\d.(\\b.v J (p f) b (\\j.h k (\\p.G) (\\a.L b))) (\\r.M D (\\f.d (\\x.a G)))) (\\s.(\\u.(\\i.Z) u) ((\\p.n) S ((\\y.D (j (w g))) l))))) (\\w.(\\j.(\\w.(\\p.\\f.j u i) (\\m.j)) ((\\g.Y (\\c.N q Q ((\\w.a) (G t)))) (\\k.K) ((\\q.\\n.Z) ((\\n.\\u.\\z.S) (u n (\\f.q))) y))) (f (m E f m (\\b.g (e d) o (\\u.z)) ((\\r.v) (\\c.(\\q.l) ((\\c.r) (\\r.Y))) b)))))",
      "\\o.L (\\u.\\m.m j (\\j.N (\\g.\\k.c) i (W e (v S))) (\\x.\\t.K))"
    );
  }

  @Test
  public final void test320() {
    reducesTo(
      "(\\z.(\\s.(\\w.\\h.s) ((\\d.q) (\\q.c) ((\\k.q) (\\a.E) (\\z.c) A))) (D (\\b.s) ((\\s.S) P (Q (\\x.E) P)))) J f (H (\\r.(\\f.g) ((\\m.\\f.N) (\\z.q)) (\\t.d)) t)",
      "D (\\b.s) (S (Q (\\x.E) P)) (H (\\r.g (\\t.d)) t)"
    );
  }

  @Test
  public final void test321() {
    reducesTo(
      "b (\\t.c (\\r.n (\\x.(\\g.\\l.\\t.q) ((\\k.X) (\\p.f)) (\\y.e) (\\a.(\\i.r O (x V) c) (b (\\x.e) (\\i.\\d.\\m.M)))) (\\j.h (\\d.\\f.\\x.(\\r.g) (\\c.E) Q)) (m (\\o.j I (\\n.i)) (\\i.(\\x.n u (\\s.U)) W) ((\\c.(\\b.h) (\\a.n)) (i y (\\n.q)) (\\n.\\z.r)) j (\\o.\\m.T ((\\h.k G (n Y)) x ((\\d.u z (\\n.x)) (f L (R z))) ((\\k.g) w ((\\c.\\q.S M) ((\\x.n) j))))))))",
      "b (\\t.c (\\r.n (\\x.q) (\\j.h (\\d.\\f.\\x.g Q)) (m (\\o.j I (\\n.i)) (\\i.n u (\\s.U)) (h (\\n.\\z.r)) j (\\o.\\m.T (k G (n Y) (u z (\\n.x)) (g (\\q.S M)))))))"
    );
  }

  @Test
  public final void test322() {
    reducesTo(
      "(\\r.\\i.\\b.h) (\\j.\\p.\\z.v u)",
      "\\i.\\b.h"
    );
  }

  @Test
  public final void test323() {
    reducesTo(
      "\\h.\\g.\\p.z l",
      "\\h.\\g.\\p.z l"
    );
  }

  @Test
  public final void test324() {
    reducesTo(
      "\\w.(\\n.y) (\\g.\\k.(\\u.x) ((\\e.f ((\\p.(\\o.(\\h.G) (M j)) k) (\\r.(\\x.p) (W s) (U (O A)))) (p (\\k.\\f.n)) (\\r.r)) (f (e (\\e.\\h.I) (\\q.\\s.m)) L)))",
      "\\w.y"
    );
  }

  @Test
  public final void test325() {
    reducesTo(
      "(\\q.v) (\\n.(\\w.O (\\p.g)) E ((\\k.\\h.(\\x.a g) (j (K X))) j) l g ((\\x.(\\b.\\t.D (\\s.\\t.\\n.\\e.p)) (\\n.d) R) X) h)",
      "v"
    );
  }

  @Test
  public final void test326() {
    reducesTo(
      "(\\c.\\v.\\f.\\y.n (\\l.q ((\\e.(\\s.v) (k (h c) (\\b.\\p.\\s.s))) (\\d.\\g.\\m.\\b.M)) ((\\v.w I) (z l (\\g.A) (p e F)) ((\\b.e) ((\\k.t) (\\d.A)) X) (\\u.\\c.l)))) (\\b.\\i.(\\z.\\t.m) (y d p (\\j.s g (\\y.O)) K) N (\\l.(\\u.(\\f.l) ((\\b.F) (\\r.D)) (h (\\v.n)) (\\i.\\r.(\\a.(\\s.a) (H m)) (\\h.(\\y.b) (\\u.w)) (\\e.\\s.i k z))) e) (\\c.(\\k.\\a.(\\n.J (a e)) (S (\\m.e)) (\\x.x) ((\\c.V (q Q)) (\\c.\\f.s c) (\\v.l)) (\\x.i)) H)) (\\t.m (\\d.(\\p.\\c.\\b.\\g.(\\s.(\\u.h) (y b) (\\y.f (Y f)) ((\\e.\\p.n q) (\\u.(\\j.m) (t a))) x) ((\\q.v) (\\b.\\t.G g (N q) (\\k.\\i.b I) (\\c.(\\t.U) ((\\b.F) (\\z.y)))))) (t (P (l ((\\f.f B (h d)) (y J (\\m.E)))))) O))",
      "\\f4.\\y1.n (\\l2.q (\\t.m (\\d.\\b.\\g.h (\\y.f (Y f)) (\\p.n q) x)) (w I (e X) (\\u.\\c.l2)))"
    );
  }

  @Test
  public final void test327() {
    reducesTo(
      "(\\t.(\\h.\\z.\\e.D (\\f.z) (\\d.c)) ((\\z.q) M ((\\t.q) (w x)) (l (\\v.(\\a.c) (\\t.a))) ((\\k.k p (O u)) (o (\\j.s) (\\v.\\n.\\d.C))) (s ((\\e.c (n m (d O))) (x y))))) ((\\b.W) (\\l.L (\\l.f) o) (\\q.\\s.\\g.\\m.\\p.\\l.(\\g.D) ((\\m.F) (m C)) (C (\\q.A))) (\\j.(\\t.(\\x.\\t.\\z.F) p) (D (e E (l g))) (i s)) ((\\p.b) (\\d.\\r.w))) ((\\x.\\k.\\h.d) y ((\\y.\\b.J) ((\\r.b) ((\\s.N) (e m)) ((\\z.e) (\\z.n) (\\b.(\\r.Y) (\\u.z))))) (n (\\m.\\z.\\i.D (\\y.o m (\\l.k) ((\\r.i) (\\n.Z)) u))) (\\h.q ((\\m.\\f.(\\v.\\d.o (x K (\\z.l) (\\o.Z))) ((\\k.c) ((\\c.\\j.\\n.S) (A (\\t.g))))) (\\a.M ((\\x.\\a.\\v.t (h s (I F))) p))))) (\\i.\\z.(\\z.\\m.\\j.b) ((\\e.v k ((\\q.\\i.(\\k.v a) n) (\\v.\\y.s))) (\\h.(\\b.h) (\\s.\\y.r ((\\m.z d (k G)) H))) (o (\\i.v w))) g)",
      "D (\\f.d (\\h.q (\\f.\\d.o (x K (\\z.l) (\\o.Z))))) (\\d.c)"
    );
  }

  @Test
  public final void test328() {
    reducesTo(
      "\\i.h ((\\f.Z (\\n.Y)) (b (\\n.(\\t.t (o w) (\\q.y z (F X)) ((\\x.o) ((\\v.g) (W d)))) I (\\g.(\\g.\\y.\\m.U) ((\\v.q j (\\q.b)) (Q (U F)) (i l))) (G (k (\\p.\\z.\\m.w)) (\\c.(\\g.p) ((\\w.s) (\\w.s)) ((\\k.q) a (\\w.i i o))) (\\z.(\\r.\\l.\\w.\\r.s) (\\f.k (\\p.(\\s.d) (u y) (\\x.C v))))))))",
      "\\i.h (Z (\\n.Y))"
    );
  }

  @Test
  public final void test329() {
    reducesTo(
      "z ((\\k.c) e)",
      "z (c)"
    );
  }

  @Test
  public final void test330() {
    reducesTo(
      "(\\d.k (\\o.\\g.\\g.\\e.(\\h.T) ((\\a.\\r.\\k.\\c.c ((\\i.r (j n)) i (\\p.\\m.g)) J) (\\i.e)))) (z (\\v.i s))",
      "k (\\o.\\g.\\g.\\e.T)"
    );
  }

  @Test
  public final void test331() {
    reducesTo(
      "b (\\h.V)",
      "b (\\h.V)"
    );
  }

  @Test
  public final void test332() {
    reducesTo(
      "s ((\\h.(\\o.\\e.(\\g.\\s.\\a.a r) ((\\j.f) b)) (\\v.s)) d) (\\q.\\d.\\j.o)",
      "s (\\e.\\s.\\a.a r) (\\q.\\d.\\j.o)"
    );
  }

  @Test
  public final void test333() {
    reducesTo(
      "(\\h.\\j.f ((\\s.(\\e.l r ((\\r.G b (\\t.i)) (\\a.M E (\\r.V)))) (r ((\\o.(\\g.Q) (x n)) (\\n.\\m.Q e)))) X ((\\n.(\\x.(\\g.\\y.r) ((\\e.W) (\\j.T))) (l (\\q.(\\w.A) w)) (a a)) r) (d (\\f.\\v.e)))) b",
      "\\j.f (l r (G b (\\t.i)) (r) (d (\\f.\\v.e)))"
    );
  }

  @Test
  public final void test334() {
    reducesTo(
      "\\x.\\q.\\a.\\d.\\b.M (\\i.\\j.\\b.(\\b.Y d) (\\a.(\\y.Z) w ((\\c.o) (\\o.l)) ((\\t.c) (\\b.j) (\\j.L m (\\p.B))) (f (i T (c q)) (\\m.\\i.\\b.(\\g.W) (J n (\\u.d)))) (r (\\u.v))) ((\\l.p) (\\m.n (\\c.\\g.\\t.f)) ((\\d.\\j.\\d.h ((\\c.(\\e.\\h.p) (\\h.\\e.G)) (\\q.t))) (b t (a K) ((\\d.y) (\\s.T)) (h (\\f.\\w.v w)) (\\s.\\f.\\y.\\d.\\p.(\\x.h I D ((\\u.M) (t o))) w))))) (\\i.\\l.\\k.(\\o.(\\a.\\s.g) (\\m.r)) ((\\o.(\\x.(\\s.\\l.j) ((\\r.o) (\\t.P b (i g))) (u (t S (\\q.n V (\\y.Y))))) B) (\\r.\\i.x ((\\i.x) s) (d (\\u.(\\r.\\e.\\v.y) (\\d.h))) (\\l.\\e.(\\r.u (\\u.\\b.o)) (\\y.g (O (\\i.\\w.\\c.U))))) (\\v.w)))",
      "\\x.\\q.\\a.\\d.\\b.M (\\i.\\j.\\b.Y d (p (\\j.\\d.h (\\h.p)))) (\\i.\\l.\\k.\\s.g)"
    );
  }

  @Test
  public final void test335() {
    reducesTo(
      "\\t.\\z.h ((\\g.A H p) ((\\i.(\\b.k (\\m.\\j.(\\n.\\p.H) (\\w.u T (a t) p))) (\\e.(\\q.j ((\\m.A) D (\\s.b))) (\\p.t))) n v))",
      "\\t.\\z.h (A H p)"
    );
  }

  @Test
  public final void test336() {
    reducesTo(
      "(\\l.(\\h.J) (\\z.\\i.v)) (\\v.\\u.\\z.y)",
      "J"
    );
  }

  @Test
  public final void test337() {
    reducesTo(
      "k (\\b.\\n.\\w.(\\x.\\w.\\z.\\w.\\a.H) (\\o.\\c.\\i.u))",
      "k (\\b.\\n.\\w.\\w.\\z.\\w.\\a.H)"
    );
  }

  @Test
  public final void test338() {
    reducesTo(
      "\\z.\\a.\\e.\\r.y",
      "\\z.\\a.\\e.\\r.y"
    );
  }

  @Test
  public final void test339() {
    reducesTo(
      "\\l.\\z.\\n.\\e.(\\j.\\z.(\\n.\\b.G) k (\\s.\\x.\\q.C)) (t ((\\q.P) (W z)) (\\r.(\\b.p) (\\w.N) (\\z.I q)) (\\m.\\b.b) l ((\\r.(\\d.z p) ((\\z.p) (v l) (\\t.W D) T)) (\\o.h ((\\p.G) (\\u.a)) (\\p.\\g.q) (U ((\\p.l) I) B)))) W (\\d.\\k.r)",
      "\\l.\\z.\\n.\\e.G (\\d.\\k.r)"
    );
  }

  @Test
  public final void test340() {
    reducesTo(
      "\\h.s",
      "\\h.s"
    );
  }

  @Test
  public final void test341() {
    reducesTo(
      "(\\t.(\\c.\\t.b) (F ((\\b.E) (\\l.t) (\\z.U p f)) (\\o.\\p.m) (\\m.b f (l A) (d (L j)) (\\i.(\\i.(\\u.r) (Y Q)) g) (X p (\\y.f)))) ((\\r.f) (\\k.(\\o.\\m.(\\y.n l (\\a.x) ((\\g.B) (i y))) (\\j.(\\l.O) x (\\o.\\f.A))) (\\l.d (p z (q k)) (\\y.r))) (\\m.\\f.G (\\y.(\\m.v (k (H P))) (t (y C) (C O)) (J ((\\b.\\k.c Z) (\\d.\\r.v g)))))) l) (j (n (\\q.U) U))",
      "b l"
    );
  }

  @Test
  public final void test342() {
    reducesTo(
      "\\c.(\\w.h (\\g.\\f.\\p.v) (\\z.z) x) Z",
      "\\c.h (\\g.\\f.\\p.v) (\\z.z) x"
    );
  }

  @Test
  public final void test343() {
    reducesTo(
      "b ((\\z.c (\\q.(\\y.\\c.\\d.\\e.F) (\\i.h))) W)",
      "b (c (\\q.\\c.\\d.\\e.F))"
    );
  }

  @Test
  public final void test344() {
    reducesTo(
      "(\\e.o (\\r.\\k.\\f.c)) (\\c.(\\v.(\\d.\\k.(\\h.\\s.(\\w.g q (\\i.W)) G (\\o.\\q.(\\s.F) (l l) (\\h.q B))) (Z g)) (\\e.\\y.\\w.(\\f.H) ((\\n.i) (\\f.e)) (o z (G w) (\\v.J)) (\\q.w))) (\\s.i)) (N (\\h.i q) ((\\a.\\j.(\\o.(\\n.(\\h.z z) ((\\b.w) (\\i.U))) (\\j.\\m.\\f.g)) (\\c.n (\\i.\\p.\\q.e (\\a.h)))) e (\\k.h))) ((\\x.(\\u.(\\w.\\l.F) ((\\d.(\\e.u) (u n) (\\w.y (\\o.r))) (e (X y (X d))) (L t ((\\a.G) (\\q.S))))) (\\f.(\\z.j) j)) ((\\i.\\u.C (t (l (\\u.y))) (\\r.(\\p.G q T (\\h.\\a.m)) (\\d.k))) a (\\b.(\\x.(\\j.(\\u.(\\f.z) (I m)) (M i (\\q.l))) j ((\\q.z) (\\b.u G B (\\l.i e c)))) (n (\\u.\\s.(\\t.\\e.a) (j f j)) X))) (\\z.\\b.\\g.\\z.u))",
      "o (\\r.\\k.\\f.c) (N (\\h.i q) (z z)) (F)"
    );
  }

  @Test
  public final void test345() {
    reducesTo(
      "(\\q.(\\f.n) (T (y (\\z.A))) (\\g.d) (\\c.(\\o.(\\x.x) (\\u.\\e.\\d.e)) (\\b.(\\f.(\\e.w O) (l (\\x.t))) (r (r (\\g.R))))) (\\y.(\\d.(\\f.o) (E q) (\\l.(\\u.V) (l h)) h b) (\\c.L Z (g q) J (F b (s Q) (\\s.U (\\j.J))) ((\\r.k) (A l) (\\x.o) j))) (\\k.\\h.\\v.\\q.(\\f.(\\h.(\\h.I) f ((\\w.l) o)) ((\\z.\\q.\\f.B) (\\u.M x (o J))) (\\z.(\\f.\\s.(\\w.\\o.z) (A d (k M))) ((\\k.o) (\\b.u) X)) (\\z.g (\\k.\\c.\\b.\\d.\\g.\\n.(\\y.\\m.t) (\\t.e s) (\\d.R)))) (\\d.b)) l) (\\w.\\p.\\y.(\\i.\\s.n) m)",
      "n (\\g.d) (\\c.\\u.\\e.\\d.e) (\\y.o (\\l.V) h b) (\\k.\\h.\\v.\\q.I (l) (\\z.\\s.\\o.z) (\\z.g (\\k.\\c.\\b.\\d.\\g.\\n.t))) l"
    );
  }

  @Test
  public final void test346() {
    reducesTo(
      "\\z.(\\e.N) (\\l.(\\w.N) h) (y ((\\v.\\t.q) (t (u c) u P) (f (z (E a (\\b.I)) (O (f (e V)))))) w ((\\d.\\d.(\\v.Q ((\\s.(\\x.p) (w y)) (h r) (\\s.x) (\\d.(\\a.\\q.T) (\\t.L A x) (z p (\\a.w) W)))) u) (\\y.(\\q.\\g.b) ((\\i.z (\\o.e)) (G B v) (\\w.\\x.W) (b (\\c.\\v.u G) ((\\e.N) (\\t.j) p)) M))))",
      "\\z.N (y (q) w (\\d.Q (p (\\s.x) (\\d.T))))"
    );
  }

  @Test
  public final void test347() {
    reducesTo(
      "(\\s.(\\o.(\\w.V) (\\r.\\b.(\\y.N) (\\v.(\\p.\\d.(\\k.\\u.h) (a (\\e.w))) (\\s.\\s.\\z.q H (o g) (\\w.s j)) (T S (\\o.T) w (\\f.\\g.\\f.(\\c.o A) (\\t.s))) (\\s.(\\d.(\\d.I) (y r)) (\\y.h (\\w.b)) ((\\w.o) (V u) (\\y.u f y)) (j U))))) (\\c.D (\\r.\\u.g))) (v (\\a.h) e)",
      "V"
    );
  }

  @Test
  public final void test348() {
    reducesTo(
      "\\h.\\q.(\\g.b (\\m.(\\c.(\\i.m) t J) (\\w.L)) f) (o (\\v.(\\l.o) (\\t.(\\p.t ((\\x.x) q G)) (\\a.\\k.w))))",
      "\\h.\\q.b (\\m.m J) f"
    );
  }

  @Test
  public final void test349() {
    reducesTo(
      "(\\q.\\x.\\a.(\\d.K g ((\\g.\\d.(\\b.J) (\\w.\\n.\\t.\\z.d) ((\\k.(\\p.F) (\\l.Y)) i (O (\\s.\\h.\\o.j)) (\\m.j))) (\\s.w))) (n (\\p.v ((\\z.\\t.\\p.\\a.G) (s (\\n.(\\n.\\r.\\l.d) (I j (\\i.z))) k))))) (\\h.\\i.\\a.(\\f.\\x.\\s.\\w.e) ((\\d.y (\\u.W)) (\\t.U)))",
      "\\x.\\a.K g (\\d.J (F (O (\\s.\\h.\\o.j)) (\\m.j)))"
    );
  }

  @Test
  public final void test350() {
    reducesTo(
      "\\g.(\\w.(\\g.H) ((\\y.\\y.m) (\\p.\\k.\\r.\\v.\\f.\\j.\\n.\\k.\\p.(\\m.(\\y.\\b.\\f.\\x.l) (\\k.y)) (\\m.\\j.(\\k.a) C (\\l.(\\g.D) ((\\k.d (\\z.t S)) u)))))) (o (\\i.\\g.(\\y.z) (\\l.(\\j.(\\l.(\\l.v) g d (\\a.(\\i.P) (f v) (\\a.z R))) z) L ((\\l.(\\r.z) (\\a.a (\\p.e (\\z.l) (w p (p y))))) (\\c.b)))))",
      "\\g.H"
    );
  }

  @Test
  public final void test351() {
    reducesTo(
      "\\w.\\e.R",
      "\\w.\\e.R"
    );
  }

  @Test
  public final void test352() {
    reducesTo(
      "\\e.x (\\m.Y) ((\\m.\\l.(\\m.(\\q.\\x.(\\i.r) (x E) (\\n.t o c) N) ((\\e.(\\x.o) (u I) l) (\\v.j)) T) (\\o.\\d.t) (\\k.o (\\h.(\\p.\\a.\\w.(\\i.\\d.(\\o.\\y.\\v.v (d D)) u) i) (\\o.a (\\z.\\k.n (\\x.q)))))) ((\\r.Q) ((\\h.\\t.(\\p.l W (c g)) (\\n.\\x.Z) ((\\u.d a) (B V r))) ((\\a.\\r.\\o.q t (\\y.K) (\\c.\\f.s)) (\\g.\\l.\\w.\\p.(\\d.a) (\\h.V)))) ((\\o.i (y ((\\j.H) H))) (\\d.\\h.W ((\\u.m) (\\s.A L h))) ((\\f.(\\u.D) (k d) (i (H I))) (a (\\u.(\\y.F) (v N))) (n y (Y z) (\\i.h) ((\\y.\\l.\\d.q) ((\\s.h) (o b)))))) (n h)))",
      "\\e.x (\\m.Y) (\\l.r (\\n.t o c) N (\\k.o (\\h.\\a.\\w.\\d.\\y.\\v.v (d D))))"
    );
  }

  @Test
  public final void test353() {
    reducesTo(
      "(\\v.P (g ((\\t.(\\b.q) (\\s.F)) (a n (\\s.x))) (G ((\\j.G (a t)) ((\\v.u) y)))) (D w) s) l ((\\s.n) ((\\u.\\w.(\\z.x (\\g.\\h.C)) (j Z)) ((\\c.\\t.\\c.\\z.m B) (\\d.\\r.(\\t.z A) (q Y (\\n.o)) (\\m.R (\\b.\\s.x A)) (\\f.M (O (\\t.v (y d)))) (\\a.S)))))",
      "P (g (q) (G (G (a t)))) (D w) s (n)"
    );
  }

  @Test
  public final void test354() {
    reducesTo(
      "\\k.\\t.(\\p.(\\n.a s) J ((\\i.(\\i.\\d.(\\n.t) ((\\k.\\g.w q) (\\v.O)) (J o (f a) (\\t.g) l)) ((\\k.\\a.U) n) h) (\\i.\\b.r ((\\j.(\\k.S) (\\n.\\u.d)) M (\\k.X (\\y.X) g) (\\k.\\r.\\z.g (H B (i L) (Z z A)) e))))) (\\v.\\j.(\\l.i) (\\q.\\q.m))",
      "\\k.\\t.a s (t (J o (f a) (\\t.g) l))"
    );
  }

  @Test
  public final void test355() {
    reducesTo(
      "\\q.x",
      "\\q.x"
    );
  }

  @Test
  public final void test356() {
    reducesTo(
      "\\s.\\x.K",
      "\\s.\\x.K"
    );
  }

  @Test
  public final void test357() {
    reducesTo(
      "\\h.(\\s.\\p.i) ((\\g.n (\\c.t) ((\\n.I) (\\c.y) O ((\\e.\\k.\\y.P) (H t (k m)))) (E (\\p.(\\c.\\g.\\x.(\\j.T U) B) ((\\m.u) H)))) ((\\v.\\e.\\e.\\t.\\e.G C v) (l (\\z.r) q) (b (\\o.\\k.\\n.H)) (d (\\z.h (l A (\\l.n)) P)))) s (\\z.\\e.v)",
      "\\h.i (\\z.\\e.v)"
    );
  }

  @Test
  public final void test358() {
    reducesTo(
      "\\c.\\s.\\b.\\d.\\l.\\m.\\r.(\\r.H h) (f ((\\m.(\\e.\\s.v (\\i.\\x.(\\i.(\\k.k) (\\b.e)) (C (\\f.Q)) (\\x.J (v (e q))) (\\e.\\k.(\\w.J) f))) (\\x.i)) (\\c.e)))",
      "\\c.\\s.\\b.\\d.\\l.\\m.\\r.H h"
    );
  }

  @Test
  public final void test359() {
    reducesTo(
      "\\w.\\x.\\p.\\s.\\e.\\d.R",
      "\\w.\\x.\\p.\\s.\\e.\\d.R"
    );
  }

  @Test
  public final void test360() {
    reducesTo(
      "\\w.\\t.j",
      "\\w.\\t.j"
    );
  }

  @Test
  public final void test361() {
    reducesTo(
      "(\\a.\\i.p (\\z.d (\\a.e (\\u.\\m.\\l.(\\f.\\y.v l g) ((\\f.\\z.\\f.(\\l.e) g) (\\c.l (\\g.g) ((\\x.K) J)))) (\\w.\\s.\\o.\\h.(\\g.\\n.J) (\\c.G (o E d) (\\j.(\\h.\\b.o) (M m (s g))) h))))) (\\j.\\l.B (\\g.(\\b.\\i.\\w.o b (u j (P X)) (\\s.h o) k) (\\q.\\m.\\y.\\r.O (\\b.m)) (\\l.N) (\\o.\\t.y)))",
      "\\i.p (\\z.d (\\a.e (\\u.\\m.\\l.\\y.v l g) (\\w.\\s.\\o.\\h.\\n.J)))"
    );
  }

  @Test
  public final void test362() {
    reducesTo(
      "(\\v.u (\\m.A)) g",
      "u (\\m.A)"
    );
  }

  @Test
  public final void test363() {
    reducesTo(
      "O (\\p.\\e.\\h.\\j.(\\l.\\n.p) ((\\v.\\a.\\l.T) ((\\r.n (\\s.S)) (q ((\\w.o) X))) (a (\\c.\\z.\\e.f ((\\s.S) (\\q.G)))))) G (\\z.\\k.\\w.i)",
      "O (\\p.\\e.\\h.\\j.\\n.p) G (\\z.\\k.\\w.i)"
    );
  }

  @Test
  public final void test364() {
    reducesTo(
      "(\\c.(\\w.J) H ((\\o.\\x.(\\b.(\\b.g) (\\n.h) (\\r.l r) (\\v.\\r.\\b.(\\f.E h) (m (d f))) ((\\c.(\\s.R) r z) (\\g.u)) (\\x.q)) (\\j.\\l.(\\e.o (\\h.d)) t ((\\a.p) o))) (\\c.\\v.m (\\q.Q (\\b.L (k M E)) d)))) (H (t (\\w.(\\j.(\\v.E x o) (e (\\h.V))) y)))",
      "J (\\x.g (\\r.l r) (\\v.\\r.\\b.E h) (R z) (\\x.q))"
    );
  }

  @Test
  public final void test365() {
    reducesTo(
      "\\s.(\\n.y) (\\j.e) d",
      "\\s.y d"
    );
  }

  @Test
  public final void test366() {
    reducesTo(
      "\\k.z",
      "\\k.z"
    );
  }

  @Test
  public final void test367() {
    reducesTo(
      "A (\\v.g)",
      "A (\\v.g)"
    );
  }

  @Test
  public final void test368() {
    reducesTo(
      "\\q.I",
      "\\q.I"
    );
  }

  @Test
  public final void test369() {
    reducesTo(
      "y (\\i.z)",
      "y (\\i.z)"
    );
  }

  @Test
  public final void test370() {
    reducesTo(
      "(\\i.\\r.l r) d",
      "\\r.l r"
    );
  }

  @Test
  public final void test371() {
    reducesTo(
      "\\y.(\\x.\\a.s) (\\g.u (q (\\h.(\\d.j) (P J) (\\g.w) ((\\n.\\u.\\o.H) U))) (\\y.\\l.(\\l.\\q.(\\t.J C (\\w.U)) (s ((\\a.b) (\\t.k)) (h (\\g.B) (M g (\\t.T))))) ((\\w.(\\g.\\p.\\k.Y) (h i A) (A F (\\f.M) h)) (j (\\o.\\q.Q)))) (P (G ((\\z.\\b.\\x.\\k.I) (\\z.C (\\q.U)))))) ((\\x.\\y.(\\z.\\e.w) (\\g.\\j.\\i.c ((\\p.U) (\\i.s)) j (\\t.\\h.(\\c.P) (\\x.n) (\\q.\\y.b) ((\\x.w) a)))) ((\\o.\\g.Y) p) (\\i.b) ((\\p.\\g.\\b.\\z.Y (\\d.(\\f.p) I)) (\\t.G)))",
      "\\y.s"
    );
  }

  @Test
  public final void test372() {
    reducesTo(
      "\\g.\\t.g",
      "\\g.\\t.g"
    );
  }

  @Test
  public final void test373() {
    reducesTo(
      "r ((\\d.(\\a.g) ((\\w.(\\a.j (v g)) (\\z.\\w.\\x.m) (\\e.(\\j.e) (L V) a) J) O)) (\\r.(\\l.\\d.S) v) (\\e.e))",
      "r (g (\\e.e))"
    );
  }

  @Test
  public final void test374() {
    reducesTo(
      "\\w.\\p.\\r.(\\g.\\o.\\k.\\g.\\v.J) (f ((\\o.u ((\\r.(\\u.\\d.\\c.(\\v.p) v u) t) c) (\\e.(\\v.(\\j.K) ((\\b.J) (\\c.n))) (t (\\g.o (\\p.f))) (\\e.I) (\\l.i))) (\\e.I ((\\x.s) f))))",
      "\\w.\\p.\\r.\\o.\\k.\\g.\\v.J"
    );
  }

  @Test
  public final void test375() {
    reducesTo(
      "(\\p.O) (\\k.m P)",
      "O"
    );
  }

  @Test
  public final void test376() {
    reducesTo(
      "(\\m.P ((\\r.(\\d.m (o l)) (\\r.o) (M p m p) ((\\u.x) (e z) (\\m.\\b.\\c.O) (\\z.(\\f.(\\r.h) (g p)) (f (C F)))) n (\\j.s ((\\g.\\m.\\w.e (\\u.A) e (\\g.x)) ((\\u.i) (Z Z) (\\b.(\\d.i) r) ((\\n.k) (\\h.Q) a))))) ((\\z.(\\a.(\\p.(\\r.\\y.\\o.v) (E (\\e.a))) (\\t.c (H t))) (\\s.\\i.\\s.\\p.\\g.(\\i.\\s.D) i)) E ((\\u.c) b)))) ((\\x.t) Y (\\o.h v) Z)",
      "P (t (\\o.h v) Z (o l) (M p (t (\\o.h v) Z) p) (x (\\m.\\b.\\c.O) (\\z.h)) n (\\j.s (\\m.\\w.e (\\u.A) e (\\g.x))))"
    );
  }

  @Test
  public final void test377() {
    reducesTo(
      "\\l.i",
      "\\l.i"
    );
  }

  @Test
  public final void test378() {
    reducesTo(
      "(\\k.\\f.\\g.s ((\\o.\\q.\\o.j) f (\\q.S) ((\\k.p) w ((\\d.q (J m)) (S (\\x.x)))) (n (\\s.a) u) (\\c.\\y.g) (\\y.C (\\s.(\\g.\\n.E) ((\\l.\\r.\\n.n) z ((\\i.K) ((\\r.\\d.Y j) (\\y.(\\s.F) (l I))))))))) (\\q.x)",
      "\\f.\\g.s (j (n (\\s.a) u) (\\c.\\y.g) (\\y.C (\\s.\\n.E)))"
    );
  }

  @Test
  public final void test379() {
    reducesTo(
      "(\\g.d) ((\\m.\\o.\\r.\\y.(\\m.\\b.t) ((\\i.Y g ((\\x.E) D)) (X (\\e.i)))) ((\\u.f ((\\h.A) v)) (c (U (\\r.\\y.\\z.q (\\p.\\z.d))))))",
      "d"
    );
  }

  @Test
  public final void test380() {
    reducesTo(
      "Y (\\k.(\\a.(\\a.T) (\\p.W)) e)",
      "Y (\\k.T)"
    );
  }

  @Test
  public final void test381() {
    reducesTo(
      "\\r.(\\r.\\c.\\v.(\\n.\\v.j) t) ((\\i.\\j.(\\j.Z) b) s)",
      "\\r.\\c.\\v.\\v.j"
    );
  }

  @Test
  public final void test382() {
    reducesTo(
      "\\w.y",
      "\\w.y"
    );
  }

  @Test
  public final void test383() {
    reducesTo(
      "\\l.(\\r.Q ((\\y.\\h.(\\q.\\c.\\s.\\q.u (i C (i Y) (\\u.D (\\l.u)) ((\\a.l) (\\r.\\a.\\x.y)))) ((\\t.p) ((\\g.g ((\\u.Q) (w e))) (d ((\\w.C) (l i)))))) (\\v.\\p.(\\l.\\t.\\p.t) (\\i.\\g.(\\h.l l) k ((\\q.\\e.\\m.q (\\k.\\z.b)) (\\u.u))))) (\\d.(\\s.Q (\\p.(\\e.F) (\\v.u))) (f ((\\j.(\\p.\\t.\\t.U) (E h (\\a.B))) X (\\e.\\s.J (J (j E) (\\y.t))))) F)) (\\h.q)",
      "\\l.Q (\\h.\\c.\\s.\\q.u (i C (i Y) (\\u.D (\\l.u)) (l))) (\\d.Q (\\p.F) F)"
    );
  }

  @Test
  public final void test384() {
    reducesTo(
      "(\\r.(\\c.o) (\\h.(\\t.\\e.R) (\\h.c))) (\\z.\\m.\\w.\\a.\\s.\\t.(\\f.(\\w.D) ((\\j.(\\j.(\\e.b) (\\r.q J (Q Z) (V l))) C) (B (\\d.\\x.r))) (\\h.\\g.P)) Y)",
      "o"
    );
  }

  @Test
  public final void test385() {
    reducesTo(
      "\\h.(\\k.\\w.\\q.\\c.\\x.q) (\\q.\\b.\\j.z L (b c) A X (\\y.e) (\\p.\\q.W (w (g (\\t.c)) (G R))) ((\\e.k) (\\q.\\g.R (z s l)) u U)) (\\q.Z) (\\o.\\z.l)",
      "\\h.\\c.\\x.\\o.\\z.l"
    );
  }

  @Test
  public final void test386() {
    reducesTo(
      "\\f.\\v.Q",
      "\\f.\\v.Q"
    );
  }

  @Test
  public final void test387() {
    reducesTo(
      "l e (\\c.x)",
      "l e (\\c.x)"
    );
  }

  @Test
  public final void test388() {
    reducesTo(
      "\\a.\\l.\\b.(\\q.(\\n.\\j.v) (\\z.(\\j.c) (l (\\n.\\j.N) ((\\o.g (I (p L)) (\\a.\\r.N (\\q.\\m.o))) (\\o.\\m.\\w.p ((\\p.f) (\\p.\\v.\\b.u))) (\\i.d))))) (\\z.V (\\v.(\\i.(\\b.\\y.(\\e.\\x.\\k.n) (\\v.\\e.\\f.\\o.\\f.(\\s.\\x.k l) (\\p.\\t.\\c.\\n.r))) (\\w.(\\p.(\\i.r) (I u) A ((\\h.(\\x.z) C) (\\r.k X (x T)))) (X (\\l.i (k h)) (\\e.J G (\\w.g) ((\\n.e) (\\x.u)))))) (h u)) (\\k.\\i.(\\f.(\\o.C) o) (r (N G H)) (\\o.l) (\\a.\\r.h m) (\\b.d (\\l.(\\h.H (j (x C (j w)))) ((\\y.\\r.\\s.K) (\\l.s) (\\p.\\f.(\\f.d J) s)))) (\\v.(\\p.(\\k.t S (\\x.u) (q Y (F v)) (\\j.\\l.(\\y.l q) q)) j ((\\p.\\u.\\d.O) (\\n.\\t.\\w.\\q.\\d.m))) (\\v.\\e.m))))",
      "\\a.\\l.\\b.\\j.v"
    );
  }

  @Test
  public final void test389() {
    reducesTo(
      "\\q.\\b.\\w.c",
      "\\q.\\b.\\w.c"
    );
  }

  @Test
  public final void test390() {
    reducesTo(
      "\\e.(\\d.(\\s.\\p.\\l.p (\\a.(\\j.\\j.(\\k.(\\s.\\x.K) ((\\e.h) (\\q.\\a.s r))) ((\\q.\\l.b i) ((\\s.D) (j i)) X)) z h)) (w u)) ((\\z.\\d.\\g.(\\c.\\y.k) X (\\p.\\y.v ((\\l.k) o r) y) ((\\s.\\x.(\\b.(\\z.E G) G) (\\m.\\r.j Y)) (\\c.\\p.(\\m.m) (C r) ((\\q.v) (\\z.u)) (\\i.(\\h.i) (Z j) (\\i.N F))) (l k ((\\b.c) (\\r.(\\w.I) Z))))) (\\i.(\\k.b) a) ((\\o.\\q.y) (\\n.(\\b.G) ((\\x.y q (W p)) ((\\i.k) (b l)) (\\y.\\m.\\y.\\n.\\b.r X (\\w.K)) (\\y.\\v.z)) (\\v.(\\j.R) B))))",
      "\\e.\\p.\\l.p (\\a.\\x.K)"
    );
  }

  @Test
  public final void test391() {
    reducesTo(
      "(\\y.\\l.\\d.Y (\\y.p)) (\\k.\\k.\\u.(\\m.x) ((\\d.\\a.f ((\\u.F (i d)) (\\a.n z (G j)) (\\v.n ((\\x.X) p)))) (\\k.(\\a.q) i z h ((\\n.\\s.\\h.(\\r.R i) (\\r.\\c.y)) (\\z.O))))) (\\p.\\y.\\j.R ((\\u.\\g.M) ((\\w.(\\w.\\h.(\\m.U) h ((\\x.k) (\\l.q))) ((\\x.X v K) (\\b.t))) H)) (\\w.(\\z.\\d.\\q.n) G)) (\\z.(\\w.\\k.(\\r.k) ((\\r.\\x.\\l.n) (\\e.\\b.J n)) (\\k.\\o.d (M b (\\m.q) Z))) R (\\v.o) (q (\\j.W) (\\m.\\i.m) ((\\t.(\\o.\\z.(\\q.(\\q.v) (c j) (\\m.N w)) (\\w.(\\i.\\f.v) a)) (\\l.V)) (f (\\i.l (i W (\\f.l))) S))) E)",
      "Y (\\y.p)"
    );
  }

  @Test
  public final void test392() {
    reducesTo(
      "(\\l.\\d.(\\u.k r a) s v ((\\c.(\\d.(\\o.\\i.Q ((\\v.h) (y t) (\\i.(\\p.d) (\\x.P)))) (\\u.\\b.\\v.\\z.(\\j.\\i.\\y.\\w.W w) B)) (\\o.\\l.k)) (\\w.x s (S s) ((\\q.F) ((\\f.d) b) (\\t.\\g.G)) Y)) (\\p.(\\x.y) x ((\\n.(\\n.k) ((\\n.n) (\\n.b l (s I) (\\v.E H (y I))) (\\d.(\\r.(\\y.M (\\q.q)) (\\c.\\y.t q)) ((\\y.G) (\\v.\\t.\\b.z))))) (\\v.(\\o.g (a (C (\\h.(\\o.J) (A K))))) (\\a.(\\h.y) v))))) d",
      "\\d1.k r a v (\\i.Q (h (\\i.\\o.\\l.k))) (\\p.y (k))"
    );
  }

  @Test
  public final void test393() {
    reducesTo(
      "\\u.(\\l.(\\c.\\c.\\h.A ((\\q.E) (\\e.v))) G) (\\j.\\t.\\g.\\j.(\\x.\\m.(\\m.(\\a.f) (\\k.D) ((\\d.a) (\\b.P) v) (r b z ((\\f.b) (i d)) (\\y.(\\b.\\z.\\n.b) (\\v.w x e))) (i c (\\e.(\\j.\\j.W) (x B (\\u.p) ((\\b.N) (t p)))))) c p) S)",
      "\\u.\\c.\\h.A (E)"
    );
  }

  @Test
  public final void test394() {
    reducesTo(
      "\\g.(\\m.L r (\\e.\\b.(\\q.O) (\\l.r) (\\i.q) ((\\p.t (B d (\\d.u) (i z I) (\\a.M h a G) (\\w.P (t ((\\v.r) g))))) (\\o.\\h.\\x.r)))) R",
      "\\g.L r (\\e.\\b.O (\\i.q) (t (B d (\\d.u) (i z I) (\\a.M h a G) (\\w.P (t (r))))))"
    );
  }

  @Test
  public final void test395() {
    reducesTo(
      "(\\k.y (\\g.(\\u.(\\k.\\p.\\z.\\k.\\s.P) (g ((\\i.i) i) (K c)) (\\r.\\u.Z)) (\\s.\\x.\\x.C (\\u.\\b.j ((\\w.\\k.w n) Q) Q)))) u",
      "y (\\g.\\z.\\k.\\s.P)"
    );
  }

  @Test
  public final void test396() {
    reducesTo(
      "\\a.z ((\\f.\\f.i) ((\\f.\\m.\\g.f) w))",
      "\\a.z (\\f.i)"
    );
  }

  @Test
  public final void test397() {
    reducesTo(
      "\\w.h",
      "\\w.h"
    );
  }

  @Test
  public final void test398() {
    reducesTo(
      "s (X ((\\v.\\k.R) ((\\q.p) (\\l.\\s.m))))",
      "s (X (\\k.R))"
    );
  }

  @Test
  public final void test399() {
    reducesTo(
      "\\i.F",
      "\\i.F"
    );
  }

  @Test
  public final void test400() {
    reducesTo(
      "\\c.\\y.\\q.\\a.\\n.s",
      "\\c.\\y.\\q.\\a.\\n.s"
    );
  }

  @Test
  public final void test401() {
    reducesTo(
      "x (d ((\\n.(\\r.\\r.\\e.(\\v.\\y.(\\b.n Z) (\\v.\\u.s)) (V c (I n) (h r (\\f.s)))) (\\l.k)) (\\n.\\x.(\\j.\\l.k v) v (\\y.\\q.(\\u.o p (\\u.\\x.P)) (x n)))) (E (\\k.w) ((\\r.(\\z.P l (s f) u) (\\z.A m m ((\\v.C) (t b))) (A f c ((\\j.y) ((\\e.I) (P q))))) (\\u.\\h.\\f.\\w.z (v y) V B ((\\i.\\w.\\y.u y (f S)) ((\\d.\\d.S h) (\\y.(\\e.N) (\\w.g)))))))) (p ((\\z.(\\n.n) (\\v.(\\j.\\x.\\r.p) D c) o) X (\\w.\\s.\\o.(\\e.c) (\\u.f ((\\u.w) (\\b.(\\r.m) m)) M m))))",
      "x (d (\\r.\\e.\\y.\\x.k v) (E (\\k.w) (P l (s f) u (A f c (y))))) (p (p))"
    );
  }

  @Test
  public final void test402() {
    reducesTo(
      "\\k.j ((\\b.x) (\\v.\\z.(\\m.(\\o.S) (\\c.p)) (\\e.d (\\l.b) (\\r.g (z H))) ((\\l.(\\e.Z) (R T (k U))) z)) ((\\b.\\d.I) (\\v.(\\w.(\\k.(\\v.z) h) (c u A) (\\k.y)) (I h (\\b.\\h.\\x.(\\f.\\c.K) S))))) (\\q.\\o.\\d.\\i.X j ((\\q.O) (\\j.l))) (\\i.(\\s.(\\q.\\t.(\\h.\\t.r (\\u.(\\w.f) (\\u.Z)) (\\j.\\j.m)) x v) (S (p (i c (\\r.K))) (\\x.(\\x.s E G (\\k.\\v.z T)) (i N (d N) t) u)) (\\r.\\c.\\p.i z)) (d ((\\s.Z) ((\\g.m) (\\b.q i j))) (q ((\\e.(\\w.T) (A P)) (D w (\\z.v))) (\\m.\\y.\\x.P ((\\j.m) (S h)) (H (\\j.\\a.c)))) (l a) G))",
      "\\k.j (x (\\d.I)) (\\q.\\o.\\d.\\i.X j (O)) (\\i.r (\\u.f) (\\j.\\j.m))"
    );
  }

  @Test
  public final void test403() {
    reducesTo(
      "\\w.c (\\j.a) ((\\p.\\n.K) (\\e.j) (\\g.a))",
      "\\w.c (\\j.a) (K)"
    );
  }

  @Test
  public final void test404() {
    reducesTo(
      "(\\l.I) (\\q.\\h.C (d ((\\t.\\b.(\\r.l h) ((\\s.i) (r i) (\\g.k))) (\\a.m ((\\m.\\d.V S) B)) (\\r.(\\y.\\c.\\l.(\\v.(\\c.J) (\\r.n)) u X) (\\w.o (\\k.\\x.s X) (\\x.\\g.\\t.\\n.\\x.\\m.U A)))))) t",
      "I t"
    );
  }

  @Test
  public final void test405() {
    reducesTo(
      "j (U ((\\x.G) E T) (\\q.Y)) (B (\\u.i)) (\\f.\\e.h) (\\b.Z) x",
      "j (U (G T) (\\q.Y)) (B (\\u.i)) (\\f.\\e.h) (\\b.Z) x"
    );
  }

  @Test
  public final void test406() {
    reducesTo(
      "(\\i.\\l.o (\\i.(\\c.\\r.(\\o.\\q.B) w) ((\\l.W) (\\y.v) o))) j (\\b.D (\\n.\\b.(\\d.(\\b.\\e.G) (\\t.\\z.L)) (\\n.x g)) (\\h.n (\\y.g))) (\\m.I d) ((\\s.(\\m.\\r.\\u.(\\t.v) ((\\b.\\g.m) (\\f.\\l.c a))) d ((\\k.B) (\\r.r (\\l.\\f.u t) v)) (y (\\j.\\j.f))) (n (\\z.b) s)) (w I)",
      "o (\\i.\\r.\\q.B) (\\m.I d) (v) (w I)"
    );
  }

  @Test
  public final void test407() {
    reducesTo(
      "\\x.(\\b.(\\d.\\y.\\l.o) a (\\o.Z ((\\h.c) (\\x.h n (e q) (Z (u s))) ((\\a.j) (\\o.(\\v.p) v) u)) (W (\\q.h l)) (\\s.\\m.\\n.\\y.(\\d.g) (\\f.\\j.f (c n) (J k (B s)) (x (\\f.\\h.s N)) (F (i (h u) (j H))) (X a ((\\a.\\r.X J) (Y (\\s.e))) (\\f.(\\x.(\\o.w) x (\\o.\\c.i)) (\\y.m))))))) (\\f.c)",
      "\\x.\\l.o"
    );
  }

  @Test
  public final void test408() {
    reducesTo(
      "(\\m.(\\g.(\\k.(\\z.\\e.s) (\\b.p) (\\b.(\\t.u) (\\e.\\l.h))) P k) ((\\u.\\t.\\b.k q) (E (\\z.d) (\\m.J)) w p ((\\f.\\v.(\\e.h) (\\b.k) j (\\i.\\j.a) y) ((\\c.J H) N))) (U g ((\\m.(\\n.o (\\t.\\w.(\\x.x) (\\n.u) (\\s.g I))) (\\j.b)) F) l)) (D (\\l.\\e.\\s.(\\y.\\z.(\\j.\\x.\\a.\\m.X (p H) (Q (s Y)) (\\k.c D)) ((\\g.\\e.K) (\\x.l)) (g ((\\i.(\\b.(\\l.v) (C r)) (\\e.(\\m.n) (\\v.E))) (I (W t) (\\v.(\\x.S) (\\k.e)))))) ((\\f.\\z.(\\b.q) (\\j.o) (d M (\\o.S)) ((\\g.a) (\\c.J) (\\m.\\t.b)) (\\u.\\r.v)) ((\\m.P f U (\\x.\\z.\\l.d)) (\\e.B (\\c.\\g.c X)) ((\\l.j) s))) G))",
      "s k (U g (o (\\t.\\w.u)) l)"
    );
  }

  @Test
  public final void test409() {
    reducesTo(
      "\\c.L",
      "\\c.L"
    );
  }

  @Test
  public final void test410() {
    reducesTo(
      "(\\e.o) ((\\p.\\k.(\\g.Y) ((\\f.T X (e h) (S m d)) (z D))) (\\v.\\x.(\\e.(\\q.O (\\l.\\z.z)) ((\\f.t) (k x) A)) (\\c.\\l.(\\c.(\\i.S k) (F (\\h.m))) (\\w.t u (b v) (\\s.z K)))) (p (\\b.E) (\\l.(\\i.j) (\\j.(\\a.\\a.(\\x.\\t.d) x) (\\l.(\\i.\\j.O) u))))) Y (\\w.j)",
      "o Y (\\w.j)"
    );
  }

  @Test
  public final void test411() {
    reducesTo(
      "(\\a.(\\e.\\v.K S) i (\\p.\\d.\\j.\\u.n)) (c ((\\t.\\u.A (U l (C r) a (\\c.b (\\k.b) (\\s.\\w.H)))) ((\\z.(\\x.(\\p.a) (\\f.p)) c) (\\o.\\a.L (\\x.d k)) (\\s.(\\l.\\h.\\i.y) g ((\\n.O p (\\d.g)) (\\q.\\c.J f)))) (\\w.(\\x.J) (\\o.\\o.\\z.\\a.\\e.\\g.\\y.v)))) (\\m.q)",
      "K S (\\m.q)"
    );
  }

  @Test
  public final void test412() {
    reducesTo(
      "(\\w.\\y.\\y.\\o.\\y.\\z.r) (r (\\l.\\n.(\\y.(\\y.w t) (\\l.n (\\c.\\l.x) e)) (A (\\r.\\l.(\\s.Z (Y p)) (\\v.\\c.\\b.(\\b.\\w.p) (\\q.\\h.f) (N B (H w) Y))))) (\\a.b (\\o.(\\f.\\z.h (\\d.\\t.(\\e.o) (\\h.(\\i.L s) k)) (\\j.\\o.(\\l.(\\g.\\n.\\o.x) ((\\e.S) (z Y)) (\\w.\\x.\\x.\\r.A (\\i.t))) (\\n.R d (\\q.p) (Q N (\\g.n)) (j b (I e) L)))) ((\\q.\\t.h) ((\\k.(\\w.v d) (x (\\p.\\s.F f))) S)))))",
      "\\y.\\y.\\o.\\y.\\z.r"
    );
  }

  @Test
  public final void test413() {
    reducesTo(
      "\\m.W",
      "\\m.W"
    );
  }

  @Test
  public final void test414() {
    reducesTo(
      "(\\b.\\g.c) (\\b.K) ((\\r.(\\s.\\i.(\\e.t) (\\x.n) (o R (y z)) (\\v.n) ((\\l.(\\f.Y) (f t) (\\v.\\u.\\s.f)) (\\e.d))) ((\\f.g d q) (I U (b a)) (p (g w (\\e.e))) (\\x.\\q.h ((\\z.z) J))) (W z (\\q.f) (X S (j f)) (\\a.(\\l.\\b.i b) (\\j.n X (\\u.W))) (\\b.t ((\\b.Y) (\\l.O) o)) (\\b.t ((\\p.v e ((\\l.y) v)) (c (\\k.d)))))) ((\\s.\\x.s) (o (\\q.\\m.a (\\b.\\j.k)) (\\a.Y)) (\\w.\\l.T (s (g N)) (\\p.\\d.(\\q.q g) (H E (k G))) ((\\s.(\\g.p) (V i)) (n o o) (h u)) (\\r.V)))) y",
      "c y"
    );
  }

  @Test
  public final void test415() {
    reducesTo(
      "(\\g.H) ((\\o.\\v.g (\\n.(\\x.\\f.\\i.Z) w (\\r.\\a.s)) (\\l.(\\n.(\\x.S) (\\k.O) k (\\j.\\l.\\m.j H (x T))) (\\m.O (\\f.\\t.(\\e.k) (R c) (i Z (g l))))) (\\q.\\z.\\p.\\l.v)) (\\m.\\j.(\\v.\\b.W) n ((\\t.\\y.\\o.\\v.t) ((\\m.m ((\\k.u) s)) T (\\r.F))))) o",
      "H o"
    );
  }

  @Test
  public final void test416() {
    reducesTo(
      "(\\t.a) ((\\g.(\\t.\\y.(\\c.(\\l.(\\h.(\\y.B r) n) (\\w.A)) (\\q.s (S (h W) (\\n.b (z U))))) U) ((\\e.(\\q.c) (\\t.y)) (\\f.\\s.\\g.\\v.(\\v.\\z.\\n.\\i.V) j (\\d.\\m.\\w.(\\o.\\i.x) (\\e.\\s.r) n))) ((\\d.s h) (g (z (\\y.\\u.\\b.M) ((\\e.\\s.\\t.X) (t x x)))) V)) (n (\\x.\\a.u)))",
      "a"
    );
  }

  @Test
  public final void test417() {
    reducesTo(
      "\\j.\\h.q (\\d.(\\x.\\o.\\g.\\u.(\\o.(\\y.\\f.J t) f (\\w.A)) (\\b.\\q.a)) a (\\n.(\\h.\\r.K) ((\\h.r x (\\k.a) (u y (\\u.o))) (s ((\\v.q) (x q))) (D (a (\\q.z) (Q x (D y)))) (\\p.x) y)))",
      "\\j.\\h.q (\\d.\\g.\\u.J t)"
    );
  }

  @Test
  public final void test418() {
    reducesTo(
      "C (\\g.d)",
      "C (\\g.d)"
    );
  }

  @Test
  public final void test419() {
    reducesTo(
      "\\s.\\t.P",
      "\\s.\\t.P"
    );
  }

  @Test
  public final void test420() {
    reducesTo(
      "v ((\\n.q (\\g.(\\a.q) ((\\w.\\t.k) ((\\d.Z) (f O) H)))) (\\y.\\o.\\e.C) (\\z.\\e.\\h.(\\f.\\o.p r z (\\q.(\\g.w) (\\e.q)) (\\d.\\o.h z) W) ((\\x.f) ((\\m.\\t.L) F)) (l (\\l.(\\t.q) ((\\w.I) ((\\o.m) (\\z.a))) (j (t (F J) (\\q.\\m.w))))))) m",
      "v (q (\\g.q) (\\z.\\e.\\h.p r z (\\q.w) (\\d.\\o.h z) W)) m"
    );
  }

  @Test
  public final void test421() {
    reducesTo(
      "\\y.Q",
      "\\y.Q"
    );
  }

  @Test
  public final void test422() {
    reducesTo(
      "o (\\j.(\\v.F) ((\\m.(\\z.\\w.\\y.p) (\\w.\\i.E (k B) (d (\\y.n)) (Z Z) ((\\n.f) (\\j.a) (\\n.\\l.\\a.S) (M v y ((\\p.w) (d H)))) ((\\z.l) K ((\\r.(\\g.i) (\\w.c)) (\\v.\\u.P d)) c))) N))",
      "o (\\j.F)"
    );
  }

  @Test
  public final void test423() {
    reducesTo(
      "\\e.q (\\i.(\\k.h) c)",
      "\\e.q (\\i.h)"
    );
  }

  @Test
  public final void test424() {
    reducesTo(
      "\\l.v ((\\g.s ((\\v.n (\\d.(\\n.H y Q) (\\g.j n n))) (h k))) (o (A (\\l.T) (\\w.\\q.\\d.f)))) M (\\e.(\\v.(\\v.(\\t.\\m.\\g.\\p.(\\m.\\m.\\f.b q (\\a.h)) (\\o.(\\j.\\g.K) c) a) ((\\s.E) ((\\x.R x z) (D X (D m)) i)) i) v) p)",
      "\\l.v (s (n (\\d.H y Q))) M (\\e.\\g.\\p.\\f.b q (\\a.h))"
    );
  }

  @Test
  public final void test425() {
    reducesTo(
      "\\g.b (\\e.(\\s.(\\z.V g) C) (y (\\g.(\\g.W ((\\n.\\r.\\k.M) (\\n.z))) (p e (\\u.i) q (\\l.\\n.\\x.\\p.m f (\\n.e)))) (\\i.\\h.(\\v.e (\\i.(\\h.i j (\\m.T)) (c q (\\e.a)) (u (v P p)))) o))) (\\f.w)",
      "\\g.b (\\e.V g) (\\f.w)"
    );
  }

  @Test
  public final void test426() {
    reducesTo(
      "v (\\f.\\x.\\l.k)",
      "v (\\f.\\x.\\l.k)"
    );
  }

  @Test
  public final void test427() {
    reducesTo(
      "(\\f.(\\k.(\\z.\\x.\\p.o (\\a.T n (\\w.d) (\\z.h (\\w.B)) (\\q.(\\y.p k) h))) ((\\o.N) (\\o.f (x i) (m (\\s.d)) (o (\\a.Q))))) l (\\b.(\\h.N) n) ((\\i.(\\y.\\i.c) (\\r.\\e.\\t.(\\z.\\d.j s) (\\j.\\j.\\f.S) (\\u.\\r.\\z.(\\m.P) (\\r.l)) (k v o (\\t.b (\\n.b)))) ((\\i.\\c.(\\g.\\e.\\a.C (\\y.x)) (h (\\x.h W (\\z.i)) y)) b)) v)) r",
      "o (\\a.T n (\\w.d) (\\z.h (\\w.B)) (\\q.c l))"
    );
  }

  @Test
  public final void test428() {
    reducesTo(
      "\\u.\\u.\\x.(\\l.n i) (\\o.m (\\d.\\n.\\m.(\\s.g) (g (f O (v l)) D) h (\\i.\\l.(\\m.(\\d.(\\z.\\p.O) T) (q (\\r.z) (\\x.\\c.\\b.c))) (\\j.\\n.T J) (\\w.\\n.g))) ((\\v.\\v.\\g.E) ((\\y.f (\\e.Z)) g (\\k.\\q.y (\\p.i d)) (\\k.\\w.(\\c.R i (\\u.g) V) (a (\\z.T))) (\\e.\\w.(\\q.C) (\\f.(\\y.(\\c.a) (g g) (\\g.\\u.s)) (\\m.(\\t.G) (n s) (\\r.d s))))) d))",
      "\\u.\\u.\\x.n i"
    );
  }

  @Test
  public final void test429() {
    reducesTo(
      "\\q.(\\r.\\u.(\\g.y (\\h.(\\i.c) k)) ((\\g.\\c.(\\n.i) (\\k.\\h.\\o.(\\s.\\o.\\l.t) ((\\o.J) (p u)) (d ((\\n.q) (\\j.n))) m)) ((\\n.\\n.N (\\h.x o (u H)) d) (\\g.(\\p.t) (\\z.\\v.\\v.h) ((\\h.k) (B u) (a (\\b.A)))) ((\\n.b (\\g.(\\u.p) (y W) (i (h s)))) (\\v.V))) (c (I u)))) (\\t.\\e.\\v.U (\\i.(\\m.(\\b.u D (j E) (\\l.(\\j.a) (\\x.c)) (j A (g v) (d (\\h.g))) (J F)) (\\x.(\\c.\\b.\\o.Y) (\\h.(\\t.\\k.M) ((\\r.m) (\\k.p) (\\g.\\p.n T)))) ((\\p.x) (E p) (l N (t X)) C ((\\i.W) ((\\d.n (\\p.b)) (\\q.X))) (\\m.C U))) v))",
      "\\q.\\u.y (\\h.c)"
    );
  }

  @Test
  public final void test430() {
    reducesTo(
      "O (\\s.(\\p.v) (\\u.\\k.\\f.\\k.q))",
      "O (\\s.v)"
    );
  }

  @Test
  public final void test431() {
    reducesTo(
      "\\e.\\n.\\r.\\o.(\\e.K) (\\d.\\w.\\n.k) l ((\\r.j) (\\n.\\u.(\\s.\\p.J f) ((\\w.W) f) (\\g.x))) (\\n.\\x.w) s (\\t.\\p.V ((\\a.(\\o.p) (\\g.(\\f.(\\u.b) (S r)) (l w (M E)))) (\\l.\\k.\\v.(\\z.l (\\s.Z) ((\\z.x) W)) G)) P ((\\w.(\\o.\\v.i) (\\t.\\m.\\a.\\h.(\\j.E e (K E) (W J)) u ((\\a.Z) (\\f.(\\f.g) (x R) Z)))) (V (\\r.\\k.i) (x m)))) ((\\f.q t) ((\\p.D (Y ((\\u.Z) (F f)) (\\o.(\\x.r) ((\\i.N) f)))) (\\y.w) (\\i.A s)) U)",
      "\\e.\\n.\\r.\\o.K l (j) (\\n.\\x.w) s (\\t.\\p.V (p) P (\\v.i)) (q t U)"
    );
  }

  @Test
  public final void test432() {
    reducesTo(
      "\\q.(\\y.(\\e.(\\x.(\\u.(\\d.(\\f.v (\\f.s)) (u (\\j.x a (g z)))) (\\k.I (\\k.r))) d ((\\k.M) D)) (C ((\\g.\\z.\\u.B (\\n.b)) ((\\m.v) P ((\\g.\\f.\\n.\\u.v (N b)) (v k i)))))) (\\h.\\r.\\j.H)) (\\b.\\o.\\q.x (\\i.\\r.\\k.e))",
      "\\q.v (\\f.s) (M)"
    );
  }

  @Test
  public final void test433() {
    reducesTo(
      "\\z.\\z.(\\k.m) (\\w.(\\s.A (\\o.p)) ((\\s.\\c.k i t (\\b.U)) ((\\s.\\l.o v) (\\a.(\\e.r) (\\e.k))))) ((\\m.Q) (\\b.(\\r.U j (q p) O ((\\u.\\h.u l) c)) (\\t.\\z.i (\\d.\\m.o O) ((\\j.Z) (l g (w g)))))) (\\d.\\h.(\\b.\\q.(\\r.g ((\\j.U) q)) (\\f.\\f.U ((\\k.\\n.h) (w v (L j))) (x v))) (\\t.u)) (G ((\\n.(\\m.W p) H) (\\z.\\x.U (W (B x)) (p (Z X))) (v u (b (\\f.n)))) v) (\\u.\\e.(\\l.\\h.H) (\\m.\\g.p) B)",
      "\\z.\\z.m (Q) (\\d.\\h.\\q.g (U)) (G (W p (v u (b (\\f.n)))) v) (\\u.\\e.H)"
    );
  }

  @Test
  public final void test434() {
    reducesTo(
      "\\n.\\x.(\\b.u ((\\z.j) (q I) (\\q.m)) A (\\l.(\\d.\\e.u) (\\u.(\\g.W) (n r)) (H q Z (\\m.(\\j.f) (F f))) (\\u.\\l.\\i.\\l.(\\k.y) (\\x.J))) (\\g.(\\g.(\\k.\\z.(\\z.(\\x.B) ((\\s.g) (w c))) (\\y.K)) ((\\q.\\e.\\h.v (\\k.Z)) ((\\l.(\\l.K) u) x))) (w ((\\w.x) ((\\o.\\u.\\x.a) (\\x.\\z.\\m.p))))) (\\g.W)) o v",
      "\\n.\\x.u (j (\\q.m)) A (\\l.u (\\u.\\l.\\i.\\l.y)) (\\g.\\z.B) (\\g.W) v"
    );
  }

  @Test
  public final void test435() {
    reducesTo(
      "\\f.\\h.h n (\\i.j ((\\b.\\r.(\\e.\\b.\\b.\\y.\\f.k) ((\\h.(\\z.x) x) (m Q)) ((\\o.(\\a.i) (\\l.U)) (r j (Q h)) (c (m (k M))))) u)) A ((\\j.\\x.(\\n.\\n.(\\h.G) ((\\n.\\e.i) J) i) (\\c.(\\e.\\e.\\b.\\o.\\n.\\e.(\\w.\\i.\\z.\\g.\\c.y ((\\e.a) (\\v.f))) ((\\h.K) (\\b.o) (r (Z K)) (\\f.j (n F)))) (\\i.l)) (\\t.(\\u.X (\\u.\\u.q)) ((\\e.(\\d.M) ((\\s.x F w) (M r (\\c.A)))) (\\s.(\\x.(\\r.c) (\\m.N)) b ((\\i.\\q.\\l.i) ((\\q.p) u))) s))) (J ((\\v.\\q.\\t.\\i.\\y.f n) (\\l.b)) (\\t.w (a (\\u.\\t.y (\\v.\\r.e)) (\\i.\\d.(\\y.T (K (\\a.V))) (\\d.P)) ((\\i.i ((\\l.b) z) n) (\\z.(\\y.\\a.(\\i.\\n.r) (a P a)) o))))))",
      "\\f.\\h.h n (\\i.j (\\r.\\b.\\y.\\f.k)) A (\\x.G i)"
    );
  }

  @Test
  public final void test436() {
    reducesTo(
      "(\\i.\\h.R) (\\z.\\y.l) (q (d ((\\q.L e (\\u.Q) k) (b (\\n.v B (s E))) (v g (\\i.H) ((\\r.\\f.x) (\\z.y))) (H e) (\\r.\\f.(\\r.J) ((\\q.C j (\\y.d)) (\\d.\\q.M)) (t K) m))))",
      "R"
    );
  }

  @Test
  public final void test437() {
    reducesTo(
      "F ((\\z.\\g.(\\b.(\\t.(\\z.\\n.(\\o.\\i.K) (\\g.\\f.o) c) (\\j.(\\g.j) (\\y.\\d.M) p)) (o (n (\\m.(\\k.r) S ((\\z.v) p)))) i) (\\a.\\j.X)) F)",
      "F (\\g.K)"
    );
  }

  @Test
  public final void test438() {
    reducesTo(
      "\\v.(\\x.d) g (\\l.\\m.(\\n.m) (\\w.(\\h.\\x.(\\k.m q) S) (\\q.\\a.T) (\\g.\\q.t) (\\t.M)) (r ((\\p.(\\t.(\\e.B) (\\z.g)) (c A) (\\u.\\w.\\z.N)) (w ((\\o.t) (\\u.a)) (\\d.z (\\s.\\e.I v)))) (\\o.\\e.f (g (L f)) (\\z.A) G ((\\m.(\\m.\\i.(\\q.a) (h f) h) ((\\z.s l (\\f.O)) (\\e.N))) (\\y.(\\d.x z (\\d.U) (\\w.Y)) (\\d.\\u.r)))))) ((\\c.Y h) (\\y.\\w.b (\\g.\\q.\\f.x) (\\w.Z) R))",
      "\\v.d (\\l.\\m.m (r (B (\\u.\\w.\\z.N)) (\\o.\\e.f (g (L f)) (\\z.A) G (\\i.a h)))) (Y h)"
    );
  }

  @Test
  public final void test439() {
    reducesTo(
      "\\g.f (G ((\\p.f u (\\y.q)) (f W h) (Y k (A j) (L (x J))) (\\q.\\u.\\p.(\\r.w c (\\t.f)) (\\t.Y) P) (\\g.(\\a.\\f.i) (m l) ((\\z.\\g.\\c.g) K) ((\\s.\\p.\\j.x (\\q.D) (F b (\\y.N))) (\\h.(\\a.s) v c)))) (\\a.c) j)",
      "\\g.f (G (f u (\\y.q) (Y k (A j) (L (x J))) (\\q.\\u.\\p.w c (\\t.f) P) (\\g.i (\\p.\\j.x (\\q.D) (F b (\\y.N))))) (\\a.c) j)"
    );
  }

  @Test
  public final void test440() {
    reducesTo(
      "(\\k.b) (\\f.b (\\n.\\t.k) (\\a.e (\\t.s)))",
      "b"
    );
  }

  @Test
  public final void test441() {
    reducesTo(
      "e ((\\k.\\o.(\\j.(\\s.h) ((\\x.v F (\\i.i) (T g (\\g.L)) (\\j.\\s.\\p.\\n.\\u.\\o.u)) (Q (\\v.\\e.(\\s.\\v.i) H)))) (s (S F (\\m.c)))) (k (\\s.b) ((\\z.\\p.n (\\o.\\c.p b) (\\j.g ((\\r.P) v)) ((\\n.Z) (\\g.i) (\\p.(\\m.j) N) (\\n.(\\n.\\z.\\j.r) (\\y.U (t j))))) f)) (x (\\g.z (x e n) ((\\i.\\c.(\\w.q) (X G) (u (k n))) (Y N (m z) (\\v.g)) s ((\\z.x (\\o.\\j.F)) y)))))",
      "e (h)"
    );
  }

  @Test
  public final void test442() {
    reducesTo(
      "Y (\\m.V) (\\e.l w ((\\d.g ((\\r.m) ((\\c.n (\\z.\\h.(\\s.A) ((\\h.k) (\\k.f)))) ((\\r.Y) (\\a.Q) (\\x.(\\u.Q) a) (d (\\u.q c (\\m.D))))))) (\\e.\\f.\\z.(\\l.(\\u.(\\x.(\\l.\\f.L M) c) (\\u.f) a) ((\\g.k (\\n.s)) (m u) (a Y (\\m.o v (\\k.z))) (\\h.d (\\g.b (\\m.u)) (\\p.\\u.Y (h (L M)))))) (\\f.(\\t.\\d.a (\\u.J (\\t.Z) q) ((\\b.\\u.o) (\\g.\\h.(\\a.n U) ((\\o.r) (\\l.o))))) ((\\j.\\b.(\\p.\\y.\\h.r) (\\r.(\\l.e r) (l p v))) ((\\h.x) ((\\d.r (\\b.e)) (\\d.(\\g.q) (G R)))))))))",
      "Y (\\m.V) (\\e.l w (g (m)))"
    );
  }

  @Test
  public final void test443() {
    reducesTo(
      "\\k.n r",
      "\\k.n r"
    );
  }

  @Test
  public final void test444() {
    reducesTo(
      "(\\h.(\\n.\\f.\\r.I) t M) v",
      "\\r.I"
    );
  }

  @Test
  public final void test445() {
    reducesTo(
      "\\x.(\\k.b) d",
      "\\x.b"
    );
  }

  @Test
  public final void test446() {
    reducesTo(
      "(\\x.R) j ((\\p.(\\i.o) ((\\x.\\d.(\\u.i v) h) ((\\u.\\p.k b) ((\\v.\\d.s I) ((\\u.z) (f l) (\\n.(\\q.z) (F u)) v))))) ((\\w.E) Q h))",
      "R (o)"
    );
  }

  @Test
  public final void test447() {
    reducesTo(
      "n (x (\\q.\\p.\\y.c) (\\m.p) (t ((\\y.\\g.(\\n.\\d.o) (\\u.l g (m t)) y (F (\\j.(\\x.\\s.\\s.M) J))) ((\\l.L) y (\\x.(\\x.(\\j.i) Q) u)) ((\\x.\\n.\\a.(\\y.\\q.g) (\\r.u k)) (\\f.T u v (\\v.\\k.\\q.X)) (W W) (\\y.(\\k.(\\d.\\g.m C ((\\j.x) (D y))) (\\j.\\w.(\\c.\\n.i) (B G (m B)))) ((\\b.D) (U c) (\\o.\\n.G j) ((\\s.o) (F i) (m F a))))))))",
      "n (x (\\q.\\p.\\y.c) (\\m.p) (t (o (F (\\j.\\s.\\s.M)))))"
    );
  }

  @Test
  public final void test448() {
    reducesTo(
      "\\k.u",
      "\\k.u"
    );
  }

  @Test
  public final void test449() {
    reducesTo(
      "\\b.a",
      "\\b.a"
    );
  }

  @Test
  public final void test450() {
    reducesTo(
      "\\k.\\e.S ((\\v.\\n.\\f.G) ((\\t.d) (y c (\\c.c) ((\\s.\\g.(\\w.Q) W) ((\\k.x) ((\\d.e) (\\o.l)) (\\w.i)))))) ((\\n.(\\f.\\n.\\f.(\\t.\\p.i) ((\\f.\\f.n) (o l E))) (a (\\a.e) c ((\\j.\\e.v j) ((\\v.n) q)))) s ((\\z.(\\a.\\a.o) z ((\\o.a) (\\i.\\e.\\g.N) ((\\o.(\\s.O) (v v)) (\\k.\\c.y a)))) (N k)) L (\\i.(\\o.l) (\\b.\\o.\\l.(\\v.h) d)))",
      "\\k.\\e.S (\\n.\\f.G) (i)"
    );
  }

  @Test
  public final void test451() {
    reducesTo(
      "\\i.i (p (u (\\b.(\\n.\\e.Y ((\\r.(\\k.w) (N N)) (\\d.(\\m.k) w)) (b k)) (\\g.j) (\\q.\\c.\\a.(\\s.d) ((\\u.\\g.\\t.i) ((\\n.\\y.r) ((\\h.e) (\\m.q)))) V))))",
      "\\i.i (p (u (\\b.Y (w) (b k))))"
    );
  }

  @Test
  public final void test452() {
    reducesTo(
      "(\\e.q) (\\c.(\\k.T) (\\f.F) ((\\m.(\\j.f) ((\\m.f) D)) (\\s.R (R b) (\\n.z u Y))) (\\i.\\t.\\l.\\m.h) (\\y.O)) (\\h.(\\g.l) ((\\i.\\p.X) ((\\v.\\v.u m) (\\f.\\s.O k)) (\\z.\\q.(\\e.o) (f g) (v (k q)) (d (p c S))) (\\x.Y)) (\\k.\\h.g)) (\\j.\\j.\\m.\\g.g)",
      "q (\\h.l (\\k.\\h.g)) (\\j.\\j.\\m.\\g.g)"
    );
  }

  @Test
  public final void test453() {
    reducesTo(
      "\\n.\\o.(\\e.\\q.\\a.(\\y.G (\\y.\\s.\\d.\\a.\\w.W (z s) (\\g.\\l.m) (\\p.\\y.\\r.X (o y))) (h (\\p.\\u.(\\a.v) (\\q.n) ((\\w.l) (S N))) z)) (\\v.Q) (\\e.\\j.j)) ((\\g.\\o.\\q.(\\f.\\h.(\\b.\\r.s x (\\w.p)) (\\r.e)) (J I ((\\z.K d) (\\q.o)))) ((\\e.\\o.\\e.\\m.n) (\\o.(\\s.e (\\w.\\n.\\q.\\u.\\r.(\\f.z) ((\\q.M) (t M)) (\\h.i))) ((\\s.\\z.\\o.(\\i.i g) d) (i U (a f) (I c (\\y.F))) ((\\f.c) (\\a.t) (Q O (\\q.n)) d))))) (\\z.l)",
      "\\n.\\o.\\a.G (\\y.\\s.\\d.\\a.\\w.W (z s) (\\g.\\l.m) (\\p.\\y.\\r.X (o y))) (h (\\p.\\u.v (l)) z) (\\e.\\j.j)"
    );
  }

  @Test
  public final void test454() {
    reducesTo(
      "(\\g.k w) (J ((\\r.(\\t.\\d.(\\g.(\\u.\\g.h) ((\\g.m) H)) (B (e f) (\\n.(\\j.k) (q d)))) (\\d.h) (\\t.e (y ((\\a.Q) (\\e.t))) k)) (g ((\\h.T) v) M) (\\x.(\\r.(\\m.h) (\\b.\\d.\\f.b)) u)))",
      "k w"
    );
  }

  @Test
  public final void test455() {
    reducesTo(
      "\\w.R",
      "\\w.R"
    );
  }

  @Test
  public final void test456() {
    reducesTo(
      "(\\g.a q) (\\c.(\\c.\\u.w) (\\n.\\q.\\y.(\\f.r (\\r.X B) (\\z.t)) (Z Y (\\i.i f) (\\n.(\\a.\\b.\\d.e) (\\y.b a j)) ((\\d.\\f.\\x.\\w.\\u.(\\t.K) (r b)) (\\f.v))))) ((\\b.d ((\\p.\\l.\\u.\\q.g (a m)) (\\e.(\\z.\\m.G r) ((\\t.X) (D h))) ((\\m.P) Q M w))) (\\a.(\\a.(\\x.\\k.t u) (\\p.(\\i.j) (Q F)) (\\h.n (\\x.e) b)) (\\y.\\y.f) ((\\e.\\d.E) (\\j.V))) (\\n.A (\\r.\\g.K))) (\\d.\\a.\\b.V ((\\c.s) (\\g.z)))",
      "a q (d (\\u.\\q.g (a m)) (\\n.A (\\r.\\g.K))) (\\d.\\a.\\b.V (s))"
    );
  }

  @Test
  public final void test457() {
    reducesTo(
      "(\\w.(\\p.\\r.p) (\\a.f) ((\\p.l) ((\\r.(\\c.h (\\r.e)) I) (\\w.(\\o.y) q (m j e))) ((\\j.(\\y.(\\l.i) (\\n.P) ((\\w.t) (A M))) (i r)) (k (\\p.l) U y))) E) (y (\\v.(\\q.J) ((\\q.\\s.\\n.z G (\\x.\\l.h) ((\\t.\\v.g h) ((\\l.j) (Z y)) (y a (\\d.P) (\\q.I)))) ((\\j.\\r.\\f.(\\i.j) (a W) (k (B M))) (\\a.j ((\\h.S) i)) (r ((\\k.\\e.s) x)))))) ((\\j.(\\a.u T (\\m.s) (\\i.(\\g.k) (\\x.q))) (\\k.x) (\\t.q) r) A I ((\\n.(\\e.\\q.(\\y.\\s.\\n.d (\\w.v)) (r (J l) l)) (\\t.(\\n.\\p.\\n.\\b.(\\x.i) (o k)) (\\f.(\\w.Z) x (\\x.(\\g.q) (x g)))) (\\e.\\a.\\j.(\\p.F) E)) (\\z.(\\p.Q g e (\\y.h) (\\t.(\\s.\\u.Z v) ((\\a.l) (\\h.g))) ((\\a.N) ((\\t.\\c.\\r.z) ((\\c.e) Q)))) (d (\\s.\\v.e))) (\\n.(\\a.s) (\\d.G))))",
      "f (u T (\\m.s) (\\i.k) (\\t.q) r I (\\n.d (\\w.v)))"
    );
  }

  @Test
  public final void test458() {
    reducesTo(
      "T (k ((\\r.V) (\\z.\\r.\\d.\\k.\\p.\\i.H q)))",
      "T (k (V))"
    );
  }

  @Test
  public final void test459() {
    reducesTo(
      "\\j.s",
      "\\j.s"
    );
  }

  @Test
  public final void test460() {
    reducesTo(
      "P (\\b.(\\i.\\w.(\\x.(\\s.c) (\\u.i) (\\n.\\h.G) l) (\\s.(\\q.P) (\\e.(\\o.n) (\\y.Z q)))) ((\\d.\\a.\\j.\\i.(\\b.k l) (\\l.p p) c) ((\\g.F (p (d N))) (g Q (w o) (n m k))))) ((\\j.h (D T h (\\d.z L (R i))) (f (L C (I M) (\\k.\\s.\\l.w)))) (t ((\\d.x e) (d (S D))) (Y (\\h.r))) ((\\u.\\h.z (b (\\l.\\i.S))) (u v (C Z) (t x (\\m.s)) (C L (\\j.k) (\\b.(\\v.j) (q m))) (\\o.\\d.(\\z.\\q.(\\o.N) (\\p.n) (L K (r x))) (\\u.(\\r.\\g.J) ((\\x.g) (\\o.l))))))) (\\e.G (\\c.(\\r.c) q)) (\\t.\\p.(\\p.(\\i.g (K N m ((\\t.\\v.\\q.(\\w.r) (X u) (\\n.x)) ((\\b.\\e.c y) (\\y.\\f.t)))) (\\r.R)) l) ((\\w.m (\\q.j y (f t) (g (x r))) ((\\y.s) b ((\\s.\\v.Q D) ((\\l.q) (\\j.A)))) G) P F))",
      "P (\\b.\\w1.c (\\n.\\h.G) l) (h (D T h (\\d.z L (R i))) (f (L C (I M) (\\k.\\s.\\l.w))) (\\h.z (b (\\l.\\i.S)))) (\\e.G (\\c.c)) (\\t.\\p.g (K N m (\\v.\\q.r (\\n.x))) (\\r.R))"
    );
  }

  @Test
  public final void test461() {
    reducesTo(
      "(\\y.(\\k.(\\f.S) ((\\y.Y (a r)) (f (o h))) (l (\\x.y) R (\\m.h)) (\\u.(\\q.\\d.\\i.x) (\\n.(\\i.b) n ((\\e.T) (K c)) (\\r.B)))) (\\n.\\a.(\\x.t (\\k.\\d.\\d.A)) q) (\\e.e ((\\s.u (d j G) (i w) (x Z s ((\\b.W) a) (\\k.\\d.\\g.\\n.\\k.w L p))) ((\\w.\\y.(\\a.u) (\\w.e) ((\\d.c) (\\j.b))) (x f (\\j.l)) (p (a (\\h.b) x)))))) ((\\k.(\\p.(\\j.v) ((\\c.Y) (\\d.\\o.\\h.f)) (\\y.\\e.I (S (v S)) (v k))) (\\o.(\\z.\\n.\\v.\\w.L j) (G (b o) (r (z V))) (\\i.z ((\\u.i v) (\\m.r))))) (\\c.r) (\\d.(\\v.H n (\\f.h f (\\e.Q) ((\\d.p) (W g) z)) (\\b.z)) (s S))) (d (\\i.\\y.\\t.\\a.\\c.U))",
      "S (l (\\x.v (\\y.\\e.I (S (v S)) (v (\\c.r))) (\\d.H n (\\f.h f (\\e.Q) (p z)) (\\b.z))) R (\\m.h)) (\\u.\\d.\\i.x) (\\e.e (u (d j G) (i w) (x Z (u (c)) (W) (\\k.\\d.\\g.\\n.\\k.w L p)))) (d (\\i.\\y.\\t.\\a.\\c.U))"
    );
  }

  @Test
  public final void test462() {
    reducesTo(
      "(\\v.\\v.\\f.C (\\r.S) ((\\h.(\\n.t (L (\\s.(\\e.c) v) (\\d.t)) (h z)) (\\x.z)) w)) l",
      "\\v.\\f.C (\\r.S) (t (L (\\s.c) (\\d.t)) (w z))"
    );
  }

  @Test
  public final void test463() {
    reducesTo(
      "(\\x.p (\\d.V) (q (\\t.(\\y.\\p.\\b.\\e.\\p.\\w.l) (\\a.\\t.\\y.\\r.(\\l.\\t.(\\l.L) (\\v.j)) m)) O)) g ((\\n.\\n.\\j.(\\r.(\\d.c (\\w.\\y.M)) (\\r.\\n.b (\\a.m g ((\\n.h) (\\d.D)) (l (\\t.\\w.t z)))) (\\h.g)) (\\y.(\\d.E) ((\\e.s) (\\l.k)) ((\\s.\\q.\\u.\\s.H (\\f.r u) (\\f.(\\y.J) (\\h.b x))) ((\\t.M) ((\\d.x) (e V)) J) e))) (\\d.(\\k.m B (\\u.r A (a g) f (\\l.r)) V) (\\g.\\x.\\z.\\c.\\v.\\p.Z n) ((\\m.(\\g.\\x.\\o.e (\\s.x) q (\\p.(\\h.\\i.\\w.(\\b.W) (\\h.E)) (\\p.\\z.\\m.a m (\\x.U)))) (\\a.\\d.(\\t.(\\o.\\x.j Y) t (\\v.(\\x.g) (\\r.c) ((\\x.g) t))) (s (g (Z f (\\b.o)))))) (\\y.m (\\u.T (\\y.\\f.l))))))",
      "p (\\d.V) (q (\\t.\\p.\\b.\\e.\\p.\\w.l) O) (\\n.\\j.c (\\w.\\y.M) (\\h.g))"
    );
  }

  @Test
  public final void test464() {
    reducesTo(
      "(\\b.\\e.Z (\\r.w) c) (a (\\r.u) (\\i.z)) n",
      "Z (\\r.w) c"
    );
  }

  @Test
  public final void test465() {
    reducesTo(
      "\\n.(\\c.\\q.M) (x (\\c.(\\l.\\g.\\m.e) (\\p.\\i.\\k.(\\d.n) ((\\u.\\e.(\\i.f) (M E) (\\v.e)) (\\k.\\w.(\\x.(\\z.\\o.a) (\\h.L x)) z)))))",
      "\\n.\\q.M"
    );
  }

  @Test
  public final void test466() {
    reducesTo(
      "(\\a.(\\c.(\\g.c) ((\\j.f) ((\\w.(\\u.d) (K z)) M))) (\\a.s p)) J (\\i.\\j.(\\a.\\j.A) (\\h.\\f.f) (\\x.\\q.o (\\d.\\k.P) s)) (p (\\v.(\\f.x (\\k.\\z.(\\a.V l) (\\k.L p g ((\\g.X) (\\h.X))) l)) (\\k.(\\v.g (j t) ((\\q.\\b.w z) (r y (f d)) (\\x.j))) n))) (d (\\q.\\o.\\c.I) ((\\t.(\\j.(\\g.(\\n.y) F ((\\w.f) T)) T) (i e (v C) (v p) (\\g.(\\l.G) (\\j.i) ((\\a.g) (\\n.Z)))) W) L (y ((\\y.(\\f.\\u.W h (\\f.u) a) (p V j ((\\p.w) (\\s.j)))) (\\r.\\a.Z)) (y ((\\c.z) F ((\\l.U) (b h)) ((\\j.l) O (\\y.o)) l)))))",
      "s p (p (\\v.x (\\k.\\z.V l l))) (d (\\q.\\o.\\c.I) (y (f) W (y (\\u.W h (\\f.u) a) (y (z (U) (l (\\y.o)) l)))))"
    );
  }

  @Test
  public final void test467() {
    reducesTo(
      "(\\x.K q) b ((\\h.\\q.K (\\u.(\\m.\\j.o) R)) j)",
      "K q (\\q.K (\\u.\\j.o))"
    );
  }

  @Test
  public final void test468() {
    reducesTo(
      "\\c.n (f (\\n.y)) (i ((\\c.\\a.i) (\\u.(\\m.n) ((\\t.N) (\\r.B D B ((\\i.J) h)))) d)) ((\\w.Y) K (\\s.\\i.(\\h.y d) c))",
      "\\c.n (f (\\n.y)) (i (i)) (Y (\\s.\\i.y d))"
    );
  }

  @Test
  public final void test469() {
    reducesTo(
      "\\k.\\e.a",
      "\\k.\\e.a"
    );
  }

  @Test
  public final void test470() {
    reducesTo(
      "(\\l.\\x.(\\e.L o (\\e.(\\x.\\f.J) q)) (n (\\r.(\\c.\\n.\\h.(\\l.n) r) (\\n.L x))) ((\\v.\\s.m) ((\\d.d (\\m.v)) (d p) (R (\\k.v) e) ((\\r.\\r.(\\c.q) I (d i (\\b.h))) (\\y.t))) (v ((\\q.u) ((\\b.a) (\\w.w ((\\m.n) (\\w.O))))))) (\\o.(\\i.\\o.X p (\\e.a (\\o.u) ((\\b.O) (\\s.(\\p.o) (e o)) ((\\z.\\t.T Z) (\\o.\\a.\\o.s)))) (\\s.a)) v)) (\\y.\\v.\\g.G (m R (\\u.s) k) (\\b.Q ((\\z.\\f.\\n.f ((\\d.(\\h.m a) ((\\v.X) (e F))) (F ((\\k.n) F)))) r) u))",
      "\\x.L o (\\e.\\f.J) (m) (\\o.\\o.X p (\\e.a (\\o.u) (O (\\t.T Z))) (\\s.a))"
    );
  }

  @Test
  public final void test471() {
    reducesTo(
      "k (p (o (\\p.\\k.\\l.\\r.\\d.\\c.B))) (I ((\\h.(\\v.s) (\\y.B)) (\\o.\\h.e f) p (\\y.a (\\f.B)) j ((\\q.e) ((\\k.\\d.s) h)) k))",
      "k (p (o (\\p.\\k.\\l.\\r.\\d.\\c.B))) (I (s p (\\y.a (\\f.B)) j (e) k))"
    );
  }

  @Test
  public final void test472() {
    reducesTo(
      "(\\h.\\p.\\z.E) ((\\v.d ((\\w.m) ((\\t.t (m J (\\s.h)) (H (o g) (d (k m)))) ((\\b.g) (\\h.\\k.o x) (\\g.\\x.q))))) (d (\\r.(\\l.(\\z.d) K (\\b.\\j.h o (\\m.i) (m g (M z)) (h (\\b.c (\\s.X))))) ((\\z.(\\l.r N (\\t.Z)) (\\q.v)) (\\f.\\k.\\j.v) k)))) (\\y.S l)",
      "\\z.E"
    );
  }

  @Test
  public final void test473() {
    reducesTo(
      "s ((\\i.W) y)",
      "s (W)"
    );
  }

  @Test
  public final void test474() {
    reducesTo(
      "(\\r.\\o.\\y.E) s",
      "\\o.\\y.E"
    );
  }

  @Test
  public final void test475() {
    reducesTo(
      "(\\q.L) ((\\c.(\\u.\\c.\\p.(\\j.(\\n.k) (\\n.c) (\\q.T l h (\\z.\\c.p))) U) o (\\b.(\\r.(\\k.q) (\\q.(\\n.M) (\\n.D (\\f.j) e))) (\\j.e))) (\\u.p ((\\s.\\g.\\i.\\e.\\q.(\\n.\\w.\\i.\\n.R) V) ((\\m.(\\e.\\d.(\\l.m I) (\\n.\\w.e)) (r s (\\m.L) (q j R))) H)))) (b (\\s.\\p.(\\p.x) ((\\d.\\b.K g) (\\y.\\t.\\x.n)) ((\\b.Z) (\\c.(\\c.X) (g Y)) (\\u.(\\v.e) ((\\k.c) w))) (\\b.R)) h (\\w.\\j.(\\z.\\a.\\b.m) (\\j.G (b (\\l.\\u.\\l.\\k.R (\\y.h)) (\\q.(\\z.(\\e.y) (\\c.f K (q u)) (\\j.A)) w)))))",
      "L (b (\\s.\\p.x (Z (\\u.e)) (\\b.R)) h (\\w.\\j.\\a.\\b.m))"
    );
  }

  @Test
  public final void test476() {
    reducesTo(
      "s X (\\s.\\a.(\\r.(\\j.q) (W B) (\\i.q u (B E)) (\\b.W ((\\y.s) i)) (\\a.c)) (\\z.E) m ((\\s.(\\g.l (\\n.(\\r.\\u.B) ((\\l.\\w.A H) (\\x.\\e.\\g.P)))) ((\\j.R) r ((\\y.A) a))) ((\\n.(\\t.\\v.\\s.o) (j p (\\q.M) (n k (q A)))) (\\n.\\y.L) (\\b.c (m Z (f N) (\\r.\\d.\\l.g) (\\x.w))))) (\\q.v))",
      "s X (\\s.\\a.q (\\i.q u (B E)) (\\b.W (s)) (\\a.c) m (l (\\n.\\u.B)) (\\q.v))"
    );
  }

  @Test
  public final void test477() {
    reducesTo(
      "O (\\l.f)",
      "O (\\l.f)"
    );
  }

  @Test
  public final void test478() {
    reducesTo(
      "\\e.\\v.\\j.\\l.(\\b.\\t.K) (\\r.\\c.\\u.\\i.o (\\k.D (\\d.\\p.b (\\v.\\s.(\\h.b (\\i.x)) ((\\j.Q U B) (R z (f l)) (\\e.J)) (t ((\\k.y) (\\h.l)) (\\o.l v))))))",
      "\\e.\\v.\\j.\\l.\\t.K"
    );
  }

  @Test
  public final void test479() {
    reducesTo(
      "K m (\\b.(\\z.j) (\\j.P ((\\c.\\o.y) ((\\d.t) ((\\k.V) V) ((\\r.j) (a x) (h v (\\n.I)))) (j (q (\\g.y)) (\\g.(\\k.\\u.(\\s.Y) (\\c.\\n.q)) (\\s.\\o.\\u.\\t.\\m.c b e))))) y)",
      "K m (\\b.j y)"
    );
  }

  @Test
  public final void test480() {
    reducesTo(
      "A (\\d.\\s.C) (\\t.k)",
      "A (\\d.\\s.C) (\\t.k)"
    );
  }

  @Test
  public final void test481() {
    reducesTo(
      "\\q.\\k.(\\l.\\j.\\q.(\\b.\\b.\\m.\\p.\\f.\\j.Y) (\\v.(\\q.u ((\\a.\\j.\\h.w) (\\d.(\\m.s) (B f))) (t (h ((\\n.d) (\\d.y)))) (w C)) (\\b.(\\z.\\r.\\l.\\y.s) (\\p.\\d.X)))) (\\w.(\\u.C) (\\g.(\\y.i ((\\n.(\\w.w) (\\b.\\n.\\b.f)) f) (i u)) v)) (\\q.\\c.C (\\p.(\\d.u) ((\\u.V (\\c.(\\t.k) (r r)) (s (y u r))) (\\z.(\\x.m) d (\\x.(\\t.V) (C N)) a)) (\\s.d)) ((\\w.(\\n.(\\f.d) ((\\j.(\\m.f) O) N) (\\f.\\z.A (\\o.W (\\s.q) (\\y.\\v.y)))) (\\u.\\l.(\\c.(\\g.\\r.\\v.\\k.W) (u o (\\z.i) k)) ((\\f.\\g.K k (r y) ((\\q.D) (\\n.A))) (\\n.\\f.\\u.\\n.(\\z.g) (\\r.k))))) (H (\\j.(\\k.\\c.(\\v.\\b.e) (z Z (q r))) (\\u.(\\h.X) z) (\\d.\\a.h))) c))",
      "\\q.\\k.\\q.\\b.\\m.\\p.\\f.\\j.Y"
    );
  }

  @Test
  public final void test482() {
    reducesTo(
      "(\\h.w (\\d.\\c.D)) ((\\l.i) n)",
      "w (\\d.\\c.D)"
    );
  }

  @Test
  public final void test483() {
    reducesTo(
      "(\\k.I) t",
      "I"
    );
  }

  @Test
  public final void test484() {
    reducesTo(
      "\\a.(\\n.\\c.\\b.h ((\\e.\\u.\\t.\\p.h) ((\\l.\\x.n) (\\p.(\\l.(\\i.t S (B o)) ((\\a.g) (\\e.y)) (\\l.\\c.(\\s.d) (\\l.I) (\\u.\\p.m))) v (\\s.\\o.\\a.l))))) (\\q.f ((\\p.e) (\\m.\\g.\\f.\\t.f (e m (d s) p ((\\g.h) ((\\o.z) (\\w.H))) (\\x.T (t (o V)) (\\b.M))) (\\m.t))))",
      "\\a.\\c.\\b.h (\\u.\\t.\\p.h)"
    );
  }

  @Test
  public final void test485() {
    reducesTo(
      "(\\z.\\q.\\z.\\n.e) ((\\g.\\x.\\e.M) ((\\n.Q (\\n.\\d.q)) o)) (D ((\\i.\\l.d) (\\a.(\\o.i) (\\d.\\f.(\\l.d) (\\k.(\\a.c) (\\t.o) (g T (\\t.u)))) ((\\f.e) ((\\k.j) u) (q (\\e.x n)))) (\\g.(\\r.Y) ((\\p.\\b.r l) (\\t.d (\\b.y) (\\n.(\\j.n) (u t)) (u p) ((\\o.p (\\c.w) q) (\\u.\\q.z)))))))",
      "\\z.\\n.e"
    );
  }

  @Test
  public final void test486() {
    reducesTo(
      "\\z.L",
      "\\z.L"
    );
  }

  @Test
  public final void test487() {
    reducesTo(
      "\\m.\\a.f m",
      "\\m.\\a.f m"
    );
  }

  @Test
  public final void test488() {
    reducesTo(
      "(\\y.\\h.\\c.(\\p.p) (\\b.x g) a r (\\e.y)) (\\d.\\y.\\q.\\e.\\a.Z)",
      "\\h.\\c.x g r (\\e.\\d.\\y.\\q.\\e.\\a.Z)"
    );
  }

  @Test
  public final void test489() {
    reducesTo(
      "a (\\o.j)",
      "a (\\o.j)"
    );
  }

  @Test
  public final void test490() {
    reducesTo(
      "\\q.\\w.(\\v.(\\q.Q (x o (V U)) (\\l.A)) (\\q.(\\x.\\m.(\\w.p t) V) (X (\\v.n) ((\\b.R) (\\x.I)))) ((\\g.d) (\\l.(\\u.G) (\\v.T))) K) (\\e.i) q c",
      "\\q.\\w.Q (x o (V U)) (\\l.A) (d) K q c"
    );
  }

  @Test
  public final void test491() {
    reducesTo(
      "(\\c.\\y.(\\j.P) E) (\\c.\\m.\\h.U ((\\c.j) ((\\p.(\\w.(\\y.b) (\\t.Y) p) O) (\\r.(\\o.w) (\\t.\\y.F g) ((\\u.x) w B))) (g (\\p.\\f.\\w.\\m.\\g.\\x.\\p.n) (\\o.(\\k.J (f (T b (h D)))) (\\y.m))))) h",
      "P"
    );
  }

  @Test
  public final void test492() {
    reducesTo(
      "\\z.o (\\g.w (r ((\\e.\\q.I (k d)) ((\\x.z (\\v.\\e.Q (\\m.k k))) (n f (\\g.d) (\\a.\\d.\\m.x) ((\\h.(\\v.j) (P p)) (r (O a))))))) (\\u.r))",
      "\\z.o (\\g.w (r (\\q.I (k d))) (\\u.r))"
    );
  }

  @Test
  public final void test493() {
    reducesTo(
      "\\n.h",
      "\\n.h"
    );
  }

  @Test
  public final void test494() {
    reducesTo(
      "(\\m.L v) F",
      "L v"
    );
  }

  @Test
  public final void test495() {
    reducesTo(
      "\\c.(\\e.\\y.\\w.(\\x.(\\i.c ((\\f.\\y.\\f.(\\q.D) (\\n.b)) (\\u.\\d.\\q.\\e.\\g.\\x.\\h.N)) (\\i.\\s.G ((\\u.\\n.v ((\\p.e) (\\z.p))) (h F (\\z.Z) ((\\f.d) (K j)))))) ((\\n.\\l.\\q.\\h.(\\q.u) ((\\b.e) (\\x.\\p.A))) (\\d.\\k.x) (\\e.O (\\g.\\l.c i) (\\t.K) ((\\d.\\x.j e) (\\h.d) (\\o.o))))) (\\c.f) (\\y.(\\k.\\c.(\\e.(\\i.D) ((\\j.B k) (E (\\w.x))) (s ((\\m.Y x) (b w)))) (\\z.f)) W ((\\c.\\i.j) ((\\o.d (Z v (B D)) X) (\\g.\\y.(\\l.F) (\\g.D) (\\r.X) (m o (F y) z)) (\\f.\\o.(\\h.h (\\d.\\e.(\\c.u) M (\\a.i x))) (\\j.o (\\i.(\\x.d) (J s) K))))))) (\\t.(\\m.U) (\\v.\\i.n (\\v.\\e.\\e.b) (\\c.(\\i.(\\l.(\\p.\\h.l) (z q (\\i.i))) (\\k.L)) ((\\s.K) (p d (\\d.R)) (p (\\t.\\e.w i)))) (\\w.N z ((\\x.d) (\\i.k) (\\p.\\v.N z) (\\w.v q (\\x.i) ((\\d.d) v)) ((\\n.(\\x.\\s.h X) s) (\\c.\\h.F))))) ((\\q.\\n.\\i.b) (\\g.(\\m.\\x.x) J) ((\\b.\\e.O) (q (\\l.b) (\\h.(\\n.O) (\\a.y))) X) ((\\k.m (\\w.\\g.k l)) (\\c.i) (\\c.(\\b.x) (\\h.W) (\\e.\\v.\\b.o) (D R (r C) o) G)) (\\h.\\q.\\k.G)))",
      "\\c.\\y1.\\w2.c (\\y.\\f.D) (\\i5.\\s6.G (\\n7.v (\\t.U (b (\\h.\\q.\\k.G))))) (\\y.D (s (Y x)))"
    );
  }

  @Test
  public final void test496() {
    reducesTo(
      "\\z.(\\p.L) E ((\\p.\\s.\\q.i (\\t.z (\\x.N) g (\\t.R))) ((\\j.(\\h.(\\a.(\\t.E) ((\\l.E) j) (J (\\y.\\g.y l))) (\\i.\\o.\\f.\\v.\\s.k j)) s) v) (\\t.\\l.Q))",
      "\\z.L (\\q.i (\\t.z (\\x.N) g (\\t.R)))"
    );
  }

  @Test
  public final void test497() {
    reducesTo(
      "\\o.\\h.\\o.\\q.(\\t.J) ((\\p.\\a.(\\z.r h s) (x ((\\s.(\\w.a) (r n)) (n G (\\n.s)) (s (l r) (r (\\m.i)))))) (\\g.(\\k.\\z.(\\d.\\p.o J) (y g i) (\\m.R (\\i.n) (\\n.\\g.\\t.X)) Y) C)) (\\y.\\x.k) (\\j.\\c.\\b.\\e.\\i.\\j.u)",
      "\\o.\\h.\\o.\\q.J (\\y.\\x.k) (\\j.\\c.\\b.\\e.\\i.\\j.u)"
    );
  }

  @Test
  public final void test498() {
    reducesTo(
      "(\\d.(\\s.\\l.\\o.A) (\\e.\\n.(\\q.\\k.u) ((\\a.s) (\\i.c)) (\\j.\\v.p g (M k) (\\w.b))) ((\\m.\\s.s) (\\j.n) L j) (b (\\o.(\\l.\\k.u r) v) (x I ((\\o.k r (i m) ((\\m.r) (\\r.n))) (\\m.q))))) (\\l.x) D ((\\o.(\\g.\\d.\\i.u (z L) (w (X g)) (\\e.\\w.q) s) ((\\h.\\y.\\w.(\\q.\\u.E) (B (\\b.r))) (\\g.a (\\a.\\t.\\x.P)) A)) j (R ((\\q.N x Y (k C (t k))) (l w (\\o.U) (\\t.(\\z.h) (\\w.O))) (\\t.(\\e.Z) ((\\f.\\d.d n) (s d (T a))))) (\\y.\\s.\\l.a)) ((\\n.H) (\\d.\\t.(\\z.\\x.\\r.\\q.\\k.u (\\o.\\t.s)) (\\m.\\c.d)) a))",
      "A D (u (z L) (w (X (\\w.\\u.E))) (\\e.\\w.q) s)"
    );
  }

  @Test
  public final void test499() {
    reducesTo(
      "(\\v.(\\t.\\p.(\\a.(\\b.t) (A (\\i.y)) ((\\l.(\\b.v) (\\x.i)) (\\i.W)) t) (\\z.(\\x.(\\n.r) (\\g.e) O) E l) Q ((\\x.\\o.(\\d.(\\k.B) r ((\\x.\\v.\\u.(\\b.i) (\\r.o) F) (\\n.\\j.(\\b.p g) v))) (V ((\\p.E (\\s.\\n.y y)) O))) T)) (V ((\\e.Z) ((\\i.\\q.\\v.X P (w t) a (\\g.(\\d.j) (\\r.m) (\\x.q)) ((\\y.b) j (\\n.\\o.\\e.\\p.z e (l f)))) ((\\g.v ((\\n.y) (f n)) (e ((\\r.c) (S h)))) (\\w.S)))))) (y (Z Y ((\\f.\\c.\\o.u o w ((\\f.k) (\\w.a)) n) (z g (m T) (\\m.\\r.q S) ((\\t.\\w.w) ((\\v.B) (\\l.j))))) (\\g.(\\y.\\d.(\\v.X) ((\\e.f) (\\u.(\\l.M) z))) o) (\\i.\\p.\\f.\\w.(\\e.\\w.\\z.r ((\\x.M) (t g) j ((\\p.\\n.k) (\\y.d i (\\a.b)))) o) (T (R (r k) (l z) (w g)) (v r)))))",
      "\\p.V (Z) (y (Z Y (\\c.\\o.u o w (k) n) (\\g.\\d.X) (\\i.\\p.\\f.\\w.\\w.\\z.r (M j (\\n.k)) o))) (V (Z)) Q (\\o5.B (\\v.\\u.i F))"
    );
  }

  @Test
  public final void test500() {
    reducesTo(
      "(\\t.\\a.\\l.i g) (\\m.p (\\l.\\n.(\\j.L (\\s.m)) b))",
      "\\a.\\l.i g"
    );
  }

  @Test
  public final void test501() {
    reducesTo(
      "i a h",
      "i a h"
    );
  }

  @Test
  public final void test502() {
    reducesTo(
      "Y (\\i.\\v.\\c.\\h.\\r.\\n.(\\e.\\q.(\\i.\\k.j B ((\\s.j (o (\\n.Z))) (o v v (\\m.A (\\x.P))))) c (\\n.(\\m.G (r ((\\k.p) H))) (\\d.(\\i.I) s) ((\\j.S y (E l) (q (p n))) (n (\\x.k) ((\\d.I) (\\y.r))) (K q)))) ((\\w.\\m.(\\x.\\u.\\g.\\q.(\\t.L) (c P)) (\\r.q) y) (J (f F (m u) (\\q.(\\f.t) (T h))) ((\\z.u) (\\u.\\i.x s) ((\\y.B) (\\d.T) (\\b.(\\y.G) (\\e.x))))) (A (\\g.\\r.X))) (\\y.O))",
      "Y (\\i.\\v.\\c.\\h.\\r.\\n.j B (j (o (\\n.Z))))"
    );
  }

  @Test
  public final void test503() {
    reducesTo(
      "\\q.Q f (\\s.(\\z.\\u.d (\\o.(\\v.(\\z.z) ((\\g.(\\k.e x D) (r b (H m))) (h ((\\t.H) (o E))))) (w (\\g.A o (\\l.D)) (\\x.\\y.Y (\\r.\\o.R)) H))) (\\q.\\t.f)) (\\a.u)",
      "\\q.Q f (\\s.\\u.d (\\o.e x D)) (\\a.u)"
    );
  }

  @Test
  public final void test504() {
    reducesTo(
      "\\o.\\c.l",
      "\\o.\\c.l"
    );
  }

  @Test
  public final void test505() {
    reducesTo(
      "(\\s.\\a.m) ((\\p.\\t.z) (\\k.\\o.\\b.\\q.n) ((\\q.(\\r.i K (k u) ((\\u.Z) (f v)) (\\n.e (\\x.x)) ((\\k.v (m t)) d ((\\u.d (\\q.C)) (t P))) (\\x.r ((\\e.S ((\\h.s) (i r))) (\\u.L)))) (\\s.\\i.\\y.(\\q.\\c.(\\t.\\p.\\g.\\z.x) ((\\j.m) r D ((\\p.g) (x w) (\\q.\\m.\\l.x)))) (\\x.(\\y.s) (\\o.e) ((\\v.Q (\\k.k i (\\n.o))) (O (\\f.a) (j f q)))))) (\\h.(\\w.\\t.n) (\\t.R) (\\h.(\\w.k (\\f.V) ((\\o.a) n)) (\\u.\\l.Q (\\o.\\g.u))) e (\\e.m))))",
      "\\a.m"
    );
  }

  @Test
  public final void test506() {
    reducesTo(
      "\\i.t (\\d.l)",
      "\\i.t (\\d.l)"
    );
  }

  @Test
  public final void test507() {
    reducesTo(
      "\\n.v (t (H ((\\f.(\\f.X (\\p.i) (\\b.T (q D)) ((\\i.\\t.\\b.l) x)) (m (N (\\t.f) (U d V)))) c)) ((\\y.w) (\\f.V ((\\m.\\e.l) (\\d.\\q.(\\b.\\q.M) (\\q.(\\q.\\v.N) (\\p.\\q.b))))) (\\p.\\w.\\b.R ((\\p.\\n.\\r.\\l.C) (\\i.(\\y.n) v ((\\m.\\l.i) (\\b.F M M)) (y (\\s.B (\\t.\\f.S d))))))))",
      "\\n.v (t (H (X (\\p.i) (\\b.T (q D)) (\\t.\\b.l))) (w (\\p.\\w.\\b.R (\\n.\\r.\\l.C))))"
    );
  }

  @Test
  public final void test508() {
    reducesTo(
      "\\g.\\w.p (\\o.\\c.j)",
      "\\g.\\w.p (\\o.\\c.j)"
    );
  }

  @Test
  public final void test509() {
    reducesTo(
      "\\j.(\\c.(\\j.l) Y) X",
      "\\j.l"
    );
  }

  @Test
  public final void test510() {
    reducesTo(
      "(\\d.\\o.l) (f (o (\\r.\\h.(\\s.\\t.\\o.p) ((\\k.(\\p.(\\i.(\\x.x) (\\u.Z)) (e s (y j))) (v z (\\u.j) (m h (\\m.q)))) F)) (\\k.b)))",
      "\\o.l"
    );
  }

  @Test
  public final void test511() {
    reducesTo(
      "\\s.(\\a.e (F ((\\r.g (A (\\g.o)) l) (l v)))) (q (\\t.(\\y.\\g.(\\i.\\y.(\\e.k) (Q w) d ((\\k.\\v.\\y.N) a) ((\\b.\\t.\\m.r) (\\y.Y) ((\\g.I) (\\m.v) (\\r.a X)))) (j (v (V e) l) (\\z.i r (i q) (\\j.b) (i c Z (\\v.H))))) g)) (\\c.k)",
      "\\s.e (F (g (A (\\g.o)) l)) (\\c.k)"
    );
  }

  @Test
  public final void test512() {
    reducesTo(
      "(\\u.k N ((\\e.x) ((\\d.\\z.\\s.\\b.(\\y.\\x.\\c.\\w.(\\f.\\n.\\r.F) ((\\w.\\q.P y) e ((\\v.\\b.A) w))) ((\\q.\\x.p) (\\a.\\c.\\x.t) (\\a.(\\g.q P (\\s.v)) (j O)) (\\p.\\n.j))) (\\v.X (e ((\\a.(\\u.u a (g y)) a) (\\z.(\\o.\\t.\\a.d) (\\t.\\o.d)))))))) e",
      "k N (x)"
    );
  }

  @Test
  public final void test513() {
    reducesTo(
      "\\k.(\\b.(\\f.c (\\n.\\y.(\\n.(\\w.(\\d.\\e.j) ((\\k.w) f)) E) (\\q.Z (\\b.(\\b.n) (\\p.Q)) (u i (Z O) o)))) (y (r (\\d.\\p.b))) (u ((\\y.(\\r.(\\d.E) (k u)) (b x (d B))) (\\x.\\z.\\j.\\m.\\y.\\u.N) ((\\x.(\\o.K) (\\i.o) ((\\p.m) (\\n.z))) (\\z.\\o.y)) (\\f.(\\k.k) b))) (T ((\\o.n (p (\\x.\\r.i)) w ((\\d.(\\z.H l) (\\v.p)) (X s (\\p.a) ((\\p.x) (e d)) (J l (\\l.C) X)))) (\\y.(\\a.\\f.\\u.\\h.\\k.(\\k.p) (\\f.M)) (\\a.\\n.k (\\j.\\u.Y)) j ((\\q.\\s.(\\u.q (q U) (\\o.y i)) o) (\\n.t)))))) (\\n.(\\o.\\l.\\i.\\c.(\\g.\\f.\\a.\\r.\\u.w) (\\e.x ((\\g.K) (q T)) (G C) (d (w (j V) (\\d.\\x.t y))) (\\n.e i) v)) (\\z.\\n.\\g.\\k.(\\a.(\\w.\\e.d) (\\d.\\k.(\\s.\\n.\\z.b) ((\\u.E) b) (\\z.\\s.K)) A ((\\h.b) ((\\r.B (\\w.\\i.l)) ((\\j.u) ((\\t.s) (\\a.m)) (a (\\u.r)))))) (\\v.\\w.(\\g.\\x.P) P)))",
      "\\k.c (\\n.\\y3.\\e.j) (u (E (K (m)) (\\f.\\n.\\l.\\i.\\c.\\f.\\a.\\r.\\u.w))) (T (n (p (\\x.\\r.i)) w (H l)))"
    );
  }

  @Test
  public final void test514() {
    reducesTo(
      "\\m.(\\p.f) ((\\f.\\f.u x (o g) (\\i.\\l.i)) ((\\z.m) H h) (d (\\o.n (\\h.\\t.\\h.B))) l p) ((\\j.\\j.\\s.\\i.\\b.\\s.X) U ((\\a.i) (\\u.\\j.O))) (\\i.\\h.z (x (\\d.\\q.(\\b.o (\\e.(\\i.(\\u.(\\s.\\b.A) ((\\i.O) o)) (i ((\\z.k) (\\v.W)))) v)) (\\r.(\\m.Z D) (\\y.e) ((\\p.s) (\\d.k))))))",
      "\\m.f (\\s.\\i.\\b.\\s.X) (\\i.\\h.z (x (\\d.\\q.o (\\e.\\b.A))))"
    );
  }

  @Test
  public final void test515() {
    reducesTo(
      "s ((\\e.x (\\l.(\\e.D) (k b)) (\\c.(\\j.G) v (\\u.\\l.v))) (z (\\h.\\t.(\\i.\\d.q) t))) (g ((\\t.(\\j.\\n.\\l.I) i (\\c.\\f.f)) (h (j u X) x))) (\\g.\\g.(\\l.\\u.\\t.\\h.\\i.\\m.\\z.\\j.\\y.(\\o.\\c.\\c.(\\h.s) (z R)) t (\\p.b X i p ((\\g.\\f.i C) (W b (s q)))) (\\x.(\\d.\\z.(\\l.I) x) ((\\q.(\\c.L K) (k (\\w.l))) (F (i s B))))) a) ((\\g.(\\o.q) (\\c.z) (\\j.L q (x b)) l (\\f.\\u.\\m.\\k.X (c (\\f.g B)))) (t (B (\\a.E) (k j (Q N)) (Q m))) (\\e.(\\o.\\m.Q ((\\b.(\\m.M) (d a)) (\\l.(\\v.W) (d W)))) (\\y.W) L) (\\z.n)) (W a)",
      "s (x (\\l.D) (\\c.G (\\u.\\l.v))) (g (\\l.I)) (\\g.\\g.\\u.\\t.\\h.\\i.\\m.\\z.\\j.\\y.s) (q (\\j.L q (x b)) l (\\f.\\u.\\m1.\\k2.X (c (\\f.t (B (\\a.E) (k j (Q N)) (Q m)) B))) (\\e.Q (M)) (\\z.n)) (W a)"
    );
  }

  @Test
  public final void test516() {
    reducesTo(
      "Z (z q)",
      "Z (z q)"
    );
  }

  @Test
  public final void test517() {
    reducesTo(
      "(\\e.i t) c (p Q (d ((\\w.j) (\\m.\\e.V)) R)) ((\\x.e) v f)",
      "i t (p Q (d (j) R)) (e f)"
    );
  }

  @Test
  public final void test518() {
    reducesTo(
      "(\\t.(\\z.g) ((\\w.(\\l.(\\z.W P) o) (j ((\\s.(\\v.g c (I u) p) (r I (\\n.t) (\\a.(\\x.S) (\\e.l)))) (\\u.K (D (\\c.\\o.\\g.L)))))) (y z))) (\\v.\\e.(\\z.\\m.z E ((\\e.D) (\\r.s (V q) (\\l.b)))) (\\s.(\\t.t) ((\\z.a (\\y.(\\s.S) (s o))) (\\k.\\b.(\\a.i Z) (\\t.\\j.h)))) ((\\y.(\\w.(\\q.q) (\\n.c)) H ((\\o.D (R y) (i W (C K))) (\\l.(\\z.Y) (\\g.u) (\\h.\\h.\\j.u)))) x) (c (\\s.(\\p.R) (\\g.u))) (n (\\b.W v ((\\c.\\r.z A) (\\t.q)) (\\h.\\a.h) (\\n.\\p.\\o.Y) (u ((\\t.M I) (\\z.p (\\p.m) ((\\g.q) (x o)) (\\s.(\\v.\\l.\\d.g) (\\s.s c (\\c.m)))))))))",
      "g"
    );
  }

  @Test
  public final void test519() {
    reducesTo(
      "\\j.\\c.(\\f.(\\m.Y t) (\\j.q) v U ((\\b.K) (\\o.(\\g.(\\t.\\a.B J) (O h (O Z))) (d (g (\\i.F))) (\\n.(\\x.(\\i.\\w.p E) (z I (\\e.w))) (\\p.l)) ((\\k.(\\l.k) (\\g.s) (\\v.\\r.\\w.Z)) G ((\\m.x (\\k.n (\\t.n))) (\\l.(\\p.\\f.\\s.J) ((\\m.Q) B)))))) (I c)) (j ((\\b.\\p.(\\c.q) (\\s.(\\b.(\\d.\\l.\\q.(\\m.P) Q (\\z.d) (\\y.(\\i.\\r.U) (\\x.r))) (\\k.(\\u.q) (\\r.R))) (\\u.\\j.(\\g.v) R))) (\\a.(\\j.(\\r.p) (\\f.H) (\\v.\\u.X f) (S (Z o) (\\c.\\j.\\b.E)) (I ((\\g.x) K) (\\q.(\\j.i) (Z o) x)) w) (V (n (j B (\\p.l)) (K i (\\n.D) (\\x.\\o.\\j.d)) (\\i.\\u.q))))))",
      "\\j.\\c.Y t v U (K) (I c)"
    );
  }

  @Test
  public final void test520() {
    reducesTo(
      "\\i.w X",
      "\\i.w X"
    );
  }

  @Test
  public final void test521() {
    reducesTo(
      "\\m.(\\m.A) G",
      "\\m.A"
    );
  }

  @Test
  public final void test522() {
    reducesTo(
      "\\n.r ((\\o.e ((\\f.\\o.(\\k.x (\\n.u) (\\k.(\\f.C) (i r)) (k F (\\h.W) (\\o.\\g.x)) t) (\\i.(\\c.b (\\i.x)) (\\o.\\x.\\m.o) (B t (\\k.l) (b (\\r.h))) m)) ((\\f.\\r.g) ((\\y.d P (\\k.m) q ((\\x.\\x.\\w.l) f)) w)))) (\\u.\\n.\\t.\\v.\\c.v))",
      "\\n.r (e (\\o.x (\\n.u) (\\k.C) (b (\\i.x) (B t (\\k.l) (b (\\r.h))) m (\\h.W) (\\o.\\g.x)) t))"
    );
  }

  @Test
  public final void test523() {
    reducesTo(
      "\\k.e",
      "\\k.e"
    );
  }

  @Test
  public final void test524() {
    reducesTo(
      "\\h.k",
      "\\h.k"
    );
  }

  @Test
  public final void test525() {
    reducesTo(
      "\\b.t ((\\w.o) ((\\e.Y) (\\j.\\e.\\c.\\p.(\\m.\\q.\\e.E) H)))",
      "\\b.t (o)"
    );
  }

  @Test
  public final void test526() {
    reducesTo(
      "\\b.\\f.\\v.a",
      "\\b.\\f.\\v.a"
    );
  }

  @Test
  public final void test527() {
    reducesTo(
      "\\v.(\\f.(\\e.(\\u.\\x.\\k.o (\\v.h w)) (\\k.\\l.(\\n.\\s.h) (\\b.v)) (\\s.\\l.\\q.(\\d.h X p ((\\y.p) (F r))) (\\k.\\c.\\w.\\n.\\f.\\b.E) ((\\t.r v (M d)) (c t (Z F)) (\\m.s B)))) (\\c.\\m.(\\n.k (\\w.k)) (\\q.\\z.(\\u.X M (S q) (o a)) (u v (m Y) b) O))) C (\\q.(\\i.R (\\a.\\f.e ((\\v.D (b a)) (M (\\t.(\\i.t) (z l) (g Y l)))))) o) ((\\y.\\g.l (\\q.(\\g.G) ((\\w.(\\s.c) (i E)) V) g)) (k F (\\m.m)) (p (a (\\i.(\\x.V f) P) (\\v.\\t.\\u.\\t.\\n.\\f.\\q.\\r.e))) (i q))",
      "\\v.o (\\v.h w) (l (\\q.G (p (a (\\i.V f) (\\v.\\t.\\u.\\t.\\n.\\f.\\q.\\r.e)))) (i q))"
    );
  }

  @Test
  public final void test528() {
    reducesTo(
      "\\m.\\q.j",
      "\\m.\\q.j"
    );
  }

  @Test
  public final void test529() {
    reducesTo(
      "\\e.z ((\\g.(\\m.B) (\\v.(\\i.\\h.q) ((\\o.\\n.\\y.(\\h.\\u.\\o.t) ((\\a.e b R r) (\\k.n (\\e.x) t))) (\\q.t)))) (Z (g M U)))",
      "\\e.z (B)"
    );
  }

  @Test
  public final void test530() {
    reducesTo(
      "\\y.h",
      "\\y.h"
    );
  }

  @Test
  public final void test531() {
    reducesTo(
      "\\x.\\n.p",
      "\\x.\\n.p"
    );
  }

  @Test
  public final void test532() {
    reducesTo(
      "\\r.j ((\\c.\\h.\\x.\\j.y) (\\l.\\g.\\o.\\i.(\\w.z) A)) (P (P (\\n.z)))",
      "\\r.j (\\h.\\x.\\j.y) (P (P (\\n.z)))"
    );
  }

  @Test
  public final void test533() {
    reducesTo(
      "(\\e.\\h.U (g (h p z)) (\\o.\\t.\\n.\\z.q (\\m.\\n.\\x.(\\c.(\\w.(\\r.(\\e.\\c.j) ((\\i.n) m)) (\\v.\\i.(\\o.z) (\\s.w) (\\z.\\f.y))) ((\\v.(\\o.k h) z) f)) (Z (T (h K (\\f.V) x))))) ((\\g.D) ((\\j.o) ((\\v.w) (g (Y q) (\\g.\\s.f)))) (\\y.e) ((\\c.(\\l.v o ((\\x.C) (s x))) d ((\\j.C ((\\z.Y) (\\p.D))) C)) (E (\\y.\\l.(\\q.U A Q (\\v.O w)) (H (a (\\w.b))))) (\\s.(\\c.(\\a.p ((\\c.v) (\\u.f) (\\k.\\c.\\e.h))) (J N)) (\\n.\\c.\\k.\\g.Y))))) (\\x.\\r.I)",
      "\\h.U (g (h p z)) (\\o.\\t.\\n.\\z.q (\\m.\\n.\\x.\\c.j)) (D (\\y.\\x.\\r.I) (v o (C) (C (Y)) (\\s.p (v (\\k.\\c.\\e.h)))))"
    );
  }

  @Test
  public final void test534() {
    reducesTo(
      "p (\\n.\\r.d) v",
      "p (\\n.\\r.d) v"
    );
  }

  @Test
  public final void test535() {
    reducesTo(
      "(\\m.\\j.\\v.(\\h.\\p.r (\\v.(\\f.(\\g.e) ((\\l.v) (\\a.f))) (g (x (\\w.r)))) (a (\\j.X) (\\j.(\\b.n) p)) A (\\y.B (\\r.\\c.(\\u.(\\p.i a (\\j.(\\d.R D) (T (P M)))) (\\l.Q)) (o (\\w.\\s.V h (\\y.z) j ((\\a.C) (\\i.w k (t v)))))))) (O (\\q.(\\v.(\\r.\\j.\\n.\\n.g) (\\q.\\g.p D ((\\t.j (j t)) (Q u (\\z.h))))) p) o)) B",
      "\\j.\\v.\\p1.r (\\v.e) (a (\\j.X) (\\j.n)) A (\\y.B (\\r.\\c.i a (\\j.R D)))"
    );
  }

  @Test
  public final void test536() {
    reducesTo(
      "\\c.P (\\m.S (\\p.\\h.w))",
      "\\c.P (\\m.S (\\p.\\h.w))"
    );
  }

  @Test
  public final void test537() {
    reducesTo(
      "(\\d.\\y.\\p.\\a.(\\l.\\c.\\g.k) (\\g.a (\\g.(\\z.\\d.(\\j.(\\q.e M) (\\q.\\y.f)) (c M)) (q i q (\\x.m) K) (W ((\\y.(\\d.p h n) (P B (\\y.M))) (f (i (\\e.C)))))) ((\\o.k (\\x.\\x.c (\\w.s))) (\\u.\\p.s N) D))) ((\\f.\\n.\\y.\\h.(\\o.(\\c.\\u.v j) (A (\\w.t (N s) w) (\\k.\\q.p))) (N (\\t.m (\\y.\\r.\\s.P (z i (I q) (\\j.C z))))) g) u)",
      "\\y.\\p.\\a.\\c.\\g.k"
    );
  }

  @Test
  public final void test538() {
    reducesTo(
      "\\s.\\m.(\\v.p ((\\u.(\\d.\\f.\\l.(\\k.(\\n.\\h.\\b.\\o.s) (\\a.\\h.r x)) r) (\\f.Y) ((\\v.(\\v.F) ((\\v.e) e) (\\z.u) (\\x.(\\i.z) a)) m)) v)) v",
      "\\s.\\m.p (\\l.\\h.\\b.\\o.s)"
    );
  }

  @Test
  public final void test539() {
    reducesTo(
      "\\u.(\\r.x j ((\\q.(\\y.(\\v.(\\t.u) (b H) l ((\\s.\\o.Z) r)) x) (\\o.(\\i.\\e.(\\l.\\p.\\f.Q) v ((\\b.\\s.q) (\\o.U))) ((\\k.\\u.i a) (\\n.\\o.\\z.v) x))) (\\z.\\i.r)) (\\t.(\\e.(\\e.S) ((\\y.q) (\\z.R c))) (v h))) (\\y.(\\k.(\\q.s) ((\\s.\\k.P W) y) ((\\q.H) ((\\o.m) (\\s.W)) ((\\f.d) (j o) S))) (D ((\\q.f) ((\\m.(\\n.e) (\\o.B)) O))) (\\a.Z) A ((\\g.(\\b.\\r.\\i.u (l (\\s.(\\c.M) (d r))) y ((\\p.k) ((\\q.\\k.y (\\n.V) ((\\n.a) (Z f))) (\\q.\\f.(\\h.\\p.z) (e e o))))) (\\r.\\m.H)) (a (\\j.\\f.J ((\\m.\\c.p (\\o.b)) E) x))))",
      "\\u.x j (u l (\\o.Z)) (\\t.S)"
    );
  }

  @Test
  public final void test540() {
    reducesTo(
      "\\z.(\\c.w) ((\\f.\\q.(\\m.(\\p.\\z.S (\\z.p)) (\\t.(\\c.(\\l.\\f.\\i.\\h.R) (\\p.h)) (\\q.(\\k.i) (\\w.\\r.l U) ((\\d.j) (\\m.g) j)))) (\\g.\\k.k)) (\\p.J)) (\\u.B (\\x.e))",
      "\\z.w (\\u.B (\\x.e))"
    );
  }

  @Test
  public final void test541() {
    reducesTo(
      "(\\f.q) (\\o.(\\q.\\f.K) (m v))",
      "q"
    );
  }

  @Test
  public final void test542() {
    reducesTo(
      "(\\q.\\w.\\l.H) ((\\w.p) (\\k.(\\c.m) M ((\\t.\\r.F) (\\v.r)) (\\h.z) (q (x R) (\\k.e)))) E",
      "\\l.H"
    );
  }

  @Test
  public final void test543() {
    reducesTo(
      "\\w.(\\o.i (F G (n i) (P (W w)) (\\y.(\\s.\\s.K) (Q F v))) (\\e.\\k.\\v.d) (\\f.y) (C (u (i h k) (\\w.a t (z d) (\\f.\\w.\\j.b)) (\\p.(\\t.\\c.w U) (K A (H c)) s)) ((\\b.q) (\\u.v) (\\k.\\d.S) (\\o.\\z.o)))) (\\t.(\\s.\\t.\\y.l (\\o.\\l.g) ((\\v.Y) ((\\p.s) A)) (\\h.G (i s) w ((\\c.L) (\\i.\\l.c))) ((\\o.\\r.n g q) (\\q.o)) z) (w (\\v.(\\v.l e (\\w.M)) m (\\g.(\\f.k) R (\\b.w)) (\\a.E)) I)) k",
      "\\w.i (F G (n i) (P (W w)) (\\y.\\s.K)) (\\e.\\k.\\v.d) (\\f.y) (C (u (i h k) (\\w.a t (z d) (\\f.\\w.\\j.b)) (\\p.w U)) (q (\\k.\\d.S) (\\o.\\z.o))) k"
    );
  }

  @Test
  public final void test544() {
    reducesTo(
      "i (l (\\a.W)) (f (h ((\\y.\\l.\\w.i) (g u (\\c.n))) (\\l.(\\x.G) Y (\\d.(\\b.t) ((\\z.j) (\\c.o)))) ((\\r.u (\\v.\\j.\\q.(\\y.M) h ((\\o.r) (\\i.q)))) (\\i.g ((\\w.j f) L))) c)) A",
      "i (l (\\a.W)) (f (h (\\l.\\w.i) (\\l.G (\\d.t)) (u (\\v.\\j1.\\q.M (\\i.g (j f)))) c)) A"
    );
  }

  @Test
  public final void test545() {
    reducesTo(
      "(\\u.\\u.(\\b.V) (\\a.g) (Q K (k m))) (\\v.\\g.\\g.\\e.\\w.D q (Z x)) n (\\n.l) ((\\b.j O (\\x.(\\l.u) (\\p.e))) (\\y.\\y.(\\h.\\d.p) x) (\\g.(\\j.\\l.g) I) ((\\x.A (\\z.n S (\\m.K))) R)) c k ((\\r.\\g.Y) v)",
      "V (Q K (k m)) (\\n.l) (j O (\\x.u) (\\g.\\l.g) (A (\\z.n S (\\m.K)))) c k (\\g.Y)"
    );
  }

  @Test
  public final void test546() {
    reducesTo(
      "r (\\o.(\\j.(\\l.\\y.\\v.v) d) c) Y",
      "r (\\o.\\y.\\v.v) Y"
    );
  }

  @Test
  public final void test547() {
    reducesTo(
      "(\\n.(\\g.\\k.d) (a (\\a.\\g.(\\v.j (M (B (\\i.A)) ((\\i.J e (\\l.h)) (s j r) (m U)))) e))) (\\c.g)",
      "\\k.d"
    );
  }

  @Test
  public final void test548() {
    reducesTo(
      "\\d.(\\d.\\w.\\j.e) (\\s.u e) (\\n.v)",
      "\\d.\\j.e"
    );
  }

  @Test
  public final void test549() {
    reducesTo(
      "(\\s.\\g.(\\x.(\\j.\\p.(\\x.(\\f.s) (Y a) (f (f J))) (\\z.(\\x.\\n.i) s)) ((\\v.\\u.x) ((\\c.R) (y c) (\\r.(\\n.b) (\\p.R)))) g) I) ((\\z.x (\\r.\\t.\\b.r)) (\\d.g) (\\s.b (\\r.t) (\\z.j) (\\m.(\\j.c D) T ((\\a.(\\v.\\y.r c) ((\\f.h) (\\l.V))) (\\m.G Y))))) ((\\u.(\\m.(\\b.E) (\\g.v) (\\z.O) w) V) (\\p.i) ((\\o.G) (\\m.\\w.\\e.\\z.L s ((\\i.Y) d) (\\d.k k (\\d.\\x.(\\e.X j) (\\t.O l)))) C)) I",
      "x (\\r.\\t.\\b.r) (\\s.b (\\r.t) (\\z.j) (\\m.c D (\\y.r c))) (f (f J)) I"
    );
  }

}
