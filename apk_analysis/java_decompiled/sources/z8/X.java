package z8;

import Y7.C0464h;
import com.google.android.gms.internal.measurement.D1;
import com.google.firebase.messaging.AbstractC1059e;
import java.lang.annotation.Annotation;
import java.lang.invoke.MethodHandle;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.util.Arrays;
import java.util.Map;
import java.util.Objects;

/* loaded from: classes.dex */
public abstract class X {

    /* renamed from: a, reason: collision with root package name */
    public static final Type[] f25605a = new Type[0];

    /* renamed from: b, reason: collision with root package name */
    public static boolean f25606b = true;

    /* renamed from: c, reason: collision with root package name */
    public static Constructor f25607c;

    public static final Object b(InterfaceC2255d interfaceC2255d, E7.d dVar) {
        C0464h c0464h = new C0464h(1, D1.A(dVar));
        c0464h.s();
        c0464h.u(new C2270t(interfaceC2255d, 0));
        interfaceC2255d.d(new h8.b(c0464h));
        return c0464h.r();
    }

    public static final Object c(InterfaceC2255d interfaceC2255d, E7.d dVar) {
        C0464h c0464h = new C0464h(1, D1.A(dVar));
        c0464h.s();
        c0464h.u(new C2270t(interfaceC2255d, 1));
        interfaceC2255d.d(new C2271u(c0464h));
        return c0464h.r();
    }

    public static void d(Type type) {
        if ((type instanceof Class) && ((Class) type).isPrimitive()) {
            throw new IllegalArgumentException();
        }
    }

    public static boolean e(Type type, Type type2) {
        boolean z9;
        if (type == type2) {
            return true;
        }
        if (type instanceof Class) {
            return type.equals(type2);
        }
        if (type instanceof ParameterizedType) {
            if (!(type2 instanceof ParameterizedType)) {
                return false;
            }
            ParameterizedType parameterizedType = (ParameterizedType) type;
            ParameterizedType parameterizedType2 = (ParameterizedType) type2;
            Type ownerType = parameterizedType.getOwnerType();
            Type ownerType2 = parameterizedType2.getOwnerType();
            if (ownerType != ownerType2 && (ownerType == null || !ownerType.equals(ownerType2))) {
                z9 = false;
            } else {
                z9 = true;
            }
            boolean equals = parameterizedType.getRawType().equals(parameterizedType2.getRawType());
            boolean equals2 = Arrays.equals(parameterizedType.getActualTypeArguments(), parameterizedType2.getActualTypeArguments());
            if (z9 && equals && equals2) {
                return true;
            }
            return false;
        }
        if (type instanceof GenericArrayType) {
            if (!(type2 instanceof GenericArrayType)) {
                return false;
            }
            return e(((GenericArrayType) type).getGenericComponentType(), ((GenericArrayType) type2).getGenericComponentType());
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

    public static Type f(Type type, Class cls, Class cls2) {
        if (cls2 == cls) {
            return type;
        }
        if (cls2.isInterface()) {
            Class<?>[] interfaces = cls.getInterfaces();
            int length = interfaces.length;
            for (int i9 = 0; i9 < length; i9++) {
                Class<?> cls3 = interfaces[i9];
                if (cls3 == cls2) {
                    return cls.getGenericInterfaces()[i9];
                }
                if (cls2.isAssignableFrom(cls3)) {
                    return f(cls.getGenericInterfaces()[i9], interfaces[i9], cls2);
                }
            }
        }
        if (!cls.isInterface()) {
            while (cls != Object.class) {
                Class<?> superclass = cls.getSuperclass();
                if (superclass == cls2) {
                    return cls.getGenericSuperclass();
                }
                if (cls2.isAssignableFrom(superclass)) {
                    return f(cls.getGenericSuperclass(), superclass, cls2);
                }
                cls = superclass;
            }
        }
        return cls2;
    }

    public static Type g(int i9, ParameterizedType parameterizedType) {
        Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
        if (i9 >= 0 && i9 < actualTypeArguments.length) {
            Type type = actualTypeArguments[i9];
            if (type instanceof WildcardType) {
                return ((WildcardType) type).getUpperBounds()[0];
            }
            return type;
        }
        StringBuilder p9 = A0.a.p("Index ", i9, " not in range [0,");
        p9.append(actualTypeArguments.length);
        p9.append(") for ");
        p9.append(parameterizedType);
        throw new IllegalArgumentException(p9.toString());
    }

    public static Class h(Type type) {
        Objects.requireNonNull(type, "type == null");
        if (type instanceof Class) {
            return (Class) type;
        }
        if (type instanceof ParameterizedType) {
            Type rawType = ((ParameterizedType) type).getRawType();
            if (rawType instanceof Class) {
                return (Class) rawType;
            }
            throw new IllegalArgumentException();
        }
        if (type instanceof GenericArrayType) {
            return Array.newInstance((Class<?>) h(((GenericArrayType) type).getGenericComponentType()), 0).getClass();
        }
        if (type instanceof TypeVariable) {
            return Object.class;
        }
        if (type instanceof WildcardType) {
            return h(((WildcardType) type).getUpperBounds()[0]);
        }
        throw new IllegalArgumentException("Expected a Class, ParameterizedType, or GenericArrayType, but <" + type + "> is of type " + type.getClass().getName());
    }

    public static Type i(Type type, Class cls) {
        if (Map.class.isAssignableFrom(cls)) {
            return q(type, cls, f(type, cls, Map.class));
        }
        throw new IllegalArgumentException();
    }

    public static boolean j(Type type) {
        String name;
        if (type instanceof Class) {
            return false;
        }
        if (type instanceof ParameterizedType) {
            for (Type type2 : ((ParameterizedType) type).getActualTypeArguments()) {
                if (j(type2)) {
                    return true;
                }
            }
            return false;
        }
        if (type instanceof GenericArrayType) {
            return j(((GenericArrayType) type).getGenericComponentType());
        }
        if ((type instanceof TypeVariable) || (type instanceof WildcardType)) {
            return true;
        }
        if (type == null) {
            name = "null";
        } else {
            name = type.getClass().getName();
        }
        throw new IllegalArgumentException("Expected a Class, ParameterizedType, or GenericArrayType, but <" + type + "> is of type " + name);
    }

    public static Object k(Method method, Class cls, Object obj, Object[] objArr) {
        MethodHandle unreflectSpecial;
        MethodHandle bindTo;
        Constructor constructor = f25607c;
        if (constructor == null) {
            constructor = AbstractC1059e.k().getDeclaredConstructor(Class.class, Integer.TYPE);
            constructor.setAccessible(true);
            f25607c = constructor;
        }
        unreflectSpecial = AbstractC1059e.n(constructor.newInstance(cls, -1)).unreflectSpecial(method, cls);
        bindTo = unreflectSpecial.bindTo(obj);
        return AbstractC2265n.a(bindTo, objArr);
    }

    public static boolean l(Annotation[] annotationArr, Class cls) {
        for (Annotation annotation : annotationArr) {
            if (cls.isInstance(annotation)) {
                return true;
            }
        }
        return false;
    }

    public static boolean m(Type type) {
        if (!f25606b || type != A7.n.class) {
            return false;
        }
        return true;
    }

    public static IllegalArgumentException n(Method method, Exception exc, String str, Object... objArr) {
        return new IllegalArgumentException(String.format(str, objArr) + "\n    for method " + method.getDeclaringClass().getSimpleName() + "." + method.getName(), exc);
    }

    public static IllegalArgumentException o(Method method, int i9, String str, Object... objArr) {
        return n(method, null, str + " (" + J.f25536b.d(method, i9) + ")", objArr);
    }

    public static IllegalArgumentException p(Method method, Exception exc, int i9, String str, Object... objArr) {
        return n(method, exc, str + " (" + J.f25536b.d(method, i9) + ")", objArr);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0044 A[LOOP:0: B:2:0x0002->B:19:0x0044, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0043 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.reflect.Type q(java.lang.reflect.Type r8, java.lang.Class r9, java.lang.reflect.Type r10) {
        /*
            Method dump skipped, instructions count: 257
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: z8.X.q(java.lang.reflect.Type, java.lang.Class, java.lang.reflect.Type):java.lang.reflect.Type");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void r(java.lang.Throwable r5, E7.d r6) {
        /*
            boolean r0 = r6 instanceof z8.C2272v
            if (r0 == 0) goto L13
            r0 = r6
            z8.v r0 = (z8.C2272v) r0
            int r1 = r0.f25637s
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f25637s = r1
            goto L18
        L13:
            z8.v r0 = new z8.v
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f25636r
            int r1 = r0.f25637s
            r2 = 1
            if (r1 == 0) goto L32
            if (r1 == r2) goto L29
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L29:
            a.AbstractC0485a.A(r6)
            A7.b r5 = new A7.b
            r5.<init>()
            throw r5
        L32:
            a.AbstractC0485a.A(r6)
            r0.f25637s = r2
            f8.e r6 = Y7.K.f8773a
            E7.i r1 = r0.getContext()
            d2.v r2 = new d2.v
            r3 = 20
            r4 = 0
            r2.<init>(r0, r5, r3, r4)
            r6.g0(r1, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: z8.X.r(java.lang.Throwable, E7.d):void");
    }

    public static void s(Throwable th) {
        if (!(th instanceof VirtualMachineError)) {
            if (!(th instanceof ThreadDeath)) {
                if (!(th instanceof LinkageError)) {
                    return;
                } else {
                    throw ((LinkageError) th);
                }
            }
            throw ((ThreadDeath) th);
        }
        throw ((VirtualMachineError) th);
    }

    public static String t(Type type) {
        if (type instanceof Class) {
            return ((Class) type).getName();
        }
        return type.toString();
    }

    public abstract void a(L l9, Object obj);
}
