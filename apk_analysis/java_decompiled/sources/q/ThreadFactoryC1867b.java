package q;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import y6.s;

/* renamed from: q.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ThreadFactoryC1867b implements ThreadFactory {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f22229a;

    /* renamed from: b, reason: collision with root package name */
    public final Number f22230b;

    public ThreadFactoryC1867b() {
        this.f22229a = 0;
        this.f22230b = new AtomicInteger(0);
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        switch (this.f22229a) {
            case 0:
                Thread thread = new Thread(runnable);
                thread.setName("arch_disk_io_" + ((AtomicInteger) this.f22230b).getAndIncrement());
                return thread;
            default:
                Thread newThread = Executors.defaultThreadFactory().newThread(new s(runnable));
                newThread.setName("awaitEvenIfOnMainThread task continuation executor" + ((AtomicLong) this.f22230b).getAndIncrement());
                return newThread;
        }
    }

    public ThreadFactoryC1867b(AtomicLong atomicLong) {
        this.f22229a = 1;
        this.f22230b = atomicLong;
    }
}
