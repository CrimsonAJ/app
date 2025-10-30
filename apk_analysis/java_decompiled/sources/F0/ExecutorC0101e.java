package F0;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;

/* renamed from: F0.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ExecutorC0101e implements Executor {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2092a;

    /* renamed from: b, reason: collision with root package name */
    public final Handler f2093b;

    public /* synthetic */ ExecutorC0101e(Handler handler, int i9) {
        this.f2092a = i9;
        this.f2093b = handler;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        switch (this.f2092a) {
            case 0:
                this.f2093b.post(runnable);
                return;
            case 1:
                runnable.getClass();
                Handler handler = this.f2093b;
                if (handler.post(runnable)) {
                    return;
                }
                throw new RejectedExecutionException(handler + " is shutting down");
            case 2:
                runnable.getClass();
                Handler handler2 = this.f2093b;
                if (handler2.post(runnable)) {
                    return;
                }
                throw new RejectedExecutionException(handler2 + " is shutting down");
            default:
                this.f2093b.post(runnable);
                return;
        }
    }

    public ExecutorC0101e(int i9) {
        this.f2092a = i9;
        switch (i9) {
            case 3:
                this.f2093b = new Handler(Looper.getMainLooper());
                return;
            default:
                this.f2093b = new Handler(Looper.getMainLooper());
                return;
        }
    }
}
