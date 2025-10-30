package b6;

import java.nio.charset.Charset;
import java.security.SecureRandom;

/* renamed from: b6.t, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0698t {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f11397a = 0;

    static {
        Charset.forName("UTF-8");
    }

    public static int a() {
        SecureRandom secureRandom = new SecureRandom();
        byte[] bArr = new byte[4];
        int i9 = 0;
        while (i9 == 0) {
            secureRandom.nextBytes(bArr);
            i9 = ((bArr[0] & Byte.MAX_VALUE) << 24) | ((bArr[1] & 255) << 16) | ((bArr[2] & 255) << 8) | (bArr[3] & 255);
        }
        return i9;
    }

    public static final k6.a b(String str) {
        byte[] bArr = new byte[str.length()];
        for (int i9 = 0; i9 < str.length(); i9++) {
            char charAt = str.charAt(i9);
            if (charAt >= '!' && charAt <= '~') {
                bArr[i9] = (byte) charAt;
            } else {
                throw new RuntimeException("Not a printable ASCII character: " + charAt);
            }
        }
        return k6.a.a(bArr);
    }
}
