package I3;

import A4.r;
import B6.u0;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;
import l4.y;

/* loaded from: classes.dex */
public final class i extends v4.e {

    /* renamed from: i, reason: collision with root package name */
    public static final C6.a f3507i = new C6.a(7);

    /* renamed from: h, reason: collision with root package name */
    public final g f3508h;

    public i(g gVar) {
        this.f3508h = gVar;
    }

    public static a b0(r rVar, int i9, int i10) {
        int s02;
        String L8;
        byte[] copyOfRange;
        int x5 = rVar.x();
        String p02 = p0(x5);
        int i11 = i9 - 1;
        byte[] bArr = new byte[i11];
        rVar.h(bArr, 0, i11);
        if (i10 == 2) {
            L8 = "image/" + u0.L(new String(bArr, 0, 3, "ISO-8859-1"));
            if ("image/jpg".equals(L8)) {
                L8 = "image/jpeg";
            }
            s02 = 2;
        } else {
            s02 = s0(0, bArr);
            L8 = u0.L(new String(bArr, 0, s02, "ISO-8859-1"));
            if (L8.indexOf(47) == -1) {
                L8 = "image/".concat(L8);
            }
        }
        int i12 = bArr[s02 + 1] & 255;
        int i13 = s02 + 2;
        int r0 = r0(bArr, i13, x5);
        String str = new String(bArr, i13, r0 - i13, p02);
        int o02 = o0(x5) + r0;
        if (i11 <= o02) {
            copyOfRange = y.f20558f;
        } else {
            copyOfRange = Arrays.copyOfRange(bArr, o02, i11);
        }
        return new a(L8, str, i12, copyOfRange);
    }

    public static c c0(r rVar, int i9, int i10, boolean z9, int i11, g gVar) {
        long j;
        int i12 = rVar.f382a;
        int s02 = s0(i12, (byte[]) rVar.f384c);
        String str = new String((byte[]) rVar.f384c, i12, s02 - i12, "ISO-8859-1");
        rVar.H(s02 + 1);
        int i13 = rVar.i();
        int i14 = rVar.i();
        long y9 = rVar.y();
        if (y9 == 4294967295L) {
            y9 = -1;
        }
        long y10 = rVar.y();
        if (y10 == 4294967295L) {
            j = -1;
        } else {
            j = y10;
        }
        ArrayList arrayList = new ArrayList();
        int i15 = i12 + i9;
        while (rVar.f382a < i15) {
            j f02 = f0(i10, rVar, z9, i11, gVar);
            if (f02 != null) {
                arrayList.add(f02);
            }
        }
        return new c(str, i13, i14, y9, j, (j[]) arrayList.toArray(new j[0]));
    }

    public static d d0(r rVar, int i9, int i10, boolean z9, int i11, g gVar) {
        boolean z10;
        boolean z11;
        int i12 = rVar.f382a;
        int s02 = s0(i12, (byte[]) rVar.f384c);
        String str = new String((byte[]) rVar.f384c, i12, s02 - i12, "ISO-8859-1");
        rVar.H(s02 + 1);
        int x5 = rVar.x();
        if ((x5 & 2) != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if ((x5 & 1) != 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        int x9 = rVar.x();
        String[] strArr = new String[x9];
        for (int i13 = 0; i13 < x9; i13++) {
            int i14 = rVar.f382a;
            int s03 = s0(i14, (byte[]) rVar.f384c);
            strArr[i13] = new String((byte[]) rVar.f384c, i14, s03 - i14, "ISO-8859-1");
            rVar.H(s03 + 1);
        }
        ArrayList arrayList = new ArrayList();
        int i15 = i12 + i9;
        while (rVar.f382a < i15) {
            j f02 = f0(i10, rVar, z9, i11, gVar);
            if (f02 != null) {
                arrayList.add(f02);
            }
        }
        return new d(str, z10, z11, strArr, (j[]) arrayList.toArray(new j[0]));
    }

    public static e e0(int i9, r rVar) {
        if (i9 < 4) {
            return null;
        }
        int x5 = rVar.x();
        String p02 = p0(x5);
        byte[] bArr = new byte[3];
        rVar.h(bArr, 0, 3);
        String str = new String(bArr, 0, 3);
        int i10 = i9 - 4;
        byte[] bArr2 = new byte[i10];
        rVar.h(bArr2, 0, i10);
        int r0 = r0(bArr2, 0, x5);
        String str2 = new String(bArr2, 0, r0, p02);
        int o02 = o0(x5) + r0;
        return new e(str, str2, j0(o02, r0(bArr2, o02, x5), p02, bArr2));
    }

    /* JADX WARN: Code restructure failed: missing block: B:151:0x01a1, code lost:
    
        if (r4 == 67) goto L137;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0226 A[Catch: all -> 0x01fd, UnsupportedEncodingException -> 0x0245, TRY_LEAVE, TryCatch #2 {UnsupportedEncodingException -> 0x0245, blocks: (B:62:0x0226, B:138:0x01f8, B:146:0x020f, B:147:0x0214), top: B:52:0x0112 }] */
    /* JADX WARN: Type inference failed for: r13v0 */
    /* JADX WARN: Type inference failed for: r13v1 */
    /* JADX WARN: Type inference failed for: r13v13 */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v13, types: [A4.r] */
    /* JADX WARN: Type inference failed for: r1v14 */
    /* JADX WARN: Type inference failed for: r1v20 */
    /* JADX WARN: Type inference failed for: r1v21 */
    /* JADX WARN: Type inference failed for: r1v22, types: [A4.r] */
    /* JADX WARN: Type inference failed for: r1v23 */
    /* JADX WARN: Type inference failed for: r1v25 */
    /* JADX WARN: Type inference failed for: r1v33 */
    /* JADX WARN: Type inference failed for: r1v34 */
    /* JADX WARN: Type inference failed for: r1v35 */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v6, types: [int] */
    /* JADX WARN: Type inference failed for: r1v8 */
    /* JADX WARN: Type inference failed for: r1v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static I3.j f0(int r20, A4.r r21, boolean r22, int r23, I3.g r24) {
        /*
            Method dump skipped, instructions count: 603
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: I3.i.f0(int, A4.r, boolean, int, I3.g):I3.j");
    }

    public static f g0(int i9, r rVar) {
        byte[] copyOfRange;
        int x5 = rVar.x();
        String p02 = p0(x5);
        int i10 = i9 - 1;
        byte[] bArr = new byte[i10];
        rVar.h(bArr, 0, i10);
        int s02 = s0(0, bArr);
        String str = new String(bArr, 0, s02, "ISO-8859-1");
        int i11 = s02 + 1;
        int r0 = r0(bArr, i11, x5);
        String j02 = j0(i11, r0, p02, bArr);
        int o02 = o0(x5) + r0;
        int r02 = r0(bArr, o02, x5);
        String j03 = j0(o02, r02, p02, bArr);
        int o03 = o0(x5) + r02;
        if (i10 <= o03) {
            copyOfRange = y.f20558f;
        } else {
            copyOfRange = Arrays.copyOfRange(bArr, o03, i10);
        }
        return new f(str, j02, j03, copyOfRange);
    }

    public static l h0(int i9, r rVar) {
        int C8 = rVar.C();
        int z9 = rVar.z();
        int z10 = rVar.z();
        int x5 = rVar.x();
        int x9 = rVar.x();
        Z3.f fVar = new Z3.f();
        fVar.n(rVar.f383b, (byte[]) rVar.f384c);
        fVar.o(rVar.f382a * 8);
        int i10 = ((i9 - 10) * 8) / (x5 + x9);
        int[] iArr = new int[i10];
        int[] iArr2 = new int[i10];
        for (int i11 = 0; i11 < i10; i11++) {
            int i12 = fVar.i(x5);
            int i13 = fVar.i(x9);
            iArr[i11] = i12;
            iArr2[i11] = i13;
        }
        return new l(C8, z9, z10, iArr, iArr2);
    }

    public static m i0(int i9, r rVar) {
        byte[] copyOfRange;
        byte[] bArr = new byte[i9];
        rVar.h(bArr, 0, i9);
        int s02 = s0(0, bArr);
        String str = new String(bArr, 0, s02, "ISO-8859-1");
        int i10 = s02 + 1;
        if (i9 <= i10) {
            copyOfRange = y.f20558f;
        } else {
            copyOfRange = Arrays.copyOfRange(bArr, i10, i9);
        }
        return new m(str, copyOfRange);
    }

    public static String j0(int i9, int i10, String str, byte[] bArr) {
        if (i10 > i9 && i10 <= bArr.length) {
            return new String(bArr, i9, i10 - i9, str);
        }
        return "";
    }

    public static n k0(int i9, r rVar, String str) {
        if (i9 < 1) {
            return null;
        }
        int x5 = rVar.x();
        String p02 = p0(x5);
        int i10 = i9 - 1;
        byte[] bArr = new byte[i10];
        rVar.h(bArr, 0, i10);
        return new n(str, null, new String(bArr, 0, r0(bArr, 0, x5), p02));
    }

    public static n l0(int i9, r rVar) {
        if (i9 < 1) {
            return null;
        }
        int x5 = rVar.x();
        String p02 = p0(x5);
        int i10 = i9 - 1;
        byte[] bArr = new byte[i10];
        rVar.h(bArr, 0, i10);
        int r0 = r0(bArr, 0, x5);
        String str = new String(bArr, 0, r0, p02);
        int o02 = o0(x5) + r0;
        return new n("TXXX", str, j0(o02, r0(bArr, o02, x5), p02, bArr));
    }

    public static o m0(int i9, r rVar, String str) {
        byte[] bArr = new byte[i9];
        rVar.h(bArr, 0, i9);
        return new o(str, null, new String(bArr, 0, s0(0, bArr), "ISO-8859-1"));
    }

    public static o n0(int i9, r rVar) {
        if (i9 < 1) {
            return null;
        }
        int x5 = rVar.x();
        String p02 = p0(x5);
        int i10 = i9 - 1;
        byte[] bArr = new byte[i10];
        rVar.h(bArr, 0, i10);
        int r0 = r0(bArr, 0, x5);
        String str = new String(bArr, 0, r0, p02);
        int o02 = o0(x5) + r0;
        return new o("WXXX", str, j0(o02, s0(o02, bArr), "ISO-8859-1", bArr));
    }

    public static int o0(int i9) {
        if (i9 != 0 && i9 != 3) {
            return 2;
        }
        return 1;
    }

    public static String p0(int i9) {
        if (i9 != 1) {
            if (i9 != 2) {
                if (i9 != 3) {
                    return "ISO-8859-1";
                }
                return "UTF-8";
            }
            return "UTF-16BE";
        }
        return "UTF-16";
    }

    public static String q0(int i9, int i10, int i11, int i12, int i13) {
        if (i9 == 2) {
            return String.format(Locale.US, "%c%c%c", Integer.valueOf(i10), Integer.valueOf(i11), Integer.valueOf(i12));
        }
        return String.format(Locale.US, "%c%c%c%c", Integer.valueOf(i10), Integer.valueOf(i11), Integer.valueOf(i12), Integer.valueOf(i13));
    }

    public static int r0(byte[] bArr, int i9, int i10) {
        int s02 = s0(i9, bArr);
        if (i10 != 0 && i10 != 3) {
            while (s02 < bArr.length - 1) {
                if ((s02 - i9) % 2 == 0 && bArr[s02 + 1] == 0) {
                    return s02;
                }
                s02 = s0(s02 + 1, bArr);
            }
            return bArr.length;
        }
        return s02;
    }

    public static int s0(int i9, byte[] bArr) {
        while (i9 < bArr.length) {
            if (bArr[i9] == 0) {
                return i9;
            }
            i9++;
        }
        return bArr.length;
    }

    public static int t0(int i9, r rVar) {
        byte[] bArr = (byte[]) rVar.f384c;
        int i10 = rVar.f382a;
        int i11 = i10;
        while (true) {
            int i12 = i11 + 1;
            if (i12 < i10 + i9) {
                if ((bArr[i11] & 255) == 255 && bArr[i12] == 0) {
                    System.arraycopy(bArr, i11 + 2, bArr, i12, (i9 - (i11 - i10)) - 2);
                    i9--;
                }
                i11 = i12;
            } else {
                return i9;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0077, code lost:
    
        if ((r10 & 1) != 0) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x007a, code lost:
    
        r4 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0087, code lost:
    
        if ((r10 & 128) != 0) goto L45;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean u0(A4.r r18, int r19, int r20, boolean r21) {
        /*
            r1 = r18
            r0 = r19
            int r2 = r1.f382a
        L6:
            int r3 = r1.e()     // Catch: java.lang.Throwable -> L20
            r4 = 1
            r5 = r20
            if (r3 < r5) goto Lac
            r3 = 3
            r6 = 0
            if (r0 < r3) goto L23
            int r7 = r1.i()     // Catch: java.lang.Throwable -> L20
            long r8 = r1.y()     // Catch: java.lang.Throwable -> L20
            int r10 = r1.C()     // Catch: java.lang.Throwable -> L20
            goto L2d
        L20:
            r0 = move-exception
            goto Lb0
        L23:
            int r7 = r1.z()     // Catch: java.lang.Throwable -> L20
            int r8 = r1.z()     // Catch: java.lang.Throwable -> L20
            long r8 = (long) r8
            r10 = r6
        L2d:
            r11 = 0
            if (r7 != 0) goto L3b
            int r7 = (r8 > r11 ? 1 : (r8 == r11 ? 0 : -1))
            if (r7 != 0) goto L3b
            if (r10 != 0) goto L3b
            r1.H(r2)
            return r4
        L3b:
            r7 = 4
            if (r0 != r7) goto L6c
            if (r21 != 0) goto L6c
            r13 = 8421504(0x808080, double:4.160776E-317)
            long r13 = r13 & r8
            int r11 = (r13 > r11 ? 1 : (r13 == r11 ? 0 : -1))
            if (r11 == 0) goto L4c
            r1.H(r2)
            return r6
        L4c:
            r11 = 255(0xff, double:1.26E-321)
            long r13 = r8 & r11
            r15 = 8
            long r15 = r8 >> r15
            long r15 = r15 & r11
            r17 = 7
            long r15 = r15 << r17
            long r13 = r13 | r15
            r15 = 16
            long r15 = r8 >> r15
            long r15 = r15 & r11
            r17 = 14
            long r15 = r15 << r17
            long r13 = r13 | r15
            r15 = 24
            long r8 = r8 >> r15
            long r8 = r8 & r11
            r11 = 21
            long r8 = r8 << r11
            long r8 = r8 | r13
        L6c:
            if (r0 != r7) goto L7c
            r3 = r10 & 64
            if (r3 == 0) goto L74
            r3 = r4
            goto L75
        L74:
            r3 = r6
        L75:
            r7 = r10 & 1
            if (r7 == 0) goto L7a
            goto L8c
        L7a:
            r4 = r6
            goto L8c
        L7c:
            if (r0 != r3) goto L8a
            r3 = r10 & 32
            if (r3 == 0) goto L84
            r3 = r4
            goto L85
        L84:
            r3 = r6
        L85:
            r7 = r10 & 128(0x80, float:1.794E-43)
            if (r7 == 0) goto L7a
            goto L8c
        L8a:
            r3 = r6
            r4 = r3
        L8c:
            if (r4 == 0) goto L90
            int r3 = r3 + 4
        L90:
            long r3 = (long) r3
            int r3 = (r8 > r3 ? 1 : (r8 == r3 ? 0 : -1))
            if (r3 >= 0) goto L99
            r1.H(r2)
            return r6
        L99:
            int r3 = r1.e()     // Catch: java.lang.Throwable -> L20
            long r3 = (long) r3
            int r3 = (r3 > r8 ? 1 : (r3 == r8 ? 0 : -1))
            if (r3 >= 0) goto La6
            r1.H(r2)
            return r6
        La6:
            int r3 = (int) r8
            r1.I(r3)     // Catch: java.lang.Throwable -> L20
            goto L6
        Lac:
            r1.H(r2)
            return r4
        Lb0:
            r1.H(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: I3.i.u0(A4.r, int, int, boolean):boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x009b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x009c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final D3.c a0(int r13, byte[] r14) {
        /*
            Method dump skipped, instructions count: 223
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: I3.i.a0(int, byte[]):D3.c");
    }

    @Override // v4.e
    public final D3.c j(D3.e eVar, ByteBuffer byteBuffer) {
        return a0(byteBuffer.limit(), byteBuffer.array());
    }
}
