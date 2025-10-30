package p1;

import S5.p;
import com.google.android.gms.internal.measurement.AbstractC0953k1;
import com.google.android.gms.internal.measurement.Y1;
import java.util.Locale;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import java.util.logging.Level;
import java.util.logging.Logger;

/* renamed from: p1.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1845h implements p {

    /* renamed from: d, reason: collision with root package name */
    public static final boolean f22127d = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));

    /* renamed from: e, reason: collision with root package name */
    public static final Logger f22128e = Logger.getLogger(AbstractC1845h.class.getName());

    /* renamed from: f, reason: collision with root package name */
    public static final Y1 f22129f;

    /* renamed from: g, reason: collision with root package name */
    public static final Object f22130g;

    /* renamed from: a, reason: collision with root package name */
    public volatile Object f22131a;

    /* renamed from: b, reason: collision with root package name */
    public volatile C1840c f22132b;

    /* renamed from: c, reason: collision with root package name */
    public volatile C1844g f22133c;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v1, types: [com.google.android.gms.internal.measurement.Y1] */
    /* JADX WARN: Type inference failed for: r5v3 */
    /* JADX WARN: Type inference failed for: r5v4 */
    static {
        ?? r5;
        try {
            th = null;
            r5 = new C1841d(AtomicReferenceFieldUpdater.newUpdater(C1844g.class, Thread.class, "a"), AtomicReferenceFieldUpdater.newUpdater(C1844g.class, C1844g.class, "b"), AtomicReferenceFieldUpdater.newUpdater(AbstractC1845h.class, C1844g.class, "c"), AtomicReferenceFieldUpdater.newUpdater(AbstractC1845h.class, C1840c.class, "b"), AtomicReferenceFieldUpdater.newUpdater(AbstractC1845h.class, Object.class, "a"));
        } catch (Throwable th) {
            th = th;
            r5 = new Object();
        }
        f22129f = r5;
        if (th != null) {
            f22128e.log(Level.SEVERE, "SafeAtomicHelper is broken!", th);
        }
        f22130g = new Object();
    }

    public static void c(AbstractC1845h abstractC1845h) {
        C1840c c1840c;
        C1840c c1840c2;
        C1840c c1840c3 = null;
        while (true) {
            C1844g c1844g = abstractC1845h.f22133c;
            if (f22129f.g(abstractC1845h, c1844g, C1844g.f22124c)) {
                while (c1844g != null) {
                    Thread thread = c1844g.f22125a;
                    if (thread != null) {
                        c1844g.f22125a = null;
                        LockSupport.unpark(thread);
                    }
                    c1844g = c1844g.f22126b;
                }
                do {
                    c1840c = abstractC1845h.f22132b;
                } while (!f22129f.e(abstractC1845h, c1840c, C1840c.f22113d));
                while (true) {
                    c1840c2 = c1840c3;
                    c1840c3 = c1840c;
                    if (c1840c3 == null) {
                        break;
                    }
                    c1840c = c1840c3.f22116c;
                    c1840c3.f22116c = c1840c2;
                }
                while (c1840c2 != null) {
                    c1840c3 = c1840c2.f22116c;
                    Runnable runnable = c1840c2.f22114a;
                    if (runnable instanceof RunnableC1842e) {
                        RunnableC1842e runnableC1842e = (RunnableC1842e) runnable;
                        abstractC1845h = runnableC1842e.f22122a;
                        if (abstractC1845h.f22131a == runnableC1842e) {
                            if (f22129f.f(abstractC1845h, runnableC1842e, f(runnableC1842e.f22123b))) {
                                break;
                            }
                        } else {
                            continue;
                        }
                    } else {
                        d(runnable, c1840c2.f22115b);
                    }
                    c1840c2 = c1840c3;
                }
                return;
            }
        }
    }

    public static void d(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (RuntimeException e8) {
            f22128e.log(Level.SEVERE, "RuntimeException while executing runnable " + runnable + " with executor " + executor, (Throwable) e8);
        }
    }

    public static Object e(Object obj) {
        if (!(obj instanceof C1838a)) {
            if (!(obj instanceof C1839b)) {
                if (obj == f22130g) {
                    return null;
                }
                return obj;
            }
            throw new ExecutionException(((C1839b) obj).f22112a);
        }
        CancellationException cancellationException = ((C1838a) obj).f22110b;
        CancellationException cancellationException2 = new CancellationException("Task was cancelled.");
        cancellationException2.initCause(cancellationException);
        throw cancellationException2;
    }

    public static Object f(p pVar) {
        if (pVar instanceof AbstractC1845h) {
            Object obj = ((AbstractC1845h) pVar).f22131a;
            if (obj instanceof C1838a) {
                C1838a c1838a = (C1838a) obj;
                if (c1838a.f22109a) {
                    if (c1838a.f22110b != null) {
                        return new C1838a(false, c1838a.f22110b);
                    }
                    return C1838a.f22108d;
                }
                return obj;
            }
            return obj;
        }
        boolean isCancelled = pVar.isCancelled();
        if ((!f22127d) & isCancelled) {
            return C1838a.f22108d;
        }
        try {
            Object g9 = g(pVar);
            if (g9 == null) {
                return f22130g;
            }
            return g9;
        } catch (CancellationException e8) {
            if (!isCancelled) {
                return new C1839b(new IllegalArgumentException("get() threw CancellationException, despite reporting isCancelled() == false: " + pVar, e8));
            }
            return new C1838a(false, e8);
        } catch (ExecutionException e9) {
            return new C1839b(e9.getCause());
        } catch (Throwable th) {
            return new C1839b(th);
        }
    }

    public static Object g(p pVar) {
        Object obj;
        boolean z9 = false;
        while (true) {
            try {
                obj = pVar.get();
                break;
            } catch (InterruptedException unused) {
                z9 = true;
            } catch (Throwable th) {
                if (z9) {
                    Thread.currentThread().interrupt();
                }
                throw th;
            }
        }
        if (z9) {
            Thread.currentThread().interrupt();
        }
        return obj;
    }

    @Override // S5.p
    public final void a(Runnable runnable, Executor executor) {
        executor.getClass();
        C1840c c1840c = this.f22132b;
        C1840c c1840c2 = C1840c.f22113d;
        if (c1840c != c1840c2) {
            C1840c c1840c3 = new C1840c(runnable, executor);
            do {
                c1840c3.f22116c = c1840c;
                if (f22129f.e(this, c1840c, c1840c3)) {
                    return;
                } else {
                    c1840c = this.f22132b;
                }
            } while (c1840c != c1840c2);
        }
        d(runnable, executor);
    }

    public final void b(StringBuilder sb) {
        String valueOf;
        try {
            Object g9 = g(this);
            sb.append("SUCCESS, result=[");
            if (g9 == this) {
                valueOf = "this future";
            } else {
                valueOf = String.valueOf(g9);
            }
            sb.append(valueOf);
            sb.append("]");
        } catch (CancellationException unused) {
            sb.append("CANCELLED");
        } catch (RuntimeException e8) {
            sb.append("UNKNOWN, cause=[");
            sb.append(e8.getClass());
            sb.append(" thrown from get()]");
        } catch (ExecutionException e9) {
            sb.append("FAILURE, cause=[");
            sb.append(e9.getCause());
            sb.append("]");
        }
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z9) {
        boolean z10;
        C1838a c1838a;
        boolean z11;
        Object obj = this.f22131a;
        if (obj == null) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!(z10 | (obj instanceof RunnableC1842e))) {
            return false;
        }
        if (f22127d) {
            c1838a = new C1838a(z9, new CancellationException("Future.cancel() was called."));
        } else if (z9) {
            c1838a = C1838a.f22107c;
        } else {
            c1838a = C1838a.f22108d;
        }
        AbstractC1845h abstractC1845h = this;
        boolean z12 = false;
        while (true) {
            if (f22129f.f(abstractC1845h, obj, c1838a)) {
                c(abstractC1845h);
                if (!(obj instanceof RunnableC1842e)) {
                    break;
                }
                p pVar = ((RunnableC1842e) obj).f22123b;
                if (pVar instanceof AbstractC1845h) {
                    abstractC1845h = (AbstractC1845h) pVar;
                    obj = abstractC1845h.f22131a;
                    if (obj == null) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    if (!z11 && !(obj instanceof RunnableC1842e)) {
                        break;
                    }
                    z12 = true;
                } else {
                    pVar.cancel(z9);
                    break;
                }
            } else {
                obj = abstractC1845h.f22131a;
                if (!(obj instanceof RunnableC1842e)) {
                    return z12;
                }
            }
        }
        return true;
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j, TimeUnit timeUnit) {
        boolean z9;
        long nanos = timeUnit.toNanos(j);
        if (!Thread.interrupted()) {
            Object obj = this.f22131a;
            if ((obj != null) & (!(obj instanceof RunnableC1842e))) {
                return e(obj);
            }
            long nanoTime = nanos > 0 ? System.nanoTime() + nanos : 0L;
            if (nanos >= 1000) {
                C1844g c1844g = this.f22133c;
                C1844g c1844g2 = C1844g.f22124c;
                if (c1844g != c1844g2) {
                    C1844g c1844g3 = new C1844g();
                    z9 = true;
                    do {
                        Y1 y12 = f22129f;
                        y12.y(c1844g3, c1844g);
                        if (y12.g(this, c1844g, c1844g3)) {
                            do {
                                LockSupport.parkNanos(this, nanos);
                                if (!Thread.interrupted()) {
                                    Object obj2 = this.f22131a;
                                    if ((obj2 != null) & (!(obj2 instanceof RunnableC1842e))) {
                                        return e(obj2);
                                    }
                                    nanos = nanoTime - System.nanoTime();
                                } else {
                                    i(c1844g3);
                                    throw new InterruptedException();
                                }
                            } while (nanos >= 1000);
                            i(c1844g3);
                        } else {
                            c1844g = this.f22133c;
                        }
                    } while (c1844g != c1844g2);
                }
                return e(this.f22131a);
            }
            z9 = true;
            while (nanos > 0) {
                Object obj3 = this.f22131a;
                if ((obj3 != null ? z9 : false) & (!(obj3 instanceof RunnableC1842e))) {
                    return e(obj3);
                }
                if (!Thread.interrupted()) {
                    nanos = nanoTime - System.nanoTime();
                } else {
                    throw new InterruptedException();
                }
            }
            String abstractC1845h = toString();
            String obj4 = timeUnit.toString();
            Locale locale = Locale.ROOT;
            String lowerCase = obj4.toLowerCase(locale);
            String str = "Waited " + j + " " + timeUnit.toString().toLowerCase(locale);
            if (nanos + 1000 < 0) {
                String n7 = AbstractC0953k1.n(str, " (plus ");
                long j4 = -nanos;
                long convert = timeUnit.convert(j4, TimeUnit.NANOSECONDS);
                long nanos2 = j4 - timeUnit.toNanos(convert);
                boolean z10 = (convert == 0 || nanos2 > 1000) ? z9 : false;
                if (convert > 0) {
                    String str2 = n7 + convert + " " + lowerCase;
                    if (z10) {
                        str2 = AbstractC0953k1.n(str2, ",");
                    }
                    n7 = AbstractC0953k1.n(str2, " ");
                }
                if (z10) {
                    n7 = n7 + nanos2 + " nanoseconds ";
                }
                str = AbstractC0953k1.n(n7, "delay)");
            }
            if (isDone()) {
                throw new TimeoutException(AbstractC0953k1.n(str, " but future completed as timeout expired"));
            }
            throw new TimeoutException(AbstractC0953k1.o(str, " for ", abstractC1845h));
        }
        throw new InterruptedException();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final String h() {
        String valueOf;
        Object obj = this.f22131a;
        if (obj instanceof RunnableC1842e) {
            StringBuilder sb = new StringBuilder("setFuture=[");
            p pVar = ((RunnableC1842e) obj).f22123b;
            if (pVar == this) {
                valueOf = "this future";
            } else {
                valueOf = String.valueOf(pVar);
            }
            return AbstractC0953k1.q(sb, valueOf, "]");
        }
        if (this instanceof ScheduledFuture) {
            return "remaining delay=[" + ((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS) + " ms]";
        }
        return null;
    }

    public final void i(C1844g c1844g) {
        c1844g.f22125a = null;
        while (true) {
            C1844g c1844g2 = this.f22133c;
            if (c1844g2 != C1844g.f22124c) {
                C1844g c1844g3 = null;
                while (c1844g2 != null) {
                    C1844g c1844g4 = c1844g2.f22126b;
                    if (c1844g2.f22125a != null) {
                        c1844g3 = c1844g2;
                    } else if (c1844g3 != null) {
                        c1844g3.f22126b = c1844g4;
                        if (c1844g3.f22125a == null) {
                            break;
                        }
                    } else if (!f22129f.g(this, c1844g2, c1844g4)) {
                        break;
                    }
                    c1844g2 = c1844g4;
                }
                return;
            }
            return;
        }
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.f22131a instanceof C1838a;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        boolean z9;
        if (this.f22131a != null) {
            z9 = true;
        } else {
            z9 = false;
        }
        return (!(r0 instanceof RunnableC1842e)) & z9;
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("[status=");
        if (this.f22131a instanceof C1838a) {
            sb.append("CANCELLED");
        } else if (isDone()) {
            b(sb);
        } else {
            try {
                str = h();
            } catch (RuntimeException e8) {
                str = "Exception thrown from implementation: " + e8.getClass();
            }
            if (str != null && !str.isEmpty()) {
                sb.append("PENDING, info=[");
                sb.append(str);
                sb.append("]");
            } else if (isDone()) {
                b(sb);
            } else {
                sb.append("PENDING");
            }
        }
        sb.append("]");
        return sb.toString();
    }

    @Override // java.util.concurrent.Future
    public final Object get() {
        Object obj;
        if (!Thread.interrupted()) {
            Object obj2 = this.f22131a;
            if ((obj2 != null) & (!(obj2 instanceof RunnableC1842e))) {
                return e(obj2);
            }
            C1844g c1844g = this.f22133c;
            C1844g c1844g2 = C1844g.f22124c;
            if (c1844g != c1844g2) {
                C1844g c1844g3 = new C1844g();
                do {
                    Y1 y12 = f22129f;
                    y12.y(c1844g3, c1844g);
                    if (y12.g(this, c1844g, c1844g3)) {
                        do {
                            LockSupport.park(this);
                            if (!Thread.interrupted()) {
                                obj = this.f22131a;
                            } else {
                                i(c1844g3);
                                throw new InterruptedException();
                            }
                        } while (!((obj != null) & (!(obj instanceof RunnableC1842e))));
                        return e(obj);
                    }
                    c1844g = this.f22133c;
                } while (c1844g != c1844g2);
            }
            return e(this.f22131a);
        }
        throw new InterruptedException();
    }
}
