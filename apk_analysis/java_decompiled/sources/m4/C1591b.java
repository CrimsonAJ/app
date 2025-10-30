package m4;

import j3.InterfaceC1453f;
import java.util.Arrays;

/* renamed from: m4.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1591b implements InterfaceC1453f {

    /* renamed from: a, reason: collision with root package name */
    public final int f20723a;

    /* renamed from: b, reason: collision with root package name */
    public final int f20724b;

    /* renamed from: c, reason: collision with root package name */
    public final int f20725c;

    /* renamed from: d, reason: collision with root package name */
    public final byte[] f20726d;

    /* renamed from: e, reason: collision with root package name */
    public int f20727e;

    public C1591b(int i9, int i10, int i11, byte[] bArr) {
        this.f20723a = i9;
        this.f20724b = i10;
        this.f20725c = i11;
        this.f20726d = bArr;
    }

    public static int a(int i9) {
        if (i9 == 1) {
            return 1;
        }
        if (i9 == 9) {
            return 6;
        }
        if (i9 != 4 && i9 != 5 && i9 != 6 && i9 != 7) {
            return -1;
        }
        return 2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C1591b.class == obj.getClass()) {
            C1591b c1591b = (C1591b) obj;
            if (this.f20723a == c1591b.f20723a && this.f20724b == c1591b.f20724b && this.f20725c == c1591b.f20725c && Arrays.equals(this.f20726d, c1591b.f20726d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        if (this.f20727e == 0) {
            this.f20727e = Arrays.hashCode(this.f20726d) + ((((((527 + this.f20723a) * 31) + this.f20724b) * 31) + this.f20725c) * 31);
        }
        return this.f20727e;
    }

    public final String toString() {
        boolean z9;
        StringBuilder sb = new StringBuilder("ColorInfo(");
        sb.append(this.f20723a);
        sb.append(", ");
        sb.append(this.f20724b);
        sb.append(", ");
        sb.append(this.f20725c);
        sb.append(", ");
        if (this.f20726d != null) {
            z9 = true;
        } else {
            z9 = false;
        }
        sb.append(z9);
        sb.append(")");
        return sb.toString();
    }
}
