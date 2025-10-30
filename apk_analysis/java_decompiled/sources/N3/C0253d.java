package N3;

import j3.x0;
import l4.AbstractC1566a;

/* renamed from: N3.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0253d implements InterfaceC0272x, InterfaceC0271w {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC0272x f5079a;

    /* renamed from: b, reason: collision with root package name */
    public InterfaceC0271w f5080b;

    /* renamed from: c, reason: collision with root package name */
    public C0252c[] f5081c = new C0252c[0];

    /* renamed from: d, reason: collision with root package name */
    public long f5082d;

    /* renamed from: e, reason: collision with root package name */
    public long f5083e;

    /* renamed from: f, reason: collision with root package name */
    public long f5084f;

    /* renamed from: g, reason: collision with root package name */
    public C0255f f5085g;

    public C0253d(InterfaceC0272x interfaceC0272x, boolean z9, long j, long j4) {
        long j9;
        this.f5079a = interfaceC0272x;
        if (z9) {
            j9 = j;
        } else {
            j9 = -9223372036854775807L;
        }
        this.f5082d = j9;
        this.f5083e = j;
        this.f5084f = j4;
    }

    @Override // N3.f0
    public final void B(long j) {
        this.f5079a.B(j);
    }

    @Override // N3.InterfaceC0271w
    public final void C(InterfaceC0272x interfaceC0272x) {
        if (this.f5085g != null) {
            return;
        }
        InterfaceC0271w interfaceC0271w = this.f5080b;
        interfaceC0271w.getClass();
        interfaceC0271w.C(this);
    }

    @Override // N3.f0
    public final boolean a() {
        return this.f5079a.a();
    }

    public final boolean b() {
        if (this.f5082d != -9223372036854775807L) {
            return true;
        }
        return false;
    }

    @Override // N3.InterfaceC0272x
    public final long c(long j, x0 x0Var) {
        long j4;
        long j9 = this.f5083e;
        if (j == j9) {
            return j9;
        }
        long j10 = l4.y.j(x0Var.f19761a, 0L, j - j9);
        long j11 = this.f5084f;
        if (j11 == Long.MIN_VALUE) {
            j4 = Long.MAX_VALUE;
        } else {
            j4 = j11 - j;
        }
        long j12 = l4.y.j(x0Var.f19762b, 0L, j4);
        if (j10 != x0Var.f19761a || j12 != x0Var.f19762b) {
            x0Var = new x0(j10, j12);
        }
        return this.f5079a.c(j, x0Var);
    }

    @Override // N3.f0
    public final long h() {
        long h7 = this.f5079a.h();
        if (h7 != Long.MIN_VALUE) {
            long j = this.f5084f;
            if (j == Long.MIN_VALUE || h7 < j) {
                return h7;
            }
        }
        return Long.MIN_VALUE;
    }

    @Override // N3.InterfaceC0272x
    public final long k() {
        boolean z9;
        if (b()) {
            long j = this.f5082d;
            this.f5082d = -9223372036854775807L;
            long k5 = k();
            if (k5 != -9223372036854775807L) {
                return k5;
            }
            return j;
        }
        long k9 = this.f5079a.k();
        if (k9 == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        boolean z10 = false;
        if (k9 >= this.f5083e) {
            z9 = true;
        } else {
            z9 = false;
        }
        AbstractC1566a.m(z9);
        long j4 = this.f5084f;
        if (j4 == Long.MIN_VALUE || k9 <= j4) {
            z10 = true;
        }
        AbstractC1566a.m(z10);
        return k9;
    }

    @Override // N3.InterfaceC0272x
    public final n0 l() {
        return this.f5079a.l();
    }

    @Override // N3.InterfaceC0272x
    public final void o(InterfaceC0271w interfaceC0271w, long j) {
        this.f5080b = interfaceC0271w;
        this.f5079a.o(this, j);
    }

    @Override // N3.f0
    public final long p() {
        long p9 = this.f5079a.p();
        if (p9 != Long.MIN_VALUE) {
            long j = this.f5084f;
            if (j == Long.MIN_VALUE || p9 < j) {
                return p9;
            }
        }
        return Long.MIN_VALUE;
    }

    @Override // N3.InterfaceC0272x
    public final void q() {
        C0255f c0255f = this.f5085g;
        if (c0255f == null) {
            this.f5079a.q();
            return;
        }
        throw c0255f;
    }

    @Override // N3.e0
    public final void v(f0 f0Var) {
        InterfaceC0271w interfaceC0271w = this.f5080b;
        interfaceC0271w.getClass();
        interfaceC0271w.v(this);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0031, code lost:
    
        if (r0 > r6) goto L17;
     */
    @Override // N3.InterfaceC0272x
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long w(long r6) {
        /*
            r5 = this;
            r0 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r5.f5082d = r0
            N3.c[] r0 = r5.f5081c
            int r1 = r0.length
            r2 = 0
            r3 = r2
        Lc:
            if (r3 >= r1) goto L17
            r4 = r0[r3]
            if (r4 == 0) goto L14
            r4.f5045b = r2
        L14:
            int r3 = r3 + 1
            goto Lc
        L17:
            N3.x r0 = r5.f5079a
            long r0 = r0.w(r6)
            int r6 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r6 == 0) goto L33
            long r6 = r5.f5083e
            int r6 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r6 < 0) goto L34
            long r6 = r5.f5084f
            r3 = -9223372036854775808
            int r3 = (r6 > r3 ? 1 : (r6 == r3 ? 0 : -1))
            if (r3 == 0) goto L33
            int r6 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r6 > 0) goto L34
        L33:
            r2 = 1
        L34:
            l4.AbstractC1566a.m(r2)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: N3.C0253d.w(long):long");
    }

    @Override // N3.InterfaceC0272x
    public final void x(long j) {
        this.f5079a.x(j);
    }

    /* JADX WARN: Code restructure failed: missing block: B:76:0x011d, code lost:
    
        if (r12 > r1) goto L94;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:24:0x005c. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:58:0x00e2. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:71:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0129  */
    @Override // N3.InterfaceC0272x
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long y(i4.q[] r17, boolean[] r18, N3.d0[] r19, boolean[] r20, long r21) {
        /*
            Method dump skipped, instructions count: 404
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: N3.C0253d.y(i4.q[], boolean[], N3.d0[], boolean[], long):long");
    }

    @Override // N3.f0
    public final boolean z(long j) {
        return this.f5079a.z(j);
    }
}
