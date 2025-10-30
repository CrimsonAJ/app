package d2;

import B6.u0;
import J1.AbstractC0172e0;
import a.AbstractC0485a;
import co.notix.R;
import com.anilab.android.ui.movieDetail.MovieDetailFragment;

/* loaded from: classes.dex */
public final class n extends G7.j implements O7.p {

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f16800r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ MovieDetailFragment f16801s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(E7.d dVar, MovieDetailFragment movieDetailFragment) {
        super(2, dVar);
        this.f16801s = movieDetailFragment;
    }

    @Override // G7.a
    public final E7.d create(Object obj, E7.d dVar) {
        n nVar = new n(dVar, this.f16801s);
        nVar.f16800r = obj;
        return nVar;
    }

    @Override // O7.p
    public final Object invoke(Object obj, Object obj2) {
        n nVar = (n) create((H2.e) obj, (E7.d) obj2);
        A7.n nVar2 = A7.n.f558a;
        nVar.invokeSuspend(nVar2);
        return nVar2;
    }

    /* JADX WARN: Type inference failed for: r4v1, types: [java.util.List, java.lang.Object] */
    @Override // G7.a
    public final Object invokeSuspend(Object obj) {
        AbstractC0485a.A(obj);
        H2.e eVar = (H2.e) this.f16800r;
        MovieDetailFragment movieDetailFragment = this.f16801s;
        if (eVar != null) {
            movieDetailFragment.getClass();
            if (!eVar.f3008e.isEmpty()) {
                ((AbstractC0172e0) movieDetailFragment.e0()).f3899J.setText(movieDetailFragment.s(R.string.format_player_comment_count, u0.r(eVar.f3007d)));
                return A7.n.f558a;
            }
        }
        ((AbstractC0172e0) movieDetailFragment.e0()).f3899J.setText(movieDetailFragment.s(R.string.format_player_comment_count, "0"));
        return A7.n.f558a;
    }
}
