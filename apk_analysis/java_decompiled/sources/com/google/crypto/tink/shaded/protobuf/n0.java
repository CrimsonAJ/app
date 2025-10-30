package com.google.crypto.tink.shaded.protobuf;

import java.lang.reflect.Field;
import java.nio.Buffer;
import java.nio.ByteOrder;
import java.security.AccessController;
import java.security.PrivilegedExceptionAction;
import java.util.logging.Level;
import java.util.logging.Logger;
import sun.misc.Unsafe;

/* loaded from: classes.dex */
public abstract class n0 {

    /* renamed from: a, reason: collision with root package name */
    public static final Unsafe f16385a;

    /* renamed from: b, reason: collision with root package name */
    public static final Class f16386b;

    /* renamed from: c, reason: collision with root package name */
    public static final m0 f16387c;

    /* renamed from: d, reason: collision with root package name */
    public static final boolean f16388d;

    /* renamed from: e, reason: collision with root package name */
    public static final boolean f16389e;

    /* renamed from: f, reason: collision with root package name */
    public static final long f16390f;

    /* renamed from: g, reason: collision with root package name */
    public static final boolean f16391g;

    static {
        boolean s9;
        boolean r5;
        Unsafe j = j();
        f16385a = j;
        f16386b = AbstractC1032c.f16339a;
        boolean f9 = f(Long.TYPE);
        boolean f10 = f(Integer.TYPE);
        m0 m0Var = null;
        if (j != null) {
            if (AbstractC1032c.a()) {
                if (f9) {
                    m0Var = new k0(j, 1);
                } else if (f10) {
                    m0Var = new k0(j, 0);
                }
            } else {
                m0Var = new m0(j);
            }
        }
        f16387c = m0Var;
        boolean z9 = false;
        if (m0Var == null) {
            s9 = false;
        } else {
            s9 = m0Var.s();
        }
        f16388d = s9;
        if (m0Var == null) {
            r5 = false;
        } else {
            r5 = m0Var.r();
        }
        f16389e = r5;
        f16390f = c(byte[].class);
        c(boolean[].class);
        d(boolean[].class);
        c(int[].class);
        d(int[].class);
        c(long[].class);
        d(long[].class);
        c(float[].class);
        d(float[].class);
        c(double[].class);
        d(double[].class);
        c(Object[].class);
        d(Object[].class);
        Field e8 = e();
        if (e8 != null && m0Var != null) {
            m0Var.j(e8);
        }
        if (ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN) {
            z9 = true;
        }
        f16391g = z9;
    }

    public static void a(Throwable th) {
        Logger.getLogger(n0.class.getName()).log(Level.WARNING, "platform method missing - proto runtime falling back to safer methods: " + th);
    }

    public static Object b(Class cls) {
        try {
            return f16385a.allocateInstance(cls);
        } catch (InstantiationException e8) {
            throw new IllegalStateException(e8);
        }
    }

    public static int c(Class cls) {
        if (f16389e) {
            return f16387c.a(cls);
        }
        return -1;
    }

    public static void d(Class cls) {
        if (f16389e) {
            f16387c.b(cls);
        }
    }

    public static Field e() {
        Field field;
        Field field2;
        if (AbstractC1032c.a()) {
            try {
                field2 = Buffer.class.getDeclaredField("effectiveDirectAddress");
            } catch (Throwable unused) {
                field2 = null;
            }
            if (field2 != null) {
                return field2;
            }
        }
        try {
            field = Buffer.class.getDeclaredField("address");
        } catch (Throwable unused2) {
            field = null;
        }
        if (field == null || field.getType() != Long.TYPE) {
            return null;
        }
        return field;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static boolean f(Class cls) {
        if (!AbstractC1032c.a()) {
            return false;
        }
        try {
            Class cls2 = f16386b;
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

    public static byte g(byte[] bArr, long j) {
        return f16387c.d(f16390f + j, bArr);
    }

    public static byte h(long j, Object obj) {
        return (byte) ((f16387c.g((-4) & j, obj) >>> ((int) (((~j) & 3) << 3))) & 255);
    }

    public static byte i(long j, Object obj) {
        return (byte) ((f16387c.g((-4) & j, obj) >>> ((int) ((j & 3) << 3))) & 255);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.security.PrivilegedExceptionAction] */
    public static Unsafe j() {
        try {
            return (Unsafe) AccessController.doPrivileged((PrivilegedExceptionAction) new Object());
        } catch (Throwable unused) {
            return null;
        }
    }

    public static void k(byte[] bArr, long j, byte b9) {
        f16387c.l(bArr, f16390f + j, b9);
    }

    public static void l(Object obj, long j, byte b9) {
        long j4 = (-4) & j;
        int g9 = f16387c.g(j4, obj);
        int i9 = ((~((int) j)) & 3) << 3;
        n(((255 & b9) << i9) | (g9 & (~(255 << i9))), j4, obj);
    }

    public static void m(Object obj, long j, byte b9) {
        long j4 = (-4) & j;
        int i9 = (((int) j) & 3) << 3;
        n(((255 & b9) << i9) | (f16387c.g(j4, obj) & (~(255 << i9))), j4, obj);
    }

    public static void n(int i9, long j, Object obj) {
        f16387c.o(i9, j, obj);
    }

    public static void o(Object obj, long j, long j4) {
        f16387c.p(obj, j, j4);
    }

    public static void p(Object obj, long j, Object obj2) {
        f16387c.q(obj, j, obj2);
    }
}
