package com.google.android.material.imageview;

import E.d;
import F5.h;
import F5.m;
import F5.n;
import F5.o;
import F5.x;
import M5.a;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatImageView;
import co.notix.R;
import com.google.android.gms.internal.measurement.D1;
import g5.AbstractC1254a;
import v5.C2109a;

/* loaded from: classes.dex */
public class ShapeableImageView extends AppCompatImageView implements x {

    /* renamed from: d, reason: collision with root package name */
    public final o f16055d;

    /* renamed from: e, reason: collision with root package name */
    public final RectF f16056e;

    /* renamed from: f, reason: collision with root package name */
    public final RectF f16057f;

    /* renamed from: g, reason: collision with root package name */
    public final Paint f16058g;

    /* renamed from: h, reason: collision with root package name */
    public final Paint f16059h;

    /* renamed from: i, reason: collision with root package name */
    public final Path f16060i;
    public ColorStateList j;

    /* renamed from: k, reason: collision with root package name */
    public h f16061k;

    /* renamed from: l, reason: collision with root package name */
    public m f16062l;

    /* renamed from: m, reason: collision with root package name */
    public float f16063m;

    /* renamed from: n, reason: collision with root package name */
    public final Path f16064n;

    /* renamed from: o, reason: collision with root package name */
    public final int f16065o;

    /* renamed from: p, reason: collision with root package name */
    public final int f16066p;

    /* renamed from: q, reason: collision with root package name */
    public final int f16067q;

    /* renamed from: r, reason: collision with root package name */
    public final int f16068r;

    /* renamed from: s, reason: collision with root package name */
    public final int f16069s;

    /* renamed from: t, reason: collision with root package name */
    public final int f16070t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f16071u;

    public ShapeableImageView(Context context, AttributeSet attributeSet) {
        super(a.a(context, attributeSet, 0, R.style.Widget_MaterialComponents_ShapeableImageView), attributeSet, 0);
        this.f16055d = n.f2530a;
        this.f16060i = new Path();
        this.f16071u = false;
        Context context2 = getContext();
        Paint paint = new Paint();
        this.f16059h = paint;
        paint.setAntiAlias(true);
        paint.setColor(-1);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        this.f16056e = new RectF();
        this.f16057f = new RectF();
        this.f16064n = new Path();
        TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, AbstractC1254a.f17725J, 0, R.style.Widget_MaterialComponents_ShapeableImageView);
        setLayerType(2, null);
        this.j = D1.p(context2, obtainStyledAttributes, 9);
        this.f16063m = obtainStyledAttributes.getDimensionPixelSize(10, 0);
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        this.f16065o = dimensionPixelSize;
        this.f16066p = dimensionPixelSize;
        this.f16067q = dimensionPixelSize;
        this.f16068r = dimensionPixelSize;
        this.f16065o = obtainStyledAttributes.getDimensionPixelSize(3, dimensionPixelSize);
        this.f16066p = obtainStyledAttributes.getDimensionPixelSize(6, dimensionPixelSize);
        this.f16067q = obtainStyledAttributes.getDimensionPixelSize(4, dimensionPixelSize);
        this.f16068r = obtainStyledAttributes.getDimensionPixelSize(1, dimensionPixelSize);
        this.f16069s = obtainStyledAttributes.getDimensionPixelSize(5, Integer.MIN_VALUE);
        this.f16070t = obtainStyledAttributes.getDimensionPixelSize(2, Integer.MIN_VALUE);
        obtainStyledAttributes.recycle();
        Paint paint2 = new Paint();
        this.f16058g = paint2;
        paint2.setStyle(Paint.Style.STROKE);
        paint2.setAntiAlias(true);
        this.f16062l = m.b(context2, attributeSet, 0, R.style.Widget_MaterialComponents_ShapeableImageView).a();
        setOutlineProvider(new C2109a(this));
    }

    public final boolean a() {
        if (getLayoutDirection() == 1) {
            return true;
        }
        return false;
    }

    public final void d(int i9, int i10) {
        RectF rectF = this.f16056e;
        rectF.set(getPaddingLeft(), getPaddingTop(), i9 - getPaddingRight(), i10 - getPaddingBottom());
        m mVar = this.f16062l;
        Path path = this.f16060i;
        this.f16055d.b(mVar, 1.0f, rectF, null, path);
        Path path2 = this.f16064n;
        path2.rewind();
        path2.addPath(path);
        RectF rectF2 = this.f16057f;
        rectF2.set(0.0f, 0.0f, i9, i10);
        path2.addRect(rectF2, Path.Direction.CCW);
    }

    public int getContentPaddingBottom() {
        return this.f16068r;
    }

    public final int getContentPaddingEnd() {
        int i9 = this.f16070t;
        if (i9 != Integer.MIN_VALUE) {
            return i9;
        }
        if (a()) {
            return this.f16065o;
        }
        return this.f16067q;
    }

    public int getContentPaddingLeft() {
        int i9;
        int i10;
        if (this.f16069s != Integer.MIN_VALUE || this.f16070t != Integer.MIN_VALUE) {
            if (a() && (i10 = this.f16070t) != Integer.MIN_VALUE) {
                return i10;
            }
            if (!a() && (i9 = this.f16069s) != Integer.MIN_VALUE) {
                return i9;
            }
        }
        return this.f16065o;
    }

    public int getContentPaddingRight() {
        int i9;
        int i10;
        if (this.f16069s != Integer.MIN_VALUE || this.f16070t != Integer.MIN_VALUE) {
            if (a() && (i10 = this.f16069s) != Integer.MIN_VALUE) {
                return i10;
            }
            if (!a() && (i9 = this.f16070t) != Integer.MIN_VALUE) {
                return i9;
            }
        }
        return this.f16067q;
    }

    public final int getContentPaddingStart() {
        int i9 = this.f16069s;
        if (i9 != Integer.MIN_VALUE) {
            return i9;
        }
        if (a()) {
            return this.f16067q;
        }
        return this.f16065o;
    }

    public int getContentPaddingTop() {
        return this.f16066p;
    }

    @Override // android.view.View
    public int getPaddingBottom() {
        return super.getPaddingBottom() - getContentPaddingBottom();
    }

    @Override // android.view.View
    public int getPaddingEnd() {
        return super.getPaddingEnd() - getContentPaddingEnd();
    }

    @Override // android.view.View
    public int getPaddingLeft() {
        return super.getPaddingLeft() - getContentPaddingLeft();
    }

    @Override // android.view.View
    public int getPaddingRight() {
        return super.getPaddingRight() - getContentPaddingRight();
    }

    @Override // android.view.View
    public int getPaddingStart() {
        return super.getPaddingStart() - getContentPaddingStart();
    }

    @Override // android.view.View
    public int getPaddingTop() {
        return super.getPaddingTop() - getContentPaddingTop();
    }

    public m getShapeAppearanceModel() {
        return this.f16062l;
    }

    public ColorStateList getStrokeColor() {
        return this.j;
    }

    public float getStrokeWidth() {
        return this.f16063m;
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.drawPath(this.f16064n, this.f16059h);
        if (this.j != null) {
            Paint paint = this.f16058g;
            paint.setStrokeWidth(this.f16063m);
            int colorForState = this.j.getColorForState(getDrawableState(), this.j.getDefaultColor());
            if (this.f16063m > 0.0f && colorForState != 0) {
                paint.setColor(colorForState);
                canvas.drawPath(this.f16060i, paint);
            }
        }
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onMeasure(int i9, int i10) {
        super.onMeasure(i9, i10);
        if (this.f16071u || !isLayoutDirectionResolved()) {
            return;
        }
        this.f16071u = true;
        if (!isPaddingRelative() && this.f16069s == Integer.MIN_VALUE && this.f16070t == Integer.MIN_VALUE) {
            setPadding(super.getPaddingLeft(), super.getPaddingTop(), super.getPaddingRight(), super.getPaddingBottom());
        } else {
            setPaddingRelative(super.getPaddingStart(), super.getPaddingTop(), super.getPaddingEnd(), super.getPaddingBottom());
        }
    }

    @Override // android.view.View
    public final void onSizeChanged(int i9, int i10, int i11, int i12) {
        super.onSizeChanged(i9, i10, i11, i12);
        d(i9, i10);
    }

    @Override // android.view.View
    public final void setPadding(int i9, int i10, int i11, int i12) {
        super.setPadding(getContentPaddingLeft() + i9, getContentPaddingTop() + i10, getContentPaddingRight() + i11, getContentPaddingBottom() + i12);
    }

    @Override // android.view.View
    public final void setPaddingRelative(int i9, int i10, int i11, int i12) {
        super.setPaddingRelative(getContentPaddingStart() + i9, getContentPaddingTop() + i10, getContentPaddingEnd() + i11, getContentPaddingBottom() + i12);
    }

    @Override // F5.x
    public void setShapeAppearanceModel(m mVar) {
        this.f16062l = mVar;
        h hVar = this.f16061k;
        if (hVar != null) {
            hVar.setShapeAppearanceModel(mVar);
        }
        d(getWidth(), getHeight());
        invalidate();
        invalidateOutline();
    }

    public void setStrokeColor(ColorStateList colorStateList) {
        this.j = colorStateList;
        invalidate();
    }

    public void setStrokeColorResource(int i9) {
        setStrokeColor(d.c(getContext(), i9));
    }

    public void setStrokeWidth(float f9) {
        if (this.f16063m != f9) {
            this.f16063m = f9;
            invalidate();
        }
    }

    public void setStrokeWidthResource(int i9) {
        setStrokeWidth(getResources().getDimensionPixelSize(i9));
    }
}
