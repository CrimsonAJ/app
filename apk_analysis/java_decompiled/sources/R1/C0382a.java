package R1;

import B7.C0050a;
import J1.AbstractC0176g;
import android.content.Context;
import android.widget.ArrayAdapter;
import co.notix.R;
import com.anilab.android.ui.download.DownloadFragment;
import com.anilab.domain.model.Movie;

/* renamed from: R1.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C0382a implements O7.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6517a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ DownloadFragment f6518b;

    public /* synthetic */ C0382a(DownloadFragment downloadFragment, int i9) {
        this.f6517a = i9;
        this.f6518b = downloadFragment;
    }

    @Override // O7.a
    public final Object invoke() {
        switch (this.f6517a) {
            case 0:
                DownloadFragment downloadFragment = this.f6518b;
                Movie movie = ((s) downloadFragment.f13746T0.getValue()).f6554a;
                return new C(movie.f14415b, new C0050a(3, downloadFragment), new C0382a(downloadFragment, 2));
            case 1:
                Context m9 = this.f6518b.m();
                if (m9 != null) {
                    return new ArrayAdapter(m9, R.layout.item_spinner);
                }
                return null;
            default:
                ((AbstractC0176g) this.f6518b.m0()).f3929C.h0(0);
                return A7.n.f558a;
        }
    }
}
