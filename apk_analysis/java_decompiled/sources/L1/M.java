package L1;

import Y7.InterfaceC0484z;
import a.AbstractC0485a;
import b8.C0718Q;
import com.anilab.domain.model.Movie;

/* loaded from: classes.dex */
public final class M extends G7.j implements O7.p {

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ S f4474r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ Movie f4475s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ String f4476t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ String f4477u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public M(S s9, Movie movie, String str, String str2, E7.d dVar) {
        super(2, dVar);
        this.f4474r = s9;
        this.f4475s = movie;
        this.f4476t = str;
        this.f4477u = str2;
    }

    @Override // G7.a
    public final E7.d create(Object obj, E7.d dVar) {
        return new M(this.f4474r, this.f4475s, this.f4476t, this.f4477u, dVar);
    }

    @Override // O7.p
    public final Object invoke(Object obj, Object obj2) {
        M m9 = (M) create((InterfaceC0484z) obj, (E7.d) obj2);
        A7.n nVar = A7.n.f558a;
        m9.invokeSuspend(nVar);
        return nVar;
    }

    @Override // G7.a
    public final Object invokeSuspend(Object obj) {
        AbstractC0485a.A(obj);
        C0718Q c0718q = this.f4474r.f4503q;
        M1.t tVar = new M1.t(new b2.p(this.f4475s, this.f4476t, this.f4477u));
        c0718q.getClass();
        c0718q.j(null, tVar);
        return A7.n.f558a;
    }
}
