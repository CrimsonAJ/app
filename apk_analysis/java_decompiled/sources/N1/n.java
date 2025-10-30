package N1;

import Y7.InterfaceC0484z;
import a.AbstractC0485a;
import b8.AbstractC0714M;
import b8.C0709H;
import com.anilab.android.ui.categoryDetail.MovieListFragment;

/* loaded from: classes.dex */
public final class n extends G7.j implements O7.p {

    /* renamed from: r, reason: collision with root package name */
    public int f4859r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ MovieListFragment f4860s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(E7.d dVar, MovieListFragment movieListFragment) {
        super(2, dVar);
        this.f4860s = movieListFragment;
    }

    @Override // G7.a
    public final E7.d create(Object obj, E7.d dVar) {
        return new n(dVar, this.f4860s);
    }

    @Override // O7.p
    public final Object invoke(Object obj, Object obj2) {
        return ((n) create((InterfaceC0484z) obj, (E7.d) obj2)).invokeSuspend(A7.n.f558a);
    }

    @Override // G7.a
    public final Object invokeSuspend(Object obj) {
        F7.a aVar = F7.a.f2587a;
        int i9 = this.f4859r;
        if (i9 != 0) {
            if (i9 == 1) {
                AbstractC0485a.A(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            AbstractC0485a.A(obj);
            MovieListFragment movieListFragment = this.f4860s;
            C0709H c0709h = new C0709H(movieListFragment.h0().f4889l);
            m mVar = new m(null, movieListFragment);
            this.f4859r = 1;
            if (AbstractC0714M.i(c0709h, mVar, this) == aVar) {
                return aVar;
            }
        }
        return A7.n.f558a;
    }
}
