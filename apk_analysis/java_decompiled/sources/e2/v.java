package e2;

import androidx.lifecycle.h0;
import androidx.lifecycle.j0;
import com.anilab.android.ui.myList.MyListFragment;

/* loaded from: classes.dex */
public final class v extends kotlin.jvm.internal.i implements O7.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f17132d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ MyListFragment f17133e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ v(MyListFragment myListFragment, int i9) {
        super(0);
        this.f17132d = i9;
        this.f17133e = myListFragment;
    }

    @Override // O7.a
    public final Object invoke() {
        switch (this.f17132d) {
            case 0:
                j0 u9 = this.f17133e.W().u();
                kotlin.jvm.internal.h.d(u9, "requireActivity().viewModelStore");
                return u9;
            case 1:
                return this.f17133e.W().p();
            case 2:
                h0 j = this.f17133e.W().j();
                kotlin.jvm.internal.h.d(j, "requireActivity().defaultViewModelProviderFactory");
                return j;
            default:
                return this.f17133e;
        }
    }
}
