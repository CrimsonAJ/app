package w5;

import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.TextUtils;

/* loaded from: classes.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public CharSequence f24294a;

    /* renamed from: b, reason: collision with root package name */
    public final TextPaint f24295b;

    /* renamed from: c, reason: collision with root package name */
    public final int f24296c;

    /* renamed from: d, reason: collision with root package name */
    public int f24297d;

    /* renamed from: k, reason: collision with root package name */
    public boolean f24303k;

    /* renamed from: e, reason: collision with root package name */
    public Layout.Alignment f24298e = Layout.Alignment.ALIGN_NORMAL;

    /* renamed from: f, reason: collision with root package name */
    public int f24299f = Integer.MAX_VALUE;

    /* renamed from: g, reason: collision with root package name */
    public float f24300g = 0.0f;

    /* renamed from: h, reason: collision with root package name */
    public float f24301h = 1.0f;

    /* renamed from: i, reason: collision with root package name */
    public int f24302i = 1;
    public boolean j = true;

    /* renamed from: l, reason: collision with root package name */
    public TextUtils.TruncateAt f24304l = null;

    public k(CharSequence charSequence, TextPaint textPaint, int i9) {
        this.f24294a = charSequence;
        this.f24295b = textPaint;
        this.f24296c = i9;
        this.f24297d = charSequence.length();
    }

    public final StaticLayout a() {
        TextDirectionHeuristic textDirectionHeuristic;
        if (this.f24294a == null) {
            this.f24294a = "";
        }
        int max = Math.max(0, this.f24296c);
        CharSequence charSequence = this.f24294a;
        int i9 = this.f24299f;
        TextPaint textPaint = this.f24295b;
        if (i9 == 1) {
            charSequence = TextUtils.ellipsize(charSequence, textPaint, max, this.f24304l);
        }
        int min = Math.min(charSequence.length(), this.f24297d);
        this.f24297d = min;
        if (this.f24303k && this.f24299f == 1) {
            this.f24298e = Layout.Alignment.ALIGN_OPPOSITE;
        }
        StaticLayout.Builder obtain = StaticLayout.Builder.obtain(charSequence, 0, min, textPaint, max);
        obtain.setAlignment(this.f24298e);
        obtain.setIncludePad(this.j);
        if (this.f24303k) {
            textDirectionHeuristic = TextDirectionHeuristics.RTL;
        } else {
            textDirectionHeuristic = TextDirectionHeuristics.LTR;
        }
        obtain.setTextDirection(textDirectionHeuristic);
        TextUtils.TruncateAt truncateAt = this.f24304l;
        if (truncateAt != null) {
            obtain.setEllipsize(truncateAt);
        }
        obtain.setMaxLines(this.f24299f);
        float f9 = this.f24300g;
        if (f9 != 0.0f || this.f24301h != 1.0f) {
            obtain.setLineSpacing(f9, this.f24301h);
        }
        if (this.f24299f > 1) {
            obtain.setHyphenationFrequency(this.f24302i);
        }
        return obtain.build();
    }
}
