package C2;

import Y7.InterfaceC0484z;
import com.anilab.data.model.response.LoginResponse;
import com.anilab.data.model.response.UserInfoResponse;

/* loaded from: classes.dex */
public final class X extends G7.j implements O7.p {

    /* renamed from: r, reason: collision with root package name */
    public UserInfoResponse f1307r;

    /* renamed from: s, reason: collision with root package name */
    public LoginResponse f1308s;

    /* renamed from: t, reason: collision with root package name */
    public int f1309t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ g0 f1310u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public X(g0 g0Var, E7.d dVar) {
        super(2, dVar);
        this.f1310u = g0Var;
    }

    @Override // G7.a
    public final E7.d create(Object obj, E7.d dVar) {
        return new X(this.f1310u, dVar);
    }

    @Override // O7.p
    public final Object invoke(Object obj, Object obj2) {
        return ((X) create((InterfaceC0484z) obj, (E7.d) obj2)).invokeSuspend(A7.n.f558a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x003d, code lost:
    
        if (r9 == r0) goto L17;
     */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0076  */
    @Override // G7.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            r8 = this;
            F7.a r0 = F7.a.f2587a
            int r1 = r8.f1309t
            r2 = 1
            r3 = 2
            C2.g0 r4 = r8.f1310u
            if (r1 == 0) goto L22
            if (r1 == r2) goto L1e
            if (r1 != r3) goto L16
            com.anilab.data.model.response.LoginResponse r0 = r8.f1308s
            com.anilab.data.model.response.UserInfoResponse r1 = r8.f1307r
            a.AbstractC0485a.A(r9)
            goto L6e
        L16:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L1e:
            a.AbstractC0485a.A(r9)
            goto L40
        L22:
            a.AbstractC0485a.A(r9)
            B2.b r9 = r4.f1359a
            y2.a r1 = r4.f1360b
            java.lang.String r1 = O4.h.t(r1)
            g6.o r5 = g6.o.f17761a
            java.lang.String r5 = r5.X0()
            java.lang.String r1 = com.google.android.gms.internal.measurement.AbstractC0953k1.n(r1, r5)
            r8.f1309t = r2
            java.lang.Object r9 = r9.y(r1, r8)
            if (r9 != r0) goto L40
            goto L6b
        L40:
            com.anilab.data.model.response.ApiResponse r9 = (com.anilab.data.model.response.ApiResponse) r9
            java.lang.Object r9 = r9.f14005c
            r1 = r9
            com.anilab.data.model.response.UserInfoResponse r1 = (com.anilab.data.model.response.UserInfoResponse) r1
            if (r1 == 0) goto Lc0
            com.anilab.data.model.response.LoginResponse r9 = r4.a()
            B2.b r2 = r4.f1359a
            y2.a r5 = r4.f1360b
            java.lang.String r5 = O4.h.t(r5)
            g6.o r6 = g6.o.f17761a
            java.lang.String r6 = r6.v0()
            java.lang.String r5 = com.google.android.gms.internal.measurement.AbstractC0953k1.n(r5, r6)
            r8.f1307r = r1
            r8.f1308s = r9
            r8.f1309t = r3
            java.lang.Object r2 = r2.s(r5, r8)
            if (r2 != r0) goto L6c
        L6b:
            return r0
        L6c:
            r0 = r9
            r9 = r2
        L6e:
            com.anilab.data.model.response.ApiResponse r9 = (com.anilab.data.model.response.ApiResponse) r9
            java.lang.Object r9 = r9.f14005c
            com.anilab.data.model.response.WatchListIdResponse r9 = (com.anilab.data.model.response.WatchListIdResponse) r9
            if (r0 == 0) goto L7a
            com.anilab.data.model.response.UserResponse r2 = r1.f14366a
            r0.f14200a = r2
        L7a:
            y2.a r2 = r4.f1360b
            g6.o r3 = g6.o.f17761a
            java.lang.String r5 = r3.r0()
            android.content.SharedPreferences r6 = r2.f24771a
            android.content.SharedPreferences$Editor r6 = r6.edit()
            o7.y r2 = r2.f24772b
            java.lang.Class<com.anilab.data.model.response.WatchListIdResponse> r7 = com.anilab.data.model.response.WatchListIdResponse.class
            o7.k r2 = r2.a(r7)
            java.lang.String r9 = r2.d(r9)
            r6.putString(r5, r9)
            r6.apply()
            y2.a r9 = r4.f1360b
            java.lang.String r2 = r3.o0()
            android.content.SharedPreferences r3 = r9.f24771a
            android.content.SharedPreferences$Editor r3 = r3.edit()
            o7.y r9 = r9.f24772b
            java.lang.Class<com.anilab.data.model.response.LoginResponse> r4 = com.anilab.data.model.response.LoginResponse.class
            o7.k r9 = r9.a(r4)
            java.lang.String r9 = r9.d(r0)
            r3.putString(r2, r9)
            r3.apply()
            v2.b r9 = new v2.b
            com.anilab.data.model.response.UserResponse r0 = r1.f14366a
            r9.<init>(r0)
            return r9
        Lc0:
            u2.a r9 = new u2.a
            r0 = 0
            r9.<init>(r0, r3)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: C2.X.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
