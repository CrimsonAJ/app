package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.v2, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1008v2 implements B2 {

    /* renamed from: a, reason: collision with root package name */
    public final N1 f15623a;

    /* renamed from: b, reason: collision with root package name */
    public final Z1 f15624b;

    public C1008v2(Z1 z12, N1 n12) {
        Z1 z13 = W1.f15325a;
        this.f15624b = z12;
        this.f15623a = n12;
    }

    @Override // com.google.android.gms.internal.measurement.B2
    public final void a(Object obj) {
        this.f15624b.getClass();
        D2 d22 = ((AbstractC0909b2) obj).zzc;
        if (d22.f15205e) {
            d22.f15205e = false;
        }
        Z1 z12 = W1.f15325a;
        throw AbstractC0953k1.i(obj);
    }

    @Override // com.google.android.gms.internal.measurement.B2
    public final void b(Object obj, Object obj2) {
        C2.p(obj, obj2);
    }

    @Override // com.google.android.gms.internal.measurement.B2
    public final AbstractC0909b2 c() {
        N1 n12 = this.f15623a;
        if (n12 instanceof AbstractC0909b2) {
            return (AbstractC0909b2) ((AbstractC0909b2) n12).m(4);
        }
        return ((AbstractC0904a2) ((AbstractC0909b2) n12).m(5)).i();
    }

    @Override // com.google.android.gms.internal.measurement.B2
    public final int d(AbstractC0909b2 abstractC0909b2) {
        return abstractC0909b2.zzc.hashCode();
    }

    @Override // com.google.android.gms.internal.measurement.B2
    public final void e(Object obj, C0974o2 c0974o2) {
        throw AbstractC0953k1.i(obj);
    }

    @Override // com.google.android.gms.internal.measurement.B2
    public final int f(AbstractC0909b2 abstractC0909b2) {
        D2 d22 = abstractC0909b2.zzc;
        int i9 = d22.f15204d;
        if (i9 == -1) {
            int i10 = 0;
            for (int i11 = 0; i11 < d22.f15201a; i11++) {
                int i12 = d22.f15202b[i11] >>> 3;
                T1 t12 = (T1) d22.f15203c[i11];
                int S8 = U1.S(8);
                int S9 = U1.S(i12) + U1.S(16);
                int S10 = U1.S(24);
                int d9 = t12.d();
                i10 += S8 + S8 + S9 + AbstractC0953k1.g(d9, d9, S10);
            }
            d22.f15204d = i10;
            return i10;
        }
        return i9;
    }

    @Override // com.google.android.gms.internal.measurement.B2
    public final void g(Object obj, byte[] bArr, int i9, int i10, Q1 q12) {
        AbstractC0909b2 abstractC0909b2 = (AbstractC0909b2) obj;
        if (abstractC0909b2.zzc == D2.f15200f) {
            abstractC0909b2.zzc = D2.b();
        }
        throw AbstractC0953k1.i(obj);
    }

    @Override // com.google.android.gms.internal.measurement.B2
    public final boolean h(AbstractC0909b2 abstractC0909b2, AbstractC0909b2 abstractC0909b22) {
        if (!abstractC0909b2.zzc.equals(abstractC0909b22.zzc)) {
            return false;
        }
        return true;
    }

    @Override // com.google.android.gms.internal.measurement.B2
    public final boolean i(Object obj) {
        throw AbstractC0953k1.i(obj);
    }
}
