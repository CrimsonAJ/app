package d8;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes.dex */
public abstract class d {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f16974a = AtomicReferenceFieldUpdater.newUpdater(d.class, Object.class, "_next$volatile");

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f16975b = AtomicReferenceFieldUpdater.newUpdater(d.class, Object.class, "_prev$volatile");
    private volatile /* synthetic */ Object _next$volatile;
    private volatile /* synthetic */ Object _prev$volatile;

    public d(u uVar) {
        this._prev$volatile = uVar;
    }

    public final void a() {
        f16975b.set(this, null);
    }

    public final d b() {
        Object obj = f16974a.get(this);
        if (obj == AbstractC1130a.f16967b) {
            return null;
        }
        return (d) obj;
    }

    public abstract boolean c();

    public final void d() {
        d dVar;
        d b9;
        if (b() == null) {
            return;
        }
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f16975b;
            d dVar2 = (d) atomicReferenceFieldUpdater.get(this);
            while (dVar2 != null && dVar2.c()) {
                dVar2 = (d) atomicReferenceFieldUpdater.get(dVar2);
            }
            d b10 = b();
            kotlin.jvm.internal.h.b(b10);
            while (b10.c() && (b9 = b10.b()) != null) {
                b10 = b9;
            }
            while (true) {
                Object obj = atomicReferenceFieldUpdater.get(b10);
                if (((d) obj) == null) {
                    dVar = null;
                } else {
                    dVar = dVar2;
                }
                while (!atomicReferenceFieldUpdater.compareAndSet(b10, obj, dVar)) {
                    if (atomicReferenceFieldUpdater.get(b10) != obj) {
                        break;
                    }
                }
            }
            if (dVar2 != null) {
                f16974a.set(dVar2, b10);
            }
            if (!b10.c() || b10.b() == null) {
                if (dVar2 == null || !dVar2.c()) {
                    return;
                }
            }
        }
    }
}
