package co.notix.lsi;

import android.app.NotificationManager;
import android.content.Context;
import androidx.work.WorkerParameters;
import co.notix.ap;
import co.notix.ed;
import co.notix.gd;
import co.notix.mq;
import co.notix.worker.SelfRestartingWorker;
import co.notix.wq;
import kotlin.jvm.internal.h;

/* loaded from: classes.dex */
public final class LockScreenInterstitialWorker extends SelfRestartingWorker {

    /* renamed from: a, reason: collision with root package name */
    public final mq f12747a;

    /* renamed from: b, reason: collision with root package name */
    public final ed f12748b;

    /* renamed from: c, reason: collision with root package name */
    public final NotificationManager f12749c;

    /* renamed from: d, reason: collision with root package name */
    public final gd f12750d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LockScreenInterstitialWorker(Context appContext, WorkerParameters params) {
        super(appContext, params);
        h.e(appContext, "appContext");
        h.e(params, "params");
        this.f12747a = wq.E();
        this.f12748b = wq.k();
        Object systemService = appContext.getSystemService("notification");
        h.c(systemService, "null cannot be cast to non-null type android.app.NotificationManager");
        this.f12749c = (NotificationManager) systemService;
        this.f12750d = wq.l();
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x005d, code lost:
    
        if (r7 == r1) goto L25;
     */
    /* JADX WARN: Removed duplicated region for block: B:27:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // co.notix.worker.SelfRestartingWorker
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(E7.d r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof co.notix.hd
            if (r0 == 0) goto L13
            r0 = r7
            co.notix.hd r0 = (co.notix.hd) r0
            int r1 = r0.f12375d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f12375d = r1
            goto L18
        L13:
            co.notix.hd r0 = new co.notix.hd
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.f12373b
            F7.a r1 = F7.a.f2587a
            int r2 = r0.f12375d
            r3 = 0
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L39
            if (r2 == r5) goto L33
            if (r2 != r4) goto L2b
            a.AbstractC0485a.A(r7)
            goto L60
        L2b:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L33:
            co.notix.lsi.LockScreenInterstitialWorker r2 = r0.f12372a
            a.AbstractC0485a.A(r7)
            goto L4a
        L39:
            a.AbstractC0485a.A(r7)
            co.notix.ed r7 = r6.f12748b
            r0.f12372a = r6
            r0.f12375d = r5
            java.lang.Object r7 = r7.a(r0)
            if (r7 != r1) goto L49
            goto L5f
        L49:
            r2 = r6
        L4a:
            java.lang.Long r7 = (java.lang.Long) r7
            if (r7 == 0) goto L53
            long r0 = r7.longValue()
            goto L7f
        L53:
            co.notix.mq r7 = r2.f12747a
            r0.f12372a = r3
            r0.f12375d = r4
            java.lang.Object r7 = r7.d(r0)
            if (r7 != r1) goto L60
        L5f:
            return r1
        L60:
            co.notix.mp r7 = (co.notix.mp) r7
            if (r7 == 0) goto L75
            java.lang.Long r7 = r7.f12796a
            if (r7 == 0) goto L75
            long r0 = r7.longValue()
            r2 = 60000(0xea60, double:2.9644E-319)
            long r0 = r0 * r2
            java.lang.Long r3 = new java.lang.Long
            r3.<init>(r0)
        L75:
            if (r3 == 0) goto L7c
            long r0 = r3.longValue()
            goto L7f
        L7c:
            r0 = 3600000(0x36ee80, double:1.7786363E-317)
        L7f:
            java.lang.Long r7 = new java.lang.Long
            r7.<init>(r0)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: co.notix.lsi.LockScreenInterstitialWorker.a(E7.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00f9 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00b2 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0075 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002b  */
    @Override // co.notix.worker.SelfRestartingWorker
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(E7.d r19) {
        /*
            Method dump skipped, instructions count: 496
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: co.notix.lsi.LockScreenInterstitialWorker.b(E7.d):java.lang.Object");
    }

    @Override // co.notix.worker.SelfRestartingWorker
    public final ap a() {
        return this.f12750d;
    }
}
