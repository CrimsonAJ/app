package S3;

import N3.G;
import N3.InterfaceC0271w;
import N3.InterfaceC0272x;
import N3.f0;
import N3.n0;
import P5.AbstractC0349q;
import P5.F;
import android.net.Uri;
import android.util.SparseArray;
import b7.C0701c;
import j3.L;
import j3.M;
import j3.j0;
import j3.x0;
import java.util.ArrayList;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.Map;
import k4.C1517q;
import k4.W;
import l4.y;
import n3.C1635l;
import n3.InterfaceC1638o;

/* loaded from: classes.dex */
public final class l implements InterfaceC0272x, T3.r {

    /* renamed from: a, reason: collision with root package name */
    public final c f6814a;

    /* renamed from: b, reason: collision with root package name */
    public final T3.c f6815b;

    /* renamed from: c, reason: collision with root package name */
    public final C0701c f6816c;

    /* renamed from: d, reason: collision with root package name */
    public final W f6817d;

    /* renamed from: e, reason: collision with root package name */
    public final InterfaceC1638o f6818e;

    /* renamed from: f, reason: collision with root package name */
    public final C1635l f6819f;

    /* renamed from: g, reason: collision with root package name */
    public final e1.q f6820g;

    /* renamed from: h, reason: collision with root package name */
    public final G f6821h;

    /* renamed from: i, reason: collision with root package name */
    public final C1517q f6822i;
    public final IdentityHashMap j;

    /* renamed from: k, reason: collision with root package name */
    public final C0701c f6823k;

    /* renamed from: l, reason: collision with root package name */
    public final F5.e f6824l;

    /* renamed from: m, reason: collision with root package name */
    public final boolean f6825m;

    /* renamed from: n, reason: collision with root package name */
    public final int f6826n;

    /* renamed from: o, reason: collision with root package name */
    public final k3.l f6827o;

    /* renamed from: p, reason: collision with root package name */
    public final s4.i f6828p = new s4.i(this);

    /* renamed from: q, reason: collision with root package name */
    public InterfaceC0271w f6829q;

    /* renamed from: r, reason: collision with root package name */
    public int f6830r;

    /* renamed from: s, reason: collision with root package name */
    public n0 f6831s;

    /* renamed from: t, reason: collision with root package name */
    public r[] f6832t;

    /* renamed from: u, reason: collision with root package name */
    public r[] f6833u;

    /* renamed from: v, reason: collision with root package name */
    public int f6834v;

    /* renamed from: w, reason: collision with root package name */
    public C0701c f6835w;

    public l(c cVar, T3.c cVar2, C0701c c0701c, W w7, InterfaceC1638o interfaceC1638o, C1635l c1635l, e1.q qVar, G g9, C1517q c1517q, F5.e eVar, boolean z9, int i9, k3.l lVar) {
        this.f6814a = cVar;
        this.f6815b = cVar2;
        this.f6816c = c0701c;
        this.f6817d = w7;
        this.f6818e = interfaceC1638o;
        this.f6819f = c1635l;
        this.f6820g = qVar;
        this.f6821h = g9;
        this.f6822i = c1517q;
        this.f6824l = eVar;
        this.f6825m = z9;
        this.f6826n = i9;
        this.f6827o = lVar;
        eVar.getClass();
        this.f6835w = new C0701c(11, new f0[0]);
        this.j = new IdentityHashMap();
        this.f6823k = new C0701c(18);
        this.f6832t = new r[0];
        this.f6833u = new r[0];
    }

    public static M f(M m9, M m10, boolean z9) {
        String r5;
        D3.c cVar;
        int i9;
        String str;
        int i10;
        int i11;
        String str2;
        int i12;
        int i13 = -1;
        if (m10 != null) {
            r5 = m10.f19433i;
            cVar = m10.j;
            i10 = m10.f19448y;
            i9 = m10.f19428d;
            i11 = m10.f19429e;
            str = m10.f19427c;
            str2 = m10.f19426b;
        } else {
            r5 = y.r(1, m9.f19433i);
            cVar = m9.j;
            if (z9) {
                i10 = m9.f19448y;
                i9 = m9.f19428d;
                i11 = m9.f19429e;
                str = m9.f19427c;
                str2 = m9.f19426b;
            } else {
                i9 = 0;
                str = null;
                i10 = -1;
                i11 = 0;
                str2 = null;
            }
        }
        String d9 = l4.n.d(r5);
        if (z9) {
            i12 = m9.f19430f;
        } else {
            i12 = -1;
        }
        if (z9) {
            i13 = m9.f19431g;
        }
        L l9 = new L();
        l9.f19393a = m9.f19425a;
        l9.f19394b = str2;
        l9.j = m9.f19434k;
        l9.f19402k = d9;
        l9.f19400h = r5;
        l9.f19401i = cVar;
        l9.f19398f = i12;
        l9.f19399g = i13;
        l9.f19415x = i10;
        l9.f19396d = i9;
        l9.f19397e = i11;
        l9.f19395c = str;
        return new M(l9);
    }

    @Override // N3.f0
    public final void B(long j) {
        this.f6835w.B(j);
    }

    @Override // N3.f0
    public final boolean a() {
        return this.f6835w.a();
    }

    @Override // T3.r
    public final void b() {
        for (r rVar : this.f6832t) {
            ArrayList arrayList = rVar.f6889n;
            if (!arrayList.isEmpty()) {
                k kVar = (k) AbstractC0349q.i(arrayList);
                int b9 = rVar.f6872d.b(kVar);
                if (b9 == 1) {
                    kVar.f6797i0 = true;
                } else if (b9 == 2 && !rVar.r0) {
                    k4.M m9 = rVar.j;
                    if (m9.d()) {
                        m9.a();
                    }
                }
            }
        }
        this.f6829q.v(this);
    }

    @Override // N3.InterfaceC0272x
    public final long c(long j, x0 x0Var) {
        T3.j jVar;
        long j4;
        r[] rVarArr = this.f6833u;
        int length = rVarArr.length;
        int i9 = 0;
        while (true) {
            if (i9 >= length) {
                break;
            }
            r rVar = rVarArr[i9];
            if (rVar.f6863A == 2) {
                i iVar = rVar.f6872d;
                int p9 = iVar.f6783q.p();
                Uri[] uriArr = iVar.f6772e;
                int length2 = uriArr.length;
                T3.c cVar = iVar.f6774g;
                if (p9 < length2 && p9 != -1) {
                    jVar = cVar.a(uriArr[iVar.f6783q.j()], true);
                } else {
                    jVar = null;
                }
                if (jVar != null) {
                    F f9 = jVar.f7127r;
                    if (!f9.isEmpty() && jVar.f7153c) {
                        long j9 = jVar.f7118h - cVar.f7091n;
                        long j10 = j - j9;
                        int c3 = y.c(f9, Long.valueOf(j10), true);
                        long j11 = ((T3.g) f9.get(c3)).f7103e;
                        if (c3 != f9.size() - 1) {
                            j4 = ((T3.g) f9.get(c3 + 1)).f7103e;
                        } else {
                            j4 = j11;
                        }
                        return x0Var.a(j10, j11, j4) + j9;
                    }
                }
            } else {
                i9++;
            }
        }
        return j;
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x0090, code lost:
    
        if (r4 != false) goto L25;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0056 A[SYNTHETIC] */
    @Override // T3.r
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean d(android.net.Uri r18, A1.i r19, boolean r20) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            S3.r[] r2 = r0.f6832t
            int r3 = r2.length
            r6 = 0
            r7 = 1
        L9:
            if (r6 >= r3) goto La3
            r8 = r2[r6]
            S3.i r9 = r8.f6872d
            android.net.Uri[] r10 = r9.f6772e
            boolean r11 = l4.y.k(r10, r1)
            if (r11 != 0) goto L1e
            r8 = r19
            r4 = 1
            r16 = 1
            goto L9e
        L1e:
            r11 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r20 != 0) goto L40
            i4.q r13 = r9.f6783q
            k4.G r13 = a.AbstractC0485a.i(r13)
            e1.q r8 = r8.f6880i
            r8.getClass()
            r8 = r19
            B3.f r13 = e1.q.e(r13, r8)
            if (r13 == 0) goto L42
            int r14 = r13.f674a
            r15 = 2
            if (r14 != r15) goto L42
            long r13 = r13.f675b
            goto L43
        L40:
            r8 = r19
        L42:
            r13 = r11
        L43:
            r15 = 0
            r16 = 1
        L46:
            int r4 = r10.length
            r5 = -1
            if (r15 >= r4) goto L56
            r4 = r10[r15]
            boolean r4 = r4.equals(r1)
            if (r4 == 0) goto L53
            goto L57
        L53:
            int r15 = r15 + 1
            goto L46
        L56:
            r15 = r5
        L57:
            if (r15 != r5) goto L5c
        L59:
            r4 = r16
            goto L94
        L5c:
            i4.q r4 = r9.f6783q
            int r4 = r4.u(r15)
            if (r4 != r5) goto L65
            goto L59
        L65:
            boolean r5 = r9.f6785s
            android.net.Uri r10 = r9.f6781o
            boolean r10 = r1.equals(r10)
            r5 = r5 | r10
            r9.f6785s = r5
            int r5 = (r13 > r11 ? 1 : (r13 == r11 ? 0 : -1))
            if (r5 == 0) goto L59
            i4.q r5 = r9.f6783q
            boolean r4 = r5.g(r13, r4)
            if (r4 == 0) goto L93
            T3.c r4 = r9.f6774g
            java.util.HashMap r4 = r4.f7082d
            java.lang.Object r4 = r4.get(r1)
            T3.b r4 = (T3.b) r4
            if (r4 == 0) goto L8f
            boolean r4 = T3.b.a(r4, r13)
            r4 = r4 ^ 1
            goto L90
        L8f:
            r4 = 0
        L90:
            if (r4 == 0) goto L93
            goto L59
        L93:
            r4 = 0
        L94:
            if (r4 == 0) goto L9d
            int r4 = (r13 > r11 ? 1 : (r13 == r11 ? 0 : -1))
            if (r4 == 0) goto L9d
            r4 = r16
            goto L9e
        L9d:
            r4 = 0
        L9e:
            r7 = r7 & r4
            int r6 = r6 + 1
            goto L9
        La3:
            N3.w r1 = r0.f6829q
            r1.v(r0)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: S3.l.d(android.net.Uri, A1.i, boolean):boolean");
    }

    public final r e(String str, int i9, Uri[] uriArr, M[] mArr, M m9, List list, Map map, long j) {
        i iVar = new i(this.f6814a, this.f6815b, uriArr, mArr, this.f6816c, this.f6817d, this.f6823k, list, this.f6827o);
        G g9 = this.f6821h;
        return new r(str, i9, this.f6828p, iVar, map, this.f6822i, j, m9, this.f6818e, this.f6819f, this.f6820g, g9, this.f6826n);
    }

    @Override // N3.f0
    public final long h() {
        return this.f6835w.h();
    }

    @Override // N3.InterfaceC0272x
    public final long k() {
        return -9223372036854775807L;
    }

    @Override // N3.InterfaceC0272x
    public final n0 l() {
        n0 n0Var = this.f6831s;
        n0Var.getClass();
        return n0Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x00a8, code lost:
    
        if (r4[r10] != 1) goto L38;
     */
    @Override // N3.InterfaceC0272x
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void o(N3.InterfaceC0271w r24, long r25) {
        /*
            Method dump skipped, instructions count: 958
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: S3.l.o(N3.w, long):void");
    }

    @Override // N3.f0
    public final long p() {
        return this.f6835w.p();
    }

    @Override // N3.InterfaceC0272x
    public final void q() {
        for (r rVar : this.f6832t) {
            rVar.E();
            if (rVar.r0 && !rVar.f6866D) {
                throw j0.a("Loading finished before preparation is complete.", null);
            }
        }
    }

    @Override // N3.InterfaceC0272x
    public final long w(long j) {
        r[] rVarArr = this.f6833u;
        if (rVarArr.length > 0) {
            boolean H8 = rVarArr[0].H(j, false);
            int i9 = 1;
            while (true) {
                r[] rVarArr2 = this.f6833u;
                if (i9 >= rVarArr2.length) {
                    break;
                }
                rVarArr2[i9].H(j, H8);
                i9++;
            }
            if (H8) {
                ((SparseArray) this.f6823k.f11404b).clear();
            }
        }
        return j;
    }

    @Override // N3.InterfaceC0272x
    public final void x(long j) {
        for (r rVar : this.f6833u) {
            if (rVar.f6865C && !rVar.C()) {
                int length = rVar.f6904v.length;
                for (int i9 = 0; i9 < length; i9++) {
                    rVar.f6904v[i9].h(j, rVar.f6886l0[i9]);
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:167:0x0254  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x0267  */
    /* JADX WARN: Type inference failed for: r27v1 */
    /* JADX WARN: Type inference failed for: r6v30 */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v20, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v23 */
    /* JADX WARN: Type inference failed for: r9v10 */
    /* JADX WARN: Type inference failed for: r9v8 */
    /* JADX WARN: Type inference failed for: r9v9 */
    @Override // N3.InterfaceC0272x
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long y(i4.q[] r38, boolean[] r39, N3.d0[] r40, boolean[] r41, long r42) {
        /*
            Method dump skipped, instructions count: 803
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: S3.l.y(i4.q[], boolean[], N3.d0[], boolean[], long):long");
    }

    @Override // N3.f0
    public final boolean z(long j) {
        if (this.f6831s == null) {
            for (r rVar : this.f6832t) {
                if (!rVar.f6866D) {
                    rVar.z(rVar.f6890n0);
                }
            }
            return false;
        }
        return this.f6835w.z(j);
    }
}
