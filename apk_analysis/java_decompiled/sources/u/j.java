package u;

import S5.p;
import java.lang.ref.WeakReference;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class j implements p {

    /* renamed from: a, reason: collision with root package name */
    public final WeakReference f23364a;

    /* renamed from: b, reason: collision with root package name */
    public final i f23365b = new i(this);

    public j(h hVar) {
        this.f23364a = new WeakReference(hVar);
    }

    @Override // S5.p
    public final void a(Runnable runnable, Executor executor) {
        this.f23365b.a(runnable, executor);
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z9) {
        h hVar = (h) this.f23364a.get();
        boolean cancel = this.f23365b.cancel(z9);
        if (cancel && hVar != null) {
            hVar.f23359a = null;
            hVar.f23360b = null;
            hVar.f23361c.j(null);
        }
        return cancel;
    }

    @Override // java.util.concurrent.Future
    public final Object get() {
        return this.f23365b.get();
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.f23365b.f23356a instanceof C2027a;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return this.f23365b.isDone();
    }

    public final String toString() {
        return this.f23365b.toString();
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j, TimeUnit timeUnit) {
        return this.f23365b.get(j, timeUnit);
    }
}
