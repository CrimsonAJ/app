package G6;

import android.support.v4.media.session.y;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.internal.measurement.AbstractC0953k1;
import java.io.IOException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.cert.CertificateException;
import java.util.HashMap;
import org.json.JSONObject;
import v6.C2112c;
import z2.C2235a;

/* loaded from: classes.dex */
public final class a implements Q0.f {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2874a;

    /* renamed from: b, reason: collision with root package name */
    public final String f2875b;

    public /* synthetic */ a(String str, int i9) {
        this.f2874a = i9;
        this.f2875b = str;
    }

    public static void a(y yVar, g gVar) {
        String str = gVar.f2896a;
        if (str != null) {
            yVar.O("X-CRASHLYTICS-GOOGLE-APP-ID", str);
        }
        yVar.O("X-CRASHLYTICS-API-CLIENT-TYPE", "android");
        yVar.O("X-CRASHLYTICS-API-CLIENT-VERSION", "19.4.4");
        yVar.O("Accept", "application/json");
        String str2 = gVar.f2897b;
        if (str2 != null) {
            yVar.O("X-CRASHLYTICS-DEVICE-MODEL", str2);
        }
        String str3 = gVar.f2898c;
        if (str3 != null) {
            yVar.O("X-CRASHLYTICS-OS-BUILD-VERSION", str3);
        }
        String str4 = gVar.f2899d;
        if (str4 != null) {
            yVar.O("X-CRASHLYTICS-OS-DISPLAY-VERSION", str4);
        }
        String str5 = gVar.f2900e.c().f25033a;
        if (str5 != null) {
            yVar.O("X-CRASHLYTICS-INSTALLATION-ID", str5);
        }
    }

    public static HashMap b(g gVar) {
        HashMap hashMap = new HashMap();
        hashMap.put("build_version", gVar.f2903h);
        hashMap.put("display_version", gVar.f2902g);
        hashMap.put("source", Integer.toString(gVar.f2904i));
        String str = gVar.f2901f;
        if (!TextUtils.isEmpty(str)) {
            hashMap.put("instance", str);
        }
        return hashMap;
    }

    public JSONObject c(D6.a aVar) {
        StringBuilder sb = new StringBuilder("Settings response code was: ");
        int i9 = aVar.f1917b;
        sb.append(i9);
        String sb2 = sb.toString();
        C2112c c2112c = C2112c.f23900a;
        c2112c.f(sb2);
        String str = this.f2875b;
        if (i9 != 200 && i9 != 201 && i9 != 202 && i9 != 203) {
            String str2 = "Settings request failed; (status: " + i9 + ") from " + str;
            if (c2112c.b(6)) {
                Log.e("FirebaseCrashlytics", str2, null);
                return null;
            }
        } else {
            String str3 = aVar.f1916a;
            try {
                return new JSONObject(str3);
            } catch (Exception e8) {
                c2112c.g("Failed to parse settings JSON from " + str, e8);
                c2112c.g("Settings response " + str3, null);
            }
        }
        return null;
    }

    @Override // Q0.f
    public String d() {
        return this.f2875b;
    }

    public String toString() {
        boolean z9;
        switch (this.f2874a) {
            case 1:
                StringBuilder sb = new StringBuilder("MasterKey{keyAlias=");
                String str = this.f2875b;
                sb.append(str);
                sb.append(", isKeyStoreBacked=");
                try {
                    KeyStore keyStore = KeyStore.getInstance("AndroidKeyStore");
                    keyStore.load(null);
                    z9 = keyStore.containsAlias(str);
                } catch (IOException | KeyStoreException | NoSuchAlgorithmException | CertificateException unused) {
                    z9 = false;
                }
                sb.append(z9);
                sb.append("}");
                return sb.toString();
            case 2:
            default:
                return super.toString();
            case 3:
                return AbstractC0953k1.p(new StringBuilder("<"), this.f2875b, '>');
        }
    }

    public a(String str, C2235a c2235a) {
        this.f2874a = 0;
        if (str != null) {
            this.f2875b = str;
            return;
        }
        throw new IllegalArgumentException("url must not be null.");
    }

    public a(Object obj, String str) {
        this.f2874a = 1;
        this.f2875b = str;
    }

    @Override // Q0.f
    public void F(Q0.e eVar) {
    }
}
