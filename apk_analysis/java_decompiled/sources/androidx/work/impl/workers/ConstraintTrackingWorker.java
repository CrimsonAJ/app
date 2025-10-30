package androidx.work.impl.workers;

import S5.p;
import android.content.Context;
import androidx.work.ListenableWorker;
import androidx.work.WorkerParameters;
import e1.q;
import f1.k;
import j1.InterfaceC1432b;
import java.util.ArrayList;
import java.util.List;
import m5.c;
import p1.C1847j;
import q1.InterfaceC1871a;

/* loaded from: classes.dex */
public class ConstraintTrackingWorker extends ListenableWorker implements InterfaceC1432b {

    /* renamed from: m, reason: collision with root package name */
    public static final String f10447m = q.j("ConstraintTrkngWrkr");

    /* renamed from: h, reason: collision with root package name */
    public final WorkerParameters f10448h;

    /* renamed from: i, reason: collision with root package name */
    public final Object f10449i;
    public volatile boolean j;

    /* renamed from: k, reason: collision with root package name */
    public final C1847j f10450k;

    /* renamed from: l, reason: collision with root package name */
    public ListenableWorker f10451l;

    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, p1.j] */
    public ConstraintTrackingWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        this.f10448h = workerParameters;
        this.f10449i = new Object();
        this.j = false;
        this.f10450k = new Object();
    }

    @Override // j1.InterfaceC1432b
    public final void c(ArrayList arrayList) {
        q.d().a(f10447m, String.format("Constraints changed for %s", arrayList), new Throwable[0]);
        synchronized (this.f10449i) {
            this.j = true;
        }
    }

    @Override // j1.InterfaceC1432b
    public final void e(List list) {
    }

    @Override // androidx.work.ListenableWorker
    public final InterfaceC1871a getTaskExecutor() {
        return k.b0(getApplicationContext()).f17301k;
    }

    @Override // androidx.work.ListenableWorker
    public final boolean isRunInForeground() {
        ListenableWorker listenableWorker = this.f10451l;
        if (listenableWorker != null && listenableWorker.isRunInForeground()) {
            return true;
        }
        return false;
    }

    @Override // androidx.work.ListenableWorker
    public final void onStopped() {
        ListenableWorker listenableWorker = this.f10451l;
        if (listenableWorker != null && !listenableWorker.isStopped()) {
            this.f10451l.stop();
        }
    }

    @Override // androidx.work.ListenableWorker
    public final p startWork() {
        getBackgroundExecutor().execute(new c(5, this));
        return this.f10450k;
    }
}
