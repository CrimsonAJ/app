package P5;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public final class r implements Iterator {

    /* renamed from: a, reason: collision with root package name */
    public int f5990a;

    /* renamed from: b, reason: collision with root package name */
    public int f5991b;

    /* renamed from: c, reason: collision with root package name */
    public int f5992c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ C0352u f5993d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f5994e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ C0352u f5995f;

    public r(C0352u c0352u, int i9) {
        int i10;
        this.f5994e = i9;
        this.f5995f = c0352u;
        this.f5993d = c0352u;
        this.f5990a = c0352u.f6005e;
        if (c0352u.isEmpty()) {
            i10 = -1;
        } else {
            i10 = 0;
        }
        this.f5991b = i10;
        this.f5992c = -1;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.f5991b >= 0) {
            return true;
        }
        return false;
    }

    @Override // java.util.Iterator
    public final Object next() {
        Object obj;
        C0352u c0352u = this.f5993d;
        if (c0352u.f6005e == this.f5990a) {
            if (hasNext()) {
                int i9 = this.f5991b;
                this.f5992c = i9;
                switch (this.f5994e) {
                    case 0:
                        obj = this.f5995f.j()[i9];
                        break;
                    case 1:
                        obj = new C0351t(this.f5995f, i9);
                        break;
                    default:
                        obj = this.f5995f.k()[i9];
                        break;
                }
                int i10 = this.f5991b + 1;
                if (i10 >= c0352u.f6006f) {
                    i10 = -1;
                }
                this.f5991b = i10;
                return obj;
            }
            throw new NoSuchElementException();
        }
        throw new ConcurrentModificationException();
    }

    @Override // java.util.Iterator
    public final void remove() {
        boolean z9;
        C0352u c0352u = this.f5993d;
        if (c0352u.f6005e == this.f5990a) {
            if (this.f5992c >= 0) {
                z9 = true;
            } else {
                z9 = false;
            }
            O4.h.j("no calls to next() since the last call to remove()", z9);
            this.f5990a += 32;
            c0352u.remove(c0352u.j()[this.f5992c]);
            this.f5991b--;
            this.f5992c = -1;
            return;
        }
        throw new ConcurrentModificationException();
    }
}
