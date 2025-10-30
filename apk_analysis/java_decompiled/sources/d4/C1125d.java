package d4;

import android.graphics.Color;
import l4.AbstractC1566a;

/* renamed from: d4.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1125d {

    /* renamed from: a, reason: collision with root package name */
    public final String f16858a;

    /* renamed from: b, reason: collision with root package name */
    public final int f16859b;

    /* renamed from: c, reason: collision with root package name */
    public final Integer f16860c;

    /* renamed from: d, reason: collision with root package name */
    public final Integer f16861d;

    /* renamed from: e, reason: collision with root package name */
    public final float f16862e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f16863f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f16864g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f16865h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f16866i;
    public final int j;

    public C1125d(String str, int i9, Integer num, Integer num2, float f9, boolean z9, boolean z10, boolean z11, boolean z12, int i10) {
        this.f16858a = str;
        this.f16859b = i9;
        this.f16860c = num;
        this.f16861d = num2;
        this.f16862e = f9;
        this.f16863f = z9;
        this.f16864g = z10;
        this.f16865h = z11;
        this.f16866i = z12;
        this.j = i10;
    }

    public static int a(String str) {
        boolean z9;
        try {
            int parseInt = Integer.parseInt(str.trim());
            switch (parseInt) {
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                case 8:
                case 9:
                    z9 = true;
                    break;
                default:
                    z9 = false;
                    break;
            }
            if (z9) {
                return parseInt;
            }
        } catch (NumberFormatException unused) {
        }
        A0.a.y("Ignoring unknown alignment: ", str, "SsaStyle");
        return -1;
    }

    public static boolean b(String str) {
        try {
            int parseInt = Integer.parseInt(str);
            if (parseInt != 1 && parseInt != -1) {
                return false;
            }
            return true;
        } catch (NumberFormatException e8) {
            AbstractC1566a.Q("SsaStyle", "Failed to parse boolean value: '" + str + "'", e8);
            return false;
        }
    }

    public static Integer c(String str) {
        long parseLong;
        boolean z9;
        try {
            if (str.startsWith("&H")) {
                parseLong = Long.parseLong(str.substring(2), 16);
            } else {
                parseLong = Long.parseLong(str);
            }
            if (parseLong <= 4294967295L) {
                z9 = true;
            } else {
                z9 = false;
            }
            AbstractC1566a.h(z9);
            return Integer.valueOf(Color.argb(v4.e.e(((parseLong >> 24) & 255) ^ 255), v4.e.e(parseLong & 255), v4.e.e((parseLong >> 8) & 255), v4.e.e((parseLong >> 16) & 255)));
        } catch (IllegalArgumentException e8) {
            AbstractC1566a.Q("SsaStyle", "Failed to parse color expression: '" + str + "'", e8);
            return null;
        }
    }
}
