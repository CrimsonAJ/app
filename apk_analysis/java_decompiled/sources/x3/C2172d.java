package x3;

import A4.r;
import i.G;
import j3.j0;
import java.io.EOFException;
import l3.AbstractC1552a;
import l3.I;
import q3.C1902g;
import q3.C1904i;
import q3.C1910o;
import q3.InterfaceC1905j;
import q3.InterfaceC1906k;
import q3.InterfaceC1907l;
import q3.u;

/* renamed from: x3.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2172d implements InterfaceC1905j {

    /* renamed from: a, reason: collision with root package name */
    public final long f24570a;

    /* renamed from: b, reason: collision with root package name */
    public final r f24571b;

    /* renamed from: c, reason: collision with root package name */
    public final I f24572c;

    /* renamed from: d, reason: collision with root package name */
    public final C1910o f24573d;

    /* renamed from: e, reason: collision with root package name */
    public final G f24574e;

    /* renamed from: f, reason: collision with root package name */
    public final C1904i f24575f;

    /* renamed from: g, reason: collision with root package name */
    public InterfaceC1907l f24576g;

    /* renamed from: h, reason: collision with root package name */
    public u f24577h;

    /* renamed from: i, reason: collision with root package name */
    public u f24578i;
    public int j;

    /* renamed from: k, reason: collision with root package name */
    public D3.c f24579k;

    /* renamed from: l, reason: collision with root package name */
    public long f24580l;

    /* renamed from: m, reason: collision with root package name */
    public long f24581m;

    /* renamed from: n, reason: collision with root package name */
    public long f24582n;

    /* renamed from: o, reason: collision with root package name */
    public int f24583o;

    /* renamed from: p, reason: collision with root package name */
    public InterfaceC2174f f24584p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f24585q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f24586r;

    /* renamed from: s, reason: collision with root package name */
    public long f24587s;

    public C2172d() {
        this(-9223372036854775807L);
    }

    @Override // q3.InterfaceC1905j
    public final void b(long j, long j4) {
        this.j = 0;
        this.f24580l = -9223372036854775807L;
        this.f24581m = 0L;
        this.f24583o = 0;
        this.f24587s = j4;
        InterfaceC2174f interfaceC2174f = this.f24584p;
        if ((interfaceC2174f instanceof AbstractC2170b) && !((AbstractC2170b) interfaceC2174f).a(j4)) {
            this.f24586r = true;
            this.f24578i = this.f24575f;
        }
    }

    public final C2169a c(C1902g c1902g, boolean z9) {
        r rVar = this.f24571b;
        c1902g.t((byte[]) rVar.f384c, 0, 4, false);
        rVar.H(0);
        int i9 = rVar.i();
        I i10 = this.f24572c;
        i10.b(i9);
        return new C2169a(c1902g.f22311c, c1902g.f22312d, i10.f20311e, i10.f20308b, z9);
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0018, code lost:
    
        if (r9.w() > (r2 - 4)) goto L12;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean d(q3.C1902g r9) {
        /*
            r8 = this;
            x3.f r0 = r8.f24584p
            r1 = 1
            if (r0 == 0) goto L1b
            long r2 = r0.d()
            r4 = -1
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 == 0) goto L1b
            long r4 = r9.w()
            r6 = 4
            long r2 = r2 - r6
            int r0 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r0 <= 0) goto L1b
            goto L29
        L1b:
            A4.r r0 = r8.f24571b     // Catch: java.io.EOFException -> L29
            java.lang.Object r0 = r0.f384c     // Catch: java.io.EOFException -> L29
            byte[] r0 = (byte[]) r0     // Catch: java.io.EOFException -> L29
            r2 = 0
            r3 = 4
            boolean r9 = r9.t(r0, r2, r3, r1)     // Catch: java.io.EOFException -> L29
            r9 = r9 ^ r1
            return r9
        L29:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: x3.C2172d.d(q3.g):boolean");
    }

    public final boolean e(C1902g c1902g, boolean z9) {
        int i9;
        int i10;
        int i11;
        int f9;
        if (z9) {
            i9 = 32768;
        } else {
            i9 = 131072;
        }
        c1902g.f22314f = 0;
        if (c1902g.f22312d == 0) {
            D3.c r5 = this.f24574e.r(c1902g, null);
            this.f24579k = r5;
            if (r5 != null) {
                this.f24573d.b(r5);
            }
            i10 = (int) c1902g.w();
            if (!z9) {
                c1902g.n(i10);
            }
            i11 = 0;
        } else {
            i10 = 0;
            i11 = 0;
        }
        int i12 = i11;
        int i13 = i12;
        while (true) {
            if (d(c1902g)) {
                if (i12 <= 0) {
                    throw new EOFException();
                }
            } else {
                r rVar = this.f24571b;
                rVar.H(0);
                int i14 = rVar.i();
                if ((i11 != 0 && ((-128000) & i14) != (i11 & (-128000))) || (f9 = AbstractC1552a.f(i14)) == -1) {
                    int i15 = i13 + 1;
                    if (i13 == i9) {
                        if (z9) {
                            return false;
                        }
                        throw j0.a("Searched too many bytes.", null);
                    }
                    if (z9) {
                        c1902g.f22314f = 0;
                        c1902g.c(i10 + i15, false);
                    } else {
                        c1902g.n(1);
                    }
                    i12 = 0;
                    i13 = i15;
                    i11 = 0;
                } else {
                    i12++;
                    if (i12 == 1) {
                        this.f24572c.b(i14);
                        i11 = i14;
                    } else if (i12 == 4) {
                        break;
                    }
                    c1902g.c(f9 - 4, false);
                }
            }
        }
        if (z9) {
            c1902g.n(i10 + i13);
        } else {
            c1902g.f22314f = 0;
        }
        this.j = i11;
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0071, code lost:
    
        if (r2 != 1231971951) goto L24;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0187  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x0201  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x0235  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x008e A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x024e  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x02e4  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x043d  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x02ef  */
    /* JADX WARN: Type inference failed for: r0v32, types: [q3.m] */
    @Override // q3.InterfaceC1905j
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int f(q3.InterfaceC1906k r42, c7.C0790j r43) {
        /*
            Method dump skipped, instructions count: 1124
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: x3.C2172d.f(q3.k, c7.j):int");
    }

    @Override // q3.InterfaceC1905j
    public final void i(InterfaceC1907l interfaceC1907l) {
        this.f24576g = interfaceC1907l;
        u u9 = interfaceC1907l.u(0, 1);
        this.f24577h = u9;
        this.f24578i = u9;
        this.f24576g.i();
    }

    @Override // q3.InterfaceC1905j
    public final boolean j(InterfaceC1906k interfaceC1906k) {
        return e((C1902g) interfaceC1906k, true);
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [l3.I, java.lang.Object] */
    public C2172d(long j) {
        this.f24570a = j;
        this.f24571b = new r(10);
        this.f24572c = new Object();
        this.f24573d = new C1910o();
        this.f24580l = -9223372036854775807L;
        this.f24574e = new G(12);
        C1904i c1904i = new C1904i();
        this.f24575f = c1904i;
        this.f24578i = c1904i;
    }

    @Override // q3.InterfaceC1905j
    public final void a() {
    }
}
