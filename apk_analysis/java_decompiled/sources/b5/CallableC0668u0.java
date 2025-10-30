package b5;

import java.util.concurrent.Callable;

/* renamed from: b5.u0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class CallableC0668u0 implements Callable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11322a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f11323b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f11324c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f11325d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ BinderC0672w0 f11326e;

    public /* synthetic */ CallableC0668u0(BinderC0672w0 binderC0672w0, String str, String str2, String str3, int i9) {
        this.f11322a = i9;
        this.f11323b = str;
        this.f11324c = str2;
        this.f11325d = str3;
        this.f11326e = binderC0672w0;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.f11322a) {
            case 0:
                BinderC0672w0 binderC0672w0 = this.f11326e;
                binderC0672w0.f11339e.e();
                C0649n c0649n = binderC0672w0.f11339e.f10744c;
                J1.J(c0649n);
                return c0649n.u0(this.f11323b, this.f11324c, this.f11325d);
            case 1:
                BinderC0672w0 binderC0672w02 = this.f11326e;
                binderC0672w02.f11339e.e();
                C0649n c0649n2 = binderC0672w02.f11339e.f10744c;
                J1.J(c0649n2);
                return c0649n2.u0(this.f11323b, this.f11324c, this.f11325d);
            case 2:
                BinderC0672w0 binderC0672w03 = this.f11326e;
                binderC0672w03.f11339e.e();
                C0649n c0649n3 = binderC0672w03.f11339e.f10744c;
                J1.J(c0649n3);
                return c0649n3.q0(this.f11323b, this.f11324c, this.f11325d);
            default:
                BinderC0672w0 binderC0672w04 = this.f11326e;
                binderC0672w04.f11339e.e();
                C0649n c0649n4 = binderC0672w04.f11339e.f10744c;
                J1.J(c0649n4);
                return c0649n4.q0(this.f11323b, this.f11324c, this.f11325d);
        }
    }
}
