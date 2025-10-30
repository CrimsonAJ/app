package f0;

import android.text.InputFilter;
import android.text.method.TransformationMethod;
import android.widget.TextView;
import com.google.android.gms.internal.measurement.D1;
import d0.C1091i;

/* renamed from: f0.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1155g extends D1 {

    /* renamed from: g, reason: collision with root package name */
    public final C1154f f17256g;

    public C1155g(TextView textView) {
        this.f17256g = new C1154f(textView);
    }

    @Override // com.google.android.gms.internal.measurement.D1
    public final boolean B() {
        return this.f17256g.f17255i;
    }

    @Override // com.google.android.gms.internal.measurement.D1
    public final void H(boolean z9) {
        boolean z10;
        if (C1091i.f16642k != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10) {
            return;
        }
        this.f17256g.H(z9);
    }

    @Override // com.google.android.gms.internal.measurement.D1
    public final void I(boolean z9) {
        boolean z10;
        if (C1091i.f16642k != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        C1154f c1154f = this.f17256g;
        if (!z10) {
            c1154f.f17255i = z9;
        } else {
            c1154f.I(z9);
        }
    }

    @Override // com.google.android.gms.internal.measurement.D1
    public final TransformationMethod M(TransformationMethod transformationMethod) {
        boolean z9;
        if (C1091i.f16642k != null) {
            z9 = true;
        } else {
            z9 = false;
        }
        if (!z9) {
            return transformationMethod;
        }
        return this.f17256g.M(transformationMethod);
    }

    @Override // com.google.android.gms.internal.measurement.D1
    public final InputFilter[] u(InputFilter[] inputFilterArr) {
        boolean z9;
        if (C1091i.f16642k != null) {
            z9 = true;
        } else {
            z9 = false;
        }
        if (!z9) {
            return inputFilterArr;
        }
        return this.f17256g.u(inputFilterArr);
    }
}
