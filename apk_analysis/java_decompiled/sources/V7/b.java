package V7;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public final class b implements Iterator, P7.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7813a = 0;

    /* renamed from: b, reason: collision with root package name */
    public int f7814b;

    /* renamed from: c, reason: collision with root package name */
    public final Iterator f7815c;

    public b(p pVar) {
        pVar.getClass();
        this.f7814b = 15;
        this.f7815c = pVar.f7842a.iterator();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        Iterator it;
        switch (this.f7813a) {
            case 0:
                break;
            default:
                if (this.f7814b > 0 && this.f7815c.hasNext()) {
                    return true;
                }
                return false;
        }
        while (true) {
            int i9 = this.f7814b;
            it = this.f7815c;
            if (i9 > 0 && it.hasNext()) {
                it.next();
                this.f7814b--;
            }
        }
        return it.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        Iterator it;
        switch (this.f7813a) {
            case 0:
                break;
            default:
                int i9 = this.f7814b;
                if (i9 != 0) {
                    this.f7814b = i9 - 1;
                    return this.f7815c.next();
                }
                throw new NoSuchElementException();
        }
        while (true) {
            int i10 = this.f7814b;
            it = this.f7815c;
            if (i10 > 0 && it.hasNext()) {
                it.next();
                this.f7814b--;
            }
        }
        return it.next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.f7813a) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public b(c cVar) {
        this.f7815c = cVar.f7816a.iterator();
        this.f7814b = cVar.f7817b;
    }
}
