package x;

import java.util.ArrayList;
import u0.z;
import w.AbstractC2128h;
import w.C2123c;
import w.C2125e;

/* renamed from: x.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2153h extends C2149d {

    /* renamed from: d0, reason: collision with root package name */
    public float f24463d0 = -1.0f;

    /* renamed from: e0, reason: collision with root package name */
    public int f24464e0 = -1;

    /* renamed from: f0, reason: collision with root package name */
    public int f24465f0 = -1;

    /* renamed from: g0, reason: collision with root package name */
    public C2148c f24466g0 = this.f24395y;

    /* renamed from: h0, reason: collision with root package name */
    public int f24467h0 = 0;

    public C2153h() {
        this.f24351G.clear();
        this.f24351G.add(this.f24466g0);
        int length = this.f24350F.length;
        for (int i9 = 0; i9 < length; i9++) {
            this.f24350F[i9] = this.f24466g0;
        }
    }

    @Override // x.C2149d
    public final void A(C2125e c2125e) {
        if (this.f24353I == null) {
            return;
        }
        C2148c c2148c = this.f24466g0;
        c2125e.getClass();
        int m9 = C2125e.m(c2148c);
        if (this.f24467h0 == 1) {
            this.f24357N = m9;
            this.f24358O = 0;
            v(this.f24353I.i());
            y(0);
            return;
        }
        this.f24357N = 0;
        this.f24358O = m9;
        y(this.f24353I.l());
        v(0);
    }

    public final void B(int i9) {
        if (this.f24467h0 != i9) {
            this.f24467h0 = i9;
            ArrayList arrayList = this.f24351G;
            arrayList.clear();
            if (this.f24467h0 == 1) {
                this.f24466g0 = this.f24394x;
            } else {
                this.f24466g0 = this.f24395y;
            }
            arrayList.add(this.f24466g0);
            C2148c[] c2148cArr = this.f24350F;
            int length = c2148cArr.length;
            for (int i10 = 0; i10 < length; i10++) {
                c2148cArr[i10] = this.f24466g0;
            }
        }
    }

    @Override // x.C2149d
    public final void a(C2125e c2125e) {
        boolean z9;
        C2150e c2150e = (C2150e) this.f24353I;
        if (c2150e != null) {
            C2148c g9 = c2150e.g(2);
            C2148c g10 = c2150e.g(4);
            C2149d c2149d = this.f24353I;
            boolean z10 = true;
            if (c2149d != null && c2149d.f24374c0[0] == 2) {
                z9 = true;
            } else {
                z9 = false;
            }
            if (this.f24467h0 == 0) {
                g9 = c2150e.g(3);
                g10 = c2150e.g(5);
                C2149d c2149d2 = this.f24353I;
                if (c2149d2 == null || c2149d2.f24374c0[1] != 2) {
                    z10 = false;
                }
                z9 = z10;
            }
            if (this.f24464e0 != -1) {
                w.i j = c2125e.j(this.f24466g0);
                c2125e.e(j, c2125e.j(g9), this.f24464e0, 8);
                if (z9) {
                    c2125e.f(c2125e.j(g10), j, 0, 5);
                    return;
                }
                return;
            }
            if (this.f24465f0 != -1) {
                w.i j4 = c2125e.j(this.f24466g0);
                w.i j9 = c2125e.j(g10);
                c2125e.e(j4, j9, -this.f24465f0, 8);
                if (z9) {
                    c2125e.f(j4, c2125e.j(g9), 0, 5);
                    c2125e.f(j9, j4, 0, 5);
                    return;
                }
                return;
            }
            if (this.f24463d0 != -1.0f) {
                w.i j10 = c2125e.j(this.f24466g0);
                w.i j11 = c2125e.j(g10);
                float f9 = this.f24463d0;
                C2123c k5 = c2125e.k();
                k5.f23927d.b(j10, -1.0f);
                k5.f23927d.b(j11, f9);
                c2125e.c(k5);
            }
        }
    }

    @Override // x.C2149d
    public final boolean b() {
        return true;
    }

    @Override // x.C2149d
    public final C2148c g(int i9) {
        switch (AbstractC2128h.b(i9)) {
            case 0:
            case 5:
            case 6:
            case 7:
            case 8:
                return null;
            case 1:
            case 3:
                if (this.f24467h0 == 1) {
                    return this.f24466g0;
                }
                break;
            case 2:
            case 4:
                if (this.f24467h0 == 0) {
                    return this.f24466g0;
                }
                break;
        }
        throw new AssertionError(z.j(i9));
    }
}
