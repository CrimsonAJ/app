package com.google.android.material.bottomnavigation;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import b5.G1;
import co.notix.R;
import d0.w;
import g5.AbstractC1254a;
import l5.b;
import l5.c;
import l5.d;
import w5.p;
import z5.k;

/* loaded from: classes.dex */
public class BottomNavigationView extends k {
    public BottomNavigationView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        G1 j = p.j(getContext(), attributeSet, AbstractC1254a.f17740e, R.attr.bottomNavigationStyle, R.style.Widget_Design_BottomNavigationView, new int[0]);
        TypedArray typedArray = (TypedArray) j.f10718c;
        setItemHorizontalTranslationEnabled(typedArray.getBoolean(2, true));
        if (typedArray.hasValue(0)) {
            setMinimumHeight(typedArray.getDimensionPixelSize(0, 0));
        }
        typedArray.getBoolean(1, true);
        j.y();
        p.d(this, new w(8));
    }

    @Override // z5.k
    public int getMaxItemCount() {
        return 5;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i9, int i10) {
        int suggestedMinimumHeight = getSuggestedMinimumHeight();
        if (View.MeasureSpec.getMode(i10) != 1073741824 && suggestedMinimumHeight > 0) {
            i10 = View.MeasureSpec.makeMeasureSpec(Math.min(View.MeasureSpec.getSize(i10), getPaddingBottom() + getPaddingTop() + suggestedMinimumHeight), 1073741824);
        }
        super.onMeasure(i9, i10);
    }

    public void setItemHorizontalTranslationEnabled(boolean z9) {
        b bVar = (b) getMenuView();
        if (bVar.f20570m0 != z9) {
            bVar.setItemHorizontalTranslationEnabled(z9);
            getPresenter().f(false);
        }
    }

    @Deprecated
    public void setOnNavigationItemReselectedListener(c cVar) {
        setOnItemReselectedListener(cVar);
    }

    @Deprecated
    public void setOnNavigationItemSelectedListener(d dVar) {
        setOnItemSelectedListener(dVar);
    }
}
