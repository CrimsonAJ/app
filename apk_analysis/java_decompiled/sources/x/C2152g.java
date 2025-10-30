package x;

import java.util.ArrayList;
import l3.I;
import w.C2125e;

/* renamed from: x.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2152g extends AbstractC2154i {

    /* renamed from: A0, reason: collision with root package name */
    public float f24428A0;

    /* renamed from: B0, reason: collision with root package name */
    public float f24429B0;

    /* renamed from: C0, reason: collision with root package name */
    public int f24430C0;

    /* renamed from: D0, reason: collision with root package name */
    public int f24431D0;

    /* renamed from: E0, reason: collision with root package name */
    public int f24432E0;

    /* renamed from: F0, reason: collision with root package name */
    public int f24433F0;

    /* renamed from: G0, reason: collision with root package name */
    public int f24434G0;

    /* renamed from: H0, reason: collision with root package name */
    public int f24435H0;

    /* renamed from: I0, reason: collision with root package name */
    public int f24436I0;

    /* renamed from: J0, reason: collision with root package name */
    public ArrayList f24437J0;

    /* renamed from: K0, reason: collision with root package name */
    public C2149d[] f24438K0;

    /* renamed from: L0, reason: collision with root package name */
    public C2149d[] f24439L0;

    /* renamed from: M0, reason: collision with root package name */
    public int[] f24440M0;

    /* renamed from: N0, reason: collision with root package name */
    public C2149d[] f24441N0;

    /* renamed from: O0, reason: collision with root package name */
    public int f24442O0;

    /* renamed from: f0, reason: collision with root package name */
    public int f24443f0;

    /* renamed from: g0, reason: collision with root package name */
    public int f24444g0;

    /* renamed from: h0, reason: collision with root package name */
    public int f24445h0;

    /* renamed from: i0, reason: collision with root package name */
    public int f24446i0;

    /* renamed from: j0, reason: collision with root package name */
    public int f24447j0;

    /* renamed from: k0, reason: collision with root package name */
    public int f24448k0;

    /* renamed from: l0, reason: collision with root package name */
    public boolean f24449l0;

    /* renamed from: m0, reason: collision with root package name */
    public int f24450m0;

    /* renamed from: n0, reason: collision with root package name */
    public int f24451n0;

    /* renamed from: o0, reason: collision with root package name */
    public y.b f24452o0;

    /* renamed from: p0, reason: collision with root package name */
    public I f24453p0;

    /* renamed from: q0, reason: collision with root package name */
    public int f24454q0;
    public int r0;

    /* renamed from: s0, reason: collision with root package name */
    public int f24455s0;

    /* renamed from: t0, reason: collision with root package name */
    public int f24456t0;

    /* renamed from: u0, reason: collision with root package name */
    public int f24457u0;

    /* renamed from: v0, reason: collision with root package name */
    public int f24458v0;

    /* renamed from: w0, reason: collision with root package name */
    public float f24459w0;

    /* renamed from: x0, reason: collision with root package name */
    public float f24460x0;

    /* renamed from: y0, reason: collision with root package name */
    public float f24461y0;

    /* renamed from: z0, reason: collision with root package name */
    public float f24462z0;

    @Override // x.AbstractC2154i
    public final void B() {
        for (int i9 = 0; i9 < this.f24469e0; i9++) {
            C2149d c2149d = this.f24468d0[i9];
        }
    }

    public final int C(C2149d c2149d, int i9) {
        C2149d c2149d2;
        if (c2149d != null) {
            int[] iArr = c2149d.f24374c0;
            if (iArr[1] == 3) {
                int i10 = c2149d.f24381k;
                if (i10 != 0) {
                    if (i10 == 2) {
                        int i11 = (int) (c2149d.f24388r * i9);
                        if (i11 != c2149d.i()) {
                            E(iArr[0], c2149d.l(), 1, i11, c2149d);
                        }
                        return i11;
                    }
                    c2149d2 = c2149d;
                    if (i10 == 1) {
                        return c2149d2.i();
                    }
                    if (i10 == 3) {
                        return (int) ((c2149d2.l() * c2149d2.f24355L) + 0.5f);
                    }
                }
            } else {
                c2149d2 = c2149d;
            }
            return c2149d2.i();
        }
        return 0;
    }

    public final int D(C2149d c2149d, int i9) {
        C2149d c2149d2;
        if (c2149d != null) {
            int[] iArr = c2149d.f24374c0;
            if (iArr[0] == 3) {
                int i10 = c2149d.j;
                if (i10 != 0) {
                    if (i10 == 2) {
                        int i11 = (int) (c2149d.f24385o * i9);
                        if (i11 != c2149d.l()) {
                            E(1, i11, iArr[1], c2149d.i(), c2149d);
                        }
                        return i11;
                    }
                    c2149d2 = c2149d;
                    if (i10 == 1) {
                        return c2149d2.l();
                    }
                    if (i10 == 3) {
                        return (int) ((c2149d2.i() * c2149d2.f24355L) + 0.5f);
                    }
                }
            } else {
                c2149d2 = c2149d;
            }
            return c2149d2.l();
        }
        return 0;
    }

    public final void E(int i9, int i10, int i11, int i12, C2149d c2149d) {
        I i13;
        boolean z9;
        C2149d c2149d2;
        while (true) {
            i13 = this.f24453p0;
            if (i13 != null || (c2149d2 = this.f24353I) == null) {
                break;
            } else {
                this.f24453p0 = ((C2150e) c2149d2).f24400g0;
            }
        }
        y.b bVar = this.f24452o0;
        bVar.f24693a = i9;
        bVar.f24694b = i11;
        bVar.f24695c = i10;
        bVar.f24696d = i12;
        i13.a(c2149d, bVar);
        c2149d.y(bVar.f24697e);
        c2149d.v(bVar.f24698f);
        c2149d.f24393w = bVar.f24700h;
        int i14 = bVar.f24699g;
        c2149d.f24359P = i14;
        if (i14 > 0) {
            z9 = true;
        } else {
            z9 = false;
        }
        c2149d.f24393w = z9;
    }

    @Override // x.C2149d
    public final void a(C2125e c2125e) {
        boolean z9;
        boolean z10;
        C2149d c2149d;
        int i9;
        super.a(c2125e);
        C2149d c2149d2 = this.f24353I;
        if (c2149d2 != null) {
            z9 = ((C2150e) c2149d2).f24401h0;
        } else {
            z9 = false;
        }
        int i10 = this.f24434G0;
        ArrayList arrayList = this.f24437J0;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 == 2 && this.f24440M0 != null && this.f24439L0 != null && this.f24438K0 != null) {
                    for (int i11 = 0; i11 < this.f24442O0; i11++) {
                        this.f24441N0[i11].t();
                    }
                    int[] iArr = this.f24440M0;
                    int i12 = iArr[0];
                    int i13 = iArr[1];
                    C2149d c2149d3 = null;
                    for (int i14 = 0; i14 < i12; i14++) {
                        if (z9) {
                            i9 = (i12 - i14) - 1;
                        } else {
                            i9 = i14;
                        }
                        C2149d c2149d4 = this.f24439L0[i9];
                        if (c2149d4 != null && c2149d4.f24365V != 8) {
                            C2148c c2148c = c2149d4.f24394x;
                            if (i14 == 0) {
                                c2149d4.e(c2148c, this.f24394x, this.f24447j0);
                                c2149d4.f24367X = this.f24454q0;
                                c2149d4.f24362S = this.f24459w0;
                            }
                            if (i14 == i12 - 1) {
                                c2149d4.e(c2149d4.f24396z, this.f24396z, this.f24448k0);
                            }
                            if (i14 > 0) {
                                c2149d4.e(c2148c, c2149d3.f24396z, this.f24430C0);
                                c2149d3.e(c2149d3.f24396z, c2148c, 0);
                            }
                            c2149d3 = c2149d4;
                        }
                    }
                    for (int i15 = 0; i15 < i13; i15++) {
                        C2149d c2149d5 = this.f24438K0[i15];
                        if (c2149d5 != null && c2149d5.f24365V != 8) {
                            C2148c c2148c2 = c2149d5.f24395y;
                            if (i15 == 0) {
                                c2149d5.e(c2148c2, this.f24395y, this.f24443f0);
                                c2149d5.Y = this.r0;
                                c2149d5.f24363T = this.f24460x0;
                            }
                            if (i15 == i13 - 1) {
                                c2149d5.e(c2149d5.f24345A, this.f24345A, this.f24444g0);
                            }
                            if (i15 > 0) {
                                c2149d5.e(c2148c2, c2149d3.f24345A, this.f24431D0);
                                c2149d3.e(c2149d3.f24345A, c2148c2, 0);
                            }
                            c2149d3 = c2149d5;
                        }
                    }
                    for (int i16 = 0; i16 < i12; i16++) {
                        for (int i17 = 0; i17 < i13; i17++) {
                            int i18 = (i17 * i12) + i16;
                            if (this.f24436I0 == 1) {
                                i18 = (i16 * i13) + i17;
                            }
                            C2149d[] c2149dArr = this.f24441N0;
                            if (i18 < c2149dArr.length && (c2149d = c2149dArr[i18]) != null && c2149d.f24365V != 8) {
                                C2149d c2149d6 = this.f24439L0[i16];
                                C2149d c2149d7 = this.f24438K0[i17];
                                if (c2149d != c2149d6) {
                                    c2149d.e(c2149d.f24394x, c2149d6.f24394x, 0);
                                    c2149d.e(c2149d.f24396z, c2149d6.f24396z, 0);
                                }
                                if (c2149d != c2149d7) {
                                    c2149d.e(c2149d.f24395y, c2149d7.f24395y, 0);
                                    c2149d.e(c2149d.f24345A, c2149d7.f24345A, 0);
                                }
                            }
                        }
                    }
                }
            } else {
                int size = arrayList.size();
                for (int i19 = 0; i19 < size; i19++) {
                    C2151f c2151f = (C2151f) arrayList.get(i19);
                    if (i19 == size - 1) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    c2151f.b(i19, z9, z10);
                }
            }
        } else if (arrayList.size() > 0) {
            ((C2151f) arrayList.get(0)).b(0, z9, true);
        }
        this.f24449l0 = false;
    }
}
