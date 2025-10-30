package com.google.android.gms.internal.measurement;

import co.notix.R;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import sun.misc.Unsafe;

/* renamed from: com.google.android.gms.internal.measurement.u2, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1003u2 implements B2 {
    public static final int[] j = new int[0];

    /* renamed from: k, reason: collision with root package name */
    public static final Unsafe f15607k = I2.h();

    /* renamed from: a, reason: collision with root package name */
    public final int[] f15608a;

    /* renamed from: b, reason: collision with root package name */
    public final Object[] f15609b;

    /* renamed from: c, reason: collision with root package name */
    public final int f15610c;

    /* renamed from: d, reason: collision with root package name */
    public final int f15611d;

    /* renamed from: e, reason: collision with root package name */
    public final N1 f15612e;

    /* renamed from: f, reason: collision with root package name */
    public final int[] f15613f;

    /* renamed from: g, reason: collision with root package name */
    public final int f15614g;

    /* renamed from: h, reason: collision with root package name */
    public final int f15615h;

    /* renamed from: i, reason: collision with root package name */
    public final Z1 f15616i;

    public C1003u2(int[] iArr, Object[] objArr, int i9, int i10, N1 n12, int[] iArr2, int i11, int i12, Z1 z12, Z1 z13) {
        this.f15608a = iArr;
        this.f15609b = objArr;
        this.f15610c = i9;
        this.f15611d = i10;
        this.f15613f = iArr2;
        this.f15614g = i11;
        this.f15615h = i12;
        this.f15616i = z12;
        this.f15612e = n12;
    }

    public static Field E(Class cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (NoSuchFieldException unused) {
            Field[] declaredFields = cls.getDeclaredFields();
            for (Field field : declaredFields) {
                if (str.equals(field.getName())) {
                    return field;
                }
            }
            throw new RuntimeException("Field " + str + " for " + cls.getName() + " not found. Known fields are " + Arrays.toString(declaredFields));
        }
    }

    public static boolean r(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof AbstractC0909b2) {
            return ((AbstractC0909b2) obj).l();
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:105:0x0356  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x03b3  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0271  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x028f  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0292  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0277  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.google.android.gms.internal.measurement.C1003u2 u(com.google.android.gms.internal.measurement.A2 r34, com.google.android.gms.internal.measurement.Z1 r35, com.google.android.gms.internal.measurement.Z1 r36) {
        /*
            Method dump skipped, instructions count: 1048
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.C1003u2.u(com.google.android.gms.internal.measurement.A2, com.google.android.gms.internal.measurement.Z1, com.google.android.gms.internal.measurement.Z1):com.google.android.gms.internal.measurement.u2");
    }

    public static int v(long j4, Object obj) {
        return ((Integer) I2.g(j4, obj)).intValue();
    }

    public static int x(int i9) {
        return (i9 >>> 20) & 255;
    }

    public static long z(long j4, Object obj) {
        return ((Long) I2.g(j4, obj)).longValue();
    }

    public final InterfaceC0924e2 A(int i9) {
        int i10 = i9 / 3;
        return (InterfaceC0924e2) this.f15609b[i10 + i10 + 1];
    }

    public final B2 B(int i9) {
        int i10 = i9 / 3;
        int i11 = i10 + i10;
        Object[] objArr = this.f15609b;
        B2 b22 = (B2) objArr[i11];
        if (b22 != null) {
            return b22;
        }
        B2 a5 = C1023y2.f15696c.a((Class) objArr[i11 + 1]);
        objArr[i11] = a5;
        return a5;
    }

    public final Object C(int i9, Object obj) {
        B2 B9 = B(i9);
        int y9 = y(i9) & 1048575;
        if (!p(i9, obj)) {
            return B9.c();
        }
        Object object = f15607k.getObject(obj, y9);
        if (r(object)) {
            return object;
        }
        AbstractC0909b2 c3 = B9.c();
        if (object != null) {
            B9.b(c3, object);
        }
        return c3;
    }

    public final Object D(int i9, int i10, Object obj) {
        B2 B9 = B(i10);
        if (!s(i9, i10, obj)) {
            return B9.c();
        }
        Object object = f15607k.getObject(obj, y(i10) & 1048575);
        if (r(object)) {
            return object;
        }
        AbstractC0909b2 c3 = B9.c();
        if (object != null) {
            B9.b(c3, object);
        }
        return c3;
    }

    @Override // com.google.android.gms.internal.measurement.B2
    public final void a(Object obj) {
        if (r(obj)) {
            if (obj instanceof AbstractC0909b2) {
                AbstractC0909b2 abstractC0909b2 = (AbstractC0909b2) obj;
                abstractC0909b2.k();
                abstractC0909b2.zza = 0;
                abstractC0909b2.i();
            }
            int i9 = 0;
            while (true) {
                int[] iArr = this.f15608a;
                if (i9 < iArr.length) {
                    int y9 = y(i9);
                    int i10 = 1048575 & y9;
                    int x5 = x(y9);
                    long j4 = i10;
                    if (x5 != 9) {
                        if (x5 != 60 && x5 != 68) {
                            switch (x5) {
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
                                    O1 o12 = (O1) ((InterfaceC0939h2) I2.g(j4, obj));
                                    if (!o12.f15279a) {
                                        break;
                                    } else {
                                        o12.f15279a = false;
                                        break;
                                    }
                                case 50:
                                    Unsafe unsafe = f15607k;
                                    Object object = unsafe.getObject(obj, j4);
                                    if (object == null) {
                                        break;
                                    } else {
                                        ((C0984q2) object).f15574a = false;
                                        unsafe.putObject(obj, j4, object);
                                        break;
                                    }
                            }
                        } else if (s(iArr[i9], i9, obj)) {
                            B(i9).a(f15607k.getObject(obj, j4));
                        }
                        i9 += 3;
                    }
                    if (p(i9, obj)) {
                        B(i9).a(f15607k.getObject(obj, j4));
                    }
                    i9 += 3;
                } else {
                    this.f15616i.getClass();
                    D2 d22 = ((AbstractC0909b2) obj).zzc;
                    if (d22.f15205e) {
                        d22.f15205e = false;
                        return;
                    }
                    return;
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.measurement.B2
    public final void b(Object obj, Object obj2) {
        Object obj3;
        if (r(obj)) {
            obj2.getClass();
            int i9 = 0;
            while (true) {
                int[] iArr = this.f15608a;
                if (i9 < iArr.length) {
                    int y9 = y(i9);
                    int i10 = y9 & 1048575;
                    int x5 = x(y9);
                    int i11 = iArr[i9];
                    long j4 = i10;
                    switch (x5) {
                        case 0:
                            if (p(i9, obj2)) {
                                H2 h22 = I2.f15226c;
                                obj3 = obj;
                                h22.e(obj3, j4, h22.a(j4, obj2));
                                l(i9, obj3);
                                break;
                            }
                            break;
                        case 1:
                            if (p(i9, obj2)) {
                                H2 h23 = I2.f15226c;
                                h23.f(obj, j4, h23.b(j4, obj2));
                                l(i9, obj);
                                break;
                            }
                            break;
                        case 2:
                            if (p(i9, obj2)) {
                                I2.j(obj, j4, I2.e(j4, obj2));
                                l(i9, obj);
                                break;
                            }
                            break;
                        case 3:
                            if (p(i9, obj2)) {
                                I2.j(obj, j4, I2.e(j4, obj2));
                                l(i9, obj);
                                break;
                            }
                            break;
                        case 4:
                            if (p(i9, obj2)) {
                                I2.i(I2.d(j4, obj2), j4, obj);
                                l(i9, obj);
                                break;
                            }
                            break;
                        case 5:
                            if (p(i9, obj2)) {
                                I2.j(obj, j4, I2.e(j4, obj2));
                                l(i9, obj);
                                break;
                            }
                            break;
                        case 6:
                            if (p(i9, obj2)) {
                                I2.i(I2.d(j4, obj2), j4, obj);
                                l(i9, obj);
                                break;
                            }
                            break;
                        case 7:
                            if (p(i9, obj2)) {
                                H2 h24 = I2.f15226c;
                                h24.c(j4, obj, h24.g(j4, obj2));
                                l(i9, obj);
                                break;
                            }
                            break;
                        case 8:
                            if (p(i9, obj2)) {
                                I2.k(obj, j4, I2.g(j4, obj2));
                                l(i9, obj);
                                break;
                            }
                            break;
                        case 9:
                            j(obj, i9, obj2);
                            break;
                        case R.styleable.GradientColor_android_endX /* 10 */:
                            if (p(i9, obj2)) {
                                I2.k(obj, j4, I2.g(j4, obj2));
                                l(i9, obj);
                                break;
                            }
                            break;
                        case R.styleable.GradientColor_android_endY /* 11 */:
                            if (p(i9, obj2)) {
                                I2.i(I2.d(j4, obj2), j4, obj);
                                l(i9, obj);
                                break;
                            }
                            break;
                        case 12:
                            if (p(i9, obj2)) {
                                I2.i(I2.d(j4, obj2), j4, obj);
                                l(i9, obj);
                                break;
                            }
                            break;
                        case 13:
                            if (p(i9, obj2)) {
                                I2.i(I2.d(j4, obj2), j4, obj);
                                l(i9, obj);
                                break;
                            }
                            break;
                        case 14:
                            if (p(i9, obj2)) {
                                I2.j(obj, j4, I2.e(j4, obj2));
                                l(i9, obj);
                                break;
                            }
                            break;
                        case 15:
                            if (p(i9, obj2)) {
                                I2.i(I2.d(j4, obj2), j4, obj);
                                l(i9, obj);
                                break;
                            }
                            break;
                        case 16:
                            if (p(i9, obj2)) {
                                I2.j(obj, j4, I2.e(j4, obj2));
                                l(i9, obj);
                                break;
                            }
                            break;
                        case 17:
                            j(obj, i9, obj2);
                            break;
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
                            InterfaceC0939h2 interfaceC0939h2 = (InterfaceC0939h2) I2.g(j4, obj);
                            InterfaceC0939h2 interfaceC0939h22 = (InterfaceC0939h2) I2.g(j4, obj2);
                            int size = interfaceC0939h2.size();
                            int size2 = interfaceC0939h22.size();
                            if (size > 0 && size2 > 0) {
                                if (!((O1) interfaceC0939h2).f15279a) {
                                    interfaceC0939h2 = interfaceC0939h2.a(size2 + size);
                                }
                                interfaceC0939h2.addAll(interfaceC0939h22);
                            }
                            if (size > 0) {
                                interfaceC0939h22 = interfaceC0939h2;
                            }
                            I2.k(obj, j4, interfaceC0939h22);
                            break;
                        case 50:
                            Z1 z12 = C2.f15189a;
                            I2.k(obj, j4, Z1.a(I2.g(j4, obj), I2.g(j4, obj2)));
                            break;
                        case 51:
                        case 52:
                        case 53:
                        case 54:
                        case 55:
                        case 56:
                        case 57:
                        case 58:
                        case 59:
                            if (s(i11, i9, obj2)) {
                                I2.k(obj, j4, I2.g(j4, obj2));
                                I2.i(i11, iArr[i9 + 2] & 1048575, obj);
                                break;
                            }
                            break;
                        case 60:
                            k(obj, i9, obj2);
                            break;
                        case 61:
                        case 62:
                        case 63:
                        case 64:
                        case 65:
                        case 66:
                        case 67:
                            if (s(i11, i9, obj2)) {
                                I2.k(obj, j4, I2.g(j4, obj2));
                                I2.i(i11, iArr[i9 + 2] & 1048575, obj);
                                break;
                            }
                            break;
                        case 68:
                            k(obj, i9, obj2);
                            break;
                    }
                    obj3 = obj;
                    i9 += 3;
                    obj = obj3;
                } else {
                    C2.p(obj, obj2);
                    return;
                }
            }
        } else {
            throw new IllegalArgumentException("Mutating immutable message: ".concat(String.valueOf(obj)));
        }
    }

    @Override // com.google.android.gms.internal.measurement.B2
    public final AbstractC0909b2 c() {
        return (AbstractC0909b2) ((AbstractC0909b2) this.f15612e).m(4);
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
    @Override // com.google.android.gms.internal.measurement.B2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int d(com.google.android.gms.internal.measurement.AbstractC0909b2 r11) {
        /*
            Method dump skipped, instructions count: 726
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.C1003u2.d(com.google.android.gms.internal.measurement.b2):int");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:14:0x003f. Please report as an issue. */
    @Override // com.google.android.gms.internal.measurement.B2
    public final void e(Object obj, C0974o2 c0974o2) {
        int i9;
        boolean z9;
        C1003u2 c1003u2 = this;
        Unsafe unsafe = f15607k;
        int i10 = 1048575;
        int i11 = 1048575;
        int i12 = 0;
        int i13 = 0;
        while (true) {
            int[] iArr = c1003u2.f15608a;
            if (i12 < iArr.length) {
                int y9 = c1003u2.y(i12);
                int x5 = x(y9);
                int i14 = iArr[i12];
                if (x5 <= 17) {
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
                long j4 = y9 & i10;
                switch (x5) {
                    case 0:
                        if (c1003u2.q(obj, i12, i11, i13, i9)) {
                            ((U1) c0974o2.f15559a).H(Double.doubleToRawLongBits(I2.f15226c.a(j4, obj)), i14);
                        }
                        i12 += 3;
                        i10 = 1048575;
                        c1003u2 = this;
                    case 1:
                        if (c1003u2.q(obj, i12, i11, i13, i9)) {
                            ((U1) c0974o2.f15559a).F(i14, Float.floatToRawIntBits(I2.f15226c.b(j4, obj)));
                        }
                        i12 += 3;
                        i10 = 1048575;
                        c1003u2 = this;
                    case 2:
                        if (c1003u2.q(obj, i12, i11, i13, i9)) {
                            ((U1) c0974o2.f15559a).P(unsafe.getLong(obj, j4), i14);
                        }
                        i12 += 3;
                        i10 = 1048575;
                        c1003u2 = this;
                    case 3:
                        if (c1003u2.q(obj, i12, i11, i13, i9)) {
                            ((U1) c0974o2.f15559a).P(unsafe.getLong(obj, j4), i14);
                        }
                        i12 += 3;
                        i10 = 1048575;
                        c1003u2 = this;
                    case 4:
                        if (c1003u2.q(obj, i12, i11, i13, i9)) {
                            ((U1) c0974o2.f15559a).J(i14, unsafe.getInt(obj, j4));
                        }
                        i12 += 3;
                        i10 = 1048575;
                        c1003u2 = this;
                    case 5:
                        if (c1003u2.q(obj, i12, i11, i13, i9)) {
                            ((U1) c0974o2.f15559a).H(unsafe.getLong(obj, j4), i14);
                        }
                        i12 += 3;
                        i10 = 1048575;
                        c1003u2 = this;
                    case 6:
                        if (c1003u2.q(obj, i12, i11, i13, i9)) {
                            ((U1) c0974o2.f15559a).F(i14, unsafe.getInt(obj, j4));
                        }
                        i12 += 3;
                        i10 = 1048575;
                        c1003u2 = this;
                    case 7:
                        if (c1003u2.q(obj, i12, i11, i13, i9)) {
                            byte g9 = I2.f15226c.g(j4, obj);
                            U1 u12 = (U1) c0974o2.f15559a;
                            u12.O(i14 << 3);
                            int i17 = u12.f15315m;
                            try {
                                int i18 = i17 + 1;
                                try {
                                    u12.f15313k[i17] = g9;
                                    u12.f15315m = i18;
                                } catch (IndexOutOfBoundsException e8) {
                                    e = e8;
                                    i17 = i18;
                                    throw new N3.M(i17, u12.f15314l, 1, e, 8);
                                }
                            } catch (IndexOutOfBoundsException e9) {
                                e = e9;
                            }
                        } else {
                            continue;
                        }
                        i12 += 3;
                        i10 = 1048575;
                        c1003u2 = this;
                    case 8:
                        if (c1003u2.q(obj, i12, i11, i13, i9)) {
                            Object object = unsafe.getObject(obj, j4);
                            if (object instanceof String) {
                                ((U1) c0974o2.f15559a).L(i14, (String) object);
                            } else {
                                ((U1) c0974o2.f15559a).E(i14, (T1) object);
                            }
                        }
                        i12 += 3;
                        i10 = 1048575;
                        c1003u2 = this;
                    case 9:
                        if (c1003u2.q(obj, i12, i11, i13, i9)) {
                            c0974o2.e(i14, unsafe.getObject(obj, j4), c1003u2.B(i12));
                        }
                        i12 += 3;
                        i10 = 1048575;
                        c1003u2 = this;
                    case R.styleable.GradientColor_android_endX /* 10 */:
                        if (c1003u2.q(obj, i12, i11, i13, i9)) {
                            ((U1) c0974o2.f15559a).E(i14, (T1) unsafe.getObject(obj, j4));
                        }
                        i12 += 3;
                        i10 = 1048575;
                        c1003u2 = this;
                    case R.styleable.GradientColor_android_endY /* 11 */:
                        if (c1003u2.q(obj, i12, i11, i13, i9)) {
                            ((U1) c0974o2.f15559a).N(i14, unsafe.getInt(obj, j4));
                        }
                        i12 += 3;
                        i10 = 1048575;
                        c1003u2 = this;
                    case 12:
                        if (c1003u2.q(obj, i12, i11, i13, i9)) {
                            ((U1) c0974o2.f15559a).J(i14, unsafe.getInt(obj, j4));
                        }
                        i12 += 3;
                        i10 = 1048575;
                        c1003u2 = this;
                    case 13:
                        if (c1003u2.q(obj, i12, i11, i13, i9)) {
                            ((U1) c0974o2.f15559a).F(i14, unsafe.getInt(obj, j4));
                        }
                        i12 += 3;
                        i10 = 1048575;
                        c1003u2 = this;
                    case 14:
                        if (c1003u2.q(obj, i12, i11, i13, i9)) {
                            ((U1) c0974o2.f15559a).H(unsafe.getLong(obj, j4), i14);
                        }
                        i12 += 3;
                        i10 = 1048575;
                        c1003u2 = this;
                    case 15:
                        if (c1003u2.q(obj, i12, i11, i13, i9)) {
                            int i19 = unsafe.getInt(obj, j4);
                            ((U1) c0974o2.f15559a).N(i14, (i19 >> 31) ^ (i19 + i19));
                        }
                        i12 += 3;
                        i10 = 1048575;
                        c1003u2 = this;
                    case 16:
                        if (c1003u2.q(obj, i12, i11, i13, i9)) {
                            long j9 = unsafe.getLong(obj, j4);
                            ((U1) c0974o2.f15559a).P((j9 + j9) ^ (j9 >> 63), i14);
                        }
                        i12 += 3;
                        i10 = 1048575;
                        c1003u2 = this;
                    case 17:
                        if (c1003u2.q(obj, i12, i11, i13, i9)) {
                            c0974o2.d(i14, unsafe.getObject(obj, j4), c1003u2.B(i12));
                        }
                        i12 += 3;
                        i10 = 1048575;
                        c1003u2 = this;
                    case 18:
                        C2.r(iArr[i12], (List) unsafe.getObject(obj, j4), c0974o2, false);
                        i12 += 3;
                        i10 = 1048575;
                        c1003u2 = this;
                    case 19:
                        C2.v(iArr[i12], (List) unsafe.getObject(obj, j4), c0974o2, false);
                        i12 += 3;
                        i10 = 1048575;
                        c1003u2 = this;
                    case 20:
                        C2.x(iArr[i12], (List) unsafe.getObject(obj, j4), c0974o2, false);
                        i12 += 3;
                        i10 = 1048575;
                        c1003u2 = this;
                    case 21:
                        C2.d(iArr[i12], (List) unsafe.getObject(obj, j4), c0974o2, false);
                        i12 += 3;
                        i10 = 1048575;
                        c1003u2 = this;
                    case 22:
                        C2.w(iArr[i12], (List) unsafe.getObject(obj, j4), c0974o2, false);
                        i12 += 3;
                        i10 = 1048575;
                        c1003u2 = this;
                    case 23:
                        C2.u(iArr[i12], (List) unsafe.getObject(obj, j4), c0974o2, false);
                        i12 += 3;
                        i10 = 1048575;
                        c1003u2 = this;
                    case 24:
                        C2.t(iArr[i12], (List) unsafe.getObject(obj, j4), c0974o2, false);
                        i12 += 3;
                        i10 = 1048575;
                        c1003u2 = this;
                    case 25:
                        C2.q(iArr[i12], (List) unsafe.getObject(obj, j4), c0974o2, false);
                        i12 += 3;
                        i10 = 1048575;
                        c1003u2 = this;
                    case 26:
                        int i20 = iArr[i12];
                        List list = (List) unsafe.getObject(obj, j4);
                        Z1 z12 = C2.f15189a;
                        if (list != null && !list.isEmpty()) {
                            c0974o2.getClass();
                            for (int i21 = 0; i21 < list.size(); i21++) {
                                ((U1) c0974o2.f15559a).L(i20, (String) list.get(i21));
                            }
                        }
                        i12 += 3;
                        i10 = 1048575;
                        c1003u2 = this;
                        break;
                    case 27:
                        int i22 = iArr[i12];
                        List list2 = (List) unsafe.getObject(obj, j4);
                        B2 B9 = c1003u2.B(i12);
                        Z1 z13 = C2.f15189a;
                        if (list2 != null && !list2.isEmpty()) {
                            for (int i23 = 0; i23 < list2.size(); i23++) {
                                c0974o2.e(i22, list2.get(i23), B9);
                            }
                        }
                        i12 += 3;
                        i10 = 1048575;
                        c1003u2 = this;
                        break;
                    case 28:
                        int i24 = iArr[i12];
                        List list3 = (List) unsafe.getObject(obj, j4);
                        Z1 z14 = C2.f15189a;
                        if (list3 != null && !list3.isEmpty()) {
                            c0974o2.getClass();
                            for (int i25 = 0; i25 < list3.size(); i25++) {
                                ((U1) c0974o2.f15559a).E(i24, (T1) list3.get(i25));
                            }
                        }
                        i12 += 3;
                        i10 = 1048575;
                        c1003u2 = this;
                        break;
                    case 29:
                        z9 = false;
                        C2.c(iArr[i12], (List) unsafe.getObject(obj, j4), c0974o2, false);
                        i12 += 3;
                        i10 = 1048575;
                        c1003u2 = this;
                    case 30:
                        z9 = false;
                        C2.s(iArr[i12], (List) unsafe.getObject(obj, j4), c0974o2, false);
                        i12 += 3;
                        i10 = 1048575;
                        c1003u2 = this;
                    case 31:
                        z9 = false;
                        C2.y(iArr[i12], (List) unsafe.getObject(obj, j4), c0974o2, false);
                        i12 += 3;
                        i10 = 1048575;
                        c1003u2 = this;
                    case 32:
                        z9 = false;
                        C2.z(iArr[i12], (List) unsafe.getObject(obj, j4), c0974o2, false);
                        i12 += 3;
                        i10 = 1048575;
                        c1003u2 = this;
                    case 33:
                        z9 = false;
                        C2.a(iArr[i12], (List) unsafe.getObject(obj, j4), c0974o2, false);
                        i12 += 3;
                        i10 = 1048575;
                        c1003u2 = this;
                    case 34:
                        z9 = false;
                        C2.b(iArr[i12], (List) unsafe.getObject(obj, j4), c0974o2, false);
                        i12 += 3;
                        i10 = 1048575;
                        c1003u2 = this;
                    case 35:
                        C2.r(iArr[i12], (List) unsafe.getObject(obj, j4), c0974o2, true);
                        i12 += 3;
                        i10 = 1048575;
                        c1003u2 = this;
                    case 36:
                        C2.v(iArr[i12], (List) unsafe.getObject(obj, j4), c0974o2, true);
                        i12 += 3;
                        i10 = 1048575;
                        c1003u2 = this;
                    case 37:
                        C2.x(iArr[i12], (List) unsafe.getObject(obj, j4), c0974o2, true);
                        i12 += 3;
                        i10 = 1048575;
                        c1003u2 = this;
                    case 38:
                        C2.d(iArr[i12], (List) unsafe.getObject(obj, j4), c0974o2, true);
                        i12 += 3;
                        i10 = 1048575;
                        c1003u2 = this;
                    case 39:
                        C2.w(iArr[i12], (List) unsafe.getObject(obj, j4), c0974o2, true);
                        i12 += 3;
                        i10 = 1048575;
                        c1003u2 = this;
                    case 40:
                        C2.u(iArr[i12], (List) unsafe.getObject(obj, j4), c0974o2, true);
                        i12 += 3;
                        i10 = 1048575;
                        c1003u2 = this;
                    case 41:
                        C2.t(iArr[i12], (List) unsafe.getObject(obj, j4), c0974o2, true);
                        i12 += 3;
                        i10 = 1048575;
                        c1003u2 = this;
                    case 42:
                        C2.q(iArr[i12], (List) unsafe.getObject(obj, j4), c0974o2, true);
                        i12 += 3;
                        i10 = 1048575;
                        c1003u2 = this;
                    case 43:
                        C2.c(iArr[i12], (List) unsafe.getObject(obj, j4), c0974o2, true);
                        i12 += 3;
                        i10 = 1048575;
                        c1003u2 = this;
                    case 44:
                        C2.s(iArr[i12], (List) unsafe.getObject(obj, j4), c0974o2, true);
                        i12 += 3;
                        i10 = 1048575;
                        c1003u2 = this;
                    case 45:
                        C2.y(iArr[i12], (List) unsafe.getObject(obj, j4), c0974o2, true);
                        i12 += 3;
                        i10 = 1048575;
                        c1003u2 = this;
                    case 46:
                        C2.z(iArr[i12], (List) unsafe.getObject(obj, j4), c0974o2, true);
                        i12 += 3;
                        i10 = 1048575;
                        c1003u2 = this;
                    case 47:
                        C2.a(iArr[i12], (List) unsafe.getObject(obj, j4), c0974o2, true);
                        i12 += 3;
                        i10 = 1048575;
                        c1003u2 = this;
                    case 48:
                        C2.b(iArr[i12], (List) unsafe.getObject(obj, j4), c0974o2, true);
                        i12 += 3;
                        i10 = 1048575;
                        c1003u2 = this;
                    case 49:
                        int i26 = iArr[i12];
                        List list4 = (List) unsafe.getObject(obj, j4);
                        B2 B10 = c1003u2.B(i12);
                        Z1 z15 = C2.f15189a;
                        if (list4 != null && !list4.isEmpty()) {
                            for (int i27 = 0; i27 < list4.size(); i27++) {
                                c0974o2.d(i26, list4.get(i27), B10);
                            }
                        }
                        i12 += 3;
                        i10 = 1048575;
                        c1003u2 = this;
                        break;
                    case 50:
                        if (unsafe.getObject(obj, j4) != null) {
                            int i28 = i12 / 3;
                            throw AbstractC0953k1.i(c1003u2.f15609b[i28 + i28]);
                        }
                        i12 += 3;
                        i10 = 1048575;
                        c1003u2 = this;
                    case 51:
                        if (c1003u2.s(i14, i12, obj)) {
                            ((U1) c0974o2.f15559a).H(Double.doubleToRawLongBits(((Double) I2.g(j4, obj)).doubleValue()), i14);
                        }
                        i12 += 3;
                        i10 = 1048575;
                        c1003u2 = this;
                    case 52:
                        if (c1003u2.s(i14, i12, obj)) {
                            ((U1) c0974o2.f15559a).F(i14, Float.floatToRawIntBits(((Float) I2.g(j4, obj)).floatValue()));
                        }
                        i12 += 3;
                        i10 = 1048575;
                        c1003u2 = this;
                    case 53:
                        if (c1003u2.s(i14, i12, obj)) {
                            ((U1) c0974o2.f15559a).P(z(j4, obj), i14);
                        }
                        i12 += 3;
                        i10 = 1048575;
                        c1003u2 = this;
                    case 54:
                        if (c1003u2.s(i14, i12, obj)) {
                            ((U1) c0974o2.f15559a).P(z(j4, obj), i14);
                        }
                        i12 += 3;
                        i10 = 1048575;
                        c1003u2 = this;
                    case 55:
                        if (c1003u2.s(i14, i12, obj)) {
                            ((U1) c0974o2.f15559a).J(i14, v(j4, obj));
                        }
                        i12 += 3;
                        i10 = 1048575;
                        c1003u2 = this;
                    case 56:
                        if (c1003u2.s(i14, i12, obj)) {
                            ((U1) c0974o2.f15559a).H(z(j4, obj), i14);
                        }
                        i12 += 3;
                        i10 = 1048575;
                        c1003u2 = this;
                    case 57:
                        if (c1003u2.s(i14, i12, obj)) {
                            ((U1) c0974o2.f15559a).F(i14, v(j4, obj));
                        }
                        i12 += 3;
                        i10 = 1048575;
                        c1003u2 = this;
                    case 58:
                        if (c1003u2.s(i14, i12, obj)) {
                            byte booleanValue = ((Boolean) I2.g(j4, obj)).booleanValue();
                            U1 u13 = (U1) c0974o2.f15559a;
                            u13.O(i14 << 3);
                            int i29 = u13.f15315m;
                            try {
                                int i30 = i29 + 1;
                                try {
                                    u13.f15313k[i29] = booleanValue;
                                    u13.f15315m = i30;
                                } catch (IndexOutOfBoundsException e10) {
                                    e = e10;
                                    i29 = i30;
                                    throw new N3.M(i29, u13.f15314l, 1, e, 8);
                                }
                            } catch (IndexOutOfBoundsException e11) {
                                e = e11;
                            }
                        }
                        i12 += 3;
                        i10 = 1048575;
                        c1003u2 = this;
                    case 59:
                        if (c1003u2.s(i14, i12, obj)) {
                            Object object2 = unsafe.getObject(obj, j4);
                            if (object2 instanceof String) {
                                ((U1) c0974o2.f15559a).L(i14, (String) object2);
                            } else {
                                ((U1) c0974o2.f15559a).E(i14, (T1) object2);
                            }
                        }
                        i12 += 3;
                        i10 = 1048575;
                        c1003u2 = this;
                    case 60:
                        if (c1003u2.s(i14, i12, obj)) {
                            c0974o2.e(i14, unsafe.getObject(obj, j4), c1003u2.B(i12));
                        }
                        i12 += 3;
                        i10 = 1048575;
                        c1003u2 = this;
                    case 61:
                        if (c1003u2.s(i14, i12, obj)) {
                            ((U1) c0974o2.f15559a).E(i14, (T1) unsafe.getObject(obj, j4));
                        }
                        i12 += 3;
                        i10 = 1048575;
                        c1003u2 = this;
                    case 62:
                        if (c1003u2.s(i14, i12, obj)) {
                            ((U1) c0974o2.f15559a).N(i14, v(j4, obj));
                        }
                        i12 += 3;
                        i10 = 1048575;
                        c1003u2 = this;
                    case 63:
                        if (c1003u2.s(i14, i12, obj)) {
                            ((U1) c0974o2.f15559a).J(i14, v(j4, obj));
                        }
                        i12 += 3;
                        i10 = 1048575;
                        c1003u2 = this;
                    case 64:
                        if (c1003u2.s(i14, i12, obj)) {
                            ((U1) c0974o2.f15559a).F(i14, v(j4, obj));
                        }
                        i12 += 3;
                        i10 = 1048575;
                        c1003u2 = this;
                    case 65:
                        if (c1003u2.s(i14, i12, obj)) {
                            ((U1) c0974o2.f15559a).H(z(j4, obj), i14);
                        }
                        i12 += 3;
                        i10 = 1048575;
                        c1003u2 = this;
                    case 66:
                        if (c1003u2.s(i14, i12, obj)) {
                            int v8 = v(j4, obj);
                            ((U1) c0974o2.f15559a).N(i14, (v8 >> 31) ^ (v8 + v8));
                        }
                        i12 += 3;
                        i10 = 1048575;
                        c1003u2 = this;
                    case 67:
                        if (c1003u2.s(i14, i12, obj)) {
                            long z10 = z(j4, obj);
                            ((U1) c0974o2.f15559a).P((z10 + z10) ^ (z10 >> 63), i14);
                        }
                        i12 += 3;
                        i10 = 1048575;
                        c1003u2 = this;
                    case 68:
                        if (c1003u2.s(i14, i12, obj)) {
                            c0974o2.d(i14, unsafe.getObject(obj, j4), c1003u2.B(i12));
                        }
                        i12 += 3;
                        i10 = 1048575;
                        c1003u2 = this;
                    default:
                        i12 += 3;
                        i10 = 1048575;
                        c1003u2 = this;
                }
            } else {
                ((AbstractC0909b2) obj).zzc.d(c0974o2);
                return;
            }
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:16:0x004c. Please report as an issue. */
    @Override // com.google.android.gms.internal.measurement.B2
    public final int f(AbstractC0909b2 abstractC0909b2) {
        int i9;
        int S8;
        int C8;
        int i10;
        int i11;
        int a5;
        int S9;
        int size;
        int n7;
        int S10;
        int S11;
        int S12;
        int i12;
        int S13;
        int C9;
        C1003u2 c1003u2 = this;
        AbstractC0909b2 abstractC0909b22 = abstractC0909b2;
        Unsafe unsafe = f15607k;
        int i13 = 1048575;
        int i14 = 0;
        int i15 = 0;
        int i16 = 0;
        while (true) {
            int[] iArr = c1003u2.f15608a;
            if (i14 < iArr.length) {
                int y9 = c1003u2.y(i14);
                int x5 = x(y9);
                int i17 = iArr[i14];
                int i18 = iArr[i14 + 2];
                int i19 = i18 & 1048575;
                if (x5 <= 17) {
                    if (i19 != i13) {
                        if (i19 == 1048575) {
                            i15 = 0;
                        } else {
                            i15 = unsafe.getInt(abstractC0909b22, i19);
                        }
                        i13 = i19;
                    }
                    i9 = 1 << (i18 >>> 20);
                } else {
                    i9 = 0;
                }
                int i20 = y9 & 1048575;
                if (x5 >= X1.f15399b.f15403a) {
                    X1.f15400c.getClass();
                }
                long j4 = i20;
                switch (x5) {
                    case 0:
                        if (c1003u2.q(abstractC0909b22, i14, i13, i15, i9)) {
                            i16 = AbstractC0953k1.g(i17 << 3, 8, i16);
                        }
                        i14 += 3;
                        c1003u2 = this;
                    case 1:
                        if (c1003u2.q(abstractC0909b22, i14, i13, i15, i9)) {
                            i16 = AbstractC0953k1.g(i17 << 3, 4, i16);
                        }
                        abstractC0909b22 = abstractC0909b2;
                        i14 += 3;
                        c1003u2 = this;
                    case 2:
                        if (c1003u2.q(abstractC0909b22, i14, i13, i15, i9)) {
                            long j9 = unsafe.getLong(abstractC0909b22, j4);
                            S8 = U1.S(i17 << 3);
                            C8 = U1.C(j9);
                            i10 = C8 + S8;
                            i16 += i10;
                            i14 += 3;
                            c1003u2 = this;
                        } else {
                            i14 += 3;
                            c1003u2 = this;
                        }
                    case 3:
                        if (c1003u2.q(abstractC0909b22, i14, i13, i15, i9)) {
                            long j10 = unsafe.getLong(abstractC0909b22, j4);
                            S8 = U1.S(i17 << 3);
                            C8 = U1.C(j10);
                            i10 = C8 + S8;
                            i16 += i10;
                            i14 += 3;
                            c1003u2 = this;
                        } else {
                            i14 += 3;
                            c1003u2 = this;
                        }
                    case 4:
                        if (c1003u2.q(abstractC0909b22, i14, i13, i15, i9)) {
                            long j11 = unsafe.getInt(abstractC0909b22, j4);
                            S8 = U1.S(i17 << 3);
                            C8 = U1.C(j11);
                            i10 = C8 + S8;
                            i16 += i10;
                            i14 += 3;
                            c1003u2 = this;
                        } else {
                            i14 += 3;
                            c1003u2 = this;
                        }
                    case 5:
                        if (c1003u2.q(abstractC0909b22, i14, i13, i15, i9)) {
                            i16 = AbstractC0953k1.g(i17 << 3, 8, i16);
                        }
                        abstractC0909b22 = abstractC0909b2;
                        i14 += 3;
                        c1003u2 = this;
                    case 6:
                        if (c1003u2.q(abstractC0909b22, i14, i13, i15, i9)) {
                            i16 = AbstractC0953k1.g(i17 << 3, 4, i16);
                        }
                        abstractC0909b22 = abstractC0909b2;
                        i14 += 3;
                        c1003u2 = this;
                    case 7:
                        if (c1003u2.q(abstractC0909b22, i14, i13, i15, i9)) {
                            i16 = AbstractC0953k1.g(i17 << 3, 1, i16);
                        }
                        abstractC0909b22 = abstractC0909b2;
                        i14 += 3;
                        c1003u2 = this;
                    case 8:
                        if (c1003u2.q(abstractC0909b22, i14, i13, i15, i9)) {
                            int i21 = i17 << 3;
                            Object object = unsafe.getObject(abstractC0909b22, j4);
                            if (object instanceof T1) {
                                int S14 = U1.S(i21);
                                int d9 = ((T1) object).d();
                                i16 = AbstractC0953k1.h(d9, d9, S14, i16);
                            } else {
                                S8 = U1.S(i21);
                                C8 = U1.R((String) object);
                                i10 = C8 + S8;
                                i16 += i10;
                            }
                        }
                        i14 += 3;
                        c1003u2 = this;
                    case 9:
                        if (c1003u2.q(abstractC0909b22, i14, i13, i15, i9)) {
                            Object object2 = unsafe.getObject(abstractC0909b22, j4);
                            B2 B9 = c1003u2.B(i14);
                            Z1 z12 = C2.f15189a;
                            int S15 = U1.S(i17 << 3);
                            int a9 = ((N1) object2).a(B9);
                            i16 = AbstractC0953k1.h(a9, a9, S15, i16);
                        }
                        i14 += 3;
                        c1003u2 = this;
                    case R.styleable.GradientColor_android_endX /* 10 */:
                        if (c1003u2.q(abstractC0909b22, i14, i13, i15, i9)) {
                            T1 t12 = (T1) unsafe.getObject(abstractC0909b22, j4);
                            int S16 = U1.S(i17 << 3);
                            int d10 = t12.d();
                            i16 = AbstractC0953k1.h(d10, d10, S16, i16);
                        }
                        i14 += 3;
                        c1003u2 = this;
                    case R.styleable.GradientColor_android_endY /* 11 */:
                        if (c1003u2.q(abstractC0909b22, i14, i13, i15, i9)) {
                            i16 = AbstractC0953k1.g(unsafe.getInt(abstractC0909b22, j4), U1.S(i17 << 3), i16);
                        }
                        i14 += 3;
                        c1003u2 = this;
                    case 12:
                        if (c1003u2.q(abstractC0909b22, i14, i13, i15, i9)) {
                            long j12 = unsafe.getInt(abstractC0909b22, j4);
                            S8 = U1.S(i17 << 3);
                            C8 = U1.C(j12);
                            i10 = C8 + S8;
                            i16 += i10;
                            i14 += 3;
                            c1003u2 = this;
                        } else {
                            i14 += 3;
                            c1003u2 = this;
                        }
                    case 13:
                        if (c1003u2.q(abstractC0909b22, i14, i13, i15, i9)) {
                            i16 = AbstractC0953k1.g(i17 << 3, 4, i16);
                        }
                        abstractC0909b22 = abstractC0909b2;
                        i14 += 3;
                        c1003u2 = this;
                    case 14:
                        if (c1003u2.q(abstractC0909b22, i14, i13, i15, i9)) {
                            i16 = AbstractC0953k1.g(i17 << 3, 8, i16);
                        }
                        abstractC0909b22 = abstractC0909b2;
                        i14 += 3;
                        c1003u2 = this;
                    case 15:
                        if (c1003u2.q(abstractC0909b22, i14, i13, i15, i9)) {
                            int i22 = unsafe.getInt(abstractC0909b22, j4);
                            i16 = AbstractC0953k1.g((i22 >> 31) ^ (i22 + i22), U1.S(i17 << 3), i16);
                        }
                        i14 += 3;
                        c1003u2 = this;
                    case 16:
                        if (c1003u2.q(abstractC0909b22, i14, i13, i15, i9)) {
                            long j13 = unsafe.getLong(abstractC0909b22, j4);
                            S8 = U1.S(i17 << 3);
                            C8 = U1.C((j13 >> 63) ^ (j13 + j13));
                            i10 = C8 + S8;
                            i16 += i10;
                            i14 += 3;
                            c1003u2 = this;
                        } else {
                            i14 += 3;
                            c1003u2 = this;
                        }
                    case 17:
                        if (c1003u2.q(abstractC0909b22, i14, i13, i15, i9)) {
                            N1 n12 = (N1) unsafe.getObject(abstractC0909b22, j4);
                            B2 B10 = c1003u2.B(i14);
                            int S17 = U1.S(i17 << 3);
                            i11 = S17 + S17;
                            a5 = n12.a(B10);
                            i10 = a5 + i11;
                            i16 += i10;
                            i14 += 3;
                            c1003u2 = this;
                        } else {
                            i14 += 3;
                            c1003u2 = this;
                        }
                    case 18:
                        i10 = C2.h((List) unsafe.getObject(abstractC0909b22, j4), i17);
                        i16 += i10;
                        i14 += 3;
                        c1003u2 = this;
                    case 19:
                        i10 = C2.g((List) unsafe.getObject(abstractC0909b22, j4), i17);
                        i16 += i10;
                        i14 += 3;
                        c1003u2 = this;
                    case 20:
                        List list = (List) unsafe.getObject(abstractC0909b22, j4);
                        Z1 z13 = C2.f15189a;
                        if (list.size() != 0) {
                            S9 = (U1.S(i17 << 3) * list.size()) + C2.j(list);
                            i16 += S9;
                            i14 += 3;
                            c1003u2 = this;
                        }
                        S9 = 0;
                        i16 += S9;
                        i14 += 3;
                        c1003u2 = this;
                    case 21:
                        List list2 = (List) unsafe.getObject(abstractC0909b22, j4);
                        Z1 z14 = C2.f15189a;
                        size = list2.size();
                        if (size != 0) {
                            n7 = C2.n(list2);
                            S10 = U1.S(i17 << 3);
                            S11 = (S10 * size) + n7;
                            i16 += S11;
                            i14 += 3;
                            c1003u2 = this;
                        }
                        S11 = 0;
                        i16 += S11;
                        i14 += 3;
                        c1003u2 = this;
                    case 22:
                        List list3 = (List) unsafe.getObject(abstractC0909b22, j4);
                        Z1 z15 = C2.f15189a;
                        size = list3.size();
                        if (size != 0) {
                            n7 = C2.i(list3);
                            S10 = U1.S(i17 << 3);
                            S11 = (S10 * size) + n7;
                            i16 += S11;
                            i14 += 3;
                            c1003u2 = this;
                        }
                        S11 = 0;
                        i16 += S11;
                        i14 += 3;
                        c1003u2 = this;
                    case 23:
                        i10 = C2.h((List) unsafe.getObject(abstractC0909b22, j4), i17);
                        i16 += i10;
                        i14 += 3;
                        c1003u2 = this;
                    case 24:
                        i10 = C2.g((List) unsafe.getObject(abstractC0909b22, j4), i17);
                        i16 += i10;
                        i14 += 3;
                        c1003u2 = this;
                    case 25:
                        List list4 = (List) unsafe.getObject(abstractC0909b22, j4);
                        Z1 z16 = C2.f15189a;
                        int size2 = list4.size();
                        if (size2 != 0) {
                            S9 = (U1.S(i17 << 3) + 1) * size2;
                            i16 += S9;
                            i14 += 3;
                            c1003u2 = this;
                        }
                        S9 = 0;
                        i16 += S9;
                        i14 += 3;
                        c1003u2 = this;
                    case 26:
                        List list5 = (List) unsafe.getObject(abstractC0909b22, j4);
                        Z1 z17 = C2.f15189a;
                        int size3 = list5.size();
                        if (size3 != 0) {
                            S11 = U1.S(i17 << 3) * size3;
                            for (int i23 = 0; i23 < size3; i23++) {
                                Object obj = list5.get(i23);
                                if (obj instanceof T1) {
                                    int d11 = ((T1) obj).d();
                                    S11 = AbstractC0953k1.g(d11, d11, S11);
                                } else {
                                    S11 = U1.R((String) obj) + S11;
                                }
                            }
                            i16 += S11;
                            i14 += 3;
                            c1003u2 = this;
                        }
                        S11 = 0;
                        i16 += S11;
                        i14 += 3;
                        c1003u2 = this;
                    case 27:
                        List list6 = (List) unsafe.getObject(abstractC0909b22, j4);
                        B2 B11 = c1003u2.B(i14);
                        Z1 z18 = C2.f15189a;
                        int size4 = list6.size();
                        if (size4 == 0) {
                            S12 = 0;
                        } else {
                            S12 = U1.S(i17 << 3) * size4;
                            for (int i24 = 0; i24 < size4; i24++) {
                                int a10 = ((N1) list6.get(i24)).a(B11);
                                S12 = AbstractC0953k1.g(a10, a10, S12);
                            }
                        }
                        i16 += S12;
                        i14 += 3;
                        c1003u2 = this;
                    case 28:
                        List list7 = (List) unsafe.getObject(abstractC0909b22, j4);
                        Z1 z19 = C2.f15189a;
                        int size5 = list7.size();
                        if (size5 != 0) {
                            S11 = U1.S(i17 << 3) * size5;
                            for (int i25 = 0; i25 < list7.size(); i25++) {
                                int d12 = ((T1) list7.get(i25)).d();
                                S11 = AbstractC0953k1.g(d12, d12, S11);
                            }
                            i16 += S11;
                            i14 += 3;
                            c1003u2 = this;
                        }
                        S11 = 0;
                        i16 += S11;
                        i14 += 3;
                        c1003u2 = this;
                    case 29:
                        List list8 = (List) unsafe.getObject(abstractC0909b22, j4);
                        Z1 z110 = C2.f15189a;
                        size = list8.size();
                        if (size != 0) {
                            n7 = C2.m(list8);
                            S10 = U1.S(i17 << 3);
                            S11 = (S10 * size) + n7;
                            i16 += S11;
                            i14 += 3;
                            c1003u2 = this;
                        }
                        S11 = 0;
                        i16 += S11;
                        i14 += 3;
                        c1003u2 = this;
                    case 30:
                        List list9 = (List) unsafe.getObject(abstractC0909b22, j4);
                        Z1 z111 = C2.f15189a;
                        size = list9.size();
                        if (size != 0) {
                            n7 = C2.f(list9);
                            S10 = U1.S(i17 << 3);
                            S11 = (S10 * size) + n7;
                            i16 += S11;
                            i14 += 3;
                            c1003u2 = this;
                        }
                        S11 = 0;
                        i16 += S11;
                        i14 += 3;
                        c1003u2 = this;
                    case 31:
                        i10 = C2.g((List) unsafe.getObject(abstractC0909b22, j4), i17);
                        i16 += i10;
                        i14 += 3;
                        c1003u2 = this;
                    case 32:
                        i10 = C2.h((List) unsafe.getObject(abstractC0909b22, j4), i17);
                        i16 += i10;
                        i14 += 3;
                        c1003u2 = this;
                    case 33:
                        List list10 = (List) unsafe.getObject(abstractC0909b22, j4);
                        Z1 z112 = C2.f15189a;
                        size = list10.size();
                        if (size != 0) {
                            n7 = C2.k(list10);
                            S10 = U1.S(i17 << 3);
                            S11 = (S10 * size) + n7;
                            i16 += S11;
                            i14 += 3;
                            c1003u2 = this;
                        }
                        S11 = 0;
                        i16 += S11;
                        i14 += 3;
                        c1003u2 = this;
                    case 34:
                        List list11 = (List) unsafe.getObject(abstractC0909b22, j4);
                        Z1 z113 = C2.f15189a;
                        size = list11.size();
                        if (size != 0) {
                            n7 = C2.l(list11);
                            S10 = U1.S(i17 << 3);
                            S11 = (S10 * size) + n7;
                            i16 += S11;
                            i14 += 3;
                            c1003u2 = this;
                        }
                        S11 = 0;
                        i16 += S11;
                        i14 += 3;
                        c1003u2 = this;
                    case 35:
                        List list12 = (List) unsafe.getObject(abstractC0909b22, j4);
                        Z1 z114 = C2.f15189a;
                        int size6 = list12.size() * 8;
                        if (size6 > 0) {
                            i16 = AbstractC0953k1.h(size6, U1.S(i17 << 3), size6, i16);
                        }
                        i14 += 3;
                        c1003u2 = this;
                    case 36:
                        List list13 = (List) unsafe.getObject(abstractC0909b22, j4);
                        Z1 z115 = C2.f15189a;
                        int size7 = list13.size() * 4;
                        if (size7 > 0) {
                            i16 = AbstractC0953k1.h(size7, U1.S(i17 << 3), size7, i16);
                        }
                        i14 += 3;
                        c1003u2 = this;
                    case 37:
                        int j14 = C2.j((List) unsafe.getObject(abstractC0909b22, j4));
                        if (j14 > 0) {
                            i16 = AbstractC0953k1.h(j14, U1.S(i17 << 3), j14, i16);
                        }
                        i14 += 3;
                        c1003u2 = this;
                    case 38:
                        int n9 = C2.n((List) unsafe.getObject(abstractC0909b22, j4));
                        if (n9 > 0) {
                            i16 = AbstractC0953k1.h(n9, U1.S(i17 << 3), n9, i16);
                        }
                        i14 += 3;
                        c1003u2 = this;
                    case 39:
                        int i26 = C2.i((List) unsafe.getObject(abstractC0909b22, j4));
                        if (i26 > 0) {
                            i16 = AbstractC0953k1.h(i26, U1.S(i17 << 3), i26, i16);
                        }
                        i14 += 3;
                        c1003u2 = this;
                    case 40:
                        List list14 = (List) unsafe.getObject(abstractC0909b22, j4);
                        Z1 z116 = C2.f15189a;
                        int size8 = list14.size() * 8;
                        if (size8 > 0) {
                            i16 = AbstractC0953k1.h(size8, U1.S(i17 << 3), size8, i16);
                        }
                        i14 += 3;
                        c1003u2 = this;
                    case 41:
                        List list15 = (List) unsafe.getObject(abstractC0909b22, j4);
                        Z1 z117 = C2.f15189a;
                        int size9 = list15.size() * 4;
                        if (size9 > 0) {
                            i16 = AbstractC0953k1.h(size9, U1.S(i17 << 3), size9, i16);
                        }
                        i14 += 3;
                        c1003u2 = this;
                    case 42:
                        List list16 = (List) unsafe.getObject(abstractC0909b22, j4);
                        Z1 z118 = C2.f15189a;
                        int size10 = list16.size();
                        if (size10 > 0) {
                            i16 = AbstractC0953k1.h(size10, U1.S(i17 << 3), size10, i16);
                        }
                        i14 += 3;
                        c1003u2 = this;
                    case 43:
                        int m9 = C2.m((List) unsafe.getObject(abstractC0909b22, j4));
                        if (m9 > 0) {
                            i16 = AbstractC0953k1.h(m9, U1.S(i17 << 3), m9, i16);
                        }
                        i14 += 3;
                        c1003u2 = this;
                    case 44:
                        int f9 = C2.f((List) unsafe.getObject(abstractC0909b22, j4));
                        if (f9 > 0) {
                            i16 = AbstractC0953k1.h(f9, U1.S(i17 << 3), f9, i16);
                        }
                        i14 += 3;
                        c1003u2 = this;
                    case 45:
                        List list17 = (List) unsafe.getObject(abstractC0909b22, j4);
                        Z1 z119 = C2.f15189a;
                        int size11 = list17.size() * 4;
                        if (size11 > 0) {
                            i16 = AbstractC0953k1.h(size11, U1.S(i17 << 3), size11, i16);
                        }
                        i14 += 3;
                        c1003u2 = this;
                    case 46:
                        List list18 = (List) unsafe.getObject(abstractC0909b22, j4);
                        Z1 z120 = C2.f15189a;
                        int size12 = list18.size() * 8;
                        if (size12 > 0) {
                            i16 = AbstractC0953k1.h(size12, U1.S(i17 << 3), size12, i16);
                        }
                        i14 += 3;
                        c1003u2 = this;
                    case 47:
                        int k5 = C2.k((List) unsafe.getObject(abstractC0909b22, j4));
                        if (k5 > 0) {
                            i16 = AbstractC0953k1.h(k5, U1.S(i17 << 3), k5, i16);
                        }
                        i14 += 3;
                        c1003u2 = this;
                    case 48:
                        int l9 = C2.l((List) unsafe.getObject(abstractC0909b22, j4));
                        if (l9 > 0) {
                            i16 = AbstractC0953k1.h(l9, U1.S(i17 << 3), l9, i16);
                        }
                        i14 += 3;
                        c1003u2 = this;
                    case 49:
                        List list19 = (List) unsafe.getObject(abstractC0909b22, j4);
                        B2 B12 = c1003u2.B(i14);
                        Z1 z121 = C2.f15189a;
                        int size13 = list19.size();
                        if (size13 == 0) {
                            i12 = 0;
                        } else {
                            i12 = 0;
                            for (int i27 = 0; i27 < size13; i27++) {
                                N1 n13 = (N1) list19.get(i27);
                                int S18 = U1.S(i17 << 3);
                                i12 += n13.a(B12) + S18 + S18;
                            }
                        }
                        i16 += i12;
                        i14 += 3;
                        c1003u2 = this;
                    case 50:
                        int i28 = i14 / 3;
                        C0984q2 c0984q2 = (C0984q2) unsafe.getObject(abstractC0909b22, j4);
                        if (c1003u2.f15609b[i28 + i28] == null) {
                            if (c0984q2.isEmpty()) {
                                continue;
                            } else {
                                Iterator it = c0984q2.entrySet().iterator();
                                if (it.hasNext()) {
                                    Map.Entry entry = (Map.Entry) it.next();
                                    entry.getKey();
                                    entry.getValue();
                                    throw null;
                                }
                            }
                            i14 += 3;
                            c1003u2 = this;
                        } else {
                            throw new ClassCastException();
                        }
                    case 51:
                        if (c1003u2.s(i17, i14, abstractC0909b22)) {
                            i16 = AbstractC0953k1.g(i17 << 3, 8, i16);
                        }
                        i14 += 3;
                        c1003u2 = this;
                    case 52:
                        if (c1003u2.s(i17, i14, abstractC0909b22)) {
                            i16 = AbstractC0953k1.g(i17 << 3, 4, i16);
                        }
                        i14 += 3;
                        c1003u2 = this;
                    case 53:
                        if (c1003u2.s(i17, i14, abstractC0909b22)) {
                            long z9 = z(j4, abstractC0909b22);
                            S13 = U1.S(i17 << 3);
                            C9 = U1.C(z9);
                            i16 += C9 + S13;
                            i14 += 3;
                            c1003u2 = this;
                        } else {
                            i14 += 3;
                            c1003u2 = this;
                        }
                    case 54:
                        if (c1003u2.s(i17, i14, abstractC0909b22)) {
                            long z10 = z(j4, abstractC0909b22);
                            S13 = U1.S(i17 << 3);
                            C9 = U1.C(z10);
                            i16 += C9 + S13;
                            i14 += 3;
                            c1003u2 = this;
                        } else {
                            i14 += 3;
                            c1003u2 = this;
                        }
                    case 55:
                        if (c1003u2.s(i17, i14, abstractC0909b22)) {
                            long v8 = v(j4, abstractC0909b22);
                            S13 = U1.S(i17 << 3);
                            C9 = U1.C(v8);
                            i16 += C9 + S13;
                            i14 += 3;
                            c1003u2 = this;
                        } else {
                            i14 += 3;
                            c1003u2 = this;
                        }
                    case 56:
                        if (c1003u2.s(i17, i14, abstractC0909b22)) {
                            i16 = AbstractC0953k1.g(i17 << 3, 8, i16);
                        }
                        i14 += 3;
                        c1003u2 = this;
                    case 57:
                        if (c1003u2.s(i17, i14, abstractC0909b22)) {
                            i16 = AbstractC0953k1.g(i17 << 3, 4, i16);
                        }
                        i14 += 3;
                        c1003u2 = this;
                    case 58:
                        if (c1003u2.s(i17, i14, abstractC0909b22)) {
                            i16 = AbstractC0953k1.g(i17 << 3, 1, i16);
                        }
                        i14 += 3;
                        c1003u2 = this;
                    case 59:
                        if (c1003u2.s(i17, i14, abstractC0909b22)) {
                            int i29 = i17 << 3;
                            Object object3 = unsafe.getObject(abstractC0909b22, j4);
                            if (object3 instanceof T1) {
                                int S19 = U1.S(i29);
                                int d13 = ((T1) object3).d();
                                i16 = AbstractC0953k1.h(d13, d13, S19, i16);
                            } else {
                                S13 = U1.S(i29);
                                C9 = U1.R((String) object3);
                                i16 += C9 + S13;
                            }
                        }
                        i14 += 3;
                        c1003u2 = this;
                    case 60:
                        if (c1003u2.s(i17, i14, abstractC0909b22)) {
                            Object object4 = unsafe.getObject(abstractC0909b22, j4);
                            B2 B13 = c1003u2.B(i14);
                            Z1 z122 = C2.f15189a;
                            int S20 = U1.S(i17 << 3);
                            int a11 = ((N1) object4).a(B13);
                            i16 = AbstractC0953k1.h(a11, a11, S20, i16);
                        }
                        i14 += 3;
                        c1003u2 = this;
                    case 61:
                        if (c1003u2.s(i17, i14, abstractC0909b22)) {
                            T1 t13 = (T1) unsafe.getObject(abstractC0909b22, j4);
                            int S21 = U1.S(i17 << 3);
                            int d14 = t13.d();
                            i16 = AbstractC0953k1.h(d14, d14, S21, i16);
                        }
                        i14 += 3;
                        c1003u2 = this;
                    case 62:
                        if (c1003u2.s(i17, i14, abstractC0909b22)) {
                            i16 = AbstractC0953k1.g(v(j4, abstractC0909b22), U1.S(i17 << 3), i16);
                        }
                        i14 += 3;
                        c1003u2 = this;
                    case 63:
                        if (c1003u2.s(i17, i14, abstractC0909b22)) {
                            long v9 = v(j4, abstractC0909b22);
                            S13 = U1.S(i17 << 3);
                            C9 = U1.C(v9);
                            i16 += C9 + S13;
                            i14 += 3;
                            c1003u2 = this;
                        } else {
                            i14 += 3;
                            c1003u2 = this;
                        }
                    case 64:
                        if (c1003u2.s(i17, i14, abstractC0909b22)) {
                            i16 = AbstractC0953k1.g(i17 << 3, 4, i16);
                        }
                        i14 += 3;
                        c1003u2 = this;
                    case 65:
                        if (c1003u2.s(i17, i14, abstractC0909b22)) {
                            i16 = AbstractC0953k1.g(i17 << 3, 8, i16);
                        }
                        i14 += 3;
                        c1003u2 = this;
                    case 66:
                        if (c1003u2.s(i17, i14, abstractC0909b22)) {
                            int v10 = v(j4, abstractC0909b22);
                            i16 = AbstractC0953k1.g((v10 >> 31) ^ (v10 + v10), U1.S(i17 << 3), i16);
                        }
                        i14 += 3;
                        c1003u2 = this;
                    case 67:
                        if (c1003u2.s(i17, i14, abstractC0909b22)) {
                            long z11 = z(j4, abstractC0909b22);
                            S13 = U1.S(i17 << 3);
                            C9 = U1.C((z11 >> 63) ^ (z11 + z11));
                            i16 += C9 + S13;
                            i14 += 3;
                            c1003u2 = this;
                        } else {
                            i14 += 3;
                            c1003u2 = this;
                        }
                    case 68:
                        if (c1003u2.s(i17, i14, abstractC0909b22)) {
                            N1 n14 = (N1) unsafe.getObject(abstractC0909b22, j4);
                            B2 B14 = c1003u2.B(i14);
                            int S22 = U1.S(i17 << 3);
                            i11 = S22 + S22;
                            a5 = n14.a(B14);
                            i10 = a5 + i11;
                            i16 += i10;
                            i14 += 3;
                            c1003u2 = this;
                        } else {
                            i14 += 3;
                            c1003u2 = this;
                        }
                    default:
                        i14 += 3;
                        c1003u2 = this;
                }
            } else {
                return abstractC0909b22.zzc.a() + i16;
            }
        }
    }

    @Override // com.google.android.gms.internal.measurement.B2
    public final void g(Object obj, byte[] bArr, int i9, int i10, Q1 q12) {
        t(obj, bArr, i9, i10, 0, q12);
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:5:0x0015. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:18:0x01d5 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x01c7 A[SYNTHETIC] */
    @Override // com.google.android.gms.internal.measurement.B2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean h(com.google.android.gms.internal.measurement.AbstractC0909b2 r8, com.google.android.gms.internal.measurement.AbstractC0909b2 r9) {
        /*
            Method dump skipped, instructions count: 614
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.C1003u2.h(com.google.android.gms.internal.measurement.b2, com.google.android.gms.internal.measurement.b2):boolean");
    }

    @Override // com.google.android.gms.internal.measurement.B2
    public final boolean i(Object obj) {
        int i9;
        int i10;
        int i11;
        int i12 = 0;
        int i13 = 0;
        int i14 = 1048575;
        while (i13 < this.f15614g) {
            int i15 = this.f15613f[i13];
            int[] iArr = this.f15608a;
            int i16 = iArr[i15];
            int y9 = y(i15);
            int i17 = iArr[i15 + 2];
            int i18 = i17 & 1048575;
            int i19 = 1 << (i17 >>> 20);
            if (i18 != i14) {
                if (i18 != 1048575) {
                    i12 = f15607k.getInt(obj, i18);
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
            if ((268435456 & y9) == 0 || q(obj, i10, i9, i11, i19)) {
                int x5 = x(y9);
                if (x5 != 9 && x5 != 17) {
                    if (x5 != 27) {
                        if (x5 != 60 && x5 != 68) {
                            if (x5 != 49) {
                                if (x5 == 50 && !((C0984q2) I2.g(y9 & 1048575, obj)).isEmpty()) {
                                    int i21 = i10 / 3;
                                    throw AbstractC0953k1.i(this.f15609b[i21 + i21]);
                                }
                            }
                        } else if (s(i16, i10, obj) && !B(i10).i(I2.g(y9 & 1048575, obj))) {
                        }
                        i13++;
                        i14 = i9;
                        i12 = i11;
                    }
                    List list = (List) I2.g(y9 & 1048575, obj);
                    if (list.isEmpty()) {
                        continue;
                    } else {
                        B2 B9 = B(i10);
                        for (int i22 = 0; i22 < list.size(); i22++) {
                            if (B9.i(list.get(i22))) {
                            }
                        }
                    }
                    i13++;
                    i14 = i9;
                    i12 = i11;
                } else {
                    if (q(obj, i10, i9, i11, i19) && !B(i10).i(I2.g(y9 & 1048575, obj))) {
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

    public final void j(Object obj, int i9, Object obj2) {
        if (!p(i9, obj2)) {
            return;
        }
        int y9 = y(i9) & 1048575;
        Unsafe unsafe = f15607k;
        long j4 = y9;
        Object object = unsafe.getObject(obj2, j4);
        if (object != null) {
            B2 B9 = B(i9);
            if (!p(i9, obj)) {
                if (!r(object)) {
                    unsafe.putObject(obj, j4, object);
                } else {
                    AbstractC0909b2 c3 = B9.c();
                    B9.b(c3, object);
                    unsafe.putObject(obj, j4, c3);
                }
                l(i9, obj);
                return;
            }
            Object object2 = unsafe.getObject(obj, j4);
            if (!r(object2)) {
                AbstractC0909b2 c9 = B9.c();
                B9.b(c9, object2);
                unsafe.putObject(obj, j4, c9);
                object2 = c9;
            }
            B9.b(object2, object);
            return;
        }
        throw new IllegalStateException("Source subfield " + this.f15608a[i9] + " is present but null: " + obj2.toString());
    }

    public final void k(Object obj, int i9, Object obj2) {
        int[] iArr = this.f15608a;
        int i10 = iArr[i9];
        if (!s(i10, i9, obj2)) {
            return;
        }
        int y9 = y(i9) & 1048575;
        Unsafe unsafe = f15607k;
        long j4 = y9;
        Object object = unsafe.getObject(obj2, j4);
        if (object != null) {
            B2 B9 = B(i9);
            if (!s(i10, i9, obj)) {
                if (!r(object)) {
                    unsafe.putObject(obj, j4, object);
                } else {
                    AbstractC0909b2 c3 = B9.c();
                    B9.b(c3, object);
                    unsafe.putObject(obj, j4, c3);
                }
                I2.i(i10, iArr[i9 + 2] & 1048575, obj);
                return;
            }
            Object object2 = unsafe.getObject(obj, j4);
            if (!r(object2)) {
                AbstractC0909b2 c9 = B9.c();
                B9.b(c9, object2);
                unsafe.putObject(obj, j4, c9);
                object2 = c9;
            }
            B9.b(object2, object);
            return;
        }
        throw new IllegalStateException("Source subfield " + iArr[i9] + " is present but null: " + obj2.toString());
    }

    public final void l(int i9, Object obj) {
        int i10 = this.f15608a[i9 + 2];
        long j4 = 1048575 & i10;
        if (j4 == 1048575) {
            return;
        }
        I2.i((1 << (i10 >>> 20)) | I2.d(j4, obj), j4, obj);
    }

    public final void m(Object obj, int i9, Object obj2) {
        f15607k.putObject(obj, y(i9) & 1048575, obj2);
        l(i9, obj);
    }

    public final void n(Object obj, int i9, Object obj2, int i10) {
        f15607k.putObject(obj, y(i10) & 1048575, obj2);
        I2.i(i9, this.f15608a[i10 + 2] & 1048575, obj);
    }

    public final boolean o(AbstractC0909b2 abstractC0909b2, AbstractC0909b2 abstractC0909b22, int i9) {
        if (p(i9, abstractC0909b2) == p(i9, abstractC0909b22)) {
            return true;
        }
        return false;
    }

    public final boolean p(int i9, Object obj) {
        int i10 = this.f15608a[i9 + 2];
        long j4 = i10 & 1048575;
        if (j4 == 1048575) {
            int y9 = y(i9);
            long j9 = y9 & 1048575;
            switch (x(y9)) {
                case 0:
                    if (Double.doubleToRawLongBits(I2.f15226c.a(j9, obj)) == 0) {
                        return false;
                    }
                    break;
                case 1:
                    if (Float.floatToRawIntBits(I2.f15226c.b(j9, obj)) == 0) {
                        return false;
                    }
                    break;
                case 2:
                    if (I2.e(j9, obj) == 0) {
                        return false;
                    }
                    break;
                case 3:
                    if (I2.e(j9, obj) == 0) {
                        return false;
                    }
                    break;
                case 4:
                    if (I2.d(j9, obj) == 0) {
                        return false;
                    }
                    break;
                case 5:
                    if (I2.e(j9, obj) == 0) {
                        return false;
                    }
                    break;
                case 6:
                    if (I2.d(j9, obj) == 0) {
                        return false;
                    }
                    break;
                case 7:
                    return I2.f15226c.g(j9, obj);
                case 8:
                    Object g9 = I2.g(j9, obj);
                    if (g9 instanceof String) {
                        if (((String) g9).isEmpty()) {
                            return false;
                        }
                    } else if (g9 instanceof T1) {
                        if (T1.f15297c.equals(g9)) {
                            return false;
                        }
                    } else {
                        throw new IllegalArgumentException();
                    }
                    break;
                case 9:
                    if (I2.g(j9, obj) == null) {
                        return false;
                    }
                    break;
                case R.styleable.GradientColor_android_endX /* 10 */:
                    if (T1.f15297c.equals(I2.g(j9, obj))) {
                        return false;
                    }
                    break;
                case R.styleable.GradientColor_android_endY /* 11 */:
                    if (I2.d(j9, obj) == 0) {
                        return false;
                    }
                    break;
                case 12:
                    if (I2.d(j9, obj) == 0) {
                        return false;
                    }
                    break;
                case 13:
                    if (I2.d(j9, obj) == 0) {
                        return false;
                    }
                    break;
                case 14:
                    if (I2.e(j9, obj) == 0) {
                        return false;
                    }
                    break;
                case 15:
                    if (I2.d(j9, obj) == 0) {
                        return false;
                    }
                    break;
                case 16:
                    if (I2.e(j9, obj) == 0) {
                        return false;
                    }
                    break;
                case 17:
                    if (I2.g(j9, obj) == null) {
                        return false;
                    }
                    break;
                default:
                    throw new IllegalArgumentException();
            }
        } else if (((1 << (i10 >>> 20)) & I2.d(j4, obj)) == 0) {
            return false;
        }
        return true;
    }

    public final boolean q(Object obj, int i9, int i10, int i11, int i12) {
        if (i10 == 1048575) {
            return p(i9, obj);
        }
        if ((i11 & i12) != 0) {
            return true;
        }
        return false;
    }

    public final boolean s(int i9, int i10, Object obj) {
        if (I2.d(this.f15608a[i10 + 2] & 1048575, obj) == i9) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:46:0x100b, code lost:
    
        r1 = r28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x1051, code lost:
    
        if (r11 == r2) goto L638;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x1053, code lost:
    
        r14.putInt(r0, r11, r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x1057, code lost:
    
        r1 = r36.f15614g;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x105d, code lost:
    
        if (r1 >= r36.f15615h) goto L766;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x105f, code lost:
    
        r2 = r36.f15613f[r1];
        r3 = r31[r2];
        r3 = com.google.android.gms.internal.measurement.I2.g(y(r2) & 1048575, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x1073, code lost:
    
        if (r3 != null) goto L644;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x107f, code lost:
    
        r1 = r1 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x107c, code lost:
    
        if (A(r2) != null) goto L765;
     */
    /* JADX WARN: Code restructure failed: missing block: B:598:0x0130, code lost:
    
        r19 = r10;
        r9 = r12;
        r6 = r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:599:0x0134, code lost:
    
        r8 = r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x1082, code lost:
    
        r3 = (com.google.android.gms.internal.measurement.C0984q2) r3;
        r2 = r2 / 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:607:0x0170, code lost:
    
        r5 = r2;
        r2 = r1;
        r1 = r5;
        r5 = r7;
        r7 = r3;
        r3 = r5;
        r5 = r40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x108f, code lost:
    
        throw com.google.android.gms.internal.measurement.AbstractC0953k1.i(r29[r2 + r2]);
     */
    /* JADX WARN: Code restructure failed: missing block: B:628:0x01f6, code lost:
    
        r18 = r15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x1092, code lost:
    
        if (r8 != 0) goto L656;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x1094, code lost:
    
        if (r7 != r5) goto L654;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x109c, code lost:
    
        throw new java.io.IOException("Failed to parse the message.");
     */
    /* JADX WARN: Code restructure failed: missing block: B:684:0x03b8, code lost:
    
        throw new java.io.IOException("Protocol message had invalid UTF-8.");
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x10a1, code lost:
    
        return r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x109d, code lost:
    
        if (r7 > r5) goto L659;
     */
    /* JADX WARN: Code restructure failed: missing block: B:702:0x0349, code lost:
    
        throw new java.io.IOException("Protocol message had invalid UTF-8.");
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x109f, code lost:
    
        if (r15 != r8) goto L659;
     */
    /* JADX WARN: Code restructure failed: missing block: B:727:0x02ee, code lost:
    
        throw new java.io.IOException("Protocol message had invalid UTF-8.");
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x10a7, code lost:
    
        throw new java.io.IOException("Failed to parse the message.");
     */
    /* JADX WARN: Code restructure failed: missing block: B:784:0x04bf, code lost:
    
        r5 = r40;
        r3 = r8;
        r6 = r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:785:0x04c3, code lost:
    
        r8 = r11;
        r9 = r12;
        r11 = r24;
        r16 = 1;
        r18 = 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:792:0x04ef, code lost:
    
        r5 = r40;
        r2 = r1;
        r3 = r8;
        r6 = r9;
        r1 = r10;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:474:0x0d40. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:588:0x00c0. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:86:0x062d. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0cb3 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:479:0x0fe2 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:483:0x0ffb A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:660:0x029d  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0c97 A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r5v63, types: [java.util.LinkedHashMap, com.google.android.gms.internal.measurement.q2] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int t(java.lang.Object r37, byte[] r38, int r39, int r40, int r41, com.google.android.gms.internal.measurement.Q1 r42) {
        /*
            Method dump skipped, instructions count: 4426
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.C1003u2.t(java.lang.Object, byte[], int, int, int, com.google.android.gms.internal.measurement.Q1):int");
    }

    public final int w(int i9, int i10) {
        int[] iArr = this.f15608a;
        int length = (iArr.length / 3) - 1;
        while (i10 <= length) {
            int i11 = (length + i10) >>> 1;
            int i12 = i11 * 3;
            int i13 = iArr[i12];
            if (i9 == i13) {
                return i12;
            }
            if (i9 < i13) {
                length = i11 - 1;
            } else {
                i10 = i11 + 1;
            }
        }
        return -1;
    }

    public final int y(int i9) {
        return this.f15608a[i9 + 1];
    }
}
