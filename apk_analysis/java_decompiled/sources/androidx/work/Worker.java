package androidx.work;

import A4.e;
import S5.p;
import android.annotation.SuppressLint;
import android.content.Context;
import androidx.annotation.Keep;
import e1.o;
import p1.C1847j;

/* loaded from: classes.dex */
public abstract class Worker extends ListenableWorker {

    /* renamed from: h, reason: collision with root package name */
    public C1847j f10412h;

    @Keep
    @SuppressLint({"BanKeepAnnotation"})
    public Worker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
    }

    public abstract o b();

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, p1.j] */
    @Override // androidx.work.ListenableWorker
    public final p startWork() {
        this.f10412h = new Object();
        getBackgroundExecutor().execute(new e(22, this));
        return this.f10412h;
    }
}
