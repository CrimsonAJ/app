package androidx.datastore.preferences.protobuf;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;
import s.C1933c;
import s.C1935e;

/* loaded from: classes.dex */
public class Y extends AbstractSet {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9680a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Map f9681b;

    public /* synthetic */ Y(Map map, int i9) {
        this.f9680a = i9;
        this.f9681b = map;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean add(Object obj) {
        switch (this.f9680a) {
            case 0:
                Map.Entry entry = (Map.Entry) obj;
                if (!contains(entry)) {
                    ((V) this.f9681b).put((Comparable) entry.getKey(), entry.getValue());
                    return true;
                }
                return false;
            default:
                return super.add(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public void clear() {
        switch (this.f9680a) {
            case 0:
                ((V) this.f9681b).clear();
                return;
            default:
                super.clear();
                return;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(Object obj) {
        switch (this.f9680a) {
            case 0:
                Map.Entry entry = (Map.Entry) obj;
                Object obj2 = ((V) this.f9681b).get(entry.getKey());
                Object value = entry.getValue();
                if (obj2 != value && (obj2 == null || !obj2.equals(value))) {
                    return false;
                }
                return true;
            default:
                return super.contains(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public Iterator iterator() {
        switch (this.f9680a) {
            case 0:
                return new X((V) this.f9681b);
            default:
                return new C1933c((C1935e) this.f9681b);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean remove(Object obj) {
        switch (this.f9680a) {
            case 0:
                Map.Entry entry = (Map.Entry) obj;
                if (contains(entry)) {
                    ((V) this.f9681b).remove(entry.getKey());
                    return true;
                }
                return false;
            default:
                return super.remove(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        switch (this.f9680a) {
            case 0:
                return ((V) this.f9681b).size();
            default:
                return ((C1935e) this.f9681b).f22660c;
        }
    }
}
