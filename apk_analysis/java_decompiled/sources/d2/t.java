package d2;

import Y7.InterfaceC0484z;
import a.AbstractC0485a;
import com.anilab.android.ui.movieDetail.MovieDetailFragment;

/* loaded from: classes.dex */
public final class t extends G7.j implements O7.p {

    /* renamed from: r, reason: collision with root package name */
    public int f16812r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ MovieDetailFragment f16813s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ CharSequence f16814t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(MovieDetailFragment movieDetailFragment, CharSequence charSequence, E7.d dVar) {
        super(2, dVar);
        this.f16813s = movieDetailFragment;
        this.f16814t = charSequence;
    }

    @Override // G7.a
    public final E7.d create(Object obj, E7.d dVar) {
        return new t(this.f16813s, this.f16814t, dVar);
    }

    @Override // O7.p
    public final Object invoke(Object obj, Object obj2) {
        return ((t) create((InterfaceC0484z) obj, (E7.d) obj2)).invokeSuspend(A7.n.f558a);
    }

    @Override // G7.a
    public final Object invokeSuspend(Object obj) {
        F7.a aVar = F7.a.f2587a;
        int i9 = this.f16812r;
        if (i9 != 0) {
            if (i9 == 1) {
                AbstractC0485a.A(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            AbstractC0485a.A(obj);
            this.f16812r = 1;
            if (Y7.B.g(200L, this) == aVar) {
                return aVar;
            }
        }
        C1108b c1108b = (C1108b) this.f16813s.f13789H0.getValue();
        c1108b.getClass();
        new R1.B(c1108b, 1).filter(this.f16814t);
        return A7.n.f558a;
    }
}
