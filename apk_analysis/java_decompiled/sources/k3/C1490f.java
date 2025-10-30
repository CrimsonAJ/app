package k3;

import N3.A;
import j3.E0;

/* renamed from: k3.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1490f {

    /* renamed from: a, reason: collision with root package name */
    public final String f19937a;

    /* renamed from: b, reason: collision with root package name */
    public int f19938b;

    /* renamed from: c, reason: collision with root package name */
    public long f19939c;

    /* renamed from: d, reason: collision with root package name */
    public final A f19940d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f19941e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f19942f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ C1491g f19943g;

    public C1490f(C1491g c1491g, String str, int i9, A a5) {
        long j;
        this.f19943g = c1491g;
        this.f19937a = str;
        this.f19938b = i9;
        if (a5 == null) {
            j = -1;
        } else {
            j = a5.f5210d;
        }
        this.f19939c = j;
        if (a5 != null && a5.a()) {
            this.f19940d = a5;
        }
    }

    public final boolean a(C1485a c1485a) {
        A a5 = c1485a.f19917d;
        if (a5 == null) {
            if (this.f19938b != c1485a.f19916c) {
                return true;
            }
            return false;
        }
        long j = this.f19939c;
        if (j != -1) {
            if (a5.f5210d <= j) {
                A a9 = this.f19940d;
                if (a9 != null) {
                    E0 e02 = c1485a.f19915b;
                    int b9 = e02.b(a5.f5207a);
                    int b10 = e02.b(a9.f5207a);
                    if (a5.f5210d >= a9.f5210d && b9 >= b10) {
                        if (b9 <= b10) {
                            boolean a10 = a5.a();
                            int i9 = a9.f5208b;
                            if (a10) {
                                int i10 = a5.f5208b;
                                if (i10 <= i9) {
                                    if (i10 == i9) {
                                        if (a5.f5209c > a9.f5209c) {
                                            return true;
                                        }
                                        return false;
                                    }
                                    return false;
                                }
                                return true;
                            }
                            int i11 = a5.f5211e;
                            if (i11 == -1 || i11 > i9) {
                                return true;
                            }
                            return false;
                        }
                        return true;
                    }
                    return false;
                }
                return false;
            }
            return true;
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x000e, code lost:
    
        if (r0 < r8.o()) goto L15;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean b(j3.E0 r7, j3.E0 r8) {
        /*
            r6 = this;
            int r0 = r6.f19938b
            int r1 = r7.o()
            r2 = 0
            r3 = -1
            if (r0 < r1) goto L13
            int r7 = r8.o()
            if (r0 >= r7) goto L11
            goto L38
        L11:
            r0 = r3
            goto L38
        L13:
            k3.g r1 = r6.f19943g
            j3.D0 r4 = r1.f19946a
            r7.n(r0, r4)
            j3.D0 r0 = r1.f19946a
            int r4 = r0.f19316o
        L1e:
            int r5 = r0.f19317p
            if (r4 > r5) goto L11
            java.lang.Object r5 = r7.l(r4)
            int r5 = r8.b(r5)
            if (r5 == r3) goto L35
            j3.C0 r7 = r1.f19947b
            j3.C0 r7 = r8.f(r5, r7, r2)
            int r0 = r7.f19237c
            goto L38
        L35:
            int r4 = r4 + 1
            goto L1e
        L38:
            r6.f19938b = r0
            if (r0 != r3) goto L3d
            goto L4c
        L3d:
            N3.A r7 = r6.f19940d
            if (r7 != 0) goto L42
            goto L4a
        L42:
            java.lang.Object r7 = r7.f5207a
            int r7 = r8.b(r7)
            if (r7 == r3) goto L4c
        L4a:
            r7 = 1
            return r7
        L4c:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: k3.C1490f.b(j3.E0, j3.E0):boolean");
    }
}
