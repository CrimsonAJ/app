package M1;

import androidx.lifecycle.h0;
import androidx.lifecycle.j0;

/* loaded from: classes.dex */
public final class A extends kotlin.jvm.internal.i implements O7.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f4699d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ B f4700e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ A(B b9, int i9) {
        super(0);
        this.f4699d = i9;
        this.f4700e = b9;
    }

    @Override // O7.a
    public final Object invoke() {
        switch (this.f4699d) {
            case 0:
                j0 u9 = this.f4700e.W().u();
                kotlin.jvm.internal.h.d(u9, "requireActivity().viewModelStore");
                return u9;
            case 1:
                return this.f4700e.W().p();
            default:
                h0 j = this.f4700e.W().j();
                kotlin.jvm.internal.h.d(j, "requireActivity().defaultViewModelProviderFactory");
                return j;
        }
    }
}
