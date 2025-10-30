package co.notix;

import Y7.C0481w;
import Y7.InterfaceC0482x;

/* loaded from: classes.dex */
public final class f9 extends E7.a implements InterfaceC0482x {
    public f9(C0481w c0481w) {
        super(c0481w);
    }

    @Override // Y7.InterfaceC0482x
    public final void handleException(E7.i iVar, Throwable th) {
        kd kdVar = md.f12779a;
        kdVar.getClass();
        kdVar.f12607b.a("!NOTIX CoroutineExceptionHandler UNCAUGHT EXCEPTION!", th);
    }
}
