package v3;

import A4.r;
import F0.C0104h;
import P5.S;
import Y3.e;
import c7.C0790j;
import com.google.android.gms.internal.measurement.AbstractC0953k1;
import j3.L;
import j3.j0;
import l4.AbstractC1566a;
import org.xmlpull.v1.XmlPullParserException;
import q3.C1902g;
import q3.C1908m;
import q3.InterfaceC1905j;
import q3.InterfaceC1906k;
import q3.InterfaceC1907l;
import q3.u;
import y3.AbstractC2214j;
import y3.C2216l;

/* renamed from: v3.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2104a implements InterfaceC1905j {

    /* renamed from: b, reason: collision with root package name */
    public InterfaceC1907l f23764b;

    /* renamed from: c, reason: collision with root package name */
    public int f23765c;

    /* renamed from: d, reason: collision with root package name */
    public int f23766d;

    /* renamed from: e, reason: collision with root package name */
    public int f23767e;

    /* renamed from: g, reason: collision with root package name */
    public J3.b f23769g;

    /* renamed from: h, reason: collision with root package name */
    public C1902g f23770h;

    /* renamed from: i, reason: collision with root package name */
    public C0104h f23771i;
    public C2216l j;

    /* renamed from: a, reason: collision with root package name */
    public final r f23763a = new r(6);

    /* renamed from: f, reason: collision with root package name */
    public long f23768f = -1;

    @Override // q3.InterfaceC1905j
    public final void a() {
        C2216l c2216l = this.j;
        if (c2216l != null) {
            c2216l.getClass();
        }
    }

    @Override // q3.InterfaceC1905j
    public final void b(long j, long j4) {
        if (j == 0) {
            this.f23765c = 0;
            this.j = null;
        } else if (this.f23765c == 5) {
            C2216l c2216l = this.j;
            c2216l.getClass();
            c2216l.b(j, j4);
        }
    }

    public final void c() {
        d(new D3.b[0]);
        InterfaceC1907l interfaceC1907l = this.f23764b;
        interfaceC1907l.getClass();
        interfaceC1907l.i();
        this.f23764b.r(new C1908m(-9223372036854775807L));
        this.f23765c = 6;
    }

    public final void d(D3.b... bVarArr) {
        InterfaceC1907l interfaceC1907l = this.f23764b;
        interfaceC1907l.getClass();
        u u9 = interfaceC1907l.u(1024, 4);
        L l9 = new L();
        l9.j = "image/jpeg";
        l9.f19401i = new D3.c(bVarArr);
        AbstractC0953k1.u(l9, u9);
    }

    @Override // q3.InterfaceC1905j
    public final int f(InterfaceC1906k interfaceC1906k, C0790j c0790j) {
        String r5;
        e eVar;
        S s9;
        int i9;
        long j;
        long j4;
        char c3 = 65535;
        int i10 = this.f23765c;
        r rVar = this.f23763a;
        long j9 = -1;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 != 4) {
                        if (i10 != 5) {
                            if (i10 == 6) {
                                return -1;
                            }
                            throw new IllegalStateException();
                        }
                        if (this.f23771i == null || interfaceC1906k != this.f23770h) {
                            C1902g c1902g = (C1902g) interfaceC1906k;
                            this.f23770h = c1902g;
                            this.f23771i = new C0104h(c1902g, this.f23768f);
                        }
                        C2216l c2216l = this.j;
                        c2216l.getClass();
                        int f9 = c2216l.f(this.f23771i, c0790j);
                        if (f9 == 1) {
                            c0790j.f11723a += this.f23768f;
                        }
                        return f9;
                    }
                    long j10 = ((C1902g) interfaceC1906k).f22312d;
                    long j11 = this.f23768f;
                    if (j10 != j11) {
                        c0790j.f11723a = j11;
                        return 1;
                    }
                    C1902g c1902g2 = (C1902g) interfaceC1906k;
                    if (!c1902g2.t((byte[]) rVar.f384c, 0, 1, true)) {
                        c();
                        return 0;
                    }
                    c1902g2.f22314f = 0;
                    if (this.j == null) {
                        this.j = new C2216l();
                    }
                    C0104h c0104h = new C0104h(c1902g2, this.f23768f);
                    this.f23771i = c0104h;
                    this.j.getClass();
                    if (AbstractC2214j.j(c0104h, false, false)) {
                        C2216l c2216l2 = this.j;
                        long j12 = this.f23768f;
                        InterfaceC1907l interfaceC1907l = this.f23764b;
                        interfaceC1907l.getClass();
                        c2216l2.f24863q = new C0104h(j12, interfaceC1907l);
                        J3.b bVar = this.f23769g;
                        bVar.getClass();
                        d(bVar);
                        this.f23765c = 5;
                        return 0;
                    }
                    c();
                    return 0;
                }
                if (this.f23766d == 65505) {
                    r rVar2 = new r(this.f23767e);
                    ((C1902g) interfaceC1906k).e((byte[]) rVar2.f384c, 0, this.f23767e, false);
                    if (this.f23769g == null && "http://ns.adobe.com/xap/1.0/".equals(rVar2.r()) && (r5 = rVar2.r()) != null) {
                        long j13 = ((C1902g) interfaceC1906k).f22311c;
                        J3.b bVar2 = null;
                        if (j13 != -1) {
                            try {
                                eVar = AbstractC2107d.a(r5);
                            } catch (j0 | NumberFormatException | XmlPullParserException unused) {
                                AbstractC1566a.P("MotionPhotoXmpParser", "Ignoring unexpected XMP metadata");
                                eVar = null;
                            }
                            if (eVar != null && (i9 = (s9 = eVar.f8702b).f5928d) >= 2) {
                                int i11 = i9 - 1;
                                boolean z9 = false;
                                long j14 = -1;
                                long j15 = -1;
                                long j16 = -1;
                                long j17 = -1;
                                while (i11 >= 0) {
                                    C2105b c2105b = (C2105b) s9.get(i11);
                                    char c9 = c3;
                                    boolean equals = "video/mp4".equals(c2105b.f23772a) | z9;
                                    if (i11 == 0) {
                                        j = j9;
                                        j13 -= c2105b.f23774c;
                                        j4 = 0;
                                    } else {
                                        j = j9;
                                        j4 = j13 - c2105b.f23773b;
                                    }
                                    long j18 = j4;
                                    long j19 = j13;
                                    j13 = j18;
                                    if (equals && j13 != j19) {
                                        j17 = j19 - j13;
                                        z9 = false;
                                        j16 = j13;
                                    } else {
                                        z9 = equals;
                                    }
                                    if (i11 == 0) {
                                        j14 = j13;
                                        j15 = j19;
                                    }
                                    i11--;
                                    c3 = c9;
                                    j9 = j;
                                }
                                long j20 = j9;
                                if (j16 != j20 && j17 != j20 && j14 != j20 && j15 != j20) {
                                    bVar2 = new J3.b(j14, j15, eVar.f8701a, j16, j17);
                                }
                            }
                        }
                        this.f23769g = bVar2;
                        if (bVar2 != null) {
                            this.f23768f = bVar2.f4180d;
                        }
                    }
                } else {
                    ((C1902g) interfaceC1906k).n(this.f23767e);
                }
                this.f23765c = 0;
            } else {
                rVar.E(2);
                ((C1902g) interfaceC1906k).e((byte[]) rVar.f384c, 0, 2, false);
                this.f23767e = rVar.C() - 2;
                this.f23765c = 2;
                return 0;
            }
        } else {
            rVar.E(2);
            ((C1902g) interfaceC1906k).e((byte[]) rVar.f384c, 0, 2, false);
            int C8 = rVar.C();
            this.f23766d = C8;
            if (C8 == 65498) {
                if (this.f23768f != -1) {
                    this.f23765c = 4;
                    return 0;
                }
                c();
                return 0;
            }
            if ((C8 < 65488 || C8 > 65497) && C8 != 65281) {
                this.f23765c = 1;
            }
        }
        return 0;
    }

    @Override // q3.InterfaceC1905j
    public final void i(InterfaceC1907l interfaceC1907l) {
        this.f23764b = interfaceC1907l;
    }

    @Override // q3.InterfaceC1905j
    public final boolean j(InterfaceC1906k interfaceC1906k) {
        C1902g c1902g = (C1902g) interfaceC1906k;
        r rVar = this.f23763a;
        rVar.E(2);
        c1902g.t((byte[]) rVar.f384c, 0, 2, false);
        if (rVar.C() == 65496) {
            rVar.E(2);
            c1902g.t((byte[]) rVar.f384c, 0, 2, false);
            int C8 = rVar.C();
            this.f23766d = C8;
            if (C8 == 65504) {
                rVar.E(2);
                c1902g.t((byte[]) rVar.f384c, 0, 2, false);
                c1902g.c(rVar.C() - 2, false);
                rVar.E(2);
                c1902g.t((byte[]) rVar.f384c, 0, 2, false);
                this.f23766d = rVar.C();
            }
            if (this.f23766d == 65505) {
                c1902g.c(2, false);
                rVar.E(6);
                c1902g.t((byte[]) rVar.f384c, 0, 6, false);
                if (rVar.y() == 1165519206 && rVar.C() == 0) {
                    return true;
                }
            }
        }
        return false;
    }
}
