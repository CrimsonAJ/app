package b5;

import java.util.concurrent.ScheduledExecutorService;

/* renamed from: b5.k1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC0642k1 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11172a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ G f11173b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ServiceConnectionC0645l1 f11174c;

    public /* synthetic */ RunnableC0642k1(ServiceConnectionC0645l1 serviceConnectionC0645l1, G g9, int i9) {
        this.f11172a = i9;
        this.f11173b = g9;
        this.f11174c = serviceConnectionC0645l1;
    }

    private final void a() {
        ServiceConnectionC0645l1 serviceConnectionC0645l1 = this.f11174c;
        synchronized (serviceConnectionC0645l1) {
            try {
                serviceConnectionC0645l1.f11182a = false;
                C0648m1 c0648m1 = serviceConnectionC0645l1.f11184c;
                if (!c0648m1.v0()) {
                    V v8 = ((C0650n0) c0648m1.f1707a).f11229i;
                    C0650n0.f(v8);
                    v8.f10978n.b("Connected to service");
                    G g9 = this.f11173b;
                    c0648m1.l0();
                    c0648m1.f11196d = g9;
                    c0648m1.B0();
                    c0648m1.A0();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        ScheduledExecutorService scheduledExecutorService;
        switch (this.f11172a) {
            case 0:
                a();
                return;
            default:
                ServiceConnectionC0645l1 serviceConnectionC0645l1 = this.f11174c;
                synchronized (serviceConnectionC0645l1) {
                    try {
                        serviceConnectionC0645l1.f11182a = false;
                        C0648m1 c0648m1 = serviceConnectionC0645l1.f11184c;
                        if (!c0648m1.v0()) {
                            V v8 = ((C0650n0) c0648m1.f1707a).f11229i;
                            C0650n0.f(v8);
                            v8.f10977m.b("Connected to remote service");
                            G g9 = this.f11173b;
                            c0648m1.l0();
                            c0648m1.f11196d = g9;
                            c0648m1.B0();
                            c0648m1.A0();
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                C0648m1 c0648m12 = this.f11174c.f11184c;
                if (((C0650n0) c0648m12.f1707a).f11227g.y0(null, E.f10681p1) && (scheduledExecutorService = c0648m12.f11199g) != null) {
                    scheduledExecutorService.shutdownNow();
                    c0648m12.f11199g = null;
                    return;
                }
                return;
        }
    }
}
