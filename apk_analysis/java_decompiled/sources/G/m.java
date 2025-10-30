package G;

/* loaded from: classes.dex */
public final class m {

    /* renamed from: k, reason: collision with root package name */
    public static final m f2626k;

    /* renamed from: a, reason: collision with root package name */
    public final float f2627a;

    /* renamed from: b, reason: collision with root package name */
    public final float f2628b;

    /* renamed from: c, reason: collision with root package name */
    public final float f2629c;

    /* renamed from: d, reason: collision with root package name */
    public final float f2630d;

    /* renamed from: e, reason: collision with root package name */
    public final float f2631e;

    /* renamed from: f, reason: collision with root package name */
    public final float f2632f;

    /* renamed from: g, reason: collision with root package name */
    public final float[] f2633g;

    /* renamed from: h, reason: collision with root package name */
    public final float f2634h;

    /* renamed from: i, reason: collision with root package name */
    public final float f2635i;
    public final float j;

    static {
        float f9;
        float[] fArr = b.f2597c;
        float n7 = (float) ((b.n() * 63.66197723675813d) / 100.0d);
        float[][] fArr2 = b.f2595a;
        float f10 = fArr[0];
        float[] fArr3 = fArr2[0];
        float f11 = fArr3[0] * f10;
        float f12 = fArr[1];
        float f13 = (fArr3[1] * f12) + f11;
        float f14 = fArr[2];
        float f15 = (fArr3[2] * f14) + f13;
        float[] fArr4 = fArr2[1];
        float f16 = (fArr4[2] * f14) + (fArr4[1] * f12) + (fArr4[0] * f10);
        float[] fArr5 = fArr2[2];
        float f17 = (f14 * fArr5[2]) + (f12 * fArr5[1]) + (f10 * fArr5[0]);
        if (1.0f >= 0.9d) {
            f9 = 0.69f;
        } else {
            f9 = 0.655f;
        }
        float f18 = f9;
        float exp = (1.0f - (((float) Math.exp(((-n7) - 42.0f) / 92.0f)) * 0.2777778f)) * 1.0f;
        double d9 = exp;
        if (d9 > 1.0d) {
            exp = 1.0f;
        } else if (d9 < 0.0d) {
            exp = 0.0f;
        }
        float f19 = 1.0f / ((5.0f * n7) + 1.0f);
        float f20 = f19 * f19 * f19 * f19;
        float f21 = 1.0f - f20;
        float cbrt = (0.1f * f21 * f21 * ((float) Math.cbrt(n7 * 5.0d))) + (f20 * n7);
        float n9 = b.n() / fArr[1];
        double d10 = n9;
        float sqrt = ((float) Math.sqrt(d10)) + 1.48f;
        float pow = 0.725f / ((float) Math.pow(d10, 0.2d));
        float[] fArr6 = {(float) Math.pow(((r9[0] * cbrt) * f15) / 100.0d, 0.42d), (float) Math.pow(((r9[1] * cbrt) * f16) / 100.0d, 0.42d), (float) Math.pow(((r9[2] * cbrt) * f17) / 100.0d, 0.42d)};
        float f22 = fArr6[0];
        float f23 = (f22 * 400.0f) / (f22 + 27.13f);
        float f24 = fArr6[1];
        float f25 = (f24 * 400.0f) / (f24 + 27.13f);
        float f26 = fArr6[2];
        float[] fArr7 = {f23, f25, (400.0f * f26) / (f26 + 27.13f)};
        f2626k = new m(n9, ((fArr7[2] * 0.05f) + (fArr7[0] * 2.0f) + fArr7[1]) * pow, pow, pow, f18, 1.0f, new float[]{(((100.0f / f15) * exp) + 1.0f) - exp, (((100.0f / f16) * exp) + 1.0f) - exp, (((100.0f / f17) * exp) + 1.0f) - exp}, cbrt, (float) Math.pow(cbrt, 0.25d), sqrt);
    }

    public m(float f9, float f10, float f11, float f12, float f13, float f14, float[] fArr, float f15, float f16, float f17) {
        this.f2632f = f9;
        this.f2627a = f10;
        this.f2628b = f11;
        this.f2629c = f12;
        this.f2630d = f13;
        this.f2631e = f14;
        this.f2633g = fArr;
        this.f2634h = f15;
        this.f2635i = f16;
        this.j = f17;
    }
}
