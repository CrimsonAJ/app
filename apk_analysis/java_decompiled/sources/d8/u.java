package d8;

import Y7.w0;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* loaded from: classes.dex */
public abstract class u extends d implements w0 {

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f17006d = AtomicIntegerFieldUpdater.newUpdater(u.class, "cleanedAndPointers$volatile");

    /* renamed from: c, reason: collision with root package name */
    public final long f17007c;
    private volatile /* synthetic */ int cleanedAndPointers$volatile;

    public u(long j, u uVar, int i9) {
        super(uVar);
        this.f17007c = j;
        this.cleanedAndPointers$volatile = i9 << 16;
    }

    @Override // d8.d
    public final boolean c() {
        if (f17006d.get(this) == f() && b() != null) {
            return true;
        }
        return false;
    }

    public final boolean e() {
        if (f17006d.addAndGet(this, -65536) == f() && b() != null) {
            return true;
        }
        return false;
    }

    public abstract int f();

    public abstract void g(int i9, E7.i iVar);

    public final void h() {
        if (f17006d.incrementAndGet(this) == f()) {
            d();
        }
    }

    public final boolean i() {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i9;
        do {
            atomicIntegerFieldUpdater = f17006d;
            i9 = atomicIntegerFieldUpdater.get(this);
            if (i9 == f() && b() != null) {
                return false;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i9, 65536 + i9));
        return true;
    }
}
