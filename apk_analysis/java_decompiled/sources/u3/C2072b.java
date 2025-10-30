package u3;

import A4.r;
import D.n;
import q3.C1902g;
import q3.C1904i;
import q3.InterfaceC1905j;
import q3.InterfaceC1906k;
import q3.InterfaceC1907l;

/* renamed from: u3.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2072b implements InterfaceC1905j {

    /* renamed from: a, reason: collision with root package name */
    public final r f23611a = new r(4);

    /* renamed from: b, reason: collision with root package name */
    public final r f23612b = new r(9);

    /* renamed from: c, reason: collision with root package name */
    public final r f23613c = new r(11);

    /* renamed from: d, reason: collision with root package name */
    public final r f23614d = new r(5, false);

    /* renamed from: e, reason: collision with root package name */
    public final C2073c f23615e;

    /* renamed from: f, reason: collision with root package name */
    public InterfaceC1907l f23616f;

    /* renamed from: g, reason: collision with root package name */
    public int f23617g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f23618h;

    /* renamed from: i, reason: collision with root package name */
    public long f23619i;
    public int j;

    /* renamed from: k, reason: collision with root package name */
    public int f23620k;

    /* renamed from: l, reason: collision with root package name */
    public int f23621l;

    /* renamed from: m, reason: collision with root package name */
    public long f23622m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f23623n;

    /* renamed from: o, reason: collision with root package name */
    public C2071a f23624o;

    /* renamed from: p, reason: collision with root package name */
    public C2074d f23625p;

    /* JADX WARN: Type inference failed for: r0v4, types: [D.n, u3.c] */
    public C2072b() {
        ?? nVar = new n(new C1904i());
        nVar.f23626b = -9223372036854775807L;
        nVar.f23627c = new long[0];
        nVar.f23628d = new long[0];
        this.f23615e = nVar;
        this.f23617g = 1;
    }

    @Override // q3.InterfaceC1905j
    public final void b(long j, long j4) {
        if (j == 0) {
            this.f23617g = 1;
            this.f23618h = false;
        } else {
            this.f23617g = 3;
        }
        this.j = 0;
    }

    public final r c(C1902g c1902g) {
        int i9 = this.f23621l;
        r rVar = this.f23614d;
        byte[] bArr = (byte[]) rVar.f384c;
        if (i9 > bArr.length) {
            rVar.F(0, new byte[Math.max(bArr.length * 2, i9)]);
        } else {
            rVar.H(0);
        }
        rVar.G(this.f23621l);
        c1902g.e((byte[]) rVar.f384c, 0, this.f23621l, false);
        return rVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:122:0x026e  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0384  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0388  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0392 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0007 A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r2v12, types: [u3.a, D.n] */
    @Override // q3.InterfaceC1905j
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int f(q3.InterfaceC1906k r29, c7.C0790j r30) {
        /*
            Method dump skipped, instructions count: 1094
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: u3.C2072b.f(q3.k, c7.j):int");
    }

    @Override // q3.InterfaceC1905j
    public final void i(InterfaceC1907l interfaceC1907l) {
        this.f23616f = interfaceC1907l;
    }

    @Override // q3.InterfaceC1905j
    public final boolean j(InterfaceC1906k interfaceC1906k) {
        r rVar = this.f23611a;
        C1902g c1902g = (C1902g) interfaceC1906k;
        c1902g.t((byte[]) rVar.f384c, 0, 3, false);
        rVar.H(0);
        if (rVar.z() == 4607062) {
            c1902g.t((byte[]) rVar.f384c, 0, 2, false);
            rVar.H(0);
            if ((rVar.C() & 250) == 0) {
                c1902g.t((byte[]) rVar.f384c, 0, 4, false);
                rVar.H(0);
                int i9 = rVar.i();
                c1902g.f22314f = 0;
                c1902g.c(i9, false);
                c1902g.t((byte[]) rVar.f384c, 0, 4, false);
                rVar.H(0);
                if (rVar.i() == 0) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // q3.InterfaceC1905j
    public final void a() {
    }
}
