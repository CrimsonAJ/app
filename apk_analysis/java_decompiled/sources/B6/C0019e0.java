package B6;

/* renamed from: B6.e0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0019e0 {

    /* renamed from: a, reason: collision with root package name */
    public C0023g0 f940a;

    /* renamed from: b, reason: collision with root package name */
    public String f941b;

    /* renamed from: c, reason: collision with root package name */
    public String f942c;

    /* renamed from: d, reason: collision with root package name */
    public long f943d;

    /* renamed from: e, reason: collision with root package name */
    public byte f944e;

    public final C0021f0 a() {
        C0023g0 c0023g0;
        String str;
        String str2;
        if (this.f944e == 1 && (c0023g0 = this.f940a) != null && (str = this.f941b) != null && (str2 = this.f942c) != null) {
            return new C0021f0(c0023g0, str, str2, this.f943d);
        }
        StringBuilder sb = new StringBuilder();
        if (this.f940a == null) {
            sb.append(" rolloutVariant");
        }
        if (this.f941b == null) {
            sb.append(" parameterKey");
        }
        if (this.f942c == null) {
            sb.append(" parameterValue");
        }
        if ((1 & this.f944e) == 0) {
            sb.append(" templateVersion");
        }
        throw new IllegalStateException(u0.z.f("Missing required properties:", sb));
    }
}
