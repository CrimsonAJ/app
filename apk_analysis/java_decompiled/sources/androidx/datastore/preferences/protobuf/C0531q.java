package androidx.datastore.preferences.protobuf;

/* renamed from: androidx.datastore.preferences.protobuf.q, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0531q implements I {

    /* renamed from: b, reason: collision with root package name */
    public static final C0531q f9761b = new C0531q(0);

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9762a;

    public /* synthetic */ C0531q(int i9) {
        this.f9762a = i9;
    }

    @Override // androidx.datastore.preferences.protobuf.I
    public final S a(Class cls) {
        switch (this.f9762a) {
            case 0:
                if (AbstractC0533t.class.isAssignableFrom(cls)) {
                    try {
                        return (S) AbstractC0533t.d(cls.asSubclass(AbstractC0533t.class)).c(3);
                    } catch (Exception e8) {
                        throw new RuntimeException("Unable to get message info for ".concat(cls.getName()), e8);
                    }
                }
                throw new IllegalArgumentException("Unsupported message type: ".concat(cls.getName()));
            default:
                throw new IllegalStateException("This should never be called.");
        }
    }

    @Override // androidx.datastore.preferences.protobuf.I
    public final boolean b(Class cls) {
        switch (this.f9762a) {
            case 0:
                return AbstractC0533t.class.isAssignableFrom(cls);
            default:
                return false;
        }
    }
}
