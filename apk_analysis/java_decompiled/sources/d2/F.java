package d2;

import Y7.InterfaceC0484z;
import a.AbstractC0485a;
import com.anilab.domain.model.Movie;
import java.util.List;

/* loaded from: classes.dex */
public final class F extends G7.j implements O7.p {

    /* renamed from: r, reason: collision with root package name */
    public int f16727r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ K f16728s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Movie f16729t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public F(K k5, Movie movie, E7.d dVar) {
        super(2, dVar);
        this.f16728s = k5;
        this.f16729t = movie;
    }

    @Override // G7.a
    public final E7.d create(Object obj, E7.d dVar) {
        return new F(this.f16728s, this.f16729t, dVar);
    }

    @Override // O7.p
    public final Object invoke(Object obj, Object obj2) {
        return ((F) create((InterfaceC0484z) obj, (E7.d) obj2)).invokeSuspend(A7.n.f558a);
    }

    @Override // G7.a
    public final Object invokeSuspend(Object obj) {
        Object a5;
        Object obj2 = F7.a.f2587a;
        int i9 = this.f16727r;
        if (i9 != 0) {
            if (i9 == 1) {
                AbstractC0485a.A(obj);
                a5 = ((A7.j) obj).f550a;
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            AbstractC0485a.A(obj);
            K k5 = this.f16728s;
            Movie movie = this.f16729t;
            this.f16727r = 1;
            a5 = k5.f16753m.a(movie.f14414a, this);
            if (a5 == obj2) {
                return obj2;
            }
        }
        if (a5 instanceof A7.i) {
            a5 = null;
        }
        List list = (List) a5;
        if (list == null) {
            return B7.t.f1135a;
        }
        return list;
    }
}
