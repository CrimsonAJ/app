package d2;

import Y7.InterfaceC0484z;
import a.AbstractC0485a;
import com.anilab.android.ui.movieDetail.MovieDetailFragment;

/* loaded from: classes.dex */
public final class r extends G7.j implements O7.p {

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f16808r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ MovieDetailFragment f16809s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(E7.d dVar, MovieDetailFragment movieDetailFragment) {
        super(2, dVar);
        this.f16809s = movieDetailFragment;
    }

    @Override // G7.a
    public final E7.d create(Object obj, E7.d dVar) {
        r rVar = new r(dVar, this.f16809s);
        rVar.f16808r = obj;
        return rVar;
    }

    @Override // O7.p
    public final Object invoke(Object obj, Object obj2) {
        r rVar = (r) create((InterfaceC0484z) obj, (E7.d) obj2);
        A7.n nVar = A7.n.f558a;
        rVar.invokeSuspend(nVar);
        return nVar;
    }

    @Override // G7.a
    public final Object invokeSuspend(Object obj) {
        AbstractC0485a.A(obj);
        InterfaceC0484z interfaceC0484z = (InterfaceC0484z) this.f16808r;
        MovieDetailFragment movieDetailFragment = this.f16809s;
        Y7.B.r(interfaceC0484z, null, new C1115i(null, movieDetailFragment), 3);
        Y7.B.r(interfaceC0484z, null, new C1117k(null, movieDetailFragment), 3);
        Y7.B.r(interfaceC0484z, null, new m(null, movieDetailFragment), 3);
        Y7.B.r(interfaceC0484z, null, new o(null, movieDetailFragment), 3);
        Y7.B.r(interfaceC0484z, null, new q(null, movieDetailFragment), 3);
        return A7.n.f558a;
    }
}
