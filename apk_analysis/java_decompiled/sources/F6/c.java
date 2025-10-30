package F6;

import V2.d;
import V2.g;
import Y2.r;
import android.os.SystemClock;
import android.util.Log;
import f5.C1177i;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import k4.C1499E;
import y6.x;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final double f2577a;

    /* renamed from: b, reason: collision with root package name */
    public final double f2578b;

    /* renamed from: c, reason: collision with root package name */
    public final long f2579c;

    /* renamed from: d, reason: collision with root package name */
    public final long f2580d;

    /* renamed from: e, reason: collision with root package name */
    public final int f2581e;

    /* renamed from: f, reason: collision with root package name */
    public final ArrayBlockingQueue f2582f;

    /* renamed from: g, reason: collision with root package name */
    public final ThreadPoolExecutor f2583g;

    /* renamed from: h, reason: collision with root package name */
    public final r f2584h;

    /* renamed from: i, reason: collision with root package name */
    public final C1499E f2585i;
    public int j;

    /* renamed from: k, reason: collision with root package name */
    public long f2586k;

    public c(r rVar, G6.c cVar, C1499E c1499e) {
        double d9 = cVar.f2882d;
        this.f2577a = d9;
        this.f2578b = cVar.f2883e;
        this.f2579c = cVar.f2884f * 1000;
        this.f2584h = rVar;
        this.f2585i = c1499e;
        this.f2580d = SystemClock.elapsedRealtime();
        int i9 = (int) d9;
        this.f2581e = i9;
        ArrayBlockingQueue arrayBlockingQueue = new ArrayBlockingQueue(i9);
        this.f2582f = arrayBlockingQueue;
        this.f2583g = new ThreadPoolExecutor(1, 1, 0L, TimeUnit.MILLISECONDS, arrayBlockingQueue);
        this.j = 0;
        this.f2586k = 0L;
    }

    public final int a() {
        int max;
        if (this.f2586k == 0) {
            this.f2586k = System.currentTimeMillis();
        }
        int currentTimeMillis = (int) ((System.currentTimeMillis() - this.f2586k) / this.f2579c);
        if (this.f2582f.size() == this.f2581e) {
            max = Math.min(100, this.j + currentTimeMillis);
        } else {
            max = Math.max(0, this.j - currentTimeMillis);
        }
        if (this.j != max) {
            this.j = max;
            this.f2586k = System.currentTimeMillis();
        }
        return max;
    }

    public final void b(final y6.b bVar, final C1177i c1177i) {
        final boolean z9;
        String str = "Sending report through Google DataTransport: " + bVar.f25031b;
        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
            Log.d("FirebaseCrashlytics", str, null);
        }
        if (SystemClock.elapsedRealtime() - this.f2580d < 2000) {
            z9 = true;
        } else {
            z9 = false;
        }
        this.f2584h.L(new V2.a(null, bVar.f25030a, d.f7662c, null), new g() { // from class: F6.b
            @Override // V2.g
            public final void b(Exception exc) {
                c cVar = c.this;
                cVar.getClass();
                C1177i c1177i2 = c1177i;
                if (exc != null) {
                    c1177i2.c(exc);
                    return;
                }
                if (z9) {
                    boolean z10 = true;
                    CountDownLatch countDownLatch = new CountDownLatch(1);
                    new Thread(new A6.r(cVar, 2, countDownLatch)).start();
                    TimeUnit timeUnit = TimeUnit.SECONDS;
                    ExecutorService executorService = x.f25128a;
                    boolean z11 = false;
                    try {
                        long nanos = timeUnit.toNanos(2L);
                        long nanoTime = System.nanoTime() + nanos;
                        while (true) {
                            try {
                                try {
                                    countDownLatch.await(nanos, TimeUnit.NANOSECONDS);
                                    break;
                                } catch (Throwable th) {
                                    th = th;
                                    if (z10) {
                                        Thread.currentThread().interrupt();
                                    }
                                    throw th;
                                }
                            } catch (InterruptedException unused) {
                                nanos = nanoTime - System.nanoTime();
                                z11 = true;
                            }
                        }
                        if (z11) {
                            Thread.currentThread().interrupt();
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        z10 = z11;
                    }
                }
                c1177i2.d(bVar);
            }
        });
    }
}
