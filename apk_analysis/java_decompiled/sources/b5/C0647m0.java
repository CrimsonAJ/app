package b5;

import java.util.concurrent.Callable;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.Semaphore;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: b5.m0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0647m0 extends AbstractC0674x0 {

    /* renamed from: k, reason: collision with root package name */
    public static final AtomicLong f11187k = new AtomicLong(Long.MIN_VALUE);

    /* renamed from: c, reason: collision with root package name */
    public C0644l0 f11188c;

    /* renamed from: d, reason: collision with root package name */
    public C0644l0 f11189d;

    /* renamed from: e, reason: collision with root package name */
    public final PriorityBlockingQueue f11190e;

    /* renamed from: f, reason: collision with root package name */
    public final LinkedBlockingQueue f11191f;

    /* renamed from: g, reason: collision with root package name */
    public final C0638j0 f11192g;

    /* renamed from: h, reason: collision with root package name */
    public final C0638j0 f11193h;

    /* renamed from: i, reason: collision with root package name */
    public final Object f11194i;
    public final Semaphore j;

    public C0647m0(C0650n0 c0650n0) {
        super(c0650n0);
        this.f11194i = new Object();
        this.j = new Semaphore(2);
        this.f11190e = new PriorityBlockingQueue();
        this.f11191f = new LinkedBlockingQueue();
        this.f11192g = new C0638j0(this, "Thread death: Uncaught exception on worker thread");
        this.f11193h = new C0638j0(this, "Thread death: Uncaught exception on network thread");
    }

    @Override // D.n
    public final void l0() {
        if (Thread.currentThread() == this.f11188c) {
        } else {
            throw new IllegalStateException("Call expected from worker thread");
        }
    }

    @Override // b5.AbstractC0674x0
    public final boolean m0() {
        return false;
    }

    public final void p0() {
        if (Thread.currentThread() == this.f11189d) {
        } else {
            throw new IllegalStateException("Call expected from network thread");
        }
    }

    public final Object q0(AtomicReference atomicReference, long j, String str, Runnable runnable) {
        synchronized (atomicReference) {
            C0647m0 c0647m0 = ((C0650n0) this.f1707a).j;
            C0650n0.f(c0647m0);
            c0647m0.v0(runnable);
            try {
                atomicReference.wait(j);
            } catch (InterruptedException unused) {
                V v8 = ((C0650n0) this.f1707a).f11229i;
                C0650n0.f(v8);
                v8.f10974i.b("Interrupted waiting for ".concat(str));
                return null;
            }
        }
        Object obj = atomicReference.get();
        if (obj == null) {
            V v9 = ((C0650n0) this.f1707a).f11229i;
            C0650n0.f(v9);
            v9.f10974i.b("Timed out waiting for ".concat(str));
        }
        return obj;
    }

    public final C0641k0 r0(Callable callable) {
        n0();
        C0641k0 c0641k0 = new C0641k0(this, callable, false);
        if (Thread.currentThread() == this.f11188c) {
            if (!this.f11190e.isEmpty()) {
                V v8 = ((C0650n0) this.f1707a).f11229i;
                C0650n0.f(v8);
                v8.f10974i.b("Callable skipped the worker queue.");
            }
            c0641k0.run();
            return c0641k0;
        }
        y0(c0641k0);
        return c0641k0;
    }

    public final C0641k0 s0(Callable callable) {
        n0();
        C0641k0 c0641k0 = new C0641k0(this, callable, true);
        if (Thread.currentThread() == this.f11188c) {
            c0641k0.run();
            return c0641k0;
        }
        y0(c0641k0);
        return c0641k0;
    }

    public final void t0() {
        if (Thread.currentThread() != this.f11188c) {
        } else {
            throw new IllegalStateException("Call not expected from worker thread");
        }
    }

    public final void u0(Runnable runnable) {
        n0();
        C0641k0 c0641k0 = new C0641k0(this, runnable, false, "Task exception on network thread");
        synchronized (this.f11194i) {
            try {
                LinkedBlockingQueue linkedBlockingQueue = this.f11191f;
                linkedBlockingQueue.add(c0641k0);
                C0644l0 c0644l0 = this.f11189d;
                if (c0644l0 == null) {
                    C0644l0 c0644l02 = new C0644l0(this, "Measurement Network", linkedBlockingQueue);
                    this.f11189d = c0644l02;
                    c0644l02.setUncaughtExceptionHandler(this.f11193h);
                    this.f11189d.start();
                } else {
                    c0644l0.a();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void v0(Runnable runnable) {
        n0();
        F4.y.h(runnable);
        y0(new C0641k0(this, runnable, false, "Task exception on worker thread"));
    }

    public final void w0(Runnable runnable) {
        n0();
        y0(new C0641k0(this, runnable, true, "Task exception on worker thread"));
    }

    public final boolean x0() {
        if (Thread.currentThread() == this.f11188c) {
            return true;
        }
        return false;
    }

    public final void y0(C0641k0 c0641k0) {
        synchronized (this.f11194i) {
            try {
                PriorityBlockingQueue priorityBlockingQueue = this.f11190e;
                priorityBlockingQueue.add(c0641k0);
                C0644l0 c0644l0 = this.f11188c;
                if (c0644l0 == null) {
                    C0644l0 c0644l02 = new C0644l0(this, "Measurement Worker", priorityBlockingQueue);
                    this.f11188c = c0644l02;
                    c0644l02.setUncaughtExceptionHandler(this.f11192g);
                    this.f11188c.start();
                } else {
                    c0644l0.a();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
