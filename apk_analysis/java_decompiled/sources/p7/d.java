package p7;

import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import o7.AbstractC1708D;

/* loaded from: classes.dex */
public final class d implements WildcardType {

    /* renamed from: a, reason: collision with root package name */
    public final Type f22204a;

    /* renamed from: b, reason: collision with root package name */
    public final Type f22205b;

    public d(Type[] typeArr, Type[] typeArr2) {
        if (typeArr2.length <= 1) {
            if (typeArr.length == 1) {
                if (typeArr2.length == 1) {
                    typeArr2[0].getClass();
                    e.b(typeArr2[0]);
                    if (typeArr[0] == Object.class) {
                        this.f22205b = e.a(typeArr2[0]);
                        this.f22204a = Object.class;
                        return;
                    }
                    throw new IllegalArgumentException();
                }
                typeArr[0].getClass();
                e.b(typeArr[0]);
                this.f22205b = null;
                this.f22204a = e.a(typeArr[0]);
                return;
            }
            throw new IllegalArgumentException();
        }
        throw new IllegalArgumentException();
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof WildcardType) && AbstractC1708D.b(this, (WildcardType) obj)) {
            return true;
        }
        return false;
    }

    @Override // java.lang.reflect.WildcardType
    public final Type[] getLowerBounds() {
        Type type = this.f22205b;
        if (type != null) {
            return new Type[]{type};
        }
        return e.f22207b;
    }

    @Override // java.lang.reflect.WildcardType
    public final Type[] getUpperBounds() {
        return new Type[]{this.f22204a};
    }

    public final int hashCode() {
        int i9;
        Type type = this.f22205b;
        if (type != null) {
            i9 = type.hashCode() + 31;
        } else {
            i9 = 1;
        }
        return i9 ^ (this.f22204a.hashCode() + 31);
    }

    public final String toString() {
        Type type = this.f22205b;
        if (type != null) {
            return "? super " + e.i(type);
        }
        Type type2 = this.f22204a;
        if (type2 == Object.class) {
            return "?";
        }
        return "? extends " + e.i(type2);
    }
}
