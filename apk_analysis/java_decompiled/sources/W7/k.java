package W7;

import com.google.android.gms.internal.measurement.Y1;

/* loaded from: classes.dex */
public abstract class k extends j {
    public static Integer E(String str) {
        boolean z9;
        int i9;
        int i10;
        kotlin.jvm.internal.h.e(str, "<this>");
        Y1.i(10);
        int length = str.length();
        if (length != 0) {
            int i11 = 0;
            char charAt = str.charAt(0);
            int i12 = -2147483647;
            if (kotlin.jvm.internal.h.f(charAt, 48) < 0) {
                i9 = 1;
                if (length != 1) {
                    if (charAt != '+') {
                        if (charAt == '-') {
                            i12 = Integer.MIN_VALUE;
                            z9 = true;
                        } else {
                            return null;
                        }
                    } else {
                        z9 = false;
                    }
                } else {
                    return null;
                }
            } else {
                z9 = false;
                i9 = 0;
            }
            int i13 = -59652323;
            while (i9 < length) {
                int digit = Character.digit((int) str.charAt(i9), 10);
                if (digit >= 0) {
                    if ((i11 < i13 && (i13 != -59652323 || i11 < (i13 = i12 / 10))) || (i10 = i11 * 10) < i12 + digit) {
                        return null;
                    }
                    i11 = i10 - digit;
                    i9++;
                } else {
                    return null;
                }
            }
            if (z9) {
                return Integer.valueOf(i11);
            }
            return Integer.valueOf(-i11);
        }
        return null;
    }

    public static Long F(String str) {
        boolean z9;
        kotlin.jvm.internal.h.e(str, "<this>");
        Y1.i(10);
        int length = str.length();
        if (length != 0) {
            int i9 = 0;
            char charAt = str.charAt(0);
            long j = -9223372036854775807L;
            if (kotlin.jvm.internal.h.f(charAt, 48) < 0) {
                z9 = true;
                if (length != 1) {
                    if (charAt != '+') {
                        if (charAt == '-') {
                            j = Long.MIN_VALUE;
                            i9 = 1;
                        } else {
                            return null;
                        }
                    } else {
                        z9 = false;
                        i9 = 1;
                    }
                } else {
                    return null;
                }
            } else {
                z9 = false;
            }
            long j4 = 0;
            long j9 = -256204778801521550L;
            while (i9 < length) {
                int digit = Character.digit((int) str.charAt(i9), 10);
                if (digit >= 0) {
                    if (j4 < j9) {
                        if (j9 == -256204778801521550L) {
                            j9 = j / 10;
                            if (j4 < j9) {
                                return null;
                            }
                        } else {
                            return null;
                        }
                    }
                    long j10 = j4 * 10;
                    long j11 = digit;
                    if (j10 < j + j11) {
                        return null;
                    }
                    j4 = j10 - j11;
                    i9++;
                } else {
                    return null;
                }
            }
            if (z9) {
                return Long.valueOf(j4);
            }
            return Long.valueOf(-j4);
        }
        return null;
    }
}
