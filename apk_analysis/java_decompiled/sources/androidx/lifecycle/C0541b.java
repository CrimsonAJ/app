package androidx.lifecycle;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: androidx.lifecycle.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0541b {

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f9861a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    public final HashMap f9862b;

    public C0541b(HashMap hashMap) {
        this.f9862b = hashMap;
        for (Map.Entry entry : hashMap.entrySet()) {
            EnumC0554o enumC0554o = (EnumC0554o) entry.getValue();
            List list = (List) this.f9861a.get(enumC0554o);
            if (list == null) {
                list = new ArrayList();
                this.f9861a.put(enumC0554o, list);
            }
            list.add((C0542c) entry.getKey());
        }
    }

    public static void a(List list, InterfaceC0561w interfaceC0561w, EnumC0554o enumC0554o, InterfaceC0560v interfaceC0560v) {
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                C0542c c0542c = (C0542c) list.get(size);
                c0542c.getClass();
                try {
                    int i9 = c0542c.f9868a;
                    Method method = c0542c.f9869b;
                    if (i9 != 0) {
                        if (i9 != 1) {
                            if (i9 == 2) {
                                method.invoke(interfaceC0560v, interfaceC0561w, enumC0554o);
                            }
                        } else {
                            method.invoke(interfaceC0560v, interfaceC0561w);
                        }
                    } else {
                        method.invoke(interfaceC0560v, null);
                    }
                } catch (IllegalAccessException e8) {
                    throw new RuntimeException(e8);
                } catch (InvocationTargetException e9) {
                    throw new RuntimeException("Failed to call observer method", e9.getCause());
                }
            }
        }
    }
}
