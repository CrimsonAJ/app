package F0;

import P.C0301b;
import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.internal.measurement.Y1;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.Set;

/* loaded from: classes.dex */
public final class h0 {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f2116a;

    /* renamed from: b, reason: collision with root package name */
    public ArrayList f2117b;

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f2118c;

    /* renamed from: d, reason: collision with root package name */
    public final List f2119d;

    /* renamed from: e, reason: collision with root package name */
    public int f2120e;

    /* renamed from: f, reason: collision with root package name */
    public int f2121f;

    /* renamed from: g, reason: collision with root package name */
    public g0 f2122g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ RecyclerView f2123h;

    public h0(RecyclerView recyclerView) {
        this.f2123h = recyclerView;
        ArrayList arrayList = new ArrayList();
        this.f2116a = arrayList;
        this.f2117b = null;
        this.f2118c = new ArrayList();
        this.f2119d = Collections.unmodifiableList(arrayList);
        this.f2120e = 2;
        this.f2121f = 2;
    }

    public final void a(r0 r0Var, boolean z9) {
        C0301b c0301b;
        RecyclerView.l(r0Var);
        RecyclerView recyclerView = this.f2123h;
        t0 t0Var = recyclerView.f10257M0;
        View view = r0Var.f2210a;
        if (t0Var != null) {
            s0 s0Var = t0Var.f2240e;
            if (s0Var != null) {
                c0301b = (C0301b) s0Var.f2233e.remove(view);
            } else {
                c0301b = null;
            }
            P.Q.m(view, c0301b);
        }
        if (z9) {
            ArrayList arrayList = recyclerView.f10293o;
            if (arrayList.size() <= 0) {
                S s9 = recyclerView.f10289m;
                if (s9 != null) {
                    s9.l(r0Var);
                }
                if (recyclerView.f10250F0 != null) {
                    recyclerView.f10278g.F(r0Var);
                }
                if (RecyclerView.f10233b1) {
                    Log.d("RecyclerView", "dispatchViewRecycled: " + r0Var);
                }
            } else {
                arrayList.get(0).getClass();
                throw new ClassCastException();
            }
        }
        r0Var.f2227s = null;
        r0Var.f2226r = null;
        g0 c3 = c();
        c3.getClass();
        int i9 = r0Var.f2215f;
        ArrayList arrayList2 = c3.a(i9).f2102a;
        if (((f0) c3.f2110a.get(i9)).f2103b <= arrayList2.size()) {
            Y1.c(view);
        } else {
            if (RecyclerView.f10232a1 && arrayList2.contains(r0Var)) {
                throw new IllegalArgumentException("this scrap item already exists");
            }
            r0Var.n();
            arrayList2.add(r0Var);
        }
    }

    public final int b(int i9) {
        RecyclerView recyclerView = this.f2123h;
        if (i9 >= 0 && i9 < recyclerView.f10250F0.b()) {
            if (!recyclerView.f10250F0.f2170g) {
                return i9;
            }
            return recyclerView.f10275e.g(i9, 0);
        }
        StringBuilder p9 = A0.a.p("invalid position ", i9, ". State item count is ");
        p9.append(recyclerView.f10250F0.b());
        p9.append(recyclerView.C());
        throw new IndexOutOfBoundsException(p9.toString());
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, F0.g0] */
    public final g0 c() {
        if (this.f2122g == null) {
            ?? obj = new Object();
            obj.f2110a = new SparseArray();
            obj.f2111b = 0;
            obj.f2112c = Collections.newSetFromMap(new IdentityHashMap());
            this.f2122g = obj;
            d();
        }
        return this.f2122g;
    }

    public final void d() {
        RecyclerView recyclerView;
        S s9;
        g0 g0Var = this.f2122g;
        if (g0Var != null && (s9 = (recyclerView = this.f2123h).f10289m) != null && recyclerView.f10300s) {
            g0Var.f2112c.add(s9);
        }
    }

    public final void e(S s9, boolean z9) {
        g0 g0Var = this.f2122g;
        if (g0Var != null) {
            Set set = g0Var.f2112c;
            set.remove(s9);
            if (set.size() == 0 && !z9) {
                int i9 = 0;
                while (true) {
                    SparseArray sparseArray = g0Var.f2110a;
                    if (i9 < sparseArray.size()) {
                        ArrayList arrayList = ((f0) sparseArray.get(sparseArray.keyAt(i9))).f2102a;
                        for (int i10 = 0; i10 < arrayList.size(); i10++) {
                            Y1.c(((r0) arrayList.get(i10)).f2210a);
                        }
                        i9++;
                    } else {
                        return;
                    }
                }
            }
        }
    }

    public final void f() {
        ArrayList arrayList = this.f2118c;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            g(size);
        }
        arrayList.clear();
        if (RecyclerView.f10237f1) {
            C0120y c0120y = this.f2123h.f10249E0;
            int[] iArr = (int[]) c0120y.f2293e;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
            c0120y.f2292d = 0;
        }
    }

    public final void g(int i9) {
        if (RecyclerView.f10233b1) {
            Log.d("RecyclerView", "Recycling cached view at index " + i9);
        }
        ArrayList arrayList = this.f2118c;
        r0 r0Var = (r0) arrayList.get(i9);
        if (RecyclerView.f10233b1) {
            Log.d("RecyclerView", "CachedViewHolder to be recycled: " + r0Var);
        }
        a(r0Var, true);
        arrayList.remove(i9);
    }

    public final void h(View view) {
        r0 N8 = RecyclerView.N(view);
        boolean k5 = N8.k();
        RecyclerView recyclerView = this.f2123h;
        if (k5) {
            recyclerView.removeDetachedView(view, false);
        }
        if (N8.j()) {
            N8.f2222n.l(N8);
        } else if (N8.q()) {
            N8.j &= -33;
        }
        i(N8);
        if (recyclerView.f10292n0 != null && !N8.h()) {
            recyclerView.f10292n0.d(N8);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:73:0x00e7, code lost:
    
        r5 = r5 - 1;
     */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00fb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void i(F0.r0 r13) {
        /*
            Method dump skipped, instructions count: 356
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: F0.h0.i(F0.r0):void");
    }

    public final void j(View view) {
        boolean z9;
        Z z10;
        r0 N8 = RecyclerView.N(view);
        if ((N8.j & 12) != 0) {
            z9 = true;
        } else {
            z9 = false;
        }
        RecyclerView recyclerView = this.f2123h;
        if (!z9 && N8.l() && (z10 = recyclerView.f10292n0) != null) {
            C0111o c0111o = (C0111o) z10;
            if (N8.d().isEmpty() && c0111o.f2178g && !N8.g()) {
                if (this.f2117b == null) {
                    this.f2117b = new ArrayList();
                }
                N8.f2222n = this;
                N8.f2223o = true;
                this.f2117b.add(N8);
                return;
            }
        }
        if (N8.g() && !N8.i() && !recyclerView.f10289m.f2056b) {
            throw new IllegalArgumentException(A0.a.j(recyclerView, new StringBuilder("Called scrap view with an invalid view. Invalid views cannot be reused from scrap, they should rebound from recycler pool.")));
        }
        N8.f2222n = this;
        N8.f2223o = false;
        this.f2116a.add(N8);
    }

    /* JADX WARN: Code restructure failed: missing block: B:212:0x049e, code lost:
    
        if (r11.g() == false) goto L261;
     */
    /* JADX WARN: Code restructure failed: missing block: B:225:0x04eb, code lost:
    
        if ((r14 + r12) >= r30) goto L261;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:194:0x0649  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x0669 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:201:0x0653  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:241:0x0547  */
    /* JADX WARN: Removed duplicated region for block: B:255:0x05ad  */
    /* JADX WARN: Removed duplicated region for block: B:263:0x05cc  */
    /* JADX WARN: Removed duplicated region for block: B:266:0x05e3  */
    /* JADX WARN: Removed duplicated region for block: B:273:0x05fc  */
    /* JADX WARN: Removed duplicated region for block: B:296:0x0640  */
    /* JADX WARN: Removed duplicated region for block: B:298:0x063b  */
    /* JADX WARN: Removed duplicated region for block: B:332:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:333:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:367:0x0082  */
    /* JADX WARN: Type inference failed for: r2v49, types: [F0.Y, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final F0.r0 k(long r30, int r32) {
        /*
            Method dump skipped, instructions count: 1698
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: F0.h0.k(long, int):F0.r0");
    }

    public final void l(r0 r0Var) {
        if (r0Var.f2223o) {
            this.f2117b.remove(r0Var);
        } else {
            this.f2116a.remove(r0Var);
        }
        r0Var.f2222n = null;
        r0Var.f2223o = false;
        r0Var.j &= -33;
    }

    public final void m() {
        int i9;
        androidx.recyclerview.widget.a aVar = this.f2123h.f10291n;
        if (aVar != null) {
            i9 = aVar.j;
        } else {
            i9 = 0;
        }
        this.f2121f = this.f2120e + i9;
        ArrayList arrayList = this.f2118c;
        for (int size = arrayList.size() - 1; size >= 0 && arrayList.size() > this.f2121f; size--) {
            g(size);
        }
    }
}
