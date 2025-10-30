package co.notix.lsi;

import androidx.annotation.Keep;
import co.notix.lsi.LsiInterval;
import co.notix.utils.ExperimentalNotixApi;
import co.notix.wg;
import co.notix.wq;
import kotlin.jvm.internal.h;

@Keep
/* loaded from: classes.dex */
public interface NotixLockScreenInterstitialAd {
    public static final Companion Companion = Companion.$$INSTANCE;

    @Keep
    /* loaded from: classes.dex */
    public static final class Companion implements NotixLockScreenInterstitialAd {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();
        private final /* synthetic */ wg $$delegate_0 = wq.u();

        private Companion() {
        }

        @Override // co.notix.lsi.NotixLockScreenInterstitialAd
        @Keep
        @ExperimentalNotixApi
        public void cancel() {
            this.$$delegate_0.cancel();
        }

        @Override // co.notix.lsi.NotixLockScreenInterstitialAd
        @Keep
        @ExperimentalNotixApi
        public void schedule(long j) {
            wg wgVar = this.$$delegate_0;
            wgVar.getClass();
            wgVar.schedule(j, LsiInterval.Optimized.INSTANCE);
        }

        @Override // co.notix.lsi.NotixLockScreenInterstitialAd
        @Keep
        @ExperimentalNotixApi
        public void setCallbacks(LockScreenInterstitialCallback callback) {
            h.e(callback, "callback");
            this.$$delegate_0.setCallbacks(callback);
        }

        @Override // co.notix.lsi.NotixLockScreenInterstitialAd
        @Keep
        @ExperimentalNotixApi
        public void schedule(long j, LsiInterval interval) {
            h.e(interval, "interval");
            this.$$delegate_0.schedule(j, interval);
        }
    }

    @Keep
    @ExperimentalNotixApi
    void cancel();

    @Keep
    @ExperimentalNotixApi
    void schedule(long j);

    @Keep
    @ExperimentalNotixApi
    void schedule(long j, LsiInterval lsiInterval);

    @Keep
    @ExperimentalNotixApi
    void setCallbacks(LockScreenInterstitialCallback lockScreenInterstitialCallback);
}
