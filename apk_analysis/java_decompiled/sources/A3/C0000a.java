package A3;

import c7.C0790j;
import l3.AbstractC1552a;
import q3.C1902g;
import q3.C1908m;
import q3.InterfaceC1905j;
import q3.InterfaceC1906k;
import q3.InterfaceC1907l;

/* renamed from: A3.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0000a implements InterfaceC1905j {

    /* renamed from: a, reason: collision with root package name */
    public final C0001b f79a = new C0001b(null, 0);

    /* renamed from: b, reason: collision with root package name */
    public final A4.r f80b = new A4.r(2786);

    /* renamed from: c, reason: collision with root package name */
    public boolean f81c;

    @Override // q3.InterfaceC1905j
    public final void b(long j, long j4) {
        this.f81c = false;
        this.f79a.a();
    }

    @Override // q3.InterfaceC1905j
    public final int f(InterfaceC1906k interfaceC1906k, C0790j c0790j) {
        A4.r rVar = this.f80b;
        int D8 = ((C1902g) interfaceC1906k).D((byte[]) rVar.f384c, 0, 2786);
        if (D8 == -1) {
            return -1;
        }
        rVar.H(0);
        rVar.G(D8);
        boolean z9 = this.f81c;
        C0001b c0001b = this.f79a;
        if (!z9) {
            c0001b.e(0L, 4);
            this.f81c = true;
        }
        c0001b.c(rVar);
        return 0;
    }

    @Override // q3.InterfaceC1905j
    public final void i(InterfaceC1907l interfaceC1907l) {
        this.f79a.f(interfaceC1907l, new I(0, 1));
        interfaceC1907l.i();
        interfaceC1907l.r(new C1908m(-9223372036854775807L));
    }

    @Override // q3.InterfaceC1905j
    public final boolean j(InterfaceC1906k interfaceC1906k) {
        C1902g c1902g;
        int d9;
        A4.r rVar = new A4.r(10);
        int i9 = 0;
        while (true) {
            c1902g = (C1902g) interfaceC1906k;
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
        int i10 = 0;
        int i11 = i9;
        while (true) {
            c1902g.t((byte[]) rVar.f384c, 0, 6, false);
            rVar.H(0);
            if (rVar.C() != 2935) {
                c1902g.f22314f = 0;
                i11++;
                if (i11 - i9 >= 8192) {
                    break;
                }
                c1902g.c(i11, false);
                i10 = 0;
            } else {
                i10++;
                if (i10 >= 4) {
                    return true;
                }
                byte[] bArr = (byte[]) rVar.f384c;
                if (bArr.length < 6) {
                    d9 = -1;
                } else if (((bArr[5] & 248) >> 3) > 10) {
                    d9 = ((((bArr[2] & 7) << 8) | (bArr[3] & 255)) + 1) * 2;
                } else {
                    byte b9 = bArr[4];
                    d9 = AbstractC1552a.d((b9 & 192) >> 6, b9 & 63);
                }
                if (d9 == -1) {
                    break;
                }
                c1902g.c(d9 - 6, false);
            }
        }
        return false;
    }

    @Override // q3.InterfaceC1905j
    public final void a() {
    }
}
