package Q3;

import N3.C0263n;
import N3.G;
import N3.InterfaceC0271w;
import N3.InterfaceC0272x;
import N3.c0;
import N3.d0;
import N3.e0;
import N3.f0;
import N3.m0;
import N3.n0;
import android.util.Pair;
import android.util.SparseArray;
import android.util.SparseIntArray;
import b7.C0701c;
import com.google.android.gms.internal.measurement.AbstractC0953k1;
import com.google.firebase.messaging.s;
import e1.q;
import j3.L;
import j3.M;
import j3.x0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import k4.C1517q;
import k4.InterfaceC1512l;
import k4.InterfaceC1513m;
import k4.N;
import k4.W;
import l4.AbstractC1566a;
import l4.y;
import n3.C1635l;
import n3.InterfaceC1638o;
import o1.C1671f;
import u0.z;

/* loaded from: classes.dex */
public final class b implements InterfaceC0272x, e0 {

    /* renamed from: x, reason: collision with root package name */
    public static final Pattern f6321x = Pattern.compile("CC([1-4])=(.+)");

    /* renamed from: y, reason: collision with root package name */
    public static final Pattern f6322y = Pattern.compile("([1-4])=lang:(\\w+)(,.+)?");

    /* renamed from: a, reason: collision with root package name */
    public final int f6323a;

    /* renamed from: b, reason: collision with root package name */
    public final C1671f f6324b;

    /* renamed from: c, reason: collision with root package name */
    public final W f6325c;

    /* renamed from: d, reason: collision with root package name */
    public final InterfaceC1638o f6326d;

    /* renamed from: e, reason: collision with root package name */
    public final q f6327e;

    /* renamed from: f, reason: collision with root package name */
    public final s f6328f;

    /* renamed from: g, reason: collision with root package name */
    public final long f6329g;

    /* renamed from: h, reason: collision with root package name */
    public final N f6330h;

    /* renamed from: i, reason: collision with root package name */
    public final C1517q f6331i;
    public final n0 j;

    /* renamed from: k, reason: collision with root package name */
    public final a[] f6332k;

    /* renamed from: l, reason: collision with root package name */
    public final F5.e f6333l;

    /* renamed from: m, reason: collision with root package name */
    public final p f6334m;

    /* renamed from: o, reason: collision with root package name */
    public final G f6336o;

    /* renamed from: p, reason: collision with root package name */
    public final C1635l f6337p;

    /* renamed from: q, reason: collision with root package name */
    public InterfaceC0271w f6338q;

    /* renamed from: t, reason: collision with root package name */
    public C0701c f6341t;

    /* renamed from: u, reason: collision with root package name */
    public R3.c f6342u;

    /* renamed from: v, reason: collision with root package name */
    public int f6343v;

    /* renamed from: w, reason: collision with root package name */
    public List f6344w;

    /* renamed from: r, reason: collision with root package name */
    public P3.g[] f6339r = new P3.g[0];

    /* renamed from: s, reason: collision with root package name */
    public m[] f6340s = new m[0];

    /* renamed from: n, reason: collision with root package name */
    public final IdentityHashMap f6335n = new IdentityHashMap();

    /* JADX WARN: Multi-variable type inference failed */
    public b(int i9, R3.c cVar, s sVar, int i10, C1671f c1671f, W w7, InterfaceC1638o interfaceC1638o, C1635l c1635l, q qVar, G g9, long j, N n7, C1517q c1517q, F5.e eVar, f fVar, k3.l lVar) {
        String j4;
        int i11;
        int i12;
        int[][] iArr;
        boolean[] zArr;
        M[] mArr;
        R3.f b9;
        int i13 = 0;
        boolean z9 = true;
        this.f6323a = i9;
        this.f6342u = cVar;
        this.f6328f = sVar;
        this.f6343v = i10;
        this.f6324b = c1671f;
        this.f6325c = w7;
        this.f6326d = interfaceC1638o;
        this.f6337p = c1635l;
        this.f6327e = qVar;
        this.f6336o = g9;
        this.f6329g = j;
        this.f6330h = n7;
        this.f6331i = c1517q;
        this.f6333l = eVar;
        this.f6334m = new p(cVar, fVar, c1517q);
        P3.g[] gVarArr = this.f6339r;
        eVar.getClass();
        this.f6341t = new C0701c(11, gVarArr);
        R3.h b10 = cVar.b(i10);
        List list = b10.f6618d;
        this.f6344w = list;
        List list2 = b10.f6617c;
        int size = list2.size();
        SparseIntArray sparseIntArray = new SparseIntArray(size);
        ArrayList arrayList = new ArrayList(size);
        SparseArray sparseArray = new SparseArray(size);
        for (int i14 = 0; i14 < size; i14++) {
            sparseIntArray.put(((R3.a) list2.get(i14)).f6575a, i14);
            ArrayList arrayList2 = new ArrayList();
            arrayList2.add(Integer.valueOf(i14));
            arrayList.add(arrayList2);
            sparseArray.put(i14, arrayList2);
        }
        int i15 = 0;
        while (i15 < size) {
            R3.a aVar = (R3.a) list2.get(i15);
            R3.f b11 = b("http://dashif.org/guidelines/trickmode", aVar.f6579e);
            List list3 = aVar.f6580f;
            b11 = b11 == null ? b("http://dashif.org/guidelines/trickmode", list3) : b11;
            int i16 = (b11 == null || (i16 = sparseIntArray.get(Integer.parseInt(b11.f6609b), -1)) == -1) ? i15 : i16;
            if (i16 == i15 && (b9 = b("urn:mpeg:dash:adaptation-set-switching:2016", list3)) != null) {
                int i17 = y.f20553a;
                String[] split = b9.f6609b.split(",", -1);
                int length = split.length;
                int i18 = 0;
                while (i18 < length) {
                    boolean z10 = z9;
                    int i19 = sparseIntArray.get(Integer.parseInt(split[i18]), -1);
                    if (i19 != -1) {
                        i16 = Math.min(i16, i19);
                    }
                    i18++;
                    z9 = z10;
                }
            }
            boolean z11 = z9;
            if (i16 != i15) {
                List list4 = (List) sparseArray.get(i15);
                List list5 = (List) sparseArray.get(i16);
                list5.addAll(list4);
                sparseArray.put(i15, list5);
                arrayList.remove(list4);
            }
            i15++;
            z9 = z11;
        }
        boolean z12 = z9;
        int size2 = arrayList.size();
        int[][] iArr2 = new int[size2];
        for (int i20 = 0; i20 < size2; i20++) {
            int[] U8 = v4.e.U((Collection) arrayList.get(i20));
            iArr2[i20] = U8;
            Arrays.sort(U8);
        }
        boolean[] zArr2 = new boolean[size2];
        M[][] mArr2 = new M[size2];
        int i21 = 0;
        int i22 = 0;
        while (i21 < size2) {
            int[] iArr3 = iArr2[i21];
            int length2 = iArr3.length;
            int i23 = i13;
            while (true) {
                if (i23 >= length2) {
                    break;
                }
                List list6 = ((R3.a) list2.get(iArr3[i23])).f6577c;
                for (int i24 = i13; i24 < list6.size(); i24++) {
                    if (!((R3.m) list6.get(i24)).f6634d.isEmpty()) {
                        zArr2[i21] = z12;
                        i22++;
                        break;
                    }
                }
                i23++;
                i13 = 0;
            }
            int[] iArr4 = iArr2[i21];
            int length3 = iArr4.length;
            int i25 = 0;
            while (true) {
                if (i25 < length3) {
                    int i26 = iArr4[i25];
                    R3.a aVar2 = (R3.a) list2.get(i26);
                    List list7 = ((R3.a) list2.get(i26)).f6578d;
                    int[] iArr5 = iArr4;
                    int i27 = 0;
                    while (i27 < list7.size()) {
                        R3.f fVar2 = (R3.f) list7.get(i27);
                        iArr = iArr2;
                        zArr = zArr2;
                        if ("urn:scte:dash:cc:cea-608:2015".equals(fVar2.f6608a)) {
                            L l9 = new L();
                            l9.f19402k = "application/cea-608";
                            l9.f19393a = z.g(new StringBuilder(), aVar2.f6575a, ":cea608");
                            mArr = e(fVar2, f6321x, new M(l9));
                            break;
                        }
                        if ("urn:scte:dash:cc:cea-708:2015".equals(fVar2.f6608a)) {
                            L l10 = new L();
                            l10.f19402k = "application/cea-708";
                            l10.f19393a = z.g(new StringBuilder(), aVar2.f6575a, ":cea708");
                            mArr = e(fVar2, f6322y, new M(l10));
                            break;
                        }
                        i27++;
                        iArr2 = iArr;
                        zArr2 = zArr;
                    }
                    i25++;
                    iArr4 = iArr5;
                } else {
                    iArr = iArr2;
                    zArr = zArr2;
                    mArr = new M[0];
                    break;
                }
            }
            mArr2[i21] = mArr;
            if (mArr.length != 0) {
                i22++;
            }
            i21++;
            iArr2 = iArr;
            zArr2 = zArr;
            i13 = 0;
        }
        int[][] iArr6 = iArr2;
        boolean[] zArr3 = zArr2;
        int size3 = list.size() + i22 + size2;
        m0[] m0VarArr = new m0[size3];
        a[] aVarArr = new a[size3];
        int i28 = 0;
        int i29 = 0;
        while (i28 < size2) {
            int[] iArr7 = iArr6[i28];
            ArrayList arrayList3 = new ArrayList();
            for (int i30 : iArr7) {
                arrayList3.addAll(((R3.a) list2.get(i30)).f6577c);
            }
            int size4 = arrayList3.size();
            M[] mArr3 = new M[size4];
            int i31 = 0;
            while (i31 < size4) {
                int i32 = size2;
                M m9 = ((R3.m) arrayList3.get(i31)).f6631a;
                M[][] mArr4 = mArr2;
                int h7 = interfaceC1638o.h(m9);
                L a5 = m9.a();
                a5.f19392D = h7;
                mArr3[i31] = new M(a5);
                i31++;
                size2 = i32;
                mArr2 = mArr4;
            }
            int i33 = size2;
            M[][] mArr5 = mArr2;
            R3.a aVar3 = (R3.a) list2.get(iArr7[0]);
            int i34 = aVar3.f6575a;
            if (i34 != -1) {
                j4 = Integer.toString(i34);
            } else {
                j4 = AbstractC0953k1.j(i28, "unset:");
            }
            int i35 = i29 + 1;
            if (zArr3[i28]) {
                i11 = i29 + 2;
            } else {
                i11 = i35;
                i35 = -1;
            }
            if (mArr5[i28].length != 0) {
                i12 = i11 + 1;
            } else {
                i12 = i11;
                i11 = -1;
            }
            List list8 = list2;
            m0VarArr[i29] = new m0(j4, mArr3);
            int i36 = i29;
            int i37 = i36;
            aVarArr[i37] = new a(aVar3.f6576b, 0, iArr7, i36, i35, i11, -1);
            int i38 = -1;
            if (i35 != -1) {
                String n9 = AbstractC0953k1.n(j4, ":emsg");
                L l11 = new L();
                l11.f19393a = n9;
                l11.f19402k = "application/x-emsg";
                M[] mArr6 = new M[z12];
                mArr6[0] = new M(l11);
                m0VarArr[i35] = new m0(n9, mArr6);
                a aVar4 = new a(5, 1, iArr7, i37, -1, -1, -1);
                i37 = i37;
                aVarArr[i35] = aVar4;
                i38 = -1;
            }
            if (i11 != i38) {
                m0VarArr[i11] = new m0(AbstractC0953k1.n(j4, ":cc"), mArr5[i28]);
                aVarArr[i11] = new a(3, 1, iArr7, i37, -1, -1, -1);
            }
            i28++;
            size2 = i33;
            list2 = list8;
            z12 = true;
            i29 = i12;
            mArr2 = mArr5;
        }
        int i39 = 0;
        while (i39 < list.size()) {
            R3.g gVar = (R3.g) list.get(i39);
            L l12 = new L();
            l12.f19393a = gVar.a();
            l12.f19402k = "application/x-emsg";
            m0VarArr[i29] = new m0(gVar.a() + ":" + i39, new M(l12));
            int i40 = i39;
            aVarArr[i29] = new a(5, 2, new int[0], -1, -1, -1, i40);
            i39 = i40 + 1;
            i29++;
        }
        Pair create = Pair.create(new n0(m0VarArr), aVarArr);
        this.j = (n0) create.first;
        this.f6332k = (a[]) create.second;
    }

    public static R3.f b(String str, List list) {
        for (int i9 = 0; i9 < list.size(); i9++) {
            R3.f fVar = (R3.f) list.get(i9);
            if (str.equals(fVar.f6608a)) {
                return fVar;
            }
        }
        return null;
    }

    public static M[] e(R3.f fVar, Pattern pattern, M m9) {
        String str = fVar.f6609b;
        if (str == null) {
            return new M[]{m9};
        }
        int i9 = y.f20553a;
        String[] split = str.split(";", -1);
        M[] mArr = new M[split.length];
        for (int i10 = 0; i10 < split.length; i10++) {
            Matcher matcher = pattern.matcher(split[i10]);
            if (!matcher.matches()) {
                return new M[]{m9};
            }
            int parseInt = Integer.parseInt(matcher.group(1));
            L a5 = m9.a();
            a5.f19393a = m9.f19425a + ":" + parseInt;
            a5.f19391C = parseInt;
            a5.f19395c = matcher.group(2);
            mArr[i10] = new M(a5);
        }
        return mArr;
    }

    @Override // N3.f0
    public final void B(long j) {
        this.f6341t.B(j);
    }

    @Override // N3.f0
    public final boolean a() {
        return this.f6341t.a();
    }

    @Override // N3.InterfaceC0272x
    public final long c(long j, x0 x0Var) {
        for (P3.g gVar : this.f6339r) {
            if (gVar.f5852a == 2) {
                return gVar.f5856e.c(j, x0Var);
            }
        }
        return j;
    }

    public final int d(int[] iArr, int i9) {
        int i10 = iArr[i9];
        if (i10 != -1) {
            a[] aVarArr = this.f6332k;
            int i11 = aVarArr[i10].f6318e;
            for (int i12 = 0; i12 < iArr.length; i12++) {
                int i13 = iArr[i12];
                if (i13 == i11 && aVarArr[i13].f6316c == 0) {
                    return i12;
                }
            }
        }
        return -1;
    }

    @Override // N3.f0
    public final long h() {
        return this.f6341t.h();
    }

    @Override // N3.InterfaceC0272x
    public final long k() {
        return -9223372036854775807L;
    }

    @Override // N3.InterfaceC0272x
    public final n0 l() {
        return this.j;
    }

    @Override // N3.InterfaceC0272x
    public final void o(InterfaceC0271w interfaceC0271w, long j) {
        this.f6338q = interfaceC0271w;
        interfaceC0271w.C(this);
    }

    @Override // N3.f0
    public final long p() {
        return this.f6341t.p();
    }

    @Override // N3.InterfaceC0272x
    public final void q() {
        this.f6330h.b();
    }

    @Override // N3.e0
    public final void v(f0 f0Var) {
        this.f6338q.v(this);
    }

    @Override // N3.InterfaceC0272x
    public final long w(long j) {
        long j4;
        for (P3.g gVar : this.f6339r) {
            gVar.C(j);
        }
        for (m mVar : this.f6340s) {
            int b9 = y.b(mVar.f6414c, j, true);
            mVar.f6418g = b9;
            if (mVar.f6415d && b9 == mVar.f6414c.length) {
                j4 = j;
            } else {
                j4 = -9223372036854775807L;
            }
            mVar.f6419h = j4;
        }
        return j;
    }

    @Override // N3.InterfaceC0272x
    public final void x(long j) {
        for (P3.g gVar : this.f6339r) {
            gVar.x(j);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v16 */
    /* JADX WARN: Type inference failed for: r1v27 */
    /* JADX WARN: Type inference failed for: r1v30 */
    /* JADX WARN: Type inference failed for: r1v32 */
    /* JADX WARN: Type inference failed for: r1v35 */
    /* JADX WARN: Type inference failed for: r1v39 */
    /* JADX WARN: Type inference failed for: r1v7 */
    /* JADX WARN: Type inference failed for: r2v9 */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v29 */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v4 */
    /* JADX WARN: Type inference failed for: r6v5, types: [int] */
    @Override // N3.InterfaceC0272x
    public final long y(i4.q[] qVarArr, boolean[] zArr, d0[] d0VarArr, boolean[] zArr2, long j) {
        int i9;
        boolean z9;
        int i10;
        boolean z10;
        ?? r62;
        m0 m0Var;
        boolean z11;
        m0 m0Var2;
        int i11;
        int i12;
        o oVar;
        boolean z12;
        int[] iArr = new int[qVarArr.length];
        int i13 = 0;
        while (true) {
            i9 = -1;
            if (i13 >= qVarArr.length) {
                break;
            }
            i4.q qVar = qVarArr[i13];
            if (qVar != null) {
                iArr[i13] = this.j.b(qVar.l());
            } else {
                iArr[i13] = -1;
            }
            i13++;
        }
        for (int i14 = 0; i14 < qVarArr.length; i14++) {
            if (qVarArr[i14] == null || !zArr[i14]) {
                ?? r1 = d0VarArr[i14];
                if (r1 instanceof P3.g) {
                    ((P3.g) r1).A(this);
                } else if (r1 instanceof P3.f) {
                    P3.f fVar = (P3.f) r1;
                    P3.g gVar = fVar.f5851e;
                    boolean[] zArr3 = gVar.f5855d;
                    int i15 = fVar.f5849c;
                    AbstractC1566a.m(zArr3[i15]);
                    gVar.f5855d[i15] = false;
                }
                d0VarArr[i14] = 0;
            }
        }
        int i16 = 0;
        while (true) {
            z9 = true;
            if (i16 >= qVarArr.length) {
                break;
            }
            ?? r12 = d0VarArr[i16];
            if ((r12 instanceof C0263n) || (r12 instanceof P3.f)) {
                int d9 = d(iArr, i16);
                if (d9 == -1) {
                    z12 = d0VarArr[i16] instanceof C0263n;
                } else {
                    ?? r42 = d0VarArr[i16];
                    if (!(r42 instanceof P3.f) || ((P3.f) r42).f5847a != d0VarArr[d9]) {
                        z9 = false;
                    }
                    z12 = z9;
                }
                if (!z12) {
                    ?? r13 = d0VarArr[i16];
                    if (r13 instanceof P3.f) {
                        P3.f fVar2 = (P3.f) r13;
                        P3.g gVar2 = fVar2.f5851e;
                        boolean[] zArr4 = gVar2.f5855d;
                        int i17 = fVar2.f5849c;
                        AbstractC1566a.m(zArr4[i17]);
                        gVar2.f5855d[i17] = false;
                    }
                    d0VarArr[i16] = 0;
                }
            }
            i16++;
        }
        int i18 = 0;
        while (i18 < qVarArr.length) {
            i4.q qVar2 = qVarArr[i18];
            if (qVar2 == null) {
                i10 = i18;
            } else {
                ?? r14 = d0VarArr[i18];
                if (r14 == 0) {
                    zArr2[i18] = z9;
                    a aVar = this.f6332k[iArr[i18]];
                    int i19 = aVar.f6316c;
                    if (i19 == 0) {
                        int i20 = aVar.f6319f;
                        if (i20 != i9) {
                            z10 = z9;
                        } else {
                            z10 = false;
                        }
                        if (z10) {
                            m0Var = this.j.a(i20);
                            r62 = z9;
                        } else {
                            r62 = 0;
                            m0Var = null;
                        }
                        int i21 = aVar.f6320g;
                        if (i21 != i9) {
                            z11 = z9;
                        } else {
                            z11 = false;
                        }
                        if (z11) {
                            m0Var2 = this.j.a(i21);
                            i11 = r62 + m0Var2.f5164a;
                        } else {
                            m0Var2 = null;
                            i11 = r62;
                        }
                        boolean z13 = z9;
                        M[] mArr = new M[i11];
                        int[] iArr2 = new int[i11];
                        if (z10) {
                            mArr[0] = m0Var.f5167d[0];
                            iArr2[0] = 5;
                            i12 = z13 ? 1 : 0;
                        } else {
                            i12 = 0;
                        }
                        ArrayList arrayList = new ArrayList();
                        if (z11) {
                            for (int i22 = 0; i22 < m0Var2.f5164a; i22++) {
                                M m9 = m0Var2.f5167d[i22];
                                mArr[i12] = m9;
                                iArr2[i12] = 3;
                                arrayList.add(m9);
                                i12 += z13 ? 1 : 0;
                            }
                        }
                        if (this.f6342u.f6588d && z10) {
                            p pVar = this.f6334m;
                            oVar = new o(pVar, pVar.f6427a);
                        } else {
                            oVar = null;
                        }
                        C1671f c1671f = this.f6324b;
                        N n7 = this.f6330h;
                        R3.c cVar = this.f6342u;
                        s sVar = this.f6328f;
                        int i23 = this.f6343v;
                        int[] iArr3 = aVar.f6314a;
                        int i24 = aVar.f6315b;
                        long j4 = this.f6329g;
                        i10 = i18;
                        W w7 = this.f6325c;
                        InterfaceC1513m c3 = ((InterfaceC1512l) c1671f.f21473b).c();
                        if (w7 != null) {
                            c3.a(w7);
                        }
                        o oVar2 = oVar;
                        P3.g gVar3 = new P3.g(aVar.f6315b, iArr2, mArr, new l(n7, cVar, sVar, i23, iArr3, qVar2, i24, c3, j4, z10, arrayList, oVar), this, this.f6331i, j, this.f6326d, this.f6337p, this.f6327e, this.f6336o);
                        synchronized (this) {
                            this.f6335n.put(gVar3, oVar2);
                        }
                        d0VarArr[i10] = gVar3;
                    } else {
                        i10 = i18;
                        if (i19 == 2) {
                            d0VarArr[i10] = new m((R3.g) this.f6344w.get(aVar.f6317d), qVar2.l().f5167d[0], this.f6342u.f6588d);
                        }
                    }
                } else {
                    i10 = i18;
                    if (r14 instanceof P3.g) {
                        ((l) ((P3.g) r14).f5856e).f6408i = qVar2;
                    }
                }
            }
            i18 = i10 + 1;
            i9 = -1;
            z9 = true;
        }
        for (int i25 = 0; i25 < qVarArr.length; i25++) {
            if (d0VarArr[i25] == 0 && qVarArr[i25] != null) {
                a aVar2 = this.f6332k[iArr[i25]];
                if (aVar2.f6316c == 1) {
                    int d10 = d(iArr, i25);
                    if (d10 == -1) {
                        d0VarArr[i25] = new Object();
                    } else {
                        P3.g gVar4 = (P3.g) d0VarArr[d10];
                        int i26 = aVar2.f6315b;
                        int i27 = 0;
                        while (true) {
                            c0[] c0VarArr = gVar4.f5864n;
                            if (i27 < c0VarArr.length) {
                                if (gVar4.f5853b[i27] == i26) {
                                    boolean[] zArr5 = gVar4.f5855d;
                                    AbstractC1566a.m(!zArr5[i27]);
                                    zArr5[i27] = true;
                                    c0VarArr[i27].E(j, true);
                                    d0VarArr[i25] = new P3.f(gVar4, gVar4, c0VarArr[i27], i27);
                                    break;
                                }
                                i27++;
                            } else {
                                throw new IllegalStateException();
                            }
                        }
                    }
                }
            }
        }
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        for (?? r43 : d0VarArr) {
            if (r43 instanceof P3.g) {
                arrayList2.add((P3.g) r43);
            } else if (r43 instanceof m) {
                arrayList3.add((m) r43);
            }
        }
        P3.g[] gVarArr = new P3.g[arrayList2.size()];
        this.f6339r = gVarArr;
        arrayList2.toArray(gVarArr);
        m[] mVarArr = new m[arrayList3.size()];
        this.f6340s = mVarArr;
        arrayList3.toArray(mVarArr);
        F5.e eVar = this.f6333l;
        P3.g[] gVarArr2 = this.f6339r;
        eVar.getClass();
        this.f6341t = new C0701c(11, gVarArr2);
        return j;
    }

    @Override // N3.f0
    public final boolean z(long j) {
        return this.f6341t.z(j);
    }
}
