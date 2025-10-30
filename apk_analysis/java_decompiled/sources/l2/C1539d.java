package l2;

import J1.AbstractC0204u0;
import M1.s;
import androidx.recyclerview.widget.GridLayoutManager;
import com.anilab.android.ui.search.SearchFragment;

/* renamed from: l2.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1539d extends s {
    public final /* synthetic */ SearchFragment j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1539d(SearchFragment searchFragment, androidx.recyclerview.widget.a aVar) {
        super((GridLayoutManager) aVar);
        this.j = searchFragment;
        kotlin.jvm.internal.h.c(aVar, "null cannot be cast to non-null type androidx.recyclerview.widget.GridLayoutManager");
    }

    @Override // M1.s
    public final void c(int i9) {
        SearchFragment searchFragment = this.j;
        searchFragment.h0().g(i9, W7.d.j0(String.valueOf(((AbstractC0204u0) searchFragment.e0()).f4100D.getText())).toString());
    }
}
