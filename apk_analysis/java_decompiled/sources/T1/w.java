package T1;

import Y7.InterfaceC0484z;
import a.AbstractC0485a;
import com.anilab.android.ui.external_player.SelectSubtitleForPlayerFragment;

/* loaded from: classes.dex */
public final class w extends G7.j implements O7.p {

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f7044r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ SelectSubtitleForPlayerFragment f7045s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(E7.d dVar, SelectSubtitleForPlayerFragment selectSubtitleForPlayerFragment) {
        super(2, dVar);
        this.f7045s = selectSubtitleForPlayerFragment;
    }

    @Override // G7.a
    public final E7.d create(Object obj, E7.d dVar) {
        w wVar = new w(dVar, this.f7045s);
        wVar.f7044r = obj;
        return wVar;
    }

    @Override // O7.p
    public final Object invoke(Object obj, Object obj2) {
        w wVar = (w) create((InterfaceC0484z) obj, (E7.d) obj2);
        A7.n nVar = A7.n.f558a;
        wVar.invokeSuspend(nVar);
        return nVar;
    }

    @Override // G7.a
    public final Object invokeSuspend(Object obj) {
        AbstractC0485a.A(obj);
        InterfaceC0484z interfaceC0484z = (InterfaceC0484z) this.f7044r;
        SelectSubtitleForPlayerFragment selectSubtitleForPlayerFragment = this.f7045s;
        Y7.B.r(interfaceC0484z, null, new r(null, selectSubtitleForPlayerFragment), 3);
        Y7.B.r(interfaceC0484z, null, new t(null, selectSubtitleForPlayerFragment), 3);
        Y7.B.r(interfaceC0484z, null, new v(null, selectSubtitleForPlayerFragment), 3);
        return A7.n.f558a;
    }
}
