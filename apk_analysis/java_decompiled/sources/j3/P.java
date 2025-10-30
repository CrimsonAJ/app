package j3;

/* loaded from: classes.dex */
public abstract class P implements InterfaceC1453f {

    /* renamed from: f, reason: collision with root package name */
    public static final X0.k f19457f;

    /* renamed from: a, reason: collision with root package name */
    public final long f19458a;

    /* renamed from: b, reason: collision with root package name */
    public final long f19459b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f19460c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f19461d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f19462e;

    static {
        new O().a();
        f19457f = new X0.k(27);
    }

    public P(O o9) {
        this.f19458a = o9.f19452a;
        this.f19459b = o9.f19453b;
        this.f19460c = o9.f19454c;
        this.f19461d = o9.f19455d;
        this.f19462e = o9.f19456e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof P)) {
            return false;
        }
        P p9 = (P) obj;
        if (this.f19458a == p9.f19458a && this.f19459b == p9.f19459b && this.f19460c == p9.f19460c && this.f19461d == p9.f19461d && this.f19462e == p9.f19462e) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        long j = this.f19458a;
        int i9 = ((int) (j ^ (j >>> 32))) * 31;
        long j4 = this.f19459b;
        return ((((((i9 + ((int) ((j4 >>> 32) ^ j4))) * 31) + (this.f19460c ? 1 : 0)) * 31) + (this.f19461d ? 1 : 0)) * 31) + (this.f19462e ? 1 : 0);
    }
}
