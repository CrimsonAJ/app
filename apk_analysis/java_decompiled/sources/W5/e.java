package W5;

import A5.q;
import java.security.GeneralSecurityException;

/* loaded from: classes.dex */
public final class e extends q {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f7933c;

    public e(int i9, byte[] bArr) {
        this.f7933c = i9;
        if (A0.a.c(1)) {
            this.f452a = o(1, bArr);
            this.f453b = o(0, bArr);
            return;
        }
        throw new GeneralSecurityException("Can not use ChaCha20Poly1305 in FIPS-mode.");
    }

    @Override // A5.q
    public final d o(int i9, byte[] bArr) {
        switch (this.f7933c) {
            case 0:
                return new c(bArr, i9, 0);
            default:
                return new c(bArr, i9, 1);
        }
    }
}
