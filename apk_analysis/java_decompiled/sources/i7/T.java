package i7;

import l6.C1574f;

/* loaded from: classes.dex */
public final class T implements P {

    /* renamed from: f, reason: collision with root package name */
    public static final double f18790f = Math.random();

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ int f18791g = 0;

    /* renamed from: a, reason: collision with root package name */
    public final C1574f f18792a;

    /* renamed from: b, reason: collision with root package name */
    public final T6.e f18793b;

    /* renamed from: c, reason: collision with root package name */
    public final m7.j f18794c;

    /* renamed from: d, reason: collision with root package name */
    public final C1397l f18795d;

    /* renamed from: e, reason: collision with root package name */
    public final E7.i f18796e;

    public T(C1574f firebaseApp, T6.e firebaseInstallations, m7.j sessionSettings, C1397l eventGDTLogger, E7.i backgroundDispatcher) {
        kotlin.jvm.internal.h.e(firebaseApp, "firebaseApp");
        kotlin.jvm.internal.h.e(firebaseInstallations, "firebaseInstallations");
        kotlin.jvm.internal.h.e(sessionSettings, "sessionSettings");
        kotlin.jvm.internal.h.e(eventGDTLogger, "eventGDTLogger");
        kotlin.jvm.internal.h.e(backgroundDispatcher, "backgroundDispatcher");
        this.f18792a = firebaseApp;
        this.f18793b = firebaseInstallations;
        this.f18794c = sessionSettings;
        this.f18795d = eventGDTLogger;
        this.f18796e = backgroundDispatcher;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(i7.T r5, G7.c r6) {
        /*
            boolean r0 = r6 instanceof i7.S
            if (r0 == 0) goto L13
            r0 = r6
            i7.S r0 = (i7.S) r0
            int r1 = r0.f18789u
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f18789u = r1
            goto L18
        L13:
            i7.S r0 = new i7.S
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.f18787s
            F7.a r1 = F7.a.f2587a
            int r2 = r0.f18789u
            r3 = 1
            java.lang.String r4 = "SessionFirelogPublisher"
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            i7.T r5 = r0.f18786r
            a.AbstractC0485a.A(r6)
            goto L48
        L2b:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L33:
            a.AbstractC0485a.A(r6)
            java.lang.String r6 = "Data Collection is enabled for at least one Subscriber"
            android.util.Log.d(r4, r6)
            r0.f18786r = r5
            r0.f18789u = r3
            m7.j r6 = r5.f18794c
            java.lang.Object r6 = r6.b(r0)
            if (r6 != r1) goto L48
            return r1
        L48:
            m7.j r6 = r5.f18794c
            m7.o r0 = r6.f20899a
            java.lang.Boolean r0 = r0.a()
            if (r0 == 0) goto L57
            boolean r3 = r0.booleanValue()
            goto L63
        L57:
            m7.o r6 = r6.f20900b
            java.lang.Boolean r6 = r6.a()
            if (r6 == 0) goto L63
            boolean r3 = r6.booleanValue()
        L63:
            if (r3 != 0) goto L6d
            java.lang.String r5 = "Sessions SDK disabled. Events will not be sent."
            android.util.Log.d(r4, r5)
            java.lang.Boolean r5 = java.lang.Boolean.FALSE
            return r5
        L6d:
            m7.j r5 = r5.f18794c
            double r5 = r5.a()
            double r0 = i7.T.f18790f
            int r5 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r5 > 0) goto L7c
            java.lang.Boolean r5 = java.lang.Boolean.TRUE
            return r5
        L7c:
            java.lang.String r5 = "Sessions SDK has dropped this session due to sampling."
            android.util.Log.d(r4, r5)
            java.lang.Boolean r5 = java.lang.Boolean.FALSE
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: i7.T.a(i7.T, G7.c):java.lang.Object");
    }
}
