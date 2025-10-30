package com.google.android.material.snackbar;

import I5.f;
import I5.i;
import android.view.MotionEvent;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import b7.C0701c;
import com.google.android.material.behavior.SwipeDismissBehavior;
import l1.C1535g;

/* loaded from: classes.dex */
public class BaseTransientBottomBar$Behavior extends SwipeDismissBehavior<View> {

    /* renamed from: i, reason: collision with root package name */
    public final C0701c f16113i;

    public BaseTransientBottomBar$Behavior() {
        C0701c c0701c = new C0701c(9);
        this.f15835f = Math.min(Math.max(0.0f, 0.1f), 1.0f);
        this.f15836g = Math.min(Math.max(0.0f, 0.6f), 1.0f);
        this.f15834e = 0;
        this.f16113i = c0701c;
    }

    @Override // com.google.android.material.behavior.SwipeDismissBehavior, B.c
    public final boolean k(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        C0701c c0701c = this.f16113i;
        c0701c.getClass();
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 0) {
            if (actionMasked == 1 || actionMasked == 3) {
                C1535g.r().E((f) c0701c.f11404b);
            }
        } else if (coordinatorLayout.o(view, (int) motionEvent.getX(), (int) motionEvent.getY())) {
            C1535g.r().y((f) c0701c.f11404b);
        }
        return super.k(coordinatorLayout, view, motionEvent);
    }

    @Override // com.google.android.material.behavior.SwipeDismissBehavior
    public final boolean w(View view) {
        this.f16113i.getClass();
        return view instanceof i;
    }
}
