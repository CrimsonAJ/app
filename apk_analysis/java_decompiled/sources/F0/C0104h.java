package F0;

import android.os.SystemClock;
import f5.InterfaceC1172d;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicLong;
import l4.AbstractC1566a;
import q3.C1901f;
import q3.C1902g;
import q3.InterfaceC1906k;
import q3.InterfaceC1907l;
import v3.C2106c;

/* renamed from: F0.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0104h implements Q3.i, InterfaceC1172d, InterfaceC1906k, InterfaceC1907l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2113a;

    /* renamed from: b, reason: collision with root package name */
    public long f2114b;

    /* renamed from: c, reason: collision with root package name */
    public Object f2115c;

    public /* synthetic */ C0104h(int i9, long j, Object obj) {
        this.f2113a = i9;
        this.f2115c = obj;
        this.f2114b = j;
    }

    @Override // Q3.i
    public long A(long j, long j4) {
        return ((C1901f) this.f2115c).f22303a;
    }

    @Override // q3.InterfaceC1906k
    public void B(byte[] bArr, int i9, int i10) {
        ((C1902g) this.f2115c).t(bArr, i9, i10, false);
    }

    @Override // q3.InterfaceC1906k
    public void C(int i9) {
        ((C1902g) this.f2115c).c(i9, false);
    }

    @Override // k4.InterfaceC1510j
    public int D(byte[] bArr, int i9, int i10) {
        return ((C1902g) this.f2115c).D(bArr, i9, i10);
    }

    @Override // q3.InterfaceC1906k
    public long E() {
        return ((C1902g) this.f2115c).f22312d - this.f2114b;
    }

    public void F(int i9) {
        if (i9 >= 64) {
            C0104h c0104h = (C0104h) this.f2115c;
            if (c0104h != null) {
                c0104h.F(i9 - 64);
                return;
            }
            return;
        }
        this.f2114b &= ~(1 << i9);
    }

    public int G(int i9) {
        C0104h c0104h = (C0104h) this.f2115c;
        if (c0104h == null) {
            if (i9 >= 64) {
                return Long.bitCount(this.f2114b);
            }
            return Long.bitCount(this.f2114b & ((1 << i9) - 1));
        }
        if (i9 < 64) {
            return Long.bitCount(this.f2114b & ((1 << i9) - 1));
        }
        return Long.bitCount(this.f2114b) + c0104h.G(i9 - 64);
    }

    public void H() {
        if (((C0104h) this.f2115c) == null) {
            this.f2115c = new C0104h(0);
        }
    }

    public boolean I(int i9) {
        if (i9 >= 64) {
            H();
            return ((C0104h) this.f2115c).I(i9 - 64);
        }
        if ((this.f2114b & (1 << i9)) != 0) {
            return true;
        }
        return false;
    }

    public void J(int i9, boolean z9) {
        boolean z10;
        if (i9 >= 64) {
            H();
            ((C0104h) this.f2115c).J(i9 - 64, z9);
            return;
        }
        long j = this.f2114b;
        if ((Long.MIN_VALUE & j) != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        long j4 = (1 << i9) - 1;
        this.f2114b = ((j & (~j4)) << 1) | (j & j4);
        if (z9) {
            M(i9);
        } else {
            F(i9);
        }
        if (!z10 && ((C0104h) this.f2115c) == null) {
            return;
        }
        H();
        ((C0104h) this.f2115c).J(0, z10);
    }

    public boolean K(int i9) {
        boolean z9;
        if (i9 >= 64) {
            H();
            return ((C0104h) this.f2115c).K(i9 - 64);
        }
        long j = 1 << i9;
        long j4 = this.f2114b;
        if ((j4 & j) != 0) {
            z9 = true;
        } else {
            z9 = false;
        }
        long j9 = j4 & (~j);
        this.f2114b = j9;
        long j10 = j - 1;
        this.f2114b = (j9 & j10) | Long.rotateRight((~j10) & j9, 1);
        C0104h c0104h = (C0104h) this.f2115c;
        if (c0104h != null) {
            if (c0104h.I(0)) {
                M(63);
            }
            ((C0104h) this.f2115c).K(0);
        }
        return z9;
    }

    public void L() {
        this.f2114b = 0L;
        C0104h c0104h = (C0104h) this.f2115c;
        if (c0104h != null) {
            c0104h.L();
        }
    }

    public void M(int i9) {
        if (i9 >= 64) {
            H();
            ((C0104h) this.f2115c).M(i9 - 64);
        } else {
            this.f2114b |= 1 << i9;
        }
    }

    public void N(Exception exc) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (((Exception) this.f2115c) == null) {
            this.f2115c = exc;
            this.f2114b = 100 + elapsedRealtime;
        }
        if (elapsedRealtime >= this.f2114b) {
            Exception exc2 = (Exception) this.f2115c;
            if (exc2 != exc) {
                exc2.addSuppressed(exc);
            }
            Exception exc3 = (Exception) this.f2115c;
            this.f2115c = null;
            throw exc3;
        }
    }

    @Override // Q3.i
    public long c(long j) {
        return ((C1901f) this.f2115c).f22307e[(int) j] - this.f2114b;
    }

    @Override // Q3.i
    public long d(long j, long j4) {
        return l4.y.e(((C1901f) this.f2115c).f22307e, j + this.f2114b, true);
    }

    @Override // q3.InterfaceC1906k
    public boolean e(byte[] bArr, int i9, int i10, boolean z9) {
        return ((C1902g) this.f2115c).e(bArr, 0, i10, z9);
    }

    @Override // Q3.i
    public long h(long j, long j4) {
        return ((C1901f) this.f2115c).f22306d[(int) j];
    }

    @Override // q3.InterfaceC1907l
    public void i() {
        ((InterfaceC1907l) this.f2115c).i();
    }

    @Override // q3.InterfaceC1906k
    public long j() {
        return ((C1902g) this.f2115c).f22311c - this.f2114b;
    }

    @Override // Q3.i
    public long k(long j, long j4) {
        return 0L;
    }

    @Override // q3.InterfaceC1906k
    public void m() {
        ((C1902g) this.f2115c).f22314f = 0;
    }

    @Override // q3.InterfaceC1906k
    public void n(int i9) {
        ((C1902g) this.f2115c).n(i9);
    }

    @Override // Q3.i
    public long o(long j, long j4) {
        return -9223372036854775807L;
    }

    @Override // Q3.i
    public R3.j p(long j) {
        return new R3.j(((C1901f) this.f2115c).f22305c[(int) j], null, r1.f22304b[r7]);
    }

    @Override // Q3.i
    public boolean q() {
        return true;
    }

    @Override // q3.InterfaceC1907l
    public void r(q3.r rVar) {
        ((InterfaceC1907l) this.f2115c).r(new C2106c(this, rVar));
    }

    @Override // q3.InterfaceC1906k
    public void readFully(byte[] bArr, int i9, int i10) {
        ((C1902g) this.f2115c).e(bArr, i9, i10, false);
    }

    @Override // q3.InterfaceC1906k
    public boolean t(byte[] bArr, int i9, int i10, boolean z9) {
        return ((C1902g) this.f2115c).t(bArr, i9, i10, z9);
    }

    public String toString() {
        switch (this.f2113a) {
            case 0:
                if (((C0104h) this.f2115c) == null) {
                    return Long.toBinaryString(this.f2114b);
                }
                return ((C0104h) this.f2115c).toString() + "xx" + Long.toBinaryString(this.f2114b);
            default:
                return super.toString();
        }
    }

    @Override // q3.InterfaceC1907l
    public q3.u u(int i9, int i10) {
        return ((InterfaceC1907l) this.f2115c).u(i9, i10);
    }

    @Override // Q3.i
    public long v() {
        return 0L;
    }

    @Override // q3.InterfaceC1906k
    public long w() {
        return ((C1902g) this.f2115c).w() - this.f2114b;
    }

    @Override // f5.InterfaceC1172d
    public void y(Exception exc) {
        int i9;
        switch (this.f2113a) {
            case 2:
                ((AtomicLong) ((android.support.v4.media.session.y) this.f2115c).f9333d).set(this.f2114b);
                return;
            default:
                if (exc instanceof C4.e) {
                    i9 = ((C4.e) exc).f1568a.f14660a;
                } else {
                    i9 = 13;
                }
                Iterator it = ((v4.h) ((v4.q) this.f2115c).f23878c).f23849c.f8442d.iterator();
                while (it.hasNext()) {
                    ((y4.p) it.next()).b(this.f2114b, i9, null);
                }
                return;
        }
    }

    @Override // Q3.i
    public long z(long j) {
        return ((C1901f) this.f2115c).f22303a;
    }

    public C0104h(K4.a aVar) {
        this.f2113a = 3;
        F4.y.h(aVar);
        this.f2115c = aVar;
    }

    public C0104h(x8.C source) {
        this.f2113a = 5;
        kotlin.jvm.internal.h.e(source, "source");
        this.f2115c = source;
        this.f2114b = 262144L;
    }

    public C0104h(C1902g c1902g, long j) {
        this.f2113a = 6;
        this.f2115c = c1902g;
        AbstractC1566a.h(c1902g.f22312d >= j);
        this.f2114b = j;
    }

    public C0104h(long j, InterfaceC1907l interfaceC1907l) {
        this.f2113a = 7;
        this.f2114b = j;
        this.f2115c = interfaceC1907l;
    }

    public C0104h(int i9) {
        this.f2113a = i9;
        switch (i9) {
            case 4:
                return;
            default:
                this.f2114b = 0L;
                return;
        }
    }
}
