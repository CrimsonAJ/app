package s8;

import com.google.android.gms.internal.measurement.D1;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.security.GeneralSecurityException;
import java.security.KeyStore;
import java.security.cert.X509Certificate;
import java.util.Arrays;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;

/* loaded from: classes.dex */
public class p {

    /* renamed from: a */
    public static volatile p f22822a;

    /* renamed from: b */
    public static final Logger f22823b;

    /* JADX WARN: Code restructure failed: missing block: B:39:0x0092, code lost:
    
        if (r2 != null) goto L115;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00b4, code lost:
    
        if (r2 != null) goto L115;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00d4, code lost:
    
        if (r2 != null) goto L115;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x00fa, code lost:
    
        if (java.lang.Integer.parseInt(r4) >= 9) goto L146;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0159  */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v13 */
    /* JADX WARN: Type inference failed for: r0v18 */
    /* JADX WARN: Type inference failed for: r0v19 */
    /* JADX WARN: Type inference failed for: r0v22 */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r0v9, types: [s8.p] */
    static {
        /*
            Method dump skipped, instructions count: 365
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: s8.p.<clinit>():void");
    }

    public static void i(String message, int i9, Throwable th) {
        Level level;
        kotlin.jvm.internal.h.e(message, "message");
        if (i9 == 5) {
            level = Level.WARNING;
        } else {
            level = Level.INFO;
        }
        f22823b.log(level, message, th);
    }

    public static /* synthetic */ void j(p pVar, String str, int i9) {
        int i10;
        if ((i9 & 2) != 0) {
            i10 = 4;
        } else {
            i10 = 5;
        }
        pVar.getClass();
        i(str, i10, null);
    }

    public D1 b(X509TrustManager x509TrustManager) {
        return new w8.a(c(x509TrustManager));
    }

    public w8.d c(X509TrustManager x509TrustManager) {
        X509Certificate[] acceptedIssuers = x509TrustManager.getAcceptedIssuers();
        kotlin.jvm.internal.h.d(acceptedIssuers, "trustManager.acceptedIssuers");
        return new w8.b((X509Certificate[]) Arrays.copyOf(acceptedIssuers, acceptedIssuers.length));
    }

    public void d(SSLSocket sSLSocket, String str, List protocols) {
        kotlin.jvm.internal.h.e(protocols, "protocols");
    }

    public void e(Socket socket, InetSocketAddress address, int i9) {
        kotlin.jvm.internal.h.e(address, "address");
        socket.connect(address, i9);
    }

    public String f(SSLSocket sSLSocket) {
        return null;
    }

    public Object g() {
        if (f22823b.isLoggable(Level.FINE)) {
            return new Throwable("response.body().close()");
        }
        return null;
    }

    public boolean h(String hostname) {
        kotlin.jvm.internal.h.e(hostname, "hostname");
        return true;
    }

    public void k(Object obj, String message) {
        kotlin.jvm.internal.h.e(message, "message");
        if (obj == null) {
            message = message.concat(" To see where this was allocated, set the OkHttpClient logger level to FINE: Logger.getLogger(OkHttpClient.class.getName()).setLevel(Level.FINE);");
        }
        i(message, 5, (Throwable) obj);
    }

    public SSLContext l() {
        SSLContext sSLContext = SSLContext.getInstance("TLS");
        kotlin.jvm.internal.h.d(sSLContext, "getInstance(\"TLS\")");
        return sSLContext;
    }

    public SSLSocketFactory m(X509TrustManager x509TrustManager) {
        try {
            SSLContext l9 = l();
            l9.init(null, new TrustManager[]{x509TrustManager}, null);
            SSLSocketFactory socketFactory = l9.getSocketFactory();
            kotlin.jvm.internal.h.d(socketFactory, "newSSLContext().apply {\n…ll)\n      }.socketFactory");
            return socketFactory;
        } catch (GeneralSecurityException e8) {
            throw new AssertionError("No System TLS: " + e8, e8);
        }
    }

    public X509TrustManager n() {
        TrustManagerFactory trustManagerFactory = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
        trustManagerFactory.init((KeyStore) null);
        TrustManager[] trustManagers = trustManagerFactory.getTrustManagers();
        kotlin.jvm.internal.h.b(trustManagers);
        if (trustManagers.length == 1) {
            TrustManager trustManager = trustManagers[0];
            if (trustManager instanceof X509TrustManager) {
                kotlin.jvm.internal.h.c(trustManager, "null cannot be cast to non-null type javax.net.ssl.X509TrustManager");
                return (X509TrustManager) trustManager;
            }
        }
        String arrays = Arrays.toString(trustManagers);
        kotlin.jvm.internal.h.d(arrays, "toString(this)");
        throw new IllegalStateException("Unexpected default trust managers: ".concat(arrays).toString());
    }

    public final String toString() {
        return getClass().getSimpleName();
    }

    public void a(SSLSocket sSLSocket) {
    }
}
