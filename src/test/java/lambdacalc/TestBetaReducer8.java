package lambdacalc;

import org.junit.Test;

public final class TestBetaReducer8 extends ATestBetaReducer {

  @Test
  public final void test0() {
    reducesTo(
      "\\s.(\\w.p (\\z.\\x.z (\\s.i (H (\\n.T) f s) z))) E R",
      "\\s.p (\\z.\\x.z (\\s.i (H (\\n.T) f s) z)) R"
    );
  }

  @Test
  public final void test1() {
    reducesTo(
      "\\v.(\\r.\\c.\\o.\\y.u (j D)) (\\x.(\\n.\\h.w S) o ((\\n.B) (\\j.p j (p t)) (\\f.\\p.(\\d.\\x.P) (G m (\\l.U))) ((\\g.U (W f)) (\\c.\\k.\\e.w) F) (\\w.\\c.(\\k.j I C G) i) i) (\\b.\\y.e (\\y.o (\\b.\\p.h))))",
      "\\v.\\c.\\o.\\y.u (j D)"
    );
  }

  @Test
  public final void test2() {
    reducesTo(
      "(\\r.(\\h.(\\y.\\x.\\a.x) (\\i.\\v.\\f.\\m.\\y.(\\i.a (\\y.(\\t.\\m.z) (T ((\\k.\\b.D y) f)))) y)) l) (\\s.\\w.(\\k.\\u.\\v.e) r)",
      "\\x.\\a.x"
    );
  }

  @Test
  public final void test3() {
    reducesTo(
      "\\h.a",
      "\\h.a"
    );
  }

  @Test
  public final void test4() {
    reducesTo(
      "\\y.\\q.(\\j.y) (\\c.\\x.\\d.\\g.(\\s.(\\w.u) ((\\b.(\\a.j U) (\\z.\\j.d)) (\\k.\\u.g))) (i v ((\\b.N) (\\l.(\\o.d) (\\b.g))) (\\p.\\c.(\\i.i) (\\r.\\w.y (\\k.\\y.x))) z) (s ((\\d.\\e.\\f.q) (\\h.\\q.(\\c.(\\c.R) (\\r.w)) M ((\\t.(\\t.x) (f p (\\q.s))) F))))) q",
      "\\y.\\q.y q"
    );
  }

  @Test
  public final void test5() {
    reducesTo(
      "\\s.\\u.k F ((\\w.(\\d.g ((\\e.\\p.\\y.M (\\a.w) (s a (H h))) (\\t.U ((\\w.N) (T q))))) (\\v.n)) x) (t ((\\m.c) ((\\c.(\\x.\\k.\\g.C c (\\p.b) (\\f.m r)) (\\t.l (\\f.(\\z.k) (\\k.t)))) (I (y (\\k.\\m.Q Z)))) (\\i.\\w.(\\t.\\o.\\l.L) ((\\f.z) (p Z)) (\\h.h) ((\\d.U o (\\m.m)) (e (\\w.M)) (E x (o k) (\\b.\\r.l E))) (n (\\y.(\\b.p) (\\v.(\\x.T) (\\t.y)) ((\\e.y p r) (\\q.(\\w.C) (j z)))))))) B",
      "\\s.\\u.k F (g (\\p.\\y.M (\\a.x) (s a (H h)))) (t (c (\\i.\\w.L (n (\\y.p (y p r)))))) B"
    );
  }

  @Test
  public final void test6() {
    reducesTo(
      "(\\q.f) (\\k.\\q.\\s.d) ((\\s.\\r.Y) ((\\r.w (b (\\l.c)) (v (\\v.(\\f.r) (Q s))) E) k) (\\h.(\\o.\\e.Q) (\\h.x) ((\\c.C) K (\\c.o)))) Q",
      "f (Y) Q"
    );
  }

  @Test
  public final void test7() {
    reducesTo(
      "(\\e.(\\r.(\\u.(\\j.J H j) (G o (u k)) (H ((\\g.G) (n q)))) d) (\\g.h (\\m.\\g.\\t.X)) (\\w.\\a.(\\c.\\u.(\\i.\\d.Q) (\\b.b L)) ((\\b.(\\g.s) (y R)) ((\\r.X) (E k))) ((\\s.q) (h o) (\\j.z (\\s.l)) n) (\\i.(\\u.(\\t.V) (c x) J) f (\\b.z))) ((\\e.I (A v (B D)) (z (\\w.C)) (\\z.\\v.\\o.N i (p l) (s (W s)) (o G (n k) (b P (o l))))) (\\y.\\c.q) (\\i.\\q.\\i.e ((\\t.\\v.k M) Y))) (\\r.\\d.T ((\\c.\\f.h) ((\\b.q) (\\c.G) o)))) (\\q.(\\e.\\p.\\i.(\\b.q) (\\o.(\\u.K) l (\\l.p))) ((\\d.(\\h.\\l.(\\w.o y f) (p a d) (Z H)) ((\\r.(\\g.n p (V L)) (h C (l F))) y)) (\\m.(\\f.(\\r.v) ((\\c.L) (\\o.D)) ((\\a.I) (\\s.C) (G p H))) (B (\\t.\\e.\\n.m))) ((\\x.(\\j.Z P (\\n.y)) ((\\z.I) (\\k.h)) (\\l.v X (D c) (U a j))) (\\t.\\x.K) ((\\z.v) M))) (\\n.(\\d.a) ((\\q.\\j.(\\o.t ((\\z.\\b.\\p.l) Q)) (\\n.\\v.\\c.R g (z O b (\\x.n))) d) (\\r.U (\\v.(\\i.(\\a.f h (n o)) (\\z.\\w.r a) (\\f.(\\b.\\v.J) (\\t.\\z.s))) s)))))",
      "J H (G o (d k)) (H (G)) (\\w.\\a.Q) (I (A v (B D)) (z (\\w.C)) (\\z.\\v.\\o.N i (p l) (s (W s)) (o G (n k) (b P (o l)))) (\\i.\\q.\\i.\\i.\\v.k M)) (\\r.\\d.T (\\f.h))"
    );
  }

  @Test
  public final void test8() {
    reducesTo(
      "\\u.v ((\\a.(\\a.O (\\v.w a)) (\\e.a (\\m.I))) s)",
      "\\u.v (O (\\v.w (\\e.s (\\m.I))))"
    );
  }

  @Test
  public final void test9() {
    reducesTo(
      "\\o.\\g.Y",
      "\\o.\\g.Y"
    );
  }

  @Test
  public final void test10() {
    reducesTo(
      "(\\t.j) ((\\z.(\\v.M) ((\\s.\\k.q X) (L v (\\e.L)))) (\\g.N s)) b ((\\i.(\\v.U (q (\\x.k))) (X I (o W) f) (\\w.\\w.(\\e.\\u.v) (\\h.\\s.X)) (z (\\a.m) (\\y.(\\q.(\\r.\\v.\\n.R) ((\\b.r) (\\u.M))) (\\u.\\u.\\d.T)))) (\\r.y)) (\\x.\\i.\\t.\\g.\\a.t (r (d k) (R P (v y)) (\\n.\\l.\\r.\\k.\\c.q)) (\\q.y y) (\\c.G) (\\c.\\t.\\g.G (b (\\z.\\j.\\o.N) (\\g.(\\u.(\\m.W) (M o)) (q (\\f.e))) (\\i.I) W))) (\\k.\\m.F)",
      "j b (U (q (\\x.k)) (\\w.\\w.\\u.v) (z (\\a.m) (\\y.\\v.\\n.R))) (\\x.\\i.\\t.\\g.\\a.t (r (d k) (R P (v y)) (\\n.\\l.\\r.\\k.\\c.q)) (\\q.y y) (\\c.G) (\\c.\\t.\\g.G (b (\\z.\\j.\\o.N) (\\g.W) (\\i.I) W))) (\\k.\\m.F)"
    );
  }

  @Test
  public final void test11() {
    reducesTo(
      "(\\m.p (d (\\l.(\\p.L) (\\x.b a e ((\\l.Z) (\\h.r)) (\\q.(\\s.n) ((\\t.X) (o X))))) (\\v.\\v.f) J)) W",
      "p (d (\\l.L) (\\v.\\v.f) J)"
    );
  }

  @Test
  public final void test12() {
    reducesTo(
      "\\v.\\s.r",
      "\\v.\\s.r"
    );
  }

  @Test
  public final void test13() {
    reducesTo(
      "s (b (\\s.(\\d.d) ((\\u.h) ((\\y.Z (\\d.w)) (\\t.I (Z U)))) (\\u.O) (Q (B (\\b.\\o.\\i.\\x.s A Q)) (\\n.f ((\\w.W) (w o) m ((\\d.p) ((\\w.X) X))))))) j",
      "s (b (\\s.h (\\u.O) (Q (B (\\b.\\o.\\i.\\x.s A Q)) (\\n.f (W m (p)))))) j"
    );
  }

  @Test
  public final void test14() {
    reducesTo(
      "\\x.K",
      "\\x.K"
    );
  }

  @Test
  public final void test15() {
    reducesTo(
      "\\p.g ((\\x.p (\\h.b)) J)",
      "\\p.g (p (\\h.b))"
    );
  }

  @Test
  public final void test16() {
    reducesTo(
      "\\e.\\k.(\\m.\\t.\\j.\\y.\\v.S (d (\\a.\\n.y a) (\\f.\\i.\\w.f) ((\\l.(\\p.\\n.o) (\\v.r a (r N))) (\\g.J M))) (\\j.D (\\a.f))) ((\\a.w ((\\t.\\e.\\d.(\\g.\\a.\\w.\\b.\\z.l r) (H v)) (t (U v (\\c.I)) y))) (\\a.\\v.\\y.q)) (R (\\y.\\u.\\q.\\b.M) Q) (\\z.(\\b.V) (\\k.\\q.\\s.Y))",
      "\\e.\\k.\\y.\\v.S (d (\\a.\\n.y a) (\\f.\\i.\\w.f) (\\n.o)) (\\j.D (\\a.f))"
    );
  }

  @Test
  public final void test17() {
    reducesTo(
      "(\\l.x (\\c.\\f.(\\w.X q (\\d.(\\s.y) (f y) p) ((\\t.m) ((\\c.\\m.v S) J))) ((\\q.\\z.\\r.\\r.(\\c.(\\w.\\l.c) e) B) (\\i.(\\c.j a) (\\z.G i (r l) (H (w W))))) (\\s.j)) (\\h.j ((\\n.(\\w.\\i.j) ((\\p.(\\x.Z) d ((\\t.s) (Z B)) ((\\a.\\l.S) (\\d.\\f.x x))) Y)) L))) (\\t.C)",
      "x (\\c.\\f.X q (\\d.y p) (m) (\\s.j)) (\\h.j (\\i.j))"
    );
  }

  @Test
  public final void test18() {
    reducesTo(
      "\\a.(\\w.r) T (\\d.\\q.\\w.\\h.\\u.\\x.a) v",
      "\\a.r (\\d.\\q.\\w.\\h.\\u.\\x.a) v"
    );
  }

  @Test
  public final void test19() {
    reducesTo(
      "\\j.t ((\\l.\\g.X) n)",
      "\\j.t (\\g.X)"
    );
  }

  @Test
  public final void test20() {
    reducesTo(
      "(\\s.(\\j.g ((\\x.(\\o.\\x.(\\q.Z) (\\s.Q k)) (\\m.g b (I r) (u m)) e) f) (y g (\\j.\\p.\\t.\\s.j) (\\e.\\l.\\s.(\\v.(\\q.\\h.Y) (r C (\\c.j)) ((\\f.j) (\\a.A) l) (\\c.(\\p.r) M)) (f (y (\\o.\\d.(\\z.s) (\\d.i) V)))))) E) ((\\r.\\e.\\e.\\i.g ((\\g.\\k.h ((\\e.n) ((\\t.u) (l F)) (\\i.\\c.l))) ((\\q.\\j.(\\p.\\z.c e) ((\\p.J) (q S)) (\\i.(\\a.T n) (\\m.x))) (X j (\\s.\\h.\\o.x) (\\a.h))))) (\\r.\\o.(\\f.n) F N ((\\u.\\v.w) ((\\b.k) (\\n.i))) (\\g.N) ((\\w.\\s.w) Q) c) ((\\s.\\s.V) (\\b.(\\z.(\\c.H) (\\t.\\i.a)) (q (\\x.(\\g.Q) (W n) (\\l.\\d.u)) (\\c.(\\f.\\b.\\g.V) (h L (\\c.n)) x))) y))",
      "g (Z) (y g (\\j.\\p.\\t.\\s.j) (\\e.\\l.\\s.Y (\\c.r)))"
    );
  }

  @Test
  public final void test21() {
    reducesTo(
      "\\i.\\h.l",
      "\\i.\\h.l"
    );
  }

  @Test
  public final void test22() {
    reducesTo(
      "(\\q.g) ((\\m.\\g.j w (\\m.(\\p.M) ((\\d.L y (\\k.u) (\\l.\\a.\\t.L)) (A b g (\\v.U))))) S) h (U ((\\k.N) p) (\\q.a))",
      "g h (U (N) (\\q.a))"
    );
  }

  @Test
  public final void test23() {
    reducesTo(
      "(\\n.i) (\\v.\\y.Y (\\b.h) (\\g.(\\m.i s) ((\\v.S) g ((\\n.R) (\\c.\\y.\\k.\\c.\\k.w)) (\\b.g ((\\a.(\\i.q u (\\h.e) (z z (\\s.m))) m) (\\f.l))))))",
      "i"
    );
  }

  @Test
  public final void test24() {
    reducesTo(
      "(\\b.c (\\a.\\p.x l (\\b.(\\v.\\l.v) b)) i) p",
      "c (\\a.\\p.x l (\\b.\\l.b)) i"
    );
  }

  @Test
  public final void test25() {
    reducesTo(
      "(\\q.\\g.\\z.\\n.(\\o.\\i.\\l.a) (\\z.\\j.G) (\\t.(\\k.j) (\\c.L j) g)) ((\\m.\\d.\\e.\\o.(\\l.\\h.\\i.p) ((\\h.\\g.\\g.\\j.\\i.U ((\\v.Z) p)) (\\p.\\b.(\\u.\\t.g j) p g)) ((\\a.(\\d.\\p.b (\\t.\\e.d)) (\\t.c (\\j.w) (v j (\\o.p)) (\\s.S (r (\\a.d))))) (\\u.\\u.\\r.\\p.(\\u.K e n) (\\h.\\o.o) (\\r.\\b.\\n.x O (u R)) (\\p.i)))) D) ((\\d.\\k.\\a.\\s.H) (\\b.\\a.(\\v.E) q) (\\w.(\\d.K (a (\\h.\\h.m))) (\\r.\\z.\\s.C) Y z))",
      "\\z1.\\n.\\l.a"
    );
  }

  @Test
  public final void test26() {
    reducesTo(
      "\\c.(\\y.u (\\p.\\a.t (g (o l) ((\\c.p (\\b.\\b.\\x.\\n.\\f.A (\\p.j))) (\\q.F ((\\e.D r) (\\g.\\f.\\d.d))) p)))) ((\\s.A (\\v.(\\i.(\\h.(\\b.O) (v e) (i (\\r.Z))) (\\r.(\\u.N) ((\\e.D) (K S)))) (o (c ((\\p.j) (\\v.Z))))) (\\t.\\k.\\s.x)) (p S) (\\x.\\v.\\f.c))",
      "\\c.u (\\p.\\a.t (g (o l) (p (\\b.\\b.\\x.\\n.\\f.A (\\p.j)) p)))"
    );
  }

  @Test
  public final void test27() {
    reducesTo(
      "\\v.\\f.y",
      "\\v.\\f.y"
    );
  }

  @Test
  public final void test28() {
    reducesTo(
      "n (\\y.\\p.(\\n.(\\u.k) p) M ((\\s.s ((\\l.m) (\\p.(\\p.M T (z S)) (\\o.f o (\\a.A))))) (s ((\\c.(\\f.Z A (\\i.F)) (o (\\r.p))) (\\c.\\q.M (F z H)))))) (\\i.t ((\\a.\\q.R) (\\c.(\\a.(\\d.\\g.H o) (y O Z) (\\d.k I ((\\y.k) (\\b.b)))) (\\p.(\\i.s) j) ((\\n.\\p.(\\d.x U) (\\l.f)) (\\i.n e x ((\\o.c) (\\c.g))) ((\\p.\\f.r) (\\k.w)))))) g",
      "n (\\y.\\p.k (s (Z A (\\i.F)) (m))) (\\i.t (\\q.R)) g"
    );
  }

  @Test
  public final void test29() {
    reducesTo(
      "(\\e.y) (\\u.a (\\d.\\z.\\e.\\j.b (\\v.j h) (\\v.\\a.\\l.d d (c q))) (\\a.(\\k.(\\p.l) ((\\l.\\c.\\o.O) (\\n.z))) f) Y (\\x.(\\u.L) u) O)",
      "y"
    );
  }

  @Test
  public final void test30() {
    reducesTo(
      "\\u.(\\j.(\\c.Y) C) Z",
      "\\u.Y"
    );
  }

  @Test
  public final void test31() {
    reducesTo(
      "(\\q.t) (\\k.\\f.L (\\h.(\\y.\\k.\\h.h) (\\k.(\\m.\\d.\\v.c) (h i (z d))) ((\\b.\\x.J) (\\x.\\u.w i L ((\\r.i) (\\a.t)))) (O (\\y.(\\h.\\u.\\o.m) c)) (V k) ((\\c.\\j.(\\h.\\n.\\y.j) d (\\i.m)) (\\h.\\q.\\l.g) (\\g.\\q.i))))",
      "t"
    );
  }

  @Test
  public final void test32() {
    reducesTo(
      "\\g.(\\g.(\\a.P) X) (O (\\b.\\s.\\b.(\\d.\\l.\\m.d t (\\y.e) (X I (\\b.G))) (\\x.\\y.c) (\\j.\\y.\\x.g) (\\h.\\q.S) (\\l.\\p.(\\t.\\a.M) (\\p.(\\r.O (\\r.\\e.d)) h) (\\l.\\i.k ((\\p.\\r.t) (e (\\r.C) (\\t.\\g.\\f.J)))))) ((\\i.\\q.(\\l.e) (\\t.F) (\\y.S z B) M (\\v.(\\o.\\i.(\\j.o) ((\\f.h) (N y))) (\\w.(\\e.\\b.g k) (y y e))) ((\\b.\\a.\\n.(\\i.\\u.(\\r.y K) (L (O m))) x) (\\m.(\\j.(\\y.p) (G T)) j (\\y.\\p.\\l.\\x.t))) a) g))",
      "\\g.P"
    );
  }

  @Test
  public final void test33() {
    reducesTo(
      "\\q.\\h.\\g.u",
      "\\q.\\h.\\g.u"
    );
  }

  @Test
  public final void test34() {
    reducesTo(
      "(\\d.\\a.\\h.(\\s.\\q.B (\\j.(\\x.(\\s.C (\\y.l N)) (i T (\\v.I) (R g (m D)))) (G ((\\g.y) J (\\e.\\r.c E)))) (l f (\\a.D)) ((\\g.\\d.V ((\\i.e (S (I v))) p)) (\\y.b) s)) ((\\g.q ((\\c.\\f.v) (\\x.z (R r (i C)))) ((\\a.T) (\\c.H) (\\e.m)) (\\q.A)) (Q (\\r.\\g.\\d.u)))) ((\\q.(\\t.(\\g.\\g.(\\a.\\y.f) (\\p.J d)) ((\\l.h) (o n) (\\w.\\i.\\f.c))) ((\\u.f (\\a.T)) h (\\q.\\c.\\d.(\\u.l) ((\\r.P) (\\a.w)))) (w (e (\\l.\\e.e z)) (\\c.(\\p.(\\j.\\g.n r) ((\\m.V) L)) (r (r h (y i)))))) (\\u.d) (\\m.\\o.\\b.\\q.\\r.\\u.\\w.(\\p.(\\o.(\\q.B l (C x) (\\r.\\k.\\w.I)) (\\x.l) (\\h.\\e.a (s E) (\\l.\\k.\\i.n) ((\\f.A) (\\p.a) (V E (l r))))) (\\x.l l)) (\\r.S)) (\\x.(\\s.(\\l.U) (\\c.\\h.\\x.(\\h.\\c.l) i (\\j.\\x.\\h.(\\l.(\\y.m r) (\\k.W J)) (\\a.f (\\b.t) (\\l.x K)))) (\\z.d (\\z.(\\z.q (x D)) A) ((\\n.d (\\l.r)) (\\a.i N (T e)) (e (n Z) (c (D n)))) g)) (u (T (\\t.(\\b.Z) (\\b.y) (n L (c i))) ((\\a.(\\l.(\\q.l) (\\c.l)) c) (v o (U q) (\\v.(\\v.x) s)))) (l (\\u.h g (\\c.G) ((\\i.\\e.C (l M) (\\q.j)) e))))))",
      "\\a.\\h.\\q1.B (\\j.C (\\y.l N)) (l f (\\a.D)) (V (e (S (I v))))"
    );
  }

  @Test
  public final void test35() {
    reducesTo(
      "e (j f)",
      "e (j f)"
    );
  }

  @Test
  public final void test36() {
    reducesTo(
      "(\\f.\\k.x) (\\q.c A ((\\h.m) (\\m.g D ((\\j.o) (\\f.(\\v.\\y.q) d)) h (\\d.\\e.j (\\q.c)))))",
      "\\k.x"
    );
  }

  @Test
  public final void test37() {
    reducesTo(
      "\\o.(\\k.\\z.E) v",
      "\\o.\\z.E"
    );
  }

  @Test
  public final void test38() {
    reducesTo(
      "\\k.s ((\\t.B) ((\\h.a) ((\\g.\\k.h) ((\\d.N (\\m.q) d ((\\d.P) ((\\v.J) s))) ((\\h.f g (M R)) (b (\\w.d)) (\\l.\\b.p b (\\b.V) (o t g))) ((\\c.N S (\\o.u) L) (\\q.\\a.o q (w i) S) (\\t.(\\b.g) (\\k.B) ((\\q.\\p.f Z) (Y R (y n)))))))))",
      "\\k.s (B)"
    );
  }

  @Test
  public final void test39() {
    reducesTo(
      "(\\u.\\h.(\\r.(\\t.m (g (p e (V r)) d) (\\q.\\f.\\d.a)) (\\d.\\q.\\b.g)) (\\l.\\n.\\s.(\\m.\\y.U ((\\l.X) (\\z.\\a.\\f.\\z.Q))) J)) u X",
      "m (g (p e (V (\\l.\\n.\\s.\\y.U (X)))) d) (\\q.\\f.\\d.a)"
    );
  }

  @Test
  public final void test40() {
    reducesTo(
      "h ((\\a.(\\e.v) ((\\b.(\\u.n) ((\\u.\\r.\\v.\\a.k t E) (\\s.r))) (\\k.(\\v.(\\k.\\i.f) q) j))) U)",
      "h (v)"
    );
  }

  @Test
  public final void test41() {
    reducesTo(
      "u ((\\b.k) ((\\q.\\q.m) (\\v.E))) (O (\\e.\\s.d))",
      "u (k) (O (\\e.\\s.d))"
    );
  }

  @Test
  public final void test42() {
    reducesTo(
      "(\\j.\\n.c (\\s.I (c (\\k.\\r.L s) d) ((\\l.\\b.l) e)) X (\\f.\\h.n)) ((\\z.R) ((\\y.\\j.u (s (\\c.s ((\\k.b) M)))) d) (S k))",
      "\\n.c (\\s.I (c (\\k.\\r.L s) d) (\\b.e)) X (\\f.\\h.n)"
    );
  }

  @Test
  public final void test43() {
    reducesTo(
      "\\i.g ((\\u.z) ((\\f.(\\h.(\\m.c u (U Q) (\\v.c (\\y.t)) ((\\m.I (M k)) (\\e.\\u.\\s.z))) D (\\f.(\\y.(\\u.\\b.(\\n.s) (\\h.x) (\\b.\\e.p)) (y (r T) h)) (\\h.x))) (w m)) (a (\\m.b))))",
      "\\i.g (z)"
    );
  }

  @Test
  public final void test44() {
    reducesTo(
      "(\\w.z) K J",
      "z J"
    );
  }

  @Test
  public final void test45() {
    reducesTo(
      "l ((\\p.(\\r.t) (\\t.K) B) (G ((\\i.C (l p (P f))) (p U (a l) (Y J (\\r.J))) (\\r.m) (i e))) (\\x.r ((\\k.s) m)))",
      "l (t B (\\x.r (s)))"
    );
  }

  @Test
  public final void test46() {
    reducesTo(
      "\\d.R",
      "\\d.R"
    );
  }

  @Test
  public final void test47() {
    reducesTo(
      "\\a.e",
      "\\a.e"
    );
  }

  @Test
  public final void test48() {
    reducesTo(
      "d ((\\q.(\\g.\\j.(\\y.(\\y.b) d) (\\d.\\t.\\i.s) ((\\u.r) a) R) ((\\p.(\\m.i) O ((\\f.d) (d E)) (h (I (\\a.o)))) (\\h.k))) (f ((\\t.d) ((\\j.\\y.\\v.\\s.e Q s) I))) (\\h.y (\\r.i) (\\o.v)) (\\d.\\h.(\\r.w) (\\s.(\\d.H (V H (\\w.u) (\\f.\\m.\\n.h)) (i (Q (\\a.\\k.\\p.a)))) (\\b.\\j.i)) (\\k.K)))",
      "d (b (r) R (\\d.\\h.w (\\k.K)))"
    );
  }

  @Test
  public final void test49() {
    reducesTo(
      "\\t.\\k.n (\\r.\\r.(\\n.a) (\\b.A (\\y.(\\r.u g (M B) (O (\\n.j))) (\\r.g)) (\\a.\\e.E ((\\a.\\e.O) (\\z.x))) ((\\q.p (\\e.\\j.v ((\\e.i) (z r)) x)) ((\\w.\\a.\\p.R (d (h c))) C (\\m.f)))) h)",
      "\\t.\\k.n (\\r.\\r.a h)"
    );
  }

  @Test
  public final void test50() {
    reducesTo(
      "\\p.\\t.P",
      "\\p.\\t.P"
    );
  }

  @Test
  public final void test51() {
    reducesTo(
      "(\\o.i) (\\h.\\z.\\o.\\d.j)",
      "i"
    );
  }

  @Test
  public final void test52() {
    reducesTo(
      "(\\j.\\k.Q) E (\\z.\\r.\\o.c ((\\d.(\\j.g) (e (\\d.e) (\\v.i))) (\\o.(\\k.(\\w.(\\k.(\\i.q) (\\x.y)) (\\n.j (B q))) R) F) (\\c.(\\v.\\b.\\m.e) (r (\\j.\\c.m) ((\\q.\\a.\\e.a) (H (d w (\\e.A))))))) (P (\\f.(\\u.d) j) ((\\l.\\d.\\a.n) c) (g ((\\q.\\q.\\z.y a) (\\x.c)))))",
      "Q"
    );
  }

  @Test
  public final void test53() {
    reducesTo(
      "\\p.s ((\\w.\\g.o) V)",
      "\\p.s (\\g.o)"
    );
  }

  @Test
  public final void test54() {
    reducesTo(
      "P (\\b.S) ((\\t.(\\x.\\s.\\n.j ((\\l.(\\t.\\j.u E) (j w (N b))) ((\\a.X) (\\c.X) (\\f.f)))) (\\e.p) (\\c.v)) ((\\k.(\\c.\\y.x) (\\t.\\v.(\\k.(\\w.h) B) z)) P) e)",
      "P (\\b.S) (j (\\j.u E))"
    );
  }

  @Test
  public final void test55() {
    reducesTo(
      "\\u.\\f.\\h.\\p.d (\\y.w (\\v.\\t.\\p.\\y.\\c.(\\u.\\z.B) t) F W)",
      "\\u.\\f.\\h.\\p.d (\\y.w (\\v.\\t.\\p.\\y.\\c.\\z.B) F W)"
    );
  }

  @Test
  public final void test56() {
    reducesTo(
      "\\e.W (H r N (\\s.(\\n.y) i) ((\\z.(\\l.n) (\\h.u)) (\\c.l (\\u.O))) (d ((\\x.L) (\\w.\\j.\\n.l))) (a u (\\n.g) y (\\v.\\u.\\b.(\\s.p) (w p) L) (\\c.i f (l B) (S y i) (C (\\n.W) (\\s.(\\a.E) (\\h.y))))) (q (H (B (\\n.\\o.\\u.(\\u.m q) (k (\\b.s)))))) ((\\w.\\q.(\\v.\\v.G) (b (\\q.s)) (\\i.\\m.\\k.(\\g.L) (\\q.l) (\\h.t d (\\j.V)) X) V) ((\\h.\\h.\\m.l q z) g))) (X g)",
      "\\e.W (H r N (\\s.y) (n) (d (L)) (a u (\\n.g) y (\\v.\\u.\\b.p L) (\\c.i f (l B) (S y i) (C (\\n.W) (\\s.E)))) (q (H (B (\\n.\\o.\\u.m q)))) (\\q.G V)) (X g)"
    );
  }

  @Test
  public final void test57() {
    reducesTo(
      "\\v.(\\d.(\\t.\\z.(\\q.\\d.\\i.g) (\\i.k)) ((\\z.j ((\\b.x U) (\\d.z h (\\o.l)) (\\m.t j (A v) W)) (\\h.(\\p.\\s.F) (\\c.\\w.(\\w.F) B (\\e.x k)) ((\\c.(\\x.T (\\b.X)) o) (o m (x b (s v)))))) (q (\\e.d)))) (N (\\q.\\a.\\m.b (\\w.h (j k) (N (\\g.o)) (\\j.\\z.u))) (\\g.R) ((\\x.o) M)) (y m (\\z.(\\v.\\s.\\q.X (o (\\f.\\p.\\a.h))) t (\\f.T)))",
      "\\v.\\d.\\i.g"
    );
  }

  @Test
  public final void test58() {
    reducesTo(
      "\\z.(\\y.o) e",
      "\\z.o"
    );
  }

  @Test
  public final void test59() {
    reducesTo(
      "\\y.\\y.\\o.l u (\\w.\\i.o)",
      "\\y.\\y.\\o.l u (\\w.\\i.o)"
    );
  }

  @Test
  public final void test60() {
    reducesTo(
      "(\\o.\\h.X) (\\y.\\u.\\u.\\y.(\\e.\\f.(\\q.\\e.c (\\x.(\\j.d) (c j) (b e a) a)) (\\l.g)) ((\\w.(\\i.T) o) Y h s)) ((\\c.J) (\\z.\\t.(\\b.x) (\\q.\\s.\\q.\\g.(\\t.\\v.c) ((\\c.s o n o) (\\t.\\m.\\r.p (\\u.r))))) ((\\i.q) (X P))) D",
      "X D"
    );
  }

  @Test
  public final void test61() {
    reducesTo(
      "(\\b.i) ((\\o.l (\\z.(\\r.e) (\\i.\\j.P) Z)) (\\n.F))",
      "i"
    );
  }

  @Test
  public final void test62() {
    reducesTo(
      "\\r.(\\a.\\p.q ((\\h.(\\q.d) ((\\j.r ((\\j.z) (i D) (\\y.(\\o.i) (\\g.N))) (\\p.q)) (a L c (\\q.(\\d.(\\z.g) (\\i.A)) (\\c.M (\\j.u)) (s n (T k) ((\\f.F) (w w))))))) x)) (\\m.(\\w.x) E)",
      "\\r.\\p.q (d)"
    );
  }

  @Test
  public final void test63() {
    reducesTo(
      "\\x.\\a.\\i.\\f.O",
      "\\x.\\a.\\i.\\f.O"
    );
  }

  @Test
  public final void test64() {
    reducesTo(
      "(\\i.(\\e.\\k.X) ((\\r.d) (\\h.I) z c (\\z.(\\m.(\\u.d) ((\\k.S) ((\\z.\\t.s) (b (\\n.m) (\\t.(\\q.O) (\\t.o)))))) L))) ((\\u.\\y.b (\\v.p C (i v) (z (\\z.u)) (\\z.(\\e.r) (y U) (\\z.l))) ((\\z.z) (\\m.r (\\b.w) (Q a (h L))) (\\i.(\\c.p) (\\l.\\l.\\g.X)))) i h ((\\o.G ((\\c.g) ((\\g.o) (\\n.f)) R ((\\h.\\o.w (\\d.g n)) a)) d) (\\z.\\z.\\q.(\\a.\\s.(\\o.\\p.\\t.p) (\\g.e ((\\s.j) (\\u.d) (H b (r f))))) (\\m.r) ((\\t.P) ((\\w.(\\v.(\\l.\\y.T i) (\\o.\\z.\\s.e)) x) (\\r.a z (\\g.w f (\\h.U) (\\m.\\v.o))))))))",
      "\\k.X"
    );
  }

  @Test
  public final void test65() {
    reducesTo(
      "\\y.\\y.(\\c.n) N",
      "\\y.\\y.n"
    );
  }

  @Test
  public final void test66() {
    reducesTo(
      "\\z.\\h.U",
      "\\z.\\h.U"
    );
  }

  @Test
  public final void test67() {
    reducesTo(
      "\\r.\\l.\\f.r",
      "\\r.\\l.\\f.r"
    );
  }

  @Test
  public final void test68() {
    reducesTo(
      "\\j.g ((\\m.(\\e.(\\p.y) (\\d.\\x.\\h.m)) (w (\\b.O) (\\i.\\a.U))) Z v (B (\\m.\\v.(\\s.\\j.k) U m (\\n.(\\y.\\u.\\y.p) (u m (\\k.j)) (\\s.y (\\i.\\p.r))))) (\\e.i)) k",
      "\\j.g (y v (B (\\m.\\v.k (\\n.\\y.p))) (\\e.i)) k"
    );
  }

  @Test
  public final void test69() {
    reducesTo(
      "(\\l.\\d.(\\y.\\w.\\o.\\c.\\z.\\w.F) ((\\n.(\\t.\\w.a (\\t.(\\v.\\w.\\j.(\\p.g) (\\c.b)) y)) (d (c (e Z) (V x n) (d (\\k.t) (j g (\\v.X)))))) (\\i.(\\w.\\e.C ((\\t.p) (g h))) (I T (\\o.f) (\\d.N p (v M))) w ((\\c.\\f.\\j.h (\\p.\\t.t ((\\z.z) y))) (\\q.u))))) (\\u.i (\\k.\\n.p)) (\\k.\\r.(\\m.\\r.(\\e.(\\e.m (\\n.(\\m.(\\t.q) (x b)) k) ((\\u.D (\\b.h p (g r))) ((\\f.\\z.\\l.F) (g i T))) (\\b.(\\w.o) Q)) (\\o.K)) (v c)) E)",
      "\\w.\\o.\\c.\\z.\\w.F"
    );
  }

  @Test
  public final void test70() {
    reducesTo(
      "\\k.s",
      "\\k.s"
    );
  }

  @Test
  public final void test71() {
    reducesTo(
      "b (m D)",
      "b (m D)"
    );
  }

  @Test
  public final void test72() {
    reducesTo(
      "(\\a.b (\\n.\\f.(\\i.\\i.\\y.q) u ((\\a.\\e.\\i.(\\y.z) ((\\g.(\\b.\\m.z L) (\\j.e h (h v))) (b (\\c.(\\k.F) (W y)))) (b (\\o.\\j.\\z.t ((\\n.w) (\\h.g)) (X (\\q.I f))))) (\\y.t)))) (\\u.i)",
      "b (\\n.\\f.\\y.q)"
    );
  }

  @Test
  public final void test73() {
    reducesTo(
      "C (\\d.E)",
      "C (\\d.E)"
    );
  }

  @Test
  public final void test74() {
    reducesTo(
      "\\s.u",
      "\\s.u"
    );
  }

  @Test
  public final void test75() {
    reducesTo(
      "(\\w.\\w.(\\h.T (s (a V (\\b.u))) ((\\z.\\o.m) N A)) (\\l.\\v.(\\q.\\g.\\o.r) (\\e.\\p.\\n.v) (u (g m) z) (\\z.(\\d.s (Y v)) v))) (n (\\s.g (d (\\z.m E (k v)))) ((\\y.(\\x.i) ((\\z.(\\b.G) (W v)) (\\h.K))) a)) ((\\g.j) ((\\p.\\m.\\j.f) (q (L u (\\b.n)) (\\o.E) (D (\\b.e (R e)) ((\\k.l) (L i) (t R)))))) D ((\\k.q) ((\\p.(\\q.(\\r.Q) (\\a.(\\o.b (\\s.b)) (\\i.j)) ((\\b.s) (\\g.j) (\\j.\\a.k) (J u (l i) (\\s.e)))) ((\\z.(\\i.(\\g.c) (c j)) a) (\\o.\\z.\\d.\\f.T) (\\i.(\\j.l) ((\\c.y) (\\o.p)) (F ((\\s.B) (s p))))) (\\p.\\s.\\f.(\\d.\\c.\\m.x o (u g) q (\\g.z (n J (z w)))) (\\x.(\\x.u) (\\p.\\w.x)) g)) G))",
      "T (s (a V (\\b.u))) (m) D (q)"
    );
  }

  @Test
  public final void test76() {
    reducesTo(
      "m (\\r.\\z.\\e.R)",
      "m (\\r.\\z.\\e.R)"
    );
  }

  @Test
  public final void test77() {
    reducesTo(
      "(\\q.\\n.\\z.l) (\\y.x)",
      "\\n.\\z.l"
    );
  }

  @Test
  public final void test78() {
    reducesTo(
      "\\c.\\v.\\q.X ((\\i.(\\u.\\e.\\o.(\\k.Y) (\\w.\\o.v x) (\\y.(\\a.\\y.x) (\\y.(\\l.x) e (\\c.z) (E g (p K) z))) (e (\\n.F))) ((\\l.\\b.\\m.w ((\\w.\\n.\\w.\\t.h (J g)) d) (P (H (\\r.\\t.\\n.(\\b.t) ((\\k.e) (\\j.S)))))) x)) e)",
      "\\c.\\v.\\q.X (\\e.\\o.Y (\\y.\\y.x) (e (\\n.F)))"
    );
  }

  @Test
  public final void test79() {
    reducesTo(
      "(\\c.\\w.\\t.\\r.\\g.\\p.w z) Z (\\n.(\\p.Z d) (\\q.\\y.\\p.(\\c.o (\\y.\\o.e)) (\\u.M) L (\\k.\\h.l z)) ((\\z.\\w.e ((\\b.m) (\\k.Q) ((\\q.m) (v v) (\\l.\\q.y i)) ((\\h.B) (\\j.(\\v.m) l) (\\h.A (\\x.C) (w a (\\m.n)))))) (t ((\\l.\\e.(\\x.e) (K c) (\\w.l)) (g w (\\p.o) w)) (\\q.\\w.(\\z.\\z.L (\\c.n o)) (\\p.Q r (Y B) (\\r.(\\m.W) P)) O))) (\\p.\\y.E))",
      "\\t1.\\r2.\\g3.\\p.Z d (\\w.e (m (m (\\l.\\q.y i)) (B (\\h.A (\\x.C) (w a (\\m.z)))))) (\\p.\\y.E)"
    );
  }

  @Test
  public final void test80() {
    reducesTo(
      "(\\z.(\\j.k W) N) (\\g.\\j.\\x.\\x.n (\\x.\\y.j)) (\\q.P) ((\\x.\\c.i) l) ((\\l.\\s.e ((\\k.f u Y) (\\h.F l (\\b.A)))) y ((\\f.D d (j y) (\\q.k) ((\\w.p) ((\\o.g) (x M)))) (l l ((\\s.\\o.v) ((\\v.a) (g o))))) A (\\j.(\\b.f (K (\\m.g) (\\f.(\\l.i) r)) (\\i.y m ((\\t.\\v.l i) ((\\e.\\f.A) (\\q.o))))) (\\q.\\m.(\\n.\\s.I) d)) (M I (\\q.\\o.(\\m.b) G (\\o.\\n.\\z.(\\x.a H) w)) ((\\w.(\\m.\\w.(\\z.z) ((\\q.M) ((\\d.\\y.\\n.b) ((\\e.k) (R r))))) L) (S ((\\w.I) (p X) (\\x.C (\\b.a)) (y (\\x.A) ((\\e.x) (\\v.l))) (\\h.\\u.\\e.\\x.\\i.(\\h.t (m R) (l (\\g.u))) (m P U)))))))",
      "k W (\\q.P) (\\c.i) (e (f u Y) A (\\j.f (K (\\m.g) (\\f.i)) (\\i.y m (\\v.l i))) (M I (\\q.\\o.b (\\o.\\n.\\z.a H)) (\\w.M)))"
    );
  }

  @Test
  public final void test81() {
    reducesTo(
      "(\\l.g ((\\y.\\z.(\\a.(\\j.c) O) (\\u.(\\z.e) (\\m.h)) (\\p.\\q.\\b.(\\b.v) (\\s.f))) i) (\\c.(\\e.\\h.\\w.E) p (\\b.\\n.(\\r.\\t.(\\g.(\\o.u) (\\u.Z)) (N z (\\u.v)) (Y Q (\\s.M) w)) (\\v.\\s.z A)))) (\\h.(\\o.I) (\\j.\\l.g) (\\v.\\w.(\\d.E) ((\\u.(\\x.\\t.n f) (\\b.\\u.R h)) e) ((\\c.\\w.q c (i l) y) (\\b.\\t.\\f.\\x.\\i.e q (x d)) (\\g.(\\x.(\\n.(\\d.h) (\\m.r)) (\\h.(\\q.N) (d h))) (\\x.r))))) (\\c.M (\\v.x)) (c (\\l.T) (\\s.\\p.\\j.z ((\\k.\\v.L) g)))",
      "g (\\z.c (\\p.\\q.\\b.v)) (\\c.\\w.E) (\\c.M (\\v.x)) (c (\\l.T) (\\s.\\p.\\j.z (\\v.L)))"
    );
  }

  @Test
  public final void test82() {
    reducesTo(
      "(\\m.\\f.\\s.m (w (C w o ((\\f.Q) (x S)) (s ((\\p.o) (\\o.q))) (X (\\n.\\l.\\t.M (\\m.\\d.t))) ((\\v.o (\\b.O G (f V))) i (\\p.\\x.\\j.o))) C)) ((\\m.v b H ((\\o.\\w.\\s.\\a.n (\\k.t z (f C) g)) r) (u n) (\\e.n)) X)",
      "\\f1.\\s.v b H (\\w.\\s.\\a.n (\\k.t z (f C) g)) (u n) (\\e.n) (w (C w o (Q) (s (o)) (X (\\n.\\l.\\t.M (\\m.\\d.t))) (o (\\b.O G (f1 V)) (\\p.\\x.\\j.o))) C)"
    );
  }

  @Test
  public final void test83() {
    reducesTo(
      "\\c.(\\q.\\f.t (Z (\\y.\\y.\\h.k)) z (\\b.(\\h.(\\e.B) (\\l.g)) (c (\\z.d)) (n (\\q.\\d.e C)) (\\t.j ((\\i.g) (M O)) (\\l.P (y y (\\r.b))))) g) (m f) (q (X T) (\\k.(\\f.H (a Z (f g) (w E (K s)) (\\w.\\y.u c a ((\\q.r) (\\l.c))))) (\\x.(\\w.\\s.(\\w.f) C ((\\c.\\x.h D) G)) r)) ((\\r.K) (\\z.\\g.\\t.\\o.I n))) Q",
      "\\c.t (Z (\\y.\\y.\\h.k)) z (\\b.B (n (\\q.\\d.e C)) (\\t.j (g) (\\l.P (y y (\\r.b))))) g Q"
    );
  }

  @Test
  public final void test84() {
    reducesTo(
      "\\u.e",
      "\\u.e"
    );
  }

  @Test
  public final void test85() {
    reducesTo(
      "q ((\\p.(\\k.(\\r.\\p.v n (d h) (\\e.S i)) (k l (b D) (C (\\a.d)))) (\\l.\\a.(\\q.x) (\\i.\\e.e x (D I) (\\v.m f)))) ((\\n.\\y.Q (\\w.h (\\x.I v))) R) (b (\\m.\\f.(\\a.\\w.\\x.k) (\\a.I g (N g)) (\\l.(\\g.t) (\\e.F) ((\\l.d) (\\y.D)))) (\\j.(\\j.E) R)) (u x) (\\s.(\\b.(\\n.\\u.(\\o.q j (A k)) (\\m.\\h.\\h.P) (\\v.B)) (\\l.\\o.y (\\i.(\\h.P) (p b) (\\x.\\y.O))) O (\\f.(\\f.\\o.a) ((\\v.O) (F t)) ((\\j.m) (t r) (f q)) d ((\\j.\\t.(\\a.\\k.i r) (\\z.\\n.\\n.i) (\\m.(\\r.g h) (\\v.\\v.i))) ((\\a.\\g.(\\b.K o) (\\k.z v)) W)))) (\\s.(\\q.E) ((\\l.\\d.\\h.H n) (h v (M (\\u.(\\b.i v) q)))))))",
      "q (v n (d h) (\\e.S i) (u x) (\\s.q j (A k) (\\v.B) (\\f.a d (\\t.i r))))"
    );
  }

  @Test
  public final void test86() {
    reducesTo(
      "\\g.\\h.\\w.\\u.u",
      "\\g.\\h.\\w.\\u.u"
    );
  }

  @Test
  public final void test87() {
    reducesTo(
      "\\r.f (O (\\f.g ((\\m.\\p.P l) Q) (\\f.(\\u.H j (\\c.d)) (\\f.\\q.q D) z) ((\\y.B) (\\l.x t (\\r.c) ((\\y.a) (g b))) n) j) (a (\\n.(\\i.f) ((\\l.x) ((\\e.e) ((\\l.x) o)) r)) G))",
      "\\r.f (O (\\f.g (\\p.P l) (\\f.H j (\\c.d) z) (B n) j) (a (\\n.f) G))"
    );
  }

  @Test
  public final void test88() {
    reducesTo(
      "\\m.J V",
      "\\m.J V"
    );
  }

  @Test
  public final void test89() {
    reducesTo(
      "\\o.K",
      "\\o.K"
    );
  }

  @Test
  public final void test90() {
    reducesTo(
      "(\\a.\\w.\\k.\\z.(\\p.(\\i.(\\x.(\\i.\\f.\\y.\\h.(\\l.l) r) ((\\g.l) (s y) (\\c.B t U))) r) ((\\f.(\\q.(\\x.J) (\\k.m)) (e H G)) f ((\\v.S) ((\\y.e) q))) (\\o.(\\m.\\c.\\z.\\u.(\\u.N) y (\\z.(\\k.\\z.i) (\\r.H))) (\\p.O))) (\\e.\\c.A)) (\\e.\\b.(\\c.\\g.(\\e.\\q.\\b.\\r.\\j.\\z.u) (\\d.\\z.C) ((\\y.(\\s.L (\\k.N)) (s i (o c))) (\\w.(\\x.h) V) (\\u.(\\s.\\r.\\m.(\\x.\\o.T) u) (i r m)) ((\\r.\\z.I) (\\y.S (J v) N) (\\g.(\\u.\\j.\\i.x) (f j f (\\h.N)))))) ((\\n.W) (\\u.(\\k.\\g.\\q.\\r.\\b.\\o.\\p.\\s.(\\u.(\\d.\\m.B) ((\\v.g) (M s))) z k) z))) ((\\k.\\o.x (\\a.(\\w.\\r.I) (\\u.m))) (\\e.(\\h.(\\l.X) p ((\\v.\\v.\\f.\\x.q) ((\\i.\\o.(\\a.\\u.I) (\\s.\\n.X)) ((\\d.H) (\\a.t) (F o (F u))) (\\y.S)))) z))",
      "\\k.\\z.\\y.\\h.r"
    );
  }

  @Test
  public final void test91() {
    reducesTo(
      "(\\s.S (t ((\\l.(\\e.(\\d.\\r.h V (\\r.v) r) (\\h.\\k.h)) (k n)) (\\y.\\y.Y)) k)) (u (\\j.\\g.\\t.(\\y.(\\n.(\\i.\\x.w) n (\\q.(\\f.\\a.x v) (L s (\\r.q)) (\\r.n (\\c.D o)))) (\\q.i)) j j))",
      "S (t (\\r.h V (\\r.v) r) k)"
    );
  }

  @Test
  public final void test92() {
    reducesTo(
      "\\i.b",
      "\\i.b"
    );
  }

  @Test
  public final void test93() {
    reducesTo(
      "\\b.f",
      "\\b.f"
    );
  }

  @Test
  public final void test94() {
    reducesTo(
      "\\a.(\\v.u) (b (w U))",
      "\\a.u"
    );
  }

  @Test
  public final void test95() {
    reducesTo(
      "\\m.\\r.\\v.N ((\\n.\\h.\\w.\\r.(\\d.\\m.f (\\j.\\a.\\d.c)) (m (t (D L)) ((\\m.\\f.\\j.z) C))) (\\v.\\s.\\e.(\\h.w) a ((\\a.I O c (\\k.l)) (O (\\d.\\k.\\k.z))))) L ((\\l.(\\u.\\h.n) ((\\y.(\\l.l T S h) (\\p.v)) (\\s.i)) (\\j.B)) (Z (\\q.\\p.(\\t.\\j.\\f.(\\s.(\\v.I) (\\i.\\x.(\\m.e) (\\k.V) (\\d.\\y.O))) (h s g ((\\n.B) (\\v.w)) v)) ((\\c.e (\\s.z)) (\\k.\\b.\\l.\\g.F) (\\j.\\u.M))))) (\\c.u)",
      "\\m.\\r.\\v.N (\\h.\\w.\\r.\\m.f (\\j.\\a.\\d.c)) L (n) (\\c.u)"
    );
  }

  @Test
  public final void test96() {
    reducesTo(
      "\\a.s ((\\c.E) (\\i.v))",
      "\\a.s (E)"
    );
  }

  @Test
  public final void test97() {
    reducesTo(
      "(\\f.c) ((\\c.S (l h) (\\y.(\\m.(\\w.v a) (D x (\\i.g)) (Z (\\b.\\k.l y))) b m g)) P)",
      "c"
    );
  }

  @Test
  public final void test98() {
    reducesTo(
      "\\v.\\k.\\w.p G ((\\m.\\s.s) ((\\j.\\w.b) W i))",
      "\\v.\\k.\\w.p G (\\s.s)"
    );
  }

  @Test
  public final void test99() {
    reducesTo(
      "d ((\\l.V) v)",
      "d (V)"
    );
  }

  @Test
  public final void test100() {
    reducesTo(
      "(\\o.\\j.m) ((\\c.\\l.(\\e.\\k.(\\d.z) (\\b.A) z) (\\g.(\\n.\\v.o) (\\u.\\p.I)) (m H)) K (\\q.\\i.(\\w.(\\h.(\\r.\\k.(\\w.n (\\n.T) ((\\t.x) (e Y))) B) ((\\r.T) ((\\k.\\x.\\x.s) J))) (\\t.\\b.(\\y.v t) v)) ((\\f.m) ((\\c.(\\a.r P (v m)) (\\y.\\u.x)) (h (r M) (\\s.\\w.t))) h) (\\o.e)))",
      "\\j.m"
    );
  }

  @Test
  public final void test101() {
    reducesTo(
      "\\e.A",
      "\\e.A"
    );
  }

  @Test
  public final void test102() {
    reducesTo(
      "\\f.\\e.\\z.\\s.\\e.l",
      "\\f.\\e.\\z.\\s.\\e.l"
    );
  }

  @Test
  public final void test103() {
    reducesTo(
      "(\\t.z (\\j.(\\q.\\f.\\l.\\k.t (l o)) (f G (m J) (\\s.(\\o.x) (e a)) (\\p.\\b.d) (\\u.(\\c.\\t.C) (\\z.\\v.\\a.s) T))) ((\\n.Q ((\\b.T) (\\x.R)) (\\v.c (\\b.F (e j) (\\s.(\\n.B) (\\s.b))))) (\\j.t) (\\p.\\h.o (\\c.I))) x) (\\a.(\\y.\\p.Y) (\\v.(\\x.(\\d.(\\u.e) g) k l) (T (w y (f x) (\\y.\\p.H g))) (\\s.\\d.s) (\\o.S)) (\\p.\\y.q (\\k.\\o.K)))",
      "z (\\j.\\f2.\\l3.\\k4.Y) (Q (T) (\\v.c (\\b.F (e j) (\\s.B))) (\\p.\\h.o (\\c.I))) x"
    );
  }

  @Test
  public final void test104() {
    reducesTo(
      "\\n.t",
      "\\n.t"
    );
  }

  @Test
  public final void test105() {
    reducesTo(
      "\\d.j (p (\\n.d (\\g.s (\\w.\\m.E))))",
      "\\d.j (p (\\n.d (\\g.s (\\w.\\m.E))))"
    );
  }

  @Test
  public final void test106() {
    reducesTo(
      "\\f.k",
      "\\f.k"
    );
  }

  @Test
  public final void test107() {
    reducesTo(
      "(\\l.\\k.O) (\\h.h ((\\i.a (\\p.\\e.r R (\\y.m) (\\d.\\l.r) c)) (\\b.\\w.(\\j.(\\c.\\w.D) (\\b.(\\r.N) (\\w.K))) W ((\\n.(\\t.O) ((\\v.e) (v c))) (\\y.\\j.s)))) y ((\\e.\\x.n (\\u.(\\x.\\u.r) (\\h.\\u.z))) (\\v.v ((\\o.v) (\\z.N)) (m (\\g.\\n.e X)) w ((\\m.(\\i.(\\f.C) (I a) (\\l.t)) d) (S (m h) (\\b.z t x) A)) ((\\a.\\x.\\s.K) (\\r.\\s.(\\v.l) ((\\l.k) (\\b.v)) (\\r.(\\m.f Q) R)) y))))",
      "\\k.O"
    );
  }

  @Test
  public final void test108() {
    reducesTo(
      "\\a.\\r.f",
      "\\a.\\r.f"
    );
  }

  @Test
  public final void test109() {
    reducesTo(
      "\\n.h (p (F (h (j ((\\k.(\\x.x) (\\s.q)) (\\n.(\\d.M) (l L)))) (Q (p ((\\z.f) (W d)) (a D (\\w.b) (\\f.\\e.k S))))) (g ((\\a.k) U))))",
      "\\n.h (p (F (h (j (\\s.q)) (Q (p (f) (a D (\\w.b) (\\f.\\e.k S))))) (g (k))))"
    );
  }

  @Test
  public final void test110() {
    reducesTo(
      "(\\f.(\\p.y) ((\\c.P (\\g.h b (\\i.Y))) (\\e.K p) (\\c.h) ((\\t.\\f.(\\g.Y (\\t.\\s.n)) (\\e.\\i.\\k.E N u)) ((\\j.V) (c x) l u)) (w M))) U h",
      "y h"
    );
  }

  @Test
  public final void test111() {
    reducesTo(
      "(\\c.\\l.(\\t.O) ((\\v.v) b)) (\\i.e (\\i.T))",
      "\\l.O"
    );
  }

  @Test
  public final void test112() {
    reducesTo(
      "v s s",
      "v s s"
    );
  }

  @Test
  public final void test113() {
    reducesTo(
      "\\b.o",
      "\\b.o"
    );
  }

  @Test
  public final void test114() {
    reducesTo(
      "\\e.\\c.(\\k.q) (\\p.u) (\\e.(\\n.q) n Y b ((\\r.j) (\\a.(\\d.u) ((\\l.\\t.\\w.\\n.a) (\\y.E)))))",
      "\\e.\\c.q (\\e.q Y b (j))"
    );
  }

  @Test
  public final void test115() {
    reducesTo(
      "\\g.f",
      "\\g.f"
    );
  }

  @Test
  public final void test116() {
    reducesTo(
      "\\k.\\f.\\q.\\h.\\i.\\h.Q",
      "\\k.\\f.\\q.\\h.\\i.\\h.Q"
    );
  }

  @Test
  public final void test117() {
    reducesTo(
      "(\\h.x) i",
      "x"
    );
  }

  @Test
  public final void test118() {
    reducesTo(
      "(\\k.l) (\\l.\\h.j)",
      "l"
    );
  }

  @Test
  public final void test119() {
    reducesTo(
      "\\a.Y (\\y.j V)",
      "\\a.Y (\\y.j V)"
    );
  }

  @Test
  public final void test120() {
    reducesTo(
      "(\\z.f) ((\\o.j l) i)",
      "f"
    );
  }

  @Test
  public final void test121() {
    reducesTo(
      "(\\l.\\s.I) (\\w.(\\t.k) ((\\q.S ((\\s.(\\w.\\v.L) b) (b (\\c.n (\\s.u q U))) u)) r))",
      "\\s.I"
    );
  }

  @Test
  public final void test122() {
    reducesTo(
      "\\b.(\\c.\\k.\\c.(\\n.\\c.\\g.\\v.u) (\\p.(\\k.(\\r.(\\z.s) ((\\i.\\s.m K) s)) (\\t.\\o.h)) (\\v.c)) ((\\g.\\r.\\i.g) ((\\y.\\n.Y) t) (B ((\\s.\\p.\\y.c) z a))) (\\h.(\\i.N) (r (\\h.R) ((\\o.w) ((\\d.(\\v.\\g.(\\p.z C) (\\u.\\p.g)) h) (\\c.\\o.\\x.g)))))) (\\w.(\\n.\\i.T) (\\i.\\w.\\t.\\w.b (\\g.\\o.\\r.(\\e.\\d.v w e (k K j)) (Q i (\\y.j) I) ((\\r.(\\a.k) x) (\\g.(\\i.R) w) (\\c.\\u.n)))) A ((\\r.(\\z.u) (\\m.\\c.k)) (v l)))",
      "\\b.\\k.\\c.\\v.u"
    );
  }

  @Test
  public final void test123() {
    reducesTo(
      "\\f.\\p.(\\p.(\\p.v A (\\c.u)) (\\m.M) s (\\l.t)) (\\h.k) (\\j.\\j.\\o.v) (\\g.\\p.\\v.l r L (\\x.u)) (\\b.T (y (\\u.P))) (z (\\a.\\i.(\\y.g ((\\c.\\w.\\t.h) (\\t.\\o.z) B)) l) u ((\\l.\\j.\\t.\\c.F) (\\i.\\e.c)))",
      "\\f.\\p.v A (\\c.u) s (\\l.t) (\\j.\\j.\\o.v) (\\g.\\p.\\v.l r L (\\x.u)) (\\b.T (y (\\u.P))) (z (\\a.\\i.g (\\t.h)) u (\\j.\\t.\\c.F))"
    );
  }

  @Test
  public final void test124() {
    reducesTo(
      "\\q.l v",
      "\\q.l v"
    );
  }

  @Test
  public final void test125() {
    reducesTo(
      "(\\k.(\\y.\\b.(\\p.c) ((\\i.\\n.u) (\\l.(\\p.\\y.(\\x.t) w L) ((\\e.\\y.c) l) ((\\h.c (h h (n F))) ((\\j.j) (q r) (Y u))) h))) (\\z.(\\g.(\\v.\\g.\\r.C) u) (\\x.F (z (\\m.e ((\\p.M) H (\\p.\\w.N t)) (\\c.(\\s.(\\j.e) b) (q z (F p)) (\\o.\\c.\\q.l x))))))) (\\w.\\r.\\w.I)",
      "\\b.c"
    );
  }

  @Test
  public final void test126() {
    reducesTo(
      "\\a.S",
      "\\a.S"
    );
  }

  @Test
  public final void test127() {
    reducesTo(
      "\\p.\\r.(\\f.\\d.\\e.\\x.(\\r.p b Q (\\r.\\z.\\b.g) ((\\x.\\e.\\a.r) c) c (\\y.(\\f.(\\s.\\b.u) (\\l.(\\y.x p) i)) (\\j.G ((\\q.\\f.\\c.z) (\\s.s)))) (\\w.a ((\\t.W (\\d.P)) (\\i.O (\\f.Q)) g) ((\\l.\\l.\\t.m (\\r.S (k i) i)) k)) a) (\\p.(\\i.\\y.J K y) ((\\y.\\a.f l) ((\\g.\\v.(\\f.m) (\\r.D) a (\\q.(\\h.\\j.f) r)) (d (s R) (\\h.(\\v.v) a) (\\r.\\i.X s (z M) (\\h.A k))))) (\\b.j))) (u g j (\\b.k Y))",
      "\\p.\\r.\\d.\\e.\\x.p b Q (\\r.\\z.\\b.g) (\\e.\\a3.\\p.J K (\\b.j)) c (\\y.\\b.u) (\\w.a (W (\\d.P) g) (\\l.\\t.m (\\r.S (k i) i))) a"
    );
  }

  @Test
  public final void test128() {
    reducesTo(
      "\\f.\\e.o (\\s.P) ((\\b.\\d.(\\v.W n ((\\e.H ((\\p.w) (w l))) (Q w (d h) (\\k.(\\l.z) f)))) d) l) ((\\w.C) A ((\\h.(\\j.i) ((\\p.E) (\\f.I)) R (y m o)) (E ((\\k.\\k.(\\o.\\e.f) (\\l.d)) N))) ((\\y.(\\v.\\c.\\u.i) (i (i v))) (\\v.\\w.\\y.(\\i.M (\\i.F) j) v y) ((\\b.U) (\\b.\\i.\\h.\\i.(\\i.n) ((\\g.\\a.\\p.F) (R c (t M)) ((\\f.a) (H l) (\\w.o))))))) C",
      "\\f.\\e.o (\\s.P) (\\d.W n (H (w))) (C (i R (y m o)) (\\u.i)) C"
    );
  }

  @Test
  public final void test129() {
    reducesTo(
      "\\d.(\\k.X) M",
      "\\d.X"
    );
  }

  @Test
  public final void test130() {
    reducesTo(
      "\\t.r",
      "\\t.r"
    );
  }

  @Test
  public final void test131() {
    reducesTo(
      "\\k.y",
      "\\k.y"
    );
  }

  @Test
  public final void test132() {
    reducesTo(
      "(\\m.\\r.(\\t.U) ((\\d.\\c.x) ((\\b.\\w.(\\e.s (\\g.\\i.S)) (\\t.\\n.o)) (\\c.\\z.\\d.r (\\u.\\k.s)) (\\z.r)) (\\u.K (\\d.(\\d.v u) (\\t.\\q.\\e.\\h.v (B (\\y.\\w.z))) (\\o.\\r.\\j.v c))))) H",
      "\\r.U"
    );
  }

  @Test
  public final void test133() {
    reducesTo(
      "\\c.\\g.Q",
      "\\c.\\g.Q"
    );
  }

  @Test
  public final void test134() {
    reducesTo(
      "(\\u.\\v.M (\\o.m)) (\\k.\\q.\\q.\\z.\\a.(\\b.(\\b.\\g.\\f.\\e.A) (\\z.G) ((\\t.B) ((\\h.V) w) (o C (\\t.I) z)) (\\c.(\\q.(\\f.\\x.\\z.v) (\\b.\\x.v)) (c (\\v.S)) (a (\\j.p D (k z)) (\\m.v ((\\e.w) (\\y.z))))) ((\\i.(\\y.h) (\\r.\\z.\\l.\\e.\\y.\\h.C T) N) (w (\\g.a X)))) (\\z.(\\k.\\r.(\\r.N m (\\r.z) (K X (\\d.H)) a ((\\g.\\e.U) ((\\k.y x L) q))) ((\\o.\\o.g (\\j.p) H) (\\j.Z (Q s (z k))) (\\j.(\\x.n) f))) r)) A",
      "M (\\o.m)"
    );
  }

  @Test
  public final void test135() {
    reducesTo(
      "(\\q.g) (\\y.\\h.W (r ((\\r.L (\\t.c)) p) ((\\f.t (w g)) (a C (\\d.A)) (t t Q (\\y.c)))) A ((\\h.\\k.(\\n.(\\a.\\d.\\o.l) W) (\\u.I (a (\\a.N) (t l (S m))) (\\v.x))) (y n (\\c.w ((\\i.d) j)))) (\\d.\\k.f ((\\h.o) d)))",
      "g"
    );
  }

  @Test
  public final void test136() {
    reducesTo(
      "D ((\\z.g) (\\n.\\j.\\r.\\l.m) w (\\j.\\n.\\v.(\\m.n G ((\\n.\\g.\\y.(\\i.V) (\\d.d) q) D) (u (f K F ((\\f.n) g) (\\i.j J (\\j.(\\m.b) (I v)))))) H (\\a.\\c.n (\\a.(\\i.\\o.\\w.(\\v.(\\c.E) D) (b (\\i.\\y.x))) ((\\v.(\\a.K) (\\l.V A (r R))) (h p)) (g (\\u.k))))))",
      "D (g w (\\j.\\n.\\v.n G (\\g.\\y.V q) (u (f K F (n) (\\i.j J (\\j.b)))) (\\a.\\c.n (\\a.\\w.E))))"
    );
  }

  @Test
  public final void test137() {
    reducesTo(
      "\\t.e (\\x.\\p.j) (\\p.\\j.(\\e.\\z.s) (\\v.X y ((\\f.\\p.Q (\\g.z)) ((\\w.\\d.\\e.\\a.\\j.\\r.h k) r)) (\\b.\\l.\\k.(\\n.(\\s.\\d.\\b.(\\t.u) (\\n.V)) (\\y.\\e.\\l.Y s)) (\\c.(\\d.(\\h.f) (\\v.\\s.x)) ((\\h.s K J) (g (U o)))) (\\d.(\\s.k) ((\\b.d) (\\i.f))))) (\\r.\\c.x (\\t.\\m.(\\q.r (\\n.w I (P (\\z.t)))) (\\z.(\\o.a) (\\w.h v) (\\q.(\\x.\\r.G) i)) z (\\z.l h (\\t.\\w.(\\t.\\q.T (o (\\h.l))) (\\l.(\\q.\\b.n (\\r.K) x) ((\\i.e) ((\\v.t) c))))))))",
      "\\t.e (\\x.\\p.j) (\\p.\\j.s)"
    );
  }

  @Test
  public final void test138() {
    reducesTo(
      "(\\s.\\c.\\j.\\r.(\\c.R) (\\y.\\g.\\g.\\x.\\x.U) ((\\g.(\\f.(\\q.f) (\\w.e) r ((\\y.(\\g.x) (N O)) b)) (N (\\t.s U z (\\l.o s (\\e.h))))) (m (\\l.\\t.(\\b.\\q.\\k.x) (\\d.e t (A z)) ((\\j.\\o.F) K))) (\\l.(\\f.\\c.(\\s.T) (\\e.B) (r y k) (C P p (\\x.S (v q)))) ((\\j.k c) y) (\\o.(\\e.(\\n.\\f.a Y) (\\z.y)) ((\\t.\\u.\\h.q) (t U (\\m.w))) (y (\\m.E)))) (\\j.\\t.(\\r.\\f.(\\k.y) (\\q.x (C H) (\\t.L p)) N (\\i.(\\m.a (\\t.\\h.\\g.S) ((\\g.Q) (H F) X)) ((\\p.A (\\c.k)) (x (\\v.j)) J))) (\\r.Q)))) (J R)",
      "\\c.\\j.\\r.R (N (\\t.J R U z (\\l.o (J R) (\\e.h))) r (x) (\\l.T (r y k) (C P p (\\x.S (v q)))) (\\j.\\t.\\f.y N (\\i.a (\\t.\\h.\\g.S) (Q X))))"
    );
  }

  @Test
  public final void test139() {
    reducesTo(
      "\\i.(\\p.(\\i.\\q.\\m.\\h.\\a.(\\c.\\v.k) ((\\m.Y) (\\p.q))) g) (p (v ((\\k.\\j.\\w.r ((\\d.j) c) (\\z.\\f.\\z.a)) (K (\\u.C N (\\a.g)) (\\c.\\s.J)) R)) (\\f.\\f.a))",
      "\\i.\\q.\\m.\\h.\\a.\\v.k"
    );
  }

  @Test
  public final void test140() {
    reducesTo(
      "(\\n.\\i.o) (\\q.(\\s.N) ((\\d.L (l (\\i.\\u.B) (\\s.\\l.\\u.\\f.K g) (\\y.\\i.\\a.V))) ((\\z.i) Q y)))",
      "\\i.o"
    );
  }

  @Test
  public final void test141() {
    reducesTo(
      "(\\t.m) (n (\\n.(\\j.\\g.U) M) (\\c.(\\h.\\i.M) ((\\q.F) ((\\w.o t y (\\r.\\g.\\f.u)) r) (\\k.\\t.(\\m.f) P))) (s ((\\g.\\k.\\j.\\f.(\\u.E) h (\\s.\\d.(\\z.(\\x.h) (\\f.u) ((\\m.r) (\\o.H))) (y (\\c.n) (\\i.z l (\\t.K)))) G) (j (\\h.(\\x.\\x.\\y.S) (\\k.\\r.(\\v.w L) g)) (\\a.\\p.(\\x.n (\\a.v) (\\j.F w (\\z.w))) v C)))))",
      "m"
    );
  }

  @Test
  public final void test142() {
    reducesTo(
      "\\j.\\a.(\\y.e) (\\x.w) s",
      "\\j.\\a.e s"
    );
  }

  @Test
  public final void test143() {
    reducesTo(
      "\\b.u",
      "\\b.u"
    );
  }

  @Test
  public final void test144() {
    reducesTo(
      "\\n.\\x.(\\f.c) (L (h (g N C) K f ((\\m.\\y.\\f.\\u.(\\m.l) X (\\m.k E) (\\n.(\\x.Q) ((\\h.i) (\\k.I)))) (j R G ((\\g.T) M) m)) z (\\k.(\\m.\\x.\\n.(\\u.Y) r (\\t.d)) (\\w.y n u))))",
      "\\n.\\x.c"
    );
  }

  @Test
  public final void test145() {
    reducesTo(
      "\\h.(\\d.(\\w.\\i.\\u.Y (\\v.\\v.R)) (Z (w g) g (\\y.(\\q.y h) (d (\\y.\\z.(\\m.K I) (b g (m K)))) ((\\y.\\i.\\s.z) t (\\c.X) ((\\r.\\n.c y) ((\\t.V) (m l)) U))) (\\o.(\\r.\\j.S ((\\k.T (h a)) q) (\\s.(\\v.Z (\\e.y x)) (\\z.I b)) (\\n.(\\y.z (\\r.o (\\v.i)) ((\\a.v) u u)) n)) ((\\j.d) (\\m.Q (\\h.R)))))) (e i ((\\p.(\\k.t) ((\\z.\\g.l) T)) ((\\z.(\\j.O) X) (\\y.\\s.\\i.\\s.\\y.Z (\\j.A Z a ((\\g.i) (y l))) (D ((\\n.o) (\\v.o)) ((\\l.C) (\\z.m) ((\\z.k) (Q j))))) (\\q.(\\g.H (e (z Q) (n (\\w.E)))) (N (\\s.l v (B z) (\\w.G))) ((\\u.X (n (\\b.S))) ((\\l.u) (\\d.s) ((\\k.X) o)) (\\v.(\\m.\\k.(\\h.r) c ((\\j.q) s)) H))))))",
      "\\h.\\i.\\u.Y (\\v.\\v.R)"
    );
  }

  @Test
  public final void test146() {
    reducesTo(
      "h ((\\t.\\p.W w (c (\\n.(\\v.s a i) (m (\\z.w)))) (t (\\l.(\\q.h P (V V)) (l F (m w))) (\\h.v)) (\\o.(\\l.n (\\b.b)) (Y k))) ((\\k.f (\\x.O) D) (\\b.m) ((\\i.(\\z.W K F) ((\\e.k) (\\f.a)) u ((\\l.(\\x.O) r ((\\y.u) g)) (\\y.\\v.(\\u.g) c w))) ((\\u.\\l.\\m.\\t.\\x.\\x.e T) ((\\f.m) (s L) q) (\\x.\\h.\\i.N))))) l",
      "h (\\p.W w (c (\\n.s a i)) (f (\\x.O) D (W K F u (O (u))) (\\l.h P (V V)) (\\h.v)) (\\o.n (\\b.b))) l"
    );
  }

  @Test
  public final void test147() {
    reducesTo(
      "x (s ((\\l.\\j.(\\y.\\c.g) (\\j.i (\\k.\\w.c) ((\\q.\\u.a) h))) (\\i.\\t.(\\c.A (\\i.\\q.b) P) (\\t.j) q)) (\\u.w))",
      "x (s (\\j.\\c.g) (\\u.w))"
    );
  }

  @Test
  public final void test148() {
    reducesTo(
      "(\\u.F (\\w.y)) (m ((\\w.\\m.\\j.\\x.\\r.\\h.(\\w.\\v.J) (r x (\\x.s) (d (\\g.l)) (\\h.Y) ((\\x.\\w.h) ((\\q.K) (a Z) (\\o.e (x f)))))) (\\u.s ((\\b.H) (\\b.\\d.c)) (\\c.\\t.W)) ((\\k.(\\f.\\c.\\c.y) ((\\t.a) (g S)) u) (\\f.\\k.h (\\v.n (\\j.\\a.w))) (\\o.\\u.\\e.\\a.j K) ((\\u.(\\c.\\y.\\z.(\\m.\\d.r) (\\h.u) ((\\b.d) s (\\o.v))) (\\d.k n)) c))))",
      "F (\\w.y)"
    );
  }

  @Test
  public final void test149() {
    reducesTo(
      "\\k.t",
      "\\k.t"
    );
  }

  @Test
  public final void test150() {
    reducesTo(
      "\\b.\\y.N",
      "\\b.\\y.N"
    );
  }

  @Test
  public final void test151() {
    reducesTo(
      "(\\k.\\v.\\r.(\\u.\\r.\\k.(\\u.s) ((\\y.(\\p.\\z.w) (\\h.b ((\\k.x z N) (\\o.\\b.\\g.o)))) u)) z) ((\\o.V) (\\b.\\x.a) (\\o.(\\p.H G t) (\\w.P) (\\f.\\y.\\c.n H)) k (\\w.\\s.(\\c.b) (\\m.(\\q.x) ((\\e.(\\a.\\v.\\u.P) (\\n.\\q.s e)) (\\p.\\x.\\c.(\\j.W) w)))) (\\q.\\r.(\\n.\\j.\\z.v (\\x.h) H (\\i.\\o.(\\p.(\\d.n) (e h) (s M (\\b.h))) ((\\p.Q) (h s) (\\j.(\\g.l) (\\g.u))) (\\x.\\o.(\\f.u) ((\\a.\\m.p) (\\y.t X))))) o)) (\\h.U g)",
      "\\r.\\r.\\k.s"
    );
  }

  @Test
  public final void test152() {
    reducesTo(
      "e ((\\x.\\t.\\z.\\g.J) r)",
      "e (\\t.\\z.\\g.J)"
    );
  }

  @Test
  public final void test153() {
    reducesTo(
      "\\b.r",
      "\\b.r"
    );
  }

  @Test
  public final void test154() {
    reducesTo(
      "(\\z.X L (s a) (V h) (\\i.k C (\\s.(\\r.o) (v W))) (\\x.\\v.Z r (\\r.j) (e H (\\g.i)) (V (T e (V l))))) (l b (\\f.I x)) u (\\v.\\w.\\c.(\\r.\\i.z v) (K j (\\b.m)) ((\\w.h) (\\z.k) f) (\\u.(\\z.N) (\\l.i) d ((\\j.(\\k.k) (\\n.p)) ((\\k.R) p))) (n (\\z.d) (\\n.(\\p.z) (\\w.o (V p) t))) k) ((\\m.\\t.(\\j.\\w.\\b.\\i.G ((\\e.\\h.(\\l.U p) (\\w.t L)) (H S (\\a.u) (\\l.N r h))) m) (\\z.\\l.L a)) (\\y.h)) (v q)",
      "X L (s a) (V h) (\\i.k C (\\s.o)) (\\x.\\v.Z r (\\r.j) (e H (\\g.i)) (V (T e (V l)))) u (\\v.\\w.\\c.z v (\\u.N d (\\n.p)) (n (\\z.d) (\\n.z)) k) (\\t.\\w.\\b.\\i.G (\\h.U p) (\\y.h)) (v q)"
    );
  }

  @Test
  public final void test155() {
    reducesTo(
      "(\\y.z) (\\s.R) (\\o.x) w",
      "z (\\o.x) w"
    );
  }

  @Test
  public final void test156() {
    reducesTo(
      "(\\p.(\\g.(\\f.u) ((\\b.\\f.\\o.\\m.\\r.(\\b.u q) (\\s.M) (\\i.\\t.n)) o)) (d (T (\\t.\\e.p))) ((\\x.\\r.\\a.r d (\\e.v) (\\f.t)) (\\k.h) (A (\\b.(\\i.r e O) z)) (h ((\\x.b c (\\v.e)) v W)) (\\f.b)) (\\q.t (F y ((\\f.l) (\\u.a p r (\\w.n))) (Y (\\f.(\\d.(\\l.e) f (\\y.c)) (\\s.\\o.o b (a D (t r))))) (\\j.i)))) ((\\z.(\\w.\\r.(\\c.z) (\\v.P I (p H)) (\\l.\\e.(\\i.p) (P f) (u r)) (\\m.i ((\\o.(\\b.c) (\\b.d)) (\\m.X))) (\\u.(\\x.\\m.\\m.S (X l (s P)) (v q)) ((\\c.(\\j.\\r.o) (d j u)) (q (\\l.t y t)))) ((\\i.p) (V r) (\\b.j) (\\e.(\\a.y) (\\c.J) (\\r.g Q (W x))) (\\k.g) ((\\b.\\e.(\\j.\\t.\\z.\\x.\\y.\\s.t) (\\x.K)) (\\a.z)))) ((\\x.\\f.\\m.a t) (\\n.l) (\\b.(\\e.t) (c M) (q r (x C)) o ((\\v.\\n.h s (\\o.t) (F r (Y C))) ((\\n.\\l.j D) s))) (\\e.(\\n.\\x.l) (\\c.(\\z.(\\l.G) (\\r.U)) (\\n.\\u.\\y.\\s.o))))) (\\q.w))",
      "u (A (\\b.r e O) d (\\e.v) (\\f.t) (\\f.b)) (\\q2.t (F y (l) (Y (\\f.e (\\y.c))) (\\j.i)))"
    );
  }

  @Test
  public final void test157() {
    reducesTo(
      "\\y.h",
      "\\y.h"
    );
  }

  @Test
  public final void test158() {
    reducesTo(
      "\\c.\\c.\\s.\\x.\\y.\\h.\\i.(\\c.l) (\\s.(\\l.L) u)",
      "\\c.\\c.\\s.\\x.\\y.\\h.\\i.l"
    );
  }

  @Test
  public final void test159() {
    reducesTo(
      "(\\u.(\\l.\\j.p F) m) ((\\x.U r (\\h.\\a.(\\c.b) X (z S (\\c.V)) l ((\\s.\\z.(\\d.o) (\\k.G) ((\\r.l) (\\g.X))) ((\\l.d) (k L) (r J (\\w.M))))) (\\d.\\h.(\\s.(\\s.(\\l.r (\\c.V)) n) U w) (j O)) ((\\k.(\\s.(\\r.\\q.\\x.(\\s.(\\v.\\p.D) (m a g)) ((\\c.d) (\\z.y) (\\f.J d))) (\\c.y)) ((\\h.o ((\\q.s) (\\p.(\\i.a) l))) ((\\c.Y) (\\u.\\n.y) (\\q.\\w.\\z.\\s.T)))) (l x))) (\\a.\\b.i))",
      "\\j.p F"
    );
  }

  @Test
  public final void test160() {
    reducesTo(
      "\\k.(\\s.\\n.W (\\q.w (G (\\y.\\q.C y) ((\\w.j) (A s) n) (\\h.(\\b.r) s (\\z.z) i))) (\\f.(\\i.a (\\j.X)) k (\\c.\\q.(\\t.\\s.\\w.j) (\\f.\\u.e) (k R (\\h.w) (p U (\\d.d)) (i S (y c) a))) (\\c.(\\u.(\\h.\\e.\\b.\\r.g) l) (h (p ((\\g.U) (d p) (z (\\e.b)))))))) (\\k.U ((\\t.d) ((\\j.\\d.\\e.r) (U b q)) (s ((\\i.\\m.b) (c y (f w)))) c ((\\c.\\k.W) J))) (\\d.\\j.(\\d.(\\s.K) t V (\\y.\\u.(\\j.q ((\\m.\\q.\\i.S) (\\l.s))) b) N (\\e.c (\\k.S))) (f (\\j.(\\o.(\\a.j ((\\h.B) v)) (\\a.h) m ((\\m.\\f.f) ((\\l.\\s.\\e.Q) (\\c.O)))) (\\t.\\e.m J))))",
      "\\k.W (\\q1.w (G (\\y.\\q.C y) (j (\\d.\\j.K V (\\y.\\u.q (\\q.\\i.S)) N (\\e.c (\\k.S)))) (\\h.r (\\z.z) i))) (\\f.a (\\j.X) (\\c.\\q.\\w.j) (\\c.\\e.\\b.\\r.g))"
    );
  }

  @Test
  public final void test161() {
    reducesTo(
      "(\\q.(\\o.\\t.(\\e.(\\t.t (c L (r b)) j (\\f.\\v.\\t.(\\f.(\\m.\\a.E) Y) ((\\t.E f) (l D (j u))))) (f ((\\q.(\\c.j c (J D)) (j T)) (\\e.\\i.i)))) ((\\h.\\q.V) ((\\x.q) e))) (\\q.\\q.r)) (\\f.(\\y.\\q.\\t.(\\v.\\t.\\q.\\h.(\\i.w l (\\j.F)) (q o (O f)) (\\q.(\\a.B) (\\r.m w)) (\\b.b)) ((\\u.B j) (S (C A i)) (\\k.j))) ((\\h.v o (\\o.h)) (\\m.\\j.\\n.n) ((\\c.b S (y Y)) G) (r (\\t.\\d.p (m q) (p (v R)))) ((\\y.(\\u.Z) (F g) (w V)) r ((\\x.Z (w X (\\v.c))) u))) (\\h.F)) ((\\j.j) ((\\p.a (\\h.K)) (N (N V (\\z.b) (t G L)))) (\\c.\\d.(\\o.\\c.f (c (\\d.y) (p W (c X)) (W (I t e)))) ((\\k.\\p.(\\z.\\f.V) (\\y.z o)) k w)) a E)",
      "f (j (j T) (J D)) (c L (r b)) j (\\f.\\v.\\t.\\a.E)"
    );
  }

  @Test
  public final void test162() {
    reducesTo(
      "\\c.x f",
      "\\c.x f"
    );
  }

  @Test
  public final void test163() {
    reducesTo(
      "(\\f.\\q.o (\\i.\\b.(\\m.z C) (\\g.h)) (\\x.\\w.M)) ((\\w.(\\a.(\\y.(\\c.(\\x.O) o ((\\v.k) (Q R))) Y ((\\f.j z o) (x r) (i q)) (n (\\r.h))) f) (\\v.\\h.\\y.v)) ((\\i.a ((\\u.\\m.q A) (\\c.(\\z.w) (\\w.Q)) (k Z (G n) (u s (\\j.X))) (g (\\m.b)))) (r (\\f.(\\m.q) (\\h.Q (\\p.l)))) (\\p.Z)))",
      "\\q.o (\\i.\\b.z C) (\\x.\\w.M)"
    );
  }

  @Test
  public final void test164() {
    reducesTo(
      "(\\l.\\g.(\\i.\\j.\\q.d (D f)) x) e",
      "\\g.\\j.\\q.d (D f)"
    );
  }

  @Test
  public final void test165() {
    reducesTo(
      "\\b.X",
      "\\b.X"
    );
  }

  @Test
  public final void test166() {
    reducesTo(
      "n (\\k.\\u.\\o.S) s (\\u.d) ((\\b.A) (\\v.e)) (\\s.\\d.N)",
      "n (\\k.\\u.\\o.S) s (\\u.d) (A) (\\s.\\d.N)"
    );
  }

  @Test
  public final void test167() {
    reducesTo(
      "\\u.z",
      "\\u.z"
    );
  }

  @Test
  public final void test168() {
    reducesTo(
      "\\y.R (z (\\x.f)) (b (\\m.\\h.x))",
      "\\y.R (z (\\x.f)) (b (\\m.\\h.x))"
    );
  }

  @Test
  public final void test169() {
    reducesTo(
      "\\v.(\\m.D) D",
      "\\v.D"
    );
  }

  @Test
  public final void test170() {
    reducesTo(
      "(\\b.\\y.o d (\\t.(\\o.b (\\t.q ((\\j.z) (f y) (e d (\\x.u))) ((\\y.k P (\\u.x)) q (\\k.(\\a.\\r.\\b.D) (\\p.f))) (d (\\o.\\j.(\\w.\\i.\\a.D) ((\\p.Y) J) P)))) (\\f.S s (\\h.a) (\\w.(\\w.e) g)))) m",
      "\\y.o d (\\t.m (\\t.q (z (e d (\\x.u))) (k P (\\u.x) (\\k.\\r.\\b.D)) (d (\\o.\\j.\\a.D))))"
    );
  }

  @Test
  public final void test171() {
    reducesTo(
      "\\r.(\\r.\\i.a) (\\x.\\h.(\\u.d) ((\\j.\\e.\\x.(\\q.Y) (\\u.v)) W) (m (\\d.\\g.\\m.n R)) (\\y.s))",
      "\\r.\\i.a"
    );
  }

  @Test
  public final void test172() {
    reducesTo(
      "\\c.(\\v.a) b",
      "\\c.a"
    );
  }

  @Test
  public final void test173() {
    reducesTo(
      "x (\\m.\\c.j) d",
      "x (\\m.\\c.j) d"
    );
  }

  @Test
  public final void test174() {
    reducesTo(
      "(\\w.v ((\\n.\\s.\\v.\\o.d) ((\\y.D Y (\\f.n) (\\n.E)) (\\w.(\\r.\\a.\\j.f) (S E (v m)))))) O (\\o.(\\i.(\\x.p) (\\o.(\\k.T) g (\\b.\\x.\\l.g ((\\u.m) (\\o.W))))) ((\\p.\\m.\\o.c) (\\v.B)) (h r)) (\\c.M (p (\\m.p))) ((\\m.\\a.a (\\n.\\g.f)) (\\q.(\\j.(\\q.d) (d R)) O) (\\l.N) I ((\\y.P ((\\d.b) ((\\i.\\l.\\l.K) ((\\b.i) (\\l.v))))) ((\\x.(\\p.\\o.p) (b n (T E))) ((\\u.(\\l.i) k) s) (\\g.\\e.(\\a.\\u.y) (\\v.\\x.(\\h.b) t)))) (\\r.Z) ((\\y.\\x.\\m.(\\g.p (\\f.(\\q.n v) (\\x.b) (W (X i) (\\b.\\w.f G)))) (\\k.K (z (\\g.n))) g) u))",
      "v (\\s.\\v.\\o.d) (\\o.p (h r)) (\\c.M (p (\\m.p))) (N I (P (b)) (\\r.Z) (\\x.\\m.p (\\f.n v (W (X i) (\\b.\\w.f G))) g))"
    );
  }

  @Test
  public final void test175() {
    reducesTo(
      "u ((\\a.i) (\\f.\\w.w) o ((\\u.T) (k (T ((\\m.n) (\\u.s)) (\\v.D)) (E (\\j.(\\z.\\u.\\l.a) (\\u.\\a.K) (l w (N i) (\\y.\\n.\\w.X)))) G)))",
      "u (i o (T))"
    );
  }

  @Test
  public final void test176() {
    reducesTo(
      "(\\c.i) (\\o.\\h.n (\\t.B ((\\u.\\b.\\j.h) ((\\i.x) ((\\o.T) (\\h.H)))) (\\p.w ((\\h.e) ((\\u.\\q.j x) x))) (\\m.(\\h.\\w.o) (c (\\y.\\h.\\o.p)) p (\\v.(\\i.\\g.Q) (\\f.V) (\\e.z ((\\e.m) (T e)) (\\p.\\g.e))))) (\\k.\\y.p (f (E w (\\c.J) Z (\\d.(\\t.Y) Z (\\s.H)) (\\k.(\\h.r (\\s.p)) (i q r) (f (b A (\\m.w)))))) (\\s.\\s.(\\k.J) (\\k.\\s.\\n.E) (\\a.(\\c.A (\\b.V) (\\s.w a (\\w.t) B)) ((\\a.F q (\\j.e)) N (\\n.(\\l.Y) (\\f.\\h.U V))) (\\g.b l (\\h.\\p.n (\\w.h j)))))))",
      "i"
    );
  }

  @Test
  public final void test177() {
    reducesTo(
      "h ((\\m.\\s.\\t.q) Z) (\\v.D (C (v B) M) (f x (d x) k ((\\q.i) (p g) (\\k.K k)))) (\\g.\\d.\\z.\\t.j (g t (S l) z ((\\y.n (\\c.e)) (c (n H))) (x i))) (\\q.\\n.c (\\i.\\d.N)) (\\t.l) (o (\\j.(\\y.h ((\\c.y) (o c) (w Z (g q)) ((\\a.\\e.\\h.q) X)) Y) (\\d.W)) (\\j.\\j.\\b.K (\\n.\\w.k p)))",
      "h (\\s.\\t.q) (\\v.D (C (v B) M) (f x (d x) k (i (\\k.K k)))) (\\g.\\d.\\z.\\t.j (g t (S l) z (n (\\c.e)) (x i))) (\\q.\\n.c (\\i.\\d.N)) (\\t.l) (o (\\j.h (W (\\e.\\h.q)) Y) (\\j.\\j.\\b.K (\\n.\\w.k p)))"
    );
  }

  @Test
  public final void test178() {
    reducesTo(
      "\\e.(\\v.y) (\\a.S (\\e.a n (\\a.l) (i Q (\\r.r)) (f (o J) (\\u.\\m.M C)) (\\s.G (i (r r (h T)))) ((\\y.(\\m.(\\k.\\k.x R) ((\\r.L) (R A))) (e ((\\k.u) (\\c.n)))) n)) f) (h ((\\v.m (\\g.(\\w.u) (k y) z) (d (\\x.X) (\\d.\\m.\\f.\\h.u)) (W (o (\\l.\\m.U))) (i (d x r (\\v.h) ((\\p.k) (\\m.Y) (\\v.(\\k.s) X)) (\\h.\\s.Z)))) b))",
      "\\e.y (h (m (\\g.u z) (d (\\x.X) (\\d.\\m.\\f.\\h.u)) (W (o (\\l.\\m.U))) (i (d x r (\\v.h) (k (\\v.s)) (\\h.\\s.Z)))))"
    );
  }

  @Test
  public final void test179() {
    reducesTo(
      "(\\q.(\\r.\\p.W) (\\x.q)) (\\q.A (\\m.\\b.\\y.p W) e) (l (\\i.\\v.z) ((\\p.\\a.(\\f.(\\q.A (\\t.\\r.T)) (\\i.y u) ((\\m.\\f.j Y) n (\\t.Y h r ((\\a.V) w))) (\\r.\\c.\\b.b)) (H (W f))) (\\e.(\\k.\\d.\\k.(\\x.\\y.Z) (\\r.\\z.\\v.(\\z.M) (\\g.I S)) O) y (\\g.(\\t.(\\y.\\a.x) (\\q.\\o.(\\x.o p) (\\u.d R))) (\\x.(\\u.k) (\\q.B (\\j.Z) (\\l.\\i.\\o.K))) p))))",
      "W"
    );
  }

  @Test
  public final void test180() {
    reducesTo(
      "\\v.m ((\\p.f) (\\e.s) (\\t.k) (\\b.\\m.\\d.s t) K F (\\n.K)) (\\f.p) (\\m.q)",
      "\\v.m (f (\\t.k) (\\b.\\m.\\d.s t) K F (\\n.K)) (\\f.p) (\\m.q)"
    );
  }

  @Test
  public final void test181() {
    reducesTo(
      "b (\\i.\\y.c)",
      "b (\\i.\\y.c)"
    );
  }

  @Test
  public final void test182() {
    reducesTo(
      "\\j.\\d.\\p.H",
      "\\j.\\d.\\p.H"
    );
  }

  @Test
  public final void test183() {
    reducesTo(
      "(\\r.b (\\j.(\\r.Q) g ((\\x.q) ((\\q.w) (\\b.\\t.y a))) (\\h.\\n.\\b.Q (d K (r v) d) (\\s.e)))) (s ((\\j.e) O (\\j.T t k) (\\z.\\b.(\\b.l) (\\a.M) (\\s.a d))) (\\o.n) (\\b.(\\b.e) l)) (\\o.f (S ((\\o.i) (\\v.\\k.g) N (\\o.(\\i.S) p ((\\v.z) w) (Z (\\t.\\m.q K)))) (\\y.s ((\\i.\\l.(\\t.l P g ((\\w.h) X)) (W ((\\d.u) (\\r.n)))) (s k (r g) L (\\p.(\\l.a m m) j)))))) y",
      "b (\\j.Q (q) (\\h.\\n1.\\b.Q (d K (s (e (\\j.T t k) (\\z.\\b.l (\\s.a d))) (\\o.n) (\\b.e) v) d) (\\s.e))) (\\o.f (S (i N (\\o.S (z) (Z (\\t.\\m.q K)))) (\\y.s (\\l.l P g (h))))) y"
    );
  }

  @Test
  public final void test184() {
    reducesTo(
      "(\\j.\\r.\\q.p) ((\\r.(\\x.(\\g.k j) (m (\\i.\\p.J))) z) (\\e.(\\d.o) ((\\v.i) ((\\p.(\\j.h) ((\\o.\\g.\\c.d) (\\w.V))) (e (\\g.y h))))) q)",
      "\\r.\\q.p"
    );
  }

  @Test
  public final void test185() {
    reducesTo(
      "\\z.I",
      "\\z.I"
    );
  }

  @Test
  public final void test186() {
    reducesTo(
      "\\j.\\d.\\g.e (A (\\h.P)) W",
      "\\j.\\d.\\g.e (A (\\h.P)) W"
    );
  }

  @Test
  public final void test187() {
    reducesTo(
      "\\q.\\o.\\s.(\\v.\\i.(\\p.Q) (\\m.I)) ((\\g.(\\v.z) ((\\f.s c (\\k.X) (\\g.\\h.r)) (e h)) (n ((\\i.M) (\\z.c) (\\f.h R (\\p.q))) h) (i (n S (\\y.d) (\\z.\\r.\\a.O) (\\a.(\\v.W) y)) (\\f.e ((\\h.f) (\\f.u))))) (g ((\\l.G (s L x) (\\n.h e A (\\w.b b (\\a.P))) ((\\e.\\e.n) ((\\l.v j (Q T)) q))) (\\t.Z t ((\\t.\\n.(\\h.\\z.h) r) M)))) (\\p.G))",
      "\\q.\\o.\\s.\\i.Q"
    );
  }

  @Test
  public final void test188() {
    reducesTo(
      "\\h.(\\z.\\n.T) (\\i.\\h.\\q.\\a.\\d.(\\u.(\\f.r ((\\k.(\\o.I) (\\z.f)) (C E (k z)) (\\x.\\g.p)) ((\\u.w) (\\a.k) (b o (v D)) B ((\\b.R k (\\o.K) o) (i ((\\s.h) H))))) (\\z.U)) (\\u.\\m.\\g.r) (\\h.\\d.i n))",
      "\\h.\\n.T"
    );
  }

  @Test
  public final void test189() {
    reducesTo(
      "(\\a.\\r.\\w.O) (\\z.n)",
      "\\r.\\w.O"
    );
  }

  @Test
  public final void test190() {
    reducesTo(
      "\\q.\\i.T",
      "\\q.\\i.T"
    );
  }

  @Test
  public final void test191() {
    reducesTo(
      "\\d.a (U (W N ((\\u.\\u.\\o.X) ((\\u.(\\d.(\\s.\\b.\\q.D) ((\\s.e) (u i))) (T z Q (\\q.a))) (\\i.Q))))) (\\a.\\u.\\b.\\v.\\u.\\a.\\e.(\\c.x (\\m.\\l.(\\k.u) d) (S (p (\\l.t S o ((\\v.d) (t W))))) ((\\u.c (H r) (\\c.\\f.j)) ((\\o.\\c.\\f.V) o ((\\x.B) a ((\\j.l) (c G))) (n (\\l.(\\n.(\\n.m) (\\e.u)) Z)))) (y (k ((\\h.(\\r.\\y.\\q.(\\r.\\x.x) ((\\o.c) (\\e.O))) (\\q.(\\b.P) (\\a.(\\c.d) (\\b.r)))) (\\z.f))))) (\\x.\\r.I))",
      "\\d.a (U (W N (\\u.\\o.X))) (\\a.\\u.\\b.\\v.\\u.\\a.\\e.x (\\m.\\l.u) (S (p (\\l.t S o (d)))) (I) (y (k (\\y.\\q.\\x.x))))"
    );
  }

  @Test
  public final void test192() {
    reducesTo(
      "\\j.V",
      "\\j.V"
    );
  }

  @Test
  public final void test193() {
    reducesTo(
      "(\\v.(\\q.\\v.\\s.\\n.\\j.W (x l) (\\v.W)) (\\w.\\r.L)) u",
      "\\v.\\s.\\n.\\j.W (x l) (\\v.W)"
    );
  }

  @Test
  public final void test194() {
    reducesTo(
      "\\l.g",
      "\\l.g"
    );
  }

  @Test
  public final void test195() {
    reducesTo(
      "\\l.\\j.(\\g.(\\m.(\\x.Q) r ((\\x.u) (\\j.A)) ((\\f.l) (\\h.s) J) ((\\t.(\\l.(\\k.c) c) (\\o.(\\h.E) (K O))) (T s (y q) p)) ((\\l.(\\b.\\a.\\u.(\\d.R) ((\\y.s) (\\n.C))) ((\\g.y) (\\z.(\\r.j) (q N)))) (\\l.\\e.\\a.(\\o.e) (\\a.d)))) (\\m.b) (\\f.(\\x.\\u.\\w.s ((\\s.a) (a N) (b (\\h.g))) (\\z.(\\e.l p) (D (\\n.(\\e.o) (U s))))) ((\\a.\\u.s) (\\u.\\y.p)) (Q (\\x.k)))) U t",
      "\\l.\\j.Q (u) (l J) (c) (\\a.\\u.R) (\\f.\\w.s (a (b (\\h.U))) (\\z.l p)) t"
    );
  }

  @Test
  public final void test196() {
    reducesTo(
      "(\\g.\\h.(\\v.K (k (\\n.\\w.\\v.\\e.s))) r ((\\x.\\l.\\m.\\k.\\k.J N) s)) ((\\w.y) z (\\c.P (\\i.\\j.t) (V (S o (\\r.E)) (\\p.\\m.(\\r.\\t.d) (k a (\\y.A)))) p ((\\w.\\u.(\\d.c) ((\\l.\\n.z) ((\\n.i) U ((\\d.q) (\\o.x))))) (X B l (\\k.\\t.i Z) t (\\k.\\f.\\p.\\i.(\\n.t) (\\i.M))))) (\\w.(\\f.\\z.a) (g (k i (z v) (n Z (\\j.O)) (O (\\g.\\c.\\p.m)) (j ((\\k.(\\d.v) (b f)) z)) (\\u.(\\m.\\v.(\\v.u) (\\y.u) (p (y a)) (P (\\g.\\v.\\j.Q))) ((\\y.h c (J b)) (\\x.\\m.X G) (\\n.\\o.\\f.(\\a.\\b.S) (\\g.d a))))))))",
      "\\h.K (k (\\n.\\w.\\v.\\e.s)) (\\l.\\m.\\k.\\k.J N)"
    );
  }

  @Test
  public final void test197() {
    reducesTo(
      "\\w.I ((\\a.p (\\d.(\\t.\\v.\\n.(\\d.k L ((\\u.A w (\\d.p)) (\\g.(\\o.l) (\\n.Q)))) (\\y.\\j.z) (\\p.\\j.\\d.\\n.j j (\\o.\\b.i))) ((\\q.\\e.l) (\\s.k) (\\u.h)))) (\\h.h i))",
      "\\w.I (p (\\d.\\v.\\n.k L (A w (\\d.p)) (\\p.\\j.\\d.\\n.j j (\\o.\\b.i))))"
    );
  }

  @Test
  public final void test198() {
    reducesTo(
      "\\i.r v ((\\u.\\r.Q (y s) K (\\e.\\s.\\k.\\x.(\\q.L) (s b))) ((\\k.M) S (\\a.\\f.n (\\e.M l))) (\\m.\\z.p)) ((\\g.z) Z (\\q.R) (\\e.n)) (\\g.(\\j.\\c.\\k.c ((\\x.(\\f.x) ((\\e.L) ((\\s.a) (J z)))) W (\\x.(\\j.\\i.\\o.c (\\h.\\k.O)) ((\\p.m) (\\q.(\\t.l (\\f.A)) (j k (\\n.q))))))) b) ((\\n.\\g.(\\h.(\\f.Z) (\\s.u n)) (v ((\\l.\\q.(\\u.\\j.G) (\\z.l a)) b (\\l.y (\\a.\\g.q) (\\l.(\\n.y) (\\c.b) (m G (m d)))))) (\\y.Y (\\t.r))) U)",
      "\\i.r v (Q (y s) K (\\e.\\s.\\k.\\x.L)) (z (\\q.R) (\\e.n)) (\\g.\\c.\\k.c (W (\\x.\\i.\\o.c (\\h.\\k.O)))) (\\g.Z (\\y.Y (\\t.r)))"
    );
  }

  @Test
  public final void test199() {
    reducesTo(
      "\\w.(\\f.i) (\\z.\\z.(\\q.(\\p.\\p.\\u.(\\h.(\\i.s) y) s (\\a.L) Z) (\\k.\\s.\\f.k)) n ((\\j.\\v.(\\h.T) u ((\\k.W (\\q.(\\d.g) (\\w.h))) (\\v.B (\\e.k p (v y))))) J ((\\p.x z) (R (\\l.w)))) (\\f.\\o.(\\o.(\\l.X) (\\o.\\t.e (\\e.(\\l.T) (Z C)) (\\i.z)) v (\\g.\\c.\\s.B)) m))",
      "\\w.i"
    );
  }

  @Test
  public final void test200() {
    reducesTo(
      "\\y.q (\\c.(\\u.\\h.g) ((\\r.\\p.\\z.\\x.(\\b.W) (\\t.(\\u.h U) (d (\\t.B)))) u ((\\b.\\w.\\q.\\n.k e) (\\b.\\d.\\w.\\a.\\i.p)) (\\w.\\s.H)) (N F))",
      "\\y.q (\\c.g)"
    );
  }

  @Test
  public final void test201() {
    reducesTo(
      "\\n.r",
      "\\n.r"
    );
  }

  @Test
  public final void test202() {
    reducesTo(
      "O (\\a.C)",
      "O (\\a.C)"
    );
  }

  @Test
  public final void test203() {
    reducesTo(
      "j ((\\x.(\\b.v) (\\r.\\l.a)) X)",
      "j (v)"
    );
  }

  @Test
  public final void test204() {
    reducesTo(
      "\\z.\\n.\\u.e",
      "\\z.\\n.\\u.e"
    );
  }

  @Test
  public final void test205() {
    reducesTo(
      "w ((\\p.\\r.(\\a.\\l.h) (\\y.(\\l.c) ((\\c.p) ((\\v.s (Y o)) (Z Q))))) ((\\y.(\\z.f) (\\n.H)) q a (\\a.(\\g.i) (\\u.A)) d) (\\r.\\x.\\d.A (\\o.(\\w.\\d.o) k (\\d.\\o.\\d.t)) (\\w.(\\g.I G (n v) x (\\x.g H)) (G ((\\b.s) (\\g.j)))) N)) T",
      "w (\\l.h) T"
    );
  }

  @Test
  public final void test206() {
    reducesTo(
      "t ((\\d.\\i.O) (\\f.\\m.\\h.k))",
      "t (\\i.O)"
    );
  }

  @Test
  public final void test207() {
    reducesTo(
      "(\\j.\\y.R) ((\\d.j ((\\c.n (\\o.(\\i.s) (y t) (b (\\x.r)))) (n p))) (I (H (\\t.(\\b.w) i (b i (\\m.e))) ((\\k.\\t.(\\u.\\m.f) ((\\m.C) (j Q))) ((\\x.u) (\\o.v) A)))) ((\\t.(\\k.l (\\t.x) (\\h.\\p.J I)) (\\i.F (U k) w)) (b u) (s ((\\e.u) (\\p.o) (\\x.j) ((\\n.\\h.L Y) (\\l.\\k.k Q)))) (E ((\\q.\\z.\\u.W) (\\s.(\\z.(\\t.A (\\u.u)) (i S (Z v))) (\\b.(\\s.m) ((\\d.z) (P a)))))))) (z T)",
      "R"
    );
  }

  @Test
  public final void test208() {
    reducesTo(
      "(\\y.\\r.\\z.\\m.\\s.z) z",
      "\\r.\\z.\\m.\\s.z"
    );
  }

  @Test
  public final void test209() {
    reducesTo(
      "\\o.(\\z.L) g",
      "\\o.L"
    );
  }

  @Test
  public final void test210() {
    reducesTo(
      "(\\k.r (\\v.\\u.(\\b.\\r.b (\\x.\\b.\\o.d)) (\\a.v))) n ((\\m.\\x.\\y.f) ((\\o.(\\v.F) d) (\\q.h (\\s.t)) (U p (V Q) ((\\m.o) (\\d.U))) (\\t.(\\r.H u) (\\a.(\\f.\\m.z) ((\\t.w) (n u)))) (\\d.O) (\\r.W))) G",
      "r (\\v.\\u.\\r.v) (\\x.\\y.f) G"
    );
  }

  @Test
  public final void test211() {
    reducesTo(
      "\\j.\\f.S",
      "\\j.\\f.S"
    );
  }

  @Test
  public final void test212() {
    reducesTo(
      "\\l.(\\u.k) ((\\a.(\\j.u (\\k.\\s.u)) O) (\\r.\\f.p ((\\e.M) (\\z.G ((\\n.\\h.r b) (\\w.\\l.\\a.o)) ((\\u.j (\\p.F)) (h k (\\j.s)) (a (\\v.\\t.u))))))) C",
      "\\l.k C"
    );
  }

  @Test
  public final void test213() {
    reducesTo(
      "\\t.\\c.v ((\\h.\\m.B (\\r.(\\a.(\\g.\\o.d) (\\d.(\\j.\\c.z t) v ((\\c.\\z.C) (\\z.p R (\\e.u))))) (\\l.\\t.\\n.\\s.N (\\m.\\f.\\n.\\s.\\s.i G) (\\k.(\\k.A (\\b.\\o.q)) (\\m.\\k.(\\w.y) (E i) (\\c.m l)))) (\\c.\\v.\\t.\\z.\\y.s))) ((\\t.s ((\\j.\\z.\\q.(\\d.e) (\\m.p)) ((\\f.e) ((\\u.\\l.(\\u.Z) (q x) (x V (c G))) (\\o.A (\\i.\\m.\\d.F)))))) ((\\r.(\\u.z D Q (\\b.y)) (R (\\u.s u (\\k.l))) (\\n.(\\y.\\m.\\k.\\e.\\t.(\\w.l) (S t)) (\\h.v (L A (g h)))) a) (N ((\\l.\\k.\\j.r (x c (\\t.f t (\\d.A)))) (\\o.\\y.d))))))",
      "\\t.\\c.v (\\m.B (\\r.d))"
    );
  }

  @Test
  public final void test214() {
    reducesTo(
      "\\b.d",
      "\\b.d"
    );
  }

  @Test
  public final void test215() {
    reducesTo(
      "D (\\b.\\p.\\r.\\u.(\\p.A) ((\\q.(\\l.\\x.\\g.H (\\z.t n)) o (\\s.(\\b.z (a k (\\h.v))) (\\z.\\g.c)) (\\r.\\z.(\\d.g (\\g.Z)) (u L r) n (\\w.b (\\j.a))) (\\o.x)) (\\m.\\m.\\z.\\m.\\y.\\y.\\x.y j)))",
      "D (\\b.\\p.\\r.\\u.A)"
    );
  }

  @Test
  public final void test216() {
    reducesTo(
      "\\m.(\\s.v) C",
      "\\m.v"
    );
  }

  @Test
  public final void test217() {
    reducesTo(
      "p (\\z.\\o.(\\k.\\l.(\\x.\\n.\\j.\\r.K) ((\\e.p) (\\h.(\\n.(\\z.T) (\\n.r) (\\i.q x b)) (\\v.(\\w.\\q.k) C)) ((\\o.(\\o.z) (\\u.u) (e s (\\m.X)) (\\t.q (\\n.\\d.r))) (U (\\g.r))))) J ((\\q.y (\\p.f)) (\\v.M (\\b.\\f.\\z.G) (c (\\a.\\z.(\\c.\\o.N) (\\p.r C)) (\\k.(\\y.k k (r c)) o (\\y.c (\\n.\\b.\\d.w))) ((\\r.(\\s.D) (\\p.(\\p.j) (\\w.d) (e Y (\\m.R)))) (\\l.\\t.\\w.t))))))",
      "p (\\z.\\o.\\n.\\j.\\r.K)"
    );
  }

  @Test
  public final void test218() {
    reducesTo(
      "(\\t.\\w.(\\d.j) (\\u.\\j.\\h.\\s.\\g.\\j.\\t.t)) (D (\\w.h)) w (\\x.\\g.\\n.(\\l.Z) (\\b.(\\u.(\\x.\\d.(\\r.Y) (\\a.(\\i.T) r) ((\\m.V g ((\\x.a) (\\w.M))) u ((\\b.\\n.d) (\\j.(\\t.a) (g T) (\\u.\\j.\\s.j))))) ((\\o.G) (\\t.S) ((\\l.m) (\\n.(\\k.z) (\\r.Q) (\\v.k)) (\\a.(\\d.d t) (h (\\u.M i (p w))))))) m))",
      "j (\\x.\\g.\\n.Z)"
    );
  }

  @Test
  public final void test219() {
    reducesTo(
      "y ((\\l.(\\g.\\z.\\u.L (\\k.\\v.\\a.d)) (\\r.z (\\t.x (\\c.\\l.\\m.\\q.(\\r.\\w.y r (r x)) (\\j.\\l.(\\y.l) (\\w.t)))))) (\\e.(\\c.\\u.\\c.Q) (\\n.\\q.(\\v.(\\y.O) a) k ((\\b.(\\c.K (\\a.x) (q C (\\f.p))) (o (\\u.(\\h.w) (c P)))) (\\b.i))))) (\\n.\\x.r)",
      "y (\\z.\\u.L (\\k.\\v.\\a.d)) (\\n.\\x.r)"
    );
  }

  @Test
  public final void test220() {
    reducesTo(
      "\\b.\\u.\\e.Z",
      "\\b.\\u.\\e.Z"
    );
  }

  @Test
  public final void test221() {
    reducesTo(
      "\\u.Q",
      "\\u.Q"
    );
  }

  @Test
  public final void test222() {
    reducesTo(
      "(\\l.(\\l.\\h.z U) f) (\\q.c)",
      "\\h.z U"
    );
  }

  @Test
  public final void test223() {
    reducesTo(
      "\\a.(\\e.\\j.(\\h.a) z) (\\t.(\\e.o (\\e.\\r.\\f.r) (\\y.h)) (\\d.(\\p.J) (\\d.(\\b.\\c.t) (A X ((\\e.H) (\\g.s)))) U) (\\v.(\\z.J D) (\\v.\\e.\\a.j) Q q (\\v.I d (\\k.H) ((\\b.c) (\\i.s)) j (\\d.\\m.w z) ((\\j.k) ((\\q.\\g.j) (\\g.\\q.\\g.\\a.V))))) z)",
      "\\a.\\j.a"
    );
  }

  @Test
  public final void test224() {
    reducesTo(
      "(\\n.\\m.\\i.(\\o.n) (\\e.(\\e.j) ((\\a.(\\l.(\\z.\\u.\\b.\\i.(\\r.\\j.q) ((\\z.v) (c a)) (s m (\\c.S) (\\b.W J))) (\\j.\\k.\\m.c)) (n (\\n.c) (\\i.t))) (\\f.(\\d.(\\z.(\\p.Y) ((\\y.\\j.u q) (\\v.\\w.\\q.j))) (d ((\\w.x) t) ((\\d.L) (c g) (H (\\j.p))))) (\\a.\\q.(\\f.\\c.\\e.\\b.(\\w.\\k.\\i.k (D l)) ((\\t.v) (m f) (\\v.L))) ((\\j.\\j.\\t.o) (l U (b f) (e (\\l.q))))))))) (\\f.i (D (\\i.(\\m.(\\w.\\k.R B z g) ((\\y.p) (p x) y)) S)) x (\\j.(\\s.o (\\m.(\\u.\\c.\\u.(\\i.x) (e e) (\\o.l d (k b)) (u (v o u)) (\\n.a)) l)) (b (\\m.\\i.G ((\\p.j) (\\x.\\r.O)) j))))",
      "\\m.\\i1.\\f.i (D (\\i.\\k.R B z g)) x (\\j.o (\\m.\\c.\\u.x (\\o.l d (k b)) (u (v o u)) (\\n.a)))"
    );
  }

  @Test
  public final void test225() {
    reducesTo(
      "\\d.(\\j.\\p.x) (\\x.B ((\\m.\\i.\\b.(\\k.B) (\\o.I (t S (\\t.r) (n v (\\w.A)))) z) ((\\r.\\g.S) (\\f.P)))) P",
      "\\d.x"
    );
  }

  @Test
  public final void test226() {
    reducesTo(
      "(\\p.\\r.h) ((\\y.\\l.(\\j.(\\z.\\i.j) O) (g (v q (g W) (O u q))) (\\z.\\f.\\c.\\c.(\\q.(\\e.Z) ((\\q.\\r.\\w.x) (i p))) (p ((\\l.g) (\\y.\\y.U))))) r) (\\o.(\\x.\\f.\\j.\\u.(\\u.\\y.(\\t.\\c.(\\x.\\w.y) p) ((\\l.\\e.o) ((\\k.l) s))) ((\\l.v m) e ((\\e.\\m.k l) t)) (\\q.P)) j v) ((\\q.c) (\\j.(\\e.\\b.d) (\\c.q)) o)",
      "h (c o)"
    );
  }

  @Test
  public final void test227() {
    reducesTo(
      "(\\w.\\x.\\u.\\h.V) (n (\\i.\\j.Q (i d a)) (\\s.\\f.f ((\\b.o q (\\f.o)) (\\n.q (B M)))) (\\m.q)) (\\s.f) (\\e.\\s.r (T (\\y.d (\\d.C)))) (n (\\x.p) t)",
      "V"
    );
  }

  @Test
  public final void test228() {
    reducesTo(
      "(\\j.\\t.\\l.v) B ((\\s.\\b.\\y.D) ((\\u.k S C ((\\j.(\\e.a y (Y v)) (o (\\x.k))) P)) (s (T l (\\b.D)) u ((\\a.\\l.(\\j.b) (H a) (h b)) (\\v.\\b.\\l.(\\e.h) m))) l ((\\c.\\p.n) (\\z.(\\i.(\\z.\\y.l n (\\u.v) (\\q.\\t.L)) w ((\\c.n (\\i.j t (J I))) (\\v.\\z.V))) t))))",
      "\\l.v"
    );
  }

  @Test
  public final void test229() {
    reducesTo(
      "(\\n.d) ((\\t.(\\z.(\\q.(\\d.(\\j.N) (t f) (y (\\x.C))) (\\y.t)) (\\j.(\\c.\\p.k) (\\u.(\\v.a) ((\\g.S) (y h))))) B) (\\y.(\\f.\\s.v) (\\f.v))) ((\\q.c) ((\\j.\\j.\\o.\\r.\\o.\\j.\\r.d) ((\\j.i (\\i.\\w.E (\\k.r))) (\\g.\\b.J v)))) (E (\\h.\\x.\\o.(\\w.F) O) (F ((\\b.(\\r.\\r.F) (\\d.p)) (\\o.\\o.b)) (\\c.s ((\\a.\\i.y) (\\z.(\\v.v) (\\u.l) r ((\\y.\\j.\\n.M) u)))) (\\e.(\\r.\\t.(\\o.\\t.a) (\\f.(\\r.\\v.d) ((\\c.\\b.\\r.E) (n w (C j))) (\\l.\\f.(\\w.C Q (w S)) g (\\d.L)))) (\\n.C))))",
      "d (c) (E (\\h.\\x.\\o.F) (F (\\r.F) (\\c.s (\\i.y)) (\\e.\\t.\\t.a)))"
    );
  }

  @Test
  public final void test230() {
    reducesTo(
      "\\p.(\\i.e) a",
      "\\p.e"
    );
  }

  @Test
  public final void test231() {
    reducesTo(
      "p (\\e.l) (\\k.\\s.\\s.x) ((\\q.d (\\p.\\p.k)) ((\\y.\\m.\\h.K) (\\j.s ((\\o.p) c (\\x.\\g.\\z.W)))) (\\f.J) ((\\u.u) ((\\l.(\\p.m (B s (S E))) (s ((\\l.k) (\\e.x)))) (\\g.V ((\\v.(\\h.b) h) p))) S)) (\\j.\\x.(\\x.\\c.L) (y (\\k.\\v.(\\i.\\x.f) (n (\\t.C))) (\\p.g ((\\e.(\\u.v) e) (Y (p h)))) ((\\f.\\h.p (\\g.y P)) ((\\x.c) (\\u.n B X)) (r I (o t) (\\p.y (\\p.t)) ((\\f.\\j.g) ((\\p.l) (\\d.e)))))) (\\w.d) ((\\c.l n) (\\n.\\y.\\y.g)))",
      "p (\\e.l) (\\k.\\s.\\s.x) (d (\\p.\\p.k) (\\f.J) (m (B s (S E)) S)) (\\j.\\x.L (l n))"
    );
  }

  @Test
  public final void test232() {
    reducesTo(
      "N (\\n.K) ((\\u.\\i.\\d.\\c.(\\n.\\f.\\v.v) x (\\g.h) ((\\s.y) ((\\o.\\z.v) (\\i.Z (F d (\\n.b)))) ((\\w.\\n.(\\n.\\j.E) i) ((\\u.o) ((\\u.E) a)) (\\b.J))) p) ((\\o.\\p.H) (\\i.(\\v.\\u.\\t.p) ((\\l.y) (\\b.(\\s.i) (y v) (\\x.i e (k R)) ((\\o.\\y.f) (\\m.\\u.f a))))) (\\s.\\n.\\o.(\\o.(\\b.\\d.B) (\\c.w)) d)))",
      "N (\\n.K) (\\i.\\d.\\c.y (\\j.E) p)"
    );
  }

  @Test
  public final void test233() {
    reducesTo(
      "c (\\u.k a)",
      "c (\\u.k a)"
    );
  }

  @Test
  public final void test234() {
    reducesTo(
      "\\s.(\\x.\\p.\\a.(\\u.(\\v.(\\e.a) ((\\r.\\n.(\\q.(\\s.\\o.X) (e c (i v)) (y (\\u.\\o.\\y.K))) (\\r.J)) ((\\u.H ((\\o.x) k)) (A (\\w.M B))))) (\\d.\\p.\\s.\\s.\\t.(\\h.x) ((\\o.w k) (\\r.P)))) ((\\j.j) ((\\s.R ((\\s.(\\j.x) G) (f (r h))) (\\z.M ((\\a.e) t))) (\\q.(\\e.\\b.Q (\\m.\\l.z)) ((\\i.\\z.\\d.\\t.\\k.\\s.y) u))) (O (\\v.\\p.(\\h.(\\p.(\\g.s (t o)) (\\l.\\p.n) m) (\\y.q (\\x.\\m.(\\q.\\v.M) (\\c.\\e.q)))) (i (e V (c s) E ((\\k.(\\u.R) w) (\\i.c f (\\j.C))))))))) (W N ((\\e.\\a.J E a) ((\\r.(\\p.(\\f.\\n.d) ((\\b.(\\v.v) (m X)) b (\\q.p (f R) (t w (c z))))) (j ((\\m.(\\u.(\\y.c) (\\p.g)) i) (\\h.(\\m.m) ((\\t.z) (\\p.s)))))) (p (D j (\\x.p) (w N (\\h.n)) g ((\\n.\\o.S) (\\m.\\h.\\x.p)))))))",
      "\\s.\\p1.\\a.a"
    );
  }

  @Test
  public final void test235() {
    reducesTo(
      "(\\l.(\\d.\\t.\\u.t ((\\g.\\i.(\\n.p x) (\\c.C Q)) ((\\o.u) (\\s.a) (\\a.w))) (d ((\\w.l (\\f.T (\\o.k))) (D ((\\j.j) (A g))))) (e v)) (\\i.N)) e ((\\v.T) i)",
      "\\u.T (\\i.p x) (N) (e v)"
    );
  }

  @Test
  public final void test236() {
    reducesTo(
      "b (\\x.\\q.\\y.(\\k.(\\q.\\r.w) (\\r.t)) (o (\\w.r) (\\j.\\e.h))) (o (\\z.(\\j.h) ((\\o.(\\e.\\g.c) (\\a.\\n.j X) (H y (e e) (y m))) q)) (\\o.o y (\\x.b)) (\\c.(\\b.(\\r.\\m.\\b.\\g.\\u.z N) (m (\\w.\\e.d v) (\\u.\\p.\\n.(\\z.\\t.Q) S) ((\\l.A) (\\p.a) (\\t.(\\l.X) g) (\\p.\\l.(\\x.c) (T g) N)) (X D))) (\\w.Z)))",
      "b (\\x.\\q.\\y.\\r.w) (o (\\z.h) (\\o.o y (\\x.b)) (\\c.\\m.\\b.\\g.\\u.z N))"
    );
  }

  @Test
  public final void test237() {
    reducesTo(
      "(\\w.(\\i.z) ((\\f.\\v.Q) ((\\l.\\e.\\k.\\w.i) (\\t.s))) (\\n.(\\o.T ((\\u.D) (j Q) (x (E e)))) (m ((\\d.Z) (\\d.(\\v.t) (j e)))) ((\\x.\\i.\\b.\\p.C) ((\\i.h d (u E)) (k H (n n)) (\\d.s (t R) (a p (\\g.q))))) (\\g.l))) (w V) (\\o.G ((\\x.E d (k k) (b I (\\z.Q))) k ((\\r.\\r.\\q.\\y.p F (\\t.W)) ((\\i.x) u j)) (\\i.\\l.\\w.g)) (U (\\l.\\n.\\d.\\l.\\e.\\h.(\\a.(\\b.b) (\\o.q)) (\\m.(\\t.\\f.p) ((\\i.i (c x)) t ((\\a.\\k.o Z) (\\v.\\o.\\b.w)))))) (\\u.\\q.Q))",
      "z (\\n.T (D (x (E e))) (\\i.\\b.\\p.C) (\\g.l)) (\\o.G (E d (k k) (b I (\\z.Q)) (\\r.\\q.\\y.p F (\\t.W)) (\\i.\\l.\\w.g)) (U (\\l.\\n.\\d.\\l.\\e.\\h.\\o.q)) (\\u.\\q.Q))"
    );
  }

  @Test
  public final void test238() {
    reducesTo(
      "(\\l.\\r.\\o.x (\\l.\\b.l (\\q.i (Y (\\a.(\\p.P) (\\d.z) (\\l.d)) ((\\h.H) ((\\y.W (w w)) (\\p.\\r.Z B))) (v ((\\p.x a (\\q.(\\d.l) (\\m.H))) (i g (\\v.K) ((\\c.p) (\\q.C))))))))) u",
      "\\r.\\o.x (\\l.\\b.l (\\q.i (Y (\\a.P (\\l.d)) (H) (v (x a (\\q.l))))))"
    );
  }

  @Test
  public final void test239() {
    reducesTo(
      "\\b.\\g.(\\h.b) m",
      "\\b.\\g.b"
    );
  }

  @Test
  public final void test240() {
    reducesTo(
      "b (\\l.\\p.T) f M ((\\t.X) (\\z.(\\a.N) (\\j.(\\h.\\y.(\\m.(\\z.A) I ((\\o.m) (\\z.j)) (\\i.\\n.(\\e.m Z) (\\o.B))) K) n))) (p K)",
      "b (\\l.\\p.T) f M (X) (p K)"
    );
  }

  @Test
  public final void test241() {
    reducesTo(
      "\\w.x",
      "\\w.x"
    );
  }

  @Test
  public final void test242() {
    reducesTo(
      "\\m.(\\n.g) (\\e.R)",
      "\\m.g"
    );
  }

  @Test
  public final void test243() {
    reducesTo(
      "\\z.(\\q.y) (\\z.(\\o.\\k.o (\\b.q)) (\\j.\\l.\\v.\\k.w (\\m.\\t.\\o.\\v.E) f w))",
      "\\z.y"
    );
  }

  @Test
  public final void test244() {
    reducesTo(
      "o (q (\\s.\\h.(\\h.\\u.\\k.\\g.(\\a.U) (B (\\o.\\i.\\a.\\i.\\i.\\f.\\a.j))) g))",
      "o (q (\\s.\\h.\\u.\\k.\\g.U))"
    );
  }

  @Test
  public final void test245() {
    reducesTo(
      "(\\x.c (h x)) (\\r.N)",
      "c (h (\\r.N))"
    );
  }

  @Test
  public final void test246() {
    reducesTo(
      "\\m.\\x.\\h.M",
      "\\m.\\x.\\h.M"
    );
  }

  @Test
  public final void test247() {
    reducesTo(
      "\\b.w",
      "\\b.w"
    );
  }

  @Test
  public final void test248() {
    reducesTo(
      "\\a.g (\\g.n)",
      "\\a.g (\\g.n)"
    );
  }

  @Test
  public final void test249() {
    reducesTo(
      "k (\\t.M B ((\\b.\\x.\\x.(\\k.\\q.\\h.y) h u) ((\\w.k) b (\\w.(\\w.\\b.(\\f.(\\s.q) ((\\h.j) h)) (Z (j Y (o I)) (c W (\\d.r) (\\p.b)))) M))))",
      "k (\\t.M B (\\x.\\x.\\h.y))"
    );
  }

  @Test
  public final void test250() {
    reducesTo(
      "\\a.(\\w.c) (W m (s (k w S)) (j (t s (b r)) (\\c.(\\w.R) (\\n.c) (m x (\\a.t))))) (T (Y (\\s.\\o.I))) (\\s.\\p.y) (\\c.W) ((\\q.l) (\\u.(\\p.\\f.\\j.\\o.(\\t.\\m.(\\i.(\\q.p) (w f) (\\y.j N)) (j Y) (\\f.w r (I f) (\\r.\\f.\\x.s) ((\\y.(\\h.o) (f a)) w))) ((\\y.\\t.s) g ((\\m.u c) (\\d.c)) ((\\t.J) (d e (\\t.n)) (\\l.l)))) ((\\w.\\n.(\\w.\\q.\\h.\\r.\\u.N t) (x D)) o)) ((\\v.\\c.w) h w (\\x.\\m.s ((\\l.\\q.F) (\\j.A) (\\l.\\d.(\\g.\\j.x) (p (\\f.n))) (\\n.\\p.\\u.u ((\\c.e) (v a)) z)) (\\c.z))))",
      "\\a.c (T (Y (\\s.\\o.I))) (\\s.\\p.y) (\\c.W) (l (w (\\x.\\m.s (F (\\n.\\p.\\u.u (e) z)) (\\c.z))))"
    );
  }

  @Test
  public final void test251() {
    reducesTo(
      "\\t.\\p.q (H i) ((\\c.a) ((\\g.b) ((\\h.Y) l)) (\\k.w) t ((\\z.o) T) (\\e.(\\z.\\k.O (\\l.R)) ((\\x.\\v.(\\k.g E) (\\h.I o)) (\\r.\\k.\\z.E) (\\e.o)) (\\l.n (\\a.\\j.(\\y.i) (\\y.\\l.O)) ((\\i.m) (\\h.(\\k.(\\i.Z) l) g) (n (\\l.(\\j.t W (\\c.e)) (K (N s)))))) (\\f.i ((\\h.\\r.(\\w.(\\k.(\\h.\\s.I) ((\\i.n) j)) (\\t.a w)) u) (\\j.w)))))",
      "\\t.\\p.q (H i) (a (\\k.w) t (o) (\\e.O (\\l.R) (\\f.i (\\r.\\s.I))))"
    );
  }

  @Test
  public final void test252() {
    reducesTo(
      "\\s.(\\i.p ((\\r.G ((\\r.(\\f.(\\t.(\\q.v) (\\k.S)) (\\j.\\h.k)) (l (\\i.j A))) (m (b q (g z) (o X g))) (\\y.(\\i.e) ((\\k.\\d.h) y)))) (\\y.(\\h.\\p.D ((\\o.\\y.\\k.p) (\\s.\\k.\\x.z)) (\\v.(\\d.u (n h)) (L t (\\g.v)) (N f))) ((\\w.\\u.(\\k.\\r.S (\\l.A n)) (\\x.v)) l) (\\a.\\u.(\\d.\\v.(\\m.E) (\\e.l)) a ((\\g.\\s.k) ((\\x.c) h s)) B)))) u",
      "\\s.p (G (v (\\y.e)))"
    );
  }

  @Test
  public final void test253() {
    reducesTo(
      "(\\o.\\j.\\b.\\g.A) v",
      "\\j.\\b.\\g.A"
    );
  }

  @Test
  public final void test254() {
    reducesTo(
      "G ((\\u.(\\d.\\h.(\\l.c) x) (\\g.\\n.c (N k (r a) (\\r.u S (\\m.l))) (\\m.\\e.\\u.\\f.\\w.(\\b.i H (o g)) q))) ((\\r.(\\c.\\p.\\h.y) ((\\p.f) (m q))) ((\\v.(\\m.b) (\\j.y)) (W (O e))) (\\l.\\e.\\q.\\x.\\f.z (B a (\\c.q) q)) (\\d.\\c.\\g.E)) (F ((\\h.(\\c.g (b ((\\m.F) (\\h.E)))) (\\p.h (\\r.u ((\\t.Q) (w n))))) (X (\\t.(\\a.(\\a.\\g.\\y.h) (\\c.\\c.t u)) (\\t.\\x.\\b.\\c.q (\\x.r))))))) q",
      "G (c) q"
    );
  }

  @Test
  public final void test255() {
    reducesTo(
      "\\m.p T",
      "\\m.p T"
    );
  }

  @Test
  public final void test256() {
    reducesTo(
      "(\\u.\\n.\\n.m (\\t.\\z.z)) h x",
      "\\n.m (\\t.\\z.z)"
    );
  }

  @Test
  public final void test257() {
    reducesTo(
      "(\\n.i) (\\z.(\\e.\\k.x) ((\\u.h) (\\j.\\f.\\p.\\p.w E (\\z.q) (S v (B k)) (\\l.\\p.\\l.\\n.\\w.j)) (a (\\y.s v)) (\\i.\\o.s ((\\a.t (j a)) n D) (p ((\\z.Q) (\\c.M k (\\y.h)) o))))) ((\\p.\\t.t) D)",
      "i (\\t.t)"
    );
  }

  @Test
  public final void test258() {
    reducesTo(
      "S (\\e.P) (e n (\\m.X v)) r ((\\h.\\z.\\r.\\e.\\d.\\h.\\l.h c ((\\j.\\n.E) d)) m)",
      "S (\\e.P) (e n (\\m.X v)) r (\\z.\\r.\\e.\\d.\\h.\\l.h c (\\n.E))"
    );
  }

  @Test
  public final void test259() {
    reducesTo(
      "(\\l.R) m ((\\s.B) ((\\g.(\\v.(\\g.n) (n o) (\\n.\\j.\\i.r)) ((\\b.\\s.\\b.t) (\\h.x)) (\\j.(\\w.\\i.\\k.R) (\\t.\\j.v) (Z Q))) ((\\y.\\r.D) o ((\\u.y) ((\\o.V) (\\r.\\h.M)))) (k (\\t.\\t.(\\g.(\\h.I) (r l) (\\j.\\f.B)) (Z (\\n.Q y (E O)))) (\\a.\\i.\\w.\\m.(\\b.\\y.(\\j.\\q.V) B (\\h.e (\\r.n) d)) (\\l.(\\n.(\\h.n) (n a) (X w)) (\\m.(\\t.\\s.y) (v l b))))))) (\\i.(\\z.\\l.\\j.h (\\n.\\u.u (b (\\z.z) (k D (k Z)))) ((\\u.(\\k.\\j.b (\\w.o m)) ((\\o.J) (\\d.e) (g S (j E)))) (\\c.(\\f.b) ((\\b.\\j.\\o.z) w))) E (\\a.\\d.\\h.\\p.y (\\z.O v))) (\\o.u c))",
      "R (B) (\\i.\\l.\\j.h (\\n.\\u.u (b (\\z.z) (k D (k Z)))) (\\j.b (\\w.o m)) E (\\a.\\d.\\h.\\p.y (\\z.O v)))"
    );
  }

  @Test
  public final void test260() {
    reducesTo(
      "(\\q.\\s.\\o.m G) (\\n.D ((\\w.f) S) (\\i.\\f.y) (\\u.\\b.w b (\\k.i ((\\s.\\z.f) (\\y.Q (\\h.c))) (\\x.K)) (\\q.\\e.Q))) C",
      "\\o.m G"
    );
  }

  @Test
  public final void test261() {
    reducesTo(
      "(\\n.l) (\\m.y (\\q.\\g.\\v.t) t (\\z.F))",
      "l"
    );
  }

  @Test
  public final void test262() {
    reducesTo(
      "\\d.(\\w.\\o.(\\l.K m) u) D",
      "\\d.\\o.K m"
    );
  }

  @Test
  public final void test263() {
    reducesTo(
      "(\\i.c (\\d.F)) ((\\e.\\a.d) (\\c.\\u.s (t ((\\d.e) (\\v.a)))))",
      "c (\\d.F)"
    );
  }

  @Test
  public final void test264() {
    reducesTo(
      "\\x.(\\v.(\\y.(\\b.\\i.\\t.\\m.S (o (\\v.s n (\\o.o))) (\\p.\\y.(\\b.v) (\\x.\\f.g))) ((\\z.H ((\\y.\\b.P k) f)) (\\l.m)) (\\c.R)) (\\o.o (\\i.r (\\g.\\s.u) J ((\\p.P F (d q d)) (\\r.(\\r.t) (\\z.y) (x d (c p)))) i)) ((\\e.\\f.\\a.\\n.\\t.\\j.o y) (\\k.\\d.b))) (m (\\e.(\\e.\\e.(\\q.\\b.Y) ((\\i.W) (c w)) (\\h.\\l.(\\z.h) P)) (\\l.\\o.\\s.(\\y.\\w.(\\t.\\d.q) ((\\j.o) L)) (\\o.\\k.\\d.\\v.\\m.\\v.q)) (\\i.q (y i) (\\f.C) ((\\d.t) (\\h.f) s) (d (Z z (\\i.g)) ((\\t.G) (W y) (k C (j n))))) (\\e.\\d.M)) ((\\k.(\\o.h ((\\f.\\p.\\t.z) ((\\v.r) (x a))) (k g) (\\s.r)) (\\n.D (\\x.(\\v.\\c.\\a.P) (f (q (h a)) (l a))))) j))",
      "\\x.\\m3.S (o (\\v.s n (\\o.o))) (\\p.\\y4.m (\\e.Y (\\e.\\d.M)) (h (\\p.\\t.z) (j g) (\\s.r)))"
    );
  }

  @Test
  public final void test265() {
    reducesTo(
      "x (\\v.\\u.(\\o.I) ((\\o.i ((\\c.\\z.g (\\u.I) (\\k.\\h.f)) (\\o.C (p J)) ((\\n.(\\q.a) (\\x.t)) (h u (\\j.b)) (h w d)))) (\\m.J ((\\k.\\z.f ((\\n.i d (J D)) (\\o.\\u.g j))) (\\m.t t (Z z) (\\l.\\n.z T) u)))) (\\d.V))",
      "x (\\v.\\u.I (\\d.V))"
    );
  }

  @Test
  public final void test266() {
    reducesTo(
      "\\k.s ((\\w.(\\k.(\\m.\\g.\\x.\\i.o y (F o)) U (\\q.\\v.\\j.q (\\c.(\\v.\\q.y) j))) (\\o.u ((\\y.\\s.V z) (\\g.f) a))) (V (\\b.V)) (\\n.M (\\z.i))) U",
      "\\k.s (\\i.o y (F o)) U"
    );
  }

  @Test
  public final void test267() {
    reducesTo(
      "\\i.\\k.V",
      "\\i.\\k.V"
    );
  }

  @Test
  public final void test268() {
    reducesTo(
      "N C (\\s.z V) x",
      "N C (\\s.z V) x"
    );
  }

  @Test
  public final void test269() {
    reducesTo(
      "\\g.\\c.u",
      "\\g.\\c.u"
    );
  }

  @Test
  public final void test270() {
    reducesTo(
      "h ((\\m.(\\h.v) (\\g.\\c.\\h.q (\\z.\\d.L V) b) ((\\n.T ((\\m.I) (\\i.f) v)) L) (\\r.(\\p.g) Y)) (\\e.\\u.\\g.(\\l.(\\s.(\\u.K h) (B (\\v.\\h.a))) (L (s (g y)) (\\j.R j))) (\\n.(\\o.f) (\\n.(\\w.v) u ((\\k.o) (\\v.g)) (\\h.V r C G))) ((\\e.y) ((\\p.(\\y.\\z.\\h.\\t.T) (\\u.(\\m.L (\\s.h)) (\\p.X))) (P (\\x.(\\g.\\m.\\i.f) (u m N)))))) (\\h.v))",
      "h (v (T (I v)) (\\r.g) (\\h.v))"
    );
  }

  @Test
  public final void test271() {
    reducesTo(
      "\\x.(\\f.\\u.\\o.(\\u.i) ((\\p.(\\y.n) (\\l.i) ((\\r.g) (n t))) O) G (\\f.\\z.t) (l q)) (\\x.\\o.(\\z.b) (\\k.(\\b.\\m.(\\m.\\q.e e) (\\q.j a (\\r.W)) ((\\x.\\r.p) i) ((\\w.\\g.v) Y)) (\\m.(\\f.s) ((\\z.C) H)) u)) ((\\q.\\b.\\d.t (r (\\t.D) (C h T)) (\\u.\\k.\\n.(\\e.O) (\\r.\\n.\\i.e)) (\\y.\\o.(\\q.\\n.c) ((\\h.J) (p u) (\\z.y) ((\\q.H u A) (d Y (\\q.j)))))) (\\k.o (\\j.\\b.(\\n.o) (\\k.E b (i o) (\\h.\\x.J u) ((\\j.a) (q n) (\\k.\\q.\\z.g))))) ((\\f.\\p.(\\l.(\\t.\\s.(\\a.\\y.Z) (\\e.D D)) (\\s.b)) u) ((\\v.\\k.Q (h (h (c H)))) ((\\q.(\\w.j l H) (\\b.Z Y (\\p.k))) (\\m.v))) (n v)) (\\i.(\\f.\\r.\\x.\\q.\\e.(\\a.(\\i.(\\h.\\m.\\e.j) (k c H) (\\k.O S (\\g.u) ((\\m.R) D)) (\\d.\\d.i)) (U (i (\\v.(\\c.K) (A m))) (\\k.\\c.(\\v.H (Q (\\a.F))) ((\\o.h) (\\u.Z) (\\s.\\d.\\e.a))))) (\\w.\\h.\\w.\\g.(\\t.\\r.m) (F A (\\t.G K)) (\\c.w))) ((\\a.\\u.\\g.\\o.(\\i.\\r.Z w (\\a.W)) ((\\x.V) n)) (\\o.\\x.\\q.\\q.(\\f.E p) (l c (t J)) (c (\\s.s))) ((\\v.\\s.F ((\\y.(\\d.l) (\\l.f)) f)) ((\\q.\\g.y E) ((\\w.n) (t n)) p)) (\\z.\\n.P ((\\x.k) b h) ((\\q.(\\s.l) c) (y q) (\\q.\\r.\\o.D ((\\i.q) (W n)))) (\\u.k)))))",
      "\\x.\\o.i G (\\f.\\z.t) (l q)"
    );
  }

  @Test
  public final void test272() {
    reducesTo(
      "\\i.\\h.U i l",
      "\\i.\\h.U i l"
    );
  }

  @Test
  public final void test273() {
    reducesTo(
      "\\g.\\r.\\y.b",
      "\\g.\\r.\\y.b"
    );
  }

  @Test
  public final void test274() {
    reducesTo(
      "\\f.\\y.\\k.\\u.(\\x.\\w.i y (\\v.\\p.\\q.\\e.d (\\j.(\\t.A) ((\\q.A (\\c.u)) (Z G (g M))) i)) (\\z.\\y.T ((\\s.(\\t.S) ((\\j.(\\v.\\b.C x) (R (y g))) A)) p)) ((\\g.\\w.c P (\\y.\\a.l)) (y (\\w.(\\r.\\v.\\k.U) (P o (\\j.X) (\\y.C (g R)) (\\w.n))) ((\\d.d (\\w.q) s (\\j.e) (p C (\\h.A (\\b.(\\m.z) H)))) ((\\b.E) (\\d.s)))))) (\\x.\\r.\\r.K (\\x.(\\x.z) p))",
      "\\f.\\y.\\k.\\u.\\w.i y (\\v.\\p.\\q.\\e.d (\\j.A i)) (\\z1.\\y.T (S)) (\\w.c P (\\y.\\a.l))"
    );
  }

  @Test
  public final void test275() {
    reducesTo(
      "(\\d.s (s ((\\y.c V) a)) C (\\j.(\\n.A) (\\h.(\\r.\\t.\\l.M) ((\\z.\\e.M) G N)))) (G ((\\u.\\n.\\r.(\\o.\\g.\\g.(\\a.\\u.a) l) (\\c.B)) ((\\u.\\o.Z) (\\h.g))))",
      "s (s (c V)) C (\\j.A)"
    );
  }

  @Test
  public final void test276() {
    reducesTo(
      "\\t.Q (\\h.(\\x.\\m.h p (\\e.(\\d.f E (\\v.r) z) (t ((\\e.e) c)) (k ((\\b.t) (\\b.p)) (x (\\e.r (K S)))) (\\k.(\\q.h) (\\t.q) (\\l.\\g.l) ((\\r.C) (\\t.u) (\\s.\\l.\\e.M)) (\\l.c))) ((\\k.\\p.\\u.(\\y.K) ((\\q.(\\i.\\a.j) n) (\\k.M (\\s.k) (\\n.x)))) g (\\x.\\k.R))) (\\l.(\\h.\\d.\\w.(\\u.\\n.(\\y.d (\\h.(\\o.(\\k.w) Y) (\\c.\\c.\\b.c)) (\\n.\\k.\\r.\\f.(\\q.U) ((\\u.\\y.W) (\\s.a x)))) (\\r.(\\r.b (\\a.y)) (p F))) ((\\a.F) (\\y.P) ((\\d.\\y.\\v.\\r.\\e.\\z.\\c.N) (s v (\\a.i) (i N (t q))) (\\i.(\\y.v) (\\m.p (P q) (w E d)))))) ((\\k.\\u.(\\i.\\r.\\d.\\e.(\\c.\\b.v ((\\f.\\j.x) (v B (s q)))) (\\v.x)) n) u)))",
      "\\t.Q (\\h.\\m.h p (\\e.f E (\\v.r) z (k (t) (\\d.\\w.\\n.d (\\h.w) (\\n.\\k.\\r.\\f.U))) (\\k.h (\\l.\\g.l) (C (\\s.\\l.\\e.M)) (\\l.c))) (\\u2.K))"
    );
  }

  @Test
  public final void test277() {
    reducesTo(
      "\\p.\\p.\\d.\\v.(\\p.(\\s.R) T (\\k.(\\i.(\\o.e) q q) ((\\h.j W (\\m.o)) (i r P) (\\d.(\\a.\\z.i C) (\\b.(\\u.y) (e o))) (\\i.o)))) (\\p.H) (\\w.w) w",
      "\\p.\\p.\\d.\\v.R (\\k.e q) (\\w.w) w"
    );
  }

  @Test
  public final void test278() {
    reducesTo(
      "\\e.\\c.\\e.x",
      "\\e.\\c.\\e.x"
    );
  }

  @Test
  public final void test279() {
    reducesTo(
      "\\r.(\\x.\\p.\\p.L) x",
      "\\r.\\p.\\p.L"
    );
  }

  @Test
  public final void test280() {
    reducesTo(
      "(\\z.(\\o.(\\s.(\\m.(\\q.k ((\\e.\\p.\\i.z) (f g (\\d.r)))) l (\\l.p)) (\\h.(\\q.(\\n.\\f.\\c.N (R m)) e) (S (\\h.(\\h.b) ((\\s.o) (o b)) (s (\\g.m A (H F))))))) ((\\m.m) (\\r.v x) (\\p.y) (\\f.(\\c.G) ((\\x.(\\r.M) (\\j.e)) (\\f.x a d))) (\\f.(\\l.Z E) v) (\\b.(\\u.\\r.r) f))) (\\f.\\d.e (\\w.\\g.d (\\x.\\v.h ((\\b.U) (\\w.I) I (\\i.(\\p.m) (i N (u z)))) r)))) ((\\j.d) j)",
      "k (\\p.\\i.d) (\\l.p)"
    );
  }

  @Test
  public final void test281() {
    reducesTo(
      "(\\g.(\\e.j) (\\z.\\o.w)) (P ((\\m.(\\q.M) (\\e.I) (A w z) (G (s j (\\b.E)))) (\\f.l n F) (\\g.l) (g ((\\j.K d u) s) (E (h P) (y d (u l)) n) F) h))",
      "j"
    );
  }

  @Test
  public final void test282() {
    reducesTo(
      "\\w.X",
      "\\w.X"
    );
  }

  @Test
  public final void test283() {
    reducesTo(
      "d (\\m.a) ((\\s.\\y.n (\\f.l) (\\o.\\j.\\t.\\b.(\\i.g) (n C) (j p) (w W)) ((\\e.(\\n.\\w.U) (\\r.\\b.u)) (\\j.\\j.e (\\v.\\n.l))) e t) E)",
      "d (\\m.a) (\\y.n (\\f.l) (\\o.\\j.\\t.\\b.g (j p) (w W)) (\\w.U) e t)"
    );
  }

  @Test
  public final void test284() {
    reducesTo(
      "(\\j.n (\\b.\\j.s) (\\m.(\\u.\\o.\\j.d (v (i (\\d.y) (j (m a))))) l) (\\c.(\\c.\\i.i) ((\\o.(\\r.\\n.(\\y.v M) (\\t.\\s.e)) (\\d.d (E c) (\\c.g (\\w.m)))) (\\g.o (\\c.\\b.e (\\f.v) (o T e))) (\\f.\\k.w))) (\\c.K)) f",
      "n (\\b.\\j.s) (\\m.\\o.\\j.d (v (i (\\d.y) (j (m a))))) (\\c.\\i.i) (\\c.K)"
    );
  }

  @Test
  public final void test285() {
    reducesTo(
      "\\r.n (\\j.\\g.L)",
      "\\r.n (\\j.\\g.L)"
    );
  }

  @Test
  public final void test286() {
    reducesTo(
      "\\l.(\\i.(\\s.a) ((\\h.M (N (G (\\b.r)))) (A q))) (i ((\\i.w) y (\\w.U b) A n)) (b (\\f.(\\a.(\\d.s ((\\v.M) (\\f.a))) (h (\\m.\\n.O a))) (\\a.m Y (F w) (t A (\\x.d)) (f H (y v) (\\z.\\b.z q))) ((\\z.Z (B M) (\\z.y W v)) (\\w.d) ((\\n.I) (\\c.\\a.z (F (c v))))))) (\\v.j b) N",
      "\\l.a (b (\\f.s (M) (Z (B M) (\\z.y W v) (I)))) (\\v.j b) N"
    );
  }

  @Test
  public final void test287() {
    reducesTo(
      "(\\a.h ((\\a.\\y.r) (\\c.\\x.w (J y (f f)) (P (\\a.x)) (z (\\x.p)) (r (c (\\w.(\\r.\\w.g k) (\\y.\\f.N x)))) ((\\y.X) (\\j.\\c.(\\a.\\i.k) (\\c.\\g.F)) (\\o.\\x.\\y.s (j t) (x x (\\j.Q)) Z) (\\s.\\c.g))))) (\\h.E)",
      "h (\\y.r)"
    );
  }

  @Test
  public final void test288() {
    reducesTo(
      "\\q.a (\\h.\\r.\\b.\\x.u)",
      "\\q.a (\\h.\\r.\\b.\\x.u)"
    );
  }

  @Test
  public final void test289() {
    reducesTo(
      "\\v.b",
      "\\v.b"
    );
  }

  @Test
  public final void test290() {
    reducesTo(
      "\\n.\\d.(\\a.b) (\\r.(\\o.(\\k.F) ((\\m.(\\d.v) ((\\c.\\p.I n) (\\s.(\\v.j) c)) (\\w.\\u.O)) V)) k) ((\\x.\\l.\\t.\\s.B (\\q.\\u.\\f.C)) z)",
      "\\n.\\d.b (\\l.\\t.\\s.B (\\q.\\u.\\f.C))"
    );
  }

  @Test
  public final void test291() {
    reducesTo(
      "\\c.h",
      "\\c.h"
    );
  }

  @Test
  public final void test292() {
    reducesTo(
      "\\d.e (E n ((\\d.(\\o.g (\\z.o) (\\b.c (N o)) ((\\i.(\\q.l) (\\w.P)) (x t (\\a.L)))) (\\e.L (c A h (\\w.\\i.K))) (\\w.o)) (k L) ((\\u.e) ((\\k.j) b) i ((\\p.\\n.R (z (\\c.(\\o.\\f.\\c.g) (\\u.n (\\n.I))))) ((\\k.\\y.\\j.\\b.A (\\a.f)) (\\f.\\o.d) ((\\m.s) (\\i.S)))))))",
      "\\d.e (E n (g (\\z.\\e.L (c A h (\\w.\\i.K))) (\\b.c (N (\\e.L (c A h (\\w.\\i.K))))) (l) (\\w.o) (e i (\\n.R (z (\\c.\\f.\\c.g))))))"
    );
  }

  @Test
  public final void test293() {
    reducesTo(
      "(\\v.C) f",
      "C"
    );
  }

  @Test
  public final void test294() {
    reducesTo(
      "\\l.\\j.k (t (m (\\j.(\\z.g (a m (\\o.Y)) (t K (\\s.Z) (\\k.H))) K)) C) ((\\c.n (\\u.M) ((\\r.\\w.\\y.b) (\\b.\\y.G) j (\\o.M Q)) (\\v.V r U) ((\\c.(\\d.\\d.m) (X l (C p) r D) (\\m.d (\\h.\\v.(\\n.S) (\\k.e)) s)) (N r))) (\\z.w (\\o.J)))",
      "\\l.\\j.k (t (m (\\j.g (a m (\\o.Y)) (t K (\\s.Z) (\\k.H)))) C) (n (\\u.M) (b) (\\v.V r U) (m))"
    );
  }

  @Test
  public final void test295() {
    reducesTo(
      "(\\h.A) ((\\g.\\x.(\\k.(\\e.\\q.(\\f.(\\g.(\\v.m) ((\\t.(\\v.r) (Y o)) (w Q))) ((\\a.R) (\\o.\\e.\\e.\\l.s))) ((\\d.\\u.\\n.\\f.(\\x.Q) (w g) (\\f.\\k.C) (\\l.\\q.x)) ((\\a.f p (w X) E) (\\o.s ((\\d.t) (k q)))))) (\\y.M)) K) ((\\o.\\r.\\b.\\t.\\t.(\\v.b (\\z.q (\\m.p)) (r a (H e) (v i (p j))) ((\\u.P D (k u)) (w x (\\h.J)) (e d)) (\\d.\\g.\\s.(\\s.\\l.\\r.G) n)) ((\\z.y) (\\u.\\k.(\\g.\\y.(\\i.\\q.z c (T z) (\\e.E q)) o) ((\\o.\\g.D A (Q G) (\\b.\\e.q)) (\\h.I))))) (\\v.g)))",
      "A"
    );
  }

  @Test
  public final void test296() {
    reducesTo(
      "\\q.\\o.(\\u.(\\m.(\\m.\\e.\\l.k) (\\y.b)) (b (\\s.(\\j.n) ((\\d.T) ((\\a.X W (\\t.r)) (g (X O)))) (\\k.Y))) O) j",
      "\\q.\\o.\\l.k"
    );
  }

  @Test
  public final void test297() {
    reducesTo(
      "\\x.w ((\\t.\\y.\\p.y) ((\\o.M (\\x.\\v.(\\o.L h (\\c.h)) a (x y (\\s.d) ((\\s.B) (\\q.h))) ((\\f.Z) ((\\g.w) (D p)) (c (\\c.l (\\z.r)))))) n) (z (\\d.i)))",
      "\\x.w (\\p.z (\\d.i))"
    );
  }

  @Test
  public final void test298() {
    reducesTo(
      "\\f.f",
      "\\f.f"
    );
  }

  @Test
  public final void test299() {
    reducesTo(
      "\\o.x (\\n.b (\\w.\\w.\\m.\\b.J)) ((\\w.C) ((\\i.(\\g.Z ((\\b.G) (\\j.S) ((\\i.q) (\\f.a)) (\\x.\\i.\\e.\\v.\\p.\\h.H w) (n p (\\a.n) (\\g.a y (\\w.a)) (\\i.q (J N))))) (\\g.(\\k.J (\\r.U)) (\\m.(\\c.\\r.\\f.\\x.(\\e.f (w l Y)) (\\r.(\\r.o) (\\u.j) (\\n.\\v.x))) ((\\h.\\p.r d) (\\c.(\\a.z) (\\y.C)) (\\p.Z))))) q))",
      "\\o.x (\\n.b (\\w.\\w.\\m.\\b.J)) (C)"
    );
  }

  @Test
  public final void test300() {
    reducesTo(
      "(\\z.L) Q",
      "L"
    );
  }

  @Test
  public final void test301() {
    reducesTo(
      "Z (\\t.(\\g.\\h.\\e.\\v.s x (\\b.z) T ((\\z.c z (\\k.O)) (\\n.i)) (\\s.b) (\\j.f) n) ((\\n.\\z.(\\e.\\w.\\o.(\\u.\\g.\\r.(\\a.O E) (\\v.Q J) (\\e.\\f.o r)) (\\s.G)) (y r p (\\h.c) ((\\c.E) (\\z.p) (\\s.(\\t.y) (\\r.H))) (\\y.\\c.(\\m.v) (\\n.\\f.\\a.X (\\z.j))))) (\\p.y b)) (v c))",
      "Z (\\t.\\e.\\v.s x (\\b.z) T (c (\\n.i) (\\k.O)) (\\s.b) (\\j.f) n)"
    );
  }

  @Test
  public final void test302() {
    reducesTo(
      "\\p.I",
      "\\p.I"
    );
  }

  @Test
  public final void test303() {
    reducesTo(
      "v (N ((\\o.(\\j.\\a.\\d.G ((\\a.\\y.\\w.\\w.\\h.w) (\\k.u a (G m) (D (\\g.I)) (Z (v e (\\j.d)))))) c) (\\y.l)))",
      "v (N (\\a.\\d.G (\\y.\\w.\\w.\\h.w)))"
    );
  }

  @Test
  public final void test304() {
    reducesTo(
      "E (Y p)",
      "E (Y p)"
    );
  }

  @Test
  public final void test305() {
    reducesTo(
      "\\u.b (\\i.b)",
      "\\u.b (\\i.b)"
    );
  }

  @Test
  public final void test306() {
    reducesTo(
      "(\\n.\\h.c) (\\e.(\\o.k) (\\t.\\a.\\k.s)) ((\\h.\\z.\\o.b) y (\\n.\\u.I) l)",
      "c"
    );
  }

  @Test
  public final void test307() {
    reducesTo(
      "\\a.L",
      "\\a.L"
    );
  }

  @Test
  public final void test308() {
    reducesTo(
      "\\o.L",
      "\\o.L"
    );
  }

  @Test
  public final void test309() {
    reducesTo(
      "\\f.(\\j.r) (\\l.\\g.m)",
      "\\f.r"
    );
  }

  @Test
  public final void test310() {
    reducesTo(
      "\\o.\\q.(\\t.J) ((\\p.F) (\\y.N))",
      "\\o.\\q.J"
    );
  }

  @Test
  public final void test311() {
    reducesTo(
      "\\b.x",
      "\\b.x"
    );
  }

  @Test
  public final void test312() {
    reducesTo(
      "j (\\z.a)",
      "j (\\z.a)"
    );
  }

  @Test
  public final void test313() {
    reducesTo(
      "(\\e.\\o.\\h.(\\u.(\\x.\\z.\\a.(\\x.x) (\\p.w) ((\\g.b) (h k)) (k (\\z.i K (\\s.S))) (\\h.\\l.i) a (\\o.(\\t.\\r.\\l.(\\j.(\\s.\\f.R (o b (i b))) (i r (Y w) o)) ((\\o.t) (\\w.j) ((\\d.e) (\\g.n)) x)) O)) (\\i.(\\f.u (E (\\m.M) (\\a.(\\q.r) (i G)))) Q S (\\h.i k))) (\\j.k)) (\\g.(\\t.U) ((\\m.\\i.(\\m.\\e.h q) C J) ((\\y.\\n.(\\x.p m) t) (\\a.\\n.\\h.v)) (\\m.\\o.v)) G ((\\n.n) (\\o.(\\h.e l (\\t.g)) r z i ((\\z.(\\q.(\\x.a Z (q t)) (\\z.\\h.\\z.L)) (\\l.\\x.m)) (\\m.\\a.(\\z.(\\t.\\z.Q) (\\r.u a)) X)) (m (q (\\r.(\\x.\\t.w) ((\\z.b) A) ((\\w.\\e.\\e.s) O)))))))",
      "\\o.\\h1.\\z3.\\a4.w (k (\\z.i K (\\s.S))) (\\h.\\l.i) a4 (\\o.\\r6.\\l7.\\f.R (o b (i b)))"
    );
  }

  @Test
  public final void test314() {
    reducesTo(
      "\\n.\\f.(\\s.\\f.Y) (\\z.D)",
      "\\n.\\f.\\f.Y"
    );
  }

  @Test
  public final void test315() {
    reducesTo(
      "y (\\r.(\\u.(\\p.(\\w.(\\e.\\b.c p s (\\n.j)) ((\\s.\\d.\\m.B) (t j q)) (a (\\m.c))) (O (\\y.i))) (\\y.\\r.q ((\\f.b) (y z (Z i) ((\\i.M) w))) (\\s.(\\j.\\u.g) (p L (R m) k (\\l.(\\v.g) (G G) (e b (r t)))))) o) ((\\f.\\l.(\\j.m) X ((\\d.(\\y.f) (\\b.S)) ((\\f.D (X x (\\g.(\\h.s) (z w)))) (v L (\\b.n) (\\o.(\\s.U) (b p)) ((\\z.z) (z S) (J (d t))))))) ((\\m.(\\t.\\z.(\\l.\\x.\\o.\\c.\\y.\\o.Q) (J L (\\s.A) (\\z.\\i.\\v.C))) ((\\p.\\k.X) H)) (k ((\\d.(\\u.i) b) (\\f.D)) w) (W (\\u.u)))))",
      "y (\\r.c (\\y.\\r.q (b) (\\s.\\u.g)) s (\\n.j) o)"
    );
  }

  @Test
  public final void test316() {
    reducesTo(
      "\\o.h",
      "\\o.h"
    );
  }

  @Test
  public final void test317() {
    reducesTo(
      "\\k.w",
      "\\k.w"
    );
  }

  @Test
  public final void test318() {
    reducesTo(
      "f (R (\\z.\\u.\\k.J))",
      "f (R (\\z.\\u.\\k.J))"
    );
  }

  @Test
  public final void test319() {
    reducesTo(
      "(\\f.\\t.h (b (\\j.\\c.(\\v.b (\\g.\\u.x) (\\q.\\h.(\\z.g (\\j.N (\\z.K) (\\d.o g))) V)) ((\\n.R z) O g)))) ((\\z.\\i.\\r.\\u.(\\x.\\b.\\e.(\\j.y) ((\\f.(\\r.\\a.s) (\\r.m u (\\v.b) h (\\j.\\y.m t (Z d) f))) (\\l.\\b.z))) (\\c.(\\i.\\w.y) (d (\\l.q (R r) g ((\\g.\\b.W b) R)) (\\n.(\\h.m) ((\\t.Y w) (L (\\u.\\h.F e))))))) Y)",
      "\\t.h (b (\\j.\\c.b (\\g.\\u.x) (\\q.\\h.g (\\j.N (\\z.K) (\\d.o g)))))"
    );
  }

  @Test
  public final void test320() {
    reducesTo(
      "\\v.h",
      "\\v.h"
    );
  }

  @Test
  public final void test321() {
    reducesTo(
      "H (\\k.(\\c.(\\c.F (M s j) K) (e (\\i.\\q.d) j) l) (\\f.(\\p.\\o.u) F) (\\o.Z (o m (\\a.(\\z.k) (\\g.\\p.\\q.b) ((\\x.n) M))))) ((\\b.(\\o.g) (\\w.\\h.V) n (\\b.B (\\f.S)) (\\g.d (S (N (\\x.n j) ((\\u.x f (M D)) y (\\f.m (\\t.D))))))) (\\l.\\f.L (\\s.u) (\\k.u) (\\o.\\u.\\r.\\s.(\\n.\\u.(\\q.\\f.\\x.\\h.C) ((\\t.y) (\\v.g) (\\d.d z (q h)))) (\\c.\\t.m) (\\c.(\\x.\\i.\\i.Z (\\a.U)) (\\q.\\a.(\\q.\\h.j M) (o (\\x.\\d.\\s.y)))) (\\n.(\\o.\\m.\\j.\\t.B (\\l.\\k.(\\z.j j (\\d.w) (\\z.a m)) D)) q))))",
      "H (\\k.F (M s j) K l (\\o.Z (o m (\\a.k (n))))) (g n (\\b.B (\\f.S)) (\\g.d (S (N (\\x.n j) (x f (M D) (\\f.m (\\t.D)))))))"
    );
  }

  @Test
  public final void test322() {
    reducesTo(
      "\\v.Z z",
      "\\v.Z z"
    );
  }

  @Test
  public final void test323() {
    reducesTo(
      "\\j.(\\s.(\\m.Y) K) (\\i.(\\k.\\c.\\p.e) (\\f.h V C ((\\t.w) (M k)) (t (R g (\\h.t))) (\\t.l (k (\\o.\\u.U K))) (\\q.\\b.\\l.n) ((\\e.\\u.\\f.\\l.P p (\\n.I)) ((\\k.\\a.i t) ((\\q.h) (N i))) (f (\\c.(\\w.\\f.\\k.u) (\\s.j Q (\\k.o)))) (g (Z R (\\f.h))))) (\\d.P))",
      "\\j.Y"
    );
  }

  @Test
  public final void test324() {
    reducesTo(
      "(\\h.\\v.\\g.E z ((\\g.y ((\\r.(\\q.f) (m n)) (\\a.h) (\\h.\\z.(\\j.g) (n U) (\\r.\\h.w))) ((\\m.(\\f.J z k (\\t.(\\p.Y) (\\y.a))) ((\\o.y) (\\o.v) a)) (\\o.w))) (c E))) g (\\a.\\w.(\\h.\\x.f) i (\\m.\\e.(\\o.t) (\\x.R) (\\i.(\\c.\\k.X) ((\\b.(\\h.(\\b.\\r.\\q.\\j.(\\x.n) (u T)) (\\w.f)) (z (\\u.\\j.j))) (\\b.\\l.\\s.E)))))",
      "\\g1.E z (y (f (\\h.\\z.c E (\\r.\\h.w))) (J z k (\\t.Y)))"
    );
  }

  @Test
  public final void test325() {
    reducesTo(
      "\\u.(\\u.\\f.\\n.Z) ((\\z.\\k.(\\c.\\r.\\j.\\v.x) (\\e.y)) (\\s.\\i.J ((\\s.\\a.\\m.d) (L (\\w.B) J ((\\q.a M (T G)) (\\y.(\\g.c) (i H)))) ((\\v.x) ((\\o.\\l.\\g.P) (\\w.\\r.\\w.a)) (k (\\h.\\m.k (\\a.D i)))))) ((\\h.T (c (\\h.v) (C t (\\l.y))) (\\q.(\\f.(\\m.\\z.P) (\\h.b M (t s))) (t (\\f.m) (\\v.l))) (\\k.O (\\j.y t))) (\\v.\\s.(\\x.q) D) (\\f.\\u.\\f.\\y.V (e (\\o.g f (M m) (\\g.(\\i.Z) k) (\\y.P))) (\\t.q (\\k.\\h.(\\a.m) (\\r.(\\n.E) (\\w.\\m.x))) n))))",
      "\\u.\\f.\\n.Z"
    );
  }

  @Test
  public final void test326() {
    reducesTo(
      "\\d.h f",
      "\\d.h f"
    );
  }

  @Test
  public final void test327() {
    reducesTo(
      "(\\i.(\\h.(\\m.l) (\\f.(\\m.\\r.\\u.\\y.s) H) ((\\z.\\d.\\i.\\x.(\\g.\\q.\\m.\\g.\\z.\\y.m) ((\\o.b) (\\h.F Y (f J)) (w x (n i) (\\c.(\\n.q) (\\l.L))))) O m)) (a (\\q.K) ((\\x.d (\\v.\\l.\\m.m) ((\\r.A) ((\\g.\\m.\\a.P) (h f (l x))) (p (\\d.(\\a.a t u) n)))) s))) i",
      "l (\\i.\\x.\\q.\\m.\\g.\\z.\\y.m)"
    );
  }

  @Test
  public final void test328() {
    reducesTo(
      "\\y.r",
      "\\y.r"
    );
  }

  @Test
  public final void test329() {
    reducesTo(
      "\\z.a",
      "\\z.a"
    );
  }

  @Test
  public final void test330() {
    reducesTo(
      "v s (\\b.\\u.\\y.e (\\p.k ((\\x.\\l.c) (\\y.G (\\g.(\\v.\\v.b) m)))) ((\\w.\\v.n) (\\u.\\b.\\r.\\w.\\z.A K ((\\r.(\\k.\\f.B) (\\n.s)) (k E (k q) s ((\\z.\\o.p s) u))) ((\\y.(\\a.\\b.K) (\\q.G y (\\z.O)) ((\\w.(\\n.t) (\\i.w)) ((\\l.v) u))) (\\h.(\\n.\\s.\\e.\\v.(\\l.e) (V k)) (\\f.u)) ((\\b.(\\v.n x (E E)) j) (\\b.\\d.\\f.(\\i.\\l.v) (u j (z d))) g)))))",
      "v s (\\b.\\u.\\y.e (\\p.k (\\l.c)) (\\v.n))"
    );
  }

  @Test
  public final void test331() {
    reducesTo(
      "(\\r.(\\w.(\\g.Q ((\\i.(\\s.p) (V K) (x A) (y ((\\e.s) (\\c.G)))) o) I) ((\\d.(\\k.(\\m.m O (\\j.o)) (z a) w) D) (\\w.w) ((\\m.F ((\\g.\\y.\\m.t) (l r (\\x.f)))) (B (C Y))))) u) (P (\\d.X (\\p.\\l.\\i.e) ((\\w.A N (\\a.f)) (i E (l a))) (u w W (\\v.\\c.B) (\\b.\\j.G Z I (\\p.w b))) (f K (\\y.g) (I E (\\r.F)) (\\z.\\a.(\\c.o) (V p) (j t (\\o.p))) (\\a.J (X n) (\\p.k) (\\h.n))) (E (\\q.m)) s))",
      "Q (p (x A) (y (s))) I"
    );
  }

  @Test
  public final void test332() {
    reducesTo(
      "(\\a.\\l.\\d.\\d.\\j.\\c.\\c.q) (\\i.\\v.\\a.m C (\\d.u)) ((\\o.a) (\\s.(\\y.(\\f.(\\s.\\i.n Z) (\\a.\\b.W)) (z z (f T) (L i)) (\\z.(\\h.Z) (\\t.Y) (\\e.(\\j.k) P) q)) ((\\q.\\p.\\r.s f (\\i.m) (A Q (\\a.z))) (\\d.W F (\\i.Q) i) (o O w r g)) W ((\\c.\\s.c (\\n.k (\\v.\\j.q q (\\j.t) (o R (\\y.y)))) f) (\\y.k))))",
      "\\d.\\d.\\j.\\c.\\c.q"
    );
  }

  @Test
  public final void test333() {
    reducesTo(
      "\\z.\\p.\\t.b (\\t.(\\x.\\v.(\\x.(\\s.G) ((\\x.b n (M e)) A) (\\x.(\\m.c) X ((\\e.r) (\\g.f)))) (\\j.\\i.\\n.Z) ((\\z.(\\z.L) ((\\c.\\c.f) (m k (a E))) W) (\\i.(\\t.\\w.(\\o.a) (\\e.j) (\\m.a)) ((\\m.\\g.J b) ((\\x.i) E)) (\\a.M))) z) (\\h.\\n.\\o.\\u.t))",
      "\\z.\\p.\\t.b (\\t.\\v.G (\\x.c (r)) (L W) z)"
    );
  }

  @Test
  public final void test334() {
    reducesTo(
      "\\f.M (\\r.\\e.G ((\\d.\\x.b (\\v.z)) (N (\\o.q)) (B (\\t.P) ((\\r.\\e.\\b.\\q.N) (\\m.y) (\\u.(\\c.(\\y.\\k.\\k.X) (s I (\\a.S))) (\\t.\\r.v ((\\f.K) (\\d.q)))))))) c",
      "\\f.M (\\r.\\e.G (b (\\v.z))) c"
    );
  }

  @Test
  public final void test335() {
    reducesTo(
      "\\a.\\h.\\j.\\d.\\i.C",
      "\\a.\\h.\\j.\\d.\\i.C"
    );
  }

  @Test
  public final void test336() {
    reducesTo(
      "\\e.(\\h.\\m.\\q.C M) c (\\d.(\\v.(\\p.\\l.(\\h.\\g.\\a.\\d.l) (\\w.L) (\\d.\\n.(\\x.B) ((\\s.l (q n (\\t.J))) ((\\z.f) N (\\y.N X (d f)))))) (r (\\i.w)) h) q)",
      "\\e.\\q.C M"
    );
  }

  @Test
  public final void test337() {
    reducesTo(
      "(\\p.\\v.(\\a.(\\f.\\j.\\o.(\\h.i) e ((\\l.\\p.\\w.x ((\\x.e) (n j))) s) ((\\c.\\d.n h (y i) (m w (m u))) ((\\k.\\p.y M) a) ((\\p.A) (g i) (\\n.(\\m.m) (\\b.z)) ((\\a.t) (\\g.A) (R y H))))) S (\\d.y (\\j.I) P)) V) (\\i.\\w.\\w.i)",
      "\\v.\\o.i (\\p.\\w.x (e)) (n h (y i) (m w (m u)))"
    );
  }

  @Test
  public final void test338() {
    reducesTo(
      "(\\p.\\s.j T ((\\z.(\\n.(\\e.\\w.\\n.I) (\\v.\\f.\\q.l) u) (\\x.(\\y.(\\d.u ((\\o.c) (\\e.l))) (\\l.b)) ((\\i.p) d z ((\\q.\\x.\\n.g) (W A (R X))))) (\\y.\\j.(\\u.S) h ((\\h.F) (\\c.n)) (\\q.o (\\f.n (\\o.b))) (\\m.(\\w.(\\s.\\p.z) (v (K m))) (i w)) t)) Z)) (\\c.q)",
      "\\s.j T (I)"
    );
  }

  @Test
  public final void test339() {
    reducesTo(
      "v b ((\\i.(\\w.z) f) (b (\\d.(\\p.m N) (\\c.\\e.\\q.\\p.L))))",
      "v b (z)"
    );
  }

  @Test
  public final void test340() {
    reducesTo(
      "K (\\i.\\o.(\\m.(\\z.\\o.z (\\w.\\d.\\i.\\r.(\\j.Z ((\\u.P) ((\\w.\\s.\\y.Y) ((\\b.w) l)))) (L p))) H) (\\g.f))",
      "K (\\i.\\o.\\o.H (\\w.\\d.\\i.\\r.Z (P)))"
    );
  }

  @Test
  public final void test341() {
    reducesTo(
      "\\a.\\x.E (f H)",
      "\\a.\\x.E (f H)"
    );
  }

  @Test
  public final void test342() {
    reducesTo(
      "\\i.v",
      "\\i.v"
    );
  }

  @Test
  public final void test343() {
    reducesTo(
      "\\h.(\\b.G) (\\c.V)",
      "\\h.G"
    );
  }

  @Test
  public final void test344() {
    reducesTo(
      "(\\s.(\\n.\\m.y) (\\x.(\\l.h (\\v.\\f.k)) u (\\c.\\i.(\\s.p (\\b.h) i (\\a.\\q.\\b.n Y m)) N) z F)) (\\e.\\x.\\r.\\t.A (\\s.(\\g.O) ((\\v.(\\g.\\r.b (\\h.\\m.M)) (l l (s Z) (\\b.h J a))) (y (h q))) (\\t.\\m.\\z.(\\l.\\x.m) n)) (\\n.f))",
      "\\m.y"
    );
  }

  @Test
  public final void test345() {
    reducesTo(
      "\\i.Y (\\o.t (o e (\\x.Z) ((\\d.d) (k t)) r ((\\y.\\q.\\x.s) u) ((\\p.Z y r) (\\h.\\l.Y m) (h m (\\j.o) (\\a.\\s.T)) ((\\u.\\x.F Y) (\\y.\\q.\\u.e) (\\d.\\y.h h))) e) j)",
      "\\i.Y (\\o.t (o e (\\x.Z) (k t) r (\\q.\\x.s) (Z y r (h m (\\j.o) (\\a.\\s.T)) (F Y)) e) j)"
    );
  }

  @Test
  public final void test346() {
    reducesTo(
      "\\j.u (n ((\\k.\\w.(\\v.T) (\\v.\\t.(\\d.u) (\\t.y))) (\\l.\\t.K)))",
      "\\j.u (n (\\w.T))"
    );
  }

  @Test
  public final void test347() {
    reducesTo(
      "\\w.\\b.h",
      "\\w.\\b.h"
    );
  }

  @Test
  public final void test348() {
    reducesTo(
      "\\a.\\z.h",
      "\\a.\\z.h"
    );
  }

  @Test
  public final void test349() {
    reducesTo(
      "(\\j.(\\z.\\e.\\x.(\\o.\\e.\\w.\\g.\\j.y) (\\b.\\t.j v)) ((\\c.\\z.w W) (\\x.i (y x)) (H S W ((\\d.z) (i U))) d)) (\\s.(\\f.\\z.\\s.\\u.(\\x.j) e u c ((\\s.(\\g.k) ((\\r.z) (f h))) (a (\\j.\\d.v r)))) (P (\\g.\\v.X) q ((\\w.o (\\t.(\\p.a) (\\k.a))) (x j)))) (\\f.\\e.c) h (\\y.\\c.(\\f.\\o.(\\z.(\\b.B) (\\o.(\\g.e) (\\c.q) Y ((\\f.(\\s.L) ((\\c.R) (X e))) (K x))) (\\d.e (\\v.(\\c.z g (N f) a (\\k.(\\j.\\f.K) (d i o))) (\\h.R)))) Y) (\\f.e (\\u.a) w))",
      "\\w.\\g.\\j.y"
    );
  }

  @Test
  public final void test350() {
    reducesTo(
      "(\\u.(\\h.\\r.h) ((\\p.(\\q.a) e (\\n.h)) (\\f.R (\\h.A)) n)) ((\\o.(\\j.\\a.o) W) (\\a.f) ((\\c.h) (\\j.\\q.(\\o.E g (n j)) (\\h.S) ((\\e.m) (v b) (\\h.A)) ((\\w.n) E ((\\n.u) s) (\\v.\\q.\\o.(\\t.i) ((\\o.g) (\\t.K)))) (\\h.\\q.(\\w.\\t.\\k.w) ((\\z.v E (v h)) A) (C ((\\e.\\e.\\u.n) f)))) (f (\\o.c (\\p.(\\z.t (w (L s))) S)) (\\w.(\\w.(\\h.(\\p.\\q.d (a j (\\y.m))) (\\j.b (\\w.\\g.s))) (z V)) p))))",
      "\\r.a (\\n.h) n"
    );
  }

  @Test
  public final void test351() {
    reducesTo(
      "\\k.i (j ((\\d.\\q.\\z.\\l.e ((\\c.w) (\\q.\\h.\\s.m) (\\o.T))) (\\c.(\\f.n) ((\\u.n) ((\\e.f) (W z))) n)) (\\q.(\\g.\\d.w) (f K m ((\\d.b) (h O)) (\\o.(\\j.K) U) (\\r.(\\s.\\q.\\w.w ((\\u.L) (\\c.M))) (d q u ((\\k.u) (\\s.J)))) l)) c)",
      "\\k.i (j (\\q.\\z.\\l.e (w (\\o.T))) (\\q.\\d.w) c)"
    );
  }

  @Test
  public final void test352() {
    reducesTo(
      "t (e ((\\k.\\h.(\\v.(\\j.\\y.\\k.P) ((\\a.\\k.\\f.W) (\\i.h) (F R (\\l.v) (V Z (g N))))) ((\\x.g) e ((\\e.o) z) d ((\\k.U) j))) t) ((\\r.\\y.(\\g.h) ((\\x.S) ((\\z.N (\\i.V (M i))) W))) (\\r.\\w.(\\b.\\z.(\\h.x C (\\k.e) O e) b) (\\k.(\\l.\\x.(\\q.\\s.\\q.\\n.l d (k i)) l) d)) ((\\d.\\v.(\\e.(\\s.p A (\\z.u)) (\\y.d (W I)) (\\s.K s)) (i (D q U ((\\l.z) (\\k.J))))) ((\\n.\\e.\\t.(\\v.\\p.r) ((\\v.O) (v l))) J (\\q.(\\j.k g) V)) t)))",
      "t (e (\\h.\\y.\\k.P) (h))"
    );
  }

  @Test
  public final void test353() {
    reducesTo(
      "\\v.\\z.(\\x.H) w",
      "\\v.\\z.H"
    );
  }

  @Test
  public final void test354() {
    reducesTo(
      "\\d.\\t.\\j.\\h.l",
      "\\d.\\t.\\j.\\h.l"
    );
  }

  @Test
  public final void test355() {
    reducesTo(
      "(\\j.W (q (h h R)) (\\f.w D) w ((\\c.C) (\\i.k))) I (\\a.\\a.P) (\\i.l (\\r.(\\n.\\s.(\\y.u) d ((\\u.\\w.R) d)) x))",
      "W (q (h h R)) (\\f.w D) w (C) (\\a.\\a.P) (\\i.l (\\r.\\s.u (\\w.R)))"
    );
  }

  @Test
  public final void test356() {
    reducesTo(
      "\\d.\\i.(\\o.(\\s.c) (\\y.o (\\m.(\\z.\\d.O ((\\h.r) (X x)) (y ((\\n.T) (\\t.o))) (\\i.m)) (e D (\\i.Y) b (G (\\t.q) (a N)) i))) n) (\\c.J (\\q.\\d.\\w.v (\\w.B (\\u.\\y.w i (P d) (p (\\y.O)) (\\l.j)))) ((\\g.d ((\\m.(\\r.i L L) (\\a.\\b.S)) (\\e.\\y.\\p.E C R ((\\x.k) s)))) B ((\\c.(\\y.\\n.F) j) (\\a.\\r.\\n.L c) (I ((\\l.j) (\\l.e)) (v (o a (h B)))) (y (\\s.(\\e.t e (\\q.K)) (\\m.\\m.\\p.f)) ((\\j.\\l.(\\g.h l) (v G (w f))) I)))) (\\j.p))",
      "\\d.\\i.c n"
    );
  }

  @Test
  public final void test357() {
    reducesTo(
      "\\k.\\w.\\r.\\m.(\\b.\\w.i) (\\a.\\j.F)",
      "\\k.\\w.\\r.\\m.\\w.i"
    );
  }

  @Test
  public final void test358() {
    reducesTo(
      "\\r.\\y.(\\m.\\c.\\g.(\\g.\\j.\\y.D) ((\\e.\\n.X v (\\v.Y) ((\\c.w) (\\h.W))) ((\\u.b) p) (v m) (\\l.(\\h.\\e.P R) ((\\n.e) d) (e S (\\y.v) ((\\o.T) (\\z.H))) (Z D g)) (c ((\\l.\\k.\\y.\\w.\\n.\\y.r a) q E))) (j a)) O",
      "\\r.\\y.\\c.\\g.\\y.D"
    );
  }

  @Test
  public final void test359() {
    reducesTo(
      "h ((\\m.\\b.(\\g.E) ((\\k.\\u.H) l)) (\\c.(\\k.s) w)) ((\\a.\\s.(\\b.\\q.e (\\s.\\j.\\e.\\t.r P (f f)) t) (\\a.(\\p.\\f.\\g.V) (s (\\e.\\t.B) o))) (\\h.\\r.h) (\\s.\\j.(\\w.(\\x.\\n.\\v.\\w.\\f.(\\t.U) (\\e.\\w.K) (\\p.t g (x r))) ((\\t.\\a.V) ((\\r.i) (p o) (d j (\\n.g))))) (p (\\b.\\t.\\c.\\c.(\\v.u) (B x) (a (b u)) (A (\\d.\\u.Y)))) P)) (\\s.\\z.m (I (\\g.\\u.r ((\\l.\\a.m) (\\f.(\\t.\\p.P F) (K R (y I)) g)) ((\\d.\\v.\\w.J) (g u (A w)) (a (\\s.u) H) (r ((\\q.o) (U P)) ((\\e.v) (\\l.q) h)) (\\f.Q)))))",
      "h (\\b.E) (\\q.e (\\s.\\j.\\e.\\t.r P (f f)) t) (\\s.\\z.m (I (\\g.\\u.r (\\a.m) (J (\\f.Q)))))"
    );
  }

  @Test
  public final void test360() {
    reducesTo(
      "\\n.h (E (\\a.(\\g.a) (\\p.(\\v.(\\z.m) (\\w.I)) (\\b.x u (\\p.X)) ((\\i.\\w.y) l) (\\p.\\u.u ((\\r.j s (z o)) (\\p.(\\i.k) (B y))))) (\\k.\\v.\\v.l)) (\\f.p (m (Q ((\\j.\\u.\\i.\\h.(\\t.g (v f (L F))) L) (q z (Q s) (e W (\\g.m)) (\\c.\\o.f)))))))",
      "\\n.h (E (\\a.a (\\k.\\v.\\v.l)) (\\f.p (m (Q (\\u.\\i.\\h.g (v f (L F)))))))"
    );
  }

  @Test
  public final void test361() {
    reducesTo(
      "\\l.h",
      "\\l.h"
    );
  }

  @Test
  public final void test362() {
    reducesTo(
      "(\\t.\\r.h (\\j.(\\t.\\o.\\l.s (z (h ((\\c.C) (\\n.v)) B))) ((\\c.\\v.(\\w.\\s.w) V) (q (k u) (R s (\\r.Z))) (\\j.\\q.\\t.\\z.\\e.q (e T) c j) (q ((\\u.(\\l.z) v ((\\c.u) (\\x.f))) (\\d.J)))) (m (\\q.\\p.(\\j.s) G (\\u.A)) (\\h.Q)))) ((\\x.\\k.(\\u.d) ((\\i.b (\\p.(\\z.\\f.Z y) ((\\o.W) w) (\\m.\\j.t))) ((\\s.t b (\\f.k) (\\k.j)) (z (\\l.e)) f) ((\\e.\\t.\\p.\\d.m) (\\a.E)))) k)",
      "\\r.h (\\j.\\l.s (z (h (C) B)))"
    );
  }

  @Test
  public final void test363() {
    reducesTo(
      "\\j.\\f.Q (B (\\d.\\a.\\k.y))",
      "\\j.\\f.Q (B (\\d.\\a.\\k.y))"
    );
  }

  @Test
  public final void test364() {
    reducesTo(
      "I (\\g.\\s.C)",
      "I (\\g.\\s.C)"
    );
  }

  @Test
  public final void test365() {
    reducesTo(
      "\\x.i",
      "\\x.i"
    );
  }

  @Test
  public final void test366() {
    reducesTo(
      "\\r.\\b.\\i.(\\h.\\y.T) (P ((\\x.S) ((\\i.(\\d.\\f.K) (d X m) (w v (\\q.v) ((\\x.s) e)) T) y))) (\\y.\\w.(\\c.d) ((\\k.\\b.\\n.o (\\c.V j m)) o) (\\j.\\b.(\\z.(\\n.L (\\l.m)) (\\y.r) ((\\e.\\p.\\f.N) (\\m.j (j h))) (\\a.(\\b.\\f.x) (\\l.c) (\\g.(\\n.x) (\\w.U) (S z (\\h.K))))) P ((\\g.s ((\\f.\\o.\\t.\\j.q) ((\\b.g) (\\x.a) (t F (\\o.p))))) (f (R b F) (c h (y x) (M b (i z))) ((\\k.r) r U))) (\\b.\\p.\\h.z)))",
      "\\r.\\b.\\i.T"
    );
  }

  @Test
  public final void test367() {
    reducesTo(
      "\\o.\\j.\\g.h (d ((\\y.\\h.\\n.\\z.(\\f.S) ((\\z.\\e.\\y.\\z.c) (\\k.\\e.(\\b.\\g.k) (\\u.\\y.g)))) (\\g.\\m.\\p.\\p.n (\\h.o f (m a)) (t Y (f j) (\\n.\\l.h)) (Z A)) ((\\n.Z) (\\g.C (d ((\\h.p) (V C) (b (\\h.s)))))))) N",
      "\\o.\\j.\\g.h (d (\\n.\\z.S)) N"
    );
  }

  @Test
  public final void test368() {
    reducesTo(
      "\\c.B",
      "\\c.B"
    );
  }

  @Test
  public final void test369() {
    reducesTo(
      "n (\\p.\\o.(\\c.(\\x.x (\\c.\\j.\\f.x)) S l) (\\j.\\m.\\n.(\\d.\\x.n) (\\j.\\g.p))) ((\\h.f) ((\\l.T ((\\d.(\\n.(\\f.u) (a I)) (b (\\c.n))) (\\l.(\\e.X (\\w.D)) (\\w.\\m.f)) ((\\s.\\u.o) (\\p.\\o.H)))) z) (s ((\\d.(\\n.B) z) ((\\s.l q X) (r K (\\u.y)) (d (f (L y))) (\\e.v (\\r.m (\\b.B))) (\\w.\\c.\\i.(\\w.f (\\f.B (\\t.\\o.n))) v)))))",
      "n (\\p.\\o.S (\\c.\\j.\\f.S) l) (f (s (B)))"
    );
  }

  @Test
  public final void test370() {
    reducesTo(
      "\\v.z Z (\\f.(\\m.W b) N)",
      "\\v.z Z (\\f.W b)"
    );
  }

  @Test
  public final void test371() {
    reducesTo(
      "\\x.e",
      "\\x.e"
    );
  }

  @Test
  public final void test372() {
    reducesTo(
      "z (o (\\s.\\r.(\\d.d) e ((\\v.\\n.\\z.(\\v.\\o.\\f.\\b.\\d.p) d) l))) (\\g.M)",
      "z (o (\\s.\\r.e (\\n.\\z.\\o.\\f.\\b.\\d.p))) (\\g.M)"
    );
  }

  @Test
  public final void test373() {
    reducesTo(
      "V ((\\d.g ((\\w.\\m.\\o.(\\y.x J (\\q.a) (\\z.F)) (\\r.K f)) (V (u J) (\\m.S) (e u (\\w.R) A)))) a m (\\j.n (\\k.v)))",
      "V (g (\\m.\\o.x J (\\q.a) (\\z.F)) m (\\j.n (\\k.v)))"
    );
  }

  @Test
  public final void test374() {
    reducesTo(
      "\\l.x",
      "\\l.x"
    );
  }

  @Test
  public final void test375() {
    reducesTo(
      "\\z.l j D ((\\j.\\g.w G) U) (G ((\\q.m) ((\\t.m K (R o) (\\p.\\n.\\w.h)) (c b (\\c.o) (\\t.J D (\\c.T)))) (h (Q W (\\y.i) k) (o (p (K (\\f.n))))) ((\\u.(\\m.s) (\\b.e) (\\j.(\\i.Z) (f q)) (Y p (\\s.N) (\\m.x))) c i) a))",
      "\\z.l j D (\\g.w G) (G (m (h (Q W (\\y.i) k) (o (p (K (\\f.n))))) (s (\\j.Z) (Y p (\\s.N) (\\m.x)) i) a))"
    );
  }

  @Test
  public final void test376() {
    reducesTo(
      "(\\z.\\q.\\l.a) (\\n.\\m.\\y.\\f.(\\g.\\j.\\i.M) J ((\\q.q) i)) (\\y.(\\q.(\\i.n (\\o.\\v.g) (\\v.c) (\\l.\\a.(\\z.K) U)) ((\\e.(\\c.M) (\\c.Q o k)) p ((\\w.(\\e.S t (z x)) ((\\v.s) (z C))) ((\\s.n) (T u) (a R (i q)))) ((\\k.S) l (\\s.\\o.(\\b.\\y.\\r.\\v.W) (\\q.i))) (\\d.\\c.\\g.\\z.(\\f.\\a.\\f.\\s.(\\k.(\\j.z) j) (\\g.l) (\\g.F) (\\o.\\g.\\f.\\x.\\o.(\\y.n) y)) ((\\g.f T e (\\e.f)) (\\d.\\r.u) (k L))))) (\\v.\\k.f ((\\b.(\\w.\\x.(\\d.y) (\\z.M)) T ((\\z.R (c A) (Q e k)) E)) (\\o.\\k.x) D)))",
      "\\l.a"
    );
  }

  @Test
  public final void test377() {
    reducesTo(
      "\\n.b",
      "\\n.b"
    );
  }

  @Test
  public final void test378() {
    reducesTo(
      "(\\s.\\s.(\\u.(\\h.(\\v.\\l.j) (\\f.(\\n.(\\f.\\k.u) (B (\\l.c)) (e (D y L))) (e T (j g) (r U x) q))) ((\\u.\\s.(\\w.\\r.(\\z.k) (\\o.m) (\\q.z)) M) ((\\j.C) Z) l)) (W ((\\z.\\x.(\\d.\\y.R) (d (\\e.Q W (\\k.K)) (g (E i) z))) N)) (r (\\x.\\j.f ((\\n.D) (\\j.Q) l (S (\\k.O)) (\\i.T v (M b) (\\k.\\o.a) (M M (\\b.y) (\\c.C (\\n.x))))) (\\n.n)))) ((\\j.G) k)",
      "\\s.j"
    );
  }

  @Test
  public final void test379() {
    reducesTo(
      "(\\e.B) j",
      "B"
    );
  }

  @Test
  public final void test380() {
    reducesTo(
      "\\u.\\z.(\\f.h) ((\\y.(\\k.m) j) (\\l.b) (\\d.(\\l.\\g.(\\q.E) (\\k.j) (\\g.\\g.T)) ((\\a.p) f (\\y.m)) Q ((\\t.J) ((\\q.E) (\\i.f)) (g ((\\m.\\b.p v) (\\j.u r (I y))))))) (\\w.(\\h.\\o.(\\w.w) ((\\n.l) (\\e.\\a.\\g.\\r.d))) (\\n.b (\\v.\\d.(\\j.\\r.\\s.\\i.(\\p.\\c.p) X (r a y (\\m.\\l.H))) ((\\z.\\j.y s) (\\w.\\z.\\r.v) i)) ((\\c.\\b.l) (\\y.(\\w.Y) ((\\y.x) ((\\e.b k x) (\\x.R))))))) ((\\l.\\p.(\\m.f (r (F (h (r G) (\\q.(\\k.N) v))))) J) (\\e.(\\t.\\y.B) ((\\s.\\a.\\c.U) ((\\h.(\\q.v) (\\d.a)) (G (h y))) (e (v ((\\e.c) (c a)))) (\\i.(\\v.q) o))) (\\h.\\j.(\\h.(\\l.h) t) (c (h (x s) (A G) (\\m.\\w.\\n.(\\i.\\o.j o (\\f.z)) b)))))",
      "\\u.\\z.h (\\w.\\o.l) (f (r (F (h (r G) (\\q.N)))))"
    );
  }

  @Test
  public final void test381() {
    reducesTo(
      "\\s.\\i.\\s.(\\c.\\u.b) (\\b.\\u.(\\n.(\\e.\\k.f) (\\a.\\i.D)) (\\m.g) ((\\q.\\l.\\v.(\\w.c) ((\\j.i) ((\\p.(\\f.\\n.\\a.H) (u Y (f H))) (\\q.\\n.(\\c.a p) M)))) ((\\h.q) ((\\x.E) q) (G (p (\\t.\\e.Z f) s))) ((\\s.(\\q.i) ((\\y.\\s.N) ((\\i.l) t))) (\\h.f) A (\\f.(\\e.p) (\\k.\\y.(\\j.n) ((\\d.y) ((\\o.x) l)) (\\b.(\\a.(\\q.p m) (j (\\l.A))) (\\w.\\a.\\w.\\h.\\c.n)))))))",
      "\\s.\\i.\\s.\\u.b"
    );
  }

  @Test
  public final void test382() {
    reducesTo(
      "(\\g.(\\d.\\t.(\\i.k) (G X (D m) (x v)) (\\f.d) (\\z.o)) (\\z.\\y.\\k.\\j.\\a.\\f.\\p.(\\g.(\\c.\\h.\\m.(\\o.v) (C p)) T (\\j.\\c.\\s.Z)) (N r)) (\\c.(\\d.w) (m (\\t.B)))) (Y c) e",
      "k (\\f.\\z.\\y.\\k.\\j.\\a.\\f.\\p.\\m.v) (\\z.o) e"
    );
  }

  @Test
  public final void test383() {
    reducesTo(
      "C ((\\r.S (g ((\\f.J) ((\\p.i) (\\f.\\s.\\x.\\q.\\i.(\\t.u) ((\\b.u) (\\d.x)) (\\b.s)))))) (\\q.\\b.X))",
      "C (S (g (J)))"
    );
  }

  @Test
  public final void test384() {
    reducesTo(
      "\\l.\\r.C",
      "\\l.\\r.C"
    );
  }

  @Test
  public final void test385() {
    reducesTo(
      "\\c.\\a.\\w.t",
      "\\c.\\a.\\w.t"
    );
  }

  @Test
  public final void test386() {
    reducesTo(
      "\\k.\\t.S (U ((\\d.\\z.\\v.(\\w.(\\t.C) (\\g.E) S ((\\i.\\i.l n) s)) ((\\x.O) (\\j.z) ((\\p.x) (\\k.u)) (F (J q (H v)))) u) ((\\f.\\s.(\\h.(\\r.L) (\\v.g) (\\q.Y l (\\h.i))) (v ((\\u.s) q)) F) (z (\\x.C))))) (\\h.i q ((\\w.(\\f.l) ((\\c.\\s.C) ((\\u.a) (\\z.(\\f.(\\l.e) (\\y.F)) (t V (\\q.A))) (\\x.\\u.\\h.(\\b.I) (\\m.\\m.\\c.\\n.X K))))) N))",
      "\\k.\\t.S (U (\\z.\\v.C S (\\i.l n) u)) (\\h.i q (l))"
    );
  }

  @Test
  public final void test387() {
    reducesTo(
      "\\n.\\e.(\\a.\\y.\\g.\\i.m ((\\e.\\p.(\\n.\\h.\\f.\\p.w V) (\\i.\\q.z y (\\g.\\l.E))) (\\x.g) (\\f.\\b.n)) (\\o.\\y.(\\e.\\k.\\k.\\i.\\n.\\f.l) (q (\\p.(\\s.M) (\\k.(\\e.l) (\\y.H) (\\y.(\\t.s) (z l))) y)))) (\\l.\\l.(\\k.\\h.(\\x.(\\h.(\\t.\\f.(\\g.R) (x W) (R (\\k.d))) ((\\l.\\j.\\n.V) h) (k M ((\\l.e R (x e)) (a (\\u.E))))) (M O ((\\e.\\q.t) ((\\h.O) (f f))) a)) ((\\o.s (A (\\t.D)) (\\g.\\s.u)) (\\k.\\s.(\\f.(\\w.w B) R) (v D (\\p.Z) w)) (\\g.\\r.(\\g.(\\o.\\h.f ((\\o.n) (\\l.u))) (\\g.\\m.d)) ((\\h.\\e.E) q)))) j) ((\\e.\\n.\\d.\\f.(\\r.\\s.g ((\\t.a b (B x)) (K P)) (Y (\\a.L J N ((\\d.o) (\\o.B))))) l) (\\s.r (I ((\\t.(\\i.\\l.L) v) (H (z (t s)))))) j ((\\p.H) (\\a.\\y.(\\a.\\u.\\p.p) (\\w.\\k.\\i.A (\\r.\\j.I)))))",
      "\\n.\\e.\\g1.\\i.m (\\h.\\f.\\p.w V) (\\o.\\y.\\k.\\k.\\i.\\n.\\f.l)"
    );
  }

  @Test
  public final void test388() {
    reducesTo(
      "(\\h.(\\a.(\\q.(\\o.\\d.(\\k.\\l.i) (\\j.\\h.O)) (\\u.S)) (C (\\p.j) g) (\\z.\\y.\\z.\\p.\\b.\\r.a)) (\\t.(\\f.(\\z.T (U f) (P ((\\t.\\x.G) (\\v.\\t.P)))) (Z (V (B s) g (\\h.W)))) ((\\m.\\e.E) Y) r)) i",
      "\\l.i"
    );
  }

  @Test
  public final void test389() {
    reducesTo(
      "m (\\l.\\y.\\g.\\a.l)",
      "m (\\l.\\y.\\g.\\a.l)"
    );
  }

  @Test
  public final void test390() {
    reducesTo(
      "(\\t.(\\f.A) (\\m.(\\r.\\s.(\\u.\\c.\\a.(\\s.m E) (a j (p c))) n (\\c.(\\k.(\\r.c) (\\i.a)) (\\x.e) (\\m.\\m.(\\u.O t) i))) ((\\y.\\x.\\a.(\\i.p (T k (r q))) (e (\\m.r u (D Y)))) (\\k.\\z.(\\w.(\\u.\\o.a) g) (l ((\\l.o) (\\q.b)))))) (\\u.E)) L (G ((\\q.\\l.(\\k.\\y.\\a.(\\k.C c) ((\\i.a) y)) v h) (n (\\z.e (\\x.c) b) (\\l.(\\w.j) (\\x.\\g.A o) (o (\\n.n)))) I) (\\d.(\\h.S) z ((\\z.c ((\\d.a d) (d (O D)) ((\\k.p) h ((\\n.z) (\\z.U)))) (\\i.\\l.(\\j.(\\w.h (\\j.u o)) F) L)) (m D N c ((\\i.B (\\o.s)) (t (c c))) (e (\\j.(\\e.g b (\\s.l)) (\\p.B))) (\\e.(\\n.A) (\\b.(\\a.j) (\\w.\\j.(\\h.w S) h)))))))",
      "A (\\u.E) (G (\\a.C c) (\\d.S (c (a (d (O D)) (p (m D N c (B (\\o.s)) (e (\\j.g b (\\s.l))) (\\e.A)))) (\\i.\\l.h (\\j.u o)))))"
    );
  }

  @Test
  public final void test391() {
    reducesTo(
      "(\\p.(\\h.w) (\\k.C N ((\\f.s g h (\\p.\\k.h) (\\m.\\d.\\k.(\\o.\\e.d) (\\g.\\f.L))) ((\\o.N) (\\h.u h S) (\\l.\\e.(\\o.O) (\\r.b) ((\\y.Z) (f R)))) (j ((\\p.s (e v (\\j.S))) (\\l.\\l.(\\v.V) (C s) (\\i.w D)))))) (\\v.p)) (\\z.\\f.(\\r.W O ((\\f.L y) ((\\c.b) ((\\a.N) ((\\e.D) (J G))) (\\f.\\p.\\h.n))) (m ((\\e.\\k.(\\j.S) ((\\n.l) (c v) u)) (\\w.a)) (\\j.v (\\w.(\\a.\\e.S (r k h)) (\\z.w)) q))) (\\p.c))",
      "w (\\v1.\\z.\\f.W O (L y) (m (\\k.S) (\\j.v (\\w.\\e.S (c h)) q)))"
    );
  }

  @Test
  public final void test392() {
    reducesTo(
      "\\f.P (\\t.\\j.\\c.(\\c.\\l.\\l.x) (\\f.\\g.F)) T",
      "\\f.P (\\t.\\j.\\c.\\l.\\l.x) T"
    );
  }

  @Test
  public final void test393() {
    reducesTo(
      "\\l.(\\j.\\y.\\i.(\\r.B) (\\l.(\\p.z) F ((\\x.n i (O b) y Q) (\\g.\\v.\\a.(\\c.\\z.\\f.p) ((\\v.I) (\\c.o) (\\l.D))) k) b)) (V ((\\a.\\x.j) (\\z.(\\n.\\r.\\l.d) y) ((\\f.f) ((\\l.\\u.c) f))) (\\g.\\v.\\r.\\z.\\t.N))",
      "\\l.\\y.\\i.B"
    );
  }

  @Test
  public final void test394() {
    reducesTo(
      "\\j.(\\h.(\\b.t) (\\a.E) e) (Z f)",
      "\\j.t e"
    );
  }

  @Test
  public final void test395() {
    reducesTo(
      "(\\e.(\\n.(\\g.a) (H (\\c.W)) ((\\j.\\u.(\\z.M) S k) q ((\\x.\\u.\\o.\\m.\\p.F) u) (n (\\s.w))) (\\g.t W)) (\\b.(\\r.h) (\\n.\\k.(\\h.Q) ((\\w.G) W) K))) (o (\\l.(\\n.\\k.(\\x.H (\\i.P M (\\c.n) A v)) q ((\\w.R) ((\\i.\\w.p) i))) (\\s.\\i.e (\\b.h b))))",
      "a (M k (h)) (\\g.t W)"
    );
  }

  @Test
  public final void test396() {
    reducesTo(
      "\\u.(\\c.u) (\\k.\\q.(\\y.U ((\\a.v) J ((\\s.h) (\\c.i)) T)) ((\\l.d) (\\x.r) m)) ((\\p.\\k.(\\l.o) (\\q.\\h.s X (\\h.\\m.f)) z) (\\l.(\\t.\\w.C) (V d (\\t.F) (\\a.\\e.\\p.r) (\\x.H b l n))) (\\x.\\f.(\\a.u) X)) ((\\m.v) r) (\\s.\\p.\\r.g (h y ((\\f.(\\j.F ((\\c.z C (\\r.w)) (\\o.x l (\\i.S)))) ((\\n.m) (\\w.\\f.\\d.T) (\\q.\\z.(\\q.\\q.n) ((\\h.L) (R t))))) (F ((\\u.P (\\y.C)) (\\e.(\\c.\\y.m H) (\\e.r d (d g)))))) u))",
      "\\u.u (o z) (v) (\\s.\\p.\\r.g (h y (F (z C (\\r.w))) u))"
    );
  }

  @Test
  public final void test397() {
    reducesTo(
      "F ((\\h.(\\q.D) ((\\t.u ((\\v.\\m.\\a.J (w W) (U (h M))) (L u (b J) (e (\\k.o))))) (l (\\o.\\d.(\\z.p) X ((\\o.U) (\\z.i)) ((\\v.I) w U)))) (i ((\\t.X) ((\\d.U) (a g))) ((\\v.A) ((\\g.j) ((\\p.n) (t Y)))) (\\h.m) e)) ((\\j.\\y.y) ((\\c.l (\\t.(\\z.f) (\\p.C) (d z (g Q)))) L (\\d.H)) (\\w.t)))",
      "F (D (i (X) (A) (\\h.m) e))"
    );
  }

  @Test
  public final void test398() {
    reducesTo(
      "\\v.\\h.a",
      "\\v.\\h.a"
    );
  }

  @Test
  public final void test399() {
    reducesTo(
      "(\\f.K) ((\\r.w) o) (\\d.\\q.G)",
      "K (\\d.\\q.G)"
    );
  }

  @Test
  public final void test400() {
    reducesTo(
      "\\i.\\k.x (\\m.\\x.a m (\\d.D t F) m) v ((\\m.(\\a.s) (\\g.p) (\\f.A)) (\\p.n)) p ((\\p.o) ((\\v.\\s.(\\y.v) ((\\n.\\o.\\g.\\b.\\x.\\g.e c) (\\j.(\\k.e I (\\w.Z)) (e (\\j.i))) (\\q.\\q.(\\x.y) (e t) ((\\r.Q) (X h)) (\\p.C (X Z) (\\t.\\h.O))))) (\\h.K))) ((\\k.\\l.X ((\\j.(\\d.N) ((\\t.\\q.G ((\\w.w) (w m)) (i (b y (p x)))) (H j (q S) (\\c.\\y.L) ((\\i.H O c) v)))) L)) (\\o.T (p s p ((\\w.h) (Y H))) (d (Q (\\w.i))) (\\f.m) R (d ((\\o.\\c.C) (\\c.I)) m)))",
      "\\i.\\k.x (\\m.\\x.a m (\\d.D t F) m) v (s (\\f.A)) p (o) (\\l.X (N))"
    );
  }

  @Test
  public final void test401() {
    reducesTo(
      "\\z.\\v.\\f.\\t.R (\\x.t ((\\p.p) ((\\a.(\\q.\\u.M w (\\k.X) ((\\r.b) (\\z.y)) (N I w W)) ((\\y.h) (n H) (\\j.\\a.\\h.r) (\\m.\\t.\\x.(\\u.\\t.c) (k A (\\d.q))))) (\\q.c) (p (\\x.\\f.\\m.(\\w.\\v.\\h.Y) ((\\c.u) (\\h.o)) (T (Q K (r y)))) I))))",
      "\\z.\\v.\\f.\\t.R (\\x.t (M w (\\k.X) (b) (N I w W)))"
    );
  }

  @Test
  public final void test402() {
    reducesTo(
      "\\x.\\n.\\p.\\q.\\i.\\v.\\h.\\t.\\i.o",
      "\\x.\\n.\\p.\\q.\\i.\\v.\\h.\\t.\\i.o"
    );
  }

  @Test
  public final void test403() {
    reducesTo(
      "\\p.\\x.\\b.u (\\o.h b)",
      "\\p.\\x.\\b.u (\\o.h b)"
    );
  }

  @Test
  public final void test404() {
    reducesTo(
      "\\s.g",
      "\\s.g"
    );
  }

  @Test
  public final void test405() {
    reducesTo(
      "(\\a.t (\\h.(\\p.l ((\\b.\\e.d Z (\\l.I) e) (\\u.e)) k) (c ((\\a.\\g.y) (\\n.Z) e) (\\h.\\l.(\\r.\\d.\\o.\\a.(\\z.\\k.v) (\\s.\\h.u) x) a)))) y (\\f.s)",
      "t (\\h.l (\\e.d Z (\\l.I) e) k) (\\f.s)"
    );
  }

  @Test
  public final void test406() {
    reducesTo(
      "(\\x.u) W",
      "u"
    );
  }

  @Test
  public final void test407() {
    reducesTo(
      "\\n.(\\d.\\s.\\j.(\\g.p) ((\\t.\\c.(\\i.n J (\\v.y) T (\\w.\\v.\\r.(\\f.m) (S t))) ((\\s.(\\q.\\z.\\g.c) (s t (k q))) ((\\b.(\\w.P) A) (\\n.x)))) ((\\j.M) v) (K (\\x.(\\b.\\j.\\w.(\\g.\\p.(\\o.K) q) ((\\f.H) ((\\n.m) (\\v.O)))) (\\b.\\h.(\\j.\\a.\\j.m (c S)) ((\\a.q) (\\o.y) ((\\o.d) (t X)))))))) (\\t.e) (m (\\e.e (d (\\w.\\s.\\z.M)) (g ((\\k.o) (\\v.j))) (N (\\s.t) e)) (z H (\\k.\\b.x (H x) (\\v.Y))) (\\t.t ((\\b.(\\t.w) ((\\d.s) (\\u.u))) d ((\\k.(\\r.J) (\\p.d) (h Q (H m)) k) ((\\p.\\d.t) (\\i.x M g) (\\c.\\m.i n (E i) (l g (N j)))))) (x H r i (\\z.\\t.d))))",
      "\\n.\\j.p"
    );
  }

  @Test
  public final void test408() {
    reducesTo(
      "(\\q.O) (\\x.o (\\t.e (\\w.n (\\h.\\d.p) ((\\z.i) (\\i.N) (\\e.\\a.\\b.W)) y ((\\o.f) (\\g.l))))) ((\\m.\\p.\\h.(\\g.X (\\k.a (\\x.(\\a.S) (\\y.I)) (\\j.\\p.h))) ((\\w.Q) f ((\\v.b) x))) (\\c.s ((\\g.z) ((\\f.(\\j.\\p.\\k.o) N) I) (R (\\i.P ((\\x.i) (\\z.\\g.\\h.D)))))) (\\q.W ((\\f.L) ((\\u.\\q.\\m.(\\y.p) n (\\r.c G (X m) n T)) (\\x.c)))))",
      "O (\\h.X (\\k.a (\\x.S) (\\j.\\p.h)))"
    );
  }

  @Test
  public final void test409() {
    reducesTo(
      "(\\d.\\a.b (\\f.(\\l.(\\o.e) ((\\l.\\d.(\\r.q (\\r.\\c.(\\w.k Z) (\\t.D M))) (\\x.(\\l.w) (\\m.k) ((\\t.p) (V m)) (\\q.\\d.i))) (\\r.t (\\k.\\z.\\u.\\r.o ((\\j.n y) (U v (m s))))))) i)) (\\l.\\w.I ((\\b.Q) (\\f.j ((\\s.y (\\n.L (\\x.f ((\\b.Z) (\\w.n))))) H))))",
      "\\a.b (\\f.e)"
    );
  }

  @Test
  public final void test410() {
    reducesTo(
      "\\t.\\o.s",
      "\\t.\\o.s"
    );
  }

  @Test
  public final void test411() {
    reducesTo(
      "\\o.y",
      "\\o.y"
    );
  }

  @Test
  public final void test412() {
    reducesTo(
      "\\b.(\\k.\\q.x) a",
      "\\b.\\q.x"
    );
  }

  @Test
  public final void test413() {
    reducesTo(
      "a (\\b.\\w.n (\\n.\\c.\\d.J (\\r.\\y.(\\w.\\e.M (\\x.(\\z.o) Z (\\s.b y))) t) r l))",
      "a (\\b.\\w.n (\\n.\\c.\\d.J (\\r.\\y.\\e.M (\\x.o (\\s.b y))) r l))"
    );
  }

  @Test
  public final void test414() {
    reducesTo(
      "\\a.\\d.\\m.\\f.\\w.K y l u",
      "\\a.\\d.\\m.\\f.\\w.K y l u"
    );
  }

  @Test
  public final void test415() {
    reducesTo(
      "\\p.l (\\o.\\j.\\k.(\\d.\\p.(\\a.\\c.(\\z.H) O ((\\v.y) (e p)) (c (\\p.\\m.i l))) (\\z.\\e.s U (b g) M ((\\s.(\\b.x) r) (l (\\z.U)))) (\\m.(\\a.H) (\\d.\\c.(\\y.v N X v) (y (\\o.f (f Q))))) L (\\g.h c K)) (\\q.r))",
      "\\p.l (\\o.\\j.\\k.\\p.H (y) (H) L (\\g.h c K))"
    );
  }

  @Test
  public final void test416() {
    reducesTo(
      "h (\\u.\\d.m (\\n.h)) s",
      "h (\\u.\\d.m (\\n.h)) s"
    );
  }

  @Test
  public final void test417() {
    reducesTo(
      "\\n.\\s.(\\g.E l) ((\\s.\\r.l) ((\\c.(\\w.\\j.\\o.v) (O e (k i) ((\\p.G) (\\m.s)) (\\q.E w o (\\x.k)))) Z k) R)",
      "\\n.\\s.E l"
    );
  }

  @Test
  public final void test418() {
    reducesTo(
      "\\d.m",
      "\\d.m"
    );
  }

  @Test
  public final void test419() {
    reducesTo(
      "(\\m.(\\v.(\\j.j ((\\i.T Z (\\p.e) ((\\w.C) (j k))) (N ((\\y.v) (c X))) (\\r.(\\f.o) ((\\v.E) (l Y) (k (\\x.g)))))) (\\q.(\\q.(\\g.(\\h.g) ((\\w.u) (b O))) (f ((\\w.G) (X B)))) (x ((\\m.e) (l o)) v) d) ((\\k.(\\a.(\\n.(\\o.y W (\\h.Q)) (\\g.\\h.c g)) (\\k.R)) (\\e.\\h.\\n.(\\b.(\\p.u) ((\\b.u) (B l))) v)) (\\k.v) (\\l.\\k.B a (\\l.I C R) ((\\v.M) (d i) n) (h (\\i.w)) ((\\v.j) n ((\\t.\\s.\\p.I) ((\\v.R) (x g) r)))))) (\\e.V)) (\\v.\\n.\\r.z)",
      "f (G) d (y W (\\h.Q) (\\l.\\k.B a (\\l.I C R) (M n) (h (\\i.w)) (j (\\s.\\p.I))))"
    );
  }

  @Test
  public final void test420() {
    reducesTo(
      "\\c.(\\m.\\g.(\\r.(\\o.\\i.O) (\\h.\\j.S)) (P (l (\\w.t))) ((\\n.\\s.\\w.h) (\\r.U) (O h (O d) z))) (\\j.K) (\\h.(\\o.g (\\p.D)) ((\\v.A p (\\l.K C (j u))) u B)) (\\z.\\a.(\\t.\\a.\\m.s) (T (\\k.z l (s r) (\\k.f a (\\y.f))) (R (\\t.y))) (\\w.\\n.(\\v.v) ((\\c.\\m.q) (\\u.(\\o.\\b.h g) (\\k.h (\\l.q)) (e p (\\n.J) r))))) (\\h.l (\\x.(\\t.(\\c.z) ((\\z.(\\v.o m (\\v.k)) ((\\g.s) (Z Z))) (Q ((\\q.V) (b c))))) ((\\j.b (\\b.(\\g.D) (K B))) (n (\\z.\\o.e F)) o) (B (g ((\\f.G h L) (K P (\\q.a))) (\\n.\\j.m (f Y (\\t.y))))))) (\\b.\\k.\\e.N)",
      "\\c.O (\\z.\\a.\\m.s) (\\h.l (\\x.z (B (g (G h L) (\\n.\\j.m (f Y (\\t.y))))))) (\\b.\\k.\\e.N)"
    );
  }

  @Test
  public final void test421() {
    reducesTo(
      "\\w.(\\b.(\\q.I) (i d) (\\y.o (\\y.Q)) (\\d.(\\y.(\\x.d) (\\j.Q)) (\\s.\\i.t o)) w f (\\z.x) ((\\c.\\r.\\z.M) (\\b.k) (W I ((\\y.\\q.\\w.(\\j.o) O) ((\\i.u) (A n) (\\g.(\\y.l) y)))) (y (\\t.D) (\\x.\\v.(\\a.(\\h.(\\k.x) (\\d.\\e.H)) (w E i r)) (\\r.\\t.i ((\\o.G) (\\y.x)) (h ((\\j.t) M)))))) (a (\\v.\\i.K))) a",
      "\\w.I (\\y.o (\\y.Q)) (\\d.d) w f (\\z.x) (M) (a (\\v.\\i.K))"
    );
  }

  @Test
  public final void test422() {
    reducesTo(
      "\\n.(\\e.(\\t.z) (\\e.(\\c.\\f.(\\o.p J (p a) (i (E o))) (\\f.V) (\\l.v)) ((\\l.\\a.(\\v.y) e (\\d.v)) w) (\\z.z))) e i",
      "\\n.z i"
    );
  }

  @Test
  public final void test423() {
    reducesTo(
      "(\\b.o (\\s.\\j.i)) (p ((\\j.(\\y.U) n) (D ((\\r.d) j)) (\\w.P))) s (\\j.X) ((\\a.y (\\e.\\c.E)) (\\h.\\x.\\c.D))",
      "o (\\s.\\j.i) s (\\j.X) (y (\\e.\\c.E))"
    );
  }

  @Test
  public final void test424() {
    reducesTo(
      "(\\y.(\\g.r) (\\t.\\x.N (\\g.\\s.(\\r.u ((\\s.q) (H C))) (\\o.(\\w.J) O) (\\s.(\\r.L m (\\u.p)) (\\k.\\y.s c) (J T (\\s.R))))) (\\y.(\\h.\\j.b) (\\v.\\q.O) (\\p.\\e.\\t.g ((\\j.y (\\j.X) ((\\z.b) (\\x.h))) s) ((\\q.y) q ((\\w.a O) k ((\\q.N) (\\f.(\\f.K) (t u))))))) (\\e.\\o.\\w.(\\z.\\b.v t (\\h.M) ((\\r.Y p E) (q B (\\z.C)) (\\s.\\n.y)) (\\t.Y)) (\\i.n) (\\x.\\b.\\v.Y ((\\l.z) (\\u.f ((\\z.(\\p.d) (T V)) H ((\\n.\\z.v) (\\r.r b (\\y.d))))))))) h",
      "r (\\y.b) (\\e.\\o.\\w.v t (\\h.M) (Y p E (\\s.\\n.h)) (\\t.Y))"
    );
  }

  @Test
  public final void test425() {
    reducesTo(
      "\\o.\\s.\\v.\\k.\\a.(\\s.R (\\j.\\m.\\w.\\s.\\l.\\o.x p)) (\\m.\\b.o (\\v.\\e.(\\f.(\\b.t) (\\r.E)) (\\n.\\h.(\\l.\\v.P) (\\j.\\p.h z) (\\p.\\m.(\\e.d) (\\q.l j)) ((\\p.r) ((\\i.r) u))) A)) (\\k.(\\s.\\u.\\o.\\s.(\\h.x (\\r.\\j.(\\t.F) (\\o.g) (U (K r (\\k.p) g)))) a) (\\r.\\f.Q) (\\d.\\d.(\\s.\\a.\\c.(\\l.\\w.m) w ((\\n.\\o.\\o.E ((\\f.j c (\\i.z) (g e (d j))) (S (\\n.\\p.\\e.j)))) (\\n.c ((\\r.\\k.a) ((\\q.E) (\\d.\\m.\\p.z)))))) ((\\p.x n) (z G) h ((\\n.a) (\\m.a (\\v.\\s.p) f)))))",
      "\\o.\\s.\\v.\\k.\\a.R (\\j.\\m.\\w.\\s.\\l.\\o.x p) (\\k.\\o.\\s.x (\\r.\\j.F (U (K r (\\k.p) g))))"
    );
  }

  @Test
  public final void test426() {
    reducesTo(
      "(\\v.N (\\p.V (D n)) ((\\f.\\z.S O) (a M Y))) (Y (\\v.(\\j.a H) (S (s U)))) (y (\\a.(\\l.I) (\\p.\\t.j ((\\p.V) H)))) ((\\b.(\\n.(\\y.\\f.\\j.P) h (\\r.\\s.\\j.(\\q.\\g.c) ((\\n.Z) (\\r.S)))) (\\z.(\\d.(\\r.u) (l h (\\u.Z))) (x s (\\q.s) w))) (\\j.(\\d.\\w.(\\k.o) m ((\\t.V) (C u)) z) (\\e.(\\r.\\l.\\s.\\r.x) (\\j.\\z.\\i.s (R (\\c.e)))))) (p (\\o.D P z E A (\\m.v)) (\\x.(\\n.(\\j.d) ((\\k.(\\n.u) (\\z.J) ((\\q.o) (u p))) f)) (\\k.\\p.C h (\\w.K) (\\a.\\h.B x) (x V (m Y) (S (M m))) (l f)))) ((\\a.\\n.f) (\\f.(\\k.m) Q) (\\v.\\h.l) (\\e.(\\l.\\h.M M ((\\t.X) ((\\x.(\\d.s) (j s)) (\\g.\\x.\\e.m))) g) (Y (\\l.\\c.(\\d.\\u.\\k.U (\\h.A o (f j) (Z K))) (g (x j) (x q n (\\w.(\\b.v) (\\r.k)))))))) (o (\\t.m) (\\c.\\c.g) (\\a.(\\c.r (k (\\t.(\\w.Y) (\\f.w))) (\\v.\\x.n)) (\\s.\\v.a O) ((\\t.\\h.\\k.\\s.\\c.I b ((\\i.X i r U) ((\\q.V e) (\\c.q)))) ((\\k.Y) (\\o.\\n.n y) ((\\v.\\l.h) q) (\\f.\\p.Q (m (\\i.l)))) s)))",
      "N (\\p.V (D n)) (\\z.S O) (y (\\a.I)) (\\j.P) (p (\\o.D P z E A (\\m.v)) (\\x.d)) (f (\\e.\\h.M M (X) g)) (o (\\t.m) (\\c.\\c.g) (\\a.r (k (\\t.Y)) (\\v.\\x.n) (\\k.\\s.\\c.I b (X (V e) r U))))"
    );
  }

  @Test
  public final void test427() {
    reducesTo(
      "(\\g.P Z) (\\k.(\\y.W ((\\n.\\z.y (\\n.K v)) (\\k.(\\e.v) (\\b.y) (i (D R)) (\\w.\\m.(\\u.o t) (B (\\p.o))))) (\\c.(\\y.\\m.\\w.(\\b.T) (\\e.(\\p.j) ((\\p.\\w.\\l.C) (\\r.\\d.p R)))) ((\\s.a) ((\\h.\\b.\\d.\\d.(\\f.J) (\\i.h)) ((\\i.\\b.r s) ((\\h.z) (q v))))))) (\\n.g ((\\n.\\u.d) G)) p)",
      "P Z"
    );
  }

  @Test
  public final void test428() {
    reducesTo(
      "(\\m.g ((\\k.N) ((\\n.O) ((\\v.\\s.a n) ((\\y.s) (\\a.p))))) (\\b.L)) (\\d.\\d.o (\\q.\\c.\\a.\\t.(\\i.\\b.M ((\\m.v) (\\e.\\q.\\v.o))) q)) (\\r.q) ((\\i.\\e.(\\y.l (\\p.(\\h.\\z.\\u.\\h.(\\z.o) L) s)) (\\q.k)) x)",
      "g (N) (\\b.L) (\\r.q) (\\e.l (\\p.\\z.\\u.\\h.o))"
    );
  }

  @Test
  public final void test429() {
    reducesTo(
      "(\\l.\\p.\\m.W v) (\\p.Q ((\\u.S) j))",
      "\\p.\\m.W v"
    );
  }

  @Test
  public final void test430() {
    reducesTo(
      "\\u.(\\b.\\p.\\c.\\x.f) (\\t.\\g.(\\j.(\\m.\\e.\\p.\\r.G ((\\c.o W) (f (h b)))) j) ((\\v.C (U q (\\r.J) (\\y.\\r.A w))) ((\\q.\\p.\\i.v) (\\g.G R (\\c.x)) (\\g.\\u.\\t.\\v.\\i.t))) (\\h.a W) (\\c.\\o.\\n.q) (\\k.(\\z.\\j.a) (\\o.\\s.t)))",
      "\\u.\\p.\\c.\\x.f"
    );
  }

  @Test
  public final void test431() {
    reducesTo(
      "\\t.(\\e.P) ((\\l.s (Z B)) b ((\\h.\\x.(\\s.c (\\f.(\\i.\\i.n) x)) (\\o.(\\x.\\d.I T) b ((\\r.\\u.K n) (m G (\\h.E))))) ((\\e.\\t.(\\x.\\e.(\\b.Q b) (\\l.\\q.D)) ((\\n.\\e.K) z)) (\\m.\\y.(\\j.\\d.\\e.i I (\\w.r)) S)))) r ((\\y.W) a)",
      "\\t.P r (W)"
    );
  }

  @Test
  public final void test432() {
    reducesTo(
      "\\m.n (\\l.\\v.(\\s.b (\\g.\\h.\\t.\\t.e)) (f e))",
      "\\m.n (\\l.\\v.b (\\g.\\h.\\t.\\t.e))"
    );
  }

  @Test
  public final void test433() {
    reducesTo(
      "U (v ((\\g.(\\j.G) ((\\m.b) (\\c.(\\q.J) (P W) (\\d.A (\\p.y)))) (\\u.\\w.(\\j.r) Y)) ((\\u.y) r)) z)",
      "U (v (G (\\u.\\w.r)) z)"
    );
  }

  @Test
  public final void test434() {
    reducesTo(
      "\\k.\\s.\\s.\\j.(\\g.\\y.\\i.(\\h.h (\\y.J (\\i.(\\t.f) (m L)) (K t (k u) (i (\\z.p))))) (z ((\\k.m) C)) (m ((\\f.y) (Z X (\\t.P)) (\\y.(\\t.N) (t a) (\\g.e z)) (\\x.\\l.\\s.(\\q.o) (\\m.m (\\a.u) x)))) (h a) (\\k.\\v.f)) ((\\e.g) (\\x.N))",
      "\\k.\\s.\\s.\\j.\\y.\\i.z (m) (\\y.J (\\i.f) (K t (k u) (i (\\z.p)))) (m (y (\\y.N (\\g.e z)) (\\x.\\l.\\s.o))) (h a) (\\k.\\v.f)"
    );
  }

  @Test
  public final void test435() {
    reducesTo(
      "\\q.(\\h.r) (\\y.\\b.(\\p.\\x.\\g.(\\x.L) ((\\r.\\e.\\p.J) (\\v.r)) j) ((\\d.\\e.\\z.k) ((\\y.\\d.(\\a.\\k.\\e.\\y.\\n.\\f.F) (\\b.\\m.b e)) (\\w.J) (\\m.\\s.\\w.(\\s.\\q.\\p.(\\p.J i) (x N (T C)) (\\v.f (\\n.Y L))) ((\\w.\\t.\\n.W) (o (\\i.u) (\\c.\\k.f))))))) ((\\w.(\\t.(\\v.(\\n.e) (\\i.H) (\\g.\\i.\\c.w)) (y P u T) (l (\\y.w))) ((\\u.l f (\\w.A) (\\f.(\\f.s) x) P) c) (d (n (\\h.S)))) w c)",
      "\\q.r (e (\\g.\\i.\\c.w) (l (\\y.w)) (d (n (\\h.S))) c)"
    );
  }

  @Test
  public final void test436() {
    reducesTo(
      "(\\r.\\c.\\o.(\\e.(\\c.\\k.\\c.\\j.W) (\\e.g (F T r))) d) (\\u.B (\\c.(\\k.J h) (\\g.f)) (F ((\\i.\\u.z D) e) (q ((\\y.E) (\\e.l)) (\\n.n))))",
      "\\c.\\o.\\k.\\c.\\j.W"
    );
  }

  @Test
  public final void test437() {
    reducesTo(
      "\\h.(\\k.x l) (E (\\b.(\\h.a (\\q.\\u.m y (y j) (\\b.(\\u.D) (j x)) (\\g.\\y.\\d.\\w.\\s.(\\f.l) (c m)) (\\e.q)) f) (\\n.j (\\l.\\c.i))))",
      "\\h.x l"
    );
  }

  @Test
  public final void test438() {
    reducesTo(
      "(\\r.(\\d.(\\m.\\w.\\v.w) (\\e.z T) (\\w.e) ((\\b.\\b.g) r (\\s.k))) o i (\\d.\\x.t) (\\e.B (\\m.p (k (\\f.M))))) (\\s.\\r.(\\t.\\q.\\c.z) ((\\u.p) ((\\y.(\\a.\\a.(\\c.a) ((\\h.\\v.\\l.E) (v j (p N)))) q) (q ((\\l.I) (\\e.\\q.\\b.\\c.(\\t.e) (l k))))) (N (\\e.\\i.h (O d ((\\t.\\b.p) (\\g.\\r.\\u.w s)))))))",
      "e (\\d.\\x.t) (\\e.B (\\m.p (k (\\f.M))))"
    );
  }

  @Test
  public final void test439() {
    reducesTo(
      "\\h.\\o.\\v.w Q",
      "\\h.\\o.\\v.w Q"
    );
  }

  @Test
  public final void test440() {
    reducesTo(
      "(\\u.\\b.p ((\\l.\\o.\\u.f ((\\x.(\\m.p) Y) (\\q.V))) x)) ((\\g.\\y.\\r.\\e.\\i.\\n.\\n.Z (\\j.u) q (\\z.A (\\j.\\z.c))) (\\q.F (g ((\\c.(\\y.f) v ((\\c.x) (\\u.R))) ((\\m.V) (\\j.\\c.f Y))))) (\\r.\\r.(\\z.b) V) f)",
      "\\b.p (\\o.\\u.f (p))"
    );
  }

  @Test
  public final void test441() {
    reducesTo(
      "\\k.\\i.(\\r.(\\n.\\b.\\u.\\b.(\\m.e) T) (\\y.g) ((\\e.(\\p.(\\q.\\p.\\d.w (\\f.d) (M (\\e.l))) ((\\g.(\\a.n) (u (q p))) (h ((\\t.x) (e B)))) ((\\o.C) (\\z.F (\\f.z)) Q (\\p.f))) C) ((\\k.\\x.(\\s.(\\p.(\\l.m) t h) ((\\u.\\f.d (a (c j))) p)) (w (z (\\l.\\w.\\b.T) (F (\\j.s) (a (\\v.k)))))) m))) (W (k ((\\u.q) ((\\z.\\f.(\\k.s (\\u.K)) c) ((\\l.A) (\\g.(\\l.z) f x ((\\d.\\s.\\n.r) (\\u.n))))))))",
      "\\k.\\i.\\u.\\b.e"
    );
  }

  @Test
  public final void test442() {
    reducesTo(
      "(\\v.\\z.\\p.Y) (m ((\\r.j) ((\\c.\\w.\\v.J) (\\o.(\\z.f) K) ((\\k.R) (\\i.I) (P (\\c.i))) (\\v.\\x.\\l.W C))) ((\\y.(\\o.\\s.B) (\\n.W)) n ((\\e.r) ((\\y.U) (\\g.\\l.C (c J) (z (v I)) (\\e.\\c.m w (\\z.V) x))))) (a (\\i.\\s.u ((\\z.\\t.g) X))))",
      "\\z.\\p.Y"
    );
  }

  @Test
  public final void test443() {
    reducesTo(
      "\\l.\\g.\\n.\\c.\\v.F O",
      "\\l.\\g.\\n.\\c.\\v.F O"
    );
  }

}
