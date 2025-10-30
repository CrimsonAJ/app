package U3;

import j3.j0;
import java.util.regex.Pattern;
import l4.AbstractC1566a;

/* renamed from: U3.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0395b {

    /* renamed from: a, reason: collision with root package name */
    public final int f7345a;

    /* renamed from: b, reason: collision with root package name */
    public final String f7346b;

    /* renamed from: c, reason: collision with root package name */
    public final int f7347c;

    /* renamed from: d, reason: collision with root package name */
    public final int f7348d;

    public C0395b(int i9, int i10, int i11, String str) {
        this.f7345a = i9;
        this.f7346b = str;
        this.f7347c = i10;
        this.f7348d = i11;
    }

    public static C0395b a(String str) {
        boolean z9;
        boolean z10;
        int i9 = l4.y.f20553a;
        String[] split = str.split(" ", 2);
        if (split.length == 2) {
            z9 = true;
        } else {
            z9 = false;
        }
        AbstractC1566a.h(z9);
        String str2 = split[0];
        Pattern pattern = y.f7482a;
        try {
            int parseInt = Integer.parseInt(str2);
            int i10 = -1;
            String[] split2 = split[1].trim().split("/", -1);
            if (split2.length >= 2) {
                z10 = true;
            } else {
                z10 = false;
            }
            AbstractC1566a.h(z10);
            String str3 = split2[1];
            try {
                int parseInt2 = Integer.parseInt(str3);
                if (split2.length == 3) {
                    String str4 = split2[2];
                    try {
                        i10 = Integer.parseInt(str4);
                    } catch (NumberFormatException e8) {
                        throw j0.b(str4, e8);
                    }
                }
                return new C0395b(parseInt, parseInt2, i10, split2[0]);
            } catch (NumberFormatException e9) {
                throw j0.b(str3, e9);
            }
        } catch (NumberFormatException e10) {
            throw j0.b(str2, e10);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C0395b.class == obj.getClass()) {
            C0395b c0395b = (C0395b) obj;
            if (this.f7345a == c0395b.f7345a && this.f7346b.equals(c0395b.f7346b) && this.f7347c == c0395b.f7347c && this.f7348d == c0395b.f7348d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((u0.z.c(this.f7346b, (217 + this.f7345a) * 31, 31) + this.f7347c) * 31) + this.f7348d;
    }
}
