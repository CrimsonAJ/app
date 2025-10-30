package Y7;

import G0.C0142h;
import java.util.concurrent.CancellationException;

/* loaded from: classes.dex */
public final class u0 extends E7.a implements InterfaceC0465h0 {

    /* renamed from: a, reason: collision with root package name */
    public static final u0 f8857a = new E7.a(C0463g0.f8811a);

    @Override // Y7.InterfaceC0465h0
    public final InterfaceC0470k F(r0 r0Var) {
        return v0.f8859a;
    }

    @Override // Y7.InterfaceC0465h0
    public final CancellationException I() {
        throw new IllegalStateException("This job is always active");
    }

    @Override // Y7.InterfaceC0465h0
    public final Object N(G7.c cVar) {
        throw new UnsupportedOperationException("This job is always active");
    }

    @Override // Y7.InterfaceC0465h0
    public final M O(O7.l lVar) {
        return v0.f8859a;
    }

    @Override // Y7.InterfaceC0465h0
    public final M S(boolean z9, boolean z10, C0142h c0142h) {
        return v0.f8859a;
    }

    @Override // Y7.InterfaceC0465h0
    public final boolean a() {
        return true;
    }

    @Override // Y7.InterfaceC0465h0
    public final InterfaceC0465h0 getParent() {
        return null;
    }

    @Override // Y7.InterfaceC0465h0
    public final boolean isCancelled() {
        return false;
    }

    @Override // Y7.InterfaceC0465h0
    public final V7.j s() {
        return V7.e.f7818a;
    }

    @Override // Y7.InterfaceC0465h0
    public final boolean start() {
        return false;
    }

    public final String toString() {
        return "NonCancellable";
    }

    @Override // Y7.InterfaceC0465h0
    public final void d(CancellationException cancellationException) {
    }
}
