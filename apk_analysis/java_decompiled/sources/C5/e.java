package C5;

import G.l;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.text.TextPaint;
import android.util.Log;
import android.util.TypedValue;
import com.google.android.gms.internal.measurement.D1;
import com.google.android.gms.internal.measurement.Y1;
import g5.AbstractC1254a;
import l6.AbstractC1570b;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final ColorStateList f1601a;

    /* renamed from: b, reason: collision with root package name */
    public final String f1602b;

    /* renamed from: c, reason: collision with root package name */
    public final int f1603c;

    /* renamed from: d, reason: collision with root package name */
    public final int f1604d;

    /* renamed from: e, reason: collision with root package name */
    public final float f1605e;

    /* renamed from: f, reason: collision with root package name */
    public final float f1606f;

    /* renamed from: g, reason: collision with root package name */
    public final float f1607g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f1608h;

    /* renamed from: i, reason: collision with root package name */
    public final float f1609i;
    public ColorStateList j;

    /* renamed from: k, reason: collision with root package name */
    public float f1610k;

    /* renamed from: l, reason: collision with root package name */
    public final int f1611l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f1612m = false;

    /* renamed from: n, reason: collision with root package name */
    public Typeface f1613n;

    public e(Context context, int i9) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(i9, AbstractC1254a.f17731Q);
        this.f1610k = obtainStyledAttributes.getDimension(0, 0.0f);
        this.j = D1.p(context, obtainStyledAttributes, 3);
        D1.p(context, obtainStyledAttributes, 4);
        D1.p(context, obtainStyledAttributes, 5);
        this.f1603c = obtainStyledAttributes.getInt(2, 0);
        this.f1604d = obtainStyledAttributes.getInt(1, 1);
        int i10 = obtainStyledAttributes.hasValue(12) ? 12 : 10;
        this.f1611l = obtainStyledAttributes.getResourceId(i10, 0);
        this.f1602b = obtainStyledAttributes.getString(i10);
        obtainStyledAttributes.getBoolean(14, false);
        this.f1601a = D1.p(context, obtainStyledAttributes, 6);
        this.f1605e = obtainStyledAttributes.getFloat(7, 0.0f);
        this.f1606f = obtainStyledAttributes.getFloat(8, 0.0f);
        this.f1607g = obtainStyledAttributes.getFloat(9, 0.0f);
        obtainStyledAttributes.recycle();
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(i9, AbstractC1254a.f17717B);
        this.f1608h = obtainStyledAttributes2.hasValue(0);
        this.f1609i = obtainStyledAttributes2.getFloat(0, 0.0f);
        obtainStyledAttributes2.recycle();
    }

    public final void a() {
        String str;
        Typeface typeface = this.f1613n;
        int i9 = this.f1603c;
        if (typeface == null && (str = this.f1602b) != null) {
            this.f1613n = Typeface.create(str, i9);
        }
        if (this.f1613n == null) {
            int i10 = this.f1604d;
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 != 3) {
                        this.f1613n = Typeface.DEFAULT;
                    } else {
                        this.f1613n = Typeface.MONOSPACE;
                    }
                } else {
                    this.f1613n = Typeface.SERIF;
                }
            } else {
                this.f1613n = Typeface.SANS_SERIF;
            }
            this.f1613n = Typeface.create(this.f1613n, i9);
        }
    }

    public final Typeface b(Context context) {
        Typeface b9;
        if (this.f1612m) {
            return this.f1613n;
        }
        if (!context.isRestricted()) {
            try {
                int i9 = this.f1611l;
                ThreadLocal threadLocal = l.f2623a;
                if (context.isRestricted()) {
                    b9 = null;
                } else {
                    b9 = l.b(context, i9, new TypedValue(), 0, null, false, false);
                }
                this.f1613n = b9;
                if (b9 != null) {
                    this.f1613n = Typeface.create(b9, this.f1603c);
                }
            } catch (Resources.NotFoundException | UnsupportedOperationException unused) {
            } catch (Exception e8) {
                Log.d("TextAppearance", "Error loading font " + this.f1602b, e8);
            }
        }
        a();
        this.f1612m = true;
        return this.f1613n;
    }

    public final void c(Context context, Y1 y12) {
        if (d(context)) {
            b(context);
        } else {
            a();
        }
        int i9 = this.f1611l;
        if (i9 == 0) {
            this.f1612m = true;
        }
        if (this.f1612m) {
            y12.x(this.f1613n, true);
            return;
        }
        try {
            c cVar = new c(this, y12);
            ThreadLocal threadLocal = l.f2623a;
            if (context.isRestricted()) {
                cVar.a(-4);
            } else {
                l.b(context, i9, new TypedValue(), 0, cVar, false, false);
            }
        } catch (Resources.NotFoundException unused) {
            this.f1612m = true;
            y12.w(1);
        } catch (Exception e8) {
            Log.d("TextAppearance", "Error loading font " + this.f1602b, e8);
            this.f1612m = true;
            y12.w(-3);
        }
    }

    public final boolean d(Context context) {
        Typeface typeface = null;
        int i9 = this.f1611l;
        if (i9 != 0) {
            ThreadLocal threadLocal = l.f2623a;
            if (!context.isRestricted()) {
                typeface = l.b(context, i9, new TypedValue(), 0, null, false, true);
            }
        }
        if (typeface != null) {
            return true;
        }
        return false;
    }

    public final void e(Context context, TextPaint textPaint, Y1 y12) {
        int i9;
        int i10;
        f(context, textPaint, y12);
        ColorStateList colorStateList = this.j;
        if (colorStateList != null) {
            i9 = colorStateList.getColorForState(textPaint.drawableState, colorStateList.getDefaultColor());
        } else {
            i9 = -16777216;
        }
        textPaint.setColor(i9);
        ColorStateList colorStateList2 = this.f1601a;
        if (colorStateList2 != null) {
            i10 = colorStateList2.getColorForState(textPaint.drawableState, colorStateList2.getDefaultColor());
        } else {
            i10 = 0;
        }
        textPaint.setShadowLayer(this.f1607g, this.f1605e, this.f1606f, i10);
    }

    public final void f(Context context, TextPaint textPaint, Y1 y12) {
        if (d(context)) {
            g(context, textPaint, b(context));
            return;
        }
        a();
        g(context, textPaint, this.f1613n);
        c(context, new d(this, context, textPaint, y12));
    }

    public final void g(Context context, TextPaint textPaint, Typeface typeface) {
        boolean z9;
        float f9;
        Typeface r5 = AbstractC1570b.r(context.getResources().getConfiguration(), typeface);
        if (r5 != null) {
            typeface = r5;
        }
        textPaint.setTypeface(typeface);
        int i9 = (~typeface.getStyle()) & this.f1603c;
        if ((i9 & 1) != 0) {
            z9 = true;
        } else {
            z9 = false;
        }
        textPaint.setFakeBoldText(z9);
        if ((i9 & 2) != 0) {
            f9 = -0.25f;
        } else {
            f9 = 0.0f;
        }
        textPaint.setTextSkewX(f9);
        textPaint.setTextSize(this.f1610k);
        if (this.f1608h) {
            textPaint.setLetterSpacing(this.f1609i);
        }
    }
}
