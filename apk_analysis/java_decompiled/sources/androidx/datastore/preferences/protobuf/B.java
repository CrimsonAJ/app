package androidx.datastore.preferences.protobuf;

/* loaded from: classes.dex */
public final class B implements I {

    /* renamed from: a, reason: collision with root package name */
    public I[] f9623a;

    @Override // androidx.datastore.preferences.protobuf.I
    public final S a(Class cls) {
        for (I i9 : this.f9623a) {
            if (i9.b(cls)) {
                return i9.a(cls);
            }
        }
        throw new UnsupportedOperationException("No factory is available for message type: ".concat(cls.getName()));
    }

    @Override // androidx.datastore.preferences.protobuf.I
    public final boolean b(Class cls) {
        for (I i9 : this.f9623a) {
            if (i9.b(cls)) {
                return true;
            }
        }
        return false;
    }
}
