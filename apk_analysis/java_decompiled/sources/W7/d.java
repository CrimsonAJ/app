package W7;

import B6.u0;
import B7.B;
import V7.n;
import com.google.android.gms.internal.measurement.Y1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import u0.z;

/* loaded from: classes.dex */
public abstract class d extends l {
    public static boolean M(CharSequence charSequence, char c3) {
        kotlin.jvm.internal.h.e(charSequence, "<this>");
        if (R(charSequence, c3, 0, 2) < 0) {
            return false;
        }
        return true;
    }

    public static boolean N(CharSequence charSequence, String other) {
        kotlin.jvm.internal.h.e(charSequence, "<this>");
        kotlin.jvm.internal.h.e(other, "other");
        if (S(charSequence, other, 0, 2) < 0) {
            return false;
        }
        return true;
    }

    public static boolean O(String str, char c3) {
        if (str.length() <= 0 || !Y1.l(str.charAt(P(str)), c3, false)) {
            return false;
        }
        return true;
    }

    public static final int P(CharSequence charSequence) {
        kotlin.jvm.internal.h.e(charSequence, "<this>");
        return charSequence.length() - 1;
    }

    public static final int Q(CharSequence charSequence, String string, int i9, boolean z9) {
        kotlin.jvm.internal.h.e(charSequence, "<this>");
        kotlin.jvm.internal.h.e(string, "string");
        if (!z9 && (charSequence instanceof String)) {
            return ((String) charSequence).indexOf(string, i9);
        }
        int length = charSequence.length();
        if (i9 < 0) {
            i9 = 0;
        }
        int length2 = charSequence.length();
        if (length > length2) {
            length = length2;
        }
        T7.a aVar = new T7.a(i9, length, 1);
        boolean z10 = charSequence instanceof String;
        int i10 = aVar.f7239c;
        int i11 = aVar.f7238b;
        int i12 = aVar.f7237a;
        if (z10 && z.i(string)) {
            if ((i10 <= 0 || i12 > i11) && (i10 >= 0 || i11 > i12)) {
                return -1;
            }
            int i13 = i12;
            while (true) {
                String str = string;
                boolean z11 = z9;
                if (l.I(0, i13, string.length(), str, (String) charSequence, z11)) {
                    return i13;
                }
                if (i13 == i11) {
                    return -1;
                }
                i13 += i10;
                string = str;
                z9 = z11;
            }
        } else {
            boolean z12 = z9;
            if ((i10 <= 0 || i12 > i11) && (i10 >= 0 || i11 > i12)) {
                return -1;
            }
            while (true) {
                CharSequence charSequence2 = charSequence;
                boolean z13 = z12;
                z12 = z13;
                if (X(string, 0, charSequence2, i12, string.length(), z13)) {
                    return i12;
                }
                if (i12 == i11) {
                    return -1;
                }
                i12 += i10;
                charSequence = charSequence2;
            }
        }
    }

    public static int R(CharSequence charSequence, char c3, int i9, int i10) {
        if ((i10 & 2) != 0) {
            i9 = 0;
        }
        kotlin.jvm.internal.h.e(charSequence, "<this>");
        if (!(charSequence instanceof String)) {
            return T(charSequence, new char[]{c3}, i9, false);
        }
        return ((String) charSequence).indexOf(c3, i9);
    }

    public static /* synthetic */ int S(CharSequence charSequence, String str, int i9, int i10) {
        if ((i10 & 2) != 0) {
            i9 = 0;
        }
        return Q(charSequence, str, i9, false);
    }

    public static final int T(CharSequence charSequence, char[] cArr, int i9, boolean z9) {
        kotlin.jvm.internal.h.e(charSequence, "<this>");
        if (!z9 && cArr.length == 1 && (charSequence instanceof String)) {
            return ((String) charSequence).indexOf(B7.j.n0(cArr), i9);
        }
        if (i9 < 0) {
            i9 = 0;
        }
        int P8 = P(charSequence);
        if (i9 > P8) {
            return -1;
        }
        while (true) {
            char charAt = charSequence.charAt(i9);
            for (char c3 : cArr) {
                if (Y1.l(c3, charAt, z9)) {
                    return i9;
                }
            }
            if (i9 != P8) {
                i9++;
            } else {
                return -1;
            }
        }
    }

    public static boolean U(CharSequence charSequence) {
        kotlin.jvm.internal.h.e(charSequence, "<this>");
        for (int i9 = 0; i9 < charSequence.length(); i9++) {
            if (!Y1.u(charSequence.charAt(i9))) {
                return false;
            }
        }
        return true;
    }

    public static int V(CharSequence charSequence, char c3, int i9, int i10) {
        if ((i10 & 2) != 0) {
            i9 = P(charSequence);
        }
        kotlin.jvm.internal.h.e(charSequence, "<this>");
        if (!(charSequence instanceof String)) {
            char[] cArr = {c3};
            if (charSequence instanceof String) {
                return ((String) charSequence).lastIndexOf(B7.j.n0(cArr), i9);
            }
            int P8 = P(charSequence);
            if (i9 > P8) {
                i9 = P8;
            }
            while (-1 < i9) {
                if (Y1.l(cArr[0], charSequence.charAt(i9), false)) {
                    return i9;
                }
                i9--;
            }
            return -1;
        }
        return ((String) charSequence).lastIndexOf(c3, i9);
    }

    public static String W(int i9, String str) {
        CharSequence charSequence;
        kotlin.jvm.internal.h.e(str, "<this>");
        if (i9 >= 0) {
            if (i9 <= str.length()) {
                charSequence = str.subSequence(0, str.length());
            } else {
                StringBuilder sb = new StringBuilder(i9);
                int length = i9 - str.length();
                int i10 = 1;
                if (1 <= length) {
                    while (true) {
                        sb.append('0');
                        if (i10 == length) {
                            break;
                        }
                        i10++;
                    }
                }
                sb.append((CharSequence) str);
                charSequence = sb;
            }
            return charSequence.toString();
        }
        throw new IllegalArgumentException(A0.a.m("Desired length ", i9, " is less than zero."));
    }

    public static final boolean X(String str, int i9, CharSequence other, int i10, int i11, boolean z9) {
        kotlin.jvm.internal.h.e(str, "<this>");
        kotlin.jvm.internal.h.e(other, "other");
        if (i10 >= 0 && i9 >= 0 && i9 <= str.length() - i11 && i10 <= other.length() - i11) {
            for (int i12 = 0; i12 < i11; i12++) {
                if (Y1.l(str.charAt(i9 + i12), other.charAt(i10 + i12), z9)) {
                }
            }
            return true;
        }
        return false;
    }

    public static String Y(String str, String prefix) {
        kotlin.jvm.internal.h.e(str, "<this>");
        kotlin.jvm.internal.h.e(prefix, "prefix");
        if (c0(prefix, str)) {
            String substring = str.substring(prefix.length());
            kotlin.jvm.internal.h.d(substring, "substring(...)");
            return substring;
        }
        return str;
    }

    public static final List Z(String str, String str2) {
        int Q7 = Q(str, str2, 0, false);
        if (Q7 != -1) {
            ArrayList arrayList = new ArrayList(10);
            int i9 = 0;
            do {
                arrayList.add(str.subSequence(i9, Q7).toString());
                i9 = str2.length() + Q7;
                Q7 = Q(str, str2, i9, false);
            } while (Q7 != -1);
            arrayList.add(str.subSequence(i9, str.length()).toString());
            return arrayList;
        }
        return u0.D(str.toString());
    }

    public static List a0(String str, char[] cArr) {
        kotlin.jvm.internal.h.e(str, "<this>");
        if (cArr.length == 1) {
            return Z(str, String.valueOf(cArr[0]));
        }
        n nVar = new n(new V7.i(str, new m(0, cArr)));
        ArrayList arrayList = new ArrayList(B7.m.f0(nVar, 10));
        Iterator it = nVar.iterator();
        while (true) {
            B b9 = (B) it;
            if (b9.hasNext()) {
                T7.c range = (T7.c) b9.next();
                kotlin.jvm.internal.h.e(range, "range");
                arrayList.add(str.subSequence(range.f7237a, range.f7238b + 1).toString());
            } else {
                return arrayList;
            }
        }
    }

    public static List b0(String str, String[] strArr) {
        kotlin.jvm.internal.h.e(str, "<this>");
        if (strArr.length == 1) {
            String str2 = strArr[0];
            if (str2.length() != 0) {
                return Z(str, str2);
            }
        }
        n nVar = new n(new V7.i(str, new m(1, B7.j.a0(strArr))));
        ArrayList arrayList = new ArrayList(B7.m.f0(nVar, 10));
        Iterator it = nVar.iterator();
        while (true) {
            B b9 = (B) it;
            if (b9.hasNext()) {
                T7.c range = (T7.c) b9.next();
                kotlin.jvm.internal.h.e(range, "range");
                arrayList.add(str.subSequence(range.f7237a, range.f7238b + 1).toString());
            } else {
                return arrayList;
            }
        }
    }

    public static boolean c0(CharSequence prefix, String str) {
        kotlin.jvm.internal.h.e(str, "<this>");
        kotlin.jvm.internal.h.e(prefix, "prefix");
        if (prefix instanceof String) {
            return l.L(str, (String) prefix, false);
        }
        return X(str, 0, prefix, 0, prefix.length(), false);
    }

    public static String d0(String str, char c3) {
        int R2 = R(str, c3, 0, 6);
        if (R2 == -1) {
            return str;
        }
        String substring = str.substring(R2 + 1, str.length());
        kotlin.jvm.internal.h.d(substring, "substring(...)");
        return substring;
    }

    public static String e0(String str, String delimiter) {
        kotlin.jvm.internal.h.e(delimiter, "delimiter");
        int S8 = S(str, delimiter, 0, 6);
        if (S8 == -1) {
            return str;
        }
        String substring = str.substring(delimiter.length() + S8, str.length());
        kotlin.jvm.internal.h.d(substring, "substring(...)");
        return substring;
    }

    public static String f0(String str, char c3, String str2) {
        int V8 = V(str, c3, 0, 6);
        if (V8 == -1) {
            return str2;
        }
        String substring = str.substring(V8 + 1, str.length());
        kotlin.jvm.internal.h.d(substring, "substring(...)");
        return substring;
    }

    public static String g0(String missingDelimiterValue, char c3) {
        kotlin.jvm.internal.h.e(missingDelimiterValue, "<this>");
        kotlin.jvm.internal.h.e(missingDelimiterValue, "missingDelimiterValue");
        int V8 = V(missingDelimiterValue, c3, 0, 6);
        if (V8 == -1) {
            return missingDelimiterValue;
        }
        String substring = missingDelimiterValue.substring(0, V8);
        kotlin.jvm.internal.h.d(substring, "substring(...)");
        return substring;
    }

    public static String h0(int i9, String str) {
        kotlin.jvm.internal.h.e(str, "<this>");
        if (i9 >= 0) {
            int length = str.length();
            if (i9 > length) {
                i9 = length;
            }
            String substring = str.substring(0, i9);
            kotlin.jvm.internal.h.d(substring, "substring(...)");
            return substring;
        }
        throw new IllegalArgumentException(A0.a.m("Requested character count ", i9, " is less than zero.").toString());
    }

    public static Boolean i0(String str) {
        if (str.equals("true")) {
            return Boolean.TRUE;
        }
        if (str.equals("false")) {
            return Boolean.FALSE;
        }
        return null;
    }

    public static CharSequence j0(CharSequence charSequence) {
        int i9;
        kotlin.jvm.internal.h.e(charSequence, "<this>");
        int length = charSequence.length() - 1;
        int i10 = 0;
        boolean z9 = false;
        while (i10 <= length) {
            if (!z9) {
                i9 = i10;
            } else {
                i9 = length;
            }
            boolean u9 = Y1.u(charSequence.charAt(i9));
            if (!z9) {
                if (!u9) {
                    z9 = true;
                } else {
                    i10++;
                }
            } else {
                if (!u9) {
                    break;
                }
                length--;
            }
        }
        return charSequence.subSequence(i10, length + 1);
    }
}
