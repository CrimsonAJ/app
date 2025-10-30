package i6;

import com.google.android.gms.internal.measurement.AbstractC0953k1;
import com.google.android.gms.internal.measurement.D1;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class g implements U5.a {

    /* renamed from: a, reason: collision with root package name */
    public final k f18727a;

    /* renamed from: b, reason: collision with root package name */
    public final U5.j f18728b;

    /* renamed from: c, reason: collision with root package name */
    public final int f18729c;

    public g(k kVar, U5.j jVar, int i9) {
        this.f18727a = kVar;
        this.f18728b = jVar;
        this.f18729c = i9;
    }

    @Override // U5.a
    public final byte[] a(byte[] bArr, byte[] bArr2) {
        C1384a c1384a = (C1384a) this.f18727a;
        c1384a.getClass();
        int length = bArr.length;
        int i9 = c1384a.f18709b;
        int i10 = Integer.MAX_VALUE - i9;
        if (length <= i10) {
            byte[] bArr3 = new byte[bArr.length + i9];
            byte[] a5 = n.a(i9);
            System.arraycopy(a5, 0, bArr3, 0, i9);
            c1384a.a(bArr, 0, bArr.length, bArr3, c1384a.f18709b, a5, true);
            if (bArr2 == null) {
                bArr2 = new byte[0];
            }
            return D1.j(bArr3, this.f18728b.b(D1.j(bArr2, bArr3, Arrays.copyOf(ByteBuffer.allocate(8).putLong(bArr2.length * 8).array(), 8))));
        }
        throw new GeneralSecurityException(AbstractC0953k1.j(i10, "plaintext length can not exceed "));
    }

    @Override // U5.a
    public final byte[] b(byte[] bArr, byte[] bArr2) {
        int length = bArr.length;
        int i9 = this.f18729c;
        if (length >= i9) {
            byte[] copyOfRange = Arrays.copyOfRange(bArr, 0, bArr.length - i9);
            byte[] copyOfRange2 = Arrays.copyOfRange(bArr, bArr.length - i9, bArr.length);
            if (bArr2 == null) {
                bArr2 = new byte[0];
            }
            this.f18728b.a(copyOfRange2, D1.j(bArr2, copyOfRange, Arrays.copyOf(ByteBuffer.allocate(8).putLong(bArr2.length * 8).array(), 8)));
            C1384a c1384a = (C1384a) this.f18727a;
            c1384a.getClass();
            int length2 = copyOfRange.length;
            int i10 = c1384a.f18709b;
            if (length2 >= i10) {
                byte[] bArr3 = new byte[i10];
                System.arraycopy(copyOfRange, 0, bArr3, 0, i10);
                int length3 = copyOfRange.length;
                int i11 = c1384a.f18709b;
                byte[] bArr4 = new byte[length3 - i11];
                c1384a.a(copyOfRange, i11, copyOfRange.length - i11, bArr4, 0, bArr3, false);
                return bArr4;
            }
            throw new GeneralSecurityException("ciphertext too short");
        }
        throw new GeneralSecurityException("ciphertext too short");
    }
}
