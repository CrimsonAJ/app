package q5;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import com.google.android.material.chip.Chip;
import h5.C1283c;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import w5.l;
import w5.m;
import w5.p;

/* loaded from: classes.dex */
public final class e extends F5.h implements Drawable.Callback, l {

    /* renamed from: e1, reason: collision with root package name */
    public static final int[] f22367e1 = {R.attr.state_enabled};

    /* renamed from: f1, reason: collision with root package name */
    public static final ShapeDrawable f22368f1 = new ShapeDrawable(new OvalShape());

    /* renamed from: A, reason: collision with root package name */
    public float f22369A;

    /* renamed from: A0, reason: collision with root package name */
    public float f22370A0;

    /* renamed from: B, reason: collision with root package name */
    public float f22371B;

    /* renamed from: B0, reason: collision with root package name */
    public float f22372B0;

    /* renamed from: C, reason: collision with root package name */
    public ColorStateList f22373C;

    /* renamed from: C0, reason: collision with root package name */
    public float f22374C0;

    /* renamed from: D, reason: collision with root package name */
    public float f22375D;

    /* renamed from: D0, reason: collision with root package name */
    public final Context f22376D0;

    /* renamed from: E0, reason: collision with root package name */
    public final Paint f22377E0;

    /* renamed from: F0, reason: collision with root package name */
    public final Paint.FontMetrics f22378F0;

    /* renamed from: G0, reason: collision with root package name */
    public final RectF f22379G0;

    /* renamed from: H0, reason: collision with root package name */
    public final PointF f22380H0;

    /* renamed from: I0, reason: collision with root package name */
    public final Path f22381I0;

    /* renamed from: J0, reason: collision with root package name */
    public final m f22382J0;

    /* renamed from: K0, reason: collision with root package name */
    public int f22383K0;

    /* renamed from: L0, reason: collision with root package name */
    public int f22384L0;

    /* renamed from: M0, reason: collision with root package name */
    public int f22385M0;

    /* renamed from: N0, reason: collision with root package name */
    public int f22386N0;

    /* renamed from: O0, reason: collision with root package name */
    public int f22387O0;

    /* renamed from: P0, reason: collision with root package name */
    public int f22388P0;

    /* renamed from: Q0, reason: collision with root package name */
    public boolean f22389Q0;

    /* renamed from: R0, reason: collision with root package name */
    public int f22390R0;

    /* renamed from: S0, reason: collision with root package name */
    public int f22391S0;

    /* renamed from: T0, reason: collision with root package name */
    public ColorFilter f22392T0;

    /* renamed from: U0, reason: collision with root package name */
    public PorterDuffColorFilter f22393U0;

    /* renamed from: V0, reason: collision with root package name */
    public ColorStateList f22394V0;

    /* renamed from: W0, reason: collision with root package name */
    public PorterDuff.Mode f22395W0;

    /* renamed from: X, reason: collision with root package name */
    public ColorStateList f22396X;

    /* renamed from: X0, reason: collision with root package name */
    public int[] f22397X0;
    public CharSequence Y;

    /* renamed from: Y0, reason: collision with root package name */
    public ColorStateList f22398Y0;

    /* renamed from: Z, reason: collision with root package name */
    public boolean f22399Z;

    /* renamed from: Z0, reason: collision with root package name */
    public WeakReference f22400Z0;

    /* renamed from: a1, reason: collision with root package name */
    public TextUtils.TruncateAt f22401a1;

    /* renamed from: b1, reason: collision with root package name */
    public boolean f22402b1;

    /* renamed from: c1, reason: collision with root package name */
    public int f22403c1;

    /* renamed from: d1, reason: collision with root package name */
    public boolean f22404d1;

    /* renamed from: f0, reason: collision with root package name */
    public Drawable f22405f0;

    /* renamed from: g0, reason: collision with root package name */
    public ColorStateList f22406g0;

    /* renamed from: h0, reason: collision with root package name */
    public float f22407h0;

    /* renamed from: i0, reason: collision with root package name */
    public boolean f22408i0;

    /* renamed from: j0, reason: collision with root package name */
    public boolean f22409j0;

    /* renamed from: k0, reason: collision with root package name */
    public Drawable f22410k0;

    /* renamed from: l0, reason: collision with root package name */
    public RippleDrawable f22411l0;

    /* renamed from: m0, reason: collision with root package name */
    public ColorStateList f22412m0;

    /* renamed from: n0, reason: collision with root package name */
    public float f22413n0;

    /* renamed from: o0, reason: collision with root package name */
    public SpannableStringBuilder f22414o0;

    /* renamed from: p0, reason: collision with root package name */
    public boolean f22415p0;

    /* renamed from: q0, reason: collision with root package name */
    public boolean f22416q0;
    public Drawable r0;

    /* renamed from: s0, reason: collision with root package name */
    public ColorStateList f22417s0;

    /* renamed from: t0, reason: collision with root package name */
    public C1283c f22418t0;

    /* renamed from: u0, reason: collision with root package name */
    public C1283c f22419u0;

    /* renamed from: v0, reason: collision with root package name */
    public float f22420v0;

    /* renamed from: w0, reason: collision with root package name */
    public float f22421w0;

    /* renamed from: x0, reason: collision with root package name */
    public float f22422x0;

    /* renamed from: y, reason: collision with root package name */
    public ColorStateList f22423y;

    /* renamed from: y0, reason: collision with root package name */
    public float f22424y0;

    /* renamed from: z, reason: collision with root package name */
    public ColorStateList f22425z;

    /* renamed from: z0, reason: collision with root package name */
    public float f22426z0;

    public e(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, co.notix.R.attr.chipStyle, co.notix.R.style.Widget_MaterialComponents_Chip_Action);
        this.f22371B = -1.0f;
        this.f22377E0 = new Paint(1);
        this.f22378F0 = new Paint.FontMetrics();
        this.f22379G0 = new RectF();
        this.f22380H0 = new PointF();
        this.f22381I0 = new Path();
        this.f22391S0 = 255;
        this.f22395W0 = PorterDuff.Mode.SRC_IN;
        this.f22400Z0 = new WeakReference(null);
        i(context);
        this.f22376D0 = context;
        m mVar = new m(this);
        this.f22382J0 = mVar;
        this.Y = "";
        mVar.f24305a.density = context.getResources().getDisplayMetrics().density;
        int[] iArr = f22367e1;
        setState(iArr);
        if (!Arrays.equals(this.f22397X0, iArr)) {
            this.f22397X0 = iArr;
            if (V()) {
                y(getState(), iArr);
            }
        }
        this.f22402b1 = true;
        int[] iArr2 = D5.a.f1910a;
        f22368f1.setTint(-1);
    }

    public static void W(Drawable drawable) {
        if (drawable != null) {
            drawable.setCallback(null);
        }
    }

    public static boolean v(ColorStateList colorStateList) {
        if (colorStateList != null && colorStateList.isStateful()) {
            return true;
        }
        return false;
    }

    public static boolean w(Drawable drawable) {
        if (drawable != null && drawable.isStateful()) {
            return true;
        }
        return false;
    }

    public final void A(Drawable drawable) {
        if (this.r0 != drawable) {
            float s9 = s();
            this.r0 = drawable;
            float s10 = s();
            W(this.r0);
            q(this.r0);
            invalidateSelf();
            if (s9 != s10) {
                x();
            }
        }
    }

    public final void B(ColorStateList colorStateList) {
        Drawable drawable;
        if (this.f22417s0 != colorStateList) {
            this.f22417s0 = colorStateList;
            if (this.f22416q0 && (drawable = this.r0) != null && this.f22415p0) {
                drawable.setTintList(colorStateList);
            }
            onStateChange(getState());
        }
    }

    public final void C(boolean z9) {
        if (this.f22416q0 != z9) {
            boolean T8 = T();
            this.f22416q0 = z9;
            boolean T9 = T();
            if (T8 != T9) {
                if (T9) {
                    q(this.r0);
                } else {
                    W(this.r0);
                }
                invalidateSelf();
                x();
            }
        }
    }

    public final void D(float f9) {
        if (this.f22371B != f9) {
            this.f22371B = f9;
            F5.l e8 = this.f2483a.f2466a.e();
            e8.f2512e = new F5.a(f9);
            e8.f2513f = new F5.a(f9);
            e8.f2514g = new F5.a(f9);
            e8.f2515h = new F5.a(f9);
            setShapeAppearanceModel(e8.a());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void E(Drawable drawable) {
        Drawable drawable2;
        Drawable drawable3 = this.f22405f0;
        Drawable drawable4 = null;
        if (drawable3 != 0) {
            boolean z9 = drawable3 instanceof I.c;
            drawable2 = drawable3;
            if (z9) {
                drawable2 = null;
            }
        } else {
            drawable2 = null;
        }
        if (drawable2 != drawable) {
            float s9 = s();
            if (drawable != null) {
                drawable4 = drawable.mutate();
            }
            this.f22405f0 = drawable4;
            float s10 = s();
            W(drawable2);
            if (U()) {
                q(this.f22405f0);
            }
            invalidateSelf();
            if (s9 != s10) {
                x();
            }
        }
    }

    public final void F(float f9) {
        if (this.f22407h0 != f9) {
            float s9 = s();
            this.f22407h0 = f9;
            float s10 = s();
            invalidateSelf();
            if (s9 != s10) {
                x();
            }
        }
    }

    public final void G(ColorStateList colorStateList) {
        this.f22408i0 = true;
        if (this.f22406g0 != colorStateList) {
            this.f22406g0 = colorStateList;
            if (U()) {
                this.f22405f0.setTintList(colorStateList);
            }
            onStateChange(getState());
        }
    }

    public final void H(boolean z9) {
        if (this.f22399Z != z9) {
            boolean U8 = U();
            this.f22399Z = z9;
            boolean U9 = U();
            if (U8 != U9) {
                if (U9) {
                    q(this.f22405f0);
                } else {
                    W(this.f22405f0);
                }
                invalidateSelf();
                x();
            }
        }
    }

    public final void I(ColorStateList colorStateList) {
        if (this.f22373C != colorStateList) {
            this.f22373C = colorStateList;
            if (this.f22404d1) {
                m(colorStateList);
            }
            onStateChange(getState());
        }
    }

    public final void J(float f9) {
        if (this.f22375D != f9) {
            this.f22375D = f9;
            this.f22377E0.setStrokeWidth(f9);
            if (this.f22404d1) {
                this.f2483a.j = f9;
                invalidateSelf();
            }
            invalidateSelf();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:19:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x000e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void K(android.graphics.drawable.Drawable r6) {
        /*
            r5 = this;
            r0 = 0
            android.graphics.drawable.Drawable r1 = r5.f22410k0
            if (r1 == 0) goto Lb
            boolean r2 = r1 instanceof I.c
            if (r2 == 0) goto Lc
            I.c r1 = (I.c) r1
        Lb:
            r1 = r0
        Lc:
            if (r1 == r6) goto L49
            float r2 = r5.t()
            if (r6 == 0) goto L18
            android.graphics.drawable.Drawable r0 = r6.mutate()
        L18:
            r5.f22410k0 = r0
            int[] r6 = D5.a.f1910a
            android.graphics.drawable.RippleDrawable r6 = new android.graphics.drawable.RippleDrawable
            android.content.res.ColorStateList r0 = r5.f22396X
            android.content.res.ColorStateList r0 = D5.a.c(r0)
            android.graphics.drawable.Drawable r3 = r5.f22410k0
            android.graphics.drawable.ShapeDrawable r4 = q5.e.f22368f1
            r6.<init>(r0, r3, r4)
            r5.f22411l0 = r6
            float r6 = r5.t()
            W(r1)
            boolean r0 = r5.V()
            if (r0 == 0) goto L3f
            android.graphics.drawable.Drawable r0 = r5.f22410k0
            r5.q(r0)
        L3f:
            r5.invalidateSelf()
            int r6 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r6 == 0) goto L49
            r5.x()
        L49:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: q5.e.K(android.graphics.drawable.Drawable):void");
    }

    public final void L(float f9) {
        if (this.f22372B0 != f9) {
            this.f22372B0 = f9;
            invalidateSelf();
            if (V()) {
                x();
            }
        }
    }

    public final void M(float f9) {
        if (this.f22413n0 != f9) {
            this.f22413n0 = f9;
            invalidateSelf();
            if (V()) {
                x();
            }
        }
    }

    public final void N(float f9) {
        if (this.f22370A0 != f9) {
            this.f22370A0 = f9;
            invalidateSelf();
            if (V()) {
                x();
            }
        }
    }

    public final void O(ColorStateList colorStateList) {
        if (this.f22412m0 != colorStateList) {
            this.f22412m0 = colorStateList;
            if (V()) {
                this.f22410k0.setTintList(colorStateList);
            }
            onStateChange(getState());
        }
    }

    public final void P(boolean z9) {
        if (this.f22409j0 != z9) {
            boolean V8 = V();
            this.f22409j0 = z9;
            boolean V9 = V();
            if (V8 != V9) {
                if (V9) {
                    q(this.f22410k0);
                } else {
                    W(this.f22410k0);
                }
                invalidateSelf();
                x();
            }
        }
    }

    public final void Q(float f9) {
        if (this.f22422x0 != f9) {
            float s9 = s();
            this.f22422x0 = f9;
            float s10 = s();
            invalidateSelf();
            if (s9 != s10) {
                x();
            }
        }
    }

    public final void R(float f9) {
        if (this.f22421w0 != f9) {
            float s9 = s();
            this.f22421w0 = f9;
            float s10 = s();
            invalidateSelf();
            if (s9 != s10) {
                x();
            }
        }
    }

    public final void S(ColorStateList colorStateList) {
        if (this.f22396X != colorStateList) {
            this.f22396X = colorStateList;
            this.f22398Y0 = null;
            onStateChange(getState());
        }
    }

    public final boolean T() {
        if (this.f22416q0 && this.r0 != null && this.f22389Q0) {
            return true;
        }
        return false;
    }

    public final boolean U() {
        if (this.f22399Z && this.f22405f0 != null) {
            return true;
        }
        return false;
    }

    public final boolean V() {
        if (this.f22409j0 && this.f22410k0 != null) {
            return true;
        }
        return false;
    }

    @Override // F5.h, w5.l
    public final void a() {
        x();
        invalidateSelf();
    }

    @Override // F5.h, android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        int i9;
        Canvas canvas2;
        int i10;
        boolean z9;
        int i11;
        Rect bounds = getBounds();
        if (!bounds.isEmpty() && (i9 = this.f22391S0) != 0) {
            if (i9 < 255) {
                canvas2 = canvas;
                i10 = canvas2.saveLayerAlpha(bounds.left, bounds.top, bounds.right, bounds.bottom, i9);
            } else {
                canvas2 = canvas;
                i10 = 0;
            }
            boolean z10 = this.f22404d1;
            Paint paint = this.f22377E0;
            RectF rectF = this.f22379G0;
            if (!z10) {
                paint.setColor(this.f22383K0);
                paint.setStyle(Paint.Style.FILL);
                rectF.set(bounds);
                canvas2.drawRoundRect(rectF, u(), u(), paint);
            }
            if (!this.f22404d1) {
                paint.setColor(this.f22384L0);
                paint.setStyle(Paint.Style.FILL);
                ColorFilter colorFilter = this.f22392T0;
                if (colorFilter == null) {
                    colorFilter = this.f22393U0;
                }
                paint.setColorFilter(colorFilter);
                rectF.set(bounds);
                canvas2.drawRoundRect(rectF, u(), u(), paint);
            }
            if (this.f22404d1) {
                super.draw(canvas);
            }
            if (this.f22375D > 0.0f && !this.f22404d1) {
                paint.setColor(this.f22386N0);
                paint.setStyle(Paint.Style.STROKE);
                if (!this.f22404d1) {
                    ColorFilter colorFilter2 = this.f22392T0;
                    if (colorFilter2 == null) {
                        colorFilter2 = this.f22393U0;
                    }
                    paint.setColorFilter(colorFilter2);
                }
                float f9 = bounds.left;
                float f10 = this.f22375D / 2.0f;
                rectF.set(f9 + f10, bounds.top + f10, bounds.right - f10, bounds.bottom - f10);
                float f11 = this.f22371B - (this.f22375D / 2.0f);
                canvas2.drawRoundRect(rectF, f11, f11, paint);
            }
            paint.setColor(this.f22387O0);
            paint.setStyle(Paint.Style.FILL);
            rectF.set(bounds);
            if (!this.f22404d1) {
                canvas2.drawRoundRect(rectF, u(), u(), paint);
            } else {
                RectF rectF2 = new RectF(bounds);
                Path path = this.f22381I0;
                F5.g gVar = this.f2483a;
                this.f2499r.b(gVar.f2466a, gVar.f2474i, rectF2, this.f2498q, path);
                e(canvas2, paint, path, this.f2483a.f2466a, g());
            }
            if (U()) {
                r(bounds, rectF);
                float f12 = rectF.left;
                float f13 = rectF.top;
                canvas2.translate(f12, f13);
                this.f22405f0.setBounds(0, 0, (int) rectF.width(), (int) rectF.height());
                this.f22405f0.draw(canvas2);
                canvas2.translate(-f12, -f13);
            }
            if (T()) {
                r(bounds, rectF);
                float f14 = rectF.left;
                float f15 = rectF.top;
                canvas2.translate(f14, f15);
                this.r0.setBounds(0, 0, (int) rectF.width(), (int) rectF.height());
                this.r0.draw(canvas2);
                canvas2.translate(-f14, -f15);
            }
            if (this.f22402b1 && this.Y != null) {
                PointF pointF = this.f22380H0;
                pointF.set(0.0f, 0.0f);
                Paint.Align align = Paint.Align.LEFT;
                CharSequence charSequence = this.Y;
                m mVar = this.f22382J0;
                if (charSequence != null) {
                    float s9 = s() + this.f22420v0 + this.f22424y0;
                    if (getLayoutDirection() == 0) {
                        pointF.x = bounds.left + s9;
                    } else {
                        pointF.x = bounds.right - s9;
                        align = Paint.Align.RIGHT;
                    }
                    float centerY = bounds.centerY();
                    TextPaint textPaint = mVar.f24305a;
                    Paint.FontMetrics fontMetrics = this.f22378F0;
                    textPaint.getFontMetrics(fontMetrics);
                    pointF.y = centerY - ((fontMetrics.descent + fontMetrics.ascent) / 2.0f);
                }
                rectF.setEmpty();
                if (this.Y != null) {
                    float s10 = s() + this.f22420v0 + this.f22424y0;
                    float t7 = t() + this.f22374C0 + this.f22426z0;
                    if (getLayoutDirection() == 0) {
                        rectF.left = bounds.left + s10;
                        rectF.right = bounds.right - t7;
                    } else {
                        rectF.left = bounds.left + t7;
                        rectF.right = bounds.right - s10;
                    }
                    rectF.top = bounds.top;
                    rectF.bottom = bounds.bottom;
                }
                C5.e eVar = mVar.f24311g;
                TextPaint textPaint2 = mVar.f24305a;
                if (eVar != null) {
                    textPaint2.drawableState = getState();
                    mVar.f24311g.e(this.f22376D0, textPaint2, mVar.f24306b);
                }
                textPaint2.setTextAlign(align);
                if (Math.round(mVar.a(this.Y.toString())) > Math.round(rectF.width())) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                if (z9) {
                    int save = canvas2.save();
                    canvas2.clipRect(rectF);
                    i11 = save;
                } else {
                    i11 = 0;
                }
                CharSequence charSequence2 = this.Y;
                if (z9 && this.f22401a1 != null) {
                    charSequence2 = TextUtils.ellipsize(charSequence2, textPaint2, rectF.width(), this.f22401a1);
                }
                canvas.drawText(charSequence2, 0, charSequence2.length(), pointF.x, pointF.y, textPaint2);
                canvas2 = canvas;
                if (z9) {
                    canvas2.restoreToCount(i11);
                }
            }
            if (V()) {
                rectF.setEmpty();
                if (V()) {
                    float f16 = this.f22374C0 + this.f22372B0;
                    if (getLayoutDirection() == 0) {
                        float f17 = bounds.right - f16;
                        rectF.right = f17;
                        rectF.left = f17 - this.f22413n0;
                    } else {
                        float f18 = bounds.left + f16;
                        rectF.left = f18;
                        rectF.right = f18 + this.f22413n0;
                    }
                    float exactCenterY = bounds.exactCenterY();
                    float f19 = this.f22413n0;
                    float f20 = exactCenterY - (f19 / 2.0f);
                    rectF.top = f20;
                    rectF.bottom = f20 + f19;
                }
                float f21 = rectF.left;
                float f22 = rectF.top;
                canvas2.translate(f21, f22);
                this.f22410k0.setBounds(0, 0, (int) rectF.width(), (int) rectF.height());
                int[] iArr = D5.a.f1910a;
                this.f22411l0.setBounds(this.f22410k0.getBounds());
                this.f22411l0.jumpToCurrentState();
                this.f22411l0.draw(canvas2);
                canvas2.translate(-f21, -f22);
            }
            if (this.f22391S0 < 255) {
                canvas2.restoreToCount(i10);
            }
        }
    }

    @Override // F5.h, android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.f22391S0;
    }

    @Override // android.graphics.drawable.Drawable
    public final ColorFilter getColorFilter() {
        return this.f22392T0;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return (int) this.f22369A;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return Math.min(Math.round(t() + this.f22382J0.a(this.Y.toString()) + s() + this.f22420v0 + this.f22424y0 + this.f22426z0 + this.f22374C0), this.f22403c1);
    }

    @Override // F5.h, android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // F5.h, android.graphics.drawable.Drawable
    public final void getOutline(Outline outline) {
        Outline outline2;
        if (this.f22404d1) {
            super.getOutline(outline);
            return;
        }
        Rect bounds = getBounds();
        if (!bounds.isEmpty()) {
            outline.setRoundRect(bounds, this.f22371B);
            outline2 = outline;
        } else {
            outline2 = outline;
            outline2.setRoundRect(0, 0, getIntrinsicWidth(), (int) this.f22369A, this.f22371B);
        }
        outline2.setAlpha(this.f22391S0 / 255.0f);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.invalidateDrawable(this);
        }
    }

    @Override // F5.h, android.graphics.drawable.Drawable
    public final boolean isStateful() {
        ColorStateList colorStateList;
        if (!v(this.f22423y) && !v(this.f22425z) && !v(this.f22373C)) {
            C5.e eVar = this.f22382J0.f24311g;
            if (eVar == null || (colorStateList = eVar.j) == null || !colorStateList.isStateful()) {
                if ((!this.f22416q0 || this.r0 == null || !this.f22415p0) && !w(this.f22405f0) && !w(this.r0) && !v(this.f22394V0)) {
                    return false;
                }
                return true;
            }
            return true;
        }
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onLayoutDirectionChanged(int i9) {
        boolean onLayoutDirectionChanged = super.onLayoutDirectionChanged(i9);
        if (U()) {
            onLayoutDirectionChanged |= this.f22405f0.setLayoutDirection(i9);
        }
        if (T()) {
            onLayoutDirectionChanged |= this.r0.setLayoutDirection(i9);
        }
        if (V()) {
            onLayoutDirectionChanged |= this.f22410k0.setLayoutDirection(i9);
        }
        if (onLayoutDirectionChanged) {
            invalidateSelf();
            return true;
        }
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onLevelChange(int i9) {
        boolean onLevelChange = super.onLevelChange(i9);
        if (U()) {
            onLevelChange |= this.f22405f0.setLevel(i9);
        }
        if (T()) {
            onLevelChange |= this.r0.setLevel(i9);
        }
        if (V()) {
            onLevelChange |= this.f22410k0.setLevel(i9);
        }
        if (onLevelChange) {
            invalidateSelf();
        }
        return onLevelChange;
    }

    @Override // F5.h, android.graphics.drawable.Drawable
    public final boolean onStateChange(int[] iArr) {
        if (this.f22404d1) {
            super.onStateChange(iArr);
        }
        return y(iArr, this.f22397X0);
    }

    public final void q(Drawable drawable) {
        if (drawable != null) {
            drawable.setCallback(this);
            drawable.setLayoutDirection(getLayoutDirection());
            drawable.setLevel(getLevel());
            drawable.setVisible(isVisible(), false);
            if (drawable == this.f22410k0) {
                if (drawable.isStateful()) {
                    drawable.setState(this.f22397X0);
                }
                drawable.setTintList(this.f22412m0);
                return;
            }
            Drawable drawable2 = this.f22405f0;
            if (drawable == drawable2 && this.f22408i0) {
                drawable2.setTintList(this.f22406g0);
            }
            if (drawable.isStateful()) {
                drawable.setState(getState());
            }
        }
    }

    public final void r(Rect rect, RectF rectF) {
        Drawable drawable;
        Drawable drawable2;
        rectF.setEmpty();
        if (!U() && !T()) {
            return;
        }
        float f9 = this.f22420v0 + this.f22421w0;
        if (this.f22389Q0) {
            drawable = this.r0;
        } else {
            drawable = this.f22405f0;
        }
        float f10 = this.f22407h0;
        if (f10 <= 0.0f && drawable != null) {
            f10 = drawable.getIntrinsicWidth();
        }
        if (getLayoutDirection() == 0) {
            float f11 = rect.left + f9;
            rectF.left = f11;
            rectF.right = f11 + f10;
        } else {
            float f12 = rect.right - f9;
            rectF.right = f12;
            rectF.left = f12 - f10;
        }
        if (this.f22389Q0) {
            drawable2 = this.r0;
        } else {
            drawable2 = this.f22405f0;
        }
        float f13 = this.f22407h0;
        if (f13 <= 0.0f && drawable2 != null) {
            f13 = (float) Math.ceil(p.e(this.f22376D0, 24));
            if (drawable2.getIntrinsicHeight() <= f13) {
                f13 = drawable2.getIntrinsicHeight();
            }
        }
        float exactCenterY = rect.exactCenterY() - (f13 / 2.0f);
        rectF.top = exactCenterY;
        rectF.bottom = exactCenterY + f13;
    }

    public final float s() {
        Drawable drawable;
        if (!U() && !T()) {
            return 0.0f;
        }
        float f9 = this.f22421w0;
        if (this.f22389Q0) {
            drawable = this.r0;
        } else {
            drawable = this.f22405f0;
        }
        float f10 = this.f22407h0;
        if (f10 <= 0.0f && drawable != null) {
            f10 = drawable.getIntrinsicWidth();
        }
        return f10 + f9 + this.f22422x0;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.scheduleDrawable(this, runnable, j);
        }
    }

    @Override // F5.h, android.graphics.drawable.Drawable
    public final void setAlpha(int i9) {
        if (this.f22391S0 != i9) {
            this.f22391S0 = i9;
            invalidateSelf();
        }
    }

    @Override // F5.h, android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        if (this.f22392T0 != colorFilter) {
            this.f22392T0 = colorFilter;
            invalidateSelf();
        }
    }

    @Override // F5.h, android.graphics.drawable.Drawable
    public final void setTintList(ColorStateList colorStateList) {
        if (this.f22394V0 != colorStateList) {
            this.f22394V0 = colorStateList;
            onStateChange(getState());
        }
    }

    @Override // F5.h, android.graphics.drawable.Drawable
    public final void setTintMode(PorterDuff.Mode mode) {
        PorterDuffColorFilter porterDuffColorFilter;
        if (this.f22395W0 != mode) {
            this.f22395W0 = mode;
            ColorStateList colorStateList = this.f22394V0;
            if (colorStateList != null && mode != null) {
                porterDuffColorFilter = new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
            } else {
                porterDuffColorFilter = null;
            }
            this.f22393U0 = porterDuffColorFilter;
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z9, boolean z10) {
        boolean visible = super.setVisible(z9, z10);
        if (U()) {
            visible |= this.f22405f0.setVisible(z9, z10);
        }
        if (T()) {
            visible |= this.r0.setVisible(z9, z10);
        }
        if (V()) {
            visible |= this.f22410k0.setVisible(z9, z10);
        }
        if (visible) {
            invalidateSelf();
        }
        return visible;
    }

    public final float t() {
        if (V()) {
            return this.f22370A0 + this.f22413n0 + this.f22372B0;
        }
        return 0.0f;
    }

    public final float u() {
        if (this.f22404d1) {
            return this.f2483a.f2466a.f2523e.a(g());
        }
        return this.f22371B;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.unscheduleDrawable(this, runnable);
        }
    }

    public final void x() {
        d dVar = (d) this.f22400Z0.get();
        if (dVar != null) {
            Chip chip = (Chip) dVar;
            chip.c(chip.f15957q);
            chip.requestLayout();
            chip.invalidateOutline();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:64:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x00dc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean y(int[] r9, int[] r10) {
        /*
            Method dump skipped, instructions count: 342
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: q5.e.y(int[], int[]):boolean");
    }

    public final void z(boolean z9) {
        if (this.f22415p0 != z9) {
            this.f22415p0 = z9;
            float s9 = s();
            if (!z9 && this.f22389Q0) {
                this.f22389Q0 = false;
            }
            float s10 = s();
            invalidateSelf();
            if (s9 != s10) {
                x();
            }
        }
    }
}
