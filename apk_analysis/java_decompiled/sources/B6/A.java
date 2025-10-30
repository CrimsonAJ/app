package B6;

/* loaded from: classes.dex */
public final class A {

    /* renamed from: a, reason: collision with root package name */
    public String f737a;

    /* renamed from: b, reason: collision with root package name */
    public String f738b;

    /* renamed from: c, reason: collision with root package name */
    public int f739c;

    /* renamed from: d, reason: collision with root package name */
    public String f740d;

    /* renamed from: e, reason: collision with root package name */
    public String f741e;

    /* renamed from: f, reason: collision with root package name */
    public String f742f;

    /* renamed from: g, reason: collision with root package name */
    public String f743g;

    /* renamed from: h, reason: collision with root package name */
    public String f744h;

    /* renamed from: i, reason: collision with root package name */
    public String f745i;
    public J j;

    /* renamed from: k, reason: collision with root package name */
    public G f746k;

    /* renamed from: l, reason: collision with root package name */
    public D f747l;

    /* renamed from: m, reason: collision with root package name */
    public byte f748m;

    public final B a() {
        if (this.f748m == 1 && this.f737a != null && this.f738b != null && this.f740d != null && this.f744h != null && this.f745i != null) {
            return new B(this.f737a, this.f738b, this.f739c, this.f740d, this.f741e, this.f742f, this.f743g, this.f744h, this.f745i, this.j, this.f746k, this.f747l);
        }
        StringBuilder sb = new StringBuilder();
        if (this.f737a == null) {
            sb.append(" sdkVersion");
        }
        if (this.f738b == null) {
            sb.append(" gmpAppId");
        }
        if ((1 & this.f748m) == 0) {
            sb.append(" platform");
        }
        if (this.f740d == null) {
            sb.append(" installationUuid");
        }
        if (this.f744h == null) {
            sb.append(" buildVersion");
        }
        if (this.f745i == null) {
            sb.append(" displayVersion");
        }
        throw new IllegalStateException(u0.z.f("Missing required properties:", sb));
    }
}
