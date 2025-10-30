package x;

/* renamed from: x.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2151f {

    /* renamed from: a, reason: collision with root package name */
    public int f24411a;

    /* renamed from: d, reason: collision with root package name */
    public C2148c f24414d;

    /* renamed from: e, reason: collision with root package name */
    public C2148c f24415e;

    /* renamed from: f, reason: collision with root package name */
    public C2148c f24416f;

    /* renamed from: g, reason: collision with root package name */
    public C2148c f24417g;

    /* renamed from: h, reason: collision with root package name */
    public int f24418h;

    /* renamed from: i, reason: collision with root package name */
    public int f24419i;
    public int j;

    /* renamed from: k, reason: collision with root package name */
    public int f24420k;

    /* renamed from: q, reason: collision with root package name */
    public int f24426q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ C2152g f24427r;

    /* renamed from: b, reason: collision with root package name */
    public C2149d f24412b = null;

    /* renamed from: c, reason: collision with root package name */
    public int f24413c = 0;

    /* renamed from: l, reason: collision with root package name */
    public int f24421l = 0;

    /* renamed from: m, reason: collision with root package name */
    public int f24422m = 0;

    /* renamed from: n, reason: collision with root package name */
    public int f24423n = 0;

    /* renamed from: o, reason: collision with root package name */
    public int f24424o = 0;

    /* renamed from: p, reason: collision with root package name */
    public int f24425p = 0;

    public C2151f(C2152g c2152g, int i9, C2148c c2148c, C2148c c2148c2, C2148c c2148c3, C2148c c2148c4, int i10) {
        this.f24427r = c2152g;
        this.f24418h = 0;
        this.f24419i = 0;
        this.j = 0;
        this.f24420k = 0;
        this.f24426q = 0;
        this.f24411a = i9;
        this.f24414d = c2148c;
        this.f24415e = c2148c2;
        this.f24416f = c2148c3;
        this.f24417g = c2148c4;
        this.f24418h = c2152g.f24447j0;
        this.f24419i = c2152g.f24443f0;
        this.j = c2152g.f24448k0;
        this.f24420k = c2152g.f24444g0;
        this.f24426q = i10;
    }

    public final void a(C2149d c2149d) {
        int i9 = this.f24411a;
        int i10 = 0;
        C2152g c2152g = this.f24427r;
        if (i9 == 0) {
            int D8 = c2152g.D(c2149d, this.f24426q);
            if (c2149d.f24374c0[0] == 3) {
                this.f24425p++;
                D8 = 0;
            }
            int i11 = c2152g.f24430C0;
            if (c2149d.f24365V != 8) {
                i10 = i11;
            }
            this.f24421l = D8 + i10 + this.f24421l;
            int C8 = c2152g.C(c2149d, this.f24426q);
            if (this.f24412b == null || this.f24413c < C8) {
                this.f24412b = c2149d;
                this.f24413c = C8;
                this.f24422m = C8;
            }
        } else {
            int D9 = c2152g.D(c2149d, this.f24426q);
            int C9 = c2152g.C(c2149d, this.f24426q);
            if (c2149d.f24374c0[1] == 3) {
                this.f24425p++;
                C9 = 0;
            }
            int i12 = c2152g.f24431D0;
            if (c2149d.f24365V != 8) {
                i10 = i12;
            }
            this.f24422m = C9 + i10 + this.f24422m;
            if (this.f24412b == null || this.f24413c < D9) {
                this.f24412b = c2149d;
                this.f24413c = D9;
                this.f24421l = D9;
            }
        }
        this.f24424o++;
    }

    public final void b(int i9, boolean z9, boolean z10) {
        C2152g c2152g;
        boolean z11;
        int i10;
        int i11;
        C2149d c2149d;
        int i12;
        char c3;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20 = this.f24424o;
        int i21 = 0;
        while (true) {
            c2152g = this.f24427r;
            if (i21 >= i20 || (i19 = this.f24423n + i21) >= c2152g.f24442O0) {
                break;
            }
            C2149d c2149d2 = c2152g.f24441N0[i19];
            if (c2149d2 != null) {
                c2149d2.t();
            }
            i21++;
        }
        if (i20 != 0 && this.f24412b != null) {
            if (z10 && i9 == 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            int i22 = -1;
            int i23 = -1;
            for (int i24 = 0; i24 < i20; i24++) {
                if (z9) {
                    i18 = (i20 - 1) - i24;
                } else {
                    i18 = i24;
                }
                int i25 = this.f24423n + i18;
                if (i25 >= c2152g.f24442O0) {
                    break;
                }
                if (c2152g.f24441N0[i25].f24365V == 0) {
                    if (i22 == -1) {
                        i22 = i24;
                    }
                    i23 = i24;
                }
            }
            if (this.f24411a == 0) {
                C2149d c2149d3 = this.f24412b;
                c2149d3.Y = c2152g.r0;
                int i26 = this.f24419i;
                if (i9 > 0) {
                    i26 += c2152g.f24431D0;
                }
                C2148c c2148c = this.f24415e;
                C2148c c2148c2 = c2149d3.f24395y;
                c2148c2.a(c2148c, i26);
                C2148c c2148c3 = c2149d3.f24345A;
                if (z10) {
                    c2148c3.a(this.f24417g, this.f24420k);
                }
                if (i9 > 0) {
                    this.f24415e.f24339b.f24345A.a(c2148c2, 0);
                }
                if (c2152g.f24433F0 == 3 && !c2149d3.f24393w) {
                    for (int i27 = 0; i27 < i20; i27++) {
                        if (z9) {
                            i17 = (i20 - 1) - i27;
                        } else {
                            i17 = i27;
                        }
                        int i28 = this.f24423n + i17;
                        if (i28 >= c2152g.f24442O0) {
                            break;
                        }
                        c2149d = c2152g.f24441N0[i28];
                        if (c2149d.f24393w) {
                            break;
                        }
                    }
                }
                c2149d = c2149d3;
                int i29 = 0;
                C2149d c2149d4 = null;
                while (i29 < i20) {
                    if (z9) {
                        i12 = (i20 - 1) - i29;
                    } else {
                        i12 = i29;
                    }
                    int i30 = this.f24423n + i12;
                    if (i30 < c2152g.f24442O0) {
                        C2149d c2149d5 = c2152g.f24441N0[i30];
                        if (i29 == 0) {
                            c2149d5.e(c2149d5.f24394x, this.f24414d, this.f24418h);
                        }
                        if (i12 == 0) {
                            int i31 = c2152g.f24454q0;
                            float f9 = c2152g.f24459w0;
                            if (this.f24423n == 0) {
                                i16 = c2152g.f24455s0;
                                i13 = i31;
                                i14 = -1;
                                if (i16 != -1) {
                                    f9 = c2152g.f24461y0;
                                    i15 = i16;
                                    c2149d5.f24367X = i15;
                                    c2149d5.f24362S = f9;
                                }
                            } else {
                                i13 = i31;
                                i14 = -1;
                            }
                            if (z10 && (i16 = c2152g.f24457u0) != i14) {
                                f9 = c2152g.f24428A0;
                                i15 = i16;
                                c2149d5.f24367X = i15;
                                c2149d5.f24362S = f9;
                            } else {
                                i15 = i13;
                                c2149d5.f24367X = i15;
                                c2149d5.f24362S = f9;
                            }
                        }
                        if (i29 == i20 - 1) {
                            c2149d5.e(c2149d5.f24396z, this.f24416f, this.j);
                        }
                        if (c2149d4 != null) {
                            C2148c c2148c4 = c2149d5.f24394x;
                            int i32 = c2152g.f24430C0;
                            C2148c c2148c5 = c2149d4.f24396z;
                            c2148c4.a(c2148c5, i32);
                            C2148c c2148c6 = c2149d5.f24394x;
                            if (i29 == i22) {
                                int i33 = this.f24418h;
                                if (c2148c6.f()) {
                                    c2148c6.f24343f = i33;
                                }
                            }
                            c2148c5.a(c2148c6, 0);
                            if (i29 == i23 + 1) {
                                int i34 = this.j;
                                if (c2148c5.f()) {
                                    c2148c5.f24343f = i34;
                                }
                            }
                        }
                        if (c2149d5 != c2149d3) {
                            int i35 = c2152g.f24433F0;
                            c3 = 3;
                            if (i35 == 3 && c2149d.f24393w && c2149d5 != c2149d && c2149d5.f24393w) {
                                c2149d5.f24346B.a(c2149d.f24346B, 0);
                            } else if (i35 != 0) {
                                if (i35 != 1) {
                                    if (z11) {
                                        c2149d5.f24395y.a(this.f24415e, this.f24419i);
                                        c2149d5.f24345A.a(this.f24417g, this.f24420k);
                                    } else {
                                        c2149d5.f24395y.a(c2148c2, 0);
                                        c2149d5.f24345A.a(c2148c3, 0);
                                    }
                                } else {
                                    c2149d5.f24345A.a(c2148c3, 0);
                                }
                            } else {
                                c2149d5.f24395y.a(c2148c2, 0);
                            }
                        } else {
                            c3 = 3;
                        }
                        i29++;
                        c2149d4 = c2149d5;
                    } else {
                        return;
                    }
                }
                return;
            }
            C2149d c2149d6 = this.f24412b;
            c2149d6.f24367X = c2152g.f24454q0;
            int i36 = this.f24418h;
            if (i9 > 0) {
                i36 += c2152g.f24430C0;
            }
            C2148c c2148c7 = c2149d6.f24394x;
            C2148c c2148c8 = c2149d6.f24396z;
            if (z9) {
                c2148c8.a(this.f24416f, i36);
                if (z10) {
                    c2148c7.a(this.f24414d, this.j);
                }
                if (i9 > 0) {
                    this.f24416f.f24339b.f24394x.a(c2148c8, 0);
                }
            } else {
                c2148c7.a(this.f24414d, i36);
                if (z10) {
                    c2148c8.a(this.f24416f, this.j);
                }
                if (i9 > 0) {
                    this.f24414d.f24339b.f24396z.a(c2148c7, 0);
                }
            }
            int i37 = 0;
            C2149d c2149d7 = null;
            while (i37 < i20) {
                int i38 = this.f24423n + i37;
                if (i38 < c2152g.f24442O0) {
                    C2149d c2149d8 = c2152g.f24441N0[i38];
                    if (i37 == 0) {
                        c2149d8.e(c2149d8.f24395y, this.f24415e, this.f24419i);
                        int i39 = c2152g.r0;
                        float f10 = c2152g.f24460x0;
                        if (this.f24423n == 0) {
                            i11 = c2152g.f24456t0;
                            i10 = -1;
                            if (i11 != -1) {
                                f10 = c2152g.f24462z0;
                                i39 = i11;
                                c2149d8.Y = i39;
                                c2149d8.f24363T = f10;
                            }
                        } else {
                            i10 = -1;
                        }
                        if (z10 && (i11 = c2152g.f24458v0) != i10) {
                            f10 = c2152g.f24429B0;
                            i39 = i11;
                        }
                        c2149d8.Y = i39;
                        c2149d8.f24363T = f10;
                    }
                    if (i37 == i20 - 1) {
                        c2149d8.e(c2149d8.f24345A, this.f24417g, this.f24420k);
                    }
                    if (c2149d7 != null) {
                        C2148c c2148c9 = c2149d8.f24395y;
                        int i40 = c2152g.f24431D0;
                        C2148c c2148c10 = c2149d7.f24345A;
                        c2148c9.a(c2148c10, i40);
                        C2148c c2148c11 = c2149d8.f24395y;
                        if (i37 == i22) {
                            int i41 = this.f24419i;
                            if (c2148c11.f()) {
                                c2148c11.f24343f = i41;
                            }
                        }
                        c2148c10.a(c2148c11, 0);
                        if (i37 == i23 + 1) {
                            int i42 = this.f24420k;
                            if (c2148c10.f()) {
                                c2148c10.f24343f = i42;
                            }
                        }
                    }
                    if (c2149d8 != c2149d6) {
                        if (z9) {
                            int i43 = c2152g.f24432E0;
                            if (i43 != 0) {
                                if (i43 != 1) {
                                    if (i43 == 2) {
                                        c2149d8.f24394x.a(c2148c7, 0);
                                        c2149d8.f24396z.a(c2148c8, 0);
                                    }
                                } else {
                                    c2149d8.f24394x.a(c2148c7, 0);
                                }
                            } else {
                                c2149d8.f24396z.a(c2148c8, 0);
                            }
                        } else {
                            int i44 = c2152g.f24432E0;
                            if (i44 != 0) {
                                if (i44 != 1) {
                                    if (i44 == 2) {
                                        if (z11) {
                                            c2149d8.f24394x.a(this.f24414d, this.f24418h);
                                            c2149d8.f24396z.a(this.f24416f, this.j);
                                        } else {
                                            c2149d8.f24394x.a(c2148c7, 0);
                                            c2149d8.f24396z.a(c2148c8, 0);
                                        }
                                    }
                                } else {
                                    c2149d8.f24396z.a(c2148c8, 0);
                                }
                            } else {
                                c2149d8.f24394x.a(c2148c7, 0);
                            }
                            i37++;
                            c2149d7 = c2149d8;
                        }
                    }
                    i37++;
                    c2149d7 = c2149d8;
                } else {
                    return;
                }
            }
        }
    }

    public final int c() {
        if (this.f24411a == 1) {
            return this.f24422m - this.f24427r.f24431D0;
        }
        return this.f24422m;
    }

    public final int d() {
        if (this.f24411a == 0) {
            return this.f24421l - this.f24427r.f24430C0;
        }
        return this.f24421l;
    }

    public final void e(int i9) {
        C2152g c2152g;
        int i10;
        int i11 = this.f24425p;
        if (i11 != 0) {
            int i12 = this.f24424o;
            int i13 = i9 / i11;
            int i14 = 0;
            while (true) {
                c2152g = this.f24427r;
                if (i14 >= i12 || (i10 = this.f24423n + i14) >= c2152g.f24442O0) {
                    break;
                }
                C2149d c2149d = c2152g.f24441N0[i10];
                if (this.f24411a == 0) {
                    if (c2149d != null) {
                        int[] iArr = c2149d.f24374c0;
                        if (iArr[0] == 3 && c2149d.j == 0) {
                            c2152g.E(1, i13, iArr[1], c2149d.i(), c2149d);
                        }
                    }
                } else if (c2149d != null) {
                    int[] iArr2 = c2149d.f24374c0;
                    if (iArr2[1] == 3 && c2149d.f24381k == 0) {
                        int i15 = iArr2[0];
                        int i16 = i13;
                        c2152g.E(i15, c2149d.l(), 1, i16, c2149d);
                        i13 = i16;
                    }
                }
                i14++;
            }
            this.f24421l = 0;
            this.f24422m = 0;
            this.f24412b = null;
            this.f24413c = 0;
            int i17 = this.f24424o;
            for (int i18 = 0; i18 < i17; i18++) {
                int i19 = this.f24423n + i18;
                if (i19 < c2152g.f24442O0) {
                    C2149d c2149d2 = c2152g.f24441N0[i19];
                    if (this.f24411a == 0) {
                        int l9 = c2149d2.l();
                        int i20 = c2152g.f24430C0;
                        if (c2149d2.f24365V == 8) {
                            i20 = 0;
                        }
                        this.f24421l = l9 + i20 + this.f24421l;
                        int C8 = c2152g.C(c2149d2, this.f24426q);
                        if (this.f24412b == null || this.f24413c < C8) {
                            this.f24412b = c2149d2;
                            this.f24413c = C8;
                            this.f24422m = C8;
                        }
                    } else {
                        int D8 = c2152g.D(c2149d2, this.f24426q);
                        int C9 = c2152g.C(c2149d2, this.f24426q);
                        int i21 = c2152g.f24431D0;
                        if (c2149d2.f24365V == 8) {
                            i21 = 0;
                        }
                        this.f24422m = C9 + i21 + this.f24422m;
                        if (this.f24412b == null || this.f24413c < D8) {
                            this.f24412b = c2149d2;
                            this.f24413c = D8;
                            this.f24421l = D8;
                        }
                    }
                } else {
                    return;
                }
            }
        }
    }

    public final void f(int i9, C2148c c2148c, C2148c c2148c2, C2148c c2148c3, C2148c c2148c4, int i10, int i11, int i12, int i13, int i14) {
        this.f24411a = i9;
        this.f24414d = c2148c;
        this.f24415e = c2148c2;
        this.f24416f = c2148c3;
        this.f24417g = c2148c4;
        this.f24418h = i10;
        this.f24419i = i11;
        this.j = i12;
        this.f24420k = i13;
        this.f24426q = i14;
    }
}
