package f8;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.internal.o;

/* loaded from: classes.dex */
public final class a extends Thread {

    /* renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f17441i = AtomicIntegerFieldUpdater.newUpdater(a.class, "workerCtl$volatile");

    /* renamed from: a, reason: collision with root package name */
    public final m f17442a;

    /* renamed from: b, reason: collision with root package name */
    public final o f17443b;

    /* renamed from: c, reason: collision with root package name */
    public b f17444c;

    /* renamed from: d, reason: collision with root package name */
    public long f17445d;

    /* renamed from: e, reason: collision with root package name */
    public long f17446e;

    /* renamed from: f, reason: collision with root package name */
    public int f17447f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f17448g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ c f17449h;
    private volatile int indexInArray;
    private volatile Object nextParkedWorker;
    private volatile /* synthetic */ int workerCtl$volatile;

    /* JADX WARN: Type inference failed for: r3v4, types: [kotlin.jvm.internal.o, java.lang.Object] */
    public a(c cVar, int i9) {
        this.f17449h = cVar;
        setDaemon(true);
        setContextClassLoader(cVar.getClass().getClassLoader());
        this.f17442a = new m();
        this.f17443b = new Object();
        this.f17444c = b.f17453d;
        this.nextParkedWorker = c.f17458k;
        int nanoTime = (int) System.nanoTime();
        this.f17447f = nanoTime == 0 ? 42 : nanoTime;
        f(i9);
    }

    public final i a(boolean z9) {
        i e8;
        i e9;
        c cVar;
        long j;
        b bVar = this.f17444c;
        b bVar2 = b.f17450a;
        i iVar = null;
        m mVar = this.f17442a;
        boolean z10 = true;
        c cVar2 = this.f17449h;
        if (bVar != bVar2) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = c.f17457i;
            do {
                cVar = this.f17449h;
                j = atomicLongFieldUpdater.get(cVar);
                if (((int) ((9223367638808264704L & j) >> 42)) == 0) {
                    mVar.getClass();
                    loop1: while (true) {
                        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = m.f17483b;
                        i iVar2 = (i) atomicReferenceFieldUpdater.get(mVar);
                        if (iVar2 == null || iVar2.f17472b.f17061a != 1) {
                            break;
                        }
                        while (!atomicReferenceFieldUpdater.compareAndSet(mVar, iVar2, null)) {
                            if (atomicReferenceFieldUpdater.get(mVar) != iVar2) {
                                break;
                            }
                        }
                        iVar = iVar2;
                    }
                    int i9 = m.f17485d.get(mVar);
                    int i10 = m.f17484c.get(mVar);
                    while (true) {
                        if (i9 == i10 || m.f17486e.get(mVar) == 0) {
                            break;
                        }
                        i10--;
                        i c3 = mVar.c(i10, true);
                        if (c3 != null) {
                            iVar = c3;
                            break;
                        }
                    }
                    if (iVar == null) {
                        i iVar3 = (i) cVar2.f17464f.d();
                        if (iVar3 == null) {
                            return i(1);
                        }
                        return iVar3;
                    }
                    return iVar;
                }
            } while (!c.f17457i.compareAndSet(cVar, j, j - 4398046511104L));
            this.f17444c = bVar2;
        }
        if (z9) {
            if (d(cVar2.f17459a * 2) != 0) {
                z10 = false;
            }
            if (z10 && (e9 = e()) != null) {
                return e9;
            }
            mVar.getClass();
            i iVar4 = (i) m.f17483b.getAndSet(mVar, null);
            if (iVar4 == null) {
                iVar4 = mVar.b();
            }
            if (iVar4 != null) {
                return iVar4;
            }
            if (!z10 && (e8 = e()) != null) {
                return e8;
            }
        } else {
            i e10 = e();
            if (e10 != null) {
                return e10;
            }
        }
        return i(3);
    }

    public final int b() {
        return this.indexInArray;
    }

    public final Object c() {
        return this.nextParkedWorker;
    }

    public final int d(int i9) {
        int i10 = this.f17447f;
        int i11 = i10 ^ (i10 << 13);
        int i12 = i11 ^ (i11 >> 17);
        int i13 = i12 ^ (i12 << 5);
        this.f17447f = i13;
        int i14 = i9 - 1;
        if ((i14 & i9) == 0) {
            return i13 & i14;
        }
        return (i13 & Integer.MAX_VALUE) % i9;
    }

    public final i e() {
        int d9 = d(2);
        c cVar = this.f17449h;
        if (d9 == 0) {
            i iVar = (i) cVar.f17463e.d();
            if (iVar != null) {
                return iVar;
            }
            return (i) cVar.f17464f.d();
        }
        i iVar2 = (i) cVar.f17464f.d();
        if (iVar2 != null) {
            return iVar2;
        }
        return (i) cVar.f17463e.d();
    }

    public final void f(int i9) {
        String valueOf;
        StringBuilder sb = new StringBuilder();
        sb.append(this.f17449h.f17462d);
        sb.append("-worker-");
        if (i9 == 0) {
            valueOf = "TERMINATED";
        } else {
            valueOf = String.valueOf(i9);
        }
        sb.append(valueOf);
        setName(sb.toString());
        this.indexInArray = i9;
    }

    public final void g(Object obj) {
        this.nextParkedWorker = obj;
    }

    public final boolean h(b bVar) {
        boolean z9;
        b bVar2 = this.f17444c;
        if (bVar2 == b.f17450a) {
            z9 = true;
        } else {
            z9 = false;
        }
        if (z9) {
            c.f17457i.addAndGet(this.f17449h, 4398046511104L);
        }
        if (bVar2 != bVar) {
            this.f17444c = bVar;
        }
        return z9;
    }

    /* JADX WARN: Code restructure failed: missing block: B:51:0x00a2, code lost:
    
        r7 = -2;
        r23 = r6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final f8.i i(int r26) {
        /*
            Method dump skipped, instructions count: 266
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: f8.a.i(int):f8.i");
    }

    /* JADX WARN: Code restructure failed: missing block: B:65:0x0004, code lost:
    
        continue;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0004, code lost:
    
        continue;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0004, code lost:
    
        continue;
     */
    @Override // java.lang.Thread, java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void run() {
        /*
            Method dump skipped, instructions count: 412
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: f8.a.run():void");
    }
}
