package f0;

import android.text.InputFilter;
import android.text.Selection;
import android.text.Spannable;
import android.widget.TextView;
import d0.AbstractC1089g;
import d0.C1091i;
import java.lang.ref.WeakReference;

/* renamed from: f0.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1151c extends AbstractC1089g {

    /* renamed from: a, reason: collision with root package name */
    public final WeakReference f17247a;

    /* renamed from: b, reason: collision with root package name */
    public final WeakReference f17248b;

    public C1151c(TextView textView, C1152d c1152d) {
        this.f17247a = new WeakReference(textView);
        this.f17248b = new WeakReference(c1152d);
    }

    @Override // d0.AbstractC1089g
    public final void b() {
        InputFilter[] filters;
        int length;
        TextView textView = (TextView) this.f17247a.get();
        InputFilter inputFilter = (InputFilter) this.f17248b.get();
        if (inputFilter != null && textView != null && (filters = textView.getFilters()) != null) {
            for (InputFilter inputFilter2 : filters) {
                if (inputFilter2 == inputFilter) {
                    if (textView.isAttachedToWindow()) {
                        CharSequence text = textView.getText();
                        C1091i a5 = C1091i.a();
                        if (text == null) {
                            length = 0;
                        } else {
                            a5.getClass();
                            length = text.length();
                        }
                        CharSequence e8 = a5.e(text, 0, length);
                        if (text != e8) {
                            int selectionStart = Selection.getSelectionStart(e8);
                            int selectionEnd = Selection.getSelectionEnd(e8);
                            textView.setText(e8);
                            if (e8 instanceof Spannable) {
                                Spannable spannable = (Spannable) e8;
                                if (selectionStart >= 0 && selectionEnd >= 0) {
                                    Selection.setSelection(spannable, selectionStart, selectionEnd);
                                    return;
                                } else if (selectionStart >= 0) {
                                    Selection.setSelection(spannable, selectionStart);
                                    return;
                                } else {
                                    if (selectionEnd >= 0) {
                                        Selection.setSelection(spannable, selectionEnd);
                                        return;
                                    }
                                    return;
                                }
                            }
                            return;
                        }
                        return;
                    }
                    return;
                }
            }
        }
    }
}
