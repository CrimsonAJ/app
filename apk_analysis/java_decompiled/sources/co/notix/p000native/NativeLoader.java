package co.notix.p000native;

import E7.d;
import O7.l;
import androidx.annotation.Keep;

/* loaded from: classes.dex */
public interface NativeLoader {

    /* loaded from: classes.dex */
    public static final class DefaultImpls {
        public static /* synthetic */ Object awaitNext$default(NativeLoader nativeLoader, long j, d dVar, int i9, Object obj) {
            if (obj == null) {
                if ((i9 & 1) != 0) {
                    j = 5000;
                }
                return nativeLoader.awaitNext(j, dVar);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: awaitNext");
        }
    }

    @Keep
    Object awaitNext(long j, d<? super NativeData> dVar);

    @Keep
    void doOnNextAvailable(l lVar);

    @Keep
    void doOnNextAvailable(l lVar, long j);

    @Keep
    NativeData getNext();

    @Keep
    boolean hasNext();

    @Keep
    void startLoading();

    @Keep
    void stopLoading();
}
