package Y7;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes.dex */
public abstract class l0 extends d8.k implements InterfaceC0457d0, M, InterfaceC0451a0 {

    /* renamed from: d, reason: collision with root package name */
    public r0 f8822d;

    @Override // Y7.InterfaceC0451a0
    public final boolean a() {
        return true;
    }

    @Override // Y7.M
    public final void b() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2;
        r0 k5 = k();
        while (true) {
            Object D8 = k5.D();
            if (D8 instanceof l0) {
                if (D8 == this) {
                    O o9 = B.j;
                    do {
                        atomicReferenceFieldUpdater2 = r0.f8848a;
                        if (atomicReferenceFieldUpdater2.compareAndSet(k5, D8, o9)) {
                            return;
                        }
                    } while (atomicReferenceFieldUpdater2.get(k5) == D8);
                } else {
                    return;
                }
            } else {
                if (!(D8 instanceof InterfaceC0451a0) || ((InterfaceC0451a0) D8).e() == null) {
                    return;
                }
                while (true) {
                    Object h7 = h();
                    if (h7 instanceof d8.r) {
                        d8.k kVar = ((d8.r) h7).f17004a;
                        return;
                    }
                    if (h7 == this) {
                        return;
                    }
                    kotlin.jvm.internal.h.c(h7, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode{ kotlinx.coroutines.internal.LockFreeLinkedListKt.Node }");
                    d8.k kVar2 = (d8.k) h7;
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3 = d8.k.f16993c;
                    d8.r rVar = (d8.r) atomicReferenceFieldUpdater3.get(kVar2);
                    if (rVar == null) {
                        rVar = new d8.r(kVar2);
                        atomicReferenceFieldUpdater3.set(kVar2, rVar);
                    }
                    do {
                        atomicReferenceFieldUpdater = d8.k.f16991a;
                        if (atomicReferenceFieldUpdater.compareAndSet(this, h7, rVar)) {
                            kVar2.f();
                            return;
                        }
                    } while (atomicReferenceFieldUpdater.get(this) == h7);
                }
            }
        }
    }

    @Override // Y7.InterfaceC0451a0
    public final t0 e() {
        return null;
    }

    public InterfaceC0465h0 getParent() {
        return k();
    }

    public final r0 k() {
        r0 r0Var = this.f8822d;
        if (r0Var != null) {
            return r0Var;
        }
        kotlin.jvm.internal.h.h("job");
        throw null;
    }

    @Override // d8.k
    public final String toString() {
        return getClass().getSimpleName() + '@' + B.l(this) + "[job@" + B.l(k()) + ']';
    }
}
