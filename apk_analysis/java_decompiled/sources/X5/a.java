package X5;

import D4.K;
import i6.n;
import i6.o;
import java.security.GeneralSecurityException;
import java.security.spec.AlgorithmParameterSpec;
import javax.crypto.Cipher;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* loaded from: classes.dex */
public final class a implements U5.a {

    /* renamed from: b, reason: collision with root package name */
    public static final K f8469b = new K(4);

    /* renamed from: a, reason: collision with root package name */
    public final SecretKeySpec f8470a;

    public a(byte[] bArr) {
        o.a(bArr.length);
        this.f8470a = new SecretKeySpec(bArr, "AES");
    }

    public static AlgorithmParameterSpec c(int i9, byte[] bArr) {
        try {
            Class.forName("javax.crypto.spec.GCMParameterSpec");
            return new GCMParameterSpec(128, bArr, 0, i9);
        } catch (ClassNotFoundException unused) {
            if ("The Android Project".equals(System.getProperty("java.vendor"))) {
                return new IvParameterSpec(bArr, 0, i9);
            }
            throw new GeneralSecurityException("cannot use AES-GCM: javax.crypto.spec.GCMParameterSpec not found");
        }
    }

    @Override // U5.a
    public final byte[] a(byte[] bArr, byte[] bArr2) {
        if (bArr.length <= 2147483619) {
            byte[] bArr3 = new byte[bArr.length + 28];
            byte[] a5 = n.a(12);
            System.arraycopy(a5, 0, bArr3, 0, 12);
            AlgorithmParameterSpec c3 = c(a5.length, a5);
            K k5 = f8469b;
            ((Cipher) k5.get()).init(1, this.f8470a, c3);
            if (bArr2 != null && bArr2.length != 0) {
                ((Cipher) k5.get()).updateAAD(bArr2);
            }
            int doFinal = ((Cipher) k5.get()).doFinal(bArr, 0, bArr.length, bArr3, 12);
            if (doFinal == bArr.length + 16) {
                return bArr3;
            }
            throw new GeneralSecurityException(A0.a.m("encryption failed; GCM tag must be 16 bytes, but got only ", doFinal - bArr.length, " bytes"));
        }
        throw new GeneralSecurityException("plaintext too long");
    }

    @Override // U5.a
    public final byte[] b(byte[] bArr, byte[] bArr2) {
        if (bArr.length >= 28) {
            AlgorithmParameterSpec c3 = c(12, bArr);
            K k5 = f8469b;
            ((Cipher) k5.get()).init(2, this.f8470a, c3);
            if (bArr2 != null && bArr2.length != 0) {
                ((Cipher) k5.get()).updateAAD(bArr2);
            }
            return ((Cipher) k5.get()).doFinal(bArr, 12, bArr.length - 12);
        }
        throw new GeneralSecurityException("ciphertext too short");
    }
}
