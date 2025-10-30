package co.notix;

/* loaded from: classes.dex */
public final class k8 extends t8 {

    /* renamed from: a, reason: collision with root package name */
    public final ma f12598a;

    public k8(ma eventRepository) {
        kotlin.jvm.internal.h.e(eventRepository, "eventRepository");
        this.f12598a = eventRepository;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(co.notix.l8 r8, E7.d r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof co.notix.j8
            if (r0 == 0) goto L13
            r0 = r9
            co.notix.j8 r0 = (co.notix.j8) r0
            int r1 = r0.f12540c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f12540c = r1
            goto L18
        L13:
            co.notix.j8 r0 = new co.notix.j8
            r0.<init>(r7, r9)
        L18:
            java.lang.Object r9 = r0.f12538a
            F7.a r1 = F7.a.f2587a
            int r2 = r0.f12540c
            r3 = 1
            if (r2 == 0) goto L30
            if (r2 != r3) goto L28
            a.AbstractC0485a.A(r9)
            goto Lae
        L28:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L30:
            a.AbstractC0485a.A(r9)
            co.notix.ma r9 = r7.f12598a
            org.json.JSONObject r2 = new org.json.JSONObject
            java.lang.String r4 = r8.f12689a
            r2.<init>(r4)
            java.lang.String r4 = "event"
            java.lang.String r5 = "close"
            r2.put(r4, r5)
            co.notix.p8 r4 = r8.f12691c
            java.lang.String r5 = "reason"
            r2.put(r5, r4)
            co.notix.d3 r4 = r8.f12690b
            co.notix.c3 r5 = co.notix.c3.f11973a
            boolean r5 = kotlin.jvm.internal.h.a(r4, r5)
            if (r5 == 0) goto L56
            r4 = r3
            goto L89
        L56:
            co.notix.y2 r5 = co.notix.y2.f13572a
            boolean r5 = kotlin.jvm.internal.h.a(r4, r5)
            if (r5 == 0) goto L60
            r4 = 3
            goto L89
        L60:
            co.notix.b3 r5 = co.notix.b3.f11907a
            boolean r5 = kotlin.jvm.internal.h.a(r4, r5)
            if (r5 == 0) goto L6a
            r4 = 4
            goto L89
        L6a:
            co.notix.w2 r5 = co.notix.w2.f13398a
            boolean r5 = kotlin.jvm.internal.h.a(r4, r5)
            if (r5 == 0) goto L74
            r4 = 5
            goto L89
        L74:
            co.notix.v2 r5 = co.notix.v2.f13328a
            boolean r5 = kotlin.jvm.internal.h.a(r4, r5)
            if (r5 == 0) goto L7e
            r4 = 6
            goto L89
        L7e:
            co.notix.z2 r5 = co.notix.z2.f13625a
            boolean r4 = kotlin.jvm.internal.h.a(r4, r5)
            if (r4 == 0) goto L88
            r4 = 7
            goto L89
        L88:
            r4 = 0
        L89:
            java.lang.String r5 = "ad_format"
            r2.put(r5, r4)
            java.lang.String r2 = r2.toString()
            java.lang.String r4 = "JSONObject(params.data).…d())\n        }.toString()"
            kotlin.jvm.internal.h.d(r2, r4)
            co.notix.d3 r8 = r8.f12690b
            r0.f12540c = r3
            Y7.z r4 = r9.f12772c
            E7.i r4 = r4.g()
            co.notix.ka r5 = new co.notix.ka
            r6 = 0
            r5.<init>(r9, r2, r8, r6)
            java.lang.Object r9 = Y7.B.C(r4, r5, r0)
            if (r9 != r1) goto Lae
            return r1
        Lae:
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            boolean r8 = r9.booleanValue()
            if (r8 != r3) goto Lb9
            co.notix.v8 r8 = co.notix.v8.SUCCESS
            return r8
        Lb9:
            if (r8 != 0) goto Lbe
            co.notix.v8 r8 = co.notix.v8.RETRY
            return r8
        Lbe:
            A7.b r8 = new A7.b
            r8.<init>()
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: co.notix.k8.a(co.notix.l8, E7.d):java.lang.Object");
    }

    @Override // co.notix.t8
    public final /* bridge */ /* synthetic */ Object a(u8 u8Var, mj mjVar) {
        return a((l8) u8Var, (E7.d) mjVar);
    }
}
