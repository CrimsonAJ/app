package com.google.crypto.tink.shaded.protobuf;

import java.util.Collections;
import java.util.Map;

/* renamed from: com.google.crypto.tink.shaded.protobuf.n, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1043n {

    /* renamed from: a, reason: collision with root package name */
    public static volatile C1043n f16383a;

    /* renamed from: b, reason: collision with root package name */
    public static final C1043n f16384b;

    /* JADX WARN: Type inference failed for: r0v0, types: [com.google.crypto.tink.shaded.protobuf.n, java.lang.Object] */
    static {
        ?? obj = new Object();
        Map map = Collections.EMPTY_MAP;
        f16384b = obj;
    }

    public static C1043n a() {
        C1043n c1043n;
        C1043n c1043n2 = f16383a;
        if (c1043n2 == null) {
            synchronized (C1043n.class) {
                try {
                    c1043n = f16383a;
                    if (c1043n == null) {
                        Class cls = AbstractC1042m.f16381a;
                        C1043n c1043n3 = null;
                        if (cls != null) {
                            try {
                                c1043n3 = (C1043n) cls.getDeclaredMethod("getEmptyRegistry", null).invoke(null, null);
                            } catch (Exception unused) {
                            }
                        }
                        if (c1043n3 != null) {
                            c1043n = c1043n3;
                        } else {
                            c1043n = f16384b;
                        }
                        f16383a = c1043n;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return c1043n;
        }
        return c1043n2;
    }
}
