package S3;

import android.net.Uri;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.CipherInputStream;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import k4.C1515o;
import k4.C1516p;
import k4.InterfaceC1513m;
import k4.W;

/* loaded from: classes.dex */
public final class a implements InterfaceC1513m {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC1513m f6750a;

    /* renamed from: b, reason: collision with root package name */
    public final byte[] f6751b;

    /* renamed from: c, reason: collision with root package name */
    public final byte[] f6752c;

    /* renamed from: d, reason: collision with root package name */
    public CipherInputStream f6753d;

    public a(InterfaceC1513m interfaceC1513m, byte[] bArr, byte[] bArr2) {
        this.f6750a = interfaceC1513m;
        this.f6751b = bArr;
        this.f6752c = bArr2;
    }

    @Override // k4.InterfaceC1510j
    public final int D(byte[] bArr, int i9, int i10) {
        this.f6753d.getClass();
        int read = this.f6753d.read(bArr, i9, i10);
        if (read < 0) {
            return -1;
        }
        return read;
    }

    @Override // k4.InterfaceC1513m
    public final void a(W w7) {
        w7.getClass();
        this.f6750a.a(w7);
    }

    @Override // k4.InterfaceC1513m
    public final void close() {
        if (this.f6753d != null) {
            this.f6753d = null;
            this.f6750a.close();
        }
    }

    @Override // k4.InterfaceC1513m
    public final long g(C1516p c1516p) {
        try {
            Cipher cipher = Cipher.getInstance("AES/CBC/PKCS7Padding");
            try {
                cipher.init(2, new SecretKeySpec(this.f6751b, "AES"), new IvParameterSpec(this.f6752c));
                C1515o c1515o = new C1515o(this.f6750a, c1516p);
                this.f6753d = new CipherInputStream(c1515o, cipher);
                c1515o.a();
                return -1L;
            } catch (InvalidAlgorithmParameterException | InvalidKeyException e8) {
                throw new RuntimeException(e8);
            }
        } catch (NoSuchAlgorithmException | NoSuchPaddingException e9) {
            throw new RuntimeException(e9);
        }
    }

    @Override // k4.InterfaceC1513m
    public final Map l() {
        return this.f6750a.l();
    }

    @Override // k4.InterfaceC1513m
    public final Uri s() {
        return this.f6750a.s();
    }
}
