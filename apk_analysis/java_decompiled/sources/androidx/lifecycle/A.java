package androidx.lifecycle;

import B6.u0;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;

/* loaded from: classes.dex */
public abstract class A {

    /* renamed from: a, reason: collision with root package name */
    public static final HashMap f9782a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    public static final HashMap f9783b = new HashMap();

    public static void a(Constructor constructor, InterfaceC0560v interfaceC0560v) {
        try {
            kotlin.jvm.internal.h.d(constructor.newInstance(interfaceC0560v), "{\n            constructo…tance(`object`)\n        }");
            throw new ClassCastException();
        } catch (IllegalAccessException e8) {
            throw new RuntimeException(e8);
        } catch (InstantiationException e9) {
            throw new RuntimeException(e9);
        } catch (InvocationTargetException e10) {
            throw new RuntimeException(e10);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static int b(Class cls) {
        Constructor constructor;
        boolean z9;
        boolean z10;
        boolean z11;
        String fullPackage;
        int i9 = 1;
        HashMap hashMap = f9782a;
        Integer num = (Integer) hashMap.get(cls);
        if (num != null) {
            return num.intValue();
        }
        if (cls.getCanonicalName() != null) {
            ArrayList arrayList = null;
            try {
                Package r42 = cls.getPackage();
                String name = cls.getCanonicalName();
                if (r42 != null) {
                    fullPackage = r42.getName();
                } else {
                    fullPackage = "";
                }
                kotlin.jvm.internal.h.d(fullPackage, "fullPackage");
                if (fullPackage.length() != 0) {
                    kotlin.jvm.internal.h.d(name, "name");
                    name = name.substring(fullPackage.length() + 1);
                    kotlin.jvm.internal.h.d(name, "this as java.lang.String).substring(startIndex)");
                }
                kotlin.jvm.internal.h.d(name, "if (fullPackage.isEmpty(…g(fullPackage.length + 1)");
                String concat = W7.l.J(name, ".", "_").concat("_LifecycleAdapter");
                if (fullPackage.length() != 0) {
                    concat = fullPackage + '.' + concat;
                }
                constructor = Class.forName(concat).getDeclaredConstructor(cls);
                if (!constructor.isAccessible()) {
                    constructor.setAccessible(true);
                }
            } catch (ClassNotFoundException unused) {
                constructor = null;
            } catch (NoSuchMethodException e8) {
                throw new RuntimeException(e8);
            }
            HashMap hashMap2 = f9783b;
            if (constructor != null) {
                hashMap2.put(cls, u0.D(constructor));
            } else {
                C0543d c0543d = C0543d.f9872c;
                HashMap hashMap3 = c0543d.f9874b;
                Boolean bool = (Boolean) hashMap3.get(cls);
                if (bool != null) {
                    z9 = bool.booleanValue();
                } else {
                    try {
                        Method[] declaredMethods = cls.getDeclaredMethods();
                        int length = declaredMethods.length;
                        int i10 = 0;
                        while (true) {
                            if (i10 < length) {
                                if (((G) declaredMethods[i10].getAnnotation(G.class)) != null) {
                                    c0543d.a(cls, declaredMethods);
                                    z9 = true;
                                    break;
                                }
                                i10++;
                            } else {
                                hashMap3.put(cls, Boolean.FALSE);
                                z9 = false;
                                break;
                            }
                        }
                    } catch (NoClassDefFoundError e9) {
                        throw new IllegalArgumentException("The observer class has some methods that use newer APIs which are not available in the current OS version. Lifecycles cannot access even other methods so you should make sure that your observer classes only access framework classes that are available in your min API level OR use lifecycle:compiler annotation processor.", e9);
                    }
                }
                if (!z9) {
                    Class superclass = cls.getSuperclass();
                    if (superclass != null && InterfaceC0560v.class.isAssignableFrom(superclass)) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (z10) {
                        kotlin.jvm.internal.h.d(superclass, "superclass");
                        if (b(superclass) != 1) {
                            Object obj = hashMap2.get(superclass);
                            kotlin.jvm.internal.h.b(obj);
                            arrayList = new ArrayList((Collection) obj);
                        }
                    }
                    Class<?>[] interfaces = cls.getInterfaces();
                    kotlin.jvm.internal.h.d(interfaces, "klass.interfaces");
                    int length2 = interfaces.length;
                    int i11 = 0;
                    while (true) {
                        if (i11 < length2) {
                            Class<?> intrface = interfaces[i11];
                            if (intrface != null && InterfaceC0560v.class.isAssignableFrom(intrface)) {
                                z11 = true;
                            } else {
                                z11 = false;
                            }
                            if (z11) {
                                kotlin.jvm.internal.h.d(intrface, "intrface");
                                if (b(intrface) == 1) {
                                    break;
                                }
                                if (arrayList == null) {
                                    arrayList = new ArrayList();
                                }
                                Object obj2 = hashMap2.get(intrface);
                                kotlin.jvm.internal.h.b(obj2);
                                arrayList.addAll((Collection) obj2);
                            }
                            i11++;
                        } else if (arrayList != null) {
                            hashMap2.put(cls, arrayList);
                        }
                    }
                }
            }
            i9 = 2;
        }
        hashMap.put(cls, Integer.valueOf(i9));
        return i9;
    }
}
