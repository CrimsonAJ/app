package com.google.android.material.appbar;

import P.Q;
import P.u0;
import android.graphics.Rect;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.search.SearchBar$ScrollingViewBehavior;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public abstract class l extends m {

    /* renamed from: a, reason: collision with root package name */
    public final Rect f15812a;

    /* renamed from: b, reason: collision with root package name */
    public final Rect f15813b;

    /* renamed from: c, reason: collision with root package name */
    public int f15814c;

    /* renamed from: d, reason: collision with root package name */
    public int f15815d;

    public l() {
        this.f15812a = new Rect();
        this.f15813b = new Rect();
        this.f15814c = 0;
    }

    @Override // B.c
    public final boolean m(CoordinatorLayout coordinatorLayout, View view, int i9, int i10, int i11) {
        AppBarLayout A2;
        int i12;
        u0 lastWindowInsets;
        int i13 = view.getLayoutParams().height;
        if ((i13 == -1 || i13 == -2) && (A2 = AppBarLayout.ScrollingViewBehavior.A(coordinatorLayout.j(view))) != null) {
            int size = View.MeasureSpec.getSize(i11);
            if (size > 0) {
                WeakHashMap weakHashMap = Q.f5546a;
                if (A2.getFitsSystemWindows() && (lastWindowInsets = coordinatorLayout.getLastWindowInsets()) != null) {
                    size += lastWindowInsets.a() + lastWindowInsets.d();
                }
            } else {
                size = coordinatorLayout.getHeight();
            }
            int totalScrollRange = A2.getTotalScrollRange() + size;
            int measuredHeight = A2.getMeasuredHeight();
            if (this instanceof SearchBar$ScrollingViewBehavior) {
                view.setTranslationY(-measuredHeight);
            } else {
                view.setTranslationY(0.0f);
                totalScrollRange -= measuredHeight;
            }
            if (i13 == -1) {
                i12 = 1073741824;
            } else {
                i12 = Integer.MIN_VALUE;
            }
            coordinatorLayout.r(i9, i10, View.MeasureSpec.makeMeasureSpec(totalScrollRange, i12), view);
            return true;
        }
        return false;
    }

    @Override // com.google.android.material.appbar.m
    public final void x(CoordinatorLayout coordinatorLayout, View view, int i9) {
        AppBarLayout A2 = AppBarLayout.ScrollingViewBehavior.A(coordinatorLayout.j(view));
        if (A2 != null) {
            B.f fVar = (B.f) view.getLayoutParams();
            int paddingLeft = coordinatorLayout.getPaddingLeft() + ((ViewGroup.MarginLayoutParams) fVar).leftMargin;
            int bottom = A2.getBottom() + ((ViewGroup.MarginLayoutParams) fVar).topMargin;
            int width = (coordinatorLayout.getWidth() - coordinatorLayout.getPaddingRight()) - ((ViewGroup.MarginLayoutParams) fVar).rightMargin;
            int bottom2 = ((A2.getBottom() + coordinatorLayout.getHeight()) - coordinatorLayout.getPaddingBottom()) - ((ViewGroup.MarginLayoutParams) fVar).bottomMargin;
            Rect rect = this.f15812a;
            rect.set(paddingLeft, bottom, width, bottom2);
            u0 lastWindowInsets = coordinatorLayout.getLastWindowInsets();
            if (lastWindowInsets != null) {
                WeakHashMap weakHashMap = Q.f5546a;
                if (coordinatorLayout.getFitsSystemWindows() && !view.getFitsSystemWindows()) {
                    rect.left = lastWindowInsets.b() + rect.left;
                    rect.right -= lastWindowInsets.c();
                }
            }
            int i10 = fVar.f569c;
            if (i10 == 0) {
                i10 = 8388659;
            }
            int measuredWidth = view.getMeasuredWidth();
            int measuredHeight = view.getMeasuredHeight();
            Rect rect2 = this.f15813b;
            Gravity.apply(i10, measuredWidth, measuredHeight, rect, rect2, i9);
            int z9 = z(A2);
            view.layout(rect2.left, rect2.top - z9, rect2.right, rect2.bottom - z9);
            this.f15814c = rect2.top - A2.getBottom();
            return;
        }
        coordinatorLayout.q(view, i9);
        this.f15814c = 0;
    }

    public final int z(View view) {
        int i9;
        int i10;
        if (this.f15815d == 0) {
            return 0;
        }
        float f9 = 0.0f;
        if (view instanceof AppBarLayout) {
            AppBarLayout appBarLayout = (AppBarLayout) view;
            int totalScrollRange = appBarLayout.getTotalScrollRange();
            int downNestedPreScrollRange = appBarLayout.getDownNestedPreScrollRange();
            B.c cVar = ((B.f) appBarLayout.getLayoutParams()).f567a;
            if (cVar instanceof AppBarLayout.BaseBehavior) {
                i9 = ((AppBarLayout.BaseBehavior) cVar).z();
            } else {
                i9 = 0;
            }
            if ((downNestedPreScrollRange == 0 || totalScrollRange + i9 > downNestedPreScrollRange) && (i10 = totalScrollRange - downNestedPreScrollRange) != 0) {
                f9 = (i9 / i10) + 1.0f;
            }
        }
        int i11 = this.f15815d;
        return B6.u0.k((int) (f9 * i11), 0, i11);
    }

    public l(int i9) {
        super(0);
        this.f15812a = new Rect();
        this.f15813b = new Rect();
        this.f15814c = 0;
    }
}
