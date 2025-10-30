package co.notix;

import android.content.Context;

/* loaded from: classes.dex */
public final class df implements xe {

    /* renamed from: a, reason: collision with root package name */
    public final ia f12091a;

    /* renamed from: b, reason: collision with root package name */
    public final kl f12092b;

    /* renamed from: c, reason: collision with root package name */
    public final vk f12093c;

    /* renamed from: d, reason: collision with root package name */
    public final y8 f12094d;

    /* renamed from: e, reason: collision with root package name */
    public final ef f12095e;

    /* renamed from: f, reason: collision with root package name */
    public final t7 f12096f;

    /* renamed from: g, reason: collision with root package name */
    public final lf f12097g;

    /* renamed from: h, reason: collision with root package name */
    public final mg f12098h;

    public df(ia reporter, kl pushRepository, vk pullRepository, d9 contextProvider, ef notificationModifierProvider, c8 cachingImageLoader, lf notificationsPermissionController, mg notixCallbackExecutor) {
        kotlin.jvm.internal.h.e(reporter, "reporter");
        kotlin.jvm.internal.h.e(pushRepository, "pushRepository");
        kotlin.jvm.internal.h.e(pullRepository, "pullRepository");
        kotlin.jvm.internal.h.e(contextProvider, "contextProvider");
        kotlin.jvm.internal.h.e(notificationModifierProvider, "notificationModifierProvider");
        kotlin.jvm.internal.h.e(cachingImageLoader, "cachingImageLoader");
        kotlin.jvm.internal.h.e(notificationsPermissionController, "notificationsPermissionController");
        kotlin.jvm.internal.h.e(notixCallbackExecutor, "notixCallbackExecutor");
        this.f12091a = reporter;
        this.f12092b = pushRepository;
        this.f12093c = pullRepository;
        this.f12094d = contextProvider;
        this.f12095e = notificationModifierProvider;
        this.f12096f = cachingImageLoader;
        this.f12097g = notificationsPermissionController;
        this.f12098h = notixCallbackExecutor;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(E7.d r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof co.notix.ye
            if (r0 == 0) goto L13
            r0 = r6
            co.notix.ye r0 = (co.notix.ye) r0
            int r1 = r0.f13601e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f13601e = r1
            goto L18
        L13:
            co.notix.ye r0 = new co.notix.ye
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.f13599c
            F7.a r1 = F7.a.f2587a
            int r2 = r0.f13601e
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L40
            if (r2 == r4) goto L36
            if (r2 != r3) goto L2e
            co.notix.we r1 = r0.f13598b
            co.notix.df r0 = r0.f13597a
            a.AbstractC0485a.A(r6)
            goto L6c
        L2e:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L36:
            co.notix.df r2 = r0.f13597a
            a.AbstractC0485a.A(r6)
            A7.j r6 = (A7.j) r6
            java.lang.Object r6 = r6.f550a
            goto L51
        L40:
            a.AbstractC0485a.A(r6)
            co.notix.vk r6 = r5.f12093c
            r0.f13597a = r5
            r0.f13601e = r4
            java.lang.Object r6 = r6.a(r0)
            if (r6 != r1) goto L50
            goto L68
        L50:
            r2 = r5
        L51:
            java.lang.Throwable r4 = A7.j.a(r6)
            if (r4 != 0) goto L84
            co.notix.we r6 = (co.notix.we) r6
            if (r6 != 0) goto L5c
            goto L84
        L5c:
            r0.f13597a = r2
            r0.f13598b = r6
            r0.f13601e = r3
            java.lang.Object r0 = r2.b(r6, r0)
            if (r0 != r1) goto L69
        L68:
            return r1
        L69:
            r1 = r6
            r6 = r0
            r0 = r2
        L6c:
            co.notix.v8 r6 = (co.notix.v8) r6
            java.lang.String r1 = r1.f13434n
            if (r1 == 0) goto L83
            co.notix.ia r0 = r0.f12091a
            r0.getClass()
            Y7.z r2 = r0.f12446c
            co.notix.ga r3 = new co.notix.ga
            r4 = 0
            r3.<init>(r0, r1, r4)
            r0 = 3
            Y7.B.r(r2, r4, r3, r0)
        L83:
            return r6
        L84:
            co.notix.v8 r6 = co.notix.v8.RETRY
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: co.notix.df.a(E7.d):java.lang.Object");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(18:10|11|12|(9:(1:15)(1:91)|16|(1:18)(1:90)|19|(2:20|(3:22|(2:24|25)(1:27)|26)(1:28))|29|(1:(3:31|(2:33|(1:35)(1:85))(1:87)|86)(2:88|89))|36|(1:38)(7:69|(3:71|(2:73|74)(1:76)|75)|77|78|(1:80)(1:84)|81|(1:83)))(1:92)|39|(1:41)|42|(2:44|(10:46|(1:48)|(1:50)|51|(1:53)(1:67)|54|55|56|57|(2:59|60)(2:62|63)))|68|(0)|(0)|51|(0)(0)|54|55|56|57|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x034b, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x034c, code lost:
    
        r0 = a.AbstractC0485a.h(r0);
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0193  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x01a3  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x02ab  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x02dc  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x031a  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0322  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0337  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0356  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x035b  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x033b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0289  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0166  */
    /* JADX WARN: Type inference failed for: r10v0 */
    /* JADX WARN: Type inference failed for: r10v1, types: [int] */
    /* JADX WARN: Type inference failed for: r10v3 */
    /* JADX WARN: Type inference failed for: r12v1 */
    /* JADX WARN: Type inference failed for: r12v15 */
    /* JADX WARN: Type inference failed for: r12v2, types: [int] */
    /* JADX WARN: Type inference failed for: r2v22, types: [D.m] */
    /* JADX WARN: Type inference failed for: r3v16, types: [D.j, D.n, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v18 */
    /* JADX WARN: Type inference failed for: r8v2 */
    /* JADX WARN: Type inference failed for: r8v3, types: [int] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(co.notix.we r26, E7.d r27) {
        /*
            Method dump skipped, instructions count: 874
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: co.notix.df.b(co.notix.we, E7.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:134:0x0172  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x01a5  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x025d  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0235  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(co.notix.we r28, E7.d r29) {
        /*
            Method dump skipped, instructions count: 632
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: co.notix.df.a(co.notix.we, E7.d):java.lang.Object");
    }

    public final Context a() {
        return ((d9) this.f12094d).a();
    }
}
