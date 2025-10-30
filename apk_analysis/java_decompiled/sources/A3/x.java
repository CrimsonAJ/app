package A3;

import c7.C0790j;
import q3.C1896a;
import q3.C1897b;
import q3.C1902g;
import q3.InterfaceC1898c;
import q3.InterfaceC1900e;

/* loaded from: classes.dex */
public final class x {

    /* renamed from: a, reason: collision with root package name */
    public final C1896a f311a;

    /* renamed from: b, reason: collision with root package name */
    public final InterfaceC1900e f312b;

    /* renamed from: c, reason: collision with root package name */
    public C1897b f313c;

    /* renamed from: d, reason: collision with root package name */
    public final int f314d;

    public x(InterfaceC1898c interfaceC1898c, InterfaceC1900e interfaceC1900e, long j, long j4, long j9, long j10, long j11, int i9) {
        this.f312b = interfaceC1900e;
        this.f314d = i9;
        this.f311a = new C1896a(interfaceC1898c, j, j4, j9, j10, j11);
    }

    public static int a(int i9, byte[] bArr) {
        return (bArr[i9 + 3] & 255) | ((bArr[i9] & 255) << 24) | ((bArr[i9 + 1] & 255) << 16) | ((bArr[i9 + 2] & 255) << 8);
    }

    public static int c(C1902g c1902g, long j, C0790j c0790j) {
        if (j == c1902g.f22312d) {
            return 0;
        }
        c0790j.f11723a = j;
        return 1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x00c6, code lost:
    
        return c(r28, r8, r29);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int b(q3.C1902g r28, c7.C0790j r29) {
        /*
            r27 = this;
            r0 = r27
            r1 = r28
            r2 = r29
        L6:
            q3.b r3 = r0.f313c
            l4.AbstractC1566a.n(r3)
            long r4 = r3.f22296f
            long r6 = r3.f22297g
            long r8 = r3.f22298h
            long r6 = r6 - r4
            int r10 = r0.f314d
            long r10 = (long) r10
            int r6 = (r6 > r10 ? 1 : (r6 == r10 ? 0 : -1))
            r7 = 0
            q3.e r10 = r0.f312b
            if (r6 > 0) goto L26
            r0.f313c = r7
            r10.a()
            int r1 = c(r1, r4, r2)
            return r1
        L26:
            long r4 = r1.f22312d
            long r4 = r8 - r4
            r11 = 0
            int r6 = (r4 > r11 ? 1 : (r4 == r11 ? 0 : -1))
            if (r6 < 0) goto Lc2
            r13 = 262144(0x40000, double:1.295163E-318)
            int r6 = (r4 > r13 ? 1 : (r4 == r13 ? 0 : -1))
            if (r6 > 0) goto Lc2
            int r4 = (int) r4
            r1.n(r4)
            r4 = 0
            r1.f22314f = r4
            long r4 = r3.f22292b
            q3.d r4 = r10.h(r1, r4)
            r5 = -3
            int r6 = r4.f22300a
            if (r6 == r5) goto Lb8
            r5 = -2
            long r8 = r4.f22301b
            r15 = r11
            long r11 = r4.f22302c
            if (r6 == r5) goto L97
            r4 = -1
            if (r6 == r4) goto L78
            if (r6 != 0) goto L70
            long r3 = r1.f22312d
            long r3 = r11 - r3
            int r5 = (r3 > r15 ? 1 : (r3 == r15 ? 0 : -1))
            if (r5 < 0) goto L66
            int r5 = (r3 > r13 ? 1 : (r3 == r13 ? 0 : -1))
            if (r5 > 0) goto L66
            int r3 = (int) r3
            r1.n(r3)
        L66:
            r0.f313c = r7
            r10.a()
            int r1 = c(r1, r11, r2)
            return r1
        L70:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "Invalid case"
            r1.<init>(r2)
            throw r1
        L78:
            r3.f22295e = r8
            r3.f22297g = r11
            long r4 = r3.f22294d
            long r6 = r3.f22296f
            long r13 = r3.f22293c
            r17 = r4
            long r4 = r3.f22292b
            r15 = r4
            r21 = r6
            r19 = r8
            r23 = r11
            r25 = r13
            long r4 = q3.C1897b.a(r15, r17, r19, r21, r23, r25)
            r3.f22298h = r4
            goto L6
        L97:
            r4 = r8
            r6 = r11
            r3.f22294d = r4
            r3.f22296f = r6
            long r8 = r3.f22295e
            long r10 = r3.f22297g
            long r12 = r3.f22293c
            long r14 = r3.f22292b
            r17 = r4
            r21 = r6
            r19 = r8
            r23 = r10
            r25 = r12
            r15 = r14
            long r4 = q3.C1897b.a(r15, r17, r19, r21, r23, r25)
            r3.f22298h = r4
            goto L6
        Lb8:
            r0.f313c = r7
            r10.a()
            int r1 = c(r1, r8, r2)
            return r1
        Lc2:
            int r1 = c(r1, r8, r2)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: A3.x.b(q3.g, c7.j):int");
    }

    public final void d(long j) {
        C1897b c1897b = this.f313c;
        if (c1897b != null && c1897b.f22291a == j) {
            return;
        }
        C1896a c1896a = this.f311a;
        this.f313c = new C1897b(j, c1896a.f22285a.k(j), c1896a.f22287c, c1896a.f22288d, c1896a.f22289e, c1896a.f22290f);
    }
}
