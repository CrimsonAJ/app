package o1;

import d2.v;
import java.util.ArrayDeque;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;

/* loaded from: classes.dex */
public final class i implements Executor {

    /* renamed from: b, reason: collision with root package name */
    public final ExecutorService f21477b;

    /* renamed from: d, reason: collision with root package name */
    public volatile Runnable f21479d;

    /* renamed from: a, reason: collision with root package name */
    public final ArrayDeque f21476a = new ArrayDeque();

    /* renamed from: c, reason: collision with root package name */
    public final Object f21478c = new Object();

    public i(ExecutorService executorService) {
        this.f21477b = executorService;
    }

    public final boolean a() {
        boolean z9;
        synchronized (this.f21478c) {
            z9 = !this.f21476a.isEmpty();
        }
        return z9;
    }

    public final void b() {
        synchronized (this.f21478c) {
            try {
                Runnable runnable = (Runnable) this.f21476a.poll();
                this.f21479d = runnable;
                if (runnable != null) {
                    this.f21477b.execute(this.f21479d);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        synchronized (this.f21478c) {
            try {
                this.f21476a.add(new v(this, runnable, 13, false));
                if (this.f21479d == null) {
                    b();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
