package A3;

import q3.InterfaceC1907l;

/* loaded from: classes.dex */
public final class C implements J {

    /* renamed from: a, reason: collision with root package name */
    public final B f36a;

    /* renamed from: b, reason: collision with root package name */
    public final A4.r f37b = new A4.r(32);

    /* renamed from: c, reason: collision with root package name */
    public int f38c;

    /* renamed from: d, reason: collision with root package name */
    public int f39d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f40e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f41f;

    public C(B b9) {
        this.f36a = b9;
    }

    @Override // A3.J
    public final void a() {
        this.f41f = true;
    }

    @Override // A3.J
    public final void b(l4.x xVar, InterfaceC1907l interfaceC1907l, I i9) {
        this.f36a.b(xVar, interfaceC1907l, i9);
        this.f41f = true;
    }

    @Override // A3.J
    public final void c(int i9, A4.r rVar) {
        boolean z9;
        int i10;
        boolean z10;
        if ((i9 & 1) != 0) {
            z9 = true;
        } else {
            z9 = false;
        }
        if (z9) {
            i10 = rVar.f382a + rVar.x();
        } else {
            i10 = -1;
        }
        if (this.f41f) {
            if (z9) {
                this.f41f = false;
                rVar.H(i10);
                this.f39d = 0;
            } else {
                return;
            }
        }
        while (rVar.e() > 0) {
            int i11 = this.f39d;
            A4.r rVar2 = this.f37b;
            if (i11 < 3) {
                if (i11 == 0) {
                    int x5 = rVar.x();
                    rVar.H(rVar.f382a - 1);
                    if (x5 == 255) {
                        this.f41f = true;
                        return;
                    }
                }
                int min = Math.min(rVar.e(), 3 - this.f39d);
                rVar.h((byte[]) rVar2.f384c, this.f39d, min);
                int i12 = this.f39d + min;
                this.f39d = i12;
                if (i12 == 3) {
                    rVar2.H(0);
                    rVar2.G(3);
                    rVar2.I(1);
                    int x9 = rVar2.x();
                    int x10 = rVar2.x();
                    if ((x9 & 128) != 0) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    this.f40e = z10;
                    int i13 = (((x9 & 15) << 8) | x10) + 3;
                    this.f38c = i13;
                    byte[] bArr = (byte[]) rVar2.f384c;
                    if (bArr.length < i13) {
                        rVar2.f(Math.min(4098, Math.max(i13, bArr.length * 2)));
                    }
                }
            } else {
                int min2 = Math.min(rVar.e(), this.f38c - this.f39d);
                rVar.h((byte[]) rVar2.f384c, this.f39d, min2);
                int i14 = this.f39d + min2;
                this.f39d = i14;
                int i15 = this.f38c;
                if (i14 != i15) {
                    continue;
                } else {
                    if (this.f40e) {
                        byte[] bArr2 = (byte[]) rVar2.f384c;
                        int i16 = l4.y.f20553a;
                        int i17 = -1;
                        for (int i18 = 0; i18 < i15; i18++) {
                            i17 = l4.y.f20564m[((i17 >>> 24) ^ (bArr2[i18] & 255)) & 255] ^ (i17 << 8);
                        }
                        if (i17 != 0) {
                            this.f41f = true;
                            return;
                        }
                        rVar2.G(this.f38c - 4);
                    } else {
                        rVar2.G(i15);
                    }
                    rVar2.H(0);
                    this.f36a.c(rVar2);
                    this.f39d = 0;
                }
            }
        }
    }
}
