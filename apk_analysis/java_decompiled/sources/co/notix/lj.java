package co.notix;

import Y7.InterfaceC0484z;
import co.notix.perseverance.worker.PerseveranceWorker;

/* loaded from: classes.dex */
public final class lj extends G7.j implements O7.p {

    /* renamed from: a, reason: collision with root package name */
    public g8.a f12714a;

    /* renamed from: b, reason: collision with root package name */
    public PerseveranceWorker f12715b;

    /* renamed from: c, reason: collision with root package name */
    public int f12716c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ PerseveranceWorker f12717d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lj(PerseveranceWorker perseveranceWorker, E7.d dVar) {
        super(2, dVar);
        this.f12717d = perseveranceWorker;
    }

    @Override // G7.a
    public final E7.d create(Object obj, E7.d dVar) {
        return new lj(this.f12717d, dVar);
    }

    @Override // O7.p
    public final Object invoke(Object obj, Object obj2) {
        return ((lj) create((InterfaceC0484z) obj, (E7.d) obj2)).invokeSuspend(A7.n.f558a);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(8:1|2|(1:(1:(1:(7:7|8|9|10|11|12|13)(2:19|20))(6:21|22|23|24|12|13))(1:31))(1:41)|32|33|(4:35|24|12|13)|29|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0065, code lost:
    
        r4 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0066, code lost:
    
        r4 = r10;
        r10 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0063, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x006a, code lost:
    
        r0 = r10;
        r10 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x004b, code lost:
    
        if (r10.d(r9) == r1) goto L39;
     */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0092  */
    @Override // G7.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r10) {
        /*
            r9 = this;
            java.lang.String r0 = "unrecoverable exception, clearing queue "
            F7.a r1 = F7.a.f2587a
            int r2 = r9.f12716c
            r3 = 3
            r4 = 2
            r5 = 1
            r6 = 0
            if (r2 == 0) goto L3a
            if (r2 == r5) goto L31
            if (r2 == r4) goto L24
            if (r2 != r3) goto L1c
            g8.a r0 = r9.f12714a
            a.AbstractC0485a.A(r10)     // Catch: java.lang.Throwable -> L19
            goto L93
        L19:
            r10 = move-exception
            goto L9a
        L1c:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r0)
            throw r10
        L24:
            co.notix.perseverance.worker.PerseveranceWorker r2 = r9.f12715b
            g8.a r4 = r9.f12714a
            a.AbstractC0485a.A(r10)     // Catch: java.lang.Exception -> L2f java.lang.Throwable -> L61
            goto L5e
        L2c:
            r0 = r4
            goto L9a
        L2f:
            r10 = move-exception
            goto L6e
        L31:
            co.notix.perseverance.worker.PerseveranceWorker r2 = r9.f12715b
            g8.a r5 = r9.f12714a
            a.AbstractC0485a.A(r10)
            r10 = r5
            goto L4e
        L3a:
            a.AbstractC0485a.A(r10)
            g8.a r10 = co.notix.perseverance.worker.PerseveranceWorker.f12959d
            co.notix.perseverance.worker.PerseveranceWorker r2 = r9.f12717d
            r9.f12714a = r10
            r9.f12715b = r2
            r9.f12716c = r5
            java.lang.Object r5 = r10.d(r9)
            if (r5 != r1) goto L4e
            goto L91
        L4e:
            r9.f12714a = r10     // Catch: java.lang.Throwable -> L63 java.lang.Exception -> L65
            r9.f12715b = r2     // Catch: java.lang.Throwable -> L63 java.lang.Exception -> L65
            r9.f12716c = r4     // Catch: java.lang.Throwable -> L63 java.lang.Exception -> L65
            java.lang.Object r4 = co.notix.perseverance.worker.PerseveranceWorker.a(r2, r9)     // Catch: java.lang.Throwable -> L63 java.lang.Exception -> L65
            if (r4 != r1) goto L5b
            goto L91
        L5b:
            r8 = r4
            r4 = r10
            r10 = r8
        L5e:
            co.notix.pr r10 = (co.notix.pr) r10     // Catch: java.lang.Exception -> L2f java.lang.Throwable -> L61
            goto L96
        L61:
            r10 = move-exception
            goto L2c
        L63:
            r0 = move-exception
            goto L6a
        L65:
            r4 = move-exception
            r8 = r4
            r4 = r10
            r10 = r8
            goto L6e
        L6a:
            r8 = r0
            r0 = r10
            r10 = r8
            goto L9a
        L6e:
            co.notix.kd r5 = co.notix.md.f12779a     // Catch: java.lang.Throwable -> L61
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L61
            r7.<init>(r0)     // Catch: java.lang.Throwable -> L61
            java.lang.String r0 = r10.getMessage()     // Catch: java.lang.Throwable -> L61
            r7.append(r0)     // Catch: java.lang.Throwable -> L61
            java.lang.String r0 = r7.toString()     // Catch: java.lang.Throwable -> L61
            r5.a(r0, r10)     // Catch: java.lang.Throwable -> L61
            co.notix.ej r10 = r2.f12961b     // Catch: java.lang.Throwable -> L61
            r9.f12714a = r4     // Catch: java.lang.Throwable -> L61
            r9.f12715b = r6     // Catch: java.lang.Throwable -> L61
            r9.f12716c = r3     // Catch: java.lang.Throwable -> L61
            java.lang.Object r10 = r10.a(r9)     // Catch: java.lang.Throwable -> L61
            if (r10 != r1) goto L92
        L91:
            return r1
        L92:
            r0 = r4
        L93:
            co.notix.or r10 = co.notix.or.f12911a     // Catch: java.lang.Throwable -> L19
            r4 = r0
        L96:
            r4.a(r6)
            return r10
        L9a:
            r0.a(r6)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: co.notix.lj.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
