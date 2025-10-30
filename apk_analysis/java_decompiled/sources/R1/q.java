package R1;

import J1.AbstractC0165c;
import J1.AbstractC0172e0;
import J1.AbstractC0176g;
import J1.AbstractC0204u0;
import Y7.y0;
import android.text.Editable;
import android.text.TextWatcher;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.lifecycle.Y;
import co.notix.R;
import com.anilab.android.ui.download.DownloadFragment;
import com.anilab.android.ui.movieDetail.MovieDetailFragment;
import com.anilab.android.ui.player.PlayerActivity;
import com.anilab.android.ui.search.SearchFragment;
import g2.C1204F;
import l2.C1539d;
import l2.C1549n;

/* loaded from: classes.dex */
public final class q implements TextWatcher {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6549a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ W.g f6550b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f6551c;

    public /* synthetic */ q(W.g gVar, Object obj, int i9) {
        this.f6549a = i9;
        this.f6550b = gVar;
        this.f6551c = obj;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        String str;
        CharSequence j02;
        switch (this.f6549a) {
            case 0:
            case 1:
            case 2:
                return;
            default:
                if (((AbstractC0204u0) this.f6550b).f4100D.hasFocus()) {
                    SearchFragment searchFragment = (SearchFragment) this.f6551c;
                    ((C1539d) searchFragment.f13831G0.getValue()).d();
                    C1549n h02 = searchFragment.h0();
                    if (editable != null && (j02 = W7.d.j0(editable)) != null) {
                        str = j02.toString();
                    } else {
                        str = null;
                    }
                    if (str == null) {
                        str = "";
                    }
                    h02.g(1, str);
                    return;
                }
                return;
        }
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i9, int i10, int i11) {
        int i12 = this.f6549a;
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i9, int i10, int i11) {
        int i12;
        int i13;
        int i14;
        switch (this.f6549a) {
            case 0:
                AbstractC0176g abstractC0176g = (AbstractC0176g) this.f6550b;
                if (charSequence != null && !W7.d.U(charSequence)) {
                    i12 = R.drawable.ic_back;
                } else {
                    i12 = R.drawable.ic_search;
                }
                abstractC0176g.f3935x.setImageResource(i12);
                DownloadFragment downloadFragment = (DownloadFragment) this.f6551c;
                y0 y0Var = downloadFragment.f13750X0;
                if (y0Var != null) {
                    y0Var.d(null);
                }
                downloadFragment.f13750X0 = Y7.B.r(Y.f(downloadFragment), null, new p(downloadFragment, charSequence, null), 3);
                return;
            case 1:
                AbstractC0172e0 abstractC0172e0 = (AbstractC0172e0) this.f6550b;
                if (charSequence != null && !W7.d.U(charSequence)) {
                    i13 = R.drawable.ic_back;
                } else {
                    i13 = R.drawable.ic_search;
                }
                abstractC0172e0.f3893D.setImageResource(i13);
                MovieDetailFragment movieDetailFragment = (MovieDetailFragment) this.f6551c;
                y0 y0Var2 = movieDetailFragment.f13791J0;
                if (y0Var2 != null) {
                    y0Var2.d(null);
                }
                movieDetailFragment.f13791J0 = Y7.B.r(Y.f(movieDetailFragment), null, new d2.t(movieDetailFragment, charSequence, null), 3);
                return;
            case 2:
                AppCompatImageView appCompatImageView = ((AbstractC0165c) this.f6550b).f3847G;
                if (charSequence != null && !W7.d.U(charSequence)) {
                    i14 = R.drawable.ic_back;
                } else {
                    i14 = R.drawable.ic_search;
                }
                appCompatImageView.setImageResource(i14);
                PlayerActivity playerActivity = (PlayerActivity) this.f6551c;
                y0 y0Var3 = playerActivity.r0;
                if (y0Var3 != null) {
                    y0Var3.d(null);
                }
                playerActivity.r0 = Y7.B.r(Y.f(playerActivity), null, new C1204F(playerActivity, charSequence, null), 3);
                return;
            default:
                return;
        }
    }

    private final void a(Editable editable) {
    }

    private final void b(Editable editable) {
    }

    private final void c(Editable editable) {
    }

    private final void d(int i9, int i10, int i11, CharSequence charSequence) {
    }

    private final void e(int i9, int i10, int i11, CharSequence charSequence) {
    }

    private final void f(int i9, int i10, int i11, CharSequence charSequence) {
    }

    private final void g(int i9, int i10, int i11, CharSequence charSequence) {
    }

    private final void h(int i9, int i10, int i11, CharSequence charSequence) {
    }
}
