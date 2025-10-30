package f0;

import android.text.InputFilter;
import android.text.Spanned;
import android.widget.TextView;
import d0.C1091i;

/* renamed from: f0.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1152d implements InputFilter {

    /* renamed from: a, reason: collision with root package name */
    public final TextView f17249a;

    /* renamed from: b, reason: collision with root package name */
    public C1151c f17250b;

    public C1152d(TextView textView) {
        this.f17249a = textView;
    }

    @Override // android.text.InputFilter
    public final CharSequence filter(CharSequence charSequence, int i9, int i10, Spanned spanned, int i11, int i12) {
        TextView textView = this.f17249a;
        if (!textView.isInEditMode()) {
            int b9 = C1091i.a().b();
            if (b9 != 0) {
                if (b9 != 1) {
                    if (b9 != 3) {
                        return charSequence;
                    }
                } else {
                    if ((i12 != 0 || i11 != 0 || spanned.length() != 0 || charSequence != textView.getText()) && charSequence != null) {
                        if (i9 != 0 || i10 != charSequence.length()) {
                            charSequence = charSequence.subSequence(i9, i10);
                        }
                        return C1091i.a().e(charSequence, 0, charSequence.length());
                    }
                    return charSequence;
                }
            }
            C1091i a5 = C1091i.a();
            if (this.f17250b == null) {
                this.f17250b = new C1151c(textView, this);
            }
            a5.f(this.f17250b);
            return charSequence;
        }
        return charSequence;
    }
}
