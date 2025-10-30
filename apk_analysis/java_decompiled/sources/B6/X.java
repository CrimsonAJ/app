package B6;

/* loaded from: classes.dex */
public final class X {

    /* renamed from: a, reason: collision with root package name */
    public long f875a;

    /* renamed from: b, reason: collision with root package name */
    public String f876b;

    /* renamed from: c, reason: collision with root package name */
    public String f877c;

    /* renamed from: d, reason: collision with root package name */
    public long f878d;

    /* renamed from: e, reason: collision with root package name */
    public int f879e;

    /* renamed from: f, reason: collision with root package name */
    public byte f880f;

    public final Y a() {
        String str;
        if (this.f880f == 7 && (str = this.f876b) != null) {
            return new Y(this.f875a, str, this.f877c, this.f878d, this.f879e);
        }
        StringBuilder sb = new StringBuilder();
        if ((this.f880f & 1) == 0) {
            sb.append(" pc");
        }
        if (this.f876b == null) {
            sb.append(" symbol");
        }
        if ((this.f880f & 2) == 0) {
            sb.append(" offset");
        }
        if ((this.f880f & 4) == 0) {
            sb.append(" importance");
        }
        throw new IllegalStateException(u0.z.f("Missing required properties:", sb));
    }
}
