package W5;

import java.security.InvalidKeyException;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class c extends d {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f7930c;

    public c(byte[] bArr, int i9, int i10) {
        this.f7930c = i10;
        if (bArr.length == 32) {
            this.f7932b = a.c(bArr);
            this.f7931a = i9;
            return;
        }
        throw new InvalidKeyException("The key length in bytes must be 32.");
    }

    @Override // W5.d
    public final int[] c(int[] iArr, int i9) {
        switch (this.f7930c) {
            case 0:
                if (iArr.length == 3) {
                    int[] iArr2 = new int[16];
                    int[] iArr3 = (int[]) this.f7932b;
                    int[] iArr4 = a.f7926a;
                    System.arraycopy(iArr4, 0, iArr2, 0, iArr4.length);
                    System.arraycopy(iArr3, 0, iArr2, iArr4.length, 8);
                    iArr2[12] = i9;
                    System.arraycopy(iArr, 0, iArr2, 13, iArr.length);
                    return iArr2;
                }
                throw new IllegalArgumentException(String.format("ChaCha20 uses 96-bit nonces, but got a %d-bit nonce", Integer.valueOf(iArr.length * 32)));
            default:
                if (iArr.length == 6) {
                    int[] iArr5 = new int[16];
                    int[] iArr6 = (int[]) this.f7932b;
                    int[] iArr7 = a.f7926a;
                    System.arraycopy(iArr7, 0, r4, 0, iArr7.length);
                    System.arraycopy(iArr6, 0, r4, iArr7.length, 8);
                    int[] iArr8 = {0, 0, 0, 0, iArr8[12], iArr8[13], iArr8[14], iArr8[15], 0, 0, 0, 0, iArr[0], iArr[1], iArr[2], iArr[3]};
                    a.b(iArr8);
                    int[] copyOf = Arrays.copyOf(iArr8, 8);
                    System.arraycopy(iArr7, 0, iArr5, 0, iArr7.length);
                    System.arraycopy(copyOf, 0, iArr5, iArr7.length, 8);
                    iArr5[12] = i9;
                    iArr5[13] = 0;
                    iArr5[14] = iArr[4];
                    iArr5[15] = iArr[5];
                    return iArr5;
                }
                throw new IllegalArgumentException(String.format("XChaCha20 uses 192-bit nonces, but got a %d-bit nonce", Integer.valueOf(iArr.length * 32)));
        }
    }

    @Override // W5.d
    public final int i() {
        switch (this.f7930c) {
            case 0:
                return 12;
            default:
                return 24;
        }
    }
}
