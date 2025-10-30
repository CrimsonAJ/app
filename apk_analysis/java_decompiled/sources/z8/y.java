package z8;

import b5.G1;
import d4.C1126e;
import f5.C1183o;
import i8.InterfaceC1419i;
import java.io.IOException;
import java.util.ArrayList;
import x8.C2190j;

/* loaded from: classes.dex */
public final class y implements InterfaceC2255d {

    /* renamed from: a, reason: collision with root package name */
    public final N f25642a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f25643b;

    /* renamed from: c, reason: collision with root package name */
    public final Object[] f25644c;

    /* renamed from: d, reason: collision with root package name */
    public final InterfaceC1419i f25645d;

    /* renamed from: e, reason: collision with root package name */
    public final InterfaceC2262k f25646e;

    /* renamed from: f, reason: collision with root package name */
    public volatile boolean f25647f;

    /* renamed from: g, reason: collision with root package name */
    public n8.g f25648g;

    /* renamed from: h, reason: collision with root package name */
    public Throwable f25649h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f25650i;

    public y(N n7, Object obj, Object[] objArr, InterfaceC1419i interfaceC1419i, InterfaceC2262k interfaceC2262k) {
        this.f25642a = n7;
        this.f25643b = obj;
        this.f25644c = objArr;
        this.f25645d = interfaceC1419i;
        this.f25646e = interfaceC2262k;
    }

    @Override // z8.InterfaceC2255d
    /* renamed from: a */
    public final InterfaceC2255d clone() {
        return new y(this.f25642a, this.f25643b, this.f25644c, this.f25645d, this.f25646e);
    }

    public final n8.g b() {
        i8.y yVar;
        N n7 = this.f25642a;
        Object[] objArr = this.f25644c;
        int length = objArr.length;
        X[] xArr = n7.f25585k;
        if (length == xArr.length) {
            L l9 = new L(n7.f25579d, n7.f25578c, n7.f25580e, n7.f25581f, n7.f25582g, n7.f25583h, n7.f25584i, n7.j);
            if (n7.f25586l) {
                length--;
            }
            ArrayList arrayList = new ArrayList(length);
            for (int i9 = 0; i9 < length; i9++) {
                arrayList.add(objArr[i9]);
                xArr[i9].a(l9, objArr[i9]);
            }
            i8.x xVar = l9.f25544d;
            if (xVar != null) {
                yVar = xVar.b();
            } else {
                String link = l9.f25543c;
                i8.y yVar2 = l9.f25542b;
                yVar2.getClass();
                kotlin.jvm.internal.h.e(link, "link");
                i8.x g9 = yVar2.g(link);
                if (g9 != null) {
                    yVar = g9.b();
                } else {
                    yVar = null;
                }
                if (yVar == null) {
                    throw new IllegalArgumentException("Malformed URL. Base: " + yVar2 + ", Relative: " + l9.f25543c);
                }
            }
            i8.J j = l9.f25550k;
            if (j == null) {
                C1126e c1126e = l9.j;
                if (c1126e != null) {
                    j = new i8.t(c1126e.f16867a, c1126e.f16868b);
                } else {
                    G1 g12 = l9.f25549i;
                    if (g12 != null) {
                        ArrayList arrayList2 = (ArrayList) g12.f10719d;
                        if (!arrayList2.isEmpty()) {
                            j = new i8.C((C2190j) g12.f10717b, (i8.A) g12.f10718c, k8.c.x(arrayList2));
                        } else {
                            throw new IllegalStateException("Multipart body must have at least one part.");
                        }
                    } else if (l9.f25548h) {
                        long j4 = 0;
                        k8.c.c(j4, j4, j4);
                        j = new i8.I(null, 0, new byte[0]);
                    }
                }
            }
            i8.A a5 = l9.f25547g;
            C1183o c1183o = l9.f25546f;
            if (a5 != null) {
                if (j != null) {
                    j = new i8.H(j, a5);
                } else {
                    c1183o.v("Content-Type", a5.f18927a);
                }
            }
            Y2.r rVar = l9.f25545e;
            rVar.getClass();
            rVar.f8647a = yVar;
            rVar.f8649c = c1183o.z().d();
            rVar.G(l9.f25541a, j);
            rVar.R(C2269s.class, new C2269s(n7.f25576a, this.f25643b, n7.f25577b, arrayList));
            return ((i8.E) this.f25645d).c(rVar.o());
        }
        throw new IllegalArgumentException(u0.z.g(A0.a.p("Argument count (", length, ") doesn't match expected count ("), xArr.length, ")"));
    }

    public final n8.g c() {
        n8.g gVar = this.f25648g;
        if (gVar != null) {
            return gVar;
        }
        Throwable th = this.f25649h;
        if (th != null) {
            if (!(th instanceof IOException)) {
                if (th instanceof RuntimeException) {
                    throw ((RuntimeException) th);
                }
                throw ((Error) th);
            }
            throw ((IOException) th);
        }
        try {
            n8.g b9 = b();
            this.f25648g = b9;
            return b9;
        } catch (IOException | Error | RuntimeException e8) {
            X.s(e8);
            this.f25649h = e8;
            throw e8;
        }
    }

    @Override // z8.InterfaceC2255d
    public final void cancel() {
        n8.g gVar;
        this.f25647f = true;
        synchronized (this) {
            gVar = this.f25648g;
        }
        if (gVar != null) {
            gVar.cancel();
        }
    }

    public final Object clone() {
        return new y(this.f25642a, this.f25643b, this.f25644c, this.f25645d, this.f25646e);
    }

    @Override // z8.InterfaceC2255d
    public final void d(InterfaceC2258g interfaceC2258g) {
        n8.g gVar;
        Throwable th;
        synchronized (this) {
            try {
                if (!this.f25650i) {
                    this.f25650i = true;
                    gVar = this.f25648g;
                    th = this.f25649h;
                    if (gVar == null && th == null) {
                        try {
                            n8.g b9 = b();
                            this.f25648g = b9;
                            gVar = b9;
                        } catch (Throwable th2) {
                            th = th2;
                            X.s(th);
                            this.f25649h = th;
                        }
                    }
                } else {
                    throw new IllegalStateException("Already executed.");
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
        if (th != null) {
            interfaceC2258g.e(this, th);
            return;
        }
        if (this.f25647f) {
            gVar.cancel();
        }
        gVar.f(new C2273w(this, interfaceC2258g));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v0, types: [java.lang.Object, x8.i, x8.h] */
    public final O e(i8.L l9) {
        i8.K s9 = l9.s();
        i8.N n7 = l9.f19035g;
        s9.f19023g = new C2274x(n7.d(), n7.a());
        i8.L a5 = s9.a();
        int i9 = a5.f19032d;
        if (i9 >= 200 && i9 < 300) {
            if (i9 != 204 && i9 != 205) {
                K1.b bVar = new K1.b(n7);
                try {
                    Object b9 = this.f25646e.b(bVar);
                    if (a5.g()) {
                        return new O(a5, b9, null);
                    }
                    throw new IllegalArgumentException("rawResponse must be successful response");
                } catch (RuntimeException e8) {
                    IOException iOException = (IOException) bVar.f4236d;
                    if (iOException == null) {
                        throw e8;
                    }
                    throw iOException;
                }
            }
            n7.close();
            if (a5.g()) {
                return new O(a5, null, null);
            }
            throw new IllegalArgumentException("rawResponse must be successful response");
        }
        try {
            ?? obj = new Object();
            n7.g().p(obj);
            i8.M m9 = new i8.M(n7.d(), n7.a(), obj, 0);
            if (!a5.g()) {
                return new O(a5, null, m9);
            }
            throw new IllegalArgumentException("rawResponse should not be successful response");
        } finally {
            n7.close();
        }
    }

    @Override // z8.InterfaceC2255d
    public final synchronized i8.G g() {
        try {
        } catch (IOException e8) {
            throw new RuntimeException("Unable to create request.", e8);
        }
        return c().f21263b;
    }

    @Override // z8.InterfaceC2255d
    public final boolean s() {
        boolean z9 = true;
        if (this.f25647f) {
            return true;
        }
        synchronized (this) {
            n8.g gVar = this.f25648g;
            if (gVar == null || !gVar.f21273m) {
                z9 = false;
            }
        }
        return z9;
    }
}
