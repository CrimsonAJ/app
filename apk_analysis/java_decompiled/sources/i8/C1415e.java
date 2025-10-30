package i8;

import B6.u0;
import a.AbstractC0485a;
import com.google.android.gms.internal.measurement.D1;
import f5.C1183o;
import java.io.IOException;
import java.security.cert.Certificate;
import java.security.cert.CertificateEncodingException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import l6.AbstractC1570b;
import x8.AbstractC2181a;
import x8.C2186f;
import x8.C2190j;

/* renamed from: i8.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1415e {

    /* renamed from: k, reason: collision with root package name */
    public static final String f19072k;

    /* renamed from: l, reason: collision with root package name */
    public static final String f19073l;

    /* renamed from: a, reason: collision with root package name */
    public final y f19074a;

    /* renamed from: b, reason: collision with root package name */
    public final w f19075b;

    /* renamed from: c, reason: collision with root package name */
    public final String f19076c;

    /* renamed from: d, reason: collision with root package name */
    public final F f19077d;

    /* renamed from: e, reason: collision with root package name */
    public final int f19078e;

    /* renamed from: f, reason: collision with root package name */
    public final String f19079f;

    /* renamed from: g, reason: collision with root package name */
    public final w f19080g;

    /* renamed from: h, reason: collision with root package name */
    public final v f19081h;

    /* renamed from: i, reason: collision with root package name */
    public final long f19082i;
    public final long j;

    static {
        s8.p pVar = s8.p.f22822a;
        s8.p.f22822a.getClass();
        f19072k = "OkHttp-Sent-Millis";
        s8.p.f22822a.getClass();
        f19073l = "OkHttp-Received-Millis";
    }

    public C1415e(x8.I rawSource) {
        y yVar;
        P p9;
        kotlin.jvm.internal.h.e(rawSource, "rawSource");
        try {
            x8.C b9 = v4.e.b(rawSource);
            String a02 = b9.a0(Long.MAX_VALUE);
            try {
                x xVar = new x();
                xVar.e(null, a02);
                yVar = xVar.b();
            } catch (IllegalArgumentException unused) {
                yVar = null;
            }
            if (yVar != null) {
                this.f19074a = yVar;
                this.f19076c = b9.a0(Long.MAX_VALUE);
                C1183o c1183o = new C1183o(5);
                int t7 = AbstractC1570b.t(b9);
                for (int i9 = 0; i9 < t7; i9++) {
                    c1183o.w(b9.a0(Long.MAX_VALUE));
                }
                this.f19075b = c1183o.z();
                A3.E y9 = AbstractC0485a.y(b9.a0(Long.MAX_VALUE));
                this.f19077d = (F) y9.f47c;
                this.f19078e = y9.f46b;
                this.f19079f = (String) y9.f48d;
                C1183o c1183o2 = new C1183o(5);
                int t9 = AbstractC1570b.t(b9);
                for (int i10 = 0; i10 < t9; i10++) {
                    c1183o2.w(b9.a0(Long.MAX_VALUE));
                }
                String str = f19072k;
                String B9 = c1183o2.B(str);
                String str2 = f19073l;
                String B10 = c1183o2.B(str2);
                c1183o2.E(str);
                c1183o2.E(str2);
                this.f19082i = B9 != null ? Long.parseLong(B9) : 0L;
                this.j = B10 != null ? Long.parseLong(B10) : 0L;
                this.f19080g = c1183o2.z();
                if (kotlin.jvm.internal.h.a(this.f19074a.f19169a, "https")) {
                    String a03 = b9.a0(Long.MAX_VALUE);
                    if (a03.length() <= 0) {
                        C1424n e8 = C1424n.f19107b.e(b9.a0(Long.MAX_VALUE));
                        List a5 = a(b9);
                        List a9 = a(b9);
                        if (!b9.a()) {
                            p9 = Z0.a.g(b9.a0(Long.MAX_VALUE));
                        } else {
                            p9 = P.SSL_3_0;
                        }
                        this.f19081h = new v(p9, e8, k8.c.x(a9), new u(k8.c.x(a5), 0));
                    } else {
                        throw new IOException("expected \"\" but was \"" + a03 + '\"');
                    }
                } else {
                    this.f19081h = null;
                }
                rawSource.close();
                return;
            }
            IOException iOException = new IOException("Cache corruption for ".concat(a02));
            s8.p pVar = s8.p.f22822a;
            s8.p.f22822a.getClass();
            s8.p.i("cache corruption", 5, iOException);
            throw iOException;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                D1.h(rawSource, th);
                throw th2;
            }
        }
    }

    /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Object, x8.i, x8.g] */
    public static List a(x8.C c3) {
        int t7 = AbstractC1570b.t(c3);
        if (t7 == -1) {
            return B7.t.f1135a;
        }
        try {
            CertificateFactory certificateFactory = CertificateFactory.getInstance("X.509");
            ArrayList arrayList = new ArrayList(t7);
            for (int i9 = 0; i9 < t7; i9++) {
                String a02 = c3.a0(Long.MAX_VALUE);
                ?? obj = new Object();
                C2190j c2190j = C2190j.f24645d;
                C2190j B9 = e0.c.B(a02);
                if (B9 != null) {
                    obj.t0(B9);
                    arrayList.add(certificateFactory.generateCertificate(new C2186f(obj, 0)));
                } else {
                    throw new IOException("Corrupt certificate in cache entry");
                }
            }
            return arrayList;
        } catch (CertificateException e8) {
            throw new IOException(e8.getMessage());
        }
    }

    public static void b(x8.B b9, List list) {
        try {
            b9.Y(list.size());
            b9.y(10);
            Iterator it = list.iterator();
            while (it.hasNext()) {
                byte[] bytes = ((Certificate) it.next()).getEncoded();
                C2190j c2190j = C2190j.f24645d;
                kotlin.jvm.internal.h.d(bytes, "bytes");
                b9.X(AbstractC2181a.a(e0.c.I(bytes).f24646a, AbstractC2181a.f24626a));
                b9.y(10);
            }
        } catch (CertificateEncodingException e8) {
            throw new IOException(e8.getMessage());
        }
    }

    public final void c(A6.t tVar) {
        y yVar = this.f19074a;
        v vVar = this.f19081h;
        w wVar = this.f19080g;
        w wVar2 = this.f19075b;
        x8.B a5 = v4.e.a(tVar.j(0));
        try {
            a5.X(yVar.f19177i);
            a5.y(10);
            a5.X(this.f19076c);
            a5.y(10);
            a5.Y(wVar2.size());
            a5.y(10);
            int size = wVar2.size();
            for (int i9 = 0; i9 < size; i9++) {
                a5.X(wVar2.c(i9));
                a5.X(": ");
                a5.X(wVar2.f(i9));
                a5.y(10);
            }
            F protocol = this.f19077d;
            int i10 = this.f19078e;
            String message = this.f19079f;
            kotlin.jvm.internal.h.e(protocol, "protocol");
            kotlin.jvm.internal.h.e(message, "message");
            StringBuilder sb = new StringBuilder();
            if (protocol == F.HTTP_1_0) {
                sb.append("HTTP/1.0");
            } else {
                sb.append("HTTP/1.1");
            }
            sb.append(' ');
            sb.append(i10);
            sb.append(' ');
            sb.append(message);
            String sb2 = sb.toString();
            kotlin.jvm.internal.h.d(sb2, "StringBuilder().apply(builderAction).toString()");
            a5.X(sb2);
            a5.y(10);
            a5.Y(wVar.size() + 2);
            a5.y(10);
            int size2 = wVar.size();
            for (int i11 = 0; i11 < size2; i11++) {
                a5.X(wVar.c(i11));
                a5.X(": ");
                a5.X(wVar.f(i11));
                a5.y(10);
            }
            a5.X(f19072k);
            a5.X(": ");
            a5.Y(this.f19082i);
            a5.y(10);
            a5.X(f19073l);
            a5.X(": ");
            a5.Y(this.j);
            a5.y(10);
            if (kotlin.jvm.internal.h.a(yVar.f19169a, "https")) {
                a5.y(10);
                kotlin.jvm.internal.h.b(vVar);
                a5.X(vVar.f19156b.f19125a);
                a5.y(10);
                b(a5, vVar.a());
                b(a5, vVar.f19157c);
                a5.X(vVar.f19155a.f19055a);
                a5.y(10);
            }
            a5.close();
        } finally {
        }
    }

    public C1415e(L l9) {
        w wVar;
        G g9 = l9.f19029a;
        this.f19074a = g9.f19005a;
        L l10 = l9.f19036h;
        kotlin.jvm.internal.h.b(l10);
        w wVar2 = l10.f19029a.f19007c;
        w wVar3 = l9.f19034f;
        Set x5 = AbstractC1570b.x(wVar3);
        if (x5.isEmpty()) {
            wVar = k8.c.f20142b;
        } else {
            ArrayList arrayList = new ArrayList(20);
            int size = wVar2.size();
            for (int i9 = 0; i9 < size; i9++) {
                String name = wVar2.c(i9);
                if (x5.contains(name)) {
                    String value = wVar2.f(i9);
                    kotlin.jvm.internal.h.e(name, "name");
                    kotlin.jvm.internal.h.e(value, "value");
                    u0.h(name);
                    u0.i(value, name);
                    arrayList.add(name);
                    arrayList.add(W7.d.j0(value).toString());
                }
            }
            wVar = new w((String[]) arrayList.toArray(new String[0]));
        }
        this.f19075b = wVar;
        this.f19076c = g9.f19006b;
        this.f19077d = l9.f19030b;
        this.f19078e = l9.f19032d;
        this.f19079f = l9.f19031c;
        this.f19080g = wVar3;
        this.f19081h = l9.f19033e;
        this.f19082i = l9.f19038k;
        this.j = l9.f19039l;
    }
}
