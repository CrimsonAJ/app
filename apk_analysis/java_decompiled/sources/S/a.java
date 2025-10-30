package S;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public int f6667a;

    /* renamed from: b, reason: collision with root package name */
    public int f6668b;

    /* renamed from: c, reason: collision with root package name */
    public float f6669c;

    /* renamed from: d, reason: collision with root package name */
    public float f6670d;

    /* renamed from: e, reason: collision with root package name */
    public long f6671e;

    /* renamed from: f, reason: collision with root package name */
    public long f6672f;

    /* renamed from: g, reason: collision with root package name */
    public long f6673g;

    /* renamed from: h, reason: collision with root package name */
    public float f6674h;

    /* renamed from: i, reason: collision with root package name */
    public int f6675i;

    public final float a(long j) {
        long j4 = this.f6671e;
        if (j < j4) {
            return 0.0f;
        }
        long j9 = this.f6673g;
        if (j9 >= 0 && j >= j9) {
            float f9 = this.f6674h;
            return (d.b(((float) (j - j9)) / this.f6675i, 0.0f, 1.0f) * f9) + (1.0f - f9);
        }
        return d.b(((float) (j - j4)) / this.f6667a, 0.0f, 1.0f) * 0.5f;
    }
}
