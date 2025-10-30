package com.google.android.material.behavior;

import A5.t;
import B.c;
import Z0.a;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import co.notix.R;
import h5.AbstractC1281a;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* loaded from: classes.dex */
public class HideBottomViewOnScrollBehavior<V extends View> extends c {

    /* renamed from: b, reason: collision with root package name */
    public int f15823b;

    /* renamed from: c, reason: collision with root package name */
    public int f15824c;

    /* renamed from: d, reason: collision with root package name */
    public TimeInterpolator f15825d;

    /* renamed from: e, reason: collision with root package name */
    public TimeInterpolator f15826e;

    /* renamed from: h, reason: collision with root package name */
    public ViewPropertyAnimator f15829h;

    /* renamed from: a, reason: collision with root package name */
    public final LinkedHashSet f15822a = new LinkedHashSet();

    /* renamed from: f, reason: collision with root package name */
    public int f15827f = 0;

    /* renamed from: g, reason: collision with root package name */
    public int f15828g = 2;

    public HideBottomViewOnScrollBehavior() {
    }

    @Override // B.c
    public boolean l(CoordinatorLayout coordinatorLayout, View view, int i9) {
        this.f15827f = view.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) view.getLayoutParams()).bottomMargin;
        this.f15823b = a.y(view.getContext(), R.attr.motionDurationLong2, 225);
        this.f15824c = a.y(view.getContext(), R.attr.motionDurationMedium4, 175);
        this.f15825d = a.z(view.getContext(), R.attr.motionEasingEmphasizedInterpolator, AbstractC1281a.f17928d);
        this.f15826e = a.z(view.getContext(), R.attr.motionEasingEmphasizedInterpolator, AbstractC1281a.f17927c);
        return false;
    }

    @Override // B.c
    public final void p(CoordinatorLayout coordinatorLayout, View view, int i9, int i10, int i11, int[] iArr) {
        LinkedHashSet linkedHashSet = this.f15822a;
        if (i9 > 0) {
            if (this.f15828g != 1) {
                ViewPropertyAnimator viewPropertyAnimator = this.f15829h;
                if (viewPropertyAnimator != null) {
                    viewPropertyAnimator.cancel();
                    view.clearAnimation();
                }
                this.f15828g = 1;
                Iterator it = linkedHashSet.iterator();
                if (!it.hasNext()) {
                    this.f15829h = view.animate().translationY(this.f15827f).setInterpolator(this.f15826e).setDuration(this.f15824c).setListener(new t(6, this));
                    return;
                }
                throw A0.a.h(it);
            }
            return;
        }
        if (i9 < 0 && this.f15828g != 2) {
            ViewPropertyAnimator viewPropertyAnimator2 = this.f15829h;
            if (viewPropertyAnimator2 != null) {
                viewPropertyAnimator2.cancel();
                view.clearAnimation();
            }
            this.f15828g = 2;
            Iterator it2 = linkedHashSet.iterator();
            if (!it2.hasNext()) {
                this.f15829h = view.animate().translationY(0).setInterpolator(this.f15825d).setDuration(this.f15823b).setListener(new t(6, this));
                return;
            }
            throw A0.a.h(it2);
        }
    }

    @Override // B.c
    public boolean t(CoordinatorLayout coordinatorLayout, View view, View view2, int i9, int i10) {
        if (i9 == 2) {
            return true;
        }
        return false;
    }

    public HideBottomViewOnScrollBehavior(Context context, AttributeSet attributeSet) {
    }
}
