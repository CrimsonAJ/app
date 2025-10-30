package P5;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;

/* renamed from: P5.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0333a implements Iterator {

    /* renamed from: a, reason: collision with root package name */
    public final Iterator f5952a;

    /* renamed from: b, reason: collision with root package name */
    public Object f5953b = null;

    /* renamed from: c, reason: collision with root package name */
    public Collection f5954c = null;

    /* renamed from: d, reason: collision with root package name */
    public Iterator f5955d = L.f5915a;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ O f5956e;

    public C0333a(O o9) {
        this.f5956e = o9;
        this.f5952a = o9.f5920d.entrySet().iterator();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (!this.f5952a.hasNext() && !this.f5955d.hasNext()) {
            return false;
        }
        return true;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!this.f5955d.hasNext()) {
            Map.Entry entry = (Map.Entry) this.f5952a.next();
            this.f5953b = entry.getKey();
            Collection collection = (Collection) entry.getValue();
            this.f5954c = collection;
            this.f5955d = collection.iterator();
        }
        return this.f5955d.next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        this.f5955d.remove();
        Collection collection = this.f5954c;
        Objects.requireNonNull(collection);
        if (collection.isEmpty()) {
            this.f5952a.remove();
        }
        O o9 = this.f5956e;
        o9.f5921e--;
    }
}
