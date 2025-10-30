package androidx.lifecycle;

import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

/* renamed from: androidx.lifecycle.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0543d {

    /* renamed from: c, reason: collision with root package name */
    public static final C0543d f9872c = new C0543d();

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f9873a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    public final HashMap f9874b = new HashMap();

    public static void b(HashMap hashMap, C0542c c0542c, EnumC0554o enumC0554o, Class cls) {
        EnumC0554o enumC0554o2 = (EnumC0554o) hashMap.get(c0542c);
        if (enumC0554o2 != null && enumC0554o != enumC0554o2) {
            throw new IllegalArgumentException("Method " + c0542c.f9869b.getName() + " in " + cls.getName() + " already declared with different @OnLifecycleEvent value: previous value " + enumC0554o2 + ", new value " + enumC0554o);
        }
        if (enumC0554o2 == null) {
            hashMap.put(c0542c, enumC0554o);
        }
    }

    public final C0541b a(Class cls, Method[] methodArr) {
        int i9;
        Class superclass = cls.getSuperclass();
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = this.f9873a;
        if (superclass != null) {
            C0541b c0541b = (C0541b) hashMap2.get(superclass);
            if (c0541b == null) {
                c0541b = a(superclass, null);
            }
            hashMap.putAll(c0541b.f9862b);
        }
        for (Class<?> cls2 : cls.getInterfaces()) {
            C0541b c0541b2 = (C0541b) hashMap2.get(cls2);
            if (c0541b2 == null) {
                c0541b2 = a(cls2, null);
            }
            for (Map.Entry entry : c0541b2.f9862b.entrySet()) {
                b(hashMap, (C0542c) entry.getKey(), (EnumC0554o) entry.getValue(), cls);
            }
        }
        if (methodArr == null) {
            try {
                methodArr = cls.getDeclaredMethods();
            } catch (NoClassDefFoundError e8) {
                throw new IllegalArgumentException("The observer class has some methods that use newer APIs which are not available in the current OS version. Lifecycles cannot access even other methods so you should make sure that your observer classes only access framework classes that are available in your min API level OR use lifecycle:compiler annotation processor.", e8);
            }
        }
        boolean z9 = false;
        for (Method method : methodArr) {
            G g9 = (G) method.getAnnotation(G.class);
            if (g9 != null) {
                Class<?>[] parameterTypes = method.getParameterTypes();
                if (parameterTypes.length > 0) {
                    if (InterfaceC0561w.class.isAssignableFrom(parameterTypes[0])) {
                        i9 = 1;
                    } else {
                        throw new IllegalArgumentException("invalid parameter type. Must be one and instanceof LifecycleOwner");
                    }
                } else {
                    i9 = 0;
                }
                EnumC0554o value = g9.value();
                if (parameterTypes.length > 1) {
                    if (EnumC0554o.class.isAssignableFrom(parameterTypes[1])) {
                        if (value == EnumC0554o.ON_ANY) {
                            i9 = 2;
                        } else {
                            throw new IllegalArgumentException("Second arg is supported only for ON_ANY value");
                        }
                    } else {
                        throw new IllegalArgumentException("invalid parameter type. second arg must be an event");
                    }
                }
                if (parameterTypes.length <= 2) {
                    b(hashMap, new C0542c(method, i9), value, cls);
                    z9 = true;
                } else {
                    throw new IllegalArgumentException("cannot have more than 2 params");
                }
            }
        }
        C0541b c0541b3 = new C0541b(hashMap);
        hashMap2.put(cls, c0541b3);
        this.f9874b.put(cls, Boolean.valueOf(z9));
        return c0541b3;
    }
}
