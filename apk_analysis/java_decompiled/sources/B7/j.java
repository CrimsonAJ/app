package B7;

import B6.u0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.NoSuchElementException;
import l6.AbstractC1570b;

/* loaded from: classes.dex */
public abstract class j extends v4.e {
    public static List a0(Object[] objArr) {
        kotlin.jvm.internal.h.e(objArr, "<this>");
        List asList = Arrays.asList(objArr);
        kotlin.jvm.internal.h.d(asList, "asList(...)");
        return asList;
    }

    public static boolean b0(Object[] objArr, Object obj) {
        kotlin.jvm.internal.h.e(objArr, "<this>");
        if (l0(objArr, obj) >= 0) {
            return true;
        }
        return false;
    }

    public static void c0(int i9, int i10, int i11, byte[] bArr, byte[] destination) {
        kotlin.jvm.internal.h.e(bArr, "<this>");
        kotlin.jvm.internal.h.e(destination, "destination");
        System.arraycopy(bArr, i10, destination, i9, i11 - i10);
    }

    public static void d0(int i9, int i10, int i11, int[] iArr, int[] destination) {
        kotlin.jvm.internal.h.e(iArr, "<this>");
        kotlin.jvm.internal.h.e(destination, "destination");
        System.arraycopy(iArr, i10, destination, i9, i11 - i10);
    }

    public static void e0(int i9, int i10, int i11, Object[] objArr, Object[] destination) {
        kotlin.jvm.internal.h.e(objArr, "<this>");
        kotlin.jvm.internal.h.e(destination, "destination");
        System.arraycopy(objArr, i10, destination, i9, i11 - i10);
    }

    public static /* synthetic */ void f0(int i9, int i10, int i11, Object[] objArr, Object[] objArr2) {
        if ((i11 & 4) != 0) {
            i9 = 0;
        }
        if ((i11 & 8) != 0) {
            i10 = objArr.length;
        }
        e0(0, i9, i10, objArr, objArr2);
    }

    public static byte[] g0(byte[] bArr, int i9, int i10) {
        kotlin.jvm.internal.h.e(bArr, "<this>");
        v4.e.g(i10, bArr.length);
        byte[] copyOfRange = Arrays.copyOfRange(bArr, i9, i10);
        kotlin.jvm.internal.h.d(copyOfRange, "copyOfRange(...)");
        return copyOfRange;
    }

    public static Object[] h0(Object[] objArr, int i9, int i10) {
        kotlin.jvm.internal.h.e(objArr, "<this>");
        v4.e.g(i10, objArr.length);
        Object[] copyOfRange = Arrays.copyOfRange(objArr, i9, i10);
        kotlin.jvm.internal.h.d(copyOfRange, "copyOfRange(...)");
        return copyOfRange;
    }

    public static void i0(Object[] objArr, G6.a aVar, int i9, int i10) {
        kotlin.jvm.internal.h.e(objArr, "<this>");
        Arrays.fill(objArr, i9, i10, aVar);
    }

    public static ArrayList k0(Object[] objArr) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : objArr) {
            if (obj != null) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public static int l0(Object[] objArr, Object obj) {
        kotlin.jvm.internal.h.e(objArr, "<this>");
        int i9 = 0;
        if (obj == null) {
            int length = objArr.length;
            while (i9 < length) {
                if (objArr[i9] == null) {
                    return i9;
                }
                i9++;
            }
            return -1;
        }
        int length2 = objArr.length;
        while (i9 < length2) {
            if (obj.equals(objArr[i9])) {
                return i9;
            }
            i9++;
        }
        return -1;
    }

    public static String m0(Object[] objArr) {
        StringBuilder sb = new StringBuilder();
        sb.append((CharSequence) "");
        int i9 = 0;
        for (Object obj : objArr) {
            i9++;
            if (i9 > 1) {
                sb.append((CharSequence) ", ");
            }
            AbstractC1570b.a(sb, obj, null);
        }
        sb.append((CharSequence) "");
        return sb.toString();
    }

    public static char n0(char[] cArr) {
        int length = cArr.length;
        if (length != 0) {
            if (length == 1) {
                return cArr[0];
            }
            throw new IllegalArgumentException("Array has more than one element.");
        }
        throw new NoSuchElementException("Array is empty.");
    }

    public static List o0(Object[] objArr) {
        int length = objArr.length;
        if (length != 0) {
            if (length != 1) {
                return new ArrayList(new h(objArr, false));
            }
            return u0.D(objArr[0]);
        }
        return t.f1135a;
    }
}
