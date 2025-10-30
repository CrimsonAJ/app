package Y7;

/* loaded from: classes.dex */
public final class Q extends S {

    /* renamed from: c, reason: collision with root package name */
    public final D0 f8781c;

    public Q(long j, D0 d02) {
        super(j);
        this.f8781c = d02;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f8781c.run();
    }

    @Override // Y7.S
    public final String toString() {
        return super.toString() + this.f8781c;
    }
}
