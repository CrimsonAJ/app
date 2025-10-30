package V7;

import java.util.Iterator;

/* loaded from: classes.dex */
public final class c implements j, d {

    /* renamed from: a, reason: collision with root package name */
    public final j f7816a;

    /* renamed from: b, reason: collision with root package name */
    public final int f7817b;

    public c(j jVar, int i9) {
        this.f7816a = jVar;
        this.f7817b = i9;
        if (i9 >= 0) {
            return;
        }
        throw new IllegalArgumentException(("count must be non-negative, but was " + i9 + '.').toString());
    }

    @Override // V7.d
    public final j a(int i9) {
        int i10 = this.f7817b + i9;
        if (i10 < 0) {
            return new c(this, i9);
        }
        return new c(this.f7816a, i10);
    }

    @Override // V7.d
    public final j b() {
        int i9 = this.f7817b;
        int i10 = i9 + 15;
        if (i10 < 0) {
            return new p(this);
        }
        return new o(this.f7816a, i9, i10);
    }

    @Override // V7.j
    public final Iterator iterator() {
        return new b(this);
    }
}
