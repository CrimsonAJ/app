package C2;

import Y7.InterfaceC0484z;
import com.anilab.data.model.response.LoginResponse;

/* loaded from: classes.dex */
public final class Z extends G7.j implements O7.p {

    /* renamed from: r, reason: collision with root package name */
    public LoginResponse f1316r;

    /* renamed from: s, reason: collision with root package name */
    public int f1317s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ g0 f1318t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ String f1319u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Z(g0 g0Var, String str, E7.d dVar) {
        super(2, dVar);
        this.f1318t = g0Var;
        this.f1319u = str;
    }

    @Override // G7.a
    public final E7.d create(Object obj, E7.d dVar) {
        return new Z(this.f1318t, this.f1319u, dVar);
    }

    @Override // O7.p
    public final Object invoke(Object obj, Object obj2) {
        return ((Z) create((InterfaceC0484z) obj, (E7.d) obj2)).invokeSuspend(A7.n.f558a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0044, code lost:
    
        if (r10 == r0) goto L15;
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x00b2  */
    @Override // G7.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r10) {
        /*
            r9 = this;
            F7.a r0 = F7.a.f2587a
            int r1 = r9.f1317s
            r2 = 1
            C2.g0 r3 = r9.f1318t
            r4 = 2
            r5 = 0
            if (r1 == 0) goto L22
            if (r1 == r2) goto L1e
            if (r1 != r4) goto L16
            com.anilab.data.model.response.LoginResponse r0 = r9.f1316r
            a.AbstractC0485a.A(r10)
            goto L8a
        L16:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r0)
            throw r10
        L1e:
            a.AbstractC0485a.A(r10)
            goto L47
        L22:
            a.AbstractC0485a.A(r10)
            B2.b r10 = r3.f1359a
            y2.a r1 = r3.f1360b
            java.lang.String r1 = O4.h.t(r1)
            g6.o r6 = g6.o.f17761a
            java.lang.String r6 = r6.x0()
            java.lang.String r1 = com.google.android.gms.internal.measurement.AbstractC0953k1.n(r1, r6)
            com.anilab.data.model.request.LoginWithGoogleRequest r6 = new com.anilab.data.model.request.LoginWithGoogleRequest
            java.lang.String r7 = r9.f1319u
            r6.<init>(r7, r5, r4, r5)
            r9.f1317s = r2
            java.lang.Object r10 = r10.k(r1, r6, r9)
            if (r10 != r0) goto L47
            goto L87
        L47:
            com.anilab.data.model.response.ApiResponse r10 = (com.anilab.data.model.response.ApiResponse) r10
            java.lang.Object r10 = r10.f14005c
            com.anilab.data.model.response.LoginResponse r10 = (com.anilab.data.model.response.LoginResponse) r10
            y2.a r1 = r3.f1360b
            g6.o r2 = g6.o.f17761a
            java.lang.String r6 = r2.o0()
            android.content.SharedPreferences r7 = r1.f24771a
            android.content.SharedPreferences$Editor r7 = r7.edit()
            o7.y r1 = r1.f24772b
            java.lang.Class<com.anilab.data.model.response.LoginResponse> r8 = com.anilab.data.model.response.LoginResponse.class
            o7.k r1 = r1.a(r8)
            java.lang.String r1 = r1.d(r10)
            r7.putString(r6, r1)
            r7.apply()
            B2.b r1 = r3.f1359a
            y2.a r6 = r3.f1360b
            java.lang.String r6 = O4.h.t(r6)
            java.lang.String r2 = r2.v0()
            java.lang.String r2 = com.google.android.gms.internal.measurement.AbstractC0953k1.n(r6, r2)
            r9.f1316r = r10
            r9.f1317s = r4
            java.lang.Object r1 = r1.s(r2, r9)
            if (r1 != r0) goto L88
        L87:
            return r0
        L88:
            r0 = r10
            r10 = r1
        L8a:
            com.anilab.data.model.response.ApiResponse r10 = (com.anilab.data.model.response.ApiResponse) r10
            java.lang.Object r10 = r10.f14005c
            com.anilab.data.model.response.WatchListIdResponse r10 = (com.anilab.data.model.response.WatchListIdResponse) r10
            y2.a r1 = r3.f1360b
            g6.o r2 = g6.o.f17761a
            java.lang.String r2 = r2.r0()
            android.content.SharedPreferences r3 = r1.f24771a
            android.content.SharedPreferences$Editor r3 = r3.edit()
            o7.y r1 = r1.f24772b
            java.lang.Class<com.anilab.data.model.response.WatchListIdResponse> r6 = com.anilab.data.model.response.WatchListIdResponse.class
            o7.k r1 = r1.a(r6)
            java.lang.String r10 = r1.d(r10)
            r3.putString(r2, r10)
            r3.apply()
            if (r0 == 0) goto Lb8
            v2.b r10 = new v2.b
            r10.<init>(r0)
            return r10
        Lb8:
            u2.a r10 = new u2.a
            r10.<init>(r5, r4)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: C2.Z.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
