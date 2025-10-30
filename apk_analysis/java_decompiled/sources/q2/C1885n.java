package q2;

import android.os.Bundle;
import androidx.lifecycle.h0;
import androidx.lifecycle.j0;
import com.anilab.android.ui.update.UpdateFragment;

/* renamed from: q2.n, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1885n extends kotlin.jvm.internal.i implements O7.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f22263d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ UpdateFragment f22264e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1885n(UpdateFragment updateFragment, int i9) {
        super(0);
        this.f22263d = i9;
        this.f22264e = updateFragment;
    }

    @Override // O7.a
    public final Object invoke() {
        switch (this.f22263d) {
            case 0:
                j0 u9 = this.f22264e.W().u();
                kotlin.jvm.internal.h.d(u9, "requireActivity().viewModelStore");
                return u9;
            case 1:
                return this.f22264e.W().p();
            case 2:
                h0 j = this.f22264e.W().j();
                kotlin.jvm.internal.h.d(j, "requireActivity().defaultViewModelProviderFactory");
                return j;
            case 3:
                UpdateFragment updateFragment = this.f22264e;
                Bundle bundle = updateFragment.f18390f;
                if (bundle != null) {
                    return bundle;
                }
                throw new IllegalStateException("Fragment " + updateFragment + " has null arguments");
            default:
                return this.f22264e;
        }
    }
}
