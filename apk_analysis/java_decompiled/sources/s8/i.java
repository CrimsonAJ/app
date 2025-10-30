package s8;

import i8.F;
import java.security.KeyStore;
import java.security.Provider;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;
import org.conscrypt.Conscrypt;

/* loaded from: classes.dex */
public final class i extends p {

    /* renamed from: d, reason: collision with root package name */
    public static final boolean f22798d;

    /* renamed from: c, reason: collision with root package name */
    public final Provider f22799c;

    static {
        boolean z9 = false;
        try {
            Class.forName("org.conscrypt.Conscrypt$Version", false, g.class.getClassLoader());
            if (Conscrypt.isAvailable()) {
                if (g.a()) {
                    z9 = true;
                }
            }
        } catch (ClassNotFoundException | NoClassDefFoundError unused) {
        }
        f22798d = z9;
    }

    public i() {
        Provider newProvider = Conscrypt.newProvider();
        kotlin.jvm.internal.h.d(newProvider, "newProvider()");
        this.f22799c = newProvider;
    }

    @Override // s8.p
    public final void d(SSLSocket sSLSocket, String str, List protocols) {
        kotlin.jvm.internal.h.e(protocols, "protocols");
        if (Conscrypt.isConscrypt(sSLSocket)) {
            Conscrypt.setUseSessionTickets(sSLSocket, true);
            ArrayList arrayList = new ArrayList();
            for (Object obj : protocols) {
                if (((F) obj) != F.HTTP_1_0) {
                    arrayList.add(obj);
                }
            }
            ArrayList arrayList2 = new ArrayList(B7.m.f0(arrayList, 10));
            int size = arrayList.size();
            int i9 = 0;
            while (i9 < size) {
                Object obj2 = arrayList.get(i9);
                i9++;
                arrayList2.add(((F) obj2).f19004a);
            }
            Conscrypt.setApplicationProtocols(sSLSocket, (String[]) arrayList2.toArray(new String[0]));
        }
    }

    @Override // s8.p
    public final String f(SSLSocket sSLSocket) {
        if (Conscrypt.isConscrypt(sSLSocket)) {
            return Conscrypt.getApplicationProtocol(sSLSocket);
        }
        return null;
    }

    @Override // s8.p
    public final SSLContext l() {
        SSLContext sSLContext = SSLContext.getInstance("TLS", this.f22799c);
        kotlin.jvm.internal.h.d(sSLContext, "getInstance(\"TLS\", provider)");
        return sSLContext;
    }

    @Override // s8.p
    public final SSLSocketFactory m(X509TrustManager x509TrustManager) {
        SSLContext l9 = l();
        l9.init(null, new TrustManager[]{x509TrustManager}, null);
        SSLSocketFactory socketFactory = l9.getSocketFactory();
        kotlin.jvm.internal.h.d(socketFactory, "newSSLContext().apply {\n…null)\n    }.socketFactory");
        return socketFactory;
    }

    @Override // s8.p
    public final X509TrustManager n() {
        TrustManagerFactory trustManagerFactory = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
        trustManagerFactory.init((KeyStore) null);
        TrustManager[] trustManagers = trustManagerFactory.getTrustManagers();
        kotlin.jvm.internal.h.b(trustManagers);
        if (trustManagers.length == 1) {
            TrustManager trustManager = trustManagers[0];
            if (trustManager instanceof X509TrustManager) {
                kotlin.jvm.internal.h.c(trustManager, "null cannot be cast to non-null type javax.net.ssl.X509TrustManager");
                X509TrustManager x509TrustManager = (X509TrustManager) trustManager;
                Conscrypt.setHostnameVerifier(x509TrustManager, h.f22797a);
                return x509TrustManager;
            }
        }
        String arrays = Arrays.toString(trustManagers);
        kotlin.jvm.internal.h.d(arrays, "toString(this)");
        throw new IllegalStateException("Unexpected default trust managers: ".concat(arrays).toString());
    }
}
