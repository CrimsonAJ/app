package z8;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Arrays;
import java.util.Objects;

/* loaded from: classes.dex */
public final class V implements ParameterizedType {

    /* renamed from: a, reason: collision with root package name */
    public final Type f25600a;

    /* renamed from: b, reason: collision with root package name */
    public final Type f25601b;

    /* renamed from: c, reason: collision with root package name */
    public final Type[] f25602c;

    public V(Type type, Type type2, Type... typeArr) {
        boolean z9;
        if (type2 instanceof Class) {
            if (type == null) {
                z9 = true;
            } else {
                z9 = false;
            }
            if (z9 != (((Class) type2).getEnclosingClass() == null)) {
                throw new IllegalArgumentException();
            }
        }
        for (Type type3 : typeArr) {
            Objects.requireNonNull(type3, "typeArgument == null");
            X.d(type3);
        }
        this.f25600a = type;
        this.f25601b = type2;
        this.f25602c = (Type[]) typeArr.clone();
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof ParameterizedType) && X.e(this, (ParameterizedType) obj)) {
            return true;
        }
        return false;
    }

    @Override // java.lang.reflect.ParameterizedType
    public final Type[] getActualTypeArguments() {
        return (Type[]) this.f25602c.clone();
    }

    @Override // java.lang.reflect.ParameterizedType
    public final Type getOwnerType() {
        return this.f25600a;
    }

    @Override // java.lang.reflect.ParameterizedType
    public final Type getRawType() {
        return this.f25601b;
    }

    public final int hashCode() {
        int i9;
        int hashCode = Arrays.hashCode(this.f25602c) ^ this.f25601b.hashCode();
        Type type = this.f25600a;
        if (type != null) {
            i9 = type.hashCode();
        } else {
            i9 = 0;
        }
        return hashCode ^ i9;
    }

    public final String toString() {
        Type[] typeArr = this.f25602c;
        int length = typeArr.length;
        Type type = this.f25601b;
        if (length == 0) {
            return X.t(type);
        }
        StringBuilder sb = new StringBuilder((typeArr.length + 1) * 30);
        sb.append(X.t(type));
        sb.append("<");
        sb.append(X.t(typeArr[0]));
        for (int i9 = 1; i9 < typeArr.length; i9++) {
            sb.append(", ");
            sb.append(X.t(typeArr[i9]));
        }
        sb.append(">");
        return sb.toString();
    }
}
