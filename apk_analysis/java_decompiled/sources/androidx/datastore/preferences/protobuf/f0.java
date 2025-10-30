package androidx.datastore.preferences.protobuf;

import java.lang.reflect.Field;
import sun.misc.Unsafe;

/* loaded from: classes.dex */
public abstract class f0 {

    /* renamed from: a, reason: collision with root package name */
    public final Unsafe f9699a;

    public f0(Unsafe unsafe) {
        this.f9699a = unsafe;
    }

    public final int a(Class cls) {
        return this.f9699a.arrayBaseOffset(cls);
    }

    public final int b(Class cls) {
        return this.f9699a.arrayIndexScale(cls);
    }

    public abstract boolean c(long j, Object obj);

    public abstract double d(long j, Object obj);

    public abstract float e(long j, Object obj);

    public final int f(long j, Object obj) {
        return this.f9699a.getInt(obj, j);
    }

    public final long g(long j, Object obj) {
        return this.f9699a.getLong(obj, j);
    }

    public final Object h(long j, Object obj) {
        return this.f9699a.getObject(obj, j);
    }

    public final long i(Field field) {
        return this.f9699a.objectFieldOffset(field);
    }

    public abstract void j(long j, Object obj, boolean z9);

    public abstract void k(Object obj, long j, byte b9);

    public abstract void l(Object obj, long j, double d9);

    public abstract void m(Object obj, long j, float f9);

    public final void n(int i9, long j, Object obj) {
        this.f9699a.putInt(obj, j, i9);
    }

    public final void o(Object obj, long j, long j4) {
        this.f9699a.putLong(obj, j, j4);
    }

    public final void p(Object obj, long j, Object obj2) {
        this.f9699a.putObject(obj, j, obj2);
    }

    public boolean q() {
        Unsafe unsafe = this.f9699a;
        if (unsafe == null) {
            return false;
        }
        try {
            Class<?> cls = unsafe.getClass();
            cls.getMethod("objectFieldOffset", Field.class);
            cls.getMethod("arrayBaseOffset", Class.class);
            cls.getMethod("arrayIndexScale", Class.class);
            Class<?> cls2 = Long.TYPE;
            cls.getMethod("getInt", Object.class, cls2);
            cls.getMethod("putInt", Object.class, cls2, Integer.TYPE);
            cls.getMethod("getLong", Object.class, cls2);
            cls.getMethod("putLong", Object.class, cls2, cls2);
            cls.getMethod("getObject", Object.class, cls2);
            cls.getMethod("putObject", Object.class, cls2, Object.class);
            return true;
        } catch (Throwable th) {
            g0.a(th);
            return false;
        }
    }

    public abstract boolean r();
}
