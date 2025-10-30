package p7;

import o7.AbstractC1719k;
import o7.AbstractC1722n;
import o7.AbstractC1725q;

/* renamed from: p7.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1863a extends AbstractC1719k {

    /* renamed from: a, reason: collision with root package name */
    public final AbstractC1719k f22199a;

    public C1863a(AbstractC1719k abstractC1719k) {
        this.f22199a = abstractC1719k;
    }

    @Override // o7.AbstractC1719k
    public final Object b(AbstractC1722n abstractC1722n) {
        if (abstractC1722n.a0() == 9) {
            abstractC1722n.O();
            return null;
        }
        return this.f22199a.b(abstractC1722n);
    }

    @Override // o7.AbstractC1719k
    public final void e(AbstractC1725q abstractC1725q, Object obj) {
        if (obj == null) {
            abstractC1725q.F();
        } else {
            this.f22199a.e(abstractC1725q, obj);
        }
    }

    public final String toString() {
        return this.f22199a + ".nullSafe()";
    }
}
