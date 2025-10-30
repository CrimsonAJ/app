package t6;

import F4.y;
import d2.v;
import java.util.ArrayDeque;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.logging.Logger;

/* renamed from: t6.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ExecutorC2025j implements Executor {

    /* renamed from: f, reason: collision with root package name */
    public static final Logger f23312f = Logger.getLogger(ExecutorC2025j.class.getName());

    /* renamed from: a, reason: collision with root package name */
    public final Executor f23313a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayDeque f23314b = new ArrayDeque();

    /* renamed from: c, reason: collision with root package name */
    public int f23315c = 1;

    /* renamed from: d, reason: collision with root package name */
    public long f23316d = 0;

    /* renamed from: e, reason: collision with root package name */
    public final v f23317e = new v(this);

    public ExecutorC2025j(Executor executor) {
        y.h(executor);
        this.f23313a = executor;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        y.h(runnable);
        synchronized (this.f23314b) {
            int i9 = this.f23315c;
            if (i9 != 4 && i9 != 3) {
                long j = this.f23316d;
                L4.b bVar = new L4.b(runnable, 2);
                this.f23314b.add(bVar);
                this.f23315c = 2;
                try {
                    this.f23313a.execute(this.f23317e);
                    if (this.f23315c == 2) {
                        synchronized (this.f23314b) {
                            try {
                                if (this.f23316d == j && this.f23315c == 2) {
                                    this.f23315c = 3;
                                }
                            } finally {
                            }
                        }
                        return;
                    }
                    return;
                } catch (Error | RuntimeException e8) {
                    synchronized (this.f23314b) {
                        try {
                            int i10 = this.f23315c;
                            boolean z9 = true;
                            if ((i10 != 1 && i10 != 2) || !this.f23314b.removeLastOccurrence(bVar)) {
                                z9 = false;
                            }
                            if (!(e8 instanceof RejectedExecutionException) || z9) {
                                throw e8;
                            }
                        } finally {
                        }
                    }
                    return;
                }
            }
            this.f23314b.add(runnable);
        }
    }

    public final String toString() {
        return "SequentialExecutor@" + System.identityHashCode(this) + "{" + this.f23313a + "}";
    }
}
