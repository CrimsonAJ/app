package S3;

import N3.c0;
import j3.L;
import j3.M;
import java.util.Map;
import k4.C1517q;
import n3.C1630g;
import n3.C1635l;
import n3.InterfaceC1638o;

/* loaded from: classes.dex */
public final class q extends c0 {

    /* renamed from: H, reason: collision with root package name */
    public final Map f6860H;

    /* renamed from: I, reason: collision with root package name */
    public C1630g f6861I;

    public q(C1517q c1517q, InterfaceC1638o interfaceC1638o, C1635l c1635l, Map map) {
        super(c1517q, interfaceC1638o, c1635l);
        this.f6860H = map;
    }

    @Override // N3.c0
    public final M m(M m9) {
        C1630g c1630g;
        C1630g c1630g2 = this.f6861I;
        if (c1630g2 == null) {
            c1630g2 = m9.f19438o;
        }
        if (c1630g2 != null && (c1630g = (C1630g) this.f6860H.get(c1630g2.f21122c)) != null) {
            c1630g2 = c1630g;
        }
        D3.c cVar = m9.j;
        D3.c cVar2 = null;
        if (cVar != null) {
            D3.b[] bVarArr = cVar.f1786a;
            int length = bVarArr.length;
            int i9 = 0;
            while (true) {
                if (i9 < length) {
                    D3.b bVar = bVarArr[i9];
                    if ((bVar instanceof I3.m) && "com.apple.streaming.transportStreamTimestamp".equals(((I3.m) bVar).f3518b)) {
                        break;
                    }
                    i9++;
                } else {
                    i9 = -1;
                    break;
                }
            }
            if (i9 != -1) {
                if (length != 1) {
                    D3.b[] bVarArr2 = new D3.b[length - 1];
                    for (int i10 = 0; i10 < length; i10++) {
                        if (i10 != i9) {
                            bVarArr2[i10 < i9 ? i10 : i10 - 1] = bVarArr[i10];
                        }
                    }
                    cVar2 = new D3.c(bVarArr2);
                }
            }
            if (c1630g2 == m9.f19438o || cVar != m9.j) {
                L a5 = m9.a();
                a5.f19405n = c1630g2;
                a5.f19401i = cVar;
                m9 = new M(a5);
            }
            return super.m(m9);
        }
        cVar = cVar2;
        if (c1630g2 == m9.f19438o) {
        }
        L a52 = m9.a();
        a52.f19405n = c1630g2;
        a52.f19401i = cVar;
        m9 = new M(a52);
        return super.m(m9);
    }
}
