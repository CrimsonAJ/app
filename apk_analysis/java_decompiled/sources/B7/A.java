package B7;

import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/* loaded from: classes.dex */
public final class A extends AbstractC0054e {

    /* renamed from: a, reason: collision with root package name */
    public final List f1100a;

    public A(List list) {
        this.f1100a = list;
    }

    @Override // B7.AbstractC0054e
    public final int b() {
        return this.f1100a.size();
    }

    @Override // java.util.List
    public final Object get(int i9) {
        if (i9 >= 0 && i9 <= l.a0(this)) {
            return this.f1100a.get(l.a0(this) - i9);
        }
        StringBuilder p9 = A0.a.p("Element index ", i9, " must be in range [");
        p9.append(new T7.a(0, l.a0(this), 1));
        p9.append("].");
        throw new IndexOutOfBoundsException(p9.toString());
    }

    @Override // B7.AbstractC0054e, java.util.List, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new z(this, 0);
    }

    @Override // B7.AbstractC0054e, java.util.List
    public final ListIterator listIterator() {
        return new z(this, 0);
    }

    @Override // B7.AbstractC0054e, java.util.List
    public final ListIterator listIterator(int i9) {
        return new z(this, i9);
    }
}
