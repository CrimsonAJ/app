package G5;

import B6.u0;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.internal.measurement.AbstractC1002u1;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.sidesheet.SideSheetBehavior;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* loaded from: classes.dex */
public final class d extends AbstractC1002u1 {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f2871g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ B.c f2872h;

    public /* synthetic */ d(B.c cVar, int i9) {
        this.f2871g = i9;
        this.f2872h = cVar;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC1002u1
    public int G(View view) {
        switch (this.f2871g) {
            case 0:
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) this.f2872h;
                return sideSheetBehavior.f16101l + sideSheetBehavior.f16104o;
            default:
                return super.G(view);
        }
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC1002u1
    public int H() {
        switch (this.f2871g) {
            case 1:
                BottomSheetBehavior bottomSheetBehavior = (BottomSheetBehavior) this.f2872h;
                if (bottomSheetBehavior.f15846I) {
                    return bottomSheetBehavior.f15856T;
                }
                return bottomSheetBehavior.f15844G;
            default:
                return super.H();
        }
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC1002u1
    public final void P(int i9) {
        switch (this.f2871g) {
            case 0:
                if (i9 == 1) {
                    SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) this.f2872h;
                    if (sideSheetBehavior.f16097g) {
                        sideSheetBehavior.x(1);
                        return;
                    }
                    return;
                }
                return;
            default:
                if (i9 == 1) {
                    BottomSheetBehavior bottomSheetBehavior = (BottomSheetBehavior) this.f2872h;
                    if (bottomSheetBehavior.K) {
                        bottomSheetBehavior.J(1);
                        return;
                    }
                    return;
                }
                return;
        }
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC1002u1
    public final void Q(View view, int i9, int i10) {
        View view2;
        ViewGroup.MarginLayoutParams marginLayoutParams;
        switch (this.f2871g) {
            case 0:
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) this.f2872h;
                WeakReference weakReference = sideSheetBehavior.f16106q;
                if (weakReference != null) {
                    view2 = (View) weakReference.get();
                } else {
                    view2 = null;
                }
                if (view2 != null && (marginLayoutParams = (ViewGroup.MarginLayoutParams) view2.getLayoutParams()) != null) {
                    sideSheetBehavior.f16091a.X(marginLayoutParams, view.getLeft(), view.getRight());
                    view2.setLayoutParams(marginLayoutParams);
                }
                LinkedHashSet linkedHashSet = sideSheetBehavior.f16111v;
                if (!linkedHashSet.isEmpty()) {
                    sideSheetBehavior.f16091a.d(i9);
                    Iterator it = linkedHashSet.iterator();
                    if (it.hasNext()) {
                        throw A0.a.h(it);
                    }
                    return;
                }
                return;
            default:
                ((BottomSheetBehavior) this.f2872h).z(i10);
                return;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0023, code lost:
    
        if (r7 > r4.f15842E) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0073, code lost:
    
        if (java.lang.Math.abs(r6.getTop() - r4.D()) < java.lang.Math.abs(r6.getTop() - r4.f15842E)) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00be, code lost:
    
        if (java.lang.Math.abs(r7 - r4.f15841D) < java.lang.Math.abs(r7 - r4.f15844G)) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0113, code lost:
    
        if (r0.f16091a.G(r6) == false) goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0143, code lost:
    
        if (java.lang.Math.abs(r7 - r0.f16091a.r()) < java.lang.Math.abs(r7 - r0.f16091a.s())) goto L73;
     */
    @Override // com.google.android.gms.internal.measurement.AbstractC1002u1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void R(android.view.View r6, float r7, float r8) {
        /*
            Method dump skipped, instructions count: 340
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: G5.d.R(android.view.View, float, float):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x002e, code lost:
    
        if (r6.canScrollVertically(-1) != false) goto L27;
     */
    @Override // com.google.android.gms.internal.measurement.AbstractC1002u1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean h0(android.view.View r5, int r6) {
        /*
            r4 = this;
            int r0 = r4.f2871g
            switch(r0) {
                case 0: goto L41;
                default: goto L5;
            }
        L5:
            B.c r0 = r4.f2872h
            com.google.android.material.bottomsheet.BottomSheetBehavior r0 = (com.google.android.material.bottomsheet.BottomSheetBehavior) r0
            int r1 = r0.f15848L
            r2 = 1
            if (r1 != r2) goto Lf
            goto L3f
        Lf:
            boolean r3 = r0.f15865b0
            if (r3 == 0) goto L14
            goto L3f
        L14:
            r3 = 3
            if (r1 != r3) goto L31
            int r1 = r0.f15861Z
            if (r1 != r6) goto L31
            java.lang.ref.WeakReference r6 = r0.f15858V
            if (r6 == 0) goto L26
            java.lang.Object r6 = r6.get()
            android.view.View r6 = (android.view.View) r6
            goto L27
        L26:
            r6 = 0
        L27:
            if (r6 == 0) goto L31
            r1 = -1
            boolean r6 = r6.canScrollVertically(r1)
            if (r6 == 0) goto L31
            goto L3f
        L31:
            java.lang.System.currentTimeMillis()
            java.lang.ref.WeakReference r6 = r0.f15857U
            if (r6 == 0) goto L3f
            java.lang.Object r6 = r6.get()
            if (r6 != r5) goto L3f
            goto L40
        L3f:
            r2 = 0
        L40:
            return r2
        L41:
            B.c r6 = r4.f2872h
            com.google.android.material.sidesheet.SideSheetBehavior r6 = (com.google.android.material.sidesheet.SideSheetBehavior) r6
            int r0 = r6.f16098h
            r1 = 0
            r2 = 1
            if (r0 != r2) goto L4c
            goto L57
        L4c:
            java.lang.ref.WeakReference r6 = r6.f16105p
            if (r6 == 0) goto L57
            java.lang.Object r6 = r6.get()
            if (r6 != r5) goto L57
            r1 = r2
        L57:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: G5.d.h0(android.view.View, int):boolean");
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC1002u1
    public final int i(View view, int i9) {
        switch (this.f2871g) {
            case 0:
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) this.f2872h;
                return u0.k(i9, sideSheetBehavior.f16091a.u(), sideSheetBehavior.f16091a.t());
            default:
                return view.getLeft();
        }
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC1002u1
    public final int j(View view, int i9) {
        switch (this.f2871g) {
            case 0:
                return view.getTop();
            default:
                return u0.k(i9, ((BottomSheetBehavior) this.f2872h).D(), H());
        }
    }
}
