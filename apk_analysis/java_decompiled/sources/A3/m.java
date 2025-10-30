package A3;

/* loaded from: classes.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    public final q3.u f173a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f174b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f175c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f176d;

    /* renamed from: e, reason: collision with root package name */
    public int f177e;

    /* renamed from: f, reason: collision with root package name */
    public int f178f;

    /* renamed from: g, reason: collision with root package name */
    public long f179g;

    /* renamed from: h, reason: collision with root package name */
    public long f180h;

    public m(q3.u uVar) {
        this.f173a = uVar;
    }

    public final void a(byte[] bArr, int i9, int i10) {
        boolean z9;
        if (this.f175c) {
            int i11 = this.f178f;
            int i12 = (i9 + 1) - i11;
            if (i12 < i10) {
                if (((bArr[i12] & 192) >> 6) == 0) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                this.f176d = z9;
                this.f175c = false;
                return;
            }
            this.f178f = (i10 - i9) + i11;
        }
    }
}
