package S3;

import N3.C0251b;
import N3.m0;
import P5.D;
import P5.F;
import P5.S;
import android.net.Uri;
import android.util.Pair;
import b7.C0701c;
import j3.M;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import k4.C1516p;
import k4.InterfaceC1512l;
import k4.InterfaceC1513m;
import k4.W;
import l4.AbstractC1566a;
import l4.y;
import o1.C1671f;

/* loaded from: classes.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public final c f6768a;

    /* renamed from: b, reason: collision with root package name */
    public final InterfaceC1513m f6769b;

    /* renamed from: c, reason: collision with root package name */
    public final InterfaceC1513m f6770c;

    /* renamed from: d, reason: collision with root package name */
    public final C0701c f6771d;

    /* renamed from: e, reason: collision with root package name */
    public final Uri[] f6772e;

    /* renamed from: f, reason: collision with root package name */
    public final M[] f6773f;

    /* renamed from: g, reason: collision with root package name */
    public final T3.c f6774g;

    /* renamed from: h, reason: collision with root package name */
    public final m0 f6775h;

    /* renamed from: i, reason: collision with root package name */
    public final List f6776i;

    /* renamed from: k, reason: collision with root package name */
    public final k3.l f6777k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f6778l;

    /* renamed from: n, reason: collision with root package name */
    public C0251b f6780n;

    /* renamed from: o, reason: collision with root package name */
    public Uri f6781o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f6782p;

    /* renamed from: q, reason: collision with root package name */
    public i4.q f6783q;

    /* renamed from: s, reason: collision with root package name */
    public boolean f6785s;
    public final C1671f j = new C1671f(20);

    /* renamed from: m, reason: collision with root package name */
    public byte[] f6779m = y.f20558f;

    /* renamed from: r, reason: collision with root package name */
    public long f6784r = -9223372036854775807L;

    /* JADX WARN: Type inference failed for: r3v1, types: [i4.c, i4.q, S3.g] */
    public i(c cVar, T3.c cVar2, Uri[] uriArr, M[] mArr, C0701c c0701c, W w7, C0701c c0701c2, List list, k3.l lVar) {
        this.f6768a = cVar;
        this.f6774g = cVar2;
        this.f6772e = uriArr;
        this.f6773f = mArr;
        this.f6771d = c0701c2;
        this.f6776i = list;
        this.f6777k = lVar;
        InterfaceC1513m c3 = ((InterfaceC1512l) c0701c.f11404b).c();
        this.f6769b = c3;
        if (w7 != null) {
            c3.a(w7);
        }
        this.f6770c = ((InterfaceC1512l) c0701c.f11404b).c();
        this.f6775h = new m0("", mArr);
        ArrayList arrayList = new ArrayList();
        for (int i9 = 0; i9 < uriArr.length; i9++) {
            if ((mArr[i9].f19429e & 16384) == 0) {
                arrayList.add(Integer.valueOf(i9));
            }
        }
        m0 m0Var = this.f6775h;
        int[] U8 = v4.e.U(arrayList);
        ?? cVar3 = new i4.c(m0Var, U8);
        cVar3.f6763g = cVar3.k(m0Var.f5167d[U8[0]]);
        this.f6783q = cVar3;
    }

    public final P3.l[] a(k kVar, long j) {
        int a5;
        boolean z9;
        int i9;
        List list;
        i iVar = this;
        k kVar2 = kVar;
        if (kVar2 == null) {
            a5 = -1;
        } else {
            a5 = iVar.f6775h.a(kVar2.f5841d);
        }
        int length = iVar.f6783q.length();
        P3.l[] lVarArr = new P3.l[length];
        boolean z10 = false;
        int i10 = 0;
        while (i10 < length) {
            int e8 = iVar.f6783q.e(i10);
            Uri uri = iVar.f6772e[e8];
            T3.c cVar = iVar.f6774g;
            if (!cVar.c(uri)) {
                lVarArr[i10] = P3.l.f5883F;
                i9 = i10;
            } else {
                T3.j a9 = cVar.a(uri, z10);
                a9.getClass();
                long j4 = a9.f7118h - cVar.f7091n;
                if (e8 != a5) {
                    z9 = true;
                } else {
                    z9 = z10;
                }
                Pair c3 = iVar.c(kVar2, z9, a9, j4, j);
                long longValue = ((Long) c3.first).longValue();
                int intValue = ((Integer) c3.second).intValue();
                i9 = i10;
                int i11 = (int) (longValue - a9.f7120k);
                if (i11 >= 0) {
                    F f9 = a9.f7127r;
                    if (f9.size() >= i11) {
                        ArrayList arrayList = new ArrayList();
                        if (i11 < f9.size()) {
                            if (intValue != -1) {
                                T3.g gVar = (T3.g) f9.get(i11);
                                if (intValue == 0) {
                                    arrayList.add(gVar);
                                } else if (intValue < gVar.f7098m.size()) {
                                    F f10 = gVar.f7098m;
                                    arrayList.addAll(f10.subList(intValue, f10.size()));
                                }
                                i11++;
                            }
                            arrayList.addAll(f9.subList(i11, f9.size()));
                            intValue = 0;
                        }
                        if (a9.f7123n != -9223372036854775807L) {
                            if (intValue == -1) {
                                intValue = 0;
                            }
                            F f11 = a9.f7128s;
                            if (intValue < f11.size()) {
                                arrayList.addAll(f11.subList(intValue, f11.size()));
                            }
                        }
                        list = Collections.unmodifiableList(arrayList);
                        lVarArr[i9] = new f(j4, list);
                    }
                }
                D d9 = F.f5901b;
                list = S.f5926e;
                lVarArr[i9] = new f(j4, list);
            }
            i10 = i9 + 1;
            iVar = this;
            kVar2 = kVar;
            z10 = false;
        }
        return lVarArr;
    }

    public final int b(k kVar) {
        F f9;
        if (kVar.f6802o != -1) {
            T3.j a5 = this.f6774g.a(this.f6772e[this.f6775h.a(kVar.f5841d)], false);
            a5.getClass();
            int i9 = (int) (kVar.j - a5.f7120k);
            if (i9 >= 0) {
                F f10 = a5.f7127r;
                if (i9 < f10.size()) {
                    f9 = ((T3.g) f10.get(i9)).f7098m;
                } else {
                    f9 = a5.f7128s;
                }
                int size = f9.size();
                int i10 = kVar.f6802o;
                if (i10 < size) {
                    T3.e eVar = (T3.e) f9.get(i10);
                    if (eVar.f7093m) {
                        return 0;
                    }
                    if (y.a(Uri.parse(AbstractC1566a.L(a5.f7151a, eVar.f7099a)), kVar.f5839b.f20077a)) {
                        return 1;
                    }
                    return 2;
                }
                return 2;
            }
            return 1;
        }
        return 1;
    }

    public final Pair c(k kVar, boolean z9, T3.j jVar, long j, long j4) {
        F f9;
        long j9;
        boolean z10 = true;
        int i9 = -1;
        if (kVar != null && !z9) {
            boolean z11 = kVar.f6794f0;
            long j10 = kVar.j;
            int i10 = kVar.f6802o;
            if (z11) {
                if (i10 == -1) {
                    j10 = kVar.b();
                }
                Long valueOf = Long.valueOf(j10);
                if (i10 != -1) {
                    i9 = i10 + 1;
                }
                return new Pair(valueOf, Integer.valueOf(i9));
            }
            return new Pair(Long.valueOf(j10), Integer.valueOf(i10));
        }
        long j11 = jVar.f7130u + j;
        if (kVar != null && !this.f6782p) {
            j4 = kVar.f5844g;
        }
        boolean z12 = jVar.f7124o;
        long j12 = jVar.f7120k;
        F f10 = jVar.f7127r;
        if (!z12 && j4 >= j11) {
            return new Pair(Long.valueOf(j12 + f10.size()), -1);
        }
        long j13 = j4 - j;
        Long valueOf2 = Long.valueOf(j13);
        int i11 = 0;
        if (this.f6774g.f7090m && kVar != null) {
            z10 = false;
        }
        int c3 = y.c(f10, valueOf2, z10);
        long j14 = c3 + j12;
        if (c3 >= 0) {
            T3.g gVar = (T3.g) f10.get(c3);
            long j15 = gVar.f7103e + gVar.f7101c;
            F f11 = jVar.f7128s;
            if (j13 < j15) {
                f9 = gVar.f7098m;
            } else {
                f9 = f11;
            }
            while (true) {
                if (i11 >= f9.size()) {
                    break;
                }
                T3.e eVar = (T3.e) f9.get(i11);
                if (j13 < eVar.f7103e + eVar.f7101c) {
                    if (eVar.f7092l) {
                        if (f9 == f11) {
                            j9 = 1;
                        } else {
                            j9 = 0;
                        }
                        j14 += j9;
                        i9 = i11;
                    }
                } else {
                    i11++;
                }
            }
        }
        return new Pair(Long.valueOf(j14), Integer.valueOf(i9));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v1, types: [S3.e, P3.e] */
    public final e d(Uri uri, int i9) {
        if (uri == null) {
            return null;
        }
        C1671f c1671f = this.j;
        byte[] bArr = (byte[]) ((d) c1671f.f21473b).remove(uri);
        if (bArr != null) {
            return null;
        }
        C1516p c1516p = new C1516p(uri, 1, null, Collections.EMPTY_MAP, 0L, -1L, null, 1);
        M m9 = this.f6773f[i9];
        int o9 = this.f6783q.o();
        Object r5 = this.f6783q.r();
        byte[] bArr2 = this.f6779m;
        ?? eVar = new P3.e(this.f6770c, c1516p, 3, m9, o9, r5, -9223372036854775807L, -9223372036854775807L);
        if (bArr2 == null) {
            bArr2 = y.f20558f;
        }
        eVar.j = bArr2;
        return eVar;
    }
}
