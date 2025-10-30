package androidx.work;

import S5.p;
import android.annotation.SuppressLint;
import android.content.Context;
import android.net.Network;
import android.net.Uri;
import androidx.annotation.Keep;
import b5.RunnableC0653o0;
import b5.RunnableC0659q0;
import e1.h;
import e1.j;
import e1.z;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.Executor;
import o1.n;
import o1.o;
import p1.C1847j;
import q1.InterfaceC1871a;

/* loaded from: classes.dex */
public abstract class ListenableWorker {
    private Context mAppContext;
    private boolean mRunInForeground;
    private volatile boolean mStopped;
    private boolean mUsed;
    private WorkerParameters mWorkerParams;

    @Keep
    @SuppressLint({"BanKeepAnnotation"})
    public ListenableWorker(Context context, WorkerParameters workerParameters) {
        if (context != null) {
            if (workerParameters != null) {
                this.mAppContext = context;
                this.mWorkerParams = workerParameters;
                return;
            }
            throw new IllegalArgumentException("WorkerParameters is null");
        }
        throw new IllegalArgumentException("Application Context is null");
    }

    public final Context getApplicationContext() {
        return this.mAppContext;
    }

    public Executor getBackgroundExecutor() {
        return this.mWorkerParams.f10418f;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [S5.p, java.lang.Object, p1.j] */
    public p getForegroundInfoAsync() {
        ?? obj = new Object();
        obj.k(new IllegalStateException("Expedited WorkRequests require a ListenableWorker to provide an implementation for `getForegroundInfoAsync()`"));
        return obj;
    }

    public final UUID getId() {
        return this.mWorkerParams.f10413a;
    }

    public final h getInputData() {
        return this.mWorkerParams.f10414b;
    }

    public final Network getNetwork() {
        return (Network) this.mWorkerParams.f10416d.f10719d;
    }

    public final int getRunAttemptCount() {
        return this.mWorkerParams.f10417e;
    }

    public final Set<String> getTags() {
        return this.mWorkerParams.f10415c;
    }

    public InterfaceC1871a getTaskExecutor() {
        return this.mWorkerParams.f10419g;
    }

    public final List<String> getTriggeredContentAuthorities() {
        return (List) this.mWorkerParams.f10416d.f10717b;
    }

    public final List<Uri> getTriggeredContentUris() {
        return (List) this.mWorkerParams.f10416d.f10718c;
    }

    public z getWorkerFactory() {
        return this.mWorkerParams.f10420h;
    }

    public boolean isRunInForeground() {
        return this.mRunInForeground;
    }

    public final boolean isStopped() {
        return this.mStopped;
    }

    public final boolean isUsed() {
        return this.mUsed;
    }

    public void onStopped() {
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [S5.p, java.lang.Object, p1.j] */
    public final p setForegroundAsync(j jVar) {
        this.mRunInForeground = true;
        n nVar = this.mWorkerParams.j;
        Context applicationContext = getApplicationContext();
        UUID id = getId();
        nVar.getClass();
        ?? obj = new Object();
        nVar.f21496a.i(new RunnableC0653o0(nVar, (C1847j) obj, id, jVar, applicationContext));
        return obj;
    }

    /* JADX WARN: Type inference failed for: r5v0, types: [S5.p, java.lang.Object] */
    public p setProgressAsync(h hVar) {
        o oVar = this.mWorkerParams.f10421i;
        getApplicationContext();
        UUID id = getId();
        oVar.getClass();
        ?? obj = new Object();
        oVar.f21501b.i(new RunnableC0659q0(oVar, id, hVar, (Object) obj, 10));
        return obj;
    }

    public void setRunInForeground(boolean z9) {
        this.mRunInForeground = z9;
    }

    public final void setUsed() {
        this.mUsed = true;
    }

    public abstract p startWork();

    public final void stop() {
        this.mStopped = true;
        onStopped();
    }
}
