package e2;

import J1.AbstractC0177g0;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.constraintlayout.widget.Group;
import b8.C0718Q;
import b8.InterfaceC0726f;
import com.anilab.android.ui.myList.MyListFragment;
import java.util.List;

/* loaded from: classes.dex */
public final class m implements InterfaceC0726f {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17114a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ MyListFragment f17115b;

    public /* synthetic */ m(MyListFragment myListFragment, int i9) {
        this.f17114a = i9;
        this.f17115b = myListFragment;
    }

    @Override // b8.InterfaceC0726f
    public final Object emit(Object obj, E7.d dVar) {
        switch (this.f17114a) {
            case 0:
                if (((Boolean) obj).booleanValue()) {
                    C0718Q c0718q = this.f17115b.h0().j;
                    B7.t tVar = B7.t.f1135a;
                    c0718q.getClass();
                    c0718q.j(null, tVar);
                }
                return A7.n.f558a;
            default:
                List list = (List) obj;
                MyListFragment myListFragment = this.f17115b;
                ((j) myListFragment.f13794E0.getValue()).o(list);
                if (myListFragment.h0().f17084g.f5769a.b()) {
                    if (list.isEmpty()) {
                        LinearLayoutCompat layoutEmpty = ((AbstractC0177g0) myListFragment.e0()).f3943y;
                        kotlin.jvm.internal.h.d(layoutEmpty, "layoutEmpty");
                        layoutEmpty.setVisibility(0);
                    } else {
                        LinearLayoutCompat layoutEmpty2 = ((AbstractC0177g0) myListFragment.e0()).f3943y;
                        kotlin.jvm.internal.h.d(layoutEmpty2, "layoutEmpty");
                        layoutEmpty2.setVisibility(8);
                    }
                } else {
                    Group groupSignInRequire = ((AbstractC0177g0) myListFragment.e0()).f3942x;
                    kotlin.jvm.internal.h.d(groupSignInRequire, "groupSignInRequire");
                    groupSignInRequire.setVisibility(0);
                }
                return A7.n.f558a;
        }
    }
}
