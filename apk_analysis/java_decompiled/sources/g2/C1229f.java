package g2;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import co.notix.R;
import co.notix.interstitial.InterstitialButton;
import co.notix.interstitial.InterstitialData;
import co.notix.interstitial.NotixInterstitial;
import com.anilab.android.ui.player.PlayerActivity;
import com.google.android.gms.internal.measurement.Y1;
import java.util.Iterator;

/* renamed from: g2.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C1229f implements O7.l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17664a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ PlayerActivity f17665b;

    public /* synthetic */ C1229f(PlayerActivity playerActivity, int i9) {
        this.f17664a = i9;
        this.f17665b = playerActivity;
    }

    @Override // O7.l
    public final Object invoke(Object obj) {
        boolean z9 = true;
        A7.n nVar = A7.n.f558a;
        PlayerActivity playerActivity = this.f17665b;
        switch (this.f17664a) {
            case 0:
                View it = (View) obj;
                int i9 = PlayerActivity.f13798w0;
                kotlin.jvm.internal.h.e(it, "it");
                Iterator it2 = playerActivity.d0().f17638o.f3471f.iterator();
                int i10 = 0;
                while (true) {
                    if (it2.hasNext()) {
                        if (!((I2.a) it2.next()).j) {
                            i10++;
                        }
                    } else {
                        i10 = -1;
                    }
                }
                if (i10 <= 0) {
                    z9 = false;
                }
                it.setEnabled(z9);
                return nVar;
            case 1:
                InterstitialData interstitialData = (InterstitialData) obj;
                int i11 = PlayerActivity.f13798w0;
                if (interstitialData == null) {
                    Y7.B.r(androidx.lifecycle.Y.f(playerActivity), null, new C1200B(null, playerActivity), 3);
                } else {
                    NotixInterstitial.DefaultImpls.show$default(NotixInterstitial.Companion, interstitialData, new InterstitialButton(playerActivity.getString(R.string.label_open)), false, new C1227d(playerActivity, 6), new C1227d(playerActivity, 7), new C1229f(playerActivity, 9), 4, null);
                }
                return nVar;
            case 2:
                View it3 = (View) obj;
                int i12 = PlayerActivity.f13798w0;
                kotlin.jvm.internal.h.e(it3, "it");
                ViewGroup.LayoutParams layoutParams = it3.getLayoutParams();
                if (layoutParams != null) {
                    FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
                    int dimensionPixelSize = playerActivity.getResources().getDimensionPixelSize(R.dimen.dp_24);
                    int dimensionPixelSize2 = playerActivity.getResources().getDimensionPixelSize(R.dimen.dp_16);
                    layoutParams2.setMargins(dimensionPixelSize2, 0, dimensionPixelSize2, dimensionPixelSize);
                    it3.setLayoutParams(layoutParams2);
                    return nVar;
                }
                throw new NullPointerException("null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
            case 3:
                View it4 = (View) obj;
                int i13 = PlayerActivity.f13798w0;
                kotlin.jvm.internal.h.e(it4, "it");
                ViewGroup.LayoutParams layoutParams3 = it4.getLayoutParams();
                if (layoutParams3 != null) {
                    FrameLayout.LayoutParams layoutParams4 = (FrameLayout.LayoutParams) layoutParams3;
                    int dimensionPixelSize3 = playerActivity.getResources().getDimensionPixelSize(R.dimen.dp_12);
                    layoutParams4.setMargins(dimensionPixelSize3, 0, dimensionPixelSize3, playerActivity.getResources().getDimensionPixelSize(R.dimen.dp_64));
                    it4.setLayoutParams(layoutParams4);
                    return nVar;
                }
                throw new NullPointerException("null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
            case 4:
                View it5 = (View) obj;
                int i14 = PlayerActivity.f13798w0;
                kotlin.jvm.internal.h.e(it5, "it");
                ViewGroup.LayoutParams layoutParams5 = it5.getLayoutParams();
                if (layoutParams5 != null) {
                    FrameLayout.LayoutParams layoutParams6 = (FrameLayout.LayoutParams) layoutParams5;
                    int dimensionPixelSize4 = playerActivity.getResources().getDimensionPixelSize(R.dimen.dp_8);
                    layoutParams6.setMargins(dimensionPixelSize4, 0, dimensionPixelSize4, playerActivity.getResources().getDimensionPixelSize(R.dimen.dp_12));
                    it5.setLayoutParams(layoutParams6);
                    return nVar;
                }
                throw new NullPointerException("null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
            case 5:
                View it6 = (View) obj;
                int i15 = PlayerActivity.f13798w0;
                kotlin.jvm.internal.h.e(it6, "it");
                ViewGroup.LayoutParams layoutParams7 = it6.getLayoutParams();
                if (layoutParams7 != null) {
                    FrameLayout.LayoutParams layoutParams8 = (FrameLayout.LayoutParams) layoutParams7;
                    int dimensionPixelSize5 = playerActivity.getResources().getDimensionPixelSize(R.dimen.dp_88);
                    layoutParams8.setMargins(dimensionPixelSize5, 0, dimensionPixelSize5, playerActivity.getResources().getDimensionPixelSize(R.dimen.dp_86));
                    it6.setLayoutParams(layoutParams8);
                    return nVar;
                }
                throw new NullPointerException("null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
            case 6:
                I2.a episode = (I2.a) obj;
                int i16 = PlayerActivity.f13798w0;
                kotlin.jvm.internal.h.e(episode, "episode");
                Y1.p(playerActivity);
                playerActivity.V(false);
                ((D.n) playerActivity.Z()).f(false);
                a0 d02 = playerActivity.d0();
                long T8 = playerActivity.Z().T();
                d02.getClass();
                d02.d(true, new C1221X(episode.f3444a, T8, null, d02));
                return nVar;
            case 7:
                I2.a episode2 = (I2.a) obj;
                int i17 = PlayerActivity.f13798w0;
                kotlin.jvm.internal.h.e(episode2, "episode");
                playerActivity.e0(true);
                playerActivity.V(false);
                ((D.n) playerActivity.Z()).f(false);
                a0 d03 = playerActivity.d0();
                long T9 = playerActivity.Z().T();
                d03.getClass();
                d03.d(true, new C1221X(episode2.f3444a, T9, null, d03));
                return nVar;
            case 8:
                I2.b it7 = (I2.b) obj;
                int i18 = PlayerActivity.f13798w0;
                kotlin.jvm.internal.h.e(it7, "it");
                playerActivity.e0(true);
                if (!playerActivity.d0().g(playerActivity.Z().T(), it7.f3456a.hashCode())) {
                    playerActivity.f0(new M1.D(R.string.msg_server_error));
                }
                return nVar;
            default:
                int i19 = PlayerActivity.f13798w0;
                kotlin.jvm.internal.h.e((Exception) obj, "it");
                playerActivity.f0(new M1.D(R.string.msg_unknown_error));
                return nVar;
        }
    }
}
