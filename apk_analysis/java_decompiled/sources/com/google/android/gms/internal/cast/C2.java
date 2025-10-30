package com.google.android.gms.internal.cast;

import com.google.android.gms.internal.measurement.AbstractC0953k1;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.LockSupport;

/* loaded from: classes.dex */
public final class C2 extends AtomicReference implements Runnable {

    /* renamed from: c, reason: collision with root package name */
    public static final RunnableC0888w2 f14694c = new Object();

    /* renamed from: d, reason: collision with root package name */
    public static final RunnableC0888w2 f14695d = new Object();

    /* renamed from: a, reason: collision with root package name */
    public final Callable f14696a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ D2 f14697b;

    public C2(D2 d22, Callable callable) {
        this.f14697b = d22;
        callable.getClass();
        this.f14696a = callable;
    }

    public final void a(Thread thread) {
        Runnable runnable = (Runnable) get();
        RunnableC0884v2 runnableC0884v2 = null;
        boolean z9 = false;
        int i9 = 0;
        while (true) {
            boolean z10 = runnable instanceof RunnableC0884v2;
            RunnableC0888w2 runnableC0888w2 = f14695d;
            if (!z10) {
                if (runnable != runnableC0888w2) {
                    break;
                }
            } else {
                runnableC0884v2 = (RunnableC0884v2) runnable;
            }
            i9++;
            if (i9 > 1000) {
                if (runnable == runnableC0888w2 || compareAndSet(runnable, runnableC0888w2)) {
                    if (Thread.interrupted() || z9) {
                        z9 = true;
                    } else {
                        z9 = false;
                    }
                    LockSupport.park(runnableC0884v2);
                }
            } else {
                Thread.yield();
            }
            runnable = (Runnable) get();
        }
        if (z9) {
            thread.interrupt();
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object call;
        Thread currentThread = Thread.currentThread();
        if (compareAndSet(null, currentThread)) {
            D2 d22 = this.f14697b;
            boolean isDone = d22.isDone();
            RunnableC0888w2 runnableC0888w2 = f14694c;
            if (!isDone) {
                try {
                    call = this.f14696a.call();
                } catch (Throwable th) {
                    try {
                        if (th instanceof InterruptedException) {
                            Thread.currentThread().interrupt();
                        }
                        if (!compareAndSet(currentThread, runnableC0888w2)) {
                            a(currentThread);
                        }
                        if (AbstractC0868r2.j.r(d22, null, new C0841k2(th))) {
                            AbstractC0849m2.z(d22);
                            return;
                        }
                        return;
                    } catch (Throwable th2) {
                        if (!compareAndSet(currentThread, runnableC0888w2)) {
                            a(currentThread);
                        }
                        d22.getClass();
                        if (AbstractC0868r2.j.r(d22, null, AbstractC0868r2.f14962g)) {
                            AbstractC0849m2.z(d22);
                        }
                        throw th2;
                    }
                }
            } else {
                call = null;
            }
            if (!compareAndSet(currentThread, runnableC0888w2)) {
                a(currentThread);
            }
            if (!isDone) {
                d22.getClass();
                if (call == null) {
                    call = AbstractC0868r2.f14962g;
                }
                if (AbstractC0868r2.j.r(d22, null, call)) {
                    AbstractC0849m2.z(d22);
                }
            }
        }
    }

    @Override // java.util.concurrent.atomic.AtomicReference
    public final String toString() {
        String str;
        Runnable runnable = (Runnable) get();
        if (runnable == f14694c) {
            str = "running=[DONE]";
        } else if (runnable instanceof RunnableC0884v2) {
            str = "running=[INTERRUPTED]";
        } else if (runnable instanceof Thread) {
            str = A0.a.n("running=[RUNNING ON ", ((Thread) runnable).getName(), "]");
        } else {
            str = "running=[NOT STARTED YET]";
        }
        return AbstractC0953k1.o(str, ", ", this.f14696a.toString());
    }
}
