package androidx.lifecycle;

import java.lang.reflect.Method;

/* renamed from: androidx.lifecycle.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0542c {

    /* renamed from: a, reason: collision with root package name */
    public final int f9868a;

    /* renamed from: b, reason: collision with root package name */
    public final Method f9869b;

    public C0542c(Method method, int i9) {
        this.f9868a = i9;
        this.f9869b = method;
        method.setAccessible(true);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0542c)) {
            return false;
        }
        C0542c c0542c = (C0542c) obj;
        if (this.f9868a == c0542c.f9868a && this.f9869b.getName().equals(c0542c.f9869b.getName())) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f9869b.getName().hashCode() + (this.f9868a * 31);
    }
}
