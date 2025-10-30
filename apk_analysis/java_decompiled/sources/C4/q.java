package C4;

/* loaded from: classes.dex */
public final class q extends UnsupportedOperationException {

    /* renamed from: a, reason: collision with root package name */
    public final B4.d f1588a;

    public q(B4.d dVar) {
        this.f1588a = dVar;
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        return "Missing ".concat(String.valueOf(this.f1588a));
    }
}
