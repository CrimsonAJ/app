package androidx.lifecycle;

import Y7.C0464h;
import Y7.InterfaceC0465h0;
import Y7.InterfaceC0484z;

/* loaded from: classes.dex */
public final class M implements InterfaceC0559u {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ EnumC0554o f9817a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.o f9818b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0484z f9819c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ EnumC0554o f9820d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ C0464h f9821e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ g8.d f9822f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ G7.j f9823g;

    /* JADX WARN: Multi-variable type inference failed */
    public M(EnumC0554o enumC0554o, kotlin.jvm.internal.o oVar, InterfaceC0484z interfaceC0484z, EnumC0554o enumC0554o2, C0464h c0464h, g8.d dVar, O7.p pVar) {
        this.f9817a = enumC0554o;
        this.f9818b = oVar;
        this.f9819c = interfaceC0484z;
        this.f9820d = enumC0554o2;
        this.f9821e = c0464h;
        this.f9822f = dVar;
        this.f9823g = (G7.j) pVar;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [G7.j, O7.p] */
    @Override // androidx.lifecycle.InterfaceC0559u
    public final void d(InterfaceC0561w interfaceC0561w, EnumC0554o enumC0554o) {
        kotlin.jvm.internal.o oVar = this.f9818b;
        if (enumC0554o == this.f9817a) {
            oVar.f20159a = Y7.B.r(this.f9819c, null, new L(this.f9822f, this.f9823g, null), 3);
            return;
        }
        if (enumC0554o == this.f9820d) {
            InterfaceC0465h0 interfaceC0465h0 = (InterfaceC0465h0) oVar.f20159a;
            if (interfaceC0465h0 != null) {
                interfaceC0465h0.d(null);
            }
            oVar.f20159a = null;
        }
        if (enumC0554o == EnumC0554o.ON_DESTROY) {
            this.f9821e.resumeWith(A7.n.f558a);
        }
    }
}
