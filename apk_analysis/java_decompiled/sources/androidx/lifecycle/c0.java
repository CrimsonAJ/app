package androidx.lifecycle;

import B6.u0;
import android.app.Application;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes.dex */
public abstract class c0 {

    /* renamed from: a, reason: collision with root package name */
    public static final List f9870a = B7.l.b0(Application.class, V.class);

    /* renamed from: b, reason: collision with root package name */
    public static final List f9871b = u0.D(V.class);

    public static final Constructor a(Class cls, List signature) {
        kotlin.jvm.internal.h.e(signature, "signature");
        Constructor<?>[] constructors = cls.getConstructors();
        kotlin.jvm.internal.h.d(constructors, "modelClass.constructors");
        for (Constructor<?> constructor : constructors) {
            Class<?>[] parameterTypes = constructor.getParameterTypes();
            kotlin.jvm.internal.h.d(parameterTypes, "constructor.parameterTypes");
            List o02 = B7.j.o0(parameterTypes);
            if (signature.equals(o02)) {
                return constructor;
            }
            if (signature.size() == o02.size() && o02.containsAll(signature)) {
                throw new UnsupportedOperationException("Class " + cls.getSimpleName() + " must have parameters in the proper order: " + signature);
            }
        }
        return null;
    }

    public static final e0 b(Class cls, Constructor constructor, Object... objArr) {
        try {
            return (e0) constructor.newInstance(Arrays.copyOf(objArr, objArr.length));
        } catch (IllegalAccessException e8) {
            throw new RuntimeException("Failed to access " + cls, e8);
        } catch (InstantiationException e9) {
            throw new RuntimeException("A " + cls + " cannot be instantiated.", e9);
        } catch (InvocationTargetException e10) {
            throw new RuntimeException("An exception happened in constructor of " + cls, e10.getCause());
        }
    }
}
