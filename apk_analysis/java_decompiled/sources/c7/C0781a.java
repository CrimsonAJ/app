package c7;

import java.util.HashSet;

/* renamed from: c7.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0781a {

    /* renamed from: a, reason: collision with root package name */
    public final HashSet f11704a;

    public C0781a(HashSet hashSet) {
        this.f11704a = hashSet;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C0781a) {
            return this.f11704a.equals(((C0781a) obj).f11704a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f11704a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return "ConfigUpdate{updatedKeys=" + this.f11704a + "}";
    }
}
