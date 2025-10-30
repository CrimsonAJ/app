package F0;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.view.View;
import java.util.ArrayList;

/* renamed from: F0.o, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0111o extends Z {

    /* renamed from: s, reason: collision with root package name */
    public static TimeInterpolator f2177s;

    /* renamed from: g, reason: collision with root package name */
    public boolean f2178g;

    /* renamed from: h, reason: collision with root package name */
    public ArrayList f2179h;

    /* renamed from: i, reason: collision with root package name */
    public ArrayList f2180i;
    public ArrayList j;

    /* renamed from: k, reason: collision with root package name */
    public ArrayList f2181k;

    /* renamed from: l, reason: collision with root package name */
    public ArrayList f2182l;

    /* renamed from: m, reason: collision with root package name */
    public ArrayList f2183m;

    /* renamed from: n, reason: collision with root package name */
    public ArrayList f2184n;

    /* renamed from: o, reason: collision with root package name */
    public ArrayList f2185o;

    /* renamed from: p, reason: collision with root package name */
    public ArrayList f2186p;

    /* renamed from: q, reason: collision with root package name */
    public ArrayList f2187q;

    /* renamed from: r, reason: collision with root package name */
    public ArrayList f2188r;

    public static void h(ArrayList arrayList) {
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            ((r0) arrayList.get(size)).f2210a.animate().cancel();
        }
    }

    /* JADX WARN: Type inference failed for: r12v4, types: [F0.m, java.lang.Object] */
    @Override // F0.Z
    public final boolean a(r0 r0Var, r0 r0Var2, Y y9, Y y10) {
        int i9;
        int i10;
        int i11 = y9.f2058a;
        int i12 = y9.f2059b;
        if (r0Var2.p()) {
            int i13 = y9.f2058a;
            i10 = y9.f2059b;
            i9 = i13;
        } else {
            i9 = y10.f2058a;
            i10 = y10.f2059b;
        }
        if (r0Var == r0Var2) {
            return g(r0Var, i11, i12, i9, i10);
        }
        View view = r0Var.f2210a;
        float translationX = view.getTranslationX();
        float translationY = view.getTranslationY();
        float alpha = view.getAlpha();
        l(r0Var);
        view.setTranslationX(translationX);
        view.setTranslationY(translationY);
        view.setAlpha(alpha);
        l(r0Var2);
        float f9 = -((int) ((i9 - i11) - translationX));
        View view2 = r0Var2.f2210a;
        view2.setTranslationX(f9);
        view2.setTranslationY(-((int) ((i10 - i12) - translationY)));
        view2.setAlpha(0.0f);
        ArrayList arrayList = this.f2181k;
        ?? obj = new Object();
        obj.f2153a = r0Var;
        obj.f2154b = r0Var2;
        obj.f2155c = i11;
        obj.f2156d = i12;
        obj.f2157e = i9;
        obj.f2158f = i10;
        arrayList.add(obj);
        return true;
    }

    @Override // F0.Z
    public final void d(r0 r0Var) {
        View view = r0Var.f2210a;
        view.animate().cancel();
        ArrayList arrayList = this.j;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            if (((C0110n) arrayList.get(size)).f2159a == r0Var) {
                view.setTranslationY(0.0f);
                view.setTranslationX(0.0f);
                c(r0Var);
                arrayList.remove(size);
            }
        }
        j(this.f2181k, r0Var);
        if (this.f2179h.remove(r0Var)) {
            view.setAlpha(1.0f);
            c(r0Var);
        }
        if (this.f2180i.remove(r0Var)) {
            view.setAlpha(1.0f);
            c(r0Var);
        }
        ArrayList arrayList2 = this.f2184n;
        for (int size2 = arrayList2.size() - 1; size2 >= 0; size2--) {
            ArrayList arrayList3 = (ArrayList) arrayList2.get(size2);
            j(arrayList3, r0Var);
            if (arrayList3.isEmpty()) {
                arrayList2.remove(size2);
            }
        }
        ArrayList arrayList4 = this.f2183m;
        for (int size3 = arrayList4.size() - 1; size3 >= 0; size3--) {
            ArrayList arrayList5 = (ArrayList) arrayList4.get(size3);
            int size4 = arrayList5.size() - 1;
            while (true) {
                if (size4 < 0) {
                    break;
                }
                if (((C0110n) arrayList5.get(size4)).f2159a == r0Var) {
                    view.setTranslationY(0.0f);
                    view.setTranslationX(0.0f);
                    c(r0Var);
                    arrayList5.remove(size4);
                    if (arrayList5.isEmpty()) {
                        arrayList4.remove(size3);
                    }
                } else {
                    size4--;
                }
            }
        }
        ArrayList arrayList6 = this.f2182l;
        for (int size5 = arrayList6.size() - 1; size5 >= 0; size5--) {
            ArrayList arrayList7 = (ArrayList) arrayList6.get(size5);
            if (arrayList7.remove(r0Var)) {
                view.setAlpha(1.0f);
                c(r0Var);
                if (arrayList7.isEmpty()) {
                    arrayList6.remove(size5);
                }
            }
        }
        this.f2187q.remove(r0Var);
        this.f2185o.remove(r0Var);
        this.f2188r.remove(r0Var);
        this.f2186p.remove(r0Var);
        i();
    }

    @Override // F0.Z
    public final void e() {
        ArrayList arrayList = this.j;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            C0110n c0110n = (C0110n) arrayList.get(size);
            View view = c0110n.f2159a.f2210a;
            view.setTranslationY(0.0f);
            view.setTranslationX(0.0f);
            c(c0110n.f2159a);
            arrayList.remove(size);
        }
        ArrayList arrayList2 = this.f2179h;
        for (int size2 = arrayList2.size() - 1; size2 >= 0; size2--) {
            c((r0) arrayList2.get(size2));
            arrayList2.remove(size2);
        }
        ArrayList arrayList3 = this.f2180i;
        int size3 = arrayList3.size();
        while (true) {
            size3--;
            if (size3 < 0) {
                break;
            }
            r0 r0Var = (r0) arrayList3.get(size3);
            r0Var.f2210a.setAlpha(1.0f);
            c(r0Var);
            arrayList3.remove(size3);
        }
        ArrayList arrayList4 = this.f2181k;
        for (int size4 = arrayList4.size() - 1; size4 >= 0; size4--) {
            C0109m c0109m = (C0109m) arrayList4.get(size4);
            r0 r0Var2 = c0109m.f2153a;
            if (r0Var2 != null) {
                k(c0109m, r0Var2);
            }
            r0 r0Var3 = c0109m.f2154b;
            if (r0Var3 != null) {
                k(c0109m, r0Var3);
            }
        }
        arrayList4.clear();
        if (!f()) {
            return;
        }
        ArrayList arrayList5 = this.f2183m;
        for (int size5 = arrayList5.size() - 1; size5 >= 0; size5--) {
            ArrayList arrayList6 = (ArrayList) arrayList5.get(size5);
            for (int size6 = arrayList6.size() - 1; size6 >= 0; size6--) {
                C0110n c0110n2 = (C0110n) arrayList6.get(size6);
                View view2 = c0110n2.f2159a.f2210a;
                view2.setTranslationY(0.0f);
                view2.setTranslationX(0.0f);
                c(c0110n2.f2159a);
                arrayList6.remove(size6);
                if (arrayList6.isEmpty()) {
                    arrayList5.remove(arrayList6);
                }
            }
        }
        ArrayList arrayList7 = this.f2182l;
        for (int size7 = arrayList7.size() - 1; size7 >= 0; size7--) {
            ArrayList arrayList8 = (ArrayList) arrayList7.get(size7);
            for (int size8 = arrayList8.size() - 1; size8 >= 0; size8--) {
                r0 r0Var4 = (r0) arrayList8.get(size8);
                r0Var4.f2210a.setAlpha(1.0f);
                c(r0Var4);
                arrayList8.remove(size8);
                if (arrayList8.isEmpty()) {
                    arrayList7.remove(arrayList8);
                }
            }
        }
        ArrayList arrayList9 = this.f2184n;
        for (int size9 = arrayList9.size() - 1; size9 >= 0; size9--) {
            ArrayList arrayList10 = (ArrayList) arrayList9.get(size9);
            for (int size10 = arrayList10.size() - 1; size10 >= 0; size10--) {
                C0109m c0109m2 = (C0109m) arrayList10.get(size10);
                r0 r0Var5 = c0109m2.f2153a;
                if (r0Var5 != null) {
                    k(c0109m2, r0Var5);
                }
                r0 r0Var6 = c0109m2.f2154b;
                if (r0Var6 != null) {
                    k(c0109m2, r0Var6);
                }
                if (arrayList10.isEmpty()) {
                    arrayList9.remove(arrayList10);
                }
            }
        }
        h(this.f2187q);
        h(this.f2186p);
        h(this.f2185o);
        h(this.f2188r);
        ArrayList arrayList11 = this.f2061b;
        if (arrayList11.size() <= 0) {
            arrayList11.clear();
        } else {
            arrayList11.get(0).getClass();
            throw new ClassCastException();
        }
    }

    @Override // F0.Z
    public final boolean f() {
        if (this.f2180i.isEmpty() && this.f2181k.isEmpty() && this.j.isEmpty() && this.f2179h.isEmpty() && this.f2186p.isEmpty() && this.f2187q.isEmpty() && this.f2185o.isEmpty() && this.f2188r.isEmpty() && this.f2183m.isEmpty() && this.f2182l.isEmpty() && this.f2184n.isEmpty()) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Type inference failed for: r1v6, types: [java.lang.Object, F0.n] */
    public final boolean g(r0 r0Var, int i9, int i10, int i11, int i12) {
        View view = r0Var.f2210a;
        int translationX = i9 + ((int) view.getTranslationX());
        int translationY = i10 + ((int) r0Var.f2210a.getTranslationY());
        l(r0Var);
        int i13 = i11 - translationX;
        int i14 = i12 - translationY;
        if (i13 == 0 && i14 == 0) {
            c(r0Var);
            return false;
        }
        if (i13 != 0) {
            view.setTranslationX(-i13);
        }
        if (i14 != 0) {
            view.setTranslationY(-i14);
        }
        ArrayList arrayList = this.j;
        ?? obj = new Object();
        obj.f2159a = r0Var;
        obj.f2160b = translationX;
        obj.f2161c = translationY;
        obj.f2162d = i11;
        obj.f2163e = i12;
        arrayList.add(obj);
        return true;
    }

    public final void i() {
        if (!f()) {
            ArrayList arrayList = this.f2061b;
            if (arrayList.size() <= 0) {
                arrayList.clear();
            } else {
                arrayList.get(0).getClass();
                throw new ClassCastException();
            }
        }
    }

    public final void j(ArrayList arrayList, r0 r0Var) {
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            C0109m c0109m = (C0109m) arrayList.get(size);
            if (k(c0109m, r0Var) && c0109m.f2153a == null && c0109m.f2154b == null) {
                arrayList.remove(c0109m);
            }
        }
    }

    public final boolean k(C0109m c0109m, r0 r0Var) {
        if (c0109m.f2154b == r0Var) {
            c0109m.f2154b = null;
        } else if (c0109m.f2153a == r0Var) {
            c0109m.f2153a = null;
        } else {
            return false;
        }
        r0Var.f2210a.setAlpha(1.0f);
        View view = r0Var.f2210a;
        view.setTranslationX(0.0f);
        view.setTranslationY(0.0f);
        c(r0Var);
        return true;
    }

    public final void l(r0 r0Var) {
        if (f2177s == null) {
            f2177s = new ValueAnimator().getInterpolator();
        }
        r0Var.f2210a.animate().setInterpolator(f2177s);
        d(r0Var);
    }
}
