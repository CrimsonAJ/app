package N3;

import android.os.Looper;
import j3.E0;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import k4.C1517q;
import l4.AbstractC1566a;
import n3.C1634k;
import n3.C1635l;
import n3.InterfaceC1636m;

/* renamed from: N3.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0250a {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f5035a = new ArrayList(1);

    /* renamed from: b, reason: collision with root package name */
    public final HashSet f5036b = new HashSet(1);

    /* renamed from: c, reason: collision with root package name */
    public final G f5037c = new G();

    /* renamed from: d, reason: collision with root package name */
    public final C1635l f5038d = new C1635l();

    /* renamed from: e, reason: collision with root package name */
    public Looper f5039e;

    /* renamed from: f, reason: collision with root package name */
    public E0 f5040f;

    /* renamed from: g, reason: collision with root package name */
    public k3.l f5041g;

    public final G a(A a5) {
        return new G(this.f5037c.f4923c, 0, a5, 0L);
    }

    public abstract InterfaceC0272x b(A a5, C1517q c1517q, long j);

    public final void c(B b9) {
        HashSet hashSet = this.f5036b;
        boolean isEmpty = hashSet.isEmpty();
        hashSet.remove(b9);
        if (!isEmpty && hashSet.isEmpty()) {
            d();
        }
    }

    public final void g(B b9) {
        this.f5039e.getClass();
        HashSet hashSet = this.f5036b;
        boolean isEmpty = hashSet.isEmpty();
        hashSet.add(b9);
        if (isEmpty) {
            h();
        }
    }

    public E0 i() {
        return null;
    }

    public abstract j3.Y j();

    public boolean k() {
        return true;
    }

    public abstract void l();

    public final void m(B b9, k4.W w7, k3.l lVar) {
        boolean z9;
        Looper myLooper = Looper.myLooper();
        Looper looper = this.f5039e;
        if (looper != null && looper != myLooper) {
            z9 = false;
        } else {
            z9 = true;
        }
        AbstractC1566a.h(z9);
        this.f5041g = lVar;
        E0 e02 = this.f5040f;
        this.f5035a.add(b9);
        if (this.f5039e == null) {
            this.f5039e = myLooper;
            this.f5036b.add(b9);
            n(w7);
        } else if (e02 != null) {
            g(b9);
            b9.a(this, e02);
        }
    }

    public abstract void n(k4.W w7);

    public final void o(E0 e02) {
        this.f5040f = e02;
        ArrayList arrayList = this.f5035a;
        int size = arrayList.size();
        int i9 = 0;
        while (i9 < size) {
            Object obj = arrayList.get(i9);
            i9++;
            ((B) obj).a(this, e02);
        }
    }

    public abstract void p(InterfaceC0272x interfaceC0272x);

    public final void q(B b9) {
        ArrayList arrayList = this.f5035a;
        arrayList.remove(b9);
        if (arrayList.isEmpty()) {
            this.f5039e = null;
            this.f5040f = null;
            this.f5041g = null;
            this.f5036b.clear();
            r();
            return;
        }
        c(b9);
    }

    public abstract void r();

    public final void t(InterfaceC1636m interfaceC1636m) {
        CopyOnWriteArrayList copyOnWriteArrayList = this.f5038d.f21132c;
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            C1634k c1634k = (C1634k) it.next();
            if (c1634k.f21129b == interfaceC1636m) {
                copyOnWriteArrayList.remove(c1634k);
            }
        }
    }

    public final void u(H h7) {
        CopyOnWriteArrayList copyOnWriteArrayList = this.f5037c.f4923c;
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            F f9 = (F) it.next();
            if (f9.f4920b == h7) {
                copyOnWriteArrayList.remove(f9);
            }
        }
    }

    public void d() {
    }

    public void h() {
    }
}
