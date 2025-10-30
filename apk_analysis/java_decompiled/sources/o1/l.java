package o1;

import android.content.Context;
import androidx.work.ListenableWorker;
import b5.RunnableC0653o0;
import java.util.UUID;
import n1.C1613j;
import p1.C1847j;

/* loaded from: classes.dex */
public final class l implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f21486a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C1847j f21487b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ m f21488c;

    public /* synthetic */ l(m mVar, C1847j c1847j, int i9) {
        this.f21486a = i9;
        this.f21488c = mVar;
        this.f21487b = c1847j;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v0, types: [S5.p, java.lang.Object, p1.j] */
    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f21486a) {
            case 0:
                this.f21487b.l(this.f21488c.f21493d.getForegroundInfoAsync());
                return;
            default:
                m mVar = this.f21488c;
                C1847j c1847j = mVar.f21490a;
                ListenableWorker listenableWorker = mVar.f21493d;
                try {
                    e1.j jVar = (e1.j) this.f21487b.get();
                    C1613j c1613j = mVar.f21492c;
                    if (jVar != null) {
                        e1.q.d().a(m.f21489g, "Updating notification for " + c1613j.f21033c, new Throwable[0]);
                        listenableWorker.setRunInForeground(true);
                        n nVar = mVar.f21494e;
                        Context context = mVar.f21491b;
                        UUID id = listenableWorker.getId();
                        nVar.getClass();
                        ?? obj = new Object();
                        nVar.f21496a.i(new RunnableC0653o0(nVar, (C1847j) obj, id, jVar, context));
                        c1847j.l(obj);
                        return;
                    }
                    throw new IllegalStateException("Worker was marked important (" + c1613j.f21033c + ") but did not provide ForegroundInfo");
                } catch (Throwable th) {
                    c1847j.k(th);
                    return;
                }
        }
    }
}
