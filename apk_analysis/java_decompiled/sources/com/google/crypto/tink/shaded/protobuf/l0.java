package com.google.crypto.tink.shaded.protobuf;

import java.lang.reflect.Field;
import sun.misc.Unsafe;

/* loaded from: classes.dex */
public final class l0 extends m0 {
    @Override // com.google.crypto.tink.shaded.protobuf.m0
    public final boolean c(long j, Object obj) {
        return this.f16382a.getBoolean(obj, j);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.m0
    public final byte d(long j, Object obj) {
        return this.f16382a.getByte(obj, j);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.m0
    public final double e(long j, Object obj) {
        return this.f16382a.getDouble(obj, j);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.m0
    public final float f(long j, Object obj) {
        return this.f16382a.getFloat(obj, j);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.m0
    public final void k(long j, Object obj, boolean z9) {
        this.f16382a.putBoolean(obj, j, z9);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.m0
    public final void l(Object obj, long j, byte b9) {
        this.f16382a.putByte(obj, j, b9);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.m0
    public final void m(Object obj, long j, double d9) {
        this.f16382a.putDouble(obj, j, d9);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.m0
    public final void n(Object obj, long j, float f9) {
        this.f16382a.putFloat(obj, j, f9);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.m0
    public final boolean r() {
        if (!super.r()) {
            return false;
        }
        try {
            Class<?> cls = this.f16382a.getClass();
            Class<?> cls2 = Long.TYPE;
            cls.getMethod("getByte", Object.class, cls2);
            cls.getMethod("putByte", Object.class, cls2, Byte.TYPE);
            cls.getMethod("getBoolean", Object.class, cls2);
            cls.getMethod("putBoolean", Object.class, cls2, Boolean.TYPE);
            cls.getMethod("getFloat", Object.class, cls2);
            cls.getMethod("putFloat", Object.class, cls2, Float.TYPE);
            cls.getMethod("getDouble", Object.class, cls2);
            cls.getMethod("putDouble", Object.class, cls2, Double.TYPE);
            return true;
        } catch (Throwable th) {
            n0.a(th);
            return false;
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.m0
    public final boolean s() {
        Unsafe unsafe = this.f16382a;
        if (unsafe != null) {
            try {
                Class<?> cls = unsafe.getClass();
                cls.getMethod("objectFieldOffset", Field.class);
                Class<?> cls2 = Long.TYPE;
                cls.getMethod("getLong", Object.class, cls2);
                if (n0.e() != null) {
                    try {
                        Class<?> cls3 = this.f16382a.getClass();
                        cls3.getMethod("getByte", cls2);
                        cls3.getMethod("putByte", cls2, Byte.TYPE);
                        cls3.getMethod("getInt", cls2);
                        cls3.getMethod("putInt", cls2, Integer.TYPE);
                        cls3.getMethod("getLong", cls2);
                        cls3.getMethod("putLong", cls2, cls2);
                        cls3.getMethod("copyMemory", cls2, cls2, cls2);
                        cls3.getMethod("copyMemory", Object.class, cls2, Object.class, cls2, cls2);
                        return true;
                    } catch (Throwable th) {
                        n0.a(th);
                        return false;
                    }
                }
            } catch (Throwable th2) {
                n0.a(th2);
            }
        }
        return false;
    }
}
