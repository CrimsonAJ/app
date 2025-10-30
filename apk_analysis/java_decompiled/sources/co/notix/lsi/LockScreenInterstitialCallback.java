package co.notix.lsi;

import androidx.annotation.Keep;

@Keep
/* loaded from: classes.dex */
public interface LockScreenInterstitialCallback {
    @Keep
    void onAdClicked();

    @Keep
    void onAdDismissed();

    @Keep
    void onAdImpression();
}
