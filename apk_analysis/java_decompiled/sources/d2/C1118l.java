package d2;

import a.AbstractC0485a;
import com.anilab.android.ui.movieDetail.MovieDetailFragment;
import java.util.List;

/* renamed from: d2.l, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1118l extends G7.j implements O7.p {

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f16796r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ MovieDetailFragment f16797s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1118l(E7.d dVar, MovieDetailFragment movieDetailFragment) {
        super(2, dVar);
        this.f16797s = movieDetailFragment;
    }

    @Override // G7.a
    public final E7.d create(Object obj, E7.d dVar) {
        C1118l c1118l = new C1118l(dVar, this.f16797s);
        c1118l.f16796r = obj;
        return c1118l;
    }

    @Override // O7.p
    public final Object invoke(Object obj, Object obj2) {
        C1118l c1118l = (C1118l) create((List) obj, (E7.d) obj2);
        A7.n nVar = A7.n.f558a;
        c1118l.invokeSuspend(nVar);
        return nVar;
    }

    @Override // G7.a
    public final Object invokeSuspend(Object obj) {
        AbstractC0485a.A(obj);
        ((L) this.f16797s.f13790I0.getValue()).o((List) this.f16796r);
        return A7.n.f558a;
    }
}
