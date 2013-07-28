package lambdacalc;

import org.junit.Test;

public final class TestBetaReducer6 extends ATestBetaReducer {

  @Test
  public final void test0() {
    reducesTo(
      "(\\m.\\t.(\\i.\\c.\\w.(\\u.\\q.(\\w.(\\z.p) F) X (\\z.\\c.(\\l.\\d.i) (\\a.T) ((\\h.\\q.i) (Z d (\\e.u))))) ((\\q.\\g.r) (\\e.x Z (\\s.(\\m.e i) U)))) ((\\c.\\u.\\r.\\q.\\f.p ((\\x.c r (x c) (e P j)) (\\k.(\\d.\\f.P) (z d f)))) P) ((\\q.\\m.(\\o.q d (u v) (a (\\j.m))) (\\e.(\\n.m L) (\\u.\\t.D))) (\\s.u (\\u.(\\l.g O x) (\\g.\\q.\\m.X))) (\\u.\\u.(\\w.\\m.L d) (Y d (j N) Y ((\\f.\\z.f a) (w S (y y))))) ((\\g.(\\c.G) (x d) (\\z.\\q.i m) (\\h.G e B ((\\i.t) (z r)))) H (\\p.\\q.s))) (\\e.(\\f.\\u.\\z.b (\\m.\\i.\\t.a) ((\\i.Z) (f K) (t (P j))) (\\r.f (\\b.\\d.c ((\\a.h) (\\w.W)))) p) ((\\i.Z) x (\\a.(\\a.o (\\a.(\\f.\\x.\\l.g) ((\\o.y) (\\u.L)))) (\\c.W))) h)) (\\w.q)",
      "\\t.\\q.p (\\z2.\\c.\\u.\\r.\\q.\\f.p (P r (\\f.P) (e P j)))"
    );
  }

  @Test
  public final void test1() {
    reducesTo(
      "R ((\\z.(\\s.(\\c.l) (\\p.(\\b.\\f.V) h a)) (\\r.u ((\\u.F (\\n.k c (\\b.c) (a A (g Q)) (\\t.\\j.\\o.(\\f.d) (k o)))) ((\\k.a a (\\v.p)) (t T y) (T (\\t.l F (w O))) (\\c.v))))) (\\d.\\t.(\\a.b) (\\k.g)))",
      "R (l)"
    );
  }

  @Test
  public final void test2() {
    reducesTo(
      "\\h.\\a.(\\z.i) (\\i.(\\c.\\t.(\\d.\\r.B (\\o.r (\\r.\\i.\\x.(\\a.\\k.e) (\\j.\\q.E) ((\\q.n) (\\t.z u))))) (y (\\i.\\m.\\h.(\\a.R L (\\c.q) (\\a.b f)) (\\i.\\l.\\r.\\w.x (\\r.c))) (\\g.\\c.(\\k.G) (\\h.\\s.v)))) (\\x.i o ((\\x.\\n.X V ((\\b.\\e.y) (\\q.\\z.\\w.g))) ((\\u.K) (\\n.\\r.\\e.(\\y.\\p.\\i.\\o.I Q (\\c.Q)) (\\e.p)))))) ((\\z.\\v.Z (\\q.n) (\\n.(\\b.(\\e.(\\b.G) (m j)) ((\\l.t) (\\z.s)) T ((\\t.i) F)) e) ((\\u.\\q.\\d.(\\i.b) (I (U q ((\\h.Y) s)))) (\\r.i))) (\\r.\\l.(\\u.(\\w.\\i.(\\u.m) v) (\\r.\\j.T) (\\v.\\q.\\m.t)) v w))",
      "\\h.\\a.i (\\v.Z (\\q.n) (\\n.G T (i)) (\\q.\\d.b))"
    );
  }

  @Test
  public final void test3() {
    reducesTo(
      "\\f.g ((\\v.\\o.n) ((\\h.o) ((\\o.c) w) S ((\\y.(\\o.U (h (f M)) m (\\d.\\z.\\f.\\l.S)) (\\j.(\\u.r (\\z.z)) (f (k k)) (p (\\p.w E (\\w.d))) ((\\l.d j (s E) (\\g.\\e.\\e.j)) (\\n.(\\k.U l (\\n.f)) G)))) (\\e.(\\v.\\d.\\q.\\u.C) o g))))",
      "\\f.g (\\o.n)"
    );
  }

  @Test
  public final void test4() {
    reducesTo(
      "\\z.e",
      "\\z.e"
    );
  }

  @Test
  public final void test5() {
    reducesTo(
      "\\x.(\\g.n (\\e.(\\a.\\i.\\c.c) (\\f.\\s.(\\d.i) (\\f.\\c.(\\v.\\h.O) (B m (\\l.e))) (O (\\s.f) (\\a.h) m))) ((\\k.h ((\\d.(\\i.\\g.\\m.(\\b.\\d.y) (\\y.\\x.Y)) (\\e.\\w.k)) d)) e) (\\h.(\\i.(\\u.\\z.(\\c.p) ((\\p.\\t.S) ((\\c.\\q.Q (\\w.B) (\\d.m r)) G))) (B (\\e.\\z.r) ((\\v.\\x.s) e))) (d ((\\d.\\v.\\d.\\u.\\m.X (\\y.\\t.\\c.\\t.H w (d E)) (\\j.o)) ((\\e.\\b.l) (\\n.g (E d Z ((\\q.R) (\\c.a))))))))) ((\\v.(\\f.\\g.g) ((\\m.K) B)) m (\\t.(\\x.(\\q.(\\y.\\w.M) u) (\\q.P)) (\\u.I)) ((\\a.x (\\h.w)) (\\x.t) O) (s ((\\s.i) H)))",
      "\\x.n (\\e.\\i.\\c.c) (h (\\g.\\m.\\d.y)) (\\h.\\z.p)"
    );
  }

  @Test
  public final void test6() {
    reducesTo(
      "\\m.\\h.H r y (\\b.\\f.n) ((\\i.J) i)",
      "\\m.\\h.H r y (\\b.\\f.n) (J)"
    );
  }

  @Test
  public final void test7() {
    reducesTo(
      "\\o.k",
      "\\o.k"
    );
  }

  @Test
  public final void test8() {
    reducesTo(
      "(\\h.\\a.(\\r.(\\m.r) (\\v.p)) (\\r.\\k.c (g (W E)) (X L (\\i.\\z.(\\r.k) (\\c.\\j.\\c.M) (\\h.(\\n.z v) (\\r.Z j)))))) ((\\g.\\e.(\\q.\\d.\\g.\\o.o) (\\v.x)) (\\l.f)) (\\i.\\h.Q) (\\l.\\b.z)",
      "\\k.c (g (W E)) (X L (\\i.\\z.k (\\h.z v)))"
    );
  }

  @Test
  public final void test9() {
    reducesTo(
      "(\\m.i) ((\\o.\\d.\\x.\\k.U o l ((\\r.\\x.\\a.d (\\p.\\o.\\v.(\\o.t) (\\v.x))) (\\i.\\c.(\\j.\\m.(\\r.M) ((\\t.F) (M M))) (J s (\\g.J) O))) (\\j.\\e.P (\\n.(\\d.Y) (\\q.O) (W m (s M)) (\\g.y (\\y.u) (\\s.\\j.s)) Q))) (\\u.Q)) W",
      "i W"
    );
  }

  @Test
  public final void test10() {
    reducesTo(
      "\\f.W",
      "\\f.W"
    );
  }

  @Test
  public final void test11() {
    reducesTo(
      "(\\n.\\l.\\z.\\t.(\\l.y k ((\\q.\\u.y p ((\\w.x) (E j))) (D (\\b.Q) (\\j.(\\b.X) (\\y.N)))) (\\w.(\\g.(\\n.\\d.\\g.\\s.h) o) (N A (a v) (\\t.(\\g.S) (y x)) z)) ((\\y.Z W) (\\o.(\\a.X) ((\\d.\\j.\\o.f) (\\d.d B (\\m.T)))) (\\e.z))) z ((\\g.(\\j.(\\o.\\f.u (v (\\m.S) (\\s.(\\w.q) (w b)))) (\\v.t)) (m (\\q.\\k.U) (R (\\p.\\t.\\w.b) ((\\r.l) (\\q.N) (Q s i)))) s) (b (\\p.(\\v.L) ((\\c.\\r.u ((\\a.V) (\\k.d))) N)) ((\\w.\\i.(\\y.V) (\\v.\\h.v (y p (W P)) (f (\\l.B)))) ((\\p.\\t.\\w.z) (\\f.L)))))) (\\i.\\n.W I)",
      "\\l.\\z.\\t.y k (\\u.y p (x)) (\\w.\\d.\\g.\\s.h) (Z W (\\e.z)) (u (v (\\m.S) (\\s.q)))"
    );
  }

  @Test
  public final void test12() {
    reducesTo(
      "(\\h.(\\s.h m m ((\\t.F) ((\\v.\\r.g) j)) (h v)) (a (\\e.\\z.w)) M) (e (V s T) (f ((\\f.F (l (\\c.a))) (\\j.(\\f.w V (\\t.T)) (u x (\\l.f))) (\\z.(\\z.G) (\\d.K)) (\\e.e (v e i T) (\\w.t (h g m) x)))) (c (\\o.q) ((\\v.O) f) f))",
      "e (V s T) (f (F (l (\\c.a)) (\\z.G) (\\e.e (v e i T) (\\w.t (h g m) x)))) (c (\\o.q) (O) f) m m (F) (e (V s T) (f (F (l (\\c.a)) (\\z.G) (\\e.e (v e i T) (\\w.t (h g m) x)))) (c (\\o.q) (O) f) v) M"
    );
  }

  @Test
  public final void test13() {
    reducesTo(
      "\\w.k (\\k.T ((\\g.(\\z.\\g.(\\p.(\\b.(\\o.o) (o s)) (\\u.\\e.v W) (o H (\\c.l) (\\j.p))) (\\q.(\\y.(\\h.A) (g L)) (y y z) (\\j.\\s.f))) Z) ((\\b.\\w.\\j.i) (\\c.\\z.\\m.\\k.n (\\e.x r) (a F (\\k.j) x) (\\l.\\l.\\n.f K y (\\g.s g) a))) (Y (\\g.\\o.\\f.(\\q.\\b.n) ((\\w.(\\x.(\\o.n) (\\e.r)) v) R (\\h.p))))))",
      "\\w.k (\\k.T (o s (o H (\\c.l) (\\j.\\q.A (\\j.\\s.f)))))"
    );
  }

  @Test
  public final void test14() {
    reducesTo(
      "\\j.\\l.\\s.M",
      "\\j.\\l.\\s.M"
    );
  }

  @Test
  public final void test15() {
    reducesTo(
      "\\r.(\\z.\\g.\\w.\\d.\\h.(\\w.(\\v.(\\q.o) (\\d.(\\x.\\q.\\a.\\i.\\p.m) (\\f.m))) j) N) ((\\j.\\z.(\\n.\\a.x) l) (\\k.(\\e.\\h.t (\\j.A)) (\\z.\\l.(\\m.\\o.\\u.\\o.y) (\\n.S ((\\j.M) H) ((\\q.a) (\\f.E) (\\j.\\d.N s))))) F) (\\w.F)",
      "\\r.\\w.\\d.\\h.o"
    );
  }

  @Test
  public final void test16() {
    reducesTo(
      "\\o.b (\\z.c)",
      "\\o.b (\\z.c)"
    );
  }

  @Test
  public final void test17() {
    reducesTo(
      "\\v.b",
      "\\v.b"
    );
  }

  @Test
  public final void test18() {
    reducesTo(
      "\\k.v",
      "\\k.v"
    );
  }

  @Test
  public final void test19() {
    reducesTo(
      "n (k (\\n.A (a y)))",
      "n (k (\\n.A (a y)))"
    );
  }

  @Test
  public final void test20() {
    reducesTo(
      "e (\\r.\\t.(\\d.\\n.p ((\\u.\\f.z ((\\s.d) (\\c.q))) k ((\\b.m (\\g.f) (u K (\\l.B))) (\\v.f (k Y (\\c.J)))) n) (B (\\b.\\o.G ((\\f.\\e.e) (Y f C v))) (i l ((\\c.C) (q (a C) A ((\\g.(\\u.I) (o W)) (S g (N u)))))))) ((\\x.\\f.R) (\\t.T) ((\\k.\\x.(\\f.(\\l.m) (\\g.f (o i)) (\\j.m U r ((\\x.w) d))) (\\z.U y) (\\v.w (i a (\\j.n (\\z.a))))) (\\y.(\\o.(\\l.(\\i.R) d) (d D (k R) (\\b.j) (\\o.u))) (\\x.y)))))",
      "e (\\r.\\t.\\n1.p (z (R) n1) (B (\\b.\\o.G (\\e.e)) (i l (C))))"
    );
  }

  @Test
  public final void test21() {
    reducesTo(
      "x x (\\r.U ((\\f.\\f.f ((\\a.g (\\s.\\s.i g)) (\\h.X) (q (h D (\\e.p)) (\\u.\\g.G h (\\s.k) ((\\j.o) y))))) ((\\y.\\t.V) (\\m.T) ((\\t.\\y.\\h.\\j.(\\u.H) (y S)) ((\\o.\\l.\\a.q) (\\j.x M (\\z.s)))) (\\p.(\\e.x (W w (\\t.e) ((\\a.J) (\\w.I)))) (E u)))) (\\r.(\\l.f (k M ((\\s.(\\b.\\u.a V) (\\d.\\o.h) (\\e.(\\z.\\d.H) W)) (g ((\\s.\\c.\\w.w) ((\\j.a) L)))))) (\\w.\\p.\\d.(\\d.O (\\d.(\\h.A (\\t.\\y.H)) u)) (\\q.h) ((\\q.\\p.(\\n.\\m.(\\g.b v) (W J)) (\\g.p W)) ((\\g.(\\u.i) (P (\\w.h))) ((\\x.g (p z)) (\\v.k l (B U)))) ((\\d.w) ((\\d.t) (\\t.a)) (\\r.t) j)))))",
      "x x (\\r.U (\\f.f (g (\\s.\\s.i g) (q (h D (\\e.p)) (\\u.\\g.G h (\\s.k) (o))))) (\\r.f (k M (a V))))"
    );
  }

  @Test
  public final void test22() {
    reducesTo(
      "L (\\r.v (B g) ((\\u.(\\g.a (\\w.k) (\\l.\\y.\\g.d)) (f (U q) (\\l.b (\\i.k))) (U w (C L) (\\y.\\m.\\t.v) (C H (\\h.r) ((\\q.p) (\\i.Z))))) (F ((\\t.\\u.\\q.v) ((\\l.l) (\\j.T))) ((\\k.\\l.P q) (\\p.\\b.c d) (\\i.(\\l.Y) x (\\j.\\u.\\t.s))))) b) ((\\y.(\\b.F ((\\x.w W) I)) c) d)",
      "L (\\r.v (B g) (a (\\w.k) (\\l.\\y.\\g.d) (U w (C L) (\\y.\\m.\\t.v) (C H (\\h.r) (p)))) b) (F (w W))"
    );
  }

  @Test
  public final void test23() {
    reducesTo(
      "(\\b.(\\b.z (s (\\e.\\g.D ((\\o.l) (\\l.\\a.\\i.W (a (\\n.n))) ((\\j.(\\a.t) (\\e.X)) F ((\\l.G I (O q)) w)))))) (\\h.m)) y",
      "z (s (\\e.\\g.D (l (t (G I (O q))))))"
    );
  }

  @Test
  public final void test24() {
    reducesTo(
      "M (\\u.\\n.\\u.q (\\n.D (\\p.(\\n.(\\g.\\d.G ((\\i.(\\n.l) (\\f.r)) (U J U))) H Q) (\\y.\\l.\\v.\\f.\\a.\\k.v i))))",
      "M (\\u.\\n.\\u.q (\\n.D (\\p.G (l))))"
    );
  }

  @Test
  public final void test25() {
    reducesTo(
      "(\\s.\\e.p) (K t)",
      "\\e.p"
    );
  }

  @Test
  public final void test26() {
    reducesTo(
      "\\i.u (\\g.\\a.\\l.\\b.\\q.L)",
      "\\i.u (\\g.\\a.\\l.\\b.\\q.L)"
    );
  }

  @Test
  public final void test27() {
    reducesTo(
      "\\j.c",
      "\\j.c"
    );
  }

  @Test
  public final void test28() {
    reducesTo(
      "\\y.\\o.\\w.(\\v.H) h",
      "\\y.\\o.\\w.H"
    );
  }

  @Test
  public final void test29() {
    reducesTo(
      "\\g.\\j.o",
      "\\g.\\j.o"
    );
  }

  @Test
  public final void test30() {
    reducesTo(
      "\\s.\\m.m (\\k.\\j.Y)",
      "\\s.\\m.m (\\k.\\j.Y)"
    );
  }

  @Test
  public final void test31() {
    reducesTo(
      "d (\\p.\\p.\\w.\\g.T ((\\z.\\s.B) (\\a.f)))",
      "d (\\p.\\p.\\w.\\g.T (\\s.B))"
    );
  }

  @Test
  public final void test32() {
    reducesTo(
      "\\t.M",
      "\\t.M"
    );
  }

  @Test
  public final void test33() {
    reducesTo(
      "q (\\o.t)",
      "q (\\o.t)"
    );
  }

  @Test
  public final void test34() {
    reducesTo(
      "(\\t.(\\p.(\\n.\\j.a ((\\w.\\r.\\e.u) (W C c) (\\a.\\e.(\\a.\\t.c) (\\e.\\u.B))) (\\d.m ((\\j.g (o A)) (n q (\\a.F))) (\\r.\\y.(\\d.\\c.E T (\\u.E) ((\\b.i) (\\m.p))) (q T (\\x.g) (q E (\\d.j)))))) (\\j.(\\d.e (\\n.\\a.D) (\\m.l j)) (\\x.(\\x.g) i)) z) H) ((\\m.r ((\\r.(\\b.K r (\\f.b)) (\\d.\\s.\\a.V) C (\\b.m M (\\b.N) l V) (\\r.k)) (\\c.q (u V) q h (\\g.\\c.\\m.z (\\k.\\b.(\\d.N) (u n) W)) ((\\f.(\\w.\\p.E v) (\\s.j R (y K))) (O (\\l.\\u.k b)) (\\h.p (x f)))))) D)",
      "a (\\e.u) (\\d.m (g (o A)) (\\r.\\y.\\c.E T (\\u.E) (i)))"
    );
  }

  @Test
  public final void test35() {
    reducesTo(
      "R (\\r.\\x.l) u",
      "R (\\r.\\x.l) u"
    );
  }

  @Test
  public final void test36() {
    reducesTo(
      "(\\s.\\z.\\g.\\f.\\f.x) I (\\i.\\o.(\\m.\\j.\\e.i) (\\z.\\k.\\l.\\k.Z P K ((\\e.f) (W Z) (\\v.m) (\\e.\\j.n)) ((\\o.(\\v.i) (l Z (\\c.x))) (\\i.(\\m.s (\\g.v)) (\\v.\\h.i H)) (\\i.\\a.\\a.i))) (\\f.(\\o.(\\w.d) i (\\j.\\v.\\k.(\\c.x K (\\m.X) ((\\t.s) (B h)) X) (\\g.(\\b.\\z.\\c.i g (\\d.a)) (\\g.(\\g.\\r.m) (x r t))))) u) j)",
      "\\g.\\f.\\f.x"
    );
  }

  @Test
  public final void test37() {
    reducesTo(
      "\\e.(\\u.\\w.(\\m.v) (\\j.\\m.\\d.S)) v",
      "\\e.\\w.v"
    );
  }

  @Test
  public final void test38() {
    reducesTo(
      "(\\m.(\\z.\\l.Z (F (\\z.\\u.(\\w.g) ((\\w.\\x.\\z.N) ((\\i.x) (E e) (\\b.\\y.S W)))) u)) s) (f ((\\g.\\v.\\j.(\\w.\\k.y) N) (\\j.a q e)))",
      "\\l.Z (F (\\z.\\u.g) u)"
    );
  }

  @Test
  public final void test39() {
    reducesTo(
      "\\c.f",
      "\\c.f"
    );
  }

  @Test
  public final void test40() {
    reducesTo(
      "\\k.\\s.\\w.\\i.(\\r.(\\j.k a) (m (\\e.Q (\\k.(\\v.\\x.Q G (\\a.b) (\\l.M i)) ((\\n.e d) g))) n (\\d.(\\k.\\e.O) (\\k.\\l.\\m.(\\b.z T (\\s.\\o.i q) i ((\\z.(\\z.v (P m)) (H p)) (\\d.(\\i.\\e.j) (b g (\\p.K))))) (\\z.\\z.\\r.V (\\x.o (\\d.R))))))) (W k)",
      "\\k.\\s.\\w.\\i.k a"
    );
  }

  @Test
  public final void test41() {
    reducesTo(
      "(\\p.G) ((\\f.v) ((\\c.(\\b.s) (\\i.e) (F C (\\s.Y))) (\\j.\\o.x)) (\\z.N (\\u.(\\s.v H (O e)) (C (b g)) ((\\j.I) (p x) l)))) (\\u.j) m (\\v.(\\t.I) ((\\y.\\c.r) (c (b d e s ((\\y.Q P (V m)) (\\e.\\i.P D))) ((\\m.s) F (\\z.Y) (d (r L) W) c))) (\\y.\\o.c))",
      "G (\\u.j) m (\\v.I (\\y.\\o.c))"
    );
  }

  @Test
  public final void test42() {
    reducesTo(
      "(\\w.\\b.\\j.F) ((\\s.(\\r.\\m.(\\y.\\l.\\n.(\\v.(\\z.s) ((\\z.w) (\\n.m))) j) ((\\c.(\\n.j h T) (\\y.t n (u W))) (\\f.f))) (\\w.z d (\\e.i) y (\\w.\\p.\\y.K Z (\\u.j) i) (\\p.\\d.K (\\z.\\w.Y (s y) (\\q.c n))))) ((\\f.k) (\\b.\\w.\\q.(\\m.\\h.(\\w.M) L (\\m.l P)) ((\\o.\\a.d) (\\m.m Q (\\t.b)))) ((\\i.(\\f.q) (z M) r) a ((\\h.j (L q)) (d ((\\s.m) f)))))) (\\l.T (\\t.(\\i.\\k.\\y.p) (H (G k (\\e.y) (\\e.l)) (\\c.n) ((\\c.\\q.l (u (\\v.s))) (\\l.(\\c.\\n.e) C) (H U (b e) (\\k.\\a.\\u.I) (a p y ((\\f.Q) (z C)))))))) ((\\d.(\\f.\\t.k (\\t.O)) ((\\k.y) M) (h (K S ((\\j.q T (T x)) l) (\\g.\\q.Y (\\m.r))))) (\\t.(\\i.F) g) (t ((\\g.\\q.q) ((\\h.(\\d.q (Q Q)) (R (E p))) (k (\\r.B) (\\l.\\q.K)))) (\\p.(\\b.\\o.\\l.\\j.(\\p.D (j e i ((\\i.m) (\\a.l)))) (r L (b z) (\\o.(\\d.q) (x W)) (V l))) (\\v.(\\z.v ((\\i.\\j.m x) c)) (\\f.S))) (\\q.g (a v) h)))",
      "F"
    );
  }

  @Test
  public final void test43() {
    reducesTo(
      "(\\b.\\j.\\h.\\n.Q ((\\v.\\z.(\\i.y s (i M)) h (\\z.\\f.(\\v.z) ((\\q.L) (b V)))) (k (\\q.x e (\\q.k)) ((\\w.G a (\\o.l)) R)) k ((\\q.D (j R (\\n.\\b.o g)) (b (\\f.b) (r o s) c)) (\\o.\\r.\\g.(\\b.\\c.(\\y.M) (\\h.A) A) (\\l.K (o P (y L))) Q)))) b (x v n)",
      "\\h.\\n1.Q (y s (h M) (\\z.\\f.z) (D (x v n R (\\n.\\b.o g)) (b (\\f.b) (r o s) c)))"
    );
  }

  @Test
  public final void test44() {
    reducesTo(
      "Y (\\p.\\e.q)",
      "Y (\\p.\\e.q)"
    );
  }

  @Test
  public final void test45() {
    reducesTo(
      "\\n.(\\n.\\f.Y (\\n.h h) o) (\\x.m)",
      "\\n.\\f.Y (\\n.h h) o"
    );
  }

  @Test
  public final void test46() {
    reducesTo(
      "(\\g.\\t.T) (a (\\n.\\o.(\\q.(\\q.\\h.\\d.\\h.G) ((\\x.(\\q.w) (d f) (u D (\\l.h)) o (\\z.(\\w.\\x.N) (e (i X (\\e.U))))) (\\y.\\q.f))) (x (\\c.\\p.\\b.\\q.u ((\\d.\\e.e) (c J n) (\\q.\\p.\\b.k))) ((\\c.\\k.\\y.v) ((\\a.W) (\\z.Z E (\\g.n) y)) ((\\l.\\d.y k) k ((\\b.\\g.\\x.y) (\\z.Z)) (\\x.(\\e.\\v.\\j.x V (c f) (T d d)) ((\\s.B) (\\o.s) (\\h.(\\d.v) (\\o.s)))))))))",
      "\\t.T"
    );
  }

  @Test
  public final void test47() {
    reducesTo(
      "\\w.\\h.\\r.(\\g.(\\o.p) (\\k.(\\p.k) (\\x.\\b.I ((\\k.(\\z.\\w.\\v.\\p.\\o.(\\i.t) k) t) d (\\q.d ((\\i.\\g.V V) y) (A ((\\s.e) (l s) (\\z.v i (Z e))))))))) ((\\u.\\p.\\m.\\o.K e) g (\\f.R) v)",
      "\\w.\\h.\\r.p"
    );
  }

  @Test
  public final void test48() {
    reducesTo(
      "\\s.(\\s.E) (\\v.z)",
      "\\s.E"
    );
  }

  @Test
  public final void test49() {
    reducesTo(
      "\\h.\\a.(\\k.(\\g.\\p.(\\s.x q r) ((\\q.h) (\\o.i) (\\w.q) (\\c.(\\v.\\u.\\n.m) o))) M (t ((\\y.U) (\\y.\\q.H f) m) (K j))) y (F (\\c.L)) (j E)",
      "\\h.\\a.x q r (F (\\c.L)) (j E)"
    );
  }

  @Test
  public final void test50() {
    reducesTo(
      "(\\h.\\b.\\w.(\\y.\\b.G) c) (\\f.(\\b.\\h.\\l.\\t.(\\j.(\\t.L) W (\\h.\\l.U (\\h.\\q.\\p.(\\x.\\q.f) t) ((\\o.\\v.\\g.(\\b.n (\\a.u) (\\t.Y e)) (\\e.x C)) r))) e) (\\v.\\x.(\\i.\\j.\\o.\\t.(\\f.\\f.N) n) (s (X D (\\f.h) ((\\m.e) e) ((\\a.s) J ((\\j.y) (\\o.W)))) (\\o.(\\n.o i S t) U ((\\l.C) (\\a.K (\\z.S))))) (q (T ((\\d.N) ((\\n.(\\a.X) k (s u (\\j.k))) ((\\p.O (\\h.V)) (\\e.\\e.d))))))))",
      "\\b.\\w.\\b.G"
    );
  }

  @Test
  public final void test51() {
    reducesTo(
      "\\b.\\v.\\x.u",
      "\\b.\\v.\\x.u"
    );
  }

  @Test
  public final void test52() {
    reducesTo(
      "\\f.e (\\s.b) ((\\p.j) (\\f.X u) ((\\o.\\x.\\x.(\\e.\\v.(\\f.t) (A (U (K X (o W))))) ((\\b.m O) (\\a.\\m.\\b.\\c.X w (\\s.\\j.k) f))) (\\t.\\l.\\q.v ((\\s.F) (\\x.j) (\\q.x V r (\\x.t)))) N))",
      "\\f.e (\\s.b) (j (\\x2.\\v3.t))"
    );
  }

  @Test
  public final void test53() {
    reducesTo(
      "\\t.(\\i.U) s",
      "\\t.U"
    );
  }

  @Test
  public final void test54() {
    reducesTo(
      "(\\n.k) (\\j.\\v.\\r.\\d.z)",
      "k"
    );
  }

  @Test
  public final void test55() {
    reducesTo(
      "\\d.\\r.y (w (b (w (z (\\k.\\f.\\l.i) (\\l.\\o.\\i.\\m.w))) ((\\j.e) o))) w",
      "\\d.\\r.y (w (b (w (z (\\k.\\f.\\l.i) (\\l.\\o.\\i.\\m.w))) (e))) w"
    );
  }

  @Test
  public final void test56() {
    reducesTo(
      "Q ((\\h.(\\o.h b) (\\i.(\\m.e) (\\i.\\x.j ((\\j.\\u.\\n.f Q (w k) o) (\\p.\\l.\\m.(\\i.h x) c))))) x) (\\n.K)",
      "Q (x b) (\\n.K)"
    );
  }

  @Test
  public final void test57() {
    reducesTo(
      "\\c.\\b.(\\v.(\\b.\\s.h (o (\\h.\\y.e I (\\e.w) (\\m.b)))) (\\q.\\y.e)) t M ((\\c.\\z.\\c.\\u.c (g (q (\\y.\\b.y))) (\\b.\\z.b (\\f.B))) ((\\i.a) ((\\g.a (\\l.P) (\\o.\\n.(\\v.\\q.m) (\\b.q i)) (m b R ((\\y.\\v.\\k.c) k))) ((\\z.m) ((\\t.(\\v.P) (V L)) ((\\m.Z) V)) ((\\k.(\\e.a) (g p)) (\\k.\\t.C x) L))))) (\\g.\\i.\\f.\\k.e (K (\\e.\\k.j)))",
      "\\c.\\b.h (o (\\h.\\y.e I (\\e.w) (\\m.\\q.\\y.e))) (\\z.\\c.\\u.c (g (q (\\y.\\b.y))) (\\b.\\z.b (\\f.B))) (\\g.\\i.\\f.\\k.e (K (\\e.\\k.j)))"
    );
  }

  @Test
  public final void test58() {
    reducesTo(
      "\\e.f ((\\d.p) ((\\w.\\y.\\k.(\\b.l (\\i.(\\i.u S) (f (\\h.e)))) (\\q.(\\t.n) ((\\t.\\k.p k) ((\\r.w) (D O)))) (\\i.y b (\\s.(\\e.y) l))) r) K)",
      "\\e.f (p K)"
    );
  }

  @Test
  public final void test59() {
    reducesTo(
      "\\r.h ((\\b.m) (\\t.(\\c.E (\\u.n)) E)) (s ((\\x.\\y.Z) h ((\\n.(\\r.(\\f.\\z.\\y.\\v.\\f.s b c) (f ((\\c.k) (q A))) (\\w.Z)) (\\t.\\e.\\a.\\o.\\a.\\d.\\y.(\\k.\\t.\\t.n j) u ((\\b.\\d.f) (\\l.(\\t.k z) (\\z.d W))))) (\\l.\\x.\\r.(\\w.(\\n.Y) (\\t.M)) o h ((\\y.\\s.z) (\\o.N)) (\\t.\\x.\\b.y x ((\\o.K L (\\c.Z)) (\\k.n)) (\\k.\\s.(\\h.\\m.W) (k u (b f)) (\\t.(\\j.i q) (h l))))))))",
      "\\r.h (m) (s (Z))"
    );
  }

  @Test
  public final void test60() {
    reducesTo(
      "\\x.(\\l.\\f.(\\c.(\\z.\\m.\\r.(\\a.\\v.z) (\\f.(\\e.\\d.i W) (w T x) (b (\\c.\\a.\\u.o))) (\\v.\\l.\\d.\\x.\\r.\\a.B (\\q.\\j.(\\d.n) (\\z.M O)))) v x) (\\h.\\c.G ((\\s.W) ((\\c.i) (\\z.\\h.(\\p.l) (\\n.\\f.(\\h.\\m.o) ((\\d.s) (s L))) (\\w.E (\\c.h) G ((\\m.\\d.T) (\\i.q e l)))))))) v",
      "\\x.\\f.\\r.v"
    );
  }

  @Test
  public final void test61() {
    reducesTo(
      "(\\n.N) ((\\u.K) ((\\r.\\h.\\p.g ((\\t.R N x ((\\o.n) (\\h.g))) (J o (v y) w) (v e))) (\\w.\\b.(\\a.g) (\\k.\\n.\\t.\\a.K e) ((\\e.K (\\c.o) (l m (s a))) k ((\\r.(\\e.y n (D o)) (V (r i))) (\\j.R)))))) ((\\h.(\\i.(\\u.W) ((\\d.\\u.q f (\\s.o) (t t v) ((\\r.(\\r.h) (\\i.v)) (f M (\\r.g)))) (\\r.\\o.(\\a.(\\f.\\f.o) (y l m)) D)) (\\t.(\\v.h ((\\s.(\\a.f D C) (e (\\g.Z))) (h ((\\d.c) (\\y.f))))) q)) n) z)",
      "N (W (\\t.z (f D C)))"
    );
  }

  @Test
  public final void test62() {
    reducesTo(
      "\\a.\\n.\\f.R",
      "\\a.\\n.\\f.R"
    );
  }

  @Test
  public final void test63() {
    reducesTo(
      "\\d.n (\\x.s ((\\h.U (L (\\n.p T (a Q))) w) (r ((\\h.k) i)))) (\\i.\\l.f) (y ((\\q.j T) (\\q.G) A ((\\g.a) ((\\h.\\j.D) ((\\t.d) (j U) (y s (Z n)))))) j ((\\p.\\b.(\\v.\\y.\\j.\\w.\\w.(\\u.A) ((\\g.\\z.\\m.j) ((\\i.(\\n.h) b) q ((\\x.\\f.g E) d)))) ((\\p.\\e.\\n.\\o.Q) ((\\u.z) ((\\g.\\c.g r) (\\f.y)) f))) (\\x.(\\a.Y) (\\u.\\r.\\f.d ((\\e.T (u x) (\\a.i r) ((\\g.e) ((\\l.N) (\\x.v)))) (\\m.s))))))",
      "\\d.n (\\x.s (U (L (\\n.p T (a Q))) w)) (\\i.\\l.f) (y (j T A (a)) j (\\b.\\y.\\j.\\w.\\w.A))"
    );
  }

  @Test
  public final void test64() {
    reducesTo(
      "\\g.W",
      "\\g.W"
    );
  }

  @Test
  public final void test65() {
    reducesTo(
      "\\p.h",
      "\\p.h"
    );
  }

  @Test
  public final void test66() {
    reducesTo(
      "(\\u.\\n.(\\n.q (H (V B) (i (f c)) Q) (q (h r (\\w.j)) k) (\\s.\\w.(\\m.\\a.(\\x.\\e.l) P) (\\a.X e))) (\\n.\\m.\\d.\\p.d) ((\\g.\\o.\\j.v d) ((\\u.O e a (\\s.M q (x z)) (\\a.y) (l B (s o) (z l (s y)) (O (\\h.w) (x u (\\d.p))))) (z W (\\x.\\o.\\d.\\p.\\k.\\x.\\a.\\y.s (\\s.t) s))) (q ((\\f.P (\\x.R (\\a.r))) (k M))))) z",
      "\\n.q (H (V B) (i (f c)) Q) (q (h r (\\w.j)) k) (\\s.\\w.\\a.\\e.l) (\\j.v d)"
    );
  }

  @Test
  public final void test67() {
    reducesTo(
      "w I ((\\z.u (K (\\m.\\u.d) ((\\v.\\p.x (c (\\f.\\o.w))) (d (p (\\n.r)) (\\z.m) (o (\\y.E) K ((\\q.f u (b s)) y)))))) (\\i.q))",
      "w I (u (K (\\m.\\u.d) (\\p.x (c (\\f.\\o.w)))))"
    );
  }

  @Test
  public final void test68() {
    reducesTo(
      "(\\s.\\h.(\\b.X) (\\x.P (j ((\\b.(\\m.T) J) p Y) ((\\p.v) (\\z.(\\v.\\u.o (\\p.r)) l)))) (\\t.\\q.(\\j.K) (\\y.\\z.(\\s.(\\f.\\r.\\i.(\\r.\\w.(\\i.b) e L) k ((\\r.t) (\\n.M))) (\\q.c)) (y i)))) (n (\\l.\\o.Y))",
      "\\h.X (\\t.\\q.K)"
    );
  }

  @Test
  public final void test69() {
    reducesTo(
      "(\\b.\\l.(\\u.\\t.(\\w.(\\w.(\\u.R L (s C)) q) c) N (\\s.(\\f.(\\h.\\h.b t) s i) u)) e ((\\k.(\\o.v O A) (\\h.\\h.p o) ((\\o.l) (\\f.(\\m.v) (\\a.m))) ((\\v.\\c.o d) (\\d.h b) (\\h.\\q.\\t.p)) p) a) m) (\\v.(\\l.\\i.\\f.j g) f)",
      "\\l.R L (s C) (\\s.\\i.\\f.j g) m"
    );
  }

  @Test
  public final void test70() {
    reducesTo(
      "b (\\j.i ((\\s.(\\s.\\r.\\t.D) ((\\w.w) (D u) (\\z.i)) (\\l.(\\e.j) (\\v.l) (\\e.d m (\\x.y)) (\\a.\\y.\\w.\\z.\\w.z (\\f.r)))) ((\\t.\\m.\\n.d I (Z w) r) (\\i.(\\s.\\i.\\q.K) a) (\\q.O)) (p (\\o.(\\q.(\\u.(\\q.(\\q.v) (b s)) (\\u.h)) (e (c Y) (\\r.H x S))) (\\m.g)))) b)",
      "b (\\j.i (D) b)"
    );
  }

  @Test
  public final void test71() {
    reducesTo(
      "(\\n.f) (\\f.Y)",
      "f"
    );
  }

  @Test
  public final void test72() {
    reducesTo(
      "\\d.\\n.(\\j.\\y.\\b.p B ((\\w.(\\r.n) (\\n.(\\g.w) (a q (H y)))) E ((\\k.L G m (T (i m)) (x ((\\q.I) (\\p.b)))) n) (S (\\x.\\l.l)))) Q h",
      "\\d.\\n.\\b.p B (n (L G m (T (i m)) (x (I))) (S (\\x.\\l.l)))"
    );
  }

  @Test
  public final void test73() {
    reducesTo(
      "\\p.(\\z.v (\\x.\\u.(\\r.p (\\v.v ((\\t.m V) (d t (\\i.F)) ((\\h.H) (y E) (\\y.\\u.o k))))) t) (\\k.\\u.(\\h.(\\m.(\\q.(\\s.\\h.\\u.n) ((\\m.k (\\z.t)) (\\z.\\f.\\z.Y) (\\e.a s (I h) (q f (\\b.a))))) (p (\\n.(\\z.z Q (\\t.t)) Z ((\\g.\\w.p) (c d (\\f.t)))))) (\\d.(\\k.\\n.b) S (\\g.\\v.k) (t (F Z) (M w (d Q)) (\\s.F)) v)) (\\t.\\k.q))) (\\s.\\z.w ((\\x.\\i.\\y.\\a.\\l.z) F))",
      "\\p.v (\\x.\\u.p (\\v.v (m V (H (\\y.\\u.o k))))) (\\k.\\u.\\h.\\u.n)"
    );
  }

  @Test
  public final void test74() {
    reducesTo(
      "\\n.p (g (b (\\m.j (q T (\\e.k) I)) d X) D)",
      "\\n.p (g (b (\\m.j (q T (\\e.k) I)) d X) D)"
    );
  }

  @Test
  public final void test75() {
    reducesTo(
      "\\f.q",
      "\\f.q"
    );
  }

  @Test
  public final void test76() {
    reducesTo(
      "(\\u.y (\\n.\\p.(\\x.\\f.r) Q) ((\\u.u) ((\\a.O) (\\w.(\\j.\\f.X M) W (\\g.\\e.p (U y) (s C (c Y))))))) (y (\\r.(\\x.t) O)) (Q (\\a.p)) D",
      "y (\\n.\\p.\\f.r) (O) (Q (\\a.p)) D"
    );
  }

  @Test
  public final void test77() {
    reducesTo(
      "P V z",
      "P V z"
    );
  }

  @Test
  public final void test78() {
    reducesTo(
      "l (\\j.u (\\c.X))",
      "l (\\j.u (\\c.X))"
    );
  }

  @Test
  public final void test79() {
    reducesTo(
      "\\b.\\i.\\e.K u",
      "\\b.\\i.\\e.K u"
    );
  }

  @Test
  public final void test80() {
    reducesTo(
      "(\\r.x) ((\\e.\\d.\\y.\\r.(\\l.\\m.\\p.Z (a ((\\b.l) q) (\\o.Z)) ((\\m.T) L)) (h ((\\j.w) I (\\l.\\w.\\w.\\l.x (i c))) (t ((\\w.(\\e.J) o ((\\v.M) (m f))) X))) (\\j.(\\m.\\e.q) (\\j.g))) (\\s.D))",
      "x"
    );
  }

  @Test
  public final void test81() {
    reducesTo(
      "(\\w.i (U (E (\\u.t ((\\c.\\s.\\g.s) ((\\z.t) (\\l.Y)) b)))) (\\x.(\\z.(\\g.F) ((\\m.Q (b (\\h.f))) ((\\e.I) (\\w.\\f.(\\u.u J) (\\b.y)) (u p q ((\\x.j) O) (\\v.(\\t.(\\c.z) (q b)) R))))) (\\d.(\\z.(\\i.\\p.a (\\d.k (\\r.T e x (\\e.\\v.m)))) (o H (y D) (\\k.\\e.\\b.i) (\\r.\\u.(\\a.t) p (\\c.J)) (n (\\p.o) ((\\w.t) (K k)) (\\u.F w (\\g.T) Z)))) (\\r.\\d.\\h.d)))) L",
      "i (U (E (\\u.t (\\g.b)))) (\\x.F)"
    );
  }

  @Test
  public final void test82() {
    reducesTo(
      "(\\x.\\n.\\g.\\x.O (\\p.(\\q.(\\g.(\\c.(\\u.s (s ((\\i.k) a))) (s ((\\j.A) u))) (\\z.(\\j.\\m.e) G)) ((\\f.\\e.(\\r.\\a.\\j.y) k q (\\h.\\m.P (\\s.\\w.h))) (S a (\\m.J) (e o (u j)) (\\c.F) a))) (\\y.\\z.(\\q.(\\o.p V) (\\p.n q (x b) (a (\\b.z))) (\\v.m) (\\b.\\a.(\\g.\\f.(\\f.S q) (\\p.u e) (\\d.(\\j.A) ((\\h.p) (v K)))) ((\\j.w n (e k)) (O (\\b.u)) Z))) (l l)))) (\\x.g (\\x.V) (\\i.\\p.F ((\\b.\\y.\\l.N) (\\p.p (\\c.(\\c.P) (\\e.U))))) ((\\p.N (\\h.F (e v w r))) (\\d.\\v.t)) (a x) ((\\k.\\c.m Z) (\\h.K ((\\d.f) (L d)) (\\n.h) ((\\u.S (E u) (u (z Y))) ((\\e.C) (\\v.F) (z k (\\t.D)))) (\\v.a) (\\f.\\v.z))))",
      "\\n.\\g.\\x.O (\\p.s (s (k)))"
    );
  }

  @Test
  public final void test83() {
    reducesTo(
      "(\\u.\\z.\\f.\\l.P (\\p.\\m.\\n.e)) u (L (\\u.\\t.(\\d.c) (\\s.q)))",
      "\\f.\\l.P (\\p.\\m.\\n.e)"
    );
  }

  @Test
  public final void test84() {
    reducesTo(
      "(\\t.(\\k.i ((\\z.\\e.U b) (\\e.v) (\\d.z))) t (\\x.\\h.(\\z.M) X (\\o.\\o.\\s.\\k.D)) (\\v.\\k.\\n.\\g.y)) (J (\\k.\\a.F)) (I u)",
      "i (U b) (\\x.\\h.M (\\o.\\o.\\s.\\k.D)) (\\v.\\k.\\n.\\g.y) (I u)"
    );
  }

  @Test
  public final void test85() {
    reducesTo(
      "(\\q.\\v.\\w.z (\\e.c (\\c.\\l.j)) (\\z.\\m.\\j.\\d.\\j.\\m.b (\\e.V))) (m (\\r.\\t.(\\y.O) ((\\v.L) (\\c.H u (\\j.\\u.\\r.O) (P (\\a.\\y.(\\c.\\f.k) (c I (\\g.d))))))) (\\y.v))",
      "\\v.\\w.z (\\e.c (\\c.\\l.j)) (\\z.\\m.\\j.\\d.\\j.\\m.b (\\e.V))"
    );
  }

  @Test
  public final void test86() {
    reducesTo(
      "\\f.\\c.(\\d.\\u.(\\j.\\k.(\\w.q) (\\a.H ((\\w.d) (k p))) (\\u.\\d.\\y.t) (\\o.\\c.\\e.\\c.q)) z a ((\\r.h z (\\c.(\\x.\\j.\\r.(\\i.\\z.O (\\f.v l) (\\n.h)) (\\c.(\\z.s) ((\\y.U) h) M)) H)) ((\\q.\\a.(\\b.\\n.\\b.(\\w.\\v.\\i.r) (t (\\f.p) (\\w.y m (D S))) ((\\t.\\t.\\e.u) (\\k.X) (\\i.f))) (\\s.f (w ((\\y.a) h (\\n.\\a.\\r.c))))) (\\o.(\\f.w ((\\n.\\u.(\\v.i) (O I) (d (m h))) (q t (\\e.w) (\\w.\\b.\\h.f)))) (\\f.n))))) (\\j.\\d.(\\h.(\\n.\\v.\\c.(\\m.E (\\u.k t M ((\\d.S) (z Q)))) D (\\b.Y)) (\\s.(\\g.\\r.\\a.(\\r.v) ((\\m.m) (\\b.s (\\b.\\g.f)))) (x s)) y) (i (\\e.(\\q.\\s.i r (i i) (\\i.\\e.s o) (\\i.\\x.(\\b.p L) i) ((\\n.m) (\\p.b) ((\\w.g) (X a)) (b (\\b.h l (\\v.B))))) ((\\e.X) (\\f.h) (v F j) (h f) e) (\\e.\\g.(\\d.r (n I (p Z) (s (d d)))) (h ((\\s.\\f.v Z) (m i i))) ((\\y.(\\b.\\l.i) w) (\\g.(\\x.p) (\\m.r) (S (c j))) (\\t.\\t.z))))))",
      "\\f.\\c.\\u.q (\\u.\\d.\\y.t) (\\o.\\c.\\e.\\c.q) (h z (\\c.\\j.\\r.\\z.O (\\f.v l) (\\n.h)))"
    );
  }

  @Test
  public final void test87() {
    reducesTo(
      "\\u.h",
      "\\u.h"
    );
  }

  @Test
  public final void test88() {
    reducesTo(
      "o (\\d.w ((\\r.k) ((\\r.e) (\\d.j))))",
      "o (\\d.w (k))"
    );
  }

  @Test
  public final void test89() {
    reducesTo(
      "\\w.m ((\\g.\\b.X) ((\\p.m) (\\w.H k ((\\k.a (u E) ((\\a.c) (\\r.i))) (s S (\\j.p) k))) ((\\k.\\e.\\b.(\\c.G) (\\q.\\l.p l) F) (\\m.\\l.a (\\j.\\c.H u) (\\v.\\f.(\\h.t) i (\\o.\\e.R))) ((\\t.J) ((\\q.\\n.\\e.Y d (\\u.Y) c) ((\\t.\\z.Z U) (n u (b d)))))) (j (g (\\c.m)) (\\m.n (\\j.\\u.m)) ((\\m.k) ((\\q.(\\b.j) (\\t.p)) (p y E))) ((\\q.\\g.s O) (\\y.\\w.q g) (\\f.\\m.\\f.(\\k.\\f.v) i) ((\\l.r) q)) (\\v.(\\k.\\m.Z) r))))",
      "\\w.m (\\b.X)"
    );
  }

  @Test
  public final void test90() {
    reducesTo(
      "(\\h.s ((\\p.\\s.h n) (N (\\j.\\q.\\x.g) (\\v.\\m.(\\a.\\d.m) (\\y.s)) (\\o.\\u.t (a (\\n.J)) Z) (\\m.z (\\u.(\\c.(\\h.\\l.\\a.q) g) ((\\o.z) (\\e.v) ((\\k.A) (\\c.p))))) (\\n.g (z V (\\r.\\n.\\n.f)) (j W ((\\c.(\\c.B) (\\m.S)) (\\q.\\m.\\t.W))) (\\r.e))))) ((\\z.\\x.j) Q (\\j.(\\i.\\k.(\\s.(\\d.\\w.c) ((\\e.\\q.x M) (\\a.(\\l.z) u) (\\v.q (\\q.G) e)) (\\m.(\\z.a) X)) ((\\h.(\\x.(\\p.j (q (\\s.Y))) (\\h.p)) (\\n.L x)) (a (\\z.\\m.(\\p.\\v.\\z.I) ((\\c.e) (\\y.d)) (\\v.c (\\s.u f)))))) (b (\\w.(\\q.(\\g.R (\\g.W)) (R (\\z.\\x.c))) (k (\\j.\\h.\\q.\\s.y))))))",
      "s (\\s.j n)"
    );
  }

  @Test
  public final void test91() {
    reducesTo(
      "\\w.n",
      "\\w.n"
    );
  }

  @Test
  public final void test92() {
    reducesTo(
      "\\k.\\l.\\b.P (\\y.(\\w.q ((\\j.G) (\\h.(\\c.\\u.\\k.\\l.\\p.\\x.\\k.(\\c.\\y.q l (\\f.U)) (\\f.(\\h.u) m)) (\\z.\\q.y) ((\\q.T) (\\g.v) (\\w.Y) (\\o.\\p.w (q q u)) (m J (\\k.\\u.a F) (h (\\s.P) (\\n.z))))))) w)",
      "\\k.\\l.\\b.P (\\y.q (G))"
    );
  }

  @Test
  public final void test93() {
    reducesTo(
      "\\w.\\l.\\a.\\b.\\x.Z",
      "\\w.\\l.\\a.\\b.\\x.Z"
    );
  }

  @Test
  public final void test94() {
    reducesTo(
      "(\\v.t) ((\\k.k I b) G n ((\\u.(\\b.X k (\\o.t)) (\\b.\\p.H)) (e e (V O) (g (c x)))) (i ((\\r.p) (\\v.s) (n q (\\n.y))) i) P) (t ((\\l.(\\p.f (Y (\\e.l)) (\\o.\\i.\\a.\\i.\\o.\\n.\\o.\\e.\\e.\\v.\\w.a c (J Z))) (\\o.\\l.\\z.x)) (\\t.\\v.Q))) o",
      "t (t (f (Y (\\e.\\t.\\v.Q)) (\\o.\\i.\\a.\\i.\\o.\\n.\\o.\\e.\\e.\\v.\\w.a c (J Z)))) o"
    );
  }

  @Test
  public final void test95() {
    reducesTo(
      "r (\\b.H)",
      "r (\\b.H)"
    );
  }

  @Test
  public final void test96() {
    reducesTo(
      "(\\p.\\n.(\\t.\\f.S) (E ((\\y.B ((\\o.G e Z) (\\g.\\z.\\d.v) ((\\x.(\\u.U) (\\v.D)) M))) ((\\p.x) (\\k.\\n.\\x.(\\j.m) E) x)) i)) ((\\e.(\\w.D) ((\\j.\\r.(\\x.\\w.(\\m.m (\\j.o) (\\w.\\j.K)) (\\b.(\\v.V) (m t) q)) (\\v.\\j.b)) F)) (L u ((\\k.\\b.q) (E ((\\c.W) (d l)) d (M (\\g.x) b)))) (p (\\h.\\h.n)))",
      "\\n.\\f.S"
    );
  }

  @Test
  public final void test97() {
    reducesTo(
      "(\\g.\\s.(\\w.\\b.c) e) (\\u.C)",
      "\\s.\\b.c"
    );
  }

  @Test
  public final void test98() {
    reducesTo(
      "\\w.S (\\h.N (\\s.i) ((\\z.(\\h.S) ((\\z.\\u.\\r.r) (\\e.(\\v.N) r))) d c) (Y k) ((\\p.o) ((\\u.\\r.(\\g.M) ((\\t.\\z.\\n.\\k.z) (h G (m j) (r (\\d.n))))) (\\l.c)) ((\\t.H m) ((\\p.\\k.\\v.y (\\o.e (u N)) Z) ((\\q.z) (\\u.(\\s.f) (M y) (a D (\\b.s))))) (\\y.H))))",
      "\\w.S (\\h.N (\\s.i) (S c) (Y k) (o (H m (\\y.H))))"
    );
  }

  @Test
  public final void test99() {
    reducesTo(
      "J ((\\b.\\v.g ((\\g.Y ((\\y.b) r ((\\a.o) h))) (F ((\\i.s) ((\\z.l) (c i)))))) b) (\\y.(\\g.\\j.w e ((\\e.\\u.\\x.\\f.g (j (\\y.P)) (\\e.z)) m)) (t ((\\g.b) (S z)) (\\s.(\\w.L) ((\\c.q) (\\x.W))) y (\\x.(\\g.r (U (\\l.q) (\\a.u))) (\\e.(\\w.(\\e.(\\v.O) i) (\\d.m (p U))) ((\\s.b) (r o) (\\j.\\z.I))))) I) A",
      "J (\\v.g (Y (b (o)))) (\\y.w e (\\u1.\\x.\\f.t (b) (\\s.L) y (\\x.r (U (\\l.q) (\\a.u))) (I (\\y.P)) (\\e.z))) A"
    );
  }

  @Test
  public final void test100() {
    reducesTo(
      "F (\\f.\\g.\\w.J N (\\e.g ((\\o.k ((\\n.\\m.v) x)) (A (\\e.\\z.\\e.z))) T))",
      "F (\\f.\\g.\\w.J N (\\e.g (k (\\m.v)) T))"
    );
  }

  @Test
  public final void test101() {
    reducesTo(
      "B ((\\l.\\c.h (\\j.\\a.\\t.\\e.\\e.\\a.\\p.\\c.\\h.\\t.n) ((\\q.\\y.(\\f.\\h.\\t.\\k.\\z.\\k.(\\w.\\c.(\\d.v) (L S)) p) ((\\n.\\y.\\j.j M ((\\c.s) (j c))) (\\q.\\a.l)) W) ((\\u.\\k.\\z.(\\v.F ((\\r.N) (\\o.f))) (Y (\\n.\\f.S x))) ((\\h.s) n (\\n.(\\y.\\z.\\x.r) ((\\f.C) (j q)))) a))) ((\\i.\\n.(\\f.Y) (D o l (\\n.\\j.k) (\\d.(\\n.\\g.U) (\\b.S))) (\\c.(\\a.r) (\\h.x) (v B b) (\\c.\\l.\\v.\\w.\\f.\\e.O l) (\\j.P (x (\\v.(\\e.W) (C X))))) (\\w.\\m.g)) a))",
      "B (\\c.h (\\j.\\a.\\t.\\e.\\e.\\a.\\p.\\c.\\h.\\t.n) (\\y.\\t.\\k.\\z.\\k.\\c.v))"
    );
  }

  @Test
  public final void test102() {
    reducesTo(
      "(\\a.\\s.(\\t.\\k.(\\g.h n (\\f.k) (\\e.\\e.z)) ((\\p.t) (\\i.d) (r a (\\j.t))) (l w (\\e.\\z.\\e.e)) (\\q.\\z.b (\\s.\\n.L))) ((\\b.M (\\p.K)) (\\u.U (\\w.D M (\\s.M) ((\\j.q) F)) ((\\n.\\l.g) (\\x.(\\k.M) (V H (y R)))))) (Q (\\z.m))) (\\z.C) (\\s.(\\g.\\v.n) (\\f.\\h.c))",
      "h n (\\f.Q (\\z.m)) (\\e.\\e.z) (l w (\\e.\\z.\\e.e)) (\\q.\\z.b (\\s.\\n.L))"
    );
  }

  @Test
  public final void test103() {
    reducesTo(
      "(\\c.\\h.\\s.(\\o.\\e.R) ((\\u.(\\k.(\\t.\\a.\\r.O (\\h.\\x.r) ((\\n.(\\o.\\e.W) (\\p.v)) (\\x.u (a g (\\a.G))))) ((\\h.\\p.v ((\\r.E) ((\\l.q) (\\t.N)))) (f ((\\r.\\i.k F) ((\\o.f) (\\g.P)))))) (b n)) i)) (\\s.\\u.(\\g.\\t.\\c.\\o.\\m.\\m.\\e.b) ((\\k.(\\m.\\y.(\\l.\\b.\\n.s) y ((\\e.(\\p.K) (q y)) v) (\\w.\\e.J (\\k.\\s.\\c.(\\z.z) (\\k.z)))) m (\\p.\\n.(\\f.F) ((\\m.D) P))) B))",
      "\\h.\\s.\\e.R"
    );
  }

  @Test
  public final void test104() {
    reducesTo(
      "\\s.(\\z.(\\g.\\c.(\\m.(\\w.\\e.\\u.\\e.Z (\\z.(\\d.E I) (\\z.m M))) ((\\s.(\\n.T) k) (t V) (\\e.k))) s Y) (z Q (\\f.x) ((\\w.\\u.x) B)) u) ((\\y.\\k.n (\\h.\\l.s (t q (\\u.h) (\\y.\\k.\\i.I))) (\\n.\\d.G)) (\\m.\\j.f) S (\\s.Z (\\r.p)))",
      "\\s.\\u.\\e.Z (\\z.E I)"
    );
  }

  @Test
  public final void test105() {
    reducesTo(
      "(\\y.\\u.(\\d.x s (\\b.U)) (\\k.(\\n.\\j.(\\z.t) ((\\k.a x (O t) (q (x Z))) Z)) K) (\\x.\\s.t)) (\\r.\\b.\\y.\\x.s (H (Z (\\d.\\a.s (q v) (c (\\s.k)))) (f ((\\m.v x u) (G (y s)) v)) (\\g.F (\\i.\\n.g N)))) ((\\y.V i q) d)",
      "x s (\\b.U) (\\x.\\s.t)"
    );
  }

  @Test
  public final void test106() {
    reducesTo(
      "(\\d.g) (\\y.\\i.\\n.b)",
      "g"
    );
  }

  @Test
  public final void test107() {
    reducesTo(
      "\\t.t (\\c.x)",
      "\\t.t (\\c.x)"
    );
  }

  @Test
  public final void test108() {
    reducesTo(
      "\\u.b",
      "\\u.b"
    );
  }

  @Test
  public final void test109() {
    reducesTo(
      "(\\n.\\p.\\z.\\o.g) (q ((\\s.(\\x.\\z.\\y.X) l ((\\s.\\p.\\u.z) (h z (q a))) (\\d.E)) (\\f.(\\h.\\a.\\v.K ((\\a.\\l.W R) ((\\s.I) (o C)))) (\\j.\\i.(\\b.\\x.\\w.f) ((\\d.b (\\w.L)) (h (b t)))))) (o (\\c.X P ((\\g.f) (F S))) ((\\m.A) (r g) (Y e (\\d.h)) (u i)) S (\\n.R)) (J a (\\c.l (\\n.\\p.V (\\z.(\\l.S) (\\z.g) ((\\f.u) (L x)) (\\s.\\c.o))) ((\\n.\\n.\\l.\\h.\\c.S) ((\\w.\\p.J) (\\a.j) (\\j.\\y.d) (q (\\h.f ((\\h.i) (p k)))))))))",
      "\\p.\\z.\\o.g"
    );
  }

  @Test
  public final void test110() {
    reducesTo(
      "\\c.(\\y.(\\i.l) u) (\\n.A)",
      "\\c.l"
    );
  }

  @Test
  public final void test111() {
    reducesTo(
      "(\\l.\\s.\\f.(\\n.(\\o.n (\\t.\\g.(\\q.s) (\\u.x) (\\c.(\\y.h) (\\l.s) (\\q.\\g.l h) (\\j.h)))) (\\w.(\\x.(\\v.(\\z.v) (C (\\v.\\h.O))) q) (\\l.a))) (\\m.q)) (\\u.O) ((\\a.(\\a.F ((\\m.c) (\\r.(\\v.e (\\u.V B (\\i.u))) ((\\s.i) (z J) (\\k.E f (\\u.b)))))) (\\t.\\a.\\l.(\\t.p) ((\\w.(\\p.\\j.\\w.m) (I u (\\z.s))) ((\\w.G) (g q) (\\b.\\m.\\d.Q))) (o (\\a.q))) c) (\\z.(\\h.\\s.h ((\\p.\\w.\\y.\\s.x) (e (l (s a) j) (\\p.\\y.(\\f.o) (f V) (y s) (\\f.k))))) (\\m.n)))",
      "\\f1.q"
    );
  }

  @Test
  public final void test112() {
    reducesTo(
      "\\q.(\\j.\\d.s) U",
      "\\q.\\d.s"
    );
  }

  @Test
  public final void test113() {
    reducesTo(
      "\\b.(\\a.(\\i.(\\w.\\t.\\m.(\\v.(\\h.\\r.A) (i y r)) (e (q (N j)))) (h j (\\m.O (\\w.\\t.j d))) i F ((\\w.\\e.(\\d.c (\\y.\\n.m)) (\\k.C (q (\\d.\\p.e)))) g)) t) V",
      "\\b.A"
    );
  }

  @Test
  public final void test114() {
    reducesTo(
      "(\\i.\\f.\\i.\\o.\\b.(\\u.\\r.n) a ((\\q.r) ((\\h.w ((\\y.(\\b.\\t.\\l.w) (\\j.M)) (p (\\n.q r (\\v.c))))) (\\w.(\\q.(\\c.\\g.\\s.w f) (\\m.\\e.(\\o.T) (\\q.\\a.S))) (\\g.q (\\x.(\\k.\\i.u) f))))) f) ((\\b.A (\\w.\\x.\\y.(\\d.t ((\\l.\\i.v) g)) (\\g.d) (\\f.E))) (\\m.\\f.\\m.K) o)",
      "\\f.\\i.\\o.\\b.n f"
    );
  }

  @Test
  public final void test115() {
    reducesTo(
      "\\y.\\t.(\\d.(\\a.(\\s.e) ((\\v.W (\\s.v) (c Q (H z))) t) (x P) (j t) (\\g.Y z)) (\\h.\\l.(\\f.\\n.s) (\\m.(\\v.(\\e.\\i.\\m.s) (z (\\w.G)) (\\w.N b (H y) (i (t j))) (\\b.(\\j.\\d.s) (t t (z t) (\\v.\\t.n)))) (C (f ((\\q.(\\q.I) (\\q.F)) (\\w.\\j.\\c.n)))) (b (\\g.\\m.h ((\\k.(\\k.h) (N z)) (\\p.\\n.\\h.v)) ((\\s.\\y.y d) n (\\a.(\\v.C) o (\\s.w)))))))) (\\d.F)",
      "\\y.\\t.e (x P) (j t) (\\g.Y z)"
    );
  }

  @Test
  public final void test116() {
    reducesTo(
      "\\c.X",
      "\\c.X"
    );
  }

  @Test
  public final void test117() {
    reducesTo(
      "(\\c.\\f.\\o.k) (v v) (G (\\d.G H i))",
      "\\o.k"
    );
  }

  @Test
  public final void test118() {
    reducesTo(
      "(\\x.F (W ((\\f.\\v.(\\o.(\\s.\\x.Q) (E (U K))) (\\i.\\h.(\\k.o) P)) i) i) (r (\\o.\\q.\\m.\\y.y))) (\\e.(\\s.K) (B (\\o.i ((\\x.(\\t.(\\i.\\v.(\\n.g t) (\\q.Y)) a) (\\r.\\i.\\q.(\\v.q) ((\\j.l) (s F) (G k (r q))))) q))))",
      "F (W (\\v.\\x.Q) i) (r (\\o.\\q.\\m.\\y.y))"
    );
  }

  @Test
  public final void test119() {
    reducesTo(
      "h ((\\y.z (\\e.(\\c.\\n.\\l.(\\c.j) (\\y.\\c.e (d (s n))) (\\a.Q (B (\\x.a v (c p))))) (\\p.\\q.\\t.(\\u.(\\z.a) ((\\j.\\f.j X) (r p d))) p))) (\\q.(\\i.\\x.\\o.f ((\\u.t) (\\f.\\o.K) E) (r ((\\z.p) (\\h.m) d) (P Q (\\o.B) (\\b.(\\f.x) (\\b.v)) w))) ((\\c.(\\j.L (\\n.y)) E (\\n.v)) (k (s (d b (\\s.W)))) (\\t.W)))) (m (\\t.(\\i.w) ((\\d.J j (\\d.d) (n h h) P (\\l.(\\q.\\l.\\w.D) (\\e.(\\h.z) o) (\\i.v)) ((\\n.(\\l.h m (\\n.o)) (\\v.\\q.q)) (\\d.a e (K p) (\\g.m h (X a))) (\\x.d (\\z.i) (l m (m Q)) g))) (\\c.\\v.w))))",
      "h (z (\\e.\\n.\\l.j (\\a1.Q (B (\\x.a1 v (\\q.\\t.a)))))) (m (\\t.w))"
    );
  }

  @Test
  public final void test120() {
    reducesTo(
      "\\q.\\x.\\l.b (c (\\n.(\\y.(\\q.u) (b p) (\\p.\\f.d f) w) (\\c.\\n.(\\j.(\\o.m) (\\h.j)) K (\\z.\\f.\\p.y h (o d))) y) (\\y.p (\\d.\\u.v)) u)",
      "\\q.\\x.\\l.b (c (\\n.u (\\p.\\f.d f) w y) (\\y.p (\\d.\\u.v)) u)"
    );
  }

  @Test
  public final void test121() {
    reducesTo(
      "\\f.(\\v.(\\l.(\\w.\\g.R (\\u.(\\a.R (P m)) (\\t.\\i.P z) ((\\c.D u (K r)) A) (\\i.\\i.w) (\\m.\\b.(\\w.\\y.\\b.p O (\\z.z)) B L))) B) (\\t.\\f.F)) (o (\\u.\\f.Z (\\l.t)))",
      "\\f.\\g.R (\\u.R (P m) (D u (K r)) (\\i.\\i.B) (\\m.\\b.\\b.p O (\\z.z)))"
    );
  }

  @Test
  public final void test122() {
    reducesTo(
      "\\t.(\\n.\\p.a) (\\q.(\\x.(\\g.\\b.\\g.A) (m L ((\\s.\\m.(\\x.C N (\\d.a) ((\\j.n) (e i))) x) (\\x.(\\h.e) (\\f.e) (\\t.v C d) y)))) h y)",
      "\\t.\\p.a"
    );
  }

  @Test
  public final void test123() {
    reducesTo(
      "(\\j.P) (m (a (\\n.(\\l.\\a.(\\a.\\p.\\z.(\\h.c) (i m)) ((\\w.(\\x.f) (\\d.l)) (k l))) w (\\k.\\x.j))) (j K b (\\i.f (H (d q (\\r.d) ((\\i.B) i) (\\d.\\b.L)))) x))",
      "P"
    );
  }

  @Test
  public final void test124() {
    reducesTo(
      "(\\z.\\h.(\\p.f ((\\d.c) (\\p.x))) (\\t.(\\e.J e a w) (k ((\\b.V) ((\\c.\\p.(\\y.j) (\\d.q q)) (\\x.(\\v.f S (y m)) u))))) n) (\\n.\\y.a)",
      "\\h.f (c) n"
    );
  }

  @Test
  public final void test125() {
    reducesTo(
      "(\\b.(\\n.\\s.\\m.(\\s.d) ((\\j.\\w.\\i.\\o.a) ((\\r.(\\m.(\\f.k) (\\n.v)) s) (q ((\\d.z) (P T))) (m (\\v.\\g.h)))) (j ((\\z.\\j.\\u.(\\r.\\d.F) ((\\u.x C) i)) (p (\\j.(\\f.\\q.\\s.\\b.p) ((\\w.\\q.S) (w (d K)))))))) (\\f.i)) (\\o.X)",
      "\\s.\\m.d (j (\\j.\\u.\\d.F))"
    );
  }

  @Test
  public final void test126() {
    reducesTo(
      "u ((\\z.z (\\w.(\\r.(\\t.(\\u.Q) (x m)) (F (o X))) (s ((\\v.P) f)) (\\i.(\\u.\\u.q) u) (\\d.\\h.(\\b.(\\z.N o (u T)) (\\c.a p (\\o.c))) (\\a.\\a.\\m.(\\z.f p) x) D) ((\\j.c I c (\\t.S d (\\d.p) (Q n (T j)) p)) (M (\\l.e))))) (a W))",
      "u (a W (\\w.Q (\\i.\\u.q) (\\d.\\h.N o (u T) D) (c I c (\\t.S d (\\d.p) (Q n (T (M (\\l.e)))) p))))"
    );
  }

  @Test
  public final void test127() {
    reducesTo(
      "\\d.U",
      "\\d.U"
    );
  }

  @Test
  public final void test128() {
    reducesTo(
      "(\\x.(\\x.Y) ((\\e.\\n.\\j.q) (\\z.(\\n.L j) (\\g.(\\d.\\t.(\\s.e C) (n (G D))) (\\a.\\n.(\\c.\\y.Y) (\\c.J e)) (\\v.(\\r.\\l.\\l.\\o.k D) (\\w.(\\q.S i) (\\z.m T))))))) k (\\a.\\y.\\i.\\y.(\\q.z ((\\p.(\\d.(\\v.\\y.\\m.\\m.f J (a A)) h) ((\\j.d h (\\a.q)) (W (\\x.m)) F)) I) l) ((\\v.(\\x.(\\i.(\\x.D (\\x.h)) r) (h (E L) (\\p.\\z.o s) (\\v.w))) (\\d.\\m.(\\x.D) o)) g i))",
      "Y (\\a.\\y.\\i.\\y.z (\\y.\\m.\\m.f J (a A)) l)"
    );
  }

  @Test
  public final void test129() {
    reducesTo(
      "(\\n.\\l.(\\d.c) ((\\c.(\\g.(\\z.\\s.\\g.c) (\\t.\\c.(\\e.H) (\\n.\\t.a))) (\\s.(\\x.\\n.(\\u.\\k.f) (\\h.(\\j.g Y) (\\g.c j))) (p q (\\b.b) ((\\s.O) (f k)) (x (k H x))) ((\\o.\\m.x) (\\l.a s (y T) l (\\v.(\\m.e v f) P))))) ((\\c.(\\r.\\c.\\e.(\\y.\\k.(\\m.\\y.C) (\\k.r) (\\g.\\b.f (\\f.E))) (\\l.\\e.g)) (\\v.(\\i.\\p.\\k.(\\f.\\i.Y) (\\k.\\d.U)) ((\\w.\\i.o) (o (\\t.e (C g)))))) (\\v.(\\z.\\j.f) (\\q.\\z.(\\w.(\\m.N) m ((\\s.k) (r w))) B (\\d.p (\\z.\\c.O) (P k (Q m) (h (Q b))))))))) (\\r.\\n.P)",
      "\\l.c"
    );
  }

  @Test
  public final void test130() {
    reducesTo(
      "t ((\\v.(\\i.(\\c.\\w.(\\a.(\\q.\\x.c) (M a (\\q.p))) y) ((\\d.(\\o.(\\a.m) (\\v.a)) (\\w.a S)) (\\f.\\x.\\j.\\f.D))) c) (p A ((\\w.I) (Z n) (\\r.\\m.f) ((\\u.Y) (p d) v) (m (\\m.Q))))) ((\\b.t) (\\d.(\\r.\\c.\\q.r L (c P) (j n (t l))) (\\t.b) (\\d.P H)) ((\\x.\\l.S (V i (i x)) (\\o.\\k.q (h Z) A)) (\\w.(\\b.\\x.p b) (m e (l T)) g) ((\\c.(\\m.(\\p.\\q.\\i.h) (\\o.d)) (\\y.S (m v (M d)))) ((\\a.\\p.\\c.h) (\\c.(\\g.D) (D d)) (q y w ((\\m.r) (\\h.d)))))) (S ((\\n.f) e))) ((\\h.(\\j.S) J) (x (\\n.E (\\g.(\\d.\\j.\\f.(\\d.F) t) ((\\z.d s W) (\\u.W)) (y R k ((\\a.f) o) (Y W (\\s.r) o)))) (\\z.(\\j.\\q.u (t s) l ((\\r.P) ((\\v.J) (Q h)))) (\\d.\\k.(\\e.c) (\\v.E) (\\d.\\n.q x) ((\\k.g (M P)) Y)) (U z) (\\v.d (\\q.\\a.\\z.\\f.\\z.o)))))",
      "t (\\w.\\x.m) (t (S (V i (i (\\w.p (m e (l T))))) (\\o.\\k.q (h Z) A)) (S (f))) (S)"
    );
  }

  @Test
  public final void test131() {
    reducesTo(
      "(\\w.\\w.\\k.(\\k.l (\\a.(\\r.K U (\\v.\\c.k)) (l b (\\a.a) (\\c.(\\e.h) (\\f.S)))) (\\h.\\f.\\s.o)) ((\\z.\\r.o) (o t (Z x)) (\\y.\\n.a C) f (L (p ((\\q.n) (\\r.Y))) t))) (D (\\g.(\\w.\\m.\\s.\\f.V) ((\\t.\\w.\\e.\\g.(\\s.E (m r) (T p (V w))) C) ((\\t.(\\n.v) (\\o.A)) (U M e) (\\m.t s (\\v.n) ((\\l.R) (\\h.L))))))) (T ((\\p.p) (\\z.(\\h.(\\g.l) (R e)) (N X k)) ((\\a.h) (\\o.W) (V t (A L)) (N H (\\n.u) (\\x.y (\\h.f)))) (\\f.p) ((\\m.K) n))) o",
      "l (\\a1.K U (\\v.\\c.o f (L (p (n)) t))) (\\h.\\f.\\s.o)"
    );
  }

  @Test
  public final void test132() {
    reducesTo(
      "(\\r.\\u.\\j.y) y l",
      "\\j.y"
    );
  }

  @Test
  public final void test133() {
    reducesTo(
      "O (\\m.F)",
      "O (\\m.F)"
    );
  }

  @Test
  public final void test134() {
    reducesTo(
      "\\e.\\e.i",
      "\\e.\\e.i"
    );
  }

  @Test
  public final void test135() {
    reducesTo(
      "(\\b.\\u.(\\u.\\t.(\\w.\\c.\\f.(\\h.\\m.(\\i.K O) n (\\k.x A)) l) ((\\e.p) ((\\w.b) (I (c (g m)))) (\\a.\\n.m) (\\h.Y c))) (\\w.L)) (\\v.\\n.N)",
      "\\u.\\t.\\c.\\f.\\m.K O (\\k.x A)"
    );
  }

  @Test
  public final void test136() {
    reducesTo(
      "\\q.\\l.M",
      "\\q.\\l.M"
    );
  }

  @Test
  public final void test137() {
    reducesTo(
      "\\u.(\\f.G (\\r.M Y v (w ((\\f.\\a.X) ((\\e.b) v (\\x.t (\\r.A))) (w C)) (\\l.(\\p.c k (\\p.p) B) (\\p.m) (\\y.l) x)))) (a (\\x.(\\h.u) h))",
      "\\u.G (\\r.M Y v (w (X) (\\l.c k (\\p.p) B (\\y.l) x)))"
    );
  }

  @Test
  public final void test138() {
    reducesTo(
      "\\v.m",
      "\\v.m"
    );
  }

  @Test
  public final void test139() {
    reducesTo(
      "m (\\h.(\\f.\\b.Y) ((\\i.m) ((\\c.(\\r.d) (\\q.c)) W)) ((\\j.d (\\s.W) (\\k.Y)) ((\\p.\\b.L Q) ((\\b.e) (l r)) (\\x.(\\w.\\n.\\j.K) (T o (u q))) (O (\\w.\\u.(\\s.q) (w y) (p (\\x.e))))) (\\y.\\u.Y e) (\\y.(\\z.\\y.\\d.\\p.(\\g.(\\e.\\p.(\\h.h) d) (\\x.t (\\o.s (K I (\\m.C))))) (x p)) i)))",
      "m (\\h.Y)"
    );
  }

  @Test
  public final void test140() {
    reducesTo(
      "\\c.(\\g.\\k.t) (W y f) s",
      "\\c.t"
    );
  }

  @Test
  public final void test141() {
    reducesTo(
      "\\j.O",
      "\\j.O"
    );
  }

  @Test
  public final void test142() {
    reducesTo(
      "(\\u.\\u.\\m.q) ((\\l.\\q.\\i.\\q.\\c.\\j.\\u.\\x.\\v.(\\m.\\f.\\r.i) (\\n.c F (\\b.X)) (\\h.A (\\v.\\w.\\r.a)) (\\a.\\m.k i L (\\k.t (p A)) (\\l.t l (\\i.a) (\\q.\\o.m))) (\\k.q (\\i.d)) l) (K (\\y.(\\w.p) (t w (\\v.T) h)) (\\m.(\\a.\\z.q) (\\k.(\\u.\\k.\\x.(\\e.j) (A e) (\\m.i Z)) (\\n.\\v.\\v.\\i.\\w.\\a.\\d.k))) (\\r.V (c (\\g.\\v.H n)) (s ((\\u.(\\i.t) (a z)) g)) ((\\b.\\d.B) (\\b.(\\f.k) (\\j.b)) R T)))) S",
      "\\m.q"
    );
  }

  @Test
  public final void test143() {
    reducesTo(
      "\\z.x L",
      "\\z.x L"
    );
  }

  @Test
  public final void test144() {
    reducesTo(
      "(\\f.\\v.s) ((\\d.\\b.\\u.g) ((\\o.(\\u.\\l.\\m.\\t.\\h.\\g.\\f.B) h) (\\y.\\y.\\s.\\y.T) (H V (\\u.d) (\\b.\\l.\\t.z) ((\\r.\\j.I a) (\\l.\\a.V)) (\\c.K) ((\\q.(\\u.i) (P r) (W r)) (d (\\i.p)) Y))) ((\\z.\\f.(\\n.\\e.\\f.\\s.(\\a.M) (\\n.v)) (\\b.v) (\\g.n (\\r.s) (\\x.w) (\\n.(\\a.t) (\\v.T))) ((\\q.V) (\\s.q) g (\\h.F) (\\i.\\g.\\o.(\\j.b) (S (m y (\\v.r)))))) (l (n B (\\y.L) X) (\\h.o) I) (S ((\\d.v) ((\\c.\\y.\\y.\\q.\\s.\\x.U u) (\\t.p)) V))))",
      "\\v.s"
    );
  }

  @Test
  public final void test145() {
    reducesTo(
      "\\v.r (u o ((\\u.j) ((\\p.y) (\\w.\\g.\\z.l))) n) ((\\l.t (X q)) ((\\a.p) (\\i.o) (\\w.\\o.B m)) n (\\k.\\v.A) ((\\r.\\x.\\n.\\u.\\x.\\z.\\r.I) (d (\\r.\\u.v)) ((\\z.V w) (\\j.t C (\\c.n)) (\\w.\\s.f ((\\q.P) y)) (p (\\d.p) (O U F) (\\c.X))))) (n (\\q.(\\z.B) (\\n.(\\i.(\\m.o) (\\j.G (\\f.\\t.\\b.M))) e))) (\\j.\\l.(\\q.\\q.\\v.(\\w.c v) F) (\\k.w) s (\\e.Q) (\\s.p) (\\u.\\f.\\a.(\\r.\\z.\\f.\\g.H) (\\u.(\\f.\\f.(\\j.k) ((\\r.o (\\g.P)) (\\r.\\h.l j))) ((\\b.j) ((\\a.Z) (\\f.c)) (\\g.\\k.\\o.(\\i.Y) l (\\y.v r))) D)) x)",
      "\\v.r (u o (j) n) (t (X q) n (\\k.\\v.A) (\\n.\\u.\\x.\\z.\\r.I)) (n (\\q.B)) (\\j.\\l.c (\\e.Q) (\\s.p) (\\u.\\f.\\a.\\z.\\f.\\g.H) x)"
    );
  }

  @Test
  public final void test146() {
    reducesTo(
      "F ((\\f.(\\w.\\l.\\f.\\n.\\c.\\a.\\m.(\\i.(\\o.\\p.\\d.(\\l.f) h) (\\m.(\\o.E) (\\k.k z))) (C (x W (c L)) (\\y.y))) K (\\w.\\n.t (u y) N ((\\w.(\\q.b) (\\g.j) (\\r.U s)) ((\\r.\\v.f) (r D (J G)))) (\\n.w)) W) ((\\e.(\\r.\\r.d) ((\\s.\\q.\\l.L) (\\o.q) y s) ((\\m.p) n (\\a.D (\\l.a)))) (h k (\\b.\\i.\\t.f))))",
      "F (\\n.\\c.\\a.\\m.\\p.\\d.W)"
    );
  }

  @Test
  public final void test147() {
    reducesTo(
      "\\u.(\\j.\\q.t) ((\\b.\\n.(\\y.\\p.(\\f.\\g.\\m.\\u.(\\w.\\p.t) ((\\g.r) (Y t)) (H (d P d))) ((\\v.c z (f J)) (S (i h)) (\\r.\\d.\\t.M c (\\o.f) (G J (j N))))) (\\w.z ((\\m.\\o.n) (\\w.b v)))) (\\r.(\\l.g) b ((\\i.s i M ((\\c.o) (u i))) ((\\a.d) c (\\v.(\\r.f) (W j)))) (\\s.N)) (R n G t h (\\n.\\j.e (o p (\\h.R)) (\\n.(\\s.\\n.k) ((\\e.O) (v G)))) (\\d.(\\f.\\e.\\m.(\\p.z (\\e.\\z.a)) (\\b.U)) ((\\k.(\\a.z K) (\\x.j)) i)) w)) (\\h.(\\s.\\s.A) K)",
      "\\u.t"
    );
  }

  @Test
  public final void test148() {
    reducesTo(
      "(\\l.V) (\\h.\\d.e (D (\\k.\\i.a (\\w.\\j.A)) (\\v.\\d.\\u.(\\s.n) (u l) (l I (P d)) (\\x.\\c.\\z.V x)) (\\a.(\\o.T (p u (k B) Q)) (\\u.P)) L)) ((\\o.(\\j.h) (\\m.(\\g.(\\i.c) e) ((\\u.j) u) (I (w R) (\\o.(\\c.o) (V s))) i (\\n.X (r (\\y.S)) (\\x.\\d.(\\p.a) (\\s.w) m) I)) i) (\\w.(\\u.\\e.\\w.P l (u E) ((\\l.j) (\\e.v)) (\\c.W k s ((\\y.q) (\\k.w))) ((\\i.\\v.(\\n.i y) (\\k.\\h.l)) (\\x.\\e.q)) (\\e.\\u.r (b (\\y.z (\\n.u)))) (\\m.i)) ((\\v.t) j)))",
      "V (h i)"
    );
  }

  @Test
  public final void test149() {
    reducesTo(
      "(\\d.\\s.\\r.U (m G) (\\g.f)) ((\\y.z (n (\\g.a)) t (\\f.\\r.\\q.Z (\\e.n))) z) E",
      "\\r.U (m G) (\\g.f)"
    );
  }

  @Test
  public final void test150() {
    reducesTo(
      "(\\t.K) ((\\r.(\\z.R) (\\q.d)) (\\n.(\\u.\\z.(\\c.\\f.i b ((\\i.(\\c.y) (\\o.z)) (l h))) ((\\m.\\o.k) H) ((\\r.\\f.D (\\y.g (Q p (\\v.S)))) (\\g.p)) (\\p.d)) (\\s.J (s ((\\p.(\\n.P) (\\a.s) (\\k.x p (v a))) (\\d.(\\v.x) ((\\e.J) (\\g.F))) ((\\p.\\v.d y) (\\m.\\c.d r) b))))))",
      "K"
    );
  }

  @Test
  public final void test151() {
    reducesTo(
      "\\j.\\r.\\g.(\\n.(\\n.(\\j.(\\g.\\r.y) (\\u.b)) (c (q (t ((\\i.\\j.v f) ((\\q.R) (x d))) ((\\p.(\\i.P) i) (\\g.\\u.m k) (\\v.N)))))) (\\v.\\p.u)) (O (\\x.G))",
      "\\j.\\r.\\g.\\r.y"
    );
  }

  @Test
  public final void test152() {
    reducesTo(
      "L (\\s.w)",
      "L (\\s.w)"
    );
  }

  @Test
  public final void test153() {
    reducesTo(
      "\\u.s",
      "\\u.s"
    );
  }

  @Test
  public final void test154() {
    reducesTo(
      "\\u.\\q.Q (\\x.q)",
      "\\u.\\q.Q (\\x.q)"
    );
  }

  @Test
  public final void test155() {
    reducesTo(
      "\\r.\\k.\\d.\\w.(\\l.\\q.\\e.\\f.j ((\\c.\\s.z (\\u.T)) (\\f.(\\v.s) (z R) (z (\\s.C)) (y C (\\x.a) G))) (\\j.\\j.j X b r)) o Z ((\\q.\\r.\\e.(\\v.\\q.n) (X (\\w.(\\n.\\e.(\\a.\\n.l) ((\\e.P) (W i))) (\\g.o) (\\f.\\l.(\\l.(\\e.w) e) (\\q.B b (\\o.N)) ((\\g.J N (d v)) (s L))))) (\\m.E)) ((\\x.J) j))",
      "\\r.\\k.\\d.\\w.\\f.j (\\s.z (\\u.T)) (\\j.\\j.j X b r)"
    );
  }

  @Test
  public final void test156() {
    reducesTo(
      "\\s.(\\b.q ((\\e.o h (\\r.e)) (\\m.K)) (\\u.\\l.\\a.\\r.\\h.\\t.i o ((\\u.d c j ((\\a.u) (\\v.b)) (\\t.A (\\w.\\e.\\v.O)) (\\a.\\u.n)) p)) (I i ((\\z.(\\s.d) (\\q.d)) (\\g.M (\\k.(\\s.\\j.\\g.(\\d.Z) (\\p.q u) (t I (o s) (X Y))) (D (\\a.n) (\\l.o t (\\j.a)) (O z (\\z.a) ((\\q.V) (e o))))))))) (\\e.(\\n.N) (i ((\\c.(\\a.(\\a.q) (\\f.j) e) (d ((\\p.O) (v D))) (\\l.\\c.\\r.\\d.(\\w.(\\x.s) w) (a q (\\u.T) (\\d.\\n.u)))) ((\\e.x b (\\u.G) (\\b.\\c.\\g.v)) (\\j.\\b.\\z.(\\c.w) (\\d.y) (R c (J t))) (p (\\a.c (\\k.\\k.w B))))) (u ((\\y.\\s.y) (z (\\t.t D (\\u.I))) L K))))",
      "\\s.q (o h (\\r.\\m.K)) (\\u1.\\l.\\a2.\\r.\\h.\\t3.i o (d c j (p) (\\t.A (\\w.\\e.\\v.O)) (\\a.\\u.n))) (I i (d))"
    );
  }

  @Test
  public final void test157() {
    reducesTo(
      "\\y.\\b.\\u.X u",
      "\\y.\\b.\\u.X u"
    );
  }

  @Test
  public final void test158() {
    reducesTo(
      "\\e.(\\i.\\p.\\j.\\k.(\\l.\\i.(\\f.\\q.\\l.Y) ((\\g.w X) (r (\\p.s)) (q (g o (\\n.E)))) (\\o.(\\z.\\f.f) Z n (\\u.h e))) (\\s.\\e.(\\r.K) ((\\r.D) (\\u.x t (K v) (r S (Z x)) (\\f.\\e.\\o.Q))))) ((\\v.\\o.\\b.(\\p.\\i.x) (\\d.\\e.r)) ((\\p.(\\r.\\a.t ((\\k.S) n)) (\\z.(\\o.i) (\\y.\\w.h H))) ((\\g.\\g.e q) (t d (\\r.z)) (u K (\\m.X) (\\e.b (\\u.o)))) n)) (u (V (\\k.\\p.\\s.n))) (\\g.\\j.Q)",
      "\\e.\\k.\\i.\\l.Y"
    );
  }

  @Test
  public final void test159() {
    reducesTo(
      "(\\z.(\\j.H (l (\\h.\\n.\\h.g) (\\i.\\j.(\\k.s) (\\k.o) O)) (d ((\\m.(\\t.M) ((\\c.r) (X O))) (\\l.x))) (\\f.\\z.y) (\\i.i)) ((\\g.(\\z.(\\z.\\v.\\i.w) A ((\\q.\\g.\\t.b) (r h p)) p) (\\o.a h ((\\x.D) (j y)) (n (\\q.T b (\\m.s))) (a (\\b.(\\m.j) ((\\q.K) (\\h.C)))))) (j H) ((\\q.\\z.(\\c.s) O) (\\e.T (\\s.v)) ((\\x.S B) (h (v x D)) t)))) (\\s.\\a.\\f.\\d.\\n.(\\g.\\d.(\\f.A) ((\\h.(\\x.m (\\v.c (z y) (\\q.\\e.n))) p) ((\\s.(\\o.A) (\\d.B)) (v B (\\j.H)) (\\n.\\w.w F (\\x.C) l) N))) ((\\d.\\x.\\y.a (\\n.y d) (\\o.(\\j.\\u.W r) (s G (n v)) (\\a.(\\o.(\\w.p) (v x)) (\\f.a t (T S))) c)) ((\\d.w) (\\q.\\w.t))) ((\\m.(\\u.(\\f.\\g.\\a.k) ((\\n.Y) (\\g.m))) ((\\m.e) (\\t.y) k) (O (\\w.\\y.Z))) ((\\f.\\a.(\\k.\\h.\\h.\\g.\\n.\\g.F) (\\g.\\k.J ((\\a.v) (\\g.p)))) (\\n.S (\\r.(\\y.z (\\n.q)) (\\j.\\n.\\k.f)))) (\\n.\\h.o) Y))",
      "H (l (\\h.\\n.\\h.g) (\\i.\\j.s O)) (d (M)) (\\f.\\z.y) (\\i.i)"
    );
  }

  @Test
  public final void test160() {
    reducesTo(
      "\\p.\\b.\\r.\\d.\\r.m",
      "\\p.\\b.\\r.\\d.\\r.m"
    );
  }

  @Test
  public final void test161() {
    reducesTo(
      "I (\\c.b (\\q.F (\\a.i) (\\y.O (o (s (Q m))) b ((\\i.u) k) O)))",
      "I (\\c.b (\\q.F (\\a.i) (\\y.O (o (s (Q m))) b (u) O)))"
    );
  }

  @Test
  public final void test162() {
    reducesTo(
      "(\\m.\\r.E (\\h.\\k.\\q.\\r.t ((\\o.B) ((\\b.q (\\c.\\h.\\c.\\m.\\b.O)) ((\\x.Z) a Y))))) ((\\r.s ((\\l.d) ((\\k.\\a.a) c) (b (\\a.\\y.\\r.(\\f.z) (F A) (\\u.E d)) ((\\w.\\a.h r) d ((\\j.l I (p x)) (t (\\y.w))))))) h) (J (w E ((\\k.\\g.(\\h.w r (\\e.g) (\\g.\\d.m) (\\v.e)) (\\i.\\l.g (u (y (\\a.t) ((\\g.y) (e o)))))) u)))",
      "E (\\h.\\k.\\q.\\r.t (B))"
    );
  }

  @Test
  public final void test163() {
    reducesTo(
      "\\i.r",
      "\\i.r"
    );
  }

  @Test
  public final void test164() {
    reducesTo(
      "\\z.\\k.\\c.\\o.\\t.f (t ((\\y.u (e (Y P (w s)) x) (\\s.\\b.\\r.u)) w)) (r ((\\p.g) ((\\m.(\\f.\\f.\\l.(\\x.\\i.\\b.\\z.\\h.v l) H) (H (n u (l I)) F)) (\\o.\\m.(\\j.\\u.j) (s l (\\w.S) (\\o.\\e.p s)) (\\p.C)))) (\\r.B))",
      "\\z.\\k.\\c.\\o.\\t.f (t (u (e (Y P (w s)) x) (\\s.\\b.\\r.u))) (r (g) (\\r.B))"
    );
  }

  @Test
  public final void test165() {
    reducesTo(
      "(\\t.\\w.T ((\\d.j) (\\s.w) (w T (\\q.s)) z u (\\n.\\n.f (E w) (\\w.\\h.f w) (\\p.\\b.g l (\\d.B) (j z M)) (\\p.P n (U Y) ((\\f.l) (\\a.Y)) (\\j.H u (\\h.\\m.X)))) ((\\z.j (T (w r B))) (\\r.t) (o (\\r.z n (\\c.R) (\\s.c (\\r.U))) p)) (d ((\\y.\\l.\\k.e (\\o.\\w.m j (\\d.V) (\\t.\\o.t)) q) s)))) (\\p.\\o.\\a.z)",
      "\\w.T (j (w T (\\q.s)) z u (\\n.\\n.f (E w) (\\w.\\h.f w) (\\p.\\b.g l (\\d.B) (j z M)) (\\p.P n (U Y) (l) (\\j.H u (\\h.\\m.X)))) (j (T (w r B)) (o (\\r.z n (\\c.R) (\\s.c (\\r.U))) p)) (d (\\l.\\k.e (\\o.\\w.m j (\\d.V) (\\t.\\o.t)) q)))"
    );
  }

  @Test
  public final void test166() {
    reducesTo(
      "\\j.D",
      "\\j.D"
    );
  }

  @Test
  public final void test167() {
    reducesTo(
      "m h I ((\\f.(\\i.E) ((\\l.(\\w.\\m.(\\i.\\r.\\x.c) r) ((\\s.\\h.\\i.\\x.o e (\\g.w)) ((\\y.\\n.\\p.k) (\\h.a (\\a.h))))) o)) (q (\\d.(\\g.\\q.U) ((\\g.z) (\\n.A)) (c q i b) (\\e.e) (\\a.e))) (i ((\\i.A) z)))",
      "m h I (E (i (A)))"
    );
  }

  @Test
  public final void test168() {
    reducesTo(
      "n (\\h.(\\a.\\h.(\\t.H) ((\\y.\\s.\\q.a (\\g.(\\w.w) (C L) (\\v.w q (X p)) (\\z.\\p.a))) (\\g.\\v.d))) O ((\\u.K) ((\\k.\\z.\\x.X x) (\\u.U))))",
      "n (\\h.H)"
    );
  }

  @Test
  public final void test169() {
    reducesTo(
      "(\\q.g (\\s.U)) (\\w.(\\d.\\q.\\g.x (\\e.\\v.\\v.B)) (\\n.(\\x.J ((\\x.(\\a.\\m.(\\v.e) (l E) (h r)) ((\\t.(\\z.f) X) (o (\\i.n)))) (\\y.\\p.\\c.G))) p (\\k.(\\r.N J) (\\q.\\q.z))))",
      "g (\\s.U)"
    );
  }

  @Test
  public final void test170() {
    reducesTo(
      "\\z.(\\p.(\\o.a) (\\c.(\\w.Z) B) (\\r.(\\g.\\x.k O) (G ((\\y.\\l.u (x T) (\\a.Y j)) m) ((\\k.(\\o.o) (\\f.V)) (F T (\\g.u)) (\\k.(\\s.(\\a.g) (\\i.p)) (\\s.(\\n.L) (s x))) (\\x.(\\m.o) (\\r.m)))))) (\\h.V m) (\\q.\\p.\\l.\\a.(\\z.\\n.\\d.\\b.(\\k.x) ((\\e.\\q.J M (\\i.k (\\i.(\\y.C) (\\y.B S)))) (\\i.m)) (E ((\\m.\\i.\\f.\\w.(\\c.f) ((\\w.m) K)) (\\u.\\f.\\i.j)))) ((\\e.i) ((\\o.(\\g.T) (a d) (m I) (Z o (\\g.w) G) m Y) (\\f.\\b.(\\k.\\l.i v ((\\c.g e o) (\\v.\\l.\\q.j)) (t (\\i.\\j.\\r.U) (Z (\\w.\\o.y z)))) ((\\c.Q) (\\w.(\\k.(\\f.h k) (w F (o n))) r))))))",
      "\\z.a (\\r.\\x.k O) (\\q.\\p.\\l.\\a.\\n.\\d.\\b.x (E (\\i.\\f.\\w.f)))"
    );
  }

  @Test
  public final void test171() {
    reducesTo(
      "(\\d.\\l.\\q.\\e.f (k s (\\t.R))) ((\\o.\\b.(\\g.(\\o.r (\\c.Y) (e v (c l))) (\\u.\\t.\\s.\\e.\\i.\\q.w)) (c (\\p.\\r.C p) ((\\y.a r (x x)) (v (g F))))) (\\f.\\p.w) ((\\o.j F) w) (\\l.\\p.m W)) g",
      "\\q.\\e.f (k s (\\t.R))"
    );
  }

  @Test
  public final void test172() {
    reducesTo(
      "(\\w.(\\q.\\y.\\c.Y) (\\i.n (\\g.d))) (q (\\y.P)) (\\b.\\c.D (\\k.\\a.\\t.y (\\o.x (\\j.A R (\\w.W)) ((\\s.A) (\\v.r t v)) (\\m.a) (t (e (\\q.\\o.u))))) (\\b.\\g.(\\u.(\\l.b (E v w)) (\\o.(\\r.y) (\\s.C) (v x Q))) (T (j (f V)) (\\x.(\\k.j) (\\h.b) (\\r.\\y.d))) (\\y.(\\k.y) x (\\w.J i (Y j) (\\u.n (\\a.i))) k) B v))",
      "\\c.Y"
    );
  }

  @Test
  public final void test173() {
    reducesTo(
      "n v ((\\c.\\h.\\k.(\\q.z e ((\\l.s) x) (T (X Q b))) (\\n.r) (n M ((\\v.a (\\d.\\t.\\t.e)) ((\\c.\\b.t e) (r (w r))))) (\\p.(\\f.j) (\\g.M L w)) u) (Y o (\\e.(\\z.i) ((\\o.\\y.\\l.\\h.(\\b.\\x.\\f.\\b.\\u.\\g.(\\b.\\e.K) (\\h.q)) ((\\g.d) (\\m.O (\\m.h)))) (\\r.t (c Q U ((\\a.e) (\\m.X))) S)))))",
      "n v (\\h.\\k.z e (s) (T (X Q b)) (n M (a (\\d.\\t.\\t.e))) (\\p.j) u)"
    );
  }

  @Test
  public final void test174() {
    reducesTo(
      "(\\q.(\\h.\\t.l (\\q.\\s.\\q.n)) ((\\o.\\a.T u) (\\s.\\w.X w) (\\f.O) O) (\\y.\\x.T) ((\\f.(\\q.(\\q.\\u.w) (K (\\w.\\i.C))) (e (z y))) (b (\\z.(\\e.\\c.(\\o.(\\p.D u) (a (\\i.V))) t) (\\p.a (\\o.D) (j B (H e)) (\\c.(\\m.o) (v n) (\\m.r (\\e.u)))))))) (Z (\\r.(\\p.w) ((\\m.(\\g.b P (\\n.e) a) (\\b.H F a (\\j.f d (D u))) ((\\r.(\\v.w (f K)) (\\a.\\u.\\h.F)) (\\x.L (\\t.(\\u.n) (\\f.u))))) (\\w.(\\e.T) (\\b.I))))) ((\\g.\\i.(\\n.F) (\\y.i) ((\\f.g) ((\\w.p c (I V) (r (a f)) ((\\z.H) (\\p.d) ((\\v.b) (I d)))) (z S)))) (Z (\\n.Y e ((\\l.\\k.\\v.\\n.\\w.b) x))) ((\\e.j) (\\l.\\r.\\n.\\g.\\y.\\i.i n) (\\i.(\\c.(\\p.(\\a.(\\x.\\y.r) D) (\\g.\\p.(\\j.W) (V e (L p)))) (\\q.(\\s.(\\u.y v) (Z R)) (\\t.v (a w o)))) (\\p.\\i.s)) r))",
      "l (\\q.\\s.\\q.n) (\\u.w) (F (Z (\\n.Y e (\\k.\\v.\\n.\\w.b))))"
    );
  }

  @Test
  public final void test175() {
    reducesTo(
      "(\\y.\\n.b) (\\t.\\w.d (\\j.\\i.(\\q.H) (\\k.\\k.(\\k.i ((\\p.\\c.\\t.y K (\\z.e) (\\k.p i)) ((\\i.x p (\\r.l)) b))) (u p))) (\\i.\\m.(\\y.f ((\\p.\\l.\\g.(\\k.(\\g.\\c.\\o.r) ((\\t.(\\m.N) (U W)) (t (T a)))) (\\d.\\m.(\\c.a (\\l.\\l.b)) (\\y.p (\\f.\\t.b)))) I)) (\\p.\\e.V)))",
      "\\n.b"
    );
  }

  @Test
  public final void test176() {
    reducesTo(
      "(\\e.v) ((\\u.(\\v.\\f.\\y.\\w.\\w.\\b.(\\k.k x) p (W ((\\g.(\\a.n) u) (g E (\\y.y) (\\o.b V (\\q.c))) ((\\o.T b (H D)) (\\s.R) (\\g.V))))) ((\\l.m) (\\p.Y (\\v.X)))) (\\i.\\d.w Z ((\\q.D) ((\\j.(\\e.\\z.\\k.E) (e (\\x.w) (d (\\v.t)) (G (g p (G u))))) (M w)))))",
      "v"
    );
  }

  @Test
  public final void test177() {
    reducesTo(
      "\\t.\\c.p",
      "\\t.\\c.p"
    );
  }

  @Test
  public final void test178() {
    reducesTo(
      "(\\a.\\s.\\d.m) o ((\\v.(\\v.(\\h.\\t.M) (\\p.W)) ((\\g.K) ((\\q.(\\e.\\d.p) ((\\j.\\u.x V) X)) (\\n.l)) (\\i.\\v.h))) (\\t.(\\q.\\h.(\\s.(\\y.k u) l ((\\u.\\y.(\\e.v) (l o) (\\x.\\t.s)) (\\f.(\\g.k) (r d) (\\i.L)))) (j (q C p) (I ((\\t.o) (F t))) (\\u.(\\y.(\\r.y) (F V)) f ((\\l.l G (M p)) (\\r.S l (\\n.W)))))) ((\\b.t) (\\l.G) (\\f.\\a.\\c.m)) (\\u.i)))",
      "\\d.m"
    );
  }

  @Test
  public final void test179() {
    reducesTo(
      "(\\h.(\\k.(\\d.f) (\\l.o) (\\j.c C (i w)) (\\d.\\v.g) ((\\x.(\\s.r) (i b)) (\\s.(\\a.X) (\\d.p)) (a (\\c.b) (f z w)))) F ((\\m.(\\q.G) (\\z.K) ((\\k.\\o.j) (\\p.M Q (\\e.w)) ((\\v.(\\e.c) (\\v.E)) d))) O)) (\\x.\\z.\\w.\\z.e f) ((\\t.(\\h.n) ((\\e.q) (g J)) e (\\h.b)) (w f (\\b.k)) (w O) e) (\\c.i)",
      "f (\\j.c C (i w)) (\\d.\\v.g) (r (a (\\c.b) (f z w))) (G (j)) (n e (\\h.b) (w O) e) (\\c.i)"
    );
  }

  @Test
  public final void test180() {
    reducesTo(
      "(\\g.\\e.(\\p.\\e.\\h.c (\\t.\\q.G) (\\t.R)) (\\p.\\x.\\v.\\y.\\e.(\\u.f ((\\i.n a) a)) (\\c.O (\\b.j (a U) (F (\\e.k)))))) ((\\l.P) e w) w ((\\m.\\g.\\l.\\v.a) (\\h.\\h.\\l.e)) (H (L t))",
      "c (\\t.\\q.G) (\\t.R)"
    );
  }

  @Test
  public final void test181() {
    reducesTo(
      "\\p.\\w.\\i.m",
      "\\p.\\w.\\i.m"
    );
  }

  @Test
  public final void test182() {
    reducesTo(
      "(\\u.\\z.\\l.\\a.e) ((\\g.Q) ((\\q.X D (\\p.V) (r t (z Z)) (K A (\\m.R) (\\w.K I (\\t.F))) (v (Z m) (\\k.\\v.\\e.r) (\\h.d)) (d (\\f.f (K (m (\\z.t))))) d) (c (\\l.y (\\w.\\b.x)))))",
      "\\z.\\l.\\a.e"
    );
  }

  @Test
  public final void test183() {
    reducesTo(
      "\\j.h",
      "\\j.h"
    );
  }

  @Test
  public final void test184() {
    reducesTo(
      "(\\d.\\c.\\d.\\g.w p) (\\s.x)",
      "\\c.\\d.\\g.w p"
    );
  }

  @Test
  public final void test185() {
    reducesTo(
      "\\s.a (\\j.(\\s.\\q.(\\o.\\b.\\b.F ((\\n.P (\\e.(\\t.\\u.V) (b (\\z.l)))) (\\k.D (O K w) u))) (\\b.(\\q.S ((\\b.u) (\\l.l))) (\\b.\\c.\\n.\\b.(\\d.k) (\\k.T)) n r)) (S (m (\\z.\\j.\\s.(\\y.Z) ((\\q.(\\w.R) U) (d (z y))))) l)) (Z (\\a.X) (\\u.(\\b.(\\i.(\\z.\\d.\\a.f) ((\\j.\\v.D) (d (\\b.\\y.l) (\\i.R c (\\h.p) (h N (\\g.H)))))) (\\l.(\\w.\\m.\\k.p P (\\u.s) (U W (\\y.O)) x ((\\d.\\h.\\g.(\\j.X) (\\f.L)) ((\\i.m) (\\e.i) (\\u.r)))) ((\\f.(\\d.H) (n h) (\\b.\\f.d)) (y (\\c.i y)) (w s)))) ((\\n.\\o.\\o.(\\d.\\e.b) (u Z (\\n.f))) (\\b.c i (\\s.y) ((\\j.d) j)) n ((\\n.s ((\\n.o) (\\u.m) (\\m.\\g.\\q.u))) ((\\k.\\q.(\\p.\\d.n) G) p)) (\\g.(\\j.\\l.(\\l.(\\g.D) (k I)) r (\\q.x) (\\e.b)) q))))",
      "\\s.a (\\j.\\q.\\b.\\b.F (P (\\e.\\u.V))) (Z (\\a.X) (\\u.\\d.\\a.f))"
    );
  }

  @Test
  public final void test186() {
    reducesTo(
      "X (T (\\p.(\\e.\\f.\\s.(\\w.\\u.(\\s.w J) i) ((\\b.\\r.u m) (\\k.x))) (\\q.b) ((\\b.l) (\\p.Y) (\\o.(\\d.L) (r V)) W ((\\m.s ((\\a.G) (\\p.h))) (\\a.(\\w.S v (\\g.R)) J)))) r) ((\\u.O) ((\\v.\\b.u) ((\\i.\\r.\\j.Y) r)))",
      "X (T (\\p.\\s.\\u1.u m) r) (O)"
    );
  }

  @Test
  public final void test187() {
    reducesTo(
      "u (n (\\f.\\r.c (\\s.(\\s.R (\\j.\\x.e ((\\f.\\t.x q) (R k S))) v) N)))",
      "u (n (\\f.\\r.c (\\s.R (\\j.\\x.e (\\t.x q)) v)))"
    );
  }

  @Test
  public final void test188() {
    reducesTo(
      "(\\k.\\c.(\\i.(\\k.\\n.\\p.f) (\\v.(\\a.\\l.\\b.\\h.\\u.a) (\\b.\\w.Z) (r (\\x.(\\y.(\\f.q) (H u)) q) ((\\t.i) (\\y.r) (P (V V)) (f (B r (i j)))) ((\\u.\\h.\\c.T) (U a (\\d.z)) v a)))) ((\\y.e) z t)) ((\\s.R ((\\v.c) (\\z.h)) (r (\\q.\\t.(\\g.E) (\\a.l)) (a (\\q.(\\c.k) (\\m.v)) (\\h.\\m.\\s.\\m.h) (x (\\b.e))) t)) (O ((\\u.\\q.G) ((\\t.(\\q.t) (a j) (o O C)) (u ((\\r.y) (\\w.K))) (\\d.\\h.(\\j.\\r.(\\v.q z) f) X) ((\\h.q (e (w a))) f i)))))",
      "\\c.\\n.\\p.f"
    );
  }

  @Test
  public final void test189() {
    reducesTo(
      "\\a.\\t.\\h.\\w.V y",
      "\\a.\\t.\\h.\\w.V y"
    );
  }

  @Test
  public final void test190() {
    reducesTo(
      "(\\f.b ((\\j.d) ((\\k.(\\l.\\q.v) (Q Q (h s))) (\\a.\\v.(\\a.\\p.h) q))) (\\c.e (\\t.(\\x.j q) B) (\\m.X) (\\s.(\\s.k) (\\s.V g (\\w.B) (\\c.\\m.\\k.J)) v)) (\\z.K)) (t ((\\h.\\l.\\j.\\u.m) (\\g.\\q.\\u.o) (\\v.(\\m.(\\k.(\\w.N) ((\\e.S) (j w))) j Y) (\\g.j)))) p",
      "b (d) (\\c.e (\\t.j q) (\\m.X) (\\s.k v)) (\\z.K) p"
    );
  }

  @Test
  public final void test191() {
    reducesTo(
      "u (E (\\n.j))",
      "u (E (\\n.j))"
    );
  }

  @Test
  public final void test192() {
    reducesTo(
      "(\\m.c) (\\o.v) m",
      "c m"
    );
  }

  @Test
  public final void test193() {
    reducesTo(
      "(\\c.y a B ((\\h.\\p.(\\c.\\m.Y N) T (m D U G) (F ((\\r.V L (\\x.A)) (t C (\\s.q)))) (\\y.w T (\\n.(\\g.C (v j) ((\\n.o) (\\i.U))) (F ((\\z.e) (\\m.u))))) K) ((\\v.\\g.c) ((\\q.j A) a (\\g.y (\\o.v (b b (I g)))) ((\\b.\\n.y m) (\\f.(\\a.I) (\\x.v)) ((\\m.\\c.\\v.w) W) (\\v.\\z.\\u.a)))))) (c (\\z.(\\k.\\h.(\\f.\\z.(\\j.\\y.(\\p.c M) (p (r p))) ((\\f.q) (w Z) (U d (\\t.y)))) ((\\m.y E P) T ((\\a.\\t.D M) (\\u.\\m.p U)))) (O (\\q.o) (\\w.Q) (g j (\\o.T) (X x (e f))) (\\c.\\w.(\\x.m) d))) (\\q.K (\\s.z)) m)",
      "y a B (\\p.Y N (F (V L (\\x.A))) (\\y.w T (\\n.C (v j) (o))) K)"
    );
  }

  @Test
  public final void test194() {
    reducesTo(
      "\\s.\\b.k",
      "\\s.\\b.k"
    );
  }

  @Test
  public final void test195() {
    reducesTo(
      "\\d.(\\r.\\w.y) ((\\d.l) ((\\n.\\l.J C) V ((\\e.(\\j.y (\\b.\\u.Q) (\\g.f L (\\c.J) (\\g.p D m))) j) (\\w.\\a.(\\j.\\t.d ((\\j.X) x) M) B)))) (\\z.\\w.(\\j.(\\s.(\\m.\\e.\\c.\\a.\\k.y (\\g.J) (\\h.\\l.\\u.o) ((\\e.g (X C)) (\\j.\\t.f k) (\\d.h p)) (\\p.\\j.o)) P) (p Y)) W)",
      "\\d.y"
    );
  }

  @Test
  public final void test196() {
    reducesTo(
      "(\\p.g W) (Y g) (\\d.(\\l.\\v.(\\x.(\\j.p) u k) (\\x.\\c.\\c.(\\z.o) (\\r.\\w.\\n.h))) (\\k.\\d.V))",
      "g W (\\d.\\v.p k)"
    );
  }

  @Test
  public final void test197() {
    reducesTo(
      "\\s.\\r.(\\u.\\w.\\s.\\n.(\\x.\\n.\\s.\\z.\\v.\\p.\\q.L i B) (s p ((\\w.R (\\e.F s (\\c.w))) U))) j (\\k.\\u.q (\\y.(\\v.U) (\\n.y) ((\\u.v) (\\i.Z))) ((\\f.(\\n.\\j.\\c.m) h) q) ((\\a.e) (\\p.p) ((\\v.u) c) (p (f b (h a))) (\\v.\\q.(\\d.\\x.\\i.e) (S c (I C) (\\s.T)))) (\\w.(\\a.(\\y.T) ((\\k.(\\z.b) L) H) v) U)) (\\u.Y z) ((\\f.\\p.(\\n.I) b) ((\\n.V) (\\q.\\z.f) R) (\\t.\\u.\\h.F (G (m (y (\\b.j)))) ((\\g.(\\e.v) (C b) (g (\\h.W)) (v u)) (p I) ((\\d.(\\k.(\\t.c) (t s)) h) (\\d.d) (\\s.(\\q.g (v i)) (\\a.(\\z.E) b) (\\u.(\\b.\\x.\\o.t) (\\b.z (\\r.g))))) (\\e.(\\w.\\p.\\d.(\\p.d) ((\\k.l p ((\\f.J) (a t))) f)) Y))))",
      "\\s.\\r.\\n.\\s.\\z.\\v.\\p.\\q.L i B"
    );
  }

  @Test
  public final void test198() {
    reducesTo(
      "\\b.(\\u.h) (N (\\n.\\h.g))",
      "\\b.h"
    );
  }

  @Test
  public final void test199() {
    reducesTo(
      "P ((\\l.(\\a.(\\c.\\y.\\l.w) (f i (p t)) J ((\\q.\\a.(\\l.j) s (\\c.a)) (\\s.(\\x.O) (e j) (Y (u p))))) (\\v.t)) (\\f.z (\\q.e (\\w.\\t.S)))) ((\\n.(\\c.T) (\\s.\\g.(\\h.j) (Z d) H)) v (\\b.J) ((\\q.\\f.B) (\\e.W) ((\\d.M) (\\t.T (e e w)) y)) (\\u.H)) ((\\o.\\z.z) (\\a.(\\k.(\\d.P K (q U)) (\\k.(\\g.q) (w p)) (q y (e S) (\\d.j)) ((\\c.z) (g g) b (\\j.(\\p.c) (\\d.L) f)) (\\p.\\d.\\i.\\c.\\l.e (\\r.\\s.\\p.d) (\\j.b) (C v (\\d.v) w (\\z.\\j.O)))) e ((\\v.o) y)))",
      "P (w) (T (\\b.J) (B) (\\u.H)) (\\z.z)"
    );
  }

  @Test
  public final void test200() {
    reducesTo(
      "H ((\\v.\\d.\\e.(\\v.Q ((\\y.\\o.(\\q.l h) (j m (l J))) k) f r) (u ((\\d.\\w.a (\\r.(\\y.\\z.\\m.\\p.(\\r.k) (\\m.N)) (\\y.I (b d) l))) (\\o.\\u.t ((\\u.I) i X D))))) x)",
      "H (\\d.\\e.Q (\\o.l h) f r)"
    );
  }

  @Test
  public final void test201() {
    reducesTo(
      "z (\\a.\\d.l) (\\w.b)",
      "z (\\a.\\d.l) (\\w.b)"
    );
  }

  @Test
  public final void test202() {
    reducesTo(
      "\\f.(\\i.(\\u.(\\k.j) (\\z.\\w.\\z.(\\t.(\\o.(\\r.(\\q.j) ((\\a.j) (\\v.x))) (b h (\\k.w) t)) (\\g.\\r.\\h.(\\s.(\\k.\\f.q) (\\y.x)) (g ((\\u.t) (Z u)))) ((\\x.g (I B) (\\e.\\i.\\d.m) (v (t u) (\\z.Y))) Y)) (\\h.(\\c.\\i.\\y.\\g.\\e.b) (\\u.\\o.Y) p))) ((\\s.i a) (\\x.(\\g.c) ((\\j.\\j.\\m.P i W G) ((\\s.y b (\\o.h)) (\\w.\\s.J m))) (\\a.l)) ((\\h.J) v ((\\c.\\f.f ((\\f.m) ((\\d.Y) (e u)))) (\\z.(\\x.S) s)) (\\u.d)))) (f (x (\\j.\\l.e)))",
      "\\f.j"
    );
  }

  @Test
  public final void test203() {
    reducesTo(
      "f (K (\\h.\\q.\\q.m))",
      "f (K (\\h.\\q.\\q.m))"
    );
  }

  @Test
  public final void test204() {
    reducesTo(
      "\\p.\\g.m",
      "\\p.\\g.m"
    );
  }

  @Test
  public final void test205() {
    reducesTo(
      "\\n.(\\f.m) ((\\m.\\r.(\\n.\\h.(\\o.\\g.a) ((\\c.(\\f.g) (n D)) (i h) T)) (\\f.(\\t.(\\x.g e (\\t.S)) t) I P) (\\i.W)) ((\\f.q) (\\x.w) s f)) V",
      "\\n.m V"
    );
  }

  @Test
  public final void test206() {
    reducesTo(
      "\\i.\\q.\\n.\\v.(\\f.\\w.\\a.C (e ((\\p.Q (\\j.j) (\\o.\\h.\\e.b) i) (p (I g (W h) b) ((\\j.h) Z (\\b.T)))))) ((\\t.k) ((\\t.a) (\\i.(\\v.(\\i.e Z (\\w.y)) (q (\\r.o))) i t)) (\\w.\\q.(\\g.\\q.(\\n.u) (\\f.\\r.\\d.\\c.\\a.r U (a M)) ((\\p.S) (y k) (P x (o d)) (\\h.(\\f.G S (j E)) (F (z n)))) (e (\\t.v))) ((\\e.\\j.\\u.T) (z Q (\\s.r) (\\o.n)) L d))) (\\g.d)",
      "\\i.\\q.\\n.\\v.\\a.C (e (Q (\\j.j) (\\o.\\h.\\e.b) i))"
    );
  }

  @Test
  public final void test207() {
    reducesTo(
      "d (\\a.w q)",
      "d (\\a.w q)"
    );
  }

  @Test
  public final void test208() {
    reducesTo(
      "\\t.p (\\h.\\h.\\x.E (\\y.f)) (\\y.\\v.z M)",
      "\\t.p (\\h.\\h.\\x.E (\\y.f)) (\\y.\\v.z M)"
    );
  }

  @Test
  public final void test209() {
    reducesTo(
      "(\\u.\\c.\\g.\\e.(\\u.(\\p.\\r.(\\h.\\m.\\r.(\\m.E) M) (\\a.c ((\\c.\\j.\\i.Z) (\\p.t (B x)))) (\\w.(\\w.h) ((\\h.g (\\n.B)) (\\j.E)))) ((\\z.\\n.(\\c.(\\q.j) (z C)) (\\m.e y (e h)) Y) Y z)) o (F (P (K I)))) k",
      "\\c.\\g.\\e.\\r.E"
    );
  }

  @Test
  public final void test210() {
    reducesTo(
      "\\d.(\\r.(\\z.(\\l.o) (\\q.d (\\b.n)) (\\u.h (\\y.h r (\\e.m) (L (\\t.S)) (\\q.B))) (\\f.\\d.A (b ((\\p.\\t.\\d.(\\k.\\f.k) ((\\l.o) (V e))) (\\a.\\i.r))))) P) ((\\h.h p ((\\v.\\z.f) ((\\f.d) (j s))) (\\f.\\q.(\\e.\\w.\\w.\\t.(\\p.B) (\\e.I)) (\\i.\\e.W ((\\d.m) (s B)))) ((\\t.(\\f.j) ((\\q.u) (\\e.q))) (k l) (\\x.(\\q.f) (\\s.g)))) (\\n.\\e.(\\o.\\q.\\k.\\r.(\\q.\\q.x) (f o v o)) x (\\k.\\u.\\r.(\\n.\\z.\\g.(\\z.\\j.e) (\\v.\\k.O) z) (g ((\\k.Y y) (\\w.g Z (\\h.m)))))) ((\\t.\\b.(\\z.\\m.\\i.\\c.Y (\\j.\\z.Z)) ((\\s.m) ((\\t.n h r) (p m (C Z)))) ((\\i.K) ((\\r.b) ((\\i.\\y.a p) ((\\f.h) (O q)))))) (k V ((\\c.\\h.e) (\\u.\\g.\\s.Z))))) ((\\b.L) (\\z.V a ((\\g.z S) (x (\\w.(\\o.l N (t k)) (\\d.(\\w.Z) (p i))) g))) ((\\z.p ((\\v.a (\\v.e)) z)) o ((\\v.d) j)))",
      "\\d.o (\\u1.h (\\y2.h (x) (\\e.m) (L (\\t.S)) (\\q.B))) (\\f3.\\d4.A (b (\\t.\\d.\\f.o))) (L (p (a (\\v.e)) (d)))"
    );
  }

  @Test
  public final void test211() {
    reducesTo(
      "\\h.(\\l.G) g",
      "\\h.G"
    );
  }

  @Test
  public final void test212() {
    reducesTo(
      "(\\t.\\j.(\\m.y) s) ((\\i.r k) w (\\j.(\\u.\\e.\\i.\\h.(\\v.(\\i.z) (Z a) v) (\\k.H H (\\q.T) ((\\w.q) (H a))) c) ((\\k.(\\i.(\\v.B) i) (\\r.\\d.\\x.h) ((\\h.\\i.P) (\\b.\\n.\\z.V))) (\\o.G))) (\\w.\\b.(\\y.(\\d.\\p.\\k.(\\i.(\\n.T (j q)) (\\y.\\o.H) (\\f.\\h.\\z.\\x.\\k.\\p.J)) ((\\e.S x (\\x.j) (\\z.\\q.y)) (u (v i) (K g)))) ((\\z.(\\g.\\o.\\o.j) (s l (\\f.y))) (\\o.x (\\q.h)) (\\k.(\\v.(\\f.B) (i a) r) q))) h)) (X (\\a.c))",
      "y"
    );
  }

  @Test
  public final void test213() {
    reducesTo(
      "(\\f.\\p.(\\y.\\w.\\w.\\d.(\\t.(\\v.a) ((\\g.\\i.s) (o c (j b) p (W (\\s.K))))) ((\\t.(\\z.t I (o D) (\\h.\\z.S m)) (d (\\e.y))) (e (C h (Y x) (\\q.d))) M)) (\\o.\\i.i ((\\q.\\u.H (\\f.(\\r.\\f.(\\f.R) (\\h.\\o.r)) (\\m.y))) ((\\t.v (E (\\a.(\\o.j) s))) (\\t.\\y.v)))) ((\\f.g) (N (\\d.\\n.k)))) ((\\w.\\f.u) (\\e.\\r.\\e.\\l.p ((\\z.(\\d.(\\i.\\r.l W) (y M u)) (\\d.z) ((\\j.\\x.\\h.b) (h D (J a) (\\q.\\e.\\b.a)))) P) (\\c.\\s.(\\o.(\\v.F (q (y h (o G)))) (\\q.\\g.\\v.f) b) (\\o.\\m.C))))",
      "\\p.\\w.\\d.a"
    );
  }

  @Test
  public final void test214() {
    reducesTo(
      "(\\r.\\m.(\\m.\\n.H) (T ((\\p.\\v.A l) (\\b.\\d.o s) (\\t.R ((\\k.W) r)) ((\\z.\\r.U E) ((\\y.S) (\\n.c)) (\\i.(\\y.\\y.i q) u))) (x (\\d.\\a.\\f.\\f.\\o.(\\a.R) (\\s.s)) ((\\u.g ((\\q.\\v.\\t.l) (\\g.x g))) (l p)))) ((\\y.\\q.Q) e)) (\\d.(\\s.Z) ((\\q.S) ((\\s.l l) G)))",
      "\\m.H"
    );
  }

  @Test
  public final void test215() {
    reducesTo(
      "(\\c.\\h.\\y.(\\g.\\m.(\\w.F) ((\\w.W) f) (P (\\s.\\w.h h))) B ((\\r.\\e.W) (\\a.\\k.\\f.B))) (\\v.\\q.(\\t.c) U) ((\\c.\\d.\\d.\\c.\\y.Q) (\\c.n)) m (\\l.(\\l.(\\g.O) (\\w.(\\k.\\e.\\f.(\\w.\\a.\\c.(\\u.F) ((\\l.\\y.u) (\\d.\\n.Y))) X) D)) (C (\\i.(\\n.\\a.\\f.\\y.x) v)) (\\s.(\\n.P (\\w.E)) (y (A (\\k.n (\\g.(\\k.N) (\\o.h))))) (\\k.\\e.b ((\\e.q) (P M)) (\\b.(\\f.\\y.\\w.Z) ((\\u.(\\h.b) (s x)) (x (\\y.L)) Z))) ((\\r.\\z.\\n.x y d) (\\k.(\\z.(\\j.\\c.(\\p.P) (\\w.f o)) (o (N u) (\\v.z (\\u.K))) m) p))))",
      "F (P (\\s.\\w.\\d.\\c.\\y.Q)) (\\l.O (\\s.P (\\w.E) (\\k.\\e.b (q) (\\b.\\y.\\w.Z)) (\\z.\\n.x y d)))"
    );
  }

  @Test
  public final void test216() {
    reducesTo(
      "(\\n.\\a.D) (R ((\\g.(\\r.\\t.t ((\\n.A) (\\c.h)) (\\o.\\z.\\l.k (g I) z) (\\i.(\\n.l t (\\j.c) J) (\\l.\\l.y))) (\\m.\\c.r)) (l (\\r.i))) ((\\o.\\l.\\i.g) (\\t.s) (\\c.\\d.(\\d.n (\\h.H) g) (S (\\p.f d S)) ((\\j.N (\\k.l)) M (\\q.(\\r.r (\\x.o)) (v (i a)))) ((\\e.E) (\\v.b)) (L d))))",
      "\\a.D"
    );
  }

  @Test
  public final void test217() {
    reducesTo(
      "\\c.(\\l.\\k.(\\n.H) (\\g.\\n.c U)) b",
      "\\c.\\k.H"
    );
  }

  @Test
  public final void test218() {
    reducesTo(
      "\\k.n (\\m.(\\w.s) ((\\j.(\\y.\\t.\\z.q V (\\h.z) ((\\y.w) (\\q.a)) (y d)) s) i)) (\\h.(\\f.\\b.r) (\\m.(\\b.(\\q.\\h.c) (\\n.\\u.\\k.v) (x n (U J) z) (\\w.\\j.\\t.\\z.(\\k.u) T F ((\\m.f v) (d A (\\h.k))))) (\\d.I) b)) ((\\o.D) (\\j.z))",
      "\\k.n (\\m.s) (\\h.\\b.r) (D)"
    );
  }

  @Test
  public final void test219() {
    reducesTo(
      "\\f.T",
      "\\f.T"
    );
  }

  @Test
  public final void test220() {
    reducesTo(
      "(\\d.\\r.Q) ((\\x.o) (\\a.\\n.(\\t.(\\r.\\t.(\\i.\\n.(\\e.\\n.(\\m.L w) (\\z.h n)) (\\b.h (T I) (\\f.\\w.m)) (\\k.(\\l.b) (\\z.z D))) j) (\\k.\\q.G)) (E (\\v.c))))",
      "\\r.Q"
    );
  }

  @Test
  public final void test221() {
    reducesTo(
      "z (\\l.(\\n.\\g.\\d.(\\p.(\\m.\\s.t) (\\v.m)) (\\c.(\\q.L a (H J) (t (\\g.Y))) (n (\\g.(\\s.f) (m s))) (\\i.k (\\d.b (\\r.\\q.r))) (\\p.\\g.d ((\\b.e (\\g.l)) (l e (k t))) ((\\b.z) (\\q.v) (\\g.w B (s P)) ((\\n.\\i.\\s.a) (\\k.\\n.\\r.M)))))) ((\\w.A) H K)) (\\y.\\o.\\b.p (\\o.h) g (\\i.\\j.(\\w.W (X (\\a.A (\\h.\\j.W (H G (m e))))) (\\i.w)) ((\\r.(\\q.T) (\\o.A)) (\\g.e (\\w.(\\l.d) d (\\s.d) (\\e.\\o.r)) (\\y.\\l.g (r (\\z.V)))))))",
      "z (\\l.\\g.\\d.\\s.t) (\\y.\\o.\\b.p (\\o.h) g (\\i.\\j.W (X (\\a.A (\\h.\\j.W (H G (m e))))) (\\i.T)))"
    );
  }

  @Test
  public final void test222() {
    reducesTo(
      "(\\l.w) (\\b.\\g.x)",
      "w"
    );
  }

  @Test
  public final void test223() {
    reducesTo(
      "(\\o.X) (\\n.q (\\b.(\\y.\\a.\\f.(\\f.(\\y.u) (\\p.\\y.f (n r) (\\y.a) ((\\p.\\y.o r) (a U (b M))))) (J S ((\\y.c l g) (\\w.\\z.v)) (\\b.\\w.\\j.Z E l R J))) (\\w.(\\k.x) O) (\\i.\\m.x h (\\v.\\a.\\p.(\\a.(\\e.T) ((\\a.\\q.E (\\d.A) D) (\\i.G (\\o.j U (\\y.s))))) U))))",
      "X"
    );
  }

  @Test
  public final void test224() {
    reducesTo(
      "\\e.\\e.d",
      "\\e.\\e.d"
    );
  }

  @Test
  public final void test225() {
    reducesTo(
      "\\p.\\w.\\f.z (\\z.Q)",
      "\\p.\\w.\\f.z (\\z.Q)"
    );
  }

  @Test
  public final void test226() {
    reducesTo(
      "(\\n.\\n.Z) (\\f.(\\h.z) ((\\f.d ((\\c.o) (\\h.g)) (\\o.\\x.(\\o.M U (\\u.F) (\\j.x)) (\\t.\\w.Z A) m)) ((\\v.h t (K D)) e i ((\\i.X m (\\h.n) ((\\o.A) (\\z.a))) (\\p.(\\n.u (y l)) (\\x.\\i.m))) ((\\w.y) ((\\y.W C) (B i)) (A (\\l.\\c.\\m.a))))) (\\b.\\t.(\\z.(\\q.n) ((\\d.(\\y.\\l.k) (\\q.\\o.\\i.Y)) (c (\\v.R (\\l.c))))) J))",
      "\\n.Z"
    );
  }

  @Test
  public final void test227() {
    reducesTo(
      "\\d.\\u.(\\y.\\w.(\\b.(\\f.\\d.E x) ((\\t.c (\\v.Q)) (\\e.o))) (\\p.\\j.(\\h.(\\g.\\o.\\e.I) ((\\o.i) ((\\i.E) (K o)))) ((\\e.v) ((\\m.x) (\\o.z)) I))) o ((\\v.(\\p.\\q.(\\a.\\g.j) (\\n.\\h.K)) ((\\w.y) ((\\f.t) (j f))) (\\a.\\n.\\h.M) (g ((\\t.m E (L T)) (f (\\m.S)) (\\o.n (\\o.k) f)))) (F ((\\m.i) N p (\\q.(\\r.\\q.(\\l.Z) (\\u.Q)) (\\k.x (g u p)))))) (\\x.p) (\\n.\\j.a (\\k.\\u.\\g.\\b.\\n.(\\k.E L (c e) (\\n.(\\i.l) (s x)) z W ((\\n.w (w l) (\\q.F w (\\q.l)) E) (\\v.\\m.\\h.i)) (t (A (\\u.v x)))) l))",
      "\\d.\\u.E x (\\n.\\j.a (\\k.\\u.\\g.\\b.\\n.E L (c e) (\\n.l) z W (w (w l) (\\q.F w (\\q.l)) E) (t (A (\\u.v x)))))"
    );
  }

  @Test
  public final void test228() {
    reducesTo(
      "\\r.(\\k.z) (\\g.(\\v.(\\l.\\x.O) (\\k.j T T)) (P (\\s.\\t.\\i.q))) (\\h.O) ((\\y.\\t.(\\g.\\t.s b) ((\\a.l) ((\\s.\\x.\\y.c) (\\q.g)))) (\\g.X)) (x (\\o.v)) (n ((\\s.\\e.v) W ((\\m.\\b.\\g.\\d.\\o.(\\d.(\\f.\\e.E) ((\\u.S) m)) (N (\\l.\\g.W))) ((\\f.\\d.\\z.s) (V x (\\v.z)) (r (g (C z))))) (u z (\\r.G ((\\v.g) (m x) v)) j))) q",
      "\\r.z (\\h.O) (\\t.\\t.s b) (x (\\o.v)) (n (v (u z (\\r.G (g v)) j))) q"
    );
  }

  @Test
  public final void test229() {
    reducesTo(
      "(\\a.K T) (\\c.\\r.v)",
      "K T"
    );
  }

  @Test
  public final void test230() {
    reducesTo(
      "w m ((\\v.\\h.\\q.\\i.f) ((\\y.\\o.g) (\\b.(\\k.(\\h.\\c.\\l.\\v.(\\f.\\j.I t) b ((\\r.r (\\m.o)) (\\i.\\a.R g (n E) (\\q.\\p.g)))) ((\\a.u) (\\h.\\r.\\i.n) p ((\\w.(\\c.o (W d)) (G (V t))) (x m)))) (\\r.\\r.(\\r.\\i.\\x.u ((\\a.g) (\\x.\\s.z)) (U ((\\i.r A (G I)) (o l)))) (\\o.\\j.\\e.r)))))",
      "w m (\\h.\\q.\\i.f)"
    );
  }

  @Test
  public final void test231() {
    reducesTo(
      "(\\r.g) (\\z.\\a.(\\i.(\\p.\\s.S) (z x) (\\d.(\\b.(\\n.\\d.w) (\\b.q m y) ((\\h.\\w.\\z.O) r)) ((\\u.(\\o.L) (\\j.\\c.\\q.y)) (m (\\n.A) (W y (e v))))) ((\\j.\\b.\\o.\\w.h) G)) (x ((\\q.\\c.o) ((\\b.(\\h.c) (S s) (v z)) (\\m.F) ((\\x.p P m) (\\a.A I (\\s.B)) ((\\q.O (\\q.c)) (v o H))))))) (\\d.\\b.n)",
      "g (\\d.\\b.n)"
    );
  }

  @Test
  public final void test232() {
    reducesTo(
      "\\e.\\g.\\c.u (\\k.\\l.\\b.(\\c.x) (\\f.\\d.n (\\d.(\\m.F (\\g.c)) (\\u.m) (\\f.\\z.l)) ((\\k.\\m.\\e.\\h.\\m.\\d.\\x.(\\l.(\\e.b) (I y)) (\\f.\\z.l)) q)) ((\\b.\\d.\\h.(\\j.\\g.\\w.\\t.n) S) (\\i.Y h o) u)) c",
      "\\e.\\g.\\c.u (\\k.\\l.\\b.x (\\h.\\g.\\w.\\t.n)) c"
    );
  }

  @Test
  public final void test233() {
    reducesTo(
      "U (\\f.j)",
      "U (\\f.j)"
    );
  }

  @Test
  public final void test234() {
    reducesTo(
      "\\k.\\v.(\\h.d) k ((\\k.d) (n (\\x.(\\p.\\b.m g) ((\\h.T) (z I)) (\\l.i (v k)) (\\t.(\\h.z) n)) (\\o.\\l.\\m.(\\t.(\\c.(\\m.\\w.n H) W) ((\\d.k) (A i) (i F (\\o.z))) Q) (b (\\a.h))) ((\\v.g) (\\c.I))))",
      "\\k.\\v.d (d)"
    );
  }

  @Test
  public final void test235() {
    reducesTo(
      "(\\c.(\\p.(\\o.b (\\t.\\x.\\c.(\\g.\\n.A) ((\\n.V) (E o))) ((\\j.\\k.\\t.(\\k.z D) Y) T)) (\\u.w)) ((\\e.A) (a (\\o.c) (a H x)) (z (\\u.\\z.\\w.B)) (y k)) (\\f.\\e.\\z.\\e.\\g.(\\h.\\z.e) ((\\f.(\\f.\\x.\\e.X) a) (M Z ((\\f.o) (u r)) ((\\u.X o (v o)) (Z n (\\f.n))) (\\d.\\a.(\\i.\\k.b) ((\\b.f) (\\h.F))))))) (k Z) (\\r.s)",
      "b (\\t.\\x.\\c.\\n.A) (\\k.\\t.z D) (\\f.\\e.\\z.\\e.\\g.\\z.e) (\\r.s)"
    );
  }

  @Test
  public final void test236() {
    reducesTo(
      "(\\s.p ((\\t.\\w.x (g t) (\\p.R) (\\k.(\\c.p) (\\d.I) (N g b))) ((\\c.i) (g c (i Y) (\\f.\\g.\\h.L))) h c (\\p.b (\\t.m (\\r.\\b.\\g.\\l.\\u.r r (\\v.F) (p d (\\b.r)) a (\\u.f u)))))) (v ((\\e.\\t.T (G (p (\\o.e S (\\c.H))))) (\\e.Q) ((\\r.q d ((\\j.g) (n c)) (G ((\\p.Y) (F c)))) (\\n.\\w.\\w.(\\m.(\\y.I) (\\t.q) (N L (b k))) R) n) (\\b.\\p.\\h.(\\o.A N (t h)) s (\\a.y w) ((\\q.\\d.U) ((\\j.\\s.X u) M)) N t)))",
      "p (x (g (i)) (\\p.R) (\\k.p (N g b)) c (\\p.b (\\t.m (\\r.\\b.\\g.\\l.\\u.r r (\\v.F) (p d (\\b.r)) a (\\u.f u)))))"
    );
  }

  @Test
  public final void test237() {
    reducesTo(
      "N (\\c.\\e.(\\b.o) (\\p.b (d n) (\\a.\\e.n) t) l f ((\\w.y (\\z.(\\g.U) ((\\k.(\\h.f) ((\\l.t) u)) (B c)))) u)) (\\d.q ((\\t.h (k (\\q.T)) (\\e.\\k.(\\d.h ((\\e.(\\p.b) R) ((\\d.v) (\\t.h)))) ((\\o.\\e.J d) (\\e.b) m) ((\\o.a y (f h) (k (l V))) (\\a.j) (\\j.g (n i) (r (\\t.d N (u p))))))) (A (\\i.\\e.x) ((\\y.\\c.\\o.k) (\\s.\\a.V)) (I ((\\o.u b) (M (\\e.u l (\\b.n))) Y)))))",
      "N (\\c.\\e.o l f (y (\\z.U))) (\\d.q (h (k (\\q.T)) (\\e.\\k.h (b) (a y (f h) (k (l V)) (\\j.g (n i) (r (\\t.d N (u p))))))))"
    );
  }

  @Test
  public final void test238() {
    reducesTo(
      "(\\r.\\c.(\\g.\\b.(\\i.\\w.L (\\b.\\e.S ((\\c.B) A))) ((\\d.(\\s.(\\m.a) (H i)) c) (u (\\k.\\f.\\b.i))) (j J)) ((\\i.w) a) i) (\\r.(\\c.\\e.\\x.(\\t.\\p.(\\p.\\r.R (\\k.(\\i.m) w (\\t.m e))) (Z (\\z.t) H (\\t.\\u.\\y.r C (i F) (\\y.\\k.f)))) (\\j.(\\u.c) ((\\i.\\x.\\p.(\\r.p D) (m F)) k)) (P (\\m.(\\x.H) (\\v.\\v.(\\k.y) o n (\\e.(\\i.e) a))))) ((\\h.\\e.F) (\\u.\\n.t ((\\o.\\p.v f) (\\u.(\\r.B) (\\l.s)) (\\u.\\i.O (\\x.m x)))) c)) U",
      "L (\\b.\\e.S (B))"
    );
  }

  @Test
  public final void test239() {
    reducesTo(
      "j (G (\\z.\\t.T (\\h.\\i.j))) (\\y.\\i.\\q.(\\n.\\g.\\w.\\t.\\q.\\n.(\\q.d) ((\\m.(\\p.\\u.(\\l.\\k.(\\p.x r) (\\b.\\i.y)) (\\a.\\s.k)) ((\\a.\\t.(\\p.I) ((\\p.h) (\\w.o))) (\\e.\\x.(\\g.N i) (l d (T l))))) R ((\\i.J) s))) (\\i.\\a.v))",
      "j (G (\\z.\\t.T (\\h.\\i.j))) (\\y.\\i.\\q.\\g.\\w.\\t.\\q.\\n.d)"
    );
  }

  @Test
  public final void test240() {
    reducesTo(
      "\\x.(\\y.\\m.(\\p.\\v.N) (\\n.\\n.\\h.(\\t.o (\\w.\\d.(\\f.h) s ((\\i.S) (s b))) (\\l.(\\l.\\z.\\n.t) b i)) (n (\\i.G))) (t ((\\p.\\i.p ((\\v.W) (\\k.p))) (\\d.\\s.d) ((\\g.(\\o.U) (\\a.w)) (\\q.g s (\\x.d)) L)) (R (\\l.(\\x.\\q.\\r.Y) (\\n.(\\v.\\k.X) q) (\\e.(\\a.\\c.\\m.\\f.s) ((\\b.B) (\\q.w) (w b (\\s.t)))))))) (\\m.(\\a.\\i.(\\t.(\\p.i) (\\x.\\n.i t x ((\\e.n) (\\x.b)) (\\b.(\\b.\\x.q) (\\p.\\a.M)))) (c (\\q.\\f.\\e.(\\a.X) (\\j.\\x.\\c.(\\m.P) (\\b.b)))) (J O ((\\e.(\\s.q (\\x.y)) (r (c r)) (p j (a P) (\\q.V J (P y)))) (I c i S ((\\z.j X) T))))) (\\c.(\\o.\\x.(\\m.Y) (\\h.(\\c.t) (K n) (r l U))) (\\m.\\j.t) (c y v j ((\\p.\\s.\\b.V) (\\k.c)) (n (\\f.B) (d b (H c) q))) (\\a.G))) (\\n.V (k (\\v.N)) (\\x.(\\g.\\j.\\t.\\f.(\\i.l) n ((\\u.(\\v.Y) f) ((\\c.\\p.l a (z G) (\\t.b Y)) (\\c.y) ((\\d.\\s.\\w.g) ((\\z.B) (\\k.B)) N)))) ((\\p.(\\q.\\v.(\\l.\\k.t K) (\\r.\\f.b)) (\\q.\\z.(\\r.(\\p.u) (\\b.s)) (\\j.\\w.v S) (p N (\\j.C) (\\u.\\v.\\b.k))) x) (\\a.(\\m.j) (\\w.V k F) ((\\d.\\o.\\e.(\\d.\\h.Y) ((\\x.V) (m f)) (\\f.(\\t.m q) (h t))) (\\x.(\\i.m) n))))))",
      "\\x.N"
    );
  }

  @Test
  public final void test241() {
    reducesTo(
      "\\h.\\t.P",
      "\\h.\\t.P"
    );
  }

  @Test
  public final void test242() {
    reducesTo(
      "(\\b.\\t.\\r.(\\y.\\z.(\\y.u) r) (f ((\\u.H E (L Y)) (S t (A j)) (\\x.\\w.a S w (\\p.n n)) (\\n.\\p.\\i.a A) w)) (\\k.X (\\q.(\\i.(\\b.\\l.o K) (\\m.t g S)) (h ((\\a.Y) c)) (\\p.(\\t.\\o.(\\o.s e) (q (i r))) (f ((\\l.z) (\\i.n))))) (\\l.(\\v.(\\l.\\w.P) r ((\\x.\\s.s F) (\\g.x r l))) (h (e y) (s (z r (y g)))) (r (\\z.J))) ((\\v.\\z.w) k (r (\\m.g)) ((\\q.z) (\\c.G (z o) (U (z n)))) (\\g.\\t.\\j.\\u.b) r))) (\\q.T)",
      "\\t.\\r.u"
    );
  }

  @Test
  public final void test243() {
    reducesTo(
      "(\\q.s) ((\\y.p (\\q.\\r.m (\\m.(\\g.(\\t.Y) (f j) (\\t.(\\o.k) (\\i.a))) (o j) g) ((\\s.\\p.n (\\s.\\k.\\d.\\c.\\i.\\j.h C) (\\c.D)) ((\\v.\\c.(\\n.l u) (\\o.(\\q.N) ((\\t.X) (o k)))) n)))) i)",
      "s"
    );
  }

  @Test
  public final void test244() {
    reducesTo(
      "\\g.(\\k.\\j.(\\g.\\s.\\w.\\t.\\q.\\r.\\j.M) (b B w (\\z.\\j.c) (\\t.U b (\\y.c) i) (\\l.w ((\\y.o) q (\\f.W)))) e (\\v.\\o.\\g.l)) (\\t.\\j.\\x.x) (\\b.\\o.a (\\z.\\q.\\v.F))",
      "\\g.\\t.\\q.\\r.\\j.M"
    );
  }

  @Test
  public final void test245() {
    reducesTo(
      "\\l.\\b.\\n.h",
      "\\l.\\b.\\n.h"
    );
  }

  @Test
  public final void test246() {
    reducesTo(
      "\\x.\\m.X",
      "\\x.\\m.X"
    );
  }

  @Test
  public final void test247() {
    reducesTo(
      "Q ((\\r.\\o.(\\i.\\b.\\c.\\v.\\a.(\\l.\\h.\\v.s) e) ((\\r.t (b (\\l.x))) (n (\\e.\\d.\\q.a)))) f ((\\l.\\i.(\\w.c) Z ((\\g.w) (W ((\\f.W) (q I (\\o.t)))))) ((\\m.y) (\\a.u (\\x.l)) (\\g.(\\i.(\\d.n i (i a) (\\j.\\j.c)) (I x)) (b (\\p.g z (q L)) (\\y.(\\n.l) (\\u.k) (\\e.\\j.\\e.p))))))) U",
      "Q (\\b.\\c.\\v.\\a.\\h.\\v.s) U"
    );
  }

  @Test
  public final void test248() {
    reducesTo(
      "(\\c.(\\o.\\t.\\z.w ((\\w.(\\g.\\c.(\\d.g J) ((\\j.n) (u I))) ((\\i.(\\a.Y) (\\w.E)) (\\g.(\\k.a) (j B))) (\\x.\\c.\\e.\\a.(\\u.U) ((\\l.x) (E l)) r)) (b (\\o.(\\f.\\b.(\\d.l x) (R (i E))) Y)))) (\\r.O)) (\\u.(\\q.(\\c.O) (V k) (\\w.y (J G))) (\\w.n) Z z (\\k.C) ((\\d.H (v w (\\t.v) (\\n.\\y.s N) (\\j.g))) ((\\y.(\\k.\\q.W) e) (\\q.(\\c.W) (d H) x) y) (\\y.\\z.(\\s.\\t.(\\v.(\\t.D ((\\o.e) (\\s.W))) ((\\k.P) p (\\b.X (k Q)))) ((\\v.(\\m.g (V h)) (\\z.\\l.g)) ((\\t.r) (i J) (e (o q))))) ((\\y.\\n.G) (\\w.C (\\c.S) (\\o.W)) (\\x.(\\m.(\\o.\\q.t) p) (\\v.\\a.\\r.\\p.\\x.a (\\v.w))))))) (\\q.\\k.(\\a.(\\u.\\o.\\y.\\u.(\\y.q) j Y) (g ((\\u.\\n.(\\x.\\w.n) W) (\\q.(\\i.\\t.h E) f) ((\\u.F) (w j) (\\k.(\\o.m) (v q)) (\\v.\\j.(\\m.j) E ((\\k.G) v)))) ((\\m.h v R) (X V (c j)) (\\e.a (e S) (s x y)) ((\\t.e r (\\p.f)) (h (k Q)) e) (\\w.\\o.m)))) L)",
      "\\z.w (Y J)"
    );
  }

  @Test
  public final void test249() {
    reducesTo(
      "(\\r.\\n.T) (\\c.(\\a.j N (\\g.z (\\v.i)) (\\j.X)) (\\e.n (\\i.\\g.\\k.(\\n.\\w.\\u.\\i.\\m.i) J ((\\p.\\v.E) (r h (o z) (F w (\\c.A)))))) ((\\u.(\\l.G (F (\\f.d ((\\o.x) (\\v.v))))) (\\h.\\h.(\\i.o) t)) o) (\\s.\\c.(\\e.\\k.t O (\\t.s) k ((\\r.w) ((\\d.d) (\\t.b))) q (\\w.m)) (\\p.\\k.\\l.J) ((\\w.h) ((\\o.B (\\q.l) (\\y.(\\p.U) (k s)) i (\\s.\\w.(\\j.o) P)) (\\q.\\d.O)))))",
      "\\n.T"
    );
  }

  @Test
  public final void test250() {
    reducesTo(
      "\\h.U",
      "\\h.U"
    );
  }

  @Test
  public final void test251() {
    reducesTo(
      "(\\m.c) B (\\r.(\\n.\\z.\\c.(\\w.o (\\q.\\z.\\d.\\h.\\q.\\c.j)) J n) (\\v.(\\g.\\b.\\w.\\e.\\v.c) ((\\s.\\k.(\\r.w) (\\d.\\d.K b ((\\s.I) (p f)))) (z (G n) (\\q.L d (\\o.l)) (\\m.x)))) ((\\d.(\\l.P (x k)) (\\w.\\w.w P)) (o n A U) (\\x.(\\y.\\t.\\d.\\x.(\\k.Z) (\\i.l)) (I b (\\a.v) (O t (\\x.j)))) (\\n.\\g.(\\e.\\a.(\\c.\\y.(\\m.\\k.l) D) (\\v.v x (e d) (g (h H)))) ((\\h.\\m.\\u.(\\y.t Q) s) ((\\t.r) (I n)))) (\\u.(\\r.\\w.(\\z.\\j.k) J) (\\x.\\c.t (\\v.d (a r) (\\t.v k)) J)))) ((\\i.g ((\\f.\\z.E) (r S (i h)) (l (\\u.L F (\\b.d))) (\\c.l (\\f.L) c) r (\\v.x))) j)",
      "c (\\r.\\c2.o (\\q.\\z.\\d.\\h.\\q.\\c.j) (\\v.\\b.\\w.\\e.\\v.c)) (g (E (\\c.l (\\f.L) c) r (\\v.x)))"
    );
  }

  @Test
  public final void test252() {
    reducesTo(
      "(\\e.\\t.i ((\\l.\\e.y) (\\b.\\b.L ((\\q.n) (u j) (l G (\\i.s)) (u f ((\\m.O) K)) r))) k) (\\i.\\l.\\u.P)",
      "\\t.i (\\e.y) k"
    );
  }

  @Test
  public final void test253() {
    reducesTo(
      "\\u.\\a.(\\j.s) ((\\z.i) B) (N (\\v.x (c (\\w.K)) (I u) (\\u.z (j u)))) (l v) ((\\s.\\g.(\\j.z) ((\\z.\\h.l) (o j (\\q.(\\u.R A (\\c.m)) (w m))))) ((\\m.\\j.(\\g.(\\w.J I) (r w g)) ((\\d.t) (\\x.f) (q c (\\i.o)))) (a (\\x.d)) Z) (\\n.Q)) z",
      "\\u.\\a.s (N (\\v.x (c (\\w.K)) (I u) (\\u.z (j u)))) (l v) (z) z"
    );
  }

  @Test
  public final void test254() {
    reducesTo(
      "\\e.\\d.(\\a.\\i.i) (\\f.\\i.X)",
      "\\e.\\d.\\i.i"
    );
  }

  @Test
  public final void test255() {
    reducesTo(
      "\\x.X",
      "\\x.X"
    );
  }

  @Test
  public final void test256() {
    reducesTo(
      "\\m.S (d (\\y.\\y.l)) (l l) (\\p.\\n.J)",
      "\\m.S (d (\\y.\\y.l)) (l l) (\\p.\\n.J)"
    );
  }

  @Test
  public final void test257() {
    reducesTo(
      "\\v.(\\x.k) ((\\r.\\c.k) ((\\i.\\c.U o) x ((\\e.(\\h.f) (F j)) (\\q.\\k.\\o.m)) (\\i.e) ((\\q.\\m.X) (l (\\s.l) ((\\i.P) f)) (\\l.\\k.(\\b.p) (\\l.B) (N g (\\e.d)) ((\\y.n) (D u) (\\s.d)))))) (N Y) (\\j.r)",
      "\\v.k (N Y) (\\j.r)"
    );
  }

  @Test
  public final void test258() {
    reducesTo(
      "\\x.\\o.N (\\o.Q)",
      "\\x.\\o.N (\\o.Q)"
    );
  }

  @Test
  public final void test259() {
    reducesTo(
      "\\u.Q ((\\k.H) F) (\\q.\\f.X) (\\a.\\y.E)",
      "\\u.Q (H) (\\q.\\f.X) (\\a.\\y.E)"
    );
  }

  @Test
  public final void test260() {
    reducesTo(
      "\\s.e (\\z.d) (\\l.(\\i.\\a.s) (a w (w Y)) (\\i.\\h.C z k (\\u.S M)) v (\\t.\\g.\\q.\\j.(\\x.\\b.o t (\\c.q) (o L (C b))) d (C B))) ((\\r.F) (\\j.h)) b (\\y.(\\s.\\q.o) (\\u.K) (b (\\d.\\b.r (\\j.\\g.\\u.h))))",
      "\\s.e (\\z.d) (\\l.s v (\\t.\\g.\\q.\\j.o t (\\c.q) (o L (C (C B))))) (F) b (\\y.o)"
    );
  }

  @Test
  public final void test261() {
    reducesTo(
      "(\\s.(\\l.\\d.\\m.d) z ((\\z.\\t.\\q.e) ((\\v.b) (\\o.(\\f.n g Y) ((\\b.D) (\\n.e))) (\\w.(\\g.\\h.\\x.m B) ((\\h.\\b.\\p.C) (\\i.z))))) m) ((\\t.K) ((\\b.(\\k.\\j.j E) (\\n.F (t X D ((\\k.C) w)))) (\\d.\\q.\\s.G) (\\h.h))) (h x (\\u.(\\k.e) R))",
      "\\q.e"
    );
  }

  @Test
  public final void test262() {
    reducesTo(
      "\\y.S ((\\h.(\\g.(\\c.i) (\\g.K)) (j (L T)) (\\n.\\w.j c (s v) (S (h a))) ((\\t.d) (k g) (r (c g)) ((\\z.c) (\\c.X) p))) (y (\\t.a))) (i ((\\d.y j) (\\s.V g (\\f.\\c.\\o.\\h.b)))) x ((\\d.o) ((\\c.\\o.\\s.\\s.\\w.i (V ((\\z.j) (j u) (\\a.(\\f.S) (i m))))) ((\\v.\\l.\\a.\\a.j X (\\c.n)) (z (\\f.y) k) (d ((\\k.y) (\\t.Z) (K (\\a.n))))) (\\w.g) (p (\\e.q) (\\o.\\s.(\\a.\\h.(\\l.\\n.(\\z.g) D) (\\x.E (\\z.O) r)) (\\u.\\v.j)))))",
      "\\y.S (i (\\n.\\w.j c (s v) (S (y (\\t.a) a))) (d (r (c g)) (c p))) (i (y j)) x (o)"
    );
  }

  @Test
  public final void test263() {
    reducesTo(
      "D (\\s.e ((\\v.(\\l.\\l.\\h.(\\k.(\\z.\\a.\\h.(\\m.A) (r u) (Y h (\\r.k))) (v u (\\l.c) ((\\l.A) (G s))) ((\\a.V) (\\s.R) (\\d.g) b)) J) (\\g.\\z.(\\e.\\g.\\g.y (j (j (g e (L i))))) (\\p.H))) (g ((\\s.(\\y.m ((\\p.F) (o f) ((\\a.J) (\\q.p)))) t) (\\q.\\e.\\b.d)))))",
      "D (\\s.e (\\l.\\h.\\h.A (Y h (\\r.J))))"
    );
  }

  @Test
  public final void test264() {
    reducesTo(
      "\\t.(\\z.(\\h.F) l ((\\s.Y) (\\t.r)) (X F) g (\\c.Q) (i (w e ((\\k.L (\\d.i n)) b))) (\\x.\\h.F) j) (\\g.\\o.\\x.o (\\q.J))",
      "\\t.F (Y) (X F) g (\\c.Q) (i (w e (L (\\d.i n)))) (\\x.\\h.F) j"
    );
  }

  @Test
  public final void test265() {
    reducesTo(
      "\\b.g",
      "\\b.g"
    );
  }

  @Test
  public final void test266() {
    reducesTo(
      "(\\q.b) ((\\k.(\\r.(\\c.\\q.R) (y W (\\d.t))) (\\z.(\\q.w V (\\c.d)) ((\\p.h) (n o)))) (y ((\\h.o) (\\g.z)) (\\p.\\l.\\w.\\x.\\o.\\a.o))) (\\g.(\\j.f (s s) c d ((\\j.(\\x.\\s.l) (\\j.\\y.l l)) (P (e u (b n))))) D) w ((\\n.\\e.A) (\\f.h)) (\\n.R)",
      "b (\\g.f (s s) c d (\\s.l)) w (\\e.A) (\\n.R)"
    );
  }

  @Test
  public final void test267() {
    reducesTo(
      "\\k.(\\o.\\m.k) (\\w.(\\y.g ((\\e.d c (J s) (a F (w J)) (\\d.\\h.c (q F) h)) q l)) (f (\\m.\\u.\\g.V)) ((\\w.q) ((\\x.q) z)))",
      "\\k.\\m.k"
    );
  }

  @Test
  public final void test268() {
    reducesTo(
      "(\\q.p) (\\w.(\\l.(\\d.Y (\\m.(\\t.r) (X l) ((\\e.\\h.\\t.\\h.F) (\\j.\\e.\\n.q (\\b.V u)) (k (\\o.u) (\\j.f) (\\y.\\z.\\e.i (\\y.V) (\\z.\\g.C)))))) ((\\m.\\n.b) R ((\\i.\\j.e P (\\t.B) I (\\g.\\c.(\\i.\\p.B) (o g (N h))) (\\k.g (O p F (\\l.U)))) u))) (p (\\m.\\l.\\l.o)))",
      "p"
    );
  }

  @Test
  public final void test269() {
    reducesTo(
      "\\g.x",
      "\\g.x"
    );
  }

  @Test
  public final void test270() {
    reducesTo(
      "\\e.\\p.O ((\\z.\\f.\\o.\\k.(\\l.(\\i.(\\p.(\\h.e) (\\p.t)) (\\j.C)) m) s) L)",
      "\\e.\\p.O (\\f.\\o.\\k.e)"
    );
  }

  @Test
  public final void test271() {
    reducesTo(
      "\\u.v",
      "\\u.v"
    );
  }

  @Test
  public final void test272() {
    reducesTo(
      "a (\\o.\\a.m (w H (\\s.(\\a.\\a.\\u.x) g)))",
      "a (\\o.\\a.m (w H (\\s.\\a.\\u.x)))"
    );
  }

  @Test
  public final void test273() {
    reducesTo(
      "W (\\e.(\\w.(\\e.m) (\\s.q (\\p.(\\x.(\\k.N) r) p) ((\\g.o h) (f m)))) (V i) ((\\d.\\e.\\i.\\o.F) (\\g.y) (\\x.J)))",
      "W (\\e.m (\\i.\\o.F))"
    );
  }

  @Test
  public final void test274() {
    reducesTo(
      "\\m.\\n.(\\y.\\k.A) (\\k.g) (\\n.\\p.\\o.\\x.\\l.\\e.(\\i.\\g.i) (\\i.K)) (\\l.(\\t.x (\\f.(\\p.j V) (\\l.(\\a.j) ((\\q.T) (\\h.\\t.p G)))) (\\b.(\\z.h) P) (\\g.(\\c.\\l.\\y.p (\\j.D)) (\\q.\\n.\\w.\\y.\\j.(\\e.e) (\\g.\\i.(\\j.\\q.(\\p.w) (\\q.U) e) ((\\x.Q f (\\f.k)) (\\y.q G (x A)))) y))) (J ((\\n.j G) (\\k.\\z.g) ((\\q.x) ((\\d.(\\l.(\\h.\\o.\\k.Y) (c p (f o))) (Y (m w) i)) (\\j.(\\v.\\u.\\l.\\w.(\\g.w) (\\o.K)) b))))))",
      "\\m.\\n.A (\\l.x (\\f.j V) (\\b.h) (\\g.\\l.\\y.p (\\j.D)))"
    );
  }

  @Test
  public final void test275() {
    reducesTo(
      "(\\r.n) (\\k.(\\x.X (\\q.u) (H k)) (\\v.\\i.r) (\\o.\\q.\\h.T ((\\l.i) (P (\\r.z))) (S (\\u.T ((\\n.h) (\\r.J))))) (\\f.b (\\r.n))) Q ((\\x.\\r.u) C)",
      "n Q (\\r.u)"
    );
  }

  @Test
  public final void test276() {
    reducesTo(
      "\\c.(\\a.L) (\\z.(\\a.\\y.\\z.\\m.\\x.(\\v.t (\\w.A)) l ((\\c.(\\p.\\r.\\l.x) ((\\y.j) p)) (z y (\\r.N) (\\b.v))) (\\y.\\b.z)) (\\r.(\\d.(\\a.(\\m.C ((\\u.q) (g m))) (f (z o (V i)))) (\\h.(\\o.K) (\\j.\\p.m))) (\\a.l (\\h.\\d.\\g.\\s.\\t.\\u.(\\t.P) (\\y.I) (\\r.M z) (\\u.k))))) p K",
      "\\c.L p K"
    );
  }

  @Test
  public final void test277() {
    reducesTo(
      "\\m.d (\\i.\\e.g)",
      "\\m.d (\\i.\\e.g)"
    );
  }

  @Test
  public final void test278() {
    reducesTo(
      "\\z.\\e.d",
      "\\z.\\e.d"
    );
  }

  @Test
  public final void test279() {
    reducesTo(
      "\\b.\\c.\\v.(\\i.w R) q",
      "\\b.\\c.\\v.w R"
    );
  }

  @Test
  public final void test280() {
    reducesTo(
      "\\n.\\g.w H",
      "\\n.\\g.w H"
    );
  }

  @Test
  public final void test281() {
    reducesTo(
      "l r (\\c.l) (w p ((\\p.(\\z.\\h.\\k.o (\\t.y x)) ((\\e.W) (\\i.f) (\\m.\\u.e S))) (L (\\y.z) (\\d.(\\d.e) v) ((\\k.(\\b.S) (\\t.q)) u)))) ((\\h.w) ((\\n.\\k.\\d.g t X ((\\d.z) (\\n.u)) (u e)) (\\j.\\f.\\f.\\i.s)) (\\v.m)) g u",
      "l r (\\c.l) (w p (\\h.\\k.o (\\t.y x))) (w (\\v.m)) g u"
    );
  }

  @Test
  public final void test282() {
    reducesTo(
      "(\\l.\\j.(\\z.\\e.(\\f.\\f.(\\j.h) m) (x R (\\l.O) (r (\\i.t)) (X K (q r) (x P (v j))) e)) Q (\\q.(\\r.(\\r.(\\j.(\\q.h) ((\\n.E) (\\l.k))) (\\l.\\s.\\c.\\x.\\q.\\z.W)) ((\\r.b) (\\d.l) g (\\v.F))) (d ((\\h.o N (D i) F) (i w))) (O (\\k.I) i (\\y.\\i.K) ((\\n.\\d.v) (\\n.j) (r (\\h.r) (E p (\\g.x)))) ((\\s.W) ((\\d.t) (\\f.U)))))) ((\\p.S h) (\\w.X)) (\\u.p)",
      "\\f.h"
    );
  }

  @Test
  public final void test283() {
    reducesTo(
      "b (\\b.(\\v.v) v B) (J ((\\q.J) (\\c.\\g.o)) (X (\\t.\\d.(\\b.(\\v.(\\q.\\a.o U) (g (p v))) ((\\x.y) p (\\y.H)) (g ((\\c.\\t.y X) (\\m.R))) ((\\b.\\u.\\l.p (\\o.(\\n.d) (\\u.p T))) (\\t.\\s.\\x.Q i l))) j)))",
      "b (\\b.v B) (J (J) (X (\\t.\\d.o U (\\u.\\l.p (\\o.d)))))"
    );
  }

  @Test
  public final void test284() {
    reducesTo(
      "q ((\\o.\\u.b) (\\a.P S))",
      "q (\\u.b)"
    );
  }

  @Test
  public final void test285() {
    reducesTo(
      "(\\l.\\r.\\h.u ((\\v.\\j.(\\y.\\m.\\m.q k (b a)) (\\c.(\\y.y) (\\x.s) q)) ((\\q.\\k.m (\\v.c) (d A (\\b.T))) (\\c.\\b.(\\c.f) ((\\w.l) q))) (t ((\\q.(\\k.u U (a C)) (l m (S v))) (e ((\\j.J) h)))) (k (\\o.(\\f.\\l.(\\i.\\j.\\l.\\c.\\x.A t) ((\\a.q) (\\z.V))) ((\\s.g (s u (\\k.h))) (\\u.(\\v.q q (\\g.l)) v)))) (o (\\l.(\\m.d (q (I c)) (X (\\d.a) a) e) F)))) s",
      "\\r.\\h.u (q k (b a))"
    );
  }

  @Test
  public final void test286() {
    reducesTo(
      "\\b.\\f.Y",
      "\\b.\\f.Y"
    );
  }

  @Test
  public final void test287() {
    reducesTo(
      "\\r.q",
      "\\r.q"
    );
  }

  @Test
  public final void test288() {
    reducesTo(
      "\\u.g",
      "\\u.g"
    );
  }

  @Test
  public final void test289() {
    reducesTo(
      "\\y.(\\m.(\\b.(\\e.\\j.\\b.N n x ((\\o.g) (\\b.w)) (P (\\l.G n (\\w.b)))) (\\k.G ((\\z.U R (i s)) (\\c.\\b.v G)))) (\\p.b (\\j.P) b (\\k.(\\i.b) ((\\i.q) (w x))) (q (\\m.(\\q.\\j.\\i.y) (\\z.\\b.P)))) w g) (\\w.(\\u.(\\q.i) ((\\i.H s) (\\j.(\\g.j) ((\\a.z) (\\x.k q (\\i.p) (O (\\r.w))))))) r) (\\q.\\n.p)",
      "\\y.N n x (g) (P (\\l.G n (\\w.g))) (\\q.\\n.p)"
    );
  }

  @Test
  public final void test290() {
    reducesTo(
      "\\j.(\\h.Q (\\o.r)) k",
      "\\j.Q (\\o.r)"
    );
  }

  @Test
  public final void test291() {
    reducesTo(
      "n (\\o.h)",
      "n (\\o.h)"
    );
  }

  @Test
  public final void test292() {
    reducesTo(
      "\\d.\\d.\\n.(\\h.(\\y.\\p.\\r.w r) z) (\\x.(\\d.\\g.t) (\\x.W))",
      "\\d.\\d.\\n.\\p.\\r.w r"
    );
  }

  @Test
  public final void test293() {
    reducesTo(
      "(\\n.n) (\\h.c ((\\k.n Y (\\m.a)) (\\p.\\x.\\f.f) (\\s.(\\i.h D (k H)) (h (s n))) (\\c.k) ((\\j.Y) ((\\o.\\e.c (\\u.\\y.S)) w)))) X ((\\n.j L ((\\r.E) ((\\l.k ((\\q.E) (\\k.r) (\\d.\\b.s v) (\\w.\\b.(\\u.\\c.r) (\\w.y)))) f))) (\\u.x X ((\\d.(\\f.r (\\e.E)) (c Z) K ((\\b.j) (\\q.\\w.(\\w.w) S))) (\\o.(\\g.(\\u.\\c.\\y.(\\c.s) I (\\o.K x)) x) (L (\\q.t) (\\v.p) ((\\b.\\n.y) (\\o.D L (C e)))) C))))",
      "c (n Y (\\m.a) (\\s.X D (k H)) (\\c.k) (Y)) (j L (E))"
    );
  }

  @Test
  public final void test294() {
    reducesTo(
      "\\v.\\h.\\g.(\\n.\\g.\\z.\\v.N) (\\n.\\c.A h)",
      "\\v.\\h.\\g.\\g.\\z.\\v.N"
    );
  }

  @Test
  public final void test295() {
    reducesTo(
      "(\\k.(\\h.(\\k.a v s) (P q (x l)) (x ((\\i.H) (N m))) (\\i.(\\l.H) (\\r.\\s.G))) (\\m.\\w.\\b.\\n.(\\x.o) (\\g.(\\n.\\t.\\d.x) (\\s.\\h.j) (\\t.l))) m (\\g.p ((\\g.B (\\z.g (q R (x n))) e) (\\r.i ((\\d.v) ((\\m.r) (\\u.g)))))) (\\c.M)) d",
      "a v s (x (H)) (\\i.H) m (\\g.p (B (\\z.i (v)) e)) (\\c.M)"
    );
  }

  @Test
  public final void test296() {
    reducesTo(
      "r ((\\j.\\n.(\\l.\\f.\\c.j n (\\z.y) ((\\y.W) (m e))) (\\t.(\\h.N) (j J (a k))) (\\r.\\l.(\\n.o r (\\r.j) ((\\r.e) (\\s.f))) (\\n.\\a.h)) (\\n.d) (\\v.u)) (u s ((\\z.w (a (r (\\r.\\n.e D)))) E))) X",
      "r (\\n.u s (w (a (r (\\r.\\n.e D)))) n (\\z.y) (W) (\\v.u)) X"
    );
  }

  @Test
  public final void test297() {
    reducesTo(
      "(\\y.\\g.\\t.\\e.r) v ((\\v.\\v.z) ((\\v.(\\t.y) ((\\x.\\p.W D) ((\\v.\\j.(\\w.a) c (\\x.o (y o)) (\\i.\\h.j)) e))) (\\n.i)))",
      "\\t.\\e.r"
    );
  }

  @Test
  public final void test298() {
    reducesTo(
      "\\d.\\q.\\s.\\e.(\\w.\\r.t) (C (\\q.b) c) (\\m.L) ((\\m.\\z.(\\q.(\\b.K) (\\b.(\\q.v (\\s.R)) (\\i.C)) (\\g.V (e (\\l.x)) U)) (\\w.(\\k.\\p.\\d.t ((\\q.k) ((\\q.e) (\\x.\\b.d)))) ((\\w.(\\r.\\b.\\g.\\y.L) (\\w.\\o.x)) (O (\\w.\\z.\\d.(\\w.h) ((\\o.s) (\\x.w))))))) ((\\p.E (\\v.(\\o.(\\k.O R (\\y.F) (\\d.j y)) (\\q.\\e.\\v.u)) o)) T)) (\\b.(\\d.\\p.(\\q.g) ((\\w.Z) D) b (\\r.u)) (\\b.(\\d.\\e.\\d.\\x.\\t.\\e.p) (p a S M ((\\s.\\m.k c) ((\\v.I) (z m))) (V ((\\n.j) (\\e.a (\\i.s)))) d) x))",
      "\\d.\\q.\\s.\\e.t (\\z.K (\\g.V (e (\\l.x)) U)) (\\b.\\p.g b (\\r.u))"
    );
  }

  @Test
  public final void test299() {
    reducesTo(
      "\\f.\\b.P",
      "\\f.\\b.P"
    );
  }

  @Test
  public final void test300() {
    reducesTo(
      "(\\k.\\h.(\\p.K) ((\\b.l j) (\\c.\\j.\\z.l g))) (\\j.\\v.(\\n.\\z.(\\q.K) ((\\q.\\c.E) ((\\i.\\c.\\g.\\z.\\z.(\\b.(\\j.(\\w.\\b.K) Z) (i b)) (\\p.\\e.(\\x.z w) (\\o.a w) (\\v.(\\m.Q x) S))) n))) (\\r.x (\\i.\\o.\\r.\\j.(\\k.\\n.\\q.v) ((\\u.\\v.e (\\h.z) (\\w.\\p.\\o.\\v.\\g.v (K (\\g.G y)))) ((\\e.\\r.\\u.Q) (\\a.\\a.\\h.X o (\\s.(\\l.R j) (y G U))))))))",
      "\\h.K"
    );
  }

  @Test
  public final void test301() {
    reducesTo(
      "g (H ((\\t.y) ((\\f.\\l.\\q.g (\\e.\\s.a)) ((\\r.\\u.s m) (\\n.\\c.Y b))) m f (\\w.\\h.\\t.\\m.\\y.(\\x.(\\q.\\j.\\b.m) (\\f.g (K Q (X a) (\\j.\\f.\\b.m))) ((\\k.d) N z ((\\q.\\x.\\s.\\r.(\\r.y) (F y)) ((\\o.(\\t.Q) (h N)) (\\m.K))))) (\\a.\\s.e (\\t.(\\d.V) (\\e.h)) (z D (\\a.m) (\\k.(\\q.o) (\\c.z))) N ((\\e.\\u.\\f.\\k.\\p.\\q.\\d.\\w.\\w.(\\v.x x) (n (\\d.p))) ((\\a.(\\t.c) (I X) c) (\\u.(\\k.x) m (\\l.(\\p.V) (c q)))))))))",
      "g (H (y m f (\\w.\\h.\\t.\\m.\\y.\\b.m)))"
    );
  }

  @Test
  public final void test302() {
    reducesTo(
      "\\w.u ((\\q.(\\c.(\\o.j p) ((\\q.y) (e T) (\\x.(\\h.U) u)) (\\d.\\j.(\\e.y) (\\y.\\l.(\\l.H z) (\\y.h))) (\\w.u)) (\\c.(\\p.(\\m.r (\\s.b (\\z.p))) (G (v m) (\\n.\\u.\\u.e))) (\\g.v) (o (\\i.d) V))) (\\s.(\\a.\\o.\\f.(\\i.\\t.(\\d.\\l.o) (\\u.z p)) ((\\z.\\m.\\l.W) (\\e.w L))) (\\n.b) (\\i.v) (\\c.\\a.Z)) (\\f.v))",
      "\\w.u (j p (\\d.\\j.y) (\\w.u) (\\f.v))"
    );
  }

  @Test
  public final void test303() {
    reducesTo(
      "\\p.(\\r.\\z.\\w.\\h.(\\b.g) (\\a.J) A) ((\\f.b) ((\\h.(\\w.(\\i.\\m.c (Z k) (j (w z))) (d (Z g (\\s.C)))) f ((\\f.o) w)) x)) ((\\a.(\\e.(\\p.p) (\\u.g) (\\h.v)) (\\s.O)) (\\b.\\c.\\i.u (z (\\p.X) Y)) (\\g.(\\b.m) (\\u.(\\u.x E (\\h.t)) (T V (M m))) (\\j.\\m.(\\m.\\g.y (\\u.\\q.p)) (a f U (\\i.\\d.t b)))) ((\\q.\\f.\\m.\\i.\\e.e s (z F)) ((\\v.\\z.j) v) c U) X K)",
      "\\p.\\w.\\h.g A"
    );
  }

  @Test
  public final void test304() {
    reducesTo(
      "(\\n.(\\i.\\l.k) (\\g.(\\y.\\o.z V (\\w.\\b.(\\n.\\m.\\u.\\m.v) (\\g.M ((\\q.o) (u q)) (e (\\j.i) (\\b.(\\t.x) (d y))))) ((\\o.\\n.a (\\k.\\q.M)) (\\u.Q (u x (\\u.D))) ((\\p.t) (\\x.X) (\\v.\\s.\\v.o) (\\y.\\g.I k)) (\\v.(\\c.(\\t.(\\i.b) (\\t.H)) (\\k.\\u.\\a.L) N) O))) (\\k.y))) (\\t.d)",
      "\\l.k"
    );
  }

  @Test
  public final void test305() {
    reducesTo(
      "\\c.\\i.\\e.(\\j.(\\t.\\f.o (\\l.(\\j.d) s)) ((\\l.\\g.Q (n l t (\\x.X k o) ((\\y.W) (\\z.N) (\\w.R (w l)))) ((\\a.\\b.h a) (\\e.c w (D s)) (\\t.v) p)) ((\\m.t) J (\\y.\\s.q) (\\j.(\\d.\\m.(\\r.\\o.\\s.D) (\\c.s)) (\\d.j (E (\\u.\\r.\\a.G))))) (\\i.\\j.\\d.\\z.w (w ((\\p.\\x.E M) (v r (y V)))) ((\\b.\\m.\\b.c (\\g.\\w.p)) (\\w.(\\f.\\g.\\i.(\\z.y) (F K) A) ((\\n.d) S))) (B (\\x.(\\n.(\\u.\\d.H q) (b m a) (m (\\b.s))) (\\h.\\i.w (\\j.\\i.J r (X q) (s (B k))))))))) O",
      "\\c.\\i.\\e.\\f.o (\\l.d)"
    );
  }

  @Test
  public final void test306() {
    reducesTo(
      "\\a.(\\l.(\\d.(\\r.\\m.\\k.(\\h.i) ((\\o.a) (\\o.(\\q.(\\d.I C) (V h)) (W ((\\z.D) R))))) (x ((\\g.j) ((\\q.a) (\\q.v))) i ((\\o.\\r.H a) (\\v.s)))) (\\q.(\\x.\\u.(\\s.(\\n.y) (\\p.K) (w x l)) (J (A h (\\w.y))) (n (\\f.X))) (\\t.\\f.\\o.T (W d)) ((\\z.\\c.\\f.x (\\v.(\\q.k) q)) (\\p.r ((\\k.\\j.\\g.B ((\\h.U) v)) (\\p.(\\y.x) (\\y.D) (\\u.v n (\\g.E))))))) (M (\\c.X) (\\f.v))) ((\\b.\\o.(\\l.(\\k.F) (f a)) (\\r.(\\s.W) (D m)) ((\\y.J D) n) (m (\\f.\\w.\\n.z (\\t.Y s))) ((\\a.y) (\\k.t (d N) (y (\\a.m))) (w (U w (\\x.L)) (\\p.l))) (e (\\i.u (\\w.b (\\g.\\m.L))))) ((\\u.o) d) ((\\d.L u) (\\q.g ((\\c.\\s.J (P (\\l.x) (x u (\\z.b)))) ((\\e.a (\\q.T)) (x w) x)) z)))",
      "\\a.\\k.i"
    );
  }

  @Test
  public final void test307() {
    reducesTo(
      "(\\o.e (\\u.\\q.(\\x.\\f.\\z.c) v (\\a.\\q.(\\i.Q) (h a) (\\e.e (\\v.f)) a ((\\j.G) ((\\n.w) H)) (s ((\\t.(\\p.\\q.c q) ((\\h.V) (C D))) (D (\\e.t) (\\c.v))))) ((\\t.g) ((\\x.t (f j) r ((\\x.l f) (\\t.P t (z Y)))) ((\\q.(\\a.r) (\\r.k)) (v (C e)) ((\\c.C) (\\p.C) P))) (U ((\\q.\\j.r) ((\\a.c (\\g.L)) (\\e.N I (\\i.N) (\\g.\\g.y)))))))) (\\s.\\h.\\w.K (\\d.\\w.\\g.(\\x.a ((\\d.\\m.F) (\\s.Y g ((\\p.(\\p.(\\m.z) (\\h.m)) (\\m.L i m)) I)))) (\\j.(\\p.F ((\\j.\\n.r (\\i.\\q.M)) ((\\t.d) ((\\d.e) (\\l.r))))) ((\\m.j) (\\w.\\h.h (\\w.(\\v.P) (v x) (\\d.C y))) (\\j.\\l.(\\g.(\\u.k) r) O a b)))))",
      "e (\\u.\\q.c)"
    );
  }

  @Test
  public final void test308() {
    reducesTo(
      "\\e.\\s.\\r.M",
      "\\e.\\s.\\r.M"
    );
  }

  @Test
  public final void test309() {
    reducesTo(
      "\\c.\\e.z",
      "\\c.\\e.z"
    );
  }

  @Test
  public final void test310() {
    reducesTo(
      "\\v.\\z.n",
      "\\v.\\z.n"
    );
  }

  @Test
  public final void test311() {
    reducesTo(
      "\\j.\\j.\\k.(\\w.i (R ((\\z.(\\t.(\\m.\\o.p) O) (x (\\q.Y))) h)) (i j) ((\\r.(\\p.\\o.S) ((\\z.p) (\\w.N) ((\\d.b) (R h)) (F Z (f f) (\\x.\\e.l i)))) (\\f.\\n.n) ((\\f.(\\n.(\\t.I) (p d) s) r) ((\\b.U) (\\w.\\b.M d) F) G) r)) (\\k.M)",
      "\\j.\\j.\\k.i (R (\\o.p)) (i j) (S r)"
    );
  }

  @Test
  public final void test312() {
    reducesTo(
      "\\r.\\r.s",
      "\\r.\\r.s"
    );
  }

  @Test
  public final void test313() {
    reducesTo(
      "(\\b.\\i.(\\w.(\\m.\\f.(\\d.\\c.(\\r.\\y.(\\l.q) h ((\\y.N) (\\q.v))) (\\j.(\\y.\\g.A) (\\m.\\z.V))) (j (f (\\j.\\m.L g)))) (\\q.y)) n (\\b.(\\d.(\\j.O) I ((\\r.c O (F Z)) (\\h.A))) w U ((\\b.\\w.(\\w.\\h.\\f.g) (W D (\\b.b)) (G (f (o r))) (\\h.\\o.(\\h.o) ((\\v.\\v.s Q) ((\\b.h) (\\r.g))))) (\\r.\\y.\\w.c)))) (\\g.\\x.\\r.\\k.\\w.\\l.k V (\\e.\\z.\\b.u)) (\\q.Q)",
      "\\c.\\y.q (N)"
    );
  }

  @Test
  public final void test314() {
    reducesTo(
      "(\\c.\\s.\\q.(\\y.\\d.X V) (N t Z) ((\\a.\\w.\\b.x J ((\\a.L l) (\\j.(\\z.(\\u.v B) (x (\\d.e))) (b (e u) (w (y a)))))) (\\z.\\m.k ((\\p.D) (\\r.i) (\\n.f) ((\\e.\\a.\\a.w) (r Y (E D)))) (\\o.(\\y.P) e))) (s a)) (u ((\\a.\\u.\\f.b) (\\p.\\b.e W) ((\\s.b) (\\z.V) (\\c.(\\z.t) R)) (s c (\\x.j) h (\\p.\\x.\\y.(\\c.\\q.c) ((\\w.A) (g I)))) P) (E (\\l.\\k.b) (\\u.(\\o.\\x.\\a.(\\k.r) ((\\x.v J (\\t.G)) n)) (\\a.\\h.q)) (\\y.\\x.\\l.\\m.\\l.(\\v.R V y (\\j.h (o a)) ((\\w.z) E (\\b.f)) Y) p)) f)",
      "\\s.\\q.X V (s a)"
    );
  }

  @Test
  public final void test315() {
    reducesTo(
      "(\\k.s (i n)) (\\g.\\o.u ((\\v.s d (T s) (N (w w))) v) (\\y.\\b.\\g.(\\k.\\q.\\m.\\o.h (L o l)) (\\h.a)) Y ((\\p.(\\n.\\r.(\\p.v ((\\j.o u (a y)) (Z (f d)))) (\\d.(\\q.M) (t j) j (z (\\y.y) (\\i.\\o.d u)))) ((\\e.v e) (C B (\\t.J)) V (\\v.\\q.s s (z j) (\\u.(\\n.n) r) (\\z.\\r.q)))) (m (V K (j L)) (\\p.(\\a.(\\k.d) s) (\\h.\\s.a P)) (\\l.t) (\\w.(\\z.T (\\b.G)) (\\q.m P) ((\\w.\\o.X R) C) z))) (\\q.\\a.\\p.\\x.(\\b.t (\\p.(\\j.(\\d.S) (z x)) (v (d q))) (u y ((\\y.\\w.u) ((\\c.h) (y s)))) a) (\\a.N) ((\\r.(\\c.\\v.n (\\r.y)) ((\\c.\\r.\\q.G) (\\m.c))) ((\\j.(\\t.(\\u.C) (\\w.F)) (i a C) i) ((\\m.U) (\\p.y) F (\\e.\\n.f)) x))))",
      "s (i n)"
    );
  }

  @Test
  public final void test316() {
    reducesTo(
      "\\t.\\o.\\j.j V E x",
      "\\t.\\o.\\j.j V E x"
    );
  }

  @Test
  public final void test317() {
    reducesTo(
      "\\n.\\l.t",
      "\\n.\\l.t"
    );
  }

  @Test
  public final void test318() {
    reducesTo(
      "\\h.U",
      "\\h.U"
    );
  }

  @Test
  public final void test319() {
    reducesTo(
      "s ((\\k.\\g.(\\e.q (w O (\\h.\\r.\\t.(\\h.(\\g.u) (j L (\\c.w))) (f ((\\s.y) (e g)))) ((\\s.\\c.o) ((\\i.\\c.S v) (w E (l n))) (\\t.P ((\\w.\\u.\\i.A) K))))) (\\i.k)) u)",
      "s (\\g.q (w O (\\h.\\r.\\t.u) (o)))"
    );
  }

  @Test
  public final void test320() {
    reducesTo(
      "\\h.s",
      "\\h.s"
    );
  }

  @Test
  public final void test321() {
    reducesTo(
      "\\g.\\t.O",
      "\\g.\\t.O"
    );
  }

  @Test
  public final void test322() {
    reducesTo(
      "\\o.(\\t.\\d.b (\\x.M h (\\x.y) W (\\l.\\g.\\b.\\p.x)) (\\x.\\b.n (\\p.z (W (\\t.n)))) ((\\n.z) (\\h.(\\e.\\w.\\c.b r (\\h.b) ((\\n.w) (N L)) (\\s.(\\m.K P) F)) ((\\h.w (x j)) (\\z.c F (\\d.f)) (x (\\z.B) ((\\f.z) (f y)))))) ((\\q.(\\o.(\\v.\\r.\\d.d) b) (\\e.y k (\\u.F) (i d (\\k.e))) ((\\n.U x l) (\\h.(\\p.h) L) (\\d.\\d.(\\h.a) (\\m.i) (f d M))) ((\\t.q) (t (v (n k)) u))) (l (\\r.\\j.N))) ((\\e.\\s.(\\e.n) (T (v (J k (r s) ((\\b.F) (\\z.m)))))) (D (m x (\\h.N) (\\d.\\w.s)) (\\h.(\\i.o V r (\\s.\\l.\\i.K)) f) P) (q t))) (\\s.\\h.(\\x.(\\h.\\g.(\\s.\\n.\\c.\\r.\\c.(\\g.\\k.\\v.\\n.(\\w.O) Q (\\o.g) F) (e (\\i.U (R q)) (\\j.\\m.k (E p) (\\o.\\b.u)))) ((\\e.(\\q.\\c.G) (r l (r d)) (q (\\d.v) K)) (\\x.u (b G (\\d.o) Y))) (\\x.\\d.(\\r.z) ((\\g.n) ((\\d.D (\\v.w) (\\i.\\u.\\z.a)) (k m))))) (\\n.U)) i)",
      "\\o.\\d1.b (\\x.M h (\\x.y) W (\\l.\\g.\\b.\\p.x)) (\\x.\\b.n (\\p.z (W (\\t.n)))) (z) (l (\\r.\\j.N)) (n)"
    );
  }

  @Test
  public final void test323() {
    reducesTo(
      "\\v.\\r.(\\n.y (O (\\l.g) ((\\u.d) (\\n.(\\n.b) Q ((\\h.x) (O g)) ((\\o.o) (v X) (\\y.\\e.l o)))) ((\\g.\\j.\\h.y) (w m (d e)) r s (\\k.g))) M) (\\u.\\y.\\g.\\n.(\\k.\\f.(\\e.(\\a.i) (\\t.\\t.\\o.\\j.(\\h.O (\\d.o)) ((\\h.\\b.\\n.p) (h (r j))) (L v)) ((\\n.\\n.K) (\\o.\\g.k) (\\n.r (\\o.V)))) (\\g.(\\k.A ((\\o.i) (\\x.\\z.u W) (\\k.D (\\f.R x (\\m.a))) K)) g)) (\\r.d))",
      "\\v.\\r.y (O (\\l.g) (d) (y (\\k.g))) M"
    );
  }

  @Test
  public final void test324() {
    reducesTo(
      "\\q.H m",
      "\\q.H m"
    );
  }

  @Test
  public final void test325() {
    reducesTo(
      "\\x.I",
      "\\x.I"
    );
  }

  @Test
  public final void test326() {
    reducesTo(
      "\\m.\\g.v",
      "\\m.\\g.v"
    );
  }

  @Test
  public final void test327() {
    reducesTo(
      "(\\q.o (\\p.X ((\\s.S) ((\\y.\\v.(\\i.l) (\\a.O) (q (z e))) f)) (\\f.\\o.f) o)) (\\x.a (\\k.\\f.\\w.\\c.\\v.f))",
      "o (\\p.X (S) (\\f.\\o.f) o)"
    );
  }

  @Test
  public final void test328() {
    reducesTo(
      "(\\i.l (\\e.m ((\\x.x) (\\v.S)))) (\\a.(\\p.s) (b X C (\\v.(\\k.A) p))) s u (\\k.(\\a.\\b.\\h.\\d.\\i.w) (\\c.(\\s.(\\c.X) (\\r.j)) (F (j (\\f.n) (v h))))) (\\x.\\g.\\m.\\n.(\\a.\\c.\\q.(\\f.(\\d.\\l.\\i.(\\b.g) (\\l.Y)) (n W (d m) (u z (Q s)))) w) (\\i.(\\v.r (\\g.\\v.b (\\b.f))) ((\\f.O) ((\\u.c) (J D)) (s (a U) (\\g.n)))) (\\t.\\e.r) (\\o.\\q.(\\i.\\z.\\u.c) (\\q.(\\r.b) (\\o.d v (c f)) (o (p H) ((\\b.c) (\\n.q)))) (\\u.(\\x.w) (\\w.\\j.\\f.d (\\i.h) ((\\d.C) (j J) (\\w.q)))) (b (\\x.\\m.\\q.z W (\\e.v ((\\c.\\a.\\p.z) ((\\r.D) (t w)))))))) (\\h.\\u.\\w.\\r.(\\x.\\q.(\\m.m (\\g.\\h.\\o.U) ((\\w.\\z.\\z.v) (j u F) (\\w.\\m.\\o.\\c.z)) (\\m.e)) (\\u.l)) x ((\\n.f) (\\o.i)))",
      "l (\\e.m (\\v.S)) s u (\\k.\\b.\\h.\\d.\\i.w) (\\x.\\g.\\m.\\n.\\l.\\i.g) (\\h.\\u.\\w.\\r.l (\\z.v) (\\m.e))"
    );
  }

  @Test
  public final void test329() {
    reducesTo(
      "(\\x.i l) v",
      "i l"
    );
  }

  @Test
  public final void test330() {
    reducesTo(
      "i (P (\\j.P) c)",
      "i (P (\\j.P) c)"
    );
  }

  @Test
  public final void test331() {
    reducesTo(
      "\\y.c",
      "\\y.c"
    );
  }

  @Test
  public final void test332() {
    reducesTo(
      "O (\\q.P (\\p.\\v.x)) ((\\x.\\w.\\h.g) ((\\k.e) V ((\\b.W) (\\f.(\\q.O (\\v.\\c.I w)) (\\c.j R))) (S ((\\i.(\\r.\\e.\\g.u) ((\\n.b) h) (\\u.\\d.(\\v.o) ((\\x.P) (w j)))) f ((\\l.\\z.(\\x.\\h.y o) (\\s.\\t.B s) (\\o.\\e.l)) c)))))",
      "O (\\q.P (\\p.\\v.x)) (\\w.\\h.g)"
    );
  }

  @Test
  public final void test333() {
    reducesTo(
      "e (\\x.(\\y.R) (\\a.i) (\\t.p r (\\o.U) ((\\u.y) (F C)) p (\\u.C (\\y.(\\h.M) (\\l.m)) (\\h.(\\b.f (c J)) (\\t.(\\p.f) (\\a.Y)))) (\\e.\\z.d (Z (\\b.\\z.G q) (V x ((\\d.W) (\\v.d))))) (m i ((\\p.F) (\\u.v)) (z (y w)) a)) (\\e.\\z.\\p.b))",
      "e (\\x.R (\\t.p r (\\o.U) (y) p (\\u.C (\\y.M) (\\h.f (c J))) (\\e.\\z.d (Z (\\b.\\z.G q) (V x (W)))) (m i (F) (z (y w)) a)) (\\e.\\z.\\p.b))"
    );
  }

  @Test
  public final void test334() {
    reducesTo(
      "\\t.o",
      "\\t.o"
    );
  }

  @Test
  public final void test335() {
    reducesTo(
      "a (\\k.U)",
      "a (\\k.U)"
    );
  }

  @Test
  public final void test336() {
    reducesTo(
      "\\o.\\b.c",
      "\\o.\\b.c"
    );
  }

  @Test
  public final void test337() {
    reducesTo(
      "\\v.\\v.(\\h.Q) ((\\h.(\\x.(\\z.y) r ((\\r.P) n) (t (\\i.\\k.\\p.h)) f (\\d.m)) (P Y)) o)",
      "\\v.\\v.Q"
    );
  }

  @Test
  public final void test338() {
    reducesTo(
      "\\h.(\\j.(\\r.h) ((\\l.\\a.k o) (\\t.k y) (\\m.\\u.e))) I (\\c.\\j.j (\\k.c) ((\\c.y o) (\\h.W s (\\n.C) (\\f.(\\g.P) (\\w.y)) (i O (U v) A) n d) x))",
      "\\h.h (\\c.\\j.j (\\k.c) (y o x))"
    );
  }

  @Test
  public final void test339() {
    reducesTo(
      "\\s.\\f.\\l.h (V ((\\r.\\g.(\\a.\\s.\\g.(\\p.L) (\\j.L) (G J (\\k.O)) w) (\\y.i) ((\\f.(\\i.m) ((\\t.\\e.v a) (h w b))) (\\i.N))) (p O I ((\\y.(\\u.q) ((\\h.D) (T i))) (a (\\a.\\y.\\h.b))) C)) y)",
      "\\s.\\f.\\l.h (V (\\g.\\g.L (G J (\\k.O)) w) y)"
    );
  }

  @Test
  public final void test340() {
    reducesTo(
      "t ((\\m.(\\i.(\\v.Y) a) (j E ((\\e.(\\d.b) (\\s.s (k V)) (g s (j c) t)) f)) (\\h.(\\p.U (d (e k g (\\g.\\q.\\a.c) T))) ((\\i.k f) (u x)))) (\\u.a))",
      "t (Y (\\h.U (d (e k g (\\g.\\q.\\a.c) T))))"
    );
  }

  @Test
  public final void test341() {
    reducesTo(
      "\\j.a (\\l.\\e.\\d.b)",
      "\\j.a (\\l.\\e.\\d.b)"
    );
  }

  @Test
  public final void test342() {
    reducesTo(
      "\\i.\\i.\\b.d (a (\\y.z))",
      "\\i.\\i.\\b.d (a (\\y.z))"
    );
  }

  @Test
  public final void test343() {
    reducesTo(
      "(\\s.\\o.\\n.\\g.L) ((\\r.\\t.\\d.\\n.\\k.\\c.\\p.H) ((\\j.(\\b.\\q.\\v.\\b.(\\g.s) (\\d.j)) (\\l.x)) (f (\\y.(\\t.E) (\\z.Z) (\\r.(\\d.D) (\\a.f)))) (\\h.G ((\\y.n) (E o)) k ((\\q.\\o.c) ((\\k.n) g (\\j.\\x.I)))) (\\x.\\d.k (\\k.\\d.(\\y.V) (\\d.q) ((\\d.D) (u o)) (p (z K (Q D)))) ((\\q.I) (\\t.\\x.P)))) (r (\\w.b)))",
      "\\o.\\n.\\g.L"
    );
  }

  @Test
  public final void test344() {
    reducesTo(
      "\\i.(\\u.\\k.(\\j.Q) v) (\\x.\\j.\\o.h) e",
      "\\i.Q"
    );
  }

  @Test
  public final void test345() {
    reducesTo(
      "\\t.\\t.q ((\\y.L z) e) ((\\e.(\\q.a) ((\\r.D) (j m))) (f ((\\j.G) E)) (m ((\\f.\\a.\\u.y) (G h (y d)))) Z ((\\p.(\\q.(\\e.m) ((\\d.G) ((\\n.J) (\\s.x)))) (Q (\\k.x) h (\\h.\\e.\\o.n (\\w.P) (u t (\\e.H))))) (e (\\a.t (F V) (f (Z l))) ((\\z.e S (\\p.h)) (\\d.\\o.d x) ((\\u.\\l.Y p) v))))) (\\e.u) (\\w.\\s.o)",
      "\\t.\\t.q (L z) (a (m (\\a.\\u.y)) Z (m)) (\\e.u) (\\w.\\s.o)"
    );
  }

  @Test
  public final void test346() {
    reducesTo(
      "(\\d.\\t.V c c ((\\t.y) ((\\o.\\y.\\c.Z (\\z.q)) (\\y.\\g.(\\j.\\w.\\b.\\d.(\\b.\\p.h) (\\e.(\\k.Z) n (\\o.\\b.(\\c.G t) (\\u.\\q.m)))) (k T (a c) (o x G) (\\y.(\\k.y u) (\\v.u Y z)) (j r ((\\i.V) t) J)))))) (k (\\o.w))",
      "\\t.V c c (y)"
    );
  }

  @Test
  public final void test347() {
    reducesTo(
      "\\t.b k",
      "\\t.b k"
    );
  }

  @Test
  public final void test348() {
    reducesTo(
      "L (\\j.\\o.\\p.K)",
      "L (\\j.\\o.\\p.K)"
    );
  }

  @Test
  public final void test349() {
    reducesTo(
      "\\a.\\c.(\\b.n (\\e.v)) i",
      "\\a.\\c.n (\\e.v)"
    );
  }

  @Test
  public final void test350() {
    reducesTo(
      "\\p.T",
      "\\p.T"
    );
  }

  @Test
  public final void test351() {
    reducesTo(
      "(\\c.z) (\\p.(\\d.\\z.d) ((\\q.B) ((\\h.c) ((\\i.\\n.\\n.K) ((\\u.g z (\\l.x)) (s (x i)))))) w) m",
      "z m"
    );
  }

  @Test
  public final void test352() {
    reducesTo(
      "r (\\g.\\m.(\\c.O) (\\d.x) ((\\c.\\v.(\\b.w) (\\x.\\r.a) (\\e.\\e.k)) E))",
      "r (\\g.\\m.O (\\v.w (\\e.\\e.k)))"
    );
  }

  @Test
  public final void test353() {
    reducesTo(
      "\\h.\\z.v (W T)",
      "\\h.\\z.v (W T)"
    );
  }

  @Test
  public final void test354() {
    reducesTo(
      "\\j.(\\n.(\\e.d ((\\w.\\n.\\c.g) (\\f.p) (\\q.N) ((\\q.r) x)) (P (\\w.\\g.q ((\\v.\\q.j n C ((\\t.E) (k O))) o)))) (N ((\\d.(\\j.\\s.\\i.\\z.\\h.\\a.(\\e.z) ((\\q.o y) (V n))) (\\p.P)) (j E))) ((\\b.(\\p.h) ((\\n.j) (\\c.\\h.\\w.\\c.F y (\\x.Z) (\\p.\\e.a) V))) (\\m.\\a.e (V p)) e)) (\\i.F)",
      "\\j.d (g) (P (\\w.\\g.q (\\q.j (\\i.F) C (E)))) (h e)"
    );
  }

  @Test
  public final void test355() {
    reducesTo(
      "\\d.O",
      "\\d.O"
    );
  }

  @Test
  public final void test356() {
    reducesTo(
      "z (\\h.(\\t.r (j ((\\p.j) (q s) (\\e.(\\o.b) (\\u.Z))) I)) (\\i.h (\\c.b)) N) F",
      "z (\\h.r (j (j (\\e.b)) I) N) F"
    );
  }

  @Test
  public final void test357() {
    reducesTo(
      "(\\o.\\n.\\j.(\\n.p) (\\x.(\\j.\\y.H) (e (y (\\v.U r (y Z)) ((\\c.\\m.\\r.k) (\\h.(\\c.g) (\\p.P)))) (\\b.F (\\v.\\x.\\z.\\p.\\v.(\\w.\\r.(\\r.S) (\\u.H)) (i h))))) (\\e.\\f.\\a.q)) o",
      "\\n.\\j.p (\\e.\\f.\\a.q)"
    );
  }

  @Test
  public final void test358() {
    reducesTo(
      "y h (\\i.\\y.c (\\j.\\a.(\\o.y) (\\r.(\\x.\\g.y (\\v.\\q.n p (\\k.\\s.j))) (\\y.I)) r (\\u.r)))",
      "y h (\\i.\\y.c (\\j.\\a.y r (\\u.r)))"
    );
  }

  @Test
  public final void test359() {
    reducesTo(
      "(\\u.(\\n.\\o.\\s.N) H (\\x.\\d.(\\i.R) g)) (J s ((\\j.i r) v))",
      "\\s.N"
    );
  }

  @Test
  public final void test360() {
    reducesTo(
      "f (q (\\q.u)) x (\\l.\\l.\\y.h (\\y.u (h ((\\v.D (x h) (\\n.\\s.e w)) (\\k.(\\q.r) (y x) c)))) (\\w.\\v.\\p.\\c.j) g)",
      "f (q (\\q.u)) x (\\l.\\l.\\y.h (\\y.u (h (D (x h) (\\n.\\s.e w)))) (\\w.\\v.\\p.\\c.j) g)"
    );
  }

  @Test
  public final void test361() {
    reducesTo(
      "(\\o.\\c.(\\s.\\b.\\x.\\x.d) ((\\h.\\v.(\\v.s (o C (\\u.f) (X k (\\m.g)) (x I))) (Q (\\g.\\x.f))) (\\d.\\y.(\\q.D) (\\j.r))) f) e",
      "\\c.\\x.\\x.d"
    );
  }

  @Test
  public final void test362() {
    reducesTo(
      "\\e.(\\q.l) (\\f.\\l.r) G",
      "\\e.l G"
    );
  }

  @Test
  public final void test363() {
    reducesTo(
      "(\\o.(\\f.y) ((\\o.(\\t.(\\b.q) (\\x.l) (\\r.\\d.Q i)) ((\\i.(\\u.f) (L v)) (w k)) (\\y.\\q.a) (\\c.v t (\\w.\\z.(\\y.Q) (w H) x) (\\r.\\y.(\\k.U y (e i) (l g (\\p.Q))) (\\o.Y m)))) (\\r.(\\g.\\t.\\a.(\\u.(\\o.J) (\\j.d) ((\\q.B) (\\d.a))) (e ((\\q.p) (\\o.X))) (Y z (p p) (w d (\\f.p)) ((\\f.u x (N t)) (q (S x))))) ((\\v.E (\\t.S) s) ((\\k.(\\x.l) (\\q.C)) (e d (u h))) (\\l.\\b.(\\q.l) (\\e.\\u.(\\f.\\m.h) (\\j.v P))))))) (\\k.(\\d.(\\f.\\p.K (\\u.(\\e.g) (\\p.b)) (\\k.(\\m.(\\z.K) (\\k.A)) A) ((\\k.\\n.\\y.n X (\\z.t) ((\\f.G) (x E))) (\\r.m p (\\w.S) (\\k.\\d.L T))) p) ((\\a.(\\z.o (Z B) (\\j.\\l.c q)) H) (\\x.n) ((\\e.\\l.D) (\\w.\\i.(\\t.\\k.\\d.A) (z i (\\z.m)) (U ((\\e.y) (H d))))))) (\\i.(\\t.(\\v.c) g) (\\p.k ((\\v.\\i.(\\s.\\s.j) j) p)) y)) c",
      "y c"
    );
  }

  @Test
  public final void test364() {
    reducesTo(
      "(\\d.(\\g.w) (D (\\c.z))) (\\s.\\o.x)",
      "w"
    );
  }

  @Test
  public final void test365() {
    reducesTo(
      "\\t.(\\p.\\y.\\x.e) (\\y.\\q.u ((\\n.i ((\\g.y h ((\\n.q) (\\q.m)) (\\z.\\k.(\\p.g G) (\\s.r t))) (\\v.q))) (\\n.\\n.\\i.\\e.\\e.J Z (\\r.u (\\y.v) (\\w.t) (\\h.\\e.\\w.(\\x.M) T) ((\\o.\\c.o) (\\h.\\g.Q))))) (p (\\j.\\w.d ((\\b.k) (\\m.(\\a.v ((\\f.d) c)) (\\b.\\h.\\z.B (\\g.u) (\\w.\\e.D))) v))))",
      "\\t.\\y.\\x.e"
    );
  }

  @Test
  public final void test366() {
    reducesTo(
      "\\r.p (\\f.(\\e.\\p.\\r.\\h.Z N) ((\\w.V ((\\y.R o (\\m.J) N ((\\n.l (\\e.x)) (T c f))) (d (\\y.Y j (\\c.S) (\\f.q k (r t)))))) (\\q.n))) (m (\\p.(\\a.(\\x.\\z.z V) (\\t.V y) ((\\z.I) G)) (\\c.\\h.L)) (\\f.f ((\\n.\\z.\\m.(\\f.a) ((\\g.a) (H d))) (\\q.q ((\\m.g) (X m)))) m) ((\\l.\\l.l) v) H)",
      "\\r.p (\\f.\\p.\\r.\\h.Z N) (m (\\p.I V) (\\f.f (\\z.\\m.a) m) (\\l.l) H)"
    );
  }

  @Test
  public final void test367() {
    reducesTo(
      "(\\s.(\\e.\\x.\\u.\\g.(\\x.\\t.Q (q p) (\\g.\\y.f) (\\q.X)) r) ((\\e.\\p.(\\j.r (\\t.t)) V ((\\c.u e q) (\\c.(\\u.e) (\\w.S)))) ((\\f.(\\h.n d c) s) (J ((\\w.z) (P t)))))) (r (\\b.\\e.\\f.\\u.X)) (\\y.\\u.\\c.i ((\\t.g) ((\\p.k) M))) (\\n.(\\y.(\\t.\\b.(\\y.\\n.c) q A) ((\\i.q) ((\\q.\\w.J) g))) (\\r.\\t.(\\a.J ((\\n.\\b.\\b.\\n.\\b.i s) (\\q.(\\p.E (d d)) (l g (X O)) ((\\a.f) (\\d.k))))) l)) (\\y.(\\d.\\k.Y) ((\\k.d (\\g.C) (w a (\\s.B)) (b s) (P ((\\k.S) k) (\\v.\\r.(\\a.e) (\\i.d) (\\p.\\g.s))) ((\\g.\\j.i) ((\\z.(\\i.\\o.R) f) (t ((\\j.e) P))))) (D (\\x.(\\t.\\g.y) (N Y) r) F)) L)",
      "\\t.Q (q p) (\\g.\\y.f) (\\q.X)"
    );
  }

  @Test
  public final void test368() {
    reducesTo(
      "\\q.i ((\\r.\\d.\\k.\\g.\\d.(\\n.(\\f.\\t.(\\i.s V) l) (p p i (\\g.\\x.\\s.g))) ((\\t.k) ((\\r.x) (\\x.y)) T) ((\\e.\\z.\\t.\\c.\\w.\\u.q) (\\r.t (J f) u) (\\a.q)) (\\h.r (\\i.(\\q.(\\b.r) a) (\\t.\\s.\\u.d)) (p (p T)) b)) (\\w.(\\o.(\\d.(\\j.\\k.\\j.w ((\\i.w) t) (p R h)) T) (Z (\\d.s))) o)) (c (\\b.p))",
      "\\q.i (\\d.\\k.\\g.\\d.s V (\\h1.\\k.\\j.p R h (p R h) (p R h))) (c (\\b.p))"
    );
  }

  @Test
  public final void test369() {
    reducesTo(
      "\\i.\\i.\\p.\\t.D",
      "\\i.\\i.\\p.\\t.D"
    );
  }

  @Test
  public final void test370() {
    reducesTo(
      "\\c.p",
      "\\c.p"
    );
  }

  @Test
  public final void test371() {
    reducesTo(
      "\\r.M",
      "\\r.M"
    );
  }

  @Test
  public final void test372() {
    reducesTo(
      "(\\b.(\\d.c) ((\\c.e) ((\\k.U) (\\s.\\y.W U))) ((\\q.h ((\\m.\\k.d) J l (\\h.r (M (\\t.b)) o))) (\\j.\\j.l (\\j.\\z.o) t) z)) (\\p.\\g.\\g.\\a.\\z.R (\\i.\\z.(\\x.Q) (\\m.P)))",
      "c (h (d (\\h.r (M (\\t.\\p.\\g.\\g.\\a.\\z.R (\\i.\\z.Q))) o)) z)"
    );
  }

  @Test
  public final void test373() {
    reducesTo(
      "\\j.(\\p.(\\a.\\c.(\\i.\\u.\\f.\\n.p) (\\x.\\e.(\\g.\\n.(\\c.p K) ((\\m.i) R)) (d (h H (h u))) (K p) t ((\\c.\\d.\\x.r (\\p.Y) ((\\w.\\w.\\v.(\\x.s) (\\l.l)) ((\\m.y f (m w)) (N d (\\x.t))))) Y))) q) (\\r.N)",
      "\\j.\\c.\\u.\\f.\\n.\\r.N"
    );
  }

  @Test
  public final void test374() {
    reducesTo(
      "(\\e.(\\x.\\k.\\n.\\v.m) (\\l.\\a.\\d.z)) (R k) (b (\\h.r ((\\z.c) X))) p",
      "\\v.m"
    );
  }

  @Test
  public final void test375() {
    reducesTo(
      "(\\g.(\\y.(\\l.(\\p.n) (\\o.(\\w.p) (g l) J) ((\\o.z k u (\\a.\\j.n s)) e) (\\f.v)) o) k) (z (\\s.p)) (U (w (C (o (\\a.\\e.l (\\q.(\\h.\\c.(\\v.k) (q a) (\\r.F E)) (o F (v i) (i (\\w.D)))))))))",
      "n (z k u (\\a.\\j.n s)) (\\f.v) (U (w (C (o (\\a.\\e.l (\\q.\\c.k (\\r.F E)))))))"
    );
  }

  @Test
  public final void test376() {
    reducesTo(
      "\\m.I ((\\i.\\k.H t (\\w.x) w ((\\d.(\\z.i) L) (F (p e))) q ((\\w.\\c.\\q.\\h.(\\b.\\w.\\s.u (\\n.X)) (\\s.\\z.\\a.h z)) ((\\i.(\\c.Y) (f B) (\\f.(\\f.g) (G c))) ((\\i.s) (Z J) i)))) l (\\v.\\a.\\s.(\\n.(\\a.(\\w.\\u.(\\x.w) u ((\\a.V) (\\s.o)) n) ((\\m.(\\a.h) (\\h.y)) (d (M s)) (\\l.\\t.\\g.(\\z.\\i.c) p))) (\\z.\\f.\\y.\\c.\\o.(\\y.x h (\\c.k)) m ((\\t.\\y.\\k.B) (l p a)) (\\j.\\m.C (\\l.s W (\\d.U) (\\k.L))))) (\\p.e ((\\i.(\\x.\\t.\\l.H p (W S)) (z L)) (L (\\w.c))))) (\\y.\\l.\\s.g))",
      "\\m.I (H t (\\w.x) w (l) q (\\c.\\q.\\h.\\w.\\s.u (\\n.X)) (\\y.\\l.\\s.g))"
    );
  }

  @Test
  public final void test377() {
    reducesTo(
      "\\m.(\\s.o (\\k.b)) (N ((\\w.h) ((\\n.(\\o.C) (\\i.c) (\\v.\\e.\\q.T)) (\\v.E (j z) (X E (K i))))) (b s) w) (j u)",
      "\\m.o (\\k.b) (j u)"
    );
  }

  @Test
  public final void test378() {
    reducesTo(
      "\\p.(\\g.\\u.\\t.\\m.(\\v.q) c) (s r (\\g.c)) L",
      "\\p.\\t.\\m.q"
    );
  }

  @Test
  public final void test379() {
    reducesTo(
      "\\i.\\u.\\t.m",
      "\\i.\\u.\\t.m"
    );
  }

  @Test
  public final void test380() {
    reducesTo(
      "\\n.b",
      "\\n.b"
    );
  }

  @Test
  public final void test381() {
    reducesTo(
      "\\h.z",
      "\\h.z"
    );
  }

  @Test
  public final void test382() {
    reducesTo(
      "\\m.(\\c.\\c.(\\m.m) (\\l.(\\x.(\\m.e) X) (\\j.\\l.u)) ((\\j.(\\p.A) ((\\j.E) (l c))) (V (N (\\t.f))) (\\v.q)) (j (\\p.X (\\g.o E (\\f.s)) B ((\\b.X c x H) h))) ((\\i.\\h.D) k (\\d.\\k.(\\o.(\\u.k (\\o.\\w.\\y.(\\s.d) (\\k.B))) (\\y.(\\s.(\\q.R) ((\\i.P) p)) (\\c.g))) (\\c.\\j.(\\o.(\\p.\\x.\\y.\\t.\\g.f) (n g (\\v.s) (\\s.T))) (\\o.U))))) ((\\y.r) d ((\\k.F) u)) ((\\a.\\u.B (\\i.Y)) j ((\\a.\\g.\\f.(\\g.\\g.\\y.\\v.\\x.g (g (\\l.b (\\p.d i)) (S (\\y.I)))) A) y))",
      "\\m.e (j (\\p.X (\\g.o E (\\f.s)) B (X (B (\\i.Y)) x H))) (D)"
    );
  }

  @Test
  public final void test383() {
    reducesTo(
      "(\\u.H) k",
      "H"
    );
  }

  @Test
  public final void test384() {
    reducesTo(
      "\\k.\\p.\\g.B (\\d.H)",
      "\\k.\\p.\\g.B (\\d.H)"
    );
  }

  @Test
  public final void test385() {
    reducesTo(
      "\\s.(\\s.w) ((\\d.\\h.\\b.\\r.\\j.a) c)",
      "\\s.w"
    );
  }

  @Test
  public final void test386() {
    reducesTo(
      "\\y.Q (\\x.\\i.N)",
      "\\y.Q (\\x.\\i.N)"
    );
  }

  @Test
  public final void test387() {
    reducesTo(
      "\\i.o (\\a.L)",
      "\\i.o (\\a.L)"
    );
  }

  @Test
  public final void test388() {
    reducesTo(
      "(\\h.U (R (\\v.\\j.y) (\\k.\\o.\\m.\\l.H)) (\\o.\\b.g (s (b (\\t.V r (Y D) m))) (\\s.\\t.R)) H) ((\\b.\\d.\\v.U) (\\f.W) (\\f.\\k.\\p.\\h.(\\v.n (\\j.\\u.(\\q.\\g.m) ((\\x.C (Q X) (\\e.\\q.J)) (\\v.\\e.m)))) (q (\\c.\\u.Q))) ((\\a.(\\y.\\w.k) ((\\d.p) (\\a.(\\w.a) (A d) (\\r.V) ((\\e.y) (f e) f)))) (\\p.\\h.\\z.x u ((\\u.(\\k.x) y (\\t.g z (\\y.a) (x y (\\f.K)))) (\\q.k H (\\d.\\a.d)))) (\\e.k)))",
      "U (R (\\v.\\j.y) (\\k.\\o.\\m.\\l.H)) (\\o.\\b.g (s (b (\\t.V r (Y D) m))) (\\s.\\t.R)) H"
    );
  }

  @Test
  public final void test389() {
    reducesTo(
      "(\\j.(\\j.(\\e.L) ((\\r.\\w.\\q.\\e.(\\x.\\y.\\d.\\f.M) T ((\\k.\\q.(\\m.r) (x f) (e c l) ((\\q.t) (a y) (O c X))) (\\e.(\\j.e) g))) (g ((\\h.b) w (\\q.\\j.\\h.z) (r o (\\o.Z) (J D x))) (\\n.\\a.(\\v.\\l.\\r.N (\\o.f) (\\k.j M) (\\y.\\z.p)) n)))) s) (l (\\o.(\\b.(\\x.M (\\f.\\z.E c) (\\c.k)) (\\l.\\q.\\b.(\\c.\\j.j c) M (\\n.(\\t.L) (r q) (\\k.e q)))) (\\c.\\p.S (W h)) s (\\c.g)))",
      "L"
    );
  }

  @Test
  public final void test390() {
    reducesTo(
      "\\z.s",
      "\\z.s"
    );
  }

  @Test
  public final void test391() {
    reducesTo(
      "\\y.\\s.(\\n.\\f.\\y.p (d (m ((\\q.\\l.b (\\k.(\\p.d) (\\i.J) (\\i.\\b.i))) (\\s.h)))) ((\\r.(\\h.k (h ((\\c.n) (\\g.f)))) w) (n r) ((\\b.(\\y.\\h.\\h.n) (u L (\\t.g)) (\\c.x q)) (\\v.\\r.(\\v.\\n.\\o.\\j.K) m) (\\g.\\a.\\s.V)) (\\s.o))) (\\b.H)",
      "\\y.\\s.\\f.\\y.p (d (m (\\l.b (\\k.d (\\i.\\b.i))))) (k (w (\\b.H)) (\\b.H) (\\s.o))"
    );
  }

  @Test
  public final void test392() {
    reducesTo(
      "\\n.(\\t.\\l.n) ((\\c.\\r.(\\x.(\\i.c J) (t ((\\k.\\u.e) (\\a.\\s.S (j B) (\\z.\\d.y)) ((\\q.q) ((\\n.i) (\\j.Z) ((\\q.w) (\\l.a))))))) (\\a.j)) (\\q.t))",
      "\\n.\\l.n"
    );
  }

  @Test
  public final void test393() {
    reducesTo(
      "\\p.\\k.(\\k.q) k",
      "\\p.\\k.q"
    );
  }

  @Test
  public final void test394() {
    reducesTo(
      "(\\t.(\\f.\\z.b (\\c.\\a.\\h.(\\u.(\\a.u) c) ((\\q.e) (\\i.d) (\\g.\\c.\\o.\\g.n) Z))) ((\\g.(\\j.f (\\w.\\o.(\\c.K c (\\d.n)) (\\k.(\\o.j) (\\y.g)) (x H (\\g.\\p.\\e.g)))) (g (H k))) (b (\\n.\\s.\\s.w) (\\m.(\\w.(\\p.f) (V e) (\\f.T I s)) V) (\\u.(\\g.\\r.d) (o q (\\z.r)))) ((\\i.x (\\q.b)) w ((\\c.(\\s.m) (t p)) (\\c.(\\n.M) (\\l.r))) (j (\\a.c (w c)) (H ((\\a.s) (Z L)))) (j (K t)) ((\\x.e c (\\c.r) z ((\\g.d (o m)) (P (E e)))) x ((\\e.\\p.\\j.D) (\\y.(\\n.p W (\\e.d) (\\a.q)) (\\w.e (\\k.g (v j))))))))) (R ((\\p.u) (\\d.\\m.\\g.(\\q.r (\\n.\\x.(\\j.L) ((\\c.C) (\\p.v)) Q (\\h.b (\\x.c)))) k)))",
      "\\z.b (\\c.\\a.\\h.e (\\g.\\c.\\o.\\g.n) Z)"
    );
  }

  @Test
  public final void test395() {
    reducesTo(
      "\\j.\\s.c",
      "\\j.\\s.c"
    );
  }

  @Test
  public final void test396() {
    reducesTo(
      "\\g.(\\g.h) ((\\n.\\j.\\a.\\w.\\o.E) (\\u.\\t.\\o.\\q.m)) (\\w.(\\y.o t n j (\\a.\\b.N) (\\x.F (W (Q (N t)) ((\\j.v) ((\\c.p) (\\d.g))) (\\a.\\v.q (A (\\l.\\j.c Z)))))) (v (b (\\n.(\\f.V) (C O) U i (\\h.(\\n.S w i ((\\y.v) (\\z.H))) (\\b.\\x.\\g.\\f.p)))))) (\\e.(\\e.g) ((\\p.\\b.\\w.(\\y.(\\c.x) (x t) (\\l.\\h.\\u.p) C (E x (\\d.H) I ((\\p.u) (\\b.\\q.\\q.I)))) y) ((\\s.b) ((\\h.\\o.\\i.\\n.v) z)) L))",
      "\\g.h (\\w.o t n j (\\a.\\b.N) (\\x.F (W (Q (N t)) (v) (\\a.\\v.q (A (\\l.\\j.c Z)))))) (\\e.g)"
    );
  }

  @Test
  public final void test397() {
    reducesTo(
      "\\k.\\t.\\f.S (\\q.d) ((\\p.m) (\\h.\\b.h (\\e.\\h.(\\a.\\x.c) (\\j.e))) (\\b.\\x.\\g.y (\\b.n (\\e.(\\r.q ((\\e.\\n.W) (\\s.M U (B E)))) ((\\x.e) q ((\\w.(\\g.t) (a p)) B)) (\\j.c (\\x.c (\\z.f) w) (\\z.(\\y.\\i.(\\j.h) k) h))))))",
      "\\k.\\t.\\f.S (\\q.d) (m (\\b.\\x.\\g.y (\\b.n (\\e.q (\\n.W) (\\j.c (\\x.c (\\z.f) w) (\\z.\\i.h))))))"
    );
  }

  @Test
  public final void test398() {
    reducesTo(
      "\\n.b",
      "\\n.b"
    );
  }

  @Test
  public final void test399() {
    reducesTo(
      "R (\\w.(\\i.c) b) r",
      "R (\\w.c) r"
    );
  }

  @Test
  public final void test400() {
    reducesTo(
      "\\x.(\\e.t) (\\m.\\f.i z (\\h.(\\v.\\v.x) f) (\\v.\\b.\\n.g ((\\n.e) (\\e.b)) (\\f.r)))",
      "\\x.t"
    );
  }

  @Test
  public final void test401() {
    reducesTo(
      "\\f.\\m.\\d.(\\d.I) ((\\p.\\l.J C (\\q.(\\j.(\\g.(\\h.\\c.C) (T (n D))) (\\t.(\\o.\\q.n) (\\k.T))) (\\n.\\y.\\r.x (\\o.N (u R) (s w a)))) ((\\p.\\t.(\\f.y F y o) (a m) (\\g.c)) (o (T C q (\\x.\\d.\\i.C)) (\\a.\\u.(\\v.\\k.\\u.Q) f ((\\l.u) f))))) (\\a.\\o.s)) a",
      "\\f.\\m.\\d.I a"
    );
  }

  @Test
  public final void test402() {
    reducesTo(
      "\\r.a",
      "\\r.a"
    );
  }

  @Test
  public final void test403() {
    reducesTo(
      "\\n.s (\\b.N)",
      "\\n.s (\\b.N)"
    );
  }

  @Test
  public final void test404() {
    reducesTo(
      "f ((\\v.\\l.\\i.X O (\\y.v)) (e q m (\\n.(\\q.z (\\k.\\n.o) (\\o.y i) (\\p.(\\k.\\e.\\m.\\k.\\d.\\x.M H c) (\\z.c))) (T (t ((\\i.\\d.\\n.(\\n.\\e.N) (\\w.\\c.o)) t))))))",
      "f (\\l.\\i1.X O (\\y2.e q m (\\n.z (\\k.\\n.o) (\\o.y i) (\\p.\\e.\\m.\\k.\\d.\\x.M H c))))"
    );
  }

  @Test
  public final void test405() {
    reducesTo(
      "W (O (\\c.\\k.\\x.\\y.\\k.\\l.l) (\\l.d (\\g.\\u.\\m.i) (\\q.N) (h x) (k (\\c.K (\\d.m S) ((\\k.(\\d.F) k) n)))) ((\\m.\\v.\\q.N (\\h.N)) (\\g.\\k.\\k.\\o.r) (\\w.\\u.i c D) ((\\u.\\g.\\x.\\k.m) (\\s.\\b.\\e.\\z.\\b.u) (\\t.(\\n.k x F) (\\i.E) (z R c (\\i.\\x.\\z.h)) ((\\k.z) A ((\\g.x) (O R)) (N (\\q.\\c.d p))))))) I",
      "W (O (\\c.\\k.\\x.\\y.\\k.\\l.l) (\\l.d (\\g.\\u.\\m.i) (\\q.N) (h x) (k (\\c.K (\\d.m S) (F)))) (N (\\h.N))) I"
    );
  }

  @Test
  public final void test406() {
    reducesTo(
      "\\b.(\\x.E (\\p.x)) (\\g.(\\b.z) (\\m.(\\d.z) (\\a.\\v.s)) (\\t.(\\i.i ((\\k.i) w (\\b.\\w.\\w.e h (\\t.w) r) (\\e.q))) (w (G (R ((\\o.J) (\\d.r) ((\\k.v) P)))))) (\\e.(\\y.\\c.y q) q))",
      "\\b.E (\\p.\\g.z (\\t.w (G (R (J (v)))) (w (G (R (J (v)))) (\\b.\\w.\\w.e h (\\t.w) r) (\\e.q))) (\\e.\\c.q q))"
    );
  }

  @Test
  public final void test407() {
    reducesTo(
      "\\z.F",
      "\\z.F"
    );
  }

  @Test
  public final void test408() {
    reducesTo(
      "(\\r.O) ((\\u.(\\g.g ((\\j.Q) (w W) (d (\\p.f)) ((\\a.O (\\e.s)) (\\i.\\z.a)))) (Z (p r (\\k.s)) (M (\\l.q)) (\\u.\\t.M)) (v (y (\\p.(\\q.(\\f.k) (r H)) (\\c.\\u.k x) (\\k.f ((\\r.U) (\\o.t)))))) h) ((\\a.\\v.o) (\\h.\\l.p A (\\s.\\l.(\\o.\\s.\\u.\\m.g) (\\y.W) (G ((\\w.D) (d G)) (\\d.(\\o.(\\b.p) (\\n.j)) (\\j.u))) (q (\\x.u))))))",
      "O"
    );
  }

  @Test
  public final void test409() {
    reducesTo(
      "\\h.(\\t.(\\d.\\m.\\v.(\\s.S) ((\\y.\\y.(\\b.X (\\x.\\i.\\l.e) (\\o.\\j.o (\\i.b w))) (\\d.\\f.B)) n)) ((\\s.a) ((\\g.\\v.e (\\v.\\v.r) q) (O (\\i.p u (l J)) (m (\\q.z) (\\i.z)) (\\t.(\\c.h (R a)) (\\v.Y) ((\\e.w) (d h) (\\q.w l (r A)))))))) ((\\k.T) v (\\v.\\s.g ((\\k.\\x.(\\u.\\r.N) t) (E ((\\y.P) (\\w.T))) (S (E (i c) (p a (\\x.a))))) (R (\\x.(\\v.M) ((\\d.M) ((\\t.\\s.\\j.a) (g H R))))))) N",
      "\\h.\\v.S"
    );
  }

  @Test
  public final void test410() {
    reducesTo(
      "P (j ((\\j.\\z.\\f.u) (s (\\t.d G q ((\\w.z) W)) (\\c.S) ((\\j.(\\a.\\a.k) (\\a.w t (\\x.l) (\\p.\\h.E))) (Z (\\e.(\\j.B) H) Q)))) (\\r.\\s.e))",
      "P (j (\\z.\\f.u) (\\r.\\s.e))"
    );
  }

  @Test
  public final void test411() {
    reducesTo(
      "\\j.O",
      "\\j.O"
    );
  }

  @Test
  public final void test412() {
    reducesTo(
      "(\\z.n) ((\\t.e) ((\\u.M) w)) ((\\g.d) ((\\t.E) ((\\k.P) n)) (\\z.\\e.u) (\\k.(\\n.L) (\\q.\\u.\\t.\\p.d (\\t.\\v.J C ((\\c.(\\t.r) (x u)) (k A (H b))) a)) ((\\u.\\x.a) (O (\\y.\\y.\\z.\\c.(\\q.l) (\\e.A))) S ((\\z.(\\s.f ((\\w.s) (j e))) (T (\\w.(\\v.b) f)) (\\y.\\x.(\\t.\\t.\\m.j L (\\s.p)) (\\m.\\g.o))) (\\r.P)))))",
      "n (d (\\z.\\e.u) (\\k.L (a (f (T (\\w.b)) (\\y.\\x.\\t.\\m.j L (\\s.p))))))"
    );
  }

  @Test
  public final void test413() {
    reducesTo(
      "(\\v.P) f",
      "P"
    );
  }

  @Test
  public final void test414() {
    reducesTo(
      "\\l.\\n.(\\p.V) ((\\c.(\\i.a (\\z.G (D x))) p) (\\t.\\d.Q (\\k.O (\\u.A) (\\i.\\q.B)))) (T (\\r.\\v.s) (\\z.\\d.(\\n.\\t.c) s t)) (\\b.(\\d.\\p.N f) (\\d.(\\w.\\b.\\w.\\h.K) ((\\h.\\n.w) (p c (j t) (x y (\\l.o))) (\\t.\\e.Y c (\\e.b))))) (\\n.f) q",
      "\\l.\\n.V (T (\\r.\\v.s) (\\z.\\d.c)) (\\b.\\p.N f) (\\n.f) q"
    );
  }

  @Test
  public final void test415() {
    reducesTo(
      "(\\i.(\\k.\\b.\\s.o e) (\\y.(\\x.\\f.n) ((\\m.\\i.\\v.D) Y))) c",
      "\\b.\\s.o e"
    );
  }

  @Test
  public final void test416() {
    reducesTo(
      "\\y.(\\w.\\c.\\d.d (\\t.(\\u.l) (\\b.x) ((\\i.(\\i.(\\m.G) (\\x.v ((\\p.n) (\\l.p) (\\u.t (\\m.V))))) (\\g.(\\a.l) (\\p.V) (\\r.(\\a.m) L) (\\e.v) ((\\p.m l (\\y.i)) S y))) (\\o.s ((\\f.(\\r.\\l.z) (\\i.\\y.(\\e.\\o.h) (e (L P)))) (\\n.\\b.A (\\o.\\g.(\\w.g) l l))))))) ((\\g.k) (\\b.\\x.\\b.\\w.\\v.T ((\\s.\\j.h) (i n k ((\\q.u) (\\t.u)) (S (g q (\\i.e)))) (x ((\\j.w) ((\\w.\\m.\\o.O) (\\u.s (r B))))))) ((\\i.\\z.l (\\a.\\k.\\h.\\l.(\\g.\\y.Z) (\\y.(\\d.\\s.\\p.x) (\\b.\\s.K a) r))) k ((\\b.y i (\\g.\\o.Y)) (\\r.\\b.\\w.\\l.\\o.(\\m.i) (\\p.r p (\\y.i) (U N (\\z.w)) (\\b.X) (\\s.m (U m) (B K (\\m.r)) (c (\\l.i))))))))",
      "\\y.\\c.\\d.d (\\t.l (G))"
    );
  }

  @Test
  public final void test417() {
    reducesTo(
      "(\\n.P) (\\r.m)",
      "P"
    );
  }

  @Test
  public final void test418() {
    reducesTo(
      "\\d.(\\m.(\\m.M) (\\w.(\\a.(\\t.l) ((\\s.U) ((\\a.e q o) (\\z.L)))) b) (\\t.(\\h.\\x.t) (d (\\v.a (\\a.m) y q)))) Y (\\s.\\j.l)",
      "\\d.M (\\t.\\x.t) (\\s.\\j.l)"
    );
  }

  @Test
  public final void test419() {
    reducesTo(
      "(\\d.\\k.\\y.(\\r.(\\r.(\\l.x) ((\\e.\\x.i) m)) (\\f.\\b.p (\\n.v (\\s.c)))) j (m (\\n.o) (\\k.(\\x.e (r (R (\\o.p)))) ((\\a.x) (\\y.b) ((\\f.Z) (\\r.P)) Z) ((\\h.w) v))) (\\q.U)) ((\\r.(\\u.Q) y ((\\p.\\h.\\j.\\w.J M) (L (J I) (t E) (\\w.N) (\\w.\\l.\\t.\\n.(\\w.p) (\\d.d)))) (\\j.\\b.\\f.s)) (\\r.(\\u.(\\w.K) ((\\r.z J) (\\o.(\\x.d (D (k s) (\\n.(\\d.i) (p Z)))) (k (\\b.(\\p.R) (\\s.o)) (R (u p (\\z.c))))))) (d ((\\a.A) (\\y.(\\b.x g ((\\x.G (l n)) (\\c.q j (p g)))) (\\a.z (S u (\\f.Y) (\\l.k))))))))",
      "\\k.\\y.x (m (\\n.o) (\\k.e (r (R (\\o.p))) (w))) (\\q.U)"
    );
  }

  @Test
  public final void test420() {
    reducesTo(
      "\\t.\\y.\\e.\\g.u",
      "\\t.\\y.\\e.\\g.u"
    );
  }

  @Test
  public final void test421() {
    reducesTo(
      "\\p.U",
      "\\p.U"
    );
  }

  @Test
  public final void test422() {
    reducesTo(
      "\\z.y",
      "\\z.y"
    );
  }

  @Test
  public final void test423() {
    reducesTo(
      "\\b.V",
      "\\b.V"
    );
  }

  @Test
  public final void test424() {
    reducesTo(
      "\\o.\\e.\\o.s",
      "\\o.\\e.\\o.s"
    );
  }

  @Test
  public final void test425() {
    reducesTo(
      "C ((\\i.l (\\x.T (I (\\o.p) (\\j.(\\v.w) y ((\\e.u) (\\r.\\d.W V)))) (b (\\r.\\w.(\\p.u r) ((\\x.b) (I y) (G (C y)) (v (\\v.b (\\g.Q)))))))) (q ((\\j.H) ((\\n.\\e.(\\m.v E (\\j.P) x) d ((\\m.\\w.\\h.K) (p N (\\e.B) (\\x.m (\\r.f))))) (\\q.l)))))",
      "C (l (\\x.T (I (\\o.p) (\\j.w (u))) (b (\\r.\\w.u r))))"
    );
  }

  @Test
  public final void test426() {
    reducesTo(
      "\\s.Z S",
      "\\s.Z S"
    );
  }

  @Test
  public final void test427() {
    reducesTo(
      "\\u.V ((\\o.(\\w.(\\q.y) (\\f.(\\l.z) (\\v.Q (\\w.f ((\\n.N) m)))) c) (w (\\g.(\\v.K) y (\\i.\\w.t (j f) (m (\\w.X)) U) (\\l.\\z.\\y.\\w.(\\i.(\\h.\\q.l) t) x (\\l.\\t.v))))) (\\z.I c c r))",
      "\\u.V (y c)"
    );
  }

  @Test
  public final void test428() {
    reducesTo(
      "\\p.\\d.b",
      "\\p.\\d.b"
    );
  }

  @Test
  public final void test429() {
    reducesTo(
      "\\o.\\m.\\j.G",
      "\\o.\\m.\\j.G"
    );
  }

  @Test
  public final void test430() {
    reducesTo(
      "\\e.\\b.(\\x.(\\c.\\q.\\w.\\p.\\s.(\\r.\\s.\\f.Q) ((\\t.r) (I f) x D g) ((\\f.b) E (g (w W) y (\\w.q T (\\e.r) (\\y.c)) x)) (t ((\\q.z) (\\j.(\\k.\\b.(\\c.N) (\\f.T) o) (L l p ((\\v.A) (j i)))) (\\e.\\n.\\n.J)))) (\\s.N)) g",
      "\\e.\\b.\\q.\\w.\\p.\\s.Q"
    );
  }

  @Test
  public final void test431() {
    reducesTo(
      "(\\x.(\\l.\\t.\\b.p (\\g.(\\a.\\k.(\\u.g) (\\e.\\o.G (y (\\w.(\\z.v) (\\h.U)) (\\v.\\k.\\d.j)))) (\\r.\\d.\\y.C (\\y.(\\i.c) b ((\\i.g) ((\\n.\\n.Y w) H)))))) v) (\\g.M (A (u t (\\c.\\h.F m) (\\b.m (\\d.v)))) (\\c.(\\l.K (\\o.(\\v.\\k.x k) (b r (\\w.h))) h) (\\v.\\w.(\\c.y T (\\d.y) (\\v.(\\d.e) (K N)) ((\\a.u) j (\\k.\\n.w))) (t ((\\u.(\\s.F) (l P)) (R b (\\b.e)))))) ((\\q.(\\y.C b (\\w.q)) (\\c.\\v.\\s.g) (\\b.H P (f F) (v (j s))) (\\o.(\\v.d) (\\h.\\b.\\m.h (w g) (y u)))) ((\\r.\\t.(\\q.(\\m.j Y) M) (h (\\m.g))) (\\w.X)) (Q ((\\j.i) (\\c.e) (\\u.\\v.k e) ((\\l.(\\g.z) (f m)) (\\b.k I P))) (\\g.u))) (\\o.\\x.J ((\\e.g) (\\x.q) ((\\b.(\\h.\\e.\\w.P v Y G) (\\f.m)) (\\v.(\\b.\\i.(\\i.\\r.J) t) (\\i.\\v.U)) (\\a.\\x.T)))))",
      "\\t.\\b.p (\\g.\\k.g)"
    );
  }

  @Test
  public final void test432() {
    reducesTo(
      "i ((\\v.\\v.(\\b.j) (\\h.\\k.D) b K) ((\\c.Y) ((\\p.\\g.f) ((\\k.e) K (\\s.\\y.\\c.R) (\\v.G)))) (a (\\m.z)) (i (r ((\\l.\\h.\\w.\\r.\\s.u) ((\\o.\\a.\\p.T) (\\j.(\\u.p) (v v))) c (\\n.t)))))",
      "i (j b K (i (r (\\r.\\s.u))))"
    );
  }

  @Test
  public final void test433() {
    reducesTo(
      "W I ((\\y.b) (\\f.(\\s.\\v.\\x.\\i.\\l.\\i.(\\c.Y) (\\g.q v) B) ((\\e.o x q (\\z.(\\s.y) (F m))) (\\x.\\f.b)) (s (i n)) (\\u.Q (\\d.o (p (h l))) (\\z.l) c))) (q (\\p.\\l.\\v.\\n.(\\e.P (\\m.n g (\\g.y) (\\o.\\w.e H)) (b b I e ((\\u.j (\\v.q)) h))) (\\i.(\\q.w) ((\\n.\\o.a) (\\c.(\\o.\\t.m q) (\\e.z))))) (v ((\\e.Q q (\\u.t) ((\\l.q) (\\y.d))) (\\z.Q (x r (\\t.j))) u) (q ((\\l.\\y.\\c.I) u w))) (\\x.z E b f))",
      "W I (b) (q (\\p.\\l.\\v.\\n.P (\\m1.n g (\\g.y) (\\o.\\w2.w)) (b b I (\\i.w) (j (\\v.q)))) (v (Q q (\\u.t) (q) u) (q (\\c.I))) (\\x.z E b f))"
    );
  }

  @Test
  public final void test434() {
    reducesTo(
      "(\\s.Q (\\i.g)) (\\t.(\\n.\\c.m) (\\j.W)) F",
      "Q (\\i.g) F"
    );
  }

  @Test
  public final void test435() {
    reducesTo(
      "\\t.u ((\\n.k) (\\w.\\m.\\m.Q (\\f.(\\x.s ((\\i.i) e)) (\\w.n (\\a.\\j.\\r.\\z.\\x.\\z.\\f.p) (i o ((\\u.(\\d.K) (\\i.q)) (t (M k))))) l)))",
      "\\t.u (k)"
    );
  }

  @Test
  public final void test436() {
    reducesTo(
      "\\m.(\\e.(\\e.C) ((\\i.\\m.\\p.(\\w.(\\v.\\i.e) (\\t.\\v.f)) (q (V m (S q)) (G ((\\e.m) (T u))) (\\l.\\l.a)) (\\x.a)) ((\\t.(\\b.t) (\\c.\\o.\\n.g) ((\\h.\\a.\\i.\\z.q) ((\\g.n) ((\\t.v) (b A))) (a (\\l.\\x.\\x.g)))) (t ((\\j.\\b.\\u.\\q.i) E))))) (\\q.(\\b.\\m.(\\m.a) ((\\g.V i) (x q))) (\\w.C ((\\n.\\n.(\\z.\\c.j) (\\r.t) (\\f.\\x.c)) (\\x.(\\t.a (\\g.r (x O))) (i g)) p (V y ((\\e.\\i.J V ((\\b.L) (\\z.L)) (\\b.\\w.\\d.\\k.\\n.a q)) (\\u.\\e.d))))))",
      "\\m.C"
    );
  }

  @Test
  public final void test437() {
    reducesTo(
      "(\\u.X) m",
      "X"
    );
  }

  @Test
  public final void test438() {
    reducesTo(
      "\\k.\\w.b",
      "\\k.\\w.b"
    );
  }

  @Test
  public final void test439() {
    reducesTo(
      "\\p.\\j.(\\h.i) ((\\y.(\\t.\\m.F) (s (U s (\\c.d) ((\\j.H) (o K))) (\\a.(\\e.\\a.\\t.\\s.(\\n.k) (\\c.M)) ((\\h.t E (l h)) (y (\\e.b)))) ((\\j.\\y.\\c.z) (j x ((\\n.\\l.\\p.o) (\\f.\\a.Q o)))))) (m Y)) (\\i.\\t.\\b.\\e.\\b.(\\a.(\\p.\\m.\\g.k ((\\v.L (\\s.\\d.C c)) (O (\\j.\\v.a z)) (h (\\w.\\c.\\s.(\\y.\\b.x) (\\f.p))))) (\\e.(\\k.q) c) (\\t.v)) l)",
      "\\p.\\j.i (\\i.\\t.\\b.\\e.\\b.\\g.k (L (\\s.\\d.C c) (h (\\w.\\c1.\\s.\\b.x))))"
    );
  }

  @Test
  public final void test440() {
    reducesTo(
      "(\\q.U) (\\b.\\z.b) ((\\h.\\l.e (X (W (F H (n E) z (\\t.N h Z))))) ((\\c.j) ((\\h.F E (\\x.j)) (G v w) (z (\\l.h)) z (\\w.(\\j.\\i.H) ((\\p.\\c.(\\w.\\q.i) Z) (\\c.B (\\v.O) (\\c.\\m.J g)))))) (d (\\m.\\v.E)))",
      "U (e (X (W (F H (n E) z (\\t.N (j) Z)))))"
    );
  }

  @Test
  public final void test441() {
    reducesTo(
      "(\\m.\\f.i) (\\q.\\q.Q)",
      "\\f.i"
    );
  }

  @Test
  public final void test442() {
    reducesTo(
      "\\v.\\t.z",
      "\\v.\\t.z"
    );
  }

  @Test
  public final void test443() {
    reducesTo(
      "\\d.\\b.\\q.\\g.(\\r.\\h.B (\\e.\\l.M) ((\\e.J) t) a) b",
      "\\d.\\b.\\q.\\g.\\h.B (\\e.\\l.M) (J) a"
    );
  }

  @Test
  public final void test444() {
    reducesTo(
      "\\q.\\e.(\\k.\\t.\\h.I (l (\\a.(\\j.\\z.p) C)) (v ((\\z.(\\g.A B c) ((\\o.a) (\\v.(\\n.q) (\\z.u)))) S ((\\j.x (\\x.h) (\\m.d c (t s)) K) G))) (\\u.\\o.(\\y.D) (\\w.(\\w.z) k (\\l.\\a.\\z.x)))) c",
      "\\q.\\e.\\t.\\h.I (l (\\a.\\z.p)) (v (A B c (x (\\x.h) (\\m.d c (t s)) K))) (\\u.\\o.D)"
    );
  }

  @Test
  public final void test445() {
    reducesTo(
      "a (\\x.F) (\\p.(\\k.W) (\\l.c))",
      "a (\\x.F) (\\p.W)"
    );
  }

  @Test
  public final void test446() {
    reducesTo(
      "(\\p.y) E",
      "y"
    );
  }

  @Test
  public final void test447() {
    reducesTo(
      "(\\l.\\t.\\p.\\a.\\m.(\\u.(\\j.R) (\\t.m)) p ((\\o.l g) u)) (\\f.I)",
      "\\t.\\p.\\a.\\m.R (I)"
    );
  }

  @Test
  public final void test448() {
    reducesTo(
      "\\b.(\\j.(\\m.(\\f.\\e.i ((\\q.b) ((\\s.n) (n v)))) (k l) (x T)) Y ((\\f.N) (\\f.(\\z.\\a.(\\g.\\h.h) (w M (\\r.k u (B a))) t) (\\c.(\\a.\\p.(\\o.\\o.\\e.m u T) (\\z.(\\j.\\d.s) ((\\c.X) (w n)))) (\\q.i (N x) (h k) f)))) (\\k.W)) w",
      "\\b.i (b) (N) (\\k.W)"
    );
  }

  @Test
  public final void test449() {
    reducesTo(
      "(\\x.\\r.n) ((\\y.b) x)",
      "\\r.n"
    );
  }

  @Test
  public final void test450() {
    reducesTo(
      "\\n.z",
      "\\n.z"
    );
  }

  @Test
  public final void test451() {
    reducesTo(
      "\\q.n ((\\k.\\o.\\g.Z) (\\t.(\\d.(\\l.\\q.c) (\\c.(\\f.(\\i.r) (i R)) (z q (\\q.g)) (\\l.(\\u.\\c.u x) n))) ((\\z.\\h.x) a ((\\h.\\j.\\u.H) (\\u.Z (\\f.c (\\x.p))))) (\\v.e) ((\\s.(\\n.\\l.y) k) (g (\\h.I (a M u))) J ((\\j.(\\c.(\\g.(\\y.h) z) (r (l k))) (\\r.\\x.(\\m.\\r.V) K) A) (\\s.\\b.\\l.\\b.\\k.h u)))))",
      "\\q.n (\\o.\\g.Z)"
    );
  }

  @Test
  public final void test452() {
    reducesTo(
      "\\j.u",
      "\\j.u"
    );
  }

  @Test
  public final void test453() {
    reducesTo(
      "v (f ((\\i.x) ((\\d.P W d (\\p.j t (\\e.m))) (\\v.e)) (b (\\a.(\\n.z) (g G) ((\\q.k) (\\d.w)) (L e)))) ((\\a.\\i.Z) (\\b.\\s.y) ((\\s.(\\c.\\t.(\\d.\\f.\\b.(\\n.e) w) ((\\v.\\f.i e) g)) (m o (f w) (\\l.\\a.\\r.k) (\\z.(\\f.D (Q h)) (k R (y a))))) (N (\\q.\\j.\\j.(\\r.f (q u)) (\\m.c) (\\x.(\\n.\\q.e) (\\n.i W)))))) n)",
      "v (f (x (b (\\a.z (k) (L e)))) (Z) n)"
    );
  }

  @Test
  public final void test454() {
    reducesTo(
      "j A (\\j.R (\\i.(\\m.\\g.p) (b (\\e.\\o.H (e l) (\\i.\\x.E)) N (\\l.\\d.\\d.\\v.I)))) ((\\p.(\\p.i m m) (\\g.\\h.n)) (\\o.q))",
      "j A (\\j.R (\\i.\\g.p)) (i m m)"
    );
  }

  @Test
  public final void test455() {
    reducesTo(
      "l (\\x.X)",
      "l (\\x.X)"
    );
  }

  @Test
  public final void test456() {
    reducesTo(
      "\\u.\\a.m",
      "\\u.\\a.m"
    );
  }

  @Test
  public final void test457() {
    reducesTo(
      "W ((\\y.\\k.\\x.\\c.\\g.\\t.\\q.\\k.\\j.b) w) (\\j.\\b.\\m.d c (\\l.\\s.t))",
      "W (\\k.\\x.\\c.\\g.\\t.\\q.\\k.\\j.b) (\\j.\\b.\\m.d c (\\l.\\s.t))"
    );
  }

  @Test
  public final void test458() {
    reducesTo(
      "\\k.s l (\\n.t)",
      "\\k.s l (\\n.t)"
    );
  }

  @Test
  public final void test459() {
    reducesTo(
      "(\\p.(\\t.(\\p.(\\c.n K (\\q.h)) (\\z.\\q.K w) (\\g.s G Z e)) (\\w.y)) (D (\\a.(\\w.C) (j n) (j J)) (\\z.e)) (\\h.(\\f.h) (\\a.\\k.\\s.\\s.K l ((\\s.\\o.J) (c w (\\u.y)))) u) (\\m.\\i.w (n q)) ((\\t.U (\\m.y (\\i.w q) (\\b.\\i.\\w.(\\c.c (\\q.\\i.\\o.s) ((\\x.w) m j)) (o (r d) (\\n.\\b.U q) n)))) (n (\\o.t)))) (\\e.\\n.m)",
      "n K (\\q.h) (\\g.s G Z e) (\\h.h u) (\\m.\\i.w (n q)) (U (\\m.y (\\i.w q) (\\b.\\i.\\w.o (r d) (\\n.\\b.U q) n (\\q.\\i.\\o.s) (w j))))"
    );
  }

  @Test
  public final void test460() {
    reducesTo(
      "(\\e.c) (\\x.(\\m.(\\w.v p) z) ((\\c.\\x.\\e.J) (r B (i W)) (k P y Q) (\\p.\\b.U p)) t ((\\z.R (\\l.(\\z.\\i.N) (\\l.\\b.v)) (z m (\\r.h (\\f.(\\u.j h E) (Y (\\b.i)))))) (\\y.(\\s.f (C B (i g) (j V) (x (\\a.H) ((\\a.v) (L i))))) ((\\u.(\\n.(\\u.F p (f c)) z) (W N e y)) m))) (Y (\\s.\\m.z ((\\l.\\z.a) ((\\p.Y) ((\\e.f v (\\x.m)) (E c (\\c.Q))) (e (\\c.n)))))))",
      "c"
    );
  }

  @Test
  public final void test461() {
    reducesTo(
      "(\\h.\\p.\\m.\\v.j) (w ((\\q.x ((\\m.J F (\\p.A)) (l (\\x.\\z.T (r W) z)))) (q (\\s.(\\u.(\\g.P) (g T) (\\k.e)) (\\u.h U (\\b.n) (R (y h))) (\\e.\\r.\\p.o))) (\\j.d)))",
      "\\p.\\m.\\v.j"
    );
  }

  @Test
  public final void test462() {
    reducesTo(
      "\\x.\\d.(\\m.\\i.\\t.\\i.K) ((\\x.\\s.\\u.o) x ((\\e.(\\m.\\o.(\\x.(\\y.(\\f.\\q.(\\j.\\k.c) (\\u.n)) ((\\t.q) (h s) (M (\\n.s)))) f) (\\u.y u a ((\\g.R) (r v)) f U)) U) (\\e.d)))",
      "\\x.\\d.\\i.\\t.\\i.K"
    );
  }

  @Test
  public final void test463() {
    reducesTo(
      "\\m.\\q.(\\j.(\\j.f ((\\r.(\\r.\\a.\\o.(\\l.S (y U (l k))) w) ((\\v.r) (\\r.w) (x h) (i H l ((\\s.t) (a h))))) (\\a.(\\a.\\y.(\\k.\\x.X (u K n)) (\\l.\\t.T)) (\\o.\\a.\\n.\\y.(\\s.k) ((\\q.w i) (\\b.\\g.Q)))) (\\y.K (\\x.(\\o.(\\x.f) B) (\\t.(\\g.\\g.k) T))))) (r g)) A",
      "\\m.\\q.f (\\o.S (y U (w k)))"
    );
  }

  @Test
  public final void test464() {
    reducesTo(
      "\\o.(\\o.(\\l.(\\l.y ((\\b.(\\w.(\\k.\\x.\\s.k) z) (c (t n (\\c.s)))) (\\g.u))) b) (\\g.Z)) f p",
      "\\o.y (\\x.\\s.z) p"
    );
  }

  @Test
  public final void test465() {
    reducesTo(
      "(\\t.\\g.\\c.\\w.u) ((\\t.(\\m.\\t.\\r.\\i.\\h.(\\i.s c (\\w.l) d) h ((\\x.\\f.\\p.\\v.z p (\\o.n)) (\\f.\\g.\\o.g))) (\\s.Z)) (I ((\\e.\\b.Z) (\\v.q Z (Q T) (\\i.\\y.\\g.i)) F)) (\\x.\\q.\\n.e)) ((\\e.\\o.h j) v (\\o.t (q (\\z.(\\r.\\u.\\a.i) (\\e.\\u.\\d.\\p.(\\o.\\w.\\a.h x (\\f.r)) (\\y.\\x.\\w.b g (\\i.Q)) (\\m.\\y.u))))))",
      "\\c.\\w.u"
    );
  }

  @Test
  public final void test466() {
    reducesTo(
      "j (o ((\\w.Z x (n i) (a (\\u.T)) (\\j.\\o.(\\w.H x) (u (C B)))) (r (\\w.\\h.\\s.\\d.x (\\z.R))) (\\q.\\o.v)) (x (\\y.\\k.\\c.S)) (P ((\\j.(\\u.\\q.\\o.\\z.(\\t.m) ((\\s.\\e.s) ((\\n.F) x))) s ((\\s.\\n.(\\w.Y) ((\\e.t) (\\l.d)) (\\p.\\j.t e k A)) e)) H)))",
      "j (o (Z x (n i) (a (\\u.T)) (\\j.\\o.H x) (\\q.\\o.v)) (x (\\y.\\k.\\c.S)) (P (\\o.\\z.m)))"
    );
  }

  @Test
  public final void test467() {
    reducesTo(
      "\\z.(\\d.\\y.(\\v.c) ((\\j.(\\p.c) ((\\s.c) ((\\j.\\u.w B) (q K (\\d.Y))))) (l (\\q.(\\v.\\o.(\\m.\\h.k) (e F (\\z.y))) z))) (p K)) (\\b.\\m.\\z.Q ((\\o.\\q.(\\w.\\m.A) n) (\\q.(\\b.\\j.E c) (\\j.\\g.F P))) (\\w.x) (\\q.(\\w.\\b.U) (r (i d) s) Q d) ((\\k.(\\z.\\x.\\y.\\a.v A Z) S ((\\y.h) (\\q.\\z.(\\c.E j) (\\i.u)))) (\\y.\\u.\\w.(\\s.\\l.s) ((\\l.(\\u.o) (f Q)) (D (\\e.b))) (\\a.\\c.m)) (P (q ((\\o.\\v.\\t.K) ((\\v.g) (\\w.q))) ((\\m.V) (\\c.X) (\\q.e a (r f)) (\\m.v)))))) s",
      "\\z.c (p K)"
    );
  }

  @Test
  public final void test468() {
    reducesTo(
      "v ((\\h.(\\t.k L) (r ((\\o.(\\u.\\k.(\\c.N) H) ((\\n.j) (Q f) (\\z.(\\k.q) (G r)))) (\\x.\\z.\\n.(\\c.\\s.C) (t e (v e) q)) (\\w.\\f.b)))) (\\u.J))",
      "v (k L)"
    );
  }

  @Test
  public final void test469() {
    reducesTo(
      "(\\e.(\\s.\\r.x) ((\\h.t (\\a.\\a.p ((\\q.B) (i b) (\\i.\\t.U))) o ((\\v.d (\\e.\\z.(\\h.\\p.\\c.\\s.n) ((\\b.p) (\\h.j) ((\\y.o) (\\b.s))))) (n (\\c.\\f.\\e.\\c.V)))) (\\t.\\k.\\t.(\\q.\\u.r) (m ((\\f.T) (A h) (o c (S r))) P (\\k.\\l.\\n.\\u.l v ((\\b.(\\s.M) (s w) (z J (\\d.t))) (\\h.\\j.\\v.s o (\\r.w)))))))) (\\l.(\\n.(\\o.(\\j.\\n.\\i.(\\w.\\l.\\v.(\\u.L) l (\\x.\\w.g q) ((\\e.m V B) (\\s.\\m.\\h.o)) (\\q.(\\w.i (\\q.c w)) (o (\\q.\\x.a k)))) X) ((\\u.\\f.\\g.t) (z z (F z) (o (\\l.H)) Z) (t S (\\w.w) (\\l.\\z.(\\z.a) P x W)))) (\\t.(\\b.\\i.(\\z.\\c.e) K m) p Y)) (\\z.(\\u.z) b q f (\\i.\\x.g) (\\x.\\g.H l Z ((\\f.w U) ((\\b.\\y.\\e.\\n.\\o.h) (\\w.(\\c.P) (\\v.N) j (A (\\h.u b (\\w.q)))))))))",
      "\\r.x"
    );
  }

  @Test
  public final void test470() {
    reducesTo(
      "\\u.t",
      "\\u.t"
    );
  }

  @Test
  public final void test471() {
    reducesTo(
      "t ((\\k.(\\w.\\j.\\u.\\y.(\\n.(\\m.\\i.a) ((\\z.\\o.\\m.c) (\\q.R (m W (d j))))) (\\h.(\\x.(\\h.\\a.I) (e (p p) (g c (\\e.p)))) K) (\\i.\\x.(\\e.E) (v f) (a (J p)) ((\\y.q) (\\w.y) ((\\n.l) (\\g.y))) (\\p.\\h.i v) (\\l.k))) ((\\p.\\p.w) ((\\d.s m (\\g.b) ((\\m.f) E)) (\\z.s) (F (l r) Q ((\\d.c) (\\o.d) (a h j))) (M C (\\t.(\\g.\\g.D ((\\y.D) (j k))) ((\\l.k) f C)))))) s)",
      "t (\\j.\\u.\\y.a)"
    );
  }

  @Test
  public final void test472() {
    reducesTo(
      "(\\h.(\\n.\\p.a M) (\\v.F i (\\s.w))) (d ((\\z.h) (N l))) g (\\x.D) (\\y.(\\c.g) (\\c.\\b.\\d.(\\p.\\q.j) (g n U)) (\\v.s) (\\z.\\z.(\\l.D) (\\h.D))) ((\\p.t) (\\m.\\w.n (\\b.\\g.(\\p.a q (h K) z P) (v w)))) R (\\p.t)",
      "a M (\\x.D) (\\y.g (\\v.s) (\\z.\\z.D)) (t) R (\\p.t)"
    );
  }

  @Test
  public final void test473() {
    reducesTo(
      "c (\\z.\\c.\\e.X)",
      "c (\\z.\\c.\\e.X)"
    );
  }

  @Test
  public final void test474() {
    reducesTo(
      "(\\f.\\w.M) a",
      "\\w.M"
    );
  }

  @Test
  public final void test475() {
    reducesTo(
      "(\\w.\\s.p) K",
      "\\s.p"
    );
  }

  @Test
  public final void test476() {
    reducesTo(
      "\\w.r",
      "\\w.r"
    );
  }

  @Test
  public final void test477() {
    reducesTo(
      "\\l.q (\\y.\\m.\\z.x) ((\\p.\\d.c) ((\\c.\\i.\\t.\\k.d k (Q R)) (\\p.\\o.c) n) ((\\n.(\\p.k) (r G)) (\\q.\\e.\\h.S) (Z z (\\c.Y) (\\d.c E)) (\\l.(\\o.r) (\\f.u) (\\c.n) (\\y.(\\d.w) (f j) (\\u.\\w.k))) ((\\l.(\\u.n) s t) (\\s.\\p.\\h.(\\j.C) r w) (\\g.F))) (m (\\f.(\\e.A) (\\y.g (q f (W j))) (\\g.(\\k.\\p.A k i (\\v.\\l.g)) y)) (\\x.I)) (\\j.\\f.\\y.\\w.h (\\c.\\q.\\c.X) (\\z.\\y.i) (\\h.u (i l (\\e.v j H) i))))",
      "\\l.q (\\y.\\m.\\z.x) (c (m (\\f.A (\\g.\\p.A y i (\\v.\\l.g))) (\\x.I)) (\\j.\\f.\\y.\\w.h (\\c.\\q.\\c.X) (\\z.\\y.i) (\\h.u (i l (\\e.v j H) i))))"
    );
  }

  @Test
  public final void test478() {
    reducesTo(
      "\\z.\\c.(\\p.\\b.k) ((\\h.y) (k g ((\\n.\\t.I) P) (\\f.F ((\\y.\\d.v K) (\\v.l)) ((\\g.\\b.\\g.o) T (u s (\\h.B) A))))) t j",
      "\\z.\\c.k j"
    );
  }

  @Test
  public final void test479() {
    reducesTo(
      "(\\h.\\q.\\p.\\m.N k) ((\\x.\\u.(\\m.e (\\h.\\q.(\\j.\\x.r) ((\\o.m) (\\c.(\\s.u) (a o)))) u a) (\\a.\\w.m)) y)",
      "\\q.\\p.\\m.N k"
    );
  }

  @Test
  public final void test480() {
    reducesTo(
      "\\x.x",
      "\\x.x"
    );
  }

  @Test
  public final void test481() {
    reducesTo(
      "(\\h.a (w ((\\j.\\e.\\n.z) y))) ((\\y.\\g.t) (\\b.\\y.m ((\\g.\\u.(\\h.X) (\\l.f) h) (m (\\p.Y) (\\d.s i (p f))) (\\l.y (\\e.\\h.\\f.(\\c.v i) (U (\\t.e))))) (\\n.\\b.\\a.\\d.O (\\x.(\\l.G) z (\\n.(\\h.i) (\\x.x)) (\\k.m (b X) (\\k.\\i.u))) ((\\e.\\d.C) ((\\e.a) ((\\g.d) (K N)) (\\x.\\p.\\j.(\\h.a) d))))) (\\z.v))",
      "a (w (\\e.\\n.z))"
    );
  }

  @Test
  public final void test482() {
    reducesTo(
      "\\x.b (\\b.\\j.\\z.(\\q.y) ((\\e.\\h.D (\\t.(\\d.\\e.\\b.a) (\\n.o))) (\\c.\\m.\\v.X))) ((\\i.(\\h.(\\v.(\\h.C (\\f.(\\k.\\p.h) (\\n.l Z))) (\\z.\\w.(\\b.\\b.\\c.\\v.W (m R)) (\\z.c))) ((\\f.\\e.\\u.n G (\\e.r) X) ((\\e.\\y.l y) n) (k x))) r) (U (c (\\c.(\\o.(\\g.y) (y w)) (x Y (e d)) (\\k.\\n.F ((\\w.S) (z u))) ((\\b.i) (\\e.\\t.d)))))) (x v)",
      "\\x.b (\\b.\\j.\\z.y) (C (\\f.\\p.\\z.\\w.\\b.\\c.\\v.W (m R))) (x v)"
    );
  }

  @Test
  public final void test483() {
    reducesTo(
      "i ((\\s.(\\z.\\g.\\m.\\k.(\\h.\\p.G z Y) (\\p.(\\r.c) (\\u.g) (\\k.\\z.N))) o) (\\w.\\t.M w (\\t.I) (\\n.W) (c T (\\b.a) ((\\s.Y) (f v))) (\\a.\\x.\\a.o)) (\\i.\\n.L) R) T",
      "i (\\k.\\p.G o Y) T"
    );
  }

  @Test
  public final void test484() {
    reducesTo(
      "(\\v.\\d.(\\s.\\x.y (\\i.\\f.s (t a (G E)) (l (\\j.V) (\\f.(\\g.a) (h h))) ((\\u.M i (O i)) (N o (\\q.j)) Y) a) N) ((\\d.x) ((\\y.l) (\\j.\\k.z N (\\u.t (r l (c p))) ((\\k.\\b.\\n.t) (\\k.b p (G Q)) (\\f.(\\v.S) s))) (\\w.h (\\g.(\\a.\\v.\\w.s) (\\h.\\w.v i) ((\\n.\\u.q a) (\\s.\\z.D Q))) p)))) ((\\t.(\\b.\\h.g J (\\w.j a B) (c k (\\n.A) (\\d.(\\e.q) (X m)))) (\\n.\\n.w i (Z s) (\\k.\\t.o l) (R (y (\\a.a)))) (\\o.(\\r.K) (\\b.j)) (\\b.(\\p.(\\d.n (\\e.\\p.g l) (f u (l G) c)) (B h)) (\\n.u (K (\\z.\\g.(\\k.J) o)))) ((\\s.(\\f.a (\\j.(\\a.A) (\\b.M) (\\f.z))) ((\\o.T (L F n)) (\\n.\\h.(\\g.T) (z f) (\\s.q c))) (a (\\w.q))) ((\\h.(\\e.\\z.X) ((\\p.N z (\\y.w)) C) ((\\s.d) S (b r (\\a.z)) R)) (Q (\\g.w))))) (r (\\p.\\g.l ((\\v.Z ((\\w.(\\p.c) (S M)) ((\\x.w) u)) (\\o.\\i.\\n.(\\u.A (\\b.C)) o)) ((\\h.c) (T E) (\\l.\\g.i K) (\\t.(\\r.\\u.j) (\\v.\\g.\\i.O)) l)))))",
      "\\d1.\\x6.y (\\i7.\\f8.x (t a (G E)) (l (\\j.V) (\\f.a)) (M i7 (O i7) Y) a) N"
    );
  }

  @Test
  public final void test485() {
    reducesTo(
      "Q (\\u.E)",
      "Q (\\u.E)"
    );
  }

  @Test
  public final void test486() {
    reducesTo(
      "\\g.l (\\n.a)",
      "\\g.l (\\n.a)"
    );
  }

  @Test
  public final void test487() {
    reducesTo(
      "(\\h.Z G) (\\m.y)",
      "Z G"
    );
  }

  @Test
  public final void test488() {
    reducesTo(
      "\\x.W",
      "\\x.W"
    );
  }

  @Test
  public final void test489() {
    reducesTo(
      "\\e.o",
      "\\e.o"
    );
  }

  @Test
  public final void test490() {
    reducesTo(
      "(\\w.\\m.(\\f.w) ((\\n.d) (\\s.(\\j.(\\r.y) (F x)) s (\\d.d) z)) C ((\\j.q ((\\o.N (\\g.f)) (y (\\p.\\o.s))) r) (o (\\c.a)))) ((\\t.U (y (\\z.\\g.\\e.l) R x) (\\y.\\n.(\\v.e (W (l q))) (\\p.\\n.(\\r.\\x.o) (a m (S k))) (\\q.(\\z.C) (\\d.u l)) M) L) ((\\b.(\\a.\\n.L (\\j.(\\b.p n (u q) (T (B o))) (\\v.v x l ((\\r.v) (\\q.H))))) (\\c.(\\p.(\\g.\\n.\\n.\\j.\\r.v) ((\\u.y) k (\\h.\\s.\\w.x))) (\\p.\\k.\\v.a))) (\\q.g) ((\\q.L) ((\\s.b (\\l.d (O n) (c I (r E))) ((\\a.\\r.\\e.Q) (\\h.w) ((\\p.a) U (\\l.\\a.f)))) (\\d.\\b.\\c.\\b.\\c.(\\e.m) ((\\t.s ((\\z.T) (\\n.I))) Y))))))",
      "\\m1.U (y (\\z.\\g.\\e.l) R x) (\\y.\\n.e (W (l q)) (\\q.C) M) L C (q (N (\\g.f)) r)"
    );
  }

  @Test
  public final void test491() {
    reducesTo(
      "g (\\m.\\k.H ((\\u.k) (\\k.\\j.u)) j)",
      "g (\\m.\\k.H (k) j)"
    );
  }

  @Test
  public final void test492() {
    reducesTo(
      "O (\\i.\\h.(\\y.d ((\\j.G) ((\\w.\\l.a (\\z.X)) A)) ((\\h.x) p ((\\p.\\m.\\x.p) ((\\s.w Q) (c (\\n.x w (\\i.n))) ((\\w.w) E (\\l.i a (r y)) (b (\\e.r))))))) y)",
      "O (\\i.\\h.d (G) (x (\\m.\\x1.w Q (E (\\l.i a (r y)) (b (\\e.r))))))"
    );
  }

  @Test
  public final void test493() {
    reducesTo(
      "\\e.G",
      "\\e.G"
    );
  }

  @Test
  public final void test494() {
    reducesTo(
      "\\n.k",
      "\\n.k"
    );
  }

  @Test
  public final void test495() {
    reducesTo(
      "w (k o N ((\\u.\\s.Y) ((\\y.(\\m.\\e.(\\p.t) ((\\z.h) W)) ((\\k.\\o.\\m.h) (\\r.(\\q.D) (\\u.P))) (\\y.A)) (\\p.(\\c.(\\h.z (\\h.(\\g.u) (b w))) i) ((\\p.b (\\v.s)) (\\g.v) ((\\n.\\i.\\l.R) (\\k.\\c.u g)))))) (\\e.(\\a.(\\f.\\l.\\v.x) ((\\b.A) (\\b.D (W T) I))) (\\y.(\\i.(\\c.\\f.\\v.(\\y.k) (\\m.\\k.D)) (\\m.\\m.\\s.a (\\l.C (w h N))) ((\\a.\\a.m h) (\\h.r T (\\r.v)) ((\\x.l a) (\\q.t S (J K))) ((\\g.g) (m E) (k j (S x)) (\\u.b)))) x)))",
      "w (k o N (\\s.Y) (\\e.\\l.\\v.x))"
    );
  }

  @Test
  public final void test496() {
    reducesTo(
      "W ((\\t.q (\\e.(\\w.(\\y.\\f.(\\o.q a) c) e (\\r.t) (\\e.a)) (n (\\r.b)))) ((\\h.L) c ((\\i.f) ((\\w.(\\e.a (\\t.o)) (a (\\n.\\g.(\\z.F) (\\g.J) ((\\x.h) (\\i.Z))))) S))))",
      "W (q (\\e.q a (\\e.a)))"
    );
  }

  @Test
  public final void test497() {
    reducesTo(
      "\\w.\\u.i",
      "\\w.\\u.i"
    );
  }

  @Test
  public final void test498() {
    reducesTo(
      "(\\g.\\y.\\j.\\a.\\c.\\x.\\f.\\i.\\f.(\\u.\\p.\\q.(\\j.(\\g.V (Y r ((\\x.m) e))) (p (\\o.(\\k.\\l.l x) ((\\s.P) (\\r.b)))) (\\n.i) (\\n.(\\i.\\z.\\d.(\\f.o) (V e) (e (i Z))) ((\\i.b) ((\\i.x) (d s))) j (\\u.\\w.t))) (o ((\\r.W) ((\\c.\\r.(\\e.n) (w y) (l d (\\i.c)) (\\y.m H)) ((\\y.J) (\\b.e) (\\e.d k (\\t.S)) (\\s.u)))))) f) ((\\h.\\f.\\n.(\\e.j) (\\a.\\a.\\g.\\y.g)) (\\g.Z) (E b ((\\i.(\\z.(\\x.\\d.R d) ((\\j.p) (g i))) (\\o.d b (\\b.i) ((\\i.f) d)) (\\d.(\\k.n) Y)) (u (\\j.\\j.p))) c))",
      "\\y.\\j.\\a.\\c.\\x.\\f.\\i.\\f.\\p.\\q.V (Y r (m)) (\\n.i) (\\n1.o (e (b Z)))"
    );
  }

  @Test
  public final void test499() {
    reducesTo(
      "(\\j.\\j.(\\o.\\b.N) (\\f.w P (\\y.(\\d.U) ((\\b.M j (a g)) (\\d.\\h.\\b.N))))) (\\c.\\r.R (p Q b)) y (\\c.K (\\l.y u ((\\l.\\v.f) (\\x.\\w.\\h.(\\w.S) F (\\c.\\f.\\y.\\s.(\\j.o b) X j))))) (\\p.u n ((\\t.v) ((\\f.T) ((\\a.t) (\\o.(\\t.\\u.\\q.c) (\\c.\\t.x))) (i (\\c.(\\t.S c) ((\\h.g) (n U)) (\\o.Z))))) ((\\x.\\j.t) j ((\\q.x) (\\w.\\u.Y)) (\\g.\\q.\\i.P)))",
      "N (\\p.u n (v) (t (\\g.\\q.\\i.P)))"
    );
  }

  @Test
  public final void test500() {
    reducesTo(
      "k (\\h.(\\k.\\a.o) (\\z.(\\v.\\f.(\\h.\\c.a u) (S (p o (u k) (\\a.y (\\g.Z))))) j (\\b.\\y.\\y.\\c.(\\z.O) S))) (\\j.\\j.\\z.\\h.\\e.\\l.G)",
      "k (\\h.\\a.o) (\\j.\\j.\\z.\\h.\\e.\\l.G)"
    );
  }

  @Test
  public final void test501() {
    reducesTo(
      "p (\\y.(\\z.N) (\\l.m T ((\\k.(\\a.r m v) (\\t.M) (\\h.O) ((\\z.i) Y ((\\p.E) (\\x.E)) (\\n.V))) D)) (K (L (y ((\\m.\\u.\\n.Y) (\\c.\\p.\\n.y) (\\s.b)))) ((\\f.Y) ((\\f.\\k.\\l.\\x.p) (\\b.\\y.a (\\r.k))))))",
      "p (\\y.N (K (L (y (\\n.Y))) (Y)))"
    );
  }

  @Test
  public final void test502() {
    reducesTo(
      "\\d.(\\e.h) (\\d.\\c.q s) (j (H (\\s.B) (\\m.\\a.\\x.\\j.\\z.(\\i.\\d.(\\x.g) (\\t.\\j.f) (A (\\h.\\w.\\m.T))) ((\\k.\\f.\\s.p) s) (f T))))",
      "\\d.h (j (H (\\s.B) (\\m.\\a.\\x.\\j.\\z.g (A (\\h.\\w.\\m.T)))))"
    );
  }

  @Test
  public final void test503() {
    reducesTo(
      "s (\\s.(\\j.\\r.\\n.\\y.s (\\c.W (R (p (\\r.s) (V q (\\p.U)))) x) S) p)",
      "s (\\s.\\r.\\n.\\y.s (\\c.W (R (p (\\r.s) (V q (\\p.U)))) x) S)"
    );
  }

  @Test
  public final void test504() {
    reducesTo(
      "\\i.\\g.(\\e.R) (\\d.b) (u f ((\\w.(\\p.B) (\\x.b)) e) Y)",
      "\\i.\\g.R (u f (B) Y)"
    );
  }

  @Test
  public final void test505() {
    reducesTo(
      "(\\o.\\f.(\\r.\\l.\\l.\\u.\\a.f (\\y.n)) (u ((\\r.H (l H) (\\p.Q)) m) ((\\f.X) ((\\x.\\i.W x) (c R (\\c.H))) L) (T ((\\n.(\\u.f) (\\n.g)) ((\\r.R) (\\x.s)) (\\z.\\u.d (S R) l)) ((\\c.(\\z.s (b o)) T) (\\e.T) ((\\r.O) ((\\o.w) (N X)) y))))) (\\b.W) (\\z.(\\d.w (\\s.\\f.e (\\s.l) (l p (W P)) (\\d.S)) (Z (\\u.(\\d.\\h.\\m.\\k.\\t.(\\x.m) (\\t.k)) (x B k (\\z.m (h G))))) (f o)) ((\\e.h p) (O (\\n.(\\q.y) (\\a.q) (m N (u R))) ((\\t.(\\r.j) (\\p.U) p) (O ((\\t.c) (\\j.i))))) (e d)) (\\v.(\\u.\\p.(\\y.\\w.\\q.s) z) (\\m.D (\\v.(\\n.(\\s.H) (o o) (c (\\e.s)) (A b)) w) (\\e.\\z.\\c.k))))",
      "\\l1.\\l2.\\u3.\\a.w (\\s.\\f.e (\\s.l) (l p (W P)) (\\d.S)) (Z (\\u.\\h.\\m.\\k.\\t.m)) (f o) (\\v.\\p.\\w.\\q.s)"
    );
  }

  @Test
  public final void test506() {
    reducesTo(
      "(\\b.t) (\\r.V) (\\i.\\n.\\s.\\l.k)",
      "t (\\i.\\n.\\s.\\l.k)"
    );
  }

  @Test
  public final void test507() {
    reducesTo(
      "\\t.(\\v.Z (\\w.N)) c",
      "\\t.Z (\\w.N)"
    );
  }

  @Test
  public final void test508() {
    reducesTo(
      "(\\g.y) ((\\f.\\f.\\w.D) ((\\z.\\e.(\\w.f (T X)) S Z) B (\\x.(\\z.x) I ((\\z.j) (\\k.\\v.(\\i.\\d.u) (\\n.\\b.e)))))) (Y (\\z.Q)) (\\d.a)",
      "y (Y (\\z.Q)) (\\d.a)"
    );
  }

  @Test
  public final void test509() {
    reducesTo(
      "(\\k.\\k.(\\s.(\\j.\\p.(\\r.\\z.p) ((\\f.m) (s p (w j)))) ((\\w.\\c.\\k.h s (\\p.\\m.L)) ((\\i.h) ((\\o.D) (\\r.t)))) ((\\n.q ((\\f.d) (\\l.y))) a ((\\n.(\\e.c) (j D)) (\\v.\\b.P) (i (q o) (\\d.(\\s.u) (l d)))))) (y ((\\f.\\u.(\\v.\\c.\\u.d) ((\\j.v) y ((\\f.z) (F R)))) ((\\s.s) (z t) (s (x u)) (\\c.(\\c.y r s) (D p (W R)))))) (\\z.j) (\\h.(\\l.\\d.u ((\\y.m) (\\r.(\\l.\\d.\\n.i) t)) (\\e.\\w.\\h.\\x.(\\f.(\\m.\\l.H) V) (o (\\j.\\d.K I)) (s (\\i.\\f.(\\o.\\x.W) l)))) (\\t.(\\q.i p (\\w.(\\w.(\\y.b) i (\\q.\\f.d)) C)) (h m)) a)) (\\m.\\x.\\u.v)",
      "\\k.q (d) (c (i (q o) (\\d.u))) (\\h.u (m) (\\e.\\w.\\h3.\\x.H))"
    );
  }

  @Test
  public final void test510() {
    reducesTo(
      "(\\s.\\g.\\t.f) ((\\n.(\\w.D ((\\k.\\y.o) f)) D) (\\r.y)) r",
      "\\t.f"
    );
  }

  @Test
  public final void test511() {
    reducesTo(
      "\\y.v s",
      "\\y.v s"
    );
  }

  @Test
  public final void test512() {
    reducesTo(
      "\\y.\\v.i",
      "\\y.\\v.i"
    );
  }

  @Test
  public final void test513() {
    reducesTo(
      "(\\e.z) (\\c.(\\d.\\z.\\o.(\\u.(\\w.a) u) (k p (\\b.W)) (r (\\f.U))) ((\\q.(\\n.a) (\\n.o)) (z H)) (\\c.\\y.\\f.(\\z.\\d.q) ((\\u.o) n) (v c (\\l.b) d) (\\h.z))) b v ((\\c.w B) ((\\e.(\\g.N (\\w.(\\q.c) ((\\l.z) (g f)))) ((\\u.Z g (\\b.k)) (y (f f)) (\\z.\\q.\\h.(\\d.N) (\\n.V) K))) (\\x.l l (\\g.P a (H p)) (z (t k) (\\z.(\\o.m) (\\p.B))) (\\w.\\g.\\v.N (\\r.T) j T)) (\\g.\\v.\\u.\\d.(\\k.e (\\v.\\x.s) (\\w.i (Z K (\\p.m))) ((\\m.\\e.(\\k.k) (r O) (\\x.A B)) (\\a.k))) (\\l.g)) (\\j.V)))",
      "z b v (w B)"
    );
  }

  @Test
  public final void test514() {
    reducesTo(
      "\\p.\\j.\\b.(\\m.(\\r.\\p.\\q.F) (\\w.(\\u.\\b.\\o.w) x)) (\\q.\\b.(\\u.\\i.h) b (\\p.(\\x.o ((\\k.\\o.(\\w.l) ((\\r.D) (\\w.i))) w (\\p.\\j.\\f.\\k.w C))) a E))",
      "\\p.\\j.\\b.\\p.\\q.F"
    );
  }

  @Test
  public final void test515() {
    reducesTo(
      "(\\h.\\x.\\t.w) (\\b.\\n.\\h.V) (\\v.X (\\j.\\m.(\\i.(\\w.i d) B) l) ((\\q.\\k.(\\n.z c (j n) (t (s n))) (\\w.\\y.(\\w.G g) (U e r))) (\\v.\\x.(\\f.c) (i d) (\\m.Y (\\t.T)) (\\n.S o (v s) (\\e.w O)))) ((\\f.K) ((\\q.r) (x W)) (\\i.(\\y.(\\q.n) (\\j.X)) q) t u) (U ((\\g.t (t k Z ((\\g.e) (k B))) (\\c.J (\\l.e (\\a.\\b.Q j)))) (t ((\\g.\\q.(\\y.\\m.F) e) (q G P (\\c.M S (z L)))))))) (\\b.T)",
      "w"
    );
  }

  @Test
  public final void test516() {
    reducesTo(
      "d (\\o.\\r.M) ((\\o.A (\\t.\\v.\\i.(\\x.\\p.z) (\\d.(\\x.b) f ((\\v.x) a)))) (\\j.(\\p.m) ((\\l.o) (v y)) (t ((\\n.U) (\\r.O))) e) m (\\o.w p (\\h.(\\w.\\z.\\l.\\q.\\b.(\\t.f) (\\r.\\h.r) ((\\x.\\m.\\q.m) (\\s.U x)) q) ((\\y.\\q.\\h.\\m.i) (i h Y ((\\o.a) (\\d.j)) ((\\v.H) (y H) (o (\\f.J)))))))) (\\k.\\p.\\g.(\\v.(\\w.m) ((\\t.\\t.\\q.\\c.w) (\\p.\\y.p (\\u.F))) (\\y.a (\\v.\\y.(\\x.(\\w.\\k.L a) ((\\r.J) (\\v.Z))) n (D ((\\y.\\r.\\g.U) r)))) N) n)",
      "d (\\o.\\r.M) (A (\\t.\\v.\\i.\\p.z) m (\\o.w p (\\h.\\z.\\l.\\q.\\b.f (\\m.\\q.m) q))) (\\k.\\p.\\g.m (\\y.a (\\v.\\y.L a)) N)"
    );
  }

  @Test
  public final void test517() {
    reducesTo(
      "(\\y.g) ((\\x.n) C)",
      "g"
    );
  }

  @Test
  public final void test518() {
    reducesTo(
      "(\\o.(\\z.\\e.(\\l.\\j.i a) l (\\g.E ((\\w.r (\\k.\\f.\\r.O)) L))) (\\v.u)) (R ((\\g.L) ((\\s.(\\b.f) (\\f.j) (\\z.\\m.Y f)) x) (l (\\e.(\\k.(\\w.K) ((\\r.E) f)) ((\\n.y) (\\r.D) (w B (\\v.t))))) ((\\t.i) (y N (u J) P (\\i.n n (\\k.R) (\\f.\\o.h))) t))) (d (\\h.\\l.b))",
      "i a"
    );
  }

  @Test
  public final void test519() {
    reducesTo(
      "(\\k.(\\q.\\t.D) (\\d.F)) k",
      "\\t.D"
    );
  }

  @Test
  public final void test520() {
    reducesTo(
      "\\a.a",
      "\\a.a"
    );
  }

  @Test
  public final void test521() {
    reducesTo(
      "\\b.\\j.(\\t.\\g.(\\b.(\\j.(\\e.w K) ((\\y.Q) (\\b.e) k (\\h.\\q.\\r.y) ((\\o.\\o.s) n))) S ((\\j.\\z.(\\r.\\v.w) (\\x.\\y.\\v.\\r.(\\o.h) (\\k.L) (\\r.w I) (\\q.q) a)) a)) (\\n.\\w.(\\z.\\g.W (\\t.T)) (\\h.E) (\\h.\\m.w W ((\\v.\\l.\\e.\\n.\\g.F) (\\b.P (\\e.\\e.\\l.\\v.k ((\\d.j d) (\\v.s)))))))) ((\\n.d) d)",
      "\\b.\\j.\\g.w K (\\z.\\v.w)"
    );
  }

  @Test
  public final void test522() {
    reducesTo(
      "\\f.J",
      "\\f.J"
    );
  }

  @Test
  public final void test523() {
    reducesTo(
      "(\\q.o) (\\n.w p)",
      "o"
    );
  }

  @Test
  public final void test524() {
    reducesTo(
      "\\g.\\c.w (v t) (\\z.\\v.n)",
      "\\g.\\c.w (v t) (\\z.\\v.n)"
    );
  }

  @Test
  public final void test525() {
    reducesTo(
      "u ((\\l.\\t.(\\y.\\e.(\\t.i) ((\\z.\\v.A) (\\x.\\p.\\h.\\o.\\k.\\y.o)) (\\h.b (\\x.\\i.\\l.(\\j.\\n.\\g.(\\o.(\\y.z) (\\l.C) m) (\\j.y)) W))) (\\v.v)) ((\\z.\\n.t) (\\u.(\\l.\\e.o (\\e.\\u.x l (\\i.v) (p A (z R))) b) z z)))",
      "u (\\t.\\e.i (\\h.b (\\x.\\i.\\l.\\n.\\g.z m)))"
    );
  }

  @Test
  public final void test526() {
    reducesTo(
      "\\c.\\m.\\v.(\\x.(\\z.(\\f.K) (\\h.(\\j.q (\\r.l) (\\t.i) (\\t.H)) T)) A) (\\m.\\o.(\\b.E) (\\i.v) (\\f.\\t.F) ((\\w.(\\x.\\w.(\\y.l u ((\\b.T (Z (\\k.p))) (\\s.\\v.o))) p) (\\e.\\g.h)) B))",
      "\\c.\\m.\\v.K"
    );
  }

  @Test
  public final void test527() {
    reducesTo(
      "\\z.(\\c.(\\s.\\k.\\v.p) (\\w.q ((\\q.U (e (\\i.y) (t v (\\s.s)))) (t (u (\\j.k)))) (f (\\v.(\\h.H) s) (\\k.M (\\o.N) (i l (r g))) j ((\\a.s) (\\x.R)))) ((\\o.(\\h.\\c.\\l.(\\w.B f) (A f)) (l E (\\g.T) ((\\p.y) F)) (\\z.U (\\b.(\\e.b) (I w)) s)) (\\q.\\c.\\r.(\\v.\\c.(\\z.\\u.y w (\\e.l) ((\\k.q) (\\g.H))) P) (\\l.r)) q (\\f.(\\n.h) ((\\o.\\f.(\\c.r) Y) (\\y.s))))) (r ((\\s.(\\x.o) g V) (b ((\\z.(\\b.k (y u) o) (\\k.x) ((\\r.B) (\\c.(\\q.\\w.K) (e p (\\b.E))))) (t ((\\x.k (\\s.f) n) z))))))",
      "\\z.\\v.p"
    );
  }

  @Test
  public final void test528() {
    reducesTo(
      "\\d.(\\e.(\\g.C) ((\\j.n I) (\\r.g))) (\\w.a) ((\\c.i e) (\\v.j) (\\f.\\v.\\s.\\d.(\\j.\\y.(\\x.\\v.(\\p.t) (\\t.\\n.V t)) ((\\b.\\x.\\k.s ((\\t.m) (t G))) (\\a.\\r.\\y.i) (\\i.v (a (\\w.p))))) (u (P e (\\a.C) (\\m.o e (k p))) O ((\\u.\\b.\\s.T) b)) (\\z.\\v.\\y.\\t.\\u.X)))",
      "\\d.C (i e (\\f.\\v.\\s.\\d.\\v.t))"
    );
  }

  @Test
  public final void test529() {
    reducesTo(
      "\\c.\\t.p",
      "\\c.\\t.p"
    );
  }

  @Test
  public final void test530() {
    reducesTo(
      "\\j.\\q.(\\g.\\m.P (\\k.j ((\\f.\\g.(\\j.\\h.W) (\\t.\\f.p (\\s.\\m.\\a.r) q)) (\\z.C)) (\\b.n))) (\\t.W)",
      "\\j.\\q.\\m.P (\\k.j (\\g.\\h.W) (\\b.n))"
    );
  }

  @Test
  public final void test531() {
    reducesTo(
      "(\\c.\\y.(\\o.(\\r.(\\c.u) ((\\a.O a u (\\l.\\j.l) t) (\\w.\\i.\\h.(\\l.i) (\\a.\\l.\\q.(\\k.i) (\\e.L))))) (\\t.F ((\\y.p) (W Z) ((\\g.x) (d v)) (n K)) N)) (\\f.h) ((\\v.\\p.y ((\\d.(\\x.I) (\\p.B)) (V K z) (\\p.h j (q b) (\\c.\\t.V))) (\\c.(\\l.\\n.\\l.t ((\\n.e) (\\a.w) (\\c.k G))) (\\z.q ((\\p.\\n.m) (\\o.(\\r.I) (\\p.b)))))) (m R b) (\\y.(\\d.\\a.\\f.\\p.(\\k.x) y ((\\p.w) ((\\c.z) (\\u.p))) p) (\\l.j y) ((\\y.\\j.\\v.w g (\\h.E) (\\k.(\\i.L) (\\p.k)) (\\t.\\q.(\\s.a t) (r q (H t)))) ((\\q.z) (G (U r))) ((\\l.\\u.\\b.(\\a.y) (\\i.\\h.i) ((\\z.(\\z.z) (\\a.P)) (\\z.L e (\\a.u)))) (\\a.\\g.\\y.\\e.D)))))) (\\t.\\q.L)",
      "\\y.u (y (I (\\p.h j (q b) (\\c.\\t.V))) (\\c.\\n.\\l.t (e (\\c.k G))))"
    );
  }

  @Test
  public final void test532() {
    reducesTo(
      "\\s.(\\f.y (\\k.(\\l.v k (\\r.(\\y.v) q ((\\x.\\o.\\g.r) t) (o (\\n.v)))) (\\v.\\e.\\m.(\\f.a) ((\\g.p M) ((\\v.r) (X q))) (\\m.\\j.(\\g.L b) (e ((\\f.x) R))) (\\d.u ((\\g.x) ((\\n.r) (\\s.r))))))) (v s) (t ((\\v.x) u ((\\a.l) (\\x.F ((\\q.z) (\\g.o)) (w X d h))) (y (\\b.(\\p.\\j.(\\u.k) (q K) (l x)) (\\w.\\s.(\\f.O) (\\u.G) (s l (\\j.O)))) g) C))",
      "\\s.y (\\k.v k (\\r.v (\\o.\\g.r) (o (\\n.v)))) (t (x (l) (y (\\b.\\j.k (l x)) g) C))"
    );
  }

  @Test
  public final void test533() {
    reducesTo(
      "(\\r.\\l.\\y.(\\s.h (r (t p (W D) (r k)) (m (E u (\\g.P) (w Z))))) ((\\b.z e C ((\\j.h) (x o))) s n (\\h.(\\s.\\h.k) (x H (\\w.n) ((\\n.S) (\\k.j)) (\\q.O (\\n.\\i.t)))))) (\\q.C ((\\t.\\s.(\\w.\\w.\\a.\\y.V) d) ((\\j.\\q.(\\r.x (\\x.D) (z y j)) (\\w.(\\i.k) (\\f.l) (\\w.\\a.j))) o))) t (\\w.V)",
      "h (C (\\s.\\w.\\a.\\y.V) (m (E u (\\g.P) (w Z))))"
    );
  }

  @Test
  public final void test534() {
    reducesTo(
      "(\\d.(\\b.\\a.(\\m.E f (\\j.n)) (b (\\q.x)) L (\\m.\\f.f)) (\\z.H (\\b.\\c.\\l.K b (\\f.t) Z ((\\g.w O) (d m (s Z)))))) (u (\\e.\\r.\\i.k)) ((\\i.\\u.(\\o.\\r.\\w.b (\\x.n)) (\\n.g)) (f (l j (J A) (\\o.L (\\j.Q))) (\\i.I)) (\\m.t ((\\v.(\\d.(\\h.O) (f l)) (g f (m k)) (r w (D c) (y (g T)))) b))) (T (r (\\k.c))) (\\h.(\\t.\\g.n (\\o.g (r w q))) ((\\l.p) (\\u.o) y (\\u.\\f.(\\w.S t) (i h))) (\\c.y e) (\\e.(\\l.\\a.y) (\\b.j M)) g (\\w.\\z.(\\c.\\d.\\c.o (\\n.I a)) ((\\u.k x) k)))",
      "E f (\\j.n) L (\\m.\\f.f) (T (r (\\k.c))) (\\h.n (\\o.y e) (\\e.\\a.y) g (\\w.\\z.\\d.\\c.o (\\n.I a)))"
    );
  }

  @Test
  public final void test535() {
    reducesTo(
      "J ((\\v.\\t.i) (\\b.F))",
      "J (\\t.i)"
    );
  }

  @Test
  public final void test536() {
    reducesTo(
      "(\\a.\\w.(\\s.S) ((\\z.\\m.\\u.(\\x.\\i.o) (\\z.\\s.S)) q) G e (\\r.c)) (\\q.\\b.\\a.b) (\\c.m)",
      "S G e (\\r.c)"
    );
  }

  @Test
  public final void test537() {
    reducesTo(
      "(\\p.\\y.p) (\\v.N (\\d.\\i.Q (\\j.O f (m g)) F m) (\\j.(\\m.u) ((\\u.(\\f.\\o.f z) ((\\f.w) (c O)) ((\\m.D) (T G) (\\i.\\g.\\h.m))) (\\k.(\\f.\\a.\\f.q) (u d (j t)) h)))) (\\q.\\x.s) p",
      "N (\\d.\\i.Q (\\j.O f (m g)) F m) (\\j.u)"
    );
  }

  @Test
  public final void test538() {
    reducesTo(
      "(\\h.\\i.\\m.y (\\o.(\\s.\\a.\\r.t) ((\\t.R (w (y d))) ((\\y.o) x ((\\e.h) (\\s.y))) (\\m.K (\\c.F k n)) (\\c.(\\f.\\b.(\\h.H e) (v I (\\v.h))) ((\\a.o) (\\f.t) p) (M (W P) (\\n.s D (k m)) (\\z.(\\y.Q) (\\j.F) ((\\p.j) (\\q.p))))))) (\\c.(\\n.m) M (\\x.n I))) ((\\o.(\\k.\\z.\\o.\\q.\\l.\\y.\\t.\\x.(\\t.\\e.t) (\\f.\\l.\\z.\\b.\\o.y)) O) (\\g.\\i.G))",
      "\\i.\\m.y (\\o.\\a.\\r.t) (\\c.m (\\x.n I))"
    );
  }

  @Test
  public final void test539() {
    reducesTo(
      "\\x.p",
      "\\x.p"
    );
  }

  @Test
  public final void test540() {
    reducesTo(
      "(\\b.(\\k.\\c.q) t) (\\t.Y (\\h.m) o)",
      "\\c.q"
    );
  }

  @Test
  public final void test541() {
    reducesTo(
      "(\\h.(\\z.\\a.\\v.\\y.(\\f.\\g.f (C (k u (\\x.Y)) H)) (\\v.d) (\\r.(\\o.\\b.\\t.v) (\\d.\\q.U))) V) (\\p.q) a",
      "\\v.\\y.d"
    );
  }

  @Test
  public final void test542() {
    reducesTo(
      "\\t.B",
      "\\t.B"
    );
  }

  @Test
  public final void test543() {
    reducesTo(
      "(\\v.\\h.\\c.y (\\h.b) (\\k.\\m.\\m.\\c.Z)) q ((\\w.(\\u.\\s.\\y.(\\y.V) k) ((\\y.\\c.Z) s)) (y (\\b.(\\d.(\\j.\\z.d) M) ((\\m.\\w.p g) ((\\c.O) (v n)) (\\k.\\f.(\\j.F K) (n o (v n))) (\\l.(\\q.e) ((\\k.B) (\\z.p (f T))))) o)))",
      "\\c.y (\\h.b) (\\k.\\m.\\m.\\c.Z)"
    );
  }

  @Test
  public final void test544() {
    reducesTo(
      "r ((\\a.\\y.\\j.(\\g.\\z.\\p.J) (M (\\t.\\b.\\z.(\\k.x) ((\\d.O) ((\\f.\\k.\\l.d) ((\\k.q) (H I))))) (o (\\f.\\x.(\\a.\\r.j) (\\p.e) (\\h.(\\i.C d) (j B (\\d.w)))) (\\l.\\d.\\s.(\\g.L L (s A)) (g u m) (\\r.d) (\\s.h))))) B)",
      "r (\\y.\\j.\\z.\\p.J)"
    );
  }

  @Test
  public final void test545() {
    reducesTo(
      "\\j.\\p.\\i.f",
      "\\j.\\p.\\i.f"
    );
  }

  @Test
  public final void test546() {
    reducesTo(
      "\\n.\\x.T (i (s (u q (\\v.(\\c.\\e.G) (\\v.m) (\\j.\\t.\\z.\\q.\\h.\\k.F (\\v.\\v.A))))) (u y))",
      "\\n.\\x.T (i (s (u q (\\v.G))) (u y))"
    );
  }

}
