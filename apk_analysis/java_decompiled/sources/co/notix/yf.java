package co.notix;

import Y7.InterfaceC0484z;
import a.AbstractC0485a;
import b8.AbstractC0714M;
import b8.C0733m;
import b8.InterfaceC0707F;
import b8.InterfaceC0725e;
import co.notix.banner.NotixBannerView;

/* loaded from: classes.dex */
public final class yf extends G7.j implements O7.p {

    /* renamed from: a, reason: collision with root package name */
    public int f13602a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f13603b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ NotixBannerView f13604c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yf(NotixBannerView notixBannerView, E7.d dVar) {
        super(2, dVar);
        this.f13604c = notixBannerView;
    }

    @Override // G7.a
    public final E7.d create(Object obj, E7.d dVar) {
        yf yfVar = new yf(this.f13604c, dVar);
        yfVar.f13603b = obj;
        return yfVar;
    }

    @Override // O7.p
    public final Object invoke(Object obj, Object obj2) {
        return ((yf) create((InterfaceC0484z) obj, (E7.d) obj2)).invokeSuspend(A7.n.f558a);
    }

    @Override // G7.a
    public final Object invokeSuspend(Object obj) {
        InterfaceC0707F interfaceC0707F;
        InterfaceC0707F interfaceC0707F2;
        InterfaceC0707F interfaceC0707F3;
        F7.a aVar = F7.a.f2587a;
        int i9 = this.f13602a;
        if (i9 != 0) {
            if (i9 == 1) {
                AbstractC0485a.A(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            AbstractC0485a.A(obj);
            InterfaceC0484z interfaceC0484z = (InterfaceC0484z) this.f13603b;
            interfaceC0707F = this.f13604c.isAttachedF;
            interfaceC0707F2 = this.f13604c.isVisibleF;
            interfaceC0707F3 = this.f13604c.contentLoadedF;
            C0733m c0733m = new C0733m(new InterfaceC0725e[]{interfaceC0707F, interfaceC0707F2, interfaceC0707F3}, new wf(null));
            xf xfVar = new xf(interfaceC0484z, this.f13604c, null);
            this.f13602a = 1;
            if (AbstractC0714M.i(c0733m, xfVar, this) == aVar) {
                return aVar;
            }
        }
        return A7.n.f558a;
    }
}
