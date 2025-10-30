package j3;

import k3.C1485a;
import k3.C1494j;

/* renamed from: j3.t, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C1468t implements l4.i {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19731a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f19732b;

    public /* synthetic */ C1468t(int i9, int i10) {
        this.f19731a = i10;
        this.f19732b = i9;
    }

    @Override // l4.i
    public final void invoke(Object obj) {
        switch (this.f19731a) {
            case 0:
                ((p0) obj).i(this.f19732b);
                return;
            case 1:
                C1494j c1494j = (C1494j) obj;
                c1494j.getClass();
                int i9 = this.f19732b;
                if (i9 == 1) {
                    c1494j.f19972u = true;
                }
                c1494j.f19962k = i9;
                return;
            case 2:
                ((p0) obj).w(this.f19732b);
                return;
            default:
                ((p0) obj).i(this.f19732b);
                return;
        }
    }

    public /* synthetic */ C1468t(C1485a c1485a, int i9, q0 q0Var, q0 q0Var2) {
        this.f19731a = 1;
        this.f19732b = i9;
    }
}
