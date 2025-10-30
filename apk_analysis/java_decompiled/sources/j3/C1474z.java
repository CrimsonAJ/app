package j3;

import k3.C1485a;
import k3.C1494j;

/* renamed from: j3.z, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C1474z implements l4.i {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19768a = 1;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ m4.v f19769b;

    public /* synthetic */ C1474z(C1485a c1485a, m4.v vVar) {
        this.f19769b = vVar;
    }

    @Override // l4.i
    public final void invoke(Object obj) {
        switch (this.f19768a) {
            case 0:
                ((p0) obj).g(this.f19769b);
                return;
            default:
                C1494j c1494j = (C1494j) obj;
                A3.E e8 = c1494j.f19966o;
                m4.v vVar = this.f19769b;
                if (e8 != null) {
                    M m9 = (M) e8.f47c;
                    if (m9.f19441r == -1) {
                        L a5 = m9.a();
                        a5.f19407p = vVar.f20830a;
                        a5.f19408q = vVar.f20831b;
                        c1494j.f19966o = new A3.E(new M(a5), e8.f46b, (String) e8.f48d, 12);
                    }
                }
                int i9 = vVar.f20830a;
                return;
        }
    }

    public /* synthetic */ C1474z(m4.v vVar) {
        this.f19769b = vVar;
    }
}
