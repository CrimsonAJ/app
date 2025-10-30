package A3;

import com.google.android.gms.internal.measurement.AbstractC0953k1;
import l4.AbstractC1566a;
import q3.InterfaceC1907l;

/* loaded from: classes.dex */
public final class w implements J {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC0008i f300a;

    /* renamed from: b, reason: collision with root package name */
    public final Z3.f f301b = new Z3.f(10, new byte[10]);

    /* renamed from: c, reason: collision with root package name */
    public int f302c = 0;

    /* renamed from: d, reason: collision with root package name */
    public int f303d;

    /* renamed from: e, reason: collision with root package name */
    public l4.x f304e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f305f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f306g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f307h;

    /* renamed from: i, reason: collision with root package name */
    public int f308i;
    public int j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f309k;

    /* renamed from: l, reason: collision with root package name */
    public long f310l;

    public w(InterfaceC0008i interfaceC0008i) {
        this.f300a = interfaceC0008i;
    }

    @Override // A3.J
    public final void a() {
        this.f302c = 0;
        this.f303d = 0;
        this.f307h = false;
        this.f300a.a();
    }

    @Override // A3.J
    public final void b(l4.x xVar, InterfaceC1907l interfaceC1907l, I i9) {
        this.f304e = xVar;
        this.f300a.f(interfaceC1907l, i9);
    }

    @Override // A3.J
    public final void c(int i9, A4.r rVar) {
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        AbstractC1566a.n(this.f304e);
        int i16 = i9 & 1;
        InterfaceC0008i interfaceC0008i = this.f300a;
        int i17 = -1;
        int i18 = 3;
        int i19 = 2;
        if (i16 != 0) {
            int i20 = this.f302c;
            if (i20 != 0 && i20 != 1) {
                if (i20 != 2) {
                    if (i20 == 3) {
                        if (this.j != -1) {
                            AbstractC1566a.P("PesReader", "Unexpected start indicator: expected " + this.j + " more bytes");
                        }
                        interfaceC0008i.d();
                    } else {
                        throw new IllegalStateException();
                    }
                } else {
                    AbstractC1566a.P("PesReader", "Unexpected start indicator reading extended header");
                }
            }
            this.f302c = 1;
            this.f303d = 0;
        }
        int i21 = i9;
        while (rVar.e() > 0) {
            int i22 = this.f302c;
            if (i22 != 0) {
                Z3.f fVar = this.f301b;
                if (i22 != 1) {
                    if (i22 != i19) {
                        if (i22 == i18) {
                            int e8 = rVar.e();
                            int i23 = this.j;
                            if (i23 == i17) {
                                i14 = 0;
                            } else {
                                i14 = e8 - i23;
                            }
                            if (i14 > 0) {
                                e8 -= i14;
                                rVar.G(rVar.f382a + e8);
                            }
                            interfaceC0008i.c(rVar);
                            int i24 = this.j;
                            if (i24 != i17) {
                                int i25 = i24 - e8;
                                this.j = i25;
                                if (i25 == 0) {
                                    interfaceC0008i.d();
                                    this.f302c = 1;
                                    this.f303d = 0;
                                }
                            }
                            int i26 = i18;
                            i10 = i17;
                            i11 = i26;
                            i12 = i19;
                        } else {
                            throw new IllegalStateException();
                        }
                    } else {
                        if (d(rVar, fVar.f9036b, Math.min(10, this.f308i)) && d(rVar, null, this.f308i)) {
                            fVar.o(0);
                            this.f310l = -9223372036854775807L;
                            if (this.f305f) {
                                fVar.r(4);
                                fVar.r(1);
                                fVar.r(1);
                                long i27 = (fVar.i(15) << 15) | (fVar.i(i18) << 30) | fVar.i(15);
                                fVar.r(1);
                                if (!this.f307h && this.f306g) {
                                    fVar.r(4);
                                    fVar.r(1);
                                    fVar.r(1);
                                    fVar.r(1);
                                    this.f304e.b((fVar.i(15) << 15) | (fVar.i(i18) << 30) | fVar.i(15));
                                    this.f307h = true;
                                }
                                this.f310l = this.f304e.b(i27);
                            }
                            if (this.f309k) {
                                i15 = 4;
                            } else {
                                i15 = 0;
                            }
                            i21 |= i15;
                            interfaceC0008i.e(this.f310l, i21);
                            this.f302c = 3;
                            this.f303d = 0;
                            i18 = 3;
                            i17 = -1;
                            i19 = 2;
                        } else {
                            i11 = i18;
                            i12 = i19;
                            i10 = -1;
                        }
                    }
                } else {
                    i11 = i18;
                    if (d(rVar, fVar.f9036b, 9)) {
                        fVar.o(0);
                        int i28 = fVar.i(24);
                        if (i28 != 1) {
                            AbstractC0953k1.v("Unexpected start code prefix: ", i28, "PesReader");
                            this.j = -1;
                            i13 = 0;
                            i10 = -1;
                            i12 = 2;
                        } else {
                            fVar.r(8);
                            int i29 = fVar.i(16);
                            fVar.r(5);
                            this.f309k = fVar.h();
                            i12 = 2;
                            fVar.r(2);
                            this.f305f = fVar.h();
                            this.f306g = fVar.h();
                            fVar.r(6);
                            int i30 = fVar.i(8);
                            this.f308i = i30;
                            if (i29 == 0) {
                                this.j = -1;
                                i10 = -1;
                            } else {
                                int i31 = (i29 - 3) - i30;
                                this.j = i31;
                                if (i31 < 0) {
                                    AbstractC1566a.P("PesReader", "Found negative packet payload size: " + this.j);
                                    i10 = -1;
                                    this.j = -1;
                                } else {
                                    i10 = -1;
                                }
                            }
                            i13 = 2;
                        }
                        this.f302c = i13;
                        this.f303d = 0;
                    } else {
                        i10 = -1;
                        i12 = 2;
                    }
                }
            } else {
                int i32 = i18;
                i10 = i17;
                i11 = i32;
                i12 = i19;
                rVar.I(rVar.e());
            }
            int i33 = i10;
            i18 = i11;
            i17 = i33;
            i19 = i12;
        }
    }

    public final boolean d(A4.r rVar, byte[] bArr, int i9) {
        int min = Math.min(rVar.e(), i9 - this.f303d);
        if (min <= 0) {
            return true;
        }
        if (bArr == null) {
            rVar.I(min);
        } else {
            rVar.h(bArr, this.f303d, min);
        }
        int i10 = this.f303d + min;
        this.f303d = i10;
        if (i10 == i9) {
            return true;
        }
        return false;
    }
}
