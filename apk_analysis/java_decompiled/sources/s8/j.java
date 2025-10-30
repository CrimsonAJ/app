package s8;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes.dex */
public final class j implements InvocationHandler {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f22800a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f22801b;

    /* renamed from: c, reason: collision with root package name */
    public String f22802c;

    public j(ArrayList arrayList) {
        this.f22800a = arrayList;
    }

    @Override // java.lang.reflect.InvocationHandler
    public final Object invoke(Object proxy, Method method, Object[] objArr) {
        kotlin.jvm.internal.h.e(proxy, "proxy");
        kotlin.jvm.internal.h.e(method, "method");
        if (objArr == null) {
            objArr = new Object[0];
        }
        String name = method.getName();
        Class<?> returnType = method.getReturnType();
        if (kotlin.jvm.internal.h.a(name, "supports") && kotlin.jvm.internal.h.a(Boolean.TYPE, returnType)) {
            return Boolean.TRUE;
        }
        if (kotlin.jvm.internal.h.a(name, "unsupported") && kotlin.jvm.internal.h.a(Void.TYPE, returnType)) {
            this.f22801b = true;
            return null;
        }
        boolean a5 = kotlin.jvm.internal.h.a(name, "protocols");
        ArrayList arrayList = this.f22800a;
        if (a5 && objArr.length == 0) {
            return arrayList;
        }
        if ((kotlin.jvm.internal.h.a(name, "selectProtocol") || kotlin.jvm.internal.h.a(name, "select")) && String.class.equals(returnType) && objArr.length == 1) {
            Object obj = objArr[0];
            if (obj instanceof List) {
                kotlin.jvm.internal.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<*>");
                List list = (List) obj;
                int size = list.size();
                if (size >= 0) {
                    int i9 = 0;
                    while (true) {
                        Object obj2 = list.get(i9);
                        kotlin.jvm.internal.h.c(obj2, "null cannot be cast to non-null type kotlin.String");
                        String str = (String) obj2;
                        if (arrayList.contains(str)) {
                            this.f22802c = str;
                            return str;
                        }
                        if (i9 == size) {
                            break;
                        }
                        i9++;
                    }
                }
                String str2 = (String) arrayList.get(0);
                this.f22802c = str2;
                return str2;
            }
        }
        if ((kotlin.jvm.internal.h.a(name, "protocolSelected") || kotlin.jvm.internal.h.a(name, "selected")) && objArr.length == 1) {
            Object obj3 = objArr[0];
            kotlin.jvm.internal.h.c(obj3, "null cannot be cast to non-null type kotlin.String");
            this.f22802c = (String) obj3;
            return null;
        }
        return method.invoke(this, Arrays.copyOf(objArr, objArr.length));
    }
}
