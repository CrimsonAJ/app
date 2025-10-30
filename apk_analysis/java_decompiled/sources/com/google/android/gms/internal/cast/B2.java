package com.google.android.gms.internal.cast;

import android.os.Build;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class B2 extends C0896y2 implements ScheduledExecutorService {

    /* renamed from: b, reason: collision with root package name */
    public final ScheduledExecutorService f14692b;

    public B2(ScheduledExecutorService scheduledExecutorService) {
        super(scheduledExecutorService);
        this.f14692b = scheduledExecutorService;
    }

    @Override // com.google.android.gms.internal.cast.C0896y2, java.lang.AutoCloseable
    public final void close() {
        ForkJoinPool commonPool;
        if (Build.VERSION.SDK_INT > 23) {
            commonPool = ForkJoinPool.commonPool();
            if (this == commonPool) {
                return;
            }
        }
        ExecutorService executorService = this.f15167a;
        if (!executorService.isTerminated()) {
            shutdown();
            boolean z9 = false;
            boolean z10 = false;
            while (!z9) {
                try {
                    z9 = executorService.awaitTermination(1L, TimeUnit.DAYS);
                } catch (InterruptedException unused) {
                    if (!z10) {
                        shutdownNow();
                    }
                    z10 = true;
                }
            }
            if (z10) {
                Thread.currentThread().interrupt();
            }
        }
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final ScheduledFuture schedule(Runnable runnable, long j, TimeUnit timeUnit) {
        D2 d22 = new D2(Executors.callable(runnable, null));
        return new ScheduledFutureC0900z2(d22, this.f14692b.schedule(d22, j, timeUnit));
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final /* bridge */ /* synthetic */ ScheduledFuture scheduleAtFixedRate(Runnable runnable, long j, long j4, TimeUnit timeUnit) {
        A2 a22 = new A2(runnable);
        return new ScheduledFutureC0900z2(a22, this.f14692b.scheduleAtFixedRate(a22, j, j4, timeUnit));
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final /* bridge */ /* synthetic */ ScheduledFuture scheduleWithFixedDelay(Runnable runnable, long j, long j4, TimeUnit timeUnit) {
        A2 a22 = new A2(runnable);
        return new ScheduledFutureC0900z2(a22, this.f14692b.scheduleWithFixedDelay(a22, j, j4, timeUnit));
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final /* bridge */ /* synthetic */ ScheduledFuture schedule(Callable callable, long j, TimeUnit timeUnit) {
        D2 d22 = new D2(callable);
        return new ScheduledFutureC0900z2(d22, this.f14692b.schedule(d22, j, timeUnit));
    }
}
