package F5;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Looper;
import android.util.AttributeSet;
import android.util.Log;
import b7.C0701c;
import java.util.BitSet;
import java.util.Objects;
import t5.AbstractC2015a;
import u5.C2081a;

/* loaded from: classes.dex */
public class h extends Drawable implements x {

    /* renamed from: x, reason: collision with root package name */
    public static final Paint f2482x;

    /* renamed from: a, reason: collision with root package name */
    public g f2483a;

    /* renamed from: b, reason: collision with root package name */
    public final v[] f2484b;

    /* renamed from: c, reason: collision with root package name */
    public final v[] f2485c;

    /* renamed from: d, reason: collision with root package name */
    public final BitSet f2486d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f2487e;

    /* renamed from: f, reason: collision with root package name */
    public final Matrix f2488f;

    /* renamed from: g, reason: collision with root package name */
    public final Path f2489g;

    /* renamed from: h, reason: collision with root package name */
    public final Path f2490h;

    /* renamed from: i, reason: collision with root package name */
    public final RectF f2491i;
    public final RectF j;

    /* renamed from: k, reason: collision with root package name */
    public final Region f2492k;

    /* renamed from: l, reason: collision with root package name */
    public final Region f2493l;

    /* renamed from: m, reason: collision with root package name */
    public m f2494m;

    /* renamed from: n, reason: collision with root package name */
    public final Paint f2495n;

    /* renamed from: o, reason: collision with root package name */
    public final Paint f2496o;

    /* renamed from: p, reason: collision with root package name */
    public final E5.a f2497p;

    /* renamed from: q, reason: collision with root package name */
    public final C0701c f2498q;

    /* renamed from: r, reason: collision with root package name */
    public final o f2499r;

    /* renamed from: s, reason: collision with root package name */
    public PorterDuffColorFilter f2500s;

    /* renamed from: t, reason: collision with root package name */
    public PorterDuffColorFilter f2501t;

    /* renamed from: u, reason: collision with root package name */
    public int f2502u;

    /* renamed from: v, reason: collision with root package name */
    public final RectF f2503v;

    /* renamed from: w, reason: collision with root package name */
    public final boolean f2504w;

    static {
        Paint paint = new Paint(1);
        f2482x = paint;
        paint.setColor(-1);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
    }

    public h() {
        this(new m());
    }

    public void a() {
        invalidateSelf();
    }

    public final void b(RectF rectF, Path path) {
        g gVar = this.f2483a;
        this.f2499r.b(gVar.f2466a, gVar.f2474i, rectF, this.f2498q, path);
        if (this.f2483a.f2473h != 1.0f) {
            Matrix matrix = this.f2488f;
            matrix.reset();
            float f9 = this.f2483a.f2473h;
            matrix.setScale(f9, f9, rectF.width() / 2.0f, rectF.height() / 2.0f);
            path.transform(matrix);
        }
        path.computeBounds(this.f2503v, true);
    }

    public final int c(int i9) {
        g gVar = this.f2483a;
        float f9 = gVar.f2477m + 0.0f + gVar.f2476l;
        C2081a c2081a = gVar.f2467b;
        if (c2081a != null) {
            return c2081a.a(i9, f9);
        }
        return i9;
    }

    public final void d(Canvas canvas) {
        if (this.f2486d.cardinality() > 0) {
            Log.w("h", "Compatibility shadow requested but can't be drawn for all operations in this shape.");
        }
        int i9 = this.f2483a.f2480p;
        Path path = this.f2489g;
        E5.a aVar = this.f2497p;
        if (i9 != 0) {
            canvas.drawPath(path, aVar.f1947a);
        }
        for (int i10 = 0; i10 < 4; i10++) {
            v vVar = this.f2484b[i10];
            int i11 = this.f2483a.f2479o;
            Matrix matrix = v.f2558b;
            vVar.a(matrix, aVar, i11, canvas);
            this.f2485c[i10].a(matrix, aVar, this.f2483a.f2479o, canvas);
        }
        if (this.f2504w) {
            double d9 = 0;
            int sin = (int) (Math.sin(Math.toRadians(d9)) * this.f2483a.f2480p);
            int cos = (int) (Math.cos(Math.toRadians(d9)) * this.f2483a.f2480p);
            canvas.translate(-sin, -cos);
            canvas.drawPath(path, f2482x);
            canvas.translate(sin, cos);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x00f3, code lost:
    
        if (r9 < 29) goto L40;
     */
    @Override // android.graphics.drawable.Drawable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void draw(android.graphics.Canvas r20) {
        /*
            Method dump skipped, instructions count: 457
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: F5.h.draw(android.graphics.Canvas):void");
    }

    public final void e(Canvas canvas, Paint paint, Path path, m mVar, RectF rectF) {
        if (mVar.d(rectF)) {
            float a5 = mVar.f2524f.a(rectF) * this.f2483a.f2474i;
            canvas.drawRoundRect(rectF, a5, a5, paint);
        } else {
            canvas.drawPath(path, paint);
        }
    }

    public void f(Canvas canvas) {
        float f9;
        Paint paint = this.f2496o;
        Path path = this.f2490h;
        m mVar = this.f2494m;
        RectF rectF = this.j;
        rectF.set(g());
        if (h()) {
            f9 = paint.getStrokeWidth() / 2.0f;
        } else {
            f9 = 0.0f;
        }
        rectF.inset(f9, f9);
        e(canvas, paint, path, mVar, rectF);
    }

    public final RectF g() {
        RectF rectF = this.f2491i;
        rectF.set(getBounds());
        return rectF;
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.f2483a.f2475k;
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        return this.f2483a;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public void getOutline(Outline outline) {
        g gVar = this.f2483a;
        if (gVar.f2478n != 2) {
            if (gVar.f2466a.d(g())) {
                outline.setRoundRect(getBounds(), this.f2483a.f2466a.f2523e.a(g()) * this.f2483a.f2474i);
                return;
            }
            RectF g9 = g();
            Path path = this.f2489g;
            b(g9, path);
            int i9 = Build.VERSION.SDK_INT;
            if (i9 >= 30) {
                t5.b.a(outline, path);
                return;
            }
            if (i9 >= 29) {
                try {
                    AbstractC2015a.a(outline, path);
                } catch (IllegalArgumentException unused) {
                }
            } else if (path.isConvex()) {
                AbstractC2015a.a(outline, path);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean getPadding(Rect rect) {
        Rect rect2 = this.f2483a.f2472g;
        if (rect2 != null) {
            rect.set(rect2);
            return true;
        }
        return super.getPadding(rect);
    }

    @Override // android.graphics.drawable.Drawable
    public final Region getTransparentRegion() {
        Rect bounds = getBounds();
        Region region = this.f2492k;
        region.set(bounds);
        RectF g9 = g();
        Path path = this.f2489g;
        b(g9, path);
        Region region2 = this.f2493l;
        region2.setPath(path, region);
        region.op(region2, Region.Op.DIFFERENCE);
        return region;
    }

    public final boolean h() {
        Paint.Style style = this.f2483a.f2481q;
        if ((style == Paint.Style.FILL_AND_STROKE || style == Paint.Style.STROKE) && this.f2496o.getStrokeWidth() > 0.0f) {
            return true;
        }
        return false;
    }

    public final void i(Context context) {
        this.f2483a.f2467b = new C2081a(context);
        p();
    }

    @Override // android.graphics.drawable.Drawable
    public final void invalidateSelf() {
        this.f2487e = true;
        super.invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        if (!super.isStateful()) {
            ColorStateList colorStateList = this.f2483a.f2470e;
            if (colorStateList == null || !colorStateList.isStateful()) {
                this.f2483a.getClass();
                ColorStateList colorStateList2 = this.f2483a.f2469d;
                if (colorStateList2 == null || !colorStateList2.isStateful()) {
                    ColorStateList colorStateList3 = this.f2483a.f2468c;
                    if (colorStateList3 == null || !colorStateList3.isStateful()) {
                        return false;
                    }
                    return true;
                }
                return true;
            }
            return true;
        }
        return true;
    }

    public final void j(float f9) {
        g gVar = this.f2483a;
        if (gVar.f2477m != f9) {
            gVar.f2477m = f9;
            p();
        }
    }

    public final void k(ColorStateList colorStateList) {
        g gVar = this.f2483a;
        if (gVar.f2468c != colorStateList) {
            gVar.f2468c = colorStateList;
            onStateChange(getState());
        }
    }

    public final void l() {
        g gVar = this.f2483a;
        if (gVar.f2478n != 2) {
            gVar.f2478n = 2;
            super.invalidateSelf();
        }
    }

    public final void m(ColorStateList colorStateList) {
        g gVar = this.f2483a;
        if (gVar.f2469d != colorStateList) {
            gVar.f2469d = colorStateList;
            onStateChange(getState());
        }
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable mutate() {
        this.f2483a = new g(this.f2483a);
        return this;
    }

    public final boolean n(int[] iArr) {
        boolean z9;
        Paint paint;
        int color;
        int colorForState;
        Paint paint2;
        int color2;
        int colorForState2;
        if (this.f2483a.f2468c != null && color2 != (colorForState2 = this.f2483a.f2468c.getColorForState(iArr, (color2 = (paint2 = this.f2495n).getColor())))) {
            paint2.setColor(colorForState2);
            z9 = true;
        } else {
            z9 = false;
        }
        if (this.f2483a.f2469d != null && color != (colorForState = this.f2483a.f2469d.getColorForState(iArr, (color = (paint = this.f2496o).getColor())))) {
            paint.setColor(colorForState);
            return true;
        }
        return z9;
    }

    public final boolean o() {
        PorterDuffColorFilter porterDuffColorFilter;
        PorterDuffColorFilter porterDuffColorFilter2 = this.f2500s;
        PorterDuffColorFilter porterDuffColorFilter3 = this.f2501t;
        g gVar = this.f2483a;
        ColorStateList colorStateList = gVar.f2470e;
        PorterDuff.Mode mode = gVar.f2471f;
        Paint paint = this.f2495n;
        if (colorStateList != null && mode != null) {
            int c3 = c(colorStateList.getColorForState(getState(), 0));
            this.f2502u = c3;
            porterDuffColorFilter = new PorterDuffColorFilter(c3, mode);
        } else {
            int color = paint.getColor();
            int c9 = c(color);
            this.f2502u = c9;
            if (c9 != color) {
                porterDuffColorFilter = new PorterDuffColorFilter(c9, PorterDuff.Mode.SRC_IN);
            } else {
                porterDuffColorFilter = null;
            }
        }
        this.f2500s = porterDuffColorFilter;
        this.f2483a.getClass();
        this.f2501t = null;
        this.f2483a.getClass();
        if (!Objects.equals(porterDuffColorFilter2, this.f2500s) || !Objects.equals(porterDuffColorFilter3, this.f2501t)) {
            return true;
        }
        return false;
    }

    @Override // android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        this.f2487e = true;
        super.onBoundsChange(rect);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onStateChange(int[] iArr) {
        boolean z9;
        boolean n7 = n(iArr);
        boolean o9 = o();
        if (!n7 && !o9) {
            z9 = false;
        } else {
            z9 = true;
        }
        if (z9) {
            invalidateSelf();
        }
        return z9;
    }

    public final void p() {
        g gVar = this.f2483a;
        float f9 = gVar.f2477m + 0.0f;
        gVar.f2479o = (int) Math.ceil(0.75f * f9);
        this.f2483a.f2480p = (int) Math.ceil(f9 * 0.25f);
        o();
        super.invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i9) {
        g gVar = this.f2483a;
        if (gVar.f2475k != i9) {
            gVar.f2475k = i9;
            super.invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f2483a.getClass();
        super.invalidateSelf();
    }

    @Override // F5.x
    public final void setShapeAppearanceModel(m mVar) {
        this.f2483a.f2466a = mVar;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTint(int i9) {
        setTintList(ColorStateList.valueOf(i9));
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintList(ColorStateList colorStateList) {
        this.f2483a.f2470e = colorStateList;
        o();
        super.invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintMode(PorterDuff.Mode mode) {
        g gVar = this.f2483a;
        if (gVar.f2471f != mode) {
            gVar.f2471f = mode;
            o();
            super.invalidateSelf();
        }
    }

    public h(Context context, AttributeSet attributeSet, int i9, int i10) {
        this(m.b(context, attributeSet, i9, i10).a());
    }

    public h(m mVar) {
        this(new g(mVar));
    }

    public h(g gVar) {
        o oVar;
        this.f2484b = new v[4];
        this.f2485c = new v[4];
        this.f2486d = new BitSet(8);
        this.f2488f = new Matrix();
        this.f2489g = new Path();
        this.f2490h = new Path();
        this.f2491i = new RectF();
        this.j = new RectF();
        this.f2492k = new Region();
        this.f2493l = new Region();
        Paint paint = new Paint(1);
        this.f2495n = paint;
        Paint paint2 = new Paint(1);
        this.f2496o = paint2;
        this.f2497p = new E5.a();
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            oVar = n.f2530a;
        } else {
            oVar = new o();
        }
        this.f2499r = oVar;
        this.f2503v = new RectF();
        this.f2504w = true;
        this.f2483a = gVar;
        paint2.setStyle(Paint.Style.STROKE);
        paint.setStyle(Paint.Style.FILL);
        o();
        n(getState());
        this.f2498q = new C0701c(5, this);
    }
}
