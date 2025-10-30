package H;

import android.graphics.Color;

/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public static final ThreadLocal f2912a = new ThreadLocal();

    public static void a(int i9, int i10, int i11, float[] fArr) {
        float f9;
        float abs;
        float min;
        float min2;
        float f10 = i9 / 255.0f;
        float f11 = i10 / 255.0f;
        float f12 = i11 / 255.0f;
        float max = Math.max(f10, Math.max(f11, f12));
        float min3 = Math.min(f10, Math.min(f11, f12));
        float f13 = max - min3;
        float f14 = (max + min3) / 2.0f;
        float f15 = 0.0f;
        if (max == min3) {
            f9 = 0.0f;
            abs = 0.0f;
        } else {
            if (max == f10) {
                f9 = ((f11 - f12) / f13) % 6.0f;
            } else if (max == f11) {
                f9 = ((f12 - f10) / f13) + 2.0f;
            } else {
                f9 = 4.0f + ((f10 - f11) / f13);
            }
            abs = f13 / (1.0f - Math.abs((2.0f * f14) - 1.0f));
        }
        float f16 = (f9 * 60.0f) % 360.0f;
        if (f16 < 0.0f) {
            f16 += 360.0f;
        }
        if (f16 < 0.0f) {
            min = 0.0f;
        } else {
            min = Math.min(f16, 360.0f);
        }
        fArr[0] = min;
        if (abs < 0.0f) {
            min2 = 0.0f;
        } else {
            min2 = Math.min(abs, 1.0f);
        }
        fArr[1] = min2;
        if (f14 >= 0.0f) {
            f15 = Math.min(f14, 1.0f);
        }
        fArr[2] = f15;
    }

    public static int b(double d9, double d10, double d11) {
        double d12;
        double d13;
        double d14;
        int min;
        int min2;
        double d15 = (((-0.4986d) * d11) + (((-1.5372d) * d10) + (3.2406d * d9))) / 100.0d;
        double d16 = ((0.0415d * d11) + ((1.8758d * d10) + ((-0.9689d) * d9))) / 100.0d;
        double d17 = ((1.057d * d11) + (((-0.204d) * d10) + (0.0557d * d9))) / 100.0d;
        if (d15 > 0.0031308d) {
            d12 = (Math.pow(d15, 0.4166666666666667d) * 1.055d) - 0.055d;
        } else {
            d12 = d15 * 12.92d;
        }
        if (d16 > 0.0031308d) {
            d13 = (Math.pow(d16, 0.4166666666666667d) * 1.055d) - 0.055d;
        } else {
            d13 = d16 * 12.92d;
        }
        if (d17 > 0.0031308d) {
            d14 = (Math.pow(d17, 0.4166666666666667d) * 1.055d) - 0.055d;
        } else {
            d14 = d17 * 12.92d;
        }
        int round = (int) Math.round(d12 * 255.0d);
        int i9 = 0;
        if (round < 0) {
            min = 0;
        } else {
            min = Math.min(round, 255);
        }
        int round2 = (int) Math.round(d13 * 255.0d);
        if (round2 < 0) {
            min2 = 0;
        } else {
            min2 = Math.min(round2, 255);
        }
        int round3 = (int) Math.round(d14 * 255.0d);
        if (round3 >= 0) {
            i9 = Math.min(round3, 255);
        }
        return Color.rgb(min, min2, i9);
    }

    public static double c(int i9, int i10) {
        if (Color.alpha(i10) == 255) {
            if (Color.alpha(i9) < 255) {
                i9 = f(i9, i10);
            }
            double d9 = d(i9) + 0.05d;
            double d10 = d(i10) + 0.05d;
            return Math.max(d9, d10) / Math.min(d9, d10);
        }
        throw new IllegalArgumentException("background can not be translucent: #" + Integer.toHexString(i10));
    }

    public static double d(int i9) {
        double pow;
        double pow2;
        double pow3;
        ThreadLocal threadLocal = f2912a;
        double[] dArr = (double[]) threadLocal.get();
        if (dArr == null) {
            dArr = new double[3];
            threadLocal.set(dArr);
        }
        int red = Color.red(i9);
        int green = Color.green(i9);
        int blue = Color.blue(i9);
        if (dArr.length == 3) {
            double d9 = red / 255.0d;
            if (d9 < 0.04045d) {
                pow = d9 / 12.92d;
            } else {
                pow = Math.pow((d9 + 0.055d) / 1.055d, 2.4d);
            }
            double d10 = green / 255.0d;
            if (d10 < 0.04045d) {
                pow2 = d10 / 12.92d;
            } else {
                pow2 = Math.pow((d10 + 0.055d) / 1.055d, 2.4d);
            }
            double d11 = blue / 255.0d;
            if (d11 < 0.04045d) {
                pow3 = d11 / 12.92d;
            } else {
                pow3 = Math.pow((d11 + 0.055d) / 1.055d, 2.4d);
            }
            dArr[0] = ((0.1805d * pow3) + (0.3576d * pow2) + (0.4124d * pow)) * 100.0d;
            double d12 = ((0.0722d * pow3) + (0.7152d * pow2) + (0.2126d * pow)) * 100.0d;
            dArr[1] = d12;
            dArr[2] = ((pow3 * 0.9505d) + (pow2 * 0.1192d) + (pow * 0.0193d)) * 100.0d;
            return d12 / 100.0d;
        }
        throw new IllegalArgumentException("outXyz must have a length of 3.");
    }

    public static int e(int i9, float f9, int i10) {
        int i11 = 255;
        if (Color.alpha(i10) == 255) {
            double d9 = f9;
            if (c(h(i9, 255), i10) < d9) {
                return -1;
            }
            int i12 = 0;
            for (int i13 = 0; i13 <= 10 && i11 - i12 > 1; i13++) {
                int i14 = (i12 + i11) / 2;
                if (c(h(i9, i14), i10) < d9) {
                    i12 = i14;
                } else {
                    i11 = i14;
                }
            }
            return i11;
        }
        throw new IllegalArgumentException("background can not be translucent: #" + Integer.toHexString(i10));
    }

    public static int f(int i9, int i10) {
        int alpha = Color.alpha(i10);
        int alpha2 = Color.alpha(i9);
        int i11 = 255 - (((255 - alpha2) * (255 - alpha)) / 255);
        return Color.argb(i11, g(Color.red(i9), alpha2, Color.red(i10), alpha, i11), g(Color.green(i9), alpha2, Color.green(i10), alpha, i11), g(Color.blue(i9), alpha2, Color.blue(i10), alpha, i11));
    }

    public static int g(int i9, int i10, int i11, int i12, int i13) {
        if (i13 == 0) {
            return 0;
        }
        return (((255 - i10) * (i11 * i12)) + ((i9 * 255) * i10)) / (i13 * 255);
    }

    public static int h(int i9, int i10) {
        if (i10 >= 0 && i10 <= 255) {
            return (i9 & 16777215) | (i10 << 24);
        }
        throw new IllegalArgumentException("alpha must be between 0 and 255.");
    }
}
