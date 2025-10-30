package co.notix.push.data;

import androidx.annotation.Keep;
import kotlin.jvm.internal.h;

@Keep
/* loaded from: classes.dex */
public final class NotificationOverrides {
    private final Integer color;
    private final String event;
    private final String iconUrl;
    private final String imageUrl;
    private final Integer importance;
    private final Integer priority;
    private final Boolean randomGroupId;
    private final Boolean showBadgeIcon;
    private final Boolean showOnlyLastNotification;
    private final Boolean showToast;
    private final String text;
    private final String title;

    public NotificationOverrides(Integer num, String str, String str2, String str3, Integer num2, Boolean bool, Boolean bool2, Boolean bool3, String str4, String str5, Integer num3, Boolean bool4) {
        this.color = num;
        this.event = str;
        this.iconUrl = str2;
        this.imageUrl = str3;
        this.priority = num2;
        this.showBadgeIcon = bool;
        this.showOnlyLastNotification = bool2;
        this.showToast = bool3;
        this.title = str4;
        this.text = str5;
        this.importance = num3;
        this.randomGroupId = bool4;
    }

    public static /* synthetic */ NotificationOverrides copy$default(NotificationOverrides notificationOverrides, Integer num, String str, String str2, String str3, Integer num2, Boolean bool, Boolean bool2, Boolean bool3, String str4, String str5, Integer num3, Boolean bool4, int i9, Object obj) {
        if ((i9 & 1) != 0) {
            num = notificationOverrides.color;
        }
        if ((i9 & 2) != 0) {
            str = notificationOverrides.event;
        }
        if ((i9 & 4) != 0) {
            str2 = notificationOverrides.iconUrl;
        }
        if ((i9 & 8) != 0) {
            str3 = notificationOverrides.imageUrl;
        }
        if ((i9 & 16) != 0) {
            num2 = notificationOverrides.priority;
        }
        if ((i9 & 32) != 0) {
            bool = notificationOverrides.showBadgeIcon;
        }
        if ((i9 & 64) != 0) {
            bool2 = notificationOverrides.showOnlyLastNotification;
        }
        if ((i9 & 128) != 0) {
            bool3 = notificationOverrides.showToast;
        }
        if ((i9 & 256) != 0) {
            str4 = notificationOverrides.title;
        }
        if ((i9 & 512) != 0) {
            str5 = notificationOverrides.text;
        }
        if ((i9 & 1024) != 0) {
            num3 = notificationOverrides.importance;
        }
        if ((i9 & 2048) != 0) {
            bool4 = notificationOverrides.randomGroupId;
        }
        Integer num4 = num3;
        Boolean bool5 = bool4;
        String str6 = str4;
        String str7 = str5;
        Boolean bool6 = bool2;
        Boolean bool7 = bool3;
        Integer num5 = num2;
        Boolean bool8 = bool;
        return notificationOverrides.copy(num, str, str2, str3, num5, bool8, bool6, bool7, str6, str7, num4, bool5);
    }

    public final Integer component1() {
        return this.color;
    }

    public final String component10() {
        return this.text;
    }

    public final Integer component11() {
        return this.importance;
    }

    public final Boolean component12() {
        return this.randomGroupId;
    }

    public final String component2() {
        return this.event;
    }

    public final String component3() {
        return this.iconUrl;
    }

    public final String component4() {
        return this.imageUrl;
    }

    public final Integer component5() {
        return this.priority;
    }

    public final Boolean component6() {
        return this.showBadgeIcon;
    }

    public final Boolean component7() {
        return this.showOnlyLastNotification;
    }

    public final Boolean component8() {
        return this.showToast;
    }

    public final String component9() {
        return this.title;
    }

    public final NotificationOverrides copy(Integer num, String str, String str2, String str3, Integer num2, Boolean bool, Boolean bool2, Boolean bool3, String str4, String str5, Integer num3, Boolean bool4) {
        return new NotificationOverrides(num, str, str2, str3, num2, bool, bool2, bool3, str4, str5, num3, bool4);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NotificationOverrides)) {
            return false;
        }
        NotificationOverrides notificationOverrides = (NotificationOverrides) obj;
        return h.a(this.color, notificationOverrides.color) && h.a(this.event, notificationOverrides.event) && h.a(this.iconUrl, notificationOverrides.iconUrl) && h.a(this.imageUrl, notificationOverrides.imageUrl) && h.a(this.priority, notificationOverrides.priority) && h.a(this.showBadgeIcon, notificationOverrides.showBadgeIcon) && h.a(this.showOnlyLastNotification, notificationOverrides.showOnlyLastNotification) && h.a(this.showToast, notificationOverrides.showToast) && h.a(this.title, notificationOverrides.title) && h.a(this.text, notificationOverrides.text) && h.a(this.importance, notificationOverrides.importance) && h.a(this.randomGroupId, notificationOverrides.randomGroupId);
    }

    public final Integer getColor() {
        return this.color;
    }

    public final String getEvent() {
        return this.event;
    }

    public final String getIconUrl() {
        return this.iconUrl;
    }

    public final String getImageUrl() {
        return this.imageUrl;
    }

    public final Integer getImportance() {
        return this.importance;
    }

    public final Integer getPriority() {
        return this.priority;
    }

    public final Boolean getRandomGroupId() {
        return this.randomGroupId;
    }

    public final Boolean getShowBadgeIcon() {
        return this.showBadgeIcon;
    }

    public final Boolean getShowOnlyLastNotification() {
        return this.showOnlyLastNotification;
    }

    public final Boolean getShowToast() {
        return this.showToast;
    }

    public final String getText() {
        return this.text;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        Integer num = this.color;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.event;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.iconUrl;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.imageUrl;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Integer num2 = this.priority;
        int hashCode5 = (hashCode4 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Boolean bool = this.showBadgeIcon;
        int hashCode6 = (hashCode5 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.showOnlyLastNotification;
        int hashCode7 = (hashCode6 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.showToast;
        int hashCode8 = (hashCode7 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        String str4 = this.title;
        int hashCode9 = (hashCode8 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.text;
        int hashCode10 = (hashCode9 + (str5 == null ? 0 : str5.hashCode())) * 31;
        Integer num3 = this.importance;
        int hashCode11 = (hashCode10 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Boolean bool4 = this.randomGroupId;
        return hashCode11 + (bool4 != null ? bool4.hashCode() : 0);
    }

    public String toString() {
        return "NotificationOverrides(color=" + this.color + ", event=" + this.event + ", iconUrl=" + this.iconUrl + ", imageUrl=" + this.imageUrl + ", priority=" + this.priority + ", showBadgeIcon=" + this.showBadgeIcon + ", showOnlyLastNotification=" + this.showOnlyLastNotification + ", showToast=" + this.showToast + ", title=" + this.title + ", text=" + this.text + ", importance=" + this.importance + ", randomGroupId=" + this.randomGroupId + ')';
    }
}
