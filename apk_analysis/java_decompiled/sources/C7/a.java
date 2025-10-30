package C7;

import java.util.AbstractList;
import java.util.ConcurrentModificationException;
import java.util.ListIterator;
import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public final class a implements ListIterator, P7.a {

    /* renamed from: b, reason: collision with root package name */
    public int f1617b;

    /* renamed from: d, reason: collision with root package name */
    public int f1619d;

    /* renamed from: e, reason: collision with root package name */
    public final B7.f f1620e;

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1616a = 0;

    /* renamed from: c, reason: collision with root package name */
    public int f1618c = -1;

    public a(c cVar, int i9) {
        int i10;
        this.f1620e = cVar;
        this.f1617b = i9;
        i10 = ((AbstractList) cVar).modCount;
        this.f1619d = i10;
    }

    public void a() {
        int i9;
        i9 = ((AbstractList) ((b) this.f1620e).f1625e).modCount;
        if (i9 == this.f1619d) {
        } else {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        int i9;
        int i10;
        switch (this.f1616a) {
            case 0:
                a();
                int i11 = this.f1617b;
                this.f1617b = i11 + 1;
                b bVar = (b) this.f1620e;
                bVar.add(i11, obj);
                this.f1618c = -1;
                i9 = ((AbstractList) bVar).modCount;
                this.f1619d = i9;
                return;
            default:
                b();
                int i12 = this.f1617b;
                this.f1617b = i12 + 1;
                c cVar = (c) this.f1620e;
                cVar.add(i12, obj);
                this.f1618c = -1;
                i10 = ((AbstractList) cVar).modCount;
                this.f1619d = i10;
                return;
        }
    }

    public void b() {
        int i9;
        i9 = ((AbstractList) ((c) this.f1620e)).modCount;
        if (i9 == this.f1619d) {
        } else {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        switch (this.f1616a) {
            case 0:
                if (this.f1617b < ((b) this.f1620e).f1623c) {
                    return true;
                }
                return false;
            default:
                if (this.f1617b < ((c) this.f1620e).f1628b) {
                    return true;
                }
                return false;
        }
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        switch (this.f1616a) {
            case 0:
                if (this.f1617b > 0) {
                    return true;
                }
                return false;
            default:
                if (this.f1617b > 0) {
                    return true;
                }
                return false;
        }
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        switch (this.f1616a) {
            case 0:
                a();
                int i9 = this.f1617b;
                b bVar = (b) this.f1620e;
                if (i9 < bVar.f1623c) {
                    this.f1617b = i9 + 1;
                    this.f1618c = i9;
                    return bVar.f1621a[bVar.f1622b + i9];
                }
                throw new NoSuchElementException();
            default:
                b();
                int i10 = this.f1617b;
                c cVar = (c) this.f1620e;
                if (i10 < cVar.f1628b) {
                    this.f1617b = i10 + 1;
                    this.f1618c = i10;
                    return cVar.f1627a[i10];
                }
                throw new NoSuchElementException();
        }
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        switch (this.f1616a) {
            case 0:
                return this.f1617b;
            default:
                return this.f1617b;
        }
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        switch (this.f1616a) {
            case 0:
                a();
                int i9 = this.f1617b;
                if (i9 > 0) {
                    int i10 = i9 - 1;
                    this.f1617b = i10;
                    this.f1618c = i10;
                    b bVar = (b) this.f1620e;
                    return bVar.f1621a[bVar.f1622b + i10];
                }
                throw new NoSuchElementException();
            default:
                b();
                int i11 = this.f1617b;
                if (i11 > 0) {
                    int i12 = i11 - 1;
                    this.f1617b = i12;
                    this.f1618c = i12;
                    return ((c) this.f1620e).f1627a[i12];
                }
                throw new NoSuchElementException();
        }
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        switch (this.f1616a) {
            case 0:
                return this.f1617b - 1;
            default:
                return this.f1617b - 1;
        }
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final void remove() {
        int i9;
        int i10;
        switch (this.f1616a) {
            case 0:
                a();
                int i11 = this.f1618c;
                if (i11 != -1) {
                    b bVar = (b) this.f1620e;
                    bVar.c(i11);
                    this.f1617b = this.f1618c;
                    this.f1618c = -1;
                    i9 = ((AbstractList) bVar).modCount;
                    this.f1619d = i9;
                    return;
                }
                throw new IllegalStateException("Call next() or previous() before removing element from the iterator.");
            default:
                b();
                int i12 = this.f1618c;
                if (i12 != -1) {
                    c cVar = (c) this.f1620e;
                    cVar.c(i12);
                    this.f1617b = this.f1618c;
                    this.f1618c = -1;
                    i10 = ((AbstractList) cVar).modCount;
                    this.f1619d = i10;
                    return;
                }
                throw new IllegalStateException("Call next() or previous() before removing element from the iterator.");
        }
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        switch (this.f1616a) {
            case 0:
                a();
                int i9 = this.f1618c;
                if (i9 != -1) {
                    ((b) this.f1620e).set(i9, obj);
                    return;
                }
                throw new IllegalStateException("Call next() or previous() before replacing element from the iterator.");
            default:
                b();
                int i10 = this.f1618c;
                if (i10 != -1) {
                    ((c) this.f1620e).set(i10, obj);
                    return;
                }
                throw new IllegalStateException("Call next() or previous() before replacing element from the iterator.");
        }
    }

    public a(b bVar, int i9) {
        int i10;
        this.f1620e = bVar;
        this.f1617b = i9;
        i10 = ((AbstractList) bVar).modCount;
        this.f1619d = i10;
    }
}
