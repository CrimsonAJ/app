package O5;

/* loaded from: classes.dex */
public final class l extends h {

    /* renamed from: a, reason: collision with root package name */
    public final Object f5497a;

    public l(Object obj) {
        this.f5497a = obj;
    }

    @Override // O5.h
    public final Object a() {
        return this.f5497a;
    }

    @Override // O5.h
    public final boolean b() {
        return true;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof l) {
            return this.f5497a.equals(((l) obj).f5497a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f5497a.hashCode() + 1502476572;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f5497a);
        StringBuilder sb = new StringBuilder(valueOf.length() + 13);
        sb.append("Optional.of(");
        sb.append(valueOf);
        sb.append(")");
        return sb.toString();
    }
}
