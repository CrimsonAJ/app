package b4;

import A4.r;
import Y3.f;
import Y3.g;
import Z3.j;
import android.graphics.Bitmap;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.zip.Inflater;
import l4.y;

/* renamed from: b4.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0608b extends f {

    /* renamed from: m, reason: collision with root package name */
    public final r f10541m = new r(5, false);

    /* renamed from: n, reason: collision with root package name */
    public final r f10542n = new r(5, false);

    /* renamed from: o, reason: collision with root package name */
    public final C0607a f10543o = new C0607a();

    /* renamed from: p, reason: collision with root package name */
    public Inflater f10544p;

    @Override // Y3.f
    public final g f(int i9, boolean z9, byte[] bArr) {
        r rVar;
        Y3.b bVar;
        int i10;
        int i11;
        int i12;
        int x5;
        int i13;
        int i14;
        int z10;
        r rVar2 = this.f10541m;
        rVar2.F(i9, bArr);
        if (rVar2.e() > 0 && rVar2.g() == 120) {
            if (this.f10544p == null) {
                this.f10544p = new Inflater();
            }
            Inflater inflater = this.f10544p;
            r rVar3 = this.f10542n;
            if (y.E(rVar2, rVar3, inflater)) {
                rVar2.F(rVar3.f383b, (byte[]) rVar3.f384c);
            }
        }
        C0607a c0607a = this.f10543o;
        int i15 = 0;
        c0607a.f10535d = 0;
        c0607a.f10536e = 0;
        c0607a.f10537f = 0;
        c0607a.f10538g = 0;
        c0607a.f10539h = 0;
        c0607a.f10540i = 0;
        r rVar4 = c0607a.f10532a;
        rVar4.E(0);
        c0607a.f10534c = false;
        ArrayList arrayList = new ArrayList();
        while (rVar2.e() >= 3) {
            int i16 = rVar2.f383b;
            int x9 = rVar2.x();
            int C8 = rVar2.C();
            int i17 = rVar2.f382a + C8;
            if (i17 > i16) {
                rVar2.H(i16);
                i10 = i15;
                rVar = rVar4;
                bVar = null;
            } else {
                char c3 = 128;
                int[] iArr = c0607a.f10533b;
                if (x9 != 128) {
                    switch (x9) {
                        case 20:
                            if (C8 % 5 == 2) {
                                rVar2.I(2);
                                Arrays.fill(iArr, i15);
                                int i18 = C8 / 5;
                                int i19 = i15;
                                while (i19 < i18) {
                                    int x10 = rVar2.x();
                                    char c9 = c3;
                                    double x11 = rVar2.x();
                                    double x12 = rVar2.x() - 128;
                                    int[] iArr2 = iArr;
                                    double x13 = rVar2.x() - 128;
                                    iArr2[x10] = (y.i((int) ((x11 - (0.34414d * x13)) - (x12 * 0.71414d)), 0, 255) << 8) | (rVar2.x() << 24) | (y.i((int) ((1.402d * x12) + x11), 0, 255) << 16) | y.i((int) ((x13 * 1.772d) + x11), 0, 255);
                                    i19++;
                                    c3 = c9;
                                    rVar4 = rVar4;
                                    iArr = iArr2;
                                }
                                rVar = rVar4;
                                c0607a.f10534c = true;
                                break;
                            }
                            break;
                        case 21:
                            if (C8 >= 4) {
                                rVar2.I(3);
                                if ((128 & rVar2.x()) != 0) {
                                    i14 = 1;
                                } else {
                                    i14 = i15;
                                }
                                int i20 = C8 - 4;
                                if (i14 != 0) {
                                    if (i20 >= 7 && (z10 = rVar2.z()) >= 4) {
                                        c0607a.f10539h = rVar2.C();
                                        c0607a.f10540i = rVar2.C();
                                        rVar4.E(z10 - 4);
                                        i20 = C8 - 11;
                                    }
                                }
                                int i21 = rVar4.f382a;
                                int i22 = rVar4.f383b;
                                if (i21 < i22 && i20 > 0) {
                                    int min = Math.min(i20, i22 - i21);
                                    rVar2.h((byte[]) rVar4.f384c, i21, min);
                                    rVar4.H(i21 + min);
                                    break;
                                }
                            }
                            break;
                        case 22:
                            if (C8 >= 19) {
                                c0607a.f10535d = rVar2.C();
                                c0607a.f10536e = rVar2.C();
                                rVar2.I(11);
                                c0607a.f10537f = rVar2.C();
                                c0607a.f10538g = rVar2.C();
                                break;
                            }
                            break;
                    }
                    rVar = rVar4;
                    bVar = null;
                    i10 = 0;
                } else {
                    rVar = rVar4;
                    if (c0607a.f10535d != 0 && c0607a.f10536e != 0 && c0607a.f10539h != 0 && c0607a.f10540i != 0 && (i11 = rVar.f383b) != 0 && rVar.f382a == i11 && c0607a.f10534c) {
                        rVar.H(0);
                        int i23 = c0607a.f10539h * c0607a.f10540i;
                        int[] iArr3 = new int[i23];
                        int i24 = 0;
                        while (i24 < i23) {
                            int x14 = rVar.x();
                            if (x14 != 0) {
                                i12 = i24 + 1;
                                iArr3[i24] = iArr[x14];
                            } else {
                                int x15 = rVar.x();
                                if (x15 != 0) {
                                    if ((x15 & 64) == 0) {
                                        x5 = x15 & 63;
                                    } else {
                                        x5 = ((x15 & 63) << 8) | rVar.x();
                                    }
                                    if ((x15 & 128) == 0) {
                                        i13 = 0;
                                    } else {
                                        i13 = iArr[rVar.x()];
                                    }
                                    i12 = x5 + i24;
                                    Arrays.fill(iArr3, i24, i12, i13);
                                }
                            }
                            i24 = i12;
                        }
                        Bitmap createBitmap = Bitmap.createBitmap(iArr3, c0607a.f10539h, c0607a.f10540i, Bitmap.Config.ARGB_8888);
                        float f9 = c0607a.f10537f;
                        float f10 = c0607a.f10535d;
                        float f11 = f9 / f10;
                        float f12 = c0607a.f10538g;
                        float f13 = c0607a.f10536e;
                        bVar = new Y3.b(null, null, null, createBitmap, f12 / f13, 0, 0, f11, 0, Integer.MIN_VALUE, -3.4028235E38f, c0607a.f10539h / f10, c0607a.f10540i / f13, false, -16777216, Integer.MIN_VALUE, 0.0f);
                    } else {
                        bVar = null;
                    }
                    i10 = 0;
                    c0607a.f10535d = 0;
                    c0607a.f10536e = 0;
                    c0607a.f10537f = 0;
                    c0607a.f10538g = 0;
                    c0607a.f10539h = 0;
                    c0607a.f10540i = 0;
                    rVar.E(0);
                    c0607a.f10534c = false;
                }
                rVar2.H(i17);
            }
            if (bVar != null) {
                arrayList.add(bVar);
            }
            i15 = i10;
            rVar4 = rVar;
        }
        return new j(Collections.unmodifiableList(arrayList), 1);
    }
}
