package t6;

import com.google.firebase.messaging.u;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* renamed from: t6.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C2018c implements InterfaceC2022g {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f23294a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ScheduledExecutorServiceC2021f f23295b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Runnable f23296c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f23297d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f23298e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ TimeUnit f23299f;

    public /* synthetic */ C2018c(ScheduledExecutorServiceC2021f scheduledExecutorServiceC2021f, Runnable runnable, long j, long j4, TimeUnit timeUnit, int i9) {
        this.f23294a = i9;
        this.f23295b = scheduledExecutorServiceC2021f;
        this.f23296c = runnable;
        this.f23297d = j;
        this.f23298e = j4;
        this.f23299f = timeUnit;
    }

    @Override // t6.InterfaceC2022g
    public final ScheduledFuture a(u uVar) {
        switch (this.f23294a) {
            case 0:
                ScheduledExecutorServiceC2021f scheduledExecutorServiceC2021f = this.f23295b;
                return scheduledExecutorServiceC2021f.f23308b.scheduleAtFixedRate(new RunnableC2019d(scheduledExecutorServiceC2021f, this.f23296c, uVar, 0), this.f23297d, this.f23298e, this.f23299f);
            default:
                ScheduledExecutorServiceC2021f scheduledExecutorServiceC2021f2 = this.f23295b;
                return scheduledExecutorServiceC2021f2.f23308b.scheduleWithFixedDelay(new RunnableC2019d(scheduledExecutorServiceC2021f2, this.f23296c, uVar, 2), this.f23297d, this.f23298e, this.f23299f);
        }
    }
}
