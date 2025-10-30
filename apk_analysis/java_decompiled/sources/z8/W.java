package z8;

import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;

/* loaded from: classes.dex */
public final class W implements WildcardType {

    /* renamed from: a, reason: collision with root package name */
    public final Type f25603a;

    /* renamed from: b, reason: collision with root package name */
    public final Type f25604b;

    public W(Type[] typeArr, Type[] typeArr2) {
        if (typeArr2.length <= 1) {
            if (typeArr.length == 1) {
                if (typeArr2.length == 1) {
                    typeArr2[0].getClass();
                    X.d(typeArr2[0]);
                    if (typeArr[0] == Object.class) {
                        this.f25604b = typeArr2[0];
                        this.f25603a = Object.class;
                        return;
                    }
                    throw new IllegalArgumentException();
                }
                typeArr[0].getClass();
                X.d(typeArr[0]);
                this.f25604b = null;
                this.f25603a = typeArr[0];
                return;
            }
            throw new IllegalArgumentException();
        }
        throw new IllegalArgumentException();
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof WildcardType) && X.e(this, (WildcardType) obj)) {
            return true;
        }
        return false;
    }

    @Override // java.lang.reflect.WildcardType
    public final Type[] getLowerBounds() {
        Type type = this.f25604b;
        if (type != null) {
            return new Type[]{type};
        }
        return X.f25605a;
    }

    @Override // java.lang.reflect.WildcardType
    public final Type[] getUpperBounds() {
        return new Type[]{this.f25603a};
    }

    public final int hashCode() {
        int i9;
        Type type = this.f25604b;
        if (type != null) {
            i9 = type.hashCode() + 31;
        } else {
            i9 = 1;
        }
        return i9 ^ (this.f25603a.hashCode() + 31);
    }

    public final String toString() {
        Type type = this.f25604b;
        if (type != null) {
            return "? super " + X.t(type);
        }
        Type type2 = this.f25603a;
        if (type2 == Object.class) {
            return "?";
        }
        return "? extends " + X.t(type2);
    }
}
