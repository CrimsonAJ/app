package s8;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.security.cert.TrustAnchor;
import java.security.cert.X509Certificate;
import javax.net.ssl.X509TrustManager;

/* loaded from: classes.dex */
public final class c implements w8.d {

    /* renamed from: a, reason: collision with root package name */
    public final X509TrustManager f22786a;

    /* renamed from: b, reason: collision with root package name */
    public final Method f22787b;

    public c(X509TrustManager x509TrustManager, Method method) {
        this.f22786a = x509TrustManager;
        this.f22787b = method;
    }

    @Override // w8.d
    public final X509Certificate a(X509Certificate x509Certificate) {
        try {
            Object invoke = this.f22787b.invoke(this.f22786a, x509Certificate);
            kotlin.jvm.internal.h.c(invoke, "null cannot be cast to non-null type java.security.cert.TrustAnchor");
            return ((TrustAnchor) invoke).getTrustedCert();
        } catch (IllegalAccessException e8) {
            throw new AssertionError("unable to get issues and signature", e8);
        } catch (InvocationTargetException unused) {
            return null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        if (kotlin.jvm.internal.h.a(this.f22786a, cVar.f22786a) && kotlin.jvm.internal.h.a(this.f22787b, cVar.f22787b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f22787b.hashCode() + (this.f22786a.hashCode() * 31);
    }

    public final String toString() {
        return "CustomTrustRootIndex(trustManager=" + this.f22786a + ", findByIssuerAndSignatureMethod=" + this.f22787b + ')';
    }
}
