package com.google.android.material.appbar;

import P.C0301b;
import android.os.Bundle;
import android.view.View;
import android.widget.ScrollView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.appbar.AppBarLayout;

/* loaded from: classes.dex */
public final class c extends C0301b {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ AppBarLayout f15795d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ CoordinatorLayout f15796e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ AppBarLayout.BaseBehavior f15797f;

    public c(CoordinatorLayout coordinatorLayout, AppBarLayout.BaseBehavior baseBehavior, AppBarLayout appBarLayout) {
        this.f15797f = baseBehavior;
        this.f15795d = appBarLayout;
        this.f15796e = coordinatorLayout;
    }

    @Override // P.C0301b
    public final void d(View view, Q.g gVar) {
        AppBarLayout.BaseBehavior baseBehavior;
        View C8;
        this.f5573a.onInitializeAccessibilityNodeInfo(view, gVar.f6035a);
        gVar.i(ScrollView.class.getName());
        AppBarLayout appBarLayout = this.f15795d;
        if (appBarLayout.getTotalScrollRange() != 0 && (C8 = AppBarLayout.BaseBehavior.C((baseBehavior = this.f15797f), this.f15796e)) != null) {
            int childCount = appBarLayout.getChildCount();
            for (int i9 = 0; i9 < childCount; i9++) {
                if (((f) appBarLayout.getChildAt(i9).getLayoutParams()).f15803a != 0) {
                    if (baseBehavior.z() != (-appBarLayout.getTotalScrollRange())) {
                        gVar.b(Q.e.f6021f);
                        gVar.l(true);
                    }
                    if (baseBehavior.z() != 0) {
                        if (C8.canScrollVertically(-1)) {
                            if ((-appBarLayout.getDownNestedPreScrollRange()) != 0) {
                                gVar.b(Q.e.f6022g);
                                gVar.l(true);
                                return;
                            }
                            return;
                        }
                        gVar.b(Q.e.f6022g);
                        gVar.l(true);
                        return;
                    }
                    return;
                }
            }
        }
    }

    @Override // P.C0301b
    public final boolean g(View view, int i9, Bundle bundle) {
        AppBarLayout appBarLayout = this.f15795d;
        if (i9 == 4096) {
            appBarLayout.setExpanded(false);
            return true;
        }
        if (i9 == 8192) {
            AppBarLayout.BaseBehavior baseBehavior = this.f15797f;
            if (baseBehavior.z() != 0) {
                View C8 = AppBarLayout.BaseBehavior.C(baseBehavior, this.f15796e);
                if (C8.canScrollVertically(-1)) {
                    int i10 = -appBarLayout.getDownNestedPreScrollRange();
                    if (i10 != 0) {
                        CoordinatorLayout coordinatorLayout = this.f15796e;
                        AppBarLayout appBarLayout2 = this.f15795d;
                        this.f15797f.F(coordinatorLayout, appBarLayout2, C8, i10, new int[]{0, 0});
                        return true;
                    }
                } else {
                    appBarLayout.setExpanded(true);
                    return true;
                }
            }
            return false;
        }
        return super.g(view, i9, bundle);
    }
}
