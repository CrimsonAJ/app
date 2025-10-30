package Y7;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* loaded from: classes.dex */
public final class B0 implements InterfaceC0457d0 {

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f8755c = AtomicIntegerFieldUpdater.newUpdater(B0.class, "_state$volatile");
    private volatile /* synthetic */ int _state$volatile;

    /* renamed from: a, reason: collision with root package name */
    public final Thread f8756a = Thread.currentThread();

    /* renamed from: b, reason: collision with root package name */
    public M f8757b;

    public B0(InterfaceC0465h0 interfaceC0465h0) {
    }

    public static void b(int i9) {
        throw new IllegalStateException(("Illegal state " + i9).toString());
    }

    public final void a() {
        while (true) {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f8755c;
            int i9 = atomicIntegerFieldUpdater.get(this);
            if (i9 != 0) {
                if (i9 != 2) {
                    if (i9 == 3) {
                        Thread.interrupted();
                        return;
                    } else {
                        b(i9);
                        throw null;
                    }
                }
            } else if (atomicIntegerFieldUpdater.compareAndSet(this, i9, 1)) {
                M m9 = this.f8757b;
                if (m9 != null) {
                    m9.b();
                    return;
                }
                return;
            }
        }
    }

    @Override // Y7.InterfaceC0457d0
    public final void d(Throwable th) {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i9;
        do {
            atomicIntegerFieldUpdater = f8755c;
            i9 = atomicIntegerFieldUpdater.get(this);
            if (i9 != 0) {
                if (i9 != 1 && i9 != 2 && i9 != 3) {
                    b(i9);
                    throw null;
                }
                return;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i9, 2));
        this.f8756a.interrupt();
        atomicIntegerFieldUpdater.set(this, 3);
    }
}
