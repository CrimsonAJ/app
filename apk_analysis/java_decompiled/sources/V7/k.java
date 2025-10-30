package V7;

import a.AbstractC0485a;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public final class k implements Iterator, E7.d, P7.a {

    /* renamed from: a, reason: collision with root package name */
    public int f7834a;

    /* renamed from: b, reason: collision with root package name */
    public Object f7835b;

    /* renamed from: c, reason: collision with root package name */
    public Iterator f7836c;

    /* renamed from: d, reason: collision with root package name */
    public E7.d f7837d;

    public final RuntimeException a() {
        int i9 = this.f7834a;
        if (i9 != 4) {
            if (i9 != 5) {
                return new IllegalStateException("Unexpected state of the iterator: " + this.f7834a);
            }
            return new IllegalStateException("Iterator has failed.");
        }
        return new NoSuchElementException();
    }

    public final void d(Object obj, G7.i iVar) {
        this.f7835b = obj;
        this.f7834a = 3;
        this.f7837d = iVar;
    }

    @Override // E7.d
    public final E7.i getContext() {
        return E7.j.f1978a;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        while (true) {
            int i9 = this.f7834a;
            if (i9 != 0) {
                if (i9 != 1) {
                    if (i9 == 2 || i9 == 3) {
                        return true;
                    }
                    if (i9 == 4) {
                        return false;
                    }
                    throw a();
                }
                Iterator it = this.f7836c;
                kotlin.jvm.internal.h.b(it);
                if (it.hasNext()) {
                    this.f7834a = 2;
                    return true;
                }
                this.f7836c = null;
            }
            this.f7834a = 5;
            E7.d dVar = this.f7837d;
            kotlin.jvm.internal.h.b(dVar);
            this.f7837d = null;
            dVar.resumeWith(A7.n.f558a);
        }
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i9 = this.f7834a;
        if (i9 != 0 && i9 != 1) {
            if (i9 != 2) {
                if (i9 == 3) {
                    this.f7834a = 0;
                    Object obj = this.f7835b;
                    this.f7835b = null;
                    return obj;
                }
                throw a();
            }
            this.f7834a = 1;
            Iterator it = this.f7836c;
            kotlin.jvm.internal.h.b(it);
            return it.next();
        }
        if (hasNext()) {
            return next();
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // E7.d
    public final void resumeWith(Object obj) {
        AbstractC0485a.A(obj);
        this.f7834a = 4;
    }
}
