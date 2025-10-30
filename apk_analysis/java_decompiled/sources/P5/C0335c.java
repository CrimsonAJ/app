package P5;

import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;

/* renamed from: P5.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0335c implements Iterator {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5962a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final Iterator f5963b;

    /* renamed from: c, reason: collision with root package name */
    public Object f5964c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f5965d;

    public C0335c(C0344l c0344l) {
        Iterator it;
        this.f5965d = c0344l;
        Collection collection = c0344l.f5980b;
        this.f5964c = collection;
        if (collection instanceof List) {
            it = ((List) collection).listIterator();
        } else {
            it = collection.iterator();
        }
        this.f5963b = it;
    }

    public void a() {
        C0344l c0344l = (C0344l) this.f5965d;
        c0344l.c();
        if (c0344l.f5980b == ((Collection) this.f5964c)) {
        } else {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.f5962a) {
            case 0:
                return this.f5963b.hasNext();
            case 1:
                return this.f5963b.hasNext();
            default:
                a();
                return this.f5963b.hasNext();
        }
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.f5962a) {
            case 0:
                Map.Entry entry = (Map.Entry) this.f5963b.next();
                this.f5964c = (Collection) entry.getValue();
                return ((C0336d) this.f5965d).a(entry);
            case 1:
                Map.Entry entry2 = (Map.Entry) this.f5963b.next();
                this.f5964c = entry2;
                return entry2.getKey();
            default:
                a();
                return this.f5963b.next();
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        boolean z9;
        boolean z10;
        switch (this.f5962a) {
            case 0:
                if (((Collection) this.f5964c) != null) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                O4.h.j("no calls to next() since the last call to remove()", z9);
                this.f5963b.remove();
                ((C0336d) this.f5965d).f5969d.f5921e -= ((Collection) this.f5964c).size();
                ((Collection) this.f5964c).clear();
                this.f5964c = null;
                return;
            case 1:
                if (((Map.Entry) this.f5964c) != null) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                O4.h.j("no calls to next() since the last call to remove()", z10);
                Collection collection = (Collection) ((Map.Entry) this.f5964c).getValue();
                this.f5963b.remove();
                ((C0337e) this.f5965d).f5971b.f5921e -= collection.size();
                collection.clear();
                this.f5964c = null;
                return;
            default:
                this.f5963b.remove();
                C0344l c0344l = (C0344l) this.f5965d;
                O o9 = c0344l.f5983e;
                o9.f5921e--;
                c0344l.d();
                return;
        }
    }

    public C0335c(C0344l c0344l, ListIterator listIterator) {
        this.f5965d = c0344l;
        this.f5964c = c0344l.f5980b;
        this.f5963b = listIterator;
    }

    public C0335c(C0337e c0337e, Iterator it) {
        this.f5965d = c0337e;
        this.f5963b = it;
    }

    public C0335c(C0336d c0336d) {
        this.f5965d = c0336d;
        this.f5963b = c0336d.f5968c.entrySet().iterator();
    }
}
