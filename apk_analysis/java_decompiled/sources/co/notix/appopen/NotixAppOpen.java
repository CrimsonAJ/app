package co.notix.appopen;

import O7.a;
import O7.l;
import androidx.annotation.Keep;
import co.notix.domain.RequestVars;
import co.notix.wq;
import kotlin.jvm.internal.h;

@Keep
/* loaded from: classes.dex */
public interface NotixAppOpen {
    public static final Companion Companion = Companion.$$INSTANCE;

    @Keep
    /* loaded from: classes.dex */
    public static final class Companion implements NotixAppOpen {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();
        private final /* synthetic */ NotixAppOpen $$delegate_0 = wq.q();

        private Companion() {
        }

        @Override // co.notix.appopen.NotixAppOpen
        @Keep
        public AppOpenLoader createLoader(long j) {
            return this.$$delegate_0.createLoader(j);
        }

        @Override // co.notix.appopen.NotixAppOpen
        @Keep
        public void doOnApplicationOpen(l action) {
            h.e(action, "action");
            this.$$delegate_0.doOnApplicationOpen(action);
        }

        @Override // co.notix.appopen.NotixAppOpen
        @Keep
        public void ignoreNextApplicationOpen() {
            this.$$delegate_0.ignoreNextApplicationOpen();
        }

        @Override // co.notix.appopen.NotixAppOpen
        @Keep
        public void show(AppOpenData appOpenData) {
            h.e(appOpenData, "appOpenData");
            this.$$delegate_0.show(appOpenData);
        }

        @Override // co.notix.appopen.NotixAppOpen
        @Keep
        public void startAutoShow(AppOpenLoader appOpenLoader) {
            h.e(appOpenLoader, "appOpenLoader");
            this.$$delegate_0.startAutoShow(appOpenLoader);
        }

        @Override // co.notix.appopen.NotixAppOpen
        @Keep
        public void stopAutoShow() {
            this.$$delegate_0.stopAutoShow();
        }

        @Override // co.notix.appopen.NotixAppOpen
        @Keep
        public AppOpenLoader createLoader(long j, RequestVars requestVars) {
            return this.$$delegate_0.createLoader(j, requestVars);
        }

        @Override // co.notix.appopen.NotixAppOpen
        @Keep
        public void doOnApplicationOpen(l action, long j) {
            h.e(action, "action");
            this.$$delegate_0.doOnApplicationOpen(action, j);
        }

        @Override // co.notix.appopen.NotixAppOpen
        @Keep
        public void show(AppOpenData appOpenData, a aVar, a aVar2, l lVar) {
            h.e(appOpenData, "appOpenData");
            this.$$delegate_0.show(appOpenData, aVar, aVar2, lVar);
        }

        @Override // co.notix.appopen.NotixAppOpen
        @Keep
        public void startAutoShow(AppOpenLoader appOpenLoader, long j, long j4, a aVar, a aVar2, l lVar) {
            h.e(appOpenLoader, "appOpenLoader");
            this.$$delegate_0.startAutoShow(appOpenLoader, j, j4, aVar, aVar2, lVar);
        }

        @Override // co.notix.appopen.NotixAppOpen
        @Keep
        public AppOpenLoader createLoader(long j, RequestVars requestVars, Integer num) {
            return this.$$delegate_0.createLoader(j, requestVars, num);
        }

        @Override // co.notix.appopen.NotixAppOpen
        @Keep
        public AppOpenLoader createLoader(long j, Integer num) {
            return this.$$delegate_0.createLoader(j, num);
        }
    }

    /* loaded from: classes.dex */
    public static final class DefaultImpls {
        public static /* synthetic */ void show$default(NotixAppOpen notixAppOpen, AppOpenData appOpenData, a aVar, a aVar2, l lVar, int i9, Object obj) {
            if (obj == null) {
                if ((i9 & 2) != 0) {
                    aVar = null;
                }
                if ((i9 & 4) != 0) {
                    aVar2 = null;
                }
                if ((i9 & 8) != 0) {
                    lVar = null;
                }
                notixAppOpen.show(appOpenData, aVar, aVar2, lVar);
                return;
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: show");
        }

        public static /* synthetic */ void startAutoShow$default(NotixAppOpen notixAppOpen, AppOpenLoader appOpenLoader, long j, long j4, a aVar, a aVar2, l lVar, int i9, Object obj) {
            if (obj == null) {
                if ((i9 & 8) != 0) {
                    aVar = null;
                }
                if ((i9 & 16) != 0) {
                    aVar2 = null;
                }
                if ((i9 & 32) != 0) {
                    lVar = null;
                }
                notixAppOpen.startAutoShow(appOpenLoader, j, j4, aVar, aVar2, lVar);
                return;
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: startAutoShow");
        }
    }

    @Keep
    AppOpenLoader createLoader(long j);

    @Keep
    AppOpenLoader createLoader(long j, RequestVars requestVars);

    @Keep
    AppOpenLoader createLoader(long j, RequestVars requestVars, Integer num);

    @Keep
    AppOpenLoader createLoader(long j, Integer num);

    @Keep
    void doOnApplicationOpen(l lVar);

    @Keep
    void doOnApplicationOpen(l lVar, long j);

    @Keep
    void ignoreNextApplicationOpen();

    @Keep
    void show(AppOpenData appOpenData);

    @Keep
    void show(AppOpenData appOpenData, a aVar, a aVar2, l lVar);

    @Keep
    void startAutoShow(AppOpenLoader appOpenLoader);

    @Keep
    void startAutoShow(AppOpenLoader appOpenLoader, long j, long j4, a aVar, a aVar2, l lVar);

    @Keep
    void stopAutoShow();
}
