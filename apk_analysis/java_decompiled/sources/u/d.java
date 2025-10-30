package u;

import com.google.android.gms.internal.measurement.AbstractC1002u1;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes.dex */
public final class d extends AbstractC1002u1 {

    /* renamed from: g, reason: collision with root package name */
    public final AtomicReferenceFieldUpdater f23345g;

    /* renamed from: h, reason: collision with root package name */
    public final AtomicReferenceFieldUpdater f23346h;

    /* renamed from: i, reason: collision with root package name */
    public final AtomicReferenceFieldUpdater f23347i;
    public final AtomicReferenceFieldUpdater j;

    /* renamed from: k, reason: collision with root package name */
    public final AtomicReferenceFieldUpdater f23348k;

    public d(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater5) {
        this.f23345g = atomicReferenceFieldUpdater;
        this.f23346h = atomicReferenceFieldUpdater2;
        this.f23347i = atomicReferenceFieldUpdater3;
        this.j = atomicReferenceFieldUpdater4;
        this.f23348k = atomicReferenceFieldUpdater5;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC1002u1
    public final void T(f fVar, f fVar2) {
        this.f23346h.lazySet(fVar, fVar2);
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC1002u1
    public final void V(f fVar, Thread thread) {
        this.f23345g.lazySet(fVar, thread);
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC1002u1
    public final boolean c(g gVar, c cVar, c cVar2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.j;
            if (atomicReferenceFieldUpdater.compareAndSet(gVar, cVar, cVar2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(gVar) == cVar);
        return false;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC1002u1
    public final boolean e(g gVar, Object obj, Object obj2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.f23348k;
            if (atomicReferenceFieldUpdater.compareAndSet(gVar, obj, obj2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(gVar) == obj);
        return false;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC1002u1
    public final boolean g(g gVar, f fVar, f fVar2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.f23347i;
            if (atomicReferenceFieldUpdater.compareAndSet(gVar, fVar, fVar2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(gVar) == fVar);
        return false;
    }
}
