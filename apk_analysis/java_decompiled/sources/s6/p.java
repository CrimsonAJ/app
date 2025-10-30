package s6;

/* loaded from: classes.dex */
public final class p {

    /* renamed from: a, reason: collision with root package name */
    public final Class f22782a;

    /* renamed from: b, reason: collision with root package name */
    public final Class f22783b;

    public p(Class cls, Class cls2) {
        this.f22782a = cls;
        this.f22783b = cls2;
    }

    public static p a(Class cls) {
        return new p(o.class, cls);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || p.class != obj.getClass()) {
            return false;
        }
        p pVar = (p) obj;
        if (!this.f22783b.equals(pVar.f22783b)) {
            return false;
        }
        return this.f22782a.equals(pVar.f22782a);
    }

    public final int hashCode() {
        return this.f22782a.hashCode() + (this.f22783b.hashCode() * 31);
    }

    public final String toString() {
        Class cls = this.f22783b;
        Class cls2 = this.f22782a;
        if (cls2 == o.class) {
            return cls.getName();
        }
        return "@" + cls2.getName() + " " + cls.getName();
    }
}
