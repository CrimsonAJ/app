package K5;

import P.C0301b;
import android.os.Build;
import android.text.TextUtils;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.EditText;
import androidx.appcompat.widget.AppCompatTextView;
import com.google.android.material.textfield.TextInputLayout;

/* loaded from: classes.dex */
public final class B extends C0301b {

    /* renamed from: d, reason: collision with root package name */
    public final TextInputLayout f4309d;

    public B(TextInputLayout textInputLayout) {
        this.f4309d = textInputLayout;
    }

    @Override // P.C0301b
    public final void d(View view, Q.g gVar) {
        CharSequence charSequence;
        boolean z9;
        String str;
        View.AccessibilityDelegate accessibilityDelegate = this.f5573a;
        AccessibilityNodeInfo accessibilityNodeInfo = gVar.f6035a;
        accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
        TextInputLayout textInputLayout = this.f4309d;
        EditText editText = textInputLayout.getEditText();
        if (editText != null) {
            charSequence = editText.getText();
        } else {
            charSequence = null;
        }
        CharSequence hint = textInputLayout.getHint();
        CharSequence error = textInputLayout.getError();
        CharSequence placeholderText = textInputLayout.getPlaceholderText();
        int counterMaxLength = textInputLayout.getCounterMaxLength();
        CharSequence counterOverflowDescription = textInputLayout.getCounterOverflowDescription();
        boolean isEmpty = TextUtils.isEmpty(charSequence);
        boolean isEmpty2 = TextUtils.isEmpty(hint);
        boolean z10 = textInputLayout.f16192S0;
        boolean isEmpty3 = TextUtils.isEmpty(error);
        if (isEmpty3 && TextUtils.isEmpty(counterOverflowDescription)) {
            z9 = false;
        } else {
            z9 = true;
        }
        if (!isEmpty2) {
            str = hint.toString();
        } else {
            str = "";
        }
        z zVar = textInputLayout.f16201b;
        AppCompatTextView appCompatTextView = zVar.f4432b;
        if (appCompatTextView.getVisibility() == 0) {
            accessibilityNodeInfo.setLabelFor(appCompatTextView);
            accessibilityNodeInfo.setTraversalAfter(appCompatTextView);
        } else {
            accessibilityNodeInfo.setTraversalAfter(zVar.f4434d);
        }
        if (!isEmpty) {
            gVar.m(charSequence);
        } else if (!TextUtils.isEmpty(str)) {
            gVar.m(str);
            if (!z10 && placeholderText != null) {
                gVar.m(str + ", " + ((Object) placeholderText));
            }
        } else if (placeholderText != null) {
            gVar.m(placeholderText);
        }
        if (!TextUtils.isEmpty(str)) {
            int i9 = Build.VERSION.SDK_INT;
            if (i9 >= 26) {
                gVar.k(str);
            } else {
                if (!isEmpty) {
                    str = ((Object) charSequence) + ", " + str;
                }
                gVar.m(str);
            }
            if (i9 >= 26) {
                accessibilityNodeInfo.setShowingHintText(isEmpty);
            } else {
                gVar.h(4, isEmpty);
            }
        }
        if (charSequence == null || charSequence.length() != counterMaxLength) {
            counterMaxLength = -1;
        }
        accessibilityNodeInfo.setMaxTextLength(counterMaxLength);
        if (z9) {
            if (isEmpty3) {
                error = counterOverflowDescription;
            }
            accessibilityNodeInfo.setError(error);
        }
        AppCompatTextView appCompatTextView2 = textInputLayout.j.f4414y;
        if (appCompatTextView2 != null) {
            accessibilityNodeInfo.setLabelFor(appCompatTextView2);
        }
        textInputLayout.f16202c.b().n(gVar);
    }

    @Override // P.C0301b
    public final void e(View view, AccessibilityEvent accessibilityEvent) {
        super.e(view, accessibilityEvent);
        this.f4309d.f16202c.b().o(accessibilityEvent);
    }
}
