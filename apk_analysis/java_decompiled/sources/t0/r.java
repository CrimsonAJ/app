package t0;

import f5.C1183o;
import java.util.ArrayList;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public abstract class r extends AbstractC1984s {

    /* renamed from: a, reason: collision with root package name */
    public final Object f23028a = new Object();

    /* renamed from: b, reason: collision with root package name */
    public Executor f23029b;

    /* renamed from: c, reason: collision with root package name */
    public C1183o f23030c;

    /* renamed from: d, reason: collision with root package name */
    public C1980n f23031d;

    /* renamed from: e, reason: collision with root package name */
    public ArrayList f23032e;

    public String j() {
        return null;
    }

    public String k() {
        return null;
    }

    public final void l(C1980n c1980n, ArrayList arrayList) {
        if (c1980n != null) {
            synchronized (this.f23028a) {
                try {
                    try {
                        Executor executor = this.f23029b;
                        if (executor != null) {
                            executor.execute(new RunnableC1982p(this, this.f23030c, c1980n, arrayList, 0));
                        } else {
                            this.f23031d = c1980n;
                            this.f23032e = new ArrayList(arrayList);
                        }
                        return;
                    } catch (Throwable th) {
                        th = th;
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    throw th;
                }
            }
        }
        throw new NullPointerException("groupRoute must not be null");
    }

    public abstract void m(String str);

    public abstract void n(String str);

    public abstract void o(ArrayList arrayList);
}
