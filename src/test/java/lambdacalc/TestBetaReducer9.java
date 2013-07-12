package lambdacalc;

import static org.junit.Assert.assertEquals;
import lombok.val;
import org.junit.Test;

public final class TestBetaReducer9 extends TestLambdaCalc {

  @Test
  public final void test0() {
    reducesTo(
      "\\h.z (\\k.l)",
      "\\h.z (\\k.l)"
    );
  }

  @Test
  public final void test1() {
    reducesTo(
      "(\\x.\\p.Q) (Q (\\o.\\a.Y) (\\y.\\i.(\\f.\\e.C (\\p.S)) (\\y.\\g.\\i.(\\n.U (p (k S))) (\\k.(\\n.\\g.B) (\\a.(\\m.t) (\\s.c))) z (\\a.(\\x.\\e.(\\o.y) (\\l.\\m.c ((\\s.m) (s c)))) g)) (\\h.l)))",
      "\\p.Q"
    );
  }

  @Test
  public final void test2() {
    reducesTo(
      "\\m.(\\d.(\\c.(\\a.(\\c.d (n T) (v h (\\f.h)) (\\i.(\\j.e A) Y)) (\\w.L)) l) (\\h.n (\\g.c) (\\l.\\l.V q ((\\g.Y) ((\\h.t) (\\t.l)))) ((\\b.\\i.(\\g.y R l) (h d) ((\\o.h) (\\b.c) (\\h.x (\\z.w)))) (\\r.G))) (\\j.\\n.b)) (g (u (p ((\\o.e (\\w.H g (X v) (v (\\s.I)))) n)))) ((\\g.w) (\\e.\\z.\\g.\\m.\\p.m E) (l (\\i.(\\s.\\i.(\\v.b (\\b.\\o.(\\p.a G) (a (c e)))) s) (\\y.\\f.t))) (z ((\\u.K) ((\\q.(\\j.f l t m) (y (\\a.l)) (b (\\x.F) (\\y.\\d.x W) (\\g.\\i.\\g.k))) (\\f.l (\\c.(\\g.c) ((\\s.q) (\\p.O))) (\\d.(\\l.(\\x.H) l) (\\v.d k (R D)) ((\\l.(\\o.z) (\\z.o)) (\\o.G))))))))",
      "\\m.g (u (p (e (\\w.H g (X v) (v (\\s.I)))))) (n T) (v h (\\f.h)) (\\i.e A) (\\j.\\n.b) (w (l (\\i.\\i.b (\\b.\\o.a G))) (z (K)))"
    );
  }

  @Test
  public final void test3() {
    reducesTo(
      "p ((\\y.\\k.(\\l.\\h.Z) (\\u.\\h.\\w.(\\d.(\\c.(\\v.J) v ((\\m.q) (\\j.L))) (\\n.k)) (i z)) (\\b.\\s.u) (\\o.n)) i)",
      "p (\\k.Z (\\o.n))"
    );
  }

  @Test
  public final void test4() {
    reducesTo(
      "b (\\n.\\q.Q ((\\i.n) m))",
      "b (\\n.\\q.Q (n))"
    );
  }

  @Test
  public final void test5() {
    reducesTo(
      "\\r.\\k.\\w.C",
      "\\r.\\k.\\w.C"
    );
  }

  @Test
  public final void test6() {
    reducesTo(
      "(\\e.Y) (\\t.h x ((\\w.R) (\\r.H))) ((\\m.a) X (\\x.\\e.S)) ((\\r.\\v.(\\d.\\b.T) (\\n.Y S)) (\\u.B t) ((\\b.z (\\r.i k (q l))) f)) z ((\\f.\\o.S) (D ((\\p.h) (\\c.w) (u u (B w)) n) ((\\i.q i (Z J) o) (y (\\j.H)) (r (\\r.\\a.\\v.K))))) p (\\l.(\\p.\\i.\\x.w) K)",
      "Y (a (\\x.\\e.S)) (\\b.T) z (\\o.S) p (\\l.\\i.\\x.w)"
    );
  }

  @Test
  public final void test7() {
    reducesTo(
      "d (N (\\i.z)) j (\\g.(\\x.\\q.\\v.(\\u.(\\d.q ((\\d.z h (\\w.V) i) (\\z.\\g.A))) (\\u.(\\x.(\\n.(\\a.X) z (\\x.T G)) (\\q.D)) U) (\\o.\\l.\\y.i (\\s.\\c.\\f.c ((\\n.\\s.s) ((\\z.Q) (G m)))) (\\c.g (h z)))) ((\\c.t) ((\\z.(\\p.i) (\\i.j (V K (\\p.x)) (\\o.q))) (\\i.\\w.\\z.\\t.\\w.(\\a.\\j.(\\i.J) w ((\\n.\\l.h) (\\b.\\b.U))) ((\\q.k (l k) z) (\\v.(\\e.b v) h)))))) (w (g ((\\m.(\\g.(\\f.(\\s.J) (p Z)) (c (b q))) (e (h Y (e g))) S) (\\y.\\q.\\d.w)))))",
      "d (N (\\i.z)) j (\\g.\\q1.\\v.q1 (z h (\\w.V) i) (\\o.\\l.\\y.i (\\s.\\c.\\f.c (\\s.s)) (\\c.g (h z))))"
    );
  }

  @Test
  public final void test8() {
    reducesTo(
      "(\\j.t (\\w.A)) E ((\\l.\\s.\\c.g) j) (\\q.\\h.p)",
      "t (\\w.A) (\\s.\\c.g) (\\q.\\h.p)"
    );
  }

  @Test
  public final void test9() {
    reducesTo(
      "b (\\e.(\\h.(\\h.\\i.s) c) k)",
      "b (\\e.\\i.s)"
    );
  }

  @Test
  public final void test10() {
    reducesTo(
      "T (L ((\\z.t (q (\\t.(\\h.\\i.\\g.u N (\\p.U) (\\x.f f)) h))) R) (\\e.\\s.c))",
      "T (L (t (q (\\t.\\i.\\g.u N (\\p.U) (\\x.f f)))) (\\e.\\s.c))"
    );
  }

  @Test
  public final void test11() {
    reducesTo(
      "\\j.q (\\n.(\\z.(\\d.\\c.\\g.\\q.\\d.H) (I d ((\\u.(\\o.n E (\\f.q)) (\\c.q M (\\k.s))) e)) (A (\\u.\\d.c g (x p) (c (\\f.j))) (\\g.h l) t)) B) Q",
      "\\j.q (\\n.\\g.\\q.\\d.H) Q"
    );
  }

  @Test
  public final void test12() {
    reducesTo(
      "(\\c.\\o.\\k.v ((\\o.J) v ((\\h.\\o.(\\l.\\v.(\\t.V) (b k) (n (\\u.p))) (\\m.\\f.v v (E a) (\\q.v))) (\\h.(\\p.(\\o.k (\\q.l)) (\\p.\\e.\\c.m)) ((\\c.l) (\\t.v) (\\v.\\e.P u))) (\\j.\\e.f ((\\i.\\m.\\g.(\\j.w y) M) ((\\t.\\u.\\w.N) ((\\k.a) (\\j.j)))))) (\\t.\\e.(\\f.Q y (e o) (\\u.\\n.v l)) ((\\h.A) h ((\\y.j) (\\q.w))) F (\\z.x) ((\\q.U) ((\\b.(\\q.x F) (x s)) (E (\\g.\\k.L F) (\\z.T))))))) ((\\v.(\\c.g) ((\\m.\\x.\\q.(\\w.\\t.Z) (E (w w) B)) O) (\\k.\\s.\\r.\\m.(\\y.U ((\\c.U) (\\g.\\n.\\i.L (F I)))) z) k) w)",
      "\\o.\\k.v (J (\\v.V (n (\\u.p))) (\\t.\\e.Q y (e o) (\\u.\\n.v l) F (\\z.x) (U)))"
    );
  }

  @Test
  public final void test13() {
    reducesTo(
      "\\s.v",
      "\\s.v"
    );
  }

  @Test
  public final void test14() {
    reducesTo(
      "(\\v.j) ((\\p.q) (\\g.\\z.o (\\u.(\\v.\\f.(\\n.y (\\t.(\\e.\\m.E T) (\\t.(\\v.p) (p o))) ((\\a.\\y.k (\\t.L) (\\z.G)) E)) (\\b.\\f.\\m.(\\i.\\x.e) (S ((\\x.t) U) (W a (R P) (Y n (\\a.p)))))) (m (\\g.L)))))",
      "j"
    );
  }

  @Test
  public final void test15() {
    reducesTo(
      "E (z (\\k.c))",
      "E (z (\\k.c))"
    );
  }

  @Test
  public final void test16() {
    reducesTo(
      "\\f.(\\m.Z (\\n.y)) a",
      "\\f.Z (\\n.y)"
    );
  }

  @Test
  public final void test17() {
    reducesTo(
      "\\z.(\\d.(\\u.\\g.\\w.d) i w) (\\w.(\\a.(\\f.\\w.o) ((\\c.y h (O s) (h (\\o.V)) (c (\\c.M)) (\\e.\\v.\\w.\\k.(\\n.j t) (\\a.\\e.p) ((\\j.\\c.g) (i (r f)))) X) (\\h.(\\t.\\d.y ((\\k.k) f (\\c.z)) l) (t (f V (m u) (\\h.r s p) (l g (W y) (\\l.\\z.k c))))))) h)",
      "\\z.\\w.\\w.\\w.o"
    );
  }

  @Test
  public final void test18() {
    reducesTo(
      "(\\d.l o R) (N (\\o.(\\x.\\l.\\c.(\\x.\\q.\\t.\\o.\\x.m) (\\o.X (\\a.\\j.\\t.(\\g.Z) ((\\f.v) (B J)) (y j C ((\\t.f) (l z)))))) (\\q.N (\\u.s (g ((\\p.O (\\v.t)) (\\r.\\q.\\t.u))))))) k",
      "l o R k"
    );
  }

  @Test
  public final void test19() {
    reducesTo(
      "\\i.\\h.c (\\b.\\n.\\g.Z (e (\\q.P)) (L o ((\\u.\\b.\\n.\\s.T ((\\x.S) (\\s.(\\q.\\t.n) ((\\a.s) (Y U))) ((\\z.J) I))) ((\\s.\\b.q) ((\\p.B) ((\\s.(\\j.W) V) (l q)) (O (\\t.k) (\\t.H) ((\\z.m (\\h.S)) B)))))))",
      "\\i.\\h.c (\\b.\\n.\\g.Z (e (\\q.P)) (L o (\\b.\\n.\\s.T (S (J)))))"
    );
  }

  @Test
  public final void test20() {
    reducesTo(
      "\\t.z",
      "\\t.z"
    );
  }

  @Test
  public final void test21() {
    reducesTo(
      "\\h.\\z.t ((\\o.s) (\\n.\\y.(\\u.V) o)) (E (\\a.b (b s))) (\\n.\\l.t) (\\c.\\e.\\e.s) ((\\s.f (\\a.(\\e.w q (\\m.y) (\\t.j M)) (\\p.n) (j r o)) (\\t.(\\f.\\a.\\b.p) ((\\a.y) (F E)) r (\\t.o) (\\t.\\q.(\\m.h) A)) (\\v.\\d.(\\g.\\n.u) ((\\p.P (o f) (\\s.h g (\\f.W) ((\\m.b) (\\h.l)))) (\\r.(\\d.\\s.e (\\d.\\p.n)) ((\\y.\\n.a h) ((\\u.z) (G Q)))) (z B (\\e.j) ((\\k.\\n.\\t.D) k) o)))) (p (g ((\\z.p) (\\e.\\l.D e) (\\g.s) (\\v.\\p.(\\s.\\y.(\\y.w) (\\i.p) (\\e.\\n.k)) (\\g.S)) ((\\b.e) (\\t.u) (\\b.\\j.u))))))",
      "\\h.\\z.t (s) (E (\\a.b (b s))) (\\n.\\l.t) (\\c.\\e.\\e.s) (f (\\a.w q (\\m.y) (\\t.j M) (j r o)) (\\t.p (\\t.\\q.h)) (\\v.\\d.\\n.u))"
    );
  }

  @Test
  public final void test22() {
    reducesTo(
      "(\\x.(\\d.\\j.(\\y.A (\\f.B)) h) (\\s.\\g.y)) (\\u.F)",
      "\\j.A (\\f.B)"
    );
  }

  @Test
  public final void test23() {
    reducesTo(
      "\\n.e",
      "\\n.e"
    );
  }

  @Test
  public final void test24() {
    reducesTo(
      "c (\\w.E)",
      "c (\\w.E)"
    );
  }

  @Test
  public final void test25() {
    reducesTo(
      "s (\\u.R)",
      "s (\\u.R)"
    );
  }

  @Test
  public final void test26() {
    reducesTo(
      "(\\m.(\\t.(\\x.n d) (\\p.\\t.\\m.\\b.\\k.e) ((\\s.o) ((\\f.(\\e.(\\l.v (b w)) (\\o.\\e.\\f.u)) (\\h.\\l.W)) (\\e.(\\t.F) (l L) I ((\\y.(\\n.c) (\\h.q)) (\\y.m x)))) I)) (z (\\b.g) e)) (t D h (\\e.\\v.\\j.\\k.x (\\n.(\\k.k) (\\f.(\\r.q k (\\e.i)) (\\j.g U (k T))) ((\\l.(\\i.n) b) s)) Q) ((\\k.\\a.b) b))",
      "n d (o I)"
    );
  }

  @Test
  public final void test27() {
    reducesTo(
      "\\c.(\\f.A (\\i.K u u ((\\m.s) (\\o.u) ((\\v.Z) (f x)) (\\h.q b (\\t.N) (\\i.\\h.i e)))) (\\v.\\p.x) ((\\n.l (\\a.(\\z.m) (\\t.C) j) ((\\h.i) ((\\y.\\f.\\c.R) (\\t.\\o.t v)))) (\\d.v) (\\i.\\f.D)) (B (\\u.L))) (\\x.s)",
      "\\c.A (\\i.K u u (s (Z) (\\h.q b (\\t.N) (\\i.\\h.i e)))) (\\v.\\p.x) (l (\\a.m j) (i) (\\i.\\f.D)) (B (\\u.L))"
    );
  }

  @Test
  public final void test28() {
    reducesTo(
      "f (\\o.(\\b.\\u.(\\e.M y I ((\\y.l) (\\x.h))) (\\e.(\\j.e r) K)) (\\h.\\b.G (x c (\\c.v))) ((\\o.\\z.(\\v.\\x.b r q ((\\q.l) d)) e) (\\e.(\\u.\\q.b (\\r.\\t.a)) r)) (\\k.Q)) (\\r.\\g.\\o.\\j.\\z.\\p.y) (\\m.r (\\l.\\q.(\\e.\\i.W m) ((\\o.\\d.\\v.\\h.(\\m.Q) (\\i.(\\e.E) (\\i.n) o)) (\\e.(\\n.\\m.K P) (\\d.(\\h.l) (s z)) (Q z P ((\\v.X) (e P))) (j (\\g.\\t.\\u.W))) (\\c.v))))",
      "f (\\o.M y I (l) (\\k.Q)) (\\r.\\g.\\o.\\j.\\z.\\p.y) (\\m.r (\\l.\\q.\\i.W m))"
    );
  }

  @Test
  public final void test29() {
    reducesTo(
      "(\\k.G) (\\g.\\z.V) ((\\n.(\\m.(\\v.m) (D (A (\\i.s) (\\s.\\a.j s))) s) (\\z.\\x.O) ((\\q.v m) (b (\\i.\\a.(\\u.\\l.\\u.z) ((\\r.\\z.g z) (\\v.l V (\\v.r))) G)))) (\\e.\\j.o))",
      "G (O)"
    );
  }

  @Test
  public final void test30() {
    reducesTo(
      "(\\s.\\f.(\\l.\\l.\\m.d) ((\\i.F) (\\v.l) (\\k.V) ((\\g.g) (N y) (\\w.\\u.K z) h (\\a.\\j.(\\g.C (l k)) (q E (\\t.p)) (r (c o) (\\p.\\u.r N))) r))) ((\\f.\\n.H) D) (y q)",
      "\\l.\\m.d"
    );
  }

  @Test
  public final void test31() {
    reducesTo(
      "(\\k.y i) q ((\\h.A) r) (\\g.\\b.(\\q.(\\n.U) (\\y.\\h.(\\c.(\\y.M) ((\\m.r r W) (L h))) (\\e.x) ((\\k.\\u.\\v.T (m P) (\\l.A I) (\\v.(\\z.x t) (\\k.\\u.h))) (\\e.\\l.(\\c.\\z.k) (p (j o) (x t m)))))) ((\\w.v) Q) d)",
      "y i (A) (\\g.\\b.U d)"
    );
  }

  @Test
  public final void test32() {
    reducesTo(
      "(\\d.J) (\\y.\\i.(\\v.\\f.\\a.(\\c.\\b.(\\r.\\o.w) (\\w.h u) ((\\s.(\\h.x) (W Z)) (Y (\\m.s)) (d (\\o.\\x.u)))) (\\b.(\\w.\\s.d (v i (\\b.s) (w q (W A)))) ((\\y.(\\j.c) (\\i.(\\f.q) (\\w.d))) j))) ((\\m.(\\p.\\h.(\\o.g) (\\n.W)) (O (\\b.g d (j v))) (\\n.\\c.\\y.\\c.\\x.(\\y.\\m.c) y (\\y.\\h.A))) u) (\\l.(\\y.\\x.(\\b.\\j.\\g.(\\d.w) (\\g.w) (u t U)) (\\a.\\s.x) (\\c.X G) (\\j.(\\o.\\d.N) (\\p.v g (W H) (e c (t B)) (\\g.(\\y.b) (\\x.M) ((\\e.r) (\\g.u)))))) ((\\l.\\e.\\t.D (t o (u k)) (\\y.g)) ((\\v.\\x.(\\c.\\i.X) (L c (\\r.W))) i) ((\\t.F) ((\\m.(\\a.l) (\\v.x) ((\\m.v) (\\p.y))) (S (\\a.\\b.\\n.l)))))) ((\\c.(\\m.(\\n.x) (\\c.(\\t.\\x.(\\l.\\n.E) (\\k.i z)) (d (\\k.\\n.\\x.o))) ((\\j.r) ((\\y.\\i.(\\w.A C) (U b)) (\\s.\\q.(\\m.i) (\\o.\\f.D))))) Z) (\\g.\\g.(\\a.\\j.b (\\z.V ((\\g.\\q.G A) (n z (g f)))) (\\k.(\\a.\\a.d (r (\\h.w)) (\\u.\\k.(\\r.\\u.W) n)) (\\o.(\\u.\\j.x) ((\\p.V) (\\t.M)) (w F)))) (\\a.\\i.R))))",
      "J"
    );
  }

  @Test
  public final void test33() {
    reducesTo(
      "\\m.\\q.(\\j.\\j.l p) (w (c (p ((\\f.\\r.\\c.e) ((\\g.w) (c v) i)) K)) (s t))",
      "\\m.\\q.\\j.l p"
    );
  }

  @Test
  public final void test34() {
    reducesTo(
      "\\c.\\m.(\\n.\\z.\\w.\\u.v) (\\c.h w)",
      "\\c.\\m.\\z.\\w.\\u.v"
    );
  }

  @Test
  public final void test35() {
    reducesTo(
      "\\l.\\a.(\\e.(\\l.(\\m.d z (\\v.s)) (\\d.\\o.E l) (\\m.P) (t ((\\x.w) (\\f.z) (\\v.q)))) ((\\w.\\a.\\k.n) ((\\r.i) (s j (\\g.b))) F) (\\j.\\r.(\\u.Y) e) (j w (\\f.(\\u.i) ((\\r.B) (\\m.(\\o.\\x.\\c.\\d.\\g.i) (\\i.\\p.Z (u (O Y))))))) (\\t.i)) (C (X (\\a.x)))",
      "\\l.\\a.d z (\\v.s) (\\m.P) (t (w (\\v.q))) (\\j.\\r.Y) (j w (\\f.i)) (\\t.i)"
    );
  }

  @Test
  public final void test36() {
    reducesTo(
      "(\\m.\\o.\\l.(\\r.\\b.\\e.u) (\\a.j v)) A",
      "\\o.\\l.\\b.\\e.u"
    );
  }

  @Test
  public final void test37() {
    reducesTo(
      "\\c.f",
      "\\c.f"
    );
  }

  @Test
  public final void test38() {
    reducesTo(
      "l (\\i.O)",
      "l (\\i.O)"
    );
  }

  @Test
  public final void test39() {
    reducesTo(
      "\\g.\\c.B",
      "\\g.\\c.B"
    );
  }

  @Test
  public final void test40() {
    reducesTo(
      "(\\g.(\\e.(\\s.\\m.(\\x.\\w.\\h.(\\a.m K) (\\p.V t)) s (Z I)) K) (u (y a n)) (\\a.\\h.(\\a.A z) (\\g.K) ((\\u.l) (a ((\\d.d) (k n)) (\\e.(\\q.\\j.\\o.F) (w t (\\q.w)))) T))) (J (\\k.\\a.(\\d.(\\t.\\k.x (\\i.V m (\\k.u) (\\p.f e))) ((\\a.e) (\\o.z))) (\\f.u (\\g.\\w.\\e.(\\p.\\k.y) (\\h.o V (\\k.U) (J p (g t))))) (\\c.y))) K",
      "\\h.A z (l T)"
    );
  }

  @Test
  public final void test41() {
    reducesTo(
      "\\c.\\p.\\y.\\w.(\\c.A) ((\\g.(\\s.(\\d.S (z C)) (g ((\\i.\\y.\\j.(\\d.\\l.O) (t l (\\g.J))) y))) (k t)) ((\\q.B) ((\\i.y e) r) (p (\\a.P) ((\\e.O) (f z) (T x (d X))) (\\p.(\\e.\\z.\\x.(\\q.O) ((\\e.w) (n c))) ((\\p.\\b.\\j.g) (E x (N H)))) O))) (n (\\f.n (\\z.\\a.(\\v.u) (L (\\p.\\f.\\e.\\s.(\\e.Y v) (\\f.d g y U))))) (\\b.Y))",
      "\\c.\\p.\\y.\\w.A (n (\\f.n (\\z.\\a.u)) (\\b.Y))"
    );
  }

  @Test
  public final void test42() {
    reducesTo(
      "(\\r.\\h.\\a.(\\v.(\\q.K (\\l.S)) ((\\a.\\z.\\j.g) X (\\p.x O (\\j.e) (J I (\\o.C))) H)) s (\\g.\\r.(\\b.p p (v c)) a (\\w.h v) u ((\\l.\\d.(\\m.\\x.\\b.q c W) ((\\d.q h (\\g.o)) (\\m.\\y.f))) (\\j.V ((\\j.(\\t.W) (d B)) P))) ((\\s.\\u.\\f.\\b.\\p.\\m.m) (u (w T) a (\\t.(\\d.(\\i.h) (O i)) (\\a.\\n.\\i.o))) (n (\\s.\\s.\\l.d)))) (M G)) (\\c.\\p.\\g.(\\r.f) (\\f.x) ((\\d.i) ((\\p.T) (\\h.Y)) (\\k.\\y.h)))",
      "\\h.\\a.K (\\l.S) (\\g.\\r.p p (v c) (\\w.h v) u (\\d.\\x.\\b.q c W) (\\f.\\b.\\p.\\m.m)) (M G)"
    );
  }

  @Test
  public final void test43() {
    reducesTo(
      "\\h.\\g.\\r.m H s (\\a.q)",
      "\\h.\\g.\\r.m H s (\\a.q)"
    );
  }

  @Test
  public final void test44() {
    reducesTo(
      "(\\h.\\w.o (\\n.y)) ((\\w.v ((\\u.(\\h.\\t.P s) (x d D)) y (\\w.\\w.\\r.o) (\\u.\\n.\\l.(\\d.\\a.\\q.\\p.\\q.m) ((\\r.l) ((\\b.b) (\\d.m))) G) (A (\\g.i)))) (y (I (\\s.(\\a.X) (\\k.\\c.\\m.e)))))",
      "\\w.o (\\n.y)"
    );
  }

  @Test
  public final void test45() {
    reducesTo(
      "(\\n.\\f.(\\f.\\r.g (f (\\q.a))) e) (\\d.l)",
      "\\f.\\r.g (e (\\q.a))"
    );
  }

  @Test
  public final void test46() {
    reducesTo(
      "(\\c.\\k.(\\i.\\i.k c) j ((\\a.y x) (\\h.\\j.p))) (\\m.\\s.\\z.K i)",
      "\\k.k (\\m.\\s.\\z.K i)"
    );
  }

  @Test
  public final void test47() {
    reducesTo(
      "\\s.\\j.v (L (\\b.(\\h.e) (\\t.o)))",
      "\\s.\\j.v (L (\\b.e))"
    );
  }

  @Test
  public final void test48() {
    reducesTo(
      "\\h.\\i.i",
      "\\h.\\i.i"
    );
  }

  @Test
  public final void test49() {
    reducesTo(
      "\\l.\\g.(\\b.\\p.\\i.(\\v.\\o.(\\r.\\e.\\v.\\l.x j R) (\\e.c) ((\\z.\\h.\\y.e) h n) (\\e.(\\z.m s (\\o.l)) (\\q.\\s.y p) ((\\w.\\w.c q) O) (\\z.K))) i (\\w.\\s.Q (\\q.\\m.\\h.\\v.\\t.w) (\\n.P) (a g (\\p.H) M (\\y.\\t.\\h.H) n (z s W P w ((\\d.x) (\\w.\\x.(\\z.m) (\\h.I) L)))))) (\\n.(\\t.E) ((\\e.(\\r.\\w.w) ((\\r.\\d.n) (\\u.U) (\\i.\\o.\\m.z)) (a (M (\\x.\\x.n (\\l.\\p.u))))) k)) (\\x.\\m.\\u.\\z.(\\k.\\m.i y) v)",
      "\\l.\\g.\\i1.\\l.x j R"
    );
  }

  @Test
  public final void test50() {
    reducesTo(
      "x (\\h.\\o.m)",
      "x (\\h.\\o.m)"
    );
  }

  @Test
  public final void test51() {
    reducesTo(
      "(\\h.\\d.(\\o.t) (\\g.\\p.(\\w.X) ((\\x.m) ((\\m.\\p.\\n.\\v.(\\z.\\a.N) ((\\r.b) (H t) (w Y (\\h.b)))) (i (c c u) ((\\r.(\\h.s) (Y w)) (O k l)))))) ((\\n.n ((\\k.s) (\\n.t))) (\\i.(\\k.(\\c.I) ((\\r.K p) (\\c.G C (l L) (\\q.C))) c) (c (\\x.C (\\s.k a Y (\\f.\\r.\\x.w))) (\\m.\\b.\\g.L ((\\b.\\k.(\\s.H) (x h) (j M)) (\\i.\\j.(\\c.r y) (y w (\\y.J))))))))) (K (\\k.q))",
      "\\d.t (I c)"
    );
  }

  @Test
  public final void test52() {
    reducesTo(
      "\\x.(\\c.o) (\\y.l)",
      "\\x.o"
    );
  }

  @Test
  public final void test53() {
    reducesTo(
      "(\\d.(\\y.\\n.l (\\u.(\\b.(\\o.t) (\\f.U)) (\\v.\\e.(\\s.o) (u S) (b q (\\m.l)))) A) a ((\\h.(\\k.(\\w.f) P z ((\\q.h) ((\\o.Y) (f P)))) I ((\\r.\\t.c) (\\c.J))) ((\\l.(\\f.\\o.O (\\s.\\d.\\f.b) u) ((\\o.e) u)) (\\u.(\\t.\\q.l) (\\q.\\y.\\c.y a (\\h.t d)) (\\z.(\\c.o A (\\v.j) (\\b.\\k.i)) C))))) ((\\o.(\\y.(\\i.(\\e.\\s.S) (L X u) g) x ((\\d.(\\i.t (a j) (h w (N h))) n) ((\\q.r) ((\\r.z) (\\g.a)) (\\w.\\v.(\\c.\\t.o) (s M T))))) u) (\\f.(\\f.\\y.\\v.v) ((\\y.(\\h.U f (M o) E) (N (\\p.\\r.p)) t) (\\c.v g ((\\g.a (\\c.U)) (\\d.\\v.w u)) (\\p.\\l.\\g.\\m.x))))) (\\c.(\\q.\\p.(\\x.(\\q.(\\s.\\m.N) (\\o.(\\y.(\\b.\\f.O (d T (\\q.s))) (I G (\\i.h) j)) l)) (c (Z (\\t.(\\r.I) (\\c.\\w.\\c.o) (f (\\k.a) (g Y g)))))) f) ((\\g.\\b.w) (\\o.(\\h.(\\j.l) (s G) s (\\t.\\y.s z (Q n) (\\s.c)) ((\\f.\\d.\\l.w) (r i I) (\\v.(\\m.z) ((\\g.r) (y z))))) (\\q.g) p)))",
      "l (\\u.t) A (\\c.\\p.\\m.N)"
    );
  }

  @Test
  public final void test54() {
    reducesTo(
      "v ((\\m.(\\t.\\f.(\\u.\\r.N) v) (N R (h i) n f) c) (s ((\\s.P) ((\\w.c) n) (D l (\\q.\\k.f))))) (\\a.\\d.(\\q.(\\r.\\n.r) ((\\u.P) ((\\x.s) (\\k.a) ((\\k.\\e.(\\m.q N) (\\b.W)) (o M (\\q.t) v))))) (Z ((\\f.\\s.g) ((\\j.o (\\h.\\d.o b) m) L)))) W",
      "v (\\r.N) (\\a.\\d.\\n.P) W"
    );
  }

  @Test
  public final void test55() {
    reducesTo(
      "\\p.h",
      "\\p.h"
    );
  }

  @Test
  public final void test56() {
    reducesTo(
      "(\\y.(\\x.C (\\a.n)) (\\j.v)) ((\\l.\\d.o) o (\\o.t)) U",
      "C (\\a.n) U"
    );
  }

  @Test
  public final void test57() {
    reducesTo(
      "(\\u.(\\u.(\\y.(\\w.\\p.(\\a.\\k.\\g.\\q.g) (\\u.(\\r.\\m.f) (\\b.y g (n i) (b n d)))) b) o) e (K g)) n",
      "\\k.\\g.\\q.g"
    );
  }

  @Test
  public final void test58() {
    reducesTo(
      "\\k.u",
      "\\k.u"
    );
  }

  @Test
  public final void test59() {
    reducesTo(
      "(\\v.M (\\m.(\\q.\\d.\\p.\\b.\\t.p (\\l.m)) (\\a.b (\\t.\\e.h ((\\a.(\\r.l) (S s) r) (\\m.\\z.a)))) ((\\a.(\\f.K v (C s)) (w (\\q.P)) g (\\o.\\y.O (\\p.Z (\\q.X z)))) j (o (\\j.\\l.B) ((\\q.\\j.\\k.(\\o.f) (\\j.k) (d h (\\o.k))) (\\e.\\w.\\v.m ((\\n.t) o))) (\\f.(\\s.(\\l.\\x.\\f.i) (\\z.\\m.Y) (\\u.(\\q.\\u.\\t.e) (\\r.\\c.\\h.b))) (z (\\e.(\\z.H (P E)) W))))))) o",
      "M (\\m.\\p.\\b.\\t.p (\\l.m))"
    );
  }

  @Test
  public final void test60() {
    reducesTo(
      "\\l.x",
      "\\l.x"
    );
  }

  @Test
  public final void test61() {
    reducesTo(
      "L (\\f.x)",
      "L (\\f.x)"
    );
  }

  @Test
  public final void test62() {
    reducesTo(
      "\\b.\\c.(\\f.\\l.o (\\j.x (\\c.\\g.(\\t.c) ((\\i.\\p.\\v.A) p) (H c))) (\\r.\\p.y)) ((\\r.d) (\\g.(\\t.T) ((\\a.g) (\\b.\\e.y (\\w.(\\f.(\\f.T) (T k) (\\a.e)) (\\q.n)))))) (p (X (z (n F) (\\w.v) E) (G (\\t.\\u.\\o.q)) u) (\\n.(\\f.z (l e (\\p.V)) (\\b.(\\t.\\r.o b) (\\e.b)) ((\\h.A) a ((\\h.(\\k.V) (\\k.e)) ((\\g.y) (p x)))) (g (y (\\j.\\g.Z A)) (\\u.(\\x.(\\v.(\\z.k) R) (q p D)) (j (e P C)))) ((\\h.(\\v.\\n.\\r.x) (l p (V m)) (n (\\k.(\\p.l) (\\n.k)))) (v r) (\\b.(\\v.\\t.\\b.\\o.(\\p.\\s.e) G) ((\\z.L (Y f) (\\p.(\\t.l) (\\h.i))) (\\t.M))))) (i (\\a.\\u.(\\c.\\c.h) (\\n.z)))))",
      "\\b.\\c.o (\\j.x (\\c.\\g.c (H c))) (\\r.\\p.y)"
    );
  }

  @Test
  public final void test63() {
    reducesTo(
      "\\r.\\p.(\\z.a) R ((\\x.k) (\\w.\\q.\\m.s))",
      "\\r.\\p.a (k)"
    );
  }

  @Test
  public final void test64() {
    reducesTo(
      "(\\l.S) ((\\y.\\p.e) f)",
      "S"
    );
  }

  @Test
  public final void test65() {
    reducesTo(
      "(\\t.l) ((\\s.\\i.E) ((\\d.J) (\\c.(\\s.\\a.\\x.(\\e.(\\l.\\i.g) p) (d j) (a (\\u.(\\j.\\g.F) e))) (J (k (\\h.\\g.x k)) (I l))) (\\b.Y c b (\\u.j))))",
      "l"
    );
  }

  @Test
  public final void test66() {
    reducesTo(
      "\\i.\\s.c",
      "\\i.\\s.c"
    );
  }

  @Test
  public final void test67() {
    reducesTo(
      "\\b.\\j.\\j.\\r.f",
      "\\b.\\j.\\j.\\r.f"
    );
  }

  @Test
  public final void test68() {
    reducesTo(
      "\\p.(\\r.\\l.g ((\\r.\\i.(\\p.(\\x.H (\\b.u) Z) (\\a.(\\n.u) y h)) (i e) (\\h.g ((\\j.o) Z) ((\\x.m) d ((\\d.E) q)) (Q ((\\l.f X Y) (\\k.C)))) ((\\k.a) ((\\g.y) ((\\f.Y) ((\\f.w) (C n)))) (\\s.\\s.(\\y.s) q))) ((\\p.t) ((\\j.\\p.\\b.\\l.\\r.\\h.(\\u.M (p h (\\t.n) (U a E))) ((\\k.y) (\\m.(\\o.E) (v N)) u)) (G i (\\y.g) D (\\p.c) ((\\i.\\j.j x) h ((\\o.\\v.r) (\\p.\\e.\\n.N)))))))) (\\e.(\\j.\\c.(\\i.h) q) ((\\i.\\r.(\\c.\\a.(\\h.n) ((\\d.X ((\\h.n) (\\k.r)) ((\\c.(\\s.g) (M x)) (v r))) (F ((\\g.h) ((\\n.o) (\\m.R)))))) (\\k.(\\s.N) ((\\t.\\f.\\v.t) ((\\m.S) C)))) (\\b.\\u.X (\\x.(\\w.\\g.(\\i.\\e.\\f.\\n.d) (I k l) Y) (X (d Z (\\n.q) (n n (u F))) S)))))",
      "\\p.\\l1.g (\\i.H (\\b.u) Z (\\h.g (o) (m (E)) (Q (f X Y))) (a (\\s.\\s.s)))"
    );
  }

  @Test
  public final void test69() {
    reducesTo(
      "\\z.\\r.\\f.\\c.J",
      "\\z.\\r.\\f.\\c.J"
    );
  }

  @Test
  public final void test70() {
    reducesTo(
      "\\r.(\\h.\\z.\\t.I) ((\\i.y a (J J) S) h (\\q.\\p.l q) ((\\v.\\q.x (N g) Y) ((\\w.G k (\\z.J)) (\\c.B)) (b (\\k.\\p.v (S (P b))))) (\\x.f) (N (\\j.(\\r.(\\h.\\p.\\t.J) (l y (\\s.r)) (\\m.\\b.\\s.\\z.\\x.(\\s.g) k) ((\\i.\\d.\\e.s) f ((\\m.o) R))) (\\h.(\\i.\\i.\\j.(\\r.P) (w p) (\\y.\\a.h)) z x))) (y (\\v.h)))",
      "\\r.\\z.\\t.I"
    );
  }

  @Test
  public final void test71() {
    reducesTo(
      "\\j.\\i.(\\b.\\a.J J) f r",
      "\\j.\\i.J J"
    );
  }

  @Test
  public final void test72() {
    reducesTo(
      "(\\b.\\q.\\t.d (\\x.y)) (\\w.k)",
      "\\q.\\t.d (\\x.y)"
    );
  }

  @Test
  public final void test73() {
    reducesTo(
      "\\r.y",
      "\\r.y"
    );
  }

  @Test
  public final void test74() {
    reducesTo(
      "b (R ((\\h.d ((\\y.f) ((\\l.\\a.\\s.\\a.(\\m.z) N) u))) n))",
      "b (R (d (f)))"
    );
  }

  @Test
  public final void test75() {
    reducesTo(
      "(\\q.L) ((\\c.i) (Z (\\b.\\e.(\\e.\\o.\\j.\\s.\\f.\\k.(\\z.(\\q.z) (g F) k (\\s.\\d.\\d.(\\n.R) d) j) (K (\\y.\\x.(\\q.\\i.\\a.\\d.\\e.A) (\\y.\\j.\\r.(\\i.S) (z m))))) ((\\f.\\h.\\r.\\n.(\\j.\\n.(\\f.(\\y.\\h.v) j) (v ((\\v.O) (u z)))) ((\\w.v) (\\g.f) (I d U) ((\\l.\\z.g) r))) ((\\j.c) ((\\i.\\q.\\i.U) (\\e.w)) (\\h.A (\\s.m)))))))",
      "L"
    );
  }

  @Test
  public final void test76() {
    reducesTo(
      "(\\g.\\i.(\\m.(\\y.(\\z.\\d.h O) (\\m.R)) x ((\\g.m) (\\o.(\\k.\\s.\\m.i) (\\o.b))) G) V ((\\v.\\d.p) ((\\w.o (\\s.(\\k.P) (\\g.U d))) U k)) (r (X (\\r.\\t.(\\q.B) (\\c.(\\h.\\g.\\a.f) (w y V) ((\\k.f) (\\a.x) ((\\j.c) (I a))) (\\g.(\\z.a) R)))))) ((\\s.\\m.\\l.\\y.\\b.J) ((\\s.(\\s.a (\\f.\\g.K J)) k) (v (t M (\\x.q) j)) (p (\\z.\\c.y))) (\\i.G (b (\\s.(\\e.(\\f.e) (\\s.A) b P) ((\\h.\\i.q j) (y i (z K)) (\\c.\\w.x (\\m.z c)))))) (\\c.\\u.\\l.\\i.(\\l.c) x (\\y.\\o.\\p.p) (\\a.\\n.(\\s.d) ((\\k.p) g)) (j c (\\a.C) (x x (n h)) h) N (\\w.(\\q.\\p.j) ((\\g.\\e.v) (\\w.z))) (R (\\x.u a m) (\\i.\\x.\\e.\\k.Y) ((\\o.v) (\\r.\\q.y (\\o.\\v.t))))))",
      "\\i.h O G (\\d.p) (r (X (\\r.\\t.B)))"
    );
  }

  @Test
  public final void test77() {
    reducesTo(
      "\\w.r (H z) L (\\c.\\y.b) k ((\\r.o (\\s.\\a.\\h.Y (\\k.c (W (p (R H (\\u.Y)))))) (\\y.Z)) (\\w.c (\\j.u (\\h.c (W Y)))))",
      "\\w.r (H z) L (\\c.\\y.b) k (o (\\s.\\a.\\h.Y (\\k.c (W (p (R H (\\u.Y)))))) (\\y.Z))"
    );
  }

  @Test
  public final void test78() {
    reducesTo(
      "(\\c.R (\\k.X a (\\g.a Q (\\v.B)) (\\c.\\n.W) ((\\j.\\r.\\u.O) ((\\r.s) (\\u.\\a.\\h.q))) t q) ((\\r.\\r.\\f.\\p.(\\d.\\r.(\\f.\\o.w) (\\f.A d)) ((\\a.n) (\\b.e) z) (\\q.f)) (\\v.(\\q.a (\\c.\\g.\\o.y) ((\\t.m) (s F) j)) (\\l.\\c.(\\o.g) t (\\x.x) j)) s (\\g.a H ((\\x.o) (\\i.U w))))) (\\a.\\e.j t)",
      "R (\\k.X a (\\g.a Q (\\v.B)) (\\c.\\n.W) (\\r.\\u.O) t q) (\\p.\\o.w)"
    );
  }

  @Test
  public final void test79() {
    reducesTo(
      "\\l.d g",
      "\\l.d g"
    );
  }

  @Test
  public final void test80() {
    reducesTo(
      "p ((\\l.\\g.P) e ((\\k.\\c.(\\t.z) (\\o.(\\w.W) S ((\\j.\\g.H i) X))) (\\d.f D))) (\\n.P ((\\v.(\\h.\\p.\\a.(\\y.\\d.s s) (x b w) (\\v.\\h.\\g.(\\p.c) (\\x.f))) (\\k.l)) q) (\\n.u (\\u.X))) l",
      "p (P) (\\n.P (\\p.\\a.s s) (\\n.u (\\u.X))) l"
    );
  }

  @Test
  public final void test81() {
    reducesTo(
      "(\\n.b) (\\m.w) r i S ((\\j.\\a.O (\\b.\\x.G)) A) s (\\e.o) m ((\\s.\\x.(\\e.T) ((\\a.\\t.Y) (\\b.H)) (j Q) (\\e.u)) (e (\\d.C) (\\b.\\q.(\\o.\\t.\\f.w) (\\d.L))))",
      "b r i S (\\a.O (\\b.\\x.G)) s (\\e.o) m (\\x.T (j Q) (\\e.u))"
    );
  }

  @Test
  public final void test82() {
    reducesTo(
      "\\t.z",
      "\\t.z"
    );
  }

  @Test
  public final void test83() {
    reducesTo(
      "\\g.u",
      "\\g.u"
    );
  }

  @Test
  public final void test84() {
    reducesTo(
      "\\k.h (r (\\h.\\k.\\t.\\c.\\w.\\l.\\e.i))",
      "\\k.h (r (\\h.\\k.\\t.\\c.\\w.\\l.\\e.i))"
    );
  }

  @Test
  public final void test85() {
    reducesTo(
      "(\\l.\\g.(\\f.\\s.(\\t.\\k.p) ((\\q.\\m.\\w.\\z.(\\v.(\\k.\\a.G) (\\m.(\\t.s) (b h) i)) b v) (\\g.b (\\s.\\k.i)))) ((\\s.s) T)) h",
      "\\g.\\s.\\k.p"
    );
  }

  @Test
  public final void test86() {
    reducesTo(
      "(\\t.N) ((\\e.(\\k.Y) (\\d.z ((\\o.O (G f) (\\l.\\u.l y)) (\\n.k (m y) (X (j a))))) (\\f.\\i.K) (\\z.l)) (g (\\f.x)))",
      "N"
    );
  }

  @Test
  public final void test87() {
    reducesTo(
      "\\j.E",
      "\\j.E"
    );
  }

  @Test
  public final void test88() {
    reducesTo(
      "\\s.\\b.w",
      "\\s.\\b.w"
    );
  }

  @Test
  public final void test89() {
    reducesTo(
      "\\t.I",
      "\\t.I"
    );
  }

  @Test
  public final void test90() {
    reducesTo(
      "\\m.\\k.\\l.\\d.H",
      "\\m.\\k.\\l.\\d.H"
    );
  }

  @Test
  public final void test91() {
    reducesTo(
      "(\\x.(\\j.s) (J q) R ((\\x.(\\l.N) (D y)) (\\w.(\\t.U) (l t))) b ((\\i.\\m.\\l.\\d.(\\r.M (\\p.Y) (\\a.y)) (\\h.l (\\h.y t))) ((\\v.\\p.\\u.v i) ((\\s.e) (V U) (c i (y M))))) (u ((\\v.p) ((\\p.f) ((\\m.K) J) ((\\d.y) (O h) (w F (\\p.G)))))) ((\\l.C (\\p.y k) (\\g.(\\o.\\h.(\\b.I) (\\e.\\m.W)) (\\d.\\a.H (p (\\b.w))))) (\\h.(\\r.\\e.\\c.q (\\j.\\z.j m (\\h.z) j)) (i (p a) (u (f k)) (\\x.(\\z.\\g.m b) (\\t.B)))) (\\d.\\q.\\g.k)) (\\t.h f)) s",
      "s R (N) b (\\m.\\l.\\d.M (\\p.Y) (\\a.y)) (u (p)) (C (\\p.y k) (\\g.\\h.I) (\\d.\\q.\\g.k)) (\\t.h f)"
    );
  }

  @Test
  public final void test92() {
    reducesTo(
      "n (\\s.\\k.b r ((\\k.p ((\\z.\\r.\\k.\\o.i l (\\e.t)) (\\h.\\b.p)) u) s w))",
      "n (\\s.\\k.b r (p (\\r.\\k.\\o.i l (\\e.t)) u w))"
    );
  }

  @Test
  public final void test93() {
    reducesTo(
      "(\\q.u) (\\j.\\i.(\\q.(\\n.(\\v.(\\q.\\y.c (\\i.k (\\h.j u (\\o.U) (z z (Y l))))) (o (\\x.L u))) ((\\e.\\v.N (\\m.p (\\v.\\h.s))) (\\x.\\v.p (\\v.\\l.(\\g.\\y.W) (A u (b H)))) ((\\s.\\v.i W) (B a (\\z.q)) (v x) (\\i.\\i.\\x.(\\a.(\\s.\\o.z) (l D (k u))) (\\m.\\f.\\z.\\l.u))))) ((\\m.\\o.\\y.\\b.\\q.\\x.\\s.\\j.N) (\\e.I I (p G) t ((\\i.S) m Q) (e ((\\b.\\f.G) (\\a.m)))) ((\\y.\\i.I) (\\j.\\o.(\\t.V) (\\b.e) (I (i x))) (\\z.\\k.\\e.(\\m.a w (D z)) (\\o.\\r.\\y.l) (\\f.(\\p.i) (O u) t)) j))) (t ((\\m.h) (\\y.\\v.(\\e.(\\g.(\\d.M) (t I)) (f (\\k.Y))) ((\\n.p) l i) (c x (e x) (q (b d)) (\\u.\\d.\\e.W w (n T) B)) (\\g.z (\\h.M y p (\\h.\\o.E) (\\u.\\z.\\s.s a (\\q.A))))))))",
      "u"
    );
  }

  @Test
  public final void test94() {
    reducesTo(
      "\\g.R ((\\k.\\g.c ((\\k.E) (\\s.h) T (\\b.\\f.\\d.i))) d (\\r.j))",
      "\\g.R (c (E T (\\b.\\f.\\d.i)))"
    );
  }

  @Test
  public final void test95() {
    reducesTo(
      "\\o.(\\l.(\\u.\\p.(\\n.\\v.\\t.\\j.\\x.\\x.\\q.\\c.\\b.\\x.q (x (\\j.M))) (\\t.(\\j.\\b.o) (B b (\\x.j)) (W O)) (o (\\f.(\\l.C) (\\j.b)) (\\x.t) (\\i.\\r.j)) (\\t.\\o.n ((\\n.(\\h.z (\\q.J)) h ((\\o.(\\t.u) (A u)) (\\w.\\u.x s))) (V (n (\\p.(\\f.v) (C z)))))) (\\r.\\z.p ((\\l.\\q.\\z.q b) (\\z.w (\\w.u b) (b b w ((\\d.X) (\\a.X))) (\\o.j))))) k) n",
      "\\o.\\p.\\x.\\x.\\q.\\c.\\b.\\x.q (x (\\j.M))"
    );
  }

  @Test
  public final void test96() {
    reducesTo(
      "\\o.\\l.(\\e.\\w.j) (\\h.(\\l.r) a (\\t.(\\k.\\s.f ((\\x.t) i) (\\v.p)) (\\z.t)))",
      "\\o.\\l.\\w.j"
    );
  }

  @Test
  public final void test97() {
    reducesTo(
      "s (i (M ((\\f.\\r.l) ((\\q.I) (o x) c)) (\\p.\\z.J (\\v.K W (\\h.r) (\\o.\\w.\\v.h)) (c (\\a.e)))) (\\o.t ((\\s.M (r y c)) (a (\\q.y r (\\u.r))) (w i) (\\t.\\i.\\l.\\z.(\\j.n) (\\s.n (\\q.U)) (\\x.z) v))) R)",
      "s (i (M (\\r.l) (\\p.\\z.J (\\v.K W (\\h.r) (\\o.\\w.\\v.h)) (c (\\a.e)))) (\\o.t (M (r y c) (w i) (\\t.\\i.\\l.\\z.n (\\x.z) v))) R)"
    );
  }

  @Test
  public final void test98() {
    reducesTo(
      "(\\n.r (k (W z) (\\l.\\k.\\j.(\\g.\\p.m) ((\\d.e) (\\k.w) (z b (\\t.l))) (h n i (\\y.\\r.M) ((\\v.d) (K l) (\\y.o l (\\n.f))))))) (\\y.\\o.\\v.\\u.i ((\\q.\\c.\\i.t (m (\\q.u))) (\\u.i) q ((\\w.(\\u.j (\\i.P)) (\\d.\\b.r (\\j.q) (H l (\\u.x)))) (n (\\w.\\t.\\z.\\u.(\\j.e) (u X)))))) S (\\z.\\g.\\f.\\l.\\v.u)",
      "r (k (W z) (\\l1.\\k.\\j2.m)) S (\\z.\\g.\\f.\\l.\\v.u)"
    );
  }

  @Test
  public final void test99() {
    reducesTo(
      "(\\j.\\q.\\q.\\g.g) G",
      "\\q.\\q.\\g.g"
    );
  }

  @Test
  public final void test100() {
    reducesTo(
      "\\z.N (\\u.\\r.q) (\\i.\\f.g) (n (\\w.\\d.J) ((\\s.e) (e b) (h ((\\v.\\w.j A) ((\\d.i) (\\e.J)) L))) (\\v.i (f l (\\p.p)) u I W k)) (l b)",
      "\\z.N (\\u.\\r.q) (\\i.\\f.g) (n (\\w.\\d.J) (e (h (j A))) (\\v.i (f l (\\p.p)) u I W k)) (l b)"
    );
  }

  @Test
  public final void test101() {
    reducesTo(
      "(\\w.S) (\\m.m)",
      "S"
    );
  }

  @Test
  public final void test102() {
    reducesTo(
      "\\l.\\z.U (\\r.\\x.\\n.\\j.\\r.\\h.C U (w L (\\o.t ((\\o.p) ((\\v.\\y.l Z) (O R (i d)))) (\\g.(\\k.\\j.h p) h)) (\\b.g)))",
      "\\l.\\z.U (\\r.\\x.\\n.\\j.\\r.\\h.C U (w L (\\o.t (p) (\\g.\\j.h p)) (\\b.g)))"
    );
  }

  @Test
  public final void test103() {
    reducesTo(
      "\\a.\\b.(\\n.g (j C) (\\l.(\\c.Z) ((\\i.g ((\\x.\\q.g (H n) (w u)) x)) (k c)) ((\\w.K) ((\\b.(\\q.A) (\\n.h) (o f (m A)) ((\\x.\\z.Y) r)) (\\t.D)) (\\w.\\p.\\r.(\\n.G) W)))) n",
      "\\a.\\b.g (j C) (\\l.Z (K (\\w.\\p.\\r.G)))"
    );
  }

  @Test
  public final void test104() {
    reducesTo(
      "(\\j.(\\j.Z) ((\\b.(\\i.\\d.J) ((\\k.N) a)) (\\s.\\y.\\k.\\p.X) ((\\t.j N) (s (\\b.a)) (\\b.M (\\z.(\\w.e) Z)))) (\\z.k (\\t.l)) (\\t.(\\f.(\\q.(\\t.\\j.s) (p (\\g.L (\\u.A) y))) (h v ((\\v.j v) (\\o.P)))) ((\\q.z W) e ((\\j.S) k w) (w ((\\a.s) u))))) (X (\\y.\\g.c)) (\\d.(\\e.\\n.(\\x.\\r.\\v.u) (\\l.s) (R (\\t.(\\p.m) (\\u.u g n)))) (p (m (\\r.U)) (\\t.\\c.(\\f.Z) (g u) e) ((\\f.c) ((\\t.F) (M f)) (\\t.B)) (\\z.\\f.(\\e.j) (\\r.j) s (\\l.y) (\\f.m (\\w.a) (\\v.\\e.\\t.f) (\\r.\\j.d (\\m.w) (\\t.k O))))) (l (\\l.m)) (\\j.(\\d.m) (\\d.(\\w.c) V) ((\\k.(\\y.y) ((\\f.\\n.\\z.Q) K)) (\\x.u) v) ((\\b.(\\l.\\j.x) i) t (\\f.(\\n.t) (\\t.o)))))",
      "Z (\\z.k (\\t.l)) (\\t.\\j.s) (\\d.u)"
    );
  }

  @Test
  public final void test105() {
    reducesTo(
      "(\\z.c) d",
      "c"
    );
  }

  @Test
  public final void test106() {
    reducesTo(
      "\\o.\\q.(\\l.r) h ((\\o.\\t.i b (\\l.(\\c.S A (\\n.I) (\\c.(\\m.A) Z) (\\m.q) (\\t.i ((\\e.e) (\\i.t)) j) (z E (\\g.b))) (\\s.\\q.c))) ((\\a.b (\\s.S (\\u.o) (r s (z a)))) m k (\\x.\\c.\\z.(\\r.\\s.\\f.a (\\v.h)) (\\q.\\q.\\l.n)) (\\u.\\x.\\w.\\b.\\h.P (\\t.\\g.(\\i.t) k (\\y.\\a.(\\u.(\\g.r V (b p)) (\\a.\\l.\\s.u) (\\s.\\h.\\y.f)) b)))))",
      "\\o.\\q.r (\\t.i b (\\l.S A (\\n.I) (\\c.A) (\\m.q) (\\t.i (\\i.t) j) (z E (\\g.b))))"
    );
  }

  @Test
  public final void test107() {
    reducesTo(
      "\\u.\\d.\\u.S",
      "\\u.\\d.\\u.S"
    );
  }

  @Test
  public final void test108() {
    reducesTo(
      "\\e.e",
      "\\e.e"
    );
  }

  @Test
  public final void test109() {
    reducesTo(
      "(\\x.\\w.(\\a.\\z.h q) (\\i.(\\m.s (\\w.\\f.\\h.w)) K (\\u.(\\e.(\\k.\\e.i y) r) h) (\\m.J ((\\v.s) p u) (\\z.w)) W) t) ((\\d.(\\w.x) R) (\\n.Z a (\\k.(\\b.W) (\\b.d) (\\b.H (c h)) (\\m.u) (\\w.(\\y.\\e.T) e) (\\l.v)) (r ((\\v.q ((\\b.r) (\\r.C) (\\e.\\x.A x) ((\\e.(\\x.p) (w p)) r))) v))))",
      "\\w.h q"
    );
  }

  @Test
  public final void test110() {
    reducesTo(
      "\\n.e",
      "\\n.e"
    );
  }

  @Test
  public final void test111() {
    reducesTo(
      "(\\q.\\u.\\q.b) u",
      "\\u.\\q.b"
    );
  }

  @Test
  public final void test112() {
    reducesTo(
      "\\g.(\\m.(\\y.\\f.\\z.\\y.\\j.a) ((\\c.g) (\\r.d) (u h q) (\\k.Y) ((\\a.\\t.s (b h)) (\\h.A)) Q) (\\t.\\g.(\\u.(\\r.\\m.q X) ((\\s.N) L) (\\w.z) (\\n.\\k.\\e.b)) (\\n.r (\\p.\\u.\\q.v a ((\\g.a) (g b)) (e ((\\f.Q) (x Z))))) (u a)) (\\a.\\m.\\e.M)) T",
      "\\g.\\y.\\j.a"
    );
  }

  @Test
  public final void test113() {
    reducesTo(
      "(\\e.(\\s.K (f (n q l)) (\\r.\\b.\\f.\\g.\\u.P) b) (f (D (R (\\c.\\d.(\\v.u) (a h) s ((\\b.(\\j.R) (y D)) c))) O))) (\\n.\\n.(\\w.v y) P)",
      "K (f (n q l)) (\\r.\\b.\\f.\\g.\\u.P) b"
    );
  }

  @Test
  public final void test114() {
    reducesTo(
      "(\\j.\\u.\\s.v) ((\\k.(\\j.\\w.\\q.\\y.\\b.j) M) (\\i.(\\i.x) ((\\g.\\u.o) (\\r.\\n.(\\v.\\o.\\i.\\r.a) (Y f (\\w.S)) (\\l.\\n.h (\\o.e) (\\m.\\o.\\k.V) g))) s))",
      "\\u.\\s.v"
    );
  }

  @Test
  public final void test115() {
    reducesTo(
      "O (\\l.j)",
      "O (\\l.j)"
    );
  }

  @Test
  public final void test116() {
    reducesTo(
      "(\\s.(\\z.(\\q.k M) (\\r.(\\q.(\\d.y (u B (s N))) ((\\z.\\p.p) (\\d.(\\t.K) (\\q.B)))) t) e (\\z.j)) (\\o.(\\n.\\f.(\\w.\\d.\\m.\\a.n (\\y.e)) W (\\n.\\v.\\s.f)) l)) (\\y.(\\t.Q) ((\\x.\\p.\\h.\\g.(\\g.\\g.k) ((\\y.w) (\\v.\\h.R) ((\\b.f) (\\a.y)) (\\c.\\y.\\r.\\v.(\\s.\\g.U e (l M) (\\f.\\j.c)) ((\\m.R (\\w.r)) C) (d (\\j.\\o.(\\r.b) (\\c.L) (\\j.b)))))) q))",
      "k M e (\\z.j)"
    );
  }

  @Test
  public final void test117() {
    reducesTo(
      "\\h.(\\k.\\p.\\u.\\o.(\\c.\\u.\\g.h (\\o.I ((\\y.\\y.b ((\\e.x) (\\s.d)) (p (i z (\\e.b)))) (\\j.(\\z.c (y w x)) (\\m.(\\b.j) (\\t.p) a)))) (\\j.(\\d.\\j.\\s.(\\w.(\\s.e) ((\\k.(\\j.W) (C K) v) p)) q) ((\\q.l u) (\\p.(\\z.E) ((\\e.\\k.\\l.b) (\\u.g (e o (\\y.w)))))))) (l (\\f.f))) ((\\z.(\\a.\\l.(\\j.\\x.m) r ((\\x.n) (\\e.(\\d.\\g.j) (\\n.\\v.\\r.r))) (\\g.\\f.s)) (\\q.\\u.\\a.D (\\r.(\\w.\\u.(\\t.z M) (N q (x g))) ((\\l.p) (\\c.(\\u.F) (\\x.N)))) (k (K b (i P) x) (\\s.\\q.(\\q.l (\\s.\\q.n)) (\\t.\\k.J))))) (\\p.v l) (\\j.q (\\p.\\x.\\x.c ((\\p.(\\h.(\\b.H) (\\v.\\v.s c (i N) (p (B t)))) (i q)) (\\c.S)))))",
      "\\h.\\p.\\u.\\o.\\u.\\g.h (\\o.I (\\y.b (x) (p (i z (\\e.b))))) (\\j.\\j.\\s.e)"
    );
  }

  @Test
  public final void test118() {
    reducesTo(
      "\\u.\\s.p",
      "\\u.\\s.p"
    );
  }

  @Test
  public final void test119() {
    reducesTo(
      "\\s.\\f.r",
      "\\s.\\f.r"
    );
  }

  @Test
  public final void test120() {
    reducesTo(
      "\\d.z",
      "\\d.z"
    );
  }

  @Test
  public final void test121() {
    reducesTo(
      "s ((\\l.(\\a.J) (\\v.\\e.\\u.(\\h.\\z.(\\q.\\o.\\q.\\w.x (x x)) ((\\v.\\n.\\o.m) z)) y ((\\e.d (s C (S I)) ((\\y.A) (\\s.r) ((\\z.E) l)) (\\p.r)) (\\k.Z)))) (\\n.\\c.h (I ((\\h.X) ((\\o.W) (\\l.\\h.T g)) H I))))",
      "s (J)"
    );
  }

  @Test
  public final void test122() {
    reducesTo(
      "(\\n.(\\q.T) (\\o.(\\u.d (J (E w) (g (B U)) (O I (p T) (\\b.s)) (\\t.(\\m.(\\m.o) (\\x.b) X) M)) f) (\\a.\\x.K))) a",
      "T"
    );
  }

  @Test
  public final void test123() {
    reducesTo(
      "\\d.(\\o.(\\d.m) (\\t.(\\s.(\\z.b (\\i.V) (\\x.\\k.M) L) (\\a.(\\t.k) ((\\q.a) (\\c.w)) (\\l.c))) (l (\\b.\\z.\\x.\\d.c (X S)) ((\\b.x) ((\\e.W) (n c) (\\m.\\n.m c))) h))) (\\b.B) (\\v.(\\f.E) (\\e.\\x.\\n.o))",
      "\\d.m (\\v.E)"
    );
  }

  @Test
  public final void test124() {
    reducesTo(
      "(\\t.I s) (a (f (\\b.\\t.\\r.r)) Q ((\\x.\\i.\\x.w) (e u (\\c.J) (\\c.v) (\\d.S (\\a.s) Q)))) (N (\\l.q) p) (Y (\\g.(\\y.(\\x.(\\h.\\v.m) ((\\l.J) (\\o.c)) (r (s (E v))) (Y (\\v.\\t.\\g.v) (\\i.\\x.j P))) u) z)) q",
      "I s (N (\\l.q) p) (Y (\\g.m (Y (\\v.\\t.\\g.v) (\\i.\\x.j P)))) q"
    );
  }

  @Test
  public final void test125() {
    reducesTo(
      "p G (\\t.Q) ((\\z.\\l.\\y.\\m.(\\k.\\r.\\b.(\\t.(\\y.\\l.u (\\a.W)) g (\\x.\\u.\\r.y)) G) A) N)",
      "p G (\\t.Q) (\\l.\\y.\\m.\\r.\\b.u (\\a.W))"
    );
  }

  @Test
  public final void test126() {
    reducesTo(
      "(\\l.\\z.(\\n.\\v.(\\s.\\k.(\\x.M (n u v)) Z ((\\g.I g (\\q.K a (\\i.f))) ((\\a.e) (\\l.E) ((\\b.c) (\\b.p))))) ((\\k.x) (\\a.x) l ((\\s.\\o.\\p.r) ((\\u.u) (d r))) (Y m))) (\\z.\\g.\\e.(\\j.e) F) (\\r.(\\r.\\e.(\\g.c (\\b.s)) (\\f.G (h v (\\i.X) (Z b (\\j.s))))) ((\\w.y) ((\\e.\\a.F) (\\d.f R I)) y) (\\v.x ((\\f.\\w.\\g.W) ((\\c.l) (\\o.b)) p) (E (t (\\g.\\t.(\\h.D) (D s) (r w n)))))) ((\\x.\\s.\\q.(\\s.(\\t.F) ((\\l.z) b)) (T V (b m) (i k (\\q.k)) (j o S) (q (\\x.b (\\m.a)) (\\d.g (z C) (\\h.\\n.\\b.r))))) ((\\j.m N (\\x.H ((\\m.Z) D)) ((\\o.l (\\u.F) ((\\a.d) (\\e.n))) (\\b.(\\s.w X) (r (B a))))) e) (\\h.\\q.w))) h",
      "\\z.M (\\e.e) (I (e (c)) (\\q.K a (\\i.f)))"
    );
  }

  @Test
  public final void test127() {
    reducesTo(
      "\\b.\\g.\\v.(\\i.\\i.\\j.i (\\z.u)) l",
      "\\b.\\g.\\v.\\i.\\j.i (\\z.u)"
    );
  }

  @Test
  public final void test128() {
    reducesTo(
      "\\x.(\\f.(\\f.\\c.a) ((\\c.n) (\\x.L) (\\z.\\o.I)) (\\w.\\e.\\z.\\l.v)) (m (\\c.\\d.d)) (\\d.\\u.(\\z.t ((\\h.N) (U u))) M (\\r.(\\c.\\y.u) ((\\e.\\z.\\x.V) (\\m.l r d))) (k (j (\\y.X)) (\\i.\\c.Y))) ((\\j.Z) ((\\q.\\i.(\\n.p) (\\b.W) ((\\h.j) o) (f H (\\m.e) l) (o (\\n.\\f.h))) ((\\z.e (\\s.(\\d.u) (a s) (X (\\a.t)))) (\\y.(\\w.u) ((\\a.e) (\\r.\\h.S b)))))) (\\x.(\\r.l) t) (x (\\g.\\s.(\\f.(\\v.(\\y.(\\e.q) (\\w.i) T d) m) t) O) (\\b.l (\\b.\\y.(\\m.(\\t.(\\e.m (k d) ((\\i.B) (i t))) (F a (G m) (\\f.c))) (d (\\o.\\l.r))) (\\a.\\e.\\g.\\j.g ((\\z.\\l.\\f.\\b.\\z.n) T))) ((\\s.(\\n.n (\\j.\\p.\\k.r)) (\\y.b)) ((\\u.p (\\q.Q) V f) (\\w.\\z.u (s l) (\\r.o m (S P)) (X (\\m.U) a)) (v r (\\x.p) (\\o.\\g.\\v.(\\o.\\n.(\\p.f) ((\\m.S) H)) (w q (g t) (O (\\f.e)))))))))",
      "\\x.a (\\d.\\u.t (N) (\\r.\\y.u) (k (j (\\y.X)) (\\i.\\c.Y))) (Z) (\\x.l) (x (\\g.\\s.q T d) (\\b.l (\\b.\\y.\\g.\\j.g (\\l.\\f.\\b.\\z.n)) (b)))"
    );
  }

  @Test
  public final void test129() {
    reducesTo(
      "\\x.(\\s.k) ((\\r.T) (\\g.\\j.C))",
      "\\x.k"
    );
  }

  @Test
  public final void test130() {
    reducesTo(
      "f (c (\\e.\\l.O (\\u.(\\i.\\g.\\t.g ((\\h.p ((\\h.w) (n S)) ((\\d.\\r.\\q.t) (\\c.s))) (\\b.\\h.\\y.\\x.r ((\\y.\\i.C) (\\x.\\x.H))))) w)))",
      "f (c (\\e.\\l.O (\\u.\\g.\\t.g (p (w) (\\r.\\q.t)))))"
    );
  }

  @Test
  public final void test131() {
    reducesTo(
      "\\v.(\\y.y) i ((\\i.(\\o.z) (\\n.q (\\r.\\l.\\s.(\\e.(\\e.Y) i) (\\n.t (b g (x P)) (Y (\\a.\\l.Z I))) ((\\c.t) (\\w.\\b.\\r.n k v q) ((\\y.\\u.n m) (\\g.\\j.\\x.b) (\\a.A)))))) (\\e.x))",
      "\\v.i (z)"
    );
  }

  @Test
  public final void test132() {
    reducesTo(
      "\\n.(\\w.\\n.(\\q.R (\\m.C (\\h.b (\\m.\\j.g)))) (\\z.(\\r.\\q.\\q.v) (m w j (k g (\\m.z)) (v n)))) ((\\t.\\n.\\x.\\p.w) ((\\t.c (\\a.I W (\\y.h)) (b c (\\u.w) (q u (\\z.e)))) (c (\\y.\\v.H)))) (m Y) (\\i.J) ((\\t.t) ((\\t.\\v.q) (\\r.\\w.k)) (\\k.\\s.\\q.j))",
      "\\n.R (\\m.C (\\h.b (\\m.\\j.g))) (\\i.J) (q)"
    );
  }

  @Test
  public final void test133() {
    reducesTo(
      "g (I ((\\p.(\\m.\\s.\\b.\\z.x) (\\z.n) (\\g.(\\e.q) (\\h.p) m (\\y.(\\z.r) (\\m.p) ((\\t.n) (d k)))) ((\\m.(\\q.b) ((\\h.\\d.H) ((\\t.m) (t j)))) (\\h.\\s.\\t.(\\v.z) q (\\r.s) ((\\o.W) (\\g.v) a))) (a Y (\\m.M) A ((\\r.\\l.\\u.f) ((\\c.S) (y V))) (F (D n (\\g.G)) (q ((\\k.c) x))) (r n (e u) (s y (\\v.k)) (e f (w J) (\\s.l h (\\k.G))) (\\u.y)))) ((\\e.\\h.\\b.(\\r.\\c.\\k.\\z.(\\w.t) (z K)) ((\\i.n e (L p)) (v (b v)))) (\\w.\\l.M) h m)))",
      "g (I (x))"
    );
  }

  @Test
  public final void test134() {
    reducesTo(
      "\\o.b",
      "\\o.b"
    );
  }

  @Test
  public final void test135() {
    reducesTo(
      "\\p.\\d.(\\v.(\\a.p) (\\g.(\\y.h) (\\w.\\d.(\\t.a) ((\\h.o) ((\\f.\\i.\\i.\\b.\\x.i) ((\\k.N) (\\t.M) ((\\t.j) (\\s.Y)) (\\s.\\t.(\\l.\\a.r) (\\p.g)))))))) (K (\\g.(\\f.\\p.e) (\\v.h j (\\r.N) (\\m.x) ((\\p.Z) V ((\\c.y) (\\i.b)))) (\\p.\\w.(\\y.\\p.(\\h.(\\d.T) (\\m.E)) n) z)) ((\\m.z M) ((\\g.\\a.(\\k.c q) (\\w.b l)) ((\\a.R (\\x.K)) (x (B o))) (f t (a C) (\\r.x) (\\o.d))) ((\\s.\\c.(\\j.e a) l) A ((\\h.w (p p (g o))) (\\f.E)) (\\h.q (o a (\\b.p) (y d (u F)) (r (\\e.N)))))) (\\x.e))",
      "\\p.\\d.p"
    );
  }

  @Test
  public final void test136() {
    reducesTo(
      "\\g.n p",
      "\\g.n p"
    );
  }

  @Test
  public final void test137() {
    reducesTo(
      "\\n.\\x.\\m.\\r.\\h.(\\s.L) ((\\r.c ((\\k.(\\f.\\h.B g) ((\\n.d) (\\f.B)) (\\n.k U) (e T (\\r.o) ((\\i.t) t) ((\\e.\\r.g r) (\\f.v)))) b) v) (\\e.\\z.\\g.j))",
      "\\n.\\x.\\m.\\r.\\h.L"
    );
  }

  @Test
  public final void test138() {
    reducesTo(
      "\\a.\\s.(\\u.\\y.A) u ((\\u.Z) (\\y.(\\z.v) r M (\\n.(\\j.\\t.\\r.\\u.\\n.\\g.E) (\\e.\\z.w))))",
      "\\a.\\s.A"
    );
  }

  @Test
  public final void test139() {
    reducesTo(
      "(\\l.t) ((\\a.\\k.\\y.x) (\\m.\\k.z C)) (j (\\s.\\n.\\w.r h))",
      "t (j (\\s.\\n.\\w.r h))"
    );
  }

  @Test
  public final void test140() {
    reducesTo(
      "\\y.T",
      "\\y.T"
    );
  }

  @Test
  public final void test141() {
    reducesTo(
      "a (\\t.W)",
      "a (\\t.W)"
    );
  }

  @Test
  public final void test142() {
    reducesTo(
      "(\\f.\\n.\\t.(\\o.\\i.\\k.c) (\\i.p (\\f.(\\r.b) ((\\h.H j) (c (\\t.f))) (y ((\\x.z v (l X)) S ((\\j.(\\r.P) (\\p.C)) g)) y)))) (\\u.s)",
      "\\n.\\t.\\i.\\k.c"
    );
  }

  @Test
  public final void test143() {
    reducesTo(
      "\\f.\\u.(\\g.i) ((\\z.\\u.\\j.b (\\u.\\f.\\s.(\\u.(\\o.a) (\\i.z (\\y.K))) (k D) (m H)) (\\i.\\u.\\i.O h)) (\\m.\\d.j q))",
      "\\f.\\u.i"
    );
  }

  @Test
  public final void test144() {
    reducesTo(
      "\\r.\\u.T",
      "\\r.\\u.T"
    );
  }

  @Test
  public final void test145() {
    reducesTo(
      "\\u.\\x.\\o.\\q.p",
      "\\u.\\x.\\o.\\q.p"
    );
  }

  @Test
  public final void test146() {
    reducesTo(
      "\\e.(\\z.n) m",
      "\\e.n"
    );
  }

  @Test
  public final void test147() {
    reducesTo(
      "\\n.(\\g.(\\t.\\v.\\y.\\s.(\\p.e (\\v.c ((\\h.\\l.s v) (j X (\\b.z))))) (e k J (\\t.\\t.a h) (\\q.\\v.f) z) (K ((\\e.u e (\\q.p) w) (\\h.(\\a.\\a.d w) (\\q.G P)) (\\e.(\\f.T (f (g r))) ((\\a.g) (\\e.a) ((\\v.e) g)))))) ((\\g.\\n.\\u.(\\l.\\c.J (M s)) ((\\t.(\\v.b) u y) ((\\h.\\t.\\u.g) ((\\k.z) B)))) ((\\t.(\\m.\\a.(\\e.u H) (d (l r))) C) (y d)) (\\n.W))) (Z Y) (l (\\u.M))",
      "\\n.\\y.\\s.e (\\v.c (\\l.s v)) (K (u (\\h.\\a.d w) (\\q.p) w (\\e.T (Z Y (e) (Z Y r)))))"
    );
  }

  @Test
  public final void test148() {
    reducesTo(
      "\\z.\\o.t (G (\\e.\\z.\\t.(\\a.(\\w.(\\u.(\\o.R) (\\c.v) r) (\\f.(\\o.V) (\\h.N) ((\\o.s) (\\x.k))) (\\a.(\\f.f) ((\\m.\\u.u W) L))) ((\\v.\\c.t (q c) (\\n.A)) e (\\b.y))) (\\v.k) ((\\f.\\b.\\h.n) H (\\o.r))))",
      "\\z.\\o.t (G (\\e.\\z.\\t.R r (\\a.\\u.u W) (\\h.n)))"
    );
  }

  @Test
  public final void test149() {
    reducesTo(
      "\\u.\\s.\\a.\\l.(\\a.(\\p.\\v.m O) ((\\v.\\k.m) (\\z.\\q.l (\\y.\\j.\\a.(\\x.w) x P H) (\\m.\\j.\\o.(\\w.p) ((\\w.(\\e.u) (\\c.P) g) (q (x r) (\\i.\\s.k m)))))) (\\o.\\p.w)) (\\v.\\p.(\\d.\\r.b i) (\\n.n) (\\b.\\w.(\\e.o) (\\y.j) (\\b.u j)) ((\\i.(\\p.\\c.f) (\\n.Y G K)) o) (u (t E)) (\\t.\\i.P) ((\\u.(\\e.e) (\\k.p) p ((\\v.n) ((\\t.g) (f F)))) (f m (\\d.D) (\\q.R k (K q)) (\\r.n (\\e.q) (\\v.u))) (y (\\o.\\s.(\\j.\\c.q) Z)) B) ((\\b.i) (\\e.\\c.W) (n (\\h.\\o.(\\s.(\\c.\\c.e) (\\o.i l)) (m T (A o) (S (a n)))) v) Z))",
      "\\u.\\s.\\a.\\l.m O"
    );
  }

  @Test
  public final void test150() {
    reducesTo(
      "(\\u.\\z.(\\z.\\o.\\j.\\j.O (\\m.\\f.\\l.\\n.o g)) R (\\b.l)) ((\\a.i) (\\e.\\a.M) ((\\v.F ((\\i.o) (u c)) (\\l.\\o.(\\f.\\b.Q) (h o (u O)))) e)) (S ((\\x.\\a.(\\h.(\\y.\\h.z) ((\\n.\\d.Y e) (\\r.D a (\\f.d)))) ((\\d.f) (M u) (\\k.\\q.u) (\\w.\\p.o j u t))) e)) k b",
      "O (\\m.\\f.\\l1.\\n.l)"
    );
  }

  @Test
  public final void test151() {
    reducesTo(
      "k l (\\b.x ((\\z.j K) (q (\\a.c) (t D (\\g.l) (H P (\\u.z))) (\\p.s) p) ((\\j.(\\g.E) ((\\k.f) z) ((\\i.D) e j)) G T (\\f.\\n.(\\o.\\f.u ((\\f.\\w.j (a s (\\h.t))) (g T (a C) (\\i.\\v.\\h.L)))) (\\k.j)))))",
      "k l (\\b.x (j K (E (D G) T (\\f.\\n.\\f.u (\\w.j (a s (\\h.t)))))))"
    );
  }

  @Test
  public final void test152() {
    reducesTo(
      "(\\h.\\u.m) (\\m.\\a.(\\y.\\o.\\a.\\z.\\a.R (z p) ((\\q.\\s.\\a.(\\l.\\i.(\\g.m) ((\\s.a) (g l))) (\\n.\\g.(\\h.\\v.w) (E U (\\d.F)))) (M E (\\g.e)) w) (O (\\b.(\\g.\\e.(\\g.(\\s.u) (\\x.q) V) (D ((\\j.s) (y z)))) ((\\k.(\\v.E) r ((\\y.E) x)) (\\h.v))) ((\\s.o) ((\\u.k) y)))) (P P ((\\f.m) (\\a.z (\\t.(\\u.r a X) (S (i k))) (\\u.p ((\\s.v k (\\x.i)) (\\a.\\m.b))))) (E (\\l.\\l.\\s.r))))",
      "\\u.m"
    );
  }

  @Test
  public final void test153() {
    reducesTo(
      "(\\s.\\q.\\c.a (\\x.(\\a.(\\b.\\a.P) (\\m.(\\t.o) ((\\e.(\\a.c) (\\o.j)) (\\p.d)) (o (\\v.\\w.j (e w) (N (\\j.i)))))) (\\a.k (\\p.\\c.\\v.\\y.\\h.z l (L i)) E (\\c.x)) (\\z.w Q))) ((\\h.W (\\i.Y)) (h ((\\u.u) (A (\\i.\\a.\\s.n)))))",
      "\\q.\\c.a (\\x.P)"
    );
  }

  @Test
  public final void test154() {
    reducesTo(
      "\\s.h",
      "\\s.h"
    );
  }

  @Test
  public final void test155() {
    reducesTo(
      "\\g.(\\w.(\\v.\\u.\\a.\\i.d) u) (C X)",
      "\\g.\\u.\\a.\\i.d"
    );
  }

  @Test
  public final void test156() {
    reducesTo(
      "(\\k.(\\f.(\\y.(\\a.\\c.(\\s.m) (T U) (\\c.y J)) (\\u.g)) (\\g.(\\z.\\c.\\o.(\\j.\\f.f) X) (c e (\\s.l) (c y S))) ((\\m.(\\x.R) F) (\\r.\\t.N))) (\\t.s) u v) (\\e.\\m.p (\\h.W))",
      "m (\\c2.\\c.\\o.\\f.f) u v"
    );
  }

  @Test
  public final void test157() {
    reducesTo(
      "\\a.r (\\s.(\\v.O (\\k.v) (\\v.\\y.(\\h.b h (\\w.\\d.h (h b) (f f (\\c.D)) (g w (\\a.v) (\\k.v k (q g))))) (H u (\\f.\\i.(\\r.c M (t m) n) (\\c.v)))) ((\\n.(\\p.\\j.\\z.K e) (p (\\q.\\g.r G))) r (w ((\\d.r) (\\h.d) (P h (\\a.q))) z) (\\v.(\\k.\\d.p) (\\f.z d a ((\\h.\\f.t) ((\\j.m) (t H) (\\k.\\p.q))))))) (v ((\\q.(\\o.m) (\\n.q) ((\\n.E) (U m))) (\\l.\\s.\\r.(\\h.e) ((\\l.C) k)) (\\u.\\m.Y)) a ((\\h.(\\w.(\\k.j) (Z B)) R (\\d.n) m u) (i i))))",
      "\\a.r (\\s.O (\\k1.v (m (E) (\\u.\\m.Y)) a (j (\\d.n) m u)) (\\v.\\y.b (H u (\\f.\\i.c M (t m) n)) (\\w.\\d.H u (\\f.\\i.c M (t m) n) (H u (\\f.\\i.c M (t m) n) b) (f f (\\c.D)) (g w (\\a.v) (\\k.v k (q g))))) (K e))"
    );
  }

  @Test
  public final void test158() {
    reducesTo(
      "(\\p.\\i.u) ((\\w.M) P (\\f.(\\z.(\\z.l) U) (\\p.(\\y.C) ((\\i.d) v)))) r",
      "u"
    );
  }

  @Test
  public final void test159() {
    reducesTo(
      "f (U ((\\q.N V ((\\c.W) (\\f.R))) (E m) ((\\c.B (\\s.g)) (p (\\b.F)) (\\s.l)))) (\\z.p) (\\t.J C ((\\t.(\\n.(\\b.\\l.\\u.j) (\\k.F (s r (Y r) S))) O) (I ((\\z.g) U)))) (\\o.\\w.u)",
      "f (U (N V (W) (B (\\s.g) (\\s.l)))) (\\z.p) (\\t.J C (\\l.\\u.j)) (\\o.\\w.u)"
    );
  }

  @Test
  public final void test160() {
    reducesTo(
      "(\\a.p) (\\f.o (\\j.\\s.x) (\\i.\\y.Y) (\\j.\\h.E)) (\\l.\\q.(\\v.\\o.(\\d.(\\y.\\o.z) w) (n U ((\\b.\\c.(\\z.n) F ((\\m.j) T) (\\j.V (s O) i)) (D (C (\\h.s)) ((\\j.m) f (\\f.f)))))) j) (s ((\\v.\\n.\\i.m) (\\w.(\\u.\\i.F l) ((\\i.H) m ((\\d.\\m.A u (A H) (y l (L y))) (t (U o (\\e.v)))) (\\h.Y (\\y.x))))))",
      "p (\\l.\\q.\\o.\\o.z) (s (\\n.\\i.m))"
    );
  }

  @Test
  public final void test161() {
    reducesTo(
      "S (f (b (\\r.(\\t.o) (\\t.j k c ((\\t.m) (\\i.w))) c) ((\\i.m) a)) (\\o.(\\i.\\x.(\\e.\\x.\\g.\\s.\\s.\\j.B) ((\\c.\\p.A) ((\\p.W (d x)) (u F p)) (\\k.(\\r.\\r.\\o.d) (\\l.h) (p (z s) (\\u.(\\d.v) (M g)))) (\\t.\\u.(\\n.y) (\\n.y k (A l) (\\e.h) (\\n.n))))) (\\q.\\d.\\y.(\\g.\\j.\\y.(\\g.y (\\t.F) (\\v.\\v.N) ((\\z.L) Q ((\\x.b) l) (\\t.O))) (G ((\\r.\\f.i r) ((\\m.s) (\\n.q)) g))) ((\\l.p) (\\d.r) l (\\h.(\\a.\\g.\\q.u d n (\\l.g o)) (\\a.\\z.\\l.(\\o.\\r.r) (\\c.\\j.i)) (k (g Q) (S (U q)) (Z (s z) (\\c.(\\d.R) (a N)))))))))",
      "S (f (b (\\r.o c) (m)) (\\o.\\x.\\x.\\g.\\s.\\s.\\j.B))"
    );
  }

  @Test
  public final void test162() {
    reducesTo(
      "\\i.(\\k.Y (\\s.\\x.V w l) J (\\t.\\i.n)) (y (h s) (\\y.\\z.O) ((\\x.l g) (k (\\e.\\d.\\b.(\\d.a) ((\\s.R) ((\\h.\\y.w y) m) (i M P q ((\\x.o C (\\d.M)) j)))))))",
      "\\i.Y (\\s.\\x.V w l) J (\\t.\\i.n)"
    );
  }

  @Test
  public final void test163() {
    reducesTo(
      "\\y.\\f.\\h.n (\\z.(\\l.\\v.\\r.\\q.\\b.p) g) ((\\c.(\\p.X) (\\v.\\a.(\\u.R v A (\\f.g w)) h) ((\\m.x) (\\x.\\h.d))) (\\r.(\\r.R ((\\x.a) J) (\\a.m (\\d.r) (\\j.A))) ((\\t.H) Q (\\e.w h (N m)) (\\r.p)) (\\z.R)) ((\\q.(\\b.x Q) (\\k.d)) (\\s.\\y.\\c.b (\\o.b)) s)) (\\k.h)",
      "\\y.\\f.\\h.n (\\z.\\v.\\r.\\q.\\b.p) (X (x) (x Q s)) (\\k.h)"
    );
  }

  @Test
  public final void test164() {
    reducesTo(
      "(\\r.\\k.\\s.E) (A (\\i.(\\n.\\f.\\v.\\g.(\\v.\\k.\\v.K (\\i.(\\o.\\w.i) (\\t.\\v.M))) (B (\\x.v) (\\d.\\u.V) (\\t.\\d.\\j.\\m.m) ((\\a.h) ((\\o.(\\a.k) (\\l.f)) (\\n.E))))) (\\f.\\q.P) (\\g.j)))",
      "\\k.\\s.E"
    );
  }

  @Test
  public final void test165() {
    reducesTo(
      "\\g.(\\q.(\\c.\\m.Z (\\u.(\\p.\\a.g ((\\r.\\g.\\e.q) ((\\w.c) O))) (\\n.(\\g.j) (Q C) (e h (n k)) (\\j.(\\p.u S (z C)) (n Z)) A) (\\u.(\\f.\\w.z N ((\\t.(\\s.q) (Q m)) (z u q)) (\\l.\\u.B)) ((\\k.O) H ((\\y.w U) (\\t.\\p.A o (\\l.w) (m J (A A)))))))) ((\\c.\\m.(\\v.\\n.\\l.p) (u ((\\z.K) (\\t.z) j ((\\a.\\x.\\v.V) (\\h.\\v.x j))) (w ((\\b.O) (o n) ((\\g.I) (y D)) (u g))))) H)) (o (\\z.\\f.\\y.g))",
      "\\g.\\m.Z (\\u2.g (\\g1.\\e.o (\\z.\\f.\\y.g)))"
    );
  }

  @Test
  public final void test166() {
    reducesTo(
      "\\w.\\r.B",
      "\\w.\\r.B"
    );
  }

  @Test
  public final void test167() {
    reducesTo(
      "\\d.u",
      "\\d.u"
    );
  }

  @Test
  public final void test168() {
    reducesTo(
      "(\\a.\\d.V) (\\z.g ((\\n.\\w.S E k ((\\q.M) (\\j.x)) (u d (\\e.O) J)) (\\t.\\f.(\\w.U (\\e.p a)) J) (\\p.R) (\\p.o) ((\\d.D) ((\\k.g (i (F (\\o.z)))) (u (z (\\p.G)) (t ((\\u.s) (\\z.W))))) ((\\b.n) (\\t.i r) ((\\l.\\p.(\\r.\\e.A) (j y x)) (\\g.(\\t.Z) ((\\f.u) (l Z))) (\\m.K))))))",
      "\\d.V"
    );
  }

  @Test
  public final void test169() {
    reducesTo(
      "(\\b.\\f.\\y.(\\p.(\\p.\\r.\\d.q) N) (O (\\b.\\t.(\\j.\\n.\\g.\\q.p) ((\\t.(\\m.S) (\\a.Q) ((\\r.o) (u w))) (P (\\t.E) (M j (\\q.C))) (K d)))) G) u",
      "\\f.\\y.\\d.q"
    );
  }

  @Test
  public final void test170() {
    reducesTo(
      "J n (\\d.(\\c.(\\p.c X) (\\o.(\\y.\\y.r) (\\m.l g u) ((\\m.d) (M L) ((\\v.q) (w h)))) ((\\y.s (\\d.x)) (\\l.(\\w.S) (y l) (\\s.Y)) ((\\s.\\a.s n n q) ((\\h.z i (\\i.d)) (a M (m N)))))) (z s) (\\i.H (i (\\i.w ((\\c.O) (\\j.y d (k c))))) (g (t ((\\u.z) (\\v.P x (o a) w)))))) m",
      "J n (\\d.z s X (s (\\d.x) (\\a1.z i (\\i.d) n n q)) (\\i.H (i (\\i.w (O))) (g (t (z))))) m"
    );
  }

  @Test
  public final void test171() {
    reducesTo(
      "\\r.(\\f.j A) R",
      "\\r.j A"
    );
  }

  @Test
  public final void test172() {
    reducesTo(
      "\\r.\\s.i",
      "\\r.\\s.i"
    );
  }

  @Test
  public final void test173() {
    reducesTo(
      "(\\b.\\h.\\z.(\\w.W (\\z.\\m.o)) H) ((\\x.c) r ((\\x.b) g) (\\f.u)) (\\i.\\c.w ((\\u.\\x.\\b.(\\a.h (F (t H))) (\\o.h (\\c.(\\u.a) (\\l.x))) ((\\f.U) ((\\a.m (k e)) (\\f.(\\m.A) (\\m.E)))) (B (\\n.\\c.e ((\\a.\\g.\\g.U) (\\y.v q (\\o.f))))) (O q)) (\\r.(\\f.s) ((\\z.\\h.(\\f.o) (v E) I ((\\z.w (\\c.x)) (\\g.\\q.\\u.z)) (p (K (\\k.h o)))) (\\k.\\i.k)))))",
      "\\z.W (\\z.\\m.o)"
    );
  }

  @Test
  public final void test174() {
    reducesTo(
      "\\o.(\\y.\\a.\\b.(\\k.(\\m.\\i.P) p (\\e.(\\g.s) ((\\z.\\c.(\\a.e e) (\\g.\\k.Q)) v) Y) (\\w.l)) f) (\\z.(\\m.J) (\\x.\\u.L))",
      "\\o.\\a.\\b.P (\\w.l)"
    );
  }

  @Test
  public final void test175() {
    reducesTo(
      "\\m.f",
      "\\m.f"
    );
  }

  @Test
  public final void test176() {
    reducesTo(
      "\\h.\\a.i",
      "\\h.\\a.i"
    );
  }

  @Test
  public final void test177() {
    reducesTo(
      "\\q.(\\q.(\\b.\\u.(\\v.z j j g) (P (f c (\\o.f))) (d ((\\p.f) (V F) (\\q.\\e.D T)))) (\\l.\\a.\\q.(\\w.Y) A)) ((\\a.\\i.(\\e.\\b.c) ((\\c.K) (\\x.q) b)) (\\q.\\z.(\\z.p) (\\m.(\\s.X) ((\\n.o) q))) (n w (m d) (\\h.l Q (\\x.h)) (r (v P) (\\p.n)) L)) (y (\\k.\\d.\\e.\\d.\\f.\\i.L l) (\\v.\\j.\\d.\\y.\\b.(\\a.(\\t.\\d.c m (s x) (z V (B s))) ((\\j.\\l.f Y) (z d (j G))) (\\m.(\\d.O) (\\e.(\\y.q) (H w) (t (\\g.o))))) e)) y ((\\f.(\\h.o) u (\\w.\\i.\\l.J (\\t.\\o.V) (a R))) (o ((\\t.x) (q t (\\g.f)) F (\\y.K) (k (\\p.(\\f.(\\t.l) (\\h.s)) (N (\\z.s))) ((\\p.\\d.\\b.\\k.s u h) (n i g m))) (\\p.t))))",
      "\\q.z j j g (d (f (\\q.\\e.D T))) y (o (\\w.\\i.\\l.J (\\t.\\o.V) (a R)))"
    );
  }

  @Test
  public final void test178() {
    reducesTo(
      "\\c.S r",
      "\\c.S r"
    );
  }

  @Test
  public final void test179() {
    reducesTo(
      "(\\b.\\y.t) (\\l.N (\\q.\\z.t) (\\i.(\\e.\\q.\\r.\\l.\\l.G (t (s T (t K) d))) (a (\\y.i) i ((\\y.Q) (\\u.T)) (v (b (\\p.x) (\\k.i (w x)))))) r (\\l.\\k.s ((\\u.\\b.d ((\\q.a) (\\m.o) ((\\s.b) Q)) ((\\k.k) (\\e.W (\\n.t)) (\\h.\\j.q (r E (k h))))) g) (r (u (\\w.\\d.(\\b.Z) (\\u.v) ((\\l.A) (\\x.r)) ((\\s.h) (\\k.i) (\\s.\\g.r h)) (\\k.\\g.R))))))",
      "\\y.t"
    );
  }

  @Test
  public final void test180() {
    reducesTo(
      "\\r.H r",
      "\\r.H r"
    );
  }

  @Test
  public final void test181() {
    reducesTo(
      "\\k.(\\d.V) (\\d.\\i.\\b.\\j.\\b.\\c.\\x.(\\t.(\\h.e) ((\\l.\\g.R) m)) H (S (S (\\b.e w (f u) (i (G L)))) (\\y.v u (a a) p e (\\k.\\m.\\g.O)))) ((\\t.(\\d.(\\n.L) (\\n.\\s.w)) (\\z.\\h.\\z.r) (S ((\\f.o) (\\a.T) (c x (e o))) (k q (\\r.o) (d M q) (\\f.\\p.\\f.\\c.B))) (L (\\t.k (j u) (\\w.(\\y.w) (C a))) B (\\k.r (\\i.K) (\\e.\\q.\\r.B) w c))) (\\p.r ((\\c.r) (\\p.t) (\\h.\\p.H) M) ((\\d.n) (v (G k) (o (\\e.a))) ((\\s.\\g.y) (v d (\\d.L)) (\\y.T O (\\x.u) (o (\\x.e))))) (\\t.\\g.\\j.\\y.P))) (\\d.(\\b.i) (\\x.\\l.\\w.(\\i.u) h))",
      "\\k.V (L (S (o (c x (e o))) (k q (\\r.o) (d M q) (\\f.\\p.\\f.\\c.B))) (L (\\t.k (j u) (\\w.w)) B (\\k.r (\\i.K) (\\e.\\q.\\r.B) w c))) (\\d.i)"
    );
  }

  @Test
  public final void test182() {
    reducesTo(
      "(\\t.\\e.y) ((\\p.(\\v.\\f.(\\y.M) j) w) ((\\t.\\u.e) ((\\b.K) (\\c.\\m.\\n.u ((\\h.K) (\\e.S) (O w n))) (\\v.(\\x.U ((\\w.w) (\\e.f)) (m (\\l.\\c.Q S))) (\\y.(\\k.(\\u.A) (g t) (\\b.\\n.j M)) (\\o.\\s.a (\\y.l i)))))) g)",
      "\\e.y"
    );
  }

  @Test
  public final void test183() {
    reducesTo(
      "u (A (\\x.\\m.C ((\\n.\\c.\\c.E) (u a (G d))) U (\\t.\\n.(\\n.\\m.(\\h.\\f.s b) ((\\l.A) (\\n.T)) (\\z.l p ((\\g.c) (T q)))) (\\i.(\\e.(\\f.O) t ((\\z.d) (D a))) (\\o.\\r.\\s.\\z.k))) (\\p.r ((\\b.j l) (\\l.c)))) ((\\z.Q) (\\q.p) (\\h.h)))",
      "u (A (\\x.\\m.C (\\c.\\c.E) U (\\t.\\n.\\m.s b) (\\p.r (j l))) (Q (\\h.h)))"
    );
  }

  @Test
  public final void test184() {
    reducesTo(
      "\\d.C",
      "\\d.C"
    );
  }

  @Test
  public final void test185() {
    reducesTo(
      "\\m.x (\\h.\\y.b)",
      "\\m.x (\\h.\\y.b)"
    );
  }

  @Test
  public final void test186() {
    reducesTo(
      "(\\x.b (\\a.\\w.\\g.(\\e.\\g.u A) w ((\\d.\\i.\\y.e) (y m (\\a.m))) j (\\h.\\n.w) k (\\u.h ((\\t.\\u.w w (\\s.O) (\\j.f) n) ((\\b.W L) (\\b.t)) (\\z.\\u.w ((\\n.M) (\\o.E))))))) ((\\c.\\h.\\o.(\\w.\\b.q) E ((\\k.\\c.y r) l) (\\t.t) s) (\\u.\\j.I) ((\\b.\\g.\\j.n) (\\v.\\r.j)) (\\e.\\k.D))",
      "b (\\a.\\w.\\g.u A j (\\h.\\n.w) k (\\u.h (w w (\\s.O) (\\j.f) n)))"
    );
  }

  @Test
  public final void test187() {
    reducesTo(
      "\\n.\\l.(\\s.\\e.\\u.(\\y.\\v.\\x.\\q.m) (\\z.j i)) ((\\f.B) ((\\i.(\\j.f) ((\\m.\\a.\\j.b) Q) V) (d ((\\g.V) ((\\b.\\p.\\w.v) (\\b.(\\a.R) (i V)))))) (\\r.\\z.h)) l",
      "\\n.\\l.\\u.\\v.\\x.\\q.m"
    );
  }

  @Test
  public final void test188() {
    reducesTo(
      "s (f ((\\o.(\\v.S ((\\u.\\c.\\y.u) (\\e.d (g p)))) ((\\n.F) (\\p.m))) m) K) (w y)",
      "s (f (S (\\c.\\y.\\e.d (g p))) K) (w y)"
    );
  }

  @Test
  public final void test189() {
    reducesTo(
      "(\\h.(\\e.(\\c.C X) (\\z.\\j.n) P f ((\\l.F (\\l.f) G ((\\g.z) (\\j.(\\i.g) b)) k) m)) (a (\\o.K) ((\\o.\\n.E) (\\a.d) (\\i.\\n.\\l.d ((\\t.m) (v p)) (\\v.(\\l.l) (\\r.F G))) ((\\u.p h K) (o F (V p)) (W E ((\\v.L) e)) (\\e.a)))) (\\n.F)) (\\w.(\\i.i) ((\\p.\\x.T h) (\\c.Y e (u t))) (\\y.g ((\\z.\\j.\\n.S) ((\\p.i) (\\d.T)))) y (\\q.(\\a.\\q.C) (\\t.(\\g.m) (\\w.(\\d.\\z.b R) (i j (j J)) (j q I F)))) (\\b.\\u.\\d.U (\\n.\\g.\\q.\\q.\\a.(\\k.r (\\t.D) M) (\\h.T) R ((\\i.\\c.k (\\z.(\\d.p p) (\\w.t J))) c))) v)",
      "C X P f (F (\\l.f) G (z) k) (\\n.F)"
    );
  }

  @Test
  public final void test190() {
    reducesTo(
      "t ((\\g.y (\\v.N)) (e o) ((\\c.\\r.A) ((\\y.x w ((\\c.\\k.(\\r.Z) n l) (f U (b d) (\\y.(\\o.a) (\\z.j))))) (\\k.m ((\\y.X (\\a.G) (\\q.(\\r.A) (\\i.i))) (\\x.(\\u.b) (\\z.(\\w.a) (h x)))))) (\\x.P)))",
      "t (y (\\v.N) (A))"
    );
  }

  @Test
  public final void test191() {
    reducesTo(
      "(\\t.\\l.\\n.\\i.X w) ((\\r.(\\h.b) ((\\i.g ((\\h.L) t)) (b (\\h.\\t.q m)))) (y ((\\g.\\j.\\b.W) (Y y (\\s.E))) n)) (\\q.\\b.\\q.\\e.(\\o.l l p) (s (J Y) M)) I s",
      "X w"
    );
  }

  @Test
  public final void test192() {
    reducesTo(
      "(\\r.n) (\\u.(\\c.b (\\h.z P) (a (\\h.\\p.(\\v.C) d ((\\j.e) (l l))) G (\\y.\\r.c (\\i.\\d.i)))) (\\g.\\k.p)) ((\\c.\\i.(\\t.m S ((\\z.\\f.D) (r q C)) k) (n g (\\a.M) (\\s.(\\q.f) w) ((\\z.\\v.\\f.l) ((\\c.s) (\\k.F))) (r (p j) (\\o.\\i.r y) ((\\v.g) (M Z))))) (\\j.\\b.(\\o.\\s.\\o.\\a.\\r.\\s.k) (\\q.t)) ((\\e.(\\a.F m) (\\f.\\b.\\z.\\e.(\\t.m) (S X))) (\\g.J ((\\o.(\\i.e) z) (\\i.\\b.\\x.u))) ((\\a.\\a.\\o.\\e.O L c) W ((\\d.\\w.\\r.\\n.(\\b.m) (\\b.c)) ((\\c.\\m.w k) (\\e.(\\q.g) (\\j.v))))) (\\e.(\\l.x) (\\a.(\\s.\\y.(\\c.r) ((\\r.\\a.\\v.Y) s)) (n (\\c.\\x.K) ((\\i.b) ((\\i.g) (n w))))))) (\\a.p))",
      "n (m S (\\f.D) k (\\a.p))"
    );
  }

  @Test
  public final void test193() {
    reducesTo(
      "(\\g.G) ((\\m.(\\f.(\\t.\\i.F) ((\\p.\\k.\\e.Q) (\\t.\\b.\\y.(\\f.U) ((\\b.d) n) (\\y.i i (\\h.t) m))) (\\m.q)) a) (\\v.u))",
      "G"
    );
  }

  @Test
  public final void test194() {
    reducesTo(
      "(\\i.\\z.B) u ((\\a.u b ((\\h.c E) (i p))) (\\q.\\l.(\\y.t) (\\n.T))) (\\v.\\l.(\\r.m) (T (u (e a (h n) (\\m.j b)))) (f ((\\v.z) f)) o) (\\n.\\x.\\n.\\d.u)",
      "B (\\v.\\l.m (f (z)) o) (\\n.\\x.\\n.\\d.u)"
    );
  }

  @Test
  public final void test195() {
    reducesTo(
      "(\\v.(\\v.\\v.\\v.\\a.\\x.Z (\\d.X)) ((\\b.(\\q.c) ((\\t.h ((\\w.Q) C)) (r (\\w.x y (\\b.a x (E t))))) ((\\a.\\b.(\\h.X (\\g.b)) g) g (\\p.U))) (\\a.\\w.\\e.(\\o.w ((\\n.d) D (\\a.(\\n.z) (\\s.g)) ((\\r.\\j.e r) (S h (\\r.s))) (\\x.\\l.j))) (\\c.\\k.I)))) k",
      "\\v.\\v.\\a.\\x.Z (\\d.X)"
    );
  }

  @Test
  public final void test196() {
    reducesTo(
      "L (\\h.y) ((\\n.d) (\\b.(\\h.N) ((\\u.\\s.o) (\\p.v)) (\\q.\\w.\\o.\\u.\\k.r) C ((\\i.v) (\\l.\\p.(\\y.\\v.\\v.\\b.\\g.\\a.x) (\\g.\\t.\\a.(\\u.\\i.\\k.(\\e.J) (p j)) (j L (l f) (\\t.u))))) A))",
      "L (\\h.y) (d)"
    );
  }

  @Test
  public final void test197() {
    reducesTo(
      "(\\a.k) ((\\k.\\p.b c) (\\f.(\\q.y) (E b))) ((\\f.k) ((\\q.\\u.x O) (\\l.(\\o.k) (\\e.z)))) (w h) (\\e.\\b.\\g.G (E (C ((\\k.k) H) (c (F t (\\l.n)))))) o (\\w.(\\q.(\\q.\\n.S (y a (g E))) (\\h.x (\\b.N) (\\w.(\\z.T) (\\j.p)))) ((\\h.U (D j)) e (L z)) (\\e.b) ((\\v.\\z.X) s) (\\f.K)) o",
      "k (k) (w h) (\\e.\\b.\\g.G (E (C (H) (c (F t (\\l.n)))))) o (\\w.S (y a (g E)) (\\z.X) (\\f.K)) o"
    );
  }

  @Test
  public final void test198() {
    reducesTo(
      "\\q.d",
      "\\q.d"
    );
  }

  @Test
  public final void test199() {
    reducesTo(
      "\\z.\\f.P",
      "\\z.\\f.P"
    );
  }

  @Test
  public final void test200() {
    reducesTo(
      "\\w.(\\a.(\\e.\\y.W) ((\\e.\\r.o) ((\\a.u ((\\a.\\s.\\s.B (\\j.G S)) (\\p.q))) e)) ((\\m.\\t.d ((\\r.(\\e.s) (\\d.z) (\\f.S d (\\s.z))) (\\z.P))) I p i)) (\\l.\\v.\\t.u)",
      "\\w.W"
    );
  }

  @Test
  public final void test201() {
    reducesTo(
      "U ((\\e.\\u.\\z.\\c.\\t.\\w.\\v.J (X y) (L d (j U)) d) ((\\u.o) (F x) (b (\\a.e)) (\\r.\\y.H (X n (n q))))) (\\g.\\x.u ((\\l.(\\a.(\\n.L) (\\d.p)) (\\i.o)) q) (m (\\q.\\l.n (\\k.(\\q.w U) (\\y.\\e.u))))) (J t (\\h.\\x.\\n.(\\p.(\\p.\\f.E) ((\\l.j) y)) ((\\t.\\i.X) (R U (\\y.n)))) (\\c.\\g.o (\\y.\\x.\\s.Q) (c (\\t.j) (a o Q) (I (t x (e z))))) (\\a.(\\k.\\c.(\\k.\\n.\\j.\\o.R F (\\b.h)) ((\\e.h b (I d)) (o (\\w.N))) (\\x.(\\a.E (\\x.X G)) (\\r.m))) (\\x.i))) (f (\\f.b)) ((\\t.W) ((\\d.\\u.k) (\\t.\\b.g)) Q)",
      "U (\\u.\\z.\\c.\\t.\\w.\\v.J (X y) (L d (j U)) d) (\\g.\\x.u (L) (m (\\q.\\l.n (\\k.w U)))) (J t (\\h.\\x.\\n.\\f.E) (\\c.\\g.o (\\y.\\x.\\s.Q) (c (\\t.j) (a o Q) (I (t x (e z))))) (\\a.\\c.\\j.\\o.R F (\\b.h))) (f (\\f.b)) (W Q)"
    );
  }

  @Test
  public final void test202() {
    reducesTo(
      "s ((\\o.(\\o.l (\\q.W ((\\h.(\\c.\\e.(\\m.b c) I) (\\r.k)) (F h (Q k) p (\\b.p))))) (\\w.\\u.\\i.(\\z.(\\x.(\\s.\\o.\\k.(\\a.\\p.S) (\\y.(\\w.s h) M)) ((\\e.\\t.X y) (\\h.L) x)) M) (\\n.\\g.\\r.\\y.t))) (\\c.\\q.\\x.X))",
      "s (l (\\q.W (\\e.b (\\r.k))))"
    );
  }

  @Test
  public final void test203() {
    reducesTo(
      "s (G (Y b)) (\\e.l)",
      "s (G (Y b)) (\\e.l)"
    );
  }

  @Test
  public final void test204() {
    reducesTo(
      "(\\p.s) (\\d.\\y.g ((\\o.\\u.s) (\\c.\\o.X) ((\\j.(\\k.\\q.k) (q x (o c))) (s (v l (\\r.y)))) (\\r.\\c.(\\a.(\\i.(\\k.T) T ((\\k.a) Y)) i) (\\i.n (u b d (z y y)))) (\\h.x) ((\\x.\\v.f (\\j.h) (p (\\l.(\\g.c) (J u) (\\k.(\\f.g) (N e))) (\\a.(\\m.(\\t.(\\a.b) (H L)) (Y (\\m.p))) E))) ((\\b.f ((\\l.\\p.l) s)) (\\v.\\b.(\\q.\\w.\\o.\\l.D z c) ((\\i.s) (j j) (\\i.d O (\\e.m))) ((\\b.u) (\\t.Y) m n))))))",
      "s"
    );
  }

  @Test
  public final void test205() {
    reducesTo(
      "(\\o.\\g.\\m.\\p.\\v.\\h.A (\\k.\\v.(\\c.T ((\\c.m) ((\\t.a) I) ((\\a.R c (\\h.w)) (\\l.(\\v.s) (J h))) (P (\\u.(\\s.C) J)) (X h))) (x ((\\g.N) D)))) (\\z.T)",
      "\\g.\\m.\\p.\\v.\\h.A (\\k.\\v.T (m (R (x (N)) (\\h.w)) (P (\\u.C)) (X h)))"
    );
  }

  @Test
  public final void test206() {
    reducesTo(
      "\\e.(\\i.(\\w.G (\\x.q (o (\\q.\\l.\\q.M))) (\\d.h) i) (O (V o (\\d.(\\e.\\v.W) (C (X q (\\d.I)))) (\\o.Z)))) (u u (\\j.\\u.\\y.(\\g.\\w.a (\\c.Y)) ((\\d.\\n.\\t.\\j.(\\f.g) (\\k.b)) (\\n.p (\\a.\\p.\\w.O))) ((\\w.\\i.y V) (w c (\\p.N)) (S (T (q A))) (Y l)) (g ((\\s.\\x.\\t.R (b (\\w.\\e.X m))) (d (\\e.c) (\\r.z) (\\o.v)))))) (\\d.\\e.\\z.\\k.E k)",
      "\\e.G (\\x.q (o (\\q.\\l.\\q.M))) (\\d.h) (u u (\\j.\\u.\\y.a (\\c.Y) (g (\\x.\\t.R (b (\\w.\\e.X m)))))) (\\d.\\e.\\z.\\k.E k)"
    );
  }

  @Test
  public final void test207() {
    reducesTo(
      "\\g.U",
      "\\g.U"
    );
  }

  @Test
  public final void test208() {
    reducesTo(
      "(\\h.\\w.(\\i.m) h) h",
      "\\w.m"
    );
  }

  @Test
  public final void test209() {
    reducesTo(
      "\\x.\\d.(\\k.\\x.(\\t.\\v.\\q.l (\\i.\\t.B (\\c.(\\u.e) ((\\l.\\m.v ((\\e.W) (\\a.u))) h)) (\\v.o))) (f (l (\\v.(\\t.P) ((\\f.(\\o.u (a P)) (\\e.q (\\s.p))) (y (\\j.G (f k)))))) (\\o.\\l.l c))) (\\v.(\\r.r) ((\\x.\\v.(\\c.(\\d.j T) (\\l.(\\x.(\\q.T) (\\i.\\o.\\d.T)) (\\m.\\a.(\\t.p) (\\k.e) (\\z.I r))) (\\l.c Y ((\\p.j N) (e (\\l.y (\\z.T)))))) ((\\h.j) ((\\q.(\\g.\\s.\\b.b) (n g (\\e.R))) (\\r.\\q.(\\h.e u) (f (F Z)))) (\\b.(\\w.(\\w.p (\\x.\\i.v)) (m Y (f R) (c (\\l.g)))) a))) v))",
      "\\x.\\d.\\x.\\v.\\q.l (\\i.\\t.B (\\c.e) (\\v.o))"
    );
  }

  @Test
  public final void test210() {
    reducesTo(
      "\\g.\\p.\\n.b (\\i.(\\n.\\i.\\w.l) ((\\l.(\\w.l) G) (\\a.(\\r.v) (\\x.\\j.\\b.\\a.j)) (\\f.w (h (\\x.\\a.d P) d (\\b.X)) (\\h.G))))",
      "\\g.\\p.\\n.b (\\i.\\i.\\w.l)"
    );
  }

  @Test
  public final void test211() {
    reducesTo(
      "d ((\\o.G) (\\x.\\j.\\y.\\x.\\m.B)) (\\o.S)",
      "d (G) (\\o.S)"
    );
  }

  @Test
  public final void test212() {
    reducesTo(
      "(\\y.q) (\\q.(\\w.\\w.g) H) (\\r.(\\o.\\d.(\\j.o (\\y.\\w.d) c (\\p.(\\o.\\c.(\\o.i (n v) (g (z G))) (\\g.p v j ((\\q.K) (\\t.g))) (Z (\\p.\\l.\\u.r) (\\f.(\\q.h a) (X q)))) (\\s.(\\w.j) t l))) (u (Z H) P)) x)",
      "q (\\r.\\d.x (\\y.\\w.d) c (\\p.\\c.i (n v) (g (z G)) (Z (\\p.\\l.\\u.r) (\\f.h a))))"
    );
  }

  @Test
  public final void test213() {
    reducesTo(
      "(\\o.\\i.(\\e.y) (\\m.\\y.(\\y.U) ((\\b.\\c.(\\o.c) (\\p.(\\w.m) (T B)) (\\r.n)) (\\q.E W r ((\\y.m) w) x))) (t ((\\p.c (B b) (\\r.g) (\\p.u)) (\\n.N (\\q.j d (\\m.f)) (\\c.S)) S)) ((\\r.\\b.\\w.l) (\\z.(\\h.\\h.\\d.o) (v B (\\r.o))) C (\\j.(\\f.\\e.W) ((\\r.\\l.p f) (e z (g m)) (\\e.u))) ((\\q.(\\m.\\d.w b) (\\g.b X (\\a.a)) (G s (\\o.y) Z)) (\\c.(\\c.r) (\\v.d) (o b (\\f.\\w.\\z.r))) (\\r.(\\s.i) ((\\p.y o (\\q.(\\f.B) (r d))) (\\y.(\\b.\\s.s) (\\t.e))))) (\\s.\\z.z))) (\\h.\\y.\\w.\\g.(\\f.(\\l.F) x) (A C (\\d.y (\\f.\\r.x (\\b.\\k.(\\c.J) (a t) P (\\n.c (\\n.G))) (\\g.(\\l.l F (l Y) ((\\q.w) (\\g.P))) (\\z.\\n.j s) ((\\q.n (\\m.A h (\\y.j))) (Y w)))))))",
      "\\i.y (t (c (B b) (\\r.g) (\\p.u) S)) (l (w b (\\r.i)) (\\s.\\z.z))"
    );
  }

  @Test
  public final void test214() {
    reducesTo(
      "\\e.\\p.d (y w)",
      "\\e.\\p.d (y w)"
    );
  }

  @Test
  public final void test215() {
    reducesTo(
      "\\q.c",
      "\\q.c"
    );
  }

  @Test
  public final void test216() {
    reducesTo(
      "\\l.a ((\\n.v) (\\s.\\r.P))",
      "\\l.a (v)"
    );
  }

  @Test
  public final void test217() {
    reducesTo(
      "(\\w.\\m.(\\r.\\d.(\\v.(\\z.\\s.K) ((\\j.x) W)) (\\h.\\o.\\h.e)) ((\\i.t) c (\\b.(\\s.L) z) (\\y.x (\\v.R) (C (\\u.G))))) X (\\m.(\\o.t) (\\s.J)) (\\o.(\\e.(\\f.(\\r.H) (\\v.w) (V b (\\b.D))) (K h) (j (l j a)) (\\s.H (\\n.(\\o.s) (\\l.(\\h.o L) (t S))))) (\\v.r (\\k.h L (\\r.B) (\\z.b)) p (k U ((\\a.q) (\\m.N)) b ((\\h.\\o.\\z.(\\y.\\r.y) g) c)))) l (\\i.\\p.r (\\p.\\q.e (\\f.(\\d.l) (\\i.\\k.n)) (\\y.(\\s.(\\l.B K n) (\\r.\\b.z) ((\\h.\\g.m I) g)) (l ((\\x.\\v.\\t.y) (\\g.a v (B L))))) ((\\f.\\r.G (C (\\r.\\j.(\\l.\\f.h) (x U (\\s.p))))) d)) ((\\l.(\\t.E) ((\\k.(\\l.t) (\\w.L) ((\\c.j) (p w))) t)) o ((\\u.\\k.e) w) (a (\\m.r) (\\b.f C (\\r.c) r c) (\\t.(\\e.\\y.\\k.(\\q.\\l.\\c.i) (\\k.(\\n.\\e.j) (\\u.\\w.u))) ((\\r.h) (\\y.\\u.B) (\\e.y))) (\\u.\\v.\\s.m))))",
      "K (\\i.\\p.r (\\p.\\q.e (\\f.l) (\\y.B K n (\\g.m I)) (\\r.G (C (\\r.\\j.\\f.h)))) (E (\\k.e) (a (\\m.r) (\\b.f C (\\r.c) r c) (\\t.\\y.\\k.\\l.\\c.i) (\\u.\\v.\\s.m))))"
    );
  }

  @Test
  public final void test218() {
    reducesTo(
      "\\e.(\\c.\\n.(\\q.\\z.\\a.\\y.x) (\\z.(\\e.k) (\\q.\\m.\\k.\\n.\\y.Y)) (\\f.(\\d.\\n.Q) (\\j.v y (Y D)) (\\q.(\\i.E) ((\\k.h) t)) (w (D (\\w.L h (Y t)))) ((\\d.u) (\\v.\\w.S)) (\\n.(\\c.u (k M) (\\s.\\u.\\n.h)) (\\f.W (w (q r))) (j D b) ((\\s.u) P (p (\\e.\\a.l) ((\\e.n) c))))) ((\\m.C) I)) (\\g.(\\t.(\\x.(\\x.\\a.q K) (n S b)) (\\u.\\e.S) ((\\a.Q (l f G)) (\\a.\\p.(\\f.m) (t m) (k k I))) (p (\\j.\\n.\\k.\\m.X ((\\m.q) i (\\b.Y v)))) ((\\g.T) (a O) (\\y.\\q.P e) (\\m.\\v.(\\s.l D) ((\\h.y) (p t))) (\\h.(\\g.N) ((\\t.y a (\\z.g)) ((\\k.d) l))) (\\r.P (\\w.(\\p.T e (\\n.p)) (\\a.q l (S w)) (\\c.(\\x.Q) H))))) K q)",
      "\\e.\\n1.\\y.x"
    );
  }

  @Test
  public final void test219() {
    reducesTo(
      "\\f.s (\\h.\\x.r)",
      "\\f.s (\\h.\\x.r)"
    );
  }

  @Test
  public final void test220() {
    reducesTo(
      "\\a.\\n.y (G ((\\e.h f (\\y.F) ((\\p.j) (Q R))) g y (\\w.\\d.\\w.\\u.(\\i.(\\l.m (\\z.x)) (h (d a)) ((\\x.\\p.\\z.m) b)) (\\f.(\\u.\\x.(\\a.O) (\\p.B) (l y u)) (d d (\\z.z) (\\u.(\\k.B) (\\f.d))))) (\\p.w (b (\\u.\\j.q)) (\\k.s)))) e",
      "\\a.\\n.y (G (h f (\\y.F) (j) y (\\w.\\d.\\w.\\u.m (\\z.x) (\\p.\\z.m)) (\\p.w (b (\\u.\\j.q)) (\\k.s)))) e"
    );
  }

  @Test
  public final void test221() {
    reducesTo(
      "\\d.w Y",
      "\\d.w Y"
    );
  }

  @Test
  public final void test222() {
    reducesTo(
      "(\\c.P) (\\p.(\\s.(\\d.\\i.\\c.\\l.N) ((\\o.\\a.(\\o.w) z (\\a.G ((\\f.E) (l K))) e (\\v.\\r.q (z W) (\\a.\\x.\\x.b) (h y) f)) (\\t.(\\g.(\\t.\\v.\\s.U (\\u.i V)) H) (q T (t x) (s (\\j.x)) Q) x))) (c (\\a.\\x.x)))",
      "P"
    );
  }

  @Test
  public final void test223() {
    reducesTo(
      "\\l.a v (\\f.(\\n.j (\\o.\\w.i n n)) (\\u.K G) (\\f.\\a.\\g.(\\x.\\m.(\\g.\\e.(\\j.x) z i) (\\j.f)) ((\\v.\\e.(\\g.(\\y.\\d.\\e.\\n.z (\\w.u)) (\\a.y (i m) ((\\q.j) (A Y)))) ((\\m.h z) (\\g.\\k.(\\w.c) ((\\c.Q) (x z))))) ((\\k.C j (q K) (J X) (h o)) y)) (\\h.(\\c.\\k.w) ((\\q.\\q.(\\e.\\x.p) (\\k.\\j.r)) (\\a.I) A (\\k.(\\l.v (\\f.b (\\d.g N))) (\\v.K))))))",
      "\\l.a v (\\f.j (\\o.\\w.i (\\u.K G) (\\u.K G)) (\\f.\\a.\\g.\\e.\\d.\\e.\\n.z (\\w.u)))"
    );
  }

  @Test
  public final void test224() {
    reducesTo(
      "\\g.\\c.\\w.\\r.e",
      "\\g.\\c.\\w.\\r.e"
    );
  }

  @Test
  public final void test225() {
    reducesTo(
      "\\i.\\c.y",
      "\\i.\\c.y"
    );
  }

  @Test
  public final void test226() {
    reducesTo(
      "\\e.(\\o.o) y",
      "\\e.y"
    );
  }

  @Test
  public final void test227() {
    reducesTo(
      "(\\s.I) ((\\z.W) (\\w.\\d.\\m.v)) (\\w.\\h.\\d.P (\\o.\\p.\\f.\\k.d (\\i.\\q.(\\b.x) (\\a.(\\j.y z) a)) (\\o.\\j.r) g ((\\p.\\u.\\f.\\f.(\\a.S ((\\b.X o (\\p.I)) (\\x.\\r.k z)) ((\\c.w) L v ((\\b.t e (k s)) (\\h.p o d)))) (\\z.\\h.k)) A)))",
      "I (\\w.\\h.\\d.P (\\o.\\p.\\f.\\k.d (\\i.\\q.x) (\\o.\\j.r) g (\\u.\\f.\\f.S (X o (\\p.I)) (w v (t e (k s))))))"
    );
  }

  @Test
  public final void test228() {
    reducesTo(
      "(\\i.u) ((\\k.\\y.\\t.(\\g.(\\x.\\g.(\\h.j (g B v) L ((\\r.y (\\w.\\t.L d)) (f t x))) u) l) (\\m.\\d.\\t.h k)) ((\\e.w l ((\\c.(\\d.d) (K H) (r f (\\y.l)) (Y (j (n b))) ((\\m.J) (\\t.\\h.e h) (\\k.\\b.(\\o.\\l.f) (\\g.\\l.g)))) (\\u.(\\z.(\\w.b) s ((\\z.y) Q)) (M (\\k.\\k.I s)) (\\t.O (\\k.\\k.j h (\\c.m) (\\e.Q e)))))) (\\s.\\q.\\e.(\\c.\\b.\\u.o (\\c.\\r.y)) (\\s.(\\y.Q) h))))",
      "u"
    );
  }

  @Test
  public final void test229() {
    reducesTo(
      "\\x.\\s.(\\c.k) J",
      "\\x.\\s.k"
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
