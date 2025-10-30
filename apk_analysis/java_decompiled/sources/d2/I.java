package d2;

import Y7.InterfaceC0484z;
import a.AbstractC0485a;
import b8.C0718Q;
import com.anilab.domain.model.Movie;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class I extends G7.j implements O7.p {

    /* renamed from: r, reason: collision with root package name */
    public int f16737r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ K f16738s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ long f16739t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public I(K k5, long j, E7.d dVar) {
        super(2, dVar);
        this.f16738s = k5;
        this.f16739t = j;
    }

    @Override // G7.a
    public final E7.d create(Object obj, E7.d dVar) {
        return new I(this.f16738s, this.f16739t, dVar);
    }

    @Override // O7.p
    public final Object invoke(Object obj, Object obj2) {
        return ((I) create((InterfaceC0484z) obj, (E7.d) obj2)).invokeSuspend(A7.n.f558a);
    }

    @Override // G7.a
    public final Object invokeSuspend(Object obj) {
        Object a5;
        double d9;
        Object obj2 = F7.a.f2587a;
        int i9 = this.f16737r;
        K k5 = this.f16738s;
        if (i9 != 0) {
            if (i9 == 1) {
                AbstractC0485a.A(obj);
                a5 = ((A7.j) obj).f550a;
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            AbstractC0485a.A(obj);
            this.f16737r = 1;
            a5 = k5.f16753m.a(this.f16739t, this);
            if (a5 == obj2) {
                return obj2;
            }
        }
        if (!(a5 instanceof A7.i)) {
            List<H2.z> list = (List) a5;
            Movie movie = (Movie) k5.f16757q.h();
            if (movie != null) {
                if (list.isEmpty()) {
                    d9 = 0.0d;
                } else {
                    int i10 = 0;
                    int i11 = 0;
                    for (H2.z zVar : list) {
                        i11 += zVar.f3094a * zVar.f3095b;
                    }
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        i10 += ((H2.z) it.next()).f3095b;
                    }
                    d9 = i11 / i10;
                }
                movie.f14430r = d9;
            }
            M1.t tVar = new M1.t(Boolean.TRUE);
            C0718Q c0718q = k5.f16763w;
            c0718q.getClass();
            c0718q.j(null, tVar);
        }
        return A7.n.f558a;
    }
}
