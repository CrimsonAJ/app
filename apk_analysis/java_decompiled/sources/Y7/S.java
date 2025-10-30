package Y7;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes.dex */
public abstract class S implements Runnable, Comparable, M {
    private volatile Object _heap;

    /* renamed from: a, reason: collision with root package name */
    public long f8782a;

    /* renamed from: b, reason: collision with root package name */
    public int f8783b = -1;

    public S(long j) {
        this.f8782a = j;
    }

    public final d8.A a() {
        Object obj = this._heap;
        if (obj instanceof d8.A) {
            return (d8.A) obj;
        }
        return null;
    }

    @Override // Y7.M
    public final void b() {
        T t7;
        synchronized (this) {
            try {
                Object obj = this._heap;
                G6.a aVar = B.f8747b;
                if (obj == aVar) {
                    return;
                }
                if (obj instanceof T) {
                    t7 = (T) obj;
                } else {
                    t7 = null;
                }
                if (t7 != null) {
                    t7.c(this);
                }
                this._heap = aVar;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        long j = this.f8782a - ((S) obj).f8782a;
        if (j > 0) {
            return 1;
        }
        if (j < 0) {
            return -1;
        }
        return 0;
    }

    public final int d(long j, T t7, U u9) {
        S s9;
        boolean z9;
        synchronized (this) {
            if (this._heap == B.f8747b) {
                return 2;
            }
            synchronized (t7) {
                try {
                    S[] sArr = t7.f16961a;
                    if (sArr != null) {
                        s9 = sArr[0];
                    } else {
                        s9 = null;
                    }
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = U.f8785f;
                    u9.getClass();
                    if (U.f8787h.get(u9) != 0) {
                        z9 = true;
                    } else {
                        z9 = false;
                    }
                    if (z9) {
                        return 1;
                    }
                    if (s9 == null) {
                        t7.f8784c = j;
                    } else {
                        long j4 = s9.f8782a;
                        if (j4 - j < 0) {
                            j = j4;
                        }
                        if (j - t7.f8784c > 0) {
                            t7.f8784c = j;
                        }
                    }
                    long j9 = this.f8782a;
                    long j10 = t7.f8784c;
                    if (j9 - j10 < 0) {
                        this.f8782a = j10;
                    }
                    t7.a(this);
                    return 0;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public final void e(T t7) {
        if (this._heap != B.f8747b) {
            this._heap = t7;
            return;
        }
        throw new IllegalArgumentException("Failed requirement.");
    }

    public String toString() {
        return "Delayed[nanos=" + this.f8782a + ']';
    }
}
