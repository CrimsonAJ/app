package p4;

import java.lang.ref.WeakReference;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* renamed from: p4.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1858b extends Thread {

    /* renamed from: a, reason: collision with root package name */
    public final WeakReference f22177a;

    /* renamed from: b, reason: collision with root package name */
    public final long f22178b;

    /* renamed from: c, reason: collision with root package name */
    public final CountDownLatch f22179c = new CountDownLatch(1);

    /* renamed from: d, reason: collision with root package name */
    public boolean f22180d = false;

    public C1858b(C1857a c1857a, long j) {
        this.f22177a = new WeakReference(c1857a);
        this.f22178b = j;
        start();
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        C1857a c1857a;
        WeakReference weakReference = this.f22177a;
        try {
            if (!this.f22179c.await(this.f22178b, TimeUnit.MILLISECONDS) && (c1857a = (C1857a) weakReference.get()) != null) {
                c1857a.b();
                this.f22180d = true;
            }
        } catch (InterruptedException unused) {
            C1857a c1857a2 = (C1857a) weakReference.get();
            if (c1857a2 != null) {
                c1857a2.b();
                this.f22180d = true;
            }
        }
    }
}
