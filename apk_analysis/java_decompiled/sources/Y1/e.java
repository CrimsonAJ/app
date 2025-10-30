package Y1;

import androidx.lifecycle.h0;
import androidx.lifecycle.j0;
import com.anilab.android.ui.login.LoginFragment;
import kotlin.jvm.internal.i;

/* loaded from: classes.dex */
public final class e extends i implements O7.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f8581d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ LoginFragment f8582e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(LoginFragment loginFragment, int i9) {
        super(0);
        this.f8581d = i9;
        this.f8582e = loginFragment;
    }

    @Override // O7.a
    public final Object invoke() {
        switch (this.f8581d) {
            case 0:
                j0 u9 = this.f8582e.W().u();
                kotlin.jvm.internal.h.d(u9, "requireActivity().viewModelStore");
                return u9;
            case 1:
                return this.f8582e.W().p();
            case 2:
                h0 j = this.f8582e.W().j();
                kotlin.jvm.internal.h.d(j, "requireActivity().defaultViewModelProviderFactory");
                return j;
            default:
                return this.f8582e;
        }
    }
}
