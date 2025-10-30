package a6;

import android.security.keystore.KeyGenParameterSpec;
import android.util.Log;
import i6.n;
import i6.o;
import java.io.IOException;
import java.security.GeneralSecurityException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.util.Arrays;
import javax.crypto.KeyGenerator;

/* renamed from: a6.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0503c {

    /* renamed from: b, reason: collision with root package name */
    public static final Object f9161b = new Object();

    /* renamed from: a, reason: collision with root package name */
    public KeyStore f9162a;

    public C0503c() {
        try {
            KeyStore keyStore = KeyStore.getInstance("AndroidKeyStore");
            keyStore.load(null);
            this.f9162a = keyStore;
        } catch (IOException | GeneralSecurityException e8) {
            throw new IllegalStateException(e8);
        }
    }

    public static boolean a(String str) {
        C0503c c0503c = new C0503c();
        synchronized (f9161b) {
            try {
                if (!c0503c.d(str)) {
                    b(str);
                    return true;
                }
                return false;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static void b(String str) {
        String b9 = o.b(str);
        KeyGenerator keyGenerator = KeyGenerator.getInstance("AES", "AndroidKeyStore");
        keyGenerator.init(new KeyGenParameterSpec.Builder(b9, 3).setKeySize(256).setBlockModes("GCM").setEncryptionPaddings("NoPadding").build());
        keyGenerator.generateKey();
    }

    public final synchronized C0502b c(String str) {
        C0502b c0502b;
        c0502b = new C0502b(o.b(str), this.f9162a);
        byte[] a5 = n.a(10);
        byte[] bArr = new byte[0];
        if (!Arrays.equals(a5, c0502b.b(c0502b.a(a5, bArr), bArr))) {
            throw new KeyStoreException("cannot use Android Keystore: encryption/decryption of non-empty message and empty aad returns an incorrect result");
        }
        return c0502b;
    }

    public final synchronized boolean d(String str) {
        String b9;
        b9 = o.b(str);
        try {
        } catch (NullPointerException unused) {
            Log.w("c", "Keystore is temporarily unavailable, wait, reinitialize Keystore and try again.");
            try {
                try {
                    Thread.sleep((int) (Math.random() * 40.0d));
                } catch (InterruptedException unused2) {
                }
                KeyStore keyStore = KeyStore.getInstance("AndroidKeyStore");
                this.f9162a = keyStore;
                keyStore.load(null);
                return this.f9162a.containsAlias(b9);
            } catch (IOException e8) {
                throw new GeneralSecurityException(e8);
            }
        }
        return this.f9162a.containsAlias(b9);
    }
}
