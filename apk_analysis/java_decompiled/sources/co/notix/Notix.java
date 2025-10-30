package co.notix;

import androidx.annotation.Keep;
import co.notix.callback.NotixCallbackHandler;
import co.notix.log.LogLevel;

@Keep
/* loaded from: classes.dex */
public interface Notix {
    public static final Companion Companion = Companion.$$INSTANCE;

    @Keep
    /* loaded from: classes.dex */
    public static final class Companion implements Notix {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();
        private final /* synthetic */ Notix $$delegate_0 = wq.p();

        private Companion() {
        }

        @Override // co.notix.Notix
        @Keep
        public String getVersion() {
            return this.$$delegate_0.getVersion();
        }

        @Override // co.notix.Notix
        @Keep
        public void setCallbackHandler(NotixCallbackHandler handler) {
            kotlin.jvm.internal.h.e(handler, "handler");
            this.$$delegate_0.setCallbackHandler(handler);
        }

        @Override // co.notix.Notix
        @Keep
        public void setLogLevel(LogLevel logLevel) {
            kotlin.jvm.internal.h.e(logLevel, "logLevel");
            this.$$delegate_0.setLogLevel(logLevel);
        }

        @Override // co.notix.Notix
        @Keep
        public void setUserAgent(String userAgent) {
            kotlin.jvm.internal.h.e(userAgent, "userAgent");
            this.$$delegate_0.setUserAgent(userAgent);
        }
    }

    @Keep
    String getVersion();

    @Keep
    void setCallbackHandler(NotixCallbackHandler notixCallbackHandler);

    @Keep
    void setLogLevel(LogLevel logLevel);

    @Keep
    void setUserAgent(String str);
}
