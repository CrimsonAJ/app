package A3;

import j3.L;
import j3.M;
import l4.AbstractC1566a;
import q3.InterfaceC1907l;

/* loaded from: classes.dex */
public final class u implements InterfaceC0008i {

    /* renamed from: a, reason: collision with root package name */
    public final A4.r f283a;

    /* renamed from: b, reason: collision with root package name */
    public final l3.I f284b;

    /* renamed from: c, reason: collision with root package name */
    public final String f285c;

    /* renamed from: d, reason: collision with root package name */
    public q3.u f286d;

    /* renamed from: e, reason: collision with root package name */
    public String f287e;

    /* renamed from: f, reason: collision with root package name */
    public int f288f = 0;

    /* renamed from: g, reason: collision with root package name */
    public int f289g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f290h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f291i;
    public long j;

    /* renamed from: k, reason: collision with root package name */
    public int f292k;

    /* renamed from: l, reason: collision with root package name */
    public long f293l;

    /* JADX WARN: Type inference failed for: r0v1, types: [l3.I, java.lang.Object] */
    public u(String str) {
        A4.r rVar = new A4.r(4);
        this.f283a = rVar;
        ((byte[]) rVar.f384c)[0] = -1;
        this.f284b = new Object();
        this.f293l = -9223372036854775807L;
        this.f285c = str;
    }

    @Override // A3.InterfaceC0008i
    public final void a() {
        this.f288f = 0;
        this.f289g = 0;
        this.f291i = false;
        this.f293l = -9223372036854775807L;
    }

    @Override // A3.InterfaceC0008i
    public final void c(A4.r rVar) {
        boolean z9;
        boolean z10;
        AbstractC1566a.n(this.f286d);
        while (rVar.e() > 0) {
            int i9 = this.f288f;
            A4.r rVar2 = this.f283a;
            if (i9 != 0) {
                if (i9 != 1) {
                    if (i9 == 2) {
                        int min = Math.min(rVar.e(), this.f292k - this.f289g);
                        this.f286d.c(min, rVar);
                        int i10 = this.f289g + min;
                        this.f289g = i10;
                        int i11 = this.f292k;
                        if (i10 >= i11) {
                            long j = this.f293l;
                            if (j != -9223372036854775807L) {
                                this.f286d.d(j, 1, i11, 0, null);
                                this.f293l += this.j;
                            }
                            this.f289g = 0;
                            this.f288f = 0;
                        }
                    } else {
                        throw new IllegalStateException();
                    }
                } else {
                    int min2 = Math.min(rVar.e(), 4 - this.f289g);
                    rVar.h((byte[]) rVar2.f384c, this.f289g, min2);
                    int i12 = this.f289g + min2;
                    this.f289g = i12;
                    if (i12 >= 4) {
                        rVar2.H(0);
                        int i13 = rVar2.i();
                        l3.I i14 = this.f284b;
                        if (!i14.b(i13)) {
                            this.f289g = 0;
                            this.f288f = 1;
                        } else {
                            this.f292k = i14.f20308b;
                            if (!this.f290h) {
                                int i15 = i14.f20309c;
                                this.j = (i14.f20312f * 1000000) / i15;
                                L l9 = new L();
                                l9.f19393a = this.f287e;
                                l9.f19402k = (String) i14.f20313g;
                                l9.f19403l = 4096;
                                l9.f19415x = i14.f20310d;
                                l9.f19416y = i15;
                                l9.f19395c = this.f285c;
                                this.f286d.e(new M(l9));
                                this.f290h = true;
                            }
                            rVar2.H(0);
                            this.f286d.c(4, rVar2);
                            this.f288f = 2;
                        }
                    }
                }
            } else {
                byte[] bArr = (byte[]) rVar.f384c;
                int i16 = rVar.f382a;
                int i17 = rVar.f383b;
                while (true) {
                    if (i16 < i17) {
                        byte b9 = bArr[i16];
                        if ((b9 & 255) == 255) {
                            z9 = true;
                        } else {
                            z9 = false;
                        }
                        if (this.f291i && (b9 & 224) == 224) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        this.f291i = z9;
                        if (z10) {
                            rVar.H(i16 + 1);
                            this.f291i = false;
                            ((byte[]) rVar2.f384c)[1] = bArr[i16];
                            this.f289g = 2;
                            this.f288f = 1;
                            break;
                        }
                        i16++;
                    } else {
                        rVar.H(i17);
                        break;
                    }
                }
            }
        }
    }

    @Override // A3.InterfaceC0008i
    public final void e(long j, int i9) {
        if (j != -9223372036854775807L) {
            this.f293l = j;
        }
    }

    @Override // A3.InterfaceC0008i
    public final void f(InterfaceC1907l interfaceC1907l, I i9) {
        i9.a();
        i9.b();
        this.f287e = i9.f78e;
        i9.b();
        this.f286d = interfaceC1907l.u(i9.f77d, 1);
    }

    @Override // A3.InterfaceC0008i
    public final void d() {
    }
}
