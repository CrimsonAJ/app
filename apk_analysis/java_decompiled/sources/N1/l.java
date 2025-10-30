package N1;

import Y7.InterfaceC0484z;
import a.AbstractC0485a;
import b8.C0718Q;
import com.anilab.android.ui.categoryDetail.MovieListFragment;

/* loaded from: classes.dex */
public final class l extends G7.j implements O7.p {

    /* renamed from: r, reason: collision with root package name */
    public int f4855r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ MovieListFragment f4856s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(E7.d dVar, MovieListFragment movieListFragment) {
        super(2, dVar);
        this.f4856s = movieListFragment;
    }

    @Override // G7.a
    public final E7.d create(Object obj, E7.d dVar) {
        return new l(dVar, this.f4856s);
    }

    @Override // O7.p
    public final Object invoke(Object obj, Object obj2) {
        ((l) create((InterfaceC0484z) obj, (E7.d) obj2)).invokeSuspend(A7.n.f558a);
        return F7.a.f2587a;
    }

    @Override // G7.a
    public final Object invokeSuspend(Object obj) {
        F7.a aVar = F7.a.f2587a;
        int i9 = this.f4855r;
        if (i9 != 0) {
            if (i9 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC0485a.A(obj);
            throw new RuntimeException();
        }
        AbstractC0485a.A(obj);
        MovieListFragment movieListFragment = this.f4856s;
        C0718Q c0718q = movieListFragment.h0().f4888k;
        k kVar = new k(0, movieListFragment);
        this.f4855r = 1;
        c0718q.collect(kVar, this);
        return aVar;
    }
}
