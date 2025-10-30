package A3;

import j3.L;
import j3.M;
import l3.AbstractC1552a;
import l3.C1553b;
import l4.AbstractC1566a;
import q3.InterfaceC1907l;

/* renamed from: A3.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0001b implements InterfaceC0008i {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f82a;

    /* renamed from: b, reason: collision with root package name */
    public final Z3.f f83b;

    /* renamed from: c, reason: collision with root package name */
    public final A4.r f84c;

    /* renamed from: d, reason: collision with root package name */
    public final String f85d;

    /* renamed from: e, reason: collision with root package name */
    public String f86e;

    /* renamed from: f, reason: collision with root package name */
    public q3.u f87f;

    /* renamed from: g, reason: collision with root package name */
    public int f88g;

    /* renamed from: h, reason: collision with root package name */
    public int f89h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f90i;
    public long j;

    /* renamed from: k, reason: collision with root package name */
    public M f91k;

    /* renamed from: l, reason: collision with root package name */
    public int f92l;

    /* renamed from: m, reason: collision with root package name */
    public long f93m;

    public C0001b(String str, int i9) {
        this.f82a = i9;
        switch (i9) {
            case 1:
                byte[] bArr = new byte[16];
                this.f83b = new Z3.f(16, bArr);
                this.f84c = new A4.r(bArr);
                this.f88g = 0;
                this.f89h = 0;
                this.f90i = false;
                this.f93m = -9223372036854775807L;
                this.f85d = str;
                return;
            default:
                byte[] bArr2 = new byte[128];
                this.f83b = new Z3.f(128, bArr2);
                this.f84c = new A4.r(bArr2);
                this.f88g = 0;
                this.f93m = -9223372036854775807L;
                this.f85d = str;
                return;
        }
    }

    @Override // A3.InterfaceC0008i
    public final void a() {
        switch (this.f82a) {
            case 0:
                this.f88g = 0;
                this.f89h = 0;
                this.f90i = false;
                this.f93m = -9223372036854775807L;
                return;
            default:
                this.f88g = 0;
                this.f89h = 0;
                this.f90i = false;
                this.f93m = -9223372036854775807L;
                return;
        }
    }

    @Override // A3.InterfaceC0008i
    public final void c(A4.r rVar) {
        boolean z9;
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        switch (this.f82a) {
            case 0:
                AbstractC1566a.n(this.f87f);
                while (rVar.e() > 0) {
                    int i9 = this.f88g;
                    A4.r rVar2 = this.f84c;
                    if (i9 == 0) {
                        while (true) {
                            if (rVar.e() <= 0) {
                                break;
                            }
                            if (!this.f90i) {
                                if (rVar.x() == 11) {
                                    z9 = true;
                                } else {
                                    z9 = false;
                                }
                                this.f90i = z9;
                            } else {
                                int x5 = rVar.x();
                                if (x5 == 119) {
                                    this.f90i = false;
                                    this.f88g = 1;
                                    byte[] bArr = (byte[]) rVar2.f384c;
                                    bArr[0] = 11;
                                    bArr[1] = 119;
                                    this.f89h = 2;
                                } else {
                                    if (x5 == 11) {
                                        z10 = true;
                                    } else {
                                        z10 = false;
                                    }
                                    this.f90i = z10;
                                }
                            }
                        }
                    } else if (i9 != 1) {
                        if (i9 == 2) {
                            int min = Math.min(rVar.e(), this.f92l - this.f89h);
                            this.f87f.c(min, rVar);
                            int i10 = this.f89h + min;
                            this.f89h = i10;
                            int i11 = this.f92l;
                            if (i10 == i11) {
                                long j = this.f93m;
                                if (j != -9223372036854775807L) {
                                    this.f87f.d(j, 1, i11, 0, null);
                                    this.f93m += this.j;
                                }
                                this.f88g = 0;
                            }
                        }
                    } else {
                        byte[] bArr2 = (byte[]) rVar2.f384c;
                        int min2 = Math.min(rVar.e(), 128 - this.f89h);
                        rVar.h(bArr2, this.f89h, min2);
                        int i12 = this.f89h + min2;
                        this.f89h = i12;
                        if (i12 == 128) {
                            Z3.f fVar = this.f83b;
                            fVar.o(0);
                            C1553b g9 = AbstractC1552a.g(fVar);
                            M m9 = this.f91k;
                            String str = g9.f20388e;
                            int i13 = g9.f20384a;
                            int i14 = g9.f20385b;
                            if (m9 == null || i14 != m9.f19448y || i13 != m9.f19449z || !l4.y.a(str, m9.f19435l)) {
                                L l9 = new L();
                                l9.f19393a = this.f86e;
                                l9.f19402k = str;
                                l9.f19415x = i14;
                                l9.f19416y = i13;
                                l9.f19395c = this.f85d;
                                M m10 = new M(l9);
                                this.f91k = m10;
                                this.f87f.e(m10);
                            }
                            this.f92l = g9.f20386c;
                            this.j = (g9.f20387d * 1000000) / this.f91k.f19449z;
                            rVar2.H(0);
                            this.f87f.c(128, rVar2);
                            this.f88g = 2;
                        }
                    }
                }
                return;
            default:
                AbstractC1566a.n(this.f87f);
                while (rVar.e() > 0) {
                    int i15 = this.f88g;
                    A4.r rVar3 = this.f84c;
                    if (i15 != 0) {
                        if (i15 != 1) {
                            if (i15 == 2) {
                                int min3 = Math.min(rVar.e(), this.f92l - this.f89h);
                                this.f87f.c(min3, rVar);
                                int i16 = this.f89h + min3;
                                this.f89h = i16;
                                int i17 = this.f92l;
                                if (i16 == i17) {
                                    long j4 = this.f93m;
                                    if (j4 != -9223372036854775807L) {
                                        this.f87f.d(j4, 1, i17, 0, null);
                                        this.f93m += this.j;
                                    }
                                    this.f88g = 0;
                                }
                            }
                        } else {
                            byte[] bArr3 = (byte[]) rVar3.f384c;
                            int min4 = Math.min(rVar.e(), 16 - this.f89h);
                            rVar.h(bArr3, this.f89h, min4);
                            int i18 = this.f89h + min4;
                            this.f89h = i18;
                            if (i18 == 16) {
                                Z3.f fVar2 = this.f83b;
                                fVar2.o(0);
                                O4.d h7 = AbstractC1552a.h(fVar2);
                                M m11 = this.f91k;
                                int i19 = h7.f5459a;
                                if (m11 == null || 2 != m11.f19448y || i19 != m11.f19449z || !"audio/ac4".equals(m11.f19435l)) {
                                    L l10 = new L();
                                    l10.f19393a = this.f86e;
                                    l10.f19402k = "audio/ac4";
                                    l10.f19415x = 2;
                                    l10.f19416y = i19;
                                    l10.f19395c = this.f85d;
                                    M m12 = new M(l10);
                                    this.f91k = m12;
                                    this.f87f.e(m12);
                                }
                                this.f92l = h7.f5460b;
                                this.j = (h7.f5461c * 1000000) / this.f91k.f19449z;
                                rVar3.H(0);
                                this.f87f.c(16, rVar3);
                                this.f88g = 2;
                            }
                        }
                    } else {
                        while (rVar.e() > 0) {
                            if (!this.f90i) {
                                if (rVar.x() == 172) {
                                    z11 = true;
                                } else {
                                    z11 = false;
                                }
                                this.f90i = z11;
                            } else {
                                int x9 = rVar.x();
                                if (x9 == 172) {
                                    z12 = true;
                                } else {
                                    z12 = false;
                                }
                                this.f90i = z12;
                                int i20 = 65;
                                if (x9 == 64 || x9 == 65) {
                                    if (x9 == 65) {
                                        z13 = true;
                                    } else {
                                        z13 = false;
                                    }
                                    this.f88g = 1;
                                    byte[] bArr4 = (byte[]) rVar3.f384c;
                                    bArr4[0] = -84;
                                    if (!z13) {
                                        i20 = 64;
                                    }
                                    bArr4[1] = (byte) i20;
                                    this.f89h = 2;
                                }
                            }
                        }
                    }
                }
                return;
        }
    }

    @Override // A3.InterfaceC0008i
    public final void d() {
        int i9 = this.f82a;
    }

    @Override // A3.InterfaceC0008i
    public final void e(long j, int i9) {
        switch (this.f82a) {
            case 0:
                if (j != -9223372036854775807L) {
                    this.f93m = j;
                    return;
                }
                return;
            default:
                if (j != -9223372036854775807L) {
                    this.f93m = j;
                    return;
                }
                return;
        }
    }

    @Override // A3.InterfaceC0008i
    public final void f(InterfaceC1907l interfaceC1907l, I i9) {
        switch (this.f82a) {
            case 0:
                i9.a();
                i9.b();
                this.f86e = i9.f78e;
                i9.b();
                this.f87f = interfaceC1907l.u(i9.f77d, 1);
                return;
            default:
                i9.a();
                i9.b();
                this.f86e = i9.f78e;
                i9.b();
                this.f87f = interfaceC1907l.u(i9.f77d, 1);
                return;
        }
    }

    private final void b() {
    }

    private final void g() {
    }
}
