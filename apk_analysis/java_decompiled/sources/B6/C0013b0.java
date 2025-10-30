package B6;

/* renamed from: B6.b0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0013b0 {

    /* renamed from: a, reason: collision with root package name */
    public Double f908a;

    /* renamed from: b, reason: collision with root package name */
    public int f909b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f910c;

    /* renamed from: d, reason: collision with root package name */
    public int f911d;

    /* renamed from: e, reason: collision with root package name */
    public long f912e;

    /* renamed from: f, reason: collision with root package name */
    public long f913f;

    /* renamed from: g, reason: collision with root package name */
    public byte f914g;

    public final C0015c0 a() {
        if (this.f914g != 31) {
            StringBuilder sb = new StringBuilder();
            if ((this.f914g & 1) == 0) {
                sb.append(" batteryVelocity");
            }
            if ((this.f914g & 2) == 0) {
                sb.append(" proximityOn");
            }
            if ((this.f914g & 4) == 0) {
                sb.append(" orientation");
            }
            if ((this.f914g & 8) == 0) {
                sb.append(" ramUsed");
            }
            if ((this.f914g & 16) == 0) {
                sb.append(" diskUsed");
            }
            throw new IllegalStateException(u0.z.f("Missing required properties:", sb));
        }
        return new C0015c0(this.f908a, this.f909b, this.f910c, this.f911d, this.f912e, this.f913f);
    }
}
