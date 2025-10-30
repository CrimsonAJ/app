package i5;

import C5.e;
import F5.h;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import co.notix.R;
import java.lang.ref.WeakReference;
import java.text.NumberFormat;
import w5.l;
import w5.m;
import w5.p;

/* renamed from: i5.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1380a extends Drawable implements l {

    /* renamed from: a, reason: collision with root package name */
    public final WeakReference f18655a;

    /* renamed from: b, reason: collision with root package name */
    public final h f18656b;

    /* renamed from: c, reason: collision with root package name */
    public final m f18657c;

    /* renamed from: d, reason: collision with root package name */
    public final Rect f18658d;

    /* renamed from: e, reason: collision with root package name */
    public final C1383d f18659e;

    /* renamed from: f, reason: collision with root package name */
    public float f18660f;

    /* renamed from: g, reason: collision with root package name */
    public float f18661g;

    /* renamed from: h, reason: collision with root package name */
    public final int f18662h;

    /* renamed from: i, reason: collision with root package name */
    public float f18663i;
    public float j;

    /* renamed from: k, reason: collision with root package name */
    public float f18664k;

    /* renamed from: l, reason: collision with root package name */
    public WeakReference f18665l;

    /* renamed from: m, reason: collision with root package name */
    public WeakReference f18666m;

    public C1380a(Context context, C1382c c1382c) {
        int intValue;
        int intValue2;
        FrameLayout frameLayout;
        e eVar;
        WeakReference weakReference = new WeakReference(context);
        this.f18655a = weakReference;
        p.c(context, p.f24313b, "Theme.MaterialComponents");
        this.f18658d = new Rect();
        m mVar = new m(this);
        this.f18657c = mVar;
        TextPaint textPaint = mVar.f24305a;
        textPaint.setTextAlign(Paint.Align.CENTER);
        C1383d c1383d = new C1383d(context, c1382c);
        this.f18659e = c1383d;
        boolean f9 = f();
        C1382c c1382c2 = c1383d.f18698b;
        if (f9) {
            intValue = c1382c2.f18678g.intValue();
        } else {
            intValue = c1382c2.f18676e.intValue();
        }
        if (f()) {
            intValue2 = c1382c2.f18679h.intValue();
        } else {
            intValue2 = c1382c2.f18677f.intValue();
        }
        h hVar = new h(F5.m.a(context, intValue, intValue2, new F5.a(0)).a());
        this.f18656b = hVar;
        h();
        Context context2 = (Context) weakReference.get();
        if (context2 != null && mVar.f24311g != (eVar = new e(context2, c1382c2.f18675d.intValue()))) {
            mVar.c(eVar, context2);
            textPaint.setColor(c1382c2.f18674c.intValue());
            invalidateSelf();
            j();
            invalidateSelf();
        }
        int i9 = c1382c2.f18682l;
        if (i9 != -2) {
            this.f18662h = ((int) Math.pow(10.0d, i9 - 1.0d)) - 1;
        } else {
            this.f18662h = c1382c2.f18683m;
        }
        mVar.f24309e = true;
        j();
        invalidateSelf();
        mVar.f24309e = true;
        h();
        j();
        invalidateSelf();
        textPaint.setAlpha(getAlpha());
        invalidateSelf();
        ColorStateList valueOf = ColorStateList.valueOf(c1382c2.f18673b.intValue());
        if (hVar.f2483a.f2468c != valueOf) {
            hVar.k(valueOf);
            invalidateSelf();
        }
        textPaint.setColor(c1382c2.f18674c.intValue());
        invalidateSelf();
        WeakReference weakReference2 = this.f18665l;
        if (weakReference2 != null && weakReference2.get() != null) {
            View view = (View) this.f18665l.get();
            WeakReference weakReference3 = this.f18666m;
            if (weakReference3 != null) {
                frameLayout = (FrameLayout) weakReference3.get();
            } else {
                frameLayout = null;
            }
            i(view, frameLayout);
        }
        j();
        setVisible(c1382c2.f18690t.booleanValue(), false);
    }

    @Override // w5.l
    public final void a() {
        invalidateSelf();
    }

    public final String b() {
        boolean z9;
        int i9 = this.f18662h;
        C1383d c1383d = this.f18659e;
        C1382c c1382c = c1383d.f18698b;
        String str = c1382c.j;
        if (str != null) {
            z9 = true;
        } else {
            z9 = false;
        }
        WeakReference weakReference = this.f18655a;
        if (z9) {
            int i10 = c1382c.f18682l;
            if (i10 != -2 && str != null && str.length() > i10) {
                Context context = (Context) weakReference.get();
                if (context != null) {
                    return String.format(context.getString(R.string.m3_exceed_max_badge_text_suffix), str.substring(0, i10 - 1), "…");
                }
                return "";
            }
            return str;
        }
        if (g()) {
            C1382c c1382c2 = c1383d.f18698b;
            if (i9 != -2 && e() > i9) {
                Context context2 = (Context) weakReference.get();
                if (context2 == null) {
                    return "";
                }
                return String.format(c1382c2.f18684n, context2.getString(R.string.mtrl_exceed_max_badge_number_suffix), Integer.valueOf(i9), "+");
            }
            return NumberFormat.getInstance(c1382c2.f18684n).format(e());
        }
        return null;
    }

    public final CharSequence c() {
        Context context;
        int i9 = this.f18662h;
        if (isVisible()) {
            C1383d c1383d = this.f18659e;
            C1382c c1382c = c1383d.f18698b;
            String str = c1382c.j;
            if (str != null) {
                String str2 = c1382c.f18685o;
                if (str2 != null) {
                    return str2;
                }
                return str;
            }
            boolean g9 = g();
            C1382c c1382c2 = c1383d.f18698b;
            if (g9) {
                if (c1382c2.f18687q != 0 && (context = (Context) this.f18655a.get()) != null) {
                    if (i9 != -2 && e() > i9) {
                        return context.getString(c1382c2.f18688r, Integer.valueOf(i9));
                    }
                    return context.getResources().getQuantityString(c1382c2.f18687q, e(), Integer.valueOf(e()));
                }
                return null;
            }
            return c1382c2.f18686p;
        }
        return null;
    }

    public final FrameLayout d() {
        WeakReference weakReference = this.f18666m;
        if (weakReference != null) {
            return (FrameLayout) weakReference.get();
        }
        return null;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        String b9;
        int round;
        if (!getBounds().isEmpty() && getAlpha() != 0 && isVisible()) {
            this.f18656b.draw(canvas);
            if (f() && (b9 = b()) != null) {
                Rect rect = new Rect();
                m mVar = this.f18657c;
                mVar.f24305a.getTextBounds(b9, 0, b9.length(), rect);
                float exactCenterY = this.f18661g - rect.exactCenterY();
                float f9 = this.f18660f;
                if (rect.bottom <= 0) {
                    round = (int) exactCenterY;
                } else {
                    round = Math.round(exactCenterY);
                }
                canvas.drawText(b9, f9, round, mVar.f24305a);
            }
        }
    }

    public final int e() {
        int i9 = this.f18659e.f18698b.f18681k;
        if (i9 != -1) {
            return i9;
        }
        return 0;
    }

    public final boolean f() {
        if (this.f18659e.f18698b.j != null || g()) {
            return true;
        }
        return false;
    }

    public final boolean g() {
        C1382c c1382c = this.f18659e.f18698b;
        if (c1382c.j == null && c1382c.f18681k != -1) {
            return true;
        }
        return false;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.f18659e.f18698b.f18680i;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return this.f18658d.height();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return this.f18658d.width();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    public final void h() {
        int intValue;
        int intValue2;
        Context context = (Context) this.f18655a.get();
        if (context == null) {
            return;
        }
        boolean f9 = f();
        C1383d c1383d = this.f18659e;
        if (f9) {
            intValue = c1383d.f18698b.f18678g.intValue();
        } else {
            intValue = c1383d.f18698b.f18676e.intValue();
        }
        if (f()) {
            intValue2 = c1383d.f18698b.f18679h.intValue();
        } else {
            intValue2 = c1383d.f18698b.f18677f.intValue();
        }
        this.f18656b.setShapeAppearanceModel(F5.m.a(context, intValue, intValue2, new F5.a(0)).a());
        invalidateSelf();
    }

    public final void i(View view, FrameLayout frameLayout) {
        this.f18665l = new WeakReference(view);
        this.f18666m = new WeakReference(frameLayout);
        ViewGroup viewGroup = (ViewGroup) view.getParent();
        viewGroup.setClipChildren(false);
        viewGroup.setClipToPadding(false);
        j();
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:63:0x0218  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0239  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0256  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0263  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0270  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x027d  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0251  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0230  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void j() {
        /*
            Method dump skipped, instructions count: 728
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: i5.C1380a.j():void");
    }

    @Override // android.graphics.drawable.Drawable, w5.l
    public final boolean onStateChange(int[] iArr) {
        return super.onStateChange(iArr);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i9) {
        C1383d c1383d = this.f18659e;
        c1383d.f18697a.f18680i = i9;
        c1383d.f18698b.f18680i = i9;
        this.f18657c.f24305a.setAlpha(getAlpha());
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
