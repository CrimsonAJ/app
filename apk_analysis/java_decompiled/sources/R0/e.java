package R0;

/* loaded from: classes.dex */
public final class e extends RuntimeException {

    /* renamed from: a, reason: collision with root package name */
    public final f f6472a;

    /* renamed from: b, reason: collision with root package name */
    public final Throwable f6473b;

    public e(f fVar, Throwable th) {
        super(th);
        this.f6472a = fVar;
        this.f6473b = th;
    }

    @Override // java.lang.Throwable
    public final Throwable getCause() {
        return this.f6473b;
    }
}
