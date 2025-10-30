package A5;

import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.ContentResolver;
import android.content.Context;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.provider.Settings;
import h5.AbstractC1281a;
import java.util.ArrayList;

/* loaded from: classes.dex */
public abstract class n extends Drawable implements Animatable {

    /* renamed from: k */
    public static final h f437k = new h(Float.class, "growFraction", 2);

    /* renamed from: a */
    public final Context f438a;

    /* renamed from: b */
    public final e f439b;

    /* renamed from: d */
    public ObjectAnimator f441d;

    /* renamed from: e */
    public ObjectAnimator f442e;

    /* renamed from: f */
    public ArrayList f443f;

    /* renamed from: g */
    public boolean f444g;

    /* renamed from: h */
    public float f445h;
    public int j;

    /* renamed from: i */
    public final Paint f446i = new Paint();

    /* renamed from: c */
    public a f440c = new Object();

    /* JADX WARN: Type inference failed for: r2v1, types: [A5.a, java.lang.Object] */
    public n(Context context, e eVar) {
        this.f438a = context;
        this.f439b = eVar;
        setAlpha(255);
    }

    public final float b() {
        e eVar = this.f439b;
        if (eVar.f404e != 0 || eVar.f405f != 0) {
            return this.f445h;
        }
        return 1.0f;
    }

    public final boolean c(boolean z9, boolean z10, boolean z11) {
        boolean z12;
        a aVar = this.f440c;
        ContentResolver contentResolver = this.f438a.getContentResolver();
        aVar.getClass();
        float f9 = Settings.Global.getFloat(contentResolver, "animator_duration_scale", 1.0f);
        if (z11 && f9 > 0.0f) {
            z12 = true;
        } else {
            z12 = false;
        }
        return d(z9, z10, z12);
    }

    public boolean d(boolean z9, boolean z10, boolean z11) {
        ObjectAnimator objectAnimator;
        ObjectAnimator objectAnimator2;
        boolean z12;
        ObjectAnimator objectAnimator3 = this.f441d;
        h hVar = f437k;
        if (objectAnimator3 == null) {
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, hVar, 0.0f, 1.0f);
            this.f441d = ofFloat;
            ofFloat.setDuration(500L);
            this.f441d.setInterpolator(AbstractC1281a.f17926b);
            ObjectAnimator objectAnimator4 = this.f441d;
            if (objectAnimator4 != null && objectAnimator4.isRunning()) {
                throw new IllegalArgumentException("Cannot set showAnimator while the current showAnimator is running.");
            }
            this.f441d = objectAnimator4;
            objectAnimator4.addListener(new m(this, 0));
        }
        if (this.f442e == null) {
            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this, hVar, 1.0f, 0.0f);
            this.f442e = ofFloat2;
            ofFloat2.setDuration(500L);
            this.f442e.setInterpolator(AbstractC1281a.f17926b);
            ObjectAnimator objectAnimator5 = this.f442e;
            if (objectAnimator5 != null && objectAnimator5.isRunning()) {
                throw new IllegalArgumentException("Cannot set hideAnimator while the current hideAnimator is running.");
            }
            this.f442e = objectAnimator5;
            objectAnimator5.addListener(new m(this, 1));
        }
        if (isVisible() || z9) {
            if (z9) {
                objectAnimator = this.f441d;
            } else {
                objectAnimator = this.f442e;
            }
            if (z9) {
                objectAnimator2 = this.f442e;
            } else {
                objectAnimator2 = this.f441d;
            }
            if (!z11) {
                if (objectAnimator2.isRunning()) {
                    boolean z13 = this.f444g;
                    this.f444g = true;
                    new ValueAnimator[]{objectAnimator2}[0].cancel();
                    this.f444g = z13;
                }
                if (objectAnimator.isRunning()) {
                    objectAnimator.end();
                } else {
                    boolean z14 = this.f444g;
                    this.f444g = true;
                    new ValueAnimator[]{objectAnimator}[0].end();
                    this.f444g = z14;
                }
                return super.setVisible(z9, false);
            }
            if (!objectAnimator.isRunning()) {
                if (z9 && !super.setVisible(z9, false)) {
                    z12 = false;
                } else {
                    z12 = true;
                }
                e eVar = this.f439b;
                if (!z9 ? eVar.f405f != 0 : eVar.f404e != 0) {
                    if (!z10 && objectAnimator.isPaused()) {
                        objectAnimator.resume();
                        return z12;
                    }
                    objectAnimator.start();
                    return z12;
                }
                boolean z15 = this.f444g;
                this.f444g = true;
                new ValueAnimator[]{objectAnimator}[0].end();
                this.f444g = z15;
                return z12;
            }
        }
        return false;
    }

    public final void e(c cVar) {
        ArrayList arrayList = this.f443f;
        if (arrayList != null && arrayList.contains(cVar)) {
            this.f443f.remove(cVar);
            if (this.f443f.isEmpty()) {
                this.f443f = null;
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.j;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Animatable
    public final boolean isRunning() {
        ObjectAnimator objectAnimator = this.f441d;
        if (objectAnimator == null || !objectAnimator.isRunning()) {
            ObjectAnimator objectAnimator2 = this.f442e;
            if (objectAnimator2 != null && objectAnimator2.isRunning()) {
                return true;
            }
            return false;
        }
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i9) {
        this.j = i9;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f446i.setColorFilter(colorFilter);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z9, boolean z10) {
        return c(z9, z10, true);
    }

    @Override // android.graphics.drawable.Animatable
    public final void start() {
        d(true, true, false);
    }

    @Override // android.graphics.drawable.Animatable
    public final void stop() {
        d(false, true, false);
    }
}
