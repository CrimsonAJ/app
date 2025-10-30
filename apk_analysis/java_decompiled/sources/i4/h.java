package i4;

import N3.n0;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import java.util.Map;
import l4.y;

/* loaded from: classes.dex */
public final class h extends v {

    /* renamed from: o0, reason: collision with root package name */
    public static final /* synthetic */ int f18544o0 = 0;

    /* renamed from: B, reason: collision with root package name */
    public final boolean f18545B;

    /* renamed from: C, reason: collision with root package name */
    public final boolean f18546C;

    /* renamed from: D, reason: collision with root package name */
    public final boolean f18547D;

    /* renamed from: X, reason: collision with root package name */
    public final boolean f18548X;
    public final boolean Y;

    /* renamed from: Z, reason: collision with root package name */
    public final boolean f18549Z;

    /* renamed from: f0, reason: collision with root package name */
    public final boolean f18550f0;

    /* renamed from: g0, reason: collision with root package name */
    public final boolean f18551g0;

    /* renamed from: h0, reason: collision with root package name */
    public final boolean f18552h0;

    /* renamed from: i0, reason: collision with root package name */
    public final boolean f18553i0;

    /* renamed from: j0, reason: collision with root package name */
    public final boolean f18554j0;

    /* renamed from: k0, reason: collision with root package name */
    public final boolean f18555k0;

    /* renamed from: l0, reason: collision with root package name */
    public final boolean f18556l0;

    /* renamed from: m0, reason: collision with root package name */
    public final SparseArray f18557m0;

    /* renamed from: n0, reason: collision with root package name */
    public final SparseBooleanArray f18558n0;

    static {
        new h(new g());
    }

    public h(g gVar) {
        super(gVar);
        this.f18545B = gVar.f18530A;
        this.f18546C = gVar.f18531B;
        this.f18547D = gVar.f18532C;
        this.f18548X = gVar.f18533D;
        this.Y = gVar.f18534E;
        this.f18549Z = gVar.f18535F;
        this.f18550f0 = gVar.f18536G;
        this.f18551g0 = gVar.f18537H;
        this.f18552h0 = gVar.f18538I;
        this.f18553i0 = gVar.f18539J;
        this.f18554j0 = gVar.K;
        this.f18555k0 = gVar.f18540L;
        this.f18556l0 = gVar.f18541M;
        this.f18557m0 = gVar.f18542N;
        this.f18558n0 = gVar.f18543O;
    }

    @Override // i4.v
    public final u a() {
        return new g(this);
    }

    @Override // i4.v
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && h.class == obj.getClass()) {
            h hVar = (h) obj;
            if (super.equals(hVar) && this.f18545B == hVar.f18545B && this.f18546C == hVar.f18546C && this.f18547D == hVar.f18547D && this.f18548X == hVar.f18548X && this.Y == hVar.Y && this.f18549Z == hVar.f18549Z && this.f18550f0 == hVar.f18550f0 && this.f18551g0 == hVar.f18551g0 && this.f18552h0 == hVar.f18552h0 && this.f18553i0 == hVar.f18553i0 && this.f18554j0 == hVar.f18554j0 && this.f18555k0 == hVar.f18555k0 && this.f18556l0 == hVar.f18556l0) {
                SparseBooleanArray sparseBooleanArray = this.f18558n0;
                int size = sparseBooleanArray.size();
                SparseBooleanArray sparseBooleanArray2 = hVar.f18558n0;
                if (sparseBooleanArray2.size() == size) {
                    int i9 = 0;
                    while (true) {
                        if (i9 < size) {
                            if (sparseBooleanArray2.indexOfKey(sparseBooleanArray.keyAt(i9)) < 0) {
                                break;
                            }
                            i9++;
                        } else {
                            SparseArray sparseArray = this.f18557m0;
                            int size2 = sparseArray.size();
                            SparseArray sparseArray2 = hVar.f18557m0;
                            if (sparseArray2.size() == size2) {
                                for (int i10 = 0; i10 < size2; i10++) {
                                    int indexOfKey = sparseArray2.indexOfKey(sparseArray.keyAt(i10));
                                    if (indexOfKey >= 0) {
                                        Map map = (Map) sparseArray.valueAt(i10);
                                        Map map2 = (Map) sparseArray2.valueAt(indexOfKey);
                                        if (map2.size() == map.size()) {
                                            for (Map.Entry entry : map.entrySet()) {
                                                n0 n0Var = (n0) entry.getKey();
                                                if (map2.containsKey(n0Var) && y.a(entry.getValue(), map2.get(n0Var))) {
                                                }
                                            }
                                        }
                                    }
                                }
                                return true;
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    @Override // i4.v
    public final int hashCode() {
        return ((((((((((((((((((((((((((super.hashCode() + 31) * 31) + (this.f18545B ? 1 : 0)) * 31) + (this.f18546C ? 1 : 0)) * 31) + (this.f18547D ? 1 : 0)) * 31) + (this.f18548X ? 1 : 0)) * 31) + (this.Y ? 1 : 0)) * 31) + (this.f18549Z ? 1 : 0)) * 31) + (this.f18550f0 ? 1 : 0)) * 31) + (this.f18551g0 ? 1 : 0)) * 31) + (this.f18552h0 ? 1 : 0)) * 31) + (this.f18553i0 ? 1 : 0)) * 31) + (this.f18554j0 ? 1 : 0)) * 31) + (this.f18555k0 ? 1 : 0)) * 31) + (this.f18556l0 ? 1 : 0);
    }
}
