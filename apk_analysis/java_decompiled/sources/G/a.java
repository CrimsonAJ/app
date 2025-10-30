package G;

import android.graphics.Color;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final float f2589a;

    /* renamed from: b, reason: collision with root package name */
    public final float f2590b;

    /* renamed from: c, reason: collision with root package name */
    public final float f2591c;

    /* renamed from: d, reason: collision with root package name */
    public final float f2592d;

    /* renamed from: e, reason: collision with root package name */
    public final float f2593e;

    /* renamed from: f, reason: collision with root package name */
    public final float f2594f;

    public a(float f9, float f10, float f11, float f12, float f13, float f14) {
        this.f2589a = f9;
        this.f2590b = f10;
        this.f2591c = f11;
        this.f2592d = f12;
        this.f2593e = f13;
        this.f2594f = f14;
    }

    public static a a(int i9) {
        float f9;
        m mVar = m.f2626k;
        float f10 = b.f(Color.red(i9));
        float f11 = b.f(Color.green(i9));
        float f12 = b.f(Color.blue(i9));
        float[][] fArr = b.f2598d;
        float[] fArr2 = fArr[0];
        float f13 = (fArr2[2] * f12) + (fArr2[1] * f11) + (fArr2[0] * f10);
        float[] fArr3 = fArr[1];
        float f14 = (fArr3[2] * f12) + (fArr3[1] * f11) + (fArr3[0] * f10);
        float[] fArr4 = fArr[2];
        float f15 = (f12 * fArr4[2]) + (f11 * fArr4[1]) + (f10 * fArr4[0]);
        float[][] fArr5 = b.f2595a;
        float[] fArr6 = fArr5[0];
        float f16 = (fArr6[2] * f15) + (fArr6[1] * f14) + (fArr6[0] * f13);
        float[] fArr7 = fArr5[1];
        float f17 = (fArr7[2] * f15) + (fArr7[1] * f14) + (fArr7[0] * f13);
        float[] fArr8 = fArr5[2];
        float f18 = (f15 * fArr8[2]) + (f14 * fArr8[1]) + (f13 * fArr8[0]);
        float[] fArr9 = mVar.f2633g;
        float f19 = fArr9[0] * f16;
        float f20 = fArr9[1] * f17;
        float f21 = fArr9[2] * f18;
        float abs = Math.abs(f19);
        float f22 = mVar.f2634h;
        float pow = (float) Math.pow((abs * f22) / 100.0d, 0.42d);
        float pow2 = (float) Math.pow((Math.abs(f20) * f22) / 100.0d, 0.42d);
        float pow3 = (float) Math.pow((Math.abs(f21) * f22) / 100.0d, 0.42d);
        float signum = ((Math.signum(f19) * 400.0f) * pow) / (pow + 27.13f);
        float signum2 = ((Math.signum(f20) * 400.0f) * pow2) / (pow2 + 27.13f);
        float signum3 = ((Math.signum(f21) * 400.0f) * pow3) / (pow3 + 27.13f);
        double d9 = signum3;
        float f23 = ((float) (((signum2 * (-12.0d)) + (signum * 11.0d)) + d9)) / 11.0f;
        float f24 = ((float) ((signum + signum2) - (d9 * 2.0d))) / 9.0f;
        float f25 = signum2 * 20.0f;
        float f26 = ((21.0f * signum3) + ((signum * 20.0f) + f25)) / 20.0f;
        float f27 = (((signum * 40.0f) + f25) + signum3) / 20.0f;
        float atan2 = (((float) Math.atan2(f24, f23)) * 180.0f) / 3.1415927f;
        if (atan2 < 0.0f) {
            atan2 += 360.0f;
        } else if (atan2 >= 360.0f) {
            atan2 -= 360.0f;
        }
        float f28 = atan2;
        float f29 = (3.1415927f * f28) / 180.0f;
        float f30 = f27 * mVar.f2628b;
        float f31 = mVar.f2627a;
        float f32 = mVar.f2630d;
        float pow4 = ((float) Math.pow(f30 / f31, mVar.j * f32)) * 100.0f;
        Math.sqrt(pow4 / 100.0f);
        float f33 = f31 + 4.0f;
        if (f28 < 20.14d) {
            f9 = f28 + 360.0f;
        } else {
            f9 = f28;
        }
        float pow5 = ((float) Math.pow(1.64d - Math.pow(0.29d, mVar.f2632f), 0.73d)) * ((float) Math.pow((((((((float) (Math.cos(((f9 * 3.141592653589793d) / 180.0d) + 2.0d) + 3.8d)) * 0.25f) * 3846.1538f) * mVar.f2631e) * mVar.f2629c) * ((float) Math.sqrt((f24 * f24) + (f23 * f23)))) / (f26 + 0.305f), 0.9d)) * ((float) Math.sqrt(pow4 / 100.0d));
        float f34 = mVar.f2635i * pow5;
        Math.sqrt((r3 * f32) / f33);
        float f35 = (1.7f * pow4) / ((0.007f * pow4) + 1.0f);
        float log = ((float) Math.log((f34 * 0.0228f) + 1.0f)) * 43.85965f;
        double d10 = f29;
        return new a(f28, pow5, pow4, f35, log * ((float) Math.cos(d10)), log * ((float) Math.sin(d10)));
    }

    public static a b(float f9, float f10, float f11) {
        m mVar = m.f2626k;
        float f12 = mVar.f2630d;
        Math.sqrt(f9 / 100.0d);
        float f13 = mVar.f2627a + 4.0f;
        float f14 = mVar.f2635i * f10;
        Math.sqrt(((f10 / ((float) Math.sqrt(r1))) * mVar.f2630d) / f13);
        float f15 = (1.7f * f9) / ((0.007f * f9) + 1.0f);
        float log = ((float) Math.log((f14 * 0.0228d) + 1.0d)) * 43.85965f;
        double d9 = (3.1415927f * f11) / 180.0f;
        return new a(f11, f10, f9, f15, log * ((float) Math.cos(d9)), log * ((float) Math.sin(d9)));
    }

    public final int c(m mVar) {
        float f9;
        float f10 = this.f2590b;
        double d9 = f10;
        float f11 = this.f2591c;
        if (d9 != 0.0d) {
            double d10 = f11;
            if (d10 != 0.0d) {
                f9 = f10 / ((float) Math.sqrt(d10 / 100.0d));
                float pow = (float) Math.pow(f9 / Math.pow(1.64d - Math.pow(0.29d, mVar.f2632f), 0.73d), 1.1111111111111112d);
                double d11 = (this.f2589a * 3.1415927f) / 180.0f;
                float cos = ((float) (Math.cos(2.0d + d11) + 3.8d)) * 0.25f;
                float pow2 = mVar.f2627a * ((float) Math.pow(f11 / 100.0d, (1.0d / mVar.f2630d) / mVar.j));
                float f12 = cos * 3846.1538f * mVar.f2631e * mVar.f2629c;
                float f13 = pow2 / mVar.f2628b;
                float sin = (float) Math.sin(d11);
                float cos2 = (float) Math.cos(d11);
                float f14 = (((0.305f + f13) * 23.0f) * pow) / (((pow * 108.0f) * sin) + (((11.0f * pow) * cos2) + (f12 * 23.0f)));
                float f15 = cos2 * f14;
                float f16 = f14 * sin;
                float f17 = f13 * 460.0f;
                float f18 = ((288.0f * f16) + ((451.0f * f15) + f17)) / 1403.0f;
                float f19 = ((f17 - (891.0f * f15)) - (261.0f * f16)) / 1403.0f;
                float f20 = ((f17 - (f15 * 220.0f)) - (f16 * 6300.0f)) / 1403.0f;
                float max = (float) Math.max(0.0d, (Math.abs(f18) * 27.13d) / (400.0d - Math.abs(f18)));
                float signum = Math.signum(f18);
                float f21 = 100.0f / mVar.f2634h;
                float pow3 = signum * f21 * ((float) Math.pow(max, 2.380952380952381d));
                float signum2 = Math.signum(f19) * f21 * ((float) Math.pow((float) Math.max(0.0d, (Math.abs(f19) * 27.13d) / (400.0d - Math.abs(f19))), 2.380952380952381d));
                float signum3 = Math.signum(f20) * f21 * ((float) Math.pow((float) Math.max(0.0d, (Math.abs(f20) * 27.13d) / (400.0d - Math.abs(f20))), 2.380952380952381d));
                float[] fArr = mVar.f2633g;
                float f22 = pow3 / fArr[0];
                float f23 = signum2 / fArr[1];
                float f24 = signum3 / fArr[2];
                float[][] fArr2 = b.f2596b;
                float[] fArr3 = fArr2[0];
                float f25 = (fArr3[2] * f24) + (fArr3[1] * f23) + (fArr3[0] * f22);
                float[] fArr4 = fArr2[1];
                float f26 = (fArr4[2] * f24) + (fArr4[1] * f23) + (fArr4[0] * f22);
                float[] fArr5 = fArr2[2];
                return H.a.b(f25, f26, (f24 * fArr5[2]) + (f23 * fArr5[1]) + (f22 * fArr5[0]));
            }
        }
        f9 = 0.0f;
        float pow4 = (float) Math.pow(f9 / Math.pow(1.64d - Math.pow(0.29d, mVar.f2632f), 0.73d), 1.1111111111111112d);
        double d112 = (this.f2589a * 3.1415927f) / 180.0f;
        float cos3 = ((float) (Math.cos(2.0d + d112) + 3.8d)) * 0.25f;
        float pow22 = mVar.f2627a * ((float) Math.pow(f11 / 100.0d, (1.0d / mVar.f2630d) / mVar.j));
        float f122 = cos3 * 3846.1538f * mVar.f2631e * mVar.f2629c;
        float f132 = pow22 / mVar.f2628b;
        float sin2 = (float) Math.sin(d112);
        float cos22 = (float) Math.cos(d112);
        float f142 = (((0.305f + f132) * 23.0f) * pow4) / (((pow4 * 108.0f) * sin2) + (((11.0f * pow4) * cos22) + (f122 * 23.0f)));
        float f152 = cos22 * f142;
        float f162 = f142 * sin2;
        float f172 = f132 * 460.0f;
        float f182 = ((288.0f * f162) + ((451.0f * f152) + f172)) / 1403.0f;
        float f192 = ((f172 - (891.0f * f152)) - (261.0f * f162)) / 1403.0f;
        float f202 = ((f172 - (f152 * 220.0f)) - (f162 * 6300.0f)) / 1403.0f;
        float max2 = (float) Math.max(0.0d, (Math.abs(f182) * 27.13d) / (400.0d - Math.abs(f182)));
        float signum4 = Math.signum(f182);
        float f212 = 100.0f / mVar.f2634h;
        float pow32 = signum4 * f212 * ((float) Math.pow(max2, 2.380952380952381d));
        float signum22 = Math.signum(f192) * f212 * ((float) Math.pow((float) Math.max(0.0d, (Math.abs(f192) * 27.13d) / (400.0d - Math.abs(f192))), 2.380952380952381d));
        float signum32 = Math.signum(f202) * f212 * ((float) Math.pow((float) Math.max(0.0d, (Math.abs(f202) * 27.13d) / (400.0d - Math.abs(f202))), 2.380952380952381d));
        float[] fArr6 = mVar.f2633g;
        float f222 = pow32 / fArr6[0];
        float f232 = signum22 / fArr6[1];
        float f242 = signum32 / fArr6[2];
        float[][] fArr22 = b.f2596b;
        float[] fArr32 = fArr22[0];
        float f252 = (fArr32[2] * f242) + (fArr32[1] * f232) + (fArr32[0] * f222);
        float[] fArr42 = fArr22[1];
        float f262 = (fArr42[2] * f242) + (fArr42[1] * f232) + (fArr42[0] * f222);
        float[] fArr52 = fArr22[2];
        return H.a.b(f252, f262, (f242 * fArr52[2]) + (f232 * fArr52[1]) + (f222 * fArr52[0]));
    }
}
