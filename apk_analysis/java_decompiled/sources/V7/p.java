package V7;

import java.util.Iterator;

/* loaded from: classes.dex */
public final class p implements j, d {

    /* renamed from: a, reason: collision with root package name */
    public final j f7842a;

    public p(j jVar) {
        this.f7842a = jVar;
    }

    @Override // V7.d
    public final j a(int i9) {
        if (i9 >= 15) {
            return e.f7818a;
        }
        return new o(this.f7842a, i9, 15);
    }

    @Override // V7.j
    public final Iterator iterator() {
        return new b(this);
    }

    @Override // V7.d
    public final j b() {
        return this;
    }
}
