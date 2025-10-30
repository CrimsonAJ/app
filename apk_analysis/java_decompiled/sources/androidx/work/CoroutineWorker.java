package androidx.work;

import A4.e;
import A7.n;
import C0.b;
import E7.d;
import F7.a;
import S5.p;
import Y7.AbstractC0480v;
import Y7.B;
import Y7.C0464h;
import Y7.InterfaceC0474o;
import Y7.K;
import Y7.k0;
import android.content.Context;
import b5.G1;
import com.google.android.gms.internal.measurement.D1;
import d2.v;
import e1.f;
import e1.g;
import e1.j;
import e1.l;
import java.util.concurrent.ExecutionException;
import kotlin.jvm.internal.h;
import o1.i;
import p1.C1847j;

/* loaded from: classes.dex */
public abstract class CoroutineWorker extends ListenableWorker {
    private final AbstractC0480v coroutineContext;
    private final C1847j future;
    private final InterfaceC0474o job;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r2v2, types: [p1.h, java.lang.Object, p1.j] */
    public CoroutineWorker(Context appContext, WorkerParameters params) {
        super(appContext, params);
        h.e(appContext, "appContext");
        h.e(params, "params");
        this.job = new k0(null);
        ?? obj = new Object();
        this.future = obj;
        obj.a(new e(21, this), (i) ((G1) getTaskExecutor()).f10717b);
        this.coroutineContext = K.f8773a;
    }

    public static /* synthetic */ void getCoroutineContext$annotations() {
    }

    public static /* synthetic */ Object getForegroundInfo$suspendImpl(CoroutineWorker coroutineWorker, d dVar) {
        throw new IllegalStateException("Not implemented");
    }

    public abstract Object doWork(d dVar);

    public AbstractC0480v getCoroutineContext() {
        return this.coroutineContext;
    }

    public Object getForegroundInfo(d<? super j> dVar) {
        return getForegroundInfo$suspendImpl(this, dVar);
    }

    @Override // androidx.work.ListenableWorker
    public final p getForegroundInfoAsync() {
        k0 k0Var = new k0(null);
        d8.e a5 = B.a(getCoroutineContext().plus(k0Var));
        l lVar = new l(k0Var);
        B.r(a5, null, new f(lVar, this, null), 3);
        return lVar;
    }

    public final C1847j getFuture$work_runtime_ktx_release() {
        return this.future;
    }

    public final InterfaceC0474o getJob$work_runtime_ktx_release() {
        return this.job;
    }

    @Override // androidx.work.ListenableWorker
    public final void onStopped() {
        this.future.cancel(false);
    }

    public final Object setForeground(j jVar, d<? super n> dVar) {
        Object obj;
        p foregroundAsync = setForegroundAsync(jVar);
        h.d(foregroundAsync, "setForegroundAsync(foregroundInfo)");
        if (foregroundAsync.isDone()) {
            try {
                obj = foregroundAsync.get();
            } catch (ExecutionException e8) {
                Throwable cause = e8.getCause();
                if (cause == null) {
                    throw e8;
                }
                throw cause;
            }
        } else {
            C0464h c0464h = new C0464h(1, D1.A(dVar));
            c0464h.s();
            foregroundAsync.a(new v(c0464h, foregroundAsync, 2, false), e1.i.f17051a);
            c0464h.u(new b(3, foregroundAsync));
            obj = c0464h.r();
        }
        if (obj == a.f2587a) {
            return obj;
        }
        return n.f558a;
    }

    public final Object setProgress(e1.h hVar, d<? super n> dVar) {
        Object obj;
        p progressAsync = setProgressAsync(hVar);
        h.d(progressAsync, "setProgressAsync(data)");
        if (progressAsync.isDone()) {
            try {
                obj = progressAsync.get();
            } catch (ExecutionException e8) {
                Throwable cause = e8.getCause();
                if (cause == null) {
                    throw e8;
                }
                throw cause;
            }
        } else {
            C0464h c0464h = new C0464h(1, D1.A(dVar));
            c0464h.s();
            progressAsync.a(new v(c0464h, progressAsync, 2, false), e1.i.f17051a);
            c0464h.u(new b(3, progressAsync));
            obj = c0464h.r();
        }
        if (obj == a.f2587a) {
            return obj;
        }
        return n.f558a;
    }

    @Override // androidx.work.ListenableWorker
    public final p startWork() {
        B.r(B.a(getCoroutineContext().plus(this.job)), null, new g(this, null), 3);
        return this.future;
    }
}
