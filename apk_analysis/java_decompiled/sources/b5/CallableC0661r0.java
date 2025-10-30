package b5;

import java.util.concurrent.Callable;

/* renamed from: b5.r0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class CallableC0661r0 implements Callable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11294a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f11295b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f11296c;

    public /* synthetic */ CallableC0661r0(Object obj, int i9, Object obj2) {
        this.f11294a = i9;
        this.f11296c = obj2;
        this.f11295b = obj;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.f11294a) {
            case 0:
                BinderC0672w0 binderC0672w0 = (BinderC0672w0) this.f11295b;
                binderC0672w0.f11339e.e();
                C0649n c0649n = binderC0672w0.f11339e.f10744c;
                J1.J(c0649n);
                return c0649n.t0((String) this.f11296c);
            case 1:
                BinderC0672w0 binderC0672w02 = (BinderC0672w0) this.f11295b;
                binderC0672w02.f11339e.e();
                return new C0634i(binderC0672w02.f11339e.d0(((Q1) this.f11296c).f10901a));
            default:
                Q1 q12 = (Q1) this.f11296c;
                String str = q12.f10901a;
                F4.y.h(str);
                J1 j12 = (J1) this.f11295b;
                C0 n02 = j12.n0(str);
                B0 b02 = B0.ANALYTICS_STORAGE;
                if (n02.k(b02) && C0.e(100, q12.f10920u).k(b02)) {
                    return j12.f0(q12).d();
                }
                j12.A().f10978n.b("Analytics storage consent denied. Returning null app instance id");
                return null;
        }
    }
}
