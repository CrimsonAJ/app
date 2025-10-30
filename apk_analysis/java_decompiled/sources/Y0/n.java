package Y0;

import B6.u0;

/* loaded from: classes.dex */
public abstract class n extends m {

    /* renamed from: a, reason: collision with root package name */
    public H.e[] f8532a;

    /* renamed from: b, reason: collision with root package name */
    public String f8533b;

    /* renamed from: c, reason: collision with root package name */
    public int f8534c;

    public n() {
        this.f8532a = null;
        this.f8534c = 0;
    }

    public H.e[] getPathData() {
        return this.f8532a;
    }

    public String getPathName() {
        return this.f8533b;
    }

    public void setPathData(H.e[] eVarArr) {
        if (!u0.g(this.f8532a, eVarArr)) {
            this.f8532a = u0.v(eVarArr);
            return;
        }
        H.e[] eVarArr2 = this.f8532a;
        for (int i9 = 0; i9 < eVarArr.length; i9++) {
            eVarArr2[i9].f2919a = eVarArr[i9].f2919a;
            int i10 = 0;
            while (true) {
                float[] fArr = eVarArr[i9].f2920b;
                if (i10 < fArr.length) {
                    eVarArr2[i9].f2920b[i10] = fArr[i10];
                    i10++;
                }
            }
        }
    }

    public n(n nVar) {
        this.f8532a = null;
        this.f8534c = 0;
        this.f8533b = nVar.f8533b;
        this.f8532a = u0.v(nVar.f8532a);
    }
}
