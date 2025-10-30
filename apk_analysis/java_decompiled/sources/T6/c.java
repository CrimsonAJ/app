package T6;

/* loaded from: classes.dex */
public final /* synthetic */ class c implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7214a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ d f7215b;

    public /* synthetic */ c(d dVar, int i9) {
        this.f7214a = i9;
        this.f7215b = dVar;
    }

    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x006b  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void run() {
        /*
            r7 = this;
            int r0 = r7.f7214a
            switch(r0) {
                case 0: goto L93;
                case 1: goto L8d;
                default: goto L5;
            }
        L5:
            T6.d r0 = r7.f7215b
            r0.getClass()
            java.lang.Object r1 = T6.d.f7216m
            monitor-enter(r1)
            l6.f r2 = r0.f7217a     // Catch: java.lang.Throwable -> L24
            r2.a()     // Catch: java.lang.Throwable -> L24
            android.content.Context r2 = r2.f20587a     // Catch: java.lang.Throwable -> L24
            O0.c r2 = O0.c.e(r2)     // Catch: java.lang.Throwable -> L24
            O0.c r3 = r0.f7219c     // Catch: java.lang.Throwable -> L84
            U6.b r3 = r3.K()     // Catch: java.lang.Throwable -> L84
            if (r2 == 0) goto L27
            r2.O()     // Catch: java.lang.Throwable -> L24
            goto L27
        L24:
            r0 = move-exception
            goto L8b
        L27:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L24
            int r1 = r3.f7529b     // Catch: T6.f -> L48
            r2 = 0
            r4 = 5
            r5 = 1
            if (r1 != r4) goto L31
            r6 = r5
            goto L32
        L31:
            r6 = r2
        L32:
            if (r6 != 0) goto L4a
            r6 = 3
            if (r1 != r6) goto L38
            r2 = r5
        L38:
            if (r2 == 0) goto L3b
            goto L4a
        L3b:
            T6.k r1 = r0.f7220d     // Catch: T6.f -> L48
            boolean r1 = r1.a(r3)     // Catch: T6.f -> L48
            if (r1 == 0) goto L83
            U6.b r1 = r0.c(r3)     // Catch: T6.f -> L48
            goto L4e
        L48:
            r1 = move-exception
            goto L80
        L4a:
            U6.b r1 = r0.i(r3)     // Catch: T6.f -> L48
        L4e:
            r0.f(r1)
            r0.m(r3, r1)
            r2 = 4
            int r3 = r1.f7529b
            if (r3 != r2) goto L5e
            java.lang.String r2 = r1.f7528a
            r0.l(r2)
        L5e:
            int r2 = r1.f7529b
            if (r2 != r4) goto L6b
            T6.f r1 = new T6.f
            r1.<init>()
            r0.j(r1)
            goto L83
        L6b:
            r3 = 2
            if (r2 == r3) goto L75
            if (r2 != r5) goto L71
            goto L75
        L71:
            r0.k(r1)
            goto L83
        L75:
            java.io.IOException r1 = new java.io.IOException
            java.lang.String r2 = "Installation ID could not be validated with the Firebase servers (maybe it was deleted). Firebase Installations will need to create a new Installation ID and auth token. Please retry your last request."
            r1.<init>(r2)
            r0.j(r1)
            goto L83
        L80:
            r0.j(r1)
        L83:
            return
        L84:
            r0 = move-exception
            if (r2 == 0) goto L8a
            r2.O()     // Catch: java.lang.Throwable -> L24
        L8a:
            throw r0     // Catch: java.lang.Throwable -> L24
        L8b:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L24
            throw r0
        L8d:
            T6.d r0 = r7.f7215b
            r0.b()
            return
        L93:
            T6.d r0 = r7.f7215b
            r0.b()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: T6.c.run():void");
    }
}
