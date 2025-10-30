package i0;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: i0.o, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1359o extends f.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AtomicReference f18359a;

    public C1359o(AtomicReference atomicReference) {
        this.f18359a = atomicReference;
    }

    @Override // f.c
    public final void a(Object obj) {
        f.c cVar = (f.c) this.f18359a.get();
        if (cVar != null) {
            cVar.a(obj);
            return;
        }
        throw new IllegalStateException("Operation cannot be started before fragment is in created state");
    }
}
