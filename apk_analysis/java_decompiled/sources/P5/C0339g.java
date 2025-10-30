package P5;

import java.util.Iterator;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.SortedMap;
import java.util.SortedSet;

/* renamed from: P5.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0339g extends C0342j implements NavigableSet {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ O f5974d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0339g(O o9, NavigableMap navigableMap) {
        super(o9, navigableMap);
        this.f5974d = o9;
    }

    @Override // P5.C0342j
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final NavigableMap b() {
        return (NavigableMap) ((SortedMap) this.f5970a);
    }

    @Override // java.util.NavigableSet
    public final Object ceiling(Object obj) {
        return b().ceilingKey(obj);
    }

    @Override // java.util.NavigableSet
    public final Iterator descendingIterator() {
        return ((C0337e) descendingSet()).iterator();
    }

    @Override // java.util.NavigableSet
    public final NavigableSet descendingSet() {
        return new C0339g(this.f5974d, b().descendingMap());
    }

    @Override // java.util.NavigableSet
    public final Object floor(Object obj) {
        return b().floorKey(obj);
    }

    @Override // P5.C0342j, java.util.SortedSet, java.util.NavigableSet
    public final SortedSet headSet(Object obj) {
        return headSet(obj, false);
    }

    @Override // java.util.NavigableSet
    public final Object higher(Object obj) {
        return b().higherKey(obj);
    }

    @Override // java.util.NavigableSet
    public final Object lower(Object obj) {
        return b().lowerKey(obj);
    }

    @Override // java.util.NavigableSet
    public final Object pollFirst() {
        C0335c c0335c = (C0335c) iterator();
        if (c0335c.hasNext()) {
            Object next = c0335c.next();
            c0335c.remove();
            return next;
        }
        return null;
    }

    @Override // java.util.NavigableSet
    public final Object pollLast() {
        Iterator descendingIterator = descendingIterator();
        if (descendingIterator.hasNext()) {
            Object next = descendingIterator.next();
            descendingIterator.remove();
            return next;
        }
        return null;
    }

    @Override // P5.C0342j, java.util.SortedSet, java.util.NavigableSet
    public final SortedSet subSet(Object obj, Object obj2) {
        return subSet(obj, true, obj2, false);
    }

    @Override // P5.C0342j, java.util.SortedSet, java.util.NavigableSet
    public final SortedSet tailSet(Object obj) {
        return tailSet(obj, true);
    }

    @Override // java.util.NavigableSet
    public final NavigableSet headSet(Object obj, boolean z9) {
        return new C0339g(this.f5974d, b().headMap(obj, z9));
    }

    @Override // java.util.NavigableSet
    public final NavigableSet subSet(Object obj, boolean z9, Object obj2, boolean z10) {
        return new C0339g(this.f5974d, b().subMap(obj, z9, obj2, z10));
    }

    @Override // java.util.NavigableSet
    public final NavigableSet tailSet(Object obj, boolean z9) {
        return new C0339g(this.f5974d, b().tailMap(obj, z9));
    }
}
