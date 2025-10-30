package co.notix;

import Y7.InterfaceC0484z;
import co.notix.push.pull.PullWorker;

/* loaded from: classes.dex */
public final class zk extends ap {

    /* renamed from: b, reason: collision with root package name */
    public final sk f13691b;

    /* renamed from: c, reason: collision with root package name */
    public final mq f13692c;

    /* renamed from: d, reason: collision with root package name */
    public final InterfaceC0484z f13693d;

    /* renamed from: e, reason: collision with root package name */
    public final lf f13694e;

    /* renamed from: f, reason: collision with root package name */
    public final na f13695f;

    /* renamed from: g, reason: collision with root package name */
    public final Class f13696g;

    /* renamed from: h, reason: collision with root package name */
    public final String f13697h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zk(d9 contextProvider, sk pullManagerStorage, mq settingsRepository, InterfaceC0484z cs, lf notificationsPermissionController, ra fcmTokenRepository) {
        super(contextProvider);
        kotlin.jvm.internal.h.e(contextProvider, "contextProvider");
        kotlin.jvm.internal.h.e(pullManagerStorage, "pullManagerStorage");
        kotlin.jvm.internal.h.e(settingsRepository, "settingsRepository");
        kotlin.jvm.internal.h.e(cs, "cs");
        kotlin.jvm.internal.h.e(notificationsPermissionController, "notificationsPermissionController");
        kotlin.jvm.internal.h.e(fcmTokenRepository, "fcmTokenRepository");
        this.f13691b = pullManagerStorage;
        this.f13692c = settingsRepository;
        this.f13693d = cs;
        this.f13694e = notificationsPermissionController;
        this.f13695f = fcmTokenRepository;
        this.f13696g = PullWorker.class;
        this.f13697h = "notix_pull";
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x00b1, code lost:
    
        if (r14.c(r6, r0) != r1) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0075, code lost:
    
        if (r11.a(r0) == r1) goto L43;
     */
    /* JADX WARN: Removed duplicated region for block: B:30:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(co.notix.zk r11, int r12, long r13, E7.d r15) {
        /*
            Method dump skipped, instructions count: 207
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: co.notix.zk.a(co.notix.zk, int, long, E7.d):java.lang.Object");
    }

    @Override // co.notix.ap
    public final Class b() {
        return this.f13696g;
    }

    @Override // co.notix.ap
    public final String a() {
        return this.f13697h;
    }
}
