package f8;

import Y7.B;
import com.google.android.gms.internal.measurement.AbstractC0953k1;
import d8.s;
import e1.q;
import java.io.Closeable;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.locks.LockSupport;

/* loaded from: classes.dex */
public final class c implements Executor, Closeable, AutoCloseable {

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ AtomicLongFieldUpdater f17456h = AtomicLongFieldUpdater.newUpdater(c.class, "parkedWorkersStack$volatile");

    /* renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ AtomicLongFieldUpdater f17457i = AtomicLongFieldUpdater.newUpdater(c.class, "controlState$volatile");
    public static final /* synthetic */ AtomicIntegerFieldUpdater j = AtomicIntegerFieldUpdater.newUpdater(c.class, "_isTerminated$volatile");

    /* renamed from: k, reason: collision with root package name */
    public static final G6.a f17458k = new G6.a("NOT_IN_STACK", 3);
    private volatile /* synthetic */ int _isTerminated$volatile;

    /* renamed from: a, reason: collision with root package name */
    public final int f17459a;

    /* renamed from: b, reason: collision with root package name */
    public final int f17460b;

    /* renamed from: c, reason: collision with root package name */
    public final long f17461c;
    private volatile /* synthetic */ long controlState$volatile;

    /* renamed from: d, reason: collision with root package name */
    public final String f17462d;

    /* renamed from: e, reason: collision with root package name */
    public final f f17463e;

    /* renamed from: f, reason: collision with root package name */
    public final f f17464f;

    /* renamed from: g, reason: collision with root package name */
    public final s f17465g;
    private volatile /* synthetic */ long parkedWorkersStack$volatile;

    /* JADX WARN: Type inference failed for: r3v13, types: [f8.f, d8.l] */
    /* JADX WARN: Type inference failed for: r3v14, types: [f8.f, d8.l] */
    public c(long j4, String str, int i9, int i10) {
        this.f17459a = i9;
        this.f17460b = i10;
        this.f17461c = j4;
        this.f17462d = str;
        if (i9 >= 1) {
            if (i10 >= i9) {
                if (i10 <= 2097150) {
                    if (j4 > 0) {
                        this.f17463e = new d8.l();
                        this.f17464f = new d8.l();
                        this.f17465g = new s((i9 + 1) * 2);
                        this.controlState$volatile = i9 << 42;
                        this._isTerminated$volatile = 0;
                        return;
                    }
                    throw new IllegalArgumentException(("Idle worker keep alive time " + j4 + " must be positive").toString());
                }
                throw new IllegalArgumentException(A0.a.m("Max pool size ", i10, " should not exceed maximal supported number of threads 2097150").toString());
            }
            throw new IllegalArgumentException(A0.a.l("Max pool size ", i10, i9, " should be greater than or equals to core pool size ").toString());
        }
        throw new IllegalArgumentException(A0.a.m("Core pool size ", i9, " should be at least 1").toString());
    }

    public static /* synthetic */ void g(c cVar, Runnable runnable, int i9) {
        boolean z9;
        q qVar = k.f17480g;
        if ((i9 & 4) != 0) {
            z9 = false;
        } else {
            z9 = true;
        }
        cVar.d(runnable, qVar, z9);
    }

    public final boolean F() {
        G6.a aVar;
        int i9;
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = f17456h;
            long j4 = atomicLongFieldUpdater.get(this);
            a aVar2 = (a) this.f17465g.b((int) (2097151 & j4));
            if (aVar2 == null) {
                aVar2 = null;
            } else {
                long j9 = (2097152 + j4) & (-2097152);
                Object c3 = aVar2.c();
                while (true) {
                    aVar = f17458k;
                    if (c3 == aVar) {
                        i9 = -1;
                        break;
                    }
                    if (c3 == null) {
                        i9 = 0;
                        break;
                    }
                    a aVar3 = (a) c3;
                    i9 = aVar3.b();
                    if (i9 != 0) {
                        break;
                    }
                    c3 = aVar3.c();
                }
                if (i9 >= 0 && atomicLongFieldUpdater.compareAndSet(this, j4, j9 | i9)) {
                    aVar2.g(aVar);
                }
            }
            if (aVar2 == null) {
                return false;
            }
            if (a.f17441i.compareAndSet(aVar2, -1, 0)) {
                LockSupport.unpark(aVar2);
                return true;
            }
        }
    }

    public final int a() {
        boolean z9;
        synchronized (this.f17465g) {
            try {
                if (j.get(this) != 0) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                if (z9) {
                    return -1;
                }
                AtomicLongFieldUpdater atomicLongFieldUpdater = f17457i;
                long j4 = atomicLongFieldUpdater.get(this);
                int i9 = (int) (j4 & 2097151);
                int i10 = i9 - ((int) ((j4 & 4398044413952L) >> 21));
                if (i10 < 0) {
                    i10 = 0;
                }
                if (i10 >= this.f17459a) {
                    return 0;
                }
                if (i9 >= this.f17460b) {
                    return 0;
                }
                int i11 = ((int) (atomicLongFieldUpdater.get(this) & 2097151)) + 1;
                if (i11 > 0 && this.f17465g.b(i11) == null) {
                    a aVar = new a(this, i11);
                    this.f17465g.c(i11, aVar);
                    if (i11 == ((int) (2097151 & atomicLongFieldUpdater.incrementAndGet(this)))) {
                        int i12 = i10 + 1;
                        aVar.start();
                        return i12;
                    }
                    throw new IllegalArgumentException("Failed requirement.");
                }
                throw new IllegalArgumentException("Failed requirement.");
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x0088, code lost:
    
        if (r1 == null) goto L39;
     */
    @Override // java.io.Closeable, java.lang.AutoCloseable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void close() {
        /*
            r8 = this;
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = f8.c.j
            r1 = 0
            r2 = 1
            boolean r0 = r0.compareAndSet(r8, r1, r2)
            if (r0 != 0) goto Lb
            return
        Lb:
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            boolean r1 = r0 instanceof f8.a
            r3 = 0
            if (r1 == 0) goto L17
            f8.a r0 = (f8.a) r0
            goto L18
        L17:
            r0 = r3
        L18:
            if (r0 == 0) goto L23
            f8.c r1 = r0.f17449h
            boolean r1 = kotlin.jvm.internal.h.a(r1, r8)
            if (r1 == 0) goto L23
            goto L24
        L23:
            r0 = r3
        L24:
            d8.s r1 = r8.f17465g
            monitor-enter(r1)
            java.util.concurrent.atomic.AtomicLongFieldUpdater r4 = f8.c.f17457i     // Catch: java.lang.Throwable -> Lc3
            long r4 = r4.get(r8)     // Catch: java.lang.Throwable -> Lc3
            r6 = 2097151(0x1fffff, double:1.0361303E-317)
            long r4 = r4 & r6
            int r4 = (int) r4
            monitor-exit(r1)
            if (r2 > r4) goto L78
            r1 = r2
        L36:
            d8.s r5 = r8.f17465g
            java.lang.Object r5 = r5.b(r1)
            kotlin.jvm.internal.h.b(r5)
            f8.a r5 = (f8.a) r5
            if (r5 == r0) goto L73
        L43:
            java.lang.Thread$State r6 = r5.getState()
            java.lang.Thread$State r7 = java.lang.Thread.State.TERMINATED
            if (r6 == r7) goto L54
            java.util.concurrent.locks.LockSupport.unpark(r5)
            r6 = 10000(0x2710, double:4.9407E-320)
            r5.join(r6)
            goto L43
        L54:
            f8.m r5 = r5.f17442a
            f8.f r6 = r8.f17464f
            r5.getClass()
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r7 = f8.m.f17483b
            java.lang.Object r7 = r7.getAndSet(r5, r3)
            f8.i r7 = (f8.i) r7
            if (r7 == 0) goto L68
            r6.a(r7)
        L68:
            f8.i r7 = r5.b()
            if (r7 != 0) goto L6f
            goto L73
        L6f:
            r6.a(r7)
            goto L68
        L73:
            if (r1 == r4) goto L78
            int r1 = r1 + 1
            goto L36
        L78:
            f8.f r1 = r8.f17464f
            r1.b()
            f8.f r1 = r8.f17463e
            r1.b()
        L82:
            if (r0 == 0) goto L8a
            f8.i r1 = r0.a(r2)
            if (r1 != 0) goto Lb2
        L8a:
            f8.f r1 = r8.f17463e
            java.lang.Object r1 = r1.d()
            f8.i r1 = (f8.i) r1
            if (r1 != 0) goto Lb2
            f8.f r1 = r8.f17464f
            java.lang.Object r1 = r1.d()
            f8.i r1 = (f8.i) r1
            if (r1 != 0) goto Lb2
            if (r0 == 0) goto La5
            f8.b r1 = f8.b.f17454e
            r0.h(r1)
        La5:
            java.util.concurrent.atomic.AtomicLongFieldUpdater r0 = f8.c.f17456h
            r1 = 0
            r0.set(r8, r1)
            java.util.concurrent.atomic.AtomicLongFieldUpdater r0 = f8.c.f17457i
            r0.set(r8, r1)
            return
        Lb2:
            r1.run()     // Catch: java.lang.Throwable -> Lb6
            goto L82
        Lb6:
            r1 = move-exception
            java.lang.Thread r3 = java.lang.Thread.currentThread()
            java.lang.Thread$UncaughtExceptionHandler r4 = r3.getUncaughtExceptionHandler()
            r4.uncaughtException(r3, r1)
            goto L82
        Lc3:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: f8.c.close():void");
    }

    public final void d(Runnable runnable, q qVar, boolean z9) {
        i jVar;
        boolean z10;
        long j4;
        a aVar;
        boolean a5;
        b bVar;
        k.f17479f.getClass();
        long nanoTime = System.nanoTime();
        if (runnable instanceof i) {
            jVar = (i) runnable;
            jVar.f17471a = nanoTime;
            jVar.f17472b = qVar;
        } else {
            jVar = new j(runnable, nanoTime, qVar);
        }
        boolean z11 = false;
        if (jVar.f17472b.f17061a == 1) {
            z10 = true;
        } else {
            z10 = false;
        }
        AtomicLongFieldUpdater atomicLongFieldUpdater = f17457i;
        if (z10) {
            j4 = atomicLongFieldUpdater.addAndGet(this, 2097152L);
        } else {
            j4 = 0;
        }
        Thread currentThread = Thread.currentThread();
        if (currentThread instanceof a) {
            aVar = (a) currentThread;
        } else {
            aVar = null;
        }
        if (aVar == null || !kotlin.jvm.internal.h.a(aVar.f17449h, this)) {
            aVar = null;
        }
        if (aVar != null && (bVar = aVar.f17444c) != b.f17454e && (jVar.f17472b.f17061a != 0 || bVar != b.f17451b)) {
            aVar.f17448g = true;
            m mVar = aVar.f17442a;
            if (z9) {
                jVar = mVar.a(jVar);
            } else {
                mVar.getClass();
                i iVar = (i) m.f17483b.getAndSet(mVar, jVar);
                if (iVar == null) {
                    jVar = null;
                } else {
                    jVar = mVar.a(iVar);
                }
            }
        }
        if (jVar != null) {
            if (jVar.f17472b.f17061a == 1) {
                a5 = this.f17464f.a(jVar);
            } else {
                a5 = this.f17463e.a(jVar);
            }
            if (!a5) {
                throw new RejectedExecutionException(AbstractC0953k1.q(new StringBuilder(), this.f17462d, " was terminated"));
            }
        }
        if (z9 && aVar != null) {
            z11 = true;
        }
        if (z10) {
            if (!z11 && !F() && !x(j4)) {
                F();
                return;
            }
            return;
        }
        if (z11 || F() || x(atomicLongFieldUpdater.get(this))) {
            return;
        }
        F();
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        g(this, runnable, 6);
    }

    public final void s(a aVar, int i9, int i10) {
        while (true) {
            long j4 = f17456h.get(this);
            int i11 = (int) (2097151 & j4);
            long j9 = (2097152 + j4) & (-2097152);
            if (i11 == i9) {
                if (i10 == 0) {
                    Object c3 = aVar.c();
                    while (true) {
                        if (c3 == f17458k) {
                            i11 = -1;
                            break;
                        }
                        if (c3 == null) {
                            i11 = 0;
                            break;
                        }
                        a aVar2 = (a) c3;
                        int b9 = aVar2.b();
                        if (b9 != 0) {
                            i11 = b9;
                            break;
                        }
                        c3 = aVar2.c();
                    }
                } else {
                    i11 = i10;
                }
            }
            if (i11 >= 0) {
                if (f17456h.compareAndSet(this, j4, i11 | j9)) {
                    return;
                }
            }
        }
    }

    public final String toString() {
        int i9;
        ArrayList arrayList = new ArrayList();
        s sVar = this.f17465g;
        int a5 = sVar.a();
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        int i14 = 0;
        for (int i15 = 1; i15 < a5; i15++) {
            a aVar = (a) sVar.b(i15);
            if (aVar != null) {
                m mVar = aVar.f17442a;
                mVar.getClass();
                if (m.f17483b.get(mVar) != null) {
                    i9 = (m.f17484c.get(mVar) - m.f17485d.get(mVar)) + 1;
                } else {
                    i9 = m.f17484c.get(mVar) - m.f17485d.get(mVar);
                }
                int ordinal = aVar.f17444c.ordinal();
                if (ordinal != 0) {
                    if (ordinal != 1) {
                        if (ordinal != 2) {
                            if (ordinal != 3) {
                                if (ordinal == 4) {
                                    i14++;
                                }
                            } else {
                                i13++;
                                if (i9 > 0) {
                                    StringBuilder sb = new StringBuilder();
                                    sb.append(i9);
                                    sb.append('d');
                                    arrayList.add(sb.toString());
                                }
                            }
                        } else {
                            i12++;
                        }
                    } else {
                        i11++;
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append(i9);
                        sb2.append('b');
                        arrayList.add(sb2.toString());
                    }
                } else {
                    i10++;
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append(i9);
                    sb3.append('c');
                    arrayList.add(sb3.toString());
                }
            }
        }
        long j4 = f17457i.get(this);
        StringBuilder sb4 = new StringBuilder();
        sb4.append(this.f17462d);
        sb4.append('@');
        sb4.append(B.l(this));
        sb4.append("[Pool Size {core = ");
        int i16 = this.f17459a;
        sb4.append(i16);
        sb4.append(", max = ");
        sb4.append(this.f17460b);
        sb4.append("}, Worker States {CPU = ");
        sb4.append(i10);
        sb4.append(", blocking = ");
        sb4.append(i11);
        sb4.append(", parked = ");
        sb4.append(i12);
        sb4.append(", dormant = ");
        sb4.append(i13);
        sb4.append(", terminated = ");
        sb4.append(i14);
        sb4.append("}, running workers queues = ");
        sb4.append(arrayList);
        sb4.append(", global CPU queue size = ");
        sb4.append(this.f17463e.c());
        sb4.append(", global blocking queue size = ");
        sb4.append(this.f17464f.c());
        sb4.append(", Control State {created workers= ");
        sb4.append((int) (2097151 & j4));
        sb4.append(", blocking tasks = ");
        sb4.append((int) ((4398044413952L & j4) >> 21));
        sb4.append(", CPUs acquired = ");
        sb4.append(i16 - ((int) ((j4 & 9223367638808264704L) >> 42)));
        sb4.append("}]");
        return sb4.toString();
    }

    public final boolean x(long j4) {
        int i9 = ((int) (2097151 & j4)) - ((int) ((j4 & 4398044413952L) >> 21));
        if (i9 < 0) {
            i9 = 0;
        }
        int i10 = this.f17459a;
        if (i9 < i10) {
            int a5 = a();
            if (a5 == 1 && i10 > 1) {
                a();
            }
            if (a5 > 0) {
                return true;
            }
        }
        return false;
    }
}
