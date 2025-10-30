package b5;

/* loaded from: classes.dex */
public abstract class D1 extends z1 {

    /* renamed from: c, reason: collision with root package name */
    public boolean f10584c;

    public D1(J1 j12) {
        super(j12);
        this.f11361b.f10761r++;
    }

    public final void m0() {
        if (this.f10584c) {
        } else {
            throw new IllegalStateException("Not initialized");
        }
    }

    public final void n0() {
        if (!this.f10584c) {
            o0();
            this.f11361b.f10762s++;
            this.f10584c = true;
            return;
        }
        throw new IllegalStateException("Can't initialize twice");
    }

    public abstract void o0();
}
