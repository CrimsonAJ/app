package H2;

import java.util.List;

/* loaded from: classes.dex */
public final class q {

    /* renamed from: a, reason: collision with root package name */
    public final List f3045a;

    /* renamed from: b, reason: collision with root package name */
    public final List f3046b;

    /* renamed from: c, reason: collision with root package name */
    public final List f3047c;

    /* renamed from: d, reason: collision with root package name */
    public final String f3048d;

    public q(List movieStatus, List movieTypes, List order, String str) {
        kotlin.jvm.internal.h.e(movieStatus, "movieStatus");
        kotlin.jvm.internal.h.e(movieTypes, "movieTypes");
        kotlin.jvm.internal.h.e(order, "order");
        this.f3045a = movieStatus;
        this.f3046b = movieTypes;
        this.f3047c = order;
        this.f3048d = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q)) {
            return false;
        }
        q qVar = (q) obj;
        if (kotlin.jvm.internal.h.a(this.f3045a, qVar.f3045a) && kotlin.jvm.internal.h.a(this.f3046b, qVar.f3046b) && kotlin.jvm.internal.h.a(this.f3047c, qVar.f3047c) && kotlin.jvm.internal.h.a(this.f3048d, qVar.f3048d)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f3048d.hashCode() + ((this.f3047c.hashCode() + ((this.f3046b.hashCode() + (this.f3045a.hashCode() * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "MovieConfig(movieStatus=" + this.f3045a + ", movieTypes=" + this.f3046b + ", order=" + this.f3047c + ", orderDefault=" + this.f3048d + ")";
    }
}
