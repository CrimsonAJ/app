package w5;

import B6.u0;
import P.Q;
import android.animation.TimeInterpolator;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.os.Build;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.ViewGroup;
import android.view.animation.BaseInterpolator;
import com.google.firebase.messaging.u;
import f5.C1183o;
import h5.AbstractC1281a;
import java.util.WeakHashMap;
import k0.C1478a;
import l6.AbstractC1570b;
import u0.z;

/* renamed from: w5.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2143c {

    /* renamed from: A, reason: collision with root package name */
    public Typeface f24216A;

    /* renamed from: B, reason: collision with root package name */
    public Typeface f24217B;

    /* renamed from: C, reason: collision with root package name */
    public Typeface f24218C;

    /* renamed from: D, reason: collision with root package name */
    public C5.b f24219D;

    /* renamed from: E, reason: collision with root package name */
    public C5.b f24220E;

    /* renamed from: G, reason: collision with root package name */
    public CharSequence f24222G;

    /* renamed from: H, reason: collision with root package name */
    public CharSequence f24223H;

    /* renamed from: I, reason: collision with root package name */
    public boolean f24224I;
    public Bitmap K;

    /* renamed from: L, reason: collision with root package name */
    public float f24226L;

    /* renamed from: M, reason: collision with root package name */
    public float f24227M;

    /* renamed from: N, reason: collision with root package name */
    public float f24228N;

    /* renamed from: O, reason: collision with root package name */
    public float f24229O;

    /* renamed from: P, reason: collision with root package name */
    public float f24230P;

    /* renamed from: Q, reason: collision with root package name */
    public int f24231Q;

    /* renamed from: R, reason: collision with root package name */
    public int[] f24232R;

    /* renamed from: S, reason: collision with root package name */
    public boolean f24233S;

    /* renamed from: T, reason: collision with root package name */
    public final TextPaint f24234T;

    /* renamed from: U, reason: collision with root package name */
    public final TextPaint f24235U;

    /* renamed from: V, reason: collision with root package name */
    public TimeInterpolator f24236V;

    /* renamed from: W, reason: collision with root package name */
    public BaseInterpolator f24237W;

    /* renamed from: X, reason: collision with root package name */
    public float f24238X;
    public float Y;

    /* renamed from: Z, reason: collision with root package name */
    public float f24239Z;

    /* renamed from: a, reason: collision with root package name */
    public final ViewGroup f24240a;

    /* renamed from: a0, reason: collision with root package name */
    public ColorStateList f24241a0;

    /* renamed from: b, reason: collision with root package name */
    public float f24242b;

    /* renamed from: b0, reason: collision with root package name */
    public float f24243b0;

    /* renamed from: c, reason: collision with root package name */
    public boolean f24244c;

    /* renamed from: c0, reason: collision with root package name */
    public float f24245c0;

    /* renamed from: d, reason: collision with root package name */
    public float f24246d;

    /* renamed from: d0, reason: collision with root package name */
    public float f24247d0;

    /* renamed from: e, reason: collision with root package name */
    public float f24248e;

    /* renamed from: e0, reason: collision with root package name */
    public ColorStateList f24249e0;

    /* renamed from: f, reason: collision with root package name */
    public int f24250f;

    /* renamed from: f0, reason: collision with root package name */
    public float f24251f0;

    /* renamed from: g, reason: collision with root package name */
    public final Rect f24252g;

    /* renamed from: g0, reason: collision with root package name */
    public float f24253g0;

    /* renamed from: h, reason: collision with root package name */
    public final Rect f24254h;

    /* renamed from: h0, reason: collision with root package name */
    public float f24255h0;

    /* renamed from: i, reason: collision with root package name */
    public final RectF f24256i;

    /* renamed from: i0, reason: collision with root package name */
    public StaticLayout f24257i0;

    /* renamed from: j0, reason: collision with root package name */
    public float f24258j0;

    /* renamed from: k0, reason: collision with root package name */
    public float f24260k0;

    /* renamed from: l0, reason: collision with root package name */
    public float f24262l0;

    /* renamed from: m0, reason: collision with root package name */
    public CharSequence f24264m0;

    /* renamed from: n, reason: collision with root package name */
    public ColorStateList f24265n;

    /* renamed from: o, reason: collision with root package name */
    public ColorStateList f24267o;

    /* renamed from: p, reason: collision with root package name */
    public int f24269p;

    /* renamed from: q, reason: collision with root package name */
    public float f24271q;

    /* renamed from: r, reason: collision with root package name */
    public float f24273r;

    /* renamed from: s, reason: collision with root package name */
    public float f24274s;

    /* renamed from: t, reason: collision with root package name */
    public float f24275t;

    /* renamed from: u, reason: collision with root package name */
    public float f24276u;

    /* renamed from: v, reason: collision with root package name */
    public float f24277v;

    /* renamed from: w, reason: collision with root package name */
    public Typeface f24278w;

    /* renamed from: x, reason: collision with root package name */
    public Typeface f24279x;

    /* renamed from: y, reason: collision with root package name */
    public Typeface f24280y;

    /* renamed from: z, reason: collision with root package name */
    public Typeface f24281z;
    public int j = 16;

    /* renamed from: k, reason: collision with root package name */
    public int f24259k = 16;

    /* renamed from: l, reason: collision with root package name */
    public float f24261l = 15.0f;

    /* renamed from: m, reason: collision with root package name */
    public float f24263m = 15.0f;

    /* renamed from: F, reason: collision with root package name */
    public TextUtils.TruncateAt f24221F = TextUtils.TruncateAt.END;

    /* renamed from: J, reason: collision with root package name */
    public boolean f24225J = true;

    /* renamed from: n0, reason: collision with root package name */
    public int f24266n0 = 1;

    /* renamed from: o0, reason: collision with root package name */
    public float f24268o0 = 0.0f;

    /* renamed from: p0, reason: collision with root package name */
    public float f24270p0 = 1.0f;

    /* renamed from: q0, reason: collision with root package name */
    public int f24272q0 = 1;

    public C2143c(ViewGroup viewGroup) {
        this.f24240a = viewGroup;
        TextPaint textPaint = new TextPaint(129);
        this.f24234T = textPaint;
        this.f24235U = new TextPaint(textPaint);
        this.f24254h = new Rect();
        this.f24252g = new Rect();
        this.f24256i = new RectF();
        float f9 = this.f24246d;
        this.f24248e = z.b(1.0f, f9, 0.5f, f9);
        h(viewGroup.getContext().getResources().getConfiguration());
    }

    public static int a(int i9, float f9, int i10) {
        float f10 = 1.0f - f9;
        return Color.argb(Math.round((Color.alpha(i10) * f9) + (Color.alpha(i9) * f10)), Math.round((Color.red(i10) * f9) + (Color.red(i9) * f10)), Math.round((Color.green(i10) * f9) + (Color.green(i9) * f10)), Math.round((Color.blue(i10) * f9) + (Color.blue(i9) * f10)));
    }

    public static float g(float f9, float f10, float f11, TimeInterpolator timeInterpolator) {
        if (timeInterpolator != null) {
            f11 = timeInterpolator.getInterpolation(f11);
        }
        return AbstractC1281a.a(f9, f10, f11);
    }

    public final boolean b(CharSequence charSequence) {
        A6.i iVar;
        WeakHashMap weakHashMap = Q.f5546a;
        boolean z9 = true;
        if (this.f24240a.getLayoutDirection() != 1) {
            z9 = false;
        }
        if (this.f24225J) {
            if (z9) {
                iVar = N.f.f4813d;
            } else {
                iVar = N.f.f4812c;
            }
            return iVar.f(charSequence, charSequence.length());
        }
        return z9;
    }

    public final void c(float f9, boolean z9) {
        boolean z10;
        float f10;
        float f11;
        Typeface typeface;
        boolean z11;
        Layout.Alignment alignment;
        boolean z12;
        boolean z13;
        boolean z14;
        boolean z15;
        boolean z16;
        boolean z17;
        if (this.f24222G != null) {
            float width = this.f24254h.width();
            float width2 = this.f24252g.width();
            if (Math.abs(f9 - 1.0f) < 1.0E-5f) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                f10 = this.f24263m;
                f11 = this.f24251f0;
                this.f24226L = 1.0f;
                typeface = this.f24278w;
            } else {
                float f12 = this.f24261l;
                float f13 = this.f24253g0;
                Typeface typeface2 = this.f24281z;
                if (Math.abs(f9 - 0.0f) < 1.0E-5f) {
                    this.f24226L = 1.0f;
                } else {
                    this.f24226L = g(this.f24261l, this.f24263m, f9, this.f24237W) / this.f24261l;
                }
                float f14 = this.f24263m / this.f24261l;
                float f15 = width2 * f14;
                if (!z9 && !this.f24244c && f15 > width) {
                    width = Math.min(width / f14, width2);
                } else {
                    width = width2;
                }
                f10 = f12;
                f11 = f13;
                typeface = typeface2;
            }
            TextPaint textPaint = this.f24234T;
            if (width > 0.0f) {
                if (this.f24227M != f10) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                if (this.f24255h0 != f11) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                if (this.f24218C != typeface) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                if (this.f24257i0 != null && width != r9.getWidth()) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                if (!z12 && !z13 && !z15 && !z14 && !this.f24233S) {
                    z16 = false;
                } else {
                    z16 = true;
                }
                this.f24227M = f10;
                this.f24255h0 = f11;
                this.f24218C = typeface;
                this.f24233S = false;
                if (this.f24226L != 1.0f) {
                    z17 = true;
                } else {
                    z17 = false;
                }
                textPaint.setLinearText(z17);
                z11 = z16;
            } else {
                z11 = false;
            }
            if (this.f24223H == null || z11) {
                textPaint.setTextSize(this.f24227M);
                textPaint.setTypeface(this.f24218C);
                textPaint.setLetterSpacing(this.f24255h0);
                boolean b9 = b(this.f24222G);
                this.f24224I = b9;
                int i9 = this.f24266n0;
                if (i9 <= 1 || (b9 && !this.f24244c)) {
                    i9 = 1;
                }
                if (i9 == 1) {
                    alignment = Layout.Alignment.ALIGN_NORMAL;
                } else {
                    int absoluteGravity = Gravity.getAbsoluteGravity(this.j, b9 ? 1 : 0) & 7;
                    if (absoluteGravity != 1) {
                        if (absoluteGravity != 5) {
                            if (this.f24224I) {
                                alignment = Layout.Alignment.ALIGN_OPPOSITE;
                            } else {
                                alignment = Layout.Alignment.ALIGN_NORMAL;
                            }
                        } else if (this.f24224I) {
                            alignment = Layout.Alignment.ALIGN_NORMAL;
                        } else {
                            alignment = Layout.Alignment.ALIGN_OPPOSITE;
                        }
                    } else {
                        alignment = Layout.Alignment.ALIGN_CENTER;
                    }
                }
                k kVar = new k(this.f24222G, textPaint, (int) width);
                kVar.f24304l = this.f24221F;
                kVar.f24303k = b9;
                kVar.f24298e = alignment;
                kVar.j = false;
                kVar.f24299f = i9;
                float f16 = this.f24268o0;
                float f17 = this.f24270p0;
                kVar.f24300g = f16;
                kVar.f24301h = f17;
                kVar.f24302i = this.f24272q0;
                StaticLayout a5 = kVar.a();
                a5.getClass();
                this.f24257i0 = a5;
                this.f24223H = a5.getText();
            }
        }
    }

    public final void d(Canvas canvas) {
        int save = canvas.save();
        if (this.f24223H != null) {
            RectF rectF = this.f24256i;
            if (rectF.width() > 0.0f && rectF.height() > 0.0f) {
                TextPaint textPaint = this.f24234T;
                textPaint.setTextSize(this.f24227M);
                float f9 = this.f24276u;
                float f10 = this.f24277v;
                float f11 = this.f24226L;
                if (f11 != 1.0f && !this.f24244c) {
                    canvas.scale(f11, f11, f9, f10);
                }
                if (this.f24266n0 > 1 && ((!this.f24224I || this.f24244c) && (!this.f24244c || this.f24242b > this.f24248e))) {
                    float lineStart = this.f24276u - this.f24257i0.getLineStart(0);
                    int alpha = textPaint.getAlpha();
                    canvas.translate(lineStart, f10);
                    if (!this.f24244c) {
                        textPaint.setAlpha((int) (this.f24262l0 * alpha));
                        if (Build.VERSION.SDK_INT >= 31) {
                            textPaint.setShadowLayer(this.f24228N, this.f24229O, this.f24230P, s8.n.j(this.f24231Q, textPaint.getAlpha()));
                        }
                        this.f24257i0.draw(canvas);
                    }
                    if (!this.f24244c) {
                        textPaint.setAlpha((int) (this.f24260k0 * alpha));
                    }
                    int i9 = Build.VERSION.SDK_INT;
                    if (i9 >= 31) {
                        textPaint.setShadowLayer(this.f24228N, this.f24229O, this.f24230P, s8.n.j(this.f24231Q, textPaint.getAlpha()));
                    }
                    int lineBaseline = this.f24257i0.getLineBaseline(0);
                    CharSequence charSequence = this.f24264m0;
                    float f12 = lineBaseline;
                    canvas.drawText(charSequence, 0, charSequence.length(), 0.0f, f12, textPaint);
                    if (i9 >= 31) {
                        textPaint.setShadowLayer(this.f24228N, this.f24229O, this.f24230P, this.f24231Q);
                    }
                    if (!this.f24244c) {
                        String trim = this.f24264m0.toString().trim();
                        if (trim.endsWith("…")) {
                            trim = trim.substring(0, trim.length() - 1);
                        }
                        String str = trim;
                        textPaint.setAlpha(alpha);
                        canvas.drawText(str, 0, Math.min(this.f24257i0.getLineEnd(0), str.length()), 0.0f, f12, (Paint) textPaint);
                    }
                    canvas = canvas;
                } else {
                    canvas.translate(f9, f10);
                    this.f24257i0.draw(canvas);
                }
                canvas.restoreToCount(save);
            }
        }
    }

    public final float e() {
        TextPaint textPaint = this.f24235U;
        textPaint.setTextSize(this.f24263m);
        textPaint.setTypeface(this.f24278w);
        textPaint.setLetterSpacing(this.f24251f0);
        return -textPaint.ascent();
    }

    public final int f(ColorStateList colorStateList) {
        if (colorStateList == null) {
            return 0;
        }
        int[] iArr = this.f24232R;
        if (iArr != null) {
            return colorStateList.getColorForState(iArr, 0);
        }
        return colorStateList.getDefaultColor();
    }

    public final void h(Configuration configuration) {
        if (Build.VERSION.SDK_INT >= 31) {
            Typeface typeface = this.f24280y;
            if (typeface != null) {
                this.f24279x = AbstractC1570b.r(configuration, typeface);
            }
            Typeface typeface2 = this.f24217B;
            if (typeface2 != null) {
                this.f24216A = AbstractC1570b.r(configuration, typeface2);
            }
            Typeface typeface3 = this.f24279x;
            if (typeface3 == null) {
                typeface3 = this.f24280y;
            }
            this.f24278w = typeface3;
            Typeface typeface4 = this.f24216A;
            if (typeface4 == null) {
                typeface4 = this.f24217B;
            }
            this.f24281z = typeface4;
            i(true);
        }
    }

    public final void i(boolean z9) {
        float f9;
        float f10;
        int i9;
        float f11;
        float b9;
        StaticLayout staticLayout;
        ViewGroup viewGroup = this.f24240a;
        if ((viewGroup.getHeight() > 0 && viewGroup.getWidth() > 0) || z9) {
            c(1.0f, z9);
            CharSequence charSequence = this.f24223H;
            TextPaint textPaint = this.f24234T;
            if (charSequence != null && (staticLayout = this.f24257i0) != null) {
                this.f24264m0 = TextUtils.ellipsize(charSequence, textPaint, staticLayout.getWidth(), this.f24221F);
            }
            CharSequence charSequence2 = this.f24264m0;
            if (charSequence2 != null) {
                this.f24258j0 = textPaint.measureText(charSequence2, 0, charSequence2.length());
            } else {
                this.f24258j0 = 0.0f;
            }
            int absoluteGravity = Gravity.getAbsoluteGravity(this.f24259k, this.f24224I ? 1 : 0);
            int i10 = absoluteGravity & 112;
            Rect rect = this.f24254h;
            if (i10 != 48) {
                if (i10 != 80) {
                    this.f24273r = rect.centerY() - ((textPaint.descent() - textPaint.ascent()) / 2.0f);
                } else {
                    this.f24273r = textPaint.ascent() + rect.bottom;
                }
            } else {
                this.f24273r = rect.top;
            }
            int i11 = absoluteGravity & 8388615;
            if (i11 != 1) {
                if (i11 != 5) {
                    this.f24275t = rect.left;
                } else {
                    this.f24275t = rect.right - this.f24258j0;
                }
            } else {
                this.f24275t = rect.centerX() - (this.f24258j0 / 2.0f);
            }
            c(0.0f, z9);
            StaticLayout staticLayout2 = this.f24257i0;
            if (staticLayout2 != null) {
                f9 = staticLayout2.getHeight();
            } else {
                f9 = 0.0f;
            }
            StaticLayout staticLayout3 = this.f24257i0;
            if (staticLayout3 != null && this.f24266n0 > 1) {
                f10 = staticLayout3.getWidth();
            } else {
                CharSequence charSequence3 = this.f24223H;
                if (charSequence3 != null) {
                    f10 = textPaint.measureText(charSequence3, 0, charSequence3.length());
                } else {
                    f10 = 0.0f;
                }
            }
            StaticLayout staticLayout4 = this.f24257i0;
            if (staticLayout4 != null) {
                i9 = staticLayout4.getLineCount();
            } else {
                i9 = 0;
            }
            this.f24269p = i9;
            int absoluteGravity2 = Gravity.getAbsoluteGravity(this.j, this.f24224I ? 1 : 0);
            int i12 = absoluteGravity2 & 112;
            Rect rect2 = this.f24252g;
            if (i12 != 48) {
                if (i12 != 80) {
                    this.f24271q = rect2.centerY() - (f9 / 2.0f);
                } else {
                    this.f24271q = textPaint.descent() + (rect2.bottom - f9);
                }
            } else {
                this.f24271q = rect2.top;
            }
            int i13 = absoluteGravity2 & 8388615;
            if (i13 != 1) {
                if (i13 != 5) {
                    this.f24274s = rect2.left;
                } else {
                    this.f24274s = rect2.right - f10;
                }
            } else {
                this.f24274s = rect2.centerX() - (f10 / 2.0f);
            }
            Bitmap bitmap = this.K;
            if (bitmap != null) {
                bitmap.recycle();
                this.K = null;
            }
            q(this.f24242b);
            float f12 = this.f24242b;
            boolean z10 = this.f24244c;
            RectF rectF = this.f24256i;
            if (z10) {
                if (f12 < this.f24248e) {
                    rect = rect2;
                }
                rectF.set(rect);
            } else {
                rectF.left = g(rect2.left, rect.left, f12, this.f24236V);
                rectF.top = g(this.f24271q, this.f24273r, f12, this.f24236V);
                rectF.right = g(rect2.right, rect.right, f12, this.f24236V);
                rectF.bottom = g(rect2.bottom, rect.bottom, f12, this.f24236V);
            }
            if (this.f24244c) {
                if (f12 < this.f24248e) {
                    this.f24276u = this.f24274s;
                    this.f24277v = this.f24271q;
                    q(0.0f);
                    f11 = 0.0f;
                } else {
                    this.f24276u = this.f24275t;
                    this.f24277v = this.f24273r - Math.max(0, this.f24250f);
                    q(1.0f);
                    f11 = 1.0f;
                }
            } else {
                this.f24276u = g(this.f24274s, this.f24275t, f12, this.f24236V);
                this.f24277v = g(this.f24271q, this.f24273r, f12, this.f24236V);
                q(f12);
                f11 = f12;
            }
            C1478a c1478a = AbstractC1281a.f17926b;
            this.f24260k0 = 1.0f - g(0.0f, 1.0f, 1.0f - f12, c1478a);
            WeakHashMap weakHashMap = Q.f5546a;
            viewGroup.postInvalidateOnAnimation();
            this.f24262l0 = g(1.0f, 0.0f, f12, c1478a);
            viewGroup.postInvalidateOnAnimation();
            ColorStateList colorStateList = this.f24267o;
            ColorStateList colorStateList2 = this.f24265n;
            if (colorStateList != colorStateList2) {
                textPaint.setColor(a(f(colorStateList2), f11, f(this.f24267o)));
            } else {
                textPaint.setColor(f(colorStateList));
            }
            int i14 = Build.VERSION.SDK_INT;
            float f13 = this.f24251f0;
            float f14 = this.f24253g0;
            if (f13 != f14) {
                textPaint.setLetterSpacing(g(f14, f13, f12, c1478a));
            } else {
                textPaint.setLetterSpacing(f13);
            }
            this.f24228N = AbstractC1281a.a(this.f24243b0, this.f24238X, f12);
            this.f24229O = AbstractC1281a.a(this.f24245c0, this.Y, f12);
            this.f24230P = AbstractC1281a.a(this.f24247d0, this.f24239Z, f12);
            int a5 = a(f(this.f24249e0), f12, f(this.f24241a0));
            this.f24231Q = a5;
            textPaint.setShadowLayer(this.f24228N, this.f24229O, this.f24230P, a5);
            if (this.f24244c) {
                int alpha = textPaint.getAlpha();
                float f15 = this.f24248e;
                if (f12 <= f15) {
                    b9 = AbstractC1281a.b(1.0f, 0.0f, this.f24246d, f15, f12);
                } else {
                    b9 = AbstractC1281a.b(0.0f, 1.0f, f15, 1.0f, f12);
                }
                textPaint.setAlpha((int) (b9 * alpha));
                if (i14 >= 31) {
                    textPaint.setShadowLayer(this.f24228N, this.f24229O, this.f24230P, s8.n.j(this.f24231Q, textPaint.getAlpha()));
                }
            }
            viewGroup.postInvalidateOnAnimation();
        }
    }

    public final void j(ColorStateList colorStateList) {
        if (this.f24267o == colorStateList && this.f24265n == colorStateList) {
            return;
        }
        this.f24267o = colorStateList;
        this.f24265n = colorStateList;
        i(false);
    }

    public final void k(int i9) {
        ViewGroup viewGroup = this.f24240a;
        C5.e eVar = new C5.e(viewGroup.getContext(), i9);
        ColorStateList colorStateList = eVar.j;
        if (colorStateList != null) {
            this.f24267o = colorStateList;
        }
        float f9 = eVar.f1610k;
        if (f9 != 0.0f) {
            this.f24263m = f9;
        }
        ColorStateList colorStateList2 = eVar.f1601a;
        if (colorStateList2 != null) {
            this.f24241a0 = colorStateList2;
        }
        this.Y = eVar.f1605e;
        this.f24239Z = eVar.f1606f;
        this.f24238X = eVar.f1607g;
        this.f24251f0 = eVar.f1609i;
        C5.b bVar = this.f24220E;
        if (bVar != null) {
            bVar.f1594p = true;
        }
        C1183o c1183o = new C1183o(22, this);
        eVar.a();
        this.f24220E = new C5.b(c1183o, eVar.f1613n);
        eVar.c(viewGroup.getContext(), this.f24220E);
        i(false);
    }

    public final void l(int i9) {
        if (this.f24259k != i9) {
            this.f24259k = i9;
            i(false);
        }
    }

    public final boolean m(Typeface typeface) {
        C5.b bVar = this.f24220E;
        if (bVar != null) {
            bVar.f1594p = true;
        }
        if (this.f24280y != typeface) {
            this.f24280y = typeface;
            Typeface r5 = AbstractC1570b.r(this.f24240a.getContext().getResources().getConfiguration(), typeface);
            this.f24279x = r5;
            if (r5 == null) {
                r5 = this.f24280y;
            }
            this.f24278w = r5;
            return true;
        }
        return false;
    }

    public final void n(int i9) {
        ViewGroup viewGroup = this.f24240a;
        C5.e eVar = new C5.e(viewGroup.getContext(), i9);
        ColorStateList colorStateList = eVar.j;
        if (colorStateList != null) {
            this.f24265n = colorStateList;
        }
        float f9 = eVar.f1610k;
        if (f9 != 0.0f) {
            this.f24261l = f9;
        }
        ColorStateList colorStateList2 = eVar.f1601a;
        if (colorStateList2 != null) {
            this.f24249e0 = colorStateList2;
        }
        this.f24245c0 = eVar.f1605e;
        this.f24247d0 = eVar.f1606f;
        this.f24243b0 = eVar.f1607g;
        this.f24253g0 = eVar.f1609i;
        C5.b bVar = this.f24219D;
        if (bVar != null) {
            bVar.f1594p = true;
        }
        u uVar = new u(this);
        eVar.a();
        this.f24219D = new C5.b(uVar, eVar.f1613n);
        eVar.c(viewGroup.getContext(), this.f24219D);
        i(false);
    }

    public final boolean o(Typeface typeface) {
        C5.b bVar = this.f24219D;
        if (bVar != null) {
            bVar.f1594p = true;
        }
        if (this.f24217B != typeface) {
            this.f24217B = typeface;
            Typeface r5 = AbstractC1570b.r(this.f24240a.getContext().getResources().getConfiguration(), typeface);
            this.f24216A = r5;
            if (r5 == null) {
                r5 = this.f24217B;
            }
            this.f24281z = r5;
            return true;
        }
        return false;
    }

    public final void p(float f9) {
        float f10;
        float b9;
        float j = u0.j(f9, 0.0f, 1.0f);
        if (j != this.f24242b) {
            this.f24242b = j;
            boolean z9 = this.f24244c;
            RectF rectF = this.f24256i;
            Rect rect = this.f24254h;
            Rect rect2 = this.f24252g;
            if (z9) {
                if (j < this.f24248e) {
                    rect = rect2;
                }
                rectF.set(rect);
            } else {
                rectF.left = g(rect2.left, rect.left, j, this.f24236V);
                rectF.top = g(this.f24271q, this.f24273r, j, this.f24236V);
                rectF.right = g(rect2.right, rect.right, j, this.f24236V);
                rectF.bottom = g(rect2.bottom, rect.bottom, j, this.f24236V);
            }
            if (this.f24244c) {
                if (j < this.f24248e) {
                    this.f24276u = this.f24274s;
                    this.f24277v = this.f24271q;
                    q(0.0f);
                    f10 = 0.0f;
                } else {
                    this.f24276u = this.f24275t;
                    this.f24277v = this.f24273r - Math.max(0, this.f24250f);
                    q(1.0f);
                    f10 = 1.0f;
                }
            } else {
                this.f24276u = g(this.f24274s, this.f24275t, j, this.f24236V);
                this.f24277v = g(this.f24271q, this.f24273r, j, this.f24236V);
                q(j);
                f10 = j;
            }
            C1478a c1478a = AbstractC1281a.f17926b;
            this.f24260k0 = 1.0f - g(0.0f, 1.0f, 1.0f - j, c1478a);
            WeakHashMap weakHashMap = Q.f5546a;
            ViewGroup viewGroup = this.f24240a;
            viewGroup.postInvalidateOnAnimation();
            this.f24262l0 = g(1.0f, 0.0f, j, c1478a);
            viewGroup.postInvalidateOnAnimation();
            ColorStateList colorStateList = this.f24267o;
            ColorStateList colorStateList2 = this.f24265n;
            TextPaint textPaint = this.f24234T;
            if (colorStateList != colorStateList2) {
                textPaint.setColor(a(f(colorStateList2), f10, f(this.f24267o)));
            } else {
                textPaint.setColor(f(colorStateList));
            }
            int i9 = Build.VERSION.SDK_INT;
            float f11 = this.f24251f0;
            float f12 = this.f24253g0;
            if (f11 != f12) {
                textPaint.setLetterSpacing(g(f12, f11, j, c1478a));
            } else {
                textPaint.setLetterSpacing(f11);
            }
            this.f24228N = AbstractC1281a.a(this.f24243b0, this.f24238X, j);
            this.f24229O = AbstractC1281a.a(this.f24245c0, this.Y, j);
            this.f24230P = AbstractC1281a.a(this.f24247d0, this.f24239Z, j);
            int a5 = a(f(this.f24249e0), j, f(this.f24241a0));
            this.f24231Q = a5;
            textPaint.setShadowLayer(this.f24228N, this.f24229O, this.f24230P, a5);
            if (this.f24244c) {
                int alpha = textPaint.getAlpha();
                float f13 = this.f24248e;
                if (j <= f13) {
                    b9 = AbstractC1281a.b(1.0f, 0.0f, this.f24246d, f13, j);
                } else {
                    b9 = AbstractC1281a.b(0.0f, 1.0f, f13, 1.0f, j);
                }
                textPaint.setAlpha((int) (b9 * alpha));
                if (i9 >= 31) {
                    textPaint.setShadowLayer(this.f24228N, this.f24229O, this.f24230P, s8.n.j(this.f24231Q, textPaint.getAlpha()));
                }
            }
            viewGroup.postInvalidateOnAnimation();
        }
    }

    public final void q(float f9) {
        c(f9, false);
        WeakHashMap weakHashMap = Q.f5546a;
        this.f24240a.postInvalidateOnAnimation();
    }
}
