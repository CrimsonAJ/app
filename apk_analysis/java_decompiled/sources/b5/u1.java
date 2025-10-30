package b5;

import android.os.Bundle;
import android.text.TextUtils;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/* loaded from: classes.dex */
public final class u1 {

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f11327a;

    public u1(Map map) {
        HashMap hashMap = new HashMap();
        this.f11327a = hashMap;
        hashMap.putAll(map);
    }

    public final Bundle a() {
        String str;
        String str2;
        D d9 = E.f10666k1;
        boolean booleanValue = ((Boolean) d9.a(null)).booleanValue();
        HashMap hashMap = this.f11327a;
        if (!booleanValue ? !(!"1".equals(hashMap.get("GoogleConsent")) || !"1".equals(hashMap.get("gdprApplies")) || !"1".equals(hashMap.get("EnableAdvertiserConsentMode"))) : !(!"1".equals(hashMap.get("gdprApplies")) || !"1".equals(hashMap.get("EnableAdvertiserConsentMode")))) {
            if (((Boolean) d9.a(null)).booleanValue()) {
                if (hashMap.get("Version") == null) {
                    return e();
                }
                if (d() >= 0) {
                    Bundle bundle = new Bundle();
                    String str3 = "granted";
                    if (true == Objects.equals(hashMap.get("AuthorizePurpose1"), "1")) {
                        str = "granted";
                    } else {
                        str = "denied";
                    }
                    bundle.putString("ad_storage", str);
                    if (Objects.equals(hashMap.get("AuthorizePurpose3"), "1") && Objects.equals(hashMap.get("AuthorizePurpose4"), "1")) {
                        str2 = "granted";
                    } else {
                        str2 = "denied";
                    }
                    bundle.putString("ad_personalization", str2);
                    if (d() >= 4) {
                        if (!Objects.equals(hashMap.get("AuthorizePurpose1"), "1") || !Objects.equals(hashMap.get("AuthorizePurpose7"), "1")) {
                            str3 = "denied";
                        }
                        bundle.putString("ad_user_data", str3);
                    }
                    return bundle;
                }
            } else {
                return e();
            }
        }
        return Bundle.EMPTY;
    }

    public final String b() {
        int i9;
        HashMap hashMap = this.f11327a;
        StringBuilder sb = new StringBuilder("1");
        int i10 = -1;
        try {
            String str = (String) hashMap.get("CmpSdkID");
            if (!TextUtils.isEmpty(str)) {
                i10 = Integer.parseInt(str);
            }
        } catch (NumberFormatException unused) {
        }
        if (i10 >= 0 && i10 <= 4095) {
            sb.append("0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ-_".charAt(i10 >> 6));
            sb.append("0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ-_".charAt(i10 & 63));
        } else {
            sb.append("00");
        }
        int d9 = d();
        if (d9 >= 0 && d9 <= 63) {
            sb.append("0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ-_".charAt(d9));
        } else {
            sb.append("0");
        }
        if (true != "1".equals(hashMap.get("gdprApplies"))) {
            i9 = 0;
        } else {
            i9 = 2;
        }
        int i11 = i9 | 4;
        if ("1".equals(hashMap.get("EnableAdvertiserConsentMode"))) {
            i11 = i9 | 12;
        }
        sb.append("0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ-_".charAt(i11));
        return sb.toString();
    }

    public final String c() {
        StringBuilder sb = new StringBuilder();
        P5.S s9 = w1.f11342a;
        int i9 = s9.f5928d;
        for (int i10 = 0; i10 < i9; i10++) {
            String str = (String) s9.get(i10);
            HashMap hashMap = this.f11327a;
            if (hashMap.containsKey(str)) {
                if (sb.length() > 0) {
                    sb.append(";");
                }
                sb.append(str);
                sb.append("=");
                sb.append((String) hashMap.get(str));
            }
        }
        return sb.toString();
    }

    public final int d() {
        try {
            String str = (String) this.f11327a.get("PolicyVersion");
            if (!TextUtils.isEmpty(str)) {
                return Integer.parseInt(str);
            }
            return -1;
        } catch (NumberFormatException unused) {
            return -1;
        }
    }

    public final Bundle e() {
        int d9;
        String str;
        String str2;
        HashMap hashMap = this.f11327a;
        if ("1".equals(hashMap.get("GoogleConsent")) && (d9 = d()) >= 0) {
            String str3 = (String) hashMap.get("PurposeConsents");
            if (!TextUtils.isEmpty(str3)) {
                Bundle bundle = new Bundle();
                String str4 = "denied";
                if (str3.length() > 0) {
                    if (str3.charAt(0) != '1') {
                        str2 = "denied";
                    } else {
                        str2 = "granted";
                    }
                    bundle.putString("ad_storage", str2);
                }
                if (str3.length() > 3) {
                    if (str3.charAt(2) != '1' || str3.charAt(3) != '1') {
                        str = "denied";
                    } else {
                        str = "granted";
                    }
                    bundle.putString("ad_personalization", str);
                }
                if (str3.length() > 6 && d9 >= 4) {
                    if (str3.charAt(0) == '1' && str3.charAt(6) == '1') {
                        str4 = "granted";
                    }
                    bundle.putString("ad_user_data", str4);
                }
                return bundle;
            }
        }
        return Bundle.EMPTY;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof u1)) {
            return false;
        }
        return c().equalsIgnoreCase(((u1) obj).c());
    }

    public final int hashCode() {
        return c().hashCode();
    }

    public final String toString() {
        return c();
    }
}
