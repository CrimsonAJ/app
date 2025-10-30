package a8;

import Y7.AbstractC0450a;
import Y7.B;
import Y7.C0467i0;
import java.util.concurrent.CancellationException;

/* loaded from: classes.dex */
public final class q extends AbstractC0450a implements r, i {

    /* renamed from: d, reason: collision with root package name */
    public final e f9235d;

    public q(E7.i iVar, e eVar) {
        super(iVar, true);
        this.f9235d = eVar;
    }

    @Override // Y7.AbstractC0450a
    public final void Z(Throwable th, boolean z9) {
        if (!this.f9235d.g(th, false) && !z9) {
            B.o(this.f8795c, th);
        }
    }

    @Override // Y7.AbstractC0450a
    public final void b0(Object obj) {
        O4.h.k(this.f9235d);
    }

    @Override // Y7.r0, Y7.InterfaceC0465h0
    public final void d(CancellationException cancellationException) {
        if (isCancelled()) {
            return;
        }
        if (cancellationException == null) {
            cancellationException = new C0467i0(t(), null, this);
        }
        q(cancellationException);
    }

    @Override // a8.u
    public final Object f(E7.d dVar, Object obj) {
        return this.f9235d.f(dVar, obj);
    }

    @Override // a8.t
    public final Object h() {
        return this.f9235d.h();
    }

    @Override // a8.t
    public final Object i(c8.s sVar) {
        e eVar = this.f9235d;
        eVar.getClass();
        return e.A(eVar, sVar);
    }

    @Override // a8.u
    public final Object j(Object obj) {
        throw null;
    }

    @Override // Y7.r0
    public final void q(CancellationException cancellationException) {
        this.f9235d.g(cancellationException, true);
        p(cancellationException);
    }
}
