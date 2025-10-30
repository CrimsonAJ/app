package b5;

/* loaded from: classes.dex */
public final class r {

    /* renamed from: a, reason: collision with root package name */
    public final String f11284a;

    /* renamed from: b, reason: collision with root package name */
    public final String f11285b;

    /* renamed from: c, reason: collision with root package name */
    public final long f11286c;

    /* renamed from: d, reason: collision with root package name */
    public final long f11287d;

    /* renamed from: e, reason: collision with root package name */
    public final long f11288e;

    /* renamed from: f, reason: collision with root package name */
    public final long f11289f;

    /* renamed from: g, reason: collision with root package name */
    public final long f11290g;

    /* renamed from: h, reason: collision with root package name */
    public final Long f11291h;

    /* renamed from: i, reason: collision with root package name */
    public final Long f11292i;
    public final Long j;

    /* renamed from: k, reason: collision with root package name */
    public final Boolean f11293k;

    public r(String str, String str2, long j, long j4, long j9, long j10, long j11, Long l9, Long l10, Long l11, Boolean bool) {
        boolean z9;
        boolean z10;
        boolean z11;
        F4.y.e(str);
        F4.y.e(str2);
        if (j >= 0) {
            z9 = true;
        } else {
            z9 = false;
        }
        F4.y.b(z9);
        if (j4 >= 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        F4.y.b(z10);
        if (j9 >= 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        F4.y.b(z11);
        F4.y.b(j11 >= 0);
        this.f11284a = str;
        this.f11285b = str2;
        this.f11286c = j;
        this.f11287d = j4;
        this.f11288e = j9;
        this.f11289f = j10;
        this.f11290g = j11;
        this.f11291h = l9;
        this.f11292i = l10;
        this.j = l11;
        this.f11293k = bool;
    }

    public final r a(Long l9, Long l10, Boolean bool) {
        return new r(this.f11284a, this.f11285b, this.f11286c, this.f11287d, this.f11288e, this.f11289f, this.f11290g, this.f11291h, l9, l10, bool);
    }

    public final r b(long j) {
        return new r(this.f11284a, this.f11285b, this.f11286c, this.f11287d, this.f11288e, j, this.f11290g, this.f11291h, this.f11292i, this.j, this.f11293k);
    }
}
