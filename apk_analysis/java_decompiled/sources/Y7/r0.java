package Y7;

import G0.C0142h;
import com.google.android.gms.internal.measurement.D1;
import java.util.ArrayList;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes.dex */
public class r0 implements InterfaceC0465h0, x0 {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f8848a = AtomicReferenceFieldUpdater.newUpdater(r0.class, Object.class, "_state$volatile");

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f8849b = AtomicReferenceFieldUpdater.newUpdater(r0.class, Object.class, "_parentHandle$volatile");
    private volatile /* synthetic */ Object _parentHandle$volatile;
    private volatile /* synthetic */ Object _state$volatile;

    public r0(boolean z9) {
        O o9;
        if (z9) {
            o9 = B.j;
        } else {
            o9 = B.f8754i;
        }
        this._state$volatile = o9;
    }

    public static C0471l Q(d8.k kVar) {
        while (kVar.j()) {
            d8.k f9 = kVar.f();
            if (f9 == null) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = d8.k.f16992b;
                Object obj = atomicReferenceFieldUpdater.get(kVar);
                while (true) {
                    kVar = (d8.k) obj;
                    if (!kVar.j()) {
                        break;
                    }
                    obj = atomicReferenceFieldUpdater.get(kVar);
                }
            } else {
                kVar = f9;
            }
        }
        while (true) {
            kVar = kVar.i();
            if (!kVar.j()) {
                if (kVar instanceof C0471l) {
                    return (C0471l) kVar;
                }
                if (kVar instanceof t0) {
                    return null;
                }
            }
        }
    }

    public static String X(Object obj) {
        if (obj instanceof o0) {
            o0 o0Var = (o0) obj;
            if (o0Var.d()) {
                return "Cancelling";
            }
            if (o0Var.f()) {
                return "Completing";
            }
            return "Active";
        }
        if (obj instanceof InterfaceC0451a0) {
            if (((InterfaceC0451a0) obj).a()) {
                return "Active";
            }
            return "New";
        }
        if (obj instanceof C0476q) {
            return "Cancelled";
        }
        return "Completed";
    }

    public boolean A() {
        return true;
    }

    public boolean B() {
        return this instanceof C0473n;
    }

    /* JADX WARN: Type inference failed for: r4v5, types: [Y7.t0, d8.k] */
    public final t0 C(InterfaceC0451a0 interfaceC0451a0) {
        t0 e8 = interfaceC0451a0.e();
        if (e8 == null) {
            if (interfaceC0451a0 instanceof O) {
                return new d8.k();
            }
            if (interfaceC0451a0 instanceof l0) {
                V((l0) interfaceC0451a0);
                return null;
            }
            throw new IllegalStateException(("State should have list: " + interfaceC0451a0).toString());
        }
        return e8;
    }

    public final Object D() {
        while (true) {
            Object obj = f8848a.get(this);
            if (!(obj instanceof d8.q)) {
                return obj;
            }
            ((d8.q) obj).a(this);
        }
    }

    public boolean E(Throwable th) {
        return false;
    }

    @Override // Y7.InterfaceC0465h0
    public final InterfaceC0470k F(r0 r0Var) {
        M p9 = B.p(this, new C0471l(r0Var), 2);
        kotlin.jvm.internal.h.c(p9, "null cannot be cast to non-null type kotlinx.coroutines.ChildHandle");
        return (InterfaceC0470k) p9;
    }

    public final void H(InterfaceC0465h0 interfaceC0465h0) {
        v0 v0Var = v0.f8859a;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f8849b;
        if (interfaceC0465h0 == null) {
            atomicReferenceFieldUpdater.set(this, v0Var);
            return;
        }
        interfaceC0465h0.start();
        InterfaceC0470k F2 = interfaceC0465h0.F(this);
        atomicReferenceFieldUpdater.set(this, F2);
        if (!(D() instanceof InterfaceC0451a0)) {
            F2.b();
            atomicReferenceFieldUpdater.set(this, v0Var);
        }
    }

    @Override // Y7.InterfaceC0465h0
    public final CancellationException I() {
        Object D8 = D();
        CancellationException cancellationException = null;
        if (D8 instanceof o0) {
            Throwable c3 = ((o0) D8).c();
            if (c3 != null) {
                String concat = getClass().getSimpleName().concat(" is cancelling");
                if (c3 instanceof CancellationException) {
                    cancellationException = (CancellationException) c3;
                }
                if (cancellationException == null) {
                    if (concat == null) {
                        concat = t();
                    }
                    cancellationException = new C0467i0(concat, c3, this);
                }
                return cancellationException;
            }
            throw new IllegalStateException(("Job is still new or active: " + this).toString());
        }
        if (!(D8 instanceof InterfaceC0451a0)) {
            if (D8 instanceof C0476q) {
                Throwable th = ((C0476q) D8).f8842a;
                if (th instanceof CancellationException) {
                    cancellationException = (CancellationException) th;
                }
                if (cancellationException == null) {
                    return new C0467i0(t(), th, this);
                }
                return cancellationException;
            }
            return new C0467i0(getClass().getSimpleName().concat(" has completed normally"), null, this);
        }
        throw new IllegalStateException(("Job is still new or active: " + this).toString());
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x00c8, code lost:
    
        return r1;
     */
    /* JADX WARN: Type inference failed for: r2v2, types: [Y7.t0, d8.k] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final Y7.M J(boolean r8, boolean r9, Y7.InterfaceC0457d0 r10) {
        /*
            Method dump skipped, instructions count: 221
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Y7.r0.J(boolean, boolean, Y7.d0):Y7.M");
    }

    public boolean K() {
        return this instanceof C0456d;
    }

    public final boolean L(Object obj) {
        Object Y;
        do {
            Y = Y(D(), obj);
            if (Y == B.f8749d) {
                return false;
            }
            if (Y == B.f8750e) {
                return true;
            }
        } while (Y == B.f8751f);
        m(Y);
        return true;
    }

    public final Object M(Object obj) {
        Object Y;
        C0476q c0476q;
        do {
            Y = Y(D(), obj);
            if (Y == B.f8749d) {
                String str = "Job " + this + " is already complete or completing, but is being completed with " + obj;
                Throwable th = null;
                if (obj instanceof C0476q) {
                    c0476q = (C0476q) obj;
                } else {
                    c0476q = null;
                }
                if (c0476q != null) {
                    th = c0476q.f8842a;
                }
                throw new IllegalStateException(str, th);
            }
        } while (Y == B.f8751f);
        return Y;
    }

    @Override // Y7.InterfaceC0465h0
    public final Object N(G7.c cVar) {
        Object D8;
        A7.n nVar;
        do {
            D8 = D();
            boolean z9 = D8 instanceof InterfaceC0451a0;
            nVar = A7.n.f558a;
            if (!z9) {
                B.h(cVar.getContext());
                return nVar;
            }
        } while (W(D8) < 0);
        C0464h c0464h = new C0464h(1, D1.A(cVar));
        c0464h.s();
        c0464h.v(new C0460f(2, B.p(this, new N(3, c0464h), 3)));
        Object r5 = c0464h.r();
        F7.a aVar = F7.a.f2587a;
        if (r5 != aVar) {
            r5 = nVar;
        }
        if (r5 == aVar) {
            return r5;
        }
        return nVar;
    }

    @Override // Y7.InterfaceC0465h0
    public final M O(O7.l lVar) {
        return J(false, true, new C0455c0(lVar));
    }

    public String P() {
        return getClass().getSimpleName();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Throwable, A7.b] */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.RuntimeException] */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r6v0, types: [Y7.r0, java.lang.Object] */
    public final void R(t0 t0Var, Throwable th) {
        Object h7 = t0Var.h();
        kotlin.jvm.internal.h.c(h7, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode{ kotlinx.coroutines.internal.LockFreeLinkedListKt.Node }");
        d8.k kVar = (d8.k) h7;
        ?? r1 = 0;
        while (!kVar.equals(t0Var)) {
            if (kVar instanceof AbstractC0469j0) {
                l0 l0Var = (l0) kVar;
                try {
                    l0Var.d(th);
                } catch (Throwable th2) {
                    if (r1 != 0) {
                        O4.h.a(r1, th2);
                    } else {
                        r1 = new RuntimeException("Exception in completion handler " + l0Var + " for " + ((Object) this), th2);
                    }
                }
            }
            kVar = kVar.i();
            r1 = r1;
        }
        if (r1 != 0) {
            G(r1);
        }
        r(th);
    }

    @Override // Y7.InterfaceC0465h0
    public final M S(boolean z9, boolean z10, C0142h c0142h) {
        return J(z9, z10, new C0455c0(c0142h));
    }

    public final void V(l0 l0Var) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        d8.k kVar = new d8.k();
        l0Var.getClass();
        d8.k.f16992b.set(kVar, l0Var);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = d8.k.f16991a;
        atomicReferenceFieldUpdater2.set(kVar, l0Var);
        loop0: while (true) {
            if (l0Var.h() != l0Var) {
                break;
            }
            while (!atomicReferenceFieldUpdater2.compareAndSet(l0Var, l0Var, kVar)) {
                if (atomicReferenceFieldUpdater2.get(l0Var) != l0Var) {
                    break;
                }
            }
            kVar.g(l0Var);
        }
        d8.k i9 = l0Var.i();
        do {
            atomicReferenceFieldUpdater = f8848a;
            if (atomicReferenceFieldUpdater.compareAndSet(this, l0Var, i9)) {
                return;
            }
        } while (atomicReferenceFieldUpdater.get(this) == l0Var);
    }

    public final int W(Object obj) {
        boolean z9 = obj instanceof O;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f8848a;
        if (z9) {
            if (!((O) obj).f8778a) {
                O o9 = B.j;
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, o9)) {
                    if (atomicReferenceFieldUpdater.get(this) != obj) {
                        return -1;
                    }
                }
                U();
                return 1;
            }
            return 0;
        }
        if (obj instanceof Z) {
            t0 t0Var = ((Z) obj).f8794a;
            while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, t0Var)) {
                if (atomicReferenceFieldUpdater.get(this) != obj) {
                    return -1;
                }
            }
            U();
            return 1;
        }
        return 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:58:0x00be, code lost:
    
        if (r2 != null) goto L78;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x00cd, code lost:
    
        if (Y7.B.p(r2.f8821e, new Y7.n0(r6, r1, r2, r8), 1) == Y7.v0.f8859a) goto L82;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x00d2, code lost:
    
        r2 = Q(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x00d6, code lost:
    
        if (r2 != null) goto L94;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x00d1, code lost:
    
        return Y7.B.f8750e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x00dc, code lost:
    
        return x(r1, r8);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object Y(java.lang.Object r7, java.lang.Object r8) {
        /*
            Method dump skipped, instructions count: 223
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Y7.r0.Y(java.lang.Object, java.lang.Object):java.lang.Object");
    }

    @Override // Y7.InterfaceC0465h0
    public boolean a() {
        Object D8 = D();
        if ((D8 instanceof InterfaceC0451a0) && ((InterfaceC0451a0) D8).a()) {
            return true;
        }
        return false;
    }

    public Object a0(G7.j jVar) {
        return o(jVar);
    }

    @Override // Y7.InterfaceC0465h0
    public void d(CancellationException cancellationException) {
        if (cancellationException == null) {
            cancellationException = new C0467i0(t(), null, this);
        }
        q(cancellationException);
    }

    @Override // E7.i
    public final Object fold(Object obj, O7.p pVar) {
        return pVar.invoke(obj, this);
    }

    @Override // E7.i
    public final E7.g get(E7.h hVar) {
        return O4.h.r(this, hVar);
    }

    @Override // E7.g
    public final E7.h getKey() {
        return C0463g0.f8811a;
    }

    @Override // Y7.InterfaceC0465h0
    public final InterfaceC0465h0 getParent() {
        InterfaceC0470k interfaceC0470k = (InterfaceC0470k) f8849b.get(this);
        if (interfaceC0470k != null) {
            return interfaceC0470k.getParent();
        }
        return null;
    }

    @Override // Y7.InterfaceC0465h0
    public final boolean isCancelled() {
        Object D8 = D();
        if (!(D8 instanceof C0476q)) {
            if (!(D8 instanceof o0) || !((o0) D8).d()) {
                return false;
            }
            return true;
        }
        return true;
    }

    public final boolean l(InterfaceC0451a0 interfaceC0451a0, t0 t0Var, l0 l0Var) {
        char c3;
        p0 p0Var = new p0(l0Var, this, interfaceC0451a0);
        do {
            d8.k f9 = t0Var.f();
            if (f9 == null) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = d8.k.f16992b;
                Object obj = atomicReferenceFieldUpdater.get(t0Var);
                while (true) {
                    f9 = (d8.k) obj;
                    if (!f9.j()) {
                        break;
                    }
                    obj = atomicReferenceFieldUpdater.get(f9);
                }
            }
            d8.k.f16992b.set(l0Var, f9);
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = d8.k.f16991a;
            atomicReferenceFieldUpdater2.set(l0Var, t0Var);
            p0Var.f8838c = t0Var;
            while (true) {
                if (atomicReferenceFieldUpdater2.compareAndSet(f9, t0Var, p0Var)) {
                    if (p0Var.a(f9) == null) {
                        c3 = 1;
                    } else {
                        c3 = 2;
                    }
                } else if (atomicReferenceFieldUpdater2.get(f9) != t0Var) {
                    c3 = 0;
                    break;
                }
            }
            if (c3 == 1) {
                return true;
            }
        } while (c3 != 2);
        return false;
    }

    @Override // E7.i
    public final E7.i minusKey(E7.h hVar) {
        return O4.h.B(this, hVar);
    }

    public void n(Object obj) {
        m(obj);
    }

    public final Object o(E7.d dVar) {
        Object D8;
        do {
            D8 = D();
            if (!(D8 instanceof InterfaceC0451a0)) {
                if (!(D8 instanceof C0476q)) {
                    return B.A(D8);
                }
                throw ((C0476q) D8).f8842a;
            }
        } while (W(D8) < 0);
        m0 m0Var = new m0(D1.A(dVar), this);
        m0Var.s();
        m0Var.v(new C0460f(2, B.p(this, new N(2, m0Var), 3)));
        return m0Var.r();
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0032, code lost:
    
        r0 = Y7.B.f8749d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0036, code lost:
    
        if (r0 != Y7.B.f8750e) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0100, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0020, code lost:
    
        r0 = Y(r0, new Y7.C0476q(w(r10), false));
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x002f, code lost:
    
        if (r0 == Y7.B.f8751f) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x003c, code lost:
    
        if (r0 != Y7.B.f8749d) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x003e, code lost:
    
        r0 = null;
        r1 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0040, code lost:
    
        r4 = D();
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0046, code lost:
    
        if ((r4 instanceof Y7.o0) == false) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0095, code lost:
    
        if ((r4 instanceof Y7.InterfaceC0451a0) == false) goto L87;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0097, code lost:
    
        if (r1 != null) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0099, code lost:
    
        r1 = w(r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x009d, code lost:
    
        r5 = (Y7.InterfaceC0451a0) r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:2:0x0008, code lost:
    
        if (B() != false) goto L4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00a4, code lost:
    
        if (r5.a() == false) goto L86;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00c8, code lost:
    
        r5 = Y(r4, new Y7.C0476q(r1, false));
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00d3, code lost:
    
        if (r5 == Y7.B.f8749d) goto L92;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00d7, code lost:
    
        if (r5 == Y7.B.f8751f) goto L95;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00d9, code lost:
    
        r0 = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:3:0x000a, code lost:
    
        r0 = D();
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00f2, code lost:
    
        throw new java.lang.IllegalStateException(("Cannot happen in " + r4).toString());
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00a6, code lost:
    
        r6 = C(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00aa, code lost:
    
        if (r6 != null) goto L89;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00ad, code lost:
    
        r7 = new Y7.o0(r6, r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00b2, code lost:
    
        r4 = Y7.r0.f8848a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00b8, code lost:
    
        if (r4.compareAndSet(r9, r5, r7) == false) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x0010, code lost:
    
        if ((r0 instanceof Y7.InterfaceC0451a0) == false) goto L82;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00c4, code lost:
    
        if (r4.get(r9) == r5) goto L98;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00ba, code lost:
    
        R(r6, r1);
        r10 = Y7.B.f8749d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0061, code lost:
    
        r0 = r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x00f3, code lost:
    
        r10 = Y7.B.f8752g;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0048, code lost:
    
        monitor-enter(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0049, code lost:
    
        r5 = (Y7.o0) r4;
        r5.getClass();
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0057, code lost:
    
        if (Y7.o0.f8830d.get(r5) != Y7.B.f8753h) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0059, code lost:
    
        r5 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x005c, code lost:
    
        if (r5 == false) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x005e, code lost:
    
        r10 = Y7.B.f8752g;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0060, code lost:
    
        monitor-exit(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x0064, code lost:
    
        r5 = ((Y7.o0) r4).d();
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0014, code lost:
    
        if ((r0 instanceof Y7.o0) == false) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x006b, code lost:
    
        if (r1 != null) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x006d, code lost:
    
        r1 = w(r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0074, code lost:
    
        ((Y7.o0) r4).b(r1);
        r10 = ((Y7.o0) r4).c();
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x0081, code lost:
    
        if (r5 != false) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x0083, code lost:
    
        r0 = r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x0084, code lost:
    
        monitor-exit(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0085, code lost:
    
        if (r0 == null) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x0087, code lost:
    
        R(((Y7.o0) r4).f8831a, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x008e, code lost:
    
        r10 = Y7.B.f8749d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x005b, code lost:
    
        r5 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x0072, code lost:
    
        r10 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x0092, code lost:
    
        throw r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x00f9, code lost:
    
        if (r0 != Y7.B.f8749d) goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x00fe, code lost:
    
        if (r0 != Y7.B.f8750e) goto L76;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x0103, code lost:
    
        if (r0 != Y7.B.f8752g) goto L79;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x0105, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x001d, code lost:
    
        if (((Y7.o0) r0).f() == false) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x0106, code lost:
    
        m(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x0109, code lost:
    
        return true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean p(java.lang.Object r10) {
        /*
            Method dump skipped, instructions count: 266
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Y7.r0.p(java.lang.Object):boolean");
    }

    @Override // E7.i
    public final E7.i plus(E7.i iVar) {
        return O4.h.D(this, iVar);
    }

    public void q(CancellationException cancellationException) {
        p(cancellationException);
    }

    public final boolean r(Throwable th) {
        if (!K()) {
            boolean z9 = th instanceof CancellationException;
            InterfaceC0470k interfaceC0470k = (InterfaceC0470k) f8849b.get(this);
            if (interfaceC0470k != null && interfaceC0470k != v0.f8859a) {
                if (!interfaceC0470k.c(th) && !z9) {
                    return false;
                }
                return true;
            }
            return z9;
        }
        return true;
    }

    @Override // Y7.InterfaceC0465h0
    public final V7.j s() {
        return new B7.r(new q0(null, this));
    }

    @Override // Y7.InterfaceC0465h0
    public final boolean start() {
        int W6;
        do {
            W6 = W(D());
            if (W6 == 0) {
                return false;
            }
        } while (W6 != 1);
        return true;
    }

    public String t() {
        return "Job was cancelled";
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(P() + '{' + X(D()) + '}');
        sb.append('@');
        sb.append(B.l(this));
        return sb.toString();
    }

    public boolean u(Throwable th) {
        if (!(th instanceof CancellationException)) {
            if (p(th) && A()) {
                return true;
            }
            return false;
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [A7.b, java.lang.RuntimeException] */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.Throwable, A7.b] */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v6, types: [java.lang.RuntimeException] */
    /* JADX WARN: Type inference failed for: r1v8 */
    /* JADX WARN: Type inference failed for: r7v0, types: [Y7.r0, java.lang.Object] */
    public final void v(InterfaceC0451a0 interfaceC0451a0, Object obj) {
        C0476q c0476q;
        Throwable th;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f8849b;
        InterfaceC0470k interfaceC0470k = (InterfaceC0470k) atomicReferenceFieldUpdater.get(this);
        if (interfaceC0470k != null) {
            interfaceC0470k.b();
            atomicReferenceFieldUpdater.set(this, v0.f8859a);
        }
        ?? r1 = 0;
        if (obj instanceof C0476q) {
            c0476q = (C0476q) obj;
        } else {
            c0476q = null;
        }
        if (c0476q != null) {
            th = c0476q.f8842a;
        } else {
            th = null;
        }
        if (interfaceC0451a0 instanceof l0) {
            try {
                ((l0) interfaceC0451a0).d(th);
                return;
            } catch (Throwable th2) {
                G(new RuntimeException("Exception in completion handler " + interfaceC0451a0 + " for " + ((Object) this), th2));
                return;
            }
        }
        t0 e8 = interfaceC0451a0.e();
        if (e8 != null) {
            Object h7 = e8.h();
            kotlin.jvm.internal.h.c(h7, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode{ kotlinx.coroutines.internal.LockFreeLinkedListKt.Node }");
            d8.k kVar = (d8.k) h7;
            while (!kVar.equals(e8)) {
                if (kVar instanceof l0) {
                    l0 l0Var = (l0) kVar;
                    try {
                        l0Var.d(th);
                    } catch (Throwable th3) {
                        if (r1 != 0) {
                            O4.h.a(r1, th3);
                        } else {
                            r1 = new RuntimeException("Exception in completion handler " + l0Var + " for " + ((Object) this), th3);
                        }
                    }
                }
                kVar = kVar.i();
                r1 = r1;
            }
            if (r1 != 0) {
                G(r1);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v11, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r1v7, types: [java.lang.Throwable] */
    public final Throwable w(Object obj) {
        CancellationException cancellationException;
        if (obj instanceof Throwable) {
            return (Throwable) obj;
        }
        r0 r0Var = (r0) ((x0) obj);
        Object D8 = r0Var.D();
        CancellationException cancellationException2 = null;
        if (D8 instanceof o0) {
            cancellationException = ((o0) D8).c();
        } else if (D8 instanceof C0476q) {
            cancellationException = ((C0476q) D8).f8842a;
        } else if (!(D8 instanceof InterfaceC0451a0)) {
            cancellationException = null;
        } else {
            throw new IllegalStateException(("Cannot be cancelling child in this state: " + D8).toString());
        }
        if (cancellationException instanceof CancellationException) {
            cancellationException2 = cancellationException;
        }
        if (cancellationException2 == null) {
            return new C0467i0("Parent job is ".concat(X(D8)), cancellationException, r0Var);
        }
        return cancellationException2;
    }

    public final Object x(o0 o0Var, Object obj) {
        C0476q c0476q;
        Throwable z9;
        Object obj2;
        Throwable th = null;
        if (obj instanceof C0476q) {
            c0476q = (C0476q) obj;
        } else {
            c0476q = null;
        }
        if (c0476q != null) {
            th = c0476q.f8842a;
        }
        synchronized (o0Var) {
            o0Var.d();
            ArrayList g9 = o0Var.g(th);
            z9 = z(o0Var, g9);
            if (z9 != null && g9.size() > 1) {
                Set newSetFromMap = Collections.newSetFromMap(new IdentityHashMap(g9.size()));
                int size = g9.size();
                int i9 = 0;
                while (i9 < size) {
                    Object obj3 = g9.get(i9);
                    i9++;
                    Throwable th2 = (Throwable) obj3;
                    if (th2 != z9 && th2 != z9 && !(th2 instanceof CancellationException) && newSetFromMap.add(th2)) {
                        O4.h.a(z9, th2);
                    }
                }
            }
        }
        if (z9 != null && z9 != th) {
            obj = new C0476q(z9, false);
        }
        if (z9 != null && (r(z9) || E(z9))) {
            kotlin.jvm.internal.h.c(obj, "null cannot be cast to non-null type kotlinx.coroutines.CompletedExceptionally");
            C0476q.f8841b.compareAndSet((C0476q) obj, 0, 1);
        }
        T(obj);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f8848a;
        if (obj instanceof InterfaceC0451a0) {
            obj2 = new C0453b0((InterfaceC0451a0) obj);
        } else {
            obj2 = obj;
        }
        while (!atomicReferenceFieldUpdater.compareAndSet(this, o0Var, obj2) && atomicReferenceFieldUpdater.get(this) == o0Var) {
        }
        v(o0Var, obj);
        return obj;
    }

    public final Object y() {
        Object D8 = D();
        if (!(D8 instanceof InterfaceC0451a0)) {
            if (!(D8 instanceof C0476q)) {
                return B.A(D8);
            }
            throw ((C0476q) D8).f8842a;
        }
        throw new IllegalStateException("This job has not completed yet");
    }

    public final Throwable z(o0 o0Var, ArrayList arrayList) {
        Object obj;
        Object obj2 = null;
        if (arrayList.isEmpty()) {
            if (!o0Var.d()) {
                return null;
            }
            return new C0467i0(t(), null, this);
        }
        int size = arrayList.size();
        int i9 = 0;
        int i10 = 0;
        while (true) {
            if (i10 < size) {
                obj = arrayList.get(i10);
                i10++;
                if (!(((Throwable) obj) instanceof CancellationException)) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        Throwable th = (Throwable) obj;
        if (th != null) {
            return th;
        }
        Throwable th2 = (Throwable) arrayList.get(0);
        if (th2 instanceof C0) {
            int size2 = arrayList.size();
            while (true) {
                if (i9 >= size2) {
                    break;
                }
                Object obj3 = arrayList.get(i9);
                i9++;
                Throwable th3 = (Throwable) obj3;
                if (th3 != th2 && (th3 instanceof C0)) {
                    obj2 = obj3;
                    break;
                }
            }
            Throwable th4 = (Throwable) obj2;
            if (th4 != null) {
                return th4;
            }
        }
        return th2;
    }

    public void U() {
    }

    public void G(A7.b bVar) {
        throw bVar;
    }

    public void T(Object obj) {
    }

    public void m(Object obj) {
    }
}
