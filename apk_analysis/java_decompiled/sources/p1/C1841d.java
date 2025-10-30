package p1;

import com.google.android.gms.internal.measurement.Y1;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* renamed from: p1.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1841d extends Y1 {

    /* renamed from: n, reason: collision with root package name */
    public final AtomicReferenceFieldUpdater f22117n;

    /* renamed from: o, reason: collision with root package name */
    public final AtomicReferenceFieldUpdater f22118o;

    /* renamed from: p, reason: collision with root package name */
    public final AtomicReferenceFieldUpdater f22119p;

    /* renamed from: q, reason: collision with root package name */
    public final AtomicReferenceFieldUpdater f22120q;

    /* renamed from: r, reason: collision with root package name */
    public final AtomicReferenceFieldUpdater f22121r;

    public C1841d(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater5) {
        this.f22117n = atomicReferenceFieldUpdater;
        this.f22118o = atomicReferenceFieldUpdater2;
        this.f22119p = atomicReferenceFieldUpdater3;
        this.f22120q = atomicReferenceFieldUpdater4;
        this.f22121r = atomicReferenceFieldUpdater5;
    }

    @Override // com.google.android.gms.internal.measurement.Y1
    public final boolean e(AbstractC1845h abstractC1845h, C1840c c1840c, C1840c c1840c2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.f22120q;
            if (atomicReferenceFieldUpdater.compareAndSet(abstractC1845h, c1840c, c1840c2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(abstractC1845h) == c1840c);
        return false;
    }

    @Override // com.google.android.gms.internal.measurement.Y1
    public final boolean f(AbstractC1845h abstractC1845h, Object obj, Object obj2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.f22121r;
            if (atomicReferenceFieldUpdater.compareAndSet(abstractC1845h, obj, obj2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(abstractC1845h) == obj);
        return false;
    }

    @Override // com.google.android.gms.internal.measurement.Y1
    public final boolean g(AbstractC1845h abstractC1845h, C1844g c1844g, C1844g c1844g2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.f22119p;
            if (atomicReferenceFieldUpdater.compareAndSet(abstractC1845h, c1844g, c1844g2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(abstractC1845h) == c1844g);
        return false;
    }

    @Override // com.google.android.gms.internal.measurement.Y1
    public final void y(C1844g c1844g, C1844g c1844g2) {
        this.f22118o.lazySet(c1844g, c1844g2);
    }

    @Override // com.google.android.gms.internal.measurement.Y1
    public final void z(C1844g c1844g, Thread thread) {
        this.f22117n.lazySet(c1844g, thread);
    }
}
