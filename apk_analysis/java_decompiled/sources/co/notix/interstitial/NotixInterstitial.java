package co.notix.interstitial;

import O7.a;
import O7.l;
import androidx.annotation.Keep;
import co.notix.domain.RequestVars;
import co.notix.wq;
import kotlin.jvm.internal.h;

@Keep
/* loaded from: classes.dex */
public interface NotixInterstitial {
    public static final Companion Companion = Companion.$$INSTANCE;

    @Keep
    /* loaded from: classes.dex */
    public static final class Companion implements NotixInterstitial {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();
        private final /* synthetic */ NotixInterstitial $$delegate_0 = wq.t();

        private Companion() {
        }

        @Override // co.notix.interstitial.NotixInterstitial
        @Keep
        public InterstitialLoader createLoader(long j) {
            return this.$$delegate_0.createLoader(j);
        }

        @Override // co.notix.interstitial.NotixInterstitial
        @Keep
        public void show(InterstitialData interstitialData) {
            h.e(interstitialData, "interstitialData");
            this.$$delegate_0.show(interstitialData);
        }

        @Override // co.notix.interstitial.NotixInterstitial
        @Keep
        public InterstitialLoader createLoader(long j, RequestVars requestVars) {
            return this.$$delegate_0.createLoader(j, requestVars);
        }

        @Override // co.notix.interstitial.NotixInterstitial
        @Keep
        public void show(InterstitialData interstitialData, InterstitialButton interstitialButton) {
            h.e(interstitialData, "interstitialData");
            this.$$delegate_0.show(interstitialData, interstitialButton);
        }

        @Override // co.notix.interstitial.NotixInterstitial
        @Keep
        public InterstitialLoader createLoader(long j, RequestVars requestVars, Integer num) {
            return this.$$delegate_0.createLoader(j, requestVars, num);
        }

        @Override // co.notix.interstitial.NotixInterstitial
        @Keep
        public void show(InterstitialData interstitialData, InterstitialButton interstitialButton, boolean z9, a aVar, a aVar2, l lVar) {
            h.e(interstitialData, "interstitialData");
            this.$$delegate_0.show(interstitialData, interstitialButton, z9, aVar, aVar2, lVar);
        }

        @Override // co.notix.interstitial.NotixInterstitial
        @Keep
        public InterstitialLoader createLoader(long j, Integer num) {
            return this.$$delegate_0.createLoader(j, num);
        }

        @Override // co.notix.interstitial.NotixInterstitial
        @Keep
        public void show(InterstitialData interstitialData, a aVar, a aVar2, l lVar) {
            h.e(interstitialData, "interstitialData");
            this.$$delegate_0.show(interstitialData, aVar, aVar2, lVar);
        }
    }

    /* loaded from: classes.dex */
    public static final class DefaultImpls {
        public static /* synthetic */ void show$default(NotixInterstitial notixInterstitial, InterstitialData interstitialData, InterstitialButton interstitialButton, boolean z9, a aVar, a aVar2, l lVar, int i9, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: show");
            }
            if ((i9 & 4) != 0) {
                z9 = false;
            }
            notixInterstitial.show(interstitialData, interstitialButton, z9, (i9 & 8) != 0 ? null : aVar, (i9 & 16) != 0 ? null : aVar2, (i9 & 32) != 0 ? null : lVar);
        }

        public static /* synthetic */ void show$default(NotixInterstitial notixInterstitial, InterstitialData interstitialData, a aVar, a aVar2, l lVar, int i9, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: show");
            }
            if ((i9 & 2) != 0) {
                aVar = null;
            }
            if ((i9 & 4) != 0) {
                aVar2 = null;
            }
            if ((i9 & 8) != 0) {
                lVar = null;
            }
            notixInterstitial.show(interstitialData, aVar, aVar2, lVar);
        }
    }

    @Keep
    InterstitialLoader createLoader(long j);

    @Keep
    InterstitialLoader createLoader(long j, RequestVars requestVars);

    @Keep
    InterstitialLoader createLoader(long j, RequestVars requestVars, Integer num);

    @Keep
    InterstitialLoader createLoader(long j, Integer num);

    @Keep
    void show(InterstitialData interstitialData);

    @Keep
    void show(InterstitialData interstitialData, a aVar, a aVar2, l lVar);

    @Keep
    void show(InterstitialData interstitialData, InterstitialButton interstitialButton);

    @Keep
    void show(InterstitialData interstitialData, InterstitialButton interstitialButton, boolean z9, a aVar, a aVar2, l lVar);
}
