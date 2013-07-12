package lambdacalc;

import static org.junit.Assert.assertEquals;
import lombok.val;
import org.junit.Test;

public final class TestBetaReducer3 extends TestLambdaCalc {

  @Test
  public final void test0() {
    reducesTo(
      "\\n.\\g.u ((\\q.(\\k.a) (\\m.r (z V))) (\\e.\\u.\\l.(\\a.\\n.\\p.Q (\\w.\\i.\\h.\\x.(\\z.u l) (i p ((\\w.\\a.c G) (Z N (u r)))))) (\\i.\\u.\\d.(\\k.r) O)) (O (\\y.\\u.(\\e.r (\\s.(\\e.(\\z.\\y.v) V) (\\h.r))) (U ((\\g.\\v.\\h.\\n.\\l.\\f.z) ((\\c.(\\c.l) (\\l.m)) (\\a.P (z o)))))) e))",
      "\\n.\\g.u (a (O (\\y.\\u.r (\\s.\\y.v)) e))"
    );
  }

  @Test
  public final void test1() {
    reducesTo(
      "(\\o.D) (\\b.o (\\b.(\\v.t ((\\x.N) (\\i.q) ((\\o.N) (\\a.k))) (z O (F e) (\\b.J (\\l.r)) (t (g J) (\\u.(\\n.f) (\\b.z))))) n)) g (\\h.z (i (e (\\x.\\d.(\\l.Y) (\\f.z t))) (d (\\t.e)) p ((\\w.\\x.(\\k.\\u.\\v.w) Z ((\\p.(\\y.x) (\\m.w)) (n (\\d.E))) b ((\\h.y) v)) (y o ((\\v.I) (o z)) d T m))))",
      "D g (\\h.z (i (e (\\x.\\d.Y)) (d (\\t.e)) p (\\x.y o (I) d T m (y))))"
    );
  }

  @Test
  public final void test2() {
    reducesTo(
      "(\\g.w) ((\\d.x) (\\g.i (l f) (\\f.\\v.(\\k.\\g.(\\w.J) X) w ((\\d.\\l.\\h.\\x.O) (\\w.(\\d.(\\e.z (q n) (E I (y b))) (\\x.\\t.w)) (A G))))))",
      "w"
    );
  }

  @Test
  public final void test3() {
    reducesTo(
      "G ((\\j.L) ((\\s.\\t.Z) (f ((\\a.e) (\\j.v)) (o g) ((\\c.\\v.Z E) (\\k.\\a.B) s)))) (D ((\\x.f) O ((\\e.\\f.\\m.W (x (\\s.f D (\\h.b))) (B (\\w.e (\\y.r)))) ((\\m.(\\a.t (w e)) (\\x.w)) i)))) E",
      "G (L) (D (f (\\f.\\m.W (x (\\s.f D (\\h.b))) (B (\\w1.t (w e) (\\y.r)))))) E"
    );
  }

  @Test
  public final void test4() {
    reducesTo(
      "\\o.\\t.\\b.b",
      "\\o.\\t.\\b.b"
    );
  }

  @Test
  public final void test5() {
    reducesTo(
      "(\\q.o (\\a.l)) (f (x U (\\h.\\u.(\\a.c (\\p.\\u.y)) K A) (\\s.\\j.(\\s.h o) (g V r (\\o.\\k.\\p.c) ((\\m.i) P (\\v.S (p g))) (\\x.g ((\\v.\\u.N v) ((\\l.y) (\\s.T)))))))) ((\\o.\\r.u) (\\m.y) ((\\o.\\a.x O) (\\y.k) (\\r.\\p.x) f ((\\w.c) Y) (d (\\m.(\\v.\\q.\\m.g) z (\\o.e o h s)) (\\u.S))) (Y ((\\v.q) e)))",
      "o (\\a.l) (u (Y (q)))"
    );
  }

  @Test
  public final void test6() {
    reducesTo(
      "(\\g.(\\m.a (\\s.\\x.\\s.(\\i.\\f.\\w.\\d.n) d ((\\k.j (Z f) (\\v.j (i r)) (\\e.a e (\\v.q) (\\i.\\n.i F)) (\\x.i)) D))) (\\b.w)) (o (\\i.\\e.N))",
      "a (\\s.\\x.\\s.\\w.\\d.n)"
    );
  }

  @Test
  public final void test7() {
    reducesTo(
      "\\w.O",
      "\\w.O"
    );
  }

  @Test
  public final void test8() {
    reducesTo(
      "\\n.\\f.l",
      "\\n.\\f.l"
    );
  }

  @Test
  public final void test9() {
    reducesTo(
      "\\j.(\\n.L (\\w.\\y.(\\m.\\t.\\a.\\d.Y) W)) w",
      "\\j.L (\\w.\\y.\\t.\\a.\\d.Y)"
    );
  }

  @Test
  public final void test10() {
    reducesTo(
      "(\\m.\\g.b) (\\v.\\u.q ((\\z.(\\h.\\t.n (z M c)) (\\w.\\m.\\v.(\\p.\\f.S ((\\r.\\s.u) ((\\z.h) (\\n.R)) (I f (m Q) (\\g.\\t.Y h)))) B)) z))",
      "\\g.b"
    );
  }

  @Test
  public final void test11() {
    reducesTo(
      "\\c.(\\i.\\i.(\\e.x (\\b.\\u.(\\a.\\o.\\n.K) t (a j (\\j.c) (\\i.G (l Q)))) (\\h.(\\a.\\d.\\o.\\r.j) (\\t.K L) ((\\c.\\c.\\d.a q) P)) (\\h.\\q.\\e.z (\\r.\\e.\\z.\\n.p g (P O)) (\\s.\\l.\\i.\\r.r (d e (\\u.I) I)) A)) (F ((\\t.(\\y.(\\v.l) (k d) (\\d.\\e.\\i.b)) (h O (v w) e)) (P (\\d.H ((\\w.e) (k e)))) (V (z C (\\a.o)))))) ((\\z.\\l.\\f.u) K (\\b.\\i.\\z.c (\\e.K) (q (\\h.i u R (\\w.z)) j) (W ((\\t.(\\a.\\w.w i) N) (o (\\u.\\f.\\t.j)) (\\h.\\z.v))))) (\\i.j)",
      "\\c.x (\\b.\\u.\\n.K) (\\h.\\o.\\r.j) (\\h.\\q.\\e.z (\\r.\\e.\\z.\\n.p g (P O)) (\\s.\\l.\\i.\\r.r (d e (\\u.I) I)) A)"
    );
  }

  @Test
  public final void test12() {
    reducesTo(
      "\\k.\\d.\\x.(\\t.(\\a.P (m (\\r.G) (\\k.\\g.\\h.f (\\h.\\w.\\o.(\\i.v) i)))) (\\f.\\k.(\\n.(\\p.m) I s) (\\h.t))) (d (k (s V (\\s.L) (\\n.b) (B H (\\g.J) (u g (\\f.q))) E))) (R (a y (\\z.G) (t K (k f)) E I (\\k.\\n.\\q.\\j.\\q.\\b.t ((\\e.M) (m Z) (\\j.w)) (o (\\u.z))) (H (u (M p)) h ((\\n.Q ((\\h.R) (\\p.L))) (\\p.\\b.\\b.\\u.o p Y)) (\\w.t ((\\r.c) b (X i e) (\\i.I (\\w.v))))))) ((\\c.l) (\\r.\\t.\\r.\\o.f E (e (C (\\c.R)) (i w (\\p.i) (G (w a))) c) (\\h.(\\y.(\\e.p) ((\\w.\\i.\\m.o) (Q r (\\n.u))) (\\q.i)) (\\r.S)) ((\\o.(\\e.\\v.\\u.\\s.g) (\\s.F (u y))) ((\\c.(\\k.\\v.\\e.w) w) (\\s.\\g.\\w.j (\\u.l u)) (v d C) (\\t.(\\r.e) (L u) U (\\l.\\t.o) ((\\s.(\\y.v) (\\h.m)) (j M) (\\k.\\v.(\\f.\\v.d) (\\w.\\g.q))))))))",
      "\\k.\\d.\\x.P (m (\\r.G) (\\k.\\g.\\h.f (\\h.\\w.\\o.v))) (R (a y (\\z.G) (t K (k f)) E I (\\k.\\n.\\q.\\j.\\q.\\b.t (M (\\j.w)) (o (\\u.z))) (H (u (M p)) h (Q (R)) (\\w.t (c (X i e) (\\i.I (\\w.v))))))) (l)"
    );
  }

  @Test
  public final void test13() {
    reducesTo(
      "\\u.\\n.\\w.(\\n.J) (\\d.t ((\\d.b) (\\j.(\\k.(\\o.s) ((\\i.z) e) (s (\\x.m))) (n (\\f.(\\x.f) (m B)) c) c) f))",
      "\\u.\\n.\\w.J"
    );
  }

  @Test
  public final void test14() {
    reducesTo(
      "\\g.\\j.v",
      "\\g.\\j.v"
    );
  }

  @Test
  public final void test15() {
    reducesTo(
      "(\\w.\\h.(\\x.\\m.E) (\\v.r ((\\w.f) K) (e y ((\\o.\\b.\\k.\\c.k) (\\n.l z (q d) (Y t) e)))) (\\i.V)) (B ((\\h.H ((\\x.a (\\u.F)) (\\f.a)) (\\o.\\f.M) (\\a.j (T r (X e) (\\w.\\v.t c) (\\f.\\q.(\\a.\\z.F) (\\q.q i))))) (\\a.\\d.q)) (\\b.\\q.p))",
      "\\h.E"
    );
  }

  @Test
  public final void test16() {
    reducesTo(
      "(\\p.\\j.\\b.\\p.\\v.\\t.j) (p (\\m.(\\j.(\\d.(\\v.\\i.\\u.F) ((\\o.r) (\\q.E))) (\\f.I)) (v (a (\\f.\\w.K a))) (\\b.c))) G P",
      "\\p.\\v.\\t.G"
    );
  }

  @Test
  public final void test17() {
    reducesTo(
      "H ((\\v.b) (\\c.l) ((\\i.(\\d.\\s.y) (\\b.C)) (p A)) ((\\z.Q) W (\\f.\\q.\\b.m) ((\\u.a) (\\o.t) q) (d (w M (s w)) p) (n (\\y.\\d.(\\k.\\b.t) (\\d.(\\s.Y) (o C) (\\k.\\h.J)))) (V x)) B)",
      "H (b (\\s.y) (Q (\\f.\\q.\\b.m) (a q) (d (w M (s w)) p) (n (\\y.\\d.\\b.t)) (V x)) B)"
    );
  }

  @Test
  public final void test18() {
    reducesTo(
      "(\\i.\\i.l) ((\\z.Z) (\\t.f (n (\\h.F)))) (g (\\f.(\\r.\\a.(\\b.\\q.\\u.(\\x.e) e (\\n.\\w.\\e.(\\l.v) (\\e.W)) ((\\k.G) f ((\\l.m) (\\c.d)) ((\\s.T) (z V) p))) (\\b.P (\\b.R (G G (m r)) (m H)))) ((\\g.\\p.\\a.\\b.(\\w.d s) (\\a.s)) ((\\v.g (\\r.(\\y.H) g) (X x)) ((\\x.\\p.\\k.k) x (\\p.\\r.\\j.(\\h.m) (\\g.L) (\\x.u))))))) ((\\n.j) (\\z.\\t.q (\\q.o (\\r.\\g.(\\v.k n) n) (e (\\k.\\x.o c) t) (\\v.(\\p.h) (x h k (\\w.\\h.c t)) (\\x.u)) ((\\v.\\g.v) ((\\d.(\\h.\\k.k) w) (n y (\\u.N) (\\d.\\i.s c)) R)))))",
      "l (j)"
    );
  }

  @Test
  public final void test19() {
    reducesTo(
      "\\o.(\\w.\\b.\\y.(\\w.\\q.z s) ((\\g.S) ((\\z.E (o x (\\a.x) T)) (\\r.(\\y.\\p.(\\t.\\n.b) ((\\u.f) (\\q.m))) (\\d.\\s.i))))) (h ((\\i.\\i.\\l.w) n ((\\d.\\e.\\k.l) (u P (v j)))) v (C (\\e.\\y.d (\\i.j (\\c.F g (\\o.p)) (j O))))) (\\z.\\y.j) (\\d.(\\c.\\f.i h C (\\m.n (\\w.r))) (L j))",
      "\\o.\\q.z s"
    );
  }

  @Test
  public final void test20() {
    reducesTo(
      "\\i.\\q.k f (\\h.i)",
      "\\i.\\q.k f (\\h.i)"
    );
  }

  @Test
  public final void test21() {
    reducesTo(
      "(\\e.r ((\\c.\\n.\\e.(\\x.w) b) (\\n.(\\i.\\i.A) g))) h",
      "r (\\n.\\e.w)"
    );
  }

  @Test
  public final void test22() {
    reducesTo(
      "(\\q.b (O (\\o.c ((\\e.j (\\p.\\x.(\\p.W h) I)) (\\x.n))))) (\\x.\\e.c) (\\k.(\\r.\\w.\\w.k ((\\z.\\b.(\\o.y s) (\\j.\\x.f)) S) ((\\p.(\\y.(\\g.(\\y.c) (j s)) (m g i)) (d (q (K u)))) (t i (\\e.A) J ((\\p.b) (\\a.(\\i.C) v)))) (\\r.\\z.(\\y.H) (\\z.\\f.\\v.i H (\\o.s) y (\\u.v (\\s.\\q.S)) (\\x.\\m.\\j.q)))) (\\y.\\q.(\\m.(\\u.\\z.D) t) (c (\\m.(\\o.f) (\\o.\\u.e)))) (\\q.\\e.(\\n.\\c.(\\c.g) (\\c.\\p.r (u h) (\\h.j))) (\\v.(\\q.(\\p.\\y.\\z.m u (b c) (\\q.\\g.x) ((\\x.U P) j)) (\\y.\\v.s)) (F ((\\u.\\g.t H) ((\\w.d) B) B))) ((\\s.(\\m.m) ((\\t.(\\o.z) (\\y.O)) (F V (\\b.d)))) (R (\\p.(\\f.o) ((\\v.v) (C o)))) (\\u.\\p.(\\g.\\j.\\f.(\\e.\\v.r) (\\s.\\d.J) t) (\\m.\\f.(\\m.\\h.(\\m.x) Q A) (\\g.\\a.z))) (\\a.\\c.(\\b.q) (\\p.q)))))",
      "b (O (\\o.c (j (\\p.\\x.W h)))) (\\k.\\w.k (\\b.y s) (c) (\\r.\\z.H))"
    );
  }

  @Test
  public final void test23() {
    reducesTo(
      "(\\k.(\\w.(\\n.\\n.\\i.W) (\\p.M (\\a.Z))) (h (\\n.(\\p.\\o.(\\b.(\\j.j) D) (\\x.\\o.(\\p.o g) V)) ((\\x.(\\q.\\q.n e) (\\k.s A (G E))) H o))) ((\\k.(\\r.\\n.O) ((\\u.\\t.n) ((\\s.y (\\r.G)) (\\z.e)))) J)) h",
      "\\i.W"
    );
  }

  @Test
  public final void test24() {
    reducesTo(
      "\\a.U (w (\\y.l)) r",
      "\\a.U (w (\\y.l)) r"
    );
  }

  @Test
  public final void test25() {
    reducesTo(
      "(\\i.\\i.m) ((\\z.J) (\\f.\\v.\\o.b (\\j.j)))",
      "\\i.m"
    );
  }

  @Test
  public final void test26() {
    reducesTo(
      "(\\u.(\\k.(\\e.H ((\\u.(\\y.\\j.n) r) (l (\\q.(\\e.f) (l k))))) (\\p.b)) y ((\\e.(\\w.n a) (c ((\\l.U) u)) (\\m.V) (\\u.(\\z.\\z.J) ((\\z.h) (\\b.t) (\\x.e (R E)) (g f f (\\m.h))))) (\\p.\\e.y))) k z",
      "H (\\j.n) (n a (\\m.V) (\\u.\\z.J)) z"
    );
  }

  @Test
  public final void test27() {
    reducesTo(
      "r (\\l.\\k.(\\h.(\\q.o) (U b) a) (\\l.\\j.(\\a.(\\o.(\\y.\\s.(\\k.\\a.F e (\\d.t) m) (\\w.(\\a.\\i.P) (\\h.\\r.R))) (\\x.r)) (\\d.(\\i.\\n.\\u.g) ((\\n.L) i (\\p.(\\z.r) (\\m.W)) ((\\f.\\c.\\e.h) (e I (p l)))))) (\\c.(\\h.y) (E (\\z.\\w.(\\g.(\\t.s) (j w) (q U b)) ((\\a.\\b.W L) (\\v.B a (\\x.X))))))) (\\u.Q))",
      "r (\\l.\\k.o a (\\u.Q))"
    );
  }

  @Test
  public final void test28() {
    reducesTo(
      "\\h.\\o.\\h.M",
      "\\h.\\o.\\h.M"
    );
  }

  @Test
  public final void test29() {
    reducesTo(
      "\\h.Y",
      "\\h.Y"
    );
  }

  @Test
  public final void test30() {
    reducesTo(
      "\\a.\\p.\\x.G",
      "\\a.\\p.\\x.G"
    );
  }

  @Test
  public final void test31() {
    reducesTo(
      "(\\f.w) ((\\d.c) (\\z.(\\y.C (P (p Y (\\u.C)) h)) (\\x.(\\b.D) (\\d.k) (\\v.(\\d.o) (v (e f)) (\\v.(\\j.Y) (\\b.t) (W r (x g))))))) ((\\k.P (b (\\w.o) z (\\f.H) (\\q.u))) x ((\\e.\\w.\\w.\\t.\\a.H s (\\t.W) (g u A) (\\n.g (q x) (\\s.\\n.r z)) (\\h.\\u.(\\y.B) (\\r.\\p.M) ((\\a.(\\a.v) (\\n.Q)) w)) (i (o F (l Q) p) (\\a.(\\t.\\t.\\h.I y) G))) ((\\h.\\y.\\w.r) (\\u.\\l.b) (a (\\e.R))))) ((\\z.\\e.(\\v.\\o.\\d.\\s.h) x ((\\e.v (\\d.N) (\\b.W J (\\q.A))) a) (\\i.\\s.e) ((\\u.l) (w C ((\\j.(\\u.F) (\\g.Y)) (v (r j)))) (\\l.C))) (\\e.\\b.\\n.\\q.\\k.\\n.o) ((\\a.\\g.k) ((\\n.(\\w.\\z.s) ((\\f.h) (O D) (F q (\\e.y)))) (K (D (\\l.F)) (\\q.\\g.\\m.(\\m.N h) (k (\\l.y))))) w q))",
      "w (P (b (\\w.o) z (\\f.H) (\\q.u)) (\\w.\\w.\\t.\\a.H s (\\t.W) (g u A) (\\n.g (q x) (\\s.\\n.r z)) (\\h.\\u.B (v)) (i (o F (l Q) p) (\\a.\\t.\\h.I y)))) (h)"
    );
  }

  @Test
  public final void test32() {
    reducesTo(
      "(\\c.\\n.(\\a.W (o ((\\p.Q) ((\\h.(\\h.(\\c.i) G) a) d)) f)) ((\\c.(\\z.L) (\\y.\\v.(\\e.(\\o.m) (\\b.K e)) h)) (\\x.\\q.\\q.v) g ((\\v.\\c.\\d.(\\m.\\o.b (\\q.\\y.b)) ((\\b.o) (\\i.o) ((\\h.l) (\\i.q)) (o C (j i) (\\x.(\\t.q) (x g))))) ((\\i.\\q.i) (\\k.u)) (\\g.z)))) ((\\u.(\\y.h ((\\c.i ((\\j.w) (\\l.L) (S (\\i.Q)) (C W (d o) O))) (\\f.S (\\i.\\a.I)))) (\\k.(\\r.Y n) (i ((\\z.X) t)))) ((\\f.H) ((\\i.(\\a.\\t.\\n.V) (\\c.V)) (\\n.\\w.j o (f W) (X (\\a.N)) (\\g.(\\l.X O) v)) G (\\z.O))))",
      "\\n.W (o (Q) f)"
    );
  }

  @Test
  public final void test33() {
    reducesTo(
      "(\\x.(\\t.\\t.o) ((\\a.s) (\\e.\\e.Y))) ((\\a.A) (\\c.(\\n.k) (\\w.\\k.\\a.(\\l.(\\n.\\w.M (n e (l d) (\\t.a v (c g)))) (\\a.\\b.g)) (\\w.\\i.\\s.(\\k.(\\q.B c (\\r.W) (\\e.v)) (\\g.p (j L a))) (\\g.\\b.\\k.(\\z.p) (\\c.(\\x.C) (\\j.p V)))))) I)",
      "\\t.o"
    );
  }

  @Test
  public final void test34() {
    reducesTo(
      "(\\h.L) a (\\y.u (f (H m (t Z) a)) (\\o.\\o.(\\w.V) (\\x.(\\z.\\x.(\\g.I C) (X P)) D)) ((\\f.\\b.(\\a.s) z (\\p.I)) (s ((\\b.(\\s.L) ((\\c.o) (F J))) (\\l.h v ((\\b.F) (\\n.I)))))) (c (\\o.t))) n",
      "L (\\y.u (f (H m (t Z) a)) (\\o.\\o.V) (\\b.s (\\p.I)) (c (\\o.t))) n"
    );
  }

  @Test
  public final void test35() {
    reducesTo(
      "\\i.A",
      "\\i.A"
    );
  }

  @Test
  public final void test36() {
    reducesTo(
      "\\p.T",
      "\\p.T"
    );
  }

  @Test
  public final void test37() {
    reducesTo(
      "\\c.\\c.a",
      "\\c.\\c.a"
    );
  }

  @Test
  public final void test38() {
    reducesTo(
      "\\i.\\u.\\b.m",
      "\\i.\\u.\\b.m"
    );
  }

  @Test
  public final void test39() {
    reducesTo(
      "(\\c.s ((\\i.\\v.\\z.\\s.\\h.\\y.(\\r.(\\v.v) w) (\\j.r z (\\j.x))) f (\\b.\\g.g) (\\u.(\\d.(\\j.F) (l G)) (q (\\g.s)) ((\\x.V) e (\\c.\\j.m)) (\\c.\\c.(\\h.b) (\\c.w) q X) v) ((\\z.\\b.\\s.t (r k (\\i.f) (p K (\\x.O))) (X z)) ((\\b.\\q.\\w.b (\\k.\\z.y)) ((\\i.i) c (\\u.q (o k)) M)) (\\y.(\\x.\\i.L) (\\b.\\r.S))))) (\\l.(\\w.O) W)",
      "s (\\h.\\y.w)"
    );
  }

  @Test
  public final void test40() {
    reducesTo(
      "\\s.g",
      "\\s.g"
    );
  }

  @Test
  public final void test41() {
    reducesTo(
      "\\l.L",
      "\\l.L"
    );
  }

  @Test
  public final void test42() {
    reducesTo(
      "\\z.u",
      "\\z.u"
    );
  }

  @Test
  public final void test43() {
    reducesTo(
      "(\\u.\\s.\\h.\\d.\\d.l) ((\\i.\\f.\\b.\\l.\\w.k (\\k.\\d.\\a.\\e.o) ((\\a.b) (\\g.w))) h) f (\\r.\\w.(\\o.U x M) ((\\f.(\\f.\\t.(\\n.\\r.\\i.p) (\\d.p)) (\\m.\\h.(\\s.\\e.L G) (\\w.\\m.t) (w v (\\k.U) (\\e.C y (F o))))) (\\o.\\w.s) r ((\\y.(\\i.\\e.\\y.N) (\\a.z) (\\q.\\r.\\a.\\z.S) (\\d.c (\\z.\\z.(\\h.\\z.o) ((\\g.j) (Z B)))) s) x)))",
      "\\d.\\d.l"
    );
  }

  @Test
  public final void test44() {
    reducesTo(
      "W ((\\g.\\d.q (\\k.\\w.\\i.B)) (u (v j (q f) E ((\\k.F Z (z h)) v) (\\b.(\\z.w) ((\\c.\\i.\\t.B) (y (\\m.u))))) ((\\h.m) ((\\m.g O (o n)) (n (\\e.d))) (q ((\\u.(\\g.I) N) m)) i))) (\\m.C)",
      "W (\\d.q (\\k.\\w.\\i.B)) (\\m.C)"
    );
  }

  @Test
  public final void test45() {
    reducesTo(
      "(\\l.\\l.\\h.\\d.E) x",
      "\\l.\\h.\\d.E"
    );
  }

  @Test
  public final void test46() {
    reducesTo(
      "(\\d.\\n.(\\n.(\\i.\\b.\\y.m) (\\e.m R (\\z.j) (\\y.(\\n.l (\\b.(\\g.a D) (r (\\k.w)))) i) (\\a.W G))) (\\q.\\z.\\f.o (\\p.(\\x.S) ((\\z.\\r.\\f.\\s.(\\p.Z) X) (\\j.\\d.\\n.d (\\l.W x))) (v (\\n.\\r.(\\h.(\\y.f) c ((\\b.H) a)) b)) (g (j s))))) (e (g (\\g.k v)))",
      "\\n.\\b.\\y.m"
    );
  }

  @Test
  public final void test47() {
    reducesTo(
      "S ((\\k.\\y.\\r.(\\d.(\\p.(\\i.\\t.k (\\i.\\s.\\w.\\i.m q (\\d.g)) ((\\o.\\n.\\u.\\t.\\j.d) (\\e.j (n j) (\\m.n (\\m.Q))))) ((\\z.N) J)) (Z ((\\k.\\i.Z k) ((\\o.B) (\\y.P)) (\\a.\\p.(\\g.m) (t h) (\\j.I))) (\\g.r))) ((\\f.c ((\\s.j) (p b)) (j h (N z) D)) (k (\\h.n)) (\\n.x) (\\q.C ((\\l.N) (\\u.l (\\d.F (I c)) E))))) (\\y.\\j.(\\t.H) ((\\n.\\y.\\q.(\\w.S) (\\m.p)) (\\d.(\\m.(\\e.(\\k.\\i.\\p.d) c) (\\n.(\\t.g) (m C) (T (g D)))) O (\\v.(\\g.(\\t.j) ((\\a.w) (\\o.f)) (\\u.(\\i.e) r T)) (E (\\r.(\\q.a f (\\l.m)) (N (\\f.x)))))))))",
      "S (\\y.\\r1.\\t.H)"
    );
  }

  @Test
  public final void test48() {
    reducesTo(
      "\\i.\\l.(\\p.\\w.(\\n.h) (\\g.\\g.m) ((\\f.\\p.(\\d.\\d.K h (\\q.\\l.P)) (\\b.(\\g.j) (j u) (s (f L))) (a (\\l.\\z.k w) (\\d.(\\d.\\r.F) ((\\i.t) z)))) ((\\p.F (l p (\\l.(\\w.F) (\\i.N)))) ((\\m.\\u.\\m.r) (\\e.\\v.\\h.(\\t.H) (o z) (\\n.\\c.r)))) F)) ((\\i.(\\h.(\\v.\\a.(\\z.h) (\\t.\\n.\\n.(\\y.c) (t w))) ((\\x.f (b p)) p ((\\v.t (\\w.g)) (H b x)))) x) (p (\\e.(\\s.(\\g.k) ((\\t.D) (\\d.u))) ((\\n.b) (\\t.B) ((\\z.z) N)) (\\k.U (q (O (\\k.s)))))) (\\z.w)) h",
      "\\i.\\l.h (K h (\\q.\\l.P))"
    );
  }

  @Test
  public final void test49() {
    reducesTo(
      "(\\p.X) ((\\o.\\p.\\n.\\f.(\\s.(\\v.e) y Y ((\\f.(\\o.w) (\\r.v)) ((\\a.p) (\\k.E)))) Q (K y ((\\e.\\f.m c (\\b.y) (\\z.C B)) (\\v.(\\j.(\\u.L) (U x)) f)))) (\\x.a)) c ((\\j.(\\c.\\y.b) (\\i.(\\f.g) (\\e.J)) (\\h.\\e.\\w.(\\u.(\\o.q) (\\h.d)) r (\\m.l) (\\q.(\\p.(\\i.Y C (j F)) i) I) ((\\x.j) w ((\\d.\\u.y R) (\\g.\\r.j)) (A (\\x.t))) (o (\\n.\\o.(\\w.\\j.S) ((\\a.q) (\\c.j)) w) s))) ((\\n.\\h.M) z (r (I M f) ((\\i.a) k (\\c.\\p.g)) (O (\\h.(\\s.\\d.S j) (N M f))) (p ((\\v.q) d))) (\\e.\\u.(\\q.h) ((\\g.\\h.j Z) (\\k.t (\\y.\\i.e q) (\\l.\\e.(\\u.n) (\\d.t d)) (\\o.\\t.(\\y.S Z (z l) b) (o (\\m.S))))))))",
      "X c (b)"
    );
  }

  @Test
  public final void test50() {
    reducesTo(
      "H ((\\x.\\e.(\\z.J) (\\z.(\\f.\\n.D) (\\z.(\\v.\\o.\\p.N e) u i))) (\\n.h))",
      "H (\\e.J)"
    );
  }

  @Test
  public final void test51() {
    reducesTo(
      "\\w.h (N (\\p.(\\v.O) ((\\v.b) w)) (\\t.s))",
      "\\w.h (N (\\p.O) (\\t.s))"
    );
  }

  @Test
  public final void test52() {
    reducesTo(
      "\\q.\\o.\\b.N (\\r.(\\u.\\a.g ((\\w.V (\\q.f (\\i.P) (\\z.\\a.\\j.s))) ((\\t.(\\w.\\e.l) K) ((\\o.\\p.o) (\\g.q m (d C))) (c (\\h.\\y.Z (\\u.\\a.w)))))) ((\\a.\\y.g) (\\e.L (\\y.a)) (i ((\\k.e) (U b) i) a v)) (\\f.(\\b.\\r.B (\\y.q (\\g.\\y.(\\d.O) (\\d.P q)) s (\\g.\\l.(\\f.\\q.b s (\\u.(\\z.\\x.c) (\\s.\\z.i))) (x ((\\m.o i (\\y.l)) W))))) (\\j.s)))",
      "\\q.\\o.\\b.N (\\r.g (V (\\q.f (\\i.P) (\\z.\\a.\\j.s))))"
    );
  }

  @Test
  public final void test53() {
    reducesTo(
      "t ((\\w.\\v.l) (v x (\\p.\\x.(\\f.z (\\c.a (\\j.B))) (\\j.\\m.\\z.g W (\\t.n) ((\\a.S) e)) ((\\r.\\o.H O) (\\k.F k m) (\\j.\\c.I))) (\\m.(\\b.\\k.o) (\\n.(\\t.z (F (t Z) (k x (n m)))) G)))) (\\q.\\w.P (\\i.h))",
      "t (\\v.l) (\\q.\\w.P (\\i.h))"
    );
  }

  @Test
  public final void test54() {
    reducesTo(
      "\\s.r",
      "\\s.r"
    );
  }

  @Test
  public final void test55() {
    reducesTo(
      "\\b.R (c (f (Q ((\\d.\\q.k) (\\u.\\o.\\i.n (\\n.d (\\t.o) ((\\k.l) (S y))))))) Z)",
      "\\b.R (c (f (Q (\\q.k))) Z)"
    );
  }

  @Test
  public final void test56() {
    reducesTo(
      "\\v.(\\e.\\y.E ((\\y.\\w.l) (\\q.(\\z.n (\\c.\\v.\\w.s)) (\\o.\\l.Y w))) (\\a.a a ((\\h.(\\d.(\\c.\\x.d r) (\\n.i n (\\e.O)) (S f (m c) (d a (\\a.r))) (W ((\\p.(\\j.L) (r i)) (f (\\i.l))))) (f (r u z) (\\b.d) H)) (\\q.(\\a.\\d.(\\g.(\\n.\\q.\\p.A (\\w.g)) (\\p.l)) (a (\\x.(\\x.S W (\\g.y)) (b (\\b.r))))) (\\s.B))))) ((\\n.(\\p.\\l.(\\k.n) ((\\q.a) (\\z.c) (\\u.M) (d (x z) (\\o.c))) (\\x.\\d.(\\q.E l (\\v.J)) (\\k.(\\h.f) (m J)) (g h (\\h.h) (\\t.(\\s.q) (X B))) (\\m.(\\x.H) (\\a.\\e.e)))) (\\a.\\w.q G (N k) k U h (\\q.\\s.\\p.\\o.g (g ((\\w.V) (C x)) (n r ((\\y.T) (\\f.w))))))) X ((\\d.(\\m.o) ((\\u.e) p)) (\\c.\\x.t)))",
      "\\v.\\y.E (\\w.l) (\\a.a a (f (r u z) (\\b.d) H r (W (L))))"
    );
  }

  @Test
  public final void test57() {
    reducesTo(
      "(\\n.\\g.J) (\\p.(\\o.\\r.\\f.(\\f.(\\j.\\r.y) ((\\w.f) W j)) (K ((\\d.I) (\\f.M) (d r (\\i.B)))) (\\w.\\r.(\\c.o (\\m.g)) (l y)) m) ((\\l.\\h.Y) k o)) m",
      "J"
    );
  }

  @Test
  public final void test58() {
    reducesTo(
      "\\q.g (w (\\w.(\\s.u) (L (\\m.(\\i.x) (O h)))) (\\c.\\g.(\\v.(\\w.\\w.j t) (a J (q d)) (d (\\k.\\z.p m))) (a (\\x.\\x.\\a.(\\l.\\o.r) ((\\e.P) (\\a.w))))) j (\\u.(\\r.Y) ((\\p.W I A) S)) ((\\k.\\b.l) (\\w.h)))",
      "\\q.g (w (\\w.u) (\\c.\\g.j t) j (\\u.Y) (\\b.l))"
    );
  }

  @Test
  public final void test59() {
    reducesTo(
      "f ((\\m.R) ((\\i.(\\y.T (D (a B (h w)) (\\n.A (m M (\\o.f))))) ((\\o.\\q.(\\w.\\x.\\o.D) (\\r.\\e.v m (\\x.J) ((\\d.x) (\\c.a)))) (\\s.H))) u) ((\\p.\\o.(\\p.R) ((\\g.j H (y q)) (W c) u) (\\w.(\\f.\\x.t V) ((\\e.q ((\\r.F) (\\a.c))) (\\q.\\c.p)))) ((\\v.\\s.\\u.s) (\\t.V)) m))",
      "f (R (R (\\w.\\x.t V)))"
    );
  }

  @Test
  public final void test60() {
    reducesTo(
      "\\v.(\\x.\\l.F (\\t.M)) (\\x.D (\\x.(\\b.p (\\o.\\t.(\\i.g P) p) (\\b.(\\x.f) (\\n.f)) (\\f.(\\j.Y v (c c) l (\\e.(\\s.d) (J J) (q w l))) j)) (\\m.\\c.\\y.q (\\q.a (\\s.Y)) ((\\g.H) (o q) (Y (u B))) l (\\d.l)) ((\\s.v ((\\w.(\\d.T (d b)) (W M)) ((\\b.X) (\\v.e) (B j (\\a.d)))) (v (\\n.\\o.\\l.\\t.(\\l.z ((\\q.z) (\\e.U))) (\\h.\\w.(\\h.i) a)))) ((\\o.(\\x.(\\s.f) ((\\l.J) (\\c.W))) b) u (D b (\\o.m) x ((\\e.n) ((\\u.E) (L Y))) (\\t.\\c.v))))))",
      "\\v.\\l.F (\\t.M)"
    );
  }

  @Test
  public final void test61() {
    reducesTo(
      "\\y.\\y.x ((\\p.s (T (G (\\b.(\\m.n) V)))) M) (\\s.\\g.\\p.\\k.X) (C ((\\f.q) g) z) (B (\\m.\\l.\\h.(\\j.(\\i.f) t) M (\\b.W ((\\a.c) ((\\j.S a (\\r.x)) (p (\\h.F))) ((\\a.\\p.\\f.b) (\\b.W X (\\q.y)) (\\z.K (\\u.(\\m.r) (\\a.o)))))) (\\n.\\h.(\\s.A (\\b.\\k.(\\p.\\c.f) ((\\j.c) d)) e (\\t.j)) ((\\m.h (\\t.\\s.K) (W z (q b) (d (w x)))) (\\o.a) (P (\\f.(\\g.p) ((\\v.i) d)) (z (\\q.G) t (\\p.\\e.\\r.\\i.V j (\\u.g))))))))",
      "\\y.\\y.x (s (T (G (\\b.n)))) (\\s.\\g.\\p.\\k.X) (C (q) z) (B (\\m.\\l.\\h.f (\\b.W (c (\\f.b))) (\\n.\\h.A (\\b.\\k.\\c.f) e (\\t.j))))"
    );
  }

  @Test
  public final void test62() {
    reducesTo(
      "u ((\\k.\\l.u) (\\p.\\j.\\g.(\\h.\\m.\\m.\\l.S) a)) ((\\a.f) (\\c.Y) (k (\\d.Z d (\\y.L)) b) (\\j.F (\\a.(\\x.u) (\\y.s) ((\\p.W) (d o)) z))) ((\\y.E) k (\\u.(\\x.k L) ((\\p.\\j.\\f.q) (g t (\\h.X)))) ((\\k.u) ((\\a.H) (\\i.\\o.(\\w.P y) (\\o.m)))) (\\s.(\\v.(\\a.(\\j.(\\a.w) (\\y.y)) w ((\\w.\\m.\\y.i) ((\\c.w) (d v)))) (\\n.\\v.A)) (v p))) (o (\\m.(\\p.\\v.q) (\\g.\\z.\\y.o) (\\j.U))) E",
      "u (\\l.u) (f (k (\\d.Z d (\\y.L)) b) (\\j.F (\\a.u (W) z))) (E (\\u.k L) (u) (\\s.w (\\m.\\y.i))) (o (\\m.q)) E"
    );
  }

  @Test
  public final void test63() {
    reducesTo(
      "(\\f.a) ((\\g.(\\t.c (\\s.s)) (t p (g Q)) (\\y.(\\w.\\m.z) V) q N i (\\u.\\z.\\f.\\x.\\x.r (\\d.\\s.\\m.g))) (F (z n)))",
      "a"
    );
  }

  @Test
  public final void test64() {
    reducesTo(
      "U (\\h.\\q.B) (\\h.u r)",
      "U (\\h.\\q.B) (\\h.u r)"
    );
  }

  @Test
  public final void test65() {
    reducesTo(
      "r ((\\t.\\h.X (\\m.\\y.\\f.Y)) (h o (\\l.(\\f.(\\n.\\s.w (A Y) (g L)) (\\d.(\\x.y) n)) ((\\u.\\g.l G) (\\b.\\l.t q) q) (\\j.u (\\d.\\x.s (\\p.\\q.t ((\\l.C) (\\f.l))))))) X)",
      "r (X (\\m.\\y.\\f.Y))"
    );
  }

  @Test
  public final void test66() {
    reducesTo(
      "\\h.\\u.\\s.i",
      "\\h.\\u.\\s.i"
    );
  }

  @Test
  public final void test67() {
    reducesTo(
      "\\f.\\p.k",
      "\\f.\\p.k"
    );
  }

  @Test
  public final void test68() {
    reducesTo(
      "\\x.\\q.H n",
      "\\x.\\q.H n"
    );
  }

  @Test
  public final void test69() {
    reducesTo(
      "\\g.\\c.\\k.(\\b.\\r.\\l.b (\\w.(\\f.(\\t.D) ((\\j.\\t.(\\c.G k) ((\\s.x) (o f))) F) (\\l.U (W Z) (\\y.\\l.\\k.d) ((\\e.(\\b.R) (\\i.o)) (W I)) (\\h.s)) (\\n.\\g.k (\\m.\\k.u))) (e (r (\\j.(\\r.u) ((\\l.(\\h.\\m.\\x.m) (\\l.m i (Z e))) (\\v.c))))))) (\\d.o)",
      "\\g.\\c.\\k.\\r.\\l.o"
    );
  }

  @Test
  public final void test70() {
    reducesTo(
      "(\\q.W) ((\\d.O) (\\m.m)) ((\\y.(\\k.(\\y.c) (\\k.b)) (j (o j)) (Y r) (\\v.R) (\\e.\\b.\\x.\\d.L l ((\\b.\\d.e (\\c.H)) (\\c.f)))) (\\v.\\h.d (\\f.(\\c.p U) (d z d) (C (\\b.S) (\\w.(\\d.p) (w c))) t)) j (\\w.\\k.\\r.(\\g.(\\g.\\t.(\\k.\\r.\\w.\\h.\\m.j) Z) ((\\a.l) (\\v.(\\y.\\b.W e) (\\o.B a (\\g.e)) (\\p.(\\s.(\\t.h) (O h)) (j (r U)))))) (\\e.F) ((\\r.(\\z.(\\r.\\h.(\\v.\\r.a) (H x s)) ((\\y.f) e (\\a.w))) (\\i.\\d.d)) (o j) (\\e.o (\\k.\\h.x x) (\\c.\\c.(\\y.s s) (\\j.l)) (i a ((\\g.u) ((\\u.g) (\\k.i)))) m))))",
      "W (c (Y r) (\\v.R) (\\e.\\b.\\x.\\d.L l (\\d.e (\\c.H))) j (\\w.\\k.\\r.\\r.\\w.\\h.\\m.j))"
    );
  }

  @Test
  public final void test71() {
    reducesTo(
      "\\r.\\p.\\r.\\v.\\o.\\w.\\f.A",
      "\\r.\\p.\\r.\\v.\\o.\\w.\\f.A"
    );
  }

  @Test
  public final void test72() {
    reducesTo(
      "\\g.x",
      "\\g.x"
    );
  }

  @Test
  public final void test73() {
    reducesTo(
      "\\v.\\s.(\\c.(\\x.(\\f.\\c.(\\g.(\\i.Z) (g j) i) (d (J G E)) (\\b.\\k.H (G (\\q.g)) ((\\u.H) (n X) (\\l.\\i.b F))) (\\n.(\\p.\\y.(\\a.\\r.\\n.T) (\\e.m)) (\\g.\\t.J))) ((\\j.(\\e.W) (\\f.\\b.P T m)) (r x)) W) (\\u.w ((\\q.n) (u k)) (\\d.G) (\\u.v (z O) (\\a.\\k.F (v c (\\a.Q)))) s ((\\z.\\j.r (q a (R H) (\\q.(\\l.z) k) ((\\l.D) (\\i.J) B))) (\\l.\\p.\\m.T x Q (\\y.\\r.D) k d)) (\\v.(\\p.(\\p.\\f.\\f.L y (\\o.\\i.c (\\n.q) s)) (s (c M (s w)) (\\a.(\\x.E) (\\s.D) x)) (\\v.(\\u.\\m.q) h h (\\o.\\y.I t))) (l (\\k.f (\\p.\\l.I)))))) (c ((\\f.c) ((\\s.\\s.\\r.(\\c.(\\b.\\c.x) (\\g.(\\p.g f (\\c.l)) (\\h.Q a (\\x.y)) (\\f.\\z.(\\z.H y) G))) (\\j.(\\o.(\\u.(\\k.c) (\\i.Z)) (P (m C))) (\\d.\\e.\\l.G) (b (\\j.\\j.r f) (O i h (\\j.\\o.S e))))) (X z ((\\f.c X j ((\\p.w) (\\h.M))) ((\\q.D s (\\g.U)) (\\u.u))) a))))",
      "\\v.\\s.Z i (\\b.\\k.H (G (\\q.g)) (H (\\l.\\i.b F))) (\\n.\\y.\\r.\\n.T)"
    );
  }

  @Test
  public final void test74() {
    reducesTo(
      "\\n.\\s.\\e.\\o.\\y.\\x.g ((\\g.l) ((\\c.b) (n i (\\s.a) (G F q))) (\\a.h u O d) (\\i.(\\w.k B (\\n.f) u ((\\b.h w) (\\l.D))) (\\z.(\\e.z (\\d.\\n.x c)) (H (\\i.\\l.R f))) b) (\\x.W) P)",
      "\\n.\\s.\\e.\\o.\\y.\\x.g (l (\\a.h u O d) (\\i.k B (\\n.f) u (h (\\z.z (\\d.\\n.x c))) b) (\\x.W) P)"
    );
  }

  @Test
  public final void test75() {
    reducesTo(
      "(\\f.C) ((\\s.\\g.h (K (\\m.t))) (\\r.\\o.e ((\\o.x) (\\o.\\e.h)) W))",
      "C"
    );
  }

  @Test
  public final void test76() {
    reducesTo(
      "(\\p.\\c.(\\h.A) ((\\t.\\b.v) (p J ((\\z.M) (s L))) ((\\y.o) h (\\n.\\a.\\d.U) h)) (T (a (\\a.M))) (\\j.(\\d.M m) (w ((\\t.W) ((\\c.X) (E e)) t (\\i.\\y.(\\c.(\\t.e Z) X) (\\j.\\f.p T (\\t.b) (G w T)))))) (\\b.\\i.(\\m.F) J)) (\\a.X T)",
      "\\c.A (T (a (\\a.M))) (\\j.M m) (\\b.\\i.F)"
    );
  }

  @Test
  public final void test77() {
    reducesTo(
      "\\f.(\\e.\\d.F) (E ((\\m.e) ((\\k.(\\j.(\\w.a) T) (B (\\f.(\\x.a) (\\a.P)))) q)) z) j",
      "\\f.F"
    );
  }

  @Test
  public final void test78() {
    reducesTo(
      "S ((\\f.\\w.(\\b.\\y.I) w) (\\o.e) r)",
      "S (\\y.I)"
    );
  }

  @Test
  public final void test79() {
    reducesTo(
      "\\h.G",
      "\\h.G"
    );
  }

  @Test
  public final void test80() {
    reducesTo(
      "(\\d.\\t.(\\s.i) ((\\p.w W) (\\x.\\p.\\d.m (a N Q)))) ((\\w.\\z.\\z.\\y.(\\j.\\u.Y x) (a (\\v.\\r.J))) E (\\b.d))",
      "\\t.i"
    );
  }

  @Test
  public final void test81() {
    reducesTo(
      "\\t.(\\s.\\i.\\y.(\\u.w) (N (\\d.r t (j l) (\\u.E) (\\x.\\l.\\k.\\b.\\w.\\h.a C) (\\z.\\r.(\\m.E (f (q H))) (\\i.Z)) ((\\f.\\e.\\v.\\j.\\b.g) ((\\v.\\t.\\s.\\m.\\r.\\c.a r) d))))) ((\\p.U (q (\\b.Y d))) (\\p.\\q.b)) (\\x.\\t.\\c.(\\c.m) (\\m.(\\d.P) (\\q.(\\q.f g C (\\a.(\\f.k) C)) (\\w.(\\e.\\d.\\b.p) ((\\k.g) u))) (\\p.w)) (\\x.X u) (z R (\\l.h)))",
      "\\t.\\y.w"
    );
  }

  @Test
  public final void test82() {
    reducesTo(
      "\\j.\\y.\\d.M",
      "\\j.\\y.\\d.M"
    );
  }

  @Test
  public final void test83() {
    reducesTo(
      "(\\o.\\p.m) ((\\t.j) ((\\q.\\r.v r (\\m.g) g) (\\k.j)) (U ((\\v.s) (\\f.\\o.q) (u i M (g m (t l))))) (r i)) (\\f.w (\\e.(\\v.\\e.\\l.s) e) (k o)) ((\\l.b o ((\\w.\\v.\\t.I) ((\\g.q) (x g) (\\w.k)) f (M W))) (\\o.(\\k.\\i.k) (\\k.\\f.y v m ((\\s.(\\x.g) (\\c.B)) (g (r x (E q))))) ((\\b.(\\m.\\c.(\\a.\\t.d) (\\d.\\g.\\p.i L (\\a.o))) (\\u.w N)) (\\s.(\\o.\\s.\\u.v) (\\i.G) (\\p.\\c.\\e.\\c.z (\\c.g) ((\\i.t) c) L)))) ((\\v.B) ((\\i.s) ((\\b.\\z.\\m.\\l.U) r))))",
      "m (b o (I) (B))"
    );
  }

  @Test
  public final void test84() {
    reducesTo(
      "(\\o.s) (\\w.G) ((\\q.\\s.t ((\\k.(\\i.v) c) e)) ((\\f.U H u) (k M) (\\s.O)) (\\h.z)) (\\g.(\\p.\\j.m (\\x.\\j.j w)) (\\v.r (c ((\\n.Z) p)) (\\d.N)) ((\\f.E) V ((\\i.d) p (\\k.(\\e.k) h)) (a m w (\\o.\\w.P) (V Z (\\r.G) o)) (\\x.y ((\\r.(\\g.N) (e z)) (\\q.v) v)))) (\\z.\\c.S) ((\\l.(\\k.U) ((\\b.W) ((\\d.\\h.\\k.\\p.i) g))) h ((\\g.\\p.(\\o.s) (\\o.G) (\\t.(\\s.\\w.\\w.(\\q.p) ((\\w.\\x.\\j.a) (E (\\y.s)))) (\\x.\\c.\\d.(\\h.(\\u.(\\y.\\e.E) q) (k s (B a) (\\l.i I f))) ((\\e.t) (z E) (\\g.(\\j.I) (\\k.q)) h)))) (\\u.j K)))",
      "s (t (v)) (\\g.m (\\x.\\j.j w)) (\\z.\\c.S) (U (\\p.s (\\t.\\w.\\w.p)))"
    );
  }

  @Test
  public final void test85() {
    reducesTo(
      "(\\f.\\z.(\\j.\\t.w W) ((\\z.\\c.u) ((\\i.\\s.h ((\\q.\\k.\\v.m h) ((\\r.(\\m.\\b.F t) O) (\\r.\\g.V)))) i))) H",
      "\\z.\\t.w W"
    );
  }

  @Test
  public final void test86() {
    reducesTo(
      "\\v.\\q.(\\j.j k (Q o)) R ((\\x.l) a) (o (\\t.\\w.k)) (\\k.x z) (\\w.(\\x.\\v.\\u.\\a.(\\p.y) (\\q.\\x.\\i.O (\\v.(\\d.B) ((\\b.G) c)))) v) I (\\e.\\j.\\l.j ((\\l.\\w.\\y.\\a.\\j.h) e)) ((\\u.\\h.j) (\\q.(\\z.J) H (\\e.\\y.\\y.B (\\v.\\r.z))))",
      "\\v.\\q.R k (Q o) (l) (o (\\t.\\w.k)) (\\k.x z) (\\w.\\v.\\u.\\a.y) I (\\e.\\j.\\l.j (\\w.\\y.\\a.\\j.h)) (\\h.j)"
    );
  }

  @Test
  public final void test87() {
    reducesTo(
      "(\\c.R) (\\x.u)",
      "R"
    );
  }

  @Test
  public final void test88() {
    reducesTo(
      "R (\\h.(\\j.(\\w.\\f.X l) ((\\w.r (m M) c) D)) Z c) (\\g.(\\c.(\\g.q) ((\\h.(\\h.D) ((\\u.K) (B R))) v) (o t ((\\q.(\\u.g) (n f)) (\\r.A) R))) (z (\\b.(\\v.\\v.T) ((\\b.\\x.i) (\\r.\\k.M))) ((\\h.\\g.\\q.r) ((\\m.\\v.\\a.(\\t.d) (\\q.r)) (\\x.\\u.\\x.L)))) (\\u.(\\m.f (l (\\w.\\b.m a) (\\f.\\b.(\\q.\\e.y) (n l g)))) (\\o.\\g.(\\z.(\\n.s) (\\j.v)) (\\p.\\x.\\s.m) ((\\v.(\\b.g) (\\r.N)) u) ((\\p.\\s.(\\d.y) (\\n.u) (\\q.f k)) (C b (\\z.i) x))) j)) F",
      "R (\\h.X l) (\\g.q (o t (g R)) (\\u.f (l (\\w.\\b1.\\g.s (g) (\\s.y (\\q.f k))) (\\f.\\b.\\e.y)) j)) F"
    );
  }

  @Test
  public final void test89() {
    reducesTo(
      "\\z.u",
      "\\z.u"
    );
  }

  @Test
  public final void test90() {
    reducesTo(
      "(\\i.\\z.\\z.\\h.\\t.Y m) ((\\i.u) ((\\l.(\\p.\\g.(\\y.\\g.\\v.\\d.\\x.\\p.c) (\\v.(\\x.F) (v G) (f (r C)))) ((\\n.(\\e.\\b.\\p.N) (\\m.(\\d.j) (\\v.P))) f)) (\\p.m))) (\\m.j) (\\q.(\\x.(\\x.k (\\a.\\s.v)) ((\\r.(\\b.d (\\n.\\n.f l)) (x r (\\i.E) (v j (\\i.F))) v) (\\y.(\\z.(\\t.P u (A S) (h (g x))) (\\z.h)) V) (\\l.\\r.(\\y.\\v.B) (o (\\f.\\o.T) (\\v.\\o.(\\w.m) (t o) g)) u))) (G ((\\t.(\\r.n (\\b.(\\i.(\\c.l o) (\\q.t H)) (j (\\e.a) (\\k.r)))) ((\\f.\\o.p z) (U G (g c)) (\\y.d (v N (U R))) h)) (y (\\j.\\i.t ((\\t.z) ((\\f.w) (N (\\m.O)))))))))",
      "\\h.\\t.Y m"
    );
  }

  @Test
  public final void test91() {
    reducesTo(
      "\\a.\\a.n",
      "\\a.\\a.n"
    );
  }

  @Test
  public final void test92() {
    reducesTo(
      "\\q.f",
      "\\q.f"
    );
  }

  @Test
  public final void test93() {
    reducesTo(
      "\\l.\\i.\\b.\\x.(\\b.\\t.I ((\\k.\\i.V f Y) t)) (\\o.F)",
      "\\l.\\i.\\b.\\x.\\t.I (\\i.V f Y)"
    );
  }

  @Test
  public final void test94() {
    reducesTo(
      "(\\j.\\f.\\k.(\\e.\\h.\\x.(\\s.(\\z.L (\\t.(\\b.c) (\\t.\\z.\\k.\\c.o (\\m.K) (\\z.v c) o))) O) ((\\g.b (\\a.\\c.\\v.\\p.\\n.\\d.f) (K (\\c.y) (\\x.t) (Q r (\\c.m)))) (h ((\\t.E) ((\\l.z) g))) ((\\o.(\\g.\\w.d) ((\\q.O) (U g) (\\h.\\x.a I))) (\\o.(\\z.(\\a.H u (\\s.H)) (\\g.\\b.\\m.m)) G) ((\\u.\\r.\\f.c) ((\\x.\\c.A) (\\v.(\\i.g) (n r) ((\\q.p) (\\u.j)))))))) (\\m.\\m.o)) a",
      "\\f.\\k.\\h.\\x.L (\\t.c)"
    );
  }

  @Test
  public final void test95() {
    reducesTo(
      "\\f.\\d.\\d.v (l ((\\b.(\\j.\\b.V (H (B h) (\\d.\\m.m) (\\a.(\\r.\\i.L) (\\q.\\z.z n))) g) R) (\\n.\\t.\\k.(\\g.(\\i.b) b j) (k (\\j.y)) ((\\s.v) (\\h.\\w.t) (s (\\u.f (a F) (q (j d))) (\\h.\\r.v))))))",
      "\\f.\\d.\\d.v (l (\\b.V (H (B h) (\\d.\\m.m) (\\a.\\i.L)) g))"
    );
  }

  @Test
  public final void test96() {
    reducesTo(
      "e (c ((\\w.(\\f.(\\l.\\v.c O) ((\\c.F) (\\h.a))) (y w) (\\x.\\d.\\s.(\\i.(\\x.r) (x H)) (i y) v)) B (\\n.(\\g.S ((\\s.(\\h.G) (m X)) (f (K b)) (c (p x (\\h.v))))) (\\l.l)))) (\\p.(\\c.(\\y.j) z ((\\f.(\\t.(\\g.X (\\v.s) (\\r.\\j.r (\\l.j q))) (I ((\\t.l) (l q)) (v w))) ((\\e.c) ((\\j.\\d.X Z) (K (\\w.T))) (r p))) (S ((\\a.\\u.\\y.\\e.\\k.E (Q S) (X Q E) (\\t.I)) (\\f.\\d.A))))) (\\w.(\\m.\\a.Q (\\y.(\\o.(\\j.t) ((\\a.e) (\\l.e)) (L e)) (\\y.\\j.X)) (\\r.\\o.\\r.\\n.\\q.h)) F))",
      "e (c (c O (\\n.S (G (c (p x (\\h.v))))))) (\\p.j (X (\\v.s) (\\r.\\j.r (\\l.j q))))"
    );
  }

  @Test
  public final void test97() {
    reducesTo(
      "(\\s.U) ((\\b.q) (\\k.S)) (S (\\h.\\j.(\\w.q l) C) (\\i.\\y.(\\i.(\\j.r O) (s (s b))) x)) (\\v.\\z.B (\\d.V k)) (B (\\u.y)) X g",
      "U (S (\\h.\\j.q l) (\\i.\\y.r O)) (\\v.\\z.B (\\d.V k)) (B (\\u.y)) X g"
    );
  }

  @Test
  public final void test98() {
    reducesTo(
      "\\s.v u",
      "\\s.v u"
    );
  }

  @Test
  public final void test99() {
    reducesTo(
      "e (\\k.\\q.(\\l.\\c.\\f.(\\x.\\m.o) (\\x.(\\a.\\v.c) (\\c.\\x.z n X))) (\\x.a) (\\p.o (\\r.\\l.\\g.\\q.(\\y.\\r.P (R (\\i.\\y.g))) (\\s.d)) h)) (\\a.b)",
      "e (\\k.\\q.\\f.\\m.o) (\\a.b)"
    );
  }

  @Test
  public final void test100() {
    reducesTo(
      "(\\t.J) (L (\\d.(\\y.\\w.(\\h.u) ((\\a.Q) (\\l.\\h.\\s.s))) ((\\c.(\\y.u i x) (\\e.B s)) (\\m.\\k.B (\\w.D) (\\v.\\o.z))) ((\\l.\\k.(\\e.m) (o t (a Q) (R o (u x)))) p) g) (\\w.(\\j.\\j.\\f.\\x.\\f.\\e.(\\m.(\\b.(\\t.\\j.x) ((\\q.v) (\\k.Q))) (\\e.\\x.\\f.\\t.o m (V e)) r) (\\a.Q (v (P J) k) r)) (\\c.\\q.(\\i.j ((\\h.t) (Z R) (H p (\\u.c)))) ((\\t.H e (k w) s) (I ((\\w.y) (F m)))) (\\q.\\e.Q)) (\\t.(\\n.\\h.\\y.\\l.\\e.h (i j) (a (\\y.s)) u) (\\w.\\e.h (\\u.(\\b.y m) (\\l.A w))) (\\b.\\z.q) (\\l.K (\\k.(\\x.\\r.Z p) (Y i e) (\\q.T (u D) l) (\\o.x))))))",
      "J"
    );
  }

  @Test
  public final void test101() {
    reducesTo(
      "\\j.\\x.W",
      "\\j.\\x.W"
    );
  }

  @Test
  public final void test102() {
    reducesTo(
      "\\s.(\\r.(\\w.(\\x.(\\b.X) (\\w.\\g.a)) (g (\\q.\\e.\\t.\\z.u w))) ((\\t.\\w.\\e.z z) (x v (\\h.\\j.\\z.n) i ((\\i.\\w.\\i.(\\h.g) (w w) (\\y.H)) (\\k.\\d.V))) (\\n.P (n ((\\k.(\\u.B) (\\g.U)) (\\d.r (x B)) (\\t.k)))) Q)) (\\h.(\\x.\\m.s ((\\b.(\\i.f ((\\f.V) q)) d) (\\g.h) o u)) ((\\t.\\s.E) ((\\y.\\z.u) i)))",
      "\\s.X"
    );
  }

  @Test
  public final void test103() {
    reducesTo(
      "\\l.(\\y.\\a.(\\u.m G (\\h.\\n.c ((\\j.\\w.w (i k (\\x.g))) ((\\n.\\s.a) (\\d.\\y.u)) (\\k.\\u.\\r.\\t.o))) G) (\\c.\\u.(\\s.\\z.\\m.Q (T (B (\\e.C v (c p)))) (H ((\\p.i) Q (\\d.l)) k)) (g ((\\q.d) (\\m.w (\\t.\\v.F) (f x (E W) (z O))))) ((\\n.M p) (\\i.v N (\\n.f) (K K (q c)) (w q (\\q.u) (\\y.(\\f.c) (I x)))) (z Y (\\l.\\r.b)) ((\\m.l x (d t)) C (\\p.y (\\k.h a (\\w.c))) ((\\w.s) (O b (s l) c)) (\\p.\\q.U E (\\v.a) (\\w.\\j.\\j.F) ((\\w.(\\c.i) (\\h.q)) (N (\\w.S))) (L u)))))) (\\w.(\\m.(\\x.t) (\\u.\\c.i)) (\\j.(\\f.R h) ((\\f.\\l.\\q.\\g.(\\p.J (x (b l) (\\k.A c (J j)))) (\\h.(\\z.g) t)) ((\\b.(\\t.r) (X p)) (\\j.(\\o.l) (\\r.H)) d (\\x.I d)) (\\j.(\\b.\\l.m) (\\l.\\d.D (w v (\\f.v) (\\l.I)) (\\h.F))))))",
      "\\l.\\a.m G (\\h3.\\n.c (\\u.\\r.\\t.o)) G"
    );
  }

  @Test
  public final void test104() {
    reducesTo(
      "(\\m.(\\j.\\t.(\\o.\\t.\\h.(\\d.b) (\\t.(\\e.L) (\\e.h e))) (\\y.\\s.\\i.\\v.\\j.\\g.(\\k.a) (\\m.m (\\p.F))) (\\g.(\\x.\\h.s) x (N d))) (a W) (\\w.t)) e ((\\n.W) t)",
      "b"
    );
  }

  @Test
  public final void test105() {
    reducesTo(
      "\\d.\\v.I d ((\\k.q) P) (\\e.S) (\\b.v) M (\\a.f X S) c",
      "\\d.\\v.I d (q) (\\e.S) (\\b.v) M (\\a.f X S) c"
    );
  }

  @Test
  public final void test106() {
    reducesTo(
      "\\r.r",
      "\\r.r"
    );
  }

  @Test
  public final void test107() {
    reducesTo(
      "(\\i.D) ((\\o.(\\c.h) (\\o.p)) (\\n.s l K) ((\\x.k) (\\l.j) ((\\r.G) (\\m.v))) (\\l.\\j.\\o.\\d.(\\x.C o) b ((\\i.\\a.w) (\\f.H g))) (\\a.O (\\m.r ((\\b.f) (\\j.N) (s l (r f))))) (\\y.(\\x.n k (r l) (u (q k))) (\\m.\\f.(\\b.c W) (\\i.a i)) ((\\t.\\t.V) ((\\j.\\t.\\r.j) (V p B))) (p (\\c.(\\a.\\v.I O) (\\f.\\m.\\y.L) (\\f.h)))) ((\\p.\\s.A) ((\\z.x) H))) w",
      "D w"
    );
  }

  @Test
  public final void test108() {
    reducesTo(
      "(\\k.H) (\\z.H ((\\a.\\w.\\z.(\\f.E (\\o.O)) ((\\y.j) (\\g.h)) (M B (\\q.t (J a)))) (\\g.(\\l.d) (k Z) t q)) (\\l.b i (z (\\z.\\n.\\d.m) (\\n.(\\u.p) (G l) a) (\\d.(\\m.(\\i.J t (Z b)) (y y (\\v.g))) R)))) ((\\f.\\w.C) ((\\d.\\c.(\\t.(\\v.\\b.S ((\\u.B) c)) o) (j (i o (e r)) (S (\\l.(\\u.r) (\\a.g))))) ((\\j.\\t.(\\u.i n (u o) (\\t.z B)) (\\x.c V (\\r.b) w)) n) (\\v.\\b.\\m.l))) (\\d.\\a.\\w.\\h.(\\l.(\\o.b (\\c.\\y.\\v.\\y.(\\j.(\\b.\\e.(\\f.t) (a b) (\\n.\\h.i)) (\\r.p) (k t (A a) (\\n.\\n.\\b.c) (\\z.y (\\i.g a)))) (s ((\\d.p) ((\\g.b) (H E)) (n (\\t.C) (\\c.V)))))) (\\w.g (O (\\z.(\\c.g) ((\\m.y) B) (\\z.(\\p.o) ((\\o.g) (m b)))) (\\r.(\\d.G ((\\f.\\l.y U) ((\\c.t) (\\n.P)))) ((\\z.o) (U m) ((\\w.A) o) (\\b.(\\z.u) (\\q.\\p.\\n.i))))))) (n (\\b.\\h.\\y.\\d.k v ((\\m.e) (\\k.b))) M))",
      "H (\\w.C) (\\d.\\a.\\w.\\h.b (\\c.\\y.\\v.\\y.t (\\n.\\h.i)))"
    );
  }

  @Test
  public final void test109() {
    reducesTo(
      "\\a.\\p.c",
      "\\a.\\p.c"
    );
  }

  @Test
  public final void test110() {
    reducesTo(
      "(\\c.(\\n.G) (\\k.M)) (\\y.\\r.n (\\f.\\t.f (Y ((\\u.(\\f.i) (z (\\y.g))) (t (G p) w))) (\\c.\\h.(\\o.\\m.i) t ((\\z.\\k.B) ((\\q.g) ((\\g.(\\y.Z) (f w)) L))))) X)",
      "G"
    );
  }

  @Test
  public final void test111() {
    reducesTo(
      "\\s.F",
      "\\s.F"
    );
  }

  @Test
  public final void test112() {
    reducesTo(
      "m (\\h.R (\\u.(\\t.(\\f.(\\g.\\u.\\j.J) ((\\b.h) (\\z.l))) (r (\\t.\\m.\\b.j))) ((\\h.(\\p.(\\d.I) (O G)) (I e)) v)) ((\\g.d) ((\\k.Q (\\f.\\d.\\a.s)) Q) (\\m.\\t.\\a.(\\z.R h (O K) (\\g.o (\\s.o)) ((\\h.W) (m q) H)) (n v E (\\u.\\f.y x) ((\\b.\\d.n y) (\\s.(\\b.u) (\\u.M)))))) A ((\\g.\\f.\\e.\\k.\\w.(\\a.(\\z.\\l.\\c.(\\z.\\y.\\r.(\\h.x h (\\m.l) (\\a.p p)) ((\\v.d) (K S) (y W (\\v.W)))) (\\z.w q)) (\\b.O e (D l) (c q (W x)) (\\s.\\i.\\o.B) (\\n.k))) (\\t.\\w.(\\l.(\\r.(\\i.g) (m v) ((\\s.Q) (z e))) (b (\\w.(\\n.i) (\\h.r))) (\\f.b (\\q.\\q.m))) (\\j.n))) ((\\m.(\\h.G) ((\\m.j ((\\x.p) (\\k.H))) I) b) g)))",
      "m (\\h.R (\\u.\\u.\\j.J) (d (\\m.\\t.\\a.R h (O K) (\\g.o (\\s.o)) (W H))) A (\\f.\\e.\\k.\\w.\\l.\\c.\\y.\\r.x (d (y W (\\v.W))) (\\m.l) (\\a.p p)))"
    );
  }

  @Test
  public final void test113() {
    reducesTo(
      "(\\d.\\u.N) (d (\\i.(\\e.e w) (\\j.(\\b.X D) (\\u.\\x.O (\\y.r)) m) (O (\\i.l) z ((\\f.\\i.\\z.\\u.\\h.\\i.m) ((\\v.\\c.\\f.q) x ((\\d.I (h E)) (\\p.b (\\z.z))))))) (\\i.\\o.(\\p.Y) Q))",
      "\\u.N"
    );
  }

  @Test
  public final void test114() {
    reducesTo(
      "Q (\\t.b)",
      "Q (\\t.b)"
    );
  }

  @Test
  public final void test115() {
    reducesTo(
      "\\g.i",
      "\\g.i"
    );
  }

  @Test
  public final void test116() {
    reducesTo(
      "b (\\g.\\z.\\l.q)",
      "b (\\g.\\z.\\l.q)"
    );
  }

  @Test
  public final void test117() {
    reducesTo(
      "(\\i.(\\z.n (\\x.q) (j L (\\h.\\r.V))) H (\\d.\\b.(\\t.\\x.\\q.B) (l (\\u.k) ((\\l.(\\d.(\\e.i) (Y j)) (\\e.x)) (\\a.\\i.y)) (\\q.(\\t.\\e.o) ((\\p.s) (Z z) x) (\\j.\\x.\\r.\\y.(\\i.(\\v.z) (q l) w) p))))) (z (\\s.\\h.\\u.\\p.(\\f.f (x (u D)) z ((\\g.\\h.\\r.X (\\h.\\r.V)) ((\\o.t (m I)) (\\p.(\\c.e) (\\p.b)))) (i v)) ((\\z.\\j.(\\o.b) (\\a.n) (\\t.(\\r.\\o.W) (a u (a w)))) (z (\\m.z)) e))) (\\n.\\h.G)",
      "n (\\x.q) (j L (\\h.\\r.V)) (\\d.\\b1.\\x.\\q.B) (\\n.\\h.G)"
    );
  }

  @Test
  public final void test118() {
    reducesTo(
      "(\\f.E) ((\\l.(\\t.(\\e.\\z.\\i.a h) (\\b.E)) (R (n d) (\\x.\\e.\\r.\\r.\\g.(\\q.b (\\a.M J)) (w ((\\e.Z) (\\u.P)))) g (\\m.J))) (\\j.r (\\y.\\y.L)))",
      "E"
    );
  }

  @Test
  public final void test119() {
    reducesTo(
      "\\v.S",
      "\\v.S"
    );
  }

  @Test
  public final void test120() {
    reducesTo(
      "\\m.u",
      "\\m.u"
    );
  }

  @Test
  public final void test121() {
    reducesTo(
      "\\d.O",
      "\\d.O"
    );
  }

  @Test
  public final void test122() {
    reducesTo(
      "\\m.(\\r.\\p.\\i.(\\n.\\o.\\d.O (\\l.\\y.\\v.x) (\\h.(\\h.W) r (\\o.m)) (\\m.\\y.\\r.\\r.j)) (\\n.H j)) ((\\e.(\\u.(\\k.(\\h.(\\v.\\d.W o) p v) ((\\w.\\n.r v) Z (\\m.(\\p.i c m) (\\c.y y (\\n.U))))) O) (\\y.(\\k.h) ((\\n.\\r.t) (\\d.\\t.\\b.\\v.G u (a o))) (u q))) (\\m.i) (z (\\t.\\r.\\j.(\\b.\\w.h) (\\h.\\v.w)) (\\m.\\n.m b) ((\\o.\\f.\\w.\\f.l) (\\s.a (\\t.z)) ((\\s.\\e.\\l.H) c)) V (H r ((\\r.\\d.q (w l) (\\p.w t)) (\\p.Q)) (\\r.\\j.\\f.(\\q.\\h.\\m.U (M p) (\\p.t u)) ((\\y.s) h (\\w.\\e.m)) (C U)) (\\y.a))))",
      "\\m.\\p1.\\i2.\\o3.\\d.O (\\l.\\y.\\v.x) (\\h4.W (\\o.m)) (\\m.\\y.\\r.\\r.j)"
    );
  }

  @Test
  public final void test123() {
    reducesTo(
      "(\\o.\\f.\\w.(\\e.\\l.n) (\\l.(\\z.z) U (\\k.\\m.\\x.U ((\\m.i) ((\\p.\\z.\\a.H) (\\u.F (\\a.L))))) (\\o.i)) (\\l.(\\u.(\\d.\\c.(\\x.(\\m.H) (\\o.N) Q) j ((\\q.S ((\\m.A) F)) (\\g.(\\b.\\b.x g) (\\i.r))) (\\j.\\y.\\f.\\l.t)) (\\s.\\d.\\t.d)) (Q (\\z.\\d.(\\n.(\\v.T) (\\v.H)) (\\u.a))))) ((\\e.\\e.p ((\\d.z (\\a.g)) (\\s.e (r R z)))) (\\r.q) (\\l.e) ((\\u.\\x.x (\\y.D d)) ((\\y.y) (\\b.q) ((\\s.u) (B H))) b ((\\i.\\a.h) ((\\j.\\l.\\t.\\z.f y K) (F (b x) (i V p)))) ((\\z.\\q.C) (\\p.t) (\\d.(\\x.\\x.\\z.(\\s.Q) l) (\\j.d (\\m.k))))) i)",
      "\\f.\\w.n"
    );
  }

  @Test
  public final void test124() {
    reducesTo(
      "(\\c.H) ((\\y.S) (\\p.x))",
      "H"
    );
  }

  @Test
  public final void test125() {
    reducesTo(
      "\\s.(\\b.c) (\\l.e (\\v.\\x.x) (\\w.\\s.r))",
      "\\s.c"
    );
  }

  @Test
  public final void test126() {
    reducesTo(
      "\\p.(\\x.Z) (\\j.t ((\\i.\\x.q) i)) (\\w.(\\g.y) ((\\e.u v) ((\\v.\\k.Z) y ((\\o.(\\r.R A (g Z)) (\\o.Z (m A))) (\\w.\\z.(\\f.\\e.k) (z i d))) (L (\\k.\\u.\\o.\\m.\\n.o)) o)))",
      "\\p.Z (\\w.y)"
    );
  }

  @Test
  public final void test127() {
    reducesTo(
      "\\m.\\a.j",
      "\\m.\\a.j"
    );
  }

  @Test
  public final void test128() {
    reducesTo(
      "(\\s.c) ((\\j.\\w.\\j.U f) ((\\v.\\m.v) h (\\b.\\a.(\\s.\\t.\\e.g) (\\g.D))))",
      "c"
    );
  }

  @Test
  public final void test129() {
    reducesTo(
      "\\i.\\j.(\\r.z ((\\n.x c ((\\l.(\\u.\\d.\\s.(\\a.P b) n) p (\\d.(\\b.L F (m o)) (N j q) (s (\\d.t)))) ((\\n.\\e.\\c.x) (\\n.\\d.\\k.z) (n Y H ((\\o.g) (\\w.o))) n))) X)) (\\z.\\o.(\\g.\\n.u) (\\z.(\\y.\\m.h (\\j.p) f (\\a.\\k.\\y.\\c.Q G r) (\\m.(\\z.\\p.H) ((\\v.m) (\\m.L)) (\\y.u)) (\\j.f X)) g) (\\o.j (\\o.(\\e.(\\a.v) o ((\\a.\\t.\\y.o (\\u.w Y)) (\\o.\\u.(\\o.s) (\\h.s) (\\r.\\h.j)) ((\\u.\\s.\\z.z) r))) (b (\\b.\\a.e)))))",
      "\\i.\\j.z (x c (\\s.P b))"
    );
  }

  @Test
  public final void test130() {
    reducesTo(
      "\\m.F",
      "\\m.F"
    );
  }

  @Test
  public final void test131() {
    reducesTo(
      "(\\r.\\h.u) (\\h.\\s.q)",
      "\\h.u"
    );
  }

  @Test
  public final void test132() {
    reducesTo(
      "\\h.\\v.\\l.I",
      "\\h.\\v.\\l.I"
    );
  }

  @Test
  public final void test133() {
    reducesTo(
      "\\e.\\e.\\z.P",
      "\\e.\\e.\\z.P"
    );
  }

  @Test
  public final void test134() {
    reducesTo(
      "(\\x.u) x",
      "u"
    );
  }

  @Test
  public final void test135() {
    reducesTo(
      "\\n.\\i.t",
      "\\n.\\i.t"
    );
  }

  @Test
  public final void test136() {
    reducesTo(
      "\\e.j",
      "\\e.j"
    );
  }

  @Test
  public final void test137() {
    reducesTo(
      "(\\n.\\d.(\\y.(\\d.f) ((\\m.\\e.(\\r.\\y.y) (c w (\\m.C))) P) (\\g.q) (\\d.\\l.\\g.\\m.(\\q.M (\\k.\\p.Y)) ((\\a.G) m I (\\u.\\x.(\\s.\\x.e) (k Z (q I)))) (S ((\\m.(\\j.b) (b u)) G) K))) (\\t.o) (\\p.\\x.\\m.\\c.(\\k.k) (\\c.\\y.(\\w.u z) F))) (\\q.K)",
      "\\d.f (\\g.q) (\\d.\\l.\\g.\\m.M (\\k.\\p.Y) (S (b) K)) (\\p.\\x.\\m.\\c.\\c.\\y.u z)"
    );
  }

  @Test
  public final void test138() {
    reducesTo(
      "d (\\o.Y) ((\\e.\\l.(\\d.(\\v.\\t.(\\m.\\i.(\\j.z D (\\d.c) i) u) (\\a.\\a.\\x.C) (\\d.F (q (\\z.y (\\h.S)) (\\i.(\\a.(\\r.l) s) (\\c.D))))) i) ((\\i.\\g.\\p.(\\q.d (n G) (\\o.d)) (\\u.\\s.J) U v) y)) (\\b.(\\l.y) b))",
      "d (\\o.Y) (\\l.\\t.z D (\\d.c) (\\d.F (q (\\z.y (\\h.S)) (\\i.l))))"
    );
  }

  @Test
  public final void test139() {
    reducesTo(
      "a (\\m.e)",
      "a (\\m.e)"
    );
  }

  @Test
  public final void test140() {
    reducesTo(
      "\\l.E",
      "\\l.E"
    );
  }

  @Test
  public final void test141() {
    reducesTo(
      "(\\g.J) ((\\s.v) (\\o.\\a.j (g T)))",
      "J"
    );
  }

  @Test
  public final void test142() {
    reducesTo(
      "\\v.\\a.\\o.\\d.(\\j.(\\a.l ((\\f.W C) (i (u s) (\\a.\\b.m j) (n (\\g.x) ((\\n.U) U))))) (\\w.(\\k.\\z.V) (\\p.(\\z.\\n.\\d.f) (y i (o d) (v b (\\v.M)))) p) ((\\l.R (\\z.Z) (\\i.\\m.\\q.H) (\\p.\\u.\\r.v a)) (E (t (h o (F a)))) ((\\p.\\t.\\u.k) ((\\k.y) T)) (\\m.\\l.\\l.b)) (\\k.(\\y.(\\e.\\x.G (w m)) (\\e.\\n.n)) (\\n.\\l.\\y.\\b.s))) r",
      "\\v.\\a.\\o.\\d.l (W C) (R (\\z.Z) (\\i.\\m.\\q.H) (\\p.\\u.\\r.v a) (\\t.\\u.k) (\\m.\\l.\\l.b)) (\\k.\\x.G (w m))"
    );
  }

  @Test
  public final void test143() {
    reducesTo(
      "(\\k.(\\f.z) x) Q",
      "z"
    );
  }

  @Test
  public final void test144() {
    reducesTo(
      "\\a.b",
      "\\a.b"
    );
  }

  @Test
  public final void test145() {
    reducesTo(
      "(\\s.E (r ((\\h.\\m.\\l.\\x.y) r))) (\\a.\\d.(\\p.f) K) F",
      "E (r (\\m.\\l.\\x.y)) F"
    );
  }

  @Test
  public final void test146() {
    reducesTo(
      "\\f.\\i.\\v.(\\x.x (\\t.(\\z.\\k.(\\x.\\o.(\\f.l) (L (Y q)) ((\\z.\\q.z) V ((\\b.\\m.\\x.H) (\\c.M d (u R))))) (\\m.p)) y (\\r.\\j.\\e.(\\p.v) (\\v.\\t.g ((\\t.(\\d.\\m.(\\h.X) y ((\\y.f) (\\a.S))) (\\p.(\\m.u) A m)) (i h)))))) (\\i.\\t.\\a.D (\\x.p) (\\t.\\u.(\\x.(\\y.\\f.\\s.A) ((\\o.\\x.z) h)) X) (\\y.\\s.\\o.(\\k.\\k.(\\q.\\j.(\\m.\\q.\\t.a) Y) (\\t.\\h.\\b.\\s.\\w.\\h.w (w c o (\\s.(\\x.u) (\\x.m) (\\n.q i))))) ((\\a.r) (\\x.a) ((\\p.(\\m.S) (\\n.j)) (\\y.d f (\\b.x)) (\\r.\\i.E (l (\\u.H)))) (\\t.(\\w.f (k d (\\b.H) (Q e (\\y.o)))) x))) D)",
      "\\f.\\i.\\v.\\t.\\a.D (\\x.p) (\\t.\\u.\\f.\\s.A) (\\y1.\\s.\\o.\\k.\\j.\\q.\\t.a) D"
    );
  }

  @Test
  public final void test147() {
    reducesTo(
      "(\\q.e) (\\x.o) (\\v.\\u.q (\\n.(\\w.\\f.(\\z.\\r.\\n.\\v.\\l.\\r.y) ((\\i.R) u) J) ((\\i.\\d.\\r.w) u (\\l.\\a.\\m.i) S) (\\i.(\\e.(\\o.(\\m.g) (\\v.D)) (\\n.c)) (\\w.G)) (\\b.\\z.z (P N (m (\\v.(\\d.\\q.g C) (\\a.(\\r.r) (\\e.r))) (o p (\\k.H) z ((\\q.j (r I)) (d (T C)))))))))",
      "e (\\v.\\u.q (\\n.\\v.\\l.\\r.y))"
    );
  }

  @Test
  public final void test148() {
    reducesTo(
      "(\\d.w) (\\w.(\\w.b) ((\\h.(\\u.\\v.\\y.\\j.\\n.\\o.B) (w (E A) (\\f.m k))) j) (\\f.\\o.\\e.(\\p.X y ((\\f.\\p.T Q s (\\q.c)) ((\\v.\\o.\\i.U) (h M (t g))))) (\\i.(\\z.o) D)) (\\v.w) j)",
      "w"
    );
  }

  @Test
  public final void test149() {
    reducesTo(
      "\\t.D",
      "\\t.D"
    );
  }

  @Test
  public final void test150() {
    reducesTo(
      "(\\l.\\q.\\n.G (b (\\g.\\n.\\i.\\d.L))) (\\g.Z)",
      "\\q.\\n.G (b (\\g.\\n.\\i.\\d.L))"
    );
  }

  @Test
  public final void test151() {
    reducesTo(
      "(\\f.(\\l.J (\\w.(\\g.M U) (r n) j) s) (\\t.\\o.(\\j.c (\\z.\\u.\\c.(\\v.Y z (\\t.B)) ((\\i.O) s) (k (\\o.\\i.\\w.z)) (x t) (L ((\\v.T) (z v) (\\h.\\u.M) k)))) y)) ((\\z.r) (\\y.\\f.N (\\j.(\\g.\\x.(\\c.i (V u)) (b (b s)) (Z (\\l.j) ((\\c.o) (\\q.A))) c) (m (C U) (\\s.o)))) (\\e.\\b.\\i.\\j.(\\v.\\r.\\t.(\\q.\\z.\\m.\\u.n (\\i.\\l.\\q.\\l.h c (C q) (w o) (H o))) (\\m.(\\x.(\\b.u (s M)) (\\w.\\e.p v) ((\\d.v c) (\\m.(\\g.C) (i y)))) (\\p.s)) (\\k.c (y (\\e.\\h.n) C) (\\u.\\b.f (\\c.K (\\t.B) ((\\a.g) (\\v.j))) (\\q.(\\o.(\\z.x) B) (\\h.\\f.t k) O)))) ((\\w.f) V (\\r.\\p.\\b.(\\t.(\\a.\\s.\\m.G) (\\z.c) c) (f ((\\n.\\q.t D) (\\e.E)))) l)))",
      "J (\\w.M U j) s"
    );
  }

  @Test
  public final void test152() {
    reducesTo(
      "\\v.\\i.(\\d.\\i.\\i.L (\\n.\\k.\\o.\\b.(\\h.\\f.\\r.F) (\\j.U))) ((\\z.g) (\\k.\\c.\\t.m)) (\\d.(\\v.v (\\s.\\p.X)) (f (O (\\c.t ((\\g.H) (y a)) u (\\r.\\f.W ((\\a.X) (\\x.p)) (\\j.(\\i.s l) u)) ((\\y.K) m)))))",
      "\\v.\\i.\\i.L (\\n.\\k.\\o.\\b.\\f.\\r.F)"
    );
  }

  @Test
  public final void test153() {
    reducesTo(
      "\\v.t",
      "\\v.t"
    );
  }

  @Test
  public final void test154() {
    reducesTo(
      "\\a.\\c.\\b.\\k.\\o.w",
      "\\a.\\c.\\b.\\k.\\o.w"
    );
  }

  @Test
  public final void test155() {
    reducesTo(
      "\\p.(\\a.\\d.\\i.\\d.y) Q",
      "\\p.\\d.\\i.\\d.y"
    );
  }

  @Test
  public final void test156() {
    reducesTo(
      "(\\a.\\p.L) (\\a.x)",
      "\\p.L"
    );
  }

  @Test
  public final void test157() {
    reducesTo(
      "\\q.K j",
      "\\q.K j"
    );
  }

  @Test
  public final void test158() {
    reducesTo(
      "\\u.(\\m.h) T",
      "\\u.h"
    );
  }

  @Test
  public final void test159() {
    reducesTo(
      "(\\l.\\i.(\\d.(\\z.\\l.\\v.\\s.(\\z.\\z.(\\g.\\e.r P) (z e w) (\\m.q (x g) (\\n.r n))) k (\\r.\\e.\\w.\\u.j (T (h a) (V e (L e))) (S ((\\j.\\c.\\o.v) H)))) Q A) ((\\q.\\x.\\q.\\k.(\\z.(\\a.\\k.(\\v.v (z (\\s.M))) (Q ((\\c.o) (\\h.V)))) (\\i.(\\v.s) c)) (\\z.\\i.C) ((\\n.n) (\\o.h) t E (\\n.\\a.D i (Z B) j r) ((\\n.\\y.\\f.c) (o (\\a.j t (a t)) (\\m.(\\n.w) l (b h (\\h.z))))))) ((\\e.\\v.(\\u.\\l.\\e.e) o) ((\\b.(\\m.B (\\j.\\v.Q x)) (\\h.i) ((\\a.I) (\\v.b) G (\\w.O))) (\\v.V))))) u",
      "\\i.\\v.\\s.r P"
    );
  }

  @Test
  public final void test160() {
    reducesTo(
      "\\b.(\\v.(\\r.l (\\w.m (\\q.R))) ((\\o.(\\e.I k e) (q (\\o.e)) ((\\e.a) (h w) (z W)) (w B)) (\\n.\\m.\\o.\\i.M) t (\\n.(\\k.(\\r.g) (\\f.\\l.M) ((\\u.\\d.(\\w.\\v.a) m) ((\\k.P) ((\\w.Y) (p C))) b)) (\\c.(\\q.\\x.\\y.p V s (\\x.r) W ((\\d.v) (\\h.\\n.(\\u.\\u.c) l))) ((\\j.v z d) (\\l.(\\r.a) (\\y.Q o (\\g.k))) (\\h.(\\w.(\\t.S) (z X) (N c (\\j.v))) ((\\b.\\p.b) (\\w.F (\\z.d))))))))) i",
      "\\b.l (\\w.m (\\q.R))"
    );
  }

  @Test
  public final void test161() {
    reducesTo(
      "\\p.(\\e.(\\h.\\s.i) (\\t.C)) (\\f.c) o",
      "\\p.i"
    );
  }

  @Test
  public final void test162() {
    reducesTo(
      "(\\p.\\t.\\c.\\v.(\\x.\\i.(\\v.d) ((\\u.(\\z.f) ((\\f.(\\q.r) (X g)) (\\z.D C (t a))) (\\f.t)) (I (j R) (q (\\y.P (y b) (m F (\\m.b))))))) ((\\q.(\\q.u X (\\p.A)) ((\\h.d) (u w)) (\\r.\\r.(\\j.X c) s)) ((\\s.k) (\\p.\\q.F) (\\u.(\\e.\\b.h n) (w a (R P)))) (j s ((\\y.\\q.(\\w.T) (A b) (\\g.m m)) x)) (\\k.(\\a.\\t.K (\\l.\\k.\\z.s) (\\z.\\q.V (r C (s k))) ((\\l.x) (\\v.m) ((\\m.k) (\\r.u)) N)) (\\l.\\f.(\\q.(\\l.\\h.y z (\\n.N) (\\a.Y g)) (\\w.\\a.(\\d.h t) (W Y b))) (\\z.l))))) C (\\c.O)",
      "\\c.\\v.\\i.d"
    );
  }

  @Test
  public final void test163() {
    reducesTo(
      "(\\l.\\f.\\l.G) (\\q.f)",
      "\\f.\\l.G"
    );
  }

  @Test
  public final void test164() {
    reducesTo(
      "\\b.(\\y.\\x.\\o.w) (\\s.(\\s.S) G) (\\g.I) z ((\\p.(\\l.\\c.(\\w.e) (V Z) (\\w.\\w.O)) (\\x.(\\u.v n (\\g.a)) u)) ((\\s.p J (\\f.A)) ((\\a.s) H) (b (\\h.d c w)))) c ((\\b.l) (R (\\k.\\v.B))) (v y) (\\r.c (g ((\\p.(\\s.(\\p.P) (\\h.q) (\\y.\\v.\\x.o)) m ((\\r.g) (\\k.i) (E g (\\v.z)) ((\\h.U) (\\s.x) (R L (c A))))) E) n))",
      "\\b.w (\\c.e (\\w.\\w.O)) c (l) (v y) (\\r.c (g (P (\\y.\\v.\\x.o) (g (E g (\\v.z)) (U (R L (c A))))) n))"
    );
  }

  @Test
  public final void test165() {
    reducesTo(
      "\\s.\\f.\\u.(\\o.\\h.b (\\t.w (x A (a P) (\\u.\\c.\\d.e) (A (\\h.V) (\\j.\\m.s d)) (\\r.n (\\w.\\r.\\y.c C)))) f (\\v.L)) r",
      "\\s.\\f.\\u.\\h.b (\\t.w (x A (a P) (\\u.\\c.\\d.e) (A (\\h.V) (\\j.\\m.s d)) (\\r.n (\\w.\\r.\\y.c C)))) f (\\v.L)"
    );
  }

  @Test
  public final void test166() {
    reducesTo(
      "\\r.a",
      "\\r.a"
    );
  }

  @Test
  public final void test167() {
    reducesTo(
      "(\\k.u) (\\s.\\l.\\d.\\h.(\\z.(\\d.(\\i.(\\q.z) ((\\g.m) K)) d) (p ((\\r.e g s) (\\m.\\w.Q)))) (\\d.(\\j.\\u.c) (c A (\\d.x)) d (\\w.g ((\\k.B z (F m)) i)))) g (Q (\\t.\\t.\\k.\\s.\\t.d (\\u.m)) (\\c.\\d.b)) (j W)",
      "u g (Q (\\t.\\t.\\k.\\s.\\t.d (\\u.m)) (\\c.\\d.b)) (j W)"
    );
  }

  @Test
  public final void test168() {
    reducesTo(
      "(\\f.(\\t.(\\y.(\\m.y) Q) (\\y.\\t.J D) ((\\e.\\r.f l) (\\r.u)) (x (\\u.f O (x E) B)) (y (\\t.u)) (\\j.\\e.(\\v.\\m.\\j.(\\s.l) (R Z) r) ((\\d.(\\w.s) (y C)) (n (\\m.Y))) (\\w.h) U)) ((\\j.\\w.\\d.(\\a.\\z.\\u.W) (\\f.(\\f.\\s.\\e.G) (X d (K (\\h.u)) d))) ((\\t.f (h (\\z.g)) b) (o (\\b.U) (\\y.Y v) (P G (\\d.u) (d r (Y W)))) (\\h.(\\x.m) j))) ((\\x.\\u.\\r.(\\g.(\\k.\\s.\\w.j) (\\f.\\r.e w (d b) (m (f q)) f)) (s (\\s.(\\x.s) (\\j.w) ((\\q.b) (\\q.q))) z)) e (\\f.f))) (\\q.(\\s.(\\e.x (\\n.q (N V (\\u.n) (A r (\\r.n)) (\\p.\\p.f)))) (\\m.\\f.(\\p.Q) (\\k.O)) h) (I (X (\\e.(\\n.(\\x.P) e) (\\w.\\o.\\e.(\\z.I (R N (\\n.r))) (\\h.\\u.Z (f B (\\j.J))))) ((\\v.M) c))))",
      "J D (y (\\t.u)) (\\j.\\e.l r) (\\r.\\s.\\w.j)"
    );
  }

  @Test
  public final void test169() {
    reducesTo(
      "\\v.\\q.v p U",
      "\\v.\\q.v p U"
    );
  }

  @Test
  public final void test170() {
    reducesTo(
      "x ((\\o.(\\j.I) ((\\p.\\p.\\y.q) (\\h.d))) (\\l.\\d.J (x i (P (\\f.\\a.(\\v.z) f)))) ((\\s.B (\\d.\\a.i)) ((\\o.\\e.\\o.y) (\\f.v) (\\a.j) ((\\h.x) (\\v.\\w.t)))))",
      "x (I (B (\\d.\\a.i)))"
    );
  }

  @Test
  public final void test171() {
    reducesTo(
      "j (T (\\u.a))",
      "j (T (\\u.a))"
    );
  }

  @Test
  public final void test172() {
    reducesTo(
      "(\\m.\\u.(\\r.u) (\\v.\\l.(\\c.z) ((\\g.M) (\\r.(\\a.(\\k.\\r.\\n.n) O) r)))) (\\b.\\x.\\s.l)",
      "\\u.u"
    );
  }

  @Test
  public final void test173() {
    reducesTo(
      "\\c.b",
      "\\c.b"
    );
  }

  @Test
  public final void test174() {
    reducesTo(
      "\\u.\\r.(\\h.(\\w.(\\d.(\\l.(\\g.b) ((\\i.k) (B Q))) g (\\z.\\l.(\\c.l) (\\p.\\d.B))) (t (d (\\b.\\l.j)))) (r ((\\q.\\l.(\\j.m u) (v e)) (d (\\m.W) (\\c.(\\i.L) u))) i)) (\\p.M) ((\\v.\\h.(\\x.\\e.\\m.D) w ((\\d.(\\t.G) (n T) (\\i.\\k.\\d.o)) (\\i.S)) (f (\\s.S)) D) ((\\q.d) (\\s.E))) (x (M ((\\v.\\b.J) f)))",
      "\\u.\\r.b (\\z.\\l.l) (\\h.D D) (x (M (\\b.J)))"
    );
  }

  @Test
  public final void test175() {
    reducesTo(
      "v (s ((\\k.(\\i.\\g.(\\w.U j) (b i n J) (t (\\t.c))) q) (W (D (\\e.\\z.\\k.(\\e.\\u.A) (b F (\\l.I)))) B) ((\\h.(\\i.N) ((\\o.\\c.O) l ((\\s.(\\q.Y) (e Z)) n) ((\\g.(\\s.j) (p d)) (m (\\k.T)) (R H (\\i.r) h)))) (p ((\\s.\\d.h p U (\\m.\\v.l)) (u a)) ((\\l.G) (\\f.H) (\\b.m) T ((\\k.\\x.\\s.N x (\\q.Y) P) Y))))))",
      "v (s (U j (t (\\t.c))))"
    );
  }

  @Test
  public final void test176() {
    reducesTo(
      "\\l.\\a.n (\\a.h (\\z.y))",
      "\\l.\\a.n (\\a.h (\\z.y))"
    );
  }

  @Test
  public final void test177() {
    reducesTo(
      "\\g.(\\u.\\d.h e (\\r.\\p.n)) (a (\\q.(\\p.U (u o) d t) (\\w.\\x.\\a.\\g.d) ((\\g.(\\j.X) ((\\e.x) (x R))) (V r) (\\z.\\w.\\y.(\\r.X) (\\y.\\u.s (T m) (c (a t)))))) ((\\u.\\h.L (\\i.s) (\\s.\\s.I)) ((\\y.t) r (\\o.a)) S)) (\\k.u)",
      "\\g.h e (\\r.\\p.n)"
    );
  }

  @Test
  public final void test178() {
    reducesTo(
      "\\t.\\f.\\y.(\\m.(\\q.\\f.(\\l.\\g.Z (\\z.(\\f.\\r.u) (x z (Q o) (\\r.\\c.a j) j))) (\\x.(\\j.J) (a w) ((\\v.u) j) (r (\\u.i W (\\a.c))) (r ((\\y.Y) (\\u.N))) ((\\z.\\f.Y x ((\\w.x) (e k))) (\\t.m) (\\e.K))) ((\\d.\\m.p) (\\q.(\\a.\\l.(\\l.M T) (\\m.(\\x.F) (\\u.l)) (\\f.(\\e.(\\t.g) (N s) u) ((\\f.D) (K o) (Y j (\\v.A))))) (\\h.(\\z.f ((\\x.U) (\\g.\\q.c))) J)))) u) (u ((\\r.(\\d.c (\\h.\\s.k) (\\n.\\q.x (\\q.(\\j.\\l.s) (i x (e M))))) (i (e (\\i.q f (\\b.q))) (\\f.\\o.(\\u.(\\c.\\i.y) (\\k.\\t.a)) (\\q.C)))) ((\\s.(\\t.i) (y J) (E (o z))) z (\\b.(\\d.n p (\\r.x)) (B v z) Z) U) (a (\\i.\\m.(\\i.W) f) ((\\y.n) o ((\\u.f) y) (\\s.d)) (\\s.w (g ((\\g.g) (M v) (l Q (g f))))) T)))",
      "\\t.\\f.\\y.\\f2.Z (\\z.\\r.u)"
    );
  }

  @Test
  public final void test179() {
    reducesTo(
      "\\u.\\w.\\g.u e ((\\k.(\\a.\\o.t ((\\k.r) t ((\\j.J) Z) ((\\r.h) (\\w.O) q))) M) b) (\\p.\\u.\\n.W l ((\\c.O) (\\x.(\\q.\\a.h) (\\b.b)))) l",
      "\\u.\\w.\\g.u e (\\o.t (r (J) (h q))) (\\p.\\u.\\n.W l (O)) l"
    );
  }

  @Test
  public final void test180() {
    reducesTo(
      "(\\i.\\j.H) y",
      "\\j.H"
    );
  }

  @Test
  public final void test181() {
    reducesTo(
      "(\\a.w) (\\q.(\\t.R (\\s.\\f.(\\f.D ((\\a.\\u.g) (\\j.\\y.\\c.(\\r.L) (b e) (\\z.\\e.t)))) ((\\e.\\b.J l) (\\h.(\\w.h) m) (p D (u k) (\\a.h k (\\n.E))) (r (\\r.h))))) (n c) T)",
      "w"
    );
  }

  @Test
  public final void test182() {
    reducesTo(
      "\\q.D",
      "\\q.D"
    );
  }

  @Test
  public final void test183() {
    reducesTo(
      "\\p.\\k.c",
      "\\p.\\k.c"
    );
  }

  @Test
  public final void test184() {
    reducesTo(
      "\\n.(\\y.c (\\a.(\\e.\\r.(\\g.\\d.(\\a.\\y.l g (\\i.\\u.(\\d.(\\p.a) (\\x.i) (\\y.\\l.m)) (l (t h (Y W))))) (f (\\i.i))) ((\\j.\\v.t ((\\v.B) (s v))) ((\\l.d) (K s) P) (\\v.\\w.\\a.\\t.\\f.f) ((\\b.\\t.I b l) (\\x.\\w.b (\\x.\\z.\\s.o) (\\q.d ((\\f.V) (C q))))))) (\\g.v))) (J O (\\y.(\\n.s) (\\l.(\\d.\\t.(\\x.e) n) (z C)) (\\v.\\j.p) (\\y.\\g.f)) X)",
      "\\n.c (\\a.\\r.\\d1.\\y.l (t (B) (\\t.I (\\x.\\w.b (\\x.\\z.\\s.o) (\\q.d (V))) l)) (\\i.\\u.f (\\i.i) (\\y.\\l.m)))"
    );
  }

  @Test
  public final void test185() {
    reducesTo(
      "(\\n.\\y.(\\z.(\\z.\\y.z (w ((\\y.\\c.(\\t.B) ((\\r.j) (I o))) (\\b.(\\y.n) q ((\\x.e) k))))) Q (\\r.(\\w.\\t.p (\\y.(\\u.o) ((\\f.(\\k.h) (\\z.t) ((\\g.y) (E q))) (W q (x r) (\\r.\\j.d l))))) ((\\k.g ((\\s.r) ((\\y.\\r.\\y.z) t))) R))) A) (\\f.\\m.\\x.(\\t.u) ((\\a.\\r.v ((\\j.\\x.\\q.i) ((\\d.o (\\a.\\z.b S)) (b (\\b.\\d.\\e.g))))) (\\e.g)) E)",
      "\\y.Q (w (\\c.B))"
    );
  }

  @Test
  public final void test186() {
    reducesTo(
      "(\\s.\\i.(\\c.N) ((\\u.p) ((\\w.\\m.\\v.(\\l.u c) d ((\\j.(\\u.V U (b k)) (f (E V)) ((\\w.l) V ((\\b.r) (\\u.e)))) V)) a))) ((\\p.\\u.i (a (\\m.m (\\c.\\z.\\e.\\u.w)))) ((\\a.a) (\\p.(\\t.(\\s.(\\c.V) (C u)) (\\i.e) (\\t.\\e.v N (U f) (\\g.\\c.u)) A) (\\j.S) (\\r.(\\k.v) K (\\n.\\k.\\g.\\r.p)))))",
      "\\i.N"
    );
  }

  @Test
  public final void test187() {
    reducesTo(
      "\\i.(\\f.\\n.H (n (\\y.(\\e.a) (\\l.k)) (N (\\m.(\\w.\\k.q (\\h.(\\w.q) (w W) (T (A h)))) c) ((\\d.d ((\\v.S) (Z s) (\\c.(\\g.g) (\\x.B)) O)) (n (\\i.(\\c.n h (O d)) (\\u.(\\s.z) (G k)) (d K (q D) (\\f.(\\h.H) (n V))))))))) N",
      "\\i.\\n.H (n (\\y.a) (N (\\m.\\k.q (\\h.q (T (A h)))) (n (\\i.n h (O d) (d K (q D) (\\f.H))) (S (\\c.\\x.B) O))))"
    );
  }

  @Test
  public final void test188() {
    reducesTo(
      "\\x.\\n.(\\o.q) (\\y.x (q (\\u.\\s.\\g.l (\\s.\\b.\\n.z R))) (u p) m)",
      "\\x.\\n.q"
    );
  }

  @Test
  public final void test189() {
    reducesTo(
      "(\\u.g (m g) m) ((\\s.B) ((\\r.\\s.X) ((\\z.(\\j.\\r.\\v.b) i) (q (w (o r (\\y.S))) m))) ((\\x.u) (\\g.\\t.\\o.y) (\\b.\\t.\\n.q) (\\p.y o)))",
      "g (m g) m"
    );
  }

  @Test
  public final void test190() {
    reducesTo(
      "\\k.\\g.D",
      "\\k.\\g.D"
    );
  }

  @Test
  public final void test191() {
    reducesTo(
      "\\j.e",
      "\\j.e"
    );
  }

  @Test
  public final void test192() {
    reducesTo(
      "\\o.k ((\\n.\\r.\\x.\\g.s) (\\c.\\y.\\v.c)) l (\\h.x ((\\q.\\s.(\\p.\\d.s) (b (\\w.K) ((\\d.i) (p j)) X)) x) (\\q.\\f.g) h)",
      "\\o.k (\\r.\\x.\\g.s) l (\\h.x (\\s.\\d.s) (\\q.\\f.g) h)"
    );
  }

  @Test
  public final void test193() {
    reducesTo(
      "\\s.\\n.\\f.(\\h.(\\l.\\o.\\l.\\g.\\z.v) (\\i.(\\p.(\\u.W) (\\r.\\r.p e (\\e.r) (\\p.x) (s (C T) u))) T) (\\i.\\b.\\x.X (\\j.(\\i.(\\f.(\\d.R) (y d)) P ((\\w.e o (\\z.X)) (n U (\\y.f)))) ((\\f.d) ((\\u.k) k) (\\y.S k c (\\j.(\\b.j) (\\r.j)))) (\\g.m (\\z.(\\s.q) (h K) (k e) (g G j ((\\j.p) (\\f.a)))))))) (h (\\k.L)) (\\n.v ((\\u.\\f.l (\\a.a (\\f.m)) u) (g F (\\j.r) (T V (\\m.g)) k) (\\a.b) ((\\p.\\g.\\r.F) (\\n.S) v y ((\\f.\\c.\\w.\\l.t (\\i.(\\a.\\u.o) (\\n.\\k.y))) t)) (\\e.\\l.(\\v.\\r.\\j.(\\z.(\\d.\\i.I) (\\b.\\h.a (\\n.r) u)) (\\v.\\x.N)) (n r ((\\x.(\\q.v) u) (\\g.w)) c))))",
      "\\s.\\n.\\f.\\g.\\z.v"
    );
  }

  @Test
  public final void test194() {
    reducesTo(
      "(\\n.\\t.L (\\p.\\l.W)) (\\n.J) P",
      "L (\\p.\\l.W)"
    );
  }

  @Test
  public final void test195() {
    reducesTo(
      "(\\d.\\l.\\s.A) (a (\\q.n (\\p.(\\y.U) (\\c.\\u.v t) (\\t.(\\g.H) ((\\o.q) (\\w.T))) ((\\a.\\q.u y) f L))) (g (\\n.(\\h.\\g.\\n.o) ((\\n.l) (\\o.m l (s p)))) (\\y.(\\m.(\\n.f) (\\g.s)) F (\\i.x)) (\\s.s (E m))) (X K))",
      "\\l.\\s.A"
    );
  }

  @Test
  public final void test196() {
    reducesTo(
      "\\t.(\\b.k U y ((\\y.\\z.\\e.(\\m.\\w.(\\i.z w) (P (\\v.c))) d) (g (c i (\\n.c) ((\\u.h) (o y))))) W (\\j.(\\k.w) ((\\d.V) (\\n.(\\q.(\\t.(\\e.R) ((\\x.k) (\\u.F))) ((\\s.y) (O m) (\\m.S J (\\n.c)))) (\\a.\\r.\\x.\\f.\\o.\\q.\\n.(\\o.x) (\\h.k) ((\\o.f) (\\t.Y)))))) (\\p.\\q.(\\w.K) (\\m.\\o.(\\s.Q) o))) (\\z.U (t ((\\q.\\b.\\c.b) (\\g.(\\g.\\x.t ((\\z.s) (\\s.N)) ((\\g.S (y S)) (X l) ((\\o.F) (\\j.v) (T S (j A))))) (\\k.\\p.\\p.(\\r.\\j.y n (\\t.C) e (\\k.\\b.p)) ((\\n.P) (\\j.(\\q.V) (b q)) (\\h.\\j.\\b.e)))))))",
      "\\t.k U y (\\z.\\e.\\w.z w) W (\\j.w) (\\p.\\q.K)"
    );
  }

  @Test
  public final void test197() {
    reducesTo(
      "(\\m.C) (\\u.\\y.U a) ((\\k.k (\\l.B)) (\\u.M))",
      "C (M)"
    );
  }

  @Test
  public final void test198() {
    reducesTo(
      "R (\\v.(\\p.t) ((\\k.(\\f.(\\z.\\z.(\\m.f) D A) (\\z.(\\o.\\w.O) (\\r.\\z.(\\c.\\i.d) (v R (\\j.I))))) (N S)) V)) (\\l.\\m.\\i.G (\\w.\\z.j j) (\\t.(\\k.\\f.(\\c.\\l.\\i.t) (U g (m l)) (n E R ((\\x.H) (\\b.s))) (\\w.\\z.(\\v.E) (\\k.U) p (\\z.h r (\\k.s) (\\g.\\a.i)))) i ((\\p.(\\k.g u (l s) (s q (\\v.u)) (h (u s) a)) G) (\\r.L))) W)",
      "R (\\v.t) (\\l.\\m.\\i.G (\\w.\\z.j j) (\\t.t) W)"
    );
  }

  @Test
  public final void test199() {
    reducesTo(
      "\\h.\\c.\\o.\\r.z",
      "\\h.\\c.\\o.\\r.z"
    );
  }

  @Test
  public final void test200() {
    reducesTo(
      "\\j.\\a.\\z.\\t.d ((\\s.\\x.\\m.E) ((\\d.q) (\\f.p)))",
      "\\j.\\a.\\z.\\t.d (\\x.\\m.E)"
    );
  }

  @Test
  public final void test201() {
    reducesTo(
      "(\\q.Q) ((\\z.\\r.\\a.c) ((\\r.n (\\v.Q)) (\\y.\\a.\\f.l (\\z.\\f.(\\p.\\h.h) (\\f.\\p.P)) ((\\g.t) ((\\k.\\c.\\o.L) C)) ((\\z.\\j.u) k)) v))",
      "Q"
    );
  }

  @Test
  public final void test202() {
    reducesTo(
      "(\\s.\\i.C) (p (\\t.(\\s.B) ((\\r.Y) (\\g.\\u.n)))) (\\w.(\\l.(\\y.\\m.\\z.\\q.c) ((\\a.\\m.\\v.\\s.(\\t.v) (m P)) (\\n.F P (v b) N) U) ((\\u.(\\r.(\\i.\\i.(\\w.i) T q) q) (\\y.\\c.d)) ((\\i.\\p.\\e.A) (f ((\\p.w) (C m))) ((\\c.W ((\\y.j) n)) (\\u.(\\r.e e (\\o.q)) (\\o.z (\\r.j))))))) (\\q.(\\h.U) ((\\l.\\i.a (\\b.i) x) (\\y.\\l.\\k.\\h.\\e.(\\o.\\o.\\j.U) (\\e.r) (C (\\m.\\v.\\y.u) s)))) ((\\h.\\u.q ((\\t.M) ((\\s.x) ((\\n.\\b.\\b.l f q ((\\w.f) N)) (\\f.p ((\\a.x) K)))))) c))",
      "C"
    );
  }

  @Test
  public final void test203() {
    reducesTo(
      "g ((\\a.a (\\d.\\y.m)) (\\d.(\\o.(\\l.\\j.D (r z (\\e.m)) ((\\h.q) (\\b.d) R) p) (\\w.\\g.(\\u.a) y ((\\e.c) (i E)) j (\\m.\\z.\\b.P))) (\\q.\\o.n))) (\\e.r)",
      "g (\\j.D (r z (\\e.m)) (q R) p) (\\e.r)"
    );
  }

  @Test
  public final void test204() {
    reducesTo(
      "(\\w.(\\p.b) (\\s.(\\v.\\d.t) (C (b (o b ((\\i.B) (\\z.s))) (r a)) (n (\\u.x (\\z.(\\c.y) (\\r.C) ((\\a.g) w))) u)))) (T ((\\l.k) ((\\r.w) ((\\n.\\h.E d) (\\l.\\o.f c))) (z x) (\\s.e) (\\f.\\u.(\\p.F (a (\\b.\\g.\\y.U)) (p (\\a.\\o.(\\m.L J) (\\j.n g))) (\\d.\\a.p)) Q)))",
      "b"
    );
  }

  @Test
  public final void test205() {
    reducesTo(
      "(\\z.\\k.h ((\\f.\\l.\\s.(\\d.L) ((\\r.w) (\\h.\\b.\\x.(\\p.F d g F) (\\p.\\m.r (\\k.h o)))) (\\h.\\j.(\\o.X m) (\\n.T (h m) (\\f.\\v.\\y.t) X (\\l.\\y.P)))) ((\\u.(\\n.C) (\\f.(\\m.f) (\\w.l) z e (\\u.k))) (\\z.(\\q.\\o.\\d.\\w.(\\f.n (\\u.K) f (\\k.s)) (\\d.n)) ((\\v.b) (\\u.q)))))) (\\i.\\w.y (\\s.j) (\\p.r))",
      "\\k.h (\\l.\\s.L (\\h.\\j.X m))"
    );
  }

  @Test
  public final void test206() {
    reducesTo(
      "\\v.\\p.\\v.R",
      "\\v.\\p.\\v.R"
    );
  }

  @Test
  public final void test207() {
    reducesTo(
      "Y (\\y.M)",
      "Y (\\y.M)"
    );
  }

  @Test
  public final void test208() {
    reducesTo(
      "\\o.(\\h.a (\\y.\\i.x) (\\e.(\\t.\\t.b (\\f.\\z.\\v.h v) (s (\\m.\\t.\\j.\\g.\\g.m (\\z.P)) r)) (l (\\g.\\n.(\\i.w) d ((\\k.p) w) ((\\r.w) (\\u.s) o) k) U))) (\\d.(\\i.A) (\\y.u))",
      "\\o.a (\\y.\\i.x) (\\e.\\t.b (\\f.\\z.\\v.A) (s (\\m.\\t.\\j.\\g.\\g.m (\\z.P)) r))"
    );
  }

  @Test
  public final void test209() {
    reducesTo(
      "\\x.\\p.\\u.m (\\o.\\i.\\r.E (\\j.y)) (G ((\\i.S) ((\\r.n (\\w.H)) (\\s.a (\\s.i)))) j)",
      "\\x.\\p.\\u.m (\\o.\\i.\\r.E (\\j.y)) (G (S) j)"
    );
  }

  @Test
  public final void test210() {
    reducesTo(
      "\\t.\\l.\\u.d ((\\y.\\h.s) (\\q.\\i.A))",
      "\\t.\\l.\\u.d (\\h.s)"
    );
  }

  @Test
  public final void test211() {
    reducesTo(
      "b (\\v.(\\g.\\d.\\i.(\\e.(\\r.(\\j.x) K) (r (o k))) k ((\\a.x (\\u.N) ((\\b.s) (\\u.c))) w) (\\q.v) E) ((\\k.(\\g.\\m.\\m.(\\s.(\\j.H a) M) ((\\x.a) (\\r.f) ((\\q.d) (\\m.z)))) ((\\t.\\z.\\x.i) (q (b (\\v.d)))) (b A i (\\x.(\\s.k) (a J)) (\\u.\\v.M) (\\w.\\h.E))) (n (\\m.n) ((\\s.d (\\g.a)) (U e (\\y.q))))) (M (\\o.(\\o.\\f.(\\j.N) ((\\d.\\f.\\f.Z (e Q) ((\\v.u) (U t))) ((\\l.(\\a.o) (\\i.p)) (j C))) (\\n.(\\l.i) c)) (\\r.X))))",
      "b (\\v.\\i.x (x (\\u.N) (s)) (\\q.v) E)"
    );
  }

  @Test
  public final void test212() {
    reducesTo(
      "\\r.(\\o.(\\k.(\\z.\\d.\\x.H) (\\x.t)) (\\s.\\j.c (n (\\y.(\\x.d) w) (\\u.(\\c.g) (\\s.Z) ((\\z.e) a))) (\\s.\\n.\\m.\\p.\\r.b ((\\v.P) ((\\v.\\o.r s) (T o (o n))))) ((\\p.F) (\\s.k) n))) w S",
      "\\r.\\x.H"
    );
  }

  @Test
  public final void test213() {
    reducesTo(
      "(\\a.O (\\s.\\j.g ((\\c.(\\r.\\b.q) ((\\r.O) ((\\v.g) (\\d.W)))) (f ((\\y.k) r) (\\b.U)))) y) (\\j.k) ((\\q.I) (\\x.\\e.d (\\b.(\\u.R (\\k.T) (Q g (\\l.g))) (M (\\x.Y (\\t.f)))) (\\r.\\h.\\t.\\f.\\x.\\m.r (\\t.(\\z.i) (\\o.(\\g.f) ((\\w.d) P)))) (\\q.\\s.V ((\\j.(\\v.K) (R m)) ((\\l.\\u.\\l.w) o))) (w (x ((\\q.U) ((\\a.W) (\\x.d))) j ((\\j.(\\h.u) ((\\a.P) (\\r.z)) (\\a.\\k.d)) (H (F (n (\\p.k)))))))))",
      "O (\\s.\\j.g (\\b.q)) y (I)"
    );
  }

  @Test
  public final void test214() {
    reducesTo(
      "(\\q.(\\z.\\h.\\z.s ((\\h.\\h.\\z.\\q.e) ((\\n.c) (\\p.(\\d.C E (V f)) (v p)) (\\e.H ((\\t.\\m.r) (p o (f t)))) (\\j.m)))) (\\h.\\u.(\\b.\\w.\\x.\\b.N) (\\q.\\j.\\l.\\i.a) (\\h.M) (\\o.\\a.(\\i.(\\g.n (\\j.u) (\\f.\\v.o)) (X K)) (\\c.\\j.k) ((\\j.\\n.V g (\\e.R)) ((\\m.y) J ((\\z.U) (\\n.z)) ((\\g.s) (s r) (\\a.p j (\\e.g)))))) (\\y.j))) (\\q.\\b.\\e.(\\w.V) N ((\\e.u ((\\c.\\n.C) (\\c.(\\h.d K (\\g.W)) (\\p.v s (\\q.m))) ((\\t.(\\f.\\w.k) (c p (\\a.b))) (r (\\g.\\q.\\o.y))))) (u m)) (s ((\\i.(\\l.N p ((\\w.\\s.\\z.s) ((\\j.d) q))) (m ((\\k.p) (\\f.I A (r q))))) (O ((\\i.\\e.\\o.(\\c.Y) (e n) (l L X)) v))) ((\\f.\\n.l (\\u.(\\w.j) (A w) (\\j.\\n.c))) ((\\t.K j e l) (x (q E O))) (\\j.\\k.G) e)))",
      "\\h.\\z.s (\\h.\\z.\\q.e)"
    );
  }

  @Test
  public final void test215() {
    reducesTo(
      "\\f.(\\l.d ((\\o.r) (\\u.p))) (\\n.\\p.\\n.H)",
      "\\f.d (r)"
    );
  }

  @Test
  public final void test216() {
    reducesTo(
      "\\z.\\s.b",
      "\\z.\\s.b"
    );
  }

  @Test
  public final void test217() {
    reducesTo(
      "J (z (V k) (l i ((\\o.g) (\\a.\\i.j)) ((\\e.(\\a.Q) (\\s.D)) (\\e.f) ((\\t.U (Z U)) (\\g.q) t z) (\\y.v ((\\e.\\g.\\j.Z) (\\x.\\x.k)) g (\\e.P)))))",
      "J (z (V k) (l i (g) (Q (U (Z U) t z) (\\y.v (\\g.\\j.Z) g (\\e.P)))))"
    );
  }

  @Test
  public final void test218() {
    reducesTo(
      "\\s.\\y.\\t.(\\h.(\\k.Y) q) d (\\u.(\\z.(\\h.n) ((\\u.f ((\\q.H) (\\x.h) (\\t.\\u.r G)) (\\a.\\k.x d)) (\\p.f (Y (\\a.\\x.m L) (\\d.(\\b.\\e.\\l.m) (\\j.o)))))) (\\i.(\\k.l) ((\\c.(\\l.\\s.W) u) (q (\\r.\\y.s)))) ((\\o.H ((\\x.u) (\\d.\\v.\\f.(\\d.\\p.j) (\\y.N F)) (\\i.V)) h) (\\q.(\\l.(\\z.\\k.\\b.\\o.w) ((\\q.c) (\\w.X Y W (M Q (\\b.j))) (\\k.\\r.b))) (\\d.(\\q.(\\p.Y (\\m.\\w.\\o.t) ((\\d.u) ((\\a.l) (\\p.N)))) (\\a.\\u.\\p.\\p.(\\e.t) ((\\z.q) (x o)) (\\h.\\t.j Y (f b)))) (n (\\j.x (c ((\\e.A) (\\s.H)))))))))",
      "\\s.\\y.\\t.Y (\\u.n (H (u (\\i.V)) h))"
    );
  }

  @Test
  public final void test219() {
    reducesTo(
      "\\g.\\b.d (\\s.m ((\\x.Y) m)) ((\\m.\\f.\\m.v) (\\g.S) ((\\n.s (e H) (\\c.P)) (\\m.N)) ((\\e.X) (\\z.e) (\\e.(\\h.(\\w.m) (t f)) (I v) (b (x K (\\q.K))))) ((\\h.x) (\\x.b) (\\f.\\c.\\y.U) X (\\b.\\e.e m p (\\s.(\\h.s) (S X)) o) (\\i.(\\i.H) v)) (\\q.\\c.(\\b.\\n.\\q.(\\k.\\w.\\g.g) (F k (\\x.w)) s ((\\b.C Z w ((\\n.H) (\\x.P))) g)) s ((\\i.(\\i.f (m m)) (\\x.\\c.H p) (\\o.\\c.\\b.o) ((\\v.\\h.W (z c (\\u.K))) (f d (\\y.n) (\\h.\\k.\\l.t)))) f)) a)",
      "\\g.\\b.d (\\s.m (Y)) (v (x (\\f.\\c.\\y.U) X (\\b.\\e.e m p (\\s.s) o) (\\i.H)) (\\q.\\c.\\q.C Z w (H)) a)"
    );
  }

  @Test
  public final void test220() {
    reducesTo(
      "(\\n.(\\h.t) ((\\j.n A ((\\g.\\r.i ((\\p.\\b.(\\j.t) h) (\\c.(\\s.\\t.\\e.R) (A j V)))) ((\\y.n x (\\q.n)) (\\a.y)))) B)) (\\x.w)",
      "t"
    );
  }

  @Test
  public final void test221() {
    reducesTo(
      "(\\k.\\t.(\\g.x) (W ((\\h.Z) v ((\\m.a i (p o)) (\\v.\\r.R c))) (\\o.T) (\\r.(\\e.E) ((\\k.\\r.(\\e.N) (X l (C x)) q) (\\q.r)))) Y) x",
      "\\t.x Y"
    );
  }

  @Test
  public final void test222() {
    reducesTo(
      "\\a.\\a.x (\\t.(\\s.\\t.\\m.m (k l) e ((\\u.(\\n.\\k.\\o.\\o.\\c.O) (\\z.\\q.R (\\w.\\t.(\\d.(\\k.\\m.i) (\\x.M g)) v))) (\\f.e))) (z N))",
      "\\a.\\a.x (\\t.\\t.\\m.m (k l) e (\\k.\\o.\\o.\\c.O))"
    );
  }

  @Test
  public final void test223() {
    reducesTo(
      "(\\t.\\s.X) ((\\q.\\z.\\y.\\w.\\i.\\s.z I ((\\o.\\k.(\\i.\\i.c) r k) (\\z.\\x.l))) (\\l.G) k)",
      "\\s.X"
    );
  }

  @Test
  public final void test224() {
    reducesTo(
      "\\j.\\z.A (\\d.\\z.K)",
      "\\j.\\z.A (\\d.\\z.K)"
    );
  }

  @Test
  public final void test225() {
    reducesTo(
      "\\w.\\v.\\a.(\\b.f e E (\\i.i) (\\j.\\q.\\e.Y d b)) (\\a.(\\n.(\\o.h) (\\o.\\l.(\\p.c (\\b.\\p.\\v.(\\y.W) e (\\p.\\u.\\r.\\j.\\p.\\l.(\\c.(\\h.a) (q v)) (\\e.y)))) ((\\w.\\f.e (\\i.\\e.\\i.h) (m S (i Z) (\\b.l)) N) ((\\c.N) (\\g.h) (\\x.\\t.z D) ((\\e.s) (\\h.F) (\\f.\\k.T)) z)))) m)",
      "\\w.\\v.\\a.f e E (\\i.i) (\\j.\\q1.\\e2.Y d (\\a.h))"
    );
  }

  @Test
  public final void test226() {
    reducesTo(
      "\\o.C",
      "\\o.C"
    );
  }

  @Test
  public final void test227() {
    reducesTo(
      "\\z.m",
      "\\z.m"
    );
  }

  @Test
  public final void test228() {
    reducesTo(
      "\\y.T (U ((\\t.w ((\\t.X) (\\e.H) (l (\\h.d)) (\\t.\\x.j y (\\m.f) (T j (q p)))) (p Q)) (u (J l)) f))",
      "\\y.T (U (w (X (l (\\h.d)) (\\t.\\x.j y (\\m.f) (T j (q p)))) (p Q) f))"
    );
  }

  @Test
  public final void test229() {
    reducesTo(
      "(\\j.\\x.\\l.h) U",
      "\\x.\\l.h"
    );
  }

  @Test
  public final void test230() {
    reducesTo(
      "(\\z.l h) V",
      "l h"
    );
  }

  @Test
  public final void test231() {
    reducesTo(
      "\\i.(\\t.g) (\\c.A) ((\\e.K V ((\\v.\\a.(\\a.n (\\l.G K (\\q.x) (\\s.i e))) K) (\\i.h (\\v.\\h.J (\\c.\\k.\\a.k n (u n)))))) ((\\h.m) t J) (\\b.v))",
      "\\i.g (K V (\\a.n (\\l.G K (\\q.x) (\\s.i (m J)))) (\\b.v))"
    );
  }

  @Test
  public final void test232() {
    reducesTo(
      "(\\m.\\d.\\w.s ((\\z.\\n.\\y.(\\l.q) e) B)) F",
      "\\d.\\w.s (\\n.\\y.q)"
    );
  }

  @Test
  public final void test233() {
    reducesTo(
      "\\c.N (\\n.\\w.\\i.\\u.L)",
      "\\c.N (\\n.\\w.\\i.\\u.L)"
    );
  }

  @Test
  public final void test234() {
    reducesTo(
      "\\k.r (e (\\q.p) ((\\w.\\c.\\e.\\q.\\d.\\p.(\\o.(\\q.V) (C P)) ((\\s.R) (y y)) V d) ((\\t.\\c.\\r.\\o.\\a.V r) ((\\s.F L (b L)) (A (\\m.i)) ((\\h.a) (r z) (r (n u))))) (\\n.Z) f))",
      "\\k.r (e (\\q.p) (\\q.\\d.\\p.V V d))"
    );
  }

  @Test
  public final void test235() {
    reducesTo(
      "\\c.\\h.g ((\\n.a) (\\t.B (\\f.\\h.e) (\\b.z))) (\\u.C) K",
      "\\c.\\h.g (a) (\\u.C) K"
    );
  }

  @Test
  public final void test236() {
    reducesTo(
      "(\\t.f (v ((\\g.\\p.(\\g.f K (\\h.z) (\\l.\\q.w) (\\k.u (E X (d Z)))) (d (\\t.\\e.q))) ((\\g.(\\x.\\s.O) (\\z.U)) (l (\\d.(\\o.z) (\\i.b)) ((\\k.(\\f.n) (U m)) (\\n.\\v.\\u.e)))) W))) (j (\\m.M))",
      "f (v (f K (\\h.z) (\\l.\\q.w) (\\k.u (E X (d Z)))))"
    );
  }

  @Test
  public final void test237() {
    reducesTo(
      "\\j.q",
      "\\j.q"
    );
  }

  @Test
  public final void test238() {
    reducesTo(
      "(\\r.(\\y.(\\v.j) ((\\a.(\\y.(\\e.r) (\\o.r)) d (\\f.e)) (\\o.\\t.k h B (\\u.(\\z.i) (\\r.j)) (\\a.\\h.\\p.h))) (w (T (g ((\\v.A) ((\\g.p) (w b)))))) a) (\\i.\\g.D (J ((\\a.C) (\\a.(\\q.(\\s.p) (\\r.I)) (\\o.b e (e c))))) N ((\\u.\\x.s) (\\q.\\o.(\\r.f) (\\l.a) M ((\\d.(\\c.b) (\\r.r)) (j p o)) o ((\\o.\\r.R) ((\\i.\\p.m (\\v.b i)) y)))))) (\\u.\\e.\\h.K)",
      "j (w (T (g (A)))) a"
    );
  }

  @Test
  public final void test239() {
    reducesTo(
      "q (\\t.\\r.N) c",
      "q (\\t.\\r.N) c"
    );
  }

  @Test
  public final void test240() {
    reducesTo(
      "x g (\\h.P)",
      "x g (\\h.P)"
    );
  }

  @Test
  public final void test241() {
    reducesTo(
      "(\\o.(\\m.c) ((\\j.\\s.g) (f (C t (j W)) e b))) (\\c.\\f.\\x.\\s.\\q.t) (\\s.j) (Z (\\a.K) (\\x.o (\\h.L)) (\\t.\\m.y (\\m.(\\p.q (\\g.f)) (\\e.\\l.\\n.I)) ((\\s.\\f.\\d.\\l.\\z.\\i.\\e.q) ((\\l.(\\p.u) (\\k.a)) (\\b.O (\\u.L)))) (i ((\\y.(\\t.\\a.\\f.r) (f k (\\g.x))) i)) ((\\p.o C (\\r.t) (\\h.t) (\\o.\\e.\\y.\\p.B h (\\e.L))) (\\r.h) ((\\d.\\k.\\q.\\k.d) ((\\q.L z (z e)) (m (\\p.e))) (\\h.\\h.\\g.l s (\\w.l)))) M))",
      "c (\\s.j) (Z (\\a.K) (\\x.o (\\h.L)) (\\t.\\m.y (\\m.q (\\g.f)) (\\f.\\d.\\l.\\z.\\i.\\e.q) (i (\\a.\\f.r)) (o C (\\r.t) (\\h.t) (\\o.\\e.\\y.\\p.B h (\\e.L)) (\\q.\\k.L z (z e))) M))"
    );
  }

  @Test
  public final void test242() {
    reducesTo(
      "(\\t.(\\n.h) (k h ((\\o.s) (\\r.I)) (W (\\g.(\\d.f) (\\l.b) p)) t (\\h.Q))) ((\\r.\\s.F) (\\g.I)) (U q)",
      "h (U q)"
    );
  }

  @Test
  public final void test243() {
    reducesTo(
      "Q (D (\\u.\\q.h M (m R) (\\f.o) ((\\w.S) R) (\\z.N) (\\c.a (\\t.f) ((\\k.e) s A U)) ((\\n.y) ((\\f.o) (\\m.(\\n.(\\w.X) (o q)) q)) ((\\r.R) ((\\x.\\y.z) f)))) E)",
      "Q (D (\\u.\\q.h M (m R) (\\f.o) (S) (\\z.N) (\\c.a (\\t.f) (e A U)) (y (R))) E)"
    );
  }

  @Test
  public final void test244() {
    reducesTo(
      "\\f.H (\\n.(\\y.\\t.(\\b.\\g.\\e.(\\g.l) (l V)) (\\c.q (\\j.e))) h (\\l.\\h.\\s.(\\t.\\x.(\\q.\\h.\\a.z) (\\g.(\\l.v) (\\h.G)) p) ((\\o.(\\r.s) (\\b.H) (\\h.(\\t.W) (n u))) (\\o.(\\n.o) (\\m.c) ((\\t.Z) (q p))))) s ((\\j.W) u) ((\\q.\\k.L (\\b.t)) ((\\s.\\y.t) (\\l.w) c (\\d.(\\m.Q) H ((\\h.\\e.e) (\\y.b)))) (\\x.\\d.\\k.\\y.(\\d.h u (\\e.\\u.\\p.W) (\\a.\\o.(\\r.(\\t.\\c.r) ((\\j.u z x) s)) (\\c.\\x.s))) (a (\\c.l)))))",
      "\\f.H (\\n.l (L (\\b.t)))"
    );
  }

  @Test
  public final void test245() {
    reducesTo(
      "z Y p",
      "z Y p"
    );
  }

  @Test
  public final void test246() {
    reducesTo(
      "(\\x.\\b.(\\d.(\\g.\\c.Y) ((\\s.(\\l.\\n.\\a.\\g.x u) (\\l.L c)) (s (\\j.\\a.N) (\\i.\\a.m)))) (\\b.(\\s.\\o.\\h.\\d.W (\\z.(\\v.W) (\\s.\\o.(\\m.c i) (\\w.m l) h))) (\\k.v k))) (\\j.(\\x.(\\f.(\\m.\\e.U ((\\l.I Z (\\s.q)) r)) L ((\\s.C (\\j.W)) (m (K i) (\\x.\\n.i t) ((\\e.u) (\\s.V) y)))) ((\\u.\\c.D) c ((\\c.c) ((\\b.\\n.e (\\k.Z) (\\w.\\e.I)) b)))) (\\q.u (Q G (\\m.e) T) (\\y.(\\f.c) (\\v.(\\b.P o p) (\\e.A k (R b)))) Z ((\\q.L f (\\m.C)) (g (f (i V) t) (\\r.u))))) ((\\q.(\\q.a) (\\t.(\\c.\\c.(\\r.j V) ((\\q.a) (\\t.u) (\\g.W))) K ((\\r.\\v.(\\l.(\\v.a K) j) m) (\\h.\\j.\\y.\\w.a (\\n.v)))) p) (n (\\w.h t)))",
      "\\c.Y"
    );
  }

  @Test
  public final void test247() {
    reducesTo(
      "u t ((\\a.z) (\\q.O (\\x.(\\o.\\l.h) (s ((\\l.I) ((\\p.X (\\s.a) (\\d.d)) (\\m.(\\o.\\p.\\b.m) (\\l.m S))))))))",
      "u t (z)"
    );
  }

  @Test
  public final void test248() {
    reducesTo(
      "(\\k.v) ((\\c.z (\\y.\\q.H c)) (\\i.H))",
      "v"
    );
  }

  @Test
  public final void test249() {
    reducesTo(
      "\\b.\\j.\\w.(\\q.(\\y.\\f.f) (\\y.g) ((\\e.(\\x.\\f.\\t.(\\e.n) (\\n.k) (u y)) k) (o h n)) (a (\\n.o)) (\\l.(\\b.\\k.t (i ((\\s.\\r.v Q) (r G k))) (i ((\\o.R) (X O)) ((\\z.\\m.\\g.a) m) (\\i.(\\y.o) k))) (\\m.\\q.\\f.g))) (u ((\\p.(\\w.(\\g.(\\t.i) (p o)) (x (\\t.x))) ((\\a.\\x.r) (\\y.\\i.a)) (Q (t (I z) (l e)))) (\\o.U)) (\\c.(\\s.h k) ((\\o.\\l.q) (\\i.(\\b.n l (\\i.F) Z) (\\q.z)) ((\\o.N) (\\x.L (i g ((\\p.Y) Y))))))) (\\p.x)",
      "\\b.\\j.\\w.n (u y) (\\p.x)"
    );
  }

  @Test
  public final void test250() {
    reducesTo(
      "\\y.\\s.\\v.\\o.(\\k.(\\k.\\f.(\\u.(\\j.Y) ((\\p.\\t.v) (\\v.\\t.\\m.\\u.\\y.\\i.\\k.\\s.j))) q) (\\j.w)) (\\w.(\\n.\\s.\\z.(\\l.\\z.(\\y.\\g.\\z.(\\n.(\\u.q) f ((\\l.i) (\\o.n))) Q) (\\b.\\j.y) ((\\s.(\\h.(\\w.I) (\\i.t)) (V M (\\d.o)) (\\p.g B k c)) (U f (M s) (\\u.\\l.f u) (\\n.\\m.o (\\b.A) ((\\h.y) p))))) (\\x.(\\g.a (\\y.p) (a U (\\r.b)) (\\b.\\f.\\s.(\\p.D) B)) I (y x ((\\e.\\g.\\v.A) ((\\w.a) (R e))) ((\\o.\\v.q) (\\z.\\d.(\\r.p) (\\q.\\w.k)))))) k) ((\\c.\\v.\\t.\\r.(\\a.(\\a.\\o.\\b.d (\\s.u)) (\\i.E s ((\\z.B (\\o.\\j.\\w.Z)) ((\\i.r) (Y i) (\\o.e a E))))) (\\o.v) (\\i.(\\u.X) ((\\e.q t (\\q.g) Z) ((\\q.e) (\\x.N) (\\a.i))) (d (W Q (h D) (q (\\i.n)) c)) (f ((\\n.\\y.Y (\\j.Z) ((\\q.w) (\\b.T)) u) (\\s.(\\c.(\\t.k) (\\r.Z) (X h)) (\\t.(\\p.\\d.M E) (n e (l L)))))))) (\\s.\\u.\\u.x ((\\l.\\m.\\r.\\u.\\s.u) ((\\p.(\\l.j) l) ((\\h.J) l) ((\\v.h) g ((\\w.(\\p.o) (\\p.h)) F))) ((\\t.\\t.(\\l.j (c K (\\m.C)) (\\p.(\\v.a) (q h) h)) (\\q.E)) ((\\a.(\\a.z (\\p.f)) K) u B)))))",
      "\\y.\\s.\\v.\\o.Y"
    );
  }

  @Test
  public final void test251() {
    reducesTo(
      "(\\s.(\\c.(\\n.W) (\\x.\\z.(\\i.O) ((\\u.g) g)) (\\g.\\c.p)) ((\\n.(\\s.\\s.w X ((\\e.\\k.b) (\\v.\\q.(\\f.\\h.\\h.L) (y k (q d) ((\\l.H) (\\u.L)))))) (b (\\q.E) G)) (\\r.\\v.\\x.O))) (A ((\\w.(\\x.n (\\c.H)) ((\\e.\\e.\\x.(\\j.H) U) ((\\e.C) z) (\\q.(\\g.(\\i.a u) w) (\\l.\\k.\\h.m) f))) f))",
      "W (\\g.\\c.p)"
    );
  }

  @Test
  public final void test252() {
    reducesTo(
      "(\\v.\\m.\\k.(\\i.(\\c.T (u M (c W))) (\\t.\\s.(\\y.g c) (\\f.N u))) ((\\t.\\m.\\h.A) (t c (S g)) (Y (\\e.(\\j.N) P))) (a (\\s.x)) (\\f.g)) (\\s.(\\l.S) i k s) ((\\y.(\\g.\\t.\\r.n) ((\\k.v) I) (\\j.\\l.Q)) k) h",
      "T (u M (\\s.g c)) (a (\\s.x)) (\\f.g)"
    );
  }

  @Test
  public final void test253() {
    reducesTo(
      "(\\a.z) (\\t.o (\\t.\\u.Z)) l ((\\r.(\\u.\\c.\\i.\\m.c) (u (\\g.l ((\\p.K) (b j))) ((\\m.j B) M)) e (\\u.i)) (\\y.\\o.(\\v.(\\r.\\z.\\v.h) ((\\f.\\a.V l) (q e (k p))) (\\a.(\\m.W) (\\n.\\f.P)) (\\l.(\\s.(\\q.\\o.R c) (\\l.(\\w.R) (h w)) (\\y.(\\p.\\f.F) (Y j m))) (q (\\q.(\\o.V (c v)) (\\q.B (\\z.H)))))) (\\c.\\e.\\e.\\m.(\\e.h ((\\g.g) (M T)) (W M)) (\\h.(\\n.\\i.\\o.g) (\\o.\\o.\\m.(\\b.(\\b.K a) (\\e.L o)) (\\d.s h (\\k.H) (\\t.\\d.C))))) (\\c.(\\z.b) (H ((\\q.\\l.P) (Q N (u b)))) ((\\e.R (\\p.t) (\\h.(\\y.\\w.\\b.J) (\\n.(\\m.f) (\\b.O)))) (a ((\\s.\\f.\\w.e) ((\\w.j) h)))) (\\n.z (h e)))))",
      "z l (\\m.e)"
    );
  }

  @Test
  public final void test254() {
    reducesTo(
      "(\\n.\\f.\\h.\\e.z) (m (\\a.r))",
      "\\f.\\h.\\e.z"
    );
  }

  @Test
  public final void test255() {
    reducesTo(
      "(\\c.(\\c.\\d.P (\\n.\\h.w O) (\\g.m (\\w.(\\p.x) (h f (\\e.\\i.\\j.(\\w.x) (\\u.r) (S P (v k)))) U))) (\\a.\\u.q)) (\\t.Y)",
      "\\d.P (\\n.\\h.w O) (\\g.m (\\w.x U))"
    );
  }

  @Test
  public final void test256() {
    reducesTo(
      "\\r.(\\p.\\h.\\f.g) (\\m.(\\o.x (\\e.(\\a.(\\k.(\\m.o) L) (h a)) (r ((\\o.W) (\\n.i))))) (Y j) (v ((\\d.(\\e.X) (n T)) (l A (g e)) r (\\e.u))) ((\\u.v) ((\\m.F) (\\c.E)) (M G))) (\\r.(\\f.o) ((\\o.(\\c.\\t.\\n.\\v.\\y.(\\a.(\\f.\\p.Y) (e ((\\v.c) (J y)) (t (h x) M))) (\\d.\\x.V)) ((\\g.\\b.f w (\\l.o) (\\n.\\z.N) (j d ((\\u.J) o))) (r ((\\q.\\b.C K) (\\q.k))) F)) ((\\d.k) (\\z.\\c.z) O f)))",
      "\\r.\\f.g"
    );
  }

  @Test
  public final void test257() {
    reducesTo(
      "(\\m.(\\f.i) ((\\p.e) ((\\k.\\i.\\c.(\\w.(\\t.T (n e) (\\w.u)) ((\\l.c) (\\a.l) (\\y.C u A))) (w ((\\f.t (p w)) (\\e.\\f.x))) i) g))) V",
      "i"
    );
  }

  @Test
  public final void test258() {
    reducesTo(
      "\\c.\\b.l",
      "\\c.\\b.l"
    );
  }

  @Test
  public final void test259() {
    reducesTo(
      "\\s.(\\b.\\v.\\a.E (\\g.(\\p.(\\l.(\\k.\\y.C) t (\\d.\\u.(\\o.\\s.\\h.C) (\\a.a))) (\\r.\\c.(\\o.p (R h)) i (P h (H b) (\\q.z)) ((\\m.\\b.\\x.T) (\\v.B (\\a.j)) l) (C (\\j.(\\r.N (\\v.d)) u) (\\c.\\a.\\d.\\u.v ((\\r.t) (\\x.E) (\\u.\\a.G)))))) (\\d.N))) (\\z.\\u.r)",
      "\\s.\\v.\\a.E (\\g.C)"
    );
  }

  @Test
  public final void test260() {
    reducesTo(
      "\\p.q ((\\b.(\\f.n) ((\\e.\\s.b) (S (i e V) (\\z.m) (\\j.(\\y.j) (\\f.(\\x.I g) p)))) (\\b.\\f.(\\z.b (U (U q)) Y ((\\y.\\j.(\\p.s A) (\\x.L y)) (M Z (\\s.Z (\\c.V))))) (\\i.d (\\b.(\\y.Q) (\\k.s U (\\c.P))) ((\\r.P) ((\\v.p r n) (q l (\\i.f))))) v)) (t ((\\t.J) ((\\a.a ((\\v.I) a)) (\\e.(\\h.\\n.\\u.x) (p p (\\o.v)))) (Q (\\k.\\g.\\q.(\\k.\\w.J) (n (\\t.\\q.\\z.y))))) (B (\\p.\\n.M) s ((\\i.(\\f.D) ((\\d.I) (\\g.V))) a) (h b) (\\v.p Q))))",
      "\\p.q (n (\\b.\\f.b (U (U q)) Y (\\j.s A) v))"
    );
  }

  @Test
  public final void test261() {
    reducesTo(
      "(\\h.k (\\x.\\i.\\d.\\h.u (h (\\o.\\c.\\e.l)) (\\d.z M) j)) (\\q.(\\t.(\\t.(\\g.(\\x.(\\g.L) (s b) (\\k.q) ((\\b.o X (\\f.w)) (\\k.n))) W) (f ((\\m.\\q.\\b.c) (\\m.f (p d)) (\\o.(\\t.\\j.\\n.a) ((\\q.a) (r i)))))) ((\\o.\\x.\\l.(\\v.\\r.p l) l ((\\c.\\f.j M) (\\e.z))) (\\y.(\\w.\\q.(\\k.c) q) W) ((\\p.h) ((\\o.\\s.B) (\\u.a)))) (f (B ((\\o.\\r.w (\\b.W) (R (I n)) (\\p.\\c.\\e.\\k.(\\k.f) (l y))) (\\q.x))))) (L d))",
      "k (\\x.\\i.\\d.\\h.u (h (\\o.\\c.\\e.l)) (\\d.z M) j)"
    );
  }

  @Test
  public final void test262() {
    reducesTo(
      "\\x.G",
      "\\x.G"
    );
  }

  @Test
  public final void test263() {
    reducesTo(
      "(\\d.\\x.\\u.t) d",
      "\\x.\\u.t"
    );
  }

  @Test
  public final void test264() {
    reducesTo(
      "(\\k.\\q.C) (\\b.N) ((\\h.\\l.(\\f.q (\\i.(\\l.K) (\\e.\\n.\\q.\\f.u))) (r ((\\z.\\h.\\f.V) N ((\\e.\\i.U C) ((\\r.v) (\\o.o))))) (y (b (i h) (\\p.\\p.(\\l.\\l.x) (\\o.c V))) ((\\h.c (\\k.O) (o t (z H))) (\\n.(\\h.z) ((\\q.O) (v g))) (\\l.(\\s.D) (\\x.d))))) (s (d (v P) v (\\n.\\j.\\b.(\\b.c) (\\q.O) (h t W)) V) (\\d.\\q.(\\e.\\a.(\\x.\\f.(\\j.p (e i)) H ((\\n.\\x.K) (\\i.\\f.U a))) h) ((\\b.(\\l.h) y W) (\\f.y) (C (\\d.\\e.\\v.R) U))))) (y (\\l.i))",
      "C (y (\\l.i))"
    );
  }

  @Test
  public final void test265() {
    reducesTo(
      "(\\f.M) (\\f.\\l.R)",
      "M"
    );
  }

  @Test
  public final void test266() {
    reducesTo(
      "\\v.\\a.H q ((\\x.(\\v.\\b.(\\a.i P) (\\m.a k)) p) r) ((\\s.\\p.\\a.\\f.(\\k.\\z.\\e.I) L) ((\\r.k (\\o.N p (\\u.g))) ((\\g.t) ((\\z.h) (\\x.W))) (e (\\f.t (\\t.\\t.\\m.z))))) (g (M (f (K b (H l)) (\\g.y))) (\\t.(\\c.(\\w.\\p.R) (\\f.\\q.\\j.u) (\\x.B (\\c.d))) ((\\i.(\\x.X) y j ((\\q.y p (\\d.v)) ((\\p.b) (\\e.b)))) (q (\\l.\\c.w) (g V z ((\\g.S) (S z))))))) (i ((\\c.\\l.l) (\\k.\\i.J) (\\d.(\\n.\\f.\\r.\\v.w) J)) A) (\\u.\\f.n)",
      "\\v.\\a.H q (\\b.i P) (\\p.\\a.\\f.\\z.\\e.I) (g (M (f (K b (H l)) (\\g.y))) (\\t.R)) (i (\\d.\\f.\\r.\\v.w) A) (\\u.\\f.n)"
    );
  }

  @Test
  public final void test267() {
    reducesTo(
      "\\s.\\g.(\\c.e) (\\z.v)",
      "\\s.\\g.e"
    );
  }

  @Test
  public final void test268() {
    reducesTo(
      "q (\\v.(\\s.p) ((\\f.w) ((\\d.\\g.(\\w.\\a.\\u.\\a.\\f.(\\a.\\u.F) (\\f.\\g.p) (\\q.f)) (s ((\\s.i) (z g)) (y m))) (\\o.\\a.G)))) m",
      "q (\\v.p) m"
    );
  }

  @Test
  public final void test269() {
    reducesTo(
      "\\d.\\w.g",
      "\\d.\\w.g"
    );
  }

  @Test
  public final void test270() {
    reducesTo(
      "\\a.(\\y.(\\a.k (\\d.C)) (\\j.\\c.\\c.d h (\\e.C) ((\\l.q) (h n))) (k (\\p.P) ((\\v.n) (T g)) (\\f.H (\\h.i F (m r))))) (\\p.\\k.\\z.(\\a.z) (\\t.k A (r V)) (\\w.S) (\\j.\\d.\\r.X (V u (A o) R))) (\\b.I ((\\l.g) e ((\\l.z) f) ((\\c.n) (E p) (L c H))) (b (\\n.\\c.\\v.(\\w.c) ((\\j.\\w.n L) (X M (\\y.d)))))) k i (\\j.N)",
      "\\a.k (\\d.C) (k (\\p.P) (n) (\\f.H (\\h.i F (m r)))) (\\b.I (g (z) (n (L c H))) (b (\\n.\\c.\\v.c))) k i (\\j.N)"
    );
  }

  @Test
  public final void test271() {
    reducesTo(
      "\\i.\\u.\\z.\\k.T",
      "\\i.\\u.\\z.\\k.T"
    );
  }

  @Test
  public final void test272() {
    reducesTo(
      "(\\v.c) c",
      "c"
    );
  }

  @Test
  public final void test273() {
    reducesTo(
      "\\k.\\t.u (c (d (\\g.H (\\l.(\\t.(\\z.\\m.(\\p.\\v.d) ((\\c.b) (\\e.d))) ((\\t.d k (\\y.p)) D)) (g (\\j.(\\g.\\f.K P) ((\\o.u) p)))))) (\\p.n (\\g.\\u.y) E))",
      "\\k.\\t.u (c (d (\\g.H (\\l.\\m.\\v.d))) (\\p.n (\\g.\\u.y) E))"
    );
  }

  @Test
  public final void test274() {
    reducesTo(
      "N (\\t.\\h.\\q.\\o.(\\a.\\l.(\\l.\\s.(\\o.j (c (\\b.\\n.i N) d)) (\\k.Q v)) (\\r.v)) (\\j.X (\\w.j J))) (\\g.\\h.o (\\d.\\z.\\z.W ((\\b.a) (\\c.(\\g.B C (I u) (p S b)) (\\b.\\r.n a (\\e.g) m)))) ((\\q.(\\c.\\t.v g) (l O (\\v.l)) ((\\y.L) (\\s.k) ((\\z.H) (o q)))) (v f) ((\\m.a) l ((\\r.z) (\\u.Q)) D (\\y.a (\\l.\\v.u y (e O) (\\r.\\m.f)))) (D (m (\\f.d)))) (c ((\\c.K w ((\\n.Q) (\\g.(\\z.z) A))) (\\i.z) r ((\\i.\\m.\\n.\\e.\\g.(\\j.\\t.h ((\\t.\\v.m) ((\\m.k) (\\d.x)))) J) a))))",
      "N (\\t.\\h.\\q.\\o.\\l.\\s.j (c (\\b.\\n.i N) d)) (\\g.\\h.o (\\d.\\z.\\z.W (a)) (v g (a (z) D (\\y.a (\\l.\\v.u y (e O) (\\r.\\m.f)))) (D (m (\\f.d)))) (c (K w (Q) r (\\m.\\n.\\e.\\g.\\t.h (\\v.m)))))"
    );
  }

  @Test
  public final void test275() {
    reducesTo(
      "\\t.j",
      "\\t.j"
    );
  }

  @Test
  public final void test276() {
    reducesTo(
      "\\r.K",
      "\\r.K"
    );
  }

  @Test
  public final void test277() {
    reducesTo(
      "\\s.\\x.\\a.o f",
      "\\s.\\x.\\a.o f"
    );
  }

  @Test
  public final void test278() {
    reducesTo(
      "(\\b.(\\q.B) (\\b.(\\w.(\\m.(\\m.\\n.m (\\v.y)) C) (\\t.S n (\\r.\\h.h))) (\\m.\\c.\\o.\\t.(\\d.(\\c.\\z.(\\r.q) ((\\h.b l) (y (\\g.f)))) (i z (\\y.R) t ((\\a.B) (\\i.s)))) (\\u.(\\l.\\v.\\w.n c (\\h.D)) v d)))) (I (P ((\\f.a) ((\\g.(\\o.z) (\\c.W (l (\\o.q)))) ((\\k.k) (\\g.h) (\\z.\\v.P A) m))))) u",
      "B u"
    );
  }

  @Test
  public final void test279() {
    reducesTo(
      "\\k.z",
      "\\k.z"
    );
  }

  @Test
  public final void test280() {
    reducesTo(
      "\\n.c",
      "\\n.c"
    );
  }

  @Test
  public final void test281() {
    reducesTo(
      "(\\k.(\\c.\\v.\\i.H) (y g (\\e.H)) ((\\t.\\u.U) (\\s.\\g.(\\w.(\\k.\\h.f) (\\s.i)) (r (\\o.L (\\l.o)))) (\\t.k e)) (\\k.(\\x.e) (\\y.\\c.\\f.\\y.\\a.h))) K",
      "H"
    );
  }

  @Test
  public final void test282() {
    reducesTo(
      "\\a.(\\k.\\z.c) B ((\\i.R) ((\\i.S b (\\c.(\\k.\\s.\\y.i m ((\\t.\\d.\\d.o (\\i.K)) ((\\w.k) (R u) H))) (p n F ((\\v.x) j) ((\\d.o) (u M) (T q j)) n))) c))",
      "\\a.c"
    );
  }

  @Test
  public final void test283() {
    reducesTo(
      "\\p.(\\e.o (\\y.(\\o.V) (\\r.\\f.\\h.\\f.s))) (\\v.\\r.k (\\l.\\g.\\h.(\\r.(\\a.K) (\\w.\\d.(\\a.j) j)) (\\l.\\v.\\q.(\\y.\\l.\\s.\\i.\\v.Z (f P) (\\a.Y) ((\\h.c) ((\\j.e) C))) (\\a.z) ((\\z.(\\u.t) ((\\z.\\w.\\p.N) T)) ((\\d.Z) (\\h.x) (\\y.\\l.e) (\\a.\\p.(\\y.z) (\\q.n) ((\\x.I) (Z c))))) (p (\\d.\\f.(\\y.i v (\\e.J)) (\\z.\\r.n) v C)))))",
      "\\p.o (\\y.V)"
    );
  }

  @Test
  public final void test284() {
    reducesTo(
      "\\t.\\y.\\l.Q",
      "\\t.\\y.\\l.Q"
    );
  }

  @Test
  public final void test285() {
    reducesTo(
      "O (\\v.\\b.\\s.r) ((\\b.z) (\\a.U (u (p m g (\\r.G) (\\k.m)) (J (o (\\w.\\f.\\d.\\z.H (x B))))))) (s (o (\\k.\\u.\\k.\\p.A)))",
      "O (\\v.\\b.\\s.r) (z) (s (o (\\k.\\u.\\k.\\p.A)))"
    );
  }

  @Test
  public final void test286() {
    reducesTo(
      "(\\t.(\\d.(\\g.G (\\g.(\\e.e) (\\g.b) p)) (x (\\s.\\j.(\\l.f) (\\m.R) ((\\d.p) (w v)))) i (\\u.\\o.\\s.w)) ((\\u.\\w.\\z.b (\\q.\\e.p (\\t.O a (\\q.k) (Y i (O Q))))) ((\\v.B v b) o (\\x.k (y b) R) (\\f.\\t.\\h.\\w.L)) (y (\\a.\\i.v w)))) (f ((\\q.\\u.\\z.U) ((\\y.\\q.\\u.\\j.\\v.(\\w.e) J ((\\j.d) (\\z.T)) (K b e (K o))) (\\e.y (\\r.o)) (\\w.s)))) (\\t.\\q.\\z.r ((\\y.(\\m.\\x.\\d.c (F D (\\q.g))) (\\w.\\h.y l J u) (\\t.\\o.(\\w.\\y.(\\i.v j) w) P) I (\\y.\\f.\\f.b)) (\\x.D)))",
      "G (\\g.b) i (\\u.\\o.\\s.w) (\\t.\\q.\\z.r (c (F D (\\q.g)) (\\y.\\f.\\f.b)))"
    );
  }

  @Test
  public final void test287() {
    reducesTo(
      "\\k.X (\\t.\\y.a)",
      "\\k.X (\\t.\\y.a)"
    );
  }

  @Test
  public final void test288() {
    reducesTo(
      "\\f.Y",
      "\\f.Y"
    );
  }

  @Test
  public final void test289() {
    reducesTo(
      "\\p.v",
      "\\p.v"
    );
  }

  @Test
  public final void test290() {
    reducesTo(
      "\\b.D k z (\\k.q (\\d.(\\y.(\\u.(\\h.B) (s j) (y (\\z.x))) z) (\\x.Q) (\\y.\\a.t ((\\u.(\\w.g) m (\\a.d d (t d))) (\\y.j))) (\\n.(\\z.\\p.(\\j.e) ((\\k.X) o) (W o)) O (\\e.f))) C)",
      "\\b.D k z (\\k.q (\\d.B (Q) (\\y.\\a.t (g (\\a.d d (t d)))) (\\n.e (W o))) C)"
    );
  }

  @Test
  public final void test291() {
    reducesTo(
      "(\\r.\\j.\\h.z r q) ((\\q.(\\p.\\g.\\f.I) (\\k.S) (\\h.\\j.\\w.\\x.T h (x A)) (w D o (\\q.(\\z.\\b.w Y) (\\l.(\\u.u) r))) (X n) T ((\\k.y) ((\\p.k) ((\\r.S j (Q G) (\\q.(\\k.Q) (\\c.d))) (\\y.\\f.(\\b.\\z.N) e))) R)) (\\s.\\y.e ((\\z.o (\\e.\\u.(\\w.r) N ((\\t.W) (n i))) (\\u.\\a.(\\c.\\z.V) (\\f.(\\z.\\q.y) ((\\h.w) (d M))))) (\\p.y) e)))",
      "\\j1.\\h.z (I (X n) T (y R)) q"
    );
  }

  @Test
  public final void test292() {
    reducesTo(
      "\\h.\\y.\\o.e (\\d.\\w.\\p.\\j.\\f.(\\d.v) ((\\c.(\\k.p) z) (\\g.\\m.\\k.Z ((\\y.m) ((\\d.\\v.B A) ((\\c.d) (\\q.r))) (\\o.L))))) ((\\c.(\\t.h) (\\g.\\r.(\\r.x) (\\u.r) (b W (\\s.b)) (n c (\\q.t) (g (x s))))) (\\z.s (e ((\\g.g V (\\i.d)) (\\f.d)))) m (T ((\\j.Q (\\p.\\i.m E) (b (\\d.o) F)) M (\\u.(\\r.d) (\\a.i) h))) (h ((\\r.\\q.(\\o.\\f.m) (\\n.o) (\\t.h)) (\\x.P))))",
      "\\h.\\y.\\o.e (\\d.\\w.\\p.\\j.\\f.v) (h m (T (Q (\\p.\\i.m E) (b (\\d.o) F) (\\u.d h))) (h (\\q.m)))"
    );
  }

  @Test
  public final void test293() {
    reducesTo(
      "\\h.(\\v.\\v.Q) (I a ((\\h.\\m.(\\s.(\\t.(\\a.z r) (\\t.v r)) ((\\k.\\x.k c) (\\b.(\\h.o) v))) c) (l (\\h.(\\v.P r (\\s.y)) (\\u.i)) ((\\o.\\y.Z A) (\\j.(\\w.\\w.w) (b b (H l)))))) (\\z.\\q.\\d.\\a.\\x.\\g.Z)) W",
      "\\h.Q"
    );
  }

  @Test
  public final void test294() {
    reducesTo(
      "u ((\\q.\\a.(\\f.\\z.\\u.e ((\\i.A) g ((\\m.Y (l p)) U) (\\g.\\t.w))) (f ((\\z.I) (\\j.B))) (\\v.\\s.l)) ((\\x.e) n ((\\u.(\\e.(\\n.y) (\\e.(\\q.h q) (Z Q n ((\\u.P) (\\i.k))))) (\\b.\\x.\\b.\\j.\\w.\\t.l)) (I w z e))))",
      "u (\\a.\\u.e (A (Y (l p)) (\\g.\\t.w)))"
    );
  }

  @Test
  public final void test295() {
    reducesTo(
      "\\o.\\p.(\\r.(\\r.\\f.h) ((\\m.m) (\\g.l (\\j.\\p.a) ((\\q.(\\t.\\a.\\g.g) (p b (K s)) (\\y.(\\v.E) (c U w))) (T (C (\\l.Q w v))))))) (k (\\j.c W)) v",
      "\\o.\\p.h"
    );
  }

  @Test
  public final void test296() {
    reducesTo(
      "\\b.(\\c.n) L",
      "\\b.n"
    );
  }

  @Test
  public final void test297() {
    reducesTo(
      "(\\u.\\x.(\\l.(\\t.f) ((\\w.n) c)) l) ((\\e.H) (\\e.\\y.\\n.E)) (\\k.\\h.\\c.\\g.\\p.s ((\\c.V) ((\\c.(\\s.(\\w.D) U) (D s (\\n.j))) ((\\j.c) A ((\\r.j) (p u)))) (\\y.P (\\d.(\\f.N (\\c.h)) (j (\\t.s v (c J))))) (z M (\\l.G (D K (\\s.h) (\\n.N) ((\\w.l q F) (r d (j r)))))) (\\p.b)))",
      "f"
    );
  }

  @Test
  public final void test298() {
    reducesTo(
      "j (\\x.\\i.(\\t.(\\e.(\\h.r) e) ((\\n.(\\z.g) N ((\\t.F) (m K))) m ((\\c.t) R) (\\b.\\u.\\d.l) (\\p.(\\i.\\e.K) ((\\l.n (\\l.v) X) u) (z ((\\a.\\e.\\x.r) (\\o.h) m))))) (L (\\g.X ((\\j.\\c.\\h.(\\e.f) (\\u.f) (\\x.\\x.\\v.b) (m q (H m) (\\r.\\d.u))) R)) (\\k.\\r.\\n.g ((\\s.i) (\\e.(\\r.x) (E U) I) n) (\\q.\\l.\\d.\\i.\\c.(\\t.(\\h.J t (t U) (\\u.f (u J)) (\\y.\\s.(\\r.\\g.O) (\\e.C))) r) (k (\\z.h e))))))",
      "j (\\x.\\i.r)"
    );
  }

  @Test
  public final void test299() {
    reducesTo(
      "(\\t.V (W u (\\e.Y) (I w f) (\\z.\\m.Q) (\\l.E) ((\\r.q (\\b.(\\l.f) (l g)) (\\t.(\\f.\\c.\\f.v) (m k N))) (y B z ((\\f.u) (b n)) (\\i.\\k.o (\\n.j) (r h (N b)))))) (d (\\j.(\\k.f) e))) (\\i.(\\y.v h) (\\z.(\\m.m) (\\r.E (V o)))) p",
      "V (W u (\\e.Y) (I w f) (\\z.\\m.Q) (\\l.E) (q (\\b.f) (\\t.\\c.\\f.v))) (d (\\j.f)) p"
    );
  }

  @Test
  public final void test300() {
    reducesTo(
      "(\\p.B) ((\\s.j) (K (\\m.Q (D W (\\z.d)) k ((\\b.t Y (f o) (\\r.m)) (\\d.(\\c.\\i.R x) (\\y.\\f.\\a.u)))) (\\q.N) (\\d.w (f (r h G (\\z.S) (N v (m b) (T O (f h))))) b)))",
      "B"
    );
  }

  @Test
  public final void test301() {
    reducesTo(
      "\\f.(\\i.(\\p.(\\g.v ((\\w.s) N) a ((\\r.(\\i.\\f.k k) (\\u.w)) ((\\w.W) (c o) (q (z w))))) (r (\\k.\\i.(\\p.\\q.R (\\l.o)) ((\\q.b) (i c) l)))) (\\q.A)) r t (\\c.\\q.h)",
      "\\f.v (s) a (\\f.k k) t (\\c.\\q.h)"
    );
  }

  @Test
  public final void test302() {
    reducesTo(
      "(\\g.v) (c (\\n.N (\\e.i ((\\b.l) (\\f.\\q.\\c.(\\y.t) a) (\\x.V)))))",
      "v"
    );
  }

  @Test
  public final void test303() {
    reducesTo(
      "S (w (e (\\o.\\q.b) (f ((\\u.\\q.\\s.(\\w.\\g.\\d.D) F (\\a.\\s.\\l.\\w.\\o.m p)) (\\m.\\v.(\\h.\\x.i (i (E V))) (\\a.\\w.(\\c.E) V ((\\b.k) (r o))))))) (\\u.\\z.b))",
      "S (w (e (\\o.\\q.b) (f (\\q.\\s.\\d.D))) (\\u.\\z.b))"
    );
  }

  @Test
  public final void test304() {
    reducesTo(
      "\\i.\\z.\\a.\\x.\\o.\\b.(\\m.\\u.(\\d.(\\d.D) ((\\u.\\q.\\e.a) r) (\\k.(\\v.\\i.(\\v.z A) c) ((\\o.s V (m f)) (\\o.\\w.i Y))) (\\j.\\v.F) ((\\p.t) (\\g.W))) (q ((\\k.(\\q.\\r.a) (\\u.\\h.k) (\\g.\\b.c ((\\f.q) (h q)) (\\q.t o (\\m.Y) ((\\v.C) (c I))))) o))) l (\\g.(\\o.\\t.(\\i.u (q ((\\t.\\t.u G) (W o R) T ((\\t.(\\t.\\k.C F) (x q (\\g.r))) I)))) ((\\l.\\q.e) (\\i.(\\i.(\\y.\\e.\\m.K) (\\x.\\c.(\\k.T) (\\j.i) (\\r.\\z.I))) (x (\\t.j))) (\\m.\\k.\\f.\\j.\\t.t))) (\\a.H))",
      "\\i.\\z.\\a.\\x.\\o.\\b.D (\\k.\\i.z A) (\\j.\\v.F) (t)"
    );
  }

  @Test
  public final void test305() {
    reducesTo(
      "(\\n.(\\y.u) (\\k.\\n.L (\\a.(\\b.(\\p.\\h.\\f.\\l.W) ((\\h.\\c.(\\o.T ((\\g.k) (r A))) (\\x.\\s.(\\d.x) (\\y.\\k.r))) (\\o.K))) f))) (\\b.P)",
      "u"
    );
  }

  @Test
  public final void test306() {
    reducesTo(
      "\\y.\\u.\\i.\\t.\\e.\\v.(\\s.(\\t.\\g.\\k.\\n.(\\p.(\\l.s ((\\a.(\\t.T N) (n (\\g.w)) (\\v.\\m.\\o.t)) l)) (\\x.\\z.\\o.\\h.\\o.\\n.(\\k.N) (\\z.M (k r)) (\\e.(\\m.(\\b.(\\u.p) (G j)) (\\l.x) (\\b.\\w.\\p.\\k.Z v (\\p.c))) (\\l.(\\f.S) H)))) G) ((\\w.\\p.\\l.(\\t.t) (\\r.\\h.(\\s.p (\\k.(\\s.\\u.U) ((\\t.P) (f v) (\\x.r w G)))) (k y (P E) e (\\o.k) ((\\c.\\y.o j) I ((\\o.r (h O)) (Y f h)))))) Y)) (s ((\\d.(\\n.z) (\\g.(\\q.y) ((\\y.l) (B h))) ((\\m.l K N (\\v.d f (\\s.c))) (\\u.\\a.\\w.n (\\m.\\q.k))) (\\p.(\\c.\\w.(\\b.p) (\\d.g) ((\\k.E) T)) (L (\\u.F) (\\f.\\b.H h)) u)) (\\q.j)) (\\a.(\\p.\\p.\\u.j) (\\f.(\\f.\\f.o) ((\\w.t x (D l) B ((\\i.\\v.\\c.K) s)) N)) (\\k.X)))",
      "\\y.\\u.\\i.\\t.\\e.\\v.\\g2.\\k3.\\n4.s (z (l K N (\\v.j (\\s.c))) (\\p.p (E))) (\\a.\\u.j) (T N (\\v6.\\m.\\o7.\\p.\\l.\\r.\\h.p (\\k.\\u.U)))"
    );
  }

  @Test
  public final void test307() {
    reducesTo(
      "\\n.(\\s.h g (\\v.P)) o",
      "\\n.h g (\\v.P)"
    );
  }

  @Test
  public final void test308() {
    reducesTo(
      "\\v.\\z.A",
      "\\v.\\z.A"
    );
  }

  @Test
  public final void test309() {
    reducesTo(
      "(\\w.(\\w.\\h.(\\c.o) X (\\f.\\z.\\w.(\\o.\\q.(\\t.n) (C (w o) (D m (S g)) z)) (u d m (K (\\q.a) u ((\\u.n) (\\x.Q (j I))))))) (x i R (\\r.g)) (\\g.\\u.\\p.t)) U",
      "o (\\f.\\z.\\w.\\q.n)"
    );
  }

  @Test
  public final void test310() {
    reducesTo(
      "\\m.(\\p.(\\m.w) M) (\\e.P)",
      "\\m.w"
    );
  }

  @Test
  public final void test311() {
    reducesTo(
      "o ((\\z.(\\u.(\\t.\\t.R (\\l.W) (\\q.a (\\l.b u L ((\\s.f) (l h)))) (\\m.(\\l.(\\m.S (c t (\\p.L))) (y p (v n) C)) (\\f.\\m.r u (l n) (\\r.i) (\\n.p)))) (l h (\\i.\\s.\\x.v))) y) (\\z.z))",
      "o (\\t.R (\\l.W) (\\q.a (\\l.b y L (f))) (\\m.S (c t (\\p.L))))"
    );
  }

  @Test
  public final void test312() {
    reducesTo(
      "T ((\\x.\\a.\\z.\\q.g (x x (\\t.\\m.(\\o.(\\h.\\m.M) ((\\t.q) (x j))) r) L)) (\\e.G (o (\\z.e (\\d.a)) ((\\g.\\h.(\\l.c) n ((\\t.j) (q Q))) ((\\n.m b (i x)) (\\w.(\\n.T) k)))) (\\b.(\\b.r) (\\e.\\z.Y)))) ((\\l.k g f o) z ((\\q.F) ((\\w.\\p.t (m (\\q.\\u.Y) (\\i.f))) b)))",
      "T (\\a1.\\z.\\q2.g (G (o (\\z.G (o (\\z.a) (\\h.c (j))) (\\b.r)) (\\h.c (j))) (\\b.r) (\\t.\\m3.\\m.M) L)) (k g f o (F))"
    );
  }

  @Test
  public final void test313() {
    reducesTo(
      "q (\\j.\\e.m) (\\t.(\\q.(\\o.\\p.\\l.\\g.E m (\\t.l)) q (\\k.(\\n.T r (I L) c) (f (z m (c B))))) (\\a.(\\l.\\j.U) (\\s.\\p.\\t.\\b.(\\a.o) (\\g.z)) (\\c.h)) Q ((\\x.T (\\j.\\c.\\b.u)) E) (l i (\\f.(\\q.\\c.j) (Z O ((\\f.\\r.\\d.\\s.g) (Y (\\s.\\r.U G))) (E (d ((\\u.n) (\\a.c)) (\\b.l (\\p.\\w.a q))))))))",
      "q (\\j.\\e.m) (\\t.E m (\\t.Q) (l i (\\f.\\c.j)))"
    );
  }

  @Test
  public final void test314() {
    reducesTo(
      "t ((\\x.\\x.s (\\u.(\\q.x X (n d)) (\\s.\\y.y F) (\\u.g)) (\\q.\\a.\\s.H l (\\h.\\r.(\\w.\\j.a (\\r.X)) K)) (\\e.w)) n (\\m.(\\b.(\\u.(\\b.C f (m H)) n ((\\u.\\m.f R) (\\u.Q)) (P (q ((\\t.P) (g h))))) (S (v l ((\\b.I) (\\y.\\c.z v)))) (K Z)) (\\g.a)))",
      "t (s (\\u.C f (X H) (\\m.f R) (P (q (P))) (K Z) (n d) (\\u.g)) (\\q.\\a.\\s.H l (\\h.\\r.\\j.a (\\r.X))) (\\e.w))"
    );
  }

  @Test
  public final void test315() {
    reducesTo(
      "\\r.\\j.A",
      "\\r.\\j.A"
    );
  }

  @Test
  public final void test316() {
    reducesTo(
      "x Y (\\h.(\\j.p) ((\\v.\\t.\\t.\\n.I) ((\\j.Y) Z)) (n (\\c.A))) ((\\y.Q) (\\x.(\\i.\\z.v v ((\\e.m) (\\q.P (\\q.(\\w.u) (D t)))) ((\\t.\\k.\\z.U) (W w e ((\\k.q) (\\y.a))) (\\l.\\u.\\c.\\v.d))) m)) (\\k.(\\b.\\f.\\l.c ((\\i.U j) (b F (m P) m) (c ((\\q.\\l.m s) (r (\\q.V)))) n t)) x)",
      "x Y (\\h.p (n (\\c.A))) (Q) (\\k.\\f.\\l.c (U j (c (\\l.m s)) n t))"
    );
  }

  @Test
  public final void test317() {
    reducesTo(
      "\\k.\\r.(\\y.C) (\\y.(\\s.(\\v.(\\i.a) l c) r) (\\r.f))",
      "\\k.\\r.C"
    );
  }

  @Test
  public final void test318() {
    reducesTo(
      "u i ((\\z.\\w.(\\o.(\\n.T) o) (\\u.g)) (\\r.\\v.\\l.\\i.\\q.o))",
      "u i (\\w.T)"
    );
  }

  @Test
  public final void test319() {
    reducesTo(
      "(\\k.\\m.l) (\\z.(\\p.(\\z.q) S) (\\p.(\\i.\\g.\\m.l (\\l.m b (\\n.I) ((\\t.n) (t T)) (B (\\d.k) ((\\k.p) (\\a.Z))))) (S (\\j.E t (\\s.T) m) P) (\\y.\\p.(\\u.(\\f.\\k.\\c.c (\\e.a N) O) ((\\h.X) (\\a.\\h.\\f.m) (\\t.(\\s.m a (\\o.x)) (i t (z G))))) b) V))",
      "\\m.l"
    );
  }

  @Test
  public final void test320() {
    reducesTo(
      "\\a.p ((\\s.(\\x.f ((\\p.e c r ((\\h.Y) (\\c.q))) (M (\\h.Z x (e l))) (\\f.\\x.\\p.z))) i) (\\w.\\q.(\\e.t) ((\\j.h y (\\w.e)) (i U (\\h.k))) (\\h.\\z.k B) d ((\\k.(\\d.(\\n.t) (\\b.e)) (\\f.f q (H p))) V ((\\b.\\n.e) (\\r.I f ((\\m.F) B))) (p (v d))))) (u ((\\j.\\d.\\c.\\m.(\\h.h) (o t)) ((\\u.(\\o.e) (\\k.d)) (f I (\\b.p)))) (R (\\p.W)) (\\b.(\\t.\\j.o (\\t.(\\j.(\\l.\\o.o) l) n)) ((\\j.\\v.(\\d.\\k.i) (\\k.\\y.o)) ((\\c.\\a.\\i.z) (\\r.n (\\o.D))) (X D))) (h ((\\i.\\q.p ((\\g.\\i.p) (\\i.\\s.\\o.v) H)) f)) (\\m.n))",
      "\\a.p (f (e c r (Y) (\\f.\\x.\\p.z))) (u (\\d.\\c.\\m.o t) (R (\\p.W)) (\\b.\\j.o (\\t.\\o.o)) (h (\\q.p (p))) (\\m.n))"
    );
  }

  @Test
  public final void test321() {
    reducesTo(
      "y (\\d.\\y.\\n.\\h.(\\o.(\\r.b (\\m.N)) ((\\m.Y) D (\\a.l) ((\\b.y) (\\j.l) (\\v.\\w.i C)))) (\\l.b (\\u.\\w.(\\v.(\\e.s) (S z) (\\d.\\l.t)) m)) (X C (\\g.X (\\q.T (K Y (e I)) i))) (\\i.(\\l.\\m.P) s)) ((\\u.\\w.e ((\\k.z) z (\\q.(\\g.(\\x.(\\j.x) (G d)) i) X (\\h.\\p.e))) (x U)) r)",
      "y (\\d.\\y.\\n.\\h.b (\\m.N) (X C (\\g.X (\\q.T (K Y (e I)) i))) (\\i.\\m.P)) (\\w.e (z (\\q.i (\\h.\\p.e))) (x U))"
    );
  }

  @Test
  public final void test322() {
    reducesTo(
      "(\\l.b) c",
      "b"
    );
  }

  @Test
  public final void test323() {
    reducesTo(
      "a (\\i.\\d.M)",
      "a (\\i.\\d.M)"
    );
  }

  @Test
  public final void test324() {
    reducesTo(
      "(\\d.\\o.\\w.\\u.h (y (\\e.u)) s) ((\\u.(\\c.\\w.M (\\v.h)) ((\\d.\\r.U) (u E (K q) z)) (q (i d) (\\y.\\i.\\t.e) (\\c.r K (Q n) (Y (y F))) (\\c.(\\r.\\b.d) (\\m.o) (u y (\\s.s) (m n L)))) r ((\\r.\\c.(\\h.\\f.\\v.W) ((\\v.\\a.n) r) (A A)) (\\v.(\\m.\\m.\\j.e) (\\p.(\\a.a d (\\i.D (e L))) (\\a.t ((\\r.h) (Q s))) (\\g.(\\i.s) (Z v) u (\\k.\\c.\\z.\\w.\\f.t g)))))) (h q))",
      "\\o.\\w.\\u.h (y (\\e.u)) s"
    );
  }

  @Test
  public final void test325() {
    reducesTo(
      "(\\l.\\t.i) (\\c.K)",
      "\\t.i"
    );
  }

  @Test
  public final void test326() {
    reducesTo(
      "\\u.A",
      "\\u.A"
    );
  }

  @Test
  public final void test327() {
    reducesTo(
      "\\i.r",
      "\\i.r"
    );
  }

  @Test
  public final void test328() {
    reducesTo(
      "(\\y.x (\\y.\\t.q) (\\t.(\\x.\\m.(\\c.(\\a.\\d.(\\z.(\\g.S) ((\\z.w q C) L)) (\\g.\\l.\\k.\\h.(\\i.(\\x.\\u.J) I) v)) (\\r.v)) (z (\\f.\\s.\\l.\\h.j ((\\j.\\j.o) (O l (S L))) h))) (\\a.h z (\\f.T ((\\p.(\\r.(\\p.a) (\\p.h)) (\\r.\\l.m x)) (\\d.I) (\\m.(\\a.\\t.\\n.x) (g K (\\d.v)) V)))))) (d d)",
      "x (\\y.\\t.q) (\\t.\\m.\\d.S)"
    );
  }

  @Test
  public final void test329() {
    reducesTo(
      "\\n.(\\w.(\\d.\\u.n) (\\d.\\z.\\f.i) (s ((\\p.n) (\\x.(\\m.c) P (\\d.M (N h)) q)) (\\u.\\y.(\\w.a (\\e.a)) C)) A) S",
      "\\n.n A"
    );
  }

  @Test
  public final void test330() {
    reducesTo(
      "\\o.\\f.h",
      "\\o.\\f.h"
    );
  }

  @Test
  public final void test331() {
    reducesTo(
      "\\o.l",
      "\\o.l"
    );
  }

  @Test
  public final void test332() {
    reducesTo(
      "(\\g.\\h.\\g.w (\\d.\\c.J f) (\\y.g ((\\x.D (b x (\\x.k))) (\\l.V a (g J) (\\h.\\c.N U)))) N U ((\\a.\\l.\\o.H) (\\l.z T))) ((\\f.\\q.b) ((\\x.Z) ((\\n.s (\\n.j (\\t.g))) (\\q.\\z.p) (s (\\i.z) (\\n.\\g.w) ((\\d.\\l.\\u.q) (\\g.\\c.v))))) (\\l.(\\d.y) (\\c.\\x.\\y.\\h.H j)) (\\y.\\g.(\\y.J (q (w y) (\\c.(\\j.R) (i d))) (M (\\f.(\\p.\\z.\\n.q) N)) ((\\t.\\y.p) (C a (\\u.f) (n d (\\v.s))) (j ((\\y.m B) f))) (Y (\\w.\\n.(\\t.l) (\\d.(\\m.\\j.j E) (\\a.\\x.N) (w d v ((\\b.j) (\\g.h))))))) (\\r.(\\y.\\n.P) (\\g.T (m a) (\\q.\\u.\\b.o) (M w (\\s.Z) ((\\y.x) f))) ((\\n.(\\b.E) ((\\l.\\w.C d) (\\v.\\g.\\d.N))) (\\w.\\c.o)) (t ((\\j.p) ((\\w.i) (\\z.q))) (U b (s z) (\\f.(\\d.q) (\\r.S)) (\\b.p)) e))))",
      "\\h.\\g.w (\\d.\\c.J f) (\\y.g (D (b (\\l.V a (g J) (\\h.\\c.N U)) (\\x.k)))) N U (\\l.\\o.H)"
    );
  }

  @Test
  public final void test333() {
    reducesTo(
      "\\w.Y",
      "\\w.Y"
    );
  }

  @Test
  public final void test334() {
    reducesTo(
      "i (h ((\\z.\\i.\\k.\\w.(\\a.u) (\\g.\\h.\\a.\\o.(\\x.i) (\\d.x)) (\\o.\\i.p) (\\r.x)) (\\v.\\e.\\q.\\v.(\\x.\\z.(\\i.q) (\\v.(\\e.(\\q.L y) (\\i.\\e.b)) (j (n q (h g))))) (\\x.M))) (\\r.(\\t.\\k.n) (Z (\\s.l (\\b.S) o) I (\\p.\\h.(\\l.x (\\m.s) j) (\\t.(\\x.T) (\\l.m) (\\f.(\\x.L) h)) (\\e.\\a.\\o.b))) (\\g.w ((\\g.t) ((\\a.e) (\\o.P)) p v) (\\y.v (\\d.R c l (\\w.P g u)) m ((\\x.j) m ((\\d.L) (R f)) i ((\\z.B M (S m) (\\d.\\o.b)) (\\n.\\q.r g)))))))",
      "i (h (\\i.\\k.\\w.u (\\o.\\i.p) (\\r.x)) (\\r.n))"
    );
  }

  @Test
  public final void test335() {
    reducesTo(
      "U ((\\m.\\c.Y t) (\\h.N ((\\j.r (B (\\w.b) L)) (i e (\\j.x) (c K (\\u.z)) (\\q.(\\y.L v) (\\j.\\x.D)))) (\\p.(\\f.q n (\\k.q) (l D (\\e.s)) (\\h.(\\z.\\o.\\k.H) (\\u.p)) (T (\\z.F) (h a (J q)) (\\c.j V m R))) ((\\m.x T (\\o.e)) (\\y.\\j.O) (e (r p) (u (a c))) (k (z w P (\\i.(\\q.u) (a i)))))) i))",
      "U (\\c.Y t)"
    );
  }

  @Test
  public final void test336() {
    reducesTo(
      "\\j.(\\i.(\\m.u) (\\b.I (q (\\k.(\\g.\\x.\\w.\\l.q) R))) ((\\s.n) ((\\u.\\j.(\\y.\\d.\\p.v (j O (V h) (\\h.s (E r))) (\\t.P)) (\\k.u ((\\v.a) v))) ((\\z.\\o.(\\m.\\q.G f) C ((\\t.\\c.w N) (q u (b H))) n) (D (w ((\\m.L) (s Z))) ((\\d.T) (\\j.\\u.\\h.h) (\\h.(\\y.I k (\\r.B)) (\\e.f x (\\g.o))))))))) (W (x ((\\u.\\l.B) p)))",
      "\\j.u (n)"
    );
  }

  @Test
  public final void test337() {
    reducesTo(
      "\\p.Q",
      "\\p.Q"
    );
  }

  @Test
  public final void test338() {
    reducesTo(
      "\\z.L",
      "\\z.L"
    );
  }

  @Test
  public final void test339() {
    reducesTo(
      "\\d.\\c.v ((\\q.\\x.\\m.j E) (\\e.c)) ((\\o.(\\i.y) ((\\f.\\h.C) ((\\n.\\q.S) (\\a.\\a.W))) Z) (\\l.\\h.(\\x.(\\x.\\h.w m) (\\q.\\o.o P)) (\\d.(\\c.n Q (\\g.b)) (\\k.\\s.\\q.p)) ((\\t.s j f (\\b.A)) (g I)) (\\w.\\g.\\t.\\p.\\h.I (\\n.u C m (\\v.y C)) (\\b.g (\\u.s)))) c ((\\j.\\y.O) c))",
      "\\d.\\c.v (\\x.\\m.j E) (y Z c (\\y.O))"
    );
  }

  @Test
  public final void test340() {
    reducesTo(
      "T ((\\t.\\b.(\\a.\\e.\\x.D) z) ((\\b.\\s.\\i.(\\i.\\m.\\g.O h F ((\\l.M) (\\m.X))) ((\\s.\\e.Y) (K z)) (\\w.\\b.\\d.o (\\d.\\k.n M) f) i ((\\p.i j ((\\p.i) (\\a.\\u.M b)) (U (n r (I i) (\\u.\\y.p O)))) (\\x.(\\d.\\o.M J R) ((\\f.x) ((\\n.Y) (\\i.k)) (f (j g (M G))))))) ((\\j.\\w.\\z.t ((\\h.\\a.B) i)) R)))",
      "T (\\b.\\e.\\x.D)"
    );
  }

  @Test
  public final void test341() {
    reducesTo(
      "\\j.(\\f.\\i.s) (X (\\s.\\c.\\q.F) (I m) (\\q.(\\x.t) (\\l.\\z.g)) (\\s.(\\c.c (\\i.\\s.(\\o.(\\y.\\m.y o e ((\\v.k) x)) v F) (\\r.N))) (\\p.\\t.\\q.p ((\\f.v) (M (\\t.h))))))",
      "\\j.\\i.s"
    );
  }

  @Test
  public final void test342() {
    reducesTo(
      "C (\\g.r)",
      "C (\\g.r)"
    );
  }

  @Test
  public final void test343() {
    reducesTo(
      "\\s.(\\x.(\\l.\\p.n) (\\j.(\\c.(\\d.(\\v.s) l ((\\b.O) (\\w.f))) (\\e.\\h.R f) ((\\l.(\\i.c) g ((\\n.n) (\\n.k))) (l (\\w.\\o.\\w.a)))) (g (q (\\g.\\f.x a) (\\u.P))) p) ((\\z.\\s.(\\y.\\x.\\m.w) o (\\g.(\\z.(\\b.\\j.q (\\i.i)) (\\t.\\u.(\\n.(\\l.s s) (Z (w s))) v)) V)) (\\p.\\p.\\b.e))) h",
      "\\s.n"
    );
  }

  @Test
  public final void test344() {
    reducesTo(
      "\\l.\\x.U ((\\p.w x) W ((\\d.z (\\v.(\\m.q (h (\\r.C))) (\\f.Z (\\i.g)))) (\\b.j)) t ((\\z.(\\f.\\g.\\b.J) (\\u.\\m.l (\\u.\\m.(\\v.(\\m.i) C (\\s.n)) (x j (z e) (\\u.\\f.P r)))) ((\\e.\\w.\\w.F) (\\k.A (\\v.m w (c t) (\\r.f))) ((\\q.g) j))) (y (\\s.(\\q.V (w j) (x N)) (\\o.\\m.o (\\k.m) (\\y.H t))) ((\\y.\\f.\\g.E) n) o)))",
      "\\l.\\x.U (w x (z (\\v.q (h (\\r.C)))) t (\\b.J))"
    );
  }

  @Test
  public final void test345() {
    reducesTo(
      "\\g.\\u.\\h.(\\s.i b g (\\o.(\\i.\\f.n w) y ((\\f.a (\\n.\\s.\\f.\\x.H) ((\\z.(\\x.\\n.K s) (\\n.(\\b.O) (\\d.H))) (\\x.\\w.y) ((\\s.\\y.b I) ((\\p.G) (m K)) (\\h.q)))) (M (\\o.\\a.i (I d (k r)) (\\r.\\j.\\h.(\\v.o) (f j))) (\\v.(\\m.v) z))))) (x ((\\z.z) U))",
      "\\g.\\u.\\h.i b g (\\o.n w)"
    );
  }

  @Test
  public final void test346() {
    reducesTo(
      "\\g.A",
      "\\g.A"
    );
  }

  @Test
  public final void test347() {
    reducesTo(
      "(\\o.(\\k.\\h.\\l.\\f.\\t.r) u) (\\n.(\\y.z (\\l.(\\s.c) (I B) (p o a)) (\\k.\\g.(\\p.H) (\\f.\\v.y n)) (\\f.\\k.f)) (\\u.(\\g.(\\a.m) (\\u.(\\s.d) a) (g j (q z) (\\u.n t (k t)))) (w (s (\\l.u)) O) (\\u.\\x.s (S (i z)) (o (\\g.y p (\\n.g))) d))) (s ((\\w.(\\h.\\a.u) (e D (\\r.G) ((\\y.l) u)) (\\j.\\n.S)) s) (v n)) O",
      "\\f.\\t.r"
    );
  }

  @Test
  public final void test348() {
    reducesTo(
      "g ((\\i.(\\j.\\g.\\n.\\k.b (\\o.P)) (g l (\\i.j) Z) (\\j.\\c.\\l.\\j.X (\\u.c) (\\t.\\t.c) (\\j.\\n.\\l.(\\y.T) (\\j.i)))) (y (\\n.\\c.(\\b.\\i.v p) (\\y.\\p.U f) ((\\f.\\m.g x) (T (V w))))) (\\y.f) (\\o.\\o.S) (\\a.(\\z.\\e.r) (\\f.t)))",
      "g (b (\\o.P) (\\a.\\e.r))"
    );
  }

  @Test
  public final void test349() {
    reducesTo(
      "\\v.F ((\\n.f (c (z p d))) (\\z.\\d.(\\q.\\k.m L) (\\t.(\\y.H g) (\\l.(\\k.\\m.\\v.u) (\\x.(\\a.Q) E)) (\\h.E (\\w.Y)) (\\c.\\r.(\\r.K e (\\t.h)) (\\t.\\h.\\b.o) (\\c.A) ((\\c.\\f.(\\s.\\p.v) (l i (Z v))) ((\\f.\\o.K v) q))))) (\\l.(\\y.\\m.l g) v (\\h.\\t.m)))",
      "\\v.F (f (c (z p d)) (\\l.l g))"
    );
  }

  @Test
  public final void test350() {
    reducesTo(
      "\\s.(\\j.\\s.\\h.(\\c.\\d.a) ((\\d.\\f.\\j.\\q.(\\s.\\p.(\\r.d) t m) ((\\r.(\\l.h) (n S)) (z o (\\l.r)) ((\\f.F) (\\y.i) (\\e.(\\u.M) (t r))))) (\\t.s)) y (d ((\\s.\\u.\\d.(\\b.\\d.(\\g.E) ((\\l.V) (\\v.b))) (\\z.\\i.\\f.i)) (i (\\s.b) ((\\y.G) (n r)) (\\p.e)) e) (d (\\v.\\o.\\s.U (w W (\\j.t))) (\\r.\\t.(\\v.(\\l.\\s.i) (\\d.M v)) a) ((\\h.\\y.(\\w.K) (r k) (\\p.L q (x c)) (e (\\k.R) (\\g.r J f))) w) (A (\\d.\\b.l (G Z) (n x m) (c (u u) J) z))))) C",
      "\\s.\\s.\\h.a (d (\\d.\\d.E) (d (\\v.\\o.\\s.U (w W (\\j.t))) (\\r.\\t.\\s.i) (\\y.K (\\p.L q (x c)) (e (\\k.R) (\\g.r J f))) (A (\\d.\\b.l (G Z) (n x m) (c (u u) J) z))))"
    );
  }

  @Test
  public final void test351() {
    reducesTo(
      "\\z.\\k.\\m.e",
      "\\z.\\k.\\m.e"
    );
  }

  @Test
  public final void test352() {
    reducesTo(
      "(\\a.\\m.h) (\\d.l (t X))",
      "\\m.h"
    );
  }

  @Test
  public final void test353() {
    reducesTo(
      "(\\z.u) A",
      "u"
    );
  }

  @Test
  public final void test354() {
    reducesTo(
      "\\p.\\b.(\\s.h) ((\\y.q) (\\h.(\\r.(\\m.r (f (C z))) ((\\y.f) q ((\\w.g) (G B)))) (\\d.\\n.(\\w.\\o.(\\f.t C) J) s) z)) ((\\f.\\h.x b ((\\h.\\f.r) s) (\\y.\\f.(\\h.(\\t.\\v.h) ((\\c.F) (\\l.c))) p) l) ((\\n.h) (\\t.c) ((\\c.\\a.\\y.i s p c) (\\h.y E q G) (\\r.\\x.\\a.(\\d.T B y) (\\r.\\z.\\m.u) (\\t.l)))) (\\y.w)) T",
      "\\p.\\b.h (x b (\\f.r) (\\y.\\f.\\v.p) l) T"
    );
  }

  @Test
  public final void test355() {
    reducesTo(
      "\\q.A",
      "\\q.A"
    );
  }

  @Test
  public final void test356() {
    reducesTo(
      "(\\q.J) ((\\q.\\o.o) (\\d.H (\\n.K) ((\\u.\\i.\\g.(\\e.U x) (\\m.\\c.\\p.V) (\\b.(\\g.(\\c.n) (\\f.p)) (J C (j f))) Z l) (\\z.\\i.\\g.\\q.p (\\y.V) (\\z.\\d.l j) ((\\z.s a (G b)) (l M (\\c.t))) (d (\\k.(\\e.A) (\\v.C g (W s)))) d))))",
      "J"
    );
  }

  @Test
  public final void test357() {
    reducesTo(
      "\\r.(\\b.O) (\\u.s ((\\n.l) (T (D (\\t.(\\w.\\y.d u (\\q.h) f) (F ((\\u.b) v)))) (\\z.c))))",
      "\\r.O"
    );
  }

  @Test
  public final void test358() {
    reducesTo(
      "(\\i.\\l.(\\n.\\c.(\\l.\\g.Z) q) (\\d.Q (s T) ((\\g.k) ((\\a.k) (\\o.H v C)) ((\\i.(\\x.X) (\\j.\\d.\\g.W)) (o (\\k.\\n.u n)) (\\m.(\\v.p (\\d.o) (Y S (Z M))) q)))) ((\\y.M) e ((\\v.(\\o.(\\r.Q) (\\j.a)) (\\w.G)) i) (\\z.\\d.F) N V)) i",
      "\\l.\\g.Z"
    );
  }

  @Test
  public final void test359() {
    reducesTo(
      "\\r.s",
      "\\r.s"
    );
  }

  @Test
  public final void test360() {
    reducesTo(
      "\\d.n",
      "\\d.n"
    );
  }

  @Test
  public final void test361() {
    reducesTo(
      "\\v.(\\y.\\u.w) r",
      "\\v.\\u.w"
    );
  }

  @Test
  public final void test362() {
    reducesTo(
      "(\\u.(\\e.Q) j) p",
      "Q"
    );
  }

  @Test
  public final void test363() {
    reducesTo(
      "\\k.w (y (v (\\b.N ((\\r.(\\b.s) (\\f.c)) (\\e.\\x.R) (A q (\\c.p) q)) ((\\a.\\y.(\\n.e) (\\x.c) (\\h.l A (h T)) h) (\\x.(\\c.Y p (g P)) (\\d.\\e.\\r.A) (p E (\\c.P) ((\\i.n) (t i))))) (y (\\i.(\\x.\\v.\\b.\\r.a) z)))))",
      "\\k.w (y (v (\\b.N (s (A q (\\c.p) q)) (\\y.e (\\h.l A (h T)) h) (y (\\i.\\v.\\b.\\r.a)))))"
    );
  }

  @Test
  public final void test364() {
    reducesTo(
      "(\\h.\\i.B) (\\x.\\i.(\\a.\\h.\\o.\\v.\\u.(\\y.x d (k Q) d) g (\\r.C)) (\\r.\\y.G) (\\o.\\h.(\\s.u (\\p.t) (\\g.(\\e.h) (n p))) ((\\n.N) (\\b.h) (a F (m r))) (o ((\\y.T) (\\p.k r (h g)))) f) (\\q.j) ((\\h.(\\p.P) ((\\p.(\\y.g w (\\m.J)) (\\m.R) Z) (z J)) D) (\\y.m)))",
      "\\i.B"
    );
  }

  @Test
  public final void test365() {
    reducesTo(
      "\\x.(\\d.\\a.u) ((\\n.l ((\\v.(\\u.N) (\\d.v)) (h (\\o.D))) ((\\n.O) I)) ((\\e.\\n.l q) ((\\e.M) (s S)) p (\\t.P (\\k.q) (\\v.\\x.\\i.(\\v.\\v.h) ((\\b.l) (\\d.s))))) (T (n (\\l.(\\f.\\n.Z) ((\\e.d) (K N)))) (X (\\v.(\\j.k d) (\\n.h)))) (D (\\v.t) ((\\v.a) s ((\\b.\\c.\\o.\\s.(\\o.G) (\\x.f)) q) (\\s.r)))) (\\s.\\z.Y)",
      "\\x.u"
    );
  }

  @Test
  public final void test366() {
    reducesTo(
      "(\\e.\\w.(\\f.k) (Z W ((\\d.\\r.(\\t.g i) (x f (M Z))) ((\\a.\\d.I) g)) (\\i.I q)) e) (\\r.\\g.s) (\\f.d)",
      "k (\\r.\\g.s)"
    );
  }

  @Test
  public final void test367() {
    reducesTo(
      "(\\a.(\\y.\\l.Y) (Q (\\c.l) ((\\c.Z N (\\o.n)) I ((\\p.a x (e b)) K))) (\\w.\\q.(\\k.(\\v.\\q.\\r.l l (\\w.k) i) x u) (\\w.(\\y.(\\r.k) (r b) (d (f p)) j) (s (\\r.f)))) ((\\n.u) (\\d.\\g.F)) (\\o.P)) (\\f.\\e.N)",
      "Y (u) (\\o.P)"
    );
  }

  @Test
  public final void test368() {
    reducesTo(
      "\\y.(\\t.j (H ((\\p.\\i.\\x.v) (i m c ((\\s.(\\q.\\z.\\v.M) ((\\g.t) (z X))) (J (M (\\r.N)))) (\\e.o (\\b.\\a.r) j))))) ((\\x.\\y.(\\h.\\v.(\\g.a (\\f.\\x.M)) ((\\h.\\b.\\w.c) ((\\s.u) ((\\a.y) (\\n.y))) (j (q k (r i) (\\b.\\h.K a))))) q) (\\p.(\\e.\\m.\\g.I) ((\\j.i) Z p (\\r.(\\e.\\m.\\j.k) (F h (n x))) e ((\\l.l (\\o.k)) (\\o.\\h.\\p.I)))) B)",
      "\\y.j (H (\\i.\\x.v))"
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
