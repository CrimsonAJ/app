package T1;

import androidx.lifecycle.h0;
import androidx.lifecycle.j0;
import com.anilab.android.ui.external_player.SelectSubtitleForPlayerFragment;

/* loaded from: classes.dex */
public final class y extends kotlin.jvm.internal.i implements O7.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f7048d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ SelectSubtitleForPlayerFragment f7049e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ y(SelectSubtitleForPlayerFragment selectSubtitleForPlayerFragment, int i9) {
        super(0);
        this.f7048d = i9;
        this.f7049e = selectSubtitleForPlayerFragment;
    }

    @Override // O7.a
    public final Object invoke() {
        switch (this.f7048d) {
            case 0:
                j0 u9 = this.f7049e.W().u();
                kotlin.jvm.internal.h.d(u9, "requireActivity().viewModelStore");
                return u9;
            case 1:
                return this.f7049e.W().p();
            case 2:
                h0 j = this.f7049e.W().j();
                kotlin.jvm.internal.h.d(j, "requireActivity().defaultViewModelProviderFactory");
                return j;
            default:
                return this.f7049e;
        }
    }
}
