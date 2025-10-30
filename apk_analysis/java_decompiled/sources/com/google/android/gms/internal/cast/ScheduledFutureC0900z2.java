package com.google.android.gms.internal.cast;

import java.util.concurrent.Delayed;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.gms.internal.cast.z2, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ScheduledFutureC0900z2 extends J implements ScheduledFuture, S5.p, Future {

    /* renamed from: d, reason: collision with root package name */
    public final AbstractC0849m2 f15172d;

    /* renamed from: e, reason: collision with root package name */
    public final ScheduledFuture f15173e;

    public ScheduledFutureC0900z2(AbstractC0849m2 abstractC0849m2, ScheduledFuture scheduledFuture) {
        super(6);
        this.f15172d = abstractC0849m2;
        this.f15173e = scheduledFuture;
    }

    @Override // S5.p
    public final void a(Runnable runnable, Executor executor) {
        this.f15172d.a(runnable, executor);
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z9) {
        boolean cancel = this.f15172d.cancel(z9);
        if (cancel) {
            this.f15173e.cancel(z9);
        }
        return cancel;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Delayed delayed) {
        return this.f15173e.compareTo(delayed);
    }

    @Override // java.util.concurrent.Future
    public final Object get() {
        return this.f15172d.get();
    }

    @Override // java.util.concurrent.Delayed
    public final long getDelay(TimeUnit timeUnit) {
        return this.f15173e.getDelay(timeUnit);
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.f15172d.f14965d instanceof C0833i2;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return this.f15172d.isDone();
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j, TimeUnit timeUnit) {
        return this.f15172d.get(j, timeUnit);
    }
}
