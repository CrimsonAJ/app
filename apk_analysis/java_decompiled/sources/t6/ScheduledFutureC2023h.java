package t6;

import com.google.firebase.messaging.u;
import java.util.concurrent.Delayed;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import u.C2027a;

/* renamed from: t6.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ScheduledFutureC2023h extends u.g implements ScheduledFuture {

    /* renamed from: h, reason: collision with root package name */
    public final ScheduledFuture f23309h;

    public ScheduledFutureC2023h(InterfaceC2022g interfaceC2022g) {
        this.f23309h = interfaceC2022g.a(new u(this));
    }

    @Override // u.g
    public final void c() {
        boolean z9;
        ScheduledFuture scheduledFuture = this.f23309h;
        Object obj = this.f23356a;
        if ((obj instanceof C2027a) && ((C2027a) obj).f23338a) {
            z9 = true;
        } else {
            z9 = false;
        }
        scheduledFuture.cancel(z9);
    }

    @Override // java.lang.Comparable
    public final int compareTo(Delayed delayed) {
        return this.f23309h.compareTo(delayed);
    }

    @Override // java.util.concurrent.Delayed
    public final long getDelay(TimeUnit timeUnit) {
        return this.f23309h.getDelay(timeUnit);
    }
}
