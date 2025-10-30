package K3;

import A4.r;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import l4.x;

/* loaded from: classes.dex */
public final class c extends v4.e {

    /* renamed from: h, reason: collision with root package name */
    public final r f4260h = new r(5, false);

    /* renamed from: i, reason: collision with root package name */
    public final Z3.f f4261i = new Z3.f();
    public x j;

    /* JADX WARN: Multi-variable type inference failed */
    @Override // v4.e
    public final D3.c j(D3.e eVar, ByteBuffer byteBuffer) {
        int i9;
        Object obj;
        boolean z9;
        int i10;
        long j;
        int i11;
        long j4;
        long j9;
        boolean z10;
        boolean z11;
        boolean z12;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        long j10;
        long j11;
        int i18;
        boolean z13;
        List list;
        long j12;
        long j13;
        boolean z14;
        boolean z15;
        boolean z16;
        boolean z17;
        int i19;
        int i20;
        int i21;
        boolean z18;
        boolean z19;
        boolean z20;
        boolean z21;
        long j14;
        char c3;
        long j15;
        boolean z22;
        long j16;
        int i22 = 1;
        x xVar = this.j;
        if (xVar == null || eVar.f1789i != xVar.d()) {
            x xVar2 = new x(eVar.f20706f);
            this.j = xVar2;
            xVar2.a(eVar.f20706f - eVar.f1789i);
        }
        byte[] array = byteBuffer.array();
        int limit = byteBuffer.limit();
        r rVar = this.f4260h;
        rVar.F(limit, array);
        Z3.f fVar = this.f4261i;
        fVar.n(limit, array);
        fVar.r(39);
        long i23 = (fVar.i(1) << 32) | fVar.i(32);
        fVar.r(20);
        int i24 = fVar.i(12);
        int i25 = fVar.i(8);
        rVar.I(14);
        if (i25 != 0) {
            if (i25 != 255) {
                long j17 = 1;
                long j18 = -9223372036854775807L;
                if (i25 != 4) {
                    if (i25 != 5) {
                        if (i25 != 6) {
                            obj = null;
                        } else {
                            x xVar3 = this.j;
                            long a5 = j.a(i23, rVar);
                            obj = new j(a5, xVar3.b(a5));
                        }
                        i9 = 1;
                    } else {
                        x xVar4 = this.j;
                        long y9 = rVar.y();
                        if ((rVar.x() & 128) != 0) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        List list2 = Collections.EMPTY_LIST;
                        if (!z13) {
                            int x5 = rVar.x();
                            if ((x5 & 128) != 0) {
                                z18 = true;
                            } else {
                                z18 = false;
                            }
                            if ((x5 & 64) != 0) {
                                z19 = true;
                            } else {
                                z19 = false;
                            }
                            if ((x5 & 32) != 0) {
                                z20 = true;
                            } else {
                                z20 = false;
                            }
                            if ((x5 & 16) != 0) {
                                z21 = true;
                            } else {
                                z21 = false;
                            }
                            if (z19 && !z21) {
                                j14 = j.a(i23, rVar);
                            } else {
                                j14 = -9223372036854775807L;
                            }
                            if (!z19) {
                                int x9 = rVar.x();
                                c3 = ' ';
                                ArrayList arrayList = new ArrayList(x9);
                                j15 = 90;
                                for (int i26 = 0; i26 < x9; i26++) {
                                    int x10 = rVar.x();
                                    if (!z21) {
                                        j16 = j.a(i23, rVar);
                                    } else {
                                        j16 = -9223372036854775807L;
                                    }
                                    arrayList.add(new d(j16, xVar4.b(j16), x10));
                                }
                                list2 = arrayList;
                            } else {
                                c3 = ' ';
                                j15 = 90;
                            }
                            if (z20) {
                                long x11 = rVar.x();
                                if ((x11 & 128) != 0) {
                                    z22 = true;
                                } else {
                                    z22 = false;
                                }
                                j18 = ((((x11 & 1) << c3) | rVar.y()) * 1000) / j15;
                            } else {
                                z22 = false;
                            }
                            int C8 = rVar.C();
                            int x12 = rVar.x();
                            z17 = z22;
                            list = list2;
                            i21 = rVar.x();
                            i19 = C8;
                            i20 = x12;
                            z14 = z18;
                            j13 = j18;
                            j12 = j14;
                            z16 = z21;
                            z15 = z19;
                        } else {
                            list = list2;
                            j12 = -9223372036854775807L;
                            j13 = -9223372036854775807L;
                            z14 = false;
                            z15 = false;
                            z16 = false;
                            z17 = false;
                            i19 = 0;
                            i20 = 0;
                            i21 = 0;
                        }
                        i9 = 1;
                        obj = new e(y9, z13, z14, z15, z16, j12, xVar4.b(j12), list, z17, j13, i19, i20, i21);
                    }
                } else {
                    int x13 = rVar.x();
                    ArrayList arrayList2 = new ArrayList(x13);
                    int i27 = 0;
                    while (i27 < x13) {
                        long y10 = rVar.y();
                        if ((rVar.x() & 128) != 0) {
                            z9 = i22;
                        } else {
                            z9 = 0;
                        }
                        ArrayList arrayList3 = new ArrayList();
                        if (z9 == 0) {
                            int x14 = rVar.x();
                            if ((x14 & 128) != 0) {
                                i15 = i22;
                            } else {
                                i15 = 0;
                            }
                            if ((x14 & 64) != 0) {
                                i16 = i22;
                            } else {
                                i16 = 0;
                            }
                            if ((x14 & 32) != 0) {
                                i17 = i22;
                            } else {
                                i17 = 0;
                            }
                            if (i16 != 0) {
                                j10 = rVar.y();
                            } else {
                                j10 = -9223372036854775807L;
                            }
                            if (i16 == 0) {
                                int x15 = rVar.x();
                                ArrayList arrayList4 = new ArrayList(x15);
                                int i28 = 0;
                                while (i28 < x15) {
                                    arrayList4.add(new g(rVar.y(), rVar.x()));
                                    i28++;
                                    i27 = i27;
                                    j17 = j17;
                                    i22 = i22;
                                }
                                arrayList3 = arrayList4;
                            }
                            i10 = i22;
                            j = j17;
                            i11 = i27;
                            if (i17 != 0) {
                                long x16 = rVar.x();
                                if ((x16 & 128) != 0) {
                                    i18 = i10;
                                } else {
                                    i18 = 0;
                                }
                                j11 = ((((x16 & j) << 32) | rVar.y()) * 1000) / 90;
                            } else {
                                j11 = -9223372036854775807L;
                                i18 = 0;
                            }
                            z12 = i18;
                            j9 = j11;
                            i12 = rVar.C();
                            z10 = i15;
                            z11 = i16;
                            j4 = j10;
                            i13 = rVar.x();
                            i14 = rVar.x();
                        } else {
                            i10 = i22;
                            j = j17;
                            i11 = i27;
                            j4 = -9223372036854775807L;
                            j9 = -9223372036854775807L;
                            z10 = 0;
                            z11 = 0;
                            z12 = 0;
                            i12 = 0;
                            i13 = 0;
                            i14 = 0;
                        }
                        arrayList2.add(new h(y10, z9, z10, z11, arrayList3, j4, z12, j9, i12, i13, i14));
                        i27 = i11 + 1;
                        j17 = j;
                        i22 = i10;
                    }
                    i9 = i22;
                    obj = new i(arrayList2);
                }
            } else {
                i9 = 1;
                long y11 = rVar.y();
                int i29 = i24 - 4;
                byte[] bArr = new byte[i29];
                rVar.h(bArr, 0, i29);
                obj = new a(y11, bArr, i23);
            }
        } else {
            i9 = 1;
            obj = new Object();
        }
        if (obj == null) {
            return new D3.c(new D3.b[0]);
        }
        D3.b[] bVarArr = new D3.b[i9];
        bVarArr[0] = obj;
        return new D3.c(bVarArr);
    }
}
