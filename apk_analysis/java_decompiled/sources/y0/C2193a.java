package y0;

/* renamed from: y0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2193a {

    /* renamed from: a, reason: collision with root package name */
    public final int f24730a;

    /* renamed from: b, reason: collision with root package name */
    public int f24731b;

    /* renamed from: c, reason: collision with root package name */
    public int f24732c;

    /* renamed from: d, reason: collision with root package name */
    public int f24733d;

    /* renamed from: e, reason: collision with root package name */
    public int f24734e;

    /* renamed from: f, reason: collision with root package name */
    public int f24735f;

    /* renamed from: g, reason: collision with root package name */
    public int f24736g;

    /* renamed from: h, reason: collision with root package name */
    public int f24737h;

    /* renamed from: i, reason: collision with root package name */
    public int f24738i;
    public final /* synthetic */ C2194b j;

    public C2193a(C2194b c2194b, int i9, int i10) {
        this.j = c2194b;
        this.f24730a = i9;
        this.f24731b = i10;
        a();
    }

    public final void a() {
        C2194b c2194b = this.j;
        int[] iArr = c2194b.f24740a;
        int[] iArr2 = c2194b.f24741b;
        int i9 = Integer.MAX_VALUE;
        int i10 = Integer.MIN_VALUE;
        int i11 = Integer.MIN_VALUE;
        int i12 = Integer.MIN_VALUE;
        int i13 = 0;
        int i14 = Integer.MAX_VALUE;
        int i15 = Integer.MAX_VALUE;
        for (int i16 = this.f24730a; i16 <= this.f24731b; i16++) {
            int i17 = iArr[i16];
            i13 += iArr2[i17];
            int i18 = (i17 >> 10) & 31;
            int i19 = (i17 >> 5) & 31;
            int i20 = i17 & 31;
            if (i18 > i10) {
                i10 = i18;
            }
            if (i18 < i9) {
                i9 = i18;
            }
            if (i19 > i11) {
                i11 = i19;
            }
            if (i19 < i14) {
                i14 = i19;
            }
            if (i20 > i12) {
                i12 = i20;
            }
            if (i20 < i15) {
                i15 = i20;
            }
        }
        this.f24733d = i9;
        this.f24734e = i10;
        this.f24735f = i14;
        this.f24736g = i11;
        this.f24737h = i15;
        this.f24738i = i12;
        this.f24732c = i13;
    }

    public final int b() {
        return ((this.f24738i - this.f24737h) + 1) * ((this.f24736g - this.f24735f) + 1) * ((this.f24734e - this.f24733d) + 1);
    }
}
