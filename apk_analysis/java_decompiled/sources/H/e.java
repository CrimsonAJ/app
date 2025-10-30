package H;

import B6.u0;
import android.graphics.Path;
import android.util.Log;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public char f2919a;

    /* renamed from: b, reason: collision with root package name */
    public final float[] f2920b;

    public e(char c3, float[] fArr) {
        this.f2919a = c3;
        this.f2920b = fArr;
    }

    public static void a(Path path, float f9, float f10, float f11, float f12, float f13, float f14, float f15, boolean z9, boolean z10) {
        double d9;
        double d10;
        boolean z11;
        double radians = Math.toRadians(f15);
        double cos = Math.cos(radians);
        double sin = Math.sin(radians);
        double d11 = f9;
        double d12 = f10;
        double d13 = f13;
        double d14 = ((d12 * sin) + (d11 * cos)) / d13;
        double d15 = f14;
        double d16 = ((d12 * cos) + ((-f9) * sin)) / d15;
        double d17 = f12;
        double d18 = ((d17 * sin) + (f11 * cos)) / d13;
        double d19 = ((d17 * cos) + ((-f11) * sin)) / d15;
        double d20 = d14 - d18;
        double d21 = d16 - d19;
        double d22 = (d14 + d18) / 2.0d;
        double d23 = (d16 + d19) / 2.0d;
        double d24 = (d21 * d21) + (d20 * d20);
        if (d24 == 0.0d) {
            Log.w("PathParser", " Points are coincident");
            return;
        }
        double d25 = (1.0d / d24) - 0.25d;
        if (d25 < 0.0d) {
            Log.w("PathParser", "Points are too far apart " + d24);
            float sqrt = (float) (Math.sqrt(d24) / 1.99999d);
            a(path, f9, f10, f11, f12, f13 * sqrt, sqrt * f14, f15, z9, z10);
            return;
        }
        double sqrt2 = Math.sqrt(d25);
        double d26 = sqrt2 * d20;
        double d27 = sqrt2 * d21;
        if (z9 == z10) {
            d9 = d22 - d27;
            d10 = d23 + d26;
        } else {
            d9 = d22 + d27;
            d10 = d23 - d26;
        }
        double atan2 = Math.atan2(d16 - d10, d14 - d9);
        double atan22 = Math.atan2(d19 - d10, d18 - d9) - atan2;
        if (atan22 >= 0.0d) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z10 != z11) {
            if (atan22 > 0.0d) {
                atan22 -= 6.283185307179586d;
            } else {
                atan22 += 6.283185307179586d;
            }
        }
        double d28 = d9 * d13;
        double d29 = d10 * d15;
        double d30 = (d28 * cos) - (d29 * sin);
        double d31 = (d29 * cos) + (d28 * sin);
        int ceil = (int) Math.ceil(Math.abs((atan22 * 4.0d) / 3.141592653589793d));
        double cos2 = Math.cos(radians);
        double sin2 = Math.sin(radians);
        double cos3 = Math.cos(atan2);
        double sin3 = Math.sin(atan2);
        double d32 = -d13;
        double d33 = d32 * cos2;
        double d34 = d15 * sin2;
        double d35 = (d33 * sin3) - (d34 * cos3);
        double d36 = d32 * sin2;
        double d37 = d15 * cos2;
        double d38 = atan22 / ceil;
        double d39 = (cos3 * d37) + (sin3 * d36);
        double d40 = d11;
        double d41 = d12;
        int i9 = 0;
        double d42 = atan2;
        while (i9 < ceil) {
            double d43 = d42 + d38;
            double sin4 = Math.sin(d43);
            double cos4 = Math.cos(d43);
            int i10 = ceil;
            double d44 = (((d13 * cos2) * cos4) + d30) - (d34 * sin4);
            double d45 = (d37 * sin4) + (d13 * sin2 * cos4) + d31;
            double d46 = (d33 * sin4) - (d34 * cos4);
            double d47 = (cos4 * d37) + (sin4 * d36);
            double d48 = d43 - d42;
            double tan = Math.tan(d48 / 2.0d);
            double sqrt3 = ((Math.sqrt(((tan * 3.0d) * tan) + 4.0d) - 1.0d) * Math.sin(d48)) / 3.0d;
            double d49 = (d39 * sqrt3) + d41;
            path.rLineTo(0.0f, 0.0f);
            path.cubicTo((float) ((d35 * sqrt3) + d40), (float) d49, (float) (d44 - (sqrt3 * d46)), (float) (d45 - (sqrt3 * d47)), (float) d44, (float) d45);
            i9++;
            d41 = d45;
            cos2 = cos2;
            d36 = d36;
            d42 = d43;
            d39 = d47;
            d40 = d44;
            ceil = i10;
            d35 = d46;
            d38 = d38;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void b(e[] eVarArr, Path path) {
        int i9;
        int i10;
        e eVar;
        int i11;
        char c3;
        boolean z9;
        boolean z10;
        float f9;
        float f10;
        float f11;
        float f12;
        e eVar2;
        boolean z11;
        boolean z12;
        float f13;
        float f14;
        float f15;
        float f16;
        float f17;
        float f18;
        float f19;
        float f20;
        Path path2 = path;
        float[] fArr = new float[6];
        int length = eVarArr.length;
        char c9 = 'm';
        int i12 = 0;
        char c10 = 'm';
        int i13 = 0;
        while (i13 < length) {
            e eVar3 = eVarArr[i13];
            char c11 = eVar3.f2919a;
            float f21 = fArr[i12];
            float f22 = fArr[1];
            float f23 = fArr[2];
            float f24 = fArr[3];
            float f25 = fArr[4];
            float f26 = fArr[5];
            switch (c11) {
                case 'A':
                case 'a':
                    i9 = 7;
                    break;
                case 'C':
                case 'c':
                    i9 = 6;
                    break;
                case 'H':
                case 'V':
                case 'h':
                case 'v':
                    i9 = 1;
                    break;
                case 'Q':
                case 'S':
                case 'q':
                case 's':
                    i9 = 4;
                    break;
                case 'Z':
                case 'z':
                    path2.close();
                    path2.moveTo(f25, f26);
                    f21 = f25;
                    f23 = f21;
                    f22 = f26;
                    f24 = f22;
                    break;
            }
            i9 = 2;
            float f27 = f22;
            float f28 = f25;
            float f29 = f26;
            float f30 = f21;
            int i14 = i12;
            while (true) {
                float[] fArr2 = eVar3.f2920b;
                if (i14 < fArr2.length) {
                    int i15 = i12;
                    if (c11 != 'A') {
                        if (c11 != 'C') {
                            if (c11 != 'H') {
                                if (c11 != 'Q') {
                                    if (c11 != 'V') {
                                        if (c11 != 'a') {
                                            if (c11 != 'c') {
                                                if (c11 != 'h') {
                                                    if (c11 != 'q') {
                                                        if (c11 != 'v') {
                                                            if (c11 != 'L') {
                                                                if (c11 != 'M') {
                                                                    if (c11 != 'S') {
                                                                        if (c11 != 'T') {
                                                                            if (c11 != 'l') {
                                                                                if (c11 != c9) {
                                                                                    if (c11 != 's') {
                                                                                        if (c11 != 't') {
                                                                                            i10 = i14;
                                                                                        } else {
                                                                                            if (c10 != 'q' && c10 != 't' && c10 != 'Q' && c10 != 'T') {
                                                                                                f20 = 0.0f;
                                                                                                f19 = 0.0f;
                                                                                            } else {
                                                                                                f19 = f30 - f23;
                                                                                                f20 = f27 - f24;
                                                                                            }
                                                                                            int i16 = i14 + 1;
                                                                                            path2.rQuadTo(f19, f20, fArr2[i14], fArr2[i16]);
                                                                                            float f31 = f19 + f30;
                                                                                            float f32 = f27 + f20;
                                                                                            float f33 = f30 + fArr2[i14];
                                                                                            f27 += fArr2[i16];
                                                                                            f24 = f32;
                                                                                            i10 = i14;
                                                                                            eVar = eVar3;
                                                                                            f10 = f33;
                                                                                            f23 = f31;
                                                                                            f9 = f27;
                                                                                            i11 = i13;
                                                                                            c3 = c11;
                                                                                        }
                                                                                    } else {
                                                                                        if (c10 != 'c' && c10 != 's' && c10 != 'C' && c10 != 'S') {
                                                                                            f18 = 0.0f;
                                                                                            f17 = 0.0f;
                                                                                        } else {
                                                                                            f17 = f27 - f24;
                                                                                            f18 = f30 - f23;
                                                                                        }
                                                                                        int i17 = i14 + 1;
                                                                                        int i18 = i14 + 2;
                                                                                        int i19 = i14 + 3;
                                                                                        i10 = i14;
                                                                                        path2.rCubicTo(f18, f17, fArr2[i14], fArr2[i17], fArr2[i18], fArr2[i19]);
                                                                                        f13 = fArr2[i10] + f30;
                                                                                        f14 = f27 + fArr2[i17];
                                                                                        f30 += fArr2[i18];
                                                                                        f15 = fArr2[i19];
                                                                                    }
                                                                                } else {
                                                                                    i10 = i14;
                                                                                    float f34 = fArr2[i10];
                                                                                    f30 += f34;
                                                                                    float f35 = fArr2[i10 + 1];
                                                                                    f27 += f35;
                                                                                    if (i10 > 0) {
                                                                                        path2.rLineTo(f34, f35);
                                                                                    } else {
                                                                                        path2.rMoveTo(f34, f35);
                                                                                        eVar = eVar3;
                                                                                        f10 = f30;
                                                                                        f28 = f10;
                                                                                        f9 = f27;
                                                                                        f29 = f9;
                                                                                        i11 = i13;
                                                                                        c3 = c11;
                                                                                    }
                                                                                }
                                                                            } else {
                                                                                i10 = i14;
                                                                                int i20 = i10 + 1;
                                                                                path2.rLineTo(fArr2[i10], fArr2[i20]);
                                                                                f30 += fArr2[i10];
                                                                                f16 = fArr2[i20];
                                                                            }
                                                                        } else {
                                                                            i10 = i14;
                                                                            if (c10 == 'q' || c10 == 't' || c10 == 'Q' || c10 == 'T') {
                                                                                f30 = (f30 * 2.0f) - f23;
                                                                                f27 = (f27 * 2.0f) - f24;
                                                                            }
                                                                            float f36 = f27;
                                                                            float f37 = fArr2[i10];
                                                                            int i21 = i10 + 1;
                                                                            path2.quadTo(f30, f36, f37, fArr2[i21]);
                                                                            f24 = f36;
                                                                            f10 = fArr2[i10];
                                                                            f9 = fArr2[i21];
                                                                            i11 = i13;
                                                                            eVar = eVar3;
                                                                            f23 = f30;
                                                                            c3 = c11;
                                                                        }
                                                                    } else {
                                                                        i10 = i14;
                                                                        if (c10 == 'c' || c10 == 's' || c10 == 'C' || c10 == 'S') {
                                                                            f30 = (f30 * 2.0f) - f23;
                                                                            f27 = (f27 * 2.0f) - f24;
                                                                        }
                                                                        float f38 = f30;
                                                                        float f39 = f27;
                                                                        int i22 = i10 + 1;
                                                                        int i23 = i10 + 2;
                                                                        int i24 = i10 + 3;
                                                                        path2.cubicTo(f38, f39, fArr2[i10], fArr2[i22], fArr2[i23], fArr2[i24]);
                                                                        f11 = fArr2[i10];
                                                                        float f40 = fArr2[i22];
                                                                        f12 = fArr2[i23];
                                                                        f24 = f40;
                                                                        f9 = fArr2[i24];
                                                                        i11 = i13;
                                                                        eVar = eVar3;
                                                                        c3 = c11;
                                                                    }
                                                                } else {
                                                                    i10 = i14;
                                                                    f10 = fArr2[i10];
                                                                    f9 = fArr2[i10 + 1];
                                                                    if (i10 > 0) {
                                                                        path2.lineTo(f10, f9);
                                                                    } else {
                                                                        path2.moveTo(f10, f9);
                                                                        f28 = f10;
                                                                        f29 = f9;
                                                                    }
                                                                }
                                                            } else {
                                                                i10 = i14;
                                                                int i25 = i10 + 1;
                                                                path2.lineTo(fArr2[i10], fArr2[i25]);
                                                                f10 = fArr2[i10];
                                                                f9 = fArr2[i25];
                                                            }
                                                            i11 = i13;
                                                            eVar = eVar3;
                                                            c3 = c11;
                                                        } else {
                                                            i10 = i14;
                                                            path2.rLineTo(0.0f, fArr2[i10]);
                                                            f16 = fArr2[i10];
                                                        }
                                                        f27 += f16;
                                                    } else {
                                                        i10 = i14;
                                                        int i26 = i10 + 1;
                                                        int i27 = i10 + 2;
                                                        int i28 = i10 + 3;
                                                        path2.rQuadTo(fArr2[i10], fArr2[i26], fArr2[i27], fArr2[i28]);
                                                        f13 = fArr2[i10] + f30;
                                                        f14 = f27 + fArr2[i26];
                                                        f30 += fArr2[i27];
                                                        f15 = fArr2[i28];
                                                    }
                                                    f27 += f15;
                                                    f23 = f13;
                                                    f24 = f14;
                                                } else {
                                                    i10 = i14;
                                                    path2.rLineTo(fArr2[i10], 0.0f);
                                                    f30 += fArr2[i10];
                                                }
                                            } else {
                                                i10 = i14;
                                                int i29 = i10 + 2;
                                                int i30 = i10 + 3;
                                                int i31 = i10 + 4;
                                                int i32 = i10 + 5;
                                                path2.rCubicTo(fArr2[i10], fArr2[i10 + 1], fArr2[i29], fArr2[i30], fArr2[i31], fArr2[i32]);
                                                float f41 = fArr2[i29] + f30;
                                                float f42 = f27 + fArr2[i30];
                                                f30 += fArr2[i31];
                                                f27 += fArr2[i32];
                                                f23 = f41;
                                                f24 = f42;
                                            }
                                            eVar = eVar3;
                                            f10 = f30;
                                            f9 = f27;
                                            i11 = i13;
                                            c3 = c11;
                                        } else {
                                            i10 = i14;
                                            int i33 = i10 + 5;
                                            float f43 = fArr2[i33] + f30;
                                            int i34 = i10 + 6;
                                            float f44 = fArr2[i34] + f27;
                                            float f45 = fArr2[i10];
                                            float f46 = fArr2[i10 + 1];
                                            float f47 = fArr2[i10 + 2];
                                            if (fArr2[i10 + 3] != 0.0f) {
                                                eVar2 = eVar3;
                                                z11 = 1;
                                            } else {
                                                eVar2 = eVar3;
                                                z11 = i15;
                                            }
                                            eVar = eVar2;
                                            float f48 = f30;
                                            c3 = c11;
                                            if (fArr2[i10 + 4] != 0.0f) {
                                                z12 = 1;
                                            } else {
                                                z12 = i15;
                                            }
                                            float f49 = f27;
                                            i11 = i13;
                                            a(path, f48, f49, f43, f44, f45, f46, f47, z11, z12);
                                            f10 = f48 + fArr2[i33];
                                            f9 = f49 + fArr2[i34];
                                            f23 = f10;
                                            f24 = f9;
                                        }
                                    } else {
                                        i10 = i14;
                                        i11 = i13;
                                        eVar = eVar3;
                                        f10 = f30;
                                        c3 = c11;
                                        path2.lineTo(f10, fArr2[i10]);
                                        f9 = fArr2[i10];
                                    }
                                } else {
                                    i10 = i14;
                                    i11 = i13;
                                    eVar = eVar3;
                                    c3 = c11;
                                    int i35 = i10 + 1;
                                    int i36 = i10 + 2;
                                    int i37 = i10 + 3;
                                    path2.quadTo(fArr2[i10], fArr2[i35], fArr2[i36], fArr2[i37]);
                                    f11 = fArr2[i10];
                                    float f50 = fArr2[i35];
                                    f12 = fArr2[i36];
                                    f24 = f50;
                                    f9 = fArr2[i37];
                                }
                                f23 = f11;
                                f10 = f12;
                            } else {
                                i10 = i14;
                                eVar = eVar3;
                                c3 = c11;
                                f9 = f27;
                                i11 = i13;
                                path2.lineTo(fArr2[i10], f9);
                                f10 = fArr2[i10];
                            }
                        } else {
                            i10 = i14;
                            i11 = i13;
                            eVar = eVar3;
                            c3 = c11;
                            int i38 = i10 + 2;
                            int i39 = i10 + 3;
                            int i40 = i10 + 4;
                            int i41 = i10 + 5;
                            path2.cubicTo(fArr2[i10], fArr2[i10 + 1], fArr2[i38], fArr2[i39], fArr2[i40], fArr2[i41]);
                            float f51 = fArr2[i40];
                            float f52 = fArr2[i41];
                            f23 = fArr2[i38];
                            f24 = fArr2[i39];
                            f9 = f52;
                            f10 = f51;
                        }
                    } else {
                        i10 = i14;
                        eVar = eVar3;
                        float f53 = f30;
                        float f54 = f27;
                        i11 = i13;
                        c3 = c11;
                        int i42 = i10 + 5;
                        float f55 = fArr2[i42];
                        int i43 = i10 + 6;
                        float f56 = fArr2[i43];
                        float f57 = fArr2[i10];
                        float f58 = fArr2[i10 + 1];
                        float f59 = fArr2[i10 + 2];
                        if (fArr2[i10 + 3] != 0.0f) {
                            z9 = 1;
                        } else {
                            z9 = i15;
                        }
                        if (fArr2[i10 + 4] != 0.0f) {
                            z10 = 1;
                        } else {
                            z10 = i15;
                        }
                        a(path, f53, f54, f55, f56, f57, f58, f59, z9, z10);
                        f23 = fArr2[i42];
                        f9 = fArr2[i43];
                        f24 = f9;
                        f10 = f23;
                    }
                    c11 = c3;
                    eVar3 = eVar;
                    i13 = i11;
                    i12 = i15;
                    c9 = 'm';
                    f30 = f10;
                    f27 = f9;
                    c10 = c11;
                    i14 = i10 + i9;
                    path2 = path;
                }
            }
            int i44 = i12;
            fArr[i44] = f30;
            fArr[1] = f27;
            fArr[2] = f23;
            fArr[3] = f24;
            fArr[4] = f28;
            fArr[5] = f29;
            c10 = eVar3.f2919a;
            i13++;
            path2 = path;
            i12 = i44;
            c9 = 'm';
        }
    }

    public e(e eVar) {
        this.f2919a = eVar.f2919a;
        float[] fArr = eVar.f2920b;
        this.f2920b = u0.q(fArr, fArr.length);
    }
}
