package i4;

import N3.m0;
import P5.AbstractC0356y;
import P5.F;
import P5.P;
import P5.S;

/* loaded from: classes.dex */
public final class k extends m implements Comparable {

    /* renamed from: e, reason: collision with root package name */
    public final int f18560e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f18561f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f18562g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f18563h;

    /* renamed from: i, reason: collision with root package name */
    public final int f18564i;
    public final int j;

    /* renamed from: k, reason: collision with root package name */
    public final int f18565k;

    /* renamed from: l, reason: collision with root package name */
    public final int f18566l;

    /* renamed from: m, reason: collision with root package name */
    public final boolean f18567m;

    public k(int i9, m0 m0Var, int i10, h hVar, int i11, String str) {
        super(i9, m0Var, i10);
        boolean z9;
        boolean z10;
        S s9;
        int i12;
        boolean z11;
        boolean z12;
        boolean z13;
        int i13 = 0;
        this.f18561f = o.e(i11, false);
        int i14 = this.f18571d.f19428d & (~hVar.f18644u);
        if ((i14 & 1) != 0) {
            z9 = true;
        } else {
            z9 = false;
        }
        this.f18562g = z9;
        if ((i14 & 2) != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f18563h = z10;
        S s10 = hVar.f18642s;
        if (s10.isEmpty()) {
            s9 = F.s("");
        } else {
            s9 = s10;
        }
        int i15 = 0;
        while (true) {
            if (i15 < s9.f5928d) {
                i12 = o.c(this.f18571d, (String) s9.get(i15), hVar.f18645v);
                if (i12 > 0) {
                    break;
                } else {
                    i15++;
                }
            } else {
                i12 = 0;
                i15 = Integer.MAX_VALUE;
                break;
            }
        }
        this.f18564i = i15;
        this.j = i12;
        int i16 = this.f18571d.f19429e;
        int i17 = hVar.f18643t;
        int bitCount = (i16 == 0 || i16 != i17) ? Integer.bitCount(i16 & i17) : Integer.MAX_VALUE;
        this.f18565k = bitCount;
        if ((this.f18571d.f19429e & 1088) != 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.f18567m = z11;
        if (o.g(str) == null) {
            z12 = true;
        } else {
            z12 = false;
        }
        int c3 = o.c(this.f18571d, str, z12);
        this.f18566l = c3;
        if (i12 <= 0 && ((!s10.isEmpty() || bitCount <= 0) && !this.f18562g && (!this.f18563h || c3 <= 0))) {
            z13 = false;
        } else {
            z13 = true;
        }
        if (o.e(i11, hVar.f18554j0) && z13) {
            i13 = 1;
        }
        this.f18560e = i13;
    }

    @Override // i4.m
    public final int a() {
        return this.f18560e;
    }

    @Override // i4.m
    public final /* bridge */ /* synthetic */ boolean b(m mVar) {
        return false;
    }

    @Override // java.lang.Comparable
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final int compareTo(k kVar) {
        AbstractC0356y c3 = AbstractC0356y.f6012a.c(this.f18561f, kVar.f18561f);
        Integer valueOf = Integer.valueOf(this.f18564i);
        Integer valueOf2 = Integer.valueOf(kVar.f18564i);
        P p9 = P.f5924c;
        AbstractC0356y b9 = c3.b(valueOf, valueOf2, p9);
        int i9 = this.j;
        AbstractC0356y a5 = b9.a(i9, kVar.j);
        int i10 = this.f18565k;
        AbstractC0356y c9 = a5.a(i10, kVar.f18565k).c(this.f18562g, kVar.f18562g);
        Boolean valueOf3 = Boolean.valueOf(this.f18563h);
        Boolean valueOf4 = Boolean.valueOf(kVar.f18563h);
        if (i9 == 0) {
            p9 = P.f5923b;
        }
        AbstractC0356y a9 = c9.b(valueOf3, valueOf4, p9).a(this.f18566l, kVar.f18566l);
        if (i10 == 0) {
            a9 = a9.d(this.f18567m, kVar.f18567m);
        }
        return a9.e();
    }
}
