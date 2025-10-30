package W5;

import D4.K;
import android.os.Build;
import b6.AbstractC0698t;
import i6.o;
import java.security.GeneralSecurityException;
import java.security.spec.AlgorithmParameterSpec;
import java.util.Objects;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: c, reason: collision with root package name */
    public static final K f7927c = new K(3);

    /* renamed from: a, reason: collision with root package name */
    public final SecretKeySpec f7928a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f7929b;

    public b(byte[] bArr) {
        if (A0.a.d(2)) {
            o.a(bArr.length);
            this.f7928a = new SecretKeySpec(bArr, "AES");
            this.f7929b = true;
            return;
        }
        throw new GeneralSecurityException("Can not use AES-GCM in FIPS-mode, as BoringCrypto module is not available.");
    }

    public static AlgorithmParameterSpec a(byte[] bArr) {
        Integer valueOf;
        int i9;
        int length = bArr.length;
        if ("The Android Project".equals(System.getProperty("java.vendor"))) {
            int i10 = AbstractC0698t.f11397a;
            if (!Objects.equals(System.getProperty("java.vendor"), "The Android Project")) {
                valueOf = null;
            } else {
                valueOf = Integer.valueOf(Build.VERSION.SDK_INT);
            }
            if (valueOf != null) {
                i9 = valueOf.intValue();
            } else {
                i9 = -1;
            }
            if (i9 <= 19) {
                return new IvParameterSpec(bArr, 0, length);
            }
        }
        return new GCMParameterSpec(128, bArr, 0, length);
    }
}
