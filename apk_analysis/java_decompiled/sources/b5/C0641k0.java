package b5;

import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

/* renamed from: b5.k0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0641k0 extends FutureTask implements Comparable {

    /* renamed from: a, reason: collision with root package name */
    public final long f11168a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f11169b;

    /* renamed from: c, reason: collision with root package name */
    public final String f11170c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ C0647m0 f11171d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0641k0(C0647m0 c0647m0, Runnable runnable, boolean z9, String str) {
        super(runnable, null);
        this.f11171d = c0647m0;
        long andIncrement = C0647m0.f11187k.getAndIncrement();
        this.f11168a = andIncrement;
        this.f11170c = str;
        this.f11169b = z9;
        if (andIncrement == Long.MAX_VALUE) {
            V v8 = ((C0650n0) c0647m0.f1707a).f11229i;
            C0650n0.f(v8);
            v8.f10971f.b("Tasks index overflow");
        }
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        C0641k0 c0641k0 = (C0641k0) obj;
        boolean z9 = c0641k0.f11169b;
        boolean z10 = this.f11169b;
        if (z10 != z9) {
            if (z10) {
                return -1;
            }
            return 1;
        }
        long j = this.f11168a;
        long j4 = c0641k0.f11168a;
        if (j < j4) {
            return -1;
        }
        if (j > j4) {
            return 1;
        }
        V v8 = ((C0650n0) this.f11171d.f1707a).f11229i;
        C0650n0.f(v8);
        v8.f10972g.c(Long.valueOf(j), "Two tasks share the same index. index");
        return 0;
    }

    @Override // java.util.concurrent.FutureTask
    public final void setException(Throwable th) {
        V v8 = ((C0650n0) this.f11171d.f1707a).f11229i;
        C0650n0.f(v8);
        v8.f10971f.c(th, this.f11170c);
        super.setException(th);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0641k0(C0647m0 c0647m0, Callable callable, boolean z9) {
        super(callable);
        this.f11171d = c0647m0;
        long andIncrement = C0647m0.f11187k.getAndIncrement();
        this.f11168a = andIncrement;
        this.f11170c = "Task exception on worker thread";
        this.f11169b = z9;
        if (andIncrement == Long.MAX_VALUE) {
            V v8 = ((C0650n0) c0647m0.f1707a).f11229i;
            C0650n0.f(v8);
            v8.f10971f.b("Tasks index overflow");
        }
    }
}
