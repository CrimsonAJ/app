package y7;

/* renamed from: y7.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2219a implements InterfaceC2220b {

    /* renamed from: c, reason: collision with root package name */
    public static final Object f25129c = new Object();

    /* renamed from: a, reason: collision with root package name */
    public volatile InterfaceC2220b f25130a;

    /* renamed from: b, reason: collision with root package name */
    public volatile Object f25131b;

    /* JADX WARN: Type inference failed for: r0v1, types: [y7.b, y7.a, java.lang.Object] */
    public static InterfaceC2220b a(InterfaceC2220b interfaceC2220b) {
        if (interfaceC2220b instanceof C2219a) {
            return interfaceC2220b;
        }
        ?? obj = new Object();
        obj.f25131b = f25129c;
        obj.f25130a = interfaceC2220b;
        return obj;
    }

    @Override // z7.InterfaceC2251a
    public final Object get() {
        Object obj;
        Object obj2 = this.f25131b;
        Object obj3 = f25129c;
        if (obj2 == obj3) {
            synchronized (this) {
                obj = this.f25131b;
                if (obj == obj3) {
                    obj = this.f25130a.get();
                    Object obj4 = this.f25131b;
                    if (obj4 != obj3 && obj4 != obj) {
                        throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj4 + " & " + obj + ". This is likely due to a circular dependency.");
                    }
                    this.f25131b = obj;
                    this.f25130a = null;
                }
            }
            return obj;
        }
        return obj2;
    }
}
