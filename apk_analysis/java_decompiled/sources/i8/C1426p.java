package i8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import javax.net.ssl.SSLSocket;

/* renamed from: i8.p, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1426p {

    /* renamed from: e, reason: collision with root package name */
    public static final C1426p f19130e;

    /* renamed from: f, reason: collision with root package name */
    public static final C1426p f19131f;

    /* renamed from: a, reason: collision with root package name */
    public final boolean f19132a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f19133b;

    /* renamed from: c, reason: collision with root package name */
    public final String[] f19134c;

    /* renamed from: d, reason: collision with root package name */
    public final String[] f19135d;

    static {
        C1424n c1424n = C1424n.f19122r;
        C1424n c1424n2 = C1424n.f19123s;
        C1424n c1424n3 = C1424n.f19124t;
        C1424n c1424n4 = C1424n.f19116l;
        C1424n c1424n5 = C1424n.f19118n;
        C1424n c1424n6 = C1424n.f19117m;
        C1424n c1424n7 = C1424n.f19119o;
        C1424n c1424n8 = C1424n.f19121q;
        C1424n c1424n9 = C1424n.f19120p;
        C1424n[] c1424nArr = {c1424n, c1424n2, c1424n3, c1424n4, c1424n5, c1424n6, c1424n7, c1424n8, c1424n9, C1424n.j, C1424n.f19115k, C1424n.f19113h, C1424n.f19114i, C1424n.f19111f, C1424n.f19112g, C1424n.f19110e};
        C1425o c1425o = new C1425o();
        c1425o.b((C1424n[]) Arrays.copyOf(new C1424n[]{c1424n, c1424n2, c1424n3, c1424n4, c1424n5, c1424n6, c1424n7, c1424n8, c1424n9}, 9));
        P p9 = P.TLS_1_3;
        P p10 = P.TLS_1_2;
        c1425o.d(p9, p10);
        if (c1425o.f19126a) {
            c1425o.f19127b = true;
            c1425o.a();
            C1425o c1425o2 = new C1425o();
            c1425o2.b((C1424n[]) Arrays.copyOf(c1424nArr, 16));
            c1425o2.d(p9, p10);
            if (c1425o2.f19126a) {
                c1425o2.f19127b = true;
                f19130e = c1425o2.a();
                C1425o c1425o3 = new C1425o();
                c1425o3.b((C1424n[]) Arrays.copyOf(c1424nArr, 16));
                c1425o3.d(p9, p10, P.TLS_1_1, P.TLS_1_0);
                if (c1425o3.f19126a) {
                    c1425o3.f19127b = true;
                    c1425o3.a();
                    f19131f = new C1426p(false, false, null, null);
                    return;
                }
                throw new IllegalArgumentException("no TLS extensions for cleartext connections");
            }
            throw new IllegalArgumentException("no TLS extensions for cleartext connections");
        }
        throw new IllegalArgumentException("no TLS extensions for cleartext connections");
    }

    public C1426p(boolean z9, boolean z10, String[] strArr, String[] strArr2) {
        this.f19132a = z9;
        this.f19133b = z10;
        this.f19134c = strArr;
        this.f19135d = strArr2;
    }

    public final List a() {
        String[] strArr = this.f19134c;
        if (strArr != null) {
            ArrayList arrayList = new ArrayList(strArr.length);
            for (String str : strArr) {
                arrayList.add(C1424n.f19107b.e(str));
            }
            return B7.k.H0(arrayList);
        }
        return null;
    }

    public final boolean b(SSLSocket sSLSocket) {
        if (this.f19132a) {
            String[] strArr = this.f19135d;
            if (strArr == null || k8.c.j(strArr, sSLSocket.getEnabledProtocols(), D7.a.f1918b)) {
                String[] strArr2 = this.f19134c;
                if (strArr2 != null && !k8.c.j(strArr2, sSLSocket.getEnabledCipherSuites(), C1424n.f19108c)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return false;
    }

    public final List c() {
        String[] strArr = this.f19135d;
        if (strArr != null) {
            ArrayList arrayList = new ArrayList(strArr.length);
            for (String str : strArr) {
                arrayList.add(Z0.a.g(str));
            }
            return B7.k.H0(arrayList);
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C1426p) {
            if (obj != this) {
                C1426p c1426p = (C1426p) obj;
                boolean z9 = c1426p.f19132a;
                boolean z10 = this.f19132a;
                if (z10 == z9) {
                    if (z10) {
                        if (!Arrays.equals(this.f19134c, c1426p.f19134c) || !Arrays.equals(this.f19135d, c1426p.f19135d) || this.f19133b != c1426p.f19133b) {
                            return false;
                        }
                        return true;
                    }
                    return true;
                }
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i9;
        if (this.f19132a) {
            int i10 = 0;
            String[] strArr = this.f19134c;
            if (strArr != null) {
                i9 = Arrays.hashCode(strArr);
            } else {
                i9 = 0;
            }
            int i11 = (527 + i9) * 31;
            String[] strArr2 = this.f19135d;
            if (strArr2 != null) {
                i10 = Arrays.hashCode(strArr2);
            }
            return ((i11 + i10) * 31) + (!this.f19133b ? 1 : 0);
        }
        return 17;
    }

    public final String toString() {
        if (!this.f19132a) {
            return "ConnectionSpec()";
        }
        return "ConnectionSpec(cipherSuites=" + Objects.toString(a(), "[all enabled]") + ", tlsVersions=" + Objects.toString(c(), "[all enabled]") + ", supportsTlsExtensions=" + this.f19133b + ')';
    }
}
