package com.anilab.android.ui.views;

import I1.q;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatTextView;
import co.notix.R;
import kotlin.jvm.internal.h;

/* loaded from: classes.dex */
public final class ButtonSettings extends AppCompatTextView {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ButtonSettings(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        h.e(context, "context");
        int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.dp_28);
        int dimensionPixelSize2 = getResources().getDimensionPixelSize(R.dimen.dp_24);
        int dimensionPixelSize3 = getResources().getDimensionPixelSize(R.dimen.sp_18);
        int dimensionPixelSize4 = getResources().getDimensionPixelSize(R.dimen.dp_12);
        int dimensionPixelSize5 = getResources().getDimensionPixelSize(R.dimen.dp_20);
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, q.f3443a, 0, 0);
        h.d(obtainStyledAttributes, "obtainStyledAttributes(...)");
        Drawable drawable = obtainStyledAttributes.getDrawable(1);
        obtainStyledAttributes.getDimensionPixelSize(0, R.dimen.dp_28);
        boolean z9 = obtainStyledAttributes.getBoolean(2, true);
        if (drawable != null) {
            drawable.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
        }
        setTextSize(0, dimensionPixelSize3);
        setPadding(dimensionPixelSize2, dimensionPixelSize4, dimensionPixelSize2, dimensionPixelSize4);
        setCompoundDrawablePadding(dimensionPixelSize5);
        Drawable drawable2 = context.getTheme().getDrawable(R.drawable.ic_arrow_setting);
        drawable2.setBounds(0, 0, dimensionPixelSize5, dimensionPixelSize5);
        setCompoundDrawables(drawable, null, z9 ? drawable2 : null, null);
        setTypeface(Typeface.DEFAULT_BOLD);
    }
}
