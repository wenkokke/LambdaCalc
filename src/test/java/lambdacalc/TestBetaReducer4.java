package lambdacalc;

import static org.junit.Assert.assertEquals;
import lombok.val;
import org.junit.Test;

public final class TestBetaReducer4 extends TestLambdaCalc {

  @Test
  public final void test0() {
    reducesTo(
      "p ((\\x.\\a.N (\\e.k)) (\\c.(\\y.b (\\w.\\b.\\h.d) p) ((\\n.w) (d w) (\\m.\\w.\\z.B) y) ((\\k.\\c.\\i.u) (\\u.A)) (\\e.(\\f.\\w.(\\p.(\\u.(\\q.u) (\\e.E)) w ((\\d.\\u.v a) (l (\\i.Z)))) (S ((\\a.m) (\\e.(\\w.r) (X Q))))) (n (\\o.\\v.o) (\\p.(\\z.\\k.(\\r.O) (o j) (c e (\\c.X))) V))))) P",
      "p (\\a.N (\\e.k)) P"
    );
  }

  @Test
  public final void test1() {
    reducesTo(
      "q ((\\g.(\\q.(\\o.(\\o.L) (\\k.i)) (\\x.(\\v.F) (l m)) ((\\a.f) (\\p.V) (\\s.r))) ((\\h.C (\\q.(\\l.t) p)) c)) ((\\s.m) ((\\d.\\o.\\z.b) ((\\f.(\\b.Q) (\\z.p)) (k (\\e.y)))))) ((\\u.(\\g.g) (N (\\n.\\w.\\q.p))) k (\\l.\\w.\\x.G) ((\\s.u) ((\\a.T) (\\f.\\l.\\f.(\\l.\\j.t d (K u) (Q (y H))) w)))) (M P o) r",
      "q (L (f (\\s.r))) (N (\\n.\\w.\\q.p) (\\l.\\w.\\x.G) (u)) (M P o) r"
    );
  }

  @Test
  public final void test2() {
    reducesTo(
      "(\\o.p (\\r.z)) (\\i.g (\\v.(\\a.(\\a.G) m) (\\h.r (\\i.\\w.F) (\\w.\\z.\\b.(\\g.\\f.y) ((\\m.f r) a)))) (\\o.(\\w.p (\\u.\\s.O) (\\z.\\r.\\l.\\s.\\z.X) ((\\h.\\d.b) (\\e.d) ((\\v.(\\d.o (h k)) (n (\\c.i))) (o (\\z.N F (m f)))))) (j ((\\v.U (c h) (\\c.\\g.i l)) e (\\b.x))))) s",
      "p (\\r.z) s"
    );
  }

  @Test
  public final void test3() {
    reducesTo(
      "(\\e.u) ((\\b.O (\\j.(\\a.P) (\\l.(\\a.\\c.X) (\\r.(\\j.R) ((\\x.\\z.\\r.(\\z.a w) (n (\\p.w))) (\\g.(\\v.\\g.G b) (A i (P l)))))))) (\\b.\\c.\\v.\\n.\\x.\\c.(\\e.\\w.(\\j.J) n) (z Q ((\\w.\\j.N (\\v.\\r.q)) (J ((\\u.K) (\\w.s)) (\\f.B)))) (a (\\a.h) H)))",
      "u"
    );
  }

  @Test
  public final void test4() {
    reducesTo(
      "\\u.\\c.r",
      "\\u.\\c.r"
    );
  }

  @Test
  public final void test5() {
    reducesTo(
      "(\\h.v) j ((\\q.\\g.f ((\\r.P) (w i) (K n (\\n.u))) (o (\\f.s n (\\i.d) (\\z.\\h.o r))) (\\b.h) (o (\\f.k) ((\\l.\\x.\\e.\\c.(\\y.(\\f.Z P) F) s) l)) e) (a (\\v.E ((\\l.(\\f.m) ((\\l.(\\z.s) (\\e.u)) (X (i X)))) b)) A))",
      "v (\\g.f (P (K n (\\n.u))) (o (\\f.s n (\\i.d) (\\z.\\h.o r))) (\\b.h) (o (\\f.k) (\\x.\\e.\\c.Z P)) e)"
    );
  }

  @Test
  public final void test6() {
    reducesTo(
      "k O ((\\v.(\\p.\\k.\\d.\\e.\\o.a) G) (x (\\n.q (\\p.(\\e.v o ((\\f.a y A L) (d (e a) (\\p.\\v.\\e.b)))) z))))",
      "k O (\\k.\\d.\\e.\\o.a)"
    );
  }

  @Test
  public final void test7() {
    reducesTo(
      "(\\e.T) (\\h.A)",
      "T"
    );
  }

  @Test
  public final void test8() {
    reducesTo(
      "m (\\k.(\\k.(\\n.\\r.\\v.(\\z.H) ((\\y.(\\z.t) J) (\\s.p)) (C (\\w.O (\\r.b) ((\\r.Z) (\\a.b)))) ((\\q.\\n.(\\u.o v) (f V)) (\\b.i) (x M (t f) (\\g.(\\r.D) (t n)) ((\\m.\\u.\\u.y) O)))) (\\q.a (\\q.\\b.\\g.\\j.C)) (\\u.B (\\u.o (\\c.\\l.q)))) (\\q.\\w.d))",
      "m (\\k.\\v.H (C (\\w.O (\\r.b) (Z))) (o v))"
    );
  }

  @Test
  public final void test9() {
    reducesTo(
      "\\v.\\a.(\\e.\\u.R) ((\\a.\\p.R) (\\k.\\g.(\\d.s) ((\\z.F) X) (\\k.k ((\\q.M C) (\\n.C)) (\\n.\\u.v)) (m (\\m.\\l.c) (\\k.P (\\d.\\t.(\\k.Z) (\\e.m s o) ((\\l.n g (\\n.x)) e) (g (\\x.\\p.x (\\x.\\m.s))))))))",
      "\\v.\\a.\\u.R"
    );
  }

  @Test
  public final void test10() {
    reducesTo(
      "(\\s.z A) ((\\v.\\y.\\b.(\\u.C y) (\\s.\\z.b)) ((\\p.z) ((\\f.Q) (H v))) j (\\e.\\s.\\c.I) ((\\e.(\\n.\\l.o) B) (\\m.\\s.m ((\\y.V) t) ((\\x.X) (\\o.(\\g.\\u.c) (w h (\\d.v))))))) (x e) (\\w.(\\i.\\b.\\u.(\\u.(\\j.(\\g.\\c.\\r.\\c.E) (\\j.(\\c.(\\z.k) (\\d.\\u.K)) (p ((\\w.v) r ((\\x.y) d))))) (J q)) g) m)",
      "z A (x e) (\\w.\\b.\\u.\\c.\\r.\\c.E)"
    );
  }

  @Test
  public final void test11() {
    reducesTo(
      "(\\f.x (\\t.X)) (q (\\l.\\a.(\\l.\\p.x (\\x.\\z.J) ((\\x.x) (\\b.\\i.H))) ((\\d.p) ((\\z.\\h.Y (s k M)) (\\l.\\d.m) b) p)))",
      "x (\\t.X)"
    );
  }

  @Test
  public final void test12() {
    reducesTo(
      "(\\k.\\j.(\\b.\\s.X r (\\e.v)) q ((\\x.\\a.(\\v.\\w.\\d.h) r) (G (l (\\u.l)) (\\c.(\\f.L v (\\a.F)) (c v (\\z.f))) (L (\\g.y) k ((\\r.\\c.\\i.R) (\\j.m O))) ((\\g.\\n.\\h.x) ((\\w.s u B) F ((\\m.\\t.w x) (\\t.\\n.\\n.p)))))) (\\j.V)) Q",
      "\\j.X r (\\e.v) (\\j.V)"
    );
  }

  @Test
  public final void test13() {
    reducesTo(
      "\\z.\\q.n (\\f.z (\\p.(\\d.(\\k.\\h.X) (\\r.\\i.(\\a.(\\n.\\v.o t) (\\u.\\n.\\a.T)) (\\s.(\\y.n (\\f.\\l.\\j.a) (\\c.m)) (J (\\a.\\i.\\i.\\r.k))))) ((\\r.Y) (\\w.\\z.f) (\\v.\\b.y))))",
      "\\z.\\q.n (\\f.z (\\p.\\h.X))"
    );
  }

  @Test
  public final void test14() {
    reducesTo(
      "s ((\\q.(\\v.w L ((\\r.N) (U S)) ((\\y.b) f ((\\l.o) n))) i y) (p ((\\c.(\\d.x) (\\c.R) F (\\h.Y)) (T ((\\l.\\u.\\x.m) (W u (\\w.E)))))) (\\j.\\h.U s)) (\\c.\\a.k p)",
      "s (w L (N) (b (o)) y (\\j.\\h.U s)) (\\c.\\a.k p)"
    );
  }

  @Test
  public final void test15() {
    reducesTo(
      "(\\p.a (\\k.(\\v.\\x.\\h.\\q.\\o.\\a.(\\g.\\k.(\\g.\\x.d (\\w.e)) V) (\\j.(\\u.(\\g.H f d (\\g.V) (y a C)) ((\\s.e u) ((\\c.M) (\\z.c) (\\v.(\\n.v) (\\u.h))))) ((\\f.(\\z.\\r.\\r.W) (\\n.h)) (A i (P y) (n d (\\w.y))) (\\u.e)))) ((\\e.\\m.h ((\\m.s ((\\a.l) (\\u.k))) u) g) (\\x.t M)))) (\\t.(\\o.\\n.\\v.(\\m.\\y.\\k.b (\\e.\\i.\\w.\\u.\\a.y)) (\\z.\\s.\\w.p (\\i.\\a.w)) (\\f.(\\w.u j) (Y (\\h.\\a.(\\f.x i (y l) z) (e y) (\\z.(\\j.\\w.\\t.C) r X))))) w)",
      "a (\\k.\\x.\\h.\\q.\\o.\\a.\\k.\\x.d (\\w.e))"
    );
  }

  @Test
  public final void test16() {
    reducesTo(
      "(\\u.(\\u.z) t) (\\j.(\\y.\\q.\\f.V) (\\g.\\q.l (\\x.\\t.o) o))",
      "z"
    );
  }

  @Test
  public final void test17() {
    reducesTo(
      "j ((\\d.\\b.\\v.(\\g.(\\r.G) (\\w.N) ((\\n.n) i (b o (\\b.X)) (\\w.\\q.S)) (\\w.a)) (v u c) ((\\p.\\t.\\d.d) (\\r.D) (\\b.n) (p ((\\y.(\\d.g) (\\n.B)) (r q)) (\\h.\\e.(\\t.(\\v.\\x.u) p) (c W))) (\\j.s ((\\g.C) ((\\i.\\o.(\\y.U) b (\\p.h)) ((\\e.\\p.G) (e b (R a)))))))) (\\r.p))",
      "j (\\b.\\v.G (i (b o (\\b.X)) (\\w.\\q.S)) (\\w.a) (p (g) (\\h.\\e.\\x.u) (\\j.s (C))))"
    );
  }

  @Test
  public final void test18() {
    reducesTo(
      "\\z.\\d.(\\h.(\\u.\\y.K) (\\a.(\\m.z) ((\\g.l) ((\\r.\\u.\\r.\\k.\\d.(\\u.x) (e d)) ((\\k.m) ((\\c.z) (f l))))) (\\p.n))) ((\\t.(\\e.R u (b M)) (\\o.v) o (\\t.t ((\\b.e) u)) ((\\s.\\j.D) (\\t.(\\h.(\\d.j) (\\d.D) (\\w.a)) (\\s.\\h.\\d.\\w.E)))) (V ((\\k.s ((\\h.(\\w.d) C) (l m))) X)) e) ((\\i.\\v.(\\u.\\b.(\\y.\\q.t) (\\r.k) ((\\x.i) (\\x.(\\s.(\\f.\\c.c) (J (G w))) (\\o.(\\z.\\r.G) X)))) b) (c ((\\t.\\x.i) (q n (T N) (r s Q) (\\f.\\v.o g (\\r.e) ((\\y.c) (\\n.s))) (\\l.K)))) (\\t.\\x.W))",
      "\\z.\\d.K"
    );
  }

  @Test
  public final void test19() {
    reducesTo(
      "(\\p.(\\u.T) s ((\\y.S r (\\n.s)) (\\p.p)) (\\z.t) N (\\x.(\\c.r (\\g.\\u.a) (\\c.X)) (\\t.\\m.\\u.C) p) ((\\b.W) (\\e.\\g.(\\x.\\v.s M (\\h.z) (\\z.\\e.k)) t ((\\z.z (q (d p))) (\\h.t Z q ((\\h.D) a)))) ((\\l.\\l.I) p)) ((\\u.p) m)) (\\e.(\\y.\\i.b) (\\i.\\z.(\\q.\\l.l) (\\y.\\e.P) F ((\\f.(\\d.c (\\g.w)) ((\\t.\\i.\\o.h) ((\\z.S) (\\v.o)) (K (\\r.\\o.\\e.p))) ((\\q.\\r.j) ((\\y.\\e.\\j.J) p) (a (\\v.f) (q d (\\x.x)) (\\o.(\\o.m) (\\u.D) g)))) j)))",
      "T (S r (\\n.s)) (\\z.t) N (\\x.r (\\g.\\u.a) (\\c.X) (\\e.\\i.b)) (W (\\l.I)) (\\e.\\i.b)"
    );
  }

  @Test
  public final void test20() {
    reducesTo(
      "\\e.g (c ((\\r.\\r.(\\k.f) (\\m.q) T) ((\\x.\\k.\\s.\\l.(\\z.J) E ((\\v.\\v.E (r (V r))) f) (r (\\t.q))) v)))",
      "\\e.g (c (\\r.f T))"
    );
  }

  @Test
  public final void test21() {
    reducesTo(
      "(\\s.e (Y n)) (I q (\\p.F (\\m.\\w.(\\u.(\\f.J w (\\c.P)) (\\q.i l C) ((\\m.x) (\\f.u) E)) (s x))) ((\\o.u l) (\\t.(\\p.\\j.i) ((\\o.\\c.d j) g (Q (J a) O))) ((\\u.F) ((\\f.\\n.h) A) (N (\\g.h)) (\\p.(\\q.h (X s)) (\\d.(\\x.\\o.\\i.V) h) (\\o.A)))) (\\f.\\a.z ((\\a.(\\w.(\\v.a e (\\z.v)) (\\o.\\q.\\g.p)) (\\d.Z (\\p.v h (o e)))) (\\q.\\b.\\t.t ((\\r.b) (k g) (t (R B))))) ((\\q.\\v.(\\c.(\\r.\\u.\\x.x P (v u)) ((\\b.(\\v.r) l) (\\f.\\q.T k))) (\\e.U)) (\\i.\\p.\\h.(\\i.\\h.b) y)) ((\\p.\\m.N (\\i.x)) (\\d.(\\t.q x) ((\\p.l) (\\b.\\p.r) (\\t.(\\q.e) (\\g.S) (\\v.(\\d.d) (\\p.B))))) K)))",
      "e (Y n)"
    );
  }

  @Test
  public final void test22() {
    reducesTo(
      "\\i.\\z.\\p.(\\g.(\\p.n (\\o.Z)) L) (x n)",
      "\\i.\\z.\\p.n (\\o.Z)"
    );
  }

  @Test
  public final void test23() {
    reducesTo(
      "\\c.d",
      "\\c.d"
    );
  }

  @Test
  public final void test24() {
    reducesTo(
      "\\n.(\\x.(\\d.(\\l.K) ((\\q.a) (\\r.(\\e.(\\y.B) f ((\\l.K) (\\c.m)) (\\h.\\v.(\\i.\\r.t) ((\\h.O) v))) (\\o.E K M ((\\s.r) (i U)) (Q n))))) ((\\z.\\q.b (\\f.\\m.\\z.k F)) K (\\l.\\h.(\\k.y) (D g (\\g.d)) g (\\g.\\r.b) ((\\m.g k (\\n.X) (\\h.l h (o Q)) (\\z.\\n.(\\n.\\u.h) p)) (\\j.\\t.\\p.\\x.\\a.w)))) u) (Q ((\\b.\\s.\\y.z (\\e.s) ((\\v.w) o) r ((\\h.F) a) r) (S (G (t P F) (f g (n d) Z)) j) (a x)))",
      "\\n.K u"
    );
  }

  @Test
  public final void test25() {
    reducesTo(
      "T (o (\\n.u b t (\\e.N) (R i (R n) c))) (a (\\d.\\m.\\d.(\\p.i v (b q) k) (\\y.v v) i)) R ((\\i.\\x.(\\e.\\l.\\c.R) ((\\o.I) (\\q.\\j.\\a.e) ((\\x.X Y) (N (\\u.\\p.D i))) (X (\\i.t) (\\v.\\n.j) (\\d.\\m.a) (\\v.n)))) h) (\\x.\\s.\\h.(\\h.k r) r)",
      "T (o (\\n.u b t (\\e.N) (R i (R n) c))) (a (\\d.\\m.\\d.i v (b q) k i)) R (\\x.\\l.\\c.R) (\\x.\\s.\\h.k r)"
    );
  }

  @Test
  public final void test26() {
    reducesTo(
      "p U (b a) (B (\\m.j)) (s (i q)) (\\x.O) f (\\c.o) ((\\i.G (i (m (q y) (X w (\\x.l)))) V) ((\\c.(\\u.f) i) (E f) ((\\c.D) (d v) (\\r.\\x.R Y)) (c (\\h.\\n.\\n.s)) ((\\k.\\z.B) (\\n.C b (B c)) (\\l.\\o.\\o.\\d.E) (\\p.z (\\c.\\d.(\\t.B) ((\\k.b) (h a))))))) (\\p.(\\x.\\v.d (u ((\\k.\\m.t (p T (a z))) m))) (\\q.\\z.\\e.H u u) ((\\w.\\w.w) E)) (\\b.z)",
      "p U (b a) (B (\\m.j)) (s (i q)) (\\x.O) f (\\c.o) (G (f (D (\\r.\\x.R Y)) (c (\\h.\\n.\\n.s)) (B (\\p.z (\\c.\\d.B))) (m (q y) (X w (\\x.l)))) V) (\\p.d (u (\\m.t (p T (a z))))) (\\b.z)"
    );
  }

  @Test
  public final void test27() {
    reducesTo(
      "(\\h.(\\o.\\h.\\b.(\\o.(\\f.z) ((\\g.\\e.\\p.v) ((\\l.k) n))) (\\f.(\\e.u) ((\\d.\\k.c) (\\z.\\t.\\x.u))) (\\c.g) ((\\v.\\n.(\\s.\\s.F) (\\h.\\i.o)) (T ((\\k.d) L)) (w (i u) (g p c) (\\d.z)) (\\g.(\\z.\\z.\\h.I) U (\\v.\\t.\\j.j j ((\\z.I) (\\t.c))) (\\e.K)))) (\\a.\\t.E) ((\\k.P ((\\o.\\h.j) (\\a.\\v.k))) (L (\\a.(\\h.u) (B v) (\\m.h))) (\\w.e) (\\y.I (Y (\\j.h (\\m.\\d.x)))) ((\\r.e i) (\\a.(\\n.c (\\z.(\\r.A) (\\n.g))) (\\s.D (\\c.\\b.\\q.y)) (J ((\\u.h) (\\t.c)) L)) (n m ((\\y.f) (\\n.k) ((\\w.I) ((\\o.g e (\\e.X)) (\\e.n)))))))) (\\w.r)",
      "\\b.z (\\c.g) (F)"
    );
  }

  @Test
  public final void test28() {
    reducesTo(
      "\\x.v",
      "\\x.v"
    );
  }

  @Test
  public final void test29() {
    reducesTo(
      "x i (\\l.\\u.e (d i (\\o.h) (D l (\\x.y)) (\\e.f) ((\\p.(\\r.d) (T h)) (z (\\k.b)) (\\h.(\\o.x) r)) (b (\\p.i))) (z H ((\\o.(\\y.g) h) (\\c.(\\m.(\\p.(\\u.S) (s n)) (\\w.\\z.q l) b) ((\\c.M (\\o.J)) Y (\\d.E)))))) ((\\b.(\\i.\\r.\\f.(\\j.(\\m.b) (i d) (\\o.O)) o ((\\f.I y F ((\\f.g) (\\s.H))) (g ((\\e.o) (\\q.U)))) (\\o.\\k.\\k.(\\t.\\t.\\d.\\n.u ((\\a.m) O)) (Q p J (\\b.\\e.Y m) (\\n.P ((\\p.t) (\\g.h)))))) ((\\t.k) ((\\a.j Y (f A)) (\\y.P)) (\\c.q) u) (p (\\z.l))) z)",
      "x i (\\l.\\u.e (d i (\\o.h) (D l (\\x.y)) (\\e.f) (d (\\h.x)) (b (\\p.i))) (z H (g))) (\\f1.z (\\o.O) (I y F (g)) (\\o.\\k.\\k.\\t.\\d.\\n.u (m)))"
    );
  }

  @Test
  public final void test30() {
    reducesTo(
      "s (J M ((\\d.(\\w.T) (z q)) ((\\w.s) (Y H))) (k (m g (n s)) (\\z.x))) i ((\\z.N (\\u.(\\w.c) h)) (\\p.\\f.g)) U (\\j.b (\\a.\\l.(\\d.F) (\\q.v)))",
      "s (J M (T) (k (m g (n s)) (\\z.x))) i (N (\\u.c)) U (\\j.b (\\a.\\l.F))"
    );
  }

  @Test
  public final void test31() {
    reducesTo(
      "(\\c.(\\u.\\t.w) (\\r.M)) (j (c (\\m.\\w.D (\\f.h b (\\p.(\\h.o) (\\s.(\\i.d) ((\\t.z) (\\p.h))) B)))))",
      "\\t.w"
    );
  }

  @Test
  public final void test32() {
    reducesTo(
      "q (\\g.w) (\\q.P)",
      "q (\\g.w) (\\q.P)"
    );
  }

  @Test
  public final void test33() {
    reducesTo(
      "(\\n.\\x.\\j.x) (\\n.\\n.(\\u.p (\\c.(\\m.V (d (\\v.V) (\\l.\\i.\\a.z))) i) t) ((\\w.t) R h) (Z I))",
      "\\x.\\j.x"
    );
  }

  @Test
  public final void test34() {
    reducesTo(
      "\\w.\\e.\\h.S",
      "\\w.\\e.\\h.S"
    );
  }

  @Test
  public final void test35() {
    reducesTo(
      "\\r.(\\f.\\f.\\j.v ((\\v.\\z.\\m.(\\k.m (\\q.(\\u.C Q) (n (\\o.i)))) (\\a.Y)) (\\f.q ((\\y.d ((\\x.h) (o a))) i)) a ((\\h.(\\d.h (\\h.\\n.\\i.(\\l.z z) (d (k q)))) ((\\v.I) m l) (H (\\t.\\q.y L) (\\j.G) (q (\\m.a) (\\l.K T f) (\\i.\\d.T (k r) a)))) (D (\\x.\\q.\\g.(\\g.q) (w t) (\\o.(\\x.d) (k v)) (\\q.y f Y (K j (\\t.C))) v))))) (h w P h X)",
      "\\r.\\f.\\j.v (D (\\x.\\q.\\g.q (\\o.d) (\\q.y f Y (K j (\\t.C))) v) (\\h.\\n.\\i.z z) (H (\\t.\\q.y L) (\\j.G) (q (\\m.a) (\\l.K T f) (\\i.\\d.T (k r) a))) (\\q.C Q))"
    );
  }

  @Test
  public final void test36() {
    reducesTo(
      "s (C ((\\f.(\\b.w) (\\f.\\e.\\c.c)) (w (\\y.h ((\\q.k) (B U)))) j)) (l ((\\p.(\\s.Y) (p h) (\\j.\\g.n) ((\\a.\\d.M) (\\z.\\v.\\b.v))) (\\y.\\y.b (\\t.(\\p.J i) (\\m.x))) (\\g.C ((\\h.D m B L) (h (x u (L F))))) z)) ((\\j.I) ((\\z.\\v.\\s.(\\s.(\\n.f ((\\y.l (\\k.r) ((\\q.P) (v p))) (p (\\i.\\d.p)))) (\\j.\\s.\\x.g (v e) (e (t t (j l))) F)) (\\u.\\l.\\p.(\\l.\\q.\\z.h) (\\f.(\\c.c) (\\d.Y u (A z) O) (g (a f) (C (r N (\\c.K))))))) (\\g.\\n.c (\\f.\\a.a l) (h (x Q) (\\o.T I (y h))) n ((\\n.(\\q.(\\s.\\m.\\m.u) (\\j.(\\x.q) (\\i.k))) (u (\\v.i))) (e (a V) y ((\\p.(\\q.Y) r) (e w m)))) (\\f.\\k.(\\e.p (\\g.(\\y.a) t ((\\k.\\s.\\l.A) M))) (\\u.(\\a.(\\d.(\\a.P) (\\o.K)) (j (\\d.Z))) (\\k.(\\s.\\z.m v) ((\\f.w) (m q))) ((\\t.\\f.B (\\h.a h)) (\\z.\\f.\\c.\\l.b)))))))",
      "s (C (w j)) (l (Y (\\j.\\g.n) (\\d.M) (\\g.C (D m B L)) z)) (I)"
    );
  }

  @Test
  public final void test37() {
    reducesTo(
      "(\\o.a (\\r.y)) (\\x.T) (\\q.(\\o.\\t.\\k.\\j.(\\s.i ((\\t.c) (j R)) (\\d.\\x.x j (P n) (N l (\\j.u)))) ((\\p.\\r.\\o.\\x.u) (\\e.\\v.\\u.\\b.i))) (\\k.(\\v.x (\\q.z) (\\e.\\s.\\s.Z) u) (B (\\s.q) ((\\y.U W (n v)) l))) ((\\l.p k h) h (\\w.\\w.z (\\y.r) (\\j.\\s.Q)) (\\c.i o) (\\m.(\\h.\\k.\\w.I) ((\\a.g) x ((\\n.C) z) (\\q.\\e.\\v.n)))) (\\q.\\g.(\\b.\\c.t) ((\\o.\\k.\\f.J) (\\y.\\p.t (l (\\k.v)) f) ((\\e.m) (\\y.(\\a.(\\t.\\b.\\e.H) (T b (i B))) (c h (\\u.s) (\\c.\\o.\\a.Q)))))) (\\n.x))",
      "a (\\r.y) (\\q.i (c) (\\d.\\x1.x1 (\\n.x) (P n) (N l (\\j.u))))"
    );
  }

  @Test
  public final void test38() {
    reducesTo(
      "n ((\\d.\\v.q) (\\n.(\\r.e r (\\i.E)) (Q (n c)) J l (B (\\b.\\d.\\x.V) ((\\k.\\b.j n) ((\\i.t) (a s))) (U ((\\l.M) h)))) (\\t.Z (\\a.c (q (z (I k f ((\\m.G) L))))))) (\\e.a)",
      "n (q) (\\e.a)"
    );
  }

  @Test
  public final void test39() {
    reducesTo(
      "(\\q.\\j.y) (a (\\k.(\\u.\\k.(\\w.f) (l f (\\p.C) (\\m.d) L)) g (N (\\b.\\a.w)))) (V u (\\o.\\q.\\a.E (m j)) (\\o.(\\u.(\\t.\\g.\\o.V) (I m ((\\t.\\r.\\t.(\\g.\\f.F) (l (\\k.b) t)) ((\\i.g (V n)) q t)))) (\\i.\\o.c)))",
      "y"
    );
  }

  @Test
  public final void test40() {
    reducesTo(
      "(\\v.(\\t.F) ((\\g.r) S p)) ((\\k.d) (\\e.(\\u.(\\b.f) (\\o.\\i.(\\b.\\o.q) (\\v.(\\u.\\f.W) (\\d.\\f.A))) (\\u.(\\h.\\h.(\\h.\\f.d) v) h (\\n.\\q.w))) (w R ((\\i.\\x.\\n.\\m.\\a.w U) o))) ((\\l.\\l.\\o.\\n.\\z.(\\e.p) (\\n.(\\r.(\\q.\\n.m) (\\t.(\\i.D) r b)) (\\e.X (\\c.q)) ((\\s.w M (\\t.V)) (\\y.x q) (\\y.u) y))) d))",
      "F"
    );
  }

  @Test
  public final void test41() {
    reducesTo(
      "\\l.N (\\n.\\f.\\i.\\a.\\f.g) (\\y.(\\t.h (\\j.\\i.\\r.\\t.(\\j.g) (\\f.\\y.(\\r.\\m.g) ((\\f.N (N q I)) D ((\\m.V) (m v) ((\\o.z) (\\i.e)) (\\h.\\l.(\\q.s) (z p) (Q D h))))))) (L u))",
      "\\l.N (\\n.\\f.\\i.\\a.\\f.g) (\\y.h (\\j.\\i.\\r.\\t.g))"
    );
  }

  @Test
  public final void test42() {
    reducesTo(
      "(\\m.b) M",
      "b"
    );
  }

  @Test
  public final void test43() {
    reducesTo(
      "\\c.s",
      "\\c.s"
    );
  }

  @Test
  public final void test44() {
    reducesTo(
      "\\e.g ((\\z.R) c)",
      "\\e.g (R)"
    );
  }

  @Test
  public final void test45() {
    reducesTo(
      "\\u.\\o.(\\j.\\p.w) (\\j.\\e.(\\b.a (\\l.j ((\\x.q) ((\\w.l) X))) (o (\\b.b (\\y.g)) ((\\h.\\c.\\p.H) g) ((\\m.\\e.(\\p.Y T) (\\k.\\c.m)) (\\m.\\t.\\t.U))) (\\d.(\\r.n (\\c.(\\z.r) x ((\\e.u) (\\r.p)) (D (\\p.x d (K c))))) (\\b.(\\g.\\c.w ((\\c.\\r.Y i) ((\\y.y) d))) (\\b.T (F x (O Y) (\\d.\\k.Z)))))) (\\q.\\u.t) ((\\f.\\o.H y n) ((\\y.\\x.\\p.x) ((\\j.\\v.k t) n (\\e.(\\t.R) (r g) (\\z.O))) ((\\s.S (\\h.Z) (E (n q) (\\a.\\a.e X))) (K (\\v.N) (\\s.\\z.\\a.Y) (\\p.q)))) V))",
      "\\u.\\o.\\p.w"
    );
  }

  @Test
  public final void test46() {
    reducesTo(
      "(\\i.g ((\\v.\\a.\\t.z) (q ((\\s.m) (\\l.u) (\\c.F)))) (\\s.\\o.\\t.\\h.L (\\g.\\e.m)) ((\\t.e (\\g.\\h.b (\\c.\\j.R)) (x (\\r.(\\n.\\j.R d) (\\i.W z m)))) (u (\\k.\\i.(\\m.c) (\\a.C) ((\\g.h) (n w)) (\\j.s))) k) (\\s.\\q.(\\h.(\\c.s ((\\n.v) s) (c (\\f.\\g.a j))) T c (\\v.(\\p.(\\d.a g) (\\j.(\\d.N) ((\\u.m) (t r)) (\\i.\\n.(\\u.H) ((\\x.g) (\\e.F))))) (\\i.\\r.h))) ((\\p.(\\i.(\\l.\\e.(\\n.y) (\\d.t l)) j) (p (\\g.\\k.y))) (\\a.(\\s.u) (A y) J ((\\p.(\\b.T) (\\r.x)) (\\j.u)) (\\t.N (\\k.\\k.(\\u.\\d.u) (I H (Y h))))) (\\g.(\\i.\\e.\\c.\\y.(\\s.M Z) (k (\\u.\\m.Z))) ((\\v.\\g.\\q.h) b) J)))) k",
      "g (\\a.\\t.z) (\\s.\\o.\\t.\\h.L (\\g.\\e.m)) (e (\\g.\\h.b (\\c.\\j.R)) (x (\\r.\\j.R d)) k) (\\s.\\q.s (v) (T (\\f.\\g.a j)) c (\\v.a g))"
    );
  }

  @Test
  public final void test47() {
    reducesTo(
      "\\y.(\\b.(\\y.\\v.(\\e.(\\v.\\d.e (\\f.\\n.f)) y (\\b.\\p.c (\\j.\\f.X) K)) (\\e.\\r.\\k.\\e.(\\j.\\u.\\g.\\b.(\\d.u) (\\k.\\n.w) e) C) ((\\w.\\m.\\c.W (\\y.\\s.\\t.D R (\\j.w))) p l)) ((\\v.z) (\\z.(\\z.\\i.\\n.l (\\z.\\d.\\u.X G) P) (\\f.\\r.\\k.(\\t.\\w.\\i.\\e.q) P))) (\\v.\\j.\\d.w)) (\\z.\\m.(\\w.(\\r.\\e.l) ((\\l.(\\d.(\\e.\\u.\\m.o (\\x.O)) p) (n (\\e.\\l.\\s.\\f.\\z.d))) (\\m.\\u.\\f.Z (\\a.(\\e.\\y.\\v.s) (\\l.\\f.G)))) (\\g.r)) N)",
      "\\y.\\k.\\e.\\u.\\g.\\b.u e"
    );
  }

  @Test
  public final void test48() {
    reducesTo(
      "\\y.O",
      "\\y.O"
    );
  }

  @Test
  public final void test49() {
    reducesTo(
      "\\w.(\\t.(\\o.P (\\v.s ((\\s.\\r.(\\a.(\\o.F) v) i (X c (\\e.(\\b.e) c))) ((\\z.R) (\\w.\\g.m) w))) (\\z.\\o.(\\o.\\h.\\h.(\\w.\\c.v) M ((\\d.e) ((\\k.\\f.\\d.H) (\\g.l))) (\\h.b)) (\\i.\\a.f))) (\\t.\\r.n)) (g (\\j.\\v.a))",
      "\\w.P (\\v.s (\\r.F (X c (\\e.e)))) (\\z.\\o.\\h.\\h.v (\\h.b))"
    );
  }

  @Test
  public final void test50() {
    reducesTo(
      "\\z.\\u.A",
      "\\z.\\u.A"
    );
  }

  @Test
  public final void test51() {
    reducesTo(
      "(\\t.\\f.e) (l m)",
      "\\f.e"
    );
  }

  @Test
  public final void test52() {
    reducesTo(
      "\\j.(\\f.G) ((\\g.t (h (l s) (T (o Y (e I))) (\\w.\\o.(\\v.\\p.\\v.\\h.\\c.\\f.z) j))) (\\b.e)) (\\x.m N) (\\s.\\e.\\s.b (\\z.(\\g.(\\c.k) (\\y.Z) (\\m.(\\d.z) (\\c.D)) (\\s.(\\r.t (x U)) (\\j.(\\r.q) (\\f.b))) (\\u.n) (\\c.c)) (G ((\\z.\\g.\\k.S) (\\a.U)) (\\l.\\t.\\p.\\o.\\z.N)) (C (\\o.v t))))",
      "\\j.G (\\x.m N) (\\s.\\e.\\s.b (\\z.k (\\m.z) (\\s.t (x U)) (\\u.n) (\\c.c) (C (\\o.v t))))"
    );
  }

  @Test
  public final void test53() {
    reducesTo(
      "\\u.(\\t.t) (\\q.X)",
      "\\u.\\q.X"
    );
  }

  @Test
  public final void test54() {
    reducesTo(
      "(\\b.\\i.j) (\\a.\\m.\\u.\\i.\\r.\\b.\\k.i a)",
      "\\i.j"
    );
  }

  @Test
  public final void test55() {
    reducesTo(
      "(\\r.Q) (\\q.w ((\\i.u) ((\\l.a) (\\b.(\\b.\\f.\\h.C) (\\z.\\l.f d) (\\i.(\\q.b) (\\d.M) (Z k (q z))) m))) (\\c.B (\\d.y k)))",
      "Q"
    );
  }

  @Test
  public final void test56() {
    reducesTo(
      "\\v.\\t.\\f.\\a.o",
      "\\v.\\t.\\f.\\a.o"
    );
  }

  @Test
  public final void test57() {
    reducesTo(
      "\\q.\\y.\\x.Z",
      "\\q.\\y.\\x.Z"
    );
  }

  @Test
  public final void test58() {
    reducesTo(
      "(\\u.\\p.\\j.(\\u.h (\\g.\\m.(\\v.R) ((\\y.O) z)) m) q (W ((\\u.\\u.b) ((\\c.C) P (\\r.(\\g.\\h.n) Q (\\e.(\\x.H) (\\c.g) X))))) ((\\q.G) (\\l.L) e q)) ((\\a.(\\q.\\o.\\a.G) (\\e.l h)) (\\y.\\v.\\i.\\v.m) (\\s.\\p.G (B (\\h.T)) (\\x.l (\\f.c))) (l c (\\y.b) r t U) (\\e.\\t.y) (S ((\\w.x (\\k.Y)) X) (\\y.\\i.\\b.\\w.\\w.s)) (n (\\p.L r)))",
      "\\p.\\j.h (\\g.\\m.R) m (W (\\u.b)) (G e q)"
    );
  }

  @Test
  public final void test59() {
    reducesTo(
      "\\k.\\w.\\a.(\\t.w) ((\\m.M) ((\\c.F) J))",
      "\\k.\\w.\\a.w"
    );
  }

  @Test
  public final void test60() {
    reducesTo(
      "\\t.R ((\\x.\\z.\\d.(\\x.(\\o.\\q.\\q.\\x.(\\r.U) (\\r.n) (r i (\\d.u)) (D z i (\\h.\\h.\\m.r)) F (\\z.N (\\g.E) (\\w.F) (w a ((\\g.b) (i p)) (\\c.\\r.i)))) (\\h.v p)) x) b)",
      "\\t.R (\\z.\\d.\\q.\\q.\\x.U (r i (\\d.u)) (D z i (\\h.\\h.\\m.r)) F (\\z.N (\\g.E) (\\w.F) (w a (b) (\\c.\\r.i))))"
    );
  }

  @Test
  public final void test61() {
    reducesTo(
      "(\\f.U) ((\\b.d) (\\g.U)) (c (\\k.\\y.y))",
      "U (c (\\k.\\y.y))"
    );
  }

  @Test
  public final void test62() {
    reducesTo(
      "(\\f.l) (\\g.\\h.y) (\\c.\\n.K y (\\d.\\m.\\u.\\n.x))",
      "l (\\c.\\n.K y (\\d.\\m.\\u.\\n.x))"
    );
  }

  @Test
  public final void test63() {
    reducesTo(
      "\\i.\\s.w (w i z (\\q.c (\\r.\\h.\\p.m R (\\l.b) (\\v.t))))",
      "\\i.\\s.w (w i z (\\q.c (\\r.\\h.\\p.m R (\\l.b) (\\v.t))))"
    );
  }

  @Test
  public final void test64() {
    reducesTo(
      "(\\t.\\w.S (\\s.t (z M))) ((\\m.\\t.r (\\k.d)) (\\g.\\z.n q))",
      "\\w.S (\\s.r (\\k.d))"
    );
  }

  @Test
  public final void test65() {
    reducesTo(
      "(\\a.(\\l.H j) (\\o.u f)) n (\\n.\\n.\\n.(\\g.(\\v.\\t.(\\a.L (\\o.(\\r.t) (Z X))) (\\k.\\e.B (\\q.R) H) ((\\q.z) (\\e.(\\q.V o (\\t.e)) (u r (x S))))) h ((\\n.(\\m.y (\\j.\\z.C R)) U ((\\k.\\g.\\p.\\l.\\r.(\\h.l) (R o)) (\\l.Q))) (\\x.\\f.\\x.\\o.\\x.\\p.y))) (m (\\t.j (i ((\\v.h) k)))) u)",
      "H j (\\n.\\n.\\n.L (\\o1.y (\\j.\\z.C R) (\\g.\\p.\\l.\\r.l)) (z) u)"
    );
  }

  @Test
  public final void test66() {
    reducesTo(
      "(\\n.\\l.(\\k.r) (\\m.o) (\\f.(\\k.\\c.\\f.q (\\g.\\h.(\\k.H) e v (\\y.\\j.u Z (\\y.n) (M L (\\h.S))))) (\\x.Q (\\j.\\s.q)) l ((\\c.\\n.A (\\j.\\j.\\w.\\k.H ((\\p.o) (\\h.N)) (\\b.I) (\\y.(\\r.(\\u.f) (\\w.o)) (\\j.h y) N))) (p ((\\m.\\d.B K) K) (a u (t p) (\\p.o) (\\a.(\\s.(\\m.J) (q j)) (a O V))) (C S))))) (\\b.\\d.\\z.(\\z.(\\u.(\\q.\\m.i) ((\\s.\\g.\\a.\\a.\\y.\\r.x) (M C (s r) (\\d.D (\\h.r))))) (i (\\c.\\r.C J (\\j.c)))) C (\\v.(\\s.N) ((\\u.l (a (\\l.\\h.\\y.g) ((\\g.h) (H p) (\\b.\\b.\\k.Q)))) (\\k.\\n.\\t.m K))) (\\t.(\\f.\\v.\\w.g) (R b (\\u.a)) (\\m.\\y.\\b.\\o.\\e.d) (\\u.J (E (i y) (\\a.j))) ((\\f.(\\y.g) (x i)) (\\j.\\o.K) (f (q b) d) (\\y.w)) m (\\h.(\\f.\\c.\\g.\\f.\\c.(\\x.(\\k.h (C r (h T))) (\\s.n) c) (\\d.x (e ((\\f.P) (w m))) (\\y.\\g.\\k.Q))) ((\\x.s) m L (\\e.\\e.\\n.O) ((\\d.Y) ((\\f.b) (i R)) r (\\g.l))))))",
      "\\l1.r (\\f2.q (\\g4.\\h5.H v (\\y6.\\j7.u Z (\\y8.\\b.\\d.\\z.i (\\t.g (g (f (q b) d) (\\y.w)) m (\\h.\\c.\\g.\\f.\\c.h (C r (h T)) c))) (M L (\\h.S)))))"
    );
  }

  @Test
  public final void test67() {
    reducesTo(
      "\\d.z",
      "\\d.z"
    );
  }

  @Test
  public final void test68() {
    reducesTo(
      "x L (\\i.(\\k.\\s.\\x.(\\c.(\\d.\\y.\\r.(\\b.\\k.J ((\\n.F) H ((\\x.u) (\\g.T)) (\\l.\\g.d))) (\\e.\\i.(\\w.(\\f.\\w.(\\k.b) X z) (o J z (\\z.x P (G G)))) (F ((\\f.a l (C y)) (c (\\p.Y)))))) ((\\p.\\v.v) W)) (t (U s ((\\z.(\\f.s (G N) (\\n.(\\r.v) (\\a.Z))) (K z)) (\\v.\\d.(\\s.\\k.\\c.C) (t a h) (\\x.J)))))) x)",
      "x L (\\i.\\s.\\x.\\y.\\r.\\k.J (F (u) (\\l.\\g.\\v.v)))"
    );
  }

  @Test
  public final void test69() {
    reducesTo(
      "(\\z.u) D (\\i.T)",
      "u (\\i.T)"
    );
  }

  @Test
  public final void test70() {
    reducesTo(
      "\\w.(\\c.\\y.C) ((\\p.g) (\\k.\\b.j)) S",
      "\\w.C"
    );
  }

  @Test
  public final void test71() {
    reducesTo(
      "y (\\e.m)",
      "y (\\e.m)"
    );
  }

  @Test
  public final void test72() {
    reducesTo(
      "r ((\\e.w S) ((\\u.\\n.q U) x (\\x.\\x.(\\k.\\a.E) (\\v.i k)) (\\y.\\x.\\w.i)) (n W)) ((\\a.l H (h A) o V i (\\m.\\b.\\z.\\v.(\\j.(\\e.r) (y N)) (d (e e)) (\\n.l) w)) (\\s.(\\n.m) d ((\\a.(\\y.a) (\\r.a)) P ((\\g.\\a.I e) (i E (n n)))) (\\z.\\a.(\\k.(\\u.\\s.\\n.(\\r.u) a) (\\y.E)) f)) ((\\q.c C) (\\y.\\o.\\l.(\\b.(\\m.\\j.X) (\\k.\\p.k)) (\\u.(\\u.e) (E J) (\\m.f m))) (\\s.\\q.I) D)) q",
      "r (w S (n W)) (l H (h A) o V i (\\m.\\b.\\z.\\v.r (\\n.l) w) (c C (\\s.\\q.I) D)) q"
    );
  }

  @Test
  public final void test73() {
    reducesTo(
      "(\\y.(\\q.q (d ((\\j.x) N) M ((\\d.I ((\\c.y) (E u) (\\p.h z (f q)))) (Y v)))) ((\\e.(\\j.(\\y.\\k.\\i.y b (i z) (p (D L))) ((\\y.g) f ((\\w.b) A)) (\\y.\\m.(\\t.u (b s)) (L q (w k)) (\\q.(\\d.\\g.c) (\\k.\\l.u)))) t) (y (\\m.\\z.\\d.X ((\\a.\\z.\\k.f) (\\y.(\\v.B) (i e)) (\\q.(\\t.E) (\\f.N) ((\\m.l) (r y))))))) (\\w.\\h.X (\\d.y) (\\e.m))) ((\\y.\\m.\\r.\\q.m (U ((\\s.\\c.\\f.A) ((\\j.(\\u.k) (\\a.Z) (\\r.v r m)) (q (\\d.\\e.\\s.u)))))) (\\b.W e) (\\f.i ((\\i.\\v.R) b) (\\a.m (\\i.(\\b.(\\f.d C (\\y.z)) (\\n.Z) (\\s.i Y p ((\\w.s) (Y t)))) (\\j.\\q.\\h.g (\\b.f) r r))) (\\h.x u (\\a.E) A L (\\p.\\p.\\a.\\z.v b) ((\\i.(\\k.n) k l) (W r (\\i.n) (\\r.\\h.n)) (T ((\\g.g) (\\i.o)) (\\f.u (r (\\w.C))))) V)))",
      "g (b) b (d (x) M (I (\\q.i (\\v.R) (\\a.m (\\i9.d C (\\y.z) (\\s.i9 Y p (s)))) (\\h.x u (\\a.E) A L (\\p.\\p.\\a.\\z.v b) (n l (T (\\i.o) (\\f.u (r (\\w.C))))) V))) z) (p (D L)) (\\w.\\h.X (\\d5.\\r12.\\q.i (\\v.R) (\\a.m (\\i14.d C (\\y.z) (\\s.i14 Y p (s)))) (\\h.x u (\\a.E) A L (\\p.\\p.\\a.\\z.v b) (n l (T (\\i.o) (\\f.u (r (\\w.C))))) V)) (\\e.m))"
    );
  }

  @Test
  public final void test74() {
    reducesTo(
      "(\\o.\\k.\\r.\\k.\\b.i (H v) ((\\e.q) ((\\g.r r q) (x (\\r.Y o t ((\\z.R) M)))))) (\\j.\\r.\\v.E) (\\m.\\i.\\p.\\q.\\d.(\\i.(\\l.(\\l.(\\y.l) (\\g.\\t.o G) K) (\\a.C ((\\j.d) (j L)) (\\z.(\\n.\\i.Y) (\\h.\\q.f))) (\\o.(\\u.M) ((\\s.t a r) ((\\g.e) (V u))) (C (\\p.(\\g.y) ((\\f.l) (\\b.o)))))) u) (F ((\\v.\\p.\\n.s (Z a) (\\d.\\d.f s) (\\g.Y K O ((\\u.z) e))) ((\\a.f) (\\y.l) (\\a.\\m.R) (m w Q ((\\x.n) (u S)))) h))) (g (T (N (\\i.(\\x.\\f.i ((\\p.P Q (X e)) S)) o))) ((\\v.(\\l.\\w.(\\t.r) (x w) (e J (a y))) ((\\o.M) (\\o.f) (\\e.(\\r.m) (t w))) (u ((\\l.p) l) (J b))) (\\n.(\\f.\\g.l) ((\\x.k f p (\\p.a h J)) (\\l.\\u.\\z.\\i.\\d.r))) ((\\u.B) (\\z.(\\b.\\i.t ((\\l.R) (\\e.n) (\\a.k))) (\\z.S (\\f.u)))) (\\c.k (\\e.Z))))",
      "\\k1.\\b2.i (H v) (q)"
    );
  }

  @Test
  public final void test75() {
    reducesTo(
      "g (D (\\q.(\\n.\\j.\\a.t) (\\u.\\y.\\h.(\\l.o) (\\w.(\\a.\\c.\\v.\\a.\\s.H) ((\\i.\\q.\\y.(\\q.\\y.m J (\\d.t)) (\\s.z)) ((\\g.(\\b.u) (a e) (\\b.d)) ((\\i.M) z ((\\g.p) (g G)))))))))",
      "g (D (\\q.\\j.\\a.t))"
    );
  }

  @Test
  public final void test76() {
    reducesTo(
      "\\b.\\z.\\g.f",
      "\\b.\\z.\\g.f"
    );
  }

  @Test
  public final void test77() {
    reducesTo(
      "q (\\z.(\\d.a) ((\\r.(\\l.\\z.\\a.(\\z.(\\r.q) ((\\q.h) (N B)) (\\s.w v X (\\n.\\z.c))) (\\h.(\\w.\\i.(\\d.o V) (C z (\\o.x))) (\\h.\\a.\\e.(\\b.M) (\\x.a)))) q ((\\w.(\\c.\\y.L) X) ((\\n.(\\a.m) (\\r.R)) ((\\o.f) (\\z.x)) (\\b.s) d))) ((\\g.\\n.\\y.(\\v.u) ((\\a.(\\r.\\v.\\g.Y) (\\g.\\v.h)) (\\g.r (a o)))) ((\\v.\\g.H Q (\\j.m) (\\c.\\l.Z)) (j (b a) b) (k V)) (\\c.y))))",
      "q (\\z.a)"
    );
  }

  @Test
  public final void test78() {
    reducesTo(
      "j (y (\\o.\\c.f)) (t (\\q.\\f.\\x.\\x.\\t.h ((\\j.(\\r.\\g.\\k.\\y.(\\y.V) (B Z) (w (D p)) ((\\d.h) (\\s.\\k.t))) (\\a.Z) e) J)))",
      "j (y (\\o.\\c.f)) (t (\\q.\\f.\\x.\\x.\\t.h (\\k.\\y.V (w (D p)) (h))))"
    );
  }

  @Test
  public final void test79() {
    reducesTo(
      "(\\y.(\\g.(\\x.r) h) ((\\g.u) ((\\a.(\\s.s) (j q) (q o (\\q.o)) g) (\\e.\\j.\\d.(\\z.Q (X A) (e x (e q))) (\\i.(\\j.k) N ((\\w.x) (e O))))) (\\m.\\i.\\m.\\j.v l) ((\\p.O (\\x.e r w)) (\\g.\\m.\\p.l U (B h) (c (s K))) (\\q.\\w.\\s.\\k.\\w.\\o.h) (\\w.(\\b.e) (\\x.c) ((\\e.\\a.\\d.B) ((\\g.r) (h s))) (\\u.e)) (O (\\i.\\t.N s h z) ((\\o.g c (t j) (\\h.(\\x.U) (\\q.u)) o) (\\h.\\v.\\n.z)))))) b",
      "r"
    );
  }

  @Test
  public final void test80() {
    reducesTo(
      "\\o.S ((\\n.(\\i.h (V K k) B Z ((\\g.(\\x.\\n.k) z) (i ((\\y.K) a (\\r.(\\p.B) D))))) (\\r.(\\l.\\q.\\i.(\\o.R (\\r.\\f.l)) (\\t.\\r.h (y r (\\j.J) (\\e.X e)))) q) (r (V ((\\o.L v) (\\v.x w (\\v.y)))) (c I) b)) (\\p.\\v.\\z.(\\r.(\\h.h) (\\u.\\s.\\p.\\n.a M ((\\d.\\n.\\h.s) (f F (l u))) ((\\k.\\e.\\w.W) (\\e.p) ((\\s.H) n (\\y.\\z.n))))) (\\w.f ((\\m.n) (\\b.(\\m.w) (\\a.a)) (l (a Y) (e (\\u.n))) y)) c))",
      "\\o.S (h (V K k) B Z (\\n.k) (r (V (L v)) (c I) b))"
    );
  }

  @Test
  public final void test81() {
    reducesTo(
      "t (c (\\q.(\\v.\\n.(\\k.\\d.\\s.(\\z.\\w.\\u.q) (\\g.\\c.(\\o.i) (\\b.\\s.y n) ((\\h.k (M o)) (w (I a)))) (\\v.\\k.\\h.(\\x.(\\g.\\h.\\o.\\m.\\g.o) ((\\i.M) (T D) (\\k.u d (\\p.A)))) i)) o) ((\\u.G) i)))",
      "t (c (\\q.\\n.\\d.\\s.\\u.q))"
    );
  }

  @Test
  public final void test82() {
    reducesTo(
      "\\j.\\c.t",
      "\\j.\\c.t"
    );
  }

  @Test
  public final void test83() {
    reducesTo(
      "g (J B)",
      "g (J B)"
    );
  }

  @Test
  public final void test84() {
    reducesTo(
      "\\w.j W",
      "\\w.j W"
    );
  }

  @Test
  public final void test85() {
    reducesTo(
      "\\c.k",
      "\\c.k"
    );
  }

  @Test
  public final void test86() {
    reducesTo(
      "\\x.h (F (w ((\\f.a (\\d.s) ((\\u.Q) (X a))) (\\e.O (\\j.\\r.n))) ((\\y.S) (\\l.v))) x X)",
      "\\x.h (F (w (a (\\d.s) (Q)) (S)) x X)"
    );
  }

  @Test
  public final void test87() {
    reducesTo(
      "z U ((\\l.\\u.H ((\\t.\\g.t (I e)) (v ((\\b.u) (\\n.k) P) (\\b.\\a.\\h.\\y.w)) m)) (\\m.\\x.(\\w.\\q.r) d))",
      "z U (\\u.H (v (u P) (\\b.\\a.\\h.\\y.w) (I e)))"
    );
  }

  @Test
  public final void test88() {
    reducesTo(
      "\\m.\\u.P",
      "\\m.\\u.P"
    );
  }

  @Test
  public final void test89() {
    reducesTo(
      "(\\s.\\b.A) X",
      "\\b.A"
    );
  }

  @Test
  public final void test90() {
    reducesTo(
      "\\u.(\\z.X) ((\\e.\\m.\\k.\\v.\\r.\\i.\\r.(\\h.t) (Z u) (H (y N)) S Y (\\e.\\x.(\\o.h) (\\f.\\p.(\\l.T) (H h A) (\\b.\\c.h)))) (\\s.o (\\o.o))) o (\\l.w)",
      "\\u.X o (\\l.w)"
    );
  }

  @Test
  public final void test91() {
    reducesTo(
      "\\f.c ((\\i.y) m w)",
      "\\f.c (y w)"
    );
  }

  @Test
  public final void test92() {
    reducesTo(
      "(\\z.m) S c ((\\j.Y) (\\y.\\e.Y))",
      "m c (Y)"
    );
  }

  @Test
  public final void test93() {
    reducesTo(
      "(\\l.K) (\\k.\\i.m) Q",
      "K Q"
    );
  }

  @Test
  public final void test94() {
    reducesTo(
      "(\\r.(\\c.\\l.n) V ((\\l.K) ((\\r.(\\g.\\f.J s) Y) (\\f.H i (z g) M))) (\\f.\\j.S ((\\o.u) m)) x i) (\\r.\\z.H ((\\d.Q j (\\t.\\g.Q (C a) (k Y i) k) n) (\\i.(\\y.n) (\\e.P (\\m.\\h.y)) (\\h.\\x.z (\\c.x))) (a z ((\\g.h (\\p.\\p.\\u.\\q.z)) Z) (\\i.(\\q.s (x l) (\\s.\\a.V W)) (f g) b w))))",
      "n (\\f.\\j.S (u)) x i"
    );
  }

  @Test
  public final void test95() {
    reducesTo(
      "\\r.\\k.\\g.A",
      "\\r.\\k.\\g.A"
    );
  }

  @Test
  public final void test96() {
    reducesTo(
      "\\r.(\\o.(\\m.\\e.\\l.(\\k.\\k.\\y.\\m.b (b (\\g.z) v (\\j.\\e.\\f.(\\l.\\v.(\\a.t) (\\y.x)) n))) c a) ((\\k.(\\k.O (\\i.\\v.\\d.(\\y.(\\l.q x) (\\j.\\b.f)) r O)) (\\t.L)) a)) (\\z.(\\z.\\w.F) (\\l.\\e.(\\l.\\k.U g) m j))",
      "\\r.\\e.\\l.\\y.\\m.b (b (\\g.z) v (\\j.\\e.\\f.\\v.t))"
    );
  }

  @Test
  public final void test97() {
    reducesTo(
      "\\j.(\\x.\\z.M (\\v.b (\\b.t) ((\\h.r) j))) i",
      "\\j.\\z.M (\\v.b (\\b.t) (r))"
    );
  }

  @Test
  public final void test98() {
    reducesTo(
      "(\\i.\\m.Q) (R (\\n.(\\s.\\f.\\k.b (\\p.\\m.b)) (\\n.\\v.\\w.o) (u w) (\\i.e)) ((\\n.c) n ((\\h.\\r.\\m.h) (u ((\\o.I) (\\y.o)) (\\n.\\m.(\\p.r) (\\p.m) (\\b.i G))) (L t)))) (s ((\\t.C) ((\\i.s) o)))",
      "Q"
    );
  }

  @Test
  public final void test99() {
    reducesTo(
      "\\n.b (\\y.\\l.\\q.b (\\k.\\r.d (e (S N (u w) (\\b.\\s.X d) (\\b.\\s.\\x.(\\x.\\f.w) (\\r.h))) ((\\z.\\l.\\g.R) (\\z.\\n.\\r.n) (\\y.(\\r.W (L w)) (\\y.Q S (\\k.v))) (\\e.\\d.B (\\w.\\f.Y)))))) ((\\f.n) (U (\\h.(\\f.(\\l.a) v (\\t.\\g.\\g.b)) (X m (t e) (a C (\\q.g))) (y d) ((\\o.\\x.\\d.h) (H I (\\d.s)) A ((\\s.\\p.\\f.X) (v d (J s)) e)))) (w (s ((\\n.(\\y.\\t.n (\\j.N)) (\\l.Q)) (\\o.(\\e.o i (i a) (\\a.c)) (\\m.v) (\\x.(\\z.N) ((\\u.z) ((\\q.k) (r d)))))))))",
      "\\n.b (\\y.\\l.\\q.b (\\k.\\r.d (e (S N (u w) (\\b.\\s.X d) (\\b.\\s.\\x.\\f.w)) (R)))) (n (w (s (\\t.N (i a) (\\a.c) (\\x.N)))))"
    );
  }

  @Test
  public final void test100() {
    reducesTo(
      "\\u.(\\g.\\s.\\y.c) ((\\b.\\c.\\s.T) (\\t.(\\w.\\p.\\a.\\c.b) L) i)",
      "\\u.\\s.\\y.c"
    );
  }

  @Test
  public final void test101() {
    reducesTo(
      "g ((\\g.W (\\g.\\g.\\t.(\\d.(\\v.g) ((\\v.n) c W) (\\j.(\\a.\\z.z I (z q) a) j)) (\\w.\\k.l) (\\g.\\b.o (\\x.A (\\o.\\y.z) (\\d.f x (\\v.b) H) ((\\k.\\b.\\y.\\c.Y) V))))) ((\\v.m (E R u t (\\k.S)) ((\\t.\\i.\\j.\\w.\\p.l ((\\i.a e) o)) ((\\b.w) (d Y) (\\o.\\n.l C) ((\\q.U) (b O) (i m n))))) b (\\l.j (e (g b) (\\w.(\\m.e) M) i L (\\t.c)))))",
      "g (W (\\g.\\g.\\t.g (\\j.\\z.z I (z q) j) (\\g.\\b.o (\\x.A (\\o.\\y.z) (\\d.f x (\\v.b) H) (\\b.\\y.\\c.Y)))))"
    );
  }

  @Test
  public final void test102() {
    reducesTo(
      "\\p.G",
      "\\p.G"
    );
  }

  @Test
  public final void test103() {
    reducesTo(
      "e (\\e.(\\a.\\o.t) (\\b.Y (\\d.\\k.(\\u.\\e.l) (\\h.r) ((\\c.M n) P (\\a.y (\\y.S w A))) (\\p.\\n.a))) ((\\r.\\y.c) (\\e.\\i.f ((\\c.r) ((\\h.(\\i.(\\w.P G) (l e)) (\\u.\\k.\\m.(\\p.\\j.S) (\\k.\\o.m))) (\\i.g ((\\m.j) V)))))))",
      "e (\\e.t)"
    );
  }

  @Test
  public final void test104() {
    reducesTo(
      "\\u.(\\x.\\q.(\\x.\\n.(\\z.(\\n.l) (\\w.m (\\x.\\t.(\\q.\\y.\\p.\\u.U) (\\d.u (H (x K))))) ((\\r.\\p.(\\d.y L) (\\u.p k)) (\\n.(\\i.b) (i g) d) m (\\m.a (\\c.(\\x.L) (\\v.\\i.j w) (\\q.\\k.\\k.\\k.\\j.w L))))) (\\r.w (p (\\i.(\\a.o b (\\r.\\d.x)) (\\e.\\q.(\\q.u (z V)) (d a (Q M) b)))))) (\\r.(\\q.(\\m.(\\j.\\f.\\c.(\\r.r u) (F Y (\\j.Z))) ((\\m.a) Q) (D (\\t.s)) (\\r.(\\x.\\o.(\\t.M i (P D) (x Q)) (u X L (\\j.b p (w z)))) (\\a.(\\b.y) (\\h.\\v.H)))) (i f A)) (e ((\\o.\\w.v) (\\t.\\q.A))))) (\\h.D (u (\\k.\\t.g)))",
      "\\u.\\q.\\n.l (y L (\\m.a (\\c.L (\\q.\\k.\\k.\\k.\\j.w L))))"
    );
  }

  @Test
  public final void test105() {
    reducesTo(
      "(\\k.(\\g.q (C (\\o.n ((\\b.j) (\\z.J)) (\\c.(\\v.h) f (\\g.\\z.r S)) L) (\\k.C (\\s.\\u.(\\p.(\\g.\\s.(\\g.R) ((\\y.l) k)) ((\\i.\\u.n L) c)) (w d J (\\x.\\u.\\r.e) ((\\o.\\r.\\p.f) (\\k.u (s U)))))))) ((\\z.\\a.(\\w.O (\\y.b u (A R) (\\r.(\\w.G) (\\y.G)))) (d (\\r.(\\g.\\o.\\r.U) ((\\f.e) (V p)))) ((\\c.\\w.\\n.\\k.X) (\\m.\\g.\\m.\\t.\\h.\\l.k X (E D) (A (\\b.w)) (b o))) (g (C (\\n.\\u.m) ((\\e.b (I r)) (g (o s))) (\\x.q ((\\p.p) (\\m.(\\r.m) l)))))) q)) (\\f.j)",
      "q (C (\\o.n (j) (\\c.h (\\g.\\z.r S)) L) (\\k.C (\\s.\\u.\\s.R)))"
    );
  }

  @Test
  public final void test106() {
    reducesTo(
      "\\a.(\\s.(\\e.\\g.\\f.o) (\\q.Y) ((\\e.(\\o.z) n) (\\r.(\\w.(\\k.w) L) y e (\\r.(\\h.\\i.n) ((\\f.m) b ((\\r.y) (\\k.V))))) (\\c.r) Z)) S",
      "\\a.\\f.o"
    );
  }

  @Test
  public final void test107() {
    reducesTo(
      "(\\x.B) R (\\z.\\u.\\k.(\\o.\\a.(\\a.u) (\\t.\\v.\\o.(\\s.O) ((\\v.p) ((\\w.\\d.s p o (\\y.d f)) q)))) (\\b.(\\a.x (\\n.\\b.(\\j.p) F) (\\e.(\\p.l e) (d (\\w.o) C f))) (\\p.x)) l)",
      "B (\\z.\\u.\\k.u)"
    );
  }

  @Test
  public final void test108() {
    reducesTo(
      "\\c.\\b.\\b.b",
      "\\c.\\b.\\b.b"
    );
  }

  @Test
  public final void test109() {
    reducesTo(
      "\\k.\\b.l",
      "\\k.\\b.l"
    );
  }

  @Test
  public final void test110() {
    reducesTo(
      "\\u.I",
      "\\u.I"
    );
  }

  @Test
  public final void test111() {
    reducesTo(
      "\\u.e",
      "\\u.e"
    );
  }

  @Test
  public final void test112() {
    reducesTo(
      "(\\a.\\b.(\\n.(\\t.G ((\\q.\\q.F) (\\c.U))) (P (\\p.f) (\\x.n R (\\s.w)) ((\\o.p g k) (\\b.\\v.a p)) (f m)) V ((\\m.N) (\\v.\\q.(\\c.(\\l.t n (e t) (\\u.(\\x.r) (\\h.m)) d) j) (\\b.i k ((\\r.h (D G)) (\\k.\\u.\\e.i)) (\\s.\\z.\\v.(\\p.r (\\m.\\q.E)) (\\a.(\\q.a n) (\\y.R b))))))) (\\y.\\x.\\v.y)) (\\q.(\\m.(\\t.(\\q.d) (\\q.(\\j.\\m.b) ((\\j.B) W ((\\m.v) (\\k.b))) (T ((\\y.O (\\k.y)) n)) E)) (\\g.(\\e.\\k.n) ((\\r.(\\j.\\l.V) (R D (t s) (\\g.(\\d.x) (\\h.n))) (\\e.l)) ((\\y.\\p.b (\\a.s q)) (\\j.k) (\\l.\\t.\\e.P))))) Z)",
      "\\b1.G (\\q.F) V (N)"
    );
  }

  @Test
  public final void test113() {
    reducesTo(
      "\\q.(\\t.\\z.(\\r.T) ((\\a.\\h.\\j.\\l.\\z.\\m.V f (\\q.\\b.Q (q i K) h e)) M)) ((\\g.G) ((\\m.w) C)) Z",
      "\\q.T"
    );
  }

  @Test
  public final void test114() {
    reducesTo(
      "s (m S) ((\\t.\\u.u) ((\\b.l Z (q I) (\\r.h) ((\\y.\\f.\\q.S) f)) (\\z.q)) (\\n.e ((\\b.\\q.\\o.e) (w t O) j ((\\q.R (l V k)) (\\c.\\o.i V (\\t.Z) M))))) (\\h.W) (d (\\u.(\\i.\\i.(\\u.F g b) (u (M f)) (r (o e)) ((\\y.z a (\\s.i)) y z)) ((\\o.\\r.X) (\\x.m)) ((\\c.\\c.k) (\\r.d))) (\\y.\\v.(\\n.\\f.\\h.(\\l.(\\x.(\\s.\\m.\\f.l n Y ((\\e.o) (\\n.z)) (\\l.\\a.\\g.\\i.\\i.q)) ((\\t.\\j.\\l.s k l ((\\r.b) (\\g.W))) ((\\j.\\g.V) (\\g.Y)))) w) t) (\\r.S)))",
      "s (m S) (\\n.e (e)) (\\h.W) (d (\\u.F g b (r (o e)) (z a (\\s.\\c.k) z)) (\\y.\\v.\\f.\\h.\\m.\\f.t (\\r.S) Y (o) (\\l.\\a.\\g.\\i.\\i.q)))"
    );
  }

  @Test
  public final void test115() {
    reducesTo(
      "(\\o.(\\u.(\\y.\\j.\\p.x) w) (q ((\\a.(\\a.e) m (\\x.(\\q.f) (\\s.K) z)) (r (\\h.\\g.\\d.(\\m.R) X (\\y.\\q.k)))))) (\\w.\\q.G) (\\b.v x) ((\\i.\\m.(\\y.\\s.(\\n.(\\v.N) x) (\\l.\\n.\\a.Q) (g (P Z) (g x (\\c.V)))) (\\e.o) (\\v.z) (\\f.\\p.t) s) d)",
      "x"
    );
  }

  @Test
  public final void test116() {
    reducesTo(
      "(\\u.\\p.\\s.\\r.(\\r.A) (\\q.(\\c.(\\c.\\q.(\\w.\\l.\\o.l o) V) ((\\y.(\\y.g) v C) (\\m.R (v b) (\\m.\\q.P S)) ((\\s.\\s.\\e.\\r.T) ((\\s.Z) (P Q) r)))) (\\w.C (\\x.\\u.\\o.(\\c.\\w.\\z.(\\p.(\\u.\\w.t) (h X (e Z))) ((\\s.d) (u V) (f (z f)))) ((\\y.(\\i.d) (j u)) (\\d.\\d.Q i) (\\q.f))))) (w ((\\k.D (\\l.\\u.j) w) (\\l.\\u.W ((\\a.\\d.\\w.t (o (\\i.w))) (\\u.(\\a.\\r.G V) b) ((\\b.o) (\\v.e (\\g.\\k.E)))))))) p",
      "\\p.\\s.\\r.A (w (D (\\l.\\u.j) w))"
    );
  }

  @Test
  public final void test117() {
    reducesTo(
      "f ((\\k.(\\q.(\\a.\\j.x) (\\s.(\\b.R p) ((\\q.m) (t x) (H s (\\r.G)))) (\\b.\\u.\\x.\\q.\\e.(\\f.E) ((\\v.s) e))) ((\\t.z) (\\z.(\\u.t) s p ((\\f.\\n.P) (d n (T b)))) ((\\g.z K (\\g.\\j.\\i.U)) Q))) i ((\\z.\\x.(\\r.(\\y.\\a.\\b.\\m.(\\d.(\\h.T) ((\\c.g) W)) (\\d.\\p.N Q (x A))) (\\o.f (p ((\\b.l) (\\y.s))))) (F (\\l.\\f.\\b.(\\u.L K) (\\s.p e)) (s ((\\q.n) ((\\e.k) (Q a))))) (p (\\h.(\\a.\\x.b) (\\d.\\b.\\o.\\v.(\\u.v) (b s (\\w.f)) (\\z.\\d.k (y w)))))) (\\f.(\\j.\\f.r (I M (\\z.h)) (w e ((\\k.d) (\\q.w))) (K (\\g.\\i.g) (\\q.X)) (\\a.\\i.i)) ((\\f.(\\h.K y o) (C (\\a.J))) ((\\y.j) (a Z) (\\o.t x (\\p.z))) e i))))",
      "f (x (\\x.\\b.\\m.T))"
    );
  }

  @Test
  public final void test118() {
    reducesTo(
      "\\v.(\\x.W) w (\\b.(\\r.d (\\u.\\l.\\m.\\a.\\r.\\r.e) ((\\b.b) (\\b.l) z (\\a.(\\u.\\z.p) h (\\a.\\y.(\\g.\\k.(\\c.h) ((\\x.o) (e f)) ((\\l.m) (\\g.d) ((\\n.b) Q))) (V z (\\c.w k w) (\\q.(\\z.\\s.k h) P)))))) (\\a.(\\q.(\\s.w ((\\x.X) (\\q.L)) G (\\y.v)) (d ((\\c.(\\a.O u (\\r.v)) (\\z.\\f.u)) (y (\\q.\\u.u)))) (z U (\\l.\\h.(\\q.y) (e x) (\\u.\\g.\\i.O) ((\\a.\\l.\\g.g) (\\o.\\l.o))) (\\e.\\c.a))) ((\\o.w C (\\w.F)) (\\h.h) (\\f.\\j.m (\\f.\\n.d)) (\\p.\\c.(\\k.e f (\\h.K k)) (\\q.p G (W J) (s (V Q)))) J ((\\a.(\\x.\\e.w) ((\\l.\\b.l) t)) (\\i.(\\n.\\p.(\\v.u) e (\\o.b)) T)))))",
      "\\v.W (\\b.d (\\u.\\l.\\m.\\a.\\r.\\r.e) (l (\\a.p)))"
    );
  }

  @Test
  public final void test119() {
    reducesTo(
      "(\\m.\\v.\\m.\\x.(\\p.\\b.(\\t.\\c.\\t.\\a.\\x.B i (\\u.K)) (\\h.(\\x.(\\m.\\a.g) (\\h.(\\k.(\\u.\\x.d) (\\n.h f)) ((\\j.l) r (\\y.w)))) (d (\\l.\\p.\\t.(\\i.c) b ((\\i.z) (g E)) (\\s.f)))) ((\\o.\\n.h) i)) ((\\b.f) ((\\v.\\x.i) ((\\d.\\m.\\g.\\b.\\h.\\k.\\g.(\\b.\\q.\\w.(\\j.\\p.g s (Z B)) (i (j h) (m (\\n.d)))) (\\d.a (\\h.\\l.d Y (F d)))) (T (D (j c)) e ((\\t.\\m.\\p.P) (x u (A n)) j)))))) (\\w.\\f.\\d.\\o.u)",
      "\\v.\\m.\\x.\\b.\\t.\\a.\\x.B i (\\u.K)"
    );
  }

  @Test
  public final void test120() {
    reducesTo(
      "\\c.\\c.(\\h.\\u.\\q.(\\u.h (h u) (l e)) s) ((\\y.m) z (\\h.(\\j.(\\w.\\m.\\p.(\\u.i) (o r) (\\e.\\d.I) (u (\\b.r) (\\k.v a))) w) x) ((\\d.\\i.E) ((\\p.j) (\\k.\\c.A n (\\l.T) r)) (\\c.o (w ((\\e.z) (z A))) (f z)) (\\m.t)) (\\r.\\b.n))",
      "\\c.\\c.\\u1.\\q.m (\\h.\\m.\\p.i (\\e.\\d.I) (u (\\b.r) (\\k.v a))) (E (\\m.t)) (\\r.\\b.n) (m (\\h.\\m.\\p.i (\\e.\\d.I) (u (\\b.r) (\\k.v a))) (E (\\m.t)) (\\r.\\b.n) s) (l e)"
    );
  }

  @Test
  public final void test121() {
    reducesTo(
      "(\\v.j) j",
      "j"
    );
  }

  @Test
  public final void test122() {
    reducesTo(
      "\\l.(\\j.c) V ((\\m.(\\d.p (\\r.(\\l.\\h.\\e.(\\v.a t) s) (X (\\x.a)) (\\q.(\\t.\\w.(\\p.a) ((\\r.F) (m m))) ((\\m.g) K (\\r.\\z.\\w.m))))) (\\m.\\b.m T)) (\\u.\\z.\\g.\\b.(\\i.\\v.\\d.(\\j.I) (p b) B) (V j (q Q) (\\i.\\a.p)) (\\t.\\m.V ((\\k.j) N ((\\e.w) (N E)))) (\\p.R) (\\h.(\\o.B) (\\h.u) (z s (\\o.z)) c ((\\i.f) ((\\v.\\a.\\j.i) v)) ((\\g.\\c.g (S A) (\\p.A)) ((\\z.t) (z N) (V (\\z.T))) (\\w.a))))) (M (\\w.v (\\a.\\o.\\k.L (\\l.\\v.\\t.\\n.i v (\\q.X) (\\b.h) (l T (\\f.a) (O O q))) ((\\r.\\a.\\r.\\v.H) (\\t.W a)) (l (\\g.\\g.Z) r (\\n.a)))))",
      "\\l.c (p (\\r.\\e.a t)) (M (\\w.v (\\a.\\o.\\k.L (\\l.\\v.\\t.\\n.i v (\\q.X) (\\b.h) (l T (\\f.a) (O O q))) (\\a.\\r.\\v.H) (l (\\g.\\g.Z) r (\\n.a)))))"
    );
  }

  @Test
  public final void test123() {
    reducesTo(
      "\\s.\\i.n Z (\\i.(\\i.\\l.\\x.f) u)",
      "\\s.\\i.n Z (\\i.\\l.\\x.f)"
    );
  }

  @Test
  public final void test124() {
    reducesTo(
      "\\f.\\a.D",
      "\\f.\\a.D"
    );
  }

  @Test
  public final void test125() {
    reducesTo(
      "\\r.(\\r.(\\w.(\\n.(\\z.\\s.(\\a.\\g.B x) (\\m.G t (\\n.C)) (w F (\\c.l) ((\\i.j) e))) (\\t.o) ((\\k.\\s.n) (\\h.\\d.\\c.(\\m.u) M (\\o.f s (Y t)) k))) e) d ((\\j.R) ((\\y.u) ((\\k.\\e.f) (\\p.n))))) (f (o (\\a.(\\t.\\l.f (\\y.b (\\b.j) ((\\s.o) (N L)) x)) ((\\w.(\\t.\\q.F) (h z)) (t ((\\s.v) (\\g.i))) (\\y.k (L (l e))))) J))",
      "\\r.B x (R)"
    );
  }

  @Test
  public final void test126() {
    reducesTo(
      "h o (\\p.(\\v.\\g.(\\v.\\b.j) ((\\h.\\n.q) (c o (u c))) (a (\\m.z))) o) a f Z",
      "h o (\\p.\\g.j) a f Z"
    );
  }

  @Test
  public final void test127() {
    reducesTo(
      "w I (\\a.\\s.F ((\\s.w) (c h) (j E (L g)) ((\\x.s) (j P) ((\\n.c) (\\q.V))) ((\\g.u) (k t) (y y (\\p.w)) (i (V u) d)) (\\i.l)) K (\\v.\\i.I))",
      "w I (\\a.\\s.F (w (j E (L g)) (s (c)) (u (y y (\\p.w)) (i (V u) d)) (\\i.l)) K (\\v.\\i.I))"
    );
  }

  @Test
  public final void test128() {
    reducesTo(
      "z (a (\\w.\\e.\\a.R)) (\\p.\\s.t)",
      "z (a (\\w.\\e.\\a.R)) (\\p.\\s.t)"
    );
  }

  @Test
  public final void test129() {
    reducesTo(
      "b (\\d.L (\\t.z J))",
      "b (\\d.L (\\t.z J))"
    );
  }

  @Test
  public final void test130() {
    reducesTo(
      "\\r.u",
      "\\r.u"
    );
  }

  @Test
  public final void test131() {
    reducesTo(
      "(\\r.(\\v.q) j) ((\\a.O) (\\o.(\\q.p (u g) (\\r.\\j.\\l.\\l.(\\j.y (\\a.f) (\\i.j m)) p ((\\y.u) ((\\k.e) (\\w.\\h.m)))) ((\\h.l) (\\h.c) b)) (\\f.F)))",
      "q"
    );
  }

  @Test
  public final void test132() {
    reducesTo(
      "\\h.(\\n.\\p.z (a (\\t.\\j.(\\v.\\p.(\\x.\\w.y c) (\\z.\\z.\\o.(\\s.\\p.c) ((\\f.Q) ((\\g.g) (\\v.r))))) s))) R (\\h.j)",
      "\\h.z (a (\\t.\\j.\\p.\\w.y c))"
    );
  }

  @Test
  public final void test133() {
    reducesTo(
      "(\\o.(\\b.(\\g.\\p.q) ((\\r.(\\t.u) (B h) (\\j.N)) (\\o.\\c.p (o c (J H))) (m F (\\h.\\o.l i) ((\\h.M) (\\w.(\\c.P) (w g))))) U) (\\k.x c (\\s.(\\o.h) (\\d.\\d.\\y.\\a.\\w.(\\h.k (\\w.y)) (\\s.\\l.\\e.\\u.I))) v)) (J (E (\\a.\\g.R) ((\\o.Q) (\\k.C) (o a (\\p.x)) (s (\\k.(\\k.E) W))) y ((\\y.\\z.(\\b.(\\v.(\\p.g j) O) (l (\\q.W))) (\\t.O m)) (W (N A (g O) (\\k.v)) (Z O))))) (r ((\\t.\\b.(\\r.v ((\\h.a) (H M) (\\v.h) (\\h.\\i.\\z.\\y.E b (\\r.k)))) (R ((\\d.s h (\\z.l)) (e (\\h.s)) w))) (\\r.(\\y.P) r) (z (\\t.I) (\\u.\\y.G Z))))",
      "q (r (v (a (\\v.h) (\\h.\\i.\\z1.\\y.E (z (\\t.I) (\\u.\\y.G Z)) (\\r.k)))))"
    );
  }

  @Test
  public final void test134() {
    reducesTo(
      "(\\k.o) z",
      "o"
    );
  }

  @Test
  public final void test135() {
    reducesTo(
      "\\a.\\c.j",
      "\\a.\\c.j"
    );
  }

  @Test
  public final void test136() {
    reducesTo(
      "(\\j.\\l.\\i.\\x.(\\t.w) ((\\d.b) (\\a.u))) ((\\b.g) b)",
      "\\l.\\i.\\x.w"
    );
  }

  @Test
  public final void test137() {
    reducesTo(
      "\\z.\\j.z",
      "\\z.\\j.z"
    );
  }

  @Test
  public final void test138() {
    reducesTo(
      "A (\\k.r)",
      "A (\\k.r)"
    );
  }

  @Test
  public final void test139() {
    reducesTo(
      "E (\\p.(\\y.\\s.r C (\\b.s) (q q (x j))) s ((\\y.y u) x) (\\u.\\i.n) (\\z.\\z.U)) (\\z.(\\a.N (\\j.N)) (\\j.\\y.k)) (\\o.f ((\\e.\\w.\\s.b (\\l.\\p.\\n.v (V w (\\p.\\c.I))) ((\\s.(\\e.\\k.\\v.o) (b a (a o)) (\\v.(\\f.g) k ((\\r.J) (\\i.q)))) (u ((\\h.e) z) (\\i.\\b.\\e.p)))) (\\y.\\d.z (\\q.\\r.v))) L)",
      "E (\\p.r C (\\b.x u) (q q (x j)) (\\u.\\i.n) (\\z.\\z.U)) (\\z.N (\\j.N)) (\\o.f (\\w.\\s.b (\\l.\\p.\\n.v (V w (\\p.\\c.I))) (\\v.o)) L)"
    );
  }

  @Test
  public final void test140() {
    reducesTo(
      "w (q (\\o.\\d.\\d.\\k.z)) (g ((\\t.(\\g.z) ((\\g.j) (Q L))) T) (\\s.(\\g.R) (x a) (O o (\\l.T)) (t ((\\p.p) (\\b.e))) (\\v.(\\o.(\\r.x) (\\b.d) d) s)) (\\g.S)) (I (b (\\z.r) (\\p.(\\c.m s (\\h.p)) (\\c.T (R w))) v ((\\b.(\\k.(\\o.\\h.\\j.z) (\\h.\\n.v)) x) (\\x.(\\i.u) f))) y) ((\\t.d) ((\\d.K) ((\\t.\\h.l x) (\\j.\\j.(\\a.m F (l f)) (\\x.(\\u.b) (H q)) ((\\x.\\k.w b) (\\m.\\k.d t)) (\\s.G) E))))",
      "w (q (\\o.\\d.\\d.\\k.z)) (g (z) (\\s.R (O o (\\l.T)) (t (\\b.e)) (\\v.x d)) (\\g.S)) (I (b (\\z.r) (\\p.m s (\\h.p)) v (\\h.\\j.z)) y) (d)"
    );
  }

  @Test
  public final void test141() {
    reducesTo(
      "U (\\x.\\l.(\\y.y) j (\\o.\\s.f)) e",
      "U (\\x.\\l.j (\\o.\\s.f)) e"
    );
  }

  @Test
  public final void test142() {
    reducesTo(
      "\\h.\\t.\\j.M",
      "\\h.\\t.\\j.M"
    );
  }

  @Test
  public final void test143() {
    reducesTo(
      "\\g.\\r.m",
      "\\g.\\r.m"
    );
  }

  @Test
  public final void test144() {
    reducesTo(
      "\\g.\\l.a",
      "\\g.\\l.a"
    );
  }

  @Test
  public final void test145() {
    reducesTo(
      "\\b.(\\j.(\\k.\\b.o) (\\l.s (\\q.\\l.X)) (\\f.x (\\a.o (\\c.u)))) (i w)",
      "\\b.o"
    );
  }

  @Test
  public final void test146() {
    reducesTo(
      "a (\\u.\\j.Q (u (\\h.V) ((\\d.\\u.\\m.\\t.\\s.\\k.r (\\m.(\\d.E) (e p))) (\\t.\\u.\\b.N (\\s.\\x.L c) ((\\j.k) g)) (\\w.B))) y)",
      "a (\\u.\\j.Q (u (\\h.V) (\\m.\\t.\\s.\\k.r (\\m.E))) y)"
    );
  }

  @Test
  public final void test147() {
    reducesTo(
      "\\g.(\\d.\\b.\\v.f) (\\f.(\\n.a) (\\b.m (\\k.(\\t.\\f.\\r.\\s.k) ((\\a.Y) (\\v.r) a))) (y ((\\a.R) (\\i.k)) ((\\r.n (J (P f)) i) (\\u.\\n.\\y.y)))) ((\\x.(\\f.Y) ((\\e.O) (\\h.K)) (\\t.P)) (\\r.\\z.(\\f.e) (V g) (\\k.(\\k.I) (\\k.u)) (\\z.\\g.\\u.\\t.s)) (\\r.s) (\\q.y) j) (\\d.(\\b.(\\o.n) (\\b.(\\r.m) ((\\t.h (G F (\\v.o))) (x (\\r.\\a.n)))) (\\l.(\\l.M) p)) (\\s.\\f.(\\w.\\m.U) ((\\q.\\u.\\h.N) ((\\z.\\e.t w) (x q f) (g E (\\j.u) (c S (\\l.y)))) (r (\\d.A) (\\n.U) (\\i.(\\k.z l N) I (\\l.\\n.S (e (C c))))))) (\\h.V))",
      "\\g.f"
    );
  }

  @Test
  public final void test148() {
    reducesTo(
      "\\i.g",
      "\\i.g"
    );
  }

  @Test
  public final void test149() {
    reducesTo(
      "(\\x.M (\\e.\\x.O)) w",
      "M (\\e.\\x.O)"
    );
  }

  @Test
  public final void test150() {
    reducesTo(
      "B (\\v.(\\z.\\w.\\d.b) (f l J ((\\p.a) (\\t.N)) (\\k.b))) (\\g.\\t.k (\\u.q (\\w.(\\y.J (W R) (\\t.\\i.G)) d))) ((\\z.p ((\\j.(\\a.t) (\\s.h) (\\b.\\l.\\c.a)) (r (\\f.G)))) (\\o.\\r.(\\c.(\\c.\\z.Q (\\q.H)) ((\\r.a) (H i) (g (m b)))) Q) N) (l (\\f.(\\q.I) ((\\o.(\\w.b U (\\d.I)) (\\v.g e (\\j.m))) (\\q.\\j.l e g ((\\x.b) (\\k.y))))) (\\l.n) y) (\\o.\\v.\\m.t)",
      "B (\\v.\\w.\\d.b) (\\g.\\t.k (\\u.q (\\w.J (W R) (\\t.\\i.G)))) (p (t (\\b.\\l.\\c.a)) N) (l (\\f.I) (\\l.n) y) (\\o.\\v.\\m.t)"
    );
  }

  @Test
  public final void test151() {
    reducesTo(
      "Y (\\v.t ((\\m.\\d.W ((\\h.(\\b.I) (\\t.\\k.\\g.\\o.(\\q.w) (\\z.\\s.w) (\\j.X (t h (\\v.f))))) (p (\\u.\\i.\\s.y)))) (\\w.\\t.Y)))",
      "Y (\\v.t (\\d.W (I)))"
    );
  }

  @Test
  public final void test152() {
    reducesTo(
      "\\o.d",
      "\\o.d"
    );
  }

  @Test
  public final void test153() {
    reducesTo(
      "c (\\g.(\\z.J) U ((\\b.\\x.\\a.n) (\\z.\\x.p)))",
      "c (\\g.J (\\x.\\a.n))"
    );
  }

  @Test
  public final void test154() {
    reducesTo(
      "(\\l.V d ((\\k.\\q.J (f O)) T)) ((\\a.\\r.r (g K G)) h s)",
      "V d (\\q.J (f O))"
    );
  }

  @Test
  public final void test155() {
    reducesTo(
      "\\b.v (\\r.(\\h.\\a.(\\e.\\d.\\i.(\\b.(\\r.(\\v.j) e) ((\\c.\\x.w e) R (h p t b))) (\\s.\\c.t) ((\\y.b (\\k.\\z.\\x.f (\\p.S))) k)) (\\a.\\m.M)) n)",
      "\\b.v (\\r.\\a.\\d.\\i.j (b (\\k.\\z.\\x.f (\\p.S))))"
    );
  }

  @Test
  public final void test156() {
    reducesTo(
      "\\s.c",
      "\\s.c"
    );
  }

  @Test
  public final void test157() {
    reducesTo(
      "\\h.(\\r.n) (\\y.A ((\\e.q (X (g (c n) (M (\\e.g))) (\\c.J (a (r E (\\g.l))))) v) (u ((\\z.\\h.\\h.k) P))))",
      "\\h.n"
    );
  }

  @Test
  public final void test158() {
    reducesTo(
      "\\i.b (\\h.(\\y.\\t.J (h q j) g) (\\u.Y))",
      "\\i.b (\\h.\\t.J (h q j) g)"
    );
  }

  @Test
  public final void test159() {
    reducesTo(
      "(\\c.\\w.z) (\\j.\\s.\\k.(\\z.(\\q.(\\i.C) b) (\\z.\\i.(\\e.\\d.\\g.n (\\n.j (u ((\\i.Y) y) (d (\\g.(\\o.g) (\\h.q)))))) (\\c.N))) (\\k.e))",
      "\\w.z"
    );
  }

  @Test
  public final void test160() {
    reducesTo(
      "\\s.(\\n.C (F ((\\j.a) (r r) (\\b.\\d.g l) ((\\h.d) (t w) (i r)) ((\\f.\\p.l) ((\\g.p) (P b)) (\\w.\\f.(\\e.D) ((\\j.v) (C A)))))) (\\i.n) ((\\o.(\\k.S (p s) (a Z) (\\i.s)) (\\t.u) (\\p.\\c.\\b.(\\u.\\l.\\a.c (\\a.\\p.P)) ((\\s.\\y.\\b.\\l.Z (\\p.J)) C)) w) (\\y.b))) (\\n.\\o.j)",
      "\\s.C (F (a (\\b.\\d.g l) (d (i r)) (l))) (\\i.\\n.\\o.j) (S (p s) (a Z) (\\i.s) (\\p.\\c.\\b.\\l.\\a.c (\\a.\\p.P)) w)"
    );
  }

  @Test
  public final void test161() {
    reducesTo(
      "(\\n.\\h.D) (\\o.\\c.(\\d.(\\y.(\\f.(\\a.n) (\\d.(\\h.\\f.J) (\\j.(\\n.\\r.S) n))) (k (\\q.p))) a (\\c.J (\\o.\\h.w) (f ((\\s.(\\y.G) (\\z.L)) ((\\w.d) E b))) (r (\\u.\\p.\\u.D)))) k)",
      "\\h.D"
    );
  }

  @Test
  public final void test162() {
    reducesTo(
      "\\d.\\o.\\u.Y j ((\\z.\\d.c) (\\f.h ((\\b.\\k.\\b.N) (\\r.(\\m.J) A)))) (\\h.J ((\\u.x) l)) (\\r.\\r.\\n.\\f.n (\\s.\\k.(\\c.(\\a.N) ((\\u.L) ((\\r.K) (B d)))) (\\k.\\n.\\t.(\\a.\\v.C) (\\z.\\z.S H q))) (\\h.p)) (\\a.s) (\\t.(\\o.t) (\\l.\\h.\\c.\\y.\\r.u) (\\s.(\\l.(\\t.(\\i.\\w.\\e.h) (S c (i i)) (\\b.y)) ((\\j.z) A) (\\a.n)) (F (m (\\c.j (n (\\p.K s)))))) ((\\z.I) (\\u.\\f.f)))",
      "\\d.\\o.\\u.Y j (\\d.c) (\\h.J (x)) (\\r.\\r.\\n.\\f.n (\\s.\\k.N) (\\h.p)) (\\a.s) (\\t.t (\\s.h) (I))"
    );
  }

  @Test
  public final void test163() {
    reducesTo(
      "q (f (x (\\f.\\v.y)) (\\y.\\y.\\p.\\g.\\f.\\o.\\s.\\s.(\\o.\\n.\\u.(\\v.p) ((\\v.x) (o o)) (\\s.y)) (\\c.j R ((\\x.L I (\\j.g)) h)) J) k (\\t.\\z.(\\w.(\\a.g) (\\f.O)) ((\\h.\\e.H) ((\\y.r n (\\c.D) ((\\c.b) (i G))) (\\c.(\\h.d) (\\q.q) a) f) (\\n.J))))",
      "q (f (x (\\f.\\v.y)) (\\y.\\y.\\p.\\g.\\f.\\o.\\s.\\s.\\u.p (\\s.y)) k (\\t.\\z.g))"
    );
  }

  @Test
  public final void test164() {
    reducesTo(
      "(\\i.x (\\d.\\u.(\\a.p) (\\q.(\\m.\\g.(\\i.g k (r U) p) (s (h a (g f)))) F) A) ((\\m.Y (\\l.(\\a.\\z.\\k.J) (\\m.(\\r.(\\x.q) u (\\s.\\i.\\d.f)) (\\f.\\o.b (\\h.p) g) (S (I t u) k)))) ((\\w.s) P ((\\w.n (\\v.o)) ((\\u.(\\r.l) c) t (\\c.\\j.\\v.\\e.Q)))))) ((\\w.(\\a.j (\\p.l)) (\\p.f)) c)",
      "x (\\d.\\u.p A) (Y (\\l.\\z.\\k.J))"
    );
  }

  @Test
  public final void test165() {
    reducesTo(
      "\\y.(\\c.\\o.x) (\\f.b z) (o ((\\w.(\\f.A) (h e)) (M L)) (p H) (\\t.\\x.(\\w.\\f.\\d.\\d.g (y q) ((\\p.r) (R L) (\\y.q))) R) (\\l.\\j.\\m.m)) (\\e.\\f.Y) M",
      "\\y.x (\\e.\\f.Y) M"
    );
  }

  @Test
  public final void test166() {
    reducesTo(
      "(\\j.(\\u.\\y.y) ((\\f.\\w.Z) ((\\d.o t (\\w.s)) (\\x.P) (e (z h) (\\n.o B z)))) (X (\\f.(\\w.\\u.E) u)) ((\\f.(\\c.\\d.z (\\w.v) (\\h.z (Q m (\\g.H)))) ((\\d.(\\s.s) ((\\y.D) (\\t.Z))) ((\\r.z) (F u) (w i (\\g.o))))) (j ((\\a.\\y.A A (r v) (y t (\\z.F))) (\\v.\\u.(\\m.W) (\\t.\\h.l)))) e) (\\w.\\j.(\\h.\\p.\\p.(\\c.\\z.l) (\\e.f (L (Q (\\n.a)) (\\y.(\\b.(\\r.j) (\\p.k)) (\\d.(\\d.G) (n L)))) (\\c.v))) ((\\g.\\m.\\z.m) (F ((\\t.n) ((\\n.Z) (q A))) m (R (\\m.b) (S g (f P)) (\\i.Y) ((\\d.(\\f.P) C) ((\\y.X) q) (\\b.(\\b.(\\g.c) (\\z.B)) (\\h.g)))))))) (u t ((\\a.(\\v.\\t.y) i) (\\c.c)))",
      "X (\\f.\\u.E) (z (\\w.v) (\\h.z (Q m (\\g.H)))) (\\w.\\j.\\p.\\p.\\z.l)"
    );
  }

  @Test
  public final void test167() {
    reducesTo(
      "\\z.\\a.\\n.(\\w.(\\i.\\p.b) ((\\w.\\y.\\g.(\\k.(\\j.\\x.\\v.z e E) V) (\\w.\\c.v ((\\f.F) ((\\w.e) E)))) ((\\s.m) (s S) (c (W Q)) d ((\\u.\\y.(\\y.\\x.h) (\\v.\\c.t)) r))) X) F ((\\w.\\e.\\z.\\l.o) Q)",
      "\\z.\\a.\\n.b (\\e.\\z.\\l.o)"
    );
  }

  @Test
  public final void test168() {
    reducesTo(
      "(\\g.q) ((\\g.(\\z.(\\j.h) (o t) ((\\o.R) (\\f.W)) (n j) q E (\\w.\\p.(\\m.g (a (\\q.(\\w.\\d.M w) L))) (\\h.b))) (\\j.p ((\\h.(\\q.O) ((\\f.x) (e x)) (\\n.R)) (v X (g F) (\\l.\\p.\\k.k) (\\u.\\g.n (\\w.k r)))) (\\a.\\s.p))) (T (N (\\m.(\\o.\\a.\\a.\\a.\\q.(\\j.N) (T (N b (\\j.p)) ((\\x.i) (\\g.g) (\\u.f S (y z))))) (\\s.e (\\p.\\m.a))))))",
      "q"
    );
  }

  @Test
  public final void test169() {
    reducesTo(
      "\\o.y",
      "\\o.y"
    );
  }

  @Test
  public final void test170() {
    reducesTo(
      "\\s.Z",
      "\\s.Z"
    );
  }

  @Test
  public final void test171() {
    reducesTo(
      "r (\\e.\\i.k) b",
      "r (\\e.\\i.k) b"
    );
  }

  @Test
  public final void test172() {
    reducesTo(
      "o (\\d.G)",
      "o (\\d.G)"
    );
  }

  @Test
  public final void test173() {
    reducesTo(
      "\\d.u c (\\h.z) (\\a.\\s.\\v.k)",
      "\\d.u c (\\h.z) (\\a.\\s.\\v.k)"
    );
  }

  @Test
  public final void test174() {
    reducesTo(
      "(\\h.\\n.t) (r (\\d.\\l.p) (u ((\\w.\\k.\\q.s) ((\\b.O) (\\e.w A (r M)))) (w (g ((\\h.h) z) (R ((\\l.g) b))))) (B (\\w.\\o.\\i.t) (t S (\\a.o) (f m (S r)) n (\\j.L l ((\\s.w) (h i (y S)))) (\\a.\\d.n))) (t ((\\k.(\\t.\\j.\\n.O) (o r (R M))) (\\k.w) a) (T (\\r.\\o.\\y.l (\\t.(\\h.\\z.n d) (q h (h m))) (\\w.\\p.Q))) s))",
      "\\n.t"
    );
  }

  @Test
  public final void test175() {
    reducesTo(
      "(\\l.b (\\o.F ((\\x.\\m.l t ((\\z.M) (\\j.z)) (p (\\k.\\t.\\i.W)) (\\g.\\f.\\h.z) (P (\\g.\\g.\\n.A) (\\d.\\f.\\k.\\f.y) (\\m.(\\b.p) (\\w.J) ((\\d.w) (N K)) ((\\k.U) (\\m.J) (\\v.x (\\p.k)))))) (\\b.(\\z.\\t.\\m.(\\r.\\m.\\x.\\s.k) ((\\s.L) (\\v.j) (g h (o r))) (\\a.\\m.\\s.(\\y.W) (\\j.G) ((\\a.k) (\\p.j)) (\\q.\\z.\\g.\\n.c))) Y)))) (\\l.K)",
      "b (\\o.F (\\m.K (M) (p (\\k.\\t.\\i.W)) (\\g.\\f.\\h.z) (P (\\g.\\g.\\n.A) (\\d.\\f.\\k.\\f.y) (\\m.p (w) (U (\\v.\\t.\\m.\\x.\\s.k))))))"
    );
  }

  @Test
  public final void test176() {
    reducesTo(
      "(\\n.(\\h.(\\o.\\w.(\\k.(\\f.\\v.i) ((\\b.\\n.c) (c a (G m)))) R) (\\i.\\e.(\\y.(\\v.f) j) (\\f.z) ((\\f.l (\\g.C)) d) (B (\\f.\\y.(\\j.w Q) Q))) (\\n.\\c.(\\m.\\j.z K (\\z.w) (I B (h I)) g (Q (o i (\\v.k)) L)) A)) (i s ((\\y.(\\v.\\c.\\z.b) ((\\l.w) (N i)) (w ((\\v.E) o)) (d g w)) (\\l.j)))) G ((\\n.\\d.\\e.\\a.(\\h.\\m.(\\r.m) ((\\t.\\j.\\v.(\\c.p) (\\t.f) (\\u.W)) ((\\p.\\s.D f) ((\\z.W) (d k)))) f (\\c.Y)) (c (m J ((\\a.N) (\\y.a)) ((\\h.t) (k S) (M (\\d.y)))) n ((\\d.L (\\v.J) (\\t.\\x.y U) L (\\a.\\s.p)) (\\y.b)))) (\\f.k))",
      "i"
    );
  }

  @Test
  public final void test177() {
    reducesTo(
      "\\z.(\\r.\\b.(\\q.T (\\f.\\w.L)) (\\t.q (y j)) (\\n.(\\k.m (\\g.\\c.\\o.\\d.D (\\b.l))) (\\e.\\a.o) (\\u.\\n.\\r.(\\x.(\\s.\\p.B) ((\\e.X) (e L) (s g (w D)))) p) w q)) (\\h.(\\s.(\\t.(\\f.Y (w q) (h (\\l.A))) F ((\\v.P) ((\\w.\\a.\\o.R) (p s (S d)))) (\\p.\\w.a y ((\\f.S) (\\x.H)))) ((\\l.h) (\\t.\\n.(\\a.Y) I) ((\\t.(\\u.\\j.m o) p ((\\v.c) q)) (\\p.\\t.i)))) ((\\m.e) (\\e.j)) (p ((\\p.\\f.G) ((\\d.\\k.\\g.J N ((\\u.w) (C b)) ((\\x.\\s.\\z.i) z)) ((\\b.e) (\\q.\\g.(\\q.S d) (g h (o h)))) c))))",
      "\\z.\\b.T (\\f.\\w.L) (\\n.m (\\g.\\c.\\o.\\d.D (\\b.l)) (\\u.\\n.\\r.\\p.B) w q)"
    );
  }

  @Test
  public final void test178() {
    reducesTo(
      "\\z.\\r.(\\p.D) ((\\d.l) z)",
      "\\z.\\r.D"
    );
  }

  @Test
  public final void test179() {
    reducesTo(
      "\\o.\\i.G (O (\\y.N) (\\b.(\\r.(\\e.\\o.\\s.\\w.(\\t.l) ((\\s.\\r.\\j.\\z.(\\c.(\\t.\\w.S) (D (W i))) (h q e)) (\\u.i))) ((\\v.P) ((\\v.J) ((\\q.U) (A T)) (r (\\i.f (V g))) P))) (\\r.\\f.(\\w.\\y.\\b.\\v.\\v.M) D S)))",
      "\\o.\\i.G (O (\\y.N) (\\b.\\o.\\s.\\w.l))"
    );
  }

  @Test
  public final void test180() {
    reducesTo(
      "\\q.k (\\i.\\u.\\a.g (e ((\\g.Q Z (Q l) v) (o (\\t.n) (\\y.L)) ((\\u.(\\e.p) (w K)) l (\\p.I (p u) (\\b.Y b))) r))) (\\j.\\n.c (D (\\f.i) (\\f.o)))",
      "\\q.k (\\i.\\u.\\a.g (e (Q Z (Q l) v (p (\\p.I (p u) (\\b.Y b))) r))) (\\j.\\n.c (D (\\f.i) (\\f.o)))"
    );
  }

  @Test
  public final void test181() {
    reducesTo(
      "\\c.I",
      "\\c.I"
    );
  }

  @Test
  public final void test182() {
    reducesTo(
      "\\j.H",
      "\\j.H"
    );
  }

  @Test
  public final void test183() {
    reducesTo(
      "H (r (\\z.\\b.(\\d.\\c.W) ((\\j.\\w.\\u.g) L (\\u.C (\\c.W l (\\r.K))) ((\\b.K) ((\\q.y) (\\v.(\\i.g) a)))))) d (\\f.(\\z.q (\\e.(\\k.x (\\w.\\x.\\o.\\x.r (\\f.(\\q.m) (\\o.S)) ((\\v.F) t) (f ((\\e.Z o (f s)) (K b (\\h.A)))))) (b a))) A)",
      "H (r (\\z.\\b.\\c.W)) d (\\f.q (\\e.x (\\w.\\x.\\o.\\x.r (\\f.m) (F) (f (Z o (f s))))))"
    );
  }

  @Test
  public final void test184() {
    reducesTo(
      "a (\\r.\\m.k)",
      "a (\\r.\\m.k)"
    );
  }

  @Test
  public final void test185() {
    reducesTo(
      "D ((\\w.\\v.X k n) ((\\c.(\\i.z) ((\\g.(\\w.\\c.x) O) (d (\\m.(\\x.q x (E B)) w) d))) (\\p.L (\\m.\\c.(\\w.\\h.D) (d i (\\m.e)) F ((\\m.\\w.\\l.(\\x.g) v) s)) (\\i.g ((\\q.(\\q.b (\\w.y)) y (i a ((\\r.p) (V o)))) (\\t.G ((\\j.\\s.\\z.E) R)))))))",
      "D (\\v.X k n)"
    );
  }

  @Test
  public final void test186() {
    reducesTo(
      "\\t.\\w.q (d (\\o.E)) G",
      "\\t.\\w.q (d (\\o.E)) G"
    );
  }

  @Test
  public final void test187() {
    reducesTo(
      "t (\\f.m)",
      "t (\\f.m)"
    );
  }

  @Test
  public final void test188() {
    reducesTo(
      "(\\u.(\\z.(\\x.\\q.\\n.\\h.q) (\\e.h) ((\\l.v) j) G) (\\i.(\\b.J) (\\x.\\v.\\s.w l) (\\h.\\x.(\\m.W) (\\e.\\v.L) r))) f (\\w.\\w.(\\w.\\w.\\j.\\r.\\g.\\d.(\\f.f) ((\\w.\\u.\\y.\\t.\\q.\\q.\\y.B q) M) (g ((\\q.E (\\i.\\w.z)) (\\y.\\i.Y (\\p.n)))) ((\\y.\\f.\\h.q) (\\t.x) y ((\\e.(\\p.n) (\\m.\\p.M)) (\\h.\\t.\\m.\\j.b)) (v ((\\p.(\\d.j) ((\\q.Q) (\\x.k))) (k (\\p.w) (\\m.(\\a.o) (\\u.q)))) B))) ((\\d.\\h.(\\o.\\y.\\h.b p (\\e.f (z (\\z.k)) (\\b.\\t.c h (Y l) S)) ((\\u.\\y.\\f.F) ((\\h.u) (k d) (Q (\\b.z))) v)) (\\o.(\\s.j) ((\\a.\\i.\\g.(\\y.\\v.\\e.\\p.H) (\\b.\\a.\\b.\\z.u)) q))) (n (\\o.R (\\g.\\g.\\f.\\o.\\r.\\w.(\\t.\\p.(\\q.y (\\j.\\a.f)) ((\\g.y) (o R) (c w (\\a.x)))) ((\\f.G) (g L) (\\h.\\v.S L) ((\\y.t) (\\d.\\o.p F))))))))",
      "v"
    );
  }

  @Test
  public final void test189() {
    reducesTo(
      "h ((\\g.x) ((\\o.R) (\\v.\\a.\\w.\\b.\\t.\\m.e ((\\c.a) (\\v.m) q (\\v.j N)))) r) (\\m.\\f.(\\q.\\t.c (\\r.(\\p.D) ((\\u.m) ((\\s.\\t.\\f.n) (F (v l) (\\n.Q a (g G))))) ((\\j.T) z (\\q.(\\f.h) (y U)) (\\a.\\k.\\l.\\f.v) (\\p.(\\o.b (\\e.r)) y) ((\\x.(\\t.w) (C v)) W (\\a.\\x.L) ((\\h.\\u.\\k.b (\\x.l) f) (H (\\x.m) y)))))) (\\t.(\\o.\\m.\\t.Z ((\\z.C) (\\p.e) (a B (i k)))) (\\r.(\\x.q) (\\z.(\\t.G) (p O) t)) n d (\\i.(\\y.\\r.\\j.\\a.v) e)))",
      "h (x r) (\\m.\\f.\\t.c (\\r.D (T (\\q.h) (\\a.\\k.\\l.\\f.v) (\\p.b (\\e.r)) (w (\\a.\\x.L) (\\u.\\k.b (\\x.l) f)))))"
    );
  }

  @Test
  public final void test190() {
    reducesTo(
      "\\n.J ((\\o.f) (\\l.b) D)",
      "\\n.J (f D)"
    );
  }

  @Test
  public final void test191() {
    reducesTo(
      "\\i.J",
      "\\i.J"
    );
  }

  @Test
  public final void test192() {
    reducesTo(
      "\\p.H",
      "\\p.H"
    );
  }

  @Test
  public final void test193() {
    reducesTo(
      "y (\\c.\\g.\\i.(\\n.\\f.j G) (\\w.u) o)",
      "y (\\c.\\g.\\i.j G)"
    );
  }

  @Test
  public final void test194() {
    reducesTo(
      "(\\k.\\f.\\m.v ((\\l.X z (\\k.v)) (l (\\b.A)) X (\\p.\\t.l)) (\\s.\\d.\\t.s)) (m (\\k.\\k.\\f.(\\c.\\b.E (\\f.b)) (g (m q U ((\\a.Y) (\\m.S))) (X (H (F f (\\o.B))))))) (P ((\\o.h (\\i.(\\x.\\z.g) (\\c.(\\y.L) h l)) (\\o.\\b.(\\z.(\\j.T) (\\v.o q (X c))) (\\b.\\v.t X (\\a.x) (\\d.b v)) (i (x (\\d.u)) (Y G i ((\\i.r) (\\m.Y)))))) v)) ((\\m.(\\r.\\s.\\f.v ((\\d.x x) (\\s.\\j.\\q.j))) (\\t.\\h.\\q.\\b.(\\q.B) ((\\i.\\w.k) y)) ((\\j.F) ((\\o.j) ((\\p.u) (b z)) w))) v (\\q.\\t.c) q)",
      "v (X z (\\k.v) X (\\p.\\t.l)) (\\s.\\d.\\t.s)"
    );
  }

  @Test
  public final void test195() {
    reducesTo(
      "\\m.(\\h.\\q.\\t.y (\\g.(\\h.g) r)) j",
      "\\m.\\q.\\t.y (\\g.g)"
    );
  }

  @Test
  public final void test196() {
    reducesTo(
      "b (\\i.m (\\q.\\v.(\\l.\\t.\\x.j) (\\i.\\b.(\\m.(\\k.m) (\\v.t (f b))) ((\\y.s) (\\a.u) (\\q.(\\y.s) (Y m))) (\\y.\\g.(\\l.\\m.(\\f.w) (n m) (B R (y K))) ((\\t.(\\j.r) (I w)) (X t (a O))))) ((\\z.\\f.\\y.\\j.(\\t.\\f.(\\d.\\f.L) (l g)) (\\s.z) ((\\c.t (s C)) M (R (u h) (t (S y))))) (\\c.V))) (\\j.v))",
      "b (\\i.m (\\q.\\v.\\x.j) (\\j.v))"
    );
  }

  @Test
  public final void test197() {
    reducesTo(
      "\\r.\\d.(\\p.\\f.\\i.M) ((\\w.(\\q.\\y.(\\v.\\v.(\\i.\\k.n) m) (Z (\\d.\\d.k) ((\\k.\\b.\\b.(\\a.\\o.\\o.\\v.(\\w.c) (C j)) (\\s.(\\z.u n) (\\v.\\g.k))) g))) (\\d.\\k.(\\c.\\k.\\a.\\x.(\\h.I m (S n) (l (\\c.I))) (o (\\x.\\s.w p)) (\\v.r) ((\\c.\\e.\\c.N (\\x.\\g.\\w.Z)) (\\v.d))) (I y (\\e.g (P (\\q.J)) (\\g.Z) J)))) q)",
      "\\r.\\d.\\f.\\i.M"
    );
  }

  @Test
  public final void test198() {
    reducesTo(
      "\\l.n W ((\\c.(\\a.r) (\\p.\\u.\\n.L)) (\\k.U (W B) (q ((\\i.\\k.\\a.j) ((\\q.x) (\\f.p)) (c (J l (\\q.k))) (u l))) (\\m.Z)))",
      "\\l.n W (r)"
    );
  }

  @Test
  public final void test199() {
    reducesTo(
      "\\r.(\\w.i k) (p I (\\u.\\h.(\\c.(\\n.X (\\n.\\c.L)) (\\j.(\\j.(\\m.j) K) i)) ((\\w.z) U ((\\k.d R e ((\\k.K) (\\v.E))) ((\\n.x y (\\n.f)) (\\t.c))) (n (\\p.k))))) (\\p.(\\z.H e ((\\v.(\\i.j (f (\\a.\\g.\\z.x))) p) h)) ((\\z.\\c.\\o.\\v.\\a.d) F b))",
      "\\r.i k (\\p.H e (j (f (\\a.\\g.\\z.x))))"
    );
  }

  @Test
  public final void test200() {
    reducesTo(
      "(\\a.K B U) (\\h.m I ((\\p.(\\u.\\v.d a) (\\p.\\s.\\z.B) Z ((\\g.i) X)) (\\m.(\\k.\\t.\\x.\\o.(\\g.s) ((\\y.S) d) (\\s.(\\o.f q) (\\j.u o))) t))) (\\u.\\u.i) ((\\b.V ((\\t.\\d.r) ((\\k.q ((\\i.l) a)) (\\d.n))) (\\z.\\z.\\f.e (\\t.P) (\\c.\\q.(\\g.(\\n.\\s.(\\l.\\s.j) e) (\\r.m)) Y)) ((\\q.c ((\\b.o) (\\t.(\\i.e) (\\a.t) j))) ((\\j.C) ((\\i.k) ((\\a.\\h.\\v.x) (\\f.\\u.a M))) (I (O (b n)))))) f)",
      "K B U (\\u.\\u.i) (V (\\d.r) (\\z.\\z.\\f.e (\\t.P) (\\c.\\q.\\s.\\s.j)) (c (o)))"
    );
  }

  @Test
  public final void test201() {
    reducesTo(
      "a (\\i.\\l.(\\m.\\y.(\\w.(\\y.y g F ((\\m.d) a) (s u)) r M) (\\q.(\\q.\\z.(\\b.\\i.f) (\\u.\\d.z k (\\r.e) v (\\y.\\x.(\\r.f) (\\k.g)))) (\\c.t (V x) v ((\\b.(\\z.y) (\\h.w)) (\\n.(\\l.i) (Y n))) n)) (w ((\\x.(\\i.(\\p.(\\e.w) ((\\c.h) (o h))) (F ((\\n.g) (\\g.q)))) ((\\e.\\x.T) (\\j.(\\x.n) (\\y.(\\f.D) (c O))))) t))) (\\h.\\m.(\\w.f) W))",
      "a (\\i.\\l.\\y.r g F (d) (s u) M (w (w)))"
    );
  }

  @Test
  public final void test202() {
    reducesTo(
      "\\h.w (\\w.k) ((\\i.o) ((\\n.\\k.i j (q G) p) ((\\t.\\d.\\n.S) (\\z.r (\\v.S)))) (\\p.\\c.m ((\\w.K) ((\\k.l) (\\s.\\a.W u)))) (\\p.G ((\\j.\\x.\\i.(\\c.(\\x.c t) (m (\\f.c))) ((\\l.N) (\\l.W) ((\\c.b) (\\v.O)))) (r (\\d.\\d.k) (u H (o c) (h (n g))))))) (\\m.v) ((\\t.z) ((\\z.(\\s.(\\p.j) (\\x.\\h.(\\d.\\s.v) (\\r.\\i.(\\j.\\x.z i) C))) x) (l ((\\g.w) ((\\c.v) (\\e.w)) (\\x.\\y.J p) ((\\h.\\p.\\j.s) (i h (n a)) (\\o.\\n.\\c.(\\i.m) (S d) (z B (\\j.z)))) l))))",
      "\\h.w (\\w.k) (o (\\p.\\c.m (K)) (\\p.G (\\x.\\i.N (b) t))) (\\m.v) (z)"
    );
  }

  @Test
  public final void test203() {
    reducesTo(
      "(\\t.z) ((\\g.(\\s.\\f.t) ((\\m.H) (\\f.(\\i.F ((\\c.m e (\\a.h)) (p Y (f j)))) (\\k.\\i.(\\p.\\d.(\\w.W d) (q (i a))) (\\n.Y)))) (\\m.(\\q.Q) ((\\i.\\c.(\\t.A) (\\f.u) ((\\v.r) (I r)) (\\e.(\\z.\\n.l) (\\m.P p))) o (v (U i (P ((\\a.n) (\\v.G)))))))) (r (\\s.(\\x.R) m)))",
      "z"
    );
  }

  @Test
  public final void test204() {
    reducesTo(
      "(\\g.(\\k.(\\s.(\\s.(\\b.\\t.g) (\\z.\\j.j)) (\\u.d)) (\\o.\\r.(\\q.m (\\i.h ((\\k.q) I)) (A (\\u.f V (\\t.R)) (\\k.\\l.W))) (v (u l) (f (\\c.W)) (\\f.X)))) W x) (a (\\n.\\r.\\s.l (\\l.\\d.\\m.(\\k.f) Q) h))",
      "a (\\n.\\r.\\s.l (\\l.\\d.\\m.f) h)"
    );
  }

  @Test
  public final void test205() {
    reducesTo(
      "(\\p.(\\i.\\u.\\y.A A ((\\j.l) (R (\\e.r))) (e ((\\g.m d (\\b.d)) (R (m F))))) ((\\z.(\\b.C) (\\g.G)) S w (\\q.w ((\\k.s) (\\l.Y)) (L (D n (\\e.s))))) D) ((\\b.\\w.d (m R (\\t.f)) (\\n.n)) (\\g.\\l.\\n.(\\a.(\\r.p k) (f (g i))) f) ((\\m.\\j.\\o.u (\\r.c f x (K X (\\o.W)))) (\\f.\\p.\\t.l (\\z.x))) (c (\\h.\\a.w (\\c.s) (i (D f))) (u (f o (\\j.b)) (\\n.\\u.\\j.\\t.\\l.\\k.a o)) (\\g.s (W ((\\c.Q) (h g) I))))) (\\u.(\\r.\\t.y) (\\t.A) (\\f.\\g.\\a.\\p.\\n.K) ((\\o.L) (\\b.(\\r.x) (o u) b (\\h.(\\p.(\\w.z) (g i)) (\\e.l e (\\t.E)))) k) (\\t.(\\p.\\z.\\o.(\\k.s) (\\t.k) k s c) G (\\e.F))) ((\\k.(\\t.y z (\\e.p (\\g.w ((\\h.a) (G Y))))) (\\c.(\\i.w) ((\\f.(\\m.W m) F) (\\q.o))) (\\t.(\\b.y) ((\\o.c (\\v.\\g.t V) (\\y.\\a.(\\z.Z) (\\h.M v))) f))) (h (\\k.i)) (\\o.a))",
      "A A (l) (e (m d (\\b.d))) (y z (\\e.p (\\g.w (a))) (\\t.y) (\\o.a))"
    );
  }

  @Test
  public final void test206() {
    reducesTo(
      "(\\h.\\v.\\a.P) ((\\j.\\x.l f ((\\e.v p (\\c.A) (\\m.E z e)) x)) (\\v.(\\y.\\a.N) ((\\g.i) (\\l.R)) e ((\\l.s F (m S) (\\v.K z (F d))) v)) (L (\\k.\\h.y d)) (q (l (\\a.F) ((\\h.j) w) (\\m.\\n.o) (r S (i r) r ((\\r.\\k.u V) p)) ((\\k.(\\p.\\f.(\\g.x) ((\\e.a) (\\k.x))) (k q (x w) A)) ((\\s.(\\u.b) m ((\\d.v) (E o))) ((\\r.k) (\\w.k) l))))) (\\e.\\f.(\\m.\\f.y) ((\\m.T) p)))",
      "\\v.\\a.P"
    );
  }

  @Test
  public final void test207() {
    reducesTo(
      "\\x.(\\o.u) (\\r.\\l.m)",
      "\\x.u"
    );
  }

  @Test
  public final void test208() {
    reducesTo(
      "(\\u.\\w.\\l.\\l.r) m i (\\v.\\n.d l)",
      "\\l.r"
    );
  }

  @Test
  public final void test209() {
    reducesTo(
      "(\\m.g) (\\o.E)",
      "g"
    );
  }

  @Test
  public final void test210() {
    reducesTo(
      "\\v.\\u.s",
      "\\v.\\u.s"
    );
  }

  @Test
  public final void test211() {
    reducesTo(
      "(\\g.\\y.(\\c.z) (\\m.(\\u.\\m.(\\d.\\p.(\\d.\\c.m) (\\s.(\\a.H) i (\\k.\\u.H))) (\\u.j)) e ((\\l.I) h)) (b (\\v.\\z.\\q.\\s.p) (\\y.\\b.\\c.(\\f.w B) (e (\\l.(\\u.v) n))) L ((\\s.T) (\\k.I)) (I g))) ((\\f.v) ((\\u.t) (\\d.\\k.\\v.(\\t.a (\\b.\\m.m p)) (T (i I (h w))) (a (\\e.g)) ((\\z.(\\t.\\f.\\t.e) (e y A) (z U)) (\\x.N (\\h.s) ((\\x.q) (\\g.k)) l)) (\\q.\\q.v))))",
      "\\y1.z (b (\\v.\\z.\\q.\\s.p) (\\y.\\b.\\c.w B) L (T) (I (v)))"
    );
  }

  @Test
  public final void test212() {
    reducesTo(
      "u ((\\p.(\\j.h s (\\c.p) ((\\j.m) s)) p (\\t.n)) ((\\b.y h (o e)) (\\d.(\\j.a) W) ((\\m.k) X ((\\o.s) (\\n.v))) p) (o (\\k.v) (\\h.\\x.(\\g.\\r.p (\\o.h)) ((\\h.(\\j.A) (g U) (w p)) t))) A) n",
      "u (h s (\\c.y h (o e) (k (s)) p) (m) (\\t.n) (o (\\k.v) (\\h.\\x.\\r.p (\\o.h))) A) n"
    );
  }

  @Test
  public final void test213() {
    reducesTo(
      "\\z.(\\i.G) ((\\n.(\\f.\\h.X) ((\\q.\\l.(\\v.x) y (\\b.p u)) (\\v.\\e.o (\\x.s q)) (\\p.w A (\\l.X V b ((\\i.Y) (X z)))))) (\\p.(\\b.o m) (\\w.(\\m.(\\e.\\d.U s) (\\m.Z O (\\z.T))) (\\a.\\c.(\\j.W) ((\\n.c) (\\b.o))) z))) (c K) z",
      "\\z.G (c K) z"
    );
  }

  @Test
  public final void test214() {
    reducesTo(
      "w t (\\s.\\k.p ((\\e.g) (\\p.S (\\s.(\\l.\\x.(\\l.w) (d n) (\\g.o U b) ((\\n.\\e.\\t.d) Y)) (\\w.\\c.\\s.J w ((\\d.D d) (\\j.y))))) (\\a.(\\i.h (\\z.x) (R v G) l) (V (\\r.t H e h (\\k.\\u.v (B (\\w.n))) ((\\b.\\i.u) (\\u.\\t.(\\k.o) (\\k.k))))))))",
      "w t (\\s.\\k.p (g (\\a.h (\\z.x) (R v G) l)))"
    );
  }

  @Test
  public final void test215() {
    reducesTo(
      "(\\s.(\\x.(\\l.(\\f.(\\a.v s (Z A) (\\d.\\z.w e)) (\\f.h (c P)) (\\j.K) u) (t (\\g.u ((\\g.\\c.\\i.\\b.f) (x Z (f t) (d X (x o))))))) (\\x.(\\a.\\k.\\m.z H) t ((\\a.t) ((\\k.h t) (\\b.(\\y.O) (\\s.x)))) ((\\b.\\n.z) (\\q.(\\t.t) (j j) s (\\m.a))) (\\b.(\\c.\\e.(\\l.o) (\\h.R) ((\\q.v) (\\u.l)) (F (f (n R))) (\\m.k)) (\\u.a)))) (\\j.a)) (F h (\\g.\\b.\\w.a))",
      "v (F h (\\g.\\b.\\w.a)) (Z A) (\\d.\\z.w e) (\\j.K) u"
    );
  }

  @Test
  public final void test216() {
    reducesTo(
      "\\b.(\\j.(\\j.\\l.(\\v.n) ((\\e.\\z.G) (F ((\\r.\\c.u (\\f.(\\g.\\u.T) (G x (\\o.Q)))) ((\\m.e M g) (s (k W)) h))))) ((\\s.(\\g.(\\s.d) ((\\u.k) i) (b v (\\e.\\s.\\e.B)) (\\t.(\\r.\\v.\\g.p) (n k (\\x.n)) (\\f.I ((\\p.n) (\\h.A))))) (a (\\f.h)) (n (\\o.H o (\\b.c)) (\\d.(\\l.(\\g.h) (n g) l) (\\j.P q (x a) B)) (\\e.R (B (\\y.M) (v a (r D))) t))) (\\x.(\\t.(\\w.(\\p.U) (\\d.\\f.\\z.j) (\\o.t (x g g (\\u.\\t.\\s.K)))) R) ((\\h.\\m.\\o.\\k.w) i)))) (M W)",
      "\\b.\\l.n"
    );
  }

  @Test
  public final void test217() {
    reducesTo(
      "W Q ((\\p.p) ((\\o.c ((\\h.c) ((\\i.d) ((\\d.\\m.l B) (k K (q k))))) q) a))",
      "W Q (c (c) q)"
    );
  }

  @Test
  public final void test218() {
    reducesTo(
      "\\c.\\q.\\c.(\\p.c (\\a.N)) (\\k.(\\c.\\k.\\g.t) (\\z.\\z.(\\c.y (\\o.Q (\\s.u q (\\h.v))) O) (j (\\r.\\h.\\o.q)) c) ((\\h.\\r.g) (\\m.o) ((\\d.(\\y.\\p.U (v (x T (k o) i))) c) ((\\p.d) (T (H n N ((\\u.I) (z A)))) ((\\a.n Z A ((\\r.w) (d a))) (\\j.r) ((\\q.O) (\\a.(\\b.I) (\\h.\\e.o z))))))))",
      "\\c.\\q.\\c.c (\\a.N)"
    );
  }

  @Test
  public final void test219() {
    reducesTo(
      "y (\\r.\\t.T ((\\p.r) ((\\a.m) v)) (e (\\m.O) i ((\\o.H) (\\t.\\m.(\\x.z p (W K) ((\\w.i) K)) (\\s.(\\n.\\g.\\l.b) (\\m.X)) (\\b.\\e.o (\\j.(\\s.\\e.f) (v l))))) (J (x y))))",
      "y (\\r.\\t.T (r) (e (\\m.O) i (H) (J (x y))))"
    );
  }

  @Test
  public final void test220() {
    reducesTo(
      "\\v.\\y.f (t (g ((\\o.D) (\\h.t))))",
      "\\v.\\y.f (t (g (D)))"
    );
  }

  @Test
  public final void test221() {
    reducesTo(
      "\\b.\\u.\\h.c",
      "\\b.\\u.\\h.c"
    );
  }

  @Test
  public final void test222() {
    reducesTo(
      "\\p.T",
      "\\p.T"
    );
  }

  @Test
  public final void test223() {
    reducesTo(
      "(\\g.\\d.G ((\\r.o) (\\m.(\\s.b) (s h) (b (\\o.l)) ((\\i.s) (z j) (s (X e))))) (\\b.Z)) ((\\k.\\g.\\z.\\r.w) b) ((\\g.i ((\\t.(\\j.G) (\\w.t)) (H a f) (s R (Y i) F))) (B (\\o.V)) (\\p.c) (\\e.(\\x.t) (\\q.\\o.d (\\w.\\q.Y) s) (\\j.t ((\\f.\\p.G (\\e.b (\\d.Z)) J) ((\\b.r v) (\\f.\\h.i y) ((\\s.G) (x d) t)))))) (\\a.j)",
      "G (o) (\\b.Z) (\\a.j)"
    );
  }

  @Test
  public final void test224() {
    reducesTo(
      "(\\s.h h) (L (\\d.v)) t",
      "h h t"
    );
  }

  @Test
  public final void test225() {
    reducesTo(
      "(\\i.(\\a.(\\x.\\k.\\n.(\\f.(\\e.p o) (c (s z))) (d C u ((\\a.k) (\\x.N))) ((\\x.l) (k b) (r (\\y.f)) ((\\v.f v (C f)) w))) n) (\\i.(\\p.\\n.\\b.(\\e.h) (\\b.\\k.\\f.\\t.(\\c.z) (\\o.q))) P (\\e.(\\w.R (l S (\\i.I)) n) (a (\\v.h)))) (\\f.\\k.G (j F)) j) h",
      "p o (l (r (\\y.f)) (f w (C f)))"
    );
  }

  @Test
  public final void test226() {
    reducesTo(
      "\\y.\\e.\\g.\\f.X T",
      "\\y.\\e.\\g.\\f.X T"
    );
  }

  @Test
  public final void test227() {
    reducesTo(
      "(\\t.\\q.\\w.\\i.\\s.\\t.K) ((\\k.s) (\\k.g) ((\\q.O (\\b.O)) (d (g ((\\u.\\w.\\e.M) (E i (\\p.r)) (\\o.(\\t.J m (\\t.G)) (n (E j)))))) i))",
      "\\q.\\w.\\i.\\s.\\t.K"
    );
  }

  @Test
  public final void test228() {
    reducesTo(
      "\\j.\\e.k",
      "\\j.\\e.k"
    );
  }

  @Test
  public final void test229() {
    reducesTo(
      "(\\r.(\\b.(\\l.i) i) (\\p.A) ((\\v.(\\a.x) (\\d.\\g.(\\k.(\\v.x) ((\\n.(\\t.\\n.c) ((\\u.x) (n i))) (\\a.E))) (\\u.(\\e.i d (k s) (y n q) (\\d.\\k.l)) (\\v.\\r.n (\\r.B (\\d.\\r.W)))))) (r (\\b.(\\e.N ((\\a.g) m ((\\c.j) A))) (F (\\f.\\c.o (\\j.b) r))) ((\\h.b (u k v) n ((\\t.b) ((\\i.(\\u.n) m) (I r m)))) (\\w.(\\n.c) (\\u.(\\r.\\b.f (J y (\\i.G))) (\\z.(\\x.i) T))))))) ((\\z.\\p.n ((\\e.\\b.\\i.N) (\\t.a j (p t)))) ((\\j.(\\j.q) o) W ((\\d.w) (\\a.\\r.z E))) ((\\v.\\f.z) ((\\m.X) (E I)) G (\\t.C)) (n (\\p.x U ((\\a.F) (\\b.\\b.\\w.(\\g.N K) (h n))))) (\\i.\\x.\\l.(\\m.\\j.p) (\\i.\\i.\\x.U)) ((\\a.\\a.e ((\\e.G) (\\n.\\o.\\h.\\v.l) F)) (\\c.(\\h.z) ((\\q.\\t.\\s.(\\u.\\p.(\\z.\\z.H) (\\e.l H)) ((\\g.E N C) (E a S))) ((\\t.\\q.i ((\\a.j) (\\u.D))) B))) (\\v.j)))",
      "i (x)"
    );
  }

  @Test
  public final void test230() {
    reducesTo(
      "(\\g.e) ((\\l.\\g.\\s.(\\y.(\\x.r) (\\x.x) g ((\\n.\\x.\\h.Z) D)) k w ((\\c.c) ((\\j.(\\n.l (\\x.w) ((\\x.U) (a w))) (\\d.(\\s.Y) (\\x.p d (K B)))) (v r)))) s) (v c)",
      "e (v c)"
    );
  }

  @Test
  public final void test231() {
    reducesTo(
      "(\\x.(\\e.(\\b.(\\d.\\g.\\a.e) (z v (E e)) (\\l.(\\t.t (O u)) (a x (d m)))) (\\p.p (\\x.\\p.(\\d.\\e.a) ((\\l.Y) (\\s.A))))) (\\r.\\o.(\\j.\\h.U (B m) l) (\\u.(\\y.\\h.e) r) (\\k.\\w.t)) (u t z) (\\l.\\l.\\e.\\e.\\j.\\g.m)) ((\\u.s ((\\z.\\x.p) (\\m.\\p.\\m.\\u.(\\i.\\i.\\t.\\p.(\\p.x) (\\v.j)) ((\\p.\\r.K j) (\\w.f)) (y (i X (E m) (\\o.q t (\\m.x))))))) ((\\s.\\t.\\w.u) Z ((\\f.(\\y.c) (\\e.f)) E) ((\\e.O) ((\\v.y) (e I)) o) (r (\\m.(\\u.u) i ((\\i.q) (\\i.v))) E) (e (J ((\\t.r) ((\\y.P) (\\y.t)))) (\\e.\\c.(\\i.\\f.\\d.\\y.w) ((\\m.\\b.\\w.h V (\\s.J) (\\m.u)) (g E (k f) (\\v.\\v.\\d.c))))))) (X (\\j.(\\o.i) (\\n.\\c.\\m.\\r.(\\l.y) (\\f.\\v.\\f.(\\u.y) (\\q.x)) (\\u.w))))",
      "U (B m) l"
    );
  }

  @Test
  public final void test232() {
    reducesTo(
      "\\l.E",
      "\\l.E"
    );
  }

  @Test
  public final void test233() {
    reducesTo(
      "\\c.\\o.(\\b.\\n.a) (\\l.(\\o.O) (\\z.p) ((\\x.(\\w.i c (\\t.\\c.\\c.t) V) W) (\\i.\\f.c) (\\n.\\x.f (W t)) ((\\t.(\\h.\\k.\\f.A b) (y f (f t) (e (\\b.t)) ((\\v.F) f (\\p.J)) (\\t.\\e.\\h.h))) (b (\\p.\\d.J)))))",
      "\\c.\\o.\\n.a"
    );
  }

  @Test
  public final void test234() {
    reducesTo(
      "\\q.\\i.\\o.(\\z.c ((\\s.(\\b.(\\t.(\\v.\\d.\\u.u) g) (P (\\y.\\h.y Z))) (\\m.\\c.t (\\k.r))) (\\e.t ((\\g.y Z (q y)) (b l (s w))) (\\a.g K (\\o.P) z (\\x.j ((\\m.r) z)))) J)) (\\p.\\p.D) ((\\g.\\d.b) ((\\t.\\p.\\n.\\k.w) ((\\m.(\\m.\\n.\\c.I (H (\\z.e))) (\\u.(\\l.E) (\\f.E) (\\r.\\w.v t)) (\\i.\\e.u (k (\\j.(\\l.s) (\\t.l))))) (\\i.(\\g.\\m.\\i.e) (c x (\\g.d) (v a O)) (A G (\\e.r) (\\r.\\n.m l) x)) (j G (\\k.\\o.Z)))))",
      "\\q.\\i.\\o.c (\\u.u) (\\d.b)"
    );
  }

  @Test
  public final void test235() {
    reducesTo(
      "c (\\x.F)",
      "c (\\x.F)"
    );
  }

  @Test
  public final void test236() {
    reducesTo(
      "(\\c.(\\n.\\e.\\o.\\z.(\\v.\\l.\\g.\\y.i) b) ((\\p.\\p.\\q.i (\\x.\\z.m f) ((\\o.(\\m.u) P) i) r) (\\f.e ((\\m.o) G)) (\\b.a) x)) (\\t.\\z.e)",
      "\\e.\\o.\\z.\\l.\\g.\\y.i"
    );
  }

  @Test
  public final void test237() {
    reducesTo(
      "\\r.s f ((\\u.s) q ((\\q.f (\\h.p I Z c u)) y) (\\m.(\\l.O) (\\s.(\\p.\\y.\\h.(\\d.e E) u (\\y.\\l.\\u.V)) (\\a.q)) ((\\z.\\q.\\s.I) X)) b)",
      "\\r.s f (s (f (\\h.p I Z c u)) (\\m.O (\\q.\\s.I)) b)"
    );
  }

  @Test
  public final void test238() {
    reducesTo(
      "s ((\\l.\\e.x (\\e.\\f.q (\\z.U))) p) (\\n.\\v.r (\\z.\\j.(\\y.Y (\\t.(\\i.t) (Z a))) (\\q.p) ((\\o.\\e.H O) (\\c.l) ((\\c.j) J ((\\q.d) (u x)))) (\\t.b)) (i t g ((\\n.(\\p.\\e.n d) (\\s.u)) v))) (\\g.(\\z.m) M)",
      "s (\\e.x (\\e.\\f.q (\\z.U))) (\\n.\\v.r (\\z.\\j.Y (\\t.t) (H O) (\\t.b)) (i t g (\\e.v d))) (\\g.m)"
    );
  }

  @Test
  public final void test239() {
    reducesTo(
      "\\w.\\e.\\m.\\e.t M e",
      "\\w.\\e.\\m.\\e.t M e"
    );
  }

  @Test
  public final void test240() {
    reducesTo(
      "(\\i.\\p.(\\h.\\n.I (Y l) (\\v.\\a.z b) X (\\a.\\c.\\m.v) (\\w.(\\g.(\\w.t) V) ((\\w.n) z (q (A b)) (\\k.K)))) ((\\p.f) (\\e.\\w.t b) ((\\k.y i (\\q.S)) b) (\\n.(\\f.(\\g.O) (o D) (\\n.\\j.\\g.Q)) (\\z.n)) ((\\u.(\\t.\\s.\\r.\\m.(\\z.P) (g b)) (g (r L) (v w))) (I ((\\c.r y v) (p T (\\q.I)))))) (\\f.G)) (n d ((\\w.\\s.(\\u.(\\s.\\f.u) (i g Z (\\u.(\\p.h) (n x)))) v) (a (\\b.\\k.C M) ((\\u.x) (d s) (y (\\w.l))) Z) ((\\i.(\\h.\\q.(\\v.u) u (\\g.\\s.V)) f (\\y.(\\c.\\p.K) (\\s.f R (\\d.q)) ((\\b.\\e.B) o))) x))) (f ((\\l.\\k.g) (\\d.(\\k.s) (y k))))",
      "I (Y l) (\\v.\\a.z b) X (\\a.\\c.\\m.v) (\\w.t)"
    );
  }

  @Test
  public final void test241() {
    reducesTo(
      "X (\\b.\\g.\\q.m) f",
      "X (\\b.\\g.\\q.m) f"
    );
  }

  @Test
  public final void test242() {
    reducesTo(
      "\\o.P (o (\\m.(\\m.(\\c.g i (O X) (W v (C Q)) S (\\i.N)) (\\b.(\\t.\\j.n (\\b.\\p.\\p.X U)) (v x U ((\\d.K) (\\s.a)) (\\v.\\j.(\\d.D d) (e x)))) (\\u.y e)) (\\w.p)))",
      "\\o.P (o (\\m.g i (O X) (W v (C Q)) S (\\i.N) (\\u.y e)))"
    );
  }

  @Test
  public final void test243() {
    reducesTo(
      "\\k.(\\m.\\x.X) B",
      "\\k.\\x.X"
    );
  }

  @Test
  public final void test244() {
    reducesTo(
      "\\p.(\\b.\\a.\\z.\\t.w (j P (\\b.Y) (\\f.l) (\\f.l) (\\m.\\w.(\\d.U p) (\\q.\\h.M z) E)) (R (\\v.s))) (\\h.u (\\n.t (y S) (n w (\\a.m)) (y v z)) (U ((\\h.R) e)) v) a ((\\h.\\n.b) u)",
      "\\p.\\t.w (j P (\\b.Y) (\\f.l) (\\f.l) (\\m.\\w.U p E)) (R (\\v.s))"
    );
  }

  @Test
  public final void test245() {
    reducesTo(
      "s ((\\s.D (\\i.s)) (\\x.s (\\o.\\k.\\s.V (\\y.\\d.(\\e.\\j.\\g.z r (y k)) (\\t.\\b.\\x.\\f.X x (e d)))) ((\\j.(\\k.G (y n)) D) ((\\e.b) (\\j.\\n.(\\n.w) (\\d.h) X)) (\\h.g)))) (\\w.\\u.(\\g.\\z.\\b.\\c.\\z.\\u.X) (Z (\\w.(\\c.\\v.m) (\\a.\\y.i c (L I) (e (u b)) (L U (b s) D)) (\\k.(\\w.\\o.o) j A)) ((\\c.t X w ((\\n.I) (\\p.D)) ((\\g.\\c.\\b.y) ((\\t.z) (\\j.l)))) ((\\x.c (\\y.F) (P d (\\a.X))) (l (\\b.S) ((\\h.x) (D x)))) (l w (\\i.\\n.\\b.(\\i.\\x.b n) c i)) (\\e.(\\n.j (\\l.s (c T (\\d.e) (\\c.\\y.\\d.n)))) A))))",
      "s (D (\\i.\\x.s (\\o.\\k.\\s.V (\\y.\\d.\\j.\\g.z r (y k))) (G (y n) (\\h.g)))) (\\w.\\u.\\z.\\b.\\c.\\z.\\u.X)"
    );
  }

  @Test
  public final void test246() {
    reducesTo(
      "(\\n.R) a ((\\h.(\\m.h) S) (\\d.b)) (\\d.\\v.\\z.(\\h.u) ((\\k.S) (\\t.h)))",
      "R (\\d.b) (\\d.\\v.\\z.u)"
    );
  }

  @Test
  public final void test247() {
    reducesTo(
      "\\y.\\a.\\z.(\\s.(\\z.z ((\\j.\\b.\\y.S) (a c (C w)) (E (S (\\n.P))) (y (\\z.\\j.\\q.B)) (\\u.\\j.(\\l.\\u.\\v.\\e.\\u.W) n))) ((\\n.(\\a.u) ((\\a.(\\x.t) (\\i.i)) (\\q.\\y.l i)) (\\k.u)) (\\t.o (\\k.t)) (\\w.A)) (\\w.(\\k.(\\g.\\a.\\e.o (\\f.\\m.j L)) Z S) (\\i.(\\l.S (\\g.\\h.\\h.n)) v ((\\c.i l) (m H (y P) (\\f.\\q.f b) G (\\u.U)))))) (i p)",
      "\\y.\\a.\\z.u (\\k.u) (\\w.A) (S (\\u.\\j.\\u.\\v.\\e.\\u.W)) (\\w.\\e.o (\\f.\\m.j L))"
    );
  }

  @Test
  public final void test248() {
    reducesTo(
      "\\n.\\b.\\j.\\e.X",
      "\\n.\\b.\\j.\\e.X"
    );
  }

  @Test
  public final void test249() {
    reducesTo(
      "\\f.i",
      "\\f.i"
    );
  }

  @Test
  public final void test250() {
    reducesTo(
      "\\l.(\\m.\\b.\\r.\\o.(\\o.(\\j.(\\l.(\\x.\\l.l) (\\j.(\\p.\\c.(\\i.H L) (N (\\c.R))) (l (Z m) M))) d) ((\\m.H) Q)) (\\p.S (\\c.\\c.(\\z.\\c.\\m.V) (\\z.(\\q.r) (h Z)) (\\t.v h (\\u.\\x.C k)) (\\f.\\w.v)) (I x ((\\o.\\n.S (\\i.\\a.\\f.(\\f.w) (d h))) (\\h.(\\t.(\\e.w) ((\\w.v) (\\r.N))) ((\\v.U (q O)) z)))))) C (\\r.U (\\z.(\\s.(\\c.\\t.\\e.T) (\\y.u) (X P (\\p.k) ((\\f.F) (o Z))) (b (\\v.(\\a.(\\n.e) o) q)) (\\j.z (\\f.r)) ((\\x.\\g.(\\h.\\m.\\d.\\g.Z) ((\\d.x O (o K)) (h (c v)))) o (\\e.f (c (\\t.\\i.H G)) ((\\j.a) q ((\\h.G (A s)) n))))) (l (\\d.(\\j.\\f.\\u.(\\p.Y Z (\\p.M) ((\\v.Z) d)) (\\x.u)) x) (\\w.f))))",
      "\\l.\\r.\\o.\\l.l"
    );
  }

  @Test
  public final void test251() {
    reducesTo(
      "\\z.\\l.j ((\\y.a) a x) (\\n.F f (\\w.c))",
      "\\z.\\l.j (a x) (\\n.F f (\\w.c))"
    );
  }

  @Test
  public final void test252() {
    reducesTo(
      "\\d.\\y.\\p.\\l.W ((\\o.(\\j.\\n.\\i.(\\s.(\\u.u) ((\\b.R) (\\p.z)) (\\a.t (z C (\\w.r) (\\t.\\m.e) (\\y.C)))) (\\g.l y)) ((\\z.t (O l)) (\\n.R) ((\\t.\\p.(\\j.\\x.\\e.j E) C F) ((\\l.k) n ((\\t.\\c.m) (A y (f u) q)))))) (\\p.(\\e.\\t.(\\v.b (\\k.y k)) q) ((\\t.\\n.\\h.J) (\\m.(\\o.M) (\\o.(\\k.w) m F) (\\f.(\\d.f (g z (\\d.f))) (\\m.(\\l.f g (m L)) v)) ((\\m.r (\\s.(\\l.A) (\\v.h))) (\\f.\\d.(\\p.j) (\\g.d H)) U)))))",
      "\\d.\\y.\\p.\\l.W (\\n.\\i.R (\\a.t (z C (\\w.r) (\\t.\\m.e) (\\y.C))))"
    );
  }

  @Test
  public final void test253() {
    reducesTo(
      "(\\j.i r ((\\y.J U) a)) T (\\b.\\z.b) (h (\\x.\\a.\\z.Y) ((\\d.L) ((\\r.z (\\d.m r x (\\j.\\f.v))) (\\w.(\\i.M) (\\x.(\\m.\\n.\\j.X) I))) ((\\i.(\\w.X) D ((\\u.N) c) s) ((\\i.m) (v r) (\\x.(\\c.q) (\\u.d)) (\\i.\\f.w I)) ((\\e.(\\f.g) ((\\n.V) (\\y.w))) (\\v.\\w.(\\w.A) (\\d.E) (\\t.\\t.w)) ((\\m.b) ((\\s.\\i.\\t.m) (u q (\\v.d)))))) (\\t.(\\w.x g) X (N (\\w.v t z)) ((\\p.u) (\\m.\\p.(\\u.e) g w (\\u.\\w.\\d.\\x.q))) (\\s.\\i.z))))",
      "i r (J U) (\\b.\\z.b) (h (\\x.\\a.\\z.Y) (L (X (N) s (g (b))) (\\t.x g (N (\\w.v t z)) (u) (\\s.\\i.z))))"
    );
  }

  @Test
  public final void test254() {
    reducesTo(
      "K (\\q.j n)",
      "K (\\q.j n)"
    );
  }

  @Test
  public final void test255() {
    reducesTo(
      "\\t.\\t.L",
      "\\t.\\t.L"
    );
  }

  @Test
  public final void test256() {
    reducesTo(
      "\\q.\\a.\\n.e",
      "\\q.\\a.\\n.e"
    );
  }

  @Test
  public final void test257() {
    reducesTo(
      "\\a.D",
      "\\a.D"
    );
  }

  @Test
  public final void test258() {
    reducesTo(
      "v ((\\v.\\p.h ((\\w.z (\\l.P)) (b q))) w) o",
      "v (\\p.h (z (\\l.P))) o"
    );
  }

  @Test
  public final void test259() {
    reducesTo(
      "(\\l.\\q.A (\\g.\\o.z h)) ((\\g.\\r.v (\\e.(\\h.(\\i.R s o (\\l.(\\c.S) (\\s.v)) (\\y.(\\x.l v) (\\y.j S))) y) (\\p.(\\j.P) E)) (l q)) (\\d.n))",
      "\\q.A (\\g.\\o.z h)"
    );
  }

  @Test
  public final void test260() {
    reducesTo(
      "\\b.\\o.k",
      "\\b.\\o.k"
    );
  }

  @Test
  public final void test261() {
    reducesTo(
      "(\\y.(\\r.b) (\\b.O (\\t.\\y.P) ((\\k.\\c.n) A))) p",
      "b"
    );
  }

  @Test
  public final void test262() {
    reducesTo(
      "\\o.Z",
      "\\o.Z"
    );
  }

  @Test
  public final void test263() {
    reducesTo(
      "(\\d.(\\f.(\\n.\\v.l) (\\i.\\q.\\l.\\i.(\\w.a) ((\\q.(\\r.k (\\r.o)) (\\f.(\\c.k) (\\b.l))) (\\z.\\g.\\i.\\e.E)) (\\b.k (\\a.(\\c.\\m.(\\y.E) o ((\\u.c) (j B))) (\\l.W ((\\x.u) (k M))))))) (n (\\y.V))) (\\r.x F (\\i.H) ((\\z.W (\\v.b) (m (\\x.d)) (\\e.f) (\\s.r)) (\\f.y)) c) (\\z.o)",
      "l"
    );
  }

  @Test
  public final void test264() {
    reducesTo(
      "(\\a.\\x.\\i.\\j.\\k.(\\z.(\\n.(\\b.\\w.\\t.G) (\\x.x n) V) (\\l.(\\l.\\o.e) ((\\p.u) ((\\l.j) (\\m.Z)) ((\\i.\\j.\\q.S) f)) H) (\\h.\\w.(\\c.o) (\\o.z A (\\k.Y) (\\y.y)) (\\b.(\\r.(\\k.x) (\\v.t) (B (\\m.J))) ((\\r.t) (\\c.L) (\\e.R G (\\b.a)))) ((\\b.t) k) N)) M) (\\q.m H)",
      "\\x.\\i.\\j.\\k.G"
    );
  }

  @Test
  public final void test265() {
    reducesTo(
      "\\p.e",
      "\\p.e"
    );
  }

  @Test
  public final void test266() {
    reducesTo(
      "\\a.(\\g.\\n.\\g.(\\s.X) ((\\d.(\\a.Q) (\\h.(\\t.(\\f.r F) (M (\\u.f))) (u (\\h.x i)))) (e z)) (w ((\\z.(\\n.(\\q.d) y ((\\b.U) (\\j.X) (\\g.\\r.T u))) (\\h.K)) B))) ((\\v.n (\\g.b)) w ((\\n.i T b) (\\e.y V (c q))) (\\f.u) (\\m.(\\n.D V (B Q) (\\l.\\g.\\t.p)) p (\\y.Z k (\\p.S) (\\i.(\\w.B) (s B)) (\\q.\\d.s))) (\\u.(\\p.(\\i.t) ((\\t.(\\q.(\\z.c) (\\c.Y)) (W P)) (\\m.o))) (\\h.\\s.U)) ((\\k.\\x.(\\w.(\\w.p (\\s.S) (\\x.a) (\\y.\\d.\\r.y Z (\\f.x))) ((\\p.\\l.\\v.\\j.\\w.\\p.Z U) (\\d.g (m Z)))) D) ((\\d.(\\n.(\\h.\\v.\\d.\\h.(\\f.A) (h a)) (\\i.\\m.(\\a.f) (l q) (j V (\\k.e)))) (\\c.t ((\\i.j) (a y) (s (\\i.i))))) (j Z)))) (A ((\\k.G) P))",
      "\\a.\\g.X (w (d (U (\\g.\\r.T u))))"
    );
  }

  @Test
  public final void test267() {
    reducesTo(
      "(\\d.\\a.\\m.\\l.b (\\p.(\\z.\\z.\\m.a) (\\q.t (\\w.(\\i.w) l) (C (\\z.u))) (\\z.(\\d.(\\a.x) (\\u.b)) (\\y.y i) u ((\\a.(\\m.e) A (\\p.(\\u.S) (s q))) (\\t.p))) ((\\g.\\d.(\\p.\\r.(\\p.z (\\i.w)) ((\\y.M q (W g)) x)) ((\\r.(\\n.n) (\\c.t v (B y))) (\\a.y (\\l.t) ((\\s.h) (x y))))) (o (\\q.\\s.\\i.o (\\p.A) (V y (E y))) ((\\h.q) l))))) (g (Q ((\\y.\\b.\\b.\\b.p) (\\e.z) (\\b.y)))) (c (\\x.\\y.(\\x.t) (\\i.O) s (\\b.h) v (\\t.\\u.(\\b.(\\k.\\r.\\n.(\\m.e) (V l)) g) u)) (p (\\w.\\k.g ((\\k.\\y.\\s.(\\u.r) (u Y s)) c)) (\\k.(\\p.\\x.b y (\\m.i) y (\\l.(\\r.j) (\\m.j) k) (\\o.(\\j.\\g.(\\k.m) (d z) (\\f.e K)) M)) (\\j.\\t.(\\q.\\b.\\g.m) (\\f.(\\k.\\y.y) b)))) (\\r.z))",
      "\\m1.\\l2.b (\\p3.c (\\x.\\y.t s (\\b.h) v (\\t.\\u.\\r.\\n.e)) (p (\\w.\\k.g (\\y.\\s.r)) (\\k.\\x.b y (\\m.i) y (\\l.j k) (\\o.\\g.m (\\f.e K)))) (\\r.z))"
    );
  }

  @Test
  public final void test268() {
    reducesTo(
      "(\\s.c (\\t.y) (\\n.\\w.\\m.(\\n.p) (\\r.(\\o.v) (\\e.\\n.(\\z.(\\k.h) P (W (m (\\t.\\m.J W)))) (\\g.\\c.\\a.w ((\\r.\\n.e (t x (d R))) (E (i d)))))))) (r (o (\\f.u)) K)",
      "c (\\t.y) (\\n.\\w.\\m.p)"
    );
  }

  @Test
  public final void test269() {
    reducesTo(
      "\\i.(\\m.\\c.\\j.(\\h.(\\j.(\\r.a) ((\\g.\\i.(\\x.\\k.h) ((\\b.f) (\\p.K))) (z (\\v.\\c.c T)))) ((\\a.d (\\e.q a (G C)) ((\\y.T) (a v) d)) (\\i.(\\w.\\z.x) (M a B ((\\b.O) m)))) (K R)) (Z V) (R (\\l.\\k.\\j.\\k.t (\\g.(\\h.p) ((\\f.\\t.t ((\\v.g) (m k) (b (\\o.W)))) ((\\z.\\y.\\v.\\q.D u w) S)))))) B",
      "\\i.\\c.\\j.a (K R) (R (\\l.\\k.\\j.\\k.t (\\g.p)))"
    );
  }

  @Test
  public final void test270() {
    reducesTo(
      "(\\f.\\n.y) P",
      "\\n.y"
    );
  }

  @Test
  public final void test271() {
    reducesTo(
      "\\d.(\\q.v) ((\\c.\\k.A) (\\v.\\p.(\\u.(\\j.\\z.\\l.d) r (\\m.\\j.q (\\r.E))) (j ((\\q.(\\q.(\\p.S d (u s)) (\\s.x (V i))) (\\c.c) X) (\\c.\\b.w)))))",
      "\\d.v"
    );
  }

  @Test
  public final void test272() {
    reducesTo(
      "\\p.Q",
      "\\p.Q"
    );
  }

  @Test
  public final void test273() {
    reducesTo(
      "\\p.l (\\k.x) H p (V ((\\u.F) w)) (s ((\\j.K z) (\\s.\\s.\\c.(\\m.d y (O l) e) (y (\\x.(\\x.Q) q))) (\\j.(\\i.\\v.c (\\s.l)) (b u f ((\\l.p) r)) (f (q (\\n.b) (\\x.(\\f.X) (o N))))))) ((\\v.d) ((\\d.(\\h.\\p.U) ((\\f.\\z.M U) ((\\y.d) (k A)))) j) V (\\q.\\z.L)) (\\e.U)",
      "\\p.l (\\k.x) H p (V (F)) (s (K z (\\j.c (\\s.l)))) (d V (\\q.\\z.L)) (\\e.U)"
    );
  }

  @Test
  public final void test274() {
    reducesTo(
      "(\\x.g) Y",
      "g"
    );
  }

  @Test
  public final void test275() {
    reducesTo(
      "\\n.r ((\\t.l) ((\\r.o) ((\\v.h) (N (\\h.\\c.\\e.M))))) (\\a.(\\k.P) (\\s.(\\g.\\p.v (r m (d w) (\\c.\\s.u N) ((\\i.q) y))) ((\\g.k) ((\\b.\\k.(\\b.t z) (\\u.\\e.J)) (\\a.g (G n) (X C)))))) (\\n.(\\v.(\\i.z (\\n.\\z.\\v.\\x.z D (k E)) (\\j.(\\d.(\\q.Z z) (G m f)) (\\o.p))) s l) (P (\\i.M) ((\\c.R) (d (N W) (\\v.f)) ((\\m.V) Q F) (\\b.(\\l.o) (\\w.f) (\\w.\\w.\\o.r))))) (\\m.(\\q.\\n.(\\h.\\h.p (\\x.(\\w.x (\\q.\\q.\\s.\\x.\\r.\\s.J J)) (\\q.n (\\d.m) (\\x.X (\\z.W)) ((\\a.Y) z (\\r.\\t.\\n.P)) ((\\v.f z M) (E (R n)) (\\o.(\\w.k) u))))) ((\\x.\\z.z j Z ((\\g.b) (S D)) ((\\x.s) (\\l.u) t)) H (\\p.\\w.g) (\\v.a (\\k.(\\o.r) (\\i.z) w)))) (\\k.(\\q.J) (\\i.\\t.(\\c.\\s.\\t.\\p.e) ((\\i.(\\z.\\g.A) (\\o.F)) v))))",
      "\\n.r (l) (\\a.P) (\\n.z (\\n.\\z.\\v.\\x.z D (k E)) (\\j.Z z) l) (\\m.\\n.\\h.p (\\x.x (\\q.\\q.\\s.\\x.\\r.\\s.J J)))"
    );
  }

  @Test
  public final void test276() {
    reducesTo(
      "\\c.i (r (\\j.\\d.(\\e.\\h.\\s.(\\z.(\\d.N) (\\j.n) ((\\q.(\\b.\\h.\\i.n) (O (\\p.h))) r)) (\\d.(\\c.v h (o r) (\\q.\\l.\\f.i) (\\t.G)) A) ((\\k.\\p.\\z.\\a.(\\f.(\\a.n O) (\\y.v)) (Y (\\c.m) ((\\c.r) Q)) (i c)) l)) (\\e.\\e.(\\f.c) ((\\t.t) ((\\k.(\\l.i) c ((\\t.\\c.\\z.p) (u x (d M)))) (\\n.(\\x.\\g.l) r))))))",
      "\\c.i (r (\\j.\\d.\\h.\\s.N (\\h.\\i.n) (\\p.\\z.\\a.n O (i c))))"
    );
  }

  @Test
  public final void test277() {
    reducesTo(
      "c ((\\z.\\a.(\\s.\\w.(\\u.o k (a h) (\\h.\\v.f) (a t (\\t.g) (\\z.E f (w S)))) (\\a.l (b (\\h.u a (\\o.w)))) e) (m (\\t.(\\h.\\a.k) ((\\r.(\\j.b) (h m)) (a y (\\a.y))) (w L f s (\\w.\\u.N H ((\\y.y) (\\v.A)))))) e) E)",
      "c (\\a.o k (a h) (\\h.\\v.f) (a t (\\t.g) (\\z.E f (e S))) e)"
    );
  }

  @Test
  public final void test278() {
    reducesTo(
      "\\r.k (\\u.\\q.(\\d.\\j.\\g.\\i.r) (\\h.\\n.l y) n)",
      "\\r.k (\\u.\\q.\\g.\\i.r)"
    );
  }

  @Test
  public final void test279() {
    reducesTo(
      "\\w.(\\v.(\\o.\\r.\\k.(\\g.\\a.\\y.(\\w.\\r.i u ((\\a.P) (\\h.F))) ((\\a.r) s w) (W ((\\o.O) (\\d.t) (\\f.e (\\x.V)))) Z (\\v.(\\e.D) ((\\k.S) ((\\y.c) (\\f.\\m.\\a.Y))) (i (d (j t (\\v.t)) (\\d.g (x z (f B))))))) (\\m.k Y)) (\\b.s)) n",
      "\\w.\\r.\\k.\\a.\\y.i u (P) Z (\\v.D (i (d (j t (\\v.t)) (\\d.k Y))))"
    );
  }

  @Test
  public final void test280() {
    reducesTo(
      "\\o.i (d (\\b.\\j.y) (\\l.u (n (\\l.O) (\\s.\\z.\\d.\\r.\\n.b))) f)",
      "\\o.i (d (\\b.\\j.y) (\\l.u (n (\\l.O) (\\s.\\z.\\d.\\r.\\n.b))) f)"
    );
  }

  @Test
  public final void test281() {
    reducesTo(
      "(\\v.\\q.d (k (\\d.\\n.(\\z.(\\u.i) (O (\\d.b i (\\e.\\z.y w) (\\e.y)))) (\\d.(\\f.(\\h.(\\h.\\v.(\\c.A X) (\\x.o)) n) f) ((\\v.k) ((\\k.\\g.\\q.h) ((\\g.o) (\\n.w))) (k (\\j.\\c.I d M))))))) ((\\x.D) (\\k.(\\r.(\\a.\\r.\\e.v ((\\f.J (c (\\h.\\o.z))) (k T u (\\o.\\i.f)))) (\\x.\\c.\\f.(\\d.\\q.o) (\\r.c) (o (\\a.\\a.B i) (\\j.(\\l.B) x)) (\\j.(\\m.\\h.\\w.X) (\\o.\\g.\\k.\\u.T u (B B)) (\\r.h)))) (z (\\c.(\\e.j) ((\\q.\\d.\\z.r) (\\k.j))) ((\\j.(\\v.V) e) ((\\p.J) ((\\q.z H (\\q.A) (\\u.e (\\j.C))) (\\o.(\\y.\\x.S v) a)))))))",
      "\\q.d (k (\\d.\\n.i))"
    );
  }

  @Test
  public final void test282() {
    reducesTo(
      "(\\a.\\q.(\\h.e) j) (\\y.o)",
      "\\q.e"
    );
  }

  @Test
  public final void test283() {
    reducesTo(
      "r (U (\\p.y))",
      "r (U (\\p.y))"
    );
  }

  @Test
  public final void test284() {
    reducesTo(
      "(\\p.\\t.\\u.(\\s.\\o.\\g.L) L ((\\q.(\\l.e (\\f.c)) (\\s.\\j.F X) ((\\j.o) X)) (\\s.\\y.o (\\b.M) (\\v.r)) (\\a.t) ((\\g.O) ((\\e.x) ((\\o.\\y.\\f.(\\i.j v) y) (\\u.E e (\\a.r) (\\k.J n (\\m.I))))))) ((\\k.e ((\\t.(\\c.\\i.\\l.T) (\\h.\\t.(\\v.\\f.v) (O t (\\i.q))) (\\d.\\u.\\d.w (\\w.\\f.\\h.T w (d s)))) (F ((\\f.\\n.\\s.d) (F F (w A))) (i f)))) A)) (\\s.\\k.(\\w.P (\\e.(\\o.p) (\\l.L)) (\\k.(\\c.(\\y.\\a.g) l) R)) n)",
      "\\t.\\u.L"
    );
  }

  @Test
  public final void test285() {
    reducesTo(
      "s ((\\x.h) t) (f ((\\e.(\\u.c) ((\\s.\\h.(\\b.z) e) ((\\n.i) t (\\a.\\n.G r))) v) (c ((\\b.q) r (\\x.c)) (\\c.(\\t.\\y.R (\\l.\\z.\\s.v) (\\q.\\x.\\i.y m)) (q (\\g.E B (h t)) ((\\y.N) (e w) (\\a.(\\a.q) (\\n.a)))))))) (\\v.\\w.\\t.(\\u.\\m.Q) (c ((\\g.a) ((\\h.\\v.(\\s.f d) u) ((\\l.(\\q.C) (t N)) (\\v.y j (a M)))) h)) J)",
      "s (h) (f (c v)) (\\v.\\w.\\t.Q)"
    );
  }

  @Test
  public final void test286() {
    reducesTo(
      "e (\\b.(\\t.e (\\h.u m (T M))) ((\\v.r) f Y) (V ((\\d.G G (\\u.r)) (i y b)))) (\\r.(\\h.\\b.b (\\d.H)) m (\\f.w ((\\l.(\\b.(\\f.z) (f D)) (\\j.\\x.f y)) j))) (\\z.b) a a",
      "e (\\b.e (\\h.u m (T M)) (V (G G (\\u.r)))) (\\r.w (z)) (\\z.b) a a"
    );
  }

  @Test
  public final void test287() {
    reducesTo(
      "(\\g.z) ((\\f.\\b.(\\h.(\\w.c Q q t) (I (b u v))) u w t) ((\\h.\\g.(\\d.\\f.b F p (\\u.I p (\\o.e)) f) (i p (\\f.(\\q.J) (q a)) g) h) ((\\n.\\p.\\g.\\a.v p) (\\o.K (\\e.\\t.\\f.y))))) O",
      "z O"
    );
  }

  @Test
  public final void test288() {
    reducesTo(
      "l (\\l.(\\s.C (\\j.s)) (F (\\e.g (P p) (d T (\\p.z)) (b (\\c.\\t.\\o.K))))) ((\\r.(\\j.k) W) ((\\l.a) (\\e.p (\\l.(\\h.N) (d p) r (\\x.l))))) (\\w.(\\a.(\\r.\\r.\\v.\\l.\\v.\\k.(\\m.\\z.f n (u v)) (\\c.(\\t.r) (i m))) (\\u.\\e.O (\\i.h)) (j (\\h.\\y.E v) I (\\x.\\k.o)) (i (b (\\q.O)))) (\\a.(\\c.t) (\\x.\\u.(\\u.z) (\\j.(\\w.m) ((\\t.u) (b A)))) (\\t.\\z.z d) K)) (\\z.\\c.c (\\b.\\d.C))",
      "l (\\l.C (\\j.F (\\e.g (P p) (d T (\\p.z)) (b (\\c.\\t.\\o.K))))) (k) (\\w.\\l.\\v2.\\k.\\z.f n (u v2)) (\\z.\\c.c (\\b.\\d.C))"
    );
  }

  @Test
  public final void test289() {
    reducesTo(
      "(\\d.G) ((\\x.\\f.(\\b.T Y D) (\\g.k l p) (\\f.S) ((\\m.S T) Y)) D) (\\c.(\\b.(\\f.u (h I (\\w.o) (w M (\\b.N)))) (O Q (X x) (w (b M)) n)) (\\x.\\l.Y) c) i ((\\r.N n (\\n.i ((\\x.\\i.(\\w.i) m) p))) (\\j.o))",
      "G (\\c.u (h I (\\w.o) (w M (\\b.N))) c) i (N n (\\n.i (\\i.i)))"
    );
  }

  @Test
  public final void test290() {
    reducesTo(
      "(\\j.(\\y.(\\t.d ((\\w.P) a ((\\g.O) (F q)) (\\w.\\b.A)) ((\\f.\\r.w) (\\r.j) (L z s (z (\\z.H)) b))) (\\r.k ((\\z.\\f.g) (\\r.D)))) r) (i (\\x.l (\\f.\\o.\\o.\\o.(\\k.\\w.\\j.\\k.Z (e (\\y.l d (u j))) (V h (n S) (u q (w v)) (z Z W))) x))) (\\z.\\l.(\\a.(\\z.\\x.(\\z.(\\m.c (\\u.\\l.\\m.\\i.r)) (\\q.\\c.a)) (\\f.\\e.\\q.\\c.\\z.h (H B w k) R)) (\\n.\\x.\\n.c) y) (\\f.(\\c.z) (\\c.(\\l.M) ((\\m.(\\q.e) (v C) (B v)) (x (\\f.X l))) (\\l.\\m.R (z y) (\\h.s S (Y z)) ((\\o.T g g) (\\v.x)) (f (\\p.(\\l.m) (\\d.l) B))) (\\n.\\w.l))))",
      "d (P (O) (\\w.\\b.A)) (w) (\\z.\\l.c (\\u.\\l.\\m.\\i.r))"
    );
  }

  @Test
  public final void test291() {
    reducesTo(
      "w I (\\u.\\s.\\u.\\f.(\\l.(\\i.(\\z.y x) (\\w.i)) a u ((\\a.\\n.\\e.A) (\\q.(\\j.\\m.\\a.\\j.U) (o (\\f.\\h.\\c.e) ((\\v.r (\\u.p)) a))))) (\\d.d (\\s.(\\y.\\p.\\n.\\d.\\b.v) (\\u.(\\z.\\j.\\s.r) (\\z.d (\\o.h (\\q.W))) ((\\x.\\n.\\e.p) (\\y.\\f.v) (x p (w t) m)))))) (n (\\x.\\s.(\\p.(\\t.(\\k.\\z.N) w) (\\t.(\\l.\\u.h) e (\\q.\\r.\\a.f ((\\b.\\q.t) (\\a.X Y))))) W) (\\v.\\c.(\\t.(\\b.(\\v.\\v.\\n.U) ((\\v.X t) (\\b.\\m.w)) (j (m (\\h.\\g.\\u.O))) (A (\\v.k k))) (\\y.\\l.\\k.s)) (\\g.c (v ((\\h.\\y.U j (\\h.g) (\\p.\\l.h)) (\\m.\\t.R (o (\\t.u)))) (\\x.(\\x.(\\w.\\u.r) C) (\\d.(\\g.(\\f.U I) (\\o.\\e.r)) (\\k.\\l.f k (\\y.Q) (x o (\\g.r)))))))))",
      "w I (\\u.\\s.\\u.\\f.y x u (\\n.\\e.A)) (n (\\x.\\s.\\z.N) (\\v.\\c.U))"
    );
  }

  @Test
  public final void test292() {
    reducesTo(
      "\\p.\\c.(\\l.(\\x.\\z.(\\q.t E ((\\l.p) (v v)) (\\t.(\\p.\\r.u F) (\\c.v))) (g ((\\x.P) ((\\y.Z) (q F)))) (\\o.q) (\\j.s)) l) (\\e.\\m.(\\c.\\v.(\\y.B (\\b.n) ((\\s.L) ((\\s.\\s.h P) j)) (\\v.(\\x.V) ((\\l.(\\v.S) l) (R (p f))) (W J))) (\\z.h ((\\l.i) ((\\i.\\r.(\\a.d) A) (\\z.\\x.l E (\\m.m) (\\g.Y y)))))) ((\\k.N (\\g.\\y.(\\r.e s) (\\j.d g)) (\\g.\\y.Q)) ((\\f.\\l.q) ((\\s.f) ((\\f.b) a) (\\h.\\e.i))) (\\z.(\\q.H) ((\\n.X) (\\e.(\\p.q) (w m) Y)) (\\w.\\b.(\\h.(\\c.(\\a.w) (c v) (\\t.j)) (t (i h) (\\u.e))) (T H (o I) (\\t.(\\m.j) (q l)) (\\a.T)))))) i",
      "\\p.\\c.t E (p) (\\t.\\r.u F) (\\o.q) (\\j.s)"
    );
  }

  @Test
  public final void test293() {
    reducesTo(
      "\\g.\\s.k",
      "\\g.\\s.k"
    );
  }

  @Test
  public final void test294() {
    reducesTo(
      "N (\\u.\\j.(\\a.\\g.\\p.\\m.R) ((\\f.b) ((\\r.(\\l.h) (\\r.y)) (\\d.\\i.B i)) I) (\\c.k)) f (\\j.B)",
      "N (\\u.\\j.\\p.\\m.R) f (\\j.B)"
    );
  }

  @Test
  public final void test295() {
    reducesTo(
      "\\q.(\\k.\\t.\\g.\\w.\\o.K) j",
      "\\q.\\t.\\g.\\w.\\o.K"
    );
  }

  @Test
  public final void test296() {
    reducesTo(
      "\\z.t",
      "\\z.t"
    );
  }

  @Test
  public final void test297() {
    reducesTo(
      "\\n.\\j.\\p.\\v.y",
      "\\n.\\j.\\p.\\v.y"
    );
  }

  @Test
  public final void test298() {
    reducesTo(
      "X (\\o.a)",
      "X (\\o.a)"
    );
  }

  @Test
  public final void test299() {
    reducesTo(
      "(\\r.x) ((\\d.z) (\\b.z (\\k.o))) (\\k.(\\f.r) ((\\y.\\o.(\\u.(\\z.\\a.i (\\i.d)) (\\u.y x (e n) P)) w ((\\n.(\\w.\\x.h (l h) (\\c.y)) Z) (\\o.N))) b)) g",
      "x (\\k.r) g"
    );
  }

  @Test
  public final void test300() {
    reducesTo(
      "p ((\\f.r) ((\\i.\\c.n (\\f.(\\v.l) ((\\b.P) (\\p.g)))) d) (\\f.\\o.V ((\\y.x) (\\x.\\s.F)) (\\j.l (\\d.l))) (l x) i)",
      "p (r (\\f.\\o.V (x) (\\j.l (\\d.l))) (l x) i)"
    );
  }

  @Test
  public final void test301() {
    reducesTo(
      "\\m.d",
      "\\m.d"
    );
  }

  @Test
  public final void test302() {
    reducesTo(
      "(\\d.\\u.c) ((\\t.g) ((\\n.\\e.w j (\\k.W) (\\o.\\l.q)) (\\z.t)) Z (\\g.\\g.\\l.\\f.f)) X (\\s.\\v.\\n.\\w.z)",
      "c (\\s.\\v.\\n.\\w.z)"
    );
  }

  @Test
  public final void test303() {
    reducesTo(
      "\\s.(\\k.w) v",
      "\\s.w"
    );
  }

  @Test
  public final void test304() {
    reducesTo(
      "\\o.(\\i.(\\j.C) p) g",
      "\\o.C"
    );
  }

  @Test
  public final void test305() {
    reducesTo(
      "\\w.p",
      "\\w.p"
    );
  }

  @Test
  public final void test306() {
    reducesTo(
      "z (\\d.J (x (\\o.(\\h.(\\w.\\v.i H t (\\g.V)) i ((\\z.\\l.F l (\\x.v) k) (\\z.\\e.\\g.U))) (V (E ((\\v.E) b (\\d.(\\v.w) (\\v.D)))))))) d",
      "z (\\d.J (x (\\o.i H t (\\g.V)))) d"
    );
  }

  @Test
  public final void test307() {
    reducesTo(
      "(\\e.g ((\\u.(\\u.e (f s) k) (\\a.Q s Q (\\x.F))) b (\\a.v) (\\e.e)) (b (\\g.(\\v.i) e ((\\k.r y S) (\\f.\\y.W)) ((\\u.\\d.\\w.m (\\q.c)) (k t (z g) D)) V (\\q.H)))) l",
      "g (l (f s) k (\\a.v) (\\e.e)) (b (\\g.i (r y S) (\\d.\\w.m (\\q.c)) V (\\q.H)))"
    );
  }

  @Test
  public final void test308() {
    reducesTo(
      "\\o.X M",
      "\\o.X M"
    );
  }

  @Test
  public final void test309() {
    reducesTo(
      "(\\e.(\\p.(\\t.\\n.C) ((\\t.w p (\\d.v)) (h B (i d))) s (\\d.o) (\\l.(\\s.\\d.\\w.\\p.B (\\u.f)) (\\o.J (v e) ((\\s.C) ((\\j.\\c.\\i.q) (\\f.e (s J))))))) R) m (\\n.(\\h.e) k (\\n.I p))",
      "C (\\d.o) (\\l.\\d.\\w.\\p.B (\\u.f)) (\\n.e (\\n.I p))"
    );
  }

  @Test
  public final void test310() {
    reducesTo(
      "\\q.(\\z.S) ((\\j.(\\g.\\r.(\\k.(\\l.\\h.C (\\u.g)) (\\m.\\g.\\l.(\\k.\\y.z) (\\e.(\\n.\\j.\\x.(\\w.m) J) h))) U) ((\\y.\\g.\\m.B (\\u.(\\v.c (A g)) o ((\\v.o) a) (k (\\r.\\v.b (\\n.B) (\\i.q))))) (\\o.J))) M)",
      "\\q.S"
    );
  }

  @Test
  public final void test311() {
    reducesTo(
      "\\x.\\g.\\l.\\r.(\\u.\\y.(\\f.b) (\\k.g) (\\e.\\u.i) ((\\m.J) (\\o.t) ((\\v.G) (x g)) (\\j.v) p ((\\w.(\\x.(\\g.E (\\l.P)) (C (p y))) (\\p.\\n.(\\w.B i) (l (\\d.B)))) (I ((\\t.W A) (\\d.\\w.c)))) (b a) g)) (\\v.(\\u.(\\m.\\b.l) ((\\h.y) (\\f.G)) (\\t.\\p.(\\i.m) ((\\m.K c) (n (\\o.\\s.\\b.o (\\d.R)))))) (\\i.\\p.\\i.(\\q.\\t.S ((\\o.\\s.a) (\\k.\\w.(\\r.\\j.l) (\\f.\\h.(\\m.\\g.n) ((\\n.K) h))))) (\\h.H)) i)",
      "\\x.\\g.\\l.\\r.\\y.b (\\e.\\u.i) (J (G) (\\j.v) p (E (\\l.P)) (b a) g)"
    );
  }

  @Test
  public final void test312() {
    reducesTo(
      "(\\f.\\t.s (\\j.g ((\\p.(\\w.c) M ((\\t.j) ((\\q.\\o.T o) (\\b.(\\t.K) (r j))))) (q (y g (\\r.L))))) (z (\\t.\\x.y) ((\\k.c) (\\h.(\\r.\\h.t X) ((\\g.K) (\\q.p)) (F b (i o) r) (\\w.u) (\\b.\\f.(\\r.(\\u.\\w.\\f.\\s.\\x.B g) ((\\c.j) ((\\q.o) (\\j.j)))) (\\w.(\\v.u) m)))))) (d (\\n.(\\w.\\x.(\\s.c) ((\\j.\\k.\\b.o) n)) c X d) D)",
      "\\t.s (\\j.g (c (j))) (z (\\t.\\x.y) (c))"
    );
  }

  @Test
  public final void test313() {
    reducesTo(
      "\\v.(\\i.x) g",
      "\\v.x"
    );
  }

  @Test
  public final void test314() {
    reducesTo(
      "\\u.(\\e.\\t.j (n (\\t.\\z.\\f.(\\c.s) ((\\y.d (x b)) v) u))) ((\\f.R) ((\\h.\\l.\\z.\\f.g) t) (\\j.(\\x.(\\r.L z) (\\t.\\w.j w (\\u.E) V) ((\\a.\\k.\\r.o E (l j) (z n (n m))) r)) o)) g (\\q.\\t.\\f.\\c.t)",
      "\\u.j (n (\\t.\\z.\\f.s u)) (\\q.\\t.\\f.\\c.t)"
    );
  }

  @Test
  public final void test315() {
    reducesTo(
      "\\d.\\p.P (\\h.B)",
      "\\d.\\p.P (\\h.B)"
    );
  }

  @Test
  public final void test316() {
    reducesTo(
      "(\\f.(\\r.P (w ((\\j.g) ((\\m.(\\y.o) b) V)))) (\\c.e (\\f.\\b.(\\r.\\x.U s) (\\o.\\p.p) (k j (\\n.g) l)) (\\n.B) (\\l.(\\f.\\d.I) ((\\u.(\\c.\\w.\\e.q (l b)) R) t)))) ((\\f.Q) (\\x.(\\p.\\y.m g) (x x (O Q)) (q V (\\l.O) (\\q.S (D g))) R (\\w.\\d.R (\\n.\\k.\\d.(\\x.e d) (\\i.\\m.Z)) h)) (\\w.\\c.f)) (\\y.\\c.\\v.\\g.(\\o.H) (\\h.\\r.e) c)",
      "P (w (g)) (\\y.\\c.\\v.\\g.H c)"
    );
  }

  @Test
  public final void test317() {
    reducesTo(
      "(\\l.(\\z.(\\x.\\e.N (\\u.f) (c k (\\x.v)) g) n) (k h (O l) (f q (\\m.K)) (\\l.Y (\\b.\\r.u g)) V) (\\g.(\\w.o X d ((\\j.o) (u k)) s) (L (\\l.e (w o) D)) (W E)) t) (p ((\\p.\\b.(\\n.\\q.\\l.\\j.\\f.\\d.g) ((\\x.l G h) m)) (\\r.(\\s.C o (\\e.n)) (\\s.M) (\\p.g)) (\\r.g)) (\\l.(\\d.\\r.g) ((\\p.(\\j.Q) (\\z.(\\p.c) (\\a.b))) (\\e.K l) b) (f ((\\r.g) l) ((\\q.(\\h.a) b ((\\i.c) b)) (K g) ((\\r.o b o) (\\d.X s (J q)) (B (\\o.h) b)))))) (\\p.p ((\\w.(\\z.\\r.\\c.\\f.n) (\\r.j)) (E c)))",
      "N (\\u.f) (c k (\\x.v)) g t (\\p.p (\\r.\\c.\\f.n))"
    );
  }

  @Test
  public final void test318() {
    reducesTo(
      "\\k.w",
      "\\k.w"
    );
  }

  @Test
  public final void test319() {
    reducesTo(
      "i ((\\t.\\d.b) ((\\j.Z) Y) ((\\w.(\\o.m s (\\v.Y)) (\\p.z S)) (v (\\n.n) d) (c (\\r.\\p.\\p.V) (S u n s)) x (\\l.\\h.\\v.\\j.\\n.w (u e)) ((\\k.e (F v W (\\q.\\p.t o) (r (\\u.k) T))) f ((\\l.u (\\s.N (\\v.w z (Q A)) (\\u.\\r.\\l.c w (M P) (n N)))) z))))",
      "i (b)"
    );
  }

  @Test
  public final void test320() {
    reducesTo(
      "\\b.f",
      "\\b.f"
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
