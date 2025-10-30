package l3;

import com.google.android.gms.internal.measurement.AbstractC0953k1;
import j3.j0;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import l4.AbstractC1566a;

/* renamed from: l3.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1552a {

    /* renamed from: a, reason: collision with root package name */
    public static final int[] f20366a = {96000, 88200, 64000, 48000, 44100, 32000, 24000, 22050, 16000, 12000, 11025, 8000, 7350};

    /* renamed from: b, reason: collision with root package name */
    public static final int[] f20367b = {0, 1, 2, 3, 4, 5, 6, 8, -1, -1, -1, 7, 8, -1, 8, -1};

    /* renamed from: c, reason: collision with root package name */
    public static final int[] f20368c = {1, 2, 3, 6};

    /* renamed from: d, reason: collision with root package name */
    public static final int[] f20369d = {48000, 44100, 32000};

    /* renamed from: e, reason: collision with root package name */
    public static final int[] f20370e = {24000, 22050, 16000};

    /* renamed from: f, reason: collision with root package name */
    public static final int[] f20371f = {2, 1, 2, 3, 3, 4, 4, 5};

    /* renamed from: g, reason: collision with root package name */
    public static final int[] f20372g = {32, 40, 48, 56, 64, 80, 96, 112, 128, 160, 192, 224, 256, 320, 384, 448, 512, 576, 640};

    /* renamed from: h, reason: collision with root package name */
    public static final int[] f20373h = {69, 87, 104, 121, 139, 174, 208, 243, 278, 348, 417, 487, 557, 696, 835, 975, 1114, 1253, 1393};

    /* renamed from: i, reason: collision with root package name */
    public static final int[] f20374i = {2002, 2000, 1920, 1601, 1600, 1001, 1000, 960, 800, 800, 480, 400, 400, 2048};
    public static final int[] j = {1, 2, 2, 2, 2, 3, 3, 4, 4, 5, 6, 6, 6, 7, 8, 8};

    /* renamed from: k, reason: collision with root package name */
    public static final int[] f20375k = {-1, 8000, 16000, 32000, -1, -1, 11025, 22050, 44100, -1, -1, 12000, 24000, 48000, -1, -1};

    /* renamed from: l, reason: collision with root package name */
    public static final int[] f20376l = {64, 112, 128, 192, 224, 256, 384, 448, 512, 640, 768, 896, 1024, 1152, 1280, 1536, 1920, 2048, 2304, 2560, 2688, 2816, 2823, 2944, 3072, 3840, 4096, 6144, 7680};

    /* renamed from: m, reason: collision with root package name */
    public static final String[] f20377m = {"audio/mpeg-L1", "audio/mpeg-L2", "audio/mpeg"};

    /* renamed from: n, reason: collision with root package name */
    public static final int[] f20378n = {44100, 48000, 32000};

    /* renamed from: o, reason: collision with root package name */
    public static final int[] f20379o = {32000, 64000, 96000, 128000, 160000, 192000, 224000, 256000, 288000, 320000, 352000, 384000, 416000, 448000};

    /* renamed from: p, reason: collision with root package name */
    public static final int[] f20380p = {32000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 144000, 160000, 176000, 192000, 224000, 256000};

    /* renamed from: q, reason: collision with root package name */
    public static final int[] f20381q = {32000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 160000, 192000, 224000, 256000, 320000, 384000};

    /* renamed from: r, reason: collision with root package name */
    public static final int[] f20382r = {32000, 40000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 160000, 192000, 224000, 256000, 320000};

    /* renamed from: s, reason: collision with root package name */
    public static final int[] f20383s = {8000, 16000, 24000, 32000, 40000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 144000, 160000};

    public static byte[] a(int i9, int i10) {
        int i11 = -1;
        for (int i12 = 0; i12 < 13; i12++) {
            if (i9 == f20366a[i12]) {
                i11 = i12;
            }
        }
        int i13 = -1;
        for (int i14 = 0; i14 < 16; i14++) {
            if (i10 == f20367b[i14]) {
                i13 = i14;
            }
        }
        if (i9 != -1 && i13 != -1) {
            return b(2, i11, i13);
        }
        throw new IllegalArgumentException(A0.a.l("Invalid sample rate or number of channels: ", i9, i10, ", "));
    }

    public static byte[] b(int i9, int i10, int i11) {
        return new byte[]{(byte) (((i9 << 3) & 248) | ((i10 >> 1) & 7)), (byte) (((i10 << 7) & 128) | ((i11 << 3) & 120))};
    }

    public static ArrayList c(byte[] bArr) {
        ArrayList arrayList = new ArrayList(3);
        arrayList.add(bArr);
        arrayList.add(ByteBuffer.allocate(8).order(ByteOrder.nativeOrder()).putLong(((((bArr[11] & 255) << 8) | (bArr[10] & 255)) * 1000000000) / 48000).array());
        arrayList.add(ByteBuffer.allocate(8).order(ByteOrder.nativeOrder()).putLong(80000000L).array());
        return arrayList;
    }

    public static int d(int i9, int i10) {
        int i11 = i10 / 2;
        if (i9 >= 0 && i9 < 3 && i10 >= 0 && i11 < 19) {
            int i12 = f20369d[i9];
            if (i12 == 44100) {
                return ((i10 % 2) + f20373h[i11]) * 2;
            }
            int i13 = f20372g[i11];
            if (i12 == 32000) {
                return i13 * 6;
            }
            return i13 * 4;
        }
        return -1;
    }

    public static void e(int i9, A4.r rVar) {
        rVar.E(7);
        byte[] bArr = (byte[]) rVar.f384c;
        bArr[0] = -84;
        bArr[1] = 64;
        bArr[2] = -1;
        bArr[3] = -1;
        bArr[4] = (byte) ((i9 >> 16) & 255);
        bArr[5] = (byte) ((i9 >> 8) & 255);
        bArr[6] = (byte) (i9 & 255);
    }

    public static int f(int i9) {
        boolean z9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        if ((i9 & (-2097152)) == -2097152) {
            z9 = true;
        } else {
            z9 = false;
        }
        if (z9 && (i10 = (i9 >>> 19) & 3) != 1 && (i11 = (i9 >>> 17) & 3) != 0 && (i12 = (i9 >>> 12) & 15) != 0 && i12 != 15 && (i13 = (i9 >>> 10) & 3) != 3) {
            int i16 = f20378n[i13];
            if (i10 == 2) {
                i16 /= 2;
            } else if (i10 == 0) {
                i16 /= 4;
            }
            int i17 = (i9 >>> 9) & 1;
            if (i11 == 3) {
                if (i10 == 3) {
                    i15 = f20379o[i12 - 1];
                } else {
                    i15 = f20380p[i12 - 1];
                }
                return (((i15 * 12) / i16) + i17) * 4;
            }
            if (i10 == 3) {
                if (i11 == 2) {
                    i14 = f20381q[i12 - 1];
                } else {
                    i14 = f20382r[i12 - 1];
                }
            } else {
                i14 = f20383s[i12 - 1];
            }
            int i18 = 144;
            if (i10 == 3) {
                return ((i14 * 144) / i16) + i17;
            }
            if (i11 == 1) {
                i18 = 72;
            }
            return ((i18 * i14) / i16) + i17;
        }
        return -1;
    }

    /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.Object, l3.b] */
    public static C1553b g(Z3.f fVar) {
        boolean z9;
        String str;
        int d9;
        int i9;
        int i10;
        int i11;
        String str2;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int g9 = fVar.g();
        fVar.r(40);
        if (fVar.i(5) > 10) {
            z9 = true;
        } else {
            z9 = false;
        }
        fVar.o(g9);
        int[] iArr = f20371f;
        int[] iArr2 = f20369d;
        int i19 = -1;
        if (z9) {
            fVar.r(16);
            int i20 = fVar.i(2);
            if (i20 != 0) {
                if (i20 != 1) {
                    if (i20 == 2) {
                        i19 = 2;
                    }
                } else {
                    i19 = 1;
                }
            } else {
                i19 = 0;
            }
            fVar.r(3);
            d9 = (fVar.i(11) + 1) * 2;
            int i21 = fVar.i(2);
            if (i21 == 3) {
                i12 = f20370e[fVar.i(2)];
                i13 = 3;
                i14 = 6;
            } else {
                i13 = fVar.i(2);
                int i22 = f20368c[i13];
                i12 = iArr2[i21];
                i14 = i22;
            }
            i11 = i14 * 256;
            int i23 = fVar.i(3);
            boolean h7 = fVar.h();
            i10 = iArr[i23] + (h7 ? 1 : 0);
            fVar.r(10);
            if (fVar.h()) {
                fVar.r(8);
            }
            if (i23 == 0) {
                fVar.r(5);
                if (fVar.h()) {
                    fVar.r(8);
                }
            }
            if (i19 == 1 && fVar.h()) {
                fVar.r(16);
            }
            if (fVar.h()) {
                if (i23 > 2) {
                    fVar.r(2);
                }
                if ((i23 & 1) != 0 && i23 > 2) {
                    i16 = 6;
                    fVar.r(6);
                } else {
                    i16 = 6;
                }
                if ((i23 & 4) != 0) {
                    fVar.r(i16);
                }
                if (h7 && fVar.h()) {
                    fVar.r(5);
                }
                if (i19 == 0) {
                    if (fVar.h()) {
                        i17 = 6;
                        fVar.r(6);
                    } else {
                        i17 = 6;
                    }
                    if (i23 == 0 && fVar.h()) {
                        fVar.r(i17);
                    }
                    if (fVar.h()) {
                        fVar.r(i17);
                    }
                    int i24 = fVar.i(2);
                    if (i24 == 1) {
                        fVar.r(5);
                        i18 = 2;
                    } else {
                        if (i24 == 2) {
                            fVar.r(12);
                        } else if (i24 == 3) {
                            int i25 = fVar.i(5);
                            if (fVar.h()) {
                                fVar.r(5);
                                if (fVar.h()) {
                                    fVar.r(4);
                                }
                                if (fVar.h()) {
                                    fVar.r(4);
                                }
                                if (fVar.h()) {
                                    fVar.r(4);
                                }
                                if (fVar.h()) {
                                    fVar.r(4);
                                }
                                if (fVar.h()) {
                                    fVar.r(4);
                                }
                                if (fVar.h()) {
                                    fVar.r(4);
                                }
                                if (fVar.h()) {
                                    fVar.r(4);
                                }
                                if (fVar.h()) {
                                    if (fVar.h()) {
                                        fVar.r(4);
                                    }
                                    if (fVar.h()) {
                                        fVar.r(4);
                                    }
                                }
                            }
                            if (fVar.h()) {
                                fVar.r(5);
                                if (fVar.h()) {
                                    fVar.r(7);
                                    if (fVar.h()) {
                                        fVar.r(8);
                                        i18 = 2;
                                        fVar.r((i25 + i18) * 8);
                                        fVar.c();
                                    }
                                }
                            }
                            i18 = 2;
                            fVar.r((i25 + i18) * 8);
                            fVar.c();
                        }
                        i18 = 2;
                    }
                    if (i23 < i18) {
                        if (fVar.h()) {
                            fVar.r(14);
                        }
                        if (i23 == 0 && fVar.h()) {
                            fVar.r(14);
                        }
                    }
                    if (fVar.h()) {
                        if (i13 == 0) {
                            fVar.r(5);
                        } else {
                            for (int i26 = 0; i26 < i14; i26++) {
                                if (fVar.h()) {
                                    fVar.r(5);
                                }
                            }
                        }
                    }
                }
            }
            if (fVar.h()) {
                fVar.r(5);
                if (i23 == 2) {
                    fVar.r(4);
                }
                if (i23 >= 6) {
                    fVar.r(2);
                }
                if (fVar.h()) {
                    fVar.r(8);
                }
                if (i23 == 0 && fVar.h()) {
                    fVar.r(8);
                }
                if (i21 < 3) {
                    fVar.q();
                }
            }
            if (i19 == 0 && i13 != 3) {
                fVar.q();
            }
            if (i19 == 2 && (i13 == 3 || fVar.h())) {
                i15 = 6;
                fVar.r(6);
            } else {
                i15 = 6;
            }
            if (fVar.h() && fVar.i(i15) == 1 && fVar.i(8) == 1) {
                str2 = "audio/eac3-joc";
            } else {
                str2 = "audio/eac3";
            }
        } else {
            fVar.r(32);
            int i27 = fVar.i(2);
            if (i27 == 3) {
                str = null;
            } else {
                str = "audio/ac3";
            }
            d9 = d(i27, fVar.i(6));
            fVar.r(8);
            int i28 = fVar.i(3);
            if ((i28 & 1) != 0 && i28 != 1) {
                i9 = 2;
                fVar.r(2);
            } else {
                i9 = 2;
            }
            if ((i28 & 4) != 0) {
                fVar.r(i9);
            }
            if (i28 == i9) {
                fVar.r(i9);
            }
            if (i27 < 3) {
                i19 = iArr2[i27];
            }
            i10 = iArr[i28] + (fVar.h() ? 1 : 0);
            i11 = 1536;
            str2 = str;
            i12 = i19;
        }
        ?? obj = new Object();
        obj.f20388e = str2;
        obj.f20385b = i10;
        obj.f20384a = i12;
        obj.f20386c = d9;
        obj.f20387d = i11;
        return obj;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0030, code lost:
    
        if (r9.h() != false) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0032, code lost:
    
        r2 = r9.i(10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x003c, code lost:
    
        if (r9.h() == false) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0042, code lost:
    
        if (r9.i(3) <= 0) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0044, code lost:
    
        r9.r(2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0051, code lost:
    
        if (r9.h() == false) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0053, code lost:
    
        r5 = 48000;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0056, code lost:
    
        r9 = r9.i(4);
        r8 = l3.AbstractC1552a.f20374i;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x005c, code lost:
    
        if (r5 != 44100) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0060, code lost:
    
        if (r9 != 13) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0062, code lost:
    
        r9 = r8[r9];
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0098, code lost:
    
        return new O4.d(r5, r0, r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0065, code lost:
    
        if (r5 != 48000) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0069, code lost:
    
        if (r9 >= 14) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x006b, code lost:
    
        r6 = r8[r9];
        r2 = r2 % 5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0072, code lost:
    
        if (r2 == 1) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0076, code lost:
    
        if (r2 == 2) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0078, code lost:
    
        if (r2 == 3) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x007a, code lost:
    
        if (r2 == 4) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x007d, code lost:
    
        if (r9 == 3) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x007f, code lost:
    
        if (r9 == 8) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0081, code lost:
    
        if (r9 != 11) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0083, code lost:
    
        r9 = r6 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0090, code lost:
    
        r9 = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0086, code lost:
    
        if (r9 == 8) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0088, code lost:
    
        if (r9 != 11) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x008b, code lost:
    
        if (r9 == 3) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x008d, code lost:
    
        if (r9 != 8) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0092, code lost:
    
        r9 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0055, code lost:
    
        r5 = 44100;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0027, code lost:
    
        if (r9.i(2) == 3) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0029, code lost:
    
        r9.i(2);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static O4.d h(Z3.f r9) {
        /*
            r0 = 16
            int r1 = r9.i(r0)
            int r0 = r9.i(r0)
            r2 = 65535(0xffff, float:9.1834E-41)
            r3 = 4
            if (r0 != r2) goto L18
            r0 = 24
            int r0 = r9.i(r0)
            r2 = 7
            goto L19
        L18:
            r2 = r3
        L19:
            int r0 = r0 + r2
            r2 = 44097(0xac41, float:6.1793E-41)
            if (r1 != r2) goto L21
            int r0 = r0 + 2
        L21:
            r1 = 2
            int r2 = r9.i(r1)
            r4 = 3
            if (r2 != r4) goto L32
        L29:
            r9.i(r1)
            boolean r2 = r9.h()
            if (r2 != 0) goto L29
        L32:
            r2 = 10
            int r2 = r9.i(r2)
            boolean r5 = r9.h()
            if (r5 == 0) goto L47
            int r5 = r9.i(r4)
            if (r5 <= 0) goto L47
            r9.r(r1)
        L47:
            boolean r5 = r9.h()
            r6 = 44100(0xac44, float:6.1797E-41)
            r7 = 48000(0xbb80, float:6.7262E-41)
            if (r5 == 0) goto L55
            r5 = r7
            goto L56
        L55:
            r5 = r6
        L56:
            int r9 = r9.i(r3)
            int[] r8 = l3.AbstractC1552a.f20374i
            if (r5 != r6) goto L65
            r6 = 13
            if (r9 != r6) goto L65
            r9 = r8[r9]
            goto L93
        L65:
            if (r5 != r7) goto L92
            r6 = 14
            if (r9 >= r6) goto L92
            r6 = r8[r9]
            int r2 = r2 % 5
            r7 = 1
            r8 = 8
            if (r2 == r7) goto L8b
            r7 = 11
            if (r2 == r1) goto L86
            if (r2 == r4) goto L8b
            if (r2 == r3) goto L7d
            goto L90
        L7d:
            if (r9 == r4) goto L83
            if (r9 == r8) goto L83
            if (r9 != r7) goto L90
        L83:
            int r9 = r6 + 1
            goto L93
        L86:
            if (r9 == r8) goto L83
            if (r9 != r7) goto L90
            goto L83
        L8b:
            if (r9 == r4) goto L83
            if (r9 != r8) goto L90
            goto L83
        L90:
            r9 = r6
            goto L93
        L92:
            r9 = 0
        L93:
            O4.d r1 = new O4.d
            r1.<init>(r5, r0, r9)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: l3.AbstractC1552a.h(Z3.f):O4.d");
    }

    public static A4.r i(Z3.f fVar, boolean z9) {
        int i9;
        int i10;
        int i11 = fVar.i(5);
        if (i11 == 31) {
            i11 = fVar.i(6) + 32;
        }
        int i12 = fVar.i(4);
        int[] iArr = f20366a;
        if (i12 == 15) {
            i9 = fVar.i(24);
        } else if (i12 < 13) {
            i9 = iArr[i12];
        } else {
            throw j0.a(null, null);
        }
        int i13 = fVar.i(4);
        String j4 = AbstractC0953k1.j(i11, "mp4a.40.");
        if (i11 == 5 || i11 == 29) {
            int i14 = fVar.i(4);
            if (i14 == 15) {
                i10 = fVar.i(24);
            } else if (i14 < 13) {
                i10 = iArr[i14];
            } else {
                throw j0.a(null, null);
            }
            i9 = i10;
            int i15 = fVar.i(5);
            if (i15 == 31) {
                i15 = fVar.i(6) + 32;
            }
            i11 = i15;
            if (i11 == 22) {
                i13 = fVar.i(4);
            }
        }
        if (z9) {
            if (i11 != 1 && i11 != 2 && i11 != 3 && i11 != 4 && i11 != 6 && i11 != 7 && i11 != 17) {
                switch (i11) {
                    case 19:
                    case 20:
                    case 21:
                    case 22:
                    case 23:
                        break;
                    default:
                        throw j0.c("Unsupported audio object type: " + i11);
                }
            }
            if (fVar.h()) {
                AbstractC1566a.P("AacUtil", "Unexpected frameLengthFlag = 1");
            }
            if (fVar.h()) {
                fVar.r(14);
            }
            boolean h7 = fVar.h();
            if (i13 != 0) {
                if (i11 == 6 || i11 == 20) {
                    fVar.r(3);
                }
                if (h7) {
                    if (i11 == 22) {
                        fVar.r(16);
                    }
                    if (i11 == 17 || i11 == 19 || i11 == 20 || i11 == 23) {
                        fVar.r(3);
                    }
                    fVar.r(1);
                }
                switch (i11) {
                    case 17:
                    case 19:
                    case 20:
                    case 21:
                    case 22:
                    case 23:
                        int i16 = fVar.i(2);
                        if (i16 == 2 || i16 == 3) {
                            throw j0.c("Unsupported epConfig: " + i16);
                        }
                }
            } else {
                throw new UnsupportedOperationException();
            }
        }
        int i17 = f20367b[i13];
        if (i17 != -1) {
            return new A4.r(i9, i17, j4);
        }
        throw j0.a(null, null);
    }

    public static int j(int i9) {
        boolean z9;
        int i10;
        int i11;
        if ((i9 & (-2097152)) == -2097152) {
            z9 = true;
        } else {
            z9 = false;
        }
        if (z9 && (i10 = (i9 >>> 19) & 3) != 1 && (i11 = (i9 >>> 17) & 3) != 0) {
            int i12 = (i9 >>> 12) & 15;
            int i13 = (i9 >>> 10) & 3;
            if (i12 != 0 && i12 != 15 && i13 != 3) {
                if (i11 != 1) {
                    if (i11 != 2) {
                        if (i11 == 3) {
                            return 384;
                        }
                        throw new IllegalArgumentException();
                    }
                    return 1152;
                }
                if (i10 == 3) {
                    return 1152;
                }
                return 576;
            }
            return -1;
        }
        return -1;
    }
}
