package f5;

import java.util.concurrent.Executor;

/* renamed from: f5.p, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ExecutorC1184p implements Executor {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17434a;

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        switch (this.f17434a) {
            case 0:
                runnable.run();
                return;
            case 1:
                new Thread(runnable).start();
                return;
            default:
                runnable.run();
                return;
        }
    }
}
