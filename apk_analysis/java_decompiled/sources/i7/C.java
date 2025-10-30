package i7;

/* loaded from: classes.dex */
public enum C implements N6.f {
    /* JADX INFO: Fake field, exist only in values array */
    LOG_ENVIRONMENT_UNKNOWN(0),
    /* JADX INFO: Fake field, exist only in values array */
    LOG_ENVIRONMENT_AUTOPUSH(1),
    /* JADX INFO: Fake field, exist only in values array */
    LOG_ENVIRONMENT_STAGING(2),
    LOG_ENVIRONMENT_PROD(3);


    /* renamed from: a, reason: collision with root package name */
    public final int f18742a;

    C(int i9) {
        this.f18742a = i9;
    }

    @Override // N6.f
    public final int a() {
        return this.f18742a;
    }
}
