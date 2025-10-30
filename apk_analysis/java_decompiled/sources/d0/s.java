package d0;

import android.os.Build;
import android.text.Editable;
import android.text.SpanWatcher;
import android.text.Spannable;
import android.text.TextWatcher;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public final class s implements TextWatcher, SpanWatcher {

    /* renamed from: a, reason: collision with root package name */
    public final Object f16673a;

    /* renamed from: b, reason: collision with root package name */
    public final AtomicInteger f16674b = new AtomicInteger(0);

    public s(Object obj) {
        this.f16673a = obj;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        ((TextWatcher) this.f16673a).afterTextChanged(editable);
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i9, int i10, int i11) {
        ((TextWatcher) this.f16673a).beforeTextChanged(charSequence, i9, i10, i11);
    }

    @Override // android.text.SpanWatcher
    public final void onSpanAdded(Spannable spannable, Object obj, int i9, int i10) {
        if (this.f16674b.get() > 0 && (obj instanceof v)) {
            return;
        }
        ((SpanWatcher) this.f16673a).onSpanAdded(spannable, obj, i9, i10);
    }

    @Override // android.text.SpanWatcher
    public final void onSpanChanged(Spannable spannable, Object obj, int i9, int i10, int i11, int i12) {
        int i13;
        int i14;
        if (this.f16674b.get() > 0 && (obj instanceof v)) {
            return;
        }
        if (Build.VERSION.SDK_INT < 28) {
            if (i9 > i10) {
                i9 = 0;
            }
            if (i11 > i12) {
                i13 = i9;
                i14 = 0;
                ((SpanWatcher) this.f16673a).onSpanChanged(spannable, obj, i13, i10, i14, i12);
            }
        }
        i13 = i9;
        i14 = i11;
        ((SpanWatcher) this.f16673a).onSpanChanged(spannable, obj, i13, i10, i14, i12);
    }

    @Override // android.text.SpanWatcher
    public final void onSpanRemoved(Spannable spannable, Object obj, int i9, int i10) {
        if (this.f16674b.get() > 0 && (obj instanceof v)) {
            return;
        }
        ((SpanWatcher) this.f16673a).onSpanRemoved(spannable, obj, i9, i10);
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i9, int i10, int i11) {
        ((TextWatcher) this.f16673a).onTextChanged(charSequence, i9, i10, i11);
    }
}
