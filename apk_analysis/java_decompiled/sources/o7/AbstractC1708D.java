package o7;

import java.lang.reflect.Array;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.util.Arrays;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.List;
import p7.C1865c;

/* renamed from: o7.D, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1708D {

    /* renamed from: a, reason: collision with root package name */
    public static final C1709a f21653a = new C1709a(5);

    /* renamed from: b, reason: collision with root package name */
    public static final C1705A f21654b = new C1705A(1);

    /* renamed from: c, reason: collision with root package name */
    public static final C1705A f21655c = new C1705A(2);

    /* renamed from: d, reason: collision with root package name */
    public static final C1705A f21656d = new C1705A(3);

    /* renamed from: e, reason: collision with root package name */
    public static final C1705A f21657e = new C1705A(4);

    /* renamed from: f, reason: collision with root package name */
    public static final C1705A f21658f = new C1705A(5);

    /* renamed from: g, reason: collision with root package name */
    public static final C1705A f21659g = new C1705A(6);

    /* renamed from: h, reason: collision with root package name */
    public static final C1705A f21660h = new C1705A(7);

    /* renamed from: i, reason: collision with root package name */
    public static final C1705A f21661i = new C1705A(8);
    public static final C1705A j = new C1705A(0);

    public static Type a(Type type) {
        if (Collection.class.isAssignableFrom(Collection.class)) {
            Type f9 = p7.e.f(type, Collection.class, p7.e.c(type, Collection.class, Collection.class), new LinkedHashSet());
            if (f9 instanceof WildcardType) {
                f9 = ((WildcardType) f9).getUpperBounds()[0];
            }
            if (f9 instanceof ParameterizedType) {
                return ((ParameterizedType) f9).getActualTypeArguments()[0];
            }
            return Object.class;
        }
        throw new IllegalArgumentException();
    }

    public static boolean b(Type type, Type type2) {
        Type[] actualTypeArguments;
        Type[] actualTypeArguments2;
        if (type == type2) {
            return true;
        }
        if (type instanceof Class) {
            if (type2 instanceof GenericArrayType) {
                return b(((Class) type).getComponentType(), ((GenericArrayType) type2).getGenericComponentType());
            }
            return type.equals(type2);
        }
        if (type instanceof ParameterizedType) {
            if (!(type2 instanceof ParameterizedType)) {
                return false;
            }
            ParameterizedType parameterizedType = (ParameterizedType) type;
            ParameterizedType parameterizedType2 = (ParameterizedType) type2;
            if (parameterizedType instanceof C1865c) {
                actualTypeArguments = ((C1865c) parameterizedType).f22203c;
            } else {
                actualTypeArguments = parameterizedType.getActualTypeArguments();
            }
            if (parameterizedType2 instanceof C1865c) {
                actualTypeArguments2 = ((C1865c) parameterizedType2).f22203c;
            } else {
                actualTypeArguments2 = parameterizedType2.getActualTypeArguments();
            }
            if (b(parameterizedType.getOwnerType(), parameterizedType2.getOwnerType()) && parameterizedType.getRawType().equals(parameterizedType2.getRawType()) && Arrays.equals(actualTypeArguments, actualTypeArguments2)) {
                return true;
            }
            return false;
        }
        if (type instanceof GenericArrayType) {
            if (type2 instanceof Class) {
                return b(((Class) type2).getComponentType(), ((GenericArrayType) type).getGenericComponentType());
            }
            if (!(type2 instanceof GenericArrayType)) {
                return false;
            }
            return b(((GenericArrayType) type).getGenericComponentType(), ((GenericArrayType) type2).getGenericComponentType());
        }
        if (type instanceof WildcardType) {
            if (!(type2 instanceof WildcardType)) {
                return false;
            }
            WildcardType wildcardType = (WildcardType) type;
            WildcardType wildcardType2 = (WildcardType) type2;
            if (Arrays.equals(wildcardType.getUpperBounds(), wildcardType2.getUpperBounds()) && Arrays.equals(wildcardType.getLowerBounds(), wildcardType2.getLowerBounds())) {
                return true;
            }
            return false;
        }
        if (!(type instanceof TypeVariable) || !(type2 instanceof TypeVariable)) {
            return false;
        }
        TypeVariable typeVariable = (TypeVariable) type;
        TypeVariable typeVariable2 = (TypeVariable) type2;
        if (typeVariable.getGenericDeclaration() == typeVariable2.getGenericDeclaration() && typeVariable.getName().equals(typeVariable2.getName())) {
            return true;
        }
        return false;
    }

    public static String c(int i9, int[] iArr, int[] iArr2, String[] strArr) {
        StringBuilder sb = new StringBuilder("$");
        for (int i10 = 0; i10 < i9; i10++) {
            int i11 = iArr[i10];
            if (i11 != 1 && i11 != 2) {
                if (i11 == 3 || i11 == 4 || i11 == 5) {
                    sb.append('.');
                    String str = strArr[i10];
                    if (str != null) {
                        sb.append(str);
                    }
                }
            } else {
                sb.append('[');
                sb.append(iArr2[i10]);
                sb.append(']');
            }
        }
        return sb.toString();
    }

    public static Class d(Type type) {
        String name;
        if (type instanceof Class) {
            return (Class) type;
        }
        if (type instanceof ParameterizedType) {
            return (Class) ((ParameterizedType) type).getRawType();
        }
        if (type instanceof GenericArrayType) {
            return Array.newInstance((Class<?>) d(((GenericArrayType) type).getGenericComponentType()), 0).getClass();
        }
        if (type instanceof TypeVariable) {
            return Object.class;
        }
        if (type instanceof WildcardType) {
            return d(((WildcardType) type).getUpperBounds()[0]);
        }
        if (type == null) {
            name = "null";
        } else {
            name = type.getClass().getName();
        }
        throw new IllegalArgumentException("Expected a Class, ParameterizedType, or GenericArrayType, but <" + type + "> is of type " + name);
    }

    public static C1865c f(Type... typeArr) {
        if (typeArr.length != 0) {
            return new C1865c(null, List.class, typeArr);
        }
        throw new IllegalArgumentException("Missing type arguments for " + List.class);
    }

    public static int g(AbstractC1722n abstractC1722n, String str, int i9, int i10) {
        int N8 = abstractC1722n.N();
        if (N8 >= i9 && N8 <= i10) {
            return N8;
        }
        throw new RuntimeException("Expected " + str + " but was " + N8 + " at path " + abstractC1722n.x());
    }

    public abstract Object e();
}
