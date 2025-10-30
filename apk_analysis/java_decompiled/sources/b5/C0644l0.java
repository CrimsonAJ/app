package b5;

import android.os.Process;
import java.util.AbstractQueue;
import java.util.concurrent.BlockingQueue;

/* renamed from: b5.l0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0644l0 extends Thread {

    /* renamed from: a, reason: collision with root package name */
    public final Object f11178a;

    /* renamed from: b, reason: collision with root package name */
    public final AbstractQueue f11179b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f11180c = false;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ C0647m0 f11181d;

    /* JADX WARN: Multi-variable type inference failed */
    public C0644l0(C0647m0 c0647m0, String str, BlockingQueue blockingQueue) {
        this.f11181d = c0647m0;
        F4.y.h(blockingQueue);
        this.f11178a = new Object();
        this.f11179b = (AbstractQueue) blockingQueue;
        setName(str);
    }

    public final void a() {
        Object obj = this.f11178a;
        synchronized (obj) {
            obj.notifyAll();
        }
    }

    public final void b() {
        C0647m0 c0647m0 = this.f11181d;
        synchronized (c0647m0.f11194i) {
            try {
                if (!this.f11180c) {
                    c0647m0.j.release();
                    c0647m0.f11194i.notifyAll();
                    if (this == c0647m0.f11188c) {
                        c0647m0.f11188c = null;
                    } else if (this == c0647m0.f11189d) {
                        c0647m0.f11189d = null;
                    } else {
                        V v8 = ((C0650n0) c0647m0.f1707a).f11229i;
                        C0650n0.f(v8);
                        v8.f10971f.b("Current scheduler thread is neither worker nor network");
                    }
                    this.f11180c = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        int i9;
        boolean z9 = false;
        while (!z9) {
            try {
                this.f11181d.j.acquire();
                z9 = true;
            } catch (InterruptedException e8) {
                V v8 = ((C0650n0) this.f11181d.f1707a).f11229i;
                C0650n0.f(v8);
                v8.f10974i.c(e8, String.valueOf(getName()).concat(" was interrupted"));
            }
        }
        try {
            int threadPriority = Process.getThreadPriority(Process.myTid());
            while (true) {
                AbstractQueue abstractQueue = this.f11179b;
                C0641k0 c0641k0 = (C0641k0) abstractQueue.poll();
                if (c0641k0 != null) {
                    if (true != c0641k0.f11169b) {
                        i9 = 10;
                    } else {
                        i9 = threadPriority;
                    }
                    Process.setThreadPriority(i9);
                    c0641k0.run();
                } else {
                    Object obj = this.f11178a;
                    synchronized (obj) {
                        if (abstractQueue.peek() == null) {
                            this.f11181d.getClass();
                            try {
                                obj.wait(30000L);
                            } catch (InterruptedException e9) {
                                V v9 = ((C0650n0) this.f11181d.f1707a).f11229i;
                                C0650n0.f(v9);
                                v9.f10974i.c(e9, String.valueOf(getName()).concat(" was interrupted"));
                            }
                        }
                    }
                    synchronized (this.f11181d.f11194i) {
                        if (this.f11179b.peek() == null) {
                            b();
                            b();
                            return;
                        }
                    }
                }
            }
        } catch (Throwable th) {
            b();
            throw th;
        }
    }
}
