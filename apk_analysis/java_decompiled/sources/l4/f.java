package l4;

import android.util.SparseBooleanArray;

/* loaded from: classes.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final SparseBooleanArray f20498a;

    public f(SparseBooleanArray sparseBooleanArray) {
        this.f20498a = sparseBooleanArray;
    }

    public final int a(int i9) {
        SparseBooleanArray sparseBooleanArray = this.f20498a;
        AbstractC1566a.k(i9, sparseBooleanArray.size());
        return sparseBooleanArray.keyAt(i9);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        int i9 = y.f20553a;
        SparseBooleanArray sparseBooleanArray = this.f20498a;
        if (i9 < 24) {
            if (sparseBooleanArray.size() != fVar.f20498a.size()) {
                return false;
            }
            for (int i10 = 0; i10 < sparseBooleanArray.size(); i10++) {
                if (a(i10) != fVar.a(i10)) {
                    return false;
                }
            }
            return true;
        }
        return sparseBooleanArray.equals(fVar.f20498a);
    }

    public final int hashCode() {
        int i9 = y.f20553a;
        SparseBooleanArray sparseBooleanArray = this.f20498a;
        if (i9 < 24) {
            int size = sparseBooleanArray.size();
            for (int i10 = 0; i10 < sparseBooleanArray.size(); i10++) {
                size = (size * 31) + a(i10);
            }
            return size;
        }
        return sparseBooleanArray.hashCode();
    }
}
