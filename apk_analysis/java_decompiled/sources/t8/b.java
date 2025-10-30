package t8;

import android.net.http.X509TrustManagerExtensions;
import com.google.android.gms.internal.measurement.D1;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.X509TrustManager;

/* loaded from: classes.dex */
public final class b extends D1 {

    /* renamed from: g, reason: collision with root package name */
    public final X509TrustManager f23321g;

    /* renamed from: h, reason: collision with root package name */
    public final X509TrustManagerExtensions f23322h;

    public b(X509TrustManager x509TrustManager, X509TrustManagerExtensions x509TrustManagerExtensions) {
        this.f23321g = x509TrustManager;
        this.f23322h = x509TrustManagerExtensions;
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof b) && ((b) obj).f23321g == this.f23321g) {
            return true;
        }
        return false;
    }

    @Override // com.google.android.gms.internal.measurement.D1
    public final List g(String hostname, List chain) {
        kotlin.jvm.internal.h.e(chain, "chain");
        kotlin.jvm.internal.h.e(hostname, "hostname");
        try {
            List<X509Certificate> checkServerTrusted = this.f23322h.checkServerTrusted((X509Certificate[]) chain.toArray(new X509Certificate[0]), "RSA", hostname);
            kotlin.jvm.internal.h.d(checkServerTrusted, "x509TrustManagerExtensio…ficates, \"RSA\", hostname)");
            return checkServerTrusted;
        } catch (CertificateException e8) {
            SSLPeerUnverifiedException sSLPeerUnverifiedException = new SSLPeerUnverifiedException(e8.getMessage());
            sSLPeerUnverifiedException.initCause(e8);
            throw sSLPeerUnverifiedException;
        }
    }

    public final int hashCode() {
        return System.identityHashCode(this.f23321g);
    }
}
