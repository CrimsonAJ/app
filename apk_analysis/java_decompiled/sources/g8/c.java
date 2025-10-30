package g8;

import A7.n;
import O7.l;
import Y7.C0464h;
import Y7.I0;
import Y7.InterfaceC0462g;
import d8.u;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes.dex */
public final class c implements InterfaceC0462g, I0 {

    /* renamed from: a, reason: collision with root package name */
    public final C0464h f17784a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ d f17785b;

    public c(d dVar, C0464h c0464h) {
        this.f17785b = dVar;
        this.f17784a = c0464h;
    }

    @Override // Y7.I0
    public final void a(u uVar, int i9) {
        this.f17784a.a(uVar, i9);
    }

    @Override // Y7.InterfaceC0462g
    public final void b(Object obj, l lVar) {
        n nVar = n.f558a;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = d.f17786h;
        d dVar = this.f17785b;
        atomicReferenceFieldUpdater.set(dVar, null);
        this.f17784a.b(nVar, new b(dVar, this, 0));
    }

    @Override // Y7.InterfaceC0462g
    public final boolean c(Throwable th) {
        return this.f17784a.c(th);
    }

    @Override // Y7.InterfaceC0462g
    public final G6.a e(Object obj, l lVar) {
        d dVar = this.f17785b;
        b bVar = new b(dVar, this, 1);
        G6.a e8 = this.f17784a.e((n) obj, bVar);
        if (e8 != null) {
            d.f17786h.set(dVar, null);
        }
        return e8;
    }

    @Override // E7.d
    public final E7.i getContext() {
        return this.f17784a.f8816e;
    }

    @Override // Y7.InterfaceC0462g
    public final void k(Object obj) {
        this.f17784a.k(obj);
    }

    @Override // E7.d
    public final void resumeWith(Object obj) {
        this.f17784a.resumeWith(obj);
    }
}
