package Y7;

import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class J implements Executor {

    /* renamed from: a, reason: collision with root package name */
    public final AbstractC0480v f8770a;

    public J(AbstractC0480v abstractC0480v) {
        this.f8770a = abstractC0480v;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        E7.j jVar = E7.j.f1978a;
        AbstractC0480v abstractC0480v = this.f8770a;
        if (abstractC0480v.i0()) {
            abstractC0480v.g0(jVar, runnable);
        } else {
            runnable.run();
        }
    }

    public final String toString() {
        return this.f8770a.toString();
    }
}
