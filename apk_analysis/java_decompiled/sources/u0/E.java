package u0;

import java.util.Iterator;
import java.util.NoSuchElementException;
import s.AbstractC1938h;
import s.C1940j;

/* loaded from: classes.dex */
public final class E implements Iterator, P7.a {

    /* renamed from: a, reason: collision with root package name */
    public int f23383a = -1;

    /* renamed from: b, reason: collision with root package name */
    public boolean f23384b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ F f23385c;

    public E(F f9) {
        this.f23385c = f9;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.f23383a + 1 < this.f23385c.f23387k.i()) {
            return true;
        }
        return false;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (hasNext()) {
            this.f23384b = true;
            C1940j c1940j = this.f23385c.f23387k;
            int i9 = this.f23383a + 1;
            this.f23383a = i9;
            return (C) c1940j.j(i9);
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (this.f23384b) {
            F f9 = this.f23385c;
            int i9 = this.f23383a;
            C1940j c1940j = f9.f23387k;
            ((C) c1940j.j(i9)).f23375b = null;
            int i10 = this.f23383a;
            Object[] objArr = c1940j.f22663c;
            Object obj = objArr[i10];
            Object obj2 = AbstractC1938h.f22657b;
            if (obj != obj2) {
                objArr[i10] = obj2;
                c1940j.f22661a = true;
            }
            this.f23383a = i10 - 1;
            this.f23384b = false;
            return;
        }
        throw new IllegalStateException("You must call next() before you can remove an element");
    }
}
