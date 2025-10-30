package b5;

/* loaded from: classes.dex */
public abstract class B extends AbstractC0609A {

    /* renamed from: b, reason: collision with root package name */
    public boolean f10556b;

    public B(C0650n0 c0650n0) {
        super(c0650n0);
        ((C0650n0) this.f1707a).f11218D++;
    }

    public final void m0() {
        if (this.f10556b) {
        } else {
            throw new IllegalStateException("Not initialized");
        }
    }

    public final void n0() {
        if (!this.f10556b) {
            if (!o0()) {
                ((C0650n0) this.f1707a).Y.incrementAndGet();
                this.f10556b = true;
                return;
            }
            return;
        }
        throw new IllegalStateException("Can't initialize twice");
    }

    public abstract boolean o0();
}
