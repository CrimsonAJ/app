package d0;

import android.util.SparseArray;

/* loaded from: classes.dex */
public final class r {

    /* renamed from: a, reason: collision with root package name */
    public final SparseArray f16671a;

    /* renamed from: b, reason: collision with root package name */
    public u f16672b;

    public r(int i9) {
        this.f16671a = new SparseArray(i9);
    }

    public final void a(u uVar, int i9, int i10) {
        r rVar;
        int a5 = uVar.a(i9);
        SparseArray sparseArray = this.f16671a;
        if (sparseArray == null) {
            rVar = null;
        } else {
            rVar = (r) sparseArray.get(a5);
        }
        if (rVar == null) {
            rVar = new r(1);
            sparseArray.put(uVar.a(i9), rVar);
        }
        if (i10 > i9) {
            rVar.a(uVar, i9 + 1, i10);
        } else {
            rVar.f16672b = uVar;
        }
    }
}
