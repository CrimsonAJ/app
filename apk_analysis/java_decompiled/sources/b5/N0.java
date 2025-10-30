package b5;

import android.os.SystemClock;
import android.text.TextUtils;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class N0 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10813a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f10814b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ S0 f10815c;

    public /* synthetic */ N0(S0 s02, long j, int i9) {
        this.f10813a = i9;
        this.f10814b = j;
        this.f10815c = s02;
    }

    @Override // java.lang.Runnable
    public final void run() {
        long j;
        switch (this.f10813a) {
            case 0:
                C0650n0 c0650n0 = (C0650n0) this.f10815c.f1707a;
                C0623e0 c0623e0 = c0650n0.f11228h;
                C0650n0.d(c0623e0);
                C0617c0 c0617c0 = c0623e0.f11092l;
                long j4 = this.f10814b;
                c0617c0.g(j4);
                V v8 = c0650n0.f11229i;
                C0650n0.f(v8);
                v8.f10977m.c(Long.valueOf(j4), "Session timeout duration set");
                return;
            default:
                S0 s02 = this.f10815c;
                s02.l0();
                s02.m0();
                C0650n0 c0650n02 = (C0650n0) s02.f1707a;
                V v9 = c0650n02.f11229i;
                C0650n0.f(v9);
                v9.f10977m.b("Resetting analytics data (FE)");
                t1 t1Var = c0650n02.f11230k;
                C0650n0.e(t1Var);
                t1Var.l0();
                N3.X x5 = t1Var.f11319f;
                ((s1) x5.f5023c).a();
                C0650n0 c0650n03 = (C0650n0) ((t1) x5.f5024d).f1707a;
                if (c0650n03.f11227g.y0(null, E.f10643c1)) {
                    c0650n03.f11233n.getClass();
                    j = SystemClock.elapsedRealtime();
                    x5.f5021a = j;
                } else {
                    x5.f5021a = 0L;
                    j = 0;
                }
                x5.f5022b = j;
                c0650n02.i().t0();
                boolean z9 = !c0650n02.a();
                C0623e0 c0623e02 = c0650n02.f11228h;
                C0650n0.d(c0623e02);
                c0623e02.f11088g.g(this.f10814b);
                C0650n0 c0650n04 = (C0650n0) c0623e02.f1707a;
                C0623e0 c0623e03 = c0650n04.f11228h;
                C0650n0.d(c0623e03);
                if (!TextUtils.isEmpty(c0623e03.f11103w.m())) {
                    c0623e02.f11103w.n(null);
                }
                c0623e02.f11097q.g(0L);
                c0623e02.f11098r.g(0L);
                if (!c0650n04.f11227g.m0()) {
                    c0623e02.t0(z9);
                }
                c0623e02.f11104x.n(null);
                c0623e02.f11105y.g(0L);
                c0623e02.f11106z.A(null);
                C0648m1 m9 = c0650n02.m();
                m9.l0();
                m9.m0();
                Q1 z02 = m9.z0(false);
                m9.D0();
                ((C0650n0) m9.f1707a).j().q0();
                m9.C0(new RunnableC0636i1(m9, z02, 0));
                C0650n0.e(t1Var);
                t1Var.f11318e.L();
                s02.f10958s = z9;
                c0650n02.m().r0(new AtomicReference());
                return;
        }
    }
}
