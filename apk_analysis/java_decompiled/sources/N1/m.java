package N1;

import a.AbstractC0485a;
import com.anilab.android.ui.categoryDetail.MovieListFragment;

/* loaded from: classes.dex */
public final class m extends G7.j implements O7.p {

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f4857r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ MovieListFragment f4858s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(E7.d dVar, MovieListFragment movieListFragment) {
        super(2, dVar);
        this.f4858s = movieListFragment;
    }

    @Override // G7.a
    public final E7.d create(Object obj, E7.d dVar) {
        m mVar = new m(dVar, this.f4858s);
        mVar.f4857r = obj;
        return mVar;
    }

    @Override // O7.p
    public final Object invoke(Object obj, Object obj2) {
        m mVar = (m) create((M1.t) obj, (E7.d) obj2);
        A7.n nVar = A7.n.f558a;
        mVar.invokeSuspend(nVar);
        return nVar;
    }

    @Override // G7.a
    public final Object invokeSuspend(Object obj) {
        AbstractC0485a.A(obj);
        Object a5 = ((M1.t) this.f4857r).a();
        if (a5 != null && ((Boolean) a5).booleanValue()) {
            ((j) this.f4858s.f13739G0.getValue()).f4742a = true;
        }
        return A7.n.f558a;
    }
}
