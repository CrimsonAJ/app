package A5;

import P.Q;
import android.content.ContentResolver;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.provider.Settings;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ProgressBar;
import co.notix.R;
import g5.AbstractC1254a;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public abstract class d extends ProgressBar {

    /* renamed from: a, reason: collision with root package name */
    public final e f390a;

    /* renamed from: b, reason: collision with root package name */
    public int f391b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f392c;

    /* renamed from: d, reason: collision with root package name */
    public final int f393d;

    /* renamed from: e, reason: collision with root package name */
    public a f394e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f395f;

    /* renamed from: g, reason: collision with root package name */
    public int f396g;

    /* renamed from: h, reason: collision with root package name */
    public final b f397h;

    /* renamed from: i, reason: collision with root package name */
    public final b f398i;
    public final c j;

    /* renamed from: k, reason: collision with root package name */
    public final c f399k;

    /* JADX WARN: Type inference failed for: r10v4, types: [A5.a, java.lang.Object] */
    public d(Context context, AttributeSet attributeSet, int i9, int i10) {
        super(M5.a.a(context, attributeSet, i9, R.style.Widget_MaterialComponents_ProgressIndicator), attributeSet, i9);
        this.f395f = false;
        this.f396g = 4;
        this.f397h = new b(this, 0);
        this.f398i = new b(this, 1);
        this.j = new c(this, 0);
        this.f399k = new c(this, 1);
        Context context2 = getContext();
        this.f390a = a(context2, attributeSet);
        int[] iArr = AbstractC1254a.f17739d;
        w5.p.a(context2, attributeSet, i9, i10);
        w5.p.b(context2, attributeSet, iArr, i9, i10, new int[0]);
        TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, iArr, i9, i10);
        obtainStyledAttributes.getInt(6, -1);
        this.f393d = Math.min(obtainStyledAttributes.getInt(4, -1), 1000);
        obtainStyledAttributes.recycle();
        this.f394e = new Object();
        this.f392c = true;
    }

    private p getCurrentDrawingDelegate() {
        if (isIndeterminate()) {
            if (getIndeterminateDrawable() == null) {
                return null;
            }
            return getIndeterminateDrawable().f454l;
        }
        if (getProgressDrawable() == null) {
            return null;
        }
        return getProgressDrawable().f430l;
    }

    public abstract e a(Context context, AttributeSet attributeSet);

    public void b(int i9) {
        if (isIndeterminate()) {
            if (getProgressDrawable() != null) {
                this.f391b = i9;
                this.f395f = true;
                if (getIndeterminateDrawable().isVisible()) {
                    a aVar = this.f394e;
                    ContentResolver contentResolver = getContext().getContentResolver();
                    aVar.getClass();
                    if (Settings.Global.getFloat(contentResolver, "animator_duration_scale", 1.0f) != 0.0f) {
                        getIndeterminateDrawable().f455m.r();
                        return;
                    }
                }
                this.j.a(getIndeterminateDrawable());
                return;
            }
            return;
        }
        super.setProgress(i9);
        if (getProgressDrawable() != null) {
            getProgressDrawable().jumpToCurrentState();
        }
    }

    public final boolean c() {
        WeakHashMap weakHashMap = Q.f5546a;
        if (isAttachedToWindow() && getWindowVisibility() == 0) {
            View view = this;
            while (view.getVisibility() == 0) {
                Object parent = view.getParent();
                if (parent == null) {
                    if (getWindowVisibility() == 0) {
                        return true;
                    }
                    return false;
                }
                if (!(parent instanceof View)) {
                    return true;
                }
                view = (View) parent;
            }
            return false;
        }
        return false;
    }

    @Override // android.widget.ProgressBar
    public Drawable getCurrentDrawable() {
        if (isIndeterminate()) {
            return getIndeterminateDrawable();
        }
        return getProgressDrawable();
    }

    public int getHideAnimationBehavior() {
        return this.f390a.f405f;
    }

    public int[] getIndicatorColor() {
        return this.f390a.f402c;
    }

    public int getIndicatorTrackGapSize() {
        return this.f390a.f406g;
    }

    public int getShowAnimationBehavior() {
        return this.f390a.f404e;
    }

    public int getTrackColor() {
        return this.f390a.f403d;
    }

    public int getTrackCornerRadius() {
        return this.f390a.f401b;
    }

    public int getTrackThickness() {
        return this.f390a.f400a;
    }

    @Override // android.view.View
    public final void invalidate() {
        super.invalidate();
        if (getCurrentDrawable() != null) {
            getCurrentDrawable().invalidateSelf();
        }
    }

    @Override // android.widget.ProgressBar, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (getProgressDrawable() != null && getIndeterminateDrawable() != null) {
            getIndeterminateDrawable().f455m.q(this.j);
        }
        l progressDrawable = getProgressDrawable();
        c cVar = this.f399k;
        if (progressDrawable != null) {
            l progressDrawable2 = getProgressDrawable();
            if (progressDrawable2.f443f == null) {
                progressDrawable2.f443f = new ArrayList();
            }
            if (!progressDrawable2.f443f.contains(cVar)) {
                progressDrawable2.f443f.add(cVar);
            }
        }
        if (getIndeterminateDrawable() != null) {
            r indeterminateDrawable = getIndeterminateDrawable();
            if (indeterminateDrawable.f443f == null) {
                indeterminateDrawable.f443f = new ArrayList();
            }
            if (!indeterminateDrawable.f443f.contains(cVar)) {
                indeterminateDrawable.f443f.add(cVar);
            }
        }
        if (c()) {
            if (this.f393d > 0) {
                SystemClock.uptimeMillis();
            }
            setVisibility(0);
        }
    }

    @Override // android.widget.ProgressBar, android.view.View
    public final void onDetachedFromWindow() {
        removeCallbacks(this.f398i);
        removeCallbacks(this.f397h);
        ((n) getCurrentDrawable()).c(false, false, false);
        r indeterminateDrawable = getIndeterminateDrawable();
        c cVar = this.f399k;
        if (indeterminateDrawable != null) {
            getIndeterminateDrawable().e(cVar);
            getIndeterminateDrawable().f455m.u();
        }
        if (getProgressDrawable() != null) {
            getProgressDrawable().e(cVar);
        }
        super.onDetachedFromWindow();
    }

    @Override // android.widget.ProgressBar, android.view.View
    public final synchronized void onDraw(Canvas canvas) {
        try {
            int save = canvas.save();
            if (getPaddingLeft() == 0) {
                if (getPaddingTop() != 0) {
                }
                if (getPaddingRight() == 0 || getPaddingBottom() != 0) {
                    canvas.clipRect(0, 0, getWidth() - (getPaddingLeft() + getPaddingRight()), getHeight() - (getPaddingTop() + getPaddingBottom()));
                }
                getCurrentDrawable().draw(canvas);
                canvas.restoreToCount(save);
            }
            canvas.translate(getPaddingLeft(), getPaddingTop());
            if (getPaddingRight() == 0) {
            }
            canvas.clipRect(0, 0, getWidth() - (getPaddingLeft() + getPaddingRight()), getHeight() - (getPaddingTop() + getPaddingBottom()));
            getCurrentDrawable().draw(canvas);
            canvas.restoreToCount(save);
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // android.widget.ProgressBar, android.view.View
    public final synchronized void onMeasure(int i9, int i10) {
        int f9;
        int e8;
        try {
            p currentDrawingDelegate = getCurrentDrawingDelegate();
            if (currentDrawingDelegate == null) {
                return;
            }
            if (currentDrawingDelegate.f() < 0) {
                f9 = View.getDefaultSize(getSuggestedMinimumWidth(), i9);
            } else {
                f9 = currentDrawingDelegate.f() + getPaddingLeft() + getPaddingRight();
            }
            if (currentDrawingDelegate.e() < 0) {
                e8 = View.getDefaultSize(getSuggestedMinimumHeight(), i10);
            } else {
                e8 = currentDrawingDelegate.e() + getPaddingTop() + getPaddingBottom();
            }
            setMeasuredDimension(f9, e8);
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // android.view.View
    public final void onVisibilityChanged(View view, int i9) {
        boolean z9;
        super.onVisibilityChanged(view, i9);
        if (i9 == 0) {
            z9 = true;
        } else {
            z9 = false;
        }
        if (!this.f392c) {
            return;
        }
        ((n) getCurrentDrawable()).c(c(), false, z9);
    }

    @Override // android.view.View
    public final void onWindowVisibilityChanged(int i9) {
        super.onWindowVisibilityChanged(i9);
        if (!this.f392c) {
            return;
        }
        ((n) getCurrentDrawable()).c(c(), false, false);
    }

    public void setAnimatorDurationScaleProvider(a aVar) {
        this.f394e = aVar;
        if (getProgressDrawable() != null) {
            getProgressDrawable().f440c = aVar;
        }
        if (getIndeterminateDrawable() != null) {
            getIndeterminateDrawable().f440c = aVar;
        }
    }

    public void setHideAnimationBehavior(int i9) {
        this.f390a.f405f = i9;
        invalidate();
    }

    @Override // android.widget.ProgressBar
    public synchronized void setIndeterminate(boolean z9) {
        try {
            if (z9 == isIndeterminate()) {
                return;
            }
            n nVar = (n) getCurrentDrawable();
            if (nVar != null) {
                nVar.c(false, false, false);
            }
            super.setIndeterminate(z9);
            n nVar2 = (n) getCurrentDrawable();
            if (nVar2 != null) {
                nVar2.c(c(), false, false);
            }
            if ((nVar2 instanceof r) && c()) {
                ((r) nVar2).f455m.t();
            }
            this.f395f = false;
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // android.widget.ProgressBar
    public void setIndeterminateDrawable(Drawable drawable) {
        if (drawable == null) {
            super.setIndeterminateDrawable(null);
        } else {
            if (drawable instanceof r) {
                ((n) drawable).c(false, false, false);
                super.setIndeterminateDrawable(drawable);
                return;
            }
            throw new IllegalArgumentException("Cannot set framework drawable as indeterminate drawable.");
        }
    }

    public void setIndicatorColor(int... iArr) {
        if (iArr.length == 0) {
            iArr = new int[]{s8.n.q(getContext(), R.attr.colorPrimary, -1)};
        }
        if (!Arrays.equals(getIndicatorColor(), iArr)) {
            this.f390a.f402c = iArr;
            getIndeterminateDrawable().f455m.l();
            invalidate();
        }
    }

    public void setIndicatorTrackGapSize(int i9) {
        e eVar = this.f390a;
        if (eVar.f406g != i9) {
            eVar.f406g = i9;
            eVar.a();
            invalidate();
        }
    }

    @Override // android.widget.ProgressBar
    public synchronized void setProgress(int i9) {
        if (isIndeterminate()) {
            return;
        }
        b(i9);
    }

    @Override // android.widget.ProgressBar
    public void setProgressDrawable(Drawable drawable) {
        if (drawable == null) {
            super.setProgressDrawable(null);
        } else {
            if (drawable instanceof l) {
                l lVar = (l) drawable;
                lVar.c(false, false, false);
                super.setProgressDrawable(lVar);
                lVar.setLevel((int) ((getProgress() / getMax()) * 10000.0f));
                return;
            }
            throw new IllegalArgumentException("Cannot set framework drawable as progress drawable.");
        }
    }

    public void setShowAnimationBehavior(int i9) {
        this.f390a.f404e = i9;
        invalidate();
    }

    public void setTrackColor(int i9) {
        e eVar = this.f390a;
        if (eVar.f403d != i9) {
            eVar.f403d = i9;
            invalidate();
        }
    }

    public void setTrackCornerRadius(int i9) {
        e eVar = this.f390a;
        if (eVar.f401b != i9) {
            eVar.f401b = Math.min(i9, eVar.f400a / 2);
            invalidate();
        }
    }

    public void setTrackThickness(int i9) {
        e eVar = this.f390a;
        if (eVar.f400a != i9) {
            eVar.f400a = i9;
            requestLayout();
        }
    }

    public void setVisibilityAfterHide(int i9) {
        if (i9 != 0 && i9 != 4 && i9 != 8) {
            throw new IllegalArgumentException("The component's visibility must be one of VISIBLE, INVISIBLE, and GONE defined in View.");
        }
        this.f396g = i9;
    }

    @Override // android.widget.ProgressBar
    public r getIndeterminateDrawable() {
        return (r) super.getIndeterminateDrawable();
    }

    @Override // android.widget.ProgressBar
    public l getProgressDrawable() {
        return (l) super.getProgressDrawable();
    }
}
