package co.notix;

/* loaded from: classes.dex */
public final class sa extends ua {

    /* renamed from: b, reason: collision with root package name */
    public final Throwable f13157b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sa(Exception throwable) {
        super("Irrecoverable", 0);
        kotlin.jvm.internal.h.e(throwable, "throwable");
        this.f13157b = throwable;
    }

    @Override // co.notix.ua
    public final Throwable a() {
        return this.f13157b;
    }
}
