package s;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: s.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1931a implements Iterator, P7.a {

    /* renamed from: a, reason: collision with root package name */
    public int f22635a;

    /* renamed from: b, reason: collision with root package name */
    public int f22636b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f22637c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f22638d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f22639e;

    public C1931a(int i9) {
        this.f22635a = i9;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.f22636b < this.f22635a) {
            return true;
        }
        return false;
    }

    @Override // java.util.Iterator
    public final Object next() {
        Object f9;
        if (hasNext()) {
            int i9 = this.f22636b;
            switch (this.f22638d) {
                case 0:
                    f9 = ((C1935e) this.f22639e).f(i9);
                    break;
                case 1:
                    f9 = ((C1935e) this.f22639e).i(i9);
                    break;
                default:
                    f9 = ((C1936f) this.f22639e).f22650b[i9];
                    break;
            }
            this.f22636b++;
            this.f22637c = true;
            return f9;
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (this.f22637c) {
            int i9 = this.f22636b - 1;
            this.f22636b = i9;
            switch (this.f22638d) {
                case 0:
                    ((C1935e) this.f22639e).g(i9);
                    break;
                case 1:
                    ((C1935e) this.f22639e).g(i9);
                    break;
                default:
                    ((C1936f) this.f22639e).b(i9);
                    break;
            }
            this.f22635a--;
            this.f22637c = false;
            return;
        }
        throw new IllegalStateException("Call next() before removing an element.");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C1931a(C1936f c1936f) {
        this(c1936f.f22651c);
        this.f22638d = 2;
        this.f22639e = c1936f;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C1931a(C1935e c1935e, int i9) {
        this(c1935e.f22660c);
        this.f22638d = i9;
        switch (i9) {
            case 1:
                this.f22639e = c1935e;
                this(c1935e.f22660c);
                return;
            default:
                this.f22639e = c1935e;
                return;
        }
    }
}
