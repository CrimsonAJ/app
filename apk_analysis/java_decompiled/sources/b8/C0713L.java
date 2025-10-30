package b8;

import Y7.C0460f;
import Y7.C0464h;
import a8.EnumC0509a;
import c8.AbstractC0792b;
import c8.AbstractC0793c;
import c8.AbstractC0794d;
import com.google.android.gms.internal.measurement.D1;
import java.util.Arrays;

/* renamed from: b8.L, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0713L extends AbstractC0792b implements InterfaceC0706E, InterfaceC0725e, c8.v {

    /* renamed from: e, reason: collision with root package name */
    public final int f11434e;

    /* renamed from: f, reason: collision with root package name */
    public final int f11435f;

    /* renamed from: g, reason: collision with root package name */
    public final EnumC0509a f11436g;

    /* renamed from: h, reason: collision with root package name */
    public Object[] f11437h;

    /* renamed from: i, reason: collision with root package name */
    public long f11438i;
    public long j;

    /* renamed from: k, reason: collision with root package name */
    public int f11439k;

    /* renamed from: l, reason: collision with root package name */
    public int f11440l;

    public C0713L(int i9, int i10, EnumC0509a enumC0509a) {
        this.f11434e = i9;
        this.f11435f = i10;
        this.f11436g = enumC0509a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0081 A[Catch: all -> 0x0038, TryCatch #1 {all -> 0x0038, blocks: (B:14:0x0031, B:18:0x0079, B:20:0x0081, B:29:0x0094, B:32:0x009b, B:33:0x009f, B:35:0x00a0, B:41:0x004b), top: B:7:0x0020 }] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0092 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0022  */
    /* JADX WARN: Type inference failed for: r5v1, types: [c8.b] */
    /* JADX WARN: Type inference failed for: r5v12 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v4, types: [b8.L] */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v7 */
    /* JADX WARN: Type inference failed for: r9v0, types: [b8.f] */
    /* JADX WARN: Type inference failed for: r9v1 */
    /* JADX WARN: Type inference failed for: r9v16 */
    /* JADX WARN: Type inference failed for: r9v17 */
    /* JADX WARN: Type inference failed for: r9v18 */
    /* JADX WARN: Type inference failed for: r9v2, types: [c8.d] */
    /* JADX WARN: Type inference failed for: r9v3 */
    /* JADX WARN: Type inference failed for: r9v4 */
    /* JADX WARN: Type inference failed for: r9v5, types: [b8.N] */
    /* JADX WARN: Type inference failed for: r9v8, types: [b8.N] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:32:0x00ae -> B:15:0x0034). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void i(b8.C0713L r8, b8.InterfaceC0726f r9, E7.d r10) {
        /*
            boolean r0 = r10 instanceof b8.C0712K
            if (r0 == 0) goto L13
            r0 = r10
            b8.K r0 = (b8.C0712K) r0
            int r1 = r0.f11433x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f11433x = r1
            goto L18
        L13:
            b8.K r0 = new b8.K
            r0.<init>(r8, r10)
        L18:
            java.lang.Object r10 = r0.f11431v
            F7.a r1 = F7.a.f2587a
            int r2 = r0.f11433x
            r3 = 3
            r4 = 2
            if (r2 == 0) goto L5e
            r8 = 1
            if (r2 == r8) goto L4f
            if (r2 == r4) goto L43
            if (r2 != r3) goto L3b
            Y7.h0 r8 = r0.f11430u
            b8.N r9 = r0.f11429t
            b8.f r2 = r0.f11428s
            b8.L r5 = r0.f11427r
            a.AbstractC0485a.A(r10)     // Catch: java.lang.Throwable -> L38
        L34:
            r10 = r2
            r2 = r8
            r8 = r5
            goto L76
        L38:
            r8 = move-exception
            goto Lb4
        L3b:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L43:
            Y7.h0 r8 = r0.f11430u
            b8.N r9 = r0.f11429t
            b8.f r2 = r0.f11428s
            b8.L r5 = r0.f11427r
            a.AbstractC0485a.A(r10)     // Catch: java.lang.Throwable -> L38
            goto L79
        L4f:
            b8.N r9 = r0.f11429t
            b8.f r8 = r0.f11428s
            b8.L r2 = r0.f11427r
            a.AbstractC0485a.A(r10)     // Catch: java.lang.Throwable -> L5b
            r10 = r8
            r8 = r2
            goto L6a
        L5b:
            r8 = move-exception
            r5 = r2
            goto Lb4
        L5e:
            a.AbstractC0485a.A(r10)
            c8.d r10 = r8.b()
            b8.N r10 = (b8.C0715N) r10
            r7 = r10
            r10 = r9
            r9 = r7
        L6a:
            E7.i r2 = r0.getContext()     // Catch: java.lang.Throwable -> Lb1
            Y7.g0 r5 = Y7.C0463g0.f8811a     // Catch: java.lang.Throwable -> Lb1
            E7.g r2 = r2.get(r5)     // Catch: java.lang.Throwable -> Lb1
            Y7.h0 r2 = (Y7.InterfaceC0465h0) r2     // Catch: java.lang.Throwable -> Lb1
        L76:
            r5 = r8
            r8 = r2
            r2 = r10
        L79:
            java.lang.Object r10 = r5.q(r9)     // Catch: java.lang.Throwable -> L38
            G6.a r6 = b8.AbstractC0714M.f11441a     // Catch: java.lang.Throwable -> L38
            if (r10 != r6) goto L92
            r0.f11427r = r5     // Catch: java.lang.Throwable -> L38
            r0.f11428s = r2     // Catch: java.lang.Throwable -> L38
            r0.f11429t = r9     // Catch: java.lang.Throwable -> L38
            r0.f11430u = r8     // Catch: java.lang.Throwable -> L38
            r0.f11433x = r4     // Catch: java.lang.Throwable -> L38
            java.lang.Object r10 = r5.g(r9, r0)     // Catch: java.lang.Throwable -> L38
            if (r10 != r1) goto L79
            goto Lb0
        L92:
            if (r8 == 0) goto La0
            boolean r6 = r8.a()     // Catch: java.lang.Throwable -> L38
            if (r6 == 0) goto L9b
            goto La0
        L9b:
            java.util.concurrent.CancellationException r8 = r8.I()     // Catch: java.lang.Throwable -> L38
            throw r8     // Catch: java.lang.Throwable -> L38
        La0:
            r0.f11427r = r5     // Catch: java.lang.Throwable -> L38
            r0.f11428s = r2     // Catch: java.lang.Throwable -> L38
            r0.f11429t = r9     // Catch: java.lang.Throwable -> L38
            r0.f11430u = r8     // Catch: java.lang.Throwable -> L38
            r0.f11433x = r3     // Catch: java.lang.Throwable -> L38
            java.lang.Object r10 = r2.emit(r10, r0)     // Catch: java.lang.Throwable -> L38
            if (r10 != r1) goto L34
        Lb0:
            return
        Lb1:
            r10 = move-exception
            r5 = r8
            r8 = r10
        Lb4:
            r5.f(r9)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: b8.C0713L.i(b8.L, b8.f, E7.d):void");
    }

    @Override // c8.v
    public final InterfaceC0725e a(E7.i iVar, int i9, EnumC0509a enumC0509a) {
        return AbstractC0714M.n(this, iVar, i9, enumC0509a);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [c8.d, java.lang.Object, b8.N] */
    @Override // c8.AbstractC0792b
    public final AbstractC0794d c() {
        ?? obj = new Object();
        obj.f11444a = -1L;
        return obj;
    }

    @Override // b8.InterfaceC0725e
    public final Object collect(InterfaceC0726f interfaceC0726f, E7.d dVar) {
        i(this, interfaceC0726f, dVar);
        return F7.a.f2587a;
    }

    @Override // b8.InterfaceC0706E
    public final boolean d(Object obj) {
        int i9;
        boolean z9;
        E7.d[] dVarArr = AbstractC0793c.f11751a;
        synchronized (this) {
            if (o(obj)) {
                dVarArr = l(dVarArr);
                z9 = true;
            } else {
                z9 = false;
            }
        }
        for (E7.d dVar : dVarArr) {
            if (dVar != null) {
                dVar.resumeWith(A7.n.f558a);
            }
        }
        return z9;
    }

    @Override // c8.AbstractC0792b
    public final AbstractC0794d[] e() {
        return new C0715N[2];
    }

    @Override // b8.InterfaceC0726f
    public final Object emit(Object obj, E7.d dVar) {
        Throwable th;
        E7.d[] l9;
        C0711J c0711j;
        if (d(obj)) {
            return A7.n.f558a;
        }
        C0464h c0464h = new C0464h(1, D1.A(dVar));
        c0464h.s();
        E7.d[] dVarArr = AbstractC0793c.f11751a;
        synchronized (this) {
            try {
                if (o(obj)) {
                    try {
                        c0464h.resumeWith(A7.n.f558a);
                        l9 = l(dVarArr);
                        c0711j = null;
                    } catch (Throwable th2) {
                        th = th2;
                        throw th;
                    }
                } else {
                    try {
                        C0711J c0711j2 = new C0711J(this, m() + this.f11439k + this.f11440l, obj, c0464h);
                        k(c0711j2);
                        this.f11440l++;
                        if (this.f11435f == 0) {
                            dVarArr = l(dVarArr);
                        }
                        l9 = dVarArr;
                        c0711j = c0711j2;
                    } catch (Throwable th3) {
                        th = th3;
                        th = th;
                        throw th;
                    }
                }
                if (c0711j != null) {
                    c0464h.v(new C0460f(2, c0711j));
                }
                for (E7.d dVar2 : l9) {
                    if (dVar2 != null) {
                        dVar2.resumeWith(A7.n.f558a);
                    }
                }
                Object r5 = c0464h.r();
                F7.a aVar = F7.a.f2587a;
                if (r5 != aVar) {
                    r5 = A7.n.f558a;
                }
                if (r5 == aVar) {
                    return r5;
                }
                return A7.n.f558a;
            } catch (Throwable th4) {
                th = th4;
            }
        }
    }

    public final Object g(C0715N c0715n, C0712K c0712k) {
        C0464h c0464h = new C0464h(1, D1.A(c0712k));
        c0464h.s();
        synchronized (this) {
            if (p(c0715n) < 0) {
                c0715n.f11445b = c0464h;
            } else {
                c0464h.resumeWith(A7.n.f558a);
            }
        }
        Object r5 = c0464h.r();
        if (r5 == F7.a.f2587a) {
            return r5;
        }
        return A7.n.f558a;
    }

    public final void h() {
        if (this.f11435f != 0 || this.f11440l > 1) {
            Object[] objArr = this.f11437h;
            kotlin.jvm.internal.h.b(objArr);
            while (this.f11440l > 0) {
                long m9 = m();
                int i9 = this.f11439k;
                int i10 = this.f11440l;
                if (objArr[((int) ((m9 + (i9 + i10)) - 1)) & (objArr.length - 1)] == AbstractC0714M.f11441a) {
                    this.f11440l = i10 - 1;
                    AbstractC0714M.e(objArr, m() + this.f11439k + this.f11440l, null);
                } else {
                    return;
                }
            }
        }
    }

    public final void j() {
        AbstractC0794d[] abstractC0794dArr;
        Object[] objArr = this.f11437h;
        kotlin.jvm.internal.h.b(objArr);
        AbstractC0714M.e(objArr, m(), null);
        this.f11439k--;
        long m9 = m() + 1;
        if (this.f11438i < m9) {
            this.f11438i = m9;
        }
        if (this.j < m9) {
            if (this.f11748b != 0 && (abstractC0794dArr = this.f11747a) != null) {
                for (AbstractC0794d abstractC0794d : abstractC0794dArr) {
                    if (abstractC0794d != null) {
                        C0715N c0715n = (C0715N) abstractC0794d;
                        long j = c0715n.f11444a;
                        if (j >= 0 && j < m9) {
                            c0715n.f11444a = m9;
                        }
                    }
                }
            }
            this.j = m9;
        }
    }

    public final void k(Object obj) {
        int i9 = this.f11439k + this.f11440l;
        Object[] objArr = this.f11437h;
        if (objArr == null) {
            objArr = n(null, 0, 2);
        } else if (i9 >= objArr.length) {
            objArr = n(objArr, i9, objArr.length * 2);
        }
        AbstractC0714M.e(objArr, m() + i9, obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v6, types: [java.lang.Object[], java.lang.Object] */
    public final E7.d[] l(E7.d[] dVarArr) {
        AbstractC0794d[] abstractC0794dArr;
        C0715N c0715n;
        C0464h c0464h;
        int length = dVarArr.length;
        if (this.f11748b != 0 && (abstractC0794dArr = this.f11747a) != null) {
            int length2 = abstractC0794dArr.length;
            int i9 = 0;
            dVarArr = dVarArr;
            while (i9 < length2) {
                AbstractC0794d abstractC0794d = abstractC0794dArr[i9];
                if (abstractC0794d != null && (c0464h = (c0715n = (C0715N) abstractC0794d).f11445b) != null && p(c0715n) >= 0) {
                    int length3 = dVarArr.length;
                    dVarArr = dVarArr;
                    if (length >= length3) {
                        ?? copyOf = Arrays.copyOf(dVarArr, Math.max(2, dVarArr.length * 2));
                        kotlin.jvm.internal.h.d(copyOf, "copyOf(...)");
                        dVarArr = copyOf;
                    }
                    dVarArr[length] = c0464h;
                    c0715n.f11445b = null;
                    length++;
                }
                i9++;
                dVarArr = dVarArr;
            }
        }
        return dVarArr;
    }

    public final long m() {
        return Math.min(this.j, this.f11438i);
    }

    public final Object[] n(Object[] objArr, int i9, int i10) {
        if (i10 > 0) {
            Object[] objArr2 = new Object[i10];
            this.f11437h = objArr2;
            if (objArr != null) {
                long m9 = m();
                for (int i11 = 0; i11 < i9; i11++) {
                    long j = i11 + m9;
                    AbstractC0714M.e(objArr2, j, objArr[((int) j) & (objArr.length - 1)]);
                }
            }
            return objArr2;
        }
        throw new IllegalStateException("Buffer size overflow");
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0039, code lost:
    
        if (r1 != 2) goto L22;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean o(java.lang.Object r13) {
        /*
            r12 = this;
            int r1 = r12.f11748b
            int r2 = r12.f11434e
            r9 = 1
            if (r1 != 0) goto L22
            if (r2 != 0) goto La
            goto L76
        La:
            r12.k(r13)
            int r1 = r12.f11439k
            int r1 = r1 + r9
            r12.f11439k = r1
            if (r1 <= r2) goto L17
            r12.j()
        L17:
            long r1 = r12.m()
            int r3 = r12.f11439k
            long r3 = (long) r3
            long r1 = r1 + r3
            r12.j = r1
            return r9
        L22:
            int r1 = r12.f11439k
            int r3 = r12.f11435f
            if (r1 < r3) goto L3e
            long r4 = r12.j
            long r6 = r12.f11438i
            int r1 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r1 > 0) goto L3e
            a8.a r1 = r12.f11436g
            int r1 = r1.ordinal()
            if (r1 == 0) goto L3c
            r4 = 2
            if (r1 == r4) goto L76
            goto L3e
        L3c:
            r1 = 0
            return r1
        L3e:
            r12.k(r13)
            int r1 = r12.f11439k
            int r1 = r1 + r9
            r12.f11439k = r1
            if (r1 <= r3) goto L4b
            r12.j()
        L4b:
            long r3 = r12.m()
            int r1 = r12.f11439k
            long r5 = (long) r1
            long r3 = r3 + r5
            long r5 = r12.f11438i
            long r3 = r3 - r5
            int r1 = (int) r3
            if (r1 <= r2) goto L76
            r1 = 1
            long r1 = r1 + r5
            long r3 = r12.j
            long r5 = r12.m()
            int r7 = r12.f11439k
            long r7 = (long) r7
            long r5 = r5 + r7
            long r7 = r12.m()
            int r10 = r12.f11439k
            long r10 = (long) r10
            long r7 = r7 + r10
            int r10 = r12.f11440l
            long r10 = (long) r10
            long r7 = r7 + r10
            r0 = r12
            r0.r(r1, r3, r5, r7)
        L76:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: b8.C0713L.o(java.lang.Object):boolean");
    }

    public final long p(C0715N c0715n) {
        long j = c0715n.f11444a;
        if (j >= m() + this.f11439k) {
            if (this.f11435f > 0 || j > m() || this.f11440l == 0) {
                return -1L;
            }
            return j;
        }
        return j;
    }

    public final Object q(C0715N c0715n) {
        Object obj;
        E7.d[] dVarArr = AbstractC0793c.f11751a;
        synchronized (this) {
            try {
                long p9 = p(c0715n);
                if (p9 < 0) {
                    obj = AbstractC0714M.f11441a;
                } else {
                    long j = c0715n.f11444a;
                    Object[] objArr = this.f11437h;
                    kotlin.jvm.internal.h.b(objArr);
                    Object obj2 = objArr[((int) p9) & (objArr.length - 1)];
                    if (obj2 instanceof C0711J) {
                        obj2 = ((C0711J) obj2).f11425c;
                    }
                    c0715n.f11444a = p9 + 1;
                    Object obj3 = obj2;
                    dVarArr = s(j);
                    obj = obj3;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        for (E7.d dVar : dVarArr) {
            if (dVar != null) {
                dVar.resumeWith(A7.n.f558a);
            }
        }
        return obj;
    }

    public final void r(long j, long j4, long j9, long j10) {
        long min = Math.min(j4, j);
        for (long m9 = m(); m9 < min; m9++) {
            Object[] objArr = this.f11437h;
            kotlin.jvm.internal.h.b(objArr);
            AbstractC0714M.e(objArr, m9, null);
        }
        this.f11438i = j;
        this.j = j4;
        this.f11439k = (int) (j9 - min);
        this.f11440l = (int) (j10 - j9);
    }

    public final E7.d[] s(long j) {
        int i9;
        long j4;
        long j9;
        long j10;
        int i10;
        E7.d[] dVarArr;
        long j11;
        AbstractC0794d[] abstractC0794dArr;
        long j12 = this.j;
        E7.d[] dVarArr2 = AbstractC0793c.f11751a;
        if (j <= j12) {
            long m9 = m();
            long j13 = this.f11439k + m9;
            int i11 = this.f11435f;
            if (i11 == 0 && this.f11440l > 0) {
                j13++;
            }
            int i12 = 0;
            if (this.f11748b != 0 && (abstractC0794dArr = this.f11747a) != null) {
                for (AbstractC0794d abstractC0794d : abstractC0794dArr) {
                    if (abstractC0794d != null) {
                        long j14 = ((C0715N) abstractC0794d).f11444a;
                        if (j14 >= 0 && j14 < j13) {
                            j13 = j14;
                        }
                    }
                }
            }
            if (j13 > this.j) {
                long m10 = m() + this.f11439k;
                if (this.f11748b > 0) {
                    i9 = Math.min(this.f11440l, i11 - ((int) (m10 - j13)));
                } else {
                    i9 = this.f11440l;
                }
                long j15 = this.f11440l + m10;
                G6.a aVar = AbstractC0714M.f11441a;
                if (i9 > 0) {
                    E7.d[] dVarArr3 = new E7.d[i9];
                    j10 = 1;
                    Object[] objArr = this.f11437h;
                    kotlin.jvm.internal.h.b(objArr);
                    i10 = i11;
                    long j16 = m10;
                    while (true) {
                        if (m10 < j15) {
                            j4 = m9;
                            Object obj = objArr[((int) m10) & (objArr.length - 1)];
                            if (obj != aVar) {
                                kotlin.jvm.internal.h.c(obj, "null cannot be cast to non-null type kotlinx.coroutines.flow.SharedFlowImpl.Emitter");
                                C0711J c0711j = (C0711J) obj;
                                int i13 = i12 + 1;
                                j9 = j13;
                                dVarArr3[i12] = c0711j.f11426d;
                                AbstractC0714M.e(objArr, m10, aVar);
                                AbstractC0714M.e(objArr, j16, c0711j.f11425c);
                                j16++;
                                if (i13 >= i9) {
                                    break;
                                }
                                i12 = i13;
                            } else {
                                j9 = j13;
                            }
                            m10++;
                            m9 = j4;
                            j13 = j9;
                        } else {
                            j4 = m9;
                            j9 = j13;
                            break;
                        }
                    }
                    m10 = j16;
                    dVarArr = dVarArr3;
                } else {
                    j4 = m9;
                    j9 = j13;
                    j10 = 1;
                    i10 = i11;
                    dVarArr = dVarArr2;
                }
                int i14 = (int) (m10 - j4);
                if (this.f11748b == 0) {
                    j11 = m10;
                } else {
                    j11 = j9;
                }
                long max = Math.max(this.f11438i, m10 - Math.min(this.f11434e, i14));
                if (i10 == 0 && max < j15) {
                    Object[] objArr2 = this.f11437h;
                    kotlin.jvm.internal.h.b(objArr2);
                    if (kotlin.jvm.internal.h.a(objArr2[((int) max) & (objArr2.length - 1)], aVar)) {
                        m10 += j10;
                        max += j10;
                    }
                }
                r(max, j11, m10, j15);
                h();
                if (dVarArr.length == 0) {
                    return dVarArr;
                }
                return l(dVarArr);
            }
        }
        return dVarArr2;
    }
}
