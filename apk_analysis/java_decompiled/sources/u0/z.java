package u0;

import android.os.Bundle;
import java.util.HashMap;

/* loaded from: classes.dex */
public abstract /* synthetic */ class z {
    public static /* synthetic */ int a(int i9) {
        int i10 = 1;
        if (i9 != 1) {
            i10 = 2;
            if (i9 != 2) {
                i10 = 3;
                if (i9 != 3) {
                    if (i9 == 4) {
                        return 4;
                    }
                    throw null;
                }
            }
        }
        return i10;
    }

    public static float b(float f9, float f10, float f11, float f12) {
        return ((f9 - f10) * f11) + f12;
    }

    public static int c(String str, int i9, int i10) {
        return (str.hashCode() + i9) * i10;
    }

    public static Object d(Bundle bundle, String str, String str2, String str3, String str4) {
        kotlin.jvm.internal.h.e(bundle, str);
        kotlin.jvm.internal.h.e(str2, str3);
        return bundle.get(str4);
    }

    public static String e(String str, String str2) {
        return str + str2;
    }

    public static String f(String str, StringBuilder sb) {
        return str + ((Object) sb);
    }

    public static String g(StringBuilder sb, int i9, String str) {
        sb.append(i9);
        sb.append(str);
        return sb.toString();
    }

    public static void h(int i9, HashMap hashMap, String str, int i10, String str2) {
        hashMap.put(str, Integer.valueOf(i9));
        hashMap.put(str2, Integer.valueOf(i10));
    }

    public static /* synthetic */ boolean i(Object obj) {
        return obj != null;
    }

    public static /* synthetic */ String j(int i9) {
        switch (i9) {
            case 1:
                return "NONE";
            case 2:
                return "LEFT";
            case 3:
                return "TOP";
            case 4:
                return "RIGHT";
            case 5:
                return "BOTTOM";
            case 6:
                return "BASELINE";
            case 7:
                return "CENTER";
            case 8:
                return "CENTER_X";
            case 9:
                return "CENTER_Y";
            default:
                throw null;
        }
    }
}
