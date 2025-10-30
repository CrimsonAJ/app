package com.google.android.material.checkbox;

import A0.a;
import A5.c;
import A5.t;
import Y0.b;
import Y0.d;
import Y0.f;
import a.AbstractC0485a;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.AnimatedStateListDrawable;
import android.graphics.drawable.AnimatedVectorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Build;
import android.os.Parcelable;
import android.text.TextUtils;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.autofill.AutofillManager;
import android.widget.CompoundButton;
import co.notix.R;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashSet;
import p.C1817r;
import p5.C1859a;
import s8.n;
import w5.p;

/* loaded from: classes.dex */
public class MaterialCheckBox extends C1817r {

    /* renamed from: e, reason: collision with root package name */
    public final LinkedHashSet f15924e;

    /* renamed from: f, reason: collision with root package name */
    public final LinkedHashSet f15925f;

    /* renamed from: g, reason: collision with root package name */
    public ColorStateList f15926g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f15927h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f15928i;
    public boolean j;

    /* renamed from: k, reason: collision with root package name */
    public CharSequence f15929k;

    /* renamed from: l, reason: collision with root package name */
    public Drawable f15930l;

    /* renamed from: m, reason: collision with root package name */
    public Drawable f15931m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f15932n;

    /* renamed from: o, reason: collision with root package name */
    public ColorStateList f15933o;

    /* renamed from: p, reason: collision with root package name */
    public ColorStateList f15934p;

    /* renamed from: q, reason: collision with root package name */
    public PorterDuff.Mode f15935q;

    /* renamed from: r, reason: collision with root package name */
    public int f15936r;

    /* renamed from: s, reason: collision with root package name */
    public int[] f15937s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f15938t;

    /* renamed from: u, reason: collision with root package name */
    public CharSequence f15939u;

    /* renamed from: v, reason: collision with root package name */
    public CompoundButton.OnCheckedChangeListener f15940v;

    /* renamed from: w, reason: collision with root package name */
    public final f f15941w;

    /* renamed from: x, reason: collision with root package name */
    public final c f15942x;

    /* renamed from: y, reason: collision with root package name */
    public static final int[] f15922y = {R.attr.state_indeterminate};

    /* renamed from: z, reason: collision with root package name */
    public static final int[] f15923z = {R.attr.state_error};

    /* renamed from: A, reason: collision with root package name */
    public static final int[][] f15920A = {new int[]{android.R.attr.state_enabled, R.attr.state_error}, new int[]{android.R.attr.state_enabled, android.R.attr.state_checked}, new int[]{android.R.attr.state_enabled, -16842912}, new int[]{-16842910, android.R.attr.state_checked}, new int[]{-16842910, -16842912}};

    /* renamed from: B, reason: collision with root package name */
    public static final int f15921B = Resources.getSystem().getIdentifier("btn_check_material_anim", "drawable", "android");

    /* JADX WARN: Removed duplicated region for block: B:13:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:6:0x00cd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public MaterialCheckBox(android.content.Context r12, android.util.AttributeSet r13) {
        /*
            Method dump skipped, instructions count: 328
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.checkbox.MaterialCheckBox.<init>(android.content.Context, android.util.AttributeSet):void");
    }

    private String getButtonStateDescription() {
        int i9 = this.f15936r;
        if (i9 == 1) {
            return getResources().getString(R.string.mtrl_checkbox_state_description_checked);
        }
        if (i9 == 0) {
            return getResources().getString(R.string.mtrl_checkbox_state_description_unchecked);
        }
        return getResources().getString(R.string.mtrl_checkbox_state_description_indeterminate);
    }

    private ColorStateList getMaterialThemeColorsTintList() {
        if (this.f15926g == null) {
            int r5 = n.r(this, R.attr.colorControlActivated);
            int r7 = n.r(this, R.attr.colorError);
            int r9 = n.r(this, R.attr.colorSurface);
            int r10 = n.r(this, R.attr.colorOnSurface);
            this.f15926g = new ColorStateList(f15920A, new int[]{n.t(r9, 1.0f, r7), n.t(r9, 1.0f, r5), n.t(r9, 0.54f, r10), n.t(r9, 0.38f, r10), n.t(r9, 0.38f, r10)});
        }
        return this.f15926g;
    }

    private ColorStateList getSuperButtonTintList() {
        ColorStateList colorStateList = this.f15933o;
        if (colorStateList != null) {
            return colorStateList;
        }
        if (super.getButtonTintList() != null) {
            return super.getButtonTintList();
        }
        return getSupportButtonTintList();
    }

    public final void a() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        t tVar;
        Drawable drawable = this.f15930l;
        ColorStateList colorStateList3 = this.f15933o;
        PorterDuff.Mode buttonTintMode = getButtonTintMode();
        if (drawable == null) {
            drawable = null;
        } else if (colorStateList3 != null) {
            drawable = drawable.mutate();
            if (buttonTintMode != null) {
                drawable.setTintMode(buttonTintMode);
            }
        }
        this.f15930l = drawable;
        Drawable drawable2 = this.f15931m;
        ColorStateList colorStateList4 = this.f15934p;
        PorterDuff.Mode mode = this.f15935q;
        if (drawable2 == null) {
            drawable2 = null;
        } else if (colorStateList4 != null) {
            drawable2 = drawable2.mutate();
            if (mode != null) {
                drawable2.setTintMode(mode);
            }
        }
        this.f15931m = drawable2;
        if (this.f15932n) {
            f fVar = this.f15941w;
            if (fVar != null) {
                Drawable drawable3 = fVar.f8511a;
                c cVar = this.f15942x;
                if (drawable3 != null) {
                    AnimatedVectorDrawable animatedVectorDrawable = (AnimatedVectorDrawable) drawable3;
                    if (cVar.f387a == null) {
                        cVar.f387a = new b(cVar);
                    }
                    animatedVectorDrawable.unregisterAnimationCallback(cVar.f387a);
                }
                ArrayList arrayList = fVar.f8507e;
                d dVar = fVar.f8504b;
                if (arrayList != null && cVar != null) {
                    arrayList.remove(cVar);
                    if (fVar.f8507e.size() == 0 && (tVar = fVar.f8506d) != null) {
                        dVar.f8499b.removeListener(tVar);
                        fVar.f8506d = null;
                    }
                }
                Drawable drawable4 = fVar.f8511a;
                if (drawable4 != null) {
                    AnimatedVectorDrawable animatedVectorDrawable2 = (AnimatedVectorDrawable) drawable4;
                    if (cVar.f387a == null) {
                        cVar.f387a = new b(cVar);
                    }
                    animatedVectorDrawable2.registerAnimationCallback(cVar.f387a);
                } else if (cVar != null) {
                    if (fVar.f8507e == null) {
                        fVar.f8507e = new ArrayList();
                    }
                    if (!fVar.f8507e.contains(cVar)) {
                        fVar.f8507e.add(cVar);
                        if (fVar.f8506d == null) {
                            fVar.f8506d = new t(5, fVar);
                        }
                        dVar.f8499b.addListener(fVar.f8506d);
                    }
                }
            }
            if (Build.VERSION.SDK_INT >= 24) {
                Drawable drawable5 = this.f15930l;
                if ((drawable5 instanceof AnimatedStateListDrawable) && fVar != null) {
                    ((AnimatedStateListDrawable) drawable5).addTransition(R.id.checked, R.id.unchecked, fVar, false);
                    ((AnimatedStateListDrawable) this.f15930l).addTransition(R.id.indeterminate, R.id.unchecked, fVar, false);
                }
            }
        }
        Drawable drawable6 = this.f15930l;
        if (drawable6 != null && (colorStateList2 = this.f15933o) != null) {
            drawable6.setTintList(colorStateList2);
        }
        Drawable drawable7 = this.f15931m;
        if (drawable7 != null && (colorStateList = this.f15934p) != null) {
            drawable7.setTintList(colorStateList);
        }
        Drawable drawable8 = this.f15930l;
        Drawable drawable9 = this.f15931m;
        if (drawable8 == null) {
            drawable8 = drawable9;
        } else if (drawable9 != null) {
            int intrinsicWidth = drawable9.getIntrinsicWidth();
            if (intrinsicWidth == -1) {
                intrinsicWidth = drawable8.getIntrinsicWidth();
            }
            int intrinsicHeight = drawable9.getIntrinsicHeight();
            if (intrinsicHeight == -1) {
                intrinsicHeight = drawable8.getIntrinsicHeight();
            }
            if (intrinsicWidth > drawable8.getIntrinsicWidth() || intrinsicHeight > drawable8.getIntrinsicHeight()) {
                float f9 = intrinsicWidth / intrinsicHeight;
                if (f9 >= drawable8.getIntrinsicWidth() / drawable8.getIntrinsicHeight()) {
                    int intrinsicWidth2 = drawable8.getIntrinsicWidth();
                    intrinsicHeight = (int) (intrinsicWidth2 / f9);
                    intrinsicWidth = intrinsicWidth2;
                } else {
                    intrinsicHeight = drawable8.getIntrinsicHeight();
                    intrinsicWidth = (int) (f9 * intrinsicHeight);
                }
            }
            LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{drawable8, drawable9});
            layerDrawable.setLayerSize(1, intrinsicWidth, intrinsicHeight);
            layerDrawable.setLayerGravity(1, 17);
            drawable8 = layerDrawable;
        }
        super.setButtonDrawable(drawable8);
        refreshDrawableState();
    }

    @Override // android.widget.CompoundButton
    public Drawable getButtonDrawable() {
        return this.f15930l;
    }

    public Drawable getButtonIconDrawable() {
        return this.f15931m;
    }

    public ColorStateList getButtonIconTintList() {
        return this.f15934p;
    }

    public PorterDuff.Mode getButtonIconTintMode() {
        return this.f15935q;
    }

    @Override // android.widget.CompoundButton
    public ColorStateList getButtonTintList() {
        return this.f15933o;
    }

    public int getCheckedState() {
        return this.f15936r;
    }

    public CharSequence getErrorAccessibilityLabel() {
        return this.f15929k;
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public final boolean isChecked() {
        if (this.f15936r == 1) {
            return true;
        }
        return false;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f15927h && this.f15933o == null && this.f15934p == null) {
            setUseMaterialThemeColors(true);
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final int[] onCreateDrawableState(int i9) {
        int[] copyOf;
        int[] onCreateDrawableState = super.onCreateDrawableState(i9 + 2);
        if (getCheckedState() == 2) {
            View.mergeDrawableStates(onCreateDrawableState, f15922y);
        }
        if (this.j) {
            View.mergeDrawableStates(onCreateDrawableState, f15923z);
        }
        int i10 = 0;
        while (true) {
            if (i10 < onCreateDrawableState.length) {
                int i11 = onCreateDrawableState[i10];
                if (i11 == 16842912) {
                    copyOf = onCreateDrawableState;
                    break;
                }
                if (i11 == 0) {
                    copyOf = (int[]) onCreateDrawableState.clone();
                    copyOf[i10] = 16842912;
                    break;
                }
                i10++;
            } else {
                copyOf = Arrays.copyOf(onCreateDrawableState, onCreateDrawableState.length + 1);
                copyOf[onCreateDrawableState.length] = 16842912;
                break;
            }
        }
        this.f15937s = copyOf;
        return onCreateDrawableState;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void onDraw(Canvas canvas) {
        Drawable buttonDrawable;
        int i9;
        if (this.f15928i && TextUtils.isEmpty(getText()) && (buttonDrawable = getButtonDrawable()) != null) {
            if (p.h(this)) {
                i9 = -1;
            } else {
                i9 = 1;
            }
            int width = ((getWidth() - buttonDrawable.getIntrinsicWidth()) / 2) * i9;
            int save = canvas.save();
            canvas.translate(width, 0.0f);
            super.onDraw(canvas);
            canvas.restoreToCount(save);
            if (getBackground() != null) {
                Rect bounds = buttonDrawable.getBounds();
                getBackground().setHotspotBounds(bounds.left + width, bounds.top, bounds.right + width, bounds.bottom);
                return;
            }
            return;
        }
        super.onDraw(canvas);
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        if (accessibilityNodeInfo != null && this.j) {
            accessibilityNodeInfo.setText(((Object) accessibilityNodeInfo.getText()) + ", " + ((Object) this.f15929k));
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof C1859a)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        C1859a c1859a = (C1859a) parcelable;
        super.onRestoreInstanceState(c1859a.getSuperState());
        setCheckedState(c1859a.f22181a);
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [android.view.View$BaseSavedState, android.os.Parcelable, p5.a] */
    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final Parcelable onSaveInstanceState() {
        ?? baseSavedState = new View.BaseSavedState(super.onSaveInstanceState());
        baseSavedState.f22181a = getCheckedState();
        return baseSavedState;
    }

    @Override // p.C1817r, android.widget.CompoundButton
    public void setButtonDrawable(int i9) {
        setButtonDrawable(AbstractC0485a.q(getContext(), i9));
    }

    public void setButtonIconDrawable(Drawable drawable) {
        this.f15931m = drawable;
        a();
    }

    public void setButtonIconDrawableResource(int i9) {
        setButtonIconDrawable(AbstractC0485a.q(getContext(), i9));
    }

    public void setButtonIconTintList(ColorStateList colorStateList) {
        if (this.f15934p == colorStateList) {
            return;
        }
        this.f15934p = colorStateList;
        a();
    }

    public void setButtonIconTintMode(PorterDuff.Mode mode) {
        if (this.f15935q == mode) {
            return;
        }
        this.f15935q = mode;
        a();
    }

    @Override // android.widget.CompoundButton
    public void setButtonTintList(ColorStateList colorStateList) {
        if (this.f15933o == colorStateList) {
            return;
        }
        this.f15933o = colorStateList;
        a();
    }

    @Override // android.widget.CompoundButton
    public void setButtonTintMode(PorterDuff.Mode mode) {
        setSupportButtonTintMode(mode);
        a();
    }

    public void setCenterIfNoTextEnabled(boolean z9) {
        this.f15928i = z9;
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public void setChecked(boolean z9) {
        setCheckedState(z9 ? 1 : 0);
    }

    public void setCheckedState(int i9) {
        boolean z9;
        AutofillManager autofillManager;
        CompoundButton.OnCheckedChangeListener onCheckedChangeListener;
        if (this.f15936r != i9) {
            this.f15936r = i9;
            if (i9 == 1) {
                z9 = true;
            } else {
                z9 = false;
            }
            super.setChecked(z9);
            refreshDrawableState();
            int i10 = Build.VERSION.SDK_INT;
            if (i10 >= 30 && this.f15939u == null) {
                super.setStateDescription(getButtonStateDescription());
            }
            if (!this.f15938t) {
                this.f15938t = true;
                LinkedHashSet linkedHashSet = this.f15925f;
                if (linkedHashSet != null) {
                    Iterator it = linkedHashSet.iterator();
                    if (it.hasNext()) {
                        throw a.h(it);
                    }
                }
                if (this.f15936r != 2 && (onCheckedChangeListener = this.f15940v) != null) {
                    onCheckedChangeListener.onCheckedChanged(this, isChecked());
                }
                if (i10 >= 26 && (autofillManager = (AutofillManager) getContext().getSystemService(AutofillManager.class)) != null) {
                    autofillManager.notifyValueChanged(this);
                }
                this.f15938t = false;
            }
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void setEnabled(boolean z9) {
        super.setEnabled(z9);
    }

    public void setErrorAccessibilityLabel(CharSequence charSequence) {
        this.f15929k = charSequence;
    }

    public void setErrorAccessibilityLabelResource(int i9) {
        CharSequence charSequence;
        if (i9 != 0) {
            charSequence = getResources().getText(i9);
        } else {
            charSequence = null;
        }
        setErrorAccessibilityLabel(charSequence);
    }

    public void setErrorShown(boolean z9) {
        if (this.j != z9) {
            this.j = z9;
            refreshDrawableState();
            Iterator it = this.f15924e.iterator();
            if (!it.hasNext()) {
            } else {
                throw a.h(it);
            }
        }
    }

    @Override // android.widget.CompoundButton
    public void setOnCheckedChangeListener(CompoundButton.OnCheckedChangeListener onCheckedChangeListener) {
        this.f15940v = onCheckedChangeListener;
    }

    @Override // android.widget.CompoundButton, android.view.View
    public void setStateDescription(CharSequence charSequence) {
        this.f15939u = charSequence;
        if (charSequence == null) {
            if (Build.VERSION.SDK_INT >= 30 && charSequence == null) {
                super.setStateDescription(getButtonStateDescription());
                return;
            }
            return;
        }
        super.setStateDescription(charSequence);
    }

    public void setUseMaterialThemeColors(boolean z9) {
        this.f15927h = z9;
        if (z9) {
            setButtonTintList(getMaterialThemeColorsTintList());
        } else {
            setButtonTintList(null);
        }
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public final void toggle() {
        setChecked(!isChecked());
    }

    @Override // p.C1817r, android.widget.CompoundButton
    public void setButtonDrawable(Drawable drawable) {
        this.f15930l = drawable;
        this.f15932n = false;
        a();
    }
}
