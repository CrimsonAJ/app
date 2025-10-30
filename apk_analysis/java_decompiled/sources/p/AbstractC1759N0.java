package p;

import a.AbstractC0485a;
import android.R;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.InputFilter;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.method.TransformationMethod;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.CompoundButton;
import b5.G1;
import com.google.android.gms.internal.measurement.D1;
import d0.C1091i;
import f0.C1156h;
import h.AbstractC1260a;
import java.util.WeakHashMap;
import m.C1577a;

/* renamed from: p.N0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1759N0 extends CompoundButton {

    /* renamed from: s0, reason: collision with root package name */
    public static final A5.h f21852s0 = new A5.h(Float.class, "thumbPos", 12);

    /* renamed from: t0, reason: collision with root package name */
    public static final int[] f21853t0 = {R.attr.state_checked};

    /* renamed from: A, reason: collision with root package name */
    public int f21854A;

    /* renamed from: B, reason: collision with root package name */
    public int f21855B;

    /* renamed from: C, reason: collision with root package name */
    public int f21856C;

    /* renamed from: D, reason: collision with root package name */
    public int f21857D;

    /* renamed from: a, reason: collision with root package name */
    public Drawable f21858a;

    /* renamed from: b, reason: collision with root package name */
    public ColorStateList f21859b;

    /* renamed from: c, reason: collision with root package name */
    public PorterDuff.Mode f21860c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f21861d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f21862e;

    /* renamed from: f, reason: collision with root package name */
    public Drawable f21863f;

    /* renamed from: f0, reason: collision with root package name */
    public int f21864f0;

    /* renamed from: g, reason: collision with root package name */
    public ColorStateList f21865g;

    /* renamed from: g0, reason: collision with root package name */
    public int f21866g0;

    /* renamed from: h, reason: collision with root package name */
    public PorterDuff.Mode f21867h;

    /* renamed from: h0, reason: collision with root package name */
    public int f21868h0;

    /* renamed from: i, reason: collision with root package name */
    public boolean f21869i;

    /* renamed from: i0, reason: collision with root package name */
    public boolean f21870i0;
    public boolean j;

    /* renamed from: j0, reason: collision with root package name */
    public final TextPaint f21871j0;

    /* renamed from: k, reason: collision with root package name */
    public int f21872k;

    /* renamed from: k0, reason: collision with root package name */
    public final ColorStateList f21873k0;

    /* renamed from: l, reason: collision with root package name */
    public int f21874l;

    /* renamed from: l0, reason: collision with root package name */
    public StaticLayout f21875l0;

    /* renamed from: m, reason: collision with root package name */
    public int f21876m;

    /* renamed from: m0, reason: collision with root package name */
    public StaticLayout f21877m0;

    /* renamed from: n, reason: collision with root package name */
    public boolean f21878n;

    /* renamed from: n0, reason: collision with root package name */
    public final C1577a f21879n0;

    /* renamed from: o, reason: collision with root package name */
    public CharSequence f21880o;

    /* renamed from: o0, reason: collision with root package name */
    public ObjectAnimator f21881o0;

    /* renamed from: p, reason: collision with root package name */
    public CharSequence f21882p;

    /* renamed from: p0, reason: collision with root package name */
    public C1825v f21883p0;

    /* renamed from: q, reason: collision with root package name */
    public CharSequence f21884q;

    /* renamed from: q0, reason: collision with root package name */
    public C1156h f21885q0;

    /* renamed from: r, reason: collision with root package name */
    public CharSequence f21886r;
    public final Rect r0;

    /* renamed from: s, reason: collision with root package name */
    public boolean f21887s;

    /* renamed from: t, reason: collision with root package name */
    public int f21888t;

    /* renamed from: u, reason: collision with root package name */
    public final int f21889u;

    /* renamed from: v, reason: collision with root package name */
    public float f21890v;

    /* renamed from: w, reason: collision with root package name */
    public float f21891w;

    /* renamed from: x, reason: collision with root package name */
    public final VelocityTracker f21892x;

    /* renamed from: y, reason: collision with root package name */
    public final int f21893y;

    /* renamed from: z, reason: collision with root package name */
    public float f21894z;

    /* JADX WARN: Type inference failed for: r14v11, types: [m.a, java.lang.Object] */
    public AbstractC1759N0(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, co.notix.R.attr.switchStyle);
        Typeface typeface;
        Typeface create;
        int i9;
        int resourceId;
        this.f21859b = null;
        this.f21860c = null;
        this.f21861d = false;
        this.f21862e = false;
        this.f21865g = null;
        this.f21867h = null;
        this.f21869i = false;
        this.j = false;
        this.f21892x = VelocityTracker.obtain();
        this.f21870i0 = true;
        this.r0 = new Rect();
        AbstractC1761O0.a(this, getContext());
        TextPaint textPaint = new TextPaint(1);
        this.f21871j0 = textPaint;
        textPaint.density = getResources().getDisplayMetrics().density;
        int[] iArr = AbstractC1260a.f17825v;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, co.notix.R.attr.switchStyle, 0);
        G1 g12 = new G1(context, obtainStyledAttributes);
        P.Q.l(this, context, iArr, attributeSet, obtainStyledAttributes, co.notix.R.attr.switchStyle);
        Drawable o9 = g12.o(2);
        this.f21858a = o9;
        if (o9 != null) {
            o9.setCallback(this);
        }
        Drawable o10 = g12.o(11);
        this.f21863f = o10;
        if (o10 != null) {
            o10.setCallback(this);
        }
        setTextOnInternal(obtainStyledAttributes.getText(0));
        setTextOffInternal(obtainStyledAttributes.getText(1));
        this.f21887s = obtainStyledAttributes.getBoolean(3, true);
        this.f21872k = obtainStyledAttributes.getDimensionPixelSize(8, 0);
        this.f21874l = obtainStyledAttributes.getDimensionPixelSize(5, 0);
        this.f21876m = obtainStyledAttributes.getDimensionPixelSize(6, 0);
        this.f21878n = obtainStyledAttributes.getBoolean(4, false);
        ColorStateList n7 = g12.n(9);
        if (n7 != null) {
            this.f21859b = n7;
            this.f21861d = true;
        }
        PorterDuff.Mode c3 = AbstractC1800i0.c(obtainStyledAttributes.getInt(10, -1), null);
        if (this.f21860c != c3) {
            this.f21860c = c3;
            this.f21862e = true;
        }
        if (this.f21861d || this.f21862e) {
            a();
        }
        ColorStateList n9 = g12.n(12);
        if (n9 != null) {
            this.f21865g = n9;
            this.f21869i = true;
        }
        PorterDuff.Mode c9 = AbstractC1800i0.c(obtainStyledAttributes.getInt(13, -1), null);
        if (this.f21867h != c9) {
            this.f21867h = c9;
            this.j = true;
        }
        if (this.f21869i || this.j) {
            b();
        }
        int resourceId2 = obtainStyledAttributes.getResourceId(7, 0);
        if (resourceId2 != 0) {
            TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(resourceId2, AbstractC1260a.f17826w);
            ColorStateList colorStateList = (!obtainStyledAttributes2.hasValue(3) || (resourceId = obtainStyledAttributes2.getResourceId(3, 0)) == 0 || (colorStateList = E.d.c(context, resourceId)) == null) ? obtainStyledAttributes2.getColorStateList(3) : colorStateList;
            if (colorStateList != null) {
                this.f21873k0 = colorStateList;
            } else {
                this.f21873k0 = getTextColors();
            }
            int dimensionPixelSize = obtainStyledAttributes2.getDimensionPixelSize(0, 0);
            if (dimensionPixelSize != 0) {
                float f9 = dimensionPixelSize;
                if (f9 != textPaint.getTextSize()) {
                    textPaint.setTextSize(f9);
                    requestLayout();
                }
            }
            int i10 = obtainStyledAttributes2.getInt(1, -1);
            int i11 = obtainStyledAttributes2.getInt(2, -1);
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 != 3) {
                        typeface = null;
                    } else {
                        typeface = Typeface.MONOSPACE;
                    }
                } else {
                    typeface = Typeface.SERIF;
                }
            } else {
                typeface = Typeface.SANS_SERIF;
            }
            if (i11 > 0) {
                if (typeface == null) {
                    create = Typeface.defaultFromStyle(i11);
                } else {
                    create = Typeface.create(typeface, i11);
                }
                setSwitchTypeface(create);
                if (create != null) {
                    i9 = create.getStyle();
                } else {
                    i9 = 0;
                }
                int i12 = (~i9) & i11;
                textPaint.setFakeBoldText((i12 & 1) != 0);
                textPaint.setTextSkewX((2 & i12) != 0 ? -0.25f : 0.0f);
            } else {
                textPaint.setFakeBoldText(false);
                textPaint.setTextSkewX(0.0f);
                setSwitchTypeface(typeface);
            }
            if (obtainStyledAttributes2.getBoolean(14, false)) {
                Context context2 = getContext();
                ?? obj = new Object();
                obj.f20659a = context2.getResources().getConfiguration().locale;
                this.f21879n0 = obj;
            } else {
                this.f21879n0 = null;
            }
            setTextOnInternal(this.f21880o);
            setTextOffInternal(this.f21884q);
            obtainStyledAttributes2.recycle();
        }
        new C1769T(this).f(attributeSet, co.notix.R.attr.switchStyle);
        g12.y();
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.f21889u = viewConfiguration.getScaledTouchSlop();
        this.f21893y = viewConfiguration.getScaledMinimumFlingVelocity();
        getEmojiTextViewHelper().b(attributeSet, co.notix.R.attr.switchStyle);
        refreshDrawableState();
        setChecked(isChecked());
    }

    private C1825v getEmojiTextViewHelper() {
        if (this.f21883p0 == null) {
            this.f21883p0 = new C1825v(this);
        }
        return this.f21883p0;
    }

    private boolean getTargetCheckedState() {
        if (this.f21894z > 0.5f) {
            return true;
        }
        return false;
    }

    private int getThumbOffset() {
        float f9;
        boolean z9 = g1.f21992a;
        if (getLayoutDirection() == 1) {
            f9 = 1.0f - this.f21894z;
        } else {
            f9 = this.f21894z;
        }
        return (int) ((f9 * getThumbScrollRange()) + 0.5f);
    }

    private int getThumbScrollRange() {
        Rect rect;
        Drawable drawable = this.f21863f;
        if (drawable != null) {
            Rect rect2 = this.r0;
            drawable.getPadding(rect2);
            Drawable drawable2 = this.f21858a;
            if (drawable2 != null) {
                rect = AbstractC1800i0.b(drawable2);
            } else {
                rect = AbstractC1800i0.f22000c;
            }
            return ((((this.f21854A - this.f21856C) - rect2.left) - rect2.right) - rect.left) - rect.right;
        }
        return 0;
    }

    private void setTextOffInternal(CharSequence charSequence) {
        this.f21884q = charSequence;
        C1825v emojiTextViewHelper = getEmojiTextViewHelper();
        TransformationMethod M7 = ((D1) emojiTextViewHelper.f22083b.f11404b).M(this.f21879n0);
        if (M7 != null) {
            charSequence = M7.getTransformation(charSequence, this);
        }
        this.f21886r = charSequence;
        this.f21877m0 = null;
        if (this.f21887s) {
            d();
        }
    }

    private void setTextOnInternal(CharSequence charSequence) {
        this.f21880o = charSequence;
        C1825v emojiTextViewHelper = getEmojiTextViewHelper();
        TransformationMethod M7 = ((D1) emojiTextViewHelper.f22083b.f11404b).M(this.f21879n0);
        if (M7 != null) {
            charSequence = M7.getTransformation(charSequence, this);
        }
        this.f21882p = charSequence;
        this.f21875l0 = null;
        if (this.f21887s) {
            d();
        }
    }

    public final void a() {
        Drawable drawable = this.f21858a;
        if (drawable != null) {
            if (this.f21861d || this.f21862e) {
                Drawable mutate = drawable.mutate();
                this.f21858a = mutate;
                if (this.f21861d) {
                    mutate.setTintList(this.f21859b);
                }
                if (this.f21862e) {
                    this.f21858a.setTintMode(this.f21860c);
                }
                if (this.f21858a.isStateful()) {
                    this.f21858a.setState(getDrawableState());
                }
            }
        }
    }

    public final void b() {
        Drawable drawable = this.f21863f;
        if (drawable != null) {
            if (this.f21869i || this.j) {
                Drawable mutate = drawable.mutate();
                this.f21863f = mutate;
                if (this.f21869i) {
                    mutate.setTintList(this.f21865g);
                }
                if (this.j) {
                    this.f21863f.setTintMode(this.f21867h);
                }
                if (this.f21863f.isStateful()) {
                    this.f21863f.setState(getDrawableState());
                }
            }
        }
    }

    public final void c() {
        setTextOnInternal(this.f21880o);
        setTextOffInternal(this.f21884q);
        requestLayout();
    }

    public final void d() {
        if (this.f21885q0 == null && ((D1) this.f21883p0.f22083b.f11404b).B() && C1091i.f16642k != null) {
            C1091i a5 = C1091i.a();
            int b9 = a5.b();
            if (b9 == 3 || b9 == 0) {
                C1156h c1156h = new C1156h(this);
                this.f21885q0 = c1156h;
                a5.f(c1156h);
            }
        }
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        Rect rect;
        int i9;
        int i10;
        int i11 = this.f21857D;
        int i12 = this.f21864f0;
        int i13 = this.f21866g0;
        int i14 = this.f21868h0;
        int thumbOffset = getThumbOffset() + i11;
        Drawable drawable = this.f21858a;
        if (drawable != null) {
            rect = AbstractC1800i0.b(drawable);
        } else {
            rect = AbstractC1800i0.f22000c;
        }
        Drawable drawable2 = this.f21863f;
        Rect rect2 = this.r0;
        if (drawable2 != null) {
            drawable2.getPadding(rect2);
            int i15 = rect2.left;
            thumbOffset += i15;
            if (rect != null) {
                int i16 = rect.left;
                if (i16 > i15) {
                    i11 += i16 - i15;
                }
                int i17 = rect.top;
                int i18 = rect2.top;
                if (i17 > i18) {
                    i9 = (i17 - i18) + i12;
                } else {
                    i9 = i12;
                }
                int i19 = rect.right;
                int i20 = rect2.right;
                if (i19 > i20) {
                    i13 -= i19 - i20;
                }
                int i21 = rect.bottom;
                int i22 = rect2.bottom;
                if (i21 > i22) {
                    i10 = i14 - (i21 - i22);
                    this.f21863f.setBounds(i11, i9, i13, i10);
                }
            } else {
                i9 = i12;
            }
            i10 = i14;
            this.f21863f.setBounds(i11, i9, i13, i10);
        }
        Drawable drawable3 = this.f21858a;
        if (drawable3 != null) {
            drawable3.getPadding(rect2);
            int i23 = thumbOffset - rect2.left;
            int i24 = thumbOffset + this.f21856C + rect2.right;
            this.f21858a.setBounds(i23, i12, i24, i14);
            Drawable background = getBackground();
            if (background != null) {
                background.setHotspotBounds(i23, i12, i24, i14);
            }
        }
        super.draw(canvas);
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void drawableHotspotChanged(float f9, float f10) {
        super.drawableHotspotChanged(f9, f10);
        Drawable drawable = this.f21858a;
        if (drawable != null) {
            drawable.setHotspot(f9, f10);
        }
        Drawable drawable2 = this.f21863f;
        if (drawable2 != null) {
            drawable2.setHotspot(f9, f10);
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        boolean z9;
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.f21858a;
        if (drawable != null && drawable.isStateful()) {
            z9 = drawable.setState(drawableState);
        } else {
            z9 = false;
        }
        Drawable drawable2 = this.f21863f;
        if (drawable2 != null && drawable2.isStateful()) {
            z9 |= drawable2.setState(drawableState);
        }
        if (z9) {
            invalidate();
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView
    public int getCompoundPaddingLeft() {
        boolean z9 = g1.f21992a;
        if (getLayoutDirection() == 1) {
            int compoundPaddingLeft = super.getCompoundPaddingLeft() + this.f21854A;
            if (!TextUtils.isEmpty(getText())) {
                return compoundPaddingLeft + this.f21876m;
            }
            return compoundPaddingLeft;
        }
        return super.getCompoundPaddingLeft();
    }

    @Override // android.widget.CompoundButton, android.widget.TextView
    public int getCompoundPaddingRight() {
        boolean z9 = g1.f21992a;
        if (getLayoutDirection() == 1) {
            return super.getCompoundPaddingRight();
        }
        int compoundPaddingRight = super.getCompoundPaddingRight() + this.f21854A;
        if (!TextUtils.isEmpty(getText())) {
            return compoundPaddingRight + this.f21876m;
        }
        return compoundPaddingRight;
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return O4.h.M(super.getCustomSelectionActionModeCallback());
    }

    public boolean getShowText() {
        return this.f21887s;
    }

    public boolean getSplitTrack() {
        return this.f21878n;
    }

    public int getSwitchMinWidth() {
        return this.f21874l;
    }

    public int getSwitchPadding() {
        return this.f21876m;
    }

    public CharSequence getTextOff() {
        return this.f21884q;
    }

    public CharSequence getTextOn() {
        return this.f21880o;
    }

    public Drawable getThumbDrawable() {
        return this.f21858a;
    }

    public final float getThumbPosition() {
        return this.f21894z;
    }

    public int getThumbTextPadding() {
        return this.f21872k;
    }

    public ColorStateList getThumbTintList() {
        return this.f21859b;
    }

    public PorterDuff.Mode getThumbTintMode() {
        return this.f21860c;
    }

    public Drawable getTrackDrawable() {
        return this.f21863f;
    }

    public ColorStateList getTrackTintList() {
        return this.f21865g;
    }

    public PorterDuff.Mode getTrackTintMode() {
        return this.f21867h;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f21858a;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
        Drawable drawable2 = this.f21863f;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
        }
        ObjectAnimator objectAnimator = this.f21881o0;
        if (objectAnimator != null && objectAnimator.isStarted()) {
            this.f21881o0.end();
            this.f21881o0 = null;
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final int[] onCreateDrawableState(int i9) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i9 + 1);
        if (isChecked()) {
            View.mergeDrawableStates(onCreateDrawableState, f21853t0);
        }
        return onCreateDrawableState;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void onDraw(Canvas canvas) {
        StaticLayout staticLayout;
        int width;
        super.onDraw(canvas);
        Drawable drawable = this.f21863f;
        Rect rect = this.r0;
        if (drawable != null) {
            drawable.getPadding(rect);
        } else {
            rect.setEmpty();
        }
        int i9 = this.f21864f0;
        int i10 = this.f21868h0;
        int i11 = i9 + rect.top;
        int i12 = i10 - rect.bottom;
        Drawable drawable2 = this.f21858a;
        if (drawable != null) {
            if (this.f21878n && drawable2 != null) {
                Rect b9 = AbstractC1800i0.b(drawable2);
                drawable2.copyBounds(rect);
                rect.left += b9.left;
                rect.right -= b9.right;
                int save = canvas.save();
                canvas.clipRect(rect, Region.Op.DIFFERENCE);
                drawable.draw(canvas);
                canvas.restoreToCount(save);
            } else {
                drawable.draw(canvas);
            }
        }
        int save2 = canvas.save();
        if (drawable2 != null) {
            drawable2.draw(canvas);
        }
        if (getTargetCheckedState()) {
            staticLayout = this.f21875l0;
        } else {
            staticLayout = this.f21877m0;
        }
        if (staticLayout != null) {
            int[] drawableState = getDrawableState();
            ColorStateList colorStateList = this.f21873k0;
            TextPaint textPaint = this.f21871j0;
            if (colorStateList != null) {
                textPaint.setColor(colorStateList.getColorForState(drawableState, 0));
            }
            textPaint.drawableState = drawableState;
            if (drawable2 != null) {
                Rect bounds = drawable2.getBounds();
                width = bounds.left + bounds.right;
            } else {
                width = getWidth();
            }
            canvas.translate((width / 2) - (staticLayout.getWidth() / 2), ((i11 + i12) / 2) - (staticLayout.getHeight() / 2));
            staticLayout.draw(canvas);
        }
        canvas.restoreToCount(save2);
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName("android.widget.Switch");
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        CharSequence charSequence;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("android.widget.Switch");
        if (Build.VERSION.SDK_INT < 30) {
            if (isChecked()) {
                charSequence = this.f21880o;
            } else {
                charSequence = this.f21884q;
            }
            if (!TextUtils.isEmpty(charSequence)) {
                CharSequence text = accessibilityNodeInfo.getText();
                if (TextUtils.isEmpty(text)) {
                    accessibilityNodeInfo.setText(charSequence);
                    return;
                }
                StringBuilder sb = new StringBuilder();
                sb.append(text);
                sb.append(' ');
                sb.append(charSequence);
                accessibilityNodeInfo.setText(sb);
            }
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final void onLayout(boolean z9, int i9, int i10, int i11, int i12) {
        int i13;
        int width;
        int i14;
        int i15;
        int i16;
        super.onLayout(z9, i9, i10, i11, i12);
        int i17 = 0;
        if (this.f21858a != null) {
            Drawable drawable = this.f21863f;
            Rect rect = this.r0;
            if (drawable != null) {
                drawable.getPadding(rect);
            } else {
                rect.setEmpty();
            }
            Rect b9 = AbstractC1800i0.b(this.f21858a);
            i13 = Math.max(0, b9.left - rect.left);
            i17 = Math.max(0, b9.right - rect.right);
        } else {
            i13 = 0;
        }
        boolean z10 = g1.f21992a;
        if (getLayoutDirection() == 1) {
            i14 = getPaddingLeft() + i13;
            width = ((this.f21854A + i14) - i13) - i17;
        } else {
            width = (getWidth() - getPaddingRight()) - i17;
            i14 = (width - this.f21854A) + i13 + i17;
        }
        int gravity = getGravity() & 112;
        if (gravity != 16) {
            if (gravity != 80) {
                i16 = getPaddingTop();
                i15 = this.f21855B + i16;
            } else {
                i15 = getHeight() - getPaddingBottom();
                i16 = i15 - this.f21855B;
            }
        } else {
            int height = ((getHeight() + getPaddingTop()) - getPaddingBottom()) / 2;
            int i18 = this.f21855B;
            int i19 = height - (i18 / 2);
            i15 = i18 + i19;
            i16 = i19;
        }
        this.f21857D = i14;
        this.f21864f0 = i16;
        this.f21868h0 = i15;
        this.f21866g0 = width;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onMeasure(int i9, int i10) {
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17 = 0;
        if (this.f21887s) {
            StaticLayout staticLayout = this.f21875l0;
            TextPaint textPaint = this.f21871j0;
            if (staticLayout == null) {
                CharSequence charSequence = this.f21882p;
                if (charSequence != null) {
                    i16 = (int) Math.ceil(Layout.getDesiredWidth(charSequence, textPaint));
                } else {
                    i16 = 0;
                }
                this.f21875l0 = new StaticLayout(charSequence, textPaint, i16, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, true);
            }
            if (this.f21877m0 == null) {
                CharSequence charSequence2 = this.f21886r;
                if (charSequence2 != null) {
                    i15 = (int) Math.ceil(Layout.getDesiredWidth(charSequence2, textPaint));
                } else {
                    i15 = 0;
                }
                this.f21877m0 = new StaticLayout(charSequence2, textPaint, i15, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, true);
            }
        }
        Drawable drawable = this.f21858a;
        Rect rect = this.r0;
        if (drawable != null) {
            drawable.getPadding(rect);
            i11 = (this.f21858a.getIntrinsicWidth() - rect.left) - rect.right;
            i12 = this.f21858a.getIntrinsicHeight();
        } else {
            i11 = 0;
            i12 = 0;
        }
        if (this.f21887s) {
            i13 = (this.f21872k * 2) + Math.max(this.f21875l0.getWidth(), this.f21877m0.getWidth());
        } else {
            i13 = 0;
        }
        this.f21856C = Math.max(i13, i11);
        Drawable drawable2 = this.f21863f;
        if (drawable2 != null) {
            drawable2.getPadding(rect);
            i17 = this.f21863f.getIntrinsicHeight();
        } else {
            rect.setEmpty();
        }
        int i18 = rect.left;
        int i19 = rect.right;
        Drawable drawable3 = this.f21858a;
        if (drawable3 != null) {
            Rect b9 = AbstractC1800i0.b(drawable3);
            i18 = Math.max(i18, b9.left);
            i19 = Math.max(i19, b9.right);
        }
        if (this.f21870i0) {
            i14 = Math.max(this.f21874l, (this.f21856C * 2) + i18 + i19);
        } else {
            i14 = this.f21874l;
        }
        int max = Math.max(i17, i12);
        this.f21854A = i14;
        this.f21855B = max;
        super.onMeasure(i9, i10);
        if (getMeasuredHeight() < max) {
            setMeasuredDimension(getMeasuredWidthAndState(), max);
        }
    }

    @Override // android.view.View
    public final void onPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        CharSequence charSequence;
        super.onPopulateAccessibilityEvent(accessibilityEvent);
        if (isChecked()) {
            charSequence = this.f21880o;
        } else {
            charSequence = this.f21884q;
        }
        if (charSequence != null) {
            accessibilityEvent.getText().add(charSequence);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0015, code lost:
    
        if (r1 != 3) goto L82;
     */
    @Override // android.widget.TextView, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onTouchEvent(android.view.MotionEvent r10) {
        /*
            Method dump skipped, instructions count: 329
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p.AbstractC1759N0.onTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z9) {
        super.setAllCaps(z9);
        getEmojiTextViewHelper().c(z9);
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public void setChecked(boolean z9) {
        super.setChecked(z9);
        boolean isChecked = isChecked();
        if (isChecked) {
            if (Build.VERSION.SDK_INT >= 30) {
                Object obj = this.f21880o;
                if (obj == null) {
                    obj = getResources().getString(co.notix.R.string.abc_capital_on);
                }
                Object obj2 = obj;
                WeakHashMap weakHashMap = P.Q.f5546a;
                new P.D(co.notix.R.id.tag_state_description, CharSequence.class, 64, 30, 2).f(this, obj2);
            }
        } else if (Build.VERSION.SDK_INT >= 30) {
            Object obj3 = this.f21884q;
            if (obj3 == null) {
                obj3 = getResources().getString(co.notix.R.string.abc_capital_off);
            }
            Object obj4 = obj3;
            WeakHashMap weakHashMap2 = P.Q.f5546a;
            new P.D(co.notix.R.id.tag_state_description, CharSequence.class, 64, 30, 2).f(this, obj4);
        }
        float f9 = 0.0f;
        if (getWindowToken() != null && isLaidOut()) {
            if (isChecked) {
                f9 = 1.0f;
            }
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, f21852s0, f9);
            this.f21881o0 = ofFloat;
            ofFloat.setDuration(250L);
            this.f21881o0.setAutoCancel(true);
            this.f21881o0.start();
            return;
        }
        ObjectAnimator objectAnimator = this.f21881o0;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
        if (isChecked) {
            f9 = 1.0f;
        }
        setThumbPosition(f9);
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(O4.h.N(callback, this));
    }

    public void setEmojiCompatEnabled(boolean z9) {
        getEmojiTextViewHelper().d(z9);
        setTextOnInternal(this.f21880o);
        setTextOffInternal(this.f21884q);
        requestLayout();
    }

    public final void setEnforceSwitchWidth(boolean z9) {
        this.f21870i0 = z9;
        invalidate();
    }

    @Override // android.widget.TextView
    public void setFilters(InputFilter[] inputFilterArr) {
        super.setFilters(getEmojiTextViewHelper().a(inputFilterArr));
    }

    public void setShowText(boolean z9) {
        if (this.f21887s != z9) {
            this.f21887s = z9;
            requestLayout();
            if (z9) {
                d();
            }
        }
    }

    public void setSplitTrack(boolean z9) {
        this.f21878n = z9;
        invalidate();
    }

    public void setSwitchMinWidth(int i9) {
        this.f21874l = i9;
        requestLayout();
    }

    public void setSwitchPadding(int i9) {
        this.f21876m = i9;
        requestLayout();
    }

    public void setSwitchTypeface(Typeface typeface) {
        TextPaint textPaint = this.f21871j0;
        if ((textPaint.getTypeface() != null && !textPaint.getTypeface().equals(typeface)) || (textPaint.getTypeface() == null && typeface != null)) {
            textPaint.setTypeface(typeface);
            requestLayout();
            invalidate();
        }
    }

    public void setTextOff(CharSequence charSequence) {
        setTextOffInternal(charSequence);
        requestLayout();
        if (!isChecked() && Build.VERSION.SDK_INT >= 30) {
            Object obj = this.f21884q;
            if (obj == null) {
                obj = getResources().getString(co.notix.R.string.abc_capital_off);
            }
            WeakHashMap weakHashMap = P.Q.f5546a;
            new P.D(co.notix.R.id.tag_state_description, CharSequence.class, 64, 30, 2).f(this, obj);
        }
    }

    public void setTextOn(CharSequence charSequence) {
        setTextOnInternal(charSequence);
        requestLayout();
        if (isChecked() && Build.VERSION.SDK_INT >= 30) {
            Object obj = this.f21880o;
            if (obj == null) {
                obj = getResources().getString(co.notix.R.string.abc_capital_on);
            }
            WeakHashMap weakHashMap = P.Q.f5546a;
            new P.D(co.notix.R.id.tag_state_description, CharSequence.class, 64, 30, 2).f(this, obj);
        }
    }

    public void setThumbDrawable(Drawable drawable) {
        Drawable drawable2 = this.f21858a;
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.f21858a = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
        }
        requestLayout();
    }

    public void setThumbPosition(float f9) {
        this.f21894z = f9;
        invalidate();
    }

    public void setThumbResource(int i9) {
        setThumbDrawable(AbstractC0485a.q(getContext(), i9));
    }

    public void setThumbTextPadding(int i9) {
        this.f21872k = i9;
        requestLayout();
    }

    public void setThumbTintList(ColorStateList colorStateList) {
        this.f21859b = colorStateList;
        this.f21861d = true;
        a();
    }

    public void setThumbTintMode(PorterDuff.Mode mode) {
        this.f21860c = mode;
        this.f21862e = true;
        a();
    }

    public void setTrackDrawable(Drawable drawable) {
        Drawable drawable2 = this.f21863f;
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.f21863f = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
        }
        requestLayout();
    }

    public void setTrackResource(int i9) {
        setTrackDrawable(AbstractC0485a.q(getContext(), i9));
    }

    public void setTrackTintList(ColorStateList colorStateList) {
        this.f21865g = colorStateList;
        this.f21869i = true;
        b();
    }

    public void setTrackTintMode(PorterDuff.Mode mode) {
        this.f21867h = mode;
        this.j = true;
        b();
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public final void toggle() {
        setChecked(!isChecked());
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        if (!super.verifyDrawable(drawable) && drawable != this.f21858a && drawable != this.f21863f) {
            return false;
        }
        return true;
    }
}
