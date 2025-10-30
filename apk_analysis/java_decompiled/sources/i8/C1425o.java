package i8;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;

/* renamed from: i8.o, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1425o {

    /* renamed from: a, reason: collision with root package name */
    public boolean f19126a = true;

    /* renamed from: b, reason: collision with root package name */
    public boolean f19127b;

    /* renamed from: c, reason: collision with root package name */
    public Object f19128c;

    /* renamed from: d, reason: collision with root package name */
    public Serializable f19129d;

    public C1426p a() {
        return new C1426p(this.f19126a, this.f19127b, (String[]) this.f19128c, (String[]) this.f19129d);
    }

    public void b(C1424n... cipherSuites) {
        kotlin.jvm.internal.h.e(cipherSuites, "cipherSuites");
        if (this.f19126a) {
            ArrayList arrayList = new ArrayList(cipherSuites.length);
            for (C1424n c1424n : cipherSuites) {
                arrayList.add(c1424n.f19125a);
            }
            String[] strArr = (String[]) arrayList.toArray(new String[0]);
            c((String[]) Arrays.copyOf(strArr, strArr.length));
            return;
        }
        throw new IllegalArgumentException("no cipher suites for cleartext connections");
    }

    public void c(String... cipherSuites) {
        kotlin.jvm.internal.h.e(cipherSuites, "cipherSuites");
        if (this.f19126a) {
            if (cipherSuites.length != 0) {
                this.f19128c = (String[]) cipherSuites.clone();
                return;
            }
            throw new IllegalArgumentException("At least one cipher suite is required");
        }
        throw new IllegalArgumentException("no cipher suites for cleartext connections");
    }

    public void d(P... pArr) {
        if (this.f19126a) {
            ArrayList arrayList = new ArrayList(pArr.length);
            for (P p9 : pArr) {
                arrayList.add(p9.f19055a);
            }
            String[] strArr = (String[]) arrayList.toArray(new String[0]);
            e((String[]) Arrays.copyOf(strArr, strArr.length));
            return;
        }
        throw new IllegalArgumentException("no TLS versions for cleartext connections");
    }

    /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.String[], java.io.Serializable] */
    public void e(String... tlsVersions) {
        kotlin.jvm.internal.h.e(tlsVersions, "tlsVersions");
        if (this.f19126a) {
            if (tlsVersions.length != 0) {
                this.f19129d = (String[]) tlsVersions.clone();
                return;
            }
            throw new IllegalArgumentException("At least one TLS version is required");
        }
        throw new IllegalArgumentException("no TLS versions for cleartext connections");
    }
}
