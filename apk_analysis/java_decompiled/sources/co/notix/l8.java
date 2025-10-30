package co.notix;

/* loaded from: classes.dex */
public final class l8 implements u8 {

    /* renamed from: a, reason: collision with root package name */
    public final String f12689a;

    /* renamed from: b, reason: collision with root package name */
    public final d3 f12690b;

    /* renamed from: c, reason: collision with root package name */
    public final p8 f12691c;

    public l8(String data, d3 adFormat, p8 reason) {
        kotlin.jvm.internal.h.e(data, "data");
        kotlin.jvm.internal.h.e(adFormat, "adFormat");
        kotlin.jvm.internal.h.e(reason, "reason");
        this.f12689a = data;
        this.f12690b = adFormat;
        this.f12691c = reason;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l8)) {
            return false;
        }
        l8 l8Var = (l8) obj;
        return kotlin.jvm.internal.h.a(this.f12689a, l8Var.f12689a) && kotlin.jvm.internal.h.a(this.f12690b, l8Var.f12690b) && this.f12691c == l8Var.f12691c;
    }

    public final int hashCode() {
        return this.f12691c.hashCode() + ((this.f12690b.hashCode() + (this.f12689a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "Params(data=" + this.f12689a + ", adFormat=" + this.f12690b + ", reason=" + this.f12691c + ')';
    }
}
