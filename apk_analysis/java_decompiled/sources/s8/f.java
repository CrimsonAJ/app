package s8;

import java.security.KeyStore;
import java.security.Provider;
import java.util.Arrays;
import java.util.List;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;
import org.bouncycastle.jsse.provider.BouncyCastleJsseProvider;

/* loaded from: classes.dex */
public final class f extends p {

    /* renamed from: d, reason: collision with root package name */
    public static final boolean f22795d;

    /* renamed from: c, reason: collision with root package name */
    public final Provider f22796c = new BouncyCastleJsseProvider();

    static {
        boolean z9 = false;
        try {
            Class.forName("org.bouncycastle.jsse.provider.BouncyCastleJsseProvider", false, e.class.getClassLoader());
            z9 = true;
        } catch (ClassNotFoundException unused) {
        }
        f22795d = z9;
    }

    @Override // s8.p
    public final void d(SSLSocket sSLSocket, String str, List protocols) {
        kotlin.jvm.internal.h.e(protocols, "protocols");
    }

    @Override // s8.p
    public final String f(SSLSocket sSLSocket) {
        return null;
    }

    @Override // s8.p
    public final SSLContext l() {
        SSLContext sSLContext = SSLContext.getInstance("TLS", this.f22796c);
        kotlin.jvm.internal.h.d(sSLContext, "getInstance(\"TLS\", provider)");
        return sSLContext;
    }

    @Override // s8.p
    public final X509TrustManager n() {
        TrustManagerFactory trustManagerFactory = TrustManagerFactory.getInstance("PKIX", "BCJSSE");
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
}
