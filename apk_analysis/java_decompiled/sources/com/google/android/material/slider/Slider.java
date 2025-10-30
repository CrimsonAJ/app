package com.google.android.material.slider;

import F5.a;
import F5.e;
import F5.h;
import F5.l;
import H5.d;
import a.AbstractC0485a;
import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.util.AttributeSet;
import android.widget.SeekBar;
import com.google.android.gms.internal.measurement.AbstractC1002u1;
import java.util.Iterator;

/* loaded from: classes.dex */
public class Slider extends d {
    public Slider(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.value});
        if (obtainStyledAttributes.hasValue(0)) {
            setValue(obtainStyledAttributes.getFloat(0, 0.0f));
        }
        obtainStyledAttributes.recycle();
    }

    @Override // android.view.View
    public CharSequence getAccessibilityClassName() {
        return SeekBar.class.getName();
    }

    public int getActiveThumbIndex() {
        return this.f3175u0;
    }

    public int getFocusedThumbIndex() {
        return this.f3177v0;
    }

    public int getHaloRadius() {
        return this.f3151h0;
    }

    public ColorStateList getHaloTintList() {
        return this.f3127E0;
    }

    public int getLabelBehavior() {
        return this.f3121B;
    }

    public float getStepSize() {
        return this.f3179w0;
    }

    public float getThumbElevation() {
        return this.f3135M0.f2483a.f2477m;
    }

    public int getThumbHeight() {
        return this.f3149g0;
    }

    @Override // H5.d
    public int getThumbRadius() {
        return this.f3147f0 / 2;
    }

    public ColorStateList getThumbStrokeColor() {
        return this.f3135M0.f2483a.f2469d;
    }

    public float getThumbStrokeWidth() {
        return this.f3135M0.f2483a.j;
    }

    public ColorStateList getThumbTintList() {
        return this.f3135M0.f2483a.f2468c;
    }

    public int getThumbTrackGapSize() {
        return this.f3153i0;
    }

    public int getThumbWidth() {
        return this.f3147f0;
    }

    public int getTickActiveRadius() {
        return this.f3185z0;
    }

    public ColorStateList getTickActiveTintList() {
        return this.f3128F0;
    }

    public int getTickInactiveRadius() {
        return this.f3120A0;
    }

    public ColorStateList getTickInactiveTintList() {
        return this.f3129G0;
    }

    public ColorStateList getTickTintList() {
        if (this.f3129G0.equals(this.f3128F0)) {
            return this.f3128F0;
        }
        throw new IllegalStateException("The inactive and active ticks are different colors. Use the getTickColorInactive() and getTickColorActive() methods instead.");
    }

    public ColorStateList getTrackActiveTintList() {
        return this.f3130H0;
    }

    public int getTrackHeight() {
        return this.f3123C;
    }

    public ColorStateList getTrackInactiveTintList() {
        return this.f3131I0;
    }

    public int getTrackInsideCornerSize() {
        return this.f3160m0;
    }

    public int getTrackSidePadding() {
        return this.f3125D;
    }

    public int getTrackStopIndicatorSize() {
        return this.f3158l0;
    }

    public ColorStateList getTrackTintList() {
        if (this.f3131I0.equals(this.f3130H0)) {
            return this.f3130H0;
        }
        throw new IllegalStateException("The inactive and active parts of the track are different colors. Use the getInactiveTrackColor() and getActiveTrackColor() methods instead.");
    }

    public int getTrackWidth() {
        return this.f3122B0;
    }

    public float getValue() {
        return getValues().get(0).floatValue();
    }

    public float getValueFrom() {
        return this.r0;
    }

    public float getValueTo() {
        return this.f3171s0;
    }

    public void setCustomThumbDrawable(int i9) {
        setCustomThumbDrawable(getResources().getDrawable(i9));
    }

    @Override // H5.d, android.view.View
    public /* bridge */ /* synthetic */ void setEnabled(boolean z9) {
        super.setEnabled(z9);
    }

    public void setFocusedThumbIndex(int i9) {
        if (i9 >= 0 && i9 < this.f3173t0.size()) {
            this.f3177v0 = i9;
            this.f3150h.w(i9);
            postInvalidate();
            return;
        }
        throw new IllegalArgumentException("index out of range");
    }

    @Override // H5.d
    public void setHaloRadius(int i9) {
        if (i9 == this.f3151h0) {
            return;
        }
        this.f3151h0 = i9;
        Drawable background = getBackground();
        if ((getBackground() instanceof RippleDrawable) && (background instanceof RippleDrawable)) {
            ((RippleDrawable) background).setRadius(this.f3151h0);
        } else {
            postInvalidate();
        }
    }

    public void setHaloRadiusResource(int i9) {
        setHaloRadius(getResources().getDimensionPixelSize(i9));
    }

    @Override // H5.d
    public void setHaloTintList(ColorStateList colorStateList) {
        if (colorStateList.equals(this.f3127E0)) {
            return;
        }
        this.f3127E0 = colorStateList;
        Drawable background = getBackground();
        if ((getBackground() instanceof RippleDrawable) && (background instanceof RippleDrawable)) {
            ((RippleDrawable) background).setColor(colorStateList);
            return;
        }
        Paint paint = this.f3144d;
        paint.setColor(i(colorStateList));
        paint.setAlpha(63);
        invalidate();
    }

    @Override // H5.d
    public void setLabelBehavior(int i9) {
        if (this.f3121B != i9) {
            this.f3121B = i9;
            requestLayout();
        }
    }

    public void setStepSize(float f9) {
        if (f9 >= 0.0f) {
            if (this.f3179w0 != f9) {
                this.f3179w0 = f9;
                this.f3126D0 = true;
                postInvalidate();
                return;
            }
            return;
        }
        throw new IllegalArgumentException("The stepSize(" + f9 + ") must be 0, or a factor of the valueFrom(" + this.r0 + ")-valueTo(" + this.f3171s0 + ") range");
    }

    @Override // H5.d
    public void setThumbElevation(float f9) {
        this.f3135M0.j(f9);
    }

    public void setThumbElevationResource(int i9) {
        setThumbElevation(getResources().getDimension(i9));
    }

    @Override // H5.d
    public void setThumbHeight(int i9) {
        if (i9 == this.f3149g0) {
            return;
        }
        this.f3149g0 = i9;
        this.f3135M0.setBounds(0, 0, this.f3147f0, i9);
        Drawable drawable = this.f3136N0;
        if (drawable != null) {
            b(drawable);
        }
        Iterator it = this.f3137O0.iterator();
        while (it.hasNext()) {
            b((Drawable) it.next());
        }
        z();
    }

    public void setThumbHeightResource(int i9) {
        setThumbHeight(getResources().getDimensionPixelSize(i9));
    }

    public void setThumbRadius(int i9) {
        int i10 = i9 * 2;
        setThumbWidth(i10);
        setThumbHeight(i10);
    }

    public void setThumbRadiusResource(int i9) {
        setThumbRadius(getResources().getDimensionPixelSize(i9));
    }

    @Override // H5.d
    public void setThumbStrokeColor(ColorStateList colorStateList) {
        this.f3135M0.m(colorStateList);
        postInvalidate();
    }

    public void setThumbStrokeColorResource(int i9) {
        if (i9 != 0) {
            setThumbStrokeColor(E.d.c(getContext(), i9));
        }
    }

    @Override // H5.d
    public void setThumbStrokeWidth(float f9) {
        h hVar = this.f3135M0;
        hVar.f2483a.j = f9;
        hVar.invalidateSelf();
        postInvalidate();
    }

    public void setThumbStrokeWidthResource(int i9) {
        if (i9 != 0) {
            setThumbStrokeWidth(getResources().getDimension(i9));
        }
    }

    public void setThumbTintList(ColorStateList colorStateList) {
        h hVar = this.f3135M0;
        if (colorStateList.equals(hVar.f2483a.f2468c)) {
            return;
        }
        hVar.k(colorStateList);
        invalidate();
    }

    @Override // H5.d
    public void setThumbTrackGapSize(int i9) {
        if (this.f3153i0 == i9) {
            return;
        }
        this.f3153i0 = i9;
        invalidate();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v4, types: [java.lang.Object, F5.m] */
    @Override // H5.d
    public void setThumbWidth(int i9) {
        if (i9 == this.f3147f0) {
            return;
        }
        this.f3147f0 = i9;
        h hVar = this.f3135M0;
        e eVar = new e(0);
        e eVar2 = new e(0);
        e eVar3 = new e(0);
        e eVar4 = new e(0);
        float f9 = this.f3147f0 / 2.0f;
        AbstractC0485a m9 = AbstractC1002u1.m(0);
        l.b(m9);
        l.b(m9);
        l.b(m9);
        l.b(m9);
        a aVar = new a(f9);
        a aVar2 = new a(f9);
        a aVar3 = new a(f9);
        a aVar4 = new a(f9);
        ?? obj = new Object();
        obj.f2519a = m9;
        obj.f2520b = m9;
        obj.f2521c = m9;
        obj.f2522d = m9;
        obj.f2523e = aVar;
        obj.f2524f = aVar2;
        obj.f2525g = aVar3;
        obj.f2526h = aVar4;
        obj.f2527i = eVar;
        obj.j = eVar2;
        obj.f2528k = eVar3;
        obj.f2529l = eVar4;
        hVar.setShapeAppearanceModel(obj);
        hVar.setBounds(0, 0, this.f3147f0, this.f3149g0);
        Drawable drawable = this.f3136N0;
        if (drawable != null) {
            b(drawable);
        }
        Iterator it = this.f3137O0.iterator();
        while (it.hasNext()) {
            b((Drawable) it.next());
        }
        z();
    }

    public void setThumbWidthResource(int i9) {
        setThumbWidth(getResources().getDimensionPixelSize(i9));
    }

    @Override // H5.d
    public void setTickActiveRadius(int i9) {
        if (this.f3185z0 != i9) {
            this.f3185z0 = i9;
            this.f3146f.setStrokeWidth(i9 * 2);
            z();
        }
    }

    @Override // H5.d
    public void setTickActiveTintList(ColorStateList colorStateList) {
        if (colorStateList.equals(this.f3128F0)) {
            return;
        }
        this.f3128F0 = colorStateList;
        this.f3146f.setColor(i(colorStateList));
        invalidate();
    }

    @Override // H5.d
    public void setTickInactiveRadius(int i9) {
        if (this.f3120A0 != i9) {
            this.f3120A0 = i9;
            this.f3145e.setStrokeWidth(i9 * 2);
            z();
        }
    }

    @Override // H5.d
    public void setTickInactiveTintList(ColorStateList colorStateList) {
        if (colorStateList.equals(this.f3129G0)) {
            return;
        }
        this.f3129G0 = colorStateList;
        this.f3145e.setColor(i(colorStateList));
        invalidate();
    }

    public void setTickTintList(ColorStateList colorStateList) {
        setTickInactiveTintList(colorStateList);
        setTickActiveTintList(colorStateList);
    }

    public void setTickVisible(boolean z9) {
        if (this.f3183y0 != z9) {
            this.f3183y0 = z9;
            postInvalidate();
        }
    }

    @Override // H5.d
    public void setTrackActiveTintList(ColorStateList colorStateList) {
        if (colorStateList.equals(this.f3130H0)) {
            return;
        }
        this.f3130H0 = colorStateList;
        this.f3142b.setColor(i(colorStateList));
        this.f3148g.setColor(i(this.f3130H0));
        invalidate();
    }

    @Override // H5.d
    public void setTrackHeight(int i9) {
        if (this.f3123C != i9) {
            this.f3123C = i9;
            this.f3141a.setStrokeWidth(i9);
            this.f3142b.setStrokeWidth(this.f3123C);
            z();
        }
    }

    @Override // H5.d
    public void setTrackInactiveTintList(ColorStateList colorStateList) {
        if (colorStateList.equals(this.f3131I0)) {
            return;
        }
        this.f3131I0 = colorStateList;
        this.f3141a.setColor(i(colorStateList));
        invalidate();
    }

    @Override // H5.d
    public void setTrackInsideCornerSize(int i9) {
        if (this.f3160m0 == i9) {
            return;
        }
        this.f3160m0 = i9;
        invalidate();
    }

    @Override // H5.d
    public void setTrackStopIndicatorSize(int i9) {
        if (this.f3158l0 == i9) {
            return;
        }
        this.f3158l0 = i9;
        this.f3148g.setStrokeWidth(i9);
        invalidate();
    }

    public void setTrackTintList(ColorStateList colorStateList) {
        setTrackInactiveTintList(colorStateList);
        setTrackActiveTintList(colorStateList);
    }

    public void setValue(float f9) {
        setValues(Float.valueOf(f9));
    }

    public void setValueFrom(float f9) {
        this.r0 = f9;
        this.f3126D0 = true;
        postInvalidate();
    }

    public void setValueTo(float f9) {
        this.f3171s0 = f9;
        this.f3126D0 = true;
        postInvalidate();
    }

    public void setCustomThumbDrawable(Drawable drawable) {
        Drawable newDrawable = drawable.mutate().getConstantState().newDrawable();
        b(newDrawable);
        this.f3136N0 = newDrawable;
        this.f3137O0.clear();
        postInvalidate();
    }

    public /* bridge */ /* synthetic */ void setLabelFormatter(H5.e eVar) {
    }
}
