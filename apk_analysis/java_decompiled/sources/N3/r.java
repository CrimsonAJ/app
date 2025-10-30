package N3;

import j3.x0;
import k4.C1517q;

/* loaded from: classes.dex */
public final class r implements InterfaceC0272x, InterfaceC0271w {

    /* renamed from: a, reason: collision with root package name */
    public final A f5181a;

    /* renamed from: b, reason: collision with root package name */
    public final long f5182b;

    /* renamed from: c, reason: collision with root package name */
    public final C1517q f5183c;

    /* renamed from: d, reason: collision with root package name */
    public AbstractC0250a f5184d;

    /* renamed from: e, reason: collision with root package name */
    public InterfaceC0272x f5185e;

    /* renamed from: f, reason: collision with root package name */
    public InterfaceC0271w f5186f;

    /* renamed from: g, reason: collision with root package name */
    public long f5187g = -9223372036854775807L;

    public r(A a5, C1517q c1517q, long j) {
        this.f5181a = a5;
        this.f5183c = c1517q;
        this.f5182b = j;
    }

    @Override // N3.f0
    public final void B(long j) {
        InterfaceC0272x interfaceC0272x = this.f5185e;
        int i9 = l4.y.f20553a;
        interfaceC0272x.B(j);
    }

    @Override // N3.InterfaceC0271w
    public final void C(InterfaceC0272x interfaceC0272x) {
        InterfaceC0271w interfaceC0271w = this.f5186f;
        int i9 = l4.y.f20553a;
        interfaceC0271w.C(this);
    }

    @Override // N3.f0
    public final boolean a() {
        InterfaceC0272x interfaceC0272x = this.f5185e;
        if (interfaceC0272x != null && interfaceC0272x.a()) {
            return true;
        }
        return false;
    }

    public final void b(A a5) {
        long j = this.f5187g;
        if (j == -9223372036854775807L) {
            j = this.f5182b;
        }
        AbstractC0250a abstractC0250a = this.f5184d;
        abstractC0250a.getClass();
        InterfaceC0272x b9 = abstractC0250a.b(a5, this.f5183c, j);
        this.f5185e = b9;
        if (this.f5186f != null) {
            b9.o(this, j);
        }
    }

    @Override // N3.InterfaceC0272x
    public final long c(long j, x0 x0Var) {
        InterfaceC0272x interfaceC0272x = this.f5185e;
        int i9 = l4.y.f20553a;
        return interfaceC0272x.c(j, x0Var);
    }

    @Override // N3.f0
    public final long h() {
        InterfaceC0272x interfaceC0272x = this.f5185e;
        int i9 = l4.y.f20553a;
        return interfaceC0272x.h();
    }

    @Override // N3.InterfaceC0272x
    public final long k() {
        InterfaceC0272x interfaceC0272x = this.f5185e;
        int i9 = l4.y.f20553a;
        return interfaceC0272x.k();
    }

    @Override // N3.InterfaceC0272x
    public final n0 l() {
        InterfaceC0272x interfaceC0272x = this.f5185e;
        int i9 = l4.y.f20553a;
        return interfaceC0272x.l();
    }

    @Override // N3.InterfaceC0272x
    public final void o(InterfaceC0271w interfaceC0271w, long j) {
        this.f5186f = interfaceC0271w;
        InterfaceC0272x interfaceC0272x = this.f5185e;
        if (interfaceC0272x != null) {
            long j4 = this.f5187g;
            if (j4 == -9223372036854775807L) {
                j4 = this.f5182b;
            }
            interfaceC0272x.o(this, j4);
        }
    }

    @Override // N3.f0
    public final long p() {
        InterfaceC0272x interfaceC0272x = this.f5185e;
        int i9 = l4.y.f20553a;
        return interfaceC0272x.p();
    }

    @Override // N3.InterfaceC0272x
    public final void q() {
        InterfaceC0272x interfaceC0272x = this.f5185e;
        if (interfaceC0272x != null) {
            interfaceC0272x.q();
            return;
        }
        AbstractC0250a abstractC0250a = this.f5184d;
        if (abstractC0250a != null) {
            abstractC0250a.l();
        }
    }

    @Override // N3.e0
    public final void v(f0 f0Var) {
        InterfaceC0271w interfaceC0271w = this.f5186f;
        int i9 = l4.y.f20553a;
        interfaceC0271w.v(this);
    }

    @Override // N3.InterfaceC0272x
    public final long w(long j) {
        InterfaceC0272x interfaceC0272x = this.f5185e;
        int i9 = l4.y.f20553a;
        return interfaceC0272x.w(j);
    }

    @Override // N3.InterfaceC0272x
    public final void x(long j) {
        InterfaceC0272x interfaceC0272x = this.f5185e;
        int i9 = l4.y.f20553a;
        interfaceC0272x.x(j);
    }

    @Override // N3.InterfaceC0272x
    public final long y(i4.q[] qVarArr, boolean[] zArr, d0[] d0VarArr, boolean[] zArr2, long j) {
        long j4;
        long j9 = this.f5187g;
        if (j9 != -9223372036854775807L && j == this.f5182b) {
            this.f5187g = -9223372036854775807L;
            j4 = j9;
        } else {
            j4 = j;
        }
        InterfaceC0272x interfaceC0272x = this.f5185e;
        int i9 = l4.y.f20553a;
        return interfaceC0272x.y(qVarArr, zArr, d0VarArr, zArr2, j4);
    }

    @Override // N3.f0
    public final boolean z(long j) {
        InterfaceC0272x interfaceC0272x = this.f5185e;
        if (interfaceC0272x != null && interfaceC0272x.z(j)) {
            return true;
        }
        return false;
    }
}
