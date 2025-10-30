package com.google.android.material.progressindicator;

import A5.d;
import A5.e;
import A5.i;
import A5.j;
import A5.l;
import A5.p;
import A5.r;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import co.notix.R;
import com.google.android.gms.internal.measurement.D1;
import g5.AbstractC1254a;

/* loaded from: classes.dex */
public class CircularProgressIndicator extends d {
    public CircularProgressIndicator(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.circularProgressIndicatorStyle, R.style.Widget_MaterialComponents_CircularProgressIndicator);
        j jVar = (j) this.f390a;
        p pVar = new p(jVar);
        Context context2 = getContext();
        r rVar = new r(context2, jVar, pVar, new i(jVar));
        rVar.f456n = Y0.r.a(context2.getResources(), R.drawable.indeterminate_static, null);
        setIndeterminateDrawable(rVar);
        setProgressDrawable(new l(getContext(), jVar, pVar));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [A5.e, A5.j] */
    @Override // A5.d
    public final e a(Context context, AttributeSet attributeSet) {
        ?? eVar = new e(context, attributeSet, R.attr.circularProgressIndicatorStyle, R.style.Widget_MaterialComponents_CircularProgressIndicator);
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.mtrl_progress_circular_size_medium);
        int dimensionPixelSize2 = context.getResources().getDimensionPixelSize(R.dimen.mtrl_progress_circular_inset_medium);
        int[] iArr = AbstractC1254a.j;
        w5.p.a(context, attributeSet, R.attr.circularProgressIndicatorStyle, R.style.Widget_MaterialComponents_CircularProgressIndicator);
        w5.p.b(context, attributeSet, iArr, R.attr.circularProgressIndicatorStyle, R.style.Widget_MaterialComponents_CircularProgressIndicator, new int[0]);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, R.attr.circularProgressIndicatorStyle, R.style.Widget_MaterialComponents_CircularProgressIndicator);
        eVar.f427h = Math.max(D1.r(context, obtainStyledAttributes, 2, dimensionPixelSize), eVar.f400a * 2);
        eVar.f428i = D1.r(context, obtainStyledAttributes, 1, dimensionPixelSize2);
        eVar.j = obtainStyledAttributes.getInt(0, 0);
        obtainStyledAttributes.recycle();
        eVar.a();
        return eVar;
    }

    public int getIndicatorDirection() {
        return ((j) this.f390a).j;
    }

    public int getIndicatorInset() {
        return ((j) this.f390a).f428i;
    }

    public int getIndicatorSize() {
        return ((j) this.f390a).f427h;
    }

    public void setIndicatorDirection(int i9) {
        ((j) this.f390a).j = i9;
        invalidate();
    }

    public void setIndicatorInset(int i9) {
        e eVar = this.f390a;
        if (((j) eVar).f428i != i9) {
            ((j) eVar).f428i = i9;
            invalidate();
        }
    }

    public void setIndicatorSize(int i9) {
        int max = Math.max(i9, getTrackThickness() * 2);
        e eVar = this.f390a;
        if (((j) eVar).f427h != max) {
            ((j) eVar).f427h = max;
            ((j) eVar).a();
            requestLayout();
            invalidate();
        }
    }

    @Override // A5.d
    public void setTrackThickness(int i9) {
        super.setTrackThickness(i9);
        ((j) this.f390a).a();
    }
}
