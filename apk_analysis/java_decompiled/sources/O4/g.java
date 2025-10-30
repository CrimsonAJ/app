package O4;

import android.os.Process;
import d0.w;
import java.util.concurrent.locks.ReentrantLock;
import x8.C2184d;

/* loaded from: classes.dex */
public final class g extends Thread {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5475a = 1;

    public /* synthetic */ g(String str) {
        super(str);
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        ReentrantLock reentrantLock;
        C2184d p9;
        switch (this.f5475a) {
            case 0:
                Process.setThreadPriority(19);
                synchronized (this) {
                    while (true) {
                        try {
                            wait();
                        } catch (InterruptedException unused) {
                            return;
                        }
                    }
                }
        }
        while (true) {
            try {
                ReentrantLock reentrantLock2 = C2184d.f24634h;
                reentrantLock = C2184d.f24634h;
                reentrantLock.lock();
                try {
                    p9 = w.p();
                } catch (Throwable th) {
                    reentrantLock.unlock();
                    throw th;
                }
            } catch (InterruptedException unused2) {
            }
            if (p9 == C2184d.f24637l) {
                C2184d.f24637l = null;
                reentrantLock.unlock();
                return;
            } else {
                reentrantLock.unlock();
                if (p9 != null) {
                    p9.j();
                }
            }
        }
    }

    public /* synthetic */ g(ThreadGroup threadGroup, String str) {
        super(threadGroup, str);
    }
}
