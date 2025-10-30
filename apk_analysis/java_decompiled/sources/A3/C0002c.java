package A3;

import c7.C0790j;
import q3.C1902g;
import q3.C1908m;
import q3.InterfaceC1905j;
import q3.InterfaceC1906k;
import q3.InterfaceC1907l;

/* renamed from: A3.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0002c implements InterfaceC1905j {

    /* renamed from: a, reason: collision with root package name */
    public final C0001b f94a = new C0001b(null, 1);

    /* renamed from: b, reason: collision with root package name */
    public final A4.r f95b = new A4.r(16384);

    /* renamed from: c, reason: collision with root package name */
    public boolean f96c;

    @Override // q3.InterfaceC1905j
    public final void b(long j, long j4) {
        this.f96c = false;
        this.f94a.a();
    }

    @Override // q3.InterfaceC1905j
    public final int f(InterfaceC1906k interfaceC1906k, C0790j c0790j) {
        A4.r rVar = this.f95b;
        int D8 = ((C1902g) interfaceC1906k).D((byte[]) rVar.f384c, 0, 16384);
        if (D8 == -1) {
            return -1;
        }
        rVar.H(0);
        rVar.G(D8);
        boolean z9 = this.f96c;
        C0001b c0001b = this.f94a;
        if (!z9) {
            c0001b.e(0L, 4);
            this.f96c = true;
        }
        c0001b.c(rVar);
        return 0;
    }

    @Override // q3.InterfaceC1905j
    public final void i(InterfaceC1907l interfaceC1907l) {
        this.f94a.f(interfaceC1907l, new I(0, 1));
        interfaceC1907l.i();
        interfaceC1907l.r(new C1908m(-9223372036854775807L));
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x008f, code lost:
    
        return false;
     */
    @Override // q3.InterfaceC1905j
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean j(q3.InterfaceC1906k r15) {
        /*
            r14 = this;
            A4.r r0 = new A4.r
            r1 = 10
            r0.<init>(r1)
            r2 = 0
            r3 = r2
        L9:
            java.lang.Object r4 = r0.f384c
            byte[] r4 = (byte[]) r4
            r5 = r15
            q3.g r5 = (q3.C1902g) r5
            r5.t(r4, r2, r1, r2)
            r0.H(r2)
            int r4 = r0.z()
            r6 = 4801587(0x494433, float:6.728456E-39)
            r7 = 3
            if (r4 == r6) goto L96
            r5.f22314f = r2
            r5.c(r3, r2)
            r15 = r2
            r1 = r3
        L27:
            java.lang.Object r4 = r0.f384c
            byte[] r4 = (byte[]) r4
            r6 = 7
            r5.t(r4, r2, r6, r2)
            r0.H(r2)
            int r4 = r0.C()
            r8 = 44096(0xac40, float:6.1792E-41)
            r9 = 44097(0xac41, float:6.1793E-41)
            if (r4 == r8) goto L50
            if (r4 == r9) goto L50
            r5.f22314f = r2
            int r1 = r1 + 1
            int r15 = r1 - r3
            r4 = 8192(0x2000, float:1.14794E-41)
            if (r15 < r4) goto L4b
            goto L8f
        L4b:
            r5.c(r1, r2)
            r15 = r2
            goto L27
        L50:
            r8 = 1
            int r15 = r15 + r8
            r10 = 4
            if (r15 < r10) goto L56
            return r8
        L56:
            java.lang.Object r8 = r0.f384c
            byte[] r8 = (byte[]) r8
            int r11 = r8.length
            r12 = -1
            if (r11 >= r6) goto L60
            r11 = r12
            goto L8d
        L60:
            r11 = 2
            r11 = r8[r11]
            r11 = r11 & 255(0xff, float:3.57E-43)
            int r11 = r11 << 8
            r13 = r8[r7]
            r13 = r13 & 255(0xff, float:3.57E-43)
            r11 = r11 | r13
            r13 = 65535(0xffff, float:9.1834E-41)
            if (r11 != r13) goto L87
            r10 = r8[r10]
            r10 = r10 & 255(0xff, float:3.57E-43)
            int r10 = r10 << 16
            r11 = 5
            r11 = r8[r11]
            r11 = r11 & 255(0xff, float:3.57E-43)
            int r11 = r11 << 8
            r10 = r10 | r11
            r11 = 6
            r8 = r8[r11]
            r8 = r8 & 255(0xff, float:3.57E-43)
            r11 = r10 | r8
            goto L88
        L87:
            r6 = r10
        L88:
            if (r4 != r9) goto L8c
            int r6 = r6 + 2
        L8c:
            int r11 = r11 + r6
        L8d:
            if (r11 != r12) goto L90
        L8f:
            return r2
        L90:
            int r11 = r11 + (-7)
            r5.c(r11, r2)
            goto L27
        L96:
            r0.I(r7)
            int r4 = r0.w()
            int r6 = r4 + 10
            int r3 = r3 + r6
            r5.c(r4, r2)
            goto L9
        */
        throw new UnsupportedOperationException("Method not decompiled: A3.C0002c.j(q3.k):boolean");
    }

    @Override // q3.InterfaceC1905j
    public final void a() {
    }
}
