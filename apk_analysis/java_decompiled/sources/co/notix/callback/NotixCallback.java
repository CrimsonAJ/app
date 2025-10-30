package co.notix.callback;

import androidx.annotation.Keep;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.h;

@Keep
/* loaded from: classes.dex */
public abstract class NotixCallback {

    @Keep
    /* loaded from: classes.dex */
    public static final class AdDismissed extends NotixCallback {
        private final String data;
        private final NotixCallbackStatus status;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AdDismissed(NotixCallbackStatus status, String str) {
            super(null);
            h.e(status, "status");
            this.status = status;
            this.data = str;
        }

        public static /* synthetic */ AdDismissed copy$default(AdDismissed adDismissed, NotixCallbackStatus notixCallbackStatus, String str, int i9, Object obj) {
            if ((i9 & 1) != 0) {
                notixCallbackStatus = adDismissed.getStatus();
            }
            if ((i9 & 2) != 0) {
                str = adDismissed.getData();
            }
            return adDismissed.copy(notixCallbackStatus, str);
        }

        public final NotixCallbackStatus component1() {
            return getStatus();
        }

        public final String component2() {
            return getData();
        }

        public final AdDismissed copy(NotixCallbackStatus status, String str) {
            h.e(status, "status");
            return new AdDismissed(status, str);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof AdDismissed)) {
                return false;
            }
            AdDismissed adDismissed = (AdDismissed) obj;
            return getStatus() == adDismissed.getStatus() && h.a(getData(), adDismissed.getData());
        }

        @Override // co.notix.callback.NotixCallback
        public String getData() {
            return this.data;
        }

        @Override // co.notix.callback.NotixCallback
        public NotixCallbackStatus getStatus() {
            return this.status;
        }

        public int hashCode() {
            return (getStatus().hashCode() * 31) + (getData() == null ? 0 : getData().hashCode());
        }

        public String toString() {
            return "AdDismissed(status=" + getStatus() + ", data=" + getData() + ')';
        }
    }

    @Keep
    /* loaded from: classes.dex */
    public static final class AppInstall extends NotixCallback {
        private final String data;
        private final NotixCallbackStatus status;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AppInstall(NotixCallbackStatus status, String str) {
            super(null);
            h.e(status, "status");
            this.status = status;
            this.data = str;
        }

        public static /* synthetic */ AppInstall copy$default(AppInstall appInstall, NotixCallbackStatus notixCallbackStatus, String str, int i9, Object obj) {
            if ((i9 & 1) != 0) {
                notixCallbackStatus = appInstall.getStatus();
            }
            if ((i9 & 2) != 0) {
                str = appInstall.getData();
            }
            return appInstall.copy(notixCallbackStatus, str);
        }

        public final NotixCallbackStatus component1() {
            return getStatus();
        }

        public final String component2() {
            return getData();
        }

        public final AppInstall copy(NotixCallbackStatus status, String str) {
            h.e(status, "status");
            return new AppInstall(status, str);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof AppInstall)) {
                return false;
            }
            AppInstall appInstall = (AppInstall) obj;
            return getStatus() == appInstall.getStatus() && h.a(getData(), appInstall.getData());
        }

        @Override // co.notix.callback.NotixCallback
        public String getData() {
            return this.data;
        }

        @Override // co.notix.callback.NotixCallback
        public NotixCallbackStatus getStatus() {
            return this.status;
        }

        public int hashCode() {
            return (getStatus().hashCode() * 31) + (getData() == null ? 0 : getData().hashCode());
        }

        public String toString() {
            return "AppInstall(status=" + getStatus() + ", data=" + getData() + ')';
        }
    }

    @Keep
    /* loaded from: classes.dex */
    public static final class Click extends NotixCallback {
        private final String data;
        private final NotixCallbackStatus status;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Click(NotixCallbackStatus status, String str) {
            super(null);
            h.e(status, "status");
            this.status = status;
            this.data = str;
        }

        public static /* synthetic */ Click copy$default(Click click, NotixCallbackStatus notixCallbackStatus, String str, int i9, Object obj) {
            if ((i9 & 1) != 0) {
                notixCallbackStatus = click.getStatus();
            }
            if ((i9 & 2) != 0) {
                str = click.getData();
            }
            return click.copy(notixCallbackStatus, str);
        }

        public final NotixCallbackStatus component1() {
            return getStatus();
        }

        public final String component2() {
            return getData();
        }

        public final Click copy(NotixCallbackStatus status, String str) {
            h.e(status, "status");
            return new Click(status, str);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Click)) {
                return false;
            }
            Click click = (Click) obj;
            return getStatus() == click.getStatus() && h.a(getData(), click.getData());
        }

        @Override // co.notix.callback.NotixCallback
        public String getData() {
            return this.data;
        }

        @Override // co.notix.callback.NotixCallback
        public NotixCallbackStatus getStatus() {
            return this.status;
        }

        public int hashCode() {
            return (getStatus().hashCode() * 31) + (getData() == null ? 0 : getData().hashCode());
        }

        public String toString() {
            return "Click(status=" + getStatus() + ", data=" + getData() + ')';
        }
    }

    @Keep
    /* loaded from: classes.dex */
    public static final class FcmTokenReceived extends NotixCallback {
        private final String data;
        private final NotixCallbackStatus status;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public FcmTokenReceived(NotixCallbackStatus status, String str) {
            super(null);
            h.e(status, "status");
            this.status = status;
            this.data = str;
        }

        public static /* synthetic */ FcmTokenReceived copy$default(FcmTokenReceived fcmTokenReceived, NotixCallbackStatus notixCallbackStatus, String str, int i9, Object obj) {
            if ((i9 & 1) != 0) {
                notixCallbackStatus = fcmTokenReceived.getStatus();
            }
            if ((i9 & 2) != 0) {
                str = fcmTokenReceived.getData();
            }
            return fcmTokenReceived.copy(notixCallbackStatus, str);
        }

        public final NotixCallbackStatus component1() {
            return getStatus();
        }

        public final String component2() {
            return getData();
        }

        public final FcmTokenReceived copy(NotixCallbackStatus status, String str) {
            h.e(status, "status");
            return new FcmTokenReceived(status, str);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof FcmTokenReceived)) {
                return false;
            }
            FcmTokenReceived fcmTokenReceived = (FcmTokenReceived) obj;
            return getStatus() == fcmTokenReceived.getStatus() && h.a(getData(), fcmTokenReceived.getData());
        }

        @Override // co.notix.callback.NotixCallback
        public String getData() {
            return this.data;
        }

        @Override // co.notix.callback.NotixCallback
        public NotixCallbackStatus getStatus() {
            return this.status;
        }

        public int hashCode() {
            return (getStatus().hashCode() * 31) + (getData() == null ? 0 : getData().hashCode());
        }

        public String toString() {
            return "FcmTokenReceived(status=" + getStatus() + ", data=" + getData() + ')';
        }
    }

    @Keep
    /* loaded from: classes.dex */
    public static final class GeneralMetrics extends NotixCallback {
        private final String data;
        private final NotixCallbackStatus status;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public GeneralMetrics(NotixCallbackStatus status, String str) {
            super(null);
            h.e(status, "status");
            this.status = status;
            this.data = str;
        }

        public static /* synthetic */ GeneralMetrics copy$default(GeneralMetrics generalMetrics, NotixCallbackStatus notixCallbackStatus, String str, int i9, Object obj) {
            if ((i9 & 1) != 0) {
                notixCallbackStatus = generalMetrics.getStatus();
            }
            if ((i9 & 2) != 0) {
                str = generalMetrics.getData();
            }
            return generalMetrics.copy(notixCallbackStatus, str);
        }

        public final NotixCallbackStatus component1() {
            return getStatus();
        }

        public final String component2() {
            return getData();
        }

        public final GeneralMetrics copy(NotixCallbackStatus status, String str) {
            h.e(status, "status");
            return new GeneralMetrics(status, str);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof GeneralMetrics)) {
                return false;
            }
            GeneralMetrics generalMetrics = (GeneralMetrics) obj;
            return getStatus() == generalMetrics.getStatus() && h.a(getData(), generalMetrics.getData());
        }

        @Override // co.notix.callback.NotixCallback
        public String getData() {
            return this.data;
        }

        @Override // co.notix.callback.NotixCallback
        public NotixCallbackStatus getStatus() {
            return this.status;
        }

        public int hashCode() {
            return (getStatus().hashCode() * 31) + (getData() == null ? 0 : getData().hashCode());
        }

        public String toString() {
            return "GeneralMetrics(status=" + getStatus() + ", data=" + getData() + ')';
        }
    }

    @Keep
    /* loaded from: classes.dex */
    public static final class Impression extends NotixCallback {
        private final String data;
        private final NotixCallbackStatus status;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Impression(NotixCallbackStatus status, String str) {
            super(null);
            h.e(status, "status");
            this.status = status;
            this.data = str;
        }

        public static /* synthetic */ Impression copy$default(Impression impression, NotixCallbackStatus notixCallbackStatus, String str, int i9, Object obj) {
            if ((i9 & 1) != 0) {
                notixCallbackStatus = impression.getStatus();
            }
            if ((i9 & 2) != 0) {
                str = impression.getData();
            }
            return impression.copy(notixCallbackStatus, str);
        }

        public final NotixCallbackStatus component1() {
            return getStatus();
        }

        public final String component2() {
            return getData();
        }

        public final Impression copy(NotixCallbackStatus status, String str) {
            h.e(status, "status");
            return new Impression(status, str);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Impression)) {
                return false;
            }
            Impression impression = (Impression) obj;
            return getStatus() == impression.getStatus() && h.a(getData(), impression.getData());
        }

        @Override // co.notix.callback.NotixCallback
        public String getData() {
            return this.data;
        }

        @Override // co.notix.callback.NotixCallback
        public NotixCallbackStatus getStatus() {
            return this.status;
        }

        public int hashCode() {
            return (getStatus().hashCode() * 31) + (getData() == null ? 0 : getData().hashCode());
        }

        public String toString() {
            return "Impression(status=" + getStatus() + ", data=" + getData() + ')';
        }
    }

    @Keep
    /* loaded from: classes.dex */
    public static final class ManageAudience extends NotixCallback {
        private final String data;
        private final NotixCallbackStatus status;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ManageAudience(NotixCallbackStatus status, String str) {
            super(null);
            h.e(status, "status");
            this.status = status;
            this.data = str;
        }

        public static /* synthetic */ ManageAudience copy$default(ManageAudience manageAudience, NotixCallbackStatus notixCallbackStatus, String str, int i9, Object obj) {
            if ((i9 & 1) != 0) {
                notixCallbackStatus = manageAudience.getStatus();
            }
            if ((i9 & 2) != 0) {
                str = manageAudience.getData();
            }
            return manageAudience.copy(notixCallbackStatus, str);
        }

        public final NotixCallbackStatus component1() {
            return getStatus();
        }

        public final String component2() {
            return getData();
        }

        public final ManageAudience copy(NotixCallbackStatus status, String str) {
            h.e(status, "status");
            return new ManageAudience(status, str);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ManageAudience)) {
                return false;
            }
            ManageAudience manageAudience = (ManageAudience) obj;
            return getStatus() == manageAudience.getStatus() && h.a(getData(), manageAudience.getData());
        }

        @Override // co.notix.callback.NotixCallback
        public String getData() {
            return this.data;
        }

        @Override // co.notix.callback.NotixCallback
        public NotixCallbackStatus getStatus() {
            return this.status;
        }

        public int hashCode() {
            return (getStatus().hashCode() * 31) + (getData() == null ? 0 : getData().hashCode());
        }

        public String toString() {
            return "ManageAudience(status=" + getStatus() + ", data=" + getData() + ')';
        }
    }

    @Keep
    /* loaded from: classes.dex */
    public static final class PushDataLoad extends NotixCallback {
        private final String data;
        private final NotixCallbackStatus status;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public PushDataLoad(NotixCallbackStatus status, String str) {
            super(null);
            h.e(status, "status");
            this.status = status;
            this.data = str;
        }

        public static /* synthetic */ PushDataLoad copy$default(PushDataLoad pushDataLoad, NotixCallbackStatus notixCallbackStatus, String str, int i9, Object obj) {
            if ((i9 & 1) != 0) {
                notixCallbackStatus = pushDataLoad.getStatus();
            }
            if ((i9 & 2) != 0) {
                str = pushDataLoad.getData();
            }
            return pushDataLoad.copy(notixCallbackStatus, str);
        }

        public final NotixCallbackStatus component1() {
            return getStatus();
        }

        public final String component2() {
            return getData();
        }

        public final PushDataLoad copy(NotixCallbackStatus status, String str) {
            h.e(status, "status");
            return new PushDataLoad(status, str);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof PushDataLoad)) {
                return false;
            }
            PushDataLoad pushDataLoad = (PushDataLoad) obj;
            return getStatus() == pushDataLoad.getStatus() && h.a(getData(), pushDataLoad.getData());
        }

        @Override // co.notix.callback.NotixCallback
        public String getData() {
            return this.data;
        }

        @Override // co.notix.callback.NotixCallback
        public NotixCallbackStatus getStatus() {
            return this.status;
        }

        public int hashCode() {
            return (getStatus().hashCode() * 31) + (getData() == null ? 0 : getData().hashCode());
        }

        public String toString() {
            return "PushDataLoad(status=" + getStatus() + ", data=" + getData() + ')';
        }
    }

    @Keep
    /* loaded from: classes.dex */
    public static final class RefreshData extends NotixCallback {
        private final String data;
        private final NotixCallbackStatus status;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public RefreshData(NotixCallbackStatus status, String str) {
            super(null);
            h.e(status, "status");
            this.status = status;
            this.data = str;
        }

        public static /* synthetic */ RefreshData copy$default(RefreshData refreshData, NotixCallbackStatus notixCallbackStatus, String str, int i9, Object obj) {
            if ((i9 & 1) != 0) {
                notixCallbackStatus = refreshData.getStatus();
            }
            if ((i9 & 2) != 0) {
                str = refreshData.getData();
            }
            return refreshData.copy(notixCallbackStatus, str);
        }

        public final NotixCallbackStatus component1() {
            return getStatus();
        }

        public final String component2() {
            return getData();
        }

        public final RefreshData copy(NotixCallbackStatus status, String str) {
            h.e(status, "status");
            return new RefreshData(status, str);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof RefreshData)) {
                return false;
            }
            RefreshData refreshData = (RefreshData) obj;
            return getStatus() == refreshData.getStatus() && h.a(getData(), refreshData.getData());
        }

        @Override // co.notix.callback.NotixCallback
        public String getData() {
            return this.data;
        }

        @Override // co.notix.callback.NotixCallback
        public NotixCallbackStatus getStatus() {
            return this.status;
        }

        public int hashCode() {
            return (getStatus().hashCode() * 31) + (getData() == null ? 0 : getData().hashCode());
        }

        public String toString() {
            return "RefreshData(status=" + getStatus() + ", data=" + getData() + ')';
        }
    }

    @Keep
    /* loaded from: classes.dex */
    public static final class Subscription extends NotixCallback {
        private final String data;
        private final NotixCallbackStatus status;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Subscription(NotixCallbackStatus status, String str) {
            super(null);
            h.e(status, "status");
            this.status = status;
            this.data = str;
        }

        public static /* synthetic */ Subscription copy$default(Subscription subscription, NotixCallbackStatus notixCallbackStatus, String str, int i9, Object obj) {
            if ((i9 & 1) != 0) {
                notixCallbackStatus = subscription.getStatus();
            }
            if ((i9 & 2) != 0) {
                str = subscription.getData();
            }
            return subscription.copy(notixCallbackStatus, str);
        }

        public final NotixCallbackStatus component1() {
            return getStatus();
        }

        public final String component2() {
            return getData();
        }

        public final Subscription copy(NotixCallbackStatus status, String str) {
            h.e(status, "status");
            return new Subscription(status, str);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Subscription)) {
                return false;
            }
            Subscription subscription = (Subscription) obj;
            return getStatus() == subscription.getStatus() && h.a(getData(), subscription.getData());
        }

        @Override // co.notix.callback.NotixCallback
        public String getData() {
            return this.data;
        }

        @Override // co.notix.callback.NotixCallback
        public NotixCallbackStatus getStatus() {
            return this.status;
        }

        public int hashCode() {
            return (getStatus().hashCode() * 31) + (getData() == null ? 0 : getData().hashCode());
        }

        public String toString() {
            return "Subscription(status=" + getStatus() + ", data=" + getData() + ')';
        }
    }

    @Keep
    /* loaded from: classes.dex */
    public static final class Unsubscription extends NotixCallback {
        private final String data;
        private final NotixCallbackStatus status;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Unsubscription(NotixCallbackStatus status, String str) {
            super(null);
            h.e(status, "status");
            this.status = status;
            this.data = str;
        }

        public static /* synthetic */ Unsubscription copy$default(Unsubscription unsubscription, NotixCallbackStatus notixCallbackStatus, String str, int i9, Object obj) {
            if ((i9 & 1) != 0) {
                notixCallbackStatus = unsubscription.getStatus();
            }
            if ((i9 & 2) != 0) {
                str = unsubscription.getData();
            }
            return unsubscription.copy(notixCallbackStatus, str);
        }

        public final NotixCallbackStatus component1() {
            return getStatus();
        }

        public final String component2() {
            return getData();
        }

        public final Unsubscription copy(NotixCallbackStatus status, String str) {
            h.e(status, "status");
            return new Unsubscription(status, str);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Unsubscription)) {
                return false;
            }
            Unsubscription unsubscription = (Unsubscription) obj;
            return getStatus() == unsubscription.getStatus() && h.a(getData(), unsubscription.getData());
        }

        @Override // co.notix.callback.NotixCallback
        public String getData() {
            return this.data;
        }

        @Override // co.notix.callback.NotixCallback
        public NotixCallbackStatus getStatus() {
            return this.status;
        }

        public int hashCode() {
            return (getStatus().hashCode() * 31) + (getData() == null ? 0 : getData().hashCode());
        }

        public String toString() {
            return "Unsubscription(status=" + getStatus() + ", data=" + getData() + ')';
        }
    }

    private NotixCallback() {
    }

    public abstract String getData();

    public abstract NotixCallbackStatus getStatus();

    public /* synthetic */ NotixCallback(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
