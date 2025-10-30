package co.notix;

import Y7.InterfaceC0484z;
import a.AbstractC0485a;
import b8.C0718Q;
import b8.InterfaceC0707F;
import co.notix.banner.NotixBannerView;

/* loaded from: classes.dex */
public final class cg extends G7.j implements O7.p {

    /* renamed from: a, reason: collision with root package name */
    public int f12021a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ NotixBannerView f12022b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cg(NotixBannerView notixBannerView, E7.d dVar) {
        super(2, dVar);
        this.f12022b = notixBannerView;
    }

    @Override // G7.a
    public final E7.d create(Object obj, E7.d dVar) {
        return new cg(this.f12022b, dVar);
    }

    @Override // O7.p
    public final Object invoke(Object obj, Object obj2) {
        return ((cg) create((InterfaceC0484z) obj, (E7.d) obj2)).invokeSuspend(A7.n.f558a);
    }

    @Override // G7.a
    public final Object invokeSuspend(Object obj) {
        InterfaceC0707F interfaceC0707F;
        F7.a aVar = F7.a.f2587a;
        int i9 = this.f12021a;
        if (i9 != 0) {
            if (i9 == 1) {
                AbstractC0485a.A(obj);
                return A7.n.f558a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        AbstractC0485a.A(obj);
        interfaceC0707F = this.f12022b.timeVisibleF;
        NotixBannerView notixBannerView = this.f12022b;
        zf zfVar = new zf(notixBannerView);
        this.f12021a = 1;
        ((C0718Q) interfaceC0707F).collect(new bg(zfVar, notixBannerView), this);
        return aVar;
    }
}
