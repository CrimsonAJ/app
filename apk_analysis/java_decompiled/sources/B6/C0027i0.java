package B6;

/* renamed from: B6.i0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0027i0 {

    /* renamed from: a, reason: collision with root package name */
    public int f973a;

    /* renamed from: b, reason: collision with root package name */
    public String f974b;

    /* renamed from: c, reason: collision with root package name */
    public String f975c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f976d;

    /* renamed from: e, reason: collision with root package name */
    public byte f977e;

    public final C0029j0 a() {
        String str;
        String str2;
        if (this.f977e == 3 && (str = this.f974b) != null && (str2 = this.f975c) != null) {
            return new C0029j0(str, str2, this.f973a, this.f976d);
        }
        StringBuilder sb = new StringBuilder();
        if ((this.f977e & 1) == 0) {
            sb.append(" platform");
        }
        if (this.f974b == null) {
            sb.append(" version");
        }
        if (this.f975c == null) {
            sb.append(" buildVersion");
        }
        if ((this.f977e & 2) == 0) {
            sb.append(" jailbroken");
        }
        throw new IllegalStateException(u0.z.f("Missing required properties:", sb));
    }
}
