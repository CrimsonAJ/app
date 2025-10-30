package d2;

import a.AbstractC0485a;
import com.anilab.android.ui.movieDetail.MovieDetailFragment;
import com.anilab.domain.model.Movie;

/* renamed from: d2.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1114h extends G7.j implements O7.p {

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f16788r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ MovieDetailFragment f16789s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1114h(E7.d dVar, MovieDetailFragment movieDetailFragment) {
        super(2, dVar);
        this.f16789s = movieDetailFragment;
    }

    @Override // G7.a
    public final E7.d create(Object obj, E7.d dVar) {
        C1114h c1114h = new C1114h(dVar, this.f16789s);
        c1114h.f16788r = obj;
        return c1114h;
    }

    @Override // O7.p
    public final Object invoke(Object obj, Object obj2) {
        C1114h c1114h = (C1114h) create((Movie) obj, (E7.d) obj2);
        A7.n nVar = A7.n.f558a;
        c1114h.invokeSuspend(nVar);
        return nVar;
    }

    @Override // G7.a
    public final Object invokeSuspend(Object obj) {
        AbstractC0485a.A(obj);
        this.f16789s.z0((Movie) this.f16788r);
        return A7.n.f558a;
    }
}
