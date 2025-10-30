package X1;

import B7.C0050a;
import J1.P;
import a.AbstractC0485a;
import com.anilab.android.ui.home.HomeFragment;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X1.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0437f extends G7.j implements O7.p {

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f8263r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ HomeFragment f8264s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0437f(E7.d dVar, HomeFragment homeFragment) {
        super(2, dVar);
        this.f8264s = homeFragment;
    }

    @Override // G7.a
    public final E7.d create(Object obj, E7.d dVar) {
        C0437f c0437f = new C0437f(dVar, this.f8264s);
        c0437f.f8263r = obj;
        return c0437f;
    }

    @Override // O7.p
    public final Object invoke(Object obj, Object obj2) {
        C0437f c0437f = (C0437f) create((List) obj, (E7.d) obj2);
        A7.n nVar = A7.n.f558a;
        c0437f.invokeSuspend(nVar);
        return nVar;
    }

    @Override // G7.a
    public final Object invokeSuspend(Object obj) {
        List list;
        AbstractC0485a.A(obj);
        List list2 = (List) this.f8263r;
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : list2) {
            if (obj2 instanceof H2.m) {
                arrayList.add(obj2);
            }
        }
        H2.m mVar = (H2.m) B7.k.q0(arrayList);
        if (mVar != null) {
            list = mVar.f3037a;
        } else {
            list = null;
        }
        if (list == null) {
            list = B7.t.f1135a;
        }
        HomeFragment homeFragment = this.f8264s;
        homeFragment.f13774H0 = new H(list, new C0050a(4, homeFragment));
        P p9 = (P) homeFragment.e0();
        H h7 = homeFragment.f13774H0;
        if (h7 != null) {
            p9.f3747B.setAdapter(h7);
            ArrayList arrayList2 = new ArrayList();
            for (Object obj3 : list2) {
                if (!(((H2.n) obj3) instanceof H2.m)) {
                    arrayList2.add(obj3);
                }
            }
            F f9 = (F) homeFragment.f13773G0.getValue();
            f9.getClass();
            ArrayList arrayList3 = f9.f8242e;
            arrayList3.clear();
            arrayList3.addAll(arrayList2);
            f9.d();
            return A7.n.f558a;
        }
        kotlin.jvm.internal.h.h("sliderAdapter");
        throw null;
    }
}
