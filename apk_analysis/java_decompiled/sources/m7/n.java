package m7;

import X.InterfaceC0408h;
import Y7.B;
import b0.C0584b;

/* loaded from: classes.dex */
public final class n {

    /* renamed from: c, reason: collision with root package name */
    public static final b0.g f20911c = new b0.g("firebase_sessions_enabled");

    /* renamed from: d, reason: collision with root package name */
    public static final b0.g f20912d = new b0.g("firebase_sessions_sampling_rate");

    /* renamed from: e, reason: collision with root package name */
    public static final b0.g f20913e = new b0.g("firebase_sessions_restart_timeout");

    /* renamed from: f, reason: collision with root package name */
    public static final b0.g f20914f = new b0.g("firebase_sessions_cache_duration");

    /* renamed from: g, reason: collision with root package name */
    public static final b0.g f20915g = new b0.g("firebase_sessions_cache_updated_time");

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC0408h f20916a;

    /* renamed from: b, reason: collision with root package name */
    public h f20917b;

    public n(InterfaceC0408h dataStore) {
        kotlin.jvm.internal.h.e(dataStore, "dataStore");
        this.f20916a = dataStore;
        B.v(E7.j.f1978a, new k(this, null));
    }

    public static final void a(n nVar, C0584b c0584b) {
        nVar.getClass();
        nVar.f20917b = new h((Boolean) c0584b.c(f20911c), (Double) c0584b.c(f20912d), (Integer) c0584b.c(f20913e), (Integer) c0584b.c(f20914f), (Long) c0584b.c(f20915g));
    }

    public final boolean b() {
        Integer num;
        h hVar = this.f20917b;
        if (hVar != null) {
            if (hVar != null) {
                Long l9 = hVar.f20894e;
                if (l9 != null && (num = hVar.f20893d) != null && (System.currentTimeMillis() - l9.longValue()) / 1000 < num.intValue()) {
                    return false;
                }
                return true;
            }
            kotlin.jvm.internal.h.h("sessionConfigs");
            throw null;
        }
        kotlin.jvm.internal.h.h("sessionConfigs");
        throw null;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(9:1|(2:3|(7:5|6|7|(1:(1:10)(2:16|17))(3:18|19|(1:21))|11|12|13))|24|6|7|(0)(0)|11|12|13) */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0027, code lost:
    
        r6 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x004a, code lost:
    
        android.util.Log.w("SettingsCache", "Failed to update cache config value: " + r6);
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(b0.g r6, java.lang.Object r7, G7.c r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof m7.l
            if (r0 == 0) goto L13
            r0 = r8
            m7.l r0 = (m7.l) r0
            int r1 = r0.f20906t
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f20906t = r1
            goto L18
        L13:
            m7.l r0 = new m7.l
            r0.<init>(r5, r8)
        L18:
            java.lang.Object r8 = r0.f20904r
            F7.a r1 = F7.a.f2587a
            int r2 = r0.f20906t
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            a.AbstractC0485a.A(r8)     // Catch: java.io.IOException -> L27
            goto L5d
        L27:
            r6 = move-exception
            goto L4a
        L29:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L31:
            a.AbstractC0485a.A(r8)
            X.h r8 = r5.f20916a     // Catch: java.io.IOException -> L27
            m7.m r2 = new m7.m     // Catch: java.io.IOException -> L27
            r4 = 0
            r2.<init>(r7, r6, r5, r4)     // Catch: java.io.IOException -> L27
            r0.f20906t = r3     // Catch: java.io.IOException -> L27
            b0.i r6 = new b0.i     // Catch: java.io.IOException -> L27
            r6.<init>(r2, r4)     // Catch: java.io.IOException -> L27
            java.lang.Object r6 = r8.a(r6, r0)     // Catch: java.io.IOException -> L27
            if (r6 != r1) goto L5d
            return r1
        L4a:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            java.lang.String r8 = "Failed to update cache config value: "
            r7.<init>(r8)
            r7.append(r6)
            java.lang.String r6 = r7.toString()
            java.lang.String r7 = "SettingsCache"
            android.util.Log.w(r7, r6)
        L5d:
            A7.n r6 = A7.n.f558a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: m7.n.c(b0.g, java.lang.Object, G7.c):java.lang.Object");
    }
}
