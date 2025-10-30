package com.google.android.material.behavior;

import B.c;
import P.Q;
import Q.e;
import V.d;
import android.view.MotionEvent;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import f5.C1183o;
import j5.C1475a;
import java.util.WeakHashMap;
import s4.i;

/* loaded from: classes.dex */
public class SwipeDismissBehavior<V extends View> extends c {

    /* renamed from: a, reason: collision with root package name */
    public d f15830a;

    /* renamed from: b, reason: collision with root package name */
    public i f15831b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f15832c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f15833d;

    /* renamed from: e, reason: collision with root package name */
    public int f15834e = 2;

    /* renamed from: f, reason: collision with root package name */
    public float f15835f = 0.0f;

    /* renamed from: g, reason: collision with root package name */
    public float f15836g = 0.5f;

    /* renamed from: h, reason: collision with root package name */
    public final C1475a f15837h = new C1475a(this);

    @Override // B.c
    public boolean k(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        boolean z9 = this.f15832c;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 0) {
            if (actionMasked == 1 || actionMasked == 3) {
                this.f15832c = false;
            }
        } else {
            z9 = coordinatorLayout.o(view, (int) motionEvent.getX(), (int) motionEvent.getY());
            this.f15832c = z9;
        }
        if (z9) {
            if (this.f15830a == null) {
                this.f15830a = new d(coordinatorLayout.getContext(), coordinatorLayout, this.f15837h);
            }
            if (!this.f15833d && this.f15830a.p(motionEvent)) {
                return true;
            }
        }
        return false;
    }

    @Override // B.c
    public final boolean l(CoordinatorLayout coordinatorLayout, View view, int i9) {
        WeakHashMap weakHashMap = Q.f5546a;
        if (view.getImportantForAccessibility() == 0) {
            view.setImportantForAccessibility(1);
            Q.j(view, 1048576);
            Q.h(view, 0);
            if (w(view)) {
                Q.k(view, e.j, new C1183o(6, this));
            }
        }
        return false;
    }

    @Override // B.c
    public final boolean v(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        if (this.f15830a != null) {
            if (!this.f15833d || motionEvent.getActionMasked() != 3) {
                this.f15830a.j(motionEvent);
                return true;
            }
            return true;
        }
        return false;
    }

    public boolean w(View view) {
        return true;
    }
}
