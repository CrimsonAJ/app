package co.notix;

/* loaded from: classes.dex */
public final class op {

    /* renamed from: a, reason: collision with root package name */
    public final Long f12908a;

    public op(Long l9) {
        this.f12908a = l9;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof op) && kotlin.jvm.internal.h.a(this.f12908a, ((op) obj).f12908a);
    }

    public final int hashCode() {
        Long l9 = this.f12908a;
        if (l9 == null) {
            return 0;
        }
        return l9.hashCode();
    }

    public final String toString() {
        return "Push(senderId=" + this.f12908a + ')';
    }
}
