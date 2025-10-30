package u0;

/* renamed from: u0.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2038i {

    /* renamed from: a, reason: collision with root package name */
    public final T f23486a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f23487b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f23488c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f23489d;

    public C2038i(T t7, boolean z9, Object obj, boolean z10) {
        if (!t7.f23458a && z9) {
            throw new IllegalArgumentException(t7.b().concat(" does not allow nullable values").toString());
        }
        if (!z9 && z10 && obj == null) {
            throw new IllegalArgumentException(("Argument with type " + t7.b() + " has null value but is not nullable.").toString());
        }
        this.f23486a = t7;
        this.f23487b = z9;
        this.f23489d = obj;
        this.f23488c = z10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C2038i.class.equals(obj.getClass())) {
            C2038i c2038i = (C2038i) obj;
            if (this.f23487b != c2038i.f23487b || this.f23488c != c2038i.f23488c || !kotlin.jvm.internal.h.a(this.f23486a, c2038i.f23486a)) {
                return false;
            }
            Object obj2 = c2038i.f23489d;
            Object obj3 = this.f23489d;
            if (obj3 != null) {
                return kotlin.jvm.internal.h.a(obj3, obj2);
            }
            if (obj2 == null) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i9;
        int hashCode = ((((this.f23486a.hashCode() * 31) + (this.f23487b ? 1 : 0)) * 31) + (this.f23488c ? 1 : 0)) * 31;
        Object obj = this.f23489d;
        if (obj != null) {
            i9 = obj.hashCode();
        } else {
            i9 = 0;
        }
        return hashCode + i9;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(C2038i.class.getSimpleName());
        sb.append(" Type: " + this.f23486a);
        sb.append(" Nullable: " + this.f23487b);
        if (this.f23488c) {
            sb.append(" DefaultValue: " + this.f23489d);
        }
        String sb2 = sb.toString();
        kotlin.jvm.internal.h.d(sb2, "sb.toString()");
        return sb2;
    }
}
