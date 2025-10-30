package I7;

import java.lang.reflect.Method;
import kotlin.jvm.internal.h;

/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public static final Method f3582a;

    static {
        Method method;
        Method[] methods = Throwable.class.getMethods();
        h.b(methods);
        int length = methods.length;
        int i9 = 0;
        while (true) {
            method = null;
            Class<?> cls = null;
            if (i9 >= length) {
                break;
            }
            Method method2 = methods[i9];
            if (h.a(method2.getName(), "addSuppressed")) {
                Class<?>[] parameterTypes = method2.getParameterTypes();
                h.d(parameterTypes, "getParameterTypes(...)");
                if (parameterTypes.length == 1) {
                    cls = parameterTypes[0];
                }
                if (h.a(cls, Throwable.class)) {
                    method = method2;
                    break;
                }
            }
            i9++;
        }
        f3582a = method;
        int length2 = methods.length;
        for (int i10 = 0; i10 < length2 && !h.a(methods[i10].getName(), "getSuppressed"); i10++) {
        }
    }
}
