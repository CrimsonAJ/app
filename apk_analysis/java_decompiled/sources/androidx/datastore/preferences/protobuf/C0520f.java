package androidx.datastore.preferences.protobuf;

import com.google.android.gms.internal.measurement.AbstractC0953k1;

/* renamed from: androidx.datastore.preferences.protobuf.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0520f extends C0521g {

    /* renamed from: e, reason: collision with root package name */
    public final int f9697e;

    /* renamed from: f, reason: collision with root package name */
    public final int f9698f;

    public C0520f(byte[] bArr, int i9, int i10) {
        super(bArr);
        C0521g.c(i9, i9 + i10, bArr.length);
        this.f9697e = i9;
        this.f9698f = i10;
    }

    @Override // androidx.datastore.preferences.protobuf.C0521g
    public final byte b(int i9) {
        int i10 = this.f9698f;
        if (((i10 - (i9 + 1)) | i9) < 0) {
            if (i9 < 0) {
                throw new ArrayIndexOutOfBoundsException(AbstractC0953k1.j(i9, "Index < 0: "));
            }
            throw new ArrayIndexOutOfBoundsException(A0.a.l("Index > length: ", i9, i10, ", "));
        }
        return this.f9703b[this.f9697e + i9];
    }

    @Override // androidx.datastore.preferences.protobuf.C0521g
    public final void e(int i9, byte[] bArr) {
        System.arraycopy(this.f9703b, this.f9697e, bArr, 0, i9);
    }

    @Override // androidx.datastore.preferences.protobuf.C0521g
    public final int f() {
        return this.f9697e;
    }

    @Override // androidx.datastore.preferences.protobuf.C0521g
    public final byte g(int i9) {
        return this.f9703b[this.f9697e + i9];
    }

    @Override // androidx.datastore.preferences.protobuf.C0521g
    public final int size() {
        return this.f9698f;
    }
}
