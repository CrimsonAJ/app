package e2;

import Y7.InterfaceC0484z;
import a.AbstractC0485a;
import b8.C0718Q;
import com.anilab.domain.model.Movie;
import java.util.ArrayList;

/* renamed from: e2.A, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1135A extends G7.j implements O7.p {

    /* renamed from: r, reason: collision with root package name */
    public long f17079r;

    /* renamed from: s, reason: collision with root package name */
    public Object f17080s;

    /* renamed from: t, reason: collision with root package name */
    public int f17081t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ C1136B f17082u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1135A(C1136B c1136b, E7.d dVar) {
        super(2, dVar);
        this.f17082u = c1136b;
    }

    @Override // G7.a
    public final E7.d create(Object obj, E7.d dVar) {
        return new C1135A(this.f17082u, dVar);
    }

    @Override // O7.p
    public final Object invoke(Object obj, Object obj2) {
        return ((C1135A) create((InterfaceC0484z) obj, (E7.d) obj2)).invokeSuspend(A7.n.f558a);
    }

    @Override // G7.a
    public final Object invokeSuspend(Object obj) {
        Object a5;
        long j;
        F7.a aVar = F7.a.f2587a;
        int i9 = this.f17081t;
        A7.n nVar = A7.n.f558a;
        C1136B c1136b = this.f17082u;
        if (i9 != 0) {
            if (i9 != 1) {
                if (i9 == 2) {
                    AbstractC0485a.A(obj);
                    return nVar;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            j = this.f17079r;
            AbstractC0485a.A(obj);
            a5 = ((A7.j) obj).f550a;
        } else {
            AbstractC0485a.A(obj);
            Movie movie = c1136b.f17090n;
            if (movie != null) {
                long j4 = movie.f14414a;
                this.f17079r = j4;
                this.f17081t = 1;
                a5 = c1136b.f17086i.a(j4, this);
                if (a5 != aVar) {
                    j = j4;
                }
                return aVar;
            }
            return nVar;
        }
        if (!(a5 instanceof A7.i)) {
            Iterable iterable = (Iterable) ((C0718Q) c1136b.f17087k.f11422a).h();
            ArrayList arrayList = new ArrayList();
            for (Object obj2 : iterable) {
                if (((Movie) obj2).f14414a != j) {
                    arrayList.add(obj2);
                }
            }
            C0718Q c0718q = c1136b.j;
            c0718q.getClass();
            c0718q.j(null, arrayList);
        }
        Throwable a9 = A7.j.a(a5);
        if (a9 != null) {
            this.f17080s = a5;
            this.f17081t = 2;
            if (c1136b.f(a9, this) == aVar) {
                return aVar;
            }
        }
        return nVar;
    }
}
