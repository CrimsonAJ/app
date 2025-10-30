package P5;

import java.util.Comparator;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.SortedSet;

/* loaded from: classes.dex */
public final class c0 extends b0 implements SortedSet {
    @Override // java.util.SortedSet
    public final Comparator comparator() {
        return ((SortedSet) this.f5960a).comparator();
    }

    @Override // java.util.SortedSet
    public final Object first() {
        Iterator it = this.f5960a.iterator();
        it.getClass();
        O5.j jVar = this.f5961b;
        jVar.getClass();
        while (it.hasNext()) {
            Object next = it.next();
            if (jVar.apply(next)) {
                return next;
            }
        }
        throw new NoSuchElementException();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.SortedSet, P5.b0] */
    @Override // java.util.SortedSet
    public final SortedSet headSet(Object obj) {
        return new b0(((SortedSet) this.f5960a).headSet(obj), this.f5961b);
    }

    @Override // java.util.SortedSet
    public final Object last() {
        SortedSet sortedSet = (SortedSet) this.f5960a;
        while (true) {
            Object last = sortedSet.last();
            if (this.f5961b.apply(last)) {
                return last;
            }
            sortedSet = sortedSet.headSet(last);
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.SortedSet, P5.b0] */
    @Override // java.util.SortedSet
    public final SortedSet subSet(Object obj, Object obj2) {
        return new b0(((SortedSet) this.f5960a).subSet(obj, obj2), this.f5961b);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.SortedSet, P5.b0] */
    @Override // java.util.SortedSet
    public final SortedSet tailSet(Object obj) {
        return new b0(((SortedSet) this.f5960a).tailSet(obj), this.f5961b);
    }
}
