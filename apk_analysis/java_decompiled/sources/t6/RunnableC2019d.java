package t6;

import com.google.firebase.messaging.u;

/* renamed from: t6.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC2019d implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f23300a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ScheduledExecutorServiceC2021f f23301b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Runnable f23302c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ u f23303d;

    public /* synthetic */ RunnableC2019d(ScheduledExecutorServiceC2021f scheduledExecutorServiceC2021f, Runnable runnable, u uVar, int i9) {
        this.f23300a = i9;
        this.f23301b = scheduledExecutorServiceC2021f;
        this.f23302c = runnable;
        this.f23303d = uVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f23300a) {
            case 0:
                ScheduledExecutorServiceC2021f scheduledExecutorServiceC2021f = this.f23301b;
                final u uVar = this.f23303d;
                final Runnable runnable = this.f23302c;
                final int i9 = 0;
                scheduledExecutorServiceC2021f.f23307a.execute(new Runnable() { // from class: t6.b
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i9) {
                            case 0:
                                try {
                                    runnable.run();
                                    return;
                                } catch (Exception e8) {
                                    ((ScheduledFutureC2023h) uVar.f16512a).k(e8);
                                    throw e8;
                                }
                            case 1:
                                try {
                                    runnable.run();
                                    return;
                                } catch (Exception e9) {
                                    ((ScheduledFutureC2023h) uVar.f16512a).k(e9);
                                    return;
                                }
                            default:
                                Runnable runnable2 = runnable;
                                ScheduledFutureC2023h scheduledFutureC2023h = (ScheduledFutureC2023h) uVar.f16512a;
                                try {
                                    runnable2.run();
                                    scheduledFutureC2023h.j(null);
                                    return;
                                } catch (Exception e10) {
                                    scheduledFutureC2023h.k(e10);
                                    return;
                                }
                        }
                    }
                });
                return;
            case 1:
                ScheduledExecutorServiceC2021f scheduledExecutorServiceC2021f2 = this.f23301b;
                final u uVar2 = this.f23303d;
                final Runnable runnable2 = this.f23302c;
                final int i10 = 2;
                scheduledExecutorServiceC2021f2.f23307a.execute(new Runnable() { // from class: t6.b
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i10) {
                            case 0:
                                try {
                                    runnable2.run();
                                    return;
                                } catch (Exception e8) {
                                    ((ScheduledFutureC2023h) uVar2.f16512a).k(e8);
                                    throw e8;
                                }
                            case 1:
                                try {
                                    runnable2.run();
                                    return;
                                } catch (Exception e9) {
                                    ((ScheduledFutureC2023h) uVar2.f16512a).k(e9);
                                    return;
                                }
                            default:
                                Runnable runnable22 = runnable2;
                                ScheduledFutureC2023h scheduledFutureC2023h = (ScheduledFutureC2023h) uVar2.f16512a;
                                try {
                                    runnable22.run();
                                    scheduledFutureC2023h.j(null);
                                    return;
                                } catch (Exception e10) {
                                    scheduledFutureC2023h.k(e10);
                                    return;
                                }
                        }
                    }
                });
                return;
            default:
                ScheduledExecutorServiceC2021f scheduledExecutorServiceC2021f3 = this.f23301b;
                final u uVar3 = this.f23303d;
                final Runnable runnable3 = this.f23302c;
                final int i11 = 1;
                scheduledExecutorServiceC2021f3.f23307a.execute(new Runnable() { // from class: t6.b
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i11) {
                            case 0:
                                try {
                                    runnable3.run();
                                    return;
                                } catch (Exception e8) {
                                    ((ScheduledFutureC2023h) uVar3.f16512a).k(e8);
                                    throw e8;
                                }
                            case 1:
                                try {
                                    runnable3.run();
                                    return;
                                } catch (Exception e9) {
                                    ((ScheduledFutureC2023h) uVar3.f16512a).k(e9);
                                    return;
                                }
                            default:
                                Runnable runnable22 = runnable3;
                                ScheduledFutureC2023h scheduledFutureC2023h = (ScheduledFutureC2023h) uVar3.f16512a;
                                try {
                                    runnable22.run();
                                    scheduledFutureC2023h.j(null);
                                    return;
                                } catch (Exception e10) {
                                    scheduledFutureC2023h.k(e10);
                                    return;
                                }
                        }
                    }
                });
                return;
        }
    }
}
