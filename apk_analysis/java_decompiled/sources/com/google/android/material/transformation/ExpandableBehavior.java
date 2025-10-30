package com.google.android.material.transformation;

import B.c;
import P.Q;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import java.util.ArrayList;
import java.util.WeakHashMap;

@Deprecated
/* loaded from: classes.dex */
public abstract class ExpandableBehavior extends c {
    public ExpandableBehavior() {
    }

    @Override // B.c
    public abstract boolean f(View view, View view2);

    @Override // B.c
    public final boolean h(CoordinatorLayout coordinatorLayout, View view, View view2) {
        view2.getClass();
        throw new ClassCastException();
    }

    @Override // B.c
    public final boolean l(CoordinatorLayout coordinatorLayout, View view, int i9) {
        WeakHashMap weakHashMap = Q.f5546a;
        if (!view.isLaidOut()) {
            ArrayList j = coordinatorLayout.j(view);
            int size = j.size();
            for (int i10 = 0; i10 < size; i10++) {
                f(view, (View) j.get(i10));
            }
        }
        return false;
    }

    public ExpandableBehavior(Context context, AttributeSet attributeSet) {
    }
}
