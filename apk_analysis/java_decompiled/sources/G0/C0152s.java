package G0;

import X.Z;
import X.a0;
import b8.AbstractC0714M;
import b8.C0718Q;
import java.util.Set;

/* renamed from: G0.s, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0152s {

    /* renamed from: a, reason: collision with root package name */
    public final C0718Q f2804a;

    public C0152s() {
        this.f2804a = AbstractC0714M.c(a0.f8050b);
    }

    public Z a() {
        return (Z) this.f2804a.h();
    }

    public void b(Set tableIds) {
        C0718Q c0718q;
        Object h7;
        int[] iArr;
        int i9;
        kotlin.jvm.internal.h.e(tableIds, "tableIds");
        if (tableIds.isEmpty()) {
            return;
        }
        do {
            c0718q = this.f2804a;
            h7 = c0718q.h();
            int[] iArr2 = (int[]) h7;
            int length = iArr2.length;
            iArr = new int[length];
            for (int i10 = 0; i10 < length; i10++) {
                if (tableIds.contains(Integer.valueOf(i10))) {
                    i9 = iArr2[i10] + 1;
                } else {
                    i9 = iArr2[i10];
                }
                iArr[i10] = i9;
            }
        } while (!c0718q.g(h7, iArr));
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0025, code lost:
    
        if (r6.f8049a > r2.f8049a) goto L13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void c(X.Z r6) {
        /*
            r5 = this;
            java.lang.String r0 = "newState"
            kotlin.jvm.internal.h.e(r6, r0)
        L5:
            b8.Q r0 = r5.f2804a
            java.lang.Object r1 = r0.h()
            r2 = r1
            X.Z r2 = (X.Z) r2
            boolean r3 = r2 instanceof X.S
            if (r3 == 0) goto L14
            r3 = 1
            goto L1a
        L14:
            X.a0 r3 = X.a0.f8050b
            boolean r3 = kotlin.jvm.internal.h.a(r2, r3)
        L1a:
            if (r3 == 0) goto L1d
            goto L27
        L1d:
            boolean r3 = r2 instanceof X.C0403c
            if (r3 == 0) goto L29
            int r3 = r2.f8049a
            int r4 = r6.f8049a
            if (r4 <= r3) goto L2d
        L27:
            r2 = r6
            goto L2d
        L29:
            boolean r3 = r2 instanceof X.P
            if (r3 == 0) goto L34
        L2d:
            boolean r0 = r0.g(r1, r2)
            if (r0 == 0) goto L5
            return
        L34:
            A7.b r6 = new A7.b
            r6.<init>()
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: G0.C0152s.c(X.Z):void");
    }

    public C0152s(int i9) {
        this.f2804a = AbstractC0714M.c(new int[i9]);
    }
}
