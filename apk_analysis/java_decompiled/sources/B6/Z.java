package B6;

/* loaded from: classes.dex */
public final class Z {

    /* renamed from: a, reason: collision with root package name */
    public String f886a;

    /* renamed from: b, reason: collision with root package name */
    public int f887b;

    /* renamed from: c, reason: collision with root package name */
    public int f888c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f889d;

    /* renamed from: e, reason: collision with root package name */
    public byte f890e;

    public final C0011a0 a() {
        String str;
        if (this.f890e == 7 && (str = this.f886a) != null) {
            return new C0011a0(this.f887b, this.f888c, str, this.f889d);
        }
        StringBuilder sb = new StringBuilder();
        if (this.f886a == null) {
            sb.append(" processName");
        }
        if ((this.f890e & 1) == 0) {
            sb.append(" pid");
        }
        if ((this.f890e & 2) == 0) {
            sb.append(" importance");
        }
        if ((this.f890e & 4) == 0) {
            sb.append(" defaultProcess");
        }
        throw new IllegalStateException(u0.z.f("Missing required properties:", sb));
    }
}
