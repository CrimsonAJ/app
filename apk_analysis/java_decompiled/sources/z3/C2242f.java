package z3;

import A4.r;
import j3.j0;
import java.io.EOFException;
import q3.C1902g;

/* renamed from: z3.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2242f {

    /* renamed from: a, reason: collision with root package name */
    public int f25389a;

    /* renamed from: b, reason: collision with root package name */
    public long f25390b;

    /* renamed from: c, reason: collision with root package name */
    public int f25391c;

    /* renamed from: d, reason: collision with root package name */
    public int f25392d;

    /* renamed from: e, reason: collision with root package name */
    public int f25393e;

    /* renamed from: f, reason: collision with root package name */
    public final int[] f25394f = new int[255];

    /* renamed from: g, reason: collision with root package name */
    public final r f25395g = new r(255);

    public final boolean a(C1902g c1902g, boolean z9) {
        boolean z10;
        boolean z11;
        this.f25389a = 0;
        this.f25390b = 0L;
        this.f25391c = 0;
        this.f25392d = 0;
        this.f25393e = 0;
        r rVar = this.f25395g;
        rVar.E(27);
        try {
            z10 = c1902g.t((byte[]) rVar.f384c, 0, 27, z9);
        } catch (EOFException e8) {
            if (z9) {
                z10 = false;
            } else {
                throw e8;
            }
        }
        if (z10 && rVar.y() == 1332176723) {
            if (rVar.x() != 0) {
                if (!z9) {
                    throw j0.c("unsupported bit stream revision");
                }
            } else {
                this.f25389a = rVar.x();
                this.f25390b = rVar.l();
                rVar.n();
                rVar.n();
                rVar.n();
                int x5 = rVar.x();
                this.f25391c = x5;
                this.f25392d = x5 + 27;
                rVar.E(x5);
                try {
                    z11 = c1902g.t((byte[]) rVar.f384c, 0, this.f25391c, z9);
                } catch (EOFException e9) {
                    if (z9) {
                        z11 = false;
                    } else {
                        throw e9;
                    }
                }
                if (z11) {
                    for (int i9 = 0; i9 < this.f25391c; i9++) {
                        int x9 = rVar.x();
                        this.f25394f[i9] = x9;
                        this.f25393e += x9;
                    }
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0048, code lost:
    
        if (r13 == (-1)) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x004e, code lost:
    
        if (r12.f22312d >= r13) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x007a, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0050, code lost:
    
        r0 = java.lang.Math.min(r12.f22315g, 1);
        r12.k(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0059, code lost:
    
        if (r0 != 0) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x005b, code lost:
    
        r6 = r12.f22309a;
        r5 = r12;
        r0 = r5.i(r6, 0, java.lang.Math.min(1, r6.length), 0, true);
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x006d, code lost:
    
        if (r0 == (-1)) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x006f, code lost:
    
        r5.f22312d += r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0076, code lost:
    
        if (r0 == (-1)) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0078, code lost:
    
        r12 = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x006b, code lost:
    
        r5 = r12;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean b(q3.C1902g r12, long r13) {
        /*
            r11 = this;
            long r0 = r12.f22312d
            long r2 = r12.w()
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            r1 = 0
            r2 = 1
            if (r0 != 0) goto Le
            r0 = r2
            goto Lf
        Le:
            r0 = r1
        Lf:
            l4.AbstractC1566a.h(r0)
            A4.r r0 = r11.f25395g
            r3 = 4
            r0.E(r3)
        L18:
            r4 = -1
            int r4 = (r13 > r4 ? 1 : (r13 == r4 ? 0 : -1))
            if (r4 == 0) goto L27
            long r5 = r12.f22312d
            r7 = 4
            long r5 = r5 + r7
            int r5 = (r5 > r13 ? 1 : (r5 == r13 ? 0 : -1))
            if (r5 >= 0) goto L48
        L27:
            java.lang.Object r5 = r0.f384c
            byte[] r5 = (byte[]) r5
            boolean r5 = r12.t(r5, r1, r3, r2)     // Catch: java.io.EOFException -> L30
            goto L31
        L30:
            r5 = r1
        L31:
            if (r5 == 0) goto L48
            r0.H(r1)
            long r4 = r0.y()
            r6 = 1332176723(0x4f676753, double:6.58182753E-315)
            int r4 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r4 != 0) goto L44
            r12.f22314f = r1
            return r2
        L44:
            r12.n(r2)
            goto L18
        L48:
            if (r4 == 0) goto L50
            long r5 = r12.f22312d
            int r0 = (r5 > r13 ? 1 : (r5 == r13 ? 0 : -1))
            if (r0 >= 0) goto L7a
        L50:
            int r0 = r12.f22315g
            int r0 = java.lang.Math.min(r0, r2)
            r12.k(r0)
            if (r0 != 0) goto L6b
            byte[] r6 = r12.f22309a
            int r0 = r6.length
            int r8 = java.lang.Math.min(r2, r0)
            r10 = 1
            r7 = 0
            r9 = 0
            r5 = r12
            int r0 = r5.i(r6, r7, r8, r9, r10)
            goto L6c
        L6b:
            r5 = r12
        L6c:
            r12 = -1
            if (r0 == r12) goto L75
            long r6 = r5.f22312d
            long r8 = (long) r0
            long r6 = r6 + r8
            r5.f22312d = r6
        L75:
            r12 = -1
            if (r0 == r12) goto L7a
            r12 = r5
            goto L48
        L7a:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: z3.C2242f.b(q3.g, long):boolean");
    }
}
