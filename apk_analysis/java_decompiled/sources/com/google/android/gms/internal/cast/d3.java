package com.google.android.gms.internal.cast;

import java.nio.charset.Charset;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes.dex */
public final class d3 {

    /* renamed from: c, reason: collision with root package name */
    public static final d3 f14823c = new d3();

    /* renamed from: b, reason: collision with root package name */
    public final ConcurrentHashMap f14825b = new ConcurrentHashMap();

    /* renamed from: a, reason: collision with root package name */
    public final W2 f14824a = new W2();

    public final g3 a(Class cls) {
        C0886w0 c0886w0;
        g3 j;
        Charset charset = S2.f14762a;
        if (cls != null) {
            ConcurrentHashMap concurrentHashMap = this.f14825b;
            g3 g3Var = (g3) concurrentHashMap.get(cls);
            if (g3Var == null) {
                W2 w22 = this.f14824a;
                w22.getClass();
                C0886w0 c0886w02 = h3.f14855a;
                N2.class.isAssignableFrom(cls);
                f3 b9 = ((W2) w22.f14788b).b(cls);
                if ((b9.f14846d & 2) == 2) {
                    C0886w0 c0886w03 = h3.f14855a;
                    C0886w0 c0886w04 = K2.f14739a;
                    j = new b3(c0886w03, b9.f14843a);
                } else {
                    int i9 = c3.f14819a;
                    int i10 = U2.f14776a;
                    C0886w0 c0886w05 = h3.f14855a;
                    if (b9.a() - 1 != 1) {
                        c0886w0 = K2.f14739a;
                    } else {
                        c0886w0 = null;
                    }
                    int i11 = X2.f14789a;
                    j = a3.j(b9, c0886w05, c0886w0);
                }
                g3 g3Var2 = (g3) concurrentHashMap.putIfAbsent(cls, j);
                if (g3Var2 != null) {
                    return g3Var2;
                }
                return j;
            }
            return g3Var;
        }
        throw new NullPointerException("messageType");
    }
}
