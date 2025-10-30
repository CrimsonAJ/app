package com.google.android.material.appbar;

import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.OverScroller;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.appbar.AppBarLayout;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
public abstract class k extends m {
    private static final int INVALID_POINTER = -1;
    private int activePointerId;
    private Runnable flingRunnable;
    private boolean isBeingDragged;
    private int lastMotionY;
    OverScroller scroller;
    private int touchSlop;
    private VelocityTracker velocityTracker;

    public k() {
        this.activePointerId = INVALID_POINTER;
        this.touchSlop = INVALID_POINTER;
    }

    public abstract int A(CoordinatorLayout coordinatorLayout, View view, int i9, int i10, int i11);

    public final void B(CoordinatorLayout coordinatorLayout, View view, int i9) {
        A(coordinatorLayout, view, i9, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }

    @Override // B.c
    public final boolean k(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        boolean z9;
        View view2;
        int findPointerIndex;
        if (this.touchSlop < 0) {
            this.touchSlop = ViewConfiguration.get(coordinatorLayout.getContext()).getScaledTouchSlop();
        }
        if (motionEvent.getActionMasked() == 2 && this.isBeingDragged) {
            int i9 = this.activePointerId;
            if (i9 != INVALID_POINTER && (findPointerIndex = motionEvent.findPointerIndex(i9)) != INVALID_POINTER) {
                int y9 = (int) motionEvent.getY(findPointerIndex);
                if (Math.abs(y9 - this.lastMotionY) > this.touchSlop) {
                    this.lastMotionY = y9;
                    return true;
                }
            }
            return false;
        }
        if (motionEvent.getActionMasked() == 0) {
            this.activePointerId = INVALID_POINTER;
            int x5 = (int) motionEvent.getX();
            int y10 = (int) motionEvent.getY();
            WeakReference weakReference = ((AppBarLayout.BaseBehavior) this).f15750e;
            if ((weakReference == null || ((view2 = (View) weakReference.get()) != null && view2.isShown() && !view2.canScrollVertically(INVALID_POINTER))) && coordinatorLayout.o(view, x5, y10)) {
                z9 = true;
            } else {
                z9 = false;
            }
            this.isBeingDragged = z9;
            if (z9) {
                this.lastMotionY = y10;
                this.activePointerId = motionEvent.getPointerId(0);
                if (this.velocityTracker == null) {
                    this.velocityTracker = VelocityTracker.obtain();
                }
                OverScroller overScroller = this.scroller;
                if (overScroller != null && !overScroller.isFinished()) {
                    this.scroller.abortAnimation();
                    return true;
                }
            }
        }
        VelocityTracker velocityTracker = this.velocityTracker;
        if (velocityTracker != null) {
            velocityTracker.addMovement(motionEvent);
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00fc A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00ec  */
    @Override // B.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean v(androidx.coordinatorlayout.widget.CoordinatorLayout r21, android.view.View r22, android.view.MotionEvent r23) {
        /*
            Method dump skipped, instructions count: 257
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.appbar.k.v(androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.View, android.view.MotionEvent):boolean");
    }

    public abstract int z();

    public k(int i9) {
        super(0);
        this.activePointerId = INVALID_POINTER;
        this.touchSlop = INVALID_POINTER;
    }
}
