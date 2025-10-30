package androidx.datastore.preferences.protobuf;

import java.util.Iterator;
import java.util.Map;

/* loaded from: classes.dex */
public final class X implements Iterator {

    /* renamed from: a, reason: collision with root package name */
    public int f9676a = -1;

    /* renamed from: b, reason: collision with root package name */
    public boolean f9677b;

    /* renamed from: c, reason: collision with root package name */
    public Iterator f9678c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ V f9679d;

    public X(V v8) {
        this.f9679d = v8;
    }

    public final Iterator a() {
        if (this.f9678c == null) {
            this.f9678c = this.f9679d.f9669b.entrySet().iterator();
        }
        return this.f9678c;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i9 = this.f9676a + 1;
        V v8 = this.f9679d;
        if (i9 < v8.f9668a.size() || (!v8.f9669b.isEmpty() && a().hasNext())) {
            return true;
        }
        return false;
    }

    @Override // java.util.Iterator
    public final Object next() {
        this.f9677b = true;
        int i9 = this.f9676a + 1;
        this.f9676a = i9;
        V v8 = this.f9679d;
        if (i9 < v8.f9668a.size()) {
            return (Map.Entry) v8.f9668a.get(this.f9676a);
        }
        return (Map.Entry) a().next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (this.f9677b) {
            this.f9677b = false;
            int i9 = V.f9667f;
            V v8 = this.f9679d;
            v8.b();
            if (this.f9676a < v8.f9668a.size()) {
                int i10 = this.f9676a;
                this.f9676a = i10 - 1;
                v8.h(i10);
                return;
            }
            a().remove();
            return;
        }
        throw new IllegalStateException("remove() was called before next()");
    }
}
