package p;

import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.util.Log;
import android.widget.TextView;

/* renamed from: p.X, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1777X {
    public static StaticLayout a(CharSequence charSequence, Layout.Alignment alignment, int i9, int i10, TextView textView, TextPaint textPaint, AbstractC1784a0 abstractC1784a0) {
        StaticLayout.Builder obtain = StaticLayout.Builder.obtain(charSequence, 0, charSequence.length(), textPaint, i9);
        StaticLayout.Builder hyphenationFrequency = obtain.setAlignment(alignment).setLineSpacing(textView.getLineSpacingExtra(), textView.getLineSpacingMultiplier()).setIncludePad(textView.getIncludeFontPadding()).setBreakStrategy(textView.getBreakStrategy()).setHyphenationFrequency(textView.getHyphenationFrequency());
        if (i10 == -1) {
            i10 = Integer.MAX_VALUE;
        }
        hyphenationFrequency.setMaxLines(i10);
        try {
            abstractC1784a0.a(obtain, textView);
        } catch (ClassCastException unused) {
            Log.w("ACTVAutoSizeHelper", "Failed to obtain TextDirectionHeuristic, auto size may be incorrect");
        }
        return obtain.build();
    }
}
