package O2;

import y2.C2203a;

/* loaded from: classes.dex */
public final class W {

    /* renamed from: a, reason: collision with root package name */
    public final C2203a f5350a;

    public W(C2203a encryptedPreference) {
        kotlin.jvm.internal.h.e(encryptedPreference, "encryptedPreference");
        this.f5350a = encryptedPreference;
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x00b8, code lost:
    
        if ((r0 instanceof A7.i) != false) goto L32;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final H2.u a() {
        /*
            r20 = this;
            r1 = r20
            y2.a r0 = r1.f5350a
            java.lang.String r2 = "<this>"
            kotlin.jvm.internal.h.e(r0, r2)
            g6.o r2 = g6.o.f17761a
            java.lang.String r2 = r2.h0()
            java.lang.Class<com.anilab.data.model.preference.RecentlyWatchedJson> r3 = com.anilab.data.model.preference.RecentlyWatchedJson.class
            kotlin.jvm.internal.d r4 = kotlin.jvm.internal.p.a(r3)
            java.lang.Class r5 = java.lang.Float.TYPE
            kotlin.jvm.internal.d r5 = kotlin.jvm.internal.p.a(r5)
            boolean r5 = r4.equals(r5)
            android.content.SharedPreferences r6 = r0.f24771a
            r7 = 0
            if (r5 == 0) goto L31
            r0 = 0
            float r0 = r6.getFloat(r2, r0)
            java.lang.Float r0 = java.lang.Float.valueOf(r0)
            com.anilab.data.model.preference.RecentlyWatchedJson r0 = (com.anilab.data.model.preference.RecentlyWatchedJson) r0
            goto Lbb
        L31:
            java.lang.Class r5 = java.lang.Integer.TYPE
            kotlin.jvm.internal.d r5 = kotlin.jvm.internal.p.a(r5)
            boolean r5 = r4.equals(r5)
            r8 = 0
            if (r5 == 0) goto L4a
            int r0 = r6.getInt(r2, r8)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            com.anilab.data.model.preference.RecentlyWatchedJson r0 = (com.anilab.data.model.preference.RecentlyWatchedJson) r0
            goto Lbb
        L4a:
            java.lang.Class r5 = java.lang.Long.TYPE
            kotlin.jvm.internal.d r5 = kotlin.jvm.internal.p.a(r5)
            boolean r5 = r4.equals(r5)
            if (r5 == 0) goto L63
            r3 = 0
            long r2 = r6.getLong(r2, r3)
            java.lang.Long r0 = java.lang.Long.valueOf(r2)
            com.anilab.data.model.preference.RecentlyWatchedJson r0 = (com.anilab.data.model.preference.RecentlyWatchedJson) r0
            goto Lbb
        L63:
            java.lang.Class<java.lang.String> r5 = java.lang.String.class
            kotlin.jvm.internal.d r5 = kotlin.jvm.internal.p.a(r5)
            boolean r5 = r4.equals(r5)
            java.lang.String r9 = ""
            if (r5 == 0) goto L82
            java.lang.String r0 = r6.getString(r2, r9)
            if (r0 == 0) goto L7a
            com.anilab.data.model.preference.RecentlyWatchedJson r0 = (com.anilab.data.model.preference.RecentlyWatchedJson) r0
            goto Lbb
        L7a:
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            java.lang.String r2 = "null cannot be cast to non-null type com.anilab.data.model.preference.RecentlyWatchedJson"
            r0.<init>(r2)
            throw r0
        L82:
            java.lang.Class r5 = java.lang.Boolean.TYPE
            kotlin.jvm.internal.d r5 = kotlin.jvm.internal.p.a(r5)
            boolean r4 = r4.equals(r5)
            if (r4 == 0) goto L99
            boolean r0 = r6.getBoolean(r2, r8)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            com.anilab.data.model.preference.RecentlyWatchedJson r0 = (com.anilab.data.model.preference.RecentlyWatchedJson) r0
            goto Lbb
        L99:
            java.lang.String r2 = r6.getString(r2, r9)
            if (r2 == 0) goto Lba
            int r4 = r2.length()
            if (r4 != 0) goto La6
            goto Lba
        La6:
            o7.y r0 = r0.f24772b     // Catch: java.lang.Throwable -> Lb1
            o7.k r0 = r0.a(r3)     // Catch: java.lang.Throwable -> Lb1
            java.lang.Object r0 = r0.a(r2)     // Catch: java.lang.Throwable -> Lb1
            goto Lb6
        Lb1:
            r0 = move-exception
            A7.i r0 = a.AbstractC0485a.h(r0)
        Lb6:
            boolean r2 = r0 instanceof A7.i
            if (r2 == 0) goto Lbb
        Lba:
            r0 = r7
        Lbb:
            com.anilab.data.model.preference.RecentlyWatchedJson r0 = (com.anilab.data.model.preference.RecentlyWatchedJson) r0
            if (r0 != 0) goto Lc0
            return r7
        Lc0:
            H2.u r8 = new H2.u
            java.lang.String r15 = r0.f13875d
            java.lang.String r2 = r0.f13876e
            java.util.List r3 = r0.f13878g
            long r9 = r0.f13872a
            long r11 = r0.f13873b
            long r13 = r0.f13874c
            r17 = 0
            int r0 = r0.f13877f
            r18 = r0
            r16 = r2
            r19 = r3
            r8.<init>(r9, r11, r13, r15, r16, r17, r18, r19)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: O2.W.a():H2.u");
    }
}
