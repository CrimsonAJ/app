package com.google.android.gms.internal.cast;

import java.security.AccessController;
import java.security.PrivilegedActionException;
import java.security.PrivilegedExceptionAction;
import sun.misc.Unsafe;

/* renamed from: com.google.android.gms.internal.cast.p2, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0861p2 extends J {

    /* renamed from: d, reason: collision with root package name */
    public static final Unsafe f14945d;

    /* renamed from: e, reason: collision with root package name */
    public static final long f14946e;

    /* renamed from: f, reason: collision with root package name */
    public static final long f14947f;

    /* renamed from: g, reason: collision with root package name */
    public static final long f14948g;

    /* renamed from: h, reason: collision with root package name */
    public static final long f14949h;

    /* renamed from: i, reason: collision with root package name */
    public static final long f14950i;

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, java.security.PrivilegedExceptionAction] */
    static {
        Unsafe unsafe;
        try {
            try {
                unsafe = Unsafe.getUnsafe();
            } catch (PrivilegedActionException e8) {
                throw new RuntimeException("Could not initialize intrinsics", e8.getCause());
            }
        } catch (SecurityException unused) {
            unsafe = (Unsafe) AccessController.doPrivileged((PrivilegedExceptionAction) new Object());
        }
        try {
            f14947f = unsafe.objectFieldOffset(AbstractC0868r2.class.getDeclaredField("f"));
            f14946e = unsafe.objectFieldOffset(AbstractC0868r2.class.getDeclaredField("e"));
            f14948g = unsafe.objectFieldOffset(AbstractC0868r2.class.getDeclaredField("d"));
            f14949h = unsafe.objectFieldOffset(C0865q2.class.getDeclaredField("a"));
            f14950i = unsafe.objectFieldOffset(C0865q2.class.getDeclaredField("b"));
            f14945d = unsafe;
        } catch (NoSuchFieldException e9) {
            throw new RuntimeException(e9);
        }
    }

    @Override // com.google.android.gms.internal.cast.J
    public final C0845l2 d(AbstractC0849m2 abstractC0849m2) {
        C0845l2 c0845l2;
        C0845l2 c0845l22 = C0845l2.f14910d;
        do {
            c0845l2 = abstractC0849m2.f14966e;
            if (c0845l22 == c0845l2) {
                break;
            }
        } while (!q(abstractC0849m2, c0845l2, c0845l22));
        return c0845l2;
    }

    @Override // com.google.android.gms.internal.cast.J
    public final C0865q2 k(AbstractC0849m2 abstractC0849m2) {
        C0865q2 c0865q2;
        C0865q2 c0865q22 = C0865q2.f14957c;
        do {
            c0865q2 = abstractC0849m2.f14967f;
            if (c0865q22 == c0865q2) {
                break;
            }
        } while (!s(abstractC0849m2, c0865q2, c0865q22));
        return c0865q2;
    }

    @Override // com.google.android.gms.internal.cast.J
    public final void m(C0865q2 c0865q2, C0865q2 c0865q22) {
        f14945d.putObject(c0865q2, f14950i, c0865q22);
    }

    @Override // com.google.android.gms.internal.cast.J
    public final void o(C0865q2 c0865q2, Thread thread) {
        f14945d.putObject(c0865q2, f14949h, thread);
    }

    @Override // com.google.android.gms.internal.cast.J
    public final boolean q(AbstractC0849m2 abstractC0849m2, C0845l2 c0845l2, C0845l2 c0845l22) {
        return AbstractC0876t2.a(f14945d, abstractC0849m2, f14946e, c0845l2, c0845l22);
    }

    @Override // com.google.android.gms.internal.cast.J
    public final boolean r(AbstractC0868r2 abstractC0868r2, Object obj, Object obj2) {
        return AbstractC0876t2.a(f14945d, abstractC0868r2, f14948g, obj, obj2);
    }

    @Override // com.google.android.gms.internal.cast.J
    public final boolean s(AbstractC0868r2 abstractC0868r2, C0865q2 c0865q2, C0865q2 c0865q22) {
        return AbstractC0876t2.a(f14945d, abstractC0868r2, f14947f, c0865q2, c0865q22);
    }
}
