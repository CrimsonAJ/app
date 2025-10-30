package com.google.android.gms.internal.cast;

import com.google.android.gms.internal.measurement.AbstractC0953k1;
import java.util.Locale;
import java.util.Objects;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.locks.LockSupport;
import java.util.logging.Level;

/* renamed from: com.google.android.gms.internal.cast.m2, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0849m2 extends AbstractC0868r2 {
    public static void A(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (Exception e8) {
            AbstractC0868r2.f14963h.b().logp(Level.SEVERE, "com.google.common.util.concurrent.AbstractFuture", "executeListener", "RuntimeException while executing runnable " + String.valueOf(runnable) + " with executor " + String.valueOf(executor), (Throwable) e8);
        }
    }

    public static Object u(Object obj) {
        if (!(obj instanceof C0833i2)) {
            if (!(obj instanceof C0841k2)) {
                if (obj == AbstractC0868r2.f14962g) {
                    return null;
                }
                return obj;
            }
            throw new ExecutionException(((C0841k2) obj).f14902a);
        }
        RuntimeException runtimeException = ((C0833i2) obj).f14867b;
        CancellationException cancellationException = new CancellationException("Task was cancelled.");
        cancellationException.initCause(runtimeException);
        throw cancellationException;
    }

    public static Object x(AbstractC0849m2 abstractC0849m2) {
        Object obj;
        boolean z9 = false;
        while (true) {
            try {
                obj = abstractC0849m2.get();
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

    public static void z(AbstractC0849m2 abstractC0849m2) {
        abstractC0849m2.getClass();
        for (C0865q2 k5 = AbstractC0868r2.j.k(abstractC0849m2); k5 != null; k5 = k5.f14959b) {
            Thread thread = k5.f14958a;
            if (thread != null) {
                k5.f14958a = null;
                LockSupport.unpark(thread);
            }
        }
        abstractC0849m2.w();
        C0845l2 d9 = AbstractC0868r2.j.d(abstractC0849m2);
        C0845l2 c0845l2 = null;
        while (d9 != null) {
            C0845l2 c0845l22 = d9.f14913c;
            d9.f14913c = c0845l2;
            c0845l2 = d9;
            d9 = c0845l22;
        }
        while (c0845l2 != null) {
            Runnable runnable = c0845l2.f14911a;
            C0845l2 c0845l23 = c0845l2.f14913c;
            Objects.requireNonNull(runnable);
            Executor executor = c0845l2.f14912b;
            Objects.requireNonNull(executor);
            A(runnable, executor);
            c0845l2 = c0845l23;
        }
    }

    @Override // S5.p
    public final void a(Runnable runnable, Executor executor) {
        C0845l2 c0845l2;
        C0845l2 c0845l22;
        if (executor != null) {
            if (!isDone() && (c0845l2 = this.f14966e) != (c0845l22 = C0845l2.f14910d)) {
                C0845l2 c0845l23 = new C0845l2(runnable, executor);
                do {
                    c0845l23.f14913c = c0845l2;
                    if (!AbstractC0868r2.j.q(this, c0845l2, c0845l23)) {
                        c0845l2 = this.f14966e;
                    } else {
                        return;
                    }
                } while (c0845l2 != c0845l22);
            }
            A(runnable, executor);
            return;
        }
        throw new NullPointerException("Executor was null.");
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z9) {
        C0833i2 c0833i2;
        C0833i2 c0833i22;
        Object obj = this.f14965d;
        if (obj == null) {
            if (AbstractC0868r2.f14964i) {
                c0833i22 = new C0833i2(z9, new CancellationException("Future.cancel() was called."));
            } else {
                if (z9) {
                    c0833i2 = C0833i2.f14864c;
                } else {
                    c0833i2 = C0833i2.f14865d;
                }
                c0833i22 = c0833i2;
                Objects.requireNonNull(c0833i22);
            }
            if (AbstractC0868r2.j.r(this, obj, c0833i22)) {
                z(this);
                return true;
            }
            return false;
        }
        return false;
    }

    @Override // java.util.concurrent.Future
    public final Object get() {
        Object obj;
        if (!Thread.interrupted()) {
            Object obj2 = this.f14965d;
            if (obj2 != null) {
                return u(obj2);
            }
            C0865q2 c0865q2 = this.f14967f;
            C0865q2 c0865q22 = C0865q2.f14957c;
            if (c0865q2 != c0865q22) {
                C0865q2 c0865q23 = new C0865q2();
                do {
                    J j = AbstractC0868r2.j;
                    j.m(c0865q23, c0865q2);
                    if (j.s(this, c0865q2, c0865q23)) {
                        do {
                            LockSupport.park(this);
                            if (!Thread.interrupted()) {
                                obj = this.f14965d;
                            } else {
                                t(c0865q23);
                                throw new InterruptedException();
                            }
                        } while (obj == null);
                        return u(obj);
                    }
                    c0865q2 = this.f14967f;
                } while (c0865q2 != c0865q22);
            }
            Object obj3 = this.f14965d;
            Objects.requireNonNull(obj3);
            return u(obj3);
        }
        throw new InterruptedException();
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.f14965d instanceof C0833i2;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return this.f14965d != null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x006d, code lost:
    
        if (r3.isEmpty() != false) goto L17;
     */
    @Override // com.google.android.gms.internal.cast.J
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
            java.lang.Object r1 = r6.f14965d
            boolean r1 = r1 instanceof com.google.android.gms.internal.cast.C0833i2
            java.lang.String r2 = "]"
            if (r1 == 0) goto L4f
            java.lang.String r1 = "CANCELLED"
            r0.append(r1)
            goto La9
        L4f:
            boolean r1 = r6.isDone()
            if (r1 == 0) goto L59
            r6.y(r0)
            goto La9
        L59:
            int r1 = r0.length()
            java.lang.String r3 = "PENDING"
            r0.append(r3)
            java.lang.String r3 = r6.v()     // Catch: java.lang.Throwable -> L71
            r4 = 0
            if (r3 == 0) goto L6f
            boolean r5 = r3.isEmpty()     // Catch: java.lang.Throwable -> L71
            if (r5 == 0) goto L8c
        L6f:
            r3 = r4
            goto L8c
        L71:
            r3 = move-exception
            boolean r4 = r3 instanceof java.lang.Error
            if (r4 == 0) goto L7e
            boolean r4 = r3 instanceof java.lang.StackOverflowError
            if (r4 == 0) goto L7b
            goto L7e
        L7b:
            java.lang.Error r3 = (java.lang.Error) r3
            throw r3
        L7e:
            java.lang.Class r3 = r3.getClass()
            java.lang.String r3 = java.lang.String.valueOf(r3)
            java.lang.String r4 = "Exception thrown from implementation: "
            java.lang.String r3 = r4.concat(r3)
        L8c:
            if (r3 == 0) goto L99
            java.lang.String r4 = ", info=["
            r0.append(r4)
            r0.append(r3)
            r0.append(r2)
        L99:
            boolean r3 = r6.isDone()
            if (r3 == 0) goto La9
            int r3 = r0.length()
            r0.delete(r1, r3)
            r6.y(r0)
        La9:
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.cast.AbstractC0849m2.toString():java.lang.String");
    }

    public abstract String v();

    public void w() {
    }

    public final void y(StringBuilder sb) {
        try {
            Object x5 = x(this);
            sb.append("SUCCESS, result=[");
            if (x5 == null) {
                sb.append("null");
            } else if (x5 == this) {
                sb.append("this future");
            } else {
                sb.append(x5.getClass().getName());
                sb.append("@");
                sb.append(Integer.toHexString(System.identityHashCode(x5)));
            }
            sb.append("]");
        } catch (CancellationException unused) {
            sb.append("CANCELLED");
        } catch (ExecutionException e8) {
            sb.append("FAILURE, cause=[");
            sb.append(e8.getCause());
            sb.append("]");
        } catch (Exception e9) {
            sb.append("UNKNOWN, cause=[");
            sb.append(e9.getClass());
            sb.append(" thrown from get()]");
        }
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j, TimeUnit timeUnit) {
        long nanos = timeUnit.toNanos(j);
        if (!Thread.interrupted()) {
            Object obj = this.f14965d;
            if (obj != null) {
                return u(obj);
            }
            long nanoTime = nanos > 0 ? System.nanoTime() + nanos : 0L;
            if (nanos >= 1000) {
                C0865q2 c0865q2 = this.f14967f;
                C0865q2 c0865q22 = C0865q2.f14957c;
                if (c0865q2 != c0865q22) {
                    C0865q2 c0865q23 = new C0865q2();
                    do {
                        J j4 = AbstractC0868r2.j;
                        j4.m(c0865q23, c0865q2);
                        if (j4.s(this, c0865q2, c0865q23)) {
                            do {
                                LockSupport.parkNanos(this, Math.min(nanos, 2147483647999999999L));
                                if (!Thread.interrupted()) {
                                    Object obj2 = this.f14965d;
                                    if (obj2 != null) {
                                        return u(obj2);
                                    }
                                    nanos = nanoTime - System.nanoTime();
                                } else {
                                    t(c0865q23);
                                    throw new InterruptedException();
                                }
                            } while (nanos >= 1000);
                            t(c0865q23);
                        } else {
                            c0865q2 = this.f14967f;
                        }
                    } while (c0865q2 != c0865q22);
                }
                Object obj3 = this.f14965d;
                Objects.requireNonNull(obj3);
                return u(obj3);
            }
            while (nanos > 0) {
                Object obj4 = this.f14965d;
                if (obj4 != null) {
                    return u(obj4);
                }
                if (!Thread.interrupted()) {
                    nanos = nanoTime - System.nanoTime();
                } else {
                    throw new InterruptedException();
                }
            }
            String abstractC0849m2 = toString();
            String obj5 = timeUnit.toString();
            Locale locale = Locale.ROOT;
            String lowerCase = obj5.toLowerCase(locale);
            String str = "Waited " + j + " " + timeUnit.toString().toLowerCase(locale);
            if (nanos + 1000 < 0) {
                String concat = str.concat(" (plus ");
                long j9 = -nanos;
                long convert = timeUnit.convert(j9, TimeUnit.NANOSECONDS);
                long nanos2 = j9 - timeUnit.toNanos(convert);
                boolean z9 = true;
                if (convert != 0 && nanos2 <= 1000) {
                    z9 = false;
                }
                if (convert > 0) {
                    String str2 = concat + convert + " " + lowerCase;
                    if (z9) {
                        str2 = str2.concat(",");
                    }
                    concat = str2.concat(" ");
                }
                if (z9) {
                    concat = concat + nanos2 + " nanoseconds ";
                }
                str = concat.concat("delay)");
            }
            if (isDone()) {
                throw new TimeoutException(str.concat(" but future completed as timeout expired"));
            }
            throw new TimeoutException(AbstractC0953k1.o(str, " for ", abstractC0849m2));
        }
        throw new InterruptedException();
    }
}
