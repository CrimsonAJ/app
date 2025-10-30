package co.notix;

import Y7.C0464h;
import Y7.InterfaceC0462g;
import a.AbstractC0485a;
import java.util.concurrent.CancellationException;

/* loaded from: classes.dex */
public final class ro implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0462g f13135a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ S5.p f13136b;

    public ro(C0464h c0464h, S5.p pVar) {
        this.f13135a = c0464h;
        this.f13136b = pVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.f13135a.resumeWith(this.f13136b.get());
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause == null) {
                cause = th;
            }
            if (th instanceof CancellationException) {
                this.f13135a.c(cause);
            } else {
                this.f13135a.resumeWith(AbstractC0485a.h(cause));
            }
        }
    }
}
