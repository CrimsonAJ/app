package F0;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import b5.G1;
import h.AbstractC1260a;
import i8.C1425o;
import java.util.ArrayList;
import java.util.WeakHashMap;
import o1.C1671f;
import p.AbstractC1800i0;
import p.C1821t;

/* renamed from: F0.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0096b {

    /* renamed from: a, reason: collision with root package name */
    public int f2070a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f2071b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f2072c;

    /* renamed from: d, reason: collision with root package name */
    public Object f2073d;

    /* renamed from: e, reason: collision with root package name */
    public Object f2074e;

    /* renamed from: f, reason: collision with root package name */
    public Object f2075f;

    public C0096b(View view) {
        this.f2070a = -1;
        this.f2071b = view;
        this.f2072c = C1821t.a();
    }

    public void a() {
        View view = (View) this.f2071b;
        Drawable background = view.getBackground();
        if (background != null) {
            if (((C1425o) this.f2073d) != null) {
                if (((C1425o) this.f2075f) == null) {
                    this.f2075f = new Object();
                }
                C1425o c1425o = (C1425o) this.f2075f;
                c1425o.f19128c = null;
                c1425o.f19127b = false;
                c1425o.f19129d = null;
                c1425o.f19126a = false;
                WeakHashMap weakHashMap = P.Q.f5546a;
                ColorStateList c3 = P.H.c(view);
                if (c3 != null) {
                    c1425o.f19127b = true;
                    c1425o.f19128c = c3;
                }
                PorterDuff.Mode d9 = P.H.d(view);
                if (d9 != null) {
                    c1425o.f19126a = true;
                    c1425o.f19129d = d9;
                }
                if (c1425o.f19127b || c1425o.f19126a) {
                    C1821t.e(background, c1425o, view.getDrawableState());
                    return;
                }
            }
            C1425o c1425o2 = (C1425o) this.f2074e;
            if (c1425o2 != null) {
                C1821t.e(background, c1425o2, view.getDrawableState());
                return;
            }
            C1425o c1425o3 = (C1425o) this.f2073d;
            if (c1425o3 != null) {
                C1821t.e(background, c1425o3, view.getDrawableState());
            }
        }
    }

    public boolean b(int i9) {
        ArrayList arrayList = (ArrayList) this.f2073d;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            C0094a c0094a = (C0094a) arrayList.get(i10);
            int i11 = c0094a.f2066a;
            if (i11 == 8) {
                if (g(c0094a.f2069d, i10 + 1) == i9) {
                    return true;
                }
            } else {
                if (i11 == 1) {
                    int i12 = c0094a.f2067b;
                    int i13 = c0094a.f2069d + i12;
                    while (i12 < i13) {
                        if (g(i12, i10 + 1) == i9) {
                            return true;
                        }
                        i12++;
                    }
                } else {
                    continue;
                }
            }
        }
        return false;
    }

    public void c() {
        ArrayList arrayList = (ArrayList) this.f2073d;
        int size = arrayList.size();
        for (int i9 = 0; i9 < size; i9++) {
            ((P) this.f2074e).a((C0094a) arrayList.get(i9));
        }
        q(arrayList);
        this.f2070a = 0;
    }

    public void d() {
        c();
        ArrayList arrayList = (ArrayList) this.f2072c;
        int size = arrayList.size();
        for (int i9 = 0; i9 < size; i9++) {
            C0094a c0094a = (C0094a) arrayList.get(i9);
            int i10 = c0094a.f2066a;
            P p9 = (P) this.f2074e;
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 != 4) {
                        if (i10 == 8) {
                            p9.a(c0094a);
                            p9.e(c0094a.f2067b, c0094a.f2069d);
                        }
                    } else {
                        p9.a(c0094a);
                        p9.c(c0094a.f2067b, c0094a.f2069d, c0094a.f2068c);
                    }
                } else {
                    p9.a(c0094a);
                    int i11 = c0094a.f2067b;
                    int i12 = c0094a.f2069d;
                    RecyclerView recyclerView = p9.f2053a;
                    recyclerView.T(i11, i12, true);
                    recyclerView.f10253I0 = true;
                    recyclerView.f10250F0.f2166c += i12;
                }
            } else {
                p9.a(c0094a);
                p9.d(c0094a.f2067b, c0094a.f2069d);
            }
        }
        q(arrayList);
        this.f2070a = 0;
    }

    public void e(C0094a c0094a) {
        int i9;
        O.c cVar;
        int i10 = c0094a.f2066a;
        if (i10 != 1 && i10 != 8) {
            int u9 = u(c0094a.f2067b, i10);
            int i11 = c0094a.f2067b;
            int i12 = c0094a.f2066a;
            if (i12 != 2) {
                if (i12 == 4) {
                    i9 = 1;
                } else {
                    throw new IllegalArgumentException("op should be remove or update." + c0094a);
                }
            } else {
                i9 = 0;
            }
            int i13 = 1;
            int i14 = 1;
            while (true) {
                int i15 = c0094a.f2069d;
                cVar = (O.c) this.f2071b;
                if (i13 >= i15) {
                    break;
                }
                int u10 = u((i9 * i13) + c0094a.f2067b, c0094a.f2066a);
                int i16 = c0094a.f2066a;
                if (i16 == 2 ? u10 == u9 : !(i16 != 4 || u10 != u9 + 1)) {
                    i14++;
                } else {
                    C0094a l9 = l(c0094a.f2068c, i16, u9, i14);
                    f(l9, i11);
                    l9.f2068c = null;
                    cVar.c(l9);
                    if (c0094a.f2066a == 4) {
                        i11 += i14;
                    }
                    i14 = 1;
                    u9 = u10;
                }
                i13++;
            }
            Object obj = c0094a.f2068c;
            c0094a.f2068c = null;
            cVar.c(c0094a);
            if (i14 > 0) {
                C0094a l10 = l(obj, c0094a.f2066a, u9, i14);
                f(l10, i11);
                l10.f2068c = null;
                cVar.c(l10);
                return;
            }
            return;
        }
        throw new IllegalArgumentException("should not dispatch add or move for pre layout");
    }

    public void f(C0094a c0094a, int i9) {
        P p9 = (P) this.f2074e;
        p9.a(c0094a);
        int i10 = c0094a.f2066a;
        if (i10 != 2) {
            if (i10 == 4) {
                p9.c(i9, c0094a.f2069d, c0094a.f2068c);
                return;
            }
            throw new IllegalArgumentException("only remove and update ops can be dispatched in first pass");
        }
        int i11 = c0094a.f2069d;
        RecyclerView recyclerView = p9.f2053a;
        recyclerView.T(i9, i11, true);
        recyclerView.f10253I0 = true;
        recyclerView.f10250F0.f2166c += i11;
    }

    public int g(int i9, int i10) {
        ArrayList arrayList = (ArrayList) this.f2073d;
        int size = arrayList.size();
        while (i10 < size) {
            C0094a c0094a = (C0094a) arrayList.get(i10);
            int i11 = c0094a.f2066a;
            if (i11 == 8) {
                int i12 = c0094a.f2067b;
                if (i12 == i9) {
                    i9 = c0094a.f2069d;
                } else {
                    if (i12 < i9) {
                        i9--;
                    }
                    if (c0094a.f2069d <= i9) {
                        i9++;
                    }
                }
            } else {
                int i13 = c0094a.f2067b;
                if (i13 > i9) {
                    continue;
                } else if (i11 == 2) {
                    int i14 = c0094a.f2069d;
                    if (i9 < i13 + i14) {
                        return -1;
                    }
                    i9 -= i14;
                } else if (i11 == 1) {
                    i9 += c0094a.f2069d;
                }
            }
            i10++;
        }
        return i9;
    }

    public ColorStateList h() {
        C1425o c1425o = (C1425o) this.f2074e;
        if (c1425o != null) {
            return (ColorStateList) c1425o.f19128c;
        }
        return null;
    }

    public PorterDuff.Mode i() {
        C1425o c1425o = (C1425o) this.f2074e;
        if (c1425o != null) {
            return (PorterDuff.Mode) c1425o.f19129d;
        }
        return null;
    }

    public boolean j() {
        if (((ArrayList) this.f2072c).size() > 0) {
            return true;
        }
        return false;
    }

    public void k(AttributeSet attributeSet, int i9) {
        ColorStateList i10;
        View view = (View) this.f2071b;
        Context context = view.getContext();
        int[] iArr = AbstractC1260a.f17829z;
        G1 w7 = G1.w(context, attributeSet, iArr, i9);
        TypedArray typedArray = (TypedArray) w7.f10718c;
        View view2 = (View) this.f2071b;
        P.Q.l(view2, view2.getContext(), iArr, attributeSet, (TypedArray) w7.f10718c, i9);
        try {
            if (typedArray.hasValue(0)) {
                this.f2070a = typedArray.getResourceId(0, -1);
                C1821t c1821t = (C1821t) this.f2072c;
                Context context2 = view.getContext();
                int i11 = this.f2070a;
                synchronized (c1821t) {
                    i10 = c1821t.f22079a.i(context2, i11);
                }
                if (i10 != null) {
                    r(i10);
                }
            }
            if (typedArray.hasValue(1)) {
                P.H.i(view, w7.n(1));
            }
            if (typedArray.hasValue(2)) {
                P.H.j(view, AbstractC1800i0.c(typedArray.getInt(2, -1), null));
            }
            w7.y();
        } catch (Throwable th) {
            w7.y();
            throw th;
        }
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, F0.a] */
    public C0094a l(Object obj, int i9, int i10, int i11) {
        C0094a c0094a = (C0094a) ((O.c) this.f2071b).a();
        if (c0094a == null) {
            ?? obj2 = new Object();
            obj2.f2066a = i9;
            obj2.f2067b = i10;
            obj2.f2069d = i11;
            obj2.f2068c = obj;
            return obj2;
        }
        c0094a.f2066a = i9;
        c0094a.f2067b = i10;
        c0094a.f2069d = i11;
        c0094a.f2068c = obj;
        return c0094a;
    }

    public void m() {
        this.f2070a = -1;
        r(null);
        a();
    }

    public void n(int i9) {
        ColorStateList colorStateList;
        this.f2070a = i9;
        C1821t c1821t = (C1821t) this.f2072c;
        if (c1821t != null) {
            Context context = ((View) this.f2071b).getContext();
            synchronized (c1821t) {
                colorStateList = c1821t.f22079a.i(context, i9);
            }
        } else {
            colorStateList = null;
        }
        r(colorStateList);
        a();
    }

    public void o(C0094a c0094a) {
        ((ArrayList) this.f2073d).add(c0094a);
        int i9 = c0094a.f2066a;
        P p9 = (P) this.f2074e;
        if (i9 != 1) {
            if (i9 != 2) {
                if (i9 != 4) {
                    if (i9 == 8) {
                        p9.e(c0094a.f2067b, c0094a.f2069d);
                        return;
                    } else {
                        throw new IllegalArgumentException("Unknown update op type for " + c0094a);
                    }
                }
                p9.c(c0094a.f2067b, c0094a.f2069d, c0094a.f2068c);
                return;
            }
            int i10 = c0094a.f2067b;
            int i11 = c0094a.f2069d;
            RecyclerView recyclerView = p9.f2053a;
            recyclerView.T(i10, i11, false);
            recyclerView.f10253I0 = true;
            return;
        }
        p9.d(c0094a.f2067b, c0094a.f2069d);
    }

    /* JADX WARN: Removed duplicated region for block: B:119:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x00aa A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:130:0x000d A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0135 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0121 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void p() {
        /*
            Method dump skipped, instructions count: 690
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: F0.C0096b.p():void");
    }

    public void q(ArrayList arrayList) {
        int size = arrayList.size();
        for (int i9 = 0; i9 < size; i9++) {
            C0094a c0094a = (C0094a) arrayList.get(i9);
            c0094a.f2068c = null;
            ((O.c) this.f2071b).c(c0094a);
        }
        arrayList.clear();
    }

    public void r(ColorStateList colorStateList) {
        if (colorStateList != null) {
            if (((C1425o) this.f2073d) == null) {
                this.f2073d = new Object();
            }
            C1425o c1425o = (C1425o) this.f2073d;
            c1425o.f19128c = colorStateList;
            c1425o.f19127b = true;
        } else {
            this.f2073d = null;
        }
        a();
    }

    public void s(ColorStateList colorStateList) {
        if (((C1425o) this.f2074e) == null) {
            this.f2074e = new Object();
        }
        C1425o c1425o = (C1425o) this.f2074e;
        c1425o.f19128c = colorStateList;
        c1425o.f19127b = true;
        a();
    }

    public void t(PorterDuff.Mode mode) {
        if (((C1425o) this.f2074e) == null) {
            this.f2074e = new Object();
        }
        C1425o c1425o = (C1425o) this.f2074e;
        c1425o.f19129d = mode;
        c1425o.f19126a = true;
        a();
    }

    public int u(int i9, int i10) {
        int i11;
        int i12;
        ArrayList arrayList = (ArrayList) this.f2073d;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            C0094a c0094a = (C0094a) arrayList.get(size);
            int i13 = c0094a.f2066a;
            if (i13 == 8) {
                int i14 = c0094a.f2067b;
                int i15 = c0094a.f2069d;
                if (i14 < i15) {
                    i12 = i14;
                    i11 = i15;
                } else {
                    i11 = i14;
                    i12 = i15;
                }
                if (i9 >= i12 && i9 <= i11) {
                    if (i12 == i14) {
                        if (i10 == 1) {
                            c0094a.f2069d = i15 + 1;
                        } else if (i10 == 2) {
                            c0094a.f2069d = i15 - 1;
                        }
                        i9++;
                    } else {
                        if (i10 == 1) {
                            c0094a.f2067b = i14 + 1;
                        } else if (i10 == 2) {
                            c0094a.f2067b = i14 - 1;
                        }
                        i9--;
                    }
                } else if (i9 < i14) {
                    if (i10 == 1) {
                        c0094a.f2067b = i14 + 1;
                        c0094a.f2069d = i15 + 1;
                    } else if (i10 == 2) {
                        c0094a.f2067b = i14 - 1;
                        c0094a.f2069d = i15 - 1;
                    }
                }
            } else {
                int i16 = c0094a.f2067b;
                if (i16 <= i9) {
                    if (i13 == 1) {
                        i9 -= c0094a.f2069d;
                    } else if (i13 == 2) {
                        i9 += c0094a.f2069d;
                    }
                } else if (i10 == 1) {
                    c0094a.f2067b = i16 + 1;
                } else if (i10 == 2) {
                    c0094a.f2067b = i16 - 1;
                }
            }
        }
        for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
            C0094a c0094a2 = (C0094a) arrayList.get(size2);
            int i17 = c0094a2.f2066a;
            O.c cVar = (O.c) this.f2071b;
            if (i17 == 8) {
                int i18 = c0094a2.f2069d;
                if (i18 == c0094a2.f2067b || i18 < 0) {
                    arrayList.remove(size2);
                    c0094a2.f2068c = null;
                    cVar.c(c0094a2);
                }
            } else if (c0094a2.f2069d <= 0) {
                arrayList.remove(size2);
                c0094a2.f2068c = null;
                cVar.c(c0094a2);
            }
        }
        return i9;
    }

    public C0096b(P p9) {
        this.f2071b = new O.c(30);
        this.f2072c = new ArrayList();
        this.f2073d = new ArrayList();
        this.f2070a = 0;
        this.f2074e = p9;
        this.f2075f = new C1671f(4, this);
    }

    public C0096b(int[] iArr, N3.n0[] n0VarArr, int[] iArr2, int[][][] iArr3, N3.n0 n0Var) {
        this.f2071b = iArr;
        this.f2072c = n0VarArr;
        this.f2074e = iArr3;
        this.f2073d = iArr2;
        this.f2075f = n0Var;
        this.f2070a = iArr.length;
    }
}
