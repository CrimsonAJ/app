package x8;

import com.google.android.gms.internal.measurement.AbstractC0953k1;
import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public class K {

    /* renamed from: d, reason: collision with root package name */
    public static final J f24618d = new Object();

    /* renamed from: a, reason: collision with root package name */
    public boolean f24619a;

    /* renamed from: b, reason: collision with root package name */
    public long f24620b;

    /* renamed from: c, reason: collision with root package name */
    public long f24621c;

    public K a() {
        this.f24619a = false;
        return this;
    }

    public K b() {
        this.f24621c = 0L;
        return this;
    }

    public long c() {
        if (this.f24619a) {
            return this.f24620b;
        }
        throw new IllegalStateException("No deadline");
    }

    public K d(long j) {
        this.f24619a = true;
        this.f24620b = j;
        return this;
    }

    public boolean e() {
        return this.f24619a;
    }

    public void f() {
        if (!Thread.currentThread().isInterrupted()) {
            if (this.f24619a && this.f24620b - System.nanoTime() <= 0) {
                throw new InterruptedIOException("deadline reached");
            }
            return;
        }
        throw new InterruptedIOException("interrupted");
    }

    public K g(long j) {
        TimeUnit unit = TimeUnit.MILLISECONDS;
        kotlin.jvm.internal.h.e(unit, "unit");
        if (j >= 0) {
            this.f24621c = unit.toNanos(j);
            return this;
        }
        throw new IllegalArgumentException(AbstractC0953k1.k(j, "timeout < 0: ").toString());
    }
}
