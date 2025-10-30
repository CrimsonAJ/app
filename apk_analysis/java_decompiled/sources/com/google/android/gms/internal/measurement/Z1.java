package com.google.android.gms.internal.measurement;

import java.util.LinkedHashMap;

/* loaded from: classes.dex */
public final class Z1 implements InterfaceC0993s2 {

    /* renamed from: b, reason: collision with root package name */
    public static final Z1 f15427b = new Z1(0);

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15428a;

    public /* synthetic */ Z1(int i9) {
        this.f15428a = i9;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [java.util.LinkedHashMap, com.google.android.gms.internal.measurement.q2] */
    public static final C0984q2 a(Object obj, Object obj2) {
        C0984q2 c0984q2 = (C0984q2) obj;
        C0984q2 c0984q22 = (C0984q2) obj2;
        if (!c0984q22.isEmpty()) {
            if (!c0984q2.f15574a) {
                if (c0984q2.isEmpty()) {
                    c0984q2 = new C0984q2();
                } else {
                    ?? linkedHashMap = new LinkedHashMap(c0984q2);
                    linkedHashMap.f15574a = true;
                    c0984q2 = linkedHashMap;
                }
            }
            c0984q2.c();
            if (!c0984q22.isEmpty()) {
                c0984q2.putAll(c0984q22);
            }
        }
        return c0984q2;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC0993s2
    public A2 b(Class cls) {
        switch (this.f15428a) {
            case 0:
                if (AbstractC0909b2.class.isAssignableFrom(cls)) {
                    try {
                        return (A2) AbstractC0909b2.g(cls.asSubclass(AbstractC0909b2.class)).m(3);
                    } catch (Exception e8) {
                        throw new RuntimeException("Unable to get message info for ".concat(cls.getName()), e8);
                    }
                }
                throw new IllegalArgumentException("Unsupported message type: ".concat(cls.getName()));
            default:
                throw new IllegalStateException("This should never be called.");
        }
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC0993s2
    public boolean c(Class cls) {
        switch (this.f15428a) {
            case 0:
                return AbstractC0909b2.class.isAssignableFrom(cls);
            default:
                return false;
        }
    }
}
