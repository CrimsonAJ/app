package Y7;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* renamed from: Y7.f0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0461f0 extends AbstractC0469j0 {

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f8809f = AtomicIntegerFieldUpdater.newUpdater(C0461f0.class, "_invoked$volatile");
    private volatile /* synthetic */ int _invoked$volatile;

    /* renamed from: e, reason: collision with root package name */
    public final InterfaceC0457d0 f8810e;

    public C0461f0(InterfaceC0457d0 interfaceC0457d0) {
        this.f8810e = interfaceC0457d0;
    }

    @Override // Y7.InterfaceC0457d0
    public final void d(Throwable th) {
        if (f8809f.compareAndSet(this, 0, 1)) {
            this.f8810e.d(th);
        }
    }
}
