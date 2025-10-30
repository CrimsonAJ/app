package T1;

import J1.AbstractC0212y0;
import a.AbstractC0485a;
import com.anilab.android.ui.external_player.SelectSubtitleForPlayerFragment;

/* loaded from: classes.dex */
public final class q extends G7.j implements O7.p {

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ boolean f7032r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ SelectSubtitleForPlayerFragment f7033s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(E7.d dVar, SelectSubtitleForPlayerFragment selectSubtitleForPlayerFragment) {
        super(2, dVar);
        this.f7033s = selectSubtitleForPlayerFragment;
    }

    @Override // G7.a
    public final E7.d create(Object obj, E7.d dVar) {
        q qVar = new q(dVar, this.f7033s);
        qVar.f7032r = ((Boolean) obj).booleanValue();
        return qVar;
    }

    @Override // O7.p
    public final Object invoke(Object obj, Object obj2) {
        Boolean bool = (Boolean) obj;
        bool.booleanValue();
        q qVar = (q) create(bool, (E7.d) obj2);
        A7.n nVar = A7.n.f558a;
        qVar.invokeSuspend(nVar);
        return nVar;
    }

    @Override // G7.a
    public final Object invokeSuspend(Object obj) {
        J5.h hVar;
        J5.h hVar2;
        AbstractC0485a.A(obj);
        boolean z9 = this.f7032r;
        SelectSubtitleForPlayerFragment selectSubtitleForPlayerFragment = this.f7033s;
        J5.f h7 = ((AbstractC0212y0) selectSubtitleForPlayerFragment.m0()).f4136C.h(0);
        if (h7 != null && (hVar2 = h7.f4204g) != null) {
            hVar2.setClickable(z9);
        }
        J5.f h9 = ((AbstractC0212y0) selectSubtitleForPlayerFragment.m0()).f4136C.h(1);
        if (h9 != null && (hVar = h9.f4204g) != null) {
            hVar.setClickable(z9);
        }
        return A7.n.f558a;
    }
}
