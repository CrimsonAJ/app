package i8;

import java.util.Comparator;

/* renamed from: i8.m, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1423m implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        String a5 = (String) obj;
        String b9 = (String) obj2;
        kotlin.jvm.internal.h.e(a5, "a");
        kotlin.jvm.internal.h.e(b9, "b");
        int min = Math.min(a5.length(), b9.length());
        for (int i9 = 4; i9 < min; i9++) {
            char charAt = a5.charAt(i9);
            char charAt2 = b9.charAt(i9);
            if (charAt != charAt2) {
                if (kotlin.jvm.internal.h.f(charAt, charAt2) < 0) {
                    return -1;
                }
                return 1;
            }
        }
        int length = a5.length();
        int length2 = b9.length();
        if (length != length2) {
            if (length < length2) {
                return -1;
            }
            return 1;
        }
        return 0;
    }
}
