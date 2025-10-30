package b5;

import P5.AbstractC0349q;
import android.content.SharedPreferences;
import android.text.TextUtils;

/* loaded from: classes.dex */
public abstract class w1 {

    /* renamed from: a, reason: collision with root package name */
    public static final P5.S f11342a;

    static {
        P5.D d9 = P5.F.f5901b;
        Object[] objArr = new Object[24];
        objArr[0] = "Version";
        objArr[1] = "GoogleConsent";
        objArr[2] = "VendorConsent";
        objArr[3] = "VendorLegitimateInterest";
        objArr[4] = "gdprApplies";
        objArr[5] = "EnableAdvertiserConsentMode";
        objArr[6] = "PolicyVersion";
        objArr[7] = "PurposeConsents";
        objArr[8] = "PurposeOneTreatment";
        objArr[9] = "Purpose1";
        objArr[10] = "Purpose3";
        objArr[11] = "Purpose4";
        System.arraycopy(new String[]{"Purpose7", "CmpSdkID", "PublisherCC", "PublisherRestrictions1", "PublisherRestrictions3", "PublisherRestrictions4", "PublisherRestrictions7", "AuthorizePurpose1", "AuthorizePurpose3", "AuthorizePurpose4", "AuthorizePurpose7", "PurposeDiagnostics"}, 0, objArr, 12, 12);
        AbstractC0349q.a(24, objArr);
        f11342a = P5.F.k(24, objArr);
    }

    public static int a(SharedPreferences sharedPreferences, String str) {
        try {
            return sharedPreferences.getInt(str, -1);
        } catch (ClassCastException unused) {
            return -1;
        }
    }

    public static String b(SharedPreferences sharedPreferences, String str) {
        try {
            return sharedPreferences.getString(str, "");
        } catch (ClassCastException unused) {
            return "";
        }
    }

    public static final boolean c(com.google.android.gms.internal.measurement.L1 l12, P5.X x5, P5.X x9, P5.e0 e0Var, char[] cArr, int i9, int i10, int i11, String str, String str2, String str3, boolean z9, boolean z10) {
        v1 v1Var;
        char c3;
        int d9 = d(l12);
        if (d9 > 0 && (i10 != 1 || i9 != 1)) {
            cArr[d9] = '2';
        }
        if (e(l12, x9) == com.google.android.gms.internal.measurement.M1.PURPOSE_RESTRICTION_NOT_ALLOWED) {
            c3 = '3';
        } else {
            if (l12 == com.google.android.gms.internal.measurement.L1.IAB_TCF_PURPOSE_STORE_AND_ACCESS_INFORMATION_ON_A_DEVICE && i11 == 1 && e0Var.f5972d.equals(str)) {
                if (d9 > 0 && cArr[d9] != '2') {
                    cArr[d9] = '1';
                }
                return true;
            }
            if (x5.containsKey(l12) && (v1Var = (v1) x5.get(l12)) != null) {
                int ordinal = v1Var.ordinal();
                com.google.android.gms.internal.measurement.M1 m12 = com.google.android.gms.internal.measurement.M1.PURPOSE_RESTRICTION_REQUIRE_LEGITIMATE_INTEREST;
                if (ordinal != 0) {
                    com.google.android.gms.internal.measurement.M1 m13 = com.google.android.gms.internal.measurement.M1.PURPOSE_RESTRICTION_REQUIRE_CONSENT;
                    if (ordinal != 1) {
                        if (ordinal != 2) {
                            if (ordinal == 3) {
                                if (e(l12, x9) == m13) {
                                    return g(l12, cArr, str2, z9);
                                }
                                return h(l12, cArr, str3, z10);
                            }
                        } else {
                            if (e(l12, x9) == m12) {
                                return h(l12, cArr, str3, z10);
                            }
                            return g(l12, cArr, str2, z9);
                        }
                    } else if (e(l12, x9) != m13) {
                        return h(l12, cArr, str3, z10);
                    }
                } else if (e(l12, x9) != m12) {
                    return g(l12, cArr, str2, z9);
                }
                c3 = '8';
            }
            c3 = '0';
        }
        if (d9 > 0 && cArr[d9] != '2') {
            cArr[d9] = c3;
            return false;
        }
        return false;
    }

    public static final int d(com.google.android.gms.internal.measurement.L1 l12) {
        if (l12 == com.google.android.gms.internal.measurement.L1.IAB_TCF_PURPOSE_STORE_AND_ACCESS_INFORMATION_ON_A_DEVICE) {
            return 1;
        }
        if (l12 == com.google.android.gms.internal.measurement.L1.IAB_TCF_PURPOSE_CREATE_A_PERSONALISED_ADS_PROFILE) {
            return 2;
        }
        if (l12 == com.google.android.gms.internal.measurement.L1.IAB_TCF_PURPOSE_SELECT_PERSONALISED_ADS) {
            return 3;
        }
        if (l12 == com.google.android.gms.internal.measurement.L1.IAB_TCF_PURPOSE_MEASURE_AD_PERFORMANCE) {
            return 4;
        }
        return -1;
    }

    public static final com.google.android.gms.internal.measurement.M1 e(com.google.android.gms.internal.measurement.L1 l12, P5.X x5) {
        Object obj = com.google.android.gms.internal.measurement.M1.PURPOSE_RESTRICTION_UNDEFINED;
        Object obj2 = x5.get(l12);
        if (obj2 != null) {
            obj = obj2;
        }
        return (com.google.android.gms.internal.measurement.M1) obj;
    }

    public static final String f(com.google.android.gms.internal.measurement.L1 l12, String str, String str2) {
        String str3;
        String str4 = "0";
        if (TextUtils.isEmpty(str) || str.length() < l12.a()) {
            str3 = "0";
        } else {
            str3 = String.valueOf(str.charAt(l12.a() - 1));
        }
        if (!TextUtils.isEmpty(str2) && str2.length() >= l12.a()) {
            str4 = String.valueOf(str2.charAt(l12.a() - 1));
        }
        return String.valueOf(str3).concat(String.valueOf(str4));
    }

    public static final boolean g(com.google.android.gms.internal.measurement.L1 l12, char[] cArr, String str, boolean z9) {
        char c3;
        int d9 = d(l12);
        boolean z10 = false;
        if (!z9) {
            c3 = '4';
        } else if (str.length() < l12.a()) {
            c3 = '0';
        } else {
            char charAt = str.charAt(l12.a() - 1);
            char c9 = '1';
            if (charAt == '1') {
                z10 = true;
            }
            if (d9 > 0 && cArr[d9] != '2') {
                if (charAt != '1') {
                    c9 = '6';
                }
                cArr[d9] = c9;
            }
            return z10;
        }
        if (d9 > 0 && cArr[d9] != '2') {
            cArr[d9] = c3;
        }
        return false;
    }

    public static final boolean h(com.google.android.gms.internal.measurement.L1 l12, char[] cArr, String str, boolean z9) {
        char c3;
        int d9 = d(l12);
        boolean z10 = false;
        if (!z9) {
            c3 = '5';
        } else if (str.length() < l12.a()) {
            c3 = '0';
        } else {
            char charAt = str.charAt(l12.a() - 1);
            char c9 = '1';
            if (charAt == '1') {
                z10 = true;
            }
            if (d9 > 0 && cArr[d9] != '2') {
                if (charAt != '1') {
                    c9 = '7';
                }
                cArr[d9] = c9;
            }
            return z10;
        }
        if (d9 > 0 && cArr[d9] != '2') {
            cArr[d9] = c3;
        }
        return false;
    }
}
