package co.notix.interstitial;

import E7.d;
import O7.l;
import androidx.annotation.Keep;

/* loaded from: classes.dex */
public interface InterstitialLoader {

    /* loaded from: classes.dex */
    public static final class DefaultImpls {
        public static /* synthetic */ Object awaitNext$default(InterstitialLoader interstitialLoader, long j, d dVar, int i9, Object obj) {
            if (obj == null) {
                if ((i9 & 1) != 0) {
                    j = 5000;
                }
                return interstitialLoader.awaitNext(j, dVar);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: awaitNext");
        }
    }

    @Keep
    Object awaitNext(long j, d<? super InterstitialData> dVar);

    @Keep
    void doOnNextAvailable(l lVar);

    @Keep
    void doOnNextAvailable(l lVar, long j);

    @Keep
    InterstitialData getNext();

    @Keep
    boolean hasNext();

    @Keep
    void startLoading();

    @Keep
    void stopLoading();
}
