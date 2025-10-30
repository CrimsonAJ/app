package i8;

import com.google.android.gms.internal.measurement.D1;
import java.net.ProxySelector;
import java.util.List;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;
import l1.C1535g;

/* loaded from: classes.dex */
public final class E implements Cloneable, InterfaceC1419i {

    /* renamed from: C, reason: collision with root package name */
    public static final List f18968C = k8.c.l(F.HTTP_2, F.HTTP_1_1);

    /* renamed from: D, reason: collision with root package name */
    public static final List f18969D = k8.c.l(C1426p.f19130e, C1426p.f19131f);

    /* renamed from: A, reason: collision with root package name */
    public final long f18970A;

    /* renamed from: B, reason: collision with root package name */
    public final i.G f18971B;

    /* renamed from: a, reason: collision with root package name */
    public final C1535g f18972a;

    /* renamed from: b, reason: collision with root package name */
    public final i.G f18973b;

    /* renamed from: c, reason: collision with root package name */
    public final List f18974c;

    /* renamed from: d, reason: collision with root package name */
    public final List f18975d;

    /* renamed from: e, reason: collision with root package name */
    public final k8.a f18976e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f18977f;

    /* renamed from: g, reason: collision with root package name */
    public final InterfaceC1412b f18978g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f18979h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f18980i;
    public final r j;

    /* renamed from: k, reason: collision with root package name */
    public final C1417g f18981k;

    /* renamed from: l, reason: collision with root package name */
    public final s f18982l;

    /* renamed from: m, reason: collision with root package name */
    public final ProxySelector f18983m;

    /* renamed from: n, reason: collision with root package name */
    public final r f18984n;

    /* renamed from: o, reason: collision with root package name */
    public final SocketFactory f18985o;

    /* renamed from: p, reason: collision with root package name */
    public final SSLSocketFactory f18986p;

    /* renamed from: q, reason: collision with root package name */
    public final X509TrustManager f18987q;

    /* renamed from: r, reason: collision with root package name */
    public final List f18988r;

    /* renamed from: s, reason: collision with root package name */
    public final List f18989s;

    /* renamed from: t, reason: collision with root package name */
    public final HostnameVerifier f18990t;

    /* renamed from: u, reason: collision with root package name */
    public final C1422l f18991u;

    /* renamed from: v, reason: collision with root package name */
    public final D1 f18992v;

    /* renamed from: w, reason: collision with root package name */
    public final int f18993w;

    /* renamed from: x, reason: collision with root package name */
    public final int f18994x;

    /* renamed from: y, reason: collision with root package name */
    public final int f18995y;

    /* renamed from: z, reason: collision with root package name */
    public final int f18996z;

    /* JADX WARN: Removed duplicated region for block: B:19:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x01b0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public E(i8.D r6) {
        /*
            Method dump skipped, instructions count: 456
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: i8.E.<init>(i8.D):void");
    }

    public final D b() {
        D d9 = new D();
        d9.f18943a = this.f18972a;
        d9.f18944b = this.f18973b;
        B7.q.h0(d9.f18945c, this.f18974c);
        B7.q.h0(d9.f18946d, this.f18975d);
        d9.f18947e = this.f18976e;
        d9.f18948f = this.f18977f;
        d9.f18949g = this.f18978g;
        d9.f18950h = this.f18979h;
        d9.f18951i = this.f18980i;
        d9.j = this.j;
        d9.f18952k = this.f18981k;
        d9.f18953l = this.f18982l;
        d9.f18954m = this.f18983m;
        d9.f18955n = this.f18984n;
        d9.f18956o = this.f18985o;
        d9.f18957p = this.f18986p;
        d9.f18958q = this.f18987q;
        d9.f18959r = this.f18988r;
        d9.f18960s = this.f18989s;
        d9.f18961t = this.f18990t;
        d9.f18962u = this.f18991u;
        d9.f18963v = this.f18992v;
        d9.f18964w = this.f18993w;
        d9.f18965x = this.f18994x;
        d9.f18966y = this.f18995y;
        d9.f18967z = this.f18996z;
        d9.f18941A = this.f18970A;
        d9.f18942B = this.f18971B;
        return d9;
    }

    public final n8.g c(G request) {
        kotlin.jvm.internal.h.e(request, "request");
        return new n8.g(this, request);
    }

    public final Object clone() {
        return super.clone();
    }

    public E() {
        this(new D());
    }
}
