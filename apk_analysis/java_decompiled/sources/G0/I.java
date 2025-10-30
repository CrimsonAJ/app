package G0;

import f5.ExecutorC1184p;
import java.util.ArrayDeque;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class I implements Executor {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2666a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f2667b;

    /* renamed from: c, reason: collision with root package name */
    public final ArrayDeque f2668c;

    /* renamed from: d, reason: collision with root package name */
    public Runnable f2669d;

    /* renamed from: e, reason: collision with root package name */
    public final Executor f2670e;

    public I(Executor executor) {
        this.f2666a = 0;
        kotlin.jvm.internal.h.e(executor, "executor");
        this.f2670e = executor;
        this.f2668c = new ArrayDeque();
        this.f2667b = new Object();
    }

    private final void a(Runnable command) {
        kotlin.jvm.internal.h.e(command, "command");
        synchronized (this.f2667b) {
            this.f2668c.offer(new A6.r(command, 4, this));
            if (this.f2669d == null) {
                b();
            }
        }
    }

    private final void c() {
        synchronized (this.f2667b) {
            Object poll = this.f2668c.poll();
            Runnable runnable = (Runnable) poll;
            this.f2669d = runnable;
            if (poll != null) {
                this.f2670e.execute(runnable);
            }
        }
    }

    public final void b() {
        switch (this.f2666a) {
            case 0:
                c();
                return;
            default:
                synchronized (this.f2667b) {
                    try {
                        Runnable runnable = (Runnable) this.f2668c.poll();
                        this.f2669d = runnable;
                        if (runnable != null) {
                            ((ExecutorC1184p) this.f2670e).execute(runnable);
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return;
        }
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        switch (this.f2666a) {
            case 0:
                a(runnable);
                return;
            default:
                synchronized (this.f2667b) {
                    try {
                        this.f2668c.add(new A6.r(this, 13, runnable));
                        if (this.f2669d == null) {
                            b();
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return;
        }
    }

    public I(ExecutorC1184p executorC1184p) {
        this.f2666a = 1;
        this.f2667b = new Object();
        this.f2668c = new ArrayDeque();
        this.f2670e = executorC1184p;
    }
}
