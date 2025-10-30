package i0;

import java.lang.reflect.InvocationTargetException;
import s.C1939i;

/* renamed from: i0.F, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1329F {

    /* renamed from: b, reason: collision with root package name */
    public static final C1939i f18171b = new C1939i(0);

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AbstractC1336M f18172a;

    public C1329F(AbstractC1336M abstractC1336M) {
        this.f18172a = abstractC1336M;
    }

    public static Class b(ClassLoader classLoader, String str) {
        C1939i c1939i = f18171b;
        C1939i c1939i2 = (C1939i) c1939i.get(classLoader);
        if (c1939i2 == null) {
            c1939i2 = new C1939i(0);
            c1939i.put(classLoader, c1939i2);
        }
        Class cls = (Class) c1939i2.get(str);
        if (cls == null) {
            Class<?> cls2 = Class.forName(str, false, classLoader);
            c1939i2.put(str, cls2);
            return cls2;
        }
        return cls;
    }

    public static Class c(ClassLoader classLoader, String str) {
        try {
            return b(classLoader, str);
        } catch (ClassCastException e8) {
            throw new RuntimeException(A0.a.n("Unable to instantiate fragment ", str, ": make sure class is a valid subclass of Fragment"), e8);
        } catch (ClassNotFoundException e9) {
            throw new RuntimeException(A0.a.n("Unable to instantiate fragment ", str, ": make sure class name exists"), e9);
        }
    }

    public final AbstractComponentCallbacksC1366v a(String str) {
        try {
            return (AbstractComponentCallbacksC1366v) c(this.f18172a.f18215u.f18427o.getClassLoader(), str).getConstructor(null).newInstance(null);
        } catch (IllegalAccessException e8) {
            throw new RuntimeException(A0.a.n("Unable to instantiate fragment ", str, ": make sure class name exists, is public, and has an empty constructor that is public"), e8);
        } catch (InstantiationException e9) {
            throw new RuntimeException(A0.a.n("Unable to instantiate fragment ", str, ": make sure class name exists, is public, and has an empty constructor that is public"), e9);
        } catch (NoSuchMethodException e10) {
            throw new RuntimeException(A0.a.n("Unable to instantiate fragment ", str, ": could not find Fragment constructor"), e10);
        } catch (InvocationTargetException e11) {
            throw new RuntimeException(A0.a.n("Unable to instantiate fragment ", str, ": calling Fragment constructor caused an exception"), e11);
        }
    }
}
