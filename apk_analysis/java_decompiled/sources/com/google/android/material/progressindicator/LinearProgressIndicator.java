package com.google.android.material.progressindicator;

import A5.d;
import A5.e;
import A5.l;
import A5.p;
import A5.q;
import A5.r;
import A5.u;
import A5.w;
import A5.x;
import P.Q;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import co.notix.R;
import g5.AbstractC1254a;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public class LinearProgressIndicator extends d {
    /* JADX WARN: Type inference failed for: r4v1, types: [A5.s, A5.p] */
    public LinearProgressIndicator(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.linearProgressIndicatorStyle, R.style.Widget_MaterialComponents_LinearProgressIndicator);
        q wVar;
        x xVar = (x) this.f390a;
        ?? pVar = new p(xVar);
        pVar.f457b = 300.0f;
        Context context2 = getContext();
        if (xVar.f483h == 0) {
            wVar = new u(xVar);
        } else {
            wVar = new w(context2, xVar);
        }
        setIndeterminateDrawable(new r(context2, xVar, pVar, wVar));
        setProgressDrawable(new l(getContext(), xVar, pVar));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [A5.x, A5.e] */
    @Override // A5.d
    public final e a(Context context, AttributeSet attributeSet) {
        ?? eVar = new e(context, attributeSet, R.attr.linearProgressIndicatorStyle, R.style.Widget_MaterialComponents_LinearProgressIndicator);
        int[] iArr = AbstractC1254a.f17753s;
        boolean z9 = false;
        w5.p.a(context, attributeSet, R.attr.linearProgressIndicatorStyle, R.style.Widget_MaterialComponents_LinearProgressIndicator);
        w5.p.b(context, attributeSet, iArr, R.attr.linearProgressIndicatorStyle, R.style.Widget_MaterialComponents_LinearProgressIndicator, new int[0]);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, R.attr.linearProgressIndicatorStyle, R.style.Widget_MaterialComponents_LinearProgressIndicator);
        eVar.f483h = obtainStyledAttributes.getInt(0, 1);
        eVar.f484i = obtainStyledAttributes.getInt(1, 0);
        eVar.f485k = Math.min(obtainStyledAttributes.getDimensionPixelSize(2, 0), eVar.f400a);
        obtainStyledAttributes.recycle();
        eVar.a();
        if (eVar.f484i == 1) {
            z9 = true;
        }
        eVar.j = z9;
        return eVar;
    }

    @Override // A5.d
    public final void b(int i9) {
        e eVar = this.f390a;
        if (eVar != null && ((x) eVar).f483h == 0 && isIndeterminate()) {
            return;
        }
        super.b(i9);
    }

    public int getIndeterminateAnimationType() {
        return ((x) this.f390a).f483h;
    }

    public int getIndicatorDirection() {
        return ((x) this.f390a).f484i;
    }

    public int getTrackStopIndicatorSize() {
        return ((x) this.f390a).f485k;
    }

    @Override // android.view.View
    public final void onLayout(boolean z9, int i9, int i10, int i11, int i12) {
        super.onLayout(z9, i9, i10, i11, i12);
        e eVar = this.f390a;
        x xVar = (x) eVar;
        boolean z10 = true;
        if (((x) eVar).f484i != 1) {
            WeakHashMap weakHashMap = Q.f5546a;
            if ((getLayoutDirection() != 1 || ((x) eVar).f484i != 2) && (getLayoutDirection() != 0 || ((x) eVar).f484i != 3)) {
                z10 = false;
            }
        }
        xVar.j = z10;
    }

    @Override // android.widget.ProgressBar, android.view.View
    public final void onSizeChanged(int i9, int i10, int i11, int i12) {
        int paddingRight = i9 - (getPaddingRight() + getPaddingLeft());
        int paddingBottom = i10 - (getPaddingBottom() + getPaddingTop());
        r indeterminateDrawable = getIndeterminateDrawable();
        if (indeterminateDrawable != null) {
            indeterminateDrawable.setBounds(0, 0, paddingRight, paddingBottom);
        }
        l progressDrawable = getProgressDrawable();
        if (progressDrawable != null) {
            progressDrawable.setBounds(0, 0, paddingRight, paddingBottom);
        }
    }

    public void setIndeterminateAnimationType(int i9) {
        e eVar = this.f390a;
        if (((x) eVar).f483h == i9) {
            return;
        }
        if (c() && isIndeterminate()) {
            throw new IllegalStateException("Cannot change indeterminate animation type while the progress indicator is show in indeterminate mode.");
        }
        ((x) eVar).f483h = i9;
        ((x) eVar).a();
        if (i9 == 0) {
            r indeterminateDrawable = getIndeterminateDrawable();
            u uVar = new u((x) eVar);
            indeterminateDrawable.f455m = uVar;
            uVar.f452a = indeterminateDrawable;
        } else {
            r indeterminateDrawable2 = getIndeterminateDrawable();
            w wVar = new w(getContext(), (x) eVar);
            indeterminateDrawable2.f455m = wVar;
            wVar.f452a = indeterminateDrawable2;
        }
        invalidate();
    }

    @Override // A5.d
    public void setIndicatorColor(int... iArr) {
        super.setIndicatorColor(iArr);
        ((x) this.f390a).a();
    }

    public void setIndicatorDirection(int i9) {
        e eVar = this.f390a;
        ((x) eVar).f484i = i9;
        x xVar = (x) eVar;
        boolean z9 = true;
        if (i9 != 1) {
            WeakHashMap weakHashMap = Q.f5546a;
            if ((getLayoutDirection() != 1 || ((x) eVar).f484i != 2) && (getLayoutDirection() != 0 || i9 != 3)) {
                z9 = false;
            }
        }
        xVar.j = z9;
        invalidate();
    }

    @Override // A5.d
    public void setTrackCornerRadius(int i9) {
        super.setTrackCornerRadius(i9);
        ((x) this.f390a).a();
        invalidate();
    }

    public void setTrackStopIndicatorSize(int i9) {
        e eVar = this.f390a;
        if (((x) eVar).f485k != i9) {
            ((x) eVar).f485k = Math.min(i9, ((x) eVar).f400a);
            ((x) eVar).a();
            invalidate();
        }
    }
}
