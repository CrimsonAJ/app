package s6;

/* loaded from: classes.dex */
public final class l implements S6.b {

    /* renamed from: c, reason: collision with root package name */
    public static final Object f22773c = new Object();

    /* renamed from: a, reason: collision with root package name */
    public volatile Object f22774a = f22773c;

    /* renamed from: b, reason: collision with root package name */
    public volatile S6.b f22775b;

    public l(S6.b bVar) {
        this.f22775b = bVar;
    }

    @Override // S6.b
    public final Object get() {
        Object obj;
        Object obj2 = this.f22774a;
        Object obj3 = f22773c;
        if (obj2 == obj3) {
            synchronized (this) {
                try {
                    obj = this.f22774a;
                    if (obj == obj3) {
                        obj = this.f22775b.get();
                        this.f22774a = obj;
                        this.f22775b = null;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return obj;
        }
        return obj2;
    }
}
