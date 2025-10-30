package com.google.android.material.chip;

import A6.i;
import F5.x;
import M5.a;
import N.b;
import N.f;
import P.H;
import P.Q;
import a.AbstractC0485a;
import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.RippleDrawable;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.PointerIcon;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.CompoundButton;
import android.widget.TextView;
import b7.C0701c;
import com.google.android.gms.internal.measurement.AbstractC1002u1;
import com.google.android.gms.internal.measurement.D1;
import g5.AbstractC1254a;
import h5.C1283c;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.Locale;
import java.util.WeakHashMap;
import o2.C1676c;
import p.C1817r;
import q5.C1914a;
import q5.C1915b;
import q5.c;
import q5.d;
import q5.e;
import w5.g;
import w5.h;
import w5.m;
import w5.p;

/* loaded from: classes.dex */
public class Chip extends C1817r implements d, x, h {

    /* renamed from: x, reason: collision with root package name */
    public static final Rect f15943x = new Rect();

    /* renamed from: y, reason: collision with root package name */
    public static final int[] f15944y = {R.attr.state_selected};

    /* renamed from: z, reason: collision with root package name */
    public static final int[] f15945z = {R.attr.state_checkable};

    /* renamed from: e, reason: collision with root package name */
    public e f15946e;

    /* renamed from: f, reason: collision with root package name */
    public InsetDrawable f15947f;

    /* renamed from: g, reason: collision with root package name */
    public RippleDrawable f15948g;

    /* renamed from: h, reason: collision with root package name */
    public View.OnClickListener f15949h;

    /* renamed from: i, reason: collision with root package name */
    public CompoundButton.OnCheckedChangeListener f15950i;
    public g j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f15951k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f15952l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f15953m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f15954n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f15955o;

    /* renamed from: p, reason: collision with root package name */
    public int f15956p;

    /* renamed from: q, reason: collision with root package name */
    public int f15957q;

    /* renamed from: r, reason: collision with root package name */
    public CharSequence f15958r;

    /* renamed from: s, reason: collision with root package name */
    public final c f15959s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f15960t;

    /* renamed from: u, reason: collision with root package name */
    public final Rect f15961u;

    /* renamed from: v, reason: collision with root package name */
    public final RectF f15962v;

    /* renamed from: w, reason: collision with root package name */
    public final C1914a f15963w;

    public Chip(Context context, AttributeSet attributeSet) {
        super(a.a(context, attributeSet, co.notix.R.attr.chipStyle, co.notix.R.style.Widget_MaterialComponents_Chip_Action), attributeSet, co.notix.R.attr.chipStyle);
        C5.e eVar;
        C1283c c1283c;
        C1283c c1283c2;
        int resourceId;
        int resourceId2;
        int resourceId3;
        this.f15961u = new Rect();
        this.f15962v = new RectF();
        this.f15963w = new C1914a(0, this);
        Context context2 = getContext();
        if (attributeSet != null) {
            if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "background") != null) {
                Log.w("Chip", "Do not set the background; Chip manages its own background drawable.");
            }
            if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableLeft") == null) {
                if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableStart") == null) {
                    if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableEnd") == null) {
                        if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableRight") == null) {
                            if (attributeSet.getAttributeBooleanValue("http://schemas.android.com/apk/res/android", "singleLine", true) && attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "lines", 1) == 1 && attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "minLines", 1) == 1 && attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "maxLines", 1) == 1) {
                                if (attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "gravity", 8388627) != 8388627) {
                                    Log.w("Chip", "Chip text must be vertically center and start aligned");
                                }
                            } else {
                                throw new UnsupportedOperationException("Chip does not support multi-line text");
                            }
                        } else {
                            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
                        }
                    } else {
                        throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
                    }
                } else {
                    throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
                }
            } else {
                throw new UnsupportedOperationException("Please set left drawable using R.attr#chipIcon.");
            }
        }
        e eVar2 = new e(context2, attributeSet);
        int[] iArr = AbstractC1254a.f17743h;
        TypedArray i9 = p.i(eVar2.f22376D0, attributeSet, iArr, co.notix.R.attr.chipStyle, co.notix.R.style.Widget_MaterialComponents_Chip_Action, new int[0]);
        eVar2.f22404d1 = i9.hasValue(37);
        Context context3 = eVar2.f22376D0;
        ColorStateList p9 = D1.p(context3, i9, 24);
        if (eVar2.f22423y != p9) {
            eVar2.f22423y = p9;
            eVar2.onStateChange(eVar2.getState());
        }
        ColorStateList p10 = D1.p(context3, i9, 11);
        if (eVar2.f22425z != p10) {
            eVar2.f22425z = p10;
            eVar2.onStateChange(eVar2.getState());
        }
        float dimension = i9.getDimension(19, 0.0f);
        if (eVar2.f22369A != dimension) {
            eVar2.f22369A = dimension;
            eVar2.invalidateSelf();
            eVar2.x();
        }
        if (i9.hasValue(12)) {
            eVar2.D(i9.getDimension(12, 0.0f));
        }
        eVar2.I(D1.p(context3, i9, 22));
        eVar2.J(i9.getDimension(23, 0.0f));
        eVar2.S(D1.p(context3, i9, 36));
        String text = i9.getText(5);
        text = text == null ? "" : text;
        boolean equals = TextUtils.equals(eVar2.Y, text);
        m mVar = eVar2.f22382J0;
        if (!equals) {
            eVar2.Y = text;
            mVar.f24309e = true;
            eVar2.invalidateSelf();
            eVar2.x();
        }
        if (i9.hasValue(0) && (resourceId3 = i9.getResourceId(0, 0)) != 0) {
            eVar = new C5.e(context3, resourceId3);
        } else {
            eVar = null;
        }
        eVar.f1610k = i9.getDimension(1, eVar.f1610k);
        mVar.c(eVar, context3);
        int i10 = i9.getInt(3, 0);
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 == 3) {
                    eVar2.f22401a1 = TextUtils.TruncateAt.END;
                }
            } else {
                eVar2.f22401a1 = TextUtils.TruncateAt.MIDDLE;
            }
        } else {
            eVar2.f22401a1 = TextUtils.TruncateAt.START;
        }
        eVar2.H(i9.getBoolean(18, false));
        if (attributeSet != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "chipIconEnabled") != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "chipIconVisible") == null) {
            eVar2.H(i9.getBoolean(15, false));
        }
        eVar2.E(D1.t(context3, i9, 14));
        if (i9.hasValue(17)) {
            eVar2.G(D1.p(context3, i9, 17));
        }
        eVar2.F(i9.getDimension(16, -1.0f));
        eVar2.P(i9.getBoolean(31, false));
        if (attributeSet != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "closeIconEnabled") != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "closeIconVisible") == null) {
            eVar2.P(i9.getBoolean(26, false));
        }
        eVar2.K(D1.t(context3, i9, 25));
        eVar2.O(D1.p(context3, i9, 30));
        eVar2.M(i9.getDimension(28, 0.0f));
        eVar2.z(i9.getBoolean(6, false));
        eVar2.C(i9.getBoolean(10, false));
        if (attributeSet != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "checkedIconEnabled") != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "checkedIconVisible") == null) {
            eVar2.C(i9.getBoolean(8, false));
        }
        eVar2.A(D1.t(context3, i9, 7));
        if (i9.hasValue(9)) {
            eVar2.B(D1.p(context3, i9, 9));
        }
        if (i9.hasValue(39) && (resourceId2 = i9.getResourceId(39, 0)) != 0) {
            c1283c = C1283c.a(context3, resourceId2);
        } else {
            c1283c = null;
        }
        eVar2.f22418t0 = c1283c;
        if (i9.hasValue(33) && (resourceId = i9.getResourceId(33, 0)) != 0) {
            c1283c2 = C1283c.a(context3, resourceId);
        } else {
            c1283c2 = null;
        }
        eVar2.f22419u0 = c1283c2;
        float dimension2 = i9.getDimension(21, 0.0f);
        if (eVar2.f22420v0 != dimension2) {
            eVar2.f22420v0 = dimension2;
            eVar2.invalidateSelf();
            eVar2.x();
        }
        eVar2.R(i9.getDimension(35, 0.0f));
        eVar2.Q(i9.getDimension(34, 0.0f));
        float dimension3 = i9.getDimension(41, 0.0f);
        if (eVar2.f22424y0 != dimension3) {
            eVar2.f22424y0 = dimension3;
            eVar2.invalidateSelf();
            eVar2.x();
        }
        float dimension4 = i9.getDimension(40, 0.0f);
        if (eVar2.f22426z0 != dimension4) {
            eVar2.f22426z0 = dimension4;
            eVar2.invalidateSelf();
            eVar2.x();
        }
        eVar2.N(i9.getDimension(29, 0.0f));
        eVar2.L(i9.getDimension(27, 0.0f));
        float dimension5 = i9.getDimension(13, 0.0f);
        if (eVar2.f22374C0 != dimension5) {
            eVar2.f22374C0 = dimension5;
            eVar2.invalidateSelf();
            eVar2.x();
        }
        eVar2.f22403c1 = i9.getDimensionPixelSize(4, Integer.MAX_VALUE);
        i9.recycle();
        p.a(context2, attributeSet, co.notix.R.attr.chipStyle, co.notix.R.style.Widget_MaterialComponents_Chip_Action);
        p.b(context2, attributeSet, iArr, co.notix.R.attr.chipStyle, co.notix.R.style.Widget_MaterialComponents_Chip_Action, new int[0]);
        TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, iArr, co.notix.R.attr.chipStyle, co.notix.R.style.Widget_MaterialComponents_Chip_Action);
        this.f15955o = obtainStyledAttributes.getBoolean(32, false);
        this.f15957q = (int) Math.ceil(obtainStyledAttributes.getDimension(20, (float) Math.ceil(p.e(getContext(), 48))));
        obtainStyledAttributes.recycle();
        setChipDrawable(eVar2);
        eVar2.j(H.e(this));
        p.a(context2, attributeSet, co.notix.R.attr.chipStyle, co.notix.R.style.Widget_MaterialComponents_Chip_Action);
        p.b(context2, attributeSet, iArr, co.notix.R.attr.chipStyle, co.notix.R.style.Widget_MaterialComponents_Chip_Action, new int[0]);
        TypedArray obtainStyledAttributes2 = context2.obtainStyledAttributes(attributeSet, iArr, co.notix.R.attr.chipStyle, co.notix.R.style.Widget_MaterialComponents_Chip_Action);
        boolean hasValue = obtainStyledAttributes2.hasValue(37);
        obtainStyledAttributes2.recycle();
        this.f15959s = new c(this, this);
        e();
        if (!hasValue) {
            setOutlineProvider(new C1915b(this));
        }
        setChecked(this.f15951k);
        setText(eVar2.Y);
        setEllipsize(eVar2.f22401a1);
        h();
        if (!this.f15946e.f22402b1) {
            setLines(1);
            setHorizontallyScrolling(true);
        }
        setGravity(8388627);
        g();
        if (this.f15955o) {
            setMinHeight(this.f15957q);
        }
        this.f15956p = getLayoutDirection();
        super.setOnCheckedChangeListener(new C1676c(1, this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public RectF getCloseIconTouchBounds() {
        RectF rectF = this.f15962v;
        rectF.setEmpty();
        if (d() && this.f15949h != null) {
            e eVar = this.f15946e;
            Rect bounds = eVar.getBounds();
            rectF.setEmpty();
            if (eVar.V()) {
                float f9 = eVar.f22374C0 + eVar.f22372B0 + eVar.f22413n0 + eVar.f22370A0 + eVar.f22426z0;
                if (eVar.getLayoutDirection() == 0) {
                    float f10 = bounds.right;
                    rectF.right = f10;
                    rectF.left = f10 - f9;
                } else {
                    float f11 = bounds.left;
                    rectF.left = f11;
                    rectF.right = f11 + f9;
                }
                rectF.top = bounds.top;
                rectF.bottom = bounds.bottom;
            }
        }
        return rectF;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Rect getCloseIconTouchBoundsInt() {
        RectF closeIconTouchBounds = getCloseIconTouchBounds();
        int i9 = (int) closeIconTouchBounds.left;
        int i10 = (int) closeIconTouchBounds.top;
        int i11 = (int) closeIconTouchBounds.right;
        int i12 = (int) closeIconTouchBounds.bottom;
        Rect rect = this.f15961u;
        rect.set(i9, i10, i11, i12);
        return rect;
    }

    private C5.e getTextAppearance() {
        e eVar = this.f15946e;
        if (eVar != null) {
            return eVar.f22382J0.f24311g;
        }
        return null;
    }

    private void setCloseIconHovered(boolean z9) {
        if (this.f15953m != z9) {
            this.f15953m = z9;
            refreshDrawableState();
        }
    }

    private void setCloseIconPressed(boolean z9) {
        if (this.f15952l != z9) {
            this.f15952l = z9;
            refreshDrawableState();
        }
    }

    public final void c(int i9) {
        int i10;
        this.f15957q = i9;
        int i11 = 0;
        if (!this.f15955o) {
            InsetDrawable insetDrawable = this.f15947f;
            if (insetDrawable != null) {
                if (insetDrawable != null) {
                    this.f15947f = null;
                    setMinWidth(0);
                    setMinHeight((int) getChipMinHeight());
                    int[] iArr = D5.a.f1910a;
                    f();
                    return;
                }
                return;
            }
            int[] iArr2 = D5.a.f1910a;
            f();
            return;
        }
        int max = Math.max(0, i9 - ((int) this.f15946e.f22369A));
        int max2 = Math.max(0, i9 - this.f15946e.getIntrinsicWidth());
        if (max2 <= 0 && max <= 0) {
            InsetDrawable insetDrawable2 = this.f15947f;
            if (insetDrawable2 != null) {
                if (insetDrawable2 != null) {
                    this.f15947f = null;
                    setMinWidth(0);
                    setMinHeight((int) getChipMinHeight());
                    int[] iArr3 = D5.a.f1910a;
                    f();
                    return;
                }
                return;
            }
            int[] iArr4 = D5.a.f1910a;
            f();
            return;
        }
        if (max2 > 0) {
            i10 = max2 / 2;
        } else {
            i10 = 0;
        }
        if (max > 0) {
            i11 = max / 2;
        }
        int i12 = i11;
        if (this.f15947f != null) {
            Rect rect = new Rect();
            this.f15947f.getPadding(rect);
            if (rect.top == i12 && rect.bottom == i12 && rect.left == i10 && rect.right == i10) {
                int[] iArr5 = D5.a.f1910a;
                f();
                return;
            }
        }
        if (getMinHeight() != i9) {
            setMinHeight(i9);
        }
        if (getMinWidth() != i9) {
            setMinWidth(i9);
        }
        this.f15947f = new InsetDrawable((Drawable) this.f15946e, i10, i12, i10, i12);
        int[] iArr6 = D5.a.f1910a;
        f();
    }

    /* JADX WARN: Removed duplicated region for block: B:11:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0011 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean d() {
        /*
            r2 = this;
            q5.e r0 = r2.f15946e
            if (r0 == 0) goto L13
            android.graphics.drawable.Drawable r0 = r0.f22410k0
            if (r0 == 0) goto Le
            boolean r1 = r0 instanceof I.c
            if (r1 == 0) goto Lf
            I.c r0 = (I.c) r0
        Le:
            r0 = 0
        Lf:
            if (r0 == 0) goto L13
            r0 = 1
            return r0
        L13:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.chip.Chip.d():boolean");
    }

    @Override // android.view.View
    public final boolean dispatchHoverEvent(MotionEvent motionEvent) {
        if (!this.f15960t) {
            return super.dispatchHoverEvent(motionEvent);
        }
        if (!this.f15959s.m(motionEvent) && !super.dispatchHoverEvent(motionEvent)) {
            return false;
        }
        return true;
    }

    @Override // android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (!this.f15960t) {
            return super.dispatchKeyEvent(keyEvent);
        }
        c cVar = this.f15959s;
        cVar.getClass();
        boolean z9 = false;
        int i9 = 0;
        z9 = false;
        z9 = false;
        z9 = false;
        z9 = false;
        z9 = false;
        if (keyEvent.getAction() != 1) {
            int keyCode = keyEvent.getKeyCode();
            if (keyCode != 61) {
                int i10 = 66;
                if (keyCode != 66) {
                    switch (keyCode) {
                        case 19:
                        case 20:
                        case 21:
                        case 22:
                            if (keyEvent.hasNoModifiers()) {
                                if (keyCode != 19) {
                                    if (keyCode != 21) {
                                        if (keyCode != 22) {
                                            i10 = 130;
                                        }
                                    } else {
                                        i10 = 17;
                                    }
                                } else {
                                    i10 = 33;
                                }
                                int repeatCount = keyEvent.getRepeatCount() + 1;
                                boolean z10 = false;
                                while (i9 < repeatCount && cVar.q(i10, null)) {
                                    i9++;
                                    z10 = true;
                                }
                                z9 = z10;
                                break;
                            }
                            break;
                    }
                }
                if (keyEvent.hasNoModifiers() && keyEvent.getRepeatCount() == 0) {
                    int i11 = cVar.f7550l;
                    if (i11 != Integer.MIN_VALUE) {
                        cVar.s(i11, 16, null);
                    }
                    z9 = true;
                }
            } else if (keyEvent.hasNoModifiers()) {
                z9 = cVar.q(2, null);
            } else if (keyEvent.hasModifiers(1)) {
                z9 = cVar.q(1, null);
            }
        }
        if (z9 && cVar.f7550l != Integer.MIN_VALUE) {
            return true;
        }
        return super.dispatchKeyEvent(keyEvent);
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [int, boolean] */
    @Override // p.C1817r, android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        int i9;
        super.drawableStateChanged();
        e eVar = this.f15946e;
        boolean z9 = false;
        if (eVar != null && e.w(eVar.f22410k0)) {
            e eVar2 = this.f15946e;
            ?? isEnabled = isEnabled();
            int i10 = isEnabled;
            if (this.f15954n) {
                i10 = isEnabled + 1;
            }
            int i11 = i10;
            if (this.f15953m) {
                i11 = i10 + 1;
            }
            int i12 = i11;
            if (this.f15952l) {
                i12 = i11 + 1;
            }
            int i13 = i12;
            if (isChecked()) {
                i13 = i12 + 1;
            }
            int[] iArr = new int[i13];
            if (isEnabled()) {
                iArr[0] = 16842910;
                i9 = 1;
            } else {
                i9 = 0;
            }
            if (this.f15954n) {
                iArr[i9] = 16842908;
                i9++;
            }
            if (this.f15953m) {
                iArr[i9] = 16843623;
                i9++;
            }
            if (this.f15952l) {
                iArr[i9] = 16842919;
                i9++;
            }
            if (isChecked()) {
                iArr[i9] = 16842913;
            }
            if (!Arrays.equals(eVar2.f22397X0, iArr)) {
                eVar2.f22397X0 = iArr;
                if (eVar2.V()) {
                    z9 = eVar2.y(eVar2.getState(), iArr);
                }
            }
        }
        if (z9) {
            invalidate();
        }
    }

    public final void e() {
        e eVar;
        if (d() && (eVar = this.f15946e) != null && eVar.f22409j0 && this.f15949h != null) {
            Q.m(this, this.f15959s);
            this.f15960t = true;
        } else {
            Q.m(this, null);
            this.f15960t = false;
        }
    }

    public final void f() {
        this.f15948g = new RippleDrawable(D5.a.c(this.f15946e.f22396X), getBackgroundDrawable(), null);
        this.f15946e.getClass();
        RippleDrawable rippleDrawable = this.f15948g;
        WeakHashMap weakHashMap = Q.f5546a;
        setBackground(rippleDrawable);
        g();
    }

    public final void g() {
        e eVar;
        if (!TextUtils.isEmpty(getText()) && (eVar = this.f15946e) != null) {
            int t7 = (int) (eVar.t() + eVar.f22374C0 + eVar.f22426z0);
            e eVar2 = this.f15946e;
            int s9 = (int) (eVar2.s() + eVar2.f22420v0 + eVar2.f22424y0);
            if (this.f15947f != null) {
                Rect rect = new Rect();
                this.f15947f.getPadding(rect);
                s9 += rect.left;
                t7 += rect.right;
            }
            int paddingTop = getPaddingTop();
            int paddingBottom = getPaddingBottom();
            WeakHashMap weakHashMap = Q.f5546a;
            setPaddingRelative(s9, paddingTop, t7, paddingBottom);
        }
    }

    @Override // android.widget.CheckBox, android.widget.CompoundButton, android.widget.Button, android.widget.TextView, android.view.View
    public CharSequence getAccessibilityClassName() {
        boolean z9;
        if (!TextUtils.isEmpty(this.f15958r)) {
            return this.f15958r;
        }
        e eVar = this.f15946e;
        if (eVar != null && eVar.f22415p0) {
            z9 = true;
        } else {
            z9 = false;
        }
        if (z9) {
            ViewParent parent = getParent();
            if ((parent instanceof ChipGroup) && ((ChipGroup) parent).f15967h.f24213d) {
                return "android.widget.RadioButton";
            }
            return "android.widget.Button";
        }
        if (isClickable()) {
            return "android.widget.Button";
        }
        return "android.view.View";
    }

    public Drawable getBackgroundDrawable() {
        InsetDrawable insetDrawable = this.f15947f;
        if (insetDrawable == null) {
            return this.f15946e;
        }
        return insetDrawable;
    }

    public Drawable getCheckedIcon() {
        e eVar = this.f15946e;
        if (eVar != null) {
            return eVar.r0;
        }
        return null;
    }

    public ColorStateList getCheckedIconTint() {
        e eVar = this.f15946e;
        if (eVar != null) {
            return eVar.f22417s0;
        }
        return null;
    }

    public ColorStateList getChipBackgroundColor() {
        e eVar = this.f15946e;
        if (eVar != null) {
            return eVar.f22425z;
        }
        return null;
    }

    public float getChipCornerRadius() {
        e eVar = this.f15946e;
        if (eVar == null) {
            return 0.0f;
        }
        return Math.max(0.0f, eVar.u());
    }

    public Drawable getChipDrawable() {
        return this.f15946e;
    }

    public float getChipEndPadding() {
        e eVar = this.f15946e;
        if (eVar != null) {
            return eVar.f22374C0;
        }
        return 0.0f;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public Drawable getChipIcon() {
        Drawable drawable;
        e eVar = this.f15946e;
        if (eVar == null || (drawable = eVar.f22405f0) == 0) {
            return null;
        }
        if (drawable instanceof I.c) {
            return null;
        }
        return drawable;
    }

    public float getChipIconSize() {
        e eVar = this.f15946e;
        if (eVar != null) {
            return eVar.f22407h0;
        }
        return 0.0f;
    }

    public ColorStateList getChipIconTint() {
        e eVar = this.f15946e;
        if (eVar != null) {
            return eVar.f22406g0;
        }
        return null;
    }

    public float getChipMinHeight() {
        e eVar = this.f15946e;
        if (eVar != null) {
            return eVar.f22369A;
        }
        return 0.0f;
    }

    public float getChipStartPadding() {
        e eVar = this.f15946e;
        if (eVar != null) {
            return eVar.f22420v0;
        }
        return 0.0f;
    }

    public ColorStateList getChipStrokeColor() {
        e eVar = this.f15946e;
        if (eVar != null) {
            return eVar.f22373C;
        }
        return null;
    }

    public float getChipStrokeWidth() {
        e eVar = this.f15946e;
        if (eVar != null) {
            return eVar.f22375D;
        }
        return 0.0f;
    }

    @Deprecated
    public CharSequence getChipText() {
        return getText();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public Drawable getCloseIcon() {
        Drawable drawable;
        e eVar = this.f15946e;
        if (eVar == null || (drawable = eVar.f22410k0) == 0) {
            return null;
        }
        if (drawable instanceof I.c) {
            return null;
        }
        return drawable;
    }

    public CharSequence getCloseIconContentDescription() {
        e eVar = this.f15946e;
        if (eVar != null) {
            return eVar.f22414o0;
        }
        return null;
    }

    public float getCloseIconEndPadding() {
        e eVar = this.f15946e;
        if (eVar != null) {
            return eVar.f22372B0;
        }
        return 0.0f;
    }

    public float getCloseIconSize() {
        e eVar = this.f15946e;
        if (eVar != null) {
            return eVar.f22413n0;
        }
        return 0.0f;
    }

    public float getCloseIconStartPadding() {
        e eVar = this.f15946e;
        if (eVar != null) {
            return eVar.f22370A0;
        }
        return 0.0f;
    }

    public ColorStateList getCloseIconTint() {
        e eVar = this.f15946e;
        if (eVar != null) {
            return eVar.f22412m0;
        }
        return null;
    }

    @Override // android.widget.TextView
    public TextUtils.TruncateAt getEllipsize() {
        e eVar = this.f15946e;
        if (eVar != null) {
            return eVar.f22401a1;
        }
        return null;
    }

    @Override // android.widget.TextView, android.view.View
    public final void getFocusedRect(Rect rect) {
        if (this.f15960t) {
            c cVar = this.f15959s;
            if (cVar.f7550l == 1 || cVar.f7549k == 1) {
                rect.set(getCloseIconTouchBoundsInt());
                return;
            }
        }
        super.getFocusedRect(rect);
    }

    public C1283c getHideMotionSpec() {
        e eVar = this.f15946e;
        if (eVar != null) {
            return eVar.f22419u0;
        }
        return null;
    }

    public float getIconEndPadding() {
        e eVar = this.f15946e;
        if (eVar != null) {
            return eVar.f22422x0;
        }
        return 0.0f;
    }

    public float getIconStartPadding() {
        e eVar = this.f15946e;
        if (eVar != null) {
            return eVar.f22421w0;
        }
        return 0.0f;
    }

    public ColorStateList getRippleColor() {
        e eVar = this.f15946e;
        if (eVar != null) {
            return eVar.f22396X;
        }
        return null;
    }

    public F5.m getShapeAppearanceModel() {
        return this.f15946e.f2483a.f2466a;
    }

    public C1283c getShowMotionSpec() {
        e eVar = this.f15946e;
        if (eVar != null) {
            return eVar.f22418t0;
        }
        return null;
    }

    public float getTextEndPadding() {
        e eVar = this.f15946e;
        if (eVar != null) {
            return eVar.f22426z0;
        }
        return 0.0f;
    }

    public float getTextStartPadding() {
        e eVar = this.f15946e;
        if (eVar != null) {
            return eVar.f22424y0;
        }
        return 0.0f;
    }

    public final void h() {
        TextPaint paint = getPaint();
        e eVar = this.f15946e;
        if (eVar != null) {
            paint.drawableState = eVar.getState();
        }
        C5.e textAppearance = getTextAppearance();
        if (textAppearance != null) {
            textAppearance.e(getContext(), paint, this.f15963w);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        AbstractC1002u1.b0(this, this.f15946e);
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final int[] onCreateDrawableState(int i9) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i9 + 2);
        if (isChecked()) {
            View.mergeDrawableStates(onCreateDrawableState, f15944y);
        }
        e eVar = this.f15946e;
        if (eVar != null && eVar.f22415p0) {
            View.mergeDrawableStates(onCreateDrawableState, f15945z);
        }
        return onCreateDrawableState;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onFocusChanged(boolean z9, int i9, Rect rect) {
        super.onFocusChanged(z9, i9, rect);
        if (this.f15960t) {
            c cVar = this.f15959s;
            int i10 = cVar.f7550l;
            if (i10 != Integer.MIN_VALUE) {
                cVar.j(i10);
            }
            if (z9) {
                cVar.q(i9, rect);
            }
        }
    }

    @Override // android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 7) {
            if (actionMasked == 10) {
                setCloseIconHovered(false);
            }
        } else {
            setCloseIconHovered(getCloseIconTouchBounds().contains(motionEvent.getX(), motionEvent.getY()));
        }
        return super.onHoverEvent(motionEvent);
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        boolean z9;
        int i9;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(getAccessibilityClassName());
        e eVar = this.f15946e;
        if (eVar != null && eVar.f22415p0) {
            z9 = true;
        } else {
            z9 = false;
        }
        accessibilityNodeInfo.setCheckable(z9);
        accessibilityNodeInfo.setClickable(isClickable());
        if (getParent() instanceof ChipGroup) {
            ChipGroup chipGroup = (ChipGroup) getParent();
            int i10 = -1;
            if (chipGroup.f24286c) {
                i9 = 0;
                for (int i11 = 0; i11 < chipGroup.getChildCount(); i11++) {
                    View childAt = chipGroup.getChildAt(i11);
                    if ((childAt instanceof Chip) && chipGroup.getChildAt(i11).getVisibility() == 0) {
                        if (((Chip) childAt) == this) {
                            break;
                        } else {
                            i9++;
                        }
                    }
                }
            }
            i9 = -1;
            Object tag = getTag(co.notix.R.id.row_index_key);
            if (tag instanceof Integer) {
                i10 = ((Integer) tag).intValue();
            }
            accessibilityNodeInfo.setCollectionItemInfo((AccessibilityNodeInfo.CollectionItemInfo) C0701c.I(isChecked(), i10, 1, i9, 1).f11404b);
        }
    }

    @Override // android.widget.Button, android.widget.TextView, android.view.View
    public final PointerIcon onResolvePointerIcon(MotionEvent motionEvent, int i9) {
        if (getCloseIconTouchBounds().contains(motionEvent.getX(), motionEvent.getY()) && isEnabled()) {
            return PointerIcon.getSystemIcon(getContext(), 1002);
        }
        return super.onResolvePointerIcon(motionEvent, i9);
    }

    @Override // android.widget.TextView, android.view.View
    public final void onRtlPropertiesChanged(int i9) {
        super.onRtlPropertiesChanged(i9);
        if (this.f15956p != i9) {
            this.f15956p = i9;
            g();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x001e, code lost:
    
        if (r0 != 3) goto L28;
     */
    @Override // android.widget.TextView, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onTouchEvent(android.view.MotionEvent r6) {
        /*
            r5 = this;
            int r0 = r6.getActionMasked()
            android.graphics.RectF r1 = r5.getCloseIconTouchBounds()
            float r2 = r6.getX()
            float r3 = r6.getY()
            boolean r1 = r1.contains(r2, r3)
            r2 = 0
            r3 = 1
            if (r0 == 0) goto L4a
            if (r0 == r3) goto L2c
            r4 = 2
            if (r0 == r4) goto L21
            r1 = 3
            if (r0 == r1) goto L45
            goto L50
        L21:
            boolean r0 = r5.f15952l
            if (r0 == 0) goto L50
            if (r1 != 0) goto L2a
            r5.setCloseIconPressed(r2)
        L2a:
            r0 = r3
            goto L51
        L2c:
            boolean r0 = r5.f15952l
            if (r0 == 0) goto L45
            r5.playSoundEffect(r2)
            android.view.View$OnClickListener r0 = r5.f15949h
            if (r0 == 0) goto L3a
            r0.onClick(r5)
        L3a:
            boolean r0 = r5.f15960t
            if (r0 == 0) goto L43
            q5.c r0 = r5.f15959s
            r0.x(r3, r3)
        L43:
            r0 = r3
            goto L46
        L45:
            r0 = r2
        L46:
            r5.setCloseIconPressed(r2)
            goto L51
        L4a:
            if (r1 == 0) goto L50
            r5.setCloseIconPressed(r3)
            goto L2a
        L50:
            r0 = r2
        L51:
            if (r0 != 0) goto L5b
            boolean r6 = super.onTouchEvent(r6)
            if (r6 == 0) goto L5a
            goto L5b
        L5a:
            return r2
        L5b:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.chip.Chip.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public void setAccessibilityClassName(CharSequence charSequence) {
        this.f15958r = charSequence;
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        if (drawable != getBackgroundDrawable() && drawable != this.f15948g) {
            Log.w("Chip", "Do not set the background; Chip manages its own background drawable.");
        } else {
            super.setBackground(drawable);
        }
    }

    @Override // android.view.View
    public void setBackgroundColor(int i9) {
        Log.w("Chip", "Do not set the background color; Chip manages its own background drawable.");
    }

    @Override // p.C1817r, android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        if (drawable != getBackgroundDrawable() && drawable != this.f15948g) {
            Log.w("Chip", "Do not set the background drawable; Chip manages its own background drawable.");
        } else {
            super.setBackgroundDrawable(drawable);
        }
    }

    @Override // p.C1817r, android.view.View
    public void setBackgroundResource(int i9) {
        Log.w("Chip", "Do not set the background resource; Chip manages its own background drawable.");
    }

    @Override // android.view.View
    public void setBackgroundTintList(ColorStateList colorStateList) {
        Log.w("Chip", "Do not set the background tint list; Chip manages its own background drawable.");
    }

    @Override // android.view.View
    public void setBackgroundTintMode(PorterDuff.Mode mode) {
        Log.w("Chip", "Do not set the background tint mode; Chip manages its own background drawable.");
    }

    public void setCheckable(boolean z9) {
        e eVar = this.f15946e;
        if (eVar != null) {
            eVar.z(z9);
        }
    }

    public void setCheckableResource(int i9) {
        e eVar = this.f15946e;
        if (eVar != null) {
            eVar.z(eVar.f22376D0.getResources().getBoolean(i9));
        }
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public void setChecked(boolean z9) {
        e eVar = this.f15946e;
        if (eVar == null) {
            this.f15951k = z9;
        } else if (eVar.f22415p0) {
            super.setChecked(z9);
        }
    }

    public void setCheckedIcon(Drawable drawable) {
        e eVar = this.f15946e;
        if (eVar != null) {
            eVar.A(drawable);
        }
    }

    @Deprecated
    public void setCheckedIconEnabled(boolean z9) {
        setCheckedIconVisible(z9);
    }

    @Deprecated
    public void setCheckedIconEnabledResource(int i9) {
        setCheckedIconVisible(i9);
    }

    public void setCheckedIconResource(int i9) {
        e eVar = this.f15946e;
        if (eVar != null) {
            eVar.A(AbstractC0485a.q(eVar.f22376D0, i9));
        }
    }

    public void setCheckedIconTint(ColorStateList colorStateList) {
        e eVar = this.f15946e;
        if (eVar != null) {
            eVar.B(colorStateList);
        }
    }

    public void setCheckedIconTintResource(int i9) {
        e eVar = this.f15946e;
        if (eVar != null) {
            eVar.B(E.d.c(eVar.f22376D0, i9));
        }
    }

    public void setCheckedIconVisible(int i9) {
        e eVar = this.f15946e;
        if (eVar != null) {
            eVar.C(eVar.f22376D0.getResources().getBoolean(i9));
        }
    }

    public void setChipBackgroundColor(ColorStateList colorStateList) {
        e eVar = this.f15946e;
        if (eVar != null && eVar.f22425z != colorStateList) {
            eVar.f22425z = colorStateList;
            eVar.onStateChange(eVar.getState());
        }
    }

    public void setChipBackgroundColorResource(int i9) {
        ColorStateList c3;
        e eVar = this.f15946e;
        if (eVar != null && eVar.f22425z != (c3 = E.d.c(eVar.f22376D0, i9))) {
            eVar.f22425z = c3;
            eVar.onStateChange(eVar.getState());
        }
    }

    @Deprecated
    public void setChipCornerRadius(float f9) {
        e eVar = this.f15946e;
        if (eVar != null) {
            eVar.D(f9);
        }
    }

    @Deprecated
    public void setChipCornerRadiusResource(int i9) {
        e eVar = this.f15946e;
        if (eVar != null) {
            eVar.D(eVar.f22376D0.getResources().getDimension(i9));
        }
    }

    public void setChipDrawable(e eVar) {
        e eVar2 = this.f15946e;
        if (eVar2 != eVar) {
            if (eVar2 != null) {
                eVar2.f22400Z0 = new WeakReference(null);
            }
            this.f15946e = eVar;
            eVar.f22402b1 = false;
            eVar.f22400Z0 = new WeakReference(this);
            c(this.f15957q);
        }
    }

    public void setChipEndPadding(float f9) {
        e eVar = this.f15946e;
        if (eVar != null && eVar.f22374C0 != f9) {
            eVar.f22374C0 = f9;
            eVar.invalidateSelf();
            eVar.x();
        }
    }

    public void setChipEndPaddingResource(int i9) {
        e eVar = this.f15946e;
        if (eVar != null) {
            float dimension = eVar.f22376D0.getResources().getDimension(i9);
            if (eVar.f22374C0 != dimension) {
                eVar.f22374C0 = dimension;
                eVar.invalidateSelf();
                eVar.x();
            }
        }
    }

    public void setChipIcon(Drawable drawable) {
        e eVar = this.f15946e;
        if (eVar != null) {
            eVar.E(drawable);
        }
    }

    @Deprecated
    public void setChipIconEnabled(boolean z9) {
        setChipIconVisible(z9);
    }

    @Deprecated
    public void setChipIconEnabledResource(int i9) {
        setChipIconVisible(i9);
    }

    public void setChipIconResource(int i9) {
        e eVar = this.f15946e;
        if (eVar != null) {
            eVar.E(AbstractC0485a.q(eVar.f22376D0, i9));
        }
    }

    public void setChipIconSize(float f9) {
        e eVar = this.f15946e;
        if (eVar != null) {
            eVar.F(f9);
        }
    }

    public void setChipIconSizeResource(int i9) {
        e eVar = this.f15946e;
        if (eVar != null) {
            eVar.F(eVar.f22376D0.getResources().getDimension(i9));
        }
    }

    public void setChipIconTint(ColorStateList colorStateList) {
        e eVar = this.f15946e;
        if (eVar != null) {
            eVar.G(colorStateList);
        }
    }

    public void setChipIconTintResource(int i9) {
        e eVar = this.f15946e;
        if (eVar != null) {
            eVar.G(E.d.c(eVar.f22376D0, i9));
        }
    }

    public void setChipIconVisible(int i9) {
        e eVar = this.f15946e;
        if (eVar != null) {
            eVar.H(eVar.f22376D0.getResources().getBoolean(i9));
        }
    }

    public void setChipMinHeight(float f9) {
        e eVar = this.f15946e;
        if (eVar != null && eVar.f22369A != f9) {
            eVar.f22369A = f9;
            eVar.invalidateSelf();
            eVar.x();
        }
    }

    public void setChipMinHeightResource(int i9) {
        e eVar = this.f15946e;
        if (eVar != null) {
            float dimension = eVar.f22376D0.getResources().getDimension(i9);
            if (eVar.f22369A != dimension) {
                eVar.f22369A = dimension;
                eVar.invalidateSelf();
                eVar.x();
            }
        }
    }

    public void setChipStartPadding(float f9) {
        e eVar = this.f15946e;
        if (eVar != null && eVar.f22420v0 != f9) {
            eVar.f22420v0 = f9;
            eVar.invalidateSelf();
            eVar.x();
        }
    }

    public void setChipStartPaddingResource(int i9) {
        e eVar = this.f15946e;
        if (eVar != null) {
            float dimension = eVar.f22376D0.getResources().getDimension(i9);
            if (eVar.f22420v0 != dimension) {
                eVar.f22420v0 = dimension;
                eVar.invalidateSelf();
                eVar.x();
            }
        }
    }

    public void setChipStrokeColor(ColorStateList colorStateList) {
        e eVar = this.f15946e;
        if (eVar != null) {
            eVar.I(colorStateList);
        }
    }

    public void setChipStrokeColorResource(int i9) {
        e eVar = this.f15946e;
        if (eVar != null) {
            eVar.I(E.d.c(eVar.f22376D0, i9));
        }
    }

    public void setChipStrokeWidth(float f9) {
        e eVar = this.f15946e;
        if (eVar != null) {
            eVar.J(f9);
        }
    }

    public void setChipStrokeWidthResource(int i9) {
        e eVar = this.f15946e;
        if (eVar != null) {
            eVar.J(eVar.f22376D0.getResources().getDimension(i9));
        }
    }

    @Deprecated
    public void setChipText(CharSequence charSequence) {
        setText(charSequence);
    }

    @Deprecated
    public void setChipTextResource(int i9) {
        setText(getResources().getString(i9));
    }

    public void setCloseIcon(Drawable drawable) {
        e eVar = this.f15946e;
        if (eVar != null) {
            eVar.K(drawable);
        }
        e();
    }

    public void setCloseIconContentDescription(CharSequence charSequence) {
        b bVar;
        e eVar = this.f15946e;
        if (eVar != null && eVar.f22414o0 != charSequence) {
            String str = b.f4800b;
            if (TextUtils.getLayoutDirectionFromLocale(Locale.getDefault()) == 1) {
                bVar = b.f4803e;
            } else {
                bVar = b.f4802d;
            }
            bVar.getClass();
            i iVar = f.f4810a;
            eVar.f22414o0 = bVar.c(charSequence);
            eVar.invalidateSelf();
        }
    }

    @Deprecated
    public void setCloseIconEnabled(boolean z9) {
        setCloseIconVisible(z9);
    }

    @Deprecated
    public void setCloseIconEnabledResource(int i9) {
        setCloseIconVisible(i9);
    }

    public void setCloseIconEndPadding(float f9) {
        e eVar = this.f15946e;
        if (eVar != null) {
            eVar.L(f9);
        }
    }

    public void setCloseIconEndPaddingResource(int i9) {
        e eVar = this.f15946e;
        if (eVar != null) {
            eVar.L(eVar.f22376D0.getResources().getDimension(i9));
        }
    }

    public void setCloseIconResource(int i9) {
        e eVar = this.f15946e;
        if (eVar != null) {
            eVar.K(AbstractC0485a.q(eVar.f22376D0, i9));
        }
        e();
    }

    public void setCloseIconSize(float f9) {
        e eVar = this.f15946e;
        if (eVar != null) {
            eVar.M(f9);
        }
    }

    public void setCloseIconSizeResource(int i9) {
        e eVar = this.f15946e;
        if (eVar != null) {
            eVar.M(eVar.f22376D0.getResources().getDimension(i9));
        }
    }

    public void setCloseIconStartPadding(float f9) {
        e eVar = this.f15946e;
        if (eVar != null) {
            eVar.N(f9);
        }
    }

    public void setCloseIconStartPaddingResource(int i9) {
        e eVar = this.f15946e;
        if (eVar != null) {
            eVar.N(eVar.f22376D0.getResources().getDimension(i9));
        }
    }

    public void setCloseIconTint(ColorStateList colorStateList) {
        e eVar = this.f15946e;
        if (eVar != null) {
            eVar.O(colorStateList);
        }
    }

    public void setCloseIconTintResource(int i9) {
        e eVar = this.f15946e;
        if (eVar != null) {
            eVar.O(E.d.c(eVar.f22376D0, i9));
        }
    }

    public void setCloseIconVisible(int i9) {
        setCloseIconVisible(getResources().getBoolean(i9));
    }

    @Override // p.C1817r, android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable == null) {
            if (drawable3 == null) {
                super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
                return;
            }
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
        throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
    }

    @Override // p.C1817r, android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable == null) {
            if (drawable3 == null) {
                super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
                return;
            }
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
        throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelativeWithIntrinsicBounds(int i9, int i10, int i11, int i12) {
        if (i9 != 0) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (i11 == 0) {
            super.setCompoundDrawablesRelativeWithIntrinsicBounds(i9, i10, i11, i12);
            return;
        }
        throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesWithIntrinsicBounds(int i9, int i10, int i11, int i12) {
        if (i9 != 0) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (i11 == 0) {
            super.setCompoundDrawablesWithIntrinsicBounds(i9, i10, i11, i12);
            return;
        }
        throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
    }

    @Override // android.view.View
    public void setElevation(float f9) {
        super.setElevation(f9);
        e eVar = this.f15946e;
        if (eVar != null) {
            eVar.j(f9);
        }
    }

    @Override // android.widget.TextView
    public void setEllipsize(TextUtils.TruncateAt truncateAt) {
        if (this.f15946e != null) {
            if (truncateAt != TextUtils.TruncateAt.MARQUEE) {
                super.setEllipsize(truncateAt);
                e eVar = this.f15946e;
                if (eVar != null) {
                    eVar.f22401a1 = truncateAt;
                    return;
                }
                return;
            }
            throw new UnsupportedOperationException("Text within a chip are not allowed to scroll.");
        }
    }

    public void setEnsureMinTouchTargetSize(boolean z9) {
        this.f15955o = z9;
        c(this.f15957q);
    }

    @Override // android.widget.TextView
    public void setGravity(int i9) {
        if (i9 != 8388627) {
            Log.w("Chip", "Chip text must be vertically center and start aligned");
        } else {
            super.setGravity(i9);
        }
    }

    public void setHideMotionSpec(C1283c c1283c) {
        e eVar = this.f15946e;
        if (eVar != null) {
            eVar.f22419u0 = c1283c;
        }
    }

    public void setHideMotionSpecResource(int i9) {
        e eVar = this.f15946e;
        if (eVar != null) {
            eVar.f22419u0 = C1283c.a(eVar.f22376D0, i9);
        }
    }

    public void setIconEndPadding(float f9) {
        e eVar = this.f15946e;
        if (eVar != null) {
            eVar.Q(f9);
        }
    }

    public void setIconEndPaddingResource(int i9) {
        e eVar = this.f15946e;
        if (eVar != null) {
            eVar.Q(eVar.f22376D0.getResources().getDimension(i9));
        }
    }

    public void setIconStartPadding(float f9) {
        e eVar = this.f15946e;
        if (eVar != null) {
            eVar.R(f9);
        }
    }

    public void setIconStartPaddingResource(int i9) {
        e eVar = this.f15946e;
        if (eVar != null) {
            eVar.R(eVar.f22376D0.getResources().getDimension(i9));
        }
    }

    @Override // w5.h
    public void setInternalOnCheckedChangeListener(g gVar) {
        this.j = gVar;
    }

    @Override // android.view.View
    public void setLayoutDirection(int i9) {
        if (this.f15946e == null) {
            return;
        }
        super.setLayoutDirection(i9);
    }

    @Override // android.widget.TextView
    public void setLines(int i9) {
        if (i9 <= 1) {
            super.setLines(i9);
            return;
        }
        throw new UnsupportedOperationException("Chip does not support multi-line text");
    }

    @Override // android.widget.TextView
    public void setMaxLines(int i9) {
        if (i9 <= 1) {
            super.setMaxLines(i9);
            return;
        }
        throw new UnsupportedOperationException("Chip does not support multi-line text");
    }

    @Override // android.widget.TextView
    public void setMaxWidth(int i9) {
        super.setMaxWidth(i9);
        e eVar = this.f15946e;
        if (eVar != null) {
            eVar.f22403c1 = i9;
        }
    }

    @Override // android.widget.TextView
    public void setMinLines(int i9) {
        if (i9 <= 1) {
            super.setMinLines(i9);
            return;
        }
        throw new UnsupportedOperationException("Chip does not support multi-line text");
    }

    @Override // android.widget.CompoundButton
    public void setOnCheckedChangeListener(CompoundButton.OnCheckedChangeListener onCheckedChangeListener) {
        this.f15950i = onCheckedChangeListener;
    }

    public void setOnCloseIconClickListener(View.OnClickListener onClickListener) {
        this.f15949h = onClickListener;
        e();
    }

    public void setRippleColor(ColorStateList colorStateList) {
        e eVar = this.f15946e;
        if (eVar != null) {
            eVar.S(colorStateList);
        }
        this.f15946e.getClass();
        f();
    }

    public void setRippleColorResource(int i9) {
        e eVar = this.f15946e;
        if (eVar != null) {
            eVar.S(E.d.c(eVar.f22376D0, i9));
            this.f15946e.getClass();
            f();
        }
    }

    @Override // F5.x
    public void setShapeAppearanceModel(F5.m mVar) {
        this.f15946e.setShapeAppearanceModel(mVar);
    }

    public void setShowMotionSpec(C1283c c1283c) {
        e eVar = this.f15946e;
        if (eVar != null) {
            eVar.f22418t0 = c1283c;
        }
    }

    public void setShowMotionSpecResource(int i9) {
        e eVar = this.f15946e;
        if (eVar != null) {
            eVar.f22418t0 = C1283c.a(eVar.f22376D0, i9);
        }
    }

    @Override // android.widget.TextView
    public void setSingleLine(boolean z9) {
        if (z9) {
            super.setSingleLine(z9);
            return;
        }
        throw new UnsupportedOperationException("Chip does not support multi-line text");
    }

    @Override // android.widget.TextView
    public final void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        CharSequence charSequence2;
        e eVar = this.f15946e;
        if (eVar != null) {
            if (charSequence == null) {
                charSequence = "";
            }
            if (eVar.f22402b1) {
                charSequence2 = null;
            } else {
                charSequence2 = charSequence;
            }
            super.setText(charSequence2, bufferType);
            e eVar2 = this.f15946e;
            if (eVar2 != null && !TextUtils.equals(eVar2.Y, charSequence)) {
                eVar2.Y = charSequence;
                eVar2.f22382J0.f24309e = true;
                eVar2.invalidateSelf();
                eVar2.x();
            }
        }
    }

    public void setTextAppearance(C5.e eVar) {
        e eVar2 = this.f15946e;
        if (eVar2 != null) {
            eVar2.f22382J0.c(eVar, eVar2.f22376D0);
        }
        h();
    }

    public void setTextAppearanceResource(int i9) {
        setTextAppearance(getContext(), i9);
    }

    public void setTextEndPadding(float f9) {
        e eVar = this.f15946e;
        if (eVar != null && eVar.f22426z0 != f9) {
            eVar.f22426z0 = f9;
            eVar.invalidateSelf();
            eVar.x();
        }
    }

    public void setTextEndPaddingResource(int i9) {
        e eVar = this.f15946e;
        if (eVar != null) {
            float dimension = eVar.f22376D0.getResources().getDimension(i9);
            if (eVar.f22426z0 != dimension) {
                eVar.f22426z0 = dimension;
                eVar.invalidateSelf();
                eVar.x();
            }
        }
    }

    @Override // android.widget.TextView
    public final void setTextSize(int i9, float f9) {
        super.setTextSize(i9, f9);
        e eVar = this.f15946e;
        if (eVar != null) {
            float applyDimension = TypedValue.applyDimension(i9, f9, getResources().getDisplayMetrics());
            m mVar = eVar.f22382J0;
            C5.e eVar2 = mVar.f24311g;
            if (eVar2 != null) {
                eVar2.f1610k = applyDimension;
                mVar.f24305a.setTextSize(applyDimension);
                eVar.a();
            }
        }
        h();
    }

    public void setTextStartPadding(float f9) {
        e eVar = this.f15946e;
        if (eVar != null && eVar.f22424y0 != f9) {
            eVar.f22424y0 = f9;
            eVar.invalidateSelf();
            eVar.x();
        }
    }

    public void setTextStartPaddingResource(int i9) {
        e eVar = this.f15946e;
        if (eVar != null) {
            float dimension = eVar.f22376D0.getResources().getDimension(i9);
            if (eVar.f22424y0 != dimension) {
                eVar.f22424y0 = dimension;
                eVar.invalidateSelf();
                eVar.x();
            }
        }
    }

    public void setCloseIconVisible(boolean z9) {
        e eVar = this.f15946e;
        if (eVar != null) {
            eVar.P(z9);
        }
        e();
    }

    public void setCheckedIconVisible(boolean z9) {
        e eVar = this.f15946e;
        if (eVar != null) {
            eVar.C(z9);
        }
    }

    public void setChipIconVisible(boolean z9) {
        e eVar = this.f15946e;
        if (eVar != null) {
            eVar.H(z9);
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelativeWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (drawable3 == null) {
            super.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
            return;
        }
        throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set left drawable using R.attr#chipIcon.");
        }
        if (drawable3 == null) {
            super.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
            return;
        }
        throw new UnsupportedOperationException("Please set right drawable using R.attr#closeIcon.");
    }

    @Override // android.widget.TextView
    public final void setTextAppearance(Context context, int i9) {
        super.setTextAppearance(context, i9);
        e eVar = this.f15946e;
        if (eVar != null) {
            Context context2 = eVar.f22376D0;
            eVar.f22382J0.c(new C5.e(context2, i9), context2);
        }
        h();
    }

    @Override // android.widget.TextView
    public void setTextAppearance(int i9) {
        super.setTextAppearance(i9);
        e eVar = this.f15946e;
        if (eVar != null) {
            Context context = eVar.f22376D0;
            eVar.f22382J0.c(new C5.e(context, i9), context);
        }
        h();
    }
}
