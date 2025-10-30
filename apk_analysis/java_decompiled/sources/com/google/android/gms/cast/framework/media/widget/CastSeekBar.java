package com.google.android.gms.cast.framework.media.widget;

import K5.t;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import co.notix.R;
import java.util.ArrayList;
import u4.f;
import x4.C2177a;

/* loaded from: classes.dex */
public class CastSeekBar extends View {
    public static final /* synthetic */ int j = 0;

    /* renamed from: a, reason: collision with root package name */
    public final C2177a f14642a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f14643b;

    /* renamed from: c, reason: collision with root package name */
    public final float f14644c;

    /* renamed from: d, reason: collision with root package name */
    public final float f14645d;

    /* renamed from: e, reason: collision with root package name */
    public final float f14646e;

    /* renamed from: f, reason: collision with root package name */
    public final Paint f14647f;

    /* renamed from: g, reason: collision with root package name */
    public final int f14648g;

    /* renamed from: h, reason: collision with root package name */
    public final int f14649h;

    /* renamed from: i, reason: collision with root package name */
    public final int f14650i;

    /* JADX WARN: Type inference failed for: r7v13, types: [x4.a, java.lang.Object] */
    public CastSeekBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.f14643b = new ArrayList();
        setAccessibilityDelegate(new t(1, this));
        Paint paint = new Paint(1);
        this.f14647f = paint;
        paint.setStyle(Paint.Style.FILL);
        this.f14644c = context.getResources().getDimension(R.dimen.cast_seek_bar_minimum_width);
        this.f14645d = context.getResources().getDimension(R.dimen.cast_seek_bar_minimum_height);
        this.f14646e = context.getResources().getDimension(R.dimen.cast_seek_bar_progress_height) / 2.0f;
        context.getResources().getDimension(R.dimen.cast_seek_bar_thumb_size);
        context.getResources().getDimension(R.dimen.cast_seek_bar_ad_break_minimum_width);
        this.f14642a = new Object();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(null, f.f23685a, R.attr.castExpandedControllerStyle, R.style.CastExpandedController);
        int resourceId = obtainStyledAttributes.getResourceId(18, 0);
        int resourceId2 = obtainStyledAttributes.getResourceId(20, 0);
        int resourceId3 = obtainStyledAttributes.getResourceId(23, 0);
        int resourceId4 = obtainStyledAttributes.getResourceId(0, 0);
        this.f14648g = context.getResources().getColor(resourceId);
        context.getResources().getColor(resourceId2);
        this.f14649h = context.getResources().getColor(resourceId3);
        this.f14650i = context.getResources().getColor(resourceId4);
        obtainStyledAttributes.recycle();
    }

    public final void a(Canvas canvas, int i9, int i10, int i11, int i12) {
        Paint paint = this.f14647f;
        paint.setColor(i12);
        float f9 = 1;
        float f10 = i11;
        float f11 = this.f14646e;
        canvas.drawRect((i9 / f9) * f10, -f11, (i10 / f9) * f10, f11, paint);
    }

    public int getMaxProgress() {
        this.f14642a.getClass();
        return 1;
    }

    public int getProgress() {
        this.f14642a.getClass();
        return 0;
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        CastSeekBar castSeekBar;
        Canvas canvas2;
        int i9;
        int i10;
        int save = canvas.save();
        canvas.translate(getPaddingLeft(), getPaddingTop());
        int measuredWidth = (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
        int measuredHeight = (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom();
        int progress = getProgress();
        int save2 = canvas.save();
        canvas.translate(0.0f, measuredHeight / 2);
        this.f14642a.getClass();
        int i11 = 0;
        int max = Math.max(0, 0);
        if (max > 0) {
            i9 = max;
            castSeekBar = this;
            canvas2 = canvas;
            castSeekBar.a(canvas2, 0, i9, measuredWidth, this.f14649h);
        } else {
            castSeekBar = this;
            canvas2 = canvas;
            i9 = max;
        }
        if (progress > i9) {
            castSeekBar.a(canvas2, i9, progress, measuredWidth, castSeekBar.f14648g);
            i10 = progress;
        } else {
            i10 = progress;
        }
        if (1 > i10) {
            castSeekBar.a(canvas2, i10, 1, measuredWidth, castSeekBar.f14649h);
        }
        canvas2.restoreToCount(save2);
        ArrayList arrayList = castSeekBar.f14643b;
        if (arrayList != null && !arrayList.isEmpty()) {
            castSeekBar.f14647f.setColor(castSeekBar.f14650i);
            getMeasuredWidth();
            getPaddingLeft();
            getPaddingRight();
            int measuredHeight2 = (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom();
            int save3 = canvas2.save();
            canvas2.translate(0.0f, measuredHeight2 / 2);
            int size = arrayList.size();
            while (i11 < size) {
                Object obj = arrayList.get(i11);
                i11++;
                if (obj != null) {
                    throw new ClassCastException();
                }
            }
            canvas2.restoreToCount(save3);
        }
        isEnabled();
        canvas2.restoreToCount(save);
    }

    @Override // android.view.View
    public final synchronized void onMeasure(int i9, int i10) {
        float paddingLeft = getPaddingLeft();
        setMeasuredDimension(View.resolveSizeAndState((int) (this.f14644c + paddingLeft + getPaddingRight()), i9, 0), View.resolveSizeAndState((int) (this.f14645d + getPaddingTop() + getPaddingBottom()), i10, 0));
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (isEnabled()) {
            this.f14642a.getClass();
            return false;
        }
        return false;
    }
}
