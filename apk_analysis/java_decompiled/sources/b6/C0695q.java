package b6;

import java.util.Objects;

/* renamed from: b6.q, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0695q {

    /* renamed from: a, reason: collision with root package name */
    public final Class f11389a;

    /* renamed from: b, reason: collision with root package name */
    public final k6.a f11390b;

    public C0695q(Class cls, k6.a aVar) {
        this.f11389a = cls;
        this.f11390b = aVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C0695q)) {
            return false;
        }
        C0695q c0695q = (C0695q) obj;
        if (!c0695q.f11389a.equals(this.f11389a) || !c0695q.f11390b.equals(this.f11390b)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Objects.hash(this.f11389a, this.f11390b);
    }

    public final String toString() {
        return this.f11389a.getSimpleName() + ", object identifier: " + this.f11390b;
    }
}
