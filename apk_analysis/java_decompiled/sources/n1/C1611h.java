package n1;

import w.AbstractC2128h;

/* renamed from: n1.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1611h {

    /* renamed from: a, reason: collision with root package name */
    public String f21021a;

    /* renamed from: b, reason: collision with root package name */
    public int f21022b;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C1611h) {
            C1611h c1611h = (C1611h) obj;
            if (this.f21022b != c1611h.f21022b) {
                return false;
            }
            return this.f21021a.equals(c1611h.f21021a);
        }
        return false;
    }

    public final int hashCode() {
        return AbstractC2128h.b(this.f21022b) + (this.f21021a.hashCode() * 31);
    }
}
