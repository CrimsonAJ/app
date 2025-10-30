package x;

import com.google.android.gms.internal.measurement.AbstractC0953k1;
import w.C2123c;
import w.C2125e;

/* renamed from: x.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2146a extends AbstractC2154i {

    /* renamed from: f0, reason: collision with root package name */
    public int f24319f0;

    /* renamed from: g0, reason: collision with root package name */
    public boolean f24320g0;

    /* renamed from: h0, reason: collision with root package name */
    public int f24321h0;

    @Override // x.C2149d
    public final void a(C2125e c2125e) {
        boolean z9;
        boolean z10;
        boolean z11;
        int i9;
        int i10;
        int i11;
        int i12;
        C2148c[] c2148cArr = this.f24350F;
        C2148c c2148c = this.f24394x;
        c2148cArr[0] = c2148c;
        C2148c c2148c2 = this.f24395y;
        int i13 = 2;
        c2148cArr[2] = c2148c2;
        C2148c c2148c3 = this.f24396z;
        c2148cArr[1] = c2148c3;
        C2148c c2148c4 = this.f24345A;
        c2148cArr[3] = c2148c4;
        for (C2148c c2148c5 : c2148cArr) {
            c2148c5.f24344g = c2125e.j(c2148c5);
        }
        int i14 = this.f24319f0;
        if (i14 >= 0 && i14 < 4) {
            C2148c c2148c6 = c2148cArr[i14];
            for (int i15 = 0; i15 < this.f24469e0; i15++) {
                C2149d c2149d = this.f24468d0[i15];
                if ((this.f24320g0 || c2149d.b()) && ((((i12 = this.f24319f0) == 0 || i12 == 1) && c2149d.f24374c0[0] == 3 && c2149d.f24394x.f24341d != null && c2149d.f24396z.f24341d != null) || ((i12 == 2 || i12 == 3) && c2149d.f24374c0[1] == 3 && c2149d.f24395y.f24341d != null && c2149d.f24345A.f24341d != null))) {
                    z9 = true;
                    break;
                }
            }
            z9 = false;
            if (!c2148c.e() && !c2148c3.e()) {
                z10 = false;
            } else {
                z10 = true;
            }
            if (!c2148c2.e() && !c2148c4.e()) {
                z11 = false;
            } else {
                z11 = true;
            }
            if (!z9 && (((i11 = this.f24319f0) == 0 && z10) || ((i11 == 2 && z11) || ((i11 == 1 && z10) || (i11 == 3 && z11))))) {
                i9 = 5;
            } else {
                i9 = 4;
            }
            int i16 = 0;
            while (i16 < this.f24469e0) {
                C2149d c2149d2 = this.f24468d0[i16];
                if (this.f24320g0 || c2149d2.b()) {
                    w.i j = c2125e.j(c2149d2.f24350F[this.f24319f0]);
                    int i17 = this.f24319f0;
                    C2148c c2148c7 = c2149d2.f24350F[i17];
                    c2148c7.f24344g = j;
                    C2148c c2148c8 = c2148c7.f24341d;
                    if (c2148c8 != null && c2148c8.f24339b == this) {
                        i10 = c2148c7.f24342e;
                    } else {
                        i10 = 0;
                    }
                    if (i17 != 0 && i17 != i13) {
                        w.i iVar = c2148c6.f24344g;
                        int i18 = this.f24321h0 + i10;
                        C2123c k5 = c2125e.k();
                        w.i l9 = c2125e.l();
                        l9.f23954d = 0;
                        k5.b(iVar, j, l9, i18);
                        c2125e.c(k5);
                    } else {
                        w.i iVar2 = c2148c6.f24344g;
                        int i19 = this.f24321h0 - i10;
                        C2123c k9 = c2125e.k();
                        w.i l10 = c2125e.l();
                        l10.f23954d = 0;
                        k9.c(iVar2, j, l10, i19);
                        c2125e.c(k9);
                    }
                    c2125e.e(c2148c6.f24344g, j, this.f24321h0 + i10, i9);
                }
                i16++;
                i13 = 2;
            }
            int i20 = this.f24319f0;
            if (i20 == 0) {
                c2125e.e(c2148c3.f24344g, c2148c.f24344g, 0, 8);
                c2125e.e(c2148c.f24344g, this.f24353I.f24396z.f24344g, 0, 4);
                c2125e.e(c2148c.f24344g, this.f24353I.f24394x.f24344g, 0, 0);
                return;
            }
            if (i20 == 1) {
                c2125e.e(c2148c.f24344g, c2148c3.f24344g, 0, 8);
                c2125e.e(c2148c.f24344g, this.f24353I.f24394x.f24344g, 0, 4);
                c2125e.e(c2148c.f24344g, this.f24353I.f24396z.f24344g, 0, 0);
            } else if (i20 == 2) {
                c2125e.e(c2148c4.f24344g, c2148c2.f24344g, 0, 8);
                c2125e.e(c2148c2.f24344g, this.f24353I.f24345A.f24344g, 0, 4);
                c2125e.e(c2148c2.f24344g, this.f24353I.f24395y.f24344g, 0, 0);
            } else if (i20 == 3) {
                c2125e.e(c2148c2.f24344g, c2148c4.f24344g, 0, 8);
                c2125e.e(c2148c2.f24344g, this.f24353I.f24395y.f24344g, 0, 4);
                c2125e.e(c2148c2.f24344g, this.f24353I.f24345A.f24344g, 0, 0);
            }
        }
    }

    @Override // x.C2149d
    public final boolean b() {
        return true;
    }

    @Override // x.C2149d
    public final String toString() {
        String q9 = AbstractC0953k1.q(new StringBuilder("[Barrier] "), this.f24366W, " {");
        for (int i9 = 0; i9 < this.f24469e0; i9++) {
            C2149d c2149d = this.f24468d0[i9];
            if (i9 > 0) {
                q9 = AbstractC0953k1.n(q9, ", ");
            }
            q9 = q9 + c2149d.f24366W;
        }
        return AbstractC0953k1.n(q9, "}");
    }
}
