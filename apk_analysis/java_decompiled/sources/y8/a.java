package y8;

import x8.C2187g;
import x8.D;
import x8.x;

/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public static final byte[] f25132a;

    static {
        byte[] bytes = "0123456789abcdef".getBytes(W7.a.f7934a);
        kotlin.jvm.internal.h.d(bytes, "getBytes(...)");
        f25132a = bytes;
    }

    public static final boolean a(D d9, int i9, byte[] bArr, int i10) {
        int i11 = d9.f24607c;
        byte[] bArr2 = d9.f24605a;
        for (int i12 = 1; i12 < i10; i12++) {
            if (i9 == i11) {
                d9 = d9.f24610f;
                kotlin.jvm.internal.h.b(d9);
                i9 = d9.f24606b;
                i11 = d9.f24607c;
                bArr2 = d9.f24605a;
            }
            if (bArr2[i9] != bArr[i12]) {
                return false;
            }
            i9++;
        }
        return true;
    }

    public static final String b(C2187g c2187g, long j) {
        kotlin.jvm.internal.h.e(c2187g, "<this>");
        if (j > 0) {
            long j4 = j - 1;
            if (c2187g.O(j4) == 13) {
                String p02 = c2187g.p0(j4, W7.a.f7934a);
                c2187g.n(2L);
                return p02;
            }
        }
        String p03 = c2187g.p0(j, W7.a.f7934a);
        c2187g.n(1L);
        return p03;
    }

    public static final int c(C2187g c2187g, x options, boolean z9) {
        int i9;
        byte[] bArr;
        int i10;
        int i11;
        boolean z10;
        D d9;
        byte[] bArr2;
        int i12;
        kotlin.jvm.internal.h.e(c2187g, "<this>");
        kotlin.jvm.internal.h.e(options, "options");
        D d10 = c2187g.f24643a;
        if (d10 == null) {
            if (!z9) {
                return -1;
            }
            return -2;
        }
        int i13 = d10.f24606b;
        int i14 = d10.f24607c;
        byte[] bArr3 = d10.f24605a;
        D d11 = d10;
        int i15 = -1;
        int i16 = 0;
        loop0: while (true) {
            int i17 = i16 + 1;
            int[] iArr = options.f24684b;
            int i18 = iArr[i16];
            int i19 = i16 + 2;
            int i20 = iArr[i17];
            if (i20 != -1) {
                i15 = i20;
            }
            if (d11 == null) {
                break;
            }
            if (i18 < 0) {
                int i21 = (i18 * (-1)) + i19;
                while (true) {
                    int i22 = i13 + 1;
                    int i23 = i19 + 1;
                    if ((bArr3[i13] & 255) != iArr[i19]) {
                        break loop0;
                    }
                    if (i23 == i21) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (i22 == i14) {
                        kotlin.jvm.internal.h.b(d11);
                        D d12 = d11.f24610f;
                        kotlin.jvm.internal.h.b(d12);
                        i12 = d12.f24606b;
                        int i24 = d12.f24607c;
                        bArr2 = d12.f24605a;
                        if (d12 == d10) {
                            if (!z10) {
                                break loop0;
                            }
                            i14 = i24;
                            d9 = null;
                        } else {
                            d9 = d12;
                            i14 = i24;
                        }
                    } else {
                        d9 = d11;
                        bArr2 = bArr3;
                        i12 = i22;
                    }
                    if (z10) {
                        i9 = iArr[i23];
                        int i25 = i12;
                        i10 = i14;
                        i11 = i25;
                        byte[] bArr4 = bArr2;
                        d11 = d9;
                        bArr = bArr4;
                        break;
                    }
                    i13 = i12;
                    bArr3 = bArr2;
                    d11 = d9;
                    i19 = i23;
                }
            } else {
                int i26 = i13 + 1;
                int i27 = bArr3[i13] & 255;
                int i28 = i19 + i18;
                while (i19 != i28) {
                    if (i27 == iArr[i19]) {
                        i9 = iArr[i19 + i18];
                        if (i26 == i14) {
                            d11 = d11.f24610f;
                            kotlin.jvm.internal.h.b(d11);
                            i11 = d11.f24606b;
                            i10 = d11.f24607c;
                            bArr = d11.f24605a;
                            if (d11 == d10) {
                                d11 = null;
                            }
                        } else {
                            bArr = bArr3;
                            i10 = i14;
                            i11 = i26;
                        }
                        if (i9 >= 0) {
                            return i9;
                        }
                        byte[] bArr5 = bArr;
                        i16 = -i9;
                        i13 = i11;
                        i14 = i10;
                        bArr3 = bArr5;
                    } else {
                        i19++;
                    }
                }
                break loop0;
            }
        }
        if (z9) {
            return -2;
        }
        return i15;
    }
}
