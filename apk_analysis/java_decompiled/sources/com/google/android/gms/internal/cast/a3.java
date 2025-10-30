package com.google.android.gms.internal.cast;

import co.notix.R;
import com.google.android.gms.internal.measurement.AbstractC0953k1;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.List;
import sun.misc.Unsafe;

/* loaded from: classes.dex */
public final class a3 implements g3 {

    /* renamed from: g, reason: collision with root package name */
    public static final int[] f14805g = new int[0];

    /* renamed from: h, reason: collision with root package name */
    public static final Unsafe f14806h = o3.h();

    /* renamed from: a, reason: collision with root package name */
    public final int[] f14807a;

    /* renamed from: b, reason: collision with root package name */
    public final Object[] f14808b;

    /* renamed from: c, reason: collision with root package name */
    public final E2 f14809c;

    /* renamed from: d, reason: collision with root package name */
    public final int[] f14810d;

    /* renamed from: e, reason: collision with root package name */
    public final int f14811e;

    /* renamed from: f, reason: collision with root package name */
    public final C0886w0 f14812f;

    public a3(int[] iArr, Object[] objArr, E2 e22, int[] iArr2, int i9, C0886w0 c0886w0, C0886w0 c0886w02) {
        this.f14807a = iArr;
        this.f14808b = objArr;
        this.f14810d = iArr2;
        this.f14811e = i9;
        this.f14812f = c0886w0;
        this.f14809c = e22;
    }

    public static boolean h(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof N2) {
            return ((N2) obj).g();
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x0323  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0380  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0239  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0253  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0256  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x023c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.google.android.gms.internal.cast.a3 j(com.google.android.gms.internal.cast.f3 r30, com.google.android.gms.internal.cast.C0886w0 r31, com.google.android.gms.internal.cast.C0886w0 r32) {
        /*
            Method dump skipped, instructions count: 993
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.cast.a3.j(com.google.android.gms.internal.cast.f3, com.google.android.gms.internal.cast.w0, com.google.android.gms.internal.cast.w0):com.google.android.gms.internal.cast.a3");
    }

    public static int k(long j, Object obj) {
        return ((Integer) o3.g(j, obj)).intValue();
    }

    public static int m(int i9) {
        return (i9 >>> 20) & 255;
    }

    public static long o(long j, Object obj) {
        return ((Long) o3.g(j, obj)).longValue();
    }

    public static Field q(Class cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (NoSuchFieldException e8) {
            Field[] declaredFields = cls.getDeclaredFields();
            for (Field field : declaredFields) {
                if (str.equals(field.getName())) {
                    return field;
                }
            }
            throw new RuntimeException("Field " + str + " for " + cls.getName() + " not found. Known fields are " + Arrays.toString(declaredFields), e8);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:14:0x003f. Please report as an issue. */
    @Override // com.google.android.gms.internal.cast.g3
    public final void a(Object obj, W2 w22) {
        int i9;
        boolean z9;
        a3 a3Var = this;
        Unsafe unsafe = f14806h;
        int i10 = 1048575;
        int i11 = 1048575;
        int i12 = 0;
        int i13 = 0;
        while (true) {
            int[] iArr = a3Var.f14807a;
            if (i12 < iArr.length) {
                int n7 = a3Var.n(i12);
                int m9 = m(n7);
                int i14 = iArr[i12];
                if (m9 <= 17) {
                    int i15 = iArr[i12 + 2];
                    int i16 = i15 & i10;
                    if (i16 != i11) {
                        if (i16 == i10) {
                            i13 = 0;
                        } else {
                            i13 = unsafe.getInt(obj, i16);
                        }
                        i11 = i16;
                    }
                    i9 = 1 << (i15 >>> 20);
                } else {
                    i9 = 0;
                }
                long j = n7 & i10;
                switch (m9) {
                    case 0:
                        if (a3Var.w(obj, i12, i11, i13, i9)) {
                            ((J2) w22.f14788b).y(Double.doubleToRawLongBits(o3.f14937c.a(j, obj)), i14);
                        }
                        i12 += 3;
                        i10 = 1048575;
                        a3Var = this;
                    case 1:
                        if (a3Var.w(obj, i12, i11, i13, i9)) {
                            ((J2) w22.f14788b).w(i14, Float.floatToRawIntBits(o3.f14937c.b(j, obj)));
                        }
                        i12 += 3;
                        i10 = 1048575;
                        a3Var = this;
                    case 2:
                        if (a3Var.w(obj, i12, i11, i13, i9)) {
                            ((J2) w22.f14788b).G(unsafe.getLong(obj, j), i14);
                        }
                        i12 += 3;
                        i10 = 1048575;
                        a3Var = this;
                    case 3:
                        if (a3Var.w(obj, i12, i11, i13, i9)) {
                            ((J2) w22.f14788b).G(unsafe.getLong(obj, j), i14);
                        }
                        i12 += 3;
                        i10 = 1048575;
                        a3Var = this;
                    case 4:
                        if (a3Var.w(obj, i12, i11, i13, i9)) {
                            ((J2) w22.f14788b).A(i14, unsafe.getInt(obj, j));
                        }
                        i12 += 3;
                        i10 = 1048575;
                        a3Var = this;
                    case 5:
                        if (a3Var.w(obj, i12, i11, i13, i9)) {
                            ((J2) w22.f14788b).y(unsafe.getLong(obj, j), i14);
                        }
                        i12 += 3;
                        i10 = 1048575;
                        a3Var = this;
                    case 6:
                        if (a3Var.w(obj, i12, i11, i13, i9)) {
                            ((J2) w22.f14788b).w(i14, unsafe.getInt(obj, j));
                        }
                        i12 += 3;
                        i10 = 1048575;
                        a3Var = this;
                    case 7:
                        if (a3Var.w(obj, i12, i11, i13, i9)) {
                            byte g9 = o3.f14937c.g(j, obj);
                            J2 j22 = (J2) w22.f14788b;
                            j22.F(i14 << 3);
                            int i17 = j22.f14737g;
                            try {
                                int i18 = i17 + 1;
                                try {
                                    j22.f14735e[i17] = g9;
                                    j22.f14737g = i18;
                                } catch (IndexOutOfBoundsException e8) {
                                    e = e8;
                                    i17 = i18;
                                    throw new N3.M(i17, j22.f14736f, 1, e, 7);
                                }
                            } catch (IndexOutOfBoundsException e9) {
                                e = e9;
                            }
                        } else {
                            continue;
                        }
                        i12 += 3;
                        i10 = 1048575;
                        a3Var = this;
                    case 8:
                        if (a3Var.w(obj, i12, i11, i13, i9)) {
                            Object object = unsafe.getObject(obj, j);
                            if (object instanceof String) {
                                ((J2) w22.f14788b).C(i14, (String) object);
                            } else {
                                ((J2) w22.f14788b).v(i14, (I2) object);
                            }
                        }
                        i12 += 3;
                        i10 = 1048575;
                        a3Var = this;
                    case 9:
                        if (a3Var.w(obj, i12, i11, i13, i9)) {
                            w22.m(i14, unsafe.getObject(obj, j), a3Var.p(i12));
                        }
                        i12 += 3;
                        i10 = 1048575;
                        a3Var = this;
                    case R.styleable.GradientColor_android_endX /* 10 */:
                        if (a3Var.w(obj, i12, i11, i13, i9)) {
                            ((J2) w22.f14788b).v(i14, (I2) unsafe.getObject(obj, j));
                        }
                        i12 += 3;
                        i10 = 1048575;
                        a3Var = this;
                    case R.styleable.GradientColor_android_endY /* 11 */:
                        if (a3Var.w(obj, i12, i11, i13, i9)) {
                            ((J2) w22.f14788b).E(i14, unsafe.getInt(obj, j));
                        }
                        i12 += 3;
                        i10 = 1048575;
                        a3Var = this;
                    case 12:
                        if (a3Var.w(obj, i12, i11, i13, i9)) {
                            ((J2) w22.f14788b).A(i14, unsafe.getInt(obj, j));
                        }
                        i12 += 3;
                        i10 = 1048575;
                        a3Var = this;
                    case 13:
                        if (a3Var.w(obj, i12, i11, i13, i9)) {
                            ((J2) w22.f14788b).w(i14, unsafe.getInt(obj, j));
                        }
                        i12 += 3;
                        i10 = 1048575;
                        a3Var = this;
                    case 14:
                        if (a3Var.w(obj, i12, i11, i13, i9)) {
                            ((J2) w22.f14788b).y(unsafe.getLong(obj, j), i14);
                        }
                        i12 += 3;
                        i10 = 1048575;
                        a3Var = this;
                    case 15:
                        if (a3Var.w(obj, i12, i11, i13, i9)) {
                            int i19 = unsafe.getInt(obj, j);
                            ((J2) w22.f14788b).E(i14, (i19 >> 31) ^ (i19 + i19));
                        }
                        i12 += 3;
                        i10 = 1048575;
                        a3Var = this;
                    case 16:
                        if (a3Var.w(obj, i12, i11, i13, i9)) {
                            long j4 = unsafe.getLong(obj, j);
                            ((J2) w22.f14788b).G((j4 + j4) ^ (j4 >> 63), i14);
                        }
                        i12 += 3;
                        i10 = 1048575;
                        a3Var = this;
                    case 17:
                        if (a3Var.w(obj, i12, i11, i13, i9)) {
                            w22.l(i14, unsafe.getObject(obj, j), a3Var.p(i12));
                        }
                        i12 += 3;
                        i10 = 1048575;
                        a3Var = this;
                    case 18:
                        h3.p(iArr[i12], (List) unsafe.getObject(obj, j), w22, false);
                        i12 += 3;
                        i10 = 1048575;
                        a3Var = this;
                    case 19:
                        h3.t(iArr[i12], (List) unsafe.getObject(obj, j), w22, false);
                        i12 += 3;
                        i10 = 1048575;
                        a3Var = this;
                    case 20:
                        h3.v(iArr[i12], (List) unsafe.getObject(obj, j), w22, false);
                        i12 += 3;
                        i10 = 1048575;
                        a3Var = this;
                    case 21:
                        h3.c(iArr[i12], (List) unsafe.getObject(obj, j), w22, false);
                        i12 += 3;
                        i10 = 1048575;
                        a3Var = this;
                    case 22:
                        h3.u(iArr[i12], (List) unsafe.getObject(obj, j), w22, false);
                        i12 += 3;
                        i10 = 1048575;
                        a3Var = this;
                    case 23:
                        h3.s(iArr[i12], (List) unsafe.getObject(obj, j), w22, false);
                        i12 += 3;
                        i10 = 1048575;
                        a3Var = this;
                    case 24:
                        h3.r(iArr[i12], (List) unsafe.getObject(obj, j), w22, false);
                        i12 += 3;
                        i10 = 1048575;
                        a3Var = this;
                    case 25:
                        h3.o(iArr[i12], (List) unsafe.getObject(obj, j), w22, false);
                        i12 += 3;
                        i10 = 1048575;
                        a3Var = this;
                    case 26:
                        int i20 = iArr[i12];
                        List list = (List) unsafe.getObject(obj, j);
                        C0886w0 c0886w0 = h3.f14855a;
                        if (list != null && !list.isEmpty()) {
                            w22.getClass();
                            for (int i21 = 0; i21 < list.size(); i21++) {
                                ((J2) w22.f14788b).C(i20, (String) list.get(i21));
                            }
                        }
                        i12 += 3;
                        i10 = 1048575;
                        a3Var = this;
                        break;
                    case 27:
                        int i22 = iArr[i12];
                        List list2 = (List) unsafe.getObject(obj, j);
                        g3 p9 = a3Var.p(i12);
                        C0886w0 c0886w02 = h3.f14855a;
                        if (list2 != null && !list2.isEmpty()) {
                            for (int i23 = 0; i23 < list2.size(); i23++) {
                                w22.m(i22, list2.get(i23), p9);
                            }
                        }
                        i12 += 3;
                        i10 = 1048575;
                        a3Var = this;
                        break;
                    case 28:
                        int i24 = iArr[i12];
                        List list3 = (List) unsafe.getObject(obj, j);
                        C0886w0 c0886w03 = h3.f14855a;
                        if (list3 != null && !list3.isEmpty()) {
                            w22.getClass();
                            for (int i25 = 0; i25 < list3.size(); i25++) {
                                ((J2) w22.f14788b).v(i24, (I2) list3.get(i25));
                            }
                        }
                        i12 += 3;
                        i10 = 1048575;
                        a3Var = this;
                        break;
                    case 29:
                        z9 = false;
                        h3.b(iArr[i12], (List) unsafe.getObject(obj, j), w22, false);
                        i12 += 3;
                        i10 = 1048575;
                        a3Var = this;
                    case 30:
                        z9 = false;
                        h3.q(iArr[i12], (List) unsafe.getObject(obj, j), w22, false);
                        i12 += 3;
                        i10 = 1048575;
                        a3Var = this;
                    case 31:
                        z9 = false;
                        h3.w(iArr[i12], (List) unsafe.getObject(obj, j), w22, false);
                        i12 += 3;
                        i10 = 1048575;
                        a3Var = this;
                    case 32:
                        z9 = false;
                        h3.x(iArr[i12], (List) unsafe.getObject(obj, j), w22, false);
                        i12 += 3;
                        i10 = 1048575;
                        a3Var = this;
                    case 33:
                        z9 = false;
                        h3.y(iArr[i12], (List) unsafe.getObject(obj, j), w22, false);
                        i12 += 3;
                        i10 = 1048575;
                        a3Var = this;
                    case 34:
                        z9 = false;
                        h3.a(iArr[i12], (List) unsafe.getObject(obj, j), w22, false);
                        i12 += 3;
                        i10 = 1048575;
                        a3Var = this;
                    case 35:
                        h3.p(iArr[i12], (List) unsafe.getObject(obj, j), w22, true);
                        i12 += 3;
                        i10 = 1048575;
                        a3Var = this;
                    case 36:
                        h3.t(iArr[i12], (List) unsafe.getObject(obj, j), w22, true);
                        i12 += 3;
                        i10 = 1048575;
                        a3Var = this;
                    case 37:
                        h3.v(iArr[i12], (List) unsafe.getObject(obj, j), w22, true);
                        i12 += 3;
                        i10 = 1048575;
                        a3Var = this;
                    case 38:
                        h3.c(iArr[i12], (List) unsafe.getObject(obj, j), w22, true);
                        i12 += 3;
                        i10 = 1048575;
                        a3Var = this;
                    case 39:
                        h3.u(iArr[i12], (List) unsafe.getObject(obj, j), w22, true);
                        i12 += 3;
                        i10 = 1048575;
                        a3Var = this;
                    case 40:
                        h3.s(iArr[i12], (List) unsafe.getObject(obj, j), w22, true);
                        i12 += 3;
                        i10 = 1048575;
                        a3Var = this;
                    case 41:
                        h3.r(iArr[i12], (List) unsafe.getObject(obj, j), w22, true);
                        i12 += 3;
                        i10 = 1048575;
                        a3Var = this;
                    case 42:
                        h3.o(iArr[i12], (List) unsafe.getObject(obj, j), w22, true);
                        i12 += 3;
                        i10 = 1048575;
                        a3Var = this;
                    case 43:
                        h3.b(iArr[i12], (List) unsafe.getObject(obj, j), w22, true);
                        i12 += 3;
                        i10 = 1048575;
                        a3Var = this;
                    case 44:
                        h3.q(iArr[i12], (List) unsafe.getObject(obj, j), w22, true);
                        i12 += 3;
                        i10 = 1048575;
                        a3Var = this;
                    case 45:
                        h3.w(iArr[i12], (List) unsafe.getObject(obj, j), w22, true);
                        i12 += 3;
                        i10 = 1048575;
                        a3Var = this;
                    case 46:
                        h3.x(iArr[i12], (List) unsafe.getObject(obj, j), w22, true);
                        i12 += 3;
                        i10 = 1048575;
                        a3Var = this;
                    case 47:
                        h3.y(iArr[i12], (List) unsafe.getObject(obj, j), w22, true);
                        i12 += 3;
                        i10 = 1048575;
                        a3Var = this;
                    case 48:
                        h3.a(iArr[i12], (List) unsafe.getObject(obj, j), w22, true);
                        i12 += 3;
                        i10 = 1048575;
                        a3Var = this;
                    case 49:
                        int i26 = iArr[i12];
                        List list4 = (List) unsafe.getObject(obj, j);
                        g3 p10 = a3Var.p(i12);
                        C0886w0 c0886w04 = h3.f14855a;
                        if (list4 != null && !list4.isEmpty()) {
                            for (int i27 = 0; i27 < list4.size(); i27++) {
                                w22.l(i26, list4.get(i27), p10);
                            }
                        }
                        i12 += 3;
                        i10 = 1048575;
                        a3Var = this;
                        break;
                    case 50:
                        if (unsafe.getObject(obj, j) != null) {
                            int i28 = i12 / 3;
                            throw AbstractC0953k1.i(a3Var.f14808b[i28 + i28]);
                        }
                        i12 += 3;
                        i10 = 1048575;
                        a3Var = this;
                    case 51:
                        if (a3Var.i(i14, i12, obj)) {
                            ((J2) w22.f14788b).y(Double.doubleToRawLongBits(((Double) o3.g(j, obj)).doubleValue()), i14);
                        }
                        i12 += 3;
                        i10 = 1048575;
                        a3Var = this;
                    case 52:
                        if (a3Var.i(i14, i12, obj)) {
                            ((J2) w22.f14788b).w(i14, Float.floatToRawIntBits(((Float) o3.g(j, obj)).floatValue()));
                        }
                        i12 += 3;
                        i10 = 1048575;
                        a3Var = this;
                    case 53:
                        if (a3Var.i(i14, i12, obj)) {
                            ((J2) w22.f14788b).G(o(j, obj), i14);
                        }
                        i12 += 3;
                        i10 = 1048575;
                        a3Var = this;
                    case 54:
                        if (a3Var.i(i14, i12, obj)) {
                            ((J2) w22.f14788b).G(o(j, obj), i14);
                        }
                        i12 += 3;
                        i10 = 1048575;
                        a3Var = this;
                    case 55:
                        if (a3Var.i(i14, i12, obj)) {
                            ((J2) w22.f14788b).A(i14, k(j, obj));
                        }
                        i12 += 3;
                        i10 = 1048575;
                        a3Var = this;
                    case 56:
                        if (a3Var.i(i14, i12, obj)) {
                            ((J2) w22.f14788b).y(o(j, obj), i14);
                        }
                        i12 += 3;
                        i10 = 1048575;
                        a3Var = this;
                    case 57:
                        if (a3Var.i(i14, i12, obj)) {
                            ((J2) w22.f14788b).w(i14, k(j, obj));
                        }
                        i12 += 3;
                        i10 = 1048575;
                        a3Var = this;
                    case 58:
                        if (a3Var.i(i14, i12, obj)) {
                            byte booleanValue = ((Boolean) o3.g(j, obj)).booleanValue();
                            J2 j23 = (J2) w22.f14788b;
                            j23.F(i14 << 3);
                            int i29 = j23.f14737g;
                            try {
                                int i30 = i29 + 1;
                                try {
                                    j23.f14735e[i29] = booleanValue;
                                    j23.f14737g = i30;
                                } catch (IndexOutOfBoundsException e10) {
                                    e = e10;
                                    i29 = i30;
                                    throw new N3.M(i29, j23.f14736f, 1, e, 7);
                                }
                            } catch (IndexOutOfBoundsException e11) {
                                e = e11;
                            }
                        }
                        i12 += 3;
                        i10 = 1048575;
                        a3Var = this;
                    case 59:
                        if (a3Var.i(i14, i12, obj)) {
                            Object object2 = unsafe.getObject(obj, j);
                            if (object2 instanceof String) {
                                ((J2) w22.f14788b).C(i14, (String) object2);
                            } else {
                                ((J2) w22.f14788b).v(i14, (I2) object2);
                            }
                        }
                        i12 += 3;
                        i10 = 1048575;
                        a3Var = this;
                    case 60:
                        if (a3Var.i(i14, i12, obj)) {
                            w22.m(i14, unsafe.getObject(obj, j), a3Var.p(i12));
                        }
                        i12 += 3;
                        i10 = 1048575;
                        a3Var = this;
                    case 61:
                        if (a3Var.i(i14, i12, obj)) {
                            ((J2) w22.f14788b).v(i14, (I2) unsafe.getObject(obj, j));
                        }
                        i12 += 3;
                        i10 = 1048575;
                        a3Var = this;
                    case 62:
                        if (a3Var.i(i14, i12, obj)) {
                            ((J2) w22.f14788b).E(i14, k(j, obj));
                        }
                        i12 += 3;
                        i10 = 1048575;
                        a3Var = this;
                    case 63:
                        if (a3Var.i(i14, i12, obj)) {
                            ((J2) w22.f14788b).A(i14, k(j, obj));
                        }
                        i12 += 3;
                        i10 = 1048575;
                        a3Var = this;
                    case 64:
                        if (a3Var.i(i14, i12, obj)) {
                            ((J2) w22.f14788b).w(i14, k(j, obj));
                        }
                        i12 += 3;
                        i10 = 1048575;
                        a3Var = this;
                    case 65:
                        if (a3Var.i(i14, i12, obj)) {
                            ((J2) w22.f14788b).y(o(j, obj), i14);
                        }
                        i12 += 3;
                        i10 = 1048575;
                        a3Var = this;
                    case 66:
                        if (a3Var.i(i14, i12, obj)) {
                            int k5 = k(j, obj);
                            ((J2) w22.f14788b).E(i14, (k5 >> 31) ^ (k5 + k5));
                        }
                        i12 += 3;
                        i10 = 1048575;
                        a3Var = this;
                    case 67:
                        if (a3Var.i(i14, i12, obj)) {
                            long o9 = o(j, obj);
                            ((J2) w22.f14788b).G((o9 + o9) ^ (o9 >> 63), i14);
                        }
                        i12 += 3;
                        i10 = 1048575;
                        a3Var = this;
                    case 68:
                        if (a3Var.i(i14, i12, obj)) {
                            w22.l(i14, unsafe.getObject(obj, j), a3Var.p(i12));
                        }
                        i12 += 3;
                        i10 = 1048575;
                        a3Var = this;
                    default:
                        i12 += 3;
                        i10 = 1048575;
                        a3Var = this;
                }
            } else {
                j3 j3Var = ((N2) obj).zzc;
                return;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x0082, code lost:
    
        continue;
     */
    @Override // com.google.android.gms.internal.cast.g3
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b(java.lang.Object r8) {
        /*
            r7 = this;
            boolean r0 = h(r8)
            if (r0 != 0) goto L8
            goto L94
        L8:
            boolean r0 = r8 instanceof com.google.android.gms.internal.cast.N2
            r1 = 0
            if (r0 == 0) goto L18
            r0 = r8
            com.google.android.gms.internal.cast.N2 r0 = (com.google.android.gms.internal.cast.N2) r0
            r0.f()
            r0.zza = r1
            r0.d()
        L18:
            r0 = r1
        L19:
            int[] r2 = r7.f14807a
            int r3 = r2.length
            if (r0 >= r3) goto L85
            int r3 = r7.n(r0)
            r4 = 1048575(0xfffff, float:1.469367E-39)
            r4 = r4 & r3
            int r3 = m(r3)
            long r4 = (long) r4
            r6 = 9
            if (r3 == r6) goto L6f
            r6 = 60
            if (r3 == r6) goto L59
            r6 = 68
            if (r3 == r6) goto L59
            switch(r3) {
                case 17: goto L6f;
                case 18: goto L4a;
                case 19: goto L4a;
                case 20: goto L4a;
                case 21: goto L4a;
                case 22: goto L4a;
                case 23: goto L4a;
                case 24: goto L4a;
                case 25: goto L4a;
                case 26: goto L4a;
                case 27: goto L4a;
                case 28: goto L4a;
                case 29: goto L4a;
                case 30: goto L4a;
                case 31: goto L4a;
                case 32: goto L4a;
                case 33: goto L4a;
                case 34: goto L4a;
                case 35: goto L4a;
                case 36: goto L4a;
                case 37: goto L4a;
                case 38: goto L4a;
                case 39: goto L4a;
                case 40: goto L4a;
                case 41: goto L4a;
                case 42: goto L4a;
                case 43: goto L4a;
                case 44: goto L4a;
                case 45: goto L4a;
                case 46: goto L4a;
                case 47: goto L4a;
                case 48: goto L4a;
                case 49: goto L4a;
                case 50: goto L3b;
                default: goto L3a;
            }
        L3a:
            goto L82
        L3b:
            sun.misc.Unsafe r2 = com.google.android.gms.internal.cast.a3.f14806h
            java.lang.Object r2 = r2.getObject(r8, r4)
            if (r2 != 0) goto L44
            goto L82
        L44:
            java.lang.ClassCastException r8 = new java.lang.ClassCastException
            r8.<init>()
            throw r8
        L4a:
            java.lang.Object r2 = com.google.android.gms.internal.cast.o3.g(r4, r8)
            com.google.android.gms.internal.cast.R2 r2 = (com.google.android.gms.internal.cast.R2) r2
            com.google.android.gms.internal.cast.F2 r2 = (com.google.android.gms.internal.cast.F2) r2
            boolean r3 = r2.f14714a
            if (r3 == 0) goto L82
            r2.f14714a = r1
            goto L82
        L59:
            r2 = r2[r0]
            boolean r2 = r7.i(r2, r0, r8)
            if (r2 == 0) goto L82
            com.google.android.gms.internal.cast.g3 r2 = r7.p(r0)
            sun.misc.Unsafe r3 = com.google.android.gms.internal.cast.a3.f14806h
            java.lang.Object r3 = r3.getObject(r8, r4)
            r2.b(r3)
            goto L82
        L6f:
            boolean r2 = r7.v(r0, r8)
            if (r2 == 0) goto L82
            com.google.android.gms.internal.cast.g3 r2 = r7.p(r0)
            sun.misc.Unsafe r3 = com.google.android.gms.internal.cast.a3.f14806h
            java.lang.Object r3 = r3.getObject(r8, r4)
            r2.b(r3)
        L82:
            int r0 = r0 + 3
            goto L19
        L85:
            com.google.android.gms.internal.cast.w0 r0 = r7.f14812f
            r0.getClass()
            com.google.android.gms.internal.cast.N2 r8 = (com.google.android.gms.internal.cast.N2) r8
            com.google.android.gms.internal.cast.j3 r8 = r8.zzc
            boolean r0 = r8.f14897d
            if (r0 == 0) goto L94
            r8.f14897d = r1
        L94:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.cast.a3.b(java.lang.Object):void");
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:16:0x004d. Please report as an issue. */
    @Override // com.google.android.gms.internal.cast.g3
    public final int c(N2 n22) {
        int i9;
        int J8;
        int t7;
        int i10;
        int i11;
        int a5;
        int J9;
        int size;
        int m9;
        int J10;
        int J11;
        int J12;
        int i12;
        int J13;
        int t9;
        a3 a3Var = this;
        N2 n23 = n22;
        Unsafe unsafe = f14806h;
        int i13 = 0;
        int i14 = 1048575;
        int i15 = 0;
        int i16 = 0;
        int i17 = 0;
        int i18 = 1048575;
        while (true) {
            int[] iArr = a3Var.f14807a;
            if (i15 < iArr.length) {
                int n7 = a3Var.n(i15);
                int m10 = m(n7);
                int i19 = iArr[i15];
                int i20 = iArr[i15 + 2];
                int i21 = i20 & i14;
                if (m10 <= 17) {
                    if (i21 != i18) {
                        if (i21 == i14) {
                            i16 = 0;
                        } else {
                            i16 = unsafe.getInt(n23, i21);
                        }
                        i18 = i21;
                    }
                    i9 = 1 << (i20 >>> 20);
                } else {
                    i9 = 0;
                }
                int i22 = n7 & i14;
                if (m10 >= L2.f14741b.f14745a) {
                    L2.f14742c.getClass();
                }
                long j = i22;
                switch (m10) {
                    case 0:
                        if (a3Var.w(n23, i15, i18, i16, i9)) {
                            i17 = A0.a.e(i19 << 3, 8, i17);
                        }
                        i15 += 3;
                        i14 = 1048575;
                        a3Var = this;
                    case 1:
                        if (a3Var.w(n23, i15, i18, i16, i9)) {
                            i17 = A0.a.e(i19 << 3, 4, i17);
                        }
                        n23 = n22;
                        i15 += 3;
                        i14 = 1048575;
                        a3Var = this;
                    case 2:
                        if (a3Var.w(n23, i15, i18, i16, i9)) {
                            long j4 = unsafe.getLong(n23, j);
                            J8 = J2.J(i19 << 3);
                            t7 = J2.t(j4);
                            i10 = t7 + J8;
                            i17 += i10;
                            i15 += 3;
                            i14 = 1048575;
                            a3Var = this;
                        } else {
                            i15 += 3;
                            i14 = 1048575;
                            a3Var = this;
                        }
                    case 3:
                        if (a3Var.w(n23, i15, i18, i16, i9)) {
                            long j9 = unsafe.getLong(n23, j);
                            J8 = J2.J(i19 << 3);
                            t7 = J2.t(j9);
                            i10 = t7 + J8;
                            i17 += i10;
                            i15 += 3;
                            i14 = 1048575;
                            a3Var = this;
                        } else {
                            i15 += 3;
                            i14 = 1048575;
                            a3Var = this;
                        }
                    case 4:
                        if (a3Var.w(n23, i15, i18, i16, i9)) {
                            long j10 = unsafe.getInt(n23, j);
                            J8 = J2.J(i19 << 3);
                            t7 = J2.t(j10);
                            i10 = t7 + J8;
                            i17 += i10;
                            i15 += 3;
                            i14 = 1048575;
                            a3Var = this;
                        } else {
                            i15 += 3;
                            i14 = 1048575;
                            a3Var = this;
                        }
                    case 5:
                        if (a3Var.w(n23, i15, i18, i16, i9)) {
                            i17 = A0.a.e(i19 << 3, 8, i17);
                        }
                        n23 = n22;
                        i15 += 3;
                        i14 = 1048575;
                        a3Var = this;
                    case 6:
                        if (a3Var.w(n23, i15, i18, i16, i9)) {
                            i17 = A0.a.e(i19 << 3, 4, i17);
                        }
                        n23 = n22;
                        i15 += 3;
                        i14 = 1048575;
                        a3Var = this;
                    case 7:
                        if (a3Var.w(n23, i15, i18, i16, i9)) {
                            i17 = A0.a.e(i19 << 3, 1, i17);
                        }
                        n23 = n22;
                        i15 += 3;
                        i14 = 1048575;
                        a3Var = this;
                    case 8:
                        if (a3Var.w(n23, i15, i18, i16, i9)) {
                            int i23 = i19 << 3;
                            Object object = unsafe.getObject(n23, j);
                            if (object instanceof I2) {
                                int J14 = J2.J(i23);
                                int d9 = ((I2) object).d();
                                i17 = A0.a.f(d9, d9, J14, i17);
                            } else {
                                J8 = J2.J(i23);
                                t7 = J2.I((String) object);
                                i10 = t7 + J8;
                                i17 += i10;
                            }
                        }
                        i15 += 3;
                        i14 = 1048575;
                        a3Var = this;
                    case 9:
                        if (a3Var.w(n23, i15, i18, i16, i9)) {
                            Object object2 = unsafe.getObject(n23, j);
                            g3 p9 = a3Var.p(i15);
                            C0886w0 c0886w0 = h3.f14855a;
                            int J15 = J2.J(i19 << 3);
                            int a9 = ((E2) object2).a(p9);
                            i17 = A0.a.f(a9, a9, J15, i17);
                        }
                        i15 += 3;
                        i14 = 1048575;
                        a3Var = this;
                    case R.styleable.GradientColor_android_endX /* 10 */:
                        if (a3Var.w(n23, i15, i18, i16, i9)) {
                            I2 i24 = (I2) unsafe.getObject(n23, j);
                            int J16 = J2.J(i19 << 3);
                            int d10 = i24.d();
                            i17 = A0.a.f(d10, d10, J16, i17);
                        }
                        i15 += 3;
                        i14 = 1048575;
                        a3Var = this;
                    case R.styleable.GradientColor_android_endY /* 11 */:
                        if (a3Var.w(n23, i15, i18, i16, i9)) {
                            i17 = A0.a.e(unsafe.getInt(n23, j), J2.J(i19 << 3), i17);
                        }
                        i15 += 3;
                        i14 = 1048575;
                        a3Var = this;
                    case 12:
                        if (a3Var.w(n23, i15, i18, i16, i9)) {
                            long j11 = unsafe.getInt(n23, j);
                            J8 = J2.J(i19 << 3);
                            t7 = J2.t(j11);
                            i10 = t7 + J8;
                            i17 += i10;
                            i15 += 3;
                            i14 = 1048575;
                            a3Var = this;
                        } else {
                            i15 += 3;
                            i14 = 1048575;
                            a3Var = this;
                        }
                    case 13:
                        if (a3Var.w(n23, i15, i18, i16, i9)) {
                            i17 = A0.a.e(i19 << 3, 4, i17);
                        }
                        n23 = n22;
                        i15 += 3;
                        i14 = 1048575;
                        a3Var = this;
                    case 14:
                        if (a3Var.w(n23, i15, i18, i16, i9)) {
                            i17 = A0.a.e(i19 << 3, 8, i17);
                        }
                        n23 = n22;
                        i15 += 3;
                        i14 = 1048575;
                        a3Var = this;
                    case 15:
                        if (a3Var.w(n23, i15, i18, i16, i9)) {
                            int i25 = unsafe.getInt(n23, j);
                            i17 = A0.a.e((i25 >> 31) ^ (i25 + i25), J2.J(i19 << 3), i17);
                        }
                        i15 += 3;
                        i14 = 1048575;
                        a3Var = this;
                    case 16:
                        if (a3Var.w(n23, i15, i18, i16, i9)) {
                            long j12 = unsafe.getLong(n23, j);
                            J8 = J2.J(i19 << 3);
                            t7 = J2.t((j12 >> 63) ^ (j12 + j12));
                            i10 = t7 + J8;
                            i17 += i10;
                            i15 += 3;
                            i14 = 1048575;
                            a3Var = this;
                        } else {
                            i15 += 3;
                            i14 = 1048575;
                            a3Var = this;
                        }
                    case 17:
                        if (a3Var.w(n23, i15, i18, i16, i9)) {
                            E2 e22 = (E2) unsafe.getObject(n23, j);
                            g3 p10 = a3Var.p(i15);
                            int J17 = J2.J(i19 << 3);
                            i11 = J17 + J17;
                            a5 = e22.a(p10);
                            i10 = a5 + i11;
                            i17 += i10;
                            i15 += 3;
                            i14 = 1048575;
                            a3Var = this;
                        } else {
                            i15 += 3;
                            i14 = 1048575;
                            a3Var = this;
                        }
                    case 18:
                        i10 = h3.g((List) unsafe.getObject(n23, j), i19);
                        i17 += i10;
                        i15 += 3;
                        i14 = 1048575;
                        a3Var = this;
                    case 19:
                        i10 = h3.f((List) unsafe.getObject(n23, j), i19);
                        i17 += i10;
                        i15 += 3;
                        i14 = 1048575;
                        a3Var = this;
                    case 20:
                        List list = (List) unsafe.getObject(n23, j);
                        C0886w0 c0886w02 = h3.f14855a;
                        if (list.size() != 0) {
                            J9 = (J2.J(i19 << 3) * list.size()) + h3.i(list);
                            i17 += J9;
                            i15 += 3;
                            i14 = 1048575;
                            a3Var = this;
                        }
                        J9 = 0;
                        i17 += J9;
                        i15 += 3;
                        i14 = 1048575;
                        a3Var = this;
                    case 21:
                        List list2 = (List) unsafe.getObject(n23, j);
                        C0886w0 c0886w03 = h3.f14855a;
                        size = list2.size();
                        if (size != 0) {
                            m9 = h3.m(list2);
                            J10 = J2.J(i19 << 3);
                            J11 = (J10 * size) + m9;
                            i17 += J11;
                            i15 += 3;
                            i14 = 1048575;
                            a3Var = this;
                        }
                        J11 = 0;
                        i17 += J11;
                        i15 += 3;
                        i14 = 1048575;
                        a3Var = this;
                    case 22:
                        List list3 = (List) unsafe.getObject(n23, j);
                        C0886w0 c0886w04 = h3.f14855a;
                        size = list3.size();
                        if (size != 0) {
                            m9 = h3.h(list3);
                            J10 = J2.J(i19 << 3);
                            J11 = (J10 * size) + m9;
                            i17 += J11;
                            i15 += 3;
                            i14 = 1048575;
                            a3Var = this;
                        }
                        J11 = 0;
                        i17 += J11;
                        i15 += 3;
                        i14 = 1048575;
                        a3Var = this;
                    case 23:
                        i10 = h3.g((List) unsafe.getObject(n23, j), i19);
                        i17 += i10;
                        i15 += 3;
                        i14 = 1048575;
                        a3Var = this;
                    case 24:
                        i10 = h3.f((List) unsafe.getObject(n23, j), i19);
                        i17 += i10;
                        i15 += 3;
                        i14 = 1048575;
                        a3Var = this;
                    case 25:
                        List list4 = (List) unsafe.getObject(n23, j);
                        C0886w0 c0886w05 = h3.f14855a;
                        int size2 = list4.size();
                        if (size2 != 0) {
                            J9 = (J2.J(i19 << 3) + 1) * size2;
                            i17 += J9;
                            i15 += 3;
                            i14 = 1048575;
                            a3Var = this;
                        }
                        J9 = 0;
                        i17 += J9;
                        i15 += 3;
                        i14 = 1048575;
                        a3Var = this;
                    case 26:
                        List list5 = (List) unsafe.getObject(n23, j);
                        C0886w0 c0886w06 = h3.f14855a;
                        int size3 = list5.size();
                        if (size3 != 0) {
                            J11 = J2.J(i19 << 3) * size3;
                            for (int i26 = 0; i26 < size3; i26++) {
                                Object obj = list5.get(i26);
                                if (obj instanceof I2) {
                                    int d11 = ((I2) obj).d();
                                    J11 = A0.a.e(d11, d11, J11);
                                } else {
                                    J11 = J2.I((String) obj) + J11;
                                }
                            }
                            i17 += J11;
                            i15 += 3;
                            i14 = 1048575;
                            a3Var = this;
                        }
                        J11 = 0;
                        i17 += J11;
                        i15 += 3;
                        i14 = 1048575;
                        a3Var = this;
                    case 27:
                        List list6 = (List) unsafe.getObject(n23, j);
                        g3 p11 = a3Var.p(i15);
                        C0886w0 c0886w07 = h3.f14855a;
                        int size4 = list6.size();
                        if (size4 == 0) {
                            J12 = 0;
                        } else {
                            J12 = J2.J(i19 << 3) * size4;
                            for (int i27 = 0; i27 < size4; i27++) {
                                int a10 = ((E2) list6.get(i27)).a(p11);
                                J12 = A0.a.e(a10, a10, J12);
                            }
                        }
                        i17 += J12;
                        i15 += 3;
                        i14 = 1048575;
                        a3Var = this;
                    case 28:
                        List list7 = (List) unsafe.getObject(n23, j);
                        C0886w0 c0886w08 = h3.f14855a;
                        int size5 = list7.size();
                        if (size5 != 0) {
                            J11 = J2.J(i19 << 3) * size5;
                            for (int i28 = 0; i28 < list7.size(); i28++) {
                                int d12 = ((I2) list7.get(i28)).d();
                                J11 = A0.a.e(d12, d12, J11);
                            }
                            i17 += J11;
                            i15 += 3;
                            i14 = 1048575;
                            a3Var = this;
                        }
                        J11 = 0;
                        i17 += J11;
                        i15 += 3;
                        i14 = 1048575;
                        a3Var = this;
                    case 29:
                        List list8 = (List) unsafe.getObject(n23, j);
                        C0886w0 c0886w09 = h3.f14855a;
                        size = list8.size();
                        if (size != 0) {
                            m9 = h3.l(list8);
                            J10 = J2.J(i19 << 3);
                            J11 = (J10 * size) + m9;
                            i17 += J11;
                            i15 += 3;
                            i14 = 1048575;
                            a3Var = this;
                        }
                        J11 = 0;
                        i17 += J11;
                        i15 += 3;
                        i14 = 1048575;
                        a3Var = this;
                    case 30:
                        List list9 = (List) unsafe.getObject(n23, j);
                        C0886w0 c0886w010 = h3.f14855a;
                        size = list9.size();
                        if (size != 0) {
                            m9 = h3.e(list9);
                            J10 = J2.J(i19 << 3);
                            J11 = (J10 * size) + m9;
                            i17 += J11;
                            i15 += 3;
                            i14 = 1048575;
                            a3Var = this;
                        }
                        J11 = 0;
                        i17 += J11;
                        i15 += 3;
                        i14 = 1048575;
                        a3Var = this;
                    case 31:
                        i10 = h3.f((List) unsafe.getObject(n23, j), i19);
                        i17 += i10;
                        i15 += 3;
                        i14 = 1048575;
                        a3Var = this;
                    case 32:
                        i10 = h3.g((List) unsafe.getObject(n23, j), i19);
                        i17 += i10;
                        i15 += 3;
                        i14 = 1048575;
                        a3Var = this;
                    case 33:
                        List list10 = (List) unsafe.getObject(n23, j);
                        C0886w0 c0886w011 = h3.f14855a;
                        size = list10.size();
                        if (size != 0) {
                            m9 = h3.j(list10);
                            J10 = J2.J(i19 << 3);
                            J11 = (J10 * size) + m9;
                            i17 += J11;
                            i15 += 3;
                            i14 = 1048575;
                            a3Var = this;
                        }
                        J11 = 0;
                        i17 += J11;
                        i15 += 3;
                        i14 = 1048575;
                        a3Var = this;
                    case 34:
                        List list11 = (List) unsafe.getObject(n23, j);
                        C0886w0 c0886w012 = h3.f14855a;
                        size = list11.size();
                        if (size != 0) {
                            m9 = h3.k(list11);
                            J10 = J2.J(i19 << 3);
                            J11 = (J10 * size) + m9;
                            i17 += J11;
                            i15 += 3;
                            i14 = 1048575;
                            a3Var = this;
                        }
                        J11 = 0;
                        i17 += J11;
                        i15 += 3;
                        i14 = 1048575;
                        a3Var = this;
                    case 35:
                        List list12 = (List) unsafe.getObject(n23, j);
                        C0886w0 c0886w013 = h3.f14855a;
                        int size6 = list12.size() * 8;
                        if (size6 > 0) {
                            i17 = A0.a.f(size6, J2.J(i19 << 3), size6, i17);
                        }
                        i15 += 3;
                        i14 = 1048575;
                        a3Var = this;
                    case 36:
                        List list13 = (List) unsafe.getObject(n23, j);
                        C0886w0 c0886w014 = h3.f14855a;
                        int size7 = list13.size() * 4;
                        if (size7 > 0) {
                            i17 = A0.a.f(size7, J2.J(i19 << 3), size7, i17);
                        }
                        i15 += 3;
                        i14 = 1048575;
                        a3Var = this;
                    case 37:
                        int i29 = h3.i((List) unsafe.getObject(n23, j));
                        if (i29 > 0) {
                            i17 = A0.a.f(i29, J2.J(i19 << 3), i29, i17);
                        }
                        i15 += 3;
                        i14 = 1048575;
                        a3Var = this;
                    case 38:
                        int m11 = h3.m((List) unsafe.getObject(n23, j));
                        if (m11 > 0) {
                            i17 = A0.a.f(m11, J2.J(i19 << 3), m11, i17);
                        }
                        i15 += 3;
                        i14 = 1048575;
                        a3Var = this;
                    case 39:
                        int h7 = h3.h((List) unsafe.getObject(n23, j));
                        if (h7 > 0) {
                            i17 = A0.a.f(h7, J2.J(i19 << 3), h7, i17);
                        }
                        i15 += 3;
                        i14 = 1048575;
                        a3Var = this;
                    case 40:
                        List list14 = (List) unsafe.getObject(n23, j);
                        C0886w0 c0886w015 = h3.f14855a;
                        int size8 = list14.size() * 8;
                        if (size8 > 0) {
                            i17 = A0.a.f(size8, J2.J(i19 << 3), size8, i17);
                        }
                        i15 += 3;
                        i14 = 1048575;
                        a3Var = this;
                    case 41:
                        List list15 = (List) unsafe.getObject(n23, j);
                        C0886w0 c0886w016 = h3.f14855a;
                        int size9 = list15.size() * 4;
                        if (size9 > 0) {
                            i17 = A0.a.f(size9, J2.J(i19 << 3), size9, i17);
                        }
                        i15 += 3;
                        i14 = 1048575;
                        a3Var = this;
                    case 42:
                        List list16 = (List) unsafe.getObject(n23, j);
                        C0886w0 c0886w017 = h3.f14855a;
                        int size10 = list16.size();
                        if (size10 > 0) {
                            i17 = A0.a.f(size10, J2.J(i19 << 3), size10, i17);
                        }
                        i15 += 3;
                        i14 = 1048575;
                        a3Var = this;
                    case 43:
                        int l9 = h3.l((List) unsafe.getObject(n23, j));
                        if (l9 > 0) {
                            i17 = A0.a.f(l9, J2.J(i19 << 3), l9, i17);
                        }
                        i15 += 3;
                        i14 = 1048575;
                        a3Var = this;
                    case 44:
                        int e8 = h3.e((List) unsafe.getObject(n23, j));
                        if (e8 > 0) {
                            i17 = A0.a.f(e8, J2.J(i19 << 3), e8, i17);
                        }
                        i15 += 3;
                        i14 = 1048575;
                        a3Var = this;
                    case 45:
                        List list17 = (List) unsafe.getObject(n23, j);
                        C0886w0 c0886w018 = h3.f14855a;
                        int size11 = list17.size() * 4;
                        if (size11 > 0) {
                            i17 = A0.a.f(size11, J2.J(i19 << 3), size11, i17);
                        }
                        i15 += 3;
                        i14 = 1048575;
                        a3Var = this;
                    case 46:
                        List list18 = (List) unsafe.getObject(n23, j);
                        C0886w0 c0886w019 = h3.f14855a;
                        int size12 = list18.size() * 8;
                        if (size12 > 0) {
                            i17 = A0.a.f(size12, J2.J(i19 << 3), size12, i17);
                        }
                        i15 += 3;
                        i14 = 1048575;
                        a3Var = this;
                    case 47:
                        int j13 = h3.j((List) unsafe.getObject(n23, j));
                        if (j13 > 0) {
                            i17 = A0.a.f(j13, J2.J(i19 << 3), j13, i17);
                        }
                        i15 += 3;
                        i14 = 1048575;
                        a3Var = this;
                    case 48:
                        int k5 = h3.k((List) unsafe.getObject(n23, j));
                        if (k5 > 0) {
                            i17 = A0.a.f(k5, J2.J(i19 << 3), k5, i17);
                        }
                        i15 += 3;
                        i14 = 1048575;
                        a3Var = this;
                    case 49:
                        List list19 = (List) unsafe.getObject(n23, j);
                        g3 p12 = a3Var.p(i15);
                        C0886w0 c0886w020 = h3.f14855a;
                        int size13 = list19.size();
                        if (size13 == 0) {
                            i12 = 0;
                        } else {
                            i12 = 0;
                            for (int i30 = 0; i30 < size13; i30++) {
                                E2 e23 = (E2) list19.get(i30);
                                int J18 = J2.J(i19 << 3);
                                i12 += e23.a(p12) + J18 + J18;
                            }
                        }
                        i17 += i12;
                        i15 += 3;
                        i14 = 1048575;
                        a3Var = this;
                    case 50:
                        Object object3 = unsafe.getObject(n23, j);
                        int i31 = i15 / 3;
                        Object obj2 = a3Var.f14808b[i31 + i31];
                        if (object3 == null) {
                            throw AbstractC0953k1.i(obj2);
                        }
                        throw new ClassCastException();
                    case 51:
                        if (a3Var.i(i19, i15, n23)) {
                            i17 = A0.a.e(i19 << 3, 8, i17);
                        }
                        i15 += 3;
                        i14 = 1048575;
                        a3Var = this;
                    case 52:
                        if (a3Var.i(i19, i15, n23)) {
                            i17 = A0.a.e(i19 << 3, 4, i17);
                        }
                        i15 += 3;
                        i14 = 1048575;
                        a3Var = this;
                    case 53:
                        if (a3Var.i(i19, i15, n23)) {
                            long o9 = o(j, n23);
                            J13 = J2.J(i19 << 3);
                            t9 = J2.t(o9);
                            i17 += t9 + J13;
                            i15 += 3;
                            i14 = 1048575;
                            a3Var = this;
                        } else {
                            i15 += 3;
                            i14 = 1048575;
                            a3Var = this;
                        }
                    case 54:
                        if (a3Var.i(i19, i15, n23)) {
                            long o10 = o(j, n23);
                            J13 = J2.J(i19 << 3);
                            t9 = J2.t(o10);
                            i17 += t9 + J13;
                            i15 += 3;
                            i14 = 1048575;
                            a3Var = this;
                        } else {
                            i15 += 3;
                            i14 = 1048575;
                            a3Var = this;
                        }
                    case 55:
                        if (a3Var.i(i19, i15, n23)) {
                            long k9 = k(j, n23);
                            J13 = J2.J(i19 << 3);
                            t9 = J2.t(k9);
                            i17 += t9 + J13;
                            i15 += 3;
                            i14 = 1048575;
                            a3Var = this;
                        } else {
                            i15 += 3;
                            i14 = 1048575;
                            a3Var = this;
                        }
                    case 56:
                        if (a3Var.i(i19, i15, n23)) {
                            i17 = A0.a.e(i19 << 3, 8, i17);
                        }
                        i15 += 3;
                        i14 = 1048575;
                        a3Var = this;
                    case 57:
                        if (a3Var.i(i19, i15, n23)) {
                            i17 = A0.a.e(i19 << 3, 4, i17);
                        }
                        i15 += 3;
                        i14 = 1048575;
                        a3Var = this;
                    case 58:
                        if (a3Var.i(i19, i15, n23)) {
                            i17 = A0.a.e(i19 << 3, 1, i17);
                        }
                        i15 += 3;
                        i14 = 1048575;
                        a3Var = this;
                    case 59:
                        if (a3Var.i(i19, i15, n23)) {
                            int i32 = i19 << 3;
                            Object object4 = unsafe.getObject(n23, j);
                            if (object4 instanceof I2) {
                                int J19 = J2.J(i32);
                                int d13 = ((I2) object4).d();
                                i17 = A0.a.f(d13, d13, J19, i17);
                            } else {
                                J13 = J2.J(i32);
                                t9 = J2.I((String) object4);
                                i17 += t9 + J13;
                            }
                        }
                        i15 += 3;
                        i14 = 1048575;
                        a3Var = this;
                    case 60:
                        if (a3Var.i(i19, i15, n23)) {
                            Object object5 = unsafe.getObject(n23, j);
                            g3 p13 = a3Var.p(i15);
                            C0886w0 c0886w021 = h3.f14855a;
                            int J20 = J2.J(i19 << 3);
                            int a11 = ((E2) object5).a(p13);
                            i17 = A0.a.f(a11, a11, J20, i17);
                        }
                        i15 += 3;
                        i14 = 1048575;
                        a3Var = this;
                    case 61:
                        if (a3Var.i(i19, i15, n23)) {
                            I2 i210 = (I2) unsafe.getObject(n23, j);
                            int J21 = J2.J(i19 << 3);
                            int d14 = i210.d();
                            i17 = A0.a.f(d14, d14, J21, i17);
                        }
                        i15 += 3;
                        i14 = 1048575;
                        a3Var = this;
                    case 62:
                        if (a3Var.i(i19, i15, n23)) {
                            i17 = A0.a.e(k(j, n23), J2.J(i19 << 3), i17);
                        }
                        i15 += 3;
                        i14 = 1048575;
                        a3Var = this;
                    case 63:
                        if (a3Var.i(i19, i15, n23)) {
                            long k10 = k(j, n23);
                            J13 = J2.J(i19 << 3);
                            t9 = J2.t(k10);
                            i17 += t9 + J13;
                            i15 += 3;
                            i14 = 1048575;
                            a3Var = this;
                        } else {
                            i15 += 3;
                            i14 = 1048575;
                            a3Var = this;
                        }
                    case 64:
                        if (a3Var.i(i19, i15, n23)) {
                            i17 = A0.a.e(i19 << 3, 4, i17);
                        }
                        i15 += 3;
                        i14 = 1048575;
                        a3Var = this;
                    case 65:
                        if (a3Var.i(i19, i15, n23)) {
                            i17 = A0.a.e(i19 << 3, 8, i17);
                        }
                        i15 += 3;
                        i14 = 1048575;
                        a3Var = this;
                    case 66:
                        if (a3Var.i(i19, i15, n23)) {
                            int k11 = k(j, n23);
                            i17 = A0.a.e((k11 >> 31) ^ (k11 + k11), J2.J(i19 << 3), i17);
                        }
                        i15 += 3;
                        i14 = 1048575;
                        a3Var = this;
                    case 67:
                        if (a3Var.i(i19, i15, n23)) {
                            long o11 = o(j, n23);
                            J13 = J2.J(i19 << 3);
                            t9 = J2.t((o11 >> 63) ^ (o11 + o11));
                            i17 += t9 + J13;
                            i15 += 3;
                            i14 = 1048575;
                            a3Var = this;
                        } else {
                            i15 += 3;
                            i14 = 1048575;
                            a3Var = this;
                        }
                    case 68:
                        if (a3Var.i(i19, i15, n23)) {
                            E2 e24 = (E2) unsafe.getObject(n23, j);
                            g3 p14 = a3Var.p(i15);
                            int J22 = J2.J(i19 << 3);
                            i11 = J22 + J22;
                            a5 = e24.a(p14);
                            i10 = a5 + i11;
                            i17 += i10;
                            i15 += 3;
                            i14 = 1048575;
                            a3Var = this;
                        } else {
                            i15 += 3;
                            i14 = 1048575;
                            a3Var = this;
                        }
                    default:
                        i15 += 3;
                        i14 = 1048575;
                        a3Var = this;
                }
            } else {
                j3 j3Var = n23.zzc;
                int i33 = j3Var.f14896c;
                if (i33 == -1) {
                    j3Var.f14896c = 0;
                } else {
                    i13 = i33;
                }
                return i13 + i17;
            }
        }
    }

    @Override // com.google.android.gms.internal.cast.g3
    public final boolean d(Object obj) {
        int i9;
        int i10;
        int i11;
        int i12 = 0;
        int i13 = 0;
        int i14 = 1048575;
        while (i13 < this.f14811e) {
            int i15 = this.f14810d[i13];
            int[] iArr = this.f14807a;
            int i16 = iArr[i15];
            int n7 = n(i15);
            int i17 = iArr[i15 + 2];
            int i18 = i17 & 1048575;
            int i19 = 1 << (i17 >>> 20);
            if (i18 != i14) {
                if (i18 != 1048575) {
                    i12 = f14806h.getInt(obj, i18);
                }
                i10 = i15;
                i11 = i12;
                i9 = i18;
            } else {
                int i20 = i12;
                i9 = i14;
                i10 = i15;
                i11 = i20;
            }
            if ((268435456 & n7) == 0 || w(obj, i10, i9, i11, i19)) {
                int m9 = m(n7);
                if (m9 != 9 && m9 != 17) {
                    if (m9 != 27) {
                        if (m9 != 60 && m9 != 68) {
                            if (m9 != 49) {
                                if (m9 == 50) {
                                    o3.g(n7 & 1048575, obj).getClass();
                                    throw new ClassCastException();
                                }
                            }
                        } else if (i(i16, i10, obj) && !p(i10).d(o3.g(n7 & 1048575, obj))) {
                        }
                        i13++;
                        i14 = i9;
                        i12 = i11;
                    }
                    List list = (List) o3.g(n7 & 1048575, obj);
                    if (list.isEmpty()) {
                        continue;
                    } else {
                        g3 p9 = p(i10);
                        for (int i21 = 0; i21 < list.size(); i21++) {
                            if (p9.d(list.get(i21))) {
                            }
                        }
                    }
                    i13++;
                    i14 = i9;
                    i12 = i11;
                } else {
                    if (w(obj, i10, i9, i11, i19) && !p(i10).d(o3.g(n7 & 1048575, obj))) {
                    }
                    i13++;
                    i14 = i9;
                    i12 = i11;
                }
            }
            return false;
        }
        return true;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:5:0x0015. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:18:0x01d5 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x01c7 A[SYNTHETIC] */
    @Override // com.google.android.gms.internal.cast.g3
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean e(com.google.android.gms.internal.cast.N2 r8, com.google.android.gms.internal.cast.N2 r9) {
        /*
            Method dump skipped, instructions count: 614
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.cast.a3.e(com.google.android.gms.internal.cast.N2, com.google.android.gms.internal.cast.N2):boolean");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:7:0x001f. Please report as an issue. */
    @Override // com.google.android.gms.internal.cast.g3
    public final void f(Object obj, Object obj2) {
        Object obj3;
        if (h(obj)) {
            obj2.getClass();
            int i9 = 0;
            while (true) {
                int[] iArr = this.f14807a;
                if (i9 < iArr.length) {
                    int n7 = n(i9);
                    int i10 = n7 & 1048575;
                    int m9 = m(n7);
                    int i11 = iArr[i9];
                    long j = i10;
                    switch (m9) {
                        case 0:
                            if (v(i9, obj2)) {
                                n3 n3Var = o3.f14937c;
                                obj3 = obj;
                                n3Var.e(obj3, j, n3Var.a(j, obj2));
                                t(i9, obj3);
                                i9 += 3;
                                obj = obj3;
                            }
                            obj3 = obj;
                            i9 += 3;
                            obj = obj3;
                        case 1:
                            if (v(i9, obj2)) {
                                n3 n3Var2 = o3.f14937c;
                                n3Var2.f(obj, j, n3Var2.b(j, obj2));
                                t(i9, obj);
                            }
                            obj3 = obj;
                            i9 += 3;
                            obj = obj3;
                        case 2:
                            if (v(i9, obj2)) {
                                o3.j(obj, j, o3.e(j, obj2));
                                t(i9, obj);
                            }
                            obj3 = obj;
                            i9 += 3;
                            obj = obj3;
                        case 3:
                            if (v(i9, obj2)) {
                                o3.j(obj, j, o3.e(j, obj2));
                                t(i9, obj);
                            }
                            obj3 = obj;
                            i9 += 3;
                            obj = obj3;
                        case 4:
                            if (v(i9, obj2)) {
                                o3.i(o3.d(j, obj2), j, obj);
                                t(i9, obj);
                            }
                            obj3 = obj;
                            i9 += 3;
                            obj = obj3;
                        case 5:
                            if (v(i9, obj2)) {
                                o3.j(obj, j, o3.e(j, obj2));
                                t(i9, obj);
                            }
                            obj3 = obj;
                            i9 += 3;
                            obj = obj3;
                        case 6:
                            if (v(i9, obj2)) {
                                o3.i(o3.d(j, obj2), j, obj);
                                t(i9, obj);
                            }
                            obj3 = obj;
                            i9 += 3;
                            obj = obj3;
                        case 7:
                            if (v(i9, obj2)) {
                                n3 n3Var3 = o3.f14937c;
                                n3Var3.c(j, obj, n3Var3.g(j, obj2));
                                t(i9, obj);
                            }
                            obj3 = obj;
                            i9 += 3;
                            obj = obj3;
                        case 8:
                            if (v(i9, obj2)) {
                                o3.k(obj, j, o3.g(j, obj2));
                                t(i9, obj);
                            }
                            obj3 = obj;
                            i9 += 3;
                            obj = obj3;
                        case 9:
                            r(obj, i9, obj2);
                            obj3 = obj;
                            i9 += 3;
                            obj = obj3;
                        case R.styleable.GradientColor_android_endX /* 10 */:
                            if (v(i9, obj2)) {
                                o3.k(obj, j, o3.g(j, obj2));
                                t(i9, obj);
                            }
                            obj3 = obj;
                            i9 += 3;
                            obj = obj3;
                        case R.styleable.GradientColor_android_endY /* 11 */:
                            if (v(i9, obj2)) {
                                o3.i(o3.d(j, obj2), j, obj);
                                t(i9, obj);
                            }
                            obj3 = obj;
                            i9 += 3;
                            obj = obj3;
                        case 12:
                            if (v(i9, obj2)) {
                                o3.i(o3.d(j, obj2), j, obj);
                                t(i9, obj);
                            }
                            obj3 = obj;
                            i9 += 3;
                            obj = obj3;
                        case 13:
                            if (v(i9, obj2)) {
                                o3.i(o3.d(j, obj2), j, obj);
                                t(i9, obj);
                            }
                            obj3 = obj;
                            i9 += 3;
                            obj = obj3;
                        case 14:
                            if (v(i9, obj2)) {
                                o3.j(obj, j, o3.e(j, obj2));
                                t(i9, obj);
                            }
                            obj3 = obj;
                            i9 += 3;
                            obj = obj3;
                        case 15:
                            if (v(i9, obj2)) {
                                o3.i(o3.d(j, obj2), j, obj);
                                t(i9, obj);
                            }
                            obj3 = obj;
                            i9 += 3;
                            obj = obj3;
                        case 16:
                            if (v(i9, obj2)) {
                                o3.j(obj, j, o3.e(j, obj2));
                                t(i9, obj);
                            }
                            obj3 = obj;
                            i9 += 3;
                            obj = obj3;
                        case 17:
                            r(obj, i9, obj2);
                            obj3 = obj;
                            i9 += 3;
                            obj = obj3;
                        case 18:
                        case 19:
                        case 20:
                        case 21:
                        case 22:
                        case 23:
                        case 24:
                        case 25:
                        case 26:
                        case 27:
                        case 28:
                        case 29:
                        case 30:
                        case 31:
                        case 32:
                        case 33:
                        case 34:
                        case 35:
                        case 36:
                        case 37:
                        case 38:
                        case 39:
                        case 40:
                        case 41:
                        case 42:
                        case 43:
                        case 44:
                        case 45:
                        case 46:
                        case 47:
                        case 48:
                        case 49:
                            R2 r22 = (R2) o3.g(j, obj);
                            R2 r23 = (R2) o3.g(j, obj2);
                            int size = r22.size();
                            int size2 = r23.size();
                            if (size > 0 && size2 > 0) {
                                if (!((F2) r22).f14714a) {
                                    r22 = r22.a(size2 + size);
                                }
                                r22.addAll(r23);
                            }
                            if (size > 0) {
                                r23 = r22;
                            }
                            o3.k(obj, j, r23);
                            obj3 = obj;
                            i9 += 3;
                            obj = obj3;
                        case 50:
                            C0886w0 c0886w0 = h3.f14855a;
                            Object g9 = o3.g(j, obj);
                            Object g10 = o3.g(j, obj2);
                            if (g9 == null) {
                                throw AbstractC0953k1.i(g10);
                            }
                            throw new ClassCastException();
                        case 51:
                        case 52:
                        case 53:
                        case 54:
                        case 55:
                        case 56:
                        case 57:
                        case 58:
                        case 59:
                            if (i(i11, i9, obj2)) {
                                o3.k(obj, j, o3.g(j, obj2));
                                o3.i(i11, iArr[i9 + 2] & 1048575, obj);
                            }
                            obj3 = obj;
                            i9 += 3;
                            obj = obj3;
                        case 60:
                            s(obj, i9, obj2);
                            obj3 = obj;
                            i9 += 3;
                            obj = obj3;
                        case 61:
                        case 62:
                        case 63:
                        case 64:
                        case 65:
                        case 66:
                        case 67:
                            if (i(i11, i9, obj2)) {
                                o3.k(obj, j, o3.g(j, obj2));
                                o3.i(i11, iArr[i9 + 2] & 1048575, obj);
                            }
                            obj3 = obj;
                            i9 += 3;
                            obj = obj3;
                        case 68:
                            s(obj, i9, obj2);
                            obj3 = obj;
                            i9 += 3;
                            obj = obj3;
                        default:
                            obj3 = obj;
                            i9 += 3;
                            obj = obj3;
                    }
                } else {
                    h3.n(obj, obj2);
                    return;
                }
            }
        } else {
            throw new IllegalArgumentException("Mutating immutable message: ".concat(String.valueOf(obj)));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:106:0x01ea, code lost:
    
        if (r2 != false) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00d9, code lost:
    
        if (r2 != false) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00db, code lost:
    
        r6 = 1231;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x00dc, code lost:
    
        r1 = r6 + r1;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:5:0x001e. Please report as an issue. */
    @Override // com.google.android.gms.internal.cast.g3
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int g(com.google.android.gms.internal.cast.N2 r11) {
        /*
            Method dump skipped, instructions count: 728
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.cast.a3.g(com.google.android.gms.internal.cast.N2):int");
    }

    public final boolean i(int i9, int i10, Object obj) {
        if (o3.d(this.f14807a[i10 + 2] & 1048575, obj) == i9) {
            return true;
        }
        return false;
    }

    @Override // com.google.android.gms.internal.cast.g3
    public final N2 l() {
        return (N2) ((N2) this.f14809c).h(4, null);
    }

    public final int n(int i9) {
        return this.f14807a[i9 + 1];
    }

    public final g3 p(int i9) {
        int i10 = i9 / 3;
        int i11 = i10 + i10;
        Object[] objArr = this.f14808b;
        g3 g3Var = (g3) objArr[i11];
        if (g3Var != null) {
            return g3Var;
        }
        g3 a5 = d3.f14823c.a((Class) objArr[i11 + 1]);
        objArr[i11] = a5;
        return a5;
    }

    public final void r(Object obj, int i9, Object obj2) {
        if (!v(i9, obj2)) {
            return;
        }
        int n7 = n(i9) & 1048575;
        Unsafe unsafe = f14806h;
        long j = n7;
        Object object = unsafe.getObject(obj2, j);
        if (object != null) {
            g3 p9 = p(i9);
            if (!v(i9, obj)) {
                if (!h(object)) {
                    unsafe.putObject(obj, j, object);
                } else {
                    N2 l9 = p9.l();
                    p9.f(l9, object);
                    unsafe.putObject(obj, j, l9);
                }
                t(i9, obj);
                return;
            }
            Object object2 = unsafe.getObject(obj, j);
            if (!h(object2)) {
                N2 l10 = p9.l();
                p9.f(l10, object2);
                unsafe.putObject(obj, j, l10);
                object2 = l10;
            }
            p9.f(object2, object);
            return;
        }
        throw new IllegalStateException("Source subfield " + this.f14807a[i9] + " is present but null: " + obj2.toString());
    }

    public final void s(Object obj, int i9, Object obj2) {
        int[] iArr = this.f14807a;
        int i10 = iArr[i9];
        if (!i(i10, i9, obj2)) {
            return;
        }
        int n7 = n(i9) & 1048575;
        Unsafe unsafe = f14806h;
        long j = n7;
        Object object = unsafe.getObject(obj2, j);
        if (object != null) {
            g3 p9 = p(i9);
            if (!i(i10, i9, obj)) {
                if (!h(object)) {
                    unsafe.putObject(obj, j, object);
                } else {
                    N2 l9 = p9.l();
                    p9.f(l9, object);
                    unsafe.putObject(obj, j, l9);
                }
                o3.i(i10, iArr[i9 + 2] & 1048575, obj);
                return;
            }
            Object object2 = unsafe.getObject(obj, j);
            if (!h(object2)) {
                N2 l10 = p9.l();
                p9.f(l10, object2);
                unsafe.putObject(obj, j, l10);
                object2 = l10;
            }
            p9.f(object2, object);
            return;
        }
        throw new IllegalStateException("Source subfield " + iArr[i9] + " is present but null: " + obj2.toString());
    }

    public final void t(int i9, Object obj) {
        int i10 = this.f14807a[i9 + 2];
        long j = 1048575 & i10;
        if (j == 1048575) {
            return;
        }
        o3.i((1 << (i10 >>> 20)) | o3.d(j, obj), j, obj);
    }

    public final boolean u(N2 n22, N2 n23, int i9) {
        if (v(i9, n22) == v(i9, n23)) {
            return true;
        }
        return false;
    }

    public final boolean v(int i9, Object obj) {
        int i10 = this.f14807a[i9 + 2];
        long j = i10 & 1048575;
        if (j == 1048575) {
            int n7 = n(i9);
            long j4 = n7 & 1048575;
            switch (m(n7)) {
                case 0:
                    if (Double.doubleToRawLongBits(o3.f14937c.a(j4, obj)) == 0) {
                        return false;
                    }
                    break;
                case 1:
                    if (Float.floatToRawIntBits(o3.f14937c.b(j4, obj)) == 0) {
                        return false;
                    }
                    break;
                case 2:
                    if (o3.e(j4, obj) == 0) {
                        return false;
                    }
                    break;
                case 3:
                    if (o3.e(j4, obj) == 0) {
                        return false;
                    }
                    break;
                case 4:
                    if (o3.d(j4, obj) == 0) {
                        return false;
                    }
                    break;
                case 5:
                    if (o3.e(j4, obj) == 0) {
                        return false;
                    }
                    break;
                case 6:
                    if (o3.d(j4, obj) == 0) {
                        return false;
                    }
                    break;
                case 7:
                    return o3.f14937c.g(j4, obj);
                case 8:
                    Object g9 = o3.g(j4, obj);
                    if (g9 instanceof String) {
                        if (((String) g9).isEmpty()) {
                            return false;
                        }
                    } else if (g9 instanceof I2) {
                        if (I2.f14726c.equals(g9)) {
                            return false;
                        }
                    } else {
                        throw new IllegalArgumentException();
                    }
                    break;
                case 9:
                    if (o3.g(j4, obj) == null) {
                        return false;
                    }
                    break;
                case R.styleable.GradientColor_android_endX /* 10 */:
                    if (I2.f14726c.equals(o3.g(j4, obj))) {
                        return false;
                    }
                    break;
                case R.styleable.GradientColor_android_endY /* 11 */:
                    if (o3.d(j4, obj) == 0) {
                        return false;
                    }
                    break;
                case 12:
                    if (o3.d(j4, obj) == 0) {
                        return false;
                    }
                    break;
                case 13:
                    if (o3.d(j4, obj) == 0) {
                        return false;
                    }
                    break;
                case 14:
                    if (o3.e(j4, obj) == 0) {
                        return false;
                    }
                    break;
                case 15:
                    if (o3.d(j4, obj) == 0) {
                        return false;
                    }
                    break;
                case 16:
                    if (o3.e(j4, obj) == 0) {
                        return false;
                    }
                    break;
                case 17:
                    if (o3.g(j4, obj) == null) {
                        return false;
                    }
                    break;
                default:
                    throw new IllegalArgumentException();
            }
        } else if (((1 << (i10 >>> 20)) & o3.d(j, obj)) == 0) {
            return false;
        }
        return true;
    }

    public final boolean w(Object obj, int i9, int i10, int i11, int i12) {
        if (i10 == 1048575) {
            return v(i9, obj);
        }
        if ((i11 & i12) != 0) {
            return true;
        }
        return false;
    }
}
