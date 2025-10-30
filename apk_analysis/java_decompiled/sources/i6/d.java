package i6;

import b5.G1;
import com.google.android.gms.internal.measurement.D1;
import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.List;
import javax.crypto.AEADBadTagException;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import l6.AbstractC1570b;
import u0.z;

/* loaded from: classes.dex */
public final class d implements U5.c {

    /* renamed from: c, reason: collision with root package name */
    public static final List f18719c = Arrays.asList(64);

    /* renamed from: d, reason: collision with root package name */
    public static final byte[] f18720d = new byte[16];

    /* renamed from: e, reason: collision with root package name */
    public static final byte[] f18721e = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1};

    /* renamed from: a, reason: collision with root package name */
    public final G1 f18722a;

    /* renamed from: b, reason: collision with root package name */
    public final byte[] f18723b;

    public d(byte[] bArr) {
        if (A0.a.c(1)) {
            if (f18719c.contains(Integer.valueOf(bArr.length))) {
                byte[] copyOfRange = Arrays.copyOfRange(bArr, 0, bArr.length / 2);
                this.f18723b = Arrays.copyOfRange(bArr, bArr.length / 2, bArr.length);
                this.f18722a = new G1(copyOfRange);
                return;
            }
            throw new InvalidKeyException(z.g(new StringBuilder("invalid key size: "), bArr.length, " bytes; key must have 64 bytes"));
        }
        throw new GeneralSecurityException("Can not use AES-SIV in FIPS-mode.");
    }

    @Override // U5.c
    public final byte[] a(byte[] bArr, byte[] bArr2) {
        if (bArr.length <= 2147483631) {
            Cipher cipher = (Cipher) i.f18730b.f18732a.k("AES/CTR/NoPadding");
            byte[] c3 = c(bArr2, bArr);
            byte[] bArr3 = (byte[]) c3.clone();
            bArr3[8] = (byte) (bArr3[8] & Byte.MAX_VALUE);
            bArr3[12] = (byte) (bArr3[12] & Byte.MAX_VALUE);
            cipher.init(1, new SecretKeySpec(this.f18723b, "AES"), new IvParameterSpec(bArr3));
            return D1.j(c3, cipher.doFinal(bArr));
        }
        throw new GeneralSecurityException("plaintext too long");
    }

    @Override // U5.c
    public final byte[] b(byte[] bArr, byte[] bArr2) {
        if (bArr.length >= 16) {
            Cipher cipher = (Cipher) i.f18730b.f18732a.k("AES/CTR/NoPadding");
            byte[] copyOfRange = Arrays.copyOfRange(bArr, 0, 16);
            byte[] bArr3 = (byte[]) copyOfRange.clone();
            bArr3[8] = (byte) (bArr3[8] & Byte.MAX_VALUE);
            bArr3[12] = (byte) (bArr3[12] & Byte.MAX_VALUE);
            cipher.init(2, new SecretKeySpec(this.f18723b, "AES"), new IvParameterSpec(bArr3));
            byte[] copyOfRange2 = Arrays.copyOfRange(bArr, 16, bArr.length);
            byte[] doFinal = cipher.doFinal(copyOfRange2);
            if (copyOfRange2.length == 0 && doFinal == null && "The Android Project".equals(System.getProperty("java.vendor"))) {
                doFinal = new byte[0];
            }
            if (MessageDigest.isEqual(copyOfRange, c(bArr2, doFinal))) {
                return doFinal;
            }
            throw new AEADBadTagException("Integrity check failed.");
        }
        throw new GeneralSecurityException("Ciphertext too short.");
    }

    public final byte[] c(byte[]... bArr) {
        byte[] Q7;
        int length = bArr.length;
        G1 g12 = this.f18722a;
        if (length == 0) {
            return g12.a(16, f18721e);
        }
        byte[] a5 = g12.a(16, f18720d);
        for (int i9 = 0; i9 < bArr.length - 1; i9++) {
            byte[] bArr2 = bArr[i9];
            if (bArr2 == null) {
                bArr2 = new byte[0];
            }
            a5 = D1.Q(AbstractC1570b.c(a5), g12.a(16, bArr2));
        }
        byte[] bArr3 = bArr[bArr.length - 1];
        if (bArr3.length >= 16) {
            if (bArr3.length >= a5.length) {
                int length2 = bArr3.length - a5.length;
                Q7 = Arrays.copyOf(bArr3, bArr3.length);
                for (int i10 = 0; i10 < a5.length; i10++) {
                    int i11 = length2 + i10;
                    Q7[i11] = (byte) (Q7[i11] ^ a5[i10]);
                }
            } else {
                throw new IllegalArgumentException("xorEnd requires a.length >= b.length");
            }
        } else if (bArr3.length < 16) {
            byte[] copyOf = Arrays.copyOf(bArr3, 16);
            copyOf[bArr3.length] = Byte.MIN_VALUE;
            Q7 = D1.Q(copyOf, AbstractC1570b.c(a5));
        } else {
            throw new IllegalArgumentException("x must be smaller than a block.");
        }
        return g12.a(16, Q7);
    }
}
