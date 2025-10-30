package com.google.android.material.textfield;

import A6.i;
import A6.s;
import E.d;
import F0.C0118w;
import F5.c;
import F5.e;
import F5.h;
import F5.l;
import F5.m;
import K5.A;
import K5.B;
import K5.C;
import K5.D;
import K5.q;
import K5.t;
import K5.u;
import K5.x;
import K5.z;
import M5.a;
import N.b;
import N.f;
import P.K;
import P.Q;
import X0.g;
import a.AbstractC0485a;
import android.R;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Build;
import android.os.Parcelable;
import android.text.Editable;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStructure;
import android.view.ViewTreeObserver;
import android.view.animation.LinearInterpolator;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import b5.G1;
import com.google.android.gms.internal.measurement.AbstractC1002u1;
import com.google.android.gms.internal.measurement.D1;
import com.google.android.material.internal.CheckableImageButton;
import g5.AbstractC1254a;
import h5.AbstractC1281a;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Locale;
import java.util.WeakHashMap;
import p.AbstractC1800i0;
import p.C1821t;
import s8.n;
import w5.AbstractC2144d;
import w5.C2143c;
import w5.p;

/* loaded from: classes.dex */
public class TextInputLayout extends LinearLayout implements ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: a1, reason: collision with root package name */
    public static final int[][] f16169a1 = {new int[]{R.attr.state_pressed}, new int[0]};

    /* renamed from: A, reason: collision with root package name */
    public ColorStateList f16170A;

    /* renamed from: A0, reason: collision with root package name */
    public ColorDrawable f16171A0;

    /* renamed from: B, reason: collision with root package name */
    public ColorStateList f16172B;

    /* renamed from: B0, reason: collision with root package name */
    public int f16173B0;

    /* renamed from: C, reason: collision with root package name */
    public boolean f16174C;

    /* renamed from: C0, reason: collision with root package name */
    public final LinkedHashSet f16175C0;

    /* renamed from: D, reason: collision with root package name */
    public CharSequence f16176D;

    /* renamed from: D0, reason: collision with root package name */
    public ColorDrawable f16177D0;

    /* renamed from: E0, reason: collision with root package name */
    public int f16178E0;

    /* renamed from: F0, reason: collision with root package name */
    public Drawable f16179F0;

    /* renamed from: G0, reason: collision with root package name */
    public ColorStateList f16180G0;

    /* renamed from: H0, reason: collision with root package name */
    public ColorStateList f16181H0;

    /* renamed from: I0, reason: collision with root package name */
    public int f16182I0;

    /* renamed from: J0, reason: collision with root package name */
    public int f16183J0;

    /* renamed from: K0, reason: collision with root package name */
    public int f16184K0;

    /* renamed from: L0, reason: collision with root package name */
    public ColorStateList f16185L0;

    /* renamed from: M0, reason: collision with root package name */
    public int f16186M0;

    /* renamed from: N0, reason: collision with root package name */
    public int f16187N0;

    /* renamed from: O0, reason: collision with root package name */
    public int f16188O0;

    /* renamed from: P0, reason: collision with root package name */
    public int f16189P0;

    /* renamed from: Q0, reason: collision with root package name */
    public int f16190Q0;

    /* renamed from: R0, reason: collision with root package name */
    public int f16191R0;

    /* renamed from: S0, reason: collision with root package name */
    public boolean f16192S0;

    /* renamed from: T0, reason: collision with root package name */
    public final C2143c f16193T0;

    /* renamed from: U0, reason: collision with root package name */
    public boolean f16194U0;

    /* renamed from: V0, reason: collision with root package name */
    public boolean f16195V0;

    /* renamed from: W0, reason: collision with root package name */
    public ValueAnimator f16196W0;

    /* renamed from: X0, reason: collision with root package name */
    public boolean f16197X0;

    /* renamed from: Y0, reason: collision with root package name */
    public boolean f16198Y0;

    /* renamed from: Z0, reason: collision with root package name */
    public boolean f16199Z0;

    /* renamed from: a, reason: collision with root package name */
    public final FrameLayout f16200a;

    /* renamed from: b, reason: collision with root package name */
    public final z f16201b;

    /* renamed from: c, reason: collision with root package name */
    public final q f16202c;

    /* renamed from: d, reason: collision with root package name */
    public EditText f16203d;

    /* renamed from: e, reason: collision with root package name */
    public CharSequence f16204e;

    /* renamed from: f, reason: collision with root package name */
    public int f16205f;

    /* renamed from: f0, reason: collision with root package name */
    public boolean f16206f0;

    /* renamed from: g, reason: collision with root package name */
    public int f16207g;

    /* renamed from: g0, reason: collision with root package name */
    public h f16208g0;

    /* renamed from: h, reason: collision with root package name */
    public int f16209h;

    /* renamed from: h0, reason: collision with root package name */
    public h f16210h0;

    /* renamed from: i, reason: collision with root package name */
    public int f16211i;

    /* renamed from: i0, reason: collision with root package name */
    public StateListDrawable f16212i0;
    public final u j;

    /* renamed from: j0, reason: collision with root package name */
    public boolean f16213j0;

    /* renamed from: k, reason: collision with root package name */
    public boolean f16214k;

    /* renamed from: k0, reason: collision with root package name */
    public h f16215k0;

    /* renamed from: l, reason: collision with root package name */
    public int f16216l;

    /* renamed from: l0, reason: collision with root package name */
    public h f16217l0;

    /* renamed from: m, reason: collision with root package name */
    public boolean f16218m;

    /* renamed from: m0, reason: collision with root package name */
    public m f16219m0;

    /* renamed from: n, reason: collision with root package name */
    public C f16220n;

    /* renamed from: n0, reason: collision with root package name */
    public boolean f16221n0;

    /* renamed from: o, reason: collision with root package name */
    public AppCompatTextView f16222o;

    /* renamed from: o0, reason: collision with root package name */
    public final int f16223o0;

    /* renamed from: p, reason: collision with root package name */
    public int f16224p;

    /* renamed from: p0, reason: collision with root package name */
    public int f16225p0;

    /* renamed from: q, reason: collision with root package name */
    public int f16226q;

    /* renamed from: q0, reason: collision with root package name */
    public int f16227q0;

    /* renamed from: r, reason: collision with root package name */
    public CharSequence f16228r;
    public int r0;

    /* renamed from: s, reason: collision with root package name */
    public boolean f16229s;

    /* renamed from: s0, reason: collision with root package name */
    public int f16230s0;

    /* renamed from: t, reason: collision with root package name */
    public AppCompatTextView f16231t;

    /* renamed from: t0, reason: collision with root package name */
    public int f16232t0;

    /* renamed from: u, reason: collision with root package name */
    public ColorStateList f16233u;

    /* renamed from: u0, reason: collision with root package name */
    public int f16234u0;

    /* renamed from: v, reason: collision with root package name */
    public int f16235v;

    /* renamed from: v0, reason: collision with root package name */
    public int f16236v0;

    /* renamed from: w, reason: collision with root package name */
    public g f16237w;

    /* renamed from: w0, reason: collision with root package name */
    public final Rect f16238w0;

    /* renamed from: x, reason: collision with root package name */
    public g f16239x;

    /* renamed from: x0, reason: collision with root package name */
    public final Rect f16240x0;

    /* renamed from: y, reason: collision with root package name */
    public ColorStateList f16241y;

    /* renamed from: y0, reason: collision with root package name */
    public final RectF f16242y0;

    /* renamed from: z, reason: collision with root package name */
    public ColorStateList f16243z;

    /* renamed from: z0, reason: collision with root package name */
    public Typeface f16244z0;

    public TextInputLayout(Context context, AttributeSet attributeSet) {
        super(a.a(context, attributeSet, co.notix.R.attr.textInputStyle, co.notix.R.style.Widget_Design_TextInputLayout), attributeSet, co.notix.R.attr.textInputStyle);
        this.f16205f = -1;
        this.f16207g = -1;
        this.f16209h = -1;
        this.f16211i = -1;
        this.j = new u(this);
        this.f16220n = new C6.a(11);
        this.f16238w0 = new Rect();
        this.f16240x0 = new Rect();
        this.f16242y0 = new RectF();
        this.f16175C0 = new LinkedHashSet();
        C2143c c2143c = new C2143c(this);
        this.f16193T0 = c2143c;
        this.f16199Z0 = false;
        Context context2 = getContext();
        setOrientation(1);
        setWillNotDraw(false);
        setAddStatesFromChildren(true);
        FrameLayout frameLayout = new FrameLayout(context2);
        this.f16200a = frameLayout;
        frameLayout.setAddStatesFromChildren(true);
        LinearInterpolator linearInterpolator = AbstractC1281a.f17925a;
        c2143c.f24237W = linearInterpolator;
        c2143c.i(false);
        c2143c.f24236V = linearInterpolator;
        c2143c.i(false);
        c2143c.l(8388659);
        G1 j = p.j(context2, attributeSet, AbstractC1254a.f17733S, co.notix.R.attr.textInputStyle, co.notix.R.style.Widget_Design_TextInputLayout, 22, 20, 40, 45, 49);
        z zVar = new z(this, j);
        this.f16201b = zVar;
        TypedArray typedArray = (TypedArray) j.f10718c;
        this.f16174C = typedArray.getBoolean(48, true);
        setHint(typedArray.getText(4));
        this.f16195V0 = typedArray.getBoolean(47, true);
        this.f16194U0 = typedArray.getBoolean(42, true);
        if (typedArray.hasValue(6)) {
            setMinEms(typedArray.getInt(6, -1));
        } else if (typedArray.hasValue(3)) {
            setMinWidth(typedArray.getDimensionPixelSize(3, -1));
        }
        if (typedArray.hasValue(5)) {
            setMaxEms(typedArray.getInt(5, -1));
        } else if (typedArray.hasValue(2)) {
            setMaxWidth(typedArray.getDimensionPixelSize(2, -1));
        }
        this.f16219m0 = m.b(context2, attributeSet, co.notix.R.attr.textInputStyle, co.notix.R.style.Widget_Design_TextInputLayout).a();
        this.f16223o0 = context2.getResources().getDimensionPixelOffset(co.notix.R.dimen.mtrl_textinput_box_label_cutout_padding);
        this.f16227q0 = typedArray.getDimensionPixelOffset(9, 0);
        this.f16230s0 = typedArray.getDimensionPixelSize(16, context2.getResources().getDimensionPixelSize(co.notix.R.dimen.mtrl_textinput_box_stroke_width_default));
        this.f16232t0 = typedArray.getDimensionPixelSize(17, context2.getResources().getDimensionPixelSize(co.notix.R.dimen.mtrl_textinput_box_stroke_width_focused));
        this.r0 = this.f16230s0;
        float dimension = typedArray.getDimension(13, -1.0f);
        float dimension2 = typedArray.getDimension(12, -1.0f);
        float dimension3 = typedArray.getDimension(10, -1.0f);
        float dimension4 = typedArray.getDimension(11, -1.0f);
        l e8 = this.f16219m0.e();
        if (dimension >= 0.0f) {
            e8.f2512e = new F5.a(dimension);
        }
        if (dimension2 >= 0.0f) {
            e8.f2513f = new F5.a(dimension2);
        }
        if (dimension3 >= 0.0f) {
            e8.f2514g = new F5.a(dimension3);
        }
        if (dimension4 >= 0.0f) {
            e8.f2515h = new F5.a(dimension4);
        }
        this.f16219m0 = e8.a();
        ColorStateList q9 = D1.q(context2, j, 7);
        if (q9 != null) {
            int defaultColor = q9.getDefaultColor();
            this.f16186M0 = defaultColor;
            this.f16236v0 = defaultColor;
            if (q9.isStateful()) {
                this.f16187N0 = q9.getColorForState(new int[]{-16842910}, -1);
                this.f16188O0 = q9.getColorForState(new int[]{R.attr.state_focused, R.attr.state_enabled}, -1);
                this.f16189P0 = q9.getColorForState(new int[]{R.attr.state_hovered, R.attr.state_enabled}, -1);
            } else {
                this.f16188O0 = this.f16186M0;
                ColorStateList c3 = d.c(context2, co.notix.R.color.mtrl_filled_background_color);
                this.f16187N0 = c3.getColorForState(new int[]{-16842910}, -1);
                this.f16189P0 = c3.getColorForState(new int[]{R.attr.state_hovered}, -1);
            }
        } else {
            this.f16236v0 = 0;
            this.f16186M0 = 0;
            this.f16187N0 = 0;
            this.f16188O0 = 0;
            this.f16189P0 = 0;
        }
        if (typedArray.hasValue(1)) {
            ColorStateList n7 = j.n(1);
            this.f16181H0 = n7;
            this.f16180G0 = n7;
        }
        ColorStateList q10 = D1.q(context2, j, 14);
        this.f16184K0 = typedArray.getColor(14, 0);
        this.f16182I0 = context2.getColor(co.notix.R.color.mtrl_textinput_default_box_stroke_color);
        this.f16190Q0 = context2.getColor(co.notix.R.color.mtrl_textinput_disabled_color);
        this.f16183J0 = context2.getColor(co.notix.R.color.mtrl_textinput_hovered_box_stroke_color);
        if (q10 != null) {
            setBoxStrokeColorStateList(q10);
        }
        if (typedArray.hasValue(15)) {
            setBoxStrokeErrorColor(D1.q(context2, j, 15));
        }
        if (typedArray.getResourceId(49, -1) != -1) {
            setHintTextAppearance(typedArray.getResourceId(49, 0));
        }
        this.f16170A = j.n(24);
        this.f16172B = j.n(25);
        int resourceId = typedArray.getResourceId(40, 0);
        CharSequence text = typedArray.getText(35);
        int i9 = typedArray.getInt(34, 1);
        boolean z9 = typedArray.getBoolean(36, false);
        int resourceId2 = typedArray.getResourceId(45, 0);
        boolean z10 = typedArray.getBoolean(44, false);
        CharSequence text2 = typedArray.getText(43);
        int resourceId3 = typedArray.getResourceId(57, 0);
        CharSequence text3 = typedArray.getText(56);
        boolean z11 = typedArray.getBoolean(18, false);
        setCounterMaxLength(typedArray.getInt(19, -1));
        this.f16226q = typedArray.getResourceId(22, 0);
        this.f16224p = typedArray.getResourceId(20, 0);
        setBoxBackgroundMode(typedArray.getInt(8, 0));
        setErrorContentDescription(text);
        setErrorAccessibilityLiveRegion(i9);
        setCounterOverflowTextAppearance(this.f16224p);
        setHelperTextTextAppearance(resourceId2);
        setErrorTextAppearance(resourceId);
        setCounterTextAppearance(this.f16226q);
        setPlaceholderText(text3);
        setPlaceholderTextAppearance(resourceId3);
        if (typedArray.hasValue(41)) {
            setErrorTextColor(j.n(41));
        }
        if (typedArray.hasValue(46)) {
            setHelperTextColor(j.n(46));
        }
        if (typedArray.hasValue(50)) {
            setHintTextColor(j.n(50));
        }
        if (typedArray.hasValue(23)) {
            setCounterTextColor(j.n(23));
        }
        if (typedArray.hasValue(21)) {
            setCounterOverflowTextColor(j.n(21));
        }
        if (typedArray.hasValue(58)) {
            setPlaceholderTextColor(j.n(58));
        }
        q qVar = new q(this, j);
        this.f16202c = qVar;
        boolean z12 = typedArray.getBoolean(0, true);
        j.y();
        WeakHashMap weakHashMap = Q.f5546a;
        setImportantForAccessibility(2);
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 26 && i10 >= 26) {
            K.b(this, 1);
        }
        frameLayout.addView(zVar);
        frameLayout.addView(qVar);
        addView(frameLayout);
        setEnabled(z12);
        setHelperTextEnabled(z10);
        setErrorEnabled(z9);
        setCounterEnabled(z11);
        setHelperText(text2);
    }

    private Drawable getEditTextBoxBackground() {
        int i9;
        EditText editText = this.f16203d;
        if ((editText instanceof AutoCompleteTextView) && !M4.a.t(editText)) {
            int r5 = n.r(this.f16203d, co.notix.R.attr.colorControlHighlight);
            int i10 = this.f16225p0;
            int[][] iArr = f16169a1;
            if (i10 == 2) {
                Context context = getContext();
                h hVar = this.f16208g0;
                TypedValue Z6 = AbstractC1002u1.Z(co.notix.R.attr.colorSurface, context, "TextInputLayout");
                int i11 = Z6.resourceId;
                if (i11 != 0) {
                    i9 = context.getColor(i11);
                } else {
                    i9 = Z6.data;
                }
                h hVar2 = new h(hVar.f2483a.f2466a);
                int t7 = n.t(r5, 0.1f, i9);
                hVar2.k(new ColorStateList(iArr, new int[]{t7, 0}));
                hVar2.setTint(i9);
                ColorStateList colorStateList = new ColorStateList(iArr, new int[]{t7, i9});
                h hVar3 = new h(hVar.f2483a.f2466a);
                hVar3.setTint(-1);
                return new LayerDrawable(new Drawable[]{new RippleDrawable(colorStateList, hVar2, hVar3), hVar});
            }
            if (i10 == 1) {
                h hVar4 = this.f16208g0;
                int i12 = this.f16236v0;
                return new RippleDrawable(new ColorStateList(iArr, new int[]{n.t(r5, 0.1f, i12), i12}), hVar4, hVar4);
            }
            return null;
        }
        return this.f16208g0;
    }

    private Drawable getOrCreateFilledDropDownMenuBackground() {
        if (this.f16212i0 == null) {
            StateListDrawable stateListDrawable = new StateListDrawable();
            this.f16212i0 = stateListDrawable;
            stateListDrawable.addState(new int[]{R.attr.state_above_anchor}, getOrCreateOutlinedDropDownMenuBackground());
            this.f16212i0.addState(new int[0], f(false));
        }
        return this.f16212i0;
    }

    private Drawable getOrCreateOutlinedDropDownMenuBackground() {
        if (this.f16210h0 == null) {
            this.f16210h0 = f(true);
        }
        return this.f16210h0;
    }

    public static void k(ViewGroup viewGroup, boolean z9) {
        int childCount = viewGroup.getChildCount();
        for (int i9 = 0; i9 < childCount; i9++) {
            View childAt = viewGroup.getChildAt(i9);
            childAt.setEnabled(z9);
            if (childAt instanceof ViewGroup) {
                k((ViewGroup) childAt, z9);
            }
        }
    }

    private void setEditText(EditText editText) {
        if (this.f16203d == null) {
            if (getEndIconMode() != 3 && !(editText instanceof TextInputEditText)) {
                Log.i("TextInputLayout", "EditText added is not a TextInputEditText. Please switch to using that class instead.");
            }
            this.f16203d = editText;
            int i9 = this.f16205f;
            if (i9 != -1) {
                setMinEms(i9);
            } else {
                setMinWidth(this.f16209h);
            }
            int i10 = this.f16207g;
            if (i10 != -1) {
                setMaxEms(i10);
            } else {
                setMaxWidth(this.f16211i);
            }
            this.f16213j0 = false;
            i();
            setTextInputAccessibilityDelegate(new B(this));
            Typeface typeface = this.f16203d.getTypeface();
            C2143c c2143c = this.f16193T0;
            boolean m9 = c2143c.m(typeface);
            boolean o9 = c2143c.o(typeface);
            if (m9 || o9) {
                c2143c.i(false);
            }
            float textSize = this.f16203d.getTextSize();
            if (c2143c.f24261l != textSize) {
                c2143c.f24261l = textSize;
                c2143c.i(false);
            }
            int i11 = Build.VERSION.SDK_INT;
            float letterSpacing = this.f16203d.getLetterSpacing();
            if (c2143c.f24253g0 != letterSpacing) {
                c2143c.f24253g0 = letterSpacing;
                c2143c.i(false);
            }
            int gravity = this.f16203d.getGravity();
            c2143c.l((gravity & (-113)) | 48);
            if (c2143c.j != gravity) {
                c2143c.j = gravity;
                c2143c.i(false);
            }
            WeakHashMap weakHashMap = Q.f5546a;
            this.f16191R0 = editText.getMinimumHeight();
            this.f16203d.addTextChangedListener(new A(this, editText));
            if (this.f16180G0 == null) {
                this.f16180G0 = this.f16203d.getHintTextColors();
            }
            if (this.f16174C) {
                if (TextUtils.isEmpty(this.f16176D)) {
                    CharSequence hint = this.f16203d.getHint();
                    this.f16204e = hint;
                    setHint(hint);
                    this.f16203d.setHint((CharSequence) null);
                }
                this.f16206f0 = true;
            }
            if (i11 >= 29) {
                p();
            }
            if (this.f16222o != null) {
                n(this.f16203d.getText());
            }
            r();
            this.j.b();
            this.f16201b.bringToFront();
            q qVar = this.f16202c;
            qVar.bringToFront();
            Iterator it = this.f16175C0.iterator();
            while (it.hasNext()) {
                ((K5.n) it.next()).a(this);
            }
            qVar.m();
            if (!isEnabled()) {
                editText.setEnabled(false);
            }
            u(false, true);
            return;
        }
        throw new IllegalArgumentException("We already have an EditText, can only have one");
    }

    private void setHintInternal(CharSequence charSequence) {
        if (!TextUtils.equals(charSequence, this.f16176D)) {
            this.f16176D = charSequence;
            C2143c c2143c = this.f16193T0;
            if (charSequence == null || !TextUtils.equals(c2143c.f24222G, charSequence)) {
                c2143c.f24222G = charSequence;
                c2143c.f24223H = null;
                Bitmap bitmap = c2143c.K;
                if (bitmap != null) {
                    bitmap.recycle();
                    c2143c.K = null;
                }
                c2143c.i(false);
            }
            if (!this.f16192S0) {
                j();
            }
        }
    }

    private void setPlaceholderTextEnabled(boolean z9) {
        if (this.f16229s == z9) {
            return;
        }
        if (z9) {
            AppCompatTextView appCompatTextView = this.f16231t;
            if (appCompatTextView != null) {
                this.f16200a.addView(appCompatTextView);
                this.f16231t.setVisibility(0);
            }
        } else {
            AppCompatTextView appCompatTextView2 = this.f16231t;
            if (appCompatTextView2 != null) {
                appCompatTextView2.setVisibility(8);
            }
            this.f16231t = null;
        }
        this.f16229s = z9;
    }

    public final void a(float f9) {
        C2143c c2143c = this.f16193T0;
        if (c2143c.f24242b == f9) {
            return;
        }
        if (this.f16196W0 == null) {
            ValueAnimator valueAnimator = new ValueAnimator();
            this.f16196W0 = valueAnimator;
            valueAnimator.setInterpolator(Z0.a.z(getContext(), co.notix.R.attr.motionEasingEmphasizedInterpolator, AbstractC1281a.f17926b));
            this.f16196W0.setDuration(Z0.a.y(getContext(), co.notix.R.attr.motionDurationMedium4, 167));
            this.f16196W0.addUpdateListener(new C0118w(3, this));
        }
        this.f16196W0.setFloatValues(c2143c.f24242b, f9);
        this.f16196W0.start();
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i9, ViewGroup.LayoutParams layoutParams) {
        if (view instanceof EditText) {
            FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(layoutParams);
            layoutParams2.gravity = (layoutParams2.gravity & (-113)) | 16;
            FrameLayout frameLayout = this.f16200a;
            frameLayout.addView(view, layoutParams2);
            frameLayout.setLayoutParams(layoutParams);
            t();
            setEditText((EditText) view);
            return;
        }
        super.addView(view, i9, layoutParams);
    }

    public final void b() {
        ColorStateList valueOf;
        int i9;
        int i10;
        h hVar = this.f16208g0;
        if (hVar == null) {
            return;
        }
        m mVar = hVar.f2483a.f2466a;
        m mVar2 = this.f16219m0;
        if (mVar != mVar2) {
            hVar.setShapeAppearanceModel(mVar2);
        }
        if (this.f16225p0 == 2 && (i9 = this.r0) > -1 && (i10 = this.f16234u0) != 0) {
            h hVar2 = this.f16208g0;
            hVar2.f2483a.j = i9;
            hVar2.invalidateSelf();
            hVar2.m(ColorStateList.valueOf(i10));
        }
        int i11 = this.f16236v0;
        if (this.f16225p0 == 1) {
            i11 = H.a.f(this.f16236v0, n.q(getContext(), co.notix.R.attr.colorSurface, 0));
        }
        this.f16236v0 = i11;
        this.f16208g0.k(ColorStateList.valueOf(i11));
        h hVar3 = this.f16215k0;
        if (hVar3 != null && this.f16217l0 != null) {
            if (this.r0 > -1 && this.f16234u0 != 0) {
                if (this.f16203d.isFocused()) {
                    valueOf = ColorStateList.valueOf(this.f16182I0);
                } else {
                    valueOf = ColorStateList.valueOf(this.f16234u0);
                }
                hVar3.k(valueOf);
                this.f16217l0.k(ColorStateList.valueOf(this.f16234u0));
            }
            invalidate();
        }
        s();
    }

    public final int c() {
        float e8;
        if (!this.f16174C) {
            return 0;
        }
        int i9 = this.f16225p0;
        C2143c c2143c = this.f16193T0;
        if (i9 != 0) {
            if (i9 != 2) {
                return 0;
            }
            e8 = c2143c.e() / 2.0f;
        } else {
            e8 = c2143c.e();
        }
        return (int) e8;
    }

    public final g d() {
        g gVar = new g();
        gVar.f8197c = Z0.a.y(getContext(), co.notix.R.attr.motionDurationShort2, 87);
        gVar.f8198d = Z0.a.z(getContext(), co.notix.R.attr.motionEasingLinearInterpolator, AbstractC1281a.f17925a);
        return gVar;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchProvideAutofillStructure(ViewStructure viewStructure, int i9) {
        EditText editText = this.f16203d;
        if (editText == null) {
            super.dispatchProvideAutofillStructure(viewStructure, i9);
            return;
        }
        if (this.f16204e != null) {
            boolean z9 = this.f16206f0;
            this.f16206f0 = false;
            CharSequence hint = editText.getHint();
            this.f16203d.setHint(this.f16204e);
            try {
                super.dispatchProvideAutofillStructure(viewStructure, i9);
                return;
            } finally {
                this.f16203d.setHint(hint);
                this.f16206f0 = z9;
            }
        }
        viewStructure.setAutofillId(getAutofillId());
        onProvideAutofillStructure(viewStructure, i9);
        onProvideAutofillVirtualStructure(viewStructure, i9);
        FrameLayout frameLayout = this.f16200a;
        viewStructure.setChildCount(frameLayout.getChildCount());
        for (int i10 = 0; i10 < frameLayout.getChildCount(); i10++) {
            View childAt = frameLayout.getChildAt(i10);
            ViewStructure newChild = viewStructure.newChild(i10);
            childAt.dispatchProvideAutofillStructure(newChild, i9);
            if (childAt == this.f16203d) {
                newChild.setHint(getHint());
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchRestoreInstanceState(SparseArray sparseArray) {
        this.f16198Y0 = true;
        super.dispatchRestoreInstanceState(sparseArray);
        this.f16198Y0 = false;
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        h hVar;
        super.draw(canvas);
        boolean z9 = this.f16174C;
        C2143c c2143c = this.f16193T0;
        if (z9) {
            c2143c.d(canvas);
        }
        if (this.f16217l0 != null && (hVar = this.f16215k0) != null) {
            hVar.draw(canvas);
            if (this.f16203d.isFocused()) {
                Rect bounds = this.f16217l0.getBounds();
                Rect bounds2 = this.f16215k0.getBounds();
                float f9 = c2143c.f24242b;
                int centerX = bounds2.centerX();
                bounds.left = AbstractC1281a.c(centerX, f9, bounds2.left);
                bounds.right = AbstractC1281a.c(centerX, f9, bounds2.right);
                this.f16217l0.draw(canvas);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x004f  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void drawableStateChanged() {
        /*
            r4 = this;
            boolean r0 = r4.f16197X0
            if (r0 == 0) goto L5
            return
        L5:
            r0 = 1
            r4.f16197X0 = r0
            super.drawableStateChanged()
            int[] r1 = r4.getDrawableState()
            r2 = 0
            w5.c r3 = r4.f16193T0
            if (r3 == 0) goto L2f
            r3.f24232R = r1
            android.content.res.ColorStateList r1 = r3.f24267o
            if (r1 == 0) goto L20
            boolean r1 = r1.isStateful()
            if (r1 != 0) goto L2a
        L20:
            android.content.res.ColorStateList r1 = r3.f24265n
            if (r1 == 0) goto L2f
            boolean r1 = r1.isStateful()
            if (r1 == 0) goto L2f
        L2a:
            r3.i(r2)
            r1 = r0
            goto L30
        L2f:
            r1 = r2
        L30:
            android.widget.EditText r3 = r4.f16203d
            if (r3 == 0) goto L47
            java.util.WeakHashMap r3 = P.Q.f5546a
            boolean r3 = r4.isLaidOut()
            if (r3 == 0) goto L43
            boolean r3 = r4.isEnabled()
            if (r3 == 0) goto L43
            goto L44
        L43:
            r0 = r2
        L44:
            r4.u(r0, r2)
        L47:
            r4.r()
            r4.x()
            if (r1 == 0) goto L52
            r4.invalidate()
        L52:
            r4.f16197X0 = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.textfield.TextInputLayout.drawableStateChanged():void");
    }

    public final boolean e() {
        if (this.f16174C && !TextUtils.isEmpty(this.f16176D) && (this.f16208g0 instanceof K5.h)) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.Object, F5.m] */
    /* JADX WARN: Type inference failed for: r6v1, types: [a.a, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v0, types: [a.a, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v0, types: [a.a, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v0, types: [a.a, java.lang.Object] */
    public final h f(boolean z9) {
        float f9;
        float dimensionPixelOffset;
        ColorStateList colorStateList;
        int i9;
        int i10 = 0;
        float dimensionPixelOffset2 = getResources().getDimensionPixelOffset(co.notix.R.dimen.mtrl_shape_corner_size_small_component);
        if (z9) {
            f9 = dimensionPixelOffset2;
        } else {
            f9 = 0.0f;
        }
        EditText editText = this.f16203d;
        if (editText instanceof x) {
            dimensionPixelOffset = ((x) editText).getPopupElevation();
        } else {
            dimensionPixelOffset = getResources().getDimensionPixelOffset(co.notix.R.dimen.m3_comp_outlined_autocomplete_menu_container_elevation);
        }
        int dimensionPixelOffset3 = getResources().getDimensionPixelOffset(co.notix.R.dimen.mtrl_exposed_dropdown_menu_popup_vertical_padding);
        ?? obj = new Object();
        ?? obj2 = new Object();
        ?? obj3 = new Object();
        ?? obj4 = new Object();
        e eVar = new e(i10);
        e eVar2 = new e(i10);
        e eVar3 = new e(i10);
        e eVar4 = new e(i10);
        F5.a aVar = new F5.a(f9);
        F5.a aVar2 = new F5.a(f9);
        F5.a aVar3 = new F5.a(dimensionPixelOffset2);
        F5.a aVar4 = new F5.a(dimensionPixelOffset2);
        ?? obj5 = new Object();
        obj5.f2519a = obj;
        obj5.f2520b = obj2;
        obj5.f2521c = obj3;
        obj5.f2522d = obj4;
        obj5.f2523e = aVar;
        obj5.f2524f = aVar2;
        obj5.f2525g = aVar4;
        obj5.f2526h = aVar3;
        obj5.f2527i = eVar;
        obj5.j = eVar2;
        obj5.f2528k = eVar3;
        obj5.f2529l = eVar4;
        EditText editText2 = this.f16203d;
        if (editText2 instanceof x) {
            colorStateList = ((x) editText2).getDropDownBackgroundTintList();
        } else {
            colorStateList = null;
        }
        Context context = getContext();
        if (colorStateList == null) {
            Paint paint = h.f2482x;
            TypedValue Z6 = AbstractC1002u1.Z(co.notix.R.attr.colorSurface, context, h.class.getSimpleName());
            int i11 = Z6.resourceId;
            if (i11 != 0) {
                i9 = context.getColor(i11);
            } else {
                i9 = Z6.data;
            }
            colorStateList = ColorStateList.valueOf(i9);
        }
        h hVar = new h();
        hVar.i(context);
        hVar.k(colorStateList);
        hVar.j(dimensionPixelOffset);
        hVar.setShapeAppearanceModel(obj5);
        F5.g gVar = hVar.f2483a;
        if (gVar.f2472g == null) {
            gVar.f2472g = new Rect();
        }
        hVar.f2483a.f2472g.set(0, dimensionPixelOffset3, 0, dimensionPixelOffset3);
        hVar.invalidateSelf();
        return hVar;
    }

    public final int g(int i9, boolean z9) {
        int compoundPaddingLeft;
        if (!z9 && getPrefixText() != null) {
            compoundPaddingLeft = this.f16201b.a();
        } else if (z9 && getSuffixText() != null) {
            compoundPaddingLeft = this.f16202c.c();
        } else {
            compoundPaddingLeft = this.f16203d.getCompoundPaddingLeft();
        }
        return compoundPaddingLeft + i9;
    }

    @Override // android.widget.LinearLayout, android.view.View
    public int getBaseline() {
        EditText editText = this.f16203d;
        if (editText != null) {
            return c() + getPaddingTop() + editText.getBaseline();
        }
        return super.getBaseline();
    }

    public h getBoxBackground() {
        int i9 = this.f16225p0;
        if (i9 != 1 && i9 != 2) {
            throw new IllegalStateException();
        }
        return this.f16208g0;
    }

    public int getBoxBackgroundColor() {
        return this.f16236v0;
    }

    public int getBoxBackgroundMode() {
        return this.f16225p0;
    }

    public int getBoxCollapsedPaddingTop() {
        return this.f16227q0;
    }

    public float getBoxCornerRadiusBottomEnd() {
        boolean h7 = p.h(this);
        RectF rectF = this.f16242y0;
        if (h7) {
            return this.f16219m0.f2526h.a(rectF);
        }
        return this.f16219m0.f2525g.a(rectF);
    }

    public float getBoxCornerRadiusBottomStart() {
        boolean h7 = p.h(this);
        RectF rectF = this.f16242y0;
        if (h7) {
            return this.f16219m0.f2525g.a(rectF);
        }
        return this.f16219m0.f2526h.a(rectF);
    }

    public float getBoxCornerRadiusTopEnd() {
        boolean h7 = p.h(this);
        RectF rectF = this.f16242y0;
        if (h7) {
            return this.f16219m0.f2523e.a(rectF);
        }
        return this.f16219m0.f2524f.a(rectF);
    }

    public float getBoxCornerRadiusTopStart() {
        boolean h7 = p.h(this);
        RectF rectF = this.f16242y0;
        if (h7) {
            return this.f16219m0.f2524f.a(rectF);
        }
        return this.f16219m0.f2523e.a(rectF);
    }

    public int getBoxStrokeColor() {
        return this.f16184K0;
    }

    public ColorStateList getBoxStrokeErrorColor() {
        return this.f16185L0;
    }

    public int getBoxStrokeWidth() {
        return this.f16230s0;
    }

    public int getBoxStrokeWidthFocused() {
        return this.f16232t0;
    }

    public int getCounterMaxLength() {
        return this.f16216l;
    }

    public CharSequence getCounterOverflowDescription() {
        AppCompatTextView appCompatTextView;
        if (this.f16214k && this.f16218m && (appCompatTextView = this.f16222o) != null) {
            return appCompatTextView.getContentDescription();
        }
        return null;
    }

    public ColorStateList getCounterOverflowTextColor() {
        return this.f16243z;
    }

    public ColorStateList getCounterTextColor() {
        return this.f16241y;
    }

    public ColorStateList getCursorColor() {
        return this.f16170A;
    }

    public ColorStateList getCursorErrorColor() {
        return this.f16172B;
    }

    public ColorStateList getDefaultHintTextColor() {
        return this.f16180G0;
    }

    public EditText getEditText() {
        return this.f16203d;
    }

    public CharSequence getEndIconContentDescription() {
        return this.f16202c.f4363g.getContentDescription();
    }

    public Drawable getEndIconDrawable() {
        return this.f16202c.f4363g.getDrawable();
    }

    public int getEndIconMinSize() {
        return this.f16202c.f4368m;
    }

    public int getEndIconMode() {
        return this.f16202c.f4365i;
    }

    public ImageView.ScaleType getEndIconScaleType() {
        return this.f16202c.f4369n;
    }

    public CheckableImageButton getEndIconView() {
        return this.f16202c.f4363g;
    }

    public CharSequence getError() {
        u uVar = this.j;
        if (uVar.f4406q) {
            return uVar.f4405p;
        }
        return null;
    }

    public int getErrorAccessibilityLiveRegion() {
        return this.j.f4409t;
    }

    public CharSequence getErrorContentDescription() {
        return this.j.f4408s;
    }

    public int getErrorCurrentTextColors() {
        AppCompatTextView appCompatTextView = this.j.f4407r;
        if (appCompatTextView != null) {
            return appCompatTextView.getCurrentTextColor();
        }
        return -1;
    }

    public Drawable getErrorIconDrawable() {
        return this.f16202c.f4359c.getDrawable();
    }

    public CharSequence getHelperText() {
        u uVar = this.j;
        if (uVar.f4413x) {
            return uVar.f4412w;
        }
        return null;
    }

    public int getHelperTextCurrentTextColor() {
        AppCompatTextView appCompatTextView = this.j.f4414y;
        if (appCompatTextView != null) {
            return appCompatTextView.getCurrentTextColor();
        }
        return -1;
    }

    public CharSequence getHint() {
        if (this.f16174C) {
            return this.f16176D;
        }
        return null;
    }

    public final float getHintCollapsedTextHeight() {
        return this.f16193T0.e();
    }

    public final int getHintCurrentCollapsedTextColor() {
        C2143c c2143c = this.f16193T0;
        return c2143c.f(c2143c.f24267o);
    }

    public ColorStateList getHintTextColor() {
        return this.f16181H0;
    }

    public C getLengthCounter() {
        return this.f16220n;
    }

    public int getMaxEms() {
        return this.f16207g;
    }

    public int getMaxWidth() {
        return this.f16211i;
    }

    public int getMinEms() {
        return this.f16205f;
    }

    public int getMinWidth() {
        return this.f16209h;
    }

    @Deprecated
    public CharSequence getPasswordVisibilityToggleContentDescription() {
        return this.f16202c.f4363g.getContentDescription();
    }

    @Deprecated
    public Drawable getPasswordVisibilityToggleDrawable() {
        return this.f16202c.f4363g.getDrawable();
    }

    public CharSequence getPlaceholderText() {
        if (this.f16229s) {
            return this.f16228r;
        }
        return null;
    }

    public int getPlaceholderTextAppearance() {
        return this.f16235v;
    }

    public ColorStateList getPlaceholderTextColor() {
        return this.f16233u;
    }

    public CharSequence getPrefixText() {
        return this.f16201b.f4433c;
    }

    public ColorStateList getPrefixTextColor() {
        return this.f16201b.f4432b.getTextColors();
    }

    public TextView getPrefixTextView() {
        return this.f16201b.f4432b;
    }

    public m getShapeAppearanceModel() {
        return this.f16219m0;
    }

    public CharSequence getStartIconContentDescription() {
        return this.f16201b.f4434d.getContentDescription();
    }

    public Drawable getStartIconDrawable() {
        return this.f16201b.f4434d.getDrawable();
    }

    public int getStartIconMinSize() {
        return this.f16201b.f4437g;
    }

    public ImageView.ScaleType getStartIconScaleType() {
        return this.f16201b.f4438h;
    }

    public CharSequence getSuffixText() {
        return this.f16202c.f4371p;
    }

    public ColorStateList getSuffixTextColor() {
        return this.f16202c.f4372q.getTextColors();
    }

    public TextView getSuffixTextView() {
        return this.f16202c.f4372q;
    }

    public Typeface getTypeface() {
        return this.f16244z0;
    }

    public final int h(int i9, boolean z9) {
        int compoundPaddingRight;
        if (!z9 && getSuffixText() != null) {
            compoundPaddingRight = this.f16202c.c();
        } else if (z9 && getPrefixText() != null) {
            compoundPaddingRight = this.f16201b.a();
        } else {
            compoundPaddingRight = this.f16203d.getCompoundPaddingRight();
        }
        return i9 - compoundPaddingRight;
    }

    /* JADX WARN: Type inference failed for: r0v37, types: [K5.h, F5.h] */
    public final void i() {
        int i9 = this.f16225p0;
        if (i9 != 0) {
            if (i9 != 1) {
                if (i9 == 2) {
                    if (this.f16174C && !(this.f16208g0 instanceof K5.h)) {
                        m mVar = this.f16219m0;
                        int i10 = K5.h.f4330z;
                        if (mVar == null) {
                            mVar = new m();
                        }
                        K5.g gVar = new K5.g(mVar, new RectF());
                        ?? hVar = new h(gVar);
                        hVar.f4331y = gVar;
                        this.f16208g0 = hVar;
                    } else {
                        this.f16208g0 = new h(this.f16219m0);
                    }
                    this.f16215k0 = null;
                    this.f16217l0 = null;
                } else {
                    throw new IllegalArgumentException(u0.z.g(new StringBuilder(), this.f16225p0, " is illegal; only @BoxBackgroundMode constants are supported."));
                }
            } else {
                this.f16208g0 = new h(this.f16219m0);
                this.f16215k0 = new h();
                this.f16217l0 = new h();
            }
        } else {
            this.f16208g0 = null;
            this.f16215k0 = null;
            this.f16217l0 = null;
        }
        s();
        x();
        if (this.f16225p0 == 1) {
            if (getContext().getResources().getConfiguration().fontScale >= 2.0f) {
                this.f16227q0 = getResources().getDimensionPixelSize(co.notix.R.dimen.material_font_2_0_box_collapsed_padding_top);
            } else if (D1.C(getContext())) {
                this.f16227q0 = getResources().getDimensionPixelSize(co.notix.R.dimen.material_font_1_3_box_collapsed_padding_top);
            }
        }
        if (this.f16203d != null && this.f16225p0 == 1) {
            if (getContext().getResources().getConfiguration().fontScale >= 2.0f) {
                EditText editText = this.f16203d;
                WeakHashMap weakHashMap = Q.f5546a;
                editText.setPaddingRelative(editText.getPaddingStart(), getResources().getDimensionPixelSize(co.notix.R.dimen.material_filled_edittext_font_2_0_padding_top), this.f16203d.getPaddingEnd(), getResources().getDimensionPixelSize(co.notix.R.dimen.material_filled_edittext_font_2_0_padding_bottom));
            } else if (D1.C(getContext())) {
                EditText editText2 = this.f16203d;
                WeakHashMap weakHashMap2 = Q.f5546a;
                editText2.setPaddingRelative(editText2.getPaddingStart(), getResources().getDimensionPixelSize(co.notix.R.dimen.material_filled_edittext_font_1_3_padding_top), this.f16203d.getPaddingEnd(), getResources().getDimensionPixelSize(co.notix.R.dimen.material_filled_edittext_font_1_3_padding_bottom));
            }
        }
        if (this.f16225p0 != 0) {
            t();
        }
        EditText editText3 = this.f16203d;
        if (editText3 instanceof AutoCompleteTextView) {
            AutoCompleteTextView autoCompleteTextView = (AutoCompleteTextView) editText3;
            if (autoCompleteTextView.getDropDownBackground() == null) {
                int i11 = this.f16225p0;
                if (i11 == 2) {
                    autoCompleteTextView.setDropDownBackgroundDrawable(getOrCreateOutlinedDropDownMenuBackground());
                } else if (i11 == 1) {
                    autoCompleteTextView.setDropDownBackgroundDrawable(getOrCreateFilledDropDownMenuBackground());
                }
            }
        }
    }

    public final void j() {
        float f9;
        float f10;
        float f11;
        RectF rectF;
        float f12;
        int i9;
        float f13;
        int i10;
        if (e()) {
            int width = this.f16203d.getWidth();
            int gravity = this.f16203d.getGravity();
            C2143c c2143c = this.f16193T0;
            boolean b9 = c2143c.b(c2143c.f24222G);
            c2143c.f24224I = b9;
            Rect rect = c2143c.f24254h;
            if (gravity != 17 && (gravity & 7) != 1) {
                if ((gravity & 8388613) != 8388613 && (gravity & 5) != 5) {
                    if (b9) {
                        f9 = rect.right;
                        f10 = c2143c.f24258j0;
                    } else {
                        i10 = rect.left;
                        f11 = i10;
                    }
                } else if (b9) {
                    i10 = rect.left;
                    f11 = i10;
                } else {
                    f9 = rect.right;
                    f10 = c2143c.f24258j0;
                }
                float max = Math.max(f11, rect.left);
                rectF = this.f16242y0;
                rectF.left = max;
                rectF.top = rect.top;
                if (gravity == 17 && (gravity & 7) != 1) {
                    if ((gravity & 8388613) != 8388613 && (gravity & 5) != 5) {
                        if (c2143c.f24224I) {
                            i9 = rect.right;
                            f12 = i9;
                        } else {
                            f13 = c2143c.f24258j0;
                            f12 = f13 + max;
                        }
                    } else if (c2143c.f24224I) {
                        f13 = c2143c.f24258j0;
                        f12 = f13 + max;
                    } else {
                        i9 = rect.right;
                        f12 = i9;
                    }
                } else {
                    f12 = (width / 2.0f) + (c2143c.f24258j0 / 2.0f);
                }
                rectF.right = Math.min(f12, rect.right);
                rectF.bottom = c2143c.e() + rect.top;
                if (rectF.width() <= 0.0f && rectF.height() > 0.0f) {
                    float f14 = rectF.left;
                    float f15 = this.f16223o0;
                    rectF.left = f14 - f15;
                    rectF.right += f15;
                    rectF.offset(-getPaddingLeft(), ((-getPaddingTop()) - (rectF.height() / 2.0f)) + this.r0);
                    K5.h hVar = (K5.h) this.f16208g0;
                    hVar.getClass();
                    hVar.q(rectF.left, rectF.top, rectF.right, rectF.bottom);
                    return;
                }
            }
            f9 = width / 2.0f;
            f10 = c2143c.f24258j0 / 2.0f;
            f11 = f9 - f10;
            float max2 = Math.max(f11, rect.left);
            rectF = this.f16242y0;
            rectF.left = max2;
            rectF.top = rect.top;
            if (gravity == 17) {
            }
            f12 = (width / 2.0f) + (c2143c.f24258j0 / 2.0f);
            rectF.right = Math.min(f12, rect.right);
            rectF.bottom = c2143c.e() + rect.top;
            if (rectF.width() <= 0.0f) {
            }
        }
    }

    public final void l(AppCompatTextView appCompatTextView, int i9) {
        try {
            appCompatTextView.setTextAppearance(i9);
            if (appCompatTextView.getTextColors().getDefaultColor() != -65281) {
                return;
            }
        } catch (Exception unused) {
        }
        appCompatTextView.setTextAppearance(co.notix.R.style.TextAppearance_AppCompat_Caption);
        appCompatTextView.setTextColor(getContext().getColor(co.notix.R.color.design_error));
    }

    public final boolean m() {
        u uVar = this.j;
        if (uVar.f4404o == 1 && uVar.f4407r != null && !TextUtils.isEmpty(uVar.f4405p)) {
            return true;
        }
        return false;
    }

    public final void n(Editable editable) {
        int i9;
        boolean z9;
        int i10;
        b bVar;
        ((C6.a) this.f16220n).getClass();
        if (editable != null) {
            i9 = editable.length();
        } else {
            i9 = 0;
        }
        boolean z10 = this.f16218m;
        int i11 = this.f16216l;
        String str = null;
        if (i11 == -1) {
            this.f16222o.setText(String.valueOf(i9));
            this.f16222o.setContentDescription(null);
            this.f16218m = false;
        } else {
            if (i9 > i11) {
                z9 = true;
            } else {
                z9 = false;
            }
            this.f16218m = z9;
            Context context = getContext();
            AppCompatTextView appCompatTextView = this.f16222o;
            int i12 = this.f16216l;
            if (this.f16218m) {
                i10 = co.notix.R.string.character_counter_overflowed_content_description;
            } else {
                i10 = co.notix.R.string.character_counter_content_description;
            }
            appCompatTextView.setContentDescription(context.getString(i10, Integer.valueOf(i9), Integer.valueOf(i12)));
            if (z10 != this.f16218m) {
                o();
            }
            String str2 = b.f4800b;
            if (TextUtils.getLayoutDirectionFromLocale(Locale.getDefault()) == 1) {
                bVar = b.f4803e;
            } else {
                bVar = b.f4802d;
            }
            AppCompatTextView appCompatTextView2 = this.f16222o;
            String string = getContext().getString(co.notix.R.string.character_counter_pattern, Integer.valueOf(i9), Integer.valueOf(this.f16216l));
            if (string == null) {
                bVar.getClass();
            } else {
                bVar.getClass();
                i iVar = f.f4810a;
                str = bVar.c(string).toString();
            }
            appCompatTextView2.setText(str);
        }
        if (this.f16203d != null && z10 != this.f16218m) {
            u(false, false);
            x();
            r();
        }
    }

    public final void o() {
        int i9;
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        AppCompatTextView appCompatTextView = this.f16222o;
        if (appCompatTextView != null) {
            if (this.f16218m) {
                i9 = this.f16224p;
            } else {
                i9 = this.f16226q;
            }
            l(appCompatTextView, i9);
            if (!this.f16218m && (colorStateList2 = this.f16241y) != null) {
                this.f16222o.setTextColor(colorStateList2);
            }
            if (this.f16218m && (colorStateList = this.f16243z) != null) {
                this.f16222o.setTextColor(colorStateList);
            }
        }
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.f16193T0.h(configuration);
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        int max;
        q qVar = this.f16202c;
        qVar.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        boolean z9 = false;
        this.f16199Z0 = false;
        if (this.f16203d != null && this.f16203d.getMeasuredHeight() < (max = Math.max(qVar.getMeasuredHeight(), this.f16201b.getMeasuredHeight()))) {
            this.f16203d.setMinimumHeight(max);
            z9 = true;
        }
        boolean q9 = q();
        if (!z9 && !q9) {
            return;
        }
        this.f16203d.post(new s(6, this));
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z9, int i9, int i10, int i11, int i12) {
        int compoundPaddingTop;
        int compoundPaddingBottom;
        super.onLayout(z9, i9, i10, i11, i12);
        EditText editText = this.f16203d;
        if (editText != null) {
            ThreadLocal threadLocal = AbstractC2144d.f24282a;
            int width = editText.getWidth();
            int height = editText.getHeight();
            Rect rect = this.f16238w0;
            rect.set(0, 0, width, height);
            AbstractC2144d.b(this, editText, rect);
            h hVar = this.f16215k0;
            if (hVar != null) {
                int i13 = rect.bottom;
                hVar.setBounds(rect.left, i13 - this.f16230s0, rect.right, i13);
            }
            h hVar2 = this.f16217l0;
            if (hVar2 != null) {
                int i14 = rect.bottom;
                hVar2.setBounds(rect.left, i14 - this.f16232t0, rect.right, i14);
            }
            if (this.f16174C) {
                float textSize = this.f16203d.getTextSize();
                C2143c c2143c = this.f16193T0;
                if (c2143c.f24261l != textSize) {
                    c2143c.f24261l = textSize;
                    c2143c.i(false);
                }
                int gravity = this.f16203d.getGravity();
                c2143c.l((gravity & (-113)) | 48);
                if (c2143c.j != gravity) {
                    c2143c.j = gravity;
                    c2143c.i(false);
                }
                if (this.f16203d != null) {
                    boolean h7 = p.h(this);
                    int i15 = rect.bottom;
                    Rect rect2 = this.f16240x0;
                    rect2.bottom = i15;
                    int i16 = this.f16225p0;
                    if (i16 != 1) {
                        if (i16 != 2) {
                            rect2.left = g(rect.left, h7);
                            rect2.top = getPaddingTop();
                            rect2.right = h(rect.right, h7);
                        } else {
                            rect2.left = this.f16203d.getPaddingLeft() + rect.left;
                            rect2.top = rect.top - c();
                            rect2.right = rect.right - this.f16203d.getPaddingRight();
                        }
                    } else {
                        rect2.left = g(rect.left, h7);
                        rect2.top = rect.top + this.f16227q0;
                        rect2.right = h(rect.right, h7);
                    }
                    int i17 = rect2.left;
                    int i18 = rect2.top;
                    int i19 = rect2.right;
                    int i20 = rect2.bottom;
                    Rect rect3 = c2143c.f24254h;
                    if (rect3.left != i17 || rect3.top != i18 || rect3.right != i19 || rect3.bottom != i20) {
                        rect3.set(i17, i18, i19, i20);
                        c2143c.f24233S = true;
                    }
                    if (this.f16203d != null) {
                        TextPaint textPaint = c2143c.f24235U;
                        textPaint.setTextSize(c2143c.f24261l);
                        textPaint.setTypeface(c2143c.f24281z);
                        textPaint.setLetterSpacing(c2143c.f24253g0);
                        float f9 = -textPaint.ascent();
                        rect2.left = this.f16203d.getCompoundPaddingLeft() + rect.left;
                        if (this.f16225p0 == 1 && this.f16203d.getMinLines() <= 1) {
                            compoundPaddingTop = (int) (rect.centerY() - (f9 / 2.0f));
                        } else {
                            compoundPaddingTop = rect.top + this.f16203d.getCompoundPaddingTop();
                        }
                        rect2.top = compoundPaddingTop;
                        rect2.right = rect.right - this.f16203d.getCompoundPaddingRight();
                        if (this.f16225p0 == 1 && this.f16203d.getMinLines() <= 1) {
                            compoundPaddingBottom = (int) (rect2.top + f9);
                        } else {
                            compoundPaddingBottom = rect.bottom - this.f16203d.getCompoundPaddingBottom();
                        }
                        rect2.bottom = compoundPaddingBottom;
                        int i21 = rect2.left;
                        int i22 = rect2.top;
                        int i23 = rect2.right;
                        Rect rect4 = c2143c.f24252g;
                        if (rect4.left != i21 || rect4.top != i22 || rect4.right != i23 || rect4.bottom != compoundPaddingBottom) {
                            rect4.set(i21, i22, i23, compoundPaddingBottom);
                            c2143c.f24233S = true;
                        }
                        c2143c.i(false);
                        if (e() && !this.f16192S0) {
                            j();
                            return;
                        }
                        return;
                    }
                    throw new IllegalStateException();
                }
                throw new IllegalStateException();
            }
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i9, int i10) {
        EditText editText;
        super.onMeasure(i9, i10);
        boolean z9 = this.f16199Z0;
        q qVar = this.f16202c;
        if (!z9) {
            qVar.getViewTreeObserver().addOnGlobalLayoutListener(this);
            this.f16199Z0 = true;
        }
        if (this.f16231t != null && (editText = this.f16203d) != null) {
            this.f16231t.setGravity(editText.getGravity());
            this.f16231t.setPadding(this.f16203d.getCompoundPaddingLeft(), this.f16203d.getCompoundPaddingTop(), this.f16203d.getCompoundPaddingRight(), this.f16203d.getCompoundPaddingBottom());
        }
        qVar.m();
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof D)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        D d9 = (D) parcelable;
        super.onRestoreInstanceState(d9.f7246a);
        setError(d9.f4310c);
        if (d9.f4311d) {
            post(new A4.e(6, this));
        }
        requestLayout();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v3, types: [java.lang.Object, F5.m] */
    @Override // android.widget.LinearLayout, android.view.View
    public final void onRtlPropertiesChanged(int i9) {
        super.onRtlPropertiesChanged(i9);
        boolean z9 = true;
        if (i9 != 1) {
            z9 = false;
        }
        if (z9 != this.f16221n0) {
            c cVar = this.f16219m0.f2523e;
            RectF rectF = this.f16242y0;
            float a5 = cVar.a(rectF);
            float a9 = this.f16219m0.f2524f.a(rectF);
            float a10 = this.f16219m0.f2526h.a(rectF);
            float a11 = this.f16219m0.f2525g.a(rectF);
            m mVar = this.f16219m0;
            AbstractC0485a abstractC0485a = mVar.f2519a;
            AbstractC0485a abstractC0485a2 = mVar.f2520b;
            AbstractC0485a abstractC0485a3 = mVar.f2522d;
            AbstractC0485a abstractC0485a4 = mVar.f2521c;
            e eVar = new e(0);
            e eVar2 = new e(0);
            e eVar3 = new e(0);
            e eVar4 = new e(0);
            l.b(abstractC0485a2);
            l.b(abstractC0485a);
            l.b(abstractC0485a4);
            l.b(abstractC0485a3);
            F5.a aVar = new F5.a(a9);
            F5.a aVar2 = new F5.a(a5);
            F5.a aVar3 = new F5.a(a11);
            F5.a aVar4 = new F5.a(a10);
            ?? obj = new Object();
            obj.f2519a = abstractC0485a2;
            obj.f2520b = abstractC0485a;
            obj.f2521c = abstractC0485a3;
            obj.f2522d = abstractC0485a4;
            obj.f2523e = aVar;
            obj.f2524f = aVar2;
            obj.f2525g = aVar4;
            obj.f2526h = aVar3;
            obj.f2527i = eVar;
            obj.j = eVar2;
            obj.f2528k = eVar3;
            obj.f2529l = eVar4;
            this.f16221n0 = z9;
            setShapeAppearanceModel(obj);
        }
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [K5.D, android.os.Parcelable, U.b] */
    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        boolean z9;
        ?? bVar = new U.b(super.onSaveInstanceState());
        if (m()) {
            bVar.f4310c = getError();
        }
        q qVar = this.f16202c;
        if (qVar.f4365i != 0 && qVar.f4363g.f16074d) {
            z9 = true;
        } else {
            z9 = false;
        }
        bVar.f4311d = z9;
        return bVar;
    }

    public final void p() {
        Drawable textCursorDrawable;
        Drawable textCursorDrawable2;
        ColorStateList colorStateList;
        ColorStateList colorStateList2 = this.f16170A;
        if (colorStateList2 == null) {
            Context context = getContext();
            TypedValue X8 = AbstractC1002u1.X(context, co.notix.R.attr.colorControlActivated);
            if (X8 != null) {
                int i9 = X8.resourceId;
                if (i9 != 0) {
                    colorStateList2 = d.c(context, i9);
                } else {
                    int i10 = X8.data;
                    if (i10 != 0) {
                        colorStateList2 = ColorStateList.valueOf(i10);
                    }
                }
            }
            colorStateList2 = null;
        }
        EditText editText = this.f16203d;
        if (editText != null) {
            textCursorDrawable = editText.getTextCursorDrawable();
            if (textCursorDrawable != null) {
                textCursorDrawable2 = this.f16203d.getTextCursorDrawable();
                Drawable mutate = textCursorDrawable2.mutate();
                if ((m() || (this.f16222o != null && this.f16218m)) && (colorStateList = this.f16172B) != null) {
                    colorStateList2 = colorStateList;
                }
                mutate.setTintList(colorStateList2);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00ab  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean q() {
        /*
            Method dump skipped, instructions count: 304
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.textfield.TextInputLayout.q():boolean");
    }

    public final void r() {
        Drawable background;
        AppCompatTextView appCompatTextView;
        EditText editText = this.f16203d;
        if (editText != null && this.f16225p0 == 0 && (background = editText.getBackground()) != null) {
            int[] iArr = AbstractC1800i0.f21998a;
            Drawable mutate = background.mutate();
            if (m()) {
                mutate.setColorFilter(C1821t.c(getErrorCurrentTextColors(), PorterDuff.Mode.SRC_IN));
            } else if (this.f16218m && (appCompatTextView = this.f16222o) != null) {
                mutate.setColorFilter(C1821t.c(appCompatTextView.getCurrentTextColor(), PorterDuff.Mode.SRC_IN));
            } else {
                mutate.clearColorFilter();
                this.f16203d.refreshDrawableState();
            }
        }
    }

    public final void s() {
        EditText editText = this.f16203d;
        if (editText != null && this.f16208g0 != null) {
            if ((this.f16213j0 || editText.getBackground() == null) && this.f16225p0 != 0) {
                Drawable editTextBoxBackground = getEditTextBoxBackground();
                EditText editText2 = this.f16203d;
                WeakHashMap weakHashMap = Q.f5546a;
                editText2.setBackground(editTextBoxBackground);
                this.f16213j0 = true;
            }
        }
    }

    public void setBoxBackgroundColor(int i9) {
        if (this.f16236v0 != i9) {
            this.f16236v0 = i9;
            this.f16186M0 = i9;
            this.f16188O0 = i9;
            this.f16189P0 = i9;
            b();
        }
    }

    public void setBoxBackgroundColorResource(int i9) {
        setBoxBackgroundColor(getContext().getColor(i9));
    }

    public void setBoxBackgroundColorStateList(ColorStateList colorStateList) {
        int defaultColor = colorStateList.getDefaultColor();
        this.f16186M0 = defaultColor;
        this.f16236v0 = defaultColor;
        this.f16187N0 = colorStateList.getColorForState(new int[]{-16842910}, -1);
        this.f16188O0 = colorStateList.getColorForState(new int[]{R.attr.state_focused, R.attr.state_enabled}, -1);
        this.f16189P0 = colorStateList.getColorForState(new int[]{R.attr.state_hovered, R.attr.state_enabled}, -1);
        b();
    }

    public void setBoxBackgroundMode(int i9) {
        if (i9 != this.f16225p0) {
            this.f16225p0 = i9;
            if (this.f16203d != null) {
                i();
            }
        }
    }

    public void setBoxCollapsedPaddingTop(int i9) {
        this.f16227q0 = i9;
    }

    public void setBoxCornerFamily(int i9) {
        l e8 = this.f16219m0.e();
        c cVar = this.f16219m0.f2523e;
        AbstractC0485a m9 = AbstractC1002u1.m(i9);
        e8.f2508a = m9;
        l.b(m9);
        e8.f2512e = cVar;
        c cVar2 = this.f16219m0.f2524f;
        AbstractC0485a m10 = AbstractC1002u1.m(i9);
        e8.f2509b = m10;
        l.b(m10);
        e8.f2513f = cVar2;
        c cVar3 = this.f16219m0.f2526h;
        AbstractC0485a m11 = AbstractC1002u1.m(i9);
        e8.f2511d = m11;
        l.b(m11);
        e8.f2515h = cVar3;
        c cVar4 = this.f16219m0.f2525g;
        AbstractC0485a m12 = AbstractC1002u1.m(i9);
        e8.f2510c = m12;
        l.b(m12);
        e8.f2514g = cVar4;
        this.f16219m0 = e8.a();
        b();
    }

    public void setBoxStrokeColor(int i9) {
        if (this.f16184K0 != i9) {
            this.f16184K0 = i9;
            x();
        }
    }

    public void setBoxStrokeColorStateList(ColorStateList colorStateList) {
        if (colorStateList.isStateful()) {
            this.f16182I0 = colorStateList.getDefaultColor();
            this.f16190Q0 = colorStateList.getColorForState(new int[]{-16842910}, -1);
            this.f16183J0 = colorStateList.getColorForState(new int[]{R.attr.state_hovered, R.attr.state_enabled}, -1);
            this.f16184K0 = colorStateList.getColorForState(new int[]{R.attr.state_focused, R.attr.state_enabled}, -1);
        } else if (this.f16184K0 != colorStateList.getDefaultColor()) {
            this.f16184K0 = colorStateList.getDefaultColor();
        }
        x();
    }

    public void setBoxStrokeErrorColor(ColorStateList colorStateList) {
        if (this.f16185L0 != colorStateList) {
            this.f16185L0 = colorStateList;
            x();
        }
    }

    public void setBoxStrokeWidth(int i9) {
        this.f16230s0 = i9;
        x();
    }

    public void setBoxStrokeWidthFocused(int i9) {
        this.f16232t0 = i9;
        x();
    }

    public void setBoxStrokeWidthFocusedResource(int i9) {
        setBoxStrokeWidthFocused(getResources().getDimensionPixelSize(i9));
    }

    public void setBoxStrokeWidthResource(int i9) {
        setBoxStrokeWidth(getResources().getDimensionPixelSize(i9));
    }

    public void setCounterEnabled(boolean z9) {
        if (this.f16214k != z9) {
            Editable editable = null;
            u uVar = this.j;
            if (z9) {
                AppCompatTextView appCompatTextView = new AppCompatTextView(getContext(), null);
                this.f16222o = appCompatTextView;
                appCompatTextView.setId(co.notix.R.id.textinput_counter);
                Typeface typeface = this.f16244z0;
                if (typeface != null) {
                    this.f16222o.setTypeface(typeface);
                }
                this.f16222o.setMaxLines(1);
                uVar.a(this.f16222o, 2);
                ((ViewGroup.MarginLayoutParams) this.f16222o.getLayoutParams()).setMarginStart(getResources().getDimensionPixelOffset(co.notix.R.dimen.mtrl_textinput_counter_margin_start));
                o();
                if (this.f16222o != null) {
                    EditText editText = this.f16203d;
                    if (editText != null) {
                        editable = editText.getText();
                    }
                    n(editable);
                }
            } else {
                uVar.g(this.f16222o, 2);
                this.f16222o = null;
            }
            this.f16214k = z9;
        }
    }

    public void setCounterMaxLength(int i9) {
        Editable text;
        if (this.f16216l != i9) {
            if (i9 > 0) {
                this.f16216l = i9;
            } else {
                this.f16216l = -1;
            }
            if (this.f16214k && this.f16222o != null) {
                EditText editText = this.f16203d;
                if (editText == null) {
                    text = null;
                } else {
                    text = editText.getText();
                }
                n(text);
            }
        }
    }

    public void setCounterOverflowTextAppearance(int i9) {
        if (this.f16224p != i9) {
            this.f16224p = i9;
            o();
        }
    }

    public void setCounterOverflowTextColor(ColorStateList colorStateList) {
        if (this.f16243z != colorStateList) {
            this.f16243z = colorStateList;
            o();
        }
    }

    public void setCounterTextAppearance(int i9) {
        if (this.f16226q != i9) {
            this.f16226q = i9;
            o();
        }
    }

    public void setCounterTextColor(ColorStateList colorStateList) {
        if (this.f16241y != colorStateList) {
            this.f16241y = colorStateList;
            o();
        }
    }

    public void setCursorColor(ColorStateList colorStateList) {
        if (this.f16170A != colorStateList) {
            this.f16170A = colorStateList;
            p();
        }
    }

    public void setCursorErrorColor(ColorStateList colorStateList) {
        if (this.f16172B != colorStateList) {
            this.f16172B = colorStateList;
            if (!m() && (this.f16222o == null || !this.f16218m)) {
                return;
            }
            p();
        }
    }

    public void setDefaultHintTextColor(ColorStateList colorStateList) {
        this.f16180G0 = colorStateList;
        this.f16181H0 = colorStateList;
        if (this.f16203d != null) {
            u(false, false);
        }
    }

    @Override // android.view.View
    public void setEnabled(boolean z9) {
        k(this, z9);
        super.setEnabled(z9);
    }

    public void setEndIconActivated(boolean z9) {
        this.f16202c.f4363g.setActivated(z9);
    }

    public void setEndIconCheckable(boolean z9) {
        this.f16202c.f4363g.setCheckable(z9);
    }

    public void setEndIconContentDescription(int i9) {
        q qVar = this.f16202c;
        CharSequence text = i9 != 0 ? qVar.getResources().getText(i9) : null;
        CheckableImageButton checkableImageButton = qVar.f4363g;
        if (checkableImageButton.getContentDescription() != text) {
            checkableImageButton.setContentDescription(text);
        }
    }

    public void setEndIconDrawable(int i9) {
        q qVar = this.f16202c;
        Drawable q9 = i9 != 0 ? AbstractC0485a.q(qVar.getContext(), i9) : null;
        CheckableImageButton checkableImageButton = qVar.f4363g;
        checkableImageButton.setImageDrawable(q9);
        if (q9 != null) {
            ColorStateList colorStateList = qVar.f4366k;
            PorterDuff.Mode mode = qVar.f4367l;
            TextInputLayout textInputLayout = qVar.f4357a;
            O4.h.c(textInputLayout, checkableImageButton, colorStateList, mode);
            O4.h.E(textInputLayout, checkableImageButton, qVar.f4366k);
        }
    }

    public void setEndIconMinSize(int i9) {
        q qVar = this.f16202c;
        if (i9 >= 0) {
            if (i9 != qVar.f4368m) {
                qVar.f4368m = i9;
                CheckableImageButton checkableImageButton = qVar.f4363g;
                checkableImageButton.setMinimumWidth(i9);
                checkableImageButton.setMinimumHeight(i9);
                CheckableImageButton checkableImageButton2 = qVar.f4359c;
                checkableImageButton2.setMinimumWidth(i9);
                checkableImageButton2.setMinimumHeight(i9);
                return;
            }
            return;
        }
        qVar.getClass();
        throw new IllegalArgumentException("endIconSize cannot be less than 0");
    }

    public void setEndIconMode(int i9) {
        this.f16202c.g(i9);
    }

    public void setEndIconOnClickListener(View.OnClickListener onClickListener) {
        q qVar = this.f16202c;
        View.OnLongClickListener onLongClickListener = qVar.f4370o;
        CheckableImageButton checkableImageButton = qVar.f4363g;
        checkableImageButton.setOnClickListener(onClickListener);
        O4.h.G(checkableImageButton, onLongClickListener);
    }

    public void setEndIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        q qVar = this.f16202c;
        qVar.f4370o = onLongClickListener;
        CheckableImageButton checkableImageButton = qVar.f4363g;
        checkableImageButton.setOnLongClickListener(onLongClickListener);
        O4.h.G(checkableImageButton, onLongClickListener);
    }

    public void setEndIconScaleType(ImageView.ScaleType scaleType) {
        q qVar = this.f16202c;
        qVar.f4369n = scaleType;
        qVar.f4363g.setScaleType(scaleType);
        qVar.f4359c.setScaleType(scaleType);
    }

    public void setEndIconTintList(ColorStateList colorStateList) {
        q qVar = this.f16202c;
        if (qVar.f4366k != colorStateList) {
            qVar.f4366k = colorStateList;
            O4.h.c(qVar.f4357a, qVar.f4363g, colorStateList, qVar.f4367l);
        }
    }

    public void setEndIconTintMode(PorterDuff.Mode mode) {
        q qVar = this.f16202c;
        if (qVar.f4367l != mode) {
            qVar.f4367l = mode;
            O4.h.c(qVar.f4357a, qVar.f4363g, qVar.f4366k, mode);
        }
    }

    public void setEndIconVisible(boolean z9) {
        this.f16202c.h(z9);
    }

    public void setError(CharSequence charSequence) {
        u uVar = this.j;
        if (!uVar.f4406q) {
            if (TextUtils.isEmpty(charSequence)) {
                return;
            } else {
                setErrorEnabled(true);
            }
        }
        if (!TextUtils.isEmpty(charSequence)) {
            uVar.c();
            uVar.f4405p = charSequence;
            uVar.f4407r.setText(charSequence);
            int i9 = uVar.f4403n;
            if (i9 != 1) {
                uVar.f4404o = 1;
            }
            uVar.i(i9, uVar.f4404o, uVar.h(uVar.f4407r, charSequence));
            return;
        }
        uVar.f();
    }

    public void setErrorAccessibilityLiveRegion(int i9) {
        u uVar = this.j;
        uVar.f4409t = i9;
        AppCompatTextView appCompatTextView = uVar.f4407r;
        if (appCompatTextView != null) {
            WeakHashMap weakHashMap = Q.f5546a;
            appCompatTextView.setAccessibilityLiveRegion(i9);
        }
    }

    public void setErrorContentDescription(CharSequence charSequence) {
        u uVar = this.j;
        uVar.f4408s = charSequence;
        AppCompatTextView appCompatTextView = uVar.f4407r;
        if (appCompatTextView != null) {
            appCompatTextView.setContentDescription(charSequence);
        }
    }

    public void setErrorEnabled(boolean z9) {
        u uVar = this.j;
        if (uVar.f4406q == z9) {
            return;
        }
        uVar.c();
        TextInputLayout textInputLayout = uVar.f4398h;
        if (z9) {
            AppCompatTextView appCompatTextView = new AppCompatTextView(uVar.f4397g, null);
            uVar.f4407r = appCompatTextView;
            appCompatTextView.setId(co.notix.R.id.textinput_error);
            uVar.f4407r.setTextAlignment(5);
            Typeface typeface = uVar.f4390B;
            if (typeface != null) {
                uVar.f4407r.setTypeface(typeface);
            }
            int i9 = uVar.f4410u;
            uVar.f4410u = i9;
            AppCompatTextView appCompatTextView2 = uVar.f4407r;
            if (appCompatTextView2 != null) {
                textInputLayout.l(appCompatTextView2, i9);
            }
            ColorStateList colorStateList = uVar.f4411v;
            uVar.f4411v = colorStateList;
            AppCompatTextView appCompatTextView3 = uVar.f4407r;
            if (appCompatTextView3 != null && colorStateList != null) {
                appCompatTextView3.setTextColor(colorStateList);
            }
            CharSequence charSequence = uVar.f4408s;
            uVar.f4408s = charSequence;
            AppCompatTextView appCompatTextView4 = uVar.f4407r;
            if (appCompatTextView4 != null) {
                appCompatTextView4.setContentDescription(charSequence);
            }
            int i10 = uVar.f4409t;
            uVar.f4409t = i10;
            AppCompatTextView appCompatTextView5 = uVar.f4407r;
            if (appCompatTextView5 != null) {
                WeakHashMap weakHashMap = Q.f5546a;
                appCompatTextView5.setAccessibilityLiveRegion(i10);
            }
            uVar.f4407r.setVisibility(4);
            uVar.a(uVar.f4407r, 0);
        } else {
            uVar.f();
            uVar.g(uVar.f4407r, 0);
            uVar.f4407r = null;
            textInputLayout.r();
            textInputLayout.x();
        }
        uVar.f4406q = z9;
    }

    public void setErrorIconDrawable(int i9) {
        q qVar = this.f16202c;
        qVar.i(i9 != 0 ? AbstractC0485a.q(qVar.getContext(), i9) : null);
        O4.h.E(qVar.f4357a, qVar.f4359c, qVar.f4360d);
    }

    public void setErrorIconOnClickListener(View.OnClickListener onClickListener) {
        q qVar = this.f16202c;
        CheckableImageButton checkableImageButton = qVar.f4359c;
        View.OnLongClickListener onLongClickListener = qVar.f4362f;
        checkableImageButton.setOnClickListener(onClickListener);
        O4.h.G(checkableImageButton, onLongClickListener);
    }

    public void setErrorIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        q qVar = this.f16202c;
        qVar.f4362f = onLongClickListener;
        CheckableImageButton checkableImageButton = qVar.f4359c;
        checkableImageButton.setOnLongClickListener(onLongClickListener);
        O4.h.G(checkableImageButton, onLongClickListener);
    }

    public void setErrorIconTintList(ColorStateList colorStateList) {
        q qVar = this.f16202c;
        if (qVar.f4360d != colorStateList) {
            qVar.f4360d = colorStateList;
            O4.h.c(qVar.f4357a, qVar.f4359c, colorStateList, qVar.f4361e);
        }
    }

    public void setErrorIconTintMode(PorterDuff.Mode mode) {
        q qVar = this.f16202c;
        if (qVar.f4361e != mode) {
            qVar.f4361e = mode;
            O4.h.c(qVar.f4357a, qVar.f4359c, qVar.f4360d, mode);
        }
    }

    public void setErrorTextAppearance(int i9) {
        u uVar = this.j;
        uVar.f4410u = i9;
        AppCompatTextView appCompatTextView = uVar.f4407r;
        if (appCompatTextView != null) {
            uVar.f4398h.l(appCompatTextView, i9);
        }
    }

    public void setErrorTextColor(ColorStateList colorStateList) {
        u uVar = this.j;
        uVar.f4411v = colorStateList;
        AppCompatTextView appCompatTextView = uVar.f4407r;
        if (appCompatTextView != null && colorStateList != null) {
            appCompatTextView.setTextColor(colorStateList);
        }
    }

    public void setExpandedHintEnabled(boolean z9) {
        if (this.f16194U0 != z9) {
            this.f16194U0 = z9;
            u(false, false);
        }
    }

    public void setHelperText(CharSequence charSequence) {
        boolean isEmpty = TextUtils.isEmpty(charSequence);
        u uVar = this.j;
        if (isEmpty) {
            if (uVar.f4413x) {
                setHelperTextEnabled(false);
                return;
            }
            return;
        }
        if (!uVar.f4413x) {
            setHelperTextEnabled(true);
        }
        uVar.c();
        uVar.f4412w = charSequence;
        uVar.f4414y.setText(charSequence);
        int i9 = uVar.f4403n;
        if (i9 != 2) {
            uVar.f4404o = 2;
        }
        uVar.i(i9, uVar.f4404o, uVar.h(uVar.f4414y, charSequence));
    }

    public void setHelperTextColor(ColorStateList colorStateList) {
        u uVar = this.j;
        uVar.f4389A = colorStateList;
        AppCompatTextView appCompatTextView = uVar.f4414y;
        if (appCompatTextView != null && colorStateList != null) {
            appCompatTextView.setTextColor(colorStateList);
        }
    }

    public void setHelperTextEnabled(boolean z9) {
        u uVar = this.j;
        if (uVar.f4413x == z9) {
            return;
        }
        uVar.c();
        if (z9) {
            AppCompatTextView appCompatTextView = new AppCompatTextView(uVar.f4397g, null);
            uVar.f4414y = appCompatTextView;
            appCompatTextView.setId(co.notix.R.id.textinput_helper_text);
            uVar.f4414y.setTextAlignment(5);
            Typeface typeface = uVar.f4390B;
            if (typeface != null) {
                uVar.f4414y.setTypeface(typeface);
            }
            uVar.f4414y.setVisibility(4);
            AppCompatTextView appCompatTextView2 = uVar.f4414y;
            WeakHashMap weakHashMap = Q.f5546a;
            appCompatTextView2.setAccessibilityLiveRegion(1);
            int i9 = uVar.f4415z;
            uVar.f4415z = i9;
            AppCompatTextView appCompatTextView3 = uVar.f4414y;
            if (appCompatTextView3 != null) {
                appCompatTextView3.setTextAppearance(i9);
            }
            ColorStateList colorStateList = uVar.f4389A;
            uVar.f4389A = colorStateList;
            AppCompatTextView appCompatTextView4 = uVar.f4414y;
            if (appCompatTextView4 != null && colorStateList != null) {
                appCompatTextView4.setTextColor(colorStateList);
            }
            uVar.a(uVar.f4414y, 1);
            uVar.f4414y.setAccessibilityDelegate(new t(0, uVar));
        } else {
            uVar.c();
            int i10 = uVar.f4403n;
            if (i10 == 2) {
                uVar.f4404o = 0;
            }
            uVar.i(i10, uVar.f4404o, uVar.h(uVar.f4414y, ""));
            uVar.g(uVar.f4414y, 1);
            uVar.f4414y = null;
            TextInputLayout textInputLayout = uVar.f4398h;
            textInputLayout.r();
            textInputLayout.x();
        }
        uVar.f4413x = z9;
    }

    public void setHelperTextTextAppearance(int i9) {
        u uVar = this.j;
        uVar.f4415z = i9;
        AppCompatTextView appCompatTextView = uVar.f4414y;
        if (appCompatTextView != null) {
            appCompatTextView.setTextAppearance(i9);
        }
    }

    public void setHint(CharSequence charSequence) {
        if (this.f16174C) {
            setHintInternal(charSequence);
            sendAccessibilityEvent(2048);
        }
    }

    public void setHintAnimationEnabled(boolean z9) {
        this.f16195V0 = z9;
    }

    public void setHintEnabled(boolean z9) {
        if (z9 != this.f16174C) {
            this.f16174C = z9;
            if (!z9) {
                this.f16206f0 = false;
                if (!TextUtils.isEmpty(this.f16176D) && TextUtils.isEmpty(this.f16203d.getHint())) {
                    this.f16203d.setHint(this.f16176D);
                }
                setHintInternal(null);
            } else {
                CharSequence hint = this.f16203d.getHint();
                if (!TextUtils.isEmpty(hint)) {
                    if (TextUtils.isEmpty(this.f16176D)) {
                        setHint(hint);
                    }
                    this.f16203d.setHint((CharSequence) null);
                }
                this.f16206f0 = true;
            }
            if (this.f16203d != null) {
                t();
            }
        }
    }

    public void setHintTextAppearance(int i9) {
        C2143c c2143c = this.f16193T0;
        c2143c.k(i9);
        this.f16181H0 = c2143c.f24267o;
        if (this.f16203d != null) {
            u(false, false);
            t();
        }
    }

    public void setHintTextColor(ColorStateList colorStateList) {
        if (this.f16181H0 != colorStateList) {
            if (this.f16180G0 == null) {
                C2143c c2143c = this.f16193T0;
                if (c2143c.f24267o != colorStateList) {
                    c2143c.f24267o = colorStateList;
                    c2143c.i(false);
                }
            }
            this.f16181H0 = colorStateList;
            if (this.f16203d != null) {
                u(false, false);
            }
        }
    }

    public void setLengthCounter(C c3) {
        this.f16220n = c3;
    }

    public void setMaxEms(int i9) {
        this.f16207g = i9;
        EditText editText = this.f16203d;
        if (editText != null && i9 != -1) {
            editText.setMaxEms(i9);
        }
    }

    public void setMaxWidth(int i9) {
        this.f16211i = i9;
        EditText editText = this.f16203d;
        if (editText != null && i9 != -1) {
            editText.setMaxWidth(i9);
        }
    }

    public void setMaxWidthResource(int i9) {
        setMaxWidth(getContext().getResources().getDimensionPixelSize(i9));
    }

    public void setMinEms(int i9) {
        this.f16205f = i9;
        EditText editText = this.f16203d;
        if (editText != null && i9 != -1) {
            editText.setMinEms(i9);
        }
    }

    public void setMinWidth(int i9) {
        this.f16209h = i9;
        EditText editText = this.f16203d;
        if (editText != null && i9 != -1) {
            editText.setMinWidth(i9);
        }
    }

    public void setMinWidthResource(int i9) {
        setMinWidth(getContext().getResources().getDimensionPixelSize(i9));
    }

    @Deprecated
    public void setPasswordVisibilityToggleContentDescription(int i9) {
        q qVar = this.f16202c;
        qVar.f4363g.setContentDescription(i9 != 0 ? qVar.getResources().getText(i9) : null);
    }

    @Deprecated
    public void setPasswordVisibilityToggleDrawable(int i9) {
        q qVar = this.f16202c;
        qVar.f4363g.setImageDrawable(i9 != 0 ? AbstractC0485a.q(qVar.getContext(), i9) : null);
    }

    @Deprecated
    public void setPasswordVisibilityToggleEnabled(boolean z9) {
        q qVar = this.f16202c;
        if (z9 && qVar.f4365i != 1) {
            qVar.g(1);
        } else if (!z9) {
            qVar.g(0);
        } else {
            qVar.getClass();
        }
    }

    @Deprecated
    public void setPasswordVisibilityToggleTintList(ColorStateList colorStateList) {
        q qVar = this.f16202c;
        qVar.f4366k = colorStateList;
        O4.h.c(qVar.f4357a, qVar.f4363g, colorStateList, qVar.f4367l);
    }

    @Deprecated
    public void setPasswordVisibilityToggleTintMode(PorterDuff.Mode mode) {
        q qVar = this.f16202c;
        qVar.f4367l = mode;
        O4.h.c(qVar.f4357a, qVar.f4363g, qVar.f4366k, mode);
    }

    public void setPlaceholderText(CharSequence charSequence) {
        Editable editable = null;
        if (this.f16231t == null) {
            AppCompatTextView appCompatTextView = new AppCompatTextView(getContext(), null);
            this.f16231t = appCompatTextView;
            appCompatTextView.setId(co.notix.R.id.textinput_placeholder);
            AppCompatTextView appCompatTextView2 = this.f16231t;
            WeakHashMap weakHashMap = Q.f5546a;
            appCompatTextView2.setImportantForAccessibility(2);
            g d9 = d();
            this.f16237w = d9;
            d9.f8196b = 67L;
            this.f16239x = d();
            setPlaceholderTextAppearance(this.f16235v);
            setPlaceholderTextColor(this.f16233u);
        }
        if (TextUtils.isEmpty(charSequence)) {
            setPlaceholderTextEnabled(false);
        } else {
            if (!this.f16229s) {
                setPlaceholderTextEnabled(true);
            }
            this.f16228r = charSequence;
        }
        EditText editText = this.f16203d;
        if (editText != null) {
            editable = editText.getText();
        }
        v(editable);
    }

    public void setPlaceholderTextAppearance(int i9) {
        this.f16235v = i9;
        AppCompatTextView appCompatTextView = this.f16231t;
        if (appCompatTextView != null) {
            appCompatTextView.setTextAppearance(i9);
        }
    }

    public void setPlaceholderTextColor(ColorStateList colorStateList) {
        if (this.f16233u != colorStateList) {
            this.f16233u = colorStateList;
            AppCompatTextView appCompatTextView = this.f16231t;
            if (appCompatTextView != null && colorStateList != null) {
                appCompatTextView.setTextColor(colorStateList);
            }
        }
    }

    public void setPrefixText(CharSequence charSequence) {
        CharSequence charSequence2;
        z zVar = this.f16201b;
        zVar.getClass();
        if (TextUtils.isEmpty(charSequence)) {
            charSequence2 = null;
        } else {
            charSequence2 = charSequence;
        }
        zVar.f4433c = charSequence2;
        zVar.f4432b.setText(charSequence);
        zVar.e();
    }

    public void setPrefixTextAppearance(int i9) {
        this.f16201b.f4432b.setTextAppearance(i9);
    }

    public void setPrefixTextColor(ColorStateList colorStateList) {
        this.f16201b.f4432b.setTextColor(colorStateList);
    }

    public void setShapeAppearanceModel(m mVar) {
        h hVar = this.f16208g0;
        if (hVar != null && hVar.f2483a.f2466a != mVar) {
            this.f16219m0 = mVar;
            b();
        }
    }

    public void setStartIconCheckable(boolean z9) {
        this.f16201b.f4434d.setCheckable(z9);
    }

    public void setStartIconContentDescription(CharSequence charSequence) {
        CheckableImageButton checkableImageButton = this.f16201b.f4434d;
        if (checkableImageButton.getContentDescription() != charSequence) {
            checkableImageButton.setContentDescription(charSequence);
        }
    }

    public void setStartIconDrawable(int i9) {
        setStartIconDrawable(i9 != 0 ? AbstractC0485a.q(getContext(), i9) : null);
    }

    public void setStartIconMinSize(int i9) {
        z zVar = this.f16201b;
        if (i9 >= 0) {
            if (i9 != zVar.f4437g) {
                zVar.f4437g = i9;
                CheckableImageButton checkableImageButton = zVar.f4434d;
                checkableImageButton.setMinimumWidth(i9);
                checkableImageButton.setMinimumHeight(i9);
                return;
            }
            return;
        }
        zVar.getClass();
        throw new IllegalArgumentException("startIconSize cannot be less than 0");
    }

    public void setStartIconOnClickListener(View.OnClickListener onClickListener) {
        z zVar = this.f16201b;
        View.OnLongClickListener onLongClickListener = zVar.f4439i;
        CheckableImageButton checkableImageButton = zVar.f4434d;
        checkableImageButton.setOnClickListener(onClickListener);
        O4.h.G(checkableImageButton, onLongClickListener);
    }

    public void setStartIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        z zVar = this.f16201b;
        zVar.f4439i = onLongClickListener;
        CheckableImageButton checkableImageButton = zVar.f4434d;
        checkableImageButton.setOnLongClickListener(onLongClickListener);
        O4.h.G(checkableImageButton, onLongClickListener);
    }

    public void setStartIconScaleType(ImageView.ScaleType scaleType) {
        z zVar = this.f16201b;
        zVar.f4438h = scaleType;
        zVar.f4434d.setScaleType(scaleType);
    }

    public void setStartIconTintList(ColorStateList colorStateList) {
        z zVar = this.f16201b;
        if (zVar.f4435e != colorStateList) {
            zVar.f4435e = colorStateList;
            O4.h.c(zVar.f4431a, zVar.f4434d, colorStateList, zVar.f4436f);
        }
    }

    public void setStartIconTintMode(PorterDuff.Mode mode) {
        z zVar = this.f16201b;
        if (zVar.f4436f != mode) {
            zVar.f4436f = mode;
            O4.h.c(zVar.f4431a, zVar.f4434d, zVar.f4435e, mode);
        }
    }

    public void setStartIconVisible(boolean z9) {
        this.f16201b.c(z9);
    }

    public void setSuffixText(CharSequence charSequence) {
        CharSequence charSequence2;
        q qVar = this.f16202c;
        qVar.getClass();
        if (TextUtils.isEmpty(charSequence)) {
            charSequence2 = null;
        } else {
            charSequence2 = charSequence;
        }
        qVar.f4371p = charSequence2;
        qVar.f4372q.setText(charSequence);
        qVar.n();
    }

    public void setSuffixTextAppearance(int i9) {
        this.f16202c.f4372q.setTextAppearance(i9);
    }

    public void setSuffixTextColor(ColorStateList colorStateList) {
        this.f16202c.f4372q.setTextColor(colorStateList);
    }

    public void setTextInputAccessibilityDelegate(B b9) {
        EditText editText = this.f16203d;
        if (editText != null) {
            Q.m(editText, b9);
        }
    }

    public void setTypeface(Typeface typeface) {
        if (typeface != this.f16244z0) {
            this.f16244z0 = typeface;
            C2143c c2143c = this.f16193T0;
            boolean m9 = c2143c.m(typeface);
            boolean o9 = c2143c.o(typeface);
            if (m9 || o9) {
                c2143c.i(false);
            }
            u uVar = this.j;
            if (typeface != uVar.f4390B) {
                uVar.f4390B = typeface;
                AppCompatTextView appCompatTextView = uVar.f4407r;
                if (appCompatTextView != null) {
                    appCompatTextView.setTypeface(typeface);
                }
                AppCompatTextView appCompatTextView2 = uVar.f4414y;
                if (appCompatTextView2 != null) {
                    appCompatTextView2.setTypeface(typeface);
                }
            }
            AppCompatTextView appCompatTextView3 = this.f16222o;
            if (appCompatTextView3 != null) {
                appCompatTextView3.setTypeface(typeface);
            }
        }
    }

    public final void t() {
        if (this.f16225p0 != 1) {
            FrameLayout frameLayout = this.f16200a;
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) frameLayout.getLayoutParams();
            int c3 = c();
            if (c3 != layoutParams.topMargin) {
                layoutParams.topMargin = c3;
                frameLayout.requestLayout();
            }
        }
    }

    public final void u(boolean z9, boolean z10) {
        boolean z11;
        boolean z12;
        ColorStateList colorStateList;
        AppCompatTextView appCompatTextView;
        ColorStateList colorStateList2;
        int i9;
        boolean isEnabled = isEnabled();
        EditText editText = this.f16203d;
        if (editText != null && !TextUtils.isEmpty(editText.getText())) {
            z11 = true;
        } else {
            z11 = false;
        }
        EditText editText2 = this.f16203d;
        if (editText2 != null && editText2.hasFocus()) {
            z12 = true;
        } else {
            z12 = false;
        }
        ColorStateList colorStateList3 = this.f16180G0;
        C2143c c2143c = this.f16193T0;
        if (colorStateList3 != null) {
            c2143c.j(colorStateList3);
        }
        Editable editable = null;
        if (!isEnabled) {
            ColorStateList colorStateList4 = this.f16180G0;
            if (colorStateList4 != null) {
                i9 = colorStateList4.getColorForState(new int[]{-16842910}, this.f16190Q0);
            } else {
                i9 = this.f16190Q0;
            }
            c2143c.j(ColorStateList.valueOf(i9));
        } else if (m()) {
            AppCompatTextView appCompatTextView2 = this.j.f4407r;
            if (appCompatTextView2 != null) {
                colorStateList2 = appCompatTextView2.getTextColors();
            } else {
                colorStateList2 = null;
            }
            c2143c.j(colorStateList2);
        } else if (this.f16218m && (appCompatTextView = this.f16222o) != null) {
            c2143c.j(appCompatTextView.getTextColors());
        } else if (z12 && (colorStateList = this.f16181H0) != null && c2143c.f24267o != colorStateList) {
            c2143c.f24267o = colorStateList;
            c2143c.i(false);
        }
        q qVar = this.f16202c;
        z zVar = this.f16201b;
        if (!z11 && this.f16194U0 && (!isEnabled() || !z12)) {
            if (z10 || !this.f16192S0) {
                ValueAnimator valueAnimator = this.f16196W0;
                if (valueAnimator != null && valueAnimator.isRunning()) {
                    this.f16196W0.cancel();
                }
                if (z9 && this.f16195V0) {
                    a(0.0f);
                } else {
                    c2143c.p(0.0f);
                }
                if (e() && !((K5.h) this.f16208g0).f4331y.f4329r.isEmpty() && e()) {
                    ((K5.h) this.f16208g0).q(0.0f, 0.0f, 0.0f, 0.0f);
                }
                this.f16192S0 = true;
                AppCompatTextView appCompatTextView3 = this.f16231t;
                if (appCompatTextView3 != null && this.f16229s) {
                    appCompatTextView3.setText((CharSequence) null);
                    X0.q.a(this.f16200a, this.f16239x);
                    this.f16231t.setVisibility(4);
                }
                zVar.j = true;
                zVar.e();
                qVar.f4373r = true;
                qVar.n();
                return;
            }
            return;
        }
        if (!z10 && !this.f16192S0) {
            return;
        }
        ValueAnimator valueAnimator2 = this.f16196W0;
        if (valueAnimator2 != null && valueAnimator2.isRunning()) {
            this.f16196W0.cancel();
        }
        if (z9 && this.f16195V0) {
            a(1.0f);
        } else {
            c2143c.p(1.0f);
        }
        this.f16192S0 = false;
        if (e()) {
            j();
        }
        EditText editText3 = this.f16203d;
        if (editText3 != null) {
            editable = editText3.getText();
        }
        v(editable);
        zVar.j = false;
        zVar.e();
        qVar.f4373r = false;
        qVar.n();
    }

    public final void v(Editable editable) {
        int i9;
        ((C6.a) this.f16220n).getClass();
        if (editable != null) {
            i9 = editable.length();
        } else {
            i9 = 0;
        }
        FrameLayout frameLayout = this.f16200a;
        if (i9 == 0 && !this.f16192S0) {
            if (this.f16231t != null && this.f16229s && !TextUtils.isEmpty(this.f16228r)) {
                this.f16231t.setText(this.f16228r);
                X0.q.a(frameLayout, this.f16237w);
                this.f16231t.setVisibility(0);
                this.f16231t.bringToFront();
                announceForAccessibility(this.f16228r);
                return;
            }
            return;
        }
        AppCompatTextView appCompatTextView = this.f16231t;
        if (appCompatTextView != null && this.f16229s) {
            appCompatTextView.setText((CharSequence) null);
            X0.q.a(frameLayout, this.f16239x);
            this.f16231t.setVisibility(4);
        }
    }

    public final void w(boolean z9, boolean z10) {
        int defaultColor = this.f16185L0.getDefaultColor();
        int colorForState = this.f16185L0.getColorForState(new int[]{R.attr.state_hovered, R.attr.state_enabled}, defaultColor);
        int colorForState2 = this.f16185L0.getColorForState(new int[]{R.attr.state_activated, R.attr.state_enabled}, defaultColor);
        if (z9) {
            this.f16234u0 = colorForState2;
        } else if (z10) {
            this.f16234u0 = colorForState;
        } else {
            this.f16234u0 = defaultColor;
        }
    }

    public final void x() {
        boolean z9;
        AppCompatTextView appCompatTextView;
        EditText editText;
        EditText editText2;
        if (this.f16208g0 != null && this.f16225p0 != 0) {
            boolean z10 = false;
            if (!isFocused() && ((editText2 = this.f16203d) == null || !editText2.hasFocus())) {
                z9 = false;
            } else {
                z9 = true;
            }
            if (isHovered() || ((editText = this.f16203d) != null && editText.isHovered())) {
                z10 = true;
            }
            if (!isEnabled()) {
                this.f16234u0 = this.f16190Q0;
            } else if (m()) {
                if (this.f16185L0 != null) {
                    w(z9, z10);
                } else {
                    this.f16234u0 = getErrorCurrentTextColors();
                }
            } else if (this.f16218m && (appCompatTextView = this.f16222o) != null) {
                if (this.f16185L0 != null) {
                    w(z9, z10);
                } else {
                    this.f16234u0 = appCompatTextView.getCurrentTextColor();
                }
            } else if (z9) {
                this.f16234u0 = this.f16184K0;
            } else if (z10) {
                this.f16234u0 = this.f16183J0;
            } else {
                this.f16234u0 = this.f16182I0;
            }
            if (Build.VERSION.SDK_INT >= 29) {
                p();
            }
            q qVar = this.f16202c;
            qVar.l();
            CheckableImageButton checkableImageButton = qVar.f4359c;
            ColorStateList colorStateList = qVar.f4360d;
            TextInputLayout textInputLayout = qVar.f4357a;
            O4.h.E(textInputLayout, checkableImageButton, colorStateList);
            ColorStateList colorStateList2 = qVar.f4366k;
            CheckableImageButton checkableImageButton2 = qVar.f4363g;
            O4.h.E(textInputLayout, checkableImageButton2, colorStateList2);
            if (qVar.b() instanceof K5.l) {
                if (textInputLayout.m() && checkableImageButton2.getDrawable() != null) {
                    Drawable mutate = checkableImageButton2.getDrawable().mutate();
                    mutate.setTint(textInputLayout.getErrorCurrentTextColors());
                    checkableImageButton2.setImageDrawable(mutate);
                } else {
                    O4.h.c(textInputLayout, checkableImageButton2, qVar.f4366k, qVar.f4367l);
                }
            }
            z zVar = this.f16201b;
            O4.h.E(zVar.f4431a, zVar.f4434d, zVar.f4435e);
            if (this.f16225p0 == 2) {
                int i9 = this.r0;
                if (z9 && isEnabled()) {
                    this.r0 = this.f16232t0;
                } else {
                    this.r0 = this.f16230s0;
                }
                if (this.r0 != i9 && e() && !this.f16192S0) {
                    if (e()) {
                        ((K5.h) this.f16208g0).q(0.0f, 0.0f, 0.0f, 0.0f);
                    }
                    j();
                }
            }
            if (this.f16225p0 == 1) {
                if (!isEnabled()) {
                    this.f16236v0 = this.f16187N0;
                } else if (z10 && !z9) {
                    this.f16236v0 = this.f16189P0;
                } else if (z9) {
                    this.f16236v0 = this.f16188O0;
                } else {
                    this.f16236v0 = this.f16186M0;
                }
            }
            b();
        }
    }

    public void setStartIconDrawable(Drawable drawable) {
        this.f16201b.b(drawable);
    }

    public void setHint(int i9) {
        setHint(i9 != 0 ? getResources().getText(i9) : null);
    }

    public void setStartIconContentDescription(int i9) {
        setStartIconContentDescription(i9 != 0 ? getResources().getText(i9) : null);
    }

    @Deprecated
    public void setPasswordVisibilityToggleContentDescription(CharSequence charSequence) {
        this.f16202c.f4363g.setContentDescription(charSequence);
    }

    @Deprecated
    public void setPasswordVisibilityToggleDrawable(Drawable drawable) {
        this.f16202c.f4363g.setImageDrawable(drawable);
    }

    public void setErrorIconDrawable(Drawable drawable) {
        this.f16202c.i(drawable);
    }

    public void setEndIconContentDescription(CharSequence charSequence) {
        CheckableImageButton checkableImageButton = this.f16202c.f4363g;
        if (checkableImageButton.getContentDescription() != charSequence) {
            checkableImageButton.setContentDescription(charSequence);
        }
    }

    public void setEndIconDrawable(Drawable drawable) {
        q qVar = this.f16202c;
        CheckableImageButton checkableImageButton = qVar.f4363g;
        checkableImageButton.setImageDrawable(drawable);
        if (drawable != null) {
            ColorStateList colorStateList = qVar.f4366k;
            PorterDuff.Mode mode = qVar.f4367l;
            TextInputLayout textInputLayout = qVar.f4357a;
            O4.h.c(textInputLayout, checkableImageButton, colorStateList, mode);
            O4.h.E(textInputLayout, checkableImageButton, qVar.f4366k);
        }
    }
}
