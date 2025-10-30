package q8;

import a.AbstractC0485a;
import com.google.android.gms.internal.measurement.AbstractC0953k1;
import i8.E;
import i8.F;
import i8.G;
import i8.K;
import i8.L;
import java.io.IOException;
import java.net.ProtocolException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import x8.C2190j;
import x8.I;

/* loaded from: classes.dex */
public final class o implements o8.b {

    /* renamed from: g, reason: collision with root package name */
    public static final List f22520g = k8.c.l("connection", "host", "keep-alive", "proxy-connection", "te", "transfer-encoding", "encoding", "upgrade", ":method", ":path", ":scheme", ":authority");

    /* renamed from: h, reason: collision with root package name */
    public static final List f22521h = k8.c.l("connection", "host", "keep-alive", "proxy-connection", "te", "transfer-encoding", "encoding", "upgrade");

    /* renamed from: a, reason: collision with root package name */
    public final n8.i f22522a;

    /* renamed from: b, reason: collision with root package name */
    public final o8.d f22523b;

    /* renamed from: c, reason: collision with root package name */
    public final n f22524c;

    /* renamed from: d, reason: collision with root package name */
    public volatile v f22525d;

    /* renamed from: e, reason: collision with root package name */
    public final F f22526e;

    /* renamed from: f, reason: collision with root package name */
    public volatile boolean f22527f;

    public o(E client, n8.i connection, o8.d dVar, n http2Connection) {
        kotlin.jvm.internal.h.e(client, "client");
        kotlin.jvm.internal.h.e(connection, "connection");
        kotlin.jvm.internal.h.e(http2Connection, "http2Connection");
        this.f22522a = connection;
        this.f22523b = dVar;
        this.f22524c = http2Connection;
        F f9 = F.H2_PRIOR_KNOWLEDGE;
        this.f22526e = client.f18989s.contains(f9) ? f9 : F.HTTP_2;
    }

    @Override // o8.b
    public final void a() {
        v vVar = this.f22525d;
        kotlin.jvm.internal.h.b(vVar);
        vVar.g().close();
    }

    @Override // o8.b
    public final void b() {
        this.f22524c.flush();
    }

    @Override // o8.b
    public final void c(G request) {
        boolean z9;
        int i9;
        v vVar;
        kotlin.jvm.internal.h.e(request, "request");
        if (this.f22525d != null) {
            return;
        }
        boolean z10 = true;
        if (request.f19008d != null) {
            z9 = true;
        } else {
            z9 = false;
        }
        i8.w wVar = request.f19007c;
        ArrayList arrayList = new ArrayList(wVar.size() + 4);
        arrayList.add(new b(request.f19006b, b.f22449f));
        C2190j c2190j = b.f22450g;
        i8.y url = request.f19005a;
        kotlin.jvm.internal.h.e(url, "url");
        String b9 = url.b();
        String d9 = url.d();
        if (d9 != null) {
            b9 = b9 + '?' + d9;
        }
        arrayList.add(new b(b9, c2190j));
        String b10 = request.f19007c.b("Host");
        if (b10 != null) {
            arrayList.add(new b(b10, b.f22452i));
        }
        arrayList.add(new b(url.f19169a, b.f22451h));
        int size = wVar.size();
        for (int i10 = 0; i10 < size; i10++) {
            String c3 = wVar.c(i10);
            Locale US = Locale.US;
            kotlin.jvm.internal.h.d(US, "US");
            String lowerCase = c3.toLowerCase(US);
            kotlin.jvm.internal.h.d(lowerCase, "this as java.lang.String).toLowerCase(locale)");
            if (!f22520g.contains(lowerCase) || (lowerCase.equals("te") && kotlin.jvm.internal.h.a(wVar.f(i10), "trailers"))) {
                arrayList.add(new b(lowerCase, wVar.f(i10)));
            }
        }
        n nVar = this.f22524c;
        nVar.getClass();
        boolean z11 = !z9;
        synchronized (nVar.f22517w) {
            synchronized (nVar) {
                try {
                    if (nVar.f22500e > 1073741823) {
                        nVar.x(8);
                    }
                    if (!nVar.f22501f) {
                        i9 = nVar.f22500e;
                        nVar.f22500e = i9 + 2;
                        vVar = new v(i9, nVar, z11, false, null);
                        if (z9 && nVar.f22514t < nVar.f22515u && vVar.f22553e < vVar.f22554f) {
                            z10 = false;
                        }
                        if (vVar.i()) {
                            nVar.f22497b.put(Integer.valueOf(i9), vVar);
                        }
                    } else {
                        throw new IOException();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            nVar.f22517w.x(z11, i9, arrayList);
        }
        if (z10) {
            nVar.f22517w.flush();
        }
        this.f22525d = vVar;
        if (!this.f22527f) {
            v vVar2 = this.f22525d;
            kotlin.jvm.internal.h.b(vVar2);
            u uVar = vVar2.f22558k;
            long j = this.f22523b.f21758g;
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            uVar.g(j);
            v vVar3 = this.f22525d;
            kotlin.jvm.internal.h.b(vVar3);
            vVar3.f22559l.g(this.f22523b.f21759h);
            return;
        }
        v vVar4 = this.f22525d;
        kotlin.jvm.internal.h.b(vVar4);
        vVar4.e(9);
        throw new IOException("Canceled");
    }

    @Override // o8.b
    public final void cancel() {
        this.f22527f = true;
        v vVar = this.f22525d;
        if (vVar != null) {
            vVar.e(9);
        }
    }

    @Override // o8.b
    public final x8.G d(G request, long j) {
        kotlin.jvm.internal.h.e(request, "request");
        v vVar = this.f22525d;
        kotlin.jvm.internal.h.b(vVar);
        return vVar.g();
    }

    @Override // o8.b
    public final long e(L l9) {
        if (!o8.c.a(l9)) {
            return 0L;
        }
        return k8.c.k(l9);
    }

    @Override // o8.b
    public final I f(L l9) {
        v vVar = this.f22525d;
        kotlin.jvm.internal.h.b(vVar);
        return vVar.f22557i;
    }

    @Override // o8.b
    public final K g(boolean z9) {
        i8.w wVar;
        v vVar = this.f22525d;
        if (vVar != null) {
            synchronized (vVar) {
                vVar.f22558k.h();
                while (vVar.f22555g.isEmpty() && vVar.f22560m == 0) {
                    try {
                        vVar.l();
                    } catch (Throwable th) {
                        vVar.f22558k.k();
                        throw th;
                    }
                }
                vVar.f22558k.k();
                if (!vVar.f22555g.isEmpty()) {
                    Object removeFirst = vVar.f22555g.removeFirst();
                    kotlin.jvm.internal.h.d(removeFirst, "headersQueue.removeFirst()");
                    wVar = (i8.w) removeFirst;
                } else {
                    IOException iOException = vVar.f22561n;
                    if (iOException == null) {
                        int i9 = vVar.f22560m;
                        AbstractC0953k1.s(i9);
                        throw new A(i9);
                    }
                    throw iOException;
                }
            }
            F protocol = this.f22526e;
            kotlin.jvm.internal.h.e(protocol, "protocol");
            ArrayList arrayList = new ArrayList(20);
            int size = wVar.size();
            A3.E e8 = null;
            for (int i10 = 0; i10 < size; i10++) {
                String name = wVar.c(i10);
                String value = wVar.f(i10);
                if (kotlin.jvm.internal.h.a(name, ":status")) {
                    e8 = AbstractC0485a.y("HTTP/1.1 " + value);
                } else if (!f22521h.contains(name)) {
                    kotlin.jvm.internal.h.e(name, "name");
                    kotlin.jvm.internal.h.e(value, "value");
                    arrayList.add(name);
                    arrayList.add(W7.d.j0(value).toString());
                }
            }
            if (e8 != null) {
                K k5 = new K();
                k5.f19018b = protocol;
                k5.f19019c = e8.f46b;
                k5.f19020d = (String) e8.f48d;
                k5.c(new i8.w((String[]) arrayList.toArray(new String[0])));
                if (z9 && k5.f19019c == 100) {
                    return null;
                }
                return k5;
            }
            throw new ProtocolException("Expected ':status' header not present");
        }
        throw new IOException("stream wasn't created");
    }

    @Override // o8.b
    public final n8.i h() {
        return this.f22522a;
    }
}
