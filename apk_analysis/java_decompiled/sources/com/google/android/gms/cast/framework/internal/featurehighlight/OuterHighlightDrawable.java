package com.google.android.gms.cast.framework.internal.featurehighlight;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.drawable.Drawable;
import androidx.annotation.Keep;

/* loaded from: classes.dex */
class OuterHighlightDrawable extends Drawable {

    /* renamed from: a, reason: collision with root package name */
    public float f14638a;

    /* renamed from: b, reason: collision with root package name */
    public float f14639b;

    /* renamed from: c, reason: collision with root package name */
    public float f14640c;

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        canvas.drawCircle(this.f14639b + 0.0f, this.f14640c + 0.0f, 0.0f * this.f14638a, null);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        throw null;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i9) {
        throw null;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        throw null;
    }

    @Keep
    public void setScale(float f9) {
        this.f14638a = f9;
        invalidateSelf();
    }

    @Keep
    public void setTranslationX(float f9) {
        this.f14639b = f9;
        invalidateSelf();
    }

    @Keep
    public void setTranslationY(float f9) {
        this.f14640c = f9;
        invalidateSelf();
    }
}
