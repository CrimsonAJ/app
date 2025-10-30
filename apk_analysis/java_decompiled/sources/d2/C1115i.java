package d2;

import Y7.InterfaceC0484z;
import a.AbstractC0485a;
import b8.AbstractC0714M;
import b8.C0709H;
import com.anilab.android.ui.movieDetail.MovieDetailFragment;

/* renamed from: d2.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1115i extends G7.j implements O7.p {

    /* renamed from: r, reason: collision with root package name */
    public int f16790r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ MovieDetailFragment f16791s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1115i(E7.d dVar, MovieDetailFragment movieDetailFragment) {
        super(2, dVar);
        this.f16791s = movieDetailFragment;
    }

    @Override // G7.a
    public final E7.d create(Object obj, E7.d dVar) {
        return new C1115i(dVar, this.f16791s);
    }

    @Override // O7.p
    public final Object invoke(Object obj, Object obj2) {
        return ((C1115i) create((InterfaceC0484z) obj, (E7.d) obj2)).invokeSuspend(A7.n.f558a);
    }

    @Override // G7.a
    public final Object invokeSuspend(Object obj) {
        F7.a aVar = F7.a.f2587a;
        int i9 = this.f16790r;
        if (i9 != 0) {
            if (i9 == 1) {
                AbstractC0485a.A(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            AbstractC0485a.A(obj);
            MovieDetailFragment movieDetailFragment = this.f16791s;
            C0709H c0709h = movieDetailFragment.h0().f16758r;
            C1114h c1114h = new C1114h(null, movieDetailFragment);
            this.f16790r = 1;
            if (AbstractC0714M.i(c0709h, c1114h, this) == aVar) {
                return aVar;
            }
        }
        return A7.n.f558a;
    }
}
