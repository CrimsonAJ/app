package z8;

import f5.C1183o;
import java.lang.reflect.Method;

/* loaded from: classes.dex */
public final class D extends X {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f25519d;

    /* renamed from: e, reason: collision with root package name */
    public final Method f25520e;

    /* renamed from: f, reason: collision with root package name */
    public final int f25521f;

    public /* synthetic */ D(Method method, int i9, int i10) {
        this.f25519d = i10;
        this.f25520e = method;
        this.f25521f = i9;
    }

    @Override // z8.X
    public final void a(L l9, Object obj) {
        switch (this.f25519d) {
            case 0:
                i8.w wVar = (i8.w) obj;
                if (wVar != null) {
                    C1183o c1183o = l9.f25546f;
                    c1183o.getClass();
                    int size = wVar.size();
                    for (int i9 = 0; i9 < size; i9++) {
                        c1183o.x(wVar.c(i9), wVar.f(i9));
                    }
                    return;
                }
                throw X.o(this.f25520e, this.f25521f, "Headers parameter must not be null.", new Object[0]);
            default:
                if (obj != null) {
                    l9.f25543c = obj.toString();
                    return;
                }
                throw X.o(this.f25520e, this.f25521f, "@Url parameter is null.", new Object[0]);
        }
    }
}
