package W7;

/* loaded from: classes.dex */
public abstract class l extends k {
    public static boolean G(String str, String suffix, boolean z9) {
        kotlin.jvm.internal.h.e(str, "<this>");
        kotlin.jvm.internal.h.e(suffix, "suffix");
        if (!z9) {
            return str.endsWith(suffix);
        }
        return I(str.length() - suffix.length(), 0, suffix.length(), str, suffix, true);
    }

    public static boolean H(String str, String str2, boolean z9) {
        if (str == null) {
            if (str2 == null) {
                return true;
            }
            return false;
        }
        if (!z9) {
            return str.equals(str2);
        }
        return str.equalsIgnoreCase(str2);
    }

    public static final boolean I(int i9, int i10, int i11, String str, String other, boolean z9) {
        kotlin.jvm.internal.h.e(str, "<this>");
        kotlin.jvm.internal.h.e(other, "other");
        if (!z9) {
            return str.regionMatches(i9, other, i10, i11);
        }
        return str.regionMatches(z9, i9, other, i10, i11);
    }

    public static String J(String str, String oldValue, String newValue) {
        kotlin.jvm.internal.h.e(str, "<this>");
        kotlin.jvm.internal.h.e(oldValue, "oldValue");
        kotlin.jvm.internal.h.e(newValue, "newValue");
        int Q7 = d.Q(str, oldValue, 0, false);
        if (Q7 < 0) {
            return str;
        }
        int length = oldValue.length();
        int i9 = 1;
        if (length >= 1) {
            i9 = length;
        }
        int length2 = newValue.length() + (str.length() - length);
        if (length2 >= 0) {
            StringBuilder sb = new StringBuilder(length2);
            int i10 = 0;
            do {
                sb.append((CharSequence) str, i10, Q7);
                sb.append(newValue);
                i10 = Q7 + length;
                if (Q7 >= str.length()) {
                    break;
                }
                Q7 = d.Q(str, oldValue, Q7 + i9, false);
            } while (Q7 > 0);
            sb.append((CharSequence) str, i10, str.length());
            String sb2 = sb.toString();
            kotlin.jvm.internal.h.d(sb2, "toString(...)");
            return sb2;
        }
        throw new OutOfMemoryError();
    }

    public static boolean K(String str, String str2, int i9, boolean z9) {
        kotlin.jvm.internal.h.e(str, "<this>");
        if (!z9) {
            return str.startsWith(str2, i9);
        }
        return I(i9, 0, str2.length(), str, str2, z9);
    }

    public static boolean L(String str, String prefix, boolean z9) {
        kotlin.jvm.internal.h.e(str, "<this>");
        kotlin.jvm.internal.h.e(prefix, "prefix");
        if (!z9) {
            return str.startsWith(prefix);
        }
        return I(0, 0, prefix.length(), str, prefix, z9);
    }
}
