package g8;

import A7.n;
import Y7.I0;
import Y7.InterfaceC0462g;
import com.google.android.gms.internal.measurement.AbstractC0953k1;
import d8.AbstractC1130a;
import d8.u;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes.dex */
public class i implements f {

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f17790c = AtomicReferenceFieldUpdater.newUpdater(i.class, Object.class, "head$volatile");

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ AtomicLongFieldUpdater f17791d = AtomicLongFieldUpdater.newUpdater(i.class, "deqIdx$volatile");

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f17792e = AtomicReferenceFieldUpdater.newUpdater(i.class, Object.class, "tail$volatile");

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ AtomicLongFieldUpdater f17793f = AtomicLongFieldUpdater.newUpdater(i.class, "enqIdx$volatile");

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f17794g = AtomicIntegerFieldUpdater.newUpdater(i.class, "_availablePermits$volatile");
    private volatile /* synthetic */ int _availablePermits$volatile;

    /* renamed from: a, reason: collision with root package name */
    public final int f17795a;

    /* renamed from: b, reason: collision with root package name */
    public final C0.b f17796b;
    private volatile /* synthetic */ long deqIdx$volatile;
    private volatile /* synthetic */ long enqIdx$volatile;
    private volatile /* synthetic */ Object head$volatile;
    private volatile /* synthetic */ Object tail$volatile;

    public i(int i9, int i10) {
        this.f17795a = i9;
        if (i9 > 0) {
            if (i10 >= 0 && i10 <= i9) {
                k kVar = new k(0L, null, 2);
                this.head$volatile = kVar;
                this.tail$volatile = kVar;
                this._availablePermits$volatile = i9 - i10;
                this.f17796b = new C0.b(4, this);
                return;
            }
            throw new IllegalArgumentException(AbstractC0953k1.j(i9, "The number of acquired permits should be in 0..").toString());
        }
        throw new IllegalArgumentException(AbstractC0953k1.j(i9, "Semaphore should have at least 1 permit, but had ").toString());
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0025, code lost:
    
        r5.b(r3, r4.f17796b);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(G7.c r5) {
        /*
            r4 = this;
        L0:
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = g8.i.f17794g
            int r1 = r0.getAndDecrement(r4)
            int r2 = r4.f17795a
            if (r1 > r2) goto L0
            A7.n r3 = A7.n.f558a
            if (r1 <= 0) goto Lf
            goto L41
        Lf:
            E7.d r5 = com.google.android.gms.internal.measurement.D1.A(r5)
            Y7.h r5 = Y7.B.n(r5)
            boolean r1 = r4.c(r5)     // Catch: java.lang.Throwable -> L32
            if (r1 != 0) goto L34
        L1d:
            int r1 = r0.getAndDecrement(r4)     // Catch: java.lang.Throwable -> L32
            if (r1 > r2) goto L1d
            if (r1 <= 0) goto L2b
            C0.b r0 = r4.f17796b     // Catch: java.lang.Throwable -> L32
            r5.b(r3, r0)     // Catch: java.lang.Throwable -> L32
            goto L34
        L2b:
            boolean r1 = r4.c(r5)     // Catch: java.lang.Throwable -> L32
            if (r1 == 0) goto L1d
            goto L34
        L32:
            r0 = move-exception
            goto L42
        L34:
            java.lang.Object r5 = r5.r()
            F7.a r0 = F7.a.f2587a
            if (r5 != r0) goto L3d
            goto L3e
        L3d:
            r5 = r3
        L3e:
            if (r5 != r0) goto L41
            return r5
        L41:
            return r3
        L42:
            r5.z()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: g8.i.b(G7.c):java.lang.Object");
    }

    public final boolean c(I0 i02) {
        Object b9;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f17792e;
        k kVar = (k) atomicReferenceFieldUpdater.get(this);
        long andIncrement = f17793f.getAndIncrement(this);
        g gVar = g.f17788a;
        long j = andIncrement / j.f17802f;
        loop0: while (true) {
            b9 = AbstractC1130a.b(kVar, j, gVar);
            if (!AbstractC1130a.e(b9)) {
                u c3 = AbstractC1130a.c(b9);
                while (true) {
                    u uVar = (u) atomicReferenceFieldUpdater.get(this);
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
        k kVar2 = (k) AbstractC1130a.c(b9);
        int i9 = (int) (andIncrement % j.f17802f);
        AtomicReferenceArray atomicReferenceArray = kVar2.f17803e;
        while (!atomicReferenceArray.compareAndSet(i9, null, i02)) {
            if (atomicReferenceArray.get(i9) != null) {
                G6.a aVar = j.f17798b;
                G6.a aVar2 = j.f17799c;
                while (!atomicReferenceArray.compareAndSet(i9, aVar, aVar2)) {
                    if (atomicReferenceArray.get(i9) != aVar) {
                        return false;
                    }
                }
                if (i02 instanceof InterfaceC0462g) {
                    ((InterfaceC0462g) i02).b(n.f558a, this.f17796b);
                    return true;
                }
                throw new IllegalStateException(("unexpected: " + i02).toString());
            }
        }
        i02.a(kVar2, i9);
        return true;
    }

    public final void e() {
        int i9;
        Object b9;
        boolean z9;
        do {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f17794g;
            int andIncrement = atomicIntegerFieldUpdater.getAndIncrement(this);
            int i10 = this.f17795a;
            if (andIncrement < i10) {
                if (andIncrement < 0) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f17790c;
                    k kVar = (k) atomicReferenceFieldUpdater.get(this);
                    long andIncrement2 = f17791d.getAndIncrement(this);
                    long j = andIncrement2 / j.f17802f;
                    h hVar = h.f17789a;
                    while (true) {
                        b9 = AbstractC1130a.b(kVar, j, hVar);
                        if (AbstractC1130a.e(b9)) {
                            break;
                        }
                        u c3 = AbstractC1130a.c(b9);
                        while (true) {
                            u uVar = (u) atomicReferenceFieldUpdater.get(this);
                            if (uVar.f17007c >= c3.f17007c) {
                                break;
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
                    }
                    k kVar2 = (k) AbstractC1130a.c(b9);
                    kVar2.a();
                    z9 = false;
                    if (kVar2.f17007c <= j) {
                        int i11 = (int) (andIncrement2 % j.f17802f);
                        G6.a aVar = j.f17798b;
                        AtomicReferenceArray atomicReferenceArray = kVar2.f17803e;
                        Object andSet = atomicReferenceArray.getAndSet(i11, aVar);
                        if (andSet == null) {
                            int i12 = j.f17797a;
                            for (int i13 = 0; i13 < i12; i13++) {
                                if (atomicReferenceArray.get(i11) == j.f17799c) {
                                    z9 = true;
                                    break;
                                }
                            }
                            G6.a aVar2 = j.f17798b;
                            G6.a aVar3 = j.f17800d;
                            while (true) {
                                if (atomicReferenceArray.compareAndSet(i11, aVar2, aVar3)) {
                                    z9 = true;
                                    break;
                                } else if (atomicReferenceArray.get(i11) != aVar2) {
                                    break;
                                }
                            }
                            z9 = !z9;
                        } else if (andSet != j.f17801e) {
                            if (andSet instanceof InterfaceC0462g) {
                                InterfaceC0462g interfaceC0462g = (InterfaceC0462g) andSet;
                                G6.a e8 = interfaceC0462g.e(n.f558a, this.f17796b);
                                if (e8 != null) {
                                    interfaceC0462g.k(e8);
                                    z9 = true;
                                    break;
                                    break;
                                }
                            } else {
                                throw new IllegalStateException(("unexpected: " + andSet).toString());
                            }
                        }
                    }
                } else {
                    return;
                }
            } else {
                do {
                    i9 = atomicIntegerFieldUpdater.get(this);
                    if (i9 <= i10) {
                        break;
                    }
                } while (!atomicIntegerFieldUpdater.compareAndSet(this, i9, i10));
                throw new IllegalStateException(("The number of released permits cannot be greater than " + i10).toString());
            }
        } while (!z9);
    }
}
