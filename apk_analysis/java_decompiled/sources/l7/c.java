package l7;

import k7.InterfaceC1525a;

/* loaded from: classes.dex */
public final class c implements b, InterfaceC1525a {

    /* renamed from: a, reason: collision with root package name */
    public final Object f20611a;

    public c(Object obj) {
        this.f20611a = obj;
    }

    public static c a(Object obj) {
        if (obj != null) {
            return new c(obj);
        }
        throw new NullPointerException("instance cannot be null");
    }

    @Override // z7.InterfaceC2251a
    public final Object get() {
        return this.f20611a;
    }
}
