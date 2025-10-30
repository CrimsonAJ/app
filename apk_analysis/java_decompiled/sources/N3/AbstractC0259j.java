package N3;

import android.os.Handler;
import j3.E0;
import java.util.HashMap;
import java.util.Iterator;
import l4.AbstractC1566a;
import n3.C1635l;

/* renamed from: N3.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0259j extends AbstractC0250a {

    /* renamed from: h, reason: collision with root package name */
    public final HashMap f5124h = new HashMap();

    /* renamed from: i, reason: collision with root package name */
    public Handler f5125i;
    public k4.W j;

    @Override // N3.AbstractC0250a
    public final void d() {
        for (C0258i c0258i : this.f5124h.values()) {
            c0258i.f5118a.c(c0258i.f5119b);
        }
    }

    @Override // N3.AbstractC0250a
    public final void h() {
        for (C0258i c0258i : this.f5124h.values()) {
            c0258i.f5118a.g(c0258i.f5119b);
        }
    }

    @Override // N3.AbstractC0250a
    public void l() {
        Iterator it = this.f5124h.values().iterator();
        while (it.hasNext()) {
            ((C0258i) it.next()).f5118a.l();
        }
    }

    @Override // N3.AbstractC0250a
    public void r() {
        HashMap hashMap = this.f5124h;
        for (C0258i c0258i : hashMap.values()) {
            c0258i.f5118a.q(c0258i.f5119b);
            com.google.firebase.messaging.s sVar = c0258i.f5120c;
            AbstractC0250a abstractC0250a = c0258i.f5118a;
            abstractC0250a.u(sVar);
            abstractC0250a.t(sVar);
        }
        hashMap.clear();
    }

    public abstract A v(Object obj, A a5);

    public abstract void y(Object obj, AbstractC0250a abstractC0250a, E0 e02);

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2, types: [N3.h, N3.B] */
    /* JADX WARN: Type inference failed for: r3v1, types: [N3.F, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v2, types: [n3.k, java.lang.Object] */
    public final void z(final Object obj, AbstractC0250a abstractC0250a) {
        HashMap hashMap = this.f5124h;
        AbstractC1566a.h(!hashMap.containsKey(obj));
        ?? r1 = new B() { // from class: N3.h
            @Override // N3.B
            public final void a(AbstractC0250a abstractC0250a2, E0 e02) {
                AbstractC0259j.this.y(obj, abstractC0250a2, e02);
            }
        };
        com.google.firebase.messaging.s sVar = new com.google.firebase.messaging.s(this, obj);
        hashMap.put(obj, new C0258i(abstractC0250a, r1, sVar));
        Handler handler = this.f5125i;
        handler.getClass();
        abstractC0250a.getClass();
        G g9 = abstractC0250a.f5037c;
        g9.getClass();
        ?? obj2 = new Object();
        obj2.f4919a = handler;
        obj2.f4920b = sVar;
        g9.f4923c.add(obj2);
        Handler handler2 = this.f5125i;
        handler2.getClass();
        C1635l c1635l = abstractC0250a.f5038d;
        c1635l.getClass();
        ?? obj3 = new Object();
        obj3.f21128a = handler2;
        obj3.f21129b = sVar;
        c1635l.f21132c.add(obj3);
        k4.W w7 = this.j;
        k3.l lVar = this.f5041g;
        AbstractC1566a.n(lVar);
        abstractC0250a.m(r1, w7, lVar);
        if (this.f5036b.isEmpty()) {
            abstractC0250a.c(r1);
        }
    }

    public long w(long j, Object obj) {
        return j;
    }

    public int x(int i9, Object obj) {
        return i9;
    }
}
