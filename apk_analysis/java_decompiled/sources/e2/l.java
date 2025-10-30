package e2;

import androidx.recyclerview.widget.GridLayoutManager;
import com.anilab.android.ui.myList.MyListFragment;

/* loaded from: classes.dex */
public final class l extends M1.s {
    public final /* synthetic */ MyListFragment j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(MyListFragment myListFragment, androidx.recyclerview.widget.a aVar) {
        super((GridLayoutManager) aVar);
        this.j = myListFragment;
        kotlin.jvm.internal.h.c(aVar, "null cannot be cast to non-null type androidx.recyclerview.widget.GridLayoutManager");
    }

    @Override // M1.s
    public final void c(int i9) {
        C1136B h02 = this.j.h0();
        h02.getClass();
        h02.d(true, new y(h02, i9, null));
    }
}
