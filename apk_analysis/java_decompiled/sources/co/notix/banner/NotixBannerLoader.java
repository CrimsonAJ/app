package co.notix.banner;

import E7.d;
import O7.l;
import androidx.annotation.Keep;

/* loaded from: classes.dex */
public interface NotixBannerLoader {
    @Keep
    Object awaitNext(long j, d<? super BannerData> dVar);

    @Keep
    void doOnNextAvailable(l lVar);

    @Keep
    void doOnNextAvailable(l lVar, long j);

    @Keep
    BannerData getNext();

    @Keep
    boolean hasNext();

    @Keep
    void startLoading();

    @Keep
    void stopLoading();
}
