package i4;

/* loaded from: classes.dex */
public final /* synthetic */ class d implements O5.j {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ o f18510a;

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0093, code lost:
    
        if (r3.f18591h.b(r9, r3.f18592i) != false) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0039, code lost:
    
        if (r5.equals("audio/ac4") == false) goto L15;
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x005a A[Catch: all -> 0x0067, TRY_ENTER, TryCatch #0 {all -> 0x0067, blocks: (B:4:0x000a, B:6:0x0010, B:8:0x0014, B:10:0x0018, B:15:0x005a, B:17:0x005e, B:19:0x0062, B:22:0x0069, B:24:0x006d, B:26:0x0071, B:28:0x0075, B:30:0x007f, B:32:0x008b, B:34:0x0096), top: B:3:0x000a }] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x007f A[Catch: all -> 0x0067, TryCatch #0 {all -> 0x0067, blocks: (B:4:0x000a, B:6:0x0010, B:8:0x0014, B:10:0x0018, B:15:0x005a, B:17:0x005e, B:19:0x0062, B:22:0x0069, B:24:0x006d, B:26:0x0071, B:28:0x0075, B:30:0x007f, B:32:0x008b, B:34:0x0096), top: B:3:0x000a }] */
    @Override // O5.j
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean apply(java.lang.Object r9) {
        /*
            r8 = this;
            r0 = 0
            r1 = 2
            r2 = 1
            i4.o r3 = r8.f18510a
            j3.M r9 = (j3.M) r9
            java.lang.Object r4 = r3.f18586c
            monitor-enter(r4)
            i4.h r5 = r3.f18590g     // Catch: java.lang.Throwable -> L67
            boolean r5 = r5.f18553i0     // Catch: java.lang.Throwable -> L67
            if (r5 == 0) goto L95
            boolean r5 = r3.f18589f     // Catch: java.lang.Throwable -> L67
            if (r5 != 0) goto L95
            int r5 = r9.f19448y     // Catch: java.lang.Throwable -> L67
            if (r5 <= r1) goto L95
            java.lang.String r5 = r9.f19435l     // Catch: java.lang.Throwable -> L67
            if (r5 != 0) goto L1e
        L1c:
            r1 = r0
            goto L56
        L1e:
            r6 = -1
            int r7 = r5.hashCode()
            switch(r7) {
                case -2123537834: goto L47;
                case 187078296: goto L3c;
                case 187078297: goto L33;
                case 1504578661: goto L28;
                default: goto L26;
            }
        L26:
            r1 = r6
            goto L51
        L28:
            java.lang.String r1 = "audio/eac3"
            boolean r1 = r5.equals(r1)
            if (r1 != 0) goto L31
            goto L26
        L31:
            r1 = 3
            goto L51
        L33:
            java.lang.String r7 = "audio/ac4"
            boolean r5 = r5.equals(r7)
            if (r5 != 0) goto L51
            goto L26
        L3c:
            java.lang.String r1 = "audio/ac3"
            boolean r1 = r5.equals(r1)
            if (r1 != 0) goto L45
            goto L26
        L45:
            r1 = r2
            goto L51
        L47:
            java.lang.String r1 = "audio/eac3-joc"
            boolean r1 = r5.equals(r1)
            if (r1 != 0) goto L50
            goto L26
        L50:
            r1 = r0
        L51:
            switch(r1) {
                case 0: goto L55;
                case 1: goto L55;
                case 2: goto L55;
                case 3: goto L55;
                default: goto L54;
            }
        L54:
            goto L1c
        L55:
            r1 = r2
        L56:
            r5 = 32
            if (r1 == 0) goto L69
            int r1 = l4.y.f20553a     // Catch: java.lang.Throwable -> L67
            if (r1 < r5) goto L95
            A6.t r1 = r3.f18591h     // Catch: java.lang.Throwable -> L67
            if (r1 == 0) goto L95
            boolean r1 = r1.f539a     // Catch: java.lang.Throwable -> L67
            if (r1 == 0) goto L95
            goto L69
        L67:
            r9 = move-exception
            goto L98
        L69:
            int r1 = l4.y.f20553a     // Catch: java.lang.Throwable -> L67
            if (r1 < r5) goto L96
            A6.t r1 = r3.f18591h     // Catch: java.lang.Throwable -> L67
            if (r1 == 0) goto L96
            boolean r5 = r1.f539a     // Catch: java.lang.Throwable -> L67
            if (r5 == 0) goto L96
            java.lang.Object r1 = r1.f540b     // Catch: java.lang.Throwable -> L67
            android.media.Spatializer r1 = (android.media.Spatializer) r1     // Catch: java.lang.Throwable -> L67
            boolean r1 = Q.c.j(r1)     // Catch: java.lang.Throwable -> L67
            if (r1 == 0) goto L96
            A6.t r1 = r3.f18591h     // Catch: java.lang.Throwable -> L67
            java.lang.Object r1 = r1.f540b     // Catch: java.lang.Throwable -> L67
            android.media.Spatializer r1 = (android.media.Spatializer) r1     // Catch: java.lang.Throwable -> L67
            boolean r1 = Q.c.g(r1)     // Catch: java.lang.Throwable -> L67
            if (r1 == 0) goto L96
            A6.t r1 = r3.f18591h     // Catch: java.lang.Throwable -> L67
            l3.e r3 = r3.f18592i     // Catch: java.lang.Throwable -> L67
            boolean r9 = r1.b(r9, r3)     // Catch: java.lang.Throwable -> L67
            if (r9 == 0) goto L96
        L95:
            r0 = r2
        L96:
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L67
            return r0
        L98:
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L67
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: i4.d.apply(java.lang.Object):boolean");
    }
}
