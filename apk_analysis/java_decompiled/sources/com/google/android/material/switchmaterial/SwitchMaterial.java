package com.google.android.material.switchmaterial;

import M5.a;
import P.H;
import P.Q;
import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewParent;
import g5.AbstractC1254a;
import java.util.WeakHashMap;
import p.AbstractC1759N0;
import s8.n;
import u5.C2081a;
import w5.p;

/* loaded from: classes.dex */
public class SwitchMaterial extends AbstractC1759N0 {

    /* renamed from: y0, reason: collision with root package name */
    public static final int[][] f16118y0 = {new int[]{R.attr.state_enabled, R.attr.state_checked}, new int[]{R.attr.state_enabled, -16842912}, new int[]{-16842910, R.attr.state_checked}, new int[]{-16842910, -16842912}};

    /* renamed from: u0, reason: collision with root package name */
    public final C2081a f16119u0;

    /* renamed from: v0, reason: collision with root package name */
    public ColorStateList f16120v0;

    /* renamed from: w0, reason: collision with root package name */
    public ColorStateList f16121w0;

    /* renamed from: x0, reason: collision with root package name */
    public boolean f16122x0;

    public SwitchMaterial(Context context, AttributeSet attributeSet) {
        super(a.a(context, attributeSet, co.notix.R.attr.switchStyle, co.notix.R.style.Widget_MaterialComponents_CompoundButton_Switch), attributeSet);
        Context context2 = getContext();
        this.f16119u0 = new C2081a(context2);
        int[] iArr = AbstractC1254a.f17728N;
        p.a(context2, attributeSet, co.notix.R.attr.switchStyle, co.notix.R.style.Widget_MaterialComponents_CompoundButton_Switch);
        p.b(context2, attributeSet, iArr, co.notix.R.attr.switchStyle, co.notix.R.style.Widget_MaterialComponents_CompoundButton_Switch, new int[0]);
        TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, iArr, co.notix.R.attr.switchStyle, co.notix.R.style.Widget_MaterialComponents_CompoundButton_Switch);
        this.f16122x0 = obtainStyledAttributes.getBoolean(0, false);
        obtainStyledAttributes.recycle();
    }

    private ColorStateList getMaterialThemeColorsThumbTintList() {
        if (this.f16120v0 == null) {
            int r5 = n.r(this, co.notix.R.attr.colorSurface);
            int r7 = n.r(this, co.notix.R.attr.colorControlActivated);
            float dimension = getResources().getDimension(co.notix.R.dimen.mtrl_switch_thumb_elevation);
            C2081a c2081a = this.f16119u0;
            if (c2081a.f23702a) {
                float f9 = 0.0f;
                for (ViewParent parent = getParent(); parent instanceof View; parent = parent.getParent()) {
                    WeakHashMap weakHashMap = Q.f5546a;
                    f9 += H.e((View) parent);
                }
                dimension += f9;
            }
            int a5 = c2081a.a(r5, dimension);
            this.f16120v0 = new ColorStateList(f16118y0, new int[]{n.t(r5, 1.0f, r7), a5, n.t(r5, 0.38f, r7), a5});
        }
        return this.f16120v0;
    }

    private ColorStateList getMaterialThemeColorsTrackTintList() {
        if (this.f16121w0 == null) {
            int r5 = n.r(this, co.notix.R.attr.colorSurface);
            int r7 = n.r(this, co.notix.R.attr.colorControlActivated);
            int r9 = n.r(this, co.notix.R.attr.colorOnSurface);
            this.f16121w0 = new ColorStateList(f16118y0, new int[]{n.t(r5, 0.54f, r7), n.t(r5, 0.32f, r9), n.t(r5, 0.12f, r7), n.t(r5, 0.12f, r9)});
        }
        return this.f16121w0;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f16122x0 && getThumbTintList() == null) {
            setThumbTintList(getMaterialThemeColorsThumbTintList());
        }
        if (this.f16122x0 && getTrackTintList() == null) {
            setTrackTintList(getMaterialThemeColorsTrackTintList());
        }
    }

    public void setUseMaterialThemeColors(boolean z9) {
        this.f16122x0 = z9;
        if (z9) {
            setThumbTintList(getMaterialThemeColorsThumbTintList());
            setTrackTintList(getMaterialThemeColorsTrackTintList());
        } else {
            setThumbTintList(null);
            setTrackTintList(null);
        }
    }
}
