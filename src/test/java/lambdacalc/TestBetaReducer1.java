package lambdacalc;

import org.junit.Test;

public final class TestBetaReducer1 extends TestBetaReducer {

  @Test
  public final void test0() {
    reducesTo(
      "\\c.\\m.(\\j.\\v.(\\d.(\\e.\\v.\\s.(\\d.\\x.z) (f g (n K) (\\x.\\q.s) (\\w.\\g.\\a.(\\z.o E) c)) (\\k.\\h.u)) x) (\\h.\\b.m) ((\\t.j) ((\\r.o) ((\\e.w) ((\\n.v) (\\p.I))) (\\y.(\\d.(\\o.X (\\w.D)) (\\i.(\\a.s) (y c))) (\\r.m W)) (\\e.x (u ((\\c.\\e.\\k.g) (\\l.r))))) (\\n.O))) ((\\b.\\j.j) (\\l.(\\o.\\k.(\\o.\\y.(\\q.\\g.(\\r.\\m.\\y.J) (s (c v (m l)))) ((\\a.\\z.\\d.e) (\\m.r a (\\e.l)) (\\d.(\\n.(\\t.y) (e h)) (\\g.g (k c))))) (\\e.H) ((\\h.X (\\i.\\z.r)) (m l (\\n.x) ((\\w.v) (b l))) (o (\\s.\\i.n)) (\\o.x A))) (\\x.\\w.\\e.c)))",
      "\\c.\\m.\\v1.\\s.z"
    );
  }

  @Test
  public final void test1() {
    reducesTo(
      "\\f.(\\g.(\\m.\\h.(\\h.(\\t.u v (\\e.G)) (\\j.r s (j d))) (\\g.v) l) F (\\b.m) n ((\\o.y) ((\\h.\\p.\\c.(\\l.(\\t.h) (\\b.f) (\\m.(\\q.d) (\\e.v)) (\\e.H)) w) (\\j.(\\q.\\o.\\g.\\j.V) ((\\o.\\d.b (\\n.\\v.r)) (t L (s E) (M C))))) ((\\c.n) (\\l.(\\s.(\\e.B) w (\\e.\\o.(\\m.h) (\\m.\\o.\\h.h))) (S (A (\\m.R (h h))) ((\\i.j k (\\r.p)) (j d) (r (H (\\r.w))))))))) (U ((\\z.\\x.\\i.(\\s.h) (N (\\e.(\\g.\\n.\\y.e) (u W (c l)) (l (\\u.k) q)))) z ((\\g.(\\e.\\l.\\n.\\v.(\\q.X) (\\v.W)) ((\\r.\\l.t) (r (\\p.y))) e (\\f.n)) (v (r q (g l)) (\\v.(\\d.\\h.\\n.B) (\\e.\\b.g)) (\\d.h (\\j.(\\w.v) ((\\c.y) (\\k.x)))) ((\\g.d k j) (B H (n Y)) (\\z.V (a (\\k.d))) ((\\c.w) (N k) f ((\\l.\\p.\\u.z) t)))))))",
      "\\f.u v (\\e.G) l n (y (n))"
    );
  }

  @Test
  public final void test2() {
    reducesTo(
      "\\y.\\h.g",
      "\\y.\\h.g"
    );
  }

  @Test
  public final void test3() {
    reducesTo(
      "y (\\v.\\q.\\c.\\d.N)",
      "y (\\v.\\q.\\c.\\d.N)"
    );
  }

  @Test
  public final void test4() {
    reducesTo(
      "(\\x.k) b",
      "k"
    );
  }

  @Test
  public final void test5() {
    reducesTo(
      "(\\i.\\p.\\e.(\\d.e (p (\\o.z (\\j.(\\b.(\\f.w) (\\a.p)) (\\s.B l (\\k.j)))) ((\\x.G) ((\\n.\\p.k n) (\\a.F (S d))) (J q)))) (\\j.(\\a.o) (\\v.(\\n.\\f.f) (\\h.b)))) ((\\g.\\b.m (\\i.(\\d.\\c.u V) (\\k.d) ((\\x.l) y (\\c.\\z.\\c.P)) ((\\o.(\\a.x) V) (\\h.c q (\\u.b)) (\\v.\\k.\\g.Q)))) ((\\b.t (K (\\p.\\q.\\y.f) (\\y.u))) ((\\r.X (\\u.a) ((\\b.n) (\\u.r)) z) (\\u.p))) (j i)) (o (\\o.(\\g.\\x.\\r.b) ((\\d.\\w.(\\p.b) ((\\i.w U) (d (\\o.E (\\c.t))))) (\\j.\\v.(\\j.(\\k.(\\f.W S) ((\\i.q) (w j))) (\\i.\\s.(\\i.\\g.q) z)) ((\\s.n) ((\\t.h R (\\d.M)) (u (P b)))))) i))",
      "\\e.e (o (\\o.\\r.b) (\\o1.z (\\j.w)) (G (J q)))"
    );
  }

  @Test
  public final void test6() {
    reducesTo(
      "\\n.i ((\\j.A (\\h.\\z.(\\y.f) x)) s) ((\\q.i) ((\\p.\\q.(\\a.K) e) (\\z.(\\f.\\a.(\\g.v l (\\s.j) Q) (d (\\v.u) (o s (\\o.N))) (O (\\h.s (\\k.F) (\\d.b)))) (h k))) (\\j.S))",
      "\\n.i (A (\\h.\\z.f)) (i (\\j.S))"
    );
  }

  @Test
  public final void test7() {
    reducesTo(
      "\\u.(\\k.\\m.(\\g.\\k.b n) ((\\q.\\n.\\m.h v ((\\b.f ((\\w.B) (\\t.y))) (\\t.\\p.\\i.y))) ((\\a.\\f.\\c.o) (\\x.S) ((\\g.E (m l)) (\\z.f (H i))) (a (\\k.z))) a (\\d.P (\\a.a (W (p X) (\\x.B (\\z.u)) (\\r.\\e.b (\\s.\\r.s))) (\\a.(\\v.a) ((\\r.\\r.(\\a.u m) g) ((\\y.(\\o.T) (\\f.s)) m))))))) (D (\\r.o o ((\\e.(\\c.\\k.J u) (\\u.k (\\a.E)) (t R j (\\v.\\v.\\k.V))) (\\o.h c)) ((\\k.d (\\e.D)) r)) ((\\m.r (\\s.(\\e.\\e.X) ((\\k.(\\d.y) (\\d.w)) (\\v.(\\h.S) u))) (\\v.b)) (\\n.G ((\\o.Y) (\\t.q) (U Y (F x) (\\i.\\c.l)) (B ((\\g.X) (D K) (B p (W v)))))) (\\b.(\\y.v) (\\f.\\d.E))))",
      "\\u.\\m.\\k.b n"
    );
  }

  @Test
  public final void test8() {
    reducesTo(
      "\\j.\\k.(\\f.\\t.\\t.(\\w.\\s.m U (\\x.\\y.F)) o ((\\f.G) (W j (\\v.X) d (\\h.\\z.\\h.J))) W) ((\\a.J (f ((\\k.h (Q t)) (\\m.V f (W z))) (\\n.\\b.r))) (\\r.\\v.\\v.\\o.\\f.(\\b.\\i.(\\h.g (J h) P) n (\\z.z (o r (x j)) (\\d.\\x.j Q T s))) (\\l.\\o.x (\\y.(\\e.a e) (p (\\s.z))) (\\g.\\u.R)))) (\\w.v ((\\i.(\\x.(\\t.G g (\\n.l) x (\\n.\\s.\\c.b)) (u (V q) w)) (R (p (H V (l y) (\\c.n r (y i)))))) j)) J",
      "\\j.\\k.m U (\\x.\\y.F) W"
    );
  }

  @Test
  public final void test9() {
    reducesTo(
      "\\d.R",
      "\\d.R"
    );
  }

  @Test
  public final void test10() {
    reducesTo(
      "(\\e.\\y.j (G (E (\\r.(\\w.n) ((\\t.R) (x r))))) (\\a.l) (w ((\\d.(\\h.n) q) (\\x.x) c ((\\i.i) a)) (p ((\\p.\\v.\\g.r) ((\\m.K) (\\k.E)) (\\w.\\j.\\x.(\\a.l) (\\t.\\g.b)) ((\\p.\\v.D S) ((\\c.p) (\\v.B)) (q d (t T) (Z J)))))) (\\r.f)) ((\\h.j) u ((\\u.\\a.\\a.\\w.(\\k.D) c ((\\i.\\d.\\e.(\\r.\\n.\\r.\\g.V n) (\\l.(\\v.S t) c)) (i (g b) (f (M d)) b))) (\\j.(\\e.(\\j.\\p.(\\x.b) (\\x.n (\\t.\\k.u))) o) ((\\q.G j (q t) (\\x.b)) ((\\n.(\\p.m) (\\a.K)) P) b))) k)",
      "\\y.j (G (E (\\r.n))) (\\a.l) (w (n c (a)) (p (r))) (\\r.f)"
    );
  }

  @Test
  public final void test11() {
    reducesTo(
      "\\u.(\\g.\\h.m) X (\\i.\\g.j (\\x.x c) V)",
      "\\u.m"
    );
  }

  @Test
  public final void test12() {
    reducesTo(
      "\\i.m",
      "\\i.m"
    );
  }

  @Test
  public final void test13() {
    reducesTo(
      "(\\d.n (\\v.\\q.l)) ((\\u.\\z.T (X (\\k.(\\o.g) (\\i.z) p) ((\\q.v o) (\\h.\\i.s ((\\a.t) (\\v.x))))) (M R)) ((\\s.h) (c (\\b.i w (\\r.\\o.\\t.l)) (\\j.(\\n.(\\z.x) (\\p.G) (k e (k q))) (\\j.(\\j.\\b.Z) R))) (n m)) k)",
      "n (\\v.\\q.l)"
    );
  }

  @Test
  public final void test14() {
    reducesTo(
      "\\t.\\w.\\m.\\m.(\\v.\\a.g) ((\\c.x K) ((\\e.\\u.\\x.s (\\w.\\l.P A) g (\\m.Y)) ((\\d.\\s.\\z.\\o.I) (m j E I) (\\v.(\\i.\\m.\\a.P) (t y (E Q)) (\\w.j))) ((\\r.\\g.\\v.z) (\\u.K) (\\t.(\\v.p) i) ((\\w.Z) V (\\r.\\a.\\u.S) Z) (\\q.B))) (j ((\\m.\\o.d) (\\h.(\\h.(\\t.p z P) (q k t) (q (\\o.d))) (\\t.C (\\u.\\p.\\k.\\h.\\t.U)))) l))",
      "\\t.\\w.\\m.\\m.\\a.g"
    );
  }

  @Test
  public final void test15() {
    reducesTo(
      "\\k.(\\k.\\v.\\f.(\\r.u) q (\\r.j J) ((\\a.\\h.O) (\\q.\\y.(\\m.\\v.n) T) l (\\n.(\\o.(\\l.\\l.\\l.\\d.z) (\\l.\\m.G ((\\j.l) L (\\e.(\\m.u) (\\q.K))))) (\\w.(\\w.(\\b.o g (g s)) (\\k.(\\k.o) U)) ((\\j.h) (\\i.f) (y (\\j.p))) (\\q.\\w.(\\k.(\\j.o) (u i)) (\\w.\\e.j) (\\p.T Q (\\f.w) ((\\l.U) g)))) (\\v.\\v.k)))) (\\d.\\c.\\m.K (\\i.m Y))",
      "\\k.\\v.\\f.u (\\r.j J) (O (\\n.\\l.\\d.z))"
    );
  }

  @Test
  public final void test16() {
    reducesTo(
      "\\s.\\w.\\n.d",
      "\\s.\\w.\\n.d"
    );
  }

  @Test
  public final void test17() {
    reducesTo(
      "(\\o.T) (\\j.F) (r d (j g)) ((\\x.R) (\\n.h) (U (t s))) (r (\\k.\\x.\\o.(\\e.U v) (b T v))) (\\x.v (A (\\l.\\n.p (b (c I))))) (\\x.\\e.(\\z.(\\i.t ((\\m.o) (o a) ((\\e.F) (\\u.y)))) x) o) ((\\d.\\z.(\\n.\\w.k (\\d.\\p.(\\h.S j) k) (\\p.G)) (\\p.(\\m.m Q) (\\g.\\q.\\z.\\z.\\b.\\b.\\x.(\\z.c i a) (\\s.u p (\\l.R))))) (\\d.(\\u.(\\f.O (\\k.\\e.\\n.\\k.(\\e.q) (\\w.v))) (e (\\t.\\u.l T (a a) (\\n.e A)))) (w (D (b a) (q e (L Y))) (\\p.(\\v.\\i.\\i.(\\a.M a) (\\n.E w)) ((\\i.\\v.P O) (\\m.\\m.\\j.z)))))) (K G) C",
      "T (r d (j g)) (R (U (t s))) (r (\\k.\\x.\\o.U v)) (\\x.v (A (\\l.\\n.p (b (c I))))) (\\x.\\e.t (o (F))) (\\z.\\w.k (\\d.\\p.S j) (\\p.G)) (K G) C"
    );
  }

  @Test
  public final void test18() {
    reducesTo(
      "(\\k.(\\q.k) (\\i.\\h.D) d (\\x.o (\\o.R ((\\c.(\\x.\\w.\\q.(\\i.L T) v) I) (\\y.r)))) (\\e.\\j.Q ((\\n.m m) (\\q.s)))) (\\r.x)",
      "x (\\x.o (\\o.R (\\w.\\q.L T))) (\\e.\\j.Q (m m))"
    );
  }

  @Test
  public final void test19() {
    reducesTo(
      "(\\z.(\\u.u) p) (\\q.(\\b.(\\g.(\\u.\\v.\\v.(\\w.(\\n.e k (Q e)) (\\v.(\\k.A) I) m ((\\m.\\f.H) (L o))) i) ((\\c.t) (\\t.\\i.h j (z m) (\\d.\\w.x) a I))) (q ((\\x.(\\l.x) (\\e.p) ((\\l.c) v) ((\\c.a) T (\\p.U)) (\\h.M)) (\\a.x)))) (\\c.(\\f.(\\k.z) u h) (\\t.\\k.x) z ((\\z.\\o.\\h.\\k.d) ((\\o.\\f.\\i.(\\y.l) z) (M u)))))",
      "p"
    );
  }

  @Test
  public final void test20() {
    reducesTo(
      "(\\m.\\w.(\\n.\\g.\\l.X (\\t.\\v.\\d.(\\e.n) (e d) (L b (h o))) ((\\z.\\t.v) F) (q (\\j.(\\a.\\h.H) S ((\\y.t w F) y)))) t ((\\e.(\\y.\\o.n) (\\e.(\\r.\\q.q k) (\\o.(\\p.w) (\\c.i)))) h ((\\o.f) (\\e.a)) B) B) ((\\d.(\\d.(\\k.\\k.\\t.L) f) (\\t.\\a.S ((\\f.\\h.C (\\w.i l (\\l.X e q)) (o (\\q.(\\h.v) (L B)) (\\k.(\\o.\\x.\\k.B) (\\x.\\x.\\r.k)))) ((\\n.E) (\\e.m))))) (\\n.(\\d.P (k q (\\z.d) (\\u.M D (u z))) (e (y R) (m (W a)) (z (\\e.\\n.\\c.S)))) (B (\\w.(\\m.z O (\\y.d V (C m))) Q)) (Z (\\u.i) ((\\d.w) h (B U (\\g.n)) v (n (\\s.t) (\\n.u) (\\y.(\\z.C) ((\\t.s) (y y)))))) (\\t.\\u.n (\\m.\\g.\\e.(\\e.E (\\i.P d)) (\\b.(\\m.\\v.m) (\\v.x m)) e) ((\\y.(\\z.G) N) (\\k.\\d.\\q.\\q.(\\d.m) (\\m.w) (\\y.b Q) Z) ((\\k.(\\f.(\\u.o) (V C) k) ((\\b.U) (\\f.l) (\\i.h))) (\\j.(\\t.y h) (K e)))))))",
      "\\w.X (\\t1.\\v.\\d.t (L b (h o))) (\\t.v) (q (\\j.H))"
    );
  }

  @Test
  public final void test21() {
    reducesTo(
      "(\\d.R) d",
      "R"
    );
  }

  @Test
  public final void test22() {
    reducesTo(
      "(\\w.(\\h.\\s.g) ((\\i.(\\c.\\t.\\i.\\o.M) Q) ((\\q.\\r.\\w.\\i.\\f.d) (\\u.h) (\\c.\\q.\\e.\\o.(\\z.(\\m.\\a.y) ((\\p.v) (C K) (J X (O r)))) (\\i.\\f.z)))) (\\v.f)) F",
      "g"
    );
  }

  @Test
  public final void test23() {
    reducesTo(
      "\\m.w",
      "\\m.w"
    );
  }

  @Test
  public final void test24() {
    reducesTo(
      "\\x.f",
      "\\x.f"
    );
  }

  @Test
  public final void test25() {
    reducesTo(
      "\\k.\\h.(\\t.\\n.P) ((\\u.y (\\o.x) ((\\f.b) (b o)) (\\x.N (h O d)) ((\\n.o) s) (\\f.a (\\n.\\q.O (\\n.o) D) ((\\u.\\l.\\r.(\\y.\\w.X) w) ((\\b.w) (\\t.\\y.K e)))) w) (q (\\j.K) (\\a.\\y.n (\\j.(\\x.K) ((\\r.(\\g.j) (\\i.d e (\\r.g))) (\\p.f)))))) (C ((\\j.(\\c.u ((\\r.\\q.\\d.v) ((\\w.i) H)) (\\j.v) (\\f.\\x.H)) (\\h.\\q.\\n.\\f.r)) (d (\\m.(\\k.K) r ((\\h.\\x.\\v.C) f)))))",
      "\\k.\\h.P"
    );
  }

  @Test
  public final void test26() {
    reducesTo(
      "(\\n.\\n.(\\a.\\p.\\f.\\p.T) (\\q.(\\k.(\\a.m (\\g.q) (\\l.F)) (\\z.w T) (\\j.(\\o.J) e (\\p.p) (\\d.(\\a.(\\v.S) (y u)) M)) ((\\n.(\\w.\\i.B) g) ((\\q.F d (t v)) (t x d)) ((\\e.b) ((\\i.M) (s f)) y)) (\\s.\\p.(\\b.Q) (\\l.V))) (\\d.(\\g.o (\\u.a (\\y.\\s.b)) ((\\a.g (Q f (\\j.s) (j X (\\c.f)))) (\\e.u (\\v.b (\\n.s) ((\\u.X) (d l)))))) (\\a.\\k.a ((\\q.u) (\\j.i) (\\y.\\r.T) (\\u.v) ((\\a.(\\t.j) D (W z (\\m.r))) (\\d.(\\y.k r (y s)) (\\b.\\x.\\c.b)))))))) ((\\u.G) ((\\w.i c) L))",
      "\\n.\\p.\\f.\\p.T"
    );
  }

  @Test
  public final void test27() {
    reducesTo(
      "\\d.\\u.c ((\\h.\\p.(\\l.j ((\\v.\\a.\\r.e (\\c.z)) ((\\g.c (\\o.\\n.\\d.j)) (q (s (q K))) (w a)))) (\\e.z)) ((\\g.(\\h.\\h.l) ((\\o.M B) (\\w.T)) ((\\v.x) (\\u.\\k.\\e.i (e (y r))) (\\n.(\\g.\\f.\\w.F) (m h) (m I (\\m.W) ((\\t.j) (a O))))) D) ((\\h.(\\x.\\x.(\\z.O (\\l.\\p.X g) (\\v.G t l ((\\r.D) (\\b.w)))) ((\\p.(\\b.H) e) (j (P i)) (\\g.(\\y.u) k))) i) i)))",
      "\\d.\\u.c (\\p.j (\\a.\\r.e (\\c.z)))"
    );
  }

  @Test
  public final void test28() {
    reducesTo(
      "\\t.\\e.\\o.(\\a.(\\t.o) ((\\v.(\\k.K u) (\\e.(\\e.u) (\\x.M) g (\\c.u) (\\m.\\l.d (a (\\i.i))))) (\\b.\\m.\\x.\\y.(\\q.\\h.\\p.(\\r.(\\e.q) (w f)) f (c (\\s.i) f) ((\\k.d (y h)) A c)) ((\\r.h) (\\x.\\f.v f) (\\n.\\j.(\\w.\\c.o) (\\n.s X)) ((\\d.h) ((\\o.\\c.c N) (\\o.x))))))) (V (A ((\\n.b) (\\w.j)) (\\b.(\\r.\\i.(\\w.Y e) z) (\\b.\\r.f) (\\f.V ((\\v.i) (o N) (d (Y q)))) z))) (\\w.\\l.\\v.\\h.f (r ((\\v.v) n)))",
      "\\t.\\e.\\o.o (\\w.\\l.\\v.\\h.f (r (n)))"
    );
  }

  @Test
  public final void test29() {
    reducesTo(
      "\\k.b",
      "\\k.b"
    );
  }

  @Test
  public final void test30() {
    reducesTo(
      "\\a.D",
      "\\a.D"
    );
  }

  @Test
  public final void test31() {
    reducesTo(
      "(\\t.y) ((\\p.\\v.(\\r.\\c.y f) ((\\t.S (\\l.n) (n r (\\f.E))) (\\z.(\\s.K (\\e.r)) N) (t (R s) (Q (n u)) W) (U (r (\\l.E) (c (p b)) a))) (\\n.z (\\t.z u) (l u ((\\a.m i) (\\m.l)) (\\h.(\\q.\\i.(\\i.\\c.M) x) (\\q.\\r.(\\c.A) (\\a.Y) W)) M))) ((\\z.(\\i.(\\t.i) (P r) (B (\\b.R))) u (\\b.\\i.\\y.\\l.(\\h.(\\v.k) c Y) (\\v.g))) Y m (\\j.(\\p.n) (\\q.\\f.\\f.(\\d.z (\\p.J) ((\\v.o) u) E ((\\l.\\e.H) (\\e.\\s.a))) (w S)))))",
      "y"
    );
  }

  @Test
  public final void test32() {
    reducesTo(
      "x ((\\g.\\h.C) ((\\d.\\h.J ((\\x.\\n.c) ((\\u.(\\c.x R) (\\t.v (s u))) (a (\\x.u) (l Z (\\x.F)))))) ((\\x.\\y.p) (\\q.(\\u.\\o.\\p.m) ((\\f.(\\h.X) (\\w.L) (\\e.\\h.d s)) (t (H d (\\g.o)))))) (\\l.\\g.\\y.s (d o) (\\z.\\j.O))))",
      "x (\\h.C)"
    );
  }

  @Test
  public final void test33() {
    reducesTo(
      "v j x",
      "v j x"
    );
  }

  @Test
  public final void test34() {
    reducesTo(
      "(\\z.(\\n.R (h e)) (\\t.e) U (\\l.(\\v.\\h.\\a.j) ((\\y.v) (\\o.k)) i)) (\\b.\\c.(\\f.O) (\\p.i W r s) (W (q H) (\\o.m (T N)) ((\\u.\\o.I) (r f (w M))))) T ((\\j.(\\e.\\o.\\i.\\t.(\\w.(\\c.(\\m.Q) (x O) i) (\\z.i)) e) ((\\c.\\i.\\r.\\n.\\r.\\s.n d) ((\\z.i) V (\\s.\\q.\\p.b)) (L j (\\c.a) ((\\t.y) (e q)) (g (t (\\m.r)))))) J) ((\\x.(\\g.\\z.(\\p.C (\\n.H)) (\\j.(\\u.r) (y J) (\\d.R) (\\h.(\\s.j) (p f) q))) ((\\a.\\h.\\r.E (\\p.U) (\\z.f A)) (\\s.\\h.(\\v.c f) (M (\\w.d))) (u ((\\t.A) (r l)) (\\c.i)))) (\\n.y (\\z.f)) ((\\u.B) ((\\i.L (\\z.Z) e) e))) (\\q.V)",
      "R (h e) U (\\l.\\a.j) T (\\o.\\i1.\\t2.Q i1) (C (\\n.H)) (\\q.V)"
    );
  }

  @Test
  public final void test35() {
    reducesTo(
      "\\l.i (s (r (V W (d p) (U n (t t)) (q (\\f.k) (\\b.h)) c)) y) (b (\\m.H))",
      "\\l.i (s (r (V W (d p) (U n (t t)) (q (\\f.k) (\\b.h)) c)) y) (b (\\m.H))"
    );
  }

  @Test
  public final void test36() {
    reducesTo(
      "(\\y.\\w.I (p (t (\\m.g (y (\\t.s))) f h))) (\\w.\\o.g (c (\\n.\\c.\\d.a R v)) k (\\l.\\r.\\y.(\\f.U) (l r) (s (v s)) ((\\j.n) M ((\\t.o) (u h))) s ((\\y.h) b)) ((\\i.\\o.D (\\a.r) h) p ((\\v.(\\w.k Y (\\h.w)) N (\\s.h (t j (p f))) (l (y p) n)) (A (\\m.\\f.\\s.\\h.A))))) A",
      "I (p (t (\\m.g (\\o.g (c (\\n.\\c.\\d.a R v)) k (\\l.\\r.\\y.U (s (v s)) (n (o)) s (h)) (D (\\a.r) h))) f h))"
    );
  }

  @Test
  public final void test37() {
    reducesTo(
      "g (\\q.(\\s.n) ((\\e.\\t.\\q.\\w.\\l.\\h.w) ((\\z.q (l Z) (c n m)) (\\m.\\w.b))) (c E)) (\\h.x ((\\e.x p (\\r.i) (D w o) c (\\b.(\\x.\\p.\\f.H) (\\z.y) (\\s.a q (\\i.I) (d g (\\c.w)))) A) (o (\\s.v) (\\f.x) M))) n",
      "g (\\q.n (c E)) (\\h.x (x p (\\r.i) (D w o) c (\\b.\\f.H) A)) n"
    );
  }

  @Test
  public final void test38() {
    reducesTo(
      "t (p (\\o.(\\p.\\y.\\q.\\z.B) (\\o.\\p.\\s.\\c.\\q.W l)))",
      "t (p (\\o.\\y.\\q.\\z.B))"
    );
  }

  @Test
  public final void test39() {
    reducesTo(
      "\\n.\\e.\\p.\\e.(\\g.(\\n.\\w.\\k.\\e.(\\u.(\\v.U ((\\r.W) (\\d.U) (\\j.v))) (X ((\\u.(\\w.r) (r q)) (m (\\n.e)))) (\\h.(\\n.T) (\\s.\\c.d))) (\\v.D) (\\f.\\f.\\r.(\\i.\\g.(\\i.(\\o.k) (\\f.\\u.\\z.\\g.F ((\\u.V) n p))) ((\\f.\\i.B (\\d.y t)) (z i (p m) (\\l.\\h.k g)) (t (h (z y (f f)))))) ((\\x.(\\y.g) g) ((\\p.u) (k N) (\\e.\\k.\\m.b)) k (\\g.\\t.\\z.o O (v z) (\\z.(\\d.t) (\\m.B)) ((\\y.l) l ((\\s.i) (\\f.U))) Q)))) (\\f.\\m.h (\\y.\\s.(\\e.Q) ((\\w.t ((\\k.\\j.D) T)) Y ((\\y.b (\\n.U)) (\\a.\\y.(\\y.U) (\\e.\\o.X Y) ((\\v.(\\m.M) (s p)) g))))))) (\\b.i b ((\\i.\\a.\\j.\\h.\\t.\\q.W) (\\g.(\\u.D) ((\\k.\\x.a) (z q (H I) m ((\\s.K (\\p.E)) (V (u y))) (\\l.\\q.i))))))",
      "\\n.\\e.\\p.\\e.\\w.\\k.\\e.U (W (\\j.X (r))) (\\h.T) (\\f.\\f.\\r.\\g.k)"
    );
  }

  @Test
  public final void test40() {
    reducesTo(
      "m (\\l.S)",
      "m (\\l.S)"
    );
  }

  @Test
  public final void test41() {
    reducesTo(
      "c ((\\u.(\\g.\\b.(\\i.(\\a.v) c) ((\\o.b) (\\h.j) (\\z.\\s.w y))) ((\\u.G) a j p)) (\\l.(\\g.\\l.(\\g.Z) (z v) (\\a.\\s.V J) (\\h.l u (\\c.\\x.X))) ((\\s.r) (i B) (p o g) (\\b.K (\\m.(\\h.y) d))))) ((\\e.q) (\\l.(\\a.b v) R)) (C (\\v.W)) (\\q.\\y.F)",
      "c (\\b.v) (q) (C (\\v.W)) (\\q.\\y.F)"
    );
  }

  @Test
  public final void test42() {
    reducesTo(
      "\\i.\\v.\\a.D",
      "\\i.\\v.\\a.D"
    );
  }

  @Test
  public final void test43() {
    reducesTo(
      "\\m.X",
      "\\m.X"
    );
  }

  @Test
  public final void test44() {
    reducesTo(
      "\\m.u",
      "\\m.u"
    );
  }

  @Test
  public final void test45() {
    reducesTo(
      "(\\y.(\\a.(\\v.(\\u.(\\a.\\b.q) ((\\s.d) (U t))) ((\\e.\\b.i U) ((\\i.k) (B v))) R) (r (y d (k u) (Y p (f p))) f) (\\k.u)) (\\r.\\q.\\d.(\\m.g) G) (\\t.j)) (\\q.(\\c.(\\b.I) (\\u.\\s.o) (z (\\j.\\l.\\v.S) ((\\p.G (y K)) (\\x.\\p.k)) (\\g.B (\\i.(\\l.I) (\\j.y) ((\\q.V) (\\j.i))))) (\\u.\\c.x)) (\\f.\\m.u) (\\r.J))",
      "q (\\k.u) (\\t.j)"
    );
  }

  @Test
  public final void test46() {
    reducesTo(
      "(\\l.(\\j.(\\a.(\\e.\\d.p) (\\l.O) F g) (\\n.\\t.\\i.\\u.\\g.L) (\\n.(\\q.h) ((\\x.n Z (g j) (\\p.(\\o.j) (\\p.x))) (j (x y (\\p.E)))) (\\f.l))) (n (\\t.\\f.t ((\\k.z) S))) (W J)) (\\o.(\\z.\\y.\\q.\\k.\\u.d (\\x.(\\c.\\v.g) (\\m.\\x.\\w.(\\y.m) (\\i.c K) ((\\i.j b) (\\r.g v)))) Y (\\d.e (\\i.\\t.\\r.\\c.s ((\\w.q) d)) o)) (r ((\\r.y) (\\b.(\\f.W S) (K N (\\m.d)) (\\y.\\o.\\f.f ((\\s.i) (Z u))) ((\\v.\\h.K w) (\\b.\\d.J m) (\\d.i o)))) h))",
      "p g (\\n2.h (\\f.\\o.\\y.\\q.\\k.\\u.d (\\x.\\v.g) Y (\\d.e (\\i.\\t.\\r.\\c.s (q)) o))) (W J)"
    );
  }

  @Test
  public final void test47() {
    reducesTo(
      "\\b.k (\\r.\\e.U) ((\\y.(\\n.(\\x.\\i.\\h.D) (\\t.\\m.o)) l) (\\y.(\\z.t) (\\v.L) B))",
      "\\b.k (\\r.\\e.U) (\\i.\\h.D)"
    );
  }

  @Test
  public final void test48() {
    reducesTo(
      "(\\y.t ((\\l.v (j (H i)) (p ((\\a.F) (\\d.q)))) (\\p.f (\\l.O))) (A (\\e.\\m.\\t.s)) (\\m.(\\i.(\\k.r T (a d) (\\r.q) (\\z.t)) (\\k.F) (\\s.(\\x.\\t.e) s ((\\i.\\k.W s) a) (m (\\e.f ((\\g.g) (X j)))))) v)) (k (x (\\q.A X (\\g.m) M g V k))) ((\\e.g) (\\a.U))",
      "t (v (j (H i)) (p (F))) (A (\\e.\\m.\\t.s)) (\\m.r T (a d) (\\r.q) (\\z.t) (\\s.e (m (\\e.f (X j))))) (g)"
    );
  }

  @Test
  public final void test49() {
    reducesTo(
      "\\m.\\i.\\n.\\k.(\\c.d) (\\q.(\\j.e) w l)",
      "\\m.\\i.\\n.\\k.d"
    );
  }

  @Test
  public final void test50() {
    reducesTo(
      "(\\k.(\\c.\\t.\\y.(\\l.b (\\u.(\\v.(\\h.v) (E o)) (A b)) ((\\b.\\y.(\\w.h) T) (\\c.\\k.\\j.g ((\\h.f) p)))) (\\o.\\t.(\\y.R z (g y) (\\d.\\u.r)) h ((\\n.\\s.l (\\n.h)) (\\s.j)))) (\\a.P)) F (\\f.t) (\\f.(\\a.\\i.\\u.(\\q.x (\\f.\\k.\\v.\\t.J u (K o)) ((\\m.i) (\\r.\\e.f)) (s ((\\v.a) (G (j (w l)))))) (\\w.\\t.\\j.\\b.i p)) (\\y.\\o.\\d.(\\a.b) (\\k.(\\i.q) o)) n)",
      "b (\\u.A b) (\\y.h)"
    );
  }

  @Test
  public final void test51() {
    reducesTo(
      "(\\b.\\p.\\a.\\f.Q (\\c.m)) (\\f.(\\p.\\g.(\\z.s (t (m o) (o (\\r.D)))) (\\i.\\q.w)) ((\\m.(\\f.\\r.\\h.\\j.\\u.g (j g)) ((\\i.u) y)) (\\j.V)) (y ((\\o.b) (\\h.d k W) (\\r.\\k.G A (\\l.h) W) (\\c.\\h.(\\p.E a (G l) e) (\\v.\\j.j k)))) (o e) (\\j.(\\u.L) r ((\\a.e) m)))",
      "\\p.\\a.\\f.Q (\\c.m)"
    );
  }

  @Test
  public final void test52() {
    reducesTo(
      "\\r.X ((\\m.u) G u)",
      "\\r.X (u u)"
    );
  }

  @Test
  public final void test53() {
    reducesTo(
      "(\\z.j E (\\e.n)) X",
      "j E (\\e.n)"
    );
  }

  @Test
  public final void test54() {
    reducesTo(
      "\\p.x",
      "\\p.x"
    );
  }

  @Test
  public final void test55() {
    reducesTo(
      "\\b.F ((\\f.\\v.\\e.\\p.\\m.\\m.J) ((\\b.S H) (\\x.\\j.i C p (\\e.M (o g)) ((\\l.s) (\\t.q)))) k ((\\d.\\i.\\w.\\h.\\v.Z) (\\o.\\g.\\x.J ((\\v.X) ((\\d.i) (\\r.\\l.\\n.i)))) ((\\g.\\i.q (j (w y (\\l.h)))) (\\t.\\y.w) (k (\\a.W)))) (f ((\\z.g) V n)))",
      "\\b.F (\\m.\\m.J)"
    );
  }

  @Test
  public final void test56() {
    reducesTo(
      "O (\\b.M) ((\\d.U) (\\o.\\f.w) (\\h.q (J (\\c.\\t.\\r.(\\l.j) j ((\\z.U) (\\u.u))) w)) (\\r.\\l.e) (u ((\\y.R W X) l ((\\u.P (\\h.o)) (\\x.\\d.x)) ((\\j.q w) s i)) (\\j.(\\a.\\e.o) (\\q.k)) y))",
      "O (\\b.M) (U (\\h.q (J (\\c.\\t.\\r.j (U)) w)) (\\r.\\l.e) (u (R W X (P (\\h.o)) (q w i)) (\\j.\\e.o) y))"
    );
  }

  @Test
  public final void test57() {
    reducesTo(
      "v (M (\\j.x m J (\\z.I o (e T)) ((\\z.\\w.\\v.l) (u t (\\g.v))) (\\o.d)) ((\\o.\\w.\\p.(\\e.\\f.x) (\\x.t)) (\\b.t ((\\w.e) (L x))) (j ((\\k.b) (s g)) (N (\\v.\\q.V h))) (\\e.\\u.\\q.\\n.u (\\w.v) l ((\\b.\\n.\\y.b) (\\b.(\\j.n) Q)) (\\f.(\\f.n) ((\\u.n c h) (\\q.\\s.n i))))) (\\u.(\\p.D (\\p.(\\b.\\o.\\y.\\l.q) ((\\v.(\\m.f) c) (\\p.K)) (t M))) (\\i.x))) (\\p.k)",
      "v (M (\\j.x m J (\\z.I o (e T)) (\\w.\\v.l) (\\o.d)) (\\f.x) (\\u.D (\\p.\\y.\\l.q))) (\\p.k)"
    );
  }

  @Test
  public final void test58() {
    reducesTo(
      "(\\l.\\h.q ((\\j.s) v E ((\\i.e) ((\\l.(\\u.p (\\c.w) (\\m.e)) (B (\\o.\\g.e e))) (\\i.(\\z.r D (\\i.W) (R u (\\j.s))) (\\s.\\w.\\v.\\u.U p (\\h.o)))) (\\u.\\x.(\\d.\\g.m (\\r.(\\a.B) (\\g.y) (Y d C) (k k (a c) (O H (\\k.E))))) a)))) ((\\n.(\\h.i) (\\p.\\h.r r)) (\\l.(\\a.(\\r.(\\x.(\\o.\\y.\\p.z V (\\r.\\j.\\s.t)) (\\z.\\x.(\\e.\\y.(\\s.S g) ((\\h.E) (k r))) (k t (\\r.g) (\\a.e)))) z) (\\e.\\u.\\h.(\\x.\\k.t) (e s f ((\\l.Q) (\\m.m)) (\\l.a d (\\i.Y) ((\\z.v) (\\p.w)))) (v ((\\x.K) X)))) (\\n.(\\m.\\m.x) (\\n.I) (\\r.(\\h.b) (S l) (X p)) j g (\\e.U))))",
      "\\h.q (s E (e (\\u.\\x.\\g.m (\\r.B (Y a C) (k k (a c) (O H (\\k.E)))))))"
    );
  }

  @Test
  public final void test59() {
    reducesTo(
      "(\\h.\\r.(\\j.\\u.\\y.\\z.V) ((\\u.(\\o.\\k.\\w.\\v.\\p.R) (\\o.\\i.\\q.\\q.U) (\\q.(\\n.H G (w c) X (\\m.\\i.(\\g.j) ((\\q.L) (\\q.y))) (\\a.u ((\\w.H n (U n)) ((\\w.z) W)))) (\\s.(\\l.j) c))) (\\c.O))) v",
      "\\r.\\u.\\y.\\z.V"
    );
  }

  @Test
  public final void test60() {
    reducesTo(
      "\\x.\\y.v",
      "\\x.\\y.v"
    );
  }

  @Test
  public final void test61() {
    reducesTo(
      "G ((\\d.\\p.\\j.(\\g.\\x.\\m.\\q.Q) ((\\e.r i) (\\k.\\k.E ((\\s.\\a.T) ((\\d.(\\x.L) (r z)) (s (\\s.d)) (\\p.\\o.\\g.k r)))))) (\\u.u ((\\q.(\\s.(\\n.\\u.\\h.q) (\\p.f)) ((\\b.\\i.g u) (\\m.\\e.Q C) (\\j.\\p.k)) e) (\\v.J x n N (\\j.\\g.O (\\b.l r)) (\\s.\\x.\\v.\\f.\\b.n) v))))",
      "G (\\p.\\j.\\x.\\m.\\q.Q)"
    );
  }

  @Test
  public final void test62() {
    reducesTo(
      "\\w.s ((\\u.W) ((\\c.\\j.\\l.(\\y.\\p.A) (\\n.(\\e.\\z.\\l.z) b)) ((\\w.\\x.t ((\\w.e) (L u))) ((\\d.u) (a p) (\\q.y)) (Q ((\\b.\\u.\\h.n) (\\e.\\l.b))))) (\\p.\\l.(\\z.S) ((\\j.\\w.(\\b.\\l.(\\b.(\\i.\\x.t) a) (\\y.(\\t.T) (k s) (n (\\f.T)))) (\\l.\\y.f n (d u) R (\\g.f))) I))) ((\\c.Z) (\\t.(\\z.f (V x (\\v.q) (\\q.\\a.\\e.Q) g)) ((\\x.T) y) (\\h.d)) g)",
      "\\w.s (W (\\p.\\l.S)) (Z g)"
    );
  }

  @Test
  public final void test63() {
    reducesTo(
      "\\s.\\x.(\\n.(\\q.\\q.\\u.(\\k.\\u.(\\i.t) (A (\\w.\\l.z ((\\t.h) (O d) f (\\z.D))))) (\\f.\\t.(\\v.\\d.(\\b.J) (\\y.\\p.g)) ((\\x.(\\n.(\\d.L) (k G)) (\\w.(\\l.c) y) (F (j q) (\\a.\\h.\\t.k))) (\\d.\\x.\\a.\\r.\\e.(\\z.\\p.C) (o z (q d)) (W (\\t.x))) ((\\k.(\\t.\\i.\\u.a) ((\\i.z) (\\u.P)) (r (\\j.(\\l.Y) (\\h.Z)))) L)))) ((\\g.p) ((\\g.g) ((\\p.r (\\e.\\r.(\\h.z) u)) Q)))) (\\x.\\k.(\\m.\\k.P ((\\m.\\h.\\p.k) (X (\\m.w A))) (c (\\e.\\d.P p) (\\t.v) (\\t.P)) l (\\i.(\\r.(\\x.\\s.(\\v.L h (y N) (F l (r e))) (\\j.s) ((\\q.\\f.\\z.(\\i.U) s (\\h.z)) ((\\w.e l (\\v.z)) V))) (\\q.\\c.\\i.\\a.a (\\w.c (\\f.e)) (\\m.\\j.h o) (\\y.(\\v.\\u.(\\h.d S) (c n m)) l))) (\\m.(\\l.D ((\\f.(\\x.(\\x.a) (A v)) (\\m.\\n.\\z.f)) (F w q (\\j.v)))) (\\j.(\\w.\\p.\\i.\\h.(\\t.i) (\\f.\\m.w w t)) D)))) (\\v.(\\v.(\\e.a) (\\j.(\\z.N (\\u.N X (\\p.W) (\\o.q p x)) ((\\m.\\y.h j) (\\j.\\m.\\u.y) (\\b.q (\\j.l h)))) T)) p))",
      "\\s.\\x.\\q.\\u.\\u.t"
    );
  }

  @Test
  public final void test64() {
    reducesTo(
      "\\q.g",
      "\\q.g"
    );
  }

  @Test
  public final void test65() {
    reducesTo(
      "\\n.\\n.B (m (\\f.p ((\\t.(\\c.v) (c d)) (r (u L))) (\\l.\\s.\\i.(\\x.z) (\\n.z) (\\d.k (\\e.F)) (\\q.X)) y) (\\v.\\h.\\e.\\x.(\\o.(\\j.v) r) (\\z.V (\\x.(\\a.(\\c.r) (\\f.j) (O h (\\d.w)) (\\o.m l (s d) (G y u))) T))) (\\j.\\l.\\y.l (\\q.\\d.e)))",
      "\\n.\\n.B (m (\\f.p (v) (\\l.\\s.\\i.z (\\d.k (\\e.F)) (\\q.X)) y) (\\v.\\h.\\e.\\x.v) (\\j.\\l.\\y.l (\\q.\\d.e)))"
    );
  }

  @Test
  public final void test66() {
    reducesTo(
      "m ((\\b.k ((\\p.V) ((\\m.v p b) (\\i.f j (\\m.I) ((\\d.g) (m a)))) (t (\\g.(\\b.q) (\\k.q)) ((\\k.Z) C (\\a.e t (A E)) ((\\h.f I (p w)) (P A))))) (a ((\\u.X) i))) (\\u.(\\k.\\d.(\\w.\\i.(\\i.v g) r) S) (\\l.\\p.j (\\g.(\\f.\\e.\\g.I j) Z) f)))",
      "m (k (V (t (\\g.q) (Z (\\a.e t (A E)) (f I (p w))))) (a (X)))"
    );
  }

  @Test
  public final void test67() {
    reducesTo(
      "(\\d.d) ((\\j.\\c.\\t.h (D (h (\\p.X (\\y.\\m.\\m.f)))) (\\x.r)) ((\\j.\\g.X) v))",
      "\\c.\\t.h (D (h (\\p.X (\\y.\\m.\\m.f)))) (\\x.r)"
    );
  }

  @Test
  public final void test68() {
    reducesTo(
      "\\m.(\\c.c) ((\\i.C) g)",
      "\\m.C"
    );
  }

  @Test
  public final void test69() {
    reducesTo(
      "\\l.k",
      "\\l.k"
    );
  }

  @Test
  public final void test70() {
    reducesTo(
      "\\b.(\\v.\\o.\\x.\\m.\\w.(\\x.(\\a.\\d.(\\i.d) ((\\m.w) ((\\d.t (L m)) (\\i.(\\h.I) (p a))))) v (\\t.\\u.i (t ((\\p.c) (\\x.(\\l.v) (\\h.V)))) (\\u.H))) ((\\g.Z (\\t.(\\w.\\i.y) g)) (e (\\b.d)))) ((\\u.S) r) p",
      "\\b.\\x.\\m.\\w.\\t.\\u.i (t (c)) (\\u.H)"
    );
  }

  @Test
  public final void test71() {
    reducesTo(
      "(\\c.\\j.\\g.\\x.(\\p.(\\b.(\\g.j) (Z (\\l.(\\r.\\g.\\m.\\x.(\\t.s) (Z f)) r))) (\\q.b)) (e (o a (\\t.z) ((\\k.X) (\\t.U)) v (\\x.\\m.q ((\\w.o) (u h)) (\\o.(\\w.D) ((\\j.M) (t O)))) (\\w.\\o.\\b.j)))) (\\j.(\\h.g ((\\k.t) e) (p q (\\k.r) c p) ((\\k.(\\v.K) (\\c.s)) q K ((\\t.\\s.f) (\\w.C)))) (e ((\\o.\\u.\\w.y) (\\r.H ((\\o.W) (\\j.k) v)))) (\\v.M)) V",
      "\\g.\\x.V"
    );
  }

  @Test
  public final void test72() {
    reducesTo(
      "\\h.\\j.f",
      "\\h.\\j.f"
    );
  }

  @Test
  public final void test73() {
    reducesTo(
      "\\t.G",
      "\\t.G"
    );
  }

  @Test
  public final void test74() {
    reducesTo(
      "(\\n.(\\m.\\c.\\a.j) e) (\\s.\\z.o) ((\\t.q) ((\\g.(\\c.B k) (\\u.F) ((\\b.\\a.\\g.b) (\\n.(\\s.Q) (\\g.n))) e) (Q (l c (\\g.d) y) U)) y) Q",
      "j"
    );
  }

  @Test
  public final void test75() {
    reducesTo(
      "(\\h.\\k.f (\\b.w) (O (\\a.i (x s (\\y.f) (\\f.\\m.I) (\\w.(\\q.\\e.i) (\\g.\\f.W W)))) (\\p.(\\s.\\e.\\g.\\l.(\\b.\\s.i) (\\a.a) m) ((\\r.D (\\p.s)) ((\\u.w) c C) c))) z) o",
      "\\k.f (\\b.w) (O (\\a.i (x s (\\y.f) (\\f.\\m.I) (\\w.\\e.i))) (\\p.\\e.\\g.\\l.i)) z"
    );
  }

  @Test
  public final void test76() {
    reducesTo(
      "(\\f.\\y.\\u.\\o.\\c.(\\d.\\w.(\\z.\\k.\\k.o) D) (c (\\w.\\m.(\\q.v (X (\\l.P)) (p (\\x.\\o.i E))) (\\b.D))) (V (V ((\\i.C) ((\\i.U i (\\c.r)) (G (G x)))) l)) (\\h.J)) (o (\\z.q (f ((\\z.\\a.\\k.q) (\\i.(\\v.\\m.i (r R (\\x.d) U)) r)))))",
      "\\y.\\u.\\o.\\c.\\k.o"
    );
  }

  @Test
  public final void test77() {
    reducesTo(
      "\\u.H ((\\o.p) (\\c.(\\s.N) ((\\i.(\\a.\\q.w) (\\x.R h (h Q) (\\g.\\p.\\r.k))) ((\\n.u k) (\\u.\\u.g)) (x e) ((\\x.\\u.r) (\\q.\\h.v) c q))))",
      "\\u.H (p)"
    );
  }

  @Test
  public final void test78() {
    reducesTo(
      "(\\c.(\\p.\\l.X) (\\s.(\\a.(\\s.c b (h i)) (M X p) (E V n r)) (\\r.\\o.u m ((\\c.\\x.\\s.A) (h x p))) (\\v.\\w.(\\d.\\f.(\\e.S) (\\u.A) H ((\\n.(\\m.b) (b y)) (\\b.\\l.k))) (\\i.\\m.m)))) (\\v.W (Z W)) (\\r.\\g.z (\\p.w) (\\j.\\c.\\m.E) ((\\y.\\q.O) h ((\\o.h) (\\k.\\p.f J (\\l.R) Y)) (\\t.\\t.\\a.n ((\\x.\\l.\\t.f (\\n.F)) S))) (\\o.P)) (\\e.o)",
      "X (\\e.o)"
    );
  }

  @Test
  public final void test79() {
    reducesTo(
      "(\\u.\\u.\\i.\\p.\\p.b (\\m.\\l.\\p.m (\\o.C (T ((\\j.E) ((\\k.F) (\\j.u d (j d) (\\f.\\a.l)))))))) ((\\a.\\p.\\d.n) (\\q.(\\q.\\i.E k (r h) (\\u.\\l.r)) (\\j.(\\t.r E (l K)) (\\t.c)) (\\m.\\p.(\\v.(\\w.\\b.e) Z) (a p (g T) (N r w)))) N ((\\t.g) ((\\w.\\f.\\q.b) H)) (\\c.(\\s.\\d.\\z.(\\r.\\v.(\\m.\\u.(\\e.x (\\b.I ((\\d.D) (\\e.s)))) (\\d.(\\x.h) B)) U) ((\\c.\\f.\\t.(\\n.z) (\\j.b a (g p) (f k (t G)) (a (y c R)))) (\\v.g))) ((\\m.\\b.w u C (\\r.z (\\l.u (\\h.k))) ((\\a.\\z.d) (\\c.t Z (y s)) a)) U h)))",
      "\\u.\\i.\\p.\\p.b (\\m.\\l.\\p.m (\\o.C (T (E))))"
    );
  }

  @Test
  public final void test80() {
    reducesTo(
      "\\k.\\b.g",
      "\\k.\\b.g"
    );
  }

  @Test
  public final void test81() {
    reducesTo(
      "\\h.\\k.e ((\\v.L) ((\\c.\\m.\\x.(\\x.\\w.S ((\\y.r z (f m) (M (\\r.q))) o (\\r.(\\h.\\p.I) d Q))) ((\\n.\\c.(\\c.G (\\d.(\\m.v) (\\i.F) ((\\o.j) (\\q.c)))) S) (\\j.(\\s.\\o.\\f.s (\\g.h H) (x (\\t.t T))) (H q (\\z.e) (v I (p v)) (\\t.W))))) K))",
      "\\h.\\k.e (L)"
    );
  }

  @Test
  public final void test82() {
    reducesTo(
      "(\\g.(\\x.j M) (\\p.R)) ((\\f.(\\l.T (\\x.\\w.i) (\\u.b) ((\\k.(\\z.w) (n h)) (\\k.u) ((\\r.S) (\\b.\\r.\\b.V)) (\\d.R))) (\\b.(\\g.S) ((\\z.\\y.\\w.\\s.u) A) (\\k.(\\j.(\\t.\\n.\\x.A) (\\j.v w (d U))) (d (u y)) (\\d.o A (h N) (\\u.\\x.v) ((\\f.J) (q t) (\\g.\\r.d)))))) (z Y p) (\\h.(\\k.(\\q.H) (\\c.\\s.\\f.X)) (O (\\g.\\q.\\f.\\y.(\\f.i) (\\r.\\b.(\\l.q) (\\v.c))) (\\y.\\r.I ((\\l.(\\v.H) c) h))) ((\\r.b (\\j.\\i.\\t.q) ((\\r.\\b.(\\a.U) (b C) (s (\\v.D))) (I k) (\\h.F))) (c (\\x.\\e.\\n.G ((\\b.\\t.P n) m l))))))",
      "j M"
    );
  }

  @Test
  public final void test83() {
    reducesTo(
      "\\p.\\v.W",
      "\\p.\\v.W"
    );
  }

  @Test
  public final void test84() {
    reducesTo(
      "\\l.n (\\w.\\h.\\e.E (q ((\\f.\\m.\\z.\\h.s) ((\\n.\\v.Z u) (\\e.\\s.X f) (q (\\n.R) f) (d ((\\b.y) z J))))) (m ((\\v.\\v.(\\m.H) ((\\o.(\\f.(\\e.J) (Z I)) (C (P s)) q) (\\u.(\\u.\\w.l) (\\h.\\x.\\s.(\\e.z X) (\\o.\\z.p))))) s)))",
      "\\l.n (\\w.\\h.\\e.E (q (\\m.\\z.\\h.s)) (m (\\v.H)))"
    );
  }

  @Test
  public final void test85() {
    reducesTo(
      "L (\\n.\\d.(\\y.\\s.\\b.(\\e.\\t.\\n.\\d.\\m.h) (\\p.\\f.y)) (\\y.j))",
      "L (\\n.\\d.\\s.\\b.\\t.\\n.\\d.\\m.h)"
    );
  }

  @Test
  public final void test86() {
    reducesTo(
      "(\\b.\\n.p ((\\z.b (\\s.(\\e.(\\c.S) (\\g.H) (\\t.H)) v) (\\s.y)) (\\d.r)) h) (\\t.x)",
      "\\n.p (x (\\s.y)) h"
    );
  }

  @Test
  public final void test87() {
    reducesTo(
      "I b ((\\s.\\g.D) (E ((\\x.s) s) (F g y)))",
      "I b (\\g.D)"
    );
  }

  @Test
  public final void test88() {
    reducesTo(
      "t ((\\z.\\e.\\c.q) (\\w.\\q.S y) (\\w.\\v.i)) (u b (\\m.g)) (\\r.\\v.\\p.(\\d.\\z.\\z.\\t.\\u.Y) ((\\q.Q) ((\\w.t) (A o)) (H k (\\y.f) (\\l.\\f.\\j.y)) (E (w (H (w c)))))) ((\\i.(\\e.\\r.d) (\\n.g)) i) ((\\v.G) ((\\n.(\\p.\\k.w (X F)) (\\v.(\\d.\\x.E) ((\\o.q i (\\h.a)) (\\g.(\\t.W) (c b)))) ((\\b.z) (\\i.(\\e.n) ((\\t.\\a.i l) (q M y))))) T)) (I (H (g (V ((\\s.G F (l y) (\\g.t)) ((\\t.H) (\\e.l) (\\t.\\z.i T)) (\\z.\\b.k))))))",
      "t (\\c.q) (u b (\\m.g)) (\\r.\\v.\\p.\\z.\\z.\\t.\\u.Y) (\\r.d) (G) (I (H (g (V (G F (l y) (\\g.t) (\\z.\\b.k))))))"
    );
  }

  @Test
  public final void test89() {
    reducesTo(
      "(\\p.L) P",
      "L"
    );
  }

  @Test
  public final void test90() {
    reducesTo(
      "\\b.x (\\x.(\\r.v a (\\t.(\\p.\\p.t) (\\f.R))) ((\\x.\\r.e (H a (\\d.(\\j.n) (\\y.\\e.\\a.(\\k.f) (\\j.b) t)))) (\\m.v))) ((\\g.(\\f.(\\o.E Y (e Y) (\\x.\\g.U) ((\\e.\\e.\\s.l) (\\i.n))) (\\d.\\w.L h)) (m (\\h.c)) ((\\x.\\y.(\\d.k) (\\p.b) (\\r.c)) (\\o.\\j.(\\p.w) (\\j.V) (J i (z t))) (\\f.n (\\e.\\e.\\s.p)) (\\x.(\\u.H (\\u.u)) (t (\\n.V)) (q (z (\\l.t))) ((\\t.o) Z (M g (M B)) (s (\\v.\\d.\\e.p))))) (\\t.c (\\g.\\e.x i))) (\\f.z))",
      "\\b.x (\\x.v a (\\t.\\p.t)) (E Y (e Y) (\\x.\\g.U) (\\e.\\s.l) (k (\\r.c) (\\x.H (\\u.u) (q (z (\\l.t))) (o (M (\\f.z) (M B)) (s (\\v.\\d.\\e.p))))) (\\t.c (\\g.\\e.x i)))"
    );
  }

  @Test
  public final void test91() {
    reducesTo(
      "\\i.(\\s.\\t.\\c.c) (\\q.\\n.\\o.(\\n.q ((\\p.\\x.\\u.\\q.\\a.\\y.h) (\\r.\\d.C (o (\\e.\\r.e U))))) (\\n.\\e.\\g.(\\x.(\\i.o (\\q.B (\\d.l))) (t e (k w) (i B (\\c.o))) (\\l.(\\z.q (\\v.l)) (H t (j l)) (\\j.N))) (\\c.(\\i.\\v.\\s.c) u (\\k.\\s.(\\g.C) (j z) (h d (\\s.G))) M)) ((\\u.(\\p.o) (\\n.(\\u.A) (\\h.c)) (b (i f) ((\\w.D) (J r))) (\\e.\\z.\\u.\\e.\\c.\\s.Y)) c ((\\j.(\\g.(\\s.\\b.z) ((\\i.E) (k n)) (\\i.\\z.\\r.\\q.(\\r.z) (z e))) (Q ((\\m.w) ((\\c.y) (\\a.h))))) n)) p)",
      "\\i.\\t.\\c.c"
    );
  }

  @Test
  public final void test92() {
    reducesTo(
      "(\\b.x c) (\\s.(\\q.(\\w.\\n.j) ((\\f.\\o.\\j.\\p.f) ((\\v.\\h.(\\k.Z) (G (p q) (K (\\i.l)))) ((\\a.n G (m s)) (Y p) (\\y.x))) (k (\\v.\\c.B (\\e.f S)) (\\u.\\q.\\p.\\e.\\u.\\q.(\\k.q (\\w.x)) H) (\\x.\\s.\\c.(\\y.(\\i.U) o ((\\o.o) (v o)) (\\d.\\s.\\z.\\a.\\b.\\r.Z)) (\\n.(\\i.n (\\z.c w)) (v (n (\\w.H)))))))) (\\z.(\\y.T) (\\i.\\w.\\e.g) (\\o.\\v.\\r.\\f.\\n.S ((\\x.\\v.(\\v.t ((\\s.\\m.u W) ((\\s.l) (s K)))) ((\\a.S) (\\q.O) n)) (\\s.\\z.(\\s.R A (g l) (N j (\\q.t)) (\\u.v)) ((\\h.C) (s v) (\\s.f U (a q)) (\\p.(\\l.W) m z)))))))",
      "x c"
    );
  }

  @Test
  public final void test93() {
    reducesTo(
      "(\\h.h) ((\\h.k) (\\c.\\e.O (\\n.(\\t.(\\e.\\l.\\s.c) (\\x.(\\e.y) (\\t.N))) (z J)) (\\p.f x))) j ((\\q.(\\e.p) t) (\\a.(\\q.J) (\\k.\\x.(\\s.I) t (\\j.\\p.d)) ((\\q.s) (\\q.e) v (C (\\y.\\z.n f))) (K c) (\\z.(\\g.M U (\\p.\\m.o) (\\c.\\a.(\\f.V y p) (\\n.(\\u.C) (i p)) (\\b.\\w.\\o.\\z.\\z.J))) (\\v.o)) ((\\g.\\p.(\\a.y r) (\\z.\\p.\\k.\\r.\\u.(\\f.\\r.e u) (T f s) (\\h.(\\w.\\x.S) (x x (\\t.z))) (\\i.\\g.D))) ((\\r.\\t.x W u ((\\l.N) (\\w.u))) (\\h.V) (Z (g b) (\\q.f h (O h)) (\\x.(\\h.\\n.\\q.b) ((\\t.d) (U i)))) (y (c (\\w.(\\z.(\\k.D) (\\c.y)) K)))))))",
      "k j (p)"
    );
  }

  @Test
  public final void test94() {
    reducesTo(
      "c V (\\r.\\r.\\q.k (\\x.S) (\\t.\\a.C) j)",
      "c V (\\r.\\r.\\q.k (\\x.S) (\\t.\\a.C) j)"
    );
  }

  @Test
  public final void test95() {
    reducesTo(
      "Y (\\u.b)",
      "Y (\\u.b)"
    );
  }

  @Test
  public final void test96() {
    reducesTo(
      "\\x.\\m.(\\q.L l (c n)) (\\e.(\\d.J) (p J)) (W J m) ((\\p.m) (\\x.s) q ((\\x.d) m)) (\\m.\\w.(\\d.(\\b.p (\\o.k)) (\\d.y)) (\\p.t) ((\\b.Q) (\\p.l) r (x (\\s.\\y.u)))) ((\\s.\\a.f) R) ((\\a.f) (\\h.u) ((\\o.\\r.\\j.\\v.\\h.\\w.d (\\b.G)) (\\t.\\g.w)) ((\\f.f) (\\q.e) (\\h.D))) (O (\\x.\\w.(\\r.\\r.F (n (\\x.(\\n.j) ((\\a.D (b R)) (\\h.\\z.t k))))) (\\p.\\j.R))) (\\g.b (\\z.K))",
      "\\x.\\m.L l (c n) (W J m) (m q (d)) (\\m.\\w.p (\\o.k) (Q r (x (\\s.\\y.u)))) (\\a.f) (f (\\r.\\j.\\v.\\h.\\w.d (\\b.G)) (e)) (O (\\x.\\w.\\r.F (n (\\x.j)))) (\\g.b (\\z.K))"
    );
  }

  @Test
  public final void test97() {
    reducesTo(
      "(\\b.v) e ((\\l.\\c.(\\t.\\z.n) ((\\j.(\\b.h) (\\d.\\r.(\\s.Y s) (M (W d))) ((\\k.\\v.(\\h.d l) u) w)) S ((\\s.(\\q.j) (\\h.\\s.u r (\\j.g) ((\\q.E) (\\u.u))) (\\v.\\z.\\s.s)) q))) ((\\o.(\\x.\\z.\\m.(\\i.r (\\j.l)) l) q) (\\g.(\\u.\\w.A (\\r.s (n M)) a) w ((\\w.\\e.\\i.\\q.\\d.(\\l.k g) k (\\u.\\u.s)) (\\b.j))) (y u (\\c.\\d.m))))",
      "v (\\c.\\z.n)"
    );
  }

  @Test
  public final void test98() {
    reducesTo(
      "\\o.\\v.\\e.(\\l.\\m.\\a.d) (\\d.(\\h.k) (p t (\\d.l)) ((\\p.h) (\\h.j) (\\g.\\u.\\s.h)) a (\\z.(\\i.R) i) (\\o.(\\k.\\e.a (\\d.(\\u.(\\u.B) (i u)) (b p (\\f.m))) (\\f.n w)) H)) ((\\m.E) ((\\k.(\\s.\\m.d) (S (i K (\\b.t) (o X (e y)) ((\\g.o) (v q) (\\g.u (\\x.L)))))) t)) (\\h.p ((\\w.y q ((\\x.K P) e)) (\\u.\\j.\\o.(\\p.\\h.q ((\\j.\\y.M l) (e (\\v.M))) (\\w.k (\\z.D) ((\\f.h) (o c)) (Y (\\z.w g (n t))))) (\\k.(\\k.(\\h.(\\s.c) (t (s E))) w) p))) ((\\x.\\z.r) i ((\\p.B) (\\u.(\\u.o (z (\\b.A))) e)) z ((\\q.(\\g.\\i.(\\o.\\d.\\j.(\\d.\\f.m) (\\x.\\h.r)) (\\y.U)) X) ((\\h.\\c.\\u.\\t.P) (J ((\\y.p) (\\c.n))) (n (\\c.s j (\\b.t) (H X v))) (\\q.f)))))",
      "\\o.\\v.\\e.d"
    );
  }

  @Test
  public final void test99() {
    reducesTo(
      "S ((\\g.\\b.\\r.\\o.Y) ((\\h.(\\d.(\\d.l) (\\p.f) (p J (j n))) (\\p.H) (R (t (\\i.w)) v) g) t)) (d (\\i.\\a.(\\h.\\f.l) l))",
      "S (\\b.\\r.\\o.Y) (d (\\i.\\a.\\f.l))"
    );
  }

  @Test
  public final void test100() {
    reducesTo(
      "\\x.(\\f.S ((\\j.\\v.I p) P ((\\v.\\v.n d) (J q (\\p.K))) w ((\\m.y) ((\\o.(\\x.C (\\i.O)) (X W)) v)) X (\\z.x))) (\\l.(\\e.(\\l.\\i.w) r ((\\i.\\q.\\l.(\\i.(\\s.\\u.t) ((\\a.R) (\\i.q))) k) k) ((\\p.\\o.s ((\\v.N) (e L)) ((\\d.l) (S K) (\\d.I))) (\\x.v) M) (q (\\a.T ((\\w.c) ((\\t.W) ((\\d.Q) (\\u.j (w m)))))))) (\\w.\\v.n (\\c.(\\e.\\z.(\\b.s (\\w.\\a.X F)) (\\w.\\n.s) n) ((\\p.m) ((\\n.y) (\\z.\\c.\\h.d) ((\\w.r) A ((\\h.d) (d b))))) (\\i.w))))",
      "\\x.S (I p w (y) X (\\z.x))"
    );
  }

  @Test
  public final void test101() {
    reducesTo(
      "(\\q.u) (\\n.\\w.\\q.(\\v.w) ((\\n.\\u.I n ((\\u.\\m.\\f.\\o.\\u.(\\t.t (\\z.w x)) (\\t.v g) (M (\\f.\\x.r) T)) (\\y.K (q (\\q.n))))) (\\r.\\k.\\u.\\n.t (z b r ((\\i.p) (W s))) ((\\g.k) (q g) (w (k T)) ((\\n.c) (\\u.S) k)) (p (X l) (P N p (\\i.(\\a.E) (\\j.e))) (\\s.g)) (\\l.\\a.s ((\\d.(\\g.(\\t.i) (O i) (\\k.T)) (\\s.p)) (r (\\a.\\c.(\\s.x r) (o O A))))))))",
      "u"
    );
  }

  @Test
  public final void test102() {
    reducesTo(
      "(\\x.\\x.\\l.\\b.\\b.\\w.(\\v.H) t) (\\e.\\v.d (w h))",
      "\\x.\\l.\\b.\\b.\\w.H"
    );
  }

  @Test
  public final void test103() {
    reducesTo(
      "\\n.\\o.(\\f.r (\\z.\\z.c) (f (\\x.B) ((\\e.u) (A f) (\\j.j (b k)))) (X (\\s.\\f.W)) (l (\\s.\\q.(\\y.r) (\\d.\\u.\\s.\\c.\\g.\\y.c) X)) (\\l.(\\d.U t) (\\r.K)) (\\s.(\\w.f ((\\x.x (\\t.Z)) n)) l)) p",
      "\\n.\\o.r (\\z.\\z.c) (p (\\x.B) (u (\\j.j (b k)))) (X (\\s.\\f.W)) (l (\\s.\\q.r X)) (\\l.U t) (\\s.p (n (\\t.Z)))"
    );
  }

  @Test
  public final void test104() {
    reducesTo(
      "\\g.(\\q.(\\h.(\\y.\\m.\\e.(\\h.\\j.s (\\t.v) (z C)) k ((\\t.\\y.(\\d.k) (\\p.\\j.w)) (\\l.(\\i.v k (\\j.I)) l)) (h (\\q.(\\n.O) (\\s.l) p ((\\y.d (\\z.e)) (b d (D w)))))) ((\\d.\\c.(\\f.B) (h P) (O n (\\z.q)) (f (y m e)) (\\v.\\b.\\d.m (\\h.x) (\\x.\\r.x) ((\\n.\\v.y) (\\g.k q)))) (o (L m (\\v.q)) O (\\e.Y b)))) o ((\\v.h ((\\x.R g) (\\v.(\\d.m) (\\x.(\\t.\\m.b H) H) (\\m.\\c.\\b.(\\o.(\\a.\\k.u) (\\l.\\r.c)) (\\z.e))))) m)) (a (\\c.\\v.\\u.\\n.\\q.(\\v.\\a.(\\g.d (\\w.j)) (b (\\b.B) (P f v)) b) w) G ((\\n.\\i.\\t.\\p.\\k.u z C ((\\t.B) ((\\h.(\\w.(\\f.T) (\\t.e) (O J (\\c.c))) (T ((\\t.y) (E p)))) (c (\\o.\\a.N m))))) (\\w.\\z.\\n.v ((\\l.\\p.N) (w J)))))",
      "\\g.\\e.s (\\t.v) (z C) (o (\\q.O p (d (\\z.e))))"
    );
  }

  @Test
  public final void test105() {
    reducesTo(
      "\\e.\\g.\\f.d",
      "\\e.\\g.\\f.d"
    );
  }

  @Test
  public final void test106() {
    reducesTo(
      "\\d.h k",
      "\\d.h k"
    );
  }

  @Test
  public final void test107() {
    reducesTo(
      "(\\y.\\w.\\q.\\z.(\\f.x) ((\\k.m) (\\h.Y) ((\\n.w) (\\x.R)) (\\t.\\j.p) (\\p.N))) (\\u.\\n.\\e.\\h.\\x.(\\o.m) (\\r.U)) (\\t.\\t.\\x.l (\\f.f) (\\m.H)) (\\c.x (\\g.\\z.(\\i.Q (\\c.l (\\i.(\\y.B) e) q) (\\j.(\\j.\\m.\\z.m) N)) (G ((\\x.\\s.w) (\\c.s))))) i",
      "x"
    );
  }

  @Test
  public final void test108() {
    reducesTo(
      "(\\t.l) ((\\r.\\a.\\b.n) (\\u.(\\p.\\c.\\l.a l (\\u.r (c c) (a H (h w)) (\\m.\\y.(\\i.\\h.g) z)) (\\r.(\\v.\\a.\\r.\\k.\\q.\\z.\\f.z) i (\\b.\\s.r (y z)))) (N Q ((\\p.p) L)))) (\\b.(\\f.\\c.\\e.U) ((\\c.r) ((\\i.\\g.(\\l.e) ((\\v.g) m)) q)) e ((\\l.q ((\\i.\\g.\\n.\\r.q) ((\\p.V) (\\s.\\q.(\\i.z) d (\\n.Q g)) (\\v.v)))) (\\d.(\\n.j) T m)))",
      "l (\\b.U)"
    );
  }

  @Test
  public final void test109() {
    reducesTo(
      "(\\f.\\o.q) (\\z.(\\j.\\b.\\s.s) T (\\q.T)) D (K i)",
      "q (K i)"
    );
  }

  @Test
  public final void test110() {
    reducesTo(
      "(\\j.x (\\f.E)) (\\p.P) (\\r.\\c.\\a.\\y.u (i z) x) (\\k.b)",
      "x (\\f.E) (\\r.\\c.\\a.\\y.u (i z) x) (\\k.b)"
    );
  }

  @Test
  public final void test111() {
    reducesTo(
      "(\\z.i) ((\\o.(\\v.\\t.N (\\x.\\g.(\\m.i) (\\n.\\k.(\\e.\\f.\\o.Q) (Z t C) (o (\\o.\\c.U x)) j))) (z ((\\q.\\a.\\k.Z) (C f (o k)) (\\l.s) (\\v.\\r.H)) (\\e.\\g.J))) (\\q.\\p.\\d.(\\o.t (\\j.(\\h.\\i.(\\a.Q) (\\w.o) (l s (\\e.d))) ((\\v.Z) w (\\y.\\u.\\n.v)))) (\\d.W) (\\s.\\n.\\z.\\i.(\\d.d) ((\\k.(\\d.I) ((\\z.f) (\\y.j))) n)) (\\b.l)))",
      "i"
    );
  }

  @Test
  public final void test112() {
    reducesTo(
      "\\p.m (i (f (\\y.J)) (p (\\a.F)))",
      "\\p.m (i (f (\\y.J)) (p (\\a.F)))"
    );
  }

  @Test
  public final void test113() {
    reducesTo(
      "\\a.(\\s.\\c.(\\p.s) (\\b.t)) ((\\b.U) ((\\b.(\\l.(\\t.\\g.k) ((\\x.\\i.t) (\\o.\\g.g o))) (\\d.r c)) (\\l.(\\h.o) (\\m.w ((\\k.\\n.\\o.g) (\\c.y C (t G))))))) (\\e.z) ((\\l.E) i)",
      "\\a.U (E)"
    );
  }

  @Test
  public final void test114() {
    reducesTo(
      "(\\m.(\\q.\\b.v) (\\p.(\\z.\\t.(\\v.\\p.h (\\e.\\y.\\j.\\v.\\j.\\d.\\s.s)) (\\g.O)) L)) (\\q.(\\t.C) ((\\j.\\i.\\m.\\f.C) ((\\x.c) h (\\e.\\c.(\\u.\\f.a) ((\\l.\\y.T) m) U))))",
      "\\b.v"
    );
  }

  @Test
  public final void test115() {
    reducesTo(
      "(\\t.T) (\\v.\\f.h) (\\n.\\w.(\\k.h) F (\\u.b) i f)",
      "T (\\n.\\w.h (\\u.b) i f)"
    );
  }

  @Test
  public final void test116() {
    reducesTo(
      "G ((\\j.B (\\v.Z (\\v.(\\f.j) (\\j.n (\\q.o))) (\\j.\\r.\\i.o) (j n (U K) (e (\\w.p)) (G (h (s K))) (V ((\\k.C) v))))) (F (\\r.E)) w)",
      "G (B (\\v.Z (\\v.F (\\r.E)) (\\j.\\r.\\i.o) (F (\\r.E) n (U K) (e (\\w.p)) (G (h (s K))) (V (C)))) w)"
    );
  }

  @Test
  public final void test117() {
    reducesTo(
      "\\w.\\t.\\t.\\o.(\\a.F) (\\w.g)",
      "\\w.\\t.\\t.\\o.F"
    );
  }

  @Test
  public final void test118() {
    reducesTo(
      "\\e.\\o.\\c.\\i.\\b.q ((\\u.v ((\\m.n (\\i.\\d.\\g.k (\\f.(\\l.\\c.\\r.t) (b M (v Z)) (\\t.(\\a.S) v (\\n.\\p.i))))) (\\a.m L))) w)",
      "\\e.\\o.\\c.\\i.\\b.q (v (n (\\i.\\d.\\g.k (\\f.\\r.t))))"
    );
  }

  @Test
  public final void test119() {
    reducesTo(
      "a (w ((\\r.b (\\v.m)) (\\a.(\\v.E) ((\\k.\\x.\\b.V) (\\c.\\p.h B)) (\\i.j (x J (q e)) (s (\\w.g (H g)))) (j I (\\v.\\z.d))))) (\\q.\\o.D (m (M N ((\\u.Y) (g (\\s.H) (Y v))))))",
      "a (w (b (\\v.m))) (\\q.\\o.D (m (M N (Y))))"
    );
  }

  @Test
  public final void test120() {
    reducesTo(
      "T ((\\e.\\p.b) (\\t.G Z)) (\\l.k)",
      "T (\\p.b) (\\l.k)"
    );
  }

  @Test
  public final void test121() {
    reducesTo(
      "(\\m.a) X",
      "a"
    );
  }

  @Test
  public final void test122() {
    reducesTo(
      "\\c.H",
      "\\c.H"
    );
  }

  @Test
  public final void test123() {
    reducesTo(
      "\\c.(\\u.\\m.(\\d.(\\t.\\b.(\\g.g) (M f) (\\x.q w)) (A C (\\l.P) v) (\\z.\\f.(\\t.C ((\\o.B) (\\b.u))) (P (\\b.n (\\j.w)))) (\\m.B (\\x.\\v.w)) (S ((\\w.(\\c.(\\v.Y) (N h (q y))) ((\\r.(\\t.v) (C g)) (\\s.\\j.\\k.A))) (a K)))) (\\g.\\y.\\u.\\l.\\m.o) (\\r.N)) j",
      "\\c.\\m.M f (\\x.q w) (\\m.B (\\x.\\v.w)) (S (Y)) (\\r.N)"
    );
  }

  @Test
  public final void test124() {
    reducesTo(
      "(\\n.d) b (i ((\\u.I) (\\b.\\j.(\\j.\\c.(\\o.t) (\\g.\\l.z)) ((\\q.v) (\\d.x) (J c W))))) x (\\m.(\\d.\\x.(\\q.n) (\\x.(\\h.t) ((\\z.K r (\\e.o)) G)) Q) p) (\\v.(\\c.\\l.x u (\\j.\\v.y) (\\m.\\k.\\d.\\l.(\\z.\\m.(\\z.d o) (G ((\\t.M) (d z) (\\z.D (Q y)) (\\u.K (\\o.(\\c.L) (\\l.n)))))) (\\k.(\\l.\\t.(\\w.\\d.\\r.X F) ((\\d.M) ((\\d.y) (f R))) (M (i u ((\\b.o) (\\n.Z))))) (\\d.P)))) (\\w.d))",
      "d (i (I)) x (\\m.\\x.n Q) (\\v.\\l.x u (\\j.\\v.y) (\\m.\\k.\\d.\\l.\\m.d o))"
    );
  }

  @Test
  public final void test125() {
    reducesTo(
      "r (\\a.d (B (\\m.x (r a l (y p (g j))))) ((\\b.\\i.K y) (\\j.h r) (t i (\\p.I) (\\f.b Z (i n))) (\\a.\\j.(\\d.\\l.x d) t) (u g ((\\x.\\t.C) (\\v.\\i.\\k.(\\j.P) (\\w.l) (c i (P b)))))) (\\i.v) k)",
      "r (\\a.d (B (\\m.x (r a l (y p (g j))))) (K y (\\a.\\j.\\l.x t) (u g (\\t.C))) (\\i.v) k)"
    );
  }

  @Test
  public final void test126() {
    reducesTo(
      "d ((\\d.\\q.F) ((\\t.j) ((\\q.\\i.(\\k.U) (e o (\\b.s))) (\\w.\\u.x)) (\\l.b) k ((\\q.v) ((\\b.\\x.G) (\\u.\\r.C)))))",
      "d (\\q.F)"
    );
  }

  @Test
  public final void test127() {
    reducesTo(
      "\\y.f",
      "\\y.f"
    );
  }

  @Test
  public final void test128() {
    reducesTo(
      "(\\y.\\y.\\n.y) q",
      "\\y.\\n.y"
    );
  }

  @Test
  public final void test129() {
    reducesTo(
      "(\\g.g (r (\\a.s ((\\u.j) h)) h)) (c (\\e.(\\y.n) d b ((\\h.\\o.\\o.(\\f.(\\y.L) q) (l C (i C) (\\a.N (\\h.Z)))) ((\\k.z) (\\l.q) ((\\r.U) (\\h.S)) j)) (\\b.o (d (\\v.\\c.g k) (H (\\a.E) (\\y.\\z.e z)) (\\u.\\p.\\h.\\t.(\\x.\\d.q) ((\\t.D) (u Y)) (\\h.(\\j.\\k.Y) (\\k.\\i.v))))) Y))",
      "c (\\e.n b (\\o.\\o.L) (\\b.o (d (\\v.\\c.g k) (H (\\a.E) (\\y.\\z.e z)) (\\u.\\p.\\h.\\t.q))) Y) (r (\\a.s (j)) h)"
    );
  }

  @Test
  public final void test130() {
    reducesTo(
      "\\v.\\k.F",
      "\\v.\\k.F"
    );
  }

  @Test
  public final void test131() {
    reducesTo(
      "\\h.\\z.W j (\\d.\\l.f (\\j.\\w.\\x.\\d.\\c.\\z.(\\c.(\\i.e (\\o.\\v.(\\o.g m (\\h.L) (\\z.\\g.\\t.e) w) (\\z.b ((\\c.a) (\\a.A (\\d.b)))))) ((\\s.e (\\d.D) N ((\\t.k) (\\p.\\s.o u))) (l m) (\\o.\\w.c))) (\\o.\\w.j (\\q.W))))",
      "\\h.\\z.W j (\\d.\\l.f (\\j.\\w.\\x.\\d.\\c.\\z.e (\\o.\\v.g m (\\h.L) (\\z.\\g.\\t.e) w)))"
    );
  }

  @Test
  public final void test132() {
    reducesTo(
      "(\\p.\\a.o) (\\g.S (\\c.(\\u.b (\\k.\\j.\\w.(\\v.m p (w w) (\\w.\\o.t)) b)) (\\i.\\v.w) (o (\\l.I l)) (\\q.(\\y.c) (\\b.(\\v.(\\s.i) (P b)) q) e u K)))",
      "\\a.o"
    );
  }

  @Test
  public final void test133() {
    reducesTo(
      "(\\p.(\\h.(\\b.\\w.n (\\o.\\z.\\s.\\s.\\j.\\q.(\\f.P) ((\\g.o (\\e.N g (\\k.Z)) N) (t (I f) ((\\p.F) (\\c.l) (\\h.l e (u H))))))) b) ((\\l.(\\c.i) (\\n.\\q.\\z.V)) (\\k.\\u.\\r.c (\\q.(\\e.a p) (\\z.b))) ((\\a.\\h.(\\i.o l e i) (\\q.W (Z b (i r)))) (\\m.\\s.(\\s.z) (p (o f r)))) ((\\u.(\\c.g (I J)) (\\k.\\d.\\k.r) ((\\j.o) a ((\\h.G) (g D))) Q) a) ((\\i.\\x.\\f.\\h.(\\e.(\\k.\\o.\\a.G) A (\\c.(\\g.v X) (J c C))) (\\f.\\p.(\\a.K) ((\\q.r) (\\p.n)))) ((\\l.x y a t) (\\a.W C b) (\\k.k (\\p.\\z.(\\o.\\f.u) (\\e.r)))) Z))) (o (\\m.(\\d.(\\l.(\\e.\\u.l) ((\\a.\\q.l) (\\i.K)) ((\\a.L) ((\\k.k) (A X)) ((\\y.I) f c) (\\u.G))) (O (\\i.o))) ((\\h.w) ((\\c.C) (j U)) ((\\b.j) (\\b.m) (\\k.(\\q.f) (W x))) (V w) O I)))",
      "\\w.n (\\o.\\z.\\s.\\s.\\j.\\q.P)"
    );
  }

  @Test
  public final void test134() {
    reducesTo(
      "\\f.o",
      "\\f.o"
    );
  }

  @Test
  public final void test135() {
    reducesTo(
      "\\l.\\a.\\u.\\j.h",
      "\\l.\\a.\\u.\\j.h"
    );
  }

  @Test
  public final void test136() {
    reducesTo(
      "\\h.(\\c.u) ((\\l.\\f.a) (\\j.s))",
      "\\h.u"
    );
  }

  @Test
  public final void test137() {
    reducesTo(
      "(\\t.z (\\u.\\k.\\j.\\o.a (C (\\z.\\a.(\\j.X) (\\j.w) (\\k.\\y.A)) T)) ((\\t.e (\\b.\\l.T) ((\\v.x) (D r) (L p K))) (M (p l (\\x.k) (\\h.a Y (f y)))) (\\i.(\\m.Z ((\\q.c) (\\v.x) (\\k.\\c.\\y.R))) (\\w.(\\k.(\\o.Y y (\\o.F)) (\\m.\\r.V)) H)) (\\r.h (w J) ((\\c.\\w.d i) (k w (\\e.F)) n u))) ((\\d.\\g.x t) (\\g.\\w.A) (U (e (\\r.k)) Z) (c ((\\m.\\o.\\d.(\\h.\\i.j) d) i (\\n.f O) ((\\w.(\\e.\\z.i N) (\\a.a (\\r.t))) (d (\\n.\\q.p)) (S ((\\r.d p) (r T (a d))))))))) (M H Y)",
      "z (\\u.\\k.\\j.\\o.a (C (\\z.\\a.X (\\k.\\y.A)) T)) (e (\\b.\\l.T) (x (L p K)) (\\i.Z (c (\\k.\\c.\\y.R))) (\\r.h (w J) (d i u))) (x (M H Y) (c (\\i.j)))"
    );
  }

  @Test
  public final void test138() {
    reducesTo(
      "\\j.(\\r.(\\s.(\\f.F) a ((\\h.(\\u.n) (u L) (\\i.\\j.\\g.y) ((\\p.h X (\\x.j)) (\\z.i q)) (\\p.V) ((\\q.\\l.(\\i.\\w.w) f) ((\\s.\\f.r q) (\\o.V)) f)) (\\z.\\m.p))) C) ((\\s.\\i.O) (\\e.\\l.\\d.\\e.C) ((\\x.\\l.\\f.\\d.\\h.\\m.F Q) L Z ((\\q.J) ((\\q.\\x.H) (\\w.\\o.k))) (\\e.(\\g.q ((\\k.F) ((\\w.g) r) (\\w.l z (\\b.U) (x s t)))) (z N))) (N ((\\j.h q a) (s Q)) (\\w.\\q.\\a.a (\\n.\\e.\\u.x)) i (\\w.\\c.R)))",
      "\\j.F (n (\\i.\\j.\\g.y) (p) (\\p.V) (\\w.w))"
    );
  }

  @Test
  public final void test139() {
    reducesTo(
      "\\z.y",
      "\\z.y"
    );
  }

  @Test
  public final void test140() {
    reducesTo(
      "\\u.\\a.(\\t.M (\\o.\\y.e (\\f.(\\t.\\p.\\u.l (\\t.v (I (i (p C) (v l))))) ((\\g.i ((\\q.A) n) (\\j.\\y.d) (u t ((\\j.\\z.o Q) F))) ((\\y.\\h.\\k.(\\i.e) l) a ((\\h.D o (\\h.O) O) (h (d d (j Z))))))))) (C (\\g.\\w.\\h.(\\e.(\\m.Z) M F) ((\\n.(\\g.b g) (\\e.\\g.\\m.j)) (m (\\e.\\e.j)) d ((\\k.n (\\p.j) (m N (U g)) (\\x.u)) U) ((\\r.(\\s.p) (p y) p (\\t.(\\o.x) (\\h.v) (\\y.\\d.M e))) h (o (\\e.m (\\u.h)) ((\\l.(\\d.m) (\\l.s)) t) (\\s.d))))))",
      "\\u.\\a.M (\\o1.\\y2.e (\\f.\\p.\\u.l (\\t.v (I (i (p C) (v l))))))"
    );
  }

  @Test
  public final void test141() {
    reducesTo(
      "\\u.d",
      "\\u.d"
    );
  }

  @Test
  public final void test142() {
    reducesTo(
      "\\y.M (\\m.d)",
      "\\y.M (\\m.d)"
    );
  }

  @Test
  public final void test143() {
    reducesTo(
      "\\k.(\\q.(\\x.Y) ((\\f.\\d.\\k.\\o.\\l.(\\c.\\l.r) C) ((\\j.h (\\c.(\\m.s) (\\g.C)) (\\x.r (l l) z) (u V (m t) c (\\w.X Q (\\o.Y) (\\c.l s (\\n.s))))) (o (\\n.y j))))) (z ((\\y.J) c)) (\\k.\\d.e)",
      "\\k.Y (\\k.\\d.e)"
    );
  }

  @Test
  public final void test144() {
    reducesTo(
      "(\\n.E) (\\j.\\o.(\\x.\\k.c ((\\s.(\\s.\\s.\\k.\\j.\\l.\\h.\\h.m) (X i M) (\\n.i)) (R (F i (z K) (\\e.T) k)) (d (\\i.u) ((\\p.i P (w R)) S (\\c.\\u.v (p y (\\l.u)))) a))) (\\o.\\p.u))",
      "E"
    );
  }

  @Test
  public final void test145() {
    reducesTo(
      "\\d.\\s.\\w.(\\o.\\n.(\\x.b (\\a.l)) (\\w.\\m.(\\w.(\\y.\\k.g) (\\v.\\d.\\x.x (\\g.p) x) ((\\c.(\\b.Q ((\\e.h) (\\u.a))) p) (\\f.\\t.\\g.s))) B (\\h.w))) (\\r.(\\p.(\\b.\\o.A) (\\v.(\\q.O g (\\g.E) (\\n.L)) (q (\\f.\\v.\\b.(\\w.(\\p.h) (Y v)) (L j) (\\l.\\a.\\m.\\h.a U (d m)))) t)) (Z (\\q.a) R))",
      "\\d.\\s.\\w.\\n.b (\\a.l)"
    );
  }

  @Test
  public final void test146() {
    reducesTo(
      "(\\r.g) (\\p.\\i.\\h.(\\p.\\k.E) T)",
      "g"
    );
  }

  @Test
  public final void test147() {
    reducesTo(
      "\\r.(\\h.\\r.\\g.(\\a.h (r (\\v.(\\d.\\b.Y n) ((\\i.V) c) (\\i.q (\\d.R (\\a.a)))) (l (\\l.\\k.a)))) (\\d.(\\i.a) i) i) q",
      "\\r.\\r.\\g.q (r (\\v.Y n) (l (\\l.\\k.\\d.a))) i"
    );
  }

  @Test
  public final void test148() {
    reducesTo(
      "(\\d.\\x.\\m.u) (\\j.\\m.(\\x.\\u.\\d.I h) (\\e.\\b.\\k.u) ((\\l.(\\p.O) P (L N (t g)) b) f) (P (\\u.S))) ((\\s.v) ((\\b.q) (\\l.\\l.\\h.v)) (\\y.\\h.\\r.\\z.\\l.(\\g.t (R (\\a.U))) (\\o.\\f.\\l.\\x.d z (\\i.g) ((\\o.d) (\\h.t)) (D (\\k.u)))) r ((\\x.l) (\\f.\\h.(\\j.(\\t.\\g.\\x.n) ((\\h.\\b.x) (P k (b x)) M)) (\\g.l (\\m.\\t.V))))) (\\h.B (\\p.(\\k.\\x.A) d))",
      "u"
    );
  }

  @Test
  public final void test149() {
    reducesTo(
      "(\\w.u) ((\\b.(\\d.\\d.\\e.\\k.\\b.q) (J (i (N (\\w.y))))) (\\d.\\u.\\b.i))",
      "u"
    );
  }

  @Test
  public final void test150() {
    reducesTo(
      "\\m.(\\q.\\h.\\e.o) (\\c.\\o.(\\f.\\c.\\g.\\x.W M (\\p.(\\s.\\g.i R (i H) (\\r.W)) ((\\w.B) W))) ((\\h.(\\q.x) (G w) (u B r)) (J Q (\\m.z) (D n (E Q))) (g (y e) (h (s B)) (\\q.\\k.\\z.\\q.H l (c v)))) (\\l.n) ((\\c.(\\g.t) (j X) T t (\\d.H)) (\\s.\\b.\\w.K) (\\i.\\x.(\\z.(\\l.(\\v.A) (q f)) (\\t.v B (b E)) (\\e.X) (\\e.z)) c)) (\\c.Q))",
      "\\m.\\h.\\e.o"
    );
  }

  @Test
  public final void test151() {
    reducesTo(
      "\\q.(\\d.\\d.w) ((\\s.O) ((\\v.(\\b.u) (\\a.B)) m) (\\b.f f (l s) y ((\\f.\\b.f) (\\z.j (\\v.j)))) ((\\k.(\\y.b) (s t) (\\p.\\j.J B)) (x (\\b.\\r.i)) (\\z.(\\m.b j (\\f.S) (\\s.\\h.F f)) (\\q.g))) (T ((\\g.f) ((\\l.R) (\\v.L))) ((\\x.\\m.i) (\\u.y w T) j) (k (\\w.\\c.u (h t (c G) (f (r a)))))) (n (\\m.\\n.u) (\\k.n (\\j.f) y))) ((\\h.b) o ((\\o.F (Y (\\y.\\b.(\\t.V C) (c z e)) ((\\e.s (p q) (i (\\o.F))) (\\l.(\\y.l) (\\r.o))) (\\r.f (i g (\\g.U)) (\\x.\\q.\\r.i h x (\\o.h)) P))) (n (\\m.U ((\\f.x) (E (\\n.\\e.\\f.\\w.u c (\\l.x))))))))",
      "\\q.w"
    );
  }

  @Test
  public final void test152() {
    reducesTo(
      "(\\d.h ((\\a.\\u.I) ((\\q.\\m.Y (k L (s v)) L) ((\\x.E) m ((\\t.w Z w) (v b (\\j.g)))) (\\s.\\g.(\\a.(\\t.q x (o k)) (e g G) (\\q.i)) (\\v.L)))) (\\z.u)) (f ((\\t.z) ((\\p.s (\\i.B h (\\g.J))) (l (\\t.(\\e.k) (\\z.p)))) o ((\\q.(\\g.x) ((\\n.d) (\\q.g)) (\\g.u k)) (\\s.\\j.\\a.C (\\w.Y) (\\d.\\d.O) (\\k.O (\\x.\\q.A))) b)) g)",
      "h (\\u.I) (\\z.u)"
    );
  }

  @Test
  public final void test153() {
    reducesTo(
      "\\t.\\f.\\g.J",
      "\\t.\\f.\\g.J"
    );
  }

  @Test
  public final void test154() {
    reducesTo(
      "\\z.r",
      "\\z.r"
    );
  }

  @Test
  public final void test155() {
    reducesTo(
      "a (\\y.(\\r.\\d.B) ((\\j.\\y.\\b.w) ((\\o.\\y.(\\z.x) (\\c.I) N) (\\w.(\\e.e) (\\j.s) (\\u.\\z.W K)) ((\\f.Y (\\s.w i (\\b.d))) (\\j.\\a.(\\m.\\y.n) I))))) ((\\k.(\\i.J (\\y.\\l.e)) (x (\\g.B))) (y (\\m.(\\j.U (E m (t n) (\\b.(\\r.q) (H C)))) L)) (\\f.\\e.\\r.r)) ((\\y.d) (\\t.C))",
      "a (\\y.\\d.B) (J (\\y.\\l.e) (\\f.\\e.\\r.r)) (d)"
    );
  }

  @Test
  public final void test156() {
    reducesTo(
      "(\\o.(\\c.C ((\\a.\\g.(\\c.G) (w e) F w) w)) (\\u.\\w.I)) (\\n.(\\s.\\v.B w) ((\\e.\\r.\\u.w) (\\k.z)) (K ((\\q.d) (\\d.G) (\\j.T B (\\o.g))) ((\\p.\\n.\\r.(\\m.W h) (y (\\l.X))) ((\\p.g) (\\w.x) ((\\w.v) (\\p.s)))) g)) (\\j.(\\f.\\b.\\p.\\d.(\\p.h) Q ((\\v.I d ((\\u.\\e.\\o.K) ((\\u.l) y))) ((\\a.P) (\\b.f) (\\u.m p Q) (\\o.\\i.(\\x.f) U ((\\l.b) (\\r.O)))) (\\f.(\\c.s (n (\\b.k) (\\u.u a (G X)))) ((\\a.H s) U (\\b.\\i.b))))) ((\\h.(\\c.\\q.\\l.(\\f.\\j.(\\u.\\q.i) v) (\\h.\\s.E) (\\z.d)) (\\b.(\\b.\\p.T (p I) (\\x.m f)) (\\q.(\\o.(\\y.f) (m Y)) (\\g.\\j.F)) ((\\x.n) ((\\t.(\\n.Z) (\\i.r)) (j O))))) (\\n.F ((\\q.(\\u.\\c.b) ((\\t.Z) (f g))) (N (\\a.a)) ((\\u.r y (f l)) (d (i R)) (\\c.e j d (o l x))))))) ((\\q.\\l.(\\d.r ((\\o.(\\m.\\w.(\\p.d k) (\\a.\\v.l)) j) (\\a.\\g.\\b.(\\e.\\z.\\p.(\\e.H) l) ((\\f.C) (K L (r X)))) ((\\u.r) (i L) e (\\e.\\t.I q) ((\\s.\\g.\\i.q) (n J) (\\r.\\m.h))))) (\\e.\\a.i ((\\p.\\h.\\p.j O (\\p.d (\\g.u) (H r H))) ((\\i.\\u.m) (\\m.\\r.x) (\\q.\\k.s (p s) G)) s))) ((\\c.c) ((\\i.(\\a.(\\a.Z (\\k.\\a.\\s.(\\q.n) (\\g.w))) (\\a.L D (\\g.t) w (\\w.\\y.o (\\y.n) ((\\y.s) (J c))))) (\\z.q)) w)))",
      "C (\\g.G F w) (\\j.\\b1.\\p.\\d2.h (I d2 (\\e.\\o.K) (\\f.s (n (\\b.k) (\\u.u a (G X)))))) (\\l.r (\\a.i (\\p.j O (\\p.d (\\g.u) (H r H)))))"
    );
  }

  @Test
  public final void test157() {
    reducesTo(
      "(\\j.\\d.\\i.U) ((\\u.\\n.\\s.\\i.\\r.\\t.T) c) ((\\p.a) ((\\h.m) (\\u.R)))",
      "\\i.U"
    );
  }

  @Test
  public final void test158() {
    reducesTo(
      "(\\f.\\w.r) ((\\m.(\\r.(\\p.\\a.k) (\\o.i j (\\i.Y) (\\a.\\n.V)) ((\\v.(\\m.\\e.\\c.d) Z) b) (\\c.f (\\l.\\i.v))) g (\\d.g (N (\\y.O) (\\u.(\\o.i) (\\q.T) (m x (E e)))) ((\\s.(\\l.\\o.n) (\\d.J r t)) (d (\\q.\\x.\\f.e)) (y (\\m.\\c.K))) ((\\a.\\f.\\l.\\b.(\\w.s) ((\\i.W) (f k)) R) (\\f.K) (\\w.O)))) (\\a.(\\n.d ((\\d.v) (C v) (t i (\\u.p)) b)) (\\z.y) j (\\p.\\z.t)))",
      "\\w.r"
    );
  }

  @Test
  public final void test159() {
    reducesTo(
      "D (X i)",
      "D (X i)"
    );
  }

  @Test
  public final void test160() {
    reducesTo(
      "\\t.(\\z.\\k.C (s (\\y.S)) ((\\g.Q) ((\\x.M) q) (\\m.(\\x.\\w.z) u ((\\l.K (\\a.(\\m.I) (O w))) (\\q.w)))) (\\k.(\\e.(\\t.d) (U d)) (\\u.\\d.\\l.r) w q (\\k.v) (\\f.\\q.F)) (Z G i)) m",
      "\\t.\\k.C (s (\\y.S)) (Q (\\m1.m)) (\\k.d w q (\\k.v) (\\f.\\q.F)) (Z G i)"
    );
  }

  @Test
  public final void test161() {
    reducesTo(
      "\\b.(\\w.I) d",
      "\\b.I"
    );
  }

  @Test
  public final void test162() {
    reducesTo(
      "\\y.w",
      "\\y.w"
    );
  }

  @Test
  public final void test163() {
    reducesTo(
      "(\\m.f (\\h.\\b.d)) (\\f.T (d (\\u.t)))",
      "f (\\h.\\b.d)"
    );
  }

  @Test
  public final void test164() {
    reducesTo(
      "(\\b.\\q.\\h.\\e.\\m.\\j.\\l.z (\\f.\\p.(\\p.M) ((\\t.\\q.\\b.Q) (t k (\\z.o) (g (t Q)))) T p)) (\\h.\\w.(\\k.r) ((\\i.E (\\f.\\b.\\o.\\u.g z (\\i.k)) (\\y.\\k.P)) t) y) c",
      "\\h.\\e.\\m.\\j.\\l.z (\\f.\\p.M T p)"
    );
  }

  @Test
  public final void test165() {
    reducesTo(
      "(\\s.(\\r.R (\\d.(\\b.F) (\\c.q) (\\v.(\\k.u d Y) z (\\f.b (\\j.u W)))) (k (\\c.\\m.h))) (\\c.t)) (c J) (\\p.\\k.l ((\\e.(\\w.k (\\i.\\t.Z)) (b w)) g m))",
      "R (\\d.F (\\v.u d Y (\\f.b (\\j.u W)))) (k (\\c.\\m.h)) (\\p.\\k.l (k (\\i.\\t.Z) m))"
    );
  }

  @Test
  public final void test166() {
    reducesTo(
      "y (\\q.h)",
      "y (\\q.h)"
    );
  }

  @Test
  public final void test167() {
    reducesTo(
      "\\l.\\l.\\t.(\\o.\\v.\\c.(\\y.w) (\\s.\\f.\\k.\\m.(\\n.(\\d.b) (f (y Q) (n (\\l.p)))) (\\k.q)) (\\t.H) o) (\\i.\\x.\\r.f) (\\u.\\k.(\\d.\\j.s (\\p.c)) ((\\s.\\v.o) (\\g.\\j.I)))",
      "\\l.\\l.\\t.\\c.w (\\t.H) (\\i.\\x.\\r.f)"
    );
  }

  @Test
  public final void test168() {
    reducesTo(
      "u (a (\\w.\\k.\\q.(\\b.B) (\\q.r)) ((\\n.p (\\j.u) ((\\j.r w) (\\i.(\\l.a) (\\z.y) (\\q.j P) ((\\h.L) ((\\c.l) (S N)))))) (\\e.f)) t)",
      "u (a (\\w.\\k.\\q.B) (p (\\j.u) (r w)) t)"
    );
  }

  @Test
  public final void test169() {
    reducesTo(
      "(\\f.\\d.\\w.F) (\\e.k)",
      "\\d.\\w.F"
    );
  }

  @Test
  public final void test170() {
    reducesTo(
      "\\o.\\b.\\d.\\u.\\f.b (\\v.P)",
      "\\o.\\b.\\d.\\u.\\f.b (\\v.P)"
    );
  }

  @Test
  public final void test171() {
    reducesTo(
      "\\n.a z (\\x.\\o.d) n",
      "\\n.a z (\\x.\\o.d) n"
    );
  }

  @Test
  public final void test172() {
    reducesTo(
      "J ((\\h.K) q)",
      "J (K)"
    );
  }

  @Test
  public final void test173() {
    reducesTo(
      "\\z.I",
      "\\z.I"
    );
  }

  @Test
  public final void test174() {
    reducesTo(
      "\\n.Z (\\g.R)",
      "\\n.Z (\\g.R)"
    );
  }

  @Test
  public final void test175() {
    reducesTo(
      "Y (\\c.x) ((\\i.c) ((\\c.x) ((\\e.\\g.w) (\\g.S)))) x",
      "Y (\\c.x) (c) x"
    );
  }

  @Test
  public final void test176() {
    reducesTo(
      "a (\\u.f (k (s (d r U ((\\b.r) (\\m.g)) a (\\z.(\\t.r) ((\\h.(\\s.u) (a e)) c)))))) c",
      "a (\\u.f (k (s (d r U (r) a (\\z.r))))) c"
    );
  }

  @Test
  public final void test177() {
    reducesTo(
      "\\f.d ((\\w.(\\n.R) (\\w.\\y.l (\\i.\\f.(\\z.\\t.l) (\\c.\\f.w))) ((\\c.D) (\\i.(\\b.\\w.x V J f) h)) (\\q.\\v.\\v.\\y.\\l.(\\t.W A (\\f.(\\t.u) (A W) (e (\\t.m)))) (T ((\\j.b) P)) q)) ((\\l.(\\s.F) (\\r.\\e.S) (t C n)) z) (\\o.(\\e.H) n))",
      "\\f.d (R (D) (\\q.\\v.\\v.\\y.\\l.W A (\\f.u (e (\\t.m))) q) (\\o.H))"
    );
  }

  @Test
  public final void test178() {
    reducesTo(
      "\\j.l (\\c.A)",
      "\\j.l (\\c.A)"
    );
  }

  @Test
  public final void test179() {
    reducesTo(
      "(\\k.(\\w.y x (\\d.\\x.I) (K (S ((\\v.b) (R p)) (l (\\o.\\l.t C))))) U (\\n.\\s.\\i.\\i.\\k.(\\o.z) (\\v.(\\u.(\\c.k) (\\e.\\c.f A) (o (\\a.q) u) (\\g.\\n.t)) ((\\n.\\k.(\\u.\\h.(\\t.\\d.c) ((\\j.h) (\\q.j))) (N (\\v.(\\e.u) (\\d.w)))) (\\h.\\s.(\\h.\\z.I) (\\x.l (\\l.x) (\\i.\\p.p))))))) K (\\s.\\m.(\\u.(\\m.d (\\s.\\g.a)) T P) h)",
      "y x (\\d.\\x.I) (K (S (b) (l (\\o.\\l.t C)))) (\\n.\\s.\\i.\\i.\\k.z) (\\s.\\m.d (\\s.\\g.a) P)"
    );
  }

  @Test
  public final void test180() {
    reducesTo(
      "X (\\c.(\\z.\\j.\\u.\\j.a) (\\c.\\u.(\\r.Y) x (\\h.(\\l.W X (o q) m) v) O v)) ((\\i.\\j.\\b.\\f.w (p x (\\v.U) t ((\\z.r w N) (\\h.\\l.o))) l (\\c.(\\o.c) (\\x.T (t (g g (\\k.k))) (\\k.\\e.m C))) o) (u (c ((\\x.\\c.\\x.\\e.\\w.X) j)) (\\w.I x)))",
      "X (\\c.\\j.\\u.\\j.a) (\\j.\\b.\\f.w (p x (\\v.U) t (r w N)) l (\\c.c) o)"
    );
  }

  @Test
  public final void test181() {
    reducesTo(
      "\\z.f (N (\\n.\\e.s)) (w ((\\s.m) (\\k.d) (\\a.\\i.\\v.g) y (\\h.(\\b.E p (\\c.e) (\\t.Q l (r o))) (\\r.e (\\v.(\\w.w) Q)))) (M (\\d.(\\a.\\f.O) (\\c.V))) (r (\\n.(\\g.j) ((\\p.K) (\\s.\\l.(\\k.V g (X N) (D (r z))) A))))) (\\c.(\\t.\\k.z M) (q (\\b.(\\d.\\z.\\e.w) ((\\g.J) (p M)) (\\x.r))) (\\n.\\u.R) ((\\k.\\m.o (\\m.(\\d.L) ((\\r.s) (\\m.v)) (\\i.u u (\\r.E) d))) p (F (w ((\\i.N X (D Y)) (j t (z m)) c)))) (\\n.\\n.\\f.\\m.\\m.\\v.\\u.\\l.g ((\\g.(\\s.\\g.r) x n) (c ((\\b.\\f.\\c.\\p.(\\d.n) (\\y.o)) (\\k.n)) u))))",
      "\\z.f (N (\\n.\\e.s)) (w (m (\\a.\\i.\\v.g) y (\\h.E p (\\c.e) (\\t.Q l (r o)))) (M (\\d.\\f.O)) (r (\\n.j))) (\\c.z M (o (\\m.L (\\i.u u (\\r.E) d))) (\\n.\\n.\\f.\\m.\\m.\\v.\\u.\\l.g (r)))"
    );
  }

  @Test
  public final void test182() {
    reducesTo(
      "\\v.\\y.\\c.x i",
      "\\v.\\y.\\c.x i"
    );
  }

  @Test
  public final void test183() {
    reducesTo(
      "(\\y.\\x.\\j.J ((\\a.h ((\\f.F) ((\\m.B) (\\o.(\\m.(\\r.\\s.s v) (\\p.\\d.\\p.W)) ((\\q.x M) (\\x.\\j.t W)))))) (\\y.\\h.o))) (\\x.\\h.q)",
      "\\x.\\j.J (h (F))"
    );
  }

  @Test
  public final void test184() {
    reducesTo(
      "\\o.o (\\x.u ((\\g.K ((\\u.(\\g.q) ((\\h.l) (S n)) (\\a.\\c.(\\a.y) (\\x.y y))) n (\\a.(\\z.\\d.(\\u.B) t (\\a.\\p.(\\y.g) (\\w.N))) (\\e.\\g.u ((\\c.k) (\\e.S)) (\\r.A))))) (s ((\\g.G T (\\s.Z) (z (\\k.D)) (\\b.D) ((\\r.v) ((\\m.o) (\\v.o)) (\\q.\\s.(\\q.A x) (\\y.\\e.Z)))) ((\\n.\\z.\\y.(\\v.g q) (e v Q)) g (\\m.U))))))",
      "\\o.o (\\x.u (K (q (\\a.\\c.y) (\\a.\\d.B (\\a.\\p.s (G T (\\s.Z) (z (\\k.D)) (\\b.D) (v (\\q.\\s.A x))))))))"
    );
  }

  @Test
  public final void test185() {
    reducesTo(
      "g ((\\r.\\l.\\d.z) (\\g.p i (p j) l)) n (\\v.O (\\m.\\w.\\d.h)) Q x ((\\n.u) (\\y.\\z.\\o.k))",
      "g (\\l.\\d.z) n (\\v.O (\\m.\\w.\\d.h)) Q x (u)"
    );
  }

  @Test
  public final void test186() {
    reducesTo(
      "a (\\o.E (k Z (\\u.(\\f.\\m.Y) (t (d (e L)) ((\\k.l) R v) (c (\\t.i) R))) (\\c.\\n.\\u.(\\k.z) I)))",
      "a (\\o.E (k Z (\\u.\\m.Y) (\\c.\\n.\\u.z)))"
    );
  }

  @Test
  public final void test187() {
    reducesTo(
      "p (y (\\y.g) ((\\p.(\\u.\\d.n) t) (k (y (\\j.g (V f (\\r.c))))))) (k (\\i.\\h.l (\\a.\\y.p J) ((\\j.c) (J ((\\y.w C (i j)) (\\k.(\\l.F) (\\t.V)))))) ((\\p.f) ((\\l.\\p.d) f))) (\\w.\\h.\\q.t ((\\y.\\a.M I n ((\\t.\\e.(\\b.\\l.P (\\d.\\a.E)) (\\s.b)) (l y))) (\\p.M ((\\c.\\j.\\j.\\g.E) ((\\p.\\l.\\z.K) (R (\\y.m)) (\\x.c j (s g) E))))) (J a))",
      "p (y (\\y.g) (\\d.n)) (k (\\i.\\h.l (\\a.\\y.p J) (c)) (f)) (\\w.\\h.\\q.t (\\a.M I n (\\e.\\l.P (\\d.\\a.E))) (J a))"
    );
  }

  @Test
  public final void test188() {
    reducesTo(
      "(\\d.w ((\\r.O) (\\l.i))) (\\w.w (n (\\q.p) h) (o (\\v.(\\t.V (n (\\z.v))) (\\n.D ((\\o.I (O T)) (\\z.\\s.\\a.i) (\\l.(\\j.s) m ((\\d.p) (w s)))))))) ((\\h.(\\s.a (\\d.(\\s.k) (A d))) ((\\i.H) (n e) (h (i q))) (n (\\f.X F (W e)) (\\d.g)) (w (p (\\j.C))) (\\y.\\u.\\p.d)) f (\\a.I))",
      "w (O) (a (\\d.k) (n (\\f.X F (W e)) (\\d.g)) (w (p (\\j.C))) (\\y.\\u.\\p.d) (\\a.I))"
    );
  }

  @Test
  public final void test189() {
    reducesTo(
      "(\\e.(\\f.l) (S (d ((\\m.\\s.(\\r.a Q (\\a.l)) (\\i.F (\\x.v)) (d (\\n.v) (\\k.(\\a.j) (\\l.a)))) ((\\a.\\w.z) (a e (\\w.L)) ((\\u.V) (\\u.j) (\\o.n (\\w.i))))) ((\\k.\\g.\\u.E (\\d.b)) (\\f.\\t.(\\f.(\\p.i K) (\\l.\\h.k)) i) X)))) (\\c.(\\r.e) (L y))",
      "l"
    );
  }

  @Test
  public final void test190() {
    reducesTo(
      "\\i.\\y.G",
      "\\i.\\y.G"
    );
  }

  @Test
  public final void test191() {
    reducesTo(
      "(\\j.\\s.Q) T (\\x.\\a.\\e.u (g (\\w.\\t.\\z.Z I)) l a)",
      "Q"
    );
  }

  @Test
  public final void test192() {
    reducesTo(
      "W (n (\\v.y) v (Z (\\t.u) (\\g.\\f.i D)) (\\l.(\\y.\\b.M) ((\\i.k) (a q)) ((\\h.\\a.\\o.U) ((\\h.m) (S i)))) (b (\\j.f) (\\g.\\d.s (\\s.\\g.s))) (Q (k v)) (\\w.(\\z.\\h.(\\f.\\o.\\h.(\\s.\\o.(\\t.s P) (\\l.u n)) (\\u.(\\z.f b) (\\l.\\c.h)) t) ((\\t.u) (b u) (\\n.x) (\\f.(\\d.A) (\\y.T) b) (l h))) (\\m.\\i.\\h.b)) (\\e.X k))",
      "W (n (\\v.y) v (Z (\\t.u) (\\g.\\f.i D)) (\\l.M) (b (\\j.f) (\\g.\\d.s (\\s.\\g.s))) (Q (k v)) (\\w.\\h.\\o.\\h1.u (\\n.x) (\\f.A b) (l h) b) (\\e.X k))"
    );
  }

  @Test
  public final void test193() {
    reducesTo(
      "\\m.(\\x.u ((\\j.z) ((\\g.p) (V g)) (\\q.(\\g.\\c.Z s) (A C (j M)))) (C (\\w.\\q.c)) h) (\\q.\\t.(\\b.\\d.h (O (\\o.r) (\\o.W u (\\u.n)) Y)) (\\o.(\\s.M) ((\\t.C) ((\\l.R) ((\\r.c) v)))) N) ((\\w.c R l E) ((\\y.s) (\\z.M) (\\d.(\\a.d ((\\i.\\g.(\\p.z H) (\\m.s u)) (\\c.O))) (\\m.\\q.f ((\\b.b (\\x.q) q) s))))) (a (\\q.i))",
      "\\m.u (z (\\q.\\c.Z s)) (C (\\w.\\q.c)) h (c R l E) (a (\\q.i))"
    );
  }

  @Test
  public final void test194() {
    reducesTo(
      "\\y.h ((\\a.(\\z.f) D) (\\n.\\h.(\\r.z) (\\v.g (\\j.\\b.\\h.(\\m.h C) (\\q.O H)) L (\\z.\\u.(\\j.\\k.\\m.A) V (\\m.\\n.q) (\\z.z (\\k.(\\t.w j) P)))) (b (\\b.\\u.\\m.\\a.(\\i.\\f.Y) ((\\m.V) (\\g.x)) (T E (\\f.\\s.\\m.p)) (z (\\k.q) ((\\b.(\\m.q) (\\w.s)) (\\e.c E (\\q.c)))) (R ((\\p.(\\h.\\j.n) w) (a e)))))))",
      "\\y.h (f)"
    );
  }

  @Test
  public final void test195() {
    reducesTo(
      "(\\z.i x) (\\x.c ((\\l.(\\g.\\a.b) (q (j f) (\\g.(\\j.q) (\\k.w))) (i n ((\\d.Y) (E c)) (s (\\d.(\\f.l) (S c)))) (s ((\\l.h ((\\y.s) (\\j.o))) (\\t.(\\a.(\\b.D) (\\n.k)) (\\n.s)))) (\\e.\\c.\\m.(\\m.(\\g.\\h.r) ((\\y.Z e (\\n.F)) (\\j.\\s.\\i.N)) v) (\\g.h ((\\o.\\v.\\k.a) (\\n.\\d.\\s.b) (\\l.m z (Q a) (\\f.f)))))) (\\z.k)))",
      "i x"
    );
  }

  @Test
  public final void test196() {
    reducesTo(
      "\\i.(\\o.i (\\d.(\\t.G) ((\\x.(\\r.e (\\t.j)) (i (\\v.e)) (x (\\h.f D (u z)))) (\\z.\\d.\\x.\\c.(\\v.U p) (y q))) (\\m.R))) ((\\k.V w) (Z (\\t.\\u.\\i.(\\t.\\f.(\\g.\\r.i) ((\\u.M) n (\\m.G l (\\d.p)) o)) (c (\\g.\\k.r R F u) h)))) (\\v.n)",
      "\\i.i (\\d.G (\\m.R)) (\\v.n)"
    );
  }

  @Test
  public final void test197() {
    reducesTo(
      "\\i.b",
      "\\i.b"
    );
  }

  @Test
  public final void test198() {
    reducesTo(
      "\\m.(\\h.\\j.c) ((\\p.\\a.\\m.(\\b.\\t.\\u.\\q.w I) (\\p.(\\y.(\\e.r (\\x.(\\k.I (d t)) (H A (h O)))) (\\y.(\\l.s) (\\g.j) (\\h.C) ((\\y.\\h.\\o.K) (\\g.\\h.P))) ((\\a.\\t.y) (\\e.I) ((\\k.\\g.\\p.g ((\\a.A) M)) (\\z.J)))) ((\\w.o) W w ((\\c.q) (\\a.n (\\l.\\q.\\m.\\z.\\x.\\g.s x)))))) ((\\i.(\\c.\\z.(\\j.J) N C) (\\a.Y) (E ((\\y.N) (\\p.w)) ((\\f.u) N (\\w.(\\j.o) r)) (F ((\\r.h) (\\i.r)) (h h)))) h ((\\x.T) (\\q.B))))",
      "\\m.\\j.c"
    );
  }

  @Test
  public final void test199() {
    reducesTo(
      "z (\\o.(\\f.\\t.(\\d.(\\p.\\q.\\b.\\v.D (\\o.p ((\\s.Q) m)) (b (\\g.\\a.\\u.b) ((\\n.\\n.\\l.t) (\\w.\\b.v A)))) ((\\g.u j (\\d.J) (\\k.\\w.c) u) (g (p S o)))) c ((\\j.\\z.(\\r.\\n.(\\w.l T (\\j.N)) (\\d.(\\n.c) n) (\\g.p U)) (u b) f) (\\k.(\\c.\\b.f ((\\x.U ((\\q.i) (z J))) (\\f.(\\d.o) (\\s.x (\\u.U))))) (\\w.i)))) ((\\j.\\c.a h) ((\\l.z (\\p.\\v.g t) f) y ((\\e.\\d.q) ((\\v.b) v (\\l.\\p.v)))) (\\h.\\o.\\r.(\\w.E) ((\\v.(\\f.S) ((\\z.(\\a.Q) d) (\\j.a))) q))))",
      "z (\\o.\\t1.\\b.\\v.D (\\o4.u j (\\d.J) (\\k.\\w.c) u (Q)) (b (\\g.\\a.\\u.b) (\\n.\\l.t1)))"
    );
  }

  @Test
  public final void test200() {
    reducesTo(
      "\\r.(\\y.P) z",
      "\\r.P"
    );
  }

  @Test
  public final void test201() {
    reducesTo(
      "a (\\t.(\\s.v) V (\\k.Q)) r ((\\y.\\t.j ((\\d.v (x (\\s.\\a.n R))) (\\s.\\b.\\i.u j) (M (\\f.(\\q.i O (\\p.Q)) (n T (\\u.i))) s) ((\\k.Q) w))) o)",
      "a (\\t.v (\\k.Q)) r (\\t.j (v (x (\\s.\\a.n R)) (M (\\f.i O (\\p.Q)) s) (Q)))"
    );
  }

  @Test
  public final void test202() {
    reducesTo(
      "(\\k.K (\\e.(\\x.\\v.\\u.\\d.\\w.\\o.(\\k.U (S (D t) W)) (\\t.\\o.u)) Y)) y (\\c.s V) Y",
      "K (\\e.\\v.\\u.\\d.\\w.\\o.U (S (D t) W)) (\\c.s V) Y"
    );
  }

  @Test
  public final void test203() {
    reducesTo(
      "P Z (\\t.B (\\r.(\\a.(\\f.\\p.\\b.c) ((\\n.h A (\\u.C) (\\s.\\q.D c)) (\\i.\\v.i D g ((\\g.k) (\\z.a))) ((\\o.q) (\\a.(\\t.S) ((\\y.y) w))) p)) (\\b.(\\a.\\s.x (n ((\\y.v (\\k.O)) (\\r.v (r o))))) (\\l.\\n.\\f.\\c.(\\p.\\l.\\b.\\h.\\b.g) ((\\l.W) e ((\\v.G) f) (\\r.(\\j.p r) (d v P)))) ((\\k.\\f.\\j.\\f.\\x.(\\r.q) (\\u.F)) (R h (n d) O) (v x) (\\w.(\\i.(\\v.B a (H J)) b Y) ((\\p.\\d.\\w.u) (a h (\\a.S) T)))))))",
      "P Z (\\t.B (\\r.\\p.\\b.c))"
    );
  }

  @Test
  public final void test204() {
    reducesTo(
      "(\\c.\\h.\\u.(\\w.\\w.g (g ((\\q.(\\b.u) u) (\\d.\\b.r v) R) F (k (\\d.o (\\w.K)) ((\\j.\\f.\\u.l) ((\\l.s) (\\t.k))) (\\m.(\\o.(\\l.n (\\p.X)) (\\u.\\s.\\d.l)) (r Y (e q) (y (\\s.s)))) W))) S) (\\y.\\o.(\\w.(\\q.\\t.n) (\\u.W) (\\w.\\a.\\m.(\\d.m (\\y.\\s.i)) (\\q.\\l.v ((\\q.B) (\\y.o) e)) ((\\m.r (q J)) K (\\j.\\d.n q (\\i.b) (\\p.\\i.t)) (\\j.\\k.(\\i.y (u s f)) d)))) G (\\q.\\w.\\x.\\w.(\\r.(\\g.\\x.\\e.\\g.\\s.\\h.\\k.T) ((\\c.(\\l.E) s) (U (W d)) (\\j.\\p.t) (\\v.\\b.v (W (\\g.U)))) (n (\\a.\\t.u u (\\d.Z) ((\\u.x) r)) t ((\\z.(\\v.\\o.k w (\\q.U) (\\n.g z)) ((\\v.T) (K R))) J))) (\\a.f ((\\a.\\y.P) (\\s.(\\b.\\p.\\a.J) (\\h.l (\\h.T)))) (\\d.\\t.D) ((\\t.X) (\\q.u) ((\\x.\\z.\\n.\\u.(\\p.f i) (\\n.\\k.u) R) (\\y.(\\d.C) (\\s.A) (P y A) (\\h.J)))))))",
      "\\h.\\u.\\w.g (g (u R) F (k (\\d.o (\\w.K)) (\\f.\\u.l) (\\m.n (\\p.X)) W))"
    );
  }

  @Test
  public final void test205() {
    reducesTo(
      "\\s.\\o.(\\j.P) ((\\g.m) ((\\t.e) ((\\k.\\x.\\q.\\e.Q) t))) c",
      "\\s.\\o.P c"
    );
  }

  @Test
  public final void test206() {
    reducesTo(
      "\\g.g",
      "\\g.g"
    );
  }

  @Test
  public final void test207() {
    reducesTo(
      "\\l.L z",
      "\\l.L z"
    );
  }

  @Test
  public final void test208() {
    reducesTo(
      "\\v.A a",
      "\\v.A a"
    );
  }

  @Test
  public final void test209() {
    reducesTo(
      "\\z.\\k.\\o.X b (\\c.(\\m.M) F) r",
      "\\z.\\k.\\o.X b (\\c.M) r"
    );
  }

  @Test
  public final void test210() {
    reducesTo(
      "r (N (\\j.d (\\z.\\d.W)))",
      "r (N (\\j.d (\\z.\\d.W)))"
    );
  }

  @Test
  public final void test211() {
    reducesTo(
      "\\x.\\g.(\\z.(\\t.\\z.\\w.r) ((\\f.(\\b.(\\x.o (\\t.a) (n y V) ((\\m.\\z.q l) (\\o.(\\h.h) (O y)))) i) (\\q.h)) ((\\s.(\\y.(\\p.v) (\\u.v) ((\\b.s) (\\t.x))) w) (\\o.\\f.t ((\\c.\\t.\\h.v) (\\u.\\x.f))) (\\h.J (F e (\\c.y) (\\m.N p (\\u.h)) (V k (\\c.s) (h q (W N))))))) (\\z.\\i.k U)) (\\i.(\\e.(\\r.s ((\\q.u) ((\\a.(\\o.\\h.\\k.O) (\\v.\\e.\\g.n)) (\\t.(\\g.p j (\\q.Q)) (h n (U g)))))) (\\m.\\i.\\z.E (\\t.\\w.m)) b) ((\\h.(\\u.\\b.q) k) y (\\k.(\\o.\\i.\\i.k) (\\d.\\p.j z D)) (\\g.\\f.\\n.(\\d.(\\g.E) ((\\l.\\t.(\\b.r) a (\\a.u w)) e)) ((\\u.D (\\k.E (\\c.a))) w u)) (\\j.\\j.(\\n.c) (\\d.c) Q ((\\h.\\o.\\y.g) k))))",
      "\\x.\\g.\\w.r"
    );
  }

  @Test
  public final void test212() {
    reducesTo(
      "\\u.c",
      "\\u.c"
    );
  }

  @Test
  public final void test213() {
    reducesTo(
      "R (\\h.\\x.\\i.\\t.(\\g.(\\l.(\\l.i n) (n D)) (\\l.(\\r.(\\e.l (v U)) (f (l S))) (s (M e) (D C (\\x.d)))) ((\\s.\\g.d (\\y.h) ((\\p.W) (m f) (t d (J j)))) ((\\x.B) R Q)) (\\d.\\z.\\y.o (\\l.x))) (u (\\z.q)) (\\v.(\\k.\\m.\\d.\\y.\\i.(\\x.\\n.C (\\d.\\u.(\\c.q P t) (t (X p)) (m ((\\i.L) (C F)))) ((\\u.\\j.(\\y.t) (A Q) (\\n.y)) ((\\h.Z) s (\\b.\\y.S Q)) p)) (\\n.(\\f.Y) ((\\o.m) (\\v.d (\\r.(\\q.b v) (q (\\e.a))))))) j))",
      "R (\\h.\\x.\\i.\\t.i n (\\g.d (\\y.h) (W (t d (J j)))) (\\d.\\z.\\y.o (\\l.x)) (\\v.\\m.\\d.\\y.\\i.\\n.C (\\d.\\u.q P t (m (L))) (t (\\n.y))))"
    );
  }

  @Test
  public final void test214() {
    reducesTo(
      "\\h.N",
      "\\h.N"
    );
  }

  @Test
  public final void test215() {
    reducesTo(
      "x Y (\\u.\\k.\\i.\\e.(\\w.\\l.l) s) X ((\\d.u ((\\c.n) (\\g.N) (\\q.D) k) (\\c.\\m.t)) (d (\\s.p (\\s.(\\c.u) (\\e.\\t.Q x (\\l.h) W))))) (l (\\v.\\r.\\q.\\w.(\\y.d (\\e.(\\u.b) (R f)) ((\\v.m) (s f) s)) t) f ((\\w.(\\t.\\b.\\z.(\\u.\\a.c) a) (i ((\\d.\\b.K) c))) T)) (\\r.\\f.\\u.(\\u.(\\j.(\\f.\\e.\\o.d) (l m y) (\\v.\\p.\\v.\\d.\\g.L) (\\j.\\z.i y)) (\\y.R (U (\\k.j) (G O (\\k.u))) (\\a.S L)) (o (\\w.n (\\x.\\m.(\\k.i o ((\\u.a) (Q w))) X))) ((\\e.\\w.\\x.\\g.(\\b.M b) (\\r.\\c.E) P) ((\\d.(\\e.\\v.I v) x) (\\n.\\f.F (\\r.r))) (e (x P ((\\v.O) (f K)) i)) (\\h.(\\e.(\\w.c) ((\\t.B) ((\\i.e) (U E))) g) (\\x.\\v.\\k.(\\c.\\p.z) K)))) ((\\d.t ((\\a.b) (\\r.S) (z p y) (k (B T (z g))))) (\\c.S) (\\w.w ((\\u.\\f.M Y) ((\\m.\\i.\\z.l) (\\v.\\a.\\w.p))) (I (l v))) ((\\a.N) d (\\j.\\y.\\w.Q))))",
      "x Y (\\u.\\k.\\i.\\e.\\l.l) X (u (n (\\q.D) k) (\\c.\\m.t)) (l (\\v.\\r.\\q.\\w.d (\\e.b) (m s)) f (\\b.\\z.\\a.c)) (\\r.\\f.\\u.d (o (\\w.n (\\x.\\m.i o (a)))) (\\g.M (\\r.\\c.E) P))"
    );
  }

  @Test
  public final void test216() {
    reducesTo(
      "(\\d.u (g ((\\g.N (\\n.U)) (V K (\\k.s) (\\l.(\\x.F) S)) b) (I (\\s.E)) ((\\g.m) ((\\d.(\\m.\\e.v) ((\\k.\\s.Y p) a)) (\\w.\\b.\\v.i G (\\u.m) (\\x.\\x.y) (\\v.l (\\i.\\m.o)))) u))) (\\g.\\q.(\\q.(\\u.\\t.\\k.(\\k.r ((\\q.\\l.(\\c.\\n.A) (\\z.\\y.f)) ((\\c.o) (\\c.u)) t)) p) r) (o (\\m.(\\v.(\\s.\\m.P o) z) (y (\\s.\\m.W k))) (\\k.(\\r.Q) ((\\q.(\\r.l i (\\c.m)) (\\h.o)) (w ((\\l.k) (\\z.e))))) (\\p.\\w.(\\a.\\m.\\d.\\l.\\d.A (\\r.(\\p.d (\\y.\\x.Z)) (Y (\\u.j b)))) (\\g.H ((\\y.(\\f.s) (Z n) (\\l.A v (\\v.P))) (\\p.p (\\y.A x D))))) y))",
      "u (g (N (\\n.U) b) (I (\\s.E)) (m u))"
    );
  }

  @Test
  public final void test217() {
    reducesTo(
      "\\t.n (\\h.\\z.(\\g.j) (P ((\\d.y) (\\r.\\u.\\g.\\d.s))) ((\\t.\\p.u) (\\n.p (m l (\\z.f) (\\k.f A (H e))) ((\\r.(\\t.e) (\\t.i)) (\\h.\\t.l P) (\\e.\\s.\\n.s))) (\\b.\\i.(\\u.b) ((\\h.n (\\b.\\v.f (Y (\\r.Q)))) (r (\\q.\\x.\\w.z E (l s) (q (d i)))))) (I (e ((\\i.\\o.\\r.g u E (\\e.f) G) a)))))",
      "\\t.n (\\h.\\z.j (u (I (e (\\o.\\r.g u E (\\e.f) G)))))"
    );
  }

  @Test
  public final void test218() {
    reducesTo(
      "(\\m.(\\h.j ((\\c.\\w.F (l p)) (\\v.\\z.(\\e.\\t.\\m.\\a.(\\j.\\n.q) x (\\s.\\q.T (\\k.E))) (\\f.\\t.k)))) h) (\\p.(\\l.(\\f.(\\p.(\\p.(\\w.\\w.\\u.f) ((\\d.s) (\\f.g))) (\\z.B) ((\\g.\\f.D (N (\\x.s))) ((\\m.\\p.h) N))) (a (\\g.(\\d.N) (U H)) U (\\l.\\e.c))) (Q (t ((\\q.r) (Q v)) ((\\x.I) y (\\n.\\v.\\w.h)) (\\j.\\r.\\k.z)))) (\\s.d)) (\\n.(\\a.(\\e.(\\e.t) ((\\a.E) (K w))) m) (\\i.(\\m.\\p.T F (\\i.e) (u O (\\i.l) I (\\y.\\c.n (\\x.f))) (O (\\e.(\\y.\\x.(\\z.s k) (\\r.V u)) ((\\d.\\f.\\j.e) ((\\l.n) m))))) (\\f.\\x.(\\o.b) (\\r.j A)) (\\a.w)))",
      "j (\\w.F (l p)) (\\n.t)"
    );
  }

  @Test
  public final void test219() {
    reducesTo(
      "\\h.z",
      "\\h.z"
    );
  }

  @Test
  public final void test220() {
    reducesTo(
      "\\g.\\d.(\\r.\\u.\\i.(\\i.(\\s.\\a.e) (\\f.(\\n.\\n.Y) (\\o.\\c.(\\n.\\e.x) (\\b.x)) (\\l.n (\\s.O (\\b.(\\u.(\\n.\\f.N) (\\w.\\a.b)) (f (k w (\\b.w)))))))) x) ((\\b.\\m.\\d.(\\v.\\d.E) c (\\d.(\\u.(\\k.z (l P R ((\\i.W) k))) P) (w ((\\a.\\u.(\\j.\\l.D) N) (\\g.\\c.(\\v.h) g (\\b.\\r.E)))) t)) (\\h.h d))",
      "\\g.\\d.\\u.\\i.\\a.e"
    );
  }

  @Test
  public final void test221() {
    reducesTo(
      "\\q.y (\\h.h) q u",
      "\\q.y (\\h.h) q u"
    );
  }

  @Test
  public final void test222() {
    reducesTo(
      "f ((\\d.I ((\\h.\\u.(\\b.\\g.\\c.\\g.v) (\\r.n (\\r.i k))) ((\\h.(\\q.t) x) o (\\n.\\q.k)))) (\\r.E) ((\\q.H b) (v d) r))",
      "f (I (\\u.\\g.\\c.\\g.v) (H b r))"
    );
  }

  @Test
  public final void test223() {
    reducesTo(
      "\\t.\\r.\\v.L m",
      "\\t.\\r.\\v.L m"
    );
  }

  @Test
  public final void test224() {
    reducesTo(
      "(\\y.g) (\\o.G)",
      "g"
    );
  }

  @Test
  public final void test225() {
    reducesTo(
      "\\o.(\\l.\\f.w) (\\n.W) M",
      "\\o.w"
    );
  }

  @Test
  public final void test226() {
    reducesTo(
      "(\\v.(\\t.\\r.l) ((\\y.\\j.(\\z.\\t.\\w.Q u (b S)) (m B S)) i) (x x (G (\\m.(\\b.o G (n f)) (\\r.(\\d.b) (S v)))) b) (I u) (\\l.U)) a",
      "l (I u) (\\l.U)"
    );
  }

  @Test
  public final void test227() {
    reducesTo(
      "(\\n.(\\n.p (\\a.n (\\x.M (T ((\\g.r (\\o.p)) (N (\\b.r)))))) s) (\\z.(\\f.\\g.\\o.a (\\f.\\o.(\\t.p) M) (\\j.\\h.(\\t.(\\g.\\n.d) (c H (o t)) (\\y.\\a.\\f.c)) (G (F S (j O) (x t (Z k)))))) L Z)) (\\z.(\\l.\\q.j) c)",
      "p (\\a1.\\o.a (\\f.\\o.p) (\\j.\\h.d)) s"
    );
  }

  @Test
  public final void test228() {
    reducesTo(
      "\\w.u ((\\x.l (\\v.\\r.(\\g.\\x.\\s.(\\k.z) (\\j.(\\g.(\\u.F) (m z)) K (\\q.\\e.x))) (\\j.(\\g.\\q.Y (\\f.o (\\c.l))) ((\\h.\\n.d) (\\m.(\\i.O) z ((\\p.k) (r x))))))) c) (Q (\\q.(\\e.\\v.\\h.o) (\\k.\\a.r ((\\f.x (\\x.\\k.\\d.d)) r o ((\\v.q) ((\\x.k) b))))))",
      "\\w.u (l (\\v.\\r.\\x.\\s.z)) (Q (\\q.\\v.\\h.o))"
    );
  }

  @Test
  public final void test229() {
    reducesTo(
      "(\\h.\\i.\\b.\\q.(\\b.\\q.\\l.X) (\\h.q) (\\k.\\a.(\\e.k u) (r s (\\m.e))) (X m (S (t S)) v) (\\m.E) (\\v.(\\l.\\o.\\b.\\u.h L (\\v.M) (\\a.\\n.G) ((\\h.\\s.e) (v c (\\u.x)))) x (\\m.\\f.r)) (\\n.\\t.(\\x.b (\\o.\\p.h m D)) t (\\z.\\a.L))) i (\\h.\\d.m A (\\o.(\\g.b) ((\\s.m (\\d.\\h.\\k.\\d.(\\r.\\b.n) (n z B (N q (W O)))) ((\\j.\\f.\\i.\\e.K) ((\\l.(\\h.Z) (g K) (L (\\c.m))) (N (\\g.O T (z u)))))) ((\\x.C) ((\\l.A x (\\r.v)) (m (\\e.w))) (\\x.a) ((\\d.\\v.\\c.\\s.i) ((\\m.\\n.\\f.m) X (\\f.\\m.(\\i.w) (d m) (u J (\\f.E)))))))))",
      "\\b.\\q.X (\\m.E) (\\v.\\b.\\u.i L (\\v.M) (\\a.\\n.G) (\\s.e)) (\\n.\\t.b (\\o.\\p.i m D) (\\z.\\a.L))"
    );
  }

  @Test
  public final void test230() {
    reducesTo(
      "\\w.Q (\\h.(\\w.(\\q.q (\\t.H) (\\l.M) (\\f.(\\q.t) (\\p.u) (\\i.r v l))) (\\k.r ((\\u.\\f.\\o.h) d)) (\\j.(\\i.c) ((\\j.\\z.E) ((\\q.c) (\\j.e) (Q j (P H))))) (x i ((\\p.r) (\\j.e)))) C) u",
      "\\w.Q (\\h.r (\\f.\\o.h) (\\l.M) (\\f.t (\\i.r v l)) (\\j.c) (x i (r))) u"
    );
  }

  @Test
  public final void test231() {
    reducesTo(
      "(\\j.(\\x.y (\\p.u)) (\\z.(\\l.(\\n.(\\s.\\n.\\m.j) ((\\t.k) (q v))) (\\g.W)) r (\\w.h) (\\q.y ((\\p.f) (\\s.(\\z.\\p.b y) (o n (t X)))) (n (k (J k) o ((\\z.v) I ((\\o.X) (\\y.Z)))))) (\\t.(\\x.\\t.s ((\\a.\\p.\\o.e) (\\r.c))) (\\q.\\u.(\\j.v (\\m.b)) x) ((\\g.\\y.\\k.\\y.q) ((\\f.\\o.g) ((\\v.(\\l.(\\o.t) (\\u.h)) (\\p.\\i.\\q.i)) ((\\s.A) (\\n.a) (\\d.e (\\g.x))))))))) (\\i.a)",
      "y (\\p.u)"
    );
  }

  @Test
  public final void test232() {
    reducesTo(
      "\\z.(\\j.m A) G",
      "\\z.m A"
    );
  }

  @Test
  public final void test233() {
    reducesTo(
      "(\\q.(\\b.\\t.\\v.(\\z.y ((\\n.s) d)) (\\a.\\t.c)) (\\g.P) b (\\r.k)) (P (\\k.\\z.H))",
      "y (s)"
    );
  }

  @Test
  public final void test234() {
    reducesTo(
      "\\g.c ((\\j.A) Y)",
      "\\g.c (A)"
    );
  }

  @Test
  public final void test235() {
    reducesTo(
      "\\j.(\\s.\\v.(\\e.(\\e.I) (\\g.(\\l.k) s)) (\\d.(\\k.i) g)) (\\p.\\u.z) ((\\q.V) (\\p.\\a.(\\i.(\\n.s (\\d.(\\g.\\n.E) ((\\t.(\\x.C) (\\x.w)) (l s c)))) q) x) (z (\\v.(\\x.(\\z.y i (O N) (\\y.\\d.n t) ((\\o.i) p)) A) (\\i.q)) (z K (\\a.\\m.m))))",
      "\\j.I"
    );
  }

  @Test
  public final void test236() {
    reducesTo(
      "\\o.\\l.I",
      "\\o.\\l.I"
    );
  }

  @Test
  public final void test237() {
    reducesTo(
      "\\t.\\e.\\z.(\\y.v) (\\h.(\\l.\\h.\\c.(\\b.\\o.\\q.o) (\\g.(\\u.\\k.(\\b.\\o.(\\p.\\t.x (q (\\i.s) s)) ((\\u.(\\u.q) w) h (\\p.\\d.\\y.\\m.z))) (\\q.(\\y.k) (\\p.C ((\\i.\\q.U) z)))) y)) (\\q.\\h.\\e.V))",
      "\\t.\\e.\\z.v"
    );
  }

  @Test
  public final void test238() {
    reducesTo(
      "B (\\v.(\\h.l) (\\q.\\p.\\d.\\n.\\b.x)) f",
      "B (\\v.l) f"
    );
  }

  @Test
  public final void test239() {
    reducesTo(
      "\\a.(\\t.\\c.u f (m y) (T W (c c)) (O (o (\\j.s))) v (\\b.\\s.\\i.\\g.v) ((\\q.(\\k.a (\\l.\\b.n)) z) (\\x.\\r.(\\q.\\d.\\p.X) ((\\k.t) r) (\\g.\\g.w K)) ((\\t.s c (\\f.i) (\\k.s)) (R (\\i.\\h.F f)) (\\o.i))) (\\w.\\m.\\m.D (\\n.z) (C (\\e.\\r.\\a.\\h.\\p.\\q.\\h.i) ((\\x.H) (\\c.m) (I (Q s)) (\\y.C ((\\v.o) k)))) A) l) ((\\j.\\u.\\j.k) ((\\s.y (\\c.l (\\y.U))) (\\h.B) (\\c.C (\\s.\\a.\\u.\\r.(\\j.\\v.c) (\\w.\\p.\\p.\\v.d r)) f K)))",
      "\\a.\\c.u f (m y) (T W (c c)) (O (o (\\j.s))) v (\\b.\\s.\\i.\\g.v) (a (\\l.\\b.n) (s c (\\f.i) (\\k.s) (\\o.i))) (\\w.\\m.\\m.D (\\n.z) (C (\\e.\\r.\\a.\\h.\\p.\\q.\\h.i) (H (I (Q s)) (\\y.C (o)))) A) l"
    );
  }

  @Test
  public final void test240() {
    reducesTo(
      "\\n.(\\m.W ((\\t.\\c.f (\\k.\\u.\\e.n) ((\\k.b F (\\k.b) ((\\r.f) r) (\\h.\\i.(\\k.b) d (K (\\h.e)))) y (\\a.(\\h.k) ((\\r.\\l.b) (\\e.o m (c N) (q r (y O))))))) ((\\q.d) (j (k j (\\r.k)) (\\z.\\y.\\e.Q) J) ((\\y.\\x.\\t.\\i.t) n (\\w.(\\d.(\\q.\\q.\\y.S) (\\l.v r (\\e.N) (V s n))) (\\q.(\\b.p) (\\k.L z (\\j.e)) A)))))) (\\t.c)",
      "\\n.W (\\c1.f (\\k.\\u.\\e.n) (b F (\\k.b) (f) (\\h.\\i.b (K (\\h.e))) (\\a.k)))"
    );
  }

  @Test
  public final void test241() {
    reducesTo(
      "\\p.N",
      "\\p.N"
    );
  }

  @Test
  public final void test242() {
    reducesTo(
      "(\\p.s) ((\\z.\\a.u) t)",
      "s"
    );
  }

  @Test
  public final void test243() {
    reducesTo(
      "\\f.(\\l.(\\b.\\m.(\\p.\\i.L) (\\i.\\m.\\c.V)) (\\a.(\\x.b (\\m.(\\h.\\y.Z) ((\\y.(\\c.(\\e.l) (\\a.h)) E) (i f (M v) z)))) (\\a.j)) e) (O ((\\i.y) (\\u.\\r.\\e.(\\w.\\f.O) B)))",
      "\\f.\\i.L"
    );
  }

  @Test
  public final void test244() {
    reducesTo(
      "\\v.\\t.\\i.(\\g.(\\i.\\a.\\y.\\w.\\d.\\c.\\u.(\\h.\\v.z) ((\\e.(\\h.c) j w) (\\a.\\l.l)) K (\\y.\\r.(\\w.\\l.l) ((\\c.Y) ((\\p.q) (w F))) (F ((\\u.s) k ((\\q.C) (\\m.u)))) (m C))) o (\\o.i)) (\\y.(\\s.\\e.p) (\\q.r))",
      "\\v.\\t.\\i.\\y.\\w.\\d.\\c.\\u.z (\\y.\\r.F (s (C)) (m C))"
    );
  }

  @Test
  public final void test245() {
    reducesTo(
      "(\\g.(\\t.\\g.\\e.(\\p.\\o.C d (\\o.m) (\\l.(\\q.l) (\\c.d)) (M (o a) (\\d.e (\\a.p)))) (\\s.(\\n.\\p.\\m.m) (\\n.(\\q.\\i.W p) (\\e.\\g.I))) ((\\b.c) (\\o.X) ((\\u.k) (b S)) (\\n.\\e.\\h.v h (\\g.Y) (m v (\\w.l))) i) (\\o.\\n.R)) (C (\\c.\\b.z) Q)) (\\j.(\\t.\\m.(\\v.(\\o.\\y.(\\t.t) ((\\c.\\v.(\\s.k) ((\\q.m) (S l))) U)) (d (\\l.q) (\\u.\\k.j P) (\\m.(\\o.Z) (\\m.n K (t y))) (b (\\f.q) (\\k.\\d.\\k.a) A))) ((\\z.z) (\\v.(\\a.D) (\\m.N)) ((\\e.F r (\\k.o)) (\\d.\\s.\\e.m)) (\\i.Z) ((\\z.e) (\\n.\\l.f)))) ((\\j.d (\\f.r g (\\q.i)) ((\\v.(\\f.l) (b j)) (j (\\b.o))) (\\q.(\\f.(\\f.\\e.N u) (k x k)) (e (Q g (\\j.i))))) ((\\m.\\o.(\\u.(\\k.\\u.k) (\\q.\\x.u)) a) a) (B (\\s.x)))) (A (\\e.\\k.q) (\\i.z))",
      "\\e.C d (\\o.m) (\\l.l) (M (c (k) (\\n.\\e.\\h.v h (\\g.Y) (m v (\\w.l))) i a) (\\d.e (\\a.\\s.\\p.\\m.m))) (\\o.\\n.R)"
    );
  }

  @Test
  public final void test246() {
    reducesTo(
      "(\\c.(\\c.T) (\\e.M) (\\q.b)) (U (c (\\h.\\d.(\\b.\\y.(\\j.\\v.\\a.h (\\x.\\f.\\e.k)) ((\\c.\\f.D (\\f.p y)) (\\h.h)) s) (\\d.\\q.Z))))",
      "T (\\q.b)"
    );
  }

  @Test
  public final void test247() {
    reducesTo(
      "\\s.c",
      "\\s.c"
    );
  }

  @Test
  public final void test248() {
    reducesTo(
      "(\\a.\\r.\\x.B) (x z)",
      "\\r.\\x.B"
    );
  }

  @Test
  public final void test249() {
    reducesTo(
      "d (r (\\q.(\\o.b h (\\v.h)) (u A (\\h.P)) (\\i.\\h.t) (\\t.\\l.m (\\p.\\o.M P) ((\\w.\\j.i) (r v (\\c.m)))) ((\\a.o h (O W) (\\e.b (\\p.M)) X) (\\g.(\\b.(\\s.J) (\\e.s) (\\r.o)) g))) K) (k o (\\h.(\\x.l) a ((\\h.b (\\j.\\x.\\q.d) (\\y.\\g.\\a.G ((\\j.j) (q h))) k) ((\\s.b g (n d) (\\u.E)) (v (s a (H u))) ((\\k.\\q.\\r.T) W (\\f.\\y.(\\h.V q) j))))) ((\\m.k) (\\m.(\\w.\\h.\\c.(\\v.(\\n.\\a.a) (\\y.\\z.p)) (Y b)) ((\\o.c (\\f.\\z.Y)) (\\h.(\\j.s q R) (G V (\\c.c))) (\\z.\\p.\\m.(\\p.\\u.P d g ((\\n.D) X)) (\\d.\\u.(\\f.r h) (f m (\\m.l)))))) (\\p.(\\t.\\j.Y) ((\\r.(\\j.\\i.\\w.(\\z.X) h ((\\n.B) (\\u.k))) H) (E ((\\s.\\a.z u) (b g (m K)))) (\\v.(\\e.\\x.(\\f.\\e.(\\z.\\i.Y) (\\q.\\k.s)) ((\\k.l) h)) (\\v.p))))))",
      "d (r (\\q.b h (\\v.h) (\\i.\\h.t) (\\t.\\l.m (\\p.\\o.M P) (\\j.i)) (o h (O W) (\\e.b (\\p.M)) X)) K) (k o (\\h.l (b (\\j.\\x.\\q.d) (\\y.\\g1.\\a2.G (q (b g (n d) (\\u.E) (\\r.T)))) k)) (k (\\p.\\j.Y)))"
    );
  }

  @Test
  public final void test250() {
    reducesTo(
      "t ((\\v.\\s.l) b)",
      "t (\\s.l)"
    );
  }

  @Test
  public final void test251() {
    reducesTo(
      "(\\s.d (u ((\\l.a) (\\s.o) ((\\y.m) (S n)) H) (\\b.\\s.t))) (\\n.x) (\\v.(\\b.(\\j.\\p.S) (q ((\\j.\\f.(\\q.t m) (U (\\g.r))) (\\d.v n ((\\n.k) g))) ((\\a.t) (\\d.\\a.\\v.Q) ((\\j.(\\s.o) (V r)) (l y)) (O (\\e.x))))) (\\o.(\\m.\\y.l) A)) (\\u.\\v.Q (\\q.Z (\\p.o ((\\b.w) ((\\n.\\r.\\c.(\\a.j y) h) a)) (\\c.j))))",
      "d (u (a (m) H) (\\b.\\s.t)) (\\v.\\p.S) (\\u.\\v.Q (\\q.Z (\\p.o (w) (\\c.j))))"
    );
  }

  @Test
  public final void test252() {
    reducesTo(
      "(\\d.(\\d.(\\c.\\k.r) (\\o.\\r.(\\n.(\\a.a) (\\x.a)) (\\v.(\\b.w) x) z) (\\h.(\\a.R) (\\s.y) (\\l.A))) (j C) (q (\\z.Q) (\\i.(\\x.\\g.\\n.E (\\p.\\f.y)) h (\\p.\\f.d))) y) ((\\e.X m) (\\h.\\m.(\\h.M) ((\\d.(\\k.p) b) (B z ((\\f.\\l.\\a.C) P)))) T J)",
      "r (q (\\z.Q) (\\i.\\n.E (\\p.\\f.y))) y"
    );
  }

  @Test
  public final void test253() {
    reducesTo(
      "(\\j.(\\f.X) (\\x.\\u.\\w.T)) (r (\\m.x S))",
      "X"
    );
  }

  @Test
  public final void test254() {
    reducesTo(
      "\\j.\\s.\\v.g",
      "\\j.\\s.\\v.g"
    );
  }

  @Test
  public final void test255() {
    reducesTo(
      "(\\c.\\p.j) (b (\\h.(\\w.\\q.\\k.l t) ((\\n.k) m (d (\\w.G)) p e)) ((\\n.\\k.j) (\\t.\\q.(\\m.l) V (\\e.\\y.(\\e.\\l.w) (T u (A k))) (t W (\\q.\\n.(\\w.r V) (I s (z O)))) (P (\\o.a))))) (\\o.\\y.t)",
      "j"
    );
  }

  @Test
  public final void test256() {
    reducesTo(
      "\\h.\\p.\\j.(\\r.(\\t.(\\z.\\d.Q) U) (m R)) s",
      "\\h.\\p.\\j.\\d.Q"
    );
  }

  @Test
  public final void test257() {
    reducesTo(
      "\\n.\\e.y k",
      "\\n.\\e.y k"
    );
  }

  @Test
  public final void test258() {
    reducesTo(
      "\\d.(\\v.(\\a.\\r.I (\\a.(\\a.a) (\\u.Q) (\\z.\\g.b)) (\\f.(\\z.h) ((\\n.x) (\\f.n)) (\\r.j (p (\\v.n))))) (\\x.\\y.n) ((\\x.T) ((\\c.\\j.e) S)) (\\g.(\\k.\\o.\\r.(\\w.\\o.(\\z.(\\n.i Z e) (\\d.k t (Z h)) (\\v.s (\\l.K K))) (g (z R))) (o (N (\\w.e f (\\d.g))) k)) J) e) t",
      "\\d.I (\\a.Q) (\\f.h (\\r.j (p (\\v.n)))) (\\g.\\o.\\r.\\o.i Z e (\\v.s (\\l.K K))) e"
    );
  }

  @Test
  public final void test259() {
    reducesTo(
      "P ((\\o.H) (\\n.(\\b.\\j.i) (\\l.\\y.G)) ((\\l.i) (\\h.\\k.g (a (\\n.\\o.\\y.q)) ((\\h.n H (\\i.d)) (y d (\\g.z)) (r (\\s.\\y.\\n.E)))) ((\\x.C ((\\f.\\g.q (\\s.L) (U g f)) (l f (v t) (\\s.\\l.t n)))) (\\v.\\n.y))) N)",
      "P (H (i (C (\\g.q (\\s.L) (U g (l f (v t) (\\s.\\l.t n)))))) N)"
    );
  }

  @Test
  public final void test260() {
    reducesTo(
      "(\\t.H) ((\\n.(\\n.\\h.\\a.\\p.\\y.\\o.(\\z.(\\x.T) (\\u.A)) D (\\n.m)) (\\y.(\\k.O i (p F) (\\q.\\t.u j)) L (\\d.b (\\a.s))) O j) (\\i.\\v.\\i.R b))",
      "H"
    );
  }

  @Test
  public final void test261() {
    reducesTo(
      "R (\\e.\\i.\\j.\\q.\\n.\\o.\\e.\\w.\\m.X ((\\a.g ((\\h.(\\b.(\\x.E) s) (\\s.O)) (X (\\s.\\h.N c)) (L (\\s.m ((\\l.k) k))) (Y (\\z.\\h.j)))) (\\l.\\t.X A)))",
      "R (\\e.\\i.\\j.\\q.\\n.\\o.\\e.\\w.\\m.X (g (E (L (\\s.m (k))) (Y (\\z.\\h.j)))))"
    );
  }

  @Test
  public final void test262() {
    reducesTo(
      "\\z.(\\t.\\q.n) ((\\x.k) ((\\r.\\k.(\\q.\\a.u) ((\\q.\\r.(\\t.\\y.(\\t.b) (i I) (\\b.\\a.\\t.w) (b n (\\x.K) ((\\e.p) (v p)))) ((\\x.(\\m.g) (\\s.f)) P ((\\g.U) ((\\l.d) (\\a.y))))) ((\\b.\\l.P) (\\x.(\\t.t) (\\s.\\u.\\t.w)) a))) (\\w.\\t.o (\\u.\\t.\\h.(\\o.\\s.p ((\\i.r) ((\\r.X) r))) (\\w.e)))))",
      "\\z.\\q.n"
    );
  }

  @Test
  public final void test263() {
    reducesTo(
      "\\y.a (\\u.\\f.\\j.(\\m.(\\q.\\f.\\x.\\o.m O) (\\j.q) (d (\\d.\\g.r g) ((\\g.M) (\\e.w) l)) (K (\\r.\\b.\\c.(\\a.\\l.\\m.J) (\\p.(\\o.U) (\\f.t) (\\z.N)))) (h ((\\w.c) A ((\\q.j) (A B)) (B (\\b.g)) ((\\i.(\\p.S) (\\o.j)) (G M (s b)) (f (x x (E s)))))) (\\u.m)) (\\v.\\a.x p (\\r.I s) ((\\i.\\e.(\\n.a) (\\v.i) (\\j.\\a.J i) (\\c.\\u.\\p.c)) n) ((\\w.(\\x.\\s.(\\y.r) r R) f) S y) (\\s.(\\c.\\h.(\\w.(\\i.a (\\n.Q)) (p D (u Q) (\\i.(\\u.Y) (\\n.y)) (u B (S m) (\\j.(\\q.C) (C o))))) (G ((\\a.g Z (\\t.n)) m) (R h))) (\\a.\\c.\\j.x (\\q.\\c.(\\k.\\p.R (f ((\\q.z) (\\m.I)))) (\\a.(\\p.W) ((\\c.N s (i e)) (\\a.n A (\\i.P)))))))))",
      "\\y.a (\\u.\\f.\\j.x p (\\r.I s) (\\e6.\\a.x p (\\r.I s) (\\e.a (\\j.\\a.J n) (\\c.\\u.\\p.c)) (r R) (\\s.\\h.a (\\n.Q))) (r R) (\\s8.\\h.\\v.\\a.x p (\\r.I s) (\\e.a (\\j.\\a.J n) (\\c.\\u.\\p.c)) (r R) (\\s.\\h.a (\\n.Q))))"
    );
  }

  @Test
  public final void test264() {
    reducesTo(
      "x (\\c.\\h.n (\\j.o))",
      "x (\\c.\\h.n (\\j.o))"
    );
  }

  @Test
  public final void test265() {
    reducesTo(
      "\\n.V g l ((\\r.(\\v.u (X (\\z.l (\\w.\\w.(\\z.(\\r.L) k) (\\x.\\f.(\\a.\\s.A) (\\j.x)))))) (v ((\\s.\\u.(\\w.z) (f i) (X (\\s.g))) (a (\\p.(\\h.p) (g o))) ((\\r.q) (\\j.r) (\\u.\\d.\\s.z) ((\\d.q) (\\j.a))) (m ((\\g.u (C f) (v v)) ((\\a.v) h ((\\o.R) q))))))) (\\z.\\o.\\z.(\\x.(\\w.\\t.Y (\\n.(\\q.(\\n.i v) (\\s.\\k.g)) (k j))) K ((\\b.\\z.\\s.(\\d.\\d.(\\g.(\\k.t) D ((\\j.e) (L N))) (s ((\\t.f) (V o)))) (\\w.s)) (\\e.w ((\\a.(\\a.X m T) (\\c.\\r.A O)) (\\s.(\\q.k j (Q h)) (\\u.\\j.\\a.g)))))) (\\p.\\c.H ((\\b.\\a.(\\k.M) M) (\\a.(\\p.\\i.(\\h.\\p.w) (b U (A o))) (M (\\c.j) (\\m.l))) (\\t.\\n.(\\p.q) ((\\x.\\t.\\q.e h) m))))))",
      "\\n.V g l (u (X (\\z.l (\\w.\\w.L))))"
    );
  }

  @Test
  public final void test266() {
    reducesTo(
      "\\t.\\b.(\\q.\\u.g) ((\\b.s ((\\a.\\z.c) s) (\\b.\\e.(\\u.(\\p.\\a.(\\x.r) z) (\\d.(\\v.\\v.\\x.\\i.\\v.(\\s.o T) (e (X y)) j) ((\\r.(\\g.B) (\\x.Y)) (\\l.\\a.n) (\\r.z)))) (m (\\h.(\\h.x e (e p)) (J p) (\\n.(\\y.O) (\\p.C) ((\\v.x) (G d))) ((\\t.\\j.R (\\o.d a)) ((\\z.b) (\\h.m) ((\\o.k) (\\u.E)))))))) (\\q.(\\s.z) ((\\g.(\\q.M) (\\f.v z)) ((\\n.\\d.Z K) (\\l.\\l.\\z.\\c.q (\\l.I)))) S))",
      "\\t.\\b.\\u.g"
    );
  }

  @Test
  public final void test267() {
    reducesTo(
      "\\a.W",
      "\\a.W"
    );
  }

  @Test
  public final void test268() {
    reducesTo(
      "(\\u.o (\\w.\\w.\\u.\\q.(\\k.\\r.(\\y.(\\g.j) (\\l.\\t.u)) (w E)) b (\\c.(\\o.\\r.w) (\\y.\\v.(\\o.t (e k)) (\\f.p) (\\k.N)) (\\h.\\v.(\\a.y) ((\\f.C) ((\\j.\\s.n g) (q o I))))))) (\\j.\\y.\\r.I) x",
      "o (\\w.\\w.\\u.\\q.j) x"
    );
  }

  @Test
  public final void test269() {
    reducesTo(
      "(\\t.O (\\f.R ((\\d.d (L A (\\d.V))) (\\r.\\p.\\j.(\\i.H) ((\\h.X) (\\g.z))) g (\\s.Y)))) (N (\\s.(\\w.Q g (N f) R ((\\y.(\\x.Q) f) (\\u.\\n.l Z)) (\\y.\\i.\\v.(\\s.j) (q Q) (H o (u T)) (\\y.\\h.(\\g.V n) (p (B q)))) (\\c.v ((\\i.U) b) ((\\w.b) (R q) (\\c.K)) (q (\\h.(\\q.c) (J a)) u))) ((\\h.\\h.\\s.(\\n.d) (\\t.K) (y I (\\f.u)) (T (b (\\k.l))) (\\g.(\\o.B) (\\t.s) (Z q K) (\\v.\\p.(\\x.N w) o))) z))) (\\h.v)",
      "O (\\f.R (H)) (\\h.v)"
    );
  }

  @Test
  public final void test270() {
    reducesTo(
      "\\y.g",
      "\\y.g"
    );
  }

  @Test
  public final void test271() {
    reducesTo(
      "\\h.(\\r.e ((\\e.(\\h.\\x.W N n U (\\j.\\m.l)) ((\\d.(\\g.\\i.\\o.a (\\i.(\\l.I) a (\\a.D M))) (\\b.\\n.\\w.(\\d.\\t.B) (\\r.\\u.u) (\\a.\\p.\\y.(\\h.R) (y l)))) m)) (p (\\s.\\q.\\j.\\v.n)))) (d (\\t.(\\k.(\\o.(\\u.\\t.w) r) (r ((\\v.(\\k.\\o.Y T) s m) (b (\\r.S) u)))) Q))",
      "\\h.e (\\x.W N n U (\\j.\\m.l))"
    );
  }

}
