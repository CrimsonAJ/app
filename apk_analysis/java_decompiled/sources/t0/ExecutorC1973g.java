package t0;

import android.os.Handler;
import java.util.concurrent.Executor;

/* renamed from: t0.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class ExecutorC1973g implements Executor {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Handler f22988a;

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.f22988a.post(runnable);
    }
}
