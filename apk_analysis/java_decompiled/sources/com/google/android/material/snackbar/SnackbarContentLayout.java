package com.google.android.material.snackbar;

import P.Q;
import Z0.a;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.text.Layout;
import android.util.AttributeSet;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import co.notix.R;
import h5.AbstractC1281a;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public class SnackbarContentLayout extends LinearLayout {

    /* renamed from: a, reason: collision with root package name */
    public TextView f16114a;

    /* renamed from: b, reason: collision with root package name */
    public Button f16115b;

    /* renamed from: c, reason: collision with root package name */
    public final TimeInterpolator f16116c;

    /* renamed from: d, reason: collision with root package name */
    public int f16117d;

    public SnackbarContentLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f16116c = a.z(context, R.attr.motionEasingEmphasizedInterpolator, AbstractC1281a.f17926b);
    }

    public final boolean a(int i9, int i10, int i11) {
        boolean z9;
        if (i9 != getOrientation()) {
            setOrientation(i9);
            z9 = true;
        } else {
            z9 = false;
        }
        if (this.f16114a.getPaddingTop() == i10 && this.f16114a.getPaddingBottom() == i11) {
            return z9;
        }
        TextView textView = this.f16114a;
        WeakHashMap weakHashMap = Q.f5546a;
        if (textView.isPaddingRelative()) {
            textView.setPaddingRelative(textView.getPaddingStart(), i10, textView.getPaddingEnd(), i11);
            return true;
        }
        textView.setPadding(textView.getPaddingLeft(), i10, textView.getPaddingRight(), i11);
        return true;
    }

    public Button getActionView() {
        return this.f16115b;
    }

    public TextView getMessageView() {
        return this.f16114a;
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        this.f16114a = (TextView) findViewById(R.id.snackbar_text);
        this.f16115b = (Button) findViewById(R.id.snackbar_action);
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i9, int i10) {
        boolean z9;
        super.onMeasure(i9, i10);
        if (getOrientation() != 1) {
            int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.design_snackbar_padding_vertical_2lines);
            int dimensionPixelSize2 = getResources().getDimensionPixelSize(R.dimen.design_snackbar_padding_vertical);
            Layout layout = this.f16114a.getLayout();
            if (layout != null && layout.getLineCount() > 1) {
                z9 = true;
            } else {
                z9 = false;
            }
            if (z9 && this.f16117d > 0 && this.f16115b.getMeasuredWidth() > this.f16117d) {
                if (!a(1, dimensionPixelSize, dimensionPixelSize - dimensionPixelSize2)) {
                    return;
                }
            } else {
                if (!z9) {
                    dimensionPixelSize = dimensionPixelSize2;
                }
                if (!a(0, dimensionPixelSize, dimensionPixelSize)) {
                    return;
                }
            }
            super.onMeasure(i9, i10);
        }
    }

    public void setMaxInlineActionWidth(int i9) {
        this.f16117d = i9;
    }
}
