package o7;

import com.google.android.gms.internal.measurement.AbstractC0953k1;
import java.io.ObjectInputStream;
import java.io.ObjectStreamClass;
import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;
import java.util.TreeMap;
import p7.C1863a;

/* renamed from: o7.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1709a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f21662a;

    public /* synthetic */ C1709a(int i9) {
        this.f21662a = i9;
    }

    public static void b(Type type, Class cls) {
        Class<?> d9 = AbstractC1708D.d(type);
        if (!cls.isAssignableFrom(d9)) {
            return;
        }
        throw new IllegalArgumentException("No JsonAdapter for " + type + ", you should probably use " + cls.getSimpleName() + " instead of " + d9.getSimpleName() + " (Moshi only supports the collection interfaces by default) or else register a custom JsonAdapter.");
    }

    public final AbstractC1719k a(Type type, Set set, y yVar) {
        Type type2;
        int i9;
        AbstractC1708D c1711c;
        Class cls;
        boolean z9;
        Field[] fieldArr;
        boolean z10;
        Set set2;
        Class d9;
        Type[] typeArr;
        char c3;
        C1863a c1863a;
        Class<?> cls2;
        Class<?> cls3;
        Constructor<?> declaredConstructor;
        Object[] objArr;
        Type type3 = type;
        Class cls4 = Integer.TYPE;
        boolean z11 = true;
        switch (this.f21662a) {
            case 0:
                if (type3 instanceof GenericArrayType) {
                    type2 = ((GenericArrayType) type3).getGenericComponentType();
                } else if (type3 instanceof Class) {
                    type2 = ((Class) type3).getComponentType();
                } else {
                    type2 = null;
                }
                if (type2 == null || !set.isEmpty()) {
                    return null;
                }
                Class d10 = AbstractC1708D.d(type2);
                yVar.getClass();
                return new C1710b(d10, yVar.b(type2, p7.e.f22206a, null)).c();
            case 1:
                if ((type3 instanceof Class) || (type3 instanceof ParameterizedType)) {
                    Class d11 = AbstractC1708D.d(type3);
                    if (!d11.isInterface() && !d11.isEnum() && set.isEmpty()) {
                        if (p7.e.d(d11)) {
                            b(type3, List.class);
                            b(type3, Set.class);
                            b(type3, Map.class);
                            b(type3, Collection.class);
                            String str = "Platform " + d11;
                            if (type3 instanceof ParameterizedType) {
                                str = str + " in " + type3;
                            }
                            throw new IllegalArgumentException(AbstractC0953k1.n(str, " requires explicit JsonAdapter to be registered"));
                        }
                        if (!d11.isAnonymousClass()) {
                            if (!d11.isLocalClass()) {
                                if (d11.getEnclosingClass() != null && !Modifier.isStatic(d11.getModifiers())) {
                                    throw new IllegalArgumentException("Cannot serialize non-static nested class ".concat(d11.getName()));
                                }
                                if (!Modifier.isAbstract(d11.getModifiers())) {
                                    Class<? extends Annotation> cls5 = p7.e.f22209d;
                                    if (cls5 != null && d11.isAnnotationPresent(cls5)) {
                                        throw new IllegalArgumentException("Cannot serialize Kotlin type " + d11.getName() + ". Reflective serialization of Kotlin classes without using kotlin-reflect has undefined and unexpected behavior. Please use KotlinJsonAdapterFactory from the moshi-kotlin artifact or use code gen from the moshi-kotlin-codegen artifact.");
                                    }
                                    try {
                                        try {
                                            try {
                                                try {
                                                    Constructor declaredConstructor2 = d11.getDeclaredConstructor(null);
                                                    declaredConstructor2.setAccessible(true);
                                                    c1711c = new C1711c(declaredConstructor2, d11);
                                                } catch (NoSuchMethodException unused) {
                                                    Class<?> cls6 = Class.forName("sun.misc.Unsafe");
                                                    Field declaredField = cls6.getDeclaredField("theUnsafe");
                                                    declaredField.setAccessible(true);
                                                    c1711c = new C1712d(cls6.getMethod("allocateInstance", Class.class), declaredField.get(null), d11);
                                                }
                                            } catch (Exception unused2) {
                                                throw new IllegalArgumentException("cannot construct instances of ".concat(d11.getName()));
                                            }
                                        } catch (ClassNotFoundException | NoSuchFieldException | NoSuchMethodException unused3) {
                                            Method declaredMethod = ObjectStreamClass.class.getDeclaredMethod("getConstructorId", Class.class);
                                            declaredMethod.setAccessible(true);
                                            int intValue = ((Integer) declaredMethod.invoke(null, Object.class)).intValue();
                                            Method declaredMethod2 = ObjectStreamClass.class.getDeclaredMethod("newInstance", Class.class, cls4);
                                            declaredMethod2.setAccessible(true);
                                            c1711c = new C1713e(declaredMethod2, d11, intValue);
                                        } catch (IllegalAccessException unused4) {
                                            throw new AssertionError();
                                        }
                                        i9 = 0;
                                    } catch (IllegalAccessException unused5) {
                                        throw new AssertionError();
                                    } catch (NoSuchMethodException unused6) {
                                        i9 = 0;
                                        Method declaredMethod3 = ObjectInputStream.class.getDeclaredMethod("newInstance", Class.class, Class.class);
                                        declaredMethod3.setAccessible(true);
                                        c1711c = new C1711c(declaredMethod3, d11);
                                    } catch (InvocationTargetException e8) {
                                        p7.e.g(e8);
                                        throw null;
                                    }
                                    TreeMap treeMap = new TreeMap();
                                    while (type3 != Object.class) {
                                        Class d12 = AbstractC1708D.d(type3);
                                        boolean d13 = p7.e.d(d12);
                                        Field[] declaredFields = d12.getDeclaredFields();
                                        int length = declaredFields.length;
                                        int i10 = i9;
                                        while (i10 < length) {
                                            Field field = declaredFields[i10];
                                            int modifiers = field.getModifiers();
                                            if (Modifier.isStatic(modifiers) || Modifier.isTransient(modifiers) || (!Modifier.isPublic(modifiers) && !Modifier.isProtected(modifiers) && d13)) {
                                                cls = d12;
                                                z9 = d13;
                                                fieldArr = declaredFields;
                                            } else {
                                                InterfaceC1717i interfaceC1717i = (InterfaceC1717i) field.getAnnotation(InterfaceC1717i.class);
                                                if (interfaceC1717i != null && interfaceC1717i.ignore()) {
                                                    cls = d12;
                                                    z9 = d13;
                                                    fieldArr = declaredFields;
                                                    z10 = z11;
                                                    i10++;
                                                    d12 = cls;
                                                    z11 = z10;
                                                    d13 = z9;
                                                    declaredFields = fieldArr;
                                                } else {
                                                    Type f9 = p7.e.f(type3, d12, field.getGenericType(), new LinkedHashSet());
                                                    Annotation[] annotations = field.getAnnotations();
                                                    boolean z12 = z11;
                                                    int length2 = annotations.length;
                                                    cls = d12;
                                                    int i11 = i9;
                                                    LinkedHashSet linkedHashSet = null;
                                                    while (i11 < length2) {
                                                        int i12 = i11;
                                                        Annotation annotation = annotations[i12];
                                                        boolean z13 = d13;
                                                        Field[] fieldArr2 = declaredFields;
                                                        if (annotation.annotationType().isAnnotationPresent(InterfaceC1721m.class)) {
                                                            if (linkedHashSet == null) {
                                                                linkedHashSet = new LinkedHashSet();
                                                            }
                                                            LinkedHashSet linkedHashSet2 = linkedHashSet;
                                                            linkedHashSet2.add(annotation);
                                                            linkedHashSet = linkedHashSet2;
                                                        }
                                                        i11 = i12 + 1;
                                                        d13 = z13;
                                                        declaredFields = fieldArr2;
                                                    }
                                                    z9 = d13;
                                                    fieldArr = declaredFields;
                                                    if (linkedHashSet != null) {
                                                        set2 = Collections.unmodifiableSet(linkedHashSet);
                                                    } else {
                                                        set2 = p7.e.f22206a;
                                                    }
                                                    String name = field.getName();
                                                    AbstractC1719k b9 = yVar.b(f9, set2, name);
                                                    field.setAccessible(z12);
                                                    if (interfaceC1717i != null) {
                                                        String name2 = interfaceC1717i.name();
                                                        if (!"\u0000".equals(name2)) {
                                                            name = name2;
                                                        }
                                                    }
                                                    C1714f c1714f = (C1714f) treeMap.put(name, new C1714f(name, field, b9));
                                                    if (c1714f != null) {
                                                        throw new IllegalArgumentException("Conflicting fields:\n    " + c1714f.f21678b + "\n    " + field);
                                                    }
                                                }
                                            }
                                            z10 = true;
                                            i10++;
                                            d12 = cls;
                                            z11 = z10;
                                            d13 = z9;
                                            declaredFields = fieldArr;
                                        }
                                        Class d14 = AbstractC1708D.d(type3);
                                        type3 = p7.e.f(type3, d14, d14.getGenericSuperclass(), new LinkedHashSet());
                                        z11 = z11;
                                    }
                                    return new C1715g(c1711c, treeMap).c();
                                }
                                throw new IllegalArgumentException("Cannot serialize abstract class ".concat(d11.getName()));
                            }
                            throw new IllegalArgumentException("Cannot serialize local class ".concat(d11.getName()));
                        }
                        throw new IllegalArgumentException("Cannot serialize anonymous class ".concat(d11.getName()));
                    }
                }
                return null;
            case 2:
                Class d15 = AbstractC1708D.d(type3);
                if (set.isEmpty()) {
                    if (d15 != List.class && d15 != Collection.class) {
                        if (d15 == Set.class) {
                            Type a5 = AbstractC1708D.a(type3);
                            yVar.getClass();
                            return new C1716h(yVar.b(a5, p7.e.f22206a, null), 1).c();
                        }
                    } else {
                        Type a9 = AbstractC1708D.a(type3);
                        yVar.getClass();
                        return new C1716h(yVar.b(a9, p7.e.f22206a, null), 0).c();
                    }
                }
                return null;
            case 3:
                if (!set.isEmpty() || (d9 = AbstractC1708D.d(type3)) != Map.class) {
                    return null;
                }
                if (type3 == Properties.class) {
                    typeArr = new Type[]{String.class, String.class};
                } else if (Map.class.isAssignableFrom(d9)) {
                    Type f10 = p7.e.f(type3, d9, p7.e.c(type3, d9, Map.class), new LinkedHashSet());
                    if (f10 instanceof ParameterizedType) {
                        typeArr = ((ParameterizedType) f10).getActualTypeArguments();
                    } else {
                        c3 = 0;
                        typeArr = new Type[]{Object.class, Object.class};
                        return new C1710b(yVar, typeArr[c3], typeArr[1]).c();
                    }
                } else {
                    throw new IllegalArgumentException();
                }
                c3 = 0;
                return new C1710b(yVar, typeArr[c3], typeArr[1]).c();
            case 4:
                return null;
            default:
                if (set.isEmpty()) {
                    C1705A c1705a = AbstractC1708D.f21654b;
                    if (type3 == Boolean.TYPE) {
                        return c1705a;
                    }
                    C1705A c1705a2 = AbstractC1708D.f21655c;
                    if (type3 == Byte.TYPE) {
                        return c1705a2;
                    }
                    C1705A c1705a3 = AbstractC1708D.f21656d;
                    if (type3 == Character.TYPE) {
                        return c1705a3;
                    }
                    C1705A c1705a4 = AbstractC1708D.f21657e;
                    if (type3 == Double.TYPE) {
                        return c1705a4;
                    }
                    C1705A c1705a5 = AbstractC1708D.f21658f;
                    if (type3 == Float.TYPE) {
                        return c1705a5;
                    }
                    C1705A c1705a6 = AbstractC1708D.f21659g;
                    if (type3 == cls4) {
                        return c1705a6;
                    }
                    C1705A c1705a7 = AbstractC1708D.f21660h;
                    if (type3 == Long.TYPE) {
                        return c1705a7;
                    }
                    C1705A c1705a8 = AbstractC1708D.f21661i;
                    if (type3 == Short.TYPE) {
                        return c1705a8;
                    }
                    if (type3 == Boolean.class) {
                        return c1705a.c();
                    }
                    if (type3 == Byte.class) {
                        return c1705a2.c();
                    }
                    if (type3 == Character.class) {
                        return c1705a3.c();
                    }
                    if (type3 == Double.class) {
                        return c1705a4.c();
                    }
                    if (type3 == Float.class) {
                        return c1705a5.c();
                    }
                    if (type3 == Integer.class) {
                        return c1705a6.c();
                    }
                    if (type3 == Long.class) {
                        return c1705a7.c();
                    }
                    if (type3 == Short.class) {
                        return c1705a8.c();
                    }
                    if (type3 == String.class) {
                        return AbstractC1708D.j.c();
                    }
                    if (type3 == Object.class) {
                        return new C1707C(yVar).c();
                    }
                    Class d16 = AbstractC1708D.d(type3);
                    Set set3 = p7.e.f22206a;
                    InterfaceC1720l interfaceC1720l = (InterfaceC1720l) d16.getAnnotation(InterfaceC1720l.class);
                    if (interfaceC1720l != null && interfaceC1720l.generateAdapter()) {
                        try {
                            try {
                                cls3 = Class.forName(d16.getName().replace("$", "_") + "JsonAdapter", true, d16.getClassLoader());
                            } catch (NoSuchMethodException e9) {
                                e = e9;
                                cls2 = null;
                            }
                            try {
                                if (type3 instanceof ParameterizedType) {
                                    Type[] actualTypeArguments = ((ParameterizedType) type3).getActualTypeArguments();
                                    try {
                                        declaredConstructor = cls3.getDeclaredConstructor(y.class, Type[].class);
                                        objArr = new Object[]{yVar, actualTypeArguments};
                                    } catch (NoSuchMethodException unused7) {
                                        declaredConstructor = cls3.getDeclaredConstructor(Type[].class);
                                        objArr = new Object[]{actualTypeArguments};
                                    }
                                } else {
                                    try {
                                        declaredConstructor = cls3.getDeclaredConstructor(y.class);
                                        objArr = new Object[]{yVar};
                                    } catch (NoSuchMethodException unused8) {
                                        declaredConstructor = cls3.getDeclaredConstructor(null);
                                        objArr = new Object[0];
                                    }
                                }
                                declaredConstructor.setAccessible(true);
                                c1863a = ((AbstractC1719k) declaredConstructor.newInstance(objArr)).c();
                            } catch (NoSuchMethodException e10) {
                                e = e10;
                                cls2 = cls3;
                                if (!(type3 instanceof ParameterizedType) && cls2.getTypeParameters().length != 0) {
                                    throw new RuntimeException("Failed to find the generated JsonAdapter constructor for '" + type3 + "'. Suspiciously, the type was not parameterized but the target class '" + cls2.getCanonicalName() + "' is generic. Consider using Types#newParameterizedType() to define these missing type variables.", e);
                                }
                                throw new RuntimeException("Failed to find the generated JsonAdapter constructor for " + type3, e);
                            }
                        } catch (ClassNotFoundException e11) {
                            throw new RuntimeException("Failed to find the generated JsonAdapter class for " + type3, e11);
                        } catch (IllegalAccessException e12) {
                            throw new RuntimeException("Failed to access the generated JsonAdapter for " + type3, e12);
                        } catch (InstantiationException e13) {
                            throw new RuntimeException("Failed to instantiate the generated JsonAdapter for " + type3, e13);
                        } catch (InvocationTargetException e14) {
                            p7.e.g(e14);
                            throw null;
                        }
                    } else {
                        c1863a = null;
                    }
                    if (c1863a != null) {
                        return c1863a;
                    }
                    if (d16.isEnum()) {
                        return new C1706B(d16).c();
                    }
                }
                return null;
        }
    }
}
