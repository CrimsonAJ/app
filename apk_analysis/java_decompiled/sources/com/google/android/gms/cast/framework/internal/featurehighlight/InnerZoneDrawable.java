package com.google.android.gms.cast.framework.internal.featurehighlight;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.drawable.Drawable;
import androidx.annotation.Keep;

/* loaded from: classes.dex */
class InnerZoneDrawable extends Drawable {

    /* renamed from: a, reason: collision with root package name */
    public float f14636a;

    /* renamed from: b, reason: collision with root package name */
    public float f14637b;

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        if (this.f14637b <= 0.0f) {
            canvas.drawCircle(0.0f, 0.0f, this.f14636a * 0.0f, null);
            return;
        }
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
    public void setPulseAlpha(float f9) {
        this.f14637b = f9;
        invalidateSelf();
    }

    @Keep
    public void setPulseScale(float f9) {
        invalidateSelf();
    }

    @Keep
    public void setScale(float f9) {
        this.f14636a = f9;
        invalidateSelf();
    }
}
