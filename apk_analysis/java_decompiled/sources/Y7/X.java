package Y7;

import java.lang.reflect.Method;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class X extends W implements G {

    /* renamed from: b, reason: collision with root package name */
    public final Executor f8792b;

    public X(Executor executor) {
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor;
        Method method;
        this.f8792b = executor;
        Method method2 = d8.c.f16973a;
        try {
            if (executor instanceof ScheduledThreadPoolExecutor) {
                scheduledThreadPoolExecutor = (ScheduledThreadPoolExecutor) executor;
            } else {
                scheduledThreadPoolExecutor = null;
            }
            if (scheduledThreadPoolExecutor != null && (method = d8.c.f16973a) != null) {
                method.invoke(scheduledThreadPoolExecutor, Boolean.TRUE);
            }
        } catch (Throwable unused) {
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        ExecutorService executorService;
        Executor executor = this.f8792b;
        if (executor instanceof ExecutorService) {
            executorService = (ExecutorService) executor;
        } else {
            executorService = null;
        }
        if (executorService != null) {
            executorService.shutdown();
        }
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof X) && ((X) obj).f8792b == this.f8792b) {
            return true;
        }
        return false;
    }

    @Override // Y7.G
    public final M g(long j, D0 d02, E7.i iVar) {
        ScheduledExecutorService scheduledExecutorService;
        Executor executor = this.f8792b;
        ScheduledFuture<?> scheduledFuture = null;
        if (executor instanceof ScheduledExecutorService) {
            scheduledExecutorService = (ScheduledExecutorService) executor;
        } else {
            scheduledExecutorService = null;
        }
        if (scheduledExecutorService != null) {
            try {
                scheduledFuture = scheduledExecutorService.schedule(d02, j, TimeUnit.MILLISECONDS);
            } catch (RejectedExecutionException e8) {
                CancellationException cancellationException = new CancellationException("The task was rejected");
                cancellationException.initCause(e8);
                InterfaceC0465h0 interfaceC0465h0 = (InterfaceC0465h0) iVar.get(C0463g0.f8811a);
                if (interfaceC0465h0 != null) {
                    interfaceC0465h0.d(cancellationException);
                }
            }
        }
        if (scheduledFuture != null) {
            return new L(scheduledFuture);
        }
        return C.f8758i.g(j, d02, iVar);
    }

    @Override // Y7.AbstractC0480v
    public final void g0(E7.i iVar, Runnable runnable) {
        try {
            this.f8792b.execute(runnable);
        } catch (RejectedExecutionException e8) {
            CancellationException cancellationException = new CancellationException("The task was rejected");
            cancellationException.initCause(e8);
            InterfaceC0465h0 interfaceC0465h0 = (InterfaceC0465h0) iVar.get(C0463g0.f8811a);
            if (interfaceC0465h0 != null) {
                interfaceC0465h0.d(cancellationException);
            }
            K.f8774b.g0(iVar, runnable);
        }
    }

    public final int hashCode() {
        return System.identityHashCode(this.f8792b);
    }

    @Override // Y7.W
    public final Executor k0() {
        return this.f8792b;
    }

    @Override // Y7.AbstractC0480v
    public final String toString() {
        return this.f8792b.toString();
    }

    @Override // Y7.G
    public final void x(long j, C0464h c0464h) {
        ScheduledExecutorService scheduledExecutorService;
        Executor executor = this.f8792b;
        ScheduledFuture<?> scheduledFuture = null;
        if (executor instanceof ScheduledExecutorService) {
            scheduledExecutorService = (ScheduledExecutorService) executor;
        } else {
            scheduledExecutorService = null;
        }
        if (scheduledExecutorService != null) {
            try {
                scheduledFuture = scheduledExecutorService.schedule(new S5.o(this, 13, c0464h), j, TimeUnit.MILLISECONDS);
            } catch (RejectedExecutionException e8) {
                CancellationException cancellationException = new CancellationException("The task was rejected");
                cancellationException.initCause(e8);
                InterfaceC0465h0 interfaceC0465h0 = (InterfaceC0465h0) c0464h.f8816e.get(C0463g0.f8811a);
                if (interfaceC0465h0 != null) {
                    interfaceC0465h0.d(cancellationException);
                }
            }
        }
        if (scheduledFuture != null) {
            c0464h.v(new C0460f(0, scheduledFuture));
        } else {
            C.f8758i.x(j, c0464h);
        }
    }
}
