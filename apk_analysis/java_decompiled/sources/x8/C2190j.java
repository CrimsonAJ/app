package x8;

import java.io.Serializable;
import java.security.MessageDigest;
import java.util.Arrays;

/* renamed from: x8.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C2190j implements Serializable, Comparable {

    /* renamed from: d, reason: collision with root package name */
    public static final C2190j f24645d = new C2190j(new byte[0]);

    /* renamed from: a, reason: collision with root package name */
    public final byte[] f24646a;

    /* renamed from: b, reason: collision with root package name */
    public transient int f24647b;

    /* renamed from: c, reason: collision with root package name */
    public transient String f24648c;

    public C2190j(byte[] data) {
        kotlin.jvm.internal.h.e(data, "data");
        this.f24646a = data;
    }

    public static int g(C2190j c2190j, C2190j other) {
        c2190j.getClass();
        kotlin.jvm.internal.h.e(other, "other");
        return c2190j.f(0, other.f24646a);
    }

    public static int k(C2190j c2190j, C2190j other) {
        c2190j.getClass();
        kotlin.jvm.internal.h.e(other, "other");
        return c2190j.j(other.f24646a);
    }

    public static /* synthetic */ C2190j o(C2190j c2190j, int i9, int i10, int i11) {
        if ((i11 & 1) != 0) {
            i9 = 0;
        }
        if ((i11 & 2) != 0) {
            i10 = -1234567890;
        }
        return c2190j.n(i9, i10);
    }

    public String a() {
        return AbstractC2181a.a(this.f24646a, AbstractC2181a.f24627b);
    }

    @Override // java.lang.Comparable
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final int compareTo(C2190j other) {
        kotlin.jvm.internal.h.e(other, "other");
        int d9 = d();
        int d10 = other.d();
        int min = Math.min(d9, d10);
        for (int i9 = 0; i9 < min; i9++) {
            int i10 = i(i9) & 255;
            int i11 = other.i(i9) & 255;
            if (i10 != i11) {
                if (i10 < i11) {
                    return -1;
                }
                return 1;
            }
        }
        if (d9 == d10) {
            return 0;
        }
        if (d9 < d10) {
            return -1;
        }
        return 1;
    }

    public C2190j c(String str) {
        MessageDigest messageDigest = MessageDigest.getInstance(str);
        messageDigest.update(this.f24646a, 0, d());
        byte[] digest = messageDigest.digest();
        kotlin.jvm.internal.h.b(digest);
        return new C2190j(digest);
    }

    public int d() {
        return this.f24646a.length;
    }

    public String e() {
        byte[] bArr = this.f24646a;
        char[] cArr = new char[bArr.length * 2];
        int i9 = 0;
        for (byte b9 : bArr) {
            int i10 = i9 + 1;
            char[] cArr2 = y8.b.f25133a;
            cArr[i9] = cArr2[(b9 >> 4) & 15];
            i9 += 2;
            cArr[i10] = cArr2[b9 & 15];
        }
        return new String(cArr);
    }

    public boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof C2190j) {
                C2190j c2190j = (C2190j) obj;
                int d9 = c2190j.d();
                byte[] bArr = this.f24646a;
                if (d9 == bArr.length && c2190j.l(0, 0, bArr.length, bArr)) {
                    return true;
                }
            }
            return false;
        }
        return true;
    }

    public int f(int i9, byte[] other) {
        kotlin.jvm.internal.h.e(other, "other");
        byte[] bArr = this.f24646a;
        int length = bArr.length - other.length;
        int max = Math.max(i9, 0);
        if (max <= length) {
            while (!s8.n.a(max, 0, other.length, bArr, other)) {
                if (max != length) {
                    max++;
                } else {
                    return -1;
                }
            }
            return max;
        }
        return -1;
    }

    public byte[] h() {
        return this.f24646a;
    }

    public int hashCode() {
        int i9 = this.f24647b;
        if (i9 != 0) {
            return i9;
        }
        int hashCode = Arrays.hashCode(this.f24646a);
        this.f24647b = hashCode;
        return hashCode;
    }

    public byte i(int i9) {
        return this.f24646a[i9];
    }

    public int j(byte[] other) {
        kotlin.jvm.internal.h.e(other, "other");
        int d9 = d();
        byte[] bArr = this.f24646a;
        for (int min = Math.min(d9, bArr.length - other.length); -1 < min; min--) {
            if (s8.n.a(min, 0, other.length, bArr, other)) {
                return min;
            }
        }
        return -1;
    }

    public boolean l(int i9, int i10, int i11, byte[] other) {
        kotlin.jvm.internal.h.e(other, "other");
        if (i9 >= 0) {
            byte[] bArr = this.f24646a;
            if (i9 <= bArr.length - i11 && i10 >= 0 && i10 <= other.length - i11 && s8.n.a(i9, i10, i11, bArr, other)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public boolean m(int i9, C2190j other, int i10) {
        kotlin.jvm.internal.h.e(other, "other");
        return other.l(0, i9, i10, this.f24646a);
    }

    public C2190j n(int i9, int i10) {
        if (i10 == -1234567890) {
            i10 = d();
        }
        if (i9 >= 0) {
            byte[] bArr = this.f24646a;
            if (i10 <= bArr.length) {
                if (i10 - i9 >= 0) {
                    if (i9 == 0 && i10 == bArr.length) {
                        return this;
                    }
                    return new C2190j(B7.j.g0(bArr, i9, i10));
                }
                throw new IllegalArgumentException("endIndex < beginIndex");
            }
            throw new IllegalArgumentException(("endIndex > length(" + bArr.length + ')').toString());
        }
        throw new IllegalArgumentException("beginIndex < 0");
    }

    public C2190j p() {
        int i9 = 0;
        while (true) {
            byte[] bArr = this.f24646a;
            if (i9 < bArr.length) {
                byte b9 = bArr[i9];
                if (b9 >= 65 && b9 <= 90) {
                    byte[] copyOf = Arrays.copyOf(bArr, bArr.length);
                    kotlin.jvm.internal.h.d(copyOf, "copyOf(...)");
                    copyOf[i9] = (byte) (b9 + 32);
                    for (int i10 = i9 + 1; i10 < copyOf.length; i10++) {
                        byte b10 = copyOf[i10];
                        if (b10 >= 65 && b10 <= 90) {
                            copyOf[i10] = (byte) (b10 + 32);
                        }
                    }
                    return new C2190j(copyOf);
                }
                i9++;
            } else {
                return this;
            }
        }
    }

    public final String q() {
        String str = this.f24648c;
        if (str == null) {
            byte[] h7 = h();
            kotlin.jvm.internal.h.e(h7, "<this>");
            String str2 = new String(h7, W7.a.f7934a);
            this.f24648c = str2;
            return str2;
        }
        return str;
    }

    public void r(C2187g buffer, int i9) {
        kotlin.jvm.internal.h.e(buffer, "buffer");
        buffer.u0(this.f24646a, 0, i9);
    }

    /* JADX WARN: Code restructure failed: missing block: B:107:0x00ee, code lost:
    
        if (r6 == 64) goto L183;
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x0128, code lost:
    
        if (r6 == 64) goto L183;
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x012c, code lost:
    
        if (r6 == 64) goto L183;
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x00ce, code lost:
    
        if (r6 == 64) goto L183;
     */
    /* JADX WARN: Code restructure failed: missing block: B:129:0x016b, code lost:
    
        if (r6 == 64) goto L183;
     */
    /* JADX WARN: Code restructure failed: missing block: B:156:0x0172, code lost:
    
        if (r6 == 64) goto L183;
     */
    /* JADX WARN: Code restructure failed: missing block: B:158:0x0164, code lost:
    
        if (r6 == 64) goto L183;
     */
    /* JADX WARN: Code restructure failed: missing block: B:160:0x01a2, code lost:
    
        if (r6 == 64) goto L183;
     */
    /* JADX WARN: Code restructure failed: missing block: B:162:0x01a5, code lost:
    
        if (r6 == 64) goto L183;
     */
    /* JADX WARN: Code restructure failed: missing block: B:164:0x01a8, code lost:
    
        if (r6 == 64) goto L183;
     */
    /* JADX WARN: Code restructure failed: missing block: B:166:0x0138, code lost:
    
        if (r6 == 64) goto L183;
     */
    /* JADX WARN: Code restructure failed: missing block: B:168:0x01ab, code lost:
    
        if (r6 == 64) goto L183;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x008e, code lost:
    
        if (r6 == 64) goto L183;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x00bc, code lost:
    
        if (r6 == 64) goto L183;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x007d, code lost:
    
        if (r6 == 64) goto L183;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x00f6, code lost:
    
        if (r6 == 64) goto L183;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.String toString() {
        /*
            Method dump skipped, instructions count: 629
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: x8.C2190j.toString():java.lang.String");
    }
}
