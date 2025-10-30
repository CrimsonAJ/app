package G2;

import com.anilab.data.model.response.LatestVersionResponse;
import com.anilab.domain.model.LatestVersion;

/* loaded from: classes.dex */
public final class p implements q {
    public static LatestVersion a(LatestVersionResponse latestVersionResponse) {
        String str;
        int i9;
        String str2;
        String str3;
        int i10;
        boolean z9;
        Integer num;
        Integer num2;
        String str4 = null;
        if (latestVersionResponse != null) {
            str = latestVersionResponse.f14174b;
        } else {
            str = null;
        }
        String str5 = "";
        if (str == null) {
            str = "";
        }
        if (latestVersionResponse != null && (num2 = latestVersionResponse.f14175c) != null) {
            i9 = num2.intValue();
        } else {
            i9 = 0;
        }
        if (latestVersionResponse != null) {
            str2 = latestVersionResponse.f14176d;
        } else {
            str2 = null;
        }
        if (str2 == null) {
            str2 = "";
        }
        if (latestVersionResponse != null) {
            str4 = latestVersionResponse.f14177e;
        }
        if (str4 != null) {
            str5 = str4;
        }
        if (latestVersionResponse != null && (num = latestVersionResponse.f14178f) != null && num.intValue() == 1) {
            int i11 = i9;
            z9 = true;
            str3 = str;
            i10 = i11;
        } else {
            str3 = str;
            i10 = i9;
            z9 = false;
        }
        return new LatestVersion(str3, i10, str2, str5, z9);
    }

    @Override // G2.q
    public final /* bridge */ /* synthetic */ Object n(Object obj) {
        return a((LatestVersionResponse) obj);
    }
}
