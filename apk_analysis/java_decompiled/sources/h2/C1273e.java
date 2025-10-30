package h2;

import androidx.lifecycle.h0;
import androidx.lifecycle.j0;
import com.anilab.android.ui.profile.ProfileFragment;
import kotlin.jvm.internal.h;
import kotlin.jvm.internal.i;

/* renamed from: h2.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1273e extends i implements O7.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f17874d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ProfileFragment f17875e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1273e(ProfileFragment profileFragment, int i9) {
        super(0);
        this.f17874d = i9;
        this.f17875e = profileFragment;
    }

    @Override // O7.a
    public final Object invoke() {
        switch (this.f17874d) {
            case 0:
                j0 u9 = this.f17875e.W().u();
                h.d(u9, "requireActivity().viewModelStore");
                return u9;
            case 1:
                return this.f17875e.W().p();
            case 2:
                h0 j = this.f17875e.W().j();
                h.d(j, "requireActivity().defaultViewModelProviderFactory");
                return j;
            default:
                return this.f17875e;
        }
    }
}
