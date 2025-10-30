package l7;

import k7.InterfaceC1525a;
import z7.InterfaceC2251a;

/* renamed from: l7.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1576a implements InterfaceC2251a, InterfaceC1525a {

    /* renamed from: c, reason: collision with root package name */
    public static final Object f20608c = new Object();

    /* renamed from: a, reason: collision with root package name */
    public volatile InterfaceC2251a f20609a;

    /* renamed from: b, reason: collision with root package name */
    public volatile Object f20610b = f20608c;

    public C1576a(InterfaceC2251a interfaceC2251a) {
        this.f20609a = interfaceC2251a;
    }

    public static InterfaceC2251a a(b bVar) {
        if (bVar instanceof C1576a) {
            return bVar;
        }
        return new C1576a(bVar);
    }

    @Override // z7.InterfaceC2251a
    public final Object get() {
        Object obj;
        Object obj2 = this.f20610b;
        Object obj3 = f20608c;
        if (obj2 == obj3) {
            synchronized (this) {
                try {
                    obj = this.f20610b;
                    if (obj == obj3) {
                        obj = this.f20609a.get();
                        Object obj4 = this.f20610b;
                        if (obj4 != obj3 && obj4 != obj) {
                            throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj4 + " & " + obj + ". This is likely due to a circular dependency.");
                        }
                        this.f20610b = obj;
                        this.f20609a = null;
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
