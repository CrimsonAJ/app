package P5;

import java.util.Comparator;
import java.util.SortedMap;
import java.util.SortedSet;

/* renamed from: P5.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0342j extends C0337e implements SortedSet {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ O f5977c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0342j(O o9, SortedMap sortedMap) {
        super(o9, sortedMap);
        this.f5977c = o9;
    }

    public SortedMap b() {
        return (SortedMap) this.f5970a;
    }

    @Override // java.util.SortedSet
    public final Comparator comparator() {
        return b().comparator();
    }

    @Override // java.util.SortedSet
    public final Object first() {
        return b().firstKey();
    }

    public SortedSet headSet(Object obj) {
        return new C0342j(this.f5977c, b().headMap(obj));
    }

    @Override // java.util.SortedSet
    public final Object last() {
        return b().lastKey();
    }

    public SortedSet subSet(Object obj, Object obj2) {
        return new C0342j(this.f5977c, b().subMap(obj, obj2));
    }

    public SortedSet tailSet(Object obj) {
        return new C0342j(this.f5977c, b().tailMap(obj));
    }
}
