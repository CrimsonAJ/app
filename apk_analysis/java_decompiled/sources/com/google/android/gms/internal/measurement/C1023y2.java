package com.google.android.gms.internal.measurement;

import java.nio.charset.Charset;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.google.android.gms.internal.measurement.y2, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1023y2 {

    /* renamed from: c, reason: collision with root package name */
    public static final C1023y2 f15696c = new C1023y2();

    /* renamed from: b, reason: collision with root package name */
    public final ConcurrentHashMap f15698b = new ConcurrentHashMap();

    /* renamed from: a, reason: collision with root package name */
    public final C0974o2 f15697a = new C0974o2(0);

    public final B2 a(Class cls) {
        Z1 z12;
        B2 u9;
        Charset charset = AbstractC0944i2.f15502a;
        if (cls != null) {
            ConcurrentHashMap concurrentHashMap = this.f15698b;
            B2 b22 = (B2) concurrentHashMap.get(cls);
            if (b22 == null) {
                C0974o2 c0974o2 = this.f15697a;
                c0974o2.getClass();
                Z1 z13 = C2.f15189a;
                AbstractC0909b2.class.isAssignableFrom(cls);
                A2 b9 = ((C0974o2) c0974o2.f15559a).b(cls);
                if ((b9.f15179d & 2) == 2) {
                    Z1 z14 = C2.f15189a;
                    Z1 z15 = W1.f15325a;
                    u9 = new C1008v2(z14, b9.f15176a);
                } else {
                    int i9 = AbstractC1013w2.f15689a;
                    int i10 = AbstractC0964m2.f15540a;
                    Z1 z16 = C2.f15189a;
                    if (b9.a() - 1 != 1) {
                        z12 = W1.f15325a;
                    } else {
                        z12 = null;
                    }
                    int i11 = AbstractC0988r2.f15575a;
                    u9 = C1003u2.u(b9, z16, z12);
                }
                B2 b23 = (B2) concurrentHashMap.putIfAbsent(cls, u9);
                if (b23 != null) {
                    return b23;
                }
                return u9;
            }
            return b22;
        }
        throw new NullPointerException("messageType");
    }
}
