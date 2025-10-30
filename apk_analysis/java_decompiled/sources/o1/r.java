package o1;

import h1.C1266e;

/* loaded from: classes.dex */
public final class r implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final s f21503a;

    /* renamed from: b, reason: collision with root package name */
    public final String f21504b;

    public r(s sVar, String str) {
        this.f21503a = sVar;
        this.f21504b = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.f21503a.f21509d) {
            try {
                if (((r) this.f21503a.f21507b.remove(this.f21504b)) != null) {
                    q qVar = (q) this.f21503a.f21508c.remove(this.f21504b);
                    if (qVar != null) {
                        String str = this.f21504b;
                        e1.q.d().a(C1266e.j, "Exceeded time limits on execution for " + str, new Throwable[0]);
                        ((C1266e) qVar).f();
                    }
                } else {
                    e1.q.d().a("WrkTimerRunnable", "Timer with " + this.f21504b + " is already marked as complete.", new Throwable[0]);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
