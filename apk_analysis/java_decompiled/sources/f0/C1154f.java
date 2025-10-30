package f0;

import android.text.InputFilter;
import android.text.method.PasswordTransformationMethod;
import android.text.method.TransformationMethod;
import android.util.SparseArray;
import android.widget.TextView;
import com.google.android.gms.internal.measurement.D1;

/* renamed from: f0.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1154f extends D1 {

    /* renamed from: g, reason: collision with root package name */
    public final TextView f17253g;

    /* renamed from: h, reason: collision with root package name */
    public final C1152d f17254h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f17255i = true;

    public C1154f(TextView textView) {
        this.f17253g = textView;
        this.f17254h = new C1152d(textView);
    }

    @Override // com.google.android.gms.internal.measurement.D1
    public final boolean B() {
        return this.f17255i;
    }

    @Override // com.google.android.gms.internal.measurement.D1
    public final void H(boolean z9) {
        if (z9) {
            TextView textView = this.f17253g;
            textView.setTransformationMethod(M(textView.getTransformationMethod()));
        }
    }

    @Override // com.google.android.gms.internal.measurement.D1
    public final void I(boolean z9) {
        this.f17255i = z9;
        TextView textView = this.f17253g;
        textView.setTransformationMethod(M(textView.getTransformationMethod()));
        textView.setFilters(u(textView.getFilters()));
    }

    @Override // com.google.android.gms.internal.measurement.D1
    public final TransformationMethod M(TransformationMethod transformationMethod) {
        if (this.f17255i) {
            if (transformationMethod instanceof C1158j) {
                return transformationMethod;
            }
            if (transformationMethod instanceof PasswordTransformationMethod) {
                return transformationMethod;
            }
            return new C1158j(transformationMethod);
        }
        if (transformationMethod instanceof C1158j) {
            return ((C1158j) transformationMethod).f17262a;
        }
        return transformationMethod;
    }

    @Override // com.google.android.gms.internal.measurement.D1
    public final InputFilter[] u(InputFilter[] inputFilterArr) {
        if (!this.f17255i) {
            SparseArray sparseArray = new SparseArray(1);
            for (int i9 = 0; i9 < inputFilterArr.length; i9++) {
                InputFilter inputFilter = inputFilterArr[i9];
                if (inputFilter instanceof C1152d) {
                    sparseArray.put(i9, inputFilter);
                }
            }
            if (sparseArray.size() == 0) {
                return inputFilterArr;
            }
            int length = inputFilterArr.length;
            InputFilter[] inputFilterArr2 = new InputFilter[inputFilterArr.length - sparseArray.size()];
            int i10 = 0;
            for (int i11 = 0; i11 < length; i11++) {
                if (sparseArray.indexOfKey(i11) < 0) {
                    inputFilterArr2[i10] = inputFilterArr[i11];
                    i10++;
                }
            }
            return inputFilterArr2;
        }
        int length2 = inputFilterArr.length;
        int i12 = 0;
        while (true) {
            C1152d c1152d = this.f17254h;
            if (i12 < length2) {
                if (inputFilterArr[i12] == c1152d) {
                    return inputFilterArr;
                }
                i12++;
            } else {
                InputFilter[] inputFilterArr3 = new InputFilter[inputFilterArr.length + 1];
                System.arraycopy(inputFilterArr, 0, inputFilterArr3, 0, length2);
                inputFilterArr3[length2] = c1152d;
                return inputFilterArr3;
            }
        }
    }
}
