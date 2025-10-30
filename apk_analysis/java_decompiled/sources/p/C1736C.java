package p;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import b5.G1;
import co.notix.R;
import h.AbstractC1260a;

/* renamed from: p.C, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1736C extends C1831y {

    /* renamed from: e, reason: collision with root package name */
    public final C1734B f21797e;

    /* renamed from: f, reason: collision with root package name */
    public Drawable f21798f;

    /* renamed from: g, reason: collision with root package name */
    public ColorStateList f21799g;

    /* renamed from: h, reason: collision with root package name */
    public PorterDuff.Mode f21800h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f21801i;
    public boolean j;

    public C1736C(C1734B c1734b) {
        super(c1734b);
        this.f21799g = null;
        this.f21800h = null;
        this.f21801i = false;
        this.j = false;
        this.f21797e = c1734b;
    }

    @Override // p.C1831y
    public final void b(AttributeSet attributeSet, int i9) {
        super.b(attributeSet, R.attr.seekBarStyle);
        C1734B c1734b = this.f21797e;
        Context context = c1734b.getContext();
        int[] iArr = AbstractC1260a.f17811g;
        G1 w7 = G1.w(context, attributeSet, iArr, R.attr.seekBarStyle);
        P.Q.l(c1734b, c1734b.getContext(), iArr, attributeSet, (TypedArray) w7.f10718c, R.attr.seekBarStyle);
        Drawable p9 = w7.p(0);
        if (p9 != null) {
            c1734b.setThumb(p9);
        }
        Drawable o9 = w7.o(1);
        Drawable drawable = this.f21798f;
        if (drawable != null) {
            drawable.setCallback(null);
        }
        this.f21798f = o9;
        if (o9 != null) {
            o9.setCallback(c1734b);
            o9.setLayoutDirection(c1734b.getLayoutDirection());
            if (o9.isStateful()) {
                o9.setState(c1734b.getDrawableState());
            }
            f();
        }
        c1734b.invalidate();
        TypedArray typedArray = (TypedArray) w7.f10718c;
        if (typedArray.hasValue(3)) {
            this.f21800h = AbstractC1800i0.c(typedArray.getInt(3, -1), this.f21800h);
            this.j = true;
        }
        if (typedArray.hasValue(2)) {
            this.f21799g = w7.n(2);
            this.f21801i = true;
        }
        w7.y();
        f();
    }

    public final void f() {
        Drawable drawable = this.f21798f;
        if (drawable != null) {
            if (this.f21801i || this.j) {
                Drawable mutate = drawable.mutate();
                this.f21798f = mutate;
                if (this.f21801i) {
                    mutate.setTintList(this.f21799g);
                }
                if (this.j) {
                    this.f21798f.setTintMode(this.f21800h);
                }
                if (this.f21798f.isStateful()) {
                    this.f21798f.setState(this.f21797e.getDrawableState());
                }
            }
        }
    }

    public final void g(Canvas canvas) {
        int i9;
        if (this.f21798f != null) {
            int max = this.f21797e.getMax();
            int i10 = 1;
            if (max > 1) {
                int intrinsicWidth = this.f21798f.getIntrinsicWidth();
                int intrinsicHeight = this.f21798f.getIntrinsicHeight();
                if (intrinsicWidth >= 0) {
                    i9 = intrinsicWidth / 2;
                } else {
                    i9 = 1;
                }
                if (intrinsicHeight >= 0) {
                    i10 = intrinsicHeight / 2;
                }
                this.f21798f.setBounds(-i9, -i10, i9, i10);
                float width = ((r0.getWidth() - r0.getPaddingLeft()) - r0.getPaddingRight()) / max;
                int save = canvas.save();
                canvas.translate(r0.getPaddingLeft(), r0.getHeight() / 2);
                for (int i11 = 0; i11 <= max; i11++) {
                    this.f21798f.draw(canvas);
                    canvas.translate(width, 0.0f);
                }
                canvas.restoreToCount(save);
            }
        }
    }
}
