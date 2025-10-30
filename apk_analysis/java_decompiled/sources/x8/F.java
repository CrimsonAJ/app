package x8;

import java.security.MessageDigest;

/* loaded from: classes.dex */
public final class F extends C2190j {

    /* renamed from: e, reason: collision with root package name */
    public final transient byte[][] f24615e;

    /* renamed from: f, reason: collision with root package name */
    public final transient int[] f24616f;

    public F(byte[][] bArr, int[] iArr) {
        super(C2190j.f24645d.f24646a);
        this.f24615e = bArr;
        this.f24616f = iArr;
    }

    @Override // x8.C2190j
    public final String a() {
        return t().a();
    }

    @Override // x8.C2190j
    public final C2190j c(String str) {
        MessageDigest messageDigest = MessageDigest.getInstance(str);
        byte[][] bArr = this.f24615e;
        int length = bArr.length;
        int i9 = 0;
        int i10 = 0;
        while (i9 < length) {
            int[] iArr = this.f24616f;
            int i11 = iArr[length + i9];
            int i12 = iArr[i9];
            messageDigest.update(bArr[i9], i11, i12 - i10);
            i9++;
            i10 = i12;
        }
        byte[] digest = messageDigest.digest();
        kotlin.jvm.internal.h.b(digest);
        return new C2190j(digest);
    }

    @Override // x8.C2190j
    public final int d() {
        return this.f24616f[this.f24615e.length - 1];
    }

    @Override // x8.C2190j
    public final String e() {
        return t().e();
    }

    @Override // x8.C2190j
    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof C2190j) {
                C2190j c2190j = (C2190j) obj;
                if (c2190j.d() == d() && m(0, c2190j, d())) {
                    return true;
                }
            }
            return false;
        }
        return true;
    }

    @Override // x8.C2190j
    public final int f(int i9, byte[] other) {
        kotlin.jvm.internal.h.e(other, "other");
        return t().f(i9, other);
    }

    @Override // x8.C2190j
    public final byte[] h() {
        return s();
    }

    @Override // x8.C2190j
    public final int hashCode() {
        int i9 = this.f24647b;
        if (i9 != 0) {
            return i9;
        }
        byte[][] bArr = this.f24615e;
        int length = bArr.length;
        int i10 = 0;
        int i11 = 1;
        int i12 = 0;
        while (i10 < length) {
            int[] iArr = this.f24616f;
            int i13 = iArr[length + i10];
            int i14 = iArr[i10];
            byte[] bArr2 = bArr[i10];
            int i15 = (i14 - i12) + i13;
            while (i13 < i15) {
                i11 = (i11 * 31) + bArr2[i13];
                i13++;
            }
            i10++;
            i12 = i14;
        }
        this.f24647b = i11;
        return i11;
    }

    @Override // x8.C2190j
    public final byte i(int i9) {
        int i10;
        byte[][] bArr = this.f24615e;
        int length = bArr.length - 1;
        int[] iArr = this.f24616f;
        s8.n.f(iArr[length], i9, 1L);
        int g9 = y8.b.g(this, i9);
        if (g9 == 0) {
            i10 = 0;
        } else {
            i10 = iArr[g9 - 1];
        }
        return bArr[g9][(i9 - i10) + iArr[bArr.length + g9]];
    }

    @Override // x8.C2190j
    public final int j(byte[] other) {
        kotlin.jvm.internal.h.e(other, "other");
        return t().j(other);
    }

    @Override // x8.C2190j
    public final boolean l(int i9, int i10, int i11, byte[] other) {
        int i12;
        kotlin.jvm.internal.h.e(other, "other");
        if (i9 < 0 || i9 > d() - i11 || i10 < 0 || i10 > other.length - i11) {
            return false;
        }
        int i13 = i11 + i9;
        int g9 = y8.b.g(this, i9);
        while (i9 < i13) {
            int[] iArr = this.f24616f;
            if (g9 == 0) {
                i12 = 0;
            } else {
                i12 = iArr[g9 - 1];
            }
            int i14 = iArr[g9] - i12;
            byte[][] bArr = this.f24615e;
            int i15 = iArr[bArr.length + g9];
            int min = Math.min(i13, i14 + i12) - i9;
            if (!s8.n.a((i9 - i12) + i15, i10, min, bArr[g9], other)) {
                return false;
            }
            i10 += min;
            i9 += min;
            g9++;
        }
        return true;
    }

    @Override // x8.C2190j
    public final boolean m(int i9, C2190j other, int i10) {
        int i11;
        kotlin.jvm.internal.h.e(other, "other");
        if (i9 >= 0 && i9 <= d() - i10) {
            int i12 = i10 + i9;
            int g9 = y8.b.g(this, i9);
            int i13 = 0;
            while (i9 < i12) {
                int[] iArr = this.f24616f;
                if (g9 == 0) {
                    i11 = 0;
                } else {
                    i11 = iArr[g9 - 1];
                }
                int i14 = iArr[g9] - i11;
                byte[][] bArr = this.f24615e;
                int i15 = iArr[bArr.length + g9];
                int min = Math.min(i12, i14 + i11) - i9;
                if (other.l(i13, (i9 - i11) + i15, min, bArr[g9])) {
                    i13 += min;
                    i9 += min;
                    g9++;
                }
            }
            return true;
        }
        return false;
    }

    @Override // x8.C2190j
    public final C2190j n(int i9, int i10) {
        if (i10 == -1234567890) {
            i10 = d();
        }
        if (i9 >= 0) {
            if (i10 <= d()) {
                int i11 = i10 - i9;
                if (i11 >= 0) {
                    if (i9 == 0 && i10 == d()) {
                        return this;
                    }
                    if (i9 == i10) {
                        return C2190j.f24645d;
                    }
                    int g9 = y8.b.g(this, i9);
                    int g10 = y8.b.g(this, i10 - 1);
                    byte[][] bArr = this.f24615e;
                    byte[][] bArr2 = (byte[][]) B7.j.h0(bArr, g9, g10 + 1);
                    int[] iArr = new int[bArr2.length * 2];
                    int i12 = 0;
                    int[] iArr2 = this.f24616f;
                    if (g9 <= g10) {
                        int i13 = g9;
                        int i14 = 0;
                        while (true) {
                            iArr[i14] = Math.min(iArr2[i13] - i9, i11);
                            int i15 = i14 + 1;
                            iArr[i14 + bArr2.length] = iArr2[bArr.length + i13];
                            if (i13 == g10) {
                                break;
                            }
                            i13++;
                            i14 = i15;
                        }
                    }
                    if (g9 != 0) {
                        i12 = iArr2[g9 - 1];
                    }
                    int length = bArr2.length;
                    iArr[length] = (i9 - i12) + iArr[length];
                    return new F(bArr2, iArr);
                }
                throw new IllegalArgumentException(A0.a.l("endIndex=", i10, i9, " < beginIndex=").toString());
            }
            StringBuilder p9 = A0.a.p("endIndex=", i10, " > length(");
            p9.append(d());
            p9.append(')');
            throw new IllegalArgumentException(p9.toString().toString());
        }
        throw new IllegalArgumentException(A0.a.m("beginIndex=", i9, " < 0").toString());
    }

    @Override // x8.C2190j
    public final C2190j p() {
        return t().p();
    }

    @Override // x8.C2190j
    public final void r(C2187g buffer, int i9) {
        int i10;
        kotlin.jvm.internal.h.e(buffer, "buffer");
        int g9 = y8.b.g(this, 0);
        int i11 = 0;
        while (i11 < i9) {
            int[] iArr = this.f24616f;
            if (g9 == 0) {
                i10 = 0;
            } else {
                i10 = iArr[g9 - 1];
            }
            int i12 = iArr[g9] - i10;
            byte[][] bArr = this.f24615e;
            int i13 = iArr[bArr.length + g9];
            int min = Math.min(i9, i12 + i10) - i11;
            int i14 = (i11 - i10) + i13;
            D d9 = new D(bArr[g9], i14, i14 + min, true);
            D d10 = buffer.f24643a;
            if (d10 == null) {
                d9.f24611g = d9;
                d9.f24610f = d9;
                buffer.f24643a = d9;
            } else {
                D d11 = d10.f24611g;
                kotlin.jvm.internal.h.b(d11);
                d11.b(d9);
            }
            i11 += min;
            g9++;
        }
        buffer.f24644b += i9;
    }

    public final byte[] s() {
        byte[] bArr = new byte[d()];
        byte[][] bArr2 = this.f24615e;
        int length = bArr2.length;
        int i9 = 0;
        int i10 = 0;
        int i11 = 0;
        while (i9 < length) {
            int[] iArr = this.f24616f;
            int i12 = iArr[length + i9];
            int i13 = iArr[i9];
            int i14 = i13 - i10;
            B7.j.c0(i11, i12, i12 + i14, bArr2[i9], bArr);
            i11 += i14;
            i9++;
            i10 = i13;
        }
        return bArr;
    }

    public final C2190j t() {
        return new C2190j(s());
    }

    @Override // x8.C2190j
    public final String toString() {
        return t().toString();
    }
}
