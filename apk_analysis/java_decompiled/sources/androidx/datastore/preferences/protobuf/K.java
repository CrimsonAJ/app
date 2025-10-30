package androidx.datastore.preferences.protobuf;

import F0.C0120y;
import co.notix.R;
import com.google.android.gms.internal.measurement.AbstractC0953k1;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import sun.misc.Unsafe;

/* loaded from: classes.dex */
public final class K implements T {

    /* renamed from: n, reason: collision with root package name */
    public static final int[] f9635n = new int[0];

    /* renamed from: o, reason: collision with root package name */
    public static final Unsafe f9636o = g0.i();

    /* renamed from: a, reason: collision with root package name */
    public final int[] f9637a;

    /* renamed from: b, reason: collision with root package name */
    public final Object[] f9638b;

    /* renamed from: c, reason: collision with root package name */
    public final int f9639c;

    /* renamed from: d, reason: collision with root package name */
    public final int f9640d;

    /* renamed from: e, reason: collision with root package name */
    public final AbstractC0533t f9641e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f9642f;

    /* renamed from: g, reason: collision with root package name */
    public final int[] f9643g;

    /* renamed from: h, reason: collision with root package name */
    public final int f9644h;

    /* renamed from: i, reason: collision with root package name */
    public final int f9645i;
    public final M j;

    /* renamed from: k, reason: collision with root package name */
    public final C0539z f9646k;

    /* renamed from: l, reason: collision with root package name */
    public final b0 f9647l;

    /* renamed from: m, reason: collision with root package name */
    public final G f9648m;

    public K(int[] iArr, Object[] objArr, int i9, int i10, AbstractC0533t abstractC0533t, int[] iArr2, int i11, int i12, M m9, C0539z c0539z, b0 b0Var, C0527m c0527m, G g9) {
        this.f9637a = iArr;
        this.f9638b = objArr;
        this.f9639c = i9;
        this.f9640d = i10;
        this.f9642f = u0.z.i(abstractC0533t);
        this.f9643g = iArr2;
        this.f9644h = i11;
        this.f9645i = i12;
        this.j = m9;
        this.f9646k = c0539z;
        this.f9647l = b0Var;
        this.f9641e = abstractC0533t;
        this.f9648m = g9;
    }

    public static long A(long j, Object obj) {
        return ((Long) g0.f9706c.h(j, obj)).longValue();
    }

    public static Field G(Class cls, String str) {
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

    public static int L(int i9) {
        return (i9 & 267386880) >>> 20;
    }

    public static boolean p(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof AbstractC0533t) {
            return ((AbstractC0533t) obj).g();
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:63:0x0267  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0284  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0287  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x026e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static androidx.datastore.preferences.protobuf.K x(androidx.datastore.preferences.protobuf.S r34, androidx.datastore.preferences.protobuf.M r35, androidx.datastore.preferences.protobuf.C0539z r36, androidx.datastore.preferences.protobuf.b0 r37, androidx.datastore.preferences.protobuf.C0527m r38, androidx.datastore.preferences.protobuf.G r39) {
        /*
            Method dump skipped, instructions count: 1023
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.K.x(androidx.datastore.preferences.protobuf.S, androidx.datastore.preferences.protobuf.M, androidx.datastore.preferences.protobuf.z, androidx.datastore.preferences.protobuf.b0, androidx.datastore.preferences.protobuf.m, androidx.datastore.preferences.protobuf.G):androidx.datastore.preferences.protobuf.K");
    }

    public static long y(int i9) {
        return i9 & 1048575;
    }

    public static int z(long j, Object obj) {
        return ((Integer) g0.f9706c.h(j, obj)).intValue();
    }

    public final int B(int i9) {
        if (i9 >= this.f9639c && i9 <= this.f9640d) {
            int[] iArr = this.f9637a;
            int length = (iArr.length / 3) - 1;
            int i10 = 0;
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
        }
        return -1;
    }

    public final void C(Object obj, long j, C0120y c0120y, T t7, C0526l c0526l) {
        int C8;
        this.f9646k.getClass();
        InterfaceC0534u a5 = C0539z.a(j, obj);
        int i9 = c0120y.f2290b;
        if ((i9 & 7) != 3) {
            throw C0537x.b();
        }
        do {
            AbstractC0533t d9 = t7.d();
            c0120y.f(d9, t7, c0526l);
            t7.b(d9);
            ((Q) a5).add(d9);
            W5.d dVar = (W5.d) c0120y.f2293e;
            if (!dVar.g() && c0120y.f2292d == 0) {
                C8 = dVar.C();
            } else {
                return;
            }
        } while (C8 == i9);
        c0120y.f2292d = C8;
    }

    public final void D(Object obj, int i9, C0120y c0120y, T t7, C0526l c0526l) {
        int C8;
        this.f9646k.getClass();
        InterfaceC0534u a5 = C0539z.a(i9 & 1048575, obj);
        int i10 = c0120y.f2290b;
        if ((i10 & 7) != 2) {
            throw C0537x.b();
        }
        do {
            AbstractC0533t d9 = t7.d();
            c0120y.h(d9, t7, c0526l);
            t7.b(d9);
            ((Q) a5).add(d9);
            W5.d dVar = (W5.d) c0120y.f2293e;
            if (!dVar.g() && c0120y.f2292d == 0) {
                C8 = dVar.C();
            } else {
                return;
            }
        } while (C8 == i10);
        c0120y.f2292d = C8;
    }

    public final void E(int i9, C0120y c0120y, Object obj) {
        boolean z9;
        if ((536870912 & i9) != 0) {
            z9 = true;
        } else {
            z9 = false;
        }
        if (z9) {
            c0120y.T(2);
            g0.o(obj, i9 & 1048575, ((W5.d) c0120y.f2293e).B());
        } else if (this.f9642f) {
            c0120y.T(2);
            g0.o(obj, i9 & 1048575, ((W5.d) c0120y.f2293e).A());
        } else {
            g0.o(obj, i9 & 1048575, c0120y.l());
        }
    }

    public final void F(int i9, C0120y c0120y, Object obj) {
        boolean z9;
        if ((536870912 & i9) != 0) {
            z9 = true;
        } else {
            z9 = false;
        }
        C0539z c0539z = this.f9646k;
        if (z9) {
            c0539z.getClass();
            c0120y.M(C0539z.a(i9 & 1048575, obj), true);
        } else {
            c0539z.getClass();
            c0120y.M(C0539z.a(i9 & 1048575, obj), false);
        }
    }

    public final void H(int i9, Object obj) {
        int i10 = this.f9637a[i9 + 2];
        long j = 1048575 & i10;
        if (j == 1048575) {
            return;
        }
        g0.m((1 << (i10 >>> 20)) | g0.f9706c.f(j, obj), j, obj);
    }

    public final void I(int i9, int i10, Object obj) {
        g0.m(i9, this.f9637a[i10 + 2] & 1048575, obj);
    }

    public final void J(Object obj, int i9, AbstractC0515a abstractC0515a) {
        f9636o.putObject(obj, M(i9) & 1048575, abstractC0515a);
        H(i9, obj);
    }

    public final void K(Object obj, int i9, int i10, AbstractC0515a abstractC0515a) {
        f9636o.putObject(obj, M(i10) & 1048575, abstractC0515a);
        I(i9, i10, obj);
    }

    public final int M(int i9) {
        return this.f9637a[i9 + 1];
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:13:0x004a. Please report as an issue. */
    public final void N(Object obj, C c3) {
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        boolean z9;
        K k5 = this;
        int i15 = 2;
        int[] iArr = k5.f9637a;
        int length = iArr.length;
        Unsafe unsafe = f9636o;
        int i16 = 1048575;
        int i17 = 1048575;
        int i18 = 0;
        int i19 = 0;
        while (i18 < length) {
            int M7 = k5.M(i18);
            int i20 = iArr[i18];
            int L8 = L(M7);
            if (L8 <= 17) {
                int i21 = iArr[i18 + 2];
                i9 = 1;
                int i22 = i21 & i16;
                if (i22 != i17) {
                    if (i22 == i16) {
                        i19 = 0;
                    } else {
                        i19 = unsafe.getInt(obj, i22);
                    }
                    i17 = i22;
                }
                i10 = M7;
                i11 = 1 << (i21 >>> 20);
            } else {
                i9 = 1;
                i10 = M7;
                i11 = 0;
            }
            int i23 = i15;
            long j = i10 & i16;
            switch (L8) {
                case 0:
                    if (k5.o(obj, i18, i17, i19, i11)) {
                        double d9 = g0.f9706c.d(j, obj);
                        C0524j c0524j = (C0524j) c3.f9625a;
                        c0524j.getClass();
                        c0524j.X(Double.doubleToRawLongBits(d9), i20);
                        break;
                    } else {
                        break;
                    }
                case 1:
                    if (k5.o(obj, i18, i17, i19, i11)) {
                        float e8 = g0.f9706c.e(j, obj);
                        C0524j c0524j2 = (C0524j) c3.f9625a;
                        c0524j2.getClass();
                        c0524j2.V(i20, Float.floatToRawIntBits(e8));
                    }
                    k5 = this;
                    break;
                case 2:
                    if (k5.o(obj, i18, i17, i19, i11)) {
                        ((C0524j) c3.f9625a).h0(unsafe.getLong(obj, j), i20);
                    }
                    k5 = this;
                    break;
                case 3:
                    if (k5.o(obj, i18, i17, i19, i11)) {
                        ((C0524j) c3.f9625a).h0(unsafe.getLong(obj, j), i20);
                    }
                    k5 = this;
                    break;
                case 4:
                    if (k5.o(obj, i18, i17, i19, i11)) {
                        ((C0524j) c3.f9625a).Z(i20, unsafe.getInt(obj, j));
                    }
                    k5 = this;
                    break;
                case 5:
                    if (k5.o(obj, i18, i17, i19, i11)) {
                        ((C0524j) c3.f9625a).X(unsafe.getLong(obj, j), i20);
                    }
                    k5 = this;
                    break;
                case 6:
                    if (k5.o(obj, i18, i17, i19, i11)) {
                        ((C0524j) c3.f9625a).V(i20, unsafe.getInt(obj, j));
                    }
                    k5 = this;
                    break;
                case 7:
                    if (k5.o(obj, i18, i17, i19, i11)) {
                        ((C0524j) c3.f9625a).S(i20, g0.f9706c.c(j, obj));
                    }
                    k5 = this;
                    break;
                case 8:
                    if (k5.o(obj, i18, i17, i19, i11)) {
                        Object object = unsafe.getObject(obj, j);
                        if (object instanceof String) {
                            ((C0524j) c3.f9625a).c0(i20, (String) object);
                        } else {
                            ((C0524j) c3.f9625a).T(i20, (C0521g) object);
                        }
                    }
                    k5 = this;
                    break;
                case 9:
                    if (k5.o(obj, i18, i17, i19, i11)) {
                        ((C0524j) c3.f9625a).b0(i20, (AbstractC0515a) unsafe.getObject(obj, j), k5.m(i18));
                        break;
                    } else {
                        break;
                    }
                case R.styleable.GradientColor_android_endX /* 10 */:
                    if (k5.o(obj, i18, i17, i19, i11)) {
                        ((C0524j) c3.f9625a).T(i20, (C0521g) unsafe.getObject(obj, j));
                    }
                    k5 = this;
                    break;
                case R.styleable.GradientColor_android_endY /* 11 */:
                    if (k5.o(obj, i18, i17, i19, i11)) {
                        ((C0524j) c3.f9625a).f0(i20, unsafe.getInt(obj, j));
                    }
                    k5 = this;
                    break;
                case 12:
                    if (k5.o(obj, i18, i17, i19, i11)) {
                        ((C0524j) c3.f9625a).Z(i20, unsafe.getInt(obj, j));
                    }
                    k5 = this;
                    break;
                case 13:
                    if (k5.o(obj, i18, i17, i19, i11)) {
                        ((C0524j) c3.f9625a).V(i20, unsafe.getInt(obj, j));
                    }
                    k5 = this;
                    break;
                case 14:
                    if (k5.o(obj, i18, i17, i19, i11)) {
                        ((C0524j) c3.f9625a).X(unsafe.getLong(obj, j), i20);
                    }
                    k5 = this;
                    break;
                case 15:
                    if (k5.o(obj, i18, i17, i19, i11)) {
                        int i24 = unsafe.getInt(obj, j);
                        ((C0524j) c3.f9625a).f0(i20, (i24 >> 31) ^ (i24 << 1));
                        k5 = this;
                        break;
                    }
                    k5 = this;
                case 16:
                    if (k5.o(obj, i18, i17, i19, i11)) {
                        long j4 = unsafe.getLong(obj, j);
                        ((C0524j) c3.f9625a).h0((j4 >> 63) ^ (j4 << 1), i20);
                    }
                    k5 = this;
                    break;
                case 17:
                    if (k5.o(obj, i18, i17, i19, i11)) {
                        c3.a(i20, unsafe.getObject(obj, j), k5.m(i18));
                    }
                    break;
                case 18:
                    i12 = i17;
                    U.n(iArr[i18], (List) unsafe.getObject(obj, j), c3, false);
                    i17 = i12;
                    break;
                case 19:
                    i12 = i17;
                    U.r(iArr[i18], (List) unsafe.getObject(obj, j), c3, false);
                    i17 = i12;
                    break;
                case 20:
                    i12 = i17;
                    U.t(iArr[i18], (List) unsafe.getObject(obj, j), c3, false);
                    i17 = i12;
                    break;
                case 21:
                    i12 = i17;
                    U.z(iArr[i18], (List) unsafe.getObject(obj, j), c3, false);
                    i17 = i12;
                    break;
                case 22:
                    i12 = i17;
                    U.s(iArr[i18], (List) unsafe.getObject(obj, j), c3, false);
                    i17 = i12;
                    break;
                case 23:
                    i12 = i17;
                    U.q(iArr[i18], (List) unsafe.getObject(obj, j), c3, false);
                    i17 = i12;
                    break;
                case 24:
                    i12 = i17;
                    U.p(iArr[i18], (List) unsafe.getObject(obj, j), c3, false);
                    i17 = i12;
                    break;
                case 25:
                    i12 = i17;
                    U.m(iArr[i18], (List) unsafe.getObject(obj, j), c3, false);
                    i17 = i12;
                    break;
                case 26:
                    i13 = i17;
                    int i25 = iArr[i18];
                    List list = (List) unsafe.getObject(obj, j);
                    Class cls = U.f9664a;
                    if (list != null && !list.isEmpty()) {
                        c3.getClass();
                        for (int i26 = 0; i26 < list.size(); i26++) {
                            ((C0524j) c3.f9625a).c0(i25, (String) list.get(i26));
                        }
                    }
                    i17 = i13;
                    break;
                case 27:
                    i13 = i17;
                    int i27 = iArr[i18];
                    List list2 = (List) unsafe.getObject(obj, j);
                    T m9 = k5.m(i18);
                    Class cls2 = U.f9664a;
                    if (list2 != null && !list2.isEmpty()) {
                        c3.getClass();
                        for (int i28 = 0; i28 < list2.size(); i28++) {
                            ((C0524j) c3.f9625a).b0(i27, (AbstractC0515a) list2.get(i28), m9);
                        }
                    }
                    i17 = i13;
                    break;
                case 28:
                    i13 = i17;
                    int i29 = iArr[i18];
                    List list3 = (List) unsafe.getObject(obj, j);
                    Class cls3 = U.f9664a;
                    if (list3 != null && !list3.isEmpty()) {
                        c3.getClass();
                        for (int i30 = 0; i30 < list3.size(); i30++) {
                            ((C0524j) c3.f9625a).T(i29, (C0521g) list3.get(i30));
                        }
                    }
                    i17 = i13;
                    break;
                case 29:
                    i12 = i17;
                    U.y(iArr[i18], (List) unsafe.getObject(obj, j), c3, false);
                    i17 = i12;
                    break;
                case 30:
                    i12 = i17;
                    U.o(iArr[i18], (List) unsafe.getObject(obj, j), c3, false);
                    i17 = i12;
                    break;
                case 31:
                    i12 = i17;
                    U.u(iArr[i18], (List) unsafe.getObject(obj, j), c3, false);
                    i17 = i12;
                    break;
                case 32:
                    i12 = i17;
                    U.v(iArr[i18], (List) unsafe.getObject(obj, j), c3, false);
                    i17 = i12;
                    break;
                case 33:
                    i12 = i17;
                    U.w(iArr[i18], (List) unsafe.getObject(obj, j), c3, false);
                    i17 = i12;
                    break;
                case 34:
                    i12 = i17;
                    U.x(iArr[i18], (List) unsafe.getObject(obj, j), c3, false);
                    i17 = i12;
                    break;
                case 35:
                    i14 = i17;
                    z9 = i9 == true ? 1 : 0;
                    U.n(iArr[i18], (List) unsafe.getObject(obj, j), c3, z9);
                    i17 = i14;
                    break;
                case 36:
                    i14 = i17;
                    z9 = i9 == true ? 1 : 0;
                    U.r(iArr[i18], (List) unsafe.getObject(obj, j), c3, z9);
                    i17 = i14;
                    break;
                case 37:
                    i14 = i17;
                    z9 = i9 == true ? 1 : 0;
                    U.t(iArr[i18], (List) unsafe.getObject(obj, j), c3, z9);
                    i17 = i14;
                    break;
                case 38:
                    i14 = i17;
                    z9 = i9 == true ? 1 : 0;
                    U.z(iArr[i18], (List) unsafe.getObject(obj, j), c3, z9);
                    i17 = i14;
                    break;
                case 39:
                    i14 = i17;
                    z9 = i9 == true ? 1 : 0;
                    U.s(iArr[i18], (List) unsafe.getObject(obj, j), c3, z9);
                    i17 = i14;
                    break;
                case 40:
                    i14 = i17;
                    z9 = i9 == true ? 1 : 0;
                    U.q(iArr[i18], (List) unsafe.getObject(obj, j), c3, z9);
                    i17 = i14;
                    break;
                case 41:
                    i14 = i17;
                    z9 = i9 == true ? 1 : 0;
                    U.p(iArr[i18], (List) unsafe.getObject(obj, j), c3, z9);
                    i17 = i14;
                    break;
                case 42:
                    i14 = i17;
                    z9 = i9 == true ? 1 : 0;
                    U.m(iArr[i18], (List) unsafe.getObject(obj, j), c3, z9);
                    i17 = i14;
                    break;
                case 43:
                    i14 = i17;
                    z9 = i9 == true ? 1 : 0;
                    U.y(iArr[i18], (List) unsafe.getObject(obj, j), c3, z9);
                    i17 = i14;
                    break;
                case 44:
                    i14 = i17;
                    z9 = i9 == true ? 1 : 0;
                    U.o(iArr[i18], (List) unsafe.getObject(obj, j), c3, z9);
                    i17 = i14;
                    break;
                case 45:
                    i14 = i17;
                    z9 = i9 == true ? 1 : 0;
                    U.u(iArr[i18], (List) unsafe.getObject(obj, j), c3, z9);
                    i17 = i14;
                    break;
                case 46:
                    i14 = i17;
                    z9 = i9 == true ? 1 : 0;
                    U.v(iArr[i18], (List) unsafe.getObject(obj, j), c3, z9);
                    i17 = i14;
                    break;
                case 47:
                    i14 = i17;
                    z9 = i9 == true ? 1 : 0;
                    U.w(iArr[i18], (List) unsafe.getObject(obj, j), c3, z9);
                    i17 = i14;
                    break;
                case 48:
                    i14 = i17;
                    z9 = i9 == true ? 1 : 0;
                    U.x(iArr[i18], (List) unsafe.getObject(obj, j), c3, z9);
                    i17 = i14;
                    break;
                case 49:
                    i14 = i17;
                    int i31 = iArr[i18];
                    List list4 = (List) unsafe.getObject(obj, j);
                    T m10 = k5.m(i18);
                    Class cls4 = U.f9664a;
                    if (list4 != null && !list4.isEmpty()) {
                        c3.getClass();
                        for (int i32 = 0; i32 < list4.size(); i32++) {
                            c3.a(i31, list4.get(i32), m10);
                        }
                    }
                    z9 = true;
                    i17 = i14;
                    break;
                case 50:
                    Object object2 = unsafe.getObject(obj, j);
                    if (object2 != null) {
                        Object obj2 = k5.f9638b[(i18 / 3) * i23];
                        k5.f9648m.getClass();
                        D d10 = ((E) obj2).f9629a;
                        C0524j c0524j3 = (C0524j) c3.f9625a;
                        c0524j3.getClass();
                        for (Map.Entry entry : ((F) object2).entrySet()) {
                            c0524j3.e0(i20, i23);
                            c0524j3.g0(E.a(d10, entry.getKey(), entry.getValue()));
                            Object key = entry.getKey();
                            Object value = entry.getValue();
                            C0529o.b(c0524j3, d10.f9626a, i9, key);
                            i23 = 2;
                            C0529o.b(c0524j3, d10.f9627b, 2, value);
                            i17 = i17;
                            i9 = 1;
                        }
                    }
                    i13 = i17;
                    i17 = i13;
                    break;
                case 51:
                    if (k5.q(i20, i18, obj)) {
                        double doubleValue = ((Double) g0.f9706c.h(j, obj)).doubleValue();
                        C0524j c0524j4 = (C0524j) c3.f9625a;
                        c0524j4.getClass();
                        c0524j4.X(Double.doubleToRawLongBits(doubleValue), i20);
                    }
                    break;
                case 52:
                    if (k5.q(i20, i18, obj)) {
                        float floatValue = ((Float) g0.f9706c.h(j, obj)).floatValue();
                        C0524j c0524j5 = (C0524j) c3.f9625a;
                        c0524j5.getClass();
                        c0524j5.V(i20, Float.floatToRawIntBits(floatValue));
                    }
                    break;
                case 53:
                    if (k5.q(i20, i18, obj)) {
                        ((C0524j) c3.f9625a).h0(A(j, obj), i20);
                    }
                    break;
                case 54:
                    if (k5.q(i20, i18, obj)) {
                        ((C0524j) c3.f9625a).h0(A(j, obj), i20);
                    }
                    break;
                case 55:
                    if (k5.q(i20, i18, obj)) {
                        ((C0524j) c3.f9625a).Z(i20, z(j, obj));
                    }
                    break;
                case 56:
                    if (k5.q(i20, i18, obj)) {
                        ((C0524j) c3.f9625a).X(A(j, obj), i20);
                    }
                    break;
                case 57:
                    if (k5.q(i20, i18, obj)) {
                        ((C0524j) c3.f9625a).V(i20, z(j, obj));
                    }
                    break;
                case 58:
                    if (k5.q(i20, i18, obj)) {
                        ((C0524j) c3.f9625a).S(i20, ((Boolean) g0.f9706c.h(j, obj)).booleanValue());
                    }
                    break;
                case 59:
                    if (k5.q(i20, i18, obj)) {
                        Object object3 = unsafe.getObject(obj, j);
                        if (object3 instanceof String) {
                            ((C0524j) c3.f9625a).c0(i20, (String) object3);
                        } else {
                            ((C0524j) c3.f9625a).T(i20, (C0521g) object3);
                        }
                    }
                    break;
                case 60:
                    if (k5.q(i20, i18, obj)) {
                        ((C0524j) c3.f9625a).b0(i20, (AbstractC0515a) unsafe.getObject(obj, j), k5.m(i18));
                    }
                    break;
                case 61:
                    if (k5.q(i20, i18, obj)) {
                        ((C0524j) c3.f9625a).T(i20, (C0521g) unsafe.getObject(obj, j));
                    }
                    break;
                case 62:
                    if (k5.q(i20, i18, obj)) {
                        ((C0524j) c3.f9625a).f0(i20, z(j, obj));
                    }
                    break;
                case 63:
                    if (k5.q(i20, i18, obj)) {
                        ((C0524j) c3.f9625a).Z(i20, z(j, obj));
                    }
                    break;
                case 64:
                    if (k5.q(i20, i18, obj)) {
                        ((C0524j) c3.f9625a).V(i20, z(j, obj));
                    }
                    break;
                case 65:
                    if (k5.q(i20, i18, obj)) {
                        ((C0524j) c3.f9625a).X(A(j, obj), i20);
                    }
                    break;
                case 66:
                    if (k5.q(i20, i18, obj)) {
                        int z10 = z(j, obj);
                        ((C0524j) c3.f9625a).f0(i20, (z10 >> 31) ^ (z10 << 1));
                    }
                    break;
                case 67:
                    if (k5.q(i20, i18, obj)) {
                        long A2 = A(j, obj);
                        ((C0524j) c3.f9625a).h0((A2 << (i9 == true ? 1L : 0L)) ^ (A2 >> 63), i20);
                    }
                    break;
                case 68:
                    if (k5.q(i20, i18, obj)) {
                        c3.a(i20, unsafe.getObject(obj, j), k5.m(i18));
                    }
                    break;
            }
            i18 += 3;
            i15 = i23;
            i16 = 1048575;
        }
        k5.f9647l.getClass();
        ((AbstractC0533t) obj).unknownFields.d(c3);
    }

    @Override // androidx.datastore.preferences.protobuf.T
    public final void a(Object obj, Object obj2) {
        Object obj3;
        if (p(obj)) {
            obj2.getClass();
            int i9 = 0;
            while (true) {
                int[] iArr = this.f9637a;
                if (i9 < iArr.length) {
                    int M7 = M(i9);
                    long j = 1048575 & M7;
                    int i10 = iArr[i9];
                    switch (L(M7)) {
                        case 0:
                            if (n(i9, obj2)) {
                                f0 f0Var = g0.f9706c;
                                obj3 = obj;
                                f0Var.l(obj3, j, f0Var.d(j, obj2));
                                H(i9, obj3);
                                break;
                            }
                            break;
                        case 1:
                            if (n(i9, obj2)) {
                                f0 f0Var2 = g0.f9706c;
                                f0Var2.m(obj, j, f0Var2.e(j, obj2));
                                H(i9, obj);
                                break;
                            }
                            break;
                        case 2:
                            if (n(i9, obj2)) {
                                g0.n(obj, j, g0.f9706c.g(j, obj2));
                                H(i9, obj);
                                break;
                            }
                            break;
                        case 3:
                            if (n(i9, obj2)) {
                                g0.n(obj, j, g0.f9706c.g(j, obj2));
                                H(i9, obj);
                                break;
                            }
                            break;
                        case 4:
                            if (n(i9, obj2)) {
                                g0.m(g0.f9706c.f(j, obj2), j, obj);
                                H(i9, obj);
                                break;
                            }
                            break;
                        case 5:
                            if (n(i9, obj2)) {
                                g0.n(obj, j, g0.f9706c.g(j, obj2));
                                H(i9, obj);
                                break;
                            }
                            break;
                        case 6:
                            if (n(i9, obj2)) {
                                g0.m(g0.f9706c.f(j, obj2), j, obj);
                                H(i9, obj);
                                break;
                            }
                            break;
                        case 7:
                            if (n(i9, obj2)) {
                                f0 f0Var3 = g0.f9706c;
                                f0Var3.j(j, obj, f0Var3.c(j, obj2));
                                H(i9, obj);
                                break;
                            }
                            break;
                        case 8:
                            if (n(i9, obj2)) {
                                g0.o(obj, j, g0.f9706c.h(j, obj2));
                                H(i9, obj);
                                break;
                            }
                            break;
                        case 9:
                            t(obj, i9, obj2);
                            break;
                        case R.styleable.GradientColor_android_endX /* 10 */:
                            if (n(i9, obj2)) {
                                g0.o(obj, j, g0.f9706c.h(j, obj2));
                                H(i9, obj);
                                break;
                            }
                            break;
                        case R.styleable.GradientColor_android_endY /* 11 */:
                            if (n(i9, obj2)) {
                                g0.m(g0.f9706c.f(j, obj2), j, obj);
                                H(i9, obj);
                                break;
                            }
                            break;
                        case 12:
                            if (n(i9, obj2)) {
                                g0.m(g0.f9706c.f(j, obj2), j, obj);
                                H(i9, obj);
                                break;
                            }
                            break;
                        case 13:
                            if (n(i9, obj2)) {
                                g0.m(g0.f9706c.f(j, obj2), j, obj);
                                H(i9, obj);
                                break;
                            }
                            break;
                        case 14:
                            if (n(i9, obj2)) {
                                g0.n(obj, j, g0.f9706c.g(j, obj2));
                                H(i9, obj);
                                break;
                            }
                            break;
                        case 15:
                            if (n(i9, obj2)) {
                                g0.m(g0.f9706c.f(j, obj2), j, obj);
                                H(i9, obj);
                                break;
                            }
                            break;
                        case 16:
                            if (n(i9, obj2)) {
                                g0.n(obj, j, g0.f9706c.g(j, obj2));
                                H(i9, obj);
                                break;
                            }
                            break;
                        case 17:
                            t(obj, i9, obj2);
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
                            this.f9646k.getClass();
                            f0 f0Var4 = g0.f9706c;
                            InterfaceC0534u interfaceC0534u = (InterfaceC0534u) f0Var4.h(j, obj);
                            InterfaceC0534u interfaceC0534u2 = (InterfaceC0534u) f0Var4.h(j, obj2);
                            Q q9 = (Q) interfaceC0534u;
                            int i11 = q9.f9659c;
                            int i12 = ((Q) interfaceC0534u2).f9659c;
                            if (i11 > 0 && i12 > 0) {
                                if (!((AbstractC0516b) interfaceC0534u).f9688a) {
                                    interfaceC0534u = q9.d(i12 + i11);
                                }
                                ((AbstractC0516b) interfaceC0534u).addAll(interfaceC0534u2);
                            }
                            if (i11 > 0) {
                                interfaceC0534u2 = interfaceC0534u;
                            }
                            g0.o(obj, j, interfaceC0534u2);
                            break;
                        case 50:
                            Class cls = U.f9664a;
                            f0 f0Var5 = g0.f9706c;
                            Object h7 = f0Var5.h(j, obj);
                            Object h9 = f0Var5.h(j, obj2);
                            this.f9648m.getClass();
                            g0.o(obj, j, G.a(h7, h9));
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
                            if (q(i10, i9, obj2)) {
                                g0.o(obj, j, g0.f9706c.h(j, obj2));
                                I(i10, i9, obj);
                                break;
                            }
                            break;
                        case 60:
                            u(obj, i9, obj2);
                            break;
                        case 61:
                        case 62:
                        case 63:
                        case 64:
                        case 65:
                        case 66:
                        case 67:
                            if (q(i10, i9, obj2)) {
                                g0.o(obj, j, g0.f9706c.h(j, obj2));
                                I(i10, i9, obj);
                                break;
                            }
                            break;
                        case 68:
                            u(obj, i9, obj2);
                            break;
                    }
                    obj3 = obj;
                    i9 += 3;
                    obj = obj3;
                } else {
                    U.k(this.f9647l, obj, obj2);
                    return;
                }
            }
        } else {
            throw new IllegalArgumentException(A0.a.k(obj, "Mutating immutable message: "));
        }
    }

    @Override // androidx.datastore.preferences.protobuf.T
    public final void b(Object obj) {
        if (p(obj)) {
            if (obj instanceof AbstractC0533t) {
                AbstractC0533t abstractC0533t = (AbstractC0533t) obj;
                abstractC0533t.k(Integer.MAX_VALUE);
                abstractC0533t.memoizedHashCode = 0;
                abstractC0533t.h();
            }
            int[] iArr = this.f9637a;
            int length = iArr.length;
            for (int i9 = 0; i9 < length; i9 += 3) {
                int M7 = M(i9);
                long j = 1048575 & M7;
                int L8 = L(M7);
                if (L8 != 9) {
                    if (L8 != 60 && L8 != 68) {
                        switch (L8) {
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
                                this.f9646k.getClass();
                                AbstractC0516b abstractC0516b = (AbstractC0516b) ((InterfaceC0534u) g0.f9706c.h(j, obj));
                                if (abstractC0516b.f9688a) {
                                    abstractC0516b.f9688a = false;
                                    break;
                                } else {
                                    break;
                                }
                            case 50:
                                Unsafe unsafe = f9636o;
                                Object object = unsafe.getObject(obj, j);
                                if (object != null) {
                                    this.f9648m.getClass();
                                    ((F) object).f9631a = false;
                                    unsafe.putObject(obj, j, object);
                                    break;
                                } else {
                                    break;
                                }
                        }
                    } else if (q(iArr[i9], i9, obj)) {
                        m(i9).b(f9636o.getObject(obj, j));
                    }
                }
                if (n(i9, obj)) {
                    m(i9).b(f9636o.getObject(obj, j));
                }
            }
            this.f9647l.getClass();
            a0 a0Var = ((AbstractC0533t) obj).unknownFields;
            if (a0Var.f9687e) {
                a0Var.f9687e = false;
            }
        }
    }

    @Override // androidx.datastore.preferences.protobuf.T
    public final boolean c(Object obj) {
        int i9;
        int i10;
        int i11;
        int i12 = 1048575;
        int i13 = 0;
        int i14 = 0;
        while (i14 < this.f9644h) {
            int i15 = this.f9643g[i14];
            int[] iArr = this.f9637a;
            int i16 = iArr[i15];
            int M7 = M(i15);
            int i17 = iArr[i15 + 2];
            int i18 = i17 & 1048575;
            int i19 = 1 << (i17 >>> 20);
            if (i18 != i12) {
                if (i18 != 1048575) {
                    i13 = f9636o.getInt(obj, i18);
                }
                i10 = i15;
                i11 = i13;
                i9 = i18;
            } else {
                int i20 = i13;
                i9 = i12;
                i10 = i15;
                i11 = i20;
            }
            if ((268435456 & M7) == 0 || o(obj, i10, i9, i11, i19)) {
                int L8 = L(M7);
                if (L8 != 9 && L8 != 17) {
                    if (L8 != 27) {
                        if (L8 != 60 && L8 != 68) {
                            if (L8 != 49) {
                                if (L8 != 50) {
                                    continue;
                                } else {
                                    Object h7 = g0.f9706c.h(M7 & 1048575, obj);
                                    this.f9648m.getClass();
                                    F f9 = (F) h7;
                                    if (f9.isEmpty()) {
                                        continue;
                                    } else {
                                        if (((E) this.f9638b[(i10 / 3) * 2]).f9629a.f9627b.f9745a != p0.MESSAGE) {
                                            continue;
                                        } else {
                                            T t7 = null;
                                            for (Object obj2 : f9.values()) {
                                                if (t7 == null) {
                                                    t7 = P.f9654c.a(obj2.getClass());
                                                }
                                                if (!t7.c(obj2)) {
                                                }
                                            }
                                        }
                                    }
                                }
                                i14++;
                                i12 = i9;
                                i13 = i11;
                            }
                        } else {
                            if (q(i16, i10, obj)) {
                                if (!m(i10).c(g0.f9706c.h(M7 & 1048575, obj))) {
                                }
                            } else {
                                continue;
                            }
                            i14++;
                            i12 = i9;
                            i13 = i11;
                        }
                    }
                    List list = (List) g0.f9706c.h(M7 & 1048575, obj);
                    if (list.isEmpty()) {
                        continue;
                    } else {
                        T m9 = m(i10);
                        for (int i21 = 0; i21 < list.size(); i21++) {
                            if (m9.c(list.get(i21))) {
                            }
                        }
                    }
                    i14++;
                    i12 = i9;
                    i13 = i11;
                } else {
                    if (o(obj, i10, i9, i11, i19)) {
                        if (!m(i10).c(g0.f9706c.h(M7 & 1048575, obj))) {
                        }
                    } else {
                        continue;
                    }
                    i14++;
                    i12 = i9;
                    i13 = i11;
                }
            }
            return false;
        }
        return true;
    }

    @Override // androidx.datastore.preferences.protobuf.T
    public final AbstractC0533t d() {
        this.j.getClass();
        return this.f9641e.i();
    }

    @Override // androidx.datastore.preferences.protobuf.T
    public final void e(Object obj, C0120y c0120y, C0526l c0526l) {
        c0526l.getClass();
        if (p(obj)) {
            r(this.f9647l, obj, c0120y, c0526l);
            return;
        }
        throw new IllegalArgumentException(A0.a.k(obj, "Mutating immutable message: "));
    }

    @Override // androidx.datastore.preferences.protobuf.T
    public final void f(Object obj, C c3) {
        c3.getClass();
        N(obj, c3);
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
    @Override // androidx.datastore.preferences.protobuf.T
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int g(androidx.datastore.preferences.protobuf.AbstractC0533t r12) {
        /*
            Method dump skipped, instructions count: 794
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.K.g(androidx.datastore.preferences.protobuf.t):int");
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0074, code lost:
    
        if (androidx.datastore.preferences.protobuf.U.l(r5.h(r7, r12), r5.h(r7, r13)) != false) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x008a, code lost:
    
        if (r5.g(r7, r12) == r5.g(r7, r13)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x009e, code lost:
    
        if (r5.f(r7, r12) == r5.f(r7, r13)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00b4, code lost:
    
        if (r5.g(r7, r12) == r5.g(r7, r13)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00c8, code lost:
    
        if (r5.f(r7, r12) == r5.f(r7, r13)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00dc, code lost:
    
        if (r5.f(r7, r12) == r5.f(r7, r13)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00f0, code lost:
    
        if (r5.f(r7, r12) == r5.f(r7, r13)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0108, code lost:
    
        if (androidx.datastore.preferences.protobuf.U.l(r5.h(r7, r12), r5.h(r7, r13)) != false) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0120, code lost:
    
        if (androidx.datastore.preferences.protobuf.U.l(r5.h(r7, r12), r5.h(r7, r13)) != false) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0138, code lost:
    
        if (androidx.datastore.preferences.protobuf.U.l(r5.h(r7, r12), r5.h(r7, r13)) != false) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x014c, code lost:
    
        if (r5.c(r7, r12) == r5.c(r7, r13)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0160, code lost:
    
        if (r5.f(r7, r12) == r5.f(r7, r13)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0176, code lost:
    
        if (r5.g(r7, r12) == r5.g(r7, r13)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x018a, code lost:
    
        if (r5.f(r7, r12) == r5.f(r7, r13)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x019f, code lost:
    
        if (r5.g(r7, r12) == r5.g(r7, r13)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x01b4, code lost:
    
        if (r5.g(r7, r12) == r5.g(r7, r13)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x01cf, code lost:
    
        if (java.lang.Float.floatToIntBits(r5.e(r7, r12)) == java.lang.Float.floatToIntBits(r5.e(r7, r13))) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x01ec, code lost:
    
        if (java.lang.Double.doubleToLongBits(r5.d(r7, r12)) == java.lang.Double.doubleToLongBits(r5.d(r7, r13))) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0039, code lost:
    
        if (androidx.datastore.preferences.protobuf.U.l(r9.h(r7, r12), r9.h(r7, r13)) != false) goto L105;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:5:0x0016. Please report as an issue. */
    @Override // androidx.datastore.preferences.protobuf.T
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean h(androidx.datastore.preferences.protobuf.AbstractC0533t r12, androidx.datastore.preferences.protobuf.AbstractC0533t r13) {
        /*
            Method dump skipped, instructions count: 660
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.K.h(androidx.datastore.preferences.protobuf.t, androidx.datastore.preferences.protobuf.t):boolean");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:16:0x0049. Please report as an issue. */
    @Override // androidx.datastore.preferences.protobuf.T
    public final int i(AbstractC0533t abstractC0533t) {
        int i9;
        int i10;
        int L8;
        int L9;
        int L10;
        int N8;
        int L11;
        int N9;
        int L12;
        int L13;
        int K;
        int J8;
        int L14;
        int size;
        int i11;
        int L15;
        int L16;
        int L17;
        int size2;
        int L18;
        int M7;
        int i12;
        int L19;
        int L20;
        int L21;
        int N10;
        int L22;
        int N11;
        int L23;
        int K6;
        int M8;
        K k5 = this;
        AbstractC0533t abstractC0533t2 = abstractC0533t;
        int i13 = 1;
        Unsafe unsafe = f9636o;
        int i14 = 0;
        int i15 = 0;
        int i16 = 0;
        int i17 = 1048575;
        while (true) {
            int[] iArr = k5.f9637a;
            if (i14 < iArr.length) {
                int M9 = k5.M(i14);
                int L24 = L(M9);
                int i18 = iArr[i14];
                int i19 = iArr[i14 + 2];
                int i20 = i19 & 1048575;
                if (L24 <= 17) {
                    if (i20 != i17) {
                        if (i20 == 1048575) {
                            i15 = 0;
                        } else {
                            i15 = unsafe.getInt(abstractC0533t2, i20);
                        }
                        i17 = i20;
                    }
                    i9 = i13 << (i19 >>> 20);
                } else {
                    i9 = 0;
                }
                long j = M9 & 1048575;
                if (L24 >= EnumC0530p.f9747b.f9751a) {
                    int i21 = EnumC0530p.f9748c.f9751a;
                }
                switch (L24) {
                    case 0:
                        i10 = i13;
                        if (k5.o(abstractC0533t2, i14, i17, i15, i9)) {
                            L8 = C0524j.L(i18) + 8;
                            i16 += L8;
                            break;
                        } else {
                            break;
                        }
                    case 1:
                        i10 = i13;
                        if (k5.o(abstractC0533t2, i14, i17, i15, i9)) {
                            L9 = C0524j.L(i18);
                            L13 = L9 + 4;
                            i16 += L13;
                        }
                        k5 = this;
                        abstractC0533t2 = abstractC0533t;
                        break;
                    case 2:
                        i10 = i13;
                        if (k5.o(abstractC0533t2, i14, i17, i15, i9)) {
                            long j4 = unsafe.getLong(abstractC0533t2, j);
                            L10 = C0524j.L(i18);
                            N8 = C0524j.N(j4);
                            i16 += N8 + L10;
                        }
                        k5 = this;
                        break;
                    case 3:
                        i10 = i13;
                        if (k5.o(abstractC0533t2, i14, i17, i15, i9)) {
                            long j9 = unsafe.getLong(abstractC0533t2, j);
                            L10 = C0524j.L(i18);
                            N8 = C0524j.N(j9);
                            i16 += N8 + L10;
                        }
                        k5 = this;
                        break;
                    case 4:
                        i10 = i13;
                        if (k5.o(abstractC0533t2, i14, i17, i15, i9)) {
                            int i22 = unsafe.getInt(abstractC0533t2, j);
                            L11 = C0524j.L(i18);
                            N9 = C0524j.N(i22);
                            J8 = N9 + L11;
                            i16 += J8;
                        }
                        k5 = this;
                        break;
                    case 5:
                        i10 = i13;
                        if (k5.o(abstractC0533t2, i14, i17, i15, i9)) {
                            L12 = C0524j.L(i18);
                            L13 = L12 + 8;
                            i16 += L13;
                        }
                        k5 = this;
                        abstractC0533t2 = abstractC0533t;
                        break;
                    case 6:
                        i10 = i13;
                        if (k5.o(abstractC0533t2, i14, i17, i15, i9)) {
                            L9 = C0524j.L(i18);
                            L13 = L9 + 4;
                            i16 += L13;
                        }
                        k5 = this;
                        abstractC0533t2 = abstractC0533t;
                        break;
                    case 7:
                        i10 = i13;
                        if (k5.o(abstractC0533t2, i14, i17, i15, i9)) {
                            L13 = C0524j.L(i18) + 1;
                            i16 += L13;
                        }
                        k5 = this;
                        abstractC0533t2 = abstractC0533t;
                        break;
                    case 8:
                        i10 = i13;
                        if (k5.o(abstractC0533t2, i14, i17, i15, i9)) {
                            Object object = unsafe.getObject(abstractC0533t2, j);
                            if (object instanceof C0521g) {
                                K = C0524j.J(i18, (C0521g) object);
                            } else {
                                K = C0524j.K((String) object) + C0524j.L(i18);
                            }
                            i16 = K + i16;
                        }
                        k5 = this;
                        break;
                    case 9:
                        i10 = i13;
                        if (k5.o(abstractC0533t2, i14, i17, i15, i9)) {
                            Object object2 = unsafe.getObject(abstractC0533t2, j);
                            T m9 = k5.m(i14);
                            Class cls = U.f9664a;
                            int L25 = C0524j.L(i18);
                            int a5 = ((AbstractC0515a) object2).a(m9);
                            i16 += C0524j.M(a5) + a5 + L25;
                            break;
                        } else {
                            break;
                        }
                    case R.styleable.GradientColor_android_endX /* 10 */:
                        i10 = i13;
                        if (k5.o(abstractC0533t2, i14, i17, i15, i9)) {
                            J8 = C0524j.J(i18, (C0521g) unsafe.getObject(abstractC0533t2, j));
                            i16 += J8;
                        }
                        k5 = this;
                        break;
                    case R.styleable.GradientColor_android_endY /* 11 */:
                        i10 = i13;
                        if (k5.o(abstractC0533t2, i14, i17, i15, i9)) {
                            int i23 = unsafe.getInt(abstractC0533t2, j);
                            L11 = C0524j.L(i18);
                            N9 = C0524j.M(i23);
                            J8 = N9 + L11;
                            i16 += J8;
                        }
                        k5 = this;
                        break;
                    case 12:
                        i10 = i13;
                        if (k5.o(abstractC0533t2, i14, i17, i15, i9)) {
                            int i24 = unsafe.getInt(abstractC0533t2, j);
                            L11 = C0524j.L(i18);
                            N9 = C0524j.N(i24);
                            J8 = N9 + L11;
                            i16 += J8;
                        }
                        k5 = this;
                        break;
                    case 13:
                        i10 = i13;
                        if (k5.o(abstractC0533t2, i14, i17, i15, i9)) {
                            L9 = C0524j.L(i18);
                            L13 = L9 + 4;
                            i16 += L13;
                        }
                        k5 = this;
                        abstractC0533t2 = abstractC0533t;
                        break;
                    case 14:
                        i10 = i13;
                        if (k5.o(abstractC0533t2, i14, i17, i15, i9)) {
                            L12 = C0524j.L(i18);
                            L13 = L12 + 8;
                            i16 += L13;
                        }
                        k5 = this;
                        abstractC0533t2 = abstractC0533t;
                        break;
                    case 15:
                        i10 = i13;
                        if (k5.o(abstractC0533t2, i14, i17, i15, i9)) {
                            int i25 = unsafe.getInt(abstractC0533t2, j);
                            L11 = C0524j.L(i18);
                            N9 = C0524j.M((i25 >> 31) ^ (i25 << 1));
                            J8 = N9 + L11;
                            i16 += J8;
                        }
                        k5 = this;
                        break;
                    case 16:
                        i10 = i13;
                        if (k5.o(abstractC0533t2, i14, i17, i15, i9)) {
                            long j10 = unsafe.getLong(abstractC0533t2, j);
                            L10 = C0524j.L(i18);
                            N8 = C0524j.N((j10 >> 63) ^ (j10 << i10));
                            i16 += N8 + L10;
                        }
                        k5 = this;
                        break;
                    case 17:
                        i10 = i13;
                        if (k5.o(abstractC0533t2, i14, i17, i15, i9)) {
                            L8 = ((AbstractC0515a) unsafe.getObject(abstractC0533t2, j)).a(k5.m(i14)) + (C0524j.L(i18) * 2);
                            i16 += L8;
                            break;
                        } else {
                            break;
                        }
                    case 18:
                        i10 = i13;
                        L8 = U.c((List) unsafe.getObject(abstractC0533t2, j), i18);
                        i16 += L8;
                        break;
                    case 19:
                        i10 = i13;
                        L8 = U.b((List) unsafe.getObject(abstractC0533t2, j), i18);
                        i16 += L8;
                        break;
                    case 20:
                        i10 = i13;
                        List list = (List) unsafe.getObject(abstractC0533t2, j);
                        Class cls2 = U.f9664a;
                        if (list.size() != 0) {
                            L14 = (C0524j.L(i18) * list.size()) + U.e(list);
                            i16 += L14;
                            break;
                        }
                        L14 = 0;
                        i16 += L14;
                    case 21:
                        i10 = i13;
                        List list2 = (List) unsafe.getObject(abstractC0533t2, j);
                        Class cls3 = U.f9664a;
                        size = list2.size();
                        if (size != 0) {
                            i11 = U.i(list2);
                            L15 = C0524j.L(i18);
                            L14 = (L15 * size) + i11;
                            i16 += L14;
                            break;
                        }
                        L14 = 0;
                        i16 += L14;
                    case 22:
                        i10 = i13;
                        List list3 = (List) unsafe.getObject(abstractC0533t2, j);
                        Class cls4 = U.f9664a;
                        size = list3.size();
                        if (size != 0) {
                            i11 = U.d(list3);
                            L15 = C0524j.L(i18);
                            L14 = (L15 * size) + i11;
                            i16 += L14;
                            break;
                        }
                        L14 = 0;
                        i16 += L14;
                    case 23:
                        i10 = i13;
                        L8 = U.c((List) unsafe.getObject(abstractC0533t2, j), i18);
                        i16 += L8;
                        break;
                    case 24:
                        i10 = i13;
                        L8 = U.b((List) unsafe.getObject(abstractC0533t2, j), i18);
                        i16 += L8;
                        break;
                    case 25:
                        i10 = i13;
                        List list4 = (List) unsafe.getObject(abstractC0533t2, j);
                        Class cls5 = U.f9664a;
                        int size3 = list4.size();
                        if (size3 == 0) {
                            L16 = 0;
                        } else {
                            L16 = (C0524j.L(i18) + 1) * size3;
                        }
                        i16 += L16;
                        break;
                    case 26:
                        i10 = i13;
                        List list5 = (List) unsafe.getObject(abstractC0533t2, j);
                        Class cls6 = U.f9664a;
                        int size4 = list5.size();
                        if (size4 != 0) {
                            L14 = C0524j.L(i18) * size4;
                            for (int i26 = 0; i26 < size4; i26++) {
                                Object obj = list5.get(i26);
                                if (obj instanceof C0521g) {
                                    int size5 = ((C0521g) obj).size();
                                    L14 = C0524j.M(size5) + size5 + L14;
                                } else {
                                    L14 = C0524j.K((String) obj) + L14;
                                }
                            }
                            i16 += L14;
                            break;
                        }
                        L14 = 0;
                        i16 += L14;
                    case 27:
                        i10 = i13;
                        List list6 = (List) unsafe.getObject(abstractC0533t2, j);
                        T m10 = k5.m(i14);
                        Class cls7 = U.f9664a;
                        int size6 = list6.size();
                        if (size6 == 0) {
                            L17 = 0;
                        } else {
                            L17 = C0524j.L(i18) * size6;
                            for (int i27 = 0; i27 < size6; i27++) {
                                int a9 = ((AbstractC0515a) list6.get(i27)).a(m10);
                                L17 += C0524j.M(a9) + a9;
                            }
                        }
                        i16 += L17;
                        break;
                    case 28:
                        i10 = i13;
                        List list7 = (List) unsafe.getObject(abstractC0533t2, j);
                        Class cls8 = U.f9664a;
                        int size7 = list7.size();
                        if (size7 != 0) {
                            L14 = C0524j.L(i18) * size7;
                            for (int i28 = 0; i28 < list7.size(); i28++) {
                                int size8 = ((C0521g) list7.get(i28)).size();
                                L14 += C0524j.M(size8) + size8;
                            }
                            i16 += L14;
                            break;
                        }
                        L14 = 0;
                        i16 += L14;
                    case 29:
                        i10 = i13;
                        List list8 = (List) unsafe.getObject(abstractC0533t2, j);
                        Class cls9 = U.f9664a;
                        size = list8.size();
                        if (size != 0) {
                            i11 = U.h(list8);
                            L15 = C0524j.L(i18);
                            L14 = (L15 * size) + i11;
                            i16 += L14;
                            break;
                        }
                        L14 = 0;
                        i16 += L14;
                    case 30:
                        i10 = i13;
                        List list9 = (List) unsafe.getObject(abstractC0533t2, j);
                        Class cls10 = U.f9664a;
                        size = list9.size();
                        if (size != 0) {
                            i11 = U.a(list9);
                            L15 = C0524j.L(i18);
                            L14 = (L15 * size) + i11;
                            i16 += L14;
                            break;
                        }
                        L14 = 0;
                        i16 += L14;
                    case 31:
                        i10 = i13;
                        L8 = U.b((List) unsafe.getObject(abstractC0533t2, j), i18);
                        i16 += L8;
                        break;
                    case 32:
                        i10 = i13;
                        L8 = U.c((List) unsafe.getObject(abstractC0533t2, j), i18);
                        i16 += L8;
                        break;
                    case 33:
                        i10 = i13;
                        List list10 = (List) unsafe.getObject(abstractC0533t2, j);
                        Class cls11 = U.f9664a;
                        size = list10.size();
                        if (size != 0) {
                            i11 = U.f(list10);
                            L15 = C0524j.L(i18);
                            L14 = (L15 * size) + i11;
                            i16 += L14;
                            break;
                        }
                        L14 = 0;
                        i16 += L14;
                    case 34:
                        i10 = i13;
                        List list11 = (List) unsafe.getObject(abstractC0533t2, j);
                        Class cls12 = U.f9664a;
                        size = list11.size();
                        if (size != 0) {
                            i11 = U.g(list11);
                            L15 = C0524j.L(i18);
                            L14 = (L15 * size) + i11;
                            i16 += L14;
                            break;
                        }
                        L14 = 0;
                        i16 += L14;
                    case 35:
                        i10 = i13;
                        List list12 = (List) unsafe.getObject(abstractC0533t2, j);
                        Class cls13 = U.f9664a;
                        size2 = list12.size() * 8;
                        if (size2 > 0) {
                            L18 = C0524j.L(i18);
                            M7 = C0524j.M(size2);
                            i16 += M7 + L18 + size2;
                            break;
                        } else {
                            break;
                        }
                    case 36:
                        i10 = i13;
                        List list13 = (List) unsafe.getObject(abstractC0533t2, j);
                        Class cls14 = U.f9664a;
                        size2 = list13.size() * 4;
                        if (size2 > 0) {
                            L18 = C0524j.L(i18);
                            M7 = C0524j.M(size2);
                            i16 += M7 + L18 + size2;
                            break;
                        } else {
                            break;
                        }
                    case 37:
                        i10 = i13;
                        size2 = U.e((List) unsafe.getObject(abstractC0533t2, j));
                        if (size2 > 0) {
                            L18 = C0524j.L(i18);
                            M7 = C0524j.M(size2);
                            i16 += M7 + L18 + size2;
                            break;
                        } else {
                            break;
                        }
                    case 38:
                        i10 = i13;
                        size2 = U.i((List) unsafe.getObject(abstractC0533t2, j));
                        if (size2 > 0) {
                            L18 = C0524j.L(i18);
                            M7 = C0524j.M(size2);
                            i16 += M7 + L18 + size2;
                            break;
                        } else {
                            break;
                        }
                    case 39:
                        i10 = i13;
                        size2 = U.d((List) unsafe.getObject(abstractC0533t2, j));
                        if (size2 > 0) {
                            L18 = C0524j.L(i18);
                            M7 = C0524j.M(size2);
                            i16 += M7 + L18 + size2;
                            break;
                        } else {
                            break;
                        }
                    case 40:
                        i10 = i13;
                        List list14 = (List) unsafe.getObject(abstractC0533t2, j);
                        Class cls15 = U.f9664a;
                        size2 = list14.size() * 8;
                        if (size2 > 0) {
                            L18 = C0524j.L(i18);
                            M7 = C0524j.M(size2);
                            i16 += M7 + L18 + size2;
                            break;
                        } else {
                            break;
                        }
                    case 41:
                        i10 = i13;
                        List list15 = (List) unsafe.getObject(abstractC0533t2, j);
                        Class cls16 = U.f9664a;
                        size2 = list15.size() * 4;
                        if (size2 > 0) {
                            L18 = C0524j.L(i18);
                            M7 = C0524j.M(size2);
                            i16 += M7 + L18 + size2;
                            break;
                        } else {
                            break;
                        }
                    case 42:
                        i10 = i13;
                        List list16 = (List) unsafe.getObject(abstractC0533t2, j);
                        Class cls17 = U.f9664a;
                        size2 = list16.size();
                        if (size2 > 0) {
                            L18 = C0524j.L(i18);
                            M7 = C0524j.M(size2);
                            i16 += M7 + L18 + size2;
                            break;
                        } else {
                            break;
                        }
                    case 43:
                        i10 = i13;
                        size2 = U.h((List) unsafe.getObject(abstractC0533t2, j));
                        if (size2 > 0) {
                            L18 = C0524j.L(i18);
                            M7 = C0524j.M(size2);
                            i16 += M7 + L18 + size2;
                            break;
                        } else {
                            break;
                        }
                    case 44:
                        i10 = i13;
                        size2 = U.a((List) unsafe.getObject(abstractC0533t2, j));
                        if (size2 > 0) {
                            L18 = C0524j.L(i18);
                            M7 = C0524j.M(size2);
                            i16 += M7 + L18 + size2;
                            break;
                        } else {
                            break;
                        }
                    case 45:
                        i10 = i13;
                        List list17 = (List) unsafe.getObject(abstractC0533t2, j);
                        Class cls18 = U.f9664a;
                        size2 = list17.size() * 4;
                        if (size2 > 0) {
                            L18 = C0524j.L(i18);
                            M7 = C0524j.M(size2);
                            i16 += M7 + L18 + size2;
                            break;
                        } else {
                            break;
                        }
                    case 46:
                        i10 = i13;
                        List list18 = (List) unsafe.getObject(abstractC0533t2, j);
                        Class cls19 = U.f9664a;
                        size2 = list18.size() * 8;
                        if (size2 > 0) {
                            L18 = C0524j.L(i18);
                            M7 = C0524j.M(size2);
                            i16 += M7 + L18 + size2;
                            break;
                        } else {
                            break;
                        }
                    case 47:
                        i10 = i13;
                        size2 = U.f((List) unsafe.getObject(abstractC0533t2, j));
                        if (size2 > 0) {
                            L18 = C0524j.L(i18);
                            M7 = C0524j.M(size2);
                            i16 += M7 + L18 + size2;
                            break;
                        } else {
                            break;
                        }
                    case 48:
                        i10 = i13;
                        size2 = U.g((List) unsafe.getObject(abstractC0533t2, j));
                        if (size2 > 0) {
                            L18 = C0524j.L(i18);
                            M7 = C0524j.M(size2);
                            i16 += M7 + L18 + size2;
                            break;
                        } else {
                            break;
                        }
                    case 49:
                        i10 = i13;
                        List list19 = (List) unsafe.getObject(abstractC0533t2, j);
                        T m11 = k5.m(i14);
                        Class cls20 = U.f9664a;
                        int size9 = list19.size();
                        if (size9 == 0) {
                            i12 = 0;
                        } else {
                            i12 = 0;
                            for (int i29 = 0; i29 < size9; i29++) {
                                i12 += ((AbstractC0515a) list19.get(i29)).a(m11) + (C0524j.L(i18) * 2);
                            }
                        }
                        i16 += i12;
                        break;
                    case 50:
                        Object object3 = unsafe.getObject(abstractC0533t2, j);
                        Object obj2 = k5.f9638b[(i14 / 3) * 2];
                        k5.f9648m.getClass();
                        F f9 = (F) object3;
                        E e8 = (E) obj2;
                        if (f9.isEmpty()) {
                            L17 = 0;
                        } else {
                            L17 = 0;
                            for (Map.Entry entry : f9.entrySet()) {
                                Object key = entry.getKey();
                                Object value = entry.getValue();
                                e8.getClass();
                                int L26 = C0524j.L(i18);
                                int i30 = i13;
                                int a10 = E.a(e8.f9629a, key, value);
                                L17 += C0524j.M(a10) + a10 + L26;
                                i13 = i30;
                            }
                        }
                        i10 = i13;
                        i16 += L17;
                        break;
                    case 51:
                        if (k5.q(i18, i14, abstractC0533t2)) {
                            L19 = C0524j.L(i18);
                            L23 = L19 + 8;
                            i16 += L23;
                        }
                        i10 = i13;
                        break;
                    case 52:
                        if (k5.q(i18, i14, abstractC0533t2)) {
                            L20 = C0524j.L(i18);
                            L23 = L20 + 4;
                            i16 += L23;
                        }
                        i10 = i13;
                        break;
                    case 53:
                        if (k5.q(i18, i14, abstractC0533t2)) {
                            long A2 = A(j, abstractC0533t2);
                            L21 = C0524j.L(i18);
                            N10 = C0524j.N(A2);
                            M8 = N10 + L21;
                            i16 += M8;
                        }
                        i10 = i13;
                        break;
                    case 54:
                        if (k5.q(i18, i14, abstractC0533t2)) {
                            long A9 = A(j, abstractC0533t2);
                            L21 = C0524j.L(i18);
                            N10 = C0524j.N(A9);
                            M8 = N10 + L21;
                            i16 += M8;
                        }
                        i10 = i13;
                        break;
                    case 55:
                        if (k5.q(i18, i14, abstractC0533t2)) {
                            int z9 = z(j, abstractC0533t2);
                            L22 = C0524j.L(i18);
                            N11 = C0524j.N(z9);
                            L23 = N11 + L22;
                            i16 += L23;
                        }
                        i10 = i13;
                        break;
                    case 56:
                        if (k5.q(i18, i14, abstractC0533t2)) {
                            L19 = C0524j.L(i18);
                            L23 = L19 + 8;
                            i16 += L23;
                        }
                        i10 = i13;
                        break;
                    case 57:
                        if (k5.q(i18, i14, abstractC0533t2)) {
                            L20 = C0524j.L(i18);
                            L23 = L20 + 4;
                            i16 += L23;
                        }
                        i10 = i13;
                        break;
                    case 58:
                        if (k5.q(i18, i14, abstractC0533t2)) {
                            L23 = C0524j.L(i18) + i13;
                            i16 += L23;
                        }
                        i10 = i13;
                        break;
                    case 59:
                        if (k5.q(i18, i14, abstractC0533t2)) {
                            Object object4 = unsafe.getObject(abstractC0533t2, j);
                            if (object4 instanceof C0521g) {
                                K6 = C0524j.J(i18, (C0521g) object4);
                            } else {
                                K6 = C0524j.K((String) object4) + C0524j.L(i18);
                            }
                            i16 = K6 + i16;
                        }
                        i10 = i13;
                        break;
                    case 60:
                        if (k5.q(i18, i14, abstractC0533t2)) {
                            Object object5 = unsafe.getObject(abstractC0533t2, j);
                            T m12 = k5.m(i14);
                            Class cls21 = U.f9664a;
                            int L27 = C0524j.L(i18);
                            int a11 = ((AbstractC0515a) object5).a(m12);
                            M8 = C0524j.M(a11) + a11 + L27;
                            i16 += M8;
                        }
                        i10 = i13;
                        break;
                    case 61:
                        if (k5.q(i18, i14, abstractC0533t2)) {
                            L23 = C0524j.J(i18, (C0521g) unsafe.getObject(abstractC0533t2, j));
                            i16 += L23;
                        }
                        i10 = i13;
                        break;
                    case 62:
                        if (k5.q(i18, i14, abstractC0533t2)) {
                            int z10 = z(j, abstractC0533t2);
                            L22 = C0524j.L(i18);
                            N11 = C0524j.M(z10);
                            L23 = N11 + L22;
                            i16 += L23;
                        }
                        i10 = i13;
                        break;
                    case 63:
                        if (k5.q(i18, i14, abstractC0533t2)) {
                            int z11 = z(j, abstractC0533t2);
                            L22 = C0524j.L(i18);
                            N11 = C0524j.N(z11);
                            L23 = N11 + L22;
                            i16 += L23;
                        }
                        i10 = i13;
                        break;
                    case 64:
                        if (k5.q(i18, i14, abstractC0533t2)) {
                            L20 = C0524j.L(i18);
                            L23 = L20 + 4;
                            i16 += L23;
                        }
                        i10 = i13;
                        break;
                    case 65:
                        if (k5.q(i18, i14, abstractC0533t2)) {
                            L19 = C0524j.L(i18);
                            L23 = L19 + 8;
                            i16 += L23;
                        }
                        i10 = i13;
                        break;
                    case 66:
                        if (k5.q(i18, i14, abstractC0533t2)) {
                            int z12 = z(j, abstractC0533t2);
                            L22 = C0524j.L(i18);
                            N11 = C0524j.M((z12 >> 31) ^ (z12 << 1));
                            L23 = N11 + L22;
                            i16 += L23;
                        }
                        i10 = i13;
                        break;
                    case 67:
                        if (k5.q(i18, i14, abstractC0533t2)) {
                            long A10 = A(j, abstractC0533t2);
                            L21 = C0524j.L(i18);
                            N10 = C0524j.N((A10 << i13) ^ (A10 >> 63));
                            M8 = N10 + L21;
                            i16 += M8;
                        }
                        i10 = i13;
                        break;
                    case 68:
                        if (k5.q(i18, i14, abstractC0533t2)) {
                            L23 = ((AbstractC0515a) unsafe.getObject(abstractC0533t2, j)).a(k5.m(i14)) + (C0524j.L(i18) * 2);
                            i16 += L23;
                        }
                        i10 = i13;
                        break;
                    default:
                        i10 = i13;
                        break;
                }
                i14 += 3;
                i13 = i10;
            } else {
                k5.f9647l.getClass();
                return abstractC0533t2.unknownFields.b() + i16;
            }
        }
    }

    public final boolean j(AbstractC0533t abstractC0533t, AbstractC0533t abstractC0533t2, int i9) {
        if (n(i9, abstractC0533t) == n(i9, abstractC0533t2)) {
            return true;
        }
        return false;
    }

    public final void k(Object obj, int i9, Object obj2) {
        int i10 = this.f9637a[i9];
        if (g0.f9706c.h(M(i9) & 1048575, obj) == null) {
            return;
        }
        l(i9);
    }

    public final void l(int i9) {
        if (this.f9638b[((i9 / 3) * 2) + 1] == null) {
        } else {
            throw new ClassCastException();
        }
    }

    public final T m(int i9) {
        int i10 = (i9 / 3) * 2;
        Object[] objArr = this.f9638b;
        T t7 = (T) objArr[i10];
        if (t7 != null) {
            return t7;
        }
        T a5 = P.f9654c.a((Class) objArr[i10 + 1]);
        objArr[i10] = a5;
        return a5;
    }

    public final boolean n(int i9, Object obj) {
        int i10 = this.f9637a[i9 + 2];
        long j = i10 & 1048575;
        if (j == 1048575) {
            int M7 = M(i9);
            long j4 = M7 & 1048575;
            switch (L(M7)) {
                case 0:
                    if (Double.doubleToRawLongBits(g0.f9706c.d(j4, obj)) == 0) {
                        return false;
                    }
                    break;
                case 1:
                    if (Float.floatToRawIntBits(g0.f9706c.e(j4, obj)) == 0) {
                        return false;
                    }
                    break;
                case 2:
                    if (g0.f9706c.g(j4, obj) == 0) {
                        return false;
                    }
                    break;
                case 3:
                    if (g0.f9706c.g(j4, obj) == 0) {
                        return false;
                    }
                    break;
                case 4:
                    if (g0.f9706c.f(j4, obj) == 0) {
                        return false;
                    }
                    break;
                case 5:
                    if (g0.f9706c.g(j4, obj) == 0) {
                        return false;
                    }
                    break;
                case 6:
                    if (g0.f9706c.f(j4, obj) == 0) {
                        return false;
                    }
                    break;
                case 7:
                    return g0.f9706c.c(j4, obj);
                case 8:
                    Object h7 = g0.f9706c.h(j4, obj);
                    if (h7 instanceof String) {
                        return !((String) h7).isEmpty();
                    }
                    if (h7 instanceof C0521g) {
                        return !C0521g.f9700c.equals(h7);
                    }
                    throw new IllegalArgumentException();
                case 9:
                    if (g0.f9706c.h(j4, obj) == null) {
                        return false;
                    }
                    break;
                case R.styleable.GradientColor_android_endX /* 10 */:
                    return !C0521g.f9700c.equals(g0.f9706c.h(j4, obj));
                case R.styleable.GradientColor_android_endY /* 11 */:
                    if (g0.f9706c.f(j4, obj) == 0) {
                        return false;
                    }
                    break;
                case 12:
                    if (g0.f9706c.f(j4, obj) == 0) {
                        return false;
                    }
                    break;
                case 13:
                    if (g0.f9706c.f(j4, obj) == 0) {
                        return false;
                    }
                    break;
                case 14:
                    if (g0.f9706c.g(j4, obj) == 0) {
                        return false;
                    }
                    break;
                case 15:
                    if (g0.f9706c.f(j4, obj) == 0) {
                        return false;
                    }
                    break;
                case 16:
                    if (g0.f9706c.g(j4, obj) == 0) {
                        return false;
                    }
                    break;
                case 17:
                    if (g0.f9706c.h(j4, obj) == null) {
                        return false;
                    }
                    break;
                default:
                    throw new IllegalArgumentException();
            }
        } else if (((1 << (i10 >>> 20)) & g0.f9706c.f(j, obj)) == 0) {
            return false;
        }
        return true;
    }

    public final boolean o(Object obj, int i9, int i10, int i11, int i12) {
        if (i10 == 1048575) {
            return n(i9, obj);
        }
        if ((i11 & i12) != 0) {
            return true;
        }
        return false;
    }

    public final boolean q(int i9, int i10, Object obj) {
        if (g0.f9706c.f(this.f9637a[i10 + 2] & 1048575, obj) == i9) {
            return true;
        }
        return false;
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:77)
        */
    public final void r(androidx.datastore.preferences.protobuf.b0 r19, java.lang.Object r20, F0.C0120y r21, androidx.datastore.preferences.protobuf.C0526l r22) {
        /*
            Method dump skipped, instructions count: 1802
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.K.r(androidx.datastore.preferences.protobuf.b0, java.lang.Object, F0.y, androidx.datastore.preferences.protobuf.l):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:41:0x009b, code lost:
    
        r10.put(r2, r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x009e, code lost:
    
        r0.j(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00a1, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void s(java.lang.Object r9, int r10, java.lang.Object r11, androidx.datastore.preferences.protobuf.C0526l r12, F0.C0120y r13) {
        /*
            r8 = this;
            int r10 = r8.M(r10)
            r0 = 1048575(0xfffff, float:1.469367E-39)
            r10 = r10 & r0
            long r0 = (long) r10
            androidx.datastore.preferences.protobuf.f0 r10 = androidx.datastore.preferences.protobuf.g0.f9706c
            java.lang.Object r10 = r10.h(r0, r9)
            androidx.datastore.preferences.protobuf.G r2 = r8.f9648m
            if (r10 != 0) goto L20
            r2.getClass()
            androidx.datastore.preferences.protobuf.F r10 = androidx.datastore.preferences.protobuf.F.f9630b
            androidx.datastore.preferences.protobuf.F r10 = r10.c()
            androidx.datastore.preferences.protobuf.g0.o(r9, r0, r10)
            goto L37
        L20:
            r2.getClass()
            r3 = r10
            androidx.datastore.preferences.protobuf.F r3 = (androidx.datastore.preferences.protobuf.F) r3
            boolean r3 = r3.f9631a
            if (r3 != 0) goto L37
            androidx.datastore.preferences.protobuf.F r3 = androidx.datastore.preferences.protobuf.F.f9630b
            androidx.datastore.preferences.protobuf.F r3 = r3.c()
            androidx.datastore.preferences.protobuf.G.a(r3, r10)
            androidx.datastore.preferences.protobuf.g0.o(r9, r0, r3)
            r10 = r3
        L37:
            r2.getClass()
            androidx.datastore.preferences.protobuf.F r10 = (androidx.datastore.preferences.protobuf.F) r10
            androidx.datastore.preferences.protobuf.E r11 = (androidx.datastore.preferences.protobuf.E) r11
            androidx.datastore.preferences.protobuf.D r9 = r11.f9629a
            r11 = 2
            r13.T(r11)
            java.lang.Object r0 = r13.f2293e
            W5.d r0 = (W5.d) r0
            int r1 = r0.D()
            int r1 = r0.l(r1)
            java.lang.String r2 = ""
            a0.g r3 = r9.f9628c
            r4 = r3
        L55:
            int r5 = r13.e()     // Catch: java.lang.Throwable -> L79
            r6 = 2147483647(0x7fffffff, float:NaN)
            if (r5 == r6) goto L9b
            boolean r6 = r0.g()     // Catch: java.lang.Throwable -> L79
            if (r6 == 0) goto L65
            goto L9b
        L65:
            r6 = 1
            java.lang.String r7 = "Unable to parse map entry."
            if (r5 == r6) goto L86
            if (r5 == r11) goto L7b
            boolean r5 = r13.U()     // Catch: java.lang.Throwable -> L79 androidx.datastore.preferences.protobuf.C0536w -> L8e
            if (r5 == 0) goto L73
            goto L55
        L73:
            androidx.datastore.preferences.protobuf.x r5 = new androidx.datastore.preferences.protobuf.x     // Catch: java.lang.Throwable -> L79 androidx.datastore.preferences.protobuf.C0536w -> L8e
            r5.<init>(r7)     // Catch: java.lang.Throwable -> L79 androidx.datastore.preferences.protobuf.C0536w -> L8e
            throw r5     // Catch: java.lang.Throwable -> L79 androidx.datastore.preferences.protobuf.C0536w -> L8e
        L79:
            r9 = move-exception
            goto La2
        L7b:
            androidx.datastore.preferences.protobuf.m0 r5 = r9.f9627b     // Catch: java.lang.Throwable -> L79 androidx.datastore.preferences.protobuf.C0536w -> L8e
            java.lang.Class r6 = r3.getClass()     // Catch: java.lang.Throwable -> L79 androidx.datastore.preferences.protobuf.C0536w -> L8e
            java.lang.Object r4 = r13.t(r5, r6, r12)     // Catch: java.lang.Throwable -> L79 androidx.datastore.preferences.protobuf.C0536w -> L8e
            goto L55
        L86:
            androidx.datastore.preferences.protobuf.k0 r5 = r9.f9626a     // Catch: java.lang.Throwable -> L79 androidx.datastore.preferences.protobuf.C0536w -> L8e
            r6 = 0
            java.lang.Object r2 = r13.t(r5, r6, r6)     // Catch: java.lang.Throwable -> L79 androidx.datastore.preferences.protobuf.C0536w -> L8e
            goto L55
        L8e:
            boolean r5 = r13.U()     // Catch: java.lang.Throwable -> L79
            if (r5 == 0) goto L95
            goto L55
        L95:
            androidx.datastore.preferences.protobuf.x r9 = new androidx.datastore.preferences.protobuf.x     // Catch: java.lang.Throwable -> L79
            r9.<init>(r7)     // Catch: java.lang.Throwable -> L79
            throw r9     // Catch: java.lang.Throwable -> L79
        L9b:
            r10.put(r2, r4)     // Catch: java.lang.Throwable -> L79
            r0.j(r1)
            return
        La2:
            r0.j(r1)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.K.s(java.lang.Object, int, java.lang.Object, androidx.datastore.preferences.protobuf.l, F0.y):void");
    }

    public final void t(Object obj, int i9, Object obj2) {
        if (!n(i9, obj2)) {
            return;
        }
        long M7 = M(i9) & 1048575;
        Unsafe unsafe = f9636o;
        Object object = unsafe.getObject(obj2, M7);
        if (object != null) {
            T m9 = m(i9);
            if (!n(i9, obj)) {
                if (!p(object)) {
                    unsafe.putObject(obj, M7, object);
                } else {
                    AbstractC0533t d9 = m9.d();
                    m9.a(d9, object);
                    unsafe.putObject(obj, M7, d9);
                }
                H(i9, obj);
                return;
            }
            Object object2 = unsafe.getObject(obj, M7);
            if (!p(object2)) {
                AbstractC0533t d10 = m9.d();
                m9.a(d10, object2);
                unsafe.putObject(obj, M7, d10);
                object2 = d10;
            }
            m9.a(object2, object);
            return;
        }
        throw new IllegalStateException("Source subfield " + this.f9637a[i9] + " is present but null: " + obj2);
    }

    public final void u(Object obj, int i9, Object obj2) {
        int[] iArr = this.f9637a;
        int i10 = iArr[i9];
        if (!q(i10, i9, obj2)) {
            return;
        }
        long M7 = M(i9) & 1048575;
        Unsafe unsafe = f9636o;
        Object object = unsafe.getObject(obj2, M7);
        if (object != null) {
            T m9 = m(i9);
            if (!q(i10, i9, obj)) {
                if (!p(object)) {
                    unsafe.putObject(obj, M7, object);
                } else {
                    AbstractC0533t d9 = m9.d();
                    m9.a(d9, object);
                    unsafe.putObject(obj, M7, d9);
                }
                I(i10, i9, obj);
                return;
            }
            Object object2 = unsafe.getObject(obj, M7);
            if (!p(object2)) {
                AbstractC0533t d10 = m9.d();
                m9.a(d10, object2);
                unsafe.putObject(obj, M7, d10);
                object2 = d10;
            }
            m9.a(object2, object);
            return;
        }
        throw new IllegalStateException("Source subfield " + iArr[i9] + " is present but null: " + obj2);
    }

    public final Object v(int i9, Object obj) {
        T m9 = m(i9);
        long M7 = M(i9) & 1048575;
        if (!n(i9, obj)) {
            return m9.d();
        }
        Object object = f9636o.getObject(obj, M7);
        if (p(object)) {
            return object;
        }
        AbstractC0533t d9 = m9.d();
        if (object != null) {
            m9.a(d9, object);
        }
        return d9;
    }

    public final Object w(int i9, int i10, Object obj) {
        T m9 = m(i10);
        if (!q(i9, i10, obj)) {
            return m9.d();
        }
        Object object = f9636o.getObject(obj, M(i10) & 1048575);
        if (p(object)) {
            return object;
        }
        AbstractC0533t d9 = m9.d();
        if (object != null) {
            m9.a(d9, object);
        }
        return d9;
    }
}
