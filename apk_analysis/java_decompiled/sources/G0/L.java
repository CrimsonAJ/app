package G0;

import com.anilab.android.ui.myList.MyListFragment;
import com.anilab.domain.model.Genre;
import e2.C1135A;
import e2.C1136B;

/* loaded from: classes.dex */
public final /* synthetic */ class L implements O7.l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2674a;

    public /* synthetic */ L(int i9) {
        this.f2674a = i9;
    }

    @Override // O7.l
    public final Object invoke(Object obj) {
        boolean z9;
        switch (this.f2674a) {
            case 0:
                P0.c it = (P0.c) obj;
                kotlin.jvm.internal.h.e(it, "it");
                return Boolean.valueOf(it.W());
            case 1:
                P0.c statement = (P0.c) obj;
                kotlin.jvm.internal.h.e(statement, "statement");
                C7.j jVar = new C7.j();
                while (statement.W()) {
                    jVar.add(Integer.valueOf((int) statement.H(0)));
                }
                return O4.h.e(jVar);
            case 2:
                Genre it2 = (Genre) obj;
                kotlin.jvm.internal.h.e(it2, "it");
                return it2.f14406b;
            case 3:
                long longValue = ((Long) obj).longValue();
                return g6.o.f17761a.z0() + longValue;
            case 4:
                if (obj == null) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                return Boolean.valueOf(z9);
            case 5:
                MyListFragment findMyListFragment = (MyListFragment) obj;
                kotlin.jvm.internal.h.e(findMyListFragment, "$this$findMyListFragment");
                C1136B h02 = findMyListFragment.h0();
                h02.getClass();
                h02.d(true, new e2.z(h02, null));
                return A7.n.f558a;
            default:
                MyListFragment findMyListFragment2 = (MyListFragment) obj;
                kotlin.jvm.internal.h.e(findMyListFragment2, "$this$findMyListFragment");
                C1136B h03 = findMyListFragment2.h0();
                h03.getClass();
                h03.d(false, new C1135A(h03, null));
                return A7.n.f558a;
        }
    }
}
