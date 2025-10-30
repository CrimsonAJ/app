package com.anilab.android.ui.views;

import G.l;
import K5.i;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.LinearInterpolator;
import co.notix.R;
import kotlin.jvm.internal.h;
import s8.n;

/* loaded from: classes.dex */
public final class FreakLoading extends View {

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ int f13853e = 0;

    /* renamed from: a, reason: collision with root package name */
    public final Paint f13854a;

    /* renamed from: b, reason: collision with root package name */
    public final float f13855b;

    /* renamed from: c, reason: collision with root package name */
    public final Bitmap f13856c;

    /* renamed from: d, reason: collision with root package name */
    public float f13857d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FreakLoading(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        Bitmap bitmap;
        h.e(context, "context");
        this.f13854a = new Paint(1);
        this.f13855b = getResources().getDimensionPixelSize(R.dimen.dp_30);
        Resources resources = getResources();
        Resources.Theme theme = context.getTheme();
        ThreadLocal threadLocal = l.f2623a;
        Drawable drawable = resources.getDrawable(R.drawable.ic_loading_splash, theme);
        if (drawable != null) {
            bitmap = n.z(drawable, getResources().getDimensionPixelSize(R.dimen.dp_60), getResources().getDimensionPixelSize(R.dimen.dp_60), 4);
        } else {
            bitmap = null;
        }
        this.f13856c = bitmap;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 359.0f);
        ofFloat.setDuration(1000L);
        ofFloat.setInterpolator(new LinearInterpolator());
        ofFloat.setRepeatCount(-1);
        ofFloat.addUpdateListener(new i(2, this));
        ofFloat.start();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        h.e(canvas, "canvas");
        Bitmap bitmap = this.f13856c;
        if (bitmap == null) {
            return;
        }
        float f9 = this.f13857d;
        float f10 = this.f13855b;
        canvas.rotate(f9, f10, f10);
        canvas.drawBitmap(bitmap, 0.0f, 0.0f, this.f13854a);
    }
}
