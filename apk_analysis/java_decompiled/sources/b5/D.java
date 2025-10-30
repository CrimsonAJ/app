package b5;

import z2.C2235a;

/* loaded from: classes.dex */
public final class D {

    /* renamed from: f, reason: collision with root package name */
    public static final Object f10568f = new Object();

    /* renamed from: a, reason: collision with root package name */
    public final String f10569a;

    /* renamed from: b, reason: collision with root package name */
    public final C f10570b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f10571c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f10572d = new Object();

    /* renamed from: e, reason: collision with root package name */
    public volatile Object f10573e = null;

    public /* synthetic */ D(String str, Object obj, C c3) {
        this.f10569a = str;
        this.f10571c = obj;
        this.f10570b = c3;
    }

    public final Object a(Object obj) {
        Object obj2;
        synchronized (this.f10572d) {
        }
        if (obj != null) {
            return obj;
        }
        if (D0.f10583k == null) {
            return this.f10571c;
        }
        synchronized (f10568f) {
            try {
                if (C2235a.f()) {
                    if (this.f10573e == null) {
                        obj2 = this.f10571c;
                    } else {
                        obj2 = this.f10573e;
                    }
                    return obj2;
                }
                try {
                    for (D d9 : E.f10635a) {
                        if (!C2235a.f()) {
                            Object obj3 = null;
                            try {
                                C c3 = d9.f10570b;
                                if (c3 != null) {
                                    obj3 = c3.a();
                                }
                            } catch (IllegalStateException unused) {
                            }
                            synchronized (f10568f) {
                                d9.f10573e = obj3;
                            }
                        } else {
                            throw new IllegalStateException("Refreshing flag cache must be done on a worker thread.");
                        }
                    }
                } catch (SecurityException unused2) {
                }
                C c9 = this.f10570b;
                if (c9 != null) {
                    try {
                        return c9.a();
                    } catch (IllegalStateException | SecurityException unused3) {
                    }
                }
                return this.f10571c;
            } finally {
            }
        }
    }
}
