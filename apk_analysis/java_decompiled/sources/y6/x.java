package y6;

import android.os.Looper;
import f5.C1185q;
import j2.C1435b;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicLong;
import q.ThreadFactoryC1867b;

/* loaded from: classes.dex */
public abstract class x {

    /* renamed from: a, reason: collision with root package name */
    public static final ExecutorService f25128a;

    static {
        ExecutorService unconfigurableExecutorService = Executors.unconfigurableExecutorService(new ThreadPoolExecutor(1, 1, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue(), new ThreadFactoryC1867b(new AtomicLong(1L)), new ThreadPoolExecutor.DiscardPolicy()));
        TimeUnit timeUnit = TimeUnit.SECONDS;
        Runtime.getRuntime().addShutdownHook(new Thread(new s(unconfigurableExecutorService), "Crashlytics Shutdown Hook for awaitEvenIfOnMainThread task continuation executor"));
        f25128a = unconfigurableExecutorService;
    }

    public static void a(C1185q c1185q) {
        CountDownLatch countDownLatch = new CountDownLatch(1);
        c1185q.l(f25128a, new C1435b(22, countDownLatch));
        if (Looper.getMainLooper() == Looper.myLooper()) {
            countDownLatch.await(3000L, TimeUnit.MILLISECONDS);
        } else {
            countDownLatch.await(4000L, TimeUnit.MILLISECONDS);
        }
        if (c1185q.j()) {
            c1185q.g();
        } else {
            if (!c1185q.f17438d) {
                if (c1185q.i()) {
                    throw new IllegalStateException(c1185q.f());
                }
                throw new TimeoutException();
            }
            throw new CancellationException("Task is already canceled");
        }
    }
}
