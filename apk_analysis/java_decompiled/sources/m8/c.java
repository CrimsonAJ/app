package m8;

import com.google.android.gms.internal.measurement.AbstractC0953k1;
import com.google.firebase.messaging.u;
import java.util.ArrayList;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;
import kotlin.jvm.internal.h;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: h, reason: collision with root package name */
    public static final c f20928h;

    /* renamed from: i, reason: collision with root package name */
    public static final Logger f20929i;

    /* renamed from: a, reason: collision with root package name */
    public final u f20930a;

    /* renamed from: c, reason: collision with root package name */
    public boolean f20932c;

    /* renamed from: d, reason: collision with root package name */
    public long f20933d;

    /* renamed from: b, reason: collision with root package name */
    public int f20931b = 10000;

    /* renamed from: e, reason: collision with root package name */
    public final ArrayList f20934e = new ArrayList();

    /* renamed from: f, reason: collision with root package name */
    public final ArrayList f20935f = new ArrayList();

    /* renamed from: g, reason: collision with root package name */
    public final m5.c f20936g = new m5.c(1, this);

    /* JADX WARN: Type inference failed for: r1v0, types: [com.google.firebase.messaging.u, java.lang.Object] */
    static {
        String name = k8.c.f20147g + " TaskRunner";
        h.e(name, "name");
        k8.b bVar = new k8.b(name, true);
        ?? obj = new Object();
        obj.f16512a = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60L, TimeUnit.SECONDS, new SynchronousQueue(), bVar);
        f20928h = new c(obj);
        Logger logger = Logger.getLogger(c.class.getName());
        h.d(logger, "getLogger(TaskRunner::class.java.name)");
        f20929i = logger;
    }

    public c(u uVar) {
        this.f20930a = uVar;
    }

    public static final void a(c cVar, a aVar) {
        cVar.getClass();
        byte[] bArr = k8.c.f20141a;
        Thread currentThread = Thread.currentThread();
        String name = currentThread.getName();
        currentThread.setName(aVar.f20918a);
        try {
            long a5 = aVar.a();
            synchronized (cVar) {
                cVar.b(aVar, a5);
            }
            currentThread.setName(name);
        } catch (Throwable th) {
            synchronized (cVar) {
                cVar.b(aVar, -1L);
                currentThread.setName(name);
                throw th;
            }
        }
    }

    public final void b(a aVar, long j) {
        byte[] bArr = k8.c.f20141a;
        b bVar = aVar.f20920c;
        h.b(bVar);
        if (bVar.f20925d == aVar) {
            boolean z9 = bVar.f20927f;
            bVar.f20927f = false;
            bVar.f20925d = null;
            this.f20934e.remove(bVar);
            if (j != -1 && !z9 && !bVar.f20924c) {
                bVar.e(aVar, j, true);
            }
            if (!bVar.f20926e.isEmpty()) {
                this.f20935f.add(bVar);
                return;
            }
            return;
        }
        throw new IllegalStateException("Check failed.");
    }

    public final a c() {
        ArrayList arrayList;
        a aVar;
        boolean z9;
        byte[] bArr = k8.c.f20141a;
        while (true) {
            ArrayList arrayList2 = this.f20935f;
            if (arrayList2.isEmpty()) {
                return null;
            }
            u uVar = this.f20930a;
            long nanoTime = System.nanoTime();
            int size = arrayList2.size();
            long j = Long.MAX_VALUE;
            int i9 = 0;
            a aVar2 = null;
            while (true) {
                if (i9 < size) {
                    Object obj = arrayList2.get(i9);
                    i9++;
                    aVar = null;
                    a aVar3 = (a) ((b) obj).f20926e.get(0);
                    arrayList = arrayList2;
                    long max = Math.max(0L, aVar3.f20921d - nanoTime);
                    if (max > 0) {
                        j = Math.min(max, j);
                    } else {
                        if (aVar2 != null) {
                            z9 = true;
                            break;
                        }
                        aVar2 = aVar3;
                    }
                    arrayList2 = arrayList;
                } else {
                    arrayList = arrayList2;
                    aVar = null;
                    z9 = false;
                    break;
                }
            }
            ArrayList arrayList3 = this.f20934e;
            if (aVar2 != null) {
                byte[] bArr2 = k8.c.f20141a;
                aVar2.f20921d = -1L;
                b bVar = aVar2.f20920c;
                h.b(bVar);
                bVar.f20926e.remove(aVar2);
                ArrayList arrayList4 = arrayList;
                arrayList4.remove(bVar);
                bVar.f20925d = aVar2;
                arrayList3.add(bVar);
                if (z9 || (!this.f20932c && !arrayList4.isEmpty())) {
                    m5.c runnable = this.f20936g;
                    h.e(runnable, "runnable");
                    ((ThreadPoolExecutor) uVar.f16512a).execute(runnable);
                }
                return aVar2;
            }
            ArrayList arrayList5 = arrayList;
            if (this.f20932c) {
                if (j < this.f20933d - nanoTime) {
                    notify();
                    return aVar;
                }
                return aVar;
            }
            this.f20932c = true;
            this.f20933d = nanoTime + j;
            try {
                try {
                    long j4 = j / 1000000;
                    Long.signum(j4);
                    long j9 = j - (1000000 * j4);
                    if (j4 > 0 || j > 0) {
                        wait(j4, (int) j9);
                    }
                } catch (InterruptedException unused) {
                    for (int size2 = arrayList3.size() - 1; -1 < size2; size2--) {
                        ((b) arrayList3.get(size2)).b();
                    }
                    int size3 = arrayList5.size() - 1;
                    for (int i10 = -1; i10 < size3; i10 = -1) {
                        b bVar2 = (b) arrayList5.get(size3);
                        bVar2.b();
                        if (bVar2.f20926e.isEmpty()) {
                            arrayList5.remove(size3);
                        }
                        size3--;
                    }
                }
            } finally {
                this.f20932c = false;
            }
        }
    }

    public final void d(b taskQueue) {
        h.e(taskQueue, "taskQueue");
        byte[] bArr = k8.c.f20141a;
        if (taskQueue.f20925d == null) {
            boolean isEmpty = taskQueue.f20926e.isEmpty();
            ArrayList arrayList = this.f20935f;
            if (!isEmpty) {
                h.e(arrayList, "<this>");
                if (!arrayList.contains(taskQueue)) {
                    arrayList.add(taskQueue);
                }
            } else {
                arrayList.remove(taskQueue);
            }
        }
        boolean z9 = this.f20932c;
        u uVar = this.f20930a;
        if (z9) {
            notify();
            return;
        }
        m5.c runnable = this.f20936g;
        h.e(runnable, "runnable");
        ((ThreadPoolExecutor) uVar.f16512a).execute(runnable);
    }

    public final b e() {
        int i9;
        synchronized (this) {
            i9 = this.f20931b;
            this.f20931b = i9 + 1;
        }
        return new b(this, AbstractC0953k1.j(i9, "Q"));
    }
}
