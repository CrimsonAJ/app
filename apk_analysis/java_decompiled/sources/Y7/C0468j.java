package Y7;

import d8.AbstractC1130a;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* renamed from: Y7.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0468j extends AbstractC0469j0 {

    /* renamed from: e, reason: collision with root package name */
    public final C0464h f8819e;

    public C0468j(C0464h c0464h) {
        this.f8819e = c0464h;
    }

    @Override // Y7.InterfaceC0457d0
    public final void d(Throwable th) {
        r0 k5 = k();
        C0464h c0464h = this.f8819e;
        Throwable q9 = c0464h.q(k5);
        if (c0464h.w()) {
            E7.d dVar = c0464h.f8815d;
            kotlin.jvm.internal.h.c(dVar, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<*>");
            d8.h hVar = (d8.h) dVar;
            loop0: while (true) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = d8.h.f16979h;
                Object obj = atomicReferenceFieldUpdater.get(hVar);
                G6.a aVar = AbstractC1130a.f16969d;
                if (kotlin.jvm.internal.h.a(obj, aVar)) {
                    while (!atomicReferenceFieldUpdater.compareAndSet(hVar, aVar, q9)) {
                        if (atomicReferenceFieldUpdater.get(hVar) != aVar) {
                            break;
                        }
                    }
                    return;
                } else {
                    if (obj instanceof Throwable) {
                        return;
                    }
                    while (!atomicReferenceFieldUpdater.compareAndSet(hVar, obj, null)) {
                        if (atomicReferenceFieldUpdater.get(hVar) != obj) {
                            break;
                        }
                    }
                    break loop0;
                }
            }
        }
        c0464h.c(q9);
        if (!c0464h.w()) {
            c0464h.o();
        }
    }
}
