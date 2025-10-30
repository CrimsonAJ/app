package C0;

import java.util.concurrent.Executor;
import q.C1866a;

/* loaded from: classes.dex */
public final /* synthetic */ class e implements Executor {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1149a;

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        switch (this.f1149a) {
            case 0:
                runnable.run();
                return;
            default:
                C1866a.f0().f22228m.f22232n.execute(runnable);
                return;
        }
    }
}
