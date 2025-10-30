package j5;

import I5.j;
import P.Q;
import android.view.View;
import android.view.ViewParent;
import com.google.android.gms.internal.measurement.AbstractC1002u1;
import com.google.android.material.behavior.SwipeDismissBehavior;
import java.util.WeakHashMap;
import l1.C1535g;
import s4.i;

/* renamed from: j5.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1475a extends AbstractC1002u1 {

    /* renamed from: g, reason: collision with root package name */
    public int f19778g;

    /* renamed from: h, reason: collision with root package name */
    public int f19779h = -1;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ SwipeDismissBehavior f19780i;

    public C1475a(SwipeDismissBehavior swipeDismissBehavior) {
        this.f19780i = swipeDismissBehavior;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC1002u1
    public final int G(View view) {
        return view.getWidth();
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC1002u1
    public final void O(View view, int i9) {
        this.f19779h = i9;
        this.f19778g = view.getLeft();
        ViewParent parent = view.getParent();
        if (parent != null) {
            SwipeDismissBehavior swipeDismissBehavior = this.f19780i;
            swipeDismissBehavior.f15833d = true;
            parent.requestDisallowInterceptTouchEvent(true);
            swipeDismissBehavior.f15833d = false;
        }
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC1002u1
    public final void P(int i9) {
        i iVar = this.f19780i.f15831b;
        if (iVar != null) {
            j jVar = (j) iVar.f22734a;
            if (i9 != 0) {
                if (i9 == 1 || i9 == 2) {
                    C1535g.r().y(jVar.f3572u);
                    return;
                }
                return;
            }
            C1535g.r().E(jVar.f3572u);
        }
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC1002u1
    public final void Q(View view, int i9, int i10) {
        float width = view.getWidth();
        SwipeDismissBehavior swipeDismissBehavior = this.f19780i;
        float f9 = width * swipeDismissBehavior.f15835f;
        float width2 = view.getWidth() * swipeDismissBehavior.f15836g;
        float abs = Math.abs(i9 - this.f19778g);
        if (abs <= f9) {
            view.setAlpha(1.0f);
        } else if (abs >= width2) {
            view.setAlpha(0.0f);
        } else {
            view.setAlpha(Math.min(Math.max(0.0f, 1.0f - ((abs - f9) / (width2 - f9))), 1.0f));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x0050, code lost:
    
        if (java.lang.Math.abs(r9.getLeft() - r8.f19778g) >= java.lang.Math.round(r9.getWidth() * 0.5f)) goto L27;
     */
    @Override // com.google.android.gms.internal.measurement.AbstractC1002u1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void R(android.view.View r9, float r10, float r11) {
        /*
            r8 = this;
            r11 = -1
            r8.f19779h = r11
            int r11 = r9.getWidth()
            r0 = 0
            int r1 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            com.google.android.material.behavior.SwipeDismissBehavior r2 = r8.f19780i
            r3 = 1
            r4 = 0
            if (r1 == 0) goto L39
            java.util.WeakHashMap r5 = P.Q.f5546a
            int r5 = r9.getLayoutDirection()
            if (r5 != r3) goto L1a
            r5 = r3
            goto L1b
        L1a:
            r5 = r4
        L1b:
            int r6 = r2.f15834e
            r7 = 2
            if (r6 != r7) goto L21
            goto L52
        L21:
            if (r6 != 0) goto L2d
            if (r5 == 0) goto L2a
            int r1 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r1 >= 0) goto L66
            goto L52
        L2a:
            if (r1 <= 0) goto L66
            goto L52
        L2d:
            if (r6 != r3) goto L66
            if (r5 == 0) goto L34
            if (r1 <= 0) goto L66
            goto L52
        L34:
            int r1 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r1 >= 0) goto L66
            goto L52
        L39:
            int r1 = r9.getLeft()
            int r5 = r8.f19778g
            int r1 = r1 - r5
            int r5 = r9.getWidth()
            float r5 = (float) r5
            r6 = 1056964608(0x3f000000, float:0.5)
            float r5 = r5 * r6
            int r5 = java.lang.Math.round(r5)
            int r1 = java.lang.Math.abs(r1)
            if (r1 < r5) goto L66
        L52:
            int r10 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r10 < 0) goto L61
            int r10 = r9.getLeft()
            int r0 = r8.f19778g
            if (r10 >= r0) goto L5f
            goto L61
        L5f:
            int r0 = r0 + r11
            goto L69
        L61:
            int r10 = r8.f19778g
            int r0 = r10 - r11
            goto L69
        L66:
            int r0 = r8.f19778g
            r3 = r4
        L69:
            V.d r10 = r2.f15830a
            int r11 = r9.getTop()
            boolean r10 = r10.o(r0, r11)
            if (r10 == 0) goto L80
            androidx.lifecycle.d0 r10 = new androidx.lifecycle.d0
            r10.<init>(r2, r9, r3)
            java.util.WeakHashMap r11 = P.Q.f5546a
            r9.postOnAnimation(r10)
            return
        L80:
            if (r3 == 0) goto L89
            s4.i r10 = r2.f15831b
            if (r10 == 0) goto L89
            r10.M(r9)
        L89:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: j5.C1475a.R(android.view.View, float, float):void");
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC1002u1
    public final boolean h0(View view, int i9) {
        int i10 = this.f19779h;
        if ((i10 == -1 || i10 == i9) && this.f19780i.w(view)) {
            return true;
        }
        return false;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC1002u1
    public final int i(View view, int i9) {
        boolean z9;
        int width;
        int width2;
        int width3;
        WeakHashMap weakHashMap = Q.f5546a;
        if (view.getLayoutDirection() == 1) {
            z9 = true;
        } else {
            z9 = false;
        }
        int i10 = this.f19780i.f15834e;
        if (i10 == 0) {
            if (z9) {
                width = this.f19778g - view.getWidth();
                width2 = this.f19778g;
            } else {
                width = this.f19778g;
                width3 = view.getWidth();
                width2 = width3 + width;
            }
        } else if (i10 == 1) {
            if (z9) {
                width = this.f19778g;
                width3 = view.getWidth();
                width2 = width3 + width;
            } else {
                width = this.f19778g - view.getWidth();
                width2 = this.f19778g;
            }
        } else {
            width = this.f19778g - view.getWidth();
            width2 = view.getWidth() + this.f19778g;
        }
        return Math.min(Math.max(width, i9), width2);
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC1002u1
    public final int j(View view, int i9) {
        return view.getTop();
    }
}
