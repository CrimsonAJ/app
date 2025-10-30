package a4;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import l4.y;

/* renamed from: a4.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0500i {

    /* renamed from: h, reason: collision with root package name */
    public static final byte[] f9149h = {0, 7, 8, 15};

    /* renamed from: i, reason: collision with root package name */
    public static final byte[] f9150i = {0, 119, -120, -1};
    public static final byte[] j = {0, 17, 34, 51, 68, 85, 102, 119, -120, -103, -86, -69, -52, -35, -18, -1};

    /* renamed from: a, reason: collision with root package name */
    public final Paint f9151a;

    /* renamed from: b, reason: collision with root package name */
    public final Paint f9152b;

    /* renamed from: c, reason: collision with root package name */
    public final Canvas f9153c;

    /* renamed from: d, reason: collision with root package name */
    public final C0494c f9154d;

    /* renamed from: e, reason: collision with root package name */
    public final C0493b f9155e;

    /* renamed from: f, reason: collision with root package name */
    public final C0499h f9156f;

    /* renamed from: g, reason: collision with root package name */
    public Bitmap f9157g;

    public C0500i(int i9, int i10) {
        Paint paint = new Paint();
        this.f9151a = paint;
        paint.setStyle(Paint.Style.FILL_AND_STROKE);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC));
        paint.setPathEffect(null);
        Paint paint2 = new Paint();
        this.f9152b = paint2;
        paint2.setStyle(Paint.Style.FILL);
        paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OVER));
        paint2.setPathEffect(null);
        this.f9153c = new Canvas();
        this.f9154d = new C0494c(719, 575, 0, 719, 0, 575);
        this.f9155e = new C0493b(0, new int[]{0, -1, -16777216, -8421505}, b(), c());
        this.f9156f = new C0499h(i9, i10);
    }

    public static byte[] a(int i9, int i10, Z3.f fVar) {
        byte[] bArr = new byte[i9];
        for (int i11 = 0; i11 < i9; i11++) {
            bArr[i11] = (byte) fVar.i(i10);
        }
        return bArr;
    }

    public static int[] b() {
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int[] iArr = new int[16];
        iArr[0] = 0;
        for (int i14 = 1; i14 < 16; i14++) {
            if (i14 < 8) {
                if ((i14 & 1) != 0) {
                    i11 = 255;
                } else {
                    i11 = 0;
                }
                if ((i14 & 2) != 0) {
                    i12 = 255;
                } else {
                    i12 = 0;
                }
                if ((i14 & 4) != 0) {
                    i13 = 255;
                } else {
                    i13 = 0;
                }
                iArr[i14] = d(255, i11, i12, i13);
            } else {
                int i15 = 127;
                if ((i14 & 1) != 0) {
                    i9 = 127;
                } else {
                    i9 = 0;
                }
                if ((i14 & 2) != 0) {
                    i10 = 127;
                } else {
                    i10 = 0;
                }
                if ((i14 & 4) == 0) {
                    i15 = 0;
                }
                iArr[i14] = d(255, i9, i10, i15);
            }
        }
        return iArr;
    }

    public static int[] c() {
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        int i23;
        int i24;
        int i25;
        int i26;
        int[] iArr = new int[256];
        iArr[0] = 0;
        for (int i27 = 0; i27 < 256; i27++) {
            int i28 = 255;
            if (i27 < 8) {
                if ((i27 & 1) != 0) {
                    i25 = 255;
                } else {
                    i25 = 0;
                }
                if ((i27 & 2) != 0) {
                    i26 = 255;
                } else {
                    i26 = 0;
                }
                if ((i27 & 4) == 0) {
                    i28 = 0;
                }
                iArr[i27] = d(63, i25, i26, i28);
            } else {
                int i29 = i27 & 136;
                int i30 = 170;
                int i31 = 85;
                if (i29 != 0) {
                    if (i29 != 8) {
                        int i32 = 43;
                        if (i29 != 128) {
                            if (i29 == 136) {
                                if ((i27 & 1) != 0) {
                                    i21 = 43;
                                } else {
                                    i21 = 0;
                                }
                                if ((i27 & 16) != 0) {
                                    i22 = 85;
                                } else {
                                    i22 = 0;
                                }
                                int i33 = i21 + i22;
                                if ((i27 & 2) != 0) {
                                    i23 = 43;
                                } else {
                                    i23 = 0;
                                }
                                if ((i27 & 32) != 0) {
                                    i24 = 85;
                                } else {
                                    i24 = 0;
                                }
                                int i34 = i23 + i24;
                                if ((i27 & 4) == 0) {
                                    i32 = 0;
                                }
                                if ((i27 & 64) == 0) {
                                    i31 = 0;
                                }
                                iArr[i27] = d(255, i33, i34, i32 + i31);
                            }
                        } else {
                            if ((i27 & 1) != 0) {
                                i17 = 43;
                            } else {
                                i17 = 0;
                            }
                            int i35 = i17 + 127;
                            if ((i27 & 16) != 0) {
                                i18 = 85;
                            } else {
                                i18 = 0;
                            }
                            int i36 = i35 + i18;
                            if ((i27 & 2) != 0) {
                                i19 = 43;
                            } else {
                                i19 = 0;
                            }
                            int i37 = i19 + 127;
                            if ((i27 & 32) != 0) {
                                i20 = 85;
                            } else {
                                i20 = 0;
                            }
                            int i38 = i37 + i20;
                            if ((i27 & 4) == 0) {
                                i32 = 0;
                            }
                            int i39 = i32 + 127;
                            if ((i27 & 64) == 0) {
                                i31 = 0;
                            }
                            iArr[i27] = d(255, i36, i38, i39 + i31);
                        }
                    } else {
                        if ((i27 & 1) != 0) {
                            i13 = 85;
                        } else {
                            i13 = 0;
                        }
                        if ((i27 & 16) != 0) {
                            i14 = 170;
                        } else {
                            i14 = 0;
                        }
                        int i40 = i13 + i14;
                        if ((i27 & 2) != 0) {
                            i15 = 85;
                        } else {
                            i15 = 0;
                        }
                        if ((i27 & 32) != 0) {
                            i16 = 170;
                        } else {
                            i16 = 0;
                        }
                        int i41 = i15 + i16;
                        if ((i27 & 4) == 0) {
                            i31 = 0;
                        }
                        if ((i27 & 64) == 0) {
                            i30 = 0;
                        }
                        iArr[i27] = d(127, i40, i41, i31 + i30);
                    }
                } else {
                    if ((i27 & 1) != 0) {
                        i9 = 85;
                    } else {
                        i9 = 0;
                    }
                    if ((i27 & 16) != 0) {
                        i10 = 170;
                    } else {
                        i10 = 0;
                    }
                    int i42 = i9 + i10;
                    if ((i27 & 2) != 0) {
                        i11 = 85;
                    } else {
                        i11 = 0;
                    }
                    if ((i27 & 32) != 0) {
                        i12 = 170;
                    } else {
                        i12 = 0;
                    }
                    int i43 = i11 + i12;
                    if ((i27 & 4) == 0) {
                        i31 = 0;
                    }
                    if ((i27 & 64) == 0) {
                        i30 = 0;
                    }
                    iArr[i27] = d(255, i42, i43, i31 + i30);
                }
            }
        }
        return iArr;
    }

    public static int d(int i9, int i10, int i11, int i12) {
        return (i9 << 24) | (i10 << 16) | (i11 << 8) | i12;
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x0174  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x016c  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x01d5 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:98:0x01fe A[LOOP:3: B:87:0x0166->B:98:0x01fe, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:99:0x01fa A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void e(byte[] r22, int[] r23, int r24, int r25, int r26, android.graphics.Paint r27, android.graphics.Canvas r28) {
        /*
            Method dump skipped, instructions count: 546
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a4.C0500i.e(byte[], int[], int, int, int, android.graphics.Paint, android.graphics.Canvas):void");
    }

    public static C0493b f(Z3.f fVar, int i9) {
        int[] iArr;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15 = 8;
        int i16 = fVar.i(8);
        fVar.r(8);
        int i17 = 2;
        int i18 = i9 - 2;
        int i19 = 0;
        int[] iArr2 = {0, -1, -16777216, -8421505};
        int[] b9 = b();
        int[] c3 = c();
        while (i18 > 0) {
            int i20 = fVar.i(i15);
            int i21 = fVar.i(i15);
            if ((i21 & 128) != 0) {
                iArr = iArr2;
            } else if ((i21 & 64) != 0) {
                iArr = b9;
            } else {
                iArr = c3;
            }
            if ((i21 & 1) != 0) {
                i13 = fVar.i(i15);
                i14 = fVar.i(i15);
                i10 = fVar.i(i15);
                i12 = fVar.i(i15);
                i11 = i18 - 6;
            } else {
                int i22 = fVar.i(6) << i17;
                int i23 = fVar.i(4) << 4;
                i10 = fVar.i(4) << 4;
                i11 = i18 - 4;
                i12 = fVar.i(i17) << 6;
                i13 = i22;
                i14 = i23;
            }
            if (i13 == 0) {
                i14 = i19;
                i10 = i14;
                i12 = 255;
            }
            double d9 = i13;
            double d10 = i14 - 128;
            double d11 = i10 - 128;
            iArr[i20] = d((byte) (255 - (i12 & 255)), y.i((int) ((1.402d * d10) + d9), 0, 255), y.i((int) ((d9 - (0.34414d * d11)) - (d10 * 0.71414d)), 0, 255), y.i((int) ((d11 * 1.772d) + d9), 0, 255));
            i18 = i11;
            i19 = 0;
            i16 = i16;
            c3 = c3;
            i15 = 8;
            i17 = 2;
        }
        return new C0493b(i16, iArr2, b9, c3);
    }

    public static C0495d g(Z3.f fVar) {
        byte[] bArr;
        int i9 = fVar.i(16);
        fVar.r(4);
        int i10 = fVar.i(2);
        boolean h7 = fVar.h();
        fVar.r(1);
        byte[] bArr2 = y.f20558f;
        if (i10 == 1) {
            fVar.r(fVar.i(8) * 16);
        } else if (i10 == 0) {
            int i11 = fVar.i(16);
            int i12 = fVar.i(16);
            if (i11 > 0) {
                bArr2 = new byte[i11];
                fVar.k(i11, bArr2);
            }
            if (i12 > 0) {
                bArr = new byte[i12];
                fVar.k(i12, bArr);
                return new C0495d(i9, h7, bArr2, bArr);
            }
        }
        bArr = bArr2;
        return new C0495d(i9, h7, bArr2, bArr);
    }
}
