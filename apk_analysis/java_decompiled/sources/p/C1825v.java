package p;

import android.content.res.TypedArray;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.widget.TextView;
import b7.C0701c;
import com.google.android.gms.internal.measurement.D1;
import h.AbstractC1260a;

/* renamed from: p.v, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1825v {

    /* renamed from: a, reason: collision with root package name */
    public final TextView f22082a;

    /* renamed from: b, reason: collision with root package name */
    public final C0701c f22083b;

    public C1825v(TextView textView) {
        this.f22082a = textView;
        this.f22083b = new C0701c(textView);
    }

    public final InputFilter[] a(InputFilter[] inputFilterArr) {
        return ((D1) this.f22083b.f11404b).u(inputFilterArr);
    }

    public final void b(AttributeSet attributeSet, int i9) {
        TypedArray obtainStyledAttributes = this.f22082a.getContext().obtainStyledAttributes(attributeSet, AbstractC1260a.f17813i, i9, 0);
        try {
            boolean z9 = true;
            if (obtainStyledAttributes.hasValue(14)) {
                z9 = obtainStyledAttributes.getBoolean(14, true);
            }
            obtainStyledAttributes.recycle();
            d(z9);
        } catch (Throwable th) {
            obtainStyledAttributes.recycle();
            throw th;
        }
    }

    public final void c(boolean z9) {
        ((D1) this.f22083b.f11404b).H(z9);
    }

    public final void d(boolean z9) {
        ((D1) this.f22083b.f11404b).I(z9);
    }
}
