package o1;

import h1.C1266e;
import java.util.HashMap;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class s {

    /* renamed from: e, reason: collision with root package name */
    public static final String f21505e = e1.q.j("WorkTimer");

    /* renamed from: a, reason: collision with root package name */
    public final ScheduledExecutorService f21506a;

    /* renamed from: b, reason: collision with root package name */
    public final HashMap f21507b;

    /* renamed from: c, reason: collision with root package name */
    public final HashMap f21508c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f21509d;

    /* JADX WARN: Type inference failed for: r0v0, types: [o1.p, java.lang.Object, java.util.concurrent.ThreadFactory] */
    public s() {
        ?? obj = new Object();
        obj.f21502a = 0;
        this.f21507b = new HashMap();
        this.f21508c = new HashMap();
        this.f21509d = new Object();
        this.f21506a = Executors.newSingleThreadScheduledExecutor(obj);
    }

    public final void a(String str, C1266e c1266e) {
        synchronized (this.f21509d) {
            e1.q.d().a(f21505e, "Starting timer for " + str, new Throwable[0]);
            b(str);
            r rVar = new r(this, str);
            this.f21507b.put(str, rVar);
            this.f21508c.put(str, c1266e);
            this.f21506a.schedule(rVar, 600000L, TimeUnit.MILLISECONDS);
        }
    }

    public final void b(String str) {
        synchronized (this.f21509d) {
            try {
                if (((r) this.f21507b.remove(str)) != null) {
                    e1.q.d().a(f21505e, "Stopping timer for " + str, new Throwable[0]);
                    this.f21508c.remove(str);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
