package com.google.crypto.tink.shaded.protobuf;

import java.lang.reflect.Field;
import sun.misc.Unsafe;

/* loaded from: classes.dex */
public abstract class m0 {

    /* renamed from: a, reason: collision with root package name */
    public final Unsafe f16382a;

    public m0(Unsafe unsafe) {
        this.f16382a = unsafe;
    }

    public final int a(Class cls) {
        return this.f16382a.arrayBaseOffset(cls);
    }

    public final int b(Class cls) {
        return this.f16382a.arrayIndexScale(cls);
    }

    public abstract boolean c(long j, Object obj);

    public abstract byte d(long j, Object obj);

    public abstract double e(long j, Object obj);

    public abstract float f(long j, Object obj);

    public final int g(long j, Object obj) {
        return this.f16382a.getInt(obj, j);
    }

    public final long h(long j, Object obj) {
        return this.f16382a.getLong(obj, j);
    }

    public final Object i(long j, Object obj) {
        return this.f16382a.getObject(obj, j);
    }

    public final long j(Field field) {
        return this.f16382a.objectFieldOffset(field);
    }

    public abstract void k(long j, Object obj, boolean z9);

    public abstract void l(Object obj, long j, byte b9);

    public abstract void m(Object obj, long j, double d9);

    public abstract void n(Object obj, long j, float f9);

    public final void o(int i9, long j, Object obj) {
        this.f16382a.putInt(obj, j, i9);
    }

    public final void p(Object obj, long j, long j4) {
        this.f16382a.putLong(obj, j, j4);
    }

    public final void q(Object obj, long j, Object obj2) {
        this.f16382a.putObject(obj, j, obj2);
    }

    public boolean r() {
        Unsafe unsafe = this.f16382a;
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
            n0.a(th);
            return false;
        }
    }

    public abstract boolean s();
}
