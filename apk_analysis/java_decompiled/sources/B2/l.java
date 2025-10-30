package B2;

import B7.t;
import U3.C0394a;
import Y2.r;
import a.AbstractC0485a;
import android.content.SharedPreferences;
import b5.W;
import com.anilab.android.ui.player.PlayerActivity;
import com.anilab.data.model.response.LoginResponse;
import f5.C1183o;
import g6.o;
import i8.A;
import i8.C1411a;
import i8.C1422l;
import i8.E;
import i8.G;
import i8.J;
import i8.K;
import i8.L;
import i8.M;
import i8.N;
import i8.O;
import i8.w;
import i8.x;
import i8.y;
import i8.z;
import java.io.IOException;
import java.net.ProtocolException;
import java.net.Proxy;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;
import kotlin.jvm.internal.p;
import q8.C1918a;
import y2.C2203a;

/* loaded from: classes.dex */
public final class l implements z {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f639a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f640b;

    public /* synthetic */ l(int i9, Object obj) {
        this.f639a = i9;
        this.f640b = obj;
    }

    public static int d(L l9, int i9) {
        String d9 = L.d(l9, "Retry-After");
        if (d9 == null) {
            return i9;
        }
        Pattern compile = Pattern.compile("\\d+");
        kotlin.jvm.internal.h.d(compile, "compile(...)");
        if (compile.matcher(d9).matches()) {
            Integer valueOf = Integer.valueOf(d9);
            kotlin.jvm.internal.h.d(valueOf, "valueOf(header)");
            return valueOf.intValue();
        }
        return Integer.MAX_VALUE;
    }

    @Override // i8.z
    public final L a(o8.d dVar) {
        Object obj;
        Object h7;
        N n7;
        boolean z9;
        boolean z10;
        SSLSocketFactory sSLSocketFactory;
        HostnameVerifier hostnameVerifier;
        C1422l c1422l;
        switch (this.f639a) {
            case 0:
                String o02 = o.f17761a.o0();
                kotlin.jvm.internal.d a5 = p.a(LoginResponse.class);
                boolean equals = a5.equals(p.a(Float.TYPE));
                C2203a c2203a = (C2203a) this.f640b;
                SharedPreferences sharedPreferences = c2203a.f24771a;
                if (equals) {
                    obj = (LoginResponse) Float.valueOf(sharedPreferences.getFloat(o02, 0.0f));
                } else if (a5.equals(p.a(Integer.TYPE))) {
                    obj = (LoginResponse) Integer.valueOf(sharedPreferences.getInt(o02, 0));
                } else if (a5.equals(p.a(Long.TYPE))) {
                    obj = (LoginResponse) Long.valueOf(sharedPreferences.getLong(o02, 0L));
                } else if (a5.equals(p.a(String.class))) {
                    Object string = sharedPreferences.getString(o02, "");
                    if (string != null) {
                        obj = (LoginResponse) string;
                    } else {
                        throw new NullPointerException("null cannot be cast to non-null type com.anilab.data.model.response.LoginResponse");
                    }
                } else if (a5.equals(p.a(Boolean.TYPE))) {
                    obj = (LoginResponse) Boolean.valueOf(sharedPreferences.getBoolean(o02, false));
                } else {
                    String string2 = sharedPreferences.getString(o02, "");
                    if (string2 != null && string2.length() != 0) {
                        try {
                            h7 = c2203a.f24772b.a(LoginResponse.class).a(string2);
                        } catch (Throwable th) {
                            h7 = AbstractC0485a.h(th);
                        }
                        if (!(h7 instanceof A7.i)) {
                            obj = h7;
                        }
                    }
                    obj = null;
                }
                LoginResponse loginResponse = (LoginResponse) obj;
                G g9 = dVar.f21756e;
                if (loginResponse == null) {
                    return dVar.b(g9);
                }
                boolean a9 = kotlin.jvm.internal.h.a(g9.f19007c.b("IncludeAuthorization"), "true");
                r b9 = g9.b();
                b9.K("IncludeAuthorization");
                if (a9) {
                    b9.n("Authorization", o.f17761a.O() + " " + loginResponse.f14201b.f14358a.f14362a);
                    return dVar.b(b9.o());
                }
                return dVar.b(g9);
            case 1:
                r b10 = dVar.f21756e.b();
                try {
                    PlayerActivity playerActivity = (PlayerActivity) this.f640b;
                    int i9 = PlayerActivity.f13798w0;
                    for (Map.Entry entry : playerActivity.d0().f17639p.f3450g.f3458c.entrySet()) {
                        b10.K((String) entry.getKey());
                        b10.n((String) entry.getKey(), (String) entry.getValue());
                    }
                } catch (Exception unused) {
                }
                return dVar.b(b10.o());
            case 2:
                boolean z11 = true;
                G g10 = dVar.f21756e;
                r b11 = g10.b();
                long j = -1;
                J j4 = g10.f19008d;
                if (j4 != null) {
                    A b12 = j4.b();
                    if (b12 != null) {
                        b11.D("Content-Type", b12.f18927a);
                    }
                    long a10 = j4.a();
                    if (a10 != -1) {
                        b11.D("Content-Length", String.valueOf(a10));
                        b11.K("Transfer-Encoding");
                    } else {
                        b11.D("Transfer-Encoding", "chunked");
                        b11.K("Content-Length");
                    }
                }
                w wVar = g10.f19007c;
                String b13 = wVar.b("Host");
                y url = g10.f19005a;
                if (b13 == null) {
                    b11.D("Host", k8.c.w(url, false));
                }
                if (wVar.b("Connection") == null) {
                    b11.D("Connection", "Keep-Alive");
                }
                if (wVar.b("Accept-Encoding") == null && wVar.b("Range") == null) {
                    b11.D("Accept-Encoding", "gzip");
                } else {
                    z11 = false;
                }
                i8.r rVar = (i8.r) this.f640b;
                rVar.getClass();
                kotlin.jvm.internal.h.e(url, "url");
                if (wVar.b("User-Agent") == null) {
                    b11.D("User-Agent", "okhttp/4.12.0");
                }
                L b14 = dVar.b(b11.o());
                w wVar2 = b14.f19034f;
                o8.c.b(rVar, url, wVar2);
                K s9 = b14.s();
                s9.f19017a = g10;
                if (z11 && "gzip".equalsIgnoreCase(L.d(b14, "Content-Encoding")) && o8.c.a(b14) && (n7 = b14.f19035g) != null) {
                    x8.r rVar2 = new x8.r(n7.g());
                    C1183o d9 = wVar2.d();
                    d9.E("Content-Encoding");
                    d9.E("Content-Length");
                    s9.c(d9.z());
                    s9.f19023g = new M(L.d(b14, "Content-Type"), j, v4.e.b(rVar2), 1);
                }
                return s9.a();
            default:
                G g11 = dVar.f21756e;
                n8.g gVar = dVar.f21752a;
                List list = t.f1135a;
                L l9 = null;
                int i10 = 0;
                G request = g11;
                while (true) {
                    boolean z12 = true;
                    while (true) {
                        gVar.getClass();
                        kotlin.jvm.internal.h.e(request, "request");
                        if (gVar.f21270i == null) {
                            synchronized (gVar) {
                                try {
                                    if (!gVar.f21271k) {
                                        if (gVar.j) {
                                            throw new IllegalStateException("Check failed.");
                                        }
                                    } else {
                                        throw new IllegalStateException("cannot make a new request because the previous response is still open: please call response.close()");
                                    }
                                } catch (Throwable th2) {
                                    throw th2;
                                }
                            }
                            if (z12) {
                                W w7 = gVar.f21264c;
                                y yVar = request.f19005a;
                                boolean z13 = yVar.j;
                                E e8 = gVar.f21262a;
                                if (z13) {
                                    SSLSocketFactory sSLSocketFactory2 = e8.f18986p;
                                    if (sSLSocketFactory2 != null) {
                                        HostnameVerifier hostnameVerifier2 = e8.f18990t;
                                        z9 = true;
                                        c1422l = e8.f18991u;
                                        sSLSocketFactory = sSLSocketFactory2;
                                        hostnameVerifier = hostnameVerifier2;
                                    } else {
                                        throw new IllegalStateException("CLEARTEXT-only client");
                                    }
                                } else {
                                    z9 = true;
                                    sSLSocketFactory = null;
                                    hostnameVerifier = null;
                                    c1422l = null;
                                }
                                gVar.f21268g = new C0394a(w7, new C1411a(yVar.f19172d, yVar.f19173e, e8.f18982l, e8.f18985o, sSLSocketFactory, hostnameVerifier, c1422l, e8.f18984n, e8.f18989s, e8.f18988r, e8.f18983m), gVar);
                            } else {
                                z9 = true;
                            }
                            try {
                                if (!gVar.f21273m) {
                                    try {
                                        L b15 = dVar.b(request);
                                        if (l9 != null) {
                                            try {
                                                K s10 = b15.s();
                                                K s11 = l9.s();
                                                s11.f19023g = null;
                                                L a11 = s11.a();
                                                if (a11.f19035g == null) {
                                                    s10.j = a11;
                                                    b15 = s10.a();
                                                } else {
                                                    throw new IllegalArgumentException("priorResponse.body != null");
                                                }
                                            } catch (Throwable th3) {
                                                th = th3;
                                                z10 = z9;
                                                gVar.i(z10);
                                                throw th;
                                            }
                                        }
                                        l9 = b15;
                                        request = b(l9, gVar.f21270i);
                                        if (request == null) {
                                            gVar.i(false);
                                            return l9;
                                        }
                                        N n9 = l9.f19035g;
                                        if (n9 != null) {
                                            k8.c.d(n9);
                                        }
                                        i10++;
                                        if (i10 <= 20) {
                                            gVar.i(z9);
                                        } else {
                                            throw new ProtocolException("Too many follow-up requests: " + i10);
                                        }
                                    } catch (IOException e9) {
                                        if (c(e9, gVar, request, !(e9 instanceof C1918a))) {
                                            list = B7.k.z0(list, e9);
                                            gVar.i(true);
                                        } else {
                                            Iterator it = list.iterator();
                                            while (it.hasNext()) {
                                                O4.h.a(e9, (Exception) it.next());
                                            }
                                            throw e9;
                                        }
                                    } catch (n8.j e10) {
                                        if (c(e10.f21293b, gVar, request, false)) {
                                            list = B7.k.z0(list, e10.f21292a);
                                            gVar.i(true);
                                        } else {
                                            IOException iOException = e10.f21292a;
                                            kotlin.jvm.internal.h.e(iOException, "<this>");
                                            Iterator it2 = list.iterator();
                                            while (it2.hasNext()) {
                                                O4.h.a(iOException, (Exception) it2.next());
                                            }
                                            throw iOException;
                                        }
                                    }
                                } else {
                                    throw new IOException("Canceled");
                                }
                            } catch (Throwable th4) {
                                th = th4;
                                z10 = true;
                            }
                        } else {
                            throw new IllegalStateException("Check failed.");
                        }
                        z12 = false;
                    }
                }
        }
    }

    public G b(L l9, J5.k kVar) {
        O o9;
        String d9;
        y yVar;
        L l10;
        n8.i iVar;
        J j = null;
        if (kVar != null && (iVar = (n8.i) kVar.f4227e) != null) {
            o9 = iVar.f21277b;
        } else {
            o9 = null;
        }
        int i9 = l9.f19032d;
        String str = l9.f19029a.f19006b;
        boolean z9 = false;
        if (i9 != 307 && i9 != 308) {
            if (i9 != 401) {
                if (i9 != 421) {
                    if (i9 != 503) {
                        if (i9 != 407) {
                            if (i9 != 408) {
                                switch (i9) {
                                }
                            } else if (((E) this.f640b).f18977f && (((l10 = l9.j) == null || l10.f19032d != 408) && d(l9, 0) <= 0)) {
                                return l9.f19029a;
                            }
                        } else {
                            kotlin.jvm.internal.h.b(o9);
                            if (o9.f19047b.type() == Proxy.Type.HTTP) {
                                ((E) this.f640b).f18984n.getClass();
                                return null;
                            }
                            throw new ProtocolException("Received HTTP_PROXY_AUTH (407) code while not using proxy");
                        }
                    } else {
                        L l11 = l9.j;
                        if ((l11 == null || l11.f19032d != 503) && d(l9, Integer.MAX_VALUE) == 0) {
                            return l9.f19029a;
                        }
                    }
                } else if (kVar != null && !kotlin.jvm.internal.h.a(((C1411a) ((C0394a) kVar.f4225c).f7340e).f19063h.f19172d, ((n8.i) kVar.f4227e).f21277b.f19046a.f19063h.f19172d)) {
                    n8.i iVar2 = (n8.i) kVar.f4227e;
                    synchronized (iVar2) {
                        iVar2.f21285k = true;
                    }
                    return l9.f19029a;
                }
                return null;
            }
            return ((E) this.f640b).f18978g.a(o9, l9);
        }
        E e8 = (E) this.f640b;
        if (e8.f18979h && (d9 = L.d(l9, "Location")) != null) {
            G g9 = l9.f19029a;
            y yVar2 = g9.f19005a;
            yVar2.getClass();
            x g10 = yVar2.g(d9);
            if (g10 != null) {
                yVar = g10.b();
            } else {
                yVar = null;
            }
            if (yVar != null) {
                if (kotlin.jvm.internal.h.a(yVar.f19169a, g9.f19005a.f19169a) || e8.f18980i) {
                    r b9 = g9.b();
                    if (Z0.a.u(str)) {
                        boolean equals = str.equals("PROPFIND");
                        int i10 = l9.f19032d;
                        if (equals || i10 == 308 || i10 == 307) {
                            z9 = true;
                        }
                        if (!str.equals("PROPFIND") && i10 != 308 && i10 != 307) {
                            b9.G("GET", null);
                        } else {
                            if (z9) {
                                j = g9.f19008d;
                            }
                            b9.G(str, j);
                        }
                        if (!z9) {
                            b9.K("Transfer-Encoding");
                            b9.K("Content-Length");
                            b9.K("Content-Type");
                        }
                    }
                    if (!k8.c.a(g9.f19005a, yVar)) {
                        b9.K("Authorization");
                    }
                    b9.f8647a = yVar;
                    return b9.o();
                }
            }
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x001f, code lost:
    
        if (r7 == false) goto L26;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean c(java.io.IOException r4, n8.g r5, i8.G r6, boolean r7) {
        /*
            r3 = this;
            java.lang.Object r6 = r3.f640b
            i8.E r6 = (i8.E) r6
            boolean r6 = r6.f18977f
            r0 = 0
            if (r6 != 0) goto Lb
            goto La7
        Lb:
            if (r7 == 0) goto L12
            boolean r6 = r4 instanceof java.io.FileNotFoundException
            if (r6 == 0) goto L12
            return r0
        L12:
            boolean r6 = r4 instanceof java.net.ProtocolException
            if (r6 == 0) goto L17
            return r0
        L17:
            boolean r6 = r4 instanceof java.io.InterruptedIOException
            if (r6 == 0) goto L22
            boolean r4 = r4 instanceof java.net.SocketTimeoutException
            if (r4 == 0) goto La7
            if (r7 != 0) goto La7
            goto L35
        L22:
            boolean r6 = r4 instanceof javax.net.ssl.SSLHandshakeException
            if (r6 == 0) goto L30
            java.lang.Throwable r6 = r4.getCause()
            boolean r6 = r6 instanceof java.security.cert.CertificateException
            if (r6 == 0) goto L30
            goto La7
        L30:
            boolean r4 = r4 instanceof javax.net.ssl.SSLPeerUnverifiedException
            if (r4 == 0) goto L35
            return r0
        L35:
            U3.a r4 = r5.f21268g
            kotlin.jvm.internal.h.b(r4)
            int r5 = r4.f7336a
            r6 = 1
            if (r5 != 0) goto L49
            int r7 = r4.f7337b
            if (r7 != 0) goto L49
            int r7 = r4.f7338c
            if (r7 != 0) goto L49
            r4 = r0
            goto La5
        L49:
            java.lang.Object r7 = r4.f7344i
            i8.O r7 = (i8.O) r7
            if (r7 == 0) goto L50
            goto La0
        L50:
            r7 = 0
            if (r5 > r6) goto L87
            int r5 = r4.f7337b
            if (r5 > r6) goto L87
            int r5 = r4.f7338c
            if (r5 <= 0) goto L5c
            goto L87
        L5c:
            java.lang.Object r5 = r4.f7341f
            n8.g r5 = (n8.g) r5
            n8.i r5 = r5.f21269h
            if (r5 != 0) goto L65
            goto L87
        L65:
            monitor-enter(r5)
            int r1 = r5.f21286l     // Catch: java.lang.Throwable -> L84
            if (r1 == 0) goto L6c
            monitor-exit(r5)
            goto L87
        L6c:
            i8.O r1 = r5.f21277b     // Catch: java.lang.Throwable -> L84
            i8.a r1 = r1.f19046a     // Catch: java.lang.Throwable -> L84
            i8.y r1 = r1.f19063h     // Catch: java.lang.Throwable -> L84
            java.lang.Object r2 = r4.f7340e     // Catch: java.lang.Throwable -> L84
            i8.a r2 = (i8.C1411a) r2     // Catch: java.lang.Throwable -> L84
            i8.y r2 = r2.f19063h     // Catch: java.lang.Throwable -> L84
            boolean r1 = k8.c.a(r1, r2)     // Catch: java.lang.Throwable -> L84
            if (r1 != 0) goto L80
            monitor-exit(r5)
            goto L87
        L80:
            i8.O r7 = r5.f21277b     // Catch: java.lang.Throwable -> L84
            monitor-exit(r5)
            goto L87
        L84:
            r4 = move-exception
            monitor-exit(r5)
            throw r4
        L87:
            if (r7 == 0) goto L8d
            r4.f7344i = r7
        L8b:
            r4 = r6
            goto La5
        L8d:
            java.lang.Object r5 = r4.f7342g
            A6.p r5 = (A6.p) r5
            if (r5 == 0) goto L9a
            boolean r5 = r5.b()
            if (r5 != r6) goto L9a
            goto La0
        L9a:
            java.lang.Object r4 = r4.f7343h
            U6.a r4 = (U6.a) r4
            if (r4 != 0) goto La1
        La0:
            goto L8b
        La1:
            boolean r4 = r4.j()
        La5:
            if (r4 != 0) goto La8
        La7:
            return r0
        La8:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: B2.l.c(java.io.IOException, n8.g, i8.G, boolean):boolean");
    }

    public l(i8.r cookieJar) {
        this.f639a = 2;
        kotlin.jvm.internal.h.e(cookieJar, "cookieJar");
        this.f640b = cookieJar;
    }

    public l(E client) {
        this.f639a = 3;
        kotlin.jvm.internal.h.e(client, "client");
        this.f640b = client;
    }
}
