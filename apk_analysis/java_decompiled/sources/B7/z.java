package B7;

import java.util.List;
import java.util.ListIterator;

/* loaded from: classes.dex */
public final class z implements ListIterator, P7.a {

    /* renamed from: a, reason: collision with root package name */
    public final ListIterator f1140a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ A f1141b;

    public z(A a5, int i9) {
        this.f1141b = a5;
        List list = a5.f1100a;
        if (i9 >= 0 && i9 <= a5.b()) {
            this.f1140a = list.listIterator(a5.b() - i9);
            return;
        }
        StringBuilder p9 = A0.a.p("Position index ", i9, " must be in range [");
        p9.append(new T7.a(0, a5.b(), 1));
        p9.append("].");
        throw new IndexOutOfBoundsException(p9.toString());
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        return this.f1140a.hasPrevious();
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f1140a.hasNext();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        return this.f1140a.previous();
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return l.a0(this.f1141b) - this.f1140a.previousIndex();
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        return this.f1140a.next();
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return l.a0(this.f1141b) - this.f1140a.nextIndex();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
