package com.google.crypto.tink.shaded.protobuf;

import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes.dex */
public final class Y {

    /* renamed from: c, reason: collision with root package name */
    public static final Y f16328c = new Y();

    /* renamed from: b, reason: collision with root package name */
    public final ConcurrentHashMap f16330b = new ConcurrentHashMap();

    /* renamed from: a, reason: collision with root package name */
    public final K f16329a = new K();

    public final b0 a(Class cls) {
        b0 C8;
        Class cls2;
        AbstractC1054z.a(cls, "messageType");
        ConcurrentHashMap concurrentHashMap = this.f16330b;
        b0 b0Var = (b0) concurrentHashMap.get(cls);
        if (b0Var == null) {
            K k5 = this.f16329a;
            k5.getClass();
            Class cls3 = c0.f16341a;
            if (!AbstractC1050v.class.isAssignableFrom(cls) && (cls2 = c0.f16341a) != null && !cls2.isAssignableFrom(cls)) {
                throw new IllegalArgumentException("Message classes must extend GeneratedMessageV3 or GeneratedMessageLite");
            }
            a0 a5 = ((J) k5.f16302a).a(cls);
            if ((a5.f16337d & 2) == 2) {
                boolean isAssignableFrom = AbstractC1050v.class.isAssignableFrom(cls);
                AbstractC1030a abstractC1030a = a5.f16334a;
                if (isAssignableFrom) {
                    C8 = new T(c0.f16344d, AbstractC1045p.f16393a, abstractC1030a);
                } else {
                    f0 f0Var = c0.f16342b;
                    C1044o c1044o = AbstractC1045p.f16394b;
                    if (c1044o != null) {
                        C8 = new T(f0Var, c1044o, abstractC1030a);
                    } else {
                        throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
                    }
                }
            } else if (AbstractC1050v.class.isAssignableFrom(cls)) {
                if ((a5.f16337d & 1) == 1) {
                    C8 = S.C(a5, V.f16327b, H.f16299b, c0.f16344d, AbstractC1045p.f16393a, N.f16306b);
                } else {
                    C8 = S.C(a5, V.f16327b, H.f16299b, c0.f16344d, null, N.f16306b);
                }
            } else if ((a5.f16337d & 1) == 1) {
                U u9 = V.f16326a;
                F f9 = H.f16298a;
                f0 f0Var2 = c0.f16342b;
                C1044o c1044o2 = AbstractC1045p.f16394b;
                if (c1044o2 != null) {
                    C8 = S.C(a5, u9, f9, f0Var2, c1044o2, N.f16305a);
                } else {
                    throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
                }
            } else {
                C8 = S.C(a5, V.f16326a, H.f16298a, c0.f16343c, null, N.f16305a);
            }
            b0 b0Var2 = (b0) concurrentHashMap.putIfAbsent(cls, C8);
            if (b0Var2 != null) {
                return b0Var2;
            }
            return C8;
        }
        return b0Var;
    }
}
