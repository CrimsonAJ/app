package j3;

import l4.AbstractC1566a;

/* loaded from: classes.dex */
public final class x0 {

    /* renamed from: c, reason: collision with root package name */
    public static final x0 f19760c;

    /* renamed from: a, reason: collision with root package name */
    public final long f19761a;

    /* renamed from: b, reason: collision with root package name */
    public final long f19762b;

    static {
        x0 x0Var = new x0(0L, 0L);
        new x0(Long.MAX_VALUE, Long.MAX_VALUE);
        new x0(Long.MAX_VALUE, 0L);
        new x0(0L, Long.MAX_VALUE);
        f19760c = x0Var;
    }

    public x0(long j, long j4) {
        boolean z9;
        if (j >= 0) {
            z9 = true;
        } else {
            z9 = false;
        }
        AbstractC1566a.h(z9);
        AbstractC1566a.h(j4 >= 0);
        this.f19761a = j;
        this.f19762b = j4;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x005c A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long a(long r12, long r14, long r16) {
        /*
            r11 = this;
            long r0 = r11.f19761a
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            long r5 = r11.f19762b
            if (r4 != 0) goto Lf
            int r4 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            if (r4 != 0) goto Lf
            return r12
        Lf:
            int r4 = l4.y.f20553a
            long r7 = r12 - r0
            long r0 = r0 ^ r12
            long r9 = r12 ^ r7
            long r0 = r0 & r9
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 >= 0) goto L1d
            r7 = -9223372036854775808
        L1d:
            long r0 = r12 + r5
            long r9 = r12 ^ r0
            long r5 = r5 ^ r0
            long r5 = r5 & r9
            int r2 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            if (r2 >= 0) goto L2c
            r0 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
        L2c:
            int r2 = (r7 > r14 ? 1 : (r7 == r14 ? 0 : -1))
            r3 = 0
            r4 = 1
            if (r2 > 0) goto L38
            int r2 = (r14 > r0 ? 1 : (r14 == r0 ? 0 : -1))
            if (r2 > 0) goto L38
            r2 = r4
            goto L39
        L38:
            r2 = r3
        L39:
            int r5 = (r7 > r16 ? 1 : (r7 == r16 ? 0 : -1))
            if (r5 > 0) goto L42
            int r0 = (r16 > r0 ? 1 : (r16 == r0 ? 0 : -1))
            if (r0 > 0) goto L42
            r3 = r4
        L42:
            if (r2 == 0) goto L57
            if (r3 == 0) goto L57
            long r0 = r14 - r12
            long r0 = java.lang.Math.abs(r0)
            long r12 = r16 - r12
            long r12 = java.lang.Math.abs(r12)
            int r12 = (r0 > r12 ? 1 : (r0 == r12 ? 0 : -1))
            if (r12 > 0) goto L5c
            goto L59
        L57:
            if (r2 == 0) goto L5a
        L59:
            return r14
        L5a:
            if (r3 == 0) goto L5d
        L5c:
            return r16
        L5d:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: j3.x0.a(long, long, long):long");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && x0.class == obj.getClass()) {
            x0 x0Var = (x0) obj;
            if (this.f19761a == x0Var.f19761a && this.f19762b == x0Var.f19762b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((int) this.f19761a) * 31) + ((int) this.f19762b);
    }
}
