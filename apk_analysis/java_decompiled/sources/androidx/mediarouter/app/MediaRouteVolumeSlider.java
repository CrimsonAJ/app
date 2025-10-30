package androidx.mediarouter.app;

import android.R;
import android.content.Context;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.util.AttributeSet;
import android.util.Log;
import p.C1734B;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class MediaRouteVolumeSlider extends C1734B {

    /* renamed from: b, reason: collision with root package name */
    public final float f10004b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f10005c;

    /* renamed from: d, reason: collision with root package name */
    public Drawable f10006d;

    /* renamed from: e, reason: collision with root package name */
    public int f10007e;

    /* renamed from: f, reason: collision with root package name */
    public int f10008f;

    public MediaRouteVolumeSlider(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f10004b = s8.e.B(context);
    }

    public final void a(int i9, int i10) {
        if (this.f10007e != i9) {
            if (Color.alpha(i9) != 255) {
                Log.e("MediaRouteVolumeSlider", "Volume slider progress and thumb color cannot be translucent: #" + Integer.toHexString(i9));
            }
            this.f10007e = i9;
        }
        if (this.f10008f != i10) {
            if (Color.alpha(i10) != 255) {
                Log.e("MediaRouteVolumeSlider", "Volume slider background color cannot be translucent: #" + Integer.toHexString(i10));
            }
            this.f10008f = i10;
        }
    }

    public final void b(boolean z9) {
        Drawable drawable;
        if (this.f10005c == z9) {
            return;
        }
        this.f10005c = z9;
        if (z9) {
            drawable = null;
        } else {
            drawable = this.f10006d;
        }
        super.setThumb(drawable);
    }

    @Override // p.C1734B, android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public final void drawableStateChanged() {
        int i9;
        super.drawableStateChanged();
        if (isEnabled()) {
            i9 = 255;
        } else {
            i9 = (int) (this.f10004b * 255.0f);
        }
        Drawable drawable = this.f10006d;
        int i10 = this.f10007e;
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        drawable.setColorFilter(i10, mode);
        this.f10006d.setAlpha(i9);
        Drawable progressDrawable = getProgressDrawable();
        if (progressDrawable instanceof LayerDrawable) {
            LayerDrawable layerDrawable = (LayerDrawable) getProgressDrawable();
            Drawable findDrawableByLayerId = layerDrawable.findDrawableByLayerId(R.id.progress);
            layerDrawable.findDrawableByLayerId(R.id.background).setColorFilter(this.f10008f, mode);
            progressDrawable = findDrawableByLayerId;
        }
        progressDrawable.setColorFilter(this.f10007e, mode);
        progressDrawable.setAlpha(i9);
    }

    @Override // android.widget.AbsSeekBar
    public final void setThumb(Drawable drawable) {
        this.f10006d = drawable;
        if (this.f10005c) {
            drawable = null;
        }
        super.setThumb(drawable);
    }
}
