package q3;

/* loaded from: classes.dex */
public final class v {

    /* renamed from: a, reason: collision with root package name */
    public final byte[] f22351a = new byte[10];

    /* renamed from: b, reason: collision with root package name */
    public boolean f22352b;

    /* renamed from: c, reason: collision with root package name */
    public int f22353c;

    /* renamed from: d, reason: collision with root package name */
    public long f22354d;

    /* renamed from: e, reason: collision with root package name */
    public int f22355e;

    /* renamed from: f, reason: collision with root package name */
    public int f22356f;

    /* renamed from: g, reason: collision with root package name */
    public int f22357g;

    public final void a(u uVar, t tVar) {
        if (this.f22353c > 0) {
            uVar.d(this.f22354d, this.f22355e, this.f22356f, this.f22357g, tVar);
            this.f22353c = 0;
        }
    }

    public final void b(u uVar, long j, int i9, int i10, int i11, t tVar) {
        boolean z9;
        if (this.f22357g <= i10 + i11) {
            z9 = true;
        } else {
            z9 = false;
        }
        if (z9) {
            if (this.f22352b) {
                int i12 = this.f22353c;
                int i13 = i12 + 1;
                this.f22353c = i13;
                if (i12 == 0) {
                    this.f22354d = j;
                    this.f22355e = i9;
                    this.f22356f = 0;
                }
                this.f22356f += i10;
                this.f22357g = i11;
                if (i13 >= 16) {
                    a(uVar, tVar);
                    return;
                }
                return;
            }
            return;
        }
        throw new IllegalStateException("TrueHD chunk samples must be contiguous in the sample queue.");
    }

    public final void c(InterfaceC1906k interfaceC1906k) {
        char c3;
        if (!this.f22352b) {
            byte[] bArr = this.f22351a;
            int i9 = 0;
            interfaceC1906k.B(bArr, 0, 10);
            interfaceC1906k.m();
            if (bArr[4] == -8 && bArr[5] == 114 && bArr[6] == 111) {
                byte b9 = bArr[7];
                if ((b9 & 254) == 186) {
                    if ((b9 & 255) == 187) {
                        c3 = '\t';
                    } else {
                        c3 = '\b';
                    }
                    i9 = 40 << ((bArr[c3] >> 4) & 7);
                }
            }
            if (i9 == 0) {
                return;
            }
            this.f22352b = true;
        }
    }
}
