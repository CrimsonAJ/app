package P5;

import java.util.ListIterator;
import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public final class D extends f0 implements ListIterator {

    /* renamed from: a, reason: collision with root package name */
    public final int f5895a;

    /* renamed from: b, reason: collision with root package name */
    public int f5896b;

    /* renamed from: c, reason: collision with root package name */
    public final F f5897c;

    public D(F f9, int i9) {
        int size = f9.size();
        O4.h.h(i9, size);
        this.f5895a = size;
        this.f5896b = i9;
        this.f5897c = f9;
    }

    public final Object a(int i9) {
        return this.f5897c.get(i9);
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final boolean hasNext() {
        if (this.f5896b < this.f5895a) {
            return true;
        }
        return false;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        if (this.f5896b > 0) {
            return true;
        }
        return false;
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final Object next() {
        if (hasNext()) {
            int i9 = this.f5896b;
            this.f5896b = i9 + 1;
            return a(i9);
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f5896b;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (hasPrevious()) {
            int i9 = this.f5896b - 1;
            this.f5896b = i9;
            return a(i9);
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f5896b - 1;
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        throw new UnsupportedOperationException();
    }
}
