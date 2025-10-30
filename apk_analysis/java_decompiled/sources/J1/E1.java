package J1;

/* loaded from: classes.dex */
public final class E1 extends W.g {

    /* renamed from: v, reason: collision with root package name */
    public long f3669v;

    @Override // W.g
    public final void a0() {
        synchronized (this) {
            this.f3669v = 0L;
        }
    }

    @Override // W.g
    public final boolean d0() {
        synchronized (this) {
            try {
                if (this.f3669v != 0) {
                    return true;
                }
                return false;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // W.g
    public final void e0() {
        synchronized (this) {
            this.f3669v = 1L;
        }
        h0();
    }
}
