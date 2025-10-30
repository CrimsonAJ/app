package N3;

import j3.x0;

/* loaded from: classes.dex */
public final class J implements InterfaceC0272x, InterfaceC0271w {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC0272x f4927a;

    /* renamed from: b, reason: collision with root package name */
    public final long f4928b;

    /* renamed from: c, reason: collision with root package name */
    public InterfaceC0271w f4929c;

    public J(InterfaceC0272x interfaceC0272x, long j) {
        this.f4927a = interfaceC0272x;
        this.f4928b = j;
    }

    @Override // N3.f0
    public final void B(long j) {
        this.f4927a.B(j - this.f4928b);
    }

    @Override // N3.InterfaceC0271w
    public final void C(InterfaceC0272x interfaceC0272x) {
        InterfaceC0271w interfaceC0271w = this.f4929c;
        interfaceC0271w.getClass();
        interfaceC0271w.C(this);
    }

    @Override // N3.f0
    public final boolean a() {
        return this.f4927a.a();
    }

    @Override // N3.InterfaceC0272x
    public final long c(long j, x0 x0Var) {
        long j4 = this.f4928b;
        return this.f4927a.c(j - j4, x0Var) + j4;
    }

    @Override // N3.f0
    public final long h() {
        long h7 = this.f4927a.h();
        if (h7 == Long.MIN_VALUE) {
            return Long.MIN_VALUE;
        }
        return h7 + this.f4928b;
    }

    @Override // N3.InterfaceC0272x
    public final long k() {
        long k5 = this.f4927a.k();
        if (k5 == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        return k5 + this.f4928b;
    }

    @Override // N3.InterfaceC0272x
    public final n0 l() {
        return this.f4927a.l();
    }

    @Override // N3.InterfaceC0272x
    public final void o(InterfaceC0271w interfaceC0271w, long j) {
        this.f4929c = interfaceC0271w;
        this.f4927a.o(this, j - this.f4928b);
    }

    @Override // N3.f0
    public final long p() {
        long p9 = this.f4927a.p();
        if (p9 == Long.MIN_VALUE) {
            return Long.MIN_VALUE;
        }
        return p9 + this.f4928b;
    }

    @Override // N3.InterfaceC0272x
    public final void q() {
        this.f4927a.q();
    }

    @Override // N3.e0
    public final void v(f0 f0Var) {
        InterfaceC0271w interfaceC0271w = this.f4929c;
        interfaceC0271w.getClass();
        interfaceC0271w.v(this);
    }

    @Override // N3.InterfaceC0272x
    public final long w(long j) {
        long j4 = this.f4928b;
        return this.f4927a.w(j - j4) + j4;
    }

    @Override // N3.InterfaceC0272x
    public final void x(long j) {
        this.f4927a.x(j - this.f4928b);
    }

    @Override // N3.InterfaceC0272x
    public final long y(i4.q[] qVarArr, boolean[] zArr, d0[] d0VarArr, boolean[] zArr2, long j) {
        d0[] d0VarArr2 = new d0[d0VarArr.length];
        int i9 = 0;
        while (true) {
            d0 d0Var = null;
            if (i9 >= d0VarArr.length) {
                break;
            }
            K k5 = (K) d0VarArr[i9];
            if (k5 != null) {
                d0Var = k5.f4930a;
            }
            d0VarArr2[i9] = d0Var;
            i9++;
        }
        long j4 = this.f4928b;
        long y9 = this.f4927a.y(qVarArr, zArr, d0VarArr2, zArr2, j - j4);
        for (int i10 = 0; i10 < d0VarArr.length; i10++) {
            d0 d0Var2 = d0VarArr2[i10];
            if (d0Var2 == null) {
                d0VarArr[i10] = null;
            } else {
                d0 d0Var3 = d0VarArr[i10];
                if (d0Var3 == null || ((K) d0Var3).f4930a != d0Var2) {
                    d0VarArr[i10] = new K(d0Var2, j4);
                }
            }
        }
        return y9 + j4;
    }

    @Override // N3.f0
    public final boolean z(long j) {
        return this.f4927a.z(j - this.f4928b);
    }
}
