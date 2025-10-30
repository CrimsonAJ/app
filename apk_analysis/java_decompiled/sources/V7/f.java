package V7;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public final class f implements Iterator, P7.a {

    /* renamed from: b, reason: collision with root package name */
    public final Iterator f7820b;

    /* renamed from: d, reason: collision with root package name */
    public Object f7822d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ j f7823e;

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7819a = 0;

    /* renamed from: c, reason: collision with root package name */
    public int f7821c = -1;

    public f(g gVar) {
        this.f7823e = gVar;
        this.f7820b = gVar.f7824a.iterator();
    }

    public void a() {
        Object next;
        g gVar;
        do {
            Iterator it = this.f7820b;
            if (it.hasNext()) {
                next = it.next();
                gVar = (g) this.f7823e;
            } else {
                this.f7821c = 0;
                return;
            }
        } while (((Boolean) gVar.f7826c.invoke(next)).booleanValue() != gVar.f7825b);
        this.f7822d = next;
        this.f7821c = 1;
    }

    /* JADX WARN: Type inference failed for: r1v4, types: [O7.l, kotlin.jvm.internal.i] */
    public void b() {
        Iterator it = this.f7820b;
        if (it.hasNext()) {
            Object next = it.next();
            if (((Boolean) ((kotlin.jvm.internal.i) ((i) this.f7823e).f7832b).invoke(next)).booleanValue()) {
                this.f7821c = 1;
                this.f7822d = next;
                return;
            }
        }
        this.f7821c = 0;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.f7819a) {
            case 0:
                if (this.f7821c == -1) {
                    a();
                }
                if (this.f7821c == 1) {
                    return true;
                }
                return false;
            default:
                if (this.f7821c == -1) {
                    b();
                }
                if (this.f7821c == 1) {
                    return true;
                }
                return false;
        }
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.f7819a) {
            case 0:
                if (this.f7821c == -1) {
                    a();
                }
                if (this.f7821c != 0) {
                    Object obj = this.f7822d;
                    this.f7822d = null;
                    this.f7821c = -1;
                    return obj;
                }
                throw new NoSuchElementException();
            default:
                if (this.f7821c == -1) {
                    b();
                }
                if (this.f7821c != 0) {
                    Object obj2 = this.f7822d;
                    this.f7822d = null;
                    this.f7821c = -1;
                    return obj2;
                }
                throw new NoSuchElementException();
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.f7819a) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public f(i iVar) {
        this.f7823e = iVar;
        this.f7820b = ((j) iVar.f7833c).iterator();
    }
}
