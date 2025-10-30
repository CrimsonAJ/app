package androidx.mediarouter.app;

import android.R;
import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.Drawable;
import android.os.AsyncTask;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import com.google.android.gms.internal.measurement.D1;
import i0.AbstractActivityC1369y;
import i0.AbstractC1336M;
import i0.C1345a;
import t0.C1988w;

/* loaded from: classes.dex */
public class MediaRouteButton extends View {

    /* renamed from: p, reason: collision with root package name */
    public static final SparseArray f9981p = new SparseArray(2);

    /* renamed from: q, reason: collision with root package name */
    public static final int[] f9982q = {R.attr.state_checked};

    /* renamed from: r, reason: collision with root package name */
    public static final int[] f9983r = {R.attr.state_checkable};

    /* renamed from: a, reason: collision with root package name */
    public final t0.D f9984a;

    /* renamed from: b, reason: collision with root package name */
    public final F f9985b;

    /* renamed from: c, reason: collision with root package name */
    public C1988w f9986c;

    /* renamed from: d, reason: collision with root package name */
    public u f9987d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f9988e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f9989f;

    /* renamed from: g, reason: collision with root package name */
    public AsyncTaskC0565a f9990g;

    /* renamed from: h, reason: collision with root package name */
    public Drawable f9991h;

    /* renamed from: i, reason: collision with root package name */
    public int f9992i;
    public int j;

    /* renamed from: k, reason: collision with root package name */
    public int f9993k;

    /* renamed from: l, reason: collision with root package name */
    public final ColorStateList f9994l;

    /* renamed from: m, reason: collision with root package name */
    public final int f9995m;

    /* renamed from: n, reason: collision with root package name */
    public final int f9996n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f9997o;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public MediaRouteButton(android.content.Context r8, android.util.AttributeSet r9) {
        /*
            r7 = this;
            android.view.ContextThemeWrapper r0 = new android.view.ContextThemeWrapper
            int r1 = s8.e.E(r8)
            r0.<init>(r8, r1)
            r8 = 2130969431(0x7f040357, float:1.7547544E38)
            int r8 = s8.e.H(r0, r8)
            if (r8 == 0) goto L18
            android.view.ContextThemeWrapper r1 = new android.view.ContextThemeWrapper
            r1.<init>(r0, r8)
            r0 = r1
        L18:
            r6 = 2130969419(0x7f04034b, float:1.754752E38)
            r7.<init>(r0, r9, r6)
            t0.w r8 = t0.C1988w.f23046c
            r7.f9986c = r8
            androidx.mediarouter.app.u r8 = androidx.mediarouter.app.u.f10185a
            r7.f9987d = r8
            android.content.Context r2 = r7.getContext()
            int[] r3 = s0.AbstractC1942a.f22667a
            r8 = 0
            android.content.res.TypedArray r5 = r2.obtainStyledAttributes(r9, r3, r6, r8)
            r1 = r7
            r4 = r9
            P.Q.l(r1, r2, r3, r4, r5, r6)
            boolean r9 = r7.isInEditMode()
            r0 = 3
            if (r9 == 0) goto L4d
            r9 = 0
            r1.f9984a = r9
            r1.f9985b = r9
            int r8 = r5.getResourceId(r0, r8)
            android.graphics.drawable.Drawable r8 = a.AbstractC0485a.q(r2, r8)
            r1.f9991h = r8
            return
        L4d:
            t0.D r9 = t0.D.d(r2)
            r1.f9984a = r9
            androidx.mediarouter.app.F r9 = new androidx.mediarouter.app.F
            r2 = 1
            r9.<init>(r7, r2)
            r1.f9985b = r9
            t0.C r9 = t0.D.f()
            boolean r2 = r9.d()
            if (r2 != 0) goto L68
            int r9 = r9.f22848i
            goto L69
        L68:
            r9 = r8
        L69:
            r1.f9993k = r9
            r1.j = r9
            r9 = 4
            android.content.res.ColorStateList r9 = r5.getColorStateList(r9)
            r1.f9994l = r9
            int r9 = r5.getDimensionPixelSize(r8, r8)
            r1.f9995m = r9
            r9 = 1
            int r2 = r5.getDimensionPixelSize(r9, r8)
            r1.f9996n = r2
            int r0 = r5.getResourceId(r0, r8)
            r2 = 2
            int r2 = r5.getResourceId(r2, r8)
            r1.f9992i = r2
            r5.recycle()
            int r2 = r1.f9992i
            android.util.SparseArray r3 = androidx.mediarouter.app.MediaRouteButton.f9981p
            if (r2 == 0) goto La4
            java.lang.Object r2 = r3.get(r2)
            android.graphics.drawable.Drawable$ConstantState r2 = (android.graphics.drawable.Drawable.ConstantState) r2
            if (r2 == 0) goto La4
            android.graphics.drawable.Drawable r2 = r2.newDrawable()
            r7.setRemoteIndicatorDrawable(r2)
        La4:
            android.graphics.drawable.Drawable r2 = r1.f9991h
            if (r2 != 0) goto Ld0
            if (r0 == 0) goto Lcd
            java.lang.Object r2 = r3.get(r0)
            android.graphics.drawable.Drawable$ConstantState r2 = (android.graphics.drawable.Drawable.ConstantState) r2
            if (r2 == 0) goto Lba
            android.graphics.drawable.Drawable r8 = r2.newDrawable()
            r7.setRemoteIndicatorDrawableInternal(r8)
            goto Ld0
        Lba:
            androidx.mediarouter.app.a r2 = new androidx.mediarouter.app.a
            android.content.Context r3 = r7.getContext()
            r2.<init>(r7, r0, r3)
            r1.f9990g = r2
            java.util.concurrent.Executor r0 = android.os.AsyncTask.SERIAL_EXECUTOR
            java.lang.Void[] r8 = new java.lang.Void[r8]
            r2.executeOnExecutor(r0, r8)
            goto Ld0
        Lcd:
            r7.a()
        Ld0:
            r7.d()
            r7.setClickable(r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.mediarouter.app.MediaRouteButton.<init>(android.content.Context, android.util.AttributeSet):void");
    }

    private Activity getActivity() {
        for (Context context = getContext(); context instanceof ContextWrapper; context = ((ContextWrapper) context).getBaseContext()) {
            if (context instanceof Activity) {
                return (Activity) context;
            }
        }
        return null;
    }

    private AbstractC1336M getFragmentManager() {
        Activity activity = getActivity();
        if (activity instanceof AbstractActivityC1369y) {
            return ((AbstractActivityC1369y) activity).P();
        }
        return null;
    }

    public final void a() {
        if (this.f9992i > 0) {
            AsyncTaskC0565a asyncTaskC0565a = this.f9990g;
            if (asyncTaskC0565a != null) {
                asyncTaskC0565a.cancel(false);
            }
            AsyncTaskC0565a asyncTaskC0565a2 = new AsyncTaskC0565a(this, this.f9992i, getContext());
            this.f9990g = asyncTaskC0565a2;
            this.f9992i = 0;
            asyncTaskC0565a2.executeOnExecutor(AsyncTask.SERIAL_EXECUTOR, new Void[0]);
        }
    }

    public final void b() {
        int i9;
        this.f9984a.getClass();
        t0.C f9 = t0.D.f();
        if (!f9.d()) {
            i9 = f9.f22848i;
        } else {
            i9 = 0;
        }
        if (this.f9993k != i9) {
            this.f9993k = i9;
            d();
            refreshDrawableState();
        }
        if (i9 == 1) {
            a();
        }
    }

    public final boolean c() {
        AbstractC1336M fragmentManager = getFragmentManager();
        if (fragmentManager != null) {
            this.f9984a.getClass();
            if (t0.D.f().d()) {
                if (fragmentManager.C("android.support.v7.mediarouter:MediaRouteChooserDialogFragment") != null) {
                    Log.w("MediaRouteButton", "showDialog(): Route chooser dialog already showing!");
                    return false;
                }
                this.f9987d.getClass();
                C0570f c0570f = new C0570f();
                C1988w c1988w = this.f9986c;
                if (c1988w != null) {
                    c0570f.l0();
                    if (!c0570f.f10092N0.equals(c1988w)) {
                        c0570f.f10092N0 = c1988w;
                        Bundle bundle = c0570f.f18390f;
                        if (bundle == null) {
                            bundle = new Bundle();
                        }
                        bundle.putBundle("selector", c1988w.f23047a);
                        c0570f.c0(bundle);
                        i.y yVar = c0570f.f10091M0;
                        if (yVar != null) {
                            if (c0570f.f10090L0) {
                                ((A) yVar).g(c1988w);
                            } else {
                                ((DialogC0569e) yVar).h(c1988w);
                            }
                        }
                    }
                    C1345a c1345a = new C1345a(fragmentManager);
                    c1345a.g(0, c0570f, "android.support.v7.mediarouter:MediaRouteChooserDialogFragment", 1);
                    c1345a.e(true);
                    return true;
                }
                throw new IllegalArgumentException("selector must not be null");
            }
            if (fragmentManager.C("android.support.v7.mediarouter:MediaRouteControllerDialogFragment") != null) {
                Log.w("MediaRouteButton", "showDialog(): Route controller dialog already showing!");
                return false;
            }
            this.f9987d.getClass();
            t tVar = new t();
            C1988w c1988w2 = this.f9986c;
            if (c1988w2 != null) {
                if (tVar.f10184N0 == null) {
                    Bundle bundle2 = tVar.f18390f;
                    if (bundle2 != null) {
                        tVar.f10184N0 = C1988w.b(bundle2.getBundle("selector"));
                    }
                    if (tVar.f10184N0 == null) {
                        tVar.f10184N0 = C1988w.f23046c;
                    }
                }
                if (!tVar.f10184N0.equals(c1988w2)) {
                    tVar.f10184N0 = c1988w2;
                    Bundle bundle3 = tVar.f18390f;
                    if (bundle3 == null) {
                        bundle3 = new Bundle();
                    }
                    bundle3.putBundle("selector", c1988w2.f23047a);
                    tVar.c0(bundle3);
                    i.y yVar2 = tVar.f10183M0;
                    if (yVar2 != null && tVar.f10182L0) {
                        ((N) yVar2).i(c1988w2);
                    }
                }
                C1345a c1345a2 = new C1345a(fragmentManager);
                c1345a2.g(0, tVar, "android.support.v7.mediarouter:MediaRouteControllerDialogFragment", 1);
                c1345a2.e(true);
                return true;
            }
            throw new IllegalArgumentException("selector must not be null");
        }
        throw new IllegalStateException("The activity must be a subclass of FragmentActivity");
    }

    public final void d() {
        int i9;
        int i10 = this.f9993k;
        if (i10 != 1) {
            if (i10 != 2) {
                i9 = co.notix.R.string.mr_cast_button_disconnected;
            } else {
                i9 = co.notix.R.string.mr_cast_button_connected;
            }
        } else {
            i9 = co.notix.R.string.mr_cast_button_connecting;
        }
        String string = getContext().getString(i9);
        setContentDescription(string);
        if (!this.f9997o || TextUtils.isEmpty(string)) {
            string = null;
        }
        D1.J(this, string);
    }

    @Override // android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        if (this.f9991h != null) {
            this.f9991h.setState(getDrawableState());
            if (this.f9991h.getCurrent() instanceof AnimationDrawable) {
                AnimationDrawable animationDrawable = (AnimationDrawable) this.f9991h.getCurrent();
                int i9 = this.f9993k;
                if (i9 != 1 && this.j == i9) {
                    if (i9 == 2 && !animationDrawable.isRunning()) {
                        animationDrawable.selectDrawable(animationDrawable.getNumberOfFrames() - 1);
                    }
                } else if (!animationDrawable.isRunning()) {
                    animationDrawable.start();
                }
            }
            invalidate();
        }
        this.j = this.f9993k;
    }

    public u getDialogFactory() {
        return this.f9987d;
    }

    public C1988w getRouteSelector() {
        return this.f9986c;
    }

    @Override // android.view.View
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f9991h;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    @Override // android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (isInEditMode()) {
            return;
        }
        this.f9988e = true;
        if (!this.f9986c.d()) {
            this.f9984a.a(this.f9986c, this.f9985b, 0);
        }
        b();
    }

    @Override // android.view.View
    public final int[] onCreateDrawableState(int i9) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i9 + 1);
        if (this.f9984a != null && !this.f9989f) {
            int i10 = this.f9993k;
            if (i10 != 1) {
                if (i10 == 2) {
                    View.mergeDrawableStates(onCreateDrawableState, f9982q);
                    return onCreateDrawableState;
                }
            } else {
                View.mergeDrawableStates(onCreateDrawableState, f9983r);
                return onCreateDrawableState;
            }
        }
        return onCreateDrawableState;
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        if (!isInEditMode()) {
            this.f9988e = false;
            if (!this.f9986c.d()) {
                this.f9984a.h(this.f9985b);
            }
        }
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.f9991h != null) {
            int paddingLeft = getPaddingLeft();
            int width = getWidth() - getPaddingRight();
            int paddingTop = getPaddingTop();
            int height = getHeight() - getPaddingBottom();
            int intrinsicWidth = this.f9991h.getIntrinsicWidth();
            int intrinsicHeight = this.f9991h.getIntrinsicHeight();
            int i9 = (((width - paddingLeft) - intrinsicWidth) / 2) + paddingLeft;
            int i10 = (((height - paddingTop) - intrinsicHeight) / 2) + paddingTop;
            this.f9991h.setBounds(i9, i10, intrinsicWidth + i9, intrinsicHeight + i10);
            this.f9991h.draw(canvas);
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i9, int i10) {
        int i11;
        int size = View.MeasureSpec.getSize(i9);
        int size2 = View.MeasureSpec.getSize(i10);
        int mode = View.MeasureSpec.getMode(i9);
        int mode2 = View.MeasureSpec.getMode(i10);
        Drawable drawable = this.f9991h;
        int i12 = 0;
        if (drawable != null) {
            i11 = getPaddingRight() + getPaddingLeft() + drawable.getIntrinsicWidth();
        } else {
            i11 = 0;
        }
        int max = Math.max(this.f9995m, i11);
        Drawable drawable2 = this.f9991h;
        if (drawable2 != null) {
            i12 = getPaddingBottom() + getPaddingTop() + drawable2.getIntrinsicHeight();
        }
        int max2 = Math.max(this.f9996n, i12);
        if (mode != Integer.MIN_VALUE) {
            if (mode != 1073741824) {
                size = max;
            }
        } else {
            size = Math.min(size, max);
        }
        if (mode2 != Integer.MIN_VALUE) {
            if (mode2 != 1073741824) {
                size2 = max2;
            }
        } else {
            size2 = Math.min(size2, max2);
        }
        setMeasuredDimension(size, size2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:114:0x00a0, code lost:
    
        if (s8.n.x(r2) != false) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0153, code lost:
    
        if (r2 != false) goto L43;
     */
    /* JADX WARN: Removed duplicated region for block: B:29:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00b1  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean performClick() {
        /*
            Method dump skipped, instructions count: 364
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.mediarouter.app.MediaRouteButton.performClick():boolean");
    }

    @Deprecated
    public void setAlwaysVisible(boolean z9) {
    }

    public void setCheatSheetEnabled(boolean z9) {
        if (z9 != this.f9997o) {
            this.f9997o = z9;
            d();
        }
    }

    public void setDialogFactory(u uVar) {
        if (uVar != null) {
            this.f9987d = uVar;
            return;
        }
        throw new IllegalArgumentException("factory must not be null");
    }

    public void setRemoteIndicatorDrawable(Drawable drawable) {
        this.f9992i = 0;
        setRemoteIndicatorDrawableInternal(drawable);
    }

    public void setRemoteIndicatorDrawableInternal(Drawable drawable) {
        boolean z9;
        AsyncTaskC0565a asyncTaskC0565a = this.f9990g;
        if (asyncTaskC0565a != null) {
            asyncTaskC0565a.cancel(false);
        }
        Drawable drawable2 = this.f9991h;
        if (drawable2 != null) {
            drawable2.setCallback(null);
            unscheduleDrawable(this.f9991h);
        }
        if (drawable != null) {
            ColorStateList colorStateList = this.f9994l;
            if (colorStateList != null) {
                drawable = drawable.mutate();
                drawable.setTintList(colorStateList);
            }
            drawable.setCallback(this);
            drawable.setState(getDrawableState());
            if (getVisibility() == 0) {
                z9 = true;
            } else {
                z9 = false;
            }
            drawable.setVisible(z9, false);
        }
        this.f9991h = drawable;
        refreshDrawableState();
    }

    public void setRouteSelector(C1988w c1988w) {
        if (c1988w != null) {
            if (!this.f9986c.equals(c1988w)) {
                if (this.f9988e) {
                    boolean d9 = this.f9986c.d();
                    F f9 = this.f9985b;
                    t0.D d10 = this.f9984a;
                    if (!d9) {
                        d10.h(f9);
                    }
                    if (!c1988w.d()) {
                        d10.a(c1988w, f9, 0);
                    }
                }
                this.f9986c = c1988w;
                b();
                return;
            }
            return;
        }
        throw new IllegalArgumentException("selector must not be null");
    }

    @Override // android.view.View
    public void setVisibility(int i9) {
        boolean z9;
        super.setVisibility(i9);
        Drawable drawable = this.f9991h;
        if (drawable != null) {
            if (i9 == 0) {
                z9 = true;
            } else {
                z9 = false;
            }
            drawable.setVisible(z9, false);
        }
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        if (!super.verifyDrawable(drawable) && drawable != this.f9991h) {
            return false;
        }
        return true;
    }
}
