package a8;

import Y7.C0464h;
import Y7.I0;
import Y7.InterfaceC0462g;
import a.AbstractC0485a;
import com.google.android.gms.internal.measurement.D1;
import d8.AbstractC1130a;
import java.util.NoSuchElementException;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes.dex */
public class e implements i {

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ AtomicLongFieldUpdater f9197b = AtomicLongFieldUpdater.newUpdater(e.class, "sendersAndCloseStatus$volatile");

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ AtomicLongFieldUpdater f9198c = AtomicLongFieldUpdater.newUpdater(e.class, "receivers$volatile");

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ AtomicLongFieldUpdater f9199d = AtomicLongFieldUpdater.newUpdater(e.class, "bufferEnd$volatile");

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ AtomicLongFieldUpdater f9200e = AtomicLongFieldUpdater.newUpdater(e.class, "completedExpandBuffersAndPauseFlag$volatile");

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f9201f = AtomicReferenceFieldUpdater.newUpdater(e.class, Object.class, "sendSegment$volatile");

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f9202g = AtomicReferenceFieldUpdater.newUpdater(e.class, Object.class, "receiveSegment$volatile");

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f9203h = AtomicReferenceFieldUpdater.newUpdater(e.class, Object.class, "bufferEndSegment$volatile");

    /* renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f9204i = AtomicReferenceFieldUpdater.newUpdater(e.class, Object.class, "_closeCause$volatile");
    public static final /* synthetic */ AtomicReferenceFieldUpdater j = AtomicReferenceFieldUpdater.newUpdater(e.class, Object.class, "closeHandler$volatile");
    private volatile /* synthetic */ Object _closeCause$volatile;

    /* renamed from: a, reason: collision with root package name */
    public final int f9205a;
    private volatile /* synthetic */ long bufferEnd$volatile;
    private volatile /* synthetic */ Object bufferEndSegment$volatile;
    private volatile /* synthetic */ Object closeHandler$volatile;
    private volatile /* synthetic */ long completedExpandBuffersAndPauseFlag$volatile;
    private volatile /* synthetic */ Object receiveSegment$volatile;
    private volatile /* synthetic */ long receivers$volatile;
    private volatile /* synthetic */ Object sendSegment$volatile;
    private volatile /* synthetic */ long sendersAndCloseStatus$volatile;

    public e(int i9) {
        long j4;
        this.f9205a = i9;
        if (i9 >= 0) {
            m mVar = g.f9207a;
            if (i9 != 0) {
                if (i9 != Integer.MAX_VALUE) {
                    j4 = i9;
                } else {
                    j4 = Long.MAX_VALUE;
                }
            } else {
                j4 = 0;
            }
            this.bufferEnd$volatile = j4;
            this.completedExpandBuffersAndPauseFlag$volatile = f9199d.get(this);
            m mVar2 = new m(0L, null, this, 3);
            this.sendSegment$volatile = mVar2;
            this.receiveSegment$volatile = mVar2;
            if (x()) {
                mVar2 = g.f9207a;
                kotlin.jvm.internal.h.c(mVar2, "null cannot be cast to non-null type kotlinx.coroutines.channels.ChannelSegment<E of kotlinx.coroutines.channels.BufferedChannel>");
            }
            this.bufferEndSegment$volatile = mVar2;
            this._closeCause$volatile = g.f9224s;
            return;
        }
        throw new IllegalArgumentException(A0.a.m("Invalid channel capacity: ", i9, ", should be >=0").toString());
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Object A(a8.e r13, G7.c r14) {
        /*
            boolean r0 = r14 instanceof a8.C0511c
            if (r0 == 0) goto L14
            r0 = r14
            a8.c r0 = (a8.C0511c) r0
            int r1 = r0.f9193t
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.f9193t = r1
        L12:
            r6 = r0
            goto L1a
        L14:
            a8.c r0 = new a8.c
            r0.<init>(r13, r14)
            goto L12
        L1a:
            java.lang.Object r14 = r6.f9191r
            F7.a r0 = F7.a.f2587a
            int r1 = r6.f9193t
            r2 = 1
            if (r1 == 0) goto L35
            if (r1 != r2) goto L2d
            a.AbstractC0485a.A(r14)
            a8.l r14 = (a8.l) r14
            java.lang.Object r13 = r14.f9230a
            return r13
        L2d:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r14 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r14)
            throw r13
        L35:
            a.AbstractC0485a.A(r14)
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r14 = a8.e.f9202g
            java.lang.Object r14 = r14.get(r13)
            a8.m r14 = (a8.m) r14
        L40:
            boolean r1 = r13.v()
            if (r1 == 0) goto L50
            java.lang.Throwable r13 = r13.p()
            a8.j r14 = new a8.j
            r14.<init>(r13)
            return r14
        L50:
            java.util.concurrent.atomic.AtomicLongFieldUpdater r1 = a8.e.f9198c
            long r4 = r1.getAndIncrement(r13)
            int r1 = a8.g.f9208b
            long r7 = (long) r1
            long r9 = r4 / r7
            long r7 = r4 % r7
            int r3 = (int) r7
            long r7 = r14.f17007c
            int r1 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r1 == 0) goto L6d
            a8.m r1 = r13.o(r9, r14)
            if (r1 != 0) goto L6b
            goto L40
        L6b:
            r8 = r1
            goto L6e
        L6d:
            r8 = r14
        L6e:
            r12 = 0
            r7 = r13
            r9 = r3
            r10 = r4
            java.lang.Object r13 = r7.F(r8, r9, r10, r12)
            r1 = r7
            G6.a r14 = a8.g.f9218m
            if (r13 == r14) goto La0
            G6.a r14 = a8.g.f9220o
            if (r13 != r14) goto L8d
            long r13 = r1.s()
            int r13 = (r4 > r13 ? 1 : (r4 == r13 ? 0 : -1))
            if (r13 >= 0) goto L8a
            r8.a()
        L8a:
            r13 = r1
            r14 = r8
            goto L40
        L8d:
            G6.a r14 = a8.g.f9219n
            if (r13 != r14) goto L9c
            r6.f9193t = r2
            r2 = r8
            java.lang.Object r13 = r1.B(r2, r3, r4, r6)
            if (r13 != r0) goto L9b
            return r0
        L9b:
            return r13
        L9c:
            r8.a()
            return r13
        La0:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r14 = "unexpected"
            r13.<init>(r14)
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: a8.e.A(a8.e, G7.c):java.lang.Object");
    }

    public static boolean E(Object obj) {
        if (obj instanceof InterfaceC0462g) {
            kotlin.jvm.internal.h.c(obj, "null cannot be cast to non-null type kotlinx.coroutines.CancellableContinuation<kotlin.Unit>");
            return g.a((InterfaceC0462g) obj, A7.n.f558a, null);
        }
        throw new IllegalStateException(("Unexpected waiter: " + obj).toString());
    }

    public static final m a(e eVar, long j4, m mVar) {
        Object b9;
        e eVar2;
        eVar.getClass();
        m mVar2 = g.f9207a;
        f fVar = f.f9206a;
        loop0: while (true) {
            b9 = AbstractC1130a.b(mVar, j4, fVar);
            if (!AbstractC1130a.e(b9)) {
                d8.u c3 = AbstractC1130a.c(b9);
                while (true) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f9201f;
                    d8.u uVar = (d8.u) atomicReferenceFieldUpdater.get(eVar);
                    if (uVar.f17007c >= c3.f17007c) {
                        break loop0;
                    }
                    if (!c3.i()) {
                        break;
                    }
                    while (!atomicReferenceFieldUpdater.compareAndSet(eVar, uVar, c3)) {
                        if (atomicReferenceFieldUpdater.get(eVar) != uVar) {
                            if (c3.e()) {
                                c3.d();
                            }
                        }
                    }
                    if (uVar.e()) {
                        uVar.d();
                    }
                }
            } else {
                break;
            }
        }
        boolean e8 = AbstractC1130a.e(b9);
        AtomicLongFieldUpdater atomicLongFieldUpdater = f9198c;
        if (e8) {
            eVar.l();
            if (mVar.f17007c * g.f9208b < atomicLongFieldUpdater.get(eVar)) {
                mVar.a();
                return null;
            }
        } else {
            m mVar3 = (m) AbstractC1130a.c(b9);
            long j9 = mVar3.f17007c;
            if (j9 > j4) {
                long j10 = g.f9208b * j9;
                while (true) {
                    AtomicLongFieldUpdater atomicLongFieldUpdater2 = f9197b;
                    long j11 = atomicLongFieldUpdater2.get(eVar);
                    long j12 = 1152921504606846975L & j11;
                    if (j12 >= j10) {
                        eVar2 = eVar;
                        break;
                    }
                    eVar2 = eVar;
                    if (atomicLongFieldUpdater2.compareAndSet(eVar2, j11, j12 + (((int) (j11 >> 60)) << 60))) {
                        break;
                    }
                    eVar = eVar2;
                }
                if (j9 * g.f9208b < atomicLongFieldUpdater.get(eVar2)) {
                    mVar3.a();
                }
            } else {
                return mVar3;
            }
        }
        return null;
    }

    public static final void b(e eVar, Object obj, C0464h c0464h) {
        eVar.getClass();
        c0464h.resumeWith(AbstractC0485a.h(eVar.r()));
    }

    public static final int c(e eVar, m mVar, int i9, Object obj, long j4, Object obj2, boolean z9) {
        eVar.getClass();
        mVar.m(i9, obj);
        if (z9) {
            return eVar.G(mVar, i9, obj, j4, obj2, z9);
        }
        Object k5 = mVar.k(i9);
        if (k5 == null) {
            if (eVar.e(j4)) {
                if (mVar.j(null, i9, g.f9210d)) {
                    return 1;
                }
            } else {
                if (obj2 == null) {
                    return 3;
                }
                if (mVar.j(null, i9, obj2)) {
                    return 2;
                }
            }
        } else if (k5 instanceof I0) {
            mVar.m(i9, null);
            if (eVar.D(k5, obj)) {
                mVar.n(i9, g.f9215i);
                return 0;
            }
            G6.a aVar = g.f9216k;
            if (mVar.f9232f.getAndSet((i9 * 2) + 1, aVar) != aVar) {
                mVar.l(i9, true);
                return 5;
            }
            return 5;
        }
        return eVar.G(mVar, i9, obj, j4, obj2, z9);
    }

    public static void t(e eVar) {
        eVar.getClass();
        AtomicLongFieldUpdater atomicLongFieldUpdater = f9200e;
        if ((atomicLongFieldUpdater.addAndGet(eVar, 1L) & 4611686018427387904L) == 0) {
            return;
        }
        do {
        } while ((atomicLongFieldUpdater.get(eVar) & 4611686018427387904L) != 0);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object B(a8.m r15, int r16, long r17, G7.c r19) {
        /*
            Method dump skipped, instructions count: 256
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a8.e.B(a8.m, int, long, G7.c):java.lang.Object");
    }

    public final void C(I0 i02, boolean z9) {
        Throwable r5;
        if (i02 instanceof InterfaceC0462g) {
            E7.d dVar = (E7.d) i02;
            if (z9) {
                r5 = q();
            } else {
                r5 = r();
            }
            dVar.resumeWith(AbstractC0485a.h(r5));
            return;
        }
        if (i02 instanceof s) {
            ((s) i02).f9236a.resumeWith(new l(new j(p())));
            return;
        }
        if (i02 instanceof C0510b) {
            C0510b c0510b = (C0510b) i02;
            C0464h c0464h = c0510b.f9189b;
            kotlin.jvm.internal.h.b(c0464h);
            c0510b.f9189b = null;
            c0510b.f9188a = g.f9217l;
            Throwable p9 = c0510b.f9190c.p();
            if (p9 == null) {
                c0464h.resumeWith(Boolean.FALSE);
                return;
            } else {
                c0464h.resumeWith(AbstractC0485a.h(p9));
                return;
            }
        }
        throw new IllegalStateException(("Unexpected waiter: " + i02).toString());
    }

    public final boolean D(Object obj, Object obj2) {
        if (obj instanceof s) {
            kotlin.jvm.internal.h.c(obj, "null cannot be cast to non-null type kotlinx.coroutines.channels.ReceiveCatching<E of kotlinx.coroutines.channels.BufferedChannel>");
            return g.a(((s) obj).f9236a, new l(obj2), null);
        }
        if (obj instanceof C0510b) {
            kotlin.jvm.internal.h.c(obj, "null cannot be cast to non-null type kotlinx.coroutines.channels.BufferedChannel.BufferedChannelIterator<E of kotlinx.coroutines.channels.BufferedChannel>");
            C0510b c0510b = (C0510b) obj;
            C0464h c0464h = c0510b.f9189b;
            kotlin.jvm.internal.h.b(c0464h);
            c0510b.f9189b = null;
            c0510b.f9188a = obj2;
            Boolean bool = Boolean.TRUE;
            c0510b.f9190c.getClass();
            return g.a(c0464h, bool, null);
        }
        if (obj instanceof InterfaceC0462g) {
            kotlin.jvm.internal.h.c(obj, "null cannot be cast to non-null type kotlinx.coroutines.CancellableContinuation<E of kotlinx.coroutines.channels.BufferedChannel>");
            return g.a((InterfaceC0462g) obj, obj2, null);
        }
        throw new IllegalStateException(("Unexpected receiver type: " + obj).toString());
    }

    public final Object F(m mVar, int i9, long j4, Object obj) {
        Object k5 = mVar.k(i9);
        AtomicReferenceArray atomicReferenceArray = mVar.f9232f;
        AtomicLongFieldUpdater atomicLongFieldUpdater = f9197b;
        if (k5 == null) {
            if (j4 >= (atomicLongFieldUpdater.get(this) & 1152921504606846975L)) {
                if (obj == null) {
                    return g.f9219n;
                }
                if (mVar.j(k5, i9, obj)) {
                    n();
                    return g.f9218m;
                }
            }
        } else if (k5 == g.f9210d && mVar.j(k5, i9, g.f9215i)) {
            n();
            Object obj2 = atomicReferenceArray.get(i9 * 2);
            mVar.m(i9, null);
            return obj2;
        }
        while (true) {
            Object k9 = mVar.k(i9);
            if (k9 != null && k9 != g.f9211e) {
                if (k9 == g.f9210d) {
                    if (mVar.j(k9, i9, g.f9215i)) {
                        n();
                        Object obj3 = atomicReferenceArray.get(i9 * 2);
                        mVar.m(i9, null);
                        return obj3;
                    }
                } else {
                    G6.a aVar = g.j;
                    if (k9 == aVar) {
                        return g.f9220o;
                    }
                    if (k9 == g.f9214h) {
                        return g.f9220o;
                    }
                    if (k9 == g.f9217l) {
                        n();
                        return g.f9220o;
                    }
                    if (k9 != g.f9213g && mVar.j(k9, i9, g.f9212f)) {
                        boolean z9 = k9 instanceof v;
                        if (z9) {
                            k9 = ((v) k9).f9237a;
                        }
                        if (E(k9)) {
                            mVar.n(i9, g.f9215i);
                            n();
                            Object obj4 = atomicReferenceArray.get(i9 * 2);
                            mVar.m(i9, null);
                            return obj4;
                        }
                        mVar.n(i9, aVar);
                        mVar.h();
                        if (z9) {
                            n();
                        }
                        return g.f9220o;
                    }
                }
            } else if (j4 < (atomicLongFieldUpdater.get(this) & 1152921504606846975L)) {
                if (mVar.j(k9, i9, g.f9214h)) {
                    n();
                    return g.f9220o;
                }
            } else {
                if (obj == null) {
                    return g.f9219n;
                }
                if (mVar.j(k9, i9, obj)) {
                    n();
                    return g.f9218m;
                }
            }
        }
    }

    public final int G(m mVar, int i9, Object obj, long j4, Object obj2, boolean z9) {
        while (true) {
            Object k5 = mVar.k(i9);
            if (k5 == null) {
                if (e(j4) && !z9) {
                    if (mVar.j(null, i9, g.f9210d)) {
                        break;
                    }
                } else if (z9) {
                    if (mVar.j(null, i9, g.j)) {
                        mVar.h();
                        return 4;
                    }
                } else {
                    if (obj2 == null) {
                        return 3;
                    }
                    if (mVar.j(null, i9, obj2)) {
                        return 2;
                    }
                }
            } else if (k5 == g.f9211e) {
                if (mVar.j(k5, i9, g.f9210d)) {
                    break;
                }
            } else {
                G6.a aVar = g.f9216k;
                if (k5 == aVar) {
                    mVar.m(i9, null);
                    return 5;
                }
                if (k5 == g.f9214h) {
                    mVar.m(i9, null);
                    return 5;
                }
                if (k5 == g.f9217l) {
                    mVar.m(i9, null);
                    l();
                    return 4;
                }
                mVar.m(i9, null);
                if (k5 instanceof v) {
                    k5 = ((v) k5).f9237a;
                }
                if (D(k5, obj)) {
                    mVar.n(i9, g.f9215i);
                    return 0;
                }
                if (mVar.f9232f.getAndSet((i9 * 2) + 1, aVar) != aVar) {
                    mVar.l(i9, true);
                }
                return 5;
            }
        }
        return 1;
    }

    public final void H(long j4) {
        AtomicLongFieldUpdater atomicLongFieldUpdater;
        boolean z9;
        e eVar = this;
        if (!eVar.x()) {
            while (true) {
                atomicLongFieldUpdater = f9199d;
                if (atomicLongFieldUpdater.get(eVar) > j4) {
                    break;
                } else {
                    eVar = this;
                }
            }
            int i9 = g.f9209c;
            int i10 = 0;
            while (true) {
                AtomicLongFieldUpdater atomicLongFieldUpdater2 = f9200e;
                if (i10 < i9) {
                    long j9 = atomicLongFieldUpdater.get(eVar);
                    if (j9 != (4611686018427387903L & atomicLongFieldUpdater2.get(eVar)) || j9 != atomicLongFieldUpdater.get(eVar)) {
                        i10++;
                    } else {
                        return;
                    }
                } else {
                    while (true) {
                        long j10 = atomicLongFieldUpdater2.get(eVar);
                        if (atomicLongFieldUpdater2.compareAndSet(eVar, j10, (j10 & 4611686018427387903L) + 4611686018427387904L)) {
                            break;
                        } else {
                            eVar = this;
                        }
                    }
                    while (true) {
                        long j11 = atomicLongFieldUpdater.get(eVar);
                        long j12 = atomicLongFieldUpdater2.get(eVar);
                        long j13 = j12 & 4611686018427387903L;
                        if ((j12 & 4611686018427387904L) != 0) {
                            z9 = true;
                        } else {
                            z9 = false;
                        }
                        if (j11 == j13 && j11 == atomicLongFieldUpdater.get(eVar)) {
                            break;
                        }
                        if (!z9) {
                            atomicLongFieldUpdater2.compareAndSet(this, j12, 4611686018427387904L + j13);
                        }
                        eVar = this;
                    }
                    while (true) {
                        long j14 = atomicLongFieldUpdater2.get(eVar);
                        if (atomicLongFieldUpdater2.compareAndSet(eVar, j14, j14 & 4611686018427387903L)) {
                            return;
                        } else {
                            eVar = this;
                        }
                    }
                }
            }
        }
    }

    @Override // a8.t
    public final void d(CancellationException cancellationException) {
        if (cancellationException == null) {
            cancellationException = new CancellationException("Channel was cancelled");
        }
        g(cancellationException, true);
    }

    public final boolean e(long j4) {
        if (j4 >= f9199d.get(this) && j4 >= f9198c.get(this) + this.f9205a) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x0178, code lost:
    
        return r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x00c2, code lost:
    
        b(r1, r4, r7);
     */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0161  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0164 A[RETURN] */
    @Override // a8.u
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object f(E7.d r23, java.lang.Object r24) {
        /*
            Method dump skipped, instructions count: 382
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a8.e.f(E7.d, java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x002d, code lost:
    
        if (r6.compareAndSet(r12, r5, r13) == false) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0035, code lost:
    
        if (r6.get(r12) == r5) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0037, code lost:
    
        r10 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x003a, code lost:
    
        if (r14 == false) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x003c, code lost:
    
        r5 = r3.get(r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0049, code lost:
    
        if (r3.compareAndSet(r4, r5, (3 << 60) + (r5 & 1152921504606846975L)) == false) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0069, code lost:
    
        l();
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x006c, code lost:
    
        if (r10 == false) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x006e, code lost:
    
        r13 = a8.e.j;
        r14 = r13.get(r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0074, code lost:
    
        if (r14 != null) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0076, code lost:
    
        r0 = a8.g.f9222q;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x007f, code lost:
    
        if (r13.compareAndSet(r12, r14, r0) == false) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0095, code lost:
    
        if (r13.get(r12) == r14) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:2:0x000a, code lost:
    
        if (r14 != false) goto L4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0081, code lost:
    
        if (r14 != null) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0084, code lost:
    
        kotlin.jvm.internal.r.c(1, r14);
        ((O7.l) r14).invoke(p());
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0090, code lost:
    
        return r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0079, code lost:
    
        r0 = a8.g.f9223r;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0098, code lost:
    
        return r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:3:0x000c, code lost:
    
        r5 = r3.get(r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x004c, code lost:
    
        r5 = r3.get(r12);
        r13 = (int) (r5 >> 60);
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0053, code lost:
    
        if (r13 == 0) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0055, code lost:
    
        if (r13 == 1) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0058, code lost:
    
        r13 = r5 & 1152921504606846975L;
        r7 = 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0067, code lost:
    
        if (r3.compareAndSet(r4, r5, (r7 << 60) + r13) == false) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x0013, code lost:
    
        if (((int) (r5 >> 60)) != 0) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x005e, code lost:
    
        r13 = r5 & 1152921504606846975L;
        r7 = 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x002f, code lost:
    
        r10 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0024, code lost:
    
        r4 = r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0015, code lost:
    
        r4 = a8.g.f9207a;
        r4 = r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0021, code lost:
    
        if (r3.compareAndSet(r4, r5, (r5 & 1152921504606846975L) + (1 << 60)) == false) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0025, code lost:
    
        r5 = a8.g.f9224s;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0027, code lost:
    
        r6 = a8.e.f9204i;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean g(java.lang.Throwable r13, boolean r14) {
        /*
            r12 = this;
            r0 = 60
            r1 = 1152921504606846975(0xfffffffffffffff, double:1.2882297539194265E-231)
            java.util.concurrent.atomic.AtomicLongFieldUpdater r3 = a8.e.f9197b
            r9 = 1
            if (r14 == 0) goto L24
        Lc:
            long r5 = r3.get(r12)
            long r7 = r5 >> r0
            int r4 = (int) r7
            if (r4 != 0) goto L24
            long r7 = r5 & r1
            a8.m r4 = a8.g.f9207a
            long r10 = (long) r9
            long r10 = r10 << r0
            long r7 = r7 + r10
            r4 = r12
            boolean r5 = r3.compareAndSet(r4, r5, r7)
            if (r5 == 0) goto Lc
            goto L25
        L24:
            r4 = r12
        L25:
            G6.a r5 = a8.g.f9224s
        L27:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r6 = a8.e.f9204i
            boolean r7 = r6.compareAndSet(r12, r5, r13)
            if (r7 == 0) goto L31
            r10 = r9
            goto L39
        L31:
            java.lang.Object r6 = r6.get(r12)
            if (r6 == r5) goto L27
            r13 = 0
            r10 = r13
        L39:
            r11 = 3
            if (r14 == 0) goto L4c
        L3c:
            long r5 = r3.get(r12)
            long r13 = r5 & r1
            long r7 = (long) r11
            long r7 = r7 << r0
            long r7 = r7 + r13
            boolean r13 = r3.compareAndSet(r4, r5, r7)
            if (r13 == 0) goto L3c
            goto L69
        L4c:
            long r5 = r3.get(r12)
            long r13 = r5 >> r0
            int r13 = (int) r13
            if (r13 == 0) goto L5e
            if (r13 == r9) goto L58
            goto L69
        L58:
            long r13 = r5 & r1
            long r7 = (long) r11
        L5b:
            long r7 = r7 << r0
            long r7 = r7 + r13
            goto L63
        L5e:
            long r13 = r5 & r1
            r7 = 2
            long r7 = (long) r7
            goto L5b
        L63:
            boolean r13 = r3.compareAndSet(r4, r5, r7)
            if (r13 == 0) goto L4c
        L69:
            r12.l()
            if (r10 == 0) goto L98
        L6e:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r13 = a8.e.j
            java.lang.Object r14 = r13.get(r12)
            if (r14 != 0) goto L79
            G6.a r0 = a8.g.f9222q
            goto L7b
        L79:
            G6.a r0 = a8.g.f9223r
        L7b:
            boolean r1 = r13.compareAndSet(r12, r14, r0)
            if (r1 == 0) goto L91
            if (r14 != 0) goto L84
            goto L98
        L84:
            kotlin.jvm.internal.r.c(r9, r14)
            O7.l r14 = (O7.l) r14
            java.lang.Throwable r13 = r12.p()
            r14.invoke(r13)
            return r10
        L91:
            java.lang.Object r1 = r13.get(r12)
            if (r1 == r14) goto L7b
            goto L6e
        L98:
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: a8.e.g(java.lang.Throwable, boolean):boolean");
    }

    @Override // a8.t
    public final Object h() {
        m mVar;
        I0 i02;
        AtomicLongFieldUpdater atomicLongFieldUpdater = f9198c;
        long j4 = atomicLongFieldUpdater.get(this);
        long j9 = f9197b.get(this);
        if (u(j9, true)) {
            return new j(p());
        }
        long j10 = j9 & 1152921504606846975L;
        k kVar = l.f9229b;
        if (j4 >= j10) {
            return kVar;
        }
        Object obj = g.f9216k;
        m mVar2 = (m) f9202g.get(this);
        while (!v()) {
            long andIncrement = atomicLongFieldUpdater.getAndIncrement(this);
            long j11 = g.f9208b;
            long j12 = andIncrement / j11;
            int i9 = (int) (andIncrement % j11);
            if (mVar2.f17007c != j12) {
                m o9 = o(j12, mVar2);
                if (o9 == null) {
                    continue;
                } else {
                    mVar = o9;
                }
            } else {
                mVar = mVar2;
            }
            Object F2 = F(mVar, i9, andIncrement, obj);
            m mVar3 = mVar;
            if (F2 == g.f9218m) {
                if (obj instanceof I0) {
                    i02 = (I0) obj;
                } else {
                    i02 = null;
                }
                if (i02 != null) {
                    i02.a(mVar3, i9);
                }
                H(andIncrement);
                mVar3.h();
                return kVar;
            }
            if (F2 == g.f9220o) {
                if (andIncrement < s()) {
                    mVar3.a();
                }
                mVar2 = mVar3;
            } else {
                if (F2 != g.f9219n) {
                    mVar3.a();
                    return F2;
                }
                throw new IllegalStateException("unexpected");
            }
        }
        return new j(p());
    }

    @Override // a8.t
    public final Object i(c8.s sVar) {
        return A(this, sVar);
    }

    @Override // a8.u
    public Object j(Object obj) {
        boolean z9;
        I0 i02;
        AtomicLongFieldUpdater atomicLongFieldUpdater = f9197b;
        long j4 = atomicLongFieldUpdater.get(this);
        boolean z10 = false;
        long j9 = 1152921504606846975L;
        if (u(j4, false)) {
            z9 = false;
        } else {
            z9 = !e(j4 & 1152921504606846975L);
        }
        k kVar = l.f9229b;
        if (z9) {
            return kVar;
        }
        Q0.f fVar = g.j;
        m mVar = (m) f9201f.get(this);
        while (true) {
            long andIncrement = atomicLongFieldUpdater.getAndIncrement(this);
            long j10 = andIncrement & j9;
            boolean u9 = u(andIncrement, z10);
            int i9 = g.f9208b;
            long j11 = i9;
            long j12 = j10 / j11;
            int i10 = (int) (j10 % j11);
            if (mVar.f17007c != j12) {
                m a5 = a(this, j12, mVar);
                if (a5 == null) {
                    if (u9) {
                        return new j(r());
                    }
                    z10 = false;
                    j9 = 1152921504606846975L;
                } else {
                    mVar = a5;
                }
            }
            int c3 = c(this, mVar, i10, obj, j10, fVar, u9);
            A7.n nVar = A7.n.f558a;
            if (c3 != 0) {
                if (c3 != 1) {
                    if (c3 != 2) {
                        if (c3 != 3) {
                            if (c3 != 4) {
                                if (c3 == 5) {
                                    mVar.a();
                                }
                                z10 = false;
                                j9 = 1152921504606846975L;
                            } else {
                                if (j10 < f9198c.get(this)) {
                                    mVar.a();
                                }
                                return new j(r());
                            }
                        } else {
                            throw new IllegalStateException("unexpected");
                        }
                    } else {
                        if (u9) {
                            mVar.h();
                            return new j(r());
                        }
                        if (fVar instanceof I0) {
                            i02 = (I0) fVar;
                        } else {
                            i02 = null;
                        }
                        if (i02 != null) {
                            i02.a(mVar, i10 + i9);
                        }
                        mVar.h();
                        return kVar;
                    }
                } else {
                    return nVar;
                }
            } else {
                mVar.a();
                return nVar;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:54:0x008f, code lost:
    
        r1 = (a8.m) ((d8.d) d8.d.f16975b.get(r1));
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final a8.m k(long r13) {
        /*
            Method dump skipped, instructions count: 308
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a8.e.k(long):a8.m");
    }

    public final void l() {
        u(f9197b.get(this), false);
    }

    public final void m(long j4) {
        m mVar = (m) f9202g.get(this);
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = f9198c;
            long j9 = atomicLongFieldUpdater.get(this);
            if (j4 < Math.max(this.f9205a + j9, f9199d.get(this))) {
                return;
            }
            if (atomicLongFieldUpdater.compareAndSet(this, j9, 1 + j9)) {
                long j10 = g.f9208b;
                long j11 = j9 / j10;
                int i9 = (int) (j9 % j10);
                if (mVar.f17007c != j11) {
                    m o9 = o(j11, mVar);
                    if (o9 != null) {
                        mVar = o9;
                    }
                }
                m mVar2 = mVar;
                if (F(mVar2, i9, j9, null) == g.f9220o) {
                    if (j9 < s()) {
                        mVar2.a();
                    }
                } else {
                    mVar2.a();
                }
                mVar = mVar2;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:117:0x00bd, code lost:
    
        if ((r0.addAndGet(r15, r4 - r8) & 4611686018427387904L) != 0) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x00c6, code lost:
    
        if ((r0.get(r15) & 4611686018427387904L) == 0) goto L144;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void n() {
        /*
            Method dump skipped, instructions count: 402
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a8.e.n():void");
    }

    public final m o(long j4, m mVar) {
        Object b9;
        AtomicLongFieldUpdater atomicLongFieldUpdater;
        long j9;
        m mVar2 = g.f9207a;
        f fVar = f.f9206a;
        loop0: while (true) {
            b9 = AbstractC1130a.b(mVar, j4, fVar);
            if (!AbstractC1130a.e(b9)) {
                d8.u c3 = AbstractC1130a.c(b9);
                while (true) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f9202g;
                    d8.u uVar = (d8.u) atomicReferenceFieldUpdater.get(this);
                    if (uVar.f17007c >= c3.f17007c) {
                        break loop0;
                    }
                    if (!c3.i()) {
                        break;
                    }
                    while (!atomicReferenceFieldUpdater.compareAndSet(this, uVar, c3)) {
                        if (atomicReferenceFieldUpdater.get(this) != uVar) {
                            if (c3.e()) {
                                c3.d();
                            }
                        }
                    }
                    if (uVar.e()) {
                        uVar.d();
                    }
                }
            } else {
                break;
            }
        }
        if (AbstractC1130a.e(b9)) {
            l();
            if (mVar.f17007c * g.f9208b < s()) {
                mVar.a();
                return null;
            }
        } else {
            m mVar3 = (m) AbstractC1130a.c(b9);
            boolean x5 = x();
            long j10 = mVar3.f17007c;
            if (!x5 && j4 <= f9199d.get(this) / g.f9208b) {
                while (true) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f9203h;
                    d8.u uVar2 = (d8.u) atomicReferenceFieldUpdater2.get(this);
                    if (uVar2.f17007c >= j10) {
                        break;
                    }
                    if (!mVar3.i()) {
                        break;
                    }
                    while (!atomicReferenceFieldUpdater2.compareAndSet(this, uVar2, mVar3)) {
                        if (atomicReferenceFieldUpdater2.get(this) != uVar2) {
                            if (mVar3.e()) {
                                mVar3.d();
                            }
                        }
                    }
                    if (uVar2.e()) {
                        uVar2.d();
                    }
                }
            }
            if (j10 > j4) {
                long j11 = j10 * g.f9208b;
                do {
                    atomicLongFieldUpdater = f9198c;
                    j9 = atomicLongFieldUpdater.get(this);
                    if (j9 >= j11) {
                        break;
                    }
                } while (!atomicLongFieldUpdater.compareAndSet(this, j9, j11));
                if (j10 * g.f9208b < s()) {
                    mVar3.a();
                }
            } else {
                return mVar3;
            }
        }
        return null;
    }

    public final Throwable p() {
        return (Throwable) f9204i.get(this);
    }

    public final Throwable q() {
        Throwable p9 = p();
        if (p9 == null) {
            return new NoSuchElementException("Channel was closed");
        }
        return p9;
    }

    public final Throwable r() {
        Throwable p9 = p();
        if (p9 == null) {
            return new IllegalStateException("Channel was closed");
        }
        return p9;
    }

    public final long s() {
        return f9197b.get(this) & 1152921504606846975L;
    }

    /* JADX WARN: Code restructure failed: missing block: B:97:0x01b2, code lost:
    
        r16 = r7;
        r3 = (a8.m) r3.b();
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x01bb, code lost:
    
        if (r3 != null) goto L91;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String toString() {
        /*
            Method dump skipped, instructions count: 505
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a8.e.toString():java.lang.String");
    }

    /* JADX WARN: Code restructure failed: missing block: B:84:0x00a2, code lost:
    
        r0 = (a8.m) ((d8.d) d8.d.f16975b.get(r0));
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean u(long r15, boolean r17) {
        /*
            Method dump skipped, instructions count: 368
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a8.e.u(long, boolean):boolean");
    }

    public final boolean v() {
        return u(f9197b.get(this), true);
    }

    public boolean w() {
        return false;
    }

    public final boolean x() {
        long j4 = f9199d.get(this);
        if (j4 != 0 && j4 != Long.MAX_VALUE) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x0011, code lost:
    
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void y(long r5, a8.m r7) {
        /*
            r4 = this;
        L0:
            long r0 = r7.f17007c
            int r0 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r0 >= 0) goto L11
            d8.d r0 = r7.b()
            a8.m r0 = (a8.m) r0
            if (r0 != 0) goto Lf
            goto L11
        Lf:
            r7 = r0
            goto L0
        L11:
            boolean r5 = r7.c()
            if (r5 == 0) goto L22
            d8.d r5 = r7.b()
            a8.m r5 = (a8.m) r5
            if (r5 != 0) goto L20
            goto L22
        L20:
            r7 = r5
            goto L11
        L22:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r5 = a8.e.f9203h
            java.lang.Object r6 = r5.get(r4)
            d8.u r6 = (d8.u) r6
            long r0 = r6.f17007c
            long r2 = r7.f17007c
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 < 0) goto L33
            goto L49
        L33:
            boolean r0 = r7.i()
            if (r0 != 0) goto L3a
            goto L11
        L3a:
            boolean r0 = r5.compareAndSet(r4, r6, r7)
            if (r0 == 0) goto L4a
            boolean r5 = r6.e()
            if (r5 == 0) goto L49
            r6.d()
        L49:
            return
        L4a:
            java.lang.Object r0 = r5.get(r4)
            if (r0 == r6) goto L3a
            boolean r5 = r7.e()
            if (r5 == 0) goto L22
            r7.d()
            goto L22
        */
        throw new UnsupportedOperationException("Method not decompiled: a8.e.y(long, a8.m):void");
    }

    public final Object z(E7.d dVar, Object obj) {
        C0464h c0464h = new C0464h(1, D1.A(dVar));
        c0464h.s();
        c0464h.resumeWith(AbstractC0485a.h(r()));
        Object r5 = c0464h.r();
        if (r5 == F7.a.f2587a) {
            return r5;
        }
        return A7.n.f558a;
    }
}
