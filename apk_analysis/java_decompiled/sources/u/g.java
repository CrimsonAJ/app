package u;

import S5.p;
import com.google.android.gms.internal.measurement.AbstractC0953k1;
import com.google.android.gms.internal.measurement.AbstractC1002u1;
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

/* loaded from: classes.dex */
public abstract class g implements p {

    /* renamed from: d, reason: collision with root package name */
    public static final boolean f23352d = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));

    /* renamed from: e, reason: collision with root package name */
    public static final Logger f23353e = Logger.getLogger(g.class.getName());

    /* renamed from: f, reason: collision with root package name */
    public static final AbstractC1002u1 f23354f;

    /* renamed from: g, reason: collision with root package name */
    public static final Object f23355g;

    /* renamed from: a, reason: collision with root package name */
    public volatile Object f23356a;

    /* renamed from: b, reason: collision with root package name */
    public volatile c f23357b;

    /* renamed from: c, reason: collision with root package name */
    public volatile f f23358c;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v1, types: [com.google.android.gms.internal.measurement.u1] */
    /* JADX WARN: Type inference failed for: r5v3 */
    /* JADX WARN: Type inference failed for: r5v4 */
    static {
        ?? r5;
        try {
            th = null;
            r5 = new d(AtomicReferenceFieldUpdater.newUpdater(f.class, Thread.class, "a"), AtomicReferenceFieldUpdater.newUpdater(f.class, f.class, "b"), AtomicReferenceFieldUpdater.newUpdater(g.class, f.class, "c"), AtomicReferenceFieldUpdater.newUpdater(g.class, c.class, "b"), AtomicReferenceFieldUpdater.newUpdater(g.class, Object.class, "a"));
        } catch (Throwable th) {
            th = th;
            r5 = new Object();
        }
        f23354f = r5;
        if (th != null) {
            f23353e.log(Level.SEVERE, "SafeAtomicHelper is broken!", th);
        }
        f23355g = new Object();
    }

    public static void d(g gVar) {
        f fVar;
        c cVar;
        c cVar2;
        c cVar3;
        do {
            fVar = gVar.f23358c;
        } while (!f23354f.g(gVar, fVar, f.f23349c));
        while (true) {
            cVar = null;
            if (fVar == null) {
                break;
            }
            Thread thread = fVar.f23350a;
            if (thread != null) {
                fVar.f23350a = null;
                LockSupport.unpark(thread);
            }
            fVar = fVar.f23351b;
        }
        gVar.c();
        do {
            cVar2 = gVar.f23357b;
        } while (!f23354f.c(gVar, cVar2, c.f23341d));
        while (true) {
            cVar3 = cVar;
            cVar = cVar2;
            if (cVar == null) {
                break;
            }
            cVar2 = cVar.f23344c;
            cVar.f23344c = cVar3;
        }
        while (cVar3 != null) {
            c cVar4 = cVar3.f23344c;
            e(cVar3.f23342a, cVar3.f23343b);
            cVar3 = cVar4;
        }
    }

    public static void e(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (RuntimeException e8) {
            f23353e.log(Level.SEVERE, "RuntimeException while executing runnable " + runnable + " with executor " + executor, (Throwable) e8);
        }
    }

    public static Object f(Object obj) {
        if (!(obj instanceof C2027a)) {
            if (!(obj instanceof C2028b)) {
                if (obj == f23355g) {
                    return null;
                }
                return obj;
            }
            throw new ExecutionException(((C2028b) obj).f23340a);
        }
        CancellationException cancellationException = ((C2027a) obj).f23339b;
        CancellationException cancellationException2 = new CancellationException("Task was cancelled.");
        cancellationException2.initCause(cancellationException);
        throw cancellationException2;
    }

    public static Object g(g gVar) {
        Object obj;
        boolean z9 = false;
        while (true) {
            try {
                obj = gVar.get();
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
        c cVar = this.f23357b;
        c cVar2 = c.f23341d;
        if (cVar != cVar2) {
            c cVar3 = new c(runnable, executor);
            do {
                cVar3.f23344c = cVar;
                if (f23354f.c(this, cVar, cVar3)) {
                    return;
                } else {
                    cVar = this.f23357b;
                }
            } while (cVar != cVar2);
        }
        e(runnable, executor);
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
        C2027a c2027a;
        Object obj = this.f23356a;
        if (obj == null) {
            if (f23352d) {
                c2027a = new C2027a(z9, new CancellationException("Future.cancel() was called."));
            } else if (z9) {
                c2027a = C2027a.f23336c;
            } else {
                c2027a = C2027a.f23337d;
            }
            if (f23354f.e(this, obj, c2027a)) {
                d(this);
                return true;
            }
            return false;
        }
        return false;
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j, TimeUnit timeUnit) {
        long nanos = timeUnit.toNanos(j);
        if (!Thread.interrupted()) {
            Object obj = this.f23356a;
            if (obj != null) {
                return f(obj);
            }
            long nanoTime = nanos > 0 ? System.nanoTime() + nanos : 0L;
            if (nanos >= 1000) {
                f fVar = this.f23358c;
                f fVar2 = f.f23349c;
                if (fVar != fVar2) {
                    f fVar3 = new f();
                    do {
                        AbstractC1002u1 abstractC1002u1 = f23354f;
                        abstractC1002u1.T(fVar3, fVar);
                        if (abstractC1002u1.g(this, fVar, fVar3)) {
                            do {
                                LockSupport.parkNanos(this, nanos);
                                if (!Thread.interrupted()) {
                                    Object obj2 = this.f23356a;
                                    if (obj2 != null) {
                                        return f(obj2);
                                    }
                                    nanos = nanoTime - System.nanoTime();
                                } else {
                                    i(fVar3);
                                    throw new InterruptedException();
                                }
                            } while (nanos >= 1000);
                            i(fVar3);
                        } else {
                            fVar = this.f23358c;
                        }
                    } while (fVar != fVar2);
                }
                return f(this.f23356a);
            }
            while (nanos > 0) {
                Object obj3 = this.f23356a;
                if (obj3 != null) {
                    return f(obj3);
                }
                if (!Thread.interrupted()) {
                    nanos = nanoTime - System.nanoTime();
                } else {
                    throw new InterruptedException();
                }
            }
            String gVar = toString();
            String obj4 = timeUnit.toString();
            Locale locale = Locale.ROOT;
            String lowerCase = obj4.toLowerCase(locale);
            String str = "Waited " + j + " " + timeUnit.toString().toLowerCase(locale);
            if (nanos + 1000 < 0) {
                String n7 = AbstractC0953k1.n(str, " (plus ");
                long j4 = -nanos;
                long convert = timeUnit.convert(j4, TimeUnit.NANOSECONDS);
                long nanos2 = j4 - timeUnit.toNanos(convert);
                boolean z9 = convert == 0 || nanos2 > 1000;
                if (convert > 0) {
                    String str2 = n7 + convert + " " + lowerCase;
                    if (z9) {
                        str2 = AbstractC0953k1.n(str2, ",");
                    }
                    n7 = AbstractC0953k1.n(str2, " ");
                }
                if (z9) {
                    n7 = n7 + nanos2 + " nanoseconds ";
                }
                str = AbstractC0953k1.n(n7, "delay)");
            }
            if (isDone()) {
                throw new TimeoutException(AbstractC0953k1.n(str, " but future completed as timeout expired"));
            }
            throw new TimeoutException(AbstractC0953k1.o(str, " for ", gVar));
        }
        throw new InterruptedException();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public String h() {
        if (this instanceof ScheduledFuture) {
            return "remaining delay=[" + ((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS) + " ms]";
        }
        return null;
    }

    public final void i(f fVar) {
        fVar.f23350a = null;
        while (true) {
            f fVar2 = this.f23358c;
            if (fVar2 != f.f23349c) {
                f fVar3 = null;
                while (fVar2 != null) {
                    f fVar4 = fVar2.f23351b;
                    if (fVar2.f23350a != null) {
                        fVar3 = fVar2;
                    } else if (fVar3 != null) {
                        fVar3.f23351b = fVar4;
                        if (fVar3.f23350a == null) {
                            break;
                        }
                    } else if (!f23354f.g(this, fVar2, fVar4)) {
                        break;
                    }
                    fVar2 = fVar4;
                }
                return;
            }
            return;
        }
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.f23356a instanceof C2027a;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        if (this.f23356a != null) {
            return true;
        }
        return false;
    }

    public boolean j(Object obj) {
        if (obj == null) {
            obj = f23355g;
        }
        if (f23354f.e(this, null, obj)) {
            d(this);
            return true;
        }
        return false;
    }

    public boolean k(Throwable th) {
        th.getClass();
        if (f23354f.e(this, null, new C2028b(th))) {
            d(this);
            return true;
        }
        return false;
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("[status=");
        if (this.f23356a instanceof C2027a) {
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

    public void c() {
    }

    @Override // java.util.concurrent.Future
    public final Object get() {
        Object obj;
        if (!Thread.interrupted()) {
            Object obj2 = this.f23356a;
            if (obj2 != null) {
                return f(obj2);
            }
            f fVar = this.f23358c;
            f fVar2 = f.f23349c;
            if (fVar != fVar2) {
                f fVar3 = new f();
                do {
                    AbstractC1002u1 abstractC1002u1 = f23354f;
                    abstractC1002u1.T(fVar3, fVar);
                    if (abstractC1002u1.g(this, fVar, fVar3)) {
                        do {
                            LockSupport.park(this);
                            if (!Thread.interrupted()) {
                                obj = this.f23356a;
                            } else {
                                i(fVar3);
                                throw new InterruptedException();
                            }
                        } while (obj == null);
                        return f(obj);
                    }
                    fVar = this.f23358c;
                } while (fVar != fVar2);
            }
            return f(this.f23356a);
        }
        throw new InterruptedException();
    }
}
