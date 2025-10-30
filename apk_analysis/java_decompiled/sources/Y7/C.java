package Y7;

import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.LockSupport;

/* loaded from: classes.dex */
public final class C extends U implements Runnable {
    private static volatile Thread _thread;
    private static volatile int debugStatus;

    /* renamed from: i, reason: collision with root package name */
    public static final C f8758i;
    public static final long j;

    /* JADX WARN: Type inference failed for: r0v0, types: [Y7.C, Y7.U, Y7.V] */
    static {
        Long l9;
        ?? u9 = new U();
        f8758i = u9;
        u9.n0(false);
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        try {
            l9 = Long.getLong("kotlinx.coroutines.DefaultExecutor.keepAlive", 1000L);
        } catch (SecurityException unused) {
            l9 = 1000L;
        }
        j = timeUnit.toNanos(l9.longValue());
    }

    @Override // Y7.U, Y7.G
    public final M g(long j4, D0 d02, E7.i iVar) {
        long j9 = 0;
        if (j4 > 0) {
            if (j4 >= 9223372036854L) {
                j9 = Long.MAX_VALUE;
            } else {
                j9 = 1000000 * j4;
            }
        }
        if (j9 < 4611686018427387903L) {
            long nanoTime = System.nanoTime();
            Q q9 = new Q(j9 + nanoTime, d02);
            u0(nanoTime, q9);
            return q9;
        }
        return v0.f8859a;
    }

    @Override // Y7.V
    public final Thread m0() {
        Thread thread;
        Thread thread2 = _thread;
        if (thread2 == null) {
            synchronized (this) {
                thread = _thread;
                if (thread == null) {
                    thread = new Thread(this, "kotlinx.coroutines.DefaultExecutor");
                    _thread = thread;
                    thread.setContextClassLoader(C.class.getClassLoader());
                    thread.setDaemon(true);
                    thread.start();
                }
            }
            return thread;
        }
        return thread2;
    }

    @Override // Y7.V
    public final void q0(long j4, S s9) {
        throw new RejectedExecutionException("DefaultExecutor was shut down. This error indicates that Dispatchers.shutdown() was invoked prior to completion of exiting coroutines, leaving coroutines in incomplete state. Please refer to Dispatchers.shutdown documentation for more details");
    }

    @Override // Y7.U
    public final void r0(Runnable runnable) {
        if (debugStatus != 4) {
            super.r0(runnable);
            return;
        }
        throw new RejectedExecutionException("DefaultExecutor was shut down. This error indicates that Dispatchers.shutdown() was invoked prior to completion of exiting coroutines, leaving coroutines in incomplete state. Please refer to Dispatchers.shutdown documentation for more details");
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z9;
        boolean z10;
        boolean t02;
        A0.f8745a.set(this);
        try {
            synchronized (this) {
                int i9 = debugStatus;
                if (i9 != 2 && i9 != 3) {
                    z9 = false;
                } else {
                    z9 = true;
                }
                if (z9) {
                    if (!t02) {
                        return;
                    } else {
                        return;
                    }
                }
                debugStatus = 1;
                notifyAll();
                long j4 = Long.MAX_VALUE;
                while (true) {
                    Thread.interrupted();
                    long o02 = o0();
                    if (o02 == Long.MAX_VALUE) {
                        long nanoTime = System.nanoTime();
                        if (j4 == Long.MAX_VALUE) {
                            j4 = j + nanoTime;
                        }
                        long j9 = j4 - nanoTime;
                        if (j9 <= 0) {
                            _thread = null;
                            v0();
                            if (!t0()) {
                                m0();
                                return;
                            }
                            return;
                        }
                        if (o02 > j9) {
                            o02 = j9;
                        }
                    } else {
                        j4 = Long.MAX_VALUE;
                    }
                    if (o02 > 0) {
                        int i10 = debugStatus;
                        if (i10 != 2 && i10 != 3) {
                            z10 = false;
                        } else {
                            z10 = true;
                        }
                        if (z10) {
                            _thread = null;
                            v0();
                            if (!t0()) {
                                m0();
                                return;
                            }
                            return;
                        }
                        LockSupport.parkNanos(this, o02);
                    }
                }
            }
        } finally {
            _thread = null;
            v0();
            if (!t0()) {
                m0();
            }
        }
    }

    @Override // Y7.U, Y7.V
    public final void shutdown() {
        debugStatus = 4;
        super.shutdown();
    }

    public final synchronized void v0() {
        boolean z9;
        int i9 = debugStatus;
        if (i9 != 2 && i9 != 3) {
            z9 = false;
        } else {
            z9 = true;
        }
        if (!z9) {
            return;
        }
        debugStatus = 3;
        U.f8785f.set(this, null);
        U.f8786g.set(this, null);
        notifyAll();
    }
}
