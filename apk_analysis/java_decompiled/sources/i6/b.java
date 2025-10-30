package i6;

import D4.K;
import java.security.GeneralSecurityException;
import java.util.Arrays;
import javax.crypto.AEADBadTagException;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* loaded from: classes.dex */
public final class b implements U5.a {

    /* renamed from: e, reason: collision with root package name */
    public static final K f18711e = new K(6);

    /* renamed from: f, reason: collision with root package name */
    public static final K f18712f = new K(7);

    /* renamed from: a, reason: collision with root package name */
    public final byte[] f18713a;

    /* renamed from: b, reason: collision with root package name */
    public final byte[] f18714b;

    /* renamed from: c, reason: collision with root package name */
    public final SecretKeySpec f18715c;

    /* renamed from: d, reason: collision with root package name */
    public final int f18716d;

    public b(int i9, byte[] bArr) {
        if (A0.a.c(1)) {
            if (i9 != 12 && i9 != 16) {
                throw new IllegalArgumentException("IV size should be either 12 or 16 bytes");
            }
            this.f18716d = i9;
            o.a(bArr.length);
            SecretKeySpec secretKeySpec = new SecretKeySpec(bArr, "AES");
            this.f18715c = secretKeySpec;
            Cipher cipher = (Cipher) f18711e.get();
            cipher.init(1, secretKeySpec);
            byte[] c3 = c(cipher.doFinal(new byte[16]));
            this.f18713a = c3;
            this.f18714b = c(c3);
            return;
        }
        throw new GeneralSecurityException("Can not use AES-EAX in FIPS-mode.");
    }

    public static byte[] c(byte[] bArr) {
        byte[] bArr2 = new byte[16];
        int i9 = 0;
        while (i9 < 15) {
            int i10 = i9 + 1;
            bArr2[i9] = (byte) (((bArr[i9] << 1) ^ ((bArr[i10] & 255) >>> 7)) & 255);
            i9 = i10;
        }
        bArr2[15] = (byte) (((bArr[0] >> 7) & 135) ^ (bArr[15] << 1));
        return bArr2;
    }

    public static byte[] e(byte[] bArr, byte[] bArr2) {
        int length = bArr.length;
        byte[] bArr3 = new byte[length];
        for (int i9 = 0; i9 < length; i9++) {
            bArr3[i9] = (byte) (bArr[i9] ^ bArr2[i9]);
        }
        return bArr3;
    }

    @Override // U5.a
    public final byte[] a(byte[] bArr, byte[] bArr2) {
        byte[] bArr3;
        int length = bArr.length;
        int i9 = this.f18716d;
        if (length <= 2147483631 - i9) {
            byte[] bArr4 = new byte[bArr.length + i9 + 16];
            byte[] a5 = n.a(i9);
            System.arraycopy(a5, 0, bArr4, 0, i9);
            Cipher cipher = (Cipher) f18711e.get();
            SecretKeySpec secretKeySpec = this.f18715c;
            cipher.init(1, secretKeySpec);
            byte[] d9 = d(cipher, 0, a5, 0, a5.length);
            if (bArr2 == null) {
                bArr3 = new byte[0];
            } else {
                bArr3 = bArr2;
            }
            byte[] d10 = d(cipher, 1, bArr3, 0, bArr3.length);
            Cipher cipher2 = (Cipher) f18712f.get();
            cipher2.init(1, secretKeySpec, new IvParameterSpec(d9));
            cipher2.doFinal(bArr, 0, bArr.length, bArr4, this.f18716d);
            byte[] d11 = d(cipher, 2, bArr4, this.f18716d, bArr.length);
            int length2 = bArr.length + i9;
            for (int i10 = 0; i10 < 16; i10++) {
                bArr4[length2 + i10] = (byte) ((d10[i10] ^ d9[i10]) ^ d11[i10]);
            }
            return bArr4;
        }
        throw new GeneralSecurityException("plaintext too long");
    }

    @Override // U5.a
    public final byte[] b(byte[] bArr, byte[] bArr2) {
        byte[] bArr3;
        int length = bArr.length;
        int i9 = this.f18716d;
        int i10 = (length - i9) - 16;
        if (i10 >= 0) {
            Cipher cipher = (Cipher) f18711e.get();
            SecretKeySpec secretKeySpec = this.f18715c;
            cipher.init(1, secretKeySpec);
            byte[] d9 = d(cipher, 0, bArr, 0, this.f18716d);
            if (bArr2 == null) {
                bArr3 = new byte[0];
            } else {
                bArr3 = bArr2;
            }
            byte[] d10 = d(cipher, 1, bArr3, 0, bArr3.length);
            byte[] d11 = d(cipher, 2, bArr, this.f18716d, i10);
            int length2 = bArr.length - 16;
            byte b9 = 0;
            for (int i11 = 0; i11 < 16; i11++) {
                b9 = (byte) (b9 | (((bArr[length2 + i11] ^ d10[i11]) ^ d9[i11]) ^ d11[i11]));
            }
            if (b9 == 0) {
                Cipher cipher2 = (Cipher) f18712f.get();
                cipher2.init(1, secretKeySpec, new IvParameterSpec(d9));
                return cipher2.doFinal(bArr, i9, i10);
            }
            throw new AEADBadTagException("tag mismatch");
        }
        throw new GeneralSecurityException("ciphertext too short");
    }

    public final byte[] d(Cipher cipher, int i9, byte[] bArr, int i10, int i11) {
        byte[] copyOf;
        byte[] bArr2 = new byte[16];
        bArr2[15] = (byte) i9;
        byte[] bArr3 = this.f18713a;
        if (i11 == 0) {
            return cipher.doFinal(e(bArr2, bArr3));
        }
        byte[] doFinal = cipher.doFinal(bArr2);
        int i12 = 0;
        while (i11 - i12 > 16) {
            for (int i13 = 0; i13 < 16; i13++) {
                doFinal[i13] = (byte) (doFinal[i13] ^ bArr[(i10 + i12) + i13]);
            }
            doFinal = cipher.doFinal(doFinal);
            i12 += 16;
        }
        byte[] copyOfRange = Arrays.copyOfRange(bArr, i12 + i10, i10 + i11);
        if (copyOfRange.length == 16) {
            copyOf = e(copyOfRange, bArr3);
        } else {
            copyOf = Arrays.copyOf(this.f18714b, 16);
            for (int i14 = 0; i14 < copyOfRange.length; i14++) {
                copyOf[i14] = (byte) (copyOf[i14] ^ copyOfRange[i14]);
            }
            copyOf[copyOfRange.length] = (byte) (copyOf[copyOfRange.length] ^ 128);
        }
        return cipher.doFinal(e(doFinal, copyOf));
    }
}
