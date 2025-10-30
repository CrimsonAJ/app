package b6;

import java.security.GeneralSecurityException;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: b6.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0686h {

    /* renamed from: b, reason: collision with root package name */
    public static final C0686h f11370b = new C0686h();

    /* renamed from: a, reason: collision with root package name */
    public final AtomicReference f11371a = new AtomicReference(new C0692n(new O0.c(16)));

    public final Class a(Class cls) {
        HashMap hashMap = ((C0692n) this.f11371a.get()).f11381b;
        if (hashMap.containsKey(cls)) {
            return ((U5.m) hashMap.get(cls)).a();
        }
        throw new GeneralSecurityException("No input primitive class for " + cls + " available");
    }

    public final synchronized void b(C0690l c0690l) {
        O0.c cVar = new O0.c((C0692n) this.f11371a.get());
        cVar.M(c0690l);
        this.f11371a.set(new C0692n(cVar));
    }

    public final synchronized void c(U5.m mVar) {
        O0.c cVar = new O0.c((C0692n) this.f11371a.get());
        cVar.N(mVar);
        this.f11371a.set(new C0692n(cVar));
    }
}
