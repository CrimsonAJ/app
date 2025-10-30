package w5;

import android.content.Context;
import android.text.TextPaint;
import java.lang.ref.WeakReference;
import q5.C1914a;

/* loaded from: classes.dex */
public final class m {

    /* renamed from: c, reason: collision with root package name */
    public float f24307c;

    /* renamed from: d, reason: collision with root package name */
    public float f24308d;

    /* renamed from: f, reason: collision with root package name */
    public final WeakReference f24310f;

    /* renamed from: g, reason: collision with root package name */
    public C5.e f24311g;

    /* renamed from: a, reason: collision with root package name */
    public final TextPaint f24305a = new TextPaint(1);

    /* renamed from: b, reason: collision with root package name */
    public final C1914a f24306b = new C1914a(1, this);

    /* renamed from: e, reason: collision with root package name */
    public boolean f24309e = true;

    public m(l lVar) {
        this.f24310f = new WeakReference(null);
        this.f24310f = new WeakReference(lVar);
    }

    public final float a(String str) {
        if (!this.f24309e) {
            return this.f24307c;
        }
        b(str);
        return this.f24307c;
    }

    public final void b(String str) {
        float measureText;
        TextPaint textPaint = this.f24305a;
        float f9 = 0.0f;
        if (str == null) {
            measureText = 0.0f;
        } else {
            measureText = textPaint.measureText((CharSequence) str, 0, str.length());
        }
        this.f24307c = measureText;
        if (str != null) {
            f9 = Math.abs(textPaint.getFontMetrics().ascent);
        }
        this.f24308d = f9;
        this.f24309e = false;
    }

    public final void c(C5.e eVar, Context context) {
        if (this.f24311g != eVar) {
            this.f24311g = eVar;
            if (eVar != null) {
                TextPaint textPaint = this.f24305a;
                C1914a c1914a = this.f24306b;
                eVar.f(context, textPaint, c1914a);
                l lVar = (l) this.f24310f.get();
                if (lVar != null) {
                    textPaint.drawableState = lVar.getState();
                }
                eVar.e(context, textPaint, c1914a);
                this.f24309e = true;
            }
            l lVar2 = (l) this.f24310f.get();
            if (lVar2 != null) {
                lVar2.a();
                lVar2.onStateChange(lVar2.getState());
            }
        }
    }
}
