package y;

import x.C2149d;
import x.C2153h;

/* loaded from: classes.dex */
public final class g extends l {
    @Override // y.d
    public final void a(d dVar) {
        e eVar = this.f24728h;
        if (!eVar.f24706c || eVar.j) {
            return;
        }
        eVar.d((int) ((((e) eVar.f24714l.get(0)).f24710g * ((C2153h) this.f24722b).f24463d0) + 0.5f));
    }

    @Override // y.l
    public final void d() {
        C2149d c2149d = this.f24722b;
        C2153h c2153h = (C2153h) c2149d;
        int i9 = c2153h.f24464e0;
        int i10 = c2153h.f24465f0;
        int i11 = c2153h.f24467h0;
        e eVar = this.f24728h;
        if (i11 == 1) {
            if (i9 != -1) {
                eVar.f24714l.add(c2149d.f24353I.f24375d.f24728h);
                this.f24722b.f24353I.f24375d.f24728h.f24713k.add(eVar);
                eVar.f24709f = i9;
            } else if (i10 != -1) {
                eVar.f24714l.add(c2149d.f24353I.f24375d.f24729i);
                this.f24722b.f24353I.f24375d.f24729i.f24713k.add(eVar);
                eVar.f24709f = -i10;
            } else {
                eVar.f24705b = true;
                eVar.f24714l.add(c2149d.f24353I.f24375d.f24729i);
                this.f24722b.f24353I.f24375d.f24729i.f24713k.add(eVar);
            }
            m(this.f24722b.f24375d.f24728h);
            m(this.f24722b.f24375d.f24729i);
            return;
        }
        if (i9 != -1) {
            eVar.f24714l.add(c2149d.f24353I.f24376e.f24728h);
            this.f24722b.f24353I.f24376e.f24728h.f24713k.add(eVar);
            eVar.f24709f = i9;
        } else if (i10 != -1) {
            eVar.f24714l.add(c2149d.f24353I.f24376e.f24729i);
            this.f24722b.f24353I.f24376e.f24729i.f24713k.add(eVar);
            eVar.f24709f = -i10;
        } else {
            eVar.f24705b = true;
            eVar.f24714l.add(c2149d.f24353I.f24376e.f24729i);
            this.f24722b.f24353I.f24376e.f24729i.f24713k.add(eVar);
        }
        m(this.f24722b.f24376e.f24728h);
        m(this.f24722b.f24376e.f24729i);
    }

    @Override // y.l
    public final void e() {
        C2149d c2149d = this.f24722b;
        int i9 = ((C2153h) c2149d).f24467h0;
        e eVar = this.f24728h;
        if (i9 == 1) {
            c2149d.f24357N = eVar.f24710g;
        } else {
            c2149d.f24358O = eVar.f24710g;
        }
    }

    @Override // y.l
    public final void f() {
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
