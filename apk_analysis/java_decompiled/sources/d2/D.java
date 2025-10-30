package d2;

import Y7.InterfaceC0484z;
import a.AbstractC0485a;
import b8.C0718Q;
import com.anilab.domain.model.Movie;
import java.util.List;

/* loaded from: classes.dex */
public final class D extends G7.j implements O7.p {

    /* renamed from: r, reason: collision with root package name */
    public int f16717r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ K f16718s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Movie f16719t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public D(K k5, Movie movie, E7.d dVar) {
        super(2, dVar);
        this.f16718s = k5;
        this.f16719t = movie;
    }

    @Override // G7.a
    public final E7.d create(Object obj, E7.d dVar) {
        return new D(this.f16718s, this.f16719t, dVar);
    }

    @Override // O7.p
    public final Object invoke(Object obj, Object obj2) {
        return ((D) create((InterfaceC0484z) obj, (E7.d) obj2)).invokeSuspend(A7.n.f558a);
    }

    @Override // G7.a
    public final Object invokeSuspend(Object obj) {
        Object a5;
        F7.a aVar = F7.a.f2587a;
        int i9 = this.f16717r;
        K k5 = this.f16718s;
        if (i9 != 0) {
            if (i9 == 1) {
                AbstractC0485a.A(obj);
                a5 = ((A7.j) obj).f550a;
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            AbstractC0485a.A(obj);
            Movie movie = this.f16719t;
            this.f16717r = 1;
            a5 = k5.f16748g.a(movie.f14414a, this);
            if (a5 == aVar) {
                return aVar;
            }
        }
        B7.t tVar = B7.t.f1135a;
        if (a5 instanceof A7.i) {
            a5 = tVar;
        }
        List list = (List) a5;
        k5.f16744A = list.isEmpty();
        C0718Q c0718q = k5.f16759s;
        c0718q.getClass();
        c0718q.j(null, list);
        return A7.n.f558a;
    }
}
