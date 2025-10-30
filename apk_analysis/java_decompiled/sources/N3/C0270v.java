package N3;

import q3.InterfaceC1907l;

/* renamed from: N3.v, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0270v implements V3.h {

    /* renamed from: a, reason: collision with root package name */
    public int f5200a;

    /* renamed from: b, reason: collision with root package name */
    public long f5201b;

    /* renamed from: c, reason: collision with root package name */
    public int f5202c;

    /* renamed from: d, reason: collision with root package name */
    public long f5203d;

    /* renamed from: e, reason: collision with root package name */
    public int f5204e;

    /* renamed from: f, reason: collision with root package name */
    public final Object f5205f;

    /* renamed from: g, reason: collision with root package name */
    public Object f5206g;

    public C0270v(U3.l lVar) {
        this.f5205f = lVar;
        this.f5201b = -9223372036854775807L;
        this.f5202c = -1;
    }

    @Override // V3.h
    public void b(long j, long j4) {
        this.f5201b = j;
        this.f5203d = j4;
        this.f5204e = 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x007e, code lost:
    
        if ((r24.g() >> 6) == 0) goto L24;
     */
    @Override // V3.h
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void d(A4.r r24, long r25, int r27, boolean r28) {
        /*
            r23 = this;
            r0 = r23
            r1 = r24
            r2 = r27
            r3 = 4
            r4 = 1
            java.lang.Object r5 = r0.f5206g
            q3.u r5 = (q3.u) r5
            l4.AbstractC1566a.n(r5)
            int r5 = r0.f5202c
            r6 = -1
            if (r5 == r6) goto L3e
            int r5 = U3.i.a(r5)
            if (r2 == r5) goto L3e
            int r7 = l4.y.f20553a
            java.util.Locale r7 = java.util.Locale.US
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            java.lang.String r8 = "Received RTP packet with unexpected sequence number. Expected: "
            r7.<init>(r8)
            r7.append(r5)
            java.lang.String r5 = "; received: "
            r7.append(r5)
            r7.append(r2)
            java.lang.String r5 = ". Dropping packet."
            r7.append(r5)
            java.lang.String r5 = r7.toString()
            java.lang.String r7 = "RtpMpeg4Reader"
            l4.AbstractC1566a.P(r7, r5)
        L3e:
            int r5 = r1.e()
            java.lang.Object r7 = r0.f5206g
            q3.u r7 = (q3.u) r7
            r7.c(r5, r1)
            int r7 = r0.f5204e
            r8 = 0
            if (r7 != 0) goto L84
            java.lang.Object r7 = r1.f384c
            byte[] r7 = (byte[]) r7
            byte[] r9 = new byte[r3]
            r9 = {x00c0: FILL_ARRAY_DATA , data: [0, 0, 1, -74} // fill-array
            java.lang.String r10 = "array"
            O4.h.g(r7, r10)
            r10 = r8
        L5d:
            int r11 = r7.length
            int r11 = r11 + (-3)
            if (r10 >= r11) goto L71
            r11 = r8
        L63:
            if (r11 >= r3) goto L72
            int r12 = r10 + r11
            r12 = r7[r12]
            r13 = r9[r11]
            if (r12 == r13) goto L6f
            int r10 = r10 + r4
            goto L5d
        L6f:
            int r11 = r11 + r4
            goto L63
        L71:
            r10 = r6
        L72:
            if (r10 == r6) goto L81
            int r10 = r10 + r3
            r1.H(r10)
            int r1 = r1.g()
            int r1 = r1 >> 6
            if (r1 != 0) goto L81
            goto L82
        L81:
            r4 = r8
        L82:
            r0.f5200a = r4
        L84:
            int r1 = r0.f5204e
            int r1 = r1 + r5
            r0.f5204e = r1
            if (r28 == 0) goto Lbc
            long r3 = r0.f5201b
            r5 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            r11 = r25
            if (r1 != 0) goto L9a
            r0.f5201b = r11
        L9a:
            long r9 = r0.f5203d
            long r13 = r0.f5201b
            r15 = 90000(0x15f90, float:1.26117E-40)
            long r17 = l6.AbstractC1570b.w(r9, r11, r13, r15)
            java.lang.Object r1 = r0.f5206g
            r16 = r1
            q3.u r16 = (q3.u) r16
            int r1 = r0.f5200a
            int r3 = r0.f5204e
            r21 = 0
            r22 = 0
            r19 = r1
            r20 = r3
            r16.d(r17, r19, r20, r21, r22)
            r0.f5204e = r8
        Lbc:
            r0.f5202c = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: N3.C0270v.d(A4.r, long, int, boolean):void");
    }

    @Override // V3.h
    public void e(InterfaceC1907l interfaceC1907l, int i9) {
        q3.u u9 = interfaceC1907l.u(i9, 2);
        this.f5206g = u9;
        int i10 = l4.y.f20553a;
        u9.e(((U3.l) this.f5205f).f7400c);
    }

    public C0270v(int i9, int i10, j3.M m9, int i11, Object obj, long j, long j4) {
        this.f5200a = i9;
        this.f5202c = i10;
        this.f5205f = m9;
        this.f5204e = i11;
        this.f5206g = obj;
        this.f5201b = j;
        this.f5203d = j4;
    }

    @Override // V3.h
    public void c(long j) {
    }
}
