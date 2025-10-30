package D4;

import F4.AbstractC0126e;
import F4.C0132k;
import android.content.Context;
import android.os.DeadObjectException;
import android.os.Looper;
import android.os.Message;
import android.os.RemoteException;
import android.util.Log;
import android.util.SparseIntArray;
import b6.C0693o;
import b7.C0701c;
import c5.C0777a;
import com.google.android.gms.common.api.Status;
import d5.C1127a;
import f5.C1177i;
import f5.C1183o;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Set;
import s.C1936f;
import s.C1939i;

/* loaded from: classes.dex */
public final class t implements C4.k, C4.l {

    /* renamed from: f, reason: collision with root package name */
    public final C4.c f1882f;

    /* renamed from: g, reason: collision with root package name */
    public final C0083b f1883g;

    /* renamed from: h, reason: collision with root package name */
    public final A1.g f1884h;

    /* renamed from: k, reason: collision with root package name */
    public final int f1886k;

    /* renamed from: l, reason: collision with root package name */
    public final E f1887l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f1888m;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ C0088g f1892q;

    /* renamed from: e, reason: collision with root package name */
    public final LinkedList f1881e = new LinkedList();

    /* renamed from: i, reason: collision with root package name */
    public final HashSet f1885i = new HashSet();
    public final HashMap j = new HashMap();

    /* renamed from: n, reason: collision with root package name */
    public final ArrayList f1889n = new ArrayList();

    /* renamed from: o, reason: collision with root package name */
    public B4.b f1890o = null;

    /* renamed from: p, reason: collision with root package name */
    public int f1891p = 0;

    /* JADX WARN: Multi-variable type inference failed */
    public t(C0088g c0088g, C4.j jVar) {
        this.f1892q = c0088g;
        Looper looper = c0088g.f1855n.getLooper();
        android.support.v4.media.session.y a5 = jVar.a();
        C0693o c0693o = new C0693o((C1936f) a5.f9331b, (String) a5.f9332c, (String) a5.f9333d);
        Z0.a aVar = (Z0.a) jVar.f1580c.f18b;
        F4.y.h(aVar);
        C4.c a9 = aVar.a(jVar.f1578a, looper, c0693o, jVar.f1581d, this, this);
        String str = jVar.f1579b;
        if (str != null && (a9 instanceof AbstractC0126e)) {
            ((AbstractC0126e) a9).f2386t = str;
        }
        if (str != null && (a9 instanceof AbstractServiceConnectionC0092k)) {
            A0.a.x(a9);
            throw null;
        }
        this.f1882f = a9;
        this.f1883g = jVar.f1582e;
        this.f1884h = new A1.g(8, (byte) 0);
        this.f1886k = jVar.f1584g;
        if (a9.m()) {
            Context context = c0088g.f1847e;
            T4.d dVar = c0088g.f1855n;
            android.support.v4.media.session.y a10 = jVar.a();
            this.f1887l = new E(context, dVar, new C0693o((C1936f) a10.f9331b, (String) a10.f9332c, (String) a10.f9333d));
            return;
        }
        this.f1887l = null;
    }

    @Override // C4.k
    public final void Q() {
        Looper myLooper = Looper.myLooper();
        C0088g c0088g = this.f1892q;
        if (myLooper == c0088g.f1855n.getLooper()) {
            h();
        } else {
            c0088g.f1855n.post(new A4.e(1, this));
        }
    }

    public final B4.d a(B4.d[] dVarArr) {
        if (dVarArr != null && dVarArr.length != 0) {
            B4.d[] h7 = this.f1882f.h();
            if (h7 == null) {
                h7 = new B4.d[0];
            }
            C1939i c1939i = new C1939i(h7.length);
            for (B4.d dVar : h7) {
                c1939i.put(dVar.f691a, Long.valueOf(dVar.f()));
            }
            for (B4.d dVar2 : dVarArr) {
                Long l9 = (Long) c1939i.get(dVar2.f691a);
                if (l9 == null || l9.longValue() < dVar2.f()) {
                    return dVar2;
                }
            }
            return null;
        }
        return null;
    }

    public final void b(B4.b bVar) {
        HashSet hashSet = this.f1885i;
        Iterator it = hashSet.iterator();
        if (it.hasNext()) {
            if (it.next() == null) {
                if (F4.y.k(bVar, B4.b.f683e)) {
                    this.f1882f.i();
                }
                throw null;
            }
            throw new ClassCastException();
        }
        hashSet.clear();
    }

    public final void c(Status status) {
        F4.y.c(this.f1892q.f1855n);
        e(status, null, false);
    }

    @Override // C4.l
    public final void d(B4.b bVar) {
        o(bVar, null);
    }

    public final void e(Status status, RuntimeException runtimeException, boolean z9) {
        boolean z10;
        F4.y.c(this.f1892q.f1855n);
        boolean z11 = true;
        if (status != null) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (runtimeException != null) {
            z11 = false;
        }
        if (z10 != z11) {
            Iterator it = this.f1881e.iterator();
            while (it.hasNext()) {
                I i9 = (I) it.next();
                if (!z9 || i9.f1824a == 2) {
                    if (status != null) {
                        i9.a(status);
                    } else {
                        i9.b(runtimeException);
                    }
                    it.remove();
                }
            }
            return;
        }
        throw new IllegalArgumentException("Status XOR exception should be null");
    }

    public final void f() {
        LinkedList linkedList = this.f1881e;
        ArrayList arrayList = new ArrayList(linkedList);
        int size = arrayList.size();
        for (int i9 = 0; i9 < size; i9++) {
            I i10 = (I) arrayList.get(i9);
            if (this.f1882f.a()) {
                if (k(i10)) {
                    linkedList.remove(i10);
                }
            } else {
                return;
            }
        }
    }

    @Override // C4.k
    public final void g(int i9) {
        Looper myLooper = Looper.myLooper();
        C0088g c0088g = this.f1892q;
        if (myLooper == c0088g.f1855n.getLooper()) {
            i(i9);
        } else {
            c0088g.f1855n.post(new s(i9, 0, this));
        }
    }

    public final void h() {
        C4.c cVar = this.f1882f;
        C0088g c0088g = this.f1892q;
        F4.y.c(c0088g.f1855n);
        this.f1890o = null;
        b(B4.b.f683e);
        if (this.f1888m) {
            T4.d dVar = c0088g.f1855n;
            C0083b c0083b = this.f1883g;
            dVar.removeMessages(11, c0083b);
            c0088g.f1855n.removeMessages(9, c0083b);
            this.f1888m = false;
        }
        Iterator it = this.j.values().iterator();
        while (it.hasNext()) {
            C c3 = (C) it.next();
            if (a((B4.d[]) c3.f1807a.f9332c) != null) {
                it.remove();
            } else {
                try {
                    android.support.v4.media.session.y yVar = c3.f1807a;
                    ((C1183o) ((A3.F) yVar.f9333d).f51c).H(cVar, new C1177i());
                } catch (DeadObjectException unused) {
                    g(3);
                    cVar.d("DeadObjectException thrown while calling register listener method.");
                } catch (RemoteException unused2) {
                    it.remove();
                }
            }
        }
        f();
        j();
    }

    public final void i(int i9) {
        C0088g c0088g = this.f1892q;
        F4.y.c(c0088g.f1855n);
        this.f1890o = null;
        this.f1888m = true;
        String k5 = this.f1882f.k();
        A1.g gVar = this.f1884h;
        gVar.getClass();
        StringBuilder sb = new StringBuilder("The connection to Google Play services was lost");
        if (i9 == 1) {
            sb.append(" due to service disconnection.");
        } else if (i9 == 3) {
            sb.append(" due to dead object exception.");
        }
        if (k5 != null) {
            sb.append(" Last reason for disconnect: ");
            sb.append(k5);
        }
        gVar.I(true, new Status(20, sb.toString(), null, null));
        T4.d dVar = c0088g.f1855n;
        C0083b c0083b = this.f1883g;
        dVar.sendMessageDelayed(Message.obtain(dVar, 9, c0083b), 5000L);
        T4.d dVar2 = c0088g.f1855n;
        dVar2.sendMessageDelayed(Message.obtain(dVar2, 11, c0083b), 120000L);
        ((SparseIntArray) c0088g.f1849g.f18b).clear();
        Iterator it = this.j.values().iterator();
        while (it.hasNext()) {
            ((C) it.next()).getClass();
        }
    }

    public final void j() {
        C0088g c0088g = this.f1892q;
        T4.d dVar = c0088g.f1855n;
        C0083b c0083b = this.f1883g;
        dVar.removeMessages(12, c0083b);
        T4.d dVar2 = c0088g.f1855n;
        dVar2.sendMessageDelayed(dVar2.obtainMessage(12, c0083b), c0088g.f1843a);
    }

    public final boolean k(I i9) {
        if (!(i9 instanceof y)) {
            C4.c cVar = this.f1882f;
            i9.d(this.f1884h, cVar.m());
            try {
                i9.c(this);
                return true;
            } catch (DeadObjectException unused) {
                g(1);
                cVar.d("DeadObjectException thrown while running ApiCallRunner.");
            }
        } else {
            y yVar = (y) i9;
            B4.d a5 = a(yVar.g(this));
            if (a5 == null) {
                C4.c cVar2 = this.f1882f;
                i9.d(this.f1884h, cVar2.m());
                try {
                    i9.c(this);
                    return true;
                } catch (DeadObjectException unused2) {
                    g(1);
                    cVar2.d("DeadObjectException thrown while running ApiCallRunner.");
                }
            } else {
                Log.w("GoogleApiManager", this.f1882f.getClass().getName() + " could not execute call because it requires feature (" + a5.f691a + ", " + a5.f() + ").");
                if (this.f1892q.f1856o && yVar.f(this)) {
                    u uVar = new u(this.f1883g, a5);
                    int indexOf = this.f1889n.indexOf(uVar);
                    if (indexOf >= 0) {
                        u uVar2 = (u) this.f1889n.get(indexOf);
                        this.f1892q.f1855n.removeMessages(15, uVar2);
                        T4.d dVar = this.f1892q.f1855n;
                        dVar.sendMessageDelayed(Message.obtain(dVar, 15, uVar2), 5000L);
                        return false;
                    }
                    this.f1889n.add(uVar);
                    T4.d dVar2 = this.f1892q.f1855n;
                    dVar2.sendMessageDelayed(Message.obtain(dVar2, 15, uVar), 5000L);
                    T4.d dVar3 = this.f1892q.f1855n;
                    dVar3.sendMessageDelayed(Message.obtain(dVar3, 16, uVar), 120000L);
                    B4.b bVar = new B4.b(2, null);
                    if (!l(bVar)) {
                        this.f1892q.c(bVar, this.f1886k);
                        return false;
                    }
                    return false;
                }
                yVar.b(new C4.q(a5));
                return true;
            }
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0042, code lost:
    
        if (r7.get() == null) goto L30;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean l(B4.b r7) {
        /*
            r6 = this;
            java.lang.Object r0 = D4.C0088g.f1841r
            monitor-enter(r0)
            D4.g r1 = r6.f1892q     // Catch: java.lang.Throwable -> L47
            D4.p r2 = r1.f1852k     // Catch: java.lang.Throwable -> L47
            if (r2 == 0) goto L49
            s.f r1 = r1.f1853l     // Catch: java.lang.Throwable -> L47
            D4.b r2 = r6.f1883g     // Catch: java.lang.Throwable -> L47
            boolean r1 = r1.contains(r2)     // Catch: java.lang.Throwable -> L47
            if (r1 == 0) goto L49
            D4.g r1 = r6.f1892q     // Catch: java.lang.Throwable -> L47
            D4.p r1 = r1.f1852k     // Catch: java.lang.Throwable -> L47
            int r2 = r6.f1886k     // Catch: java.lang.Throwable -> L47
            r1.getClass()     // Catch: java.lang.Throwable -> L47
            D4.J r3 = new D4.J     // Catch: java.lang.Throwable -> L47
            r3.<init>(r7, r2)     // Catch: java.lang.Throwable -> L47
        L21:
            java.util.concurrent.atomic.AtomicReference r7 = r1.f1870c     // Catch: java.lang.Throwable -> L47
        L23:
            r2 = 0
            boolean r2 = r7.compareAndSet(r2, r3)     // Catch: java.lang.Throwable -> L47
            if (r2 == 0) goto L38
            T4.d r7 = r1.f1871d     // Catch: java.lang.Throwable -> L47
            S5.o r2 = new S5.o     // Catch: java.lang.Throwable -> L47
            r4 = 8
            r5 = 0
            r2.<init>(r1, r3, r4, r5)     // Catch: java.lang.Throwable -> L47
            r7.post(r2)     // Catch: java.lang.Throwable -> L47
            goto L44
        L38:
            java.lang.Object r2 = r7.get()     // Catch: java.lang.Throwable -> L47
            if (r2 == 0) goto L23
            java.lang.Object r7 = r7.get()     // Catch: java.lang.Throwable -> L47
            if (r7 == 0) goto L21
        L44:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L47
            r7 = 1
            return r7
        L47:
            r7 = move-exception
            goto L4c
        L49:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L47
            r7 = 0
            return r7
        L4c:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L47
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: D4.t.l(B4.b):boolean");
    }

    public final void m() {
        C0088g c0088g = this.f1892q;
        F4.y.c(c0088g.f1855n);
        C4.c cVar = this.f1882f;
        if (!cVar.a() && !cVar.g()) {
            try {
                A1.g gVar = c0088g.f1849g;
                Context context = c0088g.f1847e;
                gVar.getClass();
                F4.y.h(context);
                int f9 = cVar.f();
                SparseIntArray sparseIntArray = (SparseIntArray) gVar.f18b;
                int i9 = sparseIntArray.get(f9, -1);
                if (i9 == -1) {
                    i9 = 0;
                    int i10 = 0;
                    while (true) {
                        if (i10 < sparseIntArray.size()) {
                            int keyAt = sparseIntArray.keyAt(i10);
                            if (keyAt > f9 && sparseIntArray.get(keyAt) == 0) {
                                break;
                            } else {
                                i10++;
                            }
                        } else {
                            i9 = -1;
                            break;
                        }
                    }
                    if (i9 == -1) {
                        i9 = ((B4.f) gVar.f19c).b(context, f9);
                    }
                    sparseIntArray.put(f9, i9);
                }
                if (i9 != 0) {
                    B4.b bVar = new B4.b(i9, null);
                    Log.w("GoogleApiManager", "The service for " + cVar.getClass().getName() + " is not available: " + bVar.toString());
                    o(bVar, null);
                    return;
                }
                v vVar = new v(c0088g, cVar, this.f1883g);
                if (cVar.m()) {
                    E e8 = this.f1887l;
                    F4.y.h(e8);
                    C1127a c1127a = e8.f1815k;
                    if (c1127a != null) {
                        c1127a.l();
                    }
                    Integer valueOf = Integer.valueOf(System.identityHashCode(e8));
                    C0693o c0693o = e8.j;
                    c0693o.f11387f = valueOf;
                    T4.d dVar = e8.f1812g;
                    e8.f1815k = (C1127a) e8.f1813h.a(e8.f1811f, dVar.getLooper(), c0693o, (C0777a) c0693o.f11386e, e8, e8);
                    e8.f1816l = vVar;
                    Set set = e8.f1814i;
                    if (set != null && !set.isEmpty()) {
                        C1127a c1127a2 = e8.f1815k;
                        c1127a2.getClass();
                        c1127a2.c(new C0132k(c1127a2));
                    } else {
                        dVar.post(new A4.e(3, e8));
                    }
                }
                try {
                    cVar.c(vVar);
                } catch (SecurityException e9) {
                    o(new B4.b(10), e9);
                }
            } catch (IllegalStateException e10) {
                o(new B4.b(10), e10);
            }
        }
    }

    public final void n(I i9) {
        F4.y.c(this.f1892q.f1855n);
        boolean a5 = this.f1882f.a();
        LinkedList linkedList = this.f1881e;
        if (a5) {
            if (k(i9)) {
                j();
                return;
            } else {
                linkedList.add(i9);
                return;
            }
        }
        linkedList.add(i9);
        B4.b bVar = this.f1890o;
        if (bVar != null && bVar.f685b != 0 && bVar.f686c != null) {
            o(bVar, null);
        } else {
            m();
        }
    }

    public final void o(B4.b bVar, RuntimeException runtimeException) {
        C1127a c1127a;
        F4.y.c(this.f1892q.f1855n);
        E e8 = this.f1887l;
        if (e8 != null && (c1127a = e8.f1815k) != null) {
            c1127a.l();
        }
        F4.y.c(this.f1892q.f1855n);
        this.f1890o = null;
        ((SparseIntArray) this.f1892q.f1849g.f18b).clear();
        b(bVar);
        if ((this.f1882f instanceof H4.d) && bVar.f685b != 24) {
            C0088g c0088g = this.f1892q;
            c0088g.f1844b = true;
            T4.d dVar = c0088g.f1855n;
            dVar.sendMessageDelayed(dVar.obtainMessage(19), 300000L);
        }
        if (bVar.f685b == 4) {
            c(C0088g.f1840q);
            return;
        }
        if (this.f1881e.isEmpty()) {
            this.f1890o = bVar;
            return;
        }
        if (runtimeException != null) {
            F4.y.c(this.f1892q.f1855n);
            e(null, runtimeException, false);
            return;
        }
        if (this.f1892q.f1856o) {
            e(C0088g.d(this.f1883g, bVar), null, true);
            if (!this.f1881e.isEmpty() && !l(bVar) && !this.f1892q.c(bVar, this.f1886k)) {
                if (bVar.f685b == 18) {
                    this.f1888m = true;
                }
                if (this.f1888m) {
                    C0088g c0088g2 = this.f1892q;
                    C0083b c0083b = this.f1883g;
                    T4.d dVar2 = c0088g2.f1855n;
                    dVar2.sendMessageDelayed(Message.obtain(dVar2, 9, c0083b), 5000L);
                    return;
                }
                c(C0088g.d(this.f1883g, bVar));
                return;
            }
            return;
        }
        c(C0088g.d(this.f1883g, bVar));
    }

    public final void p(B4.b bVar) {
        F4.y.c(this.f1892q.f1855n);
        C4.c cVar = this.f1882f;
        cVar.d("onSignInFailed for " + cVar.getClass().getName() + " with " + String.valueOf(bVar));
        o(bVar, null);
    }

    public final void q() {
        F4.y.c(this.f1892q.f1855n);
        Status status = C0088g.f1839p;
        c(status);
        this.f1884h.I(false, status);
        for (C0090i c0090i : (C0090i[]) this.j.keySet().toArray(new C0090i[0])) {
            n(new G(c0090i, new C1177i()));
        }
        b(new B4.b(4));
        C4.c cVar = this.f1882f;
        if (cVar.a()) {
            cVar.j(new C0701c(3, this));
        }
    }
}
