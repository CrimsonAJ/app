package y;

import w.AbstractC2128h;
import x.AbstractC2154i;
import x.C2148c;
import x.C2149d;

/* loaded from: classes.dex */
public final class k extends l {

    /* renamed from: k, reason: collision with root package name */
    public e f24719k;

    /* renamed from: l, reason: collision with root package name */
    public a f24720l;

    @Override // y.d
    public final void a(d dVar) {
        float f9;
        float f10;
        float f11;
        int i9;
        if (AbstractC2128h.b(this.j) != 3) {
            f fVar = this.f24725e;
            if (fVar.f24706c && !fVar.j && this.f24724d == 3) {
                C2149d c2149d = this.f24722b;
                int i10 = c2149d.f24381k;
                if (i10 != 2) {
                    if (i10 == 3) {
                        f fVar2 = c2149d.f24375d.f24725e;
                        if (fVar2.j) {
                            int i11 = c2149d.f24356M;
                            if (i11 != -1) {
                                if (i11 != 0) {
                                    if (i11 != 1) {
                                        i9 = 0;
                                        fVar.d(i9);
                                    } else {
                                        f9 = fVar2.f24710g;
                                        f10 = c2149d.f24355L;
                                    }
                                } else {
                                    f11 = fVar2.f24710g * c2149d.f24355L;
                                    i9 = (int) (f11 + 0.5f);
                                    fVar.d(i9);
                                }
                            } else {
                                f9 = fVar2.f24710g;
                                f10 = c2149d.f24355L;
                            }
                            f11 = f9 / f10;
                            i9 = (int) (f11 + 0.5f);
                            fVar.d(i9);
                        }
                    }
                } else {
                    C2149d c2149d2 = c2149d.f24353I;
                    if (c2149d2 != null) {
                        if (c2149d2.f24376e.f24725e.j) {
                            fVar.d((int) ((r5.f24710g * c2149d.f24388r) + 0.5f));
                        }
                    }
                }
            }
            e eVar = this.f24728h;
            if (eVar.f24706c) {
                e eVar2 = this.f24729i;
                if (eVar2.f24706c) {
                    if (!eVar.j || !eVar2.j || !fVar.j) {
                        if (!fVar.j && this.f24724d == 3) {
                            C2149d c2149d3 = this.f24722b;
                            if (c2149d3.j == 0 && !c2149d3.r()) {
                                e eVar3 = (e) eVar.f24714l.get(0);
                                e eVar4 = (e) eVar2.f24714l.get(0);
                                int i12 = eVar3.f24710g + eVar.f24709f;
                                int i13 = eVar4.f24710g + eVar2.f24709f;
                                eVar.d(i12);
                                eVar2.d(i13);
                                fVar.d(i13 - i12);
                                return;
                            }
                        }
                        if (!fVar.j && this.f24724d == 3 && this.f24721a == 1 && eVar.f24714l.size() > 0 && eVar2.f24714l.size() > 0) {
                            e eVar5 = (e) eVar.f24714l.get(0);
                            int i14 = (((e) eVar2.f24714l.get(0)).f24710g + eVar2.f24709f) - (eVar5.f24710g + eVar.f24709f);
                            int i15 = fVar.f24715m;
                            if (i14 < i15) {
                                fVar.d(i14);
                            } else {
                                fVar.d(i15);
                            }
                        }
                        if (fVar.j && eVar.f24714l.size() > 0 && eVar2.f24714l.size() > 0) {
                            e eVar6 = (e) eVar.f24714l.get(0);
                            e eVar7 = (e) eVar2.f24714l.get(0);
                            int i16 = eVar6.f24710g;
                            int i17 = eVar.f24709f + i16;
                            int i18 = eVar7.f24710g;
                            int i19 = eVar2.f24709f + i18;
                            float f12 = this.f24722b.f24363T;
                            if (eVar6 == eVar7) {
                                f12 = 0.5f;
                            } else {
                                i16 = i17;
                                i18 = i19;
                            }
                            eVar.d((int) ((((i18 - i16) - fVar.f24710g) * f12) + i16 + 0.5f));
                            eVar2.d(eVar.f24710g + fVar.f24710g);
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            }
            return;
        }
        C2149d c2149d4 = this.f24722b;
        l(c2149d4.f24395y, c2149d4.f24345A, 1);
    }

    /* JADX WARN: Type inference failed for: r0v123, types: [y.f, y.a] */
    @Override // y.l
    public final void d() {
        C2149d c2149d;
        C2149d c2149d2;
        C2149d c2149d3;
        C2149d c2149d4;
        C2149d c2149d5 = this.f24722b;
        boolean z9 = c2149d5.f24369a;
        f fVar = this.f24725e;
        if (z9) {
            fVar.d(c2149d5.i());
        }
        boolean z10 = fVar.j;
        e eVar = this.f24729i;
        e eVar2 = this.f24728h;
        if (!z10) {
            C2149d c2149d6 = this.f24722b;
            this.f24724d = c2149d6.f24374c0[1];
            if (c2149d6.f24393w) {
                this.f24720l = new f(this);
            }
            int i9 = this.f24724d;
            if (i9 != 3) {
                if (i9 == 4 && (c2149d4 = this.f24722b.f24353I) != null && c2149d4.f24374c0[1] == 1) {
                    int i10 = (c2149d4.i() - this.f24722b.f24395y.c()) - this.f24722b.f24345A.c();
                    k kVar = c2149d4.f24376e;
                    l.b(eVar2, kVar.f24728h, this.f24722b.f24395y.c());
                    l.b(eVar, kVar.f24729i, -this.f24722b.f24345A.c());
                    fVar.d(i10);
                    return;
                }
                if (i9 == 1) {
                    fVar.d(this.f24722b.i());
                }
            }
        } else if (this.f24724d == 4 && (c2149d2 = (c2149d = this.f24722b).f24353I) != null && c2149d2.f24374c0[1] == 1) {
            k kVar2 = c2149d2.f24376e;
            l.b(eVar2, kVar2.f24728h, c2149d.f24395y.c());
            l.b(eVar, kVar2.f24729i, -this.f24722b.f24345A.c());
            return;
        }
        boolean z11 = fVar.j;
        e eVar3 = this.f24719k;
        if (z11) {
            C2149d c2149d7 = this.f24722b;
            if (c2149d7.f24369a) {
                C2148c[] c2148cArr = c2149d7.f24350F;
                C2148c c2148c = c2148cArr[2];
                C2148c c2148c2 = c2148c.f24341d;
                if (c2148c2 != null && c2148cArr[3].f24341d != null) {
                    if (c2149d7.r()) {
                        eVar2.f24709f = this.f24722b.f24350F[2].c();
                        eVar.f24709f = -this.f24722b.f24350F[3].c();
                    } else {
                        e h7 = l.h(this.f24722b.f24350F[2]);
                        if (h7 != null) {
                            l.b(eVar2, h7, this.f24722b.f24350F[2].c());
                        }
                        e h9 = l.h(this.f24722b.f24350F[3]);
                        if (h9 != null) {
                            l.b(eVar, h9, -this.f24722b.f24350F[3].c());
                        }
                        eVar2.f24705b = true;
                        eVar.f24705b = true;
                    }
                    C2149d c2149d8 = this.f24722b;
                    if (c2149d8.f24393w) {
                        l.b(eVar3, eVar2, c2149d8.f24359P);
                        return;
                    }
                    return;
                }
                if (c2148c2 != null) {
                    e h10 = l.h(c2148c);
                    if (h10 != null) {
                        l.b(eVar2, h10, this.f24722b.f24350F[2].c());
                        l.b(eVar, eVar2, fVar.f24710g);
                        C2149d c2149d9 = this.f24722b;
                        if (c2149d9.f24393w) {
                            l.b(eVar3, eVar2, c2149d9.f24359P);
                            return;
                        }
                        return;
                    }
                    return;
                }
                C2148c c2148c3 = c2148cArr[3];
                if (c2148c3.f24341d != null) {
                    e h11 = l.h(c2148c3);
                    if (h11 != null) {
                        l.b(eVar, h11, -this.f24722b.f24350F[3].c());
                        l.b(eVar2, eVar, -fVar.f24710g);
                    }
                    C2149d c2149d10 = this.f24722b;
                    if (c2149d10.f24393w) {
                        l.b(eVar3, eVar2, c2149d10.f24359P);
                        return;
                    }
                    return;
                }
                C2148c c2148c4 = c2148cArr[4];
                if (c2148c4.f24341d != null) {
                    e h12 = l.h(c2148c4);
                    if (h12 != null) {
                        l.b(eVar3, h12, 0);
                        l.b(eVar2, eVar3, -this.f24722b.f24359P);
                        l.b(eVar, eVar2, fVar.f24710g);
                        return;
                    }
                    return;
                }
                if (!(c2149d7 instanceof AbstractC2154i) && c2149d7.f24353I != null && c2149d7.g(7).f24341d == null) {
                    C2149d c2149d11 = this.f24722b;
                    l.b(eVar2, c2149d11.f24353I.f24376e.f24728h, c2149d11.n());
                    l.b(eVar, eVar2, fVar.f24710g);
                    C2149d c2149d12 = this.f24722b;
                    if (c2149d12.f24393w) {
                        l.b(eVar3, eVar2, c2149d12.f24359P);
                        return;
                    }
                    return;
                }
                return;
            }
        }
        if (!z11 && this.f24724d == 3) {
            C2149d c2149d13 = this.f24722b;
            int i11 = c2149d13.f24381k;
            if (i11 != 2) {
                if (i11 == 3 && !c2149d13.r()) {
                    C2149d c2149d14 = this.f24722b;
                    if (c2149d14.j != 3) {
                        f fVar2 = c2149d14.f24375d.f24725e;
                        fVar.f24714l.add(fVar2);
                        fVar2.f24713k.add(fVar);
                        fVar.f24705b = true;
                        fVar.f24713k.add(eVar2);
                        fVar.f24713k.add(eVar);
                    }
                }
            } else {
                C2149d c2149d15 = c2149d13.f24353I;
                if (c2149d15 != null) {
                    f fVar3 = c2149d15.f24376e.f24725e;
                    fVar.f24714l.add(fVar3);
                    fVar3.f24713k.add(fVar);
                    fVar.f24705b = true;
                    fVar.f24713k.add(eVar2);
                    fVar.f24713k.add(eVar);
                }
            }
        } else {
            fVar.b(this);
        }
        C2149d c2149d16 = this.f24722b;
        C2148c[] c2148cArr2 = c2149d16.f24350F;
        C2148c c2148c5 = c2148cArr2[2];
        C2148c c2148c6 = c2148c5.f24341d;
        if (c2148c6 != null && c2148cArr2[3].f24341d != null) {
            if (c2149d16.r()) {
                eVar2.f24709f = this.f24722b.f24350F[2].c();
                eVar.f24709f = -this.f24722b.f24350F[3].c();
            } else {
                e h13 = l.h(this.f24722b.f24350F[2]);
                e h14 = l.h(this.f24722b.f24350F[3]);
                h13.b(this);
                h14.b(this);
                this.j = 4;
            }
            if (this.f24722b.f24393w) {
                c(eVar3, eVar2, 1, this.f24720l);
            }
        } else if (c2148c6 != null) {
            e h15 = l.h(c2148c5);
            if (h15 != null) {
                l.b(eVar2, h15, this.f24722b.f24350F[2].c());
                c(eVar, eVar2, 1, fVar);
                if (this.f24722b.f24393w) {
                    c(eVar3, eVar2, 1, this.f24720l);
                }
                if (this.f24724d == 3) {
                    C2149d c2149d17 = this.f24722b;
                    if (c2149d17.f24355L > 0.0f) {
                        i iVar = c2149d17.f24375d;
                        if (iVar.f24724d == 3) {
                            iVar.f24725e.f24713k.add(fVar);
                            fVar.f24714l.add(this.f24722b.f24375d.f24725e);
                            fVar.f24704a = this;
                        }
                    }
                }
            }
        } else {
            C2148c c2148c7 = c2148cArr2[3];
            if (c2148c7.f24341d != null) {
                e h16 = l.h(c2148c7);
                if (h16 != null) {
                    l.b(eVar, h16, -this.f24722b.f24350F[3].c());
                    c(eVar2, eVar, -1, fVar);
                    if (this.f24722b.f24393w) {
                        c(eVar3, eVar2, 1, this.f24720l);
                    }
                }
            } else {
                C2148c c2148c8 = c2148cArr2[4];
                if (c2148c8.f24341d != null) {
                    e h17 = l.h(c2148c8);
                    if (h17 != null) {
                        l.b(eVar3, h17, 0);
                        c(eVar2, eVar3, -1, this.f24720l);
                        c(eVar, eVar2, 1, fVar);
                    }
                } else if (!(c2149d16 instanceof AbstractC2154i) && (c2149d3 = c2149d16.f24353I) != null) {
                    l.b(eVar2, c2149d3.f24376e.f24728h, c2149d16.n());
                    c(eVar, eVar2, 1, fVar);
                    if (this.f24722b.f24393w) {
                        c(eVar3, eVar2, 1, this.f24720l);
                    }
                    if (this.f24724d == 3) {
                        C2149d c2149d18 = this.f24722b;
                        if (c2149d18.f24355L > 0.0f) {
                            i iVar2 = c2149d18.f24375d;
                            if (iVar2.f24724d == 3) {
                                iVar2.f24725e.f24713k.add(fVar);
                                fVar.f24714l.add(this.f24722b.f24375d.f24725e);
                                fVar.f24704a = this;
                            }
                        }
                    }
                }
            }
        }
        if (fVar.f24714l.size() == 0) {
            fVar.f24706c = true;
        }
    }

    @Override // y.l
    public final void e() {
        e eVar = this.f24728h;
        if (eVar.j) {
            this.f24722b.f24358O = eVar.f24710g;
        }
    }

    @Override // y.l
    public final void f() {
        this.f24723c = null;
        this.f24728h.c();
        this.f24729i.c();
        this.f24719k.c();
        this.f24725e.c();
        this.f24727g = false;
    }

    @Override // y.l
    public final boolean k() {
        if (this.f24724d == 3 && this.f24722b.f24381k != 0) {
            return false;
        }
        return true;
    }

    public final void m() {
        this.f24727g = false;
        e eVar = this.f24728h;
        eVar.c();
        eVar.j = false;
        e eVar2 = this.f24729i;
        eVar2.c();
        eVar2.j = false;
        e eVar3 = this.f24719k;
        eVar3.c();
        eVar3.j = false;
        this.f24725e.j = false;
    }

    public final String toString() {
        return "VerticalRun " + this.f24722b.f24366W;
    }
}
