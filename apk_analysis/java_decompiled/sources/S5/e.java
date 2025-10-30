package S5;

import com.google.android.gms.internal.measurement.AbstractC1002u1;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes.dex */
public final class e extends AbstractC1002u1 {

    /* renamed from: g, reason: collision with root package name */
    public final AtomicReferenceFieldUpdater f6944g;

    /* renamed from: h, reason: collision with root package name */
    public final AtomicReferenceFieldUpdater f6945h;

    /* renamed from: i, reason: collision with root package name */
    public final AtomicReferenceFieldUpdater f6946i;
    public final AtomicReferenceFieldUpdater j;

    /* renamed from: k, reason: collision with root package name */
    public final AtomicReferenceFieldUpdater f6947k;

    public e(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater5) {
        this.f6944g = atomicReferenceFieldUpdater;
        this.f6945h = atomicReferenceFieldUpdater2;
        this.f6946i = atomicReferenceFieldUpdater3;
        this.j = atomicReferenceFieldUpdater4;
        this.f6947k = atomicReferenceFieldUpdater5;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC1002u1
    public final d C(n nVar) {
        return (d) this.j.getAndSet(nVar, d.f6940d);
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC1002u1
    public final m D(n nVar) {
        return (m) this.f6946i.getAndSet(nVar, m.f6953c);
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC1002u1
    public final void S(m mVar, m mVar2) {
        this.f6945h.lazySet(mVar, mVar2);
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC1002u1
    public final void U(m mVar, Thread thread) {
        this.f6944g.lazySet(mVar, thread);
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC1002u1
    public final boolean b(n nVar, d dVar, d dVar2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.j;
            if (atomicReferenceFieldUpdater.compareAndSet(nVar, dVar, dVar2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(nVar) == dVar);
        return false;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC1002u1
    public final boolean d(n nVar, Object obj, Object obj2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.f6947k;
            if (atomicReferenceFieldUpdater.compareAndSet(nVar, obj, obj2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(nVar) == obj);
        return false;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC1002u1
    public final boolean f(n nVar, m mVar, m mVar2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.f6946i;
            if (atomicReferenceFieldUpdater.compareAndSet(nVar, mVar, mVar2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(nVar) == mVar);
        return false;
    }
}
