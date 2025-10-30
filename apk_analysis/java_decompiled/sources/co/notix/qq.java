package co.notix;

/* loaded from: classes.dex */
public final class qq implements u8 {

    /* renamed from: a, reason: collision with root package name */
    public final we f13073a;

    public qq(we notification) {
        kotlin.jvm.internal.h.e(notification, "notification");
        this.f13073a = notification;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof qq) && kotlin.jvm.internal.h.a(this.f13073a, ((qq) obj).f13073a);
    }

    public final int hashCode() {
        return this.f13073a.hashCode();
    }

    public final String toString() {
        return "Params(notification=" + this.f13073a + ')';
    }
}
