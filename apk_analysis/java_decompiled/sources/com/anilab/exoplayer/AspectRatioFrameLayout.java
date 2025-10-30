package com.anilab.exoplayer;

import Q2.AbstractC0365h;
import Q2.InterfaceC0358a;
import Q2.RunnableC0359b;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;

/* loaded from: classes.dex */
public final class AspectRatioFrameLayout extends FrameLayout {

    /* renamed from: a, reason: collision with root package name */
    public final RunnableC0359b f14443a;

    /* renamed from: b, reason: collision with root package name */
    public InterfaceC0358a f14444b;

    /* renamed from: c, reason: collision with root package name */
    public float f14445c;

    /* renamed from: d, reason: collision with root package name */
    public int f14446d;

    public AspectRatioFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f14446d = 0;
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, AbstractC0365h.f6268a, 0, 0);
            try {
                this.f14446d = obtainStyledAttributes.getInt(0, 0);
            } finally {
                obtainStyledAttributes.recycle();
            }
        }
        this.f14443a = new RunnableC0359b(this);
    }

    public int getResizeMode() {
        return this.f14446d;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i9, int i10) {
        float f9;
        float f10;
        super.onMeasure(i9, i10);
        if (this.f14445c > 0.0f) {
            int measuredWidth = getMeasuredWidth();
            int measuredHeight = getMeasuredHeight();
            float f11 = measuredWidth;
            float f12 = measuredHeight;
            float f13 = (this.f14445c / (f11 / f12)) - 1.0f;
            float abs = Math.abs(f13);
            RunnableC0359b runnableC0359b = this.f14443a;
            if (abs <= 0.01f) {
                if (!runnableC0359b.f6209b) {
                    runnableC0359b.f6209b = true;
                    ((AspectRatioFrameLayout) runnableC0359b.f6210c).post(runnableC0359b);
                    return;
                }
                return;
            }
            int i11 = this.f14446d;
            if (i11 != 0) {
                if (i11 != 1) {
                    if (i11 != 2) {
                        if (i11 == 4) {
                            if (f13 > 0.0f) {
                                f9 = this.f14445c;
                            } else {
                                f10 = this.f14445c;
                            }
                        }
                    } else {
                        f9 = this.f14445c;
                    }
                    measuredWidth = (int) (f12 * f9);
                } else {
                    f10 = this.f14445c;
                }
                measuredHeight = (int) (f11 / f10);
            } else if (f13 > 0.0f) {
                f10 = this.f14445c;
                measuredHeight = (int) (f11 / f10);
            } else {
                f9 = this.f14445c;
                measuredWidth = (int) (f12 * f9);
            }
            if (!runnableC0359b.f6209b) {
                runnableC0359b.f6209b = true;
                ((AspectRatioFrameLayout) runnableC0359b.f6210c).post(runnableC0359b);
            }
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824), View.MeasureSpec.makeMeasureSpec(measuredHeight, 1073741824));
        }
    }

    public void setAspectRatio(float f9) {
        if (this.f14445c != f9) {
            this.f14445c = f9;
            requestLayout();
        }
    }

    public void setAspectRatioListener(InterfaceC0358a interfaceC0358a) {
        this.f14444b = interfaceC0358a;
    }

    public void setResizeMode(int i9) {
        if (this.f14446d != i9) {
            this.f14446d = i9;
            requestLayout();
        }
    }
}
