package C2;

import Y7.InterfaceC0484z;
import com.anilab.data.model.response.LoginResponse;

/* loaded from: classes.dex */
public final class Y extends G7.j implements O7.p {

    /* renamed from: r, reason: collision with root package name */
    public LoginResponse f1311r;

    /* renamed from: s, reason: collision with root package name */
    public int f1312s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ g0 f1313t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ String f1314u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ String f1315v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Y(g0 g0Var, String str, String str2, E7.d dVar) {
        super(2, dVar);
        this.f1313t = g0Var;
        this.f1314u = str;
        this.f1315v = str2;
    }

    @Override // G7.a
    public final E7.d create(Object obj, E7.d dVar) {
        return new Y(this.f1313t, this.f1314u, this.f1315v, dVar);
    }

    @Override // O7.p
    public final Object invoke(Object obj, Object obj2) {
        return ((Y) create((InterfaceC0484z) obj, (E7.d) obj2)).invokeSuspend(A7.n.f558a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0045, code lost:
    
        if (r9 == r0) goto L15;
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x00b3  */
    @Override // G7.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            r8 = this;
            F7.a r0 = F7.a.f2587a
            int r1 = r8.f1312s
            r2 = 1
            r3 = 2
            C2.g0 r4 = r8.f1313t
            if (r1 == 0) goto L21
            if (r1 == r2) goto L1d
            if (r1 != r3) goto L15
            com.anilab.data.model.response.LoginResponse r0 = r8.f1311r
            a.AbstractC0485a.A(r9)
            goto L8b
        L15:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L1d:
            a.AbstractC0485a.A(r9)
            goto L48
        L21:
            a.AbstractC0485a.A(r9)
            B2.b r9 = r4.f1359a
            y2.a r1 = r4.f1360b
            java.lang.String r1 = O4.h.t(r1)
            g6.o r5 = g6.o.f17761a
            java.lang.String r5 = r5.w0()
            java.lang.String r1 = com.google.android.gms.internal.measurement.AbstractC0953k1.n(r1, r5)
            com.anilab.data.model.request.LoginRequest r5 = new com.anilab.data.model.request.LoginRequest
            java.lang.String r6 = r8.f1314u
            java.lang.String r7 = r8.f1315v
            r5.<init>(r6, r7)
            r8.f1312s = r2
            java.lang.Object r9 = r9.d(r1, r5, r8)
            if (r9 != r0) goto L48
            goto L88
        L48:
            com.anilab.data.model.response.ApiResponse r9 = (com.anilab.data.model.response.ApiResponse) r9
            java.lang.Object r9 = r9.f14005c
            com.anilab.data.model.response.LoginResponse r9 = (com.anilab.data.model.response.LoginResponse) r9
            y2.a r1 = r4.f1360b
            g6.o r2 = g6.o.f17761a
            java.lang.String r5 = r2.o0()
            android.content.SharedPreferences r6 = r1.f24771a
            android.content.SharedPreferences$Editor r6 = r6.edit()
            o7.y r1 = r1.f24772b
            java.lang.Class<com.anilab.data.model.response.LoginResponse> r7 = com.anilab.data.model.response.LoginResponse.class
            o7.k r1 = r1.a(r7)
            java.lang.String r1 = r1.d(r9)
            r6.putString(r5, r1)
            r6.apply()
            B2.b r1 = r4.f1359a
            y2.a r5 = r4.f1360b
            java.lang.String r5 = O4.h.t(r5)
            java.lang.String r2 = r2.v0()
            java.lang.String r2 = com.google.android.gms.internal.measurement.AbstractC0953k1.n(r5, r2)
            r8.f1311r = r9
            r8.f1312s = r3
            java.lang.Object r1 = r1.s(r2, r8)
            if (r1 != r0) goto L89
        L88:
            return r0
        L89:
            r0 = r9
            r9 = r1
        L8b:
            com.anilab.data.model.response.ApiResponse r9 = (com.anilab.data.model.response.ApiResponse) r9
            java.lang.Object r9 = r9.f14005c
            com.anilab.data.model.response.WatchListIdResponse r9 = (com.anilab.data.model.response.WatchListIdResponse) r9
            y2.a r1 = r4.f1360b
            g6.o r2 = g6.o.f17761a
            java.lang.String r2 = r2.r0()
            android.content.SharedPreferences r4 = r1.f24771a
            android.content.SharedPreferences$Editor r4 = r4.edit()
            o7.y r1 = r1.f24772b
            java.lang.Class<com.anilab.data.model.response.WatchListIdResponse> r5 = com.anilab.data.model.response.WatchListIdResponse.class
            o7.k r1 = r1.a(r5)
            java.lang.String r9 = r1.d(r9)
            r4.putString(r2, r9)
            r4.apply()
            if (r0 == 0) goto Lb9
            v2.b r9 = new v2.b
            r9.<init>(r0)
            return r9
        Lb9:
            u2.a r9 = new u2.a
            r0 = 0
            r9.<init>(r0, r3)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: C2.Y.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
