package a3;

import z7.InterfaceC2251a;

/* renamed from: a3.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0490a implements InterfaceC2251a {

    /* renamed from: c, reason: collision with root package name */
    public static final Object f9108c = new Object();

    /* renamed from: a, reason: collision with root package name */
    public volatile InterfaceC0491b f9109a;

    /* renamed from: b, reason: collision with root package name */
    public volatile Object f9110b;

    /* JADX WARN: Type inference failed for: r0v1, types: [z7.a, a3.a, java.lang.Object] */
    public static InterfaceC2251a a(InterfaceC0491b interfaceC0491b) {
        if (interfaceC0491b instanceof C0490a) {
            return interfaceC0491b;
        }
        ?? obj = new Object();
        obj.f9110b = f9108c;
        obj.f9109a = interfaceC0491b;
        return obj;
    }

    @Override // z7.InterfaceC2251a
    public final Object get() {
        Object obj;
        Object obj2 = this.f9110b;
        Object obj3 = f9108c;
        if (obj2 == obj3) {
            synchronized (this) {
                try {
                    obj = this.f9110b;
                    if (obj == obj3) {
                        obj = this.f9109a.get();
                        Object obj4 = this.f9110b;
                        if (obj4 != obj3 && obj4 != obj) {
                            throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj4 + " & " + obj + ". This is likely due to a circular dependency.");
                        }
                        this.f9110b = obj;
                        this.f9109a = null;
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
