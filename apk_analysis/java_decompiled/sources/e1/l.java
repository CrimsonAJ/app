package e1;

import Y7.k0;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import p1.C1838a;
import p1.C1847j;

/* loaded from: classes.dex */
public final class l implements S5.p {

    /* renamed from: a, reason: collision with root package name */
    public final C1847j f17057a = new Object();

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, p1.j] */
    public l(k0 k0Var) {
        k0Var.O(new C0.b(2, this));
    }

    @Override // S5.p
    public final void a(Runnable runnable, Executor executor) {
        this.f17057a.a(runnable, executor);
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z9) {
        return this.f17057a.cancel(z9);
    }

    @Override // java.util.concurrent.Future
    public final Object get() {
        return this.f17057a.get();
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.f17057a.f22131a instanceof C1838a;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return this.f17057a.isDone();
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j, TimeUnit timeUnit) {
        return this.f17057a.get(j, timeUnit);
    }
}
