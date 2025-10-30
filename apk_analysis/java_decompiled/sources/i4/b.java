package i4;

import N3.m0;
import P5.AbstractC0349q;
import P5.C;
import P5.F;
import android.os.SystemClock;
import j3.M;
import java.util.ArrayList;
import java.util.List;
import k4.C1518s;
import k4.InterfaceC1506f;
import l4.AbstractC1566a;
import l4.y;

/* loaded from: classes.dex */
public final class b extends c {

    /* renamed from: g, reason: collision with root package name */
    public final InterfaceC1506f f18490g;

    /* renamed from: h, reason: collision with root package name */
    public final long f18491h;

    /* renamed from: i, reason: collision with root package name */
    public final long f18492i;
    public final long j;

    /* renamed from: k, reason: collision with root package name */
    public final int f18493k;

    /* renamed from: l, reason: collision with root package name */
    public final int f18494l;

    /* renamed from: m, reason: collision with root package name */
    public final float f18495m;

    /* renamed from: n, reason: collision with root package name */
    public final float f18496n;

    /* renamed from: o, reason: collision with root package name */
    public final F f18497o;

    /* renamed from: p, reason: collision with root package name */
    public final l4.u f18498p;

    /* renamed from: q, reason: collision with root package name */
    public float f18499q;

    /* renamed from: r, reason: collision with root package name */
    public int f18500r;

    /* renamed from: s, reason: collision with root package name */
    public int f18501s;

    /* renamed from: t, reason: collision with root package name */
    public long f18502t;

    /* renamed from: u, reason: collision with root package name */
    public P3.k f18503u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(m0 m0Var, int[] iArr, InterfaceC1506f interfaceC1506f, long j, long j4, long j9, F f9) {
        super(m0Var, iArr);
        l4.u uVar = l4.u.f20545a;
        if (j9 < j) {
            AbstractC1566a.P("AdaptiveTrackSelection", "Adjusting minDurationToRetainAfterDiscardMs to be at least minDurationForQualityIncreaseMs");
            j9 = j;
        }
        this.f18490g = interfaceC1506f;
        this.f18491h = j * 1000;
        this.f18492i = j4 * 1000;
        this.j = j9 * 1000;
        this.f18493k = 1279;
        this.f18494l = 719;
        this.f18495m = 0.7f;
        this.f18496n = 0.75f;
        this.f18497o = F.o(f9);
        this.f18498p = uVar;
        this.f18499q = 1.0f;
        this.f18501s = 0;
        this.f18502t = -9223372036854775807L;
    }

    public static void v(ArrayList arrayList, long[] jArr) {
        long j = 0;
        for (long j4 : jArr) {
            j += j4;
        }
        for (int i9 = 0; i9 < arrayList.size(); i9++) {
            C c3 = (C) arrayList.get(i9);
            if (c3 != null) {
                c3.a(new a(j, jArr[i9]));
            }
        }
    }

    public static long x(List list) {
        if (!list.isEmpty()) {
            P3.k kVar = (P3.k) AbstractC0349q.i(list);
            long j = kVar.f5844g;
            if (j != -9223372036854775807L) {
                long j4 = kVar.f5845h;
                if (j4 != -9223372036854775807L) {
                    return j4 - j;
                }
            }
        }
        return -9223372036854775807L;
    }

    @Override // i4.q
    public final void a(long j, long j4, long j9, List list, P3.l[] lVarArr) {
        long x5;
        int k5;
        long j10;
        this.f18498p.getClass();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        int i9 = this.f18500r;
        if (i9 < lVarArr.length && lVarArr[i9].next()) {
            P3.l lVar = lVarArr[this.f18500r];
            x5 = lVar.c() - lVar.h();
        } else {
            int length = lVarArr.length;
            int i10 = 0;
            while (true) {
                if (i10 < length) {
                    P3.l lVar2 = lVarArr[i10];
                    if (lVar2.next()) {
                        x5 = lVar2.c() - lVar2.h();
                        break;
                    }
                    i10++;
                } else {
                    x5 = x(list);
                    break;
                }
            }
        }
        int i11 = this.f18501s;
        if (i11 == 0) {
            this.f18501s = 1;
            this.f18500r = w(elapsedRealtime);
            return;
        }
        int i12 = this.f18500r;
        if (list.isEmpty()) {
            k5 = -1;
        } else {
            k5 = k(((P3.k) AbstractC0349q.i(list)).f5841d);
        }
        if (k5 != -1) {
            i11 = ((P3.k) AbstractC0349q.i(list)).f5842e;
            i12 = k5;
        }
        int w7 = w(elapsedRealtime);
        if (!h(elapsedRealtime, i12)) {
            M[] mArr = this.f18507d;
            M m9 = mArr[i12];
            M m10 = mArr[w7];
            long j11 = this.f18491h;
            if (j9 != -9223372036854775807L) {
                if (x5 != -9223372036854775807L) {
                    j10 = j9 - x5;
                } else {
                    j10 = j9;
                }
                j11 = Math.min(((float) j10) * this.f18496n, j11);
            }
            int i13 = m10.f19432h;
            int i14 = m9.f19432h;
            if ((i13 > i14 && j4 < j11) || (i13 < i14 && j4 >= this.f18492i)) {
                w7 = i12;
            }
        }
        if (w7 != i12) {
            i11 = 3;
        }
        this.f18501s = i11;
        this.f18500r = w7;
    }

    @Override // i4.c, i4.q
    public final void d() {
        this.f18502t = -9223372036854775807L;
        this.f18503u = null;
    }

    @Override // i4.c, i4.q
    public final int f(long j, List list) {
        P3.k kVar;
        int i9;
        int i10;
        this.f18498p.getClass();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j4 = this.f18502t;
        if (j4 != -9223372036854775807L && elapsedRealtime - j4 < 1000 && (list.isEmpty() || ((P3.k) AbstractC0349q.i(list)).equals(this.f18503u))) {
            return list.size();
        }
        this.f18502t = elapsedRealtime;
        if (list.isEmpty()) {
            kVar = null;
        } else {
            kVar = (P3.k) AbstractC0349q.i(list);
        }
        this.f18503u = kVar;
        if (list.isEmpty()) {
            return 0;
        }
        int size = list.size();
        long y9 = y.y(((P3.k) list.get(size - 1)).f5844g - j, this.f18499q);
        long j9 = this.j;
        if (y9 >= j9) {
            x(list);
            M m9 = this.f18507d[w(elapsedRealtime)];
            for (int i11 = 0; i11 < size; i11++) {
                P3.k kVar2 = (P3.k) list.get(i11);
                M m10 = kVar2.f5841d;
                if (y.y(kVar2.f5844g - j, this.f18499q) >= j9 && m10.f19432h < m9.f19432h && (i9 = m10.f19441r) != -1 && i9 <= this.f18494l && (i10 = m10.f19440q) != -1 && i10 <= this.f18493k && i9 < m9.f19441r) {
                    return i11;
                }
            }
        }
        return size;
    }

    @Override // i4.c, i4.q
    public final void i() {
        this.f18503u = null;
    }

    @Override // i4.q
    public final int o() {
        return this.f18501s;
    }

    @Override // i4.q
    public final int p() {
        return this.f18500r;
    }

    @Override // i4.c, i4.q
    public final void q(float f9) {
        this.f18499q = f9;
    }

    @Override // i4.q
    public final Object r() {
        return null;
    }

    public final int w(long j) {
        long j4;
        C1518s c1518s = (C1518s) this.f18490g;
        synchronized (c1518s) {
            j4 = c1518s.f20109l;
        }
        long j9 = ((float) j4) * this.f18495m;
        this.f18490g.getClass();
        long j10 = ((float) j9) / this.f18499q;
        if (!this.f18497o.isEmpty()) {
            int i9 = 1;
            while (i9 < this.f18497o.size() - 1 && ((a) this.f18497o.get(i9)).f18488a < j10) {
                i9++;
            }
            a aVar = (a) this.f18497o.get(i9 - 1);
            a aVar2 = (a) this.f18497o.get(i9);
            long j11 = aVar.f18488a;
            float f9 = ((float) (j10 - j11)) / ((float) (aVar2.f18488a - j11));
            j10 = aVar.f18489b + (f9 * ((float) (aVar2.f18489b - r1)));
        }
        int i10 = 0;
        for (int i11 = 0; i11 < this.f18505b; i11++) {
            if (j == Long.MIN_VALUE || !h(j, i11)) {
                if (this.f18507d[i11].f19432h <= j10) {
                    return i11;
                }
                i10 = i11;
            }
        }
        return i10;
    }
}
