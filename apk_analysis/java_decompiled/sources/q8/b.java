package q8;

import x8.C2190j;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: d, reason: collision with root package name */
    public static final C2190j f22447d;

    /* renamed from: e, reason: collision with root package name */
    public static final C2190j f22448e;

    /* renamed from: f, reason: collision with root package name */
    public static final C2190j f22449f;

    /* renamed from: g, reason: collision with root package name */
    public static final C2190j f22450g;

    /* renamed from: h, reason: collision with root package name */
    public static final C2190j f22451h;

    /* renamed from: i, reason: collision with root package name */
    public static final C2190j f22452i;

    /* renamed from: a, reason: collision with root package name */
    public final C2190j f22453a;

    /* renamed from: b, reason: collision with root package name */
    public final C2190j f22454b;

    /* renamed from: c, reason: collision with root package name */
    public final int f22455c;

    static {
        C2190j c2190j = C2190j.f24645d;
        f22447d = e0.c.D(":");
        f22448e = e0.c.D(":status");
        f22449f = e0.c.D(":method");
        f22450g = e0.c.D(":path");
        f22451h = e0.c.D(":scheme");
        f22452i = e0.c.D(":authority");
    }

    public b(C2190j name, C2190j value) {
        kotlin.jvm.internal.h.e(name, "name");
        kotlin.jvm.internal.h.e(value, "value");
        this.f22453a = name;
        this.f22454b = value;
        this.f22455c = value.d() + name.d() + 32;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        if (kotlin.jvm.internal.h.a(this.f22453a, bVar.f22453a) && kotlin.jvm.internal.h.a(this.f22454b, bVar.f22454b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f22454b.hashCode() + (this.f22453a.hashCode() * 31);
    }

    public final String toString() {
        return this.f22453a.q() + ": " + this.f22454b.q();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public b(String name, String value) {
        this(e0.c.D(name), e0.c.D(value));
        kotlin.jvm.internal.h.e(name, "name");
        kotlin.jvm.internal.h.e(value, "value");
        C2190j c2190j = C2190j.f24645d;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public b(String value, C2190j name) {
        this(name, e0.c.D(value));
        kotlin.jvm.internal.h.e(name, "name");
        kotlin.jvm.internal.h.e(value, "value");
        C2190j c2190j = C2190j.f24645d;
    }
}
