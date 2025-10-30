package e3;

import g3.InterfaceC1251b;
import j3.p0;
import j3.q0;

/* loaded from: classes.dex */
public final /* synthetic */ class g implements InterfaceC1251b, l4.i {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17160a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f17161b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f17162c;

    public /* synthetic */ g(int i9, q0 q0Var, q0 q0Var2) {
        this.f17160a = i9;
        this.f17161b = q0Var;
        this.f17162c = q0Var2;
    }

    @Override // g3.InterfaceC1251b
    public Object f() {
        ((j) this.f17161b).f17174d.a((Y2.j) this.f17162c, this.f17160a + 1, false);
        return null;
    }

    @Override // l4.i
    public void invoke(Object obj) {
        p0 p0Var = (p0) obj;
        p0Var.getClass();
        p0Var.E(this.f17160a, (q0) this.f17161b, (q0) this.f17162c);
    }

    public /* synthetic */ g(j jVar, Y2.j jVar2, int i9) {
        this.f17161b = jVar;
        this.f17162c = jVar2;
        this.f17160a = i9;
    }
}
