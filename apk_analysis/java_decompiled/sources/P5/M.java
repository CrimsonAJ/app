package P5;

import b5.C0663s;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes.dex */
public final class M implements Iterator {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5917a = 1;

    /* renamed from: b, reason: collision with root package name */
    public final Iterator f5918b;

    public M(C0663s c0663s) {
        this.f5918b = c0663s.f11300a.keySet().iterator();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.f5917a) {
            case 0:
                return this.f5918b.hasNext();
            default:
                return this.f5918b.hasNext();
        }
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.f5917a) {
            case 0:
                return ((Map.Entry) this.f5918b.next()).getValue();
            default:
                return (String) this.f5918b.next();
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.f5917a) {
            case 0:
                this.f5918b.remove();
                return;
            default:
                throw new UnsupportedOperationException("Remove not supported");
        }
    }

    public M(Iterator it) {
        it.getClass();
        this.f5918b = it;
    }
}
