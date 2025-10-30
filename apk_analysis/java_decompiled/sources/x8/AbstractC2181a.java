package x8;

/* renamed from: x8.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC2181a {

    /* renamed from: a, reason: collision with root package name */
    public static final byte[] f24626a;

    /* renamed from: b, reason: collision with root package name */
    public static final byte[] f24627b;

    static {
        C2190j c2190j = C2190j.f24645d;
        f24626a = e0.c.D("ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/").f24646a;
        f24627b = e0.c.D("ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789-_").f24646a;
    }

    public static final String a(byte[] bArr, byte[] map) {
        kotlin.jvm.internal.h.e(bArr, "<this>");
        kotlin.jvm.internal.h.e(map, "map");
        byte[] bArr2 = new byte[((bArr.length + 2) / 3) * 4];
        int length = bArr.length - (bArr.length % 3);
        int i9 = 0;
        int i10 = 0;
        while (i9 < length) {
            byte b9 = bArr[i9];
            int i11 = i9 + 2;
            byte b10 = bArr[i9 + 1];
            i9 += 3;
            byte b11 = bArr[i11];
            bArr2[i10] = map[(b9 & 255) >> 2];
            bArr2[i10 + 1] = map[((b9 & 3) << 4) | ((b10 & 255) >> 4)];
            int i12 = i10 + 3;
            bArr2[i10 + 2] = map[((b10 & 15) << 2) | ((b11 & 255) >> 6)];
            i10 += 4;
            bArr2[i12] = map[b11 & 63];
        }
        int length2 = bArr.length - length;
        if (length2 != 1) {
            if (length2 == 2) {
                int i13 = i9 + 1;
                byte b12 = bArr[i9];
                byte b13 = bArr[i13];
                bArr2[i10] = map[(b12 & 255) >> 2];
                bArr2[i10 + 1] = map[((b12 & 3) << 4) | ((b13 & 255) >> 4)];
                bArr2[i10 + 2] = map[(b13 & 15) << 2];
                bArr2[i10 + 3] = 61;
            }
        } else {
            byte b14 = bArr[i9];
            bArr2[i10] = map[(b14 & 255) >> 2];
            bArr2[i10 + 1] = map[(b14 & 3) << 4];
            bArr2[i10 + 2] = 61;
            bArr2[i10 + 3] = 61;
        }
        return new String(bArr2, W7.a.f7934a);
    }
}
