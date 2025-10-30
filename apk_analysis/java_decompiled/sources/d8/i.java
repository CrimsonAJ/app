package d8;

import Y7.AbstractC0480v;
import Y7.C0464h;
import Y7.D;
import Y7.D0;
import Y7.G;
import Y7.M;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* loaded from: classes.dex */
public final class i extends AbstractC0480v implements G {

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f16984g = AtomicIntegerFieldUpdater.newUpdater(i.class, "runningWorkers$volatile");

    /* renamed from: b, reason: collision with root package name */
    public final AbstractC0480v f16985b;

    /* renamed from: c, reason: collision with root package name */
    public final int f16986c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ G f16987d;

    /* renamed from: e, reason: collision with root package name */
    public final l f16988e;

    /* renamed from: f, reason: collision with root package name */
    public final Object f16989f;
    private volatile /* synthetic */ int runningWorkers$volatile;

    /* JADX WARN: Multi-variable type inference failed */
    public i(AbstractC0480v abstractC0480v, int i9) {
        G g9;
        this.f16985b = abstractC0480v;
        this.f16986c = i9;
        if (abstractC0480v instanceof G) {
            g9 = (G) abstractC0480v;
        } else {
            g9 = null;
        }
        this.f16987d = g9 == null ? D.f8760a : g9;
        this.f16988e = new l();
        this.f16989f = new Object();
    }

    @Override // Y7.G
    public final M g(long j, D0 d02, E7.i iVar) {
        return this.f16987d.g(j, d02, iVar);
    }

    @Override // Y7.AbstractC0480v
    public final void g0(E7.i iVar, Runnable runnable) {
        Runnable k02;
        this.f16988e.a(runnable);
        if (f16984g.get(this) < this.f16986c && l0() && (k02 = k0()) != null) {
            this.f16985b.g0(this, new d2.v(this, 1, k02));
        }
    }

    @Override // Y7.AbstractC0480v
    public final void h0(E7.i iVar, Runnable runnable) {
        Runnable k02;
        this.f16988e.a(runnable);
        if (f16984g.get(this) < this.f16986c && l0() && (k02 = k0()) != null) {
            this.f16985b.h0(this, new d2.v(this, 1, k02));
        }
    }

    @Override // Y7.AbstractC0480v
    public final AbstractC0480v j0(int i9) {
        AbstractC1130a.a(1);
        if (1 >= this.f16986c) {
            return this;
        }
        return super.j0(1);
    }

    public final Runnable k0() {
        while (true) {
            Runnable runnable = (Runnable) this.f16988e.d();
            if (runnable == null) {
                synchronized (this.f16989f) {
                    AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f16984g;
                    atomicIntegerFieldUpdater.decrementAndGet(this);
                    if (this.f16988e.c() == 0) {
                        return null;
                    }
                    atomicIntegerFieldUpdater.incrementAndGet(this);
                }
            } else {
                return runnable;
            }
        }
    }

    public final boolean l0() {
        synchronized (this.f16989f) {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f16984g;
            if (atomicIntegerFieldUpdater.get(this) >= this.f16986c) {
                return false;
            }
            atomicIntegerFieldUpdater.incrementAndGet(this);
            return true;
        }
    }

    @Override // Y7.G
    public final void x(long j, C0464h c0464h) {
        this.f16987d.x(j, c0464h);
    }
}
