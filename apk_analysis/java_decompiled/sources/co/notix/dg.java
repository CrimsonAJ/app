package co.notix;

import Y7.InterfaceC0484z;
import a.AbstractC0485a;
import b8.C0718Q;
import b8.InterfaceC0707F;
import co.notix.banner.NotixBannerView;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public final class dg extends G7.j implements O7.p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ NotixBannerView f12099a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dg(NotixBannerView notixBannerView, E7.d dVar) {
        super(2, dVar);
        this.f12099a = notixBannerView;
    }

    @Override // G7.a
    public final E7.d create(Object obj, E7.d dVar) {
        return new dg(this.f12099a, dVar);
    }

    @Override // O7.p
    public final Object invoke(Object obj, Object obj2) {
        return ((dg) create((InterfaceC0484z) obj, (E7.d) obj2)).invokeSuspend(A7.n.f558a);
    }

    @Override // G7.a
    public final Object invokeSuspend(Object obj) {
        AtomicBoolean atomicBoolean;
        InterfaceC0707F interfaceC0707F;
        AbstractC0485a.A(obj);
        atomicBoolean = this.f12099a.loadCalled;
        if (atomicBoolean.get()) {
            interfaceC0707F = this.f12099a.contentLoadedF;
            if (!((Boolean) ((C0718Q) interfaceC0707F).h()).booleanValue()) {
                this.f12099a.loadOnce();
            }
        }
        return A7.n.f558a;
    }
}
