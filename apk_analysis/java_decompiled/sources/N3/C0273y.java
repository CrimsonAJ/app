package N3;

/* renamed from: N3.y, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0273y {

    /* renamed from: a, reason: collision with root package name */
    public final Object f5207a;

    /* renamed from: b, reason: collision with root package name */
    public final int f5208b;

    /* renamed from: c, reason: collision with root package name */
    public final int f5209c;

    /* renamed from: d, reason: collision with root package name */
    public final long f5210d;

    /* renamed from: e, reason: collision with root package name */
    public final int f5211e;

    public C0273y(long j, Object obj) {
        this(obj, -1, -1, j, -1);
    }

    public final boolean a() {
        if (this.f5208b != -1) {
            return true;
        }
        return false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0273y)) {
            return false;
        }
        C0273y c0273y = (C0273y) obj;
        if (this.f5207a.equals(c0273y.f5207a) && this.f5208b == c0273y.f5208b && this.f5209c == c0273y.f5209c && this.f5210d == c0273y.f5210d && this.f5211e == c0273y.f5211e) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((this.f5207a.hashCode() + 527) * 31) + this.f5208b) * 31) + this.f5209c) * 31) + ((int) this.f5210d)) * 31) + this.f5211e;
    }

    public C0273y(C0273y c0273y) {
        this.f5207a = c0273y.f5207a;
        this.f5208b = c0273y.f5208b;
        this.f5209c = c0273y.f5209c;
        this.f5210d = c0273y.f5210d;
        this.f5211e = c0273y.f5211e;
    }

    public C0273y(Object obj, int i9, int i10, long j, int i11) {
        this.f5207a = obj;
        this.f5208b = i9;
        this.f5209c = i10;
        this.f5210d = j;
        this.f5211e = i11;
    }
}
