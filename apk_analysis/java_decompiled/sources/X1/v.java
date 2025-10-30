package X1;

import Y7.InterfaceC0484z;
import a.AbstractC0485a;
import b8.C0718Q;
import com.anilab.domain.model.Movie;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class v extends G7.j implements O7.p {

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ y f8301r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ boolean f8302s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(y yVar, boolean z9, E7.d dVar) {
        super(2, dVar);
        this.f8301r = yVar;
        this.f8302s = z9;
    }

    @Override // G7.a
    public final E7.d create(Object obj, E7.d dVar) {
        return new v(this.f8301r, this.f8302s, dVar);
    }

    @Override // O7.p
    public final Object invoke(Object obj, Object obj2) {
        v vVar = (v) create((InterfaceC0484z) obj, (E7.d) obj2);
        A7.n nVar = A7.n.f558a;
        vVar.invokeSuspend(nVar);
        return nVar;
    }

    @Override // G7.a
    public final Object invokeSuspend(Object obj) {
        List<Movie> list;
        boolean z9;
        AbstractC0485a.A(obj);
        y yVar = this.f8301r;
        List list2 = (List) yVar.f8317n.h();
        boolean isEmpty = list2.isEmpty();
        boolean z10 = this.f8302s;
        if (!isEmpty && !z10) {
            List a5 = yVar.f8312h.a();
            ArrayList arrayList = new ArrayList();
            for (Object obj2 : list2) {
                if (obj2 instanceof H2.m) {
                    arrayList.add(obj2);
                }
            }
            H2.m mVar = (H2.m) B7.k.q0(arrayList);
            if (mVar != null && (list = mVar.f3037a) != null) {
                for (Movie movie : list) {
                    if (yVar.f8314k.f5769a.b()) {
                        z9 = a5.contains(new Long(movie.f14414a));
                    } else {
                        z9 = false;
                    }
                    movie.f14428p = z9;
                }
            }
            C0718Q c0718q = yVar.f8317n;
            c0718q.getClass();
            c0718q.j(null, list2);
        } else {
            yVar.d(true, new u(yVar, z10, null));
        }
        return A7.n.f558a;
    }
}
