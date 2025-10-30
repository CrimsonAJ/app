package j3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import m4.C1591b;
import n3.C1629f;
import n3.C1630g;

/* loaded from: classes.dex */
public final class M implements InterfaceC1453f {

    /* renamed from: Z, reason: collision with root package name */
    public static final M f19418Z = new M(new L());

    /* renamed from: f0, reason: collision with root package name */
    public static final X0.k f19419f0 = new X0.k(24);

    /* renamed from: A, reason: collision with root package name */
    public final int f19420A;

    /* renamed from: B, reason: collision with root package name */
    public final int f19421B;

    /* renamed from: C, reason: collision with root package name */
    public final int f19422C;

    /* renamed from: D, reason: collision with root package name */
    public final int f19423D;

    /* renamed from: X, reason: collision with root package name */
    public final int f19424X;
    public int Y;

    /* renamed from: a, reason: collision with root package name */
    public final String f19425a;

    /* renamed from: b, reason: collision with root package name */
    public final String f19426b;

    /* renamed from: c, reason: collision with root package name */
    public final String f19427c;

    /* renamed from: d, reason: collision with root package name */
    public final int f19428d;

    /* renamed from: e, reason: collision with root package name */
    public final int f19429e;

    /* renamed from: f, reason: collision with root package name */
    public final int f19430f;

    /* renamed from: g, reason: collision with root package name */
    public final int f19431g;

    /* renamed from: h, reason: collision with root package name */
    public final int f19432h;

    /* renamed from: i, reason: collision with root package name */
    public final String f19433i;
    public final D3.c j;

    /* renamed from: k, reason: collision with root package name */
    public final String f19434k;

    /* renamed from: l, reason: collision with root package name */
    public final String f19435l;

    /* renamed from: m, reason: collision with root package name */
    public final int f19436m;

    /* renamed from: n, reason: collision with root package name */
    public final List f19437n;

    /* renamed from: o, reason: collision with root package name */
    public final C1630g f19438o;

    /* renamed from: p, reason: collision with root package name */
    public final long f19439p;

    /* renamed from: q, reason: collision with root package name */
    public final int f19440q;

    /* renamed from: r, reason: collision with root package name */
    public final int f19441r;

    /* renamed from: s, reason: collision with root package name */
    public final float f19442s;

    /* renamed from: t, reason: collision with root package name */
    public final int f19443t;

    /* renamed from: u, reason: collision with root package name */
    public final float f19444u;

    /* renamed from: v, reason: collision with root package name */
    public final byte[] f19445v;

    /* renamed from: w, reason: collision with root package name */
    public final int f19446w;

    /* renamed from: x, reason: collision with root package name */
    public final C1591b f19447x;

    /* renamed from: y, reason: collision with root package name */
    public final int f19448y;

    /* renamed from: z, reason: collision with root package name */
    public final int f19449z;

    public M(L l9) {
        this.f19425a = l9.f19393a;
        this.f19426b = l9.f19394b;
        this.f19427c = l4.y.I(l9.f19395c);
        this.f19428d = l9.f19396d;
        this.f19429e = l9.f19397e;
        int i9 = l9.f19398f;
        this.f19430f = i9;
        int i10 = l9.f19399g;
        this.f19431g = i10;
        this.f19432h = i10 != -1 ? i10 : i9;
        this.f19433i = l9.f19400h;
        this.j = l9.f19401i;
        this.f19434k = l9.j;
        this.f19435l = l9.f19402k;
        this.f19436m = l9.f19403l;
        List list = l9.f19404m;
        this.f19437n = list == null ? Collections.EMPTY_LIST : list;
        C1630g c1630g = l9.f19405n;
        this.f19438o = c1630g;
        this.f19439p = l9.f19406o;
        this.f19440q = l9.f19407p;
        this.f19441r = l9.f19408q;
        this.f19442s = l9.f19409r;
        int i11 = l9.f19410s;
        this.f19443t = i11 == -1 ? 0 : i11;
        float f9 = l9.f19411t;
        this.f19444u = f9 == -1.0f ? 1.0f : f9;
        this.f19445v = l9.f19412u;
        this.f19446w = l9.f19413v;
        this.f19447x = l9.f19414w;
        this.f19448y = l9.f19415x;
        this.f19449z = l9.f19416y;
        this.f19420A = l9.f19417z;
        int i12 = l9.f19389A;
        this.f19421B = i12 == -1 ? 0 : i12;
        int i13 = l9.f19390B;
        this.f19422C = i13 != -1 ? i13 : 0;
        this.f19423D = l9.f19391C;
        int i14 = l9.f19392D;
        if (i14 == 0 && c1630g != null) {
            this.f19424X = 1;
        } else {
            this.f19424X = i14;
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [j3.L, java.lang.Object] */
    public final L a() {
        ?? obj = new Object();
        obj.f19393a = this.f19425a;
        obj.f19394b = this.f19426b;
        obj.f19395c = this.f19427c;
        obj.f19396d = this.f19428d;
        obj.f19397e = this.f19429e;
        obj.f19398f = this.f19430f;
        obj.f19399g = this.f19431g;
        obj.f19400h = this.f19433i;
        obj.f19401i = this.j;
        obj.j = this.f19434k;
        obj.f19402k = this.f19435l;
        obj.f19403l = this.f19436m;
        obj.f19404m = this.f19437n;
        obj.f19405n = this.f19438o;
        obj.f19406o = this.f19439p;
        obj.f19407p = this.f19440q;
        obj.f19408q = this.f19441r;
        obj.f19409r = this.f19442s;
        obj.f19410s = this.f19443t;
        obj.f19411t = this.f19444u;
        obj.f19412u = this.f19445v;
        obj.f19413v = this.f19446w;
        obj.f19414w = this.f19447x;
        obj.f19415x = this.f19448y;
        obj.f19416y = this.f19449z;
        obj.f19417z = this.f19420A;
        obj.f19389A = this.f19421B;
        obj.f19390B = this.f19422C;
        obj.f19391C = this.f19423D;
        obj.f19392D = this.f19424X;
        return obj;
    }

    public final boolean b(M m9) {
        List list = this.f19437n;
        if (list.size() != m9.f19437n.size()) {
            return false;
        }
        for (int i9 = 0; i9 < list.size(); i9++) {
            if (!Arrays.equals((byte[]) list.get(i9), (byte[]) m9.f19437n.get(i9))) {
                return false;
            }
        }
        return true;
    }

    public final M c(M m9) {
        String str;
        String str2;
        C1630g c1630g;
        C1629f[] c1629fArr;
        if (this == m9) {
            return this;
        }
        int h7 = l4.n.h(this.f19435l);
        String str3 = m9.f19425a;
        String str4 = m9.f19426b;
        if (str4 == null) {
            str4 = this.f19426b;
        }
        if ((h7 != 3 && h7 != 1) || (str = m9.f19427c) == null) {
            str = this.f19427c;
        }
        int i9 = this.f19430f;
        if (i9 == -1) {
            i9 = m9.f19430f;
        }
        int i10 = this.f19431g;
        if (i10 == -1) {
            i10 = m9.f19431g;
        }
        String str5 = this.f19433i;
        if (str5 == null) {
            String r5 = l4.y.r(h7, m9.f19433i);
            if (l4.y.Q(r5).length == 1) {
                str5 = r5;
            }
        }
        D3.c cVar = m9.j;
        D3.c cVar2 = this.j;
        if (cVar2 != null) {
            if (cVar != null) {
                D3.b[] bVarArr = cVar.f1786a;
                if (bVarArr.length != 0) {
                    int i11 = l4.y.f20553a;
                    D3.b[] bVarArr2 = cVar2.f1786a;
                    Object[] copyOf = Arrays.copyOf(bVarArr2, bVarArr2.length + bVarArr.length);
                    System.arraycopy(bVarArr, 0, copyOf, bVarArr2.length, bVarArr.length);
                    cVar = new D3.c(cVar2.f1787b, (D3.b[]) copyOf);
                }
            }
            cVar = cVar2;
        }
        float f9 = this.f19442s;
        if (f9 == -1.0f && h7 == 2) {
            f9 = m9.f19442s;
        }
        int i12 = this.f19428d | m9.f19428d;
        int i13 = this.f19429e | m9.f19429e;
        ArrayList arrayList = new ArrayList();
        C1630g c1630g2 = m9.f19438o;
        if (c1630g2 != null) {
            C1629f[] c1629fArr2 = c1630g2.f21120a;
            int length = c1629fArr2.length;
            int i14 = 0;
            while (i14 < length) {
                int i15 = length;
                C1629f c1629f = c1629fArr2[i14];
                int i16 = i14;
                if (c1629f.f21119e != null) {
                    arrayList.add(c1629f);
                }
                i14 = i16 + 1;
                length = i15;
            }
            str2 = c1630g2.f21122c;
        } else {
            str2 = null;
        }
        C1630g c1630g3 = this.f19438o;
        if (c1630g3 != null) {
            if (str2 == null) {
                str2 = c1630g3.f21122c;
            }
            int size = arrayList.size();
            C1629f[] c1629fArr3 = c1630g3.f21120a;
            int length2 = c1629fArr3.length;
            int i17 = 0;
            while (i17 < length2) {
                int i18 = i17;
                C1629f c1629f2 = c1629fArr3[i18];
                String str6 = str2;
                if (c1629f2.f21119e != null) {
                    int i19 = 0;
                    while (true) {
                        if (i19 < size) {
                            int i20 = i19;
                            c1629fArr = c1629fArr3;
                            if (((C1629f) arrayList.get(i19)).f21116b.equals(c1629f2.f21116b)) {
                                break;
                            }
                            i19 = i20 + 1;
                            c1629fArr3 = c1629fArr;
                        } else {
                            c1629fArr = c1629fArr3;
                            arrayList.add(c1629f2);
                            break;
                        }
                    }
                } else {
                    c1629fArr = c1629fArr3;
                }
                i17 = i18 + 1;
                str2 = str6;
                c1629fArr3 = c1629fArr;
            }
        }
        if (arrayList.isEmpty()) {
            c1630g = null;
        } else {
            c1630g = new C1630g(str2, arrayList);
        }
        L a5 = a();
        a5.f19393a = str3;
        a5.f19394b = str4;
        a5.f19395c = str;
        a5.f19396d = i12;
        a5.f19397e = i13;
        a5.f19398f = i9;
        a5.f19399g = i10;
        a5.f19400h = str5;
        a5.f19401i = cVar;
        a5.f19405n = c1630g;
        a5.f19409r = f9;
        return new M(a5);
    }

    public final boolean equals(Object obj) {
        int i9;
        if (this == obj) {
            return true;
        }
        if (obj != null && M.class == obj.getClass()) {
            M m9 = (M) obj;
            int i10 = this.Y;
            if ((i10 == 0 || (i9 = m9.Y) == 0 || i10 == i9) && this.f19428d == m9.f19428d && this.f19429e == m9.f19429e && this.f19430f == m9.f19430f && this.f19431g == m9.f19431g && this.f19436m == m9.f19436m && this.f19439p == m9.f19439p && this.f19440q == m9.f19440q && this.f19441r == m9.f19441r && this.f19443t == m9.f19443t && this.f19446w == m9.f19446w && this.f19448y == m9.f19448y && this.f19449z == m9.f19449z && this.f19420A == m9.f19420A && this.f19421B == m9.f19421B && this.f19422C == m9.f19422C && this.f19423D == m9.f19423D && this.f19424X == m9.f19424X && Float.compare(this.f19442s, m9.f19442s) == 0 && Float.compare(this.f19444u, m9.f19444u) == 0 && l4.y.a(this.f19425a, m9.f19425a) && l4.y.a(this.f19426b, m9.f19426b) && l4.y.a(this.f19433i, m9.f19433i) && l4.y.a(this.f19434k, m9.f19434k) && l4.y.a(this.f19435l, m9.f19435l) && l4.y.a(this.f19427c, m9.f19427c) && Arrays.equals(this.f19445v, m9.f19445v) && l4.y.a(this.j, m9.j) && l4.y.a(this.f19447x, m9.f19447x) && l4.y.a(this.f19438o, m9.f19438o) && b(m9)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int i9;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        int hashCode5;
        if (this.Y == 0) {
            int i10 = 0;
            String str = this.f19425a;
            if (str == null) {
                hashCode = 0;
            } else {
                hashCode = str.hashCode();
            }
            int i11 = (527 + hashCode) * 31;
            String str2 = this.f19426b;
            if (str2 != null) {
                i9 = str2.hashCode();
            } else {
                i9 = 0;
            }
            int i12 = (i11 + i9) * 31;
            String str3 = this.f19427c;
            if (str3 == null) {
                hashCode2 = 0;
            } else {
                hashCode2 = str3.hashCode();
            }
            int i13 = (((((((((i12 + hashCode2) * 31) + this.f19428d) * 31) + this.f19429e) * 31) + this.f19430f) * 31) + this.f19431g) * 31;
            String str4 = this.f19433i;
            if (str4 == null) {
                hashCode3 = 0;
            } else {
                hashCode3 = str4.hashCode();
            }
            int i14 = (i13 + hashCode3) * 31;
            D3.c cVar = this.j;
            if (cVar == null) {
                hashCode4 = 0;
            } else {
                hashCode4 = cVar.hashCode();
            }
            int i15 = (i14 + hashCode4) * 31;
            String str5 = this.f19434k;
            if (str5 == null) {
                hashCode5 = 0;
            } else {
                hashCode5 = str5.hashCode();
            }
            int i16 = (i15 + hashCode5) * 31;
            String str6 = this.f19435l;
            if (str6 != null) {
                i10 = str6.hashCode();
            }
            this.Y = ((((((((((((((((Float.floatToIntBits(this.f19444u) + ((((Float.floatToIntBits(this.f19442s) + ((((((((((i16 + i10) * 31) + this.f19436m) * 31) + ((int) this.f19439p)) * 31) + this.f19440q) * 31) + this.f19441r) * 31)) * 31) + this.f19443t) * 31)) * 31) + this.f19446w) * 31) + this.f19448y) * 31) + this.f19449z) * 31) + this.f19420A) * 31) + this.f19421B) * 31) + this.f19422C) * 31) + this.f19423D) * 31) + this.f19424X;
        }
        return this.Y;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Format(");
        sb.append(this.f19425a);
        sb.append(", ");
        sb.append(this.f19426b);
        sb.append(", ");
        sb.append(this.f19434k);
        sb.append(", ");
        sb.append(this.f19435l);
        sb.append(", ");
        sb.append(this.f19433i);
        sb.append(", ");
        sb.append(this.f19432h);
        sb.append(", ");
        sb.append(this.f19427c);
        sb.append(", [");
        sb.append(this.f19440q);
        sb.append(", ");
        sb.append(this.f19441r);
        sb.append(", ");
        sb.append(this.f19442s);
        sb.append("], [");
        sb.append(this.f19448y);
        sb.append(", ");
        return u0.z.g(sb, this.f19449z, "])");
    }
}
