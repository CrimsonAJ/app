package x8;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/* renamed from: x8.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C2184d extends K {

    /* renamed from: h, reason: collision with root package name */
    public static final ReentrantLock f24634h;

    /* renamed from: i, reason: collision with root package name */
    public static final Condition f24635i;
    public static final long j;

    /* renamed from: k, reason: collision with root package name */
    public static final long f24636k;

    /* renamed from: l, reason: collision with root package name */
    public static C2184d f24637l;

    /* renamed from: e, reason: collision with root package name */
    public int f24638e;

    /* renamed from: f, reason: collision with root package name */
    public C2184d f24639f;

    /* renamed from: g, reason: collision with root package name */
    public long f24640g;

    static {
        ReentrantLock reentrantLock = new ReentrantLock();
        f24634h = reentrantLock;
        Condition newCondition = reentrantLock.newCondition();
        kotlin.jvm.internal.h.d(newCondition, "newCondition(...)");
        f24635i = newCondition;
        long millis = TimeUnit.SECONDS.toMillis(60L);
        j = millis;
        f24636k = TimeUnit.MILLISECONDS.toNanos(millis);
    }

    public final void h() {
        long j4 = this.f24621c;
        boolean z9 = this.f24619a;
        if (j4 == 0 && !z9) {
            return;
        }
        ReentrantLock reentrantLock = f24634h;
        reentrantLock.lock();
        try {
            if (this.f24638e == 0) {
                this.f24638e = 1;
                d0.w.n(this, j4, z9);
                return;
            }
            throw new IllegalStateException("Unbalanced enter/exit");
        } finally {
            reentrantLock.unlock();
        }
    }

    public final boolean i() {
        ReentrantLock reentrantLock = f24634h;
        reentrantLock.lock();
        try {
            int i9 = this.f24638e;
            boolean z9 = false;
            this.f24638e = 0;
            if (i9 == 1) {
                C2184d c2184d = f24637l;
                while (c2184d != null) {
                    C2184d c2184d2 = c2184d.f24639f;
                    if (c2184d2 == this) {
                        c2184d.f24639f = this.f24639f;
                        this.f24639f = null;
                        return false;
                    }
                    c2184d = c2184d2;
                }
                throw new IllegalStateException("node was not found in the queue");
            }
            if (i9 == 2) {
                z9 = true;
            }
            return z9;
        } finally {
            reentrantLock.unlock();
        }
    }

    public void j() {
    }
}
