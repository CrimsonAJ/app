package b5;

import android.os.Bundle;
import java.util.EnumMap;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class C0 {

    /* renamed from: c, reason: collision with root package name */
    public static final C0 f10564c = new C0(100);

    /* renamed from: a, reason: collision with root package name */
    public final EnumMap f10565a;

    /* renamed from: b, reason: collision with root package name */
    public final int f10566b;

    public C0(int i9) {
        EnumMap enumMap = new EnumMap(B0.class);
        this.f10565a = enumMap;
        B0 b02 = B0.AD_STORAGE;
        EnumC0678z0 enumC0678z0 = EnumC0678z0.UNINITIALIZED;
        enumMap.put((EnumMap) b02, (B0) enumC0678z0);
        enumMap.put((EnumMap) B0.ANALYTICS_STORAGE, (B0) enumC0678z0);
        this.f10566b = i9;
    }

    public static char a(EnumC0678z0 enumC0678z0) {
        if (enumC0678z0 != null) {
            int ordinal = enumC0678z0.ordinal();
            if (ordinal != 1) {
                if (ordinal != 2) {
                    if (ordinal == 3) {
                        return '1';
                    }
                    return '-';
                }
                return '0';
            }
            return '+';
        }
        return '-';
    }

    public static EnumC0678z0 b(String str) {
        EnumC0678z0 enumC0678z0 = EnumC0678z0.UNINITIALIZED;
        if (str == null) {
            return enumC0678z0;
        }
        if (str.equals("granted")) {
            return EnumC0678z0.GRANTED;
        }
        if (str.equals("denied")) {
            return EnumC0678z0.DENIED;
        }
        return enumC0678z0;
    }

    public static EnumC0678z0 c(char c3) {
        if (c3 != '+') {
            if (c3 != '0') {
                if (c3 != '1') {
                    return EnumC0678z0.UNINITIALIZED;
                }
                return EnumC0678z0.GRANTED;
            }
            return EnumC0678z0.DENIED;
        }
        return EnumC0678z0.POLICY;
    }

    public static C0 d(int i9, Bundle bundle) {
        if (bundle == null) {
            return new C0(i9);
        }
        EnumMap enumMap = new EnumMap(B0.class);
        for (B0 b02 : A0.STORAGE.f10548a) {
            enumMap.put((EnumMap) b02, (B0) b(bundle.getString(b02.f10562a)));
        }
        return new C0(enumMap, i9);
    }

    public static C0 e(int i9, String str) {
        String str2;
        EnumMap enumMap = new EnumMap(B0.class);
        A0 a02 = A0.STORAGE;
        int i10 = 0;
        while (true) {
            B0[] b0Arr = a02.f10548a;
            if (i10 < b0Arr.length) {
                if (str == null) {
                    str2 = "";
                } else {
                    str2 = str;
                }
                B0 b02 = b0Arr[i10];
                int i11 = i10 + 2;
                if (i11 < str2.length()) {
                    enumMap.put((EnumMap) b02, (B0) c(str2.charAt(i11)));
                } else {
                    enumMap.put((EnumMap) b02, (B0) EnumC0678z0.UNINITIALIZED);
                }
                i10++;
            } else {
                return new C0(enumMap, i9);
            }
        }
    }

    public static String h(int i9) {
        if (i9 != -30) {
            if (i9 != -20) {
                if (i9 != -10) {
                    if (i9 != 0) {
                        if (i9 != 30) {
                            if (i9 != 90) {
                                if (i9 != 100) {
                                    return "OTHER";
                                }
                                return "UNKNOWN";
                            }
                            return "REMOTE_CONFIG";
                        }
                        return "1P_INIT";
                    }
                    return "1P_API";
                }
                return "MANIFEST";
            }
            return "API";
        }
        return "TCF";
    }

    public static boolean l(int i9, int i10) {
        int i11 = -30;
        if (i9 == -20) {
            if (i10 != -30) {
                i9 = -20;
            } else {
                return true;
            }
        }
        if (i9 == -30) {
            if (i10 == -20) {
                return true;
            }
        } else {
            i11 = i9;
        }
        if (i11 != i10 && i9 >= i10) {
            return false;
        }
        return true;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C0)) {
            return false;
        }
        C0 c02 = (C0) obj;
        for (B0 b02 : A0.STORAGE.f10548a) {
            if (this.f10565a.get(b02) != c02.f10565a.get(b02)) {
                return false;
            }
        }
        if (this.f10566b != c02.f10566b) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0045 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final b5.C0 f(b5.C0 r9) {
        /*
            r8 = this;
            java.util.EnumMap r0 = new java.util.EnumMap
            java.lang.Class<b5.B0> r1 = b5.B0.class
            r0.<init>(r1)
            b5.A0 r1 = b5.A0.STORAGE
            b5.B0[] r1 = r1.f10548a
            int r2 = r1.length
            r3 = 0
        Ld:
            if (r3 >= r2) goto L48
            r4 = r1[r3]
            java.util.EnumMap r5 = r8.f10565a
            java.lang.Object r5 = r5.get(r4)
            b5.z0 r5 = (b5.EnumC0678z0) r5
            java.util.EnumMap r6 = r9.f10565a
            java.lang.Object r6 = r6.get(r4)
            b5.z0 r6 = (b5.EnumC0678z0) r6
            if (r5 != 0) goto L24
            goto L31
        L24:
            if (r6 == 0) goto L40
            b5.z0 r7 = b5.EnumC0678z0.UNINITIALIZED
            if (r5 != r7) goto L2b
            goto L31
        L2b:
            if (r6 == r7) goto L40
            b5.z0 r7 = b5.EnumC0678z0.POLICY
            if (r5 != r7) goto L33
        L31:
            r5 = r6
            goto L40
        L33:
            if (r6 == r7) goto L40
            b5.z0 r7 = b5.EnumC0678z0.DENIED
            if (r5 == r7) goto L3f
            if (r6 != r7) goto L3c
            goto L3f
        L3c:
            b5.z0 r5 = b5.EnumC0678z0.GRANTED
            goto L40
        L3f:
            r5 = r7
        L40:
            if (r5 == 0) goto L45
            r0.put(r4, r5)
        L45:
            int r3 = r3 + 1
            goto Ld
        L48:
            b5.C0 r9 = new b5.C0
            r1 = 100
            r9.<init>(r0, r1)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: b5.C0.f(b5.C0):b5.C0");
    }

    public final C0 g(C0 c02) {
        EnumMap enumMap = new EnumMap(B0.class);
        for (B0 b02 : A0.STORAGE.f10548a) {
            EnumC0678z0 enumC0678z0 = (EnumC0678z0) this.f10565a.get(b02);
            if (enumC0678z0 == EnumC0678z0.UNINITIALIZED) {
                enumC0678z0 = (EnumC0678z0) c02.f10565a.get(b02);
            }
            if (enumC0678z0 != null) {
                enumMap.put((EnumMap) b02, (B0) enumC0678z0);
            }
        }
        return new C0(enumMap, this.f10566b);
    }

    public final int hashCode() {
        Iterator it = this.f10565a.values().iterator();
        int i9 = this.f10566b * 17;
        while (it.hasNext()) {
            i9 = (i9 * 31) + ((EnumC0678z0) it.next()).hashCode();
        }
        return i9;
    }

    public final String i() {
        int ordinal;
        StringBuilder sb = new StringBuilder("G1");
        for (B0 b02 : A0.STORAGE.f10548a) {
            EnumC0678z0 enumC0678z0 = (EnumC0678z0) this.f10565a.get(b02);
            char c3 = '-';
            if (enumC0678z0 != null && (ordinal = enumC0678z0.ordinal()) != 0) {
                if (ordinal != 1) {
                    if (ordinal != 2) {
                        if (ordinal != 3) {
                        }
                    } else {
                        c3 = '0';
                    }
                }
                c3 = '1';
            }
            sb.append(c3);
        }
        return sb.toString();
    }

    public final String j() {
        StringBuilder sb = new StringBuilder("G1");
        for (B0 b02 : A0.STORAGE.f10548a) {
            sb.append(a((EnumC0678z0) this.f10565a.get(b02)));
        }
        return sb.toString();
    }

    public final boolean k(B0 b02) {
        if (((EnumC0678z0) this.f10565a.get(b02)) == EnumC0678z0.DENIED) {
            return false;
        }
        return true;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("source=");
        sb.append(h(this.f10566b));
        for (B0 b02 : A0.STORAGE.f10548a) {
            sb.append(",");
            sb.append(b02.f10562a);
            sb.append("=");
            EnumC0678z0 enumC0678z0 = (EnumC0678z0) this.f10565a.get(b02);
            if (enumC0678z0 == null) {
                enumC0678z0 = EnumC0678z0.UNINITIALIZED;
            }
            sb.append(enumC0678z0);
        }
        return sb.toString();
    }

    public C0(EnumMap enumMap, int i9) {
        EnumMap enumMap2 = new EnumMap(B0.class);
        this.f10565a = enumMap2;
        enumMap2.putAll(enumMap);
        this.f10566b = i9;
    }
}
