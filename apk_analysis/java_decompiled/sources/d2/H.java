package d2;

import Y7.InterfaceC0484z;
import a.AbstractC0485a;
import com.anilab.domain.model.Movie;

/* loaded from: classes.dex */
public final class H extends G7.j implements O7.p {

    /* renamed from: r, reason: collision with root package name */
    public int f16734r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ K f16735s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Movie f16736t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public H(K k5, Movie movie, E7.d dVar) {
        super(2, dVar);
        this.f16735s = k5;
        this.f16736t = movie;
    }

    @Override // G7.a
    public final E7.d create(Object obj, E7.d dVar) {
        return new H(this.f16735s, this.f16736t, dVar);
    }

    @Override // O7.p
    public final Object invoke(Object obj, Object obj2) {
        return ((H) create((InterfaceC0484z) obj, (E7.d) obj2)).invokeSuspend(A7.n.f558a);
    }

    @Override // G7.a
    public final Object invokeSuspend(Object obj) {
        Object a5;
        F7.a aVar = F7.a.f2587a;
        int i9 = this.f16734r;
        K k5 = this.f16735s;
        if (i9 != 0) {
            if (i9 == 1) {
                AbstractC0485a.A(obj);
                a5 = ((A7.j) obj).f550a;
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            AbstractC0485a.A(obj);
            Movie movie = this.f16736t;
            this.f16734r = 1;
            a5 = k5.f16755o.a(movie.f14414a, 1, 1, this);
            if (a5 == aVar) {
                return aVar;
            }
        }
        if (!(a5 instanceof A7.i)) {
            k5.f16765y.i((H2.e) a5);
        }
        return A7.n.f558a;
    }
}
