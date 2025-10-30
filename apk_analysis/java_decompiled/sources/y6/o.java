package y6;

import j3.C1441D;
import k3.C1485a;
import k3.C1487c;
import k3.C1489e;
import l3.C1564m;
import l4.y;

/* loaded from: classes.dex */
public final /* synthetic */ class o implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f25082a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f25083b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f25084c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f25085d;

    public /* synthetic */ o(C1564m c1564m, Object obj, long j) {
        this.f25082a = 2;
        this.f25083b = c1564m;
        this.f25085d = obj;
        this.f25084c = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        long j = this.f25084c;
        Object obj = this.f25085d;
        Object obj2 = this.f25083b;
        switch (this.f25082a) {
            case 0:
                p pVar = (p) obj2;
                pVar.f25099o.f25506b.a(new o(pVar, this.f25084c, (String) obj, 1));
                return;
            case 1:
                l lVar = ((p) obj2).f25092g;
                r rVar = lVar.f25074n;
                if (rVar == null || !rVar.f25111e.get()) {
                    ((A6.d) lVar.f25070i.f505b).m(j, (String) obj);
                    return;
                }
                return;
            default:
                C1564m c1564m = (C1564m) obj2;
                c1564m.getClass();
                int i9 = y.f20553a;
                C1441D c1441d = c1564m.f20414c.f19226a;
                C1489e c1489e = c1441d.f19283r;
                C1485a S8 = c1489e.S();
                c1489e.T(S8, 26, new C1487c(S8, obj, j));
                if (c1441d.f19276n0 == obj) {
                    c1441d.f19271l.e(26, new X0.k(23));
                    return;
                }
                return;
        }
    }

    public /* synthetic */ o(p pVar, long j, String str, int i9) {
        this.f25082a = i9;
        this.f25083b = pVar;
        this.f25084c = j;
        this.f25085d = str;
    }
}
