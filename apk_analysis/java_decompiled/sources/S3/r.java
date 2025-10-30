package S3;

import N3.C0251b;
import N3.C0270v;
import N3.G;
import N3.b0;
import N3.f0;
import N3.m0;
import N3.n0;
import P5.AbstractC0349q;
import a.AbstractC0485a;
import android.net.Uri;
import android.os.Handler;
import android.util.SparseIntArray;
import com.google.android.gms.internal.measurement.C1;
import j3.L;
import j3.M;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import k4.C1498D;
import k4.C1517q;
import k4.H;
import k4.J;
import k4.K;
import l4.AbstractC1566a;
import l4.y;
import n3.C1630g;
import n3.C1635l;
import n3.InterfaceC1638o;
import o1.C1671f;
import q3.C1904i;
import q3.InterfaceC1907l;

/* loaded from: classes.dex */
public final class r implements H, K, f0, InterfaceC1907l, b0 {

    /* renamed from: w0, reason: collision with root package name */
    public static final Set f6862w0 = Collections.unmodifiableSet(new HashSet(Arrays.asList(1, 2, 5)));

    /* renamed from: A, reason: collision with root package name */
    public int f6863A;

    /* renamed from: B, reason: collision with root package name */
    public int f6864B;

    /* renamed from: C, reason: collision with root package name */
    public boolean f6865C;

    /* renamed from: D, reason: collision with root package name */
    public boolean f6866D;

    /* renamed from: X, reason: collision with root package name */
    public int f6867X;
    public M Y;

    /* renamed from: Z, reason: collision with root package name */
    public M f6868Z;

    /* renamed from: a, reason: collision with root package name */
    public final String f6869a;

    /* renamed from: b, reason: collision with root package name */
    public final int f6870b;

    /* renamed from: c, reason: collision with root package name */
    public final s4.i f6871c;

    /* renamed from: d, reason: collision with root package name */
    public final i f6872d;

    /* renamed from: e, reason: collision with root package name */
    public final C1517q f6873e;

    /* renamed from: f, reason: collision with root package name */
    public final M f6874f;

    /* renamed from: f0, reason: collision with root package name */
    public boolean f6875f0;

    /* renamed from: g, reason: collision with root package name */
    public final InterfaceC1638o f6876g;

    /* renamed from: g0, reason: collision with root package name */
    public n0 f6877g0;

    /* renamed from: h, reason: collision with root package name */
    public final C1635l f6878h;

    /* renamed from: h0, reason: collision with root package name */
    public Set f6879h0;

    /* renamed from: i, reason: collision with root package name */
    public final e1.q f6880i;

    /* renamed from: i0, reason: collision with root package name */
    public int[] f6881i0;
    public final k4.M j = new k4.M("Loader:HlsSampleStreamWrapper");

    /* renamed from: j0, reason: collision with root package name */
    public int f6882j0;

    /* renamed from: k, reason: collision with root package name */
    public final G f6883k;

    /* renamed from: k0, reason: collision with root package name */
    public boolean f6884k0;

    /* renamed from: l, reason: collision with root package name */
    public final int f6885l;

    /* renamed from: l0, reason: collision with root package name */
    public boolean[] f6886l0;

    /* renamed from: m, reason: collision with root package name */
    public final C1 f6887m;

    /* renamed from: m0, reason: collision with root package name */
    public boolean[] f6888m0;

    /* renamed from: n, reason: collision with root package name */
    public final ArrayList f6889n;

    /* renamed from: n0, reason: collision with root package name */
    public long f6890n0;

    /* renamed from: o, reason: collision with root package name */
    public final List f6891o;

    /* renamed from: o0, reason: collision with root package name */
    public long f6892o0;

    /* renamed from: p, reason: collision with root package name */
    public final o f6893p;

    /* renamed from: p0, reason: collision with root package name */
    public boolean f6894p0;

    /* renamed from: q, reason: collision with root package name */
    public final o f6895q;

    /* renamed from: q0, reason: collision with root package name */
    public boolean f6896q0;

    /* renamed from: r, reason: collision with root package name */
    public final Handler f6897r;
    public boolean r0;

    /* renamed from: s, reason: collision with root package name */
    public final ArrayList f6898s;

    /* renamed from: s0, reason: collision with root package name */
    public boolean f6899s0;

    /* renamed from: t, reason: collision with root package name */
    public final Map f6900t;

    /* renamed from: t0, reason: collision with root package name */
    public long f6901t0;

    /* renamed from: u, reason: collision with root package name */
    public P3.e f6902u;

    /* renamed from: u0, reason: collision with root package name */
    public C1630g f6903u0;

    /* renamed from: v, reason: collision with root package name */
    public q[] f6904v;

    /* renamed from: v0, reason: collision with root package name */
    public k f6905v0;

    /* renamed from: w, reason: collision with root package name */
    public int[] f6906w;

    /* renamed from: x, reason: collision with root package name */
    public final HashSet f6907x;

    /* renamed from: y, reason: collision with root package name */
    public final SparseIntArray f6908y;

    /* renamed from: z, reason: collision with root package name */
    public p f6909z;

    /* JADX WARN: Type inference failed for: r1v12, types: [S3.o] */
    /* JADX WARN: Type inference failed for: r1v13, types: [S3.o] */
    /* JADX WARN: Type inference failed for: r1v2, types: [com.google.android.gms.internal.measurement.C1, java.lang.Object] */
    public r(String str, int i9, s4.i iVar, i iVar2, Map map, C1517q c1517q, long j, M m9, InterfaceC1638o interfaceC1638o, C1635l c1635l, e1.q qVar, G g9, int i10) {
        this.f6869a = str;
        this.f6870b = i9;
        this.f6871c = iVar;
        this.f6872d = iVar2;
        this.f6900t = map;
        this.f6873e = c1517q;
        this.f6874f = m9;
        this.f6876g = interfaceC1638o;
        this.f6878h = c1635l;
        this.f6880i = qVar;
        this.f6883k = g9;
        this.f6885l = i10;
        ?? obj = new Object();
        obj.f15187b = null;
        obj.f15186a = false;
        obj.f15188c = null;
        this.f6887m = obj;
        this.f6906w = new int[0];
        Set set = f6862w0;
        this.f6907x = new HashSet(set.size());
        this.f6908y = new SparseIntArray(set.size());
        this.f6904v = new q[0];
        this.f6888m0 = new boolean[0];
        this.f6886l0 = new boolean[0];
        ArrayList arrayList = new ArrayList();
        this.f6889n = arrayList;
        this.f6891o = Collections.unmodifiableList(arrayList);
        this.f6898s = new ArrayList();
        final int i11 = 0;
        this.f6893p = new Runnable(this) { // from class: S3.o

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ r f6852b;

            {
                this.f6852b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i11) {
                    case 0:
                        this.f6852b.D();
                        return;
                    default:
                        r rVar = this.f6852b;
                        rVar.f6865C = true;
                        rVar.D();
                        return;
                }
            }
        };
        final int i12 = 1;
        this.f6895q = new Runnable(this) { // from class: S3.o

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ r f6852b;

            {
                this.f6852b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i12) {
                    case 0:
                        this.f6852b.D();
                        return;
                    default:
                        r rVar = this.f6852b;
                        rVar.f6865C = true;
                        rVar.D();
                        return;
                }
            }
        };
        this.f6897r = y.l(null);
        this.f6890n0 = j;
        this.f6892o0 = j;
    }

    public static C1904i d(int i9, int i10) {
        AbstractC1566a.P("HlsSampleStreamWrapper", "Unmapped track with id " + i9 + " of type " + i10);
        return new C1904i();
    }

    public static M m(M m9, M m10, boolean z9) {
        String str;
        String str2;
        int i9;
        int i10;
        if (m9 == null) {
            return m10;
        }
        String str3 = m10.f19435l;
        int h7 = l4.n.h(str3);
        String str4 = m9.f19433i;
        if (y.q(h7, str4) == 1) {
            str2 = y.r(h7, str4);
            str = l4.n.d(str2);
        } else {
            String b9 = l4.n.b(str4, str3);
            str = str3;
            str2 = b9;
        }
        L a5 = m10.a();
        a5.f19393a = m9.f19425a;
        a5.f19394b = m9.f19426b;
        a5.f19395c = m9.f19427c;
        a5.f19396d = m9.f19428d;
        a5.f19397e = m9.f19429e;
        if (z9) {
            i9 = m9.f19430f;
        } else {
            i9 = -1;
        }
        a5.f19398f = i9;
        if (z9) {
            i10 = m9.f19431g;
        } else {
            i10 = -1;
        }
        a5.f19399g = i10;
        a5.f19400h = str2;
        if (h7 == 2) {
            a5.f19407p = m9.f19440q;
            a5.f19408q = m9.f19441r;
            a5.f19409r = m9.f19442s;
        }
        if (str != null) {
            a5.f19402k = str;
        }
        int i11 = m9.f19448y;
        if (i11 != -1 && h7 == 1) {
            a5.f19415x = i11;
        }
        D3.c cVar = m9.j;
        if (cVar != null) {
            D3.c cVar2 = m10.j;
            if (cVar2 != null) {
                D3.b[] bVarArr = cVar.f1786a;
                if (bVarArr.length == 0) {
                    cVar = cVar2;
                } else {
                    D3.b[] bVarArr2 = cVar2.f1786a;
                    Object[] copyOf = Arrays.copyOf(bVarArr2, bVarArr2.length + bVarArr.length);
                    System.arraycopy(bVarArr, 0, copyOf, bVarArr2.length, bVarArr.length);
                    cVar = new D3.c(cVar2.f1787b, (D3.b[]) copyOf);
                }
            }
            a5.f19401i = cVar;
        }
        return new M(a5);
    }

    public static int v(int i9) {
        if (i9 == 1) {
            return 2;
        }
        if (i9 == 2) {
            return 3;
        }
        if (i9 == 3) {
            return 1;
        }
        return 0;
    }

    @Override // N3.b0
    public final void A() {
        this.f6897r.post(this.f6893p);
    }

    @Override // N3.f0
    public final void B(long j) {
        int size;
        boolean n7;
        k4.M m9 = this.j;
        if (!m9.c() && !C()) {
            boolean d9 = m9.d();
            i iVar = this.f6872d;
            List list = this.f6891o;
            if (d9) {
                this.f6902u.getClass();
                P3.e eVar = this.f6902u;
                if (iVar.f6780n != null) {
                    n7 = false;
                } else {
                    n7 = iVar.f6783q.n(j, eVar, list);
                }
                if (n7) {
                    m9.a();
                    return;
                }
                return;
            }
            int size2 = list.size();
            while (size2 > 0 && iVar.b((k) list.get(size2 - 1)) == 2) {
                size2--;
            }
            if (size2 < list.size()) {
                n(size2);
            }
            if (iVar.f6780n == null && iVar.f6783q.length() >= 2) {
                size = iVar.f6783q.f(j, list);
            } else {
                size = list.size();
            }
            if (size < this.f6889n.size()) {
                n(size);
            }
        }
    }

    public final boolean C() {
        if (this.f6892o0 != -9223372036854775807L) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void D() {
        boolean z9;
        int i9;
        M m9;
        int i10 = 0;
        if (!this.f6875f0 && this.f6881i0 == null && this.f6865C) {
            for (q qVar : this.f6904v) {
                if (qVar.t() == null) {
                    return;
                }
            }
            n0 n0Var = this.f6877g0;
            if (n0Var != null) {
                int i11 = n0Var.f5170a;
                int[] iArr = new int[i11];
                this.f6881i0 = iArr;
                Arrays.fill(iArr, -1);
                for (int i12 = 0; i12 < i11; i12++) {
                    int i13 = 0;
                    while (true) {
                        q[] qVarArr = this.f6904v;
                        if (i13 < qVarArr.length) {
                            M t7 = qVarArr[i13].t();
                            AbstractC1566a.n(t7);
                            M m10 = this.f6877g0.a(i12).f5167d[0];
                            String str = m10.f19435l;
                            String str2 = t7.f19435l;
                            int h7 = l4.n.h(str2);
                            if (h7 != 3) {
                                if (h7 == l4.n.h(str)) {
                                    break;
                                } else {
                                    i13++;
                                }
                            } else {
                                if (y.a(str2, str)) {
                                    if ((!"application/cea-608".equals(str2) && !"application/cea-708".equals(str2)) || t7.f19423D == m10.f19423D) {
                                        break;
                                    }
                                } else {
                                    continue;
                                }
                                i13++;
                            }
                        }
                    }
                    this.f6881i0[i12] = i13;
                }
                ArrayList arrayList = this.f6898s;
                int size = arrayList.size();
                while (i10 < size) {
                    Object obj = arrayList.get(i10);
                    i10++;
                    ((n) obj).a();
                }
                return;
            }
            int length = this.f6904v.length;
            int i14 = 0;
            int i15 = -1;
            int i16 = -2;
            while (true) {
                int i17 = 2;
                if (i14 >= length) {
                    break;
                }
                M t9 = this.f6904v[i14].t();
                AbstractC1566a.n(t9);
                String str3 = t9.f19435l;
                if (!l4.n.l(str3)) {
                    if (l4.n.j(str3)) {
                        i17 = 1;
                    } else if (l4.n.k(str3)) {
                        i17 = 3;
                    } else {
                        i17 = -2;
                    }
                }
                if (v(i17) > v(i16)) {
                    i15 = i14;
                    i16 = i17;
                } else if (i17 == i16 && i15 != -1) {
                    i15 = -1;
                }
                i14++;
            }
            m0 m0Var = this.f6872d.f6775h;
            int i18 = m0Var.f5164a;
            this.f6882j0 = -1;
            this.f6881i0 = new int[length];
            for (int i19 = 0; i19 < length; i19++) {
                this.f6881i0[i19] = i19;
            }
            m0[] m0VarArr = new m0[length];
            int i20 = 0;
            while (i20 < length) {
                M t10 = this.f6904v[i20].t();
                AbstractC1566a.n(t10);
                String str4 = this.f6869a;
                M m11 = this.f6874f;
                if (i20 == i15) {
                    M[] mArr = new M[i18];
                    for (int i21 = i10; i21 < i18; i21++) {
                        M m12 = m0Var.f5167d[i21];
                        if (i16 == 1 && m11 != null) {
                            m12 = m12.c(m11);
                        }
                        if (i18 == 1) {
                            m9 = t10.c(m12);
                        } else {
                            m9 = m(m12, t10, true);
                        }
                        mArr[i21] = m9;
                    }
                    m0VarArr[i20] = new m0(str4, mArr);
                    this.f6882j0 = i20;
                    i9 = 0;
                } else {
                    if (i16 != 2 || !l4.n.j(t10.f19435l)) {
                        m11 = null;
                    }
                    StringBuilder sb = new StringBuilder();
                    sb.append(str4);
                    sb.append(":muxed:");
                    sb.append(i20 < i15 ? i20 : i20 - 1);
                    i9 = 0;
                    m0VarArr[i20] = new m0(sb.toString(), m(m11, t10, false));
                }
                i20++;
                i10 = i9;
            }
            int i22 = i10;
            this.f6877g0 = j(m0VarArr);
            if (this.f6879h0 == null) {
                z9 = 1;
            } else {
                z9 = i22;
            }
            AbstractC1566a.m(z9);
            this.f6879h0 = Collections.EMPTY_SET;
            this.f6866D = true;
            this.f6871c.P();
        }
    }

    public final void E() {
        this.j.b();
        i iVar = this.f6872d;
        C0251b c0251b = iVar.f6780n;
        if (c0251b == null) {
            Uri uri = iVar.f6781o;
            if (uri != null && iVar.f6785s) {
                T3.b bVar = (T3.b) iVar.f6774g.f7082d.get(uri);
                bVar.f7069b.b();
                IOException iOException = bVar.j;
                if (iOException != null) {
                    throw iOException;
                }
                return;
            }
            return;
        }
        throw c0251b;
    }

    public final void F(m0[] m0VarArr, int... iArr) {
        this.f6877g0 = j(m0VarArr);
        this.f6879h0 = new HashSet();
        for (int i9 : iArr) {
            this.f6879h0.add(this.f6877g0.a(i9));
        }
        this.f6882j0 = 0;
        this.f6897r.post(new A6.s(10, this.f6871c));
        this.f6866D = true;
    }

    public final void G() {
        for (q qVar : this.f6904v) {
            qVar.B(this.f6894p0);
        }
        this.f6894p0 = false;
    }

    public final boolean H(long j, boolean z9) {
        this.f6890n0 = j;
        if (C()) {
            this.f6892o0 = j;
            return true;
        }
        if (this.f6865C && !z9) {
            int length = this.f6904v.length;
            for (int i9 = 0; i9 < length; i9++) {
                if (this.f6904v[i9].E(j, false) || (!this.f6888m0[i9] && this.f6884k0)) {
                }
            }
            return false;
        }
        this.f6892o0 = j;
        this.r0 = false;
        this.f6889n.clear();
        k4.M m9 = this.j;
        if (m9.d()) {
            if (this.f6865C) {
                for (q qVar : this.f6904v) {
                    qVar.i();
                }
            }
            m9.a();
            return true;
        }
        m9.f20007c = null;
        G();
        return true;
    }

    @Override // N3.f0
    public final boolean a() {
        return this.j.d();
    }

    public final void b() {
        AbstractC1566a.m(this.f6866D);
        this.f6877g0.getClass();
        this.f6879h0.getClass();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, N3.q] */
    @Override // k4.H
    public final B3.f e(J j, IOException iOException, int i9) {
        boolean z9;
        B3.f fVar;
        int i10;
        P3.e eVar = (P3.e) j;
        boolean z10 = eVar instanceof k;
        if (z10 && !((k) eVar).f6797i0 && (iOException instanceof C1498D) && ((i10 = ((C1498D) iOException).f19982d) == 410 || i10 == 404)) {
            return k4.M.f20002d;
        }
        long j4 = eVar.f5846i.f20033b;
        Uri uri = eVar.f5846i.f20034c;
        ?? obj = new Object();
        y.T(eVar.f5844g);
        y.T(eVar.f5845h);
        A1.i iVar = new A1.i(i9, iOException);
        i iVar2 = this.f6872d;
        k4.G i11 = AbstractC0485a.i(iVar2.f6783q);
        this.f6880i.getClass();
        B3.f e8 = e1.q.e(i11, iVar);
        boolean z11 = false;
        if (e8 != null && e8.f674a == 2) {
            i4.q qVar = iVar2.f6783q;
            z9 = qVar.g(e8.f675b, qVar.u(iVar2.f6775h.a(eVar.f5841d)));
        } else {
            z9 = false;
        }
        if (z9) {
            if (z10 && j4 == 0) {
                ArrayList arrayList = this.f6889n;
                if (((k) arrayList.remove(arrayList.size() - 1)) == eVar) {
                    z11 = true;
                }
                AbstractC1566a.m(z11);
                if (arrayList.isEmpty()) {
                    this.f6892o0 = this.f6890n0;
                } else {
                    ((k) AbstractC0349q.i(arrayList)).f6796h0 = true;
                }
            }
            fVar = k4.M.f20003e;
        } else {
            long h7 = e1.q.h(iVar);
            if (h7 != -9223372036854775807L) {
                fVar = new B3.f(0, h7, false);
            } else {
                fVar = k4.M.f20004f;
            }
        }
        B3.f fVar2 = fVar;
        boolean a5 = fVar2.a();
        this.f6883k.i(obj, eVar.f5840c, this.f6870b, eVar.f5841d, eVar.f5842e, eVar.f5843f, eVar.f5844g, eVar.f5845h, iOException, !a5);
        if (!a5) {
            this.f6902u = null;
        }
        if (z9) {
            if (!this.f6866D) {
                z(this.f6890n0);
                return fVar2;
            }
            this.f6871c.v(this);
        }
        return fVar2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, N3.q] */
    @Override // k4.H
    public final void f(J j, long j4, long j9) {
        P3.e eVar = (P3.e) j;
        this.f6902u = null;
        i iVar = this.f6872d;
        if (eVar instanceof e) {
            e eVar2 = (e) eVar;
            iVar.f6779m = eVar2.j;
            Uri uri = eVar2.f5839b.f20077a;
            byte[] bArr = eVar2.f6760l;
            bArr.getClass();
            C1671f c1671f = iVar.j;
            c1671f.getClass();
            uri.getClass();
        }
        long j10 = eVar.f5838a;
        Uri uri2 = eVar.f5846i.f20034c;
        ?? obj = new Object();
        this.f6880i.getClass();
        this.f6883k.g(obj, eVar.f5840c, this.f6870b, eVar.f5841d, eVar.f5842e, eVar.f5843f, eVar.f5844g, eVar.f5845h);
        if (!this.f6866D) {
            z(this.f6890n0);
        } else {
            this.f6871c.v(this);
        }
    }

    @Override // k4.K
    public final void g() {
        for (q qVar : this.f6904v) {
            qVar.A();
        }
    }

    @Override // N3.f0
    public final long h() {
        if (C()) {
            return this.f6892o0;
        }
        if (this.r0) {
            return Long.MIN_VALUE;
        }
        return t().f5845h;
    }

    @Override // q3.InterfaceC1907l
    public final void i() {
        this.f6899s0 = true;
        this.f6897r.post(this.f6895q);
    }

    public final n0 j(m0[] m0VarArr) {
        for (int i9 = 0; i9 < m0VarArr.length; i9++) {
            m0 m0Var = m0VarArr[i9];
            M[] mArr = new M[m0Var.f5164a];
            for (int i10 = 0; i10 < m0Var.f5164a; i10++) {
                M m9 = m0Var.f5167d[i10];
                int h7 = this.f6876g.h(m9);
                L a5 = m9.a();
                a5.f19392D = h7;
                mArr[i10] = new M(a5);
            }
            m0VarArr[i9] = new m0(m0Var.f5165b, mArr);
        }
        return new n0(m0VarArr);
    }

    public final void n(int i9) {
        ArrayList arrayList;
        AbstractC1566a.m(!this.j.d());
        int i10 = i9;
        loop0: while (true) {
            arrayList = this.f6889n;
            if (i10 < arrayList.size()) {
                int i11 = i10;
                while (true) {
                    if (i11 < arrayList.size()) {
                        if (((k) arrayList.get(i11)).f6801n) {
                            break;
                        } else {
                            i11++;
                        }
                    } else {
                        k kVar = (k) arrayList.get(i10);
                        for (int i12 = 0; i12 < this.f6904v.length; i12++) {
                            if (this.f6904v[i12].q() > kVar.g(i12)) {
                                break;
                            }
                        }
                        break loop0;
                    }
                }
            } else {
                i10 = -1;
                break;
            }
            i10++;
        }
        if (i10 == -1) {
            return;
        }
        long j = t().f5845h;
        k kVar2 = (k) arrayList.get(i10);
        y.N(arrayList, i10, arrayList.size());
        for (int i13 = 0; i13 < this.f6904v.length; i13++) {
            this.f6904v[i13].k(kVar2.g(i13));
        }
        if (arrayList.isEmpty()) {
            this.f6892o0 = this.f6890n0;
        } else {
            ((k) AbstractC0349q.i(arrayList)).f6796h0 = true;
        }
        this.r0 = false;
        int i14 = this.f6863A;
        long j4 = kVar2.f5844g;
        G g9 = this.f6883k;
        g9.n(new C0270v(1, i14, null, 3, null, g9.a(j4), g9.a(j)));
    }

    @Override // N3.f0
    public final long p() {
        if (this.r0) {
            return Long.MIN_VALUE;
        }
        if (C()) {
            return this.f6892o0;
        }
        long j = this.f6890n0;
        k t7 = t();
        if (!t7.f6794f0) {
            ArrayList arrayList = this.f6889n;
            if (arrayList.size() > 1) {
                t7 = (k) arrayList.get(arrayList.size() - 2);
            } else {
                t7 = null;
            }
        }
        if (t7 != null) {
            j = Math.max(j, t7.f5845h);
        }
        if (this.f6865C) {
            for (q qVar : this.f6904v) {
                j = Math.max(j, qVar.n());
            }
        }
        return j;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, N3.q] */
    @Override // k4.H
    public final void s(J j, long j4, long j9, boolean z9) {
        P3.e eVar = (P3.e) j;
        this.f6902u = null;
        long j10 = eVar.f5838a;
        Uri uri = eVar.f5846i.f20034c;
        ?? obj = new Object();
        this.f6880i.getClass();
        this.f6883k.d(obj, eVar.f5840c, this.f6870b, eVar.f5841d, eVar.f5842e, eVar.f5843f, eVar.f5844g, eVar.f5845h);
        if (!z9) {
            if (C() || this.f6867X == 0) {
                G();
            }
            if (this.f6867X > 0) {
                this.f6871c.v(this);
            }
        }
    }

    public final k t() {
        return (k) this.f6889n.get(r0.size() - 1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r1v15, types: [S3.q[]] */
    /* JADX WARN: Type inference failed for: r2v1, types: [S3.q[]] */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v3, types: [q3.u] */
    /* JADX WARN: Type inference failed for: r6v4, types: [S3.q, N3.c0] */
    /* JADX WARN: Type inference failed for: r6v5, types: [q3.i] */
    /* JADX WARN: Type inference failed for: r6v6 */
    /* JADX WARN: Type inference failed for: r6v7 */
    @Override // q3.InterfaceC1907l
    public final q3.u u(int i9, int i10) {
        Integer valueOf = Integer.valueOf(i10);
        Set set = f6862w0;
        boolean contains = set.contains(valueOf);
        HashSet hashSet = this.f6907x;
        SparseIntArray sparseIntArray = this.f6908y;
        boolean z9 = false;
        ?? r62 = 0;
        r62 = 0;
        if (contains) {
            AbstractC1566a.h(set.contains(Integer.valueOf(i10)));
            int i11 = sparseIntArray.get(i10, -1);
            if (i11 != -1) {
                if (hashSet.add(Integer.valueOf(i10))) {
                    this.f6906w[i11] = i9;
                }
                r62 = this.f6906w[i11] == i9 ? this.f6904v[i11] : d(i9, i10);
            }
        } else {
            int i12 = 0;
            while (true) {
                ?? r22 = this.f6904v;
                if (i12 >= r22.length) {
                    break;
                }
                if (this.f6906w[i12] == i9) {
                    r62 = r22[i12];
                    break;
                }
                i12++;
            }
        }
        if (r62 == 0) {
            if (this.f6899s0) {
                return d(i9, i10);
            }
            int length = this.f6904v.length;
            if (i10 == 1 || i10 == 2) {
                z9 = true;
            }
            r62 = new q(this.f6873e, this.f6876g, this.f6878h, this.f6900t);
            r62.f5072t = this.f6890n0;
            if (z9) {
                r62.f6861I = this.f6903u0;
                r62.f5078z = true;
            }
            long j = this.f6901t0;
            if (r62.f5052F != j) {
                r62.f5052F = j;
                r62.f5078z = true;
            }
            k kVar = this.f6905v0;
            if (kVar != null) {
                r62.f5049C = kVar.f6798k;
            }
            r62.f5059f = this;
            int i13 = length + 1;
            int[] copyOf = Arrays.copyOf(this.f6906w, i13);
            this.f6906w = copyOf;
            copyOf[length] = i9;
            q[] qVarArr = this.f6904v;
            int i14 = y.f20553a;
            ?? copyOf2 = Arrays.copyOf(qVarArr, qVarArr.length + 1);
            copyOf2[qVarArr.length] = r62;
            this.f6904v = (q[]) copyOf2;
            boolean[] copyOf3 = Arrays.copyOf(this.f6888m0, i13);
            this.f6888m0 = copyOf3;
            copyOf3[length] = z9;
            this.f6884k0 |= z9;
            hashSet.add(Integer.valueOf(i10));
            sparseIntArray.append(i10, length);
            if (v(i10) > v(this.f6863A)) {
                this.f6864B = length;
                this.f6863A = i10;
            }
            this.f6886l0 = Arrays.copyOf(this.f6886l0, i13);
        }
        if (i10 == 5) {
            if (this.f6909z == null) {
                this.f6909z = new p(r62, this.f6885l);
            }
            return this.f6909z;
        }
        return r62;
    }

    /* JADX WARN: Code restructure failed: missing block: B:208:0x02b9, code lost:
    
        if (r15 < r5.f5845h) goto L145;
     */
    /* JADX WARN: Removed duplicated region for block: B:127:0x02de  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x02f3  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x030b  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0331  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0338  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x0347  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x035c  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x03a8  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x0416  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x03f0  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x0395  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x0354  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x0342  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x0334  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x0310  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x02f5  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x02e5  */
    /* JADX WARN: Type inference failed for: r2v28, types: [java.io.IOException, N3.b] */
    @Override // N3.f0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean z(long r61) {
        /*
            Method dump skipped, instructions count: 1314
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: S3.r.z(long):boolean");
    }

    @Override // q3.InterfaceC1907l
    public final void r(q3.r rVar) {
    }
}
