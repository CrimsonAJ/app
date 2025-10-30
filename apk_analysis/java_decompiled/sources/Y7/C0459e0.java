package Y7;

import G0.C0142h;
import a.AbstractC0485a;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* renamed from: Y7.e0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0459e0 extends G7.j implements O7.p {

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f8805r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ B2.i f8806s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0459e0(B2.i iVar, E7.d dVar) {
        super(2, dVar);
        this.f8806s = iVar;
    }

    @Override // G7.a
    public final E7.d create(Object obj, E7.d dVar) {
        C0459e0 c0459e0 = new C0459e0(this.f8806s, dVar);
        c0459e0.f8805r = obj;
        return c0459e0;
    }

    @Override // O7.p
    public final Object invoke(Object obj, Object obj2) {
        return ((C0459e0) create((InterfaceC0484z) obj, (E7.d) obj2)).invokeSuspend(A7.n.f558a);
    }

    @Override // G7.a
    public final Object invokeSuspend(Object obj) {
        M S8;
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i9;
        AbstractC0485a.A(obj);
        E7.i g9 = ((InterfaceC0484z) this.f8805r).g();
        B2.i iVar = this.f8806s;
        try {
            InterfaceC0465h0 m9 = B.m(g9);
            B0 b02 = new B0(m9);
            if (m9 instanceof r0) {
                S8 = ((r0) m9).J(true, true, b02);
            } else {
                int i10 = 1;
                S8 = m9.S(true, true, new C0142h(i10, b02, InterfaceC0457d0.class, "invoke", "invoke(Ljava/lang/Throwable;)V", 0, 4));
            }
            b02.f8757b = S8;
            try {
                do {
                    atomicIntegerFieldUpdater = B0.f8755c;
                    i9 = atomicIntegerFieldUpdater.get(b02);
                    if (i9 != 0) {
                        if (i9 != 2 && i9 != 3) {
                            B0.b(i9);
                            throw null;
                        }
                    }
                    return iVar.invoke();
                } while (!atomicIntegerFieldUpdater.compareAndSet(b02, i9, 0));
                return iVar.invoke();
            } finally {
                b02.a();
            }
        } catch (InterruptedException e8) {
            throw new CancellationException("Blocking call was interrupted due to parent cancellation").initCause(e8);
        }
    }
}
