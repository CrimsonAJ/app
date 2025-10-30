package U6;

import A6.p;
import B6.u0;
import B7.q;
import F0.C0104h;
import a.AbstractC0485a;
import com.google.android.gms.internal.measurement.AbstractC0953k1;
import f5.C1183o;
import i8.C1411a;
import i8.E;
import i8.F;
import i8.G;
import i8.K;
import i8.L;
import i8.O;
import i8.w;
import i8.y;
import java.io.EOFException;
import java.io.IOException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.Socket;
import java.net.SocketAddress;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.h;
import n8.g;
import n8.i;
import p8.d;
import p8.e;
import x8.B;
import x8.C;
import x8.I;

/* loaded from: classes.dex */
public final class a implements o8.b {

    /* renamed from: a, reason: collision with root package name */
    public int f7521a;

    /* renamed from: b, reason: collision with root package name */
    public Object f7522b;

    /* renamed from: c, reason: collision with root package name */
    public Object f7523c;

    /* renamed from: d, reason: collision with root package name */
    public Object f7524d;

    /* renamed from: e, reason: collision with root package name */
    public Object f7525e;

    /* renamed from: f, reason: collision with root package name */
    public Object f7526f;

    /* renamed from: g, reason: collision with root package name */
    public Object f7527g;

    public a(E e8, i connection, C source, B sink) {
        h.e(connection, "connection");
        h.e(source, "source");
        h.e(sink, "sink");
        this.f7522b = e8;
        this.f7523c = connection;
        this.f7524d = source;
        this.f7525e = sink;
        this.f7526f = new C0104h(source);
    }

    @Override // o8.b
    public void a() {
        ((B) this.f7525e).flush();
    }

    @Override // o8.b
    public void b() {
        ((B) this.f7525e).flush();
    }

    @Override // o8.b
    public void c(G request) {
        h.e(request, "request");
        Proxy.Type type = ((i) this.f7523c).f21277b.f19047b.type();
        h.d(type, "connection.route().proxy.type()");
        StringBuilder sb = new StringBuilder();
        sb.append(request.f19006b);
        sb.append(' ');
        y yVar = request.f19005a;
        if (!yVar.j && type == Proxy.Type.HTTP) {
            sb.append(yVar);
        } else {
            String b9 = yVar.b();
            String d9 = yVar.d();
            if (d9 != null) {
                b9 = b9 + '?' + d9;
            }
            sb.append(b9);
        }
        sb.append(" HTTP/1.1");
        String sb2 = sb.toString();
        h.d(sb2, "StringBuilder().apply(builderAction).toString()");
        m(request.f19007c, sb2);
    }

    @Override // o8.b
    public void cancel() {
        Socket socket = ((i) this.f7523c).f21278c;
        if (socket != null) {
            k8.c.e(socket);
        }
    }

    @Override // o8.b
    public x8.G d(G request, long j) {
        h.e(request, "request");
        if ("chunked".equalsIgnoreCase(request.f19007c.b("Transfer-Encoding"))) {
            if (this.f7521a == 1) {
                this.f7521a = 2;
                return new p8.b(this);
            }
            throw new IllegalStateException(("state: " + this.f7521a).toString());
        }
        if (j != -1) {
            if (this.f7521a == 1) {
                this.f7521a = 2;
                return new e(this);
            }
            throw new IllegalStateException(("state: " + this.f7521a).toString());
        }
        throw new IllegalStateException("Cannot stream a request body without chunked encoding or a known content length!");
    }

    @Override // o8.b
    public long e(L l9) {
        if (!o8.c.a(l9)) {
            return 0L;
        }
        if ("chunked".equalsIgnoreCase(L.d(l9, "Transfer-Encoding"))) {
            return -1L;
        }
        return k8.c.k(l9);
    }

    @Override // o8.b
    public I f(L l9) {
        if (!o8.c.a(l9)) {
            return k(0L);
        }
        if ("chunked".equalsIgnoreCase(L.d(l9, "Transfer-Encoding"))) {
            y yVar = l9.f19029a.f19005a;
            if (this.f7521a == 4) {
                this.f7521a = 5;
                return new p8.c(this, yVar);
            }
            throw new IllegalStateException(("state: " + this.f7521a).toString());
        }
        long k5 = k8.c.k(l9);
        if (k5 != -1) {
            return k(k5);
        }
        if (this.f7521a == 4) {
            this.f7521a = 5;
            ((i) this.f7523c).l();
            return new p8.a(this);
        }
        throw new IllegalStateException(("state: " + this.f7521a).toString());
    }

    @Override // o8.b
    public K g(boolean z9) {
        C0104h c0104h = (C0104h) this.f7526f;
        int i9 = this.f7521a;
        if (i9 != 1 && i9 != 2 && i9 != 3) {
            throw new IllegalStateException(("state: " + this.f7521a).toString());
        }
        try {
            String a02 = ((C) c0104h.f2115c).a0(c0104h.f2114b);
            c0104h.f2114b -= a02.length();
            A3.E y9 = AbstractC0485a.y(a02);
            int i10 = y9.f46b;
            K k5 = new K();
            k5.f19018b = (F) y9.f47c;
            k5.f19019c = i10;
            k5.f19020d = (String) y9.f48d;
            C1183o c1183o = new C1183o(5);
            while (true) {
                String a03 = ((C) c0104h.f2115c).a0(c0104h.f2114b);
                c0104h.f2114b -= a03.length();
                if (a03.length() == 0) {
                    break;
                }
                c1183o.w(a03);
            }
            k5.c(c1183o.z());
            if (z9 && i10 == 100) {
                return null;
            }
            if (i10 == 100) {
                this.f7521a = 3;
                return k5;
            }
            if (102 <= i10 && i10 < 200) {
                this.f7521a = 3;
                return k5;
            }
            this.f7521a = 4;
            return k5;
        } catch (EOFException e8) {
            throw new IOException("unexpected end of stream on ".concat(((i) this.f7523c).f21277b.f19046a.f19063h.h()), e8);
        }
    }

    @Override // o8.b
    public i h() {
        return (i) this.f7523c;
    }

    public b i() {
        String str;
        if (this.f7521a == 0) {
            str = " registrationStatus";
        } else {
            str = "";
        }
        if (((Long) this.f7526f) == null) {
            str = str.concat(" expiresInSecs");
        }
        if (((Long) this.f7527g) == null) {
            str = AbstractC0953k1.n(str, " tokenCreationEpochInSecs");
        }
        if (str.isEmpty()) {
            return new b((String) this.f7522b, this.f7521a, (String) this.f7523c, (String) this.f7524d, ((Long) this.f7526f).longValue(), ((Long) this.f7527g).longValue(), (String) this.f7525e);
        }
        throw new IllegalStateException("Missing required properties:".concat(str));
    }

    public boolean j() {
        if (this.f7521a < ((List) this.f7525e).size() || !((ArrayList) this.f7527g).isEmpty()) {
            return true;
        }
        return false;
    }

    public d k(long j) {
        if (this.f7521a == 4) {
            this.f7521a = 5;
            return new d(this, j);
        }
        throw new IllegalStateException(("state: " + this.f7521a).toString());
    }

    /* JADX WARN: Type inference failed for: r3v13, types: [java.util.List, java.lang.Object] */
    public p l() {
        boolean z9;
        String hostName;
        int i9;
        List list;
        boolean contains;
        if (j()) {
            ArrayList arrayList = new ArrayList();
            while (this.f7521a < ((List) this.f7525e).size()) {
                if (this.f7521a < ((List) this.f7525e).size()) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                C1411a c1411a = (C1411a) this.f7522b;
                if (z9) {
                    List list2 = (List) this.f7525e;
                    int i10 = this.f7521a;
                    this.f7521a = i10 + 1;
                    Proxy proxy = (Proxy) list2.get(i10);
                    ArrayList arrayList2 = new ArrayList();
                    this.f7526f = arrayList2;
                    if (proxy.type() != Proxy.Type.DIRECT && proxy.type() != Proxy.Type.SOCKS) {
                        SocketAddress proxyAddress = proxy.address();
                        if (proxyAddress instanceof InetSocketAddress) {
                            h.d(proxyAddress, "proxyAddress");
                            InetSocketAddress inetSocketAddress = (InetSocketAddress) proxyAddress;
                            h.e(inetSocketAddress, "<this>");
                            InetAddress address = inetSocketAddress.getAddress();
                            if (address == null) {
                                hostName = inetSocketAddress.getHostName();
                                h.d(hostName, "hostName");
                            } else {
                                hostName = address.getHostAddress();
                                h.d(hostName, "address.hostAddress");
                            }
                            i9 = inetSocketAddress.getPort();
                        } else {
                            throw new IllegalArgumentException(("Proxy.address() is not an InetSocketAddress: " + proxyAddress.getClass()).toString());
                        }
                    } else {
                        y yVar = c1411a.f19063h;
                        hostName = yVar.f19172d;
                        i9 = yVar.f19173e;
                    }
                    if (1 <= i9 && i9 < 65536) {
                        if (proxy.type() == Proxy.Type.SOCKS) {
                            arrayList2.add(InetSocketAddress.createUnresolved(hostName, i9));
                        } else {
                            byte[] bArr = k8.c.f20141a;
                            h.e(hostName, "<this>");
                            W7.c cVar = k8.c.f20146f;
                            cVar.getClass();
                            if (cVar.f7942a.matcher(hostName).matches()) {
                                list = u0.D(InetAddress.getByName(hostName));
                            } else {
                                g call = (g) this.f7524d;
                                h.e(call, "call");
                                List i11 = c1411a.f19056a.i(hostName);
                                if (!i11.isEmpty()) {
                                    list = i11;
                                } else {
                                    throw new UnknownHostException(c1411a.f19056a + " returned no addresses for " + hostName);
                                }
                            }
                            Iterator it = list.iterator();
                            while (it.hasNext()) {
                                arrayList2.add(new InetSocketAddress((InetAddress) it.next(), i9));
                            }
                        }
                        Iterator it2 = this.f7526f.iterator();
                        while (it2.hasNext()) {
                            O o9 = new O((C1411a) this.f7522b, proxy, (InetSocketAddress) it2.next());
                            i.G g9 = (i.G) this.f7523c;
                            synchronized (g9) {
                                contains = ((LinkedHashSet) g9.f17990b).contains(o9);
                            }
                            if (contains) {
                                ((ArrayList) this.f7527g).add(o9);
                            } else {
                                arrayList.add(o9);
                            }
                        }
                        if (!arrayList.isEmpty()) {
                            break;
                        }
                    } else {
                        throw new SocketException("No route to " + hostName + ':' + i9 + "; port is out of range");
                    }
                } else {
                    throw new SocketException("No route to " + c1411a.f19063h.f19172d + "; exhausted proxy configurations: " + ((List) this.f7525e));
                }
            }
            if (arrayList.isEmpty()) {
                q.h0(arrayList, (ArrayList) this.f7527g);
                ((ArrayList) this.f7527g).clear();
            }
            return new p(arrayList);
        }
        throw new NoSuchElementException();
    }

    public void m(w wVar, String requestLine) {
        h.e(requestLine, "requestLine");
        if (this.f7521a == 0) {
            B b9 = (B) this.f7525e;
            b9.X(requestLine);
            b9.X("\r\n");
            int size = wVar.size();
            for (int i9 = 0; i9 < size; i9++) {
                b9.X(wVar.c(i9));
                b9.X(": ");
                b9.X(wVar.f(i9));
                b9.X("\r\n");
            }
            b9.X("\r\n");
            this.f7521a = 1;
            return;
        }
        throw new IllegalStateException(("state: " + this.f7521a).toString());
    }
}
