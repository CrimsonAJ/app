package N1;

import Y7.B;
import Y7.InterfaceC0484z;
import a.AbstractC0485a;
import com.anilab.android.ui.categoryDetail.MovieListFragment;

/* loaded from: classes.dex */
public final class o extends G7.j implements O7.p {

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f4861r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ MovieListFragment f4862s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(E7.d dVar, MovieListFragment movieListFragment) {
        super(2, dVar);
        this.f4862s = movieListFragment;
    }

    @Override // G7.a
    public final E7.d create(Object obj, E7.d dVar) {
        o oVar = new o(dVar, this.f4862s);
        oVar.f4861r = obj;
        return oVar;
    }

    @Override // O7.p
    public final Object invoke(Object obj, Object obj2) {
        o oVar = (o) create((InterfaceC0484z) obj, (E7.d) obj2);
        A7.n nVar = A7.n.f558a;
        oVar.invokeSuspend(nVar);
        return nVar;
    }

    @Override // G7.a
    public final Object invokeSuspend(Object obj) {
        AbstractC0485a.A(obj);
        InterfaceC0484z interfaceC0484z = (InterfaceC0484z) this.f4861r;
        MovieListFragment movieListFragment = this.f4862s;
        B.r(interfaceC0484z, null, new l(null, movieListFragment), 3);
        B.r(interfaceC0484z, null, new n(null, movieListFragment), 3);
        return A7.n.f558a;
    }
}
