package z3;

import A3.F;
import A4.r;
import H1.k;
import j3.L;
import j3.M;
import j3.j0;
import java.util.ArrayList;
import java.util.Arrays;
import k4.C1499E;
import l3.I;
import l4.AbstractC1566a;
import l6.AbstractC1570b;
import q3.w;

/* renamed from: z3.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2246j extends AbstractC2245i {

    /* renamed from: n, reason: collision with root package name */
    public F f25411n;

    /* renamed from: o, reason: collision with root package name */
    public int f25412o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f25413p;

    /* renamed from: q, reason: collision with root package name */
    public I f25414q;

    /* renamed from: r, reason: collision with root package name */
    public w f25415r;

    @Override // z3.AbstractC2245i
    public final void a(long j) {
        boolean z9;
        this.f25405g = j;
        int i9 = 0;
        if (j != 0) {
            z9 = true;
        } else {
            z9 = false;
        }
        this.f25413p = z9;
        I i10 = this.f25414q;
        if (i10 != null) {
            i9 = i10.f20311e;
        }
        this.f25412o = i9;
    }

    @Override // z3.AbstractC2245i
    public final long b(r rVar) {
        int i9;
        int i10 = 0;
        byte b9 = ((byte[]) rVar.f384c)[0];
        if ((b9 & 1) == 1) {
            return -1L;
        }
        F f9 = this.f25411n;
        AbstractC1566a.n(f9);
        boolean z9 = ((k[]) f9.f54f)[(b9 >> 1) & (255 >>> (8 - f9.f50b))].f2964a;
        I i11 = (I) f9.f51c;
        if (!z9) {
            i9 = i11.f20311e;
        } else {
            i9 = i11.f20312f;
        }
        if (this.f25413p) {
            i10 = (this.f25412o + i9) / 4;
        }
        long j = i10;
        byte[] bArr = (byte[]) rVar.f384c;
        int length = bArr.length;
        int i12 = rVar.f383b + 4;
        if (length < i12) {
            byte[] copyOf = Arrays.copyOf(bArr, i12);
            rVar.F(copyOf.length, copyOf);
        } else {
            rVar.G(i12);
        }
        byte[] bArr2 = (byte[]) rVar.f384c;
        int i13 = rVar.f383b;
        bArr2[i13 - 4] = (byte) (j & 255);
        bArr2[i13 - 3] = (byte) ((j >>> 8) & 255);
        bArr2[i13 - 2] = (byte) ((j >>> 16) & 255);
        bArr2[i13 - 1] = (byte) ((j >>> 24) & 255);
        this.f25413p = true;
        this.f25412o = i9;
        return j;
    }

    /* JADX WARN: Type inference failed for: r8v9, types: [l3.I, java.lang.Object] */
    @Override // z3.AbstractC2245i
    public final boolean c(r rVar, long j, C1499E c1499e) {
        F f9;
        int i9;
        I i10;
        int i11;
        int i12;
        I i13;
        int i14;
        I i15;
        if (this.f25411n != null) {
            ((M) c1499e.f19985b).getClass();
            return false;
        }
        I i16 = this.f25414q;
        int i17 = 1;
        int i18 = 4;
        int i19 = -1;
        if (i16 == null) {
            AbstractC1570b.y(1, rVar, false);
            rVar.o();
            int x5 = rVar.x();
            int o9 = rVar.o();
            int k5 = rVar.k();
            if (k5 <= 0) {
                k5 = -1;
            }
            int k9 = rVar.k();
            if (k9 > 0) {
                i19 = k9;
            }
            rVar.k();
            int x9 = rVar.x();
            int pow = (int) Math.pow(2.0d, x9 & 15);
            int pow2 = (int) Math.pow(2.0d, (x9 & 240) >> 4);
            rVar.x();
            byte[] copyOf = Arrays.copyOf((byte[]) rVar.f384c, rVar.f383b);
            ?? obj = new Object();
            obj.f20307a = x5;
            obj.f20308b = o9;
            obj.f20309c = k5;
            obj.f20310d = i19;
            obj.f20311e = pow;
            obj.f20312f = pow2;
            obj.f20313g = copyOf;
            this.f25414q = obj;
        } else {
            w wVar = this.f25415r;
            if (wVar == null) {
                this.f25415r = AbstractC1570b.v(rVar, true, true);
            } else {
                int i20 = rVar.f383b;
                byte[] bArr = new byte[i20];
                System.arraycopy((byte[]) rVar.f384c, 0, bArr, 0, i20);
                int i21 = 5;
                AbstractC1570b.y(5, rVar, false);
                int x10 = rVar.x() + 1;
                Z3.f fVar = new Z3.f((byte[]) rVar.f384c);
                int i22 = 8;
                fVar.r(rVar.f382a * 8);
                int i23 = 0;
                while (i23 < x10) {
                    int i24 = i22;
                    if (fVar.i(24) == 5653314) {
                        int i25 = fVar.i(16);
                        int i26 = fVar.i(24);
                        long[] jArr = new long[i26];
                        long j4 = 0;
                        if (!fVar.h()) {
                            boolean h7 = fVar.h();
                            i12 = i17;
                            int i27 = 0;
                            while (i27 < i26) {
                                if (h7) {
                                    if (fVar.h()) {
                                        i15 = i16;
                                        jArr[i27] = fVar.i(i21) + 1;
                                    } else {
                                        i15 = i16;
                                        jArr[i27] = 0;
                                    }
                                } else {
                                    i15 = i16;
                                    jArr[i27] = fVar.i(i21) + 1;
                                }
                                i27++;
                                i16 = i15;
                                i18 = 4;
                            }
                            i13 = i16;
                            i14 = i18;
                        } else {
                            i12 = i17;
                            i13 = i16;
                            int i28 = fVar.i(i21) + 1;
                            int i29 = 0;
                            while (i29 < i26) {
                                int i30 = fVar.i(AbstractC1570b.i(i26 - i29));
                                int i31 = 0;
                                while (i31 < i30 && i29 < i26) {
                                    jArr[i29] = i28;
                                    i29++;
                                    i31++;
                                    i26 = i26;
                                }
                                i28++;
                                i26 = i26;
                            }
                            i14 = 4;
                        }
                        int i32 = i26;
                        int i33 = fVar.i(i14);
                        if (i33 <= 2) {
                            int i34 = i12;
                            if (i33 == i34 || i33 == 2) {
                                fVar.r(32);
                                fVar.r(32);
                                int i35 = fVar.i(i14) + i34;
                                fVar.r(i34);
                                if (i33 == i34) {
                                    if (i25 != 0) {
                                        j4 = (long) Math.floor(Math.pow(i32, 1.0d / i25));
                                    }
                                } else {
                                    j4 = i32 * i25;
                                }
                                fVar.r((int) (i35 * j4));
                            }
                            i23++;
                            i22 = i24;
                            i16 = i13;
                            i17 = 1;
                            i18 = 4;
                            i21 = 5;
                        } else {
                            throw j0.a("lookup type greater than 2 not decodable: " + i33, null);
                        }
                    } else {
                        throw j0.a("expected code book to start with [0x56, 0x43, 0x42] at " + ((fVar.f9038d * 8) + fVar.f9039e), null);
                    }
                }
                I i36 = i16;
                int i37 = i22;
                int i38 = 6;
                int i39 = fVar.i(6) + 1;
                for (int i40 = 0; i40 < i39; i40++) {
                    if (fVar.i(16) != 0) {
                        throw j0.a("placeholder of time domain transforms not zeroed out", null);
                    }
                }
                int i41 = 1;
                int i42 = fVar.i(6) + 1;
                int i43 = 0;
                while (true) {
                    int i44 = 3;
                    if (i43 < i42) {
                        int i45 = fVar.i(16);
                        if (i45 != 0) {
                            if (i45 == i41) {
                                int i46 = fVar.i(5);
                                int[] iArr = new int[i46];
                                int i47 = -1;
                                for (int i48 = 0; i48 < i46; i48++) {
                                    int i49 = fVar.i(4);
                                    iArr[i48] = i49;
                                    if (i49 > i47) {
                                        i47 = i49;
                                    }
                                }
                                int i50 = i47 + 1;
                                int[] iArr2 = new int[i50];
                                int i51 = 0;
                                while (i51 < i50) {
                                    iArr2[i51] = fVar.i(i44) + 1;
                                    int i52 = fVar.i(2);
                                    int i53 = i37;
                                    if (i52 > 0) {
                                        fVar.r(i53);
                                    }
                                    int i54 = 0;
                                    for (int i55 = 1; i54 < (i55 << i52); i55 = 1) {
                                        fVar.r(i53);
                                        i54++;
                                        i53 = 8;
                                    }
                                    i51++;
                                    i37 = 8;
                                    i44 = 3;
                                }
                                fVar.r(2);
                                int i56 = fVar.i(4);
                                int i57 = 0;
                                int i58 = 0;
                                for (int i59 = 0; i59 < i46; i59++) {
                                    i57 += iArr2[iArr[i59]];
                                    while (i58 < i57) {
                                        fVar.r(i56);
                                        i58++;
                                    }
                                }
                            } else {
                                throw j0.a("floor type greater than 1 not decodable: " + i45, null);
                            }
                        } else {
                            int i60 = i37;
                            fVar.r(i60);
                            fVar.r(16);
                            fVar.r(16);
                            fVar.r(6);
                            fVar.r(i60);
                            int i61 = fVar.i(4) + 1;
                            int i62 = 0;
                            while (i62 < i61) {
                                fVar.r(i60);
                                i62++;
                                i60 = 8;
                            }
                        }
                        i43++;
                        i37 = 8;
                        i38 = 6;
                        i41 = 1;
                    } else {
                        int i63 = fVar.i(i38) + 1;
                        int i64 = 0;
                        while (i64 < i63) {
                            if (fVar.i(16) <= 2) {
                                fVar.r(24);
                                fVar.r(24);
                                fVar.r(24);
                                int i65 = fVar.i(i38) + 1;
                                int i66 = 8;
                                fVar.r(8);
                                int[] iArr3 = new int[i65];
                                for (int i67 = 0; i67 < i65; i67++) {
                                    int i68 = fVar.i(3);
                                    if (fVar.h()) {
                                        i11 = fVar.i(5);
                                    } else {
                                        i11 = 0;
                                    }
                                    iArr3[i67] = (i11 * 8) + i68;
                                }
                                int i69 = 0;
                                while (i69 < i65) {
                                    int i70 = 0;
                                    while (i70 < i66) {
                                        if ((iArr3[i69] & (1 << i70)) != 0) {
                                            fVar.r(i66);
                                        }
                                        i70++;
                                        i66 = 8;
                                    }
                                    i69++;
                                    i66 = 8;
                                }
                                i64++;
                                i38 = 6;
                            } else {
                                throw j0.a("residueType greater than 2 is not decodable", null);
                            }
                        }
                        int i71 = fVar.i(i38) + 1;
                        int i72 = 0;
                        while (i72 < i71) {
                            int i73 = fVar.i(16);
                            if (i73 != 0) {
                                AbstractC1566a.t("VorbisUtil", "mapping type other than 0 not supported: " + i73);
                                i10 = i36;
                            } else {
                                if (fVar.h()) {
                                    i9 = fVar.i(4) + 1;
                                } else {
                                    i9 = 1;
                                }
                                boolean h9 = fVar.h();
                                i10 = i36;
                                int i74 = i10.f20307a;
                                if (h9) {
                                    int i75 = fVar.i(8) + 1;
                                    for (int i76 = 0; i76 < i75; i76++) {
                                        int i77 = i74 - 1;
                                        fVar.r(AbstractC1570b.i(i77));
                                        fVar.r(AbstractC1570b.i(i77));
                                    }
                                }
                                if (fVar.i(2) == 0) {
                                    if (i9 > 1) {
                                        for (int i78 = 0; i78 < i74; i78++) {
                                            fVar.r(4);
                                        }
                                    }
                                    for (int i79 = 0; i79 < i9; i79++) {
                                        fVar.r(8);
                                        fVar.r(8);
                                        fVar.r(8);
                                    }
                                } else {
                                    throw j0.a("to reserved bits must be zero after mapping coupling steps", null);
                                }
                            }
                            i72++;
                            i36 = i10;
                        }
                        int i80 = fVar.i(6);
                        int i81 = i80 + 1;
                        k[] kVarArr = new k[i81];
                        for (int i82 = 0; i82 < i81; i82++) {
                            boolean h10 = fVar.h();
                            fVar.i(16);
                            fVar.i(16);
                            fVar.i(8);
                            kVarArr[i82] = new k(h10);
                        }
                        if (fVar.h()) {
                            f9 = new F(i36, wVar, bArr, kVarArr, AbstractC1570b.i(i80));
                        } else {
                            throw j0.a("framing bit after modes not set as expected", null);
                        }
                    }
                }
            }
        }
        f9 = null;
        this.f25411n = f9;
        if (f9 == null) {
            return true;
        }
        ArrayList arrayList = new ArrayList();
        I i83 = (I) f9.f51c;
        arrayList.add((byte[]) i83.f20313g);
        arrayList.add((byte[]) f9.f53e);
        D3.c s9 = AbstractC1570b.s(P5.F.p(((w) f9.f52d).f22358a));
        L l9 = new L();
        l9.f19402k = "audio/vorbis";
        l9.f19398f = i83.f20310d;
        l9.f19399g = i83.f20309c;
        l9.f19415x = i83.f20307a;
        l9.f19416y = i83.f20308b;
        l9.f19404m = arrayList;
        l9.f19401i = s9;
        c1499e.f19985b = new M(l9);
        return true;
    }

    @Override // z3.AbstractC2245i
    public final void d(boolean z9) {
        super.d(z9);
        if (z9) {
            this.f25411n = null;
            this.f25414q = null;
            this.f25415r = null;
        }
        this.f25412o = 0;
        this.f25413p = false;
    }
}
