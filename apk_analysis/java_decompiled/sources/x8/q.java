package x8;

import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class q extends K {

    /* renamed from: e, reason: collision with root package name */
    public K f24667e;

    public q(K delegate) {
        kotlin.jvm.internal.h.e(delegate, "delegate");
        this.f24667e = delegate;
    }

    @Override // x8.K
    public final K a() {
        return this.f24667e.a();
    }

    @Override // x8.K
    public final K b() {
        return this.f24667e.b();
    }

    @Override // x8.K
    public final long c() {
        return this.f24667e.c();
    }

    @Override // x8.K
    public final K d(long j) {
        return this.f24667e.d(j);
    }

    @Override // x8.K
    public final boolean e() {
        return this.f24667e.e();
    }

    @Override // x8.K
    public final void f() {
        this.f24667e.f();
    }

    @Override // x8.K
    public final K g(long j) {
        TimeUnit unit = TimeUnit.MILLISECONDS;
        kotlin.jvm.internal.h.e(unit, "unit");
        return this.f24667e.g(j);
    }
}
