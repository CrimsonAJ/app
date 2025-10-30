package t0;

import java.util.ArrayList;
import java.util.Iterator;
import s.C1935e;
import s.C1939i;

/* renamed from: t0.z, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1991z extends C {

    /* renamed from: w, reason: collision with root package name */
    public final ArrayList f23054w;

    /* renamed from: x, reason: collision with root package name */
    public final C1935e f23055x;

    /* JADX WARN: Type inference failed for: r2v2, types: [s.e, s.i] */
    public C1991z(C1966B c1966b, String str, String str2) {
        super(c1966b, str, str2, false);
        this.f23054w = new ArrayList();
        this.f23055x = new C1939i(0);
    }

    public final boolean n() {
        D.b();
        C1971e c3 = D.c();
        c3.getClass();
        ArrayList arrayList = new ArrayList();
        Iterator it = c3.j.values().iterator();
        if (!it.hasNext()) {
            return arrayList.contains(this);
        }
        throw A0.a.h(it);
    }

    public final boolean o(C c3) {
        C1983q c1983q = (C1983q) this.f23055x.get(c3.f22842c);
        if (c1983q != null && c1983q.f23026d) {
            return true;
        }
        return false;
    }

    public final void p(ArrayList arrayList) {
        this.f22860v.clear();
        ArrayList arrayList2 = this.f23054w;
        arrayList2.clear();
        C1935e c1935e = this.f23055x;
        c1935e.clear();
        int size = arrayList.size();
        int i9 = 0;
        while (i9 < size) {
            Object obj = arrayList.get(i9);
            i9++;
            C1983q c1983q = (C1983q) obj;
            C a5 = this.f22840a.a(c1983q.f23023a.d());
            if (a5 != null) {
                arrayList2.add(a5);
                c1935e.put(a5.f22842c, c1983q);
                int i10 = c1983q.f23024b;
                if (i10 == 2 || i10 == 3) {
                    this.f22860v.add(a5);
                }
            }
        }
        D.c().f22963a.b(259, this);
    }
}
