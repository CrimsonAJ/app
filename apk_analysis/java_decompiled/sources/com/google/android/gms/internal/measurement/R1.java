package com.google.android.gms.internal.measurement;

/* loaded from: classes.dex */
public final class R1 extends T1 {

    /* renamed from: d, reason: collision with root package name */
    public final int f15292d;

    public R1(int i9, byte[] bArr) {
        super(bArr);
        T1.e(0, i9, bArr.length);
        this.f15292d = i9;
    }

    @Override // com.google.android.gms.internal.measurement.T1
    public final byte b(int i9) {
        int i10 = this.f15292d;
        if (((i10 - (i9 + 1)) | i9) < 0) {
            if (i9 < 0) {
                throw new ArrayIndexOutOfBoundsException(AbstractC0953k1.j(i9, "Index < 0: "));
            }
            throw new ArrayIndexOutOfBoundsException(A0.a.l("Index > length: ", i9, i10, ", "));
        }
        return this.f15299b[i9];
    }

    @Override // com.google.android.gms.internal.measurement.T1
    public final byte c(int i9) {
        return this.f15299b[i9];
    }

    @Override // com.google.android.gms.internal.measurement.T1
    public final int d() {
        return this.f15292d;
    }
}
