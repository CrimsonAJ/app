package i6;

import D4.K;
import java.security.GeneralSecurityException;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* renamed from: i6.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1384a implements k {

    /* renamed from: d, reason: collision with root package name */
    public static final K f18707d = new K(5);

    /* renamed from: a, reason: collision with root package name */
    public final SecretKeySpec f18708a;

    /* renamed from: b, reason: collision with root package name */
    public final int f18709b;

    /* renamed from: c, reason: collision with root package name */
    public final int f18710c;

    public C1384a(int i9, byte[] bArr) {
        if (A0.a.d(2)) {
            o.a(bArr.length);
            this.f18708a = new SecretKeySpec(bArr, "AES");
            int blockSize = ((Cipher) f18707d.get()).getBlockSize();
            this.f18710c = blockSize;
            if (i9 >= 12 && i9 <= blockSize) {
                this.f18709b = i9;
                return;
            }
            throw new GeneralSecurityException("invalid IV size");
        }
        throw new GeneralSecurityException("Can not use AES-CTR in FIPS-mode, as BoringCrypto module is not available.");
    }

    public final void a(byte[] bArr, int i9, int i10, byte[] bArr2, int i11, byte[] bArr3, boolean z9) {
        Cipher cipher = (Cipher) f18707d.get();
        byte[] bArr4 = new byte[this.f18710c];
        System.arraycopy(bArr3, 0, bArr4, 0, this.f18709b);
        IvParameterSpec ivParameterSpec = new IvParameterSpec(bArr4);
        SecretKeySpec secretKeySpec = this.f18708a;
        if (z9) {
            cipher.init(1, secretKeySpec, ivParameterSpec);
        } else {
            cipher.init(2, secretKeySpec, ivParameterSpec);
        }
        if (cipher.doFinal(bArr, i9, i10, bArr2, i11) == i10) {
        } else {
            throw new GeneralSecurityException("stored output's length does not match input's length");
        }
    }
}
