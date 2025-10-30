package w;

import com.google.firebase.messaging.s;
import java.util.Arrays;
import x.C2148c;

/* renamed from: w.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2125e {

    /* renamed from: o, reason: collision with root package name */
    public static int f23929o = 1000;

    /* renamed from: p, reason: collision with root package name */
    public static boolean f23930p = true;

    /* renamed from: b, reason: collision with root package name */
    public final C2127g f23932b;

    /* renamed from: e, reason: collision with root package name */
    public C2123c[] f23935e;

    /* renamed from: k, reason: collision with root package name */
    public final s f23940k;

    /* renamed from: n, reason: collision with root package name */
    public C2123c f23943n;

    /* renamed from: a, reason: collision with root package name */
    public int f23931a = 0;

    /* renamed from: c, reason: collision with root package name */
    public int f23933c = 32;

    /* renamed from: d, reason: collision with root package name */
    public int f23934d = 32;

    /* renamed from: f, reason: collision with root package name */
    public boolean f23936f = false;

    /* renamed from: g, reason: collision with root package name */
    public boolean[] f23937g = new boolean[32];

    /* renamed from: h, reason: collision with root package name */
    public int f23938h = 1;

    /* renamed from: i, reason: collision with root package name */
    public int f23939i = 0;
    public int j = 32;

    /* renamed from: l, reason: collision with root package name */
    public i[] f23941l = new i[f23929o];

    /* renamed from: m, reason: collision with root package name */
    public int f23942m = 0;

    /* JADX WARN: Type inference failed for: r1v2, types: [w.g, w.c] */
    public C2125e() {
        this.f23935e = null;
        this.f23935e = new C2123c[32];
        q();
        s sVar = new s(15, false);
        sVar.f16504b = new O.c();
        sVar.f16505c = new O.c();
        sVar.f16506d = new O.c();
        sVar.f16507e = new i[32];
        this.f23940k = sVar;
        ?? c2123c = new C2123c(sVar);
        c2123c.f23946f = new i[128];
        c2123c.f23947g = new i[128];
        c2123c.f23948h = 0;
        c2123c.f23949i = new C2126f(c2123c);
        this.f23932b = c2123c;
        if (f23930p) {
            this.f23943n = new C2124d(sVar);
        } else {
            this.f23943n = new C2123c(sVar);
        }
    }

    public static int m(Object obj) {
        i iVar = ((C2148c) obj).f24344g;
        if (iVar != null) {
            return (int) (iVar.f23955e + 0.5f);
        }
        return 0;
    }

    public final i a(int i9) {
        i iVar = (i) ((O.c) this.f23940k.f16506d).a();
        if (iVar == null) {
            iVar = new i(i9);
            iVar.f23961l = i9;
        } else {
            iVar.c();
            iVar.f23961l = i9;
        }
        int i10 = this.f23942m;
        int i11 = f23929o;
        if (i10 >= i11) {
            int i12 = i11 * 2;
            f23929o = i12;
            this.f23941l = (i[]) Arrays.copyOf(this.f23941l, i12);
        }
        i[] iVarArr = this.f23941l;
        int i13 = this.f23942m;
        this.f23942m = i13 + 1;
        iVarArr[i13] = iVar;
        return iVar;
    }

    public final void b(i iVar, i iVar2, int i9, float f9, i iVar3, i iVar4, int i10, int i11) {
        C2123c k5 = k();
        if (iVar2 == iVar3) {
            k5.f23927d.b(iVar, 1.0f);
            k5.f23927d.b(iVar4, 1.0f);
            k5.f23927d.b(iVar2, -2.0f);
        } else if (f9 == 0.5f) {
            k5.f23927d.b(iVar, 1.0f);
            k5.f23927d.b(iVar2, -1.0f);
            k5.f23927d.b(iVar3, -1.0f);
            k5.f23927d.b(iVar4, 1.0f);
            if (i9 > 0 || i10 > 0) {
                k5.f23925b = (-i9) + i10;
            }
        } else if (f9 <= 0.0f) {
            k5.f23927d.b(iVar, -1.0f);
            k5.f23927d.b(iVar2, 1.0f);
            k5.f23925b = i9;
        } else if (f9 >= 1.0f) {
            k5.f23927d.b(iVar4, -1.0f);
            k5.f23927d.b(iVar3, 1.0f);
            k5.f23925b = -i10;
        } else {
            float f10 = 1.0f - f9;
            k5.f23927d.b(iVar, f10 * 1.0f);
            k5.f23927d.b(iVar2, f10 * (-1.0f));
            k5.f23927d.b(iVar3, (-1.0f) * f9);
            k5.f23927d.b(iVar4, 1.0f * f9);
            if (i9 > 0 || i10 > 0) {
                k5.f23925b = (i10 * f9) + ((-i9) * f10);
            }
        }
        if (i11 != 8) {
            k5.a(this, i11);
        }
        c(k5);
    }

    /* JADX WARN: Code restructure failed: missing block: B:62:0x00bb, code lost:
    
        if (r4.f23960k <= 1) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x00be, code lost:
    
        r12 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x00c8, code lost:
    
        if (r4.f23960k <= 1) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x00dd, code lost:
    
        if (r4.f23960k <= 1) goto L79;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x00e0, code lost:
    
        r14 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x00ea, code lost:
    
        if (r4.f23960k <= 1) goto L79;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void c(w.C2123c r18) {
        /*
            Method dump skipped, instructions count: 415
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: w.C2125e.c(w.c):void");
    }

    public final void d(i iVar, int i9) {
        int i10 = iVar.f23953c;
        if (i10 == -1) {
            iVar.f23955e = i9;
            iVar.f23956f = true;
            int i11 = iVar.j;
            for (int i12 = 0; i12 < i11; i12++) {
                iVar.f23959i[i12].g(iVar, false);
            }
            iVar.j = 0;
            return;
        }
        if (i10 != -1) {
            C2123c c2123c = this.f23935e[i10];
            if (c2123c.f23928e) {
                c2123c.f23925b = i9;
                return;
            }
            if (c2123c.f23927d.g() == 0) {
                c2123c.f23928e = true;
                c2123c.f23925b = i9;
                return;
            }
            C2123c k5 = k();
            if (i9 < 0) {
                k5.f23925b = i9 * (-1);
                k5.f23927d.b(iVar, 1.0f);
            } else {
                k5.f23925b = i9;
                k5.f23927d.b(iVar, -1.0f);
            }
            c(k5);
            return;
        }
        C2123c k9 = k();
        k9.f23924a = iVar;
        float f9 = i9;
        iVar.f23955e = f9;
        k9.f23925b = f9;
        k9.f23928e = true;
        c(k9);
    }

    public final void e(i iVar, i iVar2, int i9, int i10) {
        boolean z9 = false;
        if (i10 == 8 && iVar2.f23956f && iVar.f23953c == -1) {
            iVar.f23955e = iVar2.f23955e + i9;
            iVar.f23956f = true;
            int i11 = iVar.j;
            for (int i12 = 0; i12 < i11; i12++) {
                iVar.f23959i[i12].g(iVar, false);
            }
            iVar.j = 0;
            return;
        }
        C2123c k5 = k();
        if (i9 != 0) {
            if (i9 < 0) {
                i9 *= -1;
                z9 = true;
            }
            k5.f23925b = i9;
        }
        if (!z9) {
            k5.f23927d.b(iVar, -1.0f);
            k5.f23927d.b(iVar2, 1.0f);
        } else {
            k5.f23927d.b(iVar, 1.0f);
            k5.f23927d.b(iVar2, -1.0f);
        }
        if (i10 != 8) {
            k5.a(this, i10);
        }
        c(k5);
    }

    public final void f(i iVar, i iVar2, int i9, int i10) {
        C2123c k5 = k();
        i l9 = l();
        l9.f23954d = 0;
        k5.b(iVar, iVar2, l9, i9);
        if (i10 != 8) {
            k5.f23927d.b(i(i10), (int) (k5.f23927d.c(l9) * (-1.0f)));
        }
        c(k5);
    }

    public final void g(i iVar, i iVar2, int i9, int i10) {
        C2123c k5 = k();
        i l9 = l();
        l9.f23954d = 0;
        k5.c(iVar, iVar2, l9, i9);
        if (i10 != 8) {
            k5.f23927d.b(i(i10), (int) (k5.f23927d.c(l9) * (-1.0f)));
        }
        c(k5);
    }

    public final void h(C2123c c2123c) {
        boolean z9 = f23930p;
        s sVar = this.f23940k;
        if (z9) {
            C2123c c2123c2 = this.f23935e[this.f23939i];
            if (c2123c2 != null) {
                ((O.c) sVar.f16504b).b(c2123c2);
            }
        } else {
            C2123c c2123c3 = this.f23935e[this.f23939i];
            if (c2123c3 != null) {
                ((O.c) sVar.f16505c).b(c2123c3);
            }
        }
        C2123c[] c2123cArr = this.f23935e;
        int i9 = this.f23939i;
        c2123cArr[i9] = c2123c;
        i iVar = c2123c.f23924a;
        iVar.f23953c = i9;
        this.f23939i = i9 + 1;
        iVar.d(c2123c);
    }

    public final i i(int i9) {
        if (this.f23938h + 1 >= this.f23934d) {
            n();
        }
        i a5 = a(4);
        int i10 = this.f23931a + 1;
        this.f23931a = i10;
        this.f23938h++;
        a5.f23952b = i10;
        a5.f23954d = i9;
        ((i[]) this.f23940k.f16507e)[i10] = a5;
        C2127g c2127g = this.f23932b;
        c2127g.f23949i.f23944a = a5;
        float[] fArr = a5.f23958h;
        Arrays.fill(fArr, 0.0f);
        fArr[a5.f23954d] = 1.0f;
        c2127g.i(a5);
        return a5;
    }

    public final i j(Object obj) {
        if (obj != null) {
            if (this.f23938h + 1 >= this.f23934d) {
                n();
            }
            if (obj instanceof C2148c) {
                C2148c c2148c = (C2148c) obj;
                i iVar = c2148c.f24344g;
                if (iVar == null) {
                    c2148c.i();
                    iVar = c2148c.f24344g;
                }
                int i9 = iVar.f23952b;
                s sVar = this.f23940k;
                if (i9 != -1 && i9 <= this.f23931a && ((i[]) sVar.f16507e)[i9] != null) {
                    return iVar;
                }
                if (i9 != -1) {
                    iVar.c();
                }
                int i10 = this.f23931a + 1;
                this.f23931a = i10;
                this.f23938h++;
                iVar.f23952b = i10;
                iVar.f23961l = 1;
                ((i[]) sVar.f16507e)[i10] = iVar;
                return iVar;
            }
            return null;
        }
        return null;
    }

    public final C2123c k() {
        boolean z9 = f23930p;
        s sVar = this.f23940k;
        if (z9) {
            C2123c c2123c = (C2123c) ((O.c) sVar.f16504b).a();
            if (c2123c == null) {
                return new C2124d(sVar);
            }
            c2123c.f23924a = null;
            c2123c.f23927d.clear();
            c2123c.f23925b = 0.0f;
            c2123c.f23928e = false;
            return c2123c;
        }
        C2123c c2123c2 = (C2123c) ((O.c) sVar.f16505c).a();
        if (c2123c2 == null) {
            return new C2123c(sVar);
        }
        c2123c2.f23924a = null;
        c2123c2.f23927d.clear();
        c2123c2.f23925b = 0.0f;
        c2123c2.f23928e = false;
        return c2123c2;
    }

    public final i l() {
        if (this.f23938h + 1 >= this.f23934d) {
            n();
        }
        i a5 = a(3);
        int i9 = this.f23931a + 1;
        this.f23931a = i9;
        this.f23938h++;
        a5.f23952b = i9;
        ((i[]) this.f23940k.f16507e)[i9] = a5;
        return a5;
    }

    public final void n() {
        int i9 = this.f23933c * 2;
        this.f23933c = i9;
        this.f23935e = (C2123c[]) Arrays.copyOf(this.f23935e, i9);
        s sVar = this.f23940k;
        sVar.f16507e = (i[]) Arrays.copyOf((i[]) sVar.f16507e, this.f23933c);
        int i10 = this.f23933c;
        this.f23937g = new boolean[i10];
        this.f23934d = i10;
        this.j = i10;
    }

    public final void o(C2127g c2127g) {
        s sVar;
        int i9 = 0;
        while (true) {
            if (i9 >= this.f23939i) {
                break;
            }
            C2123c c2123c = this.f23935e[i9];
            int i10 = 1;
            if (c2123c.f23924a.f23961l != 1) {
                float f9 = 0.0f;
                if (c2123c.f23925b < 0.0f) {
                    boolean z9 = false;
                    int i11 = 0;
                    while (!z9) {
                        i11 += i10;
                        float f10 = Float.MAX_VALUE;
                        int i12 = -1;
                        int i13 = -1;
                        int i14 = 0;
                        int i15 = 0;
                        while (true) {
                            int i16 = this.f23939i;
                            sVar = this.f23940k;
                            if (i14 >= i16) {
                                break;
                            }
                            C2123c c2123c2 = this.f23935e[i14];
                            if (c2123c2.f23924a.f23961l != i10 && !c2123c2.f23928e && c2123c2.f23925b < f9) {
                                int i17 = i10;
                                while (i17 < this.f23938h) {
                                    i iVar = ((i[]) sVar.f16507e)[i17];
                                    float c3 = c2123c2.f23927d.c(iVar);
                                    if (c3 > f9) {
                                        for (int i18 = 0; i18 < 9; i18++) {
                                            float f11 = iVar.f23957g[i18] / c3;
                                            if ((f11 < f10 && i18 == i15) || i18 > i15) {
                                                i15 = i18;
                                                f10 = f11;
                                                i12 = i14;
                                                i13 = i17;
                                            }
                                        }
                                    }
                                    i17++;
                                    f9 = 0.0f;
                                }
                            }
                            i14++;
                            f9 = 0.0f;
                            i10 = 1;
                        }
                        if (i12 != -1) {
                            C2123c c2123c3 = this.f23935e[i12];
                            c2123c3.f23924a.f23953c = -1;
                            c2123c3.f(((i[]) sVar.f16507e)[i13]);
                            i iVar2 = c2123c3.f23924a;
                            iVar2.f23953c = i12;
                            iVar2.d(c2123c3);
                        } else {
                            z9 = true;
                        }
                        if (i11 > this.f23938h / 2) {
                            z9 = true;
                        }
                        f9 = 0.0f;
                        i10 = 1;
                    }
                }
            }
            i9++;
        }
        p(c2127g);
        for (int i19 = 0; i19 < this.f23939i; i19++) {
            C2123c c2123c4 = this.f23935e[i19];
            c2123c4.f23924a.f23955e = c2123c4.f23925b;
        }
    }

    public final void p(C2123c c2123c) {
        for (int i9 = 0; i9 < this.f23938h; i9++) {
            this.f23937g[i9] = false;
        }
        boolean z9 = false;
        int i10 = 0;
        while (!z9) {
            i10++;
            if (i10 < this.f23938h * 2) {
                i iVar = c2123c.f23924a;
                if (iVar != null) {
                    this.f23937g[iVar.f23952b] = true;
                }
                i d9 = c2123c.d(this.f23937g);
                if (d9 != null) {
                    boolean[] zArr = this.f23937g;
                    int i11 = d9.f23952b;
                    if (!zArr[i11]) {
                        zArr[i11] = true;
                    } else {
                        return;
                    }
                }
                if (d9 != null) {
                    float f9 = Float.MAX_VALUE;
                    int i12 = -1;
                    for (int i13 = 0; i13 < this.f23939i; i13++) {
                        C2123c c2123c2 = this.f23935e[i13];
                        if (c2123c2.f23924a.f23961l != 1 && !c2123c2.f23928e && c2123c2.f23927d.f(d9)) {
                            float c3 = c2123c2.f23927d.c(d9);
                            if (c3 < 0.0f) {
                                float f10 = (-c2123c2.f23925b) / c3;
                                if (f10 < f9) {
                                    i12 = i13;
                                    f9 = f10;
                                }
                            }
                        }
                    }
                    if (i12 > -1) {
                        C2123c c2123c3 = this.f23935e[i12];
                        c2123c3.f23924a.f23953c = -1;
                        c2123c3.f(d9);
                        i iVar2 = c2123c3.f23924a;
                        iVar2.f23953c = i12;
                        iVar2.d(c2123c3);
                    }
                } else {
                    z9 = true;
                }
            } else {
                return;
            }
        }
    }

    public final void q() {
        boolean z9 = f23930p;
        s sVar = this.f23940k;
        int i9 = 0;
        if (z9) {
            while (true) {
                C2123c[] c2123cArr = this.f23935e;
                if (i9 < c2123cArr.length) {
                    C2123c c2123c = c2123cArr[i9];
                    if (c2123c != null) {
                        ((O.c) sVar.f16504b).b(c2123c);
                    }
                    this.f23935e[i9] = null;
                    i9++;
                } else {
                    return;
                }
            }
        } else {
            while (true) {
                C2123c[] c2123cArr2 = this.f23935e;
                if (i9 < c2123cArr2.length) {
                    C2123c c2123c2 = c2123cArr2[i9];
                    if (c2123c2 != null) {
                        ((O.c) sVar.f16505c).b(c2123c2);
                    }
                    this.f23935e[i9] = null;
                    i9++;
                } else {
                    return;
                }
            }
        }
    }

    public final void r() {
        s sVar;
        int i9 = 0;
        while (true) {
            sVar = this.f23940k;
            i[] iVarArr = (i[]) sVar.f16507e;
            if (i9 >= iVarArr.length) {
                break;
            }
            i iVar = iVarArr[i9];
            if (iVar != null) {
                iVar.c();
            }
            i9++;
        }
        O.c cVar = (O.c) sVar.f16506d;
        i[] iVarArr2 = this.f23941l;
        int i10 = this.f23942m;
        cVar.getClass();
        if (i10 > iVarArr2.length) {
            i10 = iVarArr2.length;
        }
        for (int i11 = 0; i11 < i10; i11++) {
            i iVar2 = iVarArr2[i11];
            int i12 = cVar.f5252c;
            Object[] objArr = cVar.f5251b;
            if (i12 < objArr.length) {
                objArr[i12] = iVar2;
                cVar.f5252c = i12 + 1;
            }
        }
        this.f23942m = 0;
        Arrays.fill((i[]) sVar.f16507e, (Object) null);
        this.f23931a = 0;
        C2127g c2127g = this.f23932b;
        c2127g.f23948h = 0;
        c2127g.f23925b = 0.0f;
        this.f23938h = 1;
        for (int i13 = 0; i13 < this.f23939i; i13++) {
            this.f23935e[i13].getClass();
        }
        q();
        this.f23939i = 0;
        if (f23930p) {
            this.f23943n = new C2124d(sVar);
        } else {
            this.f23943n = new C2123c(sVar);
        }
    }
}
