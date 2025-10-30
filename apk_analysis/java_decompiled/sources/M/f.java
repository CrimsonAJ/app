package M;

import java.util.ArrayList;
import s.C1939i;

/* loaded from: classes.dex */
public final class f implements O.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4661a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f4662b;

    public /* synthetic */ f(int i9, Object obj) {
        this.f4661a = i9;
        this.f4662b = obj;
    }

    @Override // O.a
    public final void a(Object obj) {
        switch (this.f4661a) {
            case 0:
                g gVar = (g) obj;
                if (gVar == null) {
                    gVar = new g(-3);
                }
                ((A1.g) this.f4662b).C(gVar);
                return;
            default:
                g gVar2 = (g) obj;
                synchronized (h.f4667c) {
                    try {
                        C1939i c1939i = h.f4668d;
                        ArrayList arrayList = (ArrayList) c1939i.get((String) this.f4662b);
                        if (arrayList != null) {
                            c1939i.remove((String) this.f4662b);
                            for (int i9 = 0; i9 < arrayList.size(); i9++) {
                                ((O.a) arrayList.get(i9)).a(gVar2);
                            }
                            return;
                        }
                        return;
                    } finally {
                    }
                }
        }
    }
}
