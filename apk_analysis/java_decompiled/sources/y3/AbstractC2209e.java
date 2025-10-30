package y3;

import N3.X;
import android.util.Pair;
import com.google.android.gms.internal.measurement.AbstractC1002u1;
import j3.M;
import j3.j0;
import java.util.Arrays;
import l4.AbstractC1566a;
import l4.y;
import q3.C1910o;

/* renamed from: y3.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC2209e {

    /* renamed from: a, reason: collision with root package name */
    public static final byte[] f24787a;

    static {
        int i9 = y.f20553a;
        f24787a = "OpusHead".getBytes(O5.e.f5491c);
    }

    public static X a(int i9, A4.r rVar) {
        long j;
        rVar.H(i9 + 12);
        rVar.I(1);
        b(rVar);
        rVar.I(2);
        int x5 = rVar.x();
        if ((x5 & 128) != 0) {
            rVar.I(2);
        }
        if ((x5 & 64) != 0) {
            rVar.I(rVar.x());
        }
        if ((x5 & 32) != 0) {
            rVar.I(2);
        }
        rVar.I(1);
        b(rVar);
        String e8 = l4.n.e(rVar.x());
        if (!"audio/mpeg".equals(e8) && !"audio/vnd.dts".equals(e8) && !"audio/vnd.dts.hd".equals(e8)) {
            rVar.I(4);
            long y9 = rVar.y();
            long y10 = rVar.y();
            rVar.I(1);
            int b9 = b(rVar);
            long j4 = y10;
            byte[] bArr = new byte[b9];
            rVar.h(bArr, 0, b9);
            if (j4 <= 0) {
                j4 = -1;
            }
            if (y9 > 0) {
                j = y9;
            } else {
                j = -1;
            }
            return new X(e8, bArr, j4, j);
        }
        return new X(e8, null, -1L, -1L);
    }

    public static int b(A4.r rVar) {
        int x5 = rVar.x();
        int i9 = x5 & 127;
        while ((x5 & 128) == 128) {
            x5 = rVar.x();
            i9 = (i9 << 7) | (x5 & 127);
        }
        return i9;
    }

    public static Pair c(A4.r rVar, int i9, int i10) {
        boolean z9;
        boolean z10;
        boolean z11;
        Integer num;
        p pVar;
        Pair create;
        int i11;
        int i12;
        Integer num2;
        boolean z12;
        int i13 = rVar.f382a;
        while (i13 - i9 < i10) {
            rVar.H(i13);
            int i14 = rVar.i();
            boolean z13 = false;
            if (i14 > 0) {
                z9 = true;
            } else {
                z9 = false;
            }
            AbstractC1002u1.h("childAtomSize must be positive", z9);
            if (rVar.i() == 1936289382) {
                int i15 = i13 + 8;
                int i16 = 0;
                int i17 = -1;
                Integer num3 = null;
                String str = null;
                while (i15 - i13 < i14) {
                    rVar.H(i15);
                    int i18 = rVar.i();
                    int i19 = rVar.i();
                    if (i19 == 1718775137) {
                        num3 = Integer.valueOf(rVar.i());
                    } else if (i19 == 1935894637) {
                        rVar.I(4);
                        str = rVar.v(4, O5.e.f5491c);
                    } else if (i19 == 1935894633) {
                        i17 = i15;
                        i16 = i18;
                    }
                    i15 += i18;
                }
                byte[] bArr = null;
                if (!"cenc".equals(str) && !"cbc1".equals(str) && !"cens".equals(str) && !"cbcs".equals(str)) {
                    create = null;
                } else {
                    if (num3 != null) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    AbstractC1002u1.h("frma atom is mandatory", z10);
                    if (i17 != -1) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    AbstractC1002u1.h("schi atom is mandatory", z11);
                    int i20 = i17 + 8;
                    while (true) {
                        if (i20 - i17 < i16) {
                            rVar.H(i20);
                            int i21 = rVar.i();
                            if (rVar.i() == 1952804451) {
                                int q9 = Q0.b.q(rVar.i());
                                rVar.I(1);
                                if (q9 == 0) {
                                    rVar.I(1);
                                    i12 = 0;
                                    i11 = 0;
                                } else {
                                    int x5 = rVar.x();
                                    i11 = x5 & 15;
                                    i12 = (x5 & 240) >> 4;
                                }
                                if (rVar.x() == 1) {
                                    num2 = num3;
                                    z12 = true;
                                } else {
                                    num2 = num3;
                                    z12 = false;
                                }
                                int x9 = rVar.x();
                                byte[] bArr2 = new byte[16];
                                rVar.h(bArr2, 0, 16);
                                if (z12 && x9 == 0) {
                                    int x10 = rVar.x();
                                    byte[] bArr3 = new byte[x10];
                                    rVar.h(bArr3, 0, x10);
                                    bArr = bArr3;
                                }
                                num = num2;
                                pVar = new p(z12, str, x9, bArr2, i12, i11, bArr);
                            } else {
                                i20 += i21;
                            }
                        } else {
                            num = num3;
                            pVar = null;
                            break;
                        }
                    }
                    if (pVar != null) {
                        z13 = true;
                    }
                    AbstractC1002u1.h("tenc atom is mandatory", z13);
                    int i22 = y.f20553a;
                    create = Pair.create(num, pVar);
                }
                if (create != null) {
                    return create;
                }
            }
            i13 += i14;
        }
        return null;
    }

    /* JADX WARN: Type inference failed for: r6v0, types: [B3.e, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v36, types: [A4.r, java.lang.Object] */
    public static r d(o oVar, C2205a c2205a, C1910o c1910o) {
        InterfaceC2208d interfaceC2208d;
        boolean z9;
        A4.r rVar;
        A4.r rVar2;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        long j;
        M m9;
        int i14;
        int i15;
        int i16;
        int[] iArr;
        int[] iArr2;
        long[] jArr;
        long[] jArr2;
        int i17;
        int i18;
        String str;
        long[] jArr3;
        long j4;
        int i19;
        long j9;
        int i20;
        boolean z10;
        boolean z11;
        long[] jArr4;
        int[] iArr3;
        int[] iArr4;
        int[] iArr5;
        int i21;
        int i22;
        int i23;
        boolean z12;
        boolean z13;
        C2206b s9 = c2205a.s(1937011578);
        M m10 = oVar.f24881f;
        if (s9 != null) {
            ?? obj = new Object();
            A4.r rVar3 = s9.f24777c;
            obj.f384c = rVar3;
            rVar3.H(12);
            int A2 = rVar3.A();
            if ("audio/raw".equals(m10.f19435l)) {
                int x5 = y.x(m10.f19420A, m10.f19448y);
                if (A2 == 0 || A2 % x5 != 0) {
                    AbstractC1566a.P("AtomParsers", "Audio sample size mismatch. stsd sample size: " + x5 + ", stsz sample size: " + A2);
                    A2 = x5;
                }
            }
            if (A2 == 0) {
                A2 = -1;
            }
            obj.f382a = A2;
            obj.f383b = rVar3.A();
            interfaceC2208d = obj;
        } else {
            C2206b s10 = c2205a.s(1937013298);
            if (s10 != null) {
                ?? obj2 = new Object();
                A4.r rVar4 = s10.f24777c;
                obj2.f673e = rVar4;
                rVar4.H(12);
                obj2.f670b = rVar4.A() & 255;
                obj2.f669a = rVar4.A();
                interfaceC2208d = obj2;
            } else {
                throw j0.a("Track has no sample table size information", null);
            }
        }
        int b9 = interfaceC2208d.b();
        if (b9 == 0) {
            return new r(oVar, new long[0], new int[0], 0, new long[0], new int[0], 0L);
        }
        C2206b s11 = c2205a.s(1937007471);
        if (s11 == null) {
            s11 = c2205a.s(1668232756);
            s11.getClass();
            z9 = true;
        } else {
            z9 = false;
        }
        C2206b s12 = c2205a.s(1937011555);
        s12.getClass();
        C2206b s13 = c2205a.s(1937011827);
        s13.getClass();
        C2206b s14 = c2205a.s(1937011571);
        if (s14 != null) {
            rVar = s14.f24777c;
        } else {
            rVar = null;
        }
        C2206b s15 = c2205a.s(1668576371);
        if (s15 != null) {
            rVar2 = s15.f24777c;
        } else {
            rVar2 = null;
        }
        C2207c c2207c = new C2207c(s12.f24777c, s11.f24777c, z9);
        A4.r rVar5 = s13.f24777c;
        rVar5.H(12);
        int A9 = rVar5.A() - 1;
        int A10 = rVar5.A();
        int A11 = rVar5.A();
        if (rVar2 != null) {
            rVar2.H(12);
            i9 = rVar2.A();
        } else {
            i9 = 0;
        }
        if (rVar != null) {
            rVar.H(12);
            i11 = rVar.A();
            if (i11 > 0) {
                i10 = rVar.A() - 1;
                i12 = 0;
            } else {
                i10 = -1;
                i12 = 0;
                rVar = null;
            }
        } else {
            i10 = -1;
            i11 = 0;
            i12 = 0;
        }
        int a5 = interfaceC2208d.a();
        String str2 = m10.f19435l;
        if (a5 != -1 && (("audio/raw".equals(str2) || "audio/g711-mlaw".equals(str2) || "audio/g711-alaw".equals(str2)) && A9 == 0 && i9 == 0 && i11 == 0)) {
            i13 = 1;
        } else {
            i13 = i12;
        }
        InterfaceC2208d interfaceC2208d2 = interfaceC2208d;
        if (i13 != 0) {
            int i24 = c2207c.f24778a;
            long[] jArr5 = new long[i24];
            int[] iArr6 = new int[i24];
            while (c2207c.a()) {
                int i25 = c2207c.f24779b;
                jArr5[i25] = c2207c.f24781d;
                iArr6[i25] = c2207c.f24780c;
            }
            long j10 = A11;
            int i26 = 8192 / a5;
            int i27 = i12;
            int i28 = i27;
            while (i27 < i24) {
                i28 += y.f(iArr6[i27], i26);
                i27++;
            }
            long[] jArr6 = new long[i28];
            iArr = new int[i28];
            j = 0;
            long[] jArr7 = new long[i28];
            int[] iArr7 = new int[i28];
            int i29 = i12;
            int i30 = i29;
            int i31 = i30;
            int i32 = i31;
            while (i30 < i24) {
                int i33 = iArr6[i30];
                long j11 = jArr5[i30];
                int i34 = i32;
                int i35 = i24;
                int i36 = i31;
                int i37 = i34;
                int[] iArr8 = iArr7;
                int i38 = i33;
                while (i38 > 0) {
                    int min = Math.min(i26, i38);
                    jArr6[i37] = j11;
                    int i39 = i38;
                    int i40 = a5 * min;
                    iArr[i37] = i40;
                    i36 = Math.max(i36, i40);
                    jArr7[i37] = i29 * j10;
                    iArr8[i37] = 1;
                    j11 += iArr[i37];
                    i29 += min;
                    i38 = i39 - min;
                    i37++;
                    a5 = a5;
                }
                i30++;
                int i41 = i37;
                i31 = i36;
                i24 = i35;
                i32 = i41;
                iArr7 = iArr8;
            }
            m9 = m10;
            j4 = j10 * i29;
            jArr3 = jArr6;
            jArr2 = jArr7;
            i14 = i31;
            iArr2 = iArr7;
        } else {
            j = 0;
            long[] jArr8 = new long[b9];
            int[] iArr9 = new int[b9];
            long[] jArr9 = new long[b9];
            A4.r rVar6 = rVar2;
            int[] iArr10 = new int[b9];
            m9 = m10;
            A4.r rVar7 = rVar;
            int i42 = i10;
            i14 = i12;
            int i43 = i14;
            int i44 = i43;
            int i45 = i44;
            long j12 = 0;
            long j13 = 0;
            int i46 = i45;
            while (true) {
                if (i46 < b9) {
                    long j14 = j13;
                    int i47 = i44;
                    boolean z14 = true;
                    while (i47 == 0) {
                        z14 = c2207c.a();
                        if (!z14) {
                            break;
                        }
                        int i48 = A9;
                        long j15 = c2207c.f24781d;
                        i47 = c2207c.f24780c;
                        j14 = j15;
                        A9 = i48;
                        A10 = A10;
                        b9 = b9;
                    }
                    int i49 = b9;
                    i15 = A9;
                    i16 = A10;
                    if (!z14) {
                        AbstractC1566a.P("AtomParsers", "Unexpected end of chunk data");
                        long[] copyOf = Arrays.copyOf(jArr8, i46);
                        iArr = Arrays.copyOf(iArr9, i46);
                        jArr2 = Arrays.copyOf(jArr9, i46);
                        i17 = i47;
                        iArr2 = Arrays.copyOf(iArr10, i46);
                        jArr = copyOf;
                        b9 = i46;
                        break;
                    }
                    if (rVar6 != null) {
                        int i50 = i45;
                        while (i50 == 0 && i9 > 0) {
                            i50 = rVar6.A();
                            i43 = rVar6.i();
                            i9--;
                        }
                        i45 = i50 - 1;
                    }
                    jArr8[i46] = j14;
                    int d9 = interfaceC2208d2.d();
                    iArr9[i46] = d9;
                    if (d9 > i14) {
                        i14 = d9;
                    }
                    jArr9[i46] = j12 + i43;
                    if (rVar7 == null) {
                        i19 = 1;
                    } else {
                        i19 = i12;
                    }
                    iArr10[i46] = i19;
                    if (i46 == i42) {
                        iArr10[i46] = 1;
                        i11--;
                        if (i11 > 0) {
                            rVar7.getClass();
                            i42 = rVar7.A() - 1;
                        }
                    }
                    j12 += A11;
                    A10 = i16 - 1;
                    if (A10 == 0 && i15 > 0) {
                        A9 = i15 - 1;
                        A10 = rVar5.A();
                        A11 = rVar5.i();
                    } else {
                        A9 = i15;
                    }
                    long j16 = j14 + iArr9[i46];
                    i44 = i47 - 1;
                    i46++;
                    j13 = j16;
                    b9 = i49;
                } else {
                    i15 = A9;
                    i16 = A10;
                    iArr = iArr9;
                    iArr2 = iArr10;
                    jArr = jArr8;
                    jArr2 = jArr9;
                    i17 = i44;
                    break;
                }
            }
            long j17 = j12 + i43;
            if (rVar6 != null) {
                while (i9 > 0) {
                    if (rVar6.A() != 0) {
                        i18 = i12;
                        break;
                    }
                    rVar6.i();
                    i9--;
                }
            }
            i18 = 1;
            if (i11 != 0 || i16 != 0 || i17 != 0 || i15 != 0 || i45 != 0 || i18 == 0) {
                StringBuilder sb = new StringBuilder("Inconsistent stbl box for track ");
                sb.append(oVar.f24876a);
                sb.append(": remainingSynchronizationSamples ");
                sb.append(i11);
                sb.append(", remainingSamplesAtTimestampDelta ");
                sb.append(i16);
                sb.append(", remainingSamplesInChunk ");
                sb.append(i17);
                sb.append(", remainingTimestampDeltaChanges ");
                sb.append(i15);
                sb.append(", remainingSamplesAtTimestampOffset ");
                sb.append(i45);
                if (i18 == 0) {
                    str = ", ctts invalid";
                } else {
                    str = "";
                }
                sb.append(str);
                AbstractC1566a.P("AtomParsers", sb.toString());
            }
            jArr3 = jArr;
            j4 = j17;
        }
        long O8 = y.O(j4, 1000000L, oVar.f24878c);
        long j18 = oVar.f24878c;
        long[] jArr10 = oVar.f24883h;
        if (jArr10 == null) {
            y.P(jArr2, j18);
            return new r(oVar, jArr3, iArr, i14, jArr2, iArr2, O8);
        }
        int i51 = b9;
        int[] iArr11 = iArr;
        int length = jArr10.length;
        int i52 = oVar.f24877b;
        long[] jArr11 = oVar.f24884i;
        if (length == 1 && i52 == 1 && jArr2.length >= 2) {
            jArr11.getClass();
            long j19 = jArr11[i12];
            long[] jArr12 = jArr3;
            long O9 = y.O(jArr10[i12], oVar.f24878c, oVar.f24879d) + j19;
            int length2 = jArr2.length - 1;
            int i53 = i14;
            int i54 = i12;
            int i55 = y.i(4, i54, length2);
            int i56 = y.i(jArr2.length - 4, i54, length2);
            long j20 = jArr2[i54];
            if (j20 <= j19 && j19 < jArr2[i55] && jArr2[i56] < O9 && O9 <= j4) {
                z13 = true;
            } else {
                z13 = false;
            }
            if (z13) {
                long j21 = j4 - O9;
                M m11 = m9;
                long O10 = y.O(j19 - j20, m11.f19449z, oVar.f24878c);
                j9 = j4;
                int[] iArr12 = iArr2;
                long O11 = y.O(j21, m11.f19449z, oVar.f24878c);
                if ((O10 == j && O11 == j) || O10 > 2147483647L || O11 > 2147483647L) {
                    jArr3 = jArr12;
                    iArr2 = iArr12;
                } else {
                    c1910o.f22336a = (int) O10;
                    c1910o.f22337b = (int) O11;
                    y.P(jArr2, j18);
                    return new r(oVar, jArr12, iArr11, i53, jArr2, iArr12, y.O(jArr10[0], 1000000L, oVar.f24879d));
                }
            } else {
                jArr3 = jArr12;
                j9 = j4;
            }
            iArr11 = iArr11;
            i14 = i53;
        } else {
            j9 = j4;
        }
        if (jArr10.length == 1) {
            if (jArr10[0] == j) {
                jArr11.getClass();
                long j22 = jArr11[0];
                for (int i57 = 0; i57 < jArr2.length; i57++) {
                    jArr2[i57] = y.O(jArr2[i57] - j22, 1000000L, oVar.f24878c);
                }
                return new r(oVar, jArr3, iArr11, i14, jArr2, iArr2, y.O(j9 - j22, 1000000L, oVar.f24878c));
            }
            i20 = 1;
        } else {
            i20 = 1;
        }
        if (i52 == i20) {
            z10 = true;
        } else {
            z10 = false;
        }
        int[] iArr13 = new int[jArr10.length];
        int[] iArr14 = new int[jArr10.length];
        jArr11.getClass();
        int i58 = i14;
        int i59 = 0;
        boolean z15 = false;
        int i60 = 0;
        int i61 = 0;
        while (i59 < jArr10.length) {
            int[] iArr15 = iArr13;
            int[] iArr16 = iArr14;
            long j23 = jArr11[i59];
            if (j23 != -1) {
                i21 = i59;
                boolean z16 = z15;
                long O12 = y.O(jArr10[i59], oVar.f24878c, oVar.f24879d);
                iArr5 = iArr15;
                iArr5[i21] = y.e(jArr2, j23, true);
                iArr16[i21] = y.b(jArr2, j23 + O12, z10);
                while (true) {
                    i22 = iArr5[i21];
                    i23 = iArr16[i21];
                    if (i22 >= i23 || (iArr2[i22] & 1) != 0) {
                        break;
                    }
                    iArr5[i21] = i22 + 1;
                }
                int i62 = (i23 - i22) + i60;
                if (i61 != i22) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                z15 = z16 | z12;
                i61 = i23;
                i60 = i62;
            } else {
                iArr5 = iArr15;
                i21 = i59;
            }
            i59 = i21 + 1;
            iArr13 = iArr5;
            iArr14 = iArr16;
        }
        int[] iArr17 = iArr13;
        int[] iArr18 = iArr14;
        boolean z17 = z15;
        if (i60 != i51) {
            z11 = true;
        } else {
            z11 = false;
        }
        boolean z18 = z17 | z11;
        if (z18) {
            jArr4 = new long[i60];
        } else {
            jArr4 = jArr3;
        }
        if (z18) {
            iArr3 = new int[i60];
        } else {
            iArr3 = iArr11;
        }
        if (z18) {
            i58 = 0;
        }
        if (z18) {
            iArr4 = new int[i60];
        } else {
            iArr4 = iArr2;
        }
        long[] jArr13 = new long[i60];
        int i63 = 0;
        int i64 = 0;
        long j24 = j;
        while (i63 < jArr10.length) {
            long j25 = jArr11[i63];
            long[] jArr14 = jArr10;
            int i65 = iArr17[i63];
            boolean z19 = z18;
            int i66 = iArr18[i63];
            long[] jArr15 = jArr2;
            if (z19) {
                int i67 = i66 - i65;
                System.arraycopy(jArr3, i65, jArr4, i64, i67);
                System.arraycopy(iArr11, i65, iArr3, i64, i67);
                System.arraycopy(iArr2, i65, iArr4, i64, i67);
            }
            int i68 = i58;
            while (i65 < i66) {
                long[] jArr16 = jArr3;
                int[] iArr19 = iArr11;
                int[] iArr20 = iArr2;
                long[] jArr17 = jArr4;
                long j26 = j;
                jArr13[i64] = y.O(j24, 1000000L, oVar.f24879d) + y.O(Math.max(j26, jArr15[i65] - j25), 1000000L, oVar.f24878c);
                if (z19 && iArr3[i64] > i68) {
                    i68 = iArr19[i65];
                }
                i64++;
                i65++;
                j = j26;
                iArr2 = iArr20;
                jArr3 = jArr16;
                iArr11 = iArr19;
                jArr4 = jArr17;
            }
            j24 += jArr14[i63];
            i63++;
            z18 = z19;
            i58 = i68;
            jArr10 = jArr14;
            jArr2 = jArr15;
            iArr2 = iArr2;
            jArr3 = jArr3;
            iArr11 = iArr11;
            jArr4 = jArr4;
        }
        return new r(oVar, jArr4, iArr3, i58, jArr13, iArr4, y.O(j24, 1000000L, oVar.f24879d));
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x00df, code lost:
    
        if (r28 == 0) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:441:0x0cb5, code lost:
    
        if (r23 == null) goto L628;
     */
    /* JADX WARN: Removed duplicated region for block: B:219:0x05b0  */
    /* JADX WARN: Removed duplicated region for block: B:334:0x08af  */
    /* JADX WARN: Removed duplicated region for block: B:625:0x0d98  */
    /* JADX WARN: Removed duplicated region for block: B:626:0x0d9c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.util.ArrayList e(y3.C2205a r71, q3.C1910o r72, long r73, n3.C1630g r75, boolean r76, boolean r77, O5.f r78) {
        /*
            Method dump skipped, instructions count: 3580
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: y3.AbstractC2209e.e(y3.a, q3.o, long, n3.g, boolean, boolean, O5.f):java.util.ArrayList");
    }
}
