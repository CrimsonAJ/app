package z8;

/* loaded from: classes.dex */
public final class T implements S {

    /* renamed from: a, reason: collision with root package name */
    public static final T f25598a = new Object();

    @Override // java.lang.annotation.Annotation
    public final Class annotationType() {
        return S.class;
    }

    @Override // java.lang.annotation.Annotation
    public final boolean equals(Object obj) {
        return obj instanceof S;
    }

    @Override // java.lang.annotation.Annotation
    public final int hashCode() {
        return 0;
    }

    @Override // java.lang.annotation.Annotation
    public final String toString() {
        return "@" + S.class.getName() + "()";
    }
}
