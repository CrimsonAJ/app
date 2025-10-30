package Y7;

import G0.C0142h;
import a.AbstractC0485a;
import com.google.android.gms.internal.measurement.AbstractC1002u1;
import com.google.android.gms.internal.measurement.D1;
import d8.AbstractC1130a;
import java.util.Iterator;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;

/* loaded from: classes.dex */
public abstract class B {

    /* renamed from: b, reason: collision with root package name */
    public static final G6.a f8747b;

    /* renamed from: c, reason: collision with root package name */
    public static final G6.a f8748c;

    /* renamed from: d, reason: collision with root package name */
    public static final G6.a f8749d;

    /* renamed from: e, reason: collision with root package name */
    public static final G6.a f8750e;

    /* renamed from: f, reason: collision with root package name */
    public static final G6.a f8751f;

    /* renamed from: g, reason: collision with root package name */
    public static final G6.a f8752g;

    /* renamed from: h, reason: collision with root package name */
    public static final G6.a f8753h;

    /* renamed from: a, reason: collision with root package name */
    public static final G6.a f8746a = new G6.a("RESUME_TOKEN", 3);

    /* renamed from: i, reason: collision with root package name */
    public static final O f8754i = new O(false);
    public static final O j = new O(true);

    static {
        int i9 = 3;
        f8747b = new G6.a("REMOVED_TASK", i9);
        f8748c = new G6.a("CLOSED_EMPTY", i9);
        int i10 = 3;
        f8749d = new G6.a("COMPLETING_ALREADY", i10);
        f8750e = new G6.a("COMPLETING_WAITING_CHILDREN", i10);
        f8751f = new G6.a("COMPLETING_RETRY", i10);
        f8752g = new G6.a("TOO_LATE_TO_CANCEL", i10);
        f8753h = new G6.a("SEALED", i10);
    }

    public static final Object A(Object obj) {
        C0453b0 c0453b0;
        InterfaceC0451a0 interfaceC0451a0;
        if (obj instanceof C0453b0) {
            c0453b0 = (C0453b0) obj;
        } else {
            c0453b0 = null;
        }
        if (c0453b0 != null && (interfaceC0451a0 = c0453b0.f8797a) != null) {
            return interfaceC0451a0;
        }
        return obj;
    }

    public static final G0 B(E7.d dVar, E7.i iVar, Object obj) {
        G0 g02 = null;
        if ((dVar instanceof G7.d) && iVar.get(H0.f8768a) != null) {
            G7.d dVar2 = (G7.d) dVar;
            while (true) {
                if ((dVar2 instanceof H) || (dVar2 = dVar2.getCallerFrame()) == null) {
                    break;
                }
                if (dVar2 instanceof G0) {
                    g02 = (G0) dVar2;
                    break;
                }
            }
            if (g02 != null) {
                g02.e0(iVar, obj);
            }
        }
        return g02;
    }

    public static final Object C(E7.i iVar, O7.p pVar, E7.d dVar) {
        E7.i i9;
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        E7.i context = dVar.getContext();
        if (!((Boolean) iVar.fold(Boolean.FALSE, C0477s.f8851f)).booleanValue()) {
            i9 = context.plus(iVar);
        } else {
            i9 = i(context, iVar, false);
        }
        h(i9);
        if (i9 == context) {
            d8.t tVar = new d8.t(dVar, i9);
            return AbstractC1002u1.d0(tVar, tVar, pVar);
        }
        E7.e eVar = E7.e.f1977a;
        if (kotlin.jvm.internal.h.a(i9.get(eVar), context.get(eVar))) {
            G0 g02 = new G0(dVar, i9);
            E7.i iVar2 = g02.f8795c;
            Object m9 = AbstractC1130a.m(iVar2, null);
            try {
                return AbstractC1002u1.d0(g02, g02, pVar);
            } finally {
                AbstractC1130a.g(iVar2, m9);
            }
        }
        d8.t tVar2 = new d8.t(dVar, i9);
        AbstractC0485a.z(pVar, tVar2, tVar2);
        do {
            atomicIntegerFieldUpdater = H.f8767e;
            int i10 = atomicIntegerFieldUpdater.get(tVar2);
            if (i10 != 0) {
                if (i10 == 2) {
                    Object A2 = A(tVar2.D());
                    if (A2 instanceof C0476q) {
                        throw ((C0476q) A2).f8842a;
                    }
                    return A2;
                }
                throw new IllegalStateException("Already suspended");
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(tVar2, 0, 1));
        return F7.a.f2587a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:18:0x005d A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /* JADX WARN: Type inference failed for: r9v3, types: [kotlin.jvm.internal.o, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object D(long r6, O7.p r8, G7.c r9) {
        /*
            boolean r0 = r9 instanceof Y7.E0
            if (r0 == 0) goto L13
            r0 = r9
            Y7.E0 r0 = (Y7.E0) r0
            int r1 = r0.f8764t
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f8764t = r1
            goto L18
        L13:
            Y7.E0 r0 = new Y7.E0
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.f8763s
            F7.a r1 = F7.a.f2587a
            int r2 = r0.f8764t
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            kotlin.jvm.internal.o r6 = r0.f8762r
            a.AbstractC0485a.A(r9)     // Catch: Y7.C0 -> L29
            return r9
        L29:
            r7 = move-exception
            goto L57
        L2b:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L33:
            a.AbstractC0485a.A(r9)
            r4 = 0
            int r9 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r9 > 0) goto L3d
            goto L5d
        L3d:
            kotlin.jvm.internal.o r9 = new kotlin.jvm.internal.o
            r9.<init>()
            r0.f8762r = r9     // Catch: Y7.C0 -> L55
            r0.f8764t = r3     // Catch: Y7.C0 -> L55
            Y7.D0 r2 = new Y7.D0     // Catch: Y7.C0 -> L55
            r2.<init>(r6, r0)     // Catch: Y7.C0 -> L55
            r9.f20159a = r2     // Catch: Y7.C0 -> L55
            java.lang.Object r6 = x(r2, r8)     // Catch: Y7.C0 -> L55
            if (r6 != r1) goto L54
            return r1
        L54:
            return r6
        L55:
            r7 = move-exception
            r6 = r9
        L57:
            Y7.D0 r8 = r7.f8759a
            java.lang.Object r6 = r6.f20159a
            if (r8 != r6) goto L5f
        L5d:
            r6 = 0
            return r6
        L5f:
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: Y7.B.D(long, O7.p, G7.c):java.lang.Object");
    }

    public static final d8.e a(E7.i iVar) {
        if (iVar.get(C0463g0.f8811a) == null) {
            iVar = iVar.plus(new k0(null));
        }
        return new d8.e(iVar);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [Y7.z0, Y7.k0] */
    public static z0 b() {
        return new k0(null);
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [Y7.a, Y7.F] */
    public static F c(InterfaceC0484z interfaceC0484z, Z7.d dVar, O7.p pVar, int i9) {
        E7.i iVar = dVar;
        if ((i9 & 1) != 0) {
            iVar = E7.j.f1978a;
        }
        A a5 = A.f8740a;
        ?? abstractC0450a = new AbstractC0450a(s(interfaceC0484z, iVar), true);
        abstractC0450a.c0(a5, abstractC0450a, pVar);
        return abstractC0450a;
    }

    public static void d(d8.e eVar) {
        InterfaceC0465h0 interfaceC0465h0 = (InterfaceC0465h0) eVar.f16976a.get(C0463g0.f8811a);
        if (interfaceC0465h0 != null) {
            interfaceC0465h0.d(null);
        } else {
            throw new IllegalStateException(("Scope cannot be cancelled because it does not have a job: " + eVar).toString());
        }
    }

    public static void e(E7.i iVar) {
        InterfaceC0465h0 interfaceC0465h0 = (InterfaceC0465h0) iVar.get(C0463g0.f8811a);
        if (interfaceC0465h0 != null) {
            Iterator it = interfaceC0465h0.s().iterator();
            while (it.hasNext()) {
                ((InterfaceC0465h0) it.next()).d(null);
            }
        }
    }

    public static final Object f(O7.p pVar, E7.d dVar) {
        d8.t tVar = new d8.t(dVar, dVar.getContext());
        return AbstractC1002u1.d0(tVar, tVar, pVar);
    }

    public static final Object g(long j4, E7.d dVar) {
        A7.n nVar = A7.n.f558a;
        if (j4 > 0) {
            C0464h c0464h = new C0464h(1, D1.A(dVar));
            c0464h.s();
            if (j4 < Long.MAX_VALUE) {
                k(c0464h.f8816e).x(j4, c0464h);
            }
            Object r5 = c0464h.r();
            if (r5 == F7.a.f2587a) {
                return r5;
            }
        }
        return nVar;
    }

    public static final void h(E7.i iVar) {
        InterfaceC0465h0 interfaceC0465h0 = (InterfaceC0465h0) iVar.get(C0463g0.f8811a);
        if (interfaceC0465h0 != null && !interfaceC0465h0.a()) {
            throw interfaceC0465h0.I();
        }
    }

    public static final E7.i i(E7.i iVar, E7.i iVar2, boolean z9) {
        Boolean bool = Boolean.FALSE;
        C0477s c0477s = C0477s.f8851f;
        boolean booleanValue = ((Boolean) iVar.fold(bool, c0477s)).booleanValue();
        boolean booleanValue2 = ((Boolean) iVar2.fold(bool, c0477s)).booleanValue();
        if (!booleanValue && !booleanValue2) {
            return iVar.plus(iVar2);
        }
        E7.j jVar = E7.j.f1978a;
        E7.i iVar3 = (E7.i) iVar.fold(jVar, new C0477s(2, 2));
        Object obj = iVar2;
        if (booleanValue2) {
            obj = iVar2.fold(jVar, C0477s.f8850e);
        }
        return iVar3.plus((E7.i) obj);
    }

    public static final AbstractC0480v j(Executor executor) {
        J j4;
        if (executor instanceof J) {
            j4 = (J) executor;
        } else {
            j4 = null;
        }
        if (j4 != null) {
            return j4.f8770a;
        }
        return new X(executor);
    }

    public static final G k(E7.i iVar) {
        G g9;
        E7.g gVar = iVar.get(E7.e.f1977a);
        if (gVar instanceof G) {
            g9 = (G) gVar;
        } else {
            g9 = null;
        }
        if (g9 == null) {
            return D.f8760a;
        }
        return g9;
    }

    public static final String l(Object obj) {
        return Integer.toHexString(System.identityHashCode(obj));
    }

    public static final InterfaceC0465h0 m(E7.i iVar) {
        InterfaceC0465h0 interfaceC0465h0 = (InterfaceC0465h0) iVar.get(C0463g0.f8811a);
        if (interfaceC0465h0 != null) {
            return interfaceC0465h0;
        }
        throw new IllegalStateException(("Current context doesn't contain Job in it: " + iVar).toString());
    }

    public static final C0464h n(E7.d dVar) {
        C0464h c0464h;
        C0464h c0464h2;
        if (!(dVar instanceof d8.h)) {
            return new C0464h(1, dVar);
        }
        d8.h hVar = (d8.h) dVar;
        loop0: while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = d8.h.f16979h;
            Object obj = atomicReferenceFieldUpdater.get(hVar);
            G6.a aVar = AbstractC1130a.f16969d;
            c0464h = null;
            if (obj == null) {
                atomicReferenceFieldUpdater.set(hVar, aVar);
                c0464h2 = null;
                break;
            }
            if (obj instanceof C0464h) {
                while (!atomicReferenceFieldUpdater.compareAndSet(hVar, obj, aVar)) {
                    if (atomicReferenceFieldUpdater.get(hVar) != obj) {
                        break;
                    }
                }
                c0464h2 = (C0464h) obj;
                break loop0;
            }
            if (obj != aVar && !(obj instanceof Throwable)) {
                throw new IllegalStateException(("Inconsistent state " + obj).toString());
            }
        }
        if (c0464h2 != null) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = C0464h.f8813g;
            Object obj2 = atomicReferenceFieldUpdater2.get(c0464h2);
            if ((obj2 instanceof C0475p) && ((C0475p) obj2).f8835d != null) {
                c0464h2.o();
            } else {
                C0464h.f8812f.set(c0464h2, 536870911);
                atomicReferenceFieldUpdater2.set(c0464h2, C0452b.f8796a);
                c0464h = c0464h2;
            }
            if (c0464h != null) {
                return c0464h;
            }
        }
        return new C0464h(2, dVar);
    }

    public static final void o(E7.i iVar, Throwable th) {
        try {
            InterfaceC0482x interfaceC0482x = (InterfaceC0482x) iVar.get(C0481w.f8860a);
            if (interfaceC0482x != null) {
                interfaceC0482x.handleException(iVar, th);
            } else {
                AbstractC1130a.d(iVar, th);
            }
        } catch (Throwable th2) {
            if (th != th2) {
                RuntimeException runtimeException = new RuntimeException("Exception while trying to handle coroutine exception", th2);
                O4.h.a(runtimeException, th);
                th = runtimeException;
            }
            AbstractC1130a.d(iVar, th);
        }
    }

    public static M p(InterfaceC0465h0 interfaceC0465h0, l0 l0Var, int i9) {
        boolean z9;
        boolean z10 = true;
        if ((i9 & 1) != 0) {
            z9 = false;
        } else {
            z9 = true;
        }
        if ((i9 & 2) == 0) {
            z10 = false;
        }
        if (interfaceC0465h0 instanceof r0) {
            return ((r0) interfaceC0465h0).J(z9, z10, l0Var);
        }
        return interfaceC0465h0.S(z9, z10, new C0142h(1, l0Var, InterfaceC0457d0.class, "invoke", "invoke(Ljava/lang/Throwable;)V", 0, 4));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:13:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object q(java.util.List r4, G7.c r5) {
        /*
            boolean r0 = r5 instanceof Y7.C0454c
            if (r0 == 0) goto L13
            r0 = r5
            Y7.c r0 = (Y7.C0454c) r0
            int r1 = r0.f8800t
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f8800t = r1
            goto L18
        L13:
            Y7.c r0 = new Y7.c
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.f8799s
            F7.a r1 = F7.a.f2587a
            int r2 = r0.f8800t
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            java.util.Iterator r4 = r0.f8798r
            a.AbstractC0485a.A(r5)
            goto L38
        L29:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L31:
            a.AbstractC0485a.A(r5)
            java.util.Iterator r4 = r4.iterator()
        L38:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L4f
            java.lang.Object r5 = r4.next()
            Y7.h0 r5 = (Y7.InterfaceC0465h0) r5
            r0.f8798r = r4
            r0.f8800t = r3
            java.lang.Object r5 = r5.N(r0)
            if (r5 != r1) goto L38
            return r1
        L4f:
            A7.n r4 = A7.n.f558a
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: Y7.B.q(java.util.List, G7.c):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v4, types: [Y7.a, Y7.y0] */
    /* JADX WARN: Type inference failed for: r3v9 */
    public static y0 r(InterfaceC0484z interfaceC0484z, E7.a aVar, O7.p pVar, int i9) {
        ?? r32;
        A a5 = A.f8743d;
        E7.i iVar = aVar;
        if ((i9 & 1) != 0) {
            iVar = E7.j.f1978a;
        }
        if ((i9 & 2) != 0) {
            a5 = A.f8740a;
        }
        E7.i s9 = s(interfaceC0484z, iVar);
        if (a5 == A.f8741b) {
            r32 = new s0(s9, pVar);
        } else {
            r32 = new AbstractC0450a(s9, true);
        }
        r32.c0(a5, r32, pVar);
        return r32;
    }

    public static final E7.i s(InterfaceC0484z interfaceC0484z, E7.i iVar) {
        E7.i i9 = i(interfaceC0484z.g(), iVar, true);
        f8.e eVar = K.f8773a;
        if (i9 != eVar && i9.get(E7.e.f1977a) == null) {
            return i9.plus(eVar);
        }
        return i9;
    }

    public static final Object t(Object obj) {
        if (obj instanceof C0476q) {
            return AbstractC0485a.h(((C0476q) obj).f8842a);
        }
        return obj;
    }

    public static final void u(C0464h c0464h, E7.d dVar, boolean z9) {
        Object h7;
        G0 g02;
        Object obj = C0464h.f8813g.get(c0464h);
        Throwable g9 = c0464h.g(obj);
        if (g9 != null) {
            h7 = AbstractC0485a.h(g9);
        } else {
            h7 = c0464h.h(obj);
        }
        if (z9) {
            kotlin.jvm.internal.h.c(dVar, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<T of kotlinx.coroutines.DispatchedTaskKt.resume>");
            d8.h hVar = (d8.h) dVar;
            G7.c cVar = hVar.f16981e;
            E7.i context = cVar.getContext();
            Object m9 = AbstractC1130a.m(context, hVar.f16983g);
            if (m9 != AbstractC1130a.f16971f) {
                g02 = B(cVar, context, m9);
            } else {
                g02 = null;
            }
            try {
                cVar.resumeWith(h7);
                if (g02 != null && !g02.d0()) {
                    return;
                }
                AbstractC1130a.g(context, m9);
                return;
            } catch (Throwable th) {
                if (g02 == null || g02.d0()) {
                    AbstractC1130a.g(context, m9);
                }
                throw th;
            }
        }
        dVar.resumeWith(h7);
    }

    public static final Object v(E7.i iVar, O7.p pVar) {
        V v8;
        E7.i i9;
        long j4;
        C0476q c0476q;
        Thread currentThread = Thread.currentThread();
        E7.h hVar = E7.e.f1977a;
        E7.f fVar = (E7.f) iVar.get(hVar);
        E7.j jVar = E7.j.f1978a;
        if (fVar == null) {
            v8 = A0.a();
            i9 = i(jVar, iVar.plus(v8), true);
            f8.e eVar = K.f8773a;
            if (i9 != eVar && i9.get(hVar) == null) {
                i9 = i9.plus(eVar);
            }
        } else {
            if (fVar instanceof V) {
            }
            v8 = (V) A0.f8745a.get();
            i9 = i(jVar, iVar, true);
            f8.e eVar2 = K.f8773a;
            if (i9 != eVar2 && i9.get(hVar) == null) {
                i9 = i9.plus(eVar2);
            }
        }
        C0456d c0456d = new C0456d(i9, currentThread, v8);
        c0456d.c0(A.f8740a, c0456d, pVar);
        V v9 = c0456d.f8803e;
        if (v9 != null) {
            int i10 = V.f8788e;
            v9.n0(false);
        }
        while (!Thread.interrupted()) {
            try {
                if (v9 != null) {
                    j4 = v9.o0();
                } else {
                    j4 = Long.MAX_VALUE;
                }
                if (c0456d.D() instanceof InterfaceC0451a0) {
                    LockSupport.parkNanos(c0456d, j4);
                } else {
                    if (v9 != null) {
                        int i11 = V.f8788e;
                        v9.k0(false);
                    }
                    Object A2 = A(c0456d.D());
                    if (A2 instanceof C0476q) {
                        c0476q = (C0476q) A2;
                    } else {
                        c0476q = null;
                    }
                    if (c0476q == null) {
                        return A2;
                    }
                    throw c0476q.f8842a;
                }
            } catch (Throwable th) {
                if (v9 != null) {
                    int i12 = V.f8788e;
                    v9.k0(false);
                }
                throw th;
            }
        }
        InterruptedException interruptedException = new InterruptedException();
        c0456d.p(interruptedException);
        throw interruptedException;
    }

    public static final Object x(D0 d02, O7.p pVar) {
        Object c0476q;
        Object M7;
        p(d02, new N(0, k(d02.f17005d.getContext()).g(d02.f8761e, d02, d02.f8795c)), 3);
        try {
            if (!u0.z.i(pVar)) {
                c0476q = D1.N(pVar, d02, d02);
            } else {
                kotlin.jvm.internal.r.c(2, pVar);
                c0476q = pVar.invoke(d02, d02);
            }
        } catch (Throwable th) {
            c0476q = new C0476q(th, false);
        }
        F7.a aVar = F7.a.f2587a;
        if (c0476q != aVar && (M7 = d02.M(c0476q)) != f8750e) {
            if (M7 instanceof C0476q) {
                Throwable th2 = ((C0476q) M7).f8842a;
                if (th2 instanceof C0) {
                    if (((C0) th2).f8759a == d02) {
                        if (c0476q instanceof C0476q) {
                            throw ((C0476q) c0476q).f8842a;
                        }
                    } else {
                        throw th2;
                    }
                } else {
                    throw th2;
                }
            } else {
                c0476q = A(M7);
            }
            return c0476q;
        }
        return aVar;
    }

    public static final String y(E7.d dVar) {
        Object h7;
        if (dVar instanceof d8.h) {
            return dVar.toString();
        }
        try {
            h7 = dVar + '@' + l(dVar);
        } catch (Throwable th) {
            h7 = AbstractC0485a.h(th);
        }
        if (A7.j.a(h7) != null) {
            h7 = dVar.getClass().getName() + '@' + l(dVar);
        }
        return (String) h7;
    }

    public static final long z(long j4) {
        boolean z9;
        int i9 = X7.a.f8474d;
        boolean z10 = false;
        if (j4 > 0) {
            z9 = true;
        } else {
            z9 = false;
        }
        if (z9) {
            long B9 = Z0.a.B(999999L, X7.c.NANOSECONDS);
            if (X7.a.c(j4)) {
                if (X7.a.c(B9) && (j4 ^ B9) < 0) {
                    throw new IllegalArgumentException("Summing infinite durations of different signs yields an undefined result.");
                }
            } else if (X7.a.c(B9)) {
                j4 = B9;
            } else {
                int i10 = ((int) j4) & 1;
                if (i10 == (((int) B9) & 1)) {
                    long j9 = (j4 >> 1) + (B9 >> 1);
                    if (i10 == 0) {
                        z10 = true;
                    }
                    if (z10) {
                        if (-4611686018426999999L <= j9 && j9 < 4611686018427000000L) {
                            j4 = j9 << 1;
                            int i11 = X7.b.f8476a;
                        } else {
                            j4 = Z0.a.f(j9 / 1000000);
                        }
                    } else if (-4611686018426L <= j9 && j9 < 4611686018427L) {
                        j4 = (j9 * 1000000) << 1;
                        int i12 = X7.b.f8476a;
                    } else {
                        j4 = Z0.a.f(B6.u0.l(j9, -4611686018427387903L, 4611686018427387903L));
                    }
                } else if (i10 == 1) {
                    j4 = X7.a.a(j4 >> 1, B9 >> 1);
                } else {
                    j4 = X7.a.a(B9 >> 1, j4 >> 1);
                }
            }
            if ((((int) j4) & 1) == 1 && !X7.a.c(j4)) {
                return j4 >> 1;
            }
            return X7.a.d(j4, X7.c.MILLISECONDS);
        }
        if (!z9) {
            return 0L;
        }
        throw new RuntimeException();
    }
}
