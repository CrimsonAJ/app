package B6;

/* loaded from: classes.dex */
public final class M {

    /* renamed from: a, reason: collision with root package name */
    public int f816a;

    /* renamed from: b, reason: collision with root package name */
    public String f817b;

    /* renamed from: c, reason: collision with root package name */
    public int f818c;

    /* renamed from: d, reason: collision with root package name */
    public long f819d;

    /* renamed from: e, reason: collision with root package name */
    public long f820e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f821f;

    /* renamed from: g, reason: collision with root package name */
    public int f822g;

    /* renamed from: h, reason: collision with root package name */
    public String f823h;

    /* renamed from: i, reason: collision with root package name */
    public String f824i;
    public byte j;

    public final N a() {
        String str;
        String str2;
        String str3;
        if (this.j == 63 && (str = this.f817b) != null && (str2 = this.f823h) != null && (str3 = this.f824i) != null) {
            return new N(this.f816a, str, this.f818c, this.f819d, this.f820e, this.f821f, this.f822g, str2, str3);
        }
        StringBuilder sb = new StringBuilder();
        if ((this.j & 1) == 0) {
            sb.append(" arch");
        }
        if (this.f817b == null) {
            sb.append(" model");
        }
        if ((this.j & 2) == 0) {
            sb.append(" cores");
        }
        if ((this.j & 4) == 0) {
            sb.append(" ram");
        }
        if ((this.j & 8) == 0) {
            sb.append(" diskSpace");
        }
        if ((this.j & 16) == 0) {
            sb.append(" simulator");
        }
        if ((this.j & 32) == 0) {
            sb.append(" state");
        }
        if (this.f823h == null) {
            sb.append(" manufacturer");
        }
        if (this.f824i == null) {
            sb.append(" modelClass");
        }
        throw new IllegalStateException(u0.z.f("Missing required properties:", sb));
    }
}
