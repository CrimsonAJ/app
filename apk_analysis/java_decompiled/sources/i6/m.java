package i6;

import f6.InterfaceC1186a;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.security.MessageDigest;

/* loaded from: classes.dex */
public final class m implements U5.j {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC1186a f18734a;

    /* renamed from: b, reason: collision with root package name */
    public final int f18735b;

    public m(InterfaceC1186a interfaceC1186a, int i9) {
        this.f18734a = interfaceC1186a;
        this.f18735b = i9;
        if (i9 >= 10) {
            interfaceC1186a.a(i9, new byte[0]);
            return;
        }
        throw new InvalidAlgorithmParameterException("tag size too small, need at least 10 bytes");
    }

    @Override // U5.j
    public final void a(byte[] bArr, byte[] bArr2) {
        if (MessageDigest.isEqual(b(bArr2), bArr)) {
        } else {
            throw new GeneralSecurityException("invalid MAC");
        }
    }

    @Override // U5.j
    public final byte[] b(byte[] bArr) {
        return this.f18734a.a(this.f18735b, bArr);
    }
}
