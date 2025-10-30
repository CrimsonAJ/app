package Q2;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;

/* loaded from: classes.dex */
public final class N {

    /* renamed from: A, reason: collision with root package name */
    public int f6160A;

    /* renamed from: B, reason: collision with root package name */
    public int f6161B;

    /* renamed from: C, reason: collision with root package name */
    public int f6162C;

    /* renamed from: D, reason: collision with root package name */
    public int f6163D;

    /* renamed from: E, reason: collision with root package name */
    public StaticLayout f6164E;

    /* renamed from: F, reason: collision with root package name */
    public StaticLayout f6165F;

    /* renamed from: G, reason: collision with root package name */
    public int f6166G;

    /* renamed from: H, reason: collision with root package name */
    public int f6167H;

    /* renamed from: I, reason: collision with root package name */
    public int f6168I;

    /* renamed from: J, reason: collision with root package name */
    public Rect f6169J;

    /* renamed from: a, reason: collision with root package name */
    public final float f6170a;

    /* renamed from: b, reason: collision with root package name */
    public final float f6171b;

    /* renamed from: c, reason: collision with root package name */
    public final float f6172c;

    /* renamed from: d, reason: collision with root package name */
    public final float f6173d;

    /* renamed from: e, reason: collision with root package name */
    public final float f6174e;

    /* renamed from: f, reason: collision with root package name */
    public final TextPaint f6175f;

    /* renamed from: g, reason: collision with root package name */
    public final Paint f6176g;

    /* renamed from: h, reason: collision with root package name */
    public final Paint f6177h;

    /* renamed from: i, reason: collision with root package name */
    public CharSequence f6178i;
    public Layout.Alignment j;

    /* renamed from: k, reason: collision with root package name */
    public Bitmap f6179k;

    /* renamed from: l, reason: collision with root package name */
    public float f6180l;

    /* renamed from: m, reason: collision with root package name */
    public int f6181m;

    /* renamed from: n, reason: collision with root package name */
    public int f6182n;

    /* renamed from: o, reason: collision with root package name */
    public float f6183o;

    /* renamed from: p, reason: collision with root package name */
    public int f6184p;

    /* renamed from: q, reason: collision with root package name */
    public float f6185q;

    /* renamed from: r, reason: collision with root package name */
    public float f6186r;

    /* renamed from: s, reason: collision with root package name */
    public int f6187s;

    /* renamed from: t, reason: collision with root package name */
    public int f6188t;

    /* renamed from: u, reason: collision with root package name */
    public int f6189u;

    /* renamed from: v, reason: collision with root package name */
    public int f6190v;

    /* renamed from: w, reason: collision with root package name */
    public int f6191w;

    /* renamed from: x, reason: collision with root package name */
    public float f6192x;

    /* renamed from: y, reason: collision with root package name */
    public float f6193y;

    /* renamed from: z, reason: collision with root package name */
    public float f6194z;

    public N(Context context) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(null, new int[]{R.attr.lineSpacingExtra, R.attr.lineSpacingMultiplier}, 0, 0);
        this.f6174e = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        this.f6173d = obtainStyledAttributes.getFloat(1, 1.0f);
        obtainStyledAttributes.recycle();
        float round = Math.round((context.getResources().getDisplayMetrics().densityDpi * 2.0f) / 160.0f);
        this.f6170a = round;
        this.f6171b = round;
        this.f6172c = round;
        TextPaint textPaint = new TextPaint();
        this.f6175f = textPaint;
        textPaint.setAntiAlias(true);
        textPaint.setSubpixelText(true);
        Paint paint = new Paint();
        this.f6176g = paint;
        paint.setAntiAlias(true);
        paint.setStyle(Paint.Style.FILL);
        Paint paint2 = new Paint();
        this.f6177h = paint2;
        paint2.setAntiAlias(true);
        paint2.setFilterBitmap(true);
    }

    public final void a(Canvas canvas, boolean z9) {
        Canvas canvas2;
        int i9;
        if (z9) {
            StaticLayout staticLayout = this.f6164E;
            StaticLayout staticLayout2 = this.f6165F;
            if (staticLayout != null && staticLayout2 != null) {
                int save = canvas.save();
                canvas.translate(this.f6166G, this.f6167H);
                if (Color.alpha(this.f6189u) > 0) {
                    Paint paint = this.f6176g;
                    paint.setColor(this.f6189u);
                    canvas2 = canvas;
                    canvas2.drawRect(-this.f6168I, 0.0f, staticLayout.getWidth() + this.f6168I, staticLayout.getHeight(), paint);
                } else {
                    canvas2 = canvas;
                }
                int i10 = this.f6191w;
                TextPaint textPaint = this.f6175f;
                boolean z10 = true;
                if (i10 == 1) {
                    textPaint.setStrokeJoin(Paint.Join.ROUND);
                    textPaint.setStrokeWidth(this.f6170a);
                    textPaint.setColor(this.f6190v);
                    textPaint.setStyle(Paint.Style.FILL_AND_STROKE);
                    staticLayout2.draw(canvas2);
                } else {
                    float f9 = this.f6171b;
                    if (i10 == 2) {
                        float f10 = this.f6172c;
                        textPaint.setShadowLayer(f9, f10, f10, this.f6190v);
                    } else if (i10 == 3 || i10 == 4) {
                        if (i10 != 3) {
                            z10 = false;
                        }
                        int i11 = -1;
                        if (z10) {
                            i9 = -1;
                        } else {
                            i9 = this.f6190v;
                        }
                        if (z10) {
                            i11 = this.f6190v;
                        }
                        float f11 = f9 / 2.0f;
                        textPaint.setColor(this.f6187s);
                        textPaint.setStyle(Paint.Style.FILL);
                        float f12 = -f11;
                        textPaint.setShadowLayer(f9, f12, f12, i9);
                        staticLayout2.draw(canvas2);
                        textPaint.setShadowLayer(f9, f11, f11, i11);
                    }
                }
                textPaint.setColor(this.f6187s);
                textPaint.setStyle(Paint.Style.FILL);
                staticLayout.draw(canvas2);
                textPaint.setShadowLayer(0.0f, 0.0f, 0.0f, 0);
                canvas2.restoreToCount(save);
                return;
            }
            return;
        }
        this.f6169J.getClass();
        this.f6179k.getClass();
        canvas.drawBitmap(this.f6179k, (Rect) null, this.f6169J, this.f6177h);
    }
}
