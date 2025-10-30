package p7;

import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;
import o7.AbstractC1708D;

/* renamed from: p7.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1864b implements GenericArrayType {

    /* renamed from: a, reason: collision with root package name */
    public final Type f22200a;

    public C1864b(Type type) {
        this.f22200a = e.a(type);
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof GenericArrayType) && AbstractC1708D.b(this, (GenericArrayType) obj)) {
            return true;
        }
        return false;
    }

    @Override // java.lang.reflect.GenericArrayType
    public final Type getGenericComponentType() {
        return this.f22200a;
    }

    public final int hashCode() {
        return this.f22200a.hashCode();
    }

    public final String toString() {
        return e.i(this.f22200a) + "[]";
    }
}
