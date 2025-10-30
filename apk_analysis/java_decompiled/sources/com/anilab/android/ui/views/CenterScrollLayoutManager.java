package com.anilab.android.ui.views;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import kotlin.jvm.internal.h;

/* loaded from: classes.dex */
public final class CenterScrollLayoutManager extends LinearLayoutManager {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CenterScrollLayoutManager(Context context, AttributeSet attrs, int i9, int i10) {
        super(context, attrs, i9, i10);
        h.e(context, "context");
        h.e(attrs, "attrs");
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.a
    public final void x0(int i9) {
        View r5 = r(i9);
        int i10 = this.f10349n / 2;
        int i11 = 0;
        if (r5 != null) {
            int width = r5.getWidth() / 2;
            ViewGroup.LayoutParams layoutParams = r5.getLayoutParams();
            if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                i11 = ((ViewGroup.MarginLayoutParams) layoutParams).getMarginStart();
            }
            i11 += width;
        }
        k1(i9, i10 - i11);
    }
}
