package com.google.android.material.datepicker;

import P.Q;
import android.R;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.widget.GridView;
import android.widget.ListAdapter;

/* loaded from: classes.dex */
final class MaterialCalendarGridView extends GridView {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f15969a;

    public MaterialCalendarGridView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        v.c(null);
        if (k.n0(getContext(), R.attr.windowFullscreen)) {
            setNextFocusLeftId(co.notix.R.id.cancel_button);
            setNextFocusRightId(co.notix.R.id.confirm_button);
        }
        this.f15969a = k.n0(getContext(), co.notix.R.attr.nestedScrollable);
        Q.m(this, new S.e(3));
    }

    public final n a() {
        return (n) super.getAdapter();
    }

    @Override // android.widget.GridView, android.widget.AdapterView
    public final ListAdapter getAdapter() {
        return (n) super.getAdapter();
    }

    @Override // android.widget.AbsListView, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        ((n) super.getAdapter()).notifyDataSetChanged();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        n nVar = (n) super.getAdapter();
        nVar.getClass();
        int max = Math.max(nVar.a(), getFirstVisiblePosition());
        int min = Math.min(nVar.c(), getLastVisiblePosition());
        nVar.getItem(max);
        nVar.getItem(min);
        throw null;
    }

    @Override // android.widget.GridView, android.widget.AbsListView, android.view.View
    public final void onFocusChanged(boolean z9, int i9, Rect rect) {
        if (z9) {
            if (i9 == 33) {
                setSelection(((n) super.getAdapter()).c());
                return;
            } else if (i9 == 130) {
                setSelection(((n) super.getAdapter()).a());
                return;
            } else {
                super.onFocusChanged(true, i9, rect);
                return;
            }
        }
        super.onFocusChanged(false, i9, rect);
    }

    @Override // android.widget.GridView, android.widget.AbsListView, android.view.View, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i9, KeyEvent keyEvent) {
        if (!super.onKeyDown(i9, keyEvent)) {
            return false;
        }
        if (getSelectedItemPosition() == -1 || getSelectedItemPosition() >= ((n) super.getAdapter()).a()) {
            return true;
        }
        if (19 != i9) {
            return false;
        }
        setSelection(((n) super.getAdapter()).a());
        return true;
    }

    @Override // android.widget.GridView, android.widget.AbsListView, android.view.View
    public final void onMeasure(int i9, int i10) {
        if (this.f15969a) {
            super.onMeasure(i9, View.MeasureSpec.makeMeasureSpec(16777215, Integer.MIN_VALUE));
            getLayoutParams().height = getMeasuredHeight();
            return;
        }
        super.onMeasure(i9, i10);
    }

    @Override // android.widget.GridView, android.widget.AdapterView
    public final void setSelection(int i9) {
        if (i9 < ((n) super.getAdapter()).a()) {
            super.setSelection(((n) super.getAdapter()).a());
        } else {
            super.setSelection(i9);
        }
    }

    @Override // android.widget.GridView, android.widget.AdapterView
    /* renamed from: getAdapter, reason: avoid collision after fix types in other method */
    public final ListAdapter getAdapter2() {
        return (n) super.getAdapter();
    }

    @Override // android.widget.AdapterView
    public final void setAdapter(ListAdapter listAdapter) {
        if (listAdapter instanceof n) {
            super.setAdapter(listAdapter);
            return;
        }
        throw new IllegalArgumentException(String.format("%1$s must have its Adapter set to a %2$s", MaterialCalendarGridView.class.getCanonicalName(), n.class.getCanonicalName()));
    }
}
