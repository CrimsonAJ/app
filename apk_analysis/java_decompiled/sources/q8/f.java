package q8;

import com.google.android.gms.internal.measurement.AbstractC0953k1;
import x8.C2190j;

/* loaded from: classes.dex */
public abstract class f {

    /* renamed from: a, reason: collision with root package name */
    public static final C2190j f22473a;

    /* renamed from: b, reason: collision with root package name */
    public static final String[] f22474b;

    /* renamed from: c, reason: collision with root package name */
    public static final String[] f22475c;

    /* renamed from: d, reason: collision with root package name */
    public static final String[] f22476d;

    static {
        C2190j c2190j = C2190j.f24645d;
        f22473a = e0.c.D("PRI * HTTP/2.0\r\n\r\nSM\r\n\r\n");
        f22474b = new String[]{"DATA", "HEADERS", "PRIORITY", "RST_STREAM", "SETTINGS", "PUSH_PROMISE", "PING", "GOAWAY", "WINDOW_UPDATE", "CONTINUATION"};
        f22475c = new String[64];
        String[] strArr = new String[256];
        for (int i9 = 0; i9 < 256; i9++) {
            String binaryString = Integer.toBinaryString(i9);
            kotlin.jvm.internal.h.d(binaryString, "toBinaryString(it)");
            String replace = k8.c.i("%8s", binaryString).replace(' ', '0');
            kotlin.jvm.internal.h.d(replace, "replace(...)");
            strArr[i9] = replace;
        }
        f22476d = strArr;
        String[] strArr2 = f22475c;
        strArr2[0] = "";
        strArr2[1] = "END_STREAM";
        int[] iArr = {1};
        strArr2[8] = "PADDED";
        int i10 = iArr[0];
        strArr2[i10 | 8] = AbstractC0953k1.q(new StringBuilder(), strArr2[i10], "|PADDED");
        strArr2[4] = "END_HEADERS";
        strArr2[32] = "PRIORITY";
        strArr2[36] = "END_HEADERS|PRIORITY";
        int[] iArr2 = {4, 32, 36};
        for (int i11 = 0; i11 < 3; i11++) {
            int i12 = iArr2[i11];
            int i13 = iArr[0];
            String[] strArr3 = f22475c;
            int i14 = i13 | i12;
            strArr3[i14] = strArr3[i13] + '|' + strArr3[i12];
            StringBuilder sb = new StringBuilder();
            sb.append(strArr3[i13]);
            sb.append('|');
            strArr3[i14 | 8] = AbstractC0953k1.q(sb, strArr3[i12], "|PADDED");
        }
        int length = f22475c.length;
        for (int i15 = 0; i15 < length; i15++) {
            String[] strArr4 = f22475c;
            if (strArr4[i15] == null) {
                strArr4[i15] = f22476d[i15];
            }
        }
    }

    public static String a(boolean z9, int i9, int i10, int i11, int i12) {
        String i13;
        String str;
        String str2;
        String str3;
        String[] strArr = f22474b;
        if (i11 < strArr.length) {
            i13 = strArr[i11];
        } else {
            i13 = k8.c.i("0x%02x", Integer.valueOf(i11));
        }
        if (i12 == 0) {
            str = "";
        } else {
            String[] strArr2 = f22476d;
            if (i11 != 2 && i11 != 3) {
                if (i11 != 4 && i11 != 6) {
                    if (i11 != 7 && i11 != 8) {
                        String[] strArr3 = f22475c;
                        if (i12 < strArr3.length) {
                            str2 = strArr3[i12];
                            kotlin.jvm.internal.h.b(str2);
                        } else {
                            str2 = strArr2[i12];
                        }
                        if (i11 == 5 && (i12 & 4) != 0) {
                            str = W7.l.J(str2, "HEADERS", "PUSH_PROMISE");
                        } else if (i11 == 0 && (i12 & 32) != 0) {
                            str = W7.l.J(str2, "PRIORITY", "COMPRESSED");
                        } else {
                            str = str2;
                        }
                    }
                } else if (i12 == 1) {
                    str = "ACK";
                } else {
                    str = strArr2[i12];
                }
            }
            str = strArr2[i12];
        }
        if (z9) {
            str3 = "<<";
        } else {
            str3 = ">>";
        }
        return k8.c.i("%s 0x%08x %5d %-13s %s", str3, Integer.valueOf(i9), Integer.valueOf(i10), i13, str);
    }
}
