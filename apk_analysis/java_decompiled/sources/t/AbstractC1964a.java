package t;

import kotlin.jvm.internal.h;

/* renamed from: t.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1964a {

    /* renamed from: a, reason: collision with root package name */
    public static final int[] f22824a = new int[0];

    /* renamed from: b, reason: collision with root package name */
    public static final Object[] f22825b = new Object[0];

    public static final int a(int i9, int i10, int[] array) {
        h.e(array, "array");
        int i11 = i9 - 1;
        int i12 = 0;
        while (i12 <= i11) {
            int i13 = (i12 + i11) >>> 1;
            int i14 = array[i13];
            if (i14 < i10) {
                i12 = i13 + 1;
            } else if (i14 > i10) {
                i11 = i13 - 1;
            } else {
                return i13;
            }
        }
        return ~i12;
    }

    public static final int b(long[] array, int i9, long j) {
        h.e(array, "array");
        int i10 = i9 - 1;
        int i11 = 0;
        while (i11 <= i10) {
            int i12 = (i11 + i10) >>> 1;
            long j4 = array[i12];
            if (j4 < j) {
                i11 = i12 + 1;
            } else if (j4 > j) {
                i10 = i12 - 1;
            } else {
                return i12;
            }
        }
        return ~i11;
    }
}
