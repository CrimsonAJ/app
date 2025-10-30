package g7;

import u0.z;

/* renamed from: g7.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1256b {

    /* renamed from: a, reason: collision with root package name */
    public String f17768a;

    /* renamed from: b, reason: collision with root package name */
    public String f17769b;

    /* renamed from: c, reason: collision with root package name */
    public String f17770c;

    /* renamed from: d, reason: collision with root package name */
    public String f17771d;

    /* renamed from: e, reason: collision with root package name */
    public long f17772e;

    /* renamed from: f, reason: collision with root package name */
    public byte f17773f;

    public final C1257c a() {
        if (this.f17773f == 1 && this.f17768a != null && this.f17769b != null && this.f17770c != null && this.f17771d != null) {
            return new C1257c(this.f17768a, this.f17769b, this.f17770c, this.f17771d, this.f17772e);
        }
        StringBuilder sb = new StringBuilder();
        if (this.f17768a == null) {
            sb.append(" rolloutId");
        }
        if (this.f17769b == null) {
            sb.append(" variantId");
        }
        if (this.f17770c == null) {
            sb.append(" parameterKey");
        }
        if (this.f17771d == null) {
            sb.append(" parameterValue");
        }
        if ((1 & this.f17773f) == 0) {
            sb.append(" templateVersion");
        }
        throw new IllegalStateException(z.f("Missing required properties:", sb));
    }
}
