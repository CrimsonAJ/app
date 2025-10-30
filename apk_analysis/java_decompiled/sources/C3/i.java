package C3;

/* loaded from: classes.dex */
public final class i extends m3.f {

    /* renamed from: i, reason: collision with root package name */
    public long f1468i;
    public int j;

    /* renamed from: k, reason: collision with root package name */
    public int f1469k;

    @Override // m3.f
    public final void r() {
        super.r();
        this.j = 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x004f, code lost:
    
        if ((r0.remaining() + r3.position()) > 3072000) goto L21;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean v(m3.f r6) {
        /*
            r5 = this;
            r0 = 1073741824(0x40000000, float:2.0)
            boolean r0 = r6.e(r0)
            r1 = 1
            r0 = r0 ^ r1
            l4.AbstractC1566a.h(r0)
            r0 = 268435456(0x10000000, float:2.5243549E-29)
            boolean r0 = r6.e(r0)
            r0 = r0 ^ r1
            l4.AbstractC1566a.h(r0)
            r0 = 4
            boolean r0 = r6.e(r0)
            r0 = r0 ^ r1
            l4.AbstractC1566a.h(r0)
            int r0 = r5.j
            r2 = 0
            if (r0 <= 0) goto L25
            r3 = r1
            goto L26
        L25:
            r3 = r2
        L26:
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r3 != 0) goto L2b
            goto L52
        L2b:
            int r3 = r5.f1469k
            if (r0 < r3) goto L30
            goto L51
        L30:
            boolean r0 = r6.e(r4)
            boolean r3 = r5.e(r4)
            if (r0 == r3) goto L3b
            goto L51
        L3b:
            java.nio.ByteBuffer r0 = r6.f20704d
            if (r0 == 0) goto L52
            java.nio.ByteBuffer r3 = r5.f20704d
            if (r3 == 0) goto L52
            int r3 = r3.position()
            int r0 = r0.remaining()
            int r0 = r0 + r3
            r3 = 3072000(0x2ee000, float:4.304789E-39)
            if (r0 <= r3) goto L52
        L51:
            return r2
        L52:
            int r0 = r5.j
            int r2 = r0 + 1
            r5.j = r2
            if (r0 != 0) goto L66
            long r2 = r6.f20706f
            r5.f20706f = r2
            boolean r0 = r6.e(r1)
            if (r0 == 0) goto L66
            r5.f6039b = r1
        L66:
            boolean r0 = r6.e(r4)
            if (r0 == 0) goto L6e
            r5.f6039b = r4
        L6e:
            java.nio.ByteBuffer r0 = r6.f20704d
            if (r0 == 0) goto L7e
            int r2 = r0.remaining()
            r5.t(r2)
            java.nio.ByteBuffer r2 = r5.f20704d
            r2.put(r0)
        L7e:
            long r2 = r6.f20706f
            r5.f1468i = r2
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: C3.i.v(m3.f):boolean");
    }
}
