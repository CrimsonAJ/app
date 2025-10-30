package D4;

import java.security.GeneralSecurityException;
import java.security.SecureRandom;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.Random;
import javax.crypto.Cipher;

/* loaded from: classes.dex */
public final class K extends ThreadLocal {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1827a;

    @Override // java.lang.ThreadLocal
    public final Object initialValue() {
        switch (this.f1827a) {
            case 0:
                return Boolean.FALSE;
            case 1:
                return 0L;
            case 2:
                return new Random();
            case 3:
                try {
                    return (Cipher) i6.i.f18730b.f18732a.k("AES/GCM/NoPadding");
                } catch (GeneralSecurityException e8) {
                    throw new IllegalStateException(e8);
                }
            case 4:
                try {
                    return (Cipher) i6.i.f18730b.f18732a.k("AES/GCM-SIV/NoPadding");
                } catch (GeneralSecurityException e9) {
                    throw new IllegalStateException(e9);
                }
            case 5:
                try {
                    return (Cipher) i6.i.f18730b.f18732a.k("AES/CTR/NoPadding");
                } catch (GeneralSecurityException e10) {
                    throw new IllegalStateException(e10);
                }
            case 6:
                try {
                    return (Cipher) i6.i.f18730b.f18732a.k("AES/ECB/NOPADDING");
                } catch (GeneralSecurityException e11) {
                    throw new IllegalStateException(e11);
                }
            case 7:
                try {
                    return (Cipher) i6.i.f18730b.f18732a.k("AES/CTR/NOPADDING");
                } catch (GeneralSecurityException e12) {
                    throw new IllegalStateException(e12);
                }
            case 8:
                SecureRandom secureRandom = new SecureRandom();
                secureRandom.nextLong();
                return secureRandom;
            default:
                SimpleDateFormat simpleDateFormat = new SimpleDateFormat("EEE, dd MMM yyyy HH:mm:ss 'GMT'", Locale.US);
                simpleDateFormat.setLenient(false);
                simpleDateFormat.setTimeZone(k8.c.f20145e);
                return simpleDateFormat;
        }
    }
}
