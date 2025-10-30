package d7;

import android.util.Log;
import f5.AbstractC1176h;
import f5.C1185q;
import java.util.HashMap;
import java.util.Objects;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: d, reason: collision with root package name */
    public static final HashMap f16891d = new HashMap();

    /* renamed from: e, reason: collision with root package name */
    public static final C0.e f16892e = new C0.e(0);

    /* renamed from: a, reason: collision with root package name */
    public final Executor f16893a;

    /* renamed from: b, reason: collision with root package name */
    public final n f16894b;

    /* renamed from: c, reason: collision with root package name */
    public C1185q f16895c = null;

    public d(Executor executor, n nVar) {
        this.f16893a = executor;
        this.f16894b = nVar;
    }

    public static Object a(AbstractC1176h abstractC1176h) {
        TimeUnit timeUnit = TimeUnit.SECONDS;
        c cVar = new c(0);
        Executor executor = f16892e;
        abstractC1176h.d(executor, cVar);
        abstractC1176h.c(executor, cVar);
        abstractC1176h.a(executor, cVar);
        if (cVar.f16890b.await(5L, timeUnit)) {
            if (abstractC1176h.j()) {
                return abstractC1176h.g();
            }
            throw new ExecutionException(abstractC1176h.f());
        }
        throw new TimeoutException("Task await timed out.");
    }

    public static synchronized d d(Executor executor, n nVar) {
        d dVar;
        synchronized (d.class) {
            try {
                String str = nVar.f16957b;
                HashMap hashMap = f16891d;
                if (!hashMap.containsKey(str)) {
                    hashMap.put(str, new d(executor, nVar));
                }
                dVar = (d) hashMap.get(str);
            } catch (Throwable th) {
                throw th;
            }
        }
        return dVar;
    }

    public final synchronized AbstractC1176h b() {
        try {
            C1185q c1185q = this.f16895c;
            if (c1185q != null) {
                if (c1185q.i() && !this.f16895c.j()) {
                }
            }
            Executor executor = this.f16893a;
            n nVar = this.f16894b;
            Objects.requireNonNull(nVar);
            this.f16895c = s8.n.e(executor, new G6.d(2, nVar));
        } catch (Throwable th) {
            throw th;
        }
        return this.f16895c;
    }

    public final e c() {
        synchronized (this) {
            try {
                C1185q c1185q = this.f16895c;
                if (c1185q != null && c1185q.j()) {
                    return (e) this.f16895c.g();
                }
                try {
                    AbstractC1176h b9 = b();
                    TimeUnit timeUnit = TimeUnit.SECONDS;
                    return (e) a(b9);
                } catch (InterruptedException | ExecutionException | TimeoutException e8) {
                    Log.d("FirebaseRemoteConfig", "Reading from storage file failed.", e8);
                    return null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
