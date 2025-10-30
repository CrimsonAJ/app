package Y7;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;

/* loaded from: classes.dex */
public abstract class U extends V implements G {

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f8785f = AtomicReferenceFieldUpdater.newUpdater(U.class, Object.class, "_queue$volatile");

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f8786g = AtomicReferenceFieldUpdater.newUpdater(U.class, Object.class, "_delayed$volatile");

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f8787h = AtomicIntegerFieldUpdater.newUpdater(U.class, "_isCompleted$volatile");
    private volatile /* synthetic */ Object _delayed$volatile;
    private volatile /* synthetic */ int _isCompleted$volatile = 0;
    private volatile /* synthetic */ Object _queue$volatile;

    public M g(long j, D0 d02, E7.i iVar) {
        return D.f8760a.g(j, d02, iVar);
    }

    @Override // Y7.AbstractC0480v
    public final void g0(E7.i iVar, Runnable runnable) {
        r0(runnable);
    }

    /* JADX WARN: Code restructure failed: missing block: B:67:0x00cf, code lost:
    
        if (r4 == false) goto L88;
     */
    @Override // Y7.V
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long o0() {
        /*
            Method dump skipped, instructions count: 254
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Y7.U.o0():long");
    }

    public void r0(Runnable runnable) {
        if (s0(runnable)) {
            Thread m02 = m0();
            if (Thread.currentThread() != m02) {
                LockSupport.unpark(m02);
                return;
            }
            return;
        }
        C.f8758i.r0(runnable);
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0067, code lost:
    
        return true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean s0(java.lang.Runnable r7) {
        /*
            r6 = this;
        L0:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = Y7.U.f8785f
            java.lang.Object r1 = r0.get(r6)
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r2 = Y7.U.f8787h
            int r2 = r2.get(r6)
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L12
            r2 = r4
            goto L13
        L12:
            r2 = r3
        L13:
            if (r2 == 0) goto L16
            goto L50
        L16:
            if (r1 != 0) goto L27
        L18:
            r1 = 0
            boolean r1 = r0.compareAndSet(r6, r1, r7)
            if (r1 == 0) goto L20
            goto L67
        L20:
            java.lang.Object r1 = r0.get(r6)
            if (r1 == 0) goto L18
            goto L0
        L27:
            boolean r2 = r1 instanceof d8.n
            if (r2 == 0) goto L4c
            r2 = r1
            d8.n r2 = (d8.n) r2
            int r5 = r2.a(r7)
            if (r5 == 0) goto L67
            if (r5 == r4) goto L3a
            r0 = 2
            if (r5 == r0) goto L50
            goto L0
        L3a:
            d8.n r2 = r2.c()
        L3e:
            boolean r3 = r0.compareAndSet(r6, r1, r2)
            if (r3 == 0) goto L45
            goto L0
        L45:
            java.lang.Object r3 = r0.get(r6)
            if (r3 == r1) goto L3e
            goto L0
        L4c:
            G6.a r2 = Y7.B.f8748c
            if (r1 != r2) goto L51
        L50:
            return r3
        L51:
            d8.n r2 = new d8.n
            r3 = 8
            r2.<init>(r3, r4)
            r3 = r1
            java.lang.Runnable r3 = (java.lang.Runnable) r3
            r2.a(r3)
            r2.a(r7)
        L61:
            boolean r3 = r0.compareAndSet(r6, r1, r2)
            if (r3 == 0) goto L68
        L67:
            return r4
        L68:
            java.lang.Object r3 = r0.get(r6)
            if (r3 == r1) goto L61
            goto L0
        */
        throw new UnsupportedOperationException("Method not decompiled: Y7.U.s0(java.lang.Runnable):boolean");
    }

    @Override // Y7.V
    public void shutdown() {
        S s9;
        A0.f8745a.set(null);
        f8787h.set(this, 1);
        loop0: while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f8785f;
            Object obj = atomicReferenceFieldUpdater.get(this);
            G6.a aVar = B.f8748c;
            if (obj == null) {
                while (!atomicReferenceFieldUpdater.compareAndSet(this, null, aVar)) {
                    if (atomicReferenceFieldUpdater.get(this) != null) {
                        break;
                    }
                }
                break loop0;
            } else {
                if (obj instanceof d8.n) {
                    ((d8.n) obj).b();
                    break;
                }
                if (obj != aVar) {
                    d8.n nVar = new d8.n(8, true);
                    nVar.a((Runnable) obj);
                    while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, nVar)) {
                        if (atomicReferenceFieldUpdater.get(this) != obj) {
                            break;
                        }
                    }
                    break loop0;
                }
                break;
            }
        }
        do {
        } while (o0() <= 0);
        long nanoTime = System.nanoTime();
        while (true) {
            T t7 = (T) f8786g.get(this);
            if (t7 != null) {
                synchronized (t7) {
                    if (d8.A.f16960b.get(t7) > 0) {
                        s9 = t7.d(0);
                    } else {
                        s9 = null;
                    }
                }
                if (s9 != null) {
                    q0(nanoTime, s9);
                } else {
                    return;
                }
            } else {
                return;
            }
        }
    }

    public final boolean t0() {
        boolean z9;
        T t7;
        B7.i iVar = this.f8791d;
        if (iVar != null) {
            z9 = iVar.isEmpty();
        } else {
            z9 = true;
        }
        if (!z9 || ((t7 = (T) f8786g.get(this)) != null && d8.A.f16960b.get(t7) != 0)) {
            return false;
        }
        Object obj = f8785f.get(this);
        if (obj != null) {
            if (obj instanceof d8.n) {
                long j = d8.n.f16997f.get((d8.n) obj);
                if (((int) (1073741823 & j)) == ((int) ((j & 1152921503533105152L) >> 30))) {
                    return true;
                }
                return false;
            }
            if (obj != B.f8748c) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, Y7.T] */
    public final void u0(long j, S s9) {
        boolean z9;
        int d9;
        Thread m02;
        if (f8787h.get(this) != 0) {
            z9 = true;
        } else {
            z9 = false;
        }
        S s10 = null;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f8786g;
        if (z9) {
            d9 = 1;
        } else {
            T t7 = (T) atomicReferenceFieldUpdater.get(this);
            if (t7 == null) {
                ?? obj = new Object();
                obj.f8784c = j;
                while (!atomicReferenceFieldUpdater.compareAndSet(this, null, obj) && atomicReferenceFieldUpdater.get(this) == null) {
                }
                Object obj2 = atomicReferenceFieldUpdater.get(this);
                kotlin.jvm.internal.h.b(obj2);
                t7 = (T) obj2;
            }
            d9 = s9.d(j, t7, this);
        }
        if (d9 != 0) {
            if (d9 != 1) {
                if (d9 != 2) {
                    throw new IllegalStateException("unexpected result");
                }
                return;
            } else {
                q0(j, s9);
                return;
            }
        }
        T t9 = (T) atomicReferenceFieldUpdater.get(this);
        if (t9 != null) {
            s10 = t9.b();
        }
        if (s10 == s9 && Thread.currentThread() != (m02 = m0())) {
            LockSupport.unpark(m02);
        }
    }

    @Override // Y7.G
    public final void x(long j, C0464h c0464h) {
        long j4 = 0;
        if (j > 0) {
            if (j >= 9223372036854L) {
                j4 = Long.MAX_VALUE;
            } else {
                j4 = 1000000 * j;
            }
        }
        if (j4 < 4611686018427387903L) {
            long nanoTime = System.nanoTime();
            P p9 = new P(this, j4 + nanoTime, c0464h);
            u0(nanoTime, p9);
            c0464h.v(new C0460f(2, p9));
        }
    }
}
