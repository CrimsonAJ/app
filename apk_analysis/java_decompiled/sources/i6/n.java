package i6;

import D4.K;
import java.security.SecureRandom;

/* loaded from: classes.dex */
public abstract class n {

    /* renamed from: a, reason: collision with root package name */
    public static final K f18736a = new K(8);

    public static byte[] a(int i9) {
        byte[] bArr = new byte[i9];
        ((SecureRandom) f18736a.get()).nextBytes(bArr);
        return bArr;
    }
}
