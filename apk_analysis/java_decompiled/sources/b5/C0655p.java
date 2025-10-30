package b5;

import android.os.Bundle;
import java.util.EnumMap;
import java.util.Objects;

/* renamed from: b5.p, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0655p {

    /* renamed from: f, reason: collision with root package name */
    public static final C0655p f11265f = new C0655p((Boolean) null, 100, (Boolean) null, (String) null);

    /* renamed from: a, reason: collision with root package name */
    public final int f11266a;

    /* renamed from: b, reason: collision with root package name */
    public final String f11267b;

    /* renamed from: c, reason: collision with root package name */
    public final Boolean f11268c;

    /* renamed from: d, reason: collision with root package name */
    public final String f11269d;

    /* renamed from: e, reason: collision with root package name */
    public final EnumMap f11270e;

    public C0655p(Boolean bool, int i9, Boolean bool2, String str) {
        EnumC0678z0 enumC0678z0;
        EnumMap enumMap = new EnumMap(B0.class);
        this.f11270e = enumMap;
        B0 b02 = B0.AD_USER_DATA;
        if (bool == null) {
            enumC0678z0 = EnumC0678z0.UNINITIALIZED;
        } else if (bool.booleanValue()) {
            enumC0678z0 = EnumC0678z0.GRANTED;
        } else {
            enumC0678z0 = EnumC0678z0.DENIED;
        }
        enumMap.put((EnumMap) b02, (B0) enumC0678z0);
        this.f11266a = i9;
        this.f11267b = e();
        this.f11268c = bool2;
        this.f11269d = str;
    }

    public static C0655p a(int i9, Bundle bundle) {
        Boolean bool = null;
        if (bundle == null) {
            return new C0655p((Boolean) null, i9, (Boolean) null, (String) null);
        }
        EnumMap enumMap = new EnumMap(B0.class);
        for (B0 b02 : A0.DMA.f10548a) {
            enumMap.put((EnumMap) b02, (B0) C0.b(bundle.getString(b02.f10562a)));
        }
        if (bundle.containsKey("is_dma_region")) {
            bool = Boolean.valueOf(bundle.getString("is_dma_region"));
        }
        return new C0655p(enumMap, i9, bool, bundle.getString("cps_display_str"));
    }

    public static C0655p b(String str) {
        if (str != null && str.length() > 0) {
            String[] split = str.split(":");
            int parseInt = Integer.parseInt(split[0]);
            EnumMap enumMap = new EnumMap(B0.class);
            B0[] b0Arr = A0.DMA.f10548a;
            int length = b0Arr.length;
            int i9 = 1;
            int i10 = 0;
            while (i10 < length) {
                enumMap.put((EnumMap) b0Arr[i10], (B0) C0.c(split[i9].charAt(0)));
                i10++;
                i9++;
            }
            return new C0655p(enumMap, parseInt, (Boolean) null, (String) null);
        }
        return f11265f;
    }

    public static Boolean d(Bundle bundle) {
        if (bundle != null) {
            int ordinal = C0.b(bundle.getString("ad_personalization")).ordinal();
            if (ordinal != 2) {
                if (ordinal != 3) {
                    return null;
                }
                return Boolean.TRUE;
            }
            return Boolean.FALSE;
        }
        return null;
    }

    public final EnumC0678z0 c() {
        EnumC0678z0 enumC0678z0 = (EnumC0678z0) this.f11270e.get(B0.AD_USER_DATA);
        if (enumC0678z0 == null) {
            return EnumC0678z0.UNINITIALIZED;
        }
        return enumC0678z0;
    }

    public final String e() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f11266a);
        for (B0 b02 : A0.DMA.f10548a) {
            sb.append(":");
            sb.append(C0.a((EnumC0678z0) this.f11270e.get(b02)));
        }
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C0655p) {
            C0655p c0655p = (C0655p) obj;
            if (this.f11267b.equalsIgnoreCase(c0655p.f11267b) && Objects.equals(this.f11268c, c0655p.f11268c)) {
                return Objects.equals(this.f11269d, c0655p.f11269d);
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        int i9;
        int hashCode;
        Boolean bool = this.f11268c;
        if (bool == null) {
            i9 = 3;
        } else if (true != bool.booleanValue()) {
            i9 = 13;
        } else {
            i9 = 7;
        }
        String str = this.f11269d;
        if (str == null) {
            hashCode = 17;
        } else {
            hashCode = str.hashCode();
        }
        return (hashCode * 137) + this.f11267b.hashCode() + (i9 * 29);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("source=");
        sb.append(C0.h(this.f11266a));
        for (B0 b02 : A0.DMA.f10548a) {
            sb.append(",");
            sb.append(b02.f10562a);
            sb.append("=");
            EnumC0678z0 enumC0678z0 = (EnumC0678z0) this.f11270e.get(b02);
            if (enumC0678z0 == null) {
                sb.append("uninitialized");
            } else {
                int ordinal = enumC0678z0.ordinal();
                if (ordinal != 0) {
                    if (ordinal != 1) {
                        if (ordinal != 2) {
                            if (ordinal == 3) {
                                sb.append("granted");
                            }
                        } else {
                            sb.append("denied");
                        }
                    } else {
                        sb.append("eu_consent_policy");
                    }
                } else {
                    sb.append("uninitialized");
                }
            }
        }
        Boolean bool = this.f11268c;
        if (bool != null) {
            sb.append(",isDmaRegion=");
            sb.append(bool);
        }
        String str = this.f11269d;
        if (str != null) {
            sb.append(",cpsDisplayStr=");
            sb.append(str);
        }
        return sb.toString();
    }

    public C0655p(EnumMap enumMap, int i9, Boolean bool, String str) {
        EnumMap enumMap2 = new EnumMap(B0.class);
        this.f11270e = enumMap2;
        enumMap2.putAll(enumMap);
        this.f11266a = i9;
        this.f11267b = e();
        this.f11268c = bool;
        this.f11269d = str;
    }
}
