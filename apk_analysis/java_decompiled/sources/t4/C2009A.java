package t4;

import D4.C0088g;
import D4.C0090i;
import D4.G;
import android.content.Context;
import android.os.Handler;
import com.google.android.gms.cast.CastDevice;
import com.google.android.gms.common.api.Status;
import f5.C1177i;
import f5.C1185q;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;
import u4.D;

/* renamed from: t4.A, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2009A extends C4.j {

    /* renamed from: G, reason: collision with root package name */
    public static final y4.b f23120G = new y4.b("CastClient", null);

    /* renamed from: H, reason: collision with root package name */
    public static final A1.g f23121H = new A1.g("Cast.API_CXLESS", new H4.b(6), y4.k.f24937a);

    /* renamed from: A, reason: collision with root package name */
    public final CastDevice f23122A;

    /* renamed from: B, reason: collision with root package name */
    public final HashMap f23123B;

    /* renamed from: C, reason: collision with root package name */
    public final HashMap f23124C;

    /* renamed from: D, reason: collision with root package name */
    public final D f23125D;

    /* renamed from: E, reason: collision with root package name */
    public final List f23126E;

    /* renamed from: F, reason: collision with root package name */
    public int f23127F;

    /* renamed from: k, reason: collision with root package name */
    public final z f23128k;

    /* renamed from: l, reason: collision with root package name */
    public T4.d f23129l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f23130m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f23131n;

    /* renamed from: o, reason: collision with root package name */
    public C1177i f23132o;

    /* renamed from: p, reason: collision with root package name */
    public C1177i f23133p;

    /* renamed from: q, reason: collision with root package name */
    public final AtomicLong f23134q;

    /* renamed from: r, reason: collision with root package name */
    public final Object f23135r;

    /* renamed from: s, reason: collision with root package name */
    public final Object f23136s;

    /* renamed from: t, reason: collision with root package name */
    public C2014d f23137t;

    /* renamed from: u, reason: collision with root package name */
    public String f23138u;

    /* renamed from: v, reason: collision with root package name */
    public double f23139v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f23140w;

    /* renamed from: x, reason: collision with root package name */
    public int f23141x;

    /* renamed from: y, reason: collision with root package name */
    public int f23142y;

    /* renamed from: z, reason: collision with root package name */
    public u f23143z;

    public C2009A(Context context, e eVar) {
        super(context, null, f23121H, eVar, C4.i.f1575c);
        this.f23128k = new z(this);
        this.f23135r = new Object();
        this.f23136s = new Object();
        this.f23126E = Collections.synchronizedList(new ArrayList());
        this.f23125D = eVar.f23180b;
        this.f23122A = eVar.f23179a;
        this.f23123B = new HashMap();
        this.f23124C = new HashMap();
        this.f23134q = new AtomicLong(0L);
        this.f23127F = 1;
        j();
    }

    public static void d(C2009A c2009a, long j, int i9) {
        C1177i c1177i;
        HashMap hashMap = c2009a.f23123B;
        synchronized (hashMap) {
            Long valueOf = Long.valueOf(j);
            c1177i = (C1177i) hashMap.get(valueOf);
            hashMap.remove(valueOf);
        }
        if (c1177i != null) {
            if (i9 == 0) {
                c1177i.b(null);
            } else {
                c1177i.a(F4.y.l(new Status(i9, null, null, null)));
            }
        }
    }

    public static void e(C2009A c2009a, int i9) {
        synchronized (c2009a.f23136s) {
            try {
                C1177i c1177i = c2009a.f23133p;
                if (c1177i == null) {
                    return;
                }
                if (i9 == 0) {
                    c1177i.b(new Status(0, null, null, null));
                } else {
                    c1177i.a(F4.y.l(new Status(i9, null, null, null)));
                }
                c2009a.f23133p = null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static Handler k(C2009A c2009a) {
        if (c2009a.f23129l == null) {
            c2009a.f23129l = new T4.d(c2009a.f1583f, 4);
        }
        return c2009a.f23129l;
    }

    public final C1185q f(y4.i iVar) {
        C0090i c0090i = b(iVar).f1858a;
        F4.y.i(c0090i, "Key must not be null");
        C0088g c0088g = this.j;
        c0088g.getClass();
        C1177i c1177i = new C1177i();
        c0088g.f(c1177i, 8415, this);
        D4.B b9 = new D4.B(new G(c0090i, c1177i), c0088g.f1851i.get(), this);
        T4.d dVar = c0088g.f1855n;
        dVar.sendMessage(dVar.obtainMessage(13, b9));
        return c1177i.f17413a;
    }

    public final void g() {
        f23120G.b("removing all MessageReceivedCallbacks", new Object[0]);
        HashMap hashMap = this.f23124C;
        synchronized (hashMap) {
            hashMap.clear();
        }
    }

    public final void h(int i9) {
        synchronized (this.f23135r) {
            try {
                C1177i c1177i = this.f23132o;
                if (c1177i != null) {
                    c1177i.a(F4.y.l(new Status(i9, null, null, null)));
                }
                this.f23132o = null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final C1185q i() {
        D4.n g9 = D4.n.g();
        g9.f1864e = new d0.w(13);
        g9.f1863d = 8403;
        C1185q c3 = c(1, g9.f());
        g();
        f(this.f23128k);
        return c3;
    }

    public final void j() {
        CastDevice castDevice = this.f23122A;
        if (!castDevice.f14591i.l(2048)) {
            e1.q qVar = castDevice.f14591i;
            if (qVar.l(4) && !qVar.l(1)) {
                "Chromecast Audio".equals(castDevice.f14587e);
            }
        }
    }
}
