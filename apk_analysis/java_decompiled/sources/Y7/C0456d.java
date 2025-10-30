package Y7;

import java.util.concurrent.locks.LockSupport;

/* renamed from: Y7.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0456d extends AbstractC0450a {

    /* renamed from: d, reason: collision with root package name */
    public final Thread f8802d;

    /* renamed from: e, reason: collision with root package name */
    public final V f8803e;

    public C0456d(E7.i iVar, Thread thread, V v8) {
        super(iVar, true);
        this.f8802d = thread;
        this.f8803e = v8;
    }

    @Override // Y7.r0
    public final void m(Object obj) {
        Thread currentThread = Thread.currentThread();
        Thread thread = this.f8802d;
        if (!kotlin.jvm.internal.h.a(currentThread, thread)) {
            LockSupport.unpark(thread);
        }
    }
}
