package a2;

import A7.n;
import M1.E;
import O7.p;
import a.AbstractC0485a;
import com.anilab.android.ui.activity.MainActivity;
import com.anilab.android.ui.logout.BottomSheetConfirmLogout;
import i0.AbstractActivityC1369y;

/* loaded from: classes.dex */
public final class b extends G7.j implements p {

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f9083r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ BottomSheetConfirmLogout f9084s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(BottomSheetConfirmLogout bottomSheetConfirmLogout, E7.d dVar) {
        super(2, dVar);
        this.f9084s = bottomSheetConfirmLogout;
    }

    @Override // G7.a
    public final E7.d create(Object obj, E7.d dVar) {
        b bVar = new b(this.f9084s, dVar);
        bVar.f9083r = obj;
        return bVar;
    }

    @Override // O7.p
    public final Object invoke(Object obj, Object obj2) {
        b bVar = (b) create((E) obj, (E7.d) obj2);
        n nVar = n.f558a;
        bVar.invokeSuspend(nVar);
        return nVar;
    }

    @Override // G7.a
    public final Object invokeSuspend(Object obj) {
        MainActivity mainActivity;
        AbstractC0485a.A(obj);
        E e8 = (E) this.f9083r;
        BottomSheetConfirmLogout bottomSheetConfirmLogout = this.f9084s;
        AbstractActivityC1369y k5 = bottomSheetConfirmLogout.k();
        if (k5 instanceof MainActivity) {
            mainActivity = (MainActivity) k5;
        } else {
            mainActivity = null;
        }
        if (mainActivity != null) {
            int i9 = MainActivity.f13724k0;
            mainActivity.Z(e8);
        }
        bottomSheetConfirmLogout.l0();
        return n.f558a;
    }
}
