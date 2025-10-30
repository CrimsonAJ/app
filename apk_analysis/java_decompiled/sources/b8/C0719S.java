package b8;

import c8.AbstractC0792b;
import c8.AbstractC0793c;
import c8.AbstractC0794d;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: b8.S, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0719S extends AbstractC0794d {

    /* renamed from: a, reason: collision with root package name */
    public final AtomicReference f11456a = new AtomicReference(null);

    @Override // c8.AbstractC0794d
    public final boolean a(AbstractC0792b abstractC0792b) {
        AtomicReference atomicReference = this.f11456a;
        if (atomicReference.get() != null) {
            return false;
        }
        atomicReference.set(AbstractC0714M.f11442b);
        return true;
    }

    @Override // c8.AbstractC0794d
    public final E7.d[] b(AbstractC0792b abstractC0792b) {
        this.f11456a.set(null);
        return AbstractC0793c.f11751a;
    }
}
