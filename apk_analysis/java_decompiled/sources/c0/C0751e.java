package c0;

/* renamed from: c0.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0751e {

    /* renamed from: a, reason: collision with root package name */
    public double f11578a;

    /* renamed from: b, reason: collision with root package name */
    public double f11579b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f11580c;

    /* renamed from: d, reason: collision with root package name */
    public double f11581d;

    /* renamed from: e, reason: collision with root package name */
    public double f11582e;

    /* renamed from: f, reason: collision with root package name */
    public double f11583f;

    /* renamed from: g, reason: collision with root package name */
    public double f11584g;

    /* renamed from: h, reason: collision with root package name */
    public double f11585h;

    /* renamed from: i, reason: collision with root package name */
    public double f11586i;
    public final C0749c j;

    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, c0.c] */
    public C0751e() {
        this.f11578a = Math.sqrt(1500.0d);
        this.f11579b = 0.5d;
        this.f11580c = false;
        this.f11586i = Double.MAX_VALUE;
        this.j = new Object();
    }

    public final C0749c a(double d9, double d10, long j) {
        double sin;
        double cos;
        if (!this.f11580c) {
            if (this.f11586i != Double.MAX_VALUE) {
                double d11 = this.f11579b;
                if (d11 > 1.0d) {
                    double d12 = this.f11578a;
                    this.f11583f = (Math.sqrt((d11 * d11) - 1.0d) * d12) + ((-d11) * d12);
                    double d13 = this.f11579b;
                    double d14 = this.f11578a;
                    this.f11584g = ((-d13) * d14) - (Math.sqrt((d13 * d13) - 1.0d) * d14);
                } else if (d11 >= 0.0d && d11 < 1.0d) {
                    this.f11585h = Math.sqrt(1.0d - (d11 * d11)) * this.f11578a;
                }
                this.f11580c = true;
            } else {
                throw new IllegalStateException("Error: Final position of the spring must be set before the animation starts");
            }
        }
        double d15 = j / 1000.0d;
        double d16 = d9 - this.f11586i;
        double d17 = this.f11579b;
        if (d17 > 1.0d) {
            double d18 = this.f11584g;
            double d19 = ((d18 * d16) - d10) / (d18 - this.f11583f);
            double d20 = d16 - d19;
            sin = (Math.pow(2.718281828459045d, this.f11583f * d15) * d19) + (Math.pow(2.718281828459045d, d18 * d15) * d20);
            double d21 = this.f11584g;
            double pow = Math.pow(2.718281828459045d, d21 * d15) * d20 * d21;
            double d22 = this.f11583f;
            cos = (Math.pow(2.718281828459045d, d22 * d15) * d19 * d22) + pow;
        } else if (d17 == 1.0d) {
            double d23 = this.f11578a;
            double d24 = (d23 * d16) + d10;
            double d25 = (d24 * d15) + d16;
            double pow2 = Math.pow(2.718281828459045d, (-d23) * d15) * d25;
            double pow3 = Math.pow(2.718281828459045d, (-this.f11578a) * d15) * d25;
            double d26 = -this.f11578a;
            cos = (Math.pow(2.718281828459045d, d26 * d15) * d24) + (pow3 * d26);
            sin = pow2;
        } else {
            double d27 = 1.0d / this.f11585h;
            double d28 = this.f11578a;
            double d29 = ((d17 * d28 * d16) + d10) * d27;
            sin = ((Math.sin(this.f11585h * d15) * d29) + (Math.cos(this.f11585h * d15) * d16)) * Math.pow(2.718281828459045d, (-d17) * d28 * d15);
            double d30 = this.f11578a;
            double d31 = this.f11579b;
            double d32 = (-d30) * sin * d31;
            double pow4 = Math.pow(2.718281828459045d, (-d31) * d30 * d15);
            double d33 = this.f11585h;
            double sin2 = Math.sin(d33 * d15) * (-d33) * d16;
            double d34 = this.f11585h;
            cos = (((Math.cos(d34 * d15) * d29 * d34) + sin2) * pow4) + d32;
        }
        float f9 = (float) (sin + this.f11586i);
        C0749c c0749c = this.j;
        c0749c.f11558a = f9;
        c0749c.f11559b = (float) cos;
        return c0749c;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, c0.c] */
    public C0751e(float f9) {
        this.f11578a = Math.sqrt(1500.0d);
        this.f11579b = 0.5d;
        this.f11580c = false;
        this.j = new Object();
        this.f11586i = f9;
    }
}
