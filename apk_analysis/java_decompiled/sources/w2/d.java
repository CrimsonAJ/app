package w2;

import B7.j;
import B7.k;
import g6.o;
import i8.A;
import i8.D;
import i8.E;
import i8.s;
import i8.x;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.security.SecureRandom;
import java.util.List;
import java.util.concurrent.TimeUnit;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;
import javax.net.ssl.X509TrustManager;
import kotlin.jvm.internal.h;
import l1.C1535g;
import o7.y;
import s8.p;
import y2.C2203a;

/* loaded from: classes.dex */
public final class d implements s {

    /* renamed from: b, reason: collision with root package name */
    public static final d f24035b = new d(0);

    /* renamed from: c, reason: collision with root package name */
    public static volatile B2.c f24036c;

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f24037a;

    public /* synthetic */ d(int i9) {
        this.f24037a = i9;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v7, types: [java.lang.Object, i8.z] */
    /* JADX WARN: Type inference failed for: r11v8, types: [java.lang.Object, i8.z] */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, i8.z] */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.Object, i8.z] */
    /* JADX WARN: Type inference failed for: r9v10, types: [java.lang.Object, javax.net.ssl.HostnameVerifier] */
    public static B2.c a(y yVar, C2203a c2203a) {
        D d9;
        E e8;
        D d10;
        int i9 = 1;
        try {
            TrustManager[] trustManagerArr = {new Object()};
            SSLContext sSLContext = SSLContext.getInstance("SSL");
            sSLContext.init(null, trustManagerArr, new SecureRandom());
            SSLSocketFactory socketFactory = sSLContext.getSocketFactory();
            E e9 = new E(new D());
            if (E2.d.f1936b.get()) {
                o oVar = o.f17761a;
                String F2 = oVar.F();
                h.e(F2, "<this>");
                x xVar = new x();
                xVar.e(null, F2);
                i8.y b9 = xVar.b();
                List o02 = j.o0(new InetAddress[]{InetAddress.getByName(oVar.D()), InetAddress.getByName(oVar.E())});
                D b10 = e9.b();
                A a5 = j8.b.f19800c;
                b10.d(new j8.a(0, b9.f19172d, o02));
                j8.b bVar = new j8.b(new E(b10), b9);
                D b11 = e9.b();
                b11.d(bVar);
                d10 = b11;
            } else {
                d10 = e9.b();
            }
            d10.d(new d(i9));
            TimeUnit timeUnit = TimeUnit.SECONDS;
            d10.b(90L);
            d10.c();
            d10.e(60L);
            d10.a(new Object());
            d10.a(new Object());
            h.b(socketFactory);
            Object[] objArr = trustManagerArr[0];
            h.c(objArr, "null cannot be cast to non-null type javax.net.ssl.X509TrustManager");
            X509TrustManager x509TrustManager = (X509TrustManager) objArr;
            if (!socketFactory.equals(d10.f18957p) || !x509TrustManager.equals(d10.f18958q)) {
                d10.f18942B = null;
            }
            d10.f18957p = socketFactory;
            p pVar = p.f22822a;
            d10.f18963v = p.f22822a.b(x509TrustManager);
            d10.f18958q = x509TrustManager;
            ?? obj = new Object();
            if (!obj.equals(d10.f18961t)) {
                d10.f18942B = null;
            }
            d10.f18961t = obj;
            e8 = new E(d10);
        } catch (Exception unused) {
            E e10 = new E(new D());
            if (E2.d.f1936b.get()) {
                o oVar2 = o.f17761a;
                String F8 = oVar2.F();
                h.e(F8, "<this>");
                x xVar2 = new x();
                xVar2.e(null, F8);
                i8.y b12 = xVar2.b();
                List o03 = j.o0(new InetAddress[]{InetAddress.getByName(oVar2.D()), InetAddress.getByName(oVar2.E())});
                D b13 = e10.b();
                A a9 = j8.b.f19800c;
                b13.d(new j8.a(0, b12.f19172d, o03));
                j8.b bVar2 = new j8.b(new E(b13), b12);
                D b14 = e10.b();
                b14.d(bVar2);
                d9 = b14;
            } else {
                d9 = e10.b();
            }
            d9.d(new d(2));
            TimeUnit timeUnit2 = TimeUnit.SECONDS;
            d9.b(90L);
            d9.c();
            d9.e(60L);
            d9.a(new Object());
            d9.a(new Object());
            e8 = new E(d9);
        }
        C1535g c1535g = new C1535g(15);
        c1535g.f20182a = e8;
        c1535g.e(O4.h.t(c2203a));
        c1535g.b(new A8.a(yVar));
        Object b15 = c1535g.g().b(B2.c.class);
        h.d(b15, "create(...)");
        return (B2.c) b15;
    }

    @Override // i8.s
    public List i(String hostname) {
        switch (this.f24037a) {
            case 1:
                h.e(hostname, "hostname");
                try {
                    InetAddress[] allByName = InetAddress.getAllByName(hostname);
                    h.d(allByName, "getAllByName(hostname)");
                    return k.C0(j.o0(allByName), new C2135b(0));
                } catch (NullPointerException e8) {
                    UnknownHostException unknownHostException = new UnknownHostException("Broken system behaviour for dns lookup of ".concat(hostname));
                    unknownHostException.initCause(e8);
                    throw unknownHostException;
                }
            case 2:
                h.e(hostname, "hostname");
                try {
                    InetAddress[] allByName2 = InetAddress.getAllByName(hostname);
                    h.d(allByName2, "getAllByName(hostname)");
                    return k.C0(j.o0(allByName2), new C2135b(1));
                } catch (NullPointerException e9) {
                    UnknownHostException unknownHostException2 = new UnknownHostException("Broken system behaviour for dns lookup of ".concat(hostname));
                    unknownHostException2.initCause(e9);
                    throw unknownHostException2;
                }
            default:
                h.e(hostname, "hostname");
                try {
                    InetAddress[] allByName3 = InetAddress.getAllByName(hostname);
                    h.d(allByName3, "getAllByName(hostname)");
                    return k.C0(j.o0(allByName3), new C2135b(2));
                } catch (NullPointerException e10) {
                    UnknownHostException unknownHostException3 = new UnknownHostException("Broken system behaviour for dns lookup of ".concat(hostname));
                    unknownHostException3.initCause(e10);
                    throw unknownHostException3;
                }
        }
    }
}
