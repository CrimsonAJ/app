package f0;

import android.text.Editable;
import android.text.Selection;
import android.text.Spannable;
import android.text.TextWatcher;
import android.widget.EditText;
import d0.C1091i;

/* renamed from: f0.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1157i implements TextWatcher {

    /* renamed from: a, reason: collision with root package name */
    public final EditText f17259a;

    /* renamed from: b, reason: collision with root package name */
    public C1156h f17260b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f17261c = true;

    public C1157i(EditText editText) {
        this.f17259a = editText;
    }

    public static void a(EditText editText, int i9) {
        int length;
        if (i9 == 1 && editText != null && editText.isAttachedToWindow()) {
            Editable editableText = editText.getEditableText();
            int selectionStart = Selection.getSelectionStart(editableText);
            int selectionEnd = Selection.getSelectionEnd(editableText);
            C1091i a5 = C1091i.a();
            if (editableText == null) {
                length = 0;
            } else {
                a5.getClass();
                length = editableText.length();
            }
            a5.e(editableText, 0, length);
            if (selectionStart >= 0 && selectionEnd >= 0) {
                Selection.setSelection(editableText, selectionStart, selectionEnd);
            } else if (selectionStart >= 0) {
                Selection.setSelection(editableText, selectionStart);
            } else if (selectionEnd >= 0) {
                Selection.setSelection(editableText, selectionEnd);
            }
        }
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i9, int i10, int i11) {
        EditText editText = this.f17259a;
        if (!editText.isInEditMode() && this.f17261c && C1091i.f16642k != null && i10 <= i11 && (charSequence instanceof Spannable)) {
            int b9 = C1091i.a().b();
            if (b9 != 0) {
                if (b9 != 1) {
                    if (b9 != 3) {
                        return;
                    }
                } else {
                    C1091i.a().e((Spannable) charSequence, i9, i11 + i9);
                    return;
                }
            }
            C1091i a5 = C1091i.a();
            if (this.f17260b == null) {
                this.f17260b = new C1156h(editText);
            }
            a5.f(this.f17260b);
        }
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i9, int i10, int i11) {
    }
}
