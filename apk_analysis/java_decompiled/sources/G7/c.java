package G7;

import Y7.AbstractC0480v;
import Y7.C0464h;
import d8.AbstractC1130a;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes.dex */
public abstract class c extends a {
    private final E7.i _context;
    private transient E7.d<Object> intercepted;

    public c(E7.d dVar, E7.i iVar) {
        super(dVar);
        this._context = iVar;
    }

    @Override // E7.d
    public E7.i getContext() {
        E7.i iVar = this._context;
        kotlin.jvm.internal.h.b(iVar);
        return iVar;
    }

    public final E7.d<Object> intercepted() {
        E7.d<Object> dVar;
        E7.d<Object> dVar2 = this.intercepted;
        if (dVar2 == null) {
            E7.f fVar = (E7.f) getContext().get(E7.e.f1977a);
            if (fVar != null) {
                dVar = new d8.h((AbstractC0480v) fVar, this);
            } else {
                dVar = this;
            }
            this.intercepted = dVar;
            return dVar;
        }
        return dVar2;
    }

    @Override // G7.a
    public void releaseIntercepted() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        C0464h c0464h;
        E7.d<Object> dVar = this.intercepted;
        if (dVar != null && dVar != this) {
            E7.g gVar = getContext().get(E7.e.f1977a);
            kotlin.jvm.internal.h.b(gVar);
            d8.h hVar = (d8.h) dVar;
            do {
                atomicReferenceFieldUpdater = d8.h.f16979h;
            } while (atomicReferenceFieldUpdater.get(hVar) == AbstractC1130a.f16969d);
            Object obj = atomicReferenceFieldUpdater.get(hVar);
            if (obj instanceof C0464h) {
                c0464h = (C0464h) obj;
            } else {
                c0464h = null;
            }
            if (c0464h != null) {
                c0464h.o();
            }
        }
        this.intercepted = b.f2905a;
    }

    public c(E7.d dVar) {
        this(dVar, dVar != null ? dVar.getContext() : null);
    }
}
