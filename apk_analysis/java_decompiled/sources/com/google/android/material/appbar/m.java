package com.google.android.material.appbar;

import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

/* loaded from: classes.dex */
public abstract class m extends B.c {
    private n viewOffsetHelper;
    private int tempTopBottomOffset = 0;
    private int tempLeftRightOffset = 0;

    public m() {
    }

    @Override // B.c
    public boolean l(CoordinatorLayout coordinatorLayout, View view, int i9) {
        x(coordinatorLayout, view, i9);
        if (this.viewOffsetHelper == null) {
            this.viewOffsetHelper = new n(view);
        }
        n nVar = this.viewOffsetHelper;
        View view2 = nVar.f15816a;
        nVar.f15817b = view2.getTop();
        nVar.f15818c = view2.getLeft();
        this.viewOffsetHelper.a();
        int i10 = this.tempTopBottomOffset;
        if (i10 != 0) {
            this.viewOffsetHelper.b(i10);
            this.tempTopBottomOffset = 0;
        }
        int i11 = this.tempLeftRightOffset;
        if (i11 != 0) {
            n nVar2 = this.viewOffsetHelper;
            if (nVar2.f15820e != i11) {
                nVar2.f15820e = i11;
                nVar2.a();
            }
            this.tempLeftRightOffset = 0;
            return true;
        }
        return true;
    }

    public final int w() {
        n nVar = this.viewOffsetHelper;
        if (nVar != null) {
            return nVar.f15819d;
        }
        return 0;
    }

    public void x(CoordinatorLayout coordinatorLayout, View view, int i9) {
        coordinatorLayout.q(view, i9);
    }

    public final boolean y(int i9) {
        n nVar = this.viewOffsetHelper;
        if (nVar != null) {
            return nVar.b(i9);
        }
        this.tempTopBottomOffset = i9;
        return false;
    }

    public m(int i9) {
    }
}
