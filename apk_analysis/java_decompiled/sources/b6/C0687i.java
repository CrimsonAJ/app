package b6;

import h6.X;
import java.security.GeneralSecurityException;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicReference;
import l1.C1535g;

/* renamed from: b6.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0687i {

    /* renamed from: b, reason: collision with root package name */
    public static final C0687i f11372b = new C0687i();

    /* renamed from: a, reason: collision with root package name */
    public final AtomicReference f11373a = new AtomicReference(new C0697s(new C1535g(7)));

    /* JADX WARN: Type inference failed for: r0v2, types: [U5.b, java.lang.Object] */
    public final U5.b a(C0693o c0693o) {
        AtomicReference atomicReference = this.f11373a;
        C0697s c0697s = (C0697s) atomicReference.get();
        c0697s.getClass();
        k6.a aVar = (k6.a) c0693o.f11383b;
        if (!c0697s.f11394b.containsKey(new C0695q(C0693o.class, aVar))) {
            try {
                ?? obj = new Object();
                ((X) c0693o.f11385d).ordinal();
                return obj;
            } catch (GeneralSecurityException e8) {
                throw new RuntimeException("Creating a LegacyProtoKey failed", e8);
            }
        }
        C0697s c0697s2 = (C0697s) atomicReference.get();
        c0697s2.getClass();
        C0695q c0695q = new C0695q(C0693o.class, aVar);
        HashMap hashMap = c0697s2.f11394b;
        if (hashMap.containsKey(c0695q)) {
            return ((C0679a) hashMap.get(c0695q)).f11363b.a(c0693o);
        }
        throw new GeneralSecurityException("No Key Parser for requested key type " + c0695q + " available");
    }

    public final synchronized void b(C0679a c0679a) {
        C1535g c1535g = new C1535g((C0697s) this.f11373a.get());
        c1535g.A(c0679a);
        this.f11373a.set(new C0697s(c1535g));
    }

    public final synchronized void c(C0681c c0681c) {
        C1535g c1535g = new C1535g((C0697s) this.f11373a.get());
        c1535g.B(c0681c);
        this.f11373a.set(new C0697s(c1535g));
    }

    public final synchronized void d(C0688j c0688j) {
        C1535g c1535g = new C1535g((C0697s) this.f11373a.get());
        c1535g.C(c0688j);
        this.f11373a.set(new C0697s(c1535g));
    }

    public final synchronized void e(C0689k c0689k) {
        C1535g c1535g = new C1535g((C0697s) this.f11373a.get());
        c1535g.D(c0689k);
        this.f11373a.set(new C0697s(c1535g));
    }
}
