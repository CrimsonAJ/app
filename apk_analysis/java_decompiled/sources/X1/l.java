package X1;

import a.AbstractC0485a;
import com.anilab.android.ui.home.HomeFragment;
import java.util.List;

/* loaded from: classes.dex */
public final class l extends G7.j implements O7.p {

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f8275r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ HomeFragment f8276s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(E7.d dVar, HomeFragment homeFragment) {
        super(2, dVar);
        this.f8276s = homeFragment;
    }

    @Override // G7.a
    public final E7.d create(Object obj, E7.d dVar) {
        l lVar = new l(dVar, this.f8276s);
        lVar.f8275r = obj;
        return lVar;
    }

    @Override // O7.p
    public final Object invoke(Object obj, Object obj2) {
        l lVar = (l) create((M1.t) obj, (E7.d) obj2);
        A7.n nVar = A7.n.f558a;
        lVar.invokeSuspend(nVar);
        return nVar;
    }

    @Override // G7.a
    public final Object invokeSuspend(Object obj) {
        AbstractC0485a.A(obj);
        Object a5 = ((M1.t) this.f8275r).a();
        if (a5 != null && ((Boolean) a5).booleanValue()) {
            y h02 = this.f8276s.h0();
            if (h02.f8314k.f5769a.b()) {
                List list = (List) h02.f8317n.h();
                if (!list.isEmpty()) {
                    h02.d(true, new s(h02, list, null));
                }
            }
        }
        return A7.n.f558a;
    }
}
