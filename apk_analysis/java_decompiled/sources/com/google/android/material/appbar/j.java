package com.google.android.material.appbar;

import android.view.View;
import android.widget.OverScroller;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.appbar.AppBarLayout;

/* loaded from: classes.dex */
public final class j implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final CoordinatorLayout f15809a;

    /* renamed from: b, reason: collision with root package name */
    public final View f15810b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ k f15811c;

    public j(k kVar, CoordinatorLayout coordinatorLayout, View view) {
        this.f15811c = kVar;
        this.f15809a = coordinatorLayout;
        this.f15810b = view;
    }

    @Override // java.lang.Runnable
    public final void run() {
        k kVar;
        OverScroller overScroller;
        View view = this.f15810b;
        if (view != null && (overScroller = (kVar = this.f15811c).scroller) != null) {
            boolean computeScrollOffset = overScroller.computeScrollOffset();
            CoordinatorLayout coordinatorLayout = this.f15809a;
            if (computeScrollOffset) {
                kVar.B(coordinatorLayout, view, kVar.scroller.getCurrY());
                view.postOnAnimation(this);
                return;
            }
            AppBarLayout appBarLayout = (AppBarLayout) view;
            ((AppBarLayout.BaseBehavior) kVar).H(coordinatorLayout, appBarLayout);
            if (appBarLayout.f15732l) {
                appBarLayout.f(appBarLayout.g(AppBarLayout.BaseBehavior.E(coordinatorLayout)));
            }
        }
    }
}
