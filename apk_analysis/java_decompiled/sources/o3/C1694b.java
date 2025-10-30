package o3;

import j3.o0;
import j3.p0;
import l4.i;
import l4.j;

/* renamed from: o3.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C1694b implements i, j {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f21553a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e f21554b;

    public /* synthetic */ C1694b(e eVar, int i9) {
        this.f21553a = i9;
        this.f21554b = eVar;
    }

    @Override // l4.j
    public void a(Object obj, l4.f fVar) {
        this.f21554b.getClass();
        ((p0) obj).z(new o0(fVar));
    }

    @Override // l4.i
    public void invoke(Object obj) {
        p0 p0Var = (p0) obj;
        switch (this.f21553a) {
            case 0:
                p0Var.K(this.f21554b.Z(), 1);
                return;
            case 1:
                p0Var.v(this.f21554b.f21574q);
                return;
            case 2:
                p0Var.B(this.f21554b.f21583z);
                return;
            case 3:
                p0Var.K(this.f21554b.Z(), 3);
                return;
            case 4:
                p0Var.d(this.f21554b.f21575r);
                return;
            default:
                p0Var.B(this.f21554b.f21583z);
                return;
        }
    }
}
