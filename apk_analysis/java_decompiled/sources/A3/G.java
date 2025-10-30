package A3;

import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.util.SparseIntArray;
import c7.C0790j;
import j3.j0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import l4.AbstractC1566a;
import q3.C1902g;
import q3.C1908m;
import q3.InterfaceC1905j;
import q3.InterfaceC1906k;
import q3.InterfaceC1907l;

/* loaded from: classes.dex */
public final class G implements InterfaceC1905j {

    /* renamed from: a, reason: collision with root package name */
    public final int f55a;

    /* renamed from: b, reason: collision with root package name */
    public final List f56b;

    /* renamed from: c, reason: collision with root package name */
    public final A4.r f57c;

    /* renamed from: d, reason: collision with root package name */
    public final SparseIntArray f58d;

    /* renamed from: e, reason: collision with root package name */
    public final C0005f f59e;

    /* renamed from: f, reason: collision with root package name */
    public final SparseArray f60f;

    /* renamed from: g, reason: collision with root package name */
    public final SparseBooleanArray f61g;

    /* renamed from: h, reason: collision with root package name */
    public final SparseBooleanArray f62h;

    /* renamed from: i, reason: collision with root package name */
    public final y f63i;
    public x j;

    /* renamed from: k, reason: collision with root package name */
    public InterfaceC1907l f64k;

    /* renamed from: l, reason: collision with root package name */
    public int f65l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f66m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f67n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f68o;

    /* renamed from: p, reason: collision with root package name */
    public J f69p;

    /* renamed from: q, reason: collision with root package name */
    public int f70q;

    /* renamed from: r, reason: collision with root package name */
    public int f71r;

    public G(int i9, l4.x xVar, C0005f c0005f) {
        this.f59e = c0005f;
        this.f55a = i9;
        if (i9 != 1 && i9 != 2) {
            ArrayList arrayList = new ArrayList();
            this.f56b = arrayList;
            arrayList.add(xVar);
        } else {
            this.f56b = Collections.singletonList(xVar);
        }
        this.f57c = new A4.r(0, new byte[9400]);
        SparseBooleanArray sparseBooleanArray = new SparseBooleanArray();
        this.f61g = sparseBooleanArray;
        this.f62h = new SparseBooleanArray();
        SparseArray sparseArray = new SparseArray();
        this.f60f = sparseArray;
        this.f58d = new SparseIntArray();
        this.f63i = new y(1);
        this.f64k = InterfaceC1907l.f22320e0;
        this.f71r = -1;
        sparseBooleanArray.clear();
        sparseArray.clear();
        SparseArray sparseArray2 = new SparseArray();
        int size = sparseArray2.size();
        for (int i10 = 0; i10 < size; i10++) {
            sparseArray.put(sparseArray2.keyAt(i10), (J) sparseArray2.valueAt(i10));
        }
        sparseArray.put(0, new C(new A1.g(this)));
        this.f69p = null;
    }

    @Override // q3.InterfaceC1905j
    public final void b(long j, long j4) {
        boolean z9;
        x xVar;
        boolean z10;
        if (this.f55a != 2) {
            z9 = true;
        } else {
            z9 = false;
        }
        AbstractC1566a.m(z9);
        List list = this.f56b;
        int size = list.size();
        for (int i9 = 0; i9 < size; i9++) {
            l4.x xVar2 = (l4.x) list.get(i9);
            if (xVar2.d() == -9223372036854775807L) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (!z10) {
                long c3 = xVar2.c();
                if (c3 != -9223372036854775807L && c3 != 0 && c3 != j4) {
                    z10 = true;
                } else {
                    z10 = false;
                }
            }
            if (z10) {
                xVar2.e(j4);
            }
        }
        if (j4 != 0 && (xVar = this.j) != null) {
            xVar.d(j4);
        }
        this.f57c.E(0);
        this.f58d.clear();
        int i10 = 0;
        while (true) {
            SparseArray sparseArray = this.f60f;
            if (i10 < sparseArray.size()) {
                ((J) sparseArray.valueAt(i10)).a();
                i10++;
            } else {
                this.f70q = 0;
                return;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v18 */
    /* JADX WARN: Type inference failed for: r2v19 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4, types: [int, boolean] */
    @Override // q3.InterfaceC1905j
    public final int f(InterfaceC1906k interfaceC1906k, C0790j c0790j) {
        ?? r22;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        boolean z9;
        long j;
        long j4;
        long j9 = ((C1902g) interfaceC1906k).f22311c;
        boolean z10 = this.f66m;
        int i17 = this.f55a;
        if (z10) {
            y yVar = this.f63i;
            if (j9 != -1 && i17 != 2 && !yVar.f318d) {
                int i18 = this.f71r;
                if (i18 <= 0) {
                    yVar.a((C1902g) interfaceC1906k);
                    return 0;
                }
                boolean z11 = yVar.f320f;
                A4.r rVar = yVar.f317c;
                if (!z11) {
                    C1902g c1902g = (C1902g) interfaceC1906k;
                    long j10 = c1902g.f22311c;
                    int min = (int) Math.min(112800, j10);
                    long j11 = j10 - min;
                    if (c1902g.f22312d != j11) {
                        c0790j.f11723a = j11;
                        return 1;
                    }
                    rVar.E(min);
                    c1902g.f22314f = 0;
                    c1902g.t((byte[]) rVar.f384c, 0, min, false);
                    int i19 = rVar.f382a;
                    int i20 = rVar.f383b;
                    int i21 = i20 - 188;
                    while (true) {
                        if (i21 >= i19) {
                            byte[] bArr = (byte[]) rVar.f384c;
                            int i22 = -4;
                            int i23 = 0;
                            while (true) {
                                if (i22 > 4) {
                                    break;
                                }
                                int i24 = (i22 * 188) + i21;
                                if (i24 >= i19 && i24 < i20 && bArr[i24] == 71) {
                                    i23++;
                                    if (i23 == 5) {
                                        long y9 = M4.a.y(rVar, i21, i18);
                                        if (y9 != -9223372036854775807L) {
                                            j4 = y9;
                                            break;
                                        }
                                    }
                                } else {
                                    i23 = 0;
                                }
                                i22++;
                            }
                            i21--;
                        } else {
                            j4 = -9223372036854775807L;
                            break;
                        }
                    }
                    yVar.f322h = j4;
                    yVar.f320f = true;
                    return 0;
                }
                if (yVar.f322h == -9223372036854775807L) {
                    yVar.a((C1902g) interfaceC1906k);
                    return 0;
                }
                if (!yVar.f319e) {
                    C1902g c1902g2 = (C1902g) interfaceC1906k;
                    int min2 = (int) Math.min(112800, c1902g2.f22311c);
                    long j12 = 0;
                    if (c1902g2.f22312d != j12) {
                        c0790j.f11723a = j12;
                        return 1;
                    }
                    rVar.E(min2);
                    c1902g2.f22314f = 0;
                    c1902g2.t((byte[]) rVar.f384c, 0, min2, false);
                    int i25 = rVar.f382a;
                    int i26 = rVar.f383b;
                    while (true) {
                        if (i25 < i26) {
                            if (((byte[]) rVar.f384c)[i25] == 71) {
                                j = M4.a.y(rVar, i25, i18);
                                if (j != -9223372036854775807L) {
                                    break;
                                }
                            }
                            i25++;
                        } else {
                            j = -9223372036854775807L;
                            break;
                        }
                    }
                    yVar.f321g = j;
                    yVar.f319e = true;
                    return 0;
                }
                long j13 = yVar.f321g;
                if (j13 == -9223372036854775807L) {
                    yVar.a((C1902g) interfaceC1906k);
                    return 0;
                }
                l4.x xVar = yVar.f316b;
                long b9 = xVar.b(yVar.f322h) - xVar.b(j13);
                yVar.f323i = b9;
                if (b9 < 0) {
                    AbstractC1566a.P("TsDurationReader", "Invalid duration: " + yVar.f323i + ". Using TIME_UNSET instead.");
                    yVar.f323i = -9223372036854775807L;
                }
                yVar.a((C1902g) interfaceC1906k);
                return 0;
            }
            if (!this.f67n) {
                this.f67n = true;
                long j14 = yVar.f323i;
                if (j14 != -9223372036854775807L) {
                    i10 = i17;
                    z9 = false;
                    x xVar2 = new x(new d0.w(11), new E(this.f71r, yVar.f316b), j14, 1 + j14, 0L, j9, 188L, 940);
                    this.j = xVar2;
                    this.f64k.r(xVar2.f311a);
                } else {
                    i10 = i17;
                    z9 = false;
                    this.f64k.r(new C1908m(j14));
                }
            } else {
                z9 = false;
                i10 = i17;
            }
            if (this.f68o) {
                this.f68o = z9;
                b(0L, 0L);
                if (((C1902g) interfaceC1906k).f22312d != 0) {
                    c0790j.f11723a = 0L;
                    return 1;
                }
            }
            i9 = 1;
            x xVar3 = this.j;
            r22 = z9;
            if (xVar3 != null) {
                r22 = z9;
                if (xVar3.f313c != null) {
                    return xVar3.b((C1902g) interfaceC1906k, c0790j);
                }
            }
        } else {
            r22 = 0;
            i9 = 1;
            i10 = i17;
        }
        A4.r rVar2 = this.f57c;
        byte[] bArr2 = (byte[]) rVar2.f384c;
        if (9400 - rVar2.f382a < 188) {
            int e8 = rVar2.e();
            if (e8 > 0) {
                System.arraycopy(bArr2, rVar2.f382a, bArr2, r22, e8);
            }
            rVar2.F(e8, bArr2);
        }
        while (rVar2.e() < 188) {
            int i27 = rVar2.f383b;
            int D8 = ((C1902g) interfaceC1906k).D(bArr2, i27, 9400 - i27);
            if (D8 == -1) {
                return -1;
            }
            rVar2.G(i27 + D8);
        }
        int i28 = rVar2.f382a;
        int i29 = rVar2.f383b;
        byte[] bArr3 = (byte[]) rVar2.f384c;
        int i30 = i28;
        while (i30 < i29 && bArr3[i30] != 71) {
            i30++;
        }
        rVar2.H(i30);
        int i31 = i30 + 188;
        J j15 = null;
        if (i31 > i29) {
            int i32 = (i30 - i28) + this.f70q;
            this.f70q = i32;
            i11 = i10;
            i12 = 2;
            if (i11 == 2 && i32 > 376) {
                throw j0.a("Cannot find sync byte. Most likely not a Transport Stream.", null);
            }
        } else {
            i11 = i10;
            i12 = 2;
            this.f70q = r22;
        }
        int i33 = rVar2.f383b;
        if (i31 > i33) {
            return r22;
        }
        int i34 = rVar2.i();
        if ((8388608 & i34) != 0) {
            rVar2.H(i31);
            return r22;
        }
        if ((4194304 & i34) != 0) {
            i13 = i9;
        } else {
            i13 = r22;
        }
        int i35 = (2096896 & i34) >> 8;
        if ((i34 & 32) != 0) {
            i14 = i9;
        } else {
            i14 = r22;
        }
        if ((i34 & 16) != 0) {
            j15 = (J) this.f60f.get(i35);
        }
        if (j15 == null) {
            rVar2.H(i31);
            return r22;
        }
        if (i11 != i12) {
            int i36 = i34 & 15;
            SparseIntArray sparseIntArray = this.f58d;
            i15 = i9;
            int i37 = sparseIntArray.get(i35, i36 - 1);
            sparseIntArray.put(i35, i36);
            if (i37 == i36) {
                rVar2.H(i31);
                return r22;
            }
            if (i36 != ((i37 + 1) & 15)) {
                j15.a();
            }
        } else {
            i15 = i9;
        }
        if (i14 != 0) {
            int x5 = rVar2.x();
            if ((rVar2.x() & 64) != 0) {
                i16 = i12;
            } else {
                i16 = r22;
            }
            i13 |= i16;
            rVar2.I(x5 - 1);
        }
        boolean z12 = this.f66m;
        if (i11 == i12 || z12 || !this.f62h.get(i35, r22)) {
            rVar2.G(i31);
            j15.c(i13, rVar2);
            rVar2.G(i33);
        }
        if (i11 != i12 && !z12 && this.f66m && j9 != -1) {
            this.f68o = i15;
        }
        rVar2.H(i31);
        return r22;
    }

    @Override // q3.InterfaceC1905j
    public final void i(InterfaceC1907l interfaceC1907l) {
        this.f64k = interfaceC1907l;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0020, code lost:
    
        r2 = r2 + 1;
     */
    @Override // q3.InterfaceC1905j
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean j(q3.InterfaceC1906k r7) {
        /*
            r6 = this;
            A4.r r0 = r6.f57c
            java.lang.Object r0 = r0.f384c
            byte[] r0 = (byte[]) r0
            q3.g r7 = (q3.C1902g) r7
            r1 = 0
            r2 = 940(0x3ac, float:1.317E-42)
            r7.t(r0, r1, r2, r1)
            r2 = r1
        Lf:
            r3 = 188(0xbc, float:2.63E-43)
            if (r2 >= r3) goto L2b
            r3 = r1
        L14:
            r4 = 5
            if (r3 >= r4) goto L26
            int r4 = r3 * 188
            int r4 = r4 + r2
            r4 = r0[r4]
            r5 = 71
            if (r4 == r5) goto L23
            int r2 = r2 + 1
            goto Lf
        L23:
            int r3 = r3 + 1
            goto L14
        L26:
            r7.n(r2)
            r7 = 1
            return r7
        L2b:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: A3.G.j(q3.k):boolean");
    }

    @Override // q3.InterfaceC1905j
    public final void a() {
    }
}
