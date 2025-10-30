package z8;

import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;

/* loaded from: classes.dex */
public final class U implements GenericArrayType {

    /* renamed from: a, reason: collision with root package name */
    public final Type f25599a;

    public U(Type type) {
        this.f25599a = type;
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof GenericArrayType) && X.e(this, (GenericArrayType) obj)) {
            return true;
        }
        return false;
    }

    @Override // java.lang.reflect.GenericArrayType
    public final Type getGenericComponentType() {
        return this.f25599a;
    }

    public final int hashCode() {
        return this.f25599a.hashCode();
    }

    public final String toString() {
        return X.t(this.f25599a) + "[]";
    }
}
