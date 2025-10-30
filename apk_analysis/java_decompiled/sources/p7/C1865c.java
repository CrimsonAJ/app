package p7;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Arrays;
import java.util.Set;
import o7.AbstractC1708D;

/* renamed from: p7.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1865c implements ParameterizedType {

    /* renamed from: a, reason: collision with root package name */
    public final Type f22201a;

    /* renamed from: b, reason: collision with root package name */
    public final Type f22202b;

    /* renamed from: c, reason: collision with root package name */
    public final Type[] f22203c;

    public C1865c(Type type, Type type2, Type... typeArr) {
        Type a5;
        if (type2 instanceof Class) {
            Class<?> enclosingClass = ((Class) type2).getEnclosingClass();
            if (type != null) {
                if (enclosingClass == null || AbstractC1708D.d(type) != enclosingClass) {
                    throw new IllegalArgumentException("unexpected owner type for " + type2 + ": " + type);
                }
            } else if (enclosingClass != null) {
                throw new IllegalArgumentException("unexpected owner type for " + type2 + ": null");
            }
        }
        if (type == null) {
            a5 = null;
        } else {
            a5 = e.a(type);
        }
        this.f22201a = a5;
        this.f22202b = e.a(type2);
        this.f22203c = (Type[]) typeArr.clone();
        int i9 = 0;
        while (true) {
            Type[] typeArr2 = this.f22203c;
            if (i9 < typeArr2.length) {
                typeArr2[i9].getClass();
                e.b(this.f22203c[i9]);
                Type[] typeArr3 = this.f22203c;
                typeArr3[i9] = e.a(typeArr3[i9]);
                i9++;
            } else {
                return;
            }
        }
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof ParameterizedType) && AbstractC1708D.b(this, (ParameterizedType) obj)) {
            return true;
        }
        return false;
    }

    @Override // java.lang.reflect.ParameterizedType
    public final Type[] getActualTypeArguments() {
        return (Type[]) this.f22203c.clone();
    }

    @Override // java.lang.reflect.ParameterizedType
    public final Type getOwnerType() {
        return this.f22201a;
    }

    @Override // java.lang.reflect.ParameterizedType
    public final Type getRawType() {
        return this.f22202b;
    }

    public final int hashCode() {
        int i9;
        int hashCode = Arrays.hashCode(this.f22203c) ^ this.f22202b.hashCode();
        Set set = e.f22206a;
        Type type = this.f22201a;
        if (type != null) {
            i9 = type.hashCode();
        } else {
            i9 = 0;
        }
        return hashCode ^ i9;
    }

    public final String toString() {
        Type[] typeArr = this.f22203c;
        StringBuilder sb = new StringBuilder((typeArr.length + 1) * 30);
        sb.append(e.i(this.f22202b));
        if (typeArr.length == 0) {
            return sb.toString();
        }
        sb.append("<");
        sb.append(e.i(typeArr[0]));
        for (int i9 = 1; i9 < typeArr.length; i9++) {
            sb.append(", ");
            sb.append(e.i(typeArr[i9]));
        }
        sb.append(">");
        return sb.toString();
    }
}
