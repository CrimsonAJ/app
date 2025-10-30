package com.google.android.gms.internal.cast;

import com.google.android.gms.internal.measurement.AbstractC0953k1;

/* loaded from: classes.dex */
public final class H2 extends I2 {

    /* renamed from: d, reason: collision with root package name */
    public final int f14723d;

    public H2(byte[] bArr) {
        super(bArr);
        I2.e(bArr.length);
        this.f14723d = 47;
    }

    @Override // com.google.android.gms.internal.cast.I2
    public final byte b(int i9) {
        int i10 = this.f14723d;
        if (((i10 - (i9 + 1)) | i9) < 0) {
            if (i9 < 0) {
                throw new ArrayIndexOutOfBoundsException(AbstractC0953k1.j(i9, "Index < 0: "));
            }
            throw new ArrayIndexOutOfBoundsException(A0.a.l("Index > length: ", i9, i10, ", "));
        }
        return this.f14728b[i9];
    }

    @Override // com.google.android.gms.internal.cast.I2
    public final byte c(int i9) {
        return this.f14728b[i9];
    }

    @Override // com.google.android.gms.internal.cast.I2
    public final int d() {
        return this.f14723d;
    }
}
