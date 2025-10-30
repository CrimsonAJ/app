package V1;

import M1.s;
import androidx.recyclerview.widget.GridLayoutManager;
import com.anilab.android.ui.filterResult.FilterResultFragment;

/* loaded from: classes.dex */
public final class d extends s {
    public final /* synthetic */ FilterResultFragment j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(FilterResultFragment filterResultFragment, androidx.recyclerview.widget.a aVar) {
        super((GridLayoutManager) aVar);
        this.j = filterResultFragment;
        kotlin.jvm.internal.h.c(aVar, "null cannot be cast to non-null type androidx.recyclerview.widget.GridLayoutManager");
    }

    @Override // M1.s
    public final void c(int i9) {
        FilterResultFragment filterResultFragment = this.j;
        filterResultFragment.h0().g(i9, filterResultFragment.s0().f7633b, filterResultFragment.s0().f7632a, filterResultFragment.s0().f7634c, B7.j.o0(filterResultFragment.s0().f7635d));
    }
}
