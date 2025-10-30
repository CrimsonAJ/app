package N3;

import android.net.Uri;
import c7.C0790j;
import java.io.InterruptedIOException;
import java.util.Collections;
import java.util.Map;
import k4.C1516p;
import k4.InterfaceC1513m;
import l4.AbstractC1566a;
import q3.C1902g;
import q3.InterfaceC1905j;
import x3.C2172d;

/* loaded from: classes.dex */
public final class P implements k4.J {

    /* renamed from: a, reason: collision with root package name */
    public final Uri f4951a;

    /* renamed from: b, reason: collision with root package name */
    public final k4.V f4952b;

    /* renamed from: c, reason: collision with root package name */
    public final android.support.v4.media.session.y f4953c;

    /* renamed from: d, reason: collision with root package name */
    public final T f4954d;

    /* renamed from: e, reason: collision with root package name */
    public final H1.k f4955e;

    /* renamed from: g, reason: collision with root package name */
    public volatile boolean f4957g;

    /* renamed from: i, reason: collision with root package name */
    public long f4959i;
    public C1516p j;

    /* renamed from: k, reason: collision with root package name */
    public c0 f4960k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f4961l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ T f4962m;

    /* renamed from: f, reason: collision with root package name */
    public final C0790j f4956f = new Object();

    /* renamed from: h, reason: collision with root package name */
    public boolean f4958h = true;

    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, c7.j] */
    public P(T t7, Uri uri, InterfaceC1513m interfaceC1513m, android.support.v4.media.session.y yVar, T t9, H1.k kVar) {
        this.f4962m = t7;
        this.f4951a = uri;
        this.f4952b = new k4.V(interfaceC1513m);
        this.f4953c = yVar;
        this.f4954d = t9;
        this.f4955e = kVar;
        C0266q.f5180a.getAndIncrement();
        this.j = b(0L);
    }

    @Override // k4.J
    public final void a() {
        long j;
        InterfaceC1513m interfaceC1513m;
        long j4;
        long j9;
        int i9;
        int i10 = 0;
        while (i10 == 0 && !this.f4957g) {
            long j10 = -1;
            try {
                long j11 = this.f4956f.f11723a;
                C1516p b9 = b(j11);
                this.j = b9;
                long g9 = this.f4952b.g(b9);
                if (g9 != -1) {
                    g9 += j11;
                    T t7 = this.f4962m;
                    t7.f4992o.post(new O(t7, 2));
                }
                long j12 = g9;
                this.f4962m.f4994q = H3.c.a(this.f4952b.f20032a.l());
                k4.V v8 = this.f4952b;
                H3.c cVar = this.f4962m.f4994q;
                if (cVar != null && (i9 = cVar.f3104f) != -1) {
                    interfaceC1513m = new C0265p(v8, i9, this);
                    T t9 = this.f4962m;
                    t9.getClass();
                    c0 C8 = t9.C(new S(0, true));
                    this.f4960k = C8;
                    C8.e(T.f4968k0);
                } else {
                    interfaceC1513m = v8;
                }
                this.f4953c.P(interfaceC1513m, this.f4951a, this.f4952b.f20032a.l(), j11, j12, this.f4954d);
                if (this.f4962m.f4994q != null) {
                    InterfaceC1905j interfaceC1905j = (InterfaceC1905j) this.f4953c.f9332c;
                    if (interfaceC1905j instanceof C2172d) {
                        ((C2172d) interfaceC1905j).f24585q = true;
                    }
                }
                if (this.f4958h) {
                    android.support.v4.media.session.y yVar = this.f4953c;
                    long j13 = this.f4959i;
                    InterfaceC1905j interfaceC1905j2 = (InterfaceC1905j) yVar.f9332c;
                    interfaceC1905j2.getClass();
                    interfaceC1905j2.b(j11, j13);
                    this.f4958h = false;
                }
                while (i10 == 0 && !this.f4957g) {
                    try {
                        H1.k kVar = this.f4955e;
                        synchronized (kVar) {
                            while (!kVar.f2964a) {
                                kVar.wait();
                            }
                        }
                        android.support.v4.media.session.y yVar2 = this.f4953c;
                        C0790j c0790j = this.f4956f;
                        InterfaceC1905j interfaceC1905j3 = (InterfaceC1905j) yVar2.f9332c;
                        interfaceC1905j3.getClass();
                        C1902g c1902g = (C1902g) yVar2.f9333d;
                        c1902g.getClass();
                        i10 = interfaceC1905j3.f(c1902g, c0790j);
                        C1902g c1902g2 = (C1902g) this.f4953c.f9333d;
                        if (c1902g2 != null) {
                            j9 = c1902g2.f22312d;
                        } else {
                            j9 = -1;
                        }
                        if (j9 > this.f4962m.f4986i + j11) {
                            this.f4955e.c();
                            T t10 = this.f4962m;
                            t10.f4992o.post(t10.f4991n);
                            j11 = j9;
                        }
                    } catch (InterruptedException unused) {
                        throw new InterruptedIOException();
                    }
                }
                if (i10 == 1) {
                    i10 = 0;
                } else {
                    C1902g c1902g3 = (C1902g) this.f4953c.f9333d;
                    if (c1902g3 != null) {
                        j4 = c1902g3.f22312d;
                    } else {
                        j4 = -1;
                    }
                    if (j4 != -1) {
                        C0790j c0790j2 = this.f4956f;
                        if (c1902g3 != null) {
                            j10 = c1902g3.f22312d;
                        }
                        c0790j2.f11723a = j10;
                    }
                }
                s8.n.h(this.f4952b);
            } catch (Throwable th) {
                if (i10 != 1) {
                    C1902g c1902g4 = (C1902g) this.f4953c.f9333d;
                    if (c1902g4 != null) {
                        j = c1902g4.f22312d;
                    } else {
                        j = -1;
                    }
                    if (j != -1) {
                        C0790j c0790j3 = this.f4956f;
                        if (c1902g4 != null) {
                            j10 = c1902g4.f22312d;
                        }
                        c0790j3.f11723a = j10;
                    }
                }
                s8.n.h(this.f4952b);
                throw th;
            }
        }
    }

    public final C1516p b(long j) {
        Map map = Collections.EMPTY_MAP;
        this.f4962m.getClass();
        Map map2 = T.f4967j0;
        Uri uri = this.f4951a;
        AbstractC1566a.o(uri, "The uri must be set.");
        return new C1516p(uri, 1, null, map2, j, -1L, null, 6);
    }

    @Override // k4.J
    public final void c() {
        this.f4957g = true;
    }
}
