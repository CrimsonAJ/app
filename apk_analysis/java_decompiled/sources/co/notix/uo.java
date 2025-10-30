package co.notix;

import Y7.C0464h;
import Y7.InterfaceC0462g;
import a.AbstractC0485a;
import java.util.concurrent.CancellationException;

/* loaded from: classes.dex */
public final class uo implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0462g f13319a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ S5.p f13320b;

    public uo(C0464h c0464h, S5.p pVar) {
        this.f13319a = c0464h;
        this.f13320b = pVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.f13319a.resumeWith(this.f13320b.get());
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause == null) {
                cause = th;
            }
            if (th instanceof CancellationException) {
                this.f13319a.c(cause);
            } else {
                this.f13319a.resumeWith(AbstractC0485a.h(cause));
            }
        }
    }
}
