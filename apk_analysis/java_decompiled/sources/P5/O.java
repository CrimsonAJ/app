package P5;

import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.NavigableMap;
import java.util.SortedMap;

/* loaded from: classes.dex */
public final class O extends AbstractC0347o implements Serializable {

    /* renamed from: d, reason: collision with root package name */
    public transient Map f5920d;

    /* renamed from: e, reason: collision with root package name */
    public transient int f5921e;

    /* renamed from: f, reason: collision with root package name */
    public transient N f5922f;

    @Override // P5.AbstractC0347o
    public final Map a() {
        Map c0336d;
        Map map = this.f5989c;
        if (map == null) {
            Map map2 = this.f5920d;
            if (map2 instanceof NavigableMap) {
                c0336d = new C0338f(this, (NavigableMap) map2);
            } else if (map2 instanceof SortedMap) {
                c0336d = new C0341i(this, (SortedMap) map2);
            } else {
                c0336d = new C0336d(this, map2);
            }
            this.f5989c = c0336d;
            return c0336d;
        }
        return map;
    }

    public final void c() {
        Map map = this.f5920d;
        Iterator it = map.values().iterator();
        while (it.hasNext()) {
            ((Collection) it.next()).clear();
        }
        map.clear();
        this.f5921e = 0;
    }
}
