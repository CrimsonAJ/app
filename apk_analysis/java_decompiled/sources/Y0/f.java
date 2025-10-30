package Y0;

import A5.t;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.AnimatedVectorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;

/* loaded from: classes.dex */
public final class f extends i implements Animatable {

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ int f8503g = 0;

    /* renamed from: c, reason: collision with root package name */
    public final Context f8505c;

    /* renamed from: d, reason: collision with root package name */
    public t f8506d = null;

    /* renamed from: e, reason: collision with root package name */
    public ArrayList f8507e = null;

    /* renamed from: f, reason: collision with root package name */
    public final c f8508f = new c(this);

    /* renamed from: b, reason: collision with root package name */
    public final d f8504b = new Drawable.ConstantState();

    /* JADX WARN: Type inference failed for: r2v1, types: [android.graphics.drawable.Drawable$ConstantState, Y0.d] */
    public f(Context context) {
        this.f8505c = context;
    }

    @Override // Y0.i, android.graphics.drawable.Drawable
    public final void applyTheme(Resources.Theme theme) {
        Drawable drawable = this.f8511a;
        if (drawable != null) {
            drawable.applyTheme(theme);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean canApplyTheme() {
        Drawable drawable = this.f8511a;
        if (drawable != null) {
            return drawable.canApplyTheme();
        }
        return false;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Drawable drawable = this.f8511a;
        if (drawable != null) {
            drawable.draw(canvas);
            return;
        }
        d dVar = this.f8504b;
        dVar.f8498a.draw(canvas);
        if (dVar.f8499b.isStarted()) {
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        Drawable drawable = this.f8511a;
        if (drawable != null) {
            return drawable.getAlpha();
        }
        return this.f8504b.f8498a.getAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getChangingConfigurations() {
        Drawable drawable = this.f8511a;
        if (drawable != null) {
            return drawable.getChangingConfigurations();
        }
        int changingConfigurations = super.getChangingConfigurations();
        this.f8504b.getClass();
        return changingConfigurations;
    }

    @Override // android.graphics.drawable.Drawable
    public final ColorFilter getColorFilter() {
        Drawable drawable = this.f8511a;
        if (drawable != null) {
            return drawable.getColorFilter();
        }
        return this.f8504b.f8498a.getColorFilter();
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        if (this.f8511a != null && Build.VERSION.SDK_INT >= 24) {
            return new e(this.f8511a.getConstantState());
        }
        return null;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        Drawable drawable = this.f8511a;
        if (drawable != null) {
            return drawable.getIntrinsicHeight();
        }
        return this.f8504b.f8498a.getIntrinsicHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        Drawable drawable = this.f8511a;
        if (drawable != null) {
            return drawable.getIntrinsicWidth();
        }
        return this.f8504b.f8498a.getIntrinsicWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        Drawable drawable = this.f8511a;
        if (drawable != null) {
            return drawable.getOpacity();
        }
        return this.f8504b.f8498a.getOpacity();
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0130, code lost:
    
        if (r8.f8499b != null) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0132, code lost:
    
        r8.f8499b = new android.animation.AnimatorSet();
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0139, code lost:
    
        r8.f8499b.playTogether(r8.f8500c);
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0140, code lost:
    
        return;
     */
    /* JADX WARN: Type inference failed for: r7v13, types: [s.e, s.i] */
    @Override // android.graphics.drawable.Drawable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void inflate(android.content.res.Resources r21, org.xmlpull.v1.XmlPullParser r22, android.util.AttributeSet r23, android.content.res.Resources.Theme r24) {
        /*
            Method dump skipped, instructions count: 321
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Y0.f.inflate(android.content.res.Resources, org.xmlpull.v1.XmlPullParser, android.util.AttributeSet, android.content.res.Resources$Theme):void");
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isAutoMirrored() {
        Drawable drawable = this.f8511a;
        if (drawable != null) {
            return drawable.isAutoMirrored();
        }
        return this.f8504b.f8498a.isAutoMirrored();
    }

    @Override // android.graphics.drawable.Animatable
    public final boolean isRunning() {
        Drawable drawable = this.f8511a;
        if (drawable != null) {
            return ((AnimatedVectorDrawable) drawable).isRunning();
        }
        return this.f8504b.f8499b.isRunning();
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        Drawable drawable = this.f8511a;
        if (drawable != null) {
            return drawable.isStateful();
        }
        return this.f8504b.f8498a.isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable mutate() {
        Drawable drawable = this.f8511a;
        if (drawable != null) {
            drawable.mutate();
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        Drawable drawable = this.f8511a;
        if (drawable != null) {
            drawable.setBounds(rect);
        } else {
            this.f8504b.f8498a.setBounds(rect);
        }
    }

    @Override // Y0.i, android.graphics.drawable.Drawable
    public final boolean onLevelChange(int i9) {
        Drawable drawable = this.f8511a;
        if (drawable != null) {
            return drawable.setLevel(i9);
        }
        return this.f8504b.f8498a.setLevel(i9);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onStateChange(int[] iArr) {
        Drawable drawable = this.f8511a;
        if (drawable != null) {
            return drawable.setState(iArr);
        }
        return this.f8504b.f8498a.setState(iArr);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i9) {
        Drawable drawable = this.f8511a;
        if (drawable != null) {
            drawable.setAlpha(i9);
        } else {
            this.f8504b.f8498a.setAlpha(i9);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAutoMirrored(boolean z9) {
        Drawable drawable = this.f8511a;
        if (drawable != null) {
            drawable.setAutoMirrored(z9);
        } else {
            this.f8504b.f8498a.setAutoMirrored(z9);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.f8511a;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
        } else {
            this.f8504b.f8498a.setColorFilter(colorFilter);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTint(int i9) {
        Drawable drawable = this.f8511a;
        if (drawable != null) {
            s8.e.c0(drawable, i9);
        } else {
            this.f8504b.f8498a.setTint(i9);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintList(ColorStateList colorStateList) {
        Drawable drawable = this.f8511a;
        if (drawable != null) {
            drawable.setTintList(colorStateList);
        } else {
            this.f8504b.f8498a.setTintList(colorStateList);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintMode(PorterDuff.Mode mode) {
        Drawable drawable = this.f8511a;
        if (drawable != null) {
            drawable.setTintMode(mode);
        } else {
            this.f8504b.f8498a.setTintMode(mode);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z9, boolean z10) {
        Drawable drawable = this.f8511a;
        if (drawable != null) {
            return drawable.setVisible(z9, z10);
        }
        this.f8504b.f8498a.setVisible(z9, z10);
        return super.setVisible(z9, z10);
    }

    @Override // android.graphics.drawable.Animatable
    public final void start() {
        Drawable drawable = this.f8511a;
        if (drawable != null) {
            ((AnimatedVectorDrawable) drawable).start();
            return;
        }
        d dVar = this.f8504b;
        if (dVar.f8499b.isStarted()) {
            return;
        }
        dVar.f8499b.start();
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Animatable
    public final void stop() {
        Drawable drawable = this.f8511a;
        if (drawable != null) {
            ((AnimatedVectorDrawable) drawable).stop();
        } else {
            this.f8504b.f8499b.end();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) {
        inflate(resources, xmlPullParser, attributeSet, null);
    }
}
