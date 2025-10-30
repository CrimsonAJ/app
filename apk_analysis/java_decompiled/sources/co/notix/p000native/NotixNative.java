package co.notix.p000native;

import androidx.annotation.Keep;
import co.notix.domain.RequestVars;
import co.notix.wq;
import kotlin.jvm.internal.h;

@Keep
/* loaded from: classes.dex */
public interface NotixNative {
    public static final Companion Companion = Companion.$$INSTANCE;

    @Keep
    /* loaded from: classes.dex */
    public static final class Companion implements NotixNative {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();
        private final /* synthetic */ NotixNative $$delegate_0 = wq.v();

        private Companion() {
        }

        @Override // co.notix.p000native.NotixNative
        @Keep
        public void click(NativeData nativeData) {
            h.e(nativeData, "nativeData");
            this.$$delegate_0.click(nativeData);
        }

        @Override // co.notix.p000native.NotixNative
        @Keep
        public NativeLoader createLoader(long j) {
            return this.$$delegate_0.createLoader(j);
        }

        @Override // co.notix.p000native.NotixNative
        @Keep
        public void trackImpression(NativeData nativeData) {
            h.e(nativeData, "nativeData");
            this.$$delegate_0.trackImpression(nativeData);
        }

        @Override // co.notix.p000native.NotixNative
        @Keep
        public NativeLoader createLoader(long j, RequestVars requestVars) {
            return this.$$delegate_0.createLoader(j, requestVars);
        }

        @Override // co.notix.p000native.NotixNative
        @Keep
        public NativeLoader createLoader(long j, RequestVars requestVars, Integer num) {
            return this.$$delegate_0.createLoader(j, requestVars, num);
        }

        @Override // co.notix.p000native.NotixNative
        @Keep
        public NativeLoader createLoader(long j, Integer num) {
            return this.$$delegate_0.createLoader(j, num);
        }
    }

    @Keep
    void click(NativeData nativeData);

    @Keep
    NativeLoader createLoader(long j);

    @Keep
    NativeLoader createLoader(long j, RequestVars requestVars);

    @Keep
    NativeLoader createLoader(long j, RequestVars requestVars, Integer num);

    @Keep
    NativeLoader createLoader(long j, Integer num);

    @Keep
    void trackImpression(NativeData nativeData);
}
