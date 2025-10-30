package w5;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.Gravity;
import androidx.appcompat.widget.LinearLayoutCompat;
import g5.AbstractC1254a;

/* loaded from: classes.dex */
public abstract class f extends LinearLayoutCompat {

    /* renamed from: p, reason: collision with root package name */
    public Drawable f24288p;

    /* renamed from: q, reason: collision with root package name */
    public final Rect f24289q;

    /* renamed from: r, reason: collision with root package name */
    public final Rect f24290r;

    /* renamed from: s, reason: collision with root package name */
    public int f24291s;

    /* renamed from: t, reason: collision with root package name */
    public final boolean f24292t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f24293u;

    public f(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.f24289q = new Rect();
        this.f24290r = new Rect();
        this.f24291s = 119;
        this.f24292t = true;
        this.f24293u = false;
        int[] iArr = AbstractC1254a.f17752r;
        p.a(context, attributeSet, 0, 0);
        p.b(context, attributeSet, iArr, 0, 0, new int[0]);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, 0, 0);
        this.f24291s = obtainStyledAttributes.getInt(1, this.f24291s);
        Drawable drawable = obtainStyledAttributes.getDrawable(0);
        if (drawable != null) {
            setForeground(drawable);
        }
        this.f24292t = obtainStyledAttributes.getBoolean(2, true);
        obtainStyledAttributes.recycle();
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        super.draw(canvas);
        Drawable drawable = this.f24288p;
        if (drawable != null) {
            if (this.f24293u) {
                this.f24293u = false;
                int right = getRight() - getLeft();
                int bottom = getBottom() - getTop();
                boolean z9 = this.f24292t;
                Rect rect = this.f24289q;
                if (z9) {
                    rect.set(0, 0, right, bottom);
                } else {
                    rect.set(getPaddingLeft(), getPaddingTop(), right - getPaddingRight(), bottom - getPaddingBottom());
                }
                int i9 = this.f24291s;
                int intrinsicWidth = drawable.getIntrinsicWidth();
                int intrinsicHeight = drawable.getIntrinsicHeight();
                Rect rect2 = this.f24290r;
                Gravity.apply(i9, intrinsicWidth, intrinsicHeight, rect, rect2);
                drawable.setBounds(rect2);
            }
            drawable.draw(canvas);
        }
    }

    @Override // android.view.View
    public final void drawableHotspotChanged(float f9, float f10) {
        super.drawableHotspotChanged(f9, f10);
        Drawable drawable = this.f24288p;
        if (drawable != null) {
            drawable.setHotspot(f9, f10);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.f24288p;
        if (drawable != null && drawable.isStateful()) {
            this.f24288p.setState(getDrawableState());
        }
    }

    @Override // android.view.View
    public Drawable getForeground() {
        return this.f24288p;
    }

    @Override // android.view.View
    public int getForegroundGravity() {
        return this.f24291s;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f24288p;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z9, int i9, int i10, int i11, int i12) {
        super.onLayout(z9, i9, i10, i11, i12);
        this.f24293u = z9 | this.f24293u;
    }

    @Override // android.view.View
    public final void onSizeChanged(int i9, int i10, int i11, int i12) {
        super.onSizeChanged(i9, i10, i11, i12);
        this.f24293u = true;
    }

    @Override // android.view.View
    public void setForeground(Drawable drawable) {
        Drawable drawable2 = this.f24288p;
        if (drawable2 != drawable) {
            if (drawable2 != null) {
                drawable2.setCallback(null);
                unscheduleDrawable(this.f24288p);
            }
            this.f24288p = drawable;
            this.f24293u = true;
            if (drawable != null) {
                setWillNotDraw(false);
                drawable.setCallback(this);
                if (drawable.isStateful()) {
                    drawable.setState(getDrawableState());
                }
                if (this.f24291s == 119) {
                    drawable.getPadding(new Rect());
                }
            } else {
                setWillNotDraw(true);
            }
            requestLayout();
            invalidate();
        }
    }

    @Override // android.view.View
    public void setForegroundGravity(int i9) {
        if (this.f24291s != i9) {
            if ((8388615 & i9) == 0) {
                i9 |= 8388611;
            }
            if ((i9 & 112) == 0) {
                i9 |= 48;
            }
            this.f24291s = i9;
            if (i9 == 119 && this.f24288p != null) {
                this.f24288p.getPadding(new Rect());
            }
            requestLayout();
        }
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        if (!super.verifyDrawable(drawable) && drawable != this.f24288p) {
            return false;
        }
        return true;
    }
}
