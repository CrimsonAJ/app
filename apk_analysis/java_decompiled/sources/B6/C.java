package B6;

import java.util.List;

/* loaded from: classes.dex */
public final class C {

    /* renamed from: a, reason: collision with root package name */
    public int f760a;

    /* renamed from: b, reason: collision with root package name */
    public String f761b;

    /* renamed from: c, reason: collision with root package name */
    public int f762c;

    /* renamed from: d, reason: collision with root package name */
    public int f763d;

    /* renamed from: e, reason: collision with root package name */
    public long f764e;

    /* renamed from: f, reason: collision with root package name */
    public long f765f;

    /* renamed from: g, reason: collision with root package name */
    public long f766g;

    /* renamed from: h, reason: collision with root package name */
    public String f767h;

    /* renamed from: i, reason: collision with root package name */
    public List f768i;
    public byte j;

    public final D a() {
        String str;
        if (this.j == 63 && (str = this.f761b) != null) {
            return new D(this.f760a, str, this.f762c, this.f763d, this.f764e, this.f765f, this.f766g, this.f767h, this.f768i);
        }
        StringBuilder sb = new StringBuilder();
        if ((this.j & 1) == 0) {
            sb.append(" pid");
        }
        if (this.f761b == null) {
            sb.append(" processName");
        }
        if ((this.j & 2) == 0) {
            sb.append(" reasonCode");
        }
        if ((this.j & 4) == 0) {
            sb.append(" importance");
        }
        if ((this.j & 8) == 0) {
            sb.append(" pss");
        }
        if ((this.j & 16) == 0) {
            sb.append(" rss");
        }
        if ((this.j & 32) == 0) {
            sb.append(" timestamp");
        }
        throw new IllegalStateException(u0.z.f("Missing required properties:", sb));
    }
}
