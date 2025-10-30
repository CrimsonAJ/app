package s8;

import android.net.http.X509TrustManagerExtensions;
import android.os.Build;
import android.security.NetworkSecurityPolicy;
import com.google.android.gms.internal.measurement.D1;
import java.io.IOException;
import java.lang.reflect.Method;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.List;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.X509TrustManager;

/* loaded from: classes.dex */
public final class d extends p {

    /* renamed from: e, reason: collision with root package name */
    public static final boolean f22788e;

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f22789c;

    /* renamed from: d, reason: collision with root package name */
    public final G7.f f22790d;

    static {
        boolean z9 = false;
        if (e0.c.F() && Build.VERSION.SDK_INT < 30) {
            z9 = true;
        }
        f22788e = z9;
    }

    public d() {
        t8.f fVar;
        Method method;
        Method method2;
        Method method3 = null;
        try {
            Class<?> cls = Class.forName("com.android.org.conscrypt".concat(".OpenSSLSocketImpl"));
            Class.forName("com.android.org.conscrypt".concat(".OpenSSLSocketFactoryImpl"));
            Class.forName("com.android.org.conscrypt".concat(".SSLParametersImpl"));
            fVar = new t8.f(cls);
        } catch (Exception e8) {
            p.f22822a.getClass();
            p.i("unable to load android socket classes", 5, e8);
            fVar = null;
        }
        ArrayList k02 = B7.j.k0(new t8.m[]{fVar, new t8.l(t8.f.f23326f), new t8.l(t8.j.f23333a), new t8.l(t8.h.f23332a)});
        ArrayList arrayList = new ArrayList();
        int size = k02.size();
        int i9 = 0;
        while (i9 < size) {
            Object obj = k02.get(i9);
            i9++;
            if (((t8.m) obj).c()) {
                arrayList.add(obj);
            }
        }
        this.f22789c = arrayList;
        try {
            Class<?> cls2 = Class.forName("dalvik.system.CloseGuard");
            Method method4 = cls2.getMethod("get", null);
            method = cls2.getMethod("open", String.class);
            method2 = cls2.getMethod("warnIfOpen", null);
            method3 = method4;
        } catch (Exception unused) {
            method = null;
            method2 = null;
        }
        this.f22790d = new G7.f(method3, method, method2);
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
    public final w8.d c(X509TrustManager x509TrustManager) {
        try {
            Method declaredMethod = x509TrustManager.getClass().getDeclaredMethod("findTrustAnchorByIssuerAndSignature", X509Certificate.class);
            declaredMethod.setAccessible(true);
            return new c(x509TrustManager, declaredMethod);
        } catch (NoSuchMethodException unused) {
            return super.c(x509TrustManager);
        }
    }

    @Override // s8.p
    public final void d(SSLSocket sSLSocket, String str, List protocols) {
        Object obj;
        kotlin.jvm.internal.h.e(protocols, "protocols");
        ArrayList arrayList = this.f22789c;
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
    public final void e(Socket socket, InetSocketAddress address, int i9) {
        kotlin.jvm.internal.h.e(address, "address");
        try {
            socket.connect(address, i9);
        } catch (ClassCastException e8) {
            if (Build.VERSION.SDK_INT == 26) {
                throw new IOException("Exception in connect", e8);
            }
            throw e8;
        }
    }

    @Override // s8.p
    public final String f(SSLSocket sSLSocket) {
        Object obj;
        ArrayList arrayList = this.f22789c;
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
    public final Object g() {
        G7.f fVar = this.f22790d;
        fVar.getClass();
        Method method = fVar.f2906a;
        if (method != null) {
            try {
                Object invoke = method.invoke(null, null);
                Method method2 = fVar.f2907b;
                kotlin.jvm.internal.h.b(method2);
                method2.invoke(invoke, "response.body().close()");
                return invoke;
            } catch (Exception unused) {
            }
        }
        return null;
    }

    @Override // s8.p
    public final boolean h(String hostname) {
        boolean isCleartextTrafficPermitted;
        kotlin.jvm.internal.h.e(hostname, "hostname");
        if (Build.VERSION.SDK_INT >= 24) {
            isCleartextTrafficPermitted = NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted(hostname);
            return isCleartextTrafficPermitted;
        }
        return NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted();
    }

    @Override // s8.p
    public final void k(Object obj, String message) {
        kotlin.jvm.internal.h.e(message, "message");
        G7.f fVar = this.f22790d;
        fVar.getClass();
        if (obj != null) {
            try {
                Method method = fVar.f2908c;
                kotlin.jvm.internal.h.b(method);
                method.invoke(obj, null);
                return;
            } catch (Exception unused) {
            }
        }
        p.j(this, message, 4);
    }
}
