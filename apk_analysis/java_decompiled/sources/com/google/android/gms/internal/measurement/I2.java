package com.google.android.gms.internal.measurement;

import java.security.AccessController;
import java.security.PrivilegedExceptionAction;
import sun.misc.Unsafe;

/* loaded from: classes.dex */
public abstract class I2 {

    /* renamed from: a, reason: collision with root package name */
    public static final Unsafe f15224a;

    /* renamed from: b, reason: collision with root package name */
    public static final Class f15225b;

    /* renamed from: c, reason: collision with root package name */
    public static final H2 f15226c;

    /* renamed from: d, reason: collision with root package name */
    public static final boolean f15227d;

    /* renamed from: e, reason: collision with root package name */
    public static final boolean f15228e;

    /* renamed from: f, reason: collision with root package name */
    public static final long f15229f;

    /* renamed from: g, reason: collision with root package name */
    public static final boolean f15230g;

    /* JADX WARN: Can't wrap try/catch for region: R(19:1|(17:(1:65)(1:(1:67))|4|(7:43|44|45|46|47|(4:51|52|(1:54)|57)|(14:50|7|(14:36|37|38|39|10|11|12|(3:26|27|(6:31|(1:18)|19|(1:21)(1:25)|22|23))|14|(2:16|18)|19|(0)(0)|22|23)|9|10|11|12|(0)|14|(0)|19|(0)(0)|22|23))|6|7|(0)|9|10|11|12|(0)|14|(0)|19|(0)(0)|22|23)|3|4|(0)|6|7|(0)|9|10|11|12|(0)|14|(0)|19|(0)(0)|22|23) */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x016b, code lost:
    
        r0 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0078, code lost:
    
        if (r0.getType() == r6) goto L26;
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0181  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0192  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0194  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x016e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x004e  */
    static {
        /*
            Method dump skipped, instructions count: 409
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.I2.<clinit>():void");
    }

    public static void a(Class cls) {
        if (f15228e) {
            f15226c.f15219a.arrayIndexScale(cls);
        }
    }

    public static void b(Object obj, long j, byte b9) {
        Unsafe unsafe = f15226c.f15219a;
        long j4 = (-4) & j;
        int i9 = unsafe.getInt(obj, j4);
        int i10 = ((~((int) j)) & 3) << 3;
        unsafe.putInt(obj, j4, ((255 & b9) << i10) | (i9 & (~(255 << i10))));
    }

    public static void c(Object obj, long j, byte b9) {
        Unsafe unsafe = f15226c.f15219a;
        long j4 = (-4) & j;
        int i9 = (((int) j) & 3) << 3;
        unsafe.putInt(obj, j4, ((255 & b9) << i9) | (unsafe.getInt(obj, j4) & (~(255 << i9))));
    }

    public static int d(long j, Object obj) {
        return f15226c.f15219a.getInt(obj, j);
    }

    public static long e(long j, Object obj) {
        return f15226c.f15219a.getLong(obj, j);
    }

    public static Object f(Class cls) {
        try {
            return f15224a.allocateInstance(cls);
        } catch (InstantiationException e8) {
            throw new IllegalStateException(e8);
        }
    }

    public static Object g(long j, Object obj) {
        return f15226c.f15219a.getObject(obj, j);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.security.PrivilegedExceptionAction] */
    public static Unsafe h() {
        try {
            return (Unsafe) AccessController.doPrivileged((PrivilegedExceptionAction) new Object());
        } catch (Throwable unused) {
            return null;
        }
    }

    public static void i(int i9, long j, Object obj) {
        f15226c.f15219a.putInt(obj, j, i9);
    }

    public static void j(Object obj, long j, long j4) {
        f15226c.f15219a.putLong(obj, j, j4);
    }

    public static void k(Object obj, long j, Object obj2) {
        f15226c.f15219a.putObject(obj, j, obj2);
    }

    public static /* bridge */ /* synthetic */ boolean l(long j, Object obj) {
        if (((byte) ((f15226c.f15219a.getInt(obj, (-4) & j) >>> ((int) (((~j) & 3) << 3))) & 255)) != 0) {
            return true;
        }
        return false;
    }

    public static /* bridge */ /* synthetic */ boolean m(long j, Object obj) {
        if (((byte) ((f15226c.f15219a.getInt(obj, (-4) & j) >>> ((int) ((j & 3) << 3))) & 255)) != 0) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static boolean n(Class cls) {
        int i9 = P1.f15282a;
        try {
            Class cls2 = f15225b;
            Class cls3 = Boolean.TYPE;
            cls2.getMethod("peekLong", cls, cls3);
            cls2.getMethod("pokeLong", cls, Long.TYPE, cls3);
            Class cls4 = Integer.TYPE;
            cls2.getMethod("pokeInt", cls, cls4, cls3);
            cls2.getMethod("peekInt", cls, cls3);
            cls2.getMethod("pokeByte", cls, Byte.TYPE);
            cls2.getMethod("peekByte", cls);
            cls2.getMethod("pokeByteArray", cls, byte[].class, cls4, cls4);
            cls2.getMethod("peekByteArray", cls, byte[].class, cls4, cls4);
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    public static int o(Class cls) {
        if (f15228e) {
            return f15226c.f15219a.arrayBaseOffset(cls);
        }
        return -1;
    }
}
