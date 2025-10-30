package s8;

import android.net.http.X509TrustManagerExtensions;
import android.os.Build;
import android.security.NetworkSecurityPolicy;
import com.google.android.gms.internal.measurement.D1;
import java.util.ArrayList;
import java.util.List;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.X509TrustManager;

/* loaded from: classes.dex */
public final class b extends p {

    /* renamed from: d, reason: collision with root package name */
    public static final boolean f22784d;

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f22785c;

    static {
        boolean z9;
        if (e0.c.F() && Build.VERSION.SDK_INT >= 29) {
            z9 = true;
        } else {
            z9 = false;
        }
        f22784d = z9;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public b() {
        Object obj;
        int i9 = 0;
        if (e0.c.F() && Build.VERSION.SDK_INT >= 29) {
            obj = new Object();
        } else {
            obj = null;
        }
        ArrayList k02 = B7.j.k0(new t8.m[]{obj, new t8.l(t8.f.f23326f), new t8.l(t8.j.f23333a), new t8.l(t8.h.f23332a)});
        ArrayList arrayList = new ArrayList();
        int size = k02.size();
        while (i9 < size) {
            Object obj2 = k02.get(i9);
            i9++;
            if (((t8.m) obj2).c()) {
                arrayList.add(obj2);
            }
        }
        this.f22785c = arrayList;
    }

    @Override // s8.p
    public final D1 b(X509TrustManager x509TrustManager) {
        X509TrustManagerExtensions x509TrustManagerExtensions;
        t8.b bVar = null;
        try {
            x509TrustManagerExtensions = new X509TrustManagerExtensions(x509TrustManager);
        } catch (IllegalArgumentException unused) {
            x509TrustManagerExtensions = null;
        }
        if (x509TrustManagerExtensions != null) {
            bVar = new t8.b(x509TrustManager, x509TrustManagerExtensions);
        }
        if (bVar != null) {
            return bVar;
        }
        return new w8.a(c(x509TrustManager));
    }

    @Override // s8.p
    public final void d(SSLSocket sSLSocket, String str, List protocols) {
        Object obj;
        kotlin.jvm.internal.h.e(protocols, "protocols");
        ArrayList arrayList = this.f22785c;
        int size = arrayList.size();
        int i9 = 0;
        while (true) {
            if (i9 < size) {
                obj = arrayList.get(i9);
                i9++;
                if (((t8.m) obj).a(sSLSocket)) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        t8.m mVar = (t8.m) obj;
        if (mVar != null) {
            mVar.d(sSLSocket, str, protocols);
        }
    }

    @Override // s8.p
    public final String f(SSLSocket sSLSocket) {
        Object obj;
        ArrayList arrayList = this.f22785c;
        int size = arrayList.size();
        int i9 = 0;
        while (true) {
            if (i9 < size) {
                obj = arrayList.get(i9);
                i9++;
                if (((t8.m) obj).a(sSLSocket)) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        t8.m mVar = (t8.m) obj;
        if (mVar == null) {
            return null;
        }
        return mVar.b(sSLSocket);
    }

    @Override // s8.p
    public final boolean h(String hostname) {
        boolean isCleartextTrafficPermitted;
        kotlin.jvm.internal.h.e(hostname, "hostname");
        isCleartextTrafficPermitted = NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted(hostname);
        return isCleartextTrafficPermitted;
    }
}
