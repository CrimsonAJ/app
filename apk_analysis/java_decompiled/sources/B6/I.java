package B6;

import java.util.List;

/* loaded from: classes.dex */
public final class I {

    /* renamed from: a, reason: collision with root package name */
    public String f787a;

    /* renamed from: b, reason: collision with root package name */
    public String f788b;

    /* renamed from: c, reason: collision with root package name */
    public String f789c;

    /* renamed from: d, reason: collision with root package name */
    public long f790d;

    /* renamed from: e, reason: collision with root package name */
    public Long f791e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f792f;

    /* renamed from: g, reason: collision with root package name */
    public K f793g;

    /* renamed from: h, reason: collision with root package name */
    public C0031k0 f794h;

    /* renamed from: i, reason: collision with root package name */
    public C0029j0 f795i;
    public N j;

    /* renamed from: k, reason: collision with root package name */
    public List f796k;

    /* renamed from: l, reason: collision with root package name */
    public int f797l;

    /* renamed from: m, reason: collision with root package name */
    public byte f798m;

    public final J a() {
        String str;
        String str2;
        K k5;
        if (this.f798m == 7 && (str = this.f787a) != null && (str2 = this.f788b) != null && (k5 = this.f793g) != null) {
            return new J(str, str2, this.f789c, this.f790d, this.f791e, this.f792f, k5, this.f794h, this.f795i, this.j, this.f796k, this.f797l);
        }
        StringBuilder sb = new StringBuilder();
        if (this.f787a == null) {
            sb.append(" generator");
        }
        if (this.f788b == null) {
            sb.append(" identifier");
        }
        if ((this.f798m & 1) == 0) {
            sb.append(" startedAt");
        }
        if ((this.f798m & 2) == 0) {
            sb.append(" crashed");
        }
        if (this.f793g == null) {
            sb.append(" app");
        }
        if ((this.f798m & 4) == 0) {
            sb.append(" generatorType");
        }
        throw new IllegalStateException(u0.z.f("Missing required properties:", sb));
    }
}
