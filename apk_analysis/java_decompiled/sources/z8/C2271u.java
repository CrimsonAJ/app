package z8;

import Y7.C0464h;
import a.AbstractC0485a;

/* renamed from: z8.u, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2271u implements InterfaceC2258g {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Object f25635a;

    public /* synthetic */ C2271u(Object obj) {
        this.f25635a = obj;
    }

    @Override // z8.InterfaceC2258g
    public void e(InterfaceC2255d call, Throwable th) {
        kotlin.jvm.internal.h.e(call, "call");
        ((C0464h) this.f25635a).resumeWith(AbstractC0485a.h(th));
    }

    @Override // z8.InterfaceC2258g
    public void g(InterfaceC2255d call, O o9) {
        kotlin.jvm.internal.h.e(call, "call");
        boolean g9 = o9.f25587a.g();
        C0464h c0464h = (C0464h) this.f25635a;
        if (g9) {
            c0464h.resumeWith(o9.f25588b);
        } else {
            c0464h.resumeWith(AbstractC0485a.h(new C2266o(o9)));
        }
    }
}
