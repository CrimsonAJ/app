package N1;

import androidx.recyclerview.widget.LinearLayoutManager;
import com.anilab.android.ui.categoryDetail.MovieListFragment;

/* loaded from: classes.dex */
public final class j extends M1.s {
    public final /* synthetic */ MovieListFragment j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(MovieListFragment movieListFragment, androidx.recyclerview.widget.a aVar) {
        super((LinearLayoutManager) aVar);
        this.j = movieListFragment;
        kotlin.jvm.internal.h.c(aVar, "null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager");
    }

    @Override // M1.s
    public final void c(int i9) {
        MovieListFragment movieListFragment = this.j;
        movieListFragment.h0().g(movieListFragment.s0().f4874a, i9, false);
    }
}
