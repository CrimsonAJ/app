package D1;

import s8.n;

/* loaded from: classes.dex */
public final class h {

    /* renamed from: c, reason: collision with root package name */
    public static final h f1776c;

    /* renamed from: a, reason: collision with root package name */
    public final n f1777a;

    /* renamed from: b, reason: collision with root package name */
    public final n f1778b;

    static {
        b bVar = b.f1768m;
        f1776c = new h(bVar, bVar);
    }

    public h(n nVar, n nVar2) {
        this.f1777a = nVar;
        this.f1778b = nVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        if (kotlin.jvm.internal.h.a(this.f1777a, hVar.f1777a) && kotlin.jvm.internal.h.a(this.f1778b, hVar.f1778b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f1778b.hashCode() + (this.f1777a.hashCode() * 31);
    }

    public final String toString() {
        return "Size(width=" + this.f1777a + ", height=" + this.f1778b + ')';
    }
}
