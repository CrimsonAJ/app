package co.notix.banner;

import androidx.annotation.Keep;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.h;

@Keep
/* loaded from: classes.dex */
public final class BannerRequest {
    private final Integer experiment;
    private final String placement;
    private final long refreshIntervalMillis;
    private final BannerSize size;
    private final long zoneId;

    public BannerRequest(long j, BannerSize size, String str, Integer num, long j4) {
        h.e(size, "size");
        this.zoneId = j;
        this.size = size;
        this.placement = str;
        this.experiment = num;
        this.refreshIntervalMillis = j4;
    }

    public static /* synthetic */ BannerRequest copy$default(BannerRequest bannerRequest, long j, BannerSize bannerSize, String str, Integer num, long j4, int i9, Object obj) {
        if ((i9 & 1) != 0) {
            j = bannerRequest.zoneId;
        }
        long j9 = j;
        if ((i9 & 2) != 0) {
            bannerSize = bannerRequest.size;
        }
        BannerSize bannerSize2 = bannerSize;
        if ((i9 & 4) != 0) {
            str = bannerRequest.placement;
        }
        String str2 = str;
        if ((i9 & 8) != 0) {
            num = bannerRequest.experiment;
        }
        Integer num2 = num;
        if ((i9 & 16) != 0) {
            j4 = bannerRequest.refreshIntervalMillis;
        }
        return bannerRequest.copy(j9, bannerSize2, str2, num2, j4);
    }

    public final long component1() {
        return this.zoneId;
    }

    public final BannerSize component2() {
        return this.size;
    }

    public final String component3() {
        return this.placement;
    }

    public final Integer component4() {
        return this.experiment;
    }

    public final long component5() {
        return this.refreshIntervalMillis;
    }

    public final BannerRequest copy(long j, BannerSize size, String str, Integer num, long j4) {
        h.e(size, "size");
        return new BannerRequest(j, size, str, num, j4);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BannerRequest)) {
            return false;
        }
        BannerRequest bannerRequest = (BannerRequest) obj;
        return this.zoneId == bannerRequest.zoneId && h.a(this.size, bannerRequest.size) && h.a(this.placement, bannerRequest.placement) && h.a(this.experiment, bannerRequest.experiment) && this.refreshIntervalMillis == bannerRequest.refreshIntervalMillis;
    }

    public final Integer getExperiment() {
        return this.experiment;
    }

    public final String getPlacement() {
        return this.placement;
    }

    public final long getRefreshIntervalMillis() {
        return this.refreshIntervalMillis;
    }

    public final BannerSize getSize() {
        return this.size;
    }

    public final long getZoneId() {
        return this.zoneId;
    }

    public int hashCode() {
        int hashCode;
        long j = this.zoneId;
        int hashCode2 = (this.size.hashCode() + (((int) (j ^ (j >>> 32))) * 31)) * 31;
        String str = this.placement;
        int i9 = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i10 = (hashCode2 + hashCode) * 31;
        Integer num = this.experiment;
        if (num != null) {
            i9 = num.hashCode();
        }
        int i11 = (i10 + i9) * 31;
        long j4 = this.refreshIntervalMillis;
        return ((int) (j4 ^ (j4 >>> 32))) + i11;
    }

    public String toString() {
        return "BannerRequest(zoneId=" + this.zoneId + ", size=" + this.size + ", placement=" + this.placement + ", experiment=" + this.experiment + ", refreshIntervalMillis=" + this.refreshIntervalMillis + ')';
    }

    public /* synthetic */ BannerRequest(long j, BannerSize bannerSize, String str, Integer num, long j4, int i9, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, bannerSize, (i9 & 4) != 0 ? null : str, (i9 & 8) != 0 ? null : num, (i9 & 16) != 0 ? 60000L : j4);
    }
}
