package y;

import x.AbstractC2154i;
import x.C2148c;
import x.C2149d;

/* loaded from: classes.dex */
public final class i extends l {

    /* renamed from: k, reason: collision with root package name */
    public static final int[] f24716k = new int[2];

    public static void m(int[] iArr, int i9, int i10, int i11, int i12, float f9, int i13) {
        int i14 = i10 - i9;
        int i15 = i12 - i11;
        if (i13 != -1) {
            if (i13 != 0) {
                if (i13 == 1) {
                    iArr[0] = i14;
                    iArr[1] = (int) ((i14 * f9) + 0.5f);
                    return;
                }
                return;
            }
            iArr[0] = (int) ((i15 * f9) + 0.5f);
            iArr[1] = i15;
            return;
        }
        int i16 = (int) ((i15 * f9) + 0.5f);
        int i17 = (int) ((i14 / f9) + 0.5f);
        if (i16 <= i14) {
            iArr[0] = i16;
            iArr[1] = i15;
        } else if (i17 <= i15) {
            iArr[0] = i14;
            iArr[1] = i17;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:154:0x0243, code lost:
    
        if (r7 != 1) goto L125;
     */
    @Override // y.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(y.d r24) {
        /*
            Method dump skipped, instructions count: 913
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: y.i.a(y.d):void");
    }

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
            fVar.d(c2149d5.l());
        }
        boolean z10 = fVar.j;
        e eVar = this.f24729i;
        e eVar2 = this.f24728h;
        if (!z10) {
            C2149d c2149d6 = this.f24722b;
            int i9 = c2149d6.f24374c0[0];
            this.f24724d = i9;
            if (i9 != 3) {
                if (i9 == 4 && (((c2149d4 = c2149d6.f24353I) != null && c2149d4.f24374c0[0] == 1) || c2149d4.f24374c0[0] == 4)) {
                    int l9 = (c2149d4.l() - this.f24722b.f24394x.c()) - this.f24722b.f24396z.c();
                    i iVar = c2149d4.f24375d;
                    l.b(eVar2, iVar.f24728h, this.f24722b.f24394x.c());
                    l.b(eVar, iVar.f24729i, -this.f24722b.f24396z.c());
                    fVar.d(l9);
                    return;
                }
                if (i9 == 1) {
                    fVar.d(c2149d6.l());
                }
            }
        } else if (this.f24724d == 4 && (((c2149d2 = (c2149d = this.f24722b).f24353I) != null && c2149d2.f24374c0[0] == 1) || c2149d2.f24374c0[0] == 4)) {
            l.b(eVar2, c2149d2.f24375d.f24728h, c2149d.f24394x.c());
            l.b(eVar, c2149d2.f24375d.f24729i, -this.f24722b.f24396z.c());
            return;
        }
        if (fVar.j) {
            C2149d c2149d7 = this.f24722b;
            if (c2149d7.f24369a) {
                C2148c[] c2148cArr = c2149d7.f24350F;
                C2148c c2148c = c2148cArr[0];
                C2148c c2148c2 = c2148c.f24341d;
                if (c2148c2 != null && c2148cArr[1].f24341d != null) {
                    if (c2149d7.q()) {
                        eVar2.f24709f = this.f24722b.f24350F[0].c();
                        eVar.f24709f = -this.f24722b.f24350F[1].c();
                        return;
                    }
                    e h7 = l.h(this.f24722b.f24350F[0]);
                    if (h7 != null) {
                        l.b(eVar2, h7, this.f24722b.f24350F[0].c());
                    }
                    e h9 = l.h(this.f24722b.f24350F[1]);
                    if (h9 != null) {
                        l.b(eVar, h9, -this.f24722b.f24350F[1].c());
                    }
                    eVar2.f24705b = true;
                    eVar.f24705b = true;
                    return;
                }
                if (c2148c2 != null) {
                    e h10 = l.h(c2148c);
                    if (h10 != null) {
                        l.b(eVar2, h10, this.f24722b.f24350F[0].c());
                        l.b(eVar, eVar2, fVar.f24710g);
                        return;
                    }
                    return;
                }
                C2148c c2148c3 = c2148cArr[1];
                if (c2148c3.f24341d != null) {
                    e h11 = l.h(c2148c3);
                    if (h11 != null) {
                        l.b(eVar, h11, -this.f24722b.f24350F[1].c());
                        l.b(eVar2, eVar, -fVar.f24710g);
                        return;
                    }
                    return;
                }
                if (!(c2149d7 instanceof AbstractC2154i) && c2149d7.f24353I != null && c2149d7.g(7).f24341d == null) {
                    C2149d c2149d8 = this.f24722b;
                    l.b(eVar2, c2149d8.f24353I.f24375d.f24728h, c2149d8.m());
                    l.b(eVar, eVar2, fVar.f24710g);
                    return;
                }
                return;
            }
        }
        if (this.f24724d == 3) {
            C2149d c2149d9 = this.f24722b;
            int i10 = c2149d9.j;
            if (i10 != 2) {
                if (i10 == 3) {
                    if (c2149d9.f24381k == 3) {
                        eVar2.f24704a = this;
                        eVar.f24704a = this;
                        k kVar = c2149d9.f24376e;
                        kVar.f24728h.f24704a = this;
                        kVar.f24729i.f24704a = this;
                        fVar.f24704a = this;
                        if (c2149d9.r()) {
                            fVar.f24714l.add(this.f24722b.f24376e.f24725e);
                            this.f24722b.f24376e.f24725e.f24713k.add(fVar);
                            k kVar2 = this.f24722b.f24376e;
                            kVar2.f24725e.f24704a = this;
                            fVar.f24714l.add(kVar2.f24728h);
                            fVar.f24714l.add(this.f24722b.f24376e.f24729i);
                            this.f24722b.f24376e.f24728h.f24713k.add(fVar);
                            this.f24722b.f24376e.f24729i.f24713k.add(fVar);
                        } else if (this.f24722b.q()) {
                            this.f24722b.f24376e.f24725e.f24714l.add(fVar);
                            fVar.f24713k.add(this.f24722b.f24376e.f24725e);
                        } else {
                            this.f24722b.f24376e.f24725e.f24714l.add(fVar);
                        }
                    } else {
                        f fVar2 = c2149d9.f24376e.f24725e;
                        fVar.f24714l.add(fVar2);
                        fVar2.f24713k.add(fVar);
                        this.f24722b.f24376e.f24728h.f24713k.add(fVar);
                        this.f24722b.f24376e.f24729i.f24713k.add(fVar);
                        fVar.f24705b = true;
                        fVar.f24713k.add(eVar2);
                        fVar.f24713k.add(eVar);
                        eVar2.f24714l.add(fVar);
                        eVar.f24714l.add(fVar);
                    }
                }
            } else {
                C2149d c2149d10 = c2149d9.f24353I;
                if (c2149d10 != null) {
                    f fVar3 = c2149d10.f24376e.f24725e;
                    fVar.f24714l.add(fVar3);
                    fVar3.f24713k.add(fVar);
                    fVar.f24705b = true;
                    fVar.f24713k.add(eVar2);
                    fVar.f24713k.add(eVar);
                }
            }
        }
        C2149d c2149d11 = this.f24722b;
        C2148c[] c2148cArr2 = c2149d11.f24350F;
        C2148c c2148c4 = c2148cArr2[0];
        C2148c c2148c5 = c2148c4.f24341d;
        if (c2148c5 != null && c2148cArr2[1].f24341d != null) {
            if (c2149d11.q()) {
                eVar2.f24709f = this.f24722b.f24350F[0].c();
                eVar.f24709f = -this.f24722b.f24350F[1].c();
                return;
            }
            e h12 = l.h(this.f24722b.f24350F[0]);
            e h13 = l.h(this.f24722b.f24350F[1]);
            h12.b(this);
            h13.b(this);
            this.j = 4;
            return;
        }
        if (c2148c5 != null) {
            e h14 = l.h(c2148c4);
            if (h14 != null) {
                l.b(eVar2, h14, this.f24722b.f24350F[0].c());
                c(eVar, eVar2, 1, fVar);
                return;
            }
            return;
        }
        C2148c c2148c6 = c2148cArr2[1];
        if (c2148c6.f24341d != null) {
            e h15 = l.h(c2148c6);
            if (h15 != null) {
                l.b(eVar, h15, -this.f24722b.f24350F[1].c());
                c(eVar2, eVar, -1, fVar);
                return;
            }
            return;
        }
        if (!(c2149d11 instanceof AbstractC2154i) && (c2149d3 = c2149d11.f24353I) != null) {
            l.b(eVar2, c2149d3.f24375d.f24728h, c2149d11.m());
            c(eVar, eVar2, 1, fVar);
        }
    }

    @Override // y.l
    public final void e() {
        e eVar = this.f24728h;
        if (eVar.j) {
            this.f24722b.f24357N = eVar.f24710g;
        }
    }

    @Override // y.l
    public final void f() {
        this.f24723c = null;
        this.f24728h.c();
        this.f24729i.c();
        this.f24725e.c();
        this.f24727g = false;
    }

    @Override // y.l
    public final boolean k() {
        if (this.f24724d == 3 && this.f24722b.j != 0) {
            return false;
        }
        return true;
    }

    public final void n() {
        this.f24727g = false;
        e eVar = this.f24728h;
        eVar.c();
        eVar.j = false;
        e eVar2 = this.f24729i;
        eVar2.c();
        eVar2.j = false;
        this.f24725e.j = false;
    }

    public final String toString() {
        return "HorizontalRun " + this.f24722b.f24366W;
    }
}
