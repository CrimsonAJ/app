package y;

import w.AbstractC2128h;
import x.C2148c;
import x.C2149d;

/* loaded from: classes.dex */
public abstract class l implements d {

    /* renamed from: a, reason: collision with root package name */
    public int f24721a;

    /* renamed from: b, reason: collision with root package name */
    public C2149d f24722b;

    /* renamed from: c, reason: collision with root package name */
    public j f24723c;

    /* renamed from: d, reason: collision with root package name */
    public int f24724d;

    /* renamed from: e, reason: collision with root package name */
    public final f f24725e = new f(this);

    /* renamed from: f, reason: collision with root package name */
    public int f24726f = 0;

    /* renamed from: g, reason: collision with root package name */
    public boolean f24727g = false;

    /* renamed from: h, reason: collision with root package name */
    public final e f24728h = new e(this);

    /* renamed from: i, reason: collision with root package name */
    public final e f24729i = new e(this);
    public int j = 1;

    public l(C2149d c2149d) {
        this.f24722b = c2149d;
    }

    public static void b(e eVar, e eVar2, int i9) {
        eVar.f24714l.add(eVar2);
        eVar.f24709f = i9;
        eVar2.f24713k.add(eVar);
    }

    public static e h(C2148c c2148c) {
        C2148c c2148c2 = c2148c.f24341d;
        if (c2148c2 != null) {
            int b9 = AbstractC2128h.b(c2148c2.f24340c);
            C2149d c2149d = c2148c2.f24339b;
            if (b9 != 1) {
                if (b9 != 2) {
                    if (b9 != 3) {
                        if (b9 != 4) {
                            if (b9 != 5) {
                                return null;
                            }
                            return c2149d.f24376e.f24719k;
                        }
                        return c2149d.f24376e.f24729i;
                    }
                    return c2149d.f24375d.f24729i;
                }
                return c2149d.f24376e.f24728h;
            }
            return c2149d.f24375d.f24728h;
        }
        return null;
    }

    public static e i(C2148c c2148c, int i9) {
        l lVar;
        C2148c c2148c2 = c2148c.f24341d;
        if (c2148c2 != null) {
            C2149d c2149d = c2148c2.f24339b;
            if (i9 == 0) {
                lVar = c2149d.f24375d;
            } else {
                lVar = c2149d.f24376e;
            }
            int b9 = AbstractC2128h.b(c2148c2.f24340c);
            if (b9 != 1 && b9 != 2) {
                if (b9 != 3 && b9 != 4) {
                    return null;
                }
                return lVar.f24729i;
            }
            return lVar.f24728h;
        }
        return null;
    }

    public final void c(e eVar, e eVar2, int i9, f fVar) {
        eVar.f24714l.add(eVar2);
        eVar.f24714l.add(this.f24725e);
        eVar.f24711h = i9;
        eVar.f24712i = fVar;
        eVar2.f24713k.add(eVar);
        fVar.f24713k.add(eVar);
    }

    public abstract void d();

    public abstract void e();

    public abstract void f();

    public final int g(int i9, int i10) {
        if (i10 == 0) {
            C2149d c2149d = this.f24722b;
            int i11 = c2149d.f24384n;
            int max = Math.max(c2149d.f24383m, i9);
            if (i11 > 0) {
                max = Math.min(i11, i9);
            }
            if (max != i9) {
                return max;
            }
        } else {
            C2149d c2149d2 = this.f24722b;
            int i12 = c2149d2.f24387q;
            int max2 = Math.max(c2149d2.f24386p, i9);
            if (i12 > 0) {
                max2 = Math.min(i12, i9);
            }
            if (max2 != i9) {
                return max2;
            }
        }
        return i9;
    }

    public long j() {
        if (this.f24725e.j) {
            return r0.f24710g;
        }
        return 0L;
    }

    public abstract boolean k();

    public final void l(C2148c c2148c, C2148c c2148c2, int i9) {
        float f9;
        l lVar;
        float f10;
        int i10;
        e h7 = h(c2148c);
        e h9 = h(c2148c2);
        if (h7.j && h9.j) {
            int c3 = c2148c.c() + h7.f24710g;
            int c9 = h9.f24710g - c2148c2.c();
            int i11 = c9 - c3;
            f fVar = this.f24725e;
            if (!fVar.j && this.f24724d == 3) {
                int i12 = this.f24721a;
                if (i12 != 0) {
                    if (i12 != 1) {
                        if (i12 != 2) {
                            if (i12 == 3) {
                                C2149d c2149d = this.f24722b;
                                l lVar2 = c2149d.f24375d;
                                int i13 = lVar2.f24724d;
                                l lVar3 = c2149d.f24376e;
                                if (i13 != 3 || lVar2.f24721a != 3 || lVar3.f24724d != 3 || lVar3.f24721a != 3) {
                                    if (i9 == 0) {
                                        lVar2 = lVar3;
                                    }
                                    if (lVar2.f24725e.j) {
                                        float f11 = c2149d.f24355L;
                                        if (i9 == 1) {
                                            i10 = (int) ((r6.f24710g / f11) + 0.5f);
                                        } else {
                                            i10 = (int) ((f11 * r6.f24710g) + 0.5f);
                                        }
                                        fVar.d(i10);
                                    }
                                }
                            }
                        } else {
                            C2149d c2149d2 = this.f24722b;
                            C2149d c2149d3 = c2149d2.f24353I;
                            if (c2149d3 != null) {
                                if (i9 == 0) {
                                    lVar = c2149d3.f24375d;
                                } else {
                                    lVar = c2149d3.f24376e;
                                }
                                if (lVar.f24725e.j) {
                                    if (i9 == 0) {
                                        f10 = c2149d2.f24385o;
                                    } else {
                                        f10 = c2149d2.f24388r;
                                    }
                                    fVar.d(g((int) ((r6.f24710g * f10) + 0.5f), i9));
                                }
                            }
                        }
                    } else {
                        fVar.d(Math.min(g(fVar.f24715m, i9), i11));
                    }
                } else {
                    fVar.d(g(i11, i9));
                }
            }
            if (fVar.j) {
                int i14 = fVar.f24710g;
                e eVar = this.f24729i;
                e eVar2 = this.f24728h;
                if (i14 == i11) {
                    eVar2.d(c3);
                    eVar.d(c9);
                    return;
                }
                C2149d c2149d4 = this.f24722b;
                if (i9 == 0) {
                    f9 = c2149d4.f24362S;
                } else {
                    f9 = c2149d4.f24363T;
                }
                if (h7 == h9) {
                    c3 = h7.f24710g;
                    c9 = h9.f24710g;
                    f9 = 0.5f;
                }
                eVar2.d((int) ((((c9 - c3) - i14) * f9) + c3 + 0.5f));
                eVar.d(eVar2.f24710g + fVar.f24710g);
            }
        }
    }
}
