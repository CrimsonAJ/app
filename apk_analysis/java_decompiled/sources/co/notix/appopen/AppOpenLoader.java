package co.notix.appopen;

import E7.d;
import O7.l;
import androidx.annotation.Keep;

/* loaded from: classes.dex */
public interface AppOpenLoader {

    /* loaded from: classes.dex */
    public static final class DefaultImpls {
        public static /* synthetic */ Object awaitNext$default(AppOpenLoader appOpenLoader, long j, d dVar, int i9, Object obj) {
            if (obj == null) {
                if ((i9 & 1) != 0) {
                    j = 5000;
                }
                return appOpenLoader.awaitNext(j, dVar);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: awaitNext");
        }
    }

    @Keep
    Object awaitNext(long j, d<? super AppOpenData> dVar);

    @Keep
    void doOnNextAvailable(l lVar);

    @Keep
    void doOnNextAvailable(l lVar, long j);

    @Keep
    AppOpenData getNext();

    @Keep
    boolean hasNext();

    @Keep
    void startLoading();

    @Keep
    void stopLoading();
}
