package androidx.datastore.preferences.protobuf;

import java.lang.reflect.Field;
import java.nio.Buffer;
import java.nio.ByteOrder;
import java.security.AccessController;
import java.security.PrivilegedExceptionAction;
import java.util.logging.Level;
import java.util.logging.Logger;
import sun.misc.Unsafe;

/* loaded from: classes.dex */
public abstract class g0 {

    /* renamed from: a, reason: collision with root package name */
    public static final Unsafe f9704a;

    /* renamed from: b, reason: collision with root package name */
    public static final Class f9705b;

    /* renamed from: c, reason: collision with root package name */
    public static final f0 f9706c;

    /* renamed from: d, reason: collision with root package name */
    public static final boolean f9707d;

    /* renamed from: e, reason: collision with root package name */
    public static final boolean f9708e;

    /* renamed from: f, reason: collision with root package name */
    public static final long f9709f;

    /* renamed from: g, reason: collision with root package name */
    public static final boolean f9710g;

    static {
        boolean r5;
        boolean q9;
        Unsafe i9 = i();
        f9704a = i9;
        f9705b = AbstractC0517c.f9689a;
        boolean h7 = h(Long.TYPE);
        boolean h9 = h(Integer.TYPE);
        f0 f0Var = null;
        if (i9 != null) {
            if (AbstractC0517c.a()) {
                if (h7) {
                    f0Var = new d0(i9, 1);
                } else if (h9) {
                    f0Var = new d0(i9, 0);
                }
            } else {
                f0Var = new f0(i9);
            }
        }
        f9706c = f0Var;
        boolean z9 = false;
        if (f0Var == null) {
            r5 = false;
        } else {
            r5 = f0Var.r();
        }
        f9707d = r5;
        if (f0Var == null) {
            q9 = false;
        } else {
            q9 = f0Var.q();
        }
        f9708e = q9;
        f9709f = e(byte[].class);
        e(boolean[].class);
        f(boolean[].class);
        e(int[].class);
        f(int[].class);
        e(long[].class);
        f(long[].class);
        e(float[].class);
        f(float[].class);
        e(double[].class);
        f(double[].class);
        e(Object[].class);
        f(Object[].class);
        Field g9 = g();
        if (g9 != null && f0Var != null) {
            f0Var.i(g9);
        }
        if (ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN) {
            z9 = true;
        }
        f9710g = z9;
    }

    public static void a(Throwable th) {
        Logger.getLogger(g0.class.getName()).log(Level.WARNING, "platform method missing - proto runtime falling back to safer methods: " + th);
    }

    public static boolean b(long j, Object obj) {
        if (((byte) ((f9706c.f((-4) & j, obj) >>> ((int) (((~j) & 3) << 3))) & 255)) != 0) {
            return true;
        }
        return false;
    }

    public static boolean c(long j, Object obj) {
        if (((byte) ((f9706c.f((-4) & j, obj) >>> ((int) ((j & 3) << 3))) & 255)) != 0) {
            return true;
        }
        return false;
    }

    public static Object d(Class cls) {
        try {
            return f9704a.allocateInstance(cls);
        } catch (InstantiationException e8) {
            throw new IllegalStateException(e8);
        }
    }

    public static int e(Class cls) {
        if (f9708e) {
            return f9706c.a(cls);
        }
        return -1;
    }

    public static void f(Class cls) {
        if (f9708e) {
            f9706c.b(cls);
        }
    }

    public static Field g() {
        Field field;
        Field field2;
        if (AbstractC0517c.a()) {
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
    public static boolean h(Class cls) {
        if (!AbstractC0517c.a()) {
            return false;
        }
        try {
            Class cls2 = f9705b;
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

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.security.PrivilegedExceptionAction] */
    public static Unsafe i() {
        try {
            return (Unsafe) AccessController.doPrivileged((PrivilegedExceptionAction) new Object());
        } catch (Throwable unused) {
            return null;
        }
    }

    public static void j(byte[] bArr, long j, byte b9) {
        f9706c.k(bArr, f9709f + j, b9);
    }

    public static void k(Object obj, long j, byte b9) {
        long j4 = (-4) & j;
        int f9 = f9706c.f(j4, obj);
        int i9 = ((~((int) j)) & 3) << 3;
        m(((255 & b9) << i9) | (f9 & (~(255 << i9))), j4, obj);
    }

    public static void l(Object obj, long j, byte b9) {
        long j4 = (-4) & j;
        int i9 = (((int) j) & 3) << 3;
        m(((255 & b9) << i9) | (f9706c.f(j4, obj) & (~(255 << i9))), j4, obj);
    }

    public static void m(int i9, long j, Object obj) {
        f9706c.n(i9, j, obj);
    }

    public static void n(Object obj, long j, long j4) {
        f9706c.o(obj, j, j4);
    }

    public static void o(Object obj, long j, Object obj2) {
        f9706c.p(obj, j, obj2);
    }
}
