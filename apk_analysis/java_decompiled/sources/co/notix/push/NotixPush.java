package co.notix.push;

import android.content.Context;
import androidx.annotation.Keep;
import co.notix.domain.RequestVars;
import co.notix.wq;
import kotlin.jvm.internal.h;

@Keep
/* loaded from: classes.dex */
public interface NotixPush {
    public static final Companion Companion = Companion.$$INSTANCE;

    @Keep
    /* loaded from: classes.dex */
    public static final class Companion implements NotixPush {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();
        private final /* synthetic */ NotixPush $$delegate_0 = wq.w();

        private Companion() {
        }

        @Override // co.notix.push.NotixPush
        @Keep
        public void addAudience(String audience) {
            h.e(audience, "audience");
            this.$$delegate_0.addAudience(audience);
        }

        @Override // co.notix.push.NotixPush
        @Keep
        public void deleteAudience(String audience) {
            h.e(audience, "audience");
            this.$$delegate_0.deleteAudience(audience);
        }

        @Override // co.notix.push.NotixPush
        @Keep
        public void init(Context context, String notixAppId, String notixToken) {
            h.e(context, "context");
            h.e(notixAppId, "notixAppId");
            h.e(notixToken, "notixToken");
            this.$$delegate_0.init(context, notixAppId, notixToken);
        }

        @Override // co.notix.push.NotixPush
        @Keep
        public void setNotificationModifier(NotixNotificationModifier modifier) {
            h.e(modifier, "modifier");
            this.$$delegate_0.setNotificationModifier(modifier);
        }

        @Override // co.notix.push.NotixPush
        @Keep
        public void setTargetEventHandler(NotixTargetEventHandler handler) {
            h.e(handler, "handler");
            this.$$delegate_0.setTargetEventHandler(handler);
        }

        @Override // co.notix.push.NotixPush
        @Keep
        public void init(Context context, String notixAppId, String notixToken, RequestVars requestVars) {
            h.e(context, "context");
            h.e(notixAppId, "notixAppId");
            h.e(notixToken, "notixToken");
            this.$$delegate_0.init(context, notixAppId, notixToken, requestVars);
        }
    }

    @Keep
    void addAudience(String str);

    @Keep
    void deleteAudience(String str);

    @Keep
    void init(Context context, String str, String str2);

    @Keep
    void init(Context context, String str, String str2, RequestVars requestVars);

    @Keep
    void setNotificationModifier(NotixNotificationModifier notixNotificationModifier);

    @Keep
    void setTargetEventHandler(NotixTargetEventHandler notixTargetEventHandler);
}
