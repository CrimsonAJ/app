package j3;

/* renamed from: j3.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1457h {

    /* renamed from: a, reason: collision with root package name */
    public final long f19622a;

    /* renamed from: b, reason: collision with root package name */
    public final long f19623b;

    /* renamed from: c, reason: collision with root package name */
    public long f19624c = -9223372036854775807L;

    /* renamed from: d, reason: collision with root package name */
    public long f19625d = -9223372036854775807L;

    /* renamed from: f, reason: collision with root package name */
    public long f19627f = -9223372036854775807L;

    /* renamed from: g, reason: collision with root package name */
    public long f19628g = -9223372036854775807L;
    public float j = 0.97f;

    /* renamed from: i, reason: collision with root package name */
    public float f19630i = 1.03f;

    /* renamed from: k, reason: collision with root package name */
    public float f19631k = 1.0f;

    /* renamed from: l, reason: collision with root package name */
    public long f19632l = -9223372036854775807L;

    /* renamed from: e, reason: collision with root package name */
    public long f19626e = -9223372036854775807L;

    /* renamed from: h, reason: collision with root package name */
    public long f19629h = -9223372036854775807L;

    /* renamed from: m, reason: collision with root package name */
    public long f19633m = -9223372036854775807L;

    /* renamed from: n, reason: collision with root package name */
    public long f19634n = -9223372036854775807L;

    public C1457h(long j, long j4) {
        this.f19622a = j;
        this.f19623b = j4;
    }

    public final void a() {
        long j = this.f19624c;
        if (j != -9223372036854775807L) {
            long j4 = this.f19625d;
            if (j4 != -9223372036854775807L) {
                j = j4;
            }
            long j9 = this.f19627f;
            if (j9 != -9223372036854775807L && j < j9) {
                j = j9;
            }
            long j10 = this.f19628g;
            if (j10 != -9223372036854775807L && j > j10) {
                j = j10;
            }
        } else {
            j = -9223372036854775807L;
        }
        if (this.f19626e == j) {
            return;
        }
        this.f19626e = j;
        this.f19629h = j;
        this.f19633m = -9223372036854775807L;
        this.f19634n = -9223372036854775807L;
        this.f19632l = -9223372036854775807L;
    }
}
