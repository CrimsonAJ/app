package b6;

import java.util.Objects;

/* renamed from: b6.m, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0691m {

    /* renamed from: a, reason: collision with root package name */
    public final Class f11378a;

    /* renamed from: b, reason: collision with root package name */
    public final Class f11379b;

    public C0691m(Class cls, Class cls2) {
        this.f11378a = cls;
        this.f11379b = cls2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C0691m)) {
            return false;
        }
        C0691m c0691m = (C0691m) obj;
        if (!c0691m.f11378a.equals(this.f11378a) || !c0691m.f11379b.equals(this.f11379b)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Objects.hash(this.f11378a, this.f11379b);
    }

    public final String toString() {
        return this.f11378a.getSimpleName() + " with primitive type: " + this.f11379b.getSimpleName();
    }
}
