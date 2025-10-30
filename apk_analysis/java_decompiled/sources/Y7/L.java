package Y7;

import java.util.concurrent.ScheduledFuture;

/* loaded from: classes.dex */
public final class L implements M {

    /* renamed from: a, reason: collision with root package name */
    public final ScheduledFuture f8775a;

    public L(ScheduledFuture scheduledFuture) {
        this.f8775a = scheduledFuture;
    }

    @Override // Y7.M
    public final void b() {
        this.f8775a.cancel(false);
    }

    public final String toString() {
        return "DisposableFutureHandle[" + this.f8775a + ']';
    }
}
