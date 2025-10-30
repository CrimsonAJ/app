package N3;

import java.io.IOException;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes.dex */
public final class G {

    /* renamed from: a, reason: collision with root package name */
    public final int f4921a;

    /* renamed from: b, reason: collision with root package name */
    public final A f4922b;

    /* renamed from: c, reason: collision with root package name */
    public final CopyOnWriteArrayList f4923c;

    /* renamed from: d, reason: collision with root package name */
    public final long f4924d;

    public G() {
        this(new CopyOnWriteArrayList(), 0, null, 0L);
    }

    public final long a(long j) {
        long T8 = l4.y.T(j);
        if (T8 == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        return this.f4924d + T8;
    }

    public final void b(int i9, j3.M m9, int i10, Object obj, long j) {
        c(new C0270v(1, i9, m9, i10, obj, a(j), -9223372036854775807L));
    }

    public final void c(C0270v c0270v) {
        Iterator it = this.f4923c.iterator();
        while (it.hasNext()) {
            F f9 = (F) it.next();
            l4.y.L(f9.f4919a, new E(this, f9.f4920b, c0270v, 0));
        }
    }

    public final void d(C0266q c0266q, int i9, int i10, j3.M m9, int i11, Object obj, long j, long j4) {
        e(c0266q, new C0270v(i9, i10, m9, i11, obj, a(j), a(j4)));
    }

    /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, N3.H] */
    public final void e(C0266q c0266q, C0270v c0270v) {
        Iterator it = this.f4923c.iterator();
        while (it.hasNext()) {
            F f9 = (F) it.next();
            C0266q c0266q2 = c0266q;
            l4.y.L(f9.f4919a, new C(this, f9.f4920b, c0266q2, c0270v, 1));
            c0266q = c0266q2;
        }
    }

    public final void f(C0266q c0266q, int i9) {
        g(c0266q, i9, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
    }

    public final void g(C0266q c0266q, int i9, int i10, j3.M m9, int i11, Object obj, long j, long j4) {
        h(c0266q, new C0270v(i9, i10, m9, i11, obj, a(j), a(j4)));
    }

    /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, N3.H] */
    public final void h(C0266q c0266q, C0270v c0270v) {
        Iterator it = this.f4923c.iterator();
        while (it.hasNext()) {
            F f9 = (F) it.next();
            C0266q c0266q2 = c0266q;
            l4.y.L(f9.f4919a, new C(this, f9.f4920b, c0266q2, c0270v, 0));
            c0266q = c0266q2;
        }
    }

    public final void i(C0266q c0266q, int i9, int i10, j3.M m9, int i11, Object obj, long j, long j4, IOException iOException, boolean z9) {
        k(c0266q, new C0270v(i9, i10, m9, i11, obj, a(j), a(j4)), iOException, z9);
    }

    public final void j(C0266q c0266q, int i9, IOException iOException, boolean z9) {
        i(c0266q, i9, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L, iOException, z9);
    }

    /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, N3.H] */
    public final void k(C0266q c0266q, final C0270v c0270v, final IOException iOException, final boolean z9) {
        Iterator it = this.f4923c.iterator();
        while (it.hasNext()) {
            F f9 = (F) it.next();
            final ?? r42 = f9.f4920b;
            final C0266q c0266q2 = c0266q;
            l4.y.L(f9.f4919a, new Runnable() { // from class: N3.D
                /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, N3.H] */
                @Override // java.lang.Runnable
                public final void run() {
                    G g9 = G.this;
                    int i9 = g9.f4921a;
                    r42.h(i9, g9.f4922b, c0266q2, c0270v, iOException, z9);
                }
            });
            c0266q = c0266q2;
        }
    }

    public final void l(C0266q c0266q, int i9, int i10, j3.M m9, int i11, Object obj, long j, long j4) {
        m(c0266q, new C0270v(i9, i10, m9, i11, obj, a(j), a(j4)));
    }

    /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, N3.H] */
    public final void m(C0266q c0266q, C0270v c0270v) {
        Iterator it = this.f4923c.iterator();
        while (it.hasNext()) {
            F f9 = (F) it.next();
            C0266q c0266q2 = c0266q;
            l4.y.L(f9.f4919a, new C(this, f9.f4920b, c0266q2, c0270v, 2));
            c0266q = c0266q2;
        }
    }

    public final void n(C0270v c0270v) {
        A a5 = this.f4922b;
        a5.getClass();
        Iterator it = this.f4923c.iterator();
        while (it.hasNext()) {
            F f9 = (F) it.next();
            C0270v c0270v2 = c0270v;
            l4.y.L(f9.f4919a, new A6.q(this, f9.f4920b, a5, c0270v2, 1));
            c0270v = c0270v2;
        }
    }

    public G(CopyOnWriteArrayList copyOnWriteArrayList, int i9, A a5, long j) {
        this.f4923c = copyOnWriteArrayList;
        this.f4921a = i9;
        this.f4922b = a5;
        this.f4924d = j;
    }
}
