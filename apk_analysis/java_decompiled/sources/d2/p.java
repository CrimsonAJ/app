package d2;

import J1.AbstractC0172e0;
import a.AbstractC0485a;
import b8.C0718Q;
import com.anilab.android.ui.movieDetail.MovieDetailFragment;
import com.anilab.domain.model.Movie;

/* loaded from: classes.dex */
public final class p extends G7.j implements O7.p {

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f16804r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ MovieDetailFragment f16805s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(E7.d dVar, MovieDetailFragment movieDetailFragment) {
        super(2, dVar);
        this.f16805s = movieDetailFragment;
    }

    @Override // G7.a
    public final E7.d create(Object obj, E7.d dVar) {
        p pVar = new p(dVar, this.f16805s);
        pVar.f16804r = obj;
        return pVar;
    }

    @Override // O7.p
    public final Object invoke(Object obj, Object obj2) {
        p pVar = (p) create((M1.t) obj, (E7.d) obj2);
        A7.n nVar = A7.n.f558a;
        pVar.invokeSuspend(nVar);
        return nVar;
    }

    @Override // G7.a
    public final Object invokeSuspend(Object obj) {
        Double d9;
        double d10;
        AbstractC0485a.A(obj);
        Object a5 = ((M1.t) this.f16804r).a();
        if (a5 != null && ((Boolean) a5).booleanValue()) {
            MovieDetailFragment movieDetailFragment = this.f16805s;
            Movie movie = (Movie) ((C0718Q) movieDetailFragment.h0().f16758r.f11422a).h();
            AbstractC0172e0 abstractC0172e0 = (AbstractC0172e0) movieDetailFragment.e0();
            if (movie != null) {
                d9 = new Double(movie.f14430r);
            } else {
                d9 = null;
            }
            abstractC0172e0.f3904P.setText(String.valueOf(d9));
            Movie movie2 = movieDetailFragment.x0().f16822a;
            if (movie != null) {
                d10 = movie.f14430r;
            } else {
                d10 = 0.0d;
            }
            movie2.f14430r = d10;
        }
        return A7.n.f558a;
    }
}
