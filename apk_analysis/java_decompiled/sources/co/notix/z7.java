package co.notix;

import Y7.InterfaceC0484z;

/* loaded from: classes.dex */
public final class z7 extends G7.j implements O7.p {

    /* renamed from: a, reason: collision with root package name */
    public String f13632a;

    /* renamed from: b, reason: collision with root package name */
    public no f13633b;

    /* renamed from: c, reason: collision with root package name */
    public g8.a f13634c;

    /* renamed from: d, reason: collision with root package name */
    public int f13635d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ Object f13636e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ c8 f13637f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ String f13638g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ no f13639h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z7(c8 c8Var, String str, no noVar, E7.d dVar) {
        super(2, dVar);
        this.f13637f = c8Var;
        this.f13638g = str;
        this.f13639h = noVar;
    }

    @Override // G7.a
    public final E7.d create(Object obj, E7.d dVar) {
        z7 z7Var = new z7(this.f13637f, this.f13638g, this.f13639h, dVar);
        z7Var.f13636e = obj;
        return z7Var;
    }

    @Override // O7.p
    public final Object invoke(Object obj, Object obj2) {
        return ((z7) create((InterfaceC0484z) obj, (E7.d) obj2)).invokeSuspend(A7.n.f558a);
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0081 A[Catch: all -> 0x0092, TRY_LEAVE, TryCatch #0 {all -> 0x0092, blocks: (B:22:0x0077, B:24:0x0081), top: B:21:0x0077 }] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00a8  */
    @Override // G7.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            r8 = this;
            F7.a r0 = F7.a.f2587a
            int r1 = r8.f13635d
            r2 = 0
            r3 = 3
            r4 = 2
            r5 = 1
            if (r1 == 0) goto L39
            if (r1 == r5) goto L33
            if (r1 == r4) goto L23
            if (r1 != r3) goto L1b
            java.lang.String r0 = r8.f13632a
            java.lang.Object r1 = r8.f13636e
            co.notix.c8 r1 = (co.notix.c8) r1
            a.AbstractC0485a.A(r9)     // Catch: java.lang.Throwable -> Lad
            goto La9
        L1b:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L23:
            g8.a r1 = r8.f13634c
            co.notix.no r4 = r8.f13633b
            java.lang.String r5 = r8.f13632a
            java.lang.Object r6 = r8.f13636e
            co.notix.c8 r6 = (co.notix.c8) r6
            a.AbstractC0485a.A(r9)
            r9 = r1
            r1 = r6
            goto L77
        L33:
            a.AbstractC0485a.A(r9)     // Catch: java.lang.Throwable -> L37
            goto L4d
        L37:
            r9 = move-exception
            goto L50
        L39:
            a.AbstractC0485a.A(r9)
            java.lang.Object r9 = r8.f13636e
            Y7.z r9 = (Y7.InterfaceC0484z) r9
            co.notix.c8 r9 = r8.f13637f
            java.lang.String r1 = r8.f13638g
            r8.f13635d = r5     // Catch: java.lang.Throwable -> L37
            java.lang.Object r9 = co.notix.c8.a(r9, r1, r8)     // Catch: java.lang.Throwable -> L37
            if (r9 != r0) goto L4d
            goto La7
        L4d:
            android.graphics.Bitmap r9 = (android.graphics.Bitmap) r9     // Catch: java.lang.Throwable -> L37
            goto L54
        L50:
            A7.i r9 = a.AbstractC0485a.h(r9)
        L54:
            co.notix.c8 r1 = r8.f13637f
            java.lang.String r5 = r8.f13638g
            co.notix.no r6 = r8.f13639h
            java.lang.Throwable r7 = A7.j.a(r9)
            if (r7 != 0) goto L63
            android.graphics.Bitmap r9 = (android.graphics.Bitmap) r9
            goto Lb5
        L63:
            g8.a r9 = r1.f11993d
            r8.f13636e = r1
            r8.f13632a = r5
            r8.f13633b = r6
            r8.f13634c = r9
            r8.f13635d = r4
            java.lang.Object r4 = r9.d(r8)
            if (r4 != r0) goto L76
            goto La7
        L76:
            r4 = r6
        L77:
            java.util.LinkedHashMap r6 = r1.f11994e     // Catch: java.lang.Throwable -> L92
            java.lang.Object r6 = r6.get(r5)     // Catch: java.lang.Throwable -> L92
            Y7.E r6 = (Y7.E) r6     // Catch: java.lang.Throwable -> L92
            if (r6 != 0) goto L94
            Y7.z r6 = r1.f11991b     // Catch: java.lang.Throwable -> L92
            co.notix.y7 r7 = new co.notix.y7     // Catch: java.lang.Throwable -> L92
            r7.<init>(r1, r5, r4, r2)     // Catch: java.lang.Throwable -> L92
            Y7.F r6 = Y7.B.c(r6, r2, r7, r3)     // Catch: java.lang.Throwable -> L92
            java.util.LinkedHashMap r4 = r1.f11994e     // Catch: java.lang.Throwable -> L92
            r4.put(r5, r6)     // Catch: java.lang.Throwable -> L92
            goto L94
        L92:
            r0 = move-exception
            goto Lb6
        L94:
            r9.a(r2)
            r8.f13636e = r1     // Catch: java.lang.Throwable -> Lae
            r8.f13632a = r5     // Catch: java.lang.Throwable -> Lae
            r8.f13633b = r2     // Catch: java.lang.Throwable -> Lae
            r8.f13634c = r2     // Catch: java.lang.Throwable -> Lae
            r8.f13635d = r3     // Catch: java.lang.Throwable -> Lae
            java.lang.Object r9 = r6.a0(r8)     // Catch: java.lang.Throwable -> Lae
            if (r9 != r0) goto La8
        La7:
            return r0
        La8:
            r0 = r5
        La9:
            android.graphics.Bitmap r9 = (android.graphics.Bitmap) r9     // Catch: java.lang.Throwable -> Lad
            r2 = r9
            goto Laf
        Lad:
            r5 = r0
        Lae:
            r0 = r5
        Laf:
            java.util.LinkedHashMap r9 = r1.f11994e
            r9.remove(r0)
            r9 = r2
        Lb5:
            return r9
        Lb6:
            r9.a(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: co.notix.z7.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
