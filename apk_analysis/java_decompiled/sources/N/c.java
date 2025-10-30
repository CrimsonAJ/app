package N;

import android.os.Build;
import android.os.LocaleList;
import android.text.PrecomputedText;
import android.text.TextDirectionHeuristic;
import android.text.TextPaint;
import java.util.Objects;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final TextPaint f4805a;

    /* renamed from: b, reason: collision with root package name */
    public final TextDirectionHeuristic f4806b;

    /* renamed from: c, reason: collision with root package name */
    public final int f4807c;

    /* renamed from: d, reason: collision with root package name */
    public final int f4808d;

    public c(TextPaint textPaint, TextDirectionHeuristic textDirectionHeuristic, int i9, int i10) {
        PrecomputedText.Params.Builder breakStrategy;
        PrecomputedText.Params.Builder hyphenationFrequency;
        PrecomputedText.Params.Builder textDirection;
        if (Build.VERSION.SDK_INT >= 29) {
            breakStrategy = C5.f.k(textPaint).setBreakStrategy(i9);
            hyphenationFrequency = breakStrategy.setHyphenationFrequency(i10);
            textDirection = hyphenationFrequency.setTextDirection(textDirectionHeuristic);
            textDirection.build();
        }
        this.f4805a = textPaint;
        this.f4806b = textDirectionHeuristic;
        this.f4807c = i9;
        this.f4808d = i10;
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0083, code lost:
    
        if (r0 == false) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0099, code lost:
    
        if (r2.getTypeface() != null) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x009f, code lost:
    
        if (r4.getTypeface() == null) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00b5, code lost:
    
        if (r6.f4806b != r7.f4806b) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00b7, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00ae, code lost:
    
        if (r2.getTypeface().equals(r4.getTypeface()) != false) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0092, code lost:
    
        if (r2.getTextLocale().equals(r4.getTextLocale()) == false) goto L46;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean equals(java.lang.Object r7) {
        /*
            r6 = this;
            if (r7 != r6) goto L4
            goto Lb7
        L4:
            boolean r0 = r7 instanceof N.c
            r1 = 0
            if (r0 != 0) goto Lb
            goto Lb9
        Lb:
            N.c r7 = (N.c) r7
            int r0 = android.os.Build.VERSION.SDK_INT
            int r2 = r7.f4807c
            int r3 = r6.f4807c
            if (r3 == r2) goto L17
            goto Lb0
        L17:
            int r2 = r6.f4808d
            int r3 = r7.f4808d
            if (r2 == r3) goto L1f
            goto Lb0
        L1f:
            android.text.TextPaint r2 = r6.f4805a
            float r3 = r2.getTextSize()
            android.text.TextPaint r4 = r7.f4805a
            float r5 = r4.getTextSize()
            int r3 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r3 == 0) goto L31
            goto Lb0
        L31:
            float r3 = r2.getTextScaleX()
            float r5 = r4.getTextScaleX()
            int r3 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r3 == 0) goto L3f
            goto Lb0
        L3f:
            float r3 = r2.getTextSkewX()
            float r5 = r4.getTextSkewX()
            int r3 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r3 == 0) goto L4c
            goto Lb0
        L4c:
            float r3 = r2.getLetterSpacing()
            float r5 = r4.getLetterSpacing()
            int r3 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r3 == 0) goto L59
            goto Lb0
        L59:
            java.lang.String r3 = r2.getFontFeatureSettings()
            java.lang.String r5 = r4.getFontFeatureSettings()
            boolean r3 = android.text.TextUtils.equals(r3, r5)
            if (r3 != 0) goto L68
            goto Lb0
        L68:
            int r3 = r2.getFlags()
            int r5 = r4.getFlags()
            if (r3 == r5) goto L73
            goto Lb0
        L73:
            r3 = 24
            if (r0 < r3) goto L86
            android.os.LocaleList r0 = C3.d.h(r2)
            android.os.LocaleList r3 = C3.d.h(r4)
            boolean r0 = com.google.android.material.datepicker.u.w(r3, r0)
            if (r0 != 0) goto L95
            goto Lb0
        L86:
            java.util.Locale r0 = r2.getTextLocale()
            java.util.Locale r3 = r4.getTextLocale()
            boolean r0 = r0.equals(r3)
            if (r0 != 0) goto L95
            goto Lb0
        L95:
            android.graphics.Typeface r0 = r2.getTypeface()
            if (r0 != 0) goto La2
            android.graphics.Typeface r0 = r4.getTypeface()
            if (r0 == 0) goto Lb1
            goto Lb0
        La2:
            android.graphics.Typeface r0 = r2.getTypeface()
            android.graphics.Typeface r2 = r4.getTypeface()
            boolean r0 = r0.equals(r2)
            if (r0 != 0) goto Lb1
        Lb0:
            return r1
        Lb1:
            android.text.TextDirectionHeuristic r0 = r6.f4806b
            android.text.TextDirectionHeuristic r7 = r7.f4806b
            if (r0 != r7) goto Lb9
        Lb7:
            r7 = 1
            return r7
        Lb9:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: N.c.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        LocaleList textLocales;
        TextDirectionHeuristic textDirectionHeuristic = this.f4806b;
        int i9 = Build.VERSION.SDK_INT;
        int i10 = this.f4808d;
        int i11 = this.f4807c;
        TextPaint textPaint = this.f4805a;
        if (i9 >= 24) {
            Float valueOf = Float.valueOf(textPaint.getTextSize());
            Float valueOf2 = Float.valueOf(textPaint.getTextScaleX());
            Float valueOf3 = Float.valueOf(textPaint.getTextSkewX());
            Float valueOf4 = Float.valueOf(textPaint.getLetterSpacing());
            Integer valueOf5 = Integer.valueOf(textPaint.getFlags());
            textLocales = textPaint.getTextLocales();
            return Objects.hash(valueOf, valueOf2, valueOf3, valueOf4, valueOf5, textLocales, textPaint.getTypeface(), Boolean.valueOf(textPaint.isElegantTextHeight()), textDirectionHeuristic, Integer.valueOf(i11), Integer.valueOf(i10));
        }
        return Objects.hash(Float.valueOf(textPaint.getTextSize()), Float.valueOf(textPaint.getTextScaleX()), Float.valueOf(textPaint.getTextSkewX()), Float.valueOf(textPaint.getLetterSpacing()), Integer.valueOf(textPaint.getFlags()), textPaint.getTextLocale(), textPaint.getTypeface(), Boolean.valueOf(textPaint.isElegantTextHeight()), textDirectionHeuristic, Integer.valueOf(i11), Integer.valueOf(i10));
    }

    public final String toString() {
        String fontVariationSettings;
        LocaleList textLocales;
        StringBuilder sb = new StringBuilder("{");
        StringBuilder sb2 = new StringBuilder("textSize=");
        TextPaint textPaint = this.f4805a;
        sb2.append(textPaint.getTextSize());
        sb.append(sb2.toString());
        sb.append(", textScaleX=" + textPaint.getTextScaleX());
        sb.append(", textSkewX=" + textPaint.getTextSkewX());
        int i9 = Build.VERSION.SDK_INT;
        sb.append(", letterSpacing=" + textPaint.getLetterSpacing());
        sb.append(", elegantTextHeight=" + textPaint.isElegantTextHeight());
        if (i9 >= 24) {
            StringBuilder sb3 = new StringBuilder(", textLocale=");
            textLocales = textPaint.getTextLocales();
            sb3.append(textLocales);
            sb.append(sb3.toString());
        } else {
            sb.append(", textLocale=" + textPaint.getTextLocale());
        }
        sb.append(", typeface=" + textPaint.getTypeface());
        if (i9 >= 26) {
            StringBuilder sb4 = new StringBuilder(", variationSettings=");
            fontVariationSettings = textPaint.getFontVariationSettings();
            sb4.append(fontVariationSettings);
            sb.append(sb4.toString());
        }
        sb.append(", textDir=" + this.f4806b);
        sb.append(", breakStrategy=" + this.f4807c);
        sb.append(", hyphenationFrequency=" + this.f4808d);
        sb.append("}");
        return sb.toString();
    }

    public c(PrecomputedText.Params params) {
        TextPaint textPaint;
        TextDirectionHeuristic textDirection;
        int breakStrategy;
        int hyphenationFrequency;
        textPaint = params.getTextPaint();
        this.f4805a = textPaint;
        textDirection = params.getTextDirection();
        this.f4806b = textDirection;
        breakStrategy = params.getBreakStrategy();
        this.f4807c = breakStrategy;
        hyphenationFrequency = params.getHyphenationFrequency();
        this.f4808d = hyphenationFrequency;
    }
}
