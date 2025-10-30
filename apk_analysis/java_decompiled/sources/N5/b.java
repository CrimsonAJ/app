package N5;

import C5.e;
import F5.f;
import F5.h;
import F5.i;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.text.TextPaint;
import w5.l;
import w5.m;

/* loaded from: classes.dex */
public final class b extends h implements l {

    /* renamed from: A, reason: collision with root package name */
    public final Paint.FontMetrics f5215A;

    /* renamed from: B, reason: collision with root package name */
    public final m f5216B;

    /* renamed from: C, reason: collision with root package name */
    public final a f5217C;

    /* renamed from: D, reason: collision with root package name */
    public final Rect f5218D;

    /* renamed from: X, reason: collision with root package name */
    public int f5219X;
    public int Y;

    /* renamed from: Z, reason: collision with root package name */
    public int f5220Z;

    /* renamed from: f0, reason: collision with root package name */
    public int f5221f0;

    /* renamed from: g0, reason: collision with root package name */
    public boolean f5222g0;

    /* renamed from: h0, reason: collision with root package name */
    public int f5223h0;

    /* renamed from: i0, reason: collision with root package name */
    public int f5224i0;

    /* renamed from: j0, reason: collision with root package name */
    public float f5225j0;

    /* renamed from: k0, reason: collision with root package name */
    public float f5226k0;

    /* renamed from: l0, reason: collision with root package name */
    public float f5227l0;

    /* renamed from: m0, reason: collision with root package name */
    public float f5228m0;

    /* renamed from: y, reason: collision with root package name */
    public CharSequence f5229y;

    /* renamed from: z, reason: collision with root package name */
    public final Context f5230z;

    public b(Context context, int i9) {
        super(context, null, 0, i9);
        this.f5215A = new Paint.FontMetrics();
        m mVar = new m(this);
        this.f5216B = mVar;
        this.f5217C = new a(0, this);
        this.f5218D = new Rect();
        this.f5225j0 = 1.0f;
        this.f5226k0 = 1.0f;
        this.f5227l0 = 0.5f;
        this.f5228m0 = 1.0f;
        this.f5230z = context;
        TextPaint textPaint = mVar.f24305a;
        textPaint.density = context.getResources().getDisplayMetrics().density;
        textPaint.setTextAlign(Paint.Align.CENTER);
    }

    @Override // F5.h, android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Canvas canvas2;
        canvas.save();
        float q9 = q();
        float f9 = (float) (-((Math.sqrt(2.0d) * this.f5223h0) - this.f5223h0));
        canvas.scale(this.f5225j0, this.f5226k0, (getBounds().width() * 0.5f) + getBounds().left, (getBounds().height() * this.f5227l0) + getBounds().top);
        canvas.translate(q9, f9);
        super.draw(canvas);
        if (this.f5229y == null) {
            canvas2 = canvas;
        } else {
            float centerY = getBounds().centerY();
            m mVar = this.f5216B;
            TextPaint textPaint = mVar.f24305a;
            Paint.FontMetrics fontMetrics = this.f5215A;
            textPaint.getFontMetrics(fontMetrics);
            int i9 = (int) (centerY - ((fontMetrics.descent + fontMetrics.ascent) / 2.0f));
            e eVar = mVar.f24311g;
            TextPaint textPaint2 = mVar.f24305a;
            if (eVar != null) {
                textPaint2.drawableState = getState();
                mVar.f24311g.e(this.f5230z, textPaint2, mVar.f24306b);
                textPaint2.setAlpha((int) (this.f5228m0 * 255.0f));
            }
            CharSequence charSequence = this.f5229y;
            canvas2 = canvas;
            canvas2.drawText(charSequence, 0, charSequence.length(), r0.centerX(), i9, textPaint2);
        }
        canvas2.restore();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return (int) Math.max(this.f5216B.f24305a.getTextSize(), this.f5220Z);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        float a5;
        float f9 = this.f5219X * 2;
        CharSequence charSequence = this.f5229y;
        if (charSequence == null) {
            a5 = 0.0f;
        } else {
            a5 = this.f5216B.a(charSequence.toString());
        }
        return (int) Math.max(f9 + a5, this.Y);
    }

    @Override // F5.h, android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        if (this.f5222g0) {
            F5.l e8 = this.f2483a.f2466a.e();
            e8.f2517k = r();
            setShapeAppearanceModel(e8.a());
        }
    }

    public final float q() {
        int i9;
        Rect rect = this.f5218D;
        if (((rect.right - getBounds().right) - this.f5224i0) - this.f5221f0 < 0) {
            i9 = ((rect.right - getBounds().right) - this.f5224i0) - this.f5221f0;
        } else if (((rect.left - getBounds().left) - this.f5224i0) + this.f5221f0 > 0) {
            i9 = ((rect.left - getBounds().left) - this.f5224i0) + this.f5221f0;
        } else {
            return 0.0f;
        }
        return i9;
    }

    public final i r() {
        float f9 = -q();
        float width = ((float) (getBounds().width() - (Math.sqrt(2.0d) * this.f5223h0))) / 2.0f;
        return new i(new f(this.f5223h0), Math.min(Math.max(f9, -width), width));
    }
}
