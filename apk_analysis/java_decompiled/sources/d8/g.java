package d8;

/* loaded from: classes.dex */
public final class g extends RuntimeException {

    /* renamed from: a, reason: collision with root package name */
    public final transient E7.i f16978a;

    public g(E7.i iVar) {
        this.f16978a = iVar;
    }

    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }

    @Override // java.lang.Throwable
    public final String getLocalizedMessage() {
        return this.f16978a.toString();
    }
}
