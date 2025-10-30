package O2;

/* loaded from: classes.dex */
public final class E {

    /* renamed from: a, reason: collision with root package name */
    public final C2.E f5302a;

    public E(C2.E movieRepository, G2.s movieMapper) {
        kotlin.jvm.internal.h.e(movieRepository, "movieRepository");
        kotlin.jvm.internal.h.e(movieMapper, "movieMapper");
        this.f5302a = movieRepository;
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x00b6, code lost:
    
        if ((r0 instanceof A7.i) != false) goto L32;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List a() {
        /*
            r9 = this;
            C2.E r0 = r9.f5302a
            r0.getClass()
            g6.o r1 = g6.o.f17761a
            java.lang.String r1 = r1.r0()
            java.lang.Class<com.anilab.data.model.response.WatchListIdResponse> r2 = com.anilab.data.model.response.WatchListIdResponse.class
            kotlin.jvm.internal.d r3 = kotlin.jvm.internal.p.a(r2)
            java.lang.Class r4 = java.lang.Float.TYPE
            kotlin.jvm.internal.d r4 = kotlin.jvm.internal.p.a(r4)
            boolean r4 = r3.equals(r4)
            y2.a r0 = r0.f1269b
            r5 = 0
            android.content.SharedPreferences r6 = r0.f24771a
            if (r4 == 0) goto L2f
            r0 = 0
            float r0 = r6.getFloat(r1, r0)
            java.lang.Float r0 = java.lang.Float.valueOf(r0)
            com.anilab.data.model.response.WatchListIdResponse r0 = (com.anilab.data.model.response.WatchListIdResponse) r0
            goto Lb9
        L2f:
            java.lang.Class r4 = java.lang.Integer.TYPE
            kotlin.jvm.internal.d r4 = kotlin.jvm.internal.p.a(r4)
            boolean r4 = r3.equals(r4)
            r7 = 0
            if (r4 == 0) goto L48
            int r0 = r6.getInt(r1, r7)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            com.anilab.data.model.response.WatchListIdResponse r0 = (com.anilab.data.model.response.WatchListIdResponse) r0
            goto Lb9
        L48:
            java.lang.Class r4 = java.lang.Long.TYPE
            kotlin.jvm.internal.d r4 = kotlin.jvm.internal.p.a(r4)
            boolean r4 = r3.equals(r4)
            if (r4 == 0) goto L61
            r2 = 0
            long r0 = r6.getLong(r1, r2)
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            com.anilab.data.model.response.WatchListIdResponse r0 = (com.anilab.data.model.response.WatchListIdResponse) r0
            goto Lb9
        L61:
            java.lang.Class<java.lang.String> r4 = java.lang.String.class
            kotlin.jvm.internal.d r4 = kotlin.jvm.internal.p.a(r4)
            boolean r4 = r3.equals(r4)
            java.lang.String r8 = ""
            if (r4 == 0) goto L80
            java.lang.String r0 = r6.getString(r1, r8)
            if (r0 == 0) goto L78
            com.anilab.data.model.response.WatchListIdResponse r0 = (com.anilab.data.model.response.WatchListIdResponse) r0
            goto Lb9
        L78:
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            java.lang.String r1 = "null cannot be cast to non-null type com.anilab.data.model.response.WatchListIdResponse"
            r0.<init>(r1)
            throw r0
        L80:
            java.lang.Class r4 = java.lang.Boolean.TYPE
            kotlin.jvm.internal.d r4 = kotlin.jvm.internal.p.a(r4)
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L97
            boolean r0 = r6.getBoolean(r1, r7)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            com.anilab.data.model.response.WatchListIdResponse r0 = (com.anilab.data.model.response.WatchListIdResponse) r0
            goto Lb9
        L97:
            java.lang.String r1 = r6.getString(r1, r8)
            if (r1 == 0) goto Lb8
            int r3 = r1.length()
            if (r3 != 0) goto La4
            goto Lb8
        La4:
            o7.y r0 = r0.f24772b     // Catch: java.lang.Throwable -> Laf
            o7.k r0 = r0.a(r2)     // Catch: java.lang.Throwable -> Laf
            java.lang.Object r0 = r0.a(r1)     // Catch: java.lang.Throwable -> Laf
            goto Lb4
        Laf:
            r0 = move-exception
            A7.i r0 = a.AbstractC0485a.h(r0)
        Lb4:
            boolean r1 = r0 instanceof A7.i
            if (r1 == 0) goto Lb9
        Lb8:
            r0 = r5
        Lb9:
            com.anilab.data.model.response.WatchListIdResponse r0 = (com.anilab.data.model.response.WatchListIdResponse) r0
            if (r0 == 0) goto Lbf
            java.util.List r5 = r0.f14400a
        Lbf:
            if (r5 != 0) goto Lc3
            B7.t r5 = B7.t.f1135a
        Lc3:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: O2.E.a():java.util.List");
    }
}
