package a2;

import androidx.lifecycle.h0;
import androidx.lifecycle.j0;
import com.anilab.android.ui.logout.BottomSheetConfirmLogout;

/* loaded from: classes.dex */
public final class h extends kotlin.jvm.internal.i implements O7.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f9095d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ BottomSheetConfirmLogout f9096e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h(BottomSheetConfirmLogout bottomSheetConfirmLogout, int i9) {
        super(0);
        this.f9095d = i9;
        this.f9096e = bottomSheetConfirmLogout;
    }

    @Override // O7.a
    public final Object invoke() {
        switch (this.f9095d) {
            case 0:
                j0 u9 = this.f9096e.W().u();
                kotlin.jvm.internal.h.d(u9, "requireActivity().viewModelStore");
                return u9;
            case 1:
                return this.f9096e.W().p();
            case 2:
                h0 j = this.f9096e.W().j();
                kotlin.jvm.internal.h.d(j, "requireActivity().defaultViewModelProviderFactory");
                return j;
            default:
                return this.f9096e;
        }
    }
}
