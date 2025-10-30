package co.notix.worker;

import E7.d;
import android.content.Context;
import androidx.work.CoroutineWorker;
import androidx.work.WorkerParameters;
import co.notix.ap;
import kotlin.jvm.internal.h;

/* loaded from: classes.dex */
public abstract class SelfRestartingWorker extends CoroutineWorker {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SelfRestartingWorker(Context appContext, WorkerParameters params) {
        super(appContext, params);
        h.e(appContext, "appContext");
        h.e(params, "params");
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0089, code lost:
    
        if (r8 == r1) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x008b, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x005e, code lost:
    
        if (r9 == r1) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x004d, code lost:
    
        if (r9 == r1) goto L33;
     */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Object a(co.notix.worker.SelfRestartingWorker r8, E7.d r9) {
        /*
            boolean r0 = r9 instanceof co.notix.bp
            if (r0 == 0) goto L13
            r0 = r9
            co.notix.bp r0 = (co.notix.bp) r0
            int r1 = r0.f11959d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f11959d = r1
            goto L18
        L13:
            co.notix.bp r0 = new co.notix.bp
            r0.<init>(r8, r9)
        L18:
            java.lang.Object r9 = r0.f11957b
            F7.a r1 = F7.a.f2587a
            int r2 = r0.f11959d
            r3 = 3
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L42
            if (r2 == r5) goto L3c
            if (r2 == r4) goto L36
            if (r2 != r3) goto L2e
            a.AbstractC0485a.A(r9)
            goto L9a
        L2e:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L36:
            co.notix.worker.SelfRestartingWorker r8 = r0.f11956a
            a.AbstractC0485a.A(r9)
            goto L61
        L3c:
            co.notix.worker.SelfRestartingWorker r8 = r0.f11956a
            a.AbstractC0485a.A(r9)
            goto L50
        L42:
            a.AbstractC0485a.A(r9)
            r0.f11956a = r8
            r0.f11959d = r5
            java.lang.Object r9 = r8.b(r0)
            if (r9 != r1) goto L50
            goto L8b
        L50:
            co.notix.pr r9 = (co.notix.pr) r9
            boolean r2 = r9 instanceof co.notix.nr
            if (r2 == 0) goto L8c
            r0.f11956a = r8
            r0.f11959d = r4
            java.lang.Object r9 = r8.a(r0)
            if (r9 != r1) goto L61
            goto L8b
        L61:
            java.lang.Number r9 = (java.lang.Number) r9
            long r4 = r9.longValue()
            r6 = -1
            int r9 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r9 == 0) goto L9a
            co.notix.ap r8 = r8.a()
            r9 = 0
            r0.f11956a = r9
            r0.f11959d = r3
            r8.getClass()
            Y7.u0 r2 = Y7.u0.f8857a
            co.notix.wo r3 = new co.notix.wo
            r3.<init>(r8, r4, r9)
            java.lang.Object r8 = Y7.B.C(r2, r3, r0)
            if (r8 != r1) goto L87
            goto L89
        L87:
            A7.n r8 = A7.n.f558a
        L89:
            if (r8 != r1) goto L9a
        L8b:
            return r1
        L8c:
            boolean r8 = r9 instanceof co.notix.mr
            if (r8 == 0) goto L96
            e1.n r8 = new e1.n
            r8.<init>()
            return r8
        L96:
            boolean r8 = r9 instanceof co.notix.or
            if (r8 == 0) goto La2
        L9a:
            e1.o r8 = new e1.o
            e1.h r9 = e1.h.f17049c
            r8.<init>(r9)
            return r8
        La2:
            A7.b r8 = new A7.b
            r8.<init>()
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: co.notix.worker.SelfRestartingWorker.a(co.notix.worker.SelfRestartingWorker, E7.d):java.lang.Object");
    }

    public abstract ap a();

    public abstract Object a(d dVar);

    public abstract Object b(d dVar);

    @Override // androidx.work.CoroutineWorker
    public final Object doWork(d dVar) {
        return a(this, dVar);
    }
}
