package l4;

import android.content.Context;
import android.content.IntentFilter;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.util.Base64;
import androidx.mediarouter.app.C0568d;
import f6.InterfaceC1186a;
import j3.j0;
import java.io.Serializable;
import java.lang.ref.WeakReference;
import java.nio.charset.Charset;
import java.security.InvalidAlgorithmParameterException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Locale;
import java.util.concurrent.CopyOnWriteArrayList;
import javax.crypto.Mac;
import u0.z;

/* loaded from: classes.dex */
public final class s implements InterfaceC1186a {

    /* renamed from: e, reason: collision with root package name */
    public static s f20537e;

    /* renamed from: a, reason: collision with root package name */
    public int f20538a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f20539b;

    /* renamed from: c, reason: collision with root package name */
    public final Serializable f20540c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f20541d;

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0044, code lost:
    
        if (r4.equals("HMACSHA256") == false) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public s(java.lang.String r4, javax.crypto.spec.SecretKeySpec r5) {
        /*
            r3 = this;
            r3.<init>()
            i6.l r0 = new i6.l
            r0.<init>(r3)
            r3.f20539b = r0
            r1 = 2
            boolean r2 = A0.a.d(r1)
            if (r2 == 0) goto L8f
            r3.f20540c = r4
            r3.f20541d = r5
            byte[] r5 = r5.getEncoded()
            int r5 = r5.length
            r2 = 16
            if (r5 < r2) goto L87
            r5 = -1
            int r2 = r4.hashCode()
            switch(r2) {
                case -1823053428: goto L52;
                case 392315023: goto L47;
                case 392315118: goto L3e;
                case 392316170: goto L33;
                case 392317873: goto L28;
                default: goto L26;
            }
        L26:
            r1 = r5
            goto L5c
        L28:
            java.lang.String r1 = "HMACSHA512"
            boolean r1 = r4.equals(r1)
            if (r1 != 0) goto L31
            goto L26
        L31:
            r1 = 4
            goto L5c
        L33:
            java.lang.String r1 = "HMACSHA384"
            boolean r1 = r4.equals(r1)
            if (r1 != 0) goto L3c
            goto L26
        L3c:
            r1 = 3
            goto L5c
        L3e:
            java.lang.String r2 = "HMACSHA256"
            boolean r2 = r4.equals(r2)
            if (r2 != 0) goto L5c
            goto L26
        L47:
            java.lang.String r1 = "HMACSHA224"
            boolean r1 = r4.equals(r1)
            if (r1 != 0) goto L50
            goto L26
        L50:
            r1 = 1
            goto L5c
        L52:
            java.lang.String r1 = "HMACSHA1"
            boolean r1 = r4.equals(r1)
            if (r1 != 0) goto L5b
            goto L26
        L5b:
            r1 = 0
        L5c:
            switch(r1) {
                case 0: goto L7f;
                case 1: goto L7a;
                case 2: goto L75;
                case 3: goto L70;
                case 4: goto L6b;
                default: goto L5f;
            }
        L5f:
            java.security.NoSuchAlgorithmException r5 = new java.security.NoSuchAlgorithmException
            java.lang.String r0 = "unknown Hmac algorithm: "
            java.lang.String r4 = r0.concat(r4)
            r5.<init>(r4)
            throw r5
        L6b:
            r4 = 64
            r3.f20538a = r4
            goto L83
        L70:
            r4 = 48
            r3.f20538a = r4
            goto L83
        L75:
            r4 = 32
            r3.f20538a = r4
            goto L83
        L7a:
            r4 = 28
            r3.f20538a = r4
            goto L83
        L7f:
            r4 = 20
            r3.f20538a = r4
        L83:
            r0.get()
            return
        L87:
            java.security.InvalidAlgorithmParameterException r4 = new java.security.InvalidAlgorithmParameterException
            java.lang.String r5 = "key size too small, need at least 16 bytes"
            r4.<init>(r5)
            throw r4
        L8f:
            java.security.GeneralSecurityException r4 = new java.security.GeneralSecurityException
            java.lang.String r5 = "Can not use HMAC in FIPS-mode, as BoringCrypto module is not available."
            r4.<init>(r5)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: l4.s.<init>(java.lang.String, javax.crypto.spec.SecretKeySpec):void");
    }

    public static void b(s sVar, int i9) {
        synchronized (sVar.f20541d) {
            try {
                if (sVar.f20538a == i9) {
                    return;
                }
                sVar.f20538a = i9;
                Iterator it = ((CopyOnWriteArrayList) sVar.f20540c).iterator();
                while (it.hasNext()) {
                    WeakReference weakReference = (WeakReference) it.next();
                    k4.r rVar = (k4.r) weakReference.get();
                    if (rVar != null) {
                        rVar.a(i9);
                    } else {
                        ((CopyOnWriteArrayList) sVar.f20540c).remove(weakReference);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static synchronized s d(Context context) {
        s sVar;
        synchronized (s.class) {
            try {
                if (f20537e == null) {
                    f20537e = new s(context);
                }
                sVar = f20537e;
            } catch (Throwable th) {
                throw th;
            }
        }
        return sVar;
    }

    @Override // f6.InterfaceC1186a
    public byte[] a(int i9, byte[] bArr) {
        if (i9 <= this.f20538a) {
            i6.l lVar = (i6.l) this.f20539b;
            ((Mac) lVar.get()).update(bArr);
            return Arrays.copyOf(((Mac) lVar.get()).doFinal(), i9);
        }
        throw new InvalidAlgorithmParameterException("tag size too big");
    }

    public String c(R3.u uVar, Uri uri, int i9) {
        int i10 = this.f20538a;
        if (i10 != 1) {
            if (i10 == 2) {
                String str = (String) this.f20540c;
                String str2 = (String) this.f20539b;
                try {
                    MessageDigest messageDigest = MessageDigest.getInstance("MD5");
                    String g9 = U3.y.g(i9);
                    String str3 = uVar.f6657b + ":" + str2 + ":" + uVar.f6658c;
                    Charset charset = U3.x.f7475g;
                    String S8 = y.S(messageDigest.digest((y.S(messageDigest.digest(str3.getBytes(charset))) + ":" + str + ":" + y.S(messageDigest.digest((g9 + ":" + uri).getBytes(charset)))).getBytes(charset)));
                    String str4 = (String) this.f20541d;
                    if (str4.isEmpty()) {
                        return String.format(Locale.US, "Digest username=\"%s\", realm=\"%s\", nonce=\"%s\", uri=\"%s\", response=\"%s\"", uVar.f6657b, str2, str, uri, S8);
                    }
                    return String.format(Locale.US, "Digest username=\"%s\", realm=\"%s\", nonce=\"%s\", uri=\"%s\", response=\"%s\", opaque=\"%s\"", uVar.f6657b, str2, str, uri, S8, str4);
                } catch (NoSuchAlgorithmException e8) {
                    throw new j0(null, e8, false, 4);
                }
            }
            throw new j0(null, new UnsupportedOperationException(), false, 4);
        }
        String encodeToString = Base64.encodeToString((uVar.f6657b + ":" + uVar.f6658c).getBytes(U3.x.f7475g), 0);
        int i11 = y.f20553a;
        Locale locale = Locale.US;
        return z.e("Basic ", encodeToString);
    }

    public int e() {
        int i9;
        synchronized (this.f20541d) {
            i9 = this.f20538a;
        }
        return i9;
    }

    public s(int i9, String str, String str2, String str3) {
        this.f20538a = i9;
        this.f20539b = str;
        this.f20540c = str2;
        this.f20541d = str3;
    }

    public s(Context context) {
        this.f20539b = new Handler(Looper.getMainLooper());
        this.f20540c = new CopyOnWriteArrayList();
        this.f20541d = new Object();
        this.f20538a = 0;
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
        y.M(context, new C0568d(6, this), intentFilter);
    }
}
