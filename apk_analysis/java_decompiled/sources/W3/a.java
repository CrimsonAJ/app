package W3;

import A6.i;
import B3.f;
import N3.C0251b;
import P3.d;
import P3.e;
import P3.h;
import P3.k;
import P3.l;
import a.AbstractC0485a;
import android.net.Uri;
import i4.q;
import j3.M;
import j3.x0;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import k4.C1516p;
import k4.G;
import k4.InterfaceC1513m;
import k4.N;
import l4.AbstractC1566a;
import l4.y;
import y3.C2213i;
import y3.o;
import y3.p;

/* loaded from: classes.dex */
public final class a implements h {

    /* renamed from: a, reason: collision with root package name */
    public final N f7886a;

    /* renamed from: b, reason: collision with root package name */
    public final int f7887b;

    /* renamed from: c, reason: collision with root package name */
    public final d[] f7888c;

    /* renamed from: d, reason: collision with root package name */
    public final InterfaceC1513m f7889d;

    /* renamed from: e, reason: collision with root package name */
    public q f7890e;

    /* renamed from: f, reason: collision with root package name */
    public X3.c f7891f;

    /* renamed from: g, reason: collision with root package name */
    public int f7892g;

    /* renamed from: h, reason: collision with root package name */
    public C0251b f7893h;

    public a(N n7, X3.c cVar, int i9, q qVar, InterfaceC1513m interfaceC1513m) {
        p[] pVarArr;
        int i10;
        this.f7886a = n7;
        this.f7891f = cVar;
        this.f7887b = i9;
        this.f7890e = qVar;
        this.f7889d = interfaceC1513m;
        X3.b bVar = cVar.f8436f[i9];
        this.f7888c = new d[qVar.length()];
        for (int i11 = 0; i11 < this.f7888c.length; i11++) {
            int e8 = qVar.e(i11);
            M m9 = bVar.j[e8];
            if (m9.f19438o != null) {
                X3.a aVar = cVar.f8435e;
                aVar.getClass();
                pVarArr = aVar.f8415c;
            } else {
                pVarArr = null;
            }
            p[] pVarArr2 = pVarArr;
            int i12 = bVar.f8416a;
            if (i12 == 2) {
                i10 = 4;
            } else {
                i10 = 0;
            }
            this.f7888c[i11] = new d(new C2213i(3, null, new o(e8, i12, bVar.f8418c, -9223372036854775807L, cVar.f8437g, m9, 0, pVarArr2, i10, null, null), Collections.EMPTY_LIST, null), bVar.f8416a, m9);
        }
    }

    @Override // P3.h
    public final void a() {
        for (d dVar : this.f7888c) {
            dVar.f5829a.a();
        }
    }

    @Override // P3.h
    public final void b() {
        C0251b c0251b = this.f7893h;
        if (c0251b == null) {
            this.f7886a.b();
            return;
        }
        throw c0251b;
    }

    @Override // P3.h
    public final long c(long j, x0 x0Var) {
        long j4;
        X3.b bVar = this.f7891f.f8436f[this.f7887b];
        int e8 = y.e(bVar.f8429o, j, true);
        long[] jArr = bVar.f8429o;
        long j9 = jArr[e8];
        if (j9 < j && e8 < bVar.f8425k - 1) {
            j4 = jArr[e8 + 1];
        } else {
            j4 = j9;
        }
        return x0Var.a(j, j9, j4);
    }

    @Override // P3.h
    public final boolean d(long j, e eVar, List list) {
        if (this.f7893h != null) {
            return false;
        }
        return this.f7890e.n(j, eVar, list);
    }

    @Override // P3.h
    public final int f(long j, List list) {
        if (this.f7893h == null && this.f7890e.length() >= 2) {
            return this.f7890e.f(j, list);
        }
        return list.size();
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.io.IOException, N3.b] */
    @Override // P3.h
    public final void g(long j, long j4, List list, i iVar) {
        List list2;
        int b9;
        long b10;
        long j9;
        boolean z9;
        boolean z10;
        boolean z11;
        if (this.f7893h != null) {
            return;
        }
        X3.b[] bVarArr = this.f7891f.f8436f;
        int i9 = this.f7887b;
        X3.b bVar = bVarArr[i9];
        if (bVar.f8425k == 0) {
            iVar.f508a = !r4.f8434d;
            return;
        }
        boolean isEmpty = list.isEmpty();
        long[] jArr = bVar.f8429o;
        if (isEmpty) {
            b9 = y.e(jArr, j4, true);
            list2 = list;
        } else {
            list2 = list;
            b9 = (int) (((k) list2.get(list.size() - 1)).b() - this.f7892g);
            if (b9 < 0) {
                this.f7893h = new IOException();
                return;
            }
        }
        if (b9 >= bVar.f8425k) {
            iVar.f508a = !this.f7891f.f8434d;
            return;
        }
        long j10 = j4 - j;
        X3.c cVar = this.f7891f;
        if (!cVar.f8434d) {
            b10 = -9223372036854775807L;
        } else {
            X3.b bVar2 = cVar.f8436f[i9];
            int i10 = bVar2.f8425k - 1;
            b10 = (bVar2.b(i10) + bVar2.f8429o[i10]) - j;
        }
        int length = this.f7890e.length();
        l[] lVarArr = new l[length];
        for (int i11 = 0; i11 < length; i11++) {
            this.f7890e.e(i11);
            lVarArr[i11] = new Q3.k(bVar, b9);
        }
        this.f7890e.a(j, j10, b10, list2, lVarArr);
        long j11 = jArr[b9];
        long b11 = bVar.b(b9) + j11;
        if (list.isEmpty()) {
            j9 = j4;
        } else {
            j9 = -9223372036854775807L;
        }
        int i12 = this.f7892g + b9;
        int p9 = this.f7890e.p();
        d dVar = this.f7888c[p9];
        int e8 = this.f7890e.e(p9);
        M[] mArr = bVar.j;
        if (mArr != null) {
            z9 = true;
        } else {
            z9 = false;
        }
        AbstractC1566a.m(z9);
        ArrayList arrayList = bVar.f8428n;
        if (arrayList != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        AbstractC1566a.m(z10);
        if (b9 < arrayList.size()) {
            z11 = true;
        } else {
            z11 = false;
        }
        AbstractC1566a.m(z11);
        String num = Integer.toString(mArr[e8].f19432h);
        String l9 = ((Long) arrayList.get(b9)).toString();
        Uri M7 = AbstractC1566a.M(bVar.f8426l, bVar.f8427m.replace("{bitrate}", num).replace("{Bitrate}", num).replace("{start time}", l9).replace("{start_time}", l9));
        iVar.f509b = new P3.i(this.f7889d, new C1516p(M7), this.f7890e.m(), this.f7890e.o(), this.f7890e.r(), j11, b11, j9, -9223372036854775807L, i12, 1, j11, dVar);
    }

    @Override // P3.h
    public final boolean h(e eVar, boolean z9, A1.i iVar, e1.q qVar) {
        G i9 = AbstractC0485a.i(this.f7890e);
        qVar.getClass();
        f e8 = e1.q.e(i9, iVar);
        if (z9 && e8 != null && e8.f674a == 2) {
            q qVar2 = this.f7890e;
            if (qVar2.g(e8.f675b, qVar2.k(eVar.f5841d))) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override // P3.h
    public final void e(e eVar) {
    }
}
