package n3;

import N3.E;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: n3.l, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1635l {

    /* renamed from: a, reason: collision with root package name */
    public final int f21130a;

    /* renamed from: b, reason: collision with root package name */
    public final N3.A f21131b;

    /* renamed from: c, reason: collision with root package name */
    public final CopyOnWriteArrayList f21132c;

    public C1635l() {
        this(new CopyOnWriteArrayList(), 0, null);
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [n3.m, java.lang.Object] */
    public final void a() {
        Iterator it = this.f21132c.iterator();
        while (it.hasNext()) {
            C1634k c1634k = (C1634k) it.next();
            l4.y.L(c1634k.f21128a, new RunnableC1633j(this, c1634k.f21129b, 2));
        }
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [n3.m, java.lang.Object] */
    public final void b() {
        Iterator it = this.f21132c.iterator();
        while (it.hasNext()) {
            C1634k c1634k = (C1634k) it.next();
            l4.y.L(c1634k.f21128a, new RunnableC1633j(this, c1634k.f21129b, 1));
        }
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [n3.m, java.lang.Object] */
    public final void c(int i9) {
        Iterator it = this.f21132c.iterator();
        while (it.hasNext()) {
            C1634k c1634k = (C1634k) it.next();
            l4.y.L(c1634k.f21128a, new D0.a(this, c1634k.f21129b, i9));
        }
    }

    public final void d(Exception exc) {
        Iterator it = this.f21132c.iterator();
        while (it.hasNext()) {
            C1634k c1634k = (C1634k) it.next();
            l4.y.L(c1634k.f21128a, new E(this, c1634k.f21129b, exc, 9));
        }
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [n3.m, java.lang.Object] */
    public final void e() {
        Iterator it = this.f21132c.iterator();
        while (it.hasNext()) {
            C1634k c1634k = (C1634k) it.next();
            l4.y.L(c1634k.f21128a, new RunnableC1633j(this, c1634k.f21129b, 0));
        }
    }

    public C1635l(CopyOnWriteArrayList copyOnWriteArrayList, int i9, N3.A a5) {
        this.f21132c = copyOnWriteArrayList;
        this.f21130a = i9;
        this.f21131b = a5;
    }
}
