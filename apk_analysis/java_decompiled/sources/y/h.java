package y;

import java.util.ArrayList;
import x.C2146a;
import x.C2149d;

/* loaded from: classes.dex */
public final class h extends l {
    @Override // y.d
    public final void a(d dVar) {
        C2146a c2146a = (C2146a) this.f24722b;
        int i9 = c2146a.f24319f0;
        e eVar = this.f24728h;
        ArrayList arrayList = eVar.f24714l;
        int size = arrayList.size();
        int i10 = 0;
        int i11 = 0;
        int i12 = -1;
        while (i11 < size) {
            Object obj = arrayList.get(i11);
            i11++;
            int i13 = ((e) obj).f24710g;
            if (i12 == -1 || i13 < i12) {
                i12 = i13;
            }
            if (i10 < i13) {
                i10 = i13;
            }
        }
        if (i9 != 0 && i9 != 2) {
            eVar.d(i10 + c2146a.f24321h0);
        } else {
            eVar.d(i12 + c2146a.f24321h0);
        }
    }

    @Override // y.l
    public final void d() {
        C2149d c2149d = this.f24722b;
        if (c2149d instanceof C2146a) {
            e eVar = this.f24728h;
            eVar.f24705b = true;
            C2146a c2146a = (C2146a) c2149d;
            int i9 = c2146a.f24319f0;
            boolean z9 = c2146a.f24320g0;
            int i10 = 0;
            if (i9 != 0) {
                if (i9 != 1) {
                    if (i9 != 2) {
                        if (i9 == 3) {
                            eVar.f24708e = 7;
                            while (i10 < c2146a.f24469e0) {
                                C2149d c2149d2 = c2146a.f24468d0[i10];
                                if (z9 || c2149d2.f24365V != 8) {
                                    e eVar2 = c2149d2.f24376e.f24729i;
                                    eVar2.f24713k.add(eVar);
                                    eVar.f24714l.add(eVar2);
                                }
                                i10++;
                            }
                            m(this.f24722b.f24376e.f24728h);
                            m(this.f24722b.f24376e.f24729i);
                            return;
                        }
                        return;
                    }
                    eVar.f24708e = 6;
                    while (i10 < c2146a.f24469e0) {
                        C2149d c2149d3 = c2146a.f24468d0[i10];
                        if (z9 || c2149d3.f24365V != 8) {
                            e eVar3 = c2149d3.f24376e.f24728h;
                            eVar3.f24713k.add(eVar);
                            eVar.f24714l.add(eVar3);
                        }
                        i10++;
                    }
                    m(this.f24722b.f24376e.f24728h);
                    m(this.f24722b.f24376e.f24729i);
                    return;
                }
                eVar.f24708e = 5;
                while (i10 < c2146a.f24469e0) {
                    C2149d c2149d4 = c2146a.f24468d0[i10];
                    if (z9 || c2149d4.f24365V != 8) {
                        e eVar4 = c2149d4.f24375d.f24729i;
                        eVar4.f24713k.add(eVar);
                        eVar.f24714l.add(eVar4);
                    }
                    i10++;
                }
                m(this.f24722b.f24375d.f24728h);
                m(this.f24722b.f24375d.f24729i);
                return;
            }
            eVar.f24708e = 4;
            while (i10 < c2146a.f24469e0) {
                C2149d c2149d5 = c2146a.f24468d0[i10];
                if (z9 || c2149d5.f24365V != 8) {
                    e eVar5 = c2149d5.f24375d.f24728h;
                    eVar5.f24713k.add(eVar);
                    eVar.f24714l.add(eVar5);
                }
                i10++;
            }
            m(this.f24722b.f24375d.f24728h);
            m(this.f24722b.f24375d.f24729i);
        }
    }

    @Override // y.l
    public final void e() {
        C2149d c2149d = this.f24722b;
        if (c2149d instanceof C2146a) {
            int i9 = ((C2146a) c2149d).f24319f0;
            e eVar = this.f24728h;
            if (i9 != 0 && i9 != 1) {
                c2149d.f24358O = eVar.f24710g;
            } else {
                c2149d.f24357N = eVar.f24710g;
            }
        }
    }

    @Override // y.l
    public final void f() {
        this.f24723c = null;
        this.f24728h.c();
    }

    @Override // y.l
    public final boolean k() {
        return false;
    }

    public final void m(e eVar) {
        e eVar2 = this.f24728h;
        eVar2.f24713k.add(eVar);
        eVar.f24714l.add(eVar2);
    }
}
