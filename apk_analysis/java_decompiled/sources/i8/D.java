package i8;

import com.google.android.gms.internal.measurement.D1;
import java.net.ProxySelector;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;
import l1.C1535g;

/* loaded from: classes.dex */
public final class D {

    /* renamed from: A, reason: collision with root package name */
    public long f18941A;

    /* renamed from: B, reason: collision with root package name */
    public i.G f18942B;

    /* renamed from: a, reason: collision with root package name */
    public C1535g f18943a = new C1535g(12);

    /* renamed from: b, reason: collision with root package name */
    public i.G f18944b = new i.G(3);

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f18945c = new ArrayList();

    /* renamed from: d, reason: collision with root package name */
    public final ArrayList f18946d = new ArrayList();

    /* renamed from: e, reason: collision with root package name */
    public k8.a f18947e = new k8.a(0);

    /* renamed from: f, reason: collision with root package name */
    public boolean f18948f = true;

    /* renamed from: g, reason: collision with root package name */
    public InterfaceC1412b f18949g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f18950h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f18951i;
    public r j;

    /* renamed from: k, reason: collision with root package name */
    public C1417g f18952k;

    /* renamed from: l, reason: collision with root package name */
    public s f18953l;

    /* renamed from: m, reason: collision with root package name */
    public ProxySelector f18954m;

    /* renamed from: n, reason: collision with root package name */
    public r f18955n;

    /* renamed from: o, reason: collision with root package name */
    public SocketFactory f18956o;

    /* renamed from: p, reason: collision with root package name */
    public SSLSocketFactory f18957p;

    /* renamed from: q, reason: collision with root package name */
    public X509TrustManager f18958q;

    /* renamed from: r, reason: collision with root package name */
    public List f18959r;

    /* renamed from: s, reason: collision with root package name */
    public List f18960s;

    /* renamed from: t, reason: collision with root package name */
    public HostnameVerifier f18961t;

    /* renamed from: u, reason: collision with root package name */
    public C1422l f18962u;

    /* renamed from: v, reason: collision with root package name */
    public D1 f18963v;

    /* renamed from: w, reason: collision with root package name */
    public int f18964w;

    /* renamed from: x, reason: collision with root package name */
    public int f18965x;

    /* renamed from: y, reason: collision with root package name */
    public int f18966y;

    /* renamed from: z, reason: collision with root package name */
    public int f18967z;

    public D() {
        r rVar = InterfaceC1412b.f19065a0;
        this.f18949g = rVar;
        this.f18950h = true;
        this.f18951i = true;
        this.j = r.f19148a;
        this.f18953l = s.f19149b0;
        this.f18955n = rVar;
        SocketFactory socketFactory = SocketFactory.getDefault();
        kotlin.jvm.internal.h.d(socketFactory, "getDefault()");
        this.f18956o = socketFactory;
        this.f18959r = E.f18969D;
        this.f18960s = E.f18968C;
        this.f18961t = w8.c.f24318a;
        this.f18962u = C1422l.f19104c;
        this.f18965x = 10000;
        this.f18966y = 10000;
        this.f18967z = 10000;
        this.f18941A = 1024L;
    }

    public final void a(z interceptor) {
        kotlin.jvm.internal.h.e(interceptor, "interceptor");
        this.f18945c.add(interceptor);
    }

    public final void b(long j) {
        TimeUnit unit = TimeUnit.SECONDS;
        kotlin.jvm.internal.h.e(unit, "unit");
        this.f18964w = k8.c.b(j);
    }

    public final void c() {
        TimeUnit unit = TimeUnit.SECONDS;
        kotlin.jvm.internal.h.e(unit, "unit");
        this.f18965x = k8.c.b(30L);
    }

    public final void d(s sVar) {
        if (!sVar.equals(this.f18953l)) {
            this.f18942B = null;
        }
        this.f18953l = sVar;
    }

    public final void e(long j) {
        TimeUnit unit = TimeUnit.SECONDS;
        kotlin.jvm.internal.h.e(unit, "unit");
        this.f18966y = k8.c.b(j);
    }
}
