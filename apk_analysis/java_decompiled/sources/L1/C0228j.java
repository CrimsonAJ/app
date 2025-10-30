package L1;

import co.notix.R;
import co.notix.interstitial.InterstitialButton;
import co.notix.interstitial.InterstitialData;
import co.notix.interstitial.NotixInterstitial;
import com.anilab.android.ui.activity.MainActivity;

/* renamed from: L1.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0228j implements O7.l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ MainActivity f4528a;

    public C0228j(MainActivity mainActivity) {
        this.f4528a = mainActivity;
    }

    @Override // O7.l
    public final Object invoke(Object obj) {
        InterstitialData interstitialData = (InterstitialData) obj;
        if (interstitialData != null) {
            NotixInterstitial.Companion companion = NotixInterstitial.Companion;
            MainActivity mainActivity = this.f4528a;
            NotixInterstitial.DefaultImpls.show$default(companion, interstitialData, new InterstitialButton(mainActivity.getString(R.string.label_open)), false, null, null, new C0227i(mainActivity), 28, null);
        }
        return A7.n.f558a;
    }
}
