package Y0;

import B6.u0;
import android.animation.TypeEvaluator;

/* loaded from: classes.dex */
public final class g implements TypeEvaluator {

    /* renamed from: a, reason: collision with root package name */
    public H.e[] f8509a;

    @Override // android.animation.TypeEvaluator
    public final Object evaluate(float f9, Object obj, Object obj2) {
        H.e[] eVarArr = (H.e[]) obj;
        H.e[] eVarArr2 = (H.e[]) obj2;
        if (u0.g(eVarArr, eVarArr2)) {
            if (!u0.g(this.f8509a, eVarArr)) {
                this.f8509a = u0.v(eVarArr);
            }
            for (int i9 = 0; i9 < eVarArr.length; i9++) {
                H.e eVar = this.f8509a[i9];
                H.e eVar2 = eVarArr[i9];
                H.e eVar3 = eVarArr2[i9];
                eVar.getClass();
                eVar.f2919a = eVar2.f2919a;
                int i10 = 0;
                while (true) {
                    float[] fArr = eVar2.f2920b;
                    if (i10 < fArr.length) {
                        eVar.f2920b[i10] = (eVar3.f2920b[i10] * f9) + ((1.0f - f9) * fArr[i10]);
                        i10++;
                    }
                }
            }
            return this.f8509a;
        }
        throw new IllegalArgumentException("Can't interpolate between two incompatible pathData");
    }
}
