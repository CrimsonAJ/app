package d2;

import com.anilab.android.ui.movieDetail.MovieDetailFragment;
import com.anilab.domain.model.Movie;

/* renamed from: d2.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C1112f implements O7.l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16784a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ MovieDetailFragment f16785b;

    public /* synthetic */ C1112f(MovieDetailFragment movieDetailFragment, int i9) {
        this.f16784a = i9;
        this.f16785b = movieDetailFragment;
    }

    @Override // O7.l
    public final Object invoke(Object obj) {
        switch (this.f16784a) {
            case 0:
                H2.i it = (H2.i) obj;
                kotlin.jvm.internal.h.e(it, "it");
                MovieDetailFragment movieDetailFragment = this.f16785b;
                String str = movieDetailFragment.x0().f16822a.f14416c;
                String str2 = movieDetailFragment.x0().f16822a.f14415b;
                movieDetailFragment.t0(new H2.s(movieDetailFragment.x0().f16822a.f14420g, it.f3027b, it.f3026a, str, str2, movieDetailFragment.x0().f16822a.f14417d));
                return A7.n.f558a;
            default:
                if (((Boolean) obj).booleanValue()) {
                    MovieDetailFragment movieDetailFragment2 = this.f16785b;
                    K y02 = movieDetailFragment2.y0();
                    Movie movie = movieDetailFragment2.x0().f16822a;
                    y02.getClass();
                    y02.d(false, new I(y02, movie.f14414a, null));
                }
                return A7.n.f558a;
        }
    }
}
