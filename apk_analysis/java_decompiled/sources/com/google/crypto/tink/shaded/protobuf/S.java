package com.google.crypto.tink.shaded.protobuf;

import F0.C0120y;
import co.notix.R;
import com.google.android.gms.internal.measurement.AbstractC0953k1;
import com.google.android.gms.internal.measurement.AbstractC1002u1;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.List;
import java.util.logging.Level;
import sun.misc.Unsafe;

/* loaded from: classes.dex */
public final class S implements b0 {

    /* renamed from: o, reason: collision with root package name */
    public static final int[] f16308o = new int[0];

    /* renamed from: p, reason: collision with root package name */
    public static final Unsafe f16309p = n0.j();

    /* renamed from: a, reason: collision with root package name */
    public final int[] f16310a;

    /* renamed from: b, reason: collision with root package name */
    public final Object[] f16311b;

    /* renamed from: c, reason: collision with root package name */
    public final int f16312c;

    /* renamed from: d, reason: collision with root package name */
    public final int f16313d;

    /* renamed from: e, reason: collision with root package name */
    public final AbstractC1030a f16314e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f16315f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f16316g;

    /* renamed from: h, reason: collision with root package name */
    public final int[] f16317h;

    /* renamed from: i, reason: collision with root package name */
    public final int f16318i;
    public final int j;

    /* renamed from: k, reason: collision with root package name */
    public final U f16319k;

    /* renamed from: l, reason: collision with root package name */
    public final H f16320l;

    /* renamed from: m, reason: collision with root package name */
    public final f0 f16321m;

    /* renamed from: n, reason: collision with root package name */
    public final M f16322n;

    public S(int[] iArr, Object[] objArr, int i9, int i10, AbstractC1030a abstractC1030a, boolean z9, int[] iArr2, int i11, int i12, U u9, H h7, f0 f0Var, C1044o c1044o, M m9) {
        this.f16310a = iArr;
        this.f16311b = objArr;
        this.f16312c = i9;
        this.f16313d = i10;
        this.f16315f = abstractC1030a instanceof AbstractC1050v;
        this.f16316g = z9;
        this.f16317h = iArr2;
        this.f16318i = i11;
        this.j = i12;
        this.f16319k = u9;
        this.f16320l = h7;
        this.f16321m = f0Var;
        this.f16314e = abstractC1030a;
        this.f16322n = m9;
    }

    public static S C(a0 a0Var, U u9, H h7, f0 f0Var, C1044o c1044o, M m9) {
        if (a0Var instanceof a0) {
            return D(a0Var, u9, h7, f0Var, c1044o, m9);
        }
        a0Var.getClass();
        throw new ClassCastException();
    }

    /* JADX WARN: Removed duplicated region for block: B:66:0x028d  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x02aa  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x02ad  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0292  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.google.crypto.tink.shaded.protobuf.S D(com.google.crypto.tink.shaded.protobuf.a0 r35, com.google.crypto.tink.shaded.protobuf.U r36, com.google.crypto.tink.shaded.protobuf.H r37, com.google.crypto.tink.shaded.protobuf.f0 r38, com.google.crypto.tink.shaded.protobuf.C1044o r39, com.google.crypto.tink.shaded.protobuf.M r40) {
        /*
            Method dump skipped, instructions count: 1021
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.crypto.tink.shaded.protobuf.S.D(com.google.crypto.tink.shaded.protobuf.a0, com.google.crypto.tink.shaded.protobuf.U, com.google.crypto.tink.shaded.protobuf.H, com.google.crypto.tink.shaded.protobuf.f0, com.google.crypto.tink.shaded.protobuf.o, com.google.crypto.tink.shaded.protobuf.M):com.google.crypto.tink.shaded.protobuf.S");
    }

    public static long E(int i9) {
        return i9 & 1048575;
    }

    public static int F(long j, Object obj) {
        return ((Integer) n0.f16387c.i(j, obj)).intValue();
    }

    public static long G(long j, Object obj) {
        return ((Long) n0.f16387c.i(j, obj)).longValue();
    }

    public static Field Q(Class cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (NoSuchFieldException unused) {
            Field[] declaredFields = cls.getDeclaredFields();
            for (Field field : declaredFields) {
                if (str.equals(field.getName())) {
                    return field;
                }
            }
            StringBuilder r5 = AbstractC0953k1.r("Field ", str, " for ");
            r5.append(cls.getName());
            r5.append(" not found. Known fields are ");
            r5.append(Arrays.toString(declaredFields));
            throw new RuntimeException(r5.toString());
        }
    }

    public static int W(int i9) {
        return (i9 & 267386880) >>> 20;
    }

    public static void Z(int i9, Object obj, K k5) {
        if (obj instanceof String) {
            String str = (String) obj;
            C1040k c1040k = (C1040k) k5.f16302a;
            c1040k.i0(i9, 2);
            int i10 = c1040k.j;
            try {
                int Z6 = C1040k.Z(str.length() * 3);
                int Z8 = C1040k.Z(str.length());
                byte[] bArr = c1040k.f16378h;
                int i11 = c1040k.f16379i;
                if (Z8 == Z6) {
                    int i12 = i10 + Z8;
                    c1040k.j = i12;
                    int v8 = q0.f16400a.v(i12, i11 - i12, str, bArr);
                    c1040k.j = i10;
                    c1040k.j0((v8 - i10) - Z8);
                    c1040k.j = v8;
                    return;
                }
                c1040k.j0(q0.b(str));
                int i13 = c1040k.j;
                c1040k.j = q0.f16400a.v(i13, i11 - i13, str, bArr);
                return;
            } catch (p0 e8) {
                c1040k.j = i10;
                C1040k.f16375k.log(Level.WARNING, "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) e8);
                byte[] bytes = str.getBytes(AbstractC1054z.f16405a);
                try {
                    c1040k.j0(bytes.length);
                    c1040k.c0(bytes, 0, bytes.length);
                    return;
                } catch (IndexOutOfBoundsException e9) {
                    throw new N3.M(e9);
                }
            } catch (IndexOutOfBoundsException e10) {
                throw new N3.M(e10);
            }
        }
        k5.a(i9, (AbstractC1037h) obj);
    }

    public static void l(Object obj) {
        if (t(obj)) {
        } else {
            throw new IllegalArgumentException(A0.a.k(obj, "Mutating immutable message: "));
        }
    }

    public static boolean t(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof AbstractC1050v) {
            return ((AbstractC1050v) obj).n();
        }
        return true;
    }

    public static List v(AbstractC1050v abstractC1050v, long j) {
        return (List) n0.f16387c.i(j, abstractC1050v);
    }

    public final Object A(int i9, Object obj) {
        b0 p9 = p(i9);
        long X8 = X(i9) & 1048575;
        if (!s(i9, obj)) {
            return p9.d();
        }
        Object object = f16309p.getObject(obj, X8);
        if (t(object)) {
            return object;
        }
        Object d9 = p9.d();
        if (object != null) {
            p9.a(d9, object);
        }
        return d9;
    }

    public final Object B(int i9, int i10, Object obj) {
        b0 p9 = p(i10);
        if (!u(i9, i10, obj)) {
            return p9.d();
        }
        Object object = f16309p.getObject(obj, X(i10) & 1048575);
        if (t(object)) {
            return object;
        }
        Object d9 = p9.d();
        if (object != null) {
            p9.a(d9, object);
        }
        return d9;
    }

    public final void H(int i9, long j, Object obj) {
        Unsafe unsafe = f16309p;
        Object o9 = o(i9);
        Object object = unsafe.getObject(obj, j);
        this.f16322n.getClass();
        if (!((L) object).f16304a) {
            L e8 = L.f16303b.e();
            M.b(e8, object);
            unsafe.putObject(obj, j, e8);
        }
        A0.a.x(o9);
        throw null;
    }

    public final int I(Object obj, byte[] bArr, int i9, int i10, int i11, int i12, int i13, int i14, int i15, long j, int i16, N3.Z z9) {
        int i17;
        Unsafe unsafe = f16309p;
        long j4 = this.f16310a[i16 + 2] & 1048575;
        boolean z10 = true;
        switch (i15) {
            case 51:
                if (i13 != 1) {
                    return i9;
                }
                unsafe.putObject(obj, j, Double.valueOf(Double.longBitsToDouble(AbstractC1002u1.q(i9, bArr))));
                int i18 = i9 + 8;
                unsafe.putInt(obj, j4, i12);
                return i18;
            case 52:
                if (i13 != 5) {
                    return i9;
                }
                unsafe.putObject(obj, j, Float.valueOf(Float.intBitsToFloat(AbstractC1002u1.p(i9, bArr))));
                int i19 = i9 + 4;
                unsafe.putInt(obj, j4, i12);
                return i19;
            case 53:
            case 54:
                if (i13 != 0) {
                    return i9;
                }
                int y9 = AbstractC1002u1.y(bArr, i9, z9);
                unsafe.putObject(obj, j, Long.valueOf(z9.f5033b));
                unsafe.putInt(obj, j4, i12);
                return y9;
            case 55:
            case 62:
                if (i13 != 0) {
                    return i9;
                }
                int w7 = AbstractC1002u1.w(bArr, i9, z9);
                unsafe.putObject(obj, j, Integer.valueOf(z9.f5032a));
                unsafe.putInt(obj, j4, i12);
                return w7;
            case 56:
            case 65:
                if (i13 != 1) {
                    return i9;
                }
                unsafe.putObject(obj, j, Long.valueOf(AbstractC1002u1.q(i9, bArr)));
                int i20 = i9 + 8;
                unsafe.putInt(obj, j4, i12);
                return i20;
            case 57:
            case 64:
                if (i13 != 5) {
                    return i9;
                }
                unsafe.putObject(obj, j, Integer.valueOf(AbstractC1002u1.p(i9, bArr)));
                int i21 = i9 + 4;
                unsafe.putInt(obj, j4, i12);
                return i21;
            case 58:
                if (i13 != 0) {
                    return i9;
                }
                int y10 = AbstractC1002u1.y(bArr, i9, z9);
                if (z9.f5033b == 0) {
                    z10 = false;
                }
                unsafe.putObject(obj, j, Boolean.valueOf(z10));
                unsafe.putInt(obj, j4, i12);
                return y10;
            case 59:
                if (i13 != 2) {
                    return i9;
                }
                int w9 = AbstractC1002u1.w(bArr, i9, z9);
                int i22 = z9.f5032a;
                if (i22 == 0) {
                    unsafe.putObject(obj, j, "");
                } else {
                    if ((i14 & 536870912) != 0) {
                        if (!q0.f16400a.L(bArr, w9, w9 + i22)) {
                            throw B.b();
                        }
                    }
                    unsafe.putObject(obj, j, new String(bArr, w9, i22, AbstractC1054z.f16405a));
                    w9 += i22;
                }
                unsafe.putInt(obj, j4, i12);
                return w9;
            case 60:
                i17 = i9;
                if (i13 == 2) {
                    Object B9 = B(i12, i16, obj);
                    int M7 = AbstractC1002u1.M(B9, p(i16), bArr, i17, i10, z9);
                    V(obj, i12, B9, i16);
                    return M7;
                }
                break;
            case 61:
                i17 = i9;
                if (i13 == 2) {
                    int o9 = AbstractC1002u1.o(bArr, i17, z9);
                    unsafe.putObject(obj, j, z9.f5034c);
                    unsafe.putInt(obj, j4, i12);
                    return o9;
                }
                break;
            case 63:
                i17 = i9;
                if (i13 == 0) {
                    int w10 = AbstractC1002u1.w(bArr, i17, z9);
                    int i23 = z9.f5032a;
                    n(i16);
                    unsafe.putObject(obj, j, Integer.valueOf(i23));
                    unsafe.putInt(obj, j4, i12);
                    return w10;
                }
                break;
            case 66:
                i17 = i9;
                if (i13 == 0) {
                    int w11 = AbstractC1002u1.w(bArr, i17, z9);
                    unsafe.putObject(obj, j, Integer.valueOf(W5.d.d(z9.f5032a)));
                    unsafe.putInt(obj, j4, i12);
                    return w11;
                }
                break;
            case 67:
                i17 = i9;
                if (i13 == 0) {
                    int y11 = AbstractC1002u1.y(bArr, i17, z9);
                    unsafe.putObject(obj, j, Long.valueOf(W5.d.e(z9.f5033b)));
                    unsafe.putInt(obj, j4, i12);
                    return y11;
                }
                break;
            case 68:
                if (i13 == 3) {
                    Object B10 = B(i12, i16, obj);
                    int J8 = ((S) p(i16)).J(B10, bArr, i9, i10, (i11 & (-8)) | 4, z9);
                    z9.f5034c = B10;
                    V(obj, i12, B10, i16);
                    return J8;
                }
            default:
                return i9;
        }
        return i17;
    }

    /* JADX WARN: Code restructure failed: missing block: B:114:0x0142, code lost:
    
        r4 = r9;
        r9 = r25 | r23;
        r3 = r7;
        r7 = r13;
        r13 = r4;
        r4 = r33;
        r5 = r2;
        r2 = r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:170:0x025a, code lost:
    
        r4 = r9;
        r9 = r25 | r23;
        r3 = r4;
        r4 = r13;
        r13 = r7;
        r7 = r4;
        r4 = r33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x046b, code lost:
    
        if (r8 == 1048575) goto L146;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x046d, code lost:
    
        r15.putInt(r10, r8, r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0471, code lost:
    
        r0 = r6.f16318i;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0475, code lost:
    
        if (r0 >= r6.j) goto L218;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0477, code lost:
    
        r6.m(r10, r6.f16317h[r0], r32);
        r0 = r0 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0483, code lost:
    
        if (r34 != 0) goto L155;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0485, code lost:
    
        if (r5 != r4) goto L153;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x048c, code lost:
    
        throw com.google.crypto.tink.shaded.protobuf.B.f();
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0491, code lost:
    
        return r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x048d, code lost:
    
        if (r5 > r4) goto L158;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x048f, code lost:
    
        if (r12 != r34) goto L158;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0496, code lost:
    
        throw com.google.crypto.tink.shaded.protobuf.B.f();
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:98:0x00a1. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int J(java.lang.Object r30, byte[] r31, int r32, int r33, int r34, N3.Z r35) {
        /*
            Method dump skipped, instructions count: 1216
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.crypto.tink.shaded.protobuf.S.J(java.lang.Object, byte[], int, int, int, N3.Z):int");
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:83:0x009b. Please report as an issue. */
    public final void K(Object obj, byte[] bArr, int i9, int i10, N3.Z z9) {
        int i11;
        int i12;
        Object obj2;
        int i13;
        Unsafe unsafe;
        int i14;
        int i15;
        int i16;
        int i17;
        char c3;
        Unsafe unsafe2;
        Object obj3;
        byte[] bArr2;
        int i18;
        byte[] bArr3;
        Object obj4;
        byte[] bArr4;
        Unsafe unsafe3;
        int i19;
        boolean z10;
        int t7;
        Object obj5;
        Object obj6;
        int i20;
        int i21;
        int i22;
        int i23;
        S s9 = this;
        Object obj7 = obj;
        byte[] bArr5 = bArr;
        int i24 = i10;
        N3.Z z11 = z9;
        l(obj7);
        Unsafe unsafe4 = f16309p;
        int i25 = i9;
        int i26 = -1;
        int i27 = 0;
        int i28 = 1048575;
        int i29 = 0;
        while (i25 < i24) {
            int i30 = i25 + 1;
            int i31 = bArr5[i25];
            if (i31 < 0) {
                i30 = AbstractC1002u1.v(i31, bArr5, i30, z11);
                i31 = z11.f5032a;
            }
            int i32 = i31 >>> 3;
            int i33 = i31 & 7;
            int i34 = s9.f16313d;
            int i35 = s9.f16312c;
            if (i32 > i26) {
                int i36 = i27 / 3;
                if (i32 >= i35 && i32 <= i34) {
                    i12 = s9.T(i32, i36);
                } else {
                    i12 = -1;
                }
                i11 = 0;
            } else if (i32 >= i35 && i32 <= i34) {
                i11 = 0;
                i12 = s9.T(i32, 0);
            } else {
                i11 = 0;
                i12 = -1;
            }
            int i37 = i12;
            if (i37 == -1) {
                int i38 = i30;
                obj2 = obj7;
                i13 = i38;
                unsafe = unsafe4;
                i14 = i31;
                i15 = i32;
                i16 = i11;
            } else {
                int[] iArr = s9.f16310a;
                int i39 = iArr[i37 + 1];
                int W6 = W(i39);
                int i40 = i31;
                long j = i39 & 1048575;
                if (W6 <= 17) {
                    int i41 = iArr[i37 + 2];
                    int i42 = 1 << (i41 >>> 20);
                    int i43 = i41 & 1048575;
                    if (i43 != i28) {
                        int i44 = 1048575;
                        i17 = i39;
                        if (i28 != 1048575) {
                            unsafe4.putInt(obj7, i28, i29);
                            i44 = 1048575;
                        }
                        if (i43 != i44) {
                            i29 = unsafe4.getInt(obj7, i43);
                        }
                        i28 = i43;
                    } else {
                        i17 = i39;
                    }
                    switch (W6) {
                        case 0:
                            unsafe2 = unsafe4;
                            bArr2 = bArr5;
                            c3 = 65535;
                            i18 = i30;
                            if (i33 != 1) {
                                obj3 = obj7;
                                i14 = i40;
                                obj2 = obj3;
                                i13 = i18;
                                unsafe = unsafe2;
                                i15 = i32;
                                i16 = i37;
                                break;
                            } else {
                                n0.f16387c.m(obj7, j, Double.longBitsToDouble(AbstractC1002u1.q(i18, bArr2)));
                                i25 = i18 + 8;
                                i29 |= i42;
                                obj7 = obj7;
                                bArr5 = bArr2;
                                i27 = i37;
                                i26 = i32;
                                unsafe4 = unsafe2;
                                i24 = i10;
                                break;
                            }
                        case 1:
                            unsafe2 = unsafe4;
                            bArr2 = bArr5;
                            c3 = 65535;
                            i18 = i30;
                            if (i33 != 5) {
                                obj3 = obj7;
                                i14 = i40;
                                obj2 = obj3;
                                i13 = i18;
                                unsafe = unsafe2;
                                i15 = i32;
                                i16 = i37;
                                break;
                            } else {
                                n0.f16387c.n(obj7, j, Float.intBitsToFloat(AbstractC1002u1.p(i18, bArr2)));
                                i25 = i18 + 4;
                                i29 |= i42;
                                bArr5 = bArr2;
                                i27 = i37;
                                i26 = i32;
                                unsafe4 = unsafe2;
                                i24 = i10;
                                break;
                            }
                        case 2:
                        case 3:
                            bArr3 = bArr5;
                            c3 = 65535;
                            i18 = i30;
                            if (i33 != 0) {
                                unsafe2 = unsafe4;
                                obj3 = obj7;
                                i14 = i40;
                                obj2 = obj3;
                                i13 = i18;
                                unsafe = unsafe2;
                                i15 = i32;
                                i16 = i37;
                                break;
                            } else {
                                int y9 = AbstractC1002u1.y(bArr3, i18, z11);
                                unsafe4.putLong(obj7, j, z11.f5033b);
                                i29 |= i42;
                                i25 = y9;
                                bArr5 = bArr3;
                                i27 = i37;
                                i26 = i32;
                                i24 = i10;
                                break;
                            }
                        case 4:
                        case R.styleable.GradientColor_android_endY /* 11 */:
                            bArr3 = bArr5;
                            c3 = 65535;
                            i18 = i30;
                            if (i33 == 0) {
                                int w7 = AbstractC1002u1.w(bArr3, i18, z11);
                                unsafe4.putInt(obj7, j, z11.f5032a);
                                i29 |= i42;
                                i25 = w7;
                                bArr5 = bArr3;
                                i27 = i37;
                                i26 = i32;
                                i24 = i10;
                                break;
                            } else {
                                unsafe2 = unsafe4;
                                obj3 = obj7;
                                i14 = i40;
                                obj2 = obj3;
                                i13 = i18;
                                unsafe = unsafe2;
                                i15 = i32;
                                i16 = i37;
                                break;
                            }
                        case 5:
                        case 14:
                            Object obj8 = obj7;
                            bArr3 = bArr5;
                            c3 = 65535;
                            Unsafe unsafe5 = unsafe4;
                            int i45 = i30;
                            if (i33 == 1) {
                                long q9 = AbstractC1002u1.q(i45, bArr3);
                                unsafe4 = unsafe5;
                                obj7 = obj8;
                                unsafe4.putLong(obj7, j, q9);
                                i25 = i45 + 8;
                                i29 |= i42;
                                bArr5 = bArr3;
                                i27 = i37;
                                i26 = i32;
                                i24 = i10;
                                break;
                            } else {
                                i18 = i45;
                                unsafe2 = unsafe5;
                                obj3 = obj8;
                                i14 = i40;
                                obj2 = obj3;
                                i13 = i18;
                                unsafe = unsafe2;
                                i15 = i32;
                                i16 = i37;
                                break;
                            }
                        case 6:
                        case 13:
                            obj4 = obj7;
                            bArr4 = bArr5;
                            c3 = 65535;
                            unsafe3 = unsafe4;
                            i19 = i30;
                            if (i33 != 5) {
                                Unsafe unsafe6 = unsafe3;
                                i18 = i19;
                                obj3 = obj4;
                                unsafe2 = unsafe6;
                                i14 = i40;
                                obj2 = obj3;
                                i13 = i18;
                                unsafe = unsafe2;
                                i15 = i32;
                                i16 = i37;
                                break;
                            } else {
                                unsafe3.putInt(obj4, j, AbstractC1002u1.p(i19, bArr4));
                                i25 = i19 + 4;
                                i29 |= i42;
                                unsafe4 = unsafe3;
                                bArr5 = bArr4;
                                i27 = i37;
                                i26 = i32;
                                obj7 = obj4;
                                i24 = i10;
                                break;
                            }
                        case 7:
                            obj4 = obj7;
                            bArr4 = bArr5;
                            c3 = 65535;
                            unsafe3 = unsafe4;
                            i19 = i30;
                            if (i33 != 0) {
                                Unsafe unsafe62 = unsafe3;
                                i18 = i19;
                                obj3 = obj4;
                                unsafe2 = unsafe62;
                                i14 = i40;
                                obj2 = obj3;
                                i13 = i18;
                                unsafe = unsafe2;
                                i15 = i32;
                                i16 = i37;
                                break;
                            } else {
                                i25 = AbstractC1002u1.y(bArr4, i19, z11);
                                if (z11.f5033b != 0) {
                                    z10 = true;
                                } else {
                                    z10 = false;
                                }
                                n0.f16387c.k(j, obj4, z10);
                                i29 |= i42;
                                unsafe4 = unsafe3;
                                bArr5 = bArr4;
                                i27 = i37;
                                i26 = i32;
                                obj7 = obj4;
                                i24 = i10;
                                break;
                            }
                        case 8:
                            obj4 = obj7;
                            bArr4 = bArr5;
                            c3 = 65535;
                            unsafe3 = unsafe4;
                            i19 = i30;
                            if (i33 == 2) {
                                if ((i17 & 536870912) == 0) {
                                    t7 = AbstractC1002u1.s(bArr4, i19, z11);
                                } else {
                                    t7 = AbstractC1002u1.t(bArr4, i19, z11);
                                }
                                i25 = t7;
                                unsafe3.putObject(obj4, j, z11.f5034c);
                                i29 |= i42;
                                unsafe4 = unsafe3;
                                bArr5 = bArr4;
                                i27 = i37;
                                i26 = i32;
                                obj7 = obj4;
                                i24 = i10;
                                break;
                            } else {
                                Unsafe unsafe622 = unsafe3;
                                i18 = i19;
                                obj3 = obj4;
                                unsafe2 = unsafe622;
                                i14 = i40;
                                obj2 = obj3;
                                i13 = i18;
                                unsafe = unsafe2;
                                i15 = i32;
                                i16 = i37;
                                break;
                            }
                        case 9:
                            obj4 = obj7;
                            c3 = 65535;
                            if (i33 == 2) {
                                Unsafe unsafe7 = unsafe4;
                                Object A2 = s9.A(i37, obj4);
                                byte[] bArr6 = bArr5;
                                unsafe3 = unsafe7;
                                int M7 = AbstractC1002u1.M(A2, s9.p(i37), bArr6, i30, i24, z11);
                                bArr4 = bArr6;
                                s9.U(obj4, i37, A2);
                                i29 |= i42;
                                i25 = M7;
                                unsafe4 = unsafe3;
                                bArr5 = bArr4;
                                i27 = i37;
                                i26 = i32;
                                obj7 = obj4;
                                i24 = i10;
                                break;
                            } else {
                                Unsafe unsafe8 = unsafe4;
                                obj3 = obj4;
                                unsafe2 = unsafe8;
                                i18 = i30;
                                i14 = i40;
                                obj2 = obj3;
                                i13 = i18;
                                unsafe = unsafe2;
                                i15 = i32;
                                i16 = i37;
                                break;
                            }
                        case R.styleable.GradientColor_android_endX /* 10 */:
                            obj5 = obj7;
                            c3 = 65535;
                            if (i33 != 2) {
                                Object obj9 = obj5;
                                unsafe2 = unsafe4;
                                obj3 = obj9;
                                i18 = i30;
                                i14 = i40;
                                obj2 = obj3;
                                i13 = i18;
                                unsafe = unsafe2;
                                i15 = i32;
                                i16 = i37;
                                break;
                            } else {
                                i25 = AbstractC1002u1.o(bArr5, i30, z11);
                                unsafe4.putObject(obj5, j, z11.f5034c);
                                i29 |= i42;
                                i27 = i37;
                                i26 = i32;
                                obj7 = obj5;
                                break;
                            }
                        case 12:
                            obj5 = obj7;
                            c3 = 65535;
                            if (i33 != 0) {
                                Object obj92 = obj5;
                                unsafe2 = unsafe4;
                                obj3 = obj92;
                                i18 = i30;
                                i14 = i40;
                                obj2 = obj3;
                                i13 = i18;
                                unsafe = unsafe2;
                                i15 = i32;
                                i16 = i37;
                                break;
                            } else {
                                i25 = AbstractC1002u1.w(bArr5, i30, z11);
                                unsafe4.putInt(obj5, j, z11.f5032a);
                                i29 |= i42;
                                i27 = i37;
                                i26 = i32;
                                obj7 = obj5;
                                break;
                            }
                        case 15:
                            obj5 = obj7;
                            c3 = 65535;
                            if (i33 == 0) {
                                i25 = AbstractC1002u1.w(bArr5, i30, z11);
                                unsafe4.putInt(obj5, j, W5.d.d(z11.f5032a));
                                i29 |= i42;
                                i27 = i37;
                                i26 = i32;
                                obj7 = obj5;
                                break;
                            } else {
                                Object obj922 = obj5;
                                unsafe2 = unsafe4;
                                obj3 = obj922;
                                i18 = i30;
                                i14 = i40;
                                obj2 = obj3;
                                i13 = i18;
                                unsafe = unsafe2;
                                i15 = i32;
                                i16 = i37;
                                break;
                            }
                        case 16:
                            if (i33 == 0) {
                                int y10 = AbstractC1002u1.y(bArr5, i30, z11);
                                unsafe4.putLong(obj7, j, W5.d.e(z11.f5033b));
                                i29 |= i42;
                                i27 = i37;
                                i26 = i32;
                                i25 = y10;
                                break;
                            } else {
                                c3 = 65535;
                                unsafe2 = unsafe4;
                                obj3 = obj7;
                                i18 = i30;
                                i14 = i40;
                                obj2 = obj3;
                                i13 = i18;
                                unsafe = unsafe2;
                                i15 = i32;
                                i16 = i37;
                                break;
                            }
                        default:
                            unsafe2 = unsafe4;
                            obj3 = obj7;
                            c3 = 65535;
                            i18 = i30;
                            i14 = i40;
                            obj2 = obj3;
                            i13 = i18;
                            unsafe = unsafe2;
                            i15 = i32;
                            i16 = i37;
                            break;
                    }
                } else {
                    Object obj10 = obj7;
                    Unsafe unsafe9 = unsafe4;
                    byte[] bArr7 = bArr5;
                    int i46 = i30;
                    if (W6 == 27) {
                        if (i33 == 2) {
                            InterfaceC1053y interfaceC1053y = (InterfaceC1053y) unsafe9.getObject(obj10, j);
                            if (!((AbstractC1031b) interfaceC1053y).f16338a) {
                                int size = interfaceC1053y.size();
                                if (size == 0) {
                                    i23 = 10;
                                } else {
                                    i23 = size * 2;
                                }
                                interfaceC1053y = interfaceC1053y.h(i23);
                                unsafe9.putObject(obj10, j, interfaceC1053y);
                            }
                            int r5 = AbstractC1002u1.r(s9.p(i37), i40, bArr7, i46, i10, interfaceC1053y, z11);
                            obj7 = obj;
                            bArr5 = bArr;
                            z11 = z9;
                            i25 = r5;
                            unsafe4 = unsafe9;
                            i27 = i37;
                            i26 = i32;
                            i24 = i10;
                        } else {
                            obj6 = obj;
                            i14 = i40;
                            unsafe = unsafe9;
                            i20 = i46;
                            i21 = i28;
                            i22 = i29;
                            i15 = i32;
                            i16 = i37;
                        }
                    } else {
                        i14 = i40;
                        i20 = i46;
                        if (W6 <= 49) {
                            unsafe = unsafe9;
                            i15 = i32;
                            int i47 = i28;
                            int i48 = i29;
                            int L8 = s9.L(obj, bArr, i20, i10, i14, i33, i37, i39, W6, j, z9);
                            i16 = i37;
                            if (L8 != i20) {
                                bArr5 = bArr;
                                i24 = i10;
                                z11 = z9;
                                obj7 = obj;
                                i25 = L8;
                                i27 = i16;
                                i28 = i47;
                                i29 = i48;
                                i26 = i15;
                                unsafe4 = unsafe;
                            } else {
                                i13 = L8;
                                i28 = i47;
                                i29 = i48;
                                obj2 = obj;
                            }
                        } else {
                            unsafe = unsafe9;
                            i21 = i28;
                            i15 = i32;
                            obj6 = obj;
                            i16 = i37;
                            i22 = i29;
                            if (W6 == 50) {
                                if (i33 == 2) {
                                    s9.H(i16, j, obj6);
                                    throw null;
                                }
                            } else {
                                int I4 = s9.I(obj6, bArr, i20, i10, i14, i15, i33, i39, W6, j, i16, z9);
                                obj2 = obj6;
                                if (I4 != i20) {
                                    s9 = this;
                                    i24 = i10;
                                    z11 = z9;
                                    obj7 = obj2;
                                    i25 = I4;
                                    i27 = i16;
                                    i28 = i21;
                                    i29 = i22;
                                    i26 = i15;
                                    unsafe4 = unsafe;
                                    bArr5 = bArr;
                                } else {
                                    i13 = I4;
                                    i28 = i21;
                                    i29 = i22;
                                }
                            }
                        }
                    }
                    i13 = i20;
                    obj2 = obj6;
                    i28 = i21;
                    i29 = i22;
                }
            }
            AbstractC1050v abstractC1050v = (AbstractC1050v) obj2;
            e0 e0Var = abstractC1050v.unknownFields;
            if (e0Var == e0.f16346f) {
                e0Var = e0.c();
                abstractC1050v.unknownFields = e0Var;
            }
            int u9 = AbstractC1002u1.u(i14, bArr, i13, i10, e0Var, z9);
            bArr5 = bArr;
            z11 = z9;
            i24 = i10;
            obj7 = obj2;
            i27 = i16;
            i26 = i15;
            unsafe4 = unsafe;
            i25 = u9;
            s9 = this;
        }
        Unsafe unsafe10 = unsafe4;
        Object obj11 = obj7;
        int i49 = i24;
        int i50 = i28;
        int i51 = i29;
        if (i50 != 1048575) {
            unsafe10.putInt(obj11, i50, i51);
        }
        if (i25 == i49) {
        } else {
            throw B.f();
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:9:0x002e. Please report as an issue. */
    public final int L(Object obj, byte[] bArr, int i9, int i10, int i11, int i12, int i13, long j, int i14, long j4, N3.Z z9) {
        int i15;
        int i16;
        int i17;
        int i18;
        int x5;
        Unsafe unsafe = f16309p;
        InterfaceC1053y interfaceC1053y = (InterfaceC1053y) unsafe.getObject(obj, j4);
        if (!((AbstractC1031b) interfaceC1053y).f16338a) {
            int size = interfaceC1053y.size();
            interfaceC1053y = interfaceC1053y.h(size == 0 ? 10 : size * 2);
            unsafe.putObject(obj, j4, interfaceC1053y);
        }
        InterfaceC1053y interfaceC1053y2 = interfaceC1053y;
        switch (i14) {
            case 18:
            case 35:
                int i19 = i9;
                if (i12 == 2) {
                    AbstractC1041l abstractC1041l = (AbstractC1041l) interfaceC1053y2;
                    int w7 = AbstractC1002u1.w(bArr, i19, z9);
                    int i20 = z9.f5032a + w7;
                    while (w7 < i20) {
                        abstractC1041l.c(Double.longBitsToDouble(AbstractC1002u1.q(w7, bArr)));
                        w7 += 8;
                    }
                    if (w7 == i20) {
                        return w7;
                    }
                    throw B.g();
                }
                if (i12 != 1) {
                    return i19;
                }
                AbstractC1041l abstractC1041l2 = (AbstractC1041l) interfaceC1053y2;
                abstractC1041l2.c(Double.longBitsToDouble(AbstractC1002u1.q(i19, bArr)));
                while (true) {
                    i15 = i19 + 8;
                    if (i15 < i10) {
                        i19 = AbstractC1002u1.w(bArr, i15, z9);
                        if (i11 == z9.f5032a) {
                            abstractC1041l2.c(Double.longBitsToDouble(AbstractC1002u1.q(i19, bArr)));
                        }
                    }
                }
                return i15;
            case 19:
            case 36:
                int i21 = i9;
                if (i12 == 2) {
                    r rVar = (r) interfaceC1053y2;
                    int w9 = AbstractC1002u1.w(bArr, i21, z9);
                    int i22 = z9.f5032a + w9;
                    while (w9 < i22) {
                        rVar.c(Float.intBitsToFloat(AbstractC1002u1.p(w9, bArr)));
                        w9 += 4;
                    }
                    if (w9 == i22) {
                        return w9;
                    }
                    throw B.g();
                }
                if (i12 != 5) {
                    return i21;
                }
                r rVar2 = (r) interfaceC1053y2;
                rVar2.c(Float.intBitsToFloat(AbstractC1002u1.p(i21, bArr)));
                while (true) {
                    i16 = i21 + 4;
                    if (i16 < i10) {
                        i21 = AbstractC1002u1.w(bArr, i16, z9);
                        if (i11 == z9.f5032a) {
                            rVar2.c(Float.intBitsToFloat(AbstractC1002u1.p(i21, bArr)));
                        }
                    }
                }
                return i16;
            case 20:
            case 21:
            case 37:
            case 38:
                if (i12 == 2) {
                    I i23 = (I) interfaceC1053y2;
                    int w10 = AbstractC1002u1.w(bArr, i9, z9);
                    int i24 = z9.f5032a + w10;
                    while (w10 < i24) {
                        w10 = AbstractC1002u1.y(bArr, w10, z9);
                        i23.c(z9.f5033b);
                    }
                    if (w10 == i24) {
                        return w10;
                    }
                    throw B.g();
                }
                if (i12 != 0) {
                    return i9;
                }
                I i25 = (I) interfaceC1053y2;
                int y9 = AbstractC1002u1.y(bArr, i9, z9);
                i25.c(z9.f5033b);
                while (y9 < i10) {
                    int w11 = AbstractC1002u1.w(bArr, y9, z9);
                    if (i11 != z9.f5032a) {
                        return y9;
                    }
                    y9 = AbstractC1002u1.y(bArr, w11, z9);
                    i25.c(z9.f5033b);
                }
                return y9;
            case 22:
            case 29:
            case 39:
            case 43:
                i17 = i9;
                if (i12 != 2) {
                    if (i12 == 0) {
                        return AbstractC1002u1.x(i11, bArr, i17, i10, interfaceC1053y2, z9);
                    }
                    return i17;
                }
                AbstractC1051w abstractC1051w = (AbstractC1051w) interfaceC1053y2;
                int w12 = AbstractC1002u1.w(bArr, i17, z9);
                int i26 = z9.f5032a + w12;
                while (w12 < i26) {
                    w12 = AbstractC1002u1.w(bArr, w12, z9);
                    abstractC1051w.c(z9.f5032a);
                }
                if (w12 == i26) {
                    return w12;
                }
                throw B.g();
            case 23:
            case 32:
            case 40:
            case 46:
                i17 = i9;
                if (i12 == 2) {
                    I i27 = (I) interfaceC1053y2;
                    int w13 = AbstractC1002u1.w(bArr, i17, z9);
                    int i28 = z9.f5032a + w13;
                    while (w13 < i28) {
                        i27.c(AbstractC1002u1.q(w13, bArr));
                        w13 += 8;
                    }
                    if (w13 == i28) {
                        return w13;
                    }
                    throw B.g();
                }
                if (i12 == 1) {
                    I i29 = (I) interfaceC1053y2;
                    i29.c(AbstractC1002u1.q(i17, bArr));
                    int i30 = i17 + 8;
                    while (i30 < i10) {
                        int w14 = AbstractC1002u1.w(bArr, i30, z9);
                        if (i11 != z9.f5032a) {
                            return i30;
                        }
                        i29.c(AbstractC1002u1.q(w14, bArr));
                        i30 = w14 + 8;
                    }
                    return i30;
                }
                return i17;
            case 24:
            case 31:
            case 41:
            case 45:
                i17 = i9;
                if (i12 == 2) {
                    AbstractC1051w abstractC1051w2 = (AbstractC1051w) interfaceC1053y2;
                    int w15 = AbstractC1002u1.w(bArr, i17, z9);
                    int i31 = z9.f5032a + w15;
                    while (w15 < i31) {
                        abstractC1051w2.c(AbstractC1002u1.p(w15, bArr));
                        w15 += 4;
                    }
                    if (w15 == i31) {
                        return w15;
                    }
                    throw B.g();
                }
                if (i12 == 5) {
                    AbstractC1051w abstractC1051w3 = (AbstractC1051w) interfaceC1053y2;
                    abstractC1051w3.c(AbstractC1002u1.p(i17, bArr));
                    int i32 = i17 + 4;
                    while (i32 < i10) {
                        int w16 = AbstractC1002u1.w(bArr, i32, z9);
                        if (i11 != z9.f5032a) {
                            return i32;
                        }
                        abstractC1051w3.c(AbstractC1002u1.p(w16, bArr));
                        i32 = w16 + 4;
                    }
                    return i32;
                }
                return i17;
            case 25:
            case 42:
                i17 = i9;
                if (i12 == 2) {
                    AbstractC1033d abstractC1033d = (AbstractC1033d) interfaceC1053y2;
                    int w17 = AbstractC1002u1.w(bArr, i17, z9);
                    int i33 = z9.f5032a + w17;
                    while (w17 < i33) {
                        w17 = AbstractC1002u1.y(bArr, w17, z9);
                        abstractC1033d.c(z9.f5033b != 0);
                    }
                    if (w17 == i33) {
                        return w17;
                    }
                    throw B.g();
                }
                if (i12 == 0) {
                    AbstractC1033d abstractC1033d2 = (AbstractC1033d) interfaceC1053y2;
                    int y10 = AbstractC1002u1.y(bArr, i17, z9);
                    abstractC1033d2.c(z9.f5033b != 0);
                    while (y10 < i10) {
                        int w18 = AbstractC1002u1.w(bArr, y10, z9);
                        if (i11 != z9.f5032a) {
                            return y10;
                        }
                        y10 = AbstractC1002u1.y(bArr, w18, z9);
                        abstractC1033d2.c(z9.f5033b != 0);
                    }
                    return y10;
                }
                return i17;
            case 26:
                i17 = i9;
                if (i12 == 2) {
                    if ((j & 536870912) == 0) {
                        int w19 = AbstractC1002u1.w(bArr, i17, z9);
                        int i34 = z9.f5032a;
                        if (i34 < 0) {
                            throw B.e();
                        }
                        if (i34 == 0) {
                            interfaceC1053y2.add("");
                        } else {
                            interfaceC1053y2.add(new String(bArr, w19, i34, AbstractC1054z.f16405a));
                            w19 += i34;
                        }
                        while (w19 < i10) {
                            int w20 = AbstractC1002u1.w(bArr, w19, z9);
                            if (i11 != z9.f5032a) {
                                return w19;
                            }
                            w19 = AbstractC1002u1.w(bArr, w20, z9);
                            int i35 = z9.f5032a;
                            if (i35 < 0) {
                                throw B.e();
                            }
                            if (i35 == 0) {
                                interfaceC1053y2.add("");
                            } else {
                                interfaceC1053y2.add(new String(bArr, w19, i35, AbstractC1054z.f16405a));
                                w19 += i35;
                            }
                        }
                        return w19;
                    }
                    int w21 = AbstractC1002u1.w(bArr, i17, z9);
                    int i36 = z9.f5032a;
                    if (i36 < 0) {
                        throw B.e();
                    }
                    if (i36 == 0) {
                        interfaceC1053y2.add("");
                    } else {
                        int i37 = w21 + i36;
                        if (q0.f16400a.L(bArr, w21, i37)) {
                            interfaceC1053y2.add(new String(bArr, w21, i36, AbstractC1054z.f16405a));
                            w21 = i37;
                        } else {
                            throw B.b();
                        }
                    }
                    while (w21 < i10) {
                        int w22 = AbstractC1002u1.w(bArr, w21, z9);
                        if (i11 != z9.f5032a) {
                            return w21;
                        }
                        w21 = AbstractC1002u1.w(bArr, w22, z9);
                        int i38 = z9.f5032a;
                        if (i38 < 0) {
                            throw B.e();
                        }
                        if (i38 == 0) {
                            interfaceC1053y2.add("");
                        } else {
                            int i39 = w21 + i38;
                            if (q0.f16400a.L(bArr, w21, i39)) {
                                interfaceC1053y2.add(new String(bArr, w21, i38, AbstractC1054z.f16405a));
                                w21 = i39;
                            } else {
                                throw B.b();
                            }
                        }
                    }
                    return w21;
                }
                return i17;
            case 27:
                return i12 == 2 ? AbstractC1002u1.r(p(i13), i11, bArr, i9, i10, interfaceC1053y2, z9) : i9;
            case 28:
                if (i12 != 2) {
                    return i9;
                }
                int w23 = AbstractC1002u1.w(bArr, i9, z9);
                int i40 = z9.f5032a;
                if (i40 >= 0) {
                    if (i40 > bArr.length - w23) {
                        throw B.g();
                    }
                    if (i40 == 0) {
                        interfaceC1053y2.add(AbstractC1037h.f16356b);
                    } else {
                        interfaceC1053y2.add(AbstractC1037h.d(bArr, w23, i40));
                        w23 += i40;
                    }
                    while (w23 < i10) {
                        int w24 = AbstractC1002u1.w(bArr, w23, z9);
                        if (i11 != z9.f5032a) {
                            return w23;
                        }
                        w23 = AbstractC1002u1.w(bArr, w24, z9);
                        int i41 = z9.f5032a;
                        if (i41 >= 0) {
                            if (i41 > bArr.length - w23) {
                                throw B.g();
                            }
                            if (i41 == 0) {
                                interfaceC1053y2.add(AbstractC1037h.f16356b);
                            } else {
                                interfaceC1053y2.add(AbstractC1037h.d(bArr, w23, i41));
                                w23 += i41;
                            }
                        } else {
                            throw B.e();
                        }
                    }
                    return w23;
                }
                throw B.e();
            case 30:
            case 44:
                i18 = i9;
                if (i12 != 2) {
                    if (i12 == 0) {
                        x5 = AbstractC1002u1.x(i11, bArr, i18, i10, interfaceC1053y2, z9);
                    }
                    return i18;
                }
                AbstractC1051w abstractC1051w4 = (AbstractC1051w) interfaceC1053y2;
                x5 = AbstractC1002u1.w(bArr, i18, z9);
                int i42 = z9.f5032a + x5;
                while (x5 < i42) {
                    x5 = AbstractC1002u1.w(bArr, x5, z9);
                    abstractC1051w4.c(z9.f5032a);
                }
                if (x5 != i42) {
                    throw B.g();
                }
                n(i13);
                Class cls = c0.f16341a;
                return x5;
            case 33:
            case 47:
                i18 = i9;
                if (i12 == 2) {
                    AbstractC1051w abstractC1051w5 = (AbstractC1051w) interfaceC1053y2;
                    int w25 = AbstractC1002u1.w(bArr, i18, z9);
                    int i43 = z9.f5032a + w25;
                    while (w25 < i43) {
                        w25 = AbstractC1002u1.w(bArr, w25, z9);
                        abstractC1051w5.c(W5.d.d(z9.f5032a));
                    }
                    if (w25 == i43) {
                        return w25;
                    }
                    throw B.g();
                }
                if (i12 == 0) {
                    AbstractC1051w abstractC1051w6 = (AbstractC1051w) interfaceC1053y2;
                    int w26 = AbstractC1002u1.w(bArr, i18, z9);
                    abstractC1051w6.c(W5.d.d(z9.f5032a));
                    while (w26 < i10) {
                        int w27 = AbstractC1002u1.w(bArr, w26, z9);
                        if (i11 != z9.f5032a) {
                            return w26;
                        }
                        w26 = AbstractC1002u1.w(bArr, w27, z9);
                        abstractC1051w6.c(W5.d.d(z9.f5032a));
                    }
                    return w26;
                }
                return i18;
            case 34:
            case 48:
                i18 = i9;
                if (i12 == 2) {
                    I i44 = (I) interfaceC1053y2;
                    int w28 = AbstractC1002u1.w(bArr, i18, z9);
                    int i45 = z9.f5032a + w28;
                    while (w28 < i45) {
                        w28 = AbstractC1002u1.y(bArr, w28, z9);
                        i44.c(W5.d.e(z9.f5033b));
                    }
                    if (w28 == i45) {
                        return w28;
                    }
                    throw B.g();
                }
                if (i12 == 0) {
                    I i46 = (I) interfaceC1053y2;
                    int y11 = AbstractC1002u1.y(bArr, i18, z9);
                    i46.c(W5.d.e(z9.f5033b));
                    while (y11 < i10) {
                        int w29 = AbstractC1002u1.w(bArr, y11, z9);
                        if (i11 != z9.f5032a) {
                            return y11;
                        }
                        y11 = AbstractC1002u1.y(bArr, w29, z9);
                        i46.c(W5.d.e(z9.f5033b));
                    }
                    return y11;
                }
                return i18;
            case 49:
                if (i12 == 3) {
                    b0 p9 = p(i13);
                    int i47 = (i11 & (-8)) | 4;
                    Object d9 = p9.d();
                    S s9 = (S) p9;
                    int J8 = s9.J(d9, bArr, i9, i10, i47, z9);
                    S s10 = s9;
                    int i48 = i10;
                    int i49 = i47;
                    N3.Z z10 = z9;
                    z10.f5034c = d9;
                    p9.b(d9);
                    z10.f5034c = d9;
                    interfaceC1053y2.add(d9);
                    while (J8 < i48) {
                        int w30 = AbstractC1002u1.w(bArr, J8, z10);
                        if (i11 != z10.f5032a) {
                            return J8;
                        }
                        Object d10 = p9.d();
                        int i50 = i48;
                        N3.Z z11 = z10;
                        int i51 = i49;
                        S s11 = s10;
                        J8 = s11.J(d10, bArr, w30, i50, i51, z11);
                        s10 = s11;
                        i48 = i50;
                        i49 = i51;
                        z10 = z11;
                        z10.f5034c = d10;
                        p9.b(d10);
                        z10.f5034c = d10;
                        interfaceC1053y2.add(d10);
                    }
                    return J8;
                }
            default:
                return i9;
        }
    }

    public final void M(Object obj, long j, C0120y c0120y, b0 b0Var, C1043n c1043n) {
        int C8;
        List c3 = this.f16320l.c(j, obj);
        int i9 = c0120y.f2290b;
        if ((i9 & 7) != 3) {
            throw B.c();
        }
        do {
            Object d9 = b0Var.d();
            c0120y.g(d9, b0Var, c1043n);
            b0Var.b(d9);
            c3.add(d9);
            W5.d dVar = (W5.d) c0120y.f2293e;
            if (!dVar.g() && c0120y.f2292d == 0) {
                C8 = dVar.C();
            } else {
                return;
            }
        } while (C8 == i9);
        c0120y.f2292d = C8;
    }

    public final void N(Object obj, int i9, C0120y c0120y, b0 b0Var, C1043n c1043n) {
        int C8;
        List c3 = this.f16320l.c(i9 & 1048575, obj);
        int i10 = c0120y.f2290b;
        if ((i10 & 7) != 2) {
            throw B.c();
        }
        do {
            Object d9 = b0Var.d();
            c0120y.i(d9, b0Var, c1043n);
            b0Var.b(d9);
            c3.add(d9);
            W5.d dVar = (W5.d) c0120y.f2293e;
            if (!dVar.g() && c0120y.f2292d == 0) {
                C8 = dVar.C();
            } else {
                return;
            }
        } while (C8 == i10);
        c0120y.f2292d = C8;
    }

    public final void O(int i9, C0120y c0120y, Object obj) {
        boolean z9;
        if ((536870912 & i9) != 0) {
            z9 = true;
        } else {
            z9 = false;
        }
        if (z9) {
            c0120y.T(2);
            n0.p(obj, i9 & 1048575, ((W5.d) c0120y.f2293e).B());
        } else if (this.f16315f) {
            c0120y.T(2);
            n0.p(obj, i9 & 1048575, ((W5.d) c0120y.f2293e).A());
        } else {
            n0.p(obj, i9 & 1048575, c0120y.m());
        }
    }

    public final void P(int i9, C0120y c0120y, Object obj) {
        boolean z9;
        if ((536870912 & i9) != 0) {
            z9 = true;
        } else {
            z9 = false;
        }
        H h7 = this.f16320l;
        if (z9) {
            c0120y.N(h7.c(i9 & 1048575, obj), true);
        } else {
            c0120y.N(h7.c(i9 & 1048575, obj), false);
        }
    }

    public final void R(int i9, Object obj) {
        int i10 = this.f16310a[i9 + 2];
        long j = 1048575 & i10;
        if (j == 1048575) {
            return;
        }
        n0.n((1 << (i10 >>> 20)) | n0.f16387c.g(j, obj), j, obj);
    }

    public final void S(int i9, int i10, Object obj) {
        n0.n(i9, this.f16310a[i10 + 2] & 1048575, obj);
    }

    public final int T(int i9, int i10) {
        int[] iArr = this.f16310a;
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

    public final void U(Object obj, int i9, Object obj2) {
        f16309p.putObject(obj, X(i9) & 1048575, obj2);
        R(i9, obj);
    }

    public final void V(Object obj, int i9, Object obj2, int i10) {
        f16309p.putObject(obj, X(i10) & 1048575, obj2);
        S(i9, i10, obj);
    }

    public final int X(int i9) {
        return this.f16310a[i9 + 1];
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:10:0x0042. Please report as an issue. */
    public final void Y(Object obj, K k5) {
        int i9;
        int i10;
        int[] iArr = this.f16310a;
        int length = iArr.length;
        Unsafe unsafe = f16309p;
        int i11 = 1048575;
        int i12 = 0;
        for (int i13 = 0; i13 < length; i13 += 3) {
            int X8 = X(i13);
            int i14 = iArr[i13];
            int W6 = W(X8);
            if (W6 <= 17) {
                int i15 = iArr[i13 + 2];
                i9 = 1048575;
                int i16 = i15 & 1048575;
                if (i16 != i11) {
                    i12 = unsafe.getInt(obj, i16);
                    i11 = i16;
                }
                i10 = 1 << (i15 >>> 20);
            } else {
                i9 = 1048575;
                i10 = 0;
            }
            int i17 = i10;
            long j = X8 & i9;
            switch (W6) {
                case 0:
                    if ((i12 & i17) != 0) {
                        double e8 = n0.f16387c.e(j, obj);
                        C1040k c1040k = (C1040k) k5.f16302a;
                        c1040k.getClass();
                        c1040k.f0(Double.doubleToRawLongBits(e8), i14);
                    }
                case 1:
                    if ((i12 & i17) != 0) {
                        float f9 = n0.f16387c.f(j, obj);
                        C1040k c1040k2 = (C1040k) k5.f16302a;
                        c1040k2.getClass();
                        c1040k2.d0(i14, Float.floatToRawIntBits(f9));
                    }
                case 2:
                    if ((i12 & i17) != 0) {
                        ((C1040k) k5.f16302a).k0(unsafe.getLong(obj, j), i14);
                    }
                case 3:
                    if ((i12 & i17) != 0) {
                        ((C1040k) k5.f16302a).k0(unsafe.getLong(obj, j), i14);
                    }
                case 4:
                    if ((i12 & i17) != 0) {
                        int i18 = unsafe.getInt(obj, j);
                        C1040k c1040k3 = (C1040k) k5.f16302a;
                        c1040k3.i0(i14, 0);
                        c1040k3.h0(i18);
                    }
                case 5:
                    if ((i12 & i17) != 0) {
                        ((C1040k) k5.f16302a).f0(unsafe.getLong(obj, j), i14);
                    }
                case 6:
                    if ((i12 & i17) != 0) {
                        ((C1040k) k5.f16302a).d0(i14, unsafe.getInt(obj, j));
                    }
                case 7:
                    if ((i12 & i17) != 0) {
                        boolean c3 = n0.f16387c.c(j, obj);
                        C1040k c1040k4 = (C1040k) k5.f16302a;
                        c1040k4.i0(i14, 0);
                        c1040k4.b0(c3 ? (byte) 1 : (byte) 0);
                    }
                case 8:
                    if ((i12 & i17) != 0) {
                        Z(i14, unsafe.getObject(obj, j), k5);
                    }
                case 9:
                    if ((i12 & i17) != 0) {
                        k5.c(i14, unsafe.getObject(obj, j), p(i13));
                    }
                case R.styleable.GradientColor_android_endX /* 10 */:
                    if ((i12 & i17) != 0) {
                        k5.a(i14, (AbstractC1037h) unsafe.getObject(obj, j));
                    }
                case R.styleable.GradientColor_android_endY /* 11 */:
                    if ((i12 & i17) != 0) {
                        int i19 = unsafe.getInt(obj, j);
                        C1040k c1040k5 = (C1040k) k5.f16302a;
                        c1040k5.i0(i14, 0);
                        c1040k5.j0(i19);
                    }
                case 12:
                    if ((i12 & i17) != 0) {
                        int i20 = unsafe.getInt(obj, j);
                        C1040k c1040k6 = (C1040k) k5.f16302a;
                        c1040k6.i0(i14, 0);
                        c1040k6.h0(i20);
                    }
                case 13:
                    if ((i12 & i17) != 0) {
                        ((C1040k) k5.f16302a).d0(i14, unsafe.getInt(obj, j));
                    }
                case 14:
                    if ((i12 & i17) != 0) {
                        ((C1040k) k5.f16302a).f0(unsafe.getLong(obj, j), i14);
                    }
                case 15:
                    if ((i12 & i17) != 0) {
                        int i21 = unsafe.getInt(obj, j);
                        C1040k c1040k7 = (C1040k) k5.f16302a;
                        c1040k7.i0(i14, 0);
                        c1040k7.j0((i21 >> 31) ^ (i21 << 1));
                    }
                case 16:
                    if ((i12 & i17) != 0) {
                        long j4 = unsafe.getLong(obj, j);
                        ((C1040k) k5.f16302a).k0((j4 << 1) ^ (j4 >> 63), i14);
                    }
                case 17:
                    if ((i12 & i17) != 0) {
                        k5.b(i14, unsafe.getObject(obj, j), p(i13));
                    }
                case 18:
                    c0.B(iArr[i13], (List) unsafe.getObject(obj, j), k5, false);
                case 19:
                    c0.F(iArr[i13], (List) unsafe.getObject(obj, j), k5, false);
                case 20:
                    c0.I(iArr[i13], (List) unsafe.getObject(obj, j), k5, false);
                case 21:
                    c0.Q(iArr[i13], (List) unsafe.getObject(obj, j), k5, false);
                case 22:
                    c0.H(iArr[i13], (List) unsafe.getObject(obj, j), k5, false);
                case 23:
                    c0.E(iArr[i13], (List) unsafe.getObject(obj, j), k5, false);
                case 24:
                    c0.D(iArr[i13], (List) unsafe.getObject(obj, j), k5, false);
                case 25:
                    c0.z(iArr[i13], (List) unsafe.getObject(obj, j), k5, false);
                case 26:
                    c0.O(iArr[i13], (List) unsafe.getObject(obj, j), k5);
                case 27:
                    c0.J(iArr[i13], (List) unsafe.getObject(obj, j), k5, p(i13));
                case 28:
                    c0.A(iArr[i13], (List) unsafe.getObject(obj, j), k5);
                case 29:
                    c0.P(iArr[i13], (List) unsafe.getObject(obj, j), k5, false);
                case 30:
                    c0.C(iArr[i13], (List) unsafe.getObject(obj, j), k5, false);
                case 31:
                    c0.K(iArr[i13], (List) unsafe.getObject(obj, j), k5, false);
                case 32:
                    c0.L(iArr[i13], (List) unsafe.getObject(obj, j), k5, false);
                case 33:
                    c0.M(iArr[i13], (List) unsafe.getObject(obj, j), k5, false);
                case 34:
                    c0.N(iArr[i13], (List) unsafe.getObject(obj, j), k5, false);
                case 35:
                    c0.B(iArr[i13], (List) unsafe.getObject(obj, j), k5, true);
                case 36:
                    c0.F(iArr[i13], (List) unsafe.getObject(obj, j), k5, true);
                case 37:
                    c0.I(iArr[i13], (List) unsafe.getObject(obj, j), k5, true);
                case 38:
                    c0.Q(iArr[i13], (List) unsafe.getObject(obj, j), k5, true);
                case 39:
                    c0.H(iArr[i13], (List) unsafe.getObject(obj, j), k5, true);
                case 40:
                    c0.E(iArr[i13], (List) unsafe.getObject(obj, j), k5, true);
                case 41:
                    c0.D(iArr[i13], (List) unsafe.getObject(obj, j), k5, true);
                case 42:
                    c0.z(iArr[i13], (List) unsafe.getObject(obj, j), k5, true);
                case 43:
                    c0.P(iArr[i13], (List) unsafe.getObject(obj, j), k5, true);
                case 44:
                    c0.C(iArr[i13], (List) unsafe.getObject(obj, j), k5, true);
                case 45:
                    c0.K(iArr[i13], (List) unsafe.getObject(obj, j), k5, true);
                case 46:
                    c0.L(iArr[i13], (List) unsafe.getObject(obj, j), k5, true);
                case 47:
                    c0.M(iArr[i13], (List) unsafe.getObject(obj, j), k5, true);
                case 48:
                    c0.N(iArr[i13], (List) unsafe.getObject(obj, j), k5, true);
                case 49:
                    c0.G(iArr[i13], (List) unsafe.getObject(obj, j), k5, p(i13));
                case 50:
                    if (unsafe.getObject(obj, j) != null) {
                        Object o9 = o(i13);
                        this.f16322n.getClass();
                        A0.a.x(o9);
                        throw null;
                    }
                case 51:
                    if (u(i14, i13, obj)) {
                        double doubleValue = ((Double) n0.f16387c.i(j, obj)).doubleValue();
                        C1040k c1040k8 = (C1040k) k5.f16302a;
                        c1040k8.getClass();
                        c1040k8.f0(Double.doubleToRawLongBits(doubleValue), i14);
                    }
                case 52:
                    if (u(i14, i13, obj)) {
                        float floatValue = ((Float) n0.f16387c.i(j, obj)).floatValue();
                        C1040k c1040k9 = (C1040k) k5.f16302a;
                        c1040k9.getClass();
                        c1040k9.d0(i14, Float.floatToRawIntBits(floatValue));
                    }
                case 53:
                    if (u(i14, i13, obj)) {
                        ((C1040k) k5.f16302a).k0(G(j, obj), i14);
                    }
                case 54:
                    if (u(i14, i13, obj)) {
                        ((C1040k) k5.f16302a).k0(G(j, obj), i14);
                    }
                case 55:
                    if (u(i14, i13, obj)) {
                        int F2 = F(j, obj);
                        C1040k c1040k10 = (C1040k) k5.f16302a;
                        c1040k10.i0(i14, 0);
                        c1040k10.h0(F2);
                    }
                case 56:
                    if (u(i14, i13, obj)) {
                        ((C1040k) k5.f16302a).f0(G(j, obj), i14);
                    }
                case 57:
                    if (u(i14, i13, obj)) {
                        ((C1040k) k5.f16302a).d0(i14, F(j, obj));
                    }
                case 58:
                    if (u(i14, i13, obj)) {
                        boolean booleanValue = ((Boolean) n0.f16387c.i(j, obj)).booleanValue();
                        C1040k c1040k11 = (C1040k) k5.f16302a;
                        c1040k11.i0(i14, 0);
                        c1040k11.b0(booleanValue ? (byte) 1 : (byte) 0);
                    }
                case 59:
                    if (u(i14, i13, obj)) {
                        Z(i14, unsafe.getObject(obj, j), k5);
                    }
                case 60:
                    if (u(i14, i13, obj)) {
                        k5.c(i14, unsafe.getObject(obj, j), p(i13));
                    }
                case 61:
                    if (u(i14, i13, obj)) {
                        k5.a(i14, (AbstractC1037h) unsafe.getObject(obj, j));
                    }
                case 62:
                    if (u(i14, i13, obj)) {
                        int F8 = F(j, obj);
                        C1040k c1040k12 = (C1040k) k5.f16302a;
                        c1040k12.i0(i14, 0);
                        c1040k12.j0(F8);
                    }
                case 63:
                    if (u(i14, i13, obj)) {
                        int F9 = F(j, obj);
                        C1040k c1040k13 = (C1040k) k5.f16302a;
                        c1040k13.i0(i14, 0);
                        c1040k13.h0(F9);
                    }
                case 64:
                    if (u(i14, i13, obj)) {
                        ((C1040k) k5.f16302a).d0(i14, F(j, obj));
                    }
                case 65:
                    if (u(i14, i13, obj)) {
                        ((C1040k) k5.f16302a).f0(G(j, obj), i14);
                    }
                case 66:
                    if (u(i14, i13, obj)) {
                        int F10 = F(j, obj);
                        C1040k c1040k14 = (C1040k) k5.f16302a;
                        c1040k14.i0(i14, 0);
                        c1040k14.j0((F10 >> 31) ^ (F10 << 1));
                    }
                case 67:
                    if (u(i14, i13, obj)) {
                        long G8 = G(j, obj);
                        ((C1040k) k5.f16302a).k0((G8 << 1) ^ (G8 >> 63), i14);
                    }
                case 68:
                    if (u(i14, i13, obj)) {
                        k5.b(i14, unsafe.getObject(obj, j), p(i13));
                    }
                default:
            }
        }
        this.f16321m.getClass();
        ((AbstractC1050v) obj).unknownFields.e(k5);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.b0
    public final void a(Object obj, Object obj2) {
        Object obj3;
        l(obj);
        obj2.getClass();
        int i9 = 0;
        while (true) {
            int[] iArr = this.f16310a;
            if (i9 < iArr.length) {
                int X8 = X(i9);
                long j = 1048575 & X8;
                int i10 = iArr[i9];
                switch (W(X8)) {
                    case 0:
                        if (s(i9, obj2)) {
                            m0 m0Var = n0.f16387c;
                            obj3 = obj;
                            m0Var.m(obj3, j, m0Var.e(j, obj2));
                            R(i9, obj3);
                            break;
                        }
                        break;
                    case 1:
                        if (s(i9, obj2)) {
                            m0 m0Var2 = n0.f16387c;
                            m0Var2.n(obj, j, m0Var2.f(j, obj2));
                            R(i9, obj);
                            break;
                        }
                        break;
                    case 2:
                        if (s(i9, obj2)) {
                            n0.o(obj, j, n0.f16387c.h(j, obj2));
                            R(i9, obj);
                            break;
                        }
                        break;
                    case 3:
                        if (s(i9, obj2)) {
                            n0.o(obj, j, n0.f16387c.h(j, obj2));
                            R(i9, obj);
                            break;
                        }
                        break;
                    case 4:
                        if (s(i9, obj2)) {
                            n0.n(n0.f16387c.g(j, obj2), j, obj);
                            R(i9, obj);
                            break;
                        }
                        break;
                    case 5:
                        if (s(i9, obj2)) {
                            n0.o(obj, j, n0.f16387c.h(j, obj2));
                            R(i9, obj);
                            break;
                        }
                        break;
                    case 6:
                        if (s(i9, obj2)) {
                            n0.n(n0.f16387c.g(j, obj2), j, obj);
                            R(i9, obj);
                            break;
                        }
                        break;
                    case 7:
                        if (s(i9, obj2)) {
                            m0 m0Var3 = n0.f16387c;
                            m0Var3.k(j, obj, m0Var3.c(j, obj2));
                            R(i9, obj);
                            break;
                        }
                        break;
                    case 8:
                        if (s(i9, obj2)) {
                            n0.p(obj, j, n0.f16387c.i(j, obj2));
                            R(i9, obj);
                            break;
                        }
                        break;
                    case 9:
                        y(obj, i9, obj2);
                        break;
                    case R.styleable.GradientColor_android_endX /* 10 */:
                        if (s(i9, obj2)) {
                            n0.p(obj, j, n0.f16387c.i(j, obj2));
                            R(i9, obj);
                            break;
                        }
                        break;
                    case R.styleable.GradientColor_android_endY /* 11 */:
                        if (s(i9, obj2)) {
                            n0.n(n0.f16387c.g(j, obj2), j, obj);
                            R(i9, obj);
                            break;
                        }
                        break;
                    case 12:
                        if (s(i9, obj2)) {
                            n0.n(n0.f16387c.g(j, obj2), j, obj);
                            R(i9, obj);
                            break;
                        }
                        break;
                    case 13:
                        if (s(i9, obj2)) {
                            n0.n(n0.f16387c.g(j, obj2), j, obj);
                            R(i9, obj);
                            break;
                        }
                        break;
                    case 14:
                        if (s(i9, obj2)) {
                            n0.o(obj, j, n0.f16387c.h(j, obj2));
                            R(i9, obj);
                            break;
                        }
                        break;
                    case 15:
                        if (s(i9, obj2)) {
                            n0.n(n0.f16387c.g(j, obj2), j, obj);
                            R(i9, obj);
                            break;
                        }
                        break;
                    case 16:
                        if (s(i9, obj2)) {
                            n0.o(obj, j, n0.f16387c.h(j, obj2));
                            R(i9, obj);
                            break;
                        }
                        break;
                    case 17:
                        y(obj, i9, obj2);
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
                        this.f16320l.b(obj, j, obj2);
                        break;
                    case 50:
                        Class cls = c0.f16341a;
                        m0 m0Var4 = n0.f16387c;
                        Object i11 = m0Var4.i(j, obj);
                        Object i12 = m0Var4.i(j, obj2);
                        this.f16322n.getClass();
                        n0.p(obj, j, M.b(i11, i12));
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
                        if (u(i10, i9, obj2)) {
                            n0.p(obj, j, n0.f16387c.i(j, obj2));
                            S(i10, i9, obj);
                            break;
                        }
                        break;
                    case 60:
                        z(obj, i9, obj2);
                        break;
                    case 61:
                    case 62:
                    case 63:
                    case 64:
                    case 65:
                    case 66:
                    case 67:
                        if (u(i10, i9, obj2)) {
                            n0.p(obj, j, n0.f16387c.i(j, obj2));
                            S(i10, i9, obj);
                            break;
                        }
                        break;
                    case 68:
                        z(obj, i9, obj2);
                        break;
                }
                obj3 = obj;
                i9 += 3;
                obj = obj3;
            } else {
                c0.x(this.f16321m, obj, obj2);
                return;
            }
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.b0
    public final void b(Object obj) {
        if (!t(obj)) {
            return;
        }
        if (obj instanceof AbstractC1050v) {
            AbstractC1050v abstractC1050v = (AbstractC1050v) obj;
            abstractC1050v.u(Integer.MAX_VALUE);
            abstractC1050v.memoizedHashCode = 0;
            abstractC1050v.o();
        }
        int length = this.f16310a.length;
        for (int i9 = 0; i9 < length; i9 += 3) {
            int X8 = X(i9);
            long j = 1048575 & X8;
            int W6 = W(X8);
            if (W6 != 9) {
                switch (W6) {
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
                        this.f16320l.a(j, obj);
                        break;
                    case 50:
                        Unsafe unsafe = f16309p;
                        Object object = unsafe.getObject(obj, j);
                        if (object != null) {
                            this.f16322n.getClass();
                            ((L) object).f16304a = false;
                            unsafe.putObject(obj, j, object);
                            break;
                        } else {
                            break;
                        }
                }
            }
            if (s(i9, obj)) {
                p(i9).b(f16309p.getObject(obj, j));
            }
        }
        this.f16321m.getClass();
        ((AbstractC1050v) obj).unknownFields.f16351e = false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x00ee, code lost:
    
        return false;
     */
    @Override // com.google.crypto.tink.shaded.protobuf.b0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean c(java.lang.Object r14) {
        /*
            Method dump skipped, instructions count: 244
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.crypto.tink.shaded.protobuf.S.c(java.lang.Object):boolean");
    }

    @Override // com.google.crypto.tink.shaded.protobuf.b0
    public final Object d() {
        this.f16319k.getClass();
        return ((AbstractC1050v) this.f16314e).q();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.b0
    public final int e(AbstractC1050v abstractC1050v) {
        if (this.f16316g) {
            return r(abstractC1050v);
        }
        return q(abstractC1050v);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.b0
    public final void f(Object obj, C0120y c0120y, C1043n c1043n) {
        c1043n.getClass();
        l(obj);
        w(this.f16321m, obj, c0120y, c1043n);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0074, code lost:
    
        if (com.google.crypto.tink.shaded.protobuf.c0.y(r5.i(r7, r12), r5.i(r7, r13)) != false) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x008a, code lost:
    
        if (r5.h(r7, r12) == r5.h(r7, r13)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x009e, code lost:
    
        if (r5.g(r7, r12) == r5.g(r7, r13)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00b4, code lost:
    
        if (r5.h(r7, r12) == r5.h(r7, r13)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00c8, code lost:
    
        if (r5.g(r7, r12) == r5.g(r7, r13)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00dc, code lost:
    
        if (r5.g(r7, r12) == r5.g(r7, r13)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00f0, code lost:
    
        if (r5.g(r7, r12) == r5.g(r7, r13)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0108, code lost:
    
        if (com.google.crypto.tink.shaded.protobuf.c0.y(r5.i(r7, r12), r5.i(r7, r13)) != false) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0120, code lost:
    
        if (com.google.crypto.tink.shaded.protobuf.c0.y(r5.i(r7, r12), r5.i(r7, r13)) != false) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0138, code lost:
    
        if (com.google.crypto.tink.shaded.protobuf.c0.y(r5.i(r7, r12), r5.i(r7, r13)) != false) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x014c, code lost:
    
        if (r5.c(r7, r12) == r5.c(r7, r13)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0160, code lost:
    
        if (r5.g(r7, r12) == r5.g(r7, r13)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0176, code lost:
    
        if (r5.h(r7, r12) == r5.h(r7, r13)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x018a, code lost:
    
        if (r5.g(r7, r12) == r5.g(r7, r13)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x019f, code lost:
    
        if (r5.h(r7, r12) == r5.h(r7, r13)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x01b4, code lost:
    
        if (r5.h(r7, r12) == r5.h(r7, r13)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x01cf, code lost:
    
        if (java.lang.Float.floatToIntBits(r5.f(r7, r12)) == java.lang.Float.floatToIntBits(r5.f(r7, r13))) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x01ec, code lost:
    
        if (java.lang.Double.doubleToLongBits(r5.e(r7, r12)) == java.lang.Double.doubleToLongBits(r5.e(r7, r13))) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0039, code lost:
    
        if (com.google.crypto.tink.shaded.protobuf.c0.y(r9.i(r7, r12), r9.i(r7, r13)) != false) goto L105;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:5:0x0016. Please report as an issue. */
    @Override // com.google.crypto.tink.shaded.protobuf.b0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean g(com.google.crypto.tink.shaded.protobuf.AbstractC1050v r12, com.google.crypto.tink.shaded.protobuf.AbstractC1050v r13) {
        /*
            Method dump skipped, instructions count: 660
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.crypto.tink.shaded.protobuf.S.g(com.google.crypto.tink.shaded.protobuf.v, com.google.crypto.tink.shaded.protobuf.v):boolean");
    }

    @Override // com.google.crypto.tink.shaded.protobuf.b0
    public final void h(Object obj, byte[] bArr, int i9, int i10, N3.Z z9) {
        if (this.f16316g) {
            K(obj, bArr, i9, i10, z9);
        } else {
            J(obj, bArr, i9, i10, 0, z9);
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.b0
    public final void i(Object obj, K k5) {
        k5.getClass();
        if (this.f16316g) {
            int[] iArr = this.f16310a;
            int length = iArr.length;
            for (int i9 = 0; i9 < length; i9 += 3) {
                int X8 = X(i9);
                int i10 = iArr[i9];
                int W6 = W(X8);
                C1040k c1040k = (C1040k) k5.f16302a;
                switch (W6) {
                    case 0:
                        if (s(i9, obj)) {
                            double e8 = n0.f16387c.e(X8 & 1048575, obj);
                            c1040k.getClass();
                            c1040k.f0(Double.doubleToRawLongBits(e8), i10);
                            break;
                        } else {
                            break;
                        }
                    case 1:
                        if (s(i9, obj)) {
                            float f9 = n0.f16387c.f(X8 & 1048575, obj);
                            c1040k.getClass();
                            c1040k.d0(i10, Float.floatToRawIntBits(f9));
                            break;
                        } else {
                            break;
                        }
                    case 2:
                        if (s(i9, obj)) {
                            c1040k.k0(n0.f16387c.h(X8 & 1048575, obj), i10);
                            break;
                        } else {
                            break;
                        }
                    case 3:
                        if (s(i9, obj)) {
                            c1040k.k0(n0.f16387c.h(X8 & 1048575, obj), i10);
                            break;
                        } else {
                            break;
                        }
                    case 4:
                        if (s(i9, obj)) {
                            int g9 = n0.f16387c.g(X8 & 1048575, obj);
                            c1040k.i0(i10, 0);
                            c1040k.h0(g9);
                            break;
                        } else {
                            break;
                        }
                    case 5:
                        if (s(i9, obj)) {
                            c1040k.f0(n0.f16387c.h(X8 & 1048575, obj), i10);
                            break;
                        } else {
                            break;
                        }
                    case 6:
                        if (s(i9, obj)) {
                            c1040k.d0(i10, n0.f16387c.g(X8 & 1048575, obj));
                            break;
                        } else {
                            break;
                        }
                    case 7:
                        if (s(i9, obj)) {
                            boolean c3 = n0.f16387c.c(X8 & 1048575, obj);
                            c1040k.i0(i10, 0);
                            c1040k.b0(c3 ? (byte) 1 : (byte) 0);
                            break;
                        } else {
                            break;
                        }
                    case 8:
                        if (s(i9, obj)) {
                            Z(i10, n0.f16387c.i(X8 & 1048575, obj), k5);
                            break;
                        } else {
                            break;
                        }
                    case 9:
                        if (s(i9, obj)) {
                            k5.c(i10, n0.f16387c.i(X8 & 1048575, obj), p(i9));
                            break;
                        } else {
                            break;
                        }
                    case R.styleable.GradientColor_android_endX /* 10 */:
                        if (s(i9, obj)) {
                            k5.a(i10, (AbstractC1037h) n0.f16387c.i(X8 & 1048575, obj));
                            break;
                        } else {
                            break;
                        }
                    case R.styleable.GradientColor_android_endY /* 11 */:
                        if (s(i9, obj)) {
                            int g10 = n0.f16387c.g(X8 & 1048575, obj);
                            c1040k.i0(i10, 0);
                            c1040k.j0(g10);
                            break;
                        } else {
                            break;
                        }
                    case 12:
                        if (s(i9, obj)) {
                            int g11 = n0.f16387c.g(X8 & 1048575, obj);
                            c1040k.i0(i10, 0);
                            c1040k.h0(g11);
                            break;
                        } else {
                            break;
                        }
                    case 13:
                        if (s(i9, obj)) {
                            c1040k.d0(i10, n0.f16387c.g(X8 & 1048575, obj));
                            break;
                        } else {
                            break;
                        }
                    case 14:
                        if (s(i9, obj)) {
                            c1040k.f0(n0.f16387c.h(X8 & 1048575, obj), i10);
                            break;
                        } else {
                            break;
                        }
                    case 15:
                        if (s(i9, obj)) {
                            int g12 = n0.f16387c.g(X8 & 1048575, obj);
                            c1040k.i0(i10, 0);
                            c1040k.j0((g12 >> 31) ^ (g12 << 1));
                            break;
                        } else {
                            break;
                        }
                    case 16:
                        if (s(i9, obj)) {
                            long h7 = n0.f16387c.h(X8 & 1048575, obj);
                            c1040k.k0((h7 >> 63) ^ (h7 << 1), i10);
                            break;
                        } else {
                            break;
                        }
                    case 17:
                        if (s(i9, obj)) {
                            k5.b(i10, n0.f16387c.i(X8 & 1048575, obj), p(i9));
                            break;
                        } else {
                            break;
                        }
                    case 18:
                        c0.B(iArr[i9], (List) n0.f16387c.i(X8 & 1048575, obj), k5, false);
                        break;
                    case 19:
                        c0.F(iArr[i9], (List) n0.f16387c.i(X8 & 1048575, obj), k5, false);
                        break;
                    case 20:
                        c0.I(iArr[i9], (List) n0.f16387c.i(X8 & 1048575, obj), k5, false);
                        break;
                    case 21:
                        c0.Q(iArr[i9], (List) n0.f16387c.i(X8 & 1048575, obj), k5, false);
                        break;
                    case 22:
                        c0.H(iArr[i9], (List) n0.f16387c.i(X8 & 1048575, obj), k5, false);
                        break;
                    case 23:
                        c0.E(iArr[i9], (List) n0.f16387c.i(X8 & 1048575, obj), k5, false);
                        break;
                    case 24:
                        c0.D(iArr[i9], (List) n0.f16387c.i(X8 & 1048575, obj), k5, false);
                        break;
                    case 25:
                        c0.z(iArr[i9], (List) n0.f16387c.i(X8 & 1048575, obj), k5, false);
                        break;
                    case 26:
                        c0.O(iArr[i9], (List) n0.f16387c.i(X8 & 1048575, obj), k5);
                        break;
                    case 27:
                        c0.J(iArr[i9], (List) n0.f16387c.i(X8 & 1048575, obj), k5, p(i9));
                        break;
                    case 28:
                        c0.A(iArr[i9], (List) n0.f16387c.i(X8 & 1048575, obj), k5);
                        break;
                    case 29:
                        c0.P(iArr[i9], (List) n0.f16387c.i(X8 & 1048575, obj), k5, false);
                        break;
                    case 30:
                        c0.C(iArr[i9], (List) n0.f16387c.i(X8 & 1048575, obj), k5, false);
                        break;
                    case 31:
                        c0.K(iArr[i9], (List) n0.f16387c.i(X8 & 1048575, obj), k5, false);
                        break;
                    case 32:
                        c0.L(iArr[i9], (List) n0.f16387c.i(X8 & 1048575, obj), k5, false);
                        break;
                    case 33:
                        c0.M(iArr[i9], (List) n0.f16387c.i(X8 & 1048575, obj), k5, false);
                        break;
                    case 34:
                        c0.N(iArr[i9], (List) n0.f16387c.i(X8 & 1048575, obj), k5, false);
                        break;
                    case 35:
                        c0.B(iArr[i9], (List) n0.f16387c.i(X8 & 1048575, obj), k5, true);
                        break;
                    case 36:
                        c0.F(iArr[i9], (List) n0.f16387c.i(X8 & 1048575, obj), k5, true);
                        break;
                    case 37:
                        c0.I(iArr[i9], (List) n0.f16387c.i(X8 & 1048575, obj), k5, true);
                        break;
                    case 38:
                        c0.Q(iArr[i9], (List) n0.f16387c.i(X8 & 1048575, obj), k5, true);
                        break;
                    case 39:
                        c0.H(iArr[i9], (List) n0.f16387c.i(X8 & 1048575, obj), k5, true);
                        break;
                    case 40:
                        c0.E(iArr[i9], (List) n0.f16387c.i(X8 & 1048575, obj), k5, true);
                        break;
                    case 41:
                        c0.D(iArr[i9], (List) n0.f16387c.i(X8 & 1048575, obj), k5, true);
                        break;
                    case 42:
                        c0.z(iArr[i9], (List) n0.f16387c.i(X8 & 1048575, obj), k5, true);
                        break;
                    case 43:
                        c0.P(iArr[i9], (List) n0.f16387c.i(X8 & 1048575, obj), k5, true);
                        break;
                    case 44:
                        c0.C(iArr[i9], (List) n0.f16387c.i(X8 & 1048575, obj), k5, true);
                        break;
                    case 45:
                        c0.K(iArr[i9], (List) n0.f16387c.i(X8 & 1048575, obj), k5, true);
                        break;
                    case 46:
                        c0.L(iArr[i9], (List) n0.f16387c.i(X8 & 1048575, obj), k5, true);
                        break;
                    case 47:
                        c0.M(iArr[i9], (List) n0.f16387c.i(X8 & 1048575, obj), k5, true);
                        break;
                    case 48:
                        c0.N(iArr[i9], (List) n0.f16387c.i(X8 & 1048575, obj), k5, true);
                        break;
                    case 49:
                        c0.G(iArr[i9], (List) n0.f16387c.i(X8 & 1048575, obj), k5, p(i9));
                        break;
                    case 50:
                        if (n0.f16387c.i(X8 & 1048575, obj) != null) {
                            Object o9 = o(i9);
                            this.f16322n.getClass();
                            A0.a.x(o9);
                            throw null;
                        }
                        break;
                    case 51:
                        if (u(i10, i9, obj)) {
                            double doubleValue = ((Double) n0.f16387c.i(X8 & 1048575, obj)).doubleValue();
                            c1040k.getClass();
                            c1040k.f0(Double.doubleToRawLongBits(doubleValue), i10);
                            break;
                        } else {
                            break;
                        }
                    case 52:
                        if (u(i10, i9, obj)) {
                            float floatValue = ((Float) n0.f16387c.i(X8 & 1048575, obj)).floatValue();
                            c1040k.getClass();
                            c1040k.d0(i10, Float.floatToRawIntBits(floatValue));
                            break;
                        } else {
                            break;
                        }
                    case 53:
                        if (u(i10, i9, obj)) {
                            c1040k.k0(G(X8 & 1048575, obj), i10);
                            break;
                        } else {
                            break;
                        }
                    case 54:
                        if (u(i10, i9, obj)) {
                            c1040k.k0(G(X8 & 1048575, obj), i10);
                            break;
                        } else {
                            break;
                        }
                    case 55:
                        if (u(i10, i9, obj)) {
                            int F2 = F(X8 & 1048575, obj);
                            c1040k.i0(i10, 0);
                            c1040k.h0(F2);
                            break;
                        } else {
                            break;
                        }
                    case 56:
                        if (u(i10, i9, obj)) {
                            c1040k.f0(G(X8 & 1048575, obj), i10);
                            break;
                        } else {
                            break;
                        }
                    case 57:
                        if (u(i10, i9, obj)) {
                            c1040k.d0(i10, F(X8 & 1048575, obj));
                            break;
                        } else {
                            break;
                        }
                    case 58:
                        if (u(i10, i9, obj)) {
                            boolean booleanValue = ((Boolean) n0.f16387c.i(X8 & 1048575, obj)).booleanValue();
                            c1040k.i0(i10, 0);
                            c1040k.b0(booleanValue ? (byte) 1 : (byte) 0);
                            break;
                        } else {
                            break;
                        }
                    case 59:
                        if (u(i10, i9, obj)) {
                            Z(i10, n0.f16387c.i(X8 & 1048575, obj), k5);
                            break;
                        } else {
                            break;
                        }
                    case 60:
                        if (u(i10, i9, obj)) {
                            k5.c(i10, n0.f16387c.i(X8 & 1048575, obj), p(i9));
                            break;
                        } else {
                            break;
                        }
                    case 61:
                        if (u(i10, i9, obj)) {
                            k5.a(i10, (AbstractC1037h) n0.f16387c.i(X8 & 1048575, obj));
                            break;
                        } else {
                            break;
                        }
                    case 62:
                        if (u(i10, i9, obj)) {
                            int F8 = F(X8 & 1048575, obj);
                            c1040k.i0(i10, 0);
                            c1040k.j0(F8);
                            break;
                        } else {
                            break;
                        }
                    case 63:
                        if (u(i10, i9, obj)) {
                            int F9 = F(X8 & 1048575, obj);
                            c1040k.i0(i10, 0);
                            c1040k.h0(F9);
                            break;
                        } else {
                            break;
                        }
                    case 64:
                        if (u(i10, i9, obj)) {
                            c1040k.d0(i10, F(X8 & 1048575, obj));
                            break;
                        } else {
                            break;
                        }
                    case 65:
                        if (u(i10, i9, obj)) {
                            c1040k.f0(G(X8 & 1048575, obj), i10);
                            break;
                        } else {
                            break;
                        }
                    case 66:
                        if (u(i10, i9, obj)) {
                            int F10 = F(X8 & 1048575, obj);
                            c1040k.i0(i10, 0);
                            c1040k.j0((F10 >> 31) ^ (F10 << 1));
                            break;
                        } else {
                            break;
                        }
                    case 67:
                        if (u(i10, i9, obj)) {
                            long G8 = G(X8 & 1048575, obj);
                            c1040k.k0((G8 >> 63) ^ (G8 << 1), i10);
                            break;
                        } else {
                            break;
                        }
                    case 68:
                        if (u(i10, i9, obj)) {
                            k5.b(i10, n0.f16387c.i(X8 & 1048575, obj), p(i9));
                            break;
                        } else {
                            break;
                        }
                }
            }
            this.f16321m.getClass();
            ((AbstractC1050v) obj).unknownFields.e(k5);
            return;
        }
        Y(obj, k5);
    }

    /* JADX WARN: Code restructure failed: missing block: B:103:0x0216, code lost:
    
        if (r4 != false) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00df, code lost:
    
        if (r4 != false) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00e1, code lost:
    
        r8 = 1231;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00e2, code lost:
    
        r3 = r8 + r3;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:4:0x001c. Please report as an issue. */
    @Override // com.google.crypto.tink.shaded.protobuf.b0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int j(com.google.crypto.tink.shaded.protobuf.AbstractC1050v r12) {
        /*
            Method dump skipped, instructions count: 794
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.crypto.tink.shaded.protobuf.S.j(com.google.crypto.tink.shaded.protobuf.v):int");
    }

    public final boolean k(AbstractC1050v abstractC1050v, AbstractC1050v abstractC1050v2, int i9) {
        if (s(i9, abstractC1050v) == s(i9, abstractC1050v2)) {
            return true;
        }
        return false;
    }

    public final void m(Object obj, int i9, Object obj2) {
        int i10 = this.f16310a[i9];
        if (n0.f16387c.i(X(i9) & 1048575, obj) == null) {
            return;
        }
        n(i9);
    }

    public final void n(int i9) {
        if (this.f16311b[((i9 / 3) * 2) + 1] == null) {
        } else {
            throw new ClassCastException();
        }
    }

    public final Object o(int i9) {
        return this.f16311b[(i9 / 3) * 2];
    }

    public final b0 p(int i9) {
        int i10 = (i9 / 3) * 2;
        Object[] objArr = this.f16311b;
        b0 b0Var = (b0) objArr[i10];
        if (b0Var != null) {
            return b0Var;
        }
        b0 a5 = Y.f16328c.a((Class) objArr[i10 + 1]);
        objArr[i10] = a5;
        return a5;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:10:0x003c. Please report as an issue. */
    public final int q(AbstractC1050v abstractC1050v) {
        int i9;
        int Y;
        int a02;
        int Y4;
        int W6;
        int U8;
        int Y8;
        int X8;
        int R2;
        int Y9;
        int i10;
        Unsafe unsafe = f16309p;
        int i11 = 1048575;
        int i12 = 1048575;
        int i13 = 0;
        int i14 = 0;
        int i15 = 0;
        while (true) {
            int[] iArr = this.f16310a;
            if (i13 < iArr.length) {
                int X9 = X(i13);
                int i16 = iArr[i13];
                int W8 = W(X9);
                if (W8 <= 17) {
                    int i17 = iArr[i13 + 2];
                    int i18 = i17 & i11;
                    i9 = 1 << (i17 >>> 20);
                    if (i18 != i12) {
                        i15 = unsafe.getInt(abstractC1050v, i18);
                        i12 = i18;
                    }
                } else {
                    i9 = 0;
                }
                long j = X9 & i11;
                switch (W8) {
                    case 0:
                        if ((i15 & i9) != 0) {
                            i14 = AbstractC0953k1.w(i16, 8, i14);
                            break;
                        } else {
                            break;
                        }
                    case 1:
                        if ((i15 & i9) != 0) {
                            i14 = AbstractC0953k1.w(i16, 4, i14);
                            break;
                        } else {
                            break;
                        }
                    case 2:
                        if ((i15 & i9) != 0) {
                            long j4 = unsafe.getLong(abstractC1050v, j);
                            Y = C1040k.Y(i16);
                            a02 = C1040k.a0(j4);
                            U8 = a02 + Y;
                            i14 += U8;
                            break;
                        } else {
                            break;
                        }
                    case 3:
                        if ((i15 & i9) != 0) {
                            long j9 = unsafe.getLong(abstractC1050v, j);
                            Y = C1040k.Y(i16);
                            a02 = C1040k.a0(j9);
                            U8 = a02 + Y;
                            i14 += U8;
                            break;
                        } else {
                            break;
                        }
                    case 4:
                        if ((i15 & i9) != 0) {
                            int i19 = unsafe.getInt(abstractC1050v, j);
                            Y4 = C1040k.Y(i16);
                            W6 = C1040k.W(i19);
                            U8 = W6 + Y4;
                            i14 += U8;
                            break;
                        } else {
                            break;
                        }
                    case 5:
                        if ((i15 & i9) != 0) {
                            U8 = C1040k.U(i16);
                            i14 += U8;
                            break;
                        } else {
                            break;
                        }
                    case 6:
                        if ((i15 & i9) != 0) {
                            U8 = C1040k.T(i16);
                            i14 += U8;
                            break;
                        } else {
                            break;
                        }
                    case 7:
                        if ((i15 & i9) != 0) {
                            i14 = AbstractC0953k1.w(i16, 1, i14);
                            break;
                        } else {
                            break;
                        }
                    case 8:
                        if ((i15 & i9) == 0) {
                            break;
                        } else {
                            Object object = unsafe.getObject(abstractC1050v, j);
                            if (object instanceof AbstractC1037h) {
                                R2 = C1040k.R(i16, (AbstractC1037h) object);
                                i14 = R2 + i14;
                                break;
                            } else {
                                Y8 = C1040k.Y(i16);
                                X8 = C1040k.X((String) object);
                                R2 = X8 + Y8;
                                i14 = R2 + i14;
                            }
                        }
                    case 9:
                        if ((i15 & i9) != 0) {
                            Object object2 = unsafe.getObject(abstractC1050v, j);
                            b0 p9 = p(i13);
                            Class cls = c0.f16341a;
                            int Y10 = C1040k.Y(i16);
                            int a5 = ((AbstractC1030a) object2).a(p9);
                            i14 = AbstractC0953k1.x(a5, a5, Y10, i14);
                            break;
                        } else {
                            break;
                        }
                    case R.styleable.GradientColor_android_endX /* 10 */:
                        if ((i15 & i9) != 0) {
                            U8 = C1040k.R(i16, (AbstractC1037h) unsafe.getObject(abstractC1050v, j));
                            i14 += U8;
                            break;
                        } else {
                            break;
                        }
                    case R.styleable.GradientColor_android_endY /* 11 */:
                        if ((i15 & i9) != 0) {
                            int i20 = unsafe.getInt(abstractC1050v, j);
                            Y4 = C1040k.Y(i16);
                            W6 = C1040k.Z(i20);
                            U8 = W6 + Y4;
                            i14 += U8;
                            break;
                        } else {
                            break;
                        }
                    case 12:
                        if ((i15 & i9) != 0) {
                            int i21 = unsafe.getInt(abstractC1050v, j);
                            Y4 = C1040k.Y(i16);
                            W6 = C1040k.W(i21);
                            U8 = W6 + Y4;
                            i14 += U8;
                            break;
                        } else {
                            break;
                        }
                    case 13:
                        if ((i15 & i9) != 0) {
                            i14 = AbstractC0953k1.w(i16, 4, i14);
                            break;
                        } else {
                            break;
                        }
                    case 14:
                        if ((i15 & i9) != 0) {
                            i14 = AbstractC0953k1.w(i16, 8, i14);
                            break;
                        } else {
                            break;
                        }
                    case 15:
                        if ((i15 & i9) != 0) {
                            int i22 = unsafe.getInt(abstractC1050v, j);
                            Y4 = C1040k.Y(i16);
                            W6 = C1040k.Z((i22 >> 31) ^ (i22 << 1));
                            U8 = W6 + Y4;
                            i14 += U8;
                            break;
                        } else {
                            break;
                        }
                    case 16:
                        if ((i15 & i9) != 0) {
                            long j10 = unsafe.getLong(abstractC1050v, j);
                            Y = C1040k.Y(i16);
                            a02 = C1040k.a0((j10 >> 63) ^ (j10 << 1));
                            U8 = a02 + Y;
                            i14 += U8;
                            break;
                        } else {
                            break;
                        }
                    case 17:
                        if ((i15 & i9) != 0) {
                            U8 = C1040k.V(i16, (AbstractC1030a) unsafe.getObject(abstractC1050v, j), p(i13));
                            i14 += U8;
                            break;
                        } else {
                            break;
                        }
                    case 18:
                        U8 = c0.f((List) unsafe.getObject(abstractC1050v, j), i16);
                        i14 += U8;
                        break;
                    case 19:
                        U8 = c0.d((List) unsafe.getObject(abstractC1050v, j), i16);
                        i14 += U8;
                        break;
                    case 20:
                        U8 = c0.j((List) unsafe.getObject(abstractC1050v, j), i16);
                        i14 += U8;
                        break;
                    case 21:
                        U8 = c0.t((List) unsafe.getObject(abstractC1050v, j), i16);
                        i14 += U8;
                        break;
                    case 22:
                        U8 = c0.h((List) unsafe.getObject(abstractC1050v, j), i16);
                        i14 += U8;
                        break;
                    case 23:
                        U8 = c0.f((List) unsafe.getObject(abstractC1050v, j), i16);
                        i14 += U8;
                        break;
                    case 24:
                        U8 = c0.d((List) unsafe.getObject(abstractC1050v, j), i16);
                        i14 += U8;
                        break;
                    case 25:
                        List list = (List) unsafe.getObject(abstractC1050v, j);
                        Class cls2 = c0.f16341a;
                        int size = list.size();
                        if (size == 0) {
                            Y9 = 0;
                        } else {
                            Y9 = (C1040k.Y(i16) + 1) * size;
                        }
                        i14 += Y9;
                        break;
                    case 26:
                        U8 = c0.q((List) unsafe.getObject(abstractC1050v, j), i16);
                        i14 += U8;
                        break;
                    case 27:
                        U8 = c0.l(i16, (List) unsafe.getObject(abstractC1050v, j), p(i13));
                        i14 += U8;
                        break;
                    case 28:
                        U8 = c0.a((List) unsafe.getObject(abstractC1050v, j), i16);
                        i14 += U8;
                        break;
                    case 29:
                        U8 = c0.r((List) unsafe.getObject(abstractC1050v, j), i16);
                        i14 += U8;
                        break;
                    case 30:
                        U8 = c0.b((List) unsafe.getObject(abstractC1050v, j), i16);
                        i14 += U8;
                        break;
                    case 31:
                        U8 = c0.d((List) unsafe.getObject(abstractC1050v, j), i16);
                        i14 += U8;
                        break;
                    case 32:
                        U8 = c0.f((List) unsafe.getObject(abstractC1050v, j), i16);
                        i14 += U8;
                        break;
                    case 33:
                        U8 = c0.m((List) unsafe.getObject(abstractC1050v, j), i16);
                        i14 += U8;
                        break;
                    case 34:
                        U8 = c0.o((List) unsafe.getObject(abstractC1050v, j), i16);
                        i14 += U8;
                        break;
                    case 35:
                        int g9 = c0.g((List) unsafe.getObject(abstractC1050v, j));
                        if (g9 > 0) {
                            i14 = AbstractC0953k1.x(g9, C1040k.Y(i16), g9, i14);
                            break;
                        } else {
                            break;
                        }
                    case 36:
                        int e8 = c0.e((List) unsafe.getObject(abstractC1050v, j));
                        if (e8 > 0) {
                            i14 = AbstractC0953k1.x(e8, C1040k.Y(i16), e8, i14);
                            break;
                        } else {
                            break;
                        }
                    case 37:
                        int k5 = c0.k((List) unsafe.getObject(abstractC1050v, j));
                        if (k5 > 0) {
                            i14 = AbstractC0953k1.x(k5, C1040k.Y(i16), k5, i14);
                            break;
                        } else {
                            break;
                        }
                    case 38:
                        int u9 = c0.u((List) unsafe.getObject(abstractC1050v, j));
                        if (u9 > 0) {
                            i14 = AbstractC0953k1.x(u9, C1040k.Y(i16), u9, i14);
                            break;
                        } else {
                            break;
                        }
                    case 39:
                        int i23 = c0.i((List) unsafe.getObject(abstractC1050v, j));
                        if (i23 > 0) {
                            i14 = AbstractC0953k1.x(i23, C1040k.Y(i16), i23, i14);
                            break;
                        } else {
                            break;
                        }
                    case 40:
                        int g10 = c0.g((List) unsafe.getObject(abstractC1050v, j));
                        if (g10 > 0) {
                            i14 = AbstractC0953k1.x(g10, C1040k.Y(i16), g10, i14);
                            break;
                        } else {
                            break;
                        }
                    case 41:
                        int e9 = c0.e((List) unsafe.getObject(abstractC1050v, j));
                        if (e9 > 0) {
                            i14 = AbstractC0953k1.x(e9, C1040k.Y(i16), e9, i14);
                            break;
                        } else {
                            break;
                        }
                    case 42:
                        List list2 = (List) unsafe.getObject(abstractC1050v, j);
                        Class cls3 = c0.f16341a;
                        int size2 = list2.size();
                        if (size2 > 0) {
                            i14 = AbstractC0953k1.x(size2, C1040k.Y(i16), size2, i14);
                            break;
                        } else {
                            break;
                        }
                    case 43:
                        int s9 = c0.s((List) unsafe.getObject(abstractC1050v, j));
                        if (s9 > 0) {
                            i14 = AbstractC0953k1.x(s9, C1040k.Y(i16), s9, i14);
                            break;
                        } else {
                            break;
                        }
                    case 44:
                        int c3 = c0.c((List) unsafe.getObject(abstractC1050v, j));
                        if (c3 > 0) {
                            i14 = AbstractC0953k1.x(c3, C1040k.Y(i16), c3, i14);
                            break;
                        } else {
                            break;
                        }
                    case 45:
                        int e10 = c0.e((List) unsafe.getObject(abstractC1050v, j));
                        if (e10 > 0) {
                            i14 = AbstractC0953k1.x(e10, C1040k.Y(i16), e10, i14);
                            break;
                        } else {
                            break;
                        }
                    case 46:
                        int g11 = c0.g((List) unsafe.getObject(abstractC1050v, j));
                        if (g11 > 0) {
                            i14 = AbstractC0953k1.x(g11, C1040k.Y(i16), g11, i14);
                            break;
                        } else {
                            break;
                        }
                    case 47:
                        int n7 = c0.n((List) unsafe.getObject(abstractC1050v, j));
                        if (n7 > 0) {
                            i14 = AbstractC0953k1.x(n7, C1040k.Y(i16), n7, i14);
                            break;
                        } else {
                            break;
                        }
                    case 48:
                        int p10 = c0.p((List) unsafe.getObject(abstractC1050v, j));
                        if (p10 > 0) {
                            i14 = AbstractC0953k1.x(p10, C1040k.Y(i16), p10, i14);
                            break;
                        } else {
                            break;
                        }
                    case 49:
                        List list3 = (List) unsafe.getObject(abstractC1050v, j);
                        b0 p11 = p(i13);
                        Class cls4 = c0.f16341a;
                        int size3 = list3.size();
                        if (size3 == 0) {
                            i10 = 0;
                        } else {
                            i10 = 0;
                            for (int i24 = 0; i24 < size3; i24++) {
                                i10 += C1040k.V(i16, (AbstractC1030a) list3.get(i24), p11);
                            }
                        }
                        i14 += i10;
                        break;
                    case 50:
                        Object object3 = unsafe.getObject(abstractC1050v, j);
                        Object o9 = o(i13);
                        this.f16322n.getClass();
                        M.a(object3, o9);
                        break;
                    case 51:
                        if (u(i16, i13, abstractC1050v)) {
                            i14 = AbstractC0953k1.w(i16, 8, i14);
                            break;
                        } else {
                            break;
                        }
                    case 52:
                        if (u(i16, i13, abstractC1050v)) {
                            i14 = AbstractC0953k1.w(i16, 4, i14);
                            break;
                        } else {
                            break;
                        }
                    case 53:
                        if (u(i16, i13, abstractC1050v)) {
                            long G8 = G(j, abstractC1050v);
                            Y = C1040k.Y(i16);
                            a02 = C1040k.a0(G8);
                            U8 = a02 + Y;
                            i14 += U8;
                            break;
                        } else {
                            break;
                        }
                    case 54:
                        if (u(i16, i13, abstractC1050v)) {
                            long G9 = G(j, abstractC1050v);
                            Y = C1040k.Y(i16);
                            a02 = C1040k.a0(G9);
                            U8 = a02 + Y;
                            i14 += U8;
                            break;
                        } else {
                            break;
                        }
                    case 55:
                        if (u(i16, i13, abstractC1050v)) {
                            int F2 = F(j, abstractC1050v);
                            Y4 = C1040k.Y(i16);
                            W6 = C1040k.W(F2);
                            U8 = W6 + Y4;
                            i14 += U8;
                            break;
                        } else {
                            break;
                        }
                    case 56:
                        if (u(i16, i13, abstractC1050v)) {
                            U8 = C1040k.U(i16);
                            i14 += U8;
                            break;
                        } else {
                            break;
                        }
                    case 57:
                        if (u(i16, i13, abstractC1050v)) {
                            U8 = C1040k.T(i16);
                            i14 += U8;
                            break;
                        } else {
                            break;
                        }
                    case 58:
                        if (u(i16, i13, abstractC1050v)) {
                            i14 = AbstractC0953k1.w(i16, 1, i14);
                            break;
                        } else {
                            break;
                        }
                    case 59:
                        if (!u(i16, i13, abstractC1050v)) {
                            break;
                        } else {
                            Object object4 = unsafe.getObject(abstractC1050v, j);
                            if (object4 instanceof AbstractC1037h) {
                                R2 = C1040k.R(i16, (AbstractC1037h) object4);
                                i14 = R2 + i14;
                                break;
                            } else {
                                Y8 = C1040k.Y(i16);
                                X8 = C1040k.X((String) object4);
                                R2 = X8 + Y8;
                                i14 = R2 + i14;
                            }
                        }
                    case 60:
                        if (u(i16, i13, abstractC1050v)) {
                            Object object5 = unsafe.getObject(abstractC1050v, j);
                            b0 p12 = p(i13);
                            Class cls5 = c0.f16341a;
                            int Y11 = C1040k.Y(i16);
                            int a9 = ((AbstractC1030a) object5).a(p12);
                            i14 = AbstractC0953k1.x(a9, a9, Y11, i14);
                            break;
                        } else {
                            break;
                        }
                    case 61:
                        if (u(i16, i13, abstractC1050v)) {
                            U8 = C1040k.R(i16, (AbstractC1037h) unsafe.getObject(abstractC1050v, j));
                            i14 += U8;
                            break;
                        } else {
                            break;
                        }
                    case 62:
                        if (u(i16, i13, abstractC1050v)) {
                            int F8 = F(j, abstractC1050v);
                            Y4 = C1040k.Y(i16);
                            W6 = C1040k.Z(F8);
                            U8 = W6 + Y4;
                            i14 += U8;
                            break;
                        } else {
                            break;
                        }
                    case 63:
                        if (u(i16, i13, abstractC1050v)) {
                            int F9 = F(j, abstractC1050v);
                            Y4 = C1040k.Y(i16);
                            W6 = C1040k.W(F9);
                            U8 = W6 + Y4;
                            i14 += U8;
                            break;
                        } else {
                            break;
                        }
                    case 64:
                        if (u(i16, i13, abstractC1050v)) {
                            i14 = AbstractC0953k1.w(i16, 4, i14);
                            break;
                        } else {
                            break;
                        }
                    case 65:
                        if (u(i16, i13, abstractC1050v)) {
                            i14 = AbstractC0953k1.w(i16, 8, i14);
                            break;
                        } else {
                            break;
                        }
                    case 66:
                        if (u(i16, i13, abstractC1050v)) {
                            int F10 = F(j, abstractC1050v);
                            Y4 = C1040k.Y(i16);
                            W6 = C1040k.Z((F10 >> 31) ^ (F10 << 1));
                            U8 = W6 + Y4;
                            i14 += U8;
                            break;
                        } else {
                            break;
                        }
                    case 67:
                        if (u(i16, i13, abstractC1050v)) {
                            long G10 = G(j, abstractC1050v);
                            Y = C1040k.Y(i16);
                            a02 = C1040k.a0((G10 >> 63) ^ (G10 << 1));
                            U8 = a02 + Y;
                            i14 += U8;
                            break;
                        } else {
                            break;
                        }
                    case 68:
                        if (u(i16, i13, abstractC1050v)) {
                            U8 = C1040k.V(i16, (AbstractC1030a) unsafe.getObject(abstractC1050v, j), p(i13));
                            i14 += U8;
                            break;
                        } else {
                            break;
                        }
                }
                i13 += 3;
                i11 = 1048575;
            } else {
                this.f16321m.getClass();
                return abstractC1050v.unknownFields.b() + i14;
            }
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:10:0x002f. Please report as an issue. */
    public final int r(AbstractC1050v abstractC1050v) {
        int Y;
        int a02;
        int Y4;
        int W6;
        int U8;
        int Y8;
        int X8;
        int R2;
        int Y9;
        int a03;
        int Y10;
        int i9;
        Unsafe unsafe = f16309p;
        int i10 = 0;
        int i11 = 0;
        while (true) {
            int[] iArr = this.f16310a;
            if (i10 < iArr.length) {
                int X9 = X(i10);
                int W8 = W(X9);
                int i12 = iArr[i10];
                long j = X9 & 1048575;
                if (W8 >= EnumC1046q.f16395b.f16399a && W8 <= EnumC1046q.f16396c.f16399a) {
                    int i13 = iArr[i10 + 2];
                }
                switch (W8) {
                    case 0:
                        if (s(i10, abstractC1050v)) {
                            i11 = AbstractC0953k1.w(i12, 8, i11);
                            break;
                        } else {
                            break;
                        }
                    case 1:
                        if (s(i10, abstractC1050v)) {
                            i11 = AbstractC0953k1.w(i12, 4, i11);
                            break;
                        } else {
                            break;
                        }
                    case 2:
                        if (s(i10, abstractC1050v)) {
                            long h7 = n0.f16387c.h(j, abstractC1050v);
                            Y = C1040k.Y(i12);
                            a02 = C1040k.a0(h7);
                            U8 = a02 + Y;
                            i11 += U8;
                            break;
                        } else {
                            break;
                        }
                    case 3:
                        if (s(i10, abstractC1050v)) {
                            long h9 = n0.f16387c.h(j, abstractC1050v);
                            Y = C1040k.Y(i12);
                            a02 = C1040k.a0(h9);
                            U8 = a02 + Y;
                            i11 += U8;
                            break;
                        } else {
                            break;
                        }
                    case 4:
                        if (s(i10, abstractC1050v)) {
                            int g9 = n0.f16387c.g(j, abstractC1050v);
                            Y4 = C1040k.Y(i12);
                            W6 = C1040k.W(g9);
                            U8 = W6 + Y4;
                            i11 += U8;
                            break;
                        } else {
                            break;
                        }
                    case 5:
                        if (s(i10, abstractC1050v)) {
                            U8 = C1040k.U(i12);
                            i11 += U8;
                            break;
                        } else {
                            break;
                        }
                    case 6:
                        if (s(i10, abstractC1050v)) {
                            U8 = C1040k.T(i12);
                            i11 += U8;
                            break;
                        } else {
                            break;
                        }
                    case 7:
                        if (s(i10, abstractC1050v)) {
                            i11 = AbstractC0953k1.w(i12, 1, i11);
                            break;
                        } else {
                            break;
                        }
                    case 8:
                        if (!s(i10, abstractC1050v)) {
                            break;
                        } else {
                            Object i14 = n0.f16387c.i(j, abstractC1050v);
                            if (i14 instanceof AbstractC1037h) {
                                R2 = C1040k.R(i12, (AbstractC1037h) i14);
                                i11 = R2 + i11;
                                break;
                            } else {
                                Y8 = C1040k.Y(i12);
                                X8 = C1040k.X((String) i14);
                                R2 = X8 + Y8;
                                i11 = R2 + i11;
                            }
                        }
                    case 9:
                        if (s(i10, abstractC1050v)) {
                            Object i15 = n0.f16387c.i(j, abstractC1050v);
                            b0 p9 = p(i10);
                            Class cls = c0.f16341a;
                            int Y11 = C1040k.Y(i12);
                            int a5 = ((AbstractC1030a) i15).a(p9);
                            i11 = AbstractC0953k1.x(a5, a5, Y11, i11);
                            break;
                        } else {
                            break;
                        }
                    case R.styleable.GradientColor_android_endX /* 10 */:
                        if (s(i10, abstractC1050v)) {
                            U8 = C1040k.R(i12, (AbstractC1037h) n0.f16387c.i(j, abstractC1050v));
                            i11 += U8;
                            break;
                        } else {
                            break;
                        }
                    case R.styleable.GradientColor_android_endY /* 11 */:
                        if (s(i10, abstractC1050v)) {
                            int g10 = n0.f16387c.g(j, abstractC1050v);
                            Y4 = C1040k.Y(i12);
                            W6 = C1040k.Z(g10);
                            U8 = W6 + Y4;
                            i11 += U8;
                            break;
                        } else {
                            break;
                        }
                    case 12:
                        if (s(i10, abstractC1050v)) {
                            int g11 = n0.f16387c.g(j, abstractC1050v);
                            Y4 = C1040k.Y(i12);
                            W6 = C1040k.W(g11);
                            U8 = W6 + Y4;
                            i11 += U8;
                            break;
                        } else {
                            break;
                        }
                    case 13:
                        if (s(i10, abstractC1050v)) {
                            i11 = AbstractC0953k1.w(i12, 4, i11);
                            break;
                        } else {
                            break;
                        }
                    case 14:
                        if (s(i10, abstractC1050v)) {
                            i11 = AbstractC0953k1.w(i12, 8, i11);
                            break;
                        } else {
                            break;
                        }
                    case 15:
                        if (s(i10, abstractC1050v)) {
                            int g12 = n0.f16387c.g(j, abstractC1050v);
                            Y4 = C1040k.Y(i12);
                            W6 = C1040k.Z((g12 >> 31) ^ (g12 << 1));
                            U8 = W6 + Y4;
                            i11 += U8;
                            break;
                        } else {
                            break;
                        }
                    case 16:
                        if (s(i10, abstractC1050v)) {
                            long h10 = n0.f16387c.h(j, abstractC1050v);
                            Y9 = C1040k.Y(i12);
                            a03 = C1040k.a0((h10 >> 63) ^ (h10 << 1));
                            U8 = a03 + Y9;
                            i11 += U8;
                            break;
                        } else {
                            break;
                        }
                    case 17:
                        if (s(i10, abstractC1050v)) {
                            U8 = C1040k.V(i12, (AbstractC1030a) n0.f16387c.i(j, abstractC1050v), p(i10));
                            i11 += U8;
                            break;
                        } else {
                            break;
                        }
                    case 18:
                        U8 = c0.f(v(abstractC1050v, j), i12);
                        i11 += U8;
                        break;
                    case 19:
                        U8 = c0.d(v(abstractC1050v, j), i12);
                        i11 += U8;
                        break;
                    case 20:
                        U8 = c0.j(v(abstractC1050v, j), i12);
                        i11 += U8;
                        break;
                    case 21:
                        U8 = c0.t(v(abstractC1050v, j), i12);
                        i11 += U8;
                        break;
                    case 22:
                        U8 = c0.h(v(abstractC1050v, j), i12);
                        i11 += U8;
                        break;
                    case 23:
                        U8 = c0.f(v(abstractC1050v, j), i12);
                        i11 += U8;
                        break;
                    case 24:
                        U8 = c0.d(v(abstractC1050v, j), i12);
                        i11 += U8;
                        break;
                    case 25:
                        List v8 = v(abstractC1050v, j);
                        Class cls2 = c0.f16341a;
                        int size = v8.size();
                        if (size == 0) {
                            Y10 = 0;
                        } else {
                            Y10 = (C1040k.Y(i12) + 1) * size;
                        }
                        i11 += Y10;
                        break;
                    case 26:
                        U8 = c0.q(v(abstractC1050v, j), i12);
                        i11 += U8;
                        break;
                    case 27:
                        U8 = c0.l(i12, v(abstractC1050v, j), p(i10));
                        i11 += U8;
                        break;
                    case 28:
                        U8 = c0.a(v(abstractC1050v, j), i12);
                        i11 += U8;
                        break;
                    case 29:
                        U8 = c0.r(v(abstractC1050v, j), i12);
                        i11 += U8;
                        break;
                    case 30:
                        U8 = c0.b(v(abstractC1050v, j), i12);
                        i11 += U8;
                        break;
                    case 31:
                        U8 = c0.d(v(abstractC1050v, j), i12);
                        i11 += U8;
                        break;
                    case 32:
                        U8 = c0.f(v(abstractC1050v, j), i12);
                        i11 += U8;
                        break;
                    case 33:
                        U8 = c0.m(v(abstractC1050v, j), i12);
                        i11 += U8;
                        break;
                    case 34:
                        U8 = c0.o(v(abstractC1050v, j), i12);
                        i11 += U8;
                        break;
                    case 35:
                        int g13 = c0.g((List) unsafe.getObject(abstractC1050v, j));
                        if (g13 > 0) {
                            i11 = AbstractC0953k1.x(g13, C1040k.Y(i12), g13, i11);
                            break;
                        } else {
                            break;
                        }
                    case 36:
                        int e8 = c0.e((List) unsafe.getObject(abstractC1050v, j));
                        if (e8 > 0) {
                            i11 = AbstractC0953k1.x(e8, C1040k.Y(i12), e8, i11);
                            break;
                        } else {
                            break;
                        }
                    case 37:
                        int k5 = c0.k((List) unsafe.getObject(abstractC1050v, j));
                        if (k5 > 0) {
                            i11 = AbstractC0953k1.x(k5, C1040k.Y(i12), k5, i11);
                            break;
                        } else {
                            break;
                        }
                    case 38:
                        int u9 = c0.u((List) unsafe.getObject(abstractC1050v, j));
                        if (u9 > 0) {
                            i11 = AbstractC0953k1.x(u9, C1040k.Y(i12), u9, i11);
                            break;
                        } else {
                            break;
                        }
                    case 39:
                        int i16 = c0.i((List) unsafe.getObject(abstractC1050v, j));
                        if (i16 > 0) {
                            i11 = AbstractC0953k1.x(i16, C1040k.Y(i12), i16, i11);
                            break;
                        } else {
                            break;
                        }
                    case 40:
                        int g14 = c0.g((List) unsafe.getObject(abstractC1050v, j));
                        if (g14 > 0) {
                            i11 = AbstractC0953k1.x(g14, C1040k.Y(i12), g14, i11);
                            break;
                        } else {
                            break;
                        }
                    case 41:
                        int e9 = c0.e((List) unsafe.getObject(abstractC1050v, j));
                        if (e9 > 0) {
                            i11 = AbstractC0953k1.x(e9, C1040k.Y(i12), e9, i11);
                            break;
                        } else {
                            break;
                        }
                    case 42:
                        List list = (List) unsafe.getObject(abstractC1050v, j);
                        Class cls3 = c0.f16341a;
                        int size2 = list.size();
                        if (size2 > 0) {
                            i11 = AbstractC0953k1.x(size2, C1040k.Y(i12), size2, i11);
                            break;
                        } else {
                            break;
                        }
                    case 43:
                        int s9 = c0.s((List) unsafe.getObject(abstractC1050v, j));
                        if (s9 > 0) {
                            i11 = AbstractC0953k1.x(s9, C1040k.Y(i12), s9, i11);
                            break;
                        } else {
                            break;
                        }
                    case 44:
                        int c3 = c0.c((List) unsafe.getObject(abstractC1050v, j));
                        if (c3 > 0) {
                            i11 = AbstractC0953k1.x(c3, C1040k.Y(i12), c3, i11);
                            break;
                        } else {
                            break;
                        }
                    case 45:
                        int e10 = c0.e((List) unsafe.getObject(abstractC1050v, j));
                        if (e10 > 0) {
                            i11 = AbstractC0953k1.x(e10, C1040k.Y(i12), e10, i11);
                            break;
                        } else {
                            break;
                        }
                    case 46:
                        int g15 = c0.g((List) unsafe.getObject(abstractC1050v, j));
                        if (g15 > 0) {
                            i11 = AbstractC0953k1.x(g15, C1040k.Y(i12), g15, i11);
                            break;
                        } else {
                            break;
                        }
                    case 47:
                        int n7 = c0.n((List) unsafe.getObject(abstractC1050v, j));
                        if (n7 > 0) {
                            i11 = AbstractC0953k1.x(n7, C1040k.Y(i12), n7, i11);
                            break;
                        } else {
                            break;
                        }
                    case 48:
                        int p10 = c0.p((List) unsafe.getObject(abstractC1050v, j));
                        if (p10 > 0) {
                            i11 = AbstractC0953k1.x(p10, C1040k.Y(i12), p10, i11);
                            break;
                        } else {
                            break;
                        }
                    case 49:
                        List v9 = v(abstractC1050v, j);
                        b0 p11 = p(i10);
                        Class cls4 = c0.f16341a;
                        int size3 = v9.size();
                        if (size3 == 0) {
                            i9 = 0;
                        } else {
                            i9 = 0;
                            for (int i17 = 0; i17 < size3; i17++) {
                                i9 += C1040k.V(i12, (AbstractC1030a) v9.get(i17), p11);
                            }
                        }
                        i11 += i9;
                        break;
                    case 50:
                        Object i18 = n0.f16387c.i(j, abstractC1050v);
                        Object o9 = o(i10);
                        this.f16322n.getClass();
                        M.a(i18, o9);
                        break;
                    case 51:
                        if (u(i12, i10, abstractC1050v)) {
                            i11 = AbstractC0953k1.w(i12, 8, i11);
                            break;
                        } else {
                            break;
                        }
                    case 52:
                        if (u(i12, i10, abstractC1050v)) {
                            i11 = AbstractC0953k1.w(i12, 4, i11);
                            break;
                        } else {
                            break;
                        }
                    case 53:
                        if (u(i12, i10, abstractC1050v)) {
                            long G8 = G(j, abstractC1050v);
                            Y = C1040k.Y(i12);
                            a02 = C1040k.a0(G8);
                            U8 = a02 + Y;
                            i11 += U8;
                            break;
                        } else {
                            break;
                        }
                    case 54:
                        if (u(i12, i10, abstractC1050v)) {
                            long G9 = G(j, abstractC1050v);
                            Y = C1040k.Y(i12);
                            a02 = C1040k.a0(G9);
                            U8 = a02 + Y;
                            i11 += U8;
                            break;
                        } else {
                            break;
                        }
                    case 55:
                        if (u(i12, i10, abstractC1050v)) {
                            int F2 = F(j, abstractC1050v);
                            Y4 = C1040k.Y(i12);
                            W6 = C1040k.W(F2);
                            U8 = W6 + Y4;
                            i11 += U8;
                            break;
                        } else {
                            break;
                        }
                    case 56:
                        if (u(i12, i10, abstractC1050v)) {
                            U8 = C1040k.U(i12);
                            i11 += U8;
                            break;
                        } else {
                            break;
                        }
                    case 57:
                        if (u(i12, i10, abstractC1050v)) {
                            U8 = C1040k.T(i12);
                            i11 += U8;
                            break;
                        } else {
                            break;
                        }
                    case 58:
                        if (u(i12, i10, abstractC1050v)) {
                            i11 = AbstractC0953k1.w(i12, 1, i11);
                            break;
                        } else {
                            break;
                        }
                    case 59:
                        if (!u(i12, i10, abstractC1050v)) {
                            break;
                        } else {
                            Object i19 = n0.f16387c.i(j, abstractC1050v);
                            if (i19 instanceof AbstractC1037h) {
                                R2 = C1040k.R(i12, (AbstractC1037h) i19);
                                i11 = R2 + i11;
                                break;
                            } else {
                                Y8 = C1040k.Y(i12);
                                X8 = C1040k.X((String) i19);
                                R2 = X8 + Y8;
                                i11 = R2 + i11;
                            }
                        }
                    case 60:
                        if (u(i12, i10, abstractC1050v)) {
                            Object i20 = n0.f16387c.i(j, abstractC1050v);
                            b0 p12 = p(i10);
                            Class cls5 = c0.f16341a;
                            int Y12 = C1040k.Y(i12);
                            int a9 = ((AbstractC1030a) i20).a(p12);
                            i11 = AbstractC0953k1.x(a9, a9, Y12, i11);
                            break;
                        } else {
                            break;
                        }
                    case 61:
                        if (u(i12, i10, abstractC1050v)) {
                            U8 = C1040k.R(i12, (AbstractC1037h) n0.f16387c.i(j, abstractC1050v));
                            i11 += U8;
                            break;
                        } else {
                            break;
                        }
                    case 62:
                        if (u(i12, i10, abstractC1050v)) {
                            int F8 = F(j, abstractC1050v);
                            Y4 = C1040k.Y(i12);
                            W6 = C1040k.Z(F8);
                            U8 = W6 + Y4;
                            i11 += U8;
                            break;
                        } else {
                            break;
                        }
                    case 63:
                        if (u(i12, i10, abstractC1050v)) {
                            int F9 = F(j, abstractC1050v);
                            Y4 = C1040k.Y(i12);
                            W6 = C1040k.W(F9);
                            U8 = W6 + Y4;
                            i11 += U8;
                            break;
                        } else {
                            break;
                        }
                    case 64:
                        if (u(i12, i10, abstractC1050v)) {
                            i11 = AbstractC0953k1.w(i12, 4, i11);
                            break;
                        } else {
                            break;
                        }
                    case 65:
                        if (u(i12, i10, abstractC1050v)) {
                            i11 = AbstractC0953k1.w(i12, 8, i11);
                            break;
                        } else {
                            break;
                        }
                    case 66:
                        if (u(i12, i10, abstractC1050v)) {
                            int F10 = F(j, abstractC1050v);
                            Y4 = C1040k.Y(i12);
                            W6 = C1040k.Z((F10 >> 31) ^ (F10 << 1));
                            U8 = W6 + Y4;
                            i11 += U8;
                            break;
                        } else {
                            break;
                        }
                    case 67:
                        if (u(i12, i10, abstractC1050v)) {
                            long G10 = G(j, abstractC1050v);
                            Y9 = C1040k.Y(i12);
                            a03 = C1040k.a0((G10 >> 63) ^ (G10 << 1));
                            U8 = a03 + Y9;
                            i11 += U8;
                            break;
                        } else {
                            break;
                        }
                    case 68:
                        if (u(i12, i10, abstractC1050v)) {
                            U8 = C1040k.V(i12, (AbstractC1030a) n0.f16387c.i(j, abstractC1050v), p(i10));
                            i11 += U8;
                            break;
                        } else {
                            break;
                        }
                }
                i10 += 3;
            } else {
                this.f16321m.getClass();
                return abstractC1050v.unknownFields.b() + i11;
            }
        }
    }

    public final boolean s(int i9, Object obj) {
        int i10 = this.f16310a[i9 + 2];
        long j = i10 & 1048575;
        if (j == 1048575) {
            int X8 = X(i9);
            long j4 = X8 & 1048575;
            switch (W(X8)) {
                case 0:
                    if (Double.doubleToRawLongBits(n0.f16387c.e(j4, obj)) == 0) {
                        return false;
                    }
                    break;
                case 1:
                    if (Float.floatToRawIntBits(n0.f16387c.f(j4, obj)) == 0) {
                        return false;
                    }
                    break;
                case 2:
                    if (n0.f16387c.h(j4, obj) == 0) {
                        return false;
                    }
                    break;
                case 3:
                    if (n0.f16387c.h(j4, obj) == 0) {
                        return false;
                    }
                    break;
                case 4:
                    if (n0.f16387c.g(j4, obj) == 0) {
                        return false;
                    }
                    break;
                case 5:
                    if (n0.f16387c.h(j4, obj) == 0) {
                        return false;
                    }
                    break;
                case 6:
                    if (n0.f16387c.g(j4, obj) == 0) {
                        return false;
                    }
                    break;
                case 7:
                    return n0.f16387c.c(j4, obj);
                case 8:
                    Object i11 = n0.f16387c.i(j4, obj);
                    if (i11 instanceof String) {
                        return !((String) i11).isEmpty();
                    }
                    if (i11 instanceof AbstractC1037h) {
                        return !AbstractC1037h.f16356b.equals(i11);
                    }
                    throw new IllegalArgumentException();
                case 9:
                    if (n0.f16387c.i(j4, obj) == null) {
                        return false;
                    }
                    break;
                case R.styleable.GradientColor_android_endX /* 10 */:
                    return !AbstractC1037h.f16356b.equals(n0.f16387c.i(j4, obj));
                case R.styleable.GradientColor_android_endY /* 11 */:
                    if (n0.f16387c.g(j4, obj) == 0) {
                        return false;
                    }
                    break;
                case 12:
                    if (n0.f16387c.g(j4, obj) == 0) {
                        return false;
                    }
                    break;
                case 13:
                    if (n0.f16387c.g(j4, obj) == 0) {
                        return false;
                    }
                    break;
                case 14:
                    if (n0.f16387c.h(j4, obj) == 0) {
                        return false;
                    }
                    break;
                case 15:
                    if (n0.f16387c.g(j4, obj) == 0) {
                        return false;
                    }
                    break;
                case 16:
                    if (n0.f16387c.h(j4, obj) == 0) {
                        return false;
                    }
                    break;
                case 17:
                    if (n0.f16387c.i(j4, obj) == null) {
                        return false;
                    }
                    break;
                default:
                    throw new IllegalArgumentException();
            }
        } else if (((1 << (i10 >>> 20)) & n0.f16387c.g(j, obj)) == 0) {
            return false;
        }
        return true;
    }

    public final boolean u(int i9, int i10, Object obj) {
        if (n0.f16387c.g(this.f16310a[i10 + 2] & 1048575, obj) == i9) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:201:0x0064, code lost:
    
        if (r13 != null) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x009e, code lost:
    
        if (r13 != null) goto L17;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:15:0x0078. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:38:0x062c A[Catch: all -> 0x048b, TryCatch #6 {all -> 0x048b, blocks: (B:36:0x0627, B:38:0x062c, B:39:0x0631, B:159:0x047f, B:162:0x048e, B:163:0x04a7, B:164:0x04c0, B:165:0x04d9, B:166:0x04f5, B:167:0x050e, B:168:0x0523, B:169:0x053e, B:170:0x054b, B:171:0x0566, B:172:0x057f, B:173:0x0598, B:174:0x05b1, B:175:0x05ca, B:176:0x05e3, B:177:0x05fd, B:182:0x0617), top: B:35:0x0627 }] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0637 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0657 A[LOOP:3: B:54:0x0655->B:55:0x0657, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0661  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void w(com.google.crypto.tink.shaded.protobuf.f0 r20, java.lang.Object r21, F0.C0120y r22, com.google.crypto.tink.shaded.protobuf.C1043n r23) {
        /*
            Method dump skipped, instructions count: 1784
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.crypto.tink.shaded.protobuf.S.w(com.google.crypto.tink.shaded.protobuf.f0, java.lang.Object, F0.y, com.google.crypto.tink.shaded.protobuf.n):void");
    }

    public final void x(Object obj, int i9, Object obj2) {
        long X8 = X(i9) & 1048575;
        Object i10 = n0.f16387c.i(X8, obj);
        M m9 = this.f16322n;
        if (i10 != null) {
            m9.getClass();
            if (!((L) i10).f16304a) {
                L e8 = L.f16303b.e();
                M.b(e8, i10);
                n0.p(obj, X8, e8);
                i10 = e8;
            }
        } else {
            m9.getClass();
            i10 = L.f16303b.e();
            n0.p(obj, X8, i10);
        }
        m9.getClass();
        A0.a.x(obj2);
        throw null;
    }

    public final void y(Object obj, int i9, Object obj2) {
        if (!s(i9, obj2)) {
            return;
        }
        long X8 = X(i9) & 1048575;
        Unsafe unsafe = f16309p;
        Object object = unsafe.getObject(obj2, X8);
        if (object != null) {
            b0 p9 = p(i9);
            if (!s(i9, obj)) {
                if (!t(object)) {
                    unsafe.putObject(obj, X8, object);
                } else {
                    Object d9 = p9.d();
                    p9.a(d9, object);
                    unsafe.putObject(obj, X8, d9);
                }
                R(i9, obj);
                return;
            }
            Object object2 = unsafe.getObject(obj, X8);
            if (!t(object2)) {
                Object d10 = p9.d();
                p9.a(d10, object2);
                unsafe.putObject(obj, X8, d10);
                object2 = d10;
            }
            p9.a(object2, object);
            return;
        }
        throw new IllegalStateException("Source subfield " + this.f16310a[i9] + " is present but null: " + obj2);
    }

    public final void z(Object obj, int i9, Object obj2) {
        int[] iArr = this.f16310a;
        int i10 = iArr[i9];
        if (!u(i10, i9, obj2)) {
            return;
        }
        long X8 = X(i9) & 1048575;
        Unsafe unsafe = f16309p;
        Object object = unsafe.getObject(obj2, X8);
        if (object != null) {
            b0 p9 = p(i9);
            if (!u(i10, i9, obj)) {
                if (!t(object)) {
                    unsafe.putObject(obj, X8, object);
                } else {
                    Object d9 = p9.d();
                    p9.a(d9, object);
                    unsafe.putObject(obj, X8, d9);
                }
                S(i10, i9, obj);
                return;
            }
            Object object2 = unsafe.getObject(obj, X8);
            if (!t(object2)) {
                Object d10 = p9.d();
                p9.a(d10, object2);
                unsafe.putObject(obj, X8, d10);
                object2 = d10;
            }
            p9.a(object2, object);
            return;
        }
        throw new IllegalStateException("Source subfield " + iArr[i9] + " is present but null: " + obj2);
    }
}
