package z6;

import f5.C1185q;
import j2.C1435b;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import s8.n;
import y6.j;

/* loaded from: classes.dex */
public final class b implements Executor {

    /* renamed from: a, reason: collision with root package name */
    public final ExecutorService f25501a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f25502b = new Object();

    /* renamed from: c, reason: collision with root package name */
    public C1185q f25503c = n.p(null);

    public b(ExecutorService executorService) {
        this.f25501a = executorService;
    }

    public final C1185q a(Runnable runnable) {
        C1185q e8;
        synchronized (this.f25502b) {
            e8 = this.f25503c.e(this.f25501a, new C1435b(24, runnable));
            this.f25503c = e8;
        }
        return e8;
    }

    public final C1185q b(j jVar) {
        C1185q e8;
        synchronized (this.f25502b) {
            e8 = this.f25503c.e(this.f25501a, new C1435b(23, jVar));
            this.f25503c = e8;
        }
        return e8;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.f25501a.execute(runnable);
    }
}
