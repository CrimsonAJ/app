package co.notix.lsi;

import A7.n;
import Y7.B;
import Y7.InterfaceC0484z;
import android.app.NotificationManager;
import b8.AbstractC0714M;
import b8.InterfaceC0706E;
import co.notix.ba;
import co.notix.c8;
import co.notix.i;
import co.notix.ia;
import co.notix.j6;
import co.notix.mc;
import co.notix.mg;
import co.notix.mq;
import co.notix.oc;
import co.notix.p8;
import co.notix.tc;
import co.notix.wq;
import kotlin.jvm.internal.h;

/* loaded from: classes.dex */
public final class LockScreenInterstitialActivity extends j6 {

    /* renamed from: D, reason: collision with root package name */
    public static final /* synthetic */ int f12739D = 0;

    /* renamed from: w, reason: collision with root package name */
    public final ia f12743w = wq.g();

    /* renamed from: x, reason: collision with root package name */
    public final mg f12744x = new mg();

    /* renamed from: y, reason: collision with root package name */
    public final c8 f12745y = wq.d();

    /* renamed from: z, reason: collision with root package name */
    public final tc f12746z = wq.j();

    /* renamed from: A, reason: collision with root package name */
    public final mq f12740A = wq.E();

    /* renamed from: B, reason: collision with root package name */
    public final InterfaceC0484z f12741B = wq.f().c();

    /* renamed from: C, reason: collision with root package name */
    public final InterfaceC0706E f12742C = AbstractC0714M.b(2);

    @Override // android.app.Activity
    public final void onResume() {
        super.onResume();
        this.f12742C.d(n.f558a);
    }

    @Override // android.app.Activity
    public final void onStart() {
        super.onStart();
        Object systemService = getSystemService("notification");
        h.c(systemService, "null cannot be cast to non-null type android.app.NotificationManager");
        ((NotificationManager) systemService).cancel(1239241023);
    }

    @Override // co.notix.zb
    public final void a(p8 reason) {
        h.e(reason, "reason");
        ia iaVar = this.f12743w;
        String data = ((i) c()).f12423h;
        iaVar.getClass();
        h.e(data, "data");
        B.r(iaVar.f12446c, null, new ba(iaVar, data, reason, null), 3);
        finish();
    }

    @Override // co.notix.zb
    public final void a(long j) {
        B.r(this.f12741B, null, new mc(this, j, null), 3);
    }

    @Override // co.notix.zb
    public final void a(String data) {
        h.e(data, "data");
        B.r(this.f12741B, null, new oc(this, null), 3);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // co.notix.zb
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(E7.d r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof co.notix.pc
            if (r0 == 0) goto L13
            r0 = r7
            co.notix.pc r0 = (co.notix.pc) r0
            int r1 = r0.f12941d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f12941d = r1
            goto L18
        L13:
            co.notix.pc r0 = new co.notix.pc
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.f12939b
            F7.a r1 = F7.a.f2587a
            int r2 = r0.f12941d
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            co.notix.lsi.LockScreenInterstitialActivity r0 = r0.f12938a
            a.AbstractC0485a.A(r7)
            goto L4d
        L29:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L31:
            a.AbstractC0485a.A(r7)
            Y7.z r7 = r6.f13655b
            co.notix.qc r2 = new co.notix.qc
            r4 = 0
            r2.<init>(r6, r4)
            r5 = 3
            Y7.y0 r7 = Y7.B.r(r7, r4, r2, r5)
            r0.f12938a = r6
            r0.f12941d = r3
            java.lang.Object r7 = r7.N(r0)
            if (r7 != r1) goto L4c
            return r1
        L4c:
            r0 = r6
        L4d:
            co.notix.rc r7 = new co.notix.rc
            r7.<init>(r0)
            r0.f13658e = r7
            co.notix.sc r7 = new co.notix.sc
            r7.<init>(r0)
            r0.f13659f = r7
            A7.n r7 = A7.n.f558a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: co.notix.lsi.LockScreenInterstitialActivity.a(E7.d):java.lang.Object");
    }
}
