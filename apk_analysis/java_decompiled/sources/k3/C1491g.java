package k3;

import N3.A;
import N3.C0273y;
import j3.C0;
import j3.C1464o;
import j3.D0;
import j3.E0;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Random;

/* renamed from: k3.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1491g {

    /* renamed from: g, reason: collision with root package name */
    public static final C1464o f19944g = new C1464o();

    /* renamed from: h, reason: collision with root package name */
    public static final Random f19945h = new Random();

    /* renamed from: d, reason: collision with root package name */
    public C1494j f19949d;

    /* renamed from: f, reason: collision with root package name */
    public String f19951f;

    /* renamed from: a, reason: collision with root package name */
    public final D0 f19946a = new D0();

    /* renamed from: b, reason: collision with root package name */
    public final C0 f19947b = new C0();

    /* renamed from: c, reason: collision with root package name */
    public final HashMap f19948c = new HashMap();

    /* renamed from: e, reason: collision with root package name */
    public E0 f19950e = E0.f19320a;

    public final synchronized void a(C1485a c1485a) {
        C1494j c1494j;
        this.f19951f = null;
        Iterator it = this.f19948c.values().iterator();
        while (it.hasNext()) {
            C1490f c1490f = (C1490f) it.next();
            it.remove();
            if (c1490f.f19941e && (c1494j = this.f19949d) != null) {
                c1494j.d(c1485a, c1490f.f19937a);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x007a A[ADDED_TO_REGION, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final k3.C1490f b(int r18, N3.A r19) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            r2 = r19
            java.util.HashMap r3 = r0.f19948c
            java.util.Collection r4 = r3.values()
            java.util.Iterator r4 = r4.iterator()
            r5 = 0
            r6 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
        L16:
            boolean r8 = r4.hasNext()
            if (r8 == 0) goto L7d
            java.lang.Object r8 = r4.next()
            k3.f r8 = (k3.C1490f) r8
            long r9 = r8.f19939c
            r11 = -1
            int r9 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r9 != 0) goto L34
            int r9 = r8.f19938b
            if (r1 != r9) goto L34
            if (r2 == 0) goto L34
            long r9 = r2.f5210d
            r8.f19939c = r9
        L34:
            N3.A r9 = r8.f19940d
            if (r2 != 0) goto L3e
            int r10 = r8.f19938b
            if (r1 != r10) goto L16
            r15 = r11
            goto L63
        L3e:
            long r13 = r2.f5210d
            if (r9 != 0) goto L50
            boolean r10 = r2.a()
            if (r10 != 0) goto L16
            r15 = r11
            long r11 = r8.f19939c
            int r10 = (r13 > r11 ? 1 : (r13 == r11 ? 0 : -1))
            if (r10 != 0) goto L16
            goto L63
        L50:
            r15 = r11
            long r10 = r9.f5210d
            int r10 = (r13 > r10 ? 1 : (r13 == r10 ? 0 : -1))
            if (r10 != 0) goto L16
            int r10 = r2.f5208b
            int r11 = r9.f5208b
            if (r10 != r11) goto L16
            int r10 = r2.f5209c
            int r11 = r9.f5209c
            if (r10 != r11) goto L16
        L63:
            long r10 = r8.f19939c
            int r12 = (r10 > r15 ? 1 : (r10 == r15 ? 0 : -1))
            if (r12 == 0) goto L7a
            int r12 = (r10 > r6 ? 1 : (r10 == r6 ? 0 : -1))
            if (r12 >= 0) goto L6e
            goto L7a
        L6e:
            if (r12 != 0) goto L16
            int r10 = l4.y.f20553a
            N3.A r10 = r5.f19940d
            if (r10 == 0) goto L16
            if (r9 == 0) goto L16
            r5 = r8
            goto L16
        L7a:
            r5 = r8
            r6 = r10
            goto L16
        L7d:
            if (r5 != 0) goto L8f
            j3.o r4 = k3.C1491g.f19944g
            java.lang.Object r4 = r4.get()
            java.lang.String r4 = (java.lang.String) r4
            k3.f r5 = new k3.f
            r5.<init>(r0, r4, r1, r2)
            r3.put(r4, r5)
        L8f:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: k3.C1491g.b(int, N3.A):k3.f");
    }

    public final synchronized String c(E0 e02, A a5) {
        return b(e02.g(a5.f5207a, this.f19947b).f19237c, a5).f19937a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v2, types: [N3.y, N3.A] */
    public final void d(C1485a c1485a) {
        A a5;
        if (c1485a.f19915b.p()) {
            this.f19951f = null;
            return;
        }
        C1490f c1490f = (C1490f) this.f19948c.get(this.f19951f);
        int i9 = c1485a.f19916c;
        A a9 = c1485a.f19917d;
        this.f19951f = b(i9, a9).f19937a;
        e(c1485a);
        if (a9 != null && a9.a()) {
            long j = a9.f5210d;
            if (c1490f == null || c1490f.f19939c != j || (a5 = c1490f.f19940d) == null || a5.f5208b != a9.f5208b || a5.f5209c != a9.f5209c) {
                b(i9, new C0273y(j, a9.f5207a));
                this.f19949d.getClass();
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0036, code lost:
    
        if (r1.f5210d < r2) goto L20;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized void e(k3.C1485a r8) {
        /*
            Method dump skipped, instructions count: 227
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: k3.C1491g.e(k3.a):void");
    }

    public final synchronized void f(C1485a c1485a, int i9) {
        boolean z9;
        try {
            this.f19949d.getClass();
            if (i9 == 0) {
                z9 = true;
            } else {
                z9 = false;
            }
            Iterator it = this.f19948c.values().iterator();
            while (it.hasNext()) {
                C1490f c1490f = (C1490f) it.next();
                if (c1490f.a(c1485a)) {
                    it.remove();
                    if (c1490f.f19941e) {
                        boolean equals = c1490f.f19937a.equals(this.f19951f);
                        if (z9 && equals) {
                            boolean z10 = c1490f.f19942f;
                        }
                        if (equals) {
                            this.f19951f = null;
                        }
                        this.f19949d.d(c1485a, c1490f.f19937a);
                    }
                }
            }
            d(c1485a);
        } catch (Throwable th) {
            throw th;
        }
    }
}
