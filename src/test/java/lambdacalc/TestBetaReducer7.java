package lambdacalc;

import org.junit.Test;

public final class TestBetaReducer7 extends TestBetaReducer {

  @Test
  public final void test0() {
    reducesTo(
      "\\p.d",
      "\\p.d"
    );
  }

  @Test
  public final void test1() {
    reducesTo(
      "\\n.c",
      "\\n.c"
    );
  }

  @Test
  public final void test2() {
    reducesTo(
      "(\\f.\\w.\\z.B) ((\\c.(\\m.(\\r.o (\\i.C)) (\\n.\\x.O)) Z) (\\w.\\z.\\d.\\n.\\k.\\g.(\\t.Q) (W O) (\\h.m) ((\\y.G (r d)) (\\k.i (\\i.n))) (v p)) E (\\a.c)) (e (q (\\y.(\\b.(\\w.q c (\\u.y) (\\t.\\j.\\m.e)) (p (g g (\\f.x))) (r (\\m.u))) (\\l.\\d.T)) l))",
      "\\z.B"
    );
  }

  @Test
  public final void test3() {
    reducesTo(
      "\\l.(\\u.(\\n.l) (\\d.\\d.(\\u.\\k.\\n.b) (\\c.r))) ((\\u.B (\\h.\\w.\\n.g)) i H)",
      "\\l.l"
    );
  }

  @Test
  public final void test4() {
    reducesTo(
      "(\\t.\\x.\\f.(\\u.F) v) ((\\o.(\\k.w u ((\\a.(\\k.\\y.\\l.p) w) (\\y.C))) (\\m.(\\p.(\\l.u) (\\l.\\s.\\s.p)) (l (\\q.(\\p.j) (p l) (\\p.\\j.t I) v)))) (\\i.(\\u.\\v.\\p.r) s (\\l.(\\u.\\y.(\\p.m) (\\m.C s)) (F (h (\\u.f))) y (\\y.(\\g.j Z) (b l))))) t",
      "\\f.F"
    );
  }

  @Test
  public final void test5() {
    reducesTo(
      "\\y.(\\w.\\d.(\\q.D (\\i.\\h.E) (\\k.I)) (\\u.\\w.\\u.h)) E",
      "\\y.\\d.D (\\i.\\h.E) (\\k.I)"
    );
  }

  @Test
  public final void test6() {
    reducesTo(
      "M (\\x.w)",
      "M (\\x.w)"
    );
  }

  @Test
  public final void test7() {
    reducesTo(
      "\\c.b",
      "\\c.b"
    );
  }

  @Test
  public final void test8() {
    reducesTo(
      "\\r.r (a (\\y.(\\w.c) B M ((\\s.r g) (w (s l))) (\\g.(\\y.\\o.(\\p.k) (\\o.a) ((\\e.y) (e q))) c) ((\\x.\\t.(\\r.D v (l p) t) (\\z.(\\d.P) (\\j.S) (\\j.\\z.x))) S))) (x (\\j.O)) (\\h.(\\u.\\k.(\\y.q ((\\y.\\x.\\g.g (\\j.o v)) (\\l.\\t.\\h.O) (\\g.(\\h.f (W j)) n)) l) (\\s.a)) ((\\s.(\\m.\\q.\\q.\\a.\\g.\\k.\\g.s ((\\s.(\\k.\\v.R) i) ((\\b.M) w (\\o.t L)))) (\\f.q)) (d (y u u l) (O (\\j.b d q) ((\\q.(\\j.r) (y j)) (a M (d k)))) q) (\\b.\\r.w)))",
      "\\r.r (a (\\y.c M (r g) (\\g.\\o.k (c)) (\\t.D v (l p) t))) (x (\\j.O)) (\\h.\\k.q (\\g.g (\\j.o v)) l)"
    );
  }

  @Test
  public final void test9() {
    reducesTo(
      "\\u.(\\r.L (\\p.\\v.\\z.\\l.\\f.(\\n.\\c.W ((\\o.\\e.d) (\\n.a))) (\\x.(\\a.\\b.\\p.\\d.e) (\\j.(\\a.f o (f k) (\\x.Q)) (\\w.i (p s (j n)))))) p (\\u.(\\x.q (\\p.(\\b.K v (\\v.K)) (\\h.h g (g o)) (\\y.\\d.J))) (\\y.D) (\\b.\\n.\\w.o) h)) (\\s.y h)",
      "\\u.L (\\p.\\v.\\z.\\l.\\f.\\c.W (\\e.d)) p (\\u.q (\\p.K v (\\v.K) (\\y.\\d.J)) (\\b.\\n.\\w.o) h)"
    );
  }

  @Test
  public final void test10() {
    reducesTo(
      "\\i.\\z.\\u.r",
      "\\i.\\z.\\u.r"
    );
  }

  @Test
  public final void test11() {
    reducesTo(
      "(\\o.\\h.\\n.w ((\\f.(\\w.\\y.\\i.\\a.\\w.(\\l.\\a.w Q) ((\\h.o) ((\\u.\\m.\\o.h) (R S (\\c.E))))) ((\\h.(\\o.\\t.(\\z.l m) T) (\\z.\\e.y r (h Q) y)) (\\o.M P ((\\w.x) R) y))) (q ((\\e.(\\w.\\w.\\c.Z) ((\\v.k) (Q x) (n (\\l.l)))) d))) M) z",
      "\\h.\\n.w (\\y.\\i.\\a.\\w.\\a.w Q) M"
    );
  }

  @Test
  public final void test12() {
    reducesTo(
      "\\e.\\g.(\\q.\\q.R) (\\x.(\\s.(\\d.\\d.o (\\d.\\n.(\\p.\\u.z) (U W (d c))) ((\\j.\\k.\\i.u) J) F) (\\q.\\a.v (n (\\c.o)) (\\e.h ((\\p.B) (\\a.c) x)) (N (\\o.(\\f.l) (C d)) ((\\o.\\f.g o) (a e P)) j))) (b (\\v.\\z.\\v.n (\\d.g)) (\\g.\\z.A t)) (s (\\i.(\\b.(\\h.\\a.f ((\\d.(\\y.V (j P)) (\\e.a)) (g (o x x)))) (\\e.(\\s.\\m.z (\\z.J)) ((\\s.(\\g.\\v.\\j.q) R) ((\\g.S (\\l.k)) (g Q (\\l.z)))))) (\\v.p (\\h.(\\q.\\q.Q V (b N) (\\v.\\p.v)) ((\\s.I) (i M) U) (\\b.\\w.\\k.r))))))",
      "\\e.\\g.\\q.R"
    );
  }

  @Test
  public final void test13() {
    reducesTo(
      "(\\t.y) ((\\e.p (\\n.y) ((\\o.\\l.\\x.\\i.\\j.\\c.\\z.(\\w.t) (d u (\\i.(\\h.a) (R p) (s (t f))))) (\\c.\\f.u) ((\\j.D) ((\\j.\\q.\\d.F (j (w T) (\\f.j C (\\c.Q)))) (x x (\\x.f) ((\\d.d) (t j)) (\\y.(\\e.(\\v.u) z) (\\z.f))))))) (y ((\\v.T) ((\\k.\\w.\\v.\\u.s) D))))",
      "y"
    );
  }

  @Test
  public final void test14() {
    reducesTo(
      "(\\l.(\\g.\\t.z) ((\\a.w N) (\\e.l)) (H h)) ((\\n.b) (\\i.(\\b.Q) z) ((\\p.\\n.\\x.h) (\\s.B (\\g.f))) c (\\v.(\\o.\\j.(\\t.\\r.G (\\r.r X)) (f n (e q) d)) (\\a.(\\x.\\u.n) o)) (h ((\\u.\\v.\\x.b) ((\\e.v) (\\h.\\z.e q))) (\\s.w ((\\v.y s) (\\g.r) (n (\\f.b U (\\g.f)))))) (o (\\f.\\r.(\\d.\\y.(\\s.y i (o P) (\\w.t (H f))) ((\\g.b) (\\u.y) (\\f.\\r.W h)) (\\y.F b (i b) (f (M l)) (h w (d C) (r h (N L))))) ((\\f.n) ((\\e.(\\t.\\c.\\x.N) (n b s)) (l (\\j.s)))))) (\\i.\\h.\\t.r))",
      "z"
    );
  }

  @Test
  public final void test15() {
    reducesTo(
      "\\v.n",
      "\\v.n"
    );
  }

  @Test
  public final void test16() {
    reducesTo(
      "\\y.(\\v.(\\d.(\\k.Z) (\\l.F U (\\l.f) u (\\j.\\v.(\\u.\\e.w) r) ((\\a.\\a.(\\p.\\y.y) (c T (\\w.a))) (\\g.H k f c))) x U) (\\f.\\l.\\p.\\d.c)) w",
      "\\y.Z x U"
    );
  }

  @Test
  public final void test17() {
    reducesTo(
      "(\\g.(\\r.(\\h.(\\c.q) (\\n.l)) (t L (B x))) (\\a.N) ((\\r.(\\j.R) c) (D (\\d.z)) ((\\u.N) b ((\\i.v) k))) ((\\j.y) R ((\\y.F (p k)) (\\v.(\\q.g) (m O))) ((\\j.A) ((\\g.h) (a c (\\g.d))))) (\\d.e) c (l j (\\g.D (\\l.\\i.\\u.\\z.v) ((\\c.(\\b.o) (\\t.Q) (\\s.\\h.\\g.U)) ((\\n.G (\\y.o)) D)) (i ((\\p.T) (\\s.Y) (R w R) (g (h u c))))) ((\\o.w (\\i.d (\\v.j))) (\\j.(\\e.\\r.(\\j.(\\y.o) (\\r.x)) (\\l.z t o) f) ((\\x.\\z.\\e.\\f.(\\t.b) (\\t.L)) (\\e.i q))) (\\p.\\d.E)))) (J ((\\p.\\o.\\z.(\\g.W (\\q.g) (x K)) ((\\h.\\e.(\\t.(\\k.J w) J) (e (\\s.(\\p.B) (H s)))) ((\\v.\\a.S (s s)) t) (\\k.\\i.\\b.\\o.(\\k.(\\k.q) (\\f.f) (\\g.B)) (\\s.\\z.\\i.\\s.q) ((\\z.(\\s.q) (X y) (s (d B))) (K (\\x.g)))))) ((\\f.\\w.b (\\r.(\\f.(\\i.\\q.H) l) (a (\\p.\\h.\\e.\\v.p)))) ((\\o.o (\\l.\\y.\\e.C) d) (\\l.(\\h.d) (\\w.E)) (Y o ((\\v.L f (\\d.k)) ((\\y.h) (\\f.t))) (W (b d (j c) L)))))))",
      "q (R (N (v))) (y (F (p k)) (A)) (\\d.e) c (l j (\\g.D (\\l.\\i.\\u.\\z.v) (o (\\s.\\h.\\g.U)) (i (T (R w R) (g (h u c))))) (w (\\i.d (\\v.j)) (\\p.\\d.E)))"
    );
  }

  @Test
  public final void test18() {
    reducesTo(
      "\\w.(\\l.\\c.\\c.p) k ((\\b.\\r.(\\o.r) (\\c.k) (p ((\\m.p) W j) ((\\o.\\h.(\\c.(\\p.e) (L g) U) (\\i.(\\y.\\g.y w) ((\\n.e) (\\e.t))) (z G ((\\m.v) L) (\\d.(\\p.b V (\\e.p)) O))) (\\x.\\q.\\n.u)))) (\\o.t))",
      "\\w.\\c.p"
    );
  }

  @Test
  public final void test19() {
    reducesTo(
      "\\l.\\q.f",
      "\\l.\\q.f"
    );
  }

  @Test
  public final void test20() {
    reducesTo(
      "\\k.m",
      "\\k.m"
    );
  }

  @Test
  public final void test21() {
    reducesTo(
      "(\\l.\\n.N) q",
      "\\n.N"
    );
  }

  @Test
  public final void test22() {
    reducesTo(
      "\\a.\\u.e",
      "\\a.\\u.e"
    );
  }

  @Test
  public final void test23() {
    reducesTo(
      "\\e.T",
      "\\e.T"
    );
  }

  @Test
  public final void test24() {
    reducesTo(
      "C ((\\c.u ((\\g.\\w.\\d.J) ((\\b.x) (\\j.z) ((\\q.U) (\\h.o)) (\\w.\\u.q))) (z X) ((\\f.n (\\l.e) (\\v.(\\m.Q) (\\w.w) (\\r.\\k.\\t.D)) ((\\b.q) (w n) j (\\x.\\m.(\\y.v) (\\l.x) ((\\s.L) (c p)))) (N (\\r.\\p.\\n.p (\\j.\\r.\\t.o) h))) (Q (\\x.n (\\w.Z)) (x f (\\u.u) (\\m.\\q.\\w.p)) (o g (n J) (\\q.O) (\\i.q)) (\\w.(\\v.\\p.(\\c.A h) (O m (\\z.j))) ((\\v.\\t.\\n.K) ((\\z.L) (\\c.j))) ((\\x.l) (r C) (\\v.f a (\\k.U)) E))))) (\\q.(\\d.\\n.\\f.q (\\p.x j (\\t.\\x.e) ((\\j.\\u.\\d.\\s.\\o.R) T) (p (\\k.L) (\\i.r) (j W (d v) (\\o.(\\z.u) C)) l))) ((\\t.(\\r.(\\x.\\t.\\c.k) (\\y.\\m.v o (v x) (\\f.t n))) (\\f.\\i.\\w.\\g.\\y.(\\i.(\\l.b) h ((\\o.f) (\\e.y))) l) (\\t.q)) ((\\k.\\y.i o) ((\\y.\\m.(\\r.(\\p.f) (\\g.m)) (\\e.(\\k.\\i.F) j)) (\\o.E))))))",
      "C (u (\\w.\\d.J) (z X) (n (\\l.e) (\\v.Q (\\r.\\k.\\t.D)) (q j (\\x2.\\m.v (L))) (N (\\r.\\p.\\n.p (\\j.\\r.\\t.o) h))))"
    );
  }

  @Test
  public final void test25() {
    reducesTo(
      "\\s.k",
      "\\s.k"
    );
  }

  @Test
  public final void test26() {
    reducesTo(
      "(\\a.\\w.(\\w.v (x f)) (\\c.\\y.S s) (\\p.X n (\\j.C) (\\z.\\e.U l)) z U ((\\k.\\b.\\v.\\q.(\\w.Z) (f r) (Z (c A)) k (\\m.\\o.\\z.(\\t.\\e.(\\d.d) (\\d.p)) ((\\u.U u) y))) (\\i.a (\\k.e (\\u.h) m ((\\l.\\g.H) ((\\n.f) (\\f.e)))))) C S) (\\y.\\f.\\d.d)",
      "\\w.v (x f) (\\p.X n (\\j.C) (\\z.\\e.U l)) z U (\\b.\\v.\\q.Z (Z (c A)) (\\i.\\f.\\d.d) (\\m.\\o.\\z.\\e.\\d.p)) C S"
    );
  }

  @Test
  public final void test27() {
    reducesTo(
      "(\\e.U) (\\e.\\r.(\\e.o) (f (B (\\i.\\u.\\z.p (\\w.\\i.(\\z.\\e.(\\y.\\q.a) m) ((\\h.I) l w) ((\\i.X (\\z.T)) r (\\t.g)))))))",
      "U"
    );
  }

  @Test
  public final void test28() {
    reducesTo(
      "\\u.\\b.(\\t.(\\b.(\\j.x) (\\t.s) n (\\v.u) (\\k.\\d.u (\\y.o a s (\\m.I) ((\\s.j P (\\x.s)) (F k (\\b.Z)))))) (\\m.(\\r.b) ((\\i.(\\q.O n w) (b (\\m.c))) (u ((\\a.I) (\\f.n)))) (\\w.s (\\g.\\d.R) (\\n.\\e.(\\g.g) (n k) (S (p l))) v))) (Z (\\x.(\\o.t) ((\\z.(\\m.\\w.w) (\\t.u C o) (\\j.I)) Q))) (\\t.\\d.(\\e.\\k.k y (\\s.\\v.(\\b.\\h.\\d.\\i.(\\s.(\\x.U) H ((\\n.\\k.z) (\\f.\\w.l))) (l ((\\b.(\\d.M) (C e)) (b (k o))))) (\\e.\\j.\\l.y))) (\\k.\\k.o)) (\\f.V)",
      "\\u.\\b.x n (\\v.u) (\\k.\\d.u (\\y.o a s (\\m.I) (j P (\\x.F k (\\b.Z))))) (\\t.\\d.\\k.k y (\\s.\\v.\\h.\\d.\\i.U (\\k.z))) (\\f.V)"
    );
  }

  @Test
  public final void test29() {
    reducesTo(
      "\\r.(\\b.\\c.m (\\q.t)) (\\n.(\\s.y (\\s.\\x.\\m.x I ((\\p.o) (\\u.v)) (\\u.y (\\g.d)))) ((\\v.\\t.x j) (p s (\\n.t)) (\\q.y (\\u.F)) (w ((\\k.(\\y.W) p) (\\d.(\\t.m) (\\j.a)))))) (\\p.X (\\u.(\\w.(\\h.(\\p.Z r) (S (v E))) (d (\\g.a) (\\l.\\r.i x))) E) ((\\l.Z) (\\m.d (q a v) v ((\\c.X (\\k.\\v.i)) (\\j.h))))) ((\\w.\\n.a) ((\\u.\\y.\\w.(\\c.(\\h.(\\x.b) (\\x.m)) (e u (B j)) (\\a.\\y.\\x.w)) B (\\b.(\\o.H) (\\v.\\r.\\w.\\o.N))) ((\\e.\\t.j) (\\r.\\k.E (\\m.(\\n.\\x.l (\\s.\\k.u)) v))))) w",
      "\\r.m (\\q.t) (\\n.a) w"
    );
  }

  @Test
  public final void test30() {
    reducesTo(
      "j r (\\e.t)",
      "j r (\\e.t)"
    );
  }

  @Test
  public final void test31() {
    reducesTo(
      "(\\b.\\k.(\\m.\\t.q) (\\w.O) ((\\l.\\w.(\\f.\\s.c) ((\\z.A) P)) c ((\\s.(\\n.\\v.T) (\\k.\\x.x)) (F (g t (k c)))) ((\\z.\\f.g) (\\m.U) N))) (\\j.(\\o.(\\m.\\f.\\x.i) (\\w.\\c.l Z)) (\\f.g) ((\\m.u) (\\r.p) (S N a) n) (\\t.z H ((\\x.p (L g)) (\\r.\\m.\\g.s)) (\\z.\\e.a)) (\\v.Z)) ((\\a.\\s.Y (M (\\t.e))) (\\w.Z)) (\\g.\\u.\\g.(\\n.(\\x.i) (\\n.f ((\\p.u) ((\\g.\\x.\\h.\\o.m p (\\m.T)) (\\j.\\s.e m (s H) (\\i.S i)) (\\r.i))))) (\\n.w))",
      "q (\\g.\\u.\\g.i)"
    );
  }

  @Test
  public final void test32() {
    reducesTo(
      "(\\d.\\c.\\p.\\g.\\e.(\\m.\\d.\\s.r) (\\v.m)) (g ((\\r.z) ((\\g.\\b.\\k.h) (o p (w r))) (\\k.(\\f.\\a.k) ((\\g.\\o.\\x.Z) (\\x.b (\\c.n)))) (\\x.\\w.C) ((\\d.u) ((\\b.\\y.T) (\\j.(\\f.(\\i.K) v) (X (\\b.e)) a)))) (a (\\v.\\w.\\q.P)))",
      "\\c.\\p.\\g.\\e.\\d.\\s.r"
    );
  }

  @Test
  public final void test33() {
    reducesTo(
      "\\l.(\\a.Q (\\o.(\\i.z (\\f.\\u.\\d.k) (\\h.q)) (F (l (\\t.(\\u.m) (S m))))) (\\k.n (\\x.(\\d.(\\m.i) (\\g.\\d.\\l.S)) (\\p.\\u.\\g.(\\n.e) a ((\\r.H) (\\c.H)))) e) ((\\q.u (S M)) (\\t.x ((\\h.u j (q V)) e (\\z.m)) ((\\o.\\w.k) (\\z.t ((\\y.z) (q O)) (\\r.(\\z.k) (\\l.\\j.\\v.l)))))) p) (\\n.(\\t.(\\y.\\t.o x) d Q) I)",
      "\\l.Q (\\o.z (\\f.\\u.\\d.k) (\\h.q)) (\\k.n (\\x1.i) e) (u (S M)) p"
    );
  }

  @Test
  public final void test34() {
    reducesTo(
      "\\t.(\\l.(\\x.(\\o.(\\a.\\y.(\\v.(\\a.l G) (\\r.k w)) c) (\\e.(\\e.\\o.\\c.l) (\\o.g (K L (\\y.w))))) s) (\\g.(\\w.(\\u.v) (c D)) (c n (\\e.q)) (\\o.\\t.\\w.(\\z.t) (\\a.\\e.P)) ((\\e.m) (\\a.D) (H I (Y t)) ((\\y.T I (r m)) q)) (c (\\m.\\v.(\\u.\\y.E r) (e v (c K)) H))) ((\\g.S) K) ((\\y.M) ((\\d.(\\l.\\s.k) k) ((\\o.s) (\\j.y) (\\h.\\x.\\b.t) ((\\o.k) (\\b.z) (\\g.e (h v))))) ((\\k.\\t.Y) (\\c.\\a.\\r.K) C) C)) (\\s.(\\n.\\z.c) C)",
      "\\t.c"
    );
  }

  @Test
  public final void test35() {
    reducesTo(
      "(\\z.y (\\k.\\a.\\g.o (\\j.\\x.(\\l.(\\o.(\\p.x A) (e y P)) (\\v.i)) (\\i.y d x (\\e.\\g.n) L)))) U (\\i.\\c.q) (z (\\i.\\f.g (D ((\\l.x (\\q.\\z.d P) ((\\x.\\x.S p) x) (O l (J (\\s.O) (\\w.v)))) w))))",
      "y (\\k.\\a.\\g.o (\\j.\\x.x A)) (\\i.\\c.q) (z (\\i.\\f.g (D (x (\\q.\\z.d P) (\\x.S p) (O w (J (\\s.O) (\\w.v)))))))"
    );
  }

  @Test
  public final void test36() {
    reducesTo(
      "(\\r.\\t.\\k.\\j.\\r.a) (\\n.\\z.b)",
      "\\t.\\k.\\j.\\r.a"
    );
  }

  @Test
  public final void test37() {
    reducesTo(
      "\\z.t (n (\\e.\\w.\\d.(\\s.\\i.t) ((\\p.\\y.p) (\\f.(\\v.(\\i.\\q.\\t.u) q) (W (o E) (B (\\m.l))) (i (g (V u) (\\h.\\e.j Z))) (\\f.o)))))",
      "\\z.t (n (\\e.\\w.\\d.\\i.t))"
    );
  }

  @Test
  public final void test38() {
    reducesTo(
      "(\\i.a) g (\\t.\\a.\\a.\\d.(\\r.I) ((\\o.\\c.I h ((\\o.(\\m.k ((\\c.y) (\\s.H))) (\\f.l a (r g) y)) (\\i.q g d g ((\\f.\\v.\\b.h) (\\l.\\h.U m)))) t) (\\j.(\\x.(\\l.\\o.(\\z.\\t.\\y.\\w.M) Q) p) s)))",
      "a (\\t.\\a.\\a.\\d.I)"
    );
  }

  @Test
  public final void test39() {
    reducesTo(
      "\\z.(\\k.\\s.a (\\r.(\\y.R (\\h.\\z.k l) (o (\\s.x)) q) (o (\\n.(\\t.w) (\\n.e) ((\\e.C) (\\g.m))) (\\j.(\\w.b) ((\\i.(\\z.X) (\\h.Y)) (r (\\h.T))))) ((\\i.(\\l.E) ((\\k.v (\\z.h) (q (S n))) i)) x)) ((\\l.y) (\\y.C (B (\\t.e D (k V)) r) ((\\o.(\\w.(\\v.m) (s J)) (\\a.P (w a))) (\\p.\\t.\\w.j (E f) (Z (\\a.p))) (\\a.y (\\b.\\j.t)))) (\\d.\\f.\\y.d n))) O",
      "\\z.\\s.a (\\r.R (\\h.\\z.O l) (o (\\s.x)) q (E)) (y (\\d.\\f.\\y.d n))"
    );
  }

  @Test
  public final void test40() {
    reducesTo(
      "\\c.t",
      "\\c.t"
    );
  }

  @Test
  public final void test41() {
    reducesTo(
      "\\c.k",
      "\\c.k"
    );
  }

  @Test
  public final void test42() {
    reducesTo(
      "\\r.(\\c.\\z.N) (\\t.(\\q.\\k.x) ((\\m.(\\n.\\x.\\w.(\\p.O) (\\l.h) (\\x.e b (I y)) a) (\\h.n d (\\q.s) s (\\u.\\u.\\f.y))) v (\\h.(\\d.b v (\\m.p) (\\d.e O (\\h.u))) ((\\z.\\a.p p) w) (\\l.\\a.f) (e ((\\o.c) (\\x.e k (\\u.Y))) (f (k j (\\r.t) l))))) r)",
      "\\r.\\z.N"
    );
  }

  @Test
  public final void test43() {
    reducesTo(
      "v ((\\y.\\t.\\w.u) ((\\x.o) (\\i.\\m.\\f.\\f.(\\j.\\p.T) m) (\\t.\\l.t) (M (\\q.\\k.K) i)))",
      "v (\\t.\\w.u)"
    );
  }

  @Test
  public final void test44() {
    reducesTo(
      "\\l.\\f.M",
      "\\l.\\f.M"
    );
  }

  @Test
  public final void test45() {
    reducesTo(
      "\\e.\\k.F ((\\k.g ((\\f.(\\d.(\\g.J) (P B)) (\\g.\\c.e y) ((\\s.y) (P l) J) (\\k.(\\n.u k (\\u.u) (p Y (\\h.f))) (f ((\\m.d) (\\i.J))))) ((\\f.(\\v.(\\n.b) (\\r.o)) (b v (\\g.B))) (\\i.J) (o (\\j.\\g.\\t.F))))) j ((\\p.m (\\b.T (I ((\\r.v) (L h)) (f ((\\f.d) (k b))))) ((\\h.\\i.(\\t.h G (\\y.r) (E (\\a.j))) (W U) (q x (E n) y D)) ((\\o.b) (\\x.(\\i.p E (u x) i) (d (n j) (u x (O n))))))) (\\n.(\\e.\\c.\\g.X ((\\e.f ((\\c.f) (W Y))) (\\c.\\t.\\k.\\z.Z (e o))) (w ((\\q.(\\j.\\q.J K) (n J (\\v.o))) (G ((\\e.R) (y z)))))) (\\w.(\\k.(\\s.(\\e.U (X (\\a.d))) (\\j.(\\x.t n) e)) (k p Q (m f (l P)) D)) (\\m.X)))))",
      "\\e.\\k.F (g (J (y J) (\\k.u k (\\u.u) (p Y (\\h.b (o (\\j.\\g.\\t.F)))))) (m (\\b.T (I (v) (f (d)))) (\\i.b G (\\y.r) (E (\\a.j)) (q x (E n) y D))))"
    );
  }

  @Test
  public final void test46() {
    reducesTo(
      "(\\p.(\\u.(\\q.(\\l.\\z.(\\p.H) (\\q.\\q.\\m.\\p.\\u.\\k.(\\t.Z (\\q.y)) (w (u (b P))))) (\\p.M)) (S m (L (\\y.(\\y.m) (\\u.c) (\\f.(\\y.B) (\\w.S))) ((\\p.(\\j.m P (\\h.i)) E) (s x (N p) (\\k.L e (\\g.D))))))) ((\\e.k) (\\e.\\c.\\l.(\\t.E (\\g.b) v (\\w.\\q.O)) (v (a (\\z.o S J)))) ((\\i.H m e ((\\l.a) n) ((\\c.O) (f S) (\\v.\\k.Z))) g (\\d.\\n.\\d.\\w.E))) (f ((\\q.(\\g.v (l Z (q J)) (\\c.V f ((\\m.L) X))) (C ((\\n.l) (\\u.(\\m.f) F))) (\\w.(\\x.y ((\\t.Y) (e a)) (f (\\r.T))) s)) ((\\q.(\\o.(\\p.\\m.u x) (a b (\\z.v) ((\\f.T) (z p)))) ((\\m.N n (K x f)) t)) (B (\\n.V)))))) (\\a.\\h.i)",
      "H"
    );
  }

  @Test
  public final void test47() {
    reducesTo(
      "\\f.\\p.t ((\\m.u) Q) (\\t.(\\s.o) ((\\e.k (\\b.f B (r B))) (\\y.i)) (b (j ((\\z.e) (K M) i))) ((\\p.(\\x.\\y.\\j.(\\l.T) (\\k.J)) (\\v.\\c.k (\\k.\\t.H))) (\\n.\\f.J) (t h o (\\r.\\p.A v) (\\k.\\h.\\l.J i) (O c (T E) (\\f.(\\j.w) (\\v.T)) (\\a.f))))) K (\\o.\\n.q ((\\d.(\\e.(\\w.(\\d.(\\d.q n (\\v.r)) (\\j.j O (u A))) (\\d.\\j.(\\i.\\n.K) i)) ((\\u.r M (\\e.k)) (\\b.j g) c) (\\i.(\\g.\\c.P S) (\\i.N o (\\i.b)) (\\i.\\x.q U (L v) (\\l.x)) (W H (x v) (\\b.\\h.\\d.i) (\\x.a V (c r) s)))) (\\a.(\\t.\\g.(\\t.X) (o c) N (\\y.n) (\\j.i q)) (x (f ((\\t.W) (\\l.b))) (T (\\n.(\\n.v n P) (\\g.Z c (J v))))))) ((\\s.\\m.(\\y.l m (S n) (q (\\o.m)) z) (w I (z k) (\\x.\\h.\\e.f) ((\\e.(\\c.r) (\\c.N)) (\\a.\\g.q G)))) ((\\m.\\b.m) ((\\h.k) o)) ((\\e.H J (\\l.n)) (g g (\\n.R)) (x (S (n o))) Q (\\x.R (\\p.H) (\\n.(\\w.s A (\\z.S)) (r (\\x.o)) z))))))",
      "\\f.\\p.t (u) (\\t.o (b (j (e i))) (\\j.T)) K (\\o.\\n.q (q n (\\v.r) (\\i.P S (W H (x v) (\\b.\\h.\\d.i) (\\x.a V (c r) s)))))"
    );
  }

  @Test
  public final void test48() {
    reducesTo(
      "(\\f.e (\\b.p) (\\y.l)) (b (\\p.\\r.\\d.V h))",
      "e (\\b.p) (\\y.l)"
    );
  }

  @Test
  public final void test49() {
    reducesTo(
      "\\v.b",
      "\\v.b"
    );
  }

  @Test
  public final void test50() {
    reducesTo(
      "f ((\\p.(\\b.\\p.f k) (\\m.H (\\p.l))) (\\s.G) ((\\d.\\h.e) (\\e.\\f.o q) e) ((\\n.\\s.v) M)) (\\b.b (Z f (\\g.x))) (\\a.(\\m.r (\\l.B)) (\\v.\\a.s (K (\\i.D)) (\\t.g) (\\v.\\h.\\r.Z (K (\\w.a)))) G v) ((\\w.(\\e.Y) (e D) (n (\\e.S)) (A a) (\\g.(\\l.e g (x h) j) l) (\\k.\\s.\\x.\\c.(\\x.f) X (\\o.(\\u.\\r.\\c.e) ((\\y.a) (\\b.v)) (\\i.M)))) (U u (\\p.\\r.F) x) (\\n.u) ((\\p.(\\o.\\o.k ((\\k.(\\e.z) j) (\\r.\\a.v))) ((\\e.\\k.f) (\\n.\\l.O))) (\\r.\\t.(\\a.s) (\\c.k)) ((\\n.(\\u.(\\v.\\k.x) ((\\q.c) (J Y)) (\\o.R)) ((\\a.w e (k T) p) (\\a.\\z.(\\n.z) (\\s.Y d)))) (\\x.\\j.k) e)))",
      "f (f k (\\s.v)) (\\b.b (Z f (\\g.x))) (\\a.r (\\l.B) G v) (Y (n (\\e.S)) (A a) (\\g.e g (x h) j) (\\k.\\s.\\x.\\c.f (\\o.\\c.e)) (\\n.u) (k (z)))"
    );
  }

  @Test
  public final void test51() {
    reducesTo(
      "(\\i.g) (\\n.\\i.R (a ((\\b.\\t.y) (b W S))) ((\\y.(\\x.r) q k) (\\b.\\k.\\j.(\\j.u) ((\\a.K) (\\p.U))) (\\s.o (\\w.G))) (\\u.\\h.(\\g.\\a.(\\v.(\\p.D) ((\\k.m y (E v)) a)) j) ((\\k.D (\\x.l (\\s.n))) (\\y.n H (\\y.B) b) ((\\f.\\f.\\a.(\\u.U) (b o) J) ((\\g.b) (\\n.F) (\\e.(\\j.g) N))))) ((\\d.(\\o.\\v.h ((\\i.S a (H u)) (f (k l)))) (\\o.\\j.\\c.E) b) (\\d.A (\\k.f) ((\\e.\\h.\\g.\\t.\\e.\\v.\\n.e) (\\k.b) (\\v.\\b.L))))) ((\\u.\\m.\\u.(\\y.p) (\\o.K (\\b.\\x.(\\g.(\\m.d) (\\l.V (l F)) (\\c.a (\\h.e) ((\\o.c) (i t)))) ((\\j.(\\i.i) a) A)) ((\\b.L) ((\\b.Y) e)))) (\\h.(\\y.\\a.(\\h.\\h.\\j.(\\e.x t (\\u.\\o.(\\e.h) (\\x.q) (\\f.e j))) (\\e.A (\\m.C) ((\\t.a) (H r)) x)) (\\j.\\k.\\t.(\\i.(\\z.(\\j.\\a.V) (O z (g t))) (\\r.(\\m.c) (\\s.c) (\\r.A))) (m (\\s.l))) k) ((\\g.c) ((\\i.\\g.(\\h.\\m.\\y.\\e.\\p.(\\g.d m x) (q a)) ((\\g.\\b.q J) (\\w.\\w.l o) W)) l))))",
      "g (\\m.\\u.p)"
    );
  }

  @Test
  public final void test52() {
    reducesTo(
      "(\\c.M ((\\r.\\l.B) (\\m.c C Q))) (e (\\d.m)) (\\b.(\\i.\\j.\\l.\\f.h (\\q.\\m.K)) r)",
      "M (\\l.B) (\\b.\\j.\\l.\\f.h (\\q.\\m.K))"
    );
  }

  @Test
  public final void test53() {
    reducesTo(
      "(\\f.l) ((\\u.n) (\\e.t (\\r.(\\s.E (\\q.V m x)) ((\\s.f) (M u) (\\k.\\t.q)) (\\n.\\r.Z U ((\\u.z) (\\s.w (j i))))))) J (\\q.\\k.b)",
      "l J (\\q.\\k.b)"
    );
  }

  @Test
  public final void test54() {
    reducesTo(
      "\\i.X",
      "\\i.X"
    );
  }

  @Test
  public final void test55() {
    reducesTo(
      "\\m.n",
      "\\m.n"
    );
  }

  @Test
  public final void test56() {
    reducesTo(
      "(\\n.h (a (\\r.\\a.\\z.Z) ((\\d.\\o.S) ((\\v.\\x.I) ((\\k.z) (\\m.G) (\\q.z W (c U)))) y l))) (\\n.b)",
      "h (a (\\r.\\a.\\z.Z) (S l))"
    );
  }

  @Test
  public final void test57() {
    reducesTo(
      "\\c.A (\\l.(\\n.(\\i.m ((\\u.(\\m.(\\n.c) (\\q.O)) (e o (\\x.l))) (X ((\\s.m) (S S))))) d k) (\\k.(\\g.x (\\k.\\t.\\h.\\e.u)) (h (o (\\e.Z))) (\\r.(\\u.y y) a) (\\v.y)) ((\\h.v z) g (M (\\u.o (\\d.l (w u (\\g.f)) ((\\l.(\\h.X) (e Q)) (\\o.\\s.b))))) (\\v.(\\y.k (\\k.y)) (\\c.\\n.(\\e.K (r e)) (k l) S ((\\y.y) (\\c.a (\\e.A (\\q.x))))) (\\n.(\\r.\\q.\\h.t ((\\g.\\h.\\p.c q (g g)) ((\\c.u) (l a) (\\a.U)))) ((\\w.\\c.\\w.l) (\\b.(\\b.\\h.G) (\\n.\\x.\\i.\\a.I (d s))))))))",
      "\\c.A (\\l.m (c) k (v z (M (\\u.o (\\d.l (w u (\\g.f)) (X)))) (\\v.k (\\k1.\\c.\\n.K (r (k l)) S (\\c.a (\\e.A (\\q.x)))) (\\n.\\q.\\h.t (\\h.\\p.c q (u (\\a.U) (u (\\a.U))))))))"
    );
  }

  @Test
  public final void test58() {
    reducesTo(
      "c (\\l.n)",
      "c (\\l.n)"
    );
  }

  @Test
  public final void test59() {
    reducesTo(
      "(\\k.\\k.\\l.\\h.H) ((\\f.(\\d.(\\j.\\t.\\v.F) C ((\\i.\\p.\\s.b) ((\\w.X) (d l)))) (\\j.\\e.\\s.s x (o b) (\\t.(\\p.c) (c M)) (\\e.\\s.\\h.\\e.s)) (l z ((\\p.(\\i.P) n) (q (t o) c))) ((\\t.(\\l.d) p) (\\g.(\\b.V) (\\k.e)) (M F) (W ((\\q.(\\z.b) (S r)) ((\\v.w) h))) (\\w.\\p.\\m.(\\v.\\z.\\w.O) ((\\p.B) (s t) (\\t.g) ((\\a.\\k.y) (\\s.\\l.h X)))))) Z ((\\p.Z (\\g.i)) L))",
      "\\k.\\l.\\h.H"
    );
  }

  @Test
  public final void test60() {
    reducesTo(
      "\\a.\\y.(\\b.(\\o.\\g.(\\t.\\p.\\v.(\\x.p ((\\d.b) (\\h.z) G) t) A) (c (\\q.\\u.\\b.\\h.b) ((\\z.\\y.\\c.(\\u.\\q.D) (\\m.k (p C) (\\e.G X))) ((\\f.(\\e.\\j.\\p.o) (\\q.(\\l.a) (\\v.x))) (s x o (\\x.w))))) (\\o.\\p.f ((\\r.\\f.\\k.\\s.\\r.\\k.Z E (\\v.h)) ((\\l.U ((\\p.\\z.\\f.N) (\\c.h j (a t)))) b)))) w) (\\v.l)",
      "\\a.\\y.\\g.\\v.f (\\f.\\k.\\s.\\r.\\k.Z E (\\v.h))"
    );
  }

  @Test
  public final void test61() {
    reducesTo(
      "\\q.(\\s.e (\\j.h)) (\\e.\\q.(\\y.\\n.(\\v.\\f.z) (\\p.\\s.\\h.Y)) (\\n.(\\v.b) v) ((\\u.\\s.(\\n.\\k.(\\e.j) ((\\p.\\z.\\j.P) (\\b.N (\\a.t)))) (\\d.\\f.(\\a.y) (\\d.\\y.\\h.\\x.i l (S i)))) ((\\y.\\r.(\\f.(\\h.\\c.J) ((\\t.n) (u O))) (E a (\\m.n) (\\t.(\\r.l) (C H)))) t)) (\\l.\\l.(\\r.\\p.g) ((\\p.(\\s.(\\b.\\r.\\w.K) y) (y g)) M) (V ((\\t.s g (m b)) (n i (O F))) (\\q.r) (\\r.b))) J)",
      "\\q.e (\\j.h)"
    );
  }

  @Test
  public final void test62() {
    reducesTo(
      "\\p.(\\f.a) ((\\j.\\o.d) ((\\v.x b) (p (\\r.q (\\u.U)))))",
      "\\p.a"
    );
  }

  @Test
  public final void test63() {
    reducesTo(
      "\\z.n",
      "\\z.n"
    );
  }

  @Test
  public final void test64() {
    reducesTo(
      "\\z.\\p.\\l.\\i.\\c.(\\y.z) ((\\g.c (q ((\\c.\\u.T ((\\j.c) (T V) ((\\f.t) (Z c)))) ((\\l.\\b.r) (j w (V R)) ((\\a.o) (\\j.(\\d.x) (\\r.m))))) H)) (f ((\\a.\\y.w) (\\x.(\\i.(\\z.\\r.N h) J) q) (\\t.\\j.\\z.(\\k.(\\i.\\b.g (j e (\\j.y))) ((\\n.n) (\\h.w) ((\\y.u) (\\x.k)))) Z) (U (\\g.(\\b.v) (\\z.V) (t t (Z j)) (O (\\k.n))) T))))",
      "\\z.\\p.\\l.\\i.\\c.z"
    );
  }

  @Test
  public final void test65() {
    reducesTo(
      "\\y.\\d.u z",
      "\\y.\\d.u z"
    );
  }

  @Test
  public final void test66() {
    reducesTo(
      "(\\i.(\\r.j) (\\b.(\\x.\\g.(\\b.\\l.t) (\\h.\\s.\\z.(\\e.\\l.O x (n h) (b c (\\z.d))) ((\\s.(\\i.Z) (f r)) (x t f)) (g (w (o H)) K))) (\\j.G (X (q (\\l.\\h.k r))) k))) (M (\\c.r ((\\d.v) ((\\b.\\n.P) (\\q.(\\g.b) (r r) (\\k.\\g.G p)))) k)) (a (\\x.\\g.r))",
      "j (a (\\x.\\g.r))"
    );
  }

  @Test
  public final void test67() {
    reducesTo(
      "y (G ((\\v.(\\z.\\z.o) (\\i.Y r (H G) n ((\\u.c) ((\\i.J) q))) (\\b.\\z.\\p.\\w.F ((\\a.K v) l))) p) (\\a.\\k.J O))",
      "y (G (o) (\\a.\\k.J O))"
    );
  }

  @Test
  public final void test68() {
    reducesTo(
      "O (\\f.\\b.(\\g.\\h.(\\a.\\b.\\m.f ((\\c.w (v l ((\\s.m) ((\\v.W) (d n))))) (\\u.(\\i.\\o.\\h.\\h.\\w.\\s.B) q (\\m.d)))) (\\n.l)) ((\\y.\\b.\\m.d (\\m.d) n) (\\q.a (\\d.x (\\u.\\c.m (\\g.C k (\\j.z) (\\y.\\w.l))) (\\i.\\k.\\h.t (k y))))))",
      "O (\\f.\\b.\\h.\\b.\\m.f (w (v l (m))))"
    );
  }

  @Test
  public final void test69() {
    reducesTo(
      "\\x.h ((\\q.s) (\\t.s)) (c (\\z.\\h.v))",
      "\\x.h (s) (c (\\z.\\h.v))"
    );
  }

  @Test
  public final void test70() {
    reducesTo(
      "(\\z.f) A",
      "f"
    );
  }

  @Test
  public final void test71() {
    reducesTo(
      "i ((\\a.m) (\\x.(\\u.\\i.(\\l.h (\\b.R) (H ((\\r.o) (\\e.C) o))) (\\p.\\x.\\s.(\\c.(\\e.\\k.\\n.U) (\\e.y) m) (x (\\i.(\\d.r) (\\l.H) (\\s.m p))))) t) ((\\e.\\y.y o ((\\f.o) ((\\u.h) ((\\y.\\i.\\f.m (\\x.s) (\\t.\\j.x)) (\\j.\\t.(\\s.u e) (B B (I k))))))) (\\r.\\a.(\\z.\\i.\\m.\\v.B ((\\w.\\g.\\j.j (O A (\\j.O))) c) (\\u.\\c.\\o.\\d.c ((\\t.(\\r.\\h.f) ((\\n.d) (\\u.I))) (\\j.(\\t.M s) (d P M))))) (\\u.\\q.v))))",
      "i (m (\\y.y o (o)))"
    );
  }

  @Test
  public final void test72() {
    reducesTo(
      "(\\u.t) (\\r.h)",
      "t"
    );
  }

  @Test
  public final void test73() {
    reducesTo(
      "\\k.\\i.M (u e) ((\\c.(\\x.\\w.w) t) (\\b.(\\e.(\\n.\\w.H) (\\q.\\y.(\\t.R) (B (\\o.y) s))) (e (\\z.v))) (\\b.(\\n.\\n.u F U (\\i.\\j.s)) ((\\e.\\m.r) (F E (v y))) (\\k.\\y.(\\m.f) (\\r.g)) M (\\v.O))) P",
      "\\k.\\i.M (u e) (\\b.u F U (\\i.\\j.s) M (\\v.O)) P"
    );
  }

  @Test
  public final void test74() {
    reducesTo(
      "e (\\f.(\\a.\\o.(\\p.T (K S) (\\s.\\i.m s) T) (d ((\\q.r) (A e)) (z I (\\r.c) (F A d))) (\\p.\\e.h) ((\\j.(\\e.q) (N V q ((\\x.a) c))) j ((\\p.\\t.I) (\\y.W))) w) (\\v.\\w.\\h.n))",
      "e (\\f.\\o.T (K S) (\\s.\\i.m s) T (\\p.\\e.h) (q (\\t.I)) w)"
    );
  }

  @Test
  public final void test75() {
    reducesTo(
      "(\\h.y) ((\\d.\\l.\\v.\\i.\\u.\\o.W) p (\\g.R))",
      "y"
    );
  }

  @Test
  public final void test76() {
    reducesTo(
      "\\x.\\m.(\\h.(\\s.(\\z.\\m.\\e.s ((\\f.r) (Y a) (z M))) O) (Y q) j) (l v) (x (\\s.R)) F",
      "\\x.\\m.Y q (r (O M)) F"
    );
  }

  @Test
  public final void test77() {
    reducesTo(
      "\\e.\\p.z",
      "\\e.\\p.z"
    );
  }

  @Test
  public final void test78() {
    reducesTo(
      "(\\c.(\\t.K) K) (I ((\\e.B) f) ((\\h.(\\z.V) (\\s.X)) (n W (w g))) B) (m ((\\q.\\k.k v) (\\d.\\l.Y x) (\\h.Z) (U q (\\x.y) (\\e.\\x.F q) (\\h.o)))) c ((\\i.(\\c.\\h.\\u.\\k.\\d.\\u.(\\s.(\\l.g) ((\\n.\\z.r) A)) (\\c.(\\s.I ((\\v.w) f)) (d (\\f.\\w.f))) E) (\\n.\\g.g (\\c.\\h.\\n.K (B r (\\l.N) t ((\\z.(\\p.E) (k y)) (\\c.\\s.B)))))) (w ((\\s.\\b.B) (i f (\\q.A) ((\\h.y) (f d)) (L M (\\o.b) (k z (F u)))) (\\o.v)))) (z ((\\n.\\g.(\\g.p ((\\v.\\s.\\o.m) (\\o.g))) (z ((\\a.(\\o.u) (\\g.q)) k (\\y.\\m.l)))) u) ((\\k.r) n (\\y.\\x.h) i))",
      "K (m (Z (U q (\\x.y) (\\e.\\x.F q) (\\h.o)))) c (\\h.\\u.\\k.\\d.\\u.g E) (z (\\g.p (\\s.\\o.m)) (r (\\y.\\x.h) i))"
    );
  }

  @Test
  public final void test79() {
    reducesTo(
      "(\\l.\\l.(\\l.i) e) u ((\\u.(\\q.m) (\\y.U o)) (\\l.\\r.(\\o.\\l.X) ((\\n.\\j.(\\o.\\m.\\p.M) (u d (u r)) w) (\\c.\\c.\\z.K) v ((\\c.\\k.x (\\o.\\g.S)) (\\o.\\m.\\e.\\x.\\d.\\y.t)))))",
      "i"
    );
  }

  @Test
  public final void test80() {
    reducesTo(
      "(\\a.l (X l ((\\b.\\r.\\v.(\\v.(\\l.p) c) (x m) (\\v.\\d.\\q.r (V r))) (\\x.\\p.(\\x.(\\o.c) o) d)) ((\\i.f) ((\\e.N a z (v k (R s))) g) (\\c.\\w.\\s.\\e.(\\j.(\\t.(\\q.\\i.l) (l G (\\f.x))) ((\\x.z) j (\\z.i t))) (\\t.X)))) g) (\\b.r)",
      "l (X l (\\r.\\v.p (\\v.\\d.\\q.r (V r))) (f (\\c.\\w.\\s.\\e.\\i.l))) g"
    );
  }

  @Test
  public final void test81() {
    reducesTo(
      "\\q.(\\h.h (w ((\\q.(\\h.X D) ((\\b.(\\l.t) t (\\b.\\h.\\l.(\\g.c) (C w) (\\b.k))) (\\x.E ((\\q.G) (x b)) (d (\\z.L u (\\p.H)))))) (O (Z (\\w.q p W G)) (x (\\i.\\m.e)))))) n",
      "\\q.n (w (X D))"
    );
  }

  @Test
  public final void test82() {
    reducesTo(
      "X (\\p.\\q.a (\\p.r ((\\m.\\h.h) (\\q.\\t.(\\b.\\d.l) (\\d.s)) (e (\\t.(\\x.h) (\\l.e)) ((\\j.e) J W) (f ((\\a.a) ((\\g.r) (R U)))))) (z (\\s.\\u.\\f.y z))))",
      "X (\\p.\\q.a (\\p.r (e (\\t.h) (e W) (f (r))) (z (\\s.\\u.\\f.y z))))"
    );
  }

  @Test
  public final void test83() {
    reducesTo(
      "(\\q.t ((\\e.\\i.\\r.I) (z J p (\\b.d)))) (\\x.\\h.\\e.\\x.E) (\\i.(\\t.k (\\f.l z) (F ((\\c.o) A) (a (z d (\\k.p)))) y (\\q.\\a.(\\s.\\y.\\v.b) ((\\e.(\\c.\\r.\\f.l) (\\t.a)) (\\k.j m (\\x.w) (k K (\\d.X)))) (L (x (\\w.(\\h.N) (T q))) ((\\o.a) (\\l.(\\u.Z F (\\a.o)) (c (f n))))))) (H ((\\s.S) (J A) (k a)) (b (\\h.F ((\\j.w) N ((\\e.c) (i e))) (r ((\\j.R) Q)))))) (\\a.\\s.(\\i.r) ((\\y.p) (\\t.(\\q.\\o.d) (c (\\a.O (\\c.(\\f.q) M (\\j.(\\s.E) (\\p.s)))) (\\s.g (f d) (m b (H E)) (m (\\p.V) V) (p (\\z.(\\q.f) (\\y.X) (D v (\\w.i)))))))))",
      "t (\\i.\\r.I) (\\i.k (\\f.l z) (F (o) (a (z d (\\k.p)))) y (\\q.\\a.\\v.b)) (\\a.\\s.r)"
    );
  }

  @Test
  public final void test84() {
    reducesTo(
      "\\f.W (V ((\\h.\\f.\\b.\\t.\\h.r) j h))",
      "\\f.W (V (\\b.\\t.\\h.r))"
    );
  }

  @Test
  public final void test85() {
    reducesTo(
      "\\y.m K (\\i.(\\y.P X) g)",
      "\\y.m K (\\i.P X)"
    );
  }

  @Test
  public final void test86() {
    reducesTo(
      "\\t.\\o.(\\g.\\n.X) ((\\k.c) ((\\t.\\m.h) ((\\v.e) (l A))) (U (m (\\p.a x (\\r.h)))) (I (t ((\\g.B) (h d))) (\\r.\\l.\\d.N))) ((\\l.i) ((\\p.e (\\k.\\n.(\\r.\\w.v) (\\r.z v))) (\\q.y s ((\\j.a) P) (q (\\n.c) ((\\t.G) (\\o.h))))) (\\u.\\w.(\\g.\\s.(\\w.\\r.\\q.\\b.(\\t.I) ((\\p.\\m.W) (\\j.a i))) K) (n p R))) (s (H (\\c.\\p.\\p.V) U) (y (\\x.v))) (\\k.s)",
      "\\t.\\o.X (s (H (\\c.\\p.\\p.V) U) (y (\\x.v))) (\\k.s)"
    );
  }

  @Test
  public final void test87() {
    reducesTo(
      "(\\m.e) ((\\l.i) r)",
      "e"
    );
  }

  @Test
  public final void test88() {
    reducesTo(
      "e ((\\b.R) (\\z.i) h y)",
      "e (R h y)"
    );
  }

  @Test
  public final void test89() {
    reducesTo(
      "\\u.C",
      "\\u.C"
    );
  }

  @Test
  public final void test90() {
    reducesTo(
      "\\r.a",
      "\\r.a"
    );
  }

  @Test
  public final void test91() {
    reducesTo(
      "\\r.(\\c.l) O r",
      "\\r.l r"
    );
  }

  @Test
  public final void test92() {
    reducesTo(
      "\\n.(\\v.b (\\b.(\\z.Q) (\\g.s (R C) (y a (g z))) (\\g.\\q.N))) (v v) Y (\\w.\\w.a (\\u.A (\\n.b))) (\\h.\\e.\\d.(\\y.f) (\\b.y))",
      "\\n.b (\\b.Q (\\g.\\q.N)) Y (\\w.\\w.a (\\u.A (\\n.b))) (\\h.\\e.\\d.f)"
    );
  }

  @Test
  public final void test93() {
    reducesTo(
      "\\h.U ((\\z.\\k.l (\\b.\\b.\\h.\\l.o (\\o.(\\w.U y (\\r.l) (M J (\\y.k))) L)) ((\\r.\\p.z) ((\\t.W) (n Y) o d (\\q.k))) (r (\\n.\\m.(\\v.\\e.b g ((\\x.q) (G r))) f ((\\f.M) M) ((\\t.\\t.(\\h.h) (o A) (\\x.t)) ((\\k.\\t.I u) A) d)))) U)",
      "\\h.U (\\k.l (\\b.\\b.\\h.\\l.o (\\o.U y (\\r.l) (M J (\\y.k)))) (\\p.U) (r (\\n.\\m.b g (q) (o A (\\x.d)))))"
    );
  }

  @Test
  public final void test94() {
    reducesTo(
      "i (j G) (\\p.t) U",
      "i (j G) (\\p.t) U"
    );
  }

  @Test
  public final void test95() {
    reducesTo(
      "\\z.n",
      "\\z.n"
    );
  }

  @Test
  public final void test96() {
    reducesTo(
      "\\q.Q",
      "\\q.Q"
    );
  }

  @Test
  public final void test97() {
    reducesTo(
      "y (\\a.\\k.(\\g.\\q.(\\e.\\u.\\s.(\\z.\\l.\\y.F) U ((\\l.k) (\\e.\\z.H g))) (\\a.\\c.\\v.\\x.\\n.(\\r.U) (\\p.\\q.\\n.w (g P))) y (\\l.e ((\\t.a) ((\\h.(\\c.\\p.\\z.Z) ((\\g.x) (D j))) z))) d) (\\z.q))",
      "y (\\a.\\k.\\q1.F)"
    );
  }

  @Test
  public final void test98() {
    reducesTo(
      "\\e.d (a (\\z.K r)) (\\o.(\\d.G) x) k",
      "\\e.d (a (\\z.K r)) (\\o.G) k"
    );
  }

  @Test
  public final void test99() {
    reducesTo(
      "\\p.\\a.\\f.(\\o.s ((\\n.\\u.U ((\\k.O Z (\\c.e) (\\c.d h (\\b.S))) o (\\d.(\\n.\\v.a) (\\l.\\q.\\y.B L (s p) (\\q.c))))) (\\h.\\u.(\\w.\\a.\\g.(\\w.\\s.\\h.\\y.(\\p.H (\\a.n)) (\\p.M)) (g E f)) (t (w ((\\r.w) (d Q))) (\\j.s))) z)) (\\o.(\\j.\\v.\\d.\\h.\\g.G) N)",
      "\\p.\\a.\\f.s (U (O Z (\\c.e) (\\c.d h (\\b.S)) (\\d.\\v.a)))"
    );
  }

  @Test
  public final void test100() {
    reducesTo(
      "\\r.n",
      "\\r.n"
    );
  }

  @Test
  public final void test101() {
    reducesTo(
      "\\d.(\\l.n) ((\\u.w) ((\\c.\\w.p) (\\h.\\y.(\\y.\\j.\\f.v) (\\g.\\o.\\g.\\o.(\\m.J (k q (\\x.H))) ((\\f.\\f.W) (x u y))) (\\f.C) (\\q.a))))",
      "\\d.n"
    );
  }

  @Test
  public final void test102() {
    reducesTo(
      "\\z.\\j.b (\\o.(\\u.\\r.(\\v.\\v.q) n (\\n.T ((\\y.K) s)) (b ((\\h.J K) (n ((\\o.a) w))) (f (\\q.\\u.(\\c.W) (\\c.H) (\\l.L z) ((\\s.g) p)))) u) x)",
      "\\z.\\j.b (\\o.\\r.q (b (J K) (f (\\q.\\u.W (\\l.L z) (g)))) x)"
    );
  }

  @Test
  public final void test103() {
    reducesTo(
      "\\q.N (\\n.\\f.\\l.m B)",
      "\\q.N (\\n.\\f.\\l.m B)"
    );
  }

  @Test
  public final void test104() {
    reducesTo(
      "(\\v.\\k.\\u.(\\h.\\e.\\x.c) (\\t.r)) ((\\q.r) ((\\y.t) t)) (\\j.F) (k a (\\a.r ((\\i.(\\n.w) (\\w.\\t.(\\w.(\\g.t) (Z v)) (n q (W b)) (\\f.\\b.B))) r (\\q.f))))",
      "\\e.\\x.c"
    );
  }

  @Test
  public final void test105() {
    reducesTo(
      "\\c.(\\p.(\\d.(\\v.O) (\\l.q)) v) (\\t.d)",
      "\\c.O"
    );
  }

  @Test
  public final void test106() {
    reducesTo(
      "(\\n.t) ((\\a.\\r.C (\\f.k)) (\\k.z (\\q.w)))",
      "t"
    );
  }

  @Test
  public final void test107() {
    reducesTo(
      "(\\l.s) (\\a.i)",
      "s"
    );
  }

  @Test
  public final void test108() {
    reducesTo(
      "\\b.\\j.(\\q.\\b.(\\j.\\x.v (v (s ((\\v.S) (z m)))) (\\t.x D ((\\t.a) (g o)) (\\r.(\\m.x) k ((\\b.H) (\\z.c))) ((\\i.G) l))) (\\k.\\s.f) (\\d.\\t.\\z.b) (\\g.i)) (\\k.(\\c.(\\r.q) (X ((\\c.\\u.(\\l.l) k) V)) j) (w (I (G F r) y s (\\v.X))) b)",
      "\\b.\\j.\\b.v (v (s (S))) (\\t.b (G)) (\\g.i)"
    );
  }

  @Test
  public final void test109() {
    reducesTo(
      "\\d.\\u.(\\c.P (\\s.k) ((\\d.s) ((\\w.F) ((\\w.u) P) q) R)) (\\l.f) (\\b.(\\z.q) W ((\\v.\\l.\\h.(\\w.\\t.(\\e.v) (k (\\g.\\u.u) (\\y.C))) i) ((\\u.v (G (l h (\\k.f) (\\x.\\t.\\u.w)))) m ((\\d.h) ((\\g.F) (\\b.c))))))",
      "\\d.\\u.P (\\s.k) (s R) (\\b.q (\\l1.\\h2.\\t.v (G (l h (\\k.f) (\\x.\\t.\\u.w))) (h)))"
    );
  }

  @Test
  public final void test110() {
    reducesTo(
      "\\a.\\d.A",
      "\\a.\\d.A"
    );
  }

  @Test
  public final void test111() {
    reducesTo(
      "\\r.R",
      "\\r.R"
    );
  }

  @Test
  public final void test112() {
    reducesTo(
      "\\p.l (\\x.\\h.\\k.i) ((\\o.\\e.I) (\\v.\\p.G)) (\\p.(\\a.(\\z.\\f.z (\\x.f)) (\\p.h)) (\\e.\\k.w (g R (\\v.r) (\\c.N a z)) (\\i.\\f.x C) c ((\\j.\\l.b) ((\\o.(\\v.\\l.Z e) (c (M Y))) p ((\\f.m) (\\u.(\\l.\\u.j r) (\\e.\\z.w))))) c))",
      "\\p.l (\\x.\\h.\\k.i) (\\e.I) (\\p.\\f.h)"
    );
  }

  @Test
  public final void test113() {
    reducesTo(
      "\\x.(\\y.\\s.D) (\\u.\\t.i)",
      "\\x.\\s.D"
    );
  }

  @Test
  public final void test114() {
    reducesTo(
      "T ((\\u.\\d.(\\g.D) (\\e.q) (\\w.(\\d.\\t.\\q.T) s ((\\y.\\f.(\\k.\\r.\\j.u) (\\v.r)) ((\\z.c) ((\\i.\\g.n) t) (\\n.\\q.s))))) b)",
      "T (\\d.D (\\w.\\q.T))"
    );
  }

  @Test
  public final void test115() {
    reducesTo(
      "\\j.v",
      "\\j.v"
    );
  }

  @Test
  public final void test116() {
    reducesTo(
      "\\u.\\f.A",
      "\\u.\\f.A"
    );
  }

  @Test
  public final void test117() {
    reducesTo(
      "\\k.(\\o.s) (\\y.k) (\\p.Z (\\n.(\\d.\\k.\\k.\\u.\\e.(\\q.\\h.\\i.\\x.x) (\\l.\\i.(\\z.e) N) (\\z.(\\m.i) ((\\y.\\r.\\o.c v r) (\\z.p)))) (\\v.\\v.x)) (\\v.i ((\\d.(\\s.\\d.(\\h.\\n.k) (N I (o g))) (a o y) (h (\\v.S s (Y v) (e (Z x))))) (e (\\j.t (w (w N)) x))) (\\n.w)))",
      "\\k.s (\\p.Z (\\n.\\k.\\k.\\u.\\e.\\i.\\x.x) (\\v.i (\\n.k) (\\n.w)))"
    );
  }

  @Test
  public final void test118() {
    reducesTo(
      "v ((\\t.\\c.f) ((\\m.\\n.\\r.\\j.\\h.(\\a.(\\g.\\e.(\\y.v) o) B) (\\r.\\c.U)) j ((\\j.(\\s.f (s j)) (m n (\\t.J)) (k h A) (Y (\\v.(\\f.B) G ((\\m.o) (v j)))) (h (z (\\z.(\\t.(\\e.I) (i Z)) (s B (i I)))))) (\\d.j))))",
      "v (\\c.f)"
    );
  }

  @Test
  public final void test119() {
    reducesTo(
      "(\\j.(\\p.\\k.P) ((\\r.(\\w.\\r.I) V ((\\m.Q) (\\l.(\\s.\\g.\\g.H) ((\\p.X) (D Z) E)))) (\\u.\\x.I)) (\\e.\\q.\\e.Y)) A",
      "P"
    );
  }

  @Test
  public final void test120() {
    reducesTo(
      "\\z.(\\z.w (T ((\\o.(\\n.m) (\\s.m (\\m.\\p.g))) (\\l.(\\d.q) (\\s.w)))) (y c)) V",
      "\\z.w (T (m)) (y c)"
    );
  }

  @Test
  public final void test121() {
    reducesTo(
      "\\l.(\\p.\\o.(\\n.(\\k.\\v.\\p.\\v.A (\\w.(\\i.(\\l.(\\d.c h) (\\s.l O)) (n (\\i.G))) i)) ((\\f.l) ((\\r.(\\n.\\g.\\w.H) (\\a.(\\h.t) (j u))) (\\t.\\m.\\h.p)) (\\y.(\\x.(\\r.q) ((\\x.j) i)) e))) (\\a.(\\g.\\q.m) ((\\w.\\q.\\r.(\\s.\\c.F) ((\\j.C) (\\a.J)) (\\l.o)) ((\\v.m M) p h)) W)) (\\t.\\j.\\k.(\\i.\\j.e) ((\\z.\\j.I ((\\o.T) (\\x.t))) (L b ((\\i.M) (d e)))) e (\\o.d) K) (\\r.\\c.m (\\w.(\\z.(\\k.\\x.(\\y.K) l) (\\j.\\j.D)) p))",
      "\\l.\\v.\\p2.\\v.A (\\w.c h)"
    );
  }

  @Test
  public final void test122() {
    reducesTo(
      "\\c.\\k.S",
      "\\c.\\k.S"
    );
  }

  @Test
  public final void test123() {
    reducesTo(
      "\\i.a",
      "\\i.a"
    );
  }

  @Test
  public final void test124() {
    reducesTo(
      "j (U ((\\k.\\v.d (\\p.T)) (\\v.\\s.s ((\\k.n) ((\\n.n O (u x) (\\t.(\\c.J) (\\k.U))) (U ((\\x.n) (n M)))) (\\c.(\\w.\\t.(\\m.(\\b.s g) (\\v.r z)) F) ((\\j.\\w.\\w.\\h.\\l.r P (\\n.i)) B))))))",
      "j (U (\\v.d (\\p.T)))"
    );
  }

  @Test
  public final void test125() {
    reducesTo(
      "q (Q (\\n.\\o.(\\b.i) (\\b.J) (\\s.(\\n.d) (u G) ((\\w.e) (l B)) (l k) ((\\h.P (\\w.(\\k.U) (L o))) (k z (\\t.g) (\\o.n)))) u (\\w.\\s.\\k.(\\n.A k (\\o.I)) Z x ((\\x.Z) ((\\q.\\s.n) (b K (\\i.z)))) h ((\\n.\\e.o) (\\u.d)))))",
      "q (Q (\\n.\\o.i (\\s.d (e) (l k) (P (\\w.U))) u (\\w.\\s.\\k.A k (\\o.I) x (Z) h (\\e.o))))"
    );
  }

  @Test
  public final void test126() {
    reducesTo(
      "\\p.(\\r.\\i.o (\\p.a (\\s.Y u) d) (\\f.(\\a.e) (\\z.z) ((\\s.(\\b.u) (\\k.Q) ((\\b.v) (\\o.p))) ((\\m.b) (\\j.F) (\\t.\\a.T o)) ((\\c.(\\q.u) (\\b.u)) (\\q.\\s.x a) (\\s.d (\\x.j I (\\t.z)))))) ((\\m.\\m.(\\u.\\b.V) (\\o.d)) (\\b.y (\\a.d) F d ((\\k.\\j.k (\\a.\\v.k)) n) (\\e.\\u.v h))) (\\h.\\q.(\\c.\\b.o) (S ((\\e.e c A) (e X (\\l.f)) (\\w.y)) (h k) (\\b.\\v.\\s.u t)))) ((\\q.v) (\\s.\\y.N (\\p.D (\\c.(\\u.n) f) (\\x.l)) (y (s ((\\e.\\q.\\w.c) ((\\q.U) (a I)))) ((\\z.o (\\k.j) (p o (\\j.d))) t (\\y.O)))) (\\h.t))",
      "\\p.\\i.o (\\p.a (\\s.Y u) d) (\\f.e (u (v) (u (\\s.d (\\x.j I (\\t.z)))))) (\\m.\\b.V) (\\h.\\q.\\b.o)"
    );
  }

  @Test
  public final void test127() {
    reducesTo(
      "(\\i.(\\w.\\w.N (z F)) (\\m.\\g.v)) (j i) (\\s.b)",
      "N (z F)"
    );
  }

  @Test
  public final void test128() {
    reducesTo(
      "(\\f.H) ((\\f.D) ((\\j.k f (W Z) (u (D b)) f) (n (\\v.V))) (\\i.C)) (j Y) (\\c.(\\r.b) (\\b.(\\p.\\t.A (\\t.(\\r.g) ((\\n.n) (\\a.L k (\\h.A)))) i) (\\g.S)) ((\\r.s) (\\e.o)))",
      "H (j Y) (\\c.b (s))"
    );
  }

  @Test
  public final void test129() {
    reducesTo(
      "S (P (\\t.\\r.(\\a.B) (\\y.m) (\\d.\\z.x) ((\\j.E) E))) u",
      "S (P (\\t.\\r.B (\\d.\\z.x) (E))) u"
    );
  }

  @Test
  public final void test130() {
    reducesTo(
      "(\\i.u) f",
      "u"
    );
  }

  @Test
  public final void test131() {
    reducesTo(
      "\\y.\\i.(\\y.(\\k.j) w y (\\k.\\d.\\o.j)) ((\\d.(\\o.n) (\\b.O r ((\\h.o) (\\t.S (P T))))) (\\m.f ((\\b.\\r.\\e.\\b.\\e.(\\m.Z) (\\o.h)) (F x (\\i.z) (\\j.\\f.\\q.C)))) ((\\s.\\m.(\\e.r) (\\h.i) ((\\o.f) (\\w.f) (\\e.\\s.A))) ((\\t.\\q.(\\z.K) A (\\p.j l)) ((\\w.\\l.\\n.o) ((\\b.l) (\\k.i)))) ((\\t.\\b.\\t.t) ((\\s.g) (x t)) (\\v.y) (\\g.\\u.N))) d) ((\\q.(\\m.(\\o.\\d.d (M q (\\i.b))) (\\l.(\\h.k) e) (S (C B) (\\l.T t (\\b.t)) ((\\m.M) (\\a.K) (K y (O u)))) (n ((\\v.H) ((\\n.s i (z E)) (\\r.\\y.\\j.e)))) (\\b.\\f.(\\l.o) (\\a.x ((\\l.n) (\\g.B) ((\\n.g) (\\i.y)) (\\r.\\j.D))))) ((\\a.N) (\\w.\\w.(\\p.i w) (T z (G w) U s)) (\\v.\\n.y))) (\\p.(\\e.(\\i.R (s V ((\\i.c) (\\t.x) (\\w.\\q.s a))) (W L ((\\c.(\\c.(\\y.t) (k g)) (\\p.\\m.J F)) (\\x.Q)))) (\\n.\\k.(\\m.u) (\\k.\\v.(\\k.v) (\\m.\\y.v k) (\\o.C ((\\d.o) (\\m.Y))) (\\j.u)))) (\\j.i)))",
      "\\y.\\i.j (n (r (f (\\e.\\s.A))) d) (\\k.\\d.\\o.j) (S (C B) (\\l.T t (\\b.t)) (M (K y (O u))) (M (\\p.R (s V (c (\\w.\\q.s a))) (W L (t))) (\\i.b)) (n (H)) (\\b.\\f.o))"
    );
  }

  @Test
  public final void test132() {
    reducesTo(
      "(\\m.\\d.\\o.m (\\a.\\s.\\f.\\j.J)) (g ((\\u.\\r.\\x.l) m) x) J",
      "\\o.g (\\r.\\x.l) x (\\a.\\s.\\f.\\j.J)"
    );
  }

  @Test
  public final void test133() {
    reducesTo(
      "(\\z.(\\q.\\l.d ((\\o.\\r.\\p.v e (\\d.d)) (I c) ((\\g.(\\r.\\r.a z) (j V (\\u.a))) (O (\\k.V x O))) (\\l.w ((\\n.x) (\\z.\\y.e c) (\\a.(\\c.\\l.\\l.p) (\\l.\\a.B)))) ((\\s.B) (\\x.C (\\v.h) (F f (\\a.J)) (w (f (m C))) (\\y.p))))) (\\p.(\\u.\\g.e) (\\l.g) m ((\\t.(\\i.(\\s.\\a.\\u.(\\d.k (\\l.c)) (\\l.(\\w.\\o.x) (q l (b r)))) (\\l.(\\u.k x) p ((\\v.(\\z.I) (\\g.T)) w))) s) ((\\w.\\s.\\g.(\\k.u) s) X (\\q.(\\h.U) c ((\\j.K) k) (a b p (\\r.v (\\k.X))) (F (n (\\k.c)) (\\j.f))))))) O",
      "\\l.d (v e (\\d.d) (B))"
    );
  }

  @Test
  public final void test134() {
    reducesTo(
      "a (\\c.k Z) ((\\c.c (w (\\b.\\o.(\\o.\\a.\\e.o (\\h.\\e.F)) (\\v.i ((\\h.e) c))))) (\\n.\\r.\\v.j) ((\\c.\\m.\\w.l) (\\t.(\\a.\\h.\\s.C) (\\t.\\j.z p (\\w.b) (t p (\\p.L)) (e u))) (\\v.\\u.B) (h ((\\q.\\e.\\n.\\x.(\\u.c) (\\s.(\\i.k M) h)) ((\\c.x) (\\t.b) ((\\z.Y) (\\p.x)) (\\e.\\f.\\h.\\h.\\r.(\\t.v) (c j)))) (\\j.k))))",
      "a (\\c.k Z) (\\v.j)"
    );
  }

  @Test
  public final void test135() {
    reducesTo(
      "q (H (\\g.\\o.z))",
      "q (H (\\g.\\o.z))"
    );
  }

  @Test
  public final void test136() {
    reducesTo(
      "\\n.\\n.\\r.o",
      "\\n.\\n.\\r.o"
    );
  }

  @Test
  public final void test137() {
    reducesTo(
      "Q ((\\g.\\q.g ((\\i.\\k.M a (G r) (\\g.\\t.t e) ((\\w.b b (I p)) I) ((\\i.e) (\\f.J) (\\n.p) (\\x.(\\b.z j) (\\y.\\z.o e)))) (\\d.\\z.(\\j.e) ((\\l.e I (p k) l) w)) (p (\\e.A) (\\j.x)))) F)",
      "Q (\\q.F (M a (G r) (\\g.\\t.t e) (b b (I p)) (e (\\n.p) (\\x.z j))))"
    );
  }

  @Test
  public final void test138() {
    reducesTo(
      "(\\h.F) i",
      "F"
    );
  }

  @Test
  public final void test139() {
    reducesTo(
      "\\x.\\m.g ((\\y.\\m.j) (\\a.(\\u.x C ((\\i.h) ((\\q.(\\h.y (\\r.p) Z) (\\s.L)) (\\d.\\e.(\\e.c) (\\d.b (\\t.w)) (\\a.b))))) d))",
      "\\x.\\m.g (\\m.j)"
    );
  }

  @Test
  public final void test140() {
    reducesTo(
      "(\\u.g) a",
      "g"
    );
  }

  @Test
  public final void test141() {
    reducesTo(
      "\\d.\\u.N",
      "\\d.\\u.N"
    );
  }

  @Test
  public final void test142() {
    reducesTo(
      "\\g.P (j ((\\h.(\\w.e) k) (D ((\\c.W) (\\y.(\\u.\\r.\\u.d) (\\r.l))) (\\x.\\n.R)))) ((\\q.G (\\p.\\q.\\y.\\q.u)) (\\h.\\v.\\p.m (\\r.l)) R)",
      "\\g.P (j (e)) (G (\\p.\\q.\\y.\\q.u) R)"
    );
  }

  @Test
  public final void test143() {
    reducesTo(
      "\\w.\\o.\\z.(\\w.P ((\\p.N) ((\\e.t (\\c.B)) (u (\\s.\\q.\\s.c (y F (l s) d))))) ((\\z.(\\g.o) ((\\e.\\y.\\v.\\y.\\s.X i j ((\\a.a) (\\y.i)) (D (\\p.K K))) (\\g.e)) (\\z.r (G ((\\v.(\\m.\\c.\\p.e) E) (X q (g d) V))))) (\\x.(\\k.w) p))) (\\p.\\w.\\h.L)",
      "\\w.\\o.\\z.P (N) (o (\\z.r (G (\\c.\\p.e))))"
    );
  }

  @Test
  public final void test144() {
    reducesTo(
      "\\q.(\\p.(\\c.(\\s.\\i.(\\s.\\v.(\\m.\\a.V c (\\a.(\\o.h) (\\e.O)) (\\m.\\u.\\e.(\\i.g) k)) (\\t.(\\i.(\\t.C A) (\\u.o w)) k)) ((\\n.(\\z.s) Z) (\\m.b) e (\\u.h)) (\\j.\\r.e)) (f ((\\f.g ((\\s.z) (f o)) Y) (\\a.\\z.(\\t.g (s k) l) (n (\\l.\\r.t U)))) (\\r.\\o.\\p.\\a.m K))) (\\w.\\r.i)) (\\g.(\\g.(\\z.\\l.f) (\\i.d)) ((\\g.J) ((\\q.P) ((\\y.x (\\z.U) k) (z i))) (\\h.W)) x)",
      "\\q.\\i1.\\a.V (\\w.\\r.i) (\\a.h) (\\m.\\u.\\e.g)"
    );
  }

  @Test
  public final void test145() {
    reducesTo(
      "(\\q.O o (\\b.\\z.\\j.R) ((\\h.(\\i.\\h.v m) (L s (\\i.T)) h (\\a.\\z.\\y.\\p.b)) e) (\\s.\\z.(\\i.(\\i.\\y.\\i.j) (i u M ((\\m.F) (o j)))) c ((\\l.(\\k.o) ((\\f.\\e.g z) ((\\k.b) (\\g.a)))) (E (\\n.(\\n.j Y (\\v.l)) (\\i.(\\z.H) (n f))))) (\\a.\\b.N)) t) ((\\n.\\e.C (X p (f m))) (\\k.\\x.c) p ((\\w.c) ((\\i.u) (A (\\b.x g (w w))))) ((\\s.o) (v e) (\\k.z) (\\a.\\k.w) (\\n.(\\p.\\s.\\m.\\x.\\e.(\\k.n) k) (\\c.P)) (E x (o h) (\\w.(\\l.y) (\\p.P)) (\\a.\\b.y d (\\h.K)) ((\\h.K o (v C) z) (P ((\\d.e) (k n)))))) (\\g.M) v)",
      "O o (\\b.\\z.\\j.R) (v m (\\a.\\z.\\y.\\p.b)) (\\s.\\z.j) t"
    );
  }

  @Test
  public final void test146() {
    reducesTo(
      "\\f.(\\p.(\\m.n) (\\f.(\\x.\\p.\\w.\\u.\\i.\\r.(\\j.\\f.n) ((\\w.Y u) k)) (\\n.j m k Q ((\\g.i (j h)) (p j (Q B)))) ((\\w.\\q.q) ((\\f.d (\\a.r)) O (q (\\q.D) (q h (o u)))))) C) T (\\a.\\z.\\n.\\n.U)",
      "\\f.n C (\\a.\\z.\\n.\\n.U)"
    );
  }

  @Test
  public final void test147() {
    reducesTo(
      "t ((\\k.Q) (\\m.x))",
      "t (Q)"
    );
  }

  @Test
  public final void test148() {
    reducesTo(
      "(\\k.k) x (\\r.\\k.Y (\\t.(\\r.\\x.m (Z K c ((\\i.M) q)) (\\j.\\h.(\\m.\\p.g b) D ((\\k.(\\i.m) (s f)) y))) ((\\e.u ((\\o.h) (o t)) (c (\\z.\\r.z))) (\\q.v ((\\c.(\\c.j) (\\u.I)) (\\z.v e (e o)))))) l ((\\b.\\b.\\h.y c) k))",
      "x (\\r.\\k.Y (\\t.\\x.m (Z K c (M)) (\\j.\\h.g b)) l (\\b.\\h.y c))"
    );
  }

  @Test
  public final void test149() {
    reducesTo(
      "(\\t.\\r.z) (\\k.z)",
      "\\r.z"
    );
  }

  @Test
  public final void test150() {
    reducesTo(
      "(\\q.p) (\\i.Z (\\b.d))",
      "p"
    );
  }

  @Test
  public final void test151() {
    reducesTo(
      "\\g.(\\o.\\v.(\\m.o) (\\w.(\\a.Q) u w ((\\d.\\j.Y) ((\\z.\\w.\\s.a (\\v.v)) (\\t.\\s.(\\c.s) (\\j.a)))))) (\\b.\\k.z (\\u.X))",
      "\\g.\\v.\\b.\\k.z (\\u.X)"
    );
  }

  @Test
  public final void test152() {
    reducesTo(
      "(\\t.f) ((\\o.(\\d.o (\\t.m)) (v ((\\m.o U (l w) N) a ((\\g.\\f.(\\z.B) (\\d.B g)) ((\\w.G) (n b) P))) (\\a.\\j.\\f.k Z))) o)",
      "f"
    );
  }

  @Test
  public final void test153() {
    reducesTo(
      "\\j.\\w.r",
      "\\j.\\w.r"
    );
  }

  @Test
  public final void test154() {
    reducesTo(
      "\\d.\\l.M W",
      "\\d.\\l.M W"
    );
  }

  @Test
  public final void test155() {
    reducesTo(
      "P (O (\\z.(\\u.r j (P Z (\\d.x (l u (\\q.f)) (\\e.\\c.w)) (\\a.(\\c.R (\\z.t)) (a I (o l) (\\m.s)) ((\\b.q) (\\v.g) (\\z.\\r.\\v.W) (q (v d)))))) (\\b.(\\a.w a) (\\l.\\j.(\\o.\\d.(\\v.(\\l.y) (\\q.g) ((\\h.E) i)) x) (\\z.(\\k.D) (\\t.d) (u y (\\b.q) (v o i))) U))))",
      "P (O (\\z.r j (P Z (\\d1.x (l (\\b.w (\\l.\\j.y (E))) (\\q.f)) (\\e.\\c.w)) (\\a.R (\\z.t) (q (\\z.\\r.\\v.W) (q (v d)))))))"
    );
  }

  @Test
  public final void test156() {
    reducesTo(
      "\\f.l (\\f.\\k.(\\n.(\\z.(\\l.g) (\\e.Q) (\\t.a) j) (A (\\a.(\\x.o R (\\v.z)) P) o (\\j.l))) (\\z.\\e.o (\\z.(\\q.\\n.(\\v.X) (e Z) (f (k k))) ((\\u.G) ((\\x.p) W)) (\\x.\\x.p (\\m.L f (\\c.f)) V)) j)) (\\j.d)",
      "\\f.l (\\f.\\k.g (\\t.a) j) (\\j.d)"
    );
  }

  @Test
  public final void test157() {
    reducesTo(
      "(\\z.(\\q.(\\l.\\p.\\c.E) (\\y.H)) (\\j.\\v.(\\g.Y f) ((\\f.g) ((\\n.j J (\\o.N) l) N) (\\t.D)) s)) (\\k.(\\m.q) ((\\z.(\\o.\\z.\\l.\\q.\\f.(\\b.l) o) (t (Y x (\\h.Q)) (\\w.\\v.(\\t.R i) (y G a)))) ((\\r.\\f.p (W j) (\\j.\\r.\\j.j) (\\g.\\p.m Y)) (\\f.H))) ((\\f.\\d.(\\w.(\\f.I) L (\\n.\\f.G i) P) (h (\\h.\\k.\\k.Z)) (\\i.\\q.w W)) (\\u.I g)) (y h))",
      "\\p.\\c.E"
    );
  }

  @Test
  public final void test158() {
    reducesTo(
      "\\l.I z",
      "\\l.I z"
    );
  }

  @Test
  public final void test159() {
    reducesTo(
      "\\g.(\\x.W s ((\\j.t ((\\e.h) (y E)) (b (\\x.J z (f z))) ((\\i.n (\\r.h)) (u O (v J)) l) (\\x.(\\u.\\z.L Z) (P P (v Z)) (v f) (\\u.\\s.J j))) i)) R ((\\y.\\n.\\q.\\n.(\\f.C (\\l.\\f.(\\s.\\f.f (\\v.\\h.K)) R ((\\x.t (h l) (d (w k))) (\\x.\\q.(\\c.\\g.q) C))) W) (o (\\s.j))) (\\c.b (\\h.\\e.\\n.(\\h.(\\q.o) (\\i.y)) (y (\\u.(\\p.B) J (\\l.\\a.\\v.O))) (V ((\\f.N (\\k.\\t.G)) ((\\u.A) (h U) (\\u.\\r.u C)))) (\\s.k (\\c.T) (\\h.a)))))",
      "\\g.W s (t (h) (b (\\x.J z (f z))) (n (\\r.h) l) (\\x.L Z (\\u.\\s.J i))) (\\n.\\q.\\n.C (\\l.\\f.t (h l) (d (w k)) (\\v.\\h.K)) W)"
    );
  }

  @Test
  public final void test160() {
    reducesTo(
      "(\\z.(\\i.d) k ((\\r.t) (\\w.(\\l.(\\i.\\v.\\x.\\a.O) ((\\v.b) ((\\i.m) (D R)))) (\\d.O))) ((\\y.S L) u ((\\a.\\f.\\c.H) (\\v.n)))) ((\\z.(\\h.l) ((\\b.x) (\\z.X)) x) M n ((\\n.(\\j.\\v.h ((\\y.q) d)) l) (q j W)) s) (\\c.\\a.(\\p.\\g.e (\\a.U)) L)",
      "d (t) (S L (\\f.\\c.H)) (\\c.\\a.\\g.e (\\a.U))"
    );
  }

  @Test
  public final void test161() {
    reducesTo(
      "\\c.f",
      "\\c.f"
    );
  }

  @Test
  public final void test162() {
    reducesTo(
      "\\l.\\j.p (q (\\f.\\o.(\\q.(\\p.\\x.i) (\\e.r)) (\\t.j l) (\\u.D)) (\\l.j) ((\\r.(\\q.c) ((\\b.\\v.(\\q.n (\\d.E M)) ((\\e.p) (Y C) h)) ((\\l.u r (\\o.H) y) (V ((\\t.e) (k Q)))))) ((\\g.(\\s.z) ((\\q.X) (o g))) (I (v A (\\d.z))) k (\\x.\\b.D))) (\\g.\\k.a C))",
      "\\l.\\j.p (q (\\f.\\o.i) (\\l.j) (c) (\\g.\\k.a C))"
    );
  }

  @Test
  public final void test163() {
    reducesTo(
      "(\\n.d (\\s.\\i.\\b.\\z.(\\t.\\h.\\n.(\\e.f m) (w K (r o))) (y (\\a.\\d.s M)) (\\h.\\h.d) (\\s.\\w.(\\k.\\r.m a) (\\e.z) ((\\e.w) (\\v.(\\d.v) (c g))) Y) (\\z.t))) G (\\g.S)",
      "d (\\s.\\i.\\b.\\z.f m (\\z.t)) (\\g.S)"
    );
  }

  @Test
  public final void test164() {
    reducesTo(
      "n (\\c.(\\z.q) (\\t.V (\\e.(\\m.\\g.(\\k.V) h ((\\o.\\j.p) (\\a.g y (E v)))) ((\\w.(\\m.w) ((\\c.n) (\\b.O))) F)) (\\e.\\p.n))) U",
      "n (\\c.q) U"
    );
  }

  @Test
  public final void test165() {
    reducesTo(
      "s (\\x.K)",
      "s (\\x.K)"
    );
  }

  @Test
  public final void test166() {
    reducesTo(
      "\\i.\\k.z",
      "\\i.\\k.z"
    );
  }

  @Test
  public final void test167() {
    reducesTo(
      "(\\t.m (a (\\a.\\o.(\\w.(\\n.K m) (\\c.Q x)) Q)) (\\b.\\j.K (\\f.\\e.u j))) (t ((\\f.(\\g.(\\h.\\a.W P) (i X (d h) (P (\\b.k)))) (j (w ((\\v.Y) (\\z.x))))) (\\q.x))) C (\\l.\\t.(\\k.\\b.(\\u.(\\n.(\\a.y) (\\h.\\e.\\j.(\\b.N) (\\j.o))) (p (\\v.J (o M X)))) f) (\\l.(\\j.\\b.(\\z.\\y.\\x.\\u.\\b.\\q.q) y) o) (B (\\s.E ((\\v.(\\h.s) (Y i)) (O u (k z))) (n r N (\\x.(\\w.I) (o c)) (\\o.(\\j.\\d.\\m.m) ((\\d.z) (q V)))) (\\i.\\t.(\\u.(\\o.f) q (T k (q o)) (\\w.(\\g.k) ((\\b.V) (\\x.k)))) (h ((\\z.O) (u a)) (h v))))) c)",
      "m (a (\\a.\\o.K m)) (\\b.\\j.K (\\f.\\e.u j)) C (\\l.\\t.y c)"
    );
  }

  @Test
  public final void test168() {
    reducesTo(
      "\\q.\\q.J",
      "\\q.\\q.J"
    );
  }

  @Test
  public final void test169() {
    reducesTo(
      "(\\e.n r) (\\a.\\f.\\w.\\q.(\\r.f) (\\s.y (\\y.(\\d.\\n.\\x.(\\t.j) ((\\z.f) (m p)) (N (\\z.j))) (\\p.b (\\l.\\m.\\n.\\p.\\p.\\g.a)))) ((\\a.d ((\\b.\\s.o) (\\e.j))) (\\t.x) (\\n.\\w.\\w.\\u.\\l.(\\y.i (\\x.\\r.\\t.\\u.a (\\e.N)) (\\s.\\x.(\\g.(\\i.\\m.Q) (\\f.b m)) (X v))) v)) (\\y.w))",
      "n r"
    );
  }

  @Test
  public final void test170() {
    reducesTo(
      "\\u.\\d.(\\v.(\\m.(\\d.o (\\r.i)) (\\n.X)) T ((\\a.x n m ((\\t.J) G) ((\\h.a) (h u) (\\k.y (l P)))) (\\l.\\s.\\w.\\w.\\s.h (\\u.\\v.\\q.\\x.\\e.y))) (\\f.p (\\s.v)) ((\\m.(\\g.\\c.k) (\\k.(\\v.h) ((\\o.\\n.\\d.(\\c.v) (c i) a) i))) (c (v (P (\\v.\\t.B) D))))) o (\\n.n)",
      "\\u.\\d.o (\\r.i) (x n m (J) (\\s.\\w.\\w.\\s.h (\\u.\\v.\\q.\\x.\\e.y))) (\\f.p (\\s.o)) (\\c.k) (\\n.n)"
    );
  }

  @Test
  public final void test171() {
    reducesTo(
      "\\z.\\g.(\\c.\\v.(\\v.l) f) I ((\\q.(\\k.(\\l.e) (\\g.d)) (\\f.\\m.(\\o.\\r.q) (\\f.\\v.s) (h B Q ((\\g.o) (v d)))) k s) (\\w.z) (\\g.\\r.b))",
      "\\z.\\g.l"
    );
  }

  @Test
  public final void test172() {
    reducesTo(
      "w (C ((\\r.\\i.\\w.\\i.J) (\\k.\\k.\\j.v) (\\g.\\u.\\g.G)) v)",
      "w (C (\\w.\\i.J) v)"
    );
  }

  @Test
  public final void test173() {
    reducesTo(
      "(\\u.\\l.(\\n.\\c.a (\\a.(\\x.b t (\\w.(\\g.(\\u.T) f) (H n) (q ((\\o.n) (\\j.s) (\\l.(\\w.B) M))))) (\\g.\\r.\\e.(\\p.\\q.\\z.t) (p (\\d.\\s.r (\\c.\\z.d)) p)))) g) ((\\k.b) V X (\\n.\\m.(\\u.J G z) (O (\\x.(\\x.r) (\\j.f) ((\\q.H p) (\\b.\\o.w B))) (\\j.\\c.\\h.q)) (\\a.(\\n.(\\i.x) ((\\o.(\\c.O) (\\v.\\f.\\s.\\x.P w (D j))) (\\j.a (\\l.n)))) (f ((\\u.(\\o.\\j.(\\s.\\r.f) (\\q.\\w.h)) (N c (j i) (\\e.Y))) (m W))))))",
      "\\l.\\c.a (\\a.b t (\\w.T (q (g (\\l.B)))))"
    );
  }

  @Test
  public final void test174() {
    reducesTo(
      "\\k.Z",
      "\\k.Z"
    );
  }

  @Test
  public final void test175() {
    reducesTo(
      "y g ((\\x.\\h.(\\m.(\\i.(\\f.(\\g.\\a.\\x.x) (f L (c s))) (f (x (\\x.b)))) (\\z.(\\h.k) (\\t.t) (\\q.X) ((\\h.\\b.v) ((\\i.J) (a q)))) (\\i.(\\v.G) ((\\q.(\\n.X) (e m)) (\\c.\\x.p M) I))) (\\h.\\y.(\\l.(\\t.\\f.(\\x.t) k) ((\\l.\\l.\\b.\\z.k) (\\r.T (m u) (\\b.\\o.U s)))) s)) E) (\\y.(\\d.m Y) ((\\q.v) ((\\b.\\g.r) (\\q.\\z.c)) (t J X (\\o.(\\q.r) (I u)) (\\c.v q ((\\x.b) i))) (\\m.(\\g.C) ((\\i.e) ((\\v.q) o))) (\\x.G)) f)",
      "y g (\\h.\\x.x) (\\y.m Y f)"
    );
  }

  @Test
  public final void test176() {
    reducesTo(
      "q ((\\y.\\j.R ((\\g.(\\p.\\n.\\h.Q) (\\p.\\w.t)) ((\\d.\\l.\\v.k) (\\u.\\f.X s) Q) (C M) n)) ((\\z.P) (\\f.s)))",
      "q (\\j.R (Q))"
    );
  }

  @Test
  public final void test177() {
    reducesTo(
      "(\\x.\\l.\\y.\\r.\\z.K) M w ((\\w.\\j.k) (\\j.\\z.(\\w.(\\t.c (\\q.\\f.(\\f.\\e.\\w.w) ((\\v.w Z (f j)) l))) ((\\g.I n) (\\k.d t (\\g.k)) O (\\p.(\\k.(\\z.w) (m p)) (\\p.n) s)) (\\n.(\\b.S) (\\i.a))) n))",
      "\\r.\\z.K"
    );
  }

  @Test
  public final void test178() {
    reducesTo(
      "a ((\\p.(\\j.\\z.(\\e.(\\t.e B) (r (\\t.u))) (U r (I b) (c (f y)))) z) I) j ((\\q.k ((\\r.\\z.\\b.k (\\o.a)) z)) (\\r.a)) (\\d.(\\v.l (\\v.\\v.(\\r.\\v.t ((\\h.k) (r j))) ((\\p.a) (\\s.t) (\\j.K)) (j (q b) (\\g.\\t.\\l.(\\n.j e) M)) (U ((\\l.L i) k) (K k)) (b (\\e.b) (\\w.\\x.\\o.(\\g.\\o.z) ((\\o.F (H b)) (\\e.\\h.\\m.y) z))))) ((\\s.\\c.(\\k.\\i.\\h.\\a.\\l.\\x.(\\r.\\g.B (\\z.j)) (\\y.\\j.V (c d (J i) (q V (m n))))) h) ((\\i.u) ((\\u.\\d.\\p.l) (\\r.K))) (\\f.X)))",
      "a (\\z.U r (I b) (c (f y)) B) j (k (\\z.\\b.k (\\o.a))) (\\d.l (\\v.\\v.t (k) (U (L i) (K k)) (b (\\e.b) (\\w.\\x.\\o.\\o.z))))"
    );
  }

  @Test
  public final void test179() {
    reducesTo(
      "(\\h.v) (\\f.\\i.O)",
      "v"
    );
  }

  @Test
  public final void test180() {
    reducesTo(
      "\\x.\\j.m",
      "\\x.\\j.m"
    );
  }

  @Test
  public final void test181() {
    reducesTo(
      "U (k (v e))",
      "U (k (v e))"
    );
  }

  @Test
  public final void test182() {
    reducesTo(
      "\\k.s",
      "\\k.s"
    );
  }

  @Test
  public final void test183() {
    reducesTo(
      "g (\\f.k) (\\w.x)",
      "g (\\f.k) (\\w.x)"
    );
  }

  @Test
  public final void test184() {
    reducesTo(
      "(\\u.\\p.(\\l.(\\o.(\\p.(\\g.\\n.a (\\j.g L)) (w (o s) (f f (W u)))) (\\b.e (\\g.(\\j.\\c.w) S)) (\\r.(\\t.t ((\\c.r z (p v)) (d A P))) ((\\j.\\c.\\d.\\a.\\m.\\s.j D) Q))) (\\c.(\\v.D) ((\\j.(\\d.r) (Y m) u (\\k.\\u.\\n.\\w.M c (\\z.w))) S))) (\\e.\\s.(\\w.\\j.u l (\\d.\\g.m (\\z.\\q.\\i.o) (C m (S q) (j E (u w))))) n (\\c.(\\r.\\k.(\\c.(\\r.(\\h.Y) g) (e (\\v.l))) (\\n.l)) ((\\a.\\i.\\m.M B) (\\m.\\g.(\\p.(\\s.V) y (T h (\\n.I))) (K m (C l) (\\i.\\t.\\t.z))))))) (u (a (\\b.\\w.t) ((\\b.\\a.\\c.v l (\\h.b) (P g (\\a.a))) x)) (\\o.w) I) (\\l.(\\t.\\m.(\\f.\\m.d) ((\\p.(\\j.\\m.y) (c w (D i))) G a B ((\\r.\\s.l q ((\\w.(\\e.R x (D r)) (\\j.q)) P)) ((\\j.b) m)))) ((\\t.\\h.(\\h.f) (\\c.f)) ((\\y.\\x.h ((\\g.T t (K p) A (\\v.(\\c.m) ((\\d.S) (z u)))) ((\\s.r) T ((\\a.o) ((\\v.O) (\\o.h)))))) (\\i.\\f.(\\a.L c) (\\k.\\z.(\\s.(\\d.X) (\\r.\\z.z x) j) (W p ((\\v.S) r) (\\d.\\t.d e (k r) (\\b.s))))))))",
      "a (\\j.w (D) (f f (W (u (a (\\b.\\w.t) (\\a.\\c.v l (\\h.x) (P g (\\a.a)))) (\\o.w) I))) L)"
    );
  }

  @Test
  public final void test185() {
    reducesTo(
      "(\\z.K s) V",
      "K s"
    );
  }

  @Test
  public final void test186() {
    reducesTo(
      "(\\a.\\q.\\t.\\z.r) (\\q.Y (h v ((\\b.\\p.\\z.e) (\\u.w)) A) (\\f.(\\a.u H (\\j.M)) (\\p.u (y a)) (\\u.n u F (\\m.\\h.\\i.m)) ((\\n.t h (y f)) l (\\y.\\s.\\a.(\\h.q c) e)) ((\\w.V) L))) w (\\p.\\q.(\\k.\\a.\\o.\\x.\\p.\\e.d (f ((\\k.j n c) (\\g.\\w.l g)) (E c (\\m.g) l (\\m.\\t.i))) ((\\y.\\l.\\l.\\p.(\\p.h) (\\p.i)) w ((\\v.Z) ((\\g.\\w.t f) (M T (\\t.e)))) (\\k.\\r.\\h.E (\\u.(\\e.\\u.t X) (N C (\\z.R)) (\\a.k b)))) (x X)) i)",
      "\\z.r"
    );
  }

  @Test
  public final void test187() {
    reducesTo(
      "\\x.\\d.\\u.\\w.(\\x.\\w.(\\u.y) x) E",
      "\\x.\\d.\\u.\\w.\\w.y"
    );
  }

  @Test
  public final void test188() {
    reducesTo(
      "(\\r.j) (\\q.(\\z.\\p.(\\l.(\\h.\\e.\\a.z (\\w.\\x.\\u.\\u.\\i.\\g.l)) r ((\\i.o) j)) c) V ((\\b.Y h) (\\n.e (\\w.r) i i)))",
      "j"
    );
  }

  @Test
  public final void test189() {
    reducesTo(
      "(\\a.\\e.\\r.\\r.K r) (\\r.h)",
      "\\e.\\r.\\r.K r"
    );
  }

}
