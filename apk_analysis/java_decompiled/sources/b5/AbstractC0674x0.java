package b5;

/* renamed from: b5.x0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0674x0 extends D.n {

    /* renamed from: b, reason: collision with root package name */
    public boolean f11344b;

    public AbstractC0674x0(C0650n0 c0650n0) {
        super(c0650n0);
        ((C0650n0) this.f1707a).f11218D++;
    }

    public abstract boolean m0();

    public final void n0() {
        if (this.f11344b) {
        } else {
            throw new IllegalStateException("Not initialized");
        }
    }

    public final void o0() {
        if (!this.f11344b) {
            if (!m0()) {
                ((C0650n0) this.f1707a).Y.incrementAndGet();
                this.f11344b = true;
                return;
            }
            return;
        }
        throw new IllegalStateException("Can't initialize twice");
    }
}
