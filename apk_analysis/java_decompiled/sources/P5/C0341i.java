package P5;

import java.util.Comparator;
import java.util.SortedMap;
import java.util.SortedSet;

/* renamed from: P5.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0341i extends C0336d implements SortedMap {

    /* renamed from: e, reason: collision with root package name */
    public SortedSet f5975e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ O f5976f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0341i(O o9, SortedMap sortedMap) {
        super(o9, sortedMap);
        this.f5976f = o9;
    }

    public SortedSet b() {
        return new C0342j(this.f5976f, d());
    }

    @Override // P5.C0336d, java.util.AbstractMap, java.util.Map
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public SortedSet keySet() {
        SortedSet sortedSet = this.f5975e;
        if (sortedSet == null) {
            SortedSet b9 = b();
            this.f5975e = b9;
            return b9;
        }
        return sortedSet;
    }

    @Override // java.util.SortedMap
    public final Comparator comparator() {
        return d().comparator();
    }

    public SortedMap d() {
        return (SortedMap) this.f5968c;
    }

    @Override // java.util.SortedMap
    public final Object firstKey() {
        return d().firstKey();
    }

    public SortedMap headMap(Object obj) {
        return new C0341i(this.f5976f, d().headMap(obj));
    }

    @Override // java.util.SortedMap
    public final Object lastKey() {
        return d().lastKey();
    }

    public SortedMap subMap(Object obj, Object obj2) {
        return new C0341i(this.f5976f, d().subMap(obj, obj2));
    }

    public SortedMap tailMap(Object obj) {
        return new C0341i(this.f5976f, d().tailMap(obj));
    }
}
