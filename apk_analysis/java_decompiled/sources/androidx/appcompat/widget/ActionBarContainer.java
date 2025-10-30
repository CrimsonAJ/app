package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import co.notix.R;
import h.AbstractC1260a;
import p.AbstractC1755L0;
import p.C1785b;

/* loaded from: classes.dex */
public class ActionBarContainer extends FrameLayout {

    /* renamed from: a, reason: collision with root package name */
    public boolean f9364a;

    /* renamed from: b, reason: collision with root package name */
    public View f9365b;

    /* renamed from: c, reason: collision with root package name */
    public View f9366c;

    /* renamed from: d, reason: collision with root package name */
    public Drawable f9367d;

    /* renamed from: e, reason: collision with root package name */
    public Drawable f9368e;

    /* renamed from: f, reason: collision with root package name */
    public Drawable f9369f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f9370g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f9371h;

    /* renamed from: i, reason: collision with root package name */
    public final int f9372i;

    public ActionBarContainer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setBackground(new C1785b(this));
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC1260a.f17805a);
        boolean z9 = false;
        this.f9367d = obtainStyledAttributes.getDrawable(0);
        this.f9368e = obtainStyledAttributes.getDrawable(2);
        this.f9372i = obtainStyledAttributes.getDimensionPixelSize(13, -1);
        if (getId() == R.id.split_action_bar) {
            this.f9370g = true;
            this.f9369f = obtainStyledAttributes.getDrawable(1);
        }
        obtainStyledAttributes.recycle();
        if (!this.f9370g ? !(this.f9367d != null || this.f9368e != null) : this.f9369f == null) {
            z9 = true;
        }
        setWillNotDraw(z9);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.f9367d;
        if (drawable != null && drawable.isStateful()) {
            this.f9367d.setState(getDrawableState());
        }
        Drawable drawable2 = this.f9368e;
        if (drawable2 != null && drawable2.isStateful()) {
            this.f9368e.setState(getDrawableState());
        }
        Drawable drawable3 = this.f9369f;
        if (drawable3 != null && drawable3.isStateful()) {
            this.f9369f.setState(getDrawableState());
        }
    }

    public View getTabContainer() {
        return null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f9367d;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
        Drawable drawable2 = this.f9368e;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
        }
        Drawable drawable3 = this.f9369f;
        if (drawable3 != null) {
            drawable3.jumpToCurrentState();
        }
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        this.f9365b = findViewById(R.id.action_bar);
        this.f9366c = findViewById(R.id.action_context_bar);
    }

    @Override // android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        super.onHoverEvent(motionEvent);
        return true;
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (!this.f9364a && !super.onInterceptTouchEvent(motionEvent)) {
            return false;
        }
        return true;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z9, int i9, int i10, int i11, int i12) {
        super.onLayout(z9, i9, i10, i11, i12);
        boolean z10 = true;
        if (this.f9370g) {
            Drawable drawable = this.f9369f;
            if (drawable != null) {
                drawable.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            } else {
                z10 = false;
            }
        } else {
            if (this.f9367d != null) {
                if (this.f9365b.getVisibility() == 0) {
                    this.f9367d.setBounds(this.f9365b.getLeft(), this.f9365b.getTop(), this.f9365b.getRight(), this.f9365b.getBottom());
                } else {
                    View view = this.f9366c;
                    if (view != null && view.getVisibility() == 0) {
                        this.f9367d.setBounds(this.f9366c.getLeft(), this.f9366c.getTop(), this.f9366c.getRight(), this.f9366c.getBottom());
                    } else {
                        this.f9367d.setBounds(0, 0, 0, 0);
                    }
                }
            } else {
                z10 = false;
            }
            this.f9371h = false;
        }
        if (z10) {
            invalidate();
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i9, int i10) {
        int i11;
        if (this.f9365b == null && View.MeasureSpec.getMode(i10) == Integer.MIN_VALUE && (i11 = this.f9372i) >= 0) {
            i10 = View.MeasureSpec.makeMeasureSpec(Math.min(i11, View.MeasureSpec.getSize(i10)), Integer.MIN_VALUE);
        }
        super.onMeasure(i9, i10);
        if (this.f9365b == null) {
            return;
        }
        View.MeasureSpec.getMode(i10);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        super.onTouchEvent(motionEvent);
        return true;
    }

    public void setPrimaryBackground(Drawable drawable) {
        Drawable drawable2 = this.f9367d;
        if (drawable2 != null) {
            drawable2.setCallback(null);
            unscheduleDrawable(this.f9367d);
        }
        this.f9367d = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            View view = this.f9365b;
            if (view != null) {
                this.f9367d.setBounds(view.getLeft(), this.f9365b.getTop(), this.f9365b.getRight(), this.f9365b.getBottom());
            }
        }
        boolean z9 = false;
        if (!this.f9370g ? !(this.f9367d != null || this.f9368e != null) : this.f9369f == null) {
            z9 = true;
        }
        setWillNotDraw(z9);
        invalidate();
        invalidateOutline();
    }

    public void setSplitBackground(Drawable drawable) {
        Drawable drawable2;
        Drawable drawable3 = this.f9369f;
        if (drawable3 != null) {
            drawable3.setCallback(null);
            unscheduleDrawable(this.f9369f);
        }
        this.f9369f = drawable;
        boolean z9 = this.f9370g;
        boolean z10 = false;
        if (drawable != null) {
            drawable.setCallback(this);
            if (z9 && (drawable2 = this.f9369f) != null) {
                drawable2.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            }
        }
        if (!z9 ? !(this.f9367d != null || this.f9368e != null) : this.f9369f == null) {
            z10 = true;
        }
        setWillNotDraw(z10);
        invalidate();
        invalidateOutline();
    }

    public void setStackedBackground(Drawable drawable) {
        Drawable drawable2 = this.f9368e;
        if (drawable2 != null) {
            drawable2.setCallback(null);
            unscheduleDrawable(this.f9368e);
        }
        this.f9368e = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            if (this.f9371h && this.f9368e != null) {
                throw null;
            }
        }
        boolean z9 = false;
        if (!this.f9370g ? !(this.f9367d != null || this.f9368e != null) : this.f9369f == null) {
            z9 = true;
        }
        setWillNotDraw(z9);
        invalidate();
        invalidateOutline();
    }

    public void setTransitioning(boolean z9) {
        int i9;
        this.f9364a = z9;
        if (z9) {
            i9 = 393216;
        } else {
            i9 = 262144;
        }
        setDescendantFocusability(i9);
    }

    @Override // android.view.View
    public void setVisibility(int i9) {
        boolean z9;
        super.setVisibility(i9);
        if (i9 == 0) {
            z9 = true;
        } else {
            z9 = false;
        }
        Drawable drawable = this.f9367d;
        if (drawable != null) {
            drawable.setVisible(z9, false);
        }
        Drawable drawable2 = this.f9368e;
        if (drawable2 != null) {
            drawable2.setVisible(z9, false);
        }
        Drawable drawable3 = this.f9369f;
        if (drawable3 != null) {
            drawable3.setVisible(z9, false);
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final ActionMode startActionModeForChild(View view, ActionMode.Callback callback) {
        return null;
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        Drawable drawable2 = this.f9367d;
        boolean z9 = this.f9370g;
        if (drawable != drawable2 || z9) {
            if (drawable != this.f9368e || !this.f9371h) {
                if ((drawable == this.f9369f && z9) || super.verifyDrawable(drawable)) {
                    return true;
                }
                return false;
            }
            return true;
        }
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final ActionMode startActionModeForChild(View view, ActionMode.Callback callback, int i9) {
        if (i9 != 0) {
            return super.startActionModeForChild(view, callback, i9);
        }
        return null;
    }

    public void setTabContainer(AbstractC1755L0 abstractC1755L0) {
    }
}
