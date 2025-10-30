package Y7;

import d8.AbstractC1130a;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* renamed from: Y7.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0464h extends I implements InterfaceC0462g, G7.d, I0 {

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f8812f = AtomicIntegerFieldUpdater.newUpdater(C0464h.class, "_decisionAndIndex$volatile");

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f8813g = AtomicReferenceFieldUpdater.newUpdater(C0464h.class, Object.class, "_state$volatile");

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f8814h = AtomicReferenceFieldUpdater.newUpdater(C0464h.class, Object.class, "_parentHandle$volatile");
    private volatile /* synthetic */ int _decisionAndIndex$volatile;
    private volatile /* synthetic */ Object _parentHandle$volatile;
    private volatile /* synthetic */ Object _state$volatile;

    /* renamed from: d, reason: collision with root package name */
    public final E7.d f8815d;

    /* renamed from: e, reason: collision with root package name */
    public final E7.i f8816e;

    public C0464h(int i9, E7.d dVar) {
        super(i9);
        this.f8815d = dVar;
        this.f8816e = dVar.getContext();
        this._decisionAndIndex$volatile = 536870911;
        this._state$volatile = C0452b.f8796a;
    }

    public static Object C(w0 w0Var, Object obj, int i9, O7.l lVar) {
        C0460f c0460f;
        if (obj instanceof C0476q) {
            return obj;
        }
        if (i9 != 1 && i9 != 2) {
            return obj;
        }
        if (lVar == null && !(w0Var instanceof C0460f)) {
            return obj;
        }
        if (w0Var instanceof C0460f) {
            c0460f = (C0460f) w0Var;
        } else {
            c0460f = null;
        }
        return new C0475p(obj, c0460f, lVar, (CancellationException) null, 16);
    }

    public static void x(w0 w0Var, Object obj) {
        throw new IllegalStateException(("It's prohibited to register multiple handlers, tried to register " + w0Var + ", already has " + obj).toString());
    }

    public final void A(Object obj, int i9, O7.l lVar) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f8813g;
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            if (obj2 instanceof w0) {
                Object C8 = C((w0) obj2, obj, i9, lVar);
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj2, C8)) {
                    if (atomicReferenceFieldUpdater.get(this) != obj2) {
                        break;
                    }
                }
                if (!w()) {
                    o();
                }
                p(i9);
                return;
            }
            if (obj2 instanceof C0466i) {
                C0466i c0466i = (C0466i) obj2;
                c0466i.getClass();
                if (C0466i.f8817c.compareAndSet(c0466i, 0, 1)) {
                    if (lVar != null) {
                        m(lVar, c0466i.f8842a);
                        return;
                    }
                    return;
                }
            }
            throw new IllegalStateException(("Already resumed, but proposed with update " + obj).toString());
        }
    }

    public final void B(AbstractC0480v abstractC0480v) {
        d8.h hVar;
        AbstractC0480v abstractC0480v2;
        int i9;
        A7.n nVar = A7.n.f558a;
        E7.d dVar = this.f8815d;
        if (dVar instanceof d8.h) {
            hVar = (d8.h) dVar;
        } else {
            hVar = null;
        }
        if (hVar != null) {
            abstractC0480v2 = hVar.f16980d;
        } else {
            abstractC0480v2 = null;
        }
        if (abstractC0480v2 == abstractC0480v) {
            i9 = 4;
        } else {
            i9 = this.f8769c;
        }
        A(nVar, i9, null);
    }

    @Override // Y7.I0
    public final void a(d8.u uVar, int i9) {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i10;
        do {
            atomicIntegerFieldUpdater = f8812f;
            i10 = atomicIntegerFieldUpdater.get(this);
            if ((i10 & 536870911) != 536870911) {
                throw new IllegalStateException("invokeOnCancellation should be called at most once");
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i10, ((i10 >> 29) << 29) + i9));
        v(uVar);
    }

    @Override // Y7.InterfaceC0462g
    public final void b(Object obj, O7.l lVar) {
        A(obj, this.f8769c, lVar);
    }

    @Override // Y7.InterfaceC0462g
    public final boolean c(Throwable th) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f8813g;
            Object obj = atomicReferenceFieldUpdater.get(this);
            boolean z9 = false;
            if (!(obj instanceof w0)) {
                return false;
            }
            if ((obj instanceof C0460f) || (obj instanceof d8.u)) {
                z9 = true;
            }
            C0466i c0466i = new C0466i(this, th, z9);
            while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, c0466i)) {
                if (atomicReferenceFieldUpdater.get(this) != obj) {
                    break;
                }
            }
            w0 w0Var = (w0) obj;
            if (w0Var instanceof C0460f) {
                l((C0460f) obj, th);
            } else if (w0Var instanceof d8.u) {
                n((d8.u) obj, th);
            }
            if (!w()) {
                o();
            }
            p(this.f8769c);
            return true;
        }
    }

    @Override // Y7.I
    public final void d(Object obj, CancellationException cancellationException) {
        CancellationException cancellationException2;
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f8813g;
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            if (!(obj2 instanceof w0)) {
                if (!(obj2 instanceof C0476q)) {
                    if (obj2 instanceof C0475p) {
                        C0475p c0475p = (C0475p) obj2;
                        if (c0475p.f8836e == null) {
                            C0475p a5 = C0475p.a(c0475p, null, cancellationException, 15);
                            while (!atomicReferenceFieldUpdater.compareAndSet(this, obj2, a5)) {
                                if (atomicReferenceFieldUpdater.get(this) != obj2) {
                                    cancellationException2 = cancellationException;
                                }
                            }
                            C0460f c0460f = c0475p.f8833b;
                            if (c0460f != null) {
                                l(c0460f, cancellationException);
                            }
                            O7.l lVar = c0475p.f8834c;
                            if (lVar != null) {
                                m(lVar, cancellationException);
                                return;
                            }
                            return;
                        }
                        throw new IllegalStateException("Must be called at most once");
                    }
                    cancellationException2 = cancellationException;
                    C0475p c0475p2 = new C0475p(obj2, (C0460f) null, (O7.l) null, cancellationException2, 14);
                    while (!atomicReferenceFieldUpdater.compareAndSet(this, obj2, c0475p2)) {
                        if (atomicReferenceFieldUpdater.get(this) != obj2) {
                            break;
                        }
                    }
                    return;
                    cancellationException = cancellationException2;
                } else {
                    return;
                }
            } else {
                throw new IllegalStateException("Not completed");
            }
        }
    }

    @Override // Y7.InterfaceC0462g
    public final G6.a e(Object obj, O7.l lVar) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f8813g;
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            boolean z9 = obj2 instanceof w0;
            G6.a aVar = B.f8746a;
            if (z9) {
                Object C8 = C((w0) obj2, obj, this.f8769c, lVar);
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj2, C8)) {
                    if (atomicReferenceFieldUpdater.get(this) != obj2) {
                        break;
                    }
                }
                if (!w()) {
                    o();
                }
                return aVar;
            }
            boolean z10 = obj2 instanceof C0475p;
            return null;
        }
    }

    @Override // Y7.I
    public final E7.d f() {
        return this.f8815d;
    }

    @Override // Y7.I
    public final Throwable g(Object obj) {
        Throwable g9 = super.g(obj);
        if (g9 != null) {
            return g9;
        }
        return null;
    }

    @Override // G7.d
    public final G7.d getCallerFrame() {
        E7.d dVar = this.f8815d;
        if (dVar instanceof G7.d) {
            return (G7.d) dVar;
        }
        return null;
    }

    @Override // E7.d
    public final E7.i getContext() {
        return this.f8816e;
    }

    @Override // Y7.I
    public final Object h(Object obj) {
        if (obj instanceof C0475p) {
            return ((C0475p) obj).f8832a;
        }
        return obj;
    }

    @Override // Y7.I
    public final Object j() {
        return f8813g.get(this);
    }

    @Override // Y7.InterfaceC0462g
    public final void k(Object obj) {
        p(this.f8769c);
    }

    public final void l(C0460f c0460f, Throwable th) {
        try {
            switch (c0460f.f8807a) {
                case 0:
                    if (th != null) {
                        ((ScheduledFuture) c0460f.f8808b).cancel(false);
                        return;
                    }
                    return;
                case 1:
                    ((O7.l) c0460f.f8808b).invoke(th);
                    return;
                default:
                    ((M) c0460f.f8808b).b();
                    return;
            }
        } catch (Throwable th2) {
            B.o(this.f8816e, new RuntimeException("Exception in invokeOnCancellation handler for " + this, th2));
        }
    }

    public final void m(O7.l lVar, Throwable th) {
        try {
            lVar.invoke(th);
        } catch (Throwable th2) {
            B.o(this.f8816e, new RuntimeException("Exception in resume onCancellation handler for " + this, th2));
        }
    }

    public final void n(d8.u uVar, Throwable th) {
        E7.i iVar = this.f8816e;
        int i9 = f8812f.get(this) & 536870911;
        if (i9 != 536870911) {
            try {
                uVar.g(i9, iVar);
                return;
            } catch (Throwable th2) {
                B.o(iVar, new RuntimeException("Exception in invokeOnCancellation handler for " + this, th2));
                return;
            }
        }
        throw new IllegalStateException("The index for Segment.onCancellation(..) is broken");
    }

    public final void o() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f8814h;
        M m9 = (M) atomicReferenceFieldUpdater.get(this);
        if (m9 == null) {
            return;
        }
        m9.b();
        atomicReferenceFieldUpdater.set(this, v0.f8859a);
    }

    public final void p(int i9) {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i10;
        boolean z9;
        boolean z10;
        do {
            atomicIntegerFieldUpdater = f8812f;
            i10 = atomicIntegerFieldUpdater.get(this);
            int i11 = i10 >> 29;
            if (i11 != 0) {
                if (i11 == 1) {
                    boolean z11 = false;
                    if (i9 == 4) {
                        z9 = true;
                    } else {
                        z9 = false;
                    }
                    E7.d dVar = this.f8815d;
                    if (!z9 && (dVar instanceof d8.h)) {
                        if (i9 != 1 && i9 != 2) {
                            z10 = false;
                        } else {
                            z10 = true;
                        }
                        int i12 = this.f8769c;
                        if (i12 == 1 || i12 == 2) {
                            z11 = true;
                        }
                        if (z10 == z11) {
                            AbstractC0480v abstractC0480v = ((d8.h) dVar).f16980d;
                            E7.i context = ((d8.h) dVar).f16981e.getContext();
                            if (abstractC0480v.i0()) {
                                abstractC0480v.g0(context, this);
                                return;
                            }
                            V a5 = A0.a();
                            if (a5.f8789b >= 4294967296L) {
                                a5.l0(this);
                                return;
                            }
                            a5.n0(true);
                            try {
                                B.u(this, dVar, true);
                                do {
                                } while (a5.p0());
                            } finally {
                                try {
                                    return;
                                } finally {
                                }
                            }
                            return;
                        }
                    }
                    B.u(this, dVar, z9);
                    return;
                }
                throw new IllegalStateException("Already resumed");
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i10, 1073741824 + (536870911 & i10)));
    }

    public Throwable q(r0 r0Var) {
        return r0Var.I();
    }

    public final Object r() {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i9;
        boolean w7 = w();
        do {
            atomicIntegerFieldUpdater = f8812f;
            i9 = atomicIntegerFieldUpdater.get(this);
            int i10 = i9 >> 29;
            if (i10 != 0) {
                if (i10 == 2) {
                    if (w7) {
                        z();
                    }
                    Object obj = f8813g.get(this);
                    if (!(obj instanceof C0476q)) {
                        int i11 = this.f8769c;
                        if (i11 == 1 || i11 == 2) {
                            InterfaceC0465h0 interfaceC0465h0 = (InterfaceC0465h0) this.f8816e.get(C0463g0.f8811a);
                            if (interfaceC0465h0 != null && !interfaceC0465h0.a()) {
                                CancellationException I4 = interfaceC0465h0.I();
                                d(obj, I4);
                                throw I4;
                            }
                        }
                        return h(obj);
                    }
                    throw ((C0476q) obj).f8842a;
                }
                throw new IllegalStateException("Already suspended");
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i9, 536870912 + (536870911 & i9)));
        if (((M) f8814h.get(this)) == null) {
            t();
        }
        if (w7) {
            z();
        }
        return F7.a.f2587a;
    }

    @Override // E7.d
    public final void resumeWith(Object obj) {
        Throwable a5 = A7.j.a(obj);
        if (a5 != null) {
            obj = new C0476q(a5, false);
        }
        A(obj, this.f8769c, null);
    }

    public final void s() {
        M t7 = t();
        if (t7 != null && !(f8813g.get(this) instanceof w0)) {
            t7.b();
            f8814h.set(this, v0.f8859a);
        }
    }

    public final M t() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        InterfaceC0465h0 interfaceC0465h0 = (InterfaceC0465h0) this.f8816e.get(C0463g0.f8811a);
        if (interfaceC0465h0 == null) {
            return null;
        }
        M p9 = B.p(interfaceC0465h0, new C0468j(this), 2);
        do {
            atomicReferenceFieldUpdater = f8814h;
            if (atomicReferenceFieldUpdater.compareAndSet(this, null, p9)) {
                break;
            }
        } while (atomicReferenceFieldUpdater.get(this) == null);
        return p9;
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append(y());
        sb.append('(');
        sb.append(B.y(this.f8815d));
        sb.append("){");
        Object obj = f8813g.get(this);
        if (obj instanceof w0) {
            str = "Active";
        } else if (obj instanceof C0466i) {
            str = "Cancelled";
        } else {
            str = "Completed";
        }
        sb.append(str);
        sb.append("}@");
        sb.append(B.l(this));
        return sb.toString();
    }

    public final void u(O7.l lVar) {
        v(new C0460f(1, lVar));
    }

    public final void v(w0 w0Var) {
        boolean z9;
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f8813g;
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj instanceof C0452b) {
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, w0Var)) {
                    if (atomicReferenceFieldUpdater.get(this) != obj) {
                        break;
                    }
                }
                return;
            }
            if (obj instanceof C0460f) {
                z9 = true;
            } else {
                z9 = obj instanceof d8.u;
            }
            Throwable th = null;
            if (!z9) {
                if (obj instanceof C0476q) {
                    C0476q c0476q = (C0476q) obj;
                    c0476q.getClass();
                    if (C0476q.f8841b.compareAndSet(c0476q, 0, 1)) {
                        if (obj instanceof C0466i) {
                            if (((C0476q) obj) == null) {
                                c0476q = null;
                            }
                            if (c0476q != null) {
                                th = c0476q.f8842a;
                            }
                            if (w0Var instanceof C0460f) {
                                l((C0460f) w0Var, th);
                                return;
                            } else {
                                kotlin.jvm.internal.h.c(w0Var, "null cannot be cast to non-null type kotlinx.coroutines.internal.Segment<*>");
                                n((d8.u) w0Var, th);
                                return;
                            }
                        }
                        return;
                    }
                    x(w0Var, obj);
                    throw null;
                }
                if (obj instanceof C0475p) {
                    C0475p c0475p = (C0475p) obj;
                    if (c0475p.f8833b == null) {
                        if (w0Var instanceof d8.u) {
                            return;
                        }
                        kotlin.jvm.internal.h.c(w0Var, "null cannot be cast to non-null type kotlinx.coroutines.CancelHandler");
                        C0460f c0460f = (C0460f) w0Var;
                        Throwable th2 = c0475p.f8836e;
                        if (th2 != null) {
                            l(c0460f, th2);
                            return;
                        }
                        C0475p a5 = C0475p.a(c0475p, c0460f, null, 29);
                        while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, a5)) {
                            if (atomicReferenceFieldUpdater.get(this) != obj) {
                                break;
                            }
                        }
                        return;
                    }
                    x(w0Var, obj);
                    throw null;
                }
                if (w0Var instanceof d8.u) {
                    return;
                }
                kotlin.jvm.internal.h.c(w0Var, "null cannot be cast to non-null type kotlinx.coroutines.CancelHandler");
                C0475p c0475p2 = new C0475p(obj, (C0460f) w0Var, (O7.l) null, (CancellationException) null, 28);
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, c0475p2)) {
                    if (atomicReferenceFieldUpdater.get(this) != obj) {
                        break;
                    }
                }
                return;
            }
            x(w0Var, obj);
            throw null;
        }
    }

    public final boolean w() {
        if (this.f8769c == 2) {
            E7.d dVar = this.f8815d;
            kotlin.jvm.internal.h.c(dVar, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<*>");
            if (d8.h.f16979h.get((d8.h) dVar) != null) {
                return true;
            }
            return false;
        }
        return false;
    }

    public String y() {
        return "CancellableContinuation";
    }

    public final void z() {
        d8.h hVar;
        E7.d dVar = this.f8815d;
        Throwable th = null;
        if (dVar instanceof d8.h) {
            hVar = (d8.h) dVar;
        } else {
            hVar = null;
        }
        if (hVar == null) {
            return;
        }
        loop0: while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = d8.h.f16979h;
            Object obj = atomicReferenceFieldUpdater.get(hVar);
            G6.a aVar = AbstractC1130a.f16969d;
            if (obj != aVar) {
                if (!(obj instanceof Throwable)) {
                    throw new IllegalStateException(("Inconsistent state " + obj).toString());
                }
                while (!atomicReferenceFieldUpdater.compareAndSet(hVar, obj, null)) {
                    if (atomicReferenceFieldUpdater.get(hVar) != obj) {
                        throw new IllegalArgumentException("Failed requirement.");
                    }
                }
                th = (Throwable) obj;
            }
            while (!atomicReferenceFieldUpdater.compareAndSet(hVar, aVar, this)) {
                if (atomicReferenceFieldUpdater.get(hVar) != aVar) {
                    break;
                }
            }
        }
        if (th != null) {
            o();
            c(th);
        }
    }
}
