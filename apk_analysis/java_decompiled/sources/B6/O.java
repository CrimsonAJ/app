package B6;

/* loaded from: classes.dex */
public final class O {

    /* renamed from: a, reason: collision with root package name */
    public long f834a;

    /* renamed from: b, reason: collision with root package name */
    public String f835b;

    /* renamed from: c, reason: collision with root package name */
    public Q f836c;

    /* renamed from: d, reason: collision with root package name */
    public C0015c0 f837d;

    /* renamed from: e, reason: collision with root package name */
    public C0017d0 f838e;

    /* renamed from: f, reason: collision with root package name */
    public C0025h0 f839f;

    /* renamed from: g, reason: collision with root package name */
    public byte f840g;

    public final P a() {
        String str;
        Q q9;
        C0015c0 c0015c0;
        if (this.f840g == 1 && (str = this.f835b) != null && (q9 = this.f836c) != null && (c0015c0 = this.f837d) != null) {
            return new P(this.f834a, str, q9, c0015c0, this.f838e, this.f839f);
        }
        StringBuilder sb = new StringBuilder();
        if ((1 & this.f840g) == 0) {
            sb.append(" timestamp");
        }
        if (this.f835b == null) {
            sb.append(" type");
        }
        if (this.f836c == null) {
            sb.append(" app");
        }
        if (this.f837d == null) {
            sb.append(" device");
        }
        throw new IllegalStateException(u0.z.f("Missing required properties:", sb));
    }
}
