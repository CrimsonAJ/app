package com.google.android.gms.internal.cast;

import android.os.Build;
import java.util.List;
import java.util.concurrent.AbstractExecutorService;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.Future;
import java.util.concurrent.RunnableFuture;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.gms.internal.cast.y2, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0896y2 extends AbstractExecutorService implements AutoCloseable, InterfaceExecutorServiceC0892x2 {

    /* renamed from: a, reason: collision with root package name */
    public final ExecutorService f15167a;

    public C0896y2(ExecutorService executorService) {
        executorService.getClass();
        this.f15167a = executorService;
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean awaitTermination(long j, TimeUnit timeUnit) {
        return this.f15167a.awaitTermination(j, timeUnit);
    }

    public void close() {
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

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.f15167a.execute(runnable);
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean isShutdown() {
        return this.f15167a.isShutdown();
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean isTerminated() {
        return this.f15167a.isTerminated();
    }

    @Override // java.util.concurrent.AbstractExecutorService
    public final RunnableFuture newTaskFor(Runnable runnable, Object obj) {
        return new D2(Executors.callable(runnable, obj));
    }

    @Override // java.util.concurrent.ExecutorService
    public final void shutdown() {
        this.f15167a.shutdown();
    }

    @Override // java.util.concurrent.ExecutorService
    public final List shutdownNow() {
        return this.f15167a.shutdownNow();
    }

    @Override // java.util.concurrent.AbstractExecutorService, java.util.concurrent.ExecutorService
    public final /* synthetic */ Future submit(Runnable runnable) {
        return (S5.p) super.submit(runnable);
    }

    public final String toString() {
        return super.toString() + "[" + String.valueOf(this.f15167a) + "]";
    }

    @Override // java.util.concurrent.AbstractExecutorService
    public final RunnableFuture newTaskFor(Callable callable) {
        return new D2(callable);
    }

    @Override // java.util.concurrent.AbstractExecutorService, java.util.concurrent.ExecutorService
    public final /* synthetic */ Future submit(Runnable runnable, Object obj) {
        return (S5.p) super.submit(runnable, obj);
    }

    @Override // java.util.concurrent.AbstractExecutorService, java.util.concurrent.ExecutorService
    public final /* synthetic */ Future submit(Callable callable) {
        return (S5.p) super.submit(callable);
    }
}
