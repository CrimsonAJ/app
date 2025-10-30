package i8;

import com.google.android.gms.internal.measurement.AbstractC0953k1;
import java.net.ProxySelector;
import java.util.List;
import java.util.Objects;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;

/* renamed from: i8.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1411a {

    /* renamed from: a, reason: collision with root package name */
    public final s f19056a;

    /* renamed from: b, reason: collision with root package name */
    public final SocketFactory f19057b;

    /* renamed from: c, reason: collision with root package name */
    public final SSLSocketFactory f19058c;

    /* renamed from: d, reason: collision with root package name */
    public final HostnameVerifier f19059d;

    /* renamed from: e, reason: collision with root package name */
    public final C1422l f19060e;

    /* renamed from: f, reason: collision with root package name */
    public final r f19061f;

    /* renamed from: g, reason: collision with root package name */
    public final ProxySelector f19062g;

    /* renamed from: h, reason: collision with root package name */
    public final y f19063h;

    /* renamed from: i, reason: collision with root package name */
    public final List f19064i;
    public final List j;

    public C1411a(String uriHost, int i9, s dns, SocketFactory socketFactory, SSLSocketFactory sSLSocketFactory, HostnameVerifier hostnameVerifier, C1422l c1422l, r proxyAuthenticator, List protocols, List connectionSpecs, ProxySelector proxySelector) {
        String str;
        kotlin.jvm.internal.h.e(uriHost, "uriHost");
        kotlin.jvm.internal.h.e(dns, "dns");
        kotlin.jvm.internal.h.e(socketFactory, "socketFactory");
        kotlin.jvm.internal.h.e(proxyAuthenticator, "proxyAuthenticator");
        kotlin.jvm.internal.h.e(protocols, "protocols");
        kotlin.jvm.internal.h.e(connectionSpecs, "connectionSpecs");
        kotlin.jvm.internal.h.e(proxySelector, "proxySelector");
        this.f19056a = dns;
        this.f19057b = socketFactory;
        this.f19058c = sSLSocketFactory;
        this.f19059d = hostnameVerifier;
        this.f19060e = c1422l;
        this.f19061f = proxyAuthenticator;
        this.f19062g = proxySelector;
        x xVar = new x();
        if (sSLSocketFactory == null) {
            str = "http";
        } else {
            str = "https";
        }
        if (str.equalsIgnoreCase("http")) {
            xVar.f19160a = "http";
        } else if (str.equalsIgnoreCase("https")) {
            xVar.f19160a = "https";
        } else {
            throw new IllegalArgumentException("unexpected scheme: ".concat(str));
        }
        xVar.d(uriHost);
        if (1 <= i9 && i9 < 65536) {
            xVar.f19164e = i9;
            this.f19063h = xVar.b();
            this.f19064i = k8.c.x(protocols);
            this.j = k8.c.x(connectionSpecs);
            return;
        }
        throw new IllegalArgumentException(AbstractC0953k1.j(i9, "unexpected port: ").toString());
    }

    public final boolean a(C1411a that) {
        kotlin.jvm.internal.h.e(that, "that");
        if (kotlin.jvm.internal.h.a(this.f19056a, that.f19056a) && kotlin.jvm.internal.h.a(this.f19061f, that.f19061f) && kotlin.jvm.internal.h.a(this.f19064i, that.f19064i) && kotlin.jvm.internal.h.a(this.j, that.j) && kotlin.jvm.internal.h.a(this.f19062g, that.f19062g) && kotlin.jvm.internal.h.a(this.f19058c, that.f19058c) && kotlin.jvm.internal.h.a(this.f19059d, that.f19059d) && kotlin.jvm.internal.h.a(this.f19060e, that.f19060e) && this.f19063h.f19173e == that.f19063h.f19173e) {
            return true;
        }
        return false;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C1411a) {
            C1411a c1411a = (C1411a) obj;
            if (kotlin.jvm.internal.h.a(this.f19063h, c1411a.f19063h) && a(c1411a)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hashCode(this.f19060e) + ((Objects.hashCode(this.f19059d) + ((Objects.hashCode(this.f19058c) + ((this.f19062g.hashCode() + ((this.j.hashCode() + ((this.f19064i.hashCode() + ((this.f19061f.hashCode() + ((this.f19056a.hashCode() + u0.z.c(this.f19063h.f19177i, 527, 31)) * 31)) * 31)) * 31)) * 31)) * 961)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Address{");
        y yVar = this.f19063h;
        sb.append(yVar.f19172d);
        sb.append(':');
        sb.append(yVar.f19173e);
        sb.append(", ");
        sb.append("proxySelector=" + this.f19062g);
        sb.append('}');
        return sb.toString();
    }
}
