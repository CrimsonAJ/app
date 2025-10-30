package co.notix.periodicworker;

import E7.d;
import Y7.InterfaceC0484z;
import android.content.Context;
import androidx.work.WorkerParameters;
import co.notix.ap;
import co.notix.c8;
import co.notix.ei;
import co.notix.jp;
import co.notix.l4;
import co.notix.lm;
import co.notix.worker.SelfRestartingWorker;
import co.notix.wq;
import co.notix.xq;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.h;

/* loaded from: classes.dex */
public final class PeriodicWorker extends SelfRestartingWorker {

    /* renamed from: a, reason: collision with root package name */
    public final jp f12952a;

    /* renamed from: b, reason: collision with root package name */
    public final lm f12953b;

    /* renamed from: c, reason: collision with root package name */
    public final xq f12954c;

    /* renamed from: d, reason: collision with root package name */
    public final InterfaceC0484z f12955d;

    /* renamed from: e, reason: collision with root package name */
    public final l4 f12956e;

    /* renamed from: f, reason: collision with root package name */
    public final c8 f12957f;

    /* renamed from: g, reason: collision with root package name */
    public final ei f12958g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PeriodicWorker(Context appContext, WorkerParameters params) {
        super(appContext, params);
        h.e(appContext, "appContext");
        h.e(params, "params");
        this.f12952a = wq.D();
        this.f12953b = wq.C();
        this.f12954c = wq.F();
        this.f12955d = wq.f().b();
        this.f12956e = wq.b();
        this.f12957f = wq.d();
        this.f12958g = wq.x();
    }

    @Override // co.notix.worker.SelfRestartingWorker
    public final Object a(d dVar) {
        this.f12954c.getClass();
        long j = wq.f13475b.a().getSharedPreferences("NOTIX_PREF_STORAGE", 0).getLong("NOTIX_PERIODIC_WORKER_RUN_COUNT", 0L);
        return new Long(TimeUnit.MINUTES.toMillis(j == 1 ? 5L : j == 2 ? 20L : 60L));
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // co.notix.worker.SelfRestartingWorker
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(E7.d r12) {
        /*
            r11 = this;
            r0 = 3
            r1 = 0
            r2 = 1
            boolean r3 = r12 instanceof co.notix.fi
            if (r3 == 0) goto L16
            r3 = r12
            co.notix.fi r3 = (co.notix.fi) r3
            int r4 = r3.f12264c
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            r6 = r4 & r5
            if (r6 == 0) goto L16
            int r4 = r4 - r5
            r3.f12264c = r4
            goto L1b
        L16:
            co.notix.fi r3 = new co.notix.fi
            r3.<init>(r11, r12)
        L1b:
            java.lang.Object r12 = r3.f12262a
            F7.a r4 = F7.a.f2587a
            int r5 = r3.f12264c
            if (r5 == 0) goto L32
            if (r5 != r2) goto L2a
            a.AbstractC0485a.A(r12)
            goto Lb6
        L2a:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r0)
            throw r12
        L32:
            a.AbstractC0485a.A(r12)
            co.notix.xq r12 = r11.f12954c
            r12.getClass()
            co.notix.d9 r12 = co.notix.wq.f13475b
            android.content.Context r5 = r12.a()
            java.lang.String r6 = "NOTIX_PREF_STORAGE"
            android.content.SharedPreferences r5 = r5.getSharedPreferences(r6, r1)
            java.lang.String r6 = "NOTIX_PERIODIC_WORKER_RUN_COUNT"
            r7 = 0
            long r7 = r5.getLong(r6, r7)
            co.notix.xq r5 = r11.f12954c
            r9 = 1
            long r9 = r9 + r7
            r5.getClass()
            android.content.Context r12 = r12.a()
            co.notix.xq.a(r12, r6, r9)
            co.notix.kd r12 = co.notix.md.f12779a
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r6 = "periodic worker: doWork begin. runCount="
            r5.<init>(r6)
            r5.append(r7)
            java.lang.String r5 = r5.toString()
            r12.b(r5)
            Y7.z r12 = r11.f12955d
            co.notix.gi r5 = new co.notix.gi
            r6 = 0
            r5.<init>(r11, r6)
            Y7.y0 r12 = Y7.B.r(r12, r6, r5, r0)
            Y7.z r5 = r11.f12955d
            co.notix.hi r7 = new co.notix.hi
            r7.<init>(r11, r6)
            Y7.y0 r5 = Y7.B.r(r5, r6, r7, r0)
            Y7.z r7 = r11.f12955d
            co.notix.ii r8 = new co.notix.ii
            r8.<init>(r11, r6)
            Y7.y0 r7 = Y7.B.r(r7, r6, r8, r0)
            Y7.z r8 = r11.f12955d
            co.notix.ji r9 = new co.notix.ji
            r9.<init>(r11, r6)
            Y7.y0 r6 = Y7.B.r(r8, r6, r9, r0)
            r8 = 4
            Y7.h0[] r8 = new Y7.InterfaceC0465h0[r8]
            r8[r1] = r12
            r8[r2] = r5
            r12 = 2
            r8[r12] = r7
            r8[r0] = r6
            java.util.List r12 = B7.l.b0(r8)
            r3.f12264c = r2
            java.lang.Object r12 = Y7.B.q(r12, r3)
            if (r12 != r4) goto Lb6
            return r4
        Lb6:
            co.notix.kd r12 = co.notix.md.f12779a
            r12.getClass()
            co.notix.x8 r12 = r12.f12607b
            java.lang.String r0 = "periodic worker: doWork ending..."
            r12.b(r0)
            co.notix.nr r12 = co.notix.nr.f12843a
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: co.notix.periodicworker.PeriodicWorker.b(E7.d):java.lang.Object");
    }

    @Override // co.notix.worker.SelfRestartingWorker
    public final ap a() {
        return this.f12958g;
    }
}
