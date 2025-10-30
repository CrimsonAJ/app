package H1;

import Y7.C0464h;
import a.AbstractC0485a;
import i8.InterfaceC1420j;
import i8.L;
import java.io.IOException;

/* loaded from: classes.dex */
public final class g implements InterfaceC1420j, O7.l {

    /* renamed from: a, reason: collision with root package name */
    public final n8.g f2952a;

    /* renamed from: b, reason: collision with root package name */
    public final C0464h f2953b;

    public g(n8.g gVar, C0464h c0464h) {
        this.f2952a = gVar;
        this.f2953b = c0464h;
    }

    @Override // i8.InterfaceC1420j
    public final void c(n8.g gVar, L l9) {
        this.f2953b.resumeWith(l9);
    }

    @Override // i8.InterfaceC1420j
    public final void f(n8.g gVar, IOException iOException) {
        if (!gVar.f21273m) {
            this.f2953b.resumeWith(AbstractC0485a.h(iOException));
        }
    }

    @Override // O7.l
    public final Object invoke(Object obj) {
        try {
            this.f2952a.cancel();
        } catch (Throwable unused) {
        }
        return A7.n.f558a;
    }
}
