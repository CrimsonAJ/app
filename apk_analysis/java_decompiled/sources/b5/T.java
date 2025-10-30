package b5;

import i8.C1423m;
import i8.C1424n;
import i8.C1426p;
import java.net.UnknownServiceException;
import java.util.Arrays;
import java.util.List;
import javax.net.ssl.SSLSocket;

/* loaded from: classes.dex */
public final class T {

    /* renamed from: a, reason: collision with root package name */
    public int f10963a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f10964b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f10965c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f10966d;

    public T(V v8, int i9, boolean z9, boolean z10) {
        this.f10966d = v8;
        this.f10963a = i9;
        this.f10964b = z9;
        this.f10965c = z10;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [i8.o, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.String[], java.io.Serializable] */
    public C1426p a(SSLSocket sSLSocket) {
        C1426p c1426p;
        int i9;
        boolean z9;
        String[] cipherSuitesIntersection;
        String[] tlsVersionsIntersection;
        int i10 = this.f10963a;
        List list = (List) this.f10966d;
        int size = list.size();
        while (true) {
            if (i10 < size) {
                c1426p = (C1426p) list.get(i10);
                if (c1426p.b(sSLSocket)) {
                    this.f10963a = i10 + 1;
                    break;
                }
                i10++;
            } else {
                c1426p = null;
                break;
            }
        }
        if (c1426p != null) {
            int i11 = this.f10963a;
            int size2 = list.size();
            while (true) {
                i9 = 0;
                if (i11 < size2) {
                    if (((C1426p) list.get(i11)).b(sSLSocket)) {
                        z9 = true;
                        break;
                    }
                    i11++;
                } else {
                    z9 = false;
                    break;
                }
            }
            this.f10964b = z9;
            boolean z10 = this.f10965c;
            String[] strArr = c1426p.f19134c;
            if (strArr != null) {
                String[] enabledCipherSuites = sSLSocket.getEnabledCipherSuites();
                kotlin.jvm.internal.h.d(enabledCipherSuites, "sslSocket.enabledCipherSuites");
                cipherSuitesIntersection = k8.c.p(enabledCipherSuites, strArr, C1424n.f19108c);
            } else {
                cipherSuitesIntersection = sSLSocket.getEnabledCipherSuites();
            }
            ?? r62 = c1426p.f19135d;
            if (r62 != 0) {
                String[] enabledProtocols = sSLSocket.getEnabledProtocols();
                kotlin.jvm.internal.h.d(enabledProtocols, "sslSocket.enabledProtocols");
                tlsVersionsIntersection = k8.c.p(enabledProtocols, r62, D7.a.f1918b);
            } else {
                tlsVersionsIntersection = sSLSocket.getEnabledProtocols();
            }
            String[] supportedCipherSuites = sSLSocket.getSupportedCipherSuites();
            kotlin.jvm.internal.h.d(supportedCipherSuites, "supportedCipherSuites");
            C1423m c1423m = C1424n.f19108c;
            byte[] bArr = k8.c.f20141a;
            int length = supportedCipherSuites.length;
            while (true) {
                if (i9 < length) {
                    if (c1423m.compare(supportedCipherSuites[i9], "TLS_FALLBACK_SCSV") == 0) {
                        break;
                    }
                    i9++;
                } else {
                    i9 = -1;
                    break;
                }
            }
            if (z10 && i9 != -1) {
                kotlin.jvm.internal.h.d(cipherSuitesIntersection, "cipherSuitesIntersection");
                String str = supportedCipherSuites[i9];
                kotlin.jvm.internal.h.d(str, "supportedCipherSuites[indexOfFallbackScsv]");
                Object[] copyOf = Arrays.copyOf(cipherSuitesIntersection, cipherSuitesIntersection.length + 1);
                kotlin.jvm.internal.h.d(copyOf, "copyOf(this, newSize)");
                cipherSuitesIntersection = (String[]) copyOf;
                cipherSuitesIntersection[cipherSuitesIntersection.length - 1] = str;
            }
            ?? obj = new Object();
            obj.f19126a = c1426p.f19132a;
            obj.f19128c = strArr;
            obj.f19129d = r62;
            obj.f19127b = c1426p.f19133b;
            kotlin.jvm.internal.h.d(cipherSuitesIntersection, "cipherSuitesIntersection");
            obj.c((String[]) Arrays.copyOf(cipherSuitesIntersection, cipherSuitesIntersection.length));
            kotlin.jvm.internal.h.d(tlsVersionsIntersection, "tlsVersionsIntersection");
            obj.e((String[]) Arrays.copyOf(tlsVersionsIntersection, tlsVersionsIntersection.length));
            C1426p a5 = obj.a();
            if (a5.c() != null) {
                sSLSocket.setEnabledProtocols(a5.f19135d);
            }
            if (a5.a() != null) {
                sSLSocket.setEnabledCipherSuites(a5.f19134c);
            }
            return c1426p;
        }
        StringBuilder sb = new StringBuilder("Unable to find acceptable protocols. isFallback=");
        sb.append(this.f10965c);
        sb.append(", modes=");
        sb.append(list);
        sb.append(", supported protocols=");
        String[] enabledProtocols2 = sSLSocket.getEnabledProtocols();
        kotlin.jvm.internal.h.b(enabledProtocols2);
        String arrays = Arrays.toString(enabledProtocols2);
        kotlin.jvm.internal.h.d(arrays, "toString(this)");
        sb.append(arrays);
        throw new UnknownServiceException(sb.toString());
    }

    public void b(String str) {
        ((V) this.f10966d).x0(this.f10963a, this.f10964b, this.f10965c, str, null, null, null);
    }

    public void c(Object obj, String str) {
        ((V) this.f10966d).x0(this.f10963a, this.f10964b, this.f10965c, str, obj, null, null);
    }

    public void d(Object obj, Object obj2, String str) {
        ((V) this.f10966d).x0(this.f10963a, this.f10964b, this.f10965c, str, obj, obj2, null);
    }

    public void e(String str, Object obj, Object obj2, Object obj3) {
        ((V) this.f10966d).x0(this.f10963a, this.f10964b, this.f10965c, str, obj, obj2, obj3);
    }

    public T(List connectionSpecs) {
        kotlin.jvm.internal.h.e(connectionSpecs, "connectionSpecs");
        this.f10966d = connectionSpecs;
    }
}
