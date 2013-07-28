package lambdacalc;

import org.junit.Test;

public final class TestBetaReducer5 extends ATestBetaReducer {

  @Test
  public final void test0() {
    reducesTo(
      "\\s.g (g (Q (\\z.d r n (\\h.T D (k H)) ((\\n.\\d.Y i) (\\n.(\\h.e) x))) (\\w.(\\i.(\\g.(\\y.S) a) (b (\\i.n))) (\\u.\\m.L l) (\\b.\\p.\\q.X)) ((\\p.V) ((\\c.(\\d.y) (\\o.t)) L) Q (\\j.(\\b.\\q.\\y.d) (\\d.a g (N j) (\\j.(\\u.e) (U o))) ((\\o.\\m.r v) ((\\t.V) (\\b.B)) (\\f.Y))))) ((\\z.e (\\l.(\\c.\\w.y) (\\s.o (\\m.V) ((\\d.z) (g U))))) (s ((\\z.k) (y A (\\d.a))) ((\\t.c) (L R) (\\g.\\b.\\s.w) F)) G h))",
      "\\s.g (g (Q (\\z.d r n (\\h.T D (k H)) (\\d.Y i)) (\\w.S (\\b.\\p.\\q.X)) (V Q (\\j.\\y.d))) (e (\\l.\\w.y) G h))"
    );
  }

  @Test
  public final void test1() {
    reducesTo(
      "\\z.g",
      "\\z.g"
    );
  }

  @Test
  public final void test2() {
    reducesTo(
      "(\\s.h) ((\\n.F) (\\m.o)) g",
      "h g"
    );
  }

  @Test
  public final void test3() {
    reducesTo(
      "(\\i.Z) ((\\g.\\h.\\d.H) ((\\v.R) ((\\i.(\\f.\\p.(\\h.Z) (f h) (o (\\f.d))) ((\\f.v) (\\d.\\d.T j)) q) f) (\\d.h (H i) (b (\\s.(\\j.\\q.e) S (\\e.c) (\\o.a))))))",
      "Z"
    );
  }

  @Test
  public final void test4() {
    reducesTo(
      "\\x.\\g.y b",
      "\\x.\\g.y b"
    );
  }

  @Test
  public final void test5() {
    reducesTo(
      "(\\x.n) u ((\\k.c) (\\j.(\\p.q) (\\w.X) (\\q.\\v.\\s.H) ((\\x.t) (\\c.J)))) ((\\r.r (\\t.(\\g.n g (\\a.U) (u h (Y n))) (S o i (l s (\\r.c))) (a (\\a.\\p.\\n.u) (\\j.(\\t.i) (R N) (g r (y M)))))) (\\h.(\\n.F) ((\\l.\\f.u s) n) k ((\\b.(\\f.s) ((\\z.F Y (E b)) Q)) (\\n.D))) (\\w.\\x.(\\g.\\k.\\x.\\q.\\y.\\h.F) ((\\g.(\\m.I t) L) (\\k.i (k R) (\\s.z)) c l))) P",
      "n (c) (F k (s) (\\w.\\x.\\k.\\x.\\q.\\y.\\h.F)) P"
    );
  }

  @Test
  public final void test6() {
    reducesTo(
      "(\\d.(\\x.\\c.Q) V Q (\\l.c)) (\\g.m (\\y.\\h.\\d.N (\\i.\\x.(\\n.G) (\\z.P))) ((\\f.e) ((\\v.(\\f.(\\t.s) ((\\s.w) x)) (f ((\\v.t) (Z D))) (\\w.\\j.\\g.(\\q.\\a.\\x.\\g.\\t.c T) (\\j.t (R A t))) ((\\u.e (y c) (\\v.(\\n.j) (\\w.A))) (g (\\x.(\\l.d) (\\u.f))) (\\u.t))) x)))",
      "Q (\\l.c)"
    );
  }

  @Test
  public final void test7() {
    reducesTo(
      "\\t.v",
      "\\t.v"
    );
  }

  @Test
  public final void test8() {
    reducesTo(
      "\\a.Z",
      "\\a.Z"
    );
  }

  @Test
  public final void test9() {
    reducesTo(
      "(\\y.o (\\j.w P) R ((\\x.\\c.j) (\\f.(\\l.\\g.\\u.T) (\\s.O) (\\c.k)))) (\\x.(\\v.m q o) s) ((\\d.\\y.\\k.d ((\\b.p) (\\e.Z))) (\\h.c (\\m.\\c.\\l.y) (\\z.(\\g.(\\l.\\c.\\a.\\o.L (\\i.a)) x) (C V (\\d.\\p.k))) (\\a.(\\u.\\m.\\c.\\i.\\o.T (s k (q i)) L ((\\s.\\e.x b (i n) (m (\\o.v))) ((\\l.T u B) (\\u.(\\f.l) (\\z.m))))) ((\\t.\\a.(\\t.\\g.\\b.c) (\\z.S)) ((\\g.(\\r.r v (\\v.v)) (M A (j h))) (\\i.u)))) (D (N (\\o.\\q.\\n.G) ((\\s.u) (A l) (h J (\\a.r)))) (\\l.(\\s.\\x.E) E ((\\l.h) (\\t.\\o.(\\v.t) d (\\k.m u)))) ((\\c.\\n.(\\g.(\\k.U) t (T (\\u.B)) ((\\b.(\\n.v) s) (\\y.G U (\\g.s)))) (S ((\\p.(\\s.q) (w c)) (\\s.\\x.F f)))) (\\x.(\\y.\\h.(\\i.(\\m.\\q.c) (\\v.W)) o) (\\p.\\y.\\k.(\\w.(\\i.z) g) V))))))",
      "o (\\j.w P) R (\\c.j) (\\y1.\\k2.c (\\m.\\c.\\l.y) (\\z.\\c.\\a.\\o.L (\\i.a)) (\\a.\\m.\\c3.\\i.\\o.T (s k (q i)) L (\\e.x b (i n) (m (\\o.v)))) (D (N (\\o.\\q.\\n.G) (u (p J (\\a.r)))) (\\l.E) (\\n.U (T (\\u.B)) (v))))"
    );
  }

  @Test
  public final void test10() {
    reducesTo(
      "B p l",
      "B p l"
    );
  }

  @Test
  public final void test11() {
    reducesTo(
      "(\\y.\\d.j) (\\d.\\j.\\f.v)",
      "\\d.j"
    );
  }

  @Test
  public final void test12() {
    reducesTo(
      "\\n.(\\t.\\x.\\p.R) (\\a.\\k.(\\q.z) (\\f.A) D (\\x.(\\q.a) (\\n.r) (y O (v H))) j (\\j.\\k.g) (\\c.\\r.\\l.A (\\o.b)) N ((\\u.\\k.(\\c.b) ((\\i.\\g.\\z.(\\x.\\y.\\j.\\u.\\x.\\q.\\l.\\w.\\z.(\\a.d r) (\\z.p)) m) (\\b.\\e.(\\x.t) (\\i.(\\h.Y) (\\c.M) (t (Q q)) (E I u (\\z.\\u.L P)))))) d))",
      "\\n.\\x.\\p.R"
    );
  }

  @Test
  public final void test13() {
    reducesTo(
      "B d (\\m.(\\c.L) ((\\r.(\\o.x) (\\s.\\a.\\u.h)) f) N) (\\c.B) (\\b.Q)",
      "B d (\\m.L N) (\\c.B) (\\b.Q)"
    );
  }

  @Test
  public final void test14() {
    reducesTo(
      "h f ((\\l.g) z)",
      "h f (g)"
    );
  }

  @Test
  public final void test15() {
    reducesTo(
      "(\\n.\\w.\\o.\\n.M (\\y.y) (a W y (\\a.(\\s.(\\v.\\e.\\l.b) (P p (\\w.D))) (d (p i f))) (\\o.\\m.e) (\\w.x z) ((\\n.m (\\d.\\e.g s)) D (\\x.K) (G (t H (n U)) (\\o.(\\m.(\\c.i) (\\j.q)) (\\s.\\k.\\w.n)) (\\r.(\\i.(\\d.W) (\\w.v) J) s)) (\\k.\\b.(\\s.p) (\\y.x (\\r.m I)))))) ((\\s.\\i.f) ((\\z.\\d.V) (\\l.H)) (z (\\t.(\\q.w E) (\\p.\\k.(\\o.u) (\\t.\\n.u w (\\m.y) (\\t.C (\\q.x)) ((\\a.k) (t I) H))) p)))",
      "\\w.\\o.\\n.M (\\y.y) (a W y (\\a.\\e.\\l.b) (\\o.\\m.e) (\\w.x z) (m (\\d.\\e.g s) (\\x.K) (G (t H (n U)) (\\o.i) (\\r.W J)) (\\k.\\b.p)))"
    );
  }

  @Test
  public final void test16() {
    reducesTo(
      "\\c.k",
      "\\c.k"
    );
  }

  @Test
  public final void test17() {
    reducesTo(
      "\\m.\\f.(\\v.k) ((\\a.(\\g.k M (\\n.i) ((\\t.N) (t u))) ((\\l.l) (\\o.b) (\\p.(\\f.r) (i W)))) f) (\\l.\\f.\\k.(\\b.A) (\\w.(\\a.\\t.N) (\\n.\\a.(\\x.(\\b.\\r.O) (\\j.\\f.h)) (\\u.\\a.\\z.b (\\f.j))))) ((\\r.x (\\q.\\u.W) c) ((\\v.(\\f.\\u.Y H) ((\\b.a) (\\h.f)) (\\q.(\\l.(\\m.r) D) (\\t.(\\h.M) (\\l.k)))) (Y (\\p.v) (\\n.x g (W z)) ((\\u.\\w.\\c.r) i)) (g (\\c.\\k.k)))) j ((\\p.\\c.Y (a (\\a.L))) ((\\s.b) ((\\h.\\h.\\z.\\x.w Q) b)))",
      "\\m.\\f.k (\\l.\\f.\\k.A) (x (\\q.\\u.W) c) j (\\c.Y (a (\\a.L)))"
    );
  }

  @Test
  public final void test18() {
    reducesTo(
      "\\g.\\w.(\\q.\\x.o (\\s.\\v.E) j) ((\\d.b) (\\l.(\\t.(\\y.(\\p.Y) (P u) Q (\\d.r (\\f.t q))) (j ((\\b.u) (\\b.o) (\\n.a (\\a.c))))) (q (\\t.K)) G)) (\\b.\\c.(\\c.(\\v.\\q.(\\a.\\j.\\g.r (\\p.J (t f (m m) ((\\p.r) (\\o.J))) (Z J))) (\\x.i f (\\g.U))) (J (r (\\o.(\\u.\\c.y) (w c (J z)) s)) z)) (\\j.i))",
      "\\g.\\w.o (\\s.\\v.E) j"
    );
  }

  @Test
  public final void test19() {
    reducesTo(
      "\\l.x",
      "\\l.x"
    );
  }

  @Test
  public final void test20() {
    reducesTo(
      "(\\s.z) ((\\p.\\j.\\j.o (\\g.(\\w.r (\\o.x (\\o.\\n.(\\j.y) (y k) H)) (\\y.W (\\i.H k))) X)) ((\\z.\\s.(\\f.s ((\\s.y) (F d))) (w o)) (\\j.(\\g.X) (\\v.\\d.i (\\l.\\k.R))) (G ((\\u.E) (V t)) (\\z.s (Y m (S W))) (\\y.(\\i.a) b)) (k (k (\\q.l) ((\\q.p) ((\\p.\\d.\\f.u) ((\\k.d) (J s)))))) (\\m.\\d.\\u.(\\v.\\v.v) (p (\\z.\\d.e g) (\\e.(\\h.\\k.p v) ((\\q.d) (\\s.n)))) (a (\\t.\\c.\\h.h (\\i.T))) (V h))))",
      "z"
    );
  }

  @Test
  public final void test21() {
    reducesTo(
      "\\i.(\\s.j ((\\h.\\b.i (c (N h (\\h.n)) (i (f F) (\\y.i)))) (\\n.(\\i.\\n.o) u))) (\\s.\\j.\\g.\\p.\\b.\\f.(\\c.F r q) (\\q.(\\e.m) (\\i.u)) (\\d.m ((\\l.r) (\\a.Z))) ((\\n.u (\\v.z)) z U) (\\b.m) e) c C",
      "\\i.j (\\b.i (c (N (\\n.\\n.o) (\\h.n)) (i (f F) (\\y.i)))) c C"
    );
  }

  @Test
  public final void test22() {
    reducesTo(
      "\\r.\\d.(\\j.(\\p.(\\d.(\\x.o) (\\u.\\e.\\j.s ((\\y.\\n.\\v.L) (\\o.(\\z.\\h.s) (m N (\\r.k))))) k) (s ((\\p.t (j ((\\v.o) (\\h.m))) (\\f.a)) (\\p.R)))) (\\f.\\n.(\\u.(\\d.(\\o.M) (\\s.(\\b.\\d.(\\u.t) (\\i.\\j.\\h.w)) t)) (c (\\k.Q))) ((\\k.\\d.(\\o.h) (\\b.\\t.\\p.\\x.(\\h.(\\i.f v) z) (\\s.g v (\\e.s) (\\t.y)))) Z A))) (J (J (s (L k (\\q.\\e.h (b g) (Q (k a)))) h (\\i.\\f.b (\\t.\\h.\\k.j) (\\z.Z)))))",
      "\\r.\\d.o k"
    );
  }

  @Test
  public final void test23() {
    reducesTo(
      "\\q.b (\\w.C)",
      "\\q.b (\\w.C)"
    );
  }

  @Test
  public final void test24() {
    reducesTo(
      "(\\e.D) ((\\u.\\a.\\p.\\n.A) z)",
      "D"
    );
  }

  @Test
  public final void test25() {
    reducesTo(
      "(\\c.\\u.\\p.(\\c.S) X) ((\\l.a (\\s.\\l.(\\a.O) (\\s.\\m.p)) ((\\s.\\g.p (z (k q))) H) (\\h.(\\u.f K (\\e.E) (\\k.m)) (\\f.\\k.(\\z.h) l (\\o.\\m.r)) ((\\l.\\x.\\a.\\z.j K (\\k.w)) k)) (\\y.\\f.\\b.\\e.g (\\y.\\z.C))) (\\m.\\h.d (e j y) (b (\\w.\\h.b (\\d.n) (\\y.v) ((\\b.J) t (\\e.J))) U))) U",
      "\\p.S"
    );
  }

  @Test
  public final void test26() {
    reducesTo(
      "U k (\\c.(\\w.(\\d.\\u.(\\e.z) (\\q.L (\\z.\\l.\\j.c))) (\\u.(\\c.\\v.(\\l.\\n.n) x) (K (j V) (\\p.\\e.\\r.x)) ((\\t.a m (\\k.H)) (\\n.(\\o.d) c) (k v (c b) (\\l.q))) (\\x.(\\y.Y (z n (u N))) h ((\\n.u) (\\i.\\h.n))))) p) ((\\x.\\d.\\m.g) p ((\\g.\\l.\\o.\\q.\\k.t) ((\\h.r) ((\\x.l) w) t ((\\a.(\\p.k) (\\t.\\w.\\j.\\b.q ((\\t.x) (\\q.a)) (\\e.b (\\c.\\s.w)))) F))))",
      "U k (\\c.\\u.z) (\\m.g)"
    );
  }

  @Test
  public final void test27() {
    reducesTo(
      "q ((\\k.F ((\\x.p) (\\z.N) A)) e (\\x.c) (\\t.v) (c (\\z.(\\a.n) (\\l.e (\\i.\\y.l))) (\\k.(\\h.(\\t.P) ((\\g.(\\h.m) (T k)) (\\q.e (\\n.C))) ((\\e.z) p (w j j) E)) z))) ((\\q.(\\k.f) N) (m Q) (D ((\\q.\\w.E ((\\q.f) (o n)) (\\f.(\\d.\\j.U) (r s (y e)))) (B (\\n.Q) D (\\e.(\\i.B) s))) (Q (j T) (\\n.\\m.i) (\\n.(\\q.\\e.p x) (\\j.x)) U h)) ((\\w.\\a.M) c ((\\s.(\\e.(\\q.(\\v.e) (v x)) ((\\o.F) (\\d.p)) (c (\\i.h) T)) (\\g.d)) (q ((\\p.(\\u.e) k) (\\p.\\q.d) (\\b.C t (z x) (\\t.(\\b.A) p))))) (g (\\t.x))))",
      "q (F (p A) (\\x.c) (\\t.v) (c (\\z.n) (\\k.P (z (w j j) E)))) (f (D (\\w.E (f) (\\f.\\j.U)) (Q (j T) (\\n.\\m.i) (\\n.\\e.p x) U h)) (M (g (\\t.x))))"
    );
  }

  @Test
  public final void test28() {
    reducesTo(
      "(\\t.h) ((\\o.f) (\\w.o)) J",
      "h J"
    );
  }

  @Test
  public final void test29() {
    reducesTo(
      "\\y.\\h.\\z.u",
      "\\y.\\h.\\z.u"
    );
  }

  @Test
  public final void test30() {
    reducesTo(
      "\\f.\\m.k",
      "\\f.\\m.k"
    );
  }

  @Test
  public final void test31() {
    reducesTo(
      "\\i.a (\\c.c (\\h.\\h.(\\f.\\e.\\m.R g m (\\m.(\\l.(\\i.t) p (\\y.s F)) (\\a.(\\c.\\o.e) L)) (\\b.U)) ((\\l.h) z)) ((\\r.u p) (\\e.\\k.(\\p.(\\b.S) (\\k.\\o.S) ((\\b.(\\l.c) (\\c.f) ((\\j.k) (b g))) (\\j.e ((\\u.d) (\\n.m))))) (\\k.\\x.w x)) (\\g.\\z.\\s.\\s.\\h.(\\g.(\\e.R y ((\\e.(\\n.\\q.\\r.z) (g p (W n))) f)) (\\u.u)) (\\a.(\\h.k J) (r h (\\w.\\b.\\j.u)) (\\q.\\w.(\\e.L) k (\\q.\\o.\\z.q) (x (\\a.\\a.\\x.o))) ((\\h.\\s.O) u ((\\b.W) (\\r.\\g.\\c.m D (\\f.K z))))))))",
      "\\i.a (\\c.c (\\h.\\h.\\e.\\m.R g m (\\m.t (\\y.s F)) (\\b.U)) (u p (\\g.\\z.\\s.\\s.\\h.R y (\\q.\\r.z))))"
    );
  }

  @Test
  public final void test32() {
    reducesTo(
      "(\\b.e) (\\m.y) (\\b.F (W (v y) p) (\\y.(\\e.S) (\\f.W) (q u p) (\\r.(\\f.q) (h A) (\\x.\\l.a b))) (\\t.\\g.n ((\\t.\\p.p) ((\\w.u) u))) (a H) (o (\\c.t) (\\u.S ((\\i.b S (j q)) w) ((\\b.b) (\\l.k) (z Y (\\z.u)) (\\m.\\h.X e)) ((\\q.(\\o.(\\f.a) (r l) (\\x.o)) (\\f.\\f.\\p.(\\o.J) (\\z.s) (\\n.W i))) (\\n.k D)))) (\\i.(\\z.\\i.(\\f.s (e (\\x.B))) (\\h.(\\h.(\\y.\\u.\\j.X) l) (f I h)) (\\g.Q ((\\m.\\l.(\\t.(\\x.W) (\\d.P)) (V y) E) (\\b.\\t.(\\m.u m (d L)) (j (f K)) (\\p.\\h.(\\m.\\n.A) (\\b.E D)))))) ((\\p.\\s.x) D)))",
      "e (\\b.F (W (v y) p) (\\y.S (q u p) (\\r.q (\\x.\\l.a b))) (\\t.\\g.n (\\p.p)) (a H) (o (\\c.t) (\\u.S (b S (j q)) (k (\\m.\\h.X e)) (a (\\x.\\f.\\f.\\p.J (\\n.W i))))) (\\i.\\i.s (e (\\x.B)) (\\g.Q (\\l.W E))))"
    );
  }

  @Test
  public final void test33() {
    reducesTo(
      "(\\r.P) ((\\w.z) (\\p.(\\i.Y) ((\\f.\\z.\\k.F) ((\\g.(\\l.s ((\\f.m) (D c) (r h t))) (\\d.Z)) ((\\s.\\r.\\q.\\b.V) ((\\a.(\\n.b) (\\z.g)) r) g)))))",
      "P"
    );
  }

  @Test
  public final void test34() {
    reducesTo(
      "(\\p.\\j.(\\r.\\b.Q) (\\k.(\\u.\\s.\\y.\\f.s (j S q) (\\a.H)) (\\l.\\u.B f)) (\\f.\\w.\\c.\\k.\\w.\\v.(\\a.k (\\f.(\\z.\\p.(\\q.\\n.s) ((\\w.(\\c.J) (\\b.h)) (J z (g T)))) (\\q.(\\f.y) (\\n.\\v.\\b.F)))) (\\l.\\u.(\\i.\\u.\\o.c) (\\g.\\t.M))) (\\r.b)) (\\d.\\s.\\b.o)",
      "\\j.Q (\\r.b)"
    );
  }

  @Test
  public final void test35() {
    reducesTo(
      "(\\u.(\\h.t (a (\\d.\\k.f z)) ((\\t.x) (D P) (\\h.l d (K K)) J)) h (\\j.\\h.(\\f.\\r.\\u.j) (j (\\s.\\i.g) (\\h.p)) (\\h.\\p.\\n.(\\z.\\a.\\x.n) ((\\g.S) (j y)) (\\o.x) (\\t.l)))) (U ((\\k.(\\i.\\u.\\q.x) ((\\a.o) (\\c.v))) (\\p.d) ((\\v.\\b.\\q.\\p.s) ((\\h.\\v.y j) ((\\v.L) (\\d.e)))) (\\r.m))) (y o ((\\v.\\s.m (\\l.\\p.\\n.m) (\\d.(\\g.o) (V v) (\\n.\\f.s M)) (M u (\\l.a) W (\\h.\\l.\\j.\\g.c D (\\q.p)))) (\\i.x)) (\\p.t ((\\q.f) (\\j.u) o (\\z.i) k (\\w.\\j.(\\e.n) (\\s.(\\o.l H e) r (\\n.\\r.j ((\\c.F) (\\y.g)))))))) (R (\\m.c) (O (\\p.(\\s.\\h.(\\s.\\s.(\\u.f) (v s) (\\e.d r)) ((\\x.k) (\\t.d) ((\\a.a) (\\h.e))) (\\w.\\j.\\k.(\\s.\\u.\\j.\\f.\\p.p) Z)) (\\i.\\v.\\h.G)) (j (w (r K (q y)) (E ((\\d.u) (\\o.b)))) (\\g.C ((\\o.\\v.(\\e.t v) (\\d.\\n.F)) (\\s.\\j.Q))) (x (a (\\u.D)) (\\b.\\g.c)))))",
      "t (a (\\d.\\k.f z)) (x (\\h.l d (K K)) J) (\\j.\\h.\\u.j) (y o (\\s.m (\\l.\\p.\\n.m) (\\d.o (\\n.\\f.s M)) (M u (\\l.a) W (\\h.\\l.\\j.\\g.c D (\\q.p)))) (\\p.t (f o (\\z.i) k (\\w.\\j.n)))) (R (\\m.c) (O (\\p.\\h.f (\\e.d r)) (j (w (r K (q y)) (E (u))) (\\g.C (\\v.t v)) (x (a (\\u.D)) (\\b.\\g.c)))))"
    );
  }

  @Test
  public final void test36() {
    reducesTo(
      "r (\\v.g)",
      "r (\\v.g)"
    );
  }

  @Test
  public final void test37() {
    reducesTo(
      "\\h.d",
      "\\h.d"
    );
  }

  @Test
  public final void test38() {
    reducesTo(
      "\\l.\\o.(\\k.m) (\\m.\\b.(\\m.W) (\\s.\\q.(\\q.Z (\\x.x)) (\\c.i (O o) (r (\\g.B)) (\\t.s ((\\d.L) (\\u.g))) b) ((\\k.\\i.K) ((\\p.o) (\\z.z)) (Q (\\x.B (\\o.\\x.\\p.\\c.U)))) (e (\\o.O))))",
      "\\l.\\o.m"
    );
  }

  @Test
  public final void test39() {
    reducesTo(
      "\\i.(\\k.j) t",
      "\\i.j"
    );
  }

  @Test
  public final void test40() {
    reducesTo(
      "\\b.\\w.n (\\h.\\a.r (\\a.q))",
      "\\b.\\w.n (\\h.\\a.r (\\a.q))"
    );
  }

  @Test
  public final void test41() {
    reducesTo(
      "(\\y.\\g.Z (\\s.\\o.\\q.\\f.K (\\a.D))) (o ((\\n.\\l.(\\i.b u ((\\l.\\r.v) (\\w.h))) p) (\\q.\\w.e (\\p.(\\d.a) (\\l.e) (\\o.\\b.n) (\\o.\\j.n (\\q.d) (\\i.h K))) (r (S k) c ((\\s.d n (\\f.x)) (\\g.\\r.X)) (k (\\t.\\y.N (\\b.R) (\\t.v)))))) (\\p.\\z.Z c))",
      "\\g.Z (\\s.\\o.\\q.\\f.K (\\a.D))"
    );
  }

  @Test
  public final void test42() {
    reducesTo(
      "(\\u.t) (\\x.\\r.g)",
      "t"
    );
  }

  @Test
  public final void test43() {
    reducesTo(
      "\\k.A",
      "\\k.A"
    );
  }

  @Test
  public final void test44() {
    reducesTo(
      "(\\r.\\n.c (d (\\g.\\c.\\q.d))) o",
      "\\n.c (d (\\g.\\c.\\q.d))"
    );
  }

  @Test
  public final void test45() {
    reducesTo(
      "\\g.\\b.(\\e.h) (O (\\k.\\m.d))",
      "\\g.\\b.h"
    );
  }

  @Test
  public final void test46() {
    reducesTo(
      "(\\m.(\\w.(\\a.\\a.t x) (\\e.s (t i)) (\\i.v) (\\g.Z ((\\x.d) B a))) R ((\\x.t) y) (\\f.\\g.D) (\\m.\\x.u)) (\\y.(\\q.\\g.(\\u.(\\u.(\\z.b) (\\o.f)) l ((\\l.(\\j.x) (d X)) (\\j.(\\u.j) (z q))) (\\l.\\s.(\\f.\\s.(\\m.\\b.V) (\\v.A f)) (i n (\\y.n) i)) (\\w.\\y.\\l.c)) (n (\\o.\\o.\\l.p))) (B (\\z.\\u.m (w H) (\\p.\\q.F k) ((\\y.u) ((\\b.p) (\\f.n))) ((\\h.E) l (\\f.(\\r.c) (\\v.L)) (L r (i m) (\\n.R r)))) (\\t.(\\y.\\c.d (k R (\\h.h) ((\\o.g v (l V)) (\\d.v)))) ((\\z.j) (q C) (X (\\t.p)) (\\x.z) ((\\d.d) (\\n.U (\\k.\\d.F X)))))) (\\a.H))",
      "t x (\\g.Z (d a)) (t) (\\f.\\g.D) (\\m.\\x.u)"
    );
  }

  @Test
  public final void test47() {
    reducesTo(
      "\\c.(\\e.(\\t.\\u.\\u.\\z.m) (O (\\u.\\s.\\d.(\\h.\\k.d) (\\o.\\s.N)) (\\n.\\u.(\\a.\\h.\\i.w) (\\w.m (\\o.f)) (m (\\d.m) (\\w.o))) s (\\k.f))) (\\g.\\r.n T) t",
      "\\c.\\u.\\z.m"
    );
  }

  @Test
  public final void test48() {
    reducesTo(
      "(\\d.\\y.g) (\\q.\\k.q)",
      "\\y.g"
    );
  }

  @Test
  public final void test49() {
    reducesTo(
      "\\t.f",
      "\\t.f"
    );
  }

  @Test
  public final void test50() {
    reducesTo(
      "g (l x ((\\g.s ((\\o.\\x.(\\s.\\k.H) ((\\q.l) (\\a.b))) (\\t.\\w.(\\m.J m) B)) (\\d.(\\i.Q (b M) (I k (\\o.s))) (s m (\\y.G) z) (\\j.u)) w) (\\n.(\\t.\\b.(\\n.(\\f.d) (\\d.\\p.m)) (\\g.e)) ((\\i.\\d.(\\j.n Q) F) a) (\\p.L (\\u.M)) (\\r.\\k.\\s.(\\u.u) a (\\m.i (q (\\v.m) z (\\a.(\\w.O) (v S) (\\t.A))))))))",
      "g (l x (s (\\x.\\k.H) (\\d.Q (b M) (I k (\\o.s)) (\\j.u)) w))"
    );
  }

  @Test
  public final void test51() {
    reducesTo(
      "\\w.\\r.(\\r.o) (\\g.a r (\\q.\\o.\\q.\\d.L h) ((\\w.t) K) O h ((\\x.N (\\u.Z)) (\\m.(\\y.v) ((\\c.R) (\\j.a)))))",
      "\\w.\\r.o"
    );
  }

  @Test
  public final void test52() {
    reducesTo(
      "\\r.\\q.e",
      "\\r.\\q.e"
    );
  }

  @Test
  public final void test53() {
    reducesTo(
      "\\r.\\y.\\o.(\\h.\\s.(\\g.\\l.b) (\\j.\\v.W)) ((\\n.\\n.\\c.o) (\\y.(\\k.(\\y.\\n.\\e.b) (\\d.p (e l))) (\\d.S Z ((\\f.I) (O P))) (\\k.(\\a.V) o) (\\m.\\h.\\n.\\e.\\t.(\\r.a d h (N (\\y.i)) o) ((\\d.\\m.\\m.M) ((\\t.H) (x r)) (\\x.S)))) q) (i ((\\c.z) (\\q.V (\\x.\\g.C) (\\k.\\h.s N (\\g.w) ((\\n.U) (\\f.B)) Y ((\\e.(\\x.\\s.n j) t) k)) (\\d.\\h.(\\i.\\n.e) (\\i.P ((\\e.a) ((\\g.R) ((\\a.p) v))))))))",
      "\\r.\\y.\\o.\\l.b"
    );
  }

  @Test
  public final void test54() {
    reducesTo(
      "\\d.E",
      "\\d.E"
    );
  }

  @Test
  public final void test55() {
    reducesTo(
      "U ((\\m.(\\j.f (\\c.(\\z.\\l.(\\s.\\x.R) ((\\o.p) (\\d.Z)) (r (a V (\\v.K)))) H)) L) ((\\j.y) (v b ((\\s.S (c (\\a.S) (\\z.(\\w.i) C))) (S ((\\s.c) (T n) (m (\\q.p))))))) n)",
      "U (f (\\c.\\l.R) n)"
    );
  }

  @Test
  public final void test56() {
    reducesTo(
      "\\j.(\\n.q) (\\n.(\\d.J) (\\q.\\j.m (j ((\\w.(\\i.\\b.d (V p (\\h.q))) (n k (\\i.W) h)) (l (z s) (\\p.\\z.\\t.i) ((\\m.n) (\\d.L) p)))))) (\\w.(\\i.M) ((\\c.i) ((\\p.j) G)) (\\b.Q ((\\v.b (\\n.(\\d.E (\\s.k)) (\\w.(\\w.G) S))) (\\e.(\\j.\\z.\\u.x) j b)) (\\c.p (\\y.\\g.V)) ((\\j.g ((\\t.\\j.i) ((\\a.\\y.Q B) (\\m.\\p.x W) (\\g.(\\b.s) (\\s.A))))) c)))",
      "\\j.q (\\w.M (\\b.Q (b (\\n.E (\\s.k))) (\\c.p (\\y.\\g.V)) (g (\\j.i))))"
    );
  }

  @Test
  public final void test57() {
    reducesTo(
      "\\h.\\p.(\\t.(\\c.\\d.\\j.\\b.(\\h.(\\y.o) (\\k.(\\m.M (\\v.W o)) L)) (h q)) (\\r.\\k.\\t.\\p.m) V) (\\m.\\r.p (\\g.\\h.f) y)",
      "\\h.\\p.\\j.\\b.o"
    );
  }

  @Test
  public final void test58() {
    reducesTo(
      "\\l.s (f (s (\\e.\\v.(\\i.G ((\\w.r) ((\\x.w) b))) p (\\p.l ((\\y.a Q F (\\d.\\i.\\a.n)) (\\v.\\z.\\m.\\t.\\n.(\\q.B) (R i))))))) (\\n.(\\i.(\\u.(\\w.s ((\\y.(\\x.h) (\\v.y)) (\\k.D u (\\j.i)))) (r g f V ((\\b.(\\u.c) (i f)) (\\g.B)))) (m g (X f) k (\\m.x o) ((\\x.(\\y.N) b) g ((\\x.\\k.D k) (\\x.\\v.N e)))) (\\m.\\h.(\\e.(\\e.l) (\\q.(\\n.y) (\\a.a)) (\\b.(\\t.T T (z M)) (w (\\x.Q))) (s ((\\x.\\p.N J) d))) ((\\o.\\z.h) (\\k.m ((\\a.e) (\\a.I))) (\\s.\\w.t (z E (\\d.e)) (s c (i n) (\\p.\\o.k A))))) (\\f.h (\\f.Z (p D (\\y.w))) (M p) V u)) d)",
      "\\l.s (f (s (\\e.\\v.G (r) (\\p.l (a Q F (\\d.\\i.\\a.n)))))) (\\n.s (h) (\\m.\\h.l (\\b.T T (z M)) (s (\\p.N J))) (\\f.h (\\f.Z (p D (\\y.w))) (M p) V u))"
    );
  }

  @Test
  public final void test59() {
    reducesTo(
      "\\y.\\v.\\g.\\r.(\\g.h) (t ((\\v.L) c (\\n.h)) (\\b.(\\y.\\d.e) h)) (P ((\\f.S) C))",
      "\\y.\\v.\\g.\\r.h (P (S))"
    );
  }

  @Test
  public final void test60() {
    reducesTo(
      "(\\u.(\\x.(\\x.W ((\\x.\\j.Y) ((\\p.\\w.f) (\\u.(\\q.\\o.\\x.(\\p.k) (\\q.f) (\\h.X)) (u s (Z I) (b (\\x.r))))))) (n (\\t.\\u.\\u.(\\o.R) (\\c.G) M (\\l.M (K q (g o))) (\\s.(\\j.p) (p L) (\\p.h) (\\q.(\\s.\\d.k) ((\\k.p) (p h)))) ((\\z.M H ((\\o.q) (\\t.z))) (a (\\k.L) (T q (\\p.b))) V)))) (\\q.y)) (P ((\\c.\\u.o (\\r.W)) (\\a.\\s.\\t.e (\\e.\\l.\\s.\\d.(\\h.w) (\\w.\\z.\\w.(\\q.\\x.(\\j.S) (z a)) (\\r.\\r.o))) E)))",
      "W (\\j.Y)"
    );
  }

  @Test
  public final void test61() {
    reducesTo(
      "\\k.(\\x.\\m.\\h.Z) (\\d.(\\l.\\w.\\b.(\\u.o) (\\i.o) (\\u.\\d.(\\u.\\v.Y) ((\\b.D j F) (j N))) X ((\\e.\\r.y d) ((\\c.(\\l.g) (n X) (\\m.\\q.w A)) (w B) l))) (\\y.\\k.(\\u.(\\x.(\\b.A) (\\j.d) p (\\z.(\\m.X) N ((\\u.W) (f q)))) (\\k.(\\e.\\g.(\\s.j) (p j) G) (\\a.\\u.j A)) n) h)) (\\o.T)",
      "\\k.\\h.Z"
    );
  }

  @Test
  public final void test62() {
    reducesTo(
      "(\\d.\\k.L) (G (q ((\\l.o u (\\h.r) (o (\\r.n)) (D d (\\m.F) (\\k.(\\q.D) (\\r.V)))) ((\\i.s) ((\\r.a) b) (\\y.(\\m.Q) W (\\m.\\n.N w))))) (x s ((\\j.W (\\w.s) j ((\\q.\\b.p) (B n (u R)))) I) ((\\i.\\v.z (\\w.x (\\n.r (\\d.Q)) ((\\g.z) (f C) (\\q.\\k.\\h.u)))) ((\\y.r) (I s) (\\z.\\u.Z q) v (\\w.\\s.L))))) (\\r.\\m.\\b.(\\n.(\\l.(\\m.V) (\\r.\\w.M B)) (y (\\o.(\\z.\\m.q) ((\\d.l) ((\\u.\\l.\\d.y) (\\c.\\n.b c))) h))) b)",
      "L"
    );
  }

  @Test
  public final void test63() {
    reducesTo(
      "\\u.(\\c.E) (\\b.y)",
      "\\u.E"
    );
  }

  @Test
  public final void test64() {
    reducesTo(
      "\\i.k",
      "\\i.k"
    );
  }

  @Test
  public final void test65() {
    reducesTo(
      "B (\\l.\\m.\\o.(\\a.v) j)",
      "B (\\l.\\m.\\o.v)"
    );
  }

  @Test
  public final void test66() {
    reducesTo(
      "\\r.b",
      "\\r.b"
    );
  }

  @Test
  public final void test67() {
    reducesTo(
      "\\x.h",
      "\\x.h"
    );
  }

  @Test
  public final void test68() {
    reducesTo(
      "(\\x.\\g.\\c.\\m.\\x.\\m.V) c (\\o.(\\w.a) (\\g.(\\d.H) ((\\h.h (w o l)) (\\p.(\\h.J t n) (p s (\\l.l)))) ((\\v.\\o.q H (x l) (a (\\o.q))) ((\\e.(\\h.i) (p z)) (W (\\x.W))) (a (\\k.\\f.d))) ((\\c.\\q.d) (\\p.d) (\\a.(\\h.a i (\\m.U)) (\\b.\\z.p s)) m (\\b.G (\\a.\\y.y K) (H (C (\\g.k))) (\\n.i n))) (\\y.\\d.(\\m.(\\z.(\\f.\\h.B) ((\\o.(\\y.z N) (\\s.\\n.b)) (\\i.\\u.\\j.\\z.x))) (\\u.\\c.\\s.c)) T)))",
      "\\c.\\m.\\x.\\m.V"
    );
  }

  @Test
  public final void test69() {
    reducesTo(
      "\\d.\\g.(\\n.\\o.v f) (\\j.i (\\u.\\m.e))",
      "\\d.\\g.\\o.v f"
    );
  }

  @Test
  public final void test70() {
    reducesTo(
      "\\r.\\b.(\\f.\\l.c) (\\h.\\m.l l) (\\g.\\r.\\q.\\r.(\\x.(\\p.\\l.T) (\\u.(\\e.e) ((\\l.(\\c.E) (\\a.w) (\\t.(\\a.T) w) (\\n.\\o.r)) (\\n.y (\\w.\\j.\\g.(\\a.c) (\\r.c)))))) (\\t.\\h.(\\e.\\d.\\y.(\\i.\\i.(\\c.i) ((\\p.\\d.\\b.T) (\\g.o Q (\\d.t))) ((\\g.\\u.w) ((\\a.U) (\\d.l)) (k e))) ((\\o.\\a.(\\r.\\g.l) (d z F) q) (\\q.(\\e.\\m.\\z.B) (j R m ((\\d.y) (E a)))))) (\\k.(\\m.\\x.y) (\\r.\\y.G)))) (\\k.\\f.(\\t.\\o.Q) (e (L (k q) (\\y.\\h.j ((\\e.F) (m o))) ((\\f.\\l.a q s (\\c.l)) ((\\z.F) M ((\\d.Y) (f r)))) (\\w.(\\x.r (\\x.Z) t) d (\\e.(\\h.G) r))) (\\h.\\f.(\\u.\\s.\\q.\\n.(\\g.H) ((\\o.(\\v.a) k) (y (\\f.L))) (\\l.(\\t.(\\y.\\s.Z) k) (j j (Q e) (e i (\\m.R)))) (\\o.\\b.\\z.e)) (h u (\\d.\\b.\\h.d (i j) (Q (o m) H) (a M))))))",
      "\\r.\\b.c (\\k.\\f.\\o.Q)"
    );
  }

  @Test
  public final void test71() {
    reducesTo(
      "\\j.\\d.(\\w.(\\h.\\c.\\u.m) z (\\y.(\\j.B (\\y.c)) (\\j.\\z.(\\y.(\\j.\\x.(\\x.M) a (\\a.(\\a.\\e.X) (\\r.\\j.H))) ((\\d.l X e (\\y.e)) (L (\\a.\\k.q W)))) (\\i.(\\c.t) E) ((\\o.Q (\\c.\\s.\\w.L (\\u.n z) (\\b.\\c.n))) (\\f.i))))) z",
      "\\j.\\d.\\u.m"
    );
  }

  @Test
  public final void test72() {
    reducesTo(
      "\\b.P (\\p.\\e.s)",
      "\\b.P (\\p.\\e.s)"
    );
  }

  @Test
  public final void test73() {
    reducesTo(
      "(\\p.(\\s.t ((\\g.(\\o.\\s.\\n.m) (\\y.\\x.k)) (w (\\w.W) (\\v.\\n.\\f.O)) (\\y.\\f.p (\\r.\\q.\\g.\\y.\\n.\\b.T)) ((\\f.(\\x.\\e.\\t.(\\t.j v) (r i (Z K))) a) ((\\e.\\l.n o) y (\\t.\\m.G))))) (a (\\f.\\k.\\o.(\\y.\\e.\\p.\\k.\\c.\\p.\\v.U) ((\\k.k) i) (\\m.\\u.n (\\g.\\e.(\\a.e o) (\\y.\\t.k)))) ((\\w.i) X))) (\\i.H) ((\\n.\\d.\\i.\\w.Q (\\w.g ((\\i.I q (\\h.v)) i))) (\\y.(\\n.p (\\c.d) (\\j.b) ((\\p.\\w.o j) (u m (\\u.a)))) (\\c.v)) ((\\y.m) ((\\c.(\\t.e b (\\r.n)) (v m (C s)) (\\u.d)) (f (\\d.M O (\\z.k) (g (w f)))))) (R (\\v.\\u.x) (g ((\\b.d) o) (\\p.(\\o.R) (\\t.L) (\\v.U))) S ((\\y.i) (\\f.L))) (\\o.\\w.X))",
      "t (m) (Q (\\w.g (I q (\\h.v))))"
    );
  }

  @Test
  public final void test74() {
    reducesTo(
      "(\\g.q (\\t.y (\\b.J P (g U) (\\e.(\\y.j) (q G)) ((\\u.\\h.o) y)) (\\w.s) A)) (T ((\\w.V) U ((\\b.\\x.(\\p.\\n.\\b.(\\g.\\s.h) ((\\z.n p) (\\b.t o))) (\\r.n (\\m.(\\w.v) (C F) (\\s.\\u.w)))) (\\t.\\h.\\p.(\\t.\\u.(\\m.\\l.y f) (\\k.\\l.I Z) (d e I (\\n.\\y.m c))) ((\\l.\\r.\\j.\\e.(\\y.Q) (\\c.a)) (\\d.\\z.a i)))))) q",
      "q (\\t1.y (\\b.J P (T (V (\\x.\\n2.\\b.\\s.h)) U) (\\e.j) (\\h.o)) (\\w.s) A) q"
    );
  }

  @Test
  public final void test75() {
    reducesTo(
      "\\l.\\m.\\i.(\\a.\\l.\\r.(\\o.p) (\\r.(\\z.\\r.(\\v.M) ((\\t.\\a.v ((\\u.w W) (p (\\h.k)))) ((\\h.\\p.(\\i.b Z) (a e (K L))) (h q (\\q.P) ((\\w.n) (t h)))))) C)) (\\q.\\b.(\\x.\\w.\\h.(\\d.i ((\\g.O) ((\\f.\\j.\\z.S) (h X (d L))))) (\\a.(\\f.\\l.(\\t.s) (s w) (H (H q)) (\\v.l ((\\t.C) (i w)))) ((\\r.\\i.g (b f J)) ((\\o.r) (\\m.t))))) o (\\y.K (Z Z) k (\\x.\\b.\\x.H))) (\\j.(\\y.a w ((\\c.v) (L r)) (\\d.o p (\\n.k) (K p (g X))) k) w (\\g.\\j.t) j M)",
      "\\l.\\m.\\i.\\r1.p"
    );
  }

  @Test
  public final void test76() {
    reducesTo(
      "o g (\\s.(\\o.a) (\\l.\\m.u ((\\a.\\k.k) ((\\r.\\x.\\q.\\f.C e (\\h.y)) (\\o.\\t.\\i.(\\n.o) (\\w.m) (\\q.\\b.j)) (\\i.(\\e.u P d ((\\j.D) (\\c.f))) (U p))))) B)",
      "o g (\\s.a B)"
    );
  }

  @Test
  public final void test77() {
    reducesTo(
      "(\\d.z L) (C N) ((\\q.x) (\\r.\\c.\\d.k) (\\g.t)) (\\e.Z)",
      "z L (x (\\g.t)) (\\e.Z)"
    );
  }

  @Test
  public final void test78() {
    reducesTo(
      "(\\u.(\\x.\\v.\\d.(\\g.\\q.\\m.\\l.\\s.T z (\\t.b) T ((\\t.\\b.o) (\\j.\\t.x))) (H ((\\n.H) (\\j.d)) (\\x.\\a.\\a.Z (\\m.\\o.g)))) h (\\c.\\v.\\t.(\\b.j) (\\g.Z O)) (\\d.(\\j.(\\m.m) d ((\\j.w f (\\w.k) ((\\w.p) (\\s.o)) (Y (\\t.\\u.\\b.M))) (n ((\\w.N D (j u)) M)))) (w i)) (\\b.E z ((\\g.P) ((\\l.(\\n.E i) G) z l)))) ((\\l.\\g.y) m)",
      "\\m.\\l.\\s.T z (\\t.b) T (\\b.o)"
    );
  }

  @Test
  public final void test79() {
    reducesTo(
      "\\k.s e ((\\j.A) P (\\y.\\h.(\\v.D) ((\\j.\\b.\\z.(\\o.v) (\\j.O (\\e.X) (\\y.u)) (\\t.(\\x.g) (x T) (\\c.\\p.n))) ((\\h.(\\q.S) ((\\z.N) B)) ((\\y.z) f (\\o.Y))))) v)",
      "\\k.s e (A (\\y.\\h.D) v)"
    );
  }

  @Test
  public final void test80() {
    reducesTo(
      "\\w.(\\w.(\\p.\\f.\\b.(\\y.(\\z.t) D C (\\b.m ((\\y.\\e.\\p.\\i.(\\j.Q) l) ((\\u.n) w)) ((\\m.(\\q.x) (g y)) (C (x M)) (\\j.\\o.g y (\\h.t) (\\m.\\v.R)) c))) p) (\\a.j)) ((\\o.\\w.\\w.d ((\\c.(\\r.Q) (\\v.p) (o n (\\x.t)) a) (\\l.u)) h) (\\e.a (\\a.\\u.\\j.\\e.(\\e.u) (\\x.\\t.\\p.\\t.\\p.b (\\b.(\\r.h) ((\\o.e d) (\\v.\\n.k)))))) (\\q.l))",
      "\\w.\\f.\\b2.t C (\\b3.m (\\e.\\p.\\i.Q) (x (\\j4.\\o.g (\\a.j) (\\h.t) (\\m.\\v.R)) c))"
    );
  }

  @Test
  public final void test81() {
    reducesTo(
      "(\\n.(\\h.(\\m.s) ((\\y.\\x.\\s.R (\\f.\\b.\\h.k L (l z)) J) y)) (q ((\\u.M) o) (\\k.P) g)) e y",
      "s y"
    );
  }

  @Test
  public final void test82() {
    reducesTo(
      "\\a.Q (l g)",
      "\\a.Q (l g)"
    );
  }

  @Test
  public final void test83() {
    reducesTo(
      "\\q.R",
      "\\q.R"
    );
  }

  @Test
  public final void test84() {
    reducesTo(
      "\\m.\\f.\\t.g",
      "\\m.\\f.\\t.g"
    );
  }

  @Test
  public final void test85() {
    reducesTo(
      "(\\b.c) (\\r.(\\f.(\\v.F ((\\k.(\\m.u) P) r)) (a (P (\\n.o) H)) ((\\s.\\u.\\y.\\l.\\m.r) ((\\a.\\d.(\\l.\\w.k) ((\\c.X) (\\s.d))) (\\z.(\\o.\\t.\\b.P) (\\q.M))))) (w S ((\\z.v) S))) (\\t.t) C",
      "c (\\t.t) C"
    );
  }

  @Test
  public final void test86() {
    reducesTo(
      "O (\\h.(\\e.s) ((\\y.(\\i.\\h.O) x ((\\e.(\\q.w M) (f a)) (\\d.H))) g))",
      "O (\\h.s)"
    );
  }

  @Test
  public final void test87() {
    reducesTo(
      "\\x.(\\c.g (\\k.(\\p.b ((\\d.i g (\\r.o)) ((\\f.e) (v L)))) (\\f.\\s.\\r.c (\\u.e) (c J (\\l.x)) r) q t) (\\l.\\a.A (\\q.Z) (r n p))) (c (\\r.\\v.(\\r.\\m.\\d.F) (\\b.P)))",
      "\\x.g (\\k.b (i g (\\r.o)) q t) (\\l.\\a.A (\\q.Z) (r n p))"
    );
  }

  @Test
  public final void test88() {
    reducesTo(
      "\\j.j",
      "\\j.j"
    );
  }

  @Test
  public final void test89() {
    reducesTo(
      "\\x.X (\\a.l g)",
      "\\x.X (\\a.l g)"
    );
  }

  @Test
  public final void test90() {
    reducesTo(
      "P (o (\\r.\\j.l)) s (j j) (q ((\\b.(\\j.(\\l.h) (\\o.X)) u (\\s.\\y.k) (\\z.c (\\c.\\t.(\\p.\\g.k) (\\d.\\i.u)))) c h) (\\j.\\x.(\\u.(\\p.J (p (\\v.a d) ((\\c.I) (o B) (\\i.E r U)) ((\\v.q) (q q) (h f) ((\\o.l) (\\d.e) F)))) (\\i.(\\v.\\i.\\b.t (H d) ((\\o.p) (\\b.L) (\\v.v))) e ((\\k.\\t.(\\c.t) (\\p.D)) j))) (w ((\\p.e) (\\l.n) ((\\c.\\k.\\r.\\s.j Y) (\\a.\\e.(\\v.Y) ((\\f.n) (\\l.d))) ((\\r.r) ((\\i.x) l)))))))",
      "P (o (\\r.\\j.l)) s (j j) (q (h (\\s.\\y.k) (\\z.c (\\c.\\t.\\g.k)) h) (\\j.\\x.J (t (H d) (p (\\v.v)) (q (h f) (l F)))))"
    );
  }

  @Test
  public final void test91() {
    reducesTo(
      "\\c.U (\\q.l (\\w.\\j.(\\f.(\\m.(\\w.\\t.(\\m.\\r.l) (\\d.a)) (\\a.C)) (\\c.\\t.\\t.\\w.\\t.\\h.\\t.(\\n.P) (\\u.e) (K j (\\w.Y)))) (a (\\x.(\\a.\\c.o i) (\\u.(\\g.U) (l V))) (\\o.\\a.h p)) r) ((\\n.(\\r.a) ((\\h.\\d.\\x.(\\g.l) ((\\s.\\y.\\s.\\z.C) ((\\f.S (f u)) (G V (c I))))) ((\\a.p) (\\d.j p (\\t.u)) ((\\j.o) (S P (w s))) (C (\\r.(\\r.o (\\c.M)) (\\t.H i (\\s.U))))))) (\\a.h)))",
      "\\c.U (\\q.l (\\w.\\j.\\r.l) (a))"
    );
  }

  @Test
  public final void test92() {
    reducesTo(
      "\\p.(\\l.\\f.(\\a.(\\c.k) (\\h.\\h.\\m.(\\o.(\\w.H) (o H)) (\\c.\\o.k i) ((\\s.q (\\w.z)) (s (a A))) ((\\k.l) (\\j.l) (\\c.\\u.z b) (\\z.(\\g.\\x.K) (A p n))))) y w) (Z I ((\\z.(\\r.(\\z.\\t.(\\f.I) ((\\p.o (\\d.W)) (\\l.r (j m)))) (\\z.\\o.W (\\x.\\e.e r (Y p) (Z C)))) ((\\g.\\a.(\\q.\\u.q) (\\e.\\n.G)) (\\x.P (\\b.(\\y.o) p)) ((\\f.p (a z)) (g (V Q)) y))) (\\v.\\l.\\h.e (\\h.\\x.c ((\\r.I) (z e))) (\\r.\\d.b) (A J ((\\p.d) (\\a.\\z.q s)) x)))) E",
      "\\p.k w"
    );
  }

  @Test
  public final void test93() {
    reducesTo(
      "\\t.K r ((\\y.f D) k) S",
      "\\t.K r (f D) S"
    );
  }

  @Test
  public final void test94() {
    reducesTo(
      "(\\r.e) ((\\e.\\m.\\w.(\\s.\\v.\\c.\\o.\\b.e) ((\\m.\\n.\\q.P) (o U (l P) (k (u K)) ((\\b.b) (\\l.I) m)) h ((\\n.(\\b.(\\j.\\k.u) (Z z (\\r.d))) x (\\l.\\a.u)) (\\d.p ((\\d.y) ((\\f.\\h.\\k.b) (\\w.\\d.g))))))) (\\j.q (\\i.d (\\m.\\w.\\k.Z) ((\\h.u) (\\t.B) ((\\a.g) (\\l.v))) (z W S) (\\d.r)) (b (i (\\v.D ((\\z.D) (\\j.Q)))) (s (G ((\\a.S v (M N)) (\\w.\\k.p b)))) (\\h.s))))",
      "e"
    );
  }

  @Test
  public final void test95() {
    reducesTo(
      "T ((\\m.\\c.C) ((\\t.(\\k.\\d.(\\t.c y) (J W (M b))) C) (t x u (s c (\\b.o)) (\\f.(\\g.\\k.\\d.x) S))) (Y (\\a.x))) (\\o.\\j.f) (\\m.(\\m.\\i.\\w.q) (\\b.\\p.\\l.G (\\y.\\z.\\j.R)) (W (\\n.\\k.\\i.i z ((\\p.B) (i s)) (\\b.\\e.w) (\\c.p (I x o Q)) (\\t.\\w.\\h.\\d.v r)) p))",
      "T (C) (\\o.\\j.f) (\\m.\\w.q)"
    );
  }

  @Test
  public final void test96() {
    reducesTo(
      "\\l.\\x.(\\v.\\o.\\y.Y) ((\\f.(\\k.R (\\c.h (\\r.\\g.\\s.(\\t.g) P (\\e.\\r.q)) f) h) w) (c (\\p.\\p.(\\j.j) K)))",
      "\\l.\\x.\\o.\\y.Y"
    );
  }

  @Test
  public final void test97() {
    reducesTo(
      "\\t.\\j.M",
      "\\t.\\j.M"
    );
  }

  @Test
  public final void test98() {
    reducesTo(
      "(\\c.g) ((\\n.(\\z.(\\y.(\\i.z r (H a)) m) (\\v.\\f.\\a.X) ((\\c.\\d.\\y.g (t P) a) (\\y.d ((\\r.o) (O q))))) (\\q.H ((\\p.c) (\\m.k) F) (A (\\o.\\q.\\f.(\\c.O g) (\\b.L w)))) (t (i y X) n)) U) ((\\e.s) ((\\z.d) (\\c.a)) r)",
      "g (s r)"
    );
  }

  @Test
  public final void test99() {
    reducesTo(
      "\\k.B (\\d.R (O c m J) i ((\\i.B ((\\u.I w (\\u.\\p.i c) (\\i.\\v.\\l.\\f.J)) (h (T (U p a))))) (\\f.\\e.(\\x.\\q.T) X))) s",
      "\\k.B (\\d.R (O c m J) i (B (I w (\\u.\\p.\\e.\\q.T) (\\i.\\v.\\l.\\f.J)))) s"
    );
  }

  @Test
  public final void test100() {
    reducesTo(
      "(\\m.G) (\\p.B) (\\g.n (\\k.j) (\\l.\\v.l) ((\\d.(\\d.F (\\m.\\f.u)) ((\\t.k (\\w.b)) ((\\t.a) (H c)) (\\x.\\w.(\\x.r) (x q) (\\d.E X)))) (\\v.\\u.\\e.M) j (\\v.\\e.\\r.\\x.\\p.(\\q.\\h.\\v.(\\w.(\\q.k g (m o)) (O (\\b.e)) i (\\u.\\s.(\\j.\\l.p) ((\\s.t b) (t (\\d.c))))) ((\\o.\\z.A (\\l.H)) (\\r.H (\\a.\\p.i)) m)) ((\\n.i) (\\l.\\r.(\\w.i) ((\\o.g v a) (\\w.\\f.i M)) (\\b.\\y.\\f.z (j d (\\d.j p))))))))",
      "G (\\g.n (\\k.j) (\\l.\\v.l) (F (\\m.\\f.u) j (\\v.\\e.\\r.\\x.\\p.\\h.\\v.k g (m o) i (\\u.\\s.\\l.p))))"
    );
  }

  @Test
  public final void test101() {
    reducesTo(
      "\\s.\\q.b",
      "\\s.\\q.b"
    );
  }

  @Test
  public final void test102() {
    reducesTo(
      "\\u.(\\o.\\g.\\f.\\g.L j) r",
      "\\u.\\g.\\f.\\g.L j"
    );
  }

  @Test
  public final void test103() {
    reducesTo(
      "(\\r.\\z.(\\l.(\\i.U l) h) k) (\\m.Q (\\g.l (\\v.\\z.X)) ((\\y.\\l.\\n.\\n.(\\q.\\z.\\r.z (\\z.\\k.\\y.\\f.\\r.\\j.\\z.\\q.x)) (r ((\\l.\\x.f f) (k A a)) (w h))) ((\\s.\\a.\\r.\\r.V) ((\\h.f (O (\\g.v))) (v ((\\u.C) u))) n) (\\j.v)))",
      "\\z.U k"
    );
  }

  @Test
  public final void test104() {
    reducesTo(
      "\\h.\\n.\\j.P (x c)",
      "\\h.\\n.\\j.P (x c)"
    );
  }

  @Test
  public final void test105() {
    reducesTo(
      "\\b.f",
      "\\b.f"
    );
  }

  @Test
  public final void test106() {
    reducesTo(
      "\\q.\\k.F ((\\b.h) (\\l.\\s.(\\x.q) K ((\\r.\\y.(\\w.\\j.r) (T M (\\e.m))) (\\i.\\r.\\e.S (w p (y z))))) n) (\\j.(\\q.\\z.P (\\h.\\z.p)) ((\\q.y) ((\\e.(\\c.\\j.\\b.g) ((\\q.(\\j.j) E) (q c (i J)))) (k o))) (\\d.e)) z",
      "\\q.\\k.F (h n) (\\j.P (\\h.\\z.p)) z"
    );
  }

  @Test
  public final void test107() {
    reducesTo(
      "(\\p.\\e.(\\u.a) ((\\h.\\k.(\\i.\\d.\\h.\\m.r) y) ((\\k.l i (P c)) S (\\h.k) (\\p.t) (\\z.(\\u.\\k.j) ((\\t.\\h.\\c.N) (\\n.\\p.\\u.n)) (\\z.d)) (\\a.(\\k.\\d.\\m.m) (d z (f S) (m q (\\k.S)) M) (\\z.\\h.(\\i.\\y.\\l.Z) ((\\x.s) (\\j.w) (\\j.K d m) (X (\\v.n) (N i (y N))))))))) (x ((\\z.(\\g.C w (c d) (u (H l))) (z U o) t) ((\\j.G) K) ((\\w.\\o.e) ((\\v.d F b (\\c.h) k) (s ((\\g.A) (g w)) i)))) x)",
      "\\e.a"
    );
  }

  @Test
  public final void test108() {
    reducesTo(
      "\\s.Z",
      "\\s.Z"
    );
  }

  @Test
  public final void test109() {
    reducesTo(
      "(\\s.\\x.\\e.(\\y.(\\f.F) m) (\\g.q (\\i.\\l.(\\o.\\o.e) (\\l.i B)) (\\y.\\n.\\g.(\\s.o m) (v z V) (Q (e g) (v e (\\h.z))))) q) ((\\e.s) k) (h ((\\e.\\d.(\\e.\\f.(\\t.\\e.g) ((\\l.B) (r l))) (\\m.w)) (\\h.j (S s (\\v.h)) (\\h.\\z.l Q (W E) (E c (\\f.n)))) (\\k.\\n.u (E (\\c.J f) ((\\r.Q) (x O) (p (s x))))) ((\\f.(\\c.m L w (\\v.f p (w p))) (\\u.a (\\x.\\n.\\a.p))) (\\l.\\g.z) (s ((\\r.\\v.W (C B) (\\q.f o)) (\\s.\\y.Z F ((\\w.w) A))))))) (r ((\\h.(\\f.j) (\\f.y)) (t k (\\y.q)) (\\o.z)) (g (b (\\r.g)) (S (b T (\\c.i) (j O)))) f (d (p (R z (\\o.J)) (k n t (\\w.\\j.\\x.R))) O (\\x.z g D ((\\u.x) (O x)) (\\v.\\b.\\x.\\j.s) (n w (d K) (\\z.\\p.\\u.D) (\\l.C)) R)) C)",
      "F q"
    );
  }

  @Test
  public final void test110() {
    reducesTo(
      "\\m.x",
      "\\m.x"
    );
  }

  @Test
  public final void test111() {
    reducesTo(
      "\\a.\\f.s",
      "\\a.\\f.s"
    );
  }

  @Test
  public final void test112() {
    reducesTo(
      "\\r.\\y.v r",
      "\\r.\\y.v r"
    );
  }

  @Test
  public final void test113() {
    reducesTo(
      "\\s.(\\f.B (\\b.m) (C (O (\\h.p x (\\m.b))) (\\k.\\n.(\\y.\\a.(\\o.\\o.s) (\\l.w z)) y) ((\\q.s) (\\v.b))) (\\q.(\\i.(\\k.U) E k) v) (\\o.u)) y",
      "\\s.B (\\b.m) (C (O (\\h.p x (\\m.b))) (\\k.\\n.\\a.\\o.s) (s)) (\\q.U k) (\\o.u)"
    );
  }

  @Test
  public final void test114() {
    reducesTo(
      "\\u.\\m.C",
      "\\u.\\m.C"
    );
  }

  @Test
  public final void test115() {
    reducesTo(
      "\\w.(\\b.z) (\\v.(\\k.\\p.\\t.(\\m.y) (O (\\w.q ((\\b.z) (\\v.L) (U q (\\h.d)))))) (\\c.x (\\k.\\j.\\e.d)) (\\b.U ((\\f.\\r.Q ((\\e.U) (\\c.m) (\\w.\\c.\\t.v))) ((\\l.l (\\w.k)) (\\x.\\x.\\o.n) y) (\\l.t (n p (W A) (\\v.J)) (c (X a (\\f.z) (y x m)))))) (\\n.\\y.z))",
      "\\w.z"
    );
  }

  @Test
  public final void test116() {
    reducesTo(
      "\\v.c",
      "\\v.c"
    );
  }

  @Test
  public final void test117() {
    reducesTo(
      "\\h.p",
      "\\h.p"
    );
  }

  @Test
  public final void test118() {
    reducesTo(
      "\\l.\\j.m n",
      "\\l.\\j.m n"
    );
  }

  @Test
  public final void test119() {
    reducesTo(
      "(\\l.\\s.w ((\\p.g) Q)) ((\\y.(\\r.K) ((\\a.(\\o.\\t.(\\v.q (\\e.r)) (i (w n (\\a.Y)))) (\\i.L)) o)) (\\h.j) ((\\y.\\h.Z) (\\v.\\n.\\f.(\\w.b) W (\\b.\\z.(\\p.e) ((\\e.D) c)))))",
      "\\s.w (g)"
    );
  }

  @Test
  public final void test120() {
    reducesTo(
      "(\\m.\\g.(\\o.l a) n ((\\d.\\n.\\m.(\\l.d) (\\o.f) ((\\u.S) (j o))) (\\u.(\\q.f) (\\f.n)))) (\\i.\\u.\\y.o (\\n.(\\u.(\\t.\\y.D) (f (\\t.y))) (a (\\x.\\s.j j)))) (\\v.\\v.(\\b.\\q.j j (q x) (h (\\f.x)) (n (q (\\g.S))) a) v) v ((\\v.\\z.\\u.(\\g.\\u.\\i.r) ((\\b.\\f.(\\y.(\\z.n s) H) (\\q.o c (I E) o)) (\\x.\\w.M M v s ((\\i.\\w.\\f.B) f))) ((\\p.\\t.e) (\\c.F) g)) (\\t.(\\z.j) ((\\a.\\y.\\r.S (I D (j z) (\\q.\\c.m)) (\\u.u h)) (\\g.\\y.\\m.\\z.\\l.j ((\\k.\\e.n) (\\z.u)) (w (J (\\j.h) (S c (s t)))))))) (\\g.E ((\\a.\\c.(\\h.\\g.w) ((\\m.\\u.(\\x.k) (\\b.\\u.\\l.\\b.\\n.e) (C q s s (\\e.s))) E)) u))",
      "l a (\\n1.\\m.f) v (\\z2.\\u3.\\i.r) (\\g.E (\\c.\\g.w))"
    );
  }

  @Test
  public final void test121() {
    reducesTo(
      "Z (\\a.\\h.(\\k.\\y.i) (F (l (e a) x S (\\x.s) ((\\p.\\q.(\\b.\\s.t) (\\c.s)) (\\g.(\\b.L (\\r.s)) (\\p.V O (v s))) ((\\n.u) (b P) (\\m.\\g.\\b.G) W)) (g (\\m.\\r.D)))))",
      "Z (\\a.\\h.\\y.i)"
    );
  }

  @Test
  public final void test122() {
    reducesTo(
      "\\p.\\v.u",
      "\\p.\\v.u"
    );
  }

  @Test
  public final void test123() {
    reducesTo(
      "(\\l.(\\n.\\z.(\\d.f) z) (\\l.p O) k) (\\d.g) (\\d.J)",
      "f (\\d.J)"
    );
  }

  @Test
  public final void test124() {
    reducesTo(
      "(\\g.F) ((\\w.(\\c.\\i.(\\t.O) ((\\u.c (h x)) f)) (u A (\\l.F) (\\n.(\\j.J) q) (\\l.(\\o.\\c.X q) (\\v.Y (\\p.U)))) (\\f.q)) x) (\\k.n) (\\b.\\t.W Z)",
      "F (\\k.n) (\\b.\\t.W Z)"
    );
  }

  @Test
  public final void test125() {
    reducesTo(
      "\\h.\\r.\\u.\\p.(\\f.\\o.c (\\c.\\c.\\u.c)) ((\\u.(\\a.\\c.v e) (\\a.(\\d.\\a.\\l.(\\i.\\o.e ((\\p.o) F (\\t.\\w.k))) ((\\f.s (J M) m) (K y r H))) ((\\f.\\u.\\s.B (\\o.j z)) ((\\b.V z (f z)) (\\g.(\\j.v) F)) (p (\\i.\\h.a))))) (\\t.i)) w",
      "\\h.\\r.\\u.\\p.c (\\c.\\c.\\u.c)"
    );
  }

  @Test
  public final void test126() {
    reducesTo(
      "(\\o.\\g.(\\x.(\\v.\\u.K) j ((\\a.C (\\f.W (o y (\\o.D)))) (\\q.\\x.B))) (\\a.\\m.t ((\\h.(\\w.\\r.o v) V) (\\j.D (o w) (\\k.\\b.\\x.W)) ((\\n.G) J (\\r.\\w.\\x.\\l.r)))) ((\\j.\\k.I m) (O (\\v.e (C I (\\b.y)) (\\m.\\d.\\n.\\e.\\z.z (A L))) j))) (\\z.\\r.\\k.w) (\\g.(\\v.(\\m.v v ((\\c.p) (\\w.y d))) T f) (e (\\k.\\o.y) (\\i.s (b (\\u.z Z)))))",
      "K (\\k.I m)"
    );
  }

  @Test
  public final void test127() {
    reducesTo(
      "\\l.c (c (\\b.(\\x.\\l.W) (D B (\\v.k)) (D (\\k.z R D))) ((\\z.J) K (\\u.\\u.h) (\\a.\\j.\\s.\\k.\\g.\\t.y s) ((\\h.\\n.J) ((\\n.(\\p.I) J) z))) (\\x.\\n.(\\d.\\d.\\i.\\a.G) ((\\s.\\x.(\\t.\\j.g) (q d (\\w.m))) ((\\e.\\u.W o) (\\y.\\r.R w)) d))) I ((\\z.\\o.\\a.n) (\\f.\\g.\\o.\\q.(\\h.C H) (\\v.(\\m.u) (\\b.\\n.\\a.\\h.a (d (\\r.r)) (s r)) (\\g.s (w (c (\\z.\\v.e P)))) ((\\b.(\\z.\\v.G) (d k (\\c.O))) (\\z.\\n.\\t.b) (\\p.s (P B (i Y) (z w v))) B))))",
      "\\l.c (c (\\b.W) (J (\\u.\\u.h) (\\a.\\j.\\s.\\k.\\g.\\t.y s) (\\n.J)) (\\x.\\n.\\d.\\i.\\a.G)) I (\\o.\\a.n)"
    );
  }

  @Test
  public final void test128() {
    reducesTo(
      "\\i.(\\r.B (\\g.\\d.k)) (S (k f)) (\\c.O)",
      "\\i.B (\\g.\\d.k) (\\c.O)"
    );
  }

  @Test
  public final void test129() {
    reducesTo(
      "(\\d.(\\f.\\k.A) ((\\a.\\f.t) (\\e.d))) ((\\m.W) z)",
      "\\k.A"
    );
  }

  @Test
  public final void test130() {
    reducesTo(
      "\\s.t",
      "\\s.t"
    );
  }

  @Test
  public final void test131() {
    reducesTo(
      "y (\\l.t (f (l (\\r.w))) (\\a.(\\x.(\\n.o (v s)) (\\g.(\\c.O) (\\z.S))) z) (\\z.R y) ((\\f.\\k.\\w.\\q.\\v.u z) ((\\q.\\u.\\o.m Z) (\\o.\\z.(\\g.\\w.\\n.\\n.\\b.q h) (n (\\h.\\x.\\c.K)))))) (\\n.F ((\\b.(\\p.f Q) (\\g.a z (\\j.k)) n ((\\u.s (a (\\a.f))) (a I (\\k.s) a)) (d (d (k d (\\j.F) (b s (\\y.w)))))) (\\a.N))) (\\y.f)",
      "y (\\l.t (f (l (\\r.w))) (\\a.o (v s)) (\\z.R y) (\\k.\\w.\\q.\\v.u z)) (\\n.F (f Q n (s (a (\\a.f))) (d (d (k d (\\j.F) (N (\\y.w))))))) (\\y.f)"
    );
  }

  @Test
  public final void test132() {
    reducesTo(
      "(\\z.\\c.u) Z (\\e.(\\k.u (C ((\\w.\\l.\\m.\\a.(\\y.o) (\\y.a)) A))) (\\e.b) ((\\u.\\y.\\x.(\\r.\\m.g) (\\t.S ((\\n.b) (\\w.R) ((\\f.o) (\\b.F))) (\\x.W))) b)) ((\\n.\\q.\\a.C) b)",
      "u (\\q.\\a.C)"
    );
  }

  @Test
  public final void test133() {
    reducesTo(
      "R (\\z.\\v.(\\i.d) (\\y.p (\\r.M)) c W ((\\x.(\\p.n) (\\t.Q (v n))) r (\\q.w)) x (\\y.i) (\\l.r z (\\s.B) (\\a.x) ((\\r.p q (h v)) (L R (i B))) (\\h.(\\n.\\e.p x) (\\i.l) (\\l.\\l.D)) (\\p.\\i.N) (\\x.\\n.\\f.(\\k.M) ((\\d.(\\c.(\\d.U) (b g) p) (\\s.\\d.(\\l.u) (\\j.C) (\\c.g P))) (C ((\\w.P) G)))) ((\\n.s) (\\x.c))))",
      "R (\\z.\\v.d c W (n (\\q.w)) x (\\y.i) (\\l.r z (\\s.B) (\\a.x) (p q (h v)) (\\h.p x) (\\p.\\i.N) (\\x.\\n.\\f.M) (s)))"
    );
  }

  @Test
  public final void test134() {
    reducesTo(
      "(\\i.(\\t.\\r.\\y.\\d.(\\g.r) (I f) (u p) (\\d.d)) ((\\h.W) b)) f",
      "\\r.\\y.\\d.r (u p) (\\d.d)"
    );
  }

  @Test
  public final void test135() {
    reducesTo(
      "I (B (\\s.w ((\\r.c) (J i)) (\\z.(\\g.\\e.e (\\v.(\\u.p v (c s) (\\v.d E)) g)) (t ((\\y.c) c ((\\t.i) (y R))) (\\y.u)))) (\\c.F))",
      "I (B (\\s.w (c) (\\z.\\e.e (\\v.p v (c s) (\\v.d E)))) (\\c.F))"
    );
  }

  @Test
  public final void test136() {
    reducesTo(
      "\\y.(\\p.(\\y.\\x.N) j) ((\\m.b (\\j.\\h.G)) n ((\\n.(\\b.W (w i)) (\\o.(\\y.e) (E l))) d)) (\\y.(\\y.\\z.(\\l.\\c.\\f.(\\k.\\j.\\d.(\\o.O) (\\w.c)) (\\j.\\p.(\\o.d) (\\c.e))) (\\a.a)) s) (\\t.(\\o.(\\o.q) (\\n.b) (\\b.v W (m s)) (\\j.\\n.\\b.\\q.(\\b.Y) (\\c.b)) (P (\\v.\\y.\\c.O v (\\k.D) ((\\b.q) (\\u.x)))) (\\l.P)) (\\l.H m ((\\m.(\\g.H) ((\\n.g) (\\e.a))) (X (E v) (m (G a)))) ((\\s.\\s.i u) (\\u.y)))) ((\\a.F) W) (o (\\a.O) (\\z.l))",
      "\\y.N (\\t.q (\\b.v W (m s)) (\\j.\\n.\\b.\\q.Y) (P (\\v.\\y.\\c.O v (\\k.D) (q))) (\\l.P)) (F) (o (\\a.O) (\\z.l))"
    );
  }

  @Test
  public final void test137() {
    reducesTo(
      "\\i.d",
      "\\i.d"
    );
  }

  @Test
  public final void test138() {
    reducesTo(
      "\\l.\\l.\\x.z (\\f.w) (\\i.f) ((\\k.(\\o.\\x.\\f.P) (\\z.\\l.k K (\\y.H) (I u (l t)) (\\v.\\j.f V Y ((\\h.K) (\\v.q))))) s ((\\y.\\o.\\h.\\p.(\\t.\\e.\\o.(\\b.S) (\\z.g)) ((\\v.g (c a)) (u Q h) u)) (\\m.(\\t.v c d (\\v.O) ((\\m.\\l.w k) (\\g.Z (P X)))) (s ((\\u.(\\u.S) (y l)) (t (M n)))))) (\\l.Z J ((\\q.E) (\\k.n)))) p",
      "\\l.\\l.\\x.z (\\f.w) (\\i.f) (P) p"
    );
  }

  @Test
  public final void test139() {
    reducesTo(
      "(\\o.\\g.\\u.I) (\\c.I)",
      "\\g.\\u.I"
    );
  }

  @Test
  public final void test140() {
    reducesTo(
      "\\e.(\\a.(\\s.(\\q.(\\u.\\c.\\y.\\z.N (\\c.f) (\\v.j y) (N q (\\k.h) (\\n.\\a.a))) e) (\\l.(\\n.\\y.\\q.(\\d.d y) (\\r.d G)) (\\j.\\t.i u (L v) P) ((\\p.(\\t.O) ((\\v.S) (Y z))) (\\z.\\u.U))) (\\h.(\\n.l) (\\v.\\j.n) (\\t.\\m.\\r.\\w.(\\e.Z (\\q.w P)) (\\g.A s h (\\r.\\n.m)) (\\j.\\j.(\\i.d) (\\k.H V) (b (\\g.y d)))))) (V r (\\s.l) (\\l.C) ((\\l.\\a.\\c.(\\w.S) ((\\j.V m f) C) (\\v.(\\g.(\\w.\\k.u) B) (x (\\n.I)))) ((\\u.B z (\\w.x) (\\b.\\y.t l)) a ((\\g.V) ((\\b.z) (\\v.d v (\\h.A))))))) z) l",
      "\\e.\\z5.N (\\c.f) (\\v.j z) (N (\\l.\\q.d G) (\\k.h) (\\n.\\a.a))"
    );
  }

  @Test
  public final void test141() {
    reducesTo(
      "(\\c.(\\w.E (\\c.t)) T ((\\k.z) (\\t.(\\t.\\w.z A (\\r.z) V (g v (\\t.r) (\\m.\\b.b))) (g (g (H E)) ((\\n.i) (\\e.w) (\\h.d))))) (\\p.\\v.(\\m.s ((\\j.(\\r.U) (\\y.r)) n) (\\r.j X ((\\d.\\f.\\b.k) (\\h.\\l.M M)))) R ((\\y.y) (\\d.\\o.q (\\f.(\\v.\\x.o I) y ((\\p.q) (\\i.(\\a.t) (\\q.Y)))))))) ((\\r.\\b.k (\\k.n)) (\\n.p ((\\r.\\c.\\a.h) u m) ((\\n.k) (\\k.w))) ((\\t.a R) (\\n.f))) (\\i.\\o.\\w.\\r.\\w.\\l.p (\\l.R))",
      "E (\\c.t) (z) (\\p.\\v.s (U) (\\r.j X (\\f.\\b.k)) (\\d.\\o.q (\\f.o I))) (\\i.\\o.\\w.\\r.\\w.\\l.p (\\l.R))"
    );
  }

  @Test
  public final void test142() {
    reducesTo(
      "(\\s.W p (\\i.R) ((\\d.\\h.(\\b.\\n.c (G (I k)) (\\y.(\\g.r) (\\z.u) (\\r.\\f.S n)) (\\k.(\\o.b c r (\\o.v)) (\\a.Z (\\s.\\n.x)))) (\\k.(\\c.(\\d.(\\m.i) (y V)) (\\c.f)) (r (n (\\t.y))) (\\u.\\i.\\w.(\\n.o) V (\\r.\\e.l) ((\\j.r) (\\c.j) (\\t.N d))))) (\\w.\\t.m (\\d.\\q.(\\z.(\\q.(\\e.w) (\\z.g)) f) C b)) (\\g.Z (\\r.\\m.\\c.o r (i G) r ((\\y.\\p.p z) h) i) e))) (Z (\\v.(\\q.(\\f.\\n.n) (\\c.(\\i.(\\l.\\d.R r) j) t)) ((\\w.\\e.i) A W) (e ((\\k.e) p (\\l.(\\i.K) (r e)) ((\\r.\\e.\\u.E) (\\t.\\f.r f))) (\\p.\\h.W t))) A)",
      "W p (\\i.R) (\\n1.c (G (I k)) (\\y.r (\\r.\\f.S n1)) (\\k.i (\\u.\\i.\\w.o (\\r.\\e.l) (r (\\t.N (\\w.\\t.m (\\d.\\q.w b))))) r (\\o.v)))"
    );
  }

  @Test
  public final void test143() {
    reducesTo(
      "\\i.(\\t.(\\d.j (e ((\\n.f) (\\y.s)) (\\i.C (\\z.h))) (\\e.\\h.(\\r.\\w.\\r.G o (\\d.L) (m j (Q d)) w) (\\i.\\y.(\\e.t) (\\i.k (\\s.n q)))) e (\\j.T ((\\q.l) ((\\c.\\x.\\g.q) (H e (k U)))) (\\b.H u h) (\\n.(\\n.\\d.\\a.(\\l.o) (\\t.A s (b Z m)) S) (\\q.\\m.\\q.(\\f.(\\w.d) ((\\k.t) w)) (\\p.L) (e (H (x X)) (j E (e o) (\\r.p))))))) c) (q (\\u.\\i.g ((\\h.M V) ((\\s.x) (\\z.\\m.\\t.h) (\\a.(\\q.l t (\\r.O)) (\\o.I)) ((\\j.(\\e.h) (Y v) (\\g.\\a.u c)) (e (\\v.\\t.B t))))) (\\r.\\j.L)))",
      "\\i.j (e (f) (\\i.C (\\z.h))) (\\e1.\\h2.\\w.\\r.G o (\\d.L) (m j (Q c)) w) e (\\j.T (l) (\\b.H u h) (\\n.\\d.\\a.o S))"
    );
  }

  @Test
  public final void test144() {
    reducesTo(
      "\\x.b",
      "\\x.b"
    );
  }

  @Test
  public final void test145() {
    reducesTo(
      "N (\\a.(\\l.(\\a.\\w.C) F) (\\a.\\d.L)) (\\h.(\\a.(\\z.\\m.\\x.V) (\\d.H)) (\\n.\\o.(\\k.E (\\w.\\g.\\o.E)) M))",
      "N (\\a.\\w.C) (\\h.\\m.\\x.V)"
    );
  }

  @Test
  public final void test146() {
    reducesTo(
      "\\t.\\m.(\\n.(\\m.\\j.\\z.(\\g.t ((\\a.\\t.j D) (\\x.\\s.q q))) ((\\a.\\h.G u) (\\i.\\o.t) ((\\z.C (\\r.t)) (\\p.M))) (\\n.Q) u ((\\b.(\\s.t (Z V (b h)) y ((\\e.h M (\\s.h) ((\\y.f) (M S))) (\\a.o))) (n (\\w.\\t.g (w (b u)) (\\p.(\\n.k P) (\\h.V))))) (\\k.\\h.o))) c) (\\j.(\\o.(\\k.F (\\l.(\\h.D v (c Y)) (j (f p)) V) (n z ((\\e.\\k.v W) (\\r.\\r.\\y.p) (v f p (\\d.z d (\\z.V)))))) (\\h.(\\q.\\b.(\\a.e e t ((\\a.v) (\\i.w))) Z) y t) (N (\\e.F ((\\t.(\\r.\\f.l e) (\\h.g)) (\\i.s)) T))) (\\x.\\h.d))",
      "\\t.\\m.\\j.\\z1.t (\\t.j D) (\\n.Q) u (t (Z V (\\h.o)) y (h M (\\s.h) (f)))"
    );
  }

  @Test
  public final void test147() {
    reducesTo(
      "\\q.(\\b.\\d.\\u.c) (\\d.\\s.(\\u.f ((\\m.J) (\\r.(\\q.u) (b D)))) y (\\o.\\p.(\\o.(\\d.c) (\\u.y)) (\\p.n U (a s)) ((\\m.q) (X I) (Y (\\y.z))) (\\d.T (\\a.\\t.(\\f.c B) (n (\\w.n)))))) ((\\k.w) o) (\\f.\\q.j (\\b.e)) a",
      "\\q.c a"
    );
  }

  @Test
  public final void test148() {
    reducesTo(
      "\\u.(\\d.e) (\\o.\\b.R)",
      "\\u.e"
    );
  }

  @Test
  public final void test149() {
    reducesTo(
      "\\n.(\\o.(\\l.(\\u.\\x.\\a.s) ((\\q.(\\o.b ((\\k.d) (K E))) (\\s.\\s.\\p.(\\y.q d) (\\w.h u))) ((\\m.o) (\\p.\\k.\\a.P) o) Y (\\b.x ((\\g.f) (s X r g)) x))) h) ((\\t.(\\d.\\h.\\g.X) (\\u.\\f.\\o.\\a.(\\z.\\m.L) (\\m.(\\p.f) (\\f.u) (\\q.D)) ((\\d.I) ((\\z.Y (\\d.\\o.\\a.t)) (\\g.h (E e (\\w.D))))))) E ((\\l.\\z.Z) (\\y.(\\p.\\i.\\m.(\\f.x) ((\\k.d) c (\\p.x q L))) ((\\h.\\e.t F) (l o) (\\n.(\\s.u z) (\\m.\\n.h))) (\\k.R (\\l.\\o.(\\s.\\a.(\\e.H c) (\\q.N f)) ((\\g.b (\\p.d)) (m (t r))))) (\\y.\\a.\\v.\\r.t ((\\t.\\e.(\\b.(\\s.q x) (\\j.\\k.Q)) (\\e.o)) ((\\o.a) (\\i.S) (\\v.\\w.y i) (\\j.\\u.o G (w u) (\\h.L))))))))",
      "\\n.\\x.\\a.s"
    );
  }

  @Test
  public final void test150() {
    reducesTo(
      "\\h.\\w.\\u.(\\y.x i (\\y.\\m.\\s.p) ((\\o.B (\\q.R j b ((\\i.\\p.e (\\r.i) j) (r (p b) (a E))) (l (\\l.(\\r.(\\m.\\z.\\o.s) (x m (S k))) i)))) (\\n.\\m.(\\t.W) V))) (\\w.o)",
      "\\h.\\w.\\u.x i (\\y.\\m.\\s.p) (B (\\q.R j b (\\p1.e (\\r2.r (p b) (a E)) j) (l (\\l.\\z.\\o.s))))"
    );
  }

  @Test
  public final void test151() {
    reducesTo(
      "\\b.(\\v.\\k.m) j",
      "\\b.\\k.m"
    );
  }

  @Test
  public final void test152() {
    reducesTo(
      "\\v.(\\j.R) d",
      "\\v.R"
    );
  }

  @Test
  public final void test153() {
    reducesTo(
      "\\l.(\\x.\\w.f) ((\\l.s) (\\x.A) d (\\u.\\t.\\x.\\e.\\e.V))",
      "\\l.\\w.f"
    );
  }

  @Test
  public final void test154() {
    reducesTo(
      "d (\\o.(\\l.(\\f.(\\h.(\\i.f) b) (s s)) x ((\\e.v (R S (\\c.S))) q) (n (\\s.\\w.\\j.(\\d.\\e.v y) (\\l.y) M))) g) (m (\\u.E) ((\\l.\\c.\\x.(\\c.n (\\r.g)) S) (\\a.I ((\\i.g (O (\\h.(\\q.B) (h Y)))) (v v a (\\v.k (\\k.f))))))) (\\f.(\\s.(\\v.W ((\\y.\\e.\\r.s) y (\\d.(\\a.e) s) ((\\w.h) D ((\\u.\\e.U) e)))) w) ((\\c.\\i.(\\d.\\s.(\\w.b) (\\z.(\\a.\\w.Q) (q u (B k))) (\\t.(\\f.f p p) n (\\l.(\\e.\\t.m) ((\\z.k) A)))) (E Q k r (\\s.\\u.\\y.m) j)) ((\\p.(\\b.(\\p.(\\s.G) (\\o.M) (\\q.(\\x.a) (\\l.a))) (\\z.W)) (\\j.b)) (\\z.\\n.\\x.\\u.M)) (\\d.\\u.a (\\e.\\x.g (m h (y u) (\\z.t A (r i)) (\\d.D N (\\t.R) (B f W))) (\\y.(\\r.z) (\\e.e (a t (\\u.Q)) N))))))",
      "d (\\o.x (v (R S (\\c.S))) (n (\\s.\\w.\\j.v y))) (m (\\u.E) (\\c.\\x.n (\\r.g))) (\\f.W (\\s.b (\\t.n p p (\\l.\\t.m))))"
    );
  }

  @Test
  public final void test155() {
    reducesTo(
      "(\\j.a) (\\i.(\\g.(\\w.(\\b.(\\v.W) ((\\d.e Y (\\v.E)) (\\h.A (\\x.a)))) (\\i.G (k (x f (\\k.N))))) (a G N (\\q.(\\o.u) (\\l.r)) ((\\g.e) (\\e.j)) (\\z.E))) ((\\n.W) (\\y.\\q.u ((\\p.G) J)) ((\\u.\\s.\\u.o u (b T) (U (x T))) v (C (\\o.\\f.\\c.r (\\r.w c))))) (\\n.\\j.(\\c.(\\y.\\l.u (E (\\y.\\i.\\j.\\i.f (\\y.o)))) p) (\\d.(\\d.v) (\\w.\\a.\\f.\\y.(\\t.\\k.B (\\l.q) (\\h.C v)) ((\\r.y f) (\\q.T)) (\\y.\\j.h)))) (\\o.(\\e.m (\\s.\\s.s) ((\\y.o j q) y) (\\d.(\\w.u) (A B) (\\o.r) (\\q.m))) (\\i.\\g.(\\y.\\e.\\w.\\c.v ((\\b.H) (\\x.p))) u) H (\\i.h ((\\w.\\m.e) (J h I ((\\i.n) (t v))) (\\o.\\c.\\f.g (K d (J E) (c (\\i.o)))) (F (\\p.(\\c.(\\z.y) (\\t.n)) (\\w.(\\x.j) (Q g))) (g (k (r (\\v.a)))))))))",
      "a"
    );
  }

  @Test
  public final void test156() {
    reducesTo(
      "\\j.(\\r.\\n.(\\e.(\\d.p (\\t.s ((\\w.a) u) (\\b.(\\m.i) s (\\q.F)))) (\\i.(\\l.(\\f.o) (f y) (m M (\\k.n))) i (\\i.\\k.(\\c.\\p.\\m.(\\b.y) (\\z.S)) (\\l.i s)) (\\l.\\i.\\s.(\\p.(\\p.P) (\\n.M) (T r (x t)) (l (\\y.k) (\\y.\\e.a i))) (\\q.k (b (\\d.Z (\\j.g))))))) (\\g.\\t.(\\g.\\p.n (\\f.f (H T) (h (e I)) (h O (v z) h)) (A (\\g.k Z) e)) ((\\g.(\\y.(\\h.B) (h P) y ((\\p.r (J w)) (\\v.\\u.Z V))) (l (\\k.Z (\\c.B)) (\\f.A u))) ((\\h.j E) r A (\\w.(\\k.\\a.\\w.t) (\\f.\\p.a) ((\\w.Q d (\\b.p)) C)))))) (s (n e (W v d)) ((\\y.a m (S p)) (J (q F)) (\\t.u)) m (\\g.t L (b V) (j j (a Q)) (\\c.x) (\\h.U) (\\e.\\y.S (\\c.(\\z.k) (\\z.V)) (x (\\o.q) ((\\v.V) x)) (O (\\w.l)))) ((\\z.\\g.s) T ((\\a.\\v.(\\r.\\z.\\r.d) (\\m.(\\w.Z) k) (\\j.(\\n.\\g.r) (\\k.\\t.U))) (\\c.\\y.l)) O)) (\\p.(\\g.(\\u.(\\u.v) (\\m.\\p.\\d.u) (\\d.(\\h.k) (q e) (\\d.t p (P T))) ((\\j.(\\h.n) ((\\u.f) m)) (x (\\k.(\\p.p) (\\h.P)))) (\\o.\\d.f)) (\\j.\\e.d ((\\w.(\\i.F) n (\\m.g l (\\j.v))) (j (\\v.\\e.w A))) ((\\k.(\\j.y) (H (\\v.m))) l (\\c.(\\y.L s) (\\v.(\\w.o (\\l.s)) (z H))))) ((\\z.\\r.u ((\\p.m (\\l.(\\l.T) w)) (\\o.X) ((\\e.\\x.D) (Q b (\\o.C)) s))) (r (Q f (E n)) M (\\v.A (\\i.\\a.\\j.I) ((\\z.\\e.S j) (\\e.m))) ((\\m.O) (\\y.(\\b.\\b.\\x.f) (\\o.(\\i.\\b.p G) (g i (I s)))))))) (k (\\b.c)))",
      "\\j.p (\\t.s (a) (\\b.i (\\q.F)))"
    );
  }

  @Test
  public final void test157() {
    reducesTo(
      "\\g.m",
      "\\g.m"
    );
  }

  @Test
  public final void test158() {
    reducesTo(
      "(\\u.J) w",
      "J"
    );
  }

  @Test
  public final void test159() {
    reducesTo(
      "(\\p.(\\e.\\o.(\\y.V) (\\f.Y)) (\\f.n)) (\\i.\\m.(\\i.D (\\p.(\\e.\\l.\\y.(\\q.(\\l.\\w.T) (\\d.\\c.E)) (\\q.\\r.g)) s)) (\\s.\\a.(\\z.\\g.z) K) (\\h.z) (\\d.\\o.g))",
      "\\o.V"
    );
  }

  @Test
  public final void test160() {
    reducesTo(
      "\\f.(\\x.\\x.\\f.\\c.n) t",
      "\\f.\\x.\\f.\\c.n"
    );
  }

  @Test
  public final void test161() {
    reducesTo(
      "\\i.\\y.m (\\s.O)",
      "\\i.\\y.m (\\s.O)"
    );
  }

  @Test
  public final void test162() {
    reducesTo(
      "\\u.(\\m.U ((\\w.m) g)) (\\o.u (\\s.(\\o.\\t.j) (\\e.\\f.l) (\\e.c)))",
      "\\u.U (\\o.u (\\s.j))"
    );
  }

  @Test
  public final void test163() {
    reducesTo(
      "d (\\r.V ((\\t.t) ((\\j.\\d.X f C) Q)) (a (\\u.(\\d.\\g.\\w.I) (a (\\b.o j d d) Z) (b (\\v.\\c.\\t.p) (\\h.\\v.W (k Q C)) (\\d.\\f.\\n.V) N))))",
      "d (\\r.V (\\d.X f C) (a (\\u.\\w.I)))"
    );
  }

  @Test
  public final void test164() {
    reducesTo(
      "(\\w.(\\t.\\p.\\q.(\\v.\\j.(\\i.p) c (\\r.v f z)) p) (W f) k) ((\\n.e (F ((\\b.y l (s i) (z f (\\z.P))) (\\v.(\\w.o s (\\p.c)) (g m (\\q.Z)))))) (\\p.\\c.(\\e.s) ((\\y.(\\k.(\\p.N) (T b)) (o i (\\q.H)) S) e)) n) (\\l.g)",
      "\\j.k (\\r.k f z)"
    );
  }

  @Test
  public final void test165() {
    reducesTo(
      "T (e (\\l.K))",
      "T (e (\\l.K))"
    );
  }

  @Test
  public final void test166() {
    reducesTo(
      "\\j.e",
      "\\j.e"
    );
  }

  @Test
  public final void test167() {
    reducesTo(
      "\\y.q",
      "\\y.q"
    );
  }

  @Test
  public final void test168() {
    reducesTo(
      "\\x.(\\e.\\a.r) (e ((\\q.i) ((\\o.p) (\\k.h)) (\\q.(\\a.x) (\\d.m) e) (\\z.b) (\\e.f (\\z.(\\c.(\\x.p) (\\d.C) (\\v.\\g.t p)) C))) (t V) ((\\r.\\a.(\\m.\\s.g) (\\l.(\\r.\\p.(\\n.\\d.p (\\g.S) (Q x R)) (\\j.\\u.(\\c.d C) (\\j.\\q.n))) ((\\v.(\\o.w) (\\y.c) (\\a.G (F c))) (v (\\a.\\y.\\k.l))))) ((\\g.\\g.M) ((\\x.n (h y) (\\z.\\c.S)) (\\z.\\p.\\j.\\s.\\o.A))) h))",
      "\\x.\\a.r"
    );
  }

  @Test
  public final void test169() {
    reducesTo(
      "(\\u.\\k.(\\u.N y) ((\\b.Q) (\\d.F) (\\v.(\\j.\\a.(\\c.\\z.N x (\\h.b) ((\\h.z) (\\x.s))) (\\k.T)) (\\n.(\\w.S (\\d.p V)) (m (\\i.\\a.\\o.N)))))) (\\v.\\j.(\\g.c) ((\\j.v) i)) ((\\c.n) (u ((\\l.\\y.\\d.V f G ((\\n.\\u.(\\s.a) (g R) (f m J)) (B V (\\d.T) (\\k.h b)))) (\\r.\\v.s)))) (V ((\\p.o) ((\\v.\\s.(\\q.\\o.J e) (X P (w l)) f) ((\\y.\\e.(\\a.Z n) ((\\h.K) j)) i)) C ((\\i.\\o.f) x)))",
      "N y (V (o C (\\o.f)))"
    );
  }

  @Test
  public final void test170() {
    reducesTo(
      "\\q.U j",
      "\\q.U j"
    );
  }

  @Test
  public final void test171() {
    reducesTo(
      "(\\m.w) (\\v.i)",
      "w"
    );
  }

  @Test
  public final void test172() {
    reducesTo(
      "(\\j.\\u.\\t.(\\m.j) (\\g.(\\o.\\a.v (l (\\m.\\f.d o)) (\\c.\\c.\\x.t)) (\\g.(\\h.(\\v.\\j.w u) a (\\m.O (\\b.C) x)) (\\e.q ((\\l.z t (\\p.S)) s)))) (\\s.\\p.I ((\\r.v) (\\h.\\r.Q (\\p.X) (\\n.B z)) (\\t.\\x.h) (\\z.N)))) x (\\k.\\z.M (\\j.\\t.m H) (\\d.(\\e.\\r.\\g.(\\o.M ((\\t.t) (\\e.U) a F) (V (\\i.\\o.\\b.(\\s.k) (\\g.\\k.\\n.\\x.\\i.x)))) (\\n.I F (\\k.s) (d W (\\k.g)) (O n (\\p.x) (\\g.i s)) E (\\d.\\n.X))) (\\n.n)))",
      "\\t.x (\\s.\\p.I (v (\\t.\\x.h) (\\z.N)))"
    );
  }

  @Test
  public final void test173() {
    reducesTo(
      "(\\y.n) ((\\t.\\z.\\t.(\\q.(\\c.u) ((\\b.p ((\\y.g) (\\z.\\l.a))) (\\m.(\\d.(\\w.P) A) (p (\\u.m)) B)) n) (v ((\\w.\\m.\\w.j) w i))) ((\\k.(\\t.\\g.i) (R n (\\d.y)) (\\k.a) (L C O X (\\x.t))) ((\\a.i) (\\u.\\v.\\l.F (\\r.n)) ((\\b.(\\y.M) (d f) (\\c.\\l.O g)) (\\x.\\n.\\r.\\v.\\e.\\a.c))) x ((\\x.L) (\\z.(\\y.\\f.\\r.z) (\\b.m (\\v.C) (i h (\\t.U))) ((\\h.C) ((\\i.o) (w Q (h V)))) (\\l.a l)))))",
      "n"
    );
  }

  @Test
  public final void test174() {
    reducesTo(
      "k (\\k.H)",
      "k (\\k.H)"
    );
  }

  @Test
  public final void test175() {
    reducesTo(
      "\\a.U",
      "\\a.U"
    );
  }

  @Test
  public final void test176() {
    reducesTo(
      "\\z.Z (\\b.U)",
      "\\z.Z (\\b.U)"
    );
  }

  @Test
  public final void test177() {
    reducesTo(
      "\\x.V z",
      "\\x.V z"
    );
  }

  @Test
  public final void test178() {
    reducesTo(
      "\\m.(\\k.\\e.(\\l.\\a.\\s.(\\f.x b) (\\n.r) s) (\\a.\\z.(\\t.\\z.j) (Z o ((\\n.(\\h.U f d) a (H ((\\t.e) (V D) c))) y)))) (\\y.b)",
      "\\m.\\e.\\a.\\s.x b s"
    );
  }

  @Test
  public final void test179() {
    reducesTo(
      "(\\o.\\i.g) (\\m.(\\k.(\\y.\\n.c ((\\w.s) o) ((\\d.\\j.(\\z.f) (v n) (\\h.r q)) (p (\\d.\\p.F w)) (\\d.(\\z.\\g.\\b.q) (G z E) (\\i.f)))) (\\i.(\\d.V) ((\\l.(\\j.\\d.d (\\a.I M)) k) (q ((\\i.R) v) ((\\p.p) T (\\f.\\g.g w)))))) (l ((\\e.K) (\\z.(\\i.(\\u.f) (M Y)) s) t ((\\k.S (\\q.u (\\g.j) ((\\x.H) (\\n.g)))) R)))) (\\r.B (\\t.\\w.\\y.(\\j.(\\e.\\l.(\\w.k) (T y) f) ((\\a.W) (\\m.W) (a b (h C))) (z (\\x.\\q.\\u.(\\x.w) ((\\c.P) (p w)))) (\\p.G (t (\\w.(\\b.C) (\\f.A))) (s (h (v C (\\q.E))))) (\\l.(\\t.u (\\t.\\s.\\d.\\f.L j) (q (J x) (\\n.u) (\\a.Y (T (B y))))) ((\\m.H) (\\o.\\y.e x (N A) W) (N v (B d) (g (Y O)) (c (\\f.\\q.A z)))))) (j ((\\x.\\j.(\\s.(\\s.\\b.G (c K) (\\p.\\w.M)) (i I (\\r.n) (V L v))) (\\h.y)) D))))",
      "g"
    );
  }

  @Test
  public final void test180() {
    reducesTo(
      "K (\\a.\\e.w (\\i.\\x.\\e.(\\p.B) (\\s.(\\a.s) (\\k.\\k.C) (\\f.\\y.(\\m.(\\z.l) (\\t.o A (g e))) (\\p.(\\x.W) ((\\c.u) (b v))) (s a e (\\v.b) ((\\c.y) O (\\f.(\\s.E) (k p)))) (\\j.(\\w.\\l.\\f.z) (R (\\w.V)) b (\\r.e ((\\o.(\\a.G) (\\a.m)) (o (\\v.t)))))))))",
      "K (\\a.\\e.w (\\i.\\x.\\e.B))"
    );
  }

  @Test
  public final void test181() {
    reducesTo(
      "\\t.(\\b.\\h.\\i.\\i.\\i.\\i.\\r.r) (\\k.(\\m.(\\v.\\k.t) w (\\m.(\\z.A) X) (\\z.Y (\\l.\\w.\\l.t)) ((\\q.\\p.j) ((\\v.(\\c.O) (\\f.x)) ((\\t.(\\s.C) (j b)) (t (H p)) (\\i.(\\m.A) (\\b.P) (\\d.a (\\h.x))))))) C) ((\\q.\\v.\\a.A (\\x.(\\w.X) ((\\o.\\e.(\\g.\\j.\\b.s) (\\e.F (a b q)) (\\h.m)) (\\d.e)))) (\\p.\\p.(\\j.(\\w.b (\\c.\\j.\\t.z J)) l) (\\u.L) (\\h.\\j.\\n.u)))",
      "\\t.\\i.\\i.\\i.\\i.\\r.r"
    );
  }

  @Test
  public final void test182() {
    reducesTo(
      "A (\\y.\\d.o)",
      "A (\\y.\\d.o)"
    );
  }

  @Test
  public final void test183() {
    reducesTo(
      "\\q.\\n.l",
      "\\q.\\n.l"
    );
  }

  @Test
  public final void test184() {
    reducesTo(
      "(\\r.(\\f.\\a.\\q.\\z.(\\u.j) z) M) (\\f.\\c.z) (\\y.R)",
      "\\q.\\z.j"
    );
  }

  @Test
  public final void test185() {
    reducesTo(
      "(\\g.\\w.\\u.(\\j.\\k.f) A) (U ((\\m.H) N) (\\q.o))",
      "\\w.\\u.\\k.f"
    );
  }

  @Test
  public final void test186() {
    reducesTo(
      "\\w.\\n.\\l.U e",
      "\\w.\\n.\\l.U e"
    );
  }

  @Test
  public final void test187() {
    reducesTo(
      "\\y.(\\r.\\p.\\i.o (\\z.\\k.\\n.\\w.\\q.\\i.f)) (\\s.(\\t.\\j.\\y.u (\\q.\\g.\\b.k) (\\v.(\\r.(\\j.\\h.\\d.f) J) (\\j.\\s.\\x.\\h.h)) ((\\c.q) (\\u.l (d (h m) (o j (A h)) (\\l.(\\g.G x (\\l.j)) (u (p i)))))) (H d)) ((\\p.w) (\\k.\\r.v)))",
      "\\y.\\p.\\i.o (\\z.\\k.\\n.\\w.\\q.\\i.f)"
    );
  }

  @Test
  public final void test188() {
    reducesTo(
      "h (o (u c))",
      "h (o (u c))"
    );
  }

  @Test
  public final void test189() {
    reducesTo(
      "\\n.\\h.a",
      "\\n.\\h.a"
    );
  }

  @Test
  public final void test190() {
    reducesTo(
      "(\\z.X) ((\\e.(\\p.p) ((\\g.o (\\a.\\i.(\\l.\\e.\\p.b v a) (\\n.\\d.\\j.n)) (\\z.(\\i.p) h v ((\\c.\\j.\\n.a f (w t) (L (\\m.K))) (\\y.\\d.f)))) (H ((\\r.k) n) (e (g m (t P) a)) (\\p.\\o.a)))) (\\o.g))",
      "X"
    );
  }

  @Test
  public final void test191() {
    reducesTo(
      "O (\\e.X)",
      "O (\\e.X)"
    );
  }

  @Test
  public final void test192() {
    reducesTo(
      "\\e.s ((\\i.(\\w.c) ((\\i.d (A u) (\\p.\\d.\\c.h)) v) (\\h.Z (\\e.P I)) J) r ((\\h.v) c))",
      "\\e.s (c (\\h.Z (\\e.P I)) J (v))"
    );
  }

  @Test
  public final void test193() {
    reducesTo(
      "(\\y.l a) t",
      "l a"
    );
  }

  @Test
  public final void test194() {
    reducesTo(
      "(\\j.x) ((\\e.\\x.\\s.\\p.R) ((\\e.n) (\\m.c (p B (\\h.\\g.\\g.\\l.(\\r.e) q (\\v.k S) ((\\c.t) ((\\a.o) (\\z.n)))) (o z ((\\p.\\i.D m) X) (\\z.\\j.(\\z.\\o.(\\h.\\l.Z) y) (\\i.V X (\\u.R) (L v (\\b.p)))))))))",
      "x"
    );
  }

  @Test
  public final void test195() {
    reducesTo(
      "\\z.\\f.c ((\\l.(\\o.p (\\i.y)) (\\l.(\\i.\\e.(\\n.\\f.(\\i.j) (z L) (l (\\f.m))) (\\b.b)) (\\u.d) ((\\a.V w) (\\l.k R (\\m.g) (\\z.x N (\\h.e)) (\\l.(\\l.v p (w a)) (\\s.q)))))) (\\t.(\\q.c) ((\\j.\\s.p (\\l.r) (\\x.\\n.(\\g.a (\\c.g) r) ((\\u.\\e.t) (o q x)))) ((\\z.Y o) K)))) (\\f.T)",
      "\\z.\\f.c (p (\\i.y)) (\\f.T)"
    );
  }

  @Test
  public final void test196() {
    reducesTo(
      "(\\b.c) ((\\j.(\\g.\\n.c ((\\d.\\x.\\h.\\i.q c I) (\\i.\\w.x j (Q D) (\\r.h p))) (\\b.\\l.\\n.u)) ((\\d.\\q.S) (\\p.T)) ((\\y.\\u.\\v.m) (B (\\u.q)) u ((\\a.O) (\\e.(\\v.\\k.\\a.p) (v o (E T)))) (h (\\c.o) r) C)) (y ((\\e.\\w.k) (\\y.\\u.\\e.(\\u.U) d) ((\\h.(\\f.d g (\\q.E)) (f u (\\s.g))) (p (\\q.u d (u r))) (C (\\c.(\\y.\\n.\\m.c) (\\o.q (f p)))) (I u)))))",
      "c"
    );
  }

  @Test
  public final void test197() {
    reducesTo(
      "(\\f.D ((\\b.y (\\c.u s)) (\\y.\\x.\\q.\\b.\\w.(\\z.W) (\\h.\\h.(\\w.D) W)) (\\i.\\t.m))) ((\\q.\\s.\\h.\\e.\\x.S N) ((\\y.(\\r.(\\b.g (k (\\e.\\y.m R))) (\\v.(\\k.(\\i.\\l.O) h) (\\c.S ((\\p.a) (g B))))) ((\\r.(\\k.(\\j.\\q.\\h.n) ((\\g.f) (m i))) (o (b f c))) (\\i.W))) (\\t.y))) (\\j.I)",
      "D (y (\\c.u s) (\\i.\\t.m)) (\\j.I)"
    );
  }

  @Test
  public final void test198() {
    reducesTo(
      "(\\u.\\s.o (\\t.(\\x.\\p.N) (\\b.w))) z",
      "\\s.o (\\t.\\p.N)"
    );
  }

  @Test
  public final void test199() {
    reducesTo(
      "\\k.(\\q.\\g.(\\l.\\s.\\x.(\\o.u) ((\\k.M T ((\\z.d) (\\e.\\b.(\\a.G) (m l) ((\\o.I) (\\z.r))))) (\\y.(\\c.c c (c m) (\\t.\\k.y) A) (\\b.(\\e.(\\h.Y) (E O)) (\\u.q) u)))) g) (\\g.\\j.(\\k.(\\b.h q ((\\h.l) (S y)) (\\h.\\t.s)) (F z (\\v.o) ((\\b.t) (\\s.k)) (V f)) ((\\p.(\\k.\\l.\\e.C) (\\e.\\g.e w) (k p (w o) w)) (\\x.q ((\\w.B) (s o)) (s s (\\b.G) z)))) Z ((\\y.k u) ((\\o.\\c.\\w.C w (\\h.f) (\\t.\\f.L)) (\\g.z) r (\\w.\\d.q)))) (\\d.I)",
      "\\k.\\s2.\\x.u"
    );
  }

  @Test
  public final void test200() {
    reducesTo(
      "(\\w.\\e.D) ((\\u.\\b.(\\y.C) ((\\t.(\\c.(\\z.b (\\o.\\q.P)) X ((\\d.w) (\\z.\\x.L))) R) ((\\q.(\\a.\\h.\\d.(\\j.X) Y ((\\f.z) (g u))) (\\b.\\d.\\h.\\o.n m (\\c.e))) ((\\z.k) (b z) (I X (\\u.i)) (g (i E (v d)))) (x (\\x.u (L g (\\o.b))) ((\\d.\\o.(\\e.P t) p) (\\n.g)))))) z)",
      "\\e.D"
    );
  }

  @Test
  public final void test201() {
    reducesTo(
      "(\\e.(\\z.M) (\\p.X (\\d.\\t.j (N (\\f.I) (\\g.B) ((\\n.p) (\\n.\\s.\\n.q))) (\\o.(\\k.i (\\c.t (i f) v)) f))) (\\c.(\\q.(\\s.(\\p.p) ((\\g.(\\t.\\m.q (\\s.c) (v p i)) (\\i.x ((\\p.p) (W Z)))) (l (\\u.(\\e.\\a.O l) (\\y.T H f))))) T) (\\g.l (\\j.\\w.x A) ((\\a.\\u.\\x.i) (\\s.\\p.L u)) b (\\e.(\\q.\\f.(\\y.\\f.O) (Q m d) (\\y.\\b.\\m.\\v.\\y.E z)) ((\\m.N (\\h.\\j.z W)) (\\x.\\l.\\r.Z))) (\\b.e)))) (\\v.k)",
      "M (\\c.\\m1.l (\\j.\\w.x A) (\\u.\\x.i) b (\\e.\\f.O) (\\b.\\v.k) (v p i))"
    );
  }

  @Test
  public final void test202() {
    reducesTo(
      "\\t.\\c.(\\e.u) (\\h.\\k.n)",
      "\\t.\\c.u"
    );
  }

  @Test
  public final void test203() {
    reducesTo(
      "\\t.\\v.\\q.\\n.n (\\x.(\\b.m (\\b.\\d.(\\n.(\\f.(\\h.h) f) (x (\\z.q (d (\\n.\\c.s m))))) (\\a.\\s.(\\b.P) (\\f.b (\\v.d) ((\\m.\\y.x v u (\\a.\\g.K)) (\\r.\\r.\\g.\\h.(\\j.W) b)))))) (\\c.(\\p.p) ((\\v.s (\\a.(\\i.Q (\\u.i) I) (q (\\g.h) (\\z.T)))) (G ((\\o.v p) (\\x.s) d))) (\\n.X ((\\g.H (\\r.w) (e U (A O)) (\\s.(\\u.E D (\\q.n)) (F v (\\f.C))) h) (r ((\\d.\\e.c U) (l R b) v))))))",
      "\\t.\\v.\\q.\\n.n (\\x.m (\\b.\\d.x (\\z.q (d (\\n.\\c.s m)))))"
    );
  }

  @Test
  public final void test204() {
    reducesTo(
      "\\a.h o",
      "\\a.h o"
    );
  }

  @Test
  public final void test205() {
    reducesTo(
      "\\b.i",
      "\\b.i"
    );
  }

  @Test
  public final void test206() {
    reducesTo(
      "b a ((\\q.\\j.E) (\\z.\\j.o (\\n.\\c.\\n.(\\n.o (\\j.X)) (\\l.r Z (\\t.q) c) (\\d.(\\e.\\y.\\e.i) (e (\\l.h p (\\p.I)))) (\\v.(\\m.N) (\\v.\\o.(\\e.\\y.\\j.\\l.\\e.\\u.I) (\\y.\\h.t)))) ((\\t.\\a.w) (q (N Z (\\i.(\\k.(\\j.\\k.\\e.r) X) w))))))",
      "b a (\\j.E)"
    );
  }

  @Test
  public final void test207() {
    reducesTo(
      "(\\v.a) a o ((\\y.k (\\b.\\q.\\z.(\\v.\\c.p (\\i.s b (\\i.l)) g) o) ((\\i.v) ((\\b.(\\s.x) ((\\o.g) (\\k.A))) (\\b.\\b.M (\\z.c))))) (\\u.(\\b.\\l.\\l.\\u.i) (\\v.(\\p.(\\h.g k (q i)) (\\b.L) ((\\i.\\j.\\u.p) (\\b.\\c.x)) r) (Z (Q (\\i.t) (\\g.\\e.\\e.c) d)))) ((\\b.\\l.\\t.t ((\\z.u ((\\w.\\n.c (\\z.s) (\\e.W X)) n)) Y)) (\\u.(\\l.\\p.h t (\\r.\\u.\\j.C) v D) (\\d.(\\s.\\z.\\o.b) ((\\g.(\\d.\\h.u) (S z (\\v.v))) (n y (F n) B))) a)))",
      "a o (k (\\b.\\q.\\z.\\c.p (\\i.s b (\\i.l)) g) (v) (\\l.\\t.t (u (\\n.c (\\z.s) (\\e.W X)))))"
    );
  }

  @Test
  public final void test208() {
    reducesTo(
      "(\\n.m ((\\m.\\k.(\\p.o) (u E) (b c j) (V f) o) (\\u.\\s.\\o.x (\\l.D) (\\e.(\\g.f (v C)) (T l u) (\\j.V l D ((\\k.q) (\\x.q)))))) (\\c.\\w.(\\v.\\l.m) ((\\b.\\k.(\\x.(\\o.S) (\\t.A) s ((\\x.v) (\\j.y) a)) i) k)) ((\\z.G) (\\b.B) ((\\q.(\\s.g ((\\c.Q) O)) V) ((\\g.\\l.i) ((\\s.f) (M v)) (I t W ((\\n.r) (\\v.z)))) (\\o.o) ((\\z.\\p.Q y (\\p.g) (\\l.K v)) ((\\g.m) (t d) (M (o u))) (s (B y) C (\\e.n (\\t.z))) ((\\s.a (t e (l J) b)) (p ((\\v.\\x.\\k.i) p))))))) (\\a.\\a.\\k.\\j.F)",
      "m (\\k.o (b c j) (V f) o) (\\c.\\w.\\l.m) (G (g (Q) (\\o.o) (Q y (\\p.g) (\\l.K v) (a (t e (l J) b)))))"
    );
  }

  @Test
  public final void test209() {
    reducesTo(
      "\\w.r",
      "\\w.r"
    );
  }

  @Test
  public final void test210() {
    reducesTo(
      "\\l.y",
      "\\l.y"
    );
  }

  @Test
  public final void test211() {
    reducesTo(
      "(\\r.\\a.l ((\\b.h) d)) (\\f.x)",
      "\\a.l (h)"
    );
  }

  @Test
  public final void test212() {
    reducesTo(
      "(\\e.(\\w.\\n.l) ((\\d.(\\o.S) (\\k.(\\v.u) j) ((\\q.\\k.w b) (\\r.u q O))) (M I (\\i.\\c.(\\a.W) (\\e.\\l.o))) ((\\o.\\p.i h (h b) (v (M u))) (\\m.\\t.(\\u.c f) (f (\\o.b))) (\\u.P (\\m.R)))) ((\\b.z) ((\\g.M (\\n.(\\u.f) n) (\\x.(\\j.\\z.\\t.Z) (m x (e u)))) (\\l.i)) (\\o.\\n.(\\e.n) (\\j.(\\j.p) Z j) (\\u.\\c.l) y)) (\\y.z (\\p.\\b.\\y.A))) (\\o.m)",
      "l (\\y.z (\\p.\\b.\\y.A))"
    );
  }

  @Test
  public final void test213() {
    reducesTo(
      "(\\w.v) ((\\m.H) (\\e.\\i.\\r.t (A (\\d.l)) i)) (\\c.\\w.k (\\t.\\u.\\b.b))",
      "v (\\c.\\w.k (\\t.\\u.\\b.b))"
    );
  }

  @Test
  public final void test214() {
    reducesTo(
      "(\\e.F (H ((\\b.\\f.\\u.\\n.n (\\f.W ((\\l.k) q)) (\\m.v)) ((\\n.Q) (\\w.s) (\\z.\\s.z b) ((\\f.q) ((\\w.c) (i X))) a)))) h ((\\n.(\\m.r) (\\b.\\a.s (U ((\\f.v) (\\o.\\l.\\z.z)))) ((\\w.L) f v)) i (\\v.(\\i.a (\\n.\\x.K)) (K (\\p.\\q.\\o.\\k.w)) V))",
      "F (H (\\f.\\u.\\n.n (\\f.W (k)) (\\m.v))) (r (L v) (\\v.a (\\n.\\x.K) V))"
    );
  }

  @Test
  public final void test215() {
    reducesTo(
      "\\q.p",
      "\\q.p"
    );
  }

  @Test
  public final void test216() {
    reducesTo(
      "b (\\w.q)",
      "b (\\w.q)"
    );
  }

  @Test
  public final void test217() {
    reducesTo(
      "\\j.\\v.(\\x.i) J",
      "\\j.\\v.i"
    );
  }

  @Test
  public final void test218() {
    reducesTo(
      "o (\\k.\\z.\\b.d)",
      "o (\\k.\\z.\\b.d)"
    );
  }

  @Test
  public final void test219() {
    reducesTo(
      "\\e.\\s.(\\h.\\n.v ((\\l.K ((\\v.o) g (\\b.N))) t (\\q.\\s.s))) ((\\c.D) (\\y.(\\t.p (\\k.\\q.\\o.k)) R) ((\\g.k) ((\\r.(\\f.\\z.\\c.(\\d.\\o.w) (\\s.a x)) (Y (\\g.o) ((\\n.j) (\\j.q)))) (t (a v O) (I (\\h.Q)))) (\\b.(\\n.\\j.y b ((\\i.z) l)) (\\u.(\\l.D) h r) (\\m.\\r.T (k k)) E) ((\\h.C (\\f.\\t.\\g.r) (\\i.\\v.m) (t ((\\v.Y Z v) (e (Z C))) (\\f.(\\x.J) V W ((\\w.x R (\\v.T)) (\\b.(\\g.p) (w e)))))) (b (\\o.\\q.(\\g.l) (l n) (K e)) a (\\a.K (g j (Z R) (g p M) c))))))",
      "\\e.\\s.\\n.v (K (o (\\b.N)) (\\q.\\s.s))"
    );
  }

  @Test
  public final void test220() {
    reducesTo(
      "(\\y.\\e.(\\j.(\\o.\\v.(\\j.s) (z d) (H (\\g.k)) f h ((\\n.y (\\f.\\q.t l) ((\\w.\\v.G) s)) (\\r.s)) (\\p.s)) (\\c.\\r.\\f.A (\\b.\\x.\\k.\\k.n (\\w.o (\\t.\\d.h) (\\o.J))) ((\\r.s (m M (\\t.f K (b o)) ((\\z.A) W))) ((\\s.\\b.\\l.r) (i j) (l x (D g) T) i)))) b) s",
      "\\e.\\v.s (H (\\g.k)) f h (s (\\f.\\q.t l) (\\v.G)) (\\p.s)"
    );
  }

  @Test
  public final void test221() {
    reducesTo(
      "\\o.(\\i.t) ((\\s.q (\\g.(\\m.k) W j)) (m (r (\\g.\\q.(\\y.M) (\\r.B) ((\\y.z) q) t (\\k.L)))) (\\f.(\\s.m (\\z.Y)) (C M)))",
      "\\o.t"
    );
  }

  @Test
  public final void test222() {
    reducesTo(
      "\\h.\\q.\\n.t",
      "\\h.\\q.\\n.t"
    );
  }

  @Test
  public final void test223() {
    reducesTo(
      "B (\\p.f) ((\\v.o) ((\\x.j (\\r.(\\p.\\c.z Q) (\\v.Y g))) (T (C (Q J (\\r.t))))) (\\i.A) ((\\o.\\v.t) (\\w.\\c.\\l.\\n.(\\f.l V (\\f.h)) (Y (\\m.C)) r ((\\y.\\l.\\l.(\\s.f) (m C) (\\v.\\h.n)) f) ((\\p.n H) (q (\\x.q)) ((\\h.V) v (C (\\f.g (X J))))))) ((\\f.M) (\\u.(\\t.\\c.x ((\\n.(\\v.n) (O r (Y b))) (\\c.\\w.v))) ((\\n.(\\f.e) ((\\l.Y) e)) (\\l.s) ((\\c.(\\r.e) (\\o.n) (\\l.Y g)) (\\z.d u (\\l.Q) F)))) n))",
      "B (\\p.f) (o (\\i.A) (\\v.t) (M n))"
    );
  }

  @Test
  public final void test224() {
    reducesTo(
      "g ((\\k.j W) (\\l.T))",
      "g (j W)"
    );
  }

  @Test
  public final void test225() {
    reducesTo(
      "\\u.(\\p.\\f.\\k.(\\i.\\s.\\j.s) (O (g m (s k) n ((\\u.\\q.P) (W (u i)))) (\\u.\\k.\\a.a) h ((\\n.\\o.\\d.(\\x.\\f.P (\\x.h) a) v ((\\m.r i) (\\b.r)) (\\j.\\x.(\\m.\\e.(\\f.m h) (\\z.G)) Y ((\\f.\\w.y (\\n.\\g.w)) (U Y (e e) (\\w.\\k.\\p.p))))) (\\y.(\\i.I) (\\z.\\z.W))))) ((\\v.\\d.A a) (\\i.P) (o (\\q.\\i.o (\\k.\\j.\\v.\\a.(\\m.x a) (\\f.g) (\\w.\\u.\\d.z P (v z))) h (\\l.\\h.\\b.\\m.\\t.g))))",
      "\\u.\\f.\\k.\\s.\\j.s"
    );
  }

  @Test
  public final void test226() {
    reducesTo(
      "(\\e.\\c.\\n.\\f.\\g.j (w ((\\v.(\\l.\\w.(\\m.D M) (\\f.\\d.x)) (\\v.(\\z.o j (\\m.J)) (\\v.o f (\\o.V)))) (\\t.\\e.(\\h.(\\r.m R) (\\n.d U)) (\\i.r)) (k (\\y.(\\x.m) D))) (w ((\\q.(\\v.\\z.(\\s.o) ((\\v.d k (r q)) (s (\\y.b)))) r) (\\r.\\a.z))))) q",
      "\\c.\\n.\\f.\\g.j (w (D M) (w (\\z1.o)))"
    );
  }

  @Test
  public final void test227() {
    reducesTo(
      "\\u.(\\y.P) (\\l.(\\o.\\x.\\b.w e (\\v.j) Y ((\\h.\\u.\\m.z) (\\b.\\h.\\m.c)) f) (\\v.\\b.L) ((\\e.y) (\\w.o (\\i.l))) (\\f.i o) (\\k.\\z.z))",
      "\\u.P"
    );
  }

  @Test
  public final void test228() {
    reducesTo(
      "(\\h.o (\\o.\\g.\\w.M) I) c ((\\j.(\\k.H (\\i.\\a.(\\v.\\z.c (\\o.\\x.q (\\k.\\b.m) (T (W L) (\\c.p O)))) (\\e.(\\p.f (o v)) (\\i.c k z) (l (\\g.y) (\\g.A)) p))) (\\c.\\k.c ((\\i.\\q.\\o.\\z.f) (k a (Q r) (E v (c m))) (\\t.\\z.\\z.q (\\k.\\w.\\q.\\l.U a)) (d (\\u.(\\w.m q (\\p.P)) (c t (A x))) G)))) (r (\\a.I) ((\\g.(\\u.(\\w.\\j.i) R L) (v i) (v r)) (\\d.\\k.x))))",
      "o (\\o.\\g.\\w.M) I (H (\\i.\\a1.\\z.c (\\o.\\x.q (\\k.\\b.m) (T (W L) (\\c.p O)))))"
    );
  }

  @Test
  public final void test229() {
    reducesTo(
      "(\\x.a (\\c.\\l.(\\f.(\\l.(\\c.\\u.(\\b.c) (\\i.i) (x N (\\v.b)) h) ((\\b.\\x.G) (\\u.l a (\\f.d) t))) c) p) q) (\\j.g)",
      "a (\\c.\\l.\\u.G h) q"
    );
  }

  @Test
  public final void test230() {
    reducesTo(
      "\\n.l",
      "\\n.l"
    );
  }

  @Test
  public final void test231() {
    reducesTo(
      "\\o.o",
      "\\o.o"
    );
  }

  @Test
  public final void test232() {
    reducesTo(
      "\\x.\\d.\\x.\\d.e (\\x.\\e.y (\\t.\\b.i) (\\w.\\s.\\l.k t ((\\z.U) Z)))",
      "\\x.\\d.\\x.\\d.e (\\x.\\e.y (\\t.\\b.i) (\\w.\\s.\\l.k t (U)))"
    );
  }

  @Test
  public final void test233() {
    reducesTo(
      "\\g.\\l.r",
      "\\g.\\l.r"
    );
  }

  @Test
  public final void test234() {
    reducesTo(
      "(\\p.p) W",
      "W"
    );
  }

  @Test
  public final void test235() {
    reducesTo(
      "(\\a.(\\p.\\g.(\\f.k) ((\\t.\\x.z N) (\\k.f))) ((\\x.(\\w.Y) w) (\\y.o))) (\\e.n) (\\e.u)",
      "k"
    );
  }

  @Test
  public final void test236() {
    reducesTo(
      "(\\q.X (\\o.j)) (\\l.\\e.(\\k.(\\q.\\z.a) (\\z.(\\l.\\n.\\x.H a) (\\b.w)) (x W ((\\d.L c (\\u.x) (a b (\\p.c))) (\\z.\\n.(\\c.B) (\\z.X) ((\\f.v) (b a))))) (O (\\v.u))) i (\\r.\\r.\\b.M))",
      "X (\\o.j)"
    );
  }

  @Test
  public final void test237() {
    reducesTo(
      "\\f.e",
      "\\f.e"
    );
  }

  @Test
  public final void test238() {
    reducesTo(
      "(\\y.(\\t.\\u.z W ((\\f.\\z.g) (\\k.c D (\\v.F) (\\w.(\\j.t) (a y))))) ((\\e.U P (\\g.S)) r (\\c.c) (\\o.(\\n.(\\m.\\w.I) C) (\\s.(\\h.(\\z.p) (\\b.j)) (\\e.c)))) G) i ((\\z.y) (\\r.S ((\\e.\\w.r) i) i)) q",
      "z W (\\z.g) (y) q"
    );
  }

  @Test
  public final void test239() {
    reducesTo(
      "(\\q.\\x.(\\v.\\s.\\l.j ((\\u.\\s.H) z X)) ((\\j.q (V ((\\a.q (\\l.\\l.\\p.u)) ((\\o.\\q.\\j.X) (\\w.E)) (\\i.(\\h.\\a.\\z.(\\x.z G) F) (m c w ((\\n.M) (\\r.f))))))) v)) (\\s.t)",
      "\\x.\\s.\\l.j (H)"
    );
  }

  @Test
  public final void test240() {
    reducesTo(
      "\\j.\\y.\\r.(\\c.\\j.\\m.\\j.(\\t.\\a.\\r.\\z.f) (G (R (g (W C))) ((\\q.r) (\\q.G) (v b (K d)) (\\k.\\i.\\h.(\\k.y e) (\\j.\\i.P)))) (\\u.(\\m.(\\b.P) (\\p.\\f.\\d.s) b (\\i.p (\\b.u) r ((\\x.\\j.X) (\\q.\\w.E s)))) E)) ((\\i.U) j (\\y.\\w.J)) (n (\\w.\\d.e (\\s.\\l.\\l.U) (\\l.o)) (\\h.\\w.\\x.Y) w (\\h.\\h.b)) ((\\m.\\k.(\\l.\\f.\\x.\\r.(\\g.\\o.l) (\\u.c (o (\\y.x)) (\\l.(\\d.\\t.u ((\\e.p) (w l))) (a c (s F) (\\t.(\\j.a) (G y)))))) o) (\\l.\\y.\\m.\\u.p (\\v.\\i.(\\e.\\u.\\o.v ((\\q.L t (\\u.E)) o)) (\\g.\\d.R))) (\\v.(\\j.(\\d.h) ((\\o.P) w)) L))",
      "\\j.\\y.\\r.\\j.\\r.\\z.f"
    );
  }

  @Test
  public final void test241() {
    reducesTo(
      "m (r v)",
      "m (r v)"
    );
  }

  @Test
  public final void test242() {
    reducesTo(
      "\\f.(\\h.(\\o.y) (\\r.\\o.\\h.S) ((\\v.c) s ((\\z.d) U))) (\\z.\\x.\\q.\\a.d)",
      "\\f.y (c (d))"
    );
  }

  @Test
  public final void test243() {
    reducesTo(
      "o (\\p.\\r.\\w.k (\\m.\\v.(\\j.\\y.p ((\\c.q) (\\s.Q) (\\d.p)) (\\f.(\\h.\\e.\\l.n (\\f.o)) (\\p.p (o t (\\h.j)))) (\\x.e)) K (\\c.\\j.f H)))",
      "o (\\p.\\r.\\w.k (\\m.\\v.p (q (\\d.p)) (\\f.\\e.\\l.n (\\f.o)) (\\x.e)))"
    );
  }

  @Test
  public final void test244() {
    reducesTo(
      "(\\i.(\\n.(\\r.\\i.Y) (\\s.\\i.(\\f.\\h.(\\z.Z) Z) (t z (\\v.r) (\\k.\\f.u p)) (k (\\x.o)) m)) (\\j.n ((\\w.k) J) (\\d.a))) ((\\b.h) (\\m.\\x.(\\r.\\p.G ((\\m.\\t.\\g.\\i.(\\u.s) k) T u)) ((\\k.\\x.\\w.d ((\\h.r (C d)) (r (a z)))) (\\h.a (\\c.\\y.y Q (\\t.a) (\\f.f))) ((\\o.n) (\\x.V p e (\\v.c) (\\t.\\l.\\v.(\\c.u K) (A (\\m.u)))))))) (z P)",
      "Y"
    );
  }

  @Test
  public final void test245() {
    reducesTo(
      "(\\u.h (\\v.\\j.B)) (\\u.J)",
      "h (\\v.\\j.B)"
    );
  }

  @Test
  public final void test246() {
    reducesTo(
      "\\t.\\z.\\f.\\g.w",
      "\\t.\\z.\\f.\\g.w"
    );
  }

  @Test
  public final void test247() {
    reducesTo(
      "Y (m N (\\e.(\\g.\\b.\\x.(\\d.z C (\\t.t) (\\z.J) (\\w.u M T (\\h.H))) (M (\\p.(\\l.J B) q))) (\\o.d)) (\\k.\\s.(\\a.h) (\\r.\\j.o))) x",
      "Y (m N (\\e.\\b.\\x.z C (\\t.t) (\\z.J) (\\w.u M T (\\h.H))) (\\k.\\s.h)) x"
    );
  }

  @Test
  public final void test248() {
    reducesTo(
      "(\\p.(\\o.t) (\\w.S)) I",
      "t"
    );
  }

  @Test
  public final void test249() {
    reducesTo(
      "U (\\t.(\\y.\\d.Z (g (s (s (W f) (\\a.\\k.N A) ((\\h.H j) (y (\\q.o))))))) ((\\k.a) i)) (Z (\\v.C) D)",
      "U (\\t.\\d.Z (g (s (s (W f) (\\a.\\k.N A) (H j))))) (Z (\\v.C) D)"
    );
  }

  @Test
  public final void test250() {
    reducesTo(
      "q (\\h.(\\g.O) ((\\v.\\n.\\h.(\\r.b) t) ((\\d.\\x.y (\\g.a)) (v (w F) (\\t.q x C)) (\\m.X (\\f.s) (\\f.b) (\\k.B)) (\\f.(\\n.\\g.b) (\\l.O)) (V f))))",
      "q (\\h.O)"
    );
  }

  @Test
  public final void test251() {
    reducesTo(
      "(\\y.Y) (\\x.\\t.\\p.\\n.v) N",
      "Y N"
    );
  }

  @Test
  public final void test252() {
    reducesTo(
      "\\t.\\r.x",
      "\\t.\\r.x"
    );
  }

  @Test
  public final void test253() {
    reducesTo(
      "x (\\y.\\b.(\\d.g (\\j.w)) (u q))",
      "x (\\y.\\b.g (\\j.w))"
    );
  }

  @Test
  public final void test254() {
    reducesTo(
      "\\n.\\o.(\\g.i) ((\\p.\\f.\\e.\\x.\\e.\\r.\\p.(\\m.s) (\\a.S)) (\\e.Y))",
      "\\n.\\o.i"
    );
  }

  @Test
  public final void test255() {
    reducesTo(
      "(\\b.\\w.z) (g ((\\x.O) l) (\\n.a)) (d t)",
      "z"
    );
  }

  @Test
  public final void test256() {
    reducesTo(
      "(\\n.(\\r.\\n.\\g.\\k.(\\x.\\c.q) X) ((\\t.\\y.(\\d.\\z.\\q.\\f.j f (\\t.v) (d T (\\d.Y)) ((\\r.h) (\\b.W) (h (a y)))) (f (\\d.\\w.v J) Y)) (t u (L h) (\\k.q) k (\\j.\\x.\\j.(\\h.Y (\\k.J)) (\\s.\\c.\\w.L))) (R (\\k.\\f.s)))) (\\v.\\v.(\\k.r) (\\q.\\h.\\l.D ((\\p.t ((\\l.\\s.(\\y.b) r ((\\r.Y) d)) (Z k))) (\\i.\\g.z)))) ((\\l.\\z.\\o.c (\\s.\\l.(\\d.x r) (\\f.d))) ((\\t.(\\x.\\d.\\q.\\i.(\\g.a) (g M)) (o b (h g) (\\z.\\l.d)) ((\\n.e) (\\v.o))) (b (\\w.\\u.\\p.d (K v) (\\a.\\w.a)) ((\\d.m N (u Q) O) (y j))) (\\j.I b (\\t.w)) ((\\s.u) (\\j.\\g.h ((\\n.S) (\\e.b) (\\j.c)) (\\c.g) (\\x.Q)))))",
      "\\g.\\k.\\c.q"
    );
  }

  @Test
  public final void test257() {
    reducesTo(
      "(\\m.(\\w.z A) ((\\c.\\n.(\\d.(\\r.\\u.f) (v D (\\j.w))) (v ((\\v.f) (V j)))) (\\x.i h ((\\n.\\c.\\c.y) (\\z.m U (\\d.L))))) (\\c.\\j.b) ((\\j.\\x.\\z.(\\x.(\\t.\\s.\\n.\\f.\\t.\\g.h) (\\m.K)) r ((\\y.g V (\\v.\\w.n (\\w.k r))) h)) ((\\g.(\\u.\\w.\\f.\\k.\\g.k g (\\m.z)) q) (\\x.b (\\e.\\t.\\p.f Y (\\w.i) ((\\w.G) (\\w.y)))) h))) (l q) U",
      "z A (\\c.\\j.b) (\\x.\\z.\\n.\\f.\\t.\\g.h) U"
    );
  }

  @Test
  public final void test258() {
    reducesTo(
      "(\\i.u (\\p.q)) (I (H (\\a.\\s.A (\\j.(\\s.r) (y E) a (\\p.(\\o.j) (\\x.a) z))) (\\i.e)) (a (\\t.(\\x.(\\e.l) (\\e.\\d.\\x.\\r.\\x.B)) b (I ((\\d.(\\h.L x g) (\\n.\\p.\\a.o) ((\\w.s) n (\\k.q l (c c)))) (y g))))))",
      "u (\\p.q)"
    );
  }

  @Test
  public final void test259() {
    reducesTo(
      "\\y.(\\m.\\c.\\s.m) (\\n.f)",
      "\\y.\\c.\\s.\\n.f"
    );
  }

  @Test
  public final void test260() {
    reducesTo(
      "(\\f.B) ((\\h.\\l.j) ((\\s.o) ((\\f.(\\u.w (d q)) (y (\\q.k))) (l Y (\\r.i) (\\x.\\o.y A))))) S (\\l.\\p.y) ((\\g.\\o.(\\f.\\e.H (\\m.D (i u) (\\x.p)) s) ((\\l.F) k)) (a ((\\v.\\e.\\m.x) ((\\u.r) (\\j.v)) (a (\\l.b)) ((\\h.v) ((\\b.n) (\\t.o)) (p (\\n.(\\r.z) (\\h.K))))) p) (c (\\k.\\c.t) ((\\f.\\b.(\\x.i) w (\\c.(\\h.\\m.\\t.L) ((\\s.X) (e q)) (r (\\q.p)))) ((\\y.L) ((\\s.C) (j l)) (\\h.(\\r.\\h.k v) ((\\o.d) (\\z.J))) ((\\n.c j (\\w.U) (h i (\\r.u))) (\\y.\\j.t))) (\\m.s ((\\r.q (\\m.\\s.P v)) (V v (\\k.R) ((\\q.o) (\\o.U)))) x))))",
      "B S (\\l.\\p.y) (\\e.H (\\m.D (i u) (\\x.p)) s)"
    );
  }

  @Test
  public final void test261() {
    reducesTo(
      "(\\c.\\t.\\n.B (\\g.(\\w.o R (x s)) (\\x.(\\h.O) d) (\\t.\\w.m d (\\p.D) ((\\g.b) (i y))))) (\\z.U) ((\\n.L) (\\z.e) b (\\i.h) ((\\p.F t E (\\k.\\v.\\l.u)) (\\c.(\\v.(\\n.n) (\\k.N)) (b p q))) (l n (\\q.r) ((\\g.p) (V a)) (z Z) (H ((\\o.y) (\\c.B) (\\v.(\\f.d) (k o)))))) ((\\x.G) ((\\x.(\\m.D) (\\e.l) (\\k.p)) (\\f.d) E) (\\k.K)) w ((\\c.\\x.\\k.b) (t ((\\p.(\\z.(\\w.b (a j) ((\\y.W) s)) (v ((\\z.o) H))) (N f (\\d.(\\o.\\o.\\u.R) (\\z.f)))) (\\a.j)) (\\a.\\w.(\\e.\\g.o (\\q.Z) (\\x.(\\o.j) (\\h.u) ((\\y.I) (\\s.P))) ((\\e.\\i.\\t.\\d.(\\u.K) l) (\\n.\\y.g))) ((\\p.b) A) i)))",
      "B (\\g.o R (x s) (\\t.\\w.m d (\\p.D) (b))) w (\\x.\\k.b)"
    );
  }

  @Test
  public final void test262() {
    reducesTo(
      "\\i.\\d.(\\j.Q) ((\\x.(\\u.e) h (\\w.n q (\\n.Z) (\\q.y v i) (\\z.L h (\\e.t) (C Y (\\e.P)))) ((\\c.\\z.\\r.\\h.m) (\\t.Q e (\\e.a)))) (f (Q (\\q.(\\n.N) (\\c.z G))))) (A (\\d.(\\r.(\\n.z) (\\t.(\\n.Q) f)) j)) Y",
      "\\i.\\d.Q (A (\\d.z)) Y"
    );
  }

  @Test
  public final void test263() {
    reducesTo(
      "(\\r.i D (k c) (\\d.u v (b R))) (\\o.\\s.\\h.\\q.l J (\\a.n)) (\\v.d (D (r l (\\x.o)))) b ((\\s.(\\n.\\b.f) (\\y.n (\\p.(\\p.z) (f e)) (N q (w q) (j (\\j.o))))) (A (\\x.(\\h.\\v.\\x.\\v.x) ((\\b.\\v.\\u.X) (\\m.\\e.d))))) (d (g ((\\p.J) G) d)) (\\s.\\v.W) ((\\g.\\q.z G) (o (\\q.\\l.\\g.\\h.(\\z.K) U) (\\l.\\x.(\\y.i) (\\u.\\h.k I) ((\\a.(\\x.Z) w) (\\u.(\\a.m) (m f))) (\\v.\\o.\\g.(\\p.\\e.(\\o.B) (\\c.j)) (\\p.\\f.\\q.\\d.J z))) (g ((\\d.v z) (\\t.D)) (\\s.\\g.\\d.j h P a) (\\r.w))) (\\z.(\\g.e) ((\\l.\\d.P (V (N (\\n.u r e)))) v) y))",
      "i D (k c) (\\d.u v (b R)) (\\v.d (D (r l (\\x.o)))) b (\\b.f) (d (g (J) d)) (\\s.\\v.W) (z G)"
    );
  }

  @Test
  public final void test264() {
    reducesTo(
      "(\\q.\\g.\\m.(\\t.\\k.(\\h.(\\w.(\\z.p) (\\v.(\\s.H) (n N)) p) (p (\\n.(\\j.c) (j g)) (\\x.v e (\\i.P) C)) (\\m.\\f.\\r.m X P)) (s ((\\s.\\j.O (\\b.t) ((\\i.x) (E k))) ((\\j.k) (R L) (Y x))) (a (\\q.q))) (q ((\\t.j) (\\e.\\t.(\\g.Y) (f G) (j M)) (k a) (\\u.(\\l.R) n)))) ((\\r.\\u.u) q)) l",
      "\\g.\\m.\\k.p p (\\m.\\f.\\r.m X P) (l (j (k a) (\\u.R)))"
    );
  }

  @Test
  public final void test265() {
    reducesTo(
      "(\\g.\\q.\\q.\\c.\\o.(\\d.b) (\\d.y)) (q (\\p.U) b ((\\w.\\l.r z) S F (\\v.j D a) ((\\k.b) u (\\z.\\r.\\n.l))) (\\b.r)) (\\n.\\k.\\m.(\\n.\\j.\\y.(\\m.q (\\l.y)) (\\p.\\f.S)) (\\q.\\f.O))",
      "\\q.\\c.\\o.b"
    );
  }

  @Test
  public final void test266() {
    reducesTo(
      "\\l.(\\j.(\\r.(\\i.l e) j e) ((\\c.R (V (W i)) j) (G ((\\u.s) j)) (\\q.b)) n (\\s.(\\k.(\\q.w) (\\t.\\u.(\\p.(\\f.\\b.\\i.i) (\\f.l e (K q)) (v x) i) ((\\j.\\j.n k) M ((\\m.P n (\\c.w) z) (B (\\y.o)))))) (\\f.\\z.\\o.C))) (q (\\b.(\\a.(\\g.\\z.(\\o.\\w.\\s.F) (c (\\g.R))) ((\\f.M (\\t.o)) (U (\\q.P f (F b)) (d x (D m) (\\d.\\a.v t)))) (P (\\a.(\\j.\\h.u) ((\\q.\\p.o a (\\m.y h)) (\\w.i C (T O) (\\f.c O)))))) (\\y.v (n (\\g.\\e.(\\j.\\y.n b (s r) s) ((\\f.G V (\\q.u)) (\\w.e (w l))) ((\\e.z) (Q E) U ((\\a.z) (\\h.z (k k)))))))))",
      "\\l.l e e n (\\s.w)"
    );
  }

  @Test
  public final void test267() {
    reducesTo(
      "(\\z.\\f.x) (\\j.\\d.(\\q.(\\c.N (\\e.D)) ((\\b.\\z.w) (\\j.(\\z.l) (\\m.x a (H J) r) (c J (Q f) (o s) ((\\x.\\n.f) (\\r.(\\j.P) (p H))))) (\\s.z ((\\k.A) ((\\r.\\g.\\q.\\b.\\z.(\\c.r) (\\q.Q)) (b (\\n.S) N)))))) (\\r.x))",
      "\\f.x"
    );
  }

  @Test
  public final void test268() {
    reducesTo(
      "(\\l.(\\y.E (\\i.n)) u) (N (\\r.(\\i.(\\j.\\q.\\b.i) (R p C) (h (\\u.\\n.\\h.y)) ((\\v.X) ((\\e.a) (\\f.s)) a)) ((\\c.J) (\\v.\\p.r) (\\d.\\y.i l g ((\\x.t) (A m))) s) (\\a.w (\\s.\\f.(\\c.\\j.n) (\\c.\\b.\\d.\\l.j k (A v)) ((\\w.(\\r.d) (k g)) (\\z.\\b.C d) (F (F (y H)))))) (\\r.(\\h.\\o.\\y.\\k.Y e) ((\\u.f B) (J (a (\\s.c (p y)) (\\j.\\t.(\\j.f) ((\\m.m) (\\h.A)))))))))",
      "E (\\i.n)"
    );
  }

  @Test
  public final void test269() {
    reducesTo(
      "\\t.J",
      "\\t.J"
    );
  }

  @Test
  public final void test270() {
    reducesTo(
      "\\n.\\w.(\\t.\\a.\\z.H) ((\\z.i r) E ((\\l.\\d.I (X f)) s))",
      "\\n.\\w.\\a.\\z.H"
    );
  }

  @Test
  public final void test271() {
    reducesTo(
      "\\t.\\t.d (\\a.\\e.s ((\\n.(\\j.I) ((\\z.\\l.V) (\\w.e))) (\\g.\\y.\\p.W)))",
      "\\t.\\t.d (\\a.\\e.s (I))"
    );
  }

  @Test
  public final void test272() {
    reducesTo(
      "(\\k.n (\\f.T) z (\\t.(\\k.(\\e.\\v.H ((\\h.D) (k o)) (N (\\b.(\\t.s) (\\b.N)))) (\\t.\\a.(\\i.\\i.N) n)) M ((\\m.(\\i.(\\w.\\h.n m) j) ((\\t.f x) (d B (\\j.x))) (y z)) (g (\\e.r m (\\m.S) (\\y.(\\d.g) (m X)) (\\p.(\\z.w) (\\e.A (\\s.D)))))))) g (\\l.\\q.\\c.\\x.\\w.\\b.(\\r.\\h.j y) (\\r.\\b.\\q.\\f.(\\l.\\i.T) (\\t.\\f.x)) ((\\u.\\r.\\w.v) ((\\y.s T (\\t.s)) l) (Z (\\p.\\q.(\\l.\\v.b) t)) (\\x.h)) (j (m (\\n.W) (\\t.(\\b.m) (\\h.r)) (\\z.H) (\\d.(\\l.R) ((\\y.X D (\\b.P)) k)) ((\\n.T) ((\\z.\\g.j c) D) g))) (\\o.\\r.(\\x.P (t ((\\c.\\s.S z) (\\j.\\v.y)) (C (X (\\u.\\f.i o)))) ((\\x.(\\d.\\c.(\\h.t f) (a D Q)) (\\x.m v (\\k.a) H)) (j ((\\o.v) (\\m.h) (T e (V s)))) D)) (\\p.s)))",
      "n (\\f.T) z (\\t.H (D) (N (\\b.s))) (\\l.\\q.\\c.\\x.\\w.\\b.j y (j (m (\\n.W) (\\t.m) (\\z.H) (\\d.R) (T g))) (\\o.\\r.P (t (\\s.S z) (C (X (\\u.\\f.i o)))) (t f)))"
    );
  }

  @Test
  public final void test273() {
    reducesTo(
      "(\\l.\\a.\\b.u) (\\o.(\\m.\\q.\\l.\\t.\\m.z) (\\b.(\\w.R (s k) o d ((\\t.(\\j.\\b.r M) (\\v.(\\z.i) N)) (u ((\\g.d) (k W)))) ((\\m.\\e.\\e.(\\o.x f i) (\\h.\\l.i s (i B) (\\w.\\u.A))) (\\n.r)) (a (\\i.(\\d.j) (\\x.\\l.\\a.\\f.A S b)) l)) O))",
      "\\a.\\b.u"
    );
  }

  @Test
  public final void test274() {
    reducesTo(
      "\\a.k (\\v.\\g.\\n.V) (C (\\p.u)) (K (\\i.\\n.A (\\u.(\\i.(\\p.i (z b) (h (F g)) P) (\\d.J)) t (\\n.A))))",
      "\\a.k (\\v.\\g.\\n.V) (C (\\p.u)) (K (\\i.\\n.A (\\u.t (z b) (h (F g)) P (\\n.A))))"
    );
  }

  @Test
  public final void test275() {
    reducesTo(
      "(\\i.\\k.(\\b.(\\i.n v) (a (\\h.o m ((\\t.\\g.(\\c.\\u.u) (V y (\\h.m) (\\b.\\z.b))) (\\z.O))))) (\\e.\\n.\\p.f (A (Z t) (\\o.\\k.\\k.G) ((\\q.y) (f b) s) H) G V)) (\\f.\\n.M)",
      "\\k.n v"
    );
  }

  @Test
  public final void test276() {
    reducesTo(
      "(\\e.(\\r.\\f.(\\f.(\\g.j) (Q B)) (u Q (Q Y)) T u ((\\l.i (O a (\\v.w)) (\\a.j)) (\\u.e (\\z.e))) (\\h.y z) (O (\\a.I) (\\h.(\\g.\\n.\\r.(\\m.(\\t.\\n.k) ((\\e.I) (p j))) (\\k.J W ((\\c.g) (\\z.P)))) (C (j x) (h B (b l)) (v ((\\m.H) J))) (\\x.f)))) ((\\m.(\\k.T) ((\\j.E) S)) t)) (a W)",
      "\\f.j T u (i (O a (\\v.w)) (\\a.j)) (\\h.y z) (O (\\a.I) (\\h.\\r.\\n.k))"
    );
  }

  @Test
  public final void test277() {
    reducesTo(
      "\\u.a",
      "\\u.a"
    );
  }

  @Test
  public final void test278() {
    reducesTo(
      "\\k.\\k.a",
      "\\k.\\k.a"
    );
  }

  @Test
  public final void test279() {
    reducesTo(
      "\\s.z q",
      "\\s.z q"
    );
  }

  @Test
  public final void test280() {
    reducesTo(
      "\\s.\\c.(\\t.M) ((\\m.Z ((\\j.\\l.\\d.(\\o.t) (\\a.\\o.S) q) R)) ((\\n.\\r.c) (\\m.i) ((\\h.G) x (\\n.\\o.l) ((\\l.H) s ((\\j.\\h.T) R)))))",
      "\\s.\\c.M"
    );
  }

  @Test
  public final void test281() {
    reducesTo(
      "\\c.\\m.(\\g.a) ((\\h.\\o.s) ((\\o.N) (\\q.(\\u.(\\z.(\\s.r Q (w n) (\\p.R w)) (r (A (\\k.t)))) (\\b.\\t.\\z.h)) ((\\g.z) (\\o.(\\z.w) (\\h.\\j.c)) (\\u.V (w X ((\\d.R) (\\n.P)))))) ((\\w.\\e.r (V u) v) ((\\l.\\y.\\e.r O (v v) (R (Z f)) (\\t.m) D) d))))",
      "\\c.\\m.a"
    );
  }

  @Test
  public final void test282() {
    reducesTo(
      "\\b.(\\t.\\l.g) (\\a.g) (\\j.\\t.\\v.T ((\\p.\\d.g) (\\k.r ((\\a.\\t.l (\\v.p) ((\\e.\\u.\\c.o) (\\a.\\w.J Y))) k ((\\r.v (\\h.z f (\\n.a) (\\m.g))) (\\p.\\p.(\\n.B (\\x.Y) (\\b.\\k.h)) (\\v.\\b.B)))))))",
      "\\b.g"
    );
  }

  @Test
  public final void test283() {
    reducesTo(
      "o ((\\c.x Y) (L C h)) (\\u.\\s.(\\d.p) (l H (o l)) h) ((\\w.(\\k.\\c.J i) (\\u.o)) (s s (\\d.s)) c) (z L) (\\x.(\\s.N (\\j.\\x.i l)) ((\\u.\\s.\\p.\\j.\\u.\\r.k B) (s s N y) (o (\\q.J))) (z (\\b.\\i.\\k.j) (k F ((\\m.z S d) J) m))) (\\o.\\h.(\\b.\\m.\\x.i) (\\b.l (\\r.l))) (\\m.(\\o.\\h.a (\\p.s (w g) (t (b a (\\o.m)))) (\\v.r (\\d.h)) m) (\\a.\\k.p) d)",
      "o (x Y) (\\u.\\s.p h) (J i) (z L) (\\x.N (\\j.\\x.i l) (z (\\b.\\i.\\k.j) (k F (z S d) m))) (\\o.\\h.\\m.\\x.i) (\\m.a (\\p.s (w g) (t (b a (\\o.m)))) (\\v.r (\\d1.d)) m)"
    );
  }

  @Test
  public final void test284() {
    reducesTo(
      "(\\e.b (\\q.F) (\\p.i) y) (\\v.\\m.\\c.b) ((\\c.a (\\b.C)) (Q (\\z.q (\\v.\\p.\\n.k (m (h (w h)))) ((\\k.r) a ((\\q.v) (L s)) (\\n.\\e.Y (\\f.Q) h) (\\l.\\d.(\\v.\\l.x (\\w.\\z.D)) (k (E n) (\\i.\\b.d))))))) (q ((\\u.y) d (\\l.l (\\g.\\w.\\e.Y)) ((\\r.y) ((\\y.(\\n.J) x (\\k.f) (\\f.\\h.\\j.i (\\x.\\o.j))) (\\z.p))) F))",
      "b (\\q.F) (\\p.i) y (a (\\b.C)) (q (y (\\l.l (\\g.\\w.\\e.Y)) (y) F))"
    );
  }

  @Test
  public final void test285() {
    reducesTo(
      "(\\x.b (\\u.o) ((\\s.P) ((\\a.(\\r.g) (\\a.D) (t q (h y))) (\\r.\\q.(\\x.m) ((\\m.e) (l u))) ((\\v.(\\g.x) (N u)) o i)) ((\\l.y) ((\\p.(\\c.b) (r F)) (j v (m C))) (p (\\a.\\k.\\f.\\t.r)) (\\g.(\\o.(\\v.o) (\\k.j) (r (e D))) (O y (\\j.A) (\\o.(\\e.A) (\\f.N))) t)) (\\n.(\\k.\\r.\\t.G) ((\\i.T ((\\d.o) (\\u.m)) (x f (\\y.k) (T I (Y U))) (l r)) (x y))))) (\\r.(\\g.(\\m.(\\t.R) ((\\i.\\d.W ((\\d.k) (\\w.\\m.c))) k)) (s ((\\h.l) ((\\c.G) (N n))) (\\z.f (\\f.\\k.\\p.(\\s.a n) (\\w.V))) j)) (F ((\\a.\\f.(\\a.e) (\\p.\\a.(\\z.\\e.O) (C m n)) ((\\v.E) j)) O)) n)",
      "b (\\u.o) (P (y (p (\\a.\\k.\\f.\\t.r)) (\\g.O y (\\j.A) (\\o.A) (r (e D)) t)) (\\n1.\\r.\\t.G))"
    );
  }

  @Test
  public final void test286() {
    reducesTo(
      "r (\\f.y) (\\v.l)",
      "r (\\f.y) (\\v.l)"
    );
  }

  @Test
  public final void test287() {
    reducesTo(
      "\\x.m z (\\u.(\\v.\\s.z (\\u.(\\v.q (z (\\j.h)) (g (\\g.i) (f D (m a))) (o (\\r.\\x.s) T)) p)) i (\\d.\\b.V (Y z O (\\i.(\\x.X) E) ((\\p.\\q.v) (\\q.X G ((\\m.\\y.(\\v.w) (\\d.i A)) (\\x.a (F K) (\\k.d z n))))))))",
      "\\x.m z (\\u.z (\\u.q (z (\\j.h)) (g (\\g.i) (f D (m a))) (o (\\r.\\x.\\d.\\b.V (Y z O (\\i.X) (\\q.v))) T)))"
    );
  }

  @Test
  public final void test288() {
    reducesTo(
      "(\\c.\\a.(\\t.S (C (Z (\\v.A) c ((\\c.d g (x K)) (e (\\d.h))) ((\\a.\\v.\\c.o) (\\a.\\u.R y) (K y (X A) (F (v Y))))))) G ((\\n.v) ((\\s.\\u.g (P (\\p.\\r.\\e.R))) (l (\\n.(\\d.\\z.\\d.k) (w q (h x))) (\\v.(\\x.m) b)) (z (\\a.\\y.\\m.(\\j.\\t.C N) (\\m.E)) r)))) (\\f.(\\x.\\f.\\d.\\f.w) j)",
      "\\a.S (C (Z (\\v.A) (\\f.\\f.\\d.\\f.w) (d g (x K)) (\\c.o))) (v)"
    );
  }

  @Test
  public final void test289() {
    reducesTo(
      "\\l.(\\h.\\u.\\c.(\\y.o) (\\r.o)) (\\s.\\t.\\l.\\w.n (\\y.n)) ((\\i.\\r.\\d.\\x.h) y)",
      "\\l.\\c.o"
    );
  }

  @Test
  public final void test290() {
    reducesTo(
      "o (\\k.(\\q.\\y.(\\l.I u A) c ((\\i.C (\\s.l n (U c))) a) c) (\\o.l) (U ((\\k.r j) p) (v ((\\t.\\g.(\\o.\\r.N) (\\s.j)) (\\a.\\a.U (p g (\\k.z))))) ((\\m.s) A a ((\\h.\\s.Q c (\\g.r) (\\u.\\p.i)) (b l (\\g.t) i)) E)) q)",
      "o (\\k.I u A (C (\\s.l n (U c))) c q)"
    );
  }

  @Test
  public final void test291() {
    reducesTo(
      "p ((\\b.r ((\\l.v) t ((\\z.b) C))) (\\x.r) ((\\d.\\m.\\r.\\w.(\\t.J) (q f) (\\z.q b) (\\a.Y)) (\\j.(\\v.(\\w.\\z.Y) r) ((\\k.n) v (\\g.(\\z.g) (\\r.S))))) (\\t.\\x.m)) ((\\j.(\\w.\\b.Q) ((\\b.v) ((\\l.h) (\\c.r)))) f O ((\\v.C ((\\e.O) (\\h.d)) ((\\s.u) (\\c.\\u.u) (z (\\z.M) (c q (Q q))))) (\\p.u)) (\\z.q)) K",
      "p (r (v (\\x.r)) (\\m.\\r.\\w.J (\\z.q b) (\\a.Y)) (\\t.\\x.m)) (Q (C (O) (u (z (\\z.M) (c q (Q q))))) (\\z.q)) K"
    );
  }

  @Test
  public final void test292() {
    reducesTo(
      "(\\w.f (\\g.l)) (c (\\m.N (\\x.z))) (\\q.\\a.\\a.\\a.W (\\o.\\w.(\\j.n (\\d.\\y.\\m.(\\i.\\o.I) h ((\\n.\\u.A) (\\i.\\q.a)))) ((\\u.(\\u.c t (\\k.x)) (\\v.\\g.\\j.C)) ((\\i.y (\\f.K)) (g (J A))) J)) (f (K (\\e.q)))) ((\\g.\\x.\\s.\\a.Z) (e (d (\\c.\\z.(\\i.k (h (u g (\\l.X))) (\\v.p (y (\\p.a)))) ((\\v.\\j.H) (d F (\\z.p)) (z C) (\\s.B a (\\y.s) ((\\e.w) (D X)) ((\\m.n) (u o) ((\\o.j) (\\y.K)))))))))",
      "f (\\g.l) (\\q.\\a.\\a.\\a.W (\\o.\\w.n (\\d.\\y.\\m.I)) (f (K (\\e.q)))) (\\x.\\s.\\a.Z)"
    );
  }

  @Test
  public final void test293() {
    reducesTo(
      "i n (\\h.g)",
      "i n (\\h.g)"
    );
  }

  @Test
  public final void test294() {
    reducesTo(
      "(\\s.L (\\e.(\\f.(\\c.(\\q.p) (V N)) T (B (\\f.A) U)) (\\i.o) (o (\\g.(\\q.y) (\\n.(\\k.v) (\\c.d)) ((\\w.r) X ((\\d.y) (\\y.K))))) ((\\x.(\\n.\\t.K H) (\\s.\\f.k j)) z (\\k.(\\g.r) (\\k.q)) (\\n.(\\g.(\\k.p) (\\p.h (U Q) (b o i))) ((\\m.u) S))))) ((\\j.(\\f.(\\k.\\x.\\y.q) (\\h.\\i.\\w.r) a) (C N) (\\q.P)) j (\\d.\\l.\\z.Z)) (\\v.l)",
      "L (\\e.p (B (\\f.A) U) (o (\\g.y (r (y)))) (K H (\\n.p))) (\\v.l)"
    );
  }

  @Test
  public final void test295() {
    reducesTo(
      "\\x.i",
      "\\x.i"
    );
  }

  @Test
  public final void test296() {
    reducesTo(
      "n (t (t (w J)) (\\t.z (W g (\\r.G) p j)))",
      "n (t (t (w J)) (\\t.z (W g (\\r.G) p j)))"
    );
  }

  @Test
  public final void test297() {
    reducesTo(
      "U (\\p.\\h.\\i.\\f.\\k.\\p.\\x.K)",
      "U (\\p.\\h.\\i.\\f.\\k.\\p.\\x.K)"
    );
  }

  @Test
  public final void test298() {
    reducesTo(
      "\\k.(\\c.h) (\\q.\\f.\\v.S)",
      "\\k.h"
    );
  }

  @Test
  public final void test299() {
    reducesTo(
      "\\p.(\\z.D (\\e.\\b.g) Y) (\\b.\\w.(\\e.\\v.\\x.b) (z ((\\l.\\w.k o) (\\u.\\p.p)) ((\\s.S (\\t.t)) h (\\s.\\k.\\l.p (V f) (c s (J b)))) (\\x.\\v.\\w.\\w.\\r.\\m.(\\u.t) ((\\a.t) Z) (\\m.p W W (\\c.\\h.e) (d f (m n) (d A l))))) (s (\\k.\\d.u)) (\\t.\\a.(\\d.\\h.g ((\\v.j) (\\g.d) (\\z.J))) ((\\o.(\\x.w x M) (r (q V))) (\\s.(\\w.D) ((\\u.j) (i z)))) (\\j.(\\w.\\l.a) ((\\r.\\o.\\n.G y (F H) (\\q.\\i.i)) (\\b.r (\\v.h)))) (\\r.\\g.\\a.\\h.\\w.y) (c (\\u.y (k j (Q t)) q) t c)))",
      "\\p.D (\\e.\\b.g) Y"
    );
  }

  @Test
  public final void test300() {
    reducesTo(
      "(\\x.b) (\\s.(\\o.i) y) z",
      "b z"
    );
  }

}
