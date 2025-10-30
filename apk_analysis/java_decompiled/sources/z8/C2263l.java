package z8;

import java.util.concurrent.Executor;
import k4.C1499E;

/* renamed from: z8.l, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2263l implements InterfaceC2255d {

    /* renamed from: a, reason: collision with root package name */
    public final Executor f25617a;

    /* renamed from: b, reason: collision with root package name */
    public final InterfaceC2255d f25618b;

    public C2263l(Executor executor, InterfaceC2255d interfaceC2255d) {
        this.f25617a = executor;
        this.f25618b = interfaceC2255d;
    }

    @Override // z8.InterfaceC2255d
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final InterfaceC2255d clone() {
        return new C2263l(this.f25617a, this.f25618b.clone());
    }

    @Override // z8.InterfaceC2255d
    public final void cancel() {
        this.f25618b.cancel();
    }

    @Override // z8.InterfaceC2255d
    public final void d(InterfaceC2258g interfaceC2258g) {
        this.f25618b.d(new C1499E(this, interfaceC2258g, 29, false));
    }

    @Override // z8.InterfaceC2255d
    public final i8.G g() {
        return this.f25618b.g();
    }

    @Override // z8.InterfaceC2255d
    public final boolean s() {
        return this.f25618b.s();
    }
}
