package i6;

import D4.K;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.security.spec.AlgorithmParameterSpec;
import java.util.Arrays;
import javax.crypto.Cipher;

/* loaded from: classes.dex */
public final class c implements U5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f18717a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f18718b;

    public c(int i9, byte[] bArr) {
        this.f18717a = i9;
        switch (i9) {
            case 1:
                this.f18718b = new W5.e(0, bArr);
                return;
            case 2:
                this.f18718b = new W5.e(1, bArr);
                return;
            default:
                if (A0.a.d(2)) {
                    this.f18718b = new W5.b(bArr);
                    return;
                }
                throw new GeneralSecurityException("Can not use AES-GCM in FIPS-mode, as BoringCrypto module is not available.");
        }
    }

    @Override // U5.a
    public final byte[] a(byte[] bArr, byte[] bArr2) {
        int length;
        int i9;
        switch (this.f18717a) {
            case 0:
                byte[] a5 = n.a(12);
                W5.b bVar = (W5.b) this.f18718b;
                bVar.getClass();
                if (a5.length == 12) {
                    if (bArr.length <= 2147483619) {
                        boolean z9 = bVar.f7929b;
                        if (z9) {
                            length = bArr.length + 28;
                        } else {
                            length = bArr.length + 16;
                        }
                        byte[] bArr3 = new byte[length];
                        if (z9) {
                            System.arraycopy(a5, 0, bArr3, 0, 12);
                        }
                        AlgorithmParameterSpec a9 = W5.b.a(a5);
                        K k5 = W5.b.f7927c;
                        ((Cipher) k5.get()).init(1, bVar.f7928a, a9);
                        if (bArr2 != null && bArr2.length != 0) {
                            ((Cipher) k5.get()).updateAAD(bArr2);
                        }
                        if (z9) {
                            i9 = 12;
                        } else {
                            i9 = 0;
                        }
                        int doFinal = ((Cipher) k5.get()).doFinal(bArr, 0, bArr.length, bArr3, i9);
                        if (doFinal == bArr.length + 16) {
                            return bArr3;
                        }
                        throw new GeneralSecurityException(A0.a.m("encryption failed; GCM tag must be 16 bytes, but got only ", doFinal - bArr.length, " bytes"));
                    }
                    throw new GeneralSecurityException("plaintext too long");
                }
                throw new GeneralSecurityException("iv is wrong size");
            case 1:
                ByteBuffer allocate = ByteBuffer.allocate(bArr.length + 28);
                byte[] a10 = n.a(12);
                allocate.put(a10);
                ((W5.e) this.f18718b).h(allocate, a10, bArr, bArr2);
                return allocate.array();
            default:
                ByteBuffer allocate2 = ByteBuffer.allocate(bArr.length + 40);
                byte[] a11 = n.a(24);
                allocate2.put(a11);
                ((W5.e) this.f18718b).h(allocate2, a11, bArr, bArr2);
                return allocate2.array();
        }
    }

    @Override // U5.a
    public final byte[] b(byte[] bArr, byte[] bArr2) {
        int i9;
        switch (this.f18717a) {
            case 0:
                byte[] copyOf = Arrays.copyOf(bArr, 12);
                W5.b bVar = (W5.b) this.f18718b;
                bVar.getClass();
                if (copyOf.length == 12) {
                    boolean z9 = bVar.f7929b;
                    if (z9) {
                        i9 = 28;
                    } else {
                        i9 = 16;
                    }
                    if (bArr.length >= i9) {
                        int i10 = 0;
                        if (z9 && !ByteBuffer.wrap(copyOf).equals(ByteBuffer.wrap(bArr, 0, 12))) {
                            throw new GeneralSecurityException("iv does not match prepended iv");
                        }
                        AlgorithmParameterSpec a5 = W5.b.a(copyOf);
                        K k5 = W5.b.f7927c;
                        ((Cipher) k5.get()).init(2, bVar.f7928a, a5);
                        if (bArr2 != null && bArr2.length != 0) {
                            ((Cipher) k5.get()).updateAAD(bArr2);
                        }
                        if (z9) {
                            i10 = 12;
                        }
                        int length = bArr.length;
                        if (z9) {
                            length -= 12;
                        }
                        return ((Cipher) k5.get()).doFinal(bArr, i10, length);
                    }
                    throw new GeneralSecurityException("ciphertext too short");
                }
                throw new GeneralSecurityException("iv is wrong size");
            case 1:
                if (bArr.length >= 28) {
                    return ((W5.e) this.f18718b).g(ByteBuffer.wrap(bArr, 12, bArr.length - 12), Arrays.copyOf(bArr, 12), bArr2);
                }
                throw new GeneralSecurityException("ciphertext too short");
            default:
                if (bArr.length >= 40) {
                    return ((W5.e) this.f18718b).g(ByteBuffer.wrap(bArr, 24, bArr.length - 24), Arrays.copyOf(bArr, 24), bArr2);
                }
                throw new GeneralSecurityException("ciphertext too short");
        }
    }
}
