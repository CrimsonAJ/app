package d0;

import android.os.Build;
import android.text.Spannable;
import android.text.SpannableString;
import java.util.stream.IntStream;

/* loaded from: classes.dex */
public final class y implements Spannable {

    /* renamed from: a, reason: collision with root package name */
    public boolean f16687a = false;

    /* renamed from: b, reason: collision with root package name */
    public Spannable f16688b;

    public y(Spannable spannable) {
        this.f16688b = spannable;
    }

    public final void a() {
        w wVar;
        Spannable spannable = this.f16688b;
        if (!this.f16687a) {
            if (Build.VERSION.SDK_INT < 28) {
                wVar = new w(0);
            } else {
                wVar = new w(0);
            }
            if (wVar.q(spannable)) {
                this.f16688b = new SpannableString(spannable);
            }
        }
        this.f16687a = true;
    }

    @Override // java.lang.CharSequence
    public final char charAt(int i9) {
        return this.f16688b.charAt(i9);
    }

    @Override // java.lang.CharSequence
    public final IntStream chars() {
        IntStream chars;
        chars = this.f16688b.chars();
        return chars;
    }

    @Override // java.lang.CharSequence
    public final IntStream codePoints() {
        IntStream codePoints;
        codePoints = this.f16688b.codePoints();
        return codePoints;
    }

    @Override // android.text.Spanned
    public final int getSpanEnd(Object obj) {
        return this.f16688b.getSpanEnd(obj);
    }

    @Override // android.text.Spanned
    public final int getSpanFlags(Object obj) {
        return this.f16688b.getSpanFlags(obj);
    }

    @Override // android.text.Spanned
    public final int getSpanStart(Object obj) {
        return this.f16688b.getSpanStart(obj);
    }

    @Override // android.text.Spanned
    public final Object[] getSpans(int i9, int i10, Class cls) {
        return this.f16688b.getSpans(i9, i10, cls);
    }

    @Override // java.lang.CharSequence
    public final int length() {
        return this.f16688b.length();
    }

    @Override // android.text.Spanned
    public final int nextSpanTransition(int i9, int i10, Class cls) {
        return this.f16688b.nextSpanTransition(i9, i10, cls);
    }

    @Override // android.text.Spannable
    public final void removeSpan(Object obj) {
        a();
        this.f16688b.removeSpan(obj);
    }

    @Override // android.text.Spannable
    public final void setSpan(Object obj, int i9, int i10, int i11) {
        a();
        this.f16688b.setSpan(obj, i9, i10, i11);
    }

    @Override // java.lang.CharSequence
    public final CharSequence subSequence(int i9, int i10) {
        return this.f16688b.subSequence(i9, i10);
    }

    @Override // java.lang.CharSequence
    public final String toString() {
        return this.f16688b.toString();
    }
}
