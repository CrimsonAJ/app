package o7;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: o7.r, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1726r implements Iterator {

    /* renamed from: a, reason: collision with root package name */
    public C1728t f21710a;

    /* renamed from: b, reason: collision with root package name */
    public C1728t f21711b = null;

    /* renamed from: c, reason: collision with root package name */
    public int f21712c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ C1729u f21713d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f21714e;

    public C1726r(C1729u c1729u, int i9) {
        this.f21714e = i9;
        this.f21713d = c1729u;
        this.f21710a = c1729u.f21729c.f21720d;
        this.f21712c = c1729u.f21731e;
    }

    public final Object a() {
        return b();
    }

    public final C1728t b() {
        C1728t c1728t = this.f21710a;
        C1729u c1729u = this.f21713d;
        if (c1728t != c1729u.f21729c) {
            if (c1729u.f21731e == this.f21712c) {
                this.f21710a = c1728t.f21720d;
                this.f21711b = c1728t;
                return c1728t;
            }
            throw new ConcurrentModificationException();
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.f21710a != this.f21713d.f21729c) {
            return true;
        }
        return false;
    }

    @Override // java.util.Iterator
    public Object next() {
        switch (this.f21714e) {
            case 1:
                return b().f21722f;
            default:
                return a();
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        C1728t c1728t = this.f21711b;
        if (c1728t != null) {
            C1729u c1729u = this.f21713d;
            c1729u.c(c1728t, true);
            this.f21711b = null;
            this.f21712c = c1729u.f21731e;
            return;
        }
        throw new IllegalStateException();
    }
}
