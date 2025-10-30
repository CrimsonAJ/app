package V7;

import B7.r;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class a implements j {

    /* renamed from: a, reason: collision with root package name */
    public final AtomicReference f7812a;

    public a(r rVar) {
        this.f7812a = new AtomicReference(rVar);
    }

    @Override // V7.j
    public final Iterator iterator() {
        j jVar = (j) this.f7812a.getAndSet(null);
        if (jVar != null) {
            return jVar.iterator();
        }
        throw new IllegalStateException("This sequence can be consumed only once.");
    }
}
