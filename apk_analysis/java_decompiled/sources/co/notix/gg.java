package co.notix;

import Y7.InterfaceC0484z;
import a.AbstractC0485a;
import b8.C0718Q;
import b8.InterfaceC0707F;
import co.notix.banner.NotixBannerView;

/* loaded from: classes.dex */
public final class gg extends G7.j implements O7.p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ NotixBannerView f12322a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ g f12323b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gg(NotixBannerView notixBannerView, g gVar, E7.d dVar) {
        super(2, dVar);
        this.f12322a = notixBannerView;
        this.f12323b = gVar;
    }

    @Override // G7.a
    public final E7.d create(Object obj, E7.d dVar) {
        return new gg(this.f12322a, this.f12323b, dVar);
    }

    @Override // O7.p
    public final Object invoke(Object obj, Object obj2) {
        return ((gg) create((InterfaceC0484z) obj, (E7.d) obj2)).invokeSuspend(A7.n.f558a);
    }

    @Override // G7.a
    public final Object invokeSuspend(Object obj) {
        InterfaceC0707F interfaceC0707F;
        AbstractC0485a.A(obj);
        this.f12322a.setContent(this.f12323b);
        interfaceC0707F = this.f12322a.contentLoadedF;
        Boolean bool = Boolean.TRUE;
        C0718Q c0718q = (C0718Q) interfaceC0707F;
        c0718q.getClass();
        c0718q.j(null, bool);
        return A7.n.f558a;
    }
}
