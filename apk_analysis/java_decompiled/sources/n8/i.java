package n8;

import B6.u0;
import B7.k;
import Y2.r;
import b5.T;
import b5.W;
import com.google.android.gms.internal.measurement.AbstractC0953k1;
import f5.C1183o;
import i.G;
import i8.C1411a;
import i8.C1421k;
import i8.C1422l;
import i8.C1426p;
import i8.E;
import i8.F;
import i8.L;
import i8.O;
import i8.v;
import i8.y;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.ConnectException;
import java.net.InetSocketAddress;
import java.net.ProtocolException;
import java.net.Proxy;
import java.net.Socket;
import java.net.SocketTimeoutException;
import java.net.UnknownServiceException;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLHandshakeException;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import q8.n;
import q8.o;
import q8.w;
import q8.z;
import s8.p;
import x8.AbstractC2181a;
import x8.B;
import x8.C;
import x8.C2190j;
import x8.K;

/* loaded from: classes.dex */
public final class i extends q8.h {

    /* renamed from: b, reason: collision with root package name */
    public final O f21277b;

    /* renamed from: c, reason: collision with root package name */
    public Socket f21278c;

    /* renamed from: d, reason: collision with root package name */
    public Socket f21279d;

    /* renamed from: e, reason: collision with root package name */
    public v f21280e;

    /* renamed from: f, reason: collision with root package name */
    public F f21281f;

    /* renamed from: g, reason: collision with root package name */
    public n f21282g;

    /* renamed from: h, reason: collision with root package name */
    public C f21283h;

    /* renamed from: i, reason: collision with root package name */
    public B f21284i;
    public boolean j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f21285k;

    /* renamed from: l, reason: collision with root package name */
    public int f21286l;

    /* renamed from: m, reason: collision with root package name */
    public int f21287m;

    /* renamed from: n, reason: collision with root package name */
    public int f21288n;

    /* renamed from: o, reason: collision with root package name */
    public int f21289o;

    /* renamed from: p, reason: collision with root package name */
    public final ArrayList f21290p;

    /* renamed from: q, reason: collision with root package name */
    public long f21291q;

    public i(W connectionPool, O route) {
        kotlin.jvm.internal.h.e(connectionPool, "connectionPool");
        kotlin.jvm.internal.h.e(route, "route");
        this.f21277b = route;
        this.f21289o = 1;
        this.f21290p = new ArrayList();
        this.f21291q = Long.MAX_VALUE;
    }

    public static void d(E client, O failedRoute, IOException failure) {
        kotlin.jvm.internal.h.e(client, "client");
        kotlin.jvm.internal.h.e(failedRoute, "failedRoute");
        kotlin.jvm.internal.h.e(failure, "failure");
        if (failedRoute.f19047b.type() != Proxy.Type.DIRECT) {
            C1411a c1411a = failedRoute.f19046a;
            c1411a.f19062g.connectFailed(c1411a.f19063h.i(), failedRoute.f19047b.address(), failure);
        }
        G g9 = client.f18971B;
        synchronized (g9) {
            ((LinkedHashSet) g9.f17990b).add(failedRoute);
        }
    }

    @Override // q8.h
    public final synchronized void a(n connection, z settings) {
        int i9;
        kotlin.jvm.internal.h.e(connection, "connection");
        kotlin.jvm.internal.h.e(settings, "settings");
        if ((settings.f22572a & 16) != 0) {
            i9 = settings.f22573b[4];
        } else {
            i9 = Integer.MAX_VALUE;
        }
        this.f21289o = i9;
    }

    @Override // q8.h
    public final void b(q8.v vVar) {
        vVar.c(8, null);
    }

    public final void c(int i9, int i10, int i11, boolean z9, g call) {
        boolean z10;
        O o9;
        kotlin.jvm.internal.h.e(call, "call");
        if (this.f21281f == null) {
            List list = this.f21277b.f19046a.j;
            T t7 = new T(list);
            C1411a c1411a = this.f21277b.f19046a;
            if (c1411a.f19058c == null) {
                if (list.contains(C1426p.f19131f)) {
                    String str = this.f21277b.f19046a.f19063h.f19172d;
                    p pVar = p.f22822a;
                    if (!p.f22822a.h(str)) {
                        throw new j(new UnknownServiceException(A0.a.n("CLEARTEXT communication to ", str, " not permitted by network security policy")));
                    }
                } else {
                    throw new j(new UnknownServiceException("CLEARTEXT communication not enabled for client"));
                }
            } else if (c1411a.f19064i.contains(F.H2_PRIOR_KNOWLEDGE)) {
                throw new j(new UnknownServiceException("H2_PRIOR_KNOWLEDGE cannot be used with HTTPS"));
            }
            j jVar = null;
            do {
                try {
                    O o10 = this.f21277b;
                    if (o10.f19046a.f19058c != null && o10.f19047b.type() == Proxy.Type.HTTP) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (z10) {
                        f(i9, i10, i11, call);
                        if (this.f21278c == null) {
                            o9 = this.f21277b;
                            if (o9.f19046a.f19058c == null && o9.f19047b.type() == Proxy.Type.HTTP && this.f21278c == null) {
                                throw new j(new ProtocolException("Too many tunnel connections attempted: 21"));
                            }
                            this.f21291q = System.nanoTime();
                            return;
                        }
                    } else {
                        e(i9, i10, call);
                    }
                    g(t7, call);
                    InetSocketAddress inetSocketAddress = this.f21277b.f19048c;
                    kotlin.jvm.internal.h.e(inetSocketAddress, "inetSocketAddress");
                    o9 = this.f21277b;
                    if (o9.f19046a.f19058c == null) {
                    }
                    this.f21291q = System.nanoTime();
                    return;
                } catch (IOException e8) {
                    Socket socket = this.f21279d;
                    if (socket != null) {
                        k8.c.e(socket);
                    }
                    Socket socket2 = this.f21278c;
                    if (socket2 != null) {
                        k8.c.e(socket2);
                    }
                    this.f21279d = null;
                    this.f21278c = null;
                    this.f21283h = null;
                    this.f21284i = null;
                    this.f21280e = null;
                    this.f21281f = null;
                    this.f21282g = null;
                    this.f21289o = 1;
                    InetSocketAddress inetSocketAddress2 = this.f21277b.f19048c;
                    kotlin.jvm.internal.h.e(inetSocketAddress2, "inetSocketAddress");
                    if (jVar == null) {
                        jVar = new j(e8);
                    } else {
                        O4.h.a(jVar.f21292a, e8);
                        jVar.f21293b = e8;
                    }
                    if (z9) {
                        t7.f10965c = true;
                        if (t7.f10964b) {
                            if (!(e8 instanceof ProtocolException)) {
                                if (!(e8 instanceof InterruptedIOException)) {
                                    if (!(e8 instanceof SSLHandshakeException) || !(e8.getCause() instanceof CertificateException)) {
                                        if (e8 instanceof SSLPeerUnverifiedException) {
                                            throw jVar;
                                        }
                                    } else {
                                        throw jVar;
                                    }
                                } else {
                                    throw jVar;
                                }
                            } else {
                                throw jVar;
                            }
                        } else {
                            throw jVar;
                        }
                    } else {
                        throw jVar;
                    }
                }
            } while (e8 instanceof SSLException);
            throw jVar;
        }
        throw new IllegalStateException("already connected");
    }

    public final void e(int i9, int i10, g call) {
        int i11;
        Socket createSocket;
        O o9 = this.f21277b;
        Proxy proxy = o9.f19047b;
        C1411a c1411a = o9.f19046a;
        Proxy.Type type = proxy.type();
        if (type == null) {
            i11 = -1;
        } else {
            i11 = h.f21276a[type.ordinal()];
        }
        if (i11 != 1 && i11 != 2) {
            createSocket = new Socket(proxy);
        } else {
            createSocket = c1411a.f19057b.createSocket();
            kotlin.jvm.internal.h.b(createSocket);
        }
        this.f21278c = createSocket;
        InetSocketAddress inetSocketAddress = this.f21277b.f19048c;
        kotlin.jvm.internal.h.e(call, "call");
        kotlin.jvm.internal.h.e(inetSocketAddress, "inetSocketAddress");
        createSocket.setSoTimeout(i10);
        try {
            p pVar = p.f22822a;
            p.f22822a.e(createSocket, this.f21277b.f19048c, i9);
            try {
                this.f21283h = v4.e.b(v4.e.Q(createSocket));
                this.f21284i = v4.e.a(v4.e.O(createSocket));
            } catch (NullPointerException e8) {
                if (!kotlin.jvm.internal.h.a(e8.getMessage(), "throw with null exception")) {
                } else {
                    throw new IOException(e8);
                }
            }
        } catch (ConnectException e9) {
            ConnectException connectException = new ConnectException("Failed to connect to " + this.f21277b.f19048c);
            connectException.initCause(e9);
            throw connectException;
        }
    }

    public final void f(int i9, int i10, int i11, g gVar) {
        r rVar = new r(5);
        O o9 = this.f21277b;
        y url = o9.f19046a.f19063h;
        kotlin.jvm.internal.h.e(url, "url");
        rVar.f8647a = url;
        rVar.G("CONNECT", null);
        C1411a c1411a = o9.f19046a;
        rVar.D("Host", k8.c.w(c1411a.f19063h, true));
        rVar.D("Proxy-Connection", "Keep-Alive");
        rVar.D("User-Agent", "okhttp/4.12.0");
        i8.G o10 = rVar.o();
        C1183o c1183o = new C1183o(5);
        byte[] bArr = k8.c.f20141a;
        u0.h("Proxy-Authenticate");
        u0.i("OkHttp-Preemptive", "Proxy-Authenticate");
        c1183o.E("Proxy-Authenticate");
        c1183o.x("Proxy-Authenticate", "OkHttp-Preemptive");
        c1183o.z();
        c1411a.f19061f.getClass();
        e(i9, i10, gVar);
        String str = "CONNECT " + k8.c.w(o10.f19005a, true) + " HTTP/1.1";
        C c3 = this.f21283h;
        kotlin.jvm.internal.h.b(c3);
        B b9 = this.f21284i;
        kotlin.jvm.internal.h.b(b9);
        U6.a aVar = new U6.a(null, this, c3, b9);
        K c9 = c3.f24602a.c();
        long j = i10;
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        c9.g(j);
        b9.f24599a.c().g(i11);
        aVar.m(o10.f19007c, str);
        aVar.a();
        i8.K g9 = aVar.g(false);
        kotlin.jvm.internal.h.b(g9);
        g9.f19017a = o10;
        L a5 = g9.a();
        long k5 = k8.c.k(a5);
        if (k5 != -1) {
            p8.d k9 = aVar.k(k5);
            k8.c.u(k9, Integer.MAX_VALUE);
            k9.close();
        }
        int i12 = a5.f19032d;
        if (i12 != 200) {
            if (i12 == 407) {
                c1411a.f19061f.getClass();
                throw new IOException("Failed to authenticate with proxy");
            }
            throw new IOException(AbstractC0953k1.j(i12, "Unexpected response code for CONNECT: "));
        }
        if (c3.f24603b.N() && b9.f24600b.N()) {
        } else {
            throw new IOException("TLS tunnel buffered too many bytes!");
        }
    }

    public final void g(T t7, g call) {
        int i9 = 1;
        C1411a c1411a = this.f21277b.f19046a;
        SSLSocketFactory sSLSocketFactory = c1411a.f19058c;
        F f9 = F.HTTP_1_1;
        if (sSLSocketFactory == null) {
            List list = c1411a.f19064i;
            F f10 = F.H2_PRIOR_KNOWLEDGE;
            if (list.contains(f10)) {
                this.f21279d = this.f21278c;
                this.f21281f = f10;
                m();
                return;
            } else {
                this.f21279d = this.f21278c;
                this.f21281f = f9;
                return;
            }
        }
        kotlin.jvm.internal.h.e(call, "call");
        C1411a c1411a2 = this.f21277b.f19046a;
        SSLSocketFactory sSLSocketFactory2 = c1411a2.f19058c;
        SSLSocket sSLSocket = null;
        String str = null;
        try {
            kotlin.jvm.internal.h.b(sSLSocketFactory2);
            Socket socket = this.f21278c;
            y yVar = c1411a2.f19063h;
            Socket createSocket = sSLSocketFactory2.createSocket(socket, yVar.f19172d, yVar.f19173e, true);
            kotlin.jvm.internal.h.c(createSocket, "null cannot be cast to non-null type javax.net.ssl.SSLSocket");
            SSLSocket sSLSocket2 = (SSLSocket) createSocket;
            try {
                C1426p a5 = t7.a(sSLSocket2);
                if (a5.f19133b) {
                    p pVar = p.f22822a;
                    p.f22822a.d(sSLSocket2, c1411a2.f19063h.f19172d, c1411a2.f19064i);
                }
                sSLSocket2.startHandshake();
                SSLSession sslSocketSession = sSLSocket2.getSession();
                kotlin.jvm.internal.h.d(sslSocketSession, "sslSocketSession");
                v o9 = v4.e.o(sslSocketSession);
                HostnameVerifier hostnameVerifier = c1411a2.f19059d;
                kotlin.jvm.internal.h.b(hostnameVerifier);
                if (!hostnameVerifier.verify(c1411a2.f19063h.f19172d, sslSocketSession)) {
                    List a9 = o9.a();
                    if (!a9.isEmpty()) {
                        Object obj = a9.get(0);
                        kotlin.jvm.internal.h.c(obj, "null cannot be cast to non-null type java.security.cert.X509Certificate");
                        X509Certificate x509Certificate = (X509Certificate) obj;
                        StringBuilder sb = new StringBuilder("\n              |Hostname ");
                        sb.append(c1411a2.f19063h.f19172d);
                        sb.append(" not verified:\n              |    certificate: ");
                        C1422l c1422l = C1422l.f19104c;
                        C2190j c2190j = C2190j.f24645d;
                        byte[] encoded = x509Certificate.getPublicKey().getEncoded();
                        kotlin.jvm.internal.h.d(encoded, "publicKey.encoded");
                        sb.append("sha256/".concat(AbstractC2181a.a(e0.c.I(encoded).c("SHA-256").f24646a, AbstractC2181a.f24626a)));
                        sb.append("\n              |    DN: ");
                        sb.append(x509Certificate.getSubjectDN().getName());
                        sb.append("\n              |    subjectAltNames: ");
                        sb.append(k.y0(w8.c.a(x509Certificate, 7), w8.c.a(x509Certificate, 2)));
                        sb.append("\n              ");
                        throw new SSLPeerUnverifiedException(W7.e.D(sb.toString()));
                    }
                    throw new SSLPeerUnverifiedException("Hostname " + c1411a2.f19063h.f19172d + " not verified (no certificates)");
                }
                C1422l c1422l2 = c1411a2.f19060e;
                kotlin.jvm.internal.h.b(c1422l2);
                this.f21280e = new v(o9.f19155a, o9.f19156b, o9.f19157c, new C1421k(c1422l2, o9, c1411a2, i9));
                c1422l2.a(c1411a2.f19063h.f19172d, new e2.e(15, this));
                if (a5.f19133b) {
                    p pVar2 = p.f22822a;
                    str = p.f22822a.f(sSLSocket2);
                }
                this.f21279d = sSLSocket2;
                this.f21283h = v4.e.b(v4.e.Q(sSLSocket2));
                this.f21284i = v4.e.a(v4.e.O(sSLSocket2));
                if (str != null) {
                    f9 = O4.h.s(str);
                }
                this.f21281f = f9;
                p pVar3 = p.f22822a;
                p.f22822a.a(sSLSocket2);
                if (this.f21281f == F.HTTP_2) {
                    m();
                }
            } catch (Throwable th) {
                th = th;
                sSLSocket = sSLSocket2;
                if (sSLSocket != null) {
                    p pVar4 = p.f22822a;
                    p.f22822a.a(sSLSocket);
                }
                if (sSLSocket != null) {
                    k8.c.e(sSLSocket);
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public final synchronized void h() {
        this.f21287m++;
    }

    /* JADX WARN: Code restructure failed: missing block: B:41:0x00ab, code lost:
    
        if (w8.c.b(r1, (java.security.cert.X509Certificate) r10) != false) goto L50;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean i(i8.C1411a r9, java.util.List r10) {
        /*
            r8 = this;
            r0 = 0
            byte[] r1 = k8.c.f20141a
            java.util.ArrayList r1 = r8.f21290p
            int r1 = r1.size()
            int r2 = r8.f21289o
            if (r1 >= r2) goto Lce
            boolean r1 = r8.j
            if (r1 == 0) goto L13
            goto Lce
        L13:
            i8.O r1 = r8.f21277b
            i8.a r2 = r1.f19046a
            boolean r2 = r2.a(r9)
            if (r2 != 0) goto L1f
            goto Lce
        L1f:
            i8.y r2 = r9.f19063h
            java.lang.String r3 = r2.f19172d
            i8.a r4 = r1.f19046a
            i8.y r5 = r4.f19063h
            java.lang.String r5 = r5.f19172d
            boolean r3 = kotlin.jvm.internal.h.a(r3, r5)
            r5 = 1
            if (r3 == 0) goto L31
            return r5
        L31:
            q8.n r3 = r8.f21282g
            if (r3 != 0) goto L37
            goto Lce
        L37:
            if (r10 == 0) goto Lce
            boolean r3 = r10.isEmpty()
            if (r3 == 0) goto L41
            goto Lce
        L41:
            java.util.Iterator r10 = r10.iterator()
        L45:
            boolean r3 = r10.hasNext()
            if (r3 == 0) goto Lce
            java.lang.Object r3 = r10.next()
            i8.O r3 = (i8.O) r3
            java.net.Proxy r6 = r3.f19047b
            java.net.Proxy$Type r6 = r6.type()
            java.net.Proxy$Type r7 = java.net.Proxy.Type.DIRECT
            if (r6 != r7) goto L45
            java.net.Proxy r6 = r1.f19047b
            java.net.Proxy$Type r6 = r6.type()
            if (r6 != r7) goto L45
            java.net.InetSocketAddress r3 = r3.f19048c
            java.net.InetSocketAddress r6 = r1.f19048c
            boolean r3 = kotlin.jvm.internal.h.a(r6, r3)
            if (r3 == 0) goto L45
            w8.c r10 = w8.c.f24318a
            javax.net.ssl.HostnameVerifier r1 = r9.f19059d
            if (r1 == r10) goto L74
            goto Lce
        L74:
            byte[] r10 = k8.c.f20141a
            i8.y r10 = r4.f19063h
            int r1 = r10.f19173e
            int r3 = r2.f19173e
            if (r3 == r1) goto L7f
            goto Lce
        L7f:
            java.lang.String r10 = r10.f19172d
            java.lang.String r1 = r2.f19172d
            boolean r10 = kotlin.jvm.internal.h.a(r1, r10)
            if (r10 == 0) goto L8a
            goto Lad
        L8a:
            boolean r10 = r8.f21285k
            if (r10 != 0) goto Lce
            i8.v r10 = r8.f21280e
            if (r10 == 0) goto Lce
            java.util.List r10 = r10.a()
            boolean r2 = r10.isEmpty()
            if (r2 != 0) goto Lce
            java.lang.Object r10 = r10.get(r0)
            java.lang.String r2 = "null cannot be cast to non-null type java.security.cert.X509Certificate"
            kotlin.jvm.internal.h.c(r10, r2)
            java.security.cert.X509Certificate r10 = (java.security.cert.X509Certificate) r10
            boolean r10 = w8.c.b(r1, r10)
            if (r10 == 0) goto Lce
        Lad:
            i8.l r9 = r9.f19060e     // Catch: javax.net.ssl.SSLPeerUnverifiedException -> Lce
            kotlin.jvm.internal.h.b(r9)     // Catch: javax.net.ssl.SSLPeerUnverifiedException -> Lce
            i8.v r10 = r8.f21280e     // Catch: javax.net.ssl.SSLPeerUnverifiedException -> Lce
            kotlin.jvm.internal.h.b(r10)     // Catch: javax.net.ssl.SSLPeerUnverifiedException -> Lce
            java.util.List r10 = r10.a()     // Catch: javax.net.ssl.SSLPeerUnverifiedException -> Lce
            java.lang.String r2 = "hostname"
            kotlin.jvm.internal.h.e(r1, r2)     // Catch: javax.net.ssl.SSLPeerUnverifiedException -> Lce
            java.lang.String r2 = "peerCertificates"
            kotlin.jvm.internal.h.e(r10, r2)     // Catch: javax.net.ssl.SSLPeerUnverifiedException -> Lce
            i8.k r2 = new i8.k     // Catch: javax.net.ssl.SSLPeerUnverifiedException -> Lce
            r2.<init>(r9, r10, r1, r0)     // Catch: javax.net.ssl.SSLPeerUnverifiedException -> Lce
            r9.a(r1, r2)     // Catch: javax.net.ssl.SSLPeerUnverifiedException -> Lce
            return r5
        Lce:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: n8.i.i(i8.a, java.util.List):boolean");
    }

    public final boolean j(boolean z9) {
        long j;
        byte[] bArr = k8.c.f20141a;
        long nanoTime = System.nanoTime();
        Socket socket = this.f21278c;
        kotlin.jvm.internal.h.b(socket);
        Socket socket2 = this.f21279d;
        kotlin.jvm.internal.h.b(socket2);
        kotlin.jvm.internal.h.b(this.f21283h);
        if (socket.isClosed() || socket2.isClosed() || socket2.isInputShutdown() || socket2.isOutputShutdown()) {
            return false;
        }
        n nVar = this.f21282g;
        if (nVar != null) {
            return nVar.g(nanoTime);
        }
        synchronized (this) {
            j = nanoTime - this.f21291q;
        }
        if (j < 10000000000L || !z9) {
            return true;
        }
        try {
            int soTimeout = socket2.getSoTimeout();
            try {
                socket2.setSoTimeout(1);
                return !r4.a();
            } finally {
                socket2.setSoTimeout(soTimeout);
            }
        } catch (SocketTimeoutException unused) {
            return true;
        } catch (IOException unused2) {
            return false;
        }
    }

    public final o8.b k(E client, o8.d dVar) {
        kotlin.jvm.internal.h.e(client, "client");
        Socket socket = this.f21279d;
        kotlin.jvm.internal.h.b(socket);
        C c3 = this.f21283h;
        kotlin.jvm.internal.h.b(c3);
        B b9 = this.f21284i;
        kotlin.jvm.internal.h.b(b9);
        n nVar = this.f21282g;
        if (nVar != null) {
            return new o(client, this, dVar, nVar);
        }
        int i9 = dVar.f21758g;
        socket.setSoTimeout(i9);
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        c3.f24602a.c().g(i9);
        b9.f24599a.c().g(dVar.f21759h);
        return new U6.a(client, this, c3, b9);
    }

    public final synchronized void l() {
        this.j = true;
    }

    /* JADX WARN: Type inference failed for: r4v0, types: [b6.o, java.lang.Object] */
    public final void m() {
        int i9;
        Socket socket = this.f21279d;
        kotlin.jvm.internal.h.b(socket);
        C c3 = this.f21283h;
        kotlin.jvm.internal.h.b(c3);
        B b9 = this.f21284i;
        kotlin.jvm.internal.h.b(b9);
        socket.setSoTimeout(0);
        m8.c taskRunner = m8.c.f20928h;
        kotlin.jvm.internal.h.e(taskRunner, "taskRunner");
        ?? obj = new Object();
        obj.f11383b = taskRunner;
        obj.f11387f = q8.h.f22477a;
        String peerName = this.f21277b.f19046a.f19063h.f19172d;
        kotlin.jvm.internal.h.e(peerName, "peerName");
        obj.f11384c = socket;
        String str = k8.c.f20147g + ' ' + peerName;
        kotlin.jvm.internal.h.e(str, "<set-?>");
        obj.f11382a = str;
        obj.f11385d = c3;
        obj.f11386e = b9;
        obj.f11387f = this;
        n nVar = new n(obj);
        this.f21282g = nVar;
        z zVar = n.f22495z;
        if ((zVar.f22572a & 16) != 0) {
            i9 = zVar.f22573b[4];
        } else {
            i9 = Integer.MAX_VALUE;
        }
        this.f21289o = i9;
        w wVar = nVar.f22517w;
        synchronized (wVar) {
            try {
                if (!wVar.f22566d) {
                    Logger logger = w.f22562f;
                    if (logger.isLoggable(Level.FINE)) {
                        logger.fine(k8.c.i(">> CONNECTION " + q8.f.f22473a.e(), new Object[0]));
                    }
                    wVar.f22563a.A(q8.f.f22473a);
                    wVar.f22563a.flush();
                } else {
                    throw new IOException("closed");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        nVar.f22517w.N(nVar.f22510p);
        if (nVar.f22510p.a() != 65535) {
            nVar.f22517w.O(r1 - 65535, 0);
        }
        taskRunner.e().c(new l8.f(nVar.f22498c, nVar.f22518x, 1), 0L);
    }

    public final String toString() {
        Object obj;
        StringBuilder sb = new StringBuilder("Connection{");
        O o9 = this.f21277b;
        sb.append(o9.f19046a.f19063h.f19172d);
        sb.append(':');
        sb.append(o9.f19046a.f19063h.f19173e);
        sb.append(", proxy=");
        sb.append(o9.f19047b);
        sb.append(" hostAddress=");
        sb.append(o9.f19048c);
        sb.append(" cipherSuite=");
        v vVar = this.f21280e;
        if (vVar == null || (obj = vVar.f19156b) == null) {
            obj = "none";
        }
        sb.append(obj);
        sb.append(" protocol=");
        sb.append(this.f21281f);
        sb.append('}');
        return sb.toString();
    }
}
