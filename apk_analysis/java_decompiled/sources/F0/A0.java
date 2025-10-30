package F0;

import android.text.TextUtils;
import l4.AbstractC1566a;

/* loaded from: classes.dex */
public final class A0 {

    /* renamed from: a, reason: collision with root package name */
    public int f1985a;

    /* renamed from: b, reason: collision with root package name */
    public int f1986b;

    /* renamed from: c, reason: collision with root package name */
    public int f1987c;

    /* renamed from: d, reason: collision with root package name */
    public int f1988d;

    /* renamed from: e, reason: collision with root package name */
    public int f1989e;

    /* JADX WARN: Type inference failed for: r0v1, types: [F0.A0, java.lang.Object] */
    public static A0 b(String str) {
        char c3;
        AbstractC1566a.h(str.startsWith("Format:"));
        String[] split = TextUtils.split(str.substring(7), ",");
        int i9 = -1;
        int i10 = -1;
        int i11 = -1;
        int i12 = -1;
        for (int i13 = 0; i13 < split.length; i13++) {
            String L8 = B6.u0.L(split[i13].trim());
            L8.getClass();
            switch (L8.hashCode()) {
                case 100571:
                    if (L8.equals("end")) {
                        c3 = 0;
                        break;
                    }
                    break;
                case 3556653:
                    if (L8.equals("text")) {
                        c3 = 1;
                        break;
                    }
                    break;
                case 109757538:
                    if (L8.equals("start")) {
                        c3 = 2;
                        break;
                    }
                    break;
                case 109780401:
                    if (L8.equals("style")) {
                        c3 = 3;
                        break;
                    }
                    break;
            }
            c3 = 65535;
            switch (c3) {
                case 0:
                    i10 = i13;
                    break;
                case 1:
                    i11 = i13;
                    break;
                case 2:
                    i9 = i13;
                    break;
                case 3:
                    i12 = i13;
                    break;
            }
        }
        if (i9 != -1 && i10 != -1 && i11 != -1) {
            int length = split.length;
            ?? obj = new Object();
            obj.f1985a = i9;
            obj.f1986b = i10;
            obj.f1987c = i12;
            obj.f1988d = i11;
            obj.f1989e = length;
            return obj;
        }
        return null;
    }

    public boolean a() {
        int i9;
        int i10;
        int i11;
        int i12 = this.f1985a;
        int i13 = 2;
        if ((i12 & 7) != 0) {
            int i14 = this.f1988d;
            int i15 = this.f1986b;
            if (i14 > i15) {
                i11 = 1;
            } else if (i14 == i15) {
                i11 = 2;
            } else {
                i11 = 4;
            }
            if ((i11 & i12) == 0) {
                return false;
            }
        }
        if ((i12 & 112) != 0) {
            int i16 = this.f1988d;
            int i17 = this.f1987c;
            if (i16 > i17) {
                i10 = 1;
            } else if (i16 == i17) {
                i10 = 2;
            } else {
                i10 = 4;
            }
            if (((i10 << 4) & i12) == 0) {
                return false;
            }
        }
        if ((i12 & 1792) != 0) {
            int i18 = this.f1989e;
            int i19 = this.f1986b;
            if (i18 > i19) {
                i9 = 1;
            } else if (i18 == i19) {
                i9 = 2;
            } else {
                i9 = 4;
            }
            if (((i9 << 8) & i12) == 0) {
                return false;
            }
        }
        if ((i12 & 28672) != 0) {
            int i20 = this.f1989e;
            int i21 = this.f1987c;
            if (i20 > i21) {
                i13 = 1;
            } else if (i20 != i21) {
                i13 = 4;
            }
            if ((i12 & (i13 << 12)) == 0) {
                return false;
            }
        }
        return true;
    }
}
