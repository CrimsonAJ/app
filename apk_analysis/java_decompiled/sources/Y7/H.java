package Y7;

import com.google.android.gms.internal.measurement.D1;
import d8.AbstractC1130a;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* loaded from: classes.dex */
public final class H extends d8.t {

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f8767e = AtomicIntegerFieldUpdater.newUpdater(H.class, "_decision$volatile");
    private volatile /* synthetic */ int _decision$volatile;

    @Override // d8.t, Y7.r0
    public final void m(Object obj) {
        n(obj);
    }

    @Override // d8.t, Y7.r0
    public final void n(Object obj) {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        do {
            atomicIntegerFieldUpdater = f8767e;
            int i9 = atomicIntegerFieldUpdater.get(this);
            if (i9 != 0) {
                if (i9 == 1) {
                    AbstractC1130a.h(D1.A(this.f17005d), B.t(obj));
                    return;
                }
                throw new IllegalStateException("Already resumed");
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, 0, 2));
    }
}
