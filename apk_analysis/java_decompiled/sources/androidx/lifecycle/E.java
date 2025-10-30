package androidx.lifecycle;

import android.os.Looper;
import java.util.Map;
import q.C1866a;
import r.C1921c;
import r.C1922d;
import r.C1924f;

/* loaded from: classes.dex */
public class E {

    /* renamed from: k, reason: collision with root package name */
    public static final Object f9790k = new Object();

    /* renamed from: a, reason: collision with root package name */
    public final Object f9791a;

    /* renamed from: b, reason: collision with root package name */
    public final C1924f f9792b;

    /* renamed from: c, reason: collision with root package name */
    public int f9793c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f9794d;

    /* renamed from: e, reason: collision with root package name */
    public volatile Object f9795e;

    /* renamed from: f, reason: collision with root package name */
    public volatile Object f9796f;

    /* renamed from: g, reason: collision with root package name */
    public int f9797g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f9798h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f9799i;
    public final A4.e j;

    public E(Object obj) {
        this.f9791a = new Object();
        this.f9792b = new C1924f();
        this.f9793c = 0;
        this.f9796f = f9790k;
        this.j = new A4.e(10, this);
        this.f9795e = obj;
        this.f9797g = 0;
    }

    public static void a(String str) {
        C1866a.f0().f22228m.getClass();
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
        } else {
            throw new IllegalStateException(A0.a.n("Cannot invoke ", str, " on a background thread"));
        }
    }

    public final void b(D d9) {
        if (d9.f9787b) {
            if (!d9.m()) {
                d9.g(false);
                return;
            }
            int i9 = d9.f9788c;
            int i10 = this.f9797g;
            if (i9 >= i10) {
                return;
            }
            d9.f9788c = i10;
            d9.f9786a.a(this.f9795e);
        }
    }

    public final void c(D d9) {
        if (this.f9798h) {
            this.f9799i = true;
            return;
        }
        this.f9798h = true;
        do {
            this.f9799i = false;
            if (d9 != null) {
                b(d9);
                d9 = null;
            } else {
                C1924f c1924f = this.f9792b;
                c1924f.getClass();
                C1922d c1922d = new C1922d(c1924f);
                c1924f.f22587c.put(c1922d, Boolean.FALSE);
                while (c1922d.hasNext()) {
                    b((D) ((Map.Entry) c1922d.next()).getValue());
                    if (this.f9799i) {
                        break;
                    }
                }
            }
        } while (this.f9799i);
        this.f9798h = false;
    }

    public final void d(InterfaceC0561w interfaceC0561w, F f9) {
        Object obj;
        a("observe");
        if (interfaceC0561w.x().a0() != EnumC0555p.f9893a) {
            C c3 = new C(this, interfaceC0561w, f9);
            C1924f c1924f = this.f9792b;
            C1921c b9 = c1924f.b(f9);
            if (b9 != null) {
                obj = b9.f22579b;
            } else {
                C1921c c1921c = new C1921c(f9, c3);
                c1924f.f22588d++;
                C1921c c1921c2 = c1924f.f22586b;
                if (c1921c2 == null) {
                    c1924f.f22585a = c1921c;
                    c1924f.f22586b = c1921c;
                } else {
                    c1921c2.f22580c = c1921c;
                    c1921c.f22581d = c1921c2;
                    c1924f.f22586b = c1921c;
                }
                obj = null;
            }
            D d9 = (D) obj;
            if (d9 != null && !d9.l(interfaceC0561w)) {
                throw new IllegalArgumentException("Cannot add the same observer with different lifecycles");
            }
            if (d9 != null) {
                return;
            }
            interfaceC0561w.x().V(c3);
        }
    }

    public final void g(Object obj) {
        boolean z9;
        synchronized (this.f9791a) {
            if (this.f9796f == f9790k) {
                z9 = true;
            } else {
                z9 = false;
            }
            this.f9796f = obj;
        }
        if (!z9) {
            return;
        }
        C1866a.f0().g0(this.j);
    }

    public void h(F f9) {
        a("removeObserver");
        D d9 = (D) this.f9792b.c(f9);
        if (d9 == null) {
            return;
        }
        d9.k();
        d9.g(false);
    }

    public void i(Object obj) {
        a("setValue");
        this.f9797g++;
        this.f9795e = obj;
        c(null);
    }

    public E() {
        this.f9791a = new Object();
        this.f9792b = new C1924f();
        this.f9793c = 0;
        Object obj = f9790k;
        this.f9796f = obj;
        this.j = new A4.e(10, this);
        this.f9795e = obj;
        this.f9797g = -1;
    }

    public void e() {
    }

    public void f() {
    }
}
