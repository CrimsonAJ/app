package com.google.android.material.floatingactionbutton;

import B.c;
import B.f;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import g5.AbstractC1254a;

/* loaded from: classes.dex */
public class FloatingActionButton$BaseBehavior<T> extends c {
    public FloatingActionButton$BaseBehavior() {
    }

    @Override // B.c
    public final boolean e(View view) {
        throw new ClassCastException();
    }

    @Override // B.c
    public final void g(f fVar) {
        if (fVar.f574h == 0) {
            fVar.f574h = 80;
        }
    }

    @Override // B.c
    public final boolean h(CoordinatorLayout coordinatorLayout, View view, View view2) {
        throw new ClassCastException();
    }

    @Override // B.c
    public final boolean l(CoordinatorLayout coordinatorLayout, View view, int i9) {
        throw new ClassCastException();
    }

    public FloatingActionButton$BaseBehavior(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC1254a.f17750p);
        obtainStyledAttributes.getBoolean(0, true);
        obtainStyledAttributes.recycle();
    }
}
