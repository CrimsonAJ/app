package V3;

import A4.r;
import U3.l;
import com.google.android.gms.internal.measurement.AbstractC0953k1;
import j3.L;
import j3.M;
import java.util.Locale;
import l4.AbstractC1566a;
import l4.y;
import l6.AbstractC1570b;
import q3.InterfaceC1907l;
import q3.u;

/* loaded from: classes.dex */
public final class d implements h {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7689a;

    /* renamed from: b, reason: collision with root package name */
    public final l f7690b;

    /* renamed from: c, reason: collision with root package name */
    public u f7691c;

    /* renamed from: d, reason: collision with root package name */
    public long f7692d;

    /* renamed from: e, reason: collision with root package name */
    public long f7693e;

    /* renamed from: f, reason: collision with root package name */
    public int f7694f;

    /* renamed from: g, reason: collision with root package name */
    public int f7695g;

    /* renamed from: h, reason: collision with root package name */
    public long f7696h;

    /* renamed from: i, reason: collision with root package name */
    public int f7697i;
    public int j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f7698k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f7699l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f7700m;

    public d(l lVar, int i9) {
        this.f7689a = i9;
        switch (i9) {
            case 1:
                this.f7690b = lVar;
                this.f7692d = -9223372036854775807L;
                this.f7695g = -1;
                this.f7696h = -9223372036854775807L;
                this.f7693e = 0L;
                this.f7694f = -1;
                this.f7697i = -1;
                this.j = -1;
                return;
            default:
                this.f7690b = lVar;
                this.f7692d = -9223372036854775807L;
                this.f7695g = -1;
                return;
        }
    }

    @Override // V3.h
    public final void b(long j, long j4) {
        switch (this.f7689a) {
            case 0:
                this.f7692d = j;
                this.f7694f = 0;
                this.f7693e = j4;
                return;
            default:
                this.f7692d = j;
                this.f7695g = -1;
                this.f7693e = j4;
                return;
        }
    }

    @Override // V3.h
    public final void c(long j) {
        boolean z9;
        boolean z10;
        switch (this.f7689a) {
            case 0:
                if (this.f7692d == -9223372036854775807L) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                AbstractC1566a.m(z9);
                this.f7692d = j;
                return;
            default:
                if (this.f7692d == -9223372036854775807L) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                AbstractC1566a.m(z10);
                this.f7692d = j;
                return;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // V3.h
    public final void d(r rVar, long j, int i9, boolean z9) {
        Object[] objArr;
        boolean z10;
        boolean z11;
        int i10;
        int i11;
        boolean z12;
        l lVar = this.f7690b;
        switch (this.f7689a) {
            case 0:
                AbstractC1566a.n(this.f7691c);
                int i12 = rVar.f382a;
                int C8 = rVar.C();
                if ((C8 & 1024) > 0) {
                    objArr = true;
                } else {
                    objArr = false;
                }
                if ((C8 & 512) == 0 && (C8 & 504) == 0 && (C8 & 7) == 0) {
                    if (objArr != false) {
                        if (this.f7700m && this.f7694f > 0) {
                            u uVar = this.f7691c;
                            uVar.getClass();
                            uVar.d(this.f7696h, this.f7698k ? 1 : 0, this.f7694f, 0, null);
                            this.f7694f = 0;
                            this.f7696h = -9223372036854775807L;
                            this.f7698k = false;
                            this.f7700m = false;
                        }
                        this.f7700m = true;
                        if ((rVar.g() & 252) < 128) {
                            AbstractC1566a.P("RtpH263Reader", "Picture start Code (PSC) missing, dropping packet.");
                            return;
                        }
                        byte[] bArr = (byte[]) rVar.f384c;
                        bArr[i12] = 0;
                        bArr[i12 + 1] = 0;
                        rVar.H(i12);
                    } else if (this.f7700m) {
                        int a5 = U3.i.a(this.f7695g);
                        if (i9 < a5) {
                            int i13 = y.f20553a;
                            Locale locale = Locale.US;
                            AbstractC1566a.P("RtpH263Reader", "Received RTP packet with unexpected sequence number. Expected: " + a5 + "; received: " + i9 + ". Dropping packet.");
                            return;
                        }
                    } else {
                        AbstractC1566a.P("RtpH263Reader", "First payload octet of the H263 packet is not the beginning of a new H263 partition, Dropping current packet.");
                        return;
                    }
                    if (this.f7694f == 0) {
                        boolean z13 = this.f7699l;
                        int i14 = rVar.f382a;
                        if (((rVar.y() >> 10) & 63) == 32) {
                            int g9 = rVar.g();
                            int i15 = (g9 >> 1) & 1;
                            if (!z13 && i15 == 0) {
                                int i16 = (g9 >> 2) & 7;
                                if (i16 == 1) {
                                    this.f7697i = 128;
                                    this.j = 96;
                                } else {
                                    int i17 = i16 - 2;
                                    this.f7697i = 176 << i17;
                                    this.j = 144 << i17;
                                }
                            }
                            rVar.H(i14);
                            if (i15 == 0) {
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            this.f7698k = z10;
                        } else {
                            rVar.H(i14);
                            this.f7698k = false;
                        }
                        if (!this.f7699l && this.f7698k) {
                            int i18 = this.f7697i;
                            M m9 = lVar.f7400c;
                            if (i18 != m9.f19440q || this.j != m9.f19441r) {
                                u uVar2 = this.f7691c;
                                L a9 = m9.a();
                                a9.f19407p = this.f7697i;
                                a9.f19408q = this.j;
                                AbstractC0953k1.u(a9, uVar2);
                            }
                            this.f7699l = true;
                        }
                    }
                    int e8 = rVar.e();
                    this.f7691c.c(e8, rVar);
                    this.f7694f += e8;
                    this.f7696h = AbstractC1570b.w(this.f7693e, j, this.f7692d, 90000);
                    if (z9) {
                        u uVar3 = this.f7691c;
                        uVar3.getClass();
                        uVar3.d(this.f7696h, this.f7698k ? 1 : 0, this.f7694f, 0, null);
                        this.f7694f = 0;
                        this.f7696h = -9223372036854775807L;
                        this.f7698k = false;
                        this.f7700m = false;
                    }
                    this.f7695g = i9;
                    return;
                }
                AbstractC1566a.P("RtpH263Reader", "Dropping packet: video reduncancy coding is not supported, packet header VRC, or PLEN or PEBIT is non-zero");
                return;
            default:
                AbstractC1566a.n(this.f7691c);
                int x5 = rVar.x();
                if ((x5 & 8) == 8) {
                    if (this.f7698k && this.f7695g > 0) {
                        u uVar4 = this.f7691c;
                        uVar4.getClass();
                        uVar4.d(this.f7696h, this.f7700m ? 1 : 0, this.f7695g, 0, null);
                        this.f7695g = -1;
                        this.f7696h = -9223372036854775807L;
                        this.f7698k = false;
                    }
                    this.f7698k = true;
                } else if (this.f7698k) {
                    int a10 = U3.i.a(this.f7694f);
                    if (i9 < a10) {
                        int i19 = y.f20553a;
                        Locale locale2 = Locale.US;
                        AbstractC1566a.P("RtpVp9Reader", "Received RTP packet with unexpected sequence number. Expected: " + a10 + "; received: " + i9 + ". Dropping packet.");
                        return;
                    }
                } else {
                    AbstractC1566a.P("RtpVp9Reader", "First payload octet of the RTP packet is not the beginning of a new VP9 partition, Dropping current packet.");
                    return;
                }
                if ((x5 & 128) == 0 || (rVar.x() & 128) == 0 || rVar.e() >= 1) {
                    int i20 = x5 & 16;
                    if (i20 == 0) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    AbstractC1566a.g("VP9 flexible mode is not supported.", z11);
                    if ((x5 & 32) != 0) {
                        rVar.I(1);
                        if (rVar.e() >= 1) {
                            if (i20 == 0) {
                                rVar.I(1);
                            }
                        } else {
                            return;
                        }
                    }
                    if ((x5 & 2) != 0) {
                        int x9 = rVar.x();
                        int i21 = (x9 >> 5) & 7;
                        if ((x9 & 16) != 0) {
                            int i22 = i21 + 1;
                            if (rVar.e() >= i22 * 4) {
                                for (int i23 = 0; i23 < i22; i23++) {
                                    this.f7697i = rVar.C();
                                    this.j = rVar.C();
                                }
                            } else {
                                return;
                            }
                        }
                        if ((x9 & 8) != 0) {
                            int x10 = rVar.x();
                            if (rVar.e() >= x10) {
                                for (int i24 = 0; i24 < x10; i24++) {
                                    int C9 = (rVar.C() & 12) >> 2;
                                    if (rVar.e() >= C9) {
                                        rVar.I(C9);
                                    } else {
                                        return;
                                    }
                                }
                            } else {
                                return;
                            }
                        }
                    }
                    if (this.f7695g == -1 && this.f7698k) {
                        if ((rVar.g() & 4) == 0) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        this.f7700m = z12;
                    }
                    if (!this.f7699l && (i10 = this.f7697i) != -1 && (i11 = this.j) != -1) {
                        M m10 = lVar.f7400c;
                        if (i10 != m10.f19440q || i11 != m10.f19441r) {
                            u uVar5 = this.f7691c;
                            L a11 = m10.a();
                            a11.f19407p = this.f7697i;
                            a11.f19408q = this.j;
                            AbstractC0953k1.u(a11, uVar5);
                        }
                        this.f7699l = true;
                    }
                    int e9 = rVar.e();
                    this.f7691c.c(e9, rVar);
                    int i25 = this.f7695g;
                    if (i25 == -1) {
                        this.f7695g = e9;
                    } else {
                        this.f7695g = i25 + e9;
                    }
                    this.f7696h = AbstractC1570b.w(this.f7693e, j, this.f7692d, 90000);
                    if (z9) {
                        u uVar6 = this.f7691c;
                        uVar6.getClass();
                        uVar6.d(this.f7696h, this.f7700m ? 1 : 0, this.f7695g, 0, null);
                        this.f7695g = -1;
                        this.f7696h = -9223372036854775807L;
                        this.f7698k = false;
                    }
                    this.f7694f = i9;
                    return;
                }
                return;
        }
    }

    @Override // V3.h
    public final void e(InterfaceC1907l interfaceC1907l, int i9) {
        switch (this.f7689a) {
            case 0:
                u u9 = interfaceC1907l.u(i9, 2);
                this.f7691c = u9;
                u9.e(this.f7690b.f7400c);
                return;
            default:
                u u10 = interfaceC1907l.u(i9, 2);
                this.f7691c = u10;
                u10.e(this.f7690b.f7400c);
                return;
        }
    }
}
