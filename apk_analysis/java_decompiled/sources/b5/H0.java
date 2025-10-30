package b5;

import android.os.Bundle;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final /* synthetic */ class H0 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10720a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ S0 f10721b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ AtomicReference f10722c;

    public /* synthetic */ H0(S0 s02, AtomicReference atomicReference, int i9) {
        this.f10720a = i9;
        this.f10721b = s02;
        this.f10722c = atomicReference;
    }

    private final void a() {
        AtomicReference atomicReference = this.f10722c;
        synchronized (atomicReference) {
            try {
                try {
                    C0650n0 c0650n0 = (C0650n0) this.f10721b.f1707a;
                    atomicReference.set(Boolean.valueOf(c0650n0.f11227g.y0(c0650n0.i().r0(), E.f10636a0)));
                } finally {
                    this.f10722c.notify();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private final void b() {
        AtomicReference atomicReference = this.f10722c;
        synchronized (atomicReference) {
            try {
                try {
                    C0650n0 c0650n0 = (C0650n0) this.f10721b.f1707a;
                    atomicReference.set(c0650n0.f11227g.x0(c0650n0.i().r0(), E.f10639b0));
                } finally {
                    this.f10722c.notify();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private final void c() {
        AtomicReference atomicReference = this.f10722c;
        synchronized (atomicReference) {
            try {
                try {
                    C0650n0 c0650n0 = (C0650n0) this.f10721b.f1707a;
                    atomicReference.set(Long.valueOf(c0650n0.f11227g.t0(c0650n0.i().r0(), E.f10642c0)));
                } finally {
                    this.f10722c.notify();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private final void d() {
        AtomicReference atomicReference = this.f10722c;
        synchronized (atomicReference) {
            try {
                try {
                    C0650n0 c0650n0 = (C0650n0) this.f10721b.f1707a;
                    atomicReference.set(Integer.valueOf(c0650n0.f11227g.r0(c0650n0.i().r0(), E.f10645d0)));
                } finally {
                    this.f10722c.notify();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f10720a) {
            case 0:
                S0 s02 = this.f10721b;
                C0623e0 c0623e0 = ((C0650n0) s02.f1707a).f11228h;
                C0650n0.d(c0623e0);
                Bundle w7 = c0623e0.f11095o.w();
                C0648m1 m9 = ((C0650n0) s02.f1707a).m();
                m9.l0();
                m9.m0();
                m9.C0(new RunnableC0659q0((Object) m9, (Serializable) this.f10722c, (G4.a) m9.z0(false), (Object) w7, 4));
                return;
            case 1:
                C0648m1 m10 = ((C0650n0) this.f10721b.f1707a).m();
                Z0[] z0Arr = {Z0.SGTM_CLIENT};
                ArrayList arrayList = new ArrayList(1);
                arrayList.add(Integer.valueOf(z0Arr[0].f11011a));
                B1 b12 = new B1(arrayList);
                m10.l0();
                m10.m0();
                m10.C0(new RunnableC0659q0(m10, this.f10722c, m10.z0(false), b12));
                return;
            case 2:
                a();
                return;
            case 3:
                b();
                return;
            case 4:
                c();
                return;
            case 5:
                d();
                return;
            default:
                AtomicReference atomicReference = this.f10722c;
                synchronized (atomicReference) {
                    try {
                        try {
                            C0650n0 c0650n0 = (C0650n0) this.f10721b.f1707a;
                            atomicReference.set(Double.valueOf(c0650n0.f11227g.q0(c0650n0.i().r0(), E.f10648e0)));
                        } finally {
                            this.f10722c.notify();
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return;
        }
    }
}
