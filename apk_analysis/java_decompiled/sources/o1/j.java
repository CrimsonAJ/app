package o1;

import androidx.work.impl.WorkDatabase;
import f1.C1160b;

/* loaded from: classes.dex */
public final class j implements Runnable {

    /* renamed from: d, reason: collision with root package name */
    public static final String f21480d = e1.q.j("StopWorkRunnable");

    /* renamed from: a, reason: collision with root package name */
    public final f1.k f21481a;

    /* renamed from: b, reason: collision with root package name */
    public final String f21482b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f21483c;

    public j(f1.k kVar, String str, boolean z9) {
        this.f21481a = kVar;
        this.f21482b = str;
        this.f21483c = z9;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean containsKey;
        boolean k5;
        f1.k kVar = this.f21481a;
        WorkDatabase workDatabase = kVar.j;
        C1160b c1160b = kVar.f17303m;
        G6.e v8 = workDatabase.v();
        workDatabase.c();
        try {
            String str = this.f21482b;
            synchronized (c1160b.f17273k) {
                containsKey = c1160b.f17269f.containsKey(str);
            }
            if (this.f21483c) {
                k5 = this.f21481a.f17303m.j(this.f21482b);
            } else {
                if (!containsKey && v8.j(this.f21482b) == 2) {
                    v8.r(1, this.f21482b);
                }
                k5 = this.f21481a.f17303m.k(this.f21482b);
            }
            e1.q.d().a(f21480d, "StopWorkRunnable for " + this.f21482b + "; Processor.stopWork = " + k5, new Throwable[0]);
            workDatabase.p();
            workDatabase.m();
        } catch (Throwable th) {
            workDatabase.m();
            throw th;
        }
    }
}
