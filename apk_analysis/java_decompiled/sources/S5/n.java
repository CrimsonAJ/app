package S5;

import com.google.android.gms.internal.measurement.AbstractC1002u1;
import java.util.Locale;
import java.util.Objects;
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
public abstract class n extends T5.a implements p {

    /* renamed from: d, reason: collision with root package name */
    public static final boolean f6956d;

    /* renamed from: e, reason: collision with root package name */
    public static final Logger f6957e;

    /* renamed from: f, reason: collision with root package name */
    public static final AbstractC1002u1 f6958f;

    /* renamed from: g, reason: collision with root package name */
    public static final Object f6959g;

    /* renamed from: a, reason: collision with root package name */
    public volatile Object f6960a;

    /* renamed from: b, reason: collision with root package name */
    public volatile d f6961b;

    /* renamed from: c, reason: collision with root package name */
    public volatile m f6962c;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v12, types: [com.google.android.gms.internal.measurement.u1] */
    /* JADX WARN: Type inference failed for: r0v19 */
    /* JADX WARN: Type inference failed for: r0v20 */
    static {
        boolean z9;
        Throwable th;
        ?? eVar;
        try {
            z9 = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));
        } catch (SecurityException unused) {
            z9 = false;
        }
        f6956d = z9;
        f6957e = Logger.getLogger(n.class.getName());
        Throwable th2 = null;
        try {
            th = null;
            eVar = new Object();
        } catch (Throwable th3) {
            th = th3;
            try {
                eVar = new e(AtomicReferenceFieldUpdater.newUpdater(m.class, Thread.class, "a"), AtomicReferenceFieldUpdater.newUpdater(m.class, m.class, "b"), AtomicReferenceFieldUpdater.newUpdater(n.class, m.class, "c"), AtomicReferenceFieldUpdater.newUpdater(n.class, d.class, "b"), AtomicReferenceFieldUpdater.newUpdater(n.class, Object.class, "a"));
            } catch (Throwable th4) {
                th2 = th4;
                eVar = new Object();
            }
        }
        f6958f = eVar;
        if (th2 != null) {
            Logger logger = f6957e;
            Level level = Level.SEVERE;
            logger.log(level, "UnsafeAtomicHelper is broken!", th);
            logger.log(level, "SafeAtomicHelper is broken!", th2);
        }
        f6959g = new Object();
    }

    public static void d(n nVar) {
        for (m D8 = f6958f.D(nVar); D8 != null; D8 = D8.f6955b) {
            Thread thread = D8.f6954a;
            if (thread != null) {
                D8.f6954a = null;
                LockSupport.unpark(thread);
            }
        }
        d C8 = f6958f.C(nVar);
        d dVar = null;
        while (C8 != null) {
            d dVar2 = C8.f6943c;
            C8.f6943c = dVar;
            dVar = C8;
            C8 = dVar2;
        }
        while (dVar != null) {
            d dVar3 = dVar.f6943c;
            Runnable runnable = dVar.f6941a;
            Objects.requireNonNull(runnable);
            Executor executor = dVar.f6942b;
            Objects.requireNonNull(executor);
            e(runnable, executor);
            dVar = dVar3;
        }
    }

    public static void e(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (RuntimeException e8) {
            Level level = Level.SEVERE;
            String valueOf = String.valueOf(runnable);
            String valueOf2 = String.valueOf(executor);
            StringBuilder sb = new StringBuilder(valueOf2.length() + valueOf.length() + 57);
            sb.append("RuntimeException while executing runnable ");
            sb.append(valueOf);
            sb.append(" with executor ");
            sb.append(valueOf2);
            f6957e.log(level, sb.toString(), (Throwable) e8);
        }
    }

    public static Object f(Object obj) {
        if (!(obj instanceof a)) {
            if (!(obj instanceof c)) {
                if (obj == f6959g) {
                    return null;
                }
                return obj;
            }
            throw new ExecutionException(((c) obj).f6939a);
        }
        RuntimeException runtimeException = ((a) obj).f6937a;
        CancellationException cancellationException = new CancellationException("Task was cancelled.");
        cancellationException.initCause(runtimeException);
        throw cancellationException;
    }

    public static Object g(n nVar) {
        Object obj;
        boolean z9 = false;
        while (true) {
            try {
                obj = nVar.get();
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
    public void a(Runnable runnable, Executor executor) {
        d dVar;
        d dVar2;
        O4.h.g(executor, "Executor was null.");
        if (!isDone() && (dVar = this.f6961b) != (dVar2 = d.f6940d)) {
            d dVar3 = new d(runnable, executor);
            do {
                dVar3.f6943c = dVar;
                if (f6958f.b(this, dVar, dVar3)) {
                    return;
                } else {
                    dVar = this.f6961b;
                }
            } while (dVar != dVar2);
        }
        e(runnable, executor);
    }

    public final void b(StringBuilder sb) {
        try {
            Object g9 = g(this);
            sb.append("SUCCESS, result=[");
            c(sb, g9);
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

    public final void c(StringBuilder sb, Object obj) {
        if (obj == null) {
            sb.append("null");
        } else {
            if (obj == this) {
                sb.append("this future");
                return;
            }
            sb.append(obj.getClass().getName());
            sb.append("@");
            sb.append(Integer.toHexString(System.identityHashCode(obj)));
        }
    }

    @Override // java.util.concurrent.Future
    public boolean cancel(boolean z9) {
        a aVar;
        a aVar2;
        Object obj = this.f6960a;
        if (obj == null) {
            if (f6956d) {
                aVar2 = new a(z9, new CancellationException("Future.cancel() was called."));
            } else {
                if (z9) {
                    aVar = a.f6935b;
                } else {
                    aVar = a.f6936c;
                }
                aVar2 = aVar;
                Objects.requireNonNull(aVar2);
            }
            if (f6958f.d(this, obj, aVar2)) {
                d(this);
                return true;
            }
            return false;
        }
        return false;
    }

    @Override // java.util.concurrent.Future
    public Object get(long j, TimeUnit timeUnit) {
        long nanos = timeUnit.toNanos(j);
        if (!Thread.interrupted()) {
            Object obj = this.f6960a;
            if (obj != null) {
                return f(obj);
            }
            long nanoTime = nanos > 0 ? System.nanoTime() + nanos : 0L;
            if (nanos >= 1000) {
                m mVar = this.f6962c;
                m mVar2 = m.f6953c;
                if (mVar != mVar2) {
                    m mVar3 = new m();
                    do {
                        AbstractC1002u1 abstractC1002u1 = f6958f;
                        abstractC1002u1.S(mVar3, mVar);
                        if (abstractC1002u1.f(this, mVar, mVar3)) {
                            do {
                                LockSupport.parkNanos(this, Math.min(nanos, 2147483647999999999L));
                                if (!Thread.interrupted()) {
                                    Object obj2 = this.f6960a;
                                    if (obj2 != null) {
                                        return f(obj2);
                                    }
                                    nanos = nanoTime - System.nanoTime();
                                } else {
                                    i(mVar3);
                                    throw new InterruptedException();
                                }
                            } while (nanos >= 1000);
                            i(mVar3);
                        } else {
                            mVar = this.f6962c;
                        }
                    } while (mVar != mVar2);
                }
                Object obj3 = this.f6960a;
                Objects.requireNonNull(obj3);
                return f(obj3);
            }
            while (nanos > 0) {
                Object obj4 = this.f6960a;
                if (obj4 != null) {
                    return f(obj4);
                }
                if (!Thread.interrupted()) {
                    nanos = nanoTime - System.nanoTime();
                } else {
                    throw new InterruptedException();
                }
            }
            String nVar = toString();
            String obj5 = timeUnit.toString();
            Locale locale = Locale.ROOT;
            String lowerCase = obj5.toLowerCase(locale);
            String lowerCase2 = timeUnit.toString().toLowerCase(locale);
            StringBuilder sb = new StringBuilder(String.valueOf(lowerCase2).length() + 28);
            sb.append("Waited ");
            sb.append(j);
            sb.append(" ");
            sb.append(lowerCase2);
            String sb2 = sb.toString();
            if (nanos + 1000 < 0) {
                String concat = String.valueOf(sb2).concat(" (plus ");
                long j4 = -nanos;
                long convert = timeUnit.convert(j4, TimeUnit.NANOSECONDS);
                long nanos2 = j4 - timeUnit.toNanos(convert);
                boolean z9 = convert == 0 || nanos2 > 1000;
                if (convert > 0) {
                    String valueOf = String.valueOf(concat);
                    StringBuilder sb3 = new StringBuilder(String.valueOf(lowerCase).length() + valueOf.length() + 21);
                    sb3.append(valueOf);
                    sb3.append(convert);
                    sb3.append(" ");
                    sb3.append(lowerCase);
                    String sb4 = sb3.toString();
                    if (z9) {
                        sb4 = String.valueOf(sb4).concat(",");
                    }
                    concat = String.valueOf(sb4).concat(" ");
                }
                if (z9) {
                    String valueOf2 = String.valueOf(concat);
                    StringBuilder sb5 = new StringBuilder(valueOf2.length() + 33);
                    sb5.append(valueOf2);
                    sb5.append(nanos2);
                    sb5.append(" nanoseconds ");
                    concat = sb5.toString();
                }
                sb2 = String.valueOf(concat).concat("delay)");
            }
            if (isDone()) {
                throw new TimeoutException(String.valueOf(sb2).concat(" but future completed as timeout expired"));
            }
            StringBuilder sb6 = new StringBuilder(String.valueOf(nVar).length() + String.valueOf(sb2).length() + 5);
            sb6.append(sb2);
            sb6.append(" for ");
            sb6.append(nVar);
            throw new TimeoutException(sb6.toString());
        }
        throw new InterruptedException();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final String h() {
        if (this instanceof ScheduledFuture) {
            long delay = ((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS);
            StringBuilder sb = new StringBuilder(41);
            sb.append("remaining delay=[");
            sb.append(delay);
            sb.append(" ms]");
            return sb.toString();
        }
        return null;
    }

    public final void i(m mVar) {
        mVar.f6954a = null;
        while (true) {
            m mVar2 = this.f6962c;
            if (mVar2 != m.f6953c) {
                m mVar3 = null;
                while (mVar2 != null) {
                    m mVar4 = mVar2.f6955b;
                    if (mVar2.f6954a != null) {
                        mVar3 = mVar2;
                    } else if (mVar3 != null) {
                        mVar3.f6955b = mVar4;
                        if (mVar3.f6954a == null) {
                            break;
                        }
                    } else if (!f6958f.f(this, mVar2, mVar4)) {
                        break;
                    }
                    mVar2 = mVar4;
                }
                return;
            }
            return;
        }
    }

    @Override // java.util.concurrent.Future
    public boolean isCancelled() {
        return this.f6960a instanceof a;
    }

    @Override // java.util.concurrent.Future
    public boolean isDone() {
        if (this.f6960a != null) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x006e, code lost:
    
        if (r3.isEmpty() != false) goto L17;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String toString() {
        /*
            r6 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.Class r1 = r6.getClass()
            java.lang.String r1 = r1.getName()
            java.lang.String r2 = "com.google.common.util.concurrent."
            boolean r1 = r1.startsWith(r2)
            if (r1 == 0) goto L21
            java.lang.Class r1 = r6.getClass()
            java.lang.String r1 = r1.getSimpleName()
            r0.append(r1)
            goto L2c
        L21:
            java.lang.Class r1 = r6.getClass()
            java.lang.String r1 = r1.getName()
            r0.append(r1)
        L2c:
            r1 = 64
            r0.append(r1)
            int r1 = java.lang.System.identityHashCode(r6)
            java.lang.String r1 = java.lang.Integer.toHexString(r1)
            r0.append(r1)
            java.lang.String r1 = "[status="
            r0.append(r1)
            boolean r1 = r6.isCancelled()
            java.lang.String r2 = "]"
            if (r1 == 0) goto L4f
            java.lang.String r1 = "CANCELLED"
            r0.append(r1)
            goto Lb1
        L4f:
            boolean r1 = r6.isDone()
            if (r1 == 0) goto L59
            r6.b(r0)
            goto Lb1
        L59:
            int r1 = r0.length()
            java.lang.String r3 = "PENDING"
            r0.append(r3)
            java.lang.String r3 = r6.h()     // Catch: java.lang.StackOverflowError -> L72 java.lang.RuntimeException -> L74
            int r4 = O5.i.f5495a     // Catch: java.lang.StackOverflowError -> L72 java.lang.RuntimeException -> L74
            if (r3 == 0) goto L70
            boolean r4 = r3.isEmpty()     // Catch: java.lang.StackOverflowError -> L72 java.lang.RuntimeException -> L74
            if (r4 == 0) goto L94
        L70:
            r3 = 0
            goto L94
        L72:
            r3 = move-exception
            goto L75
        L74:
            r3 = move-exception
        L75:
            java.lang.Class r3 = r3.getClass()
            java.lang.String r3 = java.lang.String.valueOf(r3)
            int r4 = r3.length()
            int r4 = r4 + 38
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>(r4)
            java.lang.String r4 = "Exception thrown from implementation: "
            r5.append(r4)
            r5.append(r3)
            java.lang.String r3 = r5.toString()
        L94:
            if (r3 == 0) goto La1
            java.lang.String r4 = ", info=["
            r0.append(r4)
            r0.append(r3)
            r0.append(r2)
        La1:
            boolean r3 = r6.isDone()
            if (r3 == 0) goto Lb1
            int r3 = r0.length()
            r0.delete(r1, r3)
            r6.b(r0)
        Lb1:
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: S5.n.toString():java.lang.String");
    }

    @Override // java.util.concurrent.Future
    public Object get() {
        Object obj;
        if (!Thread.interrupted()) {
            Object obj2 = this.f6960a;
            if (obj2 != null) {
                return f(obj2);
            }
            m mVar = this.f6962c;
            m mVar2 = m.f6953c;
            if (mVar != mVar2) {
                m mVar3 = new m();
                do {
                    AbstractC1002u1 abstractC1002u1 = f6958f;
                    abstractC1002u1.S(mVar3, mVar);
                    if (abstractC1002u1.f(this, mVar, mVar3)) {
                        do {
                            LockSupport.park(this);
                            if (!Thread.interrupted()) {
                                obj = this.f6960a;
                            } else {
                                i(mVar3);
                                throw new InterruptedException();
                            }
                        } while (obj == null);
                        return f(obj);
                    }
                    mVar = this.f6962c;
                } while (mVar != mVar2);
            }
            Object obj3 = this.f6960a;
            Objects.requireNonNull(obj3);
            return f(obj3);
        }
        throw new InterruptedException();
    }
}
