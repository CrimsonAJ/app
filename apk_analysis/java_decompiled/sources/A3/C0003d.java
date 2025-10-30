package A3;

import c7.C0790j;
import l4.AbstractC1566a;
import q3.C1902g;
import q3.C1908m;
import q3.InterfaceC1905j;
import q3.InterfaceC1906k;
import q3.InterfaceC1907l;

/* renamed from: A3.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0003d implements InterfaceC1905j {

    /* renamed from: c, reason: collision with root package name */
    public final A4.r f99c;

    /* renamed from: d, reason: collision with root package name */
    public final Z3.f f100d;

    /* renamed from: e, reason: collision with root package name */
    public InterfaceC1907l f101e;

    /* renamed from: f, reason: collision with root package name */
    public long f102f;

    /* renamed from: h, reason: collision with root package name */
    public boolean f104h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f105i;

    /* renamed from: a, reason: collision with root package name */
    public final C0004e f97a = new C0004e(null, true);

    /* renamed from: b, reason: collision with root package name */
    public final A4.r f98b = new A4.r(2048);

    /* renamed from: g, reason: collision with root package name */
    public long f103g = -1;

    public C0003d() {
        A4.r rVar = new A4.r(10);
        this.f99c = rVar;
        byte[] bArr = (byte[]) rVar.f384c;
        this.f100d = new Z3.f(bArr.length, bArr);
    }

    @Override // q3.InterfaceC1905j
    public final void b(long j, long j4) {
        this.f104h = false;
        this.f97a.a();
        this.f102f = j4;
    }

    @Override // q3.InterfaceC1905j
    public final int f(InterfaceC1906k interfaceC1906k, C0790j c0790j) {
        boolean z9;
        AbstractC1566a.n(this.f101e);
        long j = ((C1902g) interfaceC1906k).f22311c;
        A4.r rVar = this.f98b;
        int D8 = ((C1902g) interfaceC1906k).D((byte[]) rVar.f384c, 0, 2048);
        if (D8 == -1) {
            z9 = true;
        } else {
            z9 = false;
        }
        if (!this.f105i) {
            this.f101e.r(new C1908m(-9223372036854775807L));
            this.f105i = true;
        }
        if (z9) {
            return -1;
        }
        rVar.H(0);
        rVar.G(D8);
        boolean z10 = this.f104h;
        C0004e c0004e = this.f97a;
        if (!z10) {
            c0004e.e(this.f102f, 4);
            this.f104h = true;
        }
        c0004e.c(rVar);
        return 0;
    }

    @Override // q3.InterfaceC1905j
    public final void i(InterfaceC1907l interfaceC1907l) {
        this.f101e = interfaceC1907l;
        this.f97a.f(interfaceC1907l, new I(0, 1));
        interfaceC1907l.i();
    }

    @Override // q3.InterfaceC1905j
    public final boolean j(InterfaceC1906k interfaceC1906k) {
        C1902g c1902g = (C1902g) interfaceC1906k;
        int i9 = 0;
        while (true) {
            A4.r rVar = this.f99c;
            c1902g.t((byte[]) rVar.f384c, 0, 10, false);
            rVar.H(0);
            if (rVar.z() != 4801587) {
                break;
            }
            rVar.I(3);
            int w7 = rVar.w();
            i9 += w7 + 10;
            c1902g.c(w7, false);
        }
        c1902g.f22314f = 0;
        c1902g.c(i9, false);
        if (this.f103g == -1) {
            this.f103g = i9;
        }
        int i10 = i9;
        int i11 = 0;
        int i12 = 0;
        do {
            A4.r rVar2 = this.f99c;
            c1902g.t((byte[]) rVar2.f384c, 0, 2, false);
            rVar2.H(0);
            if ((rVar2.C() & 65526) == 65520) {
                i11++;
                if (i11 >= 4 && i12 > 188) {
                    return true;
                }
                c1902g.t((byte[]) rVar2.f384c, 0, 4, false);
                Z3.f fVar = this.f100d;
                fVar.o(14);
                int i13 = fVar.i(13);
                if (i13 <= 6) {
                    i10++;
                    c1902g.f22314f = 0;
                    c1902g.c(i10, false);
                } else {
                    c1902g.c(i13 - 6, false);
                    i12 += i13;
                }
            } else {
                i10++;
                c1902g.f22314f = 0;
                c1902g.c(i10, false);
            }
            i11 = 0;
            i12 = 0;
        } while (i10 - i9 < 8192);
        return false;
    }

    @Override // q3.InterfaceC1905j
    public final void a() {
    }
}
