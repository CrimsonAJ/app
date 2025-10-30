package b6;

import java.util.Objects;

/* renamed from: b6.r, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0696r {

    /* renamed from: a, reason: collision with root package name */
    public final Class f11391a;

    /* renamed from: b, reason: collision with root package name */
    public final Class f11392b;

    public C0696r(Class cls, Class cls2) {
        this.f11391a = cls;
        this.f11392b = cls2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C0696r)) {
            return false;
        }
        C0696r c0696r = (C0696r) obj;
        if (!c0696r.f11391a.equals(this.f11391a) || !c0696r.f11392b.equals(this.f11392b)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Objects.hash(this.f11391a, this.f11392b);
    }

    public final String toString() {
        return this.f11391a.getSimpleName() + " with serialization type: " + this.f11392b.getSimpleName();
    }
}
