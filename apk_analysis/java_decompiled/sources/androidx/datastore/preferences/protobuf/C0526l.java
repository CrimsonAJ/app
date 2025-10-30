package androidx.datastore.preferences.protobuf;

import java.util.Collections;
import java.util.Map;

/* renamed from: androidx.datastore.preferences.protobuf.l, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0526l {

    /* renamed from: a, reason: collision with root package name */
    public static volatile C0526l f9734a;

    /* renamed from: b, reason: collision with root package name */
    public static final C0526l f9735b;

    /* JADX WARN: Type inference failed for: r0v0, types: [androidx.datastore.preferences.protobuf.l, java.lang.Object] */
    static {
        ?? obj = new Object();
        Map map = Collections.EMPTY_MAP;
        f9735b = obj;
    }

    public static C0526l a() {
        C0526l c0526l;
        P p9 = P.f9654c;
        C0526l c0526l2 = f9734a;
        if (c0526l2 == null) {
            synchronized (C0526l.class) {
                try {
                    c0526l = f9734a;
                    if (c0526l == null) {
                        Class cls = AbstractC0525k.f9733a;
                        C0526l c0526l3 = null;
                        if (cls != null) {
                            try {
                                c0526l3 = (C0526l) cls.getDeclaredMethod("getEmptyRegistry", null).invoke(null, null);
                            } catch (Exception unused) {
                            }
                        }
                        if (c0526l3 != null) {
                            c0526l = c0526l3;
                        } else {
                            c0526l = f9735b;
                        }
                        f9734a = c0526l;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return c0526l;
        }
        return c0526l2;
    }
}
