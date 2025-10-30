package co.notix.push.pull;

import android.content.Context;
import androidx.work.WorkerParameters;
import co.notix.ap;
import co.notix.df;
import co.notix.l2;
import co.notix.mq;
import co.notix.sk;
import co.notix.worker.SelfRestartingWorker;
import co.notix.wq;
import co.notix.zk;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.h;

/* loaded from: classes.dex */
public final class PullWorker extends SelfRestartingWorker {

    /* renamed from: f, reason: collision with root package name */
    public static final long f13003f = TimeUnit.DAYS.toMillis(1);

    /* renamed from: g, reason: collision with root package name */
    public static final long f13004g = TimeUnit.MINUTES.toMillis(15);

    /* renamed from: a, reason: collision with root package name */
    public final df f13005a;

    /* renamed from: b, reason: collision with root package name */
    public final l2 f13006b;

    /* renamed from: c, reason: collision with root package name */
    public final sk f13007c;

    /* renamed from: d, reason: collision with root package name */
    public final mq f13008d;

    /* renamed from: e, reason: collision with root package name */
    public final zk f13009e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PullWorker(Context appContext, WorkerParameters params) {
        super(appContext, params);
        h.e(appContext, "appContext");
        h.e(params, "params");
        this.f13005a = wq.m();
        this.f13006b = wq.a();
        this.f13007c = wq.A();
        this.f13008d = wq.E();
        this.f13009e = wq.B();
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    @Override // co.notix.worker.SelfRestartingWorker
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(E7.d r21) {
        /*
            Method dump skipped, instructions count: 340
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: co.notix.push.pull.PullWorker.a(E7.d):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0085, code lost:
    
        if (r7 == r1) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0068, code lost:
    
        if (r7 != r1) goto L25;
     */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // co.notix.worker.SelfRestartingWorker
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(E7.d r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof co.notix.bl
            if (r0 == 0) goto L13
            r0 = r7
            co.notix.bl r0 = (co.notix.bl) r0
            int r1 = r0.f11948d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f11948d = r1
            goto L18
        L13:
            co.notix.bl r0 = new co.notix.bl
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.f11946b
            F7.a r1 = F7.a.f2587a
            int r2 = r0.f11948d
            r3 = 3
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L41
            if (r2 == r5) goto L3b
            if (r2 == r4) goto L35
            if (r2 != r3) goto L2d
            a.AbstractC0485a.A(r7)
            goto L88
        L2d:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L35:
            co.notix.push.pull.PullWorker r2 = r0.f11945a
            a.AbstractC0485a.A(r7)
            goto L6b
        L3b:
            co.notix.push.pull.PullWorker r2 = r0.f11945a
            a.AbstractC0485a.A(r7)
            goto L5e
        L41:
            a.AbstractC0485a.A(r7)
            co.notix.kd r7 = co.notix.md.f12779a
            r7.getClass()
            co.notix.x8 r7 = r7.f12607b
            java.lang.String r2 = "PullWorker: doWork begin"
            r7.b(r2)
            co.notix.l2 r7 = r6.f13006b
            r0.f11945a = r6
            r0.f11948d = r5
            java.lang.Object r7 = r7.f(r0)
            if (r7 != r1) goto L5d
            goto L87
        L5d:
            r2 = r6
        L5e:
            co.notix.df r7 = r2.f13005a
            r0.f11945a = r2
            r0.f11948d = r4
            java.lang.Object r7 = r7.a(r0)
            if (r7 != r1) goto L6b
            goto L87
        L6b:
            co.notix.v8 r7 = (co.notix.v8) r7
            co.notix.v8 r4 = co.notix.v8.SUCCESS
            if (r7 != r4) goto L8b
            r7 = 0
            r0.f11945a = r7
            r0.f11948d = r3
            co.notix.sk r7 = r2.f13007c
            long r2 = java.lang.System.currentTimeMillis()
            java.lang.Object r7 = r7.a(r2, r0)
            if (r7 != r1) goto L83
            goto L85
        L83:
            A7.n r7 = A7.n.f558a
        L85:
            if (r7 != r1) goto L88
        L87:
            return r1
        L88:
            co.notix.nr r7 = co.notix.nr.f12843a
            goto L8d
        L8b:
            co.notix.mr r7 = co.notix.mr.f12803a
        L8d:
            co.notix.kd r0 = co.notix.md.f12779a
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "PullWorker: doWork end. workerResult="
            r1.<init>(r2)
            r1.append(r7)
            java.lang.String r1 = r1.toString()
            r0.b(r1)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: co.notix.push.pull.PullWorker.b(E7.d):java.lang.Object");
    }

    @Override // co.notix.worker.SelfRestartingWorker
    public final ap a() {
        return this.f13009e;
    }
}
