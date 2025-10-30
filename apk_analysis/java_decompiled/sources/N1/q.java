package N1;

import android.os.Bundle;
import com.anilab.android.ui.categoryDetail.MovieListFragment;

/* loaded from: classes.dex */
public final class q extends kotlin.jvm.internal.i implements O7.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f4865d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ MovieListFragment f4866e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ q(MovieListFragment movieListFragment, int i9) {
        super(0);
        this.f4865d = i9;
        this.f4866e = movieListFragment;
    }

    @Override // O7.a
    public final Object invoke() {
        switch (this.f4865d) {
            case 0:
                MovieListFragment movieListFragment = this.f4866e;
                Bundle bundle = movieListFragment.f18390f;
                if (bundle != null) {
                    return bundle;
                }
                throw new IllegalStateException("Fragment " + movieListFragment + " has null arguments");
            default:
                return this.f4866e;
        }
    }
}
