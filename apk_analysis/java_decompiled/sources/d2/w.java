package d2;

import android.os.Bundle;
import com.anilab.android.ui.movieDetail.MovieDetailFragment;

/* loaded from: classes.dex */
public final class w extends kotlin.jvm.internal.i implements O7.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f16820d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ MovieDetailFragment f16821e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ w(MovieDetailFragment movieDetailFragment, int i9) {
        super(0);
        this.f16820d = i9;
        this.f16821e = movieDetailFragment;
    }

    @Override // O7.a
    public final Object invoke() {
        switch (this.f16820d) {
            case 0:
                MovieDetailFragment movieDetailFragment = this.f16821e;
                Bundle bundle = movieDetailFragment.f18390f;
                if (bundle != null) {
                    return bundle;
                }
                throw new IllegalStateException("Fragment " + movieDetailFragment + " has null arguments");
            default:
                return this.f16821e;
        }
    }
}
