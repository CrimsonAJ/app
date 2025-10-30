package z8;

import java.io.IOException;
import java.lang.reflect.Method;

/* loaded from: classes.dex */
public final class A extends X {

    /* renamed from: d, reason: collision with root package name */
    public final Method f25508d;

    /* renamed from: e, reason: collision with root package name */
    public final int f25509e;

    /* renamed from: f, reason: collision with root package name */
    public final InterfaceC2262k f25510f;

    public A(Method method, int i9, InterfaceC2262k interfaceC2262k) {
        this.f25508d = method;
        this.f25509e = i9;
        this.f25510f = interfaceC2262k;
    }

    @Override // z8.X
    public final void a(L l9, Object obj) {
        Method method = this.f25508d;
        int i9 = this.f25509e;
        if (obj != null) {
            try {
                l9.f25550k = (i8.J) this.f25510f.b(obj);
                return;
            } catch (IOException e8) {
                throw X.p(method, e8, i9, "Unable to convert " + obj + " to RequestBody", new Object[0]);
            }
        }
        throw X.o(method, i9, "Body parameter value must not be null.", new Object[0]);
    }
}
