package I0;

/* loaded from: classes.dex */
public final class l implements P0.c, AutoCloseable {

    /* renamed from: a, reason: collision with root package name */
    public final P0.c f3232a;

    /* renamed from: b, reason: collision with root package name */
    public final long f3233b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ s f3234c;

    public l(s sVar, P0.c delegate) {
        kotlin.jvm.internal.h.e(delegate, "delegate");
        this.f3234c = sVar;
        this.f3232a = delegate;
        this.f3233b = Z0.a.e();
    }

    @Override // P0.c
    public final long H(int i9) {
        if (!this.f3234c.f3266d.get()) {
            if (this.f3233b == Z0.a.e()) {
                return this.f3232a.H(i9);
            }
            s8.n.y(21, "Attempted to use statement on a different thread");
            throw null;
        }
        s8.n.y(21, "Statement is recycled");
        throw null;
    }

    @Override // P0.c
    public final boolean K() {
        if (H(0) == 0) {
            return false;
        }
        return true;
    }

    @Override // P0.c
    public final boolean R(int i9) {
        if (!this.f3234c.f3266d.get()) {
            if (this.f3233b == Z0.a.e()) {
                return this.f3232a.R(i9);
            }
            s8.n.y(21, "Attempted to use statement on a different thread");
            throw null;
        }
        s8.n.y(21, "Statement is recycled");
        throw null;
    }

    @Override // P0.c
    public final String T(int i9) {
        if (!this.f3234c.f3266d.get()) {
            if (this.f3233b == Z0.a.e()) {
                return this.f3232a.T(i9);
            }
            s8.n.y(21, "Attempted to use statement on a different thread");
            throw null;
        }
        s8.n.y(21, "Statement is recycled");
        throw null;
    }

    @Override // P0.c
    public final boolean W() {
        if (!this.f3234c.f3266d.get()) {
            if (this.f3233b == Z0.a.e()) {
                return this.f3232a.W();
            }
            s8.n.y(21, "Attempted to use statement on a different thread");
            throw null;
        }
        s8.n.y(21, "Statement is recycled");
        throw null;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        if (!this.f3234c.f3266d.get()) {
            if (this.f3233b == Z0.a.e()) {
                this.f3232a.close();
                return;
            } else {
                s8.n.y(21, "Attempted to use statement on a different thread");
                throw null;
            }
        }
        s8.n.y(21, "Statement is recycled");
        throw null;
    }

    @Override // P0.c
    public final String i(int i9) {
        if (!this.f3234c.f3266d.get()) {
            if (this.f3233b == Z0.a.e()) {
                return this.f3232a.i(i9);
            }
            s8.n.y(21, "Attempted to use statement on a different thread");
            throw null;
        }
        s8.n.y(21, "Statement is recycled");
        throw null;
    }

    @Override // P0.c
    public final int j() {
        if (!this.f3234c.f3266d.get()) {
            if (this.f3233b == Z0.a.e()) {
                return this.f3232a.j();
            }
            s8.n.y(21, "Attempted to use statement on a different thread");
            throw null;
        }
        s8.n.y(21, "Statement is recycled");
        throw null;
    }

    @Override // P0.c
    public final void reset() {
        if (!this.f3234c.f3266d.get()) {
            if (this.f3233b == Z0.a.e()) {
                this.f3232a.reset();
                return;
            } else {
                s8.n.y(21, "Attempted to use statement on a different thread");
                throw null;
            }
        }
        s8.n.y(21, "Statement is recycled");
        throw null;
    }
}
