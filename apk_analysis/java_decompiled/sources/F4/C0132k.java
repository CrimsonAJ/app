package F4;

import android.os.Bundle;

/* renamed from: F4.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0132k implements InterfaceC0125d, InterfaceC0123b, InterfaceC0124c {

    /* renamed from: b, reason: collision with root package name */
    public static C0132k f2422b;

    /* renamed from: c, reason: collision with root package name */
    public static final C0133l f2423c = new C0133l(0, 0, 0, false, false);

    /* renamed from: a, reason: collision with root package name */
    public Object f2424a;

    public /* synthetic */ C0132k(Object obj) {
        this.f2424a = obj;
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, F4.k] */
    public static synchronized C0132k c() {
        C0132k c0132k;
        synchronized (C0132k.class) {
            try {
                if (f2422b == null) {
                    f2422b = new Object();
                }
                c0132k = f2422b;
            } catch (Throwable th) {
                throw th;
            }
        }
        return c0132k;
    }

    @Override // F4.InterfaceC0125d
    public void a(B4.b bVar) {
        boolean z9;
        if (bVar.f685b == 0) {
            z9 = true;
        } else {
            z9 = false;
        }
        AbstractC0126e abstractC0126e = (AbstractC0126e) this.f2424a;
        if (z9) {
            abstractC0126e.e(null, abstractC0126e.t());
            return;
        }
        InterfaceC0124c interfaceC0124c = abstractC0126e.f2383q;
        if (interfaceC0124c != null) {
            interfaceC0124c.d(bVar);
        }
    }

    @Override // F4.InterfaceC0123b
    public void b(Bundle bundle) {
        ((C4.k) this.f2424a).Q();
    }

    @Override // F4.InterfaceC0124c
    public void d(B4.b bVar) {
        ((C4.l) this.f2424a).d(bVar);
    }

    @Override // F4.InterfaceC0123b
    public void g(int i9) {
        ((C4.k) this.f2424a).g(i9);
    }
}
