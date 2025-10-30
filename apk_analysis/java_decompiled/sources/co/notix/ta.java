package co.notix;

/* loaded from: classes.dex */
public final class ta extends ua {

    /* renamed from: b, reason: collision with root package name */
    public final Throwable f13215b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ta(Throwable throwable) {
        super("Recoverable", 0);
        kotlin.jvm.internal.h.e(throwable, "throwable");
        this.f13215b = throwable;
    }

    @Override // co.notix.ua
    public final Throwable a() {
        return this.f13215b;
    }
}
