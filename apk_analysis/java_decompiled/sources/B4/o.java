package B4;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class o extends n {

    /* renamed from: g, reason: collision with root package name */
    public final byte[] f718g;

    public o(byte[] bArr) {
        super(Arrays.copyOfRange(bArr, 0, 25));
        this.f718g = bArr;
    }

    @Override // B4.n
    public final byte[] i1() {
        return this.f718g;
    }
}
