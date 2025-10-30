package com.google.crypto.tink.shaded.protobuf;

import com.google.android.gms.internal.measurement.AbstractC0953k1;

/* renamed from: com.google.crypto.tink.shaded.protobuf.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1035f extends C1036g {

    /* renamed from: e, reason: collision with root package name */
    public final int f16352e;

    /* renamed from: f, reason: collision with root package name */
    public final int f16353f;

    public C1035f(byte[] bArr, int i9, int i10) {
        super(bArr);
        AbstractC1037h.c(i9, i9 + i10, bArr.length);
        this.f16352e = i9;
        this.f16353f = i10;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.C1036g, com.google.crypto.tink.shaded.protobuf.AbstractC1037h
    public final byte b(int i9) {
        int i10 = this.f16353f;
        if (((i10 - (i9 + 1)) | i9) < 0) {
            if (i9 < 0) {
                throw new ArrayIndexOutOfBoundsException(AbstractC0953k1.j(i9, "Index < 0: "));
            }
            throw new ArrayIndexOutOfBoundsException(A0.a.l("Index > length: ", i9, i10, ", "));
        }
        return this.f16354d[this.f16352e + i9];
    }

    @Override // com.google.crypto.tink.shaded.protobuf.C1036g, com.google.crypto.tink.shaded.protobuf.AbstractC1037h
    public final void e(int i9, byte[] bArr) {
        System.arraycopy(this.f16354d, this.f16352e, bArr, 0, i9);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.C1036g
    public final int g() {
        return this.f16352e;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.C1036g
    public final byte i(int i9) {
        return this.f16354d[this.f16352e + i9];
    }

    @Override // com.google.crypto.tink.shaded.protobuf.C1036g, com.google.crypto.tink.shaded.protobuf.AbstractC1037h
    public final int size() {
        return this.f16353f;
    }
}
