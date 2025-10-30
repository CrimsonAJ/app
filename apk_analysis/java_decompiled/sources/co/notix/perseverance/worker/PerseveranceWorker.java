package co.notix.perseverance.worker;

import Y7.InterfaceC0484z;
import android.content.Context;
import androidx.work.WorkerParameters;
import co.notix.ap;
import co.notix.ej;
import co.notix.fj;
import co.notix.worker.SelfRestartingWorker;
import co.notix.wq;
import g8.a;
import g8.e;
import kotlin.jvm.internal.h;

/* loaded from: classes.dex */
public final class PerseveranceWorker extends SelfRestartingWorker {

    /* renamed from: d, reason: collision with root package name */
    public static final a f12959d = e.a();

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC0484z f12960a;

    /* renamed from: b, reason: collision with root package name */
    public final ej f12961b;

    /* renamed from: c, reason: collision with root package name */
    public final fj f12962c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PerseveranceWorker(Context appContext, WorkerParameters workerParams) {
        super(appContext, workerParams);
        h.e(appContext, "appContext");
        h.e(workerParams, "workerParams");
        this.f12960a = wq.f().b();
        this.f12961b = wq.y();
        this.f12962c = wq.z();
    }

    /* JADX WARN: Code restructure failed: missing block: B:67:0x006b, code lost:
    
        if (r12 == r1) goto L70;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:7:0x0024. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:11:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x01b6 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0191  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(co.notix.perseverance.worker.PerseveranceWorker r11, E7.d r12) {
        /*
            Method dump skipped, instructions count: 460
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: co.notix.perseverance.worker.PerseveranceWorker.a(co.notix.perseverance.worker.PerseveranceWorker, E7.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0071 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:13:0x006b -> B:10:0x006e). Please report as a decompilation issue!!! */
    @Override // co.notix.worker.SelfRestartingWorker
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(E7.d r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof co.notix.kj
            if (r0 == 0) goto L13
            r0 = r7
            co.notix.kj r0 = (co.notix.kj) r0
            int r1 = r0.f12617d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f12617d = r1
            goto L18
        L13:
            co.notix.kj r0 = new co.notix.kj
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.f12615b
            F7.a r1 = F7.a.f2587a
            int r2 = r0.f12617d
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L32
            if (r2 != r4) goto L2a
            co.notix.perseverance.worker.PerseveranceWorker r2 = r0.f12614a
            a.AbstractC0485a.A(r7)
            goto L6e
        L2a:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L32:
            a.AbstractC0485a.A(r7)
            co.notix.kd r7 = co.notix.md.f12779a
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r5 = "perseverance: begin. runAttemptCount == "
            r2.<init>(r5)
            int r5 = r6.getRunAttemptCount()
            r2.append(r5)
            java.lang.String r5 = ", "
            r2.append(r5)
            r2.append(r6)
            java.lang.String r2 = r2.toString()
            r7.b(r2)
            r2 = r6
            r7 = r3
        L56:
            if (r7 != 0) goto L71
            Y7.z r7 = r2.f12960a
            E7.i r7 = r7.g()
            co.notix.lj r5 = new co.notix.lj
            r5.<init>(r2, r3)
            r0.f12614a = r2
            r0.f12617d = r4
            java.lang.Object r7 = Y7.B.C(r7, r5, r0)
            if (r7 != r1) goto L6e
            return r1
        L6e:
            co.notix.pr r7 = (co.notix.pr) r7
            goto L56
        L71:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: co.notix.perseverance.worker.PerseveranceWorker.b(E7.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // co.notix.worker.SelfRestartingWorker
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(E7.d r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof co.notix.gj
            if (r0 == 0) goto L13
            r0 = r8
            co.notix.gj r0 = (co.notix.gj) r0
            int r1 = r0.f12335d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f12335d = r1
            goto L18
        L13:
            co.notix.gj r0 = new co.notix.gj
            r0.<init>(r7, r8)
        L18:
            java.lang.Object r8 = r0.f12333b
            F7.a r1 = F7.a.f2587a
            int r2 = r0.f12335d
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            java.lang.String r0 = r0.f12332a
            a.AbstractC0485a.A(r8)
            goto L44
        L29:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L31:
            a.AbstractC0485a.A(r8)
            co.notix.ej r8 = r7.f12961b
            java.lang.String r2 = "perseverance: finished queue processing."
            r0.f12332a = r2
            r0.f12335d = r3
            java.lang.Object r8 = r8.b(r0)
            if (r8 != r1) goto L43
            return r1
        L43:
            r0 = r2
        L44:
            java.util.List r8 = (java.util.List) r8
            if (r8 == 0) goto Lb6
            boolean r1 = r8.isEmpty()
            if (r1 == 0) goto L4f
            goto Lb6
        L4f:
            java.util.Iterator r1 = r8.iterator()
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto Lb0
            java.lang.Object r2 = r1.next()
            co.notix.ni r2 = (co.notix.ni) r2
            long r2 = r2.f12827d
        L61:
            boolean r4 = r1.hasNext()
            if (r4 == 0) goto L75
            java.lang.Object r4 = r1.next()
            co.notix.ni r4 = (co.notix.ni) r4
            long r4 = r4.f12827d
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 <= 0) goto L61
            r2 = r4
            goto L61
        L75:
            long r4 = java.lang.System.currentTimeMillis()
            long r2 = r2 - r4
            r4 = 0
            int r1 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r1 >= 0) goto L81
            r2 = r4
        L81:
            r1 = 5000(0x1388, float:7.006E-42)
            long r4 = (long) r1
            long r2 = r2 + r4
            co.notix.kd r1 = co.notix.md.f12779a
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r0)
            r0 = 32
            r4.append(r0)
            int r8 = r8.size()
            r4.append(r8)
            java.lang.String r8 = " uncompleted commands. enqueueIn="
            r4.append(r8)
            r4.append(r2)
            r8 = 46
            r4.append(r8)
            java.lang.String r8 = r4.toString()
            r1.b(r8)
            goto Lce
        Lb0:
            java.util.NoSuchElementException r8 = new java.util.NoSuchElementException
            r8.<init>()
            throw r8
        Lb6:
            co.notix.kd r8 = co.notix.md.f12779a
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            java.lang.String r0 = " queue is empty"
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            r8.b(r0)
            r2 = -1
        Lce:
            java.lang.Long r8 = new java.lang.Long
            r8.<init>(r2)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: co.notix.perseverance.worker.PerseveranceWorker.a(E7.d):java.lang.Object");
    }

    @Override // co.notix.worker.SelfRestartingWorker
    public final ap a() {
        return this.f12962c;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(java.lang.String r5, E7.d r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof co.notix.jj
            if (r0 == 0) goto L13
            r0 = r6
            co.notix.jj r0 = (co.notix.jj) r0
            int r1 = r0.f12563c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f12563c = r1
            goto L18
        L13:
            co.notix.jj r0 = new co.notix.jj
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.f12561a
            F7.a r1 = F7.a.f2587a
            int r2 = r0.f12563c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            a.AbstractC0485a.A(r6)
            goto L44
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2f:
            a.AbstractC0485a.A(r6)
            co.notix.kd r6 = co.notix.md.f12779a
            java.lang.String r2 = "perseverance: Unknown command type"
            co.notix.ld.a(r6, r2)
            co.notix.ej r6 = r4.f12961b
            r0.f12563c = r3
            java.lang.Object r5 = r6.a(r5, r0)
            if (r5 != r1) goto L44
            return r1
        L44:
            r5 = 0
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: co.notix.perseverance.worker.PerseveranceWorker.a(java.lang.String, E7.d):java.lang.Object");
    }
}
