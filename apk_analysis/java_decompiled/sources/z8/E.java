package z8;

import B6.u0;
import java.io.IOException;
import java.lang.reflect.Method;
import java.util.Map;

/* loaded from: classes.dex */
public final class E extends X {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f25522d = 0;

    /* renamed from: e, reason: collision with root package name */
    public final Method f25523e;

    /* renamed from: f, reason: collision with root package name */
    public final int f25524f;

    /* renamed from: g, reason: collision with root package name */
    public final InterfaceC2262k f25525g;

    /* renamed from: h, reason: collision with root package name */
    public final Object f25526h;

    public E(Method method, int i9, i8.w wVar, InterfaceC2262k interfaceC2262k) {
        this.f25523e = method;
        this.f25524f = i9;
        this.f25526h = wVar;
        this.f25525g = interfaceC2262k;
    }

    @Override // z8.X
    public final void a(L l9, Object obj) {
        InterfaceC2262k interfaceC2262k = this.f25525g;
        Object obj2 = this.f25526h;
        int i9 = this.f25524f;
        Method method = this.f25523e;
        switch (this.f25522d) {
            case 0:
                if (obj != null) {
                    try {
                        l9.c((i8.w) obj2, (i8.J) interfaceC2262k.b(obj));
                        return;
                    } catch (IOException e8) {
                        throw X.o(method, i9, "Unable to convert " + obj + " to RequestBody", e8);
                    }
                }
                return;
            default:
                Map map = (Map) obj;
                if (map != null) {
                    for (Map.Entry entry : map.entrySet()) {
                        String str = (String) entry.getKey();
                        if (str != null) {
                            Object value = entry.getValue();
                            if (value != null) {
                                l9.c(u0.E("Content-Disposition", A0.a.n("form-data; name=\"", str, "\""), "Content-Transfer-Encoding", (String) obj2), (i8.J) interfaceC2262k.b(value));
                            } else {
                                throw X.o(method, i9, A0.a.n("Part map contained null value for key '", str, "'."), new Object[0]);
                            }
                        } else {
                            throw X.o(method, i9, "Part map contained null key.", new Object[0]);
                        }
                    }
                    return;
                }
                throw X.o(method, i9, "Part map was null.", new Object[0]);
        }
    }

    public E(Method method, int i9, InterfaceC2262k interfaceC2262k, String str) {
        this.f25523e = method;
        this.f25524f = i9;
        this.f25525g = interfaceC2262k;
        this.f25526h = str;
    }
}
