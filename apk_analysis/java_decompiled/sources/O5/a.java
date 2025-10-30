package O5;

/* loaded from: classes.dex */
public final class a extends h {

    /* renamed from: a, reason: collision with root package name */
    public static final a f5486a = new Object();

    @Override // O5.h
    public final Object a() {
        throw new IllegalStateException("Optional.get() cannot be called on an absent value");
    }

    @Override // O5.h
    public final boolean b() {
        return false;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return 2040732332;
    }

    public final String toString() {
        return "Optional.absent()";
    }
}
