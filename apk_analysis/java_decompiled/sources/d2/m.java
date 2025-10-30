package d2;

import Y7.InterfaceC0484z;
import a.AbstractC0485a;
import b8.AbstractC0714M;
import b8.C0709H;
import com.anilab.android.ui.movieDetail.MovieDetailFragment;

/* loaded from: classes.dex */
public final class m extends G7.j implements O7.p {

    /* renamed from: r, reason: collision with root package name */
    public int f16798r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ MovieDetailFragment f16799s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(E7.d dVar, MovieDetailFragment movieDetailFragment) {
        super(2, dVar);
        this.f16799s = movieDetailFragment;
    }

    @Override // G7.a
    public final E7.d create(Object obj, E7.d dVar) {
        return new m(dVar, this.f16799s);
    }

    @Override // O7.p
    public final Object invoke(Object obj, Object obj2) {
        return ((m) create((InterfaceC0484z) obj, (E7.d) obj2)).invokeSuspend(A7.n.f558a);
    }

    @Override // G7.a
    public final Object invokeSuspend(Object obj) {
        F7.a aVar = F7.a.f2587a;
        int i9 = this.f16798r;
        if (i9 != 0) {
            if (i9 == 1) {
                AbstractC0485a.A(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            AbstractC0485a.A(obj);
            MovieDetailFragment movieDetailFragment = this.f16799s;
            C0709H c0709h = movieDetailFragment.h0().f16762v;
            C1118l c1118l = new C1118l(null, movieDetailFragment);
            this.f16798r = 1;
            if (AbstractC0714M.i(c0709h, c1118l, this) == aVar) {
                return aVar;
            }
        }
        return A7.n.f558a;
    }
}
