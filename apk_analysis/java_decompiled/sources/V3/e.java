package V3;

import A4.r;
import U3.l;
import j3.j0;
import java.util.Locale;
import java.util.TreeMap;
import l4.AbstractC1566a;
import l4.y;
import l6.AbstractC1570b;
import q3.InterfaceC1907l;
import q3.u;

/* loaded from: classes.dex */
public final class e implements h {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7701a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f7702b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f7703c;

    /* renamed from: d, reason: collision with root package name */
    public Object f7704d;

    /* renamed from: e, reason: collision with root package name */
    public Object f7705e;

    /* renamed from: f, reason: collision with root package name */
    public int f7706f;

    /* renamed from: g, reason: collision with root package name */
    public long f7707g;

    /* renamed from: h, reason: collision with root package name */
    public int f7708h;

    /* renamed from: i, reason: collision with root package name */
    public int f7709i;
    public long j;

    public e(String str, String str2, long j, int i9, int i10, int i11, int[] iArr, TreeMap treeMap) {
        this.f7701a = 2;
        this.f7702b = str;
        this.f7703c = str2;
        this.f7707g = j;
        this.j = 0L;
        this.f7706f = i9;
        this.f7708h = i10;
        this.f7709i = i11;
        this.f7704d = iArr;
        this.f7705e = treeMap;
    }

    @Override // V3.h
    public void b(long j, long j4) {
        switch (this.f7701a) {
            case 0:
                this.f7707g = j;
                this.f7709i = 0;
                this.j = j4;
                return;
            default:
                this.f7707g = j;
                this.f7709i = 0;
                this.j = j4;
                return;
        }
    }

    @Override // V3.h
    public void c(long j) {
        int i9 = this.f7701a;
    }

    @Override // V3.h
    public void d(r rVar, long j, int i9, boolean z9) {
        boolean z10;
        boolean z11;
        int i10;
        int i11;
        boolean z12;
        boolean z13;
        int i12;
        Object obj = this.f7702b;
        int i13 = 1;
        switch (this.f7701a) {
            case 0:
                try {
                    int i14 = ((byte[]) rVar.f384c)[0] & 31;
                    AbstractC1566a.n((u) this.f7705e);
                    if (i14 > 0 && i14 < 24) {
                        int e8 = rVar.e();
                        this.f7709i = g() + this.f7709i;
                        ((u) this.f7705e).c(e8, rVar);
                        this.f7709i += e8;
                        if ((((byte[]) rVar.f384c)[0] & 31) == 5) {
                            i11 = 1;
                        } else {
                            i11 = 0;
                        }
                        this.f7706f = i11;
                    } else if (i14 == 24) {
                        rVar.x();
                        while (rVar.e() > 4) {
                            int C8 = rVar.C();
                            this.f7709i = g() + this.f7709i;
                            ((u) this.f7705e).c(C8, rVar);
                            this.f7709i += C8;
                        }
                        this.f7706f = 0;
                    } else if (i14 == 28) {
                        byte[] bArr = (byte[]) rVar.f384c;
                        byte b9 = bArr[0];
                        byte b10 = bArr[1];
                        int i15 = (b9 & 224) | (b10 & 31);
                        if ((b10 & 128) > 0) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        if ((b10 & 64) > 0) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        r rVar2 = (r) obj;
                        if (z10) {
                            this.f7709i = g() + this.f7709i;
                            byte[] bArr2 = (byte[]) rVar.f384c;
                            bArr2[1] = (byte) i15;
                            rVar2.getClass();
                            rVar2.F(bArr2.length, bArr2);
                            rVar2.H(1);
                        } else {
                            int a5 = U3.i.a(this.f7708h);
                            if (i9 != a5) {
                                int i16 = y.f20553a;
                                Locale locale = Locale.US;
                                AbstractC1566a.P("RtpH264Reader", "Received RTP packet with unexpected sequence number. Expected: " + a5 + "; received: " + i9 + ". Dropping packet.");
                            } else {
                                byte[] bArr3 = (byte[]) rVar.f384c;
                                rVar2.getClass();
                                rVar2.F(bArr3.length, bArr3);
                                rVar2.H(2);
                            }
                        }
                        int e9 = rVar2.e();
                        ((u) this.f7705e).c(e9, rVar2);
                        this.f7709i += e9;
                        if (z11) {
                            if ((i15 & 31) == 5) {
                                i10 = 1;
                            } else {
                                i10 = 0;
                            }
                            this.f7706f = i10;
                        }
                    } else {
                        throw j0.b(String.format("RTP H264 packetization mode [%d] not supported.", Integer.valueOf(i14)), null);
                    }
                    if (z9) {
                        if (this.f7707g == -9223372036854775807L) {
                            this.f7707g = j;
                        }
                        ((u) this.f7705e).d(AbstractC1570b.w(this.j, j, this.f7707g, 90000), this.f7706f, this.f7709i, 0, null);
                        this.f7709i = 0;
                    }
                    this.f7708h = i9;
                    return;
                } catch (IndexOutOfBoundsException e10) {
                    throw j0.b(null, e10);
                }
            default:
                byte[] bArr4 = (byte[]) rVar.f384c;
                if (bArr4.length != 0) {
                    int i17 = (bArr4[0] >> 1) & 63;
                    AbstractC1566a.n((u) this.f7705e);
                    r rVar3 = (r) this.f7703c;
                    if (i17 >= 0 && i17 < 48) {
                        int e11 = rVar.e();
                        int i18 = this.f7709i;
                        rVar3.H(0);
                        int e12 = rVar3.e();
                        u uVar = (u) this.f7705e;
                        uVar.getClass();
                        uVar.c(e12, rVar3);
                        this.f7709i = e12 + i18;
                        ((u) this.f7705e).c(e11, rVar);
                        this.f7709i += e11;
                        int i19 = (((byte[]) rVar.f384c)[0] >> 1) & 63;
                        if (i19 != 19 && i19 != 20) {
                            i13 = 0;
                        }
                        this.f7706f = i13;
                    } else if (i17 != 48) {
                        if (i17 == 49) {
                            byte[] bArr5 = (byte[]) rVar.f384c;
                            if (bArr5.length >= 3) {
                                int i20 = bArr5[1] & 7;
                                byte b11 = bArr5[2];
                                int i21 = b11 & 63;
                                if ((b11 & 128) > 0) {
                                    z12 = true;
                                } else {
                                    z12 = false;
                                }
                                if ((b11 & 64) > 0) {
                                    z13 = true;
                                } else {
                                    z13 = false;
                                }
                                r rVar4 = (r) obj;
                                if (z12) {
                                    int i22 = this.f7709i;
                                    rVar3.H(0);
                                    int e13 = rVar3.e();
                                    u uVar2 = (u) this.f7705e;
                                    uVar2.getClass();
                                    uVar2.c(e13, rVar3);
                                    this.f7709i = e13 + i22;
                                    byte[] bArr6 = (byte[]) rVar.f384c;
                                    bArr6[1] = (byte) ((i21 << 1) & 127);
                                    bArr6[2] = (byte) i20;
                                    rVar4.getClass();
                                    rVar4.F(bArr6.length, bArr6);
                                    rVar4.H(1);
                                } else {
                                    int i23 = (this.f7708h + 1) % 65535;
                                    if (i9 != i23) {
                                        int i24 = y.f20553a;
                                        Locale locale2 = Locale.US;
                                        AbstractC1566a.P("RtpH265Reader", "Received RTP packet with unexpected sequence number. Expected: " + i23 + "; received: " + i9 + ". Dropping packet.");
                                    } else {
                                        rVar4.getClass();
                                        rVar4.F(bArr5.length, bArr5);
                                        rVar4.H(3);
                                    }
                                }
                                int e14 = rVar4.e();
                                ((u) this.f7705e).c(e14, rVar4);
                                this.f7709i += e14;
                                if (z13) {
                                    if (i21 != 19 && i21 != 20) {
                                        i12 = 0;
                                    } else {
                                        i12 = 1;
                                    }
                                    this.f7706f = i12;
                                }
                            } else {
                                throw j0.b("Malformed FU header.", null);
                            }
                        } else {
                            throw j0.b(String.format("RTP H265 payload type [%d] not supported.", Integer.valueOf(i17)), null);
                        }
                    } else {
                        throw new UnsupportedOperationException("need to implement processAggregationPacket");
                    }
                    if (z9) {
                        if (this.f7707g == -9223372036854775807L) {
                            this.f7707g = j;
                        }
                        ((u) this.f7705e).d(AbstractC1570b.w(this.j, j, this.f7707g, 90000), this.f7706f, this.f7709i, 0, null);
                        this.f7709i = 0;
                    }
                    this.f7708h = i9;
                    return;
                }
                throw j0.b("Empty RTP data packet.", null);
        }
    }

    @Override // V3.h
    public void e(InterfaceC1907l interfaceC1907l, int i9) {
        switch (this.f7701a) {
            case 0:
                u u9 = interfaceC1907l.u(i9, 2);
                this.f7705e = u9;
                int i10 = y.f20553a;
                u9.e(((l) this.f7704d).f7400c);
                return;
            default:
                u u10 = interfaceC1907l.u(i9, 2);
                this.f7705e = u10;
                u10.e(((l) this.f7704d).f7400c);
                return;
        }
    }

    public int g() {
        r rVar = (r) this.f7703c;
        rVar.H(0);
        int e8 = rVar.e();
        u uVar = (u) this.f7705e;
        uVar.getClass();
        uVar.c(e8, rVar);
        return e8;
    }

    public e(l lVar, int i9) {
        this.f7701a = i9;
        switch (i9) {
            case 1:
                this.f7702b = new r(5, false);
                this.f7703c = new r(AbstractC1566a.f20476d);
                this.f7704d = lVar;
                this.f7707g = -9223372036854775807L;
                this.f7708h = -1;
                return;
            default:
                this.f7703c = new r(AbstractC1566a.f20476d);
                this.f7704d = lVar;
                this.f7702b = new r(5, false);
                this.f7707g = -9223372036854775807L;
                this.f7708h = -1;
                return;
        }
    }

    private final void a(long j) {
    }

    private final void f(long j) {
    }
}
