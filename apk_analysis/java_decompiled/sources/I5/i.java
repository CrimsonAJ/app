package I5;

import P.F;
import P.H;
import P.Q;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Insets;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.widget.FrameLayout;
import co.notix.R;
import com.google.android.gms.internal.measurement.D1;
import g5.AbstractC1254a;
import java.util.WeakHashMap;
import k0.C1478a;
import l1.C1535g;
import s8.n;
import w5.p;

/* loaded from: classes.dex */
public abstract class i extends FrameLayout {

    /* renamed from: l */
    public static final h f3536l = new h(0);

    /* renamed from: a */
    public j f3537a;

    /* renamed from: b */
    public final F5.m f3538b;

    /* renamed from: c */
    public int f3539c;

    /* renamed from: d */
    public final float f3540d;

    /* renamed from: e */
    public final float f3541e;

    /* renamed from: f */
    public final int f3542f;

    /* renamed from: g */
    public final int f3543g;

    /* renamed from: h */
    public ColorStateList f3544h;

    /* renamed from: i */
    public PorterDuff.Mode f3545i;
    public Rect j;

    /* renamed from: k */
    public boolean f3546k;

    /* JADX WARN: Multi-variable type inference failed */
    public i(Context context, AttributeSet attributeSet) {
        super(M5.a.a(context, attributeSet, 0, 0), attributeSet);
        GradientDrawable gradientDrawable;
        Context context2 = getContext();
        TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, AbstractC1254a.f17727M);
        if (obtainStyledAttributes.hasValue(6)) {
            float dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(6, 0);
            WeakHashMap weakHashMap = Q.f5546a;
            H.k(this, dimensionPixelSize);
        }
        this.f3539c = obtainStyledAttributes.getInt(2, 0);
        if (obtainStyledAttributes.hasValue(8) || obtainStyledAttributes.hasValue(9)) {
            this.f3538b = F5.m.b(context2, attributeSet, 0, 0).a();
        }
        this.f3540d = obtainStyledAttributes.getFloat(3, 1.0f);
        setBackgroundTintList(D1.p(context2, obtainStyledAttributes, 4));
        setBackgroundTintMode(p.k(obtainStyledAttributes.getInt(5, -1), PorterDuff.Mode.SRC_IN));
        this.f3541e = obtainStyledAttributes.getFloat(1, 1.0f);
        this.f3542f = obtainStyledAttributes.getDimensionPixelSize(0, -1);
        this.f3543g = obtainStyledAttributes.getDimensionPixelSize(7, -1);
        obtainStyledAttributes.recycle();
        setOnTouchListener(f3536l);
        setFocusable(true);
        if (getBackground() == null) {
            int t7 = n.t(n.r(this, R.attr.colorSurface), getBackgroundOverlayColorAlpha(), n.r(this, R.attr.colorOnSurface));
            F5.m mVar = this.f3538b;
            if (mVar != null) {
                C1478a c1478a = j.f3548v;
                F5.h hVar = new F5.h(mVar);
                hVar.k(ColorStateList.valueOf(t7));
                gradientDrawable = hVar;
            } else {
                Resources resources = getResources();
                C1478a c1478a2 = j.f3548v;
                float dimension = resources.getDimension(R.dimen.mtrl_snackbar_background_corner_radius);
                GradientDrawable gradientDrawable2 = new GradientDrawable();
                gradientDrawable2.setShape(0);
                gradientDrawable2.setCornerRadius(dimension);
                gradientDrawable2.setColor(t7);
                gradientDrawable = gradientDrawable2;
            }
            ColorStateList colorStateList = this.f3544h;
            if (colorStateList != null) {
                gradientDrawable.setTintList(colorStateList);
            }
            WeakHashMap weakHashMap2 = Q.f5546a;
            setBackground(gradientDrawable);
        }
    }

    public static /* synthetic */ void a(i iVar, j jVar) {
        iVar.setBaseTransientBottomBar(jVar);
    }

    public void setBaseTransientBottomBar(j jVar) {
        this.f3537a = jVar;
    }

    public float getActionTextColorAlpha() {
        return this.f3541e;
    }

    public int getAnimationMode() {
        return this.f3539c;
    }

    public float getBackgroundOverlayColorAlpha() {
        return this.f3540d;
    }

    public int getMaxInlineActionWidth() {
        return this.f3543g;
    }

    public int getMaxWidth() {
        return this.f3542f;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        WindowInsets rootWindowInsets;
        Insets mandatorySystemGestureInsets;
        int i9;
        super.onAttachedToWindow();
        j jVar = this.f3537a;
        if (jVar != null && Build.VERSION.SDK_INT >= 29 && (rootWindowInsets = jVar.f3561i.getRootWindowInsets()) != null) {
            mandatorySystemGestureInsets = rootWindowInsets.getMandatorySystemGestureInsets();
            i9 = mandatorySystemGestureInsets.bottom;
            jVar.f3568q = i9;
            jVar.f();
        }
        WeakHashMap weakHashMap = Q.f5546a;
        F.c(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        boolean z9;
        boolean z10;
        super.onDetachedFromWindow();
        j jVar = this.f3537a;
        if (jVar != null) {
            C1535g r5 = C1535g.r();
            f fVar = jVar.f3572u;
            synchronized (r5.f20182a) {
                z9 = true;
                if (!r5.t(fVar)) {
                    m mVar = (m) r5.f20185d;
                    if (mVar != null && mVar.f3579a.get() == fVar) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (!z10) {
                        z9 = false;
                    }
                }
            }
            if (z9) {
                j.f3551y.post(new d(jVar, 1));
            }
        }
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z9, int i9, int i10, int i11, int i12) {
        super.onLayout(z9, i9, i10, i11, i12);
        j jVar = this.f3537a;
        if (jVar != null && jVar.f3570s) {
            jVar.e();
            jVar.f3570s = false;
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i9, int i10) {
        super.onMeasure(i9, i10);
        int i11 = this.f3542f;
        if (i11 > 0 && getMeasuredWidth() > i11) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(i11, 1073741824), i10);
        }
    }

    public void setAnimationMode(int i9) {
        this.f3539c = i9;
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        setBackgroundDrawable(drawable);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        if (drawable != null && this.f3544h != null) {
            drawable = drawable.mutate();
            drawable.setTintList(this.f3544h);
            drawable.setTintMode(this.f3545i);
        }
        super.setBackgroundDrawable(drawable);
    }

    @Override // android.view.View
    public void setBackgroundTintList(ColorStateList colorStateList) {
        this.f3544h = colorStateList;
        if (getBackground() != null) {
            Drawable mutate = getBackground().mutate();
            mutate.setTintList(colorStateList);
            mutate.setTintMode(this.f3545i);
            if (mutate != getBackground()) {
                super.setBackgroundDrawable(mutate);
            }
        }
    }

    @Override // android.view.View
    public void setBackgroundTintMode(PorterDuff.Mode mode) {
        this.f3545i = mode;
        if (getBackground() != null) {
            Drawable mutate = getBackground().mutate();
            mutate.setTintMode(mode);
            if (mutate != getBackground()) {
                super.setBackgroundDrawable(mutate);
            }
        }
    }

    @Override // android.view.View
    public void setLayoutParams(ViewGroup.LayoutParams layoutParams) {
        super.setLayoutParams(layoutParams);
        if (!this.f3546k && (layoutParams instanceof ViewGroup.MarginLayoutParams)) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            this.j = new Rect(marginLayoutParams.leftMargin, marginLayoutParams.topMargin, marginLayoutParams.rightMargin, marginLayoutParams.bottomMargin);
            j jVar = this.f3537a;
            if (jVar != null) {
                C1478a c1478a = j.f3548v;
                jVar.f();
            }
        }
    }

    @Override // android.view.View
    public void setOnClickListener(View.OnClickListener onClickListener) {
        h hVar;
        if (onClickListener != null) {
            hVar = null;
        } else {
            hVar = f3536l;
        }
        setOnTouchListener(hVar);
        super.setOnClickListener(onClickListener);
    }
}
