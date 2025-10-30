package co.notix.banner;

import androidx.annotation.Keep;

@Keep
/* loaded from: classes.dex */
public interface NotixBannerListener {
    void onAdFailedToLoad(String str);

    void onAdLoaded();
}
