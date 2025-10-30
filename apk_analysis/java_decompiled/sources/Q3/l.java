package Q3;

import F0.C0104h;
import N3.C0251b;
import P5.F;
import android.os.SystemClock;
import com.google.firebase.messaging.s;
import i4.q;
import j3.M;
import j3.x0;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import k4.C1498D;
import k4.G;
import k4.InterfaceC1513m;
import k4.N;
import l4.y;
import q3.C1901f;
import q3.InterfaceC1905j;
import q3.r;
import y3.C2213i;

/* loaded from: classes.dex */
public final class l implements P3.h {

    /* renamed from: a, reason: collision with root package name */
    public final N f6400a;

    /* renamed from: b, reason: collision with root package name */
    public final s f6401b;

    /* renamed from: c, reason: collision with root package name */
    public final int[] f6402c;

    /* renamed from: d, reason: collision with root package name */
    public final int f6403d;

    /* renamed from: e, reason: collision with root package name */
    public final InterfaceC1513m f6404e;

    /* renamed from: f, reason: collision with root package name */
    public final long f6405f;

    /* renamed from: g, reason: collision with root package name */
    public final o f6406g;

    /* renamed from: h, reason: collision with root package name */
    public final j[] f6407h;

    /* renamed from: i, reason: collision with root package name */
    public q f6408i;
    public R3.c j;

    /* renamed from: k, reason: collision with root package name */
    public int f6409k;

    /* renamed from: l, reason: collision with root package name */
    public C0251b f6410l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f6411m;

    public l(N n7, R3.c cVar, s sVar, int i9, int[] iArr, q qVar, int i10, InterfaceC1513m interfaceC1513m, long j, boolean z9, ArrayList arrayList, o oVar) {
        int i11;
        InterfaceC1905j c2213i;
        M m9;
        j[] jVarArr;
        P3.d dVar;
        this.f6400a = n7;
        this.j = cVar;
        this.f6401b = sVar;
        this.f6402c = iArr;
        this.f6408i = qVar;
        this.f6403d = i10;
        this.f6404e = interfaceC1513m;
        this.f6409k = i9;
        this.f6405f = j;
        o oVar2 = oVar;
        this.f6406g = oVar2;
        long d9 = cVar.d(i9);
        ArrayList i12 = i();
        this.f6407h = new j[qVar.length()];
        int i13 = 0;
        int i14 = 0;
        while (i14 < this.f6407h.length) {
            R3.m mVar = (R3.m) i12.get(qVar.e(i14));
            R3.b t7 = sVar.t(mVar.f6632b);
            j[] jVarArr2 = this.f6407h;
            R3.b bVar = t7 == null ? (R3.b) mVar.f6632b.get(i13) : t7;
            M m10 = mVar.f6631a;
            String str = m10.f19434k;
            if (l4.n.k(str)) {
                dVar = null;
                jVarArr = jVarArr2;
            } else {
                if (str != null && (str.startsWith("video/webm") || str.startsWith("audio/webm") || str.startsWith("application/webm") || str.startsWith("video/x-matroska") || str.startsWith("audio/x-matroska") || str.startsWith("application/x-matroska"))) {
                    m9 = m10;
                    jVarArr = jVarArr2;
                    c2213i = new w3.d(1);
                } else {
                    if (z9) {
                        i11 = 4;
                    } else {
                        i11 = i13;
                    }
                    m9 = m10;
                    jVarArr = jVarArr2;
                    c2213i = new C2213i(i11, null, null, arrayList, oVar2);
                }
                dVar = new P3.d(c2213i, i10, m9);
            }
            long j4 = d9;
            jVarArr[i14] = new j(j4, mVar, bVar, dVar, 0L, mVar.b());
            i14++;
            oVar2 = oVar;
            d9 = j4;
            i13 = 0;
        }
    }

    @Override // P3.h
    public final void a() {
        for (j jVar : this.f6407h) {
            P3.d dVar = (P3.d) jVar.f6394d;
            if (dVar != null) {
                dVar.f5829a.a();
            }
        }
    }

    @Override // P3.h
    public final void b() {
        C0251b c0251b = this.f6410l;
        if (c0251b == null) {
            this.f6400a.b();
            return;
        }
        throw c0251b;
    }

    @Override // P3.h
    public final long c(long j, x0 x0Var) {
        long j4;
        long j9;
        long j10 = j;
        j[] jVarArr = this.f6407h;
        int length = jVarArr.length;
        int i9 = 0;
        while (i9 < length) {
            j jVar = jVarArr[i9];
            i iVar = (i) jVar.f6397g;
            if (iVar != null) {
                long j11 = jVar.f6392b;
                long d9 = iVar.d(j10, j11);
                long j12 = jVar.f6393c;
                long j13 = d9 + j12;
                long d10 = jVar.d(j13);
                i iVar2 = (i) jVar.f6397g;
                long z9 = iVar2.z(j11);
                if (d10 < j10 && (z9 == -1 || j13 < ((iVar2.v() + j12) + z9) - 1)) {
                    j9 = jVar.d(j13 + 1);
                    j4 = d10;
                } else {
                    j4 = d10;
                    j9 = j4;
                }
                return x0Var.a(j10, j4, j9);
            }
            i9++;
            j10 = j;
        }
        return j;
    }

    @Override // P3.h
    public final boolean d(long j, P3.e eVar, List list) {
        if (this.f6410l != null) {
            return false;
        }
        return this.f6408i.n(j, eVar, list);
    }

    @Override // P3.h
    public final void e(P3.e eVar) {
        C1901f c1901f;
        if (eVar instanceof P3.j) {
            int k5 = this.f6408i.k(((P3.j) eVar).f5841d);
            j[] jVarArr = this.f6407h;
            j jVar = jVarArr[k5];
            if (((i) jVar.f6397g) == null) {
                P3.d dVar = (P3.d) jVar.f6394d;
                r rVar = dVar.f5836h;
                if (rVar instanceof C1901f) {
                    c1901f = (C1901f) rVar;
                } else {
                    c1901f = null;
                }
                if (c1901f != null) {
                    R3.m mVar = (R3.m) jVar.f6395e;
                    C0104h c0104h = new C0104h(1, mVar.f6633c, c1901f);
                    jVarArr[k5] = new j(jVar.f6392b, mVar, (R3.b) jVar.f6396f, dVar, jVar.f6393c, c0104h);
                }
            }
        }
        o oVar = this.f6406g;
        if (oVar != null) {
            long j = oVar.f6425d;
            if (j == -9223372036854775807L || eVar.f5845h > j) {
                oVar.f6425d = eVar.f5845h;
            }
            oVar.f6426e.f6433g = true;
        }
    }

    @Override // P3.h
    public final int f(long j, List list) {
        if (this.f6410l == null && this.f6408i.length() >= 2) {
            return this.f6408i.f(j, list);
        }
        return list.size();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0098 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Type inference failed for: r1v25, types: [java.io.IOException, N3.b] */
    @Override // P3.h
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void g(long r55, long r57, java.util.List r59, A6.i r60) {
        /*
            Method dump skipped, instructions count: 859
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Q3.l.g(long, long, java.util.List, A6.i):void");
    }

    @Override // P3.h
    public final boolean h(P3.e eVar, boolean z9, A1.i iVar, e1.q qVar) {
        long j;
        boolean z10;
        if (z9) {
            o oVar = this.f6406g;
            if (oVar != null) {
                long j4 = oVar.f6425d;
                if (j4 != -9223372036854775807L && j4 < eVar.f5844g) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                p pVar = oVar.f6426e;
                if (pVar.f6432f.f6588d) {
                    if (!pVar.f6434h) {
                        if (z10) {
                            if (pVar.f6433g) {
                                pVar.f6434h = true;
                                pVar.f6433g = false;
                                h hVar = pVar.f6428b.f6357a;
                                hVar.f6362D.removeCallbacks(hVar.f6387w);
                                hVar.y();
                                return true;
                            }
                        }
                    }
                    return true;
                }
            }
            boolean z11 = this.j.f6588d;
            j[] jVarArr = this.f6407h;
            if (!z11 && (eVar instanceof P3.k)) {
                IOException iOException = (IOException) iVar.f25b;
                if ((iOException instanceof C1498D) && ((C1498D) iOException).f19982d == 404) {
                    j jVar = jVarArr[this.f6408i.k(eVar.f5841d)];
                    long z12 = ((i) jVar.f6397g).z(jVar.f6392b);
                    if (z12 != -1 && z12 != 0) {
                        if (((P3.k) eVar).b() > ((((i) jVar.f6397g).v() + jVar.f6393c) + z12) - 1) {
                            this.f6411m = true;
                            return true;
                        }
                    }
                }
            }
            j jVar2 = jVarArr[this.f6408i.k(eVar.f5841d)];
            F f9 = ((R3.m) jVar2.f6395e).f6632b;
            s sVar = this.f6401b;
            R3.b t7 = sVar.t(f9);
            R3.b bVar = (R3.b) jVar2.f6396f;
            if (t7 == null || bVar.equals(t7)) {
                q qVar2 = this.f6408i;
                F f10 = ((R3.m) jVar2.f6395e).f6632b;
                long elapsedRealtime = SystemClock.elapsedRealtime();
                int length = qVar2.length();
                int i9 = 0;
                for (int i10 = 0; i10 < length; i10++) {
                    if (qVar2.h(elapsedRealtime, i10)) {
                        i9++;
                    }
                }
                HashSet hashSet = new HashSet();
                for (int i11 = 0; i11 < f10.size(); i11++) {
                    hashSet.add(Integer.valueOf(((R3.b) f10.get(i11)).f6583c));
                }
                int size = hashSet.size();
                HashSet hashSet2 = new HashSet();
                ArrayList b9 = sVar.b(f10);
                for (int i12 = 0; i12 < b9.size(); i12++) {
                    hashSet2.add(Integer.valueOf(((R3.b) b9.get(i12)).f6583c));
                }
                G g9 = new G(size, size - hashSet2.size(), length, i9);
                if (g9.a(2) || g9.a(1)) {
                    qVar.getClass();
                    B3.f e8 = e1.q.e(g9, iVar);
                    if (e8 != null) {
                        int i13 = e8.f674a;
                        if (g9.a(i13)) {
                            long j9 = e8.f675b;
                            if (i13 == 2) {
                                q qVar3 = this.f6408i;
                                return qVar3.g(j9, qVar3.k(eVar.f5841d));
                            }
                            if (i13 == 1) {
                                long elapsedRealtime2 = SystemClock.elapsedRealtime() + j9;
                                String str = bVar.f6582b;
                                HashMap hashMap = (HashMap) sVar.f16504b;
                                if (hashMap.containsKey(str)) {
                                    Long l9 = (Long) hashMap.get(str);
                                    int i14 = y.f20553a;
                                    j = Math.max(elapsedRealtime2, l9.longValue());
                                } else {
                                    j = elapsedRealtime2;
                                }
                                hashMap.put(str, Long.valueOf(j));
                                int i15 = bVar.f6583c;
                                if (i15 != Integer.MIN_VALUE) {
                                    Integer valueOf = Integer.valueOf(i15);
                                    HashMap hashMap2 = (HashMap) sVar.f16505c;
                                    if (hashMap2.containsKey(valueOf)) {
                                        Long l10 = (Long) hashMap2.get(valueOf);
                                        int i16 = y.f20553a;
                                        elapsedRealtime2 = Math.max(elapsedRealtime2, l10.longValue());
                                    }
                                    hashMap2.put(valueOf, Long.valueOf(elapsedRealtime2));
                                }
                            }
                        }
                    }
                }
            }
            return true;
        }
        return false;
    }

    public final ArrayList i() {
        List list = this.j.b(this.f6409k).f6617c;
        ArrayList arrayList = new ArrayList();
        for (int i9 : this.f6402c) {
            arrayList.addAll(((R3.a) list.get(i9)).f6577c);
        }
        return arrayList;
    }

    public final j j(int i9) {
        j[] jVarArr = this.f6407h;
        j jVar = jVarArr[i9];
        R3.b t7 = this.f6401b.t(((R3.m) jVar.f6395e).f6632b);
        if (t7 != null && !t7.equals((R3.b) jVar.f6396f)) {
            j jVar2 = new j(jVar.f6392b, (R3.m) jVar.f6395e, t7, (P3.d) jVar.f6394d, jVar.f6393c, (i) jVar.f6397g);
            jVarArr[i9] = jVar2;
            return jVar2;
        }
        return jVar;
    }
}
