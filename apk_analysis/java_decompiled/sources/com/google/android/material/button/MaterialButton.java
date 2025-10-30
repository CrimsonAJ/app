package com.google.android.material.button;

import E.d;
import F5.l;
import F5.m;
import F5.x;
import M5.a;
import P.Q;
import U.b;
import a.AbstractC0485a;
import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Parcelable;
import android.text.Layout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import android.widget.Checkable;
import android.widget.CompoundButton;
import com.google.android.gms.internal.measurement.AbstractC1002u1;
import com.google.android.gms.internal.measurement.D1;
import com.google.firebase.messaging.u;
import g5.AbstractC1254a;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.WeakHashMap;
import n5.C1654b;
import n5.InterfaceC1653a;
import n5.c;
import p.C1815q;
import w5.p;

/* loaded from: classes.dex */
public class MaterialButton extends C1815q implements Checkable, x {

    /* renamed from: r, reason: collision with root package name */
    public static final int[] f15892r = {R.attr.state_checkable};

    /* renamed from: s, reason: collision with root package name */
    public static final int[] f15893s = {R.attr.state_checked};

    /* renamed from: d, reason: collision with root package name */
    public final c f15894d;

    /* renamed from: e, reason: collision with root package name */
    public final LinkedHashSet f15895e;

    /* renamed from: f, reason: collision with root package name */
    public InterfaceC1653a f15896f;

    /* renamed from: g, reason: collision with root package name */
    public PorterDuff.Mode f15897g;

    /* renamed from: h, reason: collision with root package name */
    public ColorStateList f15898h;

    /* renamed from: i, reason: collision with root package name */
    public Drawable f15899i;
    public String j;

    /* renamed from: k, reason: collision with root package name */
    public int f15900k;

    /* renamed from: l, reason: collision with root package name */
    public int f15901l;

    /* renamed from: m, reason: collision with root package name */
    public int f15902m;

    /* renamed from: n, reason: collision with root package name */
    public int f15903n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f15904o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f15905p;

    /* renamed from: q, reason: collision with root package name */
    public int f15906q;

    public MaterialButton(Context context, AttributeSet attributeSet) {
        super(a.a(context, attributeSet, co.notix.R.attr.materialButtonStyle, co.notix.R.style.Widget_MaterialComponents_Button), attributeSet, co.notix.R.attr.materialButtonStyle);
        this.f15895e = new LinkedHashSet();
        this.f15904o = false;
        this.f15905p = false;
        Context context2 = getContext();
        TypedArray i9 = p.i(context2, attributeSet, AbstractC1254a.f17755u, co.notix.R.attr.materialButtonStyle, co.notix.R.style.Widget_MaterialComponents_Button, new int[0]);
        this.f15903n = i9.getDimensionPixelSize(12, 0);
        int i10 = i9.getInt(15, -1);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        this.f15897g = p.k(i10, mode);
        this.f15898h = D1.p(getContext(), i9, 14);
        this.f15899i = D1.t(getContext(), i9, 10);
        this.f15906q = i9.getInteger(11, 1);
        this.f15900k = i9.getDimensionPixelSize(13, 0);
        c cVar = new c(this, m.b(context2, attributeSet, co.notix.R.attr.materialButtonStyle, co.notix.R.style.Widget_MaterialComponents_Button).a());
        this.f15894d = cVar;
        cVar.f21220c = i9.getDimensionPixelOffset(1, 0);
        cVar.f21221d = i9.getDimensionPixelOffset(2, 0);
        cVar.f21222e = i9.getDimensionPixelOffset(3, 0);
        cVar.f21223f = i9.getDimensionPixelOffset(4, 0);
        if (i9.hasValue(8)) {
            int dimensionPixelSize = i9.getDimensionPixelSize(8, -1);
            cVar.f21224g = dimensionPixelSize;
            float f9 = dimensionPixelSize;
            l e8 = cVar.f21219b.e();
            e8.f2512e = new F5.a(f9);
            e8.f2513f = new F5.a(f9);
            e8.f2514g = new F5.a(f9);
            e8.f2515h = new F5.a(f9);
            cVar.c(e8.a());
            cVar.f21232p = true;
        }
        cVar.f21225h = i9.getDimensionPixelSize(20, 0);
        cVar.f21226i = p.k(i9.getInt(7, -1), mode);
        cVar.j = D1.p(getContext(), i9, 6);
        cVar.f21227k = D1.p(getContext(), i9, 19);
        cVar.f21228l = D1.p(getContext(), i9, 16);
        cVar.f21233q = i9.getBoolean(5, false);
        cVar.f21236t = i9.getDimensionPixelSize(9, 0);
        cVar.f21234r = i9.getBoolean(21, true);
        WeakHashMap weakHashMap = Q.f5546a;
        int paddingStart = getPaddingStart();
        int paddingTop = getPaddingTop();
        int paddingEnd = getPaddingEnd();
        int paddingBottom = getPaddingBottom();
        if (i9.hasValue(0)) {
            cVar.f21231o = true;
            setSupportBackgroundTintList(cVar.j);
            setSupportBackgroundTintMode(cVar.f21226i);
        } else {
            cVar.e();
        }
        setPaddingRelative(paddingStart + cVar.f21220c, paddingTop + cVar.f21222e, paddingEnd + cVar.f21221d, paddingBottom + cVar.f21223f);
        i9.recycle();
        setCompoundDrawablePadding(this.f15903n);
        c(this.f15899i != null);
    }

    private Layout.Alignment getActualTextAlignment() {
        int textAlignment = getTextAlignment();
        if (textAlignment != 1) {
            if (textAlignment != 6 && textAlignment != 3) {
                if (textAlignment != 4) {
                    return Layout.Alignment.ALIGN_NORMAL;
                }
                return Layout.Alignment.ALIGN_CENTER;
            }
            return Layout.Alignment.ALIGN_OPPOSITE;
        }
        return getGravityTextAlignment();
    }

    private Layout.Alignment getGravityTextAlignment() {
        int gravity = getGravity() & 8388615;
        if (gravity != 1) {
            if (gravity != 5 && gravity != 8388613) {
                return Layout.Alignment.ALIGN_NORMAL;
            }
            return Layout.Alignment.ALIGN_OPPOSITE;
        }
        return Layout.Alignment.ALIGN_CENTER;
    }

    private int getTextHeight() {
        if (getLineCount() > 1) {
            return getLayout().getHeight();
        }
        TextPaint paint = getPaint();
        String charSequence = getText().toString();
        if (getTransformationMethod() != null) {
            charSequence = getTransformationMethod().getTransformation(charSequence, this).toString();
        }
        Rect rect = new Rect();
        paint.getTextBounds(charSequence, 0, charSequence.length(), rect);
        return Math.min(rect.height(), getLayout().getHeight());
    }

    private int getTextLayoutWidth() {
        int lineCount = getLineCount();
        float f9 = 0.0f;
        for (int i9 = 0; i9 < lineCount; i9++) {
            f9 = Math.max(f9, getLayout().getLineWidth(i9));
        }
        return (int) Math.ceil(f9);
    }

    public final boolean a() {
        c cVar = this.f15894d;
        if (cVar != null && !cVar.f21231o) {
            return true;
        }
        return false;
    }

    public final void b() {
        int i9 = this.f15906q;
        boolean z9 = true;
        if (i9 != 1 && i9 != 2) {
            z9 = false;
        }
        if (z9) {
            setCompoundDrawablesRelative(this.f15899i, null, null, null);
            return;
        }
        if (i9 != 3 && i9 != 4) {
            if (i9 != 16 && i9 != 32) {
                return;
            }
            setCompoundDrawablesRelative(null, this.f15899i, null, null);
            return;
        }
        setCompoundDrawablesRelative(null, null, this.f15899i, null);
    }

    public final void c(boolean z9) {
        Drawable drawable = this.f15899i;
        if (drawable != null) {
            Drawable mutate = drawable.mutate();
            this.f15899i = mutate;
            mutate.setTintList(this.f15898h);
            PorterDuff.Mode mode = this.f15897g;
            if (mode != null) {
                this.f15899i.setTintMode(mode);
            }
            int i9 = this.f15900k;
            if (i9 == 0) {
                i9 = this.f15899i.getIntrinsicWidth();
            }
            int i10 = this.f15900k;
            if (i10 == 0) {
                i10 = this.f15899i.getIntrinsicHeight();
            }
            Drawable drawable2 = this.f15899i;
            int i11 = this.f15901l;
            int i12 = this.f15902m;
            drawable2.setBounds(i11, i12, i9 + i11, i10 + i12);
            this.f15899i.setVisible(true, z9);
        }
        if (z9) {
            b();
            return;
        }
        Drawable[] compoundDrawablesRelative = getCompoundDrawablesRelative();
        Drawable drawable3 = compoundDrawablesRelative[0];
        Drawable drawable4 = compoundDrawablesRelative[1];
        Drawable drawable5 = compoundDrawablesRelative[2];
        int i13 = this.f15906q;
        if (((i13 != 1 && i13 != 2) || drawable3 == this.f15899i) && (((i13 != 3 && i13 != 4) || drawable5 == this.f15899i) && ((i13 != 16 && i13 != 32) || drawable4 == this.f15899i))) {
            return;
        }
        b();
    }

    public final void d(int i9, int i10) {
        boolean z9;
        boolean z10;
        if (this.f15899i != null && getLayout() != null) {
            int i11 = this.f15906q;
            boolean z11 = true;
            if (i11 != 1 && i11 != 2) {
                z9 = false;
            } else {
                z9 = true;
            }
            if (!z9 && i11 != 3 && i11 != 4) {
                if (i11 != 16 && i11 != 32) {
                    return;
                }
                this.f15901l = 0;
                if (i11 == 16) {
                    this.f15902m = 0;
                    c(false);
                    return;
                }
                int i12 = this.f15900k;
                if (i12 == 0) {
                    i12 = this.f15899i.getIntrinsicHeight();
                }
                int max = Math.max(0, (((((i10 - getTextHeight()) - getPaddingTop()) - i12) - this.f15903n) - getPaddingBottom()) / 2);
                if (this.f15902m != max) {
                    this.f15902m = max;
                    c(false);
                    return;
                }
                return;
            }
            this.f15902m = 0;
            Layout.Alignment actualTextAlignment = getActualTextAlignment();
            int i13 = this.f15906q;
            if (i13 != 1 && i13 != 3 && ((i13 != 2 || actualTextAlignment != Layout.Alignment.ALIGN_NORMAL) && (i13 != 4 || actualTextAlignment != Layout.Alignment.ALIGN_OPPOSITE))) {
                int i14 = this.f15900k;
                if (i14 == 0) {
                    i14 = this.f15899i.getIntrinsicWidth();
                }
                int textLayoutWidth = i9 - getTextLayoutWidth();
                WeakHashMap weakHashMap = Q.f5546a;
                int paddingEnd = (((textLayoutWidth - getPaddingEnd()) - i14) - this.f15903n) - getPaddingStart();
                if (actualTextAlignment == Layout.Alignment.ALIGN_CENTER) {
                    paddingEnd /= 2;
                }
                if (getLayoutDirection() == 1) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (this.f15906q != 4) {
                    z11 = false;
                }
                if (z10 != z11) {
                    paddingEnd = -paddingEnd;
                }
                if (this.f15901l != paddingEnd) {
                    this.f15901l = paddingEnd;
                    c(false);
                    return;
                }
                return;
            }
            this.f15901l = 0;
            c(false);
        }
    }

    public String getA11yClassName() {
        Class cls;
        if (!TextUtils.isEmpty(this.j)) {
            return this.j;
        }
        c cVar = this.f15894d;
        if (cVar != null && cVar.f21233q) {
            cls = CompoundButton.class;
        } else {
            cls = Button.class;
        }
        return cls.getName();
    }

    @Override // android.view.View
    public ColorStateList getBackgroundTintList() {
        return getSupportBackgroundTintList();
    }

    @Override // android.view.View
    public PorterDuff.Mode getBackgroundTintMode() {
        return getSupportBackgroundTintMode();
    }

    public int getCornerRadius() {
        if (a()) {
            return this.f15894d.f21224g;
        }
        return 0;
    }

    public Drawable getIcon() {
        return this.f15899i;
    }

    public int getIconGravity() {
        return this.f15906q;
    }

    public int getIconPadding() {
        return this.f15903n;
    }

    public int getIconSize() {
        return this.f15900k;
    }

    public ColorStateList getIconTint() {
        return this.f15898h;
    }

    public PorterDuff.Mode getIconTintMode() {
        return this.f15897g;
    }

    public int getInsetBottom() {
        return this.f15894d.f21223f;
    }

    public int getInsetTop() {
        return this.f15894d.f21222e;
    }

    public ColorStateList getRippleColor() {
        if (a()) {
            return this.f15894d.f21228l;
        }
        return null;
    }

    public m getShapeAppearanceModel() {
        if (a()) {
            return this.f15894d.f21219b;
        }
        throw new IllegalStateException("Attempted to get ShapeAppearanceModel from a MaterialButton which has an overwritten background.");
    }

    public ColorStateList getStrokeColor() {
        if (a()) {
            return this.f15894d.f21227k;
        }
        return null;
    }

    public int getStrokeWidth() {
        if (a()) {
            return this.f15894d.f21225h;
        }
        return 0;
    }

    @Override // p.C1815q
    public ColorStateList getSupportBackgroundTintList() {
        if (a()) {
            return this.f15894d.j;
        }
        return super.getSupportBackgroundTintList();
    }

    @Override // p.C1815q
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        if (a()) {
            return this.f15894d.f21226i;
        }
        return super.getSupportBackgroundTintMode();
    }

    @Override // android.widget.Checkable
    public final boolean isChecked() {
        return this.f15904o;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (a()) {
            AbstractC1002u1.b0(this, this.f15894d.b(false));
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final int[] onCreateDrawableState(int i9) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i9 + 2);
        c cVar = this.f15894d;
        if (cVar != null && cVar.f21233q) {
            View.mergeDrawableStates(onCreateDrawableState, f15892r);
        }
        if (this.f15904o) {
            View.mergeDrawableStates(onCreateDrawableState, f15893s);
        }
        return onCreateDrawableState;
    }

    @Override // p.C1815q, android.view.View
    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(getA11yClassName());
        accessibilityEvent.setChecked(this.f15904o);
    }

    @Override // p.C1815q, android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        boolean z9;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(getA11yClassName());
        c cVar = this.f15894d;
        if (cVar != null && cVar.f21233q) {
            z9 = true;
        } else {
            z9 = false;
        }
        accessibilityNodeInfo.setCheckable(z9);
        accessibilityNodeInfo.setChecked(this.f15904o);
        accessibilityNodeInfo.setClickable(isClickable());
    }

    @Override // p.C1815q, android.widget.TextView, android.view.View
    public final void onLayout(boolean z9, int i9, int i10, int i11, int i12) {
        super.onLayout(z9, i9, i10, i11, i12);
        d(getMeasuredWidth(), getMeasuredHeight());
    }

    @Override // android.widget.TextView, android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof C1654b)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        C1654b c1654b = (C1654b) parcelable;
        super.onRestoreInstanceState(c1654b.f7246a);
        setChecked(c1654b.f21217c);
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [android.os.Parcelable, U.b, n5.b] */
    @Override // android.widget.TextView, android.view.View
    public final Parcelable onSaveInstanceState() {
        ?? bVar = new b(super.onSaveInstanceState());
        bVar.f21217c = this.f15904o;
        return bVar;
    }

    @Override // p.C1815q, android.widget.TextView
    public final void onTextChanged(CharSequence charSequence, int i9, int i10, int i11) {
        super.onTextChanged(charSequence, i9, i10, i11);
        d(getMeasuredWidth(), getMeasuredHeight());
    }

    @Override // android.view.View
    public final boolean performClick() {
        if (this.f15894d.f21234r) {
            toggle();
        }
        return super.performClick();
    }

    @Override // android.view.View
    public final void refreshDrawableState() {
        super.refreshDrawableState();
        if (this.f15899i != null) {
            if (this.f15899i.setState(getDrawableState())) {
                invalidate();
            }
        }
    }

    public void setA11yClassName(String str) {
        this.j = str;
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        setBackgroundDrawable(drawable);
    }

    @Override // android.view.View
    public void setBackgroundColor(int i9) {
        if (a()) {
            c cVar = this.f15894d;
            if (cVar.b(false) != null) {
                cVar.b(false).setTint(i9);
                return;
            }
            return;
        }
        super.setBackgroundColor(i9);
    }

    @Override // p.C1815q, android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        if (a()) {
            if (drawable != getBackground()) {
                Log.w("MaterialButton", "MaterialButton manages its own background to control elevation, shape, color and states. Consider using backgroundTint, shapeAppearance and other attributes where available. A custom background will ignore these attributes and you should consider handling interaction states such as pressed, focused and disabled");
                c cVar = this.f15894d;
                cVar.f21231o = true;
                ColorStateList colorStateList = cVar.j;
                MaterialButton materialButton = cVar.f21218a;
                materialButton.setSupportBackgroundTintList(colorStateList);
                materialButton.setSupportBackgroundTintMode(cVar.f21226i);
                super.setBackgroundDrawable(drawable);
                return;
            }
            getBackground().setState(drawable.getState());
            return;
        }
        super.setBackgroundDrawable(drawable);
    }

    @Override // p.C1815q, android.view.View
    public void setBackgroundResource(int i9) {
        Drawable drawable;
        if (i9 != 0) {
            drawable = AbstractC0485a.q(getContext(), i9);
        } else {
            drawable = null;
        }
        setBackgroundDrawable(drawable);
    }

    @Override // android.view.View
    public void setBackgroundTintList(ColorStateList colorStateList) {
        setSupportBackgroundTintList(colorStateList);
    }

    @Override // android.view.View
    public void setBackgroundTintMode(PorterDuff.Mode mode) {
        setSupportBackgroundTintMode(mode);
    }

    public void setCheckable(boolean z9) {
        if (a()) {
            this.f15894d.f21233q = z9;
        }
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean z9) {
        c cVar = this.f15894d;
        if (cVar != null && cVar.f21233q && isEnabled() && this.f15904o != z9) {
            this.f15904o = z9;
            refreshDrawableState();
            if (getParent() instanceof MaterialButtonToggleGroup) {
                MaterialButtonToggleGroup materialButtonToggleGroup = (MaterialButtonToggleGroup) getParent();
                boolean z10 = this.f15904o;
                if (!materialButtonToggleGroup.f15913f) {
                    materialButtonToggleGroup.b(getId(), z10);
                }
            }
            if (!this.f15905p) {
                this.f15905p = true;
                Iterator it = this.f15895e.iterator();
                if (!it.hasNext()) {
                    this.f15905p = false;
                    return;
                }
                throw A0.a.h(it);
            }
        }
    }

    public void setCornerRadius(int i9) {
        if (a()) {
            c cVar = this.f15894d;
            if (!cVar.f21232p || cVar.f21224g != i9) {
                cVar.f21224g = i9;
                cVar.f21232p = true;
                float f9 = i9;
                l e8 = cVar.f21219b.e();
                e8.f2512e = new F5.a(f9);
                e8.f2513f = new F5.a(f9);
                e8.f2514g = new F5.a(f9);
                e8.f2515h = new F5.a(f9);
                cVar.c(e8.a());
            }
        }
    }

    public void setCornerRadiusResource(int i9) {
        if (a()) {
            setCornerRadius(getResources().getDimensionPixelSize(i9));
        }
    }

    @Override // android.view.View
    public void setElevation(float f9) {
        super.setElevation(f9);
        if (a()) {
            this.f15894d.b(false).j(f9);
        }
    }

    public void setIcon(Drawable drawable) {
        if (this.f15899i != drawable) {
            this.f15899i = drawable;
            c(true);
            d(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public void setIconGravity(int i9) {
        if (this.f15906q != i9) {
            this.f15906q = i9;
            d(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public void setIconPadding(int i9) {
        if (this.f15903n != i9) {
            this.f15903n = i9;
            setCompoundDrawablePadding(i9);
        }
    }

    public void setIconResource(int i9) {
        Drawable drawable;
        if (i9 != 0) {
            drawable = AbstractC0485a.q(getContext(), i9);
        } else {
            drawable = null;
        }
        setIcon(drawable);
    }

    public void setIconSize(int i9) {
        if (i9 >= 0) {
            if (this.f15900k != i9) {
                this.f15900k = i9;
                c(true);
                return;
            }
            return;
        }
        throw new IllegalArgumentException("iconSize cannot be less than 0");
    }

    public void setIconTint(ColorStateList colorStateList) {
        if (this.f15898h != colorStateList) {
            this.f15898h = colorStateList;
            c(false);
        }
    }

    public void setIconTintMode(PorterDuff.Mode mode) {
        if (this.f15897g != mode) {
            this.f15897g = mode;
            c(false);
        }
    }

    public void setIconTintResource(int i9) {
        setIconTint(d.c(getContext(), i9));
    }

    public void setInsetBottom(int i9) {
        c cVar = this.f15894d;
        cVar.d(cVar.f21222e, i9);
    }

    public void setInsetTop(int i9) {
        c cVar = this.f15894d;
        cVar.d(i9, cVar.f21223f);
    }

    public void setInternalBackground(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
    }

    public void setOnPressedChangeListenerInternal(InterfaceC1653a interfaceC1653a) {
        this.f15896f = interfaceC1653a;
    }

    @Override // android.view.View
    public void setPressed(boolean z9) {
        InterfaceC1653a interfaceC1653a = this.f15896f;
        if (interfaceC1653a != null) {
            ((MaterialButtonToggleGroup) ((u) interfaceC1653a).f16512a).invalidate();
        }
        super.setPressed(z9);
    }

    public void setRippleColor(ColorStateList colorStateList) {
        if (a()) {
            c cVar = this.f15894d;
            if (cVar.f21228l != colorStateList) {
                cVar.f21228l = colorStateList;
                MaterialButton materialButton = cVar.f21218a;
                if (materialButton.getBackground() instanceof RippleDrawable) {
                    ((RippleDrawable) materialButton.getBackground()).setColor(D5.a.c(colorStateList));
                }
            }
        }
    }

    public void setRippleColorResource(int i9) {
        if (a()) {
            setRippleColor(d.c(getContext(), i9));
        }
    }

    @Override // F5.x
    public void setShapeAppearanceModel(m mVar) {
        if (a()) {
            this.f15894d.c(mVar);
            return;
        }
        throw new IllegalStateException("Attempted to set ShapeAppearanceModel on a MaterialButton which has an overwritten background.");
    }

    public void setShouldDrawSurfaceColorStroke(boolean z9) {
        if (a()) {
            c cVar = this.f15894d;
            cVar.f21230n = z9;
            cVar.f();
        }
    }

    public void setStrokeColor(ColorStateList colorStateList) {
        if (a()) {
            c cVar = this.f15894d;
            if (cVar.f21227k != colorStateList) {
                cVar.f21227k = colorStateList;
                cVar.f();
            }
        }
    }

    public void setStrokeColorResource(int i9) {
        if (a()) {
            setStrokeColor(d.c(getContext(), i9));
        }
    }

    public void setStrokeWidth(int i9) {
        if (a()) {
            c cVar = this.f15894d;
            if (cVar.f21225h != i9) {
                cVar.f21225h = i9;
                cVar.f();
            }
        }
    }

    public void setStrokeWidthResource(int i9) {
        if (a()) {
            setStrokeWidth(getResources().getDimensionPixelSize(i9));
        }
    }

    @Override // p.C1815q
    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        if (a()) {
            c cVar = this.f15894d;
            if (cVar.j != colorStateList) {
                cVar.j = colorStateList;
                if (cVar.b(false) != null) {
                    cVar.b(false).setTintList(cVar.j);
                    return;
                }
                return;
            }
            return;
        }
        super.setSupportBackgroundTintList(colorStateList);
    }

    @Override // p.C1815q
    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        if (a()) {
            c cVar = this.f15894d;
            if (cVar.f21226i != mode) {
                cVar.f21226i = mode;
                if (cVar.b(false) != null && cVar.f21226i != null) {
                    cVar.b(false).setTintMode(cVar.f21226i);
                    return;
                }
                return;
            }
            return;
        }
        super.setSupportBackgroundTintMode(mode);
    }

    @Override // android.view.View
    public void setTextAlignment(int i9) {
        super.setTextAlignment(i9);
        d(getMeasuredWidth(), getMeasuredHeight());
    }

    public void setToggleCheckedStateOnClick(boolean z9) {
        this.f15894d.f21234r = z9;
    }

    @Override // android.widget.Checkable
    public final void toggle() {
        setChecked(!this.f15904o);
    }
}
