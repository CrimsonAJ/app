package t3;

import A3.E;
import A3.x;
import A4.r;
import D3.b;
import D3.c;
import I3.i;
import P5.F;
import Z3.f;
import c7.C0790j;
import com.google.android.gms.internal.measurement.D1;
import com.google.android.gms.internal.measurement.Y1;
import i.G;
import j2.C1435b;
import j3.j0;
import java.util.Arrays;
import l4.y;
import l6.AbstractC1570b;
import q3.C1902g;
import q3.C1908m;
import q3.C1909n;
import q3.InterfaceC1905j;
import q3.InterfaceC1906k;
import q3.InterfaceC1907l;
import q3.u;

/* renamed from: t3.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2008a implements InterfaceC1905j {

    /* renamed from: e, reason: collision with root package name */
    public InterfaceC1907l f23111e;

    /* renamed from: f, reason: collision with root package name */
    public u f23112f;

    /* renamed from: h, reason: collision with root package name */
    public c f23114h;

    /* renamed from: i, reason: collision with root package name */
    public C1909n f23115i;
    public int j;

    /* renamed from: k, reason: collision with root package name */
    public int f23116k;

    /* renamed from: l, reason: collision with root package name */
    public x f23117l;

    /* renamed from: m, reason: collision with root package name */
    public int f23118m;

    /* renamed from: n, reason: collision with root package name */
    public long f23119n;

    /* renamed from: a, reason: collision with root package name */
    public final byte[] f23107a = new byte[42];

    /* renamed from: b, reason: collision with root package name */
    public final r f23108b = new r(0, new byte[32768]);

    /* renamed from: c, reason: collision with root package name */
    public final boolean f23109c = false;

    /* renamed from: d, reason: collision with root package name */
    public final C0790j f23110d = new Object();

    /* renamed from: g, reason: collision with root package name */
    public int f23113g = 0;

    @Override // q3.InterfaceC1905j
    public final void b(long j, long j4) {
        long j9 = 0;
        if (j == 0) {
            this.f23113g = 0;
        } else {
            x xVar = this.f23117l;
            if (xVar != null) {
                xVar.d(j4);
            }
        }
        if (j4 != 0) {
            j9 = -1;
        }
        this.f23119n = j9;
        this.f23118m = 0;
        this.f23108b.E(0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v14 */
    /* JADX WARN: Type inference failed for: r1v15, types: [int, boolean] */
    /* JADX WARN: Type inference failed for: r1v28 */
    @Override // q3.InterfaceC1905j
    public final int f(InterfaceC1906k interfaceC1906k, C0790j c0790j) {
        C6.a aVar;
        int i9;
        int i10;
        c cVar;
        C1909n c1909n;
        c cVar2;
        int i11;
        q3.r c1908m;
        long j;
        long j4;
        long j9;
        boolean z9;
        long j10;
        boolean z10;
        boolean z11;
        boolean z12 = true;
        int i12 = this.f23113g;
        c cVar3 = null;
        if (i12 != 0) {
            byte[] bArr = this.f23107a;
            if (i12 != 1) {
                int i13 = 24;
                int i14 = 3;
                if (i12 != 2) {
                    int i15 = 7;
                    if (i12 != 3) {
                        long j11 = 0;
                        if (i12 != 4) {
                            if (i12 == 5) {
                                this.f23112f.getClass();
                                this.f23115i.getClass();
                                x xVar = this.f23117l;
                                if (xVar != null && xVar.f313c != null) {
                                    return xVar.b((C1902g) interfaceC1906k, c0790j);
                                }
                                if (this.f23119n == -1) {
                                    C1909n c1909n2 = this.f23115i;
                                    ((C1902g) interfaceC1906k).f22314f = 0;
                                    C1902g c1902g = (C1902g) interfaceC1906k;
                                    c1902g.c(1, false);
                                    byte[] bArr2 = new byte[1];
                                    c1902g.t(bArr2, 0, 1, false);
                                    if ((bArr2[0] & 1) == 1) {
                                        z11 = true;
                                    } else {
                                        z11 = false;
                                    }
                                    c1902g.c(2, false);
                                    if (!z11) {
                                        i15 = 6;
                                    }
                                    r rVar = new r(i15);
                                    byte[] bArr3 = (byte[]) rVar.f384c;
                                    int i16 = 0;
                                    while (i16 < i15) {
                                        int h7 = c1902g.h(bArr3, i16, i15 - i16);
                                        if (h7 == -1) {
                                            break;
                                        }
                                        i16 += h7;
                                    }
                                    rVar.G(i16);
                                    c1902g.f22314f = 0;
                                    try {
                                        j11 = rVar.D();
                                        if (!z11) {
                                            j11 *= c1909n2.f22325b;
                                        }
                                    } catch (NumberFormatException unused) {
                                        z12 = false;
                                    }
                                    if (z12) {
                                        this.f23119n = j11;
                                    } else {
                                        throw j0.a(null, null);
                                    }
                                } else {
                                    r rVar2 = this.f23108b;
                                    int i17 = rVar2.f383b;
                                    if (i17 < 32768) {
                                        int D8 = ((C1902g) interfaceC1906k).D((byte[]) rVar2.f384c, i17, 32768 - i17);
                                        if (D8 == -1) {
                                            z9 = true;
                                        } else {
                                            z9 = false;
                                        }
                                        if (!z9) {
                                            rVar2.G(i17 + D8);
                                        } else if (rVar2.e() == 0) {
                                            long j12 = this.f23119n * 1000000;
                                            C1909n c1909n3 = this.f23115i;
                                            int i18 = y.f20553a;
                                            this.f23112f.d(j12 / c1909n3.f22328e, 1, this.f23118m, 0, null);
                                            return -1;
                                        }
                                    } else {
                                        z9 = false;
                                    }
                                    int i19 = rVar2.f382a;
                                    int i20 = this.f23118m;
                                    int i21 = this.j;
                                    if (i20 < i21) {
                                        rVar2.I(Math.min(i21 - i20, rVar2.e()));
                                    }
                                    this.f23115i.getClass();
                                    int i22 = rVar2.f382a;
                                    while (true) {
                                        int i23 = rVar2.f383b - 16;
                                        C0790j c0790j2 = this.f23110d;
                                        if (i22 <= i23) {
                                            rVar2.H(i22);
                                            if (D1.f(rVar2, this.f23115i, this.f23116k, c0790j2)) {
                                                rVar2.H(i22);
                                                j10 = c0790j2.f11723a;
                                                break;
                                            }
                                            i22++;
                                        } else {
                                            if (z9) {
                                                while (true) {
                                                    int i24 = rVar2.f383b;
                                                    if (i22 <= i24 - this.j) {
                                                        rVar2.H(i22);
                                                        try {
                                                            z10 = D1.f(rVar2, this.f23115i, this.f23116k, c0790j2);
                                                        } catch (IndexOutOfBoundsException unused2) {
                                                            z10 = false;
                                                        }
                                                        if (rVar2.f382a > rVar2.f383b) {
                                                            z10 = false;
                                                        }
                                                        if (z10) {
                                                            rVar2.H(i22);
                                                            j10 = c0790j2.f11723a;
                                                            break;
                                                        }
                                                        i22++;
                                                    } else {
                                                        rVar2.H(i24);
                                                        break;
                                                    }
                                                }
                                            } else {
                                                rVar2.H(i22);
                                            }
                                            j10 = -1;
                                        }
                                    }
                                    int i25 = rVar2.f382a - i19;
                                    rVar2.H(i19);
                                    this.f23112f.c(i25, rVar2);
                                    int i26 = this.f23118m + i25;
                                    this.f23118m = i26;
                                    if (j10 != -1) {
                                        long j13 = this.f23119n * 1000000;
                                        C1909n c1909n4 = this.f23115i;
                                        int i27 = y.f20553a;
                                        this.f23112f.d(j13 / c1909n4.f22328e, 1, i26, 0, null);
                                        this.f23118m = 0;
                                        this.f23119n = j10;
                                    }
                                    if (rVar2.e() < 16) {
                                        int e8 = rVar2.e();
                                        byte[] bArr4 = (byte[]) rVar2.f384c;
                                        System.arraycopy(bArr4, rVar2.f382a, bArr4, 0, e8);
                                        rVar2.H(0);
                                        rVar2.G(e8);
                                    }
                                }
                                return 0;
                            }
                            throw new IllegalStateException();
                        }
                        ((C1902g) interfaceC1906k).f22314f = 0;
                        byte[] bArr5 = new byte[2];
                        C1902g c1902g2 = (C1902g) interfaceC1906k;
                        c1902g2.t(bArr5, 0, 2, false);
                        int i28 = (bArr5[1] & 255) | ((bArr5[0] & 255) << 8);
                        if ((i28 >> 2) == 16382) {
                            c1902g2.f22314f = 0;
                            this.f23116k = i28;
                            InterfaceC1907l interfaceC1907l = this.f23111e;
                            int i29 = y.f20553a;
                            long j14 = c1902g2.f22312d;
                            this.f23115i.getClass();
                            C1909n c1909n5 = this.f23115i;
                            if (c1909n5.f22333k != null) {
                                c1908m = new C1908m(0, j14, c1909n5);
                                i11 = 0;
                            } else {
                                long j15 = c1902g2.f22311c;
                                if (j15 != -1 && c1909n5.j > 0) {
                                    int i30 = this.f23116k;
                                    C1435b c1435b = new C1435b(15, c1909n5);
                                    E e9 = new E(c1909n5, i30);
                                    long b9 = c1909n5.b();
                                    int i31 = c1909n5.f22326c;
                                    int i32 = c1909n5.f22327d;
                                    if (i32 > 0) {
                                        i11 = 0;
                                        j = j14;
                                        j9 = ((i32 + i31) / 2) + 1;
                                    } else {
                                        i11 = 0;
                                        j = j14;
                                        int i33 = c1909n5.f22325b;
                                        int i34 = c1909n5.f22324a;
                                        if (i34 == i33 && i34 > 0) {
                                            j4 = i34;
                                        } else {
                                            j4 = 4096;
                                        }
                                        j9 = 64 + (((j4 * c1909n5.f22330g) * c1909n5.f22331h) / 8);
                                    }
                                    x xVar2 = new x(c1435b, e9, b9, c1909n5.j, j, j15, j9, Math.max(6, i31));
                                    this.f23117l = xVar2;
                                    c1908m = xVar2.f311a;
                                } else {
                                    i11 = 0;
                                    c1908m = new C1908m(c1909n5.b());
                                }
                            }
                            interfaceC1907l.r(c1908m);
                            this.f23113g = 5;
                            return i11;
                        }
                        c1902g2.f22314f = 0;
                        throw j0.a("First frame does not start with sync code.", null);
                    }
                    ?? r1 = 0;
                    C1909n c1909n6 = this.f23115i;
                    boolean z13 = false;
                    while (!z13) {
                        ((C1902g) interfaceC1906k).f22314f = r1;
                        byte[] bArr6 = new byte[4];
                        f fVar = new f(4, bArr6);
                        C1902g c1902g3 = (C1902g) interfaceC1906k;
                        c1902g3.t(bArr6, r1, 4, r1);
                        boolean h9 = fVar.h();
                        int i35 = fVar.i(i15);
                        int i36 = fVar.i(i13) + 4;
                        if (i35 == 0) {
                            byte[] bArr7 = new byte[38];
                            c1902g3.e(bArr7, r1, 38, r1);
                            c1909n6 = new C1909n(4, bArr7);
                            i9 = i13;
                            i10 = i14;
                        } else if (c1909n6 != null) {
                            if (i35 == i14) {
                                r rVar3 = new r(i36);
                                c1902g3.e((byte[]) rVar3.f384c, 0, i36, false);
                                i9 = i13;
                                i10 = i14;
                                c1909n = new C1909n(c1909n6.f22324a, c1909n6.f22325b, c1909n6.f22326c, c1909n6.f22327d, c1909n6.f22328e, c1909n6.f22330g, c1909n6.f22331h, c1909n6.j, Y1.A(rVar3), c1909n6.f22334l);
                            } else {
                                i9 = i13;
                                i10 = i14;
                                c cVar4 = c1909n6.f22334l;
                                if (i35 == 4) {
                                    r rVar4 = new r(i36);
                                    c1902g3.e((byte[]) rVar4.f384c, 0, i36, false);
                                    rVar4.I(4);
                                    c s9 = AbstractC1570b.s(Arrays.asList(AbstractC1570b.v(rVar4, false, false).f22358a));
                                    if (cVar4 == null) {
                                        cVar2 = s9;
                                    } else {
                                        if (s9 != null) {
                                            b[] bVarArr = s9.f1786a;
                                            if (bVarArr.length != 0) {
                                                int i37 = y.f20553a;
                                                b[] bVarArr2 = cVar4.f1786a;
                                                Object[] copyOf = Arrays.copyOf(bVarArr2, bVarArr2.length + bVarArr.length);
                                                System.arraycopy(bVarArr, 0, copyOf, bVarArr2.length, bVarArr.length);
                                                cVar2 = new c(cVar4.f1787b, (b[]) copyOf);
                                            }
                                        }
                                        cVar2 = cVar4;
                                    }
                                    c1909n = new C1909n(c1909n6.f22324a, c1909n6.f22325b, c1909n6.f22326c, c1909n6.f22327d, c1909n6.f22328e, c1909n6.f22330g, c1909n6.f22331h, c1909n6.j, c1909n6.f22333k, cVar2);
                                } else if (i35 == 6) {
                                    r rVar5 = new r(i36);
                                    c1902g3.e((byte[]) rVar5.f384c, 0, i36, false);
                                    rVar5.I(4);
                                    c cVar5 = new c(F.s(G3.a.a(rVar5)));
                                    if (cVar4 != null) {
                                        b[] bVarArr3 = cVar5.f1786a;
                                        if (bVarArr3.length == 0) {
                                            cVar = cVar4;
                                            c1909n = new C1909n(c1909n6.f22324a, c1909n6.f22325b, c1909n6.f22326c, c1909n6.f22327d, c1909n6.f22328e, c1909n6.f22330g, c1909n6.f22331h, c1909n6.j, c1909n6.f22333k, cVar);
                                        } else {
                                            int i38 = y.f20553a;
                                            b[] bVarArr4 = cVar4.f1786a;
                                            Object[] copyOf2 = Arrays.copyOf(bVarArr4, bVarArr4.length + bVarArr3.length);
                                            System.arraycopy(bVarArr3, 0, copyOf2, bVarArr4.length, bVarArr3.length);
                                            cVar5 = new c(cVar4.f1787b, (b[]) copyOf2);
                                        }
                                    }
                                    cVar = cVar5;
                                    c1909n = new C1909n(c1909n6.f22324a, c1909n6.f22325b, c1909n6.f22326c, c1909n6.f22327d, c1909n6.f22328e, c1909n6.f22330g, c1909n6.f22331h, c1909n6.j, c1909n6.f22333k, cVar);
                                } else {
                                    c1902g3.n(i36);
                                }
                            }
                            c1909n6 = c1909n;
                        } else {
                            throw new IllegalArgumentException();
                        }
                        int i39 = y.f20553a;
                        this.f23115i = c1909n6;
                        z13 = h9;
                        i13 = i9;
                        i14 = i10;
                        r1 = 0;
                        i15 = 7;
                    }
                    this.f23115i.getClass();
                    this.j = Math.max(this.f23115i.f22326c, 6);
                    u uVar = this.f23112f;
                    int i40 = y.f20553a;
                    uVar.e(this.f23115i.c(bArr, this.f23114h));
                    this.f23113g = 4;
                    return 0;
                }
                ((C1902g) interfaceC1906k).e(new byte[4], 0, 4, false);
                if (((r2[3] & 255) | ((r2[1] & 255) << 16) | ((r2[0] & 255) << 24) | ((r2[2] & 255) << 8)) == 1716281667) {
                    this.f23113g = 3;
                    return 0;
                }
                throw j0.a("Failed to read FLAC stream marker.", null);
            }
            ((C1902g) interfaceC1906k).t(bArr, 0, bArr.length, false);
            ((C1902g) interfaceC1906k).f22314f = 0;
            this.f23113g = 2;
            return 0;
        }
        ((C1902g) interfaceC1906k).f22314f = 0;
        C1902g c1902g4 = (C1902g) interfaceC1906k;
        long w7 = c1902g4.w();
        if (!this.f23109c) {
            aVar = null;
        } else {
            aVar = i.f3507i;
        }
        c r5 = new G(12).r(c1902g4, aVar);
        if (r5 != null && r5.f1786a.length != 0) {
            cVar3 = r5;
        }
        c1902g4.n((int) (c1902g4.w() - w7));
        this.f23114h = cVar3;
        this.f23113g = 1;
        return 0;
    }

    @Override // q3.InterfaceC1905j
    public final void i(InterfaceC1907l interfaceC1907l) {
        this.f23111e = interfaceC1907l;
        this.f23112f = interfaceC1907l.u(0, 1);
        interfaceC1907l.i();
    }

    @Override // q3.InterfaceC1905j
    public final boolean j(InterfaceC1906k interfaceC1906k) {
        C1902g c1902g = (C1902g) interfaceC1906k;
        c r5 = new G(12).r(c1902g, i.f3507i);
        if (r5 != null) {
            int length = r5.f1786a.length;
        }
        c1902g.t(new byte[4], 0, 4, false);
        if (((r1[3] & 255) | ((r1[0] & 255) << 24) | ((r1[1] & 255) << 16) | ((r1[2] & 255) << 8)) != 1716281667) {
            return false;
        }
        return true;
    }

    @Override // q3.InterfaceC1905j
    public final void a() {
    }
}
