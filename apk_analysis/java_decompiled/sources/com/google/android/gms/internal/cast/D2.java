package com.google.android.gms.internal.cast;

import java.util.concurrent.Callable;
import java.util.concurrent.RunnableFuture;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.LockSupport;

/* loaded from: classes.dex */
public final class D2 extends AbstractC0849m2 implements RunnableFuture {

    /* renamed from: k, reason: collision with root package name */
    public volatile C2 f14703k;

    public D2(Callable callable) {
        super(11);
        this.f14703k = new C2(this, callable);
    }

    @Override // java.util.concurrent.RunnableFuture, java.lang.Runnable
    public final void run() {
        C2 c22 = this.f14703k;
        if (c22 != null) {
            c22.run();
        }
        this.f14703k = null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.cast.AbstractC0849m2
    public final String v() {
        C2 c22 = this.f14703k;
        if (c22 != null) {
            return A0.a.n("task=[", c22.toString(), "]");
        }
        if (this instanceof ScheduledFuture) {
            return "remaining delay=[" + ((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS) + " ms]";
        }
        return null;
    }

    @Override // com.google.android.gms.internal.cast.AbstractC0849m2
    public final void w() {
        C2 c22;
        Object obj = this.f14965d;
        if ((obj instanceof C0833i2) && ((C0833i2) obj).f14866a && (c22 = this.f14703k) != null) {
            RunnableC0888w2 runnableC0888w2 = C2.f14695d;
            RunnableC0888w2 runnableC0888w22 = C2.f14694c;
            Runnable runnable = (Runnable) c22.get();
            if (runnable instanceof Thread) {
                RunnableC0884v2 runnableC0884v2 = new RunnableC0884v2(c22);
                RunnableC0884v2.a(runnableC0884v2, Thread.currentThread());
                if (c22.compareAndSet(runnable, runnableC0884v2)) {
                    try {
                        Thread thread = (Thread) runnable;
                        thread.interrupt();
                        if (((Runnable) c22.getAndSet(runnableC0888w22)) == runnableC0888w2) {
                            LockSupport.unpark(thread);
                        }
                    } catch (Throwable th) {
                        if (((Runnable) c22.getAndSet(runnableC0888w22)) == runnableC0888w2) {
                            LockSupport.unpark((Thread) runnable);
                        }
                        throw th;
                    }
                }
            }
        }
        this.f14703k = null;
    }
}
