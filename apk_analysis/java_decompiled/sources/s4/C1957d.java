package s4;

import C4.m;
import android.os.AsyncTask;
import android.util.Log;
import com.google.android.gms.auth.api.signin.internal.SignInHubActivity;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;
import n0.C1601a;
import o0.RunnableC1664a;
import w.AbstractC2128h;

/* renamed from: s4.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1957d {

    /* renamed from: a, reason: collision with root package name */
    public C1601a f22719a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f22720b = false;

    /* renamed from: c, reason: collision with root package name */
    public boolean f22721c = false;

    /* renamed from: d, reason: collision with root package name */
    public boolean f22722d = true;

    /* renamed from: e, reason: collision with root package name */
    public boolean f22723e = false;

    /* renamed from: f, reason: collision with root package name */
    public Executor f22724f;

    /* renamed from: g, reason: collision with root package name */
    public volatile RunnableC1664a f22725g;

    /* renamed from: h, reason: collision with root package name */
    public volatile RunnableC1664a f22726h;

    /* renamed from: i, reason: collision with root package name */
    public final Semaphore f22727i;
    public final Set j;

    public C1957d(SignInHubActivity signInHubActivity, Set set) {
        signInHubActivity.getApplicationContext();
        this.f22727i = new Semaphore(0);
        this.j = set;
    }

    public final void a() {
        if (this.f22725g != null) {
            boolean z9 = this.f22720b;
            if (!z9) {
                if (z9) {
                    c();
                } else {
                    this.f22723e = true;
                }
            }
            if (this.f22726h != null) {
                this.f22725g.getClass();
                this.f22725g = null;
                return;
            }
            this.f22725g.getClass();
            RunnableC1664a runnableC1664a = this.f22725g;
            runnableC1664a.f21454c.set(true);
            if (runnableC1664a.f21452a.cancel(false)) {
                this.f22726h = this.f22725g;
            }
            this.f22725g = null;
        }
    }

    public final void b() {
        if (this.f22726h == null && this.f22725g != null) {
            this.f22725g.getClass();
            if (this.f22724f == null) {
                this.f22724f = AsyncTask.THREAD_POOL_EXECUTOR;
            }
            RunnableC1664a runnableC1664a = this.f22725g;
            Executor executor = this.f22724f;
            if (runnableC1664a.f21453b != 1) {
                int b9 = AbstractC2128h.b(runnableC1664a.f21453b);
                if (b9 != 1) {
                    if (b9 != 2) {
                        throw new IllegalStateException("We should never reach this state");
                    }
                    throw new IllegalStateException("Cannot execute task: the task has already been executed (a task can be executed only once)");
                }
                throw new IllegalStateException("Cannot execute task: the task is already running.");
            }
            runnableC1664a.f21453b = 2;
            executor.execute(runnableC1664a.f21452a);
        }
    }

    public final void c() {
        a();
        this.f22725g = new RunnableC1664a(this);
        b();
    }

    public final void d() {
        Iterator it = this.j.iterator();
        if (!it.hasNext()) {
            try {
                this.f22727i.tryAcquire(0, 5L, TimeUnit.SECONDS);
                return;
            } catch (InterruptedException e8) {
                Log.i("GACSignInLoader", "Unexpected InterruptedException", e8);
                Thread.currentThread().interrupt();
                return;
            }
        }
        ((m) it.next()).getClass();
        throw new UnsupportedOperationException();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(64);
        Class<?> cls = getClass();
        sb.append(cls.getSimpleName());
        sb.append("{");
        sb.append(Integer.toHexString(System.identityHashCode(cls)));
        sb.append(" id=0}");
        return sb.toString();
    }
}
