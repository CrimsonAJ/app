package s;

import androidx.datastore.preferences.protobuf.Y;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* renamed from: s.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1935e extends C1939i implements Map {

    /* renamed from: d, reason: collision with root package name */
    public Y f22646d;

    /* renamed from: e, reason: collision with root package name */
    public C1932b f22647e;

    /* renamed from: f, reason: collision with root package name */
    public C1934d f22648f;

    public C1935e() {
        super(0);
    }

    @Override // java.util.Map
    public final Set entrySet() {
        Y y9 = this.f22646d;
        if (y9 == null) {
            Y y10 = new Y(this, 1);
            this.f22646d = y10;
            return y10;
        }
        return y9;
    }

    public final boolean j(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!super.containsKey(it.next())) {
                return false;
            }
        }
        return true;
    }

    public final boolean k(Collection collection) {
        int i9 = this.f22660c;
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            super.remove(it.next());
        }
        if (i9 != this.f22660c) {
            return true;
        }
        return false;
    }

    @Override // java.util.Map
    public final Set keySet() {
        C1932b c1932b = this.f22647e;
        if (c1932b == null) {
            C1932b c1932b2 = new C1932b(this);
            this.f22647e = c1932b2;
            return c1932b2;
        }
        return c1932b;
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        b(map.size() + this.f22660c);
        for (Map.Entry entry : map.entrySet()) {
            put(entry.getKey(), entry.getValue());
        }
    }

    @Override // java.util.Map
    public final Collection values() {
        C1934d c1934d = this.f22648f;
        if (c1934d == null) {
            C1934d c1934d2 = new C1934d(this);
            this.f22648f = c1934d2;
            return c1934d2;
        }
        return c1934d;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1935e(C1939i c1939i) {
        super(0);
        int i9 = c1939i.f22660c;
        b(this.f22660c + i9);
        if (this.f22660c != 0) {
            for (int i10 = 0; i10 < i9; i10++) {
                put(c1939i.f(i10), c1939i.i(i10));
            }
        } else if (i9 > 0) {
            B7.j.d0(0, 0, i9, c1939i.f22658a, this.f22658a);
            B7.j.e0(0, 0, i9 << 1, c1939i.f22659b, this.f22659b);
            this.f22660c = i9;
        }
    }
}
