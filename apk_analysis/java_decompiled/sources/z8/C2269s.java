package z8;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: z8.s, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2269s {

    /* renamed from: a, reason: collision with root package name */
    public final Class f25629a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f25630b;

    /* renamed from: c, reason: collision with root package name */
    public final Method f25631c;

    /* renamed from: d, reason: collision with root package name */
    public final List f25632d;

    public C2269s(Class cls, Object obj, Method method, ArrayList arrayList) {
        this.f25629a = cls;
        this.f25630b = obj;
        this.f25631c = method;
        this.f25632d = Collections.unmodifiableList(arrayList);
    }

    public final String toString() {
        return String.format("%s.%s() %s", this.f25629a.getName(), this.f25631c.getName(), this.f25632d);
    }
}
